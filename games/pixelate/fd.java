/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static vh field_b;
    static String field_d;
    static tf field_a;
    static tf[] field_c;

    final static ak a(int param0) {
        return jm.field_b.field_Fb;
    }

    final synchronized static byte[] a(int param0, int param1) {
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 == param1) {
          if (0 >= fb.field_Hb) {
            L0: {
              if (param1 != 5000) {
                break L0;
              } else {
                if (fa.field_c <= 0) {
                  break L0;
                } else {
                  int fieldTemp$13 = fa.field_c - 1;
                  fa.field_c = fa.field_c - 1;
                  var2_ref_byte__ = db.field_S[fieldTemp$13];
                  db.field_S[fa.field_c] = null;
                  return var2_ref_byte__;
                }
              }
            }
            if (param1 != 30000) {
              if (null != jd.field_o) {
                var2 = 0;
                L1: while (true) {
                  if (an.field_c.length > var2) {
                    if (param1 != an.field_c[var2]) {
                      var2++;
                      var2++;
                      continue L1;
                    } else {
                      if (f.field_p[var2] > 0) {
                        f.field_p[var2] = f.field_p[var2] - 1;
                        var3 = jd.field_o[var2][f.field_p[var2] - 1];
                        jd.field_o[var2][f.field_p[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              if (0 >= jd.field_n) {
                if (null != jd.field_o) {
                  var2 = 0;
                  L2: while (true) {
                    if (an.field_c.length > var2) {
                      if (param1 != an.field_c[var2]) {
                        var2++;
                        var2++;
                        continue L2;
                      } else {
                        if (f.field_p[var2] > 0) {
                          f.field_p[var2] = f.field_p[var2] - 1;
                          var3 = jd.field_o[var2][f.field_p[var2] - 1];
                          jd.field_o[var2][f.field_p[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                int fieldTemp$14 = jd.field_n - 1;
                jd.field_n = jd.field_n - 1;
                var2_ref_byte__ = pc.field_w[fieldTemp$14];
                pc.field_w[jd.field_n] = null;
                return var2_ref_byte__;
              }
            }
          } else {
            int fieldTemp$15 = fb.field_Hb - 1;
            fb.field_Hb = fb.field_Hb - 1;
            var2_ref_byte__ = sc.field_e[fieldTemp$15];
            sc.field_e[fb.field_Hb] = null;
            return var2_ref_byte__;
          }
        } else {
          L3: {
            if (param1 != 5000) {
              break L3;
            } else {
              if (fa.field_c <= 0) {
                break L3;
              } else {
                int fieldTemp$16 = fa.field_c - 1;
                fa.field_c = fa.field_c - 1;
                var2_ref_byte__ = db.field_S[fieldTemp$16];
                db.field_S[fa.field_c] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param1 != 30000) {
            if (null != jd.field_o) {
              var2 = 0;
              if (an.field_c.length > var2) {
                if (param1 == an.field_c[var2]) {
                  if (f.field_p[var2] > 0) {
                    f.field_p[var2] = f.field_p[var2] - 1;
                    var3 = jd.field_o[var2][f.field_p[var2] - 1];
                    jd.field_o[var2][f.field_p[var2]] = null;
                    return var3;
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              return new byte[param1];
            }
          } else {
            if (0 >= jd.field_n) {
              if (null != jd.field_o) {
                var2 = 0;
                if (an.field_c.length > var2) {
                  if (param1 == an.field_c[var2]) {
                    if (f.field_p[var2] > 0) {
                      f.field_p[var2] = f.field_p[var2] - 1;
                      var3 = jd.field_o[var2][f.field_p[var2] - 1];
                      jd.field_o[var2][f.field_p[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      var2++;
                      var2++;
                      var2++;
                      return new byte[param1];
                    }
                  } else {
                    var2++;
                    var2++;
                    var2++;
                    var2++;
                    return new byte[param1];
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                return new byte[param1];
              }
            } else {
              int fieldTemp$17 = jd.field_n - 1;
              jd.field_n = jd.field_n - 1;
              var2_ref_byte__ = pc.field_w[fieldTemp$17];
              pc.field_w[jd.field_n] = null;
              return var2_ref_byte__;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -24465) {
          fd.b(119);
          field_d = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vh();
        field_d = "If you are not, please change your password to something more obscure!";
    }
}
