/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bp {
    static String field_h;
    private int field_b;
    static int[] field_e;
    private int[] field_f;
    private boolean field_a;
    static int field_d;
    private int field_g;
    static String field_c;

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param1 == -13676) {
            break L0;
          } else {
            ((bp) this).b(-126, 111);
            break L0;
          }
        }
        var3 = ((bp) this).field_f.length;
        L1: while (true) {
          if (var3 > param0) {
            return var3;
          } else {
            if (!((bp) this).field_a) {
              var3 = var3 + ((bp) this).field_g;
              continue L1;
            } else {
              if (0 != var3) {
                var3 = var3 * ((bp) this).field_g;
                continue L1;
              } else {
                var3 = 1;
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return;
        }
        if (!(((bp) this).field_b >= param0)) {
            ((bp) this).field_b = param0;
        }
        if (!(((bp) this).field_f.length > param0)) {
            this.d(-93, param0);
        }
        ((bp) this).field_f[param0] = param2;
    }

    private final void d(int param0, int param1) {
        int[] var5 = new int[this.c(param1, -13676)];
        int[] var3 = var5;
        int var4 = -83 / ((param0 - 57) / 59);
        cj.a(((bp) this).field_f, 0, var5, 0, ((bp) this).field_f.length);
        ((bp) this).field_f = var5;
    }

    final static um a(int param0, byte param1, String param2) {
        int var3 = -123 % ((-9 - param1) / 37);
        ha var4 = new ha();
        ((um) (Object) var4).field_f = param0;
        ((um) (Object) var4).field_a = param2;
        return (um) (Object) var4;
    }

    final static void a(int param0, cn param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        param2 = param2 + param1.field_w;
        param0 = param0 + param1.field_A;
        if (param3 == 99) {
          L0: {
            var4 = param2 + param0 * gf.field_i;
            var5 = 0;
            var6 = param1.field_v;
            var7 = param1.field_y;
            var8 = gf.field_i + -var7;
            if (gf.field_f > param0) {
              var10 = -param0 + gf.field_f;
              var5 = var5 + var7 * var10;
              param0 = gf.field_f;
              var6 = var6 - var10;
              var4 = var4 + var10 * gf.field_i;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = 0;
            if (var6 + param0 > gf.field_e) {
              var6 = var6 - (-gf.field_e + param0 + var6);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (gf.field_j <= param2) {
              break L2;
            } else {
              var10 = gf.field_j - param2;
              var7 = var7 - var10;
              param2 = gf.field_j;
              var9 = var9 + var10;
              var8 = var8 + var10;
              var5 = var5 + var10;
              var4 = var4 + var10;
              break L2;
            }
          }
          L3: {
            if (gf.field_h >= param2 + var7) {
              break L3;
            } else {
              var10 = param2 + (var7 - gf.field_h);
              var8 = var8 + var10;
              var7 = var7 - var10;
              var9 = var9 + var10;
              break L3;
            }
          }
          if (-1 <= (var7 ^ -1)) {
            return;
          } else {
            if ((var6 ^ -1) < -1) {
              id.a(var4, 0, (byte) 104, var6, var9, param1.field_B, var5, var7, gf.field_b, var8);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (((bp) this).field_b >= param0) {
              L1: {
                if (param0 == ((bp) this).field_b) {
                  break L1;
                } else {
                  cj.a(((bp) this).field_f, param0 - -1, ((bp) this).field_f, param0, -param0 + ((bp) this).field_b);
                  break L1;
                }
              }
              var3 = 125 / ((param1 - 16) / 53);
              ((bp) this).field_b = ((bp) this).field_b - 1;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    final static void a(cn param0, byte param1, String param2) {
        lg.field_m = param2;
        rf.field_Q = param0;
        if (param1 != 51) {
            field_h = null;
        }
    }

    final int a(int param0, int param1) {
        if (param0 != -814) {
            return 73;
        }
        if (param1 > ((bp) this).field_b) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((bp) this).field_f[param1];
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        if (param0 != -1) {
            Object var2 = null;
            bp.a(-29, (cn) null, 36, (byte) -4);
        }
    }

    final int a(byte param0) {
        if (param0 > -36) {
            return 3;
        }
        return 1 + ((bp) this).field_b;
    }

    final void e(int param0, int param1) {
        if (param1 > -66) {
            Object var4 = null;
            bp.a((cn) null, (byte) 50, (String) null);
        }
        this.a(1 + ((bp) this).field_b, 0, param0);
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DungeonAssault.field_K;
                    var1 = (Object) (Object) in.field_C;
                    // monitorenter in.field_C
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        hl.field_g = hl.field_g + 1;
                        je.field_i = pj.field_x;
                        if (0 <= ia.field_M) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((var2 ^ -1) <= -113) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        qk.field_e[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ia.field_M = dl.field_b;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (dl.field_b == ia.field_M) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = ih.field_r[dl.field_b];
                        dl.field_b = 127 & dl.field_b - -1;
                        if (0 <= var2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        qk.field_e[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qk.field_e[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 > 28) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var1
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return;
                }
                case 13: {
                    try {
                        pj.field_x = ka.field_c;
                        // monitorexit var1
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var3;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private bp() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Treasure: <col=DB0100><%0></col>";
        field_c = "Your raider was trapped and incapacitated.";
        field_e = wa.b(-1);
    }
}
