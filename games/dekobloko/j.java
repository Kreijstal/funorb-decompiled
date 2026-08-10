/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j {
    static int field_c;
    static int[] field_d;
    static String field_a;
    static int field_b;

    final static void a(int param0) {
        jb.a(tg.field_h, ua.field_H, gf.field_g, -47, ui.field_x);
        if (param0 != 8225) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, int param4, long param5, int param6, boolean param7, int param8, int param9, boolean param10, boolean param11, int param12, String param13) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                de.field_V = new uf(param3);
                we.field_b = new uf(param4);
                mc.field_e = param13;
                lf.field_f = param2;
                if (param11) {
                  L1: {
                    kb.field_g = param8;
                    l.field_c = param6;
                    qk.field_a = param0;
                    if (!param10) {
                      stackIn_5_0 = 0;
                      break L1;
                    } else {
                      stackIn_5_0 = 1;
                      break L1;
                    }
                  }
                  L2: {
                    ce.field_w = stackIn_5_0 != 0;
                    rm.field_c = param5;
                    ef.field_P = param9;
                    hc.field_a = param12;
                    if (!param7) {
                      stackIn_8_0 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    ci.field_c = stackIn_8_0 != 0;
                    re.field_v = param1;
                    if (null == lf.field_f.field_v) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          dj.field_cb = new nh(lf.field_f.field_v, 64, 0);
                          break L4;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var15 = (IOException) (Object) decompiledCaughtException;
                        throw new RuntimeException(var15.toString());
                      }
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

                if (param13 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    final static void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param4 <= param6) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (1 + param6 < param2) {
                L1: {
                  if (param2 <= 5 + param6) {
                    break L1;
                  } else {
                    if (param3 != param5) {
                      var7_int = (param3 >> 861831393) + ((param5 >> -973240543) + (param5 & param3 & 1));
                      var8 = param6;
                      var9 = param3;
                      var10 = param5;
                      var11 = param6;
                      L2: while (true) {
                        if (param2 <= var11) {
                          j.a((byte) -33, param1, var8, param3, param4, var9, param6);
                          j.a(param0, param1, param2, var10, param4, param5, var8);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = ch.field_a[var11];
                            if (!param1) {
                              stackIn_24_0 = cc.field_h[var12];
                              break L3;
                            } else {
                              stackIn_24_0 = ad.field_i[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var7_int >= var13) {
                              if (var13 <= var10) {
                                break L4;
                              } else {
                                var10 = var13;
                                break L4;
                              }
                            } else {
                              ch.field_a[var11] = ch.field_a[var8];
                              incrementValue$0 = var8;
                              var8++;
                              ch.field_a[incrementValue$0] = var12;
                              if (var9 <= var13) {
                                break L4;
                              } else {
                                var9 = var13;
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L5: while (true) {
                  if (var7_int <= param6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L6: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = ch.field_a[var8];
                          var10 = ch.field_a[1 + var8];
                          if (ee.a((byte) 100, param1, var10, var9)) {
                            ch.field_a[var8] = var10;
                            ch.field_a[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        jb var14;
        StringWriter var15;
        BufferedReader var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String var25;
        String var26;
        BufferedReader var6;
        String var7;
        BufferedReader var27;
        String var28;
        String var29;
        String var30;
        String var31;
        String var32;
        String var33;
        String var37;
        L0: {
          var13 = client.field_A ? 1 : 0;
          if (param0 instanceof jb) {
            var14 = (jb) ((Object) param0);
            var2 = var14.field_i + " | ";
            var11 = var2;
            param0 = var14.field_e;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        if (param1 == 37) {
          var20 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var26 = var20.readLine();
          var2 = var26;
          var11 = var26;
          L1: while (true) {
            var21 = var20.readLine();
            var2 = var21;
            var11 = var21;
            var2 = var11;
            if (var21 != null) {
              L2: {
                var9 = var21.indexOf('(');
                var10 = var21.indexOf(')', var9 + 1);
                if (var9 == -1) {
                  var11 = var21;
                  var2 = var11;
                  var2 = var11;
                  break L2;
                } else {
                  var11 = var21.substring(0, var9);
                  break L2;
                }
              }
              L3: {
                var22 = var11.trim();
                var2 = var22;
                var2 = var22;
                var23 = var22.substring(var22.lastIndexOf(' ') + 1);
                var2 = var23;
                var2 = var23;
                var24 = var23.substring(1 + var23.lastIndexOf('\t'));
                var2 = var24;
                var2 = var24;
                var25 = var2 + var24;
                var2 = var25;
                var2 = var25;
                var2 = var25;
                if ((var9 ^ -1) == 0) {
                  break L3;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L3;
                  } else {
                    var12 = var21.indexOf(".java:", var9);
                    if ((var12 ^ -1) > -1) {
                      break L3;
                    } else {
                      var2 = var25 + var21.substring(var12 - -5, var10);
                      break L3;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              continue L1;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var26;
              var11 = var2;
              return var2;
            }
          }
        } else {
          field_c = 30;
          var27 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var6 = var27;
          var33 = var27.readLine();
          var2 = var33;
          var11 = var33;
          var7 = var33;
          var2 = var7;
          var11 = var7;
          L4: while (true) {
            var28 = var27.readLine();
            var2 = var28;
            var11 = var28;
            var2 = var11;
            if (var28 != null) {
              L5: {
                var9 = var28.indexOf('(');
                var10 = var28.indexOf(')', var9 + 1);
                if (var9 == -1) {
                  var11 = var28;
                  var2 = var11;
                  var2 = var11;
                  break L5;
                } else {
                  var11 = var28.substring(0, var9);
                  break L5;
                }
              }
              L6: {
                var29 = var11.trim();
                var2 = var29;
                var2 = var29;
                var30 = var29.substring(var29.lastIndexOf(' ') + 1);
                var2 = var30;
                var2 = var30;
                var31 = var30.substring(1 + var30.lastIndexOf('\t'));
                var2 = var31;
                var2 = var31;
                var32 = var2 + var31;
                var2 = var32;
                var2 = var32;
                var2 = var32;
                if ((var9 ^ -1) == 0) {
                  break L6;
                } else {
                  if ((var10 ^ -1) == 0) {
                    break L6;
                  } else {
                    var12 = var28.indexOf(".java:", var9);
                    if ((var12 ^ -1) > -1) {
                      break L6;
                    } else {
                      var2 = var32 + var28.substring(var12 - -5, var10);
                      break L6;
                    }
                  }
                }
              }
              var2 = var2 + ' ';
              continue L4;
            } else {
              var2 = var11;
              var11 = var2;
              var2 = var11;
              var2 = var2 + "| " + var33;
              var37 = var2;
              var11 = var2;
              return var2;
            }
          }
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_9_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        if (param0 == -8241) {
          if (param1 < 48) {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 <= 122) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              if (param1 <= 90) {
                stackIn_67_0 = 1;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param1 < 97) {
                      break L1;
                    } else {
                      if (param1 > 122) {
                        break L1;
                      } else {
                        stackIn_64_0 = 1;
                        break L0;
                      }
                    }
                  }
                  stackIn_64_0 = 0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L2: {
                    L3: {
                      if (param1 < 97) {
                        break L3;
                      } else {
                        if (param1 > 122) {
                          break L3;
                        } else {
                          stackIn_50_0 = 1;
                          break L2;
                        }
                      }
                    }
                    stackIn_50_0 = 0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackIn_45_0 = 1;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackIn_40_0 = 1;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_d = (int[]) null;
          if (param1 >= 48) {
            if (57 < param1) {
              if (param1 < 65) {
                if (param1 >= 97) {
                  if (param1 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param1 > 90) {
                  L4: {
                    L5: {
                      if (param1 < 97) {
                        break L5;
                      } else {
                        if (param1 > 122) {
                          break L5;
                        } else {
                          stackIn_28_0 = 1;
                          break L4;
                        }
                      }
                    }
                    stackIn_28_0 = 0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackIn_23_0 = 1;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param1 < 65) {
              if (param1 >= 97) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param1 > 90) {
                L6: {
                  L7: {
                    if (param1 < 97) {
                      break L7;
                    } else {
                      if (param1 > 122) {
                        break L7;
                      } else {
                        stackIn_9_0 = 1;
                        break L6;
                      }
                    }
                  }
                  stackIn_9_0 = 0;
                  break L6;
                }
                return stackIn_9_0 != 0;
              } else {
                return true;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_d = (int[]) null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param1 == 28) {
          if (param0 > 0) {
            if (param0 >= 128) {
              if (param0 >= 160) {
                if (255 < param0) {
                  if (param0 == 8364) {
                    var2 = -128;
                    return (byte) var2;
                  } else {
                    L0: {
                      if (param0 != 8218) {
                        if (402 == param0) {
                          var2 = -125;
                          return (byte) var2;
                        } else {
                          if (param0 == 8222) {
                            var2 = -124;
                            return (byte) var2;
                          } else {
                            if (param0 != 8230) {
                              if (param0 != 8224) {
                                if (8225 == param0) {
                                  var2 = -121;
                                  return (byte) var2;
                                } else {
                                  if (param0 != 710) {
                                    if (param0 == 8240) {
                                      var2 = -119;
                                      return (byte) var2;
                                    } else {
                                      if (param0 == 352) {
                                        var2 = -118;
                                        return (byte) var2;
                                      } else {
                                        if (param0 != 8249) {
                                          if (param0 == 338) {
                                            var2 = -116;
                                            return (byte) var2;
                                          } else {
                                            if (381 != param0) {
                                              if (param0 != 8216) {
                                                if (param0 == 8217) {
                                                  var2 = -110;
                                                  return (byte) var2;
                                                } else {
                                                  if (param0 == 8220) {
                                                    var2 = -109;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param0 != 8221) {
                                                      if (8226 == param0) {
                                                        var2 = -107;
                                                        return (byte) var2;
                                                      } else {
                                                        if (8211 != param0) {
                                                          if (8212 == param0) {
                                                            var2 = -105;
                                                            return (byte) var2;
                                                          } else {
                                                            if (param0 != 732) {
                                                              if (param0 == 8482) {
                                                                var2 = -103;
                                                                return (byte) var2;
                                                              } else {
                                                                if (param0 == 353) {
                                                                  var2 = -102;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (8250 != param0) {
                                                                    if (param0 != 339) {
                                                                      if (param0 != 382) {
                                                                        if (param0 == 376) {
                                                                          var2 = -97;
                                                                          return (byte) var2;
                                                                        } else {
                                                                          var2 = 63;
                                                                          return (byte) var2;
                                                                        }
                                                                      } else {
                                                                        var2 = -98;
                                                                        return (byte) var2;
                                                                      }
                                                                    } else {
                                                                      var2 = -100;
                                                                      return (byte) var2;
                                                                    }
                                                                  } else {
                                                                    var2 = -101;
                                                                    return (byte) var2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -104;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -106;
                                                          break L0;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -108;
                                                      break L0;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -111;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -114;
                                              break L0;
                                            }
                                          }
                                        } else {
                                          var2 = -117;
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    var2 = -120;
                                    break L0;
                                  }
                                }
                              } else {
                                var2 = -122;
                                break L0;
                              }
                            } else {
                              var2 = -123;
                              break L0;
                            }
                          }
                        }
                      } else {
                        var2 = -126;
                        break L0;
                      }
                    }
                    return (byte) var2;
                  }
                } else {
                  var2 = (byte)param0;
                  return (byte) var2;
                }
              } else {
                if (param0 != 8364) {
                  L1: {
                    if (param0 != 8218) {
                      if (402 != param0) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (8225 != param0) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 != 352) {
                                      if (param0 != 8249) {
                                        if (param0 != 338) {
                                          if (381 != param0) {
                                            if (param0 != 8216) {
                                              if (param0 != 8217) {
                                                if (param0 != 8220) {
                                                  if (param0 != 8221) {
                                                    if (8226 != param0) {
                                                      if (8211 != param0) {
                                                        if (8212 != param0) {
                                                          if (param0 != 732) {
                                                            if (param0 == 8482) {
                                                              var2 = -103;
                                                              return (byte) var2;
                                                            } else {
                                                              if (param0 == 353) {
                                                                var2 = -102;
                                                                break L1;
                                                              } else {
                                                                if (8250 != param0) {
                                                                  if (param0 != 339) {
                                                                    if (param0 != 382) {
                                                                      if (param0 == 376) {
                                                                        var2 = -97;
                                                                        break L1;
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L1;
                                                          }
                                                        } else {
                                                          var2 = -105;
                                                          return (byte) var2;
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L1;
                                                      }
                                                    } else {
                                                      var2 = -107;
                                                      return (byte) var2;
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L1;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  return (byte) var2;
                                                }
                                              } else {
                                                var2 = -110;
                                                return (byte) var2;
                                              }
                                            } else {
                                              var2 = -111;
                                              break L1;
                                            }
                                          } else {
                                            var2 = -114;
                                            break L1;
                                          }
                                        } else {
                                          var2 = -116;
                                          return (byte) var2;
                                        }
                                      } else {
                                        var2 = -117;
                                        break L1;
                                      }
                                    } else {
                                      var2 = -118;
                                      return (byte) var2;
                                    }
                                  } else {
                                    var2 = -119;
                                    return (byte) var2;
                                  }
                                } else {
                                  var2 = -120;
                                  break L1;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              break L1;
                            }
                          } else {
                            var2 = -123;
                            break L1;
                          }
                        } else {
                          var2 = -124;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -125;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -126;
                      break L1;
                    }
                  }
                  return (byte) var2;
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              }
            } else {
              var2 = (byte)param0;
              return (byte) var2;
            }
          } else {
            if (param0 >= 160) {
              if (255 < param0) {
                if (param0 != 8364) {
                  L2: {
                    if (param0 != 8218) {
                      if (402 != param0) {
                        if (param0 != 8222) {
                          if (param0 != 8230) {
                            if (param0 != 8224) {
                              if (8225 != param0) {
                                if (param0 != 710) {
                                  if (param0 != 8240) {
                                    if (param0 == 352) {
                                      var2 = -118;
                                      return (byte) var2;
                                    } else {
                                      if (param0 != 8249) {
                                        if (param0 == 338) {
                                          var2 = -116;
                                          break L2;
                                        } else {
                                          if (381 != param0) {
                                            if (param0 != 8216) {
                                              if (param0 == 8217) {
                                                var2 = -110;
                                                break L2;
                                              } else {
                                                if (param0 == 8220) {
                                                  var2 = -109;
                                                  break L2;
                                                } else {
                                                  if (param0 != 8221) {
                                                    if (8226 == param0) {
                                                      var2 = -107;
                                                      break L2;
                                                    } else {
                                                      if (8211 != param0) {
                                                        if (8212 == param0) {
                                                          var2 = -105;
                                                          break L2;
                                                        } else {
                                                          if (param0 != 732) {
                                                            if (param0 == 8482) {
                                                              var2 = -103;
                                                              break L2;
                                                            } else {
                                                              if (param0 == 353) {
                                                                var2 = -102;
                                                                break L2;
                                                              } else {
                                                                if (8250 != param0) {
                                                                  if (param0 != 339) {
                                                                    if (param0 != 382) {
                                                                      if (param0 == 376) {
                                                                        var2 = -97;
                                                                        break L2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      var2 = -98;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var2 = -100;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  break L2;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -106;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L2;
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -111;
                                              break L2;
                                            }
                                          } else {
                                            var2 = -114;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var2 = -117;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var2 = -119;
                                    return (byte) var2;
                                  }
                                } else {
                                  var2 = -120;
                                  break L2;
                                }
                              } else {
                                var2 = -121;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -122;
                              break L2;
                            }
                          } else {
                            var2 = -123;
                            break L2;
                          }
                        } else {
                          var2 = -124;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -125;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -126;
                      break L2;
                    }
                  }
                  return (byte) var2;
                } else {
                  var2 = -128;
                  return (byte) var2;
                }
              } else {
                var2 = (byte)param0;
                return (byte) var2;
              }
            } else {
              if (param0 != 8364) {
                L3: {
                  if (param0 != 8218) {
                    if (402 != param0) {
                      if (param0 != 8222) {
                        if (param0 != 8230) {
                          if (param0 != 8224) {
                            if (8225 != param0) {
                              if (param0 != 710) {
                                if (param0 != 8240) {
                                  if (param0 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param0 != 8249) {
                                      if (param0 == 338) {
                                        var2 = -116;
                                        break L3;
                                      } else {
                                        if (381 != param0) {
                                          if (param0 != 8216) {
                                            if (param0 == 8217) {
                                              var2 = -110;
                                              break L3;
                                            } else {
                                              if (param0 == 8220) {
                                                var2 = -109;
                                                break L3;
                                              } else {
                                                if (param0 != 8221) {
                                                  if (8226 == param0) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (8211 != param0) {
                                                      if (8212 == param0) {
                                                        var2 = -105;
                                                        break L3;
                                                      } else {
                                                        if (param0 != 732) {
                                                          if (param0 == 8482) {
                                                            var2 = -103;
                                                            break L3;
                                                          } else {
                                                            if (param0 == 353) {
                                                              var2 = -102;
                                                              break L3;
                                                            } else {
                                                              if (8250 != param0) {
                                                                if (param0 != 339) {
                                                                  if (param0 != 382) {
                                                                    if (param0 == 376) {
                                                                      var2 = -97;
                                                                      break L3;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    var2 = -98;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  var2 = -100;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L3;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -106;
                                                      break L3;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L3;
                                                }
                                              }
                                            }
                                          } else {
                                            var2 = -111;
                                            break L3;
                                          }
                                        } else {
                                          var2 = -114;
                                          break L3;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                      break L3;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                break L3;
                              }
                            } else {
                              var2 = -121;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -122;
                            break L3;
                          }
                        } else {
                          var2 = -123;
                          break L3;
                        }
                      } else {
                        var2 = -124;
                        return (byte) var2;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    break L3;
                  }
                }
                return (byte) var2;
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
          }
        } else {
          return (byte) 85;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            var5 = param0.length();
            var6 = param2.length();
            if (param3 != var5) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 != var8) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param1.indexOf(param0, var9_int);
                    if (var9_int >= 0) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param1.indexOf(param0, var10);
                if (0 <= var11) {
                  discarded$0 = var9.append(param1.substring(var10, var11));
                  discarded$1 = var9.append(param2);
                  var10 = var11 - -var5;
                  continue L3;
                } else {
                  discarded$2 = var9.append(param1.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("j.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_a = "Not yet achieved";
        field_d = b.h(26);
    }
}
