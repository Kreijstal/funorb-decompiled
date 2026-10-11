/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    private vb[] field_g;
    private int field_e;
    String field_j;
    static pd field_f;
    static km field_i;
    static int field_c;
    float field_a;
    private int field_d;
    private int field_b;
    static boolean field_h;

    private final void a(vb param0, int param1, int param2) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)param2 / 100.0f + (float)(1 + this.field_d);
          if (param2 == 0) {
            this.field_j = param0.field_b;
          } else {
            this.field_j = param0.field_e + " - " + param2 + "%";
          }
          if (param1 > -19) {
            qc.a(85, (byte) -81);
          }
          this.field_a = var4_float * (float)this.field_b / (float)(1 + this.field_e);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "qc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static hh a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        hh var7 = null;
        int var8 = 0;
        hh stackIn_3_0 = null;
        hh stackIn_7_0 = null;
        hh stackIn_11_0 = null;
        hh stackIn_17_0 = null;
        hh stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = a.field_H;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = cb.field_a;
            return stackIn_7_0;
          }
          var3 = ql.a(param1, (byte) -123, '.');
          if (2 > var3.length) {
            stackIn_11_0 = a.field_H;
            return stackIn_11_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = vf.a(var6, 8286);
            if (var7 != null) {
              stackIn_17_0 = var7;
              return stackIn_17_0;
            }
          }
          if (param0 != 28320) {
            qc.a((byte) 90);
          }
          stackIn_22_0 = jm.a(true, var3[-1 + var3.length]);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("qc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        vb var2;
        int var3;
        vb var4;
        var3 = Virogrid.field_F ? 1 : 0;
        while (this.field_e > this.field_d) {
          var4 = this.field_g[this.field_d];
          var2 = var4;
          if (!var4.field_f.c(0)) {
            this.a(var4, -87, 0);
            return false;
          }
          if (var4.field_m >= 0 &&
            !var4.field_f.c((byte) 81, var4.field_m)) {
            this.a(var2, -50, var4.field_f.b((byte) 105, var4.field_m));
            return false;
          }
          if (var4.field_k != null &&
            !var4.field_f.a((byte) -102, var4.field_k)) {
            this.a(var2, -97, var4.field_f.a(var4.field_k, 126));
            return false;
          }
          if (var4.field_m < 0 &&
            null == var4.field_k &&
            null != var4.field_e &&
            !var4.field_f.b(25867)) {
            this.a(var2, -95, var4.field_f.a(-2677));
            return false;
          }
          this.field_d = this.field_d + 1;
        }
        if (!param0) {
        }
        return true;
    }

    final static mg[] a(int param0, mg param1) {
        mg[] var2 = null;
        RuntimeException var2_ref = null;
        mg[] var3 = null;
        mg[] stackIn_2_0 = null;
        mg[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new mg[9];
          var2 = var3;
          var3[4] = param1;
          if (param0 >= 16) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (mg[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("qc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        ph.field_l[me.field_b] = df.field_d;
        pb.field_i[me.field_b] = df.field_i;
        m.field_i[me.field_b] = df.field_k;
        ng.field_O[me.field_b] = df.field_g;
        qe.field_h[me.field_b] = df.field_h;
        kn.field_K[me.field_b] = df.field_e;
        se.field_e[me.field_b] = df.field_f;
        if (param0 > 96) {
          me.field_b = me.field_b + 1;
          return;
        }
    }

    final static void b(byte param0) {
        if (!ug.a(true)) {
          return;
        }
        if (param0 == -12) {
          nm.a(false, 4, (byte) 107);
          return;
        }
        qc.b((byte) -103);
        nm.a(false, 4, (byte) 107);
    }

    final static void a(int param0, byte param1) {
        if (param1 <= 81) {
          return;
        }
        hd.field_f = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        if (param0 != 9) {
          field_c = -88;
          field_i = null;
          field_f = null;
          return;
        }
        field_i = null;
        field_f = null;
    }

    private qc() throws Throwable {
        throw new Error();
    }

    static {
        field_h = true;
    }
}
