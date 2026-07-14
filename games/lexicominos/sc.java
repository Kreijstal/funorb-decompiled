/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_f;
    static int field_b;
    static wh field_d;
    static String field_a;
    static boolean field_e;
    static int field_g;
    static String field_c;

    final static void a(int param0, byte param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        gb.field_d = false;
        dl.field_g = false;
        var3 = 38 / ((-9 - param1) / 61);
        if (null != jj.field_a) {
          if (jj.field_a.field_D) {
            L0: {
              var4 = 1;
              if (param0 == 8) {
                L1: {
                  param0 = 2;
                  if (!ca.field_k) {
                    param2 = l.field_C;
                    break L1;
                  } else {
                    param2 = fk.field_j;
                    break L1;
                  }
                }
                eb.field_b.a(3, dd.field_d);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              if ((param0 ^ -1) == -11) {
                var4 = 0;
                qf.g(-94);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4 != 0) {
                L4: {
                  if (!dl.field_g) {
                    break L4;
                  } else {
                    param2 = da.a(new String[1], Lexicominos.field_F, false);
                    break L4;
                  }
                }
                L5: {
                  if (!lh.field_w) {
                    break L5;
                  } else {
                    param2 = id.field_u;
                    break L5;
                  }
                }
                jj.field_a.a(-109, param0, param2);
                break L3;
              } else {
                break L3;
              }
            }
            if (-257 != (param0 ^ -1)) {
              if (param0 != 10) {
                if (ca.field_k) {
                  return;
                } else {
                  eb.field_b.d((byte) -100);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        g.field_n = param1;
        if (param0 >= -32) {
            return;
        }
        ec.field_c = param2;
        ea.field_b = param3;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = -110 / ((-24 - param0) / 45);
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Confirm Password: ";
        field_f = 0;
        field_e = false;
    }
}
