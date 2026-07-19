/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static int field_a;

    final static void a(boolean param0, boolean param1, int param2, int param3, se param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        se var8 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              bk.field_e[0] = fd.field_d.nextInt();
              if (param2 == -12793) {
                break L1;
              } else {
                var8 = (se) null;
                fb.a(true, true, -109, -21, (se) null);
                break L1;
              }
            }
            L2: {
              bk.field_e[1] = fd.field_d.nextInt();
              bk.field_e[2] = (int)(oc.field_g >> -1752622496);
              sd.field_e.field_p = 0;
              bk.field_e[3] = (int)oc.field_g;
              sd.field_e.e(48, bk.field_e[0]);
              sd.field_e.e(48, bk.field_e[1]);
              sd.field_e.e(48, bk.field_e[2]);
              sd.field_e.e(48, bk.field_e[3]);
              av.a(sd.field_e, true);
              sd.field_e.b(param2 + 12917, param3);
              param4.a(sd.field_e, (byte) -113);
              as.field_v.field_p = 0;
              if (param0) {
                as.field_v.b((byte) 89, 18);
                break L2;
              } else {
                as.field_v.b((byte) 96, 16);
                if (!Sumoblitz.field_L) {
                  break L2;
                } else {
                  as.field_v.b((byte) 89, 18);
                  break L2;
                }
              }
            }
            L3: {
              as.field_v.field_p = as.field_v.field_p + 2;
              var5_int = as.field_v.field_p;
              as.field_v.e(48, rh.field_p);
              as.field_v.a(false, jm.field_b);
              var6 = 0;
              if (!qn.field_a) {
                break L3;
              } else {
                var6 = var6 | 1;
                break L3;
              }
            }
            L4: {
              if (!gn.field_d) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                var6 = var6 | 8;
                break L5;
              }
            }
            L6: {
              if (rp.field_b == null) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              as.field_v.b((byte) 108, var6);
              var7 = dv.a(-22, ra.c(2));
              if (var7 == null) {
                var7 = "";
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              as.field_v.a(var7, (byte) -106);
              if (rp.field_b != null) {
                as.field_v.b(rp.field_b, (byte) 19);
                break L8;
              } else {
                break L8;
              }
            }
            ks.a(gh.field_a, oh.field_c, false, as.field_v, sd.field_e);
            as.field_v.a(param2 + 12793, as.field_v.field_p + -var5_int);
            gt.a(param2 + 12793, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var5);
            stackOut_23_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    static {
    }
}
