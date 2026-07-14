/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends fc {
    int field_D;
    static String field_K;
    static String field_E;
    static bd field_B;
    static boolean field_C;
    static p[] field_F;
    static String[] field_I;
    static int field_J;
    static vm field_G;
    static vl field_H;

    final static void l(int param0) {
        Object var2 = null;
        if (param0 != 0) {
            jn.k(83);
            var2 = null;
            ij.a((byte) -17, (ji) null);
            return;
        }
        var2 = null;
        ij.a((byte) -17, (ji) null);
    }

    public jn() {
        super(0, 0, 0, 0, (nn) null, (mh) null);
        ((jn) this).field_D = 256;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        bd var8 = null;
        bd var9 = null;
        if (0 != param3) {
          return;
        } else {
          if (null != ((jn) this).field_A) {
            if (param2 >= 42) {
              if (-1 == (((jn) this).field_D ^ -1)) {
                return;
              } else {
                if (256 == ((jn) this).field_D) {
                  ((jn) this).field_A.a(param0 + ((jn) this).field_m, param1 + ((jn) this).field_v, (byte) 110, param3);
                  return;
                } else {
                  var9 = new bd(((jn) this).field_A.field_s, ((jn) this).field_A.field_x);
                  sb.a(var9, -125);
                  ((jn) this).field_A.a(0, 0, (byte) 60, param3);
                  eh.b(false);
                  var9.b(((jn) this).field_v + param1, param0 - -((jn) this).field_m, ((jn) this).field_D);
                  return;
                }
              }
            } else {
              var6 = null;
              jn.a((int[]) null, -119, -105, 49, -23);
              if (-1 == (((jn) this).field_D ^ -1)) {
                return;
              } else {
                if (256 == ((jn) this).field_D) {
                  ((jn) this).field_A.a(param0 + ((jn) this).field_m, param1 + ((jn) this).field_v, (byte) 110, param3);
                  return;
                } else {
                  var8 = new bd(((jn) this).field_A.field_s, ((jn) this).field_A.field_x);
                  sb.a(var8, -125);
                  ((jn) this).field_A.a(0, 0, (byte) 60, param3);
                  eh.b(false);
                  var8.b(((jn) this).field_v + param1, param0 - -((jn) this).field_m, ((jn) this).field_D);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void k(int param0) {
        Object var2 = null;
        field_E = null;
        field_K = null;
        field_H = null;
        field_F = null;
        if (param0 != 608) {
          var2 = null;
          jn.a((int[]) null, 33, 96, 74, -62);
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        } else {
          field_B = null;
          field_I = null;
          field_G = null;
          return;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        L0: while (true) {
          param1--;
          if (-1 < (param1 ^ -1)) {
            if (param2 != -1) {
              field_E = null;
              return;
            } else {
              return;
            }
          } else {
            var9 = param0;
            var5 = var9;
            var6 = param4;
            var7 = param3;
            var9[var6] = var7 + ua.a(8355711, var9[var6] >> 1114971361);
            param4++;
            continue L0;
          }
        }
    }

    jn(ag param0) {
        super(param0.field_v, param0.field_m, param0.field_s, param0.field_x, (nn) null, (mh) null);
        param0.a(((jn) this).field_s, 0, 0, 0, ((jn) this).field_x);
        ((jn) this).field_D = 256;
        ((jn) this).field_A = param0;
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) nj.field_c;
                    // monitorenter nj.field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (nm.field_j != ee.field_e) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        pj.field_e = cm.field_a[ee.field_e];
                        aj.field_e = pe.field_db[ee.field_e];
                        var2 = 26 % ((-11 - param0) / 61);
                        ee.field_e = 127 & ee.field_e + 1;
                        // monitorexit var1_ref
                        stackOut_4_0 = 1;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param0 != 100) {
          L0: {
            field_I = null;
            if ((param1 ^ -1) < -1) {
              si.d(32, 32, 608, 440);
              vg.field_c.a(param2, param3, param1);
              si.c();
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if ((param1 ^ -1) < -1) {
              si.d(32, 32, 608, 440);
              vg.field_c.a(param2, param3, param1);
              si.c();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1) {
        q.field_d = (param1 << -818563024) / 150;
        q.field_k = param1 * 100 / 150;
        if (param0 != 256) {
          return;
        } else {
          q.field_h = 400 * param1 / 150;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Life signs detected! Proceed with caution.";
        field_I = new String[]{"Showing by rating", "Showing by win percentage"};
        field_K = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_H = new vl();
    }
}
