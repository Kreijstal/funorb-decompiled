/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    static String field_a;
    static int field_e;
    static ll[] field_d;
    static String field_b;
    static sn field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3 = 0;
        ul.field_h = false;
        u.field_k = false;
        if (null != vf.field_k) {
          if (vf.field_k.field_G) {
            L0: {
              var3 = 1;
              if (param1 == 8) {
                L1: {
                  if (hk.field_s) {
                    param2 = nj.field_f;
                    break L1;
                  } else {
                    param2 = ul.field_v;
                    break L1;
                  }
                }
                param1 = 2;
                wh.field_f.a(26152, ge.field_g);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              if (10 == param1) {
                var3 = 0;
                ma.h(-90);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (ul.field_h) {
                    param2 = tj.a(114, new String[1], wa.field_Eb);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!di.field_h) {
                    break L5;
                  } else {
                    param2 = si.field_n;
                    break L5;
                  }
                }
                vf.field_k.a(true, param2, param1);
                break L3;
              }
            }
            if (param1 != -257) {
              if (-11 != param1) {
                if (hk.field_s) {
                  if (!param0) {
                    field_b = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  wh.field_f.f(true);
                  if (!param0) {
                    field_b = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (!param0) {
                  field_b = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!param0) {
                field_b = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (!param0) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (!param0) {
            field_b = null;
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
        field_e = 50;
        field_b = "Minimap";
    }
}
