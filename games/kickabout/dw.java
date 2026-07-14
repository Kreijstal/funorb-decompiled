/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dw extends Exception {
    static String field_a;
    static kg[] field_d;
    static String field_f;
    static hd field_e;
    String field_c;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = null;
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + ea.field_a) / 2;
        int var3 = rb.field_Bb * rb.field_Bb;
        int var4 = -(param1 * param1) + var3;
        dn.field_Cb.a(true, 199, var2 + -(var4 * 199 / var3), 90, -210 + (on.field_f + -4));
        fp.field_p.a(true, 438, var4 * 438 / var3 + (202 + var2), 0, -124 + on.field_f);
        int var5 = 66 % ((73 - param0) / 52);
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Kickabout.field_G;
        if (param1 != 0) {
          dw.a(-109);
          if ((eq.field_d ^ -1) >= -1) {
            if (!la.a(100)) {
              L0: {
                var2 = 1;
                if (kl.field_h != null) {
                  break L0;
                } else {
                  if (!cv.field_e) {
                    break L0;
                  } else {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  }
                }
              }
              return;
            } else {
              L1: {
                var2 = 0;
                if (kl.field_h != null) {
                  break L1;
                } else {
                  if (!cv.field_e) {
                    break L1;
                  } else {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (kl.field_h == null) {
              e.field_m = gf.a(oo.field_c, param1 + 0, 480, 0, 640, 0);
              if (null != e.field_m) {
                var2 = 2;
                lp.a((java.awt.Canvas) (Object) e.field_m, (byte) -64);
                if (kl.field_h == null) {
                  if (!cv.field_e) {
                    return;
                  } else {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var2 = 3;
                if (kl.field_h == null) {
                  if (!cv.field_e) {
                    return;
                  } else {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              e.field_m = kl.field_h.b(30182);
              ar.a(500, 2);
              if (null != e.field_m) {
                var2 = 2;
                lp.a((java.awt.Canvas) (Object) e.field_m, (byte) -64);
                if (kl.field_h == null) {
                  if (!cv.field_e) {
                    return;
                  } else {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                var2 = 3;
                if (kl.field_h == null) {
                  if (cv.field_e) {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if ((eq.field_d ^ -1) >= -1) {
            if (!la.a(100)) {
              var2 = 1;
              if (kl.field_h == null) {
                if (cv.field_e) {
                  ba.a(param0, param1 + 6, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              var2 = 0;
              if (kl.field_h == null) {
                if (cv.field_e) {
                  ba.a(param0, param1 + 6, var2);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (kl.field_h == null) {
              e.field_m = gf.a(oo.field_c, param1 + 0, 480, 0, 640, 0);
              if (null == e.field_m) {
                L2: {
                  var2 = 3;
                  if (kl.field_h != null) {
                    break L2;
                  } else {
                    if (!cv.field_e) {
                      break L2;
                    } else {
                      ba.a(param0, param1 + 6, var2);
                      break L2;
                    }
                  }
                }
                return;
              } else {
                L3: {
                  var2 = 2;
                  lp.a((java.awt.Canvas) (Object) e.field_m, (byte) -64);
                  if (kl.field_h != null) {
                    break L3;
                  } else {
                    if (!cv.field_e) {
                      break L3;
                    } else {
                      ba.a(param0, param1 + 6, var2);
                      break L3;
                    }
                  }
                }
                return;
              }
            } else {
              e.field_m = kl.field_h.b(30182);
              ar.a(500, 2);
              if (null != e.field_m) {
                L4: {
                  var2 = 2;
                  lp.a((java.awt.Canvas) (Object) e.field_m, (byte) -64);
                  if (kl.field_h != null) {
                    break L4;
                  } else {
                    if (!cv.field_e) {
                      break L4;
                    } else {
                      ba.a(param0, param1 + 6, var2);
                      break L4;
                    }
                  }
                }
                return;
              } else {
                var2 = 3;
                if (kl.field_h == null) {
                  if (cv.field_e) {
                    ba.a(param0, param1 + 6, var2);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    dw(String param0) {
        ((dw) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Menu";
        field_f = "Create a free Account";
        field_b = "posession";
    }
}
