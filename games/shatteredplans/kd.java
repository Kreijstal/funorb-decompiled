/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String[] field_b;
    static String field_c;
    static int field_a;

    final static void a(vr param0, boolean param1, ln param2, byte param3) {
        ln[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == -2) {
                break L1;
              } else {
                field_b = (String[]) null;
                break L1;
              }
            }
            if (param0.field_k) {
              param2.field_N = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!param0.field_l) {
                param2.field_N = 0;
                var8 = param2.field_D;
                var4 = var8;
                var5 = 0;
                L2: while (true) {
                  if (var8.length <= var5) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L3: {
                      L4: {
                        var6 = var8[var5];
                        if (param2.field_y != var6.field_y) {
                          break L4;
                        } else {
                          if (param1) {
                            if (ec.field_r[var6.field_p]) {
                              break L4;
                            } else {
                              break L3;
                            }
                          } else {
                            var5++;
                            continue L2;
                          }
                        }
                      }
                      param2.field_N = param2.field_N + 1;
                      break L3;
                    }
                    var5++;
                    continue L2;
                  }
                }
              } else {
                param2.field_N = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4_ref);
            stackOut_20_1 = new StringBuilder().append("kd.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, byte[] param4, CharSequence param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = -param1 + param0;
            if (param2 == -97) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6_int) {
                  stackOut_69_0 = var6_int;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param5.charAt(param1 + var7);
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
                        if (160 > var8) {
                          break L5;
                        } else {
                          if (var8 <= 255) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var8 != 8364) {
                        if (var8 != 8218) {
                          if (var8 == 402) {
                            param4[param3 - -var7] = (byte)-125;
                            break L2;
                          } else {
                            if (var8 == 8222) {
                              param4[var7 + param3] = (byte)-124;
                              break L2;
                            } else {
                              if (var8 == 8230) {
                                param4[param3 - -var7] = (byte)-123;
                                break L2;
                              } else {
                                if (var8 != 8224) {
                                  if (8225 == var8) {
                                    param4[var7 + param3] = (byte)-121;
                                    break L2;
                                  } else {
                                    if (var8 != 710) {
                                      if (var8 != 8240) {
                                        if (var8 != 352) {
                                          if (var8 != 8249) {
                                            if (var8 == 338) {
                                              param4[param3 - -var7] = (byte)-116;
                                              break L2;
                                            } else {
                                              if (var8 != 381) {
                                                if (var8 == 8216) {
                                                  param4[var7 + param3] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 != 8217) {
                                                    if (var8 == 8220) {
                                                      param4[param3 - -var7] = (byte)-109;
                                                      break L2;
                                                    } else {
                                                      if (8221 == var8) {
                                                        param4[var7 + param3] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (8226 != var8) {
                                                          if (var8 == 8211) {
                                                            param4[param3 - -var7] = (byte)-106;
                                                            break L2;
                                                          } else {
                                                            if (var8 == 8212) {
                                                              param4[var7 + param3] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (var8 != 732) {
                                                                if (var8 == 8482) {
                                                                  param4[param3 - -var7] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (353 != var8) {
                                                                    if (8250 == var8) {
                                                                      param4[param3 + var7] = (byte)-101;
                                                                      break L2;
                                                                    } else {
                                                                      if (var8 == 339) {
                                                                        param4[param3 - -var7] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (382 == var8) {
                                                                          param4[var7 + param3] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (376 != var8) {
                                                                            param4[var7 + param3] = (byte)63;
                                                                            break L2;
                                                                          } else {
                                                                            param4[param3 - -var7] = (byte)-97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param4[var7 + param3] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                param4[var7 + param3] = (byte)-104;
                                                                break L2;
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          param4[var7 + param3] = (byte)-107;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    param4[var7 + param3] = (byte)-110;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param3] = (byte)-114;
                                                break L2;
                                              }
                                            }
                                          } else {
                                            param4[param3 + var7] = (byte)-117;
                                            break L2;
                                          }
                                        } else {
                                          param4[param3 + var7] = (byte)-118;
                                          break L2;
                                        }
                                      } else {
                                        param4[var7 + param3] = (byte)-119;
                                        break L2;
                                      }
                                    } else {
                                      param4[param3 - -var7] = (byte)-120;
                                      break L2;
                                    }
                                  }
                                } else {
                                  param4[var7 + param3] = (byte)-122;
                                  break L2;
                                }
                              }
                            }
                          }
                        } else {
                          param4[var7 + param3] = (byte)-126;
                          break L2;
                        }
                      } else {
                        param4[param3 - -var7] = (byte)-128;
                        break L2;
                      }
                    }
                    param4[var7 + param3] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -19;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var6);
            stackOut_71_1 = new StringBuilder().append("kd.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param4 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          L7: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L7;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_35_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        v stackIn_45_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        String stackOut_34_0 = null;
        String stackOut_33_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        v stackOut_44_0 = null;
        v stackOut_43_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == -119) {
              L1: {
                var1_int = uq.field_k;
                var2 = 0;
                if (2 == eh.field_C) {
                  var3_long = pr.a(14274) + -br.field_p;
                  var2 = (int)((10999L + -var3_long) / 1000L);
                  if ((var2 ^ -1) > -1) {
                    var2 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                if (var3 >= kr.field_f.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = ss.field_a[var3];
                    if (0 <= var4) {
                      if (dc.field_l.field_c == var4) {
                        var5 = es.field_n;
                        break L3;
                      } else {
                        var5 = ah.field_P;
                        break L3;
                      }
                    } else {
                      var5 = rm.field_b;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = kr.field_f[var3];
                    if ((eh.field_C ^ -1) != -3) {
                      break L4;
                    } else {
                      if (-2 != (var2 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          if (kp.field_o.length >= el.field_d.length) {
                            stackOut_19_0 = kp.field_o.length;
                            stackIn_20_0 = stackOut_19_0;
                            break L5;
                          } else {
                            stackOut_18_0 = el.field_d.length;
                            stackIn_20_0 = stackOut_18_0;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_20_0;
                          if (hm.field_p.length > field_b.length) {
                            stackOut_22_0 = hm.field_p.length;
                            stackIn_23_0 = stackOut_22_0;
                            break L6;
                          } else {
                            stackOut_21_0 = field_b.length;
                            stackIn_23_0 = stackOut_21_0;
                            break L6;
                          }
                        }
                        L7: {
                          var8 = stackIn_23_0;
                          if (-7 < (var3 ^ -1)) {
                            break L7;
                          } else {
                            if (var3 < var7 + 6) {
                              L8: {
                                if (-1 < (kp.field_o.length + var3 + (-6 - var7) ^ -1)) {
                                  stackOut_28_0 = "";
                                  stackIn_29_0 = stackOut_28_0;
                                  break L8;
                                } else {
                                  stackOut_27_0 = kp.field_o[-6 + var3 - (-kp.field_o.length + var7)];
                                  stackIn_29_0 = stackOut_27_0;
                                  break L8;
                                }
                              }
                              var6 = stackIn_29_0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var7 + 7 > var3) {
                          break L4;
                        } else {
                          if (var3 >= var8 + 7 - -var7) {
                            break L4;
                          } else {
                            L9: {
                              if (-var7 + (var3 + -7) < field_b.length) {
                                stackOut_34_0 = field_b[-7 + (var3 + -var7)];
                                stackIn_35_0 = stackOut_34_0;
                                break L9;
                              } else {
                                stackOut_33_0 = "";
                                stackIn_35_0 = stackOut_33_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_35_0;
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (-2 != var4) {
                      break L10;
                    } else {
                      var6 = Integer.toString(var2);
                      break L10;
                    }
                  }
                  L11: {
                    stackOut_38_0 = (String) (var6);
                    stackOut_38_1 = 0;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    if ((var4 ^ -1) > -1) {
                      stackOut_40_0 = (String) ((Object) stackIn_40_0);
                      stackOut_40_1 = stackIn_40_1;
                      stackOut_40_2 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      stackIn_41_1 = stackOut_40_1;
                      stackIn_41_2 = stackOut_40_2;
                      break L11;
                    } else {
                      stackOut_39_0 = (String) ((Object) stackIn_39_0);
                      stackOut_39_1 = stackIn_39_1;
                      stackOut_39_2 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      stackIn_41_2 = stackOut_39_2;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = vm.a(stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                    var8 = -(var7 >> 1623923713) + cn.field_w;
                    if (0 > var4) {
                      break L12;
                    } else {
                      L13: {
                        var1_int = var1_int + sm.field_b;
                        if (dc.field_l.field_c == var4) {
                          stackOut_44_0 = cs.field_l;
                          stackIn_45_0 = stackOut_44_0;
                          break L13;
                        } else {
                          stackOut_43_0 = kr.field_a;
                          stackIn_45_0 = stackOut_43_0;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_45_0;
                        if (var9 != null) {
                          var9.a((ar.field_i << 1355242081) + id.field_b, -tr.field_Lb + var8, var1_int, (tr.field_Lb << 1477060257) + var7, -106);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var1_int = var1_int + ar.field_i;
                      break L12;
                    }
                  }
                  L15: {
                    if (0 <= var4) {
                      ql.field_n.d(var6, var8, var1_int - -je.field_g, var5, -1);
                      var1_int = var1_int + (id.field_b + (sm.field_b + ar.field_i));
                      break L15;
                    } else {
                      um.field_c.d(var6, var8, dp.field_v + var1_int, var5, -1);
                      var1_int = var1_int + e.field_d;
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kd.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 74) {
            kd.a((byte) -48);
        }
    }

    final static void a(int param0, int param1) {
        if (ah.field_U >= param1) {
            return;
        }
        if (param0 != 23299) {
            field_c = (String) null;
        }
        u.field_c = new int[param1];
        cb.field_o = new int[param1];
        ah.field_U = param1;
        wb.field_b = new int[param1];
        rl.field_b = new boolean[param1];
        ol.field_a = new int[param1];
        hs.field_i = new int[param1];
        oe.field_i = new int[param1];
        u.field_d = new int[param1];
        ei.field_d = new int[param1];
        ig.field_c = new int[param1];
        ue.field_e = new int[param1];
        ja.field_i = new int[param1];
    }

    static {
        field_c = "Offer draw";
    }
}
