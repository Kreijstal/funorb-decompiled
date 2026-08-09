/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk implements Runnable {
    static String field_b;
    private al field_d;
    static int field_f;
    private Thread field_g;
    int field_e;
    static wb field_c;
    private boolean field_a;

    final el a(gi param0, int param1, int param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        el stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new el();
            var4.field_o = (long)param2;
            var4.field_u = false;
            var4.field_C = param1;
            var4.field_B = param0;
            this.a(-52, var4);
            stackIn_1_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("rk.A(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0) {
        if (param0 != 3) {
            field_f = 37;
            rh.a(4, (byte) -72);
            return;
        }
        rh.a(4, (byte) -72);
    }

    final el a(gi param0, int param1, int param2, byte[] param3) {
        el var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
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
            var5 = new el();
            var5.field_C = 2;
            var5.field_u = false;
            var5.field_B = param0;
            var5.field_D = param3;
            var5.field_o = (long)param2;
            this.a(-113, var5);
            var6 = -24 / ((param1 - -50) / 51);
            stackIn_1_0 = (el) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("rk.F(");

            if (param0 == null) {
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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final void a(byte param0) {
        try {
            this.field_a = true;
            synchronized (this.field_d) {
                this.field_d.notifyAll();
            }
            try {
                this.field_g.join();
                int var2_int = -7 % ((param0 - -18) / 47);
            } catch (InterruptedException interruptedException) {
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, el param1) {
        synchronized (this.field_d) {
            if (param0 > -10) {
                gi var5 = (gi) null;
                this.a((gi) null, 8, 126);
            }
            this.field_d.a((byte) 127, param1);
            this.field_e = this.field_e + 1;
            this.field_d.notifyAll();
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final el a(gi param0, byte param1, int param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        el var6 = null;
        int var8 = 0;
        el stackIn_11_0 = null;
        el stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          L0: {
            var4 = new el();
            var4.field_C = 1;
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param1 >= 30) {
                    break L2;
                  } else {
                    this.field_a = true;
                    break L2;
                  }
                }
                var6 = (el) ((Object) this.field_d.a(false));
                L3: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L4: {
                      if ((var6.field_o ^ -1L) != ((long)param2 ^ -1L)) {
                        break L4;
                      } else {
                        if (var6.field_B != param0) {
                          break L4;
                        } else {
                          if ((var6.field_C ^ -1) == -3) {
                            var4.field_D = var6.field_D;
                            var4.field_w = false;
                            stackIn_11_0 = (el) (var4);
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (el) ((Object) this.field_d.a(-97));
                    continue L3;
                  }
                }
              }
            }
            var4.field_D = param0.a(true, param2);
            var4.field_u = true;
            var4.field_w = false;
            stackIn_18_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("rk.C(");

            if (param0 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = stellarshard.field_B;
            L0: while (true) {
              if (this.field_a) {
                return;
              } else {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (el) ((Object) this.field_d.a((byte) 92));
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
                      this.field_e = this.field_e - 1;
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
                        if (-3 != (var7.field_C ^ -1)) {
                          if (3 != var7.field_C) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_D = var7.field_B.a(true, (int)var7.field_o);
                            var7.field_w = false;
                            break L5;
                          }
                        } else {
                          var7.field_B.a(var7.field_D, var7.field_D.length, 5, (int)var7.field_o);
                          var7.field_w = false;
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
                      qe.a(60, (String) null, (Throwable) ((Object) var2_ref));
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_w = false;
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

    rk(ej param0) {
        re var2 = null;
        this.field_d = new al();
        this.field_e = 0;
        this.field_a = false;
        try {
            var2 = param0.a((Runnable) (this), 5, 0);
            while (0 == var2.field_f) {
                jj.a((byte) -124, 10L);
            }
            if (-3 == (var2.field_f ^ -1)) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Start Game";
        field_c = new wb();
    }
}
