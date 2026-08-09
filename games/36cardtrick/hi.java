/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static boolean field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = (String) null;
        }
        field_b = null;
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            java.net.URL stackIn_44_0 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            StringBuilder stackIn_50_1 = null;
            StringBuilder stackIn_51_1 = null;
            String stackIn_51_2 = null;
            StringBuilder stackIn_53_1 = null;
            StringBuilder stackIn_54_1 = null;
            String stackIn_54_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Main.field_T;
            try {
              L0: {
                var5 = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (var7_int < 0) {
                          break L3;
                        } else {
                          if ((param3 ^ -1) > -1) {
                            break L2;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      }
                    }
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          if (param0 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (0 > var7_int) {
                        break L6;
                      } else {
                        if (param2 == null) {
                          break L2;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (param3 <= 0) {
                        break L8;
                      } else {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param3));
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if (param0.length() <= 0) {
                          break L9;
                        } else {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) < -1) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param2);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$8 = var7.append('/');
                        break L11;
                      }
                    }
                    if (param4 == 353) {
                      try {
                        L12: {
                          stackIn_42_0 = new java.net.URL(param1, var7.toString());
                          break L12;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var8 = (Exception) (Object) decompiledCaughtException;
                        var8.printStackTrace();
                        stackIn_44_0 = (java.net.URL) (param1);
                        return stackIn_44_0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_40_0 = (java.net.URL) null;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_47_0 = (RuntimeException) (var5_ref);

                stackIn_47_1 = new StringBuilder().append("hi.D(");

                if (param0 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "null";
                  break L13;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackIn_48_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

                if (param1 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "null";
                  break L14;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackIn_51_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_53_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');

                if (param2 == null) {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "null";
                  break L15;
                } else {
                  stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
                  stackIn_54_2 = "{...}";
                  break L15;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_48_0), stackIn_54_2 + ',' + param3 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_40_0;
            } else {
              return stackIn_42_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, byte param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Main.field_T;
        try {
          L0: {
            L1: {
              Main.field_G = Main.field_G + 1;
              if (0 != (ca.field_a ^ -1)) {
                break L1;
              } else {
                if ((ug.field_h ^ -1) != 0) {
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
                  if (param0.equals(t.field_e)) {
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
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_16_0;
                  if (param0 == null) {
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
              if (param0 == null) {
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
            L10: {
              if (param1 < -32) {
                break L10;
              } else {
                field_a = true;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var2);

            stackIn_39_1 = new StringBuilder().append("hi.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L11;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L11;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, byte[] param2, CharSequence param3, int param4, boolean param5) {
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        try {
          L0: {
            var6_int = -param1 + param0;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                if (!param5) {
                  stackIn_70_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_68_0 = 14;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param3.charAt(param1 + var7);
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
                              param2[param4 - -var7] = (byte)-123;
                              break L2;
                            } else {
                              if (var8 != 8224) {
                                if (8225 != var8) {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (var8 == 352) {
                                        param2[var7 + param4] = (byte)-118;
                                        break L2;
                                      } else {
                                        if (var8 != 8249) {
                                          if (var8 == 338) {
                                            param2[param4 + var7] = (byte)-116;
                                            break L2;
                                          } else {
                                            if (var8 == 381) {
                                              param2[var7 + param4] = (byte)-114;
                                              break L2;
                                            } else {
                                              if (var8 != 8216) {
                                                if (var8 == 8217) {
                                                  param2[param4 + var7] = (byte)-110;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param2[var7 + param4] = (byte)-109;
                                                    break L2;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param2[param4 - -var7] = (byte)-107;
                                                        break L2;
                                                      } else {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param2[param4 + var7] = (byte)-105;
                                                            break L2;
                                                          } else {
                                                            if (732 != var8) {
                                                              if (var8 == 8482) {
                                                                param2[var7 + param4] = (byte)-103;
                                                                break L2;
                                                              } else {
                                                                if (var8 != 353) {
                                                                  if (8250 != var8) {
                                                                    if (var8 == 339) {
                                                                      param2[var7 + param4] = (byte)-100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param2[var7 + param4] = (byte)-97;
                                                                          break L2;
                                                                        } else {
                                                                          param2[param4 + var7] = (byte)63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param2[var7 + param4] = (byte)-98;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param2[param4 + var7] = (byte)-101;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param2[param4 + var7] = (byte)-102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              param2[param4 - -var7] = (byte)-104;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          param2[var7 + param4] = (byte)-106;
                                                          break L2;
                                                        }
                                                      }
                                                    } else {
                                                      param2[param4 - -var7] = (byte)-108;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param2[var7 + param4] = (byte)-111;
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          param2[param4 - -var7] = (byte)-117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param2[param4 - -var7] = (byte)-119;
                                      break L2;
                                    }
                                  } else {
                                    param2[param4 + var7] = (byte)-120;
                                    break L2;
                                  }
                                } else {
                                  param2[var7 + param4] = (byte)-121;
                                  break L2;
                                }
                              } else {
                                param2[var7 + param4] = (byte)-122;
                                break L2;
                              }
                            }
                          } else {
                            param2[param4 - -var7] = (byte)-124;
                            break L2;
                          }
                        } else {
                          param2[param4 + var7] = (byte)-125;
                          break L2;
                        }
                      } else {
                        param2[param4 - -var7] = (byte)-126;
                        break L2;
                      }
                    } else {
                      param2[param4 + var7] = (byte)-128;
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
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("hi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');

            if (param3 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L7;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_68_0;
        } else {
          return stackIn_70_0;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            var2_int = param1;
            L1: while (true) {
              if (var2_int >= param0.length()) {
                stackIn_10_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var3 = param0.charAt(var2_int);
                  if (cf.a((byte) 112, (char) var3)) {
                    break L2;
                  } else {
                    if (!Main.a(param1 ^ -49, (char) var3)) {
                      stackIn_7_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
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
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("hi.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    static {
        field_a = false;
    }
}
