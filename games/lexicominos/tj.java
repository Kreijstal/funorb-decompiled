/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tj extends ri implements nf {
    static String field_k;
    private rl field_g;
    static String[] field_j;
    static int field_i;
    static int field_h;

    public final boolean a(int param0) {
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var2 = 28 / ((-29 - param0) / 42);
        if (((tj) this).field_g.field_u != null) {
          if (0 == ((tj) this).field_g.field_u.length()) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    public final void a(rl param0, boolean param1) {
        if (!param1) {
            field_h = -98;
        }
    }

    final sc b(boolean param0) {
        if (!param0) {
          String discarded$2 = ((tj) this).b(-1);
          return ((tj) this).a(0, ((tj) this).field_g.field_u);
        } else {
          return ((tj) this).a(0, ((tj) this).field_g.field_u);
        }
    }

    abstract String a(byte param0, String param1);

    final static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        Object var2 = null;
        cl.a((byte) 41, (String) null, Lexicominos.field_H);
    }

    tj(rl param0) {
        ((tj) this).field_g = param0;
    }

    public final void a(byte param0, rl param1) {
        ((tj) this).a(true);
        if (param0 != 10) {
            tj.d(95);
        }
    }

    abstract sc a(int param0, String param1);

    final String b(int param0) {
        if (param0 <= 21) {
          field_h = -22;
          return ((tj) this).a((byte) -126, ((tj) this).field_g.field_u);
        } else {
          return ((tj) this).a((byte) -126, ((tj) this).field_g.field_u);
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            field_k = null;
            field_j = null;
            field_k = null;
            return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Mouse over an icon for details";
        field_j = new String[]{"Using the cursor keys, the 'SPACE' bar, 'Z', and 'X', move and rotate the falling blocks to make words both across and down.", "If you make more than one word with a block, you get a multiplier bonus."};
        field_i = 0;
        field_h = 0;
    }
}
