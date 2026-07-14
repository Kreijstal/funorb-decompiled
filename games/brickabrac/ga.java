/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends nm {
    static jp[] field_k;
    static int field_i;
    static int field_j;
    static boolean[] field_l;

    public ga() {
    }

    final static void a(boolean param0, int param1) {
        if (ml.field_b > 0) {
          if (sc.field_c) {
            L0: {
              lb.b(0, 0, lb.field_c, gp.field_d.field_db);
              qp.field_f.a(true, param0);
              if (pe.field_j > 0) {
                break L0;
              } else {
                if (0 < eg.field_m) {
                  break L0;
                } else {
                  if (param1 < -106) {
                    return;
                  } else {
                    field_l = null;
                    return;
                  }
                }
              }
            }
            if (!hc.field_c) {
              if (param1 < -106) {
                return;
              } else {
                field_l = null;
                return;
              }
            } else {
              lb.b(0, 0, lb.field_c, gp.field_d.field_db);
              wi.field_j.a(true, param0);
              if (param1 < -106) {
                return;
              } else {
                field_l = null;
                return;
              }
            }
          } else {
            if (pe.field_j <= 0) {
              if (0 >= eg.field_m) {
                if (param1 >= -106) {
                  field_l = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (!hc.field_c) {
                  if (param1 >= -106) {
                    field_l = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                  wi.field_j.a(true, param0);
                  if (param1 >= -106) {
                    field_l = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (!hc.field_c) {
                if (param1 >= -106) {
                  field_l = null;
                  return;
                } else {
                  return;
                }
              } else {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
                if (param1 >= -106) {
                  field_l = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (pe.field_j <= 0) {
            if (0 >= eg.field_m) {
              if (param1 >= -106) {
                field_l = null;
                return;
              } else {
                return;
              }
            } else {
              if (!hc.field_c) {
                if (param1 >= -106) {
                  field_l = null;
                  return;
                } else {
                  return;
                }
              } else {
                L1: {
                  lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                  wi.field_j.a(true, param0);
                  if (param1 < -106) {
                    break L1;
                  } else {
                    field_l = null;
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            if (!hc.field_c) {
              if (param1 >= -106) {
                field_l = null;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                lb.b(0, 0, lb.field_c, gp.field_d.field_db);
                wi.field_j.a(true, param0);
                if (param1 < -106) {
                  break L2;
                } else {
                  field_l = null;
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        if ((ki.field_d ^ -1) < -33) {
          L0: {
            var1 = ki.field_d % 32;
            if (0 != var1) {
              break L0;
            } else {
              var1 = 32;
              break L0;
            }
          }
          h.a(13894, ki.field_d + -var1);
          var1 = -2 % ((-60 - param0) / 34);
          return;
        } else {
          h.a(13894, 0);
          var1 = -2 % ((-60 - param0) / 34);
          return;
        }
    }

    final static boolean c(int param0) {
        if (param0 != 30794) {
            return false;
        }
        return !ma.field_I.b(96) ? true : false;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            ga.a(51);
            field_l = null;
            field_k = null;
            return;
        }
        field_l = null;
        field_k = null;
    }

    static {
    }
}
