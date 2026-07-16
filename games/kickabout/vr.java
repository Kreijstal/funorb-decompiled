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
        Object var2 = null;
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
            field_b = null;
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
            field_b = null;
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
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
                if (param1 == 23607) {
                  break L0;
                } else {
                  field_a = null;
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        he var3 = null;
        var2 = Kickabout.field_G;
        hw.field_k = false;
        uv.field_i = null;
        ow.field_b = null;
        if (rp.field_B == null) {
          if (param0 == -2) {
            pq.field_N = null;
            if (kq.field_yb == null) {
              L0: {
                sr.field_f = null;
                if (null != lw.field_d) {
                  lw.field_d.b(param0 ^ -22997);
                  lw.field_d = null;
                  break L0;
                } else {
                  break L0;
                }
              }
              pu.field_Eb = null;
              if (null != pq.field_N) {
                var3 = (he) (Object) pq.field_N.b((byte) 72);
                L1: while (true) {
                  if (var3 == null) {
                    pq.field_N = null;
                    return;
                  } else {
                    var3.f(57);
                    var3 = (he) (Object) pq.field_N.a(0);
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              L2: {
                kq.field_yb.b(param0 ^ -22997);
                kq.field_yb = null;
                sr.field_f = null;
                if (null != lw.field_d) {
                  lw.field_d.b(param0 ^ -22997);
                  lw.field_d = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              pu.field_Eb = null;
              if (null != pq.field_N) {
                var3 = (he) (Object) pq.field_N.b((byte) 72);
                L3: while (true) {
                  if (var3 == null) {
                    pq.field_N = null;
                    return;
                  } else {
                    var3.f(57);
                    var3 = (he) (Object) pq.field_N.a(0);
                    continue L3;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          rp.field_B.b(param0 + 22999);
          rp.field_B = null;
          if (param0 == -2) {
            pq.field_N = null;
            if (kq.field_yb != null) {
              L4: {
                kq.field_yb.b(param0 ^ -22997);
                kq.field_yb = null;
                sr.field_f = null;
                if (null != lw.field_d) {
                  lw.field_d.b(param0 ^ -22997);
                  lw.field_d = null;
                  break L4;
                } else {
                  break L4;
                }
              }
              pu.field_Eb = null;
              if (null != pq.field_N) {
                var3 = (he) (Object) pq.field_N.b((byte) 72);
                L5: while (true) {
                  if (var3 == null) {
                    pq.field_N = null;
                    return;
                  } else {
                    var3.f(57);
                    var3 = (he) (Object) pq.field_N.a(0);
                    continue L5;
                  }
                }
              } else {
                return;
              }
            } else {
              L6: {
                sr.field_f = null;
                if (null != lw.field_d) {
                  lw.field_d.b(param0 ^ -22997);
                  lw.field_d = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              pu.field_Eb = null;
              if (null != pq.field_N) {
                var3 = (he) (Object) pq.field_N.b((byte) 72);
                L7: while (true) {
                  if (var3 == null) {
                    pq.field_N = null;
                    return;
                  } else {
                    var3.f(57);
                    var3 = (he) (Object) pq.field_N.a(0);
                    continue L7;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void b(byte param0) {
        np.field_Jb.a((gn) (Object) new aw(), 3);
        if (param0 > -114) {
            vr.a((byte) -74);
        }
    }

    final static boolean d(int param0) {
        if (param0 != 1) {
            int discarded$0 = vr.a(8, 93, (byte) -111);
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
              var3 = (Object) (Object) "park";
              break L0;
            }
          }
          L1: {
            if (1 == param1) {
              var3 = (Object) (Object) "beach";
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-3 != (param1 ^ -1)) {
              break L2;
            } else {
              var3 = (Object) (Object) "street";
              break L2;
            }
          }
          var5 = var3 + "_surface" + param0;
          var6 = var5;
          if (param2 <= -48) {
            if (bo.field_Cb.a(false, var6)) {
              cv.field_b[param1][param0] = wa.a((byte) 113, var6, bo.field_Cb, "");
              if ((param1 ^ -1) == -2) {
                if (-4 == (param0 ^ -1)) {
                  nh.a(cv.field_b[param1][param0], 0.0, 1.6, 1.0);
                  return -1;
                } else {
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
                if (-4 == (param0 ^ -1)) {
                  nh.a(cv.field_b[param1][param0], 0.0, 1.6, 1.0);
                  return -1;
                } else {
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
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Real-life threats";
    }
}
