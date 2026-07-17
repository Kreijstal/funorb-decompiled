/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements Runnable {
    static hr field_b;
    private ro field_d;
    private Thread field_a;
    int field_e;
    private boolean field_c;

    final ql a(wl param0, int param1, int param2) {
        ql var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        ql var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        ql stackIn_9_0 = null;
        ql stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        ql stackOut_8_0 = null;
        ql stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new ql();
            var5 = 29 % ((param1 - -44) / 48);
            var4.field_y = 1;
            var6 = (Object) (Object) ((ti) this).field_d;
            synchronized (var6) {
              L1: {
                var7 = (ql) (Object) ((ti) this).field_d.a(110);
                L2: while (true) {
                  if (var7 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~(long)param2 != ~var7.field_l) {
                        break L3;
                      } else {
                        if (var7.field_w != param0) {
                          break L3;
                        } else {
                          if (var7.field_y == 2) {
                            var4.field_u = false;
                            var4.field_x = var7.field_x;
                            stackOut_8_0 = (ql) var4;
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7 = (ql) (Object) ((ti) this).field_d.d(-2);
                    continue L2;
                  }
                }
              }
            }
            var4.field_x = param0.a(101, param2);
            var4.field_t = true;
            var4.field_u = false;
            stackOut_15_0 = (ql) var4;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4_ref;
            stackOut_17_1 = new StringBuilder().append("ti.G(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_16_0;
    }

    final void b(int param0) {
        InterruptedException interruptedException = null;
        Object var2_ref_Object = null;
        int var2 = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((ti) this).field_c = true;
        var2_ref_Object = (Object) (Object) ((ti) this).field_d;
        synchronized (var2_ref_Object) {
          L0: {
            ((Object) (Object) ((ti) this).field_d).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((ti) this).field_a.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((ti) this).field_a = null;
        var2 = -15 / ((49 - param0) / 40);
    }

    final static String a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
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
            int discarded$4 = 0;
            int discarded$5 = 38;
            stackOut_0_0 = qc.a(param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ti.E(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    public static void a() {
        int var1 = 0;
        field_b = null;
    }

    private final void a(ql param0) {
        synchronized (((ti) this).field_d) {
            ((ti) this).field_d.a((pj) (Object) param0, (byte) -120);
            ((ti) this).field_e = ((ti) this).field_e + 1;
            ((Object) (Object) ((ti) this).field_d).notifyAll();
        }
    }

    final ql a(int param0, byte[] param1, int param2, wl param3) {
        ql var5 = null;
        RuntimeException var5_ref = null;
        ql stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5 = new ql();
            var5.field_l = (long)param0;
            var5.field_w = param3;
            var5.field_x = param1;
            var5.field_t = false;
            var5.field_y = param2;
            int discarded$2 = 1;
            this.a(var5);
            stackOut_0_0 = (ql) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("ti.B(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final ql a(int param0, int param1, wl param2) {
        ql var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ql stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_0_0 = null;
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
            var4 = new ql();
            var4.field_y = 3;
            var4.field_l = (long)param0;
            var5 = 119 % ((56 - param1) / 55);
            var4.field_t = false;
            var4.field_w = param2;
            int discarded$2 = 1;
            this.a(var4);
            stackOut_0_0 = (ql) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ti.D(").append(param0).append(44).append(param1).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    ti(wi param0) {
        jr var2 = null;
        ((ti) this).field_d = new ro();
        ((ti) this).field_c = false;
        ((ti) this).field_e = 0;
        try {
            var2 = param0.a(true, (Runnable) this, 5);
            while (0 == var2.field_c) {
                tg.a(10L, (byte) 119);
            }
            if (var2.field_c == 2) {
                throw new RuntimeException();
            }
            ((ti) this).field_a = (Thread) var2.field_d;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ti.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ql var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Sumoblitz.field_L ? 1 : 0;
            L0: while (true) {
              if (((ti) this).field_c) {
                return;
              } else {
                var2 = (Object) (Object) ((ti) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (ql) (Object) ((ti) this).field_d.b((byte) 72);
                    if (var7 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((ti) this).field_d).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((ti) this).field_e = ((ti) this).field_e - 1;
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
                          boolean discarded$1 = var7.field_w.a(var7.field_x, (int)var7.field_l, var7.field_x.length, 0);
                          var7.field_u = false;
                          break L5;
                        } else {
                          if (var7.field_y == 3) {
                            var7.field_x = var7.field_w.a(85, (int)var7.field_l);
                            var7.field_u = false;
                            break L5;
                          } else {
                            var7.field_u = false;
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
                      var6 = null;
                      ms.a((String) null, (Throwable) (Object) var2_ref, 0);
                      var7.field_u = false;
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

    static {
    }
}
