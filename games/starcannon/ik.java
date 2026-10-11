/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ik extends uh {
    volatile boolean field_r;
    boolean field_o;
    boolean field_n;
    static String field_q;
    static char[] field_s;
    static long field_p;

    final static hh a(String param0, int param1, long param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        cl stackIn_6_0 = null;
        vd stackIn_8_0 = null;
        od stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param2 &&
            param3 != null) {
            stackIn_8_0 = new vd(param3, param0);
            return (hh) ((Object) stackIn_8_0);
          }
          if (param4) {
            stackIn_6_0 = new cl(param2, param0);
            return (hh) ((Object) stackIn_6_0);
          }
          if (param1 != -66) {
            ik.g(-104);
          }
          stackIn_12_0 = new od(param2, param0);
          return (hh) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ik.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract int e(int param0);

    final static void g(int param0) {
        fd.a(param0, 0);
    }

    final static long a(CharSequence param0, byte param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_18_0 = 0L;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          var6 = 14 % ((-35 - param1) / 34);
          while (var5 < var4) {
            var2_long = var2_long * 37L;
            var7 = param0.charAt(var5);
            if (var7 >= 65 &&
              90 >= var7) {
              var2_long = var2_long + (long)(-65 + (var7 + 1));
            } else if (var7 >= 97 &&
              122 >= var7) {
              var2_long = var2_long + (long)(1 + (var7 - 97));
            } else {
              if (var7 >= 48 &&
                var7 <= 57) {
                var2_long = var2_long + (long)(27 - (-var7 + 48));
              }
            }
            if (177917621779460413L > var2_long) {
              var5++;
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_18_0 = var2_long;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ik.H(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract byte[] f(int param0);

    ik() {
        this.field_r = true;
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != 0) {
          return;
        }
        field_s = null;
    }

    static {
        field_s = new char[128];
    }
}
