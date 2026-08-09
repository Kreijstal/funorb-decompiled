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
        int stackIn_7_0 = 0;
        if (param0 == 18544) {
          if (this != nn.field_m) {
            if (wi.field_s != this) {
              if (pb.field_c == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          this.toString();
          if (this != nn.field_m) {
            if (wi.field_s == this) {
              return true;
            } else {
              L0: {
                if (pb.field_c != this) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    static {
        field_b = "No highscores";
        field_c = 480;
    }
}
