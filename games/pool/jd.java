/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static boolean field_a;
    static int[] field_h;
    static int field_b;
    static String field_i;
    static String field_j;
    static String field_f;
    static String field_e;
    static int field_d;
    static vb field_c;
    int field_g;

    final static String a(int param0, String param1, int param2) {
        CharSequence var6 = (CharSequence) (Object) param1;
        if (!gj.a(param2 ^ -25906, var6)) {
            return p.field_g;
        }
        if (!(!or.a((byte) 3, param1))) {
            return fn.field_Qb;
        }
        if (!(th.field_a == 2)) {
            return rl.field_j;
        }
        if (ia.a(param1, 24552)) {
            return nr.a(new String[1], -1, mg.field_b);
        }
        if (!(-101 < (gi.field_t ^ -1))) {
            return ci.field_a;
        }
        if (!(!lq.a(param1, -1))) {
            return nr.a(new String[1], -1, gf.field_f);
        }
        oq var5 = ej.field_j;
        var5.b(false, param0);
        var5.field_v = var5.field_v + 1;
        int var4 = var5.field_v;
        var5.a(param2, false);
        var5.a(param2 + -9948, param1);
        var5.b(var5.field_v + -var4, true);
        return null;
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_j = null;
        field_c = null;
        field_h = null;
        field_f = null;
        if (param0 < 47) {
            Object var2 = null;
            boolean discarded$0 = jd.a((byte) 35, (String) null, (String) null);
        }
    }

    final static String a(int param0) {
        if (!nn.field_d) {
          if (wp.field_c <= jo.field_J) {
            if (wp.field_c + ji.field_d <= jo.field_J) {
              if (param0 == 9383) {
                return null;
              } else {
                field_h = null;
                return null;
              }
            } else {
              return pj.field_I;
            }
          } else {
            if (param0 == 9383) {
              return null;
            } else {
              field_h = null;
              return null;
            }
          }
        } else {
          if (param0 == 9383) {
            return null;
          } else {
            field_h = null;
            return null;
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        Object var4 = null;
        if (qa.a(1, param2)) {
          return false;
        } else {
          if (!bm.a(param2, -106)) {
            if (!gh.a(param2, 28350)) {
              if (param0 < -24) {
                if (0 != param1.length()) {
                  if (!hq.a(param2, param1, 17924)) {
                    if (!co.a(param1, (byte) -111, param2)) {
                      if (wg.a(23138, param1, param2)) {
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
                  return true;
                }
              } else {
                var4 = null;
                boolean discarded$4 = jd.a((byte) 61, (String) null, (String) null);
                if (0 != param1.length()) {
                  if (!hq.a(param2, param1, 17924)) {
                    if (!co.a(param1, (byte) -111, param2)) {
                      if (wg.a(23138, param1, param2)) {
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
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static eg[] a(int param0, eg param1) {
        int[] var2 = null;
        d.a(param1, -23109);
        var2 = new int[]{3, 1, 1};
        if (param0 <= 65) {
          field_b = 76;
          ie.a(-2656, var2, param1);
          return cm.a(param1, var2, true);
        } else {
          ie.a(-2656, var2, param1);
          return cm.a(param1, var2, true);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 == 1164778608) {
          if (param0 >= param2) {
            return bo.b(-65536, (param2 << -2089708176) / param0);
          } else {
            return 2048 + -bo.b(-65536, (param0 << 1164778608) / param2);
          }
        } else {
          field_h = null;
          if (param0 >= param2) {
            return bo.b(-65536, (param2 << -2089708176) / param0);
          } else {
            return 2048 + -bo.b(-65536, (param0 << 1164778608) / param2);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{1000, 1100};
        field_i = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = "Shortcut Reference";
        field_f = "Cue can't go there!";
        field_b = -1;
        field_e = "Scamming";
    }
}
