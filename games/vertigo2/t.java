/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements Runnable {
    static ar field_m;
    private ak field_e;
    static int field_b;
    static String field_n;
    static int field_a;
    static String field_i;
    static int field_l;
    static String field_k;
    static int field_g;
    private Thread field_h;
    static int field_c;
    int field_d;
    private boolean field_j;
    static int field_f;

    private final void a(nq param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((t) this).field_e;
            synchronized (var3) {
              L1: {
                ((t) this).field_e.a(false, (gp) (Object) param0);
                ((t) this).field_d = ((t) this).field_d + 1;
                ((Object) (Object) ((t) this).field_e).notifyAll();
                break L1;
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                t.a(false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("t.G(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                t.a((fp) null, 44, 108, (r) null);
                break L1;
              }
            }
            field_n = null;
            field_m = null;
            field_i = null;
            field_k = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "t.J(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            RuntimeException runtimeException = null;
            nq var1 = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    L3: {
                      if (((t) this).field_j) {
                        break L3;
                      } else {
                        var2 = (Object) (Object) ((t) this).field_e;
                        synchronized (var2) {
                          L4: {
                            var1 = (nq) (Object) ((t) this).field_e.a(-112);
                            if (var5 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              L5: {
                                if (null != var1) {
                                  break L5;
                                } else {
                                  {
                                    L6: {
                                      ((Object) (Object) ((t) this).field_e).wait();
                                      break L6;
                                    }
                                  }
                                  if (var5 == 0) {
                                    decompiledRegionSelector0 = 1;
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              ((t) this).field_d = ((t) this).field_d - 1;
                              decompiledRegionSelector0 = 2;
                              break L4;
                            }
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          if (decompiledRegionSelector0 == 1) {
                            continue L1;
                          } else {
                            try {
                              L8: {
                                L9: {
                                  L10: {
                                    if (var1.field_B == 2) {
                                      break L10;
                                    } else {
                                      if (3 == var1.field_B) {
                                        var1.field_L = var1.field_F.a((int)var1.field_n, 27176);
                                        if (var5 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  boolean discarded$1 = var1.field_F.a(var1.field_L.length, (int)var1.field_n, var1.field_L, (byte) -84);
                                  break L9;
                                }
                                break L8;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L11: {
                                var2_ref = (Exception) (Object) decompiledCaughtException;
                                ke.a((Throwable) (Object) var2_ref, (String) null, 0);
                                break L11;
                              }
                            }
                            var1.field_z = false;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw wn.a((Throwable) (Object) runtimeException, "t.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        RuntimeException runtimeException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            ((t) this).field_j = true;
            var2 = (Object) (Object) ((t) this).field_e;
            synchronized (var2) {
              L1: {
                ((Object) (Object) ((t) this).field_e).notifyAll();
                break L1;
              }
            }
            L2: {
              if (param0 <= -8) {
                break L2;
              } else {
                t.a((fp) null, 6, 3, (r) null);
                break L2;
              }
            }
            try {
              L3: {
                ((t) this).field_h.join();
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L4;
              }
            }
            ((t) this).field_h = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) (Object) runtimeException, "t.H(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!sp.field_V) {
                break L1;
              } else {
                if (!vj.field_h) {
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null != hj.field_e) {
                break L2;
              } else {
                hj.field_e = hm.a(4, true);
                break L2;
              }
            }
            L3: {
              if (null != bs.field_Xb) {
                break L3;
              } else {
                bs.field_Xb = ol.a(106, 5, 0, 1);
                break L3;
              }
            }
            L4: {
              if (hj.field_e == null) {
                break L4;
              } else {
                if (hj.field_e.field_o) {
                  jq.field_e = jq.field_e & ~hj.field_e.field_p;
                  ml.field_z = ml.field_z | hj.field_e.field_p;
                  sp.field_V = true;
                  hj.field_e = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (bs.field_Xb == null) {
                break L5;
              } else {
                if (bs.field_Xb.field_p) {
                  var1_int = -1 + bs.field_Xb.field_o[0];
                  vj.field_h = true;
                  bs.field_Xb = null;
                  if (~field_l > ~var1_int) {
                    field_l = var1_int;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (param0 == 44) {
                break L6;
              } else {
                t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
                break L6;
              }
            }
            L7: {
              if (!sp.field_V) {
                break L7;
              } else {
                if (!vj.field_h) {
                  break L7;
                } else {
                  le.a(468713154);
                  jn.a(param0 ^ 41);
                  if (lc.field_b != 9) {
                    break L7;
                  } else {
                    if (jq.field_e != 0) {
                      break L7;
                    } else {
                      lc.field_b = 5;
                      gj.a((byte) -123, false, am.field_n, 5);
                      break L7;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "t.A(" + param0 + ')');
        }
    }

    final static void a(fp param0, int param1, int param2, r param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              sq.field_e = param2 * el.b(true) / 1000;
              hi.a(param3, 56);
              jl.a(param3, (byte) -85);
              ao.a(param1 + -1513236, param3);
              uc.a((byte) 73);
              bs.a((byte) -12);
              if (param1 == 1513239) {
                break L1;
              } else {
                field_f = 65;
                break L1;
              }
            }
            hm.field_F = -sq.field_e;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("t.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 >= 26) {
                break L1;
              } else {
                t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
                break L1;
              }
            }
            hq.field_r = param2;
            jm.field_G = param3;
            ml.field_v = param0;
            cd.field_a = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "t.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final nq a(boolean param0, qh param1, int param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nq var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        nq stackIn_5_0 = null;
        nq stackIn_15_0 = null;
        nq stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        nq stackOut_4_0 = null;
        nq stackOut_14_0 = null;
        nq stackOut_21_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new nq();
            var4.field_B = 1;
            var5 = (Object) (Object) ((t) this).field_e;
            synchronized (var5) {
              L1: {
                var6 = (nq) (Object) ((t) this).field_e.b((byte) -50);
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackOut_4_0 = (nq) var6;
                      stackIn_22_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if (~stackIn_5_0.field_n != ~(long)param2) {
                            break L4;
                          } else {
                            if (var6.field_F != param1) {
                              break L4;
                            } else {
                              if (2 != var6.field_B) {
                                break L4;
                              } else {
                                var4.field_L = var6.field_L;
                                var4.field_z = false;
                                stackOut_14_0 = (nq) var4;
                                stackIn_15_0 = stackOut_14_0;
                                return stackIn_15_0;
                              }
                            }
                          }
                        }
                        var6 = (nq) (Object) ((t) this).field_e.a(true);
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
                var4.field_L = param1.a(param2, 27176);
                var4.field_u = param0;
                var4.field_z = false;
                stackOut_21_0 = (nq) var4;
                stackIn_22_0 = stackOut_21_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("t.B(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param2 + ')');
        }
        return stackIn_22_0;
    }

    final nq a(qh param0, int param1, byte param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nq stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        nq stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var5 = -57 % ((3 - param2) / 35);
            var4 = new nq();
            var4.field_n = (long)param1;
            var4.field_u = false;
            var4.field_B = 3;
            var4.field_F = param0;
            this.a(var4, 0);
            stackOut_0_0 = (nq) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("t.D(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(u[] param0, int[] param1, r param2, r param3, boolean param4) {
        u[] var5 = null;
        int[] var6 = null;
        u[] var6_array = null;
        int var7_int = 0;
        co var7 = null;
        cr var8 = null;
        cr var9 = null;
        cr var10 = null;
        cr var11 = null;
        er[] var12 = null;
        er[] var13 = null;
        er[] var14 = null;
        cr var15 = null;
        er[] var16 = null;
        er[] var17 = null;
        int var18 = 0;
        cr stackIn_34_0 = null;
        r stackIn_34_1 = null;
        String stackIn_34_2 = null;
        String stackIn_34_3 = null;
        cr stackIn_35_0 = null;
        r stackIn_35_1 = null;
        String stackIn_35_2 = null;
        String stackIn_35_3 = null;
        cr stackIn_36_0 = null;
        r stackIn_36_1 = null;
        String stackIn_36_2 = null;
        String stackIn_36_3 = null;
        int stackIn_36_4 = 0;
        cr stackIn_37_0 = null;
        r stackIn_37_1 = null;
        String stackIn_37_2 = null;
        String stackIn_37_3 = null;
        cr stackIn_38_0 = null;
        r stackIn_38_1 = null;
        String stackIn_38_2 = null;
        String stackIn_38_3 = null;
        cr stackIn_39_0 = null;
        r stackIn_39_1 = null;
        String stackIn_39_2 = null;
        String stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        cr stackIn_40_0 = null;
        r stackIn_40_1 = null;
        String stackIn_40_2 = null;
        String stackIn_40_3 = null;
        cr stackIn_41_0 = null;
        r stackIn_41_1 = null;
        String stackIn_41_2 = null;
        String stackIn_41_3 = null;
        cr stackIn_42_0 = null;
        r stackIn_42_1 = null;
        String stackIn_42_2 = null;
        String stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        cr stackIn_43_0 = null;
        r stackIn_43_1 = null;
        String stackIn_43_2 = null;
        String stackIn_43_3 = null;
        cr stackIn_44_0 = null;
        r stackIn_44_1 = null;
        String stackIn_44_2 = null;
        String stackIn_44_3 = null;
        cr stackIn_45_0 = null;
        r stackIn_45_1 = null;
        String stackIn_45_2 = null;
        String stackIn_45_3 = null;
        int stackIn_45_4 = 0;
        cr stackIn_46_0 = null;
        r stackIn_46_1 = null;
        String stackIn_46_2 = null;
        String stackIn_46_3 = null;
        cr stackIn_47_0 = null;
        r stackIn_47_1 = null;
        String stackIn_47_2 = null;
        String stackIn_47_3 = null;
        cr stackIn_48_0 = null;
        r stackIn_48_1 = null;
        String stackIn_48_2 = null;
        String stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        cr stackIn_49_0 = null;
        r stackIn_49_1 = null;
        String stackIn_49_2 = null;
        String stackIn_49_3 = null;
        cr stackIn_50_0 = null;
        r stackIn_50_1 = null;
        String stackIn_50_2 = null;
        String stackIn_50_3 = null;
        cr stackIn_51_0 = null;
        r stackIn_51_1 = null;
        String stackIn_51_2 = null;
        String stackIn_51_3 = null;
        int stackIn_51_4 = 0;
        cr stackIn_52_0 = null;
        r stackIn_52_1 = null;
        String stackIn_52_2 = null;
        String stackIn_52_3 = null;
        cr stackIn_53_0 = null;
        r stackIn_53_1 = null;
        String stackIn_53_2 = null;
        String stackIn_53_3 = null;
        cr stackIn_54_0 = null;
        r stackIn_54_1 = null;
        String stackIn_54_2 = null;
        String stackIn_54_3 = null;
        int stackIn_54_4 = 0;
        cr stackIn_55_0 = null;
        r stackIn_55_1 = null;
        String stackIn_55_2 = null;
        String stackIn_55_3 = null;
        cr stackIn_56_0 = null;
        r stackIn_56_1 = null;
        String stackIn_56_2 = null;
        String stackIn_56_3 = null;
        cr stackIn_57_0 = null;
        r stackIn_57_1 = null;
        String stackIn_57_2 = null;
        String stackIn_57_3 = null;
        int stackIn_57_4 = 0;
        cr stackIn_58_0 = null;
        r stackIn_58_1 = null;
        String stackIn_58_2 = null;
        String stackIn_58_3 = null;
        cr stackIn_59_0 = null;
        r stackIn_59_1 = null;
        String stackIn_59_2 = null;
        String stackIn_59_3 = null;
        cr stackIn_60_0 = null;
        r stackIn_60_1 = null;
        String stackIn_60_2 = null;
        String stackIn_60_3 = null;
        int stackIn_60_4 = 0;
        cr stackIn_61_0 = null;
        r stackIn_61_1 = null;
        String stackIn_61_2 = null;
        String stackIn_61_3 = null;
        cr stackIn_62_0 = null;
        r stackIn_62_1 = null;
        String stackIn_62_2 = null;
        String stackIn_62_3 = null;
        cr stackIn_63_0 = null;
        r stackIn_63_1 = null;
        String stackIn_63_2 = null;
        String stackIn_63_3 = null;
        int stackIn_63_4 = 0;
        cr stackIn_64_0 = null;
        r stackIn_64_1 = null;
        String stackIn_64_2 = null;
        String stackIn_64_3 = null;
        cr stackIn_65_0 = null;
        r stackIn_65_1 = null;
        String stackIn_65_2 = null;
        String stackIn_65_3 = null;
        cr stackIn_66_0 = null;
        r stackIn_66_1 = null;
        String stackIn_66_2 = null;
        String stackIn_66_3 = null;
        int stackIn_66_4 = 0;
        cr stackIn_67_0 = null;
        r stackIn_67_1 = null;
        String stackIn_67_2 = null;
        String stackIn_67_3 = null;
        cr stackIn_68_0 = null;
        r stackIn_68_1 = null;
        String stackIn_68_2 = null;
        String stackIn_68_3 = null;
        cr stackIn_69_0 = null;
        r stackIn_69_1 = null;
        String stackIn_69_2 = null;
        String stackIn_69_3 = null;
        int stackIn_69_4 = 0;
        r stackIn_70_0 = null;
        String stackIn_70_1 = null;
        String stackIn_70_2 = null;
        r stackIn_71_0 = null;
        String stackIn_71_1 = null;
        String stackIn_71_2 = null;
        r stackIn_72_0 = null;
        String stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int stackIn_72_3 = 0;
        cr stackIn_73_0 = null;
        r stackIn_73_1 = null;
        String stackIn_73_2 = null;
        String stackIn_73_3 = null;
        cr stackIn_74_0 = null;
        r stackIn_74_1 = null;
        String stackIn_74_2 = null;
        String stackIn_74_3 = null;
        cr stackIn_75_0 = null;
        r stackIn_75_1 = null;
        String stackIn_75_2 = null;
        String stackIn_75_3 = null;
        int stackIn_75_4 = 0;
        cr stackOut_33_0 = null;
        r stackOut_33_1 = null;
        String stackOut_33_2 = null;
        String stackOut_33_3 = null;
        cr stackOut_35_0 = null;
        r stackOut_35_1 = null;
        String stackOut_35_2 = null;
        String stackOut_35_3 = null;
        int stackOut_35_4 = 0;
        cr stackOut_34_0 = null;
        r stackOut_34_1 = null;
        String stackOut_34_2 = null;
        String stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        cr stackOut_36_0 = null;
        r stackOut_36_1 = null;
        String stackOut_36_2 = null;
        String stackOut_36_3 = null;
        cr stackOut_38_0 = null;
        r stackOut_38_1 = null;
        String stackOut_38_2 = null;
        String stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        cr stackOut_37_0 = null;
        r stackOut_37_1 = null;
        String stackOut_37_2 = null;
        String stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        cr stackOut_39_0 = null;
        r stackOut_39_1 = null;
        String stackOut_39_2 = null;
        String stackOut_39_3 = null;
        cr stackOut_41_0 = null;
        r stackOut_41_1 = null;
        String stackOut_41_2 = null;
        String stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        cr stackOut_40_0 = null;
        r stackOut_40_1 = null;
        String stackOut_40_2 = null;
        String stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        cr stackOut_42_0 = null;
        r stackOut_42_1 = null;
        String stackOut_42_2 = null;
        String stackOut_42_3 = null;
        cr stackOut_44_0 = null;
        r stackOut_44_1 = null;
        String stackOut_44_2 = null;
        String stackOut_44_3 = null;
        int stackOut_44_4 = 0;
        cr stackOut_43_0 = null;
        r stackOut_43_1 = null;
        String stackOut_43_2 = null;
        String stackOut_43_3 = null;
        int stackOut_43_4 = 0;
        cr stackOut_45_0 = null;
        r stackOut_45_1 = null;
        String stackOut_45_2 = null;
        String stackOut_45_3 = null;
        cr stackOut_47_0 = null;
        r stackOut_47_1 = null;
        String stackOut_47_2 = null;
        String stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        cr stackOut_46_0 = null;
        r stackOut_46_1 = null;
        String stackOut_46_2 = null;
        String stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        cr stackOut_48_0 = null;
        r stackOut_48_1 = null;
        String stackOut_48_2 = null;
        String stackOut_48_3 = null;
        cr stackOut_50_0 = null;
        r stackOut_50_1 = null;
        String stackOut_50_2 = null;
        String stackOut_50_3 = null;
        int stackOut_50_4 = 0;
        cr stackOut_49_0 = null;
        r stackOut_49_1 = null;
        String stackOut_49_2 = null;
        String stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        cr stackOut_51_0 = null;
        r stackOut_51_1 = null;
        String stackOut_51_2 = null;
        String stackOut_51_3 = null;
        cr stackOut_53_0 = null;
        r stackOut_53_1 = null;
        String stackOut_53_2 = null;
        String stackOut_53_3 = null;
        int stackOut_53_4 = 0;
        cr stackOut_52_0 = null;
        r stackOut_52_1 = null;
        String stackOut_52_2 = null;
        String stackOut_52_3 = null;
        int stackOut_52_4 = 0;
        cr stackOut_54_0 = null;
        r stackOut_54_1 = null;
        String stackOut_54_2 = null;
        String stackOut_54_3 = null;
        cr stackOut_56_0 = null;
        r stackOut_56_1 = null;
        String stackOut_56_2 = null;
        String stackOut_56_3 = null;
        int stackOut_56_4 = 0;
        cr stackOut_55_0 = null;
        r stackOut_55_1 = null;
        String stackOut_55_2 = null;
        String stackOut_55_3 = null;
        int stackOut_55_4 = 0;
        cr stackOut_57_0 = null;
        r stackOut_57_1 = null;
        String stackOut_57_2 = null;
        String stackOut_57_3 = null;
        cr stackOut_59_0 = null;
        r stackOut_59_1 = null;
        String stackOut_59_2 = null;
        String stackOut_59_3 = null;
        int stackOut_59_4 = 0;
        cr stackOut_58_0 = null;
        r stackOut_58_1 = null;
        String stackOut_58_2 = null;
        String stackOut_58_3 = null;
        int stackOut_58_4 = 0;
        cr stackOut_60_0 = null;
        r stackOut_60_1 = null;
        String stackOut_60_2 = null;
        String stackOut_60_3 = null;
        cr stackOut_62_0 = null;
        r stackOut_62_1 = null;
        String stackOut_62_2 = null;
        String stackOut_62_3 = null;
        int stackOut_62_4 = 0;
        cr stackOut_61_0 = null;
        r stackOut_61_1 = null;
        String stackOut_61_2 = null;
        String stackOut_61_3 = null;
        int stackOut_61_4 = 0;
        cr stackOut_63_0 = null;
        r stackOut_63_1 = null;
        String stackOut_63_2 = null;
        String stackOut_63_3 = null;
        cr stackOut_65_0 = null;
        r stackOut_65_1 = null;
        String stackOut_65_2 = null;
        String stackOut_65_3 = null;
        int stackOut_65_4 = 0;
        cr stackOut_64_0 = null;
        r stackOut_64_1 = null;
        String stackOut_64_2 = null;
        String stackOut_64_3 = null;
        int stackOut_64_4 = 0;
        cr stackOut_66_0 = null;
        r stackOut_66_1 = null;
        String stackOut_66_2 = null;
        String stackOut_66_3 = null;
        cr stackOut_68_0 = null;
        r stackOut_68_1 = null;
        String stackOut_68_2 = null;
        String stackOut_68_3 = null;
        int stackOut_68_4 = 0;
        cr stackOut_67_0 = null;
        r stackOut_67_1 = null;
        String stackOut_67_2 = null;
        String stackOut_67_3 = null;
        int stackOut_67_4 = 0;
        r stackOut_69_0 = null;
        String stackOut_69_1 = null;
        String stackOut_69_2 = null;
        r stackOut_71_0 = null;
        String stackOut_71_1 = null;
        String stackOut_71_2 = null;
        int stackOut_71_3 = 0;
        r stackOut_70_0 = null;
        String stackOut_70_1 = null;
        String stackOut_70_2 = null;
        int stackOut_70_3 = 0;
        cr stackOut_72_0 = null;
        r stackOut_72_1 = null;
        String stackOut_72_2 = null;
        String stackOut_72_3 = null;
        cr stackOut_74_0 = null;
        r stackOut_74_1 = null;
        String stackOut_74_2 = null;
        String stackOut_74_3 = null;
        int stackOut_74_4 = 0;
        cr stackOut_73_0 = null;
        r stackOut_73_1 = null;
        String stackOut_73_2 = null;
        String stackOut_73_3 = null;
        int stackOut_73_4 = 0;
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var5 = oh.a((byte) -39, "crowns", "lobby", param3);
          eh.field_e = var5.length;
          if (param0 == null) {
            break L0;
          } else {
            var6_array = new u[param0.length + eh.field_e];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (eh.field_e <= var7_int) {
                    break L3;
                  } else {
                    var6_array[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if (var7_int >= param0.length) {
                    break L5;
                  } else {
                    var6_array[var7_int + eh.field_e] = param0[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6_array;
                break L0;
              }
            }
          }
        }
        var6 = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (var7_int >= eh.field_e) {
                break L8;
              } else {
                var6[var7_int] = 10;
                var7_int++;
                if (var18 != 0) {
                  break L7;
                } else {
                  if (var18 == 0) {
                    continue L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (null == param0) {
                break L9;
              } else {
                L10: {
                  if (param1 != null) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if (var7_int >= param0.length) {
                          break L12;
                        } else {
                          var6[eh.field_e + var7_int] = param0[var7_int].field_h;
                          var7_int++;
                          if (var18 != 0) {
                            break L7;
                          } else {
                            if (var18 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var18 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var7_int = 0;
                L13: while (true) {
                  if (var7_int >= param0.length) {
                    break L9;
                  } else {
                    var6[var7_int + eh.field_e] = param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L7;
                    } else {
                      if (var18 == 0) {
                        continue L13;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
            nl.field_k = 2;
            r.field_j = 2;
            r.field_f = 15;
            ia.field_G = 4;
            hc.field_b = 11;
            break L7;
          }
          L14: {
            var7 = w.a(param2, param3, "largefont", "lobby", 121);
            li.field_e = w.a(param2, param3, "generalfont", "lobby", 104);
            kb.field_c = w.a(param2, param3, "chatfont", "lobby", 121);
            var7.a((fq[]) (Object) var5, var6);
            li.field_e.a((fq[]) (Object) var5, var6);
            kb.field_c.a((fq[]) (Object) var5, var6);
            var8 = new cr(0L, (cr) null);
            var8.field_z = (cc) (Object) var7;
            var8.field_qb = r.field_f;
            var8.field_A = 16777215;
            var9 = var8;
            var8.field_ab = 1;
            var9.field_O = 1;
            var10 = new cr(0L, (cr) null);
            var10.field_z = (cc) (Object) li.field_e;
            var10.field_qb = r.field_f;
            var10.field_A = 16777215;
            var10.field_ab = 1;
            var11 = var10;
            var11.field_O = 1;
            j.field_q = new cr(0L, var8);
            j.field_q.field_Bb = hq.a(gk.a(param3, "lobby", "heading", true), 202);
            rq.field_t = new cr(0L, (cr) null);
            rq.field_t.field_Bb = ml.a((byte) -13, 8421504, false, 4210752, 120, param4);
            lk.field_a = new cr(0L, (cr) null);
            lk.field_a.field_Bb = vl.a(114, 3, 0, 1, 6316128, 6316128);
            vf.field_B = new cr(0L, (cr) null);
            vf.field_B.field_Bb = hq.a(gk.a(param3, "lobby", "popup", true), 202);
            var12 = hq.a(gk.a(param3, "lobby", "popup_mouseover", true), 202);
            var13 = gk.a(param3, "lobby", "button", true);
            var14 = hq.a(gk.a(param3, "lobby", "tab_active", true), 202);
            ji.field_s = new cr(0L, var8);
            ji.field_s.field_Bb = var14;
            eh.field_a = new cr(0L, (cr) null);
            eh.field_a.field_Db = tn.a("closebutton", param3, -82, "lobby");
            eh.field_a.field_W = tn.a("closebutton_mouseover", param3, -90, "lobby");
            gn.field_f = new cr(0L, var8);
            gn.field_f.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 40, true);
            db.field_t = new cr(0L, var10);
            db.field_t.field_R = 2;
            db.field_t.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 30, false);
            kl.field_Ib = new cr(0L, var10);
            kl.field_Ib.field_R = 2;
            kl.field_Ib.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, false);
            sa.field_a = new cr(0L, var10);
            sa.field_a.field_R = 2;
            sa.field_a.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, true);
            ee.field_b = new cr(0L, (cr) null);
            ee.field_b.field_qb = r.field_f;
            ee.field_b.field_ab = 1;
            ee.field_b.field_A = 13421772;
            ee.field_b.field_z = (cc) (Object) li.field_e;
            ja.field_e = new cr(0L, ee.field_b);
            ja.field_e.field_H = 16777215;
            ja.field_e.field_B = 16777215;
            ja.field_e.field_A = 16764006;
            ja.field_e.field_D = 8421504;
            ja.field_e.field_K = 16777215;
            var15 = new cr(0L, ja.field_e);
            var15.field_z = (cc) (Object) var7;
            var15.field_qb = r.field_f;
            var15.field_A = 16777215;
            pn.field_N = new cr(0L, ee.field_b);
            pn.field_N.field_Bb = ml.a((byte) -13, 2236962, false, 2236962, 16, false);
            pn.field_N.field_R = 2;
            fm.field_e = new cr(0L, ee.field_b);
            fm.field_e.field_Bb = ml.a((byte) -13, 1513239, false, 1513239, 16, false);
            fm.field_e.field_R = 2;
            tm.field_b = new cr(0L, pn.field_N);
            tm.field_b.a(ja.field_e, -46);
            el.field_b = new cr(0L, fm.field_e);
            el.field_b.a(ja.field_e, -104);
            var16 = gk.a(param3, "lobby", "button_mouseover", true);
            ar.field_c = new kq(vf.field_B, var12, ee.field_b, ja.field_e, 3, 2, r.field_j, 3, r.field_f);
            bq.field_B = new cr(0L, ja.field_e);
            bq.field_B.field_bb = 1;
            bq.field_B.field_Y = 1;
            bq.field_B.field_Cb = 1;
            bq.field_B.field_Q = var16;
            bq.field_B.field_Bb = var13;
            bq.field_B.field_Gb = 1;
            bq.field_B.field_cb = gk.a(param3, "lobby", "button_mouseheld", true);
            stackOut_33_0 = bq.field_B;
            stackOut_33_1 = (r) param3;
            stackOut_33_2 = "lobby";
            stackOut_33_3 = "button_active";
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_35_2 = stackOut_33_2;
            stackIn_35_3 = stackOut_33_3;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            stackIn_34_2 = stackOut_33_2;
            stackIn_34_3 = stackOut_33_3;
            if (param4) {
              stackOut_35_0 = (cr) (Object) stackIn_35_0;
              stackOut_35_1 = (r) (Object) stackIn_35_1;
              stackOut_35_2 = (String) (Object) stackIn_35_2;
              stackOut_35_3 = (String) (Object) stackIn_35_3;
              stackOut_35_4 = 0;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              stackIn_36_3 = stackOut_35_3;
              stackIn_36_4 = stackOut_35_4;
              break L14;
            } else {
              stackOut_34_0 = (cr) (Object) stackIn_34_0;
              stackOut_34_1 = (r) (Object) stackIn_34_1;
              stackOut_34_2 = (String) (Object) stackIn_34_2;
              stackOut_34_3 = (String) (Object) stackIn_34_3;
              stackOut_34_4 = 1;
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              stackIn_36_3 = stackOut_34_3;
              stackIn_36_4 = stackOut_34_4;
              break L14;
            }
          }
          L15: {
            stackIn_36_0.field_T = gk.a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4 != 0);
            stackOut_36_0 = bq.field_B;
            stackOut_36_1 = (r) param3;
            stackOut_36_2 = "lobby";
            stackOut_36_3 = "button_disabled";
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_38_2 = stackOut_36_2;
            stackIn_38_3 = stackOut_36_3;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            stackIn_37_2 = stackOut_36_2;
            stackIn_37_3 = stackOut_36_3;
            if (param4) {
              stackOut_38_0 = (cr) (Object) stackIn_38_0;
              stackOut_38_1 = (r) (Object) stackIn_38_1;
              stackOut_38_2 = (String) (Object) stackIn_38_2;
              stackOut_38_3 = (String) (Object) stackIn_38_3;
              stackOut_38_4 = 0;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              stackIn_39_3 = stackOut_38_3;
              stackIn_39_4 = stackOut_38_4;
              break L15;
            } else {
              stackOut_37_0 = (cr) (Object) stackIn_37_0;
              stackOut_37_1 = (r) (Object) stackIn_37_1;
              stackOut_37_2 = (String) (Object) stackIn_37_2;
              stackOut_37_3 = (String) (Object) stackIn_37_3;
              stackOut_37_4 = 1;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              stackIn_39_3 = stackOut_37_3;
              stackIn_39_4 = stackOut_37_4;
              break L15;
            }
          }
          L16: {
            stackIn_39_0.field_gb = gk.a(stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_39_4 != 0);
            bq.field_B.field_O = 1;
            qr.field_m = new cr(0L, ja.field_e);
            qr.field_m.field_O = 1;
            stackOut_39_0 = qr.field_m;
            stackOut_39_1 = (r) param3;
            stackOut_39_2 = "lobby";
            stackOut_39_3 = "tab_inactive";
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_41_2 = stackOut_39_2;
            stackIn_41_3 = stackOut_39_3;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            stackIn_40_2 = stackOut_39_2;
            stackIn_40_3 = stackOut_39_3;
            if (param4) {
              stackOut_41_0 = (cr) (Object) stackIn_41_0;
              stackOut_41_1 = (r) (Object) stackIn_41_1;
              stackOut_41_2 = (String) (Object) stackIn_41_2;
              stackOut_41_3 = (String) (Object) stackIn_41_3;
              stackOut_41_4 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              stackIn_42_3 = stackOut_41_3;
              stackIn_42_4 = stackOut_41_4;
              break L16;
            } else {
              stackOut_40_0 = (cr) (Object) stackIn_40_0;
              stackOut_40_1 = (r) (Object) stackIn_40_1;
              stackOut_40_2 = (String) (Object) stackIn_40_2;
              stackOut_40_3 = (String) (Object) stackIn_40_3;
              stackOut_40_4 = 1;
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              stackIn_42_3 = stackOut_40_3;
              stackIn_42_4 = stackOut_40_4;
              break L16;
            }
          }
          L17: {
            stackIn_42_0.field_Bb = hq.a(gk.a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4 != 0), 202);
            stackOut_42_0 = qr.field_m;
            stackOut_42_1 = (r) param3;
            stackOut_42_2 = "lobby";
            stackOut_42_3 = "tab_mouseover";
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_44_2 = stackOut_42_2;
            stackIn_44_3 = stackOut_42_3;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            stackIn_43_2 = stackOut_42_2;
            stackIn_43_3 = stackOut_42_3;
            if (param4) {
              stackOut_44_0 = (cr) (Object) stackIn_44_0;
              stackOut_44_1 = (r) (Object) stackIn_44_1;
              stackOut_44_2 = (String) (Object) stackIn_44_2;
              stackOut_44_3 = (String) (Object) stackIn_44_3;
              stackOut_44_4 = 0;
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              stackIn_45_3 = stackOut_44_3;
              stackIn_45_4 = stackOut_44_4;
              break L17;
            } else {
              stackOut_43_0 = (cr) (Object) stackIn_43_0;
              stackOut_43_1 = (r) (Object) stackIn_43_1;
              stackOut_43_2 = (String) (Object) stackIn_43_2;
              stackOut_43_3 = (String) (Object) stackIn_43_3;
              stackOut_43_4 = 1;
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              stackIn_45_3 = stackOut_43_3;
              stackIn_45_4 = stackOut_43_4;
              break L17;
            }
          }
          L18: {
            stackIn_45_0.field_Q = hq.a(gk.a(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4 != 0), 202);
            qr.field_m.field_T = var14;
            ab.field_d = new cr(0L, (cr) null);
            ab.field_d.field_Bb = vl.a(206, 3, 0, -1, 1856141, 1127256);
            dj.field_b = new cr(0L, (cr) null);
            dj.field_b.field_Bb = vl.a(290, 3, 0, -1, 11579568, 6052956);
            fb.field_u = new cr(0L, var15);
            fb.field_u.field_bb = 1;
            fb.field_u.field_Gb = 1;
            fb.field_u.field_O = 1;
            fb.field_u.field_Y = 1;
            fb.field_u.field_Cb = 1;
            ub.field_t = new cr(0L, fb.field_u);
            uk.field_e = new cr(0L, ja.field_e);
            uk.field_e.field_Cb = 1;
            uk.field_e.field_O = 1;
            uk.field_e.field_Y = 1;
            uk.field_e.field_Gb = 1;
            uk.field_e.field_bb = 1;
            sc.field_c = new cr(0L, uk.field_e);
            gh.field_b = new cr(0L, uk.field_e);
            vc.field_b = new cr(0L, fb.field_u);
            ip.field_a = new cr(0L, uk.field_e);
            ca.field_f = new cr(0L, uk.field_e);
            tr.field_l = new cr(0L, uk.field_e);
            uk.field_e.field_Bb = hq.a(gk.a(param3, "lobby", "smallbutton", true), 202);
            uk.field_e.field_Q = hq.a(gk.a(param3, "lobby", "smallbutton_mouseover", true), 202);
            er[] dupTemp$4 = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
            uk.field_e.field_T = dupTemp$4;
            uk.field_e.field_cb = dupTemp$4;
            stackOut_45_0 = uk.field_e;
            stackOut_45_1 = (r) param3;
            stackOut_45_2 = "lobby";
            stackOut_45_3 = "smallbutton_disabled";
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_47_2 = stackOut_45_2;
            stackIn_47_3 = stackOut_45_3;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            stackIn_46_2 = stackOut_45_2;
            stackIn_46_3 = stackOut_45_3;
            if (param4) {
              stackOut_47_0 = (cr) (Object) stackIn_47_0;
              stackOut_47_1 = (r) (Object) stackIn_47_1;
              stackOut_47_2 = (String) (Object) stackIn_47_2;
              stackOut_47_3 = (String) (Object) stackIn_47_3;
              stackOut_47_4 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              stackIn_48_3 = stackOut_47_3;
              stackIn_48_4 = stackOut_47_4;
              break L18;
            } else {
              stackOut_46_0 = (cr) (Object) stackIn_46_0;
              stackOut_46_1 = (r) (Object) stackIn_46_1;
              stackOut_46_2 = (String) (Object) stackIn_46_2;
              stackOut_46_3 = (String) (Object) stackIn_46_3;
              stackOut_46_4 = 1;
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              stackIn_48_3 = stackOut_46_3;
              stackIn_48_4 = stackOut_46_4;
              break L18;
            }
          }
          L19: {
            stackIn_48_0.field_gb = hq.a(gk.a(stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4 != 0), 202);
            ub.field_t.field_Bb = hq.a(gk.a(param3, "lobby", "mediumbutton", true), 202);
            ub.field_t.field_Q = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseover", true), 202);
            ub.field_t.field_cb = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseheld", true), 202);
            fb.field_u.field_Bb = hq.a(gk.a(param3, "lobby", "bigbutton", true), 202);
            fb.field_u.field_Q = hq.a(gk.a(param3, "lobby", "bigbutton_mouseover", true), 202);
            stackOut_48_0 = fb.field_u;
            stackOut_48_1 = (r) param3;
            stackOut_48_2 = "lobby";
            stackOut_48_3 = "bigbutton_mouseheld";
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_50_2 = stackOut_48_2;
            stackIn_50_3 = stackOut_48_3;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            stackIn_49_2 = stackOut_48_2;
            stackIn_49_3 = stackOut_48_3;
            if (param4) {
              stackOut_50_0 = (cr) (Object) stackIn_50_0;
              stackOut_50_1 = (r) (Object) stackIn_50_1;
              stackOut_50_2 = (String) (Object) stackIn_50_2;
              stackOut_50_3 = (String) (Object) stackIn_50_3;
              stackOut_50_4 = 0;
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              stackIn_51_3 = stackOut_50_3;
              stackIn_51_4 = stackOut_50_4;
              break L19;
            } else {
              stackOut_49_0 = (cr) (Object) stackIn_49_0;
              stackOut_49_1 = (r) (Object) stackIn_49_1;
              stackOut_49_2 = (String) (Object) stackIn_49_2;
              stackOut_49_3 = (String) (Object) stackIn_49_3;
              stackOut_49_4 = 1;
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              stackIn_51_3 = stackOut_49_3;
              stackIn_51_4 = stackOut_49_4;
              break L19;
            }
          }
          L20: {
            stackIn_51_0.field_cb = hq.a(gk.a(stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4 != 0), 202);
            fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled", true), 202);
            sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton", true), 202);
            stackOut_51_0 = sc.field_c;
            stackOut_51_1 = (r) param3;
            stackOut_51_2 = "lobby";
            stackOut_51_3 = "greenbutton_mouseover";
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_53_2 = stackOut_51_2;
            stackIn_53_3 = stackOut_51_3;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            stackIn_52_2 = stackOut_51_2;
            stackIn_52_3 = stackOut_51_3;
            if (param4) {
              stackOut_53_0 = (cr) (Object) stackIn_53_0;
              stackOut_53_1 = (r) (Object) stackIn_53_1;
              stackOut_53_2 = (String) (Object) stackIn_53_2;
              stackOut_53_3 = (String) (Object) stackIn_53_3;
              stackOut_53_4 = 0;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              stackIn_54_4 = stackOut_53_4;
              break L20;
            } else {
              stackOut_52_0 = (cr) (Object) stackIn_52_0;
              stackOut_52_1 = (r) (Object) stackIn_52_1;
              stackOut_52_2 = (String) (Object) stackIn_52_2;
              stackOut_52_3 = (String) (Object) stackIn_52_3;
              stackOut_52_4 = 1;
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              stackIn_54_3 = stackOut_52_3;
              stackIn_54_4 = stackOut_52_4;
              break L20;
            }
          }
          L21: {
            stackIn_54_0.field_Q = hq.a(gk.a(stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_54_4 != 0), 202);
            stackOut_54_0 = sc.field_c;
            stackOut_54_1 = (r) param3;
            stackOut_54_2 = "lobby";
            stackOut_54_3 = "greenbutton_mouseheld";
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_56_2 = stackOut_54_2;
            stackIn_56_3 = stackOut_54_3;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            stackIn_55_2 = stackOut_54_2;
            stackIn_55_3 = stackOut_54_3;
            if (param4) {
              stackOut_56_0 = (cr) (Object) stackIn_56_0;
              stackOut_56_1 = (r) (Object) stackIn_56_1;
              stackOut_56_2 = (String) (Object) stackIn_56_2;
              stackOut_56_3 = (String) (Object) stackIn_56_3;
              stackOut_56_4 = 0;
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              stackIn_57_3 = stackOut_56_3;
              stackIn_57_4 = stackOut_56_4;
              break L21;
            } else {
              stackOut_55_0 = (cr) (Object) stackIn_55_0;
              stackOut_55_1 = (r) (Object) stackIn_55_1;
              stackOut_55_2 = (String) (Object) stackIn_55_2;
              stackOut_55_3 = (String) (Object) stackIn_55_3;
              stackOut_55_4 = 1;
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              stackIn_57_3 = stackOut_55_3;
              stackIn_57_4 = stackOut_55_4;
              break L21;
            }
          }
          L22: {
            stackIn_57_0.field_cb = hq.a(gk.a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4 != 0), 202);
            gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton", true), 202);
            gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover", true), 202);
            stackOut_57_0 = gh.field_b;
            stackOut_57_1 = (r) param3;
            stackOut_57_2 = "lobby";
            stackOut_57_3 = "redbutton_mouseheld";
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_59_2 = stackOut_57_2;
            stackIn_59_3 = stackOut_57_3;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            stackIn_58_2 = stackOut_57_2;
            stackIn_58_3 = stackOut_57_3;
            if (param4) {
              stackOut_59_0 = (cr) (Object) stackIn_59_0;
              stackOut_59_1 = (r) (Object) stackIn_59_1;
              stackOut_59_2 = (String) (Object) stackIn_59_2;
              stackOut_59_3 = (String) (Object) stackIn_59_3;
              stackOut_59_4 = 0;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              stackIn_60_3 = stackOut_59_3;
              stackIn_60_4 = stackOut_59_4;
              break L22;
            } else {
              stackOut_58_0 = (cr) (Object) stackIn_58_0;
              stackOut_58_1 = (r) (Object) stackIn_58_1;
              stackOut_58_2 = (String) (Object) stackIn_58_2;
              stackOut_58_3 = (String) (Object) stackIn_58_3;
              stackOut_58_4 = 1;
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              stackIn_60_3 = stackOut_58_3;
              stackIn_60_4 = stackOut_58_4;
              break L22;
            }
          }
          L23: {
            stackIn_60_0.field_cb = hq.a(gk.a(stackIn_60_1, stackIn_60_2, stackIn_60_3, stackIn_60_4 != 0), 202);
            vc.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "backbutton", true), 202);
            vc.field_b.field_Q = hq.a(gk.a(param3, "lobby", "backbutton_mouseover", true), 202);
            vc.field_b.field_cb = hq.a(gk.a(param3, "lobby", "backbutton_mouseheld", true), 202);
            vc.field_b.field_gb = hq.a(gk.a(param3, "lobby", "backbutton_disabled", true), 202);
            tr.field_l.field_Bb = hq.a(gk.a(param3, "lobby", "gameoptionbutton", true), 202);
            stackOut_60_0 = tr.field_l;
            stackOut_60_1 = (r) param3;
            stackOut_60_2 = "lobby";
            stackOut_60_3 = "gameoptionbutton_mouseover";
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_62_2 = stackOut_60_2;
            stackIn_62_3 = stackOut_60_3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            stackIn_61_2 = stackOut_60_2;
            stackIn_61_3 = stackOut_60_3;
            if (param4) {
              stackOut_62_0 = (cr) (Object) stackIn_62_0;
              stackOut_62_1 = (r) (Object) stackIn_62_1;
              stackOut_62_2 = (String) (Object) stackIn_62_2;
              stackOut_62_3 = (String) (Object) stackIn_62_3;
              stackOut_62_4 = 0;
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              stackIn_63_3 = stackOut_62_3;
              stackIn_63_4 = stackOut_62_4;
              break L23;
            } else {
              stackOut_61_0 = (cr) (Object) stackIn_61_0;
              stackOut_61_1 = (r) (Object) stackIn_61_1;
              stackOut_61_2 = (String) (Object) stackIn_61_2;
              stackOut_61_3 = (String) (Object) stackIn_61_3;
              stackOut_61_4 = 1;
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              stackIn_63_3 = stackOut_61_3;
              stackIn_63_4 = stackOut_61_4;
              break L23;
            }
          }
          L24: {
            stackIn_63_0.field_Q = hq.a(gk.a(stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_63_4 != 0), 202);
            er[] dupTemp$5 = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
            tr.field_l.field_T = dupTemp$5;
            tr.field_l.field_cb = dupTemp$5;
            tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled", true), 202);
            ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton", true), 202);
            ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover", true), 202);
            er[] dupTemp$6 = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
            ip.field_a.field_T = dupTemp$6;
            ip.field_a.field_cb = dupTemp$6;
            stackOut_63_0 = ca.field_f;
            stackOut_63_1 = (r) param3;
            stackOut_63_2 = "lobby";
            stackOut_63_3 = "chatfilterbutton";
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_65_2 = stackOut_63_2;
            stackIn_65_3 = stackOut_63_3;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            stackIn_64_2 = stackOut_63_2;
            stackIn_64_3 = stackOut_63_3;
            if (param4) {
              stackOut_65_0 = (cr) (Object) stackIn_65_0;
              stackOut_65_1 = (r) (Object) stackIn_65_1;
              stackOut_65_2 = (String) (Object) stackIn_65_2;
              stackOut_65_3 = (String) (Object) stackIn_65_3;
              stackOut_65_4 = 0;
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              stackIn_66_3 = stackOut_65_3;
              stackIn_66_4 = stackOut_65_4;
              break L24;
            } else {
              stackOut_64_0 = (cr) (Object) stackIn_64_0;
              stackOut_64_1 = (r) (Object) stackIn_64_1;
              stackOut_64_2 = (String) (Object) stackIn_64_2;
              stackOut_64_3 = (String) (Object) stackIn_64_3;
              stackOut_64_4 = 1;
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              stackIn_66_3 = stackOut_64_3;
              stackIn_66_4 = stackOut_64_4;
              break L24;
            }
          }
          L25: {
            stackIn_66_0.field_Bb = hq.a(gk.a(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4 != 0), 202);
            stackOut_66_0 = ca.field_f;
            stackOut_66_1 = (r) param3;
            stackOut_66_2 = "lobby";
            stackOut_66_3 = "chatfilterbutton_mouseover";
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_68_2 = stackOut_66_2;
            stackIn_68_3 = stackOut_66_3;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            stackIn_67_2 = stackOut_66_2;
            stackIn_67_3 = stackOut_66_3;
            if (param4) {
              stackOut_68_0 = (cr) (Object) stackIn_68_0;
              stackOut_68_1 = (r) (Object) stackIn_68_1;
              stackOut_68_2 = (String) (Object) stackIn_68_2;
              stackOut_68_3 = (String) (Object) stackIn_68_3;
              stackOut_68_4 = 0;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              stackIn_69_3 = stackOut_68_3;
              stackIn_69_4 = stackOut_68_4;
              break L25;
            } else {
              stackOut_67_0 = (cr) (Object) stackIn_67_0;
              stackOut_67_1 = (r) (Object) stackIn_67_1;
              stackOut_67_2 = (String) (Object) stackIn_67_2;
              stackOut_67_3 = (String) (Object) stackIn_67_3;
              stackOut_67_4 = 1;
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              stackIn_69_3 = stackOut_67_3;
              stackIn_69_4 = stackOut_67_4;
              break L25;
            }
          }
          L26: {
            stackIn_69_0.field_Q = hq.a(gk.a(stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_69_4 != 0), 202);
            er[] dupTemp$7 = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
            ca.field_f.field_T = dupTemp$7;
            ca.field_f.field_cb = dupTemp$7;
            stackOut_69_0 = (r) param3;
            stackOut_69_1 = "lobby";
            stackOut_69_2 = "checkbox";
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_71_2 = stackOut_69_2;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            stackIn_70_2 = stackOut_69_2;
            if (param4) {
              stackOut_71_0 = (r) (Object) stackIn_71_0;
              stackOut_71_1 = (String) (Object) stackIn_71_1;
              stackOut_71_2 = (String) (Object) stackIn_71_2;
              stackOut_71_3 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              stackIn_72_3 = stackOut_71_3;
              break L26;
            } else {
              stackOut_70_0 = (r) (Object) stackIn_70_0;
              stackOut_70_1 = (String) (Object) stackIn_70_1;
              stackOut_70_2 = (String) (Object) stackIn_70_2;
              stackOut_70_3 = 1;
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              stackIn_72_3 = stackOut_70_3;
              break L26;
            }
          }
          L27: {
            var17 = gk.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_72_3 != 0);
            fr.field_a = new sm(0L, var17[1], var17[0], 1, ja.field_e, (String) null);
            tb.field_a = new cr(0L, (cr) null);
            tb.field_a.field_Bb = rh.a(tn.a("slideregion", param3, -90, "lobby"), -27140);
            tb.field_a.field_Q = rh.a(tn.a("slideregion_mouseover", param3, -95, "lobby"), -27140);
            tb.field_a.field_cb = rh.a(tn.a("slideregion_mouseheld", param3, -77, "lobby"), -27140);
            tb.field_a.field_gb = rh.a(tn.a("slideregion_disabled", param3, -89, "lobby"), -27140);
            sj.field_c = new cr(0L, (cr) null);
            sj.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "dragbar", true), 202);
            stackOut_72_0 = sj.field_c;
            stackOut_72_1 = (r) param3;
            stackOut_72_2 = "lobby";
            stackOut_72_3 = "dragbar_mouseover";
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_74_2 = stackOut_72_2;
            stackIn_74_3 = stackOut_72_3;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            stackIn_73_2 = stackOut_72_2;
            stackIn_73_3 = stackOut_72_3;
            if (param4) {
              stackOut_74_0 = (cr) (Object) stackIn_74_0;
              stackOut_74_1 = (r) (Object) stackIn_74_1;
              stackOut_74_2 = (String) (Object) stackIn_74_2;
              stackOut_74_3 = (String) (Object) stackIn_74_3;
              stackOut_74_4 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              stackIn_75_3 = stackOut_74_3;
              stackIn_75_4 = stackOut_74_4;
              break L27;
            } else {
              stackOut_73_0 = (cr) (Object) stackIn_73_0;
              stackOut_73_1 = (r) (Object) stackIn_73_1;
              stackOut_73_2 = (String) (Object) stackIn_73_2;
              stackOut_73_3 = (String) (Object) stackIn_73_3;
              stackOut_73_4 = 1;
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              stackIn_75_3 = stackOut_73_3;
              stackIn_75_4 = stackOut_73_4;
              break L27;
            }
          }
          stackIn_75_0.field_Q = hq.a(gk.a(stackIn_75_1, stackIn_75_2, stackIn_75_3, stackIn_75_4 != 0), 202);
          sj.field_c.field_cb = hq.a(gk.a(param3, "lobby", "dragbar_mouseheld", true), 202);
          sj.field_c.field_gb = hq.a(gk.a(param3, "lobby", "dragbar_disabled", true), 202);
          ad.field_e = new cr(0L, (cr) null);
          ad.field_e.field_Db = tn.a("upbutton", param3, -73, "lobby");
          ad.field_e.field_W = tn.a("upbutton_mouseover", param3, -107, "lobby");
          ad.field_e.field_Ab = tn.a("upbutton_mouseheld", param3, -100, "lobby");
          ad.field_e.field_I = tn.a("upbutton_disabled", param3, -80, "lobby");
          lc.field_e = new cr(0L, (cr) null);
          lc.field_e.field_Db = tn.a("downbutton", param3, -101, "lobby");
          lc.field_e.field_W = tn.a("downbutton_mouseover", param3, -77, "lobby");
          lc.field_e.field_Ab = tn.a("downbutton_mouseheld", param3, -114, "lobby");
          lc.field_e.field_I = tn.a("downbutton_disabled", param3, -99, "lobby");
          ol.field_H = new ie(0L, ad.field_e, lc.field_e, tb.field_a, sj.field_c);
          pb.field_b = new dm(0L, (cr) null, ua.field_c, ol.field_H, uk.field_e, (String) null, (String) null);
          return;
        }
    }

    final nq a(int param0, int param1, qh param2, byte[] param3) {
        nq var5 = null;
        RuntimeException var5_ref = null;
        nq stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        nq stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5 = new nq();
              var5.field_B = 2;
              var5.field_n = (long)param1;
              var5.field_u = false;
              var5.field_F = param2;
              if (param0 == -19932) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            var5.field_L = param3;
            this.a(var5, 0);
            stackOut_3_0 = (nq) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("t.E(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    t(jj param0) {
        RuntimeException runtimeException = null;
        wk var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        ((t) this).field_e = new ak();
        ((t) this).field_d = 0;
        ((t) this).field_j = false;
        try {
          L0: {
            var2 = param0.a(5, (Runnable) this, 0);
            L1: while (true) {
              L2: {
                L3: {
                  if (0 != var2.field_b) {
                    break L3;
                  } else {
                    um.a(true, 10L);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2.field_b != 2) {
                  ((t) this).field_h = (Thread) var2.field_d;
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("t.<init>(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unable to delete name - system busy";
        field_k = "Clan";
        field_a = 0;
        field_b = 0;
        field_i = "Level select";
        field_f = field_a;
        field_m = null;
        field_g = 49;
    }
}
