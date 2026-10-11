/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cr {
    private mi[] field_a;
    int field_c;
    static volatile int field_d;
    static String field_b;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            if (param1 >= 6144) {
              stackIn_19_0 = -ida.field_b[-param1 + 8192];
            } else {
              stackIn_19_0 = -ida.field_b[-4096 + param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 2048) {
            stackIn_15_0 = ida.field_b[param1];
          } else {
            stackIn_15_0 = ida.field_b[4096 - param1];
          }
          return stackIn_15_0;
        }
        field_b = (String) null;
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          if (param1 >= 6144) {
            stackIn_9_0 = -ida.field_b[-param1 + 8192];
          } else {
            stackIn_9_0 = -ida.field_b[-4096 + param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 2048) {
          stackIn_5_0 = ida.field_b[param1];
        } else {
          stackIn_5_0 = ida.field_b[4096 - param1];
        }
        return stackIn_5_0;
    }

    public static void b(byte param0) {
        if (param0 >= -127) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final boolean a(byte param0) {
        if (param0 >= 77) {
          return this.field_a.length <= this.field_c ? true : false;
        }
        return true;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 35) {
            field_b = (String) null;
          }
          if (ica.field_a) {
            tga.field_a.da(param2 >> 14, -param1 >> 14, -param3 >> 14, param0);
            return;
          }
          tga.field_a.HA(param2 >> 14, -param1 >> 14, -param3 >> 14, 2048, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cr.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    cr(vna param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        mi var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_c = 0;
        try {
          this.field_a = new mi[param0.a((byte) -16)];
          var2_int = 0;
          var3 = (mi) (param0.f(-80));
          while (var3 != null) {
            var3.p(67);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_a[incrementValue$2] = var3;
            var3 = (mi) (param0.e(124));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cr.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final mi c(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 < -125) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_a[fieldTemp$0];
        }
        this.field_a = (mi[]) null;
        int fieldTemp$1 = this.field_c;
        this.field_c = this.field_c + 1;
        return this.field_a[fieldTemp$1];
    }

    static {
        field_d = 0;
    }
}
