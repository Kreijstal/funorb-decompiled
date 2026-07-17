/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends mc {
    int field_t;
    static hl field_n;
    int field_y;
    int field_w;
    int field_r;
    int field_x;
    int field_s;
    static int field_q;
    static a field_u;
    static a field_p;
    int field_v;
    static String field_o;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
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
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var19 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (0 > param5) {
                break L1;
              } else {
                if (param7 < vn.field_n) {
                  L2: {
                    if (param1 >= 0) {
                      break L2;
                    } else {
                      if (param3 >= 0) {
                        break L2;
                      } else {
                        if (param0 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param1 < vn.field_k) {
                      break L3;
                    } else {
                      if (vn.field_k > param3) {
                        break L3;
                      } else {
                        if (vn.field_k > param0) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param5 - param7;
                    if (param7 == param4) {
                      L5: {
                        if (param5 != param7) {
                          var15 = -param4 + param5;
                          if (param1 < param3) {
                            var11 = (param0 - param1 << 16) / var14;
                            var12 = (param0 + -param3 << 16) / var15;
                            var10 = param3 << 16;
                            var9_int = param1 << 16;
                            break L5;
                          } else {
                            var11 = (param0 + -param3 << 16) / var15;
                            var10 = param1 << 16;
                            var12 = (param0 + -param1 << 16) / var14;
                            var9_int = param3 << 16;
                            break L5;
                          }
                        } else {
                          var12 = 0;
                          var11 = 0;
                          var9_int = param1 << 16;
                          var10 = param3 << 16;
                          break L5;
                        }
                      }
                      L6: {
                        if (param7 < 0) {
                          param7 = Math.min(-param7, param4 + -param7);
                          var9_int = var9_int + var11 * param7;
                          var10 = var10 + var12 * param7;
                          param7 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var13 = 0;
                      break L4;
                    } else {
                      L7: {
                        var10 = param1 << 16;
                        var9_int = param1 << 16;
                        var15 = -param7 + param4;
                        var12 = (-param1 + param0 << 16) / var14;
                        var11 = (-param1 + param3 << 16) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param7 < 0) {
                            if (0 <= param4) {
                              param7 = -param7;
                              var10 = var10 + param7 * var12;
                              var9_int = var9_int + var11 * param7;
                              param7 = 0;
                              break L9;
                            } else {
                              param7 = param4 - param7;
                              var9_int = var9_int + var11 * param7;
                              var10 = var10 + param7 * var12;
                              param7 = param4;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = vn.field_h[param7];
                        L10: while (true) {
                          if (param4 <= param7) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (var17 < vn.field_k) {
                                var18 = (var10 >> 16) + -(var9_int >> 16);
                                if (var18 != 0) {
                                  L12: {
                                    if (var18 + var17 < vn.field_k) {
                                      break L12;
                                    } else {
                                      var18 = -var17 + vn.field_k - 1;
                                      break L12;
                                    }
                                  }
                                  if (var17 < 0) {
                                    mh.a(param6, param8, param2 + -98, var17 + var18, var16);
                                    break L11;
                                  } else {
                                    mh.a(param6, param8, 0, var18, var17 - -var16);
                                    break L11;
                                  }
                                } else {
                                  if (0 > var17) {
                                    break L11;
                                  } else {
                                    if (vn.field_k > var17) {
                                      mh.a(param6, param8, 0, var18, var16 + var17);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param7++;
                            if (vn.field_n > param7) {
                              var16 = var16 + ra.field_f;
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              continue L10;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = -param4 + param5;
                      if (var16 == 0) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L13: {
                          if (var13 != 0) {
                            var10 = param3 << 16;
                            break L13;
                          } else {
                            var9_int = param3 << 16;
                            break L13;
                          }
                        }
                        var17 = param0 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if (param7 >= 0) {
                      break L14;
                    } else {
                      param7 = -param7;
                      var10 = var10 + param7 * var12;
                      var9_int = var9_int + param7 * var11;
                      param7 = 0;
                      break L14;
                    }
                  }
                  L15: {
                    var15 = vn.field_h[param7];
                    if (param2 == 98) {
                      break L15;
                    } else {
                      field_q = 100;
                      break L15;
                    }
                  }
                  L16: while (true) {
                    if (param5 <= param7) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (vn.field_k > var16) {
                          var17 = -(var9_int >> 16) + (var10 >> 16);
                          if (0 != var17) {
                            L18: {
                              if (vn.field_k > var16 + var17) {
                                break L18;
                              } else {
                                var17 = -var16 + vn.field_k + -1;
                                break L18;
                              }
                            }
                            if (var16 >= 0) {
                              mh.a(param6, param8, 0, var17, var16 - -var15);
                              break L17;
                            } else {
                              mh.a(param6, param8, param2 ^ 98, var16 + var17, var15);
                              break L17;
                            }
                          } else {
                            if (var16 < 0) {
                              break L17;
                            } else {
                              if (var16 < vn.field_k) {
                                mh.a(param6, param8, param2 + -98, var17, var16 - -var15);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                        } else {
                          break L17;
                        }
                      }
                      param7++;
                      if (param7 < vn.field_n) {
                        var15 = var15 + ra.field_f;
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        continue L16;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var9 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var9;
            stackOut_76_1 = new StringBuilder().append("qi.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param6 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L19;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L19;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_79_0, stackIn_79_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void b(byte param0) {
        gg.c((byte) 43);
        rm.a(1731);
        mm.field_y = null;
        go.c((byte) 42);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              L0: {
                bm.field_s = param0;
                try {
                  L1: {
                    L2: {
                      var6 = param2.getParameter("cookieprefix");
                      var5 = var6;
                      var5 = var6;
                      var4 = param2.getParameter("cookiehost");
                      var5 = var4;
                      var5 = var4;
                      var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
                      var5 = var7;
                      var5 = var7;
                      if (param0.length() != 0) {
                        var5 = var7 + "; Expires=" + ei.a((byte) 2, 94608000000L + k.a(0)) + "; Max-Age=" + 94608000L;
                        break L2;
                      } else {
                        var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      }
                    }
                    L3: {
                      ii.a(-19149, "document.cookie=\"" + var5 + "\"", param2);
                      if (param1 == -7011) {
                        break L3;
                      } else {
                        field_n = null;
                        break L3;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    break L4;
                  }
                }
                q.a(param2, param1 + 7075);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var3_ref;
                stackOut_10_1 = new StringBuilder().append("qi.A(");
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param0 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              L6: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_n = null;
        field_o = null;
        field_p = null;
        if (param0 != 19381) {
            field_u = null;
        }
    }

    qi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((qi) this).field_w = param5;
        ((qi) this).field_s = param6;
        ((qi) this).field_y = param2;
        ((qi) this).field_t = param0;
        ((qi) this).field_x = param3;
        ((qi) this).field_r = param4;
        ((qi) this).field_v = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new a();
        field_o = "Please enter your age in years";
    }
}
