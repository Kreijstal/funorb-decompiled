/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk implements fe {
    private int field_c;
    static java.math.BigInteger field_a;
    private ok field_e;
    static String field_b;
    static String field_f;
    private int field_g;
    static long field_d;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var11 = Confined.field_J ? 1 : 0;
            if (param3.field_w) {
              break L1;
            } else {
              if (param3.e((byte) -124)) {
                break L1;
              } else {
                stackOut_2_0 = 2188450;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 3249872;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var6 = stackIn_4_0;
          int discarded$1 = ((hk) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param3.field_B + "</u>", param1 - -param3.field_q, param4 - -param3.field_m, param3.field_F, param3.field_z, var6, -1, ((hk) this).field_g, ((hk) this).field_c, ((hk) this).field_e.field_C - -((hk) this).field_e.field_D);
          if (param3.e((byte) -125)) {
            L3: {
              var7 = ((hk) this).field_e.c(param3.field_B);
              var8 = ((hk) this).field_e.field_D + ((hk) this).field_e.field_C;
              var9 = param1 + param3.field_q;
              if (((hk) this).field_g == 2) {
                var9 = var9 + (param3.field_F - var7);
                break L3;
              } else {
                if ((((hk) this).field_g ^ -1) == -2) {
                  var9 = var9 + (-var7 + param3.field_F >> -874748127);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var10 = param3.field_m + param4;
              if (((hk) this).field_c == 2) {
                var10 = var10 + (-var8 + param3.field_z);
                break L4;
              } else {
                if (-2 != (((hk) this).field_c ^ -1)) {
                  break L4;
                } else {
                  var10 = var10 + (param3.field_z - var8 >> 269002369);
                  break L4;
                }
              }
            }
            tj.a(var8, 1, var9 + -2, var10 - -2, var7 + 4);
            break L2;
          } else {
            break L2;
          }
        }
        L5: {
          if (param0 <= -97) {
            break L5;
          } else {
            hk.a((byte) 39);
            break L5;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        if (param0 > -122) {
            Object var2 = null;
            hk.a((byte) -74, 14, (int[]) null, 85, (int[]) null);
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
            Object var2 = null;
            hk.a((byte) 1, -31, (int[]) null, 56, (int[]) null);
        }
        return wc.field_Ob;
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          if (param1 < param3) {
            L1: {
              var5 = (param3 + param1) / 2;
              var6 = param1;
              var7 = param4[var5];
              param4[var5] = param4[param3];
              param4[param3] = var7;
              var8 = param2[var5];
              param2[var5] = param2[param3];
              param2[param3] = var8;
              if (var7 != 2147483647) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            var9 = stackIn_5_0;
            var10 = param1;
            L2: while (true) {
              if (var10 >= param3) {
                param4[param3] = param4[var6];
                param4[var6] = var7;
                param2[param3] = param2[var6];
                param2[var6] = var8;
                hk.a((byte) 125, param1, param2, var6 + -1, param4);
                hk.a((byte) -71, var6 - -1, param2, param3, param4);
                break L0;
              } else {
                if (-(var10 & var9) + var7 < param4[var10]) {
                  var11 = param4[var10];
                  param4[var10] = param4[var6];
                  param4[var6] = var11;
                  var12 = param2[var10];
                  param2[var10] = param2[var6];
                  var6++;
                  param2[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          } else {
            break L0;
          }
        }
        var5 = -111 / ((param0 - 59) / 60);
    }

    public hk() {
        ((hk) this).field_e = gm.field_cb;
        ((hk) this).field_c = 1;
        ((hk) this).field_g = 1;
    }

    hk(ok param0, int param1, int param2) {
        ((hk) this).field_c = param2;
        ((hk) this).field_e = param0;
        ((hk) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_b = "Names cannot contain consecutive spaces";
        field_f = "Press Esc for options";
        field_d = 0L;
    }
}
