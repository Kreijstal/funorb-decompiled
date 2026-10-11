/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static int[] field_b;
    static ci[] field_a;
    static int field_g;
    static long field_f;
    static fa field_d;
    static long field_c;
    static String field_e;

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        }
        dm.a((byte) -25);
        field_a = null;
        field_d = null;
        field_b = null;
    }

    final static q a(byte param0, String param1) {
        String var2 = null;
        q var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_5_0 = null;
        q stackIn_16_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Terraphoenix.field_V;
        try {
          if (param0 != -85) {
            var6 = (String) null;
            dm.a((byte) 0, (String) null);
          }
          if (ai.field_f == null) {
            stackIn_5_0 = null;
            return (q) (stackIn_5_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = hm.a((byte) 126, var7);
          if (var2 == null) {
            var2 = param1;
          }
          var3 = (q) (ai.field_f.a(param0 + 203, (long)var2.hashCode()));
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_Lb);
            var4 = hm.a((byte) 65, var8);
            if (var4 == null) {
              var4 = var3.field_Lb;
            }
            if (var4.equals(var2)) {
              stackIn_16_0 = var3;
              return stackIn_16_0;
            }
            var3 = (q) (ai.field_f.c((byte) -92));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("dm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 >= -32) {
          dm.a((byte) 65);
          ke.a(dg.a(false), (byte) -110);
          return;
        }
        ke.a(dg.a(false), (byte) -110);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_f = 20000000L;
        field_b = new int[256];
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((1 & var0) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -306674912;
            }
          }
          field_b[var1] = var0;
        }
        field_e = "HEX-2";
    }
}
