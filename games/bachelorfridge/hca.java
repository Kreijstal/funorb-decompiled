/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca {
    private int field_d;
    private String field_a;
    sna field_c;
    private int field_b;

    final static kv a(String param0, vr param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        kv stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = 18 % ((param2 - 27) / 43);
            var4_int = param1.a(param0, false);
            var6 = param1.a((byte) 6, var4_int, param3);
            stackIn_1_0 = jha.a(param1, (byte) 4, var4_int, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("hca.C(");

            if (param0 == null) {
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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        if (param0 != 19) {
          return;
        } else {
          hp.a(this.field_c.field_sb, this.field_c.field_kb, (byte) 102, this.field_c.field_p, uq.field_zb, this.field_c.field_rb);
          g.field_g.a(this.field_a, this.field_d, this.field_b, 300, 200, 16777215, -1, 0, 0, 14);
          return;
        }
    }

    final void a(int param0) {
        this.field_c.a(19842, true);
        if (!(this.field_c.field_R != 1)) {
            uca.a(34, (byte) -46);
        }
        int var2 = 74 % ((82 - param0) / 32);
    }

    final static ee[] b(int param0) {
        ee[] var1;
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        var1 = new ee[ok.field_vb];
        var2 = 0;
        L0: while (true) {
          if (ok.field_vb <= var2) {
            if (param0 != 200) {
              return (ee[]) null;
            } else {
              al.b(-18073);
              return var1;
            }
          } else {
            var1[var2] = new ee(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], baa.field_P[var2], hk.field_f);
            var2++;
            continue L0;
          }
        }
    }

    hca(int param0, int param1, String param2) {
        try {
            this.field_a = param2;
            this.field_d = param0;
            this.field_b = param1;
            this.field_c = new sna();
            this.field_c.field_kb = this.field_d - 15;
            this.field_c.field_rb = -10 + this.field_b;
            this.field_c.field_sb = 30 + g.field_g.c(this.field_a, 300);
            this.field_c.field_p = g.field_g.a(this.field_a, 300, 14) + 20;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hca.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
