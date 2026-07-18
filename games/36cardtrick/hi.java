/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class hi {
    static boolean field_a;
    static String field_b;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "hi.E(" + param0 + ')');
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            int stackIn_4_0 = 0;
            int stackIn_13_0 = 0;
            Object stackIn_63_0 = null;
            java.net.URL stackIn_65_0 = null;
            java.net.URL stackIn_67_0 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            String stackIn_72_2 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            String stackIn_76_2 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_79_0 = null;
            StringBuilder stackIn_79_1 = null;
            RuntimeException stackIn_80_0 = null;
            StringBuilder stackIn_80_1 = null;
            String stackIn_80_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            boolean stackOut_12_0 = false;
            java.net.URL stackOut_64_0 = null;
            Object stackOut_62_0 = null;
            java.net.URL stackOut_66_0 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            String stackOut_71_2 = null;
            RuntimeException stackOut_69_0 = null;
            StringBuilder stackOut_69_1 = null;
            String stackOut_69_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            String stackOut_75_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            RuntimeException stackOut_79_0 = null;
            StringBuilder stackOut_79_1 = null;
            String stackOut_79_2 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            var9 = Main.field_T;
            try {
              try {
                var5_ref = param1.getFile();
                var6 = 0;
                L0: while (true) {
                  L1: {
                    L2: {
                      if (!var5_ref.regionMatches(var6, "/l=", 0, 3)) {
                        break L2;
                      } else {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        stackOut_3_0 = var7_int;
                        stackIn_13_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var9 != 0) {
                          break L1;
                        } else {
                          if (stackIn_4_0 < 0) {
                            break L2;
                          } else {
                            L3: {
                              if (param3 < 0) {
                                break L3;
                              } else {
                                var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                                if (var9 == 0) {
                                  continue L0;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L0;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    stackOut_12_0 = var5_ref.regionMatches(var6, "/a=", 0, 3);
                    stackIn_13_0 = stackOut_12_0 ? 1 : 0;
                    break L1;
                  }
                  L4: {
                    if (stackIn_13_0 != 0) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (var7_int >= 0) {
                        L6: {
                          if (param0 != null) {
                            break L6;
                          } else {
                            var6 = var7_int;
                            if (var9 == 0) {
                              continue L0;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    L8: {
                      if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                        break L8;
                      } else {
                        if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L9;
                      } else {
                        L10: {
                          if (null == param2) {
                            break L10;
                          } else {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            if (var9 == 0) {
                              continue L0;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var6 = var7_int;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L9;
                        }
                      }
                    }
                    break L7;
                  }
                  L11: {
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$9 = var7.append(var5_ref.substring(0, var6));
                    if (param3 <= 0) {
                      break L11;
                    } else {
                      StringBuilder discarded$10 = var7.append("/l=");
                      StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                      break L11;
                    }
                  }
                  L12: {
                    if (null == param0) {
                      break L12;
                    } else {
                      if (param0.length() <= 0) {
                        break L12;
                      } else {
                        StringBuilder discarded$12 = var7.append("/p=");
                        StringBuilder discarded$13 = var7.append(param0);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param2 == null) {
                      break L13;
                    } else {
                      if (param2.length() > 0) {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    L15: {
                      if (~var5_ref.length() < ~var6) {
                        break L15;
                      } else {
                        StringBuilder discarded$16 = var7.append('/');
                        if (var9 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    StringBuilder discarded$17 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                    break L14;
                  }
                  if (param4 == 353) {
                    stackOut_64_0 = new java.net.URL(param1, var7.toString());
                    stackIn_65_0 = stackOut_64_0;
                    return stackIn_65_0;
                  } else {
                    stackOut_62_0 = null;
                    stackIn_63_0 = stackOut_62_0;
                    return (java.net.URL) (Object) stackIn_63_0;
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8 = (Exception) (Object) decompiledCaughtException;
                var8.printStackTrace();
                stackOut_66_0 = (java.net.URL) param1;
                stackIn_67_0 = stackOut_66_0;
                return stackIn_67_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L16: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_68_0 = (RuntimeException) var5;
                stackOut_68_1 = new StringBuilder().append("hi.D(");
                stackIn_71_0 = stackOut_68_0;
                stackIn_71_1 = stackOut_68_1;
                stackIn_69_0 = stackOut_68_0;
                stackIn_69_1 = stackOut_68_1;
                if (param0 == null) {
                  stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
                  stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
                  stackOut_71_2 = "null";
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  stackIn_72_2 = stackOut_71_2;
                  break L16;
                } else {
                  stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                  stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                  stackOut_69_2 = "{...}";
                  stackIn_72_0 = stackOut_69_0;
                  stackIn_72_1 = stackOut_69_1;
                  stackIn_72_2 = stackOut_69_2;
                  break L16;
                }
              }
              L17: {
                stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
                stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');
                stackIn_75_0 = stackOut_72_0;
                stackIn_75_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param1 == null) {
                  stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
                  stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
                  stackOut_75_2 = "null";
                  stackIn_76_0 = stackOut_75_0;
                  stackIn_76_1 = stackOut_75_1;
                  stackIn_76_2 = stackOut_75_2;
                  break L17;
                } else {
                  stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
                  stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
                  stackOut_73_2 = "{...}";
                  stackIn_76_0 = stackOut_73_0;
                  stackIn_76_1 = stackOut_73_1;
                  stackIn_76_2 = stackOut_73_2;
                  break L17;
                }
              }
              L18: {
                stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');
                stackIn_79_0 = stackOut_76_0;
                stackIn_79_1 = stackOut_76_1;
                stackIn_77_0 = stackOut_76_0;
                stackIn_77_1 = stackOut_76_1;
                if (param2 == null) {
                  stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
                  stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
                  stackOut_79_2 = "null";
                  stackIn_80_0 = stackOut_79_0;
                  stackIn_80_1 = stackOut_79_1;
                  stackIn_80_2 = stackOut_79_2;
                  break L18;
                } else {
                  stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
                  stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
                  stackOut_77_2 = "{...}";
                  stackIn_80_0 = stackOut_77_0;
                  stackIn_80_1 = stackOut_77_1;
                  stackIn_80_2 = stackOut_77_2;
                  break L18;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param3 + ',' + param4 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              Main.field_G = Main.field_G + 1;
              if (ca.field_a != -1) {
                break L1;
              } else {
                if (ug.field_h != -1) {
                  break L1;
                } else {
                  ca.field_a = eg.field_b;
                  ug.field_h = ij.field_e;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (param0.equals((Object) (Object) t.field_e)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (t.field_e != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (k.field_b) {
                    break L5;
                  } else {
                    if (~Main.field_G > ~ek.field_e) {
                      break L5;
                    } else {
                      if (ek.field_e - -ra.field_e <= Main.field_G) {
                        break L5;
                      } else {
                        stackOut_23_0 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_25_0 = 0;
                stackIn_26_0 = stackOut_25_0;
                break L4;
              }
              L6: {
                L7: {
                  var2_int = stackIn_26_0;
                  if (null == param0) {
                    break L7;
                  } else {
                    L8: {
                      if (k.field_b) {
                        break L8;
                      } else {
                        if (var2_int == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    Main.field_G = ek.field_e;
                    if (var3 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                Main.field_G = 0;
                break L6;
              }
              L9: {
                ti.field_a = ug.field_h;
                p.field_k = ca.field_a;
                if (null == param0) {
                  break L9;
                } else {
                  k.field_b = false;
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L9;
                  }
                }
              }
              if (var2_int != 0) {
                k.field_b = true;
                break L2;
              } else {
                break L2;
              }
            }
            L10: {
              t.field_e = param0;
              if (k.field_b) {
                break L10;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L10;
                } else {
                  if (!d.field_s) {
                    break L10;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L10;
                  }
                }
              }
            }
            L11: {
              ca.field_a = -1;
              ug.field_h = -1;
              if (!k.field_b) {
                break L11;
              } else {
                if (~id.field_b != ~Main.field_G) {
                  break L11;
                } else {
                  Main.field_G = 0;
                  k.field_b = false;
                  break L11;
                }
              }
            }
            L12: {
              if (param1 < -32) {
                break L12;
              } else {
                field_a = true;
                break L12;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var2;
            stackOut_67_1 = new StringBuilder().append("hi.B(");
            stackIn_70_0 = stackOut_67_0;
            stackIn_70_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L13;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_71_0 = stackOut_68_0;
              stackIn_71_1 = stackOut_68_1;
              stackIn_71_2 = stackOut_68_2;
              break L13;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_71_0, stackIn_71_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte[] param2, CharSequence param3, int param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_189_0 = 0;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_193_0 = null;
        StringBuilder stackIn_193_1 = null;
        RuntimeException stackIn_194_0 = null;
        StringBuilder stackIn_194_1 = null;
        String stackIn_194_2 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        RuntimeException stackIn_197_0 = null;
        StringBuilder stackIn_197_1 = null;
        RuntimeException stackIn_198_0 = null;
        StringBuilder stackIn_198_1 = null;
        String stackIn_198_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_184_0 = false;
        int stackOut_188_0 = 0;
        int stackOut_186_0 = 0;
        RuntimeException stackOut_190_0 = null;
        StringBuilder stackOut_190_1 = null;
        RuntimeException stackOut_193_0 = null;
        StringBuilder stackOut_193_1 = null;
        String stackOut_193_2 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        String stackOut_191_2 = null;
        RuntimeException stackOut_194_0 = null;
        StringBuilder stackOut_194_1 = null;
        RuntimeException stackOut_197_0 = null;
        StringBuilder stackOut_197_1 = null;
        String stackOut_197_2 = null;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        String stackOut_195_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            var6_int = -param1 + param0;
            var7 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var6_int >= ~var7) {
                    break L3;
                  } else {
                    var8 = param3.charAt(param1 + var7);
                    stackOut_3_0 = ~var8;
                    stackIn_185_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (stackIn_4_0 >= -1) {
                              break L6;
                            } else {
                              if (var8 < 128) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var8 < 160) {
                              break L7;
                            } else {
                              if (255 >= var8) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var8 != 8364) {
                              break L8;
                            } else {
                              param2[param4 + var7] = (byte) -128;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (8218 != var8) {
                              break L9;
                            } else {
                              param2[param4 - -var7] = (byte) -126;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var8 != 402) {
                              break L10;
                            } else {
                              param2[param4 + var7] = (byte) -125;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if (var8 != 8222) {
                              break L11;
                            } else {
                              param2[param4 - -var7] = (byte) -124;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var8 == 8230) {
                              break L12;
                            } else {
                              L13: {
                                if (var8 != 8224) {
                                  break L13;
                                } else {
                                  param2[var7 + param4] = (byte) -122;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                if (8225 != var8) {
                                  break L14;
                                } else {
                                  param2[var7 + param4] = (byte) -121;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L15: {
                                if (var8 != 710) {
                                  break L15;
                                } else {
                                  param2[param4 + var7] = (byte) -120;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (var8 != 8240) {
                                  break L16;
                                } else {
                                  param2[param4 - -var7] = (byte) -119;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              L17: {
                                if (var8 == 352) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var8 != 8249) {
                                      break L18;
                                    } else {
                                      param2[param4 - -var7] = (byte) -117;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (var8 == 338) {
                                      break L19;
                                    } else {
                                      L20: {
                                        if (var8 == 381) {
                                          break L20;
                                        } else {
                                          L21: {
                                            if (var8 != 8216) {
                                              break L21;
                                            } else {
                                              param2[var7 + param4] = (byte) -111;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          L22: {
                                            if (var8 == 8217) {
                                              break L22;
                                            } else {
                                              L23: {
                                                if (var8 == 8220) {
                                                  break L23;
                                                } else {
                                                  L24: {
                                                    if (var8 != 8221) {
                                                      break L24;
                                                    } else {
                                                      param2[param4 - -var7] = (byte) -108;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L24;
                                                      }
                                                    }
                                                  }
                                                  L25: {
                                                    if (var8 == 8226) {
                                                      break L25;
                                                    } else {
                                                      L26: {
                                                        if (var8 != 8211) {
                                                          break L26;
                                                        } else {
                                                          param2[var7 + param4] = (byte) -106;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        if (var8 == 8212) {
                                                          break L27;
                                                        } else {
                                                          L28: {
                                                            if (732 != var8) {
                                                              break L28;
                                                            } else {
                                                              param2[param4 - -var7] = (byte) -104;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          L29: {
                                                            if (var8 == 8482) {
                                                              break L29;
                                                            } else {
                                                              L30: {
                                                                if (var8 != 353) {
                                                                  break L30;
                                                                } else {
                                                                  param2[param4 + var7] = (byte) -102;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              L31: {
                                                                if (8250 != var8) {
                                                                  break L31;
                                                                } else {
                                                                  param2[param4 + var7] = (byte) -101;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                              L32: {
                                                                if (var8 == 339) {
                                                                  break L32;
                                                                } else {
                                                                  L33: {
                                                                    if (var8 != 382) {
                                                                      break L33;
                                                                    } else {
                                                                      param2[var7 + param4] = (byte) -98;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                  L34: {
                                                                    if (var8 == 376) {
                                                                      break L34;
                                                                    } else {
                                                                      param2[param4 + var7] = (byte) 63;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L34;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[var7 + param4] = (byte) -97;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L32;
                                                                  }
                                                                }
                                                              }
                                                              param2[var7 + param4] = (byte) -100;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param4] = (byte) -103;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      param2[param4 + var7] = (byte) -105;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  param2[param4 - -var7] = (byte) -107;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              param2[var7 + param4] = (byte) -109;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          param2[param4 + var7] = (byte) -110;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      param2[var7 + param4] = (byte) -114;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  param2[param4 + var7] = (byte) -116;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              param2[var7 + param4] = (byte) -118;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L12;
                              }
                            }
                          }
                          param2[param4 - -var7] = (byte) -123;
                          if (var9 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                        param2[var7 + param4] = (byte)var8;
                        break L4;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_184_0 = param5;
                stackIn_185_0 = stackOut_184_0 ? 1 : 0;
                break L2;
              }
              if (stackIn_185_0 == 0) {
                stackOut_188_0 = var6_int;
                stackIn_189_0 = stackOut_188_0;
                break L0;
              } else {
                stackOut_186_0 = 14;
                stackIn_187_0 = stackOut_186_0;
                return stackIn_187_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var6 = decompiledCaughtException;
            stackOut_190_0 = (RuntimeException) var6;
            stackOut_190_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(param1).append(',');
            stackIn_193_0 = stackOut_190_0;
            stackIn_193_1 = stackOut_190_1;
            stackIn_191_0 = stackOut_190_0;
            stackIn_191_1 = stackOut_190_1;
            if (param2 == null) {
              stackOut_193_0 = (RuntimeException) (Object) stackIn_193_0;
              stackOut_193_1 = (StringBuilder) (Object) stackIn_193_1;
              stackOut_193_2 = "null";
              stackIn_194_0 = stackOut_193_0;
              stackIn_194_1 = stackOut_193_1;
              stackIn_194_2 = stackOut_193_2;
              break L35;
            } else {
              stackOut_191_0 = (RuntimeException) (Object) stackIn_191_0;
              stackOut_191_1 = (StringBuilder) (Object) stackIn_191_1;
              stackOut_191_2 = "{...}";
              stackIn_194_0 = stackOut_191_0;
              stackIn_194_1 = stackOut_191_1;
              stackIn_194_2 = stackOut_191_2;
              break L35;
            }
          }
          L36: {
            stackOut_194_0 = (RuntimeException) (Object) stackIn_194_0;
            stackOut_194_1 = ((StringBuilder) (Object) stackIn_194_1).append(stackIn_194_2).append(',');
            stackIn_197_0 = stackOut_194_0;
            stackIn_197_1 = stackOut_194_1;
            stackIn_195_0 = stackOut_194_0;
            stackIn_195_1 = stackOut_194_1;
            if (param3 == null) {
              stackOut_197_0 = (RuntimeException) (Object) stackIn_197_0;
              stackOut_197_1 = (StringBuilder) (Object) stackIn_197_1;
              stackOut_197_2 = "null";
              stackIn_198_0 = stackOut_197_0;
              stackIn_198_1 = stackOut_197_1;
              stackIn_198_2 = stackOut_197_2;
              break L36;
            } else {
              stackOut_195_0 = (RuntimeException) (Object) stackIn_195_0;
              stackOut_195_1 = (StringBuilder) (Object) stackIn_195_1;
              stackOut_195_2 = "{...}";
              stackIn_198_0 = stackOut_195_0;
              stackIn_198_1 = stackOut_195_1;
              stackIn_198_2 = stackOut_195_2;
              break L36;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_198_0, stackIn_198_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_189_0;
    }

    static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = param0 ^ param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "hi.F(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = Main.field_T;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var2_int <= ~param0.length()) {
                    break L3;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_3_0 = cf.a((byte) 112, (char) var3);
                    stackIn_16_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0) {
                          break L4;
                        } else {
                          if (!Main.a(param1 ^ -49, (char) var3)) {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("hi.A(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
