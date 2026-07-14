/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_q;
    static String field_f;
    static int field_i;
    static String[] field_j;
    cm field_d;
    static ul field_b;
    String field_e;
    String field_g;
    static String field_o;
    static String field_c;
    static java.awt.Canvas field_n;
    String field_h;
    int field_a;
    static String field_l;
    static wk field_p;
    static long field_m;
    static gh[] field_k;

    final static void a(wk[] param0, int param1, int param2, int param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param0 == null) {
            break L0;
          } else {
            if ((param1 ^ -1) < -1) {
              L1: {
                var6 = param0[0].field_z;
                var7 = param0[2].field_z;
                var8 = param0[1].field_z;
                param0[0].d(param3, param2, param4);
                param0[2].d(param1 + param3 + -var7, param2, param4);
                pb.b(aj.field_v);
                pb.h(var6 + param3, param2, -var7 + param3 - -param1, param2 - -param0[1].field_B);
                var9 = param3 - -var6;
                var10 = -var7 + (param3 + param1);
                if (param5 <= -64) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              param3 = var9;
              L2: while (true) {
                if (var10 <= param3) {
                  pb.a(aj.field_v);
                  return;
                } else {
                  param0[1].d(param3, param2, param4);
                  param3 = param3 + var8;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static int a(nk param0, int[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          var3 = 0;
          var4 = param0.i(-126);
          if (param2 == -7) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var5 = 0;
        var6 = 0;
        L1: while (true) {
          if (var6 >= var4) {
            L2: {
              if (var5 != 0) {
                var3 += 15;
                break L2;
              } else {
                break L2;
              }
            }
            var3 += 2;
            return var3;
          } else {
            L3: {
              if (param1[var6] == -6) {
                var3++;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-7 != param1[var6]) {
                break L4;
              } else {
                var3 += 2;
                break L4;
              }
            }
            L5: {
              if (7 == param1[var6]) {
                var3 += 3;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (8 != param1[var6]) {
                break L6;
              } else {
                var3 += 4;
                break L6;
              }
            }
            L7: {
              if (9 != param1[var6]) {
                break L7;
              } else {
                var3 += 5;
                break L7;
              }
            }
            if ((param1[var6] ^ -1) == -35) {
              var5 = 1;
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static wk[] a(int param0, int param1) {
        if (param1 != 2) {
            field_n = null;
        }
        wk[] var3 = new wk[9];
        wk[] var2 = var3;
        var3[4] = bd.a(param0, 64, 248);
        return var2;
    }

    public static void a(int param0) {
        field_b = null;
        field_n = null;
        field_c = null;
        field_l = null;
        field_o = null;
        int var1 = 1 / ((param0 - -20) / 52);
        field_f = null;
        field_q = null;
        field_k = null;
        field_j = null;
        field_p = null;
    }

    final static void a(byte param0) {
        if (param0 != 3) {
            sl.a((byte) -108);
        }
    }

    private sl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "CLEAR DRONES";
        field_q = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = "Spectate <%0>'s game";
        field_j = new String[]{"Tech value: <%0>", "Jump boost", "Thrust boost", "Energy capacity: <%0> TJ", "Shields: <%0> GJ", "Energy generation: <%0> GJ/s", "Energy generation: UNKNOWN", "Health: <%0> kPm", "Tech value: <%0>", "Jump: <%0>%", "Thrust: <%0>%", "Jump & thrust boosts"};
        field_l = "Waiting for extra data";
        field_c = "Retry";
        field_b = new ul();
    }
}
