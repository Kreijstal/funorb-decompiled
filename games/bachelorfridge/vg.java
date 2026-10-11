/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends cj {
    eaa field_m;
    static sna field_k;
    static v field_n;
    static Boolean field_l;

    final void a(op param0, boolean param1) {
        int var4 = 0;
        gj var5 = null;
        bf var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          var6 = (bf) (this.field_m.b((byte) 90));
          if (param1) {
            var5 = (gj) null;
            this.a(-71, (gj) null);
          }
          while (var6 != null) {
            var6.a(param0, -26281);
            var6 = (bf) (this.field_m.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vg.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, bf param1) {
        try {
          if (param0 != -28) {
            field_l = (Boolean) null;
          }
          this.field_m.a(param1, true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vg.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    vg(lu param0) {
        super(6);
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_m = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            var3 = param0.b(16711935);
            if (var3 == 0) {
              this.field_m.a(new qja(param0), true);
              continue;
            }
            if (var3 != 1) {
              throw new IllegalStateException();
            }
            this.field_m.a(new dla(param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("vg.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_n = null;
        if (param0 <= 64) {
          field_l = (Boolean) null;
          field_l = null;
          field_k = null;
          return;
        }
        field_l = null;
        field_k = null;
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        bf var4 = null;
        wea stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (bf) null;
            this.a((byte) -84, (bf) null);
          }
          stackIn_3_0 = new wea(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(lu param0, int param1) {
        bf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = BachelorFridge.field_y;
        try {
          param0.d(this.field_m.g(param1 ^ param1), param1 ^ -9);
          var3 = (bf) (this.field_m.b((byte) 90));
          while (var3 != null) {
            if (var3 instanceof qja) {
              param0.d(0, 0);
            } else {
              if (!(var3 instanceof dla)) {
                throw new IllegalStateException();
              }
              param0.d(1, 0);
            }
            var3.a(41, param0);
            var3 = (bf) (this.field_m.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vg.O(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(kv param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          if (param2 != 22997) {
            vg.c((byte) -13);
          }
          qg.a(param0.field_v, param4, param0, param1, 0, 0, 0, 0, dg.field_e, 0, param3, param7, param6, 0, 0, param5, param8);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vg.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public vg() {
        super(7);
        this.field_m = new eaa();
    }

    static {
    }
}
