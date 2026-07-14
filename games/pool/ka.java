/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends ig {
    static int[] field_o;
    static int field_r;
    static String field_u;
    static String field_t;
    static byte[] field_s;
    static String field_n;
    static boolean field_p;
    static int field_q;
    static String field_m;

    final na a(String param0, boolean param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (ka.a(10, var4)) {
          var5 = (CharSequence) (Object) param0;
          var3 = kq.a((byte) 114, var5);
          if (param1) {
            if (var3 > 0) {
              if ((var3 ^ -1) < -131) {
                return gp.field_d;
              } else {
                return kr.field_e;
              }
            } else {
              return gp.field_d;
            }
          } else {
            field_s = null;
            if (var3 > 0) {
              if ((var3 ^ -1) < -131) {
                return gp.field_d;
              } else {
                return kr.field_e;
              }
            } else {
              return gp.field_d;
            }
          }
        } else {
          return gp.field_d;
        }
    }

    public static void b(boolean param0) {
        field_n = null;
        field_m = null;
        field_t = null;
        field_o = null;
        field_s = null;
        field_u = null;
        if (!param0) {
            field_m = null;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 10) {
            ka.a(false, 105);
            return na.a(10, true, param1, 87);
        }
        return na.a(10, true, param1, 87);
    }

    final static void a(boolean param0, int param1) {
        Object var2 = null;
        kf var2_ref = null;
        var2 = null;
        ec.field_b = param1;
        if (param0) {
          var2_ref = (kf) (Object) oj.field_o.c((byte) -36);
          L0: while (true) {
            if (var2_ref == null) {
              if (null != mp.field_R) {
                var2_ref = (kf) (Object) mp.field_R.c((byte) 113);
                L1: while (true) {
                  if (var2_ref != null) {
                    L2: {
                      if (var2_ref.field_m.b(-113)) {
                        var2_ref.field_o.d(128 + var2_ref.field_n * ec.field_b >> -1219814008);
                        break L2;
                      } else {
                        var2_ref.a((byte) -117);
                        break L2;
                      }
                    }
                    var2_ref = (kf) (Object) mp.field_R.f((byte) -5);
                    continue L1;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L3: {
                if (!var2_ref.field_m.b(-108)) {
                  var2_ref.a((byte) -117);
                  break L3;
                } else {
                  var2_ref.field_o.d(ec.field_b * var2_ref.field_n + 128 >> 1000803112);
                  break L3;
                }
              }
              var2_ref = (kf) (Object) oj.field_o.f((byte) -5);
              continue L0;
            }
          }
        } else {
          field_q = -113;
          var2_ref = (kf) (Object) oj.field_o.c((byte) -36);
          L4: while (true) {
            if (var2_ref == null) {
              L5: {
                if (null == mp.field_R) {
                  break L5;
                } else {
                  var2_ref = (kf) (Object) mp.field_R.c((byte) 113);
                  L6: while (true) {
                    if (var2_ref == null) {
                      break L5;
                    } else {
                      L7: {
                        if (var2_ref.field_m.b(-113)) {
                          var2_ref.field_o.d(128 + var2_ref.field_n * ec.field_b >> -1219814008);
                          break L7;
                        } else {
                          var2_ref.a((byte) -117);
                          break L7;
                        }
                      }
                      var2_ref = (kf) (Object) mp.field_R.f((byte) -5);
                      continue L6;
                    }
                  }
                }
              }
              return;
            } else {
              L8: {
                if (!var2_ref.field_m.b(-108)) {
                  var2_ref.a((byte) -117);
                  break L8;
                } else {
                  var2_ref.field_o.d(ec.field_b * var2_ref.field_n + 128 >> 1000803112);
                  break L8;
                }
              }
              var2_ref = (kf) (Object) oj.field_o.f((byte) -5);
              continue L4;
            }
          }
        }
    }

    final static void b(byte param0) {
        if (param0 <= -71) {
          if (fm.field_H) {
            qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
            e.field_a.a((byte) -79, false);
            return;
          } else {
            return;
          }
        } else {
          field_r = 25;
          if (!fm.field_H) {
            return;
          } else {
            qh.g(qh.field_b, qh.field_c, qh.field_j + -qh.field_b, qh.field_g + -qh.field_c);
            e.field_a.a((byte) -79, false);
            return;
          }
        }
    }

    final static void h(int param0) {
        int[] var4 = wa.field_ib;
        int[] var1 = var4;
        int var2 = param0;
        int var3 = var4.length;
        while (var3 > var2) {
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
            var2++;
            var4[var2] = 0;
        }
    }

    ka(sl param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        Object var4 = null;
        if (param1 == 0) {
          if (((ka) this).a(param0, true) != gp.field_d) {
            return null;
          } else {
            return sg.field_L;
          }
        } else {
          var4 = null;
          String discarded$5 = ((ka) this).a((String) null, -21);
          if (((ka) this).a(param0, true) != gp.field_d) {
            return null;
          } else {
            return sg.field_L;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[4];
        field_t = "This option cannot be combined with the current '<%0>' setting.";
        field_n = "Unable to add friend - system busy";
        field_u = "<%0>, which group do you want to play as?";
        field_m = "This password is part of your Player Name, and would be easy to guess";
        field_p = false;
    }
}
