/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rdb extends ksa implements ntb {
    private int field_e;
    private int field_g;
    private int field_d;
    static String field_f;

    final int a(boolean param0) {
        if (!param0) {
          this.a(46);
          return this.field_e;
        }
        return this.field_e;
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 < -54) {
          var4 = param0 - this.field_e;
          var5 = param2 - this.field_d;
          var6 = ar.a(var4, (byte) 106, var5);
          return 51200 > var6 ? true : false;
        }
        return true;
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.field_e = -114;
          }
          this.field_e = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
          this.field_g = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(lta param0, boolean param1) {
        int var3_int = 0;
        try {
          var3_int = qpb.a(param1, this.field_g, 13894143);
          kq.a(param0.field_a * 51200.0f, (byte) 89, param0.b(true, this.field_d), var3_int, param0.a(this.field_e, (byte) 121));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rdb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int d(int param0) {
        int var2 = 28 % ((param0 - 55) / 49);
        return this.field_g;
    }

    final void a(int param0, pe param1) {
        try {
          if (param0 != 3128) {
            this.a(-54, (byte) 92, -6);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rdb.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            this.field_d = -98;
          }
          param0.a(-632, this.field_e, 32);
          param0.a(-632, this.field_d, 32);
          param0.a(-632, this.field_g, 1);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        rdb var6 = null;
        rdb var7 = null;
        try {
          var6 = (rdb) (param1);
          var7 = var6;
          var7.field_g = this.field_g;
          var7.field_e = this.field_e;
          if (param0 < 54) {
            tv var4 = (tv) null;
            this.a((byte) 14, (tv) null);
          }
          var7.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -111 % ((param1 + 20) / 61);
        this.field_g = param0;
    }

    final int a(int param0) {
        if (param0 < 56) {
          this.field_d = -12;
          return this.field_d;
        }
        return this.field_d;
    }

    public static void c(int param0) {
        if (param0 != 51200) {
          field_f = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        rdb var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 28 % ((22 - param0) / 59);
          var4 = (rdb) (param1);
          stackIn_6_0 = (this.field_e != var4.field_e) || (var4.field_d != this.field_d) || (var4.field_g != this.field_g);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rdb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    rdb() {
    }

    rdb(int param0, int param1, int param2) {
        this.field_g = param2;
        this.field_d = param1;
        this.field_e = param0;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        rdb var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (rdb) (param0);
          if (param1 >= -19) {
            return;
          }
          var4 = 0;
          if (this.field_e != var5.field_e) {
            System.out.println("int x has changed. before=" + var5.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          if (this.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (var5.field_g != this.field_g) {
            System.out.println("int team has changed. before=" + var5.field_g + ", now=" + this.field_g);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpawnPoint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rdb.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = "You can ask to join this game";
    }
}
