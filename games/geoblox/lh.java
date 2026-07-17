/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static la field_b;
    static boolean field_d;
    static String field_a;
    static String field_c;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (param0 <= -78) {
          L0: {
            if (null == pb.field_t.g(0)) {
              break L0;
            } else {
              var1 = kj.field_J;
              if (var1 == 0) {
                eh.field_c = eh.field_c - 1;
                if (eh.field_c > -10 - (tl.field_h - 480)) {
                  break L0;
                } else {
                  h.field_d = 0;
                  kj.field_J = 1;
                  return;
                }
              } else {
                if (var1 == 1) {
                  int fieldTemp$6 = h.field_d;
                  h.field_d = h.field_d + 1;
                  if (fieldTemp$6 > 450) {
                    kj.field_J = 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (var1 != 2) {
                    break L0;
                  } else {
                    int fieldTemp$7 = eh.field_c;
                    eh.field_c = eh.field_c + 1;
                    if (fieldTemp$7 <= 480) {
                      break L0;
                    } else {
                      hf discarded$8 = pb.field_t.b((byte) -118);
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
            if (var1 == 0) {
              eh.field_c = eh.field_c - 1;
              if (eh.field_c > -10 - (tl.field_h - 480)) {
                return;
              } else {
                h.field_d = 0;
                kj.field_J = 1;
                return;
              }
            } else {
              if (var1 == 1) {
                int fieldTemp$9 = h.field_d;
                h.field_d = h.field_d + 1;
                if (fieldTemp$9 <= 450) {
                  return;
                } else {
                  kj.field_J = 2;
                  return;
                }
              } else {
                if (var1 == 2) {
                  int fieldTemp$10 = eh.field_c;
                  eh.field_c = eh.field_c + 1;
                  if (fieldTemp$10 > 480) {
                    hf discarded$11 = pb.field_t.b((byte) -118);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Next";
        field_c = "Account created successfully!";
    }
}
