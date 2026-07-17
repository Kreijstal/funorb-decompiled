/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh implements Runnable {
    static String field_c;
    static int field_g;
    static int field_a;
    static int field_i;
    static qf field_d;
    static byte[][] field_j;
    static int field_e;
    private ra field_b;
    private boolean field_l;
    private Thread field_h;
    static String field_f;
    int field_k;

    final wd a(byte param0, int param1, na param2, byte[] param3) {
        wd var5 = null;
        RuntimeException var5_ref = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 37) {
                break L1;
              } else {
                sh.a((byte) -26);
                break L1;
              }
            }
            var5 = new wd();
            var5.field_x = param2;
            var5.field_A = param3;
            var5.field_n = (long)param1;
            var5.field_r = false;
            var5.field_v = 2;
            this.a(true, var5);
            stackOut_2_0 = (wd) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("sh.A(").append(param0).append(44).append(param1).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(boolean param0, wd param1) {
        synchronized (((sh) this).field_b) {
            ((sh) this).field_b.a((nb) (Object) param1, (byte) -112);
            ((sh) this).field_k = ((sh) this).field_k + 1;
            if (!param0) {
                Object var5 = null;
                aj discarded$0 = sh.a((Throwable) null, (String) null);
            }
            ((Object) (Object) ((sh) this).field_b).notifyAll();
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            wd var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = ZombieDawn.field_J;
            L0: while (true) {
              if (((sh) this).field_l) {
                return;
              } else {
                var2 = (Object) (Object) ((sh) this).field_b;
                synchronized (var2) {
                  L1: {
                    var7 = (wd) (Object) ((sh) this).field_b.a(-90);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((sh) this).field_b).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((sh) this).field_k = ((sh) this).field_k - 1;
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
                        if (2 != var7.field_v) {
                          if (var7.field_v == 3) {
                            var7.field_A = var7.field_x.a(-65536, (int)var7.field_n);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_q = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_x.a((int)var7.field_n, var7.field_A, var7.field_A.length, (byte) -96);
                          var7.field_q = false;
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
                      ae.a((Throwable) (Object) var2_ref, 10331, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_q = false;
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

    final static aj a(Throwable param0, String param1) {
        aj var2 = null;
        if (!(param0 instanceof aj)) {
            var2 = new aj(param0, param1);
        } else {
            var2 = (aj) (Object) param0;
            var2.field_b = var2.field_b + 32 + param1;
        }
        return var2;
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((sh) this).field_l = stackIn_3_1 != 0;
        var2 = (Object) (Object) ((sh) this).field_b;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((sh) this).field_b).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((sh) this).field_h.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((sh) this).field_h = null;
    }

    final wd a(int param0, na param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        wd var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_4_0 = null;
        wd stackIn_11_0 = null;
        wd stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        wd stackOut_10_0 = null;
        Object stackOut_3_0 = null;
        wd stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var4 = new wd();
            var4.field_v = 1;
            var5 = (Object) (Object) ((sh) this).field_b;
            synchronized (var5) {
              L1: {
                if (param2 < -101) {
                  var6 = (wd) (Object) ((sh) this).field_b.c((byte) 34);
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if ((long)param0 != var6.field_n) {
                          break L3;
                        } else {
                          if (var6.field_x != param1) {
                            break L3;
                          } else {
                            if (var6.field_v != 2) {
                              break L3;
                            } else {
                              var4.field_A = var6.field_A;
                              var4.field_q = false;
                              stackOut_10_0 = (wd) var4;
                              stackIn_11_0 = stackOut_10_0;
                              return stackIn_11_0;
                            }
                          }
                        }
                      }
                      var6 = (wd) (Object) ((sh) this).field_b.a((byte) 114);
                      continue L2;
                    }
                  }
                } else {
                  stackOut_3_0 = null;
                  stackIn_4_0 = stackOut_3_0;
                  return (wd) (Object) stackIn_4_0;
                }
              }
            }
            var4.field_A = param1.a(-65536, param0);
            var4.field_r = true;
            var4.field_q = false;
            stackOut_17_0 = (wd) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("sh.D(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    public static void a(byte param0) {
        field_j = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 >= -117) {
            field_f = null;
        }
    }

    final wd a(byte param0, na param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_2_0 = null;
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
              var4 = new wd();
              var4.field_r = false;
              var4.field_n = (long)param2;
              var4.field_x = param1;
              var4.field_v = 3;
              this.a(true, var4);
              if (param0 == -119) {
                break L1;
              } else {
                var5 = null;
                this.a(false, (wd) null);
                break L1;
              }
            }
            stackOut_2_0 = (wd) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("sh.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    sh(ec param0) {
        op var2 = null;
        ((sh) this).field_b = new ra();
        ((sh) this).field_l = false;
        ((sh) this).field_k = 0;
        try {
            var2 = param0.a(5, (Runnable) this, true);
            while (0 == var2.field_f) {
                ld.a(10L, (byte) 105);
            }
            if (2 == var2.field_f) {
                throw new RuntimeException();
            }
            ((sh) this).field_h = (Thread) var2.field_d;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "sh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_j = new byte[50][];
        field_c = "Resume Game";
        field_g = 70;
        field_f = "The requirements and rewards for this will be shown once it has been achieved.";
    }
}
