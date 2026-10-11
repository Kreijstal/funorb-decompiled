/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        int var2;
        if (!this.field_v &&
          this.field_x.field_h >= -this.field_A + this.field_x.field_j.length) {
          var2 = 37 % ((2 - param0) / 38);
          return this.field_x.field_j;
        }
        throw new RuntimeException();
    }

    final static void c(int param0) {
        if (param0 != 255) {
          return;
        }
        String var2 = (String) null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d(int param0) {
        if (a.field_c == -1) {
          if (!a.b(1, 10343)) {
            return false;
          }
          a.field_c = ig.field_a.d(true);
          ig.field_a.field_h = 0;
        }
        if (param0 != 2) {
          return false;
        }
        if (a.field_c == -2) {
          if (!a.b(2, 10343)) {
            return false;
          }
          a.field_c = ig.field_a.b(-1698573656);
          ig.field_a.field_h = 0;
        }
        return a.b(a.field_c, 10343);
    }

    dc() {
    }

    final static String[] a(String param0, char param1, byte param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          var3_int = wd.a((byte) -72, param1, var10);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          if (param2 != -125) {
            field_y = (String) null;
          }
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1 != param0.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param0.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param0.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dc.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_y = null;
        int var1 = -27 % ((param0 - 19) / 53);
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          var12 = new char[param0];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          for (var6 = 0; var6 < param0; var6++) {
            var7 = param1[param3 + var6] & 255;
            if (0 != var7) {
              if (var7 >= 128 &&
                160 > var7) {
                var8 = ne.field_d[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
          }
          if (param2 != 16) {
            dc.d(-88);
          }
          stackIn_18_0 = new String(var12, 0, var5);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 != 16) {
          return 68;
        }
        if (this.field_x == null) {
          return 0;
        }
        return 100 * this.field_x.field_h / (this.field_x.field_j.length - this.field_A);
    }

    static {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
