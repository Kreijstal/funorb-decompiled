/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.net.ProxySelector;
import java.net.URI;
import java.net.Socket;

final class fl extends oe {
    static String field_g;
    static hl[] field_f;
    static String field_i;
    private java.net.ProxySelector field_j;
    static wd field_h;
    static int[] field_e;

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 897584976) {
          L0: {
            L1: {
              if (null == ed.field_q) {
                break L1;
              } else {
                if (ed.field_q.k(param0 ^ 897584976) == null) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, byte param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = StarCannon.field_A;
          if (param0 < 0) {
            break L0;
          } else {
            if (param8 >= gl.field_a) {
              break L0;
            } else {
              L1: {
                if (param5 >= 0) {
                  break L1;
                } else {
                  if (param1 >= 0) {
                    break L1;
                  } else {
                    if (param3 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (param5 < gl.field_f) {
                  break L2;
                } else {
                  if (param1 < gl.field_f) {
                    break L2;
                  } else {
                    if (gl.field_f > param3) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param7 == -43) {
                L3: {
                  L4: {
                    var14 = param0 - param8;
                    if (param4 == param8) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var10 = param5 << 1502669744;
                          var9 = param5 << 1502669744;
                          var15 = -param8 + param4;
                          var12 = (-param5 + param3 << 156289840) / var14;
                          var11 = (param1 + -param5 << 606068112) / var15;
                          if (var11 < var12) {
                            break L6;
                          } else {
                            var13 = 1;
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var13 = 0;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param8 < 0) {
                            L9: {
                              if (param4 < 0) {
                                break L9;
                              } else {
                                param8 = -param8;
                                var9 = var9 + param8 * var11;
                                var10 = var10 + param8 * var12;
                                param8 = 0;
                                if (0 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            param8 = param4 + -param8;
                            var9 = var9 + var11 * param8;
                            var10 = var10 + param8 * var12;
                            param8 = param4;
                            if (0 == 0) {
                              break L7;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var16 = gl.field_c[param8];
                        L10: while (true) {
                          if (param8 >= param4) {
                            break L7;
                          } else {
                            L11: {
                              var17 = var9 >> 1475987568;
                              if (var17 >= gl.field_f) {
                                break L11;
                              } else {
                                L12: {
                                  var18 = (var10 >> 1339306544) - (var9 >> 1812992816);
                                  if (var18 != 0) {
                                    break L12;
                                  } else {
                                    if (0 > var17) {
                                      break L11;
                                    } else {
                                      if (var17 < gl.field_f) {
                                        qd.a(var18, 125, var16 + var17, param2, param6);
                                        if (0 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                L13: {
                                  if (var18 + var17 >= gl.field_f) {
                                    var18 = -1 + (gl.field_f + -var17);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                L14: {
                                  if (var17 < 0) {
                                    break L14;
                                  } else {
                                    qd.a(var18, 56, var16 + var17, param2, param6);
                                    if (0 == 0) {
                                      break L11;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                qd.a(var17 + var18, 27, var16, param2, param6);
                                break L11;
                              }
                            }
                            param8++;
                            if (param8 < gl.field_a) {
                              var16 = var16 + ki.field_j;
                              var10 = var10 + var12;
                              var9 = var9 + var11;
                              if (0 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      L15: {
                        L16: {
                          var16 = -param4 + param0;
                          if (var16 == 0) {
                            break L16;
                          } else {
                            L17: {
                              L18: {
                                if (var13 != 0) {
                                  break L18;
                                } else {
                                  var9 = param1 << 1795637232;
                                  if (0 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              var10 = param1 << 1753558256;
                              break L17;
                            }
                            var17 = param3 << 140410736;
                            var12 = (-var10 + var17) / var16;
                            var11 = (-var9 + var17) / var16;
                            if (0 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var12 = 0;
                        var11 = 0;
                        break L15;
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L19: {
                    L20: {
                      if (param0 != param8) {
                        break L20;
                      } else {
                        var12 = 0;
                        var10 = param1 << -182089648;
                        var9 = param5 << -1077607792;
                        var11 = 0;
                        if (0 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var15 = param0 + -param4;
                      if (param1 <= param5) {
                        break L21;
                      } else {
                        var12 = (-param1 + param3 << 897584976) / var15;
                        var11 = (param3 - param5 << 1015589904) / var14;
                        var10 = param1 << 632014672;
                        var9 = param5 << 1278467888;
                        if (0 == 0) {
                          break L19;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var12 = (param3 + -param5 << -568024176) / var14;
                    var11 = (param3 + -param1 << -1151943472) / var15;
                    var9 = param1 << 2106676816;
                    var10 = param5 << -56426768;
                    break L19;
                  }
                  L22: {
                    if (param8 >= 0) {
                      break L22;
                    } else {
                      param8 = Math.min(-param8, param4 - param8);
                      var9 = var9 + param8 * var11;
                      var10 = var10 + var12 * param8;
                      param8 = 0;
                      break L22;
                    }
                  }
                  var13 = 0;
                  break L3;
                }
                L23: {
                  if (param8 < 0) {
                    param8 = -param8;
                    var9 = var9 + param8 * var11;
                    var10 = var10 + param8 * var12;
                    param8 = 0;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                var15 = gl.field_c[param8];
                if (param8 < param0) {
                  L24: {
                    var16 = var9 >> 2064360880;
                    if (gl.field_f > var16) {
                      L25: {
                        var17 = (var10 >> 5714160) - (var9 >> -1810197168);
                        if (var17 != 0) {
                          break L25;
                        } else {
                          if (0 > var16) {
                            break L24;
                          } else {
                            if (var16 >= gl.field_f) {
                              break L24;
                            } else {
                              qd.a(var17, param7 ^ -45, var15 + var16, param2, param6);
                              if (0 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      L26: {
                        if (var16 + var17 >= gl.field_f) {
                          var17 = gl.field_f + -var16 - 1;
                          break L26;
                        } else {
                          break L26;
                        }
                      }
                      L27: {
                        if (var16 < 0) {
                          break L27;
                        } else {
                          qd.a(var17, 38, var16 + var15, param2, param6);
                          if (0 == 0) {
                            break L24;
                          } else {
                            break L27;
                          }
                        }
                      }
                      qd.a(var17 - -var16, 25, var15, param2, param6);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  param8++;
                  if (gl.field_a <= param8) {
                    return;
                  } else {
                    var9 = var9 + var11;
                    var15 = var15 + ki.field_j;
                    var10 = var10 + var12;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    fl() {
        ((fl) this).field_j = java.net.ProxySelector.getDefault();
    }

    private final java.net.Socket a(String param0, String param1, int param2, int param3) throws IOException {
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        String var15 = null;
        L0: {
          var12 = StarCannon.field_A;
          var13 = new java.net.Socket(param1, param3);
          var13.setSoTimeout(10000);
          var6 = var13.getOutputStream();
          if (param0 == null) {
            var6.write(("CONNECT " + ((fl) this).field_c + ":" + ((fl) this).field_d + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          } else {
            var6.write(("CONNECT " + ((fl) this).field_c + ":" + ((fl) this).field_d + " HTTP/1.0\n" + param0 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            break L0;
          }
        }
        L1: {
          var6.flush();
          var7 = new BufferedReader((Reader) (Object) new InputStreamReader(var13.getInputStream()));
          var14 = var7.readLine();
          var8 = var14;
          var8 = var14;
          if (var14 == null) {
            break L1;
          } else {
            L2: {
              if (var14.startsWith("HTTP/1.0 200")) {
                break L2;
              } else {
                if (!var14.startsWith("HTTP/1.1 200")) {
                  L3: {
                    if (var14.startsWith("HTTP/1.0 407")) {
                      break L3;
                    } else {
                      if (var14.startsWith("HTTP/1.1 407")) {
                        break L3;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var9 = 0;
                  var10 = "proxy-authenticate: ";
                  var8 = var10;
                  var8 = var10;
                  var8 = var7.readLine();
                  L4: while (true) {
                    if (var8 != null) {
                      if (50 > var9) {
                        if (var8.toLowerCase().startsWith(var10)) {
                          L5: {
                            var15 = var8.substring(var10.length()).trim();
                            var8 = var15;
                            var8 = var15;
                            var11 = var15.indexOf(' ');
                            if ((var11 ^ -1) == 0) {
                              break L5;
                            } else {
                              var8 = var15.substring(0, var11);
                              break L5;
                            }
                          }
                          throw new le(var8);
                        } else {
                          var9++;
                          var8 = var7.readLine();
                          continue L4;
                        }
                      } else {
                        throw new le("");
                      }
                    } else {
                      throw new le("");
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            return var13;
          }
        }
        var6.close();
        var7.close();
        var13.close();
        if (param2 == -20384) {
          return null;
        } else {
          fl.e(-64);
          return null;
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        le var7 = null;
        Object[] var8 = null;
        Object[] var8_array = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        le var12 = null;
        IOException var12_ref = null;
        java.net.Socket var12_ref2 = null;
        int var13 = 0;
        int stackIn_7_0 = 0;
        java.net.ProxySelector stackIn_9_0 = null;
        java.net.URI stackIn_9_1 = null;
        java.net.URI stackIn_9_2 = null;
        StringBuilder stackIn_9_3 = null;
        java.net.ProxySelector stackIn_10_0 = null;
        java.net.URI stackIn_10_1 = null;
        java.net.URI stackIn_10_2 = null;
        StringBuilder stackIn_10_3 = null;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_12_0 = null;
        java.net.URI stackIn_12_1 = null;
        java.net.URI stackIn_12_2 = null;
        StringBuilder stackIn_12_3 = null;
        java.net.ProxySelector stackIn_13_0 = null;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        StringBuilder stackIn_13_3 = null;
        java.net.ProxySelector stackIn_14_0 = null;
        java.net.URI stackIn_14_1 = null;
        java.net.URI stackIn_14_2 = null;
        StringBuilder stackIn_14_3 = null;
        String stackIn_14_4 = null;
        java.net.Socket stackIn_23_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        java.net.ProxySelector stackOut_8_0 = null;
        java.net.URI stackOut_8_1 = null;
        java.net.URI stackOut_8_2 = null;
        StringBuilder stackOut_8_3 = null;
        java.net.ProxySelector stackOut_9_0 = null;
        java.net.URI stackOut_9_1 = null;
        java.net.URI stackOut_9_2 = null;
        StringBuilder stackOut_9_3 = null;
        String stackOut_9_4 = null;
        java.net.ProxySelector stackOut_10_0 = null;
        java.net.URI stackOut_10_1 = null;
        java.net.URI stackOut_10_2 = null;
        StringBuilder stackOut_10_3 = null;
        String stackOut_10_4 = null;
        java.net.ProxySelector stackOut_11_0 = null;
        java.net.URI stackOut_11_1 = null;
        java.net.URI stackOut_11_2 = null;
        StringBuilder stackOut_11_3 = null;
        java.net.ProxySelector stackOut_12_0 = null;
        java.net.URI stackOut_12_1 = null;
        java.net.URI stackOut_12_2 = null;
        StringBuilder stackOut_12_3 = null;
        String stackOut_12_4 = null;
        java.net.ProxySelector stackOut_13_0 = null;
        java.net.URI stackOut_13_1 = null;
        java.net.URI stackOut_13_2 = null;
        StringBuilder stackOut_13_3 = null;
        String stackOut_13_4 = null;
        java.net.Socket stackOut_22_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = StarCannon.field_A;
                    if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    String discarded$2 = System.setProperty("java.net.useSystemProxies", "true");
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (param0 <= -3) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    field_h = null;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if ((((fl) this).field_d ^ -1) != -444) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = stackIn_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = ((fl) this).field_j;
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = new StringBuilder();
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        stackIn_9_3 = stackOut_8_3;
                        if (var5 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (java.net.ProxySelector) (Object) stackIn_9_0;
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = (StringBuilder) (Object) stackIn_9_3;
                        stackOut_9_4 = "https";
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        stackIn_11_2 = stackOut_9_2;
                        stackIn_11_3 = stackOut_9_3;
                        stackIn_11_4 = stackOut_9_4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (java.net.ProxySelector) (Object) stackIn_10_0;
                        stackOut_10_1 = null;
                        stackOut_10_2 = null;
                        stackOut_10_3 = (StringBuilder) (Object) stackIn_10_3;
                        stackOut_10_4 = "http";
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        stackIn_11_3 = stackOut_10_3;
                        stackIn_11_4 = stackOut_10_4;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        new java.net.URI(stackIn_11_4 + "://" + ((fl) this).field_c);
                        var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(stackIn_11_1);
                        stackOut_11_0 = ((fl) this).field_j;
                        stackOut_11_1 = null;
                        stackOut_11_2 = null;
                        stackOut_11_3 = new StringBuilder();
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (java.net.ProxySelector) (Object) stackIn_12_0;
                        stackOut_12_1 = null;
                        stackOut_12_2 = null;
                        stackOut_12_3 = (StringBuilder) (Object) stackIn_12_3;
                        stackOut_12_4 = "https";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_14_4 = stackOut_12_4;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (java.net.ProxySelector) (Object) stackIn_13_0;
                        stackOut_13_1 = null;
                        stackOut_13_2 = null;
                        stackOut_13_3 = (StringBuilder) (Object) stackIn_13_3;
                        stackOut_13_4 = "http";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        stackIn_14_4 = stackOut_13_4;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        new java.net.URI(stackIn_14_4 + "://" + ((fl) this).field_c);
                        var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(stackIn_14_1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var6 = (java.net.URISyntaxException) (Object) caughtException;
                    return ((fl) this).b((byte) -83);
                }
                case 17: {
                    boolean discarded$3 = var3.addAll((Collection) (Object) var4);
                    var6_array = var3.toArray();
                    var7 = null;
                    var8_array = var6_array;
                    var9 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (var8_array.length <= var9) {
                        statePc = 26;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var10 = var8_array[var9];
                    var11 = (java.net.Proxy) var10;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        var12_ref2 = this.a(-56426768, var11);
                        if (var12_ref2 != null) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof le ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9++;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = (stateCaught_21 instanceof le ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = (java.net.Socket) var12_ref2;
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = (stateCaught_22 instanceof le ? 24 : 25);
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var12 = (le) (Object) caughtException;
                    var7 = var12;
                    var9++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 25: {
                    var12_ref = (IOException) (Object) caughtException;
                    var9++;
                    statePc = 18;
                    continue stateLoop;
                }
                case 26: {
                    if (var7 != null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    throw var7;
                }
                case 29: {
                    return ((fl) this).b((byte) -64);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final java.net.Socket a(int param0, java.net.Proxy param1) throws IOException {
        Object var3 = null;
        Object var4 = null;
        java.net.InetSocketAddress var4_ref = null;
        java.net.Socket var5 = null;
        Exception var6 = null;
        Class var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param1.type() == java.net.Proxy.Type.DIRECT) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return ((fl) this).b((byte) -125);
                }
                case 3: {
                    var3 = param1.address();
                    if (var3 instanceof java.net.InetSocketAddress) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return null;
                }
                case 5: {
                    if (param0 == -56426768) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    field_i = null;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var4_ref = (java.net.InetSocketAddress) (Object) var3;
                    if (param1.type() != java.net.Proxy.Type.HTTP) {
                        statePc = 16;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5 = null;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                        var6_ref = var14;
                        var7 = var14.getDeclaredMethod("getProxyAuth", new Class[2]);
                        var7.setAccessible(true);
                        var8 = var7.invoke((Object) null, new Object[2]);
                        if (var8 == null) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var9 = var6_ref.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
                        var9.setAccessible(true);
                        if (((Boolean) var9.invoke(var8, new Object[0])).booleanValue()) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var10 = var6_ref.getDeclaredMethod("getHeaderName", new Class[0]);
                        var10.setAccessible(true);
                        var11 = var14.getDeclaredMethod("getHeaderValue", new Class[2]);
                        var11.setAccessible(true);
                        var12 = (String) var10.invoke(var8, new Object[0]);
                        var13 = (String) var11.invoke(var8, new Object[2]);
                        var5 = (java.net.Socket) (Object) (var12 + ": " + var13);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var6 = (Exception) (Object) caughtException;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    return this.a((String) (Object) var5, var4_ref.getHostName(), -20384, var4_ref.getPort());
                }
                case 16: {
                    if (param1.type() == java.net.Proxy.Type.SOCKS) {
                        statePc = 18;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 18: {
                    var5 = new java.net.Socket(param1);
                    var5.connect((java.net.SocketAddress) (Object) new java.net.InetSocketAddress(((fl) this).field_c, ((fl) this).field_d));
                    return var5;
                }
                case 19: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -118 % ((-22 - param0) / 55);
        field_i = null;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Difficulty - MEDIUM";
        field_i = "Start Game";
    }
}
