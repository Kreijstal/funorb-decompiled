/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends rf {
    static volatile int field_g;
    static int field_f;

    private pg() throws Throwable {
        throw new Error();
    }

    final static void a(boolean param0, byte param1) {
        na.field_a = ia.field_k * 10;
        if (nf.field_l != 0) {
          if (param1 <= -39) {
            L0: {
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (param0) {
              L1: {
                if (50000 <= na.field_a) {
                  ph.a(243, false, 12);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (100000 > na.field_a) {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  ph.a(242, false, 13);
                  if (na.field_a >= 200000) {
                    ph.a(241, false, 14);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            L3: {
              pg.a(true, (byte) -105);
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L3;
              } else {
                break L3;
              }
            }
            if (param0) {
              L4: {
                if (50000 <= na.field_a) {
                  ph.a(243, false, 12);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (100000 > na.field_a) {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  return;
                } else {
                  return;
                }
              } else {
                L5: {
                  ph.a(242, false, 13);
                  if (na.field_a >= 200000) {
                    ph.a(241, false, 14);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          na.field_a = na.field_a >> 2;
          if (param1 > -39) {
            L6: {
              pg.a(true, (byte) -105);
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0) {
                L8: {
                  if (50000 <= na.field_a) {
                    ph.a(243, false, 12);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (100000 <= na.field_a) {
                  ph.a(242, false, 13);
                  if (na.field_a >= 200000) {
                    ph.a(241, false, 14);
                    break L7;
                  } else {
                    return;
                  }
                } else {
                  L9: {
                    if (na.field_a >= 200000) {
                      ph.a(241, false, 14);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                break L7;
              }
            }
            return;
          } else {
            L10: {
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L10;
              } else {
                break L10;
              }
            }
            if (param0) {
              L11: {
                if (50000 <= na.field_a) {
                  ph.a(243, false, 12);
                  break L11;
                } else {
                  break L11;
                }
              }
              if (100000 > na.field_a) {
                if (na.field_a < 200000) {
                  return;
                } else {
                  ph.a(241, false, 14);
                  return;
                }
              } else {
                L12: {
                  ph.a(242, false, 13);
                  if (na.field_a >= 200000) {
                    ph.a(241, false, 14);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        field_g = 0;
        field_f = 0;
    }
}
