/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static double field_a;
    static vn[] field_b;

    final static void a(byte param0, String param1) {
        try {
            pa.a(param1, false);
            ti.a(md.field_wb, false, false);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ca.A(" + 2 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (sd.a(-66, var3) == 0L) {
                  break L1;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ca.F(").append(104).append(',');
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
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static vn[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        vn[] var10 = null;
        int var11 = 0;
        vn[] var12_ref_vn__ = null;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = ZombieDawn.field_J;
        var9 = 3;
        var10 = new vn[]{new vn(var9, var9), new vn(3, var9), new vn(var9, var9), new vn(var9, 3), new vn(64, 64), new vn(var9, 3), new vn(var9, var9), new vn(3, var9), new vn(var9, var9)};
        var11 = 0;
        var12_ref_vn__ = var10;
        var13 = 0;
        L0: while (true) {
          if (~var13 <= ~var12_ref_vn__.length) {
            var12 = 0;
            L1: while (true) {
              if (var12 >= 1) {
                var12 = 0;
                L2: while (true) {
                  if (var12 >= 1) {
                    var12 = 0;
                    L3: while (true) {
                      if (var12 >= 3) {
                        var12 = 0;
                        L4: while (true) {
                          if (var12 >= 1) {
                            return var10;
                          } else {
                            var13 = 0;
                            L5: while (true) {
                              if (1 <= var13) {
                                var12++;
                                continue L4;
                              } else {
                                var10[1].field_z[3 * (var9 - var13 + -1) + var12] = param4;
                                var10[3].field_z[-1 + (var9 - (var13 - var9 * var12))] = param4;
                                var10[7].field_z[3 * var13 + var12] = param4;
                                var10[5].field_z[var13 + var12 * var9] = param4;
                                var13++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var13 = 0;
                        L6: while (true) {
                          if (var13 >= 1) {
                            var12++;
                            continue L3;
                          } else {
                            var10[7].field_z[var12 + 3 * (var9 - (var13 + 1))] = param0;
                            var10[5].field_z[var12 * var9 + (-var13 + -1) + var9] = param0;
                            var10[1].field_z[var12 + 3 * var13] = param1;
                            var10[3].field_z[var9 * var12 + var13] = param1;
                            var13++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var13 = 0;
                    L7: while (true) {
                      if (~var13 <= ~var9) {
                        var12++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_z[var13 - -(var9 * var12)] = param1;
                          var10[0].field_z[var13 * var9 + var12] = param1;
                          if (~var13 <= ~(-var12 + var9)) {
                            break L8;
                          } else {
                            var10[2].field_z[var13 + var9 * var12] = param1;
                            var10[6].field_z[var9 * var13 - -var12] = param1;
                            break L8;
                          }
                        }
                        var13++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var13 = 0;
                L9: while (true) {
                  if (var9 <= var13) {
                    var12++;
                    continue L1;
                  } else {
                    var10[6].field_z[var13 + var9 * (-1 + var9 + -var12)] = param0;
                    var10[8].field_z[var13 + (-var12 + (var9 - 1)) * var9] = param0;
                    var10[2].field_z[-var12 + -1 + (var9 + var13 * var9)] = param0;
                    var10[8].field_z[var13 * var9 - var12 - (1 + -var9)] = param0;
                    var13++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var14 = var12_ref_vn__[var13];
            var15 = 0;
            L10: while (true) {
              if (var15 >= var14.field_z.length) {
                var13++;
                continue L0;
              } else {
                var14.field_z[var15] = param7;
                var15++;
                continue L10;
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        wg var4 = null;
        lo var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            var4 = (wg) (Object) jb.field_b.b((byte) 26);
            L1: while (true) {
              if (var4 == null) {
                var5 = (lo) (Object) c.field_b.b((byte) 26);
                L2: while (true) {
                  if (var5 == null) {
                    L3: {
                      if (param1 <= -95) {
                        break L3;
                      } else {
                        ca.a(33, (byte) -47);
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    ga.a(param0, 0, var5);
                    var5 = (lo) (Object) c.field_b.a(false);
                    continue L2;
                  }
                }
              } else {
                nd.a(param0, 1, var4);
                var4 = (wg) (Object) jb.field_b.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "ca.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (ng.field_e) {
            break L0;
          } else {
            L1: {
              if (param2 == 1) {
                ph.a((byte) 106, w.field_a[0]);
                break L1;
              } else {
                if (4 != param2) {
                  if (param2 != 2) {
                    break L1;
                  } else {
                    if (ke.field_c.field_d != 4) {
                      break L1;
                    } else {
                      vl.field_b.c(9091);
                      break L1;
                    }
                  }
                } else {
                  tp.a(109, true, w.field_a[9]);
                  break L1;
                }
              }
            }
            if (ke.field_c.field_d == 0) {
              if (param2 == 2) {
                qc.b(1400888196);
                break L0;
              } else {
                hm.a(9);
                break L0;
              }
            } else {
              if (ke.field_c.field_d != 2) {
                break L0;
              } else {
                if (param2 != 0) {
                  break L0;
                } else {
                  vj.c(74);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (param2 != 7) {
            break L2;
          } else {
            L3: {
              rf.field_d = nk.a(8, kg.field_g);
              if (0 == vl.field_b.field_G) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L3;
              } else {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L3;
              }
            }
            eh.field_z = stackIn_19_0 != 0;
            break L2;
          }
        }
        L4: {
          L5: {
            L6: {
              sg.field_eb = jj.c(param2, 96);
              po.field_xb = 0;
              if (ke.field_c.field_d != 1) {
                break L6;
              } else {
                if (sg.field_eb.field_d == 14) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (ke.field_c.field_d != 14) {
              break L4;
            } else {
              if (sg.field_eb.field_d == 1) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          po.field_xb = 31;
          break L4;
        }
        L7: {
          if (sg.field_eb.field_d < 0) {
            break L7;
          } else {
            sg.field_eb.a((byte) 74, 0, param0);
            break L7;
          }
        }
        L8: {
          if (sg.field_eb.field_d != 1) {
            break L8;
          } else {
            if (ke.field_c.field_d == 14) {
              break L8;
            } else {
              ip.c(-94);
              break L8;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
    }
}
