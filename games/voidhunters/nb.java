/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends rqa {
    static String field_o;

    nb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
            si.a(195, 62, param0[0].a(23));
            if (param1 < -119) {
              stackOut_3_0 = new nc("void");
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("nb.A(");
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean b(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if ((qmb.field_q ^ -1) > -11) {
                break L1;
              } else {
                if (cgb.field_a) {
                  break L1;
                } else {
                  if (wh.g(-115)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        lta var2 = null;
        int var3 = 0;
        wfb var3_ref_wfb = null;
        Exception var4_ref_Exception = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        String var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        String var20 = null;
        wfb var22 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            og.field_r.GA(0);
            if (param0 == 102) {
              L1: {
                var16 = "Component editor";
                pm.a(ip.field_p.width / 2 - (tea.a(1, var16, param0 ^ 13905) >> 1889528737), -1, 30, var16, 1, 16756480, (byte) -94);
                var2 = new lta();
                var2.field_b = de.field_o;
                var2.field_c = gt.field_p;
                var2.field_a = ql.field_o;
                if (fe.field_p == -1) {
                  var3 = 4 * -fnb.field_b;
                  var4 = fnb.field_b / 2;
                  var30 = uca.a(var4, (byte) 9, new int[]{3, 4, 6, 8, 6, 4, 6, 8, 6, 4, 6, 8, 9, 10, 0, 2, 0, 10, 0, 2, 0, 10, 0}, var3);
                  var22 = new wfb(var30, 0, 0);
                  ta.a(var30, param0 + 12, var22);
                  var22.a(102, 15);
                  fr.a(var2, var22, false);
                  break L1;
                } else {
                  L2: {
                    var3_ref_wfb = hab.field_g[fe.field_p];
                    if (var3_ref_wfb != null) {
                      fr.a(var2, var3_ref_wfb, false);
                      try {
                        L3: {
                          L4: {
                            if (au.field_c != 1) {
                              if (au.field_c == 2) {
                                L5: {
                                  var4 = 0;
                                  if (var3_ref_wfb.field_k) {
                                    var4 = -2;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                var5 = 0;
                                L6: while (true) {
                                  if (uob.field_g.length <= var5) {
                                    break L4;
                                  } else {
                                    L7: {
                                      var25 = uob.field_g[var5];
                                      var19 = var25;
                                      var6 = var19;
                                      if (var5 != uob.field_g.length + -1) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        break L7;
                                      } else {
                                        stackOut_27_0 = 1;
                                        stackIn_29_0 = stackOut_27_0;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      var7 = stackIn_29_0;
                                      var8 = 16777215;
                                      if (var7 == 0) {
                                        var8 = 11184810;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var9 = 0;
                                    L9: while (true) {
                                      if (var9 >= var4 + var25.length) {
                                        L10: {
                                          if (var7 == 0) {
                                            break L10;
                                          } else {
                                            var9 = 0;
                                            L11: while (true) {
                                              if (var9 >= var25.length) {
                                                break L10;
                                              } else {
                                                var10 = var25[var9];
                                                var11 = var6[var9 + 1];
                                                kq.a(2.0f, (byte) 64, var2.b(true, var11), 16711935, var2.a(var10, (byte) 126));
                                                var9 += 2;
                                                continue L11;
                                              }
                                            }
                                          }
                                        }
                                        var5++;
                                        continue L6;
                                      } else {
                                        L12: {
                                          var10 = var25[var9];
                                          var11 = var6[var9 + 1];
                                          var12 = var6[(var9 + 2) % var25.length];
                                          var13 = var6[(3 + var9) % var25.length];
                                          c.a(var2.b(true, var13), var2.a(var12, (byte) 121), var2.a(var10, (byte) 121), var2.b(true, var11), -16777216, var8);
                                          if (!var3_ref_wfb.field_k) {
                                            break L12;
                                          } else {
                                            c.a(var2.b(true, -var13), var2.a(var12, (byte) 123), var2.a(var10, (byte) 126), var2.b(true, -var11), -16777216, var8);
                                            break L12;
                                          }
                                        }
                                        var9 += 2;
                                        continue L9;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              var4 = 0;
                              L13: while (true) {
                                if (var4 >= hw.field_d.length) {
                                  break L4;
                                } else {
                                  var29 = hw.field_d[var4];
                                  if (var29.length > 0) {
                                    var15 = new int[var29.length << 1879655585];
                                    var24 = var15;
                                    var18 = var24;
                                    var6 = var18;
                                    var7 = 0;
                                    L14: while (true) {
                                      if (var7 >= var29.length) {
                                        var7 = 0;
                                        L15: while (true) {
                                          if (var7 >= var24.length) {
                                            rj.a(og.field_r, var24, -16777216 | (1 + var4) * 16436957);
                                            var4++;
                                            continue L13;
                                          } else {
                                            var8 = var24[var7];
                                            var9 = var6[var7 - -1];
                                            var10 = var6[(var7 + 2) % var24.length];
                                            var11 = var6[(3 + var7) % var24.length];
                                            c.a(var11, var10, var8, var9, -16777216, 16711935);
                                            var7 += 2;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        var15[var7 << 1445470721] = var2.a(var3_ref_wfb.field_v[var29[var7] << 1529099169], (byte) 119);
                                        var15[(var7 << 2055918977) - -1] = var2.b(true, var3_ref_wfb.field_v[1 + (var29[var7] << 2057449665)]);
                                        var7++;
                                        continue L14;
                                      }
                                    }
                                  } else {
                                    var4++;
                                    continue L13;
                                  }
                                }
                              }
                            }
                          }
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L16: {
                          var4_ref_Exception = (Exception) (Object) decompiledCaughtException;
                          var4_ref_Exception.printStackTrace();
                          break L16;
                        }
                      }
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var20 = obb.field_o[fe.field_p];
                  cka.a(-1, var20, 16763904, 80, 320 + -(kga.a(120, var20) / 2), param0 + 4164);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "nb.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            nb.e((byte) 14);
        }
        field_o = null;
    }

    static {
        field_o = "CHAT";
    }
}
