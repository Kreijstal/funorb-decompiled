/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rr {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException var2_ref = null;
            Exception var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
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
                    var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                    param1.getAppletContext().showDocument(jf.a(param1, var2, -49), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref2 = (Exception) (Object) decompiledCaughtException;
                    var2_ref2.printStackTrace();
                    break L2;
                  }
                }
                if (param0 <= -39) {
                  break L0;
                } else {
                  field_a = null;
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref;
                stackOut_6_1 = new StringBuilder().append("rr.C(").append(param0).append(44);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        var2 = param0;
        if (32 != var2) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (var2 != 45) {
                if (91 != var2) {
                  if (var2 != 93) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (var2 != 226) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (var2 != 192) {
                                  if (var2 != 193) {
                                    if (var2 != 194) {
                                      if (196 != var2) {
                                        if (195 != var2) {
                                          if (232 != var2) {
                                            if (var2 != 233) {
                                              if (var2 != 234) {
                                                if (var2 != 235) {
                                                  if (var2 != 200) {
                                                    if (var2 != 201) {
                                                      if (var2 != 202) {
                                                        if (var2 != 203) {
                                                          if (237 != var2) {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (205 != var2) {
                                                                  if (var2 != 206) {
                                                                    if (var2 == 207) {
                                                                      return 'i';
                                                                    } else {
                                                                      if (var2 != 242) {
                                                                        if (var2 != 243) {
                                                                          if (244 != var2) {
                                                                            if (var2 != 246) {
                                                                              if (var2 != 245) {
                                                                                if (210 != var2) {
                                                                                  if (211 != var2) {
                                                                                    if (var2 != 212) {
                                                                                      if (var2 != 214) {
                                                                                        if (var2 != 213) {
                                                                                          L0: {
                                                                                            if (249 == var2) {
                                                                                              break L0;
                                                                                            } else {
                                                                                              if (var2 != 250) {
                                                                                                if (var2 != 251) {
                                                                                                  if (var2 == 252) {
                                                                                                    break L0;
                                                                                                  } else {
                                                                                                    if (217 != var2) {
                                                                                                      if (var2 != 218) {
                                                                                                        if (var2 != 219) {
                                                                                                          if (var2 != 220) {
                                                                                                            if (231 != var2) {
                                                                                                              if (var2 == 199) {
                                                                                                                return 'c';
                                                                                                              } else {
                                                                                                                if (var2 != 255) {
                                                                                                                  if (var2 != 376) {
                                                                                                                    L1: {
                                                                                                                      if (241 == var2) {
                                                                                                                        break L1;
                                                                                                                      } else {
                                                                                                                        if (var2 == 209) {
                                                                                                                          break L1;
                                                                                                                        } else {
                                                                                                                          if (var2 != 223) {
                                                                                                                            return Character.toLowerCase(param0);
                                                                                                                          } else {
                                                                                                                            return 'b';
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    return 'n';
                                                                                                                  } else {
                                                                                                                    return 'y';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              } else {
                                                                                                return 'u';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'u';
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'o';
                                                                      }
                                                                    }
                                                                  } else {
                                                                    return 'i';
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'i';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  } else {
                                                    return 'e';
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param0;
                    }
                  } else {
                    return param0;
                  }
                } else {
                  return param0;
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                ac.field_d = param0;
                try {
                    var3 = param2.getParameter("cookieprefix");
                    if (param1 > -105) {
                        field_a = null;
                    }
                    var4 = param2.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(0 != param0.length())) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    fe.a(param2, -7012, "document.cookie=\"" + var5 + "\"");
                } catch (Throwable throwable) {
                }
                v.a(true, param2);
            } catch (RuntimeException runtimeException) {
                throw pn.a((Throwable) (Object) runtimeException, "rr.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
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
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
    }
}
