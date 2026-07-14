/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static int field_c;
    static ad field_s;
    int[] field_g;
    static boolean field_l;
    int field_n;
    static String field_q;
    String field_h;
    String field_i;
    boolean field_j;
    int field_k;
    km field_t;
    long field_p;
    String field_d;
    int field_e;
    static int[] field_o;
    static String field_f;
    static String[] field_b;
    int field_m;
    String field_r;
    int field_a;

    final int b(int param0) {
        if (!((cj) this).field_j) {
          if (2 == ((cj) this).field_n) {
            if ((((cj) this).field_e ^ -1) < -1) {
              return 2;
            } else {
              if (param0 == -6761) {
                if (((cj) this).field_p != hh.field_d) {
                  L0: {
                    if ((oa.field_q ^ -1) != -3) {
                      break L0;
                    } else {
                      if (!ch.a(((cj) this).field_i, (byte) -73)) {
                        break L0;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              } else {
                int discarded$2 = ((cj) this).b(-36);
                if (((cj) this).field_p != hh.field_d) {
                  L1: {
                    if ((oa.field_q ^ -1) != -3) {
                      break L1;
                    } else {
                      if (!ch.a(((cj) this).field_i, (byte) -73)) {
                        break L1;
                      } else {
                        return 1;
                      }
                    }
                  }
                  return 0;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param0 == -6761) {
              if (((cj) this).field_p != hh.field_d) {
                L2: {
                  if ((oa.field_q ^ -1) != -3) {
                    break L2;
                  } else {
                    if (!ch.a(((cj) this).field_i, (byte) -73)) {
                      break L2;
                    } else {
                      return 1;
                    }
                  }
                }
                return 0;
              } else {
                return 1;
              }
            } else {
              int discarded$3 = ((cj) this).b(-36);
              if (((cj) this).field_p != hh.field_d) {
                if ((oa.field_q ^ -1) == -3) {
                  if (ch.a(((cj) this).field_i, (byte) -73)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        int var2 = 0;
        if (param1.equals((Object) (Object) "B")) {
          return Byte.TYPE;
        } else {
          if (!param1.equals((Object) (Object) "I")) {
            if (!param1.equals((Object) (Object) "S")) {
              var2 = -46 % ((9 - param0) / 58);
              if (param1.equals((Object) (Object) "J")) {
                return Long.TYPE;
              } else {
                if (param1.equals((Object) (Object) "Z")) {
                  return Boolean.TYPE;
                } else {
                  if (!param1.equals((Object) (Object) "F")) {
                    if (!param1.equals((Object) (Object) "D")) {
                      if (param1.equals((Object) (Object) "C")) {
                        return Character.TYPE;
                      } else {
                        return Class.forName(param1);
                      }
                    } else {
                      return Double.TYPE;
                    }
                  } else {
                    return Float.TYPE;
                  }
                }
              }
            } else {
              return Short.TYPE;
            }
          } else {
            return Integer.TYPE;
          }
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_o = null;
        field_b = null;
        field_q = null;
        field_f = null;
        if (param0 >= -14) {
            field_l = false;
        }
    }

    cj(boolean param0) {
        ((cj) this).field_p = hk.field_Kb;
        ((cj) this).field_j = ea.field_b;
        ((cj) this).field_h = aa.field_f;
        ((cj) this).field_i = vl.field_k;
        ((cj) this).field_r = vc.field_hb;
        ((cj) this).field_n = td.field_h;
        ((cj) this).field_a = pl.field_b;
        if (param0) {
            ((cj) this).field_g = ne.field_e;
        } else {
            ((cj) this).field_g = null;
        }
        ((cj) this).field_d = pb.field_l;
        ((cj) this).field_k = ef.field_b;
        ((cj) this).field_m = eb.field_d;
        ((cj) this).field_e = va.field_b;
    }

    cj(int param0, String param1, int param2, String param3, String param4) {
        ((cj) this).field_i = param1;
        ((cj) this).field_e = 0;
        ((cj) this).field_g = null;
        ((cj) this).field_d = param3;
        ((cj) this).field_j = true;
        ((cj) this).field_h = param4;
        ((cj) this).field_p = 0L;
        ((cj) this).field_n = param0;
        ((cj) this).field_r = param1;
        ((cj) this).field_m = 0;
        ((cj) this).field_a = 0;
        ((cj) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Show chat (1 unread message)";
        field_o = new int[128];
        field_f = "Return to game";
    }
}
