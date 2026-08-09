/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements Runnable {
    private ci field_a;
    private boolean field_d;
    int field_c;
    private Thread field_b;

    final void a(byte param0) {
        try {
            if (param0 != -114) {
                this.field_c = -72;
            }
            this.field_d = true;
            synchronized (this.field_a) {
                this.field_a.notifyAll();
            }
            try {
                this.field_b.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, fj param1) {
        synchronized (this.field_a) {
            this.field_a.a(91, param1);
            this.field_c = this.field_c + 1;
            if (param0 <= 58) {
                dl var5 = (dl) null;
                this.a((dl) null, (byte) -50, -68);
            }
            this.field_a.notifyAll();
        }
    }

    final fj a(int param0, dl param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        fj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fj();
            var4.field_j = (long)param0;
            var4.field_p = false;
            var4.field_z = param1;
            var4.field_A = param2;
            this.a(110, var4);
            stackIn_1_0 = (fj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("kl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            fj var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_d) {
                  break L1;
                } else {
                  var2_ref = this.field_a;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (fj) ((Object) this.field_a.a((byte) 100));
                      if (var5 == 0) {
                        L3: {
                          if (var7 != null) {
                            break L3;
                          } else {
                            try {
                              L4: {
                                this.field_a.wait();
                                break L4;
                              }
                            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              L5: {
                                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                                break L5;
                              }
                            }
                            if (var5 == 0) {
                              decompiledRegionSelector0 = 0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        this.field_c = this.field_c - 1;
                        decompiledRegionSelector0 = 1;
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    continue L0;
                  } else {
                    try {
                      L6: {
                        L7: {
                          L8: {
                            if (var7.field_A != 2) {
                              break L8;
                            } else {
                              var7.field_z.a(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (-4 == (var7.field_A ^ -1)) {
                            var7.field_w = var7.field_z.a((int)var7.field_j, -65536);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        break L6;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L9: {
                        var2_ref2 = (Exception) (Object) decompiledCaughtException;
                        var6 = (String) null;
                        uj.a((String) null, (Throwable) ((Object) var2_ref2), 1);
                        break L9;
                      }
                    }
                    var7.field_v = false;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fj a(byte[] param0, int param1, int param2, dl param3) {
        fj var5 = null;
        RuntimeException var5_ref = null;
        dl var6 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                var6 = (dl) null;
                this.a((byte[]) null, -102, -125, (dl) null);
                break L1;
              }
            }
            var5 = new fj();
            var5.field_A = 2;
            var5.field_p = false;
            var5.field_z = param3;
            var5.field_w = param0;
            var5.field_j = (long)param1;
            this.a(param2 ^ 118, var5);
            stackIn_3_0 = (fj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("kl.C(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final fj a(dl param0, byte param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        fj var6 = null;
        int var8 = 0;
        dl var9 = null;
        fj stackIn_11_0 = null;
        fj stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new fj();
            var4.field_A = 1;
            var5_ref = this.field_a;
            synchronized (var5_ref) {
              L1: {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var9 = (dl) null;
                    this.a(30, (dl) null, 85);
                    break L2;
                  }
                }
                var6 = (fj) ((Object) this.field_a.a(true));
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        if (var8 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (((long)param2 ^ -1L) != (var6.field_j ^ -1L)) {
                              break L6;
                            } else {
                              if (var6.field_z != param0) {
                                break L6;
                              } else {
                                if (var6.field_A != 2) {
                                  break L6;
                                } else {
                                  var4.field_v = false;
                                  var4.field_w = var6.field_w;
                                  stackIn_11_0 = (fj) (var4);
                                  return stackIn_11_0;
                                }
                              }
                            }
                          }
                          var6 = (fj) ((Object) this.field_a.a(-256));
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    break L4;
                  }
                  break L1;
                }
              }
            }
            var4.field_w = param0.a(param2, -65536);
            var4.field_p = true;
            var4.field_v = false;
            stackIn_18_0 = (fj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("kl.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(int param0, int param1, int param2, db[] param3, int param4, le param5, int param6, byte param7, db[] param8, boolean param9, int param10, int param11) {
        try {
            int var12_int = 11 / ((18 - param7) / 37);
            pe.a(param10, param1, param2, param5, param0, param8, param3, param6, param5, param0, param4, -98, param11, param10, param9);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kl.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    kl(ab param0) {
        RuntimeException runtimeException = null;
        ei var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Lexicominos.field_L ? 1 : 0;
                    this.field_a = new ci();
                    this.field_d = false;
                    this.field_c = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a((Runnable) (this), false, 5);
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
                        if (0 != var2.field_b) {
                            statePc = 5;
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
                        ge.a(0, 10L);
                        if (var3 != 0) {
                            statePc = 6;
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
                        if (var3 == 0) {
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
                        if ((var2.field_b ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        this.field_b = (Thread) (var2.field_g);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (runtimeException);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("kl.<init>(");
                    stackIn_10_1 = stackIn_11_1;
                    if (param0 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
