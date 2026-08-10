/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements Runnable {
    static java.awt.Color field_e;
    private hl field_d;
    private Thread field_c;
    int field_a;
    private boolean field_b;

    public static void b(int param0) {
        field_e = null;
        if (param0 == 3) {
            return;
        }
        field_e = (java.awt.Color) null;
    }

    final md a(int param0, int param1, bi param2, byte[] param3) {
        md var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        md stackIn_3_0 = null;
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
              var5 = new md();
              var5.field_u = param3;
              var5.field_l = (long)param1;
              if (param0 >= 45) {
                break L1;
              } else {
                var6 = (byte[]) null;
                this.a(113, 43, (bi) null, (byte[]) null);
                break L1;
              }
            }
            var5.field_w = 2;
            var5.field_r = false;
            var5.field_x = param2;
            this.a((byte) -87, var5);
            stackIn_3_0 = (md) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ae.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final md a(bi param0, int param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        Object var5_ref = null;
        md var6 = null;
        int var8 = 0;
        md stackIn_4_0 = null;
        md stackIn_10_0 = null;
        md stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = new md();
            var4.field_w = 1;
            var5_ref = this.field_d;
            synchronized (var5_ref) {
              L1: {
                var6 = (md) ((Object) this.field_d.d(125));
                if (param2 <= -100) {
                  L2: while (true) {
                    if (var6 == null) {
                      break L1;
                    } else {
                      L3: {
                        if (((long)param1 ^ -1L) != (var6.field_l ^ -1L)) {
                          break L3;
                        } else {
                          if (param0 != var6.field_x) {
                            break L3;
                          } else {
                            if (-3 != (var6.field_w ^ -1)) {
                              break L3;
                            } else {
                              var4.field_u = var6.field_u;
                              var4.field_m = false;
                              stackIn_10_0 = (md) (var4);
                              return stackIn_10_0;
                            }
                          }
                        }
                      }
                      var6 = (md) ((Object) this.field_d.b(-1));
                      continue L2;
                    }
                  }
                } else {
                  stackIn_4_0 = (md) null;
                  return stackIn_4_0;
                }
              }
            }
            var4.field_u = param0.a(-925871512, param1);
            var4.field_r = true;
            var4.field_m = false;
            stackIn_17_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("ae.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_17_0;
    }

    final void a(int param0) {
        try {
            md var4 = null;
            if (param0 != 5) {
                var4 = (md) null;
                this.a((byte) -127, (md) null);
            }
            this.field_b = true;
            synchronized (this.field_d) {
                this.field_d.notifyAll();
            }
            try {
                this.field_c.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, md param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_d;
          synchronized (var3) {
            L0: {
              this.field_d.a(param1, 0);
              if (param0 < -79) {
                this.field_a = this.field_a + 1;
                this.field_d.notifyAll();
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
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3;

            stackIn_11_1 = new StringBuilder().append("ae.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final md a(int param0, bi param1, int param2) {
        md var4 = null;
        RuntimeException var4_ref = null;
        md stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new md();
              if (param0 <= -56) {
                break L1;
              } else {
                this.run();
                break L1;
              }
            }
            var4.field_w = 3;
            var4.field_x = param1;
            var4.field_r = false;
            var4.field_l = (long)param2;
            this.a((byte) -94, var4);
            stackIn_3_0 = (md) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ae.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            md var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = SolKnight.field_L ? 1 : 0;
            L0: while (true) {
              if (!this.field_b) {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (md) ((Object) this.field_d.c(0));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_d.wait();
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
                    } else {
                      this.field_a = this.field_a - 1;
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
                        if (-3 == (var7.field_w ^ -1)) {
                          var7.field_x.a((byte) -46, (int)var7.field_l, var7.field_u, var7.field_u.length);
                          var7.field_m = false;
                          break L5;
                        } else {
                          if (3 == var7.field_w) {
                            var7.field_u = var7.field_x.a(-925871512, (int)var7.field_l);
                            var7.field_m = false;
                            break L5;
                          } else {
                            var7.field_m = false;
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
                      var6 = (String) null;
                      hi.a((Throwable) ((Object) var2_ref), (String) null, 1);
                      var7.field_m = false;
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
            if (param0 != 26197) {
                field_e = (java.awt.Color) null;
            }
            sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
            var2 = sl.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ae.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ae(dl param0) {
        nj var2 = null;
        this.field_d = new hl();
        this.field_b = false;
        this.field_a = 0;
        try {
            var2 = param0.a(5, -51, (Runnable) (this));
            while (var2.field_c == 0) {
                i.a((byte) 90, 10L);
            }
            if (2 == var2.field_c) {
                throw new RuntimeException();
            }
            this.field_c = (Thread) (var2.field_e);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "ae.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new java.awt.Color(10040319);
    }
}
