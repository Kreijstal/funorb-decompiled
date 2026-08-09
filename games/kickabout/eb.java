/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements Runnable {
    static ff field_c;
    private o field_h;
    static ot[] field_i;
    int field_e;
    private Thread field_a;
    private boolean field_f;
    static int field_b;
    static int field_d;
    static String[] field_g;

    private final void a(hi param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this.field_h;
            synchronized (var3_ref) {
              L1: {
                this.field_h.a(127, param0);
                this.field_e = this.field_e + 1;
                this.field_h.notifyAll();
                break L1;
              }
            }
            if (!param1) {
              break L0;
            } else {
              field_b = -100;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("eb.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            hi var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Kickabout.field_G;
            L0: while (true) {
              if (this.field_f) {
                return;
              } else {
                var2 = this.field_h;
                synchronized (var2) {
                  L1: {
                    var7 = (hi) ((Object) this.field_h.b((byte) 3));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_h.wait();
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
                        if (2 == var7.field_t) {
                          var7.field_v.a((byte) 66, (int)var7.field_l, var7.field_u.length, var7.field_u);
                          var7.field_p = false;
                          break L5;
                        } else {
                          if (3 == var7.field_t) {
                            var7.field_u = var7.field_v.a((int)var7.field_l, 65280);
                            var7.field_p = false;
                            break L5;
                          } else {
                            var7.field_p = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      bd.a((String) null, (Throwable) ((Object) var2_ref), 1);
                      var7.field_p = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final hi a(int param0, int param1, qh param2) {
        hi var4 = null;
        RuntimeException var4_ref = null;
        hi stackIn_2_0 = null;
        hi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new hi();
            if (param0 == 8947) {
              var4.field_q = false;
              var4.field_v = param2;
              var4.field_t = 3;
              var4.field_l = (long)param1;
              this.a(var4, false);
              stackIn_4_0 = (hi) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("eb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final hi a(int param0, qh param1, int param2) {
        hi var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        hi var6 = null;
        int var8 = 0;
        hi stackIn_10_0 = null;
        hi stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            var4 = new hi();
            var4.field_t = 1;
            var5 = this.field_h;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param0 == -913) {
                    break L2;
                  } else {
                    this.b(-77);
                    break L2;
                  }
                }
                var6 = (hi) ((Object) this.field_h.a(-125));
                L3: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L4: {
                      if (var6.field_l != (long)param2) {
                        break L4;
                      } else {
                        if (var6.field_v != param1) {
                          break L4;
                        } else {
                          if ((var6.field_t ^ -1) != -3) {
                            break L4;
                          } else {
                            var4.field_p = false;
                            var4.field_u = var6.field_u;
                            stackIn_10_0 = (hi) (var4);
                            return stackIn_10_0;
                          }
                        }
                      }
                    }
                    var6 = (hi) ((Object) this.field_h.b(0));
                    continue L3;
                  }
                }
              }
            }
            var4.field_u = param1.a(param2, param0 + 66193);
            var4.field_q = true;
            var4.field_p = false;
            stackIn_17_0 = (hi) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("eb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final void b(int param0) {
        try {
            this.field_f = true;
            synchronized (this.field_h) {
                if (param0 <= 107) {
                    this.field_f = false;
                }
                this.field_h.notifyAll();
            }
            try {
                this.field_a.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 != 2) {
            field_b = 17;
        }
    }

    final hi a(int param0, qh param1, byte[] param2, byte param3) {
        hi var5 = null;
        RuntimeException var5_ref = null;
        hi stackIn_2_0 = null;
        hi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 1) {
              var5 = new hi();
              var5.field_l = (long)param0;
              var5.field_q = false;
              var5.field_u = param2;
              var5.field_v = param1;
              var5.field_t = 2;
              this.a(var5, false);
              stackIn_4_0 = (hi) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (hi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("eb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    eb(bu param0) {
        wu var2 = null;
        this.field_h = new o();
        this.field_e = 0;
        this.field_f = false;
        try {
            var2 = param0.a(5, (byte) 121, (Runnable) (this));
            while (-1 == (var2.field_a ^ -1)) {
                aj.a(10L, 1);
            }
            if (2 == var2.field_a) {
                throw new RuntimeException();
            }
            this.field_a = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new ff(0, 2, 2, 1);
    }
}
