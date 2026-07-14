/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends oa {
    static ed field_H;
    byte field_y;
    int field_F;
    static int field_D;
    n field_A;
    static boolean field_E;
    static String field_C;
    static int field_z;
    static String[] field_I;
    static ed field_G;
    static String field_B;
    static int field_x;

    final static boolean a(byte param0, int param1) {
        if (param1 == 13) {
          return true;
        } else {
          if (param0 != 15) {
            s.d((byte) 54);
            return di.field_d.b((byte) -18);
          } else {
            return di.field_d.b((byte) -18);
          }
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        n var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = new n(param1);
                    var3 = var10.e(0);
                    if (param0 == -26) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    String discarded$6 = s.a((byte) 49, (CharSequence[]) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = var10.g(-5053);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (m.field_q == 0) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (m.field_q < var4) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5_ref_byte__ = var11;
                    var10.a(var17, (byte) -96, 0, var4);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var10.g(-5053);
                    if (0 > var5) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-1 == (m.field_q ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (m.field_q >= var5) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var18 = new byte[var5];
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var6 = var12;
                    if (1 != var3) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    int discarded$7 = i.a(var18, var5, param1, var4, 9);
                    return var6;
                }
                case 16: {
                    var7 = (Object) (Object) tc.field_g;
                    // monitorenter tc.field_g
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        tc.field_g.a(122, var18, var10);
                        // monitorexit var7
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return var6;
                }
                case 19: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    throw (RuntimeException) (Object) var8;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void d(byte param0) {
        if (param0 != 34) {
            return;
        }
        field_B = null;
        field_I = null;
        field_H = null;
        field_G = null;
        field_C = null;
    }

    s() {
    }

    final byte[] a(boolean param0) {
        if (!((s) this).field_u) {
          if (((s) this).field_A.field_m >= ((s) this).field_A.field_g.length - ((s) this).field_y) {
            if (!param0) {
              ((s) this).field_A = null;
              return ((s) this).field_A.field_g;
            } else {
              return ((s) this).field_A.field_g;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    final int g(int param0) {
        if (param0 != 100) {
            ((s) this).field_F = -96;
            if (!(null != ((s) this).field_A)) {
                return 0;
            }
            return ((s) this).field_A.field_m * 100 / (-((s) this).field_y + ((s) this).field_A.field_g.length);
        }
        if (!(null != ((s) this).field_A)) {
            return 0;
        }
        return ((s) this).field_A.field_m * 100 / (-((s) this).field_y + ((s) this).field_A.field_g.length);
    }

    final static String a(byte param0, CharSequence[] param1) {
        Object var3 = null;
        if (param0 >= -4) {
          var3 = null;
          String discarded$2 = s.a((byte) -12, (CharSequence[]) null);
          return ua.a(0, param1.length, param1, 4);
        } else {
          return ua.a(0, param1.length, param1, 4);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Mouse over an icon for details";
        field_D = 0;
        field_B = "Names can only contain letters, numbers, spaces and underscores";
    }
}
