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
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = 18 % ((param2 - 27) / 43);
          var4_int = param1.a(param0, false);
          var6 = param1.a((byte) 6, var4_int, param3);
          stackIn_1_0 = jha.a(param1, (byte) 4, var4_int, var6);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("hca.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 == 19) {
          hp.a(this.field_c.field_sb, this.field_c.field_kb, (byte) 102, this.field_c.field_p, uq.field_zb, this.field_c.field_rb);
          g.field_g.a(this.field_a, this.field_d, this.field_b, 300, 200, 16777215, -1, 0, 0, 14);
          return;
        }
    }

    final void a(int param0) {
        this.field_c.a(19842, true);
        if (this.field_c.field_R == 1) {
          uca.a(34, (byte) -46);
        }
        int var2 = 74 % ((82 - param0) / 32);
    }

    final static ee[] b(int param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        ee[] var1 = new ee[ok.field_vb];
        for (var2 = 0; ok.field_vb > var2; var2++) {
          var1[var2] = new ee(ok.field_Bb, kh.field_r, fl.field_j[var2], fd.field_D[var2], lq.field_A[var2], eha.field_s[var2], baa.field_P[var2], hk.field_f);
        }
        if (param0 == 200) {
          al.b(-18073);
          return var1;
        }
        return (ee[]) null;
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
