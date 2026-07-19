/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class oj {
    static String field_a;
    static java.awt.Frame field_c;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int[] param12, int param13, int param14, int param15, int param16) {
        ke discarded$1 = null;
        RuntimeException var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var42 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param14 < 0) {
                break L1;
              } else {
                if (param11 >= qg.field_e) {
                  break L1;
                } else {
                  L2: {
                    if (0 <= param10) {
                      break L2;
                    } else {
                      if (param4 >= 0) {
                        break L2;
                      } else {
                        if (param5 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (qg.field_a > param10) {
                      break L3;
                    } else {
                      if (qg.field_a > param4) {
                        break L3;
                      } else {
                        if (qg.field_a > param5) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param7 < -32) {
                      break L4;
                    } else {
                      discarded$1 = oj.a(false, 33);
                      break L4;
                    }
                  }
                  L5: {
                    var34 = param14 + -param11;
                    if (param11 == param3) {
                      L6: {
                        if (param11 != param14) {
                          var35 = -param3 + param14;
                          if (param4 <= param10) {
                            var28 = (param9 + -param2 << 16) / var34;
                            var27 = (param9 + -param6 << 16) / var35;
                            var31 = (-param1 + param13 << 16) / var35;
                            var21 = param8 << 16;
                            var29 = param1 << 16;
                            var22 = param15 << 16;
                            var24 = (param0 + -param15 << 16) / var34;
                            var20 = (-param10 + param5 << 16) / var34;
                            var23 = (param0 - param8 << 16) / var35;
                            var26 = param2 << 16;
                            var32 = (param13 + -param16 << 16) / var34;
                            var30 = param16 << 16;
                            var17_int = param4 << 16;
                            var25 = param6 << 16;
                            var19 = (param5 + -param4 << 16) / var35;
                            var18 = param10 << 16;
                            break L6;
                          } else {
                            var24 = (param0 + -param8 << 16) / var35;
                            var25 = param2 << 16;
                            var18 = param4 << 16;
                            var22 = param8 << 16;
                            var31 = (-param16 + param13 << 16) / var34;
                            var27 = (param9 + -param2 << 16) / var34;
                            var17_int = param10 << 16;
                            var28 = (param9 - param6 << 16) / var35;
                            var23 = (param0 + -param15 << 16) / var34;
                            var19 = (-param10 + param5 << 16) / var34;
                            var26 = param6 << 16;
                            var20 = (param5 + -param4 << 16) / var35;
                            var21 = param15 << 16;
                            var30 = param1 << 16;
                            var32 = (-param1 + param13 << 16) / var35;
                            var29 = param16 << 16;
                            break L6;
                          }
                        } else {
                          var31 = 0;
                          var32 = 0;
                          var29 = param16;
                          var30 = param1;
                          var23 = 0;
                          var26 = param6;
                          var22 = param8;
                          var18 = param4 << 16;
                          var21 = param15;
                          var25 = param2;
                          var17_int = param10 << 16;
                          var24 = 0;
                          var20 = 0;
                          var27 = 0;
                          var28 = 0;
                          var19 = 0;
                          break L6;
                        }
                      }
                      L7: {
                        if (param11 >= 0) {
                          break L7;
                        } else {
                          param11 = Math.min(-param11, param3 + -param11);
                          var26 = var26 + param11 * var28;
                          var30 = var30 + param11 * var32;
                          var18 = var18 + param11 * var20;
                          var17_int = var17_int + param11 * var19;
                          var21 = var21 + var23 * param11;
                          var22 = var22 + var24 * param11;
                          var29 = var29 + param11 * var31;
                          var25 = var25 + param11 * var27;
                          param11 = 0;
                          break L7;
                        }
                      }
                      var33 = 0;
                      break L5;
                    } else {
                      L8: {
                        var18 = param10 << 16;
                        var17_int = param10 << 16;
                        var30 = param16 << 16;
                        var29 = param16 << 16;
                        var22 = param15 << 16;
                        var21 = param15 << 16;
                        var26 = param2 << 16;
                        var25 = param2 << 16;
                        var35 = -param11 + param3;
                        var19 = (param4 + -param10 << 16) / var35;
                        var20 = (param5 - param10 << 16) / var34;
                        if (var20 > var19) {
                          var33 = 0;
                          var27 = (-param2 + param6 << 16) / var35;
                          var32 = (param13 - param16 << 16) / var34;
                          var24 = (-param15 + param0 << 16) / var34;
                          var28 = (-param2 + param9 << 16) / var34;
                          var31 = (-param16 + param1 << 16) / var35;
                          var23 = (param8 + -param15 << 16) / var35;
                          break L8;
                        } else {
                          var36 = var19;
                          var19 = var20;
                          var20 = var36;
                          var27 = (-param2 + param9 << 16) / var34;
                          var32 = (-param16 + param1 << 16) / var35;
                          var31 = (param13 - param16 << 16) / var34;
                          var33 = 1;
                          var28 = (param6 + -param2 << 16) / var35;
                          var23 = (param0 - param15 << 16) / var34;
                          var24 = (-param15 + param8 << 16) / var35;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (param11 < 0) {
                            if (param3 >= 0) {
                              param11 = -param11;
                              var25 = var25 + param11 * var27;
                              var26 = var26 + var28 * param11;
                              var22 = var22 + var24 * param11;
                              var18 = var18 + var20 * param11;
                              var17_int = var17_int + param11 * var19;
                              var30 = var30 + param11 * var32;
                              var29 = var29 + param11 * var31;
                              var21 = var21 + var23 * param11;
                              param11 = 0;
                              break L10;
                            } else {
                              param11 = param3 - param11;
                              var26 = var26 + var28 * param11;
                              var17_int = var17_int + var19 * param11;
                              var29 = var29 + var31 * param11;
                              var30 = var30 + var32 * param11;
                              var21 = var21 + param11 * var23;
                              var22 = var22 + param11 * var24;
                              var25 = var25 + var27 * param11;
                              var18 = var18 + param11 * var20;
                              param11 = param3;
                              break L9;
                            }
                          } else {
                            break L10;
                          }
                        }
                        var36 = qg.field_d[param11];
                        L11: while (true) {
                          if (param3 <= param11) {
                            break L9;
                          } else {
                            L12: {
                              var37 = var17_int >> 16;
                              if (qg.field_a > var37) {
                                var38 = -(var17_int >> 16) + (var18 >> 16);
                                if (var38 != 0) {
                                  L13: {
                                    var39 = (var22 + -var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (-var29 + var30) / var38;
                                    if (var37 - -var38 >= qg.field_a) {
                                      var38 = -1 + (qg.field_a - var37);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  if (var37 >= 0) {
                                    ve.a(var25, var37 - -var36, var40, var39, var21, var38, 9, param12, var29, var41);
                                    break L12;
                                  } else {
                                    ve.a(var25 + -(var37 * var40), var36, var40, var39, var21 + -(var37 * var39), var38 - -var37, 9, param12, var29 + -(var37 * var41), var41);
                                    break L12;
                                  }
                                } else {
                                  if (var37 < 0) {
                                    break L12;
                                  } else {
                                    if (var37 < qg.field_a) {
                                      ve.a(var25, var37 + var36, 0, 0, var21, var38, 9, param12, var29, 0);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            param11++;
                            if (param11 < qg.field_e) {
                              var18 = var18 + var20;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var22 = var22 + var24;
                              var36 = var36 + hk.field_j;
                              var17_int = var17_int + var19;
                              var25 = var25 + var27;
                              var29 = var29 + var31;
                              continue L11;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var36 = -param3 + param14;
                      if (var36 == 0) {
                        var23 = 0;
                        var19 = 0;
                        var32 = 0;
                        var20 = 0;
                        var31 = 0;
                        var24 = 0;
                        var27 = 0;
                        var28 = 0;
                        break L5;
                      } else {
                        L14: {
                          var37 = param5 << 16;
                          var38 = param0 << 16;
                          var39 = param9 << 16;
                          var40 = param13 << 16;
                          if (var33 == 0) {
                            var21 = param8 << 16;
                            var25 = param6 << 16;
                            var29 = param1 << 16;
                            var17_int = param4 << 16;
                            break L14;
                          } else {
                            var26 = param6 << 16;
                            var22 = param8 << 16;
                            var30 = param1 << 16;
                            var18 = param4 << 16;
                            break L14;
                          }
                        }
                        var31 = (-var29 + var40) / var36;
                        var23 = (var38 + -var21) / var36;
                        var27 = (-var25 + var39) / var36;
                        var20 = (-var18 + var37) / var36;
                        var24 = (-var22 + var38) / var36;
                        var32 = (-var30 + var40) / var36;
                        var19 = (var37 + -var17_int) / var36;
                        var28 = (var39 + -var26) / var36;
                        break L5;
                      }
                    }
                  }
                  L15: {
                    if (param11 < 0) {
                      param11 = -param11;
                      var25 = var25 + param11 * var27;
                      var21 = var21 + param11 * var23;
                      var18 = var18 + param11 * var20;
                      var17_int = var17_int + param11 * var19;
                      var30 = var30 + var32 * param11;
                      var29 = var29 + var31 * param11;
                      var26 = var26 + param11 * var28;
                      var22 = var22 + var24 * param11;
                      param11 = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var35 = qg.field_d[param11];
                  L16: while (true) {
                    if (param11 >= param14) {
                      break L0;
                    } else {
                      L17: {
                        var36 = var17_int >> 16;
                        if (qg.field_a <= var36) {
                          break L17;
                        } else {
                          var37 = (var18 >> 16) - (var17_int >> 16);
                          if (var37 == 0) {
                            if (var36 < 0) {
                              break L17;
                            } else {
                              if (qg.field_a <= var36) {
                                break L17;
                              } else {
                                ve.a(var25, var36 + var35, 0, 0, var21, var37, 9, param12, var29, 0);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              var38 = (-var21 + var22) / var37;
                              var39 = (var26 + -var25) / var37;
                              var40 = (-var29 + var30) / var37;
                              if (qg.field_a > var37 + var36) {
                                break L18;
                              } else {
                                var37 = -var36 + qg.field_a - 1;
                                break L18;
                              }
                            }
                            if (var36 >= 0) {
                              ve.a(var25, var35 + var36, var39, var38, var21, var37, 9, param12, var29, var40);
                              break L17;
                            } else {
                              ve.a(var25 + -(var39 * var36), var35, var39, var38, -(var36 * var38) + var21, var37 + var36, 9, param12, var29 - var40 * var36, var40);
                              break L17;
                            }
                          }
                        }
                      }
                      param11++;
                      if (param11 >= qg.field_e) {
                        return;
                      } else {
                        var29 = var29 + var31;
                        var35 = var35 + hk.field_j;
                        var26 = var26 + var28;
                        var18 = var18 + var20;
                        var25 = var25 + var27;
                        var22 = var22 + var24;
                        var30 = var30 + var32;
                        var17_int = var17_int + var19;
                        var21 = var21 + var23;
                        continue L16;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var17 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var17);
            stackOut_78_1 = new StringBuilder().append("oj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param12 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L19;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L19;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param13 + ',' + param14 + ',' + param15 + ',' + param16 + ')');
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wl var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_31_0 = 0;
            if (4 > ta.field_k.field_j) {
              try {
                L0: {
                  L1: {
                    if (0 != hd.field_n) {
                      break L1;
                    } else {
                      d.field_f = bl.field_U.a(124, pe.field_b, cb.field_c);
                      hd.field_n = hd.field_n + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (hd.field_n == 1) {
                      if (2 == d.field_f.field_c) {
                        stackOut_14_0 = al.a(0, -1);
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0;
                      } else {
                        if (d.field_f.field_c != 1) {
                          break L2;
                        } else {
                          hd.field_n = hd.field_n + 1;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (hd.field_n != 2) {
                      break L3;
                    } else {
                      rk.field_L = new qk((java.net.Socket) (d.field_f.field_b), bl.field_U);
                      var2 = new wl(13);
                      gi.a(hh.field_f, fh.field_f, 17, var2, cn.field_U);
                      var2.a(true, 15);
                      var2.a(vm.field_w, false);
                      rk.field_L.a(0, 13, 1, var2.field_r);
                      hd.field_n = hd.field_n + 1;
                      me.field_E = 30000L + ik.a(4);
                      break L3;
                    }
                  }
                  L4: {
                    if (hd.field_n == 3) {
                      if (rk.field_L.b(0) > 0) {
                        var1_int = rk.field_L.c((byte) 8);
                        if (var1_int == 0) {
                          hd.field_n = hd.field_n + 1;
                          break L4;
                        } else {
                          stackOut_27_0 = al.a(0, var1_int);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        if (me.field_E >= ik.a(4)) {
                          break L4;
                        } else {
                          stackOut_24_0 = al.a(0, -2);
                          stackIn_25_0 = stackOut_24_0;
                          return stackIn_25_0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (hd.field_n != 4) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    ta.field_k.a(rk.field_L, (byte) -128, ta.field_f);
                    rk.field_L = null;
                    d.field_f = null;
                    hd.field_n = 0;
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return al.a(0, -3);
              }
              return stackIn_34_0;
            } else {
              if (ta.field_k.field_o == -1) {
                return 3;
              } else {
                if (ta.field_k.field_o != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static ke a(boolean param0, int param1) {
        ec var3 = null;
        ec var4 = null;
        ke var5 = null;
        ec var6 = null;
        ec var7 = null;
        ke var8 = null;
        ec var9 = null;
        L0: {
          var5 = new ke(3);
          var8 = var5;
          if (ph.n(-30146)) {
            var7 = new ec(20, qn.field_rb, a.field_t);
            var7.field_l = 320 - var7.field_n / 2;
            var7.field_m = 372;
            var8.a(var7, 112);
            break L0;
          } else {
            var5.a(new ec(23, vh.field_b[0], a.field_t), 117);
            var5.a(new ec(23, vh.field_b[1], a.field_t), param1 + -299);
            var5.field_f[1].field_n = 200;
            var6 = var5.field_f[0];
            var3 = var6;
            var6.field_n = 200;
            var5.field_f[0].field_l = 320 + (-var5.field_f[0].field_n + -10);
            var5.field_f[1].field_l = 330;
            var5.field_f[1].field_m = 372;
            var4 = var5.field_f[0];
            var4.field_m = 372;
            break L0;
          }
        }
        var9 = new ec(13, pc.field_f, a.field_t);
        var9.field_l = -(var9.field_n / 2) + 320;
        var9.field_m = param1;
        var8.a(var9, 102);
        var8.field_w = 70;
        var8.field_y = 500;
        var8.field_z = 76;
        var8.field_q = 272;
        var8.a(cj.field_c, param0, -129);
        return var8;
    }

    static {
        field_a = "Remove <%0> from ignore list";
        field_b = "To <%0>: ";
    }
}
