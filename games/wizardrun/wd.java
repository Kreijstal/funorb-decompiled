/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int field_g;
    static int[] field_a;
    boolean field_d;
    boolean field_i;
    String field_h;
    int field_b;
    static int[] field_e;
    String[] field_c;
    static int[] field_f;

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_e = null;
        if (param0 < 102) {
          CharSequence var2 = (CharSequence) null;
          wd.a((byte) 89, (CharSequence) null, false);
        }
    }

    final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = wizardrun.field_H;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = ta.a(-77, param1);
          if (var4 != null &&
            1 <= var4.length()) {
            if (!d.a(true, var4.charAt(0)) &&
              !d.a(true, var4.charAt(var4.length() - 1))) {
              var5 = 0;
              if (param0 != 43) {
                var9 = (CharSequence) null;
                wd.a((byte) 21, (CharSequence) null, true);
              }
              for (var6 = 0; param1.length() > var6; var6++) {
                var7 = param1.charAt(var6);
                if (d.a(true, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param2) {
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
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("wd.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    wd(boolean param0) {
        this.field_i = param0 ? true : false;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_g = 100;
        field_a = new int[128];
        field_e = new int[8192];
        field_f = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (var0 & 1)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_f[var1] = var0;
        }
    }
}
