/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static int[] field_a;
    static int[][] field_h;
    static int field_f;
    static cd field_d;
    static int[] field_c;
    static int[] field_b;
    static int[] field_e;
    static String field_i;
    static long field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_h = (int[][]) null;
        field_b = null;
        field_d = null;
        field_i = null;
        if (param0 <= 103) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            L1: {
              kk.field_c = param2;
              ob.field_F = param3;
              jj.a(param1, gb.field_c, 1702);
              if (param0 >= 58) {
                break L1;
              } else {
                fd.a(-9);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("fd.B(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var1 = el.field_n;
          synchronized (var1) {
            L0: {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_f = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    bg.field_l = bf.field_B;
                    vd.field_a = vd.field_a + 1;
                    if (0 <= j.field_b) {
                      break L4;
                    } else {
                      var2 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (112 <= var2) {
                              break L7;
                            } else {
                              ve.field_B[var2] = false;
                              var2++;
                              if (var4 != 0) {
                                break L6;
                              } else {
                                if (var4 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          j.field_b = sc.field_a;
                          break L6;
                        }
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: while (true) {
                    if (sc.field_a == j.field_b) {
                      break L3;
                    } else {
                      var2 = se.field_p[sc.field_a];
                      sc.field_a = 127 & sc.field_a + 1;
                      stackOut_14_0 = var2;
                      stackIn_21_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L9: {
                          L10: {
                            if (stackIn_15_0 < 0) {
                              break L10;
                            } else {
                              ve.field_B[var2] = true;
                              if (var4 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          ve.field_B[var2 ^ -1] = false;
                          break L9;
                        }
                        if (var4 == 0) {
                          continue L8;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_20_0 = dk.field_i;
                stackIn_21_0 = stackOut_20_0;
                break L2;
              }
              bf.field_B = stackIn_21_0;
              break L0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (var1), "fd.D(" + param0 + ')');
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
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
            java.net.URL stackIn_48_0 = null;
            java.net.URL stackIn_50_0 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            String stackIn_57_2 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            String stackIn_60_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_47_0 = null;
            java.net.URL stackOut_49_0 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            RuntimeException stackOut_56_0 = null;
            StringBuilder stackOut_56_1 = null;
            String stackOut_56_2 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_57_0 = null;
            StringBuilder stackOut_57_1 = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            String stackOut_59_2 = null;
            RuntimeException stackOut_58_0 = null;
            StringBuilder stackOut_58_1 = null;
            String stackOut_58_2 = null;
            var9 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                var5_ref = param3.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      L4: {
                        if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                          break L4;
                        } else {
                          var7_int = var5_ref.indexOf('/', var6 - -1);
                          var11 = var7_int;
                          var10 = 0;
                          if (var9 != 0) {
                            if (var10 < var11) {
                              break L2;
                            } else {
                              break L3;
                            }
                          } else {
                            if (var10 > var11) {
                              break L4;
                            } else {
                              L5: {
                                if (-1 >= (param0 ^ -1)) {
                                  break L5;
                                } else {
                                  var6 = var7_int;
                                  if (var9 == 0) {
                                    continue L1;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 - -1);
                        if (-1 < (var7_int ^ -1)) {
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
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        L7: {
                          if (param4 != null) {
                            break L7;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L8: {
                    L9: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L9;
                      } else {
                        if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var7_int = var5_ref.indexOf('/', var6 + 1);
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
                    if (param2 == 130) {
                      break L11;
                    } else {
                      field_d = (cd) null;
                      break L11;
                    }
                  }
                  L12: {
                    if ((param0 ^ -1) >= -1) {
                      break L12;
                    } else {
                      discarded$11 = var7.append("/l=");
                      discarded$12 = var7.append(Integer.toString(param0));
                      break L12;
                    }
                  }
                  L13: {
                    if (param4 == null) {
                      break L13;
                    } else {
                      if (param4.length() > 0) {
                        discarded$13 = var7.append("/p=");
                        discarded$14 = var7.append(param4);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (param1 == null) {
                      break L14;
                    } else {
                      if (-1 > (param1.length() ^ -1)) {
                        discarded$15 = var7.append("/s=");
                        discarded$16 = var7.append(param1);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5_ref.length() > var6) {
                      discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                      break L15;
                    } else {
                      discarded$18 = var7.append('/');
                      if (var9 == 0) {
                        break L15;
                      } else {
                        discarded$19 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L15;
                      }
                    }
                  }
                  try {
                    L16: {
                      stackOut_47_0 = new java.net.URL(param3, var7.toString());
                      stackIn_48_0 = stackOut_47_0;
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackOut_49_0 = (java.net.URL) (param3);
                    stackIn_50_0 = stackOut_49_0;
                    return stackIn_50_0;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L17: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_51_0 = (RuntimeException) (var5);
                stackOut_51_1 = new StringBuilder().append("fd.C(").append(param0).append(',');
                stackIn_53_0 = stackOut_51_0;
                stackIn_53_1 = stackOut_51_1;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                if (param1 == null) {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "null";
                  stackIn_54_0 = stackOut_53_0;
                  stackIn_54_1 = stackOut_53_1;
                  stackIn_54_2 = stackOut_53_2;
                  break L17;
                } else {
                  stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                  stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackOut_52_2 = "{...}";
                  stackIn_54_0 = stackOut_52_0;
                  stackIn_54_1 = stackOut_52_1;
                  stackIn_54_2 = stackOut_52_2;
                  break L17;
                }
              }
              L18: {
                stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',').append(param2).append(',');
                stackIn_56_0 = stackOut_54_0;
                stackIn_56_1 = stackOut_54_1;
                stackIn_55_0 = stackOut_54_0;
                stackIn_55_1 = stackOut_54_1;
                if (param3 == null) {
                  stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
                  stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
                  stackOut_56_2 = "null";
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  stackIn_57_2 = stackOut_56_2;
                  break L18;
                } else {
                  stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                  stackOut_55_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackOut_55_2 = "{...}";
                  stackIn_57_0 = stackOut_55_0;
                  stackIn_57_1 = stackOut_55_1;
                  stackIn_57_2 = stackOut_55_2;
                  break L18;
                }
              }
              L19: {
                stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
                stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(',');
                stackIn_59_0 = stackOut_57_0;
                stackIn_59_1 = stackOut_57_1;
                stackIn_58_0 = stackOut_57_0;
                stackIn_58_1 = stackOut_57_1;
                if (param4 == null) {
                  stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
                  stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
                  stackOut_59_2 = "null";
                  stackIn_60_0 = stackOut_59_0;
                  stackIn_60_1 = stackOut_59_1;
                  stackIn_60_2 = stackOut_59_2;
                  break L19;
                } else {
                  stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
                  stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
                  stackOut_58_2 = "{...}";
                  stackIn_60_0 = stackOut_58_0;
                  stackIn_60_1 = stackOut_58_1;
                  stackIn_60_2 = stackOut_58_2;
                  break L19;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ')');
            }
            return stackIn_48_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[]{0, 3, 17, 12, 13, 4, 2, 14, 11}, (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[]{1, 12, 13, 4, 3, 7}, (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[]{21, 12, 13, 4, 3, 22}, (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[]{15, 5}, (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[]{18, 6, 19, 20}, (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[]{15, 5}, (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[]{2, 5}, (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[]{15, 16}, (byte) 57, 443, 197, 260);
    }
}
