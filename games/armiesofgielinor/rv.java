/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv {
    static String field_a;
    static int[] field_b;

    final static java.net.URL a(String param0, String param1, int param2, int param3, java.net.URL param4) {
        try {
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            StringBuilder discarded$18 = null;
            StringBuilder discarded$19 = null;
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            java.net.URL stackOut_45_0 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var5_ref = param4.getFile();
                var6 = param2;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                          break L4;
                        } else {
                          var7_int = var5_ref.indexOf('/', 1 + var6);
                          var11 = var7_int ^ -1;
                          var10 = -1;
                          if (var9 != 0) {
                            if (var10 > var11) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            if (var10 >= var11) {
                              L5: {
                                if (0 > param3) {
                                  break L5;
                                } else {
                                  var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                                  if (var9 == 0) {
                                    continue L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var6 = var7_int;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L2;
                      }
                    }
                    var6 = var7_int;
                    if (var9 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                  L6: {
                    if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      break L6;
                    } else {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        L7: {
                          if (param0 == null) {
                            break L7;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L9;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      L10: {
                        if (param1 == null) {
                          break L10;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L10;
                          }
                        }
                      }
                      var6 = var7_int;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    var7 = new StringBuilder(var6);
                    discarded$10 = var7.append(var5_ref.substring(0, var6));
                    if ((param3 ^ -1) < -1) {
                      discarded$11 = var7.append("/l=");
                      discarded$12 = var7.append(Integer.toString(param3));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (param0 == null) {
                      break L12;
                    } else {
                      if (param0.length() <= 0) {
                        break L12;
                      } else {
                        discarded$13 = var7.append("/p=");
                        discarded$14 = var7.append(param0);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param1 == null) {
                      break L13;
                    } else {
                      if (param1.length() > 0) {
                        discarded$15 = var7.append("/s=");
                        discarded$16 = var7.append(param1);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var6 >= var5_ref.length()) {
                      discarded$17 = var7.append('/');
                      break L14;
                    } else {
                      discarded$18 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      if (var9 == 0) {
                        break L14;
                      } else {
                        discarded$19 = var7.append('/');
                        break L14;
                      }
                    }
                  }
                  try {
                    L15: {
                      stackOut_43_0 = new java.net.URL(param4, var7.toString());
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_45_0 = (java.net.URL) (param4);
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_47_0 = (RuntimeException) (var5);
                stackOut_47_1 = new StringBuilder().append("rv.A(");
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param0 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L16;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L16;
                }
              }
              L17: {
                stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param1 == null) {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L17;
                } else {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L17;
                }
              }
              L18: {
                stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param4 == null) {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L18;
                } else {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L18;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_56_0), stackIn_56_2 + ')');
            }
            return stackIn_44_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4_int = 0;
        vb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (gs.field_a) {
              L2: {
                L3: {
                  if (null == ro.field_lb) {
                    break L3;
                  } else {
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= ro.field_lb.length) {
                        break L3;
                      } else {
                        stackOut_8_0 = param3 ^ -1;
                        stackOut_8_1 = ro.field_lb[var4_int] ^ -1;
                        stackIn_13_0 = stackOut_8_0;
                        stackIn_13_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L5: {
                            if (stackIn_9_0 != stackIn_9_1) {
                              break L5;
                            } else {
                              hh.field_d.d(param2, param1, 80, 40, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
                              break L5;
                            }
                          }
                          var4_int++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = param2;
                stackOut_12_1 = -96;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L2;
              }
              vv.a(stackIn_13_0, stackIn_13_1, false, param3, us.a(param3, (byte) 87), param1);
              var4 = (vb) ((Object) jf.field_C.field_pc.e((byte) 125));
              L6: while (true) {
                if (var4 == null) {
                  break L0;
                } else {
                  if (var5 == 0) {
                    L7: {
                      if (param3 != var4.field_x) {
                        break L7;
                      } else {
                        var4.a(ug.field_b, 31785, true);
                        break L7;
                      }
                    }
                    var4 = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                    continue L6;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4_ref), "rv.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "FROM ONLY";
    }
}
