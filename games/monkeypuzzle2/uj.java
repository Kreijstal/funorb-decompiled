/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj implements Runnable {
    static int field_h;
    static int[] field_k;
    static String field_f;
    private dl field_d;
    static String field_b;
    static int field_g;
    static int field_i;
    int field_j;
    static String[] field_c;
    private Thread field_a;
    private boolean field_e;
    static int field_l;

    final si a(gf param0, int param1, int param2) {
        si var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        si var6 = null;
        int var8 = 0;
        si stackIn_9_0 = null;
        si stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = new si();
            var4.field_q = param1;
            var5_ref = this.field_d;
            synchronized (var5_ref) {
              L1: {
                var6 = (si) ((Object) this.field_d.a(true));
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
                            if (((long)param2 ^ -1L) != (var6.field_f ^ -1L)) {
                              break L5;
                            } else {
                              if (var6.field_t != param0) {
                                break L5;
                              } else {
                                if (var6.field_q != 2) {
                                  break L5;
                                } else {
                                  var4.field_j = false;
                                  var4.field_p = var6.field_p;
                                  stackIn_9_0 = (si) (var4);
                                  return stackIn_9_0;
                                }
                              }
                            }
                          }
                          var6 = (si) ((Object) this.field_d.c((byte) -75));
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
              }
            }
            var4.field_p = param0.a(param2, (byte) 100);
            var4.field_m = true;
            var4.field_j = false;
            stackIn_16_0 = (si) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("uj.F(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    final si a(boolean param0, int param1, byte[] param2, gf param3) {
        si var5 = null;
        RuntimeException var5_ref = null;
        si stackIn_2_0 = null;
        si stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        si stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = new si();
              var5.field_f = (long)param1;
              stackIn_2_0 = (si) (var5);

              if (!param0) {
                stackIn_3_0 = (si) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (si) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_m = stackIn_3_1 != 0;
            var5.field_p = param2;
            var5.field_q = 2;
            var5.field_t = param3;
            this.a(-37, var5);
            stackIn_4_0 = (si) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("uj.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    final static ai[] a(String param0, String param1, ad param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ai[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param2.c(param0, (byte) -105);
              if (!param3) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            var5 = param2.a(param1, var4_int, -28459);
            stackIn_3_0 = b.a(var5, 10, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("uj.H(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            si var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = MonkeyPuzzle2.field_F ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_e) {
                  break L1;
                } else {
                  var2_ref = this.field_d;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (si) ((Object) this.field_d.a((byte) -120));
                      if (var5 == 0) {
                        L3: {
                          L4: {
                            if (var7 == null) {
                              break L4;
                            } else {
                              this.field_j = this.field_j - 1;
                              if (var5 == 0) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          try {
                            L5: {
                              this.field_d.wait();
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
                            if (var7.field_q != 2) {
                              break L9;
                            } else {
                              var7.field_t.a(5, (int)var7.field_f, var7.field_p.length, var7.field_p);
                              if (var5 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var7.field_q != 3) {
                            break L8;
                          } else {
                            var7.field_p = var7.field_t.a((int)var7.field_f, (byte) 125);
                            break L8;
                          }
                        }
                        break L7;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var2_ref2 = (Exception) (Object) decompiledCaughtException;
                        var6 = (String) null;
                        kk.a((String) null, (byte) 73, (Throwable) ((Object) var2_ref2));
                        break L10;
                      }
                    }
                    var7.field_j = false;
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

    final static void b(int param0) {
        hd.field_u.a(ri.field_b, param0 + 0);
        ok.field_a.a(ri.field_b, 0);
        wd.field_h.a(ri.field_b, 0);
        rf.field_a.a(aj.field_b, param0 + param0);
        sb.field_m.e();
        ge.d();
        ac.field_a.a((byte) 114);
        ek.field_b = 0;
        dc.field_e = 0;
        ok.field_d = false;
        sc.field_c = 0;
    }

    final si a(int param0, gf param1, byte param2) {
        si var4 = null;
        RuntimeException var4_ref = null;
        si stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new si();
              var4.field_t = param1;
              if (param2 < -90) {
                break L1;
              } else {
                this.field_a = (Thread) null;
                break L1;
              }
            }
            var4.field_m = false;
            var4.field_f = (long)param0;
            var4.field_q = 3;
            this.a(-52, var4);
            stackIn_3_0 = (si) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("uj.G(").append(param0).append(',');

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
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        if (param0 != 10) {
          field_g = -34;
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    private final void a(int param0, si param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 <= -29) {
              break L0;
            } else {
              this.field_d = (dl) null;
              break L0;
            }
          }
          var3 = this.field_d;
          synchronized (var3) {
            L1: {
              this.field_d.a(param1, (byte) -100);
              this.field_j = this.field_j + 1;
              this.field_d.notifyAll();
              break L1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var3;

            stackIn_10_1 = new StringBuilder().append("uj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(boolean param0) {
        try {
            this.field_e = param0 ? true : false;
            synchronized (this.field_d) {
                this.field_d.notifyAll();
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

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        ka var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1 instanceof byte[]) {
                var3 = (byte[]) (param1);
                if (param2) {
                  stackIn_9_0 = bk.a(0, var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_7_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var3_int = 89 / ((param0 - 0) / 38);
                if (!(param1 instanceof ka)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (ka) (param1);
                  stackIn_12_0 = var4.d(-13913);
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uj.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    uj(md param0) {
        RuntimeException runtimeException = null;
        ic var2 = null;
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
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    this.field_d = new dl();
                    this.field_j = 0;
                    this.field_e = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a((Runnable) (this), 5, 0);
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
                        if (0 != var2.field_g) {
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
                        em.a(10L, false);
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
                        if (2 != var2.field_g) {
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
                        this.field_a = (Thread) (var2.field_b);
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
                    stackIn_11_1 = new StringBuilder().append("uj.<init>(");
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
                    throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_k = new int[20];
        field_b = "Waiting for fonts";
        field_h = 1;
        field_l = 480;
    }
}
