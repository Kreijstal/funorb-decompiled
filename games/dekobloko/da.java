/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static byte[] field_a;
    static i field_b;
    static cc field_c;
    static boolean[] field_d;
    static tf field_e;

    final static jc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jc var7 = null;
        int var8 = 0;
        jc stackIn_4_0 = null;
        jc stackIn_7_0 = null;
        jc stackIn_11_0 = null;
        jc stackIn_15_0 = null;
        jc stackIn_18_0 = null;
        jc stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jc stackOut_3_0 = null;
        jc stackOut_10_0 = null;
        jc stackOut_14_0 = null;
        jc stackOut_17_0 = null;
        jc stackOut_22_0 = null;
        jc stackOut_6_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackOut_3_0 = hm.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= -256) {
                var3 = ji.a('.', (byte) 66, param0);
                if (2 > var3.length) {
                  stackOut_10_0 = hm.field_a;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var4.length <= var5) {
                          break L3;
                        } else {
                          var6 = var4[var5];
                          var7 = ga.a(param1 ^ -4549, var6);
                          stackOut_14_0 = (jc) (var7);
                          stackIn_23_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (stackIn_15_0 != null) {
                              stackOut_17_0 = (jc) (var7);
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            } else {
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      L4: {
                        if (param1 == -2734) {
                          break L4;
                        } else {
                          da.a((byte) 4);
                          break L4;
                        }
                      }
                      stackOut_22_0 = oe.a((byte) 86, var3[var3.length + -1]);
                      stackIn_23_0 = stackOut_22_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackOut_6_0 = ga.field_e;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("da.F(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0;
              } else {
                return stackIn_18_0;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0 != -121) {
            field_d = (boolean[]) null;
        }
        field_d = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        fl.a(130, 256, 16694016, kc.field_s, 82 - -param0, w.field_kb);
        var2 = 145;
        fb.field_c[0][0].c(82 + param0, var2, 18, 18);
        var2 = var2 + (ga.a(188, 0, var2, cc.field_d, 16, 64, 16777215, se.field_S, (byte) -124, 0, 110 + param0) * 16 + 16);
        fb.field_c[1][3].c(param0 + 82, var2, 18, 18);
        var2 = var2 + (16 - -(ga.a(188, 0, var2, dn.field_q, 16, 64, 16777215, se.field_S, (byte) -125, 0, 110 - -param0) * 16));
        ri.a(var2, kk.field_n, gi.field_c, -115, 190 + param0, nf.field_e, 0);
        hk.g(309 + param0, 117, 242, 263172);
        var2 = 116;
        hk.g(param0 + 310, 117, 242, 6316128);
        fl.a(var2 - -14, 256, 16694016, ug.field_n, 322 + param0, w.field_kb);
        var2 += 29;
        fl.a(13 + var2, 256, 16777215, vk.field_b[0], param0 + 322, se.field_S);
        ph.field_yb[0].c(param0 + 480, var2 - -1);
        var2 += 18;
        fl.a(13 + var2, 256, 16777215, vk.field_b[1], 322 - -param0, se.field_S);
        ph.field_yb[1].c(param0 + 480, var2 - -1);
        var2 += 34;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[2], param0 + 322, se.field_S);
        ph.field_yb[3].c(480 - -param0, var2 + 1);
        var2 += 18;
        fl.a(var2 - -13, 256, 16777215, vk.field_b[3], param0 + 322, se.field_S);
        ph.field_yb[4].c(param0 + 480, var2 - -1);
        ed.a(16777215, 506 - -param0, vk.field_b[4], var2 + 13, (byte) 75, se.field_S);
        ph.field_yb[2].c(516 + param0, var2 - -1);
        var2 += 34;
        fl.a(var2 + 13, 256, 16777215, vk.field_b[5], 322 + param0, se.field_S);
        if (!param1) {
          return;
        } else {
          ph.field_yb[5].c(param0 + 480, var2 + 1);
          var2 += 34;
          fl.a(14 + var2, 256, 16694016, kc.field_q, param0 + 322, w.field_kb);
          var2 += 29;
          fl.a(13 + var2, 256, 16777215, vk.field_b[6], 322 - -param0, se.field_S);
          ph.field_yb[6].c(480 + param0, 1 + var2);
          return;
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            if (param0 != -109) {
                da.a((byte) -7);
            }
            db.a(-127, param1, param2, false);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "da.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
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
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -param5 + param0;
              var7 = 0;
              if (param2 == -8218) {
                break L1;
              } else {
                da.a(true, false);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var7 >= var6_int) {
                    break L4;
                  } else {
                    var8 = param3.charAt(param5 + var7);
                    stackOut_4_0 = 0;
                    stackIn_97_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_5_0 >= var8) {
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
                            if (var8 != 8364) {
                              break L9;
                            } else {
                              param4[param1 + var7] = (byte)-128;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var8 == 8218) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 != 402) {
                                  break L11;
                                } else {
                                  param4[param1 + var7] = (byte)-125;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (8222 == var8) {
                                  break L12;
                                } else {
                                  L13: {
                                    if (var8 != 8230) {
                                      break L13;
                                    } else {
                                      param4[param1 + var7] = (byte)-123;
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var8 == 8224) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (var8 == 8225) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (710 != var8) {
                                              break L16;
                                            } else {
                                              param4[param1 + var7] = (byte)-120;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (8240 == var8) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (var8 == 352) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (var8 != 8249) {
                                                      break L19;
                                                    } else {
                                                      param4[var7 + param1] = (byte)-117;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L20: {
                                                    if (var8 == 338) {
                                                      break L20;
                                                    } else {
                                                      L21: {
                                                        if (381 != var8) {
                                                          break L21;
                                                        } else {
                                                          param4[param1 + var7] = (byte)-114;
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
                                                                if (var8 != 8220) {
                                                                  break L24;
                                                                } else {
                                                                  param4[var7 + param1] = (byte)-109;
                                                                  if (var9 == 0) {
                                                                    break L5;
                                                                  } else {
                                                                    break L24;
                                                                  }
                                                                }
                                                              }
                                                              L25: {
                                                                if (var8 != 8221) {
                                                                  break L25;
                                                                } else {
                                                                  param4[var7 + param1] = (byte)-108;
                                                                  if (var9 == 0) {
                                                                    break L5;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              L26: {
                                                                if (var8 == 8226) {
                                                                  break L26;
                                                                } else {
                                                                  L27: {
                                                                    if (var8 != 8211) {
                                                                      break L27;
                                                                    } else {
                                                                      param4[param1 + var7] = (byte)-106;
                                                                      if (var9 == 0) {
                                                                        break L5;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  L28: {
                                                                    if (var8 != 8212) {
                                                                      break L28;
                                                                    } else {
                                                                      param4[var7 + param1] = (byte)-105;
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
                                                                      param4[var7 + param1] = (byte)-104;
                                                                      if (var9 == 0) {
                                                                        break L5;
                                                                      } else {
                                                                        break L29;
                                                                      }
                                                                    }
                                                                  }
                                                                  L30: {
                                                                    if (var8 == 8482) {
                                                                      break L30;
                                                                    } else {
                                                                      L31: {
                                                                        if (353 == var8) {
                                                                          break L31;
                                                                        } else {
                                                                          L32: {
                                                                            if (var8 != 8250) {
                                                                              break L32;
                                                                            } else {
                                                                              param4[var7 + param1] = (byte)-101;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          L33: {
                                                                            if (var8 != 339) {
                                                                              break L33;
                                                                            } else {
                                                                              param4[var7 + param1] = (byte)-100;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          }
                                                                          L34: {
                                                                            if (var8 == 382) {
                                                                              break L34;
                                                                            } else {
                                                                              L35: {
                                                                                if (376 == var8) {
                                                                                  break L35;
                                                                                } else {
                                                                                  param4[var7 + param1] = (byte)63;
                                                                                  if (var9 == 0) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    break L35;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param4[var7 + param1] = (byte)-97;
                                                                              if (var9 == 0) {
                                                                                break L5;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          param4[param1 + var7] = (byte)-98;
                                                                          if (var9 == 0) {
                                                                            break L5;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[param1 - -var7] = (byte)-102;
                                                                      if (var9 == 0) {
                                                                        break L5;
                                                                      } else {
                                                                        break L30;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[param1 - -var7] = (byte)-103;
                                                                  if (var9 == 0) {
                                                                    break L5;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                }
                                                              }
                                                              param4[param1 + var7] = (byte)-107;
                                                              if (var9 == 0) {
                                                                break L5;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param1] = (byte)-110;
                                                          if (var9 == 0) {
                                                            break L5;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      param4[var7 + param1] = (byte)-111;
                                                      if (var9 == 0) {
                                                        break L5;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param1] = (byte)-116;
                                                  if (var9 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              param4[param1 + var7] = (byte)-118;
                                              if (var9 == 0) {
                                                break L5;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param4[param1 - -var7] = (byte)-119;
                                          if (var9 == 0) {
                                            break L5;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      param4[var7 + param1] = (byte)-121;
                                      if (var9 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  param4[param1 - -var7] = (byte)-122;
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              param4[param1 + var7] = (byte)-124;
                              if (var9 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param4[param1 - -var7] = (byte)-126;
                          if (var9 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                        param4[var7 + param1] = (byte)var8;
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
            stackOut_98_1 = new StringBuilder().append("da.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param3 == null) {
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
            stackOut_101_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(',');
            stackIn_103_0 = stackOut_101_0;
            stackIn_103_1 = stackOut_101_1;
            stackIn_102_0 = stackOut_101_0;
            stackIn_102_1 = stackOut_101_1;
            if (param4 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_104_0), stackIn_104_2 + ',' + param5 + ')');
        }
        return stackIn_97_0;
    }

    final static void a(boolean param0, boolean param1) {
        he.a(param1, -95);
        if (param0) {
            return;
        }
        if (!(null == sl.field_g)) {
            qd.a(sl.field_g, -2);
        }
    }

    static {
        field_b = new i();
    }
}
