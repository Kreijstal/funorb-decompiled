/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static wb field_a;
    int field_c;
    int field_e;
    int field_j;
    int field_f;
    byte[] field_g;
    byte[] field_h;
    int field_b;
    int field_i;
    int field_d;

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fr var4 = null;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_8_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 8230) {
                break L1;
              } else {
                var4 = (fr) null;
                mq.a((fr) null, (byte) 109);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              L3: {
                if (param1 <= var2_int) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_5_0 = wm.field_f[var2_int];
                  stackIn_12_0 = stackOut_5_0 ? 1 : 0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var3 != 0) {
                    break L3;
                  } else {
                    if (!stackIn_6_0) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var2_int++;
                      continue L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "mq.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 89) {
            field_a = (wb) null;
        }
    }

    final static void a(fr param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ip var8 = null;
        qb var10 = null;
        b var12 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var2_int = 71 / ((param1 - 40) / 59);
              if (null == ic.field_b) {
                var8 = new ip();
                var20 = var8.a((byte) 10, 128, 128, 16);
                ic.field_b = aj.a((byte) -123, var20, false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (qu.field_j != null) {
                break L2;
              } else {
                var10 = new qb();
                var21 = var10.a(16, (byte) -8, 128, 128);
                qu.field_j = aj.a((byte) -117, var21, false);
                break L2;
              }
            }
            L3: {
              var12 = param0.field_Sb;
              if (!var12.b((byte) -101)) {
                break L3;
              } else {
                if (null == dj.field_m) {
                  var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                  dj.field_m = aj.a((byte) -126, var22, false);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("mq.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2, CharSequence param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_97_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_96_0 = 0;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -param0 + param4;
              var7 = 0;
              if (param2 < -106) {
                break L1;
              } else {
                field_a = (wb) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var6_int <= var7) {
                    break L4;
                  } else {
                    var8 = param3.charAt(var7 + param0);
                    stackOut_4_0 = var8 ^ -1;
                    stackIn_97_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_5_0 >= -1) {
                              break L7;
                            } else {
                              if (var8 < 128) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var8 < 160) {
                              break L8;
                            } else {
                              if (var8 <= 255) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var8 == 8364) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 != 8218) {
                                  break L10;
                                } else {
                                  param1[var7 + param5] = (byte)-126;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (402 != var8) {
                                  break L11;
                                } else {
                                  param1[param5 - -var7] = (byte)-125;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var8 != 8222) {
                                  break L12;
                                } else {
                                  param1[param5 - -var7] = (byte)-124;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (var8 == 8230) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var8 == 8224) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (8225 != var8) {
                                          break L15;
                                        } else {
                                          param1[var7 + param5] = (byte)-121;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (710 != var8) {
                                          break L16;
                                        } else {
                                          param1[param5 - -var7] = (byte)-120;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      L17: {
                                        if (var8 == 8240) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (var8 == 352) {
                                              break L18;
                                            } else {
                                              L19: {
                                                if (var8 == 8249) {
                                                  break L19;
                                                } else {
                                                  L20: {
                                                    if (338 == var8) {
                                                      break L20;
                                                    } else {
                                                      L21: {
                                                        if (var8 != 381) {
                                                          break L21;
                                                        } else {
                                                          param1[var7 + param5] = (byte)-114;
                                                          if (var9 == 0) {
                                                            break L5;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if (var8 == 8216) {
                                                          break L22;
                                                        } else {
                                                          L23: {
                                                            if (var8 == 8217) {
                                                              break L23;
                                                            } else {
                                                              L24: {
                                                                if (8220 == var8) {
                                                                  break L24;
                                                                } else {
                                                                  L25: {
                                                                    if (var8 == 8221) {
                                                                      break L25;
                                                                    } else {
                                                                      L26: {
                                                                        if (var8 != 8226) {
                                                                          break L26;
                                                                        } else {
                                                                          param1[var7 + param5] = (byte)-107;
                                                                          if (var9 == 0) {
                                                                            break L5;
                                                                          } else {
                                                                            break L26;
                                                                          }
                                                                        }
                                                                      }
                                                                      L27: {
                                                                        if (var8 == 8211) {
                                                                          break L27;
                                                                        } else {
                                                                          L28: {
                                                                            if (8212 != var8) {
                                                                              break L28;
                                                                            } else {
                                                                              param1[var7 + param5] = (byte)-105;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L28;
                                                                              }
                                                                            }
                                                                          }
                                                                          L29: {
                                                                            if (var8 != 732) {
                                                                              break L29;
                                                                            } else {
                                                                              param1[param5 + var7] = (byte)-104;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L29;
                                                                              }
                                                                            }
                                                                          }
                                                                          L30: {
                                                                            if (8482 != var8) {
                                                                              break L30;
                                                                            } else {
                                                                              param1[param5 - -var7] = (byte)-103;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          L31: {
                                                                            if (var8 == 353) {
                                                                              break L31;
                                                                            } else {
                                                                              L32: {
                                                                                if (var8 == 8250) {
                                                                                  break L32;
                                                                                } else {
                                                                                  L33: {
                                                                                    if (var8 == 339) {
                                                                                      break L33;
                                                                                    } else {
                                                                                      L34: {
                                                                                        if (var8 != 382) {
                                                                                          break L34;
                                                                                        } else {
                                                                                          param1[param5 + var7] = (byte)-98;
                                                                                          if (var9 == 0) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            break L34;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L35: {
                                                                                        if (376 != var8) {
                                                                                          break L35;
                                                                                        } else {
                                                                                          param1[param5 + var7] = (byte)-97;
                                                                                          if (var9 == 0) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            break L35;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      param1[param5 + var7] = (byte)63;
                                                                                      if (var9 == 0) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        break L33;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  param1[param5 - -var7] = (byte)-100;
                                                                                  if (var9 == 0) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param1[var7 + param5] = (byte)-101;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          param1[param5 + var7] = (byte)-102;
                                                                          if (var9 == 0) {
                                                                            break L5;
                                                                          } else {
                                                                            break L27;
                                                                          }
                                                                        }
                                                                      }
                                                                      param1[var7 + param5] = (byte)-106;
                                                                      if (var9 == 0) {
                                                                        break L5;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                  }
                                                                  param1[param5 - -var7] = (byte)-108;
                                                                  if (var9 == 0) {
                                                                    break L5;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              param1[var7 + param5] = (byte)-109;
                                                              if (var9 == 0) {
                                                                break L5;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          param1[var7 + param5] = (byte)-110;
                                                          if (var9 == 0) {
                                                            break L5;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      param1[param5 + var7] = (byte)-111;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  param1[param5 - -var7] = (byte)-116;
                                                  if (var9 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                              param1[var7 + param5] = (byte)-117;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          param1[var7 + param5] = (byte)-118;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      param1[var7 + param5] = (byte)-119;
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  param1[var7 + param5] = (byte)-122;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              param1[param5 - -var7] = (byte)-123;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param1[var7 + param5] = (byte)-128;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        param1[param5 + var7] = (byte)var8;
                        break L5;
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_96_0 = var6_int;
                stackIn_97_0 = stackOut_96_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var6 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var6);
            stackOut_98_1 = new StringBuilder().append("mq.D(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L36;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L36;
            }
          }
          L37: {
            stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
            stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',').append(param2).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param3 == null) {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "null";
              stackIn_104_0 = stackOut_103_0;
              stackIn_104_1 = stackOut_103_1;
              stackIn_104_2 = stackOut_103_2;
              break L37;
            } else {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "{...}";
              stackIn_104_0 = stackOut_102_0;
              stackIn_104_1 = stackOut_102_1;
              stackIn_104_2 = stackOut_102_2;
              break L37;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_97_0;
    }

    static {
    }
}
