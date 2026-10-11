/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    private boolean field_h;
    static String[] field_e;
    private String field_f;
    static sd field_a;
    static float[] field_g;
    static float[] field_d;
    private boolean field_c;
    static String field_b;

    public static void b(int param0) {
        field_g = null;
        field_e = null;
        int var1 = 8 / ((64 - param0) / 35);
        field_b = null;
        field_d = null;
        field_a = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 44 / ((param1 - 43) / 55);
        if (14 == param0) {
          return 1;
        }
        if (param0 == 12) {
          return 1;
        }
        if (param0 == 5) {
          return 1;
        }
        if (8 == param0) {
          return 1;
        }
        if (param0 == 7) {
          return 1;
        }
        if (6 != param0) {
          return 0;
        }
        return 1;
    }

    final void a(boolean param0, int param1) {
        if (param1 < -24) {
          this.field_h = param0 ? true : false;
          this.field_c = true;
          return;
        }
        this.c(96);
        this.field_h = param0 ? true : false;
        this.field_c = true;
    }

    final boolean a(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          tk.a((String) null, false, true);
          return this.field_h;
        }
        return this.field_h;
    }

    final String c(int param0) {
        if (param0 != 0) {
          field_d = (float[]) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = 44;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = q.field_H.b(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = ZombieDawn.field_K.b(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tk.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var2 = 122 % ((-46 - param0) / 63);
        return this.field_c;
    }

    tk(String param0) {
        this.field_h = false;
        this.field_c = false;
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= ek.field_J) {
            if (param1.length() > lg.field_s) {
              return true;
            }
            if (param0 != 84) {
              field_a = (sd) null;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("tk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        field_e = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_b = "SPEED";
        field_g = new float[75];
        field_d = new float[75];
        double var0 = 0.08377580409572781;
        for (var2 = 0; var2 < 75; var2++) {
          field_d[var2] = (float)Math.cos((double)var2 * var0);
          field_g[var2] = (float)Math.sin(var0 * (double)var2);
        }
    }
}
