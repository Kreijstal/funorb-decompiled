/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc {
    static int field_b;
    static int field_a;

    final static int a(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!es.a(true)) {
                if (param0) {
                  L2: {
                    lp.field_h.a(fk.a(jm.field_m, (byte) -113, lba.field_p), 35, fk.a(jba.field_j, (byte) -113, sta.field_B));
                    if (!lp.field_h.a(false)) {
                      break L2;
                    } else {
                      var1_int = 1;
                      break L2;
                    }
                  }
                  L3: {
                    var2 = 0;
                    if (var1_int == 0) {
                      break L3;
                    } else {
                      if ((lp.field_h.field_h ^ -1) <= -1) {
                        var2 = rga.field_b[lp.field_h.field_h];
                        if (-3 == (var2 ^ -1)) {
                          qfa.a(-103);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackIn_18_0 = var2;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_8_0 = -17;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                lp.field_h.c(18);
                if (lp.field_h.a(false)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "kc.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_18_0;
        }
    }

    final static String a(String param0, int param1, boolean param2, String param3) {
        RuntimeException var4 = null;
        kh var5 = null;
        int var6 = 0;
        mu var7 = null;
        CharSequence var8 = null;
        int stackIn_3_0 = 0;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var8 = (CharSequence) ((Object) param0);
            if (!fs.a(stackIn_3_0 != 0, var8)) {
              stackIn_6_0 = pk.field_v;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ae.field_g ^ -1) == -3) {
                var7 = uh.a(param3, 115);
                if (var7 != null) {
                  var7.p(105);
                  var7.c(-7975);
                  tba.field_k = tba.field_k - 1;
                  var5 = ql.field_k;
                  var5.k(param1, -2988);
                  var5.field_h = var5.field_h + 1;
                  var6 = var5.field_h;
                  var5.i(3, 0);
                  var5.a(param0, param2);
                  var5.d(-var6 + var5.field_h, (byte) 117);
                  stackIn_14_0 = null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_12_0 = gl.a((byte) 119, uqa.field_A, new String[]{param3});
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_9_0 = rt.field_n;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("kc.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return (String) ((Object) stackIn_14_0);
            }
          }
        }
    }

    static {
    }
}
