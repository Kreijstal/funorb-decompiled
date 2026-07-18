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
        field_d = null;
    }

    final boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 18544) {
          if (this != (Object) (Object) nn.field_m) {
            if ((Object) (Object) wi.field_s != this) {
              if ((Object) (Object) pb.field_c == this) {
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
          String discarded$5 = ((ae) this).toString();
          if (this != (Object) (Object) nn.field_m) {
            if ((Object) (Object) wi.field_s == this) {
              return true;
            } else {
              L0: {
                if ((Object) (Object) pb.field_c != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "No highscores";
        field_c = 480;
    }
}
