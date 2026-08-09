/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements Runnable {
    static java.awt.Color field_e;
    private hl field_d;
    private Thread field_c;
    int field_a;
    private boolean field_b;

    public static void b(int param0) {
        field_e = null;
        if (param0 == 3) {
            return;
        }
        field_e = (java.awt.Color) null;
    }

    final md a(int param0, int param1, bi param2, byte[] param3) {
        md var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        md stackIn_3_0 = null;
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
              var5 = new md();
              var5.field_u = param3;
              var5.field_l = (long)param1;
              if (param0 >= 45) {
                break L1;
              } else {
                var6 = (byte[]) null;
                this.a(113, 43, (bi) null, (byte[]) null);
                break L1;
              }
            }
            var5.field_w = 2;
            var5.field_r = false;
            var5.field_x = param2;
            this.a((byte) -87, var5);
            stackIn_3_0 = (md) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ae.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final md a(bi param0, int param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        md var6 = null;
        int var8 = 0;
        md stackIn_4_0 = null;
        md stackIn_11_0 = null;
        md stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new md();
            var4.field_w = 1;
            var5_ref = this.field_d;
            synchronized (var5_ref) {
              L1: {
                var6 = (md) ((Object) this.field_d.d(125));
                if (param2 <= -100) {
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var6 == null) {
                          break L4;
                        } else {
                          if (var8 != 0) {
                            break L3;
                          } else {
                            L5: {
                              if (((long)param1 ^ -1L) != (var6.field_l ^ -1L)) {
                                break L5;
                              } else {
                                if (param0 != var6.field_x) {
                                  break L5;
                                } else {
                                  if (-3 != (var6.field_w ^ -1)) {
                                    break L5;
                                  } else {
                                    var4.field_u = var6.field_u;
                                    var4.field_m = false;
                                    stackIn_11_0 = (md) (var4);
                                    return stackIn_11_0;
                                  }
                                }
                              }
                            }
                            var6 = (md) ((Object) this.field_d.b(-1));
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      break L3;
                    }
                    break L1;
                  }
                } else {
                  stackIn_4_0 = (md) null;
                  return stackIn_4_0;
                }
              }
            }
            var4.field_u = param0.a(-925871512, param1);
            var4.field_r = true;
            var4.field_m = false;
            stackIn_18_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("ae.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final void a(int param0) {
        try {
            md var4 = null;
            if (param0 != 5) {
                var4 = (md) null;
                this.a((byte) -127, (md) null);
            }
            this.field_b = true;
            synchronized (this.field_d) {
                this.field_d.notifyAll();
            }
            try {
                this.field_c.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, md param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_d;
          synchronized (var3) {
            L0: {
              this.field_d.a(param1, 0);
              if (param0 < -79) {
                this.field_a = this.field_a + 1;
                this.field_d.notifyAll();
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3;

            stackIn_11_1 = new StringBuilder().append("ae.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final md a(int param0, bi param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        md stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new md();
              if (param0 <= -56) {
                break L1;
              } else {
                this.run();
                break L1;
              }
            }
            var4.field_w = 3;
            var4.field_x = param1;
            var4.field_r = false;
            var4.field_l = (long)param2;
            this.a((byte) -94, var4);
            stackIn_3_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ae.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            md var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = SolKnight.field_L ? 1 : 0;
            L0: while (true) {
              if (!this.field_b) {
                var2_ref = this.field_d;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (md) ((Object) this.field_d.c(0));
                    if (var5 == 0) {
                      L2: {
                        L3: {
                          if (var7 == null) {
                            break L3;
                          } else {
                            this.field_a = this.field_a - 1;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        try {
                          L4: {
                            this.field_d.wait();
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
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L1;
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
                          if (-3 == (var7.field_w ^ -1)) {
                            break L8;
                          } else {
                            if (3 == var7.field_w) {
                              var7.field_u = var7.field_x.a(-925871512, (int)var7.field_l);
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        var7.field_x.a((byte) -46, (int)var7.field_l, var7.field_u, var7.field_u.length);
                        break L7;
                      }
                      break L6;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      var2_ref2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      hi.a((Throwable) ((Object) var2_ref2), (String) null, 1);
                      break L9;
                    }
                  }
                  var7.field_m = false;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, da param1) {
        sl var2 = null;
        try {
            if (param0 != 26197) {
                field_e = (java.awt.Color) null;
            }
            sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
            var2 = sl.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ae.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ae(dl param0) {
        RuntimeException runtimeException = null;
        nj var2 = null;
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
                    var3 = SolKnight.field_L ? 1 : 0;
                    this.field_d = new hl();
                    this.field_b = false;
                    this.field_a = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a(5, -51, (Runnable) (this));
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
                        if (var2.field_c != 0) {
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
                        i.a((byte) 90, 10L);
                        if (var3 != 0) {
                            statePc = 13;
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
                        if (2 != var2.field_c) {
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
                        this.field_c = (Thread) (var2.field_e);
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
                    stackIn_11_1 = new StringBuilder().append("ae.<init>(");
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
                    throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = new java.awt.Color(10040319);
    }
}
