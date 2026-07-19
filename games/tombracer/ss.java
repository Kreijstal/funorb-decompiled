/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss implements Runnable {
    private vj field_d;
    static int field_c;
    int field_b;
    private Thread field_a;
    private boolean field_e;

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Exception var2 = null;
            Object var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            sga var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = TombRacer.field_G ? 1 : 0;
            L0: while (true) {
              if (this.field_e) {
                return;
              } else {
                var2_ref = this.field_d;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (sga) ((Object) this.field_d.c((byte) 116));
                    if (var5 == 0) {
                      L2: {
                        if (var7 == null) {
                          break L2;
                        } else {
                          this.field_b = this.field_b - 1;
                          if (var5 == 0) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      try {
                        L3: {
                          this.field_d.wait();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 0;
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
                    L5: {
                      L6: {
                        L7: {
                          if (-3 != (var7.field_q ^ -1)) {
                            break L7;
                          } else {
                            discarded$1 = var7.field_o.a((int)var7.field_j, var7.field_p, var7.field_p.length, (byte) 124);
                            if (var5 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var7.field_q != 3) {
                          break L6;
                        } else {
                          var7.field_p = var7.field_o.a((int)var7.field_j, -114);
                          var7.field_m = false;
                          decompiledRegionSelector1 = 1;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      ssa.a((String) null, (byte) 125, (Throwable) ((Object) var2));
                      decompiledRegionSelector1 = 0;
                      break L8;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_m = false;
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            this.field_e = true;
            var2 = this.field_d;
            synchronized (var2) {
              L0: {
                this.field_d.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_a.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            this.field_a = null;
            if (param0 != 118) {
              this.field_b = -68;
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

    final static boolean a(byte param0, int param1, int param2) {
        boolean discarded$13 = false;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 4) {
          L0: {
            discarded$13 = ss.a((byte) -46, 11, 42);
            if ((param2 & 2048) == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param2 & 2048) == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final sga a(int param0, ppa param1, int param2) {
        sga var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        sga var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        sga stackIn_10_0 = null;
        int stackIn_17_0 = 0;
        sga stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        sga stackOut_9_0 = null;
        int stackOut_16_0 = 0;
        sga stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = new sga();
            var4.field_q = 1;
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                var6 = (sga) ((Object) this.field_d.b((byte) 38));
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var6 == null) {
                        break L4;
                      } else {
                        stackOut_4_0 = ((long)param2 < var6.field_j ? -1 : ((long)param2 == var6.field_j ? 0 : 1));
                        stackIn_17_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_5_0 != 0) {
                              break L5;
                            } else {
                              if (var6.field_o != param1) {
                                break L5;
                              } else {
                                if (-3 == (var6.field_q ^ -1)) {
                                  var4.field_m = false;
                                  var4.field_p = var6.field_p;
                                  stackOut_9_0 = (sga) (var4);
                                  stackIn_10_0 = stackOut_9_0;
                                  return stackIn_10_0;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var6 = (sga) ((Object) this.field_d.c(28));
                          if (var8 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_16_0 = param0;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  }
                  break L1;
                }
              }
            }
            L6: {
              if (stackIn_17_0 == 15871) {
                break L6;
              } else {
                this.field_e = false;
                break L6;
              }
            }
            var4.field_p = param1.a(param2, -124);
            var4.field_m = false;
            var4.field_l = true;
            stackOut_19_0 = (sga) (var4);
            stackIn_20_0 = stackOut_19_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4_ref);
            stackOut_21_1 = new StringBuilder().append("ss.C(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        return stackIn_20_0;
    }

    final sga a(byte param0, int param1, ppa param2) {
        sga discarded$2 = null;
        sga var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        sga stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sga stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = new sga();
              var4.field_o = param2;
              var4.field_j = (long)param1;
              var4.field_q = 3;
              var4.field_l = false;
              this.a(-42, var4);
              if (param0 < -42) {
                break L1;
              } else {
                var5 = (byte[]) null;
                discarded$2 = this.a(true, 61, (ppa) null, (byte[]) null);
                break L1;
              }
            }
            stackOut_2_0 = (sga) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("ss.B(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0) {
        boolean discarded$10 = false;
        lqa var1 = uv.b(false);
        if (param0 < 122) {
            discarded$10 = ss.a((byte) -30, -8, 82);
            if (!(var1 != null)) {
                return false;
            }
            return var1.field_h;
        }
        if (!(var1 != null)) {
            return false;
        }
        return var1.field_h;
    }

    private final void a(int param0, sga param1) {
        sga discarded$0 = null;
        synchronized (this.field_d) {
            this.field_d.a(param1, (byte) -105);
            if (param0 >= -27) {
                ppa var5 = (ppa) null;
                discarded$0 = this.a((byte) -87, 82, (ppa) null);
            }
            this.field_b = this.field_b + 1;
            this.field_d.notifyAll();
        }
    }

    final sga a(boolean param0, int param1, ppa param2, byte[] param3) {
        sga var5 = null;
        RuntimeException var5_ref = null;
        sga stackIn_1_0 = null;
        sga stackIn_2_0 = null;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        sga stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        sga stackOut_0_0 = null;
        sga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        sga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        sga stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5 = new sga();
              var5.field_p = param3;
              var5.field_q = 2;
              var5.field_j = (long)param1;
              var5.field_o = param2;
              stackOut_0_0 = (sga) (var5);
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param0) {
                stackOut_2_0 = (sga) ((Object) stackIn_2_0);
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (sga) ((Object) stackIn_1_0);
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_l = stackIn_3_1 != 0;
            this.a(-98, var5);
            stackOut_3_0 = (sga) (var5);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5_ref);
            stackOut_5_1 = new StringBuilder().append("ss.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    ss(fia param0) {
        RuntimeException runtimeException = null;
        naa var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        this.field_d = new vj();
        this.field_b = 0;
        this.field_e = false;
        try {
          L0: {
            var2 = param0.a((Runnable) (this), 425, 5);
            L1: while (true) {
              L2: {
                L3: {
                  if (-1 != (var2.field_b ^ -1)) {
                    break L3;
                  } else {
                    vja.a(0, 10L);
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
                if ((var2.field_b ^ -1) != -3) {
                  this.field_a = (Thread) (var2.field_f);
                  break L0;
                } else {
                  break L2;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ss.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_c = 100;
    }
}
