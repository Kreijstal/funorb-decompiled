/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

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
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            var9 = SolKnight.field_L ? 1 : 0;
            var5 = param4.getFile();
            if (param1 == -7362) {
              var6 = 0;
              L0: while (true) {
                L1: {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        if ((param3 ^ -1) > -1) {
                          break L1;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L0;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var5.regionMatches(var6, "/a=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (0 <= var7_int) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                      break L4;
                    } else {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 >= (var7_int ^ -1)) {
                        if (param0 != null) {
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
                  }
                  L5: {
                    L6: {
                      if (var5.regionMatches(var6, "/s=", 0, 3)) {
                        break L6;
                      } else {
                        if (var5.regionMatches(var6, "/c=", 0, 3)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (var7_int >= 0) {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                    if ((param3 ^ -1) >= -1) {
                      break L7;
                    } else {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                      break L7;
                    }
                  }
                  L8: {
                    if (param0 == null) {
                      if (param2 == null) {
                        break L8;
                      } else {
                        if (0 >= param2.length()) {
                          break L8;
                        } else {
                          StringBuilder discarded$12 = var7.append("/s=");
                          StringBuilder discarded$13 = var7.append(param2);
                          break L8;
                        }
                      }
                    } else {
                      if (param2 == null) {
                        break L8;
                      } else {
                        if (0 >= param2.length()) {
                          break L8;
                        } else {
                          StringBuilder discarded$14 = var7.append("/s=");
                          StringBuilder discarded$15 = var7.append(param2);
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (var5.length() <= var6) {
                      StringBuilder discarded$16 = var7.append(47);
                      break L9;
                    } else {
                      StringBuilder discarded$17 = var7.append(var5.substring(var6, var5.length()));
                      break L9;
                    }
                  }
                  try {
                    L10: {
                      stackOut_43_0 = new java.net.URL(param4, var7.toString());
                      stackIn_44_0 = stackOut_43_0;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    return param4;
                  }
                  return stackIn_44_0;
                }
                var6 = var7_int;
                continue L0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od a(byte param0, da param1, int param2, int param3) {
        if (l.a(param0 + 62, param3, param2, param1)) {
          if (param0 != 47) {
            boolean discarded$2 = wg.a('￧', (byte) -104);
            return ea.e((byte) 113);
          } else {
            return ea.e((byte) 113);
          }
        } else {
          return null;
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
        ((wg) this).field_c = param0 ? true : false;
    }

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          java.net.URL discarded$2 = wg.a((String) null, -62, (String) null, -119, (java.net.URL) null);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -480;
    }
}
