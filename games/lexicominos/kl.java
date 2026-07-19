/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements Runnable {
    private ci field_a;
    private boolean field_d;
    int field_c;
    private Thread field_b;

    final void a(byte param0) {
        try {
            if (param0 != -114) {
                this.field_c = -72;
            }
            this.field_d = true;
            synchronized (this.field_a) {
                this.field_a.notifyAll();
            }
            try {
                this.field_b.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_b = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, fj param1) {
        fj discarded$0 = null;
        synchronized (this.field_a) {
            this.field_a.a(91, param1);
            this.field_c = this.field_c + 1;
            if (param0 <= 58) {
                dl var5 = (dl) null;
                discarded$0 = this.a((dl) null, (byte) -50, -68);
            }
            this.field_a.notifyAll();
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
            stackOut_0_0 = (fj) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("kl.A(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Exception var2 = null;
            Object var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            fj var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            L0: while (true) {
              if (this.field_d) {
                return;
              } else {
                var2_ref = this.field_a;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (fj) ((Object) this.field_a.a((byte) 100));
                    if (var5 == 0) {
                      if (var7 != null) {
                        this.field_c = this.field_c - 1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        try {
                          L2: {
                            this.field_a.wait();
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
                    } else {
                      return;
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
                          break L5;
                        } else {
                          discarded$1 = var7.field_z.a(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
                          if (var5 == 0) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (-4 == (var7.field_A ^ -1)) {
                        var7.field_w = var7.field_z.a((int)var7.field_j, -65536);
                        decompiledRegionSelector1 = 2;
                        break L4;
                      } else {
                        var7.field_v = false;
                        decompiledRegionSelector1 = 1;
                        break L4;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      uj.a((String) null, (Throwable) ((Object) var2), 1);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_v = false;
                    continue L0;
                  } else {
                    if (decompiledRegionSelector1 == 1) {
                      continue L0;
                    } else {
                      var7.field_v = false;
                      continue L0;
                    }
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
        fj discarded$2 = null;
        fj var5 = null;
        RuntimeException var5_ref = null;
        dl var6 = null;
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
                var6 = (dl) null;
                discarded$2 = this.a((byte[]) null, -102, -125, (dl) null);
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
            stackOut_2_0 = (fj) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("kl.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final fj a(dl param0, byte param1, int param2) {
        fj discarded$4 = null;
        fj var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        fj var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        dl var9 = null;
        fj stackIn_11_0 = null;
        fj stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        fj stackOut_10_0 = null;
        fj stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new fj();
            var4.field_A = 1;
            var5_ref = this.field_a;
            synchronized (var5_ref) {
              L1: {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var9 = (dl) null;
                    discarded$4 = this.a(30, (dl) null, 85);
                    break L2;
                  }
                }
                var6 = (fj) ((Object) this.field_a.a(true));
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        if (var8 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if (((long)param2 ^ -1L) != (var6.field_j ^ -1L)) {
                              break L6;
                            } else {
                              if (var6.field_z != param0) {
                                break L6;
                              } else {
                                if (var6.field_A != 2) {
                                  break L6;
                                } else {
                                  var4.field_v = false;
                                  var4.field_w = var6.field_w;
                                  stackOut_10_0 = (fj) (var4);
                                  stackIn_11_0 = stackOut_10_0;
                                  return stackIn_11_0;
                                }
                              }
                            }
                          }
                          var6 = (fj) ((Object) this.field_a.a(-256));
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    break L4;
                  }
                  break L1;
                }
              }
            }
            var4.field_w = param0.a(param2, -65536);
            var4.field_p = true;
            var4.field_v = false;
            stackOut_17_0 = (fj) (var4);
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4_ref);
            stackOut_19_1 = new StringBuilder().append("kl.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final static void a(int param0, int param1, int param2, db[] param3, int param4, le param5, int param6, byte param7, db[] param8, boolean param9, int param10, int param11) {
        try {
            int var12_int = 11 / ((18 - param7) / 37);
            pe.a(param10, param1, param2, param5, param0, param8, param3, param6, param5, param0, param4, -98, param11, param10, param9);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kl.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ')');
        }
    }

    kl(ab param0) {
        RuntimeException runtimeException = null;
        ei var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        this.field_a = new ci();
        this.field_d = false;
        this.field_c = 0;
        try {
          L0: {
            var2 = param0.a((Runnable) (this), false, 5);
            L1: while (true) {
              L2: {
                L3: {
                  if (0 != var2.field_b) {
                    break L3;
                  } else {
                    ge.a(0, 10L);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if ((var2.field_b ^ -1) != -3) {
                  this.field_b = (Thread) (var2.field_g);
                  break L0;
                } else {
                  break L2;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("kl.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
    }
}
