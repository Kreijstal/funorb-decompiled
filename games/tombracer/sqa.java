/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sqa {
    static String field_a;
    vna field_b;

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -3) {
            stackIn_4_0 = ega.a(10, param0, true, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("sqa.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(byte param0);

    final void a(int param0, fm param1) {
        try {
          this.field_b.b((byte) -122, param1);
          if (param0 >= -84) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sqa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, int[] param2, String param3, long param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var6_int = -60 % ((0 - param1) / 49);
          if (param2 != null && (param0 != 2 ||
            ota.a(param4, (byte) 13, param3))) {
            stackIn_6_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_6_0 = false;
          }
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("sqa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(int param0, boolean param1);

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -127) {
          field_a = (String) null;
        }
    }

    protected sqa() {
        this.field_b = new vna();
    }

    final void c(byte param0) {
        if (param0 < 108) {
          this.c((byte) 15);
          this.field_b.d(8);
          return;
        }
        this.field_b.d(8);
    }

    static {
        field_a = "Try again";
    }
}
