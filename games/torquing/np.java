/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends ha {
    static String field_m;
    private long field_g;
    private long[] field_f;
    private int field_l;
    static k field_k;
    private long field_i;
    private int field_j;
    private long field_h;

    final void b(int param0) {
        ((np) this).field_g = 0L;
        if (((np) this).field_h > ((np) this).field_i) {
            ((np) this).field_i = ((np) this).field_i + (-((np) this).field_i + ((np) this).field_h);
        }
        if (param0 != 30752) {
            field_m = null;
        }
    }

    private final long b(byte param0) {
        int var8 = 0;
        int var9 = Torquing.field_u;
        long var2 = System.nanoTime();
        long var4 = -((np) this).field_g + var2;
        if (param0 != 103) {
            return -4L;
        }
        ((np) this).field_g = var2;
        if (-5000000000L < var4) {
            if (5000000000L > var4) {
                ((np) this).field_f[((np) this).field_j] = var4;
                ((np) this).field_j = (((np) this).field_j + 1) % 10;
                if ((((np) this).field_l ^ -1) > -2) {
                    ((np) this).field_l = ((np) this).field_l + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; ((np) this).field_l >= var8; var8++) {
            var6 = var6 + ((np) this).field_f[(10 + (((np) this).field_j + -var8)) % 10];
        }
        return var6 / (long)((np) this).field_l;
    }

    final int a(long param0, boolean param1) {
        int var5 = Torquing.field_u;
        if (!param1) {
            return -63;
        }
        if (((np) this).field_i < ((np) this).field_h) {
            ((np) this).field_g = ((np) this).field_g + (((np) this).field_h - ((np) this).field_i);
            ((np) this).field_i = ((np) this).field_i + (-((np) this).field_i + ((np) this).field_h);
            ((np) this).field_h = ((np) this).field_h + param0;
            return 1;
        }
        int var4 = 0;
        do {
            ((np) this).field_h = ((np) this).field_h + param0;
            var4++;
            // if_icmpge L109
        } while (((np) this).field_h < ((np) this).field_i);
        if (!((((np) this).field_i ^ -1L) >= (((np) this).field_h ^ -1L))) {
            ((np) this).field_h = ((np) this).field_i;
        }
        return var4;
    }

    final static void a(wl param0, boolean param1, int param2) {
        L0: {
          if (param0 == null) {
            break L0;
          } else {
            if (param0 != vd.field_c) {
              L1: {
                param0.a(of.field_m * 64 / 160);
                if (!param1) {
                  break L1;
                } else {
                  param0.g();
                  break L1;
                }
              }
              L2: {
                if (null == vd.field_c) {
                  break L2;
                } else {
                  ti.field_e.c((sl) (Object) vd.field_c);
                  break L2;
                }
              }
              L3: {
                vd.field_c = param0;
                qd.field_b.e();
                if (param2 > 117) {
                  break L3;
                } else {
                  np.d(61);
                  break L3;
                }
              }
              ti.field_e.a((sl) (Object) vd.field_c);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) ha.field_b;
                    // monitorenter ha.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -13) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        np.d(-95);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (q.field_g == mj.field_d) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        e.field_f = ol.field_c[q.field_g];
                        m.field_t = pe.field_H[q.field_g];
                        q.field_g = 127 & 1 + q.field_g;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var8 = null;
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = Torquing.field_u;
        if (param0 <= 0) {
            var4 = param1;
        } else {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
                var8[var5_int] = param1[var5_int + param0];
            }
        }
        if (param3 > -68) {
            field_m = null;
        }
        mj var5 = new mj();
        var5.a((byte) 0);
        var5.a(var4, (long)(param2 * 8), (byte) 95);
        byte[] var6 = new byte[64];
        var5.a(0, var6, 128);
        return var6;
    }

    final static void a(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = Torquing.field_u;
          if (0 == (param0 ^ -1)) {
            if (null != j.field_a) {
              lj.a(j.field_a, (byte) -101);
              j.field_a = null;
              break L0;
            } else {
              break L0;
            }
          } else {
            L1: {
              if (ig.field_r[param0] == null) {
                ig.field_r[param0] = nj.a(th.field_F[param0], 100, param2);
                ig.field_r[param0].d(-1);
                break L1;
              } else {
                break L1;
              }
            }
            if (j.field_a != ig.field_r[param0]) {
              L2: {
                if (null != j.field_a) {
                  lj.a(j.field_a, (byte) -103);
                  break L2;
                } else {
                  break L2;
                }
              }
              ni.a(ig.field_r[param0], true);
              j.field_a = ig.field_r[param0];
              break L0;
            } else {
              ig.field_r[param0].i(param2);
              break L0;
            }
          }
        }
        L3: {
          if (param1 == -32596) {
            break L3;
          } else {
            field_m = null;
            break L3;
          }
        }
    }

    final long c(int param0) {
        if (param0 != 20520) {
            ((np) this).field_j = 53;
        }
        ((np) this).field_i = ((np) this).field_i + this.b((byte) 103);
        if (!(((np) this).field_i >= ((np) this).field_h)) {
            return (-((np) this).field_i + ((np) this).field_h) / 1000000L;
        }
        return 0L;
    }

    np() {
        ((np) this).field_f = new long[10];
        ((np) this).field_j = 0;
        ((np) this).field_l = 1;
        ((np) this).field_g = 0L;
        ((np) this).field_i = 0L;
        ((np) this).field_h = 0L;
        ((np) this).field_i = System.nanoTime();
        ((np) this).field_h = System.nanoTime();
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != 0) {
            field_m = null;
        }
        field_m = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new k(1, 2, 2, 0);
    }
}
