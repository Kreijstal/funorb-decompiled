/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gn {
    static se field_l;
    static String field_g;
    int field_p;
    int field_m;
    int field_f;
    int field_k;
    int field_j;
    String[][] field_i;
    static int[] field_n;
    int[][] field_o;
    int field_h;
    boolean field_e;

    public static void a(byte param0) {
        field_g = null;
        field_l = null;
        field_n = null;
        if (param0 < 41) {
            field_n = (int[]) null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        ut[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        ut var10 = null;
        ut var11 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 > 33) {
                break L1;
              } else {
                field_l = (se) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var9 = iw.field_h;
                var3 = var9;
                if (-1 != (rm.field_C ^ -1)) {
                  if ((rm.field_C ^ -1) == -2) {
                    var4 = 0;
                    L4: while (true) {
                      if ((var4 ^ -1) <= -16) {
                        break L3;
                      } else {
                        var11 = var9[p.a((byte) -24, var9.length)];
                        var6 = p.a((byte) -24, 896 + -(var11.field_o >> -124023839));
                        var7 = p.a((byte) -24, 1344 - (var11.field_v >> 743273921));
                        var11.c(var6 + param1, var7 + param0);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  var4 = 0;
                  L5: while (true) {
                    if (-31 >= (var4 ^ -1)) {
                      break L3;
                    } else {
                      var10 = var9[p.a((byte) -24, var9.length)];
                      var6 = p.a((byte) -24, 896 - (var10.field_o >> 301229921));
                      var7 = p.a((byte) -24, 1344 + -(var10.field_v >> 1310203777));
                      var10.c(var6 + param1, param0 + var7);
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wd.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ki a(int param0, up[] param1, gr param2, int param3, int param4) {
        ki var5 = null;
        RuntimeException var5_ref = null;
        ki stackIn_2_0 = null;
        ki stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new ki(5, param4, param3, (byte) 0, (byte) 0);
            var5.field_s = param1;
            if (param0 == 18238) {
              var5.field_t = param2;
              stackIn_4_0 = (ki) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ki) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("wd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    wd() {
    }

    static {
        field_g = "gameplay";
    }
}
