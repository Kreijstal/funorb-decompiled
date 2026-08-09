/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts {
    static hd field_a;
    static int field_d;
    static String field_b;
    static char[] field_c;

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = lw.field_b[param0];
        if (param3 != 448) {
            field_b = (String) null;
        }
        if (param1 == param2 && -4 == (param0 ^ -1)) {
            var4 = 448;
        }
        if (-1 == (param2 ^ -1)) {
            var4 = -var4 + 896;
        }
        return var4;
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (param2 >= 31) {
              var3_int = on.field_g >> 1265419425;
              var4 = on.field_f >> 1762085089;
              var5 = 0;
              L1: while (true) {
                if ((var5 ^ -1) <= -3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (-901 >= (var6 ^ -1)) {
                      var5++;
                      continue L1;
                    } else {
                      var7 = param0 + (2048 * var5 + var6);
                      var8 = 54 * we.a(var7, false) >> -1477556656;
                      var9 = ei.a(var7, (byte) -23) * -54 >> -567063696;
                      on.b(var3_int + var8, var4 + var9, var3_int - var8, -var9 + var4, param1);
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ts.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        int var1 = -93 % ((param0 - 75) / 35);
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (param2 == 16756) {
              var3_int = 0;
              var4 = hm.field_I;
              L1: while (true) {
                if (var3_int >= j.field_a.length) {
                  stackIn_14_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var5 = wj.field_x[var3_int];
                    if ((var5 ^ -1) > -1) {
                      var4 = var4 + qp.field_H;
                      break L2;
                    } else {
                      var6 = ec.a(true, j.field_a[var3_int], -23044);
                      var4 = var4 + of.field_a;
                      var7 = -(var6 >> -652432831) + qg.field_k;
                      if (!ec.a(-vg.field_zb + var7, param0, param1, (byte) -124, var4, var6 + (vg.field_zb << -1516212351), (pb.field_H << -1655599199) + tk.field_zb)) {
                        var4 = var4 + (tk.field_zb + (pb.field_H << -831612831) - -of.field_a);
                        break L2;
                      } else {
                        stackIn_9_0 = var5;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 50;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ts.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
        field_c = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
