/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static pb[][] field_a;

    final static void a(byte param0, float param1, String param2) {
        am.field_i = param2;
        fg.field_K = param1;
        if (param0 >= -37) {
            Object var4 = null;
            boolean discarded$0 = rd.a(false, (String) null, (String) null);
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 >= -26) {
          var2 = null;
          boolean discarded$2 = rd.a((String) null, 105);
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        if (param0 != null) {
          if (param0.length() >= dl.field_G) {
            if (param0.length() > ce.field_d) {
              return true;
            } else {
              var2 = 29 % ((-74 - param1) / 46);
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        if (param0) {
          if (!lg.a(-117, param1)) {
            if (!fl.a(param1, (byte) 19)) {
              if (!rd.a(param1, -122)) {
                if (param2.length() == 0) {
                  return true;
                } else {
                  if (!rb.a(param1, -56, param2)) {
                    if (ji.a(param1, 95, param2)) {
                      return false;
                    } else {
                      if (mb.a(param1, (byte) 122, param2)) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
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
          rd.a((byte) 49);
          if (!lg.a(-117, param1)) {
            if (!fl.a(param1, (byte) 19)) {
              if (!rd.a(param1, -122)) {
                if (param2.length() == 0) {
                  return true;
                } else {
                  if (!rb.a(param1, -56, param2)) {
                    if (ji.a(param1, 95, param2)) {
                      return false;
                    } else {
                      if (mb.a(param1, (byte) 122, param2)) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return false;
                  }
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Mega laser";
        field_a = new pb[8][32];
    }
}
