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
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var12 = ((voa) this).field_i.a((byte) -109, param1);
          var3 = var12;
          if (param0 == 1) {
            break L0;
          } else {
            ((voa) this).field_p = 94;
            break L0;
          }
        }
        L1: {
          if (!((voa) this).field_i.field_d) {
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
                  var7 = ((voa) this).field_p + var6;
                  if (var7 < -2048) {
                    stackOut_7_0 = var7 - -4096;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = var7;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  if (var7 <= 2048) {
                    stackOut_10_0 = var7;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = var7 + -4096;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_11_0;
                  var8 = var4 - -((voa) this).field_u;
                  if (var8 < -2048) {
                    stackOut_13_0 = 4096 + var8;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = var8;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_14_0;
                  if (var8 > 2048) {
                    stackOut_16_0 = var8 + -4096;
                    stackIn_17_0 = stackOut_16_0;
                    break L6;
                  } else {
                    stackOut_15_0 = var8;
                    stackIn_17_0 = stackOut_15_0;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_17_0;
                  var9 = ((voa) this).field_o + var6;
                  if (var9 >= -2048) {
                    stackOut_19_0 = var9;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 4096 + var9;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_20_0;
                  if (var9 > 2048) {
                    stackOut_22_0 = -4096 + var9;
                    stackIn_23_0 = stackOut_22_0;
                    break L8;
                  } else {
                    stackOut_21_0 = var9;
                    stackIn_23_0 = stackOut_21_0;
                    break L8;
                  }
                }
                L9: {
                  var9 = stackIn_23_0;
                  var10 = var4 + ((voa) this).field_n;
                  if (var10 >= -2048) {
                    stackOut_25_0 = var10;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  } else {
                    stackOut_24_0 = var10 - -4096;
                    stackIn_26_0 = stackOut_24_0;
                    break L9;
                  }
                }
                L10: {
                  var10 = stackIn_26_0;
                  if (var10 > 2048) {
                    stackOut_28_0 = var10 + -4096;
                    stackIn_29_0 = stackOut_28_0;
                    break L10;
                  } else {
                    stackOut_27_0 = var10;
                    stackIn_29_0 = stackOut_27_0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = stackIn_29_0;
                    stackOut_29_0 = (int[]) var12;
                    stackOut_29_1 = var5;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_32_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (this.a(var8, var7, (byte) 84)) {
                      break L12;
                    } else {
                      stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (this.a(var9, (byte) -128, var10)) {
                        break L12;
                      } else {
                        stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackOut_31_2 = 0;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        stackIn_33_2 = stackOut_31_2;
                        break L11;
                      }
                    }
                  }
                  stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = 4096;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int != 0) {
                if (1 != var4_int) {
                  if (var4_int == 2) {
                    ((voa) this).field_o = param1.d(122);
                    break L1;
                  } else {
                    if (var4_int != 3) {
                      if (var4_int == 4) {
                        ((voa) this).field_t = param1.d(127);
                        break L1;
                      } else {
                        if (var4_int != 5) {
                          if (var4_int != 6) {
                            break L1;
                          } else {
                            ((voa) this).field_r = param1.d(122);
                            break L1;
                          }
                        } else {
                          ((voa) this).field_m = param1.d(125);
                          break L1;
                        }
                      }
                    } else {
                      ((voa) this).field_n = param1.d(param0 + 17);
                      break L1;
                    }
                  }
                } else {
                  ((voa) this).field_u = param1.d(122);
                  break L1;
                }
              } else {
                ((voa) this).field_p = param1.d(param0 ^ 23);
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                boolean discarded$1 = this.a(3, 43, (byte) 18);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("voa.A(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param2 + 41);
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bb var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        kb var6_ref_kb = null;
        int var6 = 0;
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
        RuntimeException decompiledCaughtException = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var28 = vc.field_q;
            L1: {
              var2 = var28.h(255);
              if (var2 == 0) {
                var3 = var28.d(122);
                var4 = (bb) (Object) mg.field_b.f(-80);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_n != var3) {
                        var4 = (bb) (Object) mg.field_b.e(124);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 != null) {
                    L4: {
                      var5 = var28.h(255);
                      if (var5 == 0) {
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
                            String[][] dupTemp$9 = new String[3][var6];
                            var4.field_k = dupTemp$9;
                            var8 = dupTemp$9;
                            var9 = new String[3][var6];
                            long[][] dupTemp$10 = new long[3][var6];
                            var4.field_o = dupTemp$10;
                            var10 = dupTemp$10;
                            int[][] dupTemp$11 = new int[3][var6 * var7];
                            var4.field_p = dupTemp$11;
                            var11 = dupTemp$11;
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
                                          int incrementValue$12 = var15;
                                          var15++;
                                          var11[0][incrementValue$12] = var28.e(-41);
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
                                            int incrementValue$13 = var16;
                                            var16++;
                                            var11[1][incrementValue$13] = var28.e(121);
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
                                            int incrementValue$14 = var17;
                                            var17++;
                                            var11[2][incrementValue$14] = var28.e(-105);
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
                              if (var28.h(255) == 1) {
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
                    int discarded$15 = 60;
                    dea.a();
                    return;
                  }
                }
              } else {
                if (var2 == 1) {
                  var3 = var28.d(125);
                  var4_long = var28.b(290646880);
                  var6_ref_kb = (kb) (Object) nn.field_a.f(-80);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_kb == null) {
                        break L15;
                      } else {
                        if (var6_ref_kb.field_l == var3) {
                          break L15;
                        } else {
                          var6_ref_kb = (kb) (Object) nn.field_a.e(122);
                          continue L14;
                        }
                      }
                    }
                    if (var6_ref_kb != null) {
                      var6_ref_kb.field_h = var4_long;
                      var6_ref_kb.p(39);
                      break L1;
                    } else {
                      int discarded$16 = 60;
                      dea.a();
                      return;
                    }
                  }
                } else {
                  ssa.a("HS1: " + kk.a(32), (byte) 121, (Throwable) null);
                  int discarded$17 = 60;
                  dea.a();
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "voa.E(" + -95 + 41);
        }
    }

    public static void c() {
        field_q = null;
        field_s = null;
    }

    final void b(byte param0) {
        tka.b((byte) 105);
        if (param0 != 116) {
            ((voa) this).field_p = 92;
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, boolean param8, boolean param9) {
        int var11 = 0;
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
          int discarded$2 = 2;
          ava.a(bsa.field_j, param6, param0, param9);
          break L6;
        }
        bh.a(param7, 0, param3, param0, param4, param6, param9);
        if (param2 == 4096) {
          int discarded$3 = 2;
          ava.a(tn.field_n, param6, param0, param9);
          lh.field_a = lh.field_a + 1;
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = (param2 + param0) * ((voa) this).field_t >> 12;
            var5 = lm.field_r[(1047023 & 255 * var4) >> 12];
            var5 = (var5 << 12) / ((voa) this).field_t;
            var5 = (var5 << 12) / ((voa) this).field_r;
            var5 = ((voa) this).field_m * var5 >> 12;
            if (var5 <= param2 - param0) {
              break L1;
            } else {
              if (-var5 >= param2 - param0) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var4 = (param0 + -param1) * ((voa) this).field_t >> 12;
          var5 = lm.field_r[(var4 * 255 & 1048064) >> 12];
          var5 = (var5 << 12) / ((voa) this).field_t;
          var5 = (var5 << 12) / ((voa) this).field_r;
          var5 = var5 * ((voa) this).field_m >> 12;
          if (param2 >= 51) {
            break L0;
          } else {
            ((voa) this).field_p = -19;
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
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public voa() {
        super(0, true);
        ((voa) this).field_p = 2048;
        ((voa) this).field_o = 0;
        ((voa) this).field_r = 8192;
        ((voa) this).field_n = 2048;
        ((voa) this).field_m = 4096;
        ((voa) this).field_u = 0;
        ((voa) this).field_t = 12288;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = true;
        field_q = "Watching";
    }
}
