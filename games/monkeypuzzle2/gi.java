/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    private long[] field_k;
    private long[] field_b;
    private byte[] field_h;
    static int[] field_j;
    private long[] field_f;
    private int field_d;
    private byte[] field_i;
    static int[] field_e;
    private int field_g;
    static int field_a;
    private long[] field_m;
    private long[] field_n;
    static int field_c;
    static pj field_l;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= 32) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_i[var2] = (byte) 0;
                    var2++;
                    if (var3 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var3 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 5: {
                    this.field_g = 0;
                    this.field_h[0] = (byte)param0;
                    this.field_d = 0;
                    var2 = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                case 8: {
                    this.field_k[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    if (var3 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    this.field_g = 0;
                    this.field_h[0] = (byte)param0;
                    this.field_d = 0;
                    var2 = 0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return;
                }
                case 15: {
                    this.field_k[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                case 17: {
                    if (var3 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    var2 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    if (-9 < (var2 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                case 22: {
                    this.field_k[var2] = 0L;
                    var2++;
                    if (var3 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 24: {
                    if (var3 == 0) {
                        statePc = 20;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(int param0) {
        hb var2;
        field_j = null;
        if (param0 != 8) {
          var2 = (hb) null;
          gi.a(-67, (hb) null);
          field_e = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_l = null;
          return;
        }
    }

    final static sj a(int param0, hb param1) {
        sj stackIn_5_0 = null;
        sj stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        sj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (0 >= var2_int) {
              if (param0 <= -43) {
                L1: {
                  var3 = vg.a(89, param1) ? 1 : 0;
                  var4 = vg.a(91, param1) ? 1 : 0;
                  var5 = new sj();
                  var5.field_e = (short)param1.f(8, 16);
                  var5.field_O = nf.a(false, param1, 16, var5.field_O);
                  var5.field_M = nf.a(false, param1, 16, var5.field_M);
                  var5.field_z = nf.a(false, param1, 16, var5.field_z);
                  var5.field_k = (short)param1.f(8, 16);
                  var5.field_u = nf.a(false, param1, 16, var5.field_u);
                  var5.field_L = nf.a(false, param1, 16, var5.field_L);
                  var5.field_C = nf.a(false, param1, 16, var5.field_C);
                  if (var3 != 0) {
                    var5.field_r = (short)param1.f(8, 16);
                    var5.field_y = nf.a(false, param1, 16, var5.field_y);
                    var5.field_p = nf.a(false, param1, 16, var5.field_p);
                    var5.field_K = nf.a(false, param1, 16, var5.field_K);
                    var5.field_d = nf.a(false, param1, 16, var5.field_d);
                    var5.field_n = nf.a(false, param1, 16, var5.field_n);
                    var5.field_A = nf.a(false, param1, 16, var5.field_A);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 != 0) {
                    param1.f(8, 16);
                    var5.field_m = nf.a(false, param1, 16, var5.field_m);
                    var5.field_h = nf.a(false, param1, 16, var5.field_h);
                    var5.field_a = nf.a(false, param1, 16, var5.field_a);
                    var5.field_I = nf.a(false, param1, 16, var5.field_I);
                    var5.field_l = nf.a(false, param1, 16, var5.field_l);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!vg.a(74, param1)) {
                    break L3;
                  } else {
                    var5.field_c = nf.a(false, param1, 16, var5.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (!vg.a(75, param1)) {
                    break L4;
                  } else {
                    var5.field_N = kk.a(16, param1, var5.field_N, (byte) 99);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (var5.field_N.length <= var7) {
                            break L7;
                          } else {
                            var10 = var5.field_N[var7] & 255 ^ -1;
                            var9 = var6 ^ -1;
                            if (var8 != 0) {
                              if (var9 == var10) {
                                var5.field_N = null;
                                break L4;
                              } else {
                                break L6;
                              }
                            } else {
                              L8: {
                                if (var9 <= var10) {
                                  break L8;
                                } else {
                                  var6 = 255 & var5.field_N[var7];
                                  break L8;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (-1 == (var6 ^ -1)) {
                          var5.field_N = null;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var5.field_D = (byte)(var6 + 1);
                      if (var8 == 0) {
                        break L4;
                      } else {
                        var5.field_N = null;
                        break L4;
                      }
                    }
                  }
                }
                stackIn_31_0 = (sj) (var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (sj) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("gi.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_31_0;
        }
    }

    final void a(int param0, byte param1, byte[] param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], 128 >>> ch.a(this.field_g, 7));
                        this.field_d = this.field_d + 1;
                        if (this.field_d > 32) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (-65 >= (this.field_d ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        fieldTemp$0 = this.field_d;
                        this.field_d = this.field_d + 1;
                        this.field_h[fieldTemp$0] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.a(16);
                        this.field_d = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(16);
                        this.field_d = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_d = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (32 <= this.field_d) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        fieldTemp$1 = this.field_d;
                        this.field_d = this.field_d + 1;
                        this.field_h[fieldTemp$1] = (byte) 0;
                        if (var8 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        gl.a(this.field_i, 0, this.field_h, 32, 32);
                        this.a(16);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_int = 0;
                        if (param1 == -70) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var5 = param0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-9 >= (var4_int ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var6 = this.field_k[var4_int];
                        param2[var5] = (byte)(int)(var6 >>> 2035938616);
                        param2[1 + var5] = (byte)(int)(var6 >>> -1782182928);
                        param2[2 + var5] = (byte)(int)(var6 >>> 955900712);
                        param2[var5 + 3] = (byte)(int)(var6 >>> 2141970336);
                        param2[4 + var5] = (byte)(int)(var6 >>> -1439427048);
                        param2[var5 - -5] = (byte)(int)(var6 >>> 1621561616);
                        param2[var5 - -6] = (byte)(int)(var6 >>> 1119480776);
                        param2[var5 - -7] = (byte)(int)var6;
                        var4_int++;
                        var5 += 8;
                        if (var8 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        return;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_25_1 = stackIn_26_1;
                    if (param2 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, String param1, String param2) {
        RuntimeException runtimeException = null;
        hb var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ff.a(false, -109, param2, param1);
              if (param0 >= 35) {
                break L1;
              } else {
                var4 = (hb) null;
                gi.a(-117, (hb) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final void a(long param0, int param1, byte[] param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = 0;
                        var6 = 8 + -((int)param0 & 7) & 7;
                        var7 = 7 & this.field_g;
                        if (param1 < -51) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var9 = param0;
                        var11 = 31;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 < (var11 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var12 = var12 + ((this.field_i[var11] & 255) - -(255 & (int)var9));
                        this.field_i[var11] = (byte)var12;
                        var12 = var12 >>> 8;
                        var9 = var9 >>> 8;
                        var11--;
                        if (var13 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var13 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (8L >= param0) {
                            statePc = 21;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = param2[var5_int] << var6 & 255 | (param2[var5_int - -1] & 255) >>> -var6 + 8;
                        var15 = var8;
                        var14 = 0;
                        if (var13 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var14 > var15) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var14 != var15) {
                            statePc = 29;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 >= 256) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw new RuntimeException("LOGIC ERROR");
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                        this.field_d = this.field_d + 1;
                        this.field_g = this.field_g + (8 - var7);
                        if (512 == this.field_g) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.a(16);
                        this.field_d = 0;
                        this.field_g = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        this.field_h[this.field_d] = (byte)ch.a(var8 << -var7 + 8, 255);
                        param0 = param0 - 8L;
                        var5_int++;
                        this.field_g = this.field_g + var7;
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((param0 ^ -1L) >= -1L) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var8 = param2[var5_int] << var6 & 255;
                        this.field_h[this.field_d] = (byte)bd.a((int) this.field_h[this.field_d], var8 >>> var7);
                        if (var13 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = 0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if ((param0 + (long)var7 ^ -1L) <= -9L) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        this.field_g = (int)((long)this.field_g + param0);
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        this.field_g = this.field_g + (-var7 + 8);
                        param0 = param0 - (long)(8 - var7);
                        this.field_d = this.field_d + 1;
                        if (-513 != (this.field_g ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        this.a(16);
                        this.field_g = 0;
                        this.field_d = 0;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        this.field_h[this.field_d] = (byte)ch.a(var8 << 8 + -var7, 255);
                        this.field_g = this.field_g + (int)param0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_33_0 = (RuntimeException) (var5);
                    stackIn_32_0 = stackIn_33_0;
                    stackIn_33_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',');
                    stackIn_32_1 = stackIn_33_1;
                    if (param2 == null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    throw la.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
                }
                case 35: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        long dupTemp$2 = 0L;
        long arrayValue$3 = 0L;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int statePc = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        hb var7 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var2 = 0;
                    var3 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 61;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    this.field_n[var2] = hd.a(hd.a(hd.a(sk.a((long)this.field_h[var3 - -5], 255L) << -1933703344, hd.a(hd.a(sk.a((long)this.field_h[3 + var3] << -1861031328, 1095216660480L), hd.a(hd.a(sk.a((long)this.field_h[1 + var3] << 804360944, 71776119061217280L), (long)this.field_h[var3] << 744230520), sk.a((long)this.field_h[var3 + 2] << 867267688, 280375465082880L))), sk.a((long)this.field_h[var3 + 4], 255L) << 925766488)), sk.a((long)this.field_h[var3 - -6], 255L) << 1475049800), sk.a((long)this.field_h[var3 + 7], 255L));
                    var3 += 8;
                    var2++;
                    if (var6 != 0) {
                        statePc = 62;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var6 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 9;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    dupTemp$0 = this.field_k[var2];
                    arrayValue$1 = this.field_n[var2];
                    this.field_f[var2] = dupTemp$0;
                    this.field_m[var2] = hd.a(arrayValue$1, dupTemp$0);
                    var2++;
                    if (var6 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var6 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var2 = 1;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 48;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_49_0 = 0;
                    stackIn_12_0 = stackIn_49_0;
                    if (var6 != 0) {
                        statePc = 49;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var3 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    this.field_b[var3] = 0L;
                    var4 = 0;
                    stackIn_23_0 = 56;
                    stackIn_15_0 = stackIn_23_0;
                    if (var6 != 0) {
                        statePc = 23;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var5 = stackIn_15_0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 21;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (var6 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var3++;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    if (var6 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    var3 = stackIn_23_0;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    this.field_f[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (var6 == 0) {
                        statePc = 24;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 40;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    this.field_b[var3] = this.field_f[var3];
                    var4 = 0;
                    stackIn_41_0 = 56;
                    stackIn_33_0 = stackIn_41_0;
                    if (var6 != 0) {
                        statePc = 41;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var5 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 38;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var4)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 39;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (var6 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var3++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var6 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = 0;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var3 = stackIn_41_0;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 46;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    this.field_m[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 47;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (var6 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var2++;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackIn_49_0 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var2 = stackIn_49_0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (var2 < 8) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    if (param0 == 16) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    return;
                }
                case 54: {
                    this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    return;
                }
                case 56: {
                    if (var6 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (param0 == 16) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    return;
                }
                case 61: {
                    var2 = 0;
                    statePc = 62;
                    continue stateLoop;
                }
                case 62: {
                    if ((var2 ^ -1) <= -9) {
                        statePc = 118;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    dupTemp$2 = this.field_k[var2];
                    arrayValue$3 = this.field_n[var2];
                    this.field_f[var2] = dupTemp$2;
                    this.field_m[var2] = hd.a(arrayValue$3, dupTemp$2);
                    var2++;
                    if (var6 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (var6 == 0) {
                        statePc = 62;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var2 = 1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 104;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    stackIn_105_0 = 0;
                    stackIn_68_0 = stackIn_105_0;
                    if (var6 != 0) {
                        statePc = 105;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    var3 = stackIn_68_0;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 78;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    this.field_b[var3] = 0L;
                    var4 = 0;
                    stackIn_79_0 = 56;
                    stackIn_71_0 = stackIn_79_0;
                    if (var6 != 0) {
                        statePc = 79;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var5 = stackIn_71_0;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 77;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (var6 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    var3++;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    if (var6 == 0) {
                        statePc = 69;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_79_0 = 0;
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var3 = stackIn_79_0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 84;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    this.field_f[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 86;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (var6 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 84: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 86;
                    continue stateLoop;
                }
                case 85: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var3 = 0;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    this.field_b[var3] = this.field_f[var3];
                    var4 = 0;
                    stackIn_97_0 = 56;
                    stackIn_89_0 = stackIn_97_0;
                    if (var6 != 0) {
                        statePc = 97;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var5 = stackIn_89_0;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 94;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var4)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (var6 == 0) {
                        statePc = 90;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    var3++;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (var6 == 0) {
                        statePc = 87;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    stackIn_97_0 = 0;
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    var3 = stackIn_97_0;
                    statePc = 98;
                    continue stateLoop;
                }
                case 98: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    this.field_m[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 103;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 100: {
                    if (var6 == 0) {
                        statePc = 98;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var2++;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    if (var6 == 0) {
                        statePc = 66;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    stackIn_105_0 = 0;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    var2 = stackIn_105_0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var2 < 8) {
                        statePc = 111;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (param0 == 16) {
                        statePc = 109;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    return;
                }
                case 111: {
                    this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    return;
                }
                case 113: {
                    if (var6 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (param0 == 16) {
                        statePc = 116;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    return;
                }
                case 116: {
                    return;
                }
                case 118: {
                    var2 = 1;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (-11 > (var2 ^ -1)) {
                        statePc = 157;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    stackIn_158_0 = 0;
                    stackIn_121_0 = stackIn_158_0;
                    if (var6 != 0) {
                        statePc = 158;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    var3 = stackIn_121_0;
                    statePc = 122;
                    continue stateLoop;
                }
                case 122: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 131;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    this.field_b[var3] = 0L;
                    var4 = 0;
                    stackIn_132_0 = 56;
                    stackIn_124_0 = stackIn_132_0;
                    if (var6 != 0) {
                        statePc = 132;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    var5 = stackIn_124_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (-9 >= (var4 ^ -1)) {
                        statePc = 129;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a((int)(this.field_f[ch.a(var3 + -var4, 7)] >>> var5), 255)]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var6 == 0) {
                        statePc = 125;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var3++;
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    if (var6 == 0) {
                        statePc = 122;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackIn_132_0 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    var3 = stackIn_132_0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 137;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    this.field_f[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (var6 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 137: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 138: {
                    this.field_f[0] = hd.a(this.field_f[0], nc.field_g[var2]);
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var3 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 149;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    this.field_b[var3] = this.field_f[var3];
                    var4 = 0;
                    stackIn_150_0 = 56;
                    stackIn_142_0 = stackIn_150_0;
                    if (var6 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var5 = stackIn_142_0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if ((var4 ^ -1) <= -9) {
                        statePc = 147;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    this.field_b[var3] = hd.a(this.field_b[var3], nc.field_d[var4][ch.a(255, (int)(this.field_m[ch.a(7, var3 - var4)] >>> var5))]);
                    var4++;
                    var5 -= 8;
                    if (var6 != 0) {
                        statePc = 148;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    if (var6 == 0) {
                        statePc = 143;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var3++;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var6 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackIn_150_0 = 0;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var3 = stackIn_150_0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (-9 >= (var3 ^ -1)) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    this.field_m[var3] = this.field_b[var3];
                    var3++;
                    if (var6 != 0) {
                        statePc = 156;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (var6 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var2++;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (var6 == 0) {
                        statePc = 119;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackIn_158_0 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var2 = stackIn_158_0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    if (var2 >= 8) {
                        statePc = 166;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    this.field_k[var2] = hd.a(this.field_k[var2], hd.a(this.field_n[var2], this.field_m[var2]));
                    var2++;
                    if (var6 == 0) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    return;
                }
                case 162: {
                    if (var6 == 0) {
                        statePc = 159;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (param0 == 16) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    return;
                }
                case 165: {
                    return;
                }
                case 166: {
                    if (param0 == 16) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var7 = (hb) null;
                    gi.a(-34, (hb) null);
                    return;
                }
                case 168: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    gi() {
        this.field_k = new long[8];
        this.field_f = new long[8];
        this.field_i = new byte[32];
        this.field_b = new long[8];
        this.field_d = 0;
        this.field_n = new long[8];
        this.field_h = new byte[64];
        this.field_m = new long[8];
        this.field_g = 0;
    }

    static {
        field_j = new int[8192];
        field_l = new pj();
    }
}
