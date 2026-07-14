/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    private boolean field_d;
    private int field_g;
    private int field_l;
    static String field_a;
    static int[] field_f;
    private int field_j;
    static volatile boolean field_h;
    static String field_k;
    private int field_c;
    private int field_e;
    static String field_b;
    static ri field_i;

    final void a(boolean param0) {
        ((hn) this).field_l = ((hn) this).field_l + 1;
        if (((hn) this).field_c < ((hn) this).field_l + 1) {
          if (!((hn) this).field_d) {
            if (((hn) this).field_d) {
              ((hn) this).field_l = 0;
              if (param0) {
                ((hn) this).field_e = 11;
                return;
              } else {
                return;
              }
            } else {
              ((hn) this).field_g = ((hn) this).field_g - 1;
              if (((hn) this).field_g - 1 >= ((hn) this).field_j) {
                ((hn) this).field_l = 0;
                if (param0) {
                  ((hn) this).field_e = 11;
                  return;
                } else {
                  return;
                }
              } else {
                ((hn) this).field_g = ((hn) this).field_e;
                ((hn) this).field_l = 0;
                if (!param0) {
                  return;
                } else {
                  ((hn) this).field_e = 11;
                  return;
                }
              }
            }
          } else {
            ((hn) this).field_g = ((hn) this).field_g + 1;
            if (((hn) this).field_g + 1 > ((hn) this).field_j) {
              ((hn) this).field_g = ((hn) this).field_e;
              ((hn) this).field_l = 0;
              if (param0) {
                ((hn) this).field_e = 11;
                return;
              } else {
                return;
              }
            } else {
              if (((hn) this).field_d) {
                ((hn) this).field_l = 0;
                if (!param0) {
                  return;
                } else {
                  ((hn) this).field_e = 11;
                  return;
                }
              } else {
                ((hn) this).field_g = ((hn) this).field_g - 1;
                if (((hn) this).field_g - 1 >= ((hn) this).field_j) {
                  ((hn) this).field_l = 0;
                  if (!param0) {
                    return;
                  } else {
                    ((hn) this).field_e = 11;
                    return;
                  }
                } else {
                  ((hn) this).field_g = ((hn) this).field_e;
                  ((hn) this).field_l = 0;
                  if (!param0) {
                    return;
                  } else {
                    ((hn) this).field_e = 11;
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (param0) {
            ((hn) this).field_e = 11;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_k = null;
        field_b = null;
        field_f = null;
        field_i = null;
        field_a = null;
    }

    hn(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((hn) this).field_j = param2;
        ((hn) this).field_e = param1;
        ((hn) this).field_c = param3;
        ((hn) this).field_d = ((hn) this).field_j > ((hn) this).field_e ? true : false;
        ((hn) this).field_g = ((hn) this).field_e;
    }

    final static int a(int param0, String param1, boolean param2) {
        Object var4 = null;
        if (param0 == 0) {
          if (!param2) {
            return uq.field_f.a(param1);
          } else {
            return m.field_C.a(param1);
          }
        } else {
          var4 = null;
          int discarded$5 = hn.a(-104, (String) null, false);
          if (!param2) {
            return uq.field_f.a(param1);
          } else {
            return m.field_C.a(param1);
          }
        }
    }

    final static ii a(byte param0) {
        if (param0 > -60) {
            field_f = null;
            return (ii) (Object) new aa();
        }
        return (ii) (Object) new aa();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot contain consecutive spaces";
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_h = false;
        field_b = "For those who know it all.";
    }
}
