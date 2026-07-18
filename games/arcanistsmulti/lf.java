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

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (~mn.field_r != ~si.field_g) {
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
                if (si.field_g != -1) {
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
                  if (si.field_g == 0) {
                    break L4;
                  } else {
                    if (si.field_g == -4) {
                      break L4;
                    } else {
                      if (-1 == si.field_g) {
                        break L4;
                      } else {
                        if (-2 == si.field_g) {
                          break L4;
                        } else {
                          if (si.field_g == -5) {
                            break L4;
                          } else {
                            if (si.field_g == -3) {
                              break L4;
                            } else {
                              if (si.field_g != 14) {
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
                  if (~var2 <= ~wm.field_H.length) {
                    break L3;
                  } else {
                    wm.field_H[var2] = null;
                    var2++;
                    continue L5;
                  }
                }
              }
              L6: {
                if (si.field_g == 3) {
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
                  int discarded$2 = 112;
                  vl.d();
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
                    int discarded$3 = 3;
                    mi.a(jh.field_c[0]);
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
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "lf.A(" + 80 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_h = null;
        field_c = null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_i = null;
    }

    final static void b() {
        int discarded$0 = -74;
        dg.d();
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
