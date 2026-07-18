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
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (param0 >= 0) {
                break L1;
              } else {
                ra.a((byte) 101);
                break L1;
              }
            }
            if (im.l(169)) {
              boolean discarded$15 = w.field_G.a(true, ha.field_e, oe.field_a, false);
              w.field_G.g((byte) -107);
              L2: while (true) {
                if (!np.a((byte) -13)) {
                  break L0;
                } else {
                  boolean discarded$16 = w.field_G.a(e.field_f, 24454, m.field_t);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (dg.field_i == null) {
                  break L3;
                } else {
                  if (!dg.field_i.field_b) {
                    break L3;
                  } else {
                    ug.a(-116);
                    w.field_G.a((gm) (Object) new i(w.field_G, bl.field_b), (byte) 100);
                    break L3;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ra.D(" + param0 + ')');
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
        field_d = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        ei discarded$0 = new ei();
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = false;
    }
}
