/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rr {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6537) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(jf.a(param1, var2, -49), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param0 > -39) {
              field_a = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("rr.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static char a(char param0, byte param1) {
        if (param1 == -70) {
          int var2 = param0;
          if (32 == var2) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (91 != var2) {
            if (var2 == 93) {
              return param0;
            }
            if (var2 != 35) {
              if (var2 != 224 &&
                var2 != 225 &&
                var2 != 226 &&
                var2 != 228 &&
                var2 != 227 &&
                var2 != 192 &&
                var2 != 193 &&
                var2 != 194 &&
                196 != var2 &&
                195 != var2) {
                if (232 != var2 &&
                  var2 != 233 &&
                  var2 != 234 &&
                  var2 != 235 &&
                  var2 != 200 &&
                  var2 != 201 &&
                  var2 != 202 &&
                  var2 != 203) {
                  if (237 != var2 &&
                    var2 != 238 &&
                    var2 != 239 &&
                    205 != var2 &&
                    var2 != 206 &&
                    var2 != 207) {
                    if (var2 != 242 &&
                      var2 != 243 &&
                      244 != var2 &&
                      var2 != 246 &&
                      var2 != 245 &&
                      210 != var2 &&
                      211 != var2 &&
                      var2 != 212 &&
                      var2 != 214 &&
                      var2 != 213) {
                      if (249 != var2 &&
                        var2 != 250 &&
                        var2 != 251 &&
                        var2 != 252 &&
                        217 != var2) {
                        if (var2 == 218) {
                          return 'u';
                        }
                        if (var2 == 219) {
                          return 'u';
                        }
                        if (var2 == 220) {
                          return 'u';
                        }
                        if (231 == var2) {
                          return 'c';
                        }
                        if (var2 == 199) {
                          return 'c';
                        }
                        if (var2 == 255) {
                          return 'y';
                        }
                        if (var2 == 376) {
                          return 'y';
                        }
                        if (241 != var2 &&
                          var2 != 209) {
                          if (var2 != 223) {
                            return Character.toLowerCase(param0);
                          }
                          return 'b';
                        }
                        return 'n';
                      }
                      return 'u';
                    }
                    return 'o';
                  }
                  return 'i';
                }
                return 'e';
              }
              return 'a';
            }
          }
          return param0;
        }
        java.applet.Applet var3 = (java.applet.Applet) null;
        rr.a((byte) 58, (java.applet.Applet) null);
        int var2Lifetime1 = param0;
        if (32 == var2Lifetime1) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          var2Lifetime1 != 45) {
          if (91 != var2Lifetime1 &&
            var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (var2Lifetime1 != 224 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194 &&
              196 != var2Lifetime1 &&
              195 != var2Lifetime1) {
              if (232 != var2Lifetime1 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234 &&
                var2Lifetime1 != 235 &&
                var2Lifetime1 != 200) {
                if (var2Lifetime1 == 201) {
                  return 'e';
                }
                if (var2Lifetime1 == 202) {
                  return 'e';
                }
                if (var2Lifetime1 != 203) {
                  if (237 != var2Lifetime1 &&
                    var2Lifetime1 != 238 &&
                    var2Lifetime1 != 239) {
                    if (205 == var2Lifetime1) {
                      return 'i';
                    }
                    if (var2Lifetime1 != 206 &&
                      var2Lifetime1 != 207) {
                      if (var2Lifetime1 != 242 &&
                        var2Lifetime1 != 243 &&
                        244 != var2Lifetime1) {
                        if (var2Lifetime1 == 246) {
                          return 'o';
                        }
                        if (var2Lifetime1 != 245) {
                          if (210 == var2Lifetime1) {
                            return 'o';
                          }
                          if (211 == var2Lifetime1) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 212) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 214) {
                            return 'o';
                          }
                          if (var2Lifetime1 == 213) {
                            return 'o';
                          }
                          if (249 != var2Lifetime1) {
                            if (var2Lifetime1 == 250) {
                              return 'u';
                            }
                            if (var2Lifetime1 == 251) {
                              return 'u';
                            }
                            if (var2Lifetime1 != 252) {
                              if (217 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 218) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 219) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 220) {
                                return 'u';
                              }
                              if (231 == var2Lifetime1) {
                                return 'c';
                              }
                              if (var2Lifetime1 == 199) {
                                return 'c';
                              }
                              if (var2Lifetime1 == 255) {
                                return 'y';
                              }
                              if (var2Lifetime1 == 376) {
                                return 'y';
                              }
                              if (241 != var2Lifetime1 &&
                                var2Lifetime1 != 209) {
                                if (var2Lifetime1 != 223) {
                                  return Character.toLowerCase(param0);
                                }
                                return 'b';
                              }
                              return 'n';
                            }
                          }
                          return 'u';
                        }
                      }
                      return 'o';
                    }
                  }
                  return 'i';
                }
              }
              return 'e';
            }
            return 'a';
          }
          return param0;
        }
        return '_';
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
          try {
            ac.field_d = param0;
            try {
              String var3 = param2.getParameter("cookieprefix");
              if (param1 > -105) {
                field_a = (String) null;
              }
              String var4 = param2.getParameter("cookiehost");
              String var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (0 == param0.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              fe.a(param2, -7012, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            v.a(true, param2);
          } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "rr.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        String var0 = "Unknown";
        try {
          var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_b = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_a = var0.toLowerCase();
        var0 = "Unknown";
        try {
          var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        var0.toLowerCase();
        var0 = "~/";
        try {
          var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$0 = new File(var0);
    }
}
