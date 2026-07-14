/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jda extends iga {
    private String field_e;
    static wba field_g;
    private String field_f;

    final wba a(byte param0) {
        if (param0 != -106) {
            field_g = null;
            return bs.field_g;
        }
        return bs.field_g;
    }

    final void a(lu param0, boolean param1) {
        if (param1) {
          wba discarded$2 = ((jda) this).a((byte) -118);
          param0.a(((jda) this).field_f, 70);
          param0.a(-117, ((jda) this).field_e);
          return;
        } else {
          param0.a(((jda) this).field_f, 70);
          param0.a(-117, ((jda) this).field_e);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            jda.a(72);
            field_g = null;
            return;
        }
        field_g = null;
    }

    jda(String param0, String param1) {
        ((jda) this).field_f = param0;
        ((jda) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new wba(0);
    }
}
