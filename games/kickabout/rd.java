/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_a;
    int field_m;
    int field_g;
    boolean field_j;
    static vl field_h;
    static int field_i;
    static String field_c;
    int field_k;
    static String field_d;
    static String field_b;
    boolean[][][] field_l;
    long field_f;
    static String[] field_e;

    final static boolean a(int param0, int param1) {
        if (param0 != -16143) {
          field_h = (vl) null;
          if (param1 < 0) {
            return 0 == (param1 + 1) % 4 ? true : false;
          }
          if (1582 > param1) {
            return param1 % 4 == 0 ? true : false;
          }
          if (param1 % 4 != 0) {
            return false;
          }
          if (0 != param1 % 100) {
            return true;
          }
          if (param1 % 400 == 0) {
            return true;
          }
          return false;
        }
        if (param1 < 0) {
          return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (1582 > param1) {
          return param1 % 4 == 0 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (0 != param1 % 100) {
          return true;
        }
        if (param1 % 400 == 0) {
          return true;
        }
        return false;
    }

    final boolean a(long param0, int param1, int param2) {
        int var5 = 43 / ((25 - param1) / 53);
        if (!this.field_j) {
          if (this.field_f == -1L) {
            return true;
          }
          if (~this.field_f != ~param0) {
            return false;
          }
          return true;
        }
        if (param2 < 2) {
          return false;
        }
        if (this.field_f == -1L) {
          return true;
        }
        if (~this.field_f != ~param0) {
          return false;
        }
        return true;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          field_e = null;
          field_c = null;
          field_h = null;
          field_d = null;
          return;
        }
        rd.a(true);
        field_e = null;
        field_c = null;
        field_h = null;
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != -1) {
          return false;
        }
        if (this.field_m == 0) {
          return true;
        }
        if (this.field_m == 13) {
          return true;
        }
        if (this.field_m != 23) {
          return false;
        }
        return true;
    }

    final boolean a(int param0, byte[] param1, byte param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -8) {
            return true;
          }
          if (this.field_g == -1) {
            return false;
          }
          stackIn_10_0 = !(gf.a(param1, this.field_g, param0, 3231));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 54) {
            this.a(93L, 123, -46);
          }
          if (param0 < 2 &&
            this.field_k != -1) {
            stackIn_10_0 = !(c.a(this.field_k, 0, param2));
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("rd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    rd(int param0, int param1, boolean param2, long param3, String param4) {
        try {
          this.field_f = param3;
          this.field_k = param0;
          this.field_j = param2 ? true : false;
          this.field_g = param1;
          this.field_l = ih.a(21656, param4);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Hide game chat";
        field_i = 250;
        field_d = "tackles and kicks";
        field_b = "Select a home pitch to host games on.";
        field_h = new vl("");
    }
}
