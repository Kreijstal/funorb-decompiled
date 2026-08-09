/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef implements Runnable {
    static s field_e;
    private jh field_a;
    private Thread field_g;
    private boolean field_c;
    int field_h;
    static int field_b;
    static int field_d;
    static String[] field_f;

    final tg a(byte param0, int param1, uf param2) {
        tg var4 = null;
        RuntimeException var4_ref = null;
        tg stackIn_2_0 = null;
        tg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new tg();
            var4.field_j = (long)param1;
            var4.field_v = 3;
            var4.field_o = false;
            var4.field_t = param2;
            if (param0 == 16) {
              this.a(89, var4);
              stackIn_4_0 = (tg) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (tg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("ef.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 != 27) {
            field_b = 10;
            field_f = null;
            field_e = null;
            return;
        }
        field_f = null;
        field_e = null;
    }

    final void a(int param0) {
        try {
            InterruptedException interruptedException = null;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            this.field_c = true;
            var2 = this.field_a;
            synchronized (var2) {
              L0: {
                this.field_a.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_g.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            this.field_g = null;
            if (param0 != 6843) {
              field_e = (s) null;
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(byte param0) {
        rh var1;
        ia var2;
        var1 = (rh) ((Object) a.field_f.c(param0 + -3848));
        if (var1 == null) {
          ec.a((byte) 27);
          return;
        } else {
          var2 = se.field_p;
          var2.f((byte) -118);
          var2.f((byte) -93);
          var2.f((byte) -104);
          if (param0 != -57) {
            return;
          } else {
            var2.f((byte) -110);
            var1.b(4);
            return;
          }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            tg var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = StarCannon.field_A;
            L0: while (true) {
              if (this.field_c) {
                return;
              } else {
                var2 = this.field_a;
                synchronized (var2) {
                  L1: {
                    var7 = (tg) ((Object) this.field_a.c(8));
                    if (var7 != null) {
                      this.field_h = this.field_h - 1;
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
                        if (var7.field_v == 2) {
                          var7.field_t.a(-1, var7.field_u.length, var7.field_u, (int)var7.field_j);
                          var7.field_r = false;
                          break L5;
                        } else {
                          if ((var7.field_v ^ -1) == -4) {
                            var7.field_u = var7.field_t.a((int)var7.field_j, (byte) 114);
                            var7.field_r = false;
                            break L5;
                          } else {
                            var7.field_r = false;
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
                      hc.a((Throwable) ((Object) var2_ref), (String) null, (byte) 127);
                      var7.field_r = false;
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

    private final void a(int param0, tg param1) {
        synchronized (this.field_a) {
            this.field_a.a(22197, param1);
            this.field_h = this.field_h + 1;
            this.field_a.notifyAll();
            if (param0 <= 11) {
                field_b = -1;
            }
        }
    }

    final tg a(byte[] param0, uf param1, boolean param2, int param3) {
        tg var5 = null;
        RuntimeException var5_ref = null;
        tg stackIn_2_0 = null;
        tg stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        tg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = new tg();
              var5.field_j = (long)param3;
              var5.field_u = param0;
              var5.field_v = 2;
              var5.field_t = param1;
              stackIn_2_0 = (tg) (var5);

              if (!param2) {
                stackIn_3_0 = (tg) ((Object) stackIn_2_0);
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = (tg) ((Object) stackIn_2_0);
                stackIn_3_1 = 1;
                break L1;
              }
            }
            stackIn_3_0.field_o = stackIn_3_1 != 0;
            this.a(77, var5);
            stackIn_4_0 = (tg) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ef.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final tg a(uf param0, int param1, int param2) {
        tg var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        tg var6 = null;
        int var8 = 0;
        tg stackIn_8_0 = null;
        tg stackIn_16_0 = null;
        tg stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = StarCannon.field_A;
        try {
          L0: {
            var4 = new tg();
            var4.field_v = 1;
            var5 = this.field_a;
            synchronized (var5) {
              L1: {
                var6 = (tg) ((Object) this.field_a.a((byte) 122));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((long)param2 != var6.field_j) {
                        break L3;
                      } else {
                        if (var6.field_t != param0) {
                          break L3;
                        } else {
                          if ((var6.field_v ^ -1) != -3) {
                            break L3;
                          } else {
                            var4.field_u = var6.field_u;
                            var4.field_r = false;
                            stackIn_8_0 = (tg) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (tg) ((Object) this.field_a.a(-14));
                    continue L2;
                  }
                }
              }
            }
            var4.field_u = param0.a(param2, (byte) 114);
            if (param1 < -61) {
              var4.field_o = true;
              var4.field_r = false;
              stackIn_18_0 = (tg) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_16_0 = (tg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("ef.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            int var3_int = 0;
            Exception var3 = null;
            RuntimeException var3_ref = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            StringBuilder stackIn_9_1 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var3_int = -20 / ((param2 - 8) / 58);
                  var4 = new java.net.URL(param1.getCodeBase(), param0);
                  var4 = wh.a(127, var4, param1);
                  ag.a(true, var4.toString(), 64, param1);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                var3.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var3_ref);

                stackIn_6_1 = new StringBuilder().append("ef.B(");

                if (param0 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              L2: {


                stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ef(ka param0) {
        bk var2 = null;
        this.field_a = new jh();
        this.field_h = 0;
        this.field_c = false;
        try {
            var2 = param0.a(5, 118, (Runnable) (this));
            while (var2.field_b == 0) {
                uc.a(-119, 10L);
            }
            if (var2.field_b == 2) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ef.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new s(0);
        field_f = new String[255];
    }
}
