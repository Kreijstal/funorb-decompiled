/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends sp implements ai {
    private wp[] field_H;
    private int field_F;
    private vn field_C;
    private int[] field_D;
    private String field_B;
    static boolean field_A;
    private gt field_G;

    final static void a(byte param0, boolean param1, boolean param2, int param3, int param4, tv param5) {
        Object var6 = null;
        Throwable var7 = null;
        Object var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = (Object) (Object) wd.field_f;
                    // monitorenter wd.field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param5 == nd.field_B) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var6
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        nd.field_B = param5;
                        if (nd.field_B != null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        qc.field_e.a(param2, param3, 7094, param4, nd.field_B, param1);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param0 >= 98) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = null;
                        lc.a((byte) -110, true, true, 90, -86, (tv) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var6
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var6
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    lc(gt param0, vn param1, String param2) {
        super(0, 0, 288, 0, (mh) null);
        ((lc) this).field_F = 0;
        ((lc) this).field_B = param2;
        ((lc) this).field_G = param0;
        ((lc) this).field_C = param1;
        int var4 = ((lc) this).field_B != null ? ((lc) this).field_C.a(((lc) this).field_B, 260, ((lc) this).field_C.field_s) : 0;
        ((lc) this).a(-127, 0, 0, 22 - -var4, 288);
    }

    final static boolean a(boolean param0, String param1) {
        if (param0) {
            return false;
        }
        return null != hu.a(param1, (byte) 109) ? true : false;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        super.a(param0, param1, (byte) -118, param3);
        if (param2 >= -35) {
          var6 = null;
          boolean discarded$3 = lc.a(false, (String) null);
          int discarded$4 = ((lc) this).field_C.a(((lc) this).field_B, 14 + ((lc) this).field_r + param0, ((lc) this).field_v + (param1 - -10), -28 + ((lc) this).field_q, ((lc) this).field_p, 16777215, -1, 0, 0, ((lc) this).field_C.field_s);
          return;
        } else {
          int discarded$5 = ((lc) this).field_C.a(((lc) this).field_B, 14 + ((lc) this).field_r + param0, ((lc) this).field_v + (param1 - -10), -28 + ((lc) this).field_q, ((lc) this).field_p, 16777215, -1, 0, 0, ((lc) this).field_C.field_s);
          return;
        }
    }

    private final void a(byte param0, int param1) {
        wp[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        wp[] var8 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= ((lc) this).field_F) {
          return;
        } else {
          var8 = new wp[param1];
          var3 = var8;
          if (param0 == -124) {
            var4 = new int[param1];
            var5 = 0;
            L0: while (true) {
              if (((lc) this).field_F <= var5) {
                ((lc) this).field_H = var3;
                ((lc) this).field_F = param1;
                ((lc) this).field_D = var4;
                return;
              } else {
                var8[var5] = ((lc) this).field_H[var5];
                var4[var5] = ((lc) this).field_D[var5];
                var5++;
                continue L0;
              }
            }
          } else {
            var7 = null;
            ((lc) this).a(-17, -108, (wp) null, 120, -53);
            var4 = new int[param1];
            var5 = 0;
            L1: while (true) {
              if (((lc) this).field_F <= var5) {
                ((lc) this).field_H = var3;
                ((lc) this).field_F = param1;
                ((lc) this).field_D = var4;
                return;
              } else {
                var8[var5] = ((lc) this).field_H[var5];
                var4[var5] = ((lc) this).field_D[var5];
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int var4 = 0;
        if (!param2) {
          ((lc) this).field_B = null;
          var4 = ((lc) this).field_F;
          this.a((byte) -124, var4 - -1);
          ((lc) this).field_H[var4] = ((lc) this).a(param0, (byte) -123, (qm) this);
          ((lc) this).field_D[var4] = param1;
          return;
        } else {
          var4 = ((lc) this).field_F;
          this.a((byte) -124, var4 - -1);
          ((lc) this).field_H[var4] = ((lc) this).a(param0, (byte) -123, (qm) this);
          ((lc) this).field_D[var4] = param1;
          return;
        }
    }

    final wp a(String param0, byte param1, qm param2) {
        int var5 = 0;
        wp var6 = null;
        wp var7 = null;
        if (param1 != -123) {
          this.a((byte) 29, -68);
          var6 = new wp(param0, param2);
          var6.field_w = (mh) (Object) new ue();
          var5 = -2 + ((lc) this).field_p;
          ((lc) this).a(param1 ^ 62, 0, 0, 34 + ((lc) this).field_p, ((lc) this).field_q);
          var6.a(-57, 7, var5, 30, ((lc) this).field_q + -14);
          ((lc) this).a((pk) (Object) var6, param1 + 241);
          return var6;
        } else {
          var7 = new wp(param0, param2);
          var7.field_w = (mh) (Object) new ue();
          var5 = -2 + ((lc) this).field_p;
          ((lc) this).a(param1 ^ 62, 0, 0, 34 + ((lc) this).field_p, ((lc) this).field_q);
          var7.a(-57, 7, var5, 30, ((lc) this).field_q + -14);
          ((lc) this).a((pk) (Object) var7, param1 + 241);
          return var7;
        }
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param1 == 710) {
          var6 = 0;
          L0: while (true) {
            if (((lc) this).field_F > var6) {
              if (((lc) this).field_H[var6] == param2) {
                var7 = ((lc) this).field_D[var6];
                if (-1 == var7) {
                  ((lc) this).field_G.n(-7);
                  return;
                } else {
                  rd.a(((lc) this).field_D[var6], -59);
                  return;
                }
              } else {
                var6++;
                var6++;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          var9 = null;
          ((lc) this).a((String) null, -37, false);
          var6 = 0;
          L1: while (true) {
            if (((lc) this).field_F > var6) {
              if (((lc) this).field_H[var6] == param2) {
                var7 = ((lc) this).field_D[var6];
                if (-1 != var7) {
                  rd.a(((lc) this).field_D[var6], -59);
                  return;
                } else {
                  ((lc) this).field_G.n(-7);
                  return;
                }
              } else {
                var6++;
                var6++;
                continue L1;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = false;
    }
}
