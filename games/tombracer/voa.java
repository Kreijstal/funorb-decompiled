/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class voa extends ci {
    private int field_p;
    static boolean field_v;
    static String field_s;
    private int field_n;
    private int field_r;
    private int field_m;
    private int field_u;
    private int field_o;
    static String field_q;
    private int field_t;

    final int[] c(int param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var12 = this.field_i.a((byte) -109, param1);
          var3 = var12;
          if (param0 == 1) {
            break L0;
          } else {
            this.field_p = 94;
            break L0;
          }
        }
        L1: {
          if (!this.field_i.field_d) {
            break L1;
          } else {
            var4 = sj.field_b[param1] - 2048;
            var5 = 0;
            L2: while (true) {
              if (var5 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  var6 = -2048 + ht.field_Fb[var5];
                  var7 = this.field_p + var6;
                  if (var7 < -2048) {
                    stackIn_8_0 = var7 - -4096;
                    break L3;
                  } else {
                    stackIn_8_0 = var7;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  if (-2049 <= (var7 ^ -1)) {
                    stackIn_11_0 = var7;
                    break L4;
                  } else {
                    stackIn_11_0 = var7 + -4096;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_11_0;
                  var8 = var4 - -this.field_u;
                  if (var8 < -2048) {
                    stackIn_14_0 = 4096 + var8;
                    break L5;
                  } else {
                    stackIn_14_0 = var8;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_14_0;
                  if (var8 > 2048) {
                    stackIn_17_0 = var8 + -4096;
                    break L6;
                  } else {
                    stackIn_17_0 = var8;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_17_0;
                  var9 = this.field_o + var6;
                  if (2047 >= (var9 ^ -1)) {
                    stackIn_20_0 = var9;
                    break L7;
                  } else {
                    stackIn_20_0 = 4096 + var9;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_20_0;
                  if ((var9 ^ -1) < -2049) {
                    stackIn_23_0 = -4096 + var9;
                    break L8;
                  } else {
                    stackIn_23_0 = var9;
                    break L8;
                  }
                }
                L9: {
                  var9 = stackIn_23_0;
                  var10 = var4 + this.field_n;
                  if (var10 >= -2048) {
                    stackIn_26_0 = var10;
                    break L9;
                  } else {
                    stackIn_26_0 = var10 - -4096;
                    break L9;
                  }
                }
                L10: {
                  var10 = stackIn_26_0;
                  if ((var10 ^ -1) < -2049) {
                    stackIn_29_0 = var10 + -4096;
                    break L10;
                  } else {
                    stackIn_29_0 = var10;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = stackIn_29_0;
                    stackIn_32_0 = (int[]) (var12);

                    stackIn_32_1 = var5;

                    if (this.a(var8, var7, (byte) 84)) {
                      break L12;
                    } else {
                      stackIn_32_0 = (int[]) ((Object) stackIn_32_0);

                      if (this.a(var9, (byte) -128, var10)) {
                        break L12;
                      } else {
                        stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                        stackIn_33_1 = stackIn_32_1;
                        stackIn_33_2 = 0;
                        break L11;
                      }
                    }
                  }
                  stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                  stackIn_33_1 = stackIn_32_1;
                  stackIn_33_2 = 4096;
                  break L11;
                }
                stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                var5++;
                continue L2;
              }
            }
          }
        }
        return var12;
    }

    final void a(byte param0, uia param1, int param2) {
        boolean discarded$0 = false;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (1 != var4_int) {
                  if (-3 == (var4_int ^ -1)) {
                    this.field_o = param1.d(122);
                    break L1;
                  } else {
                    if (-4 != (var4_int ^ -1)) {
                      if (-5 == (var4_int ^ -1)) {
                        this.field_t = param1.d(127);
                        break L1;
                      } else {
                        if ((var4_int ^ -1) != -6) {
                          if (var4_int != 6) {
                            break L1;
                          } else {
                            this.field_r = param1.d(122);
                            break L1;
                          }
                        } else {
                          this.field_m = param1.d(125);
                          break L1;
                        }
                      }
                    } else {
                      this.field_n = param1.d(param0 + 17);
                      break L1;
                    }
                  }
                } else {
                  this.field_u = param1.d(122);
                  break L1;
                }
              } else {
                this.field_p = param1.d(param0 ^ 23);
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                discarded$0 = this.a(3, 43, (byte) 18);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("voa.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final static void d(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        kb var6_ref_kb = null;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        kh var28 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var28 = vc.field_q;
            if (param0 <= -48) {
              L1: {
                var2 = var28.h(255);
                if (var2 == 0) {
                  var3 = var28.d(122);
                  var4 = (bb) ((Object) mg.field_b.f(-80));
                  L2: while (true) {
                    L3: {
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.field_n != var3) {
                          var4 = (bb) ((Object) mg.field_b.e(124));
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var4 != null) {
                      L4: {
                        var5 = var28.h(255);
                        if (-1 == (var5 ^ -1)) {
                          break L4;
                        } else {
                          var6 = var4.field_j;
                          bj.field_s[0].field_a = fna.field_k;
                          bj.field_s[0].field_c = null;
                          bj.field_s[0].field_d = false;
                          var7 = var4.field_i;
                          var8_int = 1;
                          L5: while (true) {
                            if (var5 <= var8_int) {
                              dupTemp$0 = new String[3][var6];
                              var4.field_k = dupTemp$0;
                              var8 = dupTemp$0;
                              var9 = new String[3][var6];
                              dupTemp$1 = new long[3][var6];
                              var4.field_o = dupTemp$1;
                              var10 = dupTemp$1;
                              dupTemp$2 = new int[3][var6 * var7];
                              var4.field_p = dupTemp$2;
                              var11 = dupTemp$2;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16 = 0;
                              var17 = 0;
                              var18 = var28.h(255);
                              if (var18 <= 0) {
                                break L4;
                              } else {
                                var19 = 0;
                                L6: while (true) {
                                  if (var18 <= var19) {
                                    break L4;
                                  } else {
                                    L7: {
                                      var20 = var28.h(255);
                                      var21 = bj.field_s[var20].field_a;
                                      var22 = var28.b(290646880);
                                      var24 = var28.field_h;
                                      if (var19 >= var6) {
                                        break L7;
                                      } else {
                                        var8[0][var12] = var21;
                                        var9[0][var12] = bj.field_s[var20].field_c;
                                        var10[0][var12] = var22;
                                        var25 = 0;
                                        L8: while (true) {
                                          if (var25 >= var7) {
                                            var12++;
                                            break L7;
                                          } else {
                                            incrementValue$3 = var15;
                                            var15++;
                                            var11[0][incrementValue$3] = var28.e(-41);
                                            var25++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var21 == null) {
                                        break L9;
                                      } else {
                                        if (!ue.a(var21, 0)) {
                                          break L9;
                                        } else {
                                          var8[1][var13] = fna.field_k;
                                          var9[1][var13] = null;
                                          var10[1][var13] = var22;
                                          var28.field_h = var24;
                                          var13++;
                                          var25 = 0;
                                          L10: while (true) {
                                            if (var7 <= var25) {
                                              break L9;
                                            } else {
                                              incrementValue$4 = var16;
                                              var16++;
                                              var11[1][incrementValue$4] = var28.e(121);
                                              var25++;
                                              continue L10;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var14 >= var6) {
                                        break L11;
                                      } else {
                                        if (bj.field_s[var20].field_d) {
                                          break L11;
                                        } else {
                                          bj.field_s[var20].field_d = true;
                                          var8[2][var14] = var21;
                                          var9[2][var14] = bj.field_s[var20].field_c;
                                          var10[2][var14] = var22;
                                          var14++;
                                          var28.field_h = var24;
                                          var25 = 0;
                                          L12: while (true) {
                                            if (var25 >= var7) {
                                              break L11;
                                            } else {
                                              incrementValue$5 = var17;
                                              var17++;
                                              var11[2][incrementValue$5] = var28.e(-105);
                                              var25++;
                                              continue L12;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var19++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                bj.field_s[var8_int].field_a = var28.e((byte) -76);
                                bj.field_s[var8_int].field_d = false;
                                if ((var28.h(255) ^ -1) == -2) {
                                  bj.field_s[var8_int].field_c = var28.e((byte) -76);
                                  break L13;
                                } else {
                                  bj.field_s[var8_int].field_c = null;
                                  break L13;
                                }
                              }
                              var8_int++;
                              continue L5;
                            }
                          }
                        }
                      }
                      var4.field_h = true;
                      var4.p(125);
                      break L1;
                    } else {
                      dea.a(60);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                } else {
                  if ((var2 ^ -1) == -2) {
                    var3 = var28.d(125);
                    var4_long = var28.b(290646880);
                    var6_ref_kb = (kb) ((Object) nn.field_a.f(-80));
                    L14: while (true) {
                      L15: {
                        if (var6_ref_kb == null) {
                          break L15;
                        } else {
                          if (var6_ref_kb.field_l == var3) {
                            break L15;
                          } else {
                            var6_ref_kb = (kb) ((Object) nn.field_a.e(122));
                            continue L14;
                          }
                        }
                      }
                      if (var6_ref_kb != null) {
                        var6_ref_kb.field_h = var4_long;
                        var6_ref_kb.p(39);
                        break L1;
                      } else {
                        dea.a(60);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    ssa.a("HS1: " + kk.a(32), (byte) 121, (Throwable) null);
                    dea.a(60);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "voa.E(" + param0 + ')');
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

    public static void c(int param0) {
        if (param0 != 0) {
            field_q = (String) null;
        }
        field_q = null;
        field_s = null;
    }

    final void b(byte param0) {
        tka.b((byte) 105);
        if (param0 != 116) {
            this.field_p = 92;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, boolean param8, boolean param9) {
        int var11;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            L1: {
              if (bea.field_g != ob.field_i) {
                break L1;
              } else {
                if (jqa.field_g == bea.field_a) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (bea.field_a != gn.field_C.field_e) {
              break L0;
            } else {
              if (gn.field_C.field_f != bea.field_g) {
                break L0;
              } else {
                if (null != uu.field_a) {
                  hn.c(false, 2);
                  break L0;
                } else {
                  if (null == ifa.field_n) {
                    re.a(-29040);
                    break L0;
                  } else {
                    hn.c(true, 2);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param1) {
            ava.field_d = ht.field_Xb;
            break L2;
          } else {
            ava.field_d = (-640 + ob.field_i) / 2;
            break L2;
          }
        }
        L3: {
          di.a((byte) -98, param1);
          if (mla.field_a > 0) {
            jc.a(param5, true, param1, param6);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          dl.field_t.field_x = tka.field_q.field_x;
          dl.field_t.field_z = 1;
          if (0 < gt.field_a) {
            vu.a((byte) 1, param5, param1, param6);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (0 < fp.field_e) {
            aja.a(param1, -1, param6, param8, param5);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (!tla.field_e) {
              break L7;
            } else {
              if (uu.field_a.field_Mb >= uu.field_a.field_Jb) {
                rra.field_e.field_X = false;
                bsa.field_j.field_vb.field_r = ml.field_c;
                vsa.a(-116, bsa.field_j.field_tb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          rra.field_e.field_X = true;
          bsa.field_j.field_vb.field_r = null;
          ava.a(bsa.field_j, param6, param0, param9, 2);
          break L6;
        }
        bh.a(param7, 0, param3, param0, param4, param6, param9);
        if (param2 == 4096) {
          ava.a(tn.field_n, param6, param0, param9, 2);
          lh.field_a = lh.field_a + 1;
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        L0: {
          var4 = (param2 + param0) * this.field_t >> -1450908500;
          var5 = lm.field_r[(1047023 & 255 * var4) >> 777228428];
          var5 = (var5 << 1429157708) / this.field_t;
          if (param1 == -128) {
            break L0;
          } else {
            this.field_r = 96;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = (var5 << 1054545772) / this.field_r;
            var5 = this.field_m * var5 >> -1955688532;
            if (var5 <= param2 - param0) {
              break L2;
            } else {
              if (-var5 >= param2 - param0) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        L0: {
          var4 = (param0 + -param1) * this.field_t >> -762271956;
          var5 = lm.field_r[(var4 * 255 & 1048064) >> 1852256588];
          var5 = (var5 << -1966904724) / this.field_t;
          var5 = (var5 << -1995003860) / this.field_r;
          var5 = var5 * this.field_m >> 265579116;
          if (param2 >= 51) {
            break L0;
          } else {
            this.field_p = -19;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var5 <= param1 - -param0) {
              break L2;
            } else {
              if (param1 - -param0 <= -var5) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public voa() {
        super(0, true);
        this.field_p = 2048;
        this.field_o = 0;
        this.field_r = 8192;
        this.field_n = 2048;
        this.field_m = 4096;
        this.field_u = 0;
        this.field_t = 12288;
    }

    static {
        field_v = true;
        field_q = "Watching";
    }
}
