/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static vm field_m;
    boolean field_h;
    int field_l;
    boolean field_i;
    boolean field_g;
    boolean field_a;
    int field_j;
    static int field_c;
    boolean field_b;
    int[] field_o;
    int field_e;
    boolean field_n;
    boolean field_k;
    boolean field_f;
    int field_d;

    public static void b(int param0) {
        field_m = null;
        if (param0 != 0) {
            ql.b(70);
        }
    }

    final static boolean a(ld param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 100) {
          L0: {
            field_m = null;
            if (param0.c((byte) -119, 1) != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param0.c((byte) -119, 1) != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        if (param0 >= -64) {
          var2 = null;
          boolean discarded$2 = ql.a((ld) null, (byte) 45);
          aj.field_c.field_o = 0;
          aj.field_c.field_j = 0;
          return;
        } else {
          aj.field_c.field_o = 0;
          aj.field_c.field_j = 0;
          return;
        }
    }

    final static gj a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (param0) {
          var2 = param1.length();
          var3 = 0;
          L0: while (true) {
            if (var2 > var3) {
              var4 = param1.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return vh.field_f;
            }
          }
        } else {
          field_m = null;
          var2 = param1.length();
          var3 = 0;
          L1: while (true) {
            if (var2 > var3) {
              var4 = param1.charAt(var3);
              if (var4 >= 48) {
                if (var4 <= 57) {
                  var3++;
                  continue L1;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return vh.field_f;
            }
          }
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = nm.a(param0, (byte) -128);
        var4 = j.a(param0, -121);
        var5 = nm.a(param1, (byte) 85);
        var6 = j.a(param1, -31);
        var7 = (int)((long)var5 * (long)var3 >> -258832112);
        var8 = (int)((long)var6 * (long)var3 >> -981011824);
        if (param2 < 89) {
          ql.b(-98);
          var9 = (int)((long)var5 * (long)var4 >> 1226418640);
          var10 = (int)((long)var6 * (long)var4 >> -1898957424);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var9 = (int)((long)var5 * (long)var4 >> 1226418640);
          var10 = (int)((long)var6 * (long)var4 >> -1898957424);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    ql() {
        ((ql) this).field_o = new int[6];
    }

    static {
    }
}
