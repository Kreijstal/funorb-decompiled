/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends SpellAreaEffect {
    static NodeDeque field_t;
    static String[] field_s;

    ss(int param0, int param1, int param2, int param3) {
        this.field_m = param3;
    }

    public static void a(byte param0) {
        field_t = null;
        field_s = null;
        int var1 = -80 / ((48 - param0) / 47);
    }

    final void applyEffect(int obfuscationGuard, Battlefield battlefield) {
        try {
          if (obfuscationGuard != 64) {
            field_s = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ss.C(" + obfuscationGuard + ',' + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = new NodeDeque();
        field_s = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
