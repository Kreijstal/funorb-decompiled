/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j {
    static int field_c;
    static int[] field_d;
    static String field_a;
    static int field_b;

    final static void a(int param0) {
        jb.a(tg.field_h, ua.field_H, gf.field_g, -47, ui.field_x);
        if (param0 != 8225) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, int param4, long param5, int param6, boolean param7, int param8, int param9, boolean param10, boolean param11, int param12, String param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                de.field_V = new uf(param3);
                we.field_b = new uf(param4);
                mc.field_e = param13;
                lf.field_f = param2;
                if (param11) {
                  L1: {
                    kb.field_g = param8;
                    l.field_c = param6;
                    qk.field_a = param0;
                    if (!param10) {
                      stackOut_4_0 = 0;
                      stackIn_5_0 = stackOut_4_0;
                      break L1;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L1;
                    }
                  }
                  L2: {
                    ce.field_w = stackIn_5_0 != 0;
                    rm.field_c = param5;
                    ef.field_P = param9;
                    hc.field_a = param12;
                    if (!param7) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  L3: {
                    ci.field_c = stackIn_8_0 != 0;
                    re.field_v = param1;
                    if (null == lf.field_f.field_v) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          dj.field_cb = new nh(lf.field_f.field_v, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
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
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var15_ref);
                stackOut_13_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param2 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param13 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_33_0 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param4 <= param6) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 + param6 < param2) {
                L1: {
                  if (param2 <= 5 + param6) {
                    break L1;
                  } else {
                    if (param3 != param5) {
                      var7_int = (param3 >> 861831393) + ((param5 >> -973240543) + (param5 & param3 & 1));
                      var8 = param6;
                      var9 = param3;
                      var10 = param5;
                      var11 = param6;
                      L2: while (true) {
                        L3: {
                          if (param2 <= var11) {
                            j.a((byte) -33, param1, var8, param3, param4, var9, param6);
                            stackOut_33_0 = param0;
                            stackIn_34_0 = stackOut_33_0;
                            break L3;
                          } else {
                            var12 = ch.field_a[var11];
                            stackOut_23_0 = param1;
                            stackIn_34_0 = stackOut_23_0 ? 1 : 0;
                            stackIn_24_0 = stackOut_23_0;
                            if (var14 != 0) {
                              break L3;
                            } else {
                              L4: {
                                if (!stackIn_24_0) {
                                  stackOut_26_0 = cc.field_h[var12];
                                  stackIn_27_0 = stackOut_26_0;
                                  break L4;
                                } else {
                                  stackOut_25_0 = ad.field_i[var12];
                                  stackIn_27_0 = stackOut_25_0;
                                  break L4;
                                }
                              }
                              L5: {
                                L6: {
                                  var13 = stackIn_27_0;
                                  if (var7_int >= var13) {
                                    break L6;
                                  } else {
                                    ch.field_a[var11] = ch.field_a[var8];
                                    incrementValue$1 = var8;
                                    var8++;
                                    ch.field_a[incrementValue$1] = var12;
                                    if (var9 <= var13) {
                                      break L5;
                                    } else {
                                      var9 = var13;
                                      if (var14 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                if (var13 <= var10) {
                                  break L5;
                                } else {
                                  var10 = var13;
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                        j.a((byte) stackIn_34_0, param1, param2, var10, param4, param5, var8);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L7: while (true) {
                  stackOut_10_0 = var7_int;
                  stackIn_11_0 = stackOut_10_0;
                  L8: while (true) {
                    L9: {
                      if (stackIn_11_0 <= param6) {
                        break L9;
                      } else {
                        var8 = param6;
                        L10: while (true) {
                          L11: {
                            if (var7_int <= var8) {
                              break L11;
                            } else {
                              var9 = ch.field_a[var8];
                              var10 = ch.field_a[1 + var8];
                              stackOut_14_0 = ee.a((byte) 100, param1, var10, var9);
                              stackIn_11_0 = stackOut_14_0 ? 1 : 0;
                              stackIn_15_0 = stackOut_14_0;
                              if (var14 != 0) {
                                continue L8;
                              } else {
                                L12: {
                                  if (stackIn_15_0) {
                                    ch.field_a[var8] = var10;
                                    ch.field_a[1 + var8] = var9;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var8++;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var7_int--;
                          if (var14 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        jb var14 = null;
        StringWriter var15 = null;
        BufferedReader var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        BufferedReader var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        L0: {
          L1: {
            var13 = client.field_A ? 1 : 0;
            if (param0 instanceof jb) {
              break L1;
            } else {
              var2 = "";
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var14 = (jb) ((Object) param0);
          var2 = var14.field_i + " | ";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          param0 = var14.field_e;
          break L0;
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        if (param1 == 37) {
          var20 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var26 = var20.readLine();
          var11 = var26;
          var2 = var11;
          var11 = var26;
          L2: while (true) {
            L3: {
              var21 = var20.readLine();
              var11 = var21;
              var2 = var11;
              var11 = var21;
              if (var21 != null) {
                break L3;
              } else {
                if (var13 == 0) {
                  var2 = var2 + "| " + var26;
                  var11 = var2;
                  var2 = var11;
                  var11 = var2;
                  return var2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                var9 = var21.indexOf('(');
                var10 = var21.indexOf(')', var9 + 1);
                if (var9 == -1) {
                  break L5;
                } else {
                  var11 = var21.substring(0, var9);
                  if (var13 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = var21;
              var2 = var11;
              var2 = var11;
              break L4;
            }
            L6: {
              var22 = var11.trim();
              var2 = var22;
              var2 = var22;
              var23 = var22.substring(var22.lastIndexOf(' ') + 1);
              var2 = var23;
              var2 = var23;
              var24 = var23.substring(1 + var23.lastIndexOf('\t'));
              var2 = var24;
              var2 = var24;
              var25 = var2 + var24;
              var2 = var25;
              var2 = var25;
              var2 = var25;
              if ((var9 ^ -1) == 0) {
                break L6;
              } else {
                if ((var10 ^ -1) == 0) {
                  break L6;
                } else {
                  var12 = var21.indexOf(".java:", var9);
                  if ((var12 ^ -1) > -1) {
                    break L6;
                  } else {
                    var2 = var25 + var21.substring(var12 - -5, var10);
                    break L6;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          }
        } else {
          field_c = 30;
          var27 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var6 = var27;
          var33 = var27.readLine();
          var11 = var33;
          var2 = var11;
          var11 = var33;
          var7 = var33;
          var11 = var7;
          var2 = var11;
          var11 = var7;
          L7: while (true) {
            L8: {
              var28 = var27.readLine();
              var11 = var28;
              var2 = var11;
              var11 = var28;
              if (var28 != null) {
                break L8;
              } else {
                if (var13 == 0) {
                  var2 = var2 + "| " + var33;
                  var11 = var2;
                  var2 = var11;
                  var11 = var2;
                  return var2;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              L10: {
                var9 = var28.indexOf('(');
                var10 = var28.indexOf(')', var9 + 1);
                if (var9 == -1) {
                  break L10;
                } else {
                  var11 = var28.substring(0, var9);
                  if (var13 == 0) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var11 = var28;
              var2 = var11;
              var2 = var11;
              break L9;
            }
            L11: {
              var29 = var11.trim();
              var2 = var29;
              var2 = var29;
              var30 = var29.substring(var29.lastIndexOf(' ') + 1);
              var2 = var30;
              var2 = var30;
              var31 = var30.substring(1 + var30.lastIndexOf('\t'));
              var2 = var31;
              var2 = var31;
              var32 = var2 + var31;
              var2 = var32;
              var2 = var32;
              var2 = var32;
              if ((var9 ^ -1) == 0) {
                break L11;
              } else {
                if ((var10 ^ -1) == 0) {
                  break L11;
                } else {
                  var12 = var28.indexOf(".java:", var9);
                  if ((var12 ^ -1) > -1) {
                    break L11;
                  } else {
                    var2 = var32 + var28.substring(var12 - -5, var10);
                    break L11;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L7;
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 == -8241) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 <= 122) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_d = (int[]) null;
          if (param1 >= 48) {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                L6: {
                  L7: {
                    if (param1 < 97) {
                      break L7;
                    } else {
                      if (param1 > 122) {
                        break L7;
                      } else {
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L6;
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L6;
                }
                return stackIn_9_0 != 0;
              } else {
                return true;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_d = (int[]) null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param1 == 28) {
          if (param0 <= 0) {
            if (param0 >= 160) {
              if (255 >= param0) {
                var2 = (byte)param0;
                return (byte) var2;
              } else {
                L0: {
                  L1: {
                    if (param0 == 8364) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 != 8218) {
                          break L2;
                        } else {
                          var2 = -126;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      L3: {
                        if (402 == param0) {
                          break L3;
                        } else {
                          L4: {
                            if (param0 == 8222) {
                              break L4;
                            } else {
                              L5: {
                                if (param0 != 8230) {
                                  break L5;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (param0 != 8224) {
                                  break L6;
                                } else {
                                  var2 = -122;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (8225 == param0) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (param0 != 710) {
                                      break L8;
                                    } else {
                                      var2 = -120;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (param0 == 8240) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (param0 == 352) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (param0 != 8249) {
                                              break L11;
                                            } else {
                                              var2 = -117;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (param0 == 338) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (381 != param0) {
                                                  break L13;
                                                } else {
                                                  var2 = -114;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              L14: {
                                                if (param0 != 8216) {
                                                  break L14;
                                                } else {
                                                  var2 = -111;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                              L15: {
                                                if (param0 == 8217) {
                                                  break L15;
                                                } else {
                                                  L16: {
                                                    if (param0 == 8220) {
                                                      break L16;
                                                    } else {
                                                      L17: {
                                                        if (param0 != 8221) {
                                                          break L17;
                                                        } else {
                                                          var2 = -108;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L17;
                                                          }
                                                        }
                                                      }
                                                      L18: {
                                                        if (8226 == param0) {
                                                          break L18;
                                                        } else {
                                                          L19: {
                                                            if (8211 != param0) {
                                                              break L19;
                                                            } else {
                                                              var2 = -106;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          L20: {
                                                            if (8212 == param0) {
                                                              break L20;
                                                            } else {
                                                              L21: {
                                                                if (param0 != 732) {
                                                                  break L21;
                                                                } else {
                                                                  var2 = -104;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              L22: {
                                                                if (param0 == 8482) {
                                                                  break L22;
                                                                } else {
                                                                  L23: {
                                                                    if (param0 == 353) {
                                                                      break L23;
                                                                    } else {
                                                                      L24: {
                                                                        if (8250 != param0) {
                                                                          break L24;
                                                                        } else {
                                                                          var2 = -101;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L24;
                                                                          }
                                                                        }
                                                                      }
                                                                      L25: {
                                                                        if (param0 != 339) {
                                                                          break L25;
                                                                        } else {
                                                                          var2 = -100;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L25;
                                                                          }
                                                                        }
                                                                      }
                                                                      L26: {
                                                                        if (param0 != 382) {
                                                                          break L26;
                                                                        } else {
                                                                          var2 = -98;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L26;
                                                                          }
                                                                        }
                                                                      }
                                                                      L27: {
                                                                        if (param0 == 376) {
                                                                          break L27;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L0;
                                                                          } else {
                                                                            break L27;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L0;
                                                                      } else {
                                                                        break L23;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  if (var3 == 0) {
                                                                    break L0;
                                                                  } else {
                                                                    break L22;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L0;
                                                              } else {
                                                                break L20;
                                                              }
                                                            }
                                                          }
                                                          var2 = -105;
                                                          if (var3 == 0) {
                                                            break L0;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                      }
                                                      var2 = -107;
                                                      if (var3 == 0) {
                                                        break L0;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                              }
                                              var2 = -110;
                                              if (var3 == 0) {
                                                break L0;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          var2 = -116;
                                          if (var3 == 0) {
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var2 = -118;
                                      if (var3 == 0) {
                                        break L0;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L0;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var3 == 0) {
                                break L0;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var2 = -124;
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2 = -125;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    var2 = (byte)param0;
                    break L0;
                  }
                }
                return (byte) var2;
              }
            } else {
              L28: {
                L29: {
                  if (param0 == 8364) {
                    break L29;
                  } else {
                    L30: {
                      if (param0 != 8218) {
                        break L30;
                      } else {
                        var2 = -126;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L30;
                        }
                      }
                    }
                    L31: {
                      if (402 == param0) {
                        break L31;
                      } else {
                        L32: {
                          if (param0 == 8222) {
                            break L32;
                          } else {
                            L33: {
                              if (param0 != 8230) {
                                break L33;
                              } else {
                                var2 = -123;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (param0 != 8224) {
                                break L34;
                              } else {
                                var2 = -122;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if (8225 == param0) {
                                break L35;
                              } else {
                                L36: {
                                  if (param0 != 710) {
                                    break L36;
                                  } else {
                                    var2 = -120;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                L37: {
                                  if (param0 == 8240) {
                                    break L37;
                                  } else {
                                    L38: {
                                      if (param0 == 352) {
                                        break L38;
                                      } else {
                                        L39: {
                                          if (param0 != 8249) {
                                            break L39;
                                          } else {
                                            var2 = -117;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L39;
                                            }
                                          }
                                        }
                                        L40: {
                                          if (param0 == 338) {
                                            break L40;
                                          } else {
                                            L41: {
                                              if (381 != param0) {
                                                break L41;
                                              } else {
                                                var2 = -114;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L41;
                                                }
                                              }
                                            }
                                            L42: {
                                              if (param0 != 8216) {
                                                break L42;
                                              } else {
                                                var2 = -111;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L42;
                                                }
                                              }
                                            }
                                            L43: {
                                              if (param0 == 8217) {
                                                break L43;
                                              } else {
                                                L44: {
                                                  if (param0 == 8220) {
                                                    break L44;
                                                  } else {
                                                    L45: {
                                                      if (param0 != 8221) {
                                                        break L45;
                                                      } else {
                                                        var2 = -108;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L45;
                                                        }
                                                      }
                                                    }
                                                    L46: {
                                                      if (8226 == param0) {
                                                        break L46;
                                                      } else {
                                                        L47: {
                                                          if (8211 != param0) {
                                                            break L47;
                                                          } else {
                                                            var2 = -106;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L47;
                                                            }
                                                          }
                                                        }
                                                        L48: {
                                                          if (8212 == param0) {
                                                            break L48;
                                                          } else {
                                                            L49: {
                                                              if (param0 != 732) {
                                                                break L49;
                                                              } else {
                                                                var2 = -104;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L49;
                                                                }
                                                              }
                                                            }
                                                            L50: {
                                                              if (param0 == 8482) {
                                                                break L50;
                                                              } else {
                                                                L51: {
                                                                  if (param0 == 353) {
                                                                    break L51;
                                                                  } else {
                                                                    L52: {
                                                                      if (8250 != param0) {
                                                                        break L52;
                                                                      } else {
                                                                        var2 = -101;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L52;
                                                                        }
                                                                      }
                                                                    }
                                                                    L53: {
                                                                      if (param0 != 339) {
                                                                        break L53;
                                                                      } else {
                                                                        var2 = -100;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L53;
                                                                        }
                                                                      }
                                                                    }
                                                                    L54: {
                                                                      if (param0 != 382) {
                                                                        break L54;
                                                                      } else {
                                                                        var2 = -98;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L54;
                                                                        }
                                                                      }
                                                                    }
                                                                    L55: {
                                                                      if (param0 == 376) {
                                                                        break L55;
                                                                      } else {
                                                                        var2 = 63;
                                                                        if (var3 == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          break L55;
                                                                        }
                                                                      }
                                                                    }
                                                                    var2 = -97;
                                                                    if (var3 == 0) {
                                                                      break L28;
                                                                    } else {
                                                                      break L51;
                                                                    }
                                                                  }
                                                                }
                                                                var2 = -102;
                                                                if (var3 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L50;
                                                                }
                                                              }
                                                            }
                                                            var2 = -103;
                                                            if (var3 == 0) {
                                                              break L28;
                                                            } else {
                                                              break L48;
                                                            }
                                                          }
                                                        }
                                                        var2 = -105;
                                                        if (var3 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                    var2 = -107;
                                                    if (var3 == 0) {
                                                      break L28;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                                var2 = -109;
                                                if (var3 == 0) {
                                                  break L28;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                            var2 = -110;
                                            if (var3 == 0) {
                                              break L28;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                        var2 = -116;
                                        if (var3 == 0) {
                                          break L28;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    var2 = -118;
                                    if (var3 == 0) {
                                      break L28;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                var2 = -119;
                                if (var3 == 0) {
                                  break L28;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2 = -121;
                            if (var3 == 0) {
                              break L28;
                            } else {
                              break L32;
                            }
                          }
                        }
                        var2 = -124;
                        if (var3 == 0) {
                          break L28;
                        } else {
                          break L31;
                        }
                      }
                    }
                    var2 = -125;
                    if (var3 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                var2 = -128;
                if (var3 == 0) {
                  break L28;
                } else {
                  var2 = (byte)param0;
                  break L28;
                }
              }
              return (byte) var2;
            }
          } else {
            if (param0 < 128) {
              var2 = (byte)param0;
              return (byte) var2;
            } else {
              L56: {
                L57: {
                  L58: {
                    if (param0 < 160) {
                      break L58;
                    } else {
                      if (255 >= param0) {
                        break L57;
                      } else {
                        break L58;
                      }
                    }
                  }
                  L59: {
                    if (param0 == 8364) {
                      break L59;
                    } else {
                      L60: {
                        if (param0 != 8218) {
                          break L60;
                        } else {
                          var2 = -126;
                          if (var3 == 0) {
                            break L56;
                          } else {
                            break L60;
                          }
                        }
                      }
                      L61: {
                        if (402 == param0) {
                          break L61;
                        } else {
                          L62: {
                            if (param0 == 8222) {
                              break L62;
                            } else {
                              L63: {
                                if (param0 != 8230) {
                                  break L63;
                                } else {
                                  var2 = -123;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                if (param0 != 8224) {
                                  break L64;
                                } else {
                                  var2 = -122;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                if (8225 == param0) {
                                  break L65;
                                } else {
                                  L66: {
                                    if (param0 != 710) {
                                      break L66;
                                    } else {
                                      var2 = -120;
                                      if (var3 == 0) {
                                        break L56;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                  L67: {
                                    if (param0 == 8240) {
                                      break L67;
                                    } else {
                                      L68: {
                                        if (param0 == 352) {
                                          break L68;
                                        } else {
                                          L69: {
                                            if (param0 != 8249) {
                                              break L69;
                                            } else {
                                              var2 = -117;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                          L70: {
                                            if (param0 == 338) {
                                              break L70;
                                            } else {
                                              L71: {
                                                if (381 != param0) {
                                                  break L71;
                                                } else {
                                                  var2 = -114;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L71;
                                                  }
                                                }
                                              }
                                              L72: {
                                                if (param0 != 8216) {
                                                  break L72;
                                                } else {
                                                  var2 = -111;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L72;
                                                  }
                                                }
                                              }
                                              L73: {
                                                if (param0 == 8217) {
                                                  break L73;
                                                } else {
                                                  L74: {
                                                    if (param0 == 8220) {
                                                      break L74;
                                                    } else {
                                                      L75: {
                                                        if (param0 != 8221) {
                                                          break L75;
                                                        } else {
                                                          var2 = -108;
                                                          if (var3 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L75;
                                                          }
                                                        }
                                                      }
                                                      L76: {
                                                        if (8226 == param0) {
                                                          break L76;
                                                        } else {
                                                          L77: {
                                                            if (8211 != param0) {
                                                              break L77;
                                                            } else {
                                                              var2 = -106;
                                                              if (var3 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L77;
                                                              }
                                                            }
                                                          }
                                                          L78: {
                                                            if (8212 == param0) {
                                                              break L78;
                                                            } else {
                                                              L79: {
                                                                if (param0 != 732) {
                                                                  break L79;
                                                                } else {
                                                                  var2 = -104;
                                                                  if (var3 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L79;
                                                                  }
                                                                }
                                                              }
                                                              L80: {
                                                                if (param0 == 8482) {
                                                                  break L80;
                                                                } else {
                                                                  L81: {
                                                                    if (param0 == 353) {
                                                                      break L81;
                                                                    } else {
                                                                      L82: {
                                                                        if (8250 != param0) {
                                                                          break L82;
                                                                        } else {
                                                                          var2 = -101;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L82;
                                                                          }
                                                                        }
                                                                      }
                                                                      L83: {
                                                                        if (param0 != 339) {
                                                                          break L83;
                                                                        } else {
                                                                          var2 = -100;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L83;
                                                                          }
                                                                        }
                                                                      }
                                                                      L84: {
                                                                        if (param0 != 382) {
                                                                          break L84;
                                                                        } else {
                                                                          var2 = -98;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L84;
                                                                          }
                                                                        }
                                                                      }
                                                                      L85: {
                                                                        if (param0 == 376) {
                                                                          break L85;
                                                                        } else {
                                                                          var2 = 63;
                                                                          if (var3 == 0) {
                                                                            break L56;
                                                                          } else {
                                                                            break L85;
                                                                          }
                                                                        }
                                                                      }
                                                                      var2 = -97;
                                                                      if (var3 == 0) {
                                                                        break L56;
                                                                      } else {
                                                                        break L81;
                                                                      }
                                                                    }
                                                                  }
                                                                  var2 = -102;
                                                                  if (var3 == 0) {
                                                                    break L56;
                                                                  } else {
                                                                    break L80;
                                                                  }
                                                                }
                                                              }
                                                              var2 = -103;
                                                              if (var3 == 0) {
                                                                break L56;
                                                              } else {
                                                                break L78;
                                                              }
                                                            }
                                                          }
                                                          var2 = -105;
                                                          if (var3 == 0) {
                                                            break L56;
                                                          } else {
                                                            break L76;
                                                          }
                                                        }
                                                      }
                                                      var2 = -107;
                                                      if (var3 == 0) {
                                                        break L56;
                                                      } else {
                                                        break L74;
                                                      }
                                                    }
                                                  }
                                                  var2 = -109;
                                                  if (var3 == 0) {
                                                    break L56;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                              }
                                              var2 = -110;
                                              if (var3 == 0) {
                                                break L56;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                          var2 = -116;
                                          if (var3 == 0) {
                                            break L56;
                                          } else {
                                            break L68;
                                          }
                                        }
                                      }
                                      var2 = -118;
                                      if (var3 == 0) {
                                        break L56;
                                      } else {
                                        break L67;
                                      }
                                    }
                                  }
                                  var2 = -119;
                                  if (var3 == 0) {
                                    break L56;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              var2 = -121;
                              if (var3 == 0) {
                                break L56;
                              } else {
                                break L62;
                              }
                            }
                          }
                          var2 = -124;
                          if (var3 == 0) {
                            break L56;
                          } else {
                            break L61;
                          }
                        }
                      }
                      var2 = -125;
                      if (var3 == 0) {
                        break L56;
                      } else {
                        break L59;
                      }
                    }
                  }
                  var2 = -128;
                  if (var3 == 0) {
                    break L56;
                  } else {
                    break L57;
                  }
                }
                var2 = (byte)param0;
                break L56;
              }
              return (byte) var2;
            }
          }
        } else {
          return (byte) 85;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            var5 = param0.length();
            var6 = param2.length();
            if (param3 != var5) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 != var8) {
                  var9_int = 0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        var9_int = param1.indexOf(param0, var9_int);
                        if (var9_int >= 0) {
                          break L4;
                        } else {
                          if (var12 != 0) {
                            break L3;
                          } else {
                            if (var12 == 0) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      break L3;
                    }
                    if (var12 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    L8: {
                      var11 = param1.indexOf(param0, var10);
                      if (0 <= var11) {
                        break L8;
                      } else {
                        if (var12 != 0) {
                          break L7;
                        } else {
                          if (var12 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    discarded$3 = var9.append(param1.substring(var10, var11));
                    discarded$4 = var9.append(param2);
                    var10 = var11 - -var5;
                    break L7;
                  }
                  if (var12 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
                discarded$5 = var9.append(param1.substring(var10));
                stackOut_19_0 = var9.toString();
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("j.F(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
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
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    static {
        field_a = "Not yet achieved";
        field_d = b.h(26);
    }
}
