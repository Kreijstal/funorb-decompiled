/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static vh field_b;
    static String field_d;
    static tf field_a;
    static tf[] field_c;

    final static ak a(int param0) {
        if (param0 != 0) {
            return (ak) null;
        }
        return jm.field_b.field_Fb;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$25 = 0;
        int fieldTemp$26 = 0;
        int fieldTemp$27 = 0;
        int fieldTemp$28 = 0;
        int fieldTemp$29 = 0;
        byte[] var2_ref_byte__ = null;
        int var2 = 0;
        byte[] var3 = null;
        if (100 == param1) {
          if (0 >= fb.field_Hb) {
            L0: {
              if ((param1 ^ -1) != param0) {
                break L0;
              } else {
                if (fa.field_c <= 0) {
                  break L0;
                } else {
                  fieldTemp$25 = fa.field_c - 1;
                  fa.field_c = fa.field_c - 1;
                  var2_ref_byte__ = db.field_S[fieldTemp$25];
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
                    if (param1 == an.field_c[var2]) {
                      if (f.field_p[var2] > 0) {
                        f.field_p[var2] = f.field_p[var2] - 1;
                        var3 = jd.field_o[var2][f.field_p[var2] - 1];
                        jd.field_o[var2][f.field_p[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L1;
                      }
                    } else {
                      var2++;
                      continue L1;
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
                      if (param1 == an.field_c[var2]) {
                        if (f.field_p[var2] > 0) {
                          f.field_p[var2] = f.field_p[var2] - 1;
                          var3 = jd.field_o[var2][f.field_p[var2] - 1];
                          jd.field_o[var2][f.field_p[var2]] = null;
                          return var3;
                        } else {
                          var2++;
                          continue L2;
                        }
                      } else {
                        var2++;
                        continue L2;
                      }
                    } else {
                      return new byte[param1];
                    }
                  }
                } else {
                  return new byte[param1];
                }
              } else {
                fieldTemp$26 = jd.field_n - 1;
                jd.field_n = jd.field_n - 1;
                var2_ref_byte__ = pc.field_w[fieldTemp$26];
                pc.field_w[jd.field_n] = null;
                return var2_ref_byte__;
              }
            }
          } else {
            fieldTemp$27 = fb.field_Hb - 1;
            fb.field_Hb = fb.field_Hb - 1;
            var2_ref_byte__ = sc.field_e[fieldTemp$27];
            sc.field_e[fb.field_Hb] = null;
            return var2_ref_byte__;
          }
        } else {
          L3: {
            if ((param1 ^ -1) != param0) {
              break L3;
            } else {
              if (fa.field_c <= 0) {
                break L3;
              } else {
                fieldTemp$28 = fa.field_c - 1;
                fa.field_c = fa.field_c - 1;
                var2_ref_byte__ = db.field_S[fieldTemp$28];
                db.field_S[fa.field_c] = null;
                return var2_ref_byte__;
              }
            }
          }
          if (param1 != 30000) {
            if (null != jd.field_o) {
              var2 = 0;
              L4: while (true) {
                if (an.field_c.length > var2) {
                  if (param1 == an.field_c[var2]) {
                    if (f.field_p[var2] > 0) {
                      f.field_p[var2] = f.field_p[var2] - 1;
                      var3 = jd.field_o[var2][f.field_p[var2] - 1];
                      jd.field_o[var2][f.field_p[var2]] = null;
                      return var3;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
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
                L5: while (true) {
                  if (an.field_c.length > var2) {
                    if (param1 == an.field_c[var2]) {
                      if (f.field_p[var2] > 0) {
                        f.field_p[var2] = f.field_p[var2] - 1;
                        var3 = jd.field_o[var2][f.field_p[var2] - 1];
                        jd.field_o[var2][f.field_p[var2]] = null;
                        return var3;
                      } else {
                        var2++;
                        continue L5;
                      }
                    } else {
                      var2++;
                      continue L5;
                    }
                  } else {
                    return new byte[param1];
                  }
                }
              } else {
                return new byte[param1];
              }
            } else {
              fieldTemp$29 = jd.field_n - 1;
              jd.field_n = jd.field_n - 1;
              var2_ref_byte__ = pc.field_w[fieldTemp$29];
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
        field_b = new vh();
        field_d = "If you are not, please change your password to something more obscure!";
    }
}
