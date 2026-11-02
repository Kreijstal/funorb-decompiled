/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static IntrusiveDeque field_d;
    static cf field_b;
    static int field_e;
    static BitmapFont field_c;
    static int[] field_g;
    static dk field_f;
    static Sprite[] field_a;

    final static int a(int param0, int param1, int param2) {
        if (null == ub.field_e) {
          return -1;
        }
        if (param2 < wc.field_b) {
          if (field_e > param2) {
            if (param1 == -19503) {
              return -1;
            }
            field_c = (BitmapFont) null;
            return -1;
          }
          if (param2 >= ub.field_e.storedWidth + field_e) {
            if (param1 == -19503) {
              return -1;
            }
            field_c = (BitmapFont) null;
            return -1;
          }
          if (ii.field_a <= param0) {
            if (ub.field_e.storedHeight + ii.field_a > param0) {
              return 1;
            }
            if (param1 == -19503) {
              return -1;
            }
            field_c = (BitmapFont) null;
            return -1;
          }
          if (param1 == -19503) {
            return -1;
          }
          field_c = (BitmapFont) null;
          return -1;
        }
        if (ub.field_e.storedWidth + wc.field_b <= param2) {
          if (field_e > param2) {
            if (param1 == -19503) {
              return -1;
            }
            field_c = (BitmapFont) null;
            return -1;
          }
          if (param2 >= ub.field_e.storedWidth + field_e) {
            if (param1 != -19503) {
              field_c = (BitmapFont) null;
              return -1;
            }
            return -1;
          }
          if (ii.field_a <= param0) {
            if (ub.field_e.storedHeight + ii.field_a <= param0) {
              if (param1 != -19503) {
                field_c = (BitmapFont) null;
                return -1;
              }
              return -1;
            }
            return 1;
          }
          if (param1 != -19503) {
            field_c = (BitmapFont) null;
            return -1;
          }
          return -1;
        }
        if (bi.field_i <= param0 &&
          param0 < ub.field_e.storedHeight + bi.field_i) {
          return 0;
        }
        if (field_e <= param2 &&
          param2 < ub.field_e.storedWidth + field_e &&
          ii.field_a <= param0) {
          if (ub.field_e.storedHeight + ii.field_a <= param0) {
            if (param1 != -19503) {
              field_c = (BitmapFont) null;
              return -1;
            }
            return -1;
          }
          return 1;
        }
        if (param1 != -19503) {
          field_c = (BitmapFont) null;
          return -1;
        }
        return -1;
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_d = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          return;
        }
        field_e = 82;
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_f = null;
        field_g = null;
    }

    static {
        field_d = new IntrusiveDeque();
        field_b = new cf();
        field_g = new int[4];
    }
}
