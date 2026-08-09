/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm implements Runnable {
    static int[] field_g;
    static volatile int field_a;
    private wa field_d;
    static String[] field_f;
    private Thread field_h;
    static String field_c;
    int field_b;
    static int field_e;
    private boolean field_i;

    final static void a(int param0) {
        int[] var2;
        if (param0 != -6145) {
          var2 = (int[]) null;
          nm.a(-93, (int[]) null, 25);
          oj.a(4, param0 ^ -6148);
          return;
        } else {
          oj.a(4, param0 ^ -6148);
          return;
        }
    }

    final void a(byte param0) {
        try {
            InterruptedException interruptedException = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            this.field_i = true;
            var2 = this.field_d;
            synchronized (var2) {
              L0: {
                this.field_d.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_h.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            if (param0 != -32) {
              field_e = 86;
              this.field_h = null;
              return;
            } else {
              this.field_h = null;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -827843803) {
                break L1;
              } else {
                field_a = 88;
                break L1;
              }
            }
            L2: {
              if (-1 == (param1[param0 >> -827843803] & 1 << (param0 & 31) ^ -1)) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("nm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            vl var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = MinerDisturbance.field_ab;
            L0: while (true) {
              if (this.field_i) {
                return;
              } else {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (vl) ((Object) this.field_d.c(8192));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_d.wait();
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
                      this.field_b = this.field_b - 1;
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
                        if (-3 != (var7.field_H ^ -1)) {
                          if (-4 != (var7.field_H ^ -1)) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_F = var7.field_D.a(255, (int)var7.field_p);
                            var7.field_C = false;
                            break L5;
                          }
                        } else {
                          var7.field_D.a(var7.field_F.length, var7.field_F, (byte) 104, (int)var7.field_p);
                          var7.field_C = false;
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
                      di.a((Throwable) ((Object) var2_ref), 1, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_C = false;
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

    final static int a(int param0, byte param1) {
        int var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        var2 = 40 / ((-81 - param1) / 45);
        param0 = param0 & 8191;
        if (param0 < 4096) {
          L0: {
            if (2048 > param0) {
              stackIn_8_0 = ta.field_g[param0];
              break L0;
            } else {
              stackIn_8_0 = ta.field_g[-param0 + 4096];
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (-6145 < (param0 ^ -1)) {
              stackIn_4_0 = -ta.field_g[param0 - 4096];
              break L1;
            } else {
              stackIn_4_0 = -ta.field_g[8192 + -param0];
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final vl a(int param0, boolean param1, uh param2) {
        vl var4 = null;
        RuntimeException var4_ref = null;
        vl stackIn_2_0 = null;
        vl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new vl();
              var4.field_p = (long)param0;
              var4.field_H = 3;
              stackIn_2_0 = (vl) (var4);

              if (!param1) {
                stackIn_3_0 = (vl) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (vl) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_v = stackIn_3_1 != 0;
            var4.field_D = param2;
            this.a(var4, 109);
            stackIn_4_0 = (vl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("nm.F(").append(param0).append(',').append(param1).append(',');

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
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0) {
            nm.a(80);
        }
    }

    final vl a(byte param0, int param1, uh param2) {
        vl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        vl var6 = null;
        int var7 = 0;
        int var9 = 0;
        vl stackIn_9_0 = null;
        vl stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = new vl();
            var4.field_H = 1;
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                var7 = 31 / ((-10 - param0) / 39);
                var6 = (vl) ((Object) this.field_d.a(-98));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((var6.field_p ^ -1L) != ((long)param1 ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_D != param2) {
                          break L3;
                        } else {
                          if (var6.field_H == 2) {
                            var4.field_C = false;
                            var4.field_F = var6.field_F;
                            stackIn_9_0 = (vl) (var4);
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (vl) ((Object) this.field_d.d(-77));
                    continue L2;
                  }
                }
              }
            }
            var4.field_F = param2.a(255, param1);
            var4.field_C = false;
            var4.field_v = true;
            stackIn_16_0 = (vl) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("nm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final vl a(uh param0, boolean param1, byte[] param2, int param3) {
        vl var5 = null;
        RuntimeException var5_ref = null;
        vl stackIn_2_0 = null;
        vl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        vl stackIn_4_0 = null;
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
              var5 = new vl();
              var5.field_p = (long)param3;
              var5.field_D = param0;
              var5.field_F = param2;
              stackIn_2_0 = (vl) (var5);

              if (!param1) {
                stackIn_3_0 = (vl) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (vl) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_v = stackIn_3_1 != 0;
            var5.field_H = 2;
            this.a(var5, 114);
            stackIn_4_0 = (vl) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("nm.H(");

            if (param0 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(vl param0, int param1) {
        synchronized (this.field_d) {
            this.field_d.a(param0, false);
            this.field_b = this.field_b + 1;
            int var4 = 119 % ((param1 - 46) / 62);
            this.field_d.notifyAll();
        }
    }

    nm(vf param0) {
        ia var2 = null;
        this.field_d = new wa();
        this.field_b = 0;
        this.field_i = false;
        try {
            var2 = param0.a((Runnable) (this), (byte) 58, 5);
            while (0 == var2.field_c) {
                gf.a(10L, -10309);
            }
            if ((var2.field_c ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_a);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new int[6];
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = -1;
        field_c = "Get Rich or Die Tryin'";
    }
}
