/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends un {
    static String field_i;
    static String field_j;
    static cn field_g;
    static String[] field_f;
    private java.nio.ByteBuffer field_h;

    final void a(byte[] param0, int param1) {
        if (param1 < 30) {
          ep.a((byte) -76, 4);
          ((ep) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
          java.nio.Buffer discarded$8 = ((ep) this).field_h.position(0);
          java.nio.ByteBuffer discarded$9 = ((ep) this).field_h.put(param0);
          return;
        } else {
          ((ep) this).field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
          java.nio.Buffer discarded$10 = ((ep) this).field_h.position(0);
          java.nio.ByteBuffer discarded$11 = ((ep) this).field_h.put(param0);
          return;
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        int var1 = 82 % ((75 - param0) / 44);
        field_i = null;
        field_f = null;
    }

    final byte[] b(byte param0) {
        int var3 = 23 % ((-67 - param0) / 39);
        byte[] var4 = new byte[((ep) this).field_h.capacity()];
        byte[] var2 = var4;
        java.nio.Buffer discarded$0 = ((ep) this).field_h.position(0);
        java.nio.ByteBuffer discarded$1 = ((ep) this).field_h.get(var4);
        return var4;
    }

    final static hb a(int param0, int param1, ec param2) {
        int var3 = param2.c(true);
        if (!(param1 != (var3 ^ -1))) {
            return null;
        }
        hb var4 = new hb(param0, var3);
        var4.field_e = param2.c(true);
        var4.field_g = param2.c(true);
        var4.field_f = param2.c(true);
        var4.field_k = param2.c(true);
        var4.field_o = param2.c(true);
        var4.field_d = param2.c(true);
        var4.field_p = param2.c(true);
        return var4;
    }

    final static void a(byte param0, int param1) {
        int var4 = DungeonAssault.field_K;
        ak var5 = (ak) (Object) oh.field_j.e(-24172);
        while (var5 != null) {
            g.a(param1, var5, (byte) 50);
            var5 = (ak) (Object) oh.field_j.a(4);
        }
        int var3 = 97 % ((param0 - 67) / 59);
        ne var2 = sf.field_c.e(-24172);
        while (var2 != null) {
            bd.a(param1, (byte) 113);
            var2 = sf.field_c.a(4);
        }
    }

    ep() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Your raiders flee in terror from the <%0>!";
        field_j = "This entry doesn't match";
        field_f = new String[]{"By rating", "By win percentage"};
    }
}
