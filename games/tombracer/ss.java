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
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            sga var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = TombRacer.field_G ? 1 : 0;
            L0: while (true) {
              if (this.field_e) {
                return;
              } else {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (sga) ((Object) this.field_d.c((byte) 116));
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
                        if (-3 != (var7.field_q ^ -1)) {
                          if (var7.field_q != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_p = var7.field_o.a((int)var7.field_j, -114);
                            var7.field_m = false;
                            break L5;
                          }
                        } else {
                          var7.field_o.a((int)var7.field_j, var7.field_p, var7.field_p.length, (byte) 124);
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
                      var6 = (String) null;
                      ssa.a((String) null, (byte) 125, (Throwable) ((Object) var2_ref));
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
        try {
            InterruptedException interruptedException = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 <= 4) {
          L0: {
            ss.a((byte) -46, 11, 42);
            if ((param2 & 2048) == 0) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((param2 & 2048) == 0) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        int var8 = 0;
        sga stackIn_9_0 = null;
        sga stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
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
                          if (-3 == (var6.field_q ^ -1)) {
                            var4.field_m = false;
                            var4.field_p = var6.field_p;
                            stackIn_9_0 = (sga) (var4);
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (sga) ((Object) this.field_d.c(28));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param0 == 15871) {
                break L4;
              } else {
                this.field_e = false;
                break L4;
              }
            }
            var4.field_p = param1.a(param2, -124);
            var4.field_m = false;
            var4.field_l = true;
            stackIn_18_0 = (sga) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("ss.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final sga a(byte param0, int param1, ppa param2) {
        sga var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        sga stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                this.a(true, 61, (ppa) null, (byte[]) null);
                break L1;
              }
            }
            stackIn_3_0 = (sga) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ss.B(").append(param0).append(',').append(param1).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0) {
        lqa var1 = uv.b(false);
        if (param0 < 122) {
            ss.a((byte) -30, -8, 82);
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
        synchronized (this.field_d) {
            this.field_d.a(param1, (byte) -105);
            if (param0 >= -27) {
                ppa var5 = (ppa) null;
                this.a((byte) -87, 82, (ppa) null);
            }
            this.field_b = this.field_b + 1;
            this.field_d.notifyAll();
        }
    }

    final sga a(boolean param0, int param1, ppa param2, byte[] param3) {
        sga var5 = null;
        RuntimeException var5_ref = null;
        sga stackIn_2_0 = null;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        sga stackIn_4_0 = null;
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
              var5 = new sga();
              var5.field_p = param3;
              var5.field_q = 2;
              var5.field_j = (long)param1;
              var5.field_o = param2;
              stackIn_2_0 = (sga) (var5);

              if (!param0) {
                stackIn_3_0 = (sga) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (sga) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_l = stackIn_3_1 != 0;
            this.a(-98, var5);
            stackIn_4_0 = (sga) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ss.A(").append(param0).append(',').append(param1).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    ss(fia param0) {
        naa var2 = null;
        this.field_d = new vj();
        this.field_b = 0;
        this.field_e = false;
        try {
            var2 = param0.a((Runnable) (this), 425, 5);
            while (-1 == (var2.field_b ^ -1)) {
                vja.a(0, 10L);
            }
            if ((var2.field_b ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_a = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ss.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = 100;
    }
}
