/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements Runnable {
    private nj field_b;
    static el field_f;
    static ak field_a;
    private Thread field_d;
    private boolean field_e;
    int field_c;

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            cg var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Pixelate.field_H ? 1 : 0;
            L0: while (true) {
              if (((gm) this).field_e) {
                return;
              } else {
                var2 = (Object) (Object) ((gm) this).field_b;
                synchronized (var2) {
                  L1: {
                    var7 = (cg) (Object) ((gm) this).field_b.a((byte) 80);
                    if (var7 != null) {
                      ((gm) this).field_c = ((gm) this).field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((gm) this).field_b).wait();
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
                        if (2 != var7.field_C) {
                          if (var7.field_C != 3) {
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_D = var7.field_G.a(111, (int)var7.field_q);
                            var7.field_v = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_G.a(var7.field_D.length, var7.field_D, false, (int)var7.field_q);
                          var7.field_v = false;
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
                      jo.a(1, (String) null, (Throwable) (Object) var2_ref);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_v = false;
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

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        int var2 = 0;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2 = 62 % ((param0 - 18) / 56);
        ((gm) this).field_e = true;
        var3 = (Object) (Object) ((gm) this).field_b;
        synchronized (var3) {
          L0: {
            ((Object) (Object) ((gm) this).field_b).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((gm) this).field_d.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((gm) this).field_d = null;
    }

    private final void a(byte param0, cg param1) {
        synchronized (((gm) this).field_b) {
            if (param0 < 63) {
                ((gm) this).run();
            }
            ((gm) this).field_b.a(-115, (lm) (Object) param1);
            ((gm) this).field_c = ((gm) this).field_c + 1;
            ((Object) (Object) ((gm) this).field_b).notifyAll();
        }
    }

    public static void a() {
        field_a = null;
        field_f = null;
    }

    final cg a(int param0, rn param1, int param2) {
        cg var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cg var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cg stackIn_8_0 = null;
        cg stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        cg stackOut_7_0 = null;
        cg stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = new cg();
            var4.field_C = 1;
            var5 = (Object) (Object) ((gm) this).field_b;
            synchronized (var5) {
              L1: {
                var6 = (cg) (Object) ((gm) this).field_b.c(72);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (~var6.field_q != ~(long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_G) {
                          break L3;
                        } else {
                          if (2 != var6.field_C) {
                            break L3;
                          } else {
                            var4.field_D = var6.field_D;
                            var4.field_v = false;
                            stackOut_7_0 = (cg) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (cg) (Object) ((gm) this).field_b.a(65151);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              if (param2 >= 53) {
                break L4;
              } else {
                field_f = null;
                break L4;
              }
            }
            var4.field_D = param1.a(126, param0);
            var4.field_t = true;
            var4.field_v = false;
            stackOut_16_0 = (cg) var4;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("gm.C(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final cg a(int param0, int param1, rn param2) {
        cg var4 = null;
        RuntimeException var4_ref = null;
        cg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_0_0 = null;
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
            var4 = new cg();
            var4.field_q = (long)param0;
            var4.field_G = param2;
            var4.field_t = false;
            var4.field_C = param1;
            this.a((byte) 72, var4);
            stackOut_0_0 = (cg) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("gm.D(").append(param0).append(',').append(param1).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final cg a(int param0, int param1, rn param2, byte[] param3) {
        cg var5 = null;
        RuntimeException var5_ref = null;
        cg stackIn_3_0 = null;
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
        cg stackOut_2_0 = null;
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
              var5 = new cg();
              var5.field_C = 2;
              if (param1 >= 38) {
                break L1;
              } else {
                ((gm) this).field_d = null;
                break L1;
              }
            }
            var5.field_G = param2;
            var5.field_D = param3;
            var5.field_t = false;
            var5.field_q = (long)param0;
            this.a((byte) 90, var5);
            stackOut_2_0 = (cg) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("gm.E(").append(param0).append(',').append(param1).append(',');
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    gm(cb param0) {
        ei var2 = null;
        ((gm) this).field_b = new nj();
        ((gm) this).field_c = 0;
        ((gm) this).field_e = false;
        try {
            var2 = param0.a(5, (Runnable) this, (byte) -123);
            while (var2.field_b == 0) {
                int discarded$0 = 23;
                vg.a(10L);
            }
            if (2 == var2.field_b) {
                throw new RuntimeException();
            }
            ((gm) this).field_d = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new el();
    }
}
