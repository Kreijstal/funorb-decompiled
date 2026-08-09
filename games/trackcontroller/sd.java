/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd implements Runnable {
    static int field_b;
    private mb field_f;
    static il field_c;
    private boolean field_g;
    static int[] field_d;
    int field_a;
    private Thread field_e;

    final lh a(boolean param0, int param1, hf param2) {
        lh var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        lh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new lh();
              var4.field_A = param2;
              var4.field_m = (long)param1;
              var4.field_y = 3;
              if (param0) {
                break L1;
              } else {
                var5 = (String) null;
                sd.a((String) null, (byte) -25);
                break L1;
              }
            }
            var4.field_q = false;
            this.a(false, var4);
            stackIn_3_0 = (lh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("sd.C(").append(param0).append(',').append(param1).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static aj a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int[] param7, int param8) {
        aj var9 = null;
        RuntimeException var9_ref = null;
        aj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4) {
                break L1;
              } else {
                sd.a((byte) 126);
                break L1;
              }
            }
            var9 = new aj(param3, param2, param5, param6, param0, param8, param7);
            ub.field_e.a((byte) -114, var9);
            we.a(param1, var9, (byte) 125);
            stackIn_3_0 = (aj) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var9_ref);

            stackIn_6_1 = new StringBuilder().append("sd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param8 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            lh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = TrackController.field_F ? 1 : 0;
            L0: while (true) {
              if (this.field_g) {
                return;
              } else {
                var2 = this.field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (lh) ((Object) this.field_f.a(-58));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_f.wait();
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
                      this.field_a = this.field_a - 1;
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
                        if (var7.field_y == 2) {
                          var7.field_A.a(-1023648016, (int)var7.field_m, var7.field_z, var7.field_z.length);
                          var7.field_w = false;
                          break L5;
                        } else {
                          if (var7.field_y == 3) {
                            var7.field_z = var7.field_A.a((byte) -95, (int)var7.field_m);
                            var7.field_w = false;
                            break L5;
                          } else {
                            var7.field_w = false;
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
                      hb.a((Throwable) ((Object) var2_ref), 0, (String) null);
                      var7.field_w = false;
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

    final lh a(int param0, byte[] param1, hf param2, byte param3) {
        lh var5 = null;
        RuntimeException var5_ref = null;
        lh stackIn_2_0 = null;
        lh stackIn_4_0 = null;
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
            var5 = new lh();
            var5.field_A = param2;
            var5.field_z = param1;
            if (param3 >= 75) {
              var5.field_q = false;
              var5.field_m = (long)param0;
              var5.field_y = 2;
              this.a(false, var5);
              stackIn_4_0 = (lh) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (lh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("sd.A(").append(param0).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0) {
        try {
            this.field_g = true;
            synchronized (this.field_f) {
                this.field_f.notifyAll();
            }
            try {
                this.field_e.join();
                int var2_int = -87 / ((-47 - param0) / 50);
            } catch (InterruptedException interruptedException) {
            }
            this.field_e = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, lh param1) {
        hf var5 = null;
        mb stackIn_3_0 = null;
        lh stackIn_3_1 = null;
        mb stackIn_4_0 = null;
        lh stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_f;
            synchronized (var3) {
              L1: {
                L2: {
                  stackIn_3_0 = this.field_f;

                  stackIn_3_1 = (lh) (param1);

                  if (param0) {
                    stackIn_4_0 = (mb) ((Object) stackIn_3_0);
                    stackIn_4_1 = (lh) ((Object) stackIn_3_1);
                    stackIn_4_2 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = (mb) ((Object) stackIn_3_0);
                    stackIn_4_1 = (lh) ((Object) stackIn_3_1);
                    stackIn_4_2 = 1;
                    break L2;
                  }
                }
                L3: {
                  ((mb) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0);
                  this.field_a = this.field_a + 1;
                  this.field_f.notifyAll();
                  if (!param0) {
                    break L3;
                  } else {
                    var5 = (hf) null;
                    this.a(true, -108, (hf) null);
                    break L3;
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("sd.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final lh a(byte param0, int param1, hf param2) {
        lh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        int var6 = 0;
        lh var7 = null;
        int var9 = 0;
        lh stackIn_9_0 = null;
        lh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4 = new lh();
            var4.field_y = 1;
            var5 = this.field_f;
            synchronized (var5) {
              L1: {
                var6 = -96 / ((-57 - param0) / 47);
                var7 = (lh) ((Object) this.field_f.b(48));
                L2: while (true) {
                  if (var7 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var7.field_m != (long)param1) {
                        break L3;
                      } else {
                        if (var7.field_A != param2) {
                          break L3;
                        } else {
                          if (-3 == (var7.field_y ^ -1)) {
                            var4.field_z = var7.field_z;
                            var4.field_w = false;
                            stackIn_9_0 = (lh) (var4);
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7 = (lh) ((Object) this.field_f.a((byte) 77));
                    continue L2;
                  }
                }
              }
            }
            var4.field_z = param2.a((byte) -123, param1);
            var4.field_w = false;
            var4.field_q = true;
            stackIn_16_0 = (lh) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4_ref);

            stackIn_19_1 = new StringBuilder().append("sd.E(").append(param0).append(',').append(param1).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 60) {
                break L1;
              } else {
                field_c = (il) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= param0.length()) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (rj.a((char) var3, 122)) {
                    break L3;
                  } else {
                    if (!hd.a(-124, (char) var3)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("sd.H(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -76) {
            field_b = -14;
        }
        field_d = null;
        field_c = null;
    }

    sd(uf param0) {
        ce var2 = null;
        this.field_f = new mb();
        this.field_a = 0;
        this.field_g = false;
        try {
            var2 = param0.a(5, (Runnable) (this), 94);
            while (-1 == (var2.field_f ^ -1)) {
                wl.a(10L, false);
            }
            if ((var2.field_f ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_e = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[8192];
    }
}
