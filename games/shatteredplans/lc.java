/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc {
    static gq field_b;
    static String field_d;
    static volatile int field_c;
    static String field_a;

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(param1 >>> -1215982463 & -715827883);
        param1 = ((-858993460 & param1) >>> 906798786) + (param1 & 858993459);
        param1 = 252645135 & param1 + (param1 >>> -1914941756);
        param1 = param1 + (param1 >>> -316234392);
        if (param0 != 12330) {
          field_d = null;
          param1 = param1 + (param1 >>> 432933744);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 432933744);
          return param1 & 255;
        }
    }

    final static String a(int param0, byte param1, String param2) {
        if (param1 <= -60) {
          if (param0 != 1) {
            if (-3 != (param0 ^ -1)) {
              if (3 == param0) {
                return re.a(fa.field_Y, 4371, new String[1]);
              } else {
                if (4 != param0) {
                  if (-6 != (param0 ^ -1)) {
                    if (6 == param0) {
                      return re.a(lh.field_E, 4371, new String[1]);
                    } else {
                      if (7 == param0) {
                        return re.a(kq.field_i, 4371, new String[1]);
                      } else {
                        if (-9 == (param0 ^ -1)) {
                          return re.a(cq.field_F, 4371, new String[1]);
                        } else {
                          if (11 == param0) {
                            return re.a(s.field_b, 4371, new String[1]);
                          } else {
                            if (-13 == param0) {
                              return re.a(ja.field_l, 4371, new String[1]);
                            } else {
                              if (-14 == param0) {
                                return re.a(sa.field_c, 4371, new String[1]);
                              } else {
                                return null;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return re.a(eh.field_N, 4371, new String[1]);
                  }
                } else {
                  return re.a(vn.field_p, 4371, new String[1]);
                }
              }
            } else {
              return re.a(p.field_y, 4371, new String[1]);
            }
          } else {
            return re.a(ea.field_e, 4371, new String[1]);
          }
        } else {
          return null;
        }
    }

    final static void b(int param0) {
        Object var2 = null;
        if (param0 <= -63) {
          if (js.field_j != -aj.field_c + 0) {
            if (250 + -aj.field_c == js.field_j) {
              js.field_j = js.field_j + 1;
              return;
            } else {
              js.field_j = js.field_j + 1;
              return;
            }
          } else {
            js.field_j = js.field_j + 1;
            return;
          }
        } else {
          var2 = null;
          String discarded$4 = lc.a(-68, (byte) 83, (String) null);
          if (js.field_j != -aj.field_c + 0) {
            if (250 + -aj.field_c == js.field_j) {
              js.field_j = js.field_j + 1;
              return;
            } else {
              js.field_j = js.field_j + 1;
              return;
            }
          } else {
            js.field_j = js.field_j + 1;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    abstract ci a(int param0);

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click to hide the Fleet Info window.";
        field_b = new gq(11, 0, 1, 2);
        field_c = 0;
        field_a = "Kick";
    }
}
