/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends ve {
    static String thisEntryDoesnTText;
    static ri[] field_o;
    static int[] field_q;

    final boolean d(int param0) {
        if (param0 != -8111) {
          this.c(-104);
          if (!this.field_m.field_xc) {
            return false;
          }
          if (this.field_m.field_wb) {
            return this.field_m.field_Hb ? true : false;
          }
          return false;
        }
        if (!this.field_m.field_xc) {
          return false;
        }
        if (this.field_m.field_wb) {
          return this.field_m.field_Hb ? true : false;
        }
        return false;
    }

    final void c(int param0) {
        if (param0 != 50) {
          thisEntryDoesnTText = (String) null;
        }
    }

    public static void c(boolean param0) {
        field_q = null;
        thisEntryDoesnTText = null;
        field_o = null;
        if (param0) {
          gq.c(true);
        }
    }

    gq(fr param0) {
        super(param0);
    }

    static {
        thisEntryDoesnTText = "This entry doesn't match";
        field_q = new int[]{0, 50, 75, 75, 100, 150};
    }
}
