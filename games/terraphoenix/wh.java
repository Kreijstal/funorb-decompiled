/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh implements Runnable {
    static String field_a;
    static String field_g;
    private hl field_c;
    static ci field_e;
    private boolean field_f;
    int field_b;
    private Thread field_d;

    private final void a(int param0, ma param1) {
        synchronized (this.field_c) {
            this.field_c.a(11152, param1);
            this.field_b = this.field_b + 1;
            this.field_c.notifyAll();
            if (param0 != 28366) {
                field_g = (String) null;
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 != 110) {
            wh.b(-27);
        }
    }

    final ma a(ua param0, int param1, int param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ma var6 = null;
        int var8 = 0;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = new ma();
            var4.field_H = 1;
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                var6 = (ma) ((Object) this.field_c.c(param2 ^ 8194));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_m != (long)param1) {
                        break L3;
                      } else {
                        if (param0 != var6.field_F) {
                          break L3;
                        } else {
                          if (2 == var6.field_H) {
                            var4.field_G = var6.field_G;
                            var4.field_A = false;
                            stackIn_9_0 = (ma) (var4);
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (ma) ((Object) this.field_c.a(6273));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param2 == 2) {
                break L4;
              } else {
                field_e = (ci) null;
                break L4;
              }
            }
            var4.field_G = param0.a(-18342, param1);
            var4.field_A = false;
            var4.field_x = true;
            stackIn_18_0 = (ma) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("wh.D(");

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
          throw qk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final ma a(int param0, int param1, ua param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ma stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new ma();
            var4.field_x = false;
            var4.field_F = param2;
            var4.field_m = (long)param1;
            var4.field_H = 3;
            var5 = 97 / ((param0 - -11) / 47);
            this.a(28366, var4);
            stackIn_1_0 = (ma) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("wh.B(").append(param0).append(',').append(param1).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            ma var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Terraphoenix.field_V;
            L0: while (true) {
              if (this.field_f) {
                return;
              } else {
                var2 = this.field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (ma) ((Object) this.field_c.a((byte) -115));
                    if (var7 != null) {
                      this.field_b = this.field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
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
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (2 == var7.field_H) {
                          var7.field_F.a((int)var7.field_m, var7.field_G, 0, var7.field_G.length);
                          var7.field_A = false;
                          break L5;
                        } else {
                          if ((var7.field_H ^ -1) != -4) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_G = var7.field_F.a(-18342, (int)var7.field_m);
                            var7.field_A = false;
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
                      bd.a((Throwable) ((Object) var2_ref), (String) null, 96);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_A = false;
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

    final void a(int param0) {
        try {
            this.field_f = true;
            synchronized (this.field_c) {
                if (param0 > -39) {
                    this.field_c = (hl) null;
                }
                this.field_c.notifyAll();
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

    final static void b(int param0) {
        try {
            int var1 = 0;
            Exception var1_ref_Exception = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (mh.field_b == null) {
                break L0;
              } else {
                try {
                  L1: {
                    mh.field_b.a(false, 0L);
                    mh.field_b.a(-1, 24, mk.field_j.field_i, mk.field_j.field_k);
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  var1 = -15 % ((param0 - 58) / 35);
                  mk.field_j.field_k = mk.field_j.field_k + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            var1 = -15 % ((param0 - 58) / 35);
            mk.field_j.field_k = mk.field_j.field_k + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ma a(byte[] param0, int param1, int param2, ua param3) {
        ma var5 = null;
        RuntimeException var5_ref = null;
        ma stackIn_3_0 = null;
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
              var5 = new ma();
              var5.field_m = (long)param1;
              var5.field_H = 2;
              var5.field_x = false;
              var5.field_G = param0;
              if (param2 == 4626) {
                break L1;
              } else {
                this.field_d = (Thread) null;
                break L1;
              }
            }
            var5.field_F = param3;
            this.a(28366, var5);
            stackIn_3_0 = (ma) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("wh.A(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

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
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    wh(he param0) {
        mf var2 = null;
        this.field_c = new hl();
        this.field_f = false;
        this.field_b = 0;
        try {
            var2 = param0.a((Runnable) (this), (byte) -21, 5);
            while (0 == var2.field_d) {
                gi.a((byte) -37, 10L);
            }
            if (-3 == (var2.field_d ^ -1)) {
                throw new RuntimeException();
            }
            this.field_d = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Accuracy: ";
    }
}
