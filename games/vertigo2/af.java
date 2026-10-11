/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af extends cj implements ik {
    private df field_K;
    static String field_L;
    static int field_E;
    static String field_G;
    static String field_H;
    static String field_J;
    static String field_I;
    static char[] field_F;

    void a(int param0, df param1) {
        try {
          if (param0 != -11808) {
            this.a(10);
          }
          this.field_K = param1;
          this.field_K.field_h = this;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (!jm.a(param1, param2 ^ -99, param0)) {
            return false;
          }
          if (param2 != -99) {
            af.d(false);
          }
          var3_int = 0;
          while (true) {
            if (param1.length() <= var3_int) {
              return true;
            }
            if (wb.a(param1.charAt(var3_int), (byte) 115)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("af.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract int c(boolean param0);

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_G = null;
        field_H = null;
        field_F = null;
        field_L = null;
        if (param0) {
          return;
        }
        field_J = null;
        field_I = null;
    }

    public final of a(byte param0) {
        if (param0 != -5) {
          this.field_K = (df) null;
          return (of) ((Object) this.field_K);
        }
        return (of) ((Object) this.field_K);
    }

    abstract int i(int param0);

    abstract int a(int param0);

    af(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void a(int param0, int param1, byte param2) {
        kf.field_b = param1;
        if (param2 != 122) {
          return;
        }
        ni.field_a = param0;
    }

    static {
        field_L = "From <%0>: ";
        field_G = "Accept invitation to <%0>'s game";
        field_J = "Unfortunately you are not eligible to create an account.";
        field_F = new char[128];
        field_I = "Close";
    }
}
