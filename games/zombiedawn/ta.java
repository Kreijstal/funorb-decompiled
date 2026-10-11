/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_a;

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = ZombieDawn.field_J;
        try {
          en.c();
          jj.field_H = new int[260];
          f.field_a = 11;
          if (param0 != 255) {
            field_a = (String) null;
          }
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            jj.field_H[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (jj.field_H.length > var5) {
            jj.field_H[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ta.A(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Player";
    }
}
