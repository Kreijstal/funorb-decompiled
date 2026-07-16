/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static double field_a;
    static vn[] field_b;

    final static void a(byte param0, String param1) {
        pa.a(param1, false);
        if (param0 != 2) {
            vn[] discarded$0 = ca.a(11, -83, 78, 21, -117, 67, 107, -114, 29);
        }
        ti.a(md.field_wb, false, false);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        CharSequence var3 = null;
        L0: {
          if (param0 > 63) {
            break L0;
          } else {
            field_a = 0.4810407079298756;
            break L0;
          }
        }
        L1: {
          var2 = param1.getParameter("username");
          if (var2 == null) {
            break L1;
          } else {
            var3 = (CharSequence) (Object) var2;
            if (-1L == (sd.a(-66, var3) ^ -1L)) {
              break L1;
            } else {
              return;
            }
          }
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
        var9 = param3 + param5 + param2;
        var10 = new vn[]{new vn(var9, var9), new vn(param6, var9), new vn(var9, var9), new vn(var9, param6), new vn(64, 64), new vn(var9, param6), new vn(var9, var9), new vn(param6, var9), new vn(var9, var9)};
        var11 = 73 % ((-38 - param8) / 56);
        var12_ref_vn__ = var10;
        var13 = 0;
        L0: while (true) {
          if (var13 >= var12_ref_vn__.length) {
            var12 = 0;
            L1: while (true) {
              if (param2 <= var12) {
                var12 = 0;
                L2: while (true) {
                  if (param2 <= var12) {
                    var12 = 0;
                    L3: while (true) {
                      if (param6 <= var12) {
                        var12 = 0;
                        L4: while (true) {
                          if (var12 >= param6 >> -1969225855) {
                            return var10;
                          } else {
                            var13 = 0;
                            L5: while (true) {
                              if (param3 <= var13) {
                                var12++;
                                continue L4;
                              } else {
                                var10[1].field_z[param6 * (var9 - var13 + -1) + var12] = param4;
                                var10[3].field_z[-1 + (var9 - (var13 - var9 * var12))] = param4;
                                var10[7].field_z[param6 * var13 + var12] = param4;
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
                          if (param2 <= var13) {
                            var12++;
                            continue L3;
                          } else {
                            var10[7].field_z[var12 + param6 * (var9 - (var13 + 1))] = param0;
                            var10[5].field_z[var12 * var9 + (-var13 + -1) + var9] = param0;
                            var10[1].field_z[var12 + param6 * var13] = param1;
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
                      if (var13 >= var9) {
                        var12++;
                        continue L2;
                      } else {
                        var10[0].field_z[var13 - -(var9 * var12)] = param1;
                        var10[0].field_z[var13 * var9 + var12] = param1;
                        if (var13 < -var12 + var9) {
                          var10[2].field_z[var13 + var9 * var12] = param1;
                          var10[6].field_z[var9 * var13 - -var12] = param1;
                          var13++;
                          continue L7;
                        } else {
                          var13++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var13 = 0;
                L8: while (true) {
                  if (var9 <= var13) {
                    var12++;
                    continue L1;
                  } else {
                    var10[6].field_z[var13 + var9 * (-1 + var9 + -var12)] = param0;
                    var10[8].field_z[var13 + (-var12 + (var9 - 1)) * var9] = param0;
                    var10[2].field_z[-var12 + -1 + (var9 + var13 * var9)] = param0;
                    var10[8].field_z[var13 * var9 - var12 - (1 + -var9)] = param0;
                    var13++;
                    continue L8;
                  }
                }
              }
            }
          } else {
            var14 = var12_ref_vn__[var13];
            var15 = 0;
            L9: while (true) {
              if (var15 >= var14.field_z.length) {
                var13++;
                continue L0;
              } else {
                var14.field_z[var15] = param7;
                var15++;
                continue L9;
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1) {
        int var3 = ZombieDawn.field_J;
        wg var4 = (wg) (Object) jb.field_b.b((byte) 26);
        while (var4 != null) {
            nd.a(param0, 1, var4);
            var4 = (wg) (Object) jb.field_b.a(false);
        }
        lo var5 = (lo) (Object) c.field_b.b((byte) 26);
        while (var5 != null) {
            ga.a(param0, 0, var5);
            var5 = (lo) (Object) c.field_b.a(false);
        }
        if (param1 > -95) {
            ca.a(33, (byte) -47);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = null;
        }
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
              if (-2 == (param2 ^ -1)) {
                ph.a((byte) 106, w.field_a[0]);
                break L1;
              } else {
                if (4 != param2) {
                  if (param2 != 2) {
                    break L1;
                  } else {
                    if (-5 != (ke.field_c.field_d ^ -1)) {
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
            if ((ke.field_c.field_d ^ -1) == -1) {
              if ((param2 ^ -1) == -3) {
                qc.b(1400888196);
                break L0;
              } else {
                hm.a(9);
                break L0;
              }
            } else {
              if (-3 != (ke.field_c.field_d ^ -1)) {
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
              if (-2 != (ke.field_c.field_d ^ -1)) {
                break L6;
              } else {
                if ((sg.field_eb.field_d ^ -1) == -15) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if ((ke.field_c.field_d ^ -1) != -15) {
              break L4;
            } else {
              if ((sg.field_eb.field_d ^ -1) == -2) {
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
          if ((sg.field_eb.field_d ^ -1) > -1) {
            break L7;
          } else {
            sg.field_eb.a((byte) 74, 0, param0);
            break L7;
          }
        }
        L8: {
          if (-2 != (sg.field_eb.field_d ^ -1)) {
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
        L9: {
          if (param1) {
            break L9;
          } else {
            field_a = -0.24351234703539312;
            break L9;
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
