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
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            sga var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = TombRacer.field_G ? 1 : 0;
            L0: while (true) {
              if (((ss) this).field_e) {
                return;
              } else {
                var2 = (Object) (Object) ((ss) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (sga) (Object) ((ss) this).field_d.c((byte) 116);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((ss) this).field_d).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((ss) this).field_b = ((ss) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_q != 2) {
                          if (var7.field_q != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_p = var7.field_o.a((int)var7.field_j, -114);
                            var7.field_m = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_o.a((int)var7.field_j, var7.field_p, var7.field_p.length, (byte) 124);
                          var7.field_m = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      ssa.a((String) null, (byte) 125, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_m = false;
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
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((ss) this).field_e = true;
        var2 = (Object) (Object) ((ss) this).field_d;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((ss) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((ss) this).field_a.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((ss) this).field_a = null;
        if (param0 != 118) {
          ((ss) this).field_b = -68;
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 4) {
          L0: {
            boolean discarded$13 = ss.a((byte) -46, 11, 42);
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
        sga stackIn_9_0 = null;
        sga stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        sga stackOut_8_0 = null;
        sga stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4 = new sga();
            var4.field_q = 1;
            var5 = (Object) (Object) ((ss) this).field_d;
            synchronized (var5) {
              L1: {
                var6 = (sga) (Object) ((ss) this).field_d.b((byte) 38);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((long)param2 != var6.field_j) {
                        break L3;
                      } else {
                        if (var6.field_o != param1) {
                          break L3;
                        } else {
                          if (var6.field_q == 2) {
                            var4.field_m = false;
                            var4.field_p = var6.field_p;
                            stackOut_8_0 = (sga) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (sga) (Object) ((ss) this).field_d.c(28);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param0 == 15871) {
                break L4;
              } else {
                ((ss) this).field_e = false;
                break L4;
              }
            }
            var4.field_p = param1.a(param2, -124);
            var4.field_m = false;
            var4.field_l = true;
            stackOut_17_0 = (sga) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("ss.C(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    final sga a(byte param0, int param1, ppa param2) {
        sga var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
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
                var5 = null;
                sga discarded$2 = ((ss) this).a(true, 61, (ppa) null, (byte[]) null);
                break L1;
              }
            }
            stackOut_2_0 = (sga) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ss.B(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0) {
        lqa var1 = uv.b(false);
        if (param0 < 122) {
            boolean discarded$10 = ss.a((byte) -30, -8, 82);
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
        synchronized (((ss) this).field_d) {
            ((ss) this).field_d.a((od) (Object) param1, (byte) -105);
            if (param0 >= -27) {
                Object var5 = null;
                sga discarded$0 = ((ss) this).a((byte) -87, 82, (ppa) null);
            }
            ((ss) this).field_b = ((ss) this).field_b + 1;
            ((Object) (Object) ((ss) this).field_d).notifyAll();
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
              stackOut_0_0 = (sga) var5;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param0) {
                stackOut_2_0 = (sga) (Object) stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (sga) (Object) stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_l = stackIn_3_1 != 0;
            this.a(-98, var5);
            stackOut_3_0 = (sga) var5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("ss.A(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    ss(fia param0) {
        naa var2 = null;
        ((ss) this).field_d = new vj();
        ((ss) this).field_b = 0;
        ((ss) this).field_e = false;
        try {
            var2 = param0.a((Runnable) this, 425, 5);
            while (var2.field_b == 0) {
                vja.a(0, 10L);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            ((ss) this).field_a = (Thread) var2.field_f;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ss.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 100;
    }
}
