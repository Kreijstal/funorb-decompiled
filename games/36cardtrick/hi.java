/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class hi {
    static boolean field_a;
    static String field_b;

    public static void a() {
        field_b = null;
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2) {
        try {
            RuntimeException var5 = null;
            String var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_47_0 = null;
            java.net.URL stackIn_49_0 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            RuntimeException stackIn_59_0 = null;
            StringBuilder stackIn_59_1 = null;
            String stackIn_59_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_46_0 = null;
            java.net.URL stackOut_48_0 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            RuntimeException stackOut_52_0 = null;
            StringBuilder stackOut_52_1 = null;
            String stackOut_52_2 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_53_0 = null;
            StringBuilder stackOut_53_1 = null;
            RuntimeException stackOut_55_0 = null;
            StringBuilder stackOut_55_1 = null;
            String stackOut_55_2 = null;
            RuntimeException stackOut_54_0 = null;
            StringBuilder stackOut_54_1 = null;
            String stackOut_54_2 = null;
            RuntimeException stackOut_56_0 = null;
            StringBuilder stackOut_56_1 = null;
            RuntimeException stackOut_58_0 = null;
            StringBuilder stackOut_58_1 = null;
            String stackOut_58_2 = null;
            RuntimeException stackOut_57_0 = null;
            StringBuilder stackOut_57_1 = null;
            String stackOut_57_2 = null;
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
                        if (var7_int < 0) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      if (var5_ref.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var5_ref.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5_ref.indexOf('/', 1 + var6);
                        if (var7_int >= 0) {
                          if (param0 != null) {
                            var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                            continue L0;
                          } else {
                            var6 = var7_int;
                            continue L0;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var5_ref.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5_ref.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5_ref.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L5;
                      } else {
                        if (null == param2) {
                          break L1;
                        } else {
                          var5_ref = var5_ref.substring(0, var6) + var5_ref.substring(var7_int);
                          continue L0;
                        }
                      }
                    }
                    var7 = new StringBuilder(var6);
                    StringBuilder discarded$7 = var7.append(var5_ref.substring(0, var6));
                    L7: {
                      if (null == param0) {
                        break L7;
                      } else {
                        if (param0.length() <= 0) {
                          break L7;
                        } else {
                          StringBuilder discarded$8 = var7.append("/p=");
                          StringBuilder discarded$9 = var7.append(param0);
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (param2 == null) {
                        break L8;
                      } else {
                        if (param2.length() > 0) {
                          StringBuilder discarded$10 = var7.append("/s=");
                          StringBuilder discarded$11 = var7.append(param2);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var5_ref.length() > var6) {
                        StringBuilder discarded$12 = var7.append(var5_ref.substring(var6, var5_ref.length()));
                        break L9;
                      } else {
                        StringBuilder discarded$13 = var7.append('/');
                        break L9;
                      }
                    }
                    stackOut_46_0 = new java.net.URL(param1, var7.toString());
                    stackIn_47_0 = stackOut_46_0;
                    return stackIn_47_0;
                  }
                  var6 = var7_int;
                  continue L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8 = (Exception) (Object) decompiledCaughtException;
                var8.printStackTrace();
                stackOut_48_0 = (java.net.URL) param1;
                stackIn_49_0 = stackOut_48_0;
                return stackIn_49_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_50_0 = (RuntimeException) var5;
                stackOut_50_1 = new StringBuilder().append("hi.D(");
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                if (param0 == null) {
                  stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                  stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                  stackOut_52_2 = "null";
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  stackIn_53_2 = stackOut_52_2;
                  break L10;
                } else {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "{...}";
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  stackIn_53_2 = stackOut_51_2;
                  break L10;
                }
              }
              L11: {
                stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                stackOut_53_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',');
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                stackIn_54_0 = stackOut_53_0;
                stackIn_54_1 = stackOut_53_1;
                if (param1 == null) {
                  stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                  stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                  stackOut_55_2 = "null";
                  stackIn_56_0 = stackOut_55_0;
                  stackIn_56_1 = stackOut_55_1;
                  stackIn_56_2 = stackOut_55_2;
                  break L11;
                } else {
                  stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
                  stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
                  stackOut_54_2 = "{...}";
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  break L11;
                }
              }
              L12: {
                stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
                stackOut_56_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');
                stackIn_58_0 = stackOut_56_0;
                stackIn_58_1 = stackOut_56_1;
                stackIn_57_0 = stackOut_56_0;
                stackIn_57_1 = stackOut_56_1;
                if (param2 == null) {
                  stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
                  stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
                  stackOut_58_2 = "null";
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  stackIn_59_2 = stackOut_58_2;
                  break L12;
                } else {
                  stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
                  stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
                  stackOut_57_2 = "{...}";
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  stackIn_59_2 = stackOut_57_2;
                  break L12;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ',' + -1 + ',' + 353 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
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
                if (!k.field_b) {
                  if (Main.field_G >= ek.field_e) {
                    if (ek.field_e - -ra.field_e > Main.field_G) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_17_0;
                  if (null == param0) {
                    break L6;
                  } else {
                    L7: {
                      if (k.field_b) {
                        break L7;
                      } else {
                        if (var2_int == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    Main.field_G = ek.field_e;
                    break L5;
                  }
                }
                Main.field_G = 0;
                break L5;
              }
              ti.field_a = ug.field_h;
              p.field_k = ca.field_a;
              if (null == param0) {
                if (var2_int != 0) {
                  k.field_b = true;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                k.field_b = false;
                break L2;
              }
            }
            L8: {
              t.field_e = param0;
              if (k.field_b) {
                break L8;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L8;
                } else {
                  if (!d.field_s) {
                    break L8;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L8;
                  }
                }
              }
            }
            L9: {
              ca.field_a = -1;
              ug.field_h = -1;
              if (!k.field_b) {
                break L9;
              } else {
                if (id.field_b != Main.field_G) {
                  break L9;
                } else {
                  Main.field_G = 0;
                  k.field_b = false;
                  break L9;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("hi.B(");
            stackIn_44_0 = stackOut_41_0;
            stackIn_44_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_45_0 = stackOut_42_0;
              stackIn_45_1 = stackOut_42_1;
              stackIn_45_2 = stackOut_42_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + -111 + ')');
        }
    }

    final static int a(int param0, int param1, byte[] param2, CharSequence param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_97_0 = 0;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var9 = Main.field_T;
        try {
          L0: {
            var6_int = param0;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                stackOut_97_0 = var6_int;
                stackIn_98_0 = stackOut_97_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param3.charAt(var7);
                      if (var8 <= 0) {
                        break L4;
                      } else {
                        if (var8 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var8 < 160) {
                        break L5;
                      } else {
                        if (255 >= var8) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (8218 != var8) {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param2[param4 - -var7] = (byte) -123;
                              break L2;
                            } else {
                              if (var8 != 8224) {
                                if (8225 != var8) {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (var8 == 352) {
                                        param2[var7 + param4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param2[param4 + var7] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var8 == 381) {
                                              param2[var7 + param4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var8 != 8216) {
                                                if (var8 == 8217) {
                                                  param2[param4 + var7] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param2[var7 + param4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param2[param4 - -var7] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param2[param4 + var7] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (732 != var8) {
                                                              if (var8 == 8482) {
                                                                param2[var7 + param4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 353) {
                                                                  if (8250 != var8) {
                                                                    if (var8 == 339) {
                                                                      param2[var7 + param4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param2[var7 + param4] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          param2[param4 + var7] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param2[var7 + param4] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param2[param4 + var7] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param2[param4 + var7] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param2[param4 - -var7] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          param2[var7 + param4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      param2[param4 - -var7] = (byte) -108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param2[var7 + param4] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          param2[param4 - -var7] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param2[param4 - -var7] = (byte) -119;
                                      break L2;
                                    }
                                  } else {
                                    param2[param4 + var7] = (byte) -120;
                                    break L2;
                                  }
                                } else {
                                  param2[var7 + param4] = (byte) -121;
                                  break L2;
                                }
                              } else {
                                param2[var7 + param4] = (byte) -122;
                                break L2;
                              }
                            }
                          } else {
                            param2[param4 - -var7] = (byte) -124;
                            break L2;
                          }
                        } else {
                          param2[param4 + var7] = (byte) -125;
                          break L2;
                        }
                      } else {
                        param2[param4 - -var7] = (byte) -126;
                        break L2;
                      }
                    } else {
                      param2[param4 + var7] = (byte) -128;
                      break L2;
                    }
                  }
                  param2[var7 + param4] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) var6;
            stackOut_99_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(0).append(',');
            stackIn_102_0 = stackOut_99_0;
            stackIn_102_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param2 == null) {
              stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
              stackOut_102_1 = (StringBuilder) (Object) stackIn_102_1;
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L6;
            } else {
              stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
              stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
              stackOut_100_2 = "{...}";
              stackIn_103_0 = stackOut_100_0;
              stackIn_103_1 = stackOut_100_1;
              stackIn_103_2 = stackOut_100_2;
              break L6;
            }
          }
          L7: {
            stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',');
            stackIn_106_0 = stackOut_103_0;
            stackIn_106_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param3 == null) {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "null";
              stackIn_107_0 = stackOut_106_0;
              stackIn_107_1 = stackOut_106_1;
              stackIn_107_2 = stackOut_106_2;
              break L7;
            } else {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "{...}";
              stackIn_107_0 = stackOut_104_0;
              stackIn_107_1 = stackOut_104_1;
              stackIn_107_2 = stackOut_104_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_107_0, stackIn_107_2 + ',' + param4 + ',' + false + ')');
        }
        return stackIn_98_0;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Main.field_T;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (cf.a((byte) 112, (char) var3)) {
                    break L2;
                  } else {
                    if (!Main.a(-49, (char) var3)) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("hi.A(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
