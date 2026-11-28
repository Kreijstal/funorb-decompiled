/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd {
    static int field_c;
    static int field_a;
    static int[] field_d;
    static int field_b;

    final static void a(String param0, int param1, byte param2) {
        int var3_int = 0;
        s.field_c = false;
        ic.field_a = false;
        if (param2 != -77) {
          return;
        }
        try {
          if (null != StripedProgressWidget.field_G) {
            if (!StripedProgressWidget.field_G.field_G) {
              return;
            }
            var3_int = 1;
            if (8 == param1) {
              param1 = 2;
              if (!ModalDialogHost.field_x) {
                param0 = ag.field_k;
              } else {
                param0 = pk.field_b;
              }
              wi.field_c.setAccountAndClearPassword((byte) -79, StandardContentDialog.field_hb);
            }
            if (10 == param1) {
              FullscreenFocusCanvas.a(false);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (ic.field_a) {
                param0 = fb.a(oh.field_b, param2 ^ -50, new String[]{param0});
              }
              if (FullscreenStatusDialog.field_V) {
                param0 = jl.field_k;
              }
              StripedProgressWidget.field_G.showResult(param0, param1, true);
            }
            if (256 != param1) {
              if (param1 == 10) {
                return;
              }
              if (!ModalDialogHost.field_x) {
                wi.field_c.clearCredentials(false);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "pd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void resetStaticState(byte param0) {
        field_d = null;
        if (param0 != 98) {
          field_c = -122;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            var3 = (String) null;
            pd.a((String) null, 75, (byte) -104);
          }
          stackIn_3_0 = PasswordValidator.a(param0, 10, true, param1 ^ -60);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("pd.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new int[8192];
        field_c = 0;
        field_b = 0;
    }
}
