/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb implements ga {
    static String field_c;
    static int field_d;
    static ki field_b;
    private long field_a;

    final static String a(CharSequence param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var2_int = param0.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(32 + var5);
            } else if ((var5 < 97 ||
              122 < var5) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param1 != 122) {
            field_b = (ki) null;
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("wb.BA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract qd a(byte param0);

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -123) {
            stackIn_4_0 = vi.a(param0, 0, param0.length, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wb.AA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != 7312) {
          return;
        }
        field_b = null;
    }

    public final String a(int param0) {
        if (this.c(25296)) {
          return null;
        }
        if ((350L + this.field_a) > ji.b(123)) {
          return null;
        }
        if (param0 > 121) {
          return this.e(-45);
        }
        field_c = (String) null;
        return this.e(-45);
    }

    abstract String e(int param0);

    public final qd d(int param0) {
        if (this.c(25296)) {
          return fm.field_a;
        }
        if ((350L + this.field_a) > ji.b(-84)) {
          return ml.field_a;
        }
        if (param0 == -7847) {
          return this.a((byte) 75);
        }
        return (qd) null;
    }

    public final void b(int param0) {
        this.field_a = ji.b(param0 + 21066);
        if (param0 != -20959) {
          field_c = (String) null;
        }
    }

    static {
        field_c = "Email is valid";
    }
}
