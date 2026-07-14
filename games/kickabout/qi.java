/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends sr {
    static String field_o;
    static int[] field_n;
    static int field_p;

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var4 = ((sp) param1).field_Sb;
        if (param0 == 2) {
          L0: {
            var5 = ((sp) param2).field_Sb;
            var8 = ((qi) this).field_i % 3;
            if (0 == var8) {
              var6 = var4.field_n;
              var7 = var5.field_n;
              break L0;
            } else {
              if (-2 != (var8 ^ -1)) {
                var7 = var5.field_o;
                var6 = var4.field_o;
                break L0;
              } else {
                var6 = var4.field_g;
                var7 = var5.field_g;
                break L0;
              }
            }
          }
          return -var7 + var6 ^ ((qi) this).field_i / 3 << 559945247;
        } else {
          return -108;
        }
    }

    final int a(int param0) {
        if (param0 >= -69) {
            Object var3 = null;
            int discarded$0 = ((qi) this).a(81, (Object) null, (Object) null);
        }
        return 6;
    }

    qi() {
    }

    final static int b(int param0) {
        if (param0 != 3) {
            return 118;
        }
        return 180;
    }

    final static int a(boolean param0) {
        wk.a(nj.a(-100), 0);
        if (param0) {
            qi.b((byte) -67);
        }
        return oa.field_a.get(5);
    }

    public static void b(byte param0) {
        if (param0 != 85) {
            field_p = -51;
        }
        field_n = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var13 = Kickabout.field_G;
          if (param2 == -1) {
            break L0;
          } else {
            field_n = null;
            break L0;
          }
        }
        L1: {
          if (param0 >= param1) {
            break L1;
          } else {
            L2: {
              var5 = (param0 + param1) / 2;
              var6 = param0;
              var7 = param3[var5];
              param3[var5] = param3[param1];
              param3[param1] = var7;
              var8 = param4[var5];
              param4[var5] = param4[param1];
              param4[param1] = var8;
              if (2147483647 == var7) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            var9 = stackIn_6_0;
            var10 = param0;
            L3: while (true) {
              if (var10 >= param1) {
                param3[param1] = param3[var6];
                param3[var6] = var7;
                param4[param1] = param4[var6];
                param4[var6] = var8;
                qi.a(param0, -1 + var6, param2 + 0, param3, param4);
                qi.a(var6 + 1, param1, -1, param3, param4);
                break L1;
              } else {
                if (-(var10 & var9) + var7 < param3[var10]) {
                  var11 = param3[var10];
                  param3[var10] = param3[var6];
                  param3[var6] = var11;
                  var12 = param4[var10];
                  param4[var10] = param4[var6];
                  var6++;
                  param4[var6] = var12;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    static {
    }
}
