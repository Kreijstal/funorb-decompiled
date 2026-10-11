/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ff {
    static int field_b;
    static long field_a;

    abstract void a(int param0, pb param1);

    abstract fe a(byte param0);

    final static qa[] a(int param0) {
        if (param0 != -21739) {
          field_a = 28L;
        }
        return new qa[]{ke.field_c, oj.field_e, bf.field_c};
    }

    final static void b(int param0) {
        if (param0 > -76) {
          field_b = -43;
        }
        String var2 = (String) null;
        uk.a(lh.field_c, -23804, (String) null);
    }

    final static String a(byte param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var2_int < var3) {
            if (tg.a((byte) -63, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (tg.a((byte) -63, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          if (param0 != 116) {
            ff.b(-19);
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (rf.a((char) var7, 0)) {
              var8 = r.a(-219, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("ff.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    static {
    }
}
