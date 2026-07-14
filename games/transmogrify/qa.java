/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends h {
    private int field_o;
    static int field_u;
    private ti[] field_q;
    private int field_t;
    static int field_r;
    private int field_s;
    static int field_p;

    final static ti[] a(int param0, int param1) {
        ti[] var2 = null;
        ti[] var3 = null;
        var3 = new ti[9];
        var2 = var3;
        if (param0 <= 59) {
          qa.b(126);
          var3[4] = cd.a(param1, 64, (byte) -51);
          return var2;
        } else {
          var3[4] = cd.a(param1, 64, (byte) -51);
          return var2;
        }
    }

    final static void b(int param0) {
        ba.a(114, param0);
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        var1 = mh.field_b[0];
        if (param0 != 1702) {
          field_u = 119;
          var2 = 1;
          L0: while (true) {
            if (mh.field_b.length <= var2) {
              return;
            } else {
              var3 = mh.field_b[var2];
              ji.a(i.field_b, var2 << -821295740, i.field_b, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 1;
          L1: while (true) {
            if (mh.field_b.length <= var2) {
              return;
            } else {
              var3 = mh.field_b[var2];
              ji.a(i.field_b, var2 << -821295740, i.field_b, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L1;
            }
          }
        }
    }

    private qa(int param0, int param1, int param2) {
        ((qa) this).field_t = param1;
        ((qa) this).field_i = rh.field_q;
        ((qa) this).field_q = mc.field_b;
        ((qa) this).field_s = param0;
        ((qa) this).field_o = param2;
    }

    public qa() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var6 = -26 % ((51 - param3) / 47);
          if (!param4.field_g) {
            if (param4.b((byte) 45)) {
              L1: {
                var7 = 1;
                if (!(param4 instanceof lj)) {
                  break L1;
                } else {
                  param2 = param2 & ((lj) (Object) param4).field_t;
                  break L1;
                }
              }
              L2: {
                if (!param2) {
                  stackOut_10_0 = ((qa) this).field_o;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  if (var7 != 0) {
                    stackOut_9_0 = ((qa) this).field_t;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  } else {
                    stackOut_8_0 = ((qa) this).field_s;
                    stackIn_11_0 = stackOut_8_0;
                    break L2;
                  }
                }
              }
              L3: {
                var8 = stackIn_11_0;
                te.a(((qa) this).field_q, var8, (param4.field_h + -((qa) this).field_q[0].field_s >> 506172609) + (param1 - -param4.field_n), param4.field_l, (byte) 15, param4.field_p + param0);
                if (!param2) {
                  stackOut_13_0 = 7105644;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  stackOut_12_0 = 16777215;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
              var9 = stackIn_14_0;
              int discarded$2 = ((qa) this).field_i.a(param4.field_k, param0 - -param4.field_p, param4.field_n + (param1 - 2), param4.field_l, param4.field_h, var9, -1, 1, 1, ((qa) this).field_i.field_y);
              return;
            } else {
              stackOut_3_0 = 0;
              stackIn_16_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_16_0 = stackOut_1_0;
            break L0;
          }
        }
        L4: {
          var7 = stackIn_16_0;
          if (!(param4 instanceof lj)) {
            break L4;
          } else {
            param2 = param2 & ((lj) (Object) param4).field_t;
            break L4;
          }
        }
        L5: {
          if (!param2) {
            stackOut_22_0 = ((qa) this).field_o;
            stackIn_23_0 = stackOut_22_0;
            break L5;
          } else {
            if (var7 != 0) {
              stackOut_21_0 = ((qa) this).field_t;
              stackIn_23_0 = stackOut_21_0;
              break L5;
            } else {
              stackOut_20_0 = ((qa) this).field_s;
              stackIn_23_0 = stackOut_20_0;
              break L5;
            }
          }
        }
        L6: {
          var8 = stackIn_23_0;
          te.a(((qa) this).field_q, var8, (param4.field_h + -((qa) this).field_q[0].field_s >> 506172609) + (param1 - -param4.field_n), param4.field_l, (byte) 15, param4.field_p + param0);
          if (!param2) {
            stackOut_25_0 = 7105644;
            stackIn_26_0 = stackOut_25_0;
            break L6;
          } else {
            stackOut_24_0 = 16777215;
            stackIn_26_0 = stackOut_24_0;
            break L6;
          }
        }
        var9 = stackIn_26_0;
        int discarded$3 = ((qa) this).field_i.a(param4.field_k, param0 - -param4.field_p, param4.field_n + (param1 - 2), param4.field_l, param4.field_h, var9, -1, 1, 1, ((qa) this).field_i.field_y);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 64;
    }
}
