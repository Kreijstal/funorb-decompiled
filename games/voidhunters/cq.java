/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends ksa implements ntb {
    int field_f;
    int field_d;
    int field_g;
    int field_e;

    public final void b(byte param0, tv param1) {
        cq var5 = null;
        cq var6 = null;
        try {
          if (param0 < 54) {
            this.field_g = 98;
          }
          var5 = (cq) (param1);
          var6 = var5;
          var6.field_g = this.field_g;
          var6.field_e = this.field_e;
          var6.field_f = this.field_f;
          var6.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != -98) {
          return true;
        }
        if (this.field_f > param1) {
          return false;
        }
        if (param0 < this.field_g) {
          return false;
        }
        if (param1 >= this.field_f + this.field_e) {
          return false;
        }
        if (param0 < this.field_g + this.field_d) {
          return true;
        }
        return false;
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_f = param0.i(0, 32);
          this.field_g = param0.i(0, 32);
          this.field_e = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
          if (param1) {
            this.a(64, 118, (byte) 59);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        cq var5 = null;
        try {
          var5 = (cq) (param0);
          var4 = 0;
          if (this.field_f != var5.field_f) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_f + ", now=" + this.field_f);
          }
          if (var5.field_g != this.field_g) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_g + ", now=" + this.field_g);
          }
          if (var5.field_e != this.field_e) {
            var4 = 1;
            System.out.println("int width has changed. before=" + var5.field_e + ", now=" + this.field_e);
          }
          if (var5.field_d != this.field_d) {
            System.out.println("int height has changed. before=" + var5.field_d + ", now=" + this.field_d);
            var4 = 1;
          }
          if (param1 >= -19) {
            return;
          }
          if (var4 != 0) {
            System.out.println("This instance of MapZone has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("cq.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.field_f, 32);
          param0.a(-632, this.field_g, 32);
          param0.a(-632, this.field_e, 32);
          if (param1 > -109) {
            lta var4 = (lta) null;
            this.a(-77, 104, (lta) null);
          }
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        cq var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (cq) (param1);
          var4 = 86 % ((param0 - 22) / 59);
          stackIn_7_0 = (this.field_f != var3.field_f) || (this.field_g != var3.field_g) || (var3.field_e != this.field_e) || (var3.field_d != this.field_d);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, lta param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var4_int = param2.a(this.field_f, (byte) 126);
          var5 = param2.b(true, this.field_g);
          if (param0 != 32) {
            faa var8 = (faa) null;
            this.b((faa) null, 76);
          }
          var6 = param2.a(this.field_e + this.field_f, (byte) 125);
          var7 = param2.b(true, this.field_d + this.field_g);
          ga.a(64, false, var4_int, var5, -var5 + var7, -var4_int + var6, param1);
          uv.a(112, var4_int, -var5 + var7, var5, param1, -var4_int + var6);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "cq.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    cq() {
    }

    cq(int param0, int param1) {
        this.field_d = 65536;
        this.field_f = param0;
        this.field_g = param1;
        this.field_e = 65536;
    }

    static {
    }
}
