/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static ti field_b;
    static int field_e;
    static tf field_d;
    static hh field_a;
    static String[] field_c;

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        cl.field_A = 0;
        re.field_y = null;
        wj.field_j = null;
        var2 = c.field_b;
        c.field_b = ne.field_b;
        if (param1 != 51) {
          if (param1 != 50) {
            oh.field_h.field_k = 1;
            ne.field_b = var2;
            oh.field_h.field_p = oh.field_h.field_p + 1;
            if (oh.field_h.field_p < 2) {
              L0: {
                if (oh.field_h.field_p < param0) {
                  break L0;
                } else {
                  if (param1 != 50) {
                    break L0;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > oh.field_h.field_p) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                L1: {
                  if (oh.field_h.field_p < param0) {
                    break L1;
                  } else {
                    if (param1 != 50) {
                      break L1;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > oh.field_h.field_p) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            oh.field_h.field_k = 5;
            ne.field_b = var2;
            oh.field_h.field_p = oh.field_h.field_p + 1;
            if (oh.field_h.field_p < 2) {
              L2: {
                if (oh.field_h.field_p < param0) {
                  break L2;
                } else {
                  if (param1 != 50) {
                    break L2;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 > oh.field_h.field_p) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                L3: {
                  if (oh.field_h.field_p < param0) {
                    break L3;
                  } else {
                    if (param1 != 50) {
                      break L3;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > oh.field_h.field_p) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          oh.field_h.field_k = 2;
          ne.field_b = var2;
          oh.field_h.field_p = oh.field_h.field_p + 1;
          if (oh.field_h.field_p >= 2) {
            if (param1 == 51) {
              return 2;
            } else {
              if (oh.field_h.field_p >= param0) {
                if (param1 != 50) {
                  if (4 > oh.field_h.field_p) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              } else {
                if (4 > oh.field_h.field_p) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (oh.field_h.field_p >= param0) {
              if (param1 == 50) {
                return 5;
              } else {
                if (4 > oh.field_h.field_p) {
                  return -1;
                } else {
                  return 1;
                }
              }
            } else {
              if (4 > oh.field_h.field_p) {
                return -1;
              } else {
                return 1;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        ia var1 = null;
        if (param0 <= 3) {
          return;
        } else {
          L0: {
            var1 = (ia) (Object) kk.field_f.a(-9424);
            if (var1 == null) {
              var1 = new ia();
              break L0;
            } else {
              break L0;
            }
          }
          var1.a(sb.field_g, sb.field_b, sb.field_f, sb.field_d, sb.field_c, sb.field_e, 6, sb.field_h);
          uj.field_c.a((wf) (Object) var1, -109);
          return;
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var1 = jk.l(-889);
        var2 = ba.a((byte) 101);
        kf.field_i.a(var1 - -(tj.field_y << 1), qa.field_u - dg.field_b, -tj.field_y + ic.field_b, (byte) 110, (dg.field_b << 1) + var2);
        hd.a((byte) 8);
        if (param0) {
          field_e = 33;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_c = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_d = new tf(1, 2, 2, 0);
    }
}
