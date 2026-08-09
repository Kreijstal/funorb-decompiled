/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static boolean field_h;
    static boolean[][] field_d;
    static volatile int field_c;
    static ll field_j;
    static String field_g;
    static int[] field_i;
    static String field_a;
    static boolean field_f;
    static boolean field_e;
    static int field_b;

    final static boolean a(int param0, boolean param1, int[] param2, byte param3, int[] param4, int[] param5) {
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var18 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var6_int = param0;
            if (var6_int == 34) {
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (var6_int == 27) {
                  break L1;
                } else {
                  if ((var6_int ^ -1) == -34) {
                    break L1;
                  } else {
                    if (var6_int == 32) {
                      break L1;
                    } else {
                      if (var6_int == 24) {
                        stackIn_12_0 = bj.a(param5, 84, param1, (byte) 125);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L2: {
                          var15 = n.field_z;
                          var13 = var15;
                          var12 = var13;
                          var6 = var12;
                          if (param3 == 84) {
                            break L2;
                          } else {
                            ad.a(-38);
                            break L2;
                          }
                        }
                        var7 = 0;
                        L3: while (true) {
                          if (var7 >= var15.length) {
                            stackIn_29_0 = 0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            L4: {
                              L5: {
                                var8 = var15[var7];
                                if (t.a(param5, var8, -20370)) {
                                  break L5;
                                } else {
                                  if (!bj.a(param5, var8, param1, (byte) 96)) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var18 = nl.a(var8, (byte) 123);
                              var10 = var18.length - 8;
                              L6: while (true) {
                                if (var10 >= var18.length) {
                                  break L4;
                                } else {
                                  if (param0 == var18[var10]) {
                                    stackIn_25_0 = 1;
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  } else {
                                    var10++;
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var7++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackIn_10_0 = bj.a(param5, 62, param1, (byte) 115);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6_ref);

            stackIn_32_1 = new StringBuilder().append("ad.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param5 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_33_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_29_0 != 0;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        kj var2 = mm.field_g;
        var2.a(param1, (byte) -117);
        var2.field_p = var2.field_p + 1;
        int var3 = var2.field_p;
        var2.a((byte) 126, 5);
        var2.a((byte) 114, nf.field_b.field_Ub);
        int var4 = nf.field_b.field_Nc + (nf.field_b.field_sc << 1866473254);
        var2.a((byte) 127, var4);
        var2.a(nf.field_b.field_Sb.length, (byte) -122, param0, nf.field_b.field_Sb);
        var2.b((byte) -113, var2.field_p - var3);
    }

    final static void a(boolean param0, byte param1) {
        if (qf.field_e != null && qf.field_e.b(param0, (byte) -128)) {
            qf.field_e = null;
        }
        if (param1 != -76) {
            field_b = -64;
        }
    }

    final static void a(int param0, nk param1, int param2) {
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int[] var5 = null;
        int var6_int = 0;
        wk var6 = null;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (-1 < (param0 ^ -1)) {
                break L1;
              } else {
                if (param0 < ue.field_c.length) {
                  L2: {
                    if (param1 != null) {
                      break L2;
                    } else {
                      L3: {
                        if (0 > param0) {
                          break L3;
                        } else {
                          if (ue.field_c.length > param0) {
                            var12 = ue.field_c[param0];
                            var8 = var12;
                            var3 = var8;
                            if (var3 == null) {
                              ue.field_g[param0] = null;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              var14 = new int[8];
                              var10 = var14;
                              var4_ref_int__ = var10;
                              var13 = new int[-8 + var12.length];
                              var9 = var13;
                              var5 = var9;
                              ii.a(var3, 0, var5, 0, var13.length);
                              ii.a(var3, var13.length, var4_ref_int__, 0, var14.length);
                              param1 = ji.a(var13, (byte) 97, var14);
                              break L2;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  L4: {
                    if (null != ue.field_g[param0]) {
                      ue.field_g[param0].d();
                      pb.a(0, 0, 62, 74, 0);
                      break L4;
                    } else {
                      ue.field_g[param0] = new wk(62, 74);
                      ue.field_g[param0].d();
                      break L4;
                    }
                  }
                  L5: {
                    var3_int = hj.field_w;
                    if (param2 > 23) {
                      break L5;
                    } else {
                      ad.a(true, (byte) -104);
                      break L5;
                    }
                  }
                  L6: {
                    if (param1.field_N == 0) {
                      hj.field_w = 1200;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (55 == param1.field_N) {
                      hj.field_w = 1200;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (-58 == (param1.field_N ^ -1)) {
                      hj.field_w = 1300;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((param1.field_N ^ -1) == -63) {
                      hj.field_w = 1400;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-66 != (param1.field_N ^ -1)) {
                      break L10;
                    } else {
                      hj.field_w = 1000;
                      break L10;
                    }
                  }
                  L11: {
                    if (param1.field_N != 69) {
                      break L11;
                    } else {
                      hj.field_w = 1400;
                      break L11;
                    }
                  }
                  L12: {
                    if (param1.field_N != 72) {
                      break L12;
                    } else {
                      hj.field_w = 1000;
                      break L12;
                    }
                  }
                  L13: {
                    if (param1.field_N != 75) {
                      break L13;
                    } else {
                      hj.field_w = 1000;
                      break L13;
                    }
                  }
                  L14: {
                    if (param1.field_N == 79) {
                      hj.field_w = 1000;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if ((param1.field_N ^ -1) != -85) {
                      break L15;
                    } else {
                      hj.field_w = 1000;
                      break L15;
                    }
                  }
                  L16: {
                    if (88 == param1.field_N) {
                      hj.field_w = 1000;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((param1.field_N ^ -1) != -93) {
                      break L17;
                    } else {
                      hj.field_w = 700;
                      break L17;
                    }
                  }
                  L18: {
                    param1.a(0, false, 31, 74, (byte) 49, 0);
                    hj.field_w = var3_int;
                    if (!nk.f((byte) -19)) {
                      var4 = 0;
                      var17 = ue.field_c[param0];
                      var6_int = 0;
                      L19: while (true) {
                        L20: {
                          if (var17.length <= var6_int) {
                            break L20;
                          } else {
                            L21: {
                              if (0 == (var17[var6_int] ^ -1)) {
                                break L21;
                              } else {
                                L22: {
                                  stackIn_56_0 = var17[var6_int];

                                  stackIn_56_1 = -68;

                                  if (-8 + var17.length > var6_int) {
                                    stackIn_57_0 = stackIn_56_0;
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = 0;
                                    break L22;
                                  } else {
                                    stackIn_57_0 = stackIn_56_0;
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = 1;
                                    break L22;
                                  }
                                }
                                if (!oc.a(stackIn_57_0, stackIn_57_1, stackIn_57_2 != 0)) {
                                  break L21;
                                } else {
                                  var4 = 1;
                                  break L20;
                                }
                              }
                            }
                            var6_int++;
                            continue L19;
                          }
                        }
                        if (var4 != 0) {
                          pb.c(0, 0, 62, 74, 0, 128);
                          var6 = sj.field_F;
                          var6.a((-var6.field_z + 62) / 2, (-var6.field_B + 74) / 2);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                  sb.field_bb.b((byte) 123);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3_ref = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var3_ref);

            stackIn_67_1 = new StringBuilder().append("ad.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L23;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L23;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param2 + ')');
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

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        field_a = null;
        field_d = (boolean[][]) null;
        if (param0 != 0) {
            return;
        }
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param0 < 103) {
            return 2;
        }
        int var3 = param1 >>> 572902431;
        return (param1 - -var3) / param2 - var3;
    }

    static {
        field_c = 0;
        field_g = "Names cannot start or end with space or underscore";
        field_e = true;
        field_a = "Friends";
        field_b = 0;
    }
}
