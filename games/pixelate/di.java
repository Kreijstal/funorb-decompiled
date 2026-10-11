/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static tf field_c;
    static int[] field_b;
    static int field_a;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          return;
        }
        field_c = null;
    }

    final static String a(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        String var2;
        int var3;
        int var4;
        StringBuilder var5;
        int var6;
        String var7;
        String var2Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        var7 = Integer.toString(param1);
        var3 = var7.length();
        if (var3 <= 3) {
          return var7;
        }
        var4 = var3 % 3;
        if (var4 == 0) {
          var4 = 3;
        }
        var5 = new StringBuilder((var3 - var4) / 3);
        if (!param0) {
          discarded$0 = var5.append(var7.substring(0, var4));
          var2 = var7.substring(var4);
          while (var2.length() > 0) {
            discarded$1 = var5.append(wl.field_f);
            discarded$2 = var5.append(var2.substring(0, 3));
            var2 = var2.substring(3);
          }
          return var5.toString();
        }
        field_a = 72;
        discarded$3 = var5.append(var7.substring(0, var4));
        var2Lifetime1 = var7.substring(var4);
        while (var2Lifetime1.length() > 0) {
          discarded$4 = var5.append(wl.field_f);
          discarded$5 = var5.append(var2Lifetime1.substring(0, 3));
          var2Lifetime1 = var2Lifetime1.substring(3);
        }
        return var5.toString();
    }

    final static void a(int param0, long param1, String param2, byte param3, int param4) {
        try {
          ih.field_f = param0;
          ej.field_a = param1;
          ck.field_g = param2;
          if (param3 != 9) {
            field_c = (tf) null;
          }
          jo.field_r = true;
          kk.field_a = param4;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "di.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = 0;
    }
}
