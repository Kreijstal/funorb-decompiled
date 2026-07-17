/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements Runnable {
    private ci field_a;
    private boolean field_d;
    int field_c;
    private Thread field_b;

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -114) {
            break L0;
          } else {
            ((kl) this).field_c = -72;
            break L0;
          }
        }
        ((kl) this).field_d = true;
        var2 = (Object) (Object) ((kl) this).field_a;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((kl) this).field_a).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((kl) this).field_b.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((kl) this).field_b = null;
    }

    private final void a(int param0, fj param1) {
        synchronized (((kl) this).field_a) {
            ((kl) this).field_a.a(91, (ca) (Object) param1);
            ((kl) this).field_c = ((kl) this).field_c + 1;
            if (param0 <= 58) {
                Object var5 = null;
                fj discarded$0 = ((kl) this).a((dl) null, (byte) -50, -68);
            }
            ((Object) (Object) ((kl) this).field_a).notifyAll();
        }
    }

    final fj a(int param0, dl param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        fj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fj stackOut_0_0 = null;
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
            var4 = new fj();
            var4.field_j = (long)param0;
            var4.field_p = false;
            var4.field_z = param1;
            var4.field_A = param2;
            this.a(110, var4);
            stackOut_0_0 = (fj) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("kl.A(").append(param0).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
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
            fj var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            L0: while (true) {
              if (((kl) this).field_d) {
                return;
              } else {
                var2 = (Object) (Object) ((kl) this).field_a;
                synchronized (var2) {
                  L1: {
                    var7 = (fj) (Object) ((kl) this).field_a.a((byte) 100);
                    if (var7 != null) {
                      ((kl) this).field_c = ((kl) this).field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((kl) this).field_a).wait();
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
                        if (var7.field_A != 2) {
                          if (var7.field_A == 3) {
                            var7.field_w = var7.field_z.a((int)var7.field_j, -65536);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_v = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_z.a(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
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
                      uj.a((String) null, (Throwable) (Object) var2_ref, 1);
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

    final fj a(byte[] param0, int param1, int param2, dl param3) {
        fj var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        fj stackIn_3_0 = null;
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
        fj stackOut_2_0 = null;
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
              if (param2 == 1) {
                break L1;
              } else {
                var6 = null;
                fj discarded$2 = ((kl) this).a((byte[]) null, -102, -125, (dl) null);
                break L1;
              }
            }
            var5 = new fj();
            var5.field_A = 2;
            var5.field_p = false;
            var5.field_z = param3;
            var5.field_w = param0;
            var5.field_j = (long)param1;
            this.a(param2 ^ 118, var5);
            stackOut_2_0 = (fj) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("kl.C(");
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final fj a(dl param0, byte param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        fj var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
        fj stackIn_10_0 = null;
        fj stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        fj stackOut_9_0 = null;
        fj stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new fj();
            var4.field_A = 1;
            var5 = (Object) (Object) ((kl) this).field_a;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var9 = null;
                    fj discarded$2 = ((kl) this).a(30, (dl) null, 85);
                    break L2;
                  }
                }
                var6 = (fj) (Object) ((kl) this).field_a.a(true);
                L3: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L4: {
                      if (~(long)param2 != ~var6.field_j) {
                        break L4;
                      } else {
                        if (var6.field_z != param0) {
                          break L4;
                        } else {
                          if (var6.field_A != 2) {
                            break L4;
                          } else {
                            var4.field_v = false;
                            var4.field_w = var6.field_w;
                            stackOut_9_0 = (fj) var4;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0;
                          }
                        }
                      }
                    }
                    var6 = (fj) (Object) ((kl) this).field_a.a(-256);
                    continue L3;
                  }
                }
              }
            }
            var4.field_w = param0.a(param2, -65536);
            var4.field_p = true;
            var4.field_v = false;
            stackOut_16_0 = (fj) var4;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("kl.E(");
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
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_17_0;
    }

    final static void a(int param0, int param1, int param2, db[] param3, int param4, le param5, int param6, byte param7, db[] param8, boolean param9, int param10, int param11) {
        try {
            int var12_int = 11 / ((18 - param7) / 37);
            pe.a(param10, param1, param2, param5, param0, param8, param3, param6, param5, param0, param4, -98, param11, param10, param9);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "kl.F(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 44 + param9 + 44 + param10 + 44 + param11 + 41);
        }
    }

    kl(ab param0) {
        ei var2 = null;
        ((kl) this).field_a = new ci();
        ((kl) this).field_d = false;
        ((kl) this).field_c = 0;
        try {
            var2 = param0.a((Runnable) this, false, 5);
            while (0 == var2.field_b) {
                ge.a(0, 10L);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            ((kl) this).field_b = (Thread) var2.field_g;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "kl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
