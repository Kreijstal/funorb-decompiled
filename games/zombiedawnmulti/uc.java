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

    final boolean isFlagAssigned(int param0) {
        if (param0 >= -75) {
          this.isFlagged(-57);
          return this.field_a;
        }
        return this.field_a;
    }

    public static void releaseStatics(int param0) {
        if (param0 >= 115) {
          field_d = null;
          field_c = null;
          field_b = null;
          field_g = null;
          return;
        }
        uc.releaseStatics(-77);
        field_d = null;
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final String getText(int param0) {
        if (param0 != 31027) {
          field_d = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final void setFlag(int param0, boolean param1) {
        this.field_e = param1 ? true : false;
        if (param0 == -17853) {
          this.field_a = true;
          return;
        }
        this.setFlag(-102, true);
        this.field_a = true;
    }

    final boolean isFlagged(int param0) {
        if (param0 != 18307) {
          return true;
        }
        return this.field_e;
    }

    final static void setLoginTextFlag(int param0, boolean param1) {
        tg.field_g.setFlag(param0 ^ -1081, param1);
        if (param0 != 16772) {
          uc.releaseStatics(69);
        }
    }

    uc(String param0) {
        this.field_e = false;
        this.field_a = false;
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Human-lover";
        field_d = "Make the map shake with your power. You won't be as affected as your enemies will be.";
        field_g = "Research trees: You can research many different abilities in Zombie Dawn Multiplayer. This tree shows you what is currently available for use, and gives you a hint as to what will be available next. There are three trees: Zombie, Overlord, and Planetary - you can switch between them using the tabs above.";
    }
}
