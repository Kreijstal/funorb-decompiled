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
            L1: {
              if (50000 <= na.field_a) {
                ph.a(243, false, 12);
                break L1;
              } else {
                break L1;
              }
            }
            if (100000 <= na.field_a) {
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
            } else {
              L3: {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            L4: {
              pg.a(true, (byte) -105);
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (50000 <= na.field_a) {
                ph.a(243, false, 12);
                break L5;
              } else {
                break L5;
              }
            }
            if (100000 <= na.field_a) {
              L6: {
                ph.a(242, false, 13);
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              L7: {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          na.field_a = na.field_a >> 2;
          if (param1 > -39) {
            L8: {
              pg.a(true, (byte) -105);
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (50000 <= na.field_a) {
                ph.a(243, false, 12);
                break L9;
              } else {
                break L9;
              }
            }
            if (100000 > na.field_a) {
              L10: {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              L11: {
                ph.a(242, false, 13);
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              if (2 == nf.field_l) {
                na.field_a = na.field_a << 1;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (50000 <= na.field_a) {
                ph.a(243, false, 12);
                break L13;
              } else {
                break L13;
              }
            }
            if (100000 <= na.field_a) {
              L14: {
                ph.a(242, false, 13);
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L14;
                } else {
                  break L14;
                }
              }
              return;
            } else {
              L15: {
                if (na.field_a >= 200000) {
                  ph.a(241, false, 14);
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_f = 0;
    }
}
