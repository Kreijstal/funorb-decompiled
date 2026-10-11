/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends lh {
    static int field_l;
    int field_m;
    static String[] field_u;
    int field_r;
    int field_o;
    static String field_n;
    static long[] field_q;
    int field_v;
    int field_s;
    int field_i;
    int field_j;
    long field_k;
    static int field_t;
    int[] field_p;

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_q = (long[]) null;
          }
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (uj.a(var3, (byte) -95) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(byte param0, boolean param1, CharSequence param2) {
        int var6 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          if (param2 == null) {
            return false;
          }
          if (param0 <= 77) {
            return true;
          }
          var3_int = param2.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = uk.a(12, param2);
            if (var4 != null &&
              1 <= var4.length()) {
              if (r.a(var4.charAt(0), -108)) {
                return false;
              }
              if (r.a(var4.charAt(var4.length() - 1), -77)) {
                return false;
              }
              var5 = 0;
              for (var6 = 0; var6 < param2.length(); var6++) {
                var7 = param2.charAt(var6);
                if (!r.a((char) var7, -55)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param1) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("bh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 > -125) {
          field_q = (long[]) null;
        }
        field_u = null;
        field_n = null;
        field_q = null;
    }

    bh(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_j = param2;
          this.field_i = param1;
          fieldTemp$0 = pg.field_e;
          pg.field_e = pg.field_e + 1;
          this.field_s = 65535 & fieldTemp$0;
          this.field_v = param4;
          this.field_m = param5;
          this.field_p = param6;
          this.field_r = param3;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "bh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = new String[]{"Congratulations!", "You have completed", "Flea Circus!"};
        field_n = "No highscores";
        field_q = new long[32];
    }
}
