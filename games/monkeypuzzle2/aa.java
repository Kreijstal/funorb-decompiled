/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aa {
    be[] field_c;
    static int field_a;
    static ib field_b;

    final int a(int param0, String param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.applet.Applet var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              if (param3 == -79) {
                break L1;
              } else {
                var11 = (java.applet.Applet) null;
                aa.a(71, (java.applet.Applet) null);
                break L1;
              }
            }
            var7 = param1.length();
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var7 <= var8) {
                    break L4;
                  } else {
                    var9 = param1.charAt(var8);
                    var13 = 60;
                    var12 = var9;
                    if (var10 != 0) {
                      if (var12 < var13) {
                        break L3;
                      } else {
                        return 0;
                      }
                    } else {
                      L5: {
                        L6: {
                          if (var12 == var13) {
                            break L6;
                          } else {
                            L7: {
                              if (62 == var9) {
                                break L7;
                              } else {
                                if (var6 != 0) {
                                  break L5;
                                } else {
                                  if (var9 == 32) {
                                    var5_int++;
                                    if (var10 == 0) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                            var6 = 0;
                            if (var10 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6 = 1;
                        break L5;
                      }
                      var8++;
                      if (var10 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (0 < var5_int) {
                  break L3;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              stackOut_20_0 = (-param2 + param0 << 427847240) / var5_int;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("aa.A(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0;
        } else {
          return stackIn_23_0;
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        be var4 = null;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var5 = MonkeyPuzzle2.field_F ? 1 : 0;
          var3 = 0;
          if (param1 < 0) {
            break L0;
          } else {
            field_b = (ib) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < this.field_c.length) {
            var4 = this.field_c[var3];
            stackOut_4_0 = var4.field_c.length ^ -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (var5 == 0) {
              if (stackIn_6_0 < (param0 ^ -1)) {
                return var3;
              } else {
                param0 = param0 - (-1 + var4.field_c.length);
                var3++;
                continue L1;
              }
            } else {
              return stackIn_5_0;
            }
          } else {
            return this.field_c.length;
          }
        }
    }

    final static int a(ta param0, int param1, String param2, boolean param3, String[] param4) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param2);
              if (var5_int > param1) {
                break L1;
              } else {
                if (param2.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param2;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int - -param1 + -1) / param1;
            if (param3) {
              param1 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param2.length();
              var9 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var8 <= var9) {
                        break L5;
                      } else {
                        var10 = param2.charAt(var9);
                        var15 = -33;
                        var14 = var10 ^ -1;
                        if (var13 != 0) {
                          if (var14 >= var15) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          L6: {
                            L7: {
                              if (var14 == var15) {
                                break L7;
                              } else {
                                if (var10 != 45) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var11 = param2.substring(var7, 1 + var9).trim();
                            var12 = param0.a(var11);
                            if (param1 > var12) {
                              break L6;
                            } else {
                              incrementValue$3 = var6;
                              var6++;
                              param4[incrementValue$3] = var11;
                              var7 = var9 - -1;
                              break L6;
                            }
                          }
                          L8: {
                            if (var10 != 62) {
                              break L8;
                            } else {
                              if (!param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                                break L8;
                              } else {
                                incrementValue$4 = var6;
                                var6++;
                                param4[incrementValue$4] = param2.substring(var7, -3 + var9).trim();
                                var7 = 1 + var9;
                                break L8;
                              }
                            }
                          }
                          var9++;
                          if (var13 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if (var7 >= var8) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                  incrementValue$5 = var6;
                  var6++;
                  param4[incrementValue$5] = param2.substring(var7, var8).trim();
                  break L3;
                }
                stackOut_25_0 = var6;
                stackIn_26_0 = stackOut_25_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_6_0 = 23;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("aa.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param1).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    final int a(int param0, int param1) {
        be[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        be var6 = null;
        int var7 = 0;
        be[] var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var8 = this.field_c;
        var3 = var8;
        var4 = -95 / ((32 - param0) / 51);
        var5 = 0;
        L0: while (true) {
          if (var5 < var8.length) {
            var6 = var8[var5];
            stackOut_3_0 = param1 ^ -1;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var7 == 0) {
              if (stackIn_5_0 > (var6.field_c.length ^ -1)) {
                return var6.field_c[param1];
              } else {
                param1 = param1 - (-1 + var6.field_c.length);
                var5++;
                continue L0;
              }
            } else {
              return stackIn_4_0;
            }
          } else {
            return 0;
          }
        }
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
            int decompiledRegionSelector0 = 0;
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
              L0: {
                try {
                  L1: {
                    if (param0 <= -123) {
                      var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                      param1.getAppletContext().showDocument(uf.a(param1, (byte) 107, var2), "_top");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref2);
                stackOut_6_1 = new StringBuilder().append("aa.J(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_b = null;
        if (param0 == -1) {
            return;
        }
        field_a = 39;
    }

    final int b(int param0) {
        int discarded$6 = 0;
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 62) {
          if (this.field_c != null) {
            if (0 >= this.field_c.length) {
              return 0;
            } else {
              return -this.field_c[0].field_a + this.field_c[-1 + this.field_c.length].field_f;
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          var3 = (String) null;
          discarded$6 = this.a(121, (String) null, 20, (byte) -1);
          if (this.field_c == null) {
            return 0;
          } else {
            L0: {
              if (0 < this.field_c.length) {
                stackOut_4_0 = -this.field_c[0].field_a + this.field_c[-1 + this.field_c.length].field_f;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(int param0) {
        L0: {
          if (vh.field_B != null) {
            vh.field_B.b();
            break L0;
          } else {
            break L0;
          }
        }
        if (null == fc.field_k) {
          if (param0 == -11449) {
            return;
          } else {
            aa.c(26);
            return;
          }
        } else {
          fc.field_k.b();
          if (param0 == -11449) {
            return;
          } else {
            aa.c(26);
            return;
          }
        }
    }

    final int a(boolean param0) {
        int var2 = 0;
        be[] var3 = null;
        int var4 = 0;
        be var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
          var2 = -1;
          if (this.field_c == null) {
            return var2;
          } else {
            var3 = this.field_c;
            var4 = 0;
            L0: while (true) {
              L1: {
                if (var3.length <= var4) {
                  break L1;
                } else {
                  L2: {
                    var5 = var3[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var6 = var5.a(-1);
                      if (var6 > var2) {
                        var2 = var6;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4++;
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var2;
            }
          }
        } else {
          return -117;
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        be var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var8 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_c == null) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              if (this.field_c[0].field_a <= param1) {
                if (this.field_c[this.field_c.length + -1].field_f >= param1) {
                  if ((this.field_c.length ^ -1) != -2) {
                    L1: {
                      var4 = 0;
                      var5 = 0;
                      if (param2 <= -100) {
                        break L1;
                      } else {
                        aa.a(-27);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var5 < this.field_c.length) {
                        var6 = this.field_c[var5];
                        stackOut_30_0 = var6.field_a ^ -1;
                        stackIn_28_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var8 == 0) {
                          L3: {
                            if (stackIn_28_0 < (param1 ^ -1)) {
                              break L3;
                            } else {
                              if (param1 <= var6.field_f) {
                                var7 = var6.a(0, param0);
                                if ((var7 ^ -1) == 0) {
                                  return -1;
                                } else {
                                  return var7 + var4;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_c.length);
                          var5++;
                          continue L2;
                        } else {
                          stackOut_31_0 = stackIn_31_0;
                          stackIn_14_0 = stackOut_31_0;
                          return stackIn_14_0;
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return this.field_c[0].a(0, param0);
                  }
                } else {
                  return -1;
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    static {
        field_b = new ib();
    }
}
