/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static int field_c;
    static char[] field_d;
    static int field_e;
    static String field_b;
    static boolean field_a;

    final static boolean a(char param0, byte param1) {
        if (param1 == -55) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (122 >= param0) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param0) {
              if (param0 >= 97) {
                if (122 < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 376) {
            field_c = -1;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        L0: {
          var2 = Torquing.field_u;
          if (param0 >= 0) {
            break L0;
          } else {
            ra.a((byte) 101);
            break L0;
          }
        }
        if (!im.l(169)) {
          if (dg.field_i != null) {
            if (!dg.field_i.field_b) {
              return;
            } else {
              ug.a(-116);
              w.field_G.a((gm) (Object) new i(w.field_G, bl.field_b), (byte) 100);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$2 = w.field_G.a(true, ha.field_e, oe.field_a, false);
          w.field_G.g((byte) -107);
          L1: while (true) {
            if (!np.a((byte) -13)) {
              return;
            } else {
              boolean discarded$3 = w.field_G.a(e.field_f, 24454, m.field_t);
              continue L1;
            }
          }
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 252) {
          if (param0 != 160) {
            if (32 != param0) {
              if (param0 != 95) {
                if (45 == param0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          boolean discarded$6 = ra.a('ﾷ', -121);
          if (param0 != 160) {
            if (32 != param0) {
              if (param0 != 95) {
                if (45 == param0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        ei discarded$0 = new ei();
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = false;
    }
}
