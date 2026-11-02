/*
 * Decompiled by CFR-JS 0.4.0.
 */
class KeyedLoginCredentials extends LoginCredentials {
    private long loginKey;
    static RgbSprite[] field_h;
    static String field_d;
    private String secret;
    static int[] field_g;
    static String field_e;

    final void writeCredentials(PacketBuffer packet, int obfuscationGuard) {
        try {
          packet.writeLong(this.loginKey, 38359632);
          packet.writeBase38Name(-28, this.secret);
          if (obfuscationGuard != -11436) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.writeCredentials((PacketBuffer) null, 16);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.C(" + (packet != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_h = null;
        if (obfuscationGuard == -3) {
          field_e = null;
          field_g = null;
          field_d = null;
          return;
        }
        KeyedLoginCredentials.releaseStatics((byte) 69);
        field_e = null;
        field_g = null;
        field_d = null;
    }

    final static void a(String param0, int param1, int param2) {
        int var3_int = 0;
        try {
          if (param1 != 10) {
            String var4 = (String) null;
            KeyedLoginCredentials.a((String) null, -77, -29);
          }
          DeployAction.field_A = false;
          ManaStarParticle.field_n = false;
          if (GameClock.loginProgressDialog != null &&
            GameClock.loginProgressDialog.open) {
            if (8 != param2) {
            } else {
              if (!GrowableIntArray.field_i) {
                param0 = PowerOfTwoSupport.field_x;
              } else {
                param0 = ConsoleTextNode.field_o;
              }
              param2 = 2;
              ContextActionMenu.loginForm.setAccountAndClearPassword(-17376, IsaacRandom.loginAccountIdentifier);
            }
            var3_int = 1;
            if (param2 == 10) {
              ek.a((byte) -99);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (DeployAction.field_A) {
                param0 = EmailCheckResult.a(4800, field_d, new String[]{param0});
              }
              if (IgnoreRequestSupport.field_f) {
                param0 = SummonAction.field_D;
              }
              GameClock.loginProgressDialog.showResult(param2, (byte) 98, param0);
            }
            if (param2 != 256 &&
              10 != param2 &&
              !GrowableIntArray.field_i) {
              ContextActionMenu.loginForm.clearCredentials((byte) -111);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    LoginKind getLoginKind(byte obfuscationGuard) {
        int var2 = -93 / ((obfuscationGuard + 63) / 45);
        return WidgetTheme.field_u;
    }

    KeyedLoginCredentials(long param0, String param1) {
        try {
          this.secret = param1;
          this.loginKey = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[]{0, 130, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, -30, 120, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 50, 0, 0, 0, 0, 0, 0, 0, 30, 0, 0, 30, -30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_d = "Connection lost. <%0>";
        field_e = "Purchase";
    }
}
