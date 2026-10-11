/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ri extends lc {
    static boolean field_z;
    static uf field_C;
    static byte[][][] field_B;
    private pf field_E;
    boolean field_D;
    private int field_A;

    private final int k(int param0) {
        if (param0 == 0) {
          return this.field_D ? this != this.field_E.a(false) ? 0 : 256 : 0;
        }
        this.d((byte) 91);
        return this.field_D ? this != this.field_E.a(false) ? 0 : 256 : 0;
    }

    ri(pf param0, int param1, int param2) {
        super(ob.field_a - param1 >> 1, -param2 + gi.field_e >> 1, param1, param2, (fc) null);
        try {
          this.field_D = false;
          this.field_E = param0;
          this.field_A = 0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static tg[] a(String param0, gk param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tg[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param0, param2);
          var5 = param1.a(var4_int, param3, 125);
          stackIn_1_0 = fl.a(-69, var4_int, param1, var5);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ri.DA(");
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
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final lk d(byte param0) {
        lk var2 = super.d(param0);
        if (var2 != null) {
          return var2;
        }
        return (lk) (this);
    }

    boolean f(byte param0) {
        if (param0 != -33) {
          this.field_E = (pf) null;
          this.field_A = this.k(0);
          if (this.field_A != 0) {
            return false;
          }
          if (!this.field_D) {
            return true;
          }
          return false;
        }
        this.field_A = this.k(0);
        if (this.field_A != 0) {
          return false;
        }
        if (!this.field_D) {
          return true;
        }
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 == this.field_A) {
          return;
        }
        if (this.field_A >= 256) {
          if (0 == param0) {
            this.b(param1 + this.field_i, -104, this.field_r + param3);
            super.a(param0, param1, 105, param3);
            return;
          }
          return;
        }
        if (ml.field_d == null) {
          ml.field_d = new tg(this.field_k, this.field_m);
          kh.a(ml.field_d, 1);
          na.a();
          this.b(0, -11, 0);
          if (param2 >= 33) {
            super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
            ve.a(-121);
            ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
            return;
          }
          this.field_D = true;
          super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
          ve.a(-121);
          ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
          return;
        }
        if (ml.field_d.field_s < this.field_k) {
          ml.field_d = new tg(this.field_k, this.field_m);
          kh.a(ml.field_d, 1);
          na.a();
          this.b(0, -11, 0);
          if (param2 >= 33) {
            super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
            ve.a(-121);
            ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
            return;
          }
          this.field_D = true;
          super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
          ve.a(-121);
          ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
          return;
        }
        if (ml.field_d.field_q < this.field_m) {
          ml.field_d = new tg(this.field_k, this.field_m);
          kh.a(ml.field_d, 1);
          na.a();
          this.b(0, -11, 0);
          if (param2 >= 33) {
            super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
            ve.a(-121);
            ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
            return;
          }
          this.field_D = true;
          super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
          ve.a(-121);
          ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
          return;
        }
        kh.a(ml.field_d, 1);
        na.a();
        this.b(0, -11, 0);
        if (param2 >= 33) {
          super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
          ve.a(-121);
          ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
          return;
        }
        this.field_D = true;
        super.a(param0, -param1 - this.field_i, 34, -param3 - this.field_r);
        ve.a(-121);
        ml.field_d.d(param3 + this.field_r, this.field_i + param1, this.field_A);
    }

    public static void a(int param0) {
        field_B = (byte[][][]) null;
        if (param0 == -11673) {
          field_C = null;
          return;
        }
        String var2 = (String) null;
        ri.a((String) null, (gk) null, true, (String) null);
        field_C = null;
    }

    final void c(int param0, int param1, int param2) {
        if (param0 == -463076575) {
          this.b(param2, 80, param1, -param1 + ob.field_a >> 1, gi.field_e - param2 >> 1);
          return;
        }
    }

    boolean e(byte param0) {
        boolean stackIn_12_0 = false;
        boolean stackIn_25_0 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != 21) {
          this.field_D = false;
          var2 = this.k(0);
          var3 = var2 - this.field_A;
          if (var3 > 0) {
            this.field_A = this.field_A + (-1 + var3 + 8) / 8;
          }
          if (0 > var3) {
            this.field_A = this.field_A + (-15 + var3) / 16;
          }
          if (this.field_A != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_25_0 = !(this.field_D);
          return stackIn_25_0;
        }
        var2Lifetime1 = this.k(0);
        var3Lifetime1 = var2Lifetime1 - this.field_A;
        if (var3Lifetime1 > 0) {
          this.field_A = this.field_A + (-1 + var3Lifetime1 + 8) / 8;
        }
        if (0 > var3Lifetime1) {
          this.field_A = this.field_A + (-15 + var3Lifetime1) / 16;
        }
        stackIn_12_0 = (this.field_A == 0) && (var2Lifetime1 == 0) && (!this.field_D);
        return stackIn_12_0;
    }

    abstract void b(int param0, int param1, int param2);

    static {
        field_C = new uf();
    }
}
