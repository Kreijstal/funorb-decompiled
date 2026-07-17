/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static String field_f;
    static ci field_c;
    static boolean[] field_a;
    static boolean field_b;
    static String field_d;
    static hl field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        vm.field_k = 0;
        jj.field_a = null;
        dm.field_b = null;
        var2 = of.field_g;
        of.field_g = lg.field_f;
        var3 = 30 / ((73 - param0) / 38);
        if (param1 != 51) {
          if (param1 != 50) {
            L0: {
              qh.field_c.field_c = 1;
              qh.field_c.field_g = qh.field_c.field_g + 1;
              lg.field_f = var2;
              if (qh.field_c.field_g < 2) {
                break L0;
              } else {
                if (param1 != 51) {
                  break L0;
                } else {
                  return 2;
                }
              }
            }
            if (qh.field_c.field_g < 2) {
              if (qh.field_c.field_g >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (qh.field_c.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          } else {
            L1: {
              qh.field_c.field_c = 5;
              qh.field_c.field_g = qh.field_c.field_g + 1;
              lg.field_f = var2;
              if (qh.field_c.field_g < 2) {
                break L1;
              } else {
                if (param1 != 51) {
                  break L1;
                } else {
                  return 2;
                }
              }
            }
            if (qh.field_c.field_g < 2) {
              if (qh.field_c.field_g >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (qh.field_c.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        } else {
          qh.field_c.field_c = 2;
          qh.field_c.field_g = qh.field_c.field_g + 1;
          lg.field_f = var2;
          if (qh.field_c.field_g >= 2) {
            if (param1 == 51) {
              return 2;
            } else {
              if (qh.field_c.field_g < 2) {
                if (qh.field_c.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (qh.field_c.field_g >= 4) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            }
          } else {
            if (qh.field_c.field_g < 2) {
              if (qh.field_c.field_g >= 4) {
                return 1;
              } else {
                return -1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (qh.field_c.field_g >= 4) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2, int param3, boolean param4, int param5, int param6, boolean param7, int param8, int param9, boolean param10) {
        pc.field_Mb = null;
        int discarded$0 = -26285;
        jc.a();
        int discarded$1 = 14;
        int discarded$2 = 11;
        int discarded$3 = 13;
        int discarded$4 = 15;
        param4 = ah.a((byte) 111, 0, param4);
        em.a(16777215, 2, param0, param9, 16777215, param4, param7, 11, true, param10);
        ie.a(param10, (byte) -107, param9);
        int discarded$5 = 0;
        q.a(-6844, param9, param4);
    }

    public static void a() {
        field_d = null;
        field_f = null;
        field_a = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Suggested names: ";
        field_a = new boolean[]{true, false, false, false, true, true, true, false, false, false, false, false, false};
        field_d = "Please select options in the following rows:  ";
    }
}
