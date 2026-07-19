/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pd extends sd {
    private long field_d;
    static ah field_e;
    static gn field_f;
    static String field_g;
    static go field_h;
    private String field_i;

    kb a(boolean param0) {
        if (!param0) {
            return (kb) null;
        }
        return jh.field_d;
    }

    final static int a(byte param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_83_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_80_0 = 0;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            dl.field_i = dl.field_i + 65536;
            L1: while (true) {
              if (on.a(bg.field_c, dl.field_i, (byte) -100) < 65536) {
                L2: {
                  var2_int = -1;
                  if (param0 == -86) {
                    break L2;
                  } else {
                    var6 = (hj) null;
                    pd.a((hj) null, 75, -15, -53, 82, 25);
                    break L2;
                  }
                }
                L3: {
                  if (qk.field_y != null) {
                    var2_int = qk.field_y.length;
                    break L3;
                  } else {
                    if (null != lf.field_a) {
                      var2_int = lf.field_a.length;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var2_int != -1) {
                    L5: {
                      if (bg.field_f <= hk.field_e) {
                        break L5;
                      } else {
                        L6: {
                          hk.field_e = hk.field_e + 1;
                          if (hk.field_e <= bg.field_g) {
                            break L6;
                          } else {
                            L7: {
                              if (null == qk.field_y) {
                                break L7;
                              } else {
                                if (null != qk.field_y[va.field_e]) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            hk.field_e = hk.field_e - 1;
                            break L5;
                          }
                        }
                        if (bg.field_f > hk.field_e) {
                          break L5;
                        } else {
                          if (qk.field_y[(1 + va.field_e) % var2_int] == null) {
                            hk.field_e = hk.field_e - 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (hk.field_e >= bg.field_f) {
                        hf.field_i = va.field_e;
                        hk.field_e = hk.field_e - bg.field_f;
                        if (!rg.field_e) {
                          va.field_e = va.field_e - 1;
                          if (va.field_e >= 0) {
                            break L8;
                          } else {
                            va.field_e = va.field_e + var2_int;
                            break L8;
                          }
                        } else {
                          va.field_e = va.field_e + 1;
                          if (va.field_e < var2_int) {
                            break L8;
                          } else {
                            va.field_e = va.field_e - var2_int;
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    if (bg.field_g >= hk.field_e) {
                      break L4;
                    } else {
                      rg.field_e = true;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L9: {
                  if (null != nl.field_i) {
                    L10: {
                      var3 = -(nl.field_i.field_v / 2) + 357;
                      var4 = 0;
                      if (-1 == (gg.field_J ^ -1)) {
                        break L10;
                      } else {
                        if (jb.field_U <= var3) {
                          break L10;
                        } else {
                          if (nl.field_i.field_y + var3 > jb.field_U) {
                            L11: {
                              if (-nl.field_i.field_s + 269 >= lb.field_x) {
                                break L11;
                              } else {
                                if (lb.field_x < 269) {
                                  var4 = 1;
                                  hk.field_e = bg.field_f;
                                  rg.field_e = false;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if ((lb.field_x ^ -1) >= -587) {
                              break L10;
                            } else {
                              if (lb.field_x < nl.field_i.field_s + 586) {
                                hk.field_e = bg.field_f;
                                rg.field_e = true;
                                var4 = 1;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    if (var4 != 0) {
                      break L9;
                    } else {
                      if (hk.field_e <= bg.field_g) {
                        break L9;
                      } else {
                        if (rf.field_X <= var3) {
                          break L9;
                        } else {
                          if (rf.field_X < var3 + nl.field_i.field_y) {
                            L12: {
                              if (-nl.field_i.field_s + 269 >= nc.field_g) {
                                break L12;
                              } else {
                                if ((nc.field_g ^ -1) <= -270) {
                                  break L12;
                                } else {
                                  hk.field_e = bg.field_g;
                                  break L12;
                                }
                              }
                            }
                            if (nc.field_g <= 586) {
                              break L9;
                            } else {
                              if (nl.field_i.field_s + 586 > nc.field_g) {
                                hk.field_e = bg.field_g;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                if (param1) {
                  L13: {
                    ln.field_k.a(wa.a(116, jb.field_U, lb.field_x), wa.a(param0 + 203, rf.field_X, nc.field_g), 4);
                    if (!ln.field_k.a(-1)) {
                      break L13;
                    } else {
                      if (0 != ln.field_k.field_g) {
                        if (1 != ln.field_k.field_g) {
                          break L13;
                        } else {
                          stackOut_65_0 = 2;
                          stackIn_66_0 = stackOut_65_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackOut_62_0 = 3;
                        stackIn_63_0 = stackOut_62_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L14: while (true) {
                    if (!qh.c(-121)) {
                      stackOut_82_0 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      L15: {
                        ln.field_k.a((byte) -21, 0);
                        if (!ln.field_k.a(-1)) {
                          break L15;
                        } else {
                          if (ln.field_k.field_g == 0) {
                            stackOut_72_0 = 3;
                            stackIn_73_0 = stackOut_72_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            if (ln.field_k.field_g == 1) {
                              stackOut_76_0 = 1;
                              stackIn_77_0 = stackOut_76_0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                      if (-14 == (aa.field_n ^ -1)) {
                        stackOut_80_0 = 1;
                        stackIn_81_0 = stackOut_80_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        continue L14;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                io.field_b = io.field_b + 1;
                dl.field_i = dl.field_i - bg.field_c;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "pd.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_63_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_66_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_73_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_77_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_81_0;
                } else {
                  return stackIn_83_0;
                }
              }
            }
          }
        }
    }

    final static Boolean b(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -29) {
            vk var2 = (vk) null;
            discarded$0 = pd.a((vk) null, true);
        }
        Boolean var1 = wd.field_u;
        wd.field_u = null;
        return var1;
    }

    final static boolean a(vk param0, boolean param1) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3_int = 0;
        mg[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        hj[] var5 = null;
        int var6_int = 0;
        hj[] var6 = null;
        int var7 = 0;
        hj var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            if (mm.a(param0, -65)) {
              var10 = go.field_g[param0.field_p];
              var2_array = var10;
              var3_int = 0;
              L1: while (true) {
                if (var10.length <= var3_int) {
                  L2: {
                    if (param1) {
                      break L2;
                    } else {
                      field_e = (ah) null;
                      break L2;
                    }
                  }
                  if (mc.field_a[9].b((byte) 116)) {
                    if (!mc.field_a[11].b((byte) 124)) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L3: {
                        if (!kb.a(16616, 0)) {
                          break L3;
                        } else {
                          var3 = wi.field_a.a(16);
                          if (var3 == null) {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            va.field_d = new mg[4][var3.length];
                            var4 = new int[]{16711680, 16776960, 33023, 16711935};
                            var5_int = 0;
                            L4: while (true) {
                              if (-5 >= (var5_int ^ -1)) {
                                var5 = tn.field_b.a(180);
                                if (var5 == null) {
                                  stackOut_34_0 = 0;
                                  stackIn_35_0 = stackOut_34_0;
                                  decompiledRegionSelector0 = 5;
                                  break L0;
                                } else {
                                  var6 = var5;
                                  var7 = 0;
                                  L5: while (true) {
                                    if (var6.length <= var7) {
                                      break L3;
                                    } else {
                                      var8 = var6[var7];
                                      var8.a();
                                      var7++;
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                var6_int = 0;
                                L6: while (true) {
                                  if (var3.length <= var6_int) {
                                    var5_int++;
                                    continue L4;
                                  } else {
                                    va.field_d[var5_int][var6_int] = var3[var6_int].a(-4503, var4[var5_int]);
                                    va.field_d[var5_int][var6_int].a(3072, false);
                                    var6_int++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (!nn.a(-74)) {
                        stackOut_41_0 = 0;
                        stackIn_42_0 = stackOut_41_0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  if (ge.field_c[var10[var3_int]].field_b.c((byte) 41) == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (ge.field_c[var10[var3_int]].field_z.c((byte) -117) != null) {
                      var3_int++;
                      continue L1;
                    } else {
                      return false;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var2);
            stackOut_43_1 = new StringBuilder().append("pd.G(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L7;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_35_0 != 0;
                  } else {
                    return stackIn_42_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, th param1) {
        try {
            param1.a((byte) -84, this.field_d);
            param1.b(param0 + param0, this.field_i);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "pd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -94) {
            return;
        }
        field_f = null;
        field_e = null;
        field_g = null;
        field_h = null;
    }

    final static void a(hj param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if ((param4 ^ -1) != -1025) {
              L1: {
                param3 = param3 - ((param4 + -1024) * param0.field_s >> -1192216181);
                param2 = param2 - ((param4 + -1024) * param0.field_y >> -932809397);
                var6_int = param4 * param0.field_s >> 60646826;
                var7 = param4 * param0.field_y >> 1253626186;
                var8 = 0;
                if (-1 < (param3 ^ -1)) {
                  var6_int = var6_int + param3;
                  var8 = var8 + (-param3 << 1198583284) / param4;
                  param3 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = 0;
                if (0 <= param2) {
                  break L2;
                } else {
                  var7 = var7 + param2;
                  var9 = var9 + (-param2 << 1480687188) / param4;
                  param2 = 0;
                  break L2;
                }
              }
              L3: {
                if (param3 - -var6_int > 640) {
                  var6_int = 640 - param3;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (-481 <= (var7 + param2 ^ -1)) {
                  break L4;
                } else {
                  var7 = -param2 + 480;
                  break L4;
                }
              }
              var11 = 0;
              var12 = 0;
              L5: while (true) {
                if (var12 >= var7) {
                  L6: {
                    if (param1 <= -26) {
                      break L6;
                    } else {
                      field_h = (go) null;
                      break L6;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var10 = (var12 + param2) * tc.field_j + param3;
                  var11 = var8 + ((var9 >> -1415734806) * param0.field_s << 291429898);
                  var13 = 0;
                  L7: while (true) {
                    if (var6_int <= var13) {
                      var9 = var9 + 1048576 / param4;
                      var12++;
                      continue L5;
                    } else {
                      L8: {
                        if (-16777216 != (param0.field_z[var11 >> -633351286] ^ -1)) {
                          if (param0.field_z[var11 >> 1544274826] == 0) {
                            break L8;
                          } else {
                            tc.field_b[var10] = param0.field_z[var11 >> -231756086];
                            break L8;
                          }
                        } else {
                          tc.field_b[var10] = param5;
                          break L8;
                        }
                      }
                      var10++;
                      var11 = var11 + 1048576 / param4;
                      var13++;
                      continue L7;
                    }
                  }
                }
              }
            } else {
              w.a(param5, param0, 109, param2, param3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var6);
            stackOut_27_1 = new StringBuilder().append("pd.F(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pd(long param0, String param1) {
        try {
            this.field_d = param0;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new ah();
        field_g = "One kill remaining.";
    }
}
