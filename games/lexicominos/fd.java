/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd implements Runnable {
    static tf field_e;
    static int field_g;
    volatile boolean field_d;
    volatile boolean field_c;
    ab field_b;
    static String field_a;
    volatile b[] field_f;

    final static boolean a(String param0, int param1, int param2, String param3, pj param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        u var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bk.field_c != c.field_m) {
            return false;
          }
          var8 = new u(ug.field_A, param4);
          if (param1 != 0) {
            field_a = (String) null;
          }
          ug.field_A.a(param1 - 14579, var8);
          if (g.f(256)) {
            var8.k((byte) -92);
            return true;
          }
          ce.field_d = param0;
          Lexicominos.field_H = param3;
          cg.field_l = param2;
          wa.field_k = param5;
          bk.field_c = ca.field_i;
          li.field_T = null;
          we.field_d = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("fd.B(");
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
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_26_0 = 0L;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + var6 + 1);
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(-97 + (1 + var6));
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 + 27 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          if (param0 != -58) {
            fd.a((byte) -11);
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_26_0 = var2_long;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final void run() {
        int var1_int = 0;
        b var2 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        this.field_c = true;
        try {
          while (!this.field_d) {
            for (var1_int = 0; 2 > var1_int; var1_int++) {
              var2 = this.field_f[var1_int];
              if (var2 == null) {
              } else {
                var2.e();
              }
            }
            ge.a(0, 10L);
            ki.a((Object) null, this.field_b, 50);
          }
        } catch (Exception exception) {
          String var5 = (String) null;
          uj.a((String) null, (Throwable) ((Object) exception), 1);
        } finally {
          this.field_c = false;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        if (param0 != -61) {
          field_g = -15;
        }
    }

    fd() {
        this.field_f = new b[2];
        this.field_d = false;
        this.field_c = false;
    }

    static {
        field_a = "No highscores";
        field_e = new tf();
    }
}
