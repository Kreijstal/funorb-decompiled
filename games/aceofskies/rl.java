/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private la field_h;
    private int field_d;
    static rl field_b;
    int field_l;
    int field_f;
    static rl field_m;
    static rl field_c;
    static rl field_k;
    static rl field_j;
    static rl field_g;
    static rl field_n;
    static int field_e;
    static boolean field_p;
    static String field_i;
    static int[] field_a;
    static st field_o;

    final static rl a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        var2 = 49 / ((-9 - param1) / 45);
        var3 = param0;
        if (-1 != var3) {
          if (-2 != var3) {
            if (2 != var3) {
              if (-4 != (var3 ^ -1)) {
                if (4 != var3) {
                  if (var3 != 5) {
                    if ((var3 ^ -1) != -7) {
                      return null;
                    } else {
                      return field_n;
                    }
                  } else {
                    return field_g;
                  }
                } else {
                  return field_j;
                }
              } else {
                return field_k;
              }
            } else {
              return field_c;
            }
          } else {
            return field_m;
          }
        } else {
          return field_b;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        if (param0 != -12785) {
          return;
        } else {
          field_o = null;
          field_j = null;
          field_a = null;
          field_g = null;
          field_m = null;
          field_i = null;
          field_n = null;
          field_c = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1) {
        if (param0 != 4) {
            field_k = (rl) null;
            if (-6407 == (param1 ^ -1)) {
                return 1;
            }
            if (6409 == param1) {
                return 1;
            }
            if (param1 == 32841) {
                return 1;
            }
            if (param1 == 6410) {
                return 2;
            }
            if (param1 == -6408) {
                return 3;
            }
            if (!(-6409 != param1)) {
                return 4;
            }
            throw new IllegalArgumentException("");
        }
        if (-6407 == (param1 ^ -1)) {
            return 1;
        }
        if (6409 == param1) {
            return 1;
        }
        if (param1 == 32841) {
            return 1;
        }
        if (param1 == 6410) {
            return 2;
        }
        if (param1 == -6408) {
            return 3;
        }
        if (!(-6409 != param1)) {
            return 4;
        }
        throw new IllegalArgumentException("");
    }

    final static boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 == -21) {
          if (param1 >= param5) {
            if (param1 < param5 + param3) {
              if (param6 <= param2) {
                if (param6 + param4 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          rl discarded$6 = rl.a(122, (byte) -53);
          if (param1 >= param5) {
            if (param1 < param5 + param3) {
              if (param6 <= param2) {
                if (param6 + param4 <= param2) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(byte param0) {
        gg.b((byte) -98);
        nm.field_a = true;
        if (param0 != 0) {
          rl discarded$2 = rl.a(-83, (byte) 35);
          nf.field_a = true;
          vn.field_f.e((byte) 89);
          ua.a(wo.field_e, false, (byte) 104);
          return;
        } else {
          nf.field_a = true;
          vn.field_f.e((byte) 89);
          ua.a(wo.field_e, false, (byte) 104);
          return;
        }
    }

    private rl(int param0, int param1, la param2) {
        ((rl) this).field_h = param2;
        ((rl) this).field_f = param0;
        ((rl) this).field_d = param1;
        ((rl) this).field_l = ((rl) this).field_h.field_c * ((rl) this).field_d;
        if (((rl) this).field_f >= 16) {
            throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new rl(0, 3, la.field_i);
        field_m = new rl(1, 3, la.field_i);
        field_c = new rl(2, 4, la.field_h);
        field_k = new rl(3, 1, la.field_i);
        field_j = new rl(4, 2, la.field_i);
        field_g = new rl(5, 3, la.field_i);
        field_n = new rl(6, 4, la.field_i);
        field_e = ek.a((byte) 108, 16);
        field_p = false;
        field_i = "Unfortunately you are not eligible to create an account.";
        field_a = new int[4];
        field_o = new st();
    }
}
