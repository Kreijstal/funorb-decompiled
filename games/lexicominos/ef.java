/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static int field_e;
    static String field_c;
    static int field_f;
    static db[] field_d;
    static String field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          CharSequence[] var2 = (CharSequence[]) null;
          ef.a((CharSequence[]) null, 75);
        }
        field_d = null;
    }

    final static String a(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_e = 96;
          }
          stackIn_3_0 = vl.a(param0.length, param0, 0, -96);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ef.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static kb a(long param0, int param1, String param2, boolean param3, String param4) {
        RuntimeException var6 = null;
        pf stackIn_5_0 = null;
        a stackIn_7_0 = null;
        kb stackIn_10_0 = null;
        fk stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param0 &&
            param2 != null) {
            stackIn_7_0 = new a(param2, param4);
            return (kb) ((Object) stackIn_7_0);
          }
          if (param3) {
            stackIn_5_0 = new pf(param0, param4);
            return (kb) ((Object) stackIn_5_0);
          }
          if (param1 == -27981) {
            stackIn_12_0 = new fk(param0, param4);
            return (kb) ((Object) stackIn_12_0);
          }
          stackIn_10_0 = (kb) null;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ef.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var4 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        String stackIn_3_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new StringBuilder(var2_int);
          if (param1 > -12) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var5 = param0.charAt(var4);
            if (var5 >= 97 &&
              122 >= var5) {
              discarded$0 = var3.append((char) var5);
            } else if (var5 >= 48 &&
              var5 <= 57) {
              discarded$1 = var3.append((char) var5);
            } else if (var5 >= 65 &&
              90 >= var5) {
              discarded$2 = var3.append((char)(-65 + (var5 + 97)));
            } else if (var5 != 43 &&
              var5 != 38) {
              var6 = var3.length();
              if (var6 > 0 &&
                var3.charAt(var6 - 1) != 95) {
                discarded$3 = var3.append('_');
              }
            } else {
              discarded$4 = var3.append('+');
            }
          }
          stackIn_27_0 = var3.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_30_0 = var2;
          stackIn_30_1 = new StringBuilder().append("ef.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_c = "Waiting for extra data";
        field_a = 0;
    }
}
