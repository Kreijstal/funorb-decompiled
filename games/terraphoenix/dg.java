/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg {
    static byte[][] field_e;
    static ci field_a;
    static boolean field_d;
    static im field_c;
    static boolean field_b;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static java.applet.Applet a(boolean param0) {
        if (le.field_r != null) {
          return le.field_r;
        }
        if (param0) {
          dg.b(false);
          return (java.applet.Applet) ((Object) gm.field_f);
        }
        return (java.applet.Applet) ((Object) gm.field_f);
    }

    public static void b(boolean param0) {
        if (param0) {
          field_e = (byte[][]) null;
          field_a = null;
          field_c = null;
          return;
        }
        dg.a(false);
        field_e = (byte[][]) null;
        field_a = null;
        field_c = null;
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param2 == -76) {
          var4 = 0;
          if (param0) {
            var4 += 4;
          }
          if (param1) {
            var4 += 2;
          }
          if (!param3) {
            return ug.field_a[var4];
          }
          var4++;
          return ug.field_a[var4];
        }
        field_c = (im) null;
        var4Lifetime1 = 0;
        if (param0) {
          var4Lifetime1 += 4;
        }
        if (param1) {
          var4Lifetime1 += 2;
        }
        if (!param3) {
          return ug.field_a[var4Lifetime1];
        }
        var4Lifetime1++;
        return ug.field_a[var4Lifetime1];
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        uc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        try {
          var1 = di.field_l;
          if (param0 < 37) {
            field_c = (im) null;
          }
          while (b.a((byte) -102)) {
            var1.k(-17410, 8);
            fieldTemp$0 = var1.field_k + 1;
            var1.field_k = var1.field_k + 1;
            var2 = fieldTemp$0;
            ql.a(-124, var1);
            di.field_l.j(var1.field_k - var2, -119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "dg.A(" + param0 + ')');
        }
    }

    static {
        field_d = false;
        field_e = new byte[50][];
        field_c = new im();
    }
}
