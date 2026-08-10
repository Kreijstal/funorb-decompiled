/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static aj field_b;
    static String[] field_a;
    static boolean field_c;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nl var4 = null;
        byte[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -74) {
              if (param0 != null) {
                if (!(param0 instanceof byte[])) {
                  if (param0 instanceof nl) {
                    var4 = (nl) (param0);
                    stackIn_15_0 = var4.a((byte) -121);
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                } else {
                  var3 = (byte[]) (param0);
                  if (param2) {
                    stackIn_11_0 = ld.a(120, var3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_9_0 = (byte[]) (var3);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("nl.H(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L1;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 > -107) {
            field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
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
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 > param1) {
              L1: {
                if (param3 <= -73) {
                  break L1;
                } else {
                  field_b = (aj) null;
                  break L1;
                }
              }
              if (1 + param1 >= param6) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  if (5 + param1 >= param6) {
                    break L2;
                  } else {
                    if (param5 != param4) {
                      var7_int = (param5 >> 10292033) + (param4 >> -535788159) + (1 & (param5 & param4));
                      var8 = param1;
                      var9 = param4;
                      var10 = param5;
                      var11 = param1;
                      L3: while (true) {
                        if (param6 <= var11) {
                          nl.a(param0, param1, param2, -86, param4, var9, var8);
                          nl.a(param0, var8, param2, -122, var10, param5, param6);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L4: {
                            var12 = ff.field_a[var11];
                            if (param2) {
                              stackIn_25_0 = we.field_g[var12];
                              break L4;
                            } else {
                              stackIn_25_0 = oj.field_j[var12];
                              break L4;
                            }
                          }
                          L5: {
                            var13 = stackIn_25_0;
                            if (var13 <= var7_int) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L5;
                              } else {
                                var11++;
                                continue L3;
                              }
                            } else {
                              ff.field_a[var11] = ff.field_a[var8];
                              incrementValue$0 = var8;
                              var8++;
                              ff.field_a[incrementValue$0] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var11++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var7_int = param6 + -1;
                L6: while (true) {
                  if (param1 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param1;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = ff.field_a[var8];
                          var10 = ff.field_a[1 + var8];
                          if (!cb.a((byte) 63, param2, var10, var9)) {
                            break L8;
                          } else {
                            ff.field_a[var8] = var10;
                            ff.field_a[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var7), "nl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              bk.field_c = c.field_o;
              if (param1 == -6258) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            L2: {
              if ((param0 ^ -1) == -256) {
                L3: {
                  if ((cg.field_l ^ -1) <= -14) {
                    stackIn_11_0 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
                li.field_T = mc.b(stackIn_11_0 != 0, param1 ^ -6168);
                break L2;
              } else {
                L4: {
                  if (-101 < (param0 ^ -1)) {
                    break L4;
                  } else {
                    if (param0 > 105) {
                      break L4;
                    } else {
                      li.field_T = oe.a(124, param3);
                      break L2;
                    }
                  }
                }
                li.field_T = wi.a(param0, (byte) -65, param2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("nl.I(").append(param0).append(',').append(param1).append(',');

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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    final static int a(int param0, int param1, byte param2, byte[] param3, CharSequence param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < -79) {
                break L1;
              } else {
                field_b = (aj) null;
                break L1;
              }
            }
            var6_int = -param1 + param0;
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param4.charAt(param1 + var7);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (8364 == var8) {
                      param3[param5 - -var7] = (byte)-128;
                      break L3;
                    } else {
                      if (var8 == 8218) {
                        param3[param5 - -var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (8230 == var8) {
                              param3[var7 + param5] = (byte)-123;
                              break L3;
                            } else {
                              if (var8 != 8224) {
                                if (var8 != 8225) {
                                  if (710 == var8) {
                                    param3[var7 + param5] = (byte)-120;
                                    break L3;
                                  } else {
                                    if (8240 == var8) {
                                      param3[var7 + param5] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 == 8249) {
                                          param3[param5 + var7] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var8 == 338) {
                                            param3[param5 - -var7] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param3[var7 + param5] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (var8 == 8216) {
                                                param3[var7 + param5] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (8217 != var8) {
                                                  if (var8 != 8220) {
                                                    if (8221 != var8) {
                                                      if (var8 != 8226) {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param3[param5 + var7] = (byte)-105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param3[param5 - -var7] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var8) {
                                                                  param3[param5 + var7] = (byte)-102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param3[param5 + var7] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param3[param5 - -var7] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param3[param5 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param3[param5 - -var7] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param3[var7 + param5] = (byte)-98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param3[var7 + param5] = (byte)-104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param3[var7 + param5] = (byte)-106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        param3[var7 + param5] = (byte)-107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param3[param5 - -var7] = (byte)-108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param3[var7 + param5] = (byte)-109;
                                                    break L3;
                                                  }
                                                } else {
                                                  param3[var7 + param5] = (byte)-110;
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        param3[var7 + param5] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  param3[var7 + param5] = (byte)-121;
                                  break L3;
                                }
                              } else {
                                param3[param5 - -var7] = (byte)-122;
                                break L3;
                              }
                            }
                          } else {
                            param3[param5 - -var7] = (byte)-124;
                            break L3;
                          }
                        } else {
                          param3[var7 + param5] = (byte)-125;
                          break L3;
                        }
                      }
                    }
                  }
                  param3[param5 + var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("nl.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param4 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    static {
        field_b = new aj(10, 2, 2, 0);
    }
}
