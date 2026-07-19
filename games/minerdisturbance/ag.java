/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_d;
    static boolean field_c;
    static ea[] field_a;
    static ta field_b;

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = MinerDisturbance.field_ab;
        if (!th.field_b[param1][cm.field_o]) {
          return;
        } else {
          if (param0) {
            L0: {
              if (ke.field_X[param1]) {
                break L0;
              } else {
                if (!ke.field_V) {
                  break L0;
                } else {
                  if (!sc.field_b) {
                    break L0;
                  } else {
                    if (d.a(param1, cm.field_o, (byte) 68)) {
                      break L0;
                    } else {
                      L1: {
                        if (0 > param3) {
                          break L1;
                        } else {
                          if (param2 < 0) {
                            break L1;
                          } else {
                            if (li.field_c <= 0) {
                              break L1;
                            } else {
                              if ((db.field_d ^ -1) >= -1) {
                                break L1;
                              } else {
                                L2: {
                                  if (-1 < (-li.field_c + param3 ^ -1)) {
                                    break L2;
                                  } else {
                                    if (608 < -li.field_c + param3) {
                                      break L2;
                                    } else {
                                      L3: {
                                        if ((-db.field_d + param2 ^ -1) > -1) {
                                          break L3;
                                        } else {
                                          if (-db.field_d + param2 > 448) {
                                            break L3;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                      return;
                                    }
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                      }
                      ke.field_X[param1] = true;
                      if (!fi.field_a[param1]) {
                        L4: {
                          if (!ok.field_b.e((byte) 119)) {
                            break L4;
                          } else {
                            if (!bl.g(0)) {
                              break L4;
                            } else {
                              if (-151 <= (ja.field_u ^ -1)) {
                                break L4;
                              } else {
                                ok.field_b.a((byte) -93, new tm(param1, param3, param2, false));
                                ra.a(param1, (byte) -59);
                                ja.field_u = 0;
                                break L0;
                              }
                            }
                          }
                        }
                        ke.field_X[param1] = false;
                        break L0;
                      } else {
                        ec.field_c.a((byte) -93, new tm(param1, param3, param2, true));
                        ra.a(param1, (byte) -59);
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        String discarded$0 = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = ag.a((java.applet.Applet) null, false);
        }
    }

    final static void a(hf param0, int param1, int param2) {
        ld var6 = null;
        String discarded$0 = null;
        int var4 = 0;
        int discarded$1 = 0;
        try {
            var6 = sn.field_c;
            if (param2 >= -107) {
                java.applet.Applet var5 = (java.applet.Applet) null;
                discarded$0 = ag.a((java.applet.Applet) null, false);
            }
            var6.d((byte) -46, param1);
            var6.field_o = var6.field_o + 1;
            var4 = var6.field_o;
            var6.c(1, 25564);
            if (null == param0.field_n) {
                var6.c(0, 25564);
            } else {
                var6.c(param0.field_n.length, 25564);
                var6.a(0, param0.field_n.length, true, param0.field_n);
            }
            discarded$1 = var6.e(74, var4);
            var6.field_o = var6.field_o - 4;
            param0.field_o = var6.b((byte) 51);
            var6.g(-1, -var4 + var6.field_o);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "ag.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, boolean param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            String stackIn_14_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            String stackOut_13_0 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            var8 = MinerDisturbance.field_ab;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (lk.a((byte) 18, "getcookies", param0));
                    var5 = h.a(';', param1, var4);
                    var6 = 0;
                    L2: while (true) {
                      if (var6 >= var5.length) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L3;
                          } else {
                            if (var5[var6].substring(0, var7).trim().equals(var3)) {
                              stackOut_6_0 = var5[var6].substring(1 + var7).trim();
                              stackIn_7_0 = stackOut_6_0;
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null != nj.field_a) {
                    stackOut_13_0 = nj.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_15_0 = (RuntimeException) (var2_ref);
                stackOut_15_1 = new StringBuilder().append("ag.A(");
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param0 == null) {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L5;
                } else {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "{...}";
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L5;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_14_0;
            } else {
              return stackIn_7_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = false;
        field_b = new ta();
    }
}
