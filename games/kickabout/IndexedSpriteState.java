/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IndexedSpriteState {
    int field_k;
    static IntrusiveDeque field_c;
    static boolean[][] field_e;
    int field_h;
    static vn[] field_j;
    int field_b;
    int field_d;
    static int field_g;
    int field_i;
    int field_a;
    static String field_f;

    final static void b(int param0, int param1) {
        BlackFadeScreen.field_j = param1;
        if (param0 != 38) {
          field_f = (String) null;
        }
    }

    abstract void a(int param0, int param1);

    final static void a(int param0, IntrusiveDeque param1, java.awt.Point[] param2) {
        try {
          AccountRequestDialog.a((byte) -108, 38, param1, param2);
          if (param0 >= -39) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 <= -67) {
          field_j = null;
          field_c = null;
          field_e = (boolean[][]) null;
          return;
        }
        java.awt.Point[] var2 = (java.awt.Point[]) null;
        IndexedSpriteState.a(-75, (IntrusiveDeque) null, (java.awt.Point[]) null);
        field_j = null;
        field_c = null;
        field_e = (boolean[][]) null;
    }

    final static void a(byte param0, String param1) {
        et.field_b = true;
        if (param0 != -67) {
          String var3 = (String) null;
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-25, (String) null);
        }
        if (LoginMethod.a(false)) {
          return;
        }
        try {
          wp.field_h = param1;
          AuctionItem.field_e = 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_c = null;
        field_f = "Camera Detached";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$b6210757cdab(int param0, String param1) {
        et.field_b = true;
        if (param0 != -67) {
          String var3 = (String) null;
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-25, (String) null);
        }
        if (LoginMethod.a(false)) {
          return;
        }
        try {
          wp.field_h = param1;
          AuctionItem.field_e = 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }
}
