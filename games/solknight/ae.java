/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements Runnable {
    static java.awt.Color field_e;
    private hl field_d;
    private Thread field_c;
    int field_a;
    private boolean field_b;

    public static void b() {
        field_e = null;
    }

    final md a(int param0, int param1, bi param2, byte[] param3) {
        md var5 = null;
        RuntimeException var5_ref = null;
        Object var6 = null;
        md stackIn_3_0 = null;
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
        md stackOut_2_0 = null;
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
              var5 = new md();
              var5.field_u = param3;
              var5.field_l = (long)param1;
              if (param0 >= 45) {
                break L1;
              } else {
                var6 = null;
                md discarded$2 = ((ae) this).a(113, 43, (bi) null, (byte[]) null);
                break L1;
              }
            }
            var5.field_w = 2;
            var5.field_r = false;
            var5.field_x = param2;
            this.a((byte) -87, var5);
            stackOut_2_0 = (md) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("ae.F(").append(param0).append(44).append(param1).append(44);
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final md a(bi param0, int param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        md var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_4_0 = null;
        md stackIn_10_0 = null;
        md stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        md stackOut_9_0 = null;
        Object stackOut_3_0 = null;
        md stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new md();
            var4.field_w = 1;
            var5 = (Object) (Object) ((ae) this).field_d;
            synchronized (var5) {
              L1: {
                var6 = (md) (Object) ((ae) this).field_d.d(125);
                if (param2 <= -100) {
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (~(long)param1 != ~var6.field_l) {
                          break L3;
                        } else {
                          if (param0 != var6.field_x) {
                            break L3;
                          } else {
                            if (var6.field_w != 2) {
                              break L3;
                            } else {
                              var4.field_u = var6.field_u;
                              var4.field_m = false;
                              stackOut_9_0 = (md) var4;
                              stackIn_10_0 = stackOut_9_0;
                              return stackIn_10_0;
                            }
                          }
                        }
                      }
                      var6 = (md) (Object) ((ae) this).field_d.b(-1);
                      continue L2;
                    }
                  }
                } else {
                  stackOut_3_0 = null;
                  stackIn_4_0 = stackOut_3_0;
                  return (md) (Object) stackIn_4_0;
                }
              }
            }
            var4.field_u = param0.a(-925871512, param1);
            var4.field_r = true;
            var4.field_m = false;
            stackOut_16_0 = (md) var4;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4_ref;
            stackOut_18_1 = new StringBuilder().append("ae.B(");
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
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_17_0;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Object var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 5) {
            break L0;
          } else {
            var4 = null;
            this.a((byte) -127, (md) null);
            break L0;
          }
        }
        ((ae) this).field_b = true;
        var2 = (Object) (Object) ((ae) this).field_d;
        synchronized (var2) {
          L1: {
            ((Object) (Object) ((ae) this).field_d).notifyAll();
            break L1;
          }
        }
        try {
          L2: {
            ((ae) this).field_c.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((ae) this).field_c = null;
    }

    private final void a(byte param0, md param1) {
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
          var3_ref = (Object) (Object) ((ae) this).field_d;
          synchronized (var3_ref) {
            L0: {
              ((ae) this).field_d.a((ec) (Object) param1, 0);
              if (param0 < -79) {
                ((ae) this).field_a = ((ae) this).field_a + 1;
                ((Object) (Object) ((ae) this).field_d).notifyAll();
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
            stackOut_9_1 = new StringBuilder().append("ae.D(").append(param0).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final md a(int param0, bi param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        md stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        md stackOut_2_0 = null;
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
              var4 = new md();
              if (param0 <= -56) {
                break L1;
              } else {
                ((ae) this).run();
                break L1;
              }
            }
            var4.field_w = 3;
            var4.field_x = param1;
            var4.field_r = false;
            var4.field_l = (long)param2;
            this.a((byte) -94, var4);
            stackOut_2_0 = (md) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("ae.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            md var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = SolKnight.field_L ? 1 : 0;
            L0: while (true) {
              if (!((ae) this).field_b) {
                var2 = (Object) (Object) ((ae) this).field_d;
                synchronized (var2) {
                  L1: {
                    var6 = (md) (Object) ((ae) this).field_d.c(0);
                    if (var6 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((ae) this).field_d).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      ((ae) this).field_a = ((ae) this).field_a - 1;
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
                        if (var6.field_w == 2) {
                          boolean discarded$2 = var6.field_x.a((byte) -46, (int)var6.field_l, var6.field_u, var6.field_u.length);
                          var6.field_m = false;
                          break L5;
                        } else {
                          if (3 == var6.field_w) {
                            var6.field_u = var6.field_x.a(-925871512, (int)var6.field_l);
                            var6.field_m = false;
                            break L5;
                          } else {
                            var6.field_m = false;
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
                      int discarded$3 = 1;
                      hi.a((Throwable) (Object) var2_ref, (String) null);
                      var6.field_m = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, da param1) {
        sl var2 = null;
        try {
            sl.b(param1.a(4, "headers.packvorbis", ""));
            var2 = sl.a(param1, "jagex logo2.packvorbis", "");
            sh discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ae.E(" + 26197 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ae(dl param0) {
        nj var2 = null;
        ((ae) this).field_d = new hl();
        ((ae) this).field_b = false;
        ((ae) this).field_a = 0;
        try {
            var2 = param0.a(5, -51, (Runnable) this);
            while (var2.field_c == 0) {
                i.a((byte) 90, 10L);
            }
            if (2 == var2.field_c) {
                throw new RuntimeException();
            }
            ((ae) this).field_c = (Thread) var2.field_e;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "ae.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new java.awt.Color(10040319);
    }
}
