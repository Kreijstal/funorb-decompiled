/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static String field_b;
    static long field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param1.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    if (param0 == 20104) {
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(gf.a(3, var5, param1), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var2_ref2);

                stackIn_11_1 = new StringBuilder().append("rf.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    final static java.net.URL a(int param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_39_0 = null;
            java.net.URL stackIn_41_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            StringBuilder stackIn_47_1 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                var5 = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 + 1);
                        if (0 > var7_int) {
                          break L3;
                        } else {
                          if (0 > param0) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int < 0) {
                          break L4;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 > var7_int) {
                          break L5;
                        } else {
                          if (param4 == null) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        if (param2 == null) {
                          break L2;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param3 < param0) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param0));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param4 == null) {
                        break L9;
                      } else {
                        if (0 < param4.length()) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param4);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) >= -1) {
                          break L10;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param2);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var6 >= var5.length()) {
                        discarded$7 = var7.append('/');
                        break L11;
                      } else {
                        discarded$8 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        stackIn_39_0 = new java.net.URL(param1, var7.toString());
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_41_0 = (java.net.URL) (param1);
                      return stackIn_41_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_44_0 = (RuntimeException) (var5_ref);

                stackIn_44_1 = new StringBuilder().append("rf.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "null";
                  break L13;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackIn_45_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_47_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',');

                if (param2 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L14;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L15;
                } else {
                  stackIn_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L15;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_45_0), stackIn_51_2 + ')');
            }
            return stackIn_39_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 == -10) {
                  break L4;
                } else {
                  rf.a(48);
                  break L4;
                }
              }
              L5: {
                if (0 == param1) {
                  break L5;
                } else {
                  var6 = ne.field_d;
                  var2 = var6;
                  var3 = 0;
                  L6: while (true) {
                    if (var3 >= var6.length) {
                      break L5;
                    } else {
                      var4 = var6[var3];
                      if (var4 == param1) {
                        stackIn_17_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var3++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              stackIn_20_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
            stackIn_8_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "rf.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    final synchronized static long c(int param0) {
        if (param0 != 0) {
            rf.c(3);
        }
        long var1 = System.currentTimeMillis();
        if (!((var1 ^ -1L) <= (fh.field_g ^ -1L))) {
            th.field_k = th.field_k + (fh.field_g + -var1);
        }
        fh.field_g = var1;
        return th.field_k + var1;
    }

    final static int a(int param0, int param1) {
        if (param1 != 47) {
            return 5;
        }
        return param0 != 0 ? -1 < (param0 ^ -1) ? -1 : 1 : 0;
    }

    final static int a(int param0) {
        if (param0 != 30448) {
            field_c = 74;
        }
        return uc.field_eb;
    }

    static {
        field_a = 0L;
    }
}
