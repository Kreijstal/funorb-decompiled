/*
 * Decompiled by CFR-JS 0.4.0.
 */
class im extends ms {
    private static int[] field_u;
    static sn[] field_v;
    static je field_x;
    static wk field_y;
    static boolean field_w;

    final static int a(om param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 19) {
                break L1;
              } else {
                im.b(49, 30);
                break L1;
              }
            }
            var2_int = param0.field_G.field_r;
            var3 = param0.field_v;
            stackIn_3_0 = mh.a(var2_int, -125, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("im.BA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(int param0, int param1) {
        ol.field_B = (param0 & 51) >> -194167164;
        if (param1 != -27498) {
            field_x = (je) null;
        }
        va.field_D = (param0 & 13) >> 381048994;
        if (2 < ol.field_B) {
            ol.field_B = 2;
        }
        if ((va.field_D ^ -1) < -3) {
            va.field_D = 2;
        }
        cd.field_c = param0 & 3;
        if (!(cd.field_c <= 2)) {
            cd.field_c = 2;
        }
    }

    public static void g(int param0) {
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != 31343) {
            return;
        }
        field_y = null;
    }

    im() {
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param2;
            L1: while (true) {
              if (var5 >= param0) {
                var4_int = var4_int ^ -1;
                if (param3 == -8779) {
                  stackIn_8_0 = var4_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = -54;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var4_int = var4_int >>> -1115217432 ^ field_u[(param1[var5] ^ var4_int) & 255];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("im.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static String a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2 = param1;
            var3 = dj.a(14, ':', var2.substring(var2.indexOf('=') + 1));
            if (param0 > 88) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  stackIn_11_0 = "done.";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (-1 == (var4 % 2 ^ -1)) {
                      ah.field_a.a(119, Integer.parseInt(var3[var4]), var4 / 2);
                      break L2;
                    } else {
                      ah.field_a.a(var4 / 2, Integer.parseInt(var3[var4]), (byte) -128);
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          try {
            L3: {
              var2_ref = decompiledCaughtException;
              var2_ref.printStackTrace();
              stackIn_13_0 = "Error. See console for details.";
              break L3;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L4: {
              var2_ref = decompiledCaughtException;
              stackIn_16_0 = (RuntimeException) (var2_ref);

              stackIn_16_1 = new StringBuilder().append("im.AA(").append(param0).append(',');

              if (param1 == null) {
                stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                stackIn_17_2 = "null";
                break L4;
              } else {
                stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                stackIn_17_2 = "{...}";
                break L4;
              }
            }
            throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
          }
          return stackIn_13_0;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    static {
        $cfr$clinit: {
            int var0;
            int var1;
            int var2;
            field_u = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_v = new sn[19];
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_u[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 == (1 & var0)) {
                      var0 = -306674912 ^ var0 >>> -2097194463;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
