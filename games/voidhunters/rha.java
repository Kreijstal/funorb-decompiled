/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha implements ntb {
    int field_b;
    int field_e;
    int field_c;
    int field_a;
    static int field_d;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        rha var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 79 / ((param0 - 22) / 59);
          var4 = (rha) (param1);
          stackIn_7_0 = (this.field_a != var4.field_a) || (var4.field_e != this.field_e) || (this.field_b != var4.field_b) || (var4.field_c != this.field_c);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("rha.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (ob.field_j <= param1) {
          if (param1 > mt.field_o) {
            if (param0 > -18) {
              rha.a(72, 80, 26, 93, -92);
              return;
            }
            return;
          }
          param4 = ksa.a(31123, lua.field_c, hab.field_i, param4);
          param3 = ksa.a(31123, lua.field_c, hab.field_i, param3);
          sk.a(-105, param4, param1, param3, param2);
        }
        if (param0 <= -18) {
          return;
        }
        rha.a(72, 80, 26, 93, -92);
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_a, 32);
          param0.a(-632, this.field_e, 8);
          param0.a(-632, 1 + this.field_b, 8);
          param0.a(-632, 1 + this.field_c, 8);
          if (param1 >= -109) {
            tv var4 = (tv) null;
            this.a((byte) -115, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rha.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static float a(float param0, float param1, int param2, float param3, byte param4) {
        float[] var6 = null;
        if (param4 > 53) {
          var6 = cn.field_a[param2];
          float[] var5 = var6;
          return param3 * var6[1] + var6[0] * param1 + param0 * var6[2];
        }
        return 0.2956068813800812f;
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        rha var5 = null;
        try {
          if (param1 > -19) {
            this.field_e = 92;
          }
          var5 = (rha) (param0);
          var4 = 0;
          if (var5.field_a != this.field_a) {
            var4 = 1;
            System.out.println("int tick has changed. before=" + var5.field_a + ", now=" + this.field_a);
          }
          if (this.field_e != var5.field_e) {
            var4 = 1;
            System.out.println("int string_id has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (var5.field_b != this.field_b) {
            var4 = 1;
            System.out.println("int a_id has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (this.field_c != var5.field_c) {
            var4 = 1;
            System.out.println("int b_id has changed. before=" + var5.field_c + ", now=" + this.field_c);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of Message has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("rha.F(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        rha var4 = (rha) (param1);
        rha var3 = var4;
        var4.field_a = this.field_a;
        var4.field_e = this.field_e;
        if (param0 <= 54) {
          return;
        }
        try {
          var4.field_b = this.field_b;
          var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        this.field_a = param0.i(0, 32);
        this.field_e = param0.i(0, 8);
        if (param1) {
          return;
        }
        try {
          this.field_b = param0.i(0, 8) - 1;
          this.field_c = -1 + param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rha() {
    }

    rha(int param0, int param1, int param2) {
        this.field_e = param0;
        this.field_c = param2;
        this.field_b = param1;
    }

    static {
    }
}
