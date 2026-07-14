/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static am field_f;
    static ll[] field_e;
    static qb[] field_c;
    static String field_h;
    static String field_i;
    static String field_d;
    static lb field_a;
    static dn field_b;
    static int field_g;

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (mn.field_r != si.field_g) {
          L0: {
            if (ij.b(si.field_g, 10)) {
              tl.field_f[si.field_g].d((byte) 103);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var1 = si.field_g;
            si.field_g = mn.field_r;
            cb.field_b = io.field_A;
            km.field_c = 0;
            if (0 != (si.field_g ^ -1)) {
              break L1;
            } else {
              if (5 != var1) {
                break L1;
              } else {
                if (null != jb.field_z) {
                  jb.field_z.field_z = jb.field_z.field_z - (250 + -o.field_s);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            L3: {
              if (si.field_g == -1) {
                break L3;
              } else {
                if (3 == si.field_g) {
                  break L3;
                } else {
                  if (-1 == si.field_g) {
                    break L3;
                  } else {
                    if (-2 == si.field_g) {
                      break L3;
                    } else {
                      if (4 == (si.field_g ^ -1)) {
                        break L3;
                      } else {
                        if ((si.field_g ^ -1) == 2) {
                          break L3;
                        } else {
                          if (si.field_g != -15) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var2 = 1;
            L4: while (true) {
              if (var2 >= wm.field_H.length) {
                break L2;
              } else {
                wm.field_H[var2] = null;
                var2++;
                continue L4;
              }
            }
          }
          L5: {
            if (-4 == si.field_g) {
              o.field_s = 0;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (si.field_g != 5) {
              break L6;
            } else {
              o.field_s = 0;
              break L6;
            }
          }
          L7: {
            if (-1 == si.field_g) {
              o.field_s = 0;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (0 != si.field_g) {
              break L8;
            } else {
              vl.d((byte) 112);
              break L8;
            }
          }
          L9: {
            if (fi.field_h) {
              L10: {
                L11: {
                  if (null != jb.field_z) {
                    break L11;
                  } else {
                    if (r.field_b != null) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                mi.a(jh.field_c[0], 3);
                break L10;
              }
              r.field_b = null;
              jb.field_z = null;
              System.gc();
              fi.field_h = false;
              break L9;
            } else {
              break L9;
            }
          }
          L12: {
            if (!tn.field_Cb) {
              break L12;
            } else {
              wh.field_h = new vn();
              tn.field_Cb = false;
              ad.field_f = new int[8];
              break L12;
            }
          }
          if (param0 == 80) {
            L13: {
              if (!wa.field_Kb) {
                break L13;
              } else {
                ho.a(0);
                rn.i((byte) -123);
                qn.i(param0 ^ 110);
                wa.field_Kb = false;
                break L13;
              }
            }
            pm.field_c = (int)(480.0 * Math.random());
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != -15) {
            return;
        }
        field_h = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_i = null;
    }

    final static void b(int param0) {
        if (param0 != -4) {
            field_d = null;
        }
        dg.d((byte) -74);
        jo.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new am();
        field_h = "Buying or selling an account";
        field_d = "Spell types 1/2:";
        field_i = "This entry doesn't match";
    }
}
