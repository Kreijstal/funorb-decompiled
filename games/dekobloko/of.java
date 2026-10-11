/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class of {
    static String field_g;
    static um field_a;
    static boolean field_h;
    static int field_e;
    static boolean field_c;
    static byte[][] field_f;
    static String field_b;
    static int field_i;
    static int field_d;

    abstract ad a(boolean param0);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > 88) {
          field_f = (byte[][]) null;
          field_g = null;
          field_a = null;
          return;
        }
        field_g = (String) null;
        field_f = (byte[][]) null;
        field_g = null;
        field_a = null;
    }

    abstract int a(int param0, int param1);

    final static void a(int param0) {
        bb.field_f = bb.field_f + 1;
        if (param0 != 0) {
          return;
        }
        jg.field_g = jg.field_g + 1;
        if (bb.field_f >= 131072) {
          bb.field_f = 0;
          if (jg.field_g <= 255) {
            return;
          }
          if (sl.field_f <= 20) {
            sl.field_f = sl.field_f + 1;
            jg.field_g = 255;
            return;
          }
          jm.field_p = jm.field_p + 1;
          jg.field_g = 0;
          sl.field_f = 0;
          if (mc.field_b.length <= jm.field_p) {
            jm.field_p = 0;
            return;
          }
          return;
        }
        if (jg.field_g <= 255) {
          return;
        }
        if (sl.field_f <= 20) {
          sl.field_f = sl.field_f + 1;
          jg.field_g = 255;
          return;
        }
        jm.field_p = jm.field_p + 1;
        jg.field_g = 0;
        sl.field_f = 0;
        if (mc.field_b.length <= jm.field_p) {
          jm.field_p = 0;
          return;
        }
    }

    abstract byte[] a(int param0, byte param1);

    final static void a(boolean param0, int param1) {
        bh var2 = null;
        int var3 = 0;
        ki var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = client.field_A ? 1 : 0;
        try {
          var4 = (ki) (cg.field_c.c((byte) -112));
          while (var4 != null) {
            kk.a(param1, -15016, var4);
            var4 = (ki) (cg.field_c.d(true));
          }
          if (param0) {
            of.a(true, -48);
          }
          var2 = rc.field_e.c((byte) 109);
          while (var2 != null) {
            gm.b(param1, 47);
            var2 = rc.field_e.d(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "of.C(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_g = "That name is not available";
        field_a = new um();
        field_f = new byte[1000][];
        field_b = "ESC - cancel private message";
        field_d = -1;
    }
}
