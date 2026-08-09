/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb implements Runnable {
    static int field_b;
    private ii field_a;
    static int[] field_c;
    int field_e;
    private boolean field_f;
    private Thread field_d;

    final void a(int param0) {
        try {
            this.field_f = true;
            synchronized (this.field_a) {
                if (param0 != 4) {
                    this.field_d = (Thread) null;
                }
                this.field_a.notifyAll();
            }
            try {
                this.field_d.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (oe.field_f > param1) {
            oe.field_f = param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -49) {
          return;
        } else {
          L1: {
            oe.field_f = oe.field_f - 1;
            if (0 <= oe.field_f) {
              break L1;
            } else {
              h.a(param2, 4);
              oe.field_f = param1;
              break L1;
            }
          }
          return;
        }
    }

    final al a(la param0, boolean param1, int param2) {
        al var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        al var6 = null;
        int var8 = 0;
        al stackIn_8_0 = null;
        al stackIn_16_0 = null;
        al stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        al stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = new al();
            var4.field_C = 1;
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                var6 = (al) ((Object) this.field_a.a(25777));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (((long)param2 ^ -1L) != (var6.field_l ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_D != param0) {
                          break L3;
                        } else {
                          if (var6.field_C != 2) {
                            break L3;
                          } else {
                            var4.field_v = false;
                            var4.field_y = var6.field_y;
                            stackIn_8_0 = (al) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (al) ((Object) this.field_a.d(84));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              var4.field_y = param0.a(param2, -110);
              var4.field_v = false;
              stackIn_16_0 = (al) (var4);

              if (!param1) {
                stackIn_17_0 = (al) ((Object) stackIn_16_0);
                stackIn_17_1 = 0;
                break L4;
              } else {
                stackIn_17_0 = (al) ((Object) stackIn_16_0);
                stackIn_17_1 = 1;
                break L4;
              }
            }
            stackIn_17_0.field_s = stackIn_17_1 != 0;
            stackIn_18_0 = (al) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("rb.H(");

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
          throw oj.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(int param0, al param1) {
        Object var3 = null;
        Throwable var4 = null;
        la var5 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 1) {
              break L0;
            } else {
              var5 = (la) null;
              this.a((la) null, true, 40);
              break L0;
            }
          }
          var3 = this.field_a;
          synchronized (var3) {
            L1: {
              this.field_a.a(param1, 3329);
              this.field_e = this.field_e + 1;
              this.field_a.notifyAll();
              break L1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var3;

            stackIn_10_1 = new StringBuilder().append("rb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void b(int param0) {
        int var1 = -33 / ((param0 - 64) / 41);
        field_c = null;
    }

    final al a(int param0, int param1, la param2) {
        al var4 = null;
        RuntimeException var4_ref = null;
        al stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new al();
            var4.field_l = (long)param0;
            var4.field_D = param2;
            var4.field_C = param1;
            var4.field_s = false;
            this.a(1, var4);
            stackIn_1_0 = (al) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("rb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            al var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = TorChallenge.field_F ? 1 : 0;
            L0: while (true) {
              if (this.field_f) {
                return;
              } else {
                var2 = this.field_a;
                synchronized (var2) {
                  L1: {
                    var7 = (al) ((Object) this.field_a.c(-1));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_a.wait();
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
                        if (var7.field_C == 2) {
                          var7.field_D.a((int)var7.field_l, var7.field_y, var7.field_y.length, (byte) 121);
                          var7.field_v = false;
                          break L5;
                        } else {
                          if ((var7.field_C ^ -1) == -4) {
                            var7.field_y = var7.field_D.a((int)var7.field_l, -2);
                            var7.field_v = false;
                            break L5;
                          } else {
                            var7.field_v = false;
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
                      td.a((String) null, (Throwable) ((Object) var2_ref), (byte) -87);
                      var7.field_v = false;
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

    final static ge a(lj param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ge stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 < -110) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            var4_int = param0.a(param1, 50);
            var5 = param0.a(var4_int, param3, (byte) 86);
            stackIn_3_0 = w.a((byte) 61, var4_int, var5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rb.D(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final al a(int param0, la param1, byte param2, byte[] param3) {
        al var5 = null;
        RuntimeException var5_ref = null;
        al stackIn_3_0 = null;
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
              var5 = new al();
              var5.field_s = false;
              var5.field_D = param1;
              var5.field_l = (long)param0;
              var5.field_y = param3;
              var5.field_C = 2;
              this.a(param2 ^ 110, var5);
              if (param2 == 111) {
                break L1;
              } else {
                this.field_e = -105;
                break L1;
              }
            }
            stackIn_3_0 = (al) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("rb.E(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

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
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    rb(uj param0) {
        mi var2 = null;
        this.field_a = new ii();
        this.field_e = 0;
        this.field_f = false;
        try {
            var2 = param0.a((Runnable) (this), true, 5);
            while (-1 == (var2.field_d ^ -1)) {
                c.a(-105, 10L);
            }
            if (var2.field_d == 2) {
                throw new RuntimeException();
            }
            this.field_d = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
        field_c = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 3, 3, 4, 5, 5, 5};
    }
}
