/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static String field_c;
    static bd field_b;
    static ub field_e;
    static bd[] field_a;
    static volatile int field_d;

    final static void a(byte param0) {
        Object var2 = null;
        im.field_e.f((byte) 32);
        if (param0 >= -83) {
          L0: {
            var2 = null;
            dc.a((java.awt.Component) null, (byte) 101);
            if (hj.field_t == null) {
              hj.field_t = new pe(im.field_e, se.field_g);
              break L0;
            } else {
              break L0;
            }
          }
          im.field_e.c((ag) (Object) hj.field_t, 108);
          return;
        } else {
          L1: {
            if (hj.field_t == null) {
              hj.field_t = new pe(im.field_e, se.field_g);
              break L1;
            } else {
              break L1;
            }
          }
          im.field_e.c((ag) (Object) hj.field_t, 108);
          return;
        }
    }

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (tk.field_e >= 0) {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (75 <= tk.field_e) {
              break L0;
            } else {
              var5 = (tk.field_e << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (tk.field_e <= 200) {
              break L1;
            } else {
              var5 = (-tk.field_e + 250 << 8) / 50;
              break L1;
            }
          }
          sb.a(il.field_f, -120);
          ge.b();
          si.d();
          uc.b(-45);
          if (var5 < 256) {
            si.a(0, 0, si.field_e, si.field_k, 0, -var5 + 256);
            int discarded$2 = 0;
            eh.b();
            if (150 > tk.field_e) {
              il.field_f.f(var3, var4);
              var6 = tk.field_e - 125;
              if (var6 <= 0) {
                return;
              } else {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 < 30) {
                      ti.field_c.c(var3, var4, 256);
                      return;
                    } else {
                      var7 = (-(256 * var6) + 12800) / 20;
                      ti.field_c.c(var3, var4, var7);
                      return;
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ti.field_c.c(var3, var4, var7);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ob.field_C.b(var3 - -15, 10 + var4, var5);
              var6 = tk.field_e - 125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 < 30) {
                      ti.field_c.c(var3, var4, 256);
                      return;
                    } else {
                      var7 = (-(256 * var6) + 12800) / 20;
                      ti.field_c.c(var3, var4, var7);
                      return;
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ti.field_c.c(var3, var4, var7);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            int discarded$3 = 0;
            eh.b();
            if (150 > tk.field_e) {
              il.field_f.f(var3, var4);
              var6 = tk.field_e - 125;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 >= 30) {
                      var7 = (-(256 * var6) + 12800) / 20;
                      ti.field_c.c(var3, var4, var7);
                      return;
                    } else {
                      ti.field_c.c(var3, var4, 256);
                      return;
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ti.field_c.c(var3, var4, var7);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L2: {
                ob.field_C.b(var3 - -15, 10 + var4, var5);
                var6 = tk.field_e - 125;
                if (var6 <= 0) {
                  break L2;
                } else {
                  if (var6 < 50) {
                    if (20 <= var6) {
                      if (var6 < 30) {
                        ti.field_c.c(var3, var4, 256);
                        break L2;
                      } else {
                        var7 = (-(256 * var6) + 12800) / 20;
                        ti.field_c.c(var3, var4, var7);
                        break L2;
                      }
                    } else {
                      var7 = var6 * 256 / 20;
                      ti.field_c.c(var3, var4, var7);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
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
            var2_int = param1.length;
            var3 = new byte[var2_int];
            kf.a(param1, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("dc.F(").append(97).append(',');
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
          throw wg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) jc.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) jc.field_b);
        if (param1 != 48) {
            return;
        }
        try {
            param0.addFocusListener((java.awt.event.FocusListener) (Object) jc.field_b);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "dc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                if (param0 >= 60) {
                  param1.getAppletContext().showDocument(nj.a(param1, true, var2), "_top");
                  return;
                } else {
                  return;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("dc.A(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L0;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L0;
                }
              }
              throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_e = new ub();
        field_d = 0;
        field_a = new bd[222];
    }
}
