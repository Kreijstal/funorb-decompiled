/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static tk field_c;
    static String field_d;
    static String[] field_f;

    final void a(byte param0, boolean param1) {
        ((d) this).field_e = param1 ? true : false;
        if (param0 != -128) {
            return;
        }
        ((d) this).field_b = true;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_12_0 = 0;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            if (Character.isISOControl(param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (k.a(true, param0)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                var6 = pb.field_a;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = pn.field_nb;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param0) {
                          stackOut_19_0 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0 != 0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L1;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0 != 0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2_ref, "d.E(" + param0 + ',' + -11217 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((d) this).field_b;
    }

    final String a(int param0) {
        if (param0 > -24) {
            return null;
        }
        return ((d) this).field_a;
    }

    final boolean c(int param0) {
        if (param0 != 14668) {
            return false;
        }
        return ((d) this).field_e;
    }

    d(String param0) {
        ((d) this).field_b = false;
        ((d) this).field_e = false;
        try {
            ((d) this).field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "d.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tk();
        field_d = "Quit to website";
        field_f = new String[]{"Fly away from the asteroid intact<br>to avoid losing a life.", "Fly away from the moon intact<br>to avoid losing a life.", "Fly away from the planet intact<br>to avoid losing a life."};
    }
}
