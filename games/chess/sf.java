/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends hl {
    private int field_t;
    private int field_w;
    private int field_s;
    private static long[] field_u;
    private km[] field_x;
    static boolean[] field_v;

    public static void c(int param0) {
        field_u = null;
        if (param0 < 99) {
            return;
        }
        field_v = null;
    }

    final static void a(int param0, String param1) {
        rm.a((byte) -122, param1);
        qd.a(-1845, ii.field_T, false);
        if (param0 >= -120) {
            field_u = null;
        }
    }

    final static void b(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        ef var6 = (ef) (Object) hd.field_l.g(-18110);
        ef var1 = var6;
        if (param0 != 16777215) {
            return;
        }
        if (var1 == null) {
        } else {
            var3 = fb.field_K;
            if ((var3 ^ -1) <= -116) {
                var2 = -var3 + 230;
            } else {
                var2 = var3;
            }
            var2 -= 32;
            var2 = -9 > (var2 ^ -1) ? 8 : var2;
            var4 = v.field_j.b(da.field_m[var6.field_k]);
            wb.a();
            var5 = 40;
            wb.a(4, var2 + -4, 8 + var4 + 56, var5, 8, 1, 128);
            wb.a(4, -4 + var2, 8 + (56 - -var4), var5, 8, 16777215);
            me.field_c[var6.field_k].c(12, var2);
            v.field_j.a(da.field_m[var6.field_k], 56, v.field_j.field_H / 2 + (var2 - -16), 16777215, 0);
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          if (param0 >= 58) {
            break L0;
          } else {
            sf.c(95);
            break L0;
          }
        }
        L1: {
          if (!param4.field_w) {
            if (param4.d((byte) -67)) {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = 0;
              stackIn_8_0 = stackOut_5_0;
              break L1;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_8_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_8_0;
          if (param4 instanceof fb) {
            param3 = param3 & ((fb) (Object) param4).field_H;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (!param3) {
            stackOut_15_0 = ((sf) this).field_w;
            stackIn_16_0 = stackOut_15_0;
            break L3;
          } else {
            if (var6 != 0) {
              stackOut_14_0 = ((sf) this).field_t;
              stackIn_16_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = ((sf) this).field_s;
              stackIn_16_0 = stackOut_13_0;
              break L3;
            }
          }
        }
        L4: {
          var7 = stackIn_16_0;
          ab.a(var7, param4.field_y, param1 + param4.field_u, (param4.field_C - ((sf) this).field_x[0].field_u >> -25142975) + param4.field_r + param2, -104, ((sf) this).field_x);
          if (param3) {
            stackOut_18_0 = 16777215;
            stackIn_19_0 = stackOut_18_0;
            break L4;
          } else {
            stackOut_17_0 = 7105644;
            stackIn_19_0 = stackOut_17_0;
            break L4;
          }
        }
        var8 = stackIn_19_0;
        int discarded$1 = ((sf) this).field_e.a(param4.field_v, param1 + param4.field_u, param2 - (-param4.field_r + 2), param4.field_y, param4.field_C, var8, -1, 1, 1, ((sf) this).field_e.field_C);
    }

    public sf() {
        this(2188450, 2591221, 9543);
    }

    private sf(int param0, int param1, int param2) {
        ((sf) this).field_x = bj.field_db;
        ((sf) this).field_t = param1;
        ((sf) this).field_e = tk.field_a;
        ((sf) this).field_w = param2;
        ((sf) this).field_s = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_u = new long[256];
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_u[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L == (1L & var0)) {
                  var0 = -3932672073523589310L ^ var0 >>> 1593128577;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
