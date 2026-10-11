/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class as extends nt {
    private int field_z;
    private int field_s;
    static String field_x;
    private int field_t;
    static int[] field_y;
    static pl field_v;
    private int field_u;
    static ns field_w;

    final static void f(int param0) {
        ct var1 = null;
        byte[] var3 = null;
        ks var1_ref = null;
        byte[] var4 = null;
        if (null == pd.field_n) {
          var1 = new ct();
          var3 = var1.a(128, 128, false, 16);
          pd.field_n = aj.a((byte) -125, var3, false);
        }
        if (mk.field_d == null) {
          var1_ref = new ks();
          var4 = var1_ref.b(1, 128, 128, 16);
          mk.field_d = aj.a((byte) -120, var4, false);
        }
        if (param0 != 23369) {
          field_x = (String) null;
        }
    }

    public static void e(int param0) {
        field_x = null;
        field_y = null;
        field_w = null;
        field_v = null;
        int var1 = -34 % ((param0 + 2) / 42);
    }

    final void a(ha param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -121) {
            this.a(-59);
          }
          if (0 != this.field_t) {
            im.field_a.a((float)(this.field_k >> 8), (float)(this.field_o >> 8), 4096, 0, 0, (this.field_p * (128 / this.field_s) << 24) + this.field_q, 1);
          } else {
            uc.field_a.a((float)(this.field_k >> 8), (float)(this.field_o >> 8), 1024, 0, 0, (this.field_p * (128 / this.field_s) << 24) + this.field_q, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("as.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    as(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        this.field_z = param5;
        this.field_t = param6;
        this.field_s = param0;
        this.field_u = param4;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ce.field_o != null) {
            ce.field_o.field_B.a(param1, false);
          }
          if (ro.field_a != null) {
            ro.field_a.field_E.a(param1, false);
          }
          if (param0 != 256) {
            field_y = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("as.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_s > this.field_p) {
          this.field_k = this.field_k + this.field_u;
          this.field_o = this.field_o + this.field_z;
          this.field_u = this.field_u * 251 / 285;
          this.field_z = this.field_z * 251 / 285;
          if (this.field_u < 0) {
            this.field_u = this.field_u - 1;
          } else {
            this.field_u = this.field_u + 1;
          }
          if (this.field_z < 0) {
            this.field_z = this.field_z - 1;
          } else {
            this.field_z = this.field_z + 1;
          }
        }
        if (param0 != -2567) {
          as.e(-88);
        }
        return super.a(param0 + 0);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_x = "lives: ";
        field_y = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((1 & var0) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_y[var1] = var0;
        }
    }
}
