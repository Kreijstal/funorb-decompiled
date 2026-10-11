/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bhb extends ksa implements tv {
    byte[] field_d;
    static String field_e;
    static int field_f;
    static int field_g;
    static int field_i;
    private tja field_h;

    final tja d(int param0) {
        if (null != this.field_h) {
          return this.field_h;
        }
        faa var2 = new faa(this.field_d.length - 4);
        var2.a(4, this.field_d, -1, -4 + this.field_d.length);
        var2.field_e = param0;
        tja var3 = (tja) (gva.field_a.a((byte) -128));
        var2.p(-23497);
        if (!(var3 instanceof utb)) {
          var3.a(var2, false);
          var2.f((byte) -116);
          this.field_h = var3;
          return var3;
        }
        ((utb) ((Object) var3)).a(var2, 32);
        var2.f((byte) -116);
        this.field_h = var3;
        return var3;
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            faa var4 = (faa) null;
            this.b((faa) null, -44);
          }
          param0.r(32712);
          param0.d(this.field_d.length, 332614536);
          param0.a(0, this.field_d, -1, this.field_d.length);
          param0.q(-81);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bhb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bhb(int param0, faa param1) {
        this(param0, param1.field_h, param1.field_e);
    }

    public static void a(int param0) {
        if (param0 != 32) {
          return;
        }
        field_e = null;
    }

    final int c(int param0) {
        int var2 = 23 / ((param0 - 26) / 60);
        return ((this.field_d[2] & 255) << 8) + (((this.field_d[1] & 255) << 16) + (this.field_d[0] << 24 & -16777216)) + (this.field_d[3] & 255);
    }

    final void a(tv param0, boolean param1) {
        try {
          if (!param1) {
            field_g = -106;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bhb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        bhb var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (bhb) (param1);
          if (null == this.field_d) {
            var3.field_d = null;
          } else {
            if (null == var3.field_d ||
              this.field_d.length != var3.field_d.length) {
              var3.field_d = new byte[this.field_d.length];
            }
            cua.a(this.field_d, 0, var3.field_d, 0, this.field_d.length);
          }
          if (param0 > 54) {
            return;
          }
          this.field_h = (tja) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("bhb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 10 / ((param0 - 22) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bhb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    bhb() {
    }

    public final void a(faa param0, boolean param1) {
        int var3_int = 0;
        try {
          param0.f((byte) -100);
          if (param1) {
            field_e = (String) null;
          }
          var3_int = param0.h(49);
          this.field_d = new byte[var3_int];
          param0.a(0, this.field_d, (byte) -59, var3_int);
          param0.p(-23497);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bhb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private bhb(int param0, byte[] param1, int param2) {
        try {
          this.field_d = new byte[param2 + 4];
          this.field_d[2] = (byte)(param0 >> 8);
          this.field_d[3] = (byte)param0;
          this.field_d[1] = (byte)(param0 >> 16);
          this.field_d[0] = (byte)(param0 >> 24);
          cua.a(param1, 0, this.field_d, 4, param2);
          this.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bhb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Hold the left mouse button to shoot";
        field_i = 131072;
        field_g = 32;
    }
}
