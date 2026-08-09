/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj implements gl {
    private int field_a;
    private int field_c;
    static String field_g;
    static boolean field_k;
    private int field_f;
    static String field_e;
    private int field_h;
    private int field_i;
    private mm field_j;
    static ck field_d;
    private int field_b;

    final static void a(byte param0) {
        try {
            Exception var1 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == dj.field_cb) {
                break L0;
              } else {
                try {
                  L1: {
                    dj.field_cb.a(0L, (byte) -109);
                    dj.field_cb.a(de.field_V.field_r, (byte) 117, de.field_V.field_n, 24);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1 = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param0 != 64) {
                    return;
                  } else {
                    de.field_V.field_n = de.field_V.field_n + 24;
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            if (param0 != 64) {
              return;
            } else {
              de.field_V.field_n = de.field_V.field_n + 24;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ke a(int param0, boolean param1) {
        ec var3;
        ec var4;
        ec var5;
        ec var6;
        ke var7;
        ec var8;
        ec var9;
        ke var10;
        ec var11;
        L0: {
          L1: {
            var7 = new ke(4);
            var10 = var7;
            if (!ph.n(-30146)) {
              break L1;
            } else {
              var9 = new ec(20, qn.field_rb, a.field_t);
              var9.field_l = 320 - var9.field_n / 2;
              var9.field_m = 372;
              var10.a(var9, 122);
              if (!client.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var7.a(new ec(22, sf.field_E[0], a.field_t), 127);
          var7.a(new ec(22, sf.field_E[1], a.field_t), 120);
          var7.a(new ec(22, sf.field_E[2], a.field_t), 117);
          var8 = var7.field_f[0];
          var3 = var8;
          var4 = var7.field_f[1];
          var7.field_f[2].field_n = 185;
          var4.field_n = 185;
          var8.field_n = 185;
          var7.field_f[0].field_l = 120 + -(var7.field_f[0].field_n / 2);
          var7.field_f[1].field_l = -(var7.field_f[1].field_n / 2) + 320;
          var7.field_f[2].field_l = -(var7.field_f[2].field_n / 2) + 520;
          var5 = var7.field_f[0];
          var6 = var7.field_f[1];
          var7.field_f[2].field_m = 372;
          var6.field_m = 372;
          var5.field_m = 372;
          break L0;
        }
        var11 = new ec(13, pc.field_f, a.field_t);
        var11.field_l = -(var11.field_n / 2) + 320;
        var11.field_m = 415;
        var10.a(var11, 115);
        var10.field_q = 272;
        var10.field_y = 500;
        var10.field_w = 70;
        var10.field_z = 76;
        var10.a(fc.field_e, param1, -129);
        if (param0 > -3) {
          field_e = (String) null;
          return var10;
        } else {
          return var10;
        }
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        ce stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        b var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param4 instanceof b) {
                            statePc = 3;
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
                        stackIn_4_0 = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_4_0 = (ce) (param4);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = (b) ((Object) stackIn_4_0);
                        hk.a(param4.field_u + param1, param2 - -param4.field_D, param4.field_t, param4.field_y, this.field_b);
                        if (var12 != null) {
                            statePc = 5;
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
                        var7 = -(2 * var12.field_L) + param4.field_t;
                        var8 = var12.field_L + param4.field_u + param1;
                        var9 = param4.field_D + param2 + var12.field_K;
                        hk.b(var8, var9, var7 + var8, var9, this.field_i);
                        if (param3 <= -60) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var10 = -1 + var12.b(true);
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
                        if (-1 < (var10 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        hk.e(var12.b(-1, var10) * var7 / var12.i(-15317) + var8, var9, this.field_h, this.field_a);
                        var10--;
                        if (var11 != 0) {
                            statePc = 19;
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
                        if (var11 == 0) {
                            statePc = 8;
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
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == this.field_j) {
                            statePc = 19;
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
                        this.field_j.b(var12.field_E, var8 - -(var7 / 2), var12.field_K + this.field_j.field_S + var9, this.field_f, this.field_c);
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var6);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("qj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_16_1 = stackIn_17_1;
                    if (param4 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(byte param0) {
        field_d = null;
        field_g = null;
        if (param0 <= 118) {
            return;
        }
        field_e = null;
    }

    final static String a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                field_k = false;
                break L1;
              }
            }
            stackIn_3_0 = un.a(param0, 0, 0, param0.length);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qj.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    qj(mm param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_f = param1;
            this.field_h = param5;
            this.field_a = param6;
            this.field_c = param2;
            this.field_b = param4;
            this.field_j = param0;
            this.field_i = param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "qj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_g = "On";
        field_e = "Location";
    }
}
