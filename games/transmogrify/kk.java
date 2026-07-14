/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk {
    static qj field_f;
    static ti[] field_d;
    static ci field_a;
    static we field_b;
    static String field_g;
    static String field_e;
    static String field_c;

    final static int a(int param0, int param1, int param2) {
        if (-225 >= (param1 ^ -1)) {
          if (param1 < 304) {
            L0: {
              if (-184 < (param2 ^ -1)) {
                break L0;
              } else {
                if ((param2 ^ -1) <= -215) {
                  break L0;
                } else {
                  return 0;
                }
              }
            }
            if (param1 >= param0) {
              if (416 > param1) {
                if (param2 <= -184) {
                  if (-215 > param2) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            if (param1 >= param0) {
              if (416 > param1) {
                if (param2 <= -184) {
                  if (-215 <= param2) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        } else {
          if (param1 >= param0) {
            if (416 > param1) {
              if (param2 <= -184) {
                if (-215 <= param2) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    abstract nk a(int param0);

    public static void a(boolean param0) {
        if (param0) {
          kk.a(false);
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_f = null;
          field_g = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_f = null;
          field_g = null;
          return;
        }
    }

    abstract void a(byte param0, oa param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Music: ";
        field_f = new qj();
    }
}
