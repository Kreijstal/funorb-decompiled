/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreSubmission extends IntrusiveNode {
    int field_m;
    int field_g;
    int field_o;
    static boolean[] field_h;
    int boardId;
    int[] field_q;
    int field_n;
    static boolean field_p;
    long field_l;
    int boardIdComplement;
    int requestId;

    public static void releaseStatics(int guard) {
        field_h = null;
        if (guard != 65535) {
          ScoreSubmission.a(false, false, (byte) -31, false);
        }
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        if (param2 != -112) {
          return (String) null;
        }
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
          if (param3) {
            var4++;
            return IntrusiveDequeCursor.field_c[var4];
          }
          return IntrusiveDequeCursor.field_c[var4];
        }
        if (!param3) {
          return IntrusiveDequeCursor.field_c[var4];
        }
        var4++;
        return IntrusiveDequeCursor.field_c[var4];
    }

    ScoreSubmission(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
          this.field_o = param2;
          this.field_n = param4;
          this.field_g = param5;
          this.field_m = param3;
          this.boardIdComplement = param1;
          this.field_q = param6;
          this.boardId = param0;
          int fieldTemp$0 = qh.field_m;
          qh.field_m = qh.field_m + 1;
          this.requestId = 65535 & fieldTemp$0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ik.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new boolean[112];
    }
}
