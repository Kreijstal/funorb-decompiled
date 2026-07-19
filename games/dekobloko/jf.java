/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static String field_f;
    static lf field_g;
    static int field_c;
    static String field_b;
    static String field_a;
    static long field_d;
    static w field_e;

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (ca.field_vb >= 10) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    if (cd.field_g) {
                      var3_int = 1;
                      cd.field_g = false;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  bf.a(cn.b(true), var3_int != 0, 6, cf.a(-11777), fb.field_g);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (!dl.a(480)) {
                  break L4;
                } else {
                  L5: {
                    if (hc.field_d != 0) {
                      break L5;
                    } else {
                      uc.a(false, param1, 78);
                      mf.a(1, 0, 0, param0);
                      if (var4 == 0) {
                        break L1;
                      } else {
                        break L5;
                      }
                    }
                  }
                  cn.a(true, param0);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              hk.b();
              qc.a(240, 320, param2 ^ -21986);
              mf.a(1, 0, 0, param0);
              break L1;
            }
            if (param2 == -6351) {
              break L0;
            } else {
              jf.a(-78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("jf.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        int var1 = -128 % ((param0 - -47) / 61);
        field_b = null;
        field_g = null;
        field_a = null;
    }

    static {
        field_f = "Your game";
        field_a = "Invite more players, or alternatively try changing the following settings:  ";
        field_b = "<%0> might change the options - wait and see.";
        field_c = 0;
        field_g = new lf();
    }
}
