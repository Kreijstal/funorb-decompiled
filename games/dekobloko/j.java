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
            field_a = null;
        }
    }

    final static void a(int param0, int param1, fd param2, int param3, int param4, long param5, int param6, boolean param7, int param8, int param9, boolean param10, boolean param11, int param12, String param13) {
        try {
            IOException var15 = null;
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            de.field_V = new uf(param3);
            we.field_b = new uf(param4);
            mc.field_e = param13;
            lf.field_f = param2;
            if (param11) {
              L0: {
                kb.field_g = param8;
                l.field_c = param6;
                qk.field_a = param0;
                if (!param10) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  break L0;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
              L1: {
                ce.field_w = stackIn_5_0 != 0;
                rm.field_c = param5;
                ef.field_P = param9;
                hc.field_a = param12;
                if (!param7) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              ci.field_c = stackIn_8_0 != 0;
              re.field_v = param1;
              if (null == lf.field_f.field_v) {
                return;
              } else {
                try {
                  dj.field_cb = new nh(lf.field_f.field_v, 64, 0);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var15 = (IOException) (Object) decompiledCaughtException;
                  throw new RuntimeException(var15.toString());
                }
                return;
              }
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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var14 = client.field_A ? 1 : 0;
        if (param4 <= param6) {
          return;
        } else {
          if (1 + param6 < param2) {
            if (param2 > 5 + param6) {
              if (param3 == param5) {
                L0: {
                  var7 = -1 + param2;
                  if (var7 <= param6) {
                    break L0;
                  } else {
                    L1: {
                      var8 = param6;
                      if (var7 <= var8) {
                        break L1;
                      } else {
                        L2: {
                          var9 = ch.field_a[var8];
                          var10 = ch.field_a[1 + var8];
                          if (ee.a((byte) 100, param1, var10, var9)) {
                            ch.field_a[var8] = var10;
                            ch.field_a[1 + var8] = var9;
                            break L2;
                          } else {
                            var8++;
                            break L2;
                          }
                        }
                        var8++;
                        var8++;
                        var8++;
                        break L1;
                      }
                    }
                    var7--;
                    break L0;
                  }
                }
                return;
              } else {
                var7 = (param3 >> 861831393) + ((param5 >> -973240543) + (param5 & param3 & 1));
                var8 = param6;
                var9 = param3;
                var10 = param5;
                var11 = param6;
                L3: while (true) {
                  if (param2 <= var11) {
                    j.a((byte) -33, param1, var8, param3, param4, var9, param6);
                    j.a(param0, param1, param2, var10, param4, param5, var8);
                    return;
                  } else {
                    L4: {
                      var12 = ch.field_a[var11];
                      if (!param1) {
                        stackOut_21_0 = cc.field_h[var12];
                        stackIn_22_0 = stackOut_21_0;
                        break L4;
                      } else {
                        stackOut_20_0 = ad.field_i[var12];
                        stackIn_22_0 = stackOut_20_0;
                        break L4;
                      }
                    }
                    var13 = stackIn_22_0;
                    if (var7 >= var13) {
                      if (var13 > var10) {
                        var10 = var13;
                        var11++;
                        continue L3;
                      } else {
                        var11++;
                        continue L3;
                      }
                    } else {
                      ch.field_a[var11] = ch.field_a[var8];
                      int incrementValue$1 = var8;
                      var8++;
                      ch.field_a[incrementValue$1] = var12;
                      if (var9 > var13) {
                        var9 = var13;
                        var11++;
                        continue L3;
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var7 = -1 + param2;
              L5: while (true) {
                if (var7 <= param6) {
                  return;
                } else {
                  var8 = param6;
                  L6: while (true) {
                    if (var7 <= var8) {
                      var7--;
                      continue L5;
                    } else {
                      var9 = ch.field_a[var8];
                      var10 = ch.field_a[1 + var8];
                      if (ee.a((byte) 100, param1, var10, var9)) {
                        ch.field_a[var8] = var10;
                        ch.field_a[1 + var8] = var9;
                        var8++;
                        continue L6;
                      } else {
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        jb var14 = null;
        StringWriter var15 = null;
        BufferedReader var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        BufferedReader var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        String var37 = null;
        L0: {
          var13 = client.field_A ? 1 : 0;
          if (param0 instanceof jb) {
            var14 = (jb) (Object) param0;
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
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2 = var5;
        var11 = var5;
        if (param1 == 37) {
          var20 = new BufferedReader((Reader) (Object) new StringReader(var5));
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
              var2 = var2 + 32;
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
          var27 = new BufferedReader((Reader) (Object) new StringReader(var5));
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
              var2 = var2 + 32;
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
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
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
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
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
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
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
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          field_d = null;
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
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
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
                        stackOut_7_0 = 1;
                        stackIn_9_0 = stackOut_7_0;
                        break L6;
                      }
                    }
                  }
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
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
            field_d = null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static byte a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
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
        int var4 = 0;
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
        var4 = param1.length();
        var5 = param0.length();
        var6 = param2.length();
        if (param3 == var5) {
          throw new IllegalArgumentException("Key cannot have zero length");
        } else {
          L0: {
            var7 = var4;
            var8 = -var5 + var6;
            if (0 != var8) {
              var9_int = 0;
              L1: while (true) {
                var9_int = param1.indexOf(param0, var9_int);
                if (var9_int >= 0) {
                  var7 = var7 + var8;
                  var9_int = var9_int + var5;
                  continue L1;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  break L0;
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              break L0;
            }
          }
          L2: while (true) {
            var11 = param1.indexOf(param0, var10);
            if (0 <= var11) {
              StringBuilder discarded$3 = var9.append(param1.substring(var10, var11));
              StringBuilder discarded$4 = var9.append(param2);
              var10 = var11 - -var5;
              continue L2;
            } else {
              StringBuilder discarded$5 = var9.append(param1.substring(var10));
              return var9.toString();
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Not yet achieved";
        field_d = b.h(26);
    }
}
