/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    private String field_c;
    static int field_f;
    static bi field_e;
    static int field_d;
    private boolean field_a;
    static int field_b;

    final static lp a(int param0, byte param1, int param2, rh param3) {
        String dupTemp$1 = null;
        RuntimeException var4 = null;
        qk var5 = null;
        b var6 = null;
        ff var7 = null;
        ff var8 = null;
        qk var9 = null;
        kk var10 = null;
        lp var11 = null;
        lp var12 = null;
        lp stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var11 = new lp(0, 0, 132, 40);
              var12 = var11;
              if (param1 <= -22) {
                break L1;
              } else {
                var10 = (kk) null;
                e.a(-126, -120, (kk) null);
                break L1;
              }
            }
            L2: {
              param3.field_c[param2] = var11;
              var5 = new qk(132 - rs.field_Cb.c(or.field_d[param2]), 0, or.field_d[param2]);
              var12.a(var5, 8);
              var6 = new b(d.field_b[param2].field_z / 2, rs.field_Cb.field_J + 2, 132 + -(d.field_b[param2].field_z / 2), d.field_b[param2].field_w, 2, 2105376);
              var12.a(var6, 8);
              var7 = new ff(3 * d.field_b[param2].field_z / 4, rs.field_Cb.field_J - -5, ec.a(param2, param0, true));
              var12.a(var7, 8);
              var8 = new ff(0, 2 + rs.field_Cb.field_J, d.field_b[param2]);
              var12.a(var8, 8);
              if ((param0 ^ -1) != -6) {
                dupTemp$1 = re.a(ur.field_yb, 4371, new String[]{Integer.toString(param0)});
                var8.field_o = dupTemp$1;
                var7.field_o = dupTemp$1;
                var6.field_o = dupTemp$1;
                var5.field_o = dupTemp$1;
                var12.field_o = dupTemp$1;
                break L2;
              } else {
                var9 = new qk(d.field_b[param2].field_z, 1 + (rs.field_Cb.field_J + 2 + d.field_b[param2].field_w / 8), 130 - d.field_b[param2].field_z, d.field_b[param2].field_w, mf.field_v);
                var12.a(var9, 8);
                param3.field_b[param2] = var9;
                var9.field_o = mm.field_q;
                var8.field_o = mm.field_q;
                var7.field_o = mm.field_q;
                var6.field_o = mm.field_q;
                var5.field_o = mm.field_q;
                var12.field_o = mm.field_q;
                break L2;
              }
            }
            stackIn_6_0 = (lp) (var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("e.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final String a(byte param0) {
        int var2 = 96 / ((param0 - -10) / 51);
        return this.field_c;
    }

    final boolean a(int param0) {
        if (param0 != 2) {
            e.b(20);
            return this.field_a;
        }
        return this.field_a;
    }

    final static gm a(int param0, int param1, kk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        gm stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 13 / ((-40 - param1) / 39);
            stackIn_1_0 = da.a(-128, al.a(param2, 100, param0));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("e.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public static void b(int param0) {
        if (param0 != 2105376) {
            field_d = -47;
            field_e = null;
            return;
        }
        field_e = null;
    }

    e(String param0) {
        this(param0, false);
    }

    e(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((e) (this)).field_a = stackIn_4_1 != 0;
              if (this.field_c != null) {
                break L2;
              } else {
                this.field_c = "";
                break L2;
              }
            }
            if (0 == this.field_c.length()) {
              this.field_a = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("e.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
