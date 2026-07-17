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
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            rm.a((byte) -122, param1);
            qd.a(-1845, ii.field_T, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("sf.A(").append(-122).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
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
            if (var3 >= 115) {
                var2 = -var3 + 230;
            } else {
                var2 = var3;
            }
            var2 -= 32;
            var2 = var2 > 8 ? 8 : var2;
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 58) {
                break L1;
              } else {
                sf.c(95);
                break L1;
              }
            }
            L2: {
              if (!param4.field_w) {
                if (param4.d((byte) -67)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param4 instanceof fb) {
                param3 = param3 & ((fb) (Object) param4).field_H;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param3) {
                stackOut_15_0 = ((sf) this).field_w;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_14_0 = ((sf) this).field_t;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ((sf) this).field_s;
                  stackIn_16_0 = stackOut_13_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_16_0;
              ab.a(var7, param4.field_y, param1 + param4.field_u, (param4.field_C - ((sf) this).field_x[0].field_u >> 1) + param4.field_r + param2, -104, ((sf) this).field_x);
              if (param3) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 7105644;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$1 = ((sf) this).field_e.a(param4.field_v, param1 + param4.field_u, param2 - (-param4.field_r + 2), param4.field_y, param4.field_C, var8, -1, 1, 1, ((sf) this).field_e.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("sf.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
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
                  var0 = -3932672073523589310L ^ var0 >>> 1;
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
