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
        synchronized (((wh) this).field_c) {
            ((wh) this).field_c.a(11152, (vh) (Object) param1);
            ((wh) this).field_b = ((wh) this).field_b + 1;
            ((Object) (Object) ((wh) this).field_c).notifyAll();
        }
    }

    public static void a() {
        field_e = null;
        field_g = null;
        field_a = null;
    }

    final ma a(ua param0, int param1, int param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ma var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ma stackIn_9_0 = null;
        ma stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        ma stackOut_8_0 = null;
        ma stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = new ma();
            var4.field_H = 1;
            var5 = (Object) (Object) ((wh) this).field_c;
            synchronized (var5) {
              L1: {
                var6 = (ma) (Object) ((wh) this).field_c.c(param2 ^ 8194);
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
                            stackOut_8_0 = (ma) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (ma) (Object) ((wh) this).field_c.a(6273);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param2 == 2) {
                break L4;
              } else {
                field_e = null;
                break L4;
              }
            }
            var4.field_G = param0.a(-18342, param1);
            var4.field_A = false;
            var4.field_x = true;
            stackOut_17_0 = (ma) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("wh.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final ma a(int param0, int param1, ua param2) {
        ma var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ma stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new ma();
            var4.field_x = false;
            var4.field_F = param2;
            var4.field_m = (long)param1;
            var4.field_H = 3;
            var5 = 97 / ((param0 - -11) / 47);
            this.a(28366, var4);
            stackOut_0_0 = (ma) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("wh.B(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ma var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Terraphoenix.field_V;
            L0: while (true) {
              if (((wh) this).field_f) {
                return;
              } else {
                var2 = (Object) (Object) ((wh) this).field_c;
                synchronized (var2) {
                  L1: {
                    var7 = (ma) (Object) ((wh) this).field_c.a((byte) -115);
                    if (var7 != null) {
                      ((wh) this).field_b = ((wh) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((wh) this).field_c).wait();
                          break L2;
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
                          boolean discarded$1 = var7.field_F.a((int)var7.field_m, var7.field_G, 0, var7.field_G.length);
                          var7.field_A = false;
                          break L5;
                        } else {
                          if (var7.field_H != 3) {
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
                      var6 = null;
                      bd.a((Throwable) (Object) var2_ref, (String) null, 96);
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
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((wh) this).field_f = true;
        var2 = (Object) (Object) ((wh) this).field_c;
        synchronized (var2) {
          L0: {
            L1: {
              if (param0 <= -39) {
                break L1;
              } else {
                ((wh) this).field_c = null;
                break L1;
              }
            }
            ((Object) (Object) ((wh) this).field_c).notifyAll();
            break L0;
          }
        }
        try {
          L2: {
            ((wh) this).field_d.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((wh) this).field_d = null;
    }

    final static void b() {
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
                  var1 = 0;
                  mk.field_j.field_k = mk.field_j.field_k + 24;
                  return;
                } else {
                  break L0;
                }
              }
            }
            var1 = 0;
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
                ((wh) this).field_d = null;
                break L1;
              }
            }
            var5.field_F = param3;
            this.a(28366, var5);
            stackOut_2_0 = (ma) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("wh.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    wh(he param0) {
        mf var2 = null;
        ((wh) this).field_c = new hl();
        ((wh) this).field_f = false;
        ((wh) this).field_b = 0;
        try {
            var2 = param0.a((Runnable) this, (byte) -21, 5);
            while (0 == var2.field_d) {
                gi.a((byte) -37, 10L);
            }
            if (var2.field_d == 2) {
                throw new RuntimeException();
            }
            ((wh) this).field_d = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Accuracy: ";
    }
}
