/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eba extends pb {
    private java.lang.ref.SoftReference field_o;

    eba(Object param0, int param1) {
        super(param1);
        try {
          this.field_o = new java.lang.ref.SoftReference(param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "eba.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 14646) {
          return false;
        }
        return true;
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -19) {
            stackIn_4_0 = fsa.a(57, param2, true, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 56;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eba.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static String a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oj.field_vb.startsWith("win")) {
            stackIn_2_0 = param1 + ".dll";
            return stackIn_2_0;
          }
          if (oj.field_vb.startsWith("linux")) {
            stackIn_9_0 = "lib" + param1 + ".so";
            return stackIn_9_0;
          }
          if (oj.field_vb.startsWith("mac")) {
            stackIn_7_0 = "lib" + param1 + ".dylib";
            return stackIn_7_0;
          }
          var2_int = -116 / ((param0 + 73) / 40);
          stackIn_11_0 = null;
          return (String) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("eba.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 6912) {
            return false;
          }
          var2_int = param0.charAt(0);
          var3 = 1;
          while (true) {
            if (param0.length() <= var3) {
              return true;
            }
            if (param0.charAt(var3) == var2_int) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("eba.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(boolean param0) {
        boolean stackIn_7_0 = false;
        if (!param0) {
          return true;
        }
        if (era.field_d != null) {
          stackIn_7_0 = true;
        } else {
          if (vo.field_b) {
            return true;
          }
          stackIn_7_0 = false;
        }
        return stackIn_7_0;
    }

    final Object f(int param0) {
        if (param0 != 29243) {
          this.f(-86);
          return this.field_o.get();
        }
        return this.field_o.get();
    }

    static {
    }
}
