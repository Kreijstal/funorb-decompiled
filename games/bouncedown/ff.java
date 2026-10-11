/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends wd {
    static double field_C;
    static sg field_D;

    ff(String param0, sk param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param2 != 8786) {
          ff.a(false, 44, -127, -97);
          return hf.a(false);
        }
        return hf.a(false);
    }

    final static we[] a(String param0, gk param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        we[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param3, false);
          if (param2 < 104) {
            ff.a(13);
          }
          var5 = param1.a(var4_int, param0, -34);
          stackIn_3_0 = la.a(var5, var4_int, param1, (byte) -72);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ff.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private ff(String param0, fc param1, sk param2) {
        super(param0, param1, param2);
        try {
          this.field_j = ma.field_m.field_a;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.a(param0, param1, (byte) -109, param3);
        if (param2 < -77) {
          return;
        }
        field_D = (sg) null;
    }

    private ff(String param0, sk param1) {
        this(param0, ma.field_m.field_b, param1);
        try {
          this.field_j = ma.field_m.field_a;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_D = null;
        if (param0 != -22756) {
          String var2 = (String) null;
          ff.a((String) null, (gk) null, (byte) -2, (String) null);
        }
    }

    static {
    }
}
