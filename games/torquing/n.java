/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends ta {
    static String field_r;
    static int field_u;
    static int field_w;
    static int field_t;
    static String[] field_s;
    byte[] field_v;
    static volatile boolean field_x;
    static la field_q;

    public static void a(int param0) {
        field_s = null;
        field_r = null;
        field_q = null;
    }

    n(byte[] param0) {
        try {
            ((n) this).field_v = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        if (jg.field_t == null) {
          return -1;
        } else {
          if (param0 >= na.field_E) {
            if (param0 < na.field_E + jg.field_t.field_s) {
              if (we.field_h > param2) {
                if (param0 >= db.field_j) {
                  if (param0 < db.field_j - -jg.field_t.field_s) {
                    if (param2 >= nc.field_a) {
                      if (nc.field_a - -jg.field_t.field_t > param2) {
                        return 1;
                      } else {
                        field_x = true;
                        return -1;
                      }
                    } else {
                      field_x = true;
                      return -1;
                    }
                  } else {
                    field_x = true;
                    return -1;
                  }
                } else {
                  field_x = true;
                  return -1;
                }
              } else {
                if (jg.field_t.field_t + we.field_h <= param2) {
                  if (param0 >= db.field_j) {
                    if (param0 < db.field_j - -jg.field_t.field_s) {
                      if (param2 >= nc.field_a) {
                        if (nc.field_a - -jg.field_t.field_t > param2) {
                          return 1;
                        } else {
                          field_x = true;
                          return -1;
                        }
                      } else {
                        field_x = true;
                        return -1;
                      }
                    } else {
                      field_x = true;
                      return -1;
                    }
                  } else {
                    field_x = true;
                    return -1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param0 >= db.field_j) {
                if (param0 < db.field_j - -jg.field_t.field_s) {
                  if (param2 >= nc.field_a) {
                    if (nc.field_a - -jg.field_t.field_t <= param2) {
                      field_x = true;
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    field_x = true;
                    return -1;
                  }
                } else {
                  field_x = true;
                  return -1;
                }
              } else {
                field_x = true;
                return -1;
              }
            }
          } else {
            if (param0 >= db.field_j) {
              if (param0 < db.field_j - -jg.field_t.field_s) {
                if (param2 >= nc.field_a) {
                  if (nc.field_a - -jg.field_t.field_t <= param2) {
                    field_x = true;
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  field_x = true;
                  return -1;
                }
              } else {
                field_x = true;
                return -1;
              }
            } else {
              field_x = true;
              return -1;
            }
          }
        }
    }

    final static int c(byte param0) {
        return (int)(1000000000L / eg.field_u);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_t = 0;
        field_r = "Friends can be added in multiplayer<nbsp>games";
        field_s = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_x = false;
    }
}
