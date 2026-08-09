/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vh extends eh {
    static String field_s;
    static int field_t;
    static int field_q;
    private sb field_r;

    final static lb a(ia param0, int param1) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        lb stackIn_38_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.e(8, 8);
            if ((var2_int ^ -1) >= -1) {
              L1: {
                if (param1 >= 85) {
                  break L1;
                } else {
                  vh.h((byte) 12);
                  break L1;
                }
              }
              L2: {
                var3 = od.a(-2, param0) ? 1 : 0;
                var4 = od.a(-2, param0) ? 1 : 0;
                var5 = new lb();
                var5.field_R = (short)param0.e(8, 16);
                var5.field_J = fd.a(16, var5.field_J, -39, param0);
                var5.field_x = fd.a(16, var5.field_x, -118, param0);
                var5.field_q = fd.a(16, var5.field_q, 110, param0);
                var5.field_P = (short)param0.e(8, 16);
                var5.field_z = fd.a(16, var5.field_z, 117, param0);
                var5.field_c = fd.a(16, var5.field_c, 123, param0);
                var5.field_y = fd.a(16, var5.field_y, -108, param0);
                if (var3 != 0) {
                  var5.field_s = (short)param0.e(8, 16);
                  var5.field_N = fd.a(16, var5.field_N, -56, param0);
                  var5.field_a = fd.a(16, var5.field_a, -97, param0);
                  var5.field_o = fd.a(16, var5.field_o, 89, param0);
                  var5.field_Q = fd.a(16, var5.field_Q, 106, param0);
                  var5.field_e = fd.a(16, var5.field_e, 100, param0);
                  var5.field_m = fd.a(16, var5.field_m, -25, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 0) {
                  break L3;
                } else {
                  param0.e(8, 16);
                  var5.field_A = fd.a(16, var5.field_A, 116, param0);
                  var5.field_b = fd.a(16, var5.field_b, 104, param0);
                  var5.field_D = fd.a(16, var5.field_D, -45, param0);
                  var5.field_G = fd.a(16, var5.field_G, -119, param0);
                  var5.field_I = fd.a(16, var5.field_I, 89, param0);
                  break L3;
                }
              }
              L4: {
                if (od.a(-2, param0)) {
                  var5.field_K = fd.a(16, var5.field_K, -82, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (od.a(-2, param0)) {
                  var5.field_u = fb.a(16, var5.field_u, param0, true);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        if ((var5.field_u.length ^ -1) >= (var7 ^ -1)) {
                          break L8;
                        } else {
                          stackIn_31_0 = var6;

                          stackIn_31_1 = var5.field_u[var7] & 255;

                          if (var8 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_31_0 < stackIn_31_1) {
                                var6 = var5.field_u[var7] & 255;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackIn_31_0 = var6 ^ -1;
                      stackIn_31_1 = -1;
                      break L7;
                    }
                    L10: {
                      if (stackIn_31_0 == stackIn_31_1) {
                        break L10;
                      } else {
                        var5.field_O = (byte)(var6 + 1);
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var5.field_u = null;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              stackIn_38_0 = (lb) (var5);
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("vh.R(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L11;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L11;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
        return stackIn_38_0;
    }

    private final void a(byte param0, boolean param1) {
        try {
            rb stackIn_9_0 = null;
            rb stackIn_10_0 = null;
            int stackIn_10_1 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var3 = null;
            RuntimeException var3_ref = null;
            Exception var4 = null;
            try {
              L0: {
                if (null == this.field_r) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        if (param0 == -100) {
                          break L2;
                        } else {
                          vh.a(0, false, (lb) null, -73, 33);
                          break L2;
                        }
                      }
                      L3: {
                        this.field_g.field_g = 0;
                        stackIn_9_0 = this.field_g;

                        if (!param1) {
                          stackIn_10_0 = (rb) ((Object) stackIn_9_0);
                          stackIn_10_1 = 3;
                          break L3;
                        } else {
                          stackIn_10_0 = (rb) ((Object) stackIn_9_0);
                          stackIn_10_1 = 2;
                          break L3;
                        }
                      }
                      ((rb) (Object) stackIn_10_0).a(stackIn_10_1, -125);
                      this.field_g.a((byte) -116, 0L);
                      this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L5: {
                          this.field_r.b((byte) -45);
                          break L5;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L6: {
                          var4 = (Exception) (Object) decompiledCaughtException;
                          break L6;
                        }
                      }
                      this.field_p = this.field_p + 1;
                      this.field_d = -2;
                      this.field_r = null;
                      break L4;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) ((Object) var3_ref), "vh.S(" + param0 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, re param1, int param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        ia var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = d.field_b;
                        var3.d((byte) 81, param0);
                        var3.field_g = var3.field_g + 1;
                        var4 = var3.field_g;
                        var3.a(1, -65);
                        var3.c(param1.field_g, -306);
                        var3.c(param1.field_n, -306);
                        var3.c(param1.field_h, -306);
                        var3.c((byte) -70, param1.field_i);
                        var3.c((byte) -119, param1.field_m);
                        var3.c((byte) -116, param1.field_p);
                        var3.c((byte) -97, param1.field_j);
                        var3.a(param1.field_o.length, -91);
                        var5 = param2;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((param1.field_o.length ^ -1) >= (var5 ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3.c((byte) -117, param1.field_o[var5]);
                        var5++;
                        if (var6 != 0) {
                            statePc = 14;
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
                        if (var6 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3.b((byte) -75, var4);
                        var3.b(var3.field_g - var4, 31700);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var3_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3_ref);
                    stackIn_10_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("vh.Q(").append(param0).append(',');
                    stackIn_10_1 = stackIn_12_1;
                    if (param1 == null) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (this.field_r == null) {
                break L1;
              } else {
                this.field_r.b((byte) -106);
                break L1;
              }
            }
            L2: {
              if (param0 == -4628) {
                break L2;
              } else {
                this.field_r = (sb) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "vh.H(" + param0 + ')');
        }
    }

    final void a(Object param0, int param1, boolean param2) {
        try {
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            Exception var4 = null;
            ra var4_ref = null;
            IOException var4_ref2 = null;
            RuntimeException var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == this.field_r) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            this.field_r.b((byte) -71);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = ((Object) stateCaught_2 instanceof Exception ? 4 : 38);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4 = (Exception) ((Object) caughtException);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.field_r = null;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_r = (sb) (param0);
                            this.i((byte) 100);
                            this.a((byte) -100, param2);
                            this.field_a = null;
                            this.field_f.field_g = 0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref = (ra) ((Object) this.field_i.c(8));
                            if (var4_ref != null) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var6 != 0) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.field_m.a(22197, var4_ref);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var6 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref = (ra) ((Object) this.field_k.c(8));
                            if (null != var4_ref) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var6 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var6 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            this.field_o.a(22197, var4_ref);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var6 == 0) {
                                statePc = 15;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (param1 > 17) {
                                statePc = 26;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            this.field_r = (sb) null;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((this.field_b ^ -1) != -1) {
                                statePc = 29;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            this.field_g.field_g = 0;
                            this.field_g.a(4, -125);
                            this.field_g.a((int) this.field_b, -87);
                            this.field_g.c((byte) -85, 0);
                            this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = ((Object) stateCaught_29 instanceof IOException ? 31 : 38);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var4_ref2 = (IOException) ((Object) caughtException);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.field_r.b((byte) -43);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof Exception ? 34 : 38);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var5 = (Exception) ((Object) caughtException);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            this.field_r = null;
                            this.field_d = -2;
                            this.field_p = this.field_p + 1;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            this.field_l = 0;
                            this.field_e = dd.b(121);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        var4_ref3 = (RuntimeException) ((Object) caughtException);
                        stackIn_41_0 = (RuntimeException) (var4_ref3);
                        stackIn_39_0 = stackIn_41_0;
                        stackIn_41_1 = new StringBuilder().append("vh.C(");
                        stackIn_39_1 = stackIn_41_1;
                        if (param0 == null) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        stackIn_42_0 = (RuntimeException) ((Object) stackIn_39_0);
                        stackIn_42_1 = (StringBuilder) ((Object) stackIn_39_1);
                        stackIn_42_2 = "{...}";
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 41: {
                        stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                        stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                        stackIn_42_2 = "null";
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        throw sd.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ',' + param2 + ')');
                    }
                    case 43: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == -98) {
                break L1;
              } else {
                field_t = -12;
                break L1;
              }
            }
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "vh.T(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1, lb param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        boolean stackOut_13_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = StarCannon.field_A;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = td.a(3 * (-param0 + param4), (byte) 41);
                        if (param3 == -6787) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        vh.a((ia) null, -87);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = 3 * param0;
                        var7 = var5_int - 10;
                        ed.d(-121);
                        if (-1 <= (param2.field_O ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param2.field_u != null) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ae.a(-5607);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        wj.field_e = 0;
                        var8 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var8 >= param2.field_P) {
                            statePc = 50;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = param2.field_z[var8];
                        var10 = param2.field_c[var8];
                        var11 = param2.field_y[var8];
                        stackOut_13_0 = param1;
                        stackIn_51_0 = stackOut_13_0 ? 1 : 0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var19 != 0) {
                            statePc = 51;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (!stackIn_14_0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = bh.field_c[var9];
                        var13 = ri.field_a[var9];
                        var14 = bh.field_c[var10] - var12;
                        var15 = -var12 + bh.field_c[var11];
                        var16 = ri.field_a[var10] - var13;
                        var17 = -var13 + ri.field_a[var11];
                        if ((-(var16 * var15) + var14 * var17 ^ -1) <= -1) {
                            statePc = 49;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = sc.field_d[var9];
                        if (-2147483648 != var12) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 = sc.field_d[var10];
                        if (-2147483648 == var13) {
                            statePc = 49;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var14 = sc.field_d[var11];
                        if (var14 != -2147483648) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var15 = var14 + (var13 + var12) - var6;
                        stackIn_30_0 = -1;
                        stackIn_28_0 = stackIn_30_0;
                        stackIn_30_1 = jf.field_a.length;
                        stackIn_28_1 = stackIn_30_1;
                        if (-1 < (var7 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = stackIn_28_0;
                        stackIn_31_1 = stackIn_28_1;
                        stackIn_31_2 = var15 >> var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = stackIn_30_0;
                        stackIn_31_1 = stackIn_30_1;
                        stackIn_31_2 = var15 << -var7;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var16 = stackIn_31_0 + (stackIn_31_1 - stackIn_31_2);
                        var17 = jf.field_a[var16];
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (0 == var17 >> 1402338916) {
                            statePc = 41;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var16--;
                        stackIn_42_0 = -1;
                        stackIn_34_0 = stackIn_42_0;
                        stackIn_42_1 = var16 ^ -1;
                        stackIn_34_1 = stackIn_42_1;
                        if (var19 != 0) {
                            statePc = 42;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 >= stackIn_34_1) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        System.err.println("Out of range!");
                        if (var19 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var17 = jf.field_a[var16];
                        if (var19 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_42_0 = var16 << -821203548;
                        stackIn_42_1 = -var17;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var18 = stackIn_42_0 - stackIn_42_1;
                        ih.field_d[var18] = var8;
                        jf.field_a[var16] = 1 + var17;
                        if (0 >= param2.field_O) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null == param2.field_u) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        dupTemp$0 = param2.field_u[var8];
                        jb.field_h[dupTemp$0] = jb.field_h[dupTemp$0] + 1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        wj.field_e = wj.field_e + 1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var8++;
                        if (var19 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackIn_51_0 = -1;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 <= (param2.field_O ^ -1)) {
                            statePc = 67;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (param2.field_u == null) {
                            statePc = 67;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var9 >= jb.field_h.length) {
                            statePc = 67;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var10 = jb.field_h[var9];
                        jb.field_h[var9] = var8;
                        var8 = var8 + var10;
                        var9++;
                        if (var19 != 0) {
                            statePc = 67;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (var19 == 0) {
                            statePc = 56;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_65_0 = (RuntimeException) (var5);
                    stackIn_63_0 = stackIn_65_0;
                    stackIn_65_1 = new StringBuilder().append("vh.O(").append(param0).append(',').append(param1).append(',');
                    stackIn_63_1 = stackIn_65_1;
                    if (param2 == null) {
                        statePc = 65;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_63_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_63_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    throw sd.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void i(byte param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            try {
              L0: {
                L1: {
                  if (param0 > 34) {
                    break L1;
                  } else {
                    this.field_r = (sb) null;
                    break L1;
                  }
                }
                if (null == this.field_r) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  try {
                    L2: {
                      this.field_g.field_g = 0;
                      this.field_g.a(6, -67);
                      this.field_g.a(3, (byte) -39);
                      this.field_g.c(0, -306);
                      this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                      break L2;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var2 = (IOException) (Object) decompiledCaughtException;
                      try {
                        L4: {
                          this.field_r.b((byte) -110);
                          break L4;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L5: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          break L5;
                        }
                      }
                      this.field_d = -2;
                      this.field_p = this.field_p + 1;
                      this.field_r = null;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw sd.a((Throwable) ((Object) var2_ref), "vh.P(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(byte param0) {
        try {
            int stackIn_21_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_42_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_84_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_105_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_151_0 = 0;
            int stackIn_161_0 = 0;
            int stackIn_163_0 = 0;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            long var2_long = 0L;
            ra var2 = null;
            int var2_int = 0;
            IOException var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ra var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = StarCannon.field_A;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != this.field_r) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2_long = dd.b(82);
                            var4 = (int)(-this.field_e + var2_long);
                            if (-201 <= (var4 ^ -1)) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = 200;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.field_e = var2_long;
                            this.field_l = this.field_l + var4;
                            if (-30001 > (this.field_l ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.field_r.b((byte) -66);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 11 : 164);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5_ref_Exception = (Exception) ((Object) caughtException);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.field_r = null;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (this.field_r != null) {
                                statePc = 24;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (0 != this.e((byte) -22)) {
                                statePc = 22;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((this.c((byte) -79) ^ -1) != -1) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackIn_21_0 = 1;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            stackIn_23_0 = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0 != 0;
                    }
                    case 24: {
                        try {
                            this.field_r.a((byte) 126);
                            var2 = (ra) ((Object) this.field_m.a((byte) 127));
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = ((Object) stateCaught_24 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2 == null) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = ((Object) stateCaught_25 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            this.field_g.field_g = 0;
                            this.field_g.a(1, -97);
                            this.field_g.a((byte) -50, var2.field_j);
                            this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                            this.field_i.a(22197, var2);
                            var2 = (ra) ((Object) this.field_m.a(-99));
                            if (var16 != 0) {
                                statePc = 31;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = ((Object) stateCaught_26 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var16 == 0) {
                                statePc = 25;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = ((Object) stateCaught_27 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = ((Object) stateCaught_28 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2 = (ra) ((Object) this.field_o.a((byte) 120));
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = ((Object) stateCaught_30 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (null == var2) {
                                statePc = 36;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = ((Object) stateCaught_31 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            this.field_g.field_g = 0;
                            this.field_g.a(0, param0 + -55);
                            this.field_g.a((byte) -78, var2.field_j);
                            this.field_r.a(0, this.field_g.field_f, (byte) 87, this.field_g.field_f.length);
                            this.field_k.a(22197, var2);
                            var2 = (ra) ((Object) this.field_o.a(-88));
                            if (var16 != 0) {
                                statePc = 39;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = ((Object) stateCaught_32 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var16 == 0) {
                                statePc = 31;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = ((Object) stateCaught_33 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = ((Object) stateCaught_34 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (param0 == -62) {
                                statePc = 39;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = ((Object) stateCaught_36 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.field_r = (sb) null;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = ((Object) stateCaught_37 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var2_int = 0;
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = ((Object) stateCaught_39 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-101 >= (var2_int ^ -1)) {
                                statePc = 150;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = ((Object) stateCaught_40 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var3_int = this.field_r.c(66);
                            stackIn_151_0 = var3_int ^ -1;
                            stackIn_42_0 = stackIn_151_0;
                            if (var16 != 0) {
                                statePc = 151;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = ((Object) stateCaught_41 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (stackIn_42_0 <= -1) {
                                statePc = 47;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = ((Object) stateCaught_42 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = ((Object) stateCaught_43 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if ((var3_int ^ -1) == -1) {
                                statePc = 150;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = ((Object) stateCaught_47 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            this.field_l = 0;
                            var4 = 0;
                            if (null == this.field_a) {
                                statePc = 55;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = ((Object) stateCaught_48 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (this.field_a.field_v == 0) {
                                statePc = 54;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = ((Object) stateCaught_49 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = ((Object) stateCaught_50 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = ((Object) stateCaught_52 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = ((Object) stateCaught_54 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var4 = 10;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = ((Object) stateCaught_55 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var4 <= 0) {
                                statePc = 124;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = ((Object) stateCaught_56 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var5 = -this.field_f.field_g + var4;
                            if (var5 <= var3_int) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = ((Object) stateCaught_57 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var5 = var3_int;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = ((Object) stateCaught_58 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            this.field_r.a(this.field_f.field_g, 32498, var5, this.field_f.field_f);
                            if (0 == this.field_b) {
                                statePc = 66;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = ((Object) stateCaught_59 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var6 = 0;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = ((Object) stateCaught_60 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if ((var6 ^ -1) <= (var5 ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = ((Object) stateCaught_61 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            this.field_f.field_f[var6 + this.field_f.field_g] = (byte)dg.a((int) this.field_f.field_f[var6 + this.field_f.field_g], (int) this.field_b);
                            var6++;
                            if (var16 != 0) {
                                statePc = 67;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = ((Object) stateCaught_62 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var16 == 0) {
                                statePc = 61;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = ((Object) stateCaught_63 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = ((Object) stateCaught_64 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            this.field_f.field_g = this.field_f.field_g + var5;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = ((Object) stateCaught_66 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if ((this.field_f.field_g ^ -1) <= (var4 ^ -1)) {
                                statePc = 71;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = ((Object) stateCaught_67 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var16 == 0) {
                                statePc = 149;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = ((Object) stateCaught_68 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = ((Object) stateCaught_69 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (this.field_a == null) {
                                statePc = 76;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = ((Object) stateCaught_71 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = ((Object) stateCaught_72 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = ((Object) stateCaught_74 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            this.field_f.field_g = 0;
                            var6 = this.field_f.j(param0 ^ -7897);
                            var7 = this.field_f.f((byte) -114);
                            var8 = this.field_f.j(7909);
                            var9 = this.field_f.f((byte) -114);
                            var10 = 127 & var8;
                            if (-1 == (128 & var8 ^ -1)) {
                                statePc = 79;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = ((Object) stateCaught_76 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_80_0 = 1;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = ((Object) stateCaught_77 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackIn_80_0 = 0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = ((Object) stateCaught_79 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var11 = stackIn_80_0;
                            var12 = (long)var7 + ((long)var6 << 1589887328);
                            var14 = null;
                            if (var11 != 0) {
                                statePc = 93;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = ((Object) stateCaught_80 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var14_ref = (ra) ((Object) this.field_i.a((byte) 125));
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = ((Object) stateCaught_81 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (var14_ref == null) {
                                statePc = 100;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = ((Object) stateCaught_82 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackIn_105_0 = (var14_ref.field_j < var12 ? -1 : (var14_ref.field_j == var12 ? 0 : 1));
                            stackIn_84_0 = stackIn_105_0;
                            if (var16 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = ((Object) stateCaught_83 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackIn_86_0 = stackIn_84_0;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = ((Object) stateCaught_84 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (stackIn_86_0 != 0) {
                                statePc = 92;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = ((Object) stateCaught_86 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = ((Object) stateCaught_87 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (var16 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = ((Object) stateCaught_89 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = ((Object) stateCaught_90 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var14_ref = (ra) ((Object) this.field_i.a(-112));
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = ((Object) stateCaught_92 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var14_ref = (ra) ((Object) this.field_k.a((byte) 124));
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = ((Object) stateCaught_93 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var14_ref == null) {
                                statePc = 100;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = ((Object) stateCaught_94 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            stackIn_105_0 = (var12 < var14_ref.field_j ? -1 : (var12 == var14_ref.field_j ? 0 : 1));
                            stackIn_96_0 = stackIn_105_0;
                            if (var16 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = ((Object) stateCaught_95 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (stackIn_96_0 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = ((Object) stateCaught_96 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = ((Object) stateCaught_97 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var14_ref = (ra) ((Object) this.field_k.a(-93));
                            if (var16 == 0) {
                                statePc = 94;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = ((Object) stateCaught_99 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (var14_ref == null) {
                                statePc = 103;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = ((Object) stateCaught_100 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = ((Object) stateCaught_101 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = ((Object) stateCaught_103 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            stackIn_105_0 = var10;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = ((Object) stateCaught_104 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (stackIn_105_0 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = ((Object) stateCaught_105 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            stackIn_109_0 = 9;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = ((Object) stateCaught_106 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            stackIn_109_0 = 5;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = ((Object) stateCaught_108 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var15 = stackIn_109_0;
                            this.field_a = var14_ref;
                            this.field_a.field_u = new rb(var9 + var15 + this.field_a.field_w);
                            this.field_a.field_u.a(var10, -96);
                            this.field_a.field_u.c((byte) -105, var9);
                            this.field_f.field_g = 0;
                            this.field_a.field_v = 10;
                            if (var16 == 0) {
                                statePc = 149;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = ((Object) stateCaught_109 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if (0 != this.field_a.field_v) {
                                statePc = 122;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = ((Object) stateCaught_110 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = ((Object) stateCaught_111 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            if (-1 == this.field_f.field_f[0]) {
                                statePc = 119;
                            } else {
                                statePc = 114;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = ((Object) stateCaught_113 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = ((Object) stateCaught_114 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            this.field_a = null;
                            if (var16 == 0) {
                                statePc = 149;
                            } else {
                                statePc = 117;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = ((Object) stateCaught_116 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = ((Object) stateCaught_117 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            this.field_a.field_v = 1;
                            this.field_f.field_g = 0;
                            if (var16 == 0) {
                                statePc = 149;
                            } else {
                                statePc = 120;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = ((Object) stateCaught_119 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = ((Object) stateCaught_120 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = ((Object) stateCaught_122 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            var5 = this.field_a.field_u.field_f.length - this.field_a.field_w;
                            var6 = -this.field_a.field_v + 512;
                            if (var6 > -this.field_a.field_u.field_g + var5) {
                                statePc = 127;
                            } else {
                                statePc = 125;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = ((Object) stateCaught_124 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            statePc = 128;
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = ((Object) stateCaught_125 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            var6 = var5 + -this.field_a.field_u.field_g;
                            statePc = 128;
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = ((Object) stateCaught_127 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            if (var3_int >= var6) {
                                statePc = 130;
                            } else {
                                statePc = 129;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = ((Object) stateCaught_128 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            var6 = var3_int;
                            statePc = 130;
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = ((Object) stateCaught_129 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            this.field_r.a(this.field_a.field_u.field_g, 32498, var6, this.field_a.field_u.field_f);
                            if (0 != this.field_b) {
                                statePc = 133;
                            } else {
                                statePc = 131;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = ((Object) stateCaught_130 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            statePc = 139;
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = ((Object) stateCaught_131 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            var7 = 0;
                            statePc = 134;
                            continue stateLoop;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = ((Object) stateCaught_133 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            if ((var6 ^ -1) >= (var7 ^ -1)) {
                                statePc = 139;
                            } else {
                                statePc = 135;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = ((Object) stateCaught_134 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            this.field_a.field_u.field_f[var7 + this.field_a.field_u.field_g] = (byte)dg.a((int) this.field_a.field_u.field_f[var7 + this.field_a.field_u.field_g], (int) this.field_b);
                            var7++;
                            if (var16 != 0) {
                                statePc = 140;
                            } else {
                                statePc = 136;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = ((Object) stateCaught_135 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            if (var16 == 0) {
                                statePc = 134;
                            } else {
                                statePc = 137;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = ((Object) stateCaught_136 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            statePc = 139;
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = ((Object) stateCaught_137 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            this.field_a.field_u.field_g = this.field_a.field_u.field_g + var6;
                            this.field_a.field_v = this.field_a.field_v + var6;
                            statePc = 140;
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = ((Object) stateCaught_139 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            if (var5 == this.field_a.field_u.field_g) {
                                statePc = 147;
                            } else {
                                statePc = 141;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = ((Object) stateCaught_140 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            if (512 != this.field_a.field_v) {
                                statePc = 149;
                            } else {
                                statePc = 142;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = ((Object) stateCaught_141 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            statePc = 144;
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = ((Object) stateCaught_142 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            this.field_a.field_v = 0;
                            if (var16 == 0) {
                                statePc = 149;
                            } else {
                                statePc = 145;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = ((Object) stateCaught_144 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = ((Object) stateCaught_145 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            this.field_a.a(param0 + -6180);
                            this.field_a.field_r = false;
                            this.field_a = null;
                            statePc = 149;
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = ((Object) stateCaught_147 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 40;
                            } else {
                                statePc = 150;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = ((Object) stateCaught_149 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            stackIn_151_0 = 1;
                            statePc = 151;
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = ((Object) stateCaught_150 instanceof IOException ? 152 : 164);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        return stackIn_151_0 != 0;
                    }
                    case 152: {
                        try {
                            var2_ref = (IOException) ((Object) caughtException);
                            statePc = 153;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            this.field_r.b((byte) -41);
                            statePc = 154;
                            continue stateLoop;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = ((Object) stateCaught_153 instanceof Exception ? 155 : 164);
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            statePc = 156;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            statePc = 156;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            this.field_d = -2;
                            this.field_r = null;
                            this.field_p = this.field_p + 1;
                            if (this.e((byte) -61) != 0) {
                                statePc = 162;
                            } else {
                                statePc = 157;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            if (this.c((byte) -79) != 0) {
                                statePc = 162;
                            } else {
                                statePc = 158;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            statePc = 160;
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 160: {
                        try {
                            stackIn_161_0 = 1;
                            statePc = 161;
                            continue stateLoop;
                        } catch (Throwable stateCaught_160) {
                            caughtException = stateCaught_160;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        return stackIn_161_0 != 0;
                    }
                    case 162: {
                        try {
                            stackIn_163_0 = 0;
                            statePc = 163;
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = 164;
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        return stackIn_163_0 != 0;
                    }
                    case 164: {
                        var2_ref2 = (RuntimeException) ((Object) caughtException);
                        throw sd.a((Throwable) ((Object) var2_ref2), "vh.F(" + param0 + ')');
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vh() {
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              L2: {
                if ((var2_int ^ -1) >= (var4 ^ -1)) {
                  break L2;
                } else {
                  var3[var2_int + (-1 + -var4)] = param0.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = new String(var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("vh.N(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void a(byte param0) {
        if (param0 <= 118) {
            field_s = (String) null;
        }
        try {
            this.field_r.b((byte) -105);
        } catch (Exception exception) {
        }
        this.field_p = this.field_p + 1;
        this.field_r = null;
        this.field_d = -1;
        this.field_b = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    static {
        field_s = "This password contains your email address, and would be easy to guess";
        field_t = -1;
    }
}
