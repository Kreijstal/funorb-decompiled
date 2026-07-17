/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb implements Runnable {
    static float[] field_e;
    static uf field_b;
    static int[] field_a;
    private ol field_d;
    static float[] field_f;
    int field_c;
    private Thread field_h;
    static int field_i;
    private boolean field_g;

    final bk a(int param0, sk param1, byte[] param2, int param3) {
        bk var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        bk stackIn_4_0 = null;
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
        bk stackOut_3_0 = null;
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
            var5 = new bk();
            var5.field_x = param1;
            var5.field_i = (long)param0;
            var5.field_v = param2;
            var5.field_y = 2;
            if (param3 == 11998) {
              var5.field_t = false;
              this.a(param3 + -39427, var5);
              stackOut_3_0 = (bk) var5;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("qb.B(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            bk var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = HoldTheLine.field_D;
            L0: while (true) {
              if (((qb) this).field_g) {
                return;
              } else {
                var2 = (Object) (Object) ((qb) this).field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (bk) (Object) ((qb) this).field_d.a((byte) 113);
                    if (var7 != null) {
                      ((qb) this).field_c = ((qb) this).field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((qb) this).field_d).wait();
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
                        if (var7.field_y != 2) {
                          if (var7.field_y == 3) {
                            var7.field_v = var7.field_x.a(122, (int)var7.field_i);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_u = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_x.a(var7.field_v, (int)var7.field_i, var7.field_v.length, false);
                          var7.field_u = false;
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
                      bl.a((Throwable) (Object) var2_ref, (byte) 115, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_u = false;
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

    final static void a(int param0, byte param1) {
        int discarded$4 = 1;
        int discarded$7 = em.a();
        if (param1 > -63) {
            field_i = 124;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -3) {
            qb.b(12);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final bk a(sk param0, int param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bk var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        bk stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        bk stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        bk stackOut_7_0 = null;
        bk stackOut_17_0 = null;
        Object stackOut_15_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var4 = new bk();
            var4.field_y = 1;
            var5 = (Object) (Object) ((qb) this).field_d;
            synchronized (var5) {
              L1: {
                var6 = (bk) (Object) ((qb) this).field_d.c(param1 + 18139);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((long)param2 != var6.field_i) {
                        break L3;
                      } else {
                        if (param0 != var6.field_x) {
                          break L3;
                        } else {
                          if (var6.field_y != 2) {
                            break L3;
                          } else {
                            var4.field_v = var6.field_v;
                            var4.field_u = false;
                            stackOut_7_0 = (bk) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (bk) (Object) ((qb) this).field_d.e(param1 ^ 17949);
                    continue L2;
                  }
                }
              }
            }
            var4.field_v = param0.a(117, param2);
            var4.field_t = true;
            var4.field_u = false;
            if (param1 == -18017) {
              stackOut_17_0 = (bk) var4;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_15_0 = null;
              stackIn_16_0 = stackOut_15_0;
              return (bk) (Object) stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("qb.E(");
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
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_18_0;
    }

    final bk a(int param0, sk param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        bk stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_0_0 = null;
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
            var4 = new bk();
            var4.field_y = param0;
            var4.field_i = (long)param2;
            var4.field_x = param1;
            var4.field_t = false;
            this.a(-27429, var4);
            stackOut_0_0 = (bk) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("qb.G(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    final static String a() {
        if (!sk.field_h) {
          if (g.field_h <= dm.field_a) {
            if (we.field_l + g.field_h <= dm.field_a) {
              return null;
            } else {
              return n.field_s;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((qb) this).field_g = stackIn_3_1 != 0;
        var2 = (Object) (Object) ((qb) this).field_d;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((qb) this).field_d).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((qb) this).field_h.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((qb) this).field_h = null;
    }

    private final void a(int param0, bk param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
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
            var3 = (Object) (Object) ((qb) this).field_d;
            synchronized (var3) {
              L1: {
                ((qb) this).field_d.a(-66, (ln) (Object) param1);
                ((qb) this).field_c = ((qb) this).field_c + 1;
                ((Object) (Object) ((qb) this).field_d).notifyAll();
                break L1;
              }
            }
            if (param0 == -27429) {
              break L0;
            } else {
              qb.a(-68, (byte) 57);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("qb.C(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    qb(ib param0) {
        af var2 = null;
        ((qb) this).field_d = new ol();
        ((qb) this).field_g = false;
        ((qb) this).field_c = 0;
        try {
            var2 = param0.a((byte) -28, 5, (Runnable) this);
            while (var2.field_d == 0) {
                int discarded$0 = 45;
                qe.a(10L);
            }
            if (2 == var2.field_d) {
                throw new RuntimeException();
            }
            ((qb) this).field_h = (Thread) var2.field_b;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "qb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{40, 170, 100, 110, 170};
        field_f = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_e = field_f;
    }
}
