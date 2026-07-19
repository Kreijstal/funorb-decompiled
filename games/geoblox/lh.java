/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static la field_b;
    static boolean field_d;
    static String field_a;
    static String field_c;

    final static void a(int param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        hf discarded$8 = null;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        hf discarded$11 = null;
        int var1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (param0 <= -78) {
          L0: {
            if (null == pb.field_t.g(0)) {
              break L0;
            } else {
              var1 = kj.field_J;
              if (-1 == (var1 ^ -1)) {
                eh.field_c = eh.field_c - 1;
                if (eh.field_c > -10 - (tl.field_h - 480)) {
                  break L0;
                } else {
                  h.field_d = 0;
                  kj.field_J = 1;
                  return;
                }
              } else {
                if ((var1 ^ -1) == -2) {
                  fieldTemp$6 = h.field_d;
                  h.field_d = h.field_d + 1;
                  if (-451 > (fieldTemp$6 ^ -1)) {
                    kj.field_J = 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if ((var1 ^ -1) != -3) {
                    break L0;
                  } else {
                    fieldTemp$7 = eh.field_c;
                    eh.field_c = eh.field_c + 1;
                    if ((fieldTemp$7 ^ -1) >= -481) {
                      break L0;
                    } else {
                      discarded$8 = pb.field_t.b((byte) -118);
                      gf.a((byte) -12);
                      return;
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          lh.b(-5);
          if (null != pb.field_t.g(0)) {
            var1 = kj.field_J;
            if (-1 == (var1 ^ -1)) {
              eh.field_c = eh.field_c - 1;
              if (eh.field_c > -10 - (tl.field_h - 480)) {
                return;
              } else {
                h.field_d = 0;
                kj.field_J = 1;
                return;
              }
            } else {
              if ((var1 ^ -1) == -2) {
                fieldTemp$9 = h.field_d;
                h.field_d = h.field_d + 1;
                if (-451 <= (fieldTemp$9 ^ -1)) {
                  return;
                } else {
                  kj.field_J = 2;
                  return;
                }
              } else {
                if ((var1 ^ -1) == -3) {
                  fieldTemp$10 = eh.field_c;
                  eh.field_c = eh.field_c + 1;
                  if ((fieldTemp$10 ^ -1) < -481) {
                    discarded$11 = pb.field_t.b((byte) -118);
                    gf.a((byte) -12);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -481) {
            lh.a(90);
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_a = "Next";
        field_c = "Account created successfully!";
    }
}
