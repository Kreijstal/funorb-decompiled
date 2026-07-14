/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    int field_b;
    int field_c;
    static String field_e;
    int field_a;
    int field_g;
    static String field_i;
    int[][] field_d;
    int field_h;
    int field_f;

    public static void a(int param0) {
        field_e = null;
        int var1 = 112 / ((-60 - param0) / 60);
        field_i = null;
    }

    final static void a(int param0, ce param1, boolean param2, byte param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = (Object) (Object) ig.field_l;
                    // monitorenter ig.field_l
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 <= -61) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ni.field_N != null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        nb.field_c.b((il) (Object) ni.field_N);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        kn.field_b = param0;
                        ni.field_N = new o(param1);
                        ni.field_N.d(kn.field_b * kc.field_b / 64);
                        ni.field_N.a(param2);
                        ig.field_l.b();
                        nb.field_c.c((il) (Object) ni.field_N);
                        // monitorexit var4
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var5;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vc(DataInputStream param0, int param1) throws IOException {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        L0: {
          ((vc) this).field_a = param0.readUnsignedByte();
          ((vc) this).field_h = ((vc) this).field_a << -2123072059;
          ((vc) this).field_f = param0.readUnsignedByte();
          ((vc) this).field_g = ((vc) this).field_f << 1453009701;
          ((vc) this).field_c = param0.readUnsignedByte();
          ((vc) this).field_b = ((vc) this).field_c;
          if (param1 < 10) {
            break L0;
          } else {
            ((vc) this).field_b = param0.readUnsignedByte();
            break L0;
          }
        }
        ((vc) this).field_d = new int[((vc) this).field_a * ((vc) this).field_f][];
        var3 = 0;
        L1: while (true) {
          if (((vc) this).field_a * ((vc) this).field_f <= var3) {
          } else {
            var4 = param0.readByte();
            var5 = 0;
            L2: while (true) {
              if (var5 < 4) {
                if (var3 - -var5 < ((vc) this).field_a * ((vc) this).field_f) {
                  L3: {
                    if ((var4 & 3) == -1) {
                      ((vc) this).field_d[var3 - -var5] = null;
                      break L3;
                    } else {
                      if (-2 != (var4 & 3)) {
                        ((vc) this).field_d[var3 + var5] = new int[32];
                        var6 = new int[32];
                        bf.a(0, 32, param0, 0, 32, var6, 2147483647);
                        break L3;
                      } else {
                        ((vc) this).field_d[var5 + var3] = si.field_v;
                        var4 = var4 >>> 2;
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var4 = var4 >>> 2;
                  var5++;
                  continue L2;
                } else {
                  var3 += 4;
                  continue L1;
                }
              } else {
                var3 += 4;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Reload game";
        field_e = "Passwords must be between 5 and 20 characters long";
    }
}
