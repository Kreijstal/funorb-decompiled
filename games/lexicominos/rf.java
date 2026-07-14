/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class rf {
    static int field_c;
    static String field_b;
    static long field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            int var3 = var2.indexOf('?');
            String var4 = "reload.ws";
            if (!(var3 < 0)) {
                var4 = var4 + var2.substring(var3);
            }
            if (param0 != 20104) {
                return;
            }
            try {
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(gf.a(3, var5, param1), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            var9 = Lexicominos.field_L ? 1 : 0;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (0 > var7_int) {
                    break L1;
                  } else {
                    if (0 > param0) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                  break L2;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int < 0) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L3;
                  } else {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 + 1);
                if (0 <= var7_int) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (param3 < param0) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param4 == null) {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if ((param2.length() ^ -1) >= -1) {
                      break L7;
                    } else {
                      StringBuilder discarded$12 = var7.append("/s=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L7;
                    }
                  }
                } else {
                  if (param2 == null) {
                    break L7;
                  } else {
                    if ((param2.length() ^ -1) >= -1) {
                      break L7;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$16 = var7.append(47);
                  break L8;
                } else {
                  StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                  break L8;
                }
              }
              try {
                stackOut_40_0 = new java.net.URL(param1, var7.toString());
                stackIn_41_0 = stackOut_40_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_41_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = Lexicominos.field_L ? 1 : 0;
            if (param1 <= 0) {
              break L1;
            } else {
              if (param1 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param1 < 160) {
              L3: {
                if (param0 == -10) {
                  break L3;
                } else {
                  int discarded$18 = rf.a(48);
                  break L3;
                }
              }
              if (0 == param1) {
                break L2;
              } else {
                var6 = ne.field_d;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (var4 == param1) {
                      return true;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              if (param1 <= 255) {
                break L0;
              } else {
                L5: {
                  if (param0 == -10) {
                    break L5;
                  } else {
                    int discarded$19 = rf.a(48);
                    break L5;
                  }
                }
                if (0 == param1) {
                  break L2;
                } else {
                  var6 = ne.field_d;
                  var2 = var6;
                  var3 = 0;
                  L6: while (true) {
                    if (var3 >= var6.length) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (var4 == param1) {
                        return true;
                      } else {
                        var3++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    final synchronized static long c(int param0) {
        if (param0 != 0) {
        }
        long var1 = System.currentTimeMillis();
        if (!((var1 ^ -1L) <= (fh.field_g ^ -1L))) {
            th.field_k = th.field_k + (fh.field_g + -var1);
        }
        fh.field_g = var1;
        return th.field_k + var1;
    }

    final static int a(int param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 == 47) {
          L0: {
            if (param0 == -1) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              if (-1 <= param0) {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_7_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          return stackIn_7_0;
        } else {
          return 5;
        }
    }

    final static int a(int param0) {
        if (param0 != 30448) {
            field_c = 74;
        }
        return uc.field_eb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0L;
    }
}
