/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static String[] field_b;
    static String field_d;
    static String field_g;
    static String field_c;
    private String field_f;
    private boolean field_e;
    private boolean field_a;

    final boolean d(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -75) {
            discarded$0 = this.b(-57);
            return this.field_a;
        }
        return this.field_a;
    }

    public static void c(int param0) {
        if (param0 < 115) {
          uc.c(-77);
          field_d = null;
          field_c = null;
          field_b = null;
          field_g = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          field_g = null;
          return;
        }
    }

    final String a(int param0) {
        if (param0 != 31027) {
            field_d = (String) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final void a(int param0, boolean param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((uc) (this)).field_e = stackIn_3_1 != 0;
        if (param0 != -17853) {
          this.a(-102, true);
          this.field_a = true;
          return;
        } else {
          this.field_a = true;
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 18307) {
            return true;
        }
        return this.field_e;
    }

    final static void b(int param0, boolean param1) {
        tg.field_g.a(param0 ^ -1081, param1);
        if (param0 != 16772) {
            uc.c(69);
        }
    }

    uc(String param0) {
        this.field_e = false;
        this.field_a = false;
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Human-lover";
        field_d = "Make the map shake with your power. You won't be as affected as your enemies will be.";
        field_g = "Research trees: You can research many different abilities in Zombie Dawn Multiplayer. This tree shows you what is currently available for use, and gives you a hint as to what will be available next. There are three trees: Zombie, Overlord, and Planetary - you can switch between them using the tabs above.";
    }
}
