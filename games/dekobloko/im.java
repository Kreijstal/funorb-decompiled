/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im implements Runnable {
    static String field_c;
    private ab field_e;
    static boolean field_f;
    static String field_d;
    static ck[] field_i;
    private Thread field_h;
    static String field_g;
    int field_b;
    private boolean field_a;
    static String field_j;

    final void a(byte param0) {
        try {
            int var2 = 0;
            var2 = 53 % ((param0 - -50) / 38);
            this.field_a = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
            }
            try {
                this.field_h.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_i = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        ff.a(param2, 10891);
        if (param0 >= -87) {
          field_j = (String) null;
          gb.a(param3, param2, (byte) -126, param1);
          return;
        } else {
          gb.a(param3, param2, (byte) -126, param1);
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = client.field_A ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_a) {
                  break L1;
                } else {
                  var2_ref = this.field_e;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (el) ((Object) this.field_e.a((byte) 79));
                      if (var5 == 0) {
                        L3: {
                          if (var7 != null) {
                            break L3;
                          } else {
                            try {
                              L4: {
                                this.field_e.wait();
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
                        this.field_b = this.field_b - 1;
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
                            if (2 == var7.field_F) {
                              break L8;
                            } else {
                              if (3 == var7.field_F) {
                                var7.field_H = var7.field_K.a((int)var7.field_r, (byte) 117);
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
                          var7.field_K.a((byte) 43, var7.field_H, (int)var7.field_r, var7.field_H.length);
                          break L7;
                        }
                        break L6;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L9: {
                        var2_ref2 = (Exception) (Object) decompiledCaughtException;
                        var6 = (String) null;
                        qb.a((Throwable) ((Object) var2_ref2), 16408, (String) null);
                        break L9;
                      }
                    }
                    var7.field_z = false;
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

    private final void a(byte param0, el param1) {
        synchronized (this.field_e) {
            int var4 = 78 % ((param0 - -34) / 50);
            this.field_e.a(param1, -7267);
            this.field_b = this.field_b + 1;
            this.field_e.notifyAll();
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + bh.a(0, param1, "\n", "%0a"));
        if (param0 != 18239) {
            im.a(56, -121, true, -33);
        }
    }

    final el a(int param0, kh param1, byte param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new el();
              var4.field_D = false;
              var4.field_F = 3;
              if (param2 == 61) {
                break L1;
              } else {
                var5 = (String) null;
                im.a(109, (String) null);
                break L1;
              }
            }
            var4.field_K = param1;
            var4.field_r = (long)param0;
            this.a((byte) -115, var4);
            stackIn_3_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("im.B(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final el a(int param0, kh param1, byte[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        el var6 = null;
        el stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = 63 / ((-8 - param3) / 56);
            var6 = new el();
            var6.field_D = false;
            var6.field_F = 2;
            var6.field_r = (long)param0;
            var6.field_K = param1;
            var6.field_H = param2;
            this.a((byte) -121, var6);
            stackIn_1_0 = (el) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("im.A(").append(param0).append(',');

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
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final el a(int param0, kh param1, int param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        el var6 = null;
        int var8 = 0;
        el stackIn_9_0 = null;
        int stackIn_16_0 = 0;
        el stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new el();
            var4.field_F = 1;
            var5_ref_Object = this.field_e;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (el) ((Object) this.field_e.b(-2198));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackIn_16_0 = (var6.field_r < (long)param0 ? -1 : (var6.field_r == (long)param0 ? 0 : 1));

                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_16_0 != 0) {
                            break L4;
                          } else {
                            if (param1 != var6.field_K) {
                              break L4;
                            } else {
                              if (2 != var6.field_F) {
                                break L4;
                              } else {
                                var4.field_H = var6.field_H;
                                var4.field_z = false;
                                stackIn_9_0 = (el) (var4);
                                return stackIn_9_0;
                              }
                            }
                          }
                        }
                        var6 = (el) ((Object) this.field_e.b((byte) 20));
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
                stackIn_16_0 = 84 % ((param2 - 77) / 46);
                break L5;
              }
            }
            var5 = stackIn_16_0;
            var4.field_H = param1.a(param0, (byte) 49);
            var4.field_z = false;
            var4.field_D = true;
            stackIn_17_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("im.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    im(fd param0) {
        RuntimeException runtimeException = null;
        mh var2 = null;
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
                    var3 = client.field_A ? 1 : 0;
                    this.field_e = new ab();
                    this.field_b = 0;
                    this.field_a = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a((byte) -104, 5, (Runnable) (this));
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
                        if (0 != var2.field_c) {
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
                        ua.a(10L, -128);
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
                        if (var2.field_c != 2) {
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
                        this.field_h = (Thread) (var2.field_b);
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
                    stackIn_11_1 = new StringBuilder().append("im.<init>(");
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
                    throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_j = "From <%0>: ";
        field_g = "Options Menu";
        field_d = "Exploiting a bug";
    }
}
