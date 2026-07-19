/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends td {
    private long field_d;
    private long field_f;
    private long field_l;
    private long[] field_n;
    private int field_j;
    private int field_m;
    static qj field_o;
    static String[] field_k;
    static ii[] field_h;
    static int[] field_g;
    static String field_e;
    static pg field_i;
    static int field_p;

    private final long f(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_10_0 = 0L;
        long stackIn_12_0 = 0L;
        long stackOut_9_0 = 0L;
        L0: {
          var9 = Transmogrify.field_A ? 1 : 0;
          var2 = System.nanoTime();
          if (param0 > 97) {
            break L0;
          } else {
            this.field_n = (long[]) null;
            break L0;
          }
        }
        L1: {
          var4 = var2 - this.field_l;
          this.field_l = var2;
          if (var4 <= -5000000000L) {
            break L1;
          } else {
            if (var4 < 5000000000L) {
              this.field_n[this.field_m] = var4;
              this.field_m = (this.field_m + 1) % 10;
              if (this.field_j >= 1) {
                break L1;
              } else {
                this.field_j = this.field_j + 1;
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        var6 = 0L;
        var8 = 1;
        L2: while (true) {
          L3: {
            if ((var8 ^ -1) < (this.field_j ^ -1)) {
              break L3;
            } else {
              stackOut_9_0 = var6 + this.field_n[(10 + (this.field_m - var8)) % 10];
              stackIn_12_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (var9 != 0) {
                return stackIn_12_0;
              } else {
                var6 = stackIn_10_0;
                var8++;
                if (var9 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
          }
          return var6 / (long)this.field_j;
        }
    }

    final static void d(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (ae.a(-12863)) {
              discarded$12 = oi.field_k.a(fc.field_f, ij.field_a, true, 4);
              oi.field_k.l(param0 ^ param0);
              L1: while (true) {
                L2: {
                  if (!pc.b(param0 ^ -121)) {
                    break L2;
                  } else {
                    discarded$13 = oi.field_k.a(-81, sg.field_n, ch.field_d);
                    if (var2 != 0) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L3: {
                if (null == ub.field_c) {
                  break L3;
                } else {
                  if (ub.field_c.field_c) {
                    qd.b(param0 + 3);
                    oi.field_k.b((qg) (new ll(oi.field_k, fi.field_w)), (byte) -71);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "kf.C(" + param0 + ')');
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

    final static void a(byte[] param0, int param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
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
        int var14 = 0;
        int var15 = 0;
        oa var16 = null;
        oa var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_67_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        var15 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var16 = new oa(param0);
            var17 = var16;
            var17.field_h = param0.length - 2;
            ih.field_b = var17.a((byte) -126);
            wk.field_b = new int[ih.field_b];
            ld.field_e = new byte[ih.field_b][];
            ql.field_b = new int[ih.field_b];
            gj.field_j = new int[ih.field_b];
            re.field_a = new int[ih.field_b];
            cc.field_e = new boolean[ih.field_b];
            re.field_K = new byte[ih.field_b][];
            var17.field_h = param0.length - (7 + ih.field_b * 8);
            pj.field_y = var17.a((byte) -122);
            ll.field_U = var17.a((byte) -100);
            var3 = (var17.d((byte) 102) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((ih.field_b ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    gj.field_j[var4] = var16.a((byte) -93);
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
                var4 = 0;
                break L2;
              }
              var5 = 22 % ((param1 - 19) / 47);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 >= ih.field_b) {
                      break L6;
                    } else {
                      re.field_a[var4] = var16.a((byte) -118);
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
                      if ((ih.field_b ^ -1) >= (var4 ^ -1)) {
                        break L9;
                      } else {
                        ql.field_b[var4] = var16.a((byte) -115);
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
                        if ((var4 ^ -1) <= (ih.field_b ^ -1)) {
                          break L12;
                        } else {
                          wk.field_b[var4] = var16.a((byte) -112);
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
                      var17.field_h = -(3 * (-1 + var3)) + param0.length - 7 - ih.field_b * 8;
                      rg.field_D = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        L15: {
                          L16: {
                            if ((var3 ^ -1) >= (var4 ^ -1)) {
                              break L16;
                            } else {
                              rg.field_D[var4] = var16.g((byte) 124);
                              stackOut_27_0 = 0;
                              stackOut_27_1 = rg.field_D[var4];
                              stackIn_35_0 = stackOut_27_0;
                              stackIn_35_1 = stackOut_27_1;
                              stackIn_28_0 = stackOut_27_0;
                              stackIn_28_1 = stackOut_27_1;
                              if (var15 != 0) {
                                L17: while (true) {
                                  if (stackIn_35_0 <= stackIn_35_1) {
                                    break L14;
                                  } else {
                                    var5 = ql.field_b[var4];
                                    var6 = wk.field_b[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    re.field_K[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    ld.field_e[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.d((byte) 40);
                                    if (var15 != 0) {
                                      break L15;
                                    } else {
                                      L18: {
                                        L19: {
                                          L20: {
                                            L21: {
                                              L22: {
                                                if ((var11 & 1 ^ -1) != -1) {
                                                  break L22;
                                                } else {
                                                  var12 = 0;
                                                  L23: while (true) {
                                                    L24: {
                                                      if ((var12 ^ -1) <= (var7 ^ -1)) {
                                                        break L24;
                                                      } else {
                                                        var8[var12] = var16.b(true);
                                                        var12++;
                                                        if (var15 != 0) {
                                                          break L20;
                                                        } else {
                                                          if (var15 == 0) {
                                                            continue L23;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if ((var11 & 2 ^ -1) == -1) {
                                                      break L21;
                                                    } else {
                                                      var12 = 0;
                                                      L25: while (true) {
                                                        L26: {
                                                          if (var7 <= var12) {
                                                            break L26;
                                                          } else {
                                                            dupTemp$2 = var16.b(true);
                                                            var9[var12] = dupTemp$2;
                                                            var13 = dupTemp$2;
                                                            stackOut_46_0 = var10;
                                                            stackOut_46_1 = var13;
                                                            stackOut_46_2 = -1;
                                                            stackIn_34_0 = stackOut_46_0;
                                                            stackIn_34_1 = stackOut_46_1;
                                                            stackIn_34_2 = stackOut_46_2;
                                                            stackIn_47_0 = stackOut_46_0;
                                                            stackIn_47_1 = stackOut_46_1;
                                                            stackIn_47_2 = stackOut_46_2;
                                                            if (var15 != 0) {
                                                              break L18;
                                                            } else {
                                                              L27: {
                                                                stackOut_47_0 = stackIn_47_0;
                                                                stackIn_49_0 = stackOut_47_0;
                                                                stackIn_48_0 = stackOut_47_0;
                                                                if (stackIn_47_1 == stackIn_47_2) {
                                                                  stackOut_49_0 = stackIn_49_0;
                                                                  stackOut_49_1 = 0;
                                                                  stackIn_50_0 = stackOut_49_0;
                                                                  stackIn_50_1 = stackOut_49_1;
                                                                  break L27;
                                                                } else {
                                                                  stackOut_48_0 = stackIn_48_0;
                                                                  stackOut_48_1 = 1;
                                                                  stackIn_50_0 = stackOut_48_0;
                                                                  stackIn_50_1 = stackOut_48_1;
                                                                  break L27;
                                                                }
                                                              }
                                                              var10 = stackIn_50_0 | stackIn_50_1;
                                                              var12++;
                                                              if (var15 == 0) {
                                                                continue L25;
                                                              } else {
                                                                break L26;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (var15 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var12 = 0;
                                              L28: while (true) {
                                                L29: {
                                                  L30: {
                                                    if (var12 >= var5) {
                                                      break L30;
                                                    } else {
                                                      stackOut_54_0 = 0;
                                                      stackIn_63_0 = stackOut_54_0;
                                                      stackIn_55_0 = stackOut_54_0;
                                                      if (var15 != 0) {
                                                        break L29;
                                                      } else {
                                                        var13 = stackIn_55_0;
                                                        L31: while (true) {
                                                          L32: {
                                                            L33: {
                                                              if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                                break L33;
                                                              } else {
                                                                var8[var12 + var5 * var13] = var16.b(true);
                                                                var13++;
                                                                if (var15 != 0) {
                                                                  break L32;
                                                                } else {
                                                                  if (var15 == 0) {
                                                                    continue L31;
                                                                  } else {
                                                                    break L33;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var12++;
                                                            break L32;
                                                          }
                                                          if (var15 == 0) {
                                                            continue L28;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_62_0 = var11 & 2;
                                                  stackIn_63_0 = stackOut_62_0;
                                                  break L29;
                                                }
                                                if (stackIn_63_0 == 0) {
                                                  break L21;
                                                } else {
                                                  var12 = 0;
                                                  L34: while (true) {
                                                    stackOut_65_0 = var5 ^ -1;
                                                    stackOut_65_1 = var12;
                                                    stackOut_65_2 = -1;
                                                    stackIn_66_0 = stackOut_65_0;
                                                    stackIn_66_1 = stackOut_65_1;
                                                    stackIn_66_2 = stackOut_65_2;
                                                    L35: while (true) {
                                                      if (stackIn_66_0 >= (stackIn_66_1 ^ stackIn_66_2)) {
                                                        break L21;
                                                      } else {
                                                        stackOut_67_0 = 0;
                                                        stackIn_33_0 = stackOut_67_0;
                                                        stackIn_68_0 = stackOut_67_0;
                                                        if (var15 != 0) {
                                                          break L19;
                                                        } else {
                                                          var13 = stackIn_68_0;
                                                          L36: while (true) {
                                                            L37: {
                                                              if (var13 >= var6) {
                                                                break L37;
                                                              } else {
                                                                dupTemp$3 = var16.b(true);
                                                                var9[var12 + var5 * var13] = dupTemp$3;
                                                                var14 = dupTemp$3;
                                                                stackOut_70_0 = var10;
                                                                stackOut_70_1 = 0;
                                                                stackOut_70_2 = var14 ^ -1;
                                                                stackIn_66_0 = stackOut_70_0;
                                                                stackIn_66_1 = stackOut_70_1;
                                                                stackIn_66_2 = stackOut_70_2;
                                                                stackIn_71_0 = stackOut_70_0;
                                                                stackIn_71_1 = stackOut_70_1;
                                                                stackIn_71_2 = stackOut_70_2;
                                                                if (var15 != 0) {
                                                                  continue L35;
                                                                } else {
                                                                  L38: {
                                                                    stackOut_71_0 = stackIn_71_0;
                                                                    stackIn_73_0 = stackOut_71_0;
                                                                    stackIn_72_0 = stackOut_71_0;
                                                                    if (stackIn_71_1 == stackIn_71_2) {
                                                                      stackOut_73_0 = stackIn_73_0;
                                                                      stackOut_73_1 = 0;
                                                                      stackIn_74_0 = stackOut_73_0;
                                                                      stackIn_74_1 = stackOut_73_1;
                                                                      break L38;
                                                                    } else {
                                                                      stackOut_72_0 = stackIn_72_0;
                                                                      stackOut_72_1 = 1;
                                                                      stackIn_74_0 = stackOut_72_0;
                                                                      stackIn_74_1 = stackOut_72_1;
                                                                      break L38;
                                                                    }
                                                                  }
                                                                  var10 = stackIn_74_0 | stackIn_74_1;
                                                                  var13++;
                                                                  if (var15 == 0) {
                                                                    continue L36;
                                                                  } else {
                                                                    break L37;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            var12++;
                                                            if (var15 == 0) {
                                                              continue L34;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            cc.field_e[var4] = var10 != 0;
                                            var4++;
                                            break L20;
                                          }
                                          if (var15 == 0) {
                                            stackOut_32_0 = var4 ^ -1;
                                            stackIn_33_0 = stackOut_32_0;
                                            break L19;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        stackOut_33_0 = stackIn_33_0;
                                        stackOut_33_1 = ih.field_b;
                                        stackOut_33_2 = -1;
                                        stackIn_34_0 = stackOut_33_0;
                                        stackIn_34_1 = stackOut_33_1;
                                        stackIn_34_2 = stackOut_33_2;
                                        break L18;
                                      }
                                      stackOut_34_0 = stackIn_34_0;
                                      stackOut_34_1 = stackIn_34_1 ^ stackIn_34_2;
                                      stackIn_35_0 = stackOut_34_0;
                                      stackIn_35_1 = stackOut_34_1;
                                      continue L17;
                                    }
                                  }
                                }
                              } else {
                                L39: {
                                  if (stackIn_28_0 != stackIn_28_1) {
                                    break L39;
                                  } else {
                                    rg.field_D[var4] = 1;
                                    break L39;
                                  }
                                }
                                var4++;
                                if (var15 == 0) {
                                  continue L13;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var17.field_h = 0;
                          var4 = 0;
                          L40: while (true) {
                            stackOut_32_0 = var4 ^ -1;
                            stackIn_33_0 = stackOut_32_0;
                            L41: while (true) {
                              stackOut_33_0 = stackIn_33_0;
                              stackOut_33_1 = ih.field_b;
                              stackOut_33_2 = -1;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              stackIn_34_2 = stackOut_33_2;
                              L42: while (true) {
                                stackOut_34_0 = stackIn_34_0;
                                stackOut_34_1 = stackIn_34_1 ^ stackIn_34_2;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                if (stackIn_35_0 <= stackIn_35_1) {
                                  break L14;
                                } else {
                                  var5 = ql.field_b[var4];
                                  var6 = wk.field_b[var4];
                                  var7 = var6 * var5;
                                  var20 = new byte[var7];
                                  var18 = var20;
                                  var8 = var18;
                                  re.field_K[var4] = var20;
                                  var21 = new byte[var7];
                                  var19 = var21;
                                  var9 = var19;
                                  ld.field_e[var4] = var21;
                                  var10 = 0;
                                  var11 = var17.d((byte) 40);
                                  if (var15 != 0) {
                                    break L15;
                                  } else {
                                    L43: {
                                      L44: {
                                        L45: {
                                          if ((var11 & 1 ^ -1) != -1) {
                                            break L45;
                                          } else {
                                            var12 = 0;
                                            L46: while (true) {
                                              L47: {
                                                if ((var12 ^ -1) <= (var7 ^ -1)) {
                                                  break L47;
                                                } else {
                                                  var8[var12] = var16.b(true);
                                                  var12++;
                                                  if (var15 != 0) {
                                                    break L43;
                                                  } else {
                                                    if (var15 == 0) {
                                                      continue L46;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var11 & 2 ^ -1) == -1) {
                                                break L44;
                                              } else {
                                                var12 = 0;
                                                L48: while (true) {
                                                  L49: {
                                                    if (var7 <= var12) {
                                                      break L49;
                                                    } else {
                                                      dupTemp$2 = var16.b(true);
                                                      var9[var12] = dupTemp$2;
                                                      var13 = dupTemp$2;
                                                      stackOut_46_0 = var10;
                                                      stackOut_46_1 = var13;
                                                      stackOut_46_2 = -1;
                                                      stackIn_34_0 = stackOut_46_0;
                                                      stackIn_34_1 = stackOut_46_1;
                                                      stackIn_34_2 = stackOut_46_2;
                                                      stackIn_47_0 = stackOut_46_0;
                                                      stackIn_47_1 = stackOut_46_1;
                                                      stackIn_47_2 = stackOut_46_2;
                                                      if (var15 != 0) {
                                                        continue L42;
                                                      } else {
                                                        L50: {
                                                          stackOut_47_0 = stackIn_47_0;
                                                          stackIn_49_0 = stackOut_47_0;
                                                          stackIn_48_0 = stackOut_47_0;
                                                          if (stackIn_47_1 == stackIn_47_2) {
                                                            stackOut_49_0 = stackIn_49_0;
                                                            stackOut_49_1 = 0;
                                                            stackIn_50_0 = stackOut_49_0;
                                                            stackIn_50_1 = stackOut_49_1;
                                                            break L50;
                                                          } else {
                                                            stackOut_48_0 = stackIn_48_0;
                                                            stackOut_48_1 = 1;
                                                            stackIn_50_0 = stackOut_48_0;
                                                            stackIn_50_1 = stackOut_48_1;
                                                            break L50;
                                                          }
                                                        }
                                                        var10 = stackIn_50_0 | stackIn_50_1;
                                                        var12++;
                                                        if (var15 == 0) {
                                                          continue L48;
                                                        } else {
                                                          break L49;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var15 == 0) {
                                                    break L44;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var12 = 0;
                                        L51: while (true) {
                                          L52: {
                                            L53: {
                                              if (var12 >= var5) {
                                                break L53;
                                              } else {
                                                stackOut_54_0 = 0;
                                                stackIn_63_0 = stackOut_54_0;
                                                stackIn_55_0 = stackOut_54_0;
                                                if (var15 != 0) {
                                                  break L52;
                                                } else {
                                                  var13 = stackIn_55_0;
                                                  L54: while (true) {
                                                    L55: {
                                                      L56: {
                                                        if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                          break L56;
                                                        } else {
                                                          var8[var12 + var5 * var13] = var16.b(true);
                                                          var13++;
                                                          if (var15 != 0) {
                                                            break L55;
                                                          } else {
                                                            if (var15 == 0) {
                                                              continue L54;
                                                            } else {
                                                              break L56;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      break L55;
                                                    }
                                                    if (var15 == 0) {
                                                      continue L51;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            stackOut_62_0 = var11 & 2;
                                            stackIn_63_0 = stackOut_62_0;
                                            break L52;
                                          }
                                          if (stackIn_63_0 == 0) {
                                            break L44;
                                          } else {
                                            var12 = 0;
                                            L57: while (true) {
                                              stackOut_65_0 = var5 ^ -1;
                                              stackOut_65_1 = var12;
                                              stackOut_65_2 = -1;
                                              stackIn_66_0 = stackOut_65_0;
                                              stackIn_66_1 = stackOut_65_1;
                                              stackIn_66_2 = stackOut_65_2;
                                              L58: while (true) {
                                                if (stackIn_66_0 >= (stackIn_66_1 ^ stackIn_66_2)) {
                                                  break L44;
                                                } else {
                                                  stackOut_67_0 = 0;
                                                  stackIn_33_0 = stackOut_67_0;
                                                  stackIn_68_0 = stackOut_67_0;
                                                  if (var15 != 0) {
                                                    continue L41;
                                                  } else {
                                                    var13 = stackIn_68_0;
                                                    L59: while (true) {
                                                      L60: {
                                                        if (var13 >= var6) {
                                                          break L60;
                                                        } else {
                                                          dupTemp$3 = var16.b(true);
                                                          var9[var12 + var5 * var13] = dupTemp$3;
                                                          var14 = dupTemp$3;
                                                          stackOut_70_0 = var10;
                                                          stackOut_70_1 = 0;
                                                          stackOut_70_2 = var14 ^ -1;
                                                          stackIn_66_0 = stackOut_70_0;
                                                          stackIn_66_1 = stackOut_70_1;
                                                          stackIn_66_2 = stackOut_70_2;
                                                          stackIn_71_0 = stackOut_70_0;
                                                          stackIn_71_1 = stackOut_70_1;
                                                          stackIn_71_2 = stackOut_70_2;
                                                          if (var15 != 0) {
                                                            continue L58;
                                                          } else {
                                                            L61: {
                                                              stackOut_71_0 = stackIn_71_0;
                                                              stackIn_73_0 = stackOut_71_0;
                                                              stackIn_72_0 = stackOut_71_0;
                                                              if (stackIn_71_1 == stackIn_71_2) {
                                                                stackOut_73_0 = stackIn_73_0;
                                                                stackOut_73_1 = 0;
                                                                stackIn_74_0 = stackOut_73_0;
                                                                stackIn_74_1 = stackOut_73_1;
                                                                break L61;
                                                              } else {
                                                                stackOut_72_0 = stackIn_72_0;
                                                                stackOut_72_1 = 1;
                                                                stackIn_74_0 = stackOut_72_0;
                                                                stackIn_74_1 = stackOut_72_1;
                                                                break L61;
                                                              }
                                                            }
                                                            var10 = stackIn_74_0 | stackIn_74_1;
                                                            var13++;
                                                            if (var15 == 0) {
                                                              continue L59;
                                                            } else {
                                                              break L60;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var12++;
                                                      if (var15 == 0) {
                                                        continue L57;
                                                      } else {
                                                        break L44;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      cc.field_e[var4] = var10 != 0;
                                      var4++;
                                      break L43;
                                    }
                                    if (var15 == 0) {
                                      continue L40;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L62: {
            var2 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var2);
            stackOut_79_1 = new StringBuilder().append("kf.D(");
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param0 == null) {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L62;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L62;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_82_0), stackIn_82_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        field_e = null;
        field_h = null;
        int var1 = -87 / ((55 - param0) / 36);
        field_g = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static void a(ci param0, byte param1) {
        ml var2 = null;
        hb discarded$0 = null;
        try {
            ml.b(param0.a("", (byte) 95, "headers.packvorbis"));
            var2 = ml.a(param0, "jagex logo2.packvorbis", "");
            if (param1 != -80) {
                ci var3 = (ci) null;
                kf.a((ci) null, (byte) 29);
            }
            discarded$0 = var2.b();
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "kf.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (param1 <= -79) {
            break L0;
          } else {
            field_i = (pg) null;
            break L0;
          }
        }
        if (this.field_d > this.field_f) {
          this.field_l = this.field_l + (this.field_d - this.field_f);
          this.field_f = this.field_f + (-this.field_f + this.field_d);
          this.field_d = this.field_d + param0;
          return 1;
        } else {
          var4 = 0;
          L1: while (true) {
            var4++;
            this.field_d = this.field_d + param0;
            stackOut_4_0 = var4;
            stackIn_5_0 = stackOut_4_0;
            L2: while (true) {
              L3: {
                if (stackIn_5_0 >= 10) {
                  break L3;
                } else {
                  if (this.field_d < this.field_f) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_7_0 = (this.field_d < this.field_f ? -1 : (this.field_d == this.field_f ? 0 : 1));
              stackIn_5_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 != 0) {
                continue L2;
              } else {
                L4: {
                  if (stackIn_8_0 >= 0) {
                    break L4;
                  } else {
                    this.field_d = this.field_f;
                    break L4;
                  }
                }
                return var4;
              }
            }
          }
        }
    }

    final long c(int param0) {
        this.field_f = this.field_f + this.f(param0 + 125);
        if (param0 != 0) {
            field_i = (pg) null;
        }
        if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
            return (this.field_d + -this.field_f) / 1000000L;
        }
        return 0L;
    }

    final void a(int param0) {
        if (!(this.field_f >= this.field_d)) {
            this.field_f = this.field_f + (-this.field_f + this.field_d);
        }
        this.field_l = (long)param0;
    }

    final static ti a(ti param0, boolean param1, byte param2) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ti var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var25 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        ti stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        ti stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var21 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            param0.d();
            var3_int = ga.a(param0.field_w[0], (byte) -107);
            var4 = (var3_int & 252) >> 798133154;
            if (-1 > (var4 ^ -1)) {
              throw new IllegalArgumentException();
            } else {
              var5 = var3_int & 3;
              var6 = 1;
              var8 = -8 % ((param2 - 0) / 56);
              var7 = 0;
              var9 = 0;
              var10 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var9 > var5) {
                      break L3;
                    } else {
                      incrementValue$3 = var6;
                      var6++;
                      var7 = var10 * ga.a(param0.field_w[incrementValue$3], (byte) -85) + var7;
                      var9++;
                      stackOut_6_0 = var10 * 255;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var21 != 0) {
                        break L2;
                      } else {
                        var10 = stackIn_7_0;
                        if (var21 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = var7;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                }
                var25 = new int[stackIn_9_0];
                var10 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var7 <= var10) {
                        break L6;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        stackOut_11_0 = 1;
                        stackIn_23_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (var21 != 0) {
                          break L5;
                        } else {
                          var13 = stackIn_12_0;
                          L7: while (true) {
                            L8: {
                              L9: {
                                if (var12 >= 4) {
                                  break L9;
                                } else {
                                  incrementValue$4 = var6;
                                  var6++;
                                  var11 = var13 * ga.a(param0.field_w[incrementValue$4], (byte) -42) + var11;
                                  var12++;
                                  var13 = var13 * 255;
                                  if (var21 != 0) {
                                    break L8;
                                  } else {
                                    if (var21 == 0) {
                                      continue L7;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (!param1) {
                                  break L10;
                                } else {
                                  if (0 != var11) {
                                    break L10;
                                  } else {
                                    var11 = 16711935;
                                    break L10;
                                  }
                                }
                              }
                              var25[var10] = var11;
                              var10++;
                              break L8;
                            }
                            if (var21 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    var10 = 255 * ga.a(param0.field_w[var6], (byte) -86) + ga.a(param0.field_w[var6 + 1], (byte) -81);
                    var6 += 2;
                    var11 = 255 * ga.a(param0.field_w[var6], (byte) -90) + ga.a(param0.field_w[1 + var6], (byte) -41);
                    var6 += 2;
                    var12 = 255 * ga.a(param0.field_w[var6], (byte) -92) - -ga.a(param0.field_w[1 + var6], (byte) -119);
                    var6 += 2;
                    stackOut_22_0 = ga.a(param0.field_w[var6], (byte) -121) * 255 - -ga.a(param0.field_w[var6 + 1], (byte) -113);
                    stackIn_23_0 = stackOut_22_0;
                    break L5;
                  }
                  var13 = stackIn_23_0;
                  var6 += 2;
                  var14 = 255 * ga.a(param0.field_w[var6], (byte) -87) - -ga.a(param0.field_w[1 + var6], (byte) -60);
                  var6 += 2;
                  var15 = ga.a(param0.field_w[var6], (byte) -128) * 255 + ga.a(param0.field_w[var6 + 1], (byte) -113);
                  var6 += 2;
                  var16 = new ti(var14, var15);
                  var16.field_l = var11;
                  var16.field_u = var10;
                  var16.field_r = var12;
                  var16.field_s = var13;
                  var17 = 0;
                  L11: while (true) {
                    L12: {
                      if ((var16.field_w.length ^ -1) >= (var17 ^ -1)) {
                        break L12;
                      } else {
                        var18 = 0;
                        var19 = 0;
                        var20 = 1;
                        L13: while (true) {
                          L14: {
                            L15: {
                              if ((var5 ^ -1) > (var19 ^ -1)) {
                                break L15;
                              } else {
                                incrementValue$5 = var6;
                                var6++;
                                var18 = var20 * ga.a(param0.field_w[incrementValue$5], (byte) -108) + var18;
                                var20 = var20 * 255;
                                var19++;
                                if (var21 != 0) {
                                  break L14;
                                } else {
                                  if (var21 == 0) {
                                    continue L13;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            var16.field_w[var17] = var25[var18];
                            var17++;
                            break L14;
                          }
                          if (var21 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = (ti) (var16);
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var3);
            stackOut_34_1 = new StringBuilder().append("kf.H(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L16;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L16;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_33_0;
    }

    kf() {
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_j = 1;
        this.field_l = 0L;
        this.field_n = new long[10];
        this.field_m = 0;
        this.field_f = System.nanoTime();
        this.field_d = System.nanoTime();
    }

    static {
        field_k = new String[255];
        field_o = new qj();
        field_g = new int[8192];
    }
}
