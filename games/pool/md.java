/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static String field_e;
    static String[] field_a;
    static int field_b;
    static byte[] field_c;
    static vh field_d;

    final static boolean a(byte param0) {
        if (param0 >= -11) {
            field_d = (vh) null;
            return re.field_b;
        }
        return re.field_b;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static void a(int param0) {
        fb.b(0.6000000238418579f);
        fb.a();
        fb.b(320, 240);
        hr.field_q.field_k = 0;
        fb.a(new dp(ep.field_F, hr.field_q, param0, 128));
        di.a(0);
    }

    public static void a(boolean param0) {
        boolean discarded$2 = false;
        field_a = null;
        field_d = null;
        if (!param0) {
          discarded$2 = md.a((byte) -8);
          field_e = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          return;
        }
    }

    static {
        field_e = "Show game chat from my friends";
        field_a = new String[]{"Double Pot", "Snooker-fly", "Snooker-fly Pot", "Planter", "Master Gardener", "The Cover-up", "Barnstorming", "Shut-out", "Perfect 9", "Nine-to-One", "Pool Shark", "Hustler", "Hot Pocket", "Magic Pockets", "The Smell of Money", "The Colour of Money", "The Feel of Money ", "Black Belter", "Around the World in Eighty Pots", "Plan 9: the Perfect Break", "Beat the Clock", "Clean Break", "One-break Wonder", "Beat the Clock, Unguided", "Clean Break, Unguided", "One-break Wonder, Unguided", "Bury the Undead"};
        field_b = 480;
    }
}
