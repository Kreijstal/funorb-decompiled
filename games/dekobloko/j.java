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
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            de.field_V = new uf(param3);
            we.field_b = new uf(param4);
            mc.field_e = param13;
            lf.field_f = param2;
            if (!param11) {
              return;
            }
            kb.field_g = param8;
            l.field_c = param6;
            qk.field_a = param0;
            ce.field_w = param10;
            rm.field_c = param5;
            ef.field_P = param9;
            hc.field_a = param12;
            ci.field_c = param7;
            re.field_v = param1;
            if (null != lf.field_f.field_v) {
              try {
                dj.field_cb = new nh(lf.field_f.field_v, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("j.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
            if (param13 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = client.field_A ? 1 : 0;
        try {
          if (param4 <= param6) {
            return;
          }
          if (1 + param6 >= param2) {
            return;
          }
          if (param2 > 5 + param6 &&
            param3 != param5) {
            var7_int = (param3 >> 1) + ((param5 >> 1) + (param5 & param3 & 1));
            var8 = param6;
            var9 = param3;
            var10 = param5;
            for (var11 = param6; param2 > var11; var11++) {
              var12 = ch.field_a[var11];
              if (!param1) {
                stackIn_24_0 = cc.field_h[var12];
              } else {
                stackIn_24_0 = ad.field_i[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int >= var13) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                ch.field_a[var11] = ch.field_a[var8];
                incrementValue$0 = var8;
                var8++;
                ch.field_a[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            j.a((byte) -33, param1, var8, param3, param4, var9, param6);
            j.a(param0, param1, param2, var10, param4, param5, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; var7_intLifetime1 > param6; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = ch.field_a[var8Lifetime1];
              var10Lifetime1 = ch.field_a[1 + var8Lifetime1];
              if (ee.a((byte) 100, param1, var10Lifetime1, var9Lifetime1)) {
                ch.field_a[var8Lifetime1] = var10Lifetime1;
                ch.field_a[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var7), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var2Lifetime2Lifetime1;
        String var2Lifetime5Lifetime1;
        String var2Lifetime5Lifetime2;
        String var2Lifetime5Lifetime3;
        String var2Lifetime5Lifetime4;
        String var2Lifetime5Lifetime5;
        String var2Lifetime5Lifetime6;
        String var2Lifetime5Lifetime7;
        String var2Lifetime5Lifetime8;
        String var2Lifetime5Lifetime9;
        String var2Lifetime5Lifetime10;
        String var2Lifetime5Lifetime11;
        String var2Lifetime5Lifetime12;
        String var11Lifetime2Lifetime1;
        String var11Lifetime5Lifetime1;
        var13 = client.field_A ? 1 : 0;
        if (param0 instanceof jb) {
          var14 = (jb) ((Object) param0);
          var2 = var14.field_i + " | ";
          var11 = var2;
          param0 = var14.field_e;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) ((Object) var15));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        if (param1 == 37) {
          var20 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
          var26 = var20.readLine();
          var2Lifetime2 = var26;
          var11Lifetime2 = var26;
          while (true) {
            var21 = var20.readLine();
            var2Lifetime2Lifetime1 = var21;
            var11Lifetime2Lifetime1 = var21;
            var2Lifetime2Lifetime1 = var11Lifetime2Lifetime1;
            if (var21 == null) {
              var2Lifetime2Lifetime1 = var11Lifetime2Lifetime1;
              var11Lifetime2Lifetime1 = var2Lifetime2Lifetime1;
              var2Lifetime2Lifetime1 = var11Lifetime2Lifetime1;
              var2Lifetime2Lifetime1 = var2Lifetime2Lifetime1 + "| " + var26;
              var11Lifetime2Lifetime1 = var2Lifetime2Lifetime1;
              return var2Lifetime2Lifetime1;
            }
            var9 = var21.indexOf('(');
            var10 = var21.indexOf(')', var9 + 1);
            if (var9 == -1) {
              var11Lifetime2Lifetime1 = var21;
              var2Lifetime2Lifetime1 = var11Lifetime2Lifetime1;
              var2Lifetime2Lifetime1 = var11Lifetime2Lifetime1;
            } else {
              var11Lifetime2Lifetime1 = var21.substring(0, var9);
            }
            var22 = var11Lifetime2Lifetime1.trim();
            var2Lifetime2Lifetime1 = var22;
            var2Lifetime2Lifetime1 = var22;
            var23 = var22.substring(var22.lastIndexOf(' ') + 1);
            var2Lifetime2Lifetime1 = var23;
            var2Lifetime2Lifetime1 = var23;
            var24 = var23.substring(1 + var23.lastIndexOf('\t'));
            var2Lifetime2Lifetime1 = var24;
            var2Lifetime2Lifetime1 = var24;
            var25 = var2Lifetime2Lifetime1 + var24;
            var2Lifetime2Lifetime1 = var25;
            var2Lifetime2Lifetime1 = var25;
            var2Lifetime2Lifetime1 = var25;
            if (var9 != -1 &&
              var10 != -1) {
              var12 = var21.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime2Lifetime1 = var25 + var21.substring(var12 + 5, var10);
              }
            }
            var2Lifetime2Lifetime1 = var2Lifetime2Lifetime1 + ' ';
          }
        }
        field_c = 30;
        var27 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var6 = var27;
        var33 = var27.readLine();
        var2Lifetime3 = var33;
        var11Lifetime3 = var33;
        var7 = var33;
        var2Lifetime4 = var7;
        var11Lifetime4 = var7;
        while (true) {
          var28 = var27.readLine();
          var2Lifetime5 = var28;
          var11Lifetime5 = var28;
          var2Lifetime5Lifetime1 = var11Lifetime5;
          if (var28 == null) {
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            var2Lifetime5Lifetime2 = var11Lifetime5;
            var2Lifetime5Lifetime2 = var2Lifetime5Lifetime2 + "| " + var33;
            var37 = var2Lifetime5Lifetime2;
            var11Lifetime5 = var2Lifetime5Lifetime2;
            return var2Lifetime5Lifetime2;
          }
          var9Lifetime1 = var28.indexOf('(');
          var10Lifetime1 = var28.indexOf(')', var9Lifetime1 + 1);
          if (var9Lifetime1 == -1) {
            var11Lifetime5Lifetime1 = var28;
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
            var2Lifetime5Lifetime3 = var11Lifetime5Lifetime1;
          } else {
            var11Lifetime5Lifetime1 = var28.substring(0, var9Lifetime1);
          }
          var29 = var11Lifetime5Lifetime1.trim();
          var2Lifetime5Lifetime4 = var29;
          var2Lifetime5Lifetime5 = var29;
          var30 = var29.substring(var29.lastIndexOf(' ') + 1);
          var2Lifetime5Lifetime6 = var30;
          var2Lifetime5Lifetime7 = var30;
          var31 = var30.substring(1 + var30.lastIndexOf('\t'));
          var2Lifetime5Lifetime8 = var31;
          var2Lifetime5Lifetime9 = var31;
          var32 = var2Lifetime5Lifetime9 + var31;
          var2Lifetime5Lifetime10 = var32;
          var2Lifetime5Lifetime11 = var32;
          var2Lifetime5Lifetime12 = var32;
          if (var9Lifetime1 != -1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var28.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime5Lifetime12 = var32 + var28.substring(var12Lifetime1 + 5, var10Lifetime1);
            }
          }
          var2Lifetime5Lifetime12 = var2Lifetime5Lifetime12 + ' ';
        }
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_9_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 != -8241) {
          field_d = (int[]) null;
          if (param1 < 48) {
            if (param1 < 65) {
              if (param1 < 97) {
                return false;
              }
              if (param1 > 122) {
                return false;
              }
              return true;
            }
            if (param1 <= 90) {
              return true;
            }
            stackIn_9_0 = (param1 >= 97) && (param1 <= 122);
            return stackIn_9_0;
          }
          if (57 >= param1) {
            return true;
          }
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (param1 < 97) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (param1 >= 97) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (57 >= param1) {
          return true;
        }
        if (param1 < 65) {
          if (param1 < 97) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (param1 >= 97) && (param1 <= 122);
        return stackIn_50_0;
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
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        var3 = client.field_A ? 1 : 0;
        if (param1 != 28) {
          return (byte) 85;
        }
        if (param0 <= 0) {
          if (param0 < 160) {
            if (param0 == 8364) {
              var2 = -128;
            } else {
              if (param0 != 8218) {
                if (402 == param0) {
                  var2 = -125;
                } else {
                  if (param0 == 8222) {
                    var2 = -124;
                  } else {
                    if (param0 != 8230) {
                      if (param0 != 8224) {
                        if (8225 == param0) {
                          var2 = -121;
                        } else {
                          if (param0 != 710) {
                            if (param0 == 8240) {
                              var2 = -119;
                            } else {
                              if (param0 == 352) {
                                var2 = -118;
                              } else {
                                if (param0 != 8249) {
                                  if (param0 == 338) {
                                    var2 = -116;
                                  } else {
                                    if (381 != param0) {
                                      if (param0 != 8216) {
                                        if (param0 == 8217) {
                                          var2 = -110;
                                        } else {
                                          if (param0 == 8220) {
                                            var2 = -109;
                                          } else {
                                            if (param0 != 8221) {
                                              if (8226 == param0) {
                                                var2 = -107;
                                              } else {
                                                if (8211 != param0) {
                                                  if (8212 == param0) {
                                                    var2 = -105;
                                                  } else {
                                                    if (param0 != 732) {
                                                      if (param0 == 8482) {
                                                        var2 = -103;
                                                      } else {
                                                        if (param0 == 353) {
                                                          var2 = -102;
                                                        } else {
                                                          if (8250 != param0) {
                                                            if (param0 != 339) {
                                                              if (param0 != 382) {
                                                                var2 = (param0 == 376) ? -97 : 63;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                            }
                                          }
                                        }
                                      } else {
                                        var2 = -111;
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            }
                          } else {
                            var2 = -120;
                          }
                        }
                      } else {
                        var2 = -122;
                      }
                    } else {
                      var2 = -123;
                    }
                  }
                }
              } else {
                var2 = -126;
              }
            }
          } else {
            if (255 >= param0) {
              var2 = (byte)param0;
            } else {
              if (param0 == 8364) {
                var2 = -128;
              } else {
                if (param0 != 8218) {
                  if (402 == param0) {
                    var2 = -125;
                  } else {
                    if (param0 == 8222) {
                      var2 = -124;
                    } else {
                      if (param0 != 8230) {
                        if (param0 != 8224) {
                          if (8225 == param0) {
                            var2 = -121;
                          } else {
                            if (param0 != 710) {
                              if (param0 == 8240) {
                                var2 = -119;
                              } else {
                                if (param0 == 352) {
                                  var2 = -118;
                                } else {
                                  if (param0 != 8249) {
                                    if (param0 == 338) {
                                      var2 = -116;
                                    } else {
                                      if (381 != param0) {
                                        if (param0 != 8216) {
                                          if (param0 == 8217) {
                                            var2 = -110;
                                          } else {
                                            if (param0 == 8220) {
                                              var2 = -109;
                                            } else {
                                              if (param0 != 8221) {
                                                if (8226 == param0) {
                                                  var2 = -107;
                                                } else {
                                                  if (8211 != param0) {
                                                    if (8212 == param0) {
                                                      var2 = -105;
                                                    } else {
                                                      if (param0 != 732) {
                                                        if (param0 == 8482) {
                                                          var2 = -103;
                                                        } else {
                                                          if (param0 == 353) {
                                                            var2 = -102;
                                                          } else {
                                                            if (8250 != param0) {
                                                              if (param0 != 339) {
                                                                if (param0 != 382) {
                                                                  var2 = (param0 == 376) ? -97 : 63;
                                                                } else {
                                                                  var2 = -98;
                                                                }
                                                              } else {
                                                                var2 = -100;
                                                              }
                                                            } else {
                                                              var2 = -101;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                  }
                                                }
                                              } else {
                                                var2 = -108;
                                              }
                                            }
                                          }
                                        } else {
                                          var2 = -111;
                                        }
                                      } else {
                                        var2 = -114;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                  }
                                }
                              }
                            } else {
                              var2 = -120;
                            }
                          }
                        } else {
                          var2 = -122;
                        }
                      } else {
                        var2 = -123;
                      }
                    }
                  }
                } else {
                  var2 = -126;
                }
              }
            }
          }
          return (byte) var2;
        }
        if (param0 < 128) {
          var2Lifetime1 = (byte)param0;
          return (byte) var2Lifetime1;
        }
        if (param0 < 160) {
          if (param0 == 8364) {
            var2Lifetime2 = -128;
          } else {
            if (param0 != 8218) {
              if (402 == param0) {
                var2Lifetime2 = -125;
              } else {
                if (param0 == 8222) {
                  var2Lifetime2 = -124;
                } else {
                  if (param0 != 8230) {
                    if (param0 != 8224) {
                      if (8225 == param0) {
                        var2Lifetime2 = -121;
                      } else {
                        if (param0 != 710) {
                          if (param0 == 8240) {
                            var2Lifetime2 = -119;
                          } else {
                            if (param0 == 352) {
                              var2Lifetime2 = -118;
                            } else {
                              if (param0 != 8249) {
                                if (param0 == 338) {
                                  var2Lifetime2 = -116;
                                } else {
                                  if (381 != param0) {
                                    if (param0 != 8216) {
                                      if (param0 == 8217) {
                                        var2Lifetime2 = -110;
                                      } else {
                                        if (param0 == 8220) {
                                          var2Lifetime2 = -109;
                                        } else {
                                          if (param0 != 8221) {
                                            if (8226 == param0) {
                                              var2Lifetime2 = -107;
                                            } else {
                                              if (8211 != param0) {
                                                if (8212 == param0) {
                                                  var2Lifetime2 = -105;
                                                } else {
                                                  if (param0 != 732) {
                                                    if (param0 == 8482) {
                                                      var2Lifetime2 = -103;
                                                    } else {
                                                      if (param0 == 353) {
                                                        var2Lifetime2 = -102;
                                                      } else {
                                                        if (8250 != param0) {
                                                          if (param0 != 339) {
                                                            if (param0 != 382) {
                                                              var2Lifetime2 = (param0 == 376) ? -97 : 63;
                                                            } else {
                                                              var2Lifetime2 = -98;
                                                            }
                                                          } else {
                                                            var2Lifetime2 = -100;
                                                          }
                                                        } else {
                                                          var2Lifetime2 = -101;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime2 = -104;
                                                  }
                                                }
                                              } else {
                                                var2Lifetime2 = -106;
                                              }
                                            }
                                          } else {
                                            var2Lifetime2 = -108;
                                          }
                                        }
                                      }
                                    } else {
                                      var2Lifetime2 = -111;
                                    }
                                  } else {
                                    var2Lifetime2 = -114;
                                  }
                                }
                              } else {
                                var2Lifetime2 = -117;
                              }
                            }
                          }
                        } else {
                          var2Lifetime2 = -120;
                        }
                      }
                    } else {
                      var2Lifetime2 = -122;
                    }
                  } else {
                    var2Lifetime2 = -123;
                  }
                }
              }
            } else {
              var2Lifetime2 = -126;
            }
          }
          return (byte) var2Lifetime2;
        }
        if (255 >= param0) {
          var2Lifetime3 = (byte)param0;
          return (byte) var2Lifetime3;
        }
        if (param0 == 8364) {
          var2Lifetime4 = -128;
          return (byte) var2Lifetime4;
        }
        if (param0 != 8218) {
          if (402 == param0) {
            var2Lifetime5 = -125;
          } else {
            if (param0 == 8222) {
              var2Lifetime5 = -124;
            } else {
              if (param0 != 8230) {
                if (param0 != 8224) {
                  if (8225 == param0) {
                    var2Lifetime5 = -121;
                  } else {
                    if (param0 != 710) {
                      if (param0 == 8240) {
                        var2Lifetime5 = -119;
                      } else {
                        if (param0 == 352) {
                          var2Lifetime5 = -118;
                        } else {
                          if (param0 != 8249) {
                            if (param0 == 338) {
                              var2Lifetime5 = -116;
                            } else {
                              if (381 != param0) {
                                if (param0 != 8216) {
                                  if (param0 == 8217) {
                                    var2Lifetime5 = -110;
                                  } else {
                                    if (param0 == 8220) {
                                      var2Lifetime5 = -109;
                                    } else {
                                      if (param0 != 8221) {
                                        if (8226 == param0) {
                                          var2Lifetime5 = -107;
                                        } else {
                                          if (8211 != param0) {
                                            if (8212 == param0) {
                                              var2Lifetime5 = -105;
                                            } else {
                                              if (param0 != 732) {
                                                if (param0 == 8482) {
                                                  var2Lifetime5 = -103;
                                                } else {
                                                  if (param0 == 353) {
                                                    var2Lifetime5 = -102;
                                                  } else {
                                                    if (8250 == param0) {
                                                      var2Lifetime5 = -101;
                                                    } else {
                                                      if (param0 == 339) {
                                                        var2Lifetime5 = -100;
                                                      } else {
                                                        if (param0 == 382) {
                                                          var2Lifetime5 = -98;
                                                        } else {
                                                          if (param0 == 376) {
                                                            var2Lifetime5 = -97;
                                                          } else {
                                                            var2Lifetime5 = 63;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2Lifetime5 = -104;
                                              }
                                            }
                                          } else {
                                            var2Lifetime5 = -106;
                                          }
                                        }
                                      } else {
                                        var2Lifetime5 = -108;
                                      }
                                    }
                                  }
                                } else {
                                  var2Lifetime5 = -111;
                                }
                              } else {
                                var2Lifetime5 = -114;
                              }
                            }
                          } else {
                            var2Lifetime5 = -117;
                          }
                        }
                      }
                    } else {
                      var2Lifetime5 = -120;
                    }
                  }
                } else {
                  var2Lifetime5 = -122;
                }
              } else {
                var2Lifetime5 = -123;
              }
            }
          }
        } else {
          var2Lifetime5 = -126;
        }
        return (byte) var2Lifetime5;
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
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
          var4_int = param1.length();
          var5 = param0.length();
          var6 = param2.length();
          if (param3 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (0 != var8) {
            var9_int = 0;
            while (true) {
              var9_int = param1.indexOf(param0, var9_int);
              if (var9_int < 0) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param1.indexOf(param0, var10);
            if (0 > var11) {
              discarded$2 = var9.append(param1.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$0 = var9.append(param1.substring(var10, var11));
            discarded$1 = var9.append(param2);
            var10 = var11 + var5;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("j.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Not yet achieved";
        field_d = b.h(26);
    }
}
