/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static ea field_c;
    static int field_b;
    static int[] field_a;
    static wh field_d;

    final static String[] a(char param0, boolean param1, String param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            var10 = (CharSequence) ((Object) param2);
            var3_int = fe.a((byte) 74, param0, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_a = (int[]) null;
                    break L2;
                  }
                }
                var4[var3_int] = param2.substring(var6);
                stackOut_9_0 = (String[]) (var4);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2.charAt(var8) == param0) {
                    incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param2.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("h.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            h.a(true);
        }
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        ri.a((byte) -112, bm.c(-125));
        if (param0) {
            h.b(true);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if ((param4 ^ -1) > -1) {
                break L1;
              } else {
                if (param1 >= dj.field_f) {
                  break L1;
                } else {
                  L2: {
                    if ((param8 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if ((param3 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if ((param5 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (dj.field_b > param8) {
                      break L3;
                    } else {
                      if (dj.field_b > param3) {
                        break L3;
                      } else {
                        if (param5 >= dj.field_b) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param4 - param1;
                    if (param1 != param0) {
                      L5: {
                        var10 = param8 << -1974104400;
                        var9_int = param8 << -1974104400;
                        var15 = param0 - param1;
                        var12 = (-param8 + param5 << 2102393680) / var14;
                        var11 = (-param8 + param3 << 2017400976) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L5;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param1 >= 0) {
                            break L7;
                          } else {
                            if (-1 < (param0 ^ -1)) {
                              param1 = -param1 + param0;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + param1 * var12;
                              param1 = param0;
                              break L6;
                            } else {
                              param1 = -param1;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + var12 * param1;
                              param1 = 0;
                              break L7;
                            }
                          }
                        }
                        var16 = dj.field_a[param1];
                        L8: while (true) {
                          if (param1 >= param0) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> -1688898736;
                              if (dj.field_b > var17) {
                                var18 = -(var9_int >> 33404176) + (var10 >> 1428959280);
                                if (var18 != 0) {
                                  L10: {
                                    if (dj.field_b <= var18 + var17) {
                                      var18 = -var17 + (dj.field_b - 1);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (0 > var17) {
                                    s.a(param2, -1, var16, param7, var17 + var18);
                                    break L9;
                                  } else {
                                    s.a(param2, -1, var17 - -var16, param7, var18);
                                    break L9;
                                  }
                                } else {
                                  if (var17 < 0) {
                                    break L9;
                                  } else {
                                    if (var17 >= dj.field_b) {
                                      break L9;
                                    } else {
                                      s.a(param2, param6 ^ 13611, var17 - -var16, param7, var18);
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param1++;
                            if (param1 < dj.field_f) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + eh.field_g;
                              continue L8;
                            } else {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                      }
                      var16 = -param0 + param4;
                      if (var16 != 0) {
                        L11: {
                          if (var13 != 0) {
                            var10 = param3 << -250482480;
                            break L11;
                          } else {
                            var9_int = param3 << -1720407056;
                            break L11;
                          }
                        }
                        var17 = param5 << -994634000;
                        var11 = (var17 - var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param1 != param4) {
                          var15 = param4 + -param0;
                          if (param8 >= param3) {
                            var11 = (param5 - param3 << -2094796368) / var15;
                            var12 = (-param8 + param5 << -566298672) / var14;
                            var10 = param8 << -126586000;
                            var9_int = param3 << 1344885200;
                            break L12;
                          } else {
                            var12 = (-param3 + param5 << -2022037648) / var15;
                            var11 = (param5 - param8 << -1657970416) / var14;
                            var10 = param3 << 1854380592;
                            var9_int = param8 << 47978576;
                            break L12;
                          }
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param3 << -1114714096;
                          var9_int = param8 << 2126563632;
                          break L12;
                        }
                      }
                      var13 = 0;
                      if (param1 < 0) {
                        param1 = Math.min(-param1, param0 + -param1);
                        var10 = var10 + var12 * param1;
                        var9_int = var9_int + var11 * param1;
                        param1 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param6 == -13612) {
                    L13: {
                      if (0 > param1) {
                        param1 = -param1;
                        var10 = var10 + param1 * var12;
                        var9_int = var9_int + param1 * var11;
                        param1 = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var15 = dj.field_a[param1];
                    L14: while (true) {
                      if (param4 <= param1) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> -1759816432;
                          if (var16 < dj.field_b) {
                            var17 = (var10 >> 1440157136) - (var9_int >> -887921776);
                            if (-1 == (var17 ^ -1)) {
                              if (-1 < (var16 ^ -1)) {
                                break L15;
                              } else {
                                if (var16 >= dj.field_b) {
                                  break L15;
                                } else {
                                  s.a(param2, param6 + 13611, var16 - -var15, param7, var17);
                                  break L15;
                                }
                              }
                            } else {
                              L16: {
                                if (var16 + var17 >= dj.field_b) {
                                  var17 = -1 + (dj.field_b - var16);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (0 <= var16) {
                                s.a(param2, -1, var15 + var16, param7, var17);
                                break L15;
                              } else {
                                s.a(param2, -1, var15, param7, var17 - -var16);
                                break L15;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        param1++;
                        if (param1 >= dj.field_f) {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          var15 = var15 + eh.field_g;
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var9);
            stackOut_78_1 = new StringBuilder().append("h.E(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L17;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        if (!oc.d(param0 + 59)) {
            return;
        }
        qd.a(126, false, param0);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hf var4_ref_hf = null;
        byte[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        byte[] var8 = null;
        af var9 = null;
        ld var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var10 = kj.field_a;
              if (param0 > 105) {
                break L1;
              } else {
                var7 = (int[]) null;
                h.a(66, 0, (int[]) null, -109, -10, 74, -76, 25, -33);
                break L1;
              }
            }
            L2: {
              var2 = var10.d((byte) -54);
              if (0 == var2) {
                var9 = (af) ((Object) ag.field_b.b(108));
                if (var9 != null) {
                  L3: {
                    var4 = var10.d((byte) -54);
                    if (0 != var4) {
                      var12 = new byte[var4];
                      var11 = var12;
                      var8 = var11;
                      var5 = var8;
                      var10.a(var12, (byte) -120, 0, var4);
                      break L3;
                    } else {
                      var5 = null;
                      break L3;
                    }
                  }
                  var10.field_o = var10.field_o + 4;
                  if (!var10.f(0)) {
                    si.a(-56);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var9.field_t = var5;
                    var9.field_q = true;
                    var9.b(34);
                    break L2;
                  }
                } else {
                  si.a(-37);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  var3 = var10.b((byte) 119);
                  var4_ref_hf = (hf) ((Object) kk.field_a.b(109));
                  L4: while (true) {
                    L5: {
                      if (var4_ref_hf == null) {
                        break L5;
                      } else {
                        if (var3 != var4_ref_hf.field_o) {
                          var4_ref_hf = (hf) ((Object) kk.field_a.b((byte) 56));
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var4_ref_hf == null) {
                      si.a(-60);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var4_ref_hf.b(34);
                      break L2;
                    }
                  }
                } else {
                  di.a((Throwable) null, 1, "A1: " + hj.a((byte) 118));
                  si.a(-56);
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "h.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_b = -1;
        field_a = new int[8192];
    }
}
