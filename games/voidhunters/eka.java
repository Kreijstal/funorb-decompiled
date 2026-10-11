/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eka implements ntb {
    static String field_a;
    static boolean field_b;

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 45 / ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("eka.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            eka.b(78);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    int a(byte param0) {
        if (param0 > -100) {
          return 10;
        }
        return 0;
    }

    int a(int param0, sg param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 73) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          stackIn_2_0 = 85;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public void a(tv param0, int param1) {
        try {
          if (param1 > -19) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void b(byte param0, tv param1) {
        try {
          if (param0 <= 54) {
            pe var4 = (pe) null;
            this.a((anb) null, (int[]) null, 60, -22, 108, 110, 29, (pe) null, 19, -10, 19);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          this.a((byte) 90);
          return false;
        }
        return false;
    }

    int b(byte param0) {
        if (param0 <= 98) {
          field_a = (String) null;
          return 0;
        }
        return 0;
    }

    public void a(faa param0, boolean param1) {
        try {
          if (param1) {
            pe var4 = (pe) null;
            this.a(true, -75, (anb) null, (int[]) null, (pe) null, 110, -14, 79);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(boolean param0, int param1, anb param2, int[] param3, pe param4, int param5, int param6, int param7) {
        try {
          if (param6 < 74) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    void a(anb param0, int[] param1, int param2, int param3, int param4, int param5, int param6, pe param7, int param8, int param9, int param10) {
        try {
          if (param2 != -9151) {
            field_b = true;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "eka.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 0) {
          eka.b(-83);
        }
    }

    static {
        field_b = false;
        field_a = "The following settings need to be changed:  ";
    }
}
