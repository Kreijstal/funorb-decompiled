/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends ml {
    static String field_C;
    int field_x;
    static int field_v;
    static o field_z;
    static String[] field_y;
    sg field_w;
    byte[] field_A;
    static int[] field_B;

    final static void a(int param0, int param1) {
        fl.field_M = param1 * 100 / 150;
        fl.field_V = (param1 << -1775937712) / 150;
        fl.field_u = 400 * param1 / 150;
        if (param0 != 16062) {
            sk.f(79);
        }
    }

    final byte[] d(int param0) {
        if (param0 == 95) {
          if (this.field_s) {
            throw new RuntimeException();
          } else {
            return this.field_A;
          }
        } else {
          field_y = (String[]) null;
          if (this.field_s) {
            throw new RuntimeException();
          } else {
            return this.field_A;
          }
        }
    }

    final int c(boolean param0) {
        if (!param0) {
          if (this.field_s) {
            return 0;
          } else {
            return 100;
          }
        } else {
          sk.a(16, 86);
          if (this.field_s) {
            return 0;
          } else {
            return 100;
          }
        }
    }

    public static void f(int param0) {
        field_y = null;
        if (param0 != 100) {
          sk.a(-127, -122);
          field_B = null;
          field_z = null;
          field_C = null;
          return;
        } else {
          field_B = null;
          field_z = null;
          field_C = null;
          return;
        }
    }

    sk() {
    }

    static {
        field_y = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_C = "Pause the game";
    }
}
