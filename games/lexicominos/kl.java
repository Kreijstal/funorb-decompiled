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
        synchronized (this.field_a) {
            this.field_a.a(91, param1);
            this.field_c = this.field_c + 1;
            if (param0 <= 58) {
                dl var5 = (dl) null;
                this.a((dl) null, (byte) -50, -68);
            }
            this.field_a.notifyAll();
        }
    }

    final fj a(int param0, dl param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        fj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fj();
            var4.field_j = (long)param0;
            var4.field_p = false;
            var4.field_z = param1;
            var4.field_A = param2;
            this.a(110, var4);
            stackIn_1_0 = (fj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("kl.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            fj var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Lexicominos.field_L ? 1 : 0;
            L0: while (true) {
              if (this.field_d) {
                return;
              } else {
                var2 = this.field_a;
                synchronized (var2) {
                  L1: {
                    var7 = (fj) ((Object) this.field_a.a((byte) 100));
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
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_A != 2) {
                          if (-4 == (var7.field_A ^ -1)) {
                            var7.field_w = var7.field_z.a((int)var7.field_j, -65536);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_v = false;
                            break L5;
                          }
                        } else {
                          var7.field_z.a(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
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
                      var6 = (String) null;
                      uj.a((String) null, (Throwable) ((Object) var2_ref), 1);
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
        dl var6 = null;
        fj stackIn_3_0 = null;
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
              if (param2 == 1) {
                break L1;
              } else {
                var6 = (dl) null;
                this.a((byte[]) null, -102, -125, (dl) null);
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
            stackIn_3_0 = (fj) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("kl.C(");

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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final fj a(dl param0, byte param1, int param2) {
        fj var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        fj var6 = null;
        int var8 = 0;
        dl var9 = null;
        fj stackIn_10_0 = null;
        fj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new fj();
            var4.field_A = 1;
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                L2: {
                  if (param1 == -6) {
                    break L2;
                  } else {
                    var9 = (dl) null;
                    this.a(30, (dl) null, 85);
                    break L2;
                  }
                }
                var6 = (fj) ((Object) this.field_a.a(true));
                L3: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L4: {
                      if (((long)param2 ^ -1L) != (var6.field_j ^ -1L)) {
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
                            stackIn_10_0 = (fj) (var4);
                            return stackIn_10_0;
                          }
                        }
                      }
                    }
                    var6 = (fj) ((Object) this.field_a.a(-256));
                    continue L3;
                  }
                }
              }
            }
            var4.field_w = param0.a(param2, -65536);
            var4.field_p = true;
            var4.field_v = false;
            stackIn_17_0 = (fj) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("kl.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0;
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
        ei var2 = null;
        this.field_a = new ci();
        this.field_d = false;
        this.field_c = 0;
        try {
            var2 = param0.a((Runnable) (this), false, 5);
            while (0 == var2.field_b) {
                ge.a(0, 10L);
            }
            if ((var2.field_b ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_b = (Thread) (var2.field_g);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
