<template>
  <div id="login-page">
    <h1>Login Page</h1>
    <div class="input-area">
      <div>ユーザ名</div>
      <input type="text" v-model="loginId" />
    </div>
  </div>
</template>

<script lang="ts">
import Vue from 'vue';
import Component from 'vue-class-component';

@Component({
  name: 'login',
  data() {
    return {
      userName: '',
      password: '',
    };
  },
})
export default class Login extends Vue {
  private userName: string;
  private password: string;

  private login(): void {
    const req = {
      userName: this.userName,
      password: this.password,
    };
  }
}
</script>
