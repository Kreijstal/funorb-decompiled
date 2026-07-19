/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ira extends osa {
    private int field_u;
    private int field_s;
    static jpa field_t;

    final int c(int param0) {
        if (param0 != 1) {
            this.b(31);
        }
        return 11;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3 = -54 / ((-50 - param2) / 41);
        return param0 * -1918454973 + -669632447 * param1;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        var4 = param1 >> -825477825;
        param1 = var4 + param1 ^ var4;
        var4 = param0 >> -386900833;
        param0 = param0 - -var4 ^ var4;
        if (param2 >= 73) {
          L0: {
            if (param0 <= param1) {
              break L0;
            } else {
              var4 = param1;
              param1 = param0;
              param0 = var4;
              break L0;
            }
          }
          L1: {
            var3 = 0;
            if (param1 >= 32768) {
              L2: {
                if (param1 >= 1073741824) {
                  var3 += 16;
                  param1 = param1 >> 16;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param1 >= 4194304) {
                  param1 = param1 >> 8;
                  var3 += 8;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 < 262144) {
                  break L4;
                } else {
                  var3 += 4;
                  param1 = param1 >> 4;
                  break L4;
                }
              }
              L5: {
                if (param1 >= 65536) {
                  var3 += 2;
                  param1 = param1 >> 2;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (32768 > param1) {
                  break L6;
                } else {
                  param1 = param1 >> 1;
                  var3++;
                  break L6;
                }
              }
              param0 = param0 >> var3;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 << -950771611 < param1) {
            return param1 << var3;
          } else {
            param1 = param1 * param1 + param0 * param0;
            if (-65537 >= (param1 ^ -1)) {
              if (-16777217 < (param1 ^ -1)) {
                if (1048576 <= param1) {
                  if ((param1 ^ -1) <= -4194305) {
                    return lw.field_g[param1 >> 459894000] >> -632306652;
                  } else {
                    return lw.field_g[param1 >> 512107310] >> 524562117;
                  }
                } else {
                  if (262144 <= param1) {
                    return lw.field_g[param1 >> 1892178668] >> -2045124122;
                  } else {
                    return lw.field_g[param1 >> 108096490] >> -1376053401;
                  }
                }
              } else {
                if (268435456 > param1) {
                  if (-67108865 < (param1 ^ -1)) {
                    L7: {
                      if (-4 >= (var3 ^ -1)) {
                        stackOut_54_0 = lw.field_g[param1 >> 1324290962] << var3 - 3;
                        stackIn_55_0 = stackOut_54_0;
                        break L7;
                      } else {
                        stackOut_53_0 = lw.field_g[param1 >> 351759538] >> 3 - var3;
                        stackIn_55_0 = stackOut_53_0;
                        break L7;
                      }
                    }
                    return stackIn_55_0;
                  } else {
                    L8: {
                      if (2 > var3) {
                        stackOut_50_0 = lw.field_g[param1 >> -1496083628] >> 2 + -var3;
                        stackIn_51_0 = stackOut_50_0;
                        break L8;
                      } else {
                        stackOut_49_0 = lw.field_g[param1 >> -1139609804] << -2 + var3;
                        stackIn_51_0 = stackOut_49_0;
                        break L8;
                      }
                    }
                    return stackIn_51_0;
                  }
                } else {
                  if (param1 >= 1073741824) {
                    return lw.field_g[param1 >> -2104571144] << var3;
                  } else {
                    L9: {
                      if (1 > var3) {
                        stackOut_43_0 = lw.field_g[param1 >> 1493395510] >> 1 + -var3;
                        stackIn_44_0 = stackOut_43_0;
                        break L9;
                      } else {
                        stackOut_42_0 = lw.field_g[param1 >> -1342354090] << var3 + -1;
                        stackIn_44_0 = stackOut_42_0;
                        break L9;
                      }
                    }
                    return stackIn_44_0;
                  }
                }
              }
            } else {
              if (param1 < 256) {
                if (0 <= param1) {
                  return lw.field_g[param1] >> 640633580;
                } else {
                  return -1;
                }
              } else {
                if ((param1 ^ -1) <= -4097) {
                  if (param1 < 16384) {
                    return lw.field_g[param1 >> 2135679878] >> 1508998025;
                  } else {
                    return lw.field_g[param1 >> 307015464] >> -1448122008;
                  }
                } else {
                  if (-1025 < (param1 ^ -1)) {
                    return lw.field_g[param1 >> 2011293378] >> -1632762965;
                  } else {
                    return lw.field_g[param1 >> -542219612] >> -1151711446;
                  }
                }
              }
            }
          }
        } else {
          return 77;
        }
    }

    final static void a(boolean param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 != -1) {
                break L1;
              } else {
                if (rba.field_a == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 != hb.field_t.field_c) {
              L2: {
                L3: {
                  if (0 != (param1 ^ -1)) {
                    break L3;
                  } else {
                    er.b(1, 1);
                    cs.field_c = null;
                    wka.field_d = false;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if ((param1 ^ -1) > -1) {
                    break L4;
                  } else {
                    if ((param1 ^ -1) == -8) {
                      break L4;
                    } else {
                      if ((param1 ^ -1) == -9) {
                        break L4;
                      } else {
                        if ((param1 ^ -1) == -13) {
                          break L4;
                        } else {
                          L5: {
                            er.b(1, 0);
                            kqa.b(18916);
                            if (!wka.field_d) {
                              break L5;
                            } else {
                              if (cs.field_c == null) {
                                break L5;
                              } else {
                                break L2;
                              }
                            }
                          }
                          fp.a(48);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                if (-2 != param1) {
                  break L2;
                } else {
                  er.b(1, 0);
                  kqa.b(18916);
                  wka.field_d = false;
                  cs.field_c = null;
                  break L2;
                }
              }
              L6: {
                wm.field_a = hb.field_t;
                if (null == wm.field_a) {
                  break L6;
                } else {
                  L7: {
                    wm.field_a.a(-123);
                    if (wm.field_a.field_c == 1) {
                      fp.a(108);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (null == mq.field_e) {
                    break L6;
                  } else {
                    L8: {
                      if ((wm.field_a.field_c ^ -1) == -13) {
                        break L8;
                      } else {
                        if ((wm.field_a.field_c ^ -1) == -5) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    wma.a(tk.a(-22636), 12, mq.field_e.field_g, jg.a((byte) -80));
                    break L6;
                  }
                }
              }
              L9: {
                hb.field_t = eka.d(param1, 121);
                if (hb.field_t instanceof wv) {
                  ((wv) ((Object) hb.field_t)).a(0, 0, param0);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                hb.field_t.a((byte) 114);
                if (!mpa.field_X) {
                  break L10;
                } else {
                  qv.field_o = null;
                  sua.field_H = new vna();
                  var8 = rb.field_o;
                  var7 = var8;
                  var6 = var7;
                  var3_array = var6;
                  var4 = 0;
                  L11: while (true) {
                    L12: {
                      if (var4 >= 8) {
                        var3_array = pq.field_e;
                        break L12;
                      } else {
                        var8[var4] = 0;
                        var4++;
                        if (var5 != 0) {
                          break L12;
                        } else {
                          continue L11;
                        }
                      }
                    }
                    var4 = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (-9 >= (var4 ^ -1)) {
                            break L15;
                          } else {
                            var3_array[var4] = 0;
                            var4++;
                            if (var5 != 0) {
                              break L14;
                            } else {
                              if (var5 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        uma.field_c = false;
                        mpa.field_X = false;
                        pna.field_p = false;
                        break L14;
                      }
                      ip.field_b = false;
                      break L10;
                    }
                  }
                }
              }
              L16: {
                if (era.field_c) {
                  cv.o((byte) -119);
                  ig.a(-125);
                  ub.b(0);
                  era.field_c = false;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (!(hb.field_t instanceof wv)) {
                  break L17;
                } else {
                  if (!(wm.field_a instanceof wv)) {
                    break L17;
                  } else {
                    if (!((wv) ((Object) wm.field_a)).a(true, (wv) ((Object) hb.field_t))) {
                      break L17;
                    } else {
                      hb.field_t.field_d = wm.field_a.field_c;
                      break L17;
                    }
                  }
                }
              }
              var3_int = 69 % ((40 - param2) / 38);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "ira.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
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

    final static void a(int param0, byte[] param1) {
        byte dupTemp$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        uia var16 = null;
        uia var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_45_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var16 = new uia(param1);
            var17 = var16;
            var17.field_h = -2 + param1.length;
            fa.field_b = var17.d(123);
            pg.field_C = new int[fa.field_b];
            ck.field_c = new byte[fa.field_b][];
            ak.field_p = new int[fa.field_b];
            iga.field_m = new int[fa.field_b];
            mq.field_b = new int[fa.field_b];
            pb.field_l = new byte[fa.field_b][];
            qqa.field_n = new boolean[fa.field_b];
            var17.field_h = -7 + param1.length + -(fa.field_b * 8);
            ika.field_a = var17.d(126);
            kba.field_s = var17.d(param0 ^ 126);
            var3 = 1 + (var17.h(255) & 255);
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (fa.field_b <= var4) {
                    break L3;
                  } else {
                    ak.field_p[var4] = var16.d(121);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = param0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= fa.field_b) {
                      break L6;
                    } else {
                      pg.field_C[var4] = var16.d(127);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (fa.field_b <= var4) {
                        break L9;
                      } else {
                        mq.field_b[var4] = var16.d(kha.b(param0, 122));
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L8;
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (fa.field_b <= var4) {
                          break L12;
                        } else {
                          iga.field_m[var4] = var16.d(122);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var17.field_h = -(var3 * 3) - -3 + (-(8 * fa.field_b) + (-7 + param1.length));
                      mga.field_g = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        if (var4 >= var3) {
                          var17.field_h = 0;
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L14;
                        } else {
                          mga.field_g[var4] = var16.a(-32768);
                          stackOut_24_0 = mga.field_g[var4];
                          stackIn_30_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (var15 != 0) {
                            break L14;
                          } else {
                            L15: {
                              if (stackIn_25_0 == 0) {
                                mga.field_g[var4] = 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            var4++;
                            continue L13;
                          }
                        }
                      }
                      var4 = stackIn_30_0;
                      L16: while (true) {
                        stackOut_31_0 = fa.field_b;
                        stackIn_32_0 = stackOut_31_0;
                        L17: while (true) {
                          L18: {
                            if (stackIn_32_0 <= var4) {
                              break L18;
                            } else {
                              var5 = mq.field_b[var4];
                              var6 = iga.field_m[var4];
                              var7 = var6 * var5;
                              var20 = new byte[var7];
                              var18 = var20;
                              var8 = var18;
                              ck.field_c[var4] = var20;
                              var21 = new byte[var7];
                              var19 = var21;
                              var9 = var19;
                              pb.field_l[var4] = var21;
                              var10 = 0;
                              var11 = var17.h(param0 + 255);
                              if (var15 != 0) {
                                decompiledRegionSelector0 = 1;
                                break L0;
                              } else {
                                L19: {
                                  L20: {
                                    L21: {
                                      if ((var11 & 1) != 0) {
                                        break L21;
                                      } else {
                                        var12 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var12 >= var7) {
                                              if (-1 != (var11 & 2 ^ -1)) {
                                                break L23;
                                              } else {
                                                break L19;
                                              }
                                            } else {
                                              var8[var12] = var16.c((byte) 119);
                                              var12++;
                                              if (var15 != 0) {
                                                break L23;
                                              } else {
                                                continue L22;
                                              }
                                            }
                                          }
                                          var12 = 0;
                                          L24: while (true) {
                                            if (var7 <= var12) {
                                              if (var15 == 0) {
                                                break L19;
                                              } else {
                                                break L21;
                                              }
                                            } else {
                                              dupTemp$1 = var16.c((byte) 87);
                                              var9[var12] = dupTemp$1;
                                              var13 = dupTemp$1;
                                              stackOut_44_0 = var10;
                                              stackOut_44_1 = var13;
                                              stackOut_44_2 = -1;
                                              stackIn_62_0 = stackOut_44_0;
                                              stackIn_62_1 = stackOut_44_1;
                                              stackIn_62_2 = stackOut_44_2;
                                              stackIn_45_0 = stackOut_44_0;
                                              stackIn_45_1 = stackOut_44_1;
                                              stackIn_45_2 = stackOut_44_2;
                                              if (var15 != 0) {
                                                break L20;
                                              } else {
                                                L25: {
                                                  stackOut_45_0 = stackIn_45_0;
                                                  stackIn_47_0 = stackOut_45_0;
                                                  stackIn_46_0 = stackOut_45_0;
                                                  if (stackIn_45_1 == stackIn_45_2) {
                                                    stackOut_47_0 = stackIn_47_0;
                                                    stackOut_47_1 = 0;
                                                    stackIn_48_0 = stackOut_47_0;
                                                    stackIn_48_1 = stackOut_47_1;
                                                    break L25;
                                                  } else {
                                                    stackOut_46_0 = stackIn_46_0;
                                                    stackOut_46_1 = 1;
                                                    stackIn_48_0 = stackOut_46_0;
                                                    stackIn_48_1 = stackOut_46_1;
                                                    break L25;
                                                  }
                                                }
                                                var10 = stackIn_48_0 | stackIn_48_1;
                                                var12++;
                                                continue L24;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var12 = 0;
                                    L26: while (true) {
                                      L27: {
                                        if (var12 >= var5) {
                                          stackOut_60_0 = -1;
                                          stackIn_61_0 = stackOut_60_0;
                                          break L27;
                                        } else {
                                          stackOut_52_0 = 0;
                                          stackIn_61_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (var15 != 0) {
                                            break L27;
                                          } else {
                                            var13 = stackIn_53_0;
                                            L28: while (true) {
                                              L29: {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  break L29;
                                                } else {
                                                  var8[var12 - -(var13 * var5)] = var16.c((byte) 103);
                                                  var13++;
                                                  if (var15 != 0) {
                                                    break L29;
                                                  } else {
                                                    continue L28;
                                                  }
                                                }
                                              }
                                              continue L26;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_61_0 = stackIn_61_0;
                                      stackOut_61_1 = 2 & var11;
                                      stackOut_61_2 = -1;
                                      stackIn_62_0 = stackOut_61_0;
                                      stackIn_62_1 = stackOut_61_1;
                                      stackIn_62_2 = stackOut_61_2;
                                      break L20;
                                    }
                                  }
                                  if (stackIn_62_0 == (stackIn_62_1 ^ stackIn_62_2)) {
                                    break L19;
                                  } else {
                                    var12 = 0;
                                    if ((var5 ^ -1) >= (var12 ^ -1)) {
                                      break L19;
                                    } else {
                                      stackOut_64_0 = 0;
                                      stackIn_32_0 = stackOut_64_0;
                                      continue L17;
                                    }
                                  }
                                }
                                qqa.field_n[var4] = var10 != 0;
                                var4++;
                                if (var15 == 0) {
                                  continue L16;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var2 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var2);
            stackOut_68_1 = new StringBuilder().append("ira.FA(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L30;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L30;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = this.field_n.s(25745) - this.f(10);
          var3 = this.field_n.e(false) - this.g((byte) 30);
          var4 = 0;
          if (var2 <= this.field_u) {
            break L0;
          } else {
            var4 = -(var2 - this.field_u);
            break L0;
          }
        }
        L1: {
          var5 = 0;
          if (-this.field_u > var2) {
            var4 = -this.field_u + -var2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var3 <= this.field_s) {
            break L2;
          } else {
            var5 = -(-this.field_s + var3);
            break L2;
          }
        }
        L3: {
          if (-this.field_s > var3) {
            var5 = -this.field_s - var3;
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 != 1) {
          return;
        } else {
          this.field_n.a((byte) -35, var4, var5);
          return;
        }
    }

    ira(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            this.field_u = param1.b((byte) 44, 10) << 433652176;
            this.field_s = param1.b((byte) 44, 10) << 228953520;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void j(byte param0) {
        if (param0 != 91) {
            field_t = (jpa) null;
        }
        field_t = null;
    }

    final void b(byte param0) {
        int var2 = 27 / ((-69 - param0) / 42);
    }

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return 20;
        }
        param1 = fs.a((byte) 68, param1, this.field_u);
        param1 = fs.a((byte) 90, param1, this.field_s);
        return param1;
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -106);
            param0.a((byte) -126, this.field_u >> -1911376720, 10);
            if (param1 >= -78) {
                ira.a(true, -95, (byte) -90);
            }
            param0.a((byte) 16, this.field_s >> 198133648, 10);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, fsa param1) {
        try {
            if (param0 <= 35) {
                byte[] var4 = (byte[]) null;
                ira.a(63, (byte[]) null);
            }
            super.a(112, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ira.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
