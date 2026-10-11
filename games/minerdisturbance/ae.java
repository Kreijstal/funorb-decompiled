/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static java.security.SecureRandom field_d;
    static om field_a;
    static String field_b;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -67) {
          return;
        }
        field_d = null;
    }

    final boolean a(int param0) {
        if (param0 != 18544) {
          this.toString();
          if (this == nn.field_m) {
            return true;
          }
          if (wi.field_s != this) {
            return pb.field_c == this ? true : false;
          }
          return true;
        }
        if (this == nn.field_m) {
          return true;
        }
        if (wi.field_s == this) {
          return true;
        }
        if (pb.field_c != this) {
          return false;
        }
        return true;
    }

    static {
        field_b = "No highscores";
        field_c = 480;
    }
}
