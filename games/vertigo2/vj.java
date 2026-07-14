/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class vj {
    static er[] field_b;
    static nj field_d;
    static int field_c;
    static int[] field_f;
    static boolean field_h;
    static String field_a;
    static String field_e;
    static fe[] field_g;

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = Vertigo2.field_L ? 1 : 0;
        if (param0 <= param9) {
          if (param9 >= param15) {
            if (param0 >= param15) {
              pq.a(param10, param14, param11, param9, param7, param12, param2, param15, param5, param3, param13, param6, param8, bi.field_l, true, param4, param0);
              if (param1 == -122) {
                return;
              } else {
                field_d = null;
                return;
              }
            } else {
              pq.a(param14, param10, param8, param9, param7, param3, param4, param0, param5, param12, param13, param6, param11, bi.field_l, true, param2, param15);
              if (param1 == -122) {
                return;
              } else {
                field_d = null;
                return;
              }
            }
          } else {
            pq.a(param14, param6, param8, param15, param12, param3, param13, param0, param11, param7, param4, param10, param5, bi.field_l, true, param2, param9);
            if (param1 == -122) {
              return;
            } else {
              field_d = null;
              return;
            }
          }
        } else {
          if (param15 > param0) {
            pq.a(param6, param14, param5, param15, param12, param7, param2, param9, param11, param3, param4, param10, param8, bi.field_l, true, param13, param0);
            if (param1 == -122) {
              return;
            } else {
              field_d = null;
              return;
            }
          } else {
            if (param15 <= param9) {
              pq.a(param10, param6, param11, param0, param3, param12, param13, param15, param8, param7, param2, param14, param5, bi.field_l, true, param4, param9);
              if (param1 == -122) {
                return;
              } else {
                field_d = null;
                return;
              }
            } else {
              pq.a(param6, param10, param5, param0, param3, param7, param4, param9, param8, param12, param2, param14, param11, bi.field_l, true, param13, param15);
              if (param1 == -122) {
                return;
              } else {
                field_d = null;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_d = null;
        field_f = null;
        field_e = null;
        if (param0 == -11590) {
          return;
        } else {
          var2 = null;
          String discarded$2 = vj.a((CharSequence) null, (byte) 1);
          return;
        }
    }

    final static String a(CharSequence param0, byte param1) {
        String var2 = null;
        Object var3 = null;
        if (param1 != 8) {
          L0: {
            var3 = null;
            String discarded$2 = vj.a((CharSequence) null, (byte) -56);
            var2 = eq.a(0, kq.a((byte) 85, param0));
            if (var2 != null) {
              break L0;
            } else {
              var2 = "";
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = eq.a(0, kq.a((byte) 85, param0));
            if (var2 != null) {
              break L1;
            } else {
              var2 = "";
              break L1;
            }
          }
          return var2;
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, String param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_39_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_38_0 = null;
            var9 = Vertigo2.field_L ? 1 : 0;
            var5 = param4.getFile();
            var6 = 0;
            if (param2 <= -112) {
              L0: while (true) {
                L1: {
                  if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                    break L1;
                  } else {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 > var7_int) {
                      break L1;
                    } else {
                      if (-1 < (param0 ^ -1)) {
                        var6 = var7_int;
                        continue L0;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  }
                }
                L2: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L3;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 <= var7_int) {
                      if (param3 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L3;
                    }
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
                  if (-1 >= (var7_int ^ -1)) {
                    if (param1 != null) {
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
                  if (-1 <= (param0 ^ -1)) {
                    break L6;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                    break L6;
                  }
                }
                L7: {
                  if (param3 == null) {
                    if (param1 == null) {
                      break L7;
                    } else {
                      if (0 >= param1.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$12 = var7.append("/s=");
                        StringBuilder discarded$13 = var7.append(param1);
                        break L7;
                      }
                    }
                  } else {
                    if (param1 == null) {
                      break L7;
                    } else {
                      if (0 >= param1.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param1);
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (var6 < var5.length()) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L8;
                  }
                }
                try {
                  stackOut_38_0 = new java.net.URL(param4, var7.toString());
                  stackIn_39_0 = stackOut_38_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_39_0;
                }
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

    final static void a(byte param0, String[] param1) {
        if (param0 >= -32) {
          return;
        } else {
          L0: {
            if (null != vd.field_b) {
              vd.field_b.field_V.a(param1, -1546);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != lj.field_m) {
              lj.field_m.field_K.a(param1, -1546);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Send private message";
        field_a = "Waiting for extra data";
    }
}
