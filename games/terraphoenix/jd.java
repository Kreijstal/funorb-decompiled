/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends vc {
    private int field_j;
    private long[] field_l;
    private long field_k;
    static String field_i;
    private int field_m;
    private long field_n;
    private long field_h;

    final static void a(int param0, fa param1, fa param2) {
        try {
            if (param0 < 106) {
                jd.a(-74, (fa) null, (fa) null);
            }
            sj.field_f = param1;
            dm.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "jd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) {
        this.field_n = this.field_n + this.a((byte) -82);
        if (param0 <= 39) {
            return 8L;
        }
        if (!(this.field_n >= this.field_k)) {
            return (-this.field_n + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        var5 = Terraphoenix.field_V;
        if (param0 == 0) {
          if (this.field_n >= this.field_k) {
            var4 = 0;
            L0: while (true) {
              this.field_k = this.field_k + param1;
              var4++;
              stackIn_6_0 = 10;
              L1: while (true) {
                L2: {
                  if (stackIn_6_0 <= var4) {
                    break L2;
                  } else {
                    if ((this.field_n ^ -1L) < (this.field_k ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_6_0 = (this.field_k < this.field_n ? -1 : (this.field_k == this.field_n ? 0 : 1));

                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_6_0 < 0) {
                    this.field_k = this.field_n;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (this.field_k - this.field_n);
            this.field_n = this.field_n + (this.field_k + -this.field_n);
            this.field_k = this.field_k + param1;
            return 1;
          }
        } else {
          return 3;
        }
    }

    final static void a(boolean param0, int param1) {
        uf var2 = null;
        int var3 = 0;
        cc var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (cc) ((Object) qb.field_a.d(9272));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ia.a(param1, var4, -118);
                        var4 = (cc) ((Object) qb.field_a.e((byte) -119));
                        if (var3 != 0) {
                            statePc = 8;
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
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0) {
                            statePc = 8;
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
                        jd.d(116);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2 = qc.field_a.d(9272);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var2 == null) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        da.a(0, param1);
                        var2 = qc.field_a.e((byte) -119);
                        if (var3 == 0) {
                            statePc = 12;
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
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var3 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw qk.a((Throwable) ((Object) var2_ref), "jd.D(" + param0 + ',' + param1 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Terraphoenix.field_V;
                    var2 = System.nanoTime();
                    var4 = -this.field_h + var2;
                    this.field_h = var2;
                    if (var4 <= -5000000000L) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (5000000000L > var4) {
                        statePc = 16;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (this.field_m >= var8) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param0 < -29) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    jd.a(69, (fa) null, (fa) null);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    return var6 / (long)this.field_m;
                }
                case 8: {
                    var6 = var6 + this.field_l[(10 + (this.field_j - var8)) % 10];
                    var8++;
                    if (var9 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return var6 / (long)this.field_m;
                }
                case 11: {
                    if (var9 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if (param0 >= -29) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return var6 / (long)this.field_m;
                }
                case 14: {
                    jd.a(69, (fa) null, (fa) null);
                    return var6 / (long)this.field_m;
                }
                case 16: {
                    this.field_l[this.field_j] = var4;
                    if (this.field_m < 1) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    this.field_m = this.field_m + 1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    this.field_j = (1 + this.field_j) % 10;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var6 = 0L;
                    var8 = 1;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (this.field_m < var8) {
                        statePc = 27;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    var6 = var6 + this.field_l[(10 + (this.field_j - var8)) % 10];
                    var8++;
                    if (var9 != 0) {
                        statePc = 29;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var9 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (param0 < -29) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    jd.a(69, (fa) null, (fa) null);
                    return var6 / (long)this.field_m;
                }
                case 26: {
                    return var6 / (long)this.field_m;
                }
                case 27: {
                    if (param0 < -29) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    jd.a(69, (fa) null, (fa) null);
                    return var6 / (long)this.field_m;
                }
                case 29: {
                    return var6 / (long)this.field_m;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4;
        if (param1 < -21) {
          uf.field_f.b(param3, param0);
          if (param2) {
            L0: {
              var4 = 2 * (el.field_e % uf.field_f.field_r);
              if (var4 < uf.field_f.field_r) {
                break L0;
              } else {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
                break L0;
              }
            }
            L1: {
              if ((var4 ^ -1) <= -11) {
                break L1;
              } else {
                var4 = 10;
                if (Terraphoenix.field_V == 0) {
                  lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            } else {
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            }
          } else {
            return;
          }
        } else {
          jd.a(false, -74);
          uf.field_f.b(param3, param0);
          if (param2) {
            L2: {
              var4 = 2 * (el.field_e % uf.field_f.field_r);
              if (var4 < uf.field_f.field_r) {
                break L2;
              } else {
                var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
                break L2;
              }
            }
            L3: {
              if ((var4 ^ -1) <= -11) {
                break L3;
              } else {
                var4 = 10;
                if (Terraphoenix.field_V == 0) {
                  lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
                  return;
                } else {
                  break L3;
                }
              }
            }
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            } else {
              lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0) {
        this.field_h = (long)param0;
        if ((this.field_k ^ -1L) >= (this.field_n ^ -1L)) {
          return;
        } else {
          this.field_n = this.field_n + (this.field_k + -this.field_n);
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            field_i = (String) null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static void a(dc param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-4 >= (var2_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        je.field_a[var2_int] = 0;
                        var2_int++;
                        if (var5 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2_int >= am.field_J) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = ra.field_i[var2_int].field_l;
                        stackIn_9_0 = stackIn_11_0;
                        stackIn_11_1 = param0.field_l;
                        stackIn_9_1 = stackIn_11_1;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 <= stackIn_11_1) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        dupTemp$0 = ra.field_i[var2_int].a(2);
                        je.field_a[dupTemp$0] = je.field_a[dupTemp$0] + 1;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var2_int++;
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param1 <= -93) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        field_i = (String) null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        dupTemp$1 = param0.a(2);
                        je.field_a[dupTemp$1] = je.field_a[dupTemp$1] + 1;
                        var2_int = 0;
                        var3 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3 >= am.field_J) {
                            statePc = 26;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_27_0 = param0.field_l ^ -1;
                        stackIn_20_0 = stackIn_27_0;
                        if (var5 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (stackIn_20_0 != (ra.field_i[var3].field_l ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var4 = ra.field_i[var3].a(2);
                        if (bl.field_f < je.field_a[var4]) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        je.field_a[var4] = je.field_a[var4] - 1;
                        if (var5 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        incrementValue$2 = var2_int;
                        var2_int++;
                        ra.field_i[incrementValue$2] = ra.field_i[var3];
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var3++;
                        if (var5 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = var2_int;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        am.field_J = stackIn_27_0;
                        fieldTemp$3 = am.field_J;
                        am.field_J = am.field_J + 1;
                        ra.field_i[fieldTemp$3] = param0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var2);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("jd.H(");
                    stackIn_30_1 = stackIn_31_1;
                    if (param0 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw qk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    jd() {
        this.field_k = 0L;
        this.field_l = new long[10];
        this.field_j = 0;
        this.field_n = 0L;
        this.field_h = 0L;
        this.field_m = 1;
        this.field_n = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
