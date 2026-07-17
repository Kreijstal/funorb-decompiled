/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj implements Runnable {
    static oe field_a;
    private cd field_e;
    int field_b;
    private Thread field_d;
    private boolean field_c;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        rh var4_ref_rh = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        pf var8 = null;
        w var9 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          L0: {
            var9 = rd.field_j;
            var2 = var9.f(-128);
            if (var2 == 0) {
              var8 = (pf) (Object) ua.field_G.a((byte) 74);
              if (var8 != null) {
                L1: {
                  var4 = var9.f(24);
                  if (var4 != 0) {
                    var13 = new byte[var4];
                    var9.a(121, var13, 0, var4);
                    break L1;
                  } else {
                    var5 = null;
                    break L1;
                  }
                }
                var9.field_i = var9.field_i + 4;
                if (var9.e(-1)) {
                  var8.c(96);
                  break L0;
                } else {
                  mc.a((byte) -125);
                  return;
                }
              } else {
                mc.a((byte) -128);
                return;
              }
            } else {
              if (var2 == 1) {
                var3 = var9.e((byte) 124);
                var4_ref_rh = (rh) (Object) de.field_e.a((byte) 74);
                L2: while (true) {
                  L3: {
                    if (var4_ref_rh == null) {
                      break L3;
                    } else {
                      if (var4_ref_rh.field_i != var3) {
                        var4_ref_rh = (rh) (Object) de.field_e.b((byte) -120);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4_ref_rh == null) {
                    mc.a((byte) -128);
                    return;
                  } else {
                    var4_ref_rh.c(122);
                    return;
                  }
                }
              } else {
                int discarded$2 = 92;
                k.a((Throwable) null, (byte) 41, "A1: " + aj.a());
                mc.a((byte) -126);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "gj.E(" + -124 + 41);
        }
    }

    final ab a(int param0, int param1, hc param2) {
        ab var4 = null;
        RuntimeException var4_ref = null;
        ab stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ab stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = new ab();
              var4.field_o = false;
              var4.field_s = 3;
              var4.field_j = (long)param0;
              var4.field_v = param2;
              this.a(0, var4);
              if (param1 == -3) {
                break L1;
              } else {
                ((gj) this).field_d = null;
                break L1;
              }
            }
            stackOut_2_0 = (ab) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("gj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((gj) this).field_c = true;
        var2 = (Object) (Object) ((gj) this).field_e;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((gj) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((gj) this).field_d.join();
            if (param0 >= 72) {
              break L1;
            } else {
              ((gj) this).field_d = null;
              ((gj) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((gj) this).field_d = null;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ab var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Main.field_T;
            L0: while (true) {
              if (((gj) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((gj) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (ab) (Object) ((gj) this).field_e.a(30);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((gj) this).field_e).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((gj) this).field_b = ((gj) this).field_b - 1;
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
                        if (2 != var7.field_s) {
                          if (var7.field_s != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_r = var7.field_v.a((byte) 19, (int)var7.field_j);
                            var7.field_n = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_v.a(var7.field_r, 111, var7.field_r.length, (int)var7.field_j);
                          var7.field_n = false;
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
                      var6 = null;
                      k.a((Throwable) (Object) var2_ref, (byte) 119, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_n = false;
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

    final ab a(hc param0, byte[] param1, int param2, int param3) {
        ab var5 = null;
        RuntimeException var5_ref = null;
        ab stackIn_3_0 = null;
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
        ab stackOut_2_0 = null;
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
              var5 = new ab();
              var5.field_j = (long)param2;
              if (param3 == -23167) {
                break L1;
              } else {
                ((gj) this).field_e = null;
                break L1;
              }
            }
            var5.field_r = param1;
            var5.field_v = param0;
            var5.field_s = 2;
            var5.field_o = false;
            this.a(0, var5);
            stackOut_2_0 = (ab) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("gj.D(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    private final void a(int param0, ab param1) {
        synchronized (((gj) this).field_e) {
            ((gj) this).field_e.a((byte) -108, (he) (Object) param1);
            ((gj) this).field_b = ((gj) this).field_b + 1;
            ((Object) (Object) ((gj) this).field_e).notifyAll();
        }
    }

    final ab a(int param0, hc param1, int param2) {
        ab var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        ab var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ab stackIn_8_0 = null;
        ab stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        ab stackOut_7_0 = null;
        ab stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            var4 = new ab();
            var4.field_s = param0;
            var5 = (Object) (Object) ((gj) this).field_e;
            synchronized (var5) {
              L1: {
                var6 = (ab) (Object) ((gj) this).field_e.c((byte) -114);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_j != ~(long)param2) {
                        break L3;
                      } else {
                        if (param1 != var6.field_v) {
                          break L3;
                        } else {
                          if (var6.field_s != 2) {
                            break L3;
                          } else {
                            var4.field_n = false;
                            var4.field_r = var6.field_r;
                            stackOut_7_0 = (ab) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (ab) (Object) ((gj) this).field_e.b((byte) -122);
                    continue L2;
                  }
                }
              }
            }
            var4.field_r = param1.a((byte) 19, param2);
            var4.field_o = true;
            var4.field_n = false;
            stackOut_14_0 = (ab) var4;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("gj.B(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    public static void a() {
        field_a = null;
    }

    gj(le param0) {
        vi var2 = null;
        ((gj) this).field_e = new cd();
        ((gj) this).field_b = 0;
        ((gj) this).field_c = false;
        try {
            var2 = param0.a(0, 5, (Runnable) this);
            while (0 == var2.field_a) {
                wk.a((byte) -112, 10L);
            }
            if (var2.field_a == 2) {
                throw new RuntimeException();
            }
            ((gj) this).field_d = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
