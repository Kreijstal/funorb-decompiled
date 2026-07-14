/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends Exception {
    static String[] field_d;
    static int field_c;
    int field_b;
    static String field_a;

    final static void b(int param0) {
        ro.field_lb = null;
        bv.field_w = null;
        og.field_p = null;
        vs.field_e = null;
        jf.field_C = null;
        pr.field_g = null;
        kl.field_a = null;
        cq.field_u = null;
        if (param0 != -1) {
            ef.b(95);
        }
    }

    ef(int param0) {
        ((ef) this).field_b = param0;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6, String param7) {
        if (param1 > 24) {
          if (0 != we.field_f.field_yb) {
            if (!bb.field_a) {
              if (vi.field_d) {
                np.k(86);
                if (hf.field_c) {
                  ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
                  eu.field_g.a(true, param3);
                  if (param3) {
                    if (qf.field_e.field_yb == 0) {
                      if (-1 != ed.field_e.field_yb) {
                        rd.b(8445);
                        hf.field_c = false;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      hf.field_c = false;
                      if (-1 != ed.field_e.field_yb) {
                        rd.b(8445);
                        hf.field_c = false;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                hf.field_c = true;
                if (hf.field_c) {
                  ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
                  eu.field_g.a(true, param3);
                  if (param3) {
                    if (qf.field_e.field_yb == 0) {
                      if (-1 != ed.field_e.field_yb) {
                        rd.b(8445);
                        hf.field_c = false;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      hf.field_c = false;
                      if (-1 != ed.field_e.field_yb) {
                        rd.b(8445);
                        hf.field_c = false;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (hf.field_c) {
                ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
                eu.field_g.a(true, param3);
                if (param3) {
                  if (qf.field_e.field_yb != 0) {
                    hf.field_c = false;
                    if (-1 != ed.field_e.field_yb) {
                      rd.b(8445);
                      hf.field_c = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L0: {
                      if (-1 == ed.field_e.field_yb) {
                        break L0;
                      } else {
                        rd.b(8445);
                        hf.field_c = false;
                        break L0;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (hf.field_c) {
              ts.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
              eu.field_g.a(true, param3);
              if (param3) {
                if (qf.field_e.field_yb == 0) {
                  if (-1 == ed.field_e.field_yb) {
                    return;
                  } else {
                    rd.b(8445);
                    hf.field_c = false;
                    return;
                  }
                } else {
                  hf.field_c = false;
                  if (-1 != ed.field_e.field_yb) {
                    rd.b(8445);
                    hf.field_c = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = 83;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Loading...";
    }
}
