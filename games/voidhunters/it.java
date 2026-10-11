/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it extends ara implements ntb {
    int field_k;
    static String field_m;
    static int field_j;
    int field_l;
    int field_i;

    public final boolean a(byte param0, tv param1) {
        it var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = 10 / ((22 - param0) / 59);
          var3 = (it) (param1);
          stackIn_7_0 = (super.a((byte) -47, param1)) || (var3.field_k != this.field_k) || (this.field_l != var3.field_l) || (this.field_i != var3.field_i);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("it.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(lta param0, byte param1) {
        try {
          if (param1 >= -91) {
            tv var4 = (tv) null;
            this.b((byte) -77, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "it.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        it var5 = null;
        try {
          super.a(param0, -71);
          var5 = (it) (param0);
          var4 = 0;
          if (var5.field_k != this.field_k) {
            System.out.println("int owner has changed. before=" + var5.field_k + ", now=" + this.field_k);
            var4 = 1;
          }
          if (param1 >= -19) {
            this.field_i = 98;
          }
          if (var5.field_l != this.field_l) {
            System.out.println("int team has changed. before=" + var5.field_l + ", now=" + this.field_l);
            var4 = 1;
          }
          if (var5.field_i != this.field_i) {
            var4 = 1;
            System.out.println("int hyperdrive_timer has changed. before=" + var5.field_i + ", now=" + this.field_i);
          }
          if (var4 != 0) {
            System.out.println("This instance of EscapePod has changed, where owner=" + this.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("it.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -111);
          if (param1 >= -109) {
            field_j = -125;
          }
          param0.a(-632, this.field_k, 32);
          param0.a(-632, this.field_l, 32);
          param0.a(-632, this.field_i, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "it.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean[] param0, boolean[] param1, int param2) {
        boolean stackIn_9_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_1 = 0;
        boolean stackIn_30_0 = false;
        int stackIn_31_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        try {
          if (param2 != 32) {
            return false;
          }
          if (param1 == null) {
            stackIn_9_0 = (param0 != null);
            return stackIn_9_0;
          }
          if (param0 == null) {
            return true;
          }
          if (param1.length != param0.length) {
            return true;
          }
          var3_int = 0;
          var4 = -3 + param1.length;
          while (var3_int < var4) {
            stackIn_22_0 = (param1[var3_int]) ? 0 : 1;
            if (param0[var3_int]) {
              stackIn_25_1 = 0;
            } else {
              stackIn_25_1 = 1;
            }
            if (stackIn_22_0 != stackIn_25_1) {
              return true;
            }
            var3_int++;
            stackIn_30_0 = param1[var3_int];
            if (param0[var3_int]) {
              stackIn_31_1 = 0;
            } else {
              stackIn_31_1 = 1;
            }
            if ((stackIn_30_0 ? 1 : 0) == stackIn_31_1) {
              return true;
            }
            var3_int++;
            if (param0[var3_int] != param1[var3_int]) {
              return true;
            }
            var3_int++;
            stackIn_42_0 = (param1[var3_int]) ? 0 : 1;
            if (param0[var3_int]) {
              stackIn_45_1 = 0;
            } else {
              stackIn_45_1 = 1;
            }
            if (stackIn_42_0 != stackIn_45_1) {
              return true;
            }
            var3_int++;
          }
          var4 += 3;
          while (true) {
            if (var3_int >= var4) {
              return false;
            }
            stackIn_55_0 = (param0[var3_int]) ? 0 : 1;
            if (param1[var3_int]) {
              stackIn_58_1 = 0;
            } else {
              stackIn_58_1 = 1;
            }
            if (stackIn_55_0 == stackIn_58_1) {
              var3_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("it.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(')').toString());
        }
    }

    it() {
        this.field_i = 3 * oq.field_l;
    }

    public static void c(int param0) {
        field_m = null;
        if (param0 != 3) {
          field_j = -19;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_k = param0.i(0, 32);
          this.field_l = param0.i(0, 32);
          this.field_i = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "it.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        it var5 = null;
        it var6 = null;
        super.b((byte) 110, param1);
        if (param0 < 54) {
          return;
        }
        try {
          var5 = (it) (param1);
          var6 = var5;
          var6.field_l = this.field_l;
          var6.field_i = this.field_i;
          var6.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "it.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(byte param0) {
        if (this.field_i > 0) {
          this.field_i = this.field_i - 1;
        }
        if (param0 != -7) {
          faa var3 = (faa) null;
          this.a((faa) null, false);
        }
    }

    static {
        field_m = "Please check if address is correct";
    }
}
