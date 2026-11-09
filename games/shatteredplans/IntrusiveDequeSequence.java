/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDequeSequence extends NodeSequence {
    private static int[] field_f;
    private static int[] field_k;
    private IntrusiveDeque field_h;
    static AnimatedPanel field_g;
    static ValidationState field_i;
    static String field_j;

    final int size(byte param0) {
        if (param0 != -61) {
          this.field_h = (IntrusiveDeque) null;
        }
        return this.field_h.size(0);
    }

    final IntrusiveNode first(byte param0) {
        if (param0 <= 99) {
          field_j = (String) null;
        }
        return this.field_h.startForward(0);
    }

    final IntrusiveNode next(boolean param0) {
        if (param0) {
          return (IntrusiveNode) null;
        }
        return this.field_h.nextForward((byte) -71);
    }

    final static void a(String param0, byte param1, long param2, int param3, int param4) {
        try {
          ConquestVictoryChecker.field_n = true;
          if (param1 <= 44) {
            field_k = (int[]) null;
          }
          vs.field_d = param4;
          DefendTask.field_o = param2;
          ValidationMessageWidget.field_S = param0;
          TertiaryLinkNode.field_r = param3;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "un.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    IntrusiveDequeSequence(IntrusiveDeque param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "un.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStatics(int param0) {
        field_g = null;
        field_f = null;
        field_k = null;
        field_j = null;
        if (param0 != 11) {
          IntrusiveDequeSequence.a((String) null, (byte) -25, 15L, -37, -9);
        }
        field_i = null;
    }

    static {
        int var0 = 0;
        int var0Lifetime1;
        field_f = new int[8];
        field_k = new int[12];
        for (var0 = 0; var0 < 8; var0++) {
          field_f[var0] = (-var0 + 7) * 789516;
        }
        for (var0Lifetime1 = 0; var0Lifetime1 < 12; var0Lifetime1++) {
          field_k[var0Lifetime1] = (-var0Lifetime1 + 11) * 526344;
        }
        field_i = new ValidationState();
        field_j = "Played";
    }
}
