/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements Runnable {
    static int[] field_g;
    static int field_d;
    static int field_f;
    private il field_e;
    int field_b;
    private Thread field_c;
    private boolean field_a;

    final uc a(eh param0, int param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        uc var6 = null;
        int var8 = 0;
        uc stackIn_12_0 = null;
        uc stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = new uc();
              var4.field_t = 1;
              if (param2 < -125) {
                break L1;
              } else {
                vl.b(82);
                break L1;
              }
            }
            var5 = this.field_e;
            synchronized (var5) {
              L2: {
                var6 = (uc) ((Object) this.field_e.b((byte) 46));
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
                            if ((long)param1 != var6.field_h) {
                              break L6;
                            } else {
                              if (var6.field_s != param0) {
                                break L6;
                              } else {
                                if (-3 == (var6.field_t ^ -1)) {
                                  var4.field_u = var6.field_u;
                                  var4.field_l = false;
                                  stackIn_12_0 = (uc) (var4);
                                  return stackIn_12_0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6 = (uc) ((Object) this.field_e.b(0));
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
                  break L2;
                }
              }
            }
            var4.field_u = param0.a(520, param1);
            var4.field_n = true;
            var4.field_l = false;
            stackIn_19_0 = (uc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4_ref);

            stackIn_22_1 = new StringBuilder().append("vl.G(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    final uc a(byte param0, eh param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        uc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new uc();
              var4.field_h = (long)param2;
              var4.field_t = 3;
              var4.field_s = param1;
              var4.field_n = false;
              this.a((byte) 68, var4);
              if (param0 >= 79) {
                break L1;
              } else {
                field_d = -110;
                break L1;
              }
            }
            stackIn_3_0 = (uc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("vl.A(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 >= -88) {
            CharSequence var2 = (CharSequence) null;
            vl.a(false, (CharSequence) null, 95);
        }
    }

    final void a(int param0) {
        try {
            InterruptedException interruptedException = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            this.field_a = true;
            var2 = this.field_e;
            synchronized (var2) {
              L0: {
                this.field_e.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_c.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            if (param0 != -31973) {
              this.run();
              this.field_c = null;
              return;
            } else {
              this.field_c = null;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_25_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    var4 = ua.a(123, param1);
                    if (var4 == null) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        if (param2 <= -119) {
                          L2: {
                            if (sk.a(var4.charAt(0), -46)) {
                              break L2;
                            } else {
                              if (!sk.a(var4.charAt(var4.length() - 1), -46)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  L4: {
                                    L5: {
                                      if (var6 >= param1.length()) {
                                        break L5;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_25_0 = sk.a((char) var7, -46);
                                        stackIn_36_0 = stackOut_25_0 ? 1 : 0;
                                        stackIn_26_0 = stackOut_25_0;
                                        if (var8 != 0) {
                                          break L4;
                                        } else {
                                          L6: {
                                            if (!stackIn_26_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L6;
                                              } else {
                                                var5++;
                                                break L6;
                                              }
                                            } else {
                                              var5++;
                                              break L6;
                                            }
                                          }
                                          L7: {
                                            if ((var5 ^ -1) > -3) {
                                              break L7;
                                            } else {
                                              if (param0) {
                                                break L7;
                                              } else {
                                                stackIn_33_0 = 0;
                                                decompiledRegionSelector0 = 5;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L3;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    stackIn_36_0 = var5 ^ -1;
                                    break L4;
                                  }
                                  if (stackIn_36_0 < -1) {
                                    stackIn_39_0 = 0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_22_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          stackIn_17_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var3);

            stackIn_42_1 = new StringBuilder().append("vl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L8;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_39_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, uc param1) {
        synchronized (this.field_e) {
            this.field_e.a(-74, param1);
            this.field_b = this.field_b + 1;
            if (param0 != 68) {
                vl.b(58);
            }
            this.field_e.notifyAll();
        }
    }

    final uc a(int param0, eh param1, byte[] param2, int param3) {
        uc var5 = null;
        RuntimeException var5_ref = null;
        uc stackIn_1_0 = null;
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
            var5 = new uc();
            var5.field_n = false;
            var5.field_t = param3;
            var5.field_u = param2;
            var5.field_s = param1;
            var5.field_h = (long)param0;
            this.a((byte) 68, var5);
            stackIn_1_0 = (uc) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("vl.H(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, vg param2) {
        RuntimeException runtimeException = null;
        vg var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kk.field_X.a(-123, param2);
              bk.a(true, param0, param2);
              if (param1 == 10) {
                break L1;
              } else {
                var4 = (vg) null;
                vl.a(-76, -35, (vg) null);
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

            stackIn_5_1 = new StringBuilder().append("vl.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            uc var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2_ref = null;
            Exception var2_ref2 = null;
            String var6 = null;
            var5 = OrbDefence.field_D ? 1 : 0;
            L0: while (true) {
              L1: {
                if (this.field_a) {
                  break L1;
                } else {
                  var2_ref = this.field_e;
                  synchronized (var2_ref) {
                    L2: {
                      var7 = (uc) ((Object) this.field_e.c(30664));
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
                            if (-3 != (var7.field_t ^ -1)) {
                              break L8;
                            } else {
                              var7.field_s.a(var7.field_u, 255, var7.field_u.length, (int)var7.field_h);
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (-4 == (var7.field_t ^ -1)) {
                            var7.field_u = var7.field_s.a(520, (int)var7.field_h);
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
                        pe.a((byte) -13, (Throwable) ((Object) var2_ref2), (String) null);
                        break L9;
                      }
                    }
                    var7.field_l = false;
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

    vl(be param0) {
        RuntimeException runtimeException = null;
        eb var2 = null;
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
                    var3 = OrbDefence.field_D ? 1 : 0;
                    this.field_e = new il();
                    this.field_a = false;
                    this.field_b = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a(314572800, 5, (Runnable) (this));
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
                        if (-1 != (var2.field_a ^ -1)) {
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
                        hb.a(10L, 127);
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
                        if (2 != var2.field_a) {
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
                        this.field_c = (Thread) (var2.field_g);
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
                    stackIn_11_1 = new StringBuilder().append("vl.<init>(");
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
                    throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = 0;
    }
}
