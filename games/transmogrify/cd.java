/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd implements Runnable {
    static int field_b;
    static pg field_f;
    private bk field_c;
    private Thread field_a;
    int field_e;
    private boolean field_d;

    final cl a(int param0, ak param1, byte param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        cl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new cl();
              var4.field_p = false;
              var4.field_C = param1;
              var4.field_z = 3;
              var4.field_j = (long)param0;
              if (param2 == 67) {
                break L1;
              } else {
                this.field_c = (bk) null;
                break L1;
              }
            }
            this.a(param2 + -4641, var4);
            stackIn_3_0 = (cl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("cd.F(").append(param0).append(',');

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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0) {
        try {
            this.field_d = true;
            synchronized (this.field_c) {
                this.field_c.notifyAll();
            }
            if (param0 != -20444) {
                return;
            }
            try {
                this.field_a.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ti a(int param0, int param1, byte param2) {
        ti var3 = null;
        int var4 = 0;
        int var5 = 0;
        ti stackIn_6_0 = null;
        ti stackIn_8_0 = null;
        ti stackIn_13_0 = null;
        ti stackIn_14_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    var3 = new ti(param1, param1);
                    if (param2 < -18) {
                        statePc = 9;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    cd.b(92);
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (var4 < var3.field_w.length) {
                        statePc = 5;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return var3;
                }
                case 5: {
                    stackIn_8_0 = (ti) (var3);
                    stackIn_6_0 = stackIn_8_0;
                    if (var5 != 0) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_6_0.field_w[var4] = param0;
                    var4++;
                    if (var5 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = (ti) (var3);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var4 = 0;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    if (var4 < var3.field_w.length) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return var3;
                }
                case 12: {
                    stackIn_14_0 = (ti) (var3);
                    stackIn_13_0 = stackIn_14_0;
                    if (var5 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    stackIn_14_0.field_w[var4] = param0;
                    var4++;
                    if (var5 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, cl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this.field_c;
            synchronized (var3_ref) {
              L1: {
                this.field_c.a((byte) -128, param1);
                this.field_e = this.field_e + 1;
                this.field_c.notifyAll();
                break L1;
              }
            }
            if (param0 == -4574) {
              break L0;
            } else {
              cd.a(3, 60, (byte) 39);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("cd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            cd.a(-105);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final cl a(ak param0, byte[] param1, int param2, int param3) {
        cl var5 = null;
        RuntimeException var5_ref = null;
        cl stackIn_3_0 = null;
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
              var5 = new cl();
              var5.field_j = (long)param3;
              if (param2 <= -76) {
                break L1;
              } else {
                field_f = (pg) null;
                break L1;
              }
            }
            var5.field_C = param0;
            var5.field_p = false;
            var5.field_z = 2;
            var5.field_B = param1;
            this.a(-4574, var5);
            stackIn_3_0 = (cl) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("cd.H(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final cl a(ak param0, int param1, boolean param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cl var6 = null;
        int var8 = 0;
        cl stackIn_10_0 = null;
        cl stackIn_18_0 = null;
        cl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cl stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new cl();
            var4.field_z = 1;
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                var6 = (cl) ((Object) this.field_c.b((byte) 114));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackIn_20_0 = (cl) (var6);

                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if ((stackIn_20_0.field_j ^ -1L) != ((long)param1 ^ -1L)) {
                            break L4;
                          } else {
                            if (param0 != var6.field_C) {
                              break L4;
                            } else {
                              if (var6.field_z == 2) {
                                var4.field_B = var6.field_B;
                                var4.field_m = false;
                                stackIn_10_0 = (cl) (var4);
                                return stackIn_10_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var6 = (cl) ((Object) this.field_c.a(108));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            }
            L5: {
              if (decompiledRegionSelector0 == 0) {
                break L5;
              } else {
                L6: {
                  var4.field_B = param0.b(-88, param1);
                  var4.field_m = false;
                  stackIn_18_0 = (cl) (var4);

                  if (!param2) {
                    stackIn_19_0 = (cl) ((Object) stackIn_18_0);
                    stackIn_19_1 = 0;
                    break L6;
                  } else {
                    stackIn_19_0 = (cl) ((Object) stackIn_18_0);
                    stackIn_19_1 = 1;
                    break L6;
                  }
                }
                stackIn_19_0.field_p = stackIn_19_1 != 0;
                stackIn_20_0 = (cl) (var4);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("cd.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0;
    }

    final static String b(int param0) {
        int var1;
        var1 = -99 / ((-15 - param0) / 46);
        if (rh.field_v != of.field_d) {
          if (db.field_a == of.field_d) {
            return jh.field_g;
          } else {
            if (!dl.field_l.b(-26753)) {
              return jh.field_g;
            } else {
              return ob.field_F;
            }
          }
        } else {
          return kk.field_g;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            cl var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = Transmogrify.field_A ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_d) {
                  break L1;
                } else {
                  var2_ref = this.field_c;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (cl) ((Object) this.field_c.d(-31914));
                      if (var5 == 0) {
                        L3: {
                          L4: {
                            if (var7 == null) {
                              break L4;
                            } else {
                              this.field_e = this.field_e - 1;
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.field_c.wait();
                              break L5;
                            }
                          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                              break L6;
                            }
                          }
                          if (var5 == 0) {
                            decompiledRegionSelector0 = 0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
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
                      L7: {
                        L8: {
                          L9: {
                            if (-3 == (var7.field_z ^ -1)) {
                              break L9;
                            } else {
                              if (3 != var7.field_z) {
                                break L8;
                              } else {
                                var7.field_B = var7.field_C.b(-80, (int)var7.field_j);
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          var7.field_C.a(true, (int)var7.field_j, var7.field_B, var7.field_B.length);
                          break L8;
                        }
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var2_ref2 = (Exception) (Object) decompiledCaughtException;
                        var6 = (String) null;
                        d.a((Throwable) ((Object) var2_ref2), 100, (String) null);
                        break L10;
                      }
                    }
                    var7.field_m = false;
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

    cd(fe param0) {
        RuntimeException runtimeException = null;
        ib var2 = null;
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
                    var3 = Transmogrify.field_A ? 1 : 0;
                    this.field_c = new bk();
                    this.field_d = false;
                    this.field_e = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a((Runnable) (this), 5, 65535);
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
                        if (-1 != (var2.field_c ^ -1)) {
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
                        pg.a(10L, -95);
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
                        if (-3 != (var2.field_c ^ -1)) {
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
                        this.field_a = (Thread) (var2.field_g);
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
                    stackIn_11_1 = new StringBuilder().append("cd.<init>(");
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
                    throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = 640;
    }
}
