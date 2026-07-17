/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh implements Runnable {
    static long field_c;
    private bh field_d;
    static e field_a;
    private Thread field_f;
    private boolean field_b;
    int field_e;

    final rh a(um param0, int param1, int param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        rh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
        rh stackIn_10_0 = null;
        rh stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        rh stackOut_9_0 = null;
        rh stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = new rh();
              var4.field_E = 1;
              if (param2 == -27337) {
                break L1;
              } else {
                var9 = null;
                rh discarded$3 = ((dh) this).a((um) null, 57, 116);
                break L1;
              }
            }
            var5 = (Object) (Object) ((dh) this).field_d;
            synchronized (var5) {
              L2: {
                var6 = (rh) (Object) ((dh) this).field_d.d((byte) -35);
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((long)param1 != var6.field_h) {
                        break L4;
                      } else {
                        if (param0 != var6.field_B) {
                          break L4;
                        } else {
                          if (var6.field_E != 2) {
                            break L4;
                          } else {
                            var4.field_v = false;
                            var4.field_y = var6.field_y;
                            stackOut_9_0 = (rh) var4;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0;
                          }
                        }
                      }
                    }
                    var6 = (rh) (Object) ((dh) this).field_d.b((byte) -120);
                    continue L3;
                  }
                }
              }
            }
            var4.field_y = param0.a(param1, param2 ^ 27342);
            var4.field_v = false;
            var4.field_w = true;
            stackOut_16_0 = (rh) var4;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("dh.C(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(byte param0) {
        ei.field_t = false;
        int discarded$0 = sc.field_g.l(32270);
    }

    public static void b(int param0) {
        field_a = null;
    }

    final rh a(um param0, int param1, byte[] param2, int param3) {
        rh var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        rh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = new rh();
            var5.field_E = 2;
            var5.field_h = (long)param3;
            var5.field_w = false;
            var5.field_y = param2;
            if (param1 == -4) {
              var5.field_B = param0;
              this.a(false, var5);
              stackOut_3_0 = (rh) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (rh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("dh.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((dh) this).field_b = true;
        var2 = (Object) (Object) ((dh) this).field_d;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((dh) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            L2: {
              if (param0 == 3) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            ((dh) this).field_f.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((dh) this).field_f = null;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            rh var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = HostileSpawn.field_I ? 1 : 0;
            L0: while (true) {
              if (((dh) this).field_b) {
                return;
              } else {
                var2 = (Object) (Object) ((dh) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (rh) (Object) ((dh) this).field_d.a((byte) 27);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((dh) this).field_d).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((dh) this).field_e = ((dh) this).field_e - 1;
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
                        if (-3 == var7.field_E) {
                          boolean discarded$1 = var7.field_B.a((byte) -24, var7.field_y, var7.field_y.length, (int)var7.field_h);
                          var7.field_v = false;
                          break L5;
                        } else {
                          if (-4 != var7.field_E) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_y = var7.field_B.a((int)var7.field_h, -123);
                            var7.field_v = false;
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
                      ic.a((byte) -118, (String) null, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_v = false;
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

    final rh a(um param0, byte param1, int param2) {
        rh var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_2_0 = null;
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
              if (param1 < -72) {
                break L1;
              } else {
                var5 = null;
                rh discarded$2 = ((dh) this).a((um) null, -111, (byte[]) null, 81);
                break L1;
              }
            }
            var4 = new rh();
            var4.field_E = 3;
            var4.field_w = false;
            var4.field_B = param0;
            var4.field_h = (long)param2;
            this.a(false, var4);
            stackOut_2_0 = (rh) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("dh.F(");
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
          throw wg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (null == pb.b(param0, (byte) -120)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("dh.D(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + 111 + 41);
        }
        return stackIn_5_0 != 0;
    }

    private final void a(boolean param0, rh param1) {
        Object var3 = null;
        Object var3_ref = null;
        RuntimeException var3_ref2 = null;
        Throwable var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          var3_ref = (Object) (Object) ((dh) this).field_d;
          synchronized (var3_ref) {
            L0: {
              if (!param0) {
                ((dh) this).field_d.a((dk) (Object) param1, 79);
                ((dh) this).field_e = ((dh) this).field_e + 1;
                ((Object) (Object) ((dh) this).field_d).notifyAll();
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref2;
            stackOut_9_1 = new StringBuilder().append("dh.H(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    dh(fd param0) {
        kk var2 = null;
        ((dh) this).field_d = new bh();
        ((dh) this).field_b = false;
        ((dh) this).field_e = 0;
        try {
            var2 = param0.a(5, (Runnable) this, 62);
            while (var2.field_f == 0) {
                vj.a(10L, (byte) -49);
            }
            if (2 == var2.field_f) {
                throw new RuntimeException();
            }
            ((dh) this).field_f = (Thread) var2.field_c;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "dh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
