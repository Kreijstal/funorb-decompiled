/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea implements Runnable {
    static int field_d;
    private in field_e;
    static int field_f;
    private Thread field_a;
    private boolean field_c;
    int field_b;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            se var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = BachelorFridge.field_y;
            L0: while (true) {
              if (this.field_c) {
                return;
              } else {
                var2 = this.field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (se) ((Object) this.field_e.a(true));
                    if (var7 != null) {
                      this.field_b = this.field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_e.wait();
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
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (-3 == (var7.field_v ^ -1)) {
                          var7.field_w.a(var7.field_t.length, var7.field_t, (int)var7.field_h, 0);
                          var7.field_n = false;
                          break L5;
                        } else {
                          if (var7.field_v == 3) {
                            var7.field_t = var7.field_w.a((int)var7.field_h, (byte) -5);
                            var7.field_n = false;
                            break L5;
                          } else {
                            var7.field_n = false;
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
                      cv.a(1, (String) null, (Throwable) ((Object) var2_ref));
                      var7.field_n = false;
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

    final void a(byte param0) {
        try {
            this.field_c = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
                if (param0 > -3) {
                    this.field_a = (Thread) null;
                }
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

    final se a(ta param0, byte param1, int param2) {
        se var4 = null;
        RuntimeException var4_ref = null;
        se stackIn_2_0 = null;
        se stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new se();
            var4.field_v = 3;
            var4.field_w = param0;
            var4.field_h = (long)param2;
            var4.field_q = false;
            this.a(var4, -6778);
            if (param1 <= -108) {
              stackIn_4_0 = (se) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (se) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("ea.C(");

            if (param0 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, Object[] param4) {
        int incrementValue$0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        var13 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 >= 9) {
                break L1;
              } else {
                ((boolean[]) (param4[0]))[16] = ((boolean[]) (((Object[]) (param4[11]))[4]))[0];
                break L1;
              }
            }
            if (param0 > param1) {
              L2: {
                var5_int = (param1 - -param0) / 2;
                var6 = param1;
                var7 = param3[var5_int];
                param3[var5_int] = param3[param0];
                param3[param0] = var7;
                var8 = param4[var5_int];
                param4[var5_int] = param4[param0];
                param4[param0] = var8;
                if (var7 != 2147483647) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              }
              var9 = stackIn_8_0;
              var10 = param1;
              L3: while (true) {
                if (param0 <= var10) {
                  param3[param0] = param3[var6];
                  param3[var6] = var7;
                  param4[param0] = param4[var6];
                  param4[var6] = var8;
                  ea.a(var6 - 1, param1, (byte) 112, param3, param4);
                  ea.a(param0, var6 + 1, (byte) 74, param3, param4);
                  break L0;
                } else {
                  L4: {
                    if ((param3[var10] ^ -1) > (var7 - -(var9 & var10) ^ -1)) {
                      var11 = param3[var10];
                      param3[var10] = param3[var6];
                      param3[var6] = var11;
                      var12 = param4[var10];
                      param4[var10] = param4[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param4[incrementValue$0] = var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var10++;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ea.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
    }

    private final void a(se param0, int param1) {
        synchronized (this.field_e) {
            if (param1 != -6778) {
                this.field_a = (Thread) null;
            }
            this.field_e.a(param0, (byte) 106);
            this.field_b = this.field_b + 1;
            this.field_e.notifyAll();
        }
    }

    final se a(int param0, byte param1, ta param2) {
        se var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        se var7 = null;
        int var9 = 0;
        se stackIn_9_0 = null;
        se stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = new se();
            var4.field_v = 1;
            var5 = -20 / ((param1 - 63) / 40);
            var6 = this.field_e;
            synchronized (var6) {
              L1: {
                var7 = (se) ((Object) this.field_e.a(-122));
                L2: while (true) {
                  if (var7 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((long)param0 != var7.field_h) {
                        break L3;
                      } else {
                        if (param2 != var7.field_w) {
                          break L3;
                        } else {
                          if (-3 == (var7.field_v ^ -1)) {
                            var4.field_t = var7.field_t;
                            var4.field_n = false;
                            stackIn_9_0 = (se) (var4);
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7 = (se) ((Object) this.field_e.a((byte) 122));
                    continue L2;
                  }
                }
              }
            }
            var4.field_t = param2.a(param0, (byte) -5);
            var4.field_q = true;
            var4.field_n = false;
            stackIn_16_0 = (se) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("ea.F(").append(param0).append(',').append(param1).append(',');

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
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final se a(ta param0, byte[] param1, int param2, int param3) {
        se var5 = null;
        RuntimeException var5_ref = null;
        se stackIn_3_0 = null;
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
              var5 = new se();
              var5.field_v = 2;
              var5.field_q = false;
              var5.field_h = (long)param2;
              var5.field_w = param0;
              var5.field_t = param1;
              this.a(var5, -6778);
              if (param3 == 5) {
                break L1;
              } else {
                field_d = -92;
                break L1;
              }
            }
            stackIn_3_0 = (se) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ea.D(");

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
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    ea(ht param0) {
        eh var2 = null;
        this.field_e = new in();
        this.field_c = false;
        this.field_b = 0;
        try {
            var2 = param0.a((Runnable) (this), 2, 5);
            while (var2.field_f == 0) {
                gda.a(false, 10L);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            this.field_a = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 200;
    }
}
