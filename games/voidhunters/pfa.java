/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa implements Runnable {
    private vga field_d;
    private boolean field_c;
    int field_e;
    static String field_a;
    private Thread field_b;

    private final void a(int param0, jma param1) {
        synchronized (this.field_d) {
            if (param0 != 0) {
                pfa.b(102);
            }
            this.field_d.a(param1, param0 ^ -108);
            this.field_e = this.field_e + 1;
            this.field_d.notifyAll();
        }
    }

    final jma a(int param0, fo param1, byte param2) {
        jma var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        jma var6 = null;
        int var8 = 0;
        jma stackIn_8_0 = null;
        jma stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var4 = new jma();
            var4.field_r = 1;
            var5_ref_Object = this.field_d;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (jma) ((Object) this.field_d.a((byte) -54));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((var6.field_i ^ -1L) != ((long)param0 ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_o != param1) {
                          break L3;
                        } else {
                          if (2 != var6.field_r) {
                            break L3;
                          } else {
                            var4.field_n = false;
                            var4.field_p = var6.field_p;
                            stackIn_8_0 = (jma) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (jma) ((Object) this.field_d.a(1900));
                    continue L2;
                  }
                }
              }
            }
            var4.field_p = param1.a((byte) 64, param0);
            var5 = 91 / ((param2 - 0) / 60);
            var4.field_n = false;
            var4.field_l = true;
            stackIn_15_0 = (jma) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("pfa.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    final jma a(fo param0, byte[] param1, byte param2, int param3) {
        jma var5 = null;
        RuntimeException var5_ref = null;
        jma stackIn_3_0 = null;
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
              if (param2 > 73) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var5 = new jma();
            var5.field_o = param0;
            var5.field_r = 2;
            var5.field_l = false;
            var5.field_p = param1;
            var5.field_i = (long)param3;
            this.a(0, var5);
            stackIn_3_0 = (jma) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("pfa.C(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final jma a(byte param0, fo param1, int param2) {
        jma var4 = null;
        RuntimeException var4_ref = null;
        jma stackIn_2_0 = null;
        jma stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new jma();
            var4.field_r = 3;
            var4.field_o = param1;
            var4.field_l = false;
            var4.field_i = (long)param2;
            this.a(param0 + -121, var4);
            if (param0 == 121) {
              stackIn_4_0 = (jma) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (jma) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("pfa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0) {
        try {
            this.field_c = true;
            synchronized (this.field_d) {
                if (param0 != 23474) {
                    field_a = (String) null;
                }
                this.field_d.notifyAll();
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

    public static void b(int param0) {
        field_a = null;
        if (param0 <= 62) {
            pfa.b(-80);
        }
    }

    pfa(eab param0) {
        mob var2 = null;
        this.field_d = new vga();
        this.field_e = 0;
        this.field_c = false;
        try {
            var2 = param0.a(0, 5, (Runnable) (this));
            while (0 == var2.field_f) {
                gdb.b(-52, 10L);
            }
            if (var2.field_f == 2) {
                throw new RuntimeException();
            }
            this.field_b = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            jma var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = VoidHunters.field_G;
            L0: while (true) {
              if (this.field_c) {
                return;
              } else {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (jma) ((Object) this.field_d.b((byte) -120));
                    if (var7 != null) {
                      this.field_e = this.field_e - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
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
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if ((var7.field_r ^ -1) == -3) {
                          var7.field_o.a((int)var7.field_i, 520, var7.field_p, var7.field_p.length);
                          var7.field_n = false;
                          break L5;
                        } else {
                          if ((var7.field_r ^ -1) != -4) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_p = var7.field_o.a((byte) 120, (int)var7.field_i);
                            var7.field_n = false;
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
                      var6 = (String) null;
                      gna.a((Throwable) ((Object) var2_ref), (String) null, 0);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_n = false;
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

    static {
        field_a = "Pelican chassis";
    }
}
