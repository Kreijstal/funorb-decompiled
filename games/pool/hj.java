/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    static long field_c;
    static int field_f;
    static String field_h;
    static jg field_j;
    static int field_l;
    static int field_g;
    static int field_a;
    static String field_k;
    int field_i;
    static String[] field_e;
    int field_b;
    static int[][] field_d;

    final static boolean a(int param0, int[] param1, long param2, String param3, byte param4) {
        qp var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!fj.a(param3, param1, -118, param0, param2)) {
            return false;
          }
          if (param0 == 1) {
            param0 = 0;
          }
          fm.field_I = param3;
          hn.field_b = param0;
          if (param4 != 76) {
            field_f = -23;
          }
          var7 = (CharSequence) ((Object) param3);
          di.field_a = hq.a(62, var7);
          c.field_d = param2;
          var6 = ld.a((byte) 92, br.field_J, param1, tp.field_i, bf.field_c);
          jk.a(111, var6);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("hj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 == -103) {
          field_d = (int[][]) null;
          field_e = null;
          field_j = null;
          field_h = null;
          field_k = null;
          return;
        }
        java.awt.Component var2 = (java.awt.Component) null;
        hj.a((java.awt.Component) null, true);
        field_d = (int[][]) null;
        field_e = null;
        field_j = null;
        field_h = null;
        field_k = null;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        try {
          param0.removeMouseListener(wp.field_g);
          param0.removeMouseMotionListener(wp.field_g);
          param0.removeFocusListener(wp.field_g);
          ho.field_v = 0;
          if (param1) {
            hj.a((byte) -103);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hj(int param0, int param1, int param2, int param3) {
        this.field_i = param0;
        this.field_b = param3;
    }

    static {
        field_h = "You appear to be telling someone your password - please don't!";
        field_e = new String[]{"One turn at the table, which may be several shots.", "Having potted no balls before in the game, potting all of your balls and winning the game in one visit (without missing a shot).", "When your ball is very close to a pocket so it's difficult or impossible for your opponent to pot in it without potting yours.", "When you cannot hit any target ball directly without fouling.", "Hitting a ball which hits another ball into a pocket (a chain reaction).", "The line going across the table that the cue ball initially sits on.", "Hitting a ball into a pocket.", "The first shot of the game where you strike the rack with the cue ball.", "A single strike of the cue ball with the cue until all the balls come to rest.", "The holes in the corners and centre of the long sides of the table that the balls fall into.", "When the balls are taken out of the pockets during a game and placed back in their starting positions.", "The initial setup of the balls at the beginning of a game.", "The white ball.", "A shot that breaks one or more rules.", "The borders of the table between the pockets.", "One of the sets of balls, either spots or stripes.", "When you are able to move the cue ball, usually following a foul."};
        field_k = "Decline invitation to <%0>'s game";
        ic.a((byte) 36, 50);
    }
}
