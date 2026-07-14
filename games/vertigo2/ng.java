/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static int field_c;
    static String field_b;
    static boolean field_a;

    public static void b(int param0) {
        field_b = null;
        if (param0 != 16952) {
            Object var2 = null;
            uq[] discarded$0 = ng.a((byte) 5, (mi) null);
        }
    }

    final static void a(int param0) {
        mi.k(-32460, 2);
        if (param0 != -10236) {
            field_a = false;
        }
    }

    final static uq[] a(byte param0, mi param1) {
        int var2 = 0;
        int var3 = 0;
        uq[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        uq var6 = null;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var2 = param1.c((byte) -107, 8);
        if (var2 <= 0) {
          var3 = param1.c((byte) -96, 12);
          if (param0 <= -96) {
            var4 = new uq[var3];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var3) {
                return var4;
              } else {
                if (id.a(param1, -31980)) {
                  var6 = new uq();
                  int discarded$6 = param1.c((byte) -124, 24);
                  int discarded$7 = param1.c((byte) -121, 24);
                  var6.field_e = param1.c((byte) -120, 24);
                  int discarded$8 = param1.c((byte) -115, 9);
                  int discarded$9 = param1.c((byte) -105, 12);
                  int discarded$10 = param1.c((byte) -119, 12);
                  int discarded$11 = param1.c((byte) -106, 12);
                  var4[var5] = var6;
                  var5++;
                  continue L0;
                } else {
                  var6_int = param1.c((byte) -128, ee.a(-1 + var5, 96));
                  var4[var5] = var4[var6_int];
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = Vertigo2.field_L ? 1 : 0;
            if (ap.field_e > param1) {
              break L1;
            } else {
              if (param3 > ib.field_a) {
                break L1;
              } else {
                if (param6 < ua.field_e) {
                  break L1;
                } else {
                  if (param2 <= cj.field_D) {
                    if ((param4 ^ -1) != -2) {
                      nb.a(param6, param3, param0, (byte) -92, param4, param2, param1);
                      break L0;
                    } else {
                      f.a(param3, param1, param0, param6, (byte) -8, param2);
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          if ((param4 ^ -1) == -2) {
            dm.a(0, param1, param6, param3, param0, param2);
            break L0;
          } else {
            bs.a(param4, param3, param0, param2, param1, param6, 0);
            break L0;
          }
        }
        var7 = 116 / ((25 - param5) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Only show game chat from my friends";
    }
}
