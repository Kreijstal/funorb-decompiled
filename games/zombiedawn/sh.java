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
            stackIn_3_0 = (wd) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(boolean param0, wd param1) {
        synchronized (this.field_b) {
            this.field_b.a(param1, (byte) -112);
            this.field_k = this.field_k + 1;
            if (!param0) {
                String var5 = (String) null;
                sh.a((Throwable) null, (String) null);
            }
            this.field_b.notifyAll();
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            wd var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = ZombieDawn.field_J;
            L0: while (true) {
              if (this.field_l) {
                return;
              } else {
                var2 = this.field_b;
                synchronized (var2) {
                  L1: {
                    var7 = (wd) ((Object) this.field_b.a(-90));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_b.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      this.field_k = this.field_k - 1;
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
                          if (-4 == (var7.field_v ^ -1)) {
                            var7.field_A = var7.field_x.a(-65536, (int)var7.field_n);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_q = false;
                            break L5;
                          }
                        } else {
                          var7.field_x.a((int)var7.field_n, var7.field_A, var7.field_A.length, (byte) -96);
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
                      var6 = (String) null;
                      ae.a((Throwable) ((Object) var2_ref), 10331, (String) null);
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
            var2 = (aj) ((Object) param0);
            var2.field_b = var2.field_b + ' ' + param1;
        }
        return var2;
    }

    final void a(boolean param0) {
        try {
            this.field_l = param0 ? true : false;
            synchronized (this.field_b) {
                this.field_b.notifyAll();
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

    final wd a(int param0, na param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        wd var6 = null;
        int var8 = 0;
        wd stackIn_4_0 = null;
        wd stackIn_11_0 = null;
        wd stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var4 = new wd();
            var4.field_v = 1;
            var5_ref = this.field_b;
            synchronized (var5_ref) {
              L1: {
                if (param2 < -101) {
                  var6 = (wd) ((Object) this.field_b.c((byte) 34));
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
                            if ((var6.field_v ^ -1) != -3) {
                              break L3;
                            } else {
                              var4.field_A = var6.field_A;
                              var4.field_q = false;
                              stackIn_11_0 = (wd) (var4);
                              return stackIn_11_0;
                            }
                          }
                        }
                      }
                      var6 = (wd) ((Object) this.field_b.a((byte) 114));
                      continue L2;
                    }
                  }
                } else {
                  stackIn_4_0 = (wd) null;
                  return stackIn_4_0;
                }
              }
            }
            var4.field_A = param1.a(-65536, param0);
            var4.field_r = true;
            var4.field_q = false;
            stackIn_18_0 = (wd) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("sh.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(byte param0) {
        field_j = (byte[][]) null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 >= -117) {
            field_f = (String) null;
        }
    }

    final wd a(byte param0, na param1, int param2) {
        wd var4 = null;
        RuntimeException var4_ref = null;
        wd var5 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                var5 = (wd) null;
                this.a(false, (wd) null);
                break L1;
              }
            }
            stackIn_3_0 = (wd) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("sh.E(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    sh(ec param0) {
        op var2 = null;
        this.field_b = new ra();
        this.field_l = false;
        this.field_k = 0;
        try {
            var2 = param0.a(5, (Runnable) (this), true);
            while (0 == var2.field_f) {
                ld.a(10L, (byte) 105);
            }
            if (2 == var2.field_f) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "sh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = -1;
        field_j = new byte[50][];
        field_c = "Resume Game";
        field_g = 70;
        field_f = "The requirements and rewards for this will be shown once it has been achieved.";
    }
}
