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
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if ((mn.field_r ^ -1) != (si.field_g ^ -1)) {
              L1: {
                if (ij.b(si.field_g, 10)) {
                  tl.field_f[si.field_g].d((byte) 103);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var1_int = si.field_g;
                si.field_g = mn.field_r;
                cb.field_b = io.field_A;
                km.field_c = 0;
                if (0 != (si.field_g ^ -1)) {
                  break L2;
                } else {
                  if (5 != var1_int) {
                    break L2;
                  } else {
                    if (null != jb.field_z) {
                      jb.field_z.field_z = jb.field_z.field_z - (250 + -o.field_s);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  if ((si.field_g ^ -1) == -1) {
                    break L4;
                  } else {
                    if (3 == (si.field_g ^ -1)) {
                      break L4;
                    } else {
                      if (-1 == si.field_g) {
                        break L4;
                      } else {
                        if (-2 == si.field_g) {
                          break L4;
                        } else {
                          if (4 == (si.field_g ^ -1)) {
                            break L4;
                          } else {
                            if ((si.field_g ^ -1) == 2) {
                              break L4;
                            } else {
                              if ((si.field_g ^ -1) != -15) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2 = 1;
                L5: while (true) {
                  if ((var2 ^ -1) <= (wm.field_H.length ^ -1)) {
                    break L3;
                  } else {
                    wm.field_H[var2] = null;
                    var2++;
                    continue L5;
                  }
                }
              }
              L6: {
                if (-4 == (si.field_g ^ -1)) {
                  o.field_s = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (si.field_g != 5) {
                  break L7;
                } else {
                  o.field_s = 0;
                  break L7;
                }
              }
              L8: {
                if (-1 == si.field_g) {
                  o.field_s = 0;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (0 != si.field_g) {
                  break L9;
                } else {
                  vl.d((byte) 112);
                  break L9;
                }
              }
              L10: {
                if (fi.field_h) {
                  L11: {
                    L12: {
                      if (null != jb.field_z) {
                        break L12;
                      } else {
                        if (r.field_b != null) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    mi.a(jh.field_c[0], 3);
                    break L11;
                  }
                  r.field_b = null;
                  jb.field_z = null;
                  System.gc();
                  fi.field_h = false;
                  break L10;
                } else {
                  break L10;
                }
              }
              L13: {
                if (!tn.field_Cb) {
                  break L13;
                } else {
                  wh.field_h = new vn();
                  tn.field_Cb = false;
                  ad.field_f = new int[8];
                  break L13;
                }
              }
              if (param0 == 80) {
                L14: {
                  if (!wa.field_Kb) {
                    break L14;
                  } else {
                    ho.a(0);
                    rn.i((byte) -123);
                    qn.i(param0 ^ 110);
                    wa.field_Kb = false;
                    break L14;
                  }
                }
                pm.field_c = (int)(480.0 * Math.random());
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "lf.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
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
            field_d = (String) null;
        }
        dg.d((byte) -74);
        jo.a(true);
    }

    static {
        field_f = new am();
        field_h = "Buying or selling an account";
        field_d = "Spell types 1/2:";
        field_i = "This entry doesn't match";
    }
}
