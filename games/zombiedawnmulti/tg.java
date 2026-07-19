/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements Runnable {
    go field_b;
    static byte[] field_a;
    static cj field_d;
    volatile boolean field_h;
    volatile boolean field_c;
    volatile gp[] field_f;
    static ag field_i;
    static hk field_e;
    static uc field_g;

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 == -256) {
              var6_int = param5 - param2;
              var7 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_int <= var7) {
                      break L3;
                    } else {
                      var8 = param1.charAt(param2 + var7);
                      stackOut_6_0 = var8;
                      stackIn_99_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                if (stackIn_7_0 <= 0) {
                                  break L7;
                                } else {
                                  if (var8 < 128) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (var8 < 160) {
                                break L5;
                              } else {
                                if (var8 > 255) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            param4[var7 + param0] = (byte)var8;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          L8: {
                            if (8364 == var8) {
                              break L8;
                            } else {
                              L9: {
                                if (8218 == var8) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var8 == 402) {
                                      break L10;
                                    } else {
                                      L11: {
                                        if (var8 == 8222) {
                                          break L11;
                                        } else {
                                          L12: {
                                            if (var8 == 8230) {
                                              break L12;
                                            } else {
                                              L13: {
                                                if (var8 == 8224) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (var8 != 8225) {
                                                      break L14;
                                                    } else {
                                                      param4[param0 - -var7] = (byte)-121;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  }
                                                  L15: {
                                                    if (var8 == 710) {
                                                      break L15;
                                                    } else {
                                                      L16: {
                                                        if (var8 != 8240) {
                                                          break L16;
                                                        } else {
                                                          param4[var7 + param0] = (byte)-119;
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
                                                              param4[param0 + var7] = (byte)-117;
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
                                                                if (var8 != 381) {
                                                                  break L20;
                                                                } else {
                                                                  param4[param0 + var7] = (byte)-114;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L20;
                                                                  }
                                                                }
                                                              }
                                                              L21: {
                                                                if (var8 == 8216) {
                                                                  break L21;
                                                                } else {
                                                                  L22: {
                                                                    if (var8 == 8217) {
                                                                      break L22;
                                                                    } else {
                                                                      L23: {
                                                                        if (var8 == 8220) {
                                                                          break L23;
                                                                        } else {
                                                                          L24: {
                                                                            if (var8 == 8221) {
                                                                              break L24;
                                                                            } else {
                                                                              L25: {
                                                                                if (var8 == 8226) {
                                                                                  break L25;
                                                                                } else {
                                                                                  L26: {
                                                                                    if (var8 != 8211) {
                                                                                      break L26;
                                                                                    } else {
                                                                                      param4[param0 + var7] = (byte)-106;
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
                                                                                          param4[var7 + param0] = (byte)-104;
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
                                                                                            if (353 != var8) {
                                                                                              break L30;
                                                                                            } else {
                                                                                              param4[param0 - -var7] = (byte)-102;
                                                                                              if (var9 == 0) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                break L30;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L31: {
                                                                                            if (var8 != 8250) {
                                                                                              break L31;
                                                                                            } else {
                                                                                              param4[param0 - -var7] = (byte)-101;
                                                                                              if (var9 == 0) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                break L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L32: {
                                                                                            if (var8 != 339) {
                                                                                              break L32;
                                                                                            } else {
                                                                                              param4[param0 + var7] = (byte)-100;
                                                                                              if (var9 == 0) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                break L32;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L33: {
                                                                                            if (var8 != 382) {
                                                                                              break L33;
                                                                                            } else {
                                                                                              param4[var7 + param0] = (byte)-98;
                                                                                              if (var9 == 0) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                break L33;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L34: {
                                                                                            if (var8 != 376) {
                                                                                              break L34;
                                                                                            } else {
                                                                                              param4[param0 - -var7] = (byte)-97;
                                                                                              if (var9 == 0) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                break L34;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          param4[var7 + param0] = (byte)63;
                                                                                          if (var9 == 0) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            break L29;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      param4[var7 + param0] = (byte)-103;
                                                                                      if (var9 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  param4[param0 + var7] = (byte)-105;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L25;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param4[var7 + param0] = (byte)-107;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L24;
                                                                              }
                                                                            }
                                                                          }
                                                                          param4[var7 + param0] = (byte)-108;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L23;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[param0 + var7] = (byte)-109;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L22;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[param0 + var7] = (byte)-110;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L21;
                                                                  }
                                                                }
                                                              }
                                                              param4[var7 + param0] = (byte)-111;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param0] = (byte)-116;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L17;
                                                          }
                                                        }
                                                      }
                                                      param4[var7 + param0] = (byte)-118;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  param4[param0 + var7] = (byte)-120;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              param4[param0 + var7] = (byte)-122;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                          param4[var7 + param0] = (byte)-123;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      param4[param0 - -var7] = (byte)-124;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  param4[param0 + var7] = (byte)-125;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              param4[var7 + param0] = (byte)-126;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          param4[var7 + param0] = (byte)-128;
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
                  stackOut_98_0 = var6_int;
                  stackIn_99_0 = stackOut_98_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 10;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var6 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var6);
            stackOut_100_1 = new StringBuilder().append("tg.H(").append(param0).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param1 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L35;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L35;
            }
          }
          L36: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param4 == null) {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L36;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L36;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_99_0;
        }
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ja var9 = null;
        ja var10 = null;
        ja var11 = null;
        ja var12 = null;
        ja var13 = null;
        Object var14 = null;
        int[] var15 = null;
        ja var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = oo.field_i;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = oo.field_b;
          var8 = oo.field_l;
          var9 = new ja(param3, -(param3 * 2) + param1);
          var9.a();
          oo.a(0, 0, param3, -(param3 * 2) + param1, param4, param2);
          var10 = new ja(param3, param3);
          if (param5 > 25) {
            break L0;
          } else {
            field_d = (cj) null;
            break L0;
          }
        }
        L1: {
          var10.a();
          oo.e(0, 0, param3, param3, param4);
          var11 = new ja(16, param3);
          var11.a();
          oo.e(0, 0, 16, param3, param4);
          var12 = new ja(param3, param3);
          var12.a();
          oo.e(0, 0, param3, param3, param2);
          var13 = new ja(16, param3);
          var13.a();
          oo.e(0, 0, 16, param3, param2);
          var14 = null;
          if (-1 <= (param0 ^ -1)) {
            break L1;
          } else {
            var16 = new ja(16, 16);
            var14 = var16;
            var16.a();
            oo.e(0, 0, 16, 16, param0);
            break L1;
          }
        }
        oo.a(var18, var7, var8);
        return new ja[]{var10, var11, var10, var9, (ja) (var14), var9, var12, var13, var12};
    }

    final static int b(int param0) {
        if (-3 < (fn.field_i ^ -1)) {
          return 0;
        } else {
          if (p.field_e == 0) {
            if (ra.field_l.a((byte) -124)) {
              if (!ra.field_l.a(false, "commonui")) {
                return 40;
              } else {
                if (!fe.field_L.a((byte) -111)) {
                  return 50;
                } else {
                  if (!fe.field_L.a(false, "commonui")) {
                    return 60;
                  } else {
                    if (!wm.field_V.a((byte) -117)) {
                      return 70;
                    } else {
                      if (!wm.field_V.a(0)) {
                        return 80;
                      } else {
                        L0: {
                          if (param0 == 8218) {
                            break L0;
                          } else {
                            field_i = (ag) null;
                            break L0;
                          }
                        }
                        return 100;
                      }
                    }
                  }
                }
              }
            } else {
              return 20;
            }
          } else {
            L1: {
              if (null == cp.field_P) {
                break L1;
              } else {
                if (cp.field_P.a((byte) -116)) {
                  if (cp.field_P.a("", 2)) {
                    if (!cp.field_P.a(false, "")) {
                      return 29;
                    } else {
                      break L1;
                    }
                  } else {
                    return 29;
                  }
                } else {
                  return 14;
                }
              }
            }
            if (ra.field_l.a((byte) -115)) {
              if (!ra.field_l.a(false, "commonui")) {
                return 57;
              } else {
                if (!fe.field_L.a((byte) -115)) {
                  return 71;
                } else {
                  if (!fe.field_L.a(false, "commonui")) {
                    return 80;
                  } else {
                    if (!wm.field_V.a((byte) -122)) {
                      return 82;
                    } else {
                      if (!wm.field_V.a(0)) {
                        return 86;
                      } else {
                        L2: {
                          if (param0 == 8218) {
                            break L2;
                          } else {
                            field_i = (ag) null;
                            break L2;
                          }
                        }
                        return 100;
                      }
                    }
                  }
                }
              }
            } else {
              return 43;
            }
          }
        }
    }

    final static uc a(String param0, boolean param1) {
        RuntimeException var2 = null;
        uc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        uc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                tg.a((byte) 33, false);
                break L1;
              }
            }
            stackOut_2_0 = new uc(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("tg.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_17_0 = 0;
        Object stackIn_21_0 = null;
        boolean stackIn_25_0 = false;
        boolean stackIn_32_0 = false;
        Object stackIn_36_0 = null;
        String stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_31_0 = false;
        boolean stackOut_24_0 = false;
        String stackOut_37_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (var2_int >= var3) {
                          break L5;
                        } else {
                          stackOut_6_0 = eb.a((byte) -126, param0.charAt(var2_int));
                          stackIn_11_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var9 != 0) {
                            L6: while (true) {
                              if (stackIn_11_0 >= (var2_int ^ -1)) {
                                break L3;
                              } else {
                                stackOut_12_0 = eb.a((byte) 110, param0.charAt(var3 - 1));
                                stackIn_17_0 = stackOut_12_0 ? 1 : 0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var9 != 0) {
                                  break L2;
                                } else {
                                  if (!stackIn_13_0) {
                                    break L3;
                                  } else {
                                    var3--;
                                    if (var9 == 0) {
                                      stackOut_10_0 = var3 ^ -1;
                                      stackIn_11_0 = stackOut_10_0;
                                      continue L6;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (!stackIn_7_0) {
                              break L5;
                            } else {
                              var2_int++;
                              continue L1;
                            }
                          }
                        }
                      }
                      L7: while (true) {
                        stackOut_10_0 = var3 ^ -1;
                        stackIn_11_0 = stackOut_10_0;
                        if (stackIn_11_0 >= (var2_int ^ -1)) {
                          break L3;
                        } else {
                          stackOut_12_0 = eb.a((byte) 110, param0.charAt(var3 - 1));
                          stackIn_17_0 = stackOut_12_0 ? 1 : 0;
                          stackIn_13_0 = stackOut_12_0;
                          if (var9 != 0) {
                            break L2;
                          } else {
                            if (!stackIn_13_0) {
                              break L3;
                            } else {
                              var3--;
                              if (var9 == 0) {
                                continue L7;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  stackOut_16_0 = -var2_int + var3;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                }
                var4 = stackIn_17_0;
                if ((var4 ^ -1) <= -2) {
                  if ((var4 ^ -1) >= -13) {
                    var5 = new StringBuilder(var4);
                    var6 = var2_int;
                    L8: while (true) {
                      L9: {
                        if (var3 <= var6) {
                          stackOut_31_0 = param1;
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          var7 = param0.charAt(var6);
                          stackOut_24_0 = lo.a(8192, (char) var7);
                          stackIn_32_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var9 != 0) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                if (stackIn_25_0) {
                                  break L11;
                                } else {
                                  if (var9 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var8 = qf.a(28233, (char) var7);
                              if (var8 == 0) {
                                break L10;
                              } else {
                                discarded$2 = var5.append((char) var8);
                                break L10;
                              }
                            }
                            var6++;
                            continue L8;
                          }
                        }
                      }
                      L12: {
                        if (!stackIn_32_0) {
                          break L12;
                        } else {
                          discarded$3 = tg.b(83);
                          break L12;
                        }
                      }
                      if (-1 != (var5.length() ^ -1)) {
                        stackOut_37_0 = var5.toString();
                        stackIn_38_0 = stackOut_37_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        stackOut_35_0 = null;
                        stackIn_36_0 = stackOut_35_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var2);
            stackOut_39_1 = new StringBuilder().append("tg.F(");
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L13;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L13;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_21_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_36_0);
            } else {
              return stackIn_38_0;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        er var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var17 = null;
        er var17_ref = null;
        cj var18 = null;
        ja var19 = null;
        ja var20 = null;
        ja stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        ja stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        ja stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        ja stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        ja stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        ja stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        ja stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        ja stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        ja stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        ja stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        ja stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        ja stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          L1: {
            var17 = null;
            var16 = ZombieDawnMulti.field_E ? 1 : 0;
            if (param2 == -7) {
              break L1;
            } else {
              L2: {
                if (1 == (param2 ^ -1)) {
                  break L2;
                } else {
                  gk.a(2, param2).b(0);
                  gk.a(2, param2).a(true);
                  gk.a(2, param2).d(4);
                  if (var16 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                gk.a(2, 1).b(0);
                oo.f(0, 0, 640, 480, 0, 128);
                var18 = vb.a(21262);
                if (var18 != null) {
                  L4: {
                    var4 = var18.field_zb / 2 + var18.field_w;
                    var5 = -6 + (var18.field_qb + var18.field_z - 48);
                    oo.h(3 + var18.field_w, var18.field_qb, -6 + var18.field_w + var18.field_zb, var18.field_qb + var18.field_z + -3);
                    e.field_e.field_g = 0;
                    e.field_e.field_k = 420 + -var4 + -(var18.field_zb / 4);
                    kk.field_w.a(-10136, e.field_e);
                    kk.field_w.field_P = nk.a(1052688, 455739624, ll.field_k.field_p[1]);
                    var6 = 0;
                    var7 = 30;
                    var8 = 0;
                    var9 = 7;
                    var10 = wf.field_m / var7 % var9 - -var8;
                    var19 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[0], 255, ll.field_k.field_p[0]);
                    og.h((byte) 126);
                    var19.g(var4 - var18.field_zb / 4, var5);
                    var7 = 45;
                    var6 = 1;
                    var10 = (wf.field_m - -3) / var7 % var9 + var8;
                    var20 = nk.a(no.field_Hb[var6][var10], ll.field_k.field_c[1], 255, ll.field_k.field_p[1]);
                    og.h((byte) 119);
                    var20.b(var18.field_zb / 4 + var4, var5);
                    oo.h(3 + var18.field_w, var18.field_qb, var18.field_zb + (var18.field_w - 6), -3 + (var18.field_qb - -var18.field_z));
                    var12 = 1;
                    var6 = (int)(1.1 * (double)wf.field_m) / 64 % 10;
                    var8 = gg.field_l[var12];
                    var7 = gg.field_b[var12];
                    var9 = gg.field_j[var12];
                    var13 = (int)((double)wf.field_m * 1.1) % 64;
                    var10 = (8 + wf.field_m) / var7 % var9 + var8;
                    var14 = var4 - -8;
                    var15 = 50 - -var5 + (3 - var13);
                    stackOut_6_0 = wq.field_c[var6][var10];
                    stackOut_6_1 = var14;
                    stackOut_6_2 = var15;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    if (var13 < 48) {
                      stackOut_8_0 = (ja) ((Object) stackIn_8_0);
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = stackIn_8_2;
                      stackOut_8_3 = 256;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      stackIn_9_3 = stackOut_8_3;
                      break L4;
                    } else {
                      stackOut_7_0 = (ja) ((Object) stackIn_7_0);
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = 64 + -var13 << 477500708;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      stackIn_9_3 = stackOut_7_3;
                      break L4;
                    }
                  }
                  L5: {
                    ((ja) (Object) stackIn_9_0).c(stackIn_9_1, stackIn_9_2, stackIn_9_3);
                    var14 = -8 + var4;
                    var10 = var8 + (3 + wf.field_m) / var7 % var9;
                    var6 = (wf.field_m + 13) / 64 % 10;
                    var13 = (13 + wf.field_m) % 64;
                    var15 = 3 + (50 - -var5) - var13;
                    stackOut_9_0 = wq.field_c[var6][var10];
                    stackOut_9_1 = var14;
                    stackOut_9_2 = var15;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    if (var13 < 48) {
                      stackOut_11_0 = (ja) ((Object) stackIn_11_0);
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = stackIn_11_2;
                      stackOut_11_3 = 256;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      break L5;
                    } else {
                      stackOut_10_0 = (ja) ((Object) stackIn_10_0);
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = stackIn_10_2;
                      stackOut_10_3 = -var13 + 64 << -492264060;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      ((ja) (Object) stackIn_12_0).c(stackIn_12_1, stackIn_12_2, stackIn_12_3);
                      if (400 > wf.field_m % 1000) {
                        break L7;
                      } else {
                        if (-401 >= ((500 + wf.field_m) % 1000 ^ -1)) {
                          break L6;
                        } else {
                          discarded$2 = qp.field_w.a(wm.field_P, -130 + var4, var5 - 30, 100, 50, 16777215, 65793, 1, 0, 0);
                          if (var16 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    discarded$3 = qp.field_w.a(nq.field_A, 80 + var4, -30 + var5, 100, 50, 16777215, 65793, 1, 0, 0);
                    break L6;
                  }
                  oo.c();
                  break L3;
                } else {
                  break L3;
                }
              }
              tm.a(vk.i((byte) -39), false);
              br.a(vk.i((byte) -39), 2);
              pm.a(false, vk.i((byte) -39));
              if (var16 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L8: {
            if (null != np.field_m) {
              np.field_m.b(true, 1);
              break L8;
            } else {
              break L8;
            }
          }
          if (af.field_e == null) {
            break L0;
          } else {
            af.field_e.b(true, 1);
            break L0;
          }
        }
        L9: {
          if (!am.a(-110)) {
            break L9;
          } else {
            ui.a(param1, false);
            break L9;
          }
        }
        L10: {
          var17_ref = (er) ((Object) bh.field_d.c(104));
          var3 = var17_ref;
          if (param0 <= -8) {
            break L10;
          } else {
            tg.a((byte) -77, false);
            break L10;
          }
        }
        L11: {
          if (var3 == null) {
            break L11;
          } else {
            L12: {
              L13: {
                var4 = 10;
                var5 = 10;
                var6 = var17_ref.field_g;
                var7 = pb.field_e.a(dg.field_G[var6]) + 70;
                var8 = er.field_k;
                if (-33 < (var8 ^ -1)) {
                  break L13;
                } else {
                  if (var8 <= 303) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              L14: {
                if (var8 > 32) {
                  var8 = -var8 + 335;
                  break L14;
                } else {
                  break L14;
                }
              }
              var4 = -310 + var8 * 10;
              break L12;
            }
            oo.b(var4, var5, var7, 40, 6, 0, 160);
            oo.b(var4, var5, var7, 40, 6, 7829367);
            la.field_l[var6].b(var4 + 9, var5 + 5);
            pb.field_e.c(dg.field_G[var6], var4 - -50, 25 + var5, 16777215, 3355443);
            break L11;
          }
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        gp var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_c = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_h) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            if (var1_int >= 2) {
                              vd.a(false, 10L);
                              var5 = (Object) null;
                              de.a(this.field_b, (byte) 99, (Object) null);
                              break L5;
                            } else {
                              var2 = this.field_f[var1_int];
                              if (var4 != 0) {
                                break L5;
                              } else {
                                L6: {
                                  if (var2 == null) {
                                    break L6;
                                  } else {
                                    var2.a();
                                    break L6;
                                  }
                                }
                                var1_int++;
                                continue L4;
                              }
                            }
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                exception = (Exception) (Object) decompiledCaughtException;
                var6 = (String) null;
                bd.a((String) null, (Throwable) ((Object) exception), false);
                this.field_c = false;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_c = false;
          throw tg.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_c = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        String var2_ref2 = null;
        String[] var3 = null;
        bm var5 = null;
        fc var6 = null;
        ro var7 = null;
        hk[] var8 = null;
        int var9_int = 0;
        kb var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var15 = null;
        k var16 = null;
        int[] var18 = null;
        byte[] var20 = null;
        ci stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ci stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_21_0 = false;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        ci stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ci stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        ci stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean stackOut_20_0 = false;
        boolean stackOut_11_0 = false;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 >= 23) {
              try {
                L1: {
                  L2: {
                    pp.field_n = param1;
                    df.field_I = true;
                    var2_ref2 = ta.field_lb;
                    if (var2_ref2 == null) {
                      var2_ref2 = oe.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var3 = new String[]{var2_ref2};
                    stackOut_6_0 = bn.field_d;
                    stackOut_6_1 = -85;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (!pp.field_n) {
                      stackOut_8_0 = (ci) ((Object) stackIn_8_0);
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L3;
                    } else {
                      stackOut_7_0 = (ci) ((Object) stackIn_7_0);
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L3;
                    }
                  }
                  var20 = ((ci) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                  var5 = (bm) ((Object) sf.a((byte) -96, var20));
                  var6 = wh.a(var20, -67);
                  var7 = new ro(var3, var5);
                  var8 = new hk[4];
                  var8[0] = new hk();
                  var9_int = 0;
                  L4: while (true) {
                    L5: {
                      if (var9_int >= 3) {
                        stackOut_20_0 = pp.field_n;
                        stackIn_21_0 = stackOut_20_0;
                        break L5;
                      } else {
                        stackOut_11_0 = pp.field_n;
                        stackIn_21_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var12 != 0) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              L8: {
                                if (stackIn_12_0) {
                                  break L8;
                                } else {
                                  if (!h.i(51603)) {
                                    break L7;
                                  } else {
                                    if (!jk.a((byte) -128, ll.field_k.field_s[var9_int])) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              var8[0].field_c[var9_int] = 255;
                              if (var12 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                            var8[0].field_c[var9_int] = ll.field_k.field_s[var9_int];
                            var7.field_e[0] = cp.a(var7.field_e[0], 1L << ll.field_k.field_s[var9_int]);
                            break L6;
                          }
                          var9_int++;
                          continue L4;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        L11: {
                          if (!stackIn_21_0) {
                            break L11;
                          } else {
                            var8[0].field_d[0] = 0;
                            var8[0].field_f[0] = 255;
                            var9_int = 1;
                            L12: while (true) {
                              if (var9_int >= 5) {
                                if (var12 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              } else {
                                var18 = var8[0].field_f;
                                var15 = var18;
                                var13 = var15;
                                var10 = var13;
                                var11 = var9_int;
                                var8[0].field_d[var9_int] = 255;
                                var18[var11] = 255;
                                var9_int++;
                                if (var12 != 0) {
                                  break L10;
                                } else {
                                  continue L12;
                                }
                              }
                            }
                          }
                        }
                        var9_int = 0;
                        L13: while (true) {
                          if (-6 >= (var9_int ^ -1)) {
                            break L10;
                          } else {
                            var8[0].field_d[var9_int] = ll.field_k.field_m[var9_int];
                            var8[0].field_f[var9_int] = ll.field_k.field_g[var9_int];
                            var9_int++;
                            if (var12 != 0) {
                              break L9;
                            } else {
                              if (var12 == 0) {
                                continue L13;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      var9_int = 1;
                      break L9;
                    }
                    L14: while (true) {
                      L15: {
                        L16: {
                          if (var8.length <= var9_int) {
                            break L16;
                          } else {
                            var8[var9_int] = new hk();
                            var9_int++;
                            if (var12 != 0) {
                              break L15;
                            } else {
                              if (var12 == 0) {
                                continue L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var7.field_C = 2147483647;
                        var5.a(var7, (byte) 53);
                        cf.field_s = new rl(var7, var8, true, false);
                        break L15;
                      }
                      var9 = new kb(var3, var6);
                      var7.field_H = 1000;
                      var16 = new k(4096);
                      var7.a(var16, (byte) -122);
                      var16.field_j = 1;
                      var9.a(2, var16);
                      var9.field_C = 2147483646;
                      var9.field_H = var7.field_H + -50;
                      wp.field_h = new qd(var9, var8[0], 0);
                      np.field_m = wp.field_h;
                      hh.field_b = true;
                      break L1;
                    }
                  }
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L17: {
                  var2 = (Exception) (Object) decompiledCaughtException;
                  var2.printStackTrace();
                  break L17;
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
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "tg.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        String discarded$0 = null;
        field_a = null;
        field_g = null;
        field_d = null;
        if (param0 > -35) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = tg.a((CharSequence) null, false);
        }
        field_e = null;
    }

    final static ja[] a(int param0) {
        ja[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_2_0 = false;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = new ja[qc.field_v];
        var2 = param0;
        L0: while (true) {
          L1: {
            if (qc.field_v <= var2) {
              stackOut_19_0 = 125;
              stackIn_20_0 = stackOut_19_0;
              break L1;
            } else {
              var3 = vj.field_p[var2] * oq.field_w[var2];
              var17 = qp.field_t[var2];
              stackOut_2_0 = ll.field_h[var2];
              stackIn_20_0 = stackOut_2_0 ? 1 : 0;
              stackIn_3_0 = stackOut_2_0;
              if (var8 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (!stackIn_3_0) {
                        break L4;
                      } else {
                        var18 = vf.field_b[var2];
                        var14 = new int[var3];
                        var12 = var14;
                        var6_ref_int__ = var12;
                        var7 = 0;
                        L5: while (true) {
                          L6: {
                            if (var3 <= var7) {
                              var1[var2] = (ja) ((Object) new rf(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var14));
                              break L6;
                            } else {
                              var6_ref_int__[var7] = cr.b(tp.field_t[tq.b((int) var17[var7], 255)], tq.b(255, (int) var18[var7]) << -44073448);
                              var7++;
                              if (var8 != 0) {
                                break L6;
                              } else {
                                continue L5;
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var10 = new int[var3];
                    var6 = 0;
                    L7: while (true) {
                      if (var3 <= var6) {
                        var1[var2] = new ja(ie.field_nb, hj.field_a, k.field_i[var2], qj.field_o[var2], oq.field_w[var2], vj.field_p[var2], var10);
                        break L3;
                      } else {
                        var10[var6] = tp.field_t[tq.b(255, (int) var17[var6])];
                        var6++;
                        if (var8 != 0) {
                          break L2;
                        } else {
                          continue L7;
                        }
                      }
                    }
                  }
                  var2++;
                  break L2;
                }
                continue L0;
              }
            }
          }
          fd.h((byte) stackIn_20_0);
          return var1;
        }
    }

    tg() {
        this.field_f = new gp[2];
        this.field_h = false;
        this.field_c = false;
    }

    static {
        field_i = null;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
