/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr {
    static String field_b;
    static String field_a;

    final static void c(int param0) {
        if (param0 != -3) {
            return;
        }
        String var2 = (String) null;
        ui.a(ld.field_a, (byte) 111, (String) null);
    }

    final static int a(int param0, int param1) {
        int[] var2 = null;
        int[] var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2) {
          L0: {
            field_b = (String) null;
            var3 = na.field_zb[rm.field_C];
            var2 = var3;
            if (param1 >= var3.length) {
              stackOut_7_0 = 100;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = var3[param1];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            var3 = na.field_zb[rm.field_C];
            var2 = var3;
            if (param1 >= var3.length) {
              stackOut_3_0 = 100;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = var3[param1];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -117) {
            field_b = (String) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                    param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
                    if (param1 == 23607) {
                      break L1;
                    } else {
                      field_a = (String) null;
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) (var2_ref2);
                stackOut_5_1 = new StringBuilder().append("vr.C(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L2;
                } else {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L2;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        he var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              hw.field_k = false;
              uv.field_i = null;
              ow.field_b = null;
              if (rp.field_B == null) {
                break L1;
              } else {
                rp.field_B.b(param0 + 22999);
                rp.field_B = null;
                break L1;
              }
            }
            if (param0 == -2) {
              L2: {
                pq.field_N = null;
                if (kq.field_yb == null) {
                  break L2;
                } else {
                  kq.field_yb.b(param0 ^ -22997);
                  kq.field_yb = null;
                  break L2;
                }
              }
              L3: {
                sr.field_f = null;
                if (null != lw.field_d) {
                  lw.field_d.b(param0 ^ -22997);
                  lw.field_d = null;
                  break L3;
                } else {
                  break L3;
                }
              }
              pu.field_Eb = null;
              if (null != pq.field_N) {
                var3 = (he) ((Object) pq.field_N.b((byte) 72));
                L4: while (true) {
                  if (var3 == null) {
                    pq.field_N = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3.f(57);
                    var3 = (he) ((Object) pq.field_N.a(0));
                    continue L4;
                  }
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "vr.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        np.field_Jb.a(new aw(), 3);
        if (param0 > -114) {
            vr.a((byte) -74);
        }
    }

    final static boolean d(int param0) {
        int discarded$0 = 0;
        if (param0 != 1) {
            discarded$0 = vr.a(8, 93, (byte) -111);
            return true;
        }
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        Object var3 = null;
        String var5 = null;
        String var6 = null;
        if (null != cv.field_b[param1][param0]) {
          return -1;
        } else {
          L0: {
            var3 = null;
            if (0 != param1) {
              break L0;
            } else {
              var3 = "park";
              break L0;
            }
          }
          L1: {
            if (1 == param1) {
              var3 = "beach";
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-3 != (param1 ^ -1)) {
              break L2;
            } else {
              var3 = "street";
              break L2;
            }
          }
          var5 = (String) (var3) + "_surface" + param0;
          var6 = var5;
          if (param2 <= -48) {
            if (bo.field_Cb.a(false, var6)) {
              cv.field_b[param1][param0] = wa.a((byte) 113, var6, bo.field_Cb, "");
              if ((param1 ^ -1) == -2) {
                if (-4 != (param0 ^ -1)) {
                  return -1;
                } else {
                  nh.a(cv.field_b[param1][param0], 0.0, 1.6, 1.0);
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return bo.field_Cb.a(var6, -16248);
            }
          } else {
            vr.a(22);
            if (bo.field_Cb.a(false, var6)) {
              cv.field_b[param1][param0] = wa.a((byte) 113, var6, bo.field_Cb, "");
              if ((param1 ^ -1) == -2) {
                if (-4 != (param0 ^ -1)) {
                  return -1;
                } else {
                  nh.a(cv.field_b[param1][param0], 0.0, 1.6, 1.0);
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return bo.field_Cb.a(var6, -16248);
            }
          }
        }
    }

    final static void b(int param0) {
        mc.a(-106);
        if (param0 != 1) {
            field_b = (String) null;
        }
    }

    static {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Real-life threats";
    }
}
