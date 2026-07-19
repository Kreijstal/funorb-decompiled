/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static da field_g;
    String field_d;
    boolean field_c;
    String[] field_a;
    boolean field_f;
    int field_b;
    static int field_e;

    final static void a(byte param0) {
        if (param0 != -128) {
            wg.a(false);
        }
    }

    final static java.net.URL a(String param0, int param1, String param2, int param3, java.net.URL param4) {
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
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_46_0 = null;
            java.net.URL stackIn_48_0 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            String stackIn_58_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_45_0 = null;
            java.net.URL stackOut_47_0 = null;
            java.net.URL stackOut_2_0 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            String stackOut_53_2 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            RuntimeException stackOut_57_0 = null;
            StringBuilder stackOut_57_1 = null;
            String stackOut_57_2 = null;
            RuntimeException stackOut_56_0 = null;
            StringBuilder stackOut_56_1 = null;
            String stackOut_56_2 = null;
            var9 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                var5_ref = param4.getFile();
                if (param1 == -7362) {
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      if (var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', var6 + 1);
                        if (0 <= var7_int) {
                          L3: {
                            if ((param3 ^ -1) > -1) {
                              break L3;
                            } else {
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          var6 = var7_int;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L2;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          var6 = var7_int;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (!var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          L6: {
                            if (param0 == null) {
                              break L6;
                            } else {
                              var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var6 = var7_int;
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L8;
                        } else {
                          if (var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L8;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', var6 + 1);
                      if (var7_int >= 0) {
                        L9: {
                          if (param2 != null) {
                            break L9;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L1;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L10: {
                      var7 = new StringBuilder(var6);
                      discarded$10 = var7.append(var5_ref.substring(0, var6));
                      if ((param3 ^ -1) >= -1) {
                        break L10;
                      } else {
                        discarded$11 = var7.append("/l=");
                        discarded$12 = var7.append(Integer.toString(param3));
                        break L10;
                      }
                    }
                    L11: {
                      if (param0 == null) {
                        break L11;
                      } else {
                        if (-1 > (param0.length() ^ -1)) {
                          discarded$13 = var7.append("/p=");
                          discarded$14 = var7.append(param0);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (param2 == null) {
                        break L12;
                      } else {
                        if (0 >= param2.length()) {
                          break L12;
                        } else {
                          discarded$15 = var7.append("/s=");
                          discarded$16 = var7.append(param2);
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (var5_ref.length() <= var6) {
                        discarded$17 = var7.append('/');
                        break L13;
                      } else {
                        discarded$18 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        if (var9 == 0) {
                          break L13;
                        } else {
                          discarded$19 = var7.append('/');
                          break L13;
                        }
                      }
                    }
                    try {
                      L14: {
                        stackOut_45_0 = new java.net.URL(param4, var7.toString());
                        stackIn_46_0 = stackOut_45_0;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_47_0 = (java.net.URL) (param4);
                      stackIn_48_0 = stackOut_47_0;
                      return stackIn_48_0;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = (java.net.URL) null;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L15: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_49_0 = (RuntimeException) (var5);
                stackOut_49_1 = new StringBuilder().append("wg.B(");
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param0 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L15;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L15;
                }
              }
              L16: {
                stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
                stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param1).append(',');
                stackIn_54_0 = stackOut_52_0;
                stackIn_54_1 = stackOut_52_1;
                stackIn_53_0 = stackOut_52_0;
                stackIn_53_1 = stackOut_52_1;
                if (param2 == null) {
                  stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
                  stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
                  stackOut_54_2 = "null";
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  break L16;
                } else {
                  stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
                  stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackOut_53_2 = "{...}";
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  stackIn_55_2 = stackOut_53_2;
                  break L16;
                }
              }
              L17: {
                stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
                stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param3).append(',');
                stackIn_57_0 = stackOut_55_0;
                stackIn_57_1 = stackOut_55_1;
                stackIn_56_0 = stackOut_55_0;
                stackIn_56_1 = stackOut_55_1;
                if (param4 == null) {
                  stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
                  stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
                  stackOut_57_2 = "null";
                  stackIn_58_0 = stackOut_57_0;
                  stackIn_58_1 = stackOut_57_1;
                  stackIn_58_2 = stackOut_57_2;
                  break L17;
                } else {
                  stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
                  stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
                  stackOut_56_2 = "{...}";
                  stackIn_58_0 = stackOut_56_0;
                  stackIn_58_1 = stackOut_56_1;
                  stackIn_58_2 = stackOut_56_2;
                  break L17;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_46_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od a(byte param0, da param1, int param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        od stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        od stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (l.a(param0 + 62, param3, param2, param1)) {
              L1: {
                if (param0 == 47) {
                  break L1;
                } else {
                  discarded$2 = wg.a('￧', (byte) -104);
                  break L1;
                }
              }
              stackOut_5_0 = ea.e((byte) 113);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("wg.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (od) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (param1 <= -104) {
            if (!gb.a(param0, 121)) {
              L0: {
                if (param0 == 45) {
                  break L0;
                } else {
                  if (param0 == 160) {
                    break L0;
                  } else {
                    if (param0 == 32) {
                      break L0;
                    } else {
                      if (param0 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          } else {
            field_e = 70;
            if (!gb.a(param0, 121)) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (param0 == 95) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          }
        }
    }

    wg(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        java.net.URL discarded$2 = null;
        java.net.URL var2 = null;
        if (!param0) {
          var2 = (java.net.URL) null;
          discarded$2 = wg.a((String) null, -62, (String) null, -119, (java.net.URL) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    static {
        field_e = -480;
    }
}
