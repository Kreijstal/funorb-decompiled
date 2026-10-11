/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d {
    static String field_a;
    static int field_g;
    static char[] field_b;
    static int[] field_c;
    static ll field_f;
    static int field_e;
    static String field_d;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 84) {
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
        field_e = -83;
        field_d = null;
        field_f = null;
        field_b = null;
    }

    final static String a(int param0, CharSequence param1) {
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
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(32 + var5);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              57 < var5)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 != 90) {
            d.a(-128);
          }
          stackIn_24_0 = new String(var8);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("d.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        int var1 = hg.a((byte) 95);
        if (!param0) {
          var2 = ml.b(20719);
          nc.field_c.a(ie.field_j - bi.field_g, (bi.field_g << 1) + var2, -51, var1 + (em.field_j << 1), -em.field_j + mk.field_d);
          mk.c(117);
          return;
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
        field_b = new char[128];
        field_g = 64;
        field_d = "Cancel";
    }
}
