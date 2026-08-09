/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk implements Runnable {
    static String[] field_d;
    private va field_c;
    static String field_a;
    private Thread field_b;
    private boolean field_e;
    int field_f;

    public static void b(int param0) {
        if (param0 != -4) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final void a(int param0) {
        try {
            this.field_e = true;
            synchronized (this.field_c) {
                this.field_c.notifyAll();
                if (param0 != -24580) {
                    field_a = (String) null;
                }
            }
            try {
                this.field_b.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final cm a(jg param0, int param1, int param2) {
        cm var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cm var6 = null;
        int var8 = 0;
        cm stackIn_11_0 = null;
        cm stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 > 33) {
                break L1;
              } else {
                this.field_f = 88;
                break L1;
              }
            }
            var4 = new cm();
            var4.field_z = 1;
            var5 = this.field_c;
            synchronized (var5) {
              L2: {
                var6 = (cm) ((Object) this.field_c.a(0));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((long)param2 != var6.field_p) {
                        break L4;
                      } else {
                        if (param0 != var6.field_x) {
                          break L4;
                        } else {
                          if ((var6.field_z ^ -1) == -3) {
                            var4.field_u = false;
                            var4.field_y = var6.field_y;
                            stackIn_11_0 = (cm) (var4);
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (cm) ((Object) this.field_c.a((byte) 116));
                    continue L3;
                  }
                }
              }
            }
            var4.field_y = param0.a(param2, 26296);
            var4.field_r = true;
            var4.field_u = false;
            stackIn_18_0 = (cm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("kk.B(");

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
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            cm var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = EscapeVector.field_A;
            L0: while (true) {
              if (this.field_e) {
                return;
              } else {
                var2 = this.field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (cm) ((Object) this.field_c.b((byte) -75));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_c.wait();
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
                      this.field_f = this.field_f - 1;
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
                        if (var7.field_z == 2) {
                          var7.field_x.a((byte) 18, (int)var7.field_p, var7.field_y.length, var7.field_y);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if ((var7.field_z ^ -1) != -4) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_y = var7.field_x.a((int)var7.field_p, 26296);
                            var7.field_u = false;
                            break L5;
                          }
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      pf.a(false, (String) null, (Throwable) ((Object) var2_ref));
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_u = false;
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

    final cm a(byte[] param0, int param1, int param2, jg param3) {
        cm var5 = null;
        RuntimeException var5_ref = null;
        cm stackIn_1_0 = null;
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
            var5 = new cm();
            var5.field_y = param0;
            var5.field_x = param3;
            var5.field_p = (long)param1;
            var5.field_r = false;
            var5.field_z = param2;
            this.a(-3, var5);
            stackIn_1_0 = (cm) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5_ref);

            stackIn_4_1 = new StringBuilder().append("kk.A(");

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
          throw t.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(int param0, cm param1) {
        synchronized (this.field_c) {
            this.field_c.a(-1, param1);
            this.field_f = this.field_f + 1;
            if (param0 != -3) {
                field_a = (String) null;
            }
            this.field_c.notifyAll();
        }
    }

    final cm a(byte param0, jg param1, int param2) {
        cm var4 = null;
        RuntimeException var4_ref = null;
        cm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new cm();
              var4.field_r = false;
              var4.field_z = 3;
              var4.field_p = (long)param2;
              var4.field_x = param1;
              this.a(-3, var4);
              if (param0 <= -42) {
                break L1;
              } else {
                this.field_e = true;
                break L1;
              }
            }
            stackIn_3_0 = (cm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("kk.C(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    kk(lk param0) {
        la var2 = null;
        this.field_c = new va();
        this.field_e = false;
        this.field_f = 0;
        try {
            var2 = param0.a(true, 5, (Runnable) (this));
            while (var2.field_f == 0) {
                en.a((byte) 121, 10L);
            }
            if (-3 == (var2.field_f ^ -1)) {
                throw new RuntimeException();
            }
            this.field_b = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
