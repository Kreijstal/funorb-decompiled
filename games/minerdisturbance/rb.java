/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static ac field_e;
    private boolean field_o;
    private boolean[] field_b;
    static String field_f;
    private int field_n;
    private boolean[] field_m;
    private boolean field_a;
    private int field_j;
    private int[] field_i;
    private boolean[] field_g;
    private int[] field_h;
    static int[] field_l;
    private int[] field_p;
    private int field_k;
    private int[] field_c;
    private boolean[] field_d;

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        if (param0 != 7) {
            return;
        }
        int var5 = param3 + ((rb) this).field_k * param2;
        int var6 = -4 + ((rb) this).field_k;
        var5 = var5 + var6 * param1;
        for (var7 = 0; 4 > var7; var7++) {
            int incrementValue$0 = var5;
            var5++;
            ((rb) this).field_m[incrementValue$0] = true;
        }
    }

    final void g(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * param2;
        param0 = param0 * 4;
        int var4 = param1 + param0 * ((rb) this).field_k;
        int var5 = ((rb) this).field_k - 4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                ((rb) this).field_b[var4] = false;
                ((rb) this).field_g[var4] = false;
                ((rb) this).field_m[var4] = false;
                ((rb) this).field_c[var4] = 0;
                var4++;
            }
            var4 = var4 + var5;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 > -56) {
            ((rb) this).a(75, 49, 83, true);
        }
        int var4 = param2 + param1 * ((rb) this).field_k;
        return ((rb) this).field_c[var4];
    }

    final boolean c(int param0, int param1, int param2) {
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        int var4 = param1 * ((rb) this).field_k + param2;
        int var5 = -4 + ((rb) this).field_k;
        int var6 = 0;
        int var7 = -74 / ((param0 - 27) / 51);
        while (-5 < (var6 ^ -1)) {
            for (var8 = 0; var8 < 4; var8++) {
                int incrementValue$0 = var4;
                var4++;
                if (((rb) this).field_d[incrementValue$0]) {
                    return true;
                }
            }
            var4 = var4 + var5;
            var6++;
        }
        return false;
    }

    final void a(boolean param0, je[][] param1) {
        int[] var3 = null;
        int[] var4 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_6_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_114_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        L0: {
          var19 = MinerDisturbance.field_ab;
          if (-3 < (je.field_H ^ -1)) {
            je.field_H = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var20 = new int[]{2147483647, 2147483647, 2147483647};
          var21 = var20;
          var3 = var21;
          var25 = new int[var20.length];
          var24 = var25;
          var23 = var24;
          var22 = var23;
          var4 = var22;
          if (je.field_u < je.field_N[cm.field_o]) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var5 = stackIn_6_0;
        var6 = -2 + je.field_t * 4;
        L2: while (true) {
          if (var6 < -4 + je.field_H * 4) {
            L3: {
              var6 = 0;
              var7 = 0;
              var8 = 0;
              if (param0) {
                break L3;
              } else {
                field_l = null;
                break L3;
              }
            }
            var9 = 0;
            L4: while (true) {
              if (var9 >= param1.length) {
                L5: {
                  if (-1 <= (var6 ^ -1)) {
                    break L5;
                  } else {
                    L6: {
                      if (0 != (((rb) this).field_n & 15)) {
                        break L6;
                      } else {
                        L7: {
                          var7 = var7 / var6;
                          var8 = var8 / var6;
                          if (-2 < (var7 ^ -1)) {
                            var7 = 1;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          var9 = 80 * oc.field_f / (int)Math.sqrt((double)var7);
                          if (oc.field_f >= var9) {
                            break L8;
                          } else {
                            var9 = oc.field_f;
                            break L8;
                          }
                        }
                        L9: {
                          var10 = 10;
                          var11 = (var8 >> -1224060638) + -ca.field_k;
                          if ((-var10 ^ -1) < (var11 ^ -1)) {
                            var11 = -var10;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          if (var11 > var10) {
                            var11 = var10;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          var12 = 128 + var11 * 128 / var10;
                          if (var12 < 0) {
                            var12 = 0;
                            break L11;
                          } else {
                            if ((var12 ^ -1) >= -256) {
                              break L11;
                            } else {
                              var12 = 255;
                              break L11;
                            }
                          }
                        }
                        od.a(var12, 47, var9, 4);
                        break L6;
                      }
                    }
                    break L5;
                  }
                }
                return;
              } else {
                L12: {
                  if (var21[var9] != 2147483647) {
                    var6++;
                    var8 = var8 + var25[var9];
                    var7 = var7 + var21[var9];
                    break L12;
                  } else {
                    break L12;
                  }
                }
                var9++;
                continue L4;
              }
            }
          } else {
            var7 = var6 >> 1687730786;
            var8 = 3;
            L13: while (true) {
              if ((var8 ^ -1) < -125) {
                var6--;
                continue L2;
              } else {
                L14: {
                  var9 = var8 - -(((rb) this).field_k * var6);
                  if (0 >= ((rb) this).field_c[var9]) {
                    if (var5 == 0) {
                      break L14;
                    } else {
                      if ((4 * hf.field_t + 128 ^ -1) <= (var6 ^ -1)) {
                        break L14;
                      } else {
                        ((rb) this).field_c[var9] = 10;
                        if ((32 + je.field_H ^ -1) <= (je.field_t ^ -1)) {
                          break L14;
                        } else {
                          je.field_t = je.field_t - 1;
                          break L14;
                        }
                      }
                    }
                  } else {
                    L15: {
                      var10 = ((rb) this).field_c[var9];
                      if (var10 <= 0) {
                        break L15;
                      } else {
                        L16: {
                          var11 = -(var8 >> -476617982) + ca.field_k;
                          var12 = -(var6 >> 1544864738) + hf.field_t;
                          var13 = var11 * var11 + var12 * var12;
                          if (!sc.field_b) {
                            break L16;
                          } else {
                            if (ni.a(6, 11764)) {
                              break L16;
                            } else {
                              if ((var13 ^ -1) > -41) {
                                var21 = var3;
                                var25 = var24;
                                ag.a(true, 6, 8 * var6, var8 * 8);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                        var21 = var3;
                        var25 = var24;
                        var14 = 0;
                        L17: while (true) {
                          if (var21.length <= var14) {
                            break L15;
                          } else {
                            if (var13 == var21[var14]) {
                              var4[var14] = (var8 + var25[var14]) / 2;
                              break L15;
                            } else {
                              if (var13 >= var21[var14]) {
                                var14++;
                                continue L17;
                              } else {
                                var21[var14] = var13;
                                var25[var14] = var8;
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                    L18: {
                      if (!((rb) this).field_b[var9]) {
                        break L18;
                      } else {
                        ((rb) this).field_b[var9] = false;
                        var10--;
                        ((rb) this).field_c[var9] = var10;
                        break L18;
                      }
                    }
                    L19: {
                      ((rb) this).field_i[var9] = 8;
                      var11 = 1 + ((rb) this).field_h[var9];
                      ((rb) this).field_h[var9] = var11;
                      if (-16 > (var11 ^ -1)) {
                        L20: {
                          ((rb) this).field_h[var9] = 0;
                          if (-2 <= (var10 ^ -1)) {
                            break L20;
                          } else {
                            if (je.i(var8, var6 + -1)) {
                              break L20;
                            } else {
                              var12 = ((rb) this).field_c[var9];
                              if (var12 < 10) {
                                ((rb) this).field_c[-((rb) this).field_k + var9] = 1 + var12;
                                var10--;
                                ((rb) this).field_c[var9] = var10;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        L21: {
                          if (-11 >= (var10 ^ -1)) {
                            break L21;
                          } else {
                            var10 += 2;
                            ((rb) this).field_c[var9] = var10;
                            break L21;
                          }
                        }
                        L22: {
                          if (var10 <= 1) {
                            break L22;
                          } else {
                            if (((rb) this).field_c[var9 - -((rb) this).field_k] > 0) {
                              break L22;
                            } else {
                              if (!je.i(var8, 1 + var6)) {
                                ((rb) this).field_c[var9] = 0;
                                ((rb) this).field_c[var9 + ((rb) this).field_k] = var10;
                                var10 = 0;
                                break L19;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        if (var10 <= 2) {
                          break L19;
                        } else {
                          L23: {
                            if (0.5 >= Math.random()) {
                              stackOut_43_0 = 0;
                              stackIn_44_0 = stackOut_43_0;
                              break L23;
                            } else {
                              stackOut_42_0 = 1;
                              stackIn_44_0 = stackOut_42_0;
                              break L23;
                            }
                          }
                          L24: {
                            var12 = stackIn_44_0;
                            if (var12 == 0) {
                              break L24;
                            } else {
                              if ((((rb) this).field_c[var9 - -1] ^ -1) <= (var10 ^ -1)) {
                                break L24;
                              } else {
                                if (!je.i(1 + var8, var6)) {
                                  var10--;
                                  ((rb) this).field_c[var9] = var10;
                                  ((rb) this).field_c[1 + var9] = ((rb) this).field_c[1 + var9] + 1;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          L25: {
                            if (var10 <= ((rb) this).field_c[-1 + var9]) {
                              break L25;
                            } else {
                              if (je.i(-1 + var8, var6)) {
                                break L25;
                              } else {
                                var10--;
                                ((rb) this).field_c[var9] = var10;
                                ((rb) this).field_c[var9 + -1] = ((rb) this).field_c[var9 + -1] + 1;
                                break L25;
                              }
                            }
                          }
                          L26: {
                            if (var12 != 0) {
                              break L26;
                            } else {
                              if (var10 <= ((rb) this).field_c[var9 - -1]) {
                                break L26;
                              } else {
                                if (!je.i(1 + var8, var6)) {
                                  var10--;
                                  ((rb) this).field_c[var9] = var10;
                                  ((rb) this).field_c[var9 - -1] = ((rb) this).field_c[var9 - -1] + 1;
                                  break L26;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          break L19;
                        }
                      } else {
                        break L19;
                      }
                    }
                    L27: {
                      var12 = var8 >> 1621660194;
                      param1[var12][var7].field_i = 255;
                      var13 = 2 + var12 * 4 - -((2 + var7 * 4) * ((rb) this).field_k);
                      if (!((rb) this).field_m[var13]) {
                        break L27;
                      } else {
                        var14 = var12 * 4 - 8;
                        L28: while (true) {
                          if (4 * (1 + var12) - -8 <= var14) {
                            break L27;
                          } else {
                            var15 = 4 * var7 - 8;
                            L29: while (true) {
                              if ((8 + (4 + 4 * var7) ^ -1) >= (var15 ^ -1)) {
                                var14++;
                                continue L28;
                              } else {
                                L30: {
                                  L31: {
                                    var16 = var15 * ((rb) this).field_k + var14;
                                    if (((rb) this).field_m[var16]) {
                                      break L31;
                                    } else {
                                      if (((rb) this).field_g[var16]) {
                                        break L31;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L32: {
                                    if (!((rb) this).field_g[var16]) {
                                      break L32;
                                    } else {
                                      L33: {
                                        if (((rb) this).field_g[var16 - ((rb) this).field_k]) {
                                          ((rb) this).field_d[var16 - ((rb) this).field_k] = true;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      L34: {
                                        if (((rb) this).field_g[var16 - 1]) {
                                          ((rb) this).field_d[var16 - 1] = true;
                                          break L34;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      if (((rb) this).field_g[1 + var16]) {
                                        ((rb) this).field_d[var16 + 1] = true;
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  L35: {
                                    lj.field_r = lj.field_r + 25;
                                    if ((var8 & 3 ^ -1) != -2) {
                                      break L35;
                                    } else {
                                      if ((3 & var6 ^ -1) != -2) {
                                        break L35;
                                      } else {
                                        var17 = jf.b((byte) 100);
                                        uf.field_p[var17] = new gf(var14 / 4, var15 / 4, 16);
                                        uf.field_p[var17].field_g = 0;
                                        uf.field_p[var17].field_b = 250;
                                        break L35;
                                      }
                                    }
                                  }
                                  L36: {
                                    if (!oe.field_b) {
                                      ((rb) this).field_m[var9] = false;
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                  var17 = var14 / 4 - 1;
                                  L37: while (true) {
                                    if (var14 / 4 + 1 < var17) {
                                      break L30;
                                    } else {
                                      var18 = -1 + var15 / 4;
                                      L38: while (true) {
                                        if ((var18 ^ -1) < (var15 / 4 + 1 ^ -1)) {
                                          var17++;
                                          continue L37;
                                        } else {
                                          L39: {
                                            if ((var18 ^ -1) >= -1) {
                                              break L39;
                                            } else {
                                              if (-1 <= (var17 ^ -1)) {
                                                break L39;
                                              } else {
                                                if (31 <= var17) {
                                                  break L39;
                                                } else {
                                                  if (je.field_t - 1 <= var18) {
                                                    break L39;
                                                  } else {
                                                    if (!param1[var17][var18].field_a) {
                                                      break L39;
                                                    } else {
                                                      param1[var17][var18].field_S = true;
                                                      param1[var17][var18].field_r = 900;
                                                      break L39;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var18++;
                                          continue L38;
                                        }
                                      }
                                    }
                                  }
                                }
                                var15++;
                                continue L29;
                              }
                            }
                          }
                        }
                      }
                    }
                    L40: {
                      if (param1[var12][var7].field_E) {
                        param1[var12][var7].field_E = false;
                        param1[var12][var7].field_a = false;
                        ((rb) this).h(var12, 4, var7);
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (param1[var12][var7].field_a) {
                        if (1 < var10) {
                          L42: {
                            if (!param1[var12][var7].field_b) {
                              stackOut_113_0 = 0;
                              stackIn_114_0 = stackOut_113_0;
                              break L42;
                            } else {
                              stackOut_112_0 = 1;
                              stackIn_114_0 = stackOut_112_0;
                              break L42;
                            }
                          }
                          L43: {
                            var14 = stackIn_114_0;
                            if (var10 <= 4) {
                              break L43;
                            } else {
                              if (param1[var12][var7].field_v) {
                                param1[var12][var7].field_q = param1[var12][var7].field_q + 4;
                                var10 -= 4;
                                break L43;
                              } else {
                                break L43;
                              }
                            }
                          }
                          L44: {
                            if (-2 <= (var10 ^ -1)) {
                              break L44;
                            } else {
                              if (var14 != 0) {
                                break L44;
                              } else {
                                var10 -= 2;
                                param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                                break L44;
                              }
                            }
                          }
                          L45: {
                            if (var10 <= 4) {
                              break L45;
                            } else {
                              if (var14 == 0) {
                                var10 -= 2;
                                param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                                break L45;
                              } else {
                                break L45;
                              }
                            }
                          }
                          L46: {
                            if ((var10 ^ -1) >= -10) {
                              break L46;
                            } else {
                              var10 -= 2;
                              param1[var12][var7].field_q = param1[var12][var7].field_q + 2;
                              break L46;
                            }
                          }
                          L47: {
                            if ((var10 ^ -1) >= -1) {
                              var10 = 1;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          if (param1[var12][var7].field_q > 768) {
                            if (var14 == 0) {
                              param1[var12][var7].field_q = 0;
                              param1[var12][var7].field_a = false;
                              param1[var12][var7].field_v = false;
                              param1[var12][var7].field_E = false;
                              param1[var12][var7].field_U = -1;
                              param1[var12][var7].field_b = false;
                              ((rb) this).a(false, var12, 9, var7);
                              lj.field_r = lj.field_r + 25;
                              break L41;
                            } else {
                              param1[var12][var7].field_q = 768;
                              break L41;
                            }
                          } else {
                            break L41;
                          }
                        } else {
                          if (var10 <= 0) {
                            var13 = 4 * var12 + 2 - -(((rb) this).field_k * (2 + 4 * var7));
                            if (((rb) this).field_b[var13]) {
                              param1[var12][var7].field_a = true;
                              param1[var12][var7].field_q = 0;
                              break L14;
                            } else {
                              break L14;
                            }
                          } else {
                            var8++;
                            continue L13;
                          }
                        }
                      } else {
                        break L41;
                      }
                    }
                    if (var10 <= 0) {
                      var13 = 4 * var12 + 2 - -(((rb) this).field_k * (2 + 4 * var7));
                      if (((rb) this).field_b[var13]) {
                        param1[var12][var7].field_a = true;
                        param1[var12][var7].field_q = 0;
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                var8++;
                continue L13;
              }
            }
          }
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        var4 = 0;
        if (param1) {
          param2 = param2 * 4;
          var5 = 0;
          param0 = param0 * 4;
          var6 = (param2 + 1) * ((rb) this).field_k + param0;
          var7 = ((rb) this).field_k + -4;
          var8 = 0;
          L0: while (true) {
            if (-5 >= (var8 ^ -1)) {
              var8 = param0 + ((1 + param2) * ((rb) this).field_k + -4);
              var9 = 3;
              L1: while (true) {
                if (var9 <= 0) {
                  var6 = param0 + ((rb) this).field_k * (1 + param2);
                  var9 = 0;
                  L2: while (true) {
                    if ((var9 ^ -1) <= -5) {
                      return var5 != 0;
                    } else {
                      var10 = 0;
                      L3: while (true) {
                        if (var10 >= 4) {
                          var6 = var6 + var7;
                          var9++;
                          continue L2;
                        } else {
                          L4: {
                            if (((rb) this).field_b[var6]) {
                              break L4;
                            } else {
                              if (-1 <= (var4 ^ -1)) {
                                break L4;
                              } else {
                                var5 = 1;
                                ((rb) this).field_b[var6] = true;
                                var4--;
                                break L4;
                              }
                            }
                          }
                          var6++;
                          var10++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= 4) {
                      var8 = var8 - (4 + var7);
                      var9--;
                      continue L1;
                    } else {
                      L6: {
                        if (!((rb) this).field_b[var8]) {
                          break L6;
                        } else {
                          if (-1 > (var4 ^ -1)) {
                            var4--;
                            ((rb) this).field_b[var8] = true;
                            var5 = 1;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var8++;
                      var10++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              var9 = 0;
              L7: while (true) {
                if ((var9 ^ -1) <= -5) {
                  var6 = var6 + var7;
                  var8++;
                  continue L0;
                } else {
                  L8: {
                    if (!((rb) this).field_b[var6]) {
                      break L8;
                    } else {
                      var4++;
                      ((rb) this).field_b[var6] = false;
                      var5 = 1;
                      break L8;
                    }
                  }
                  var6++;
                  var9++;
                  continue L7;
                }
              }
            }
          }
        } else {
          return true;
        }
    }

    final int j(int param0, int param1, int param2) {
        int var4 = ((rb) this).field_k * param1 + param2;
        if (param0 > -112) {
            int discarded$0 = ((rb) this).j(50, 67, 7);
        }
        return ((rb) this).field_p[var4];
    }

    public static void a(int param0) {
        if (param0 != -2004317953) {
            return;
        }
        field_l = null;
        field_f = null;
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param3 = param3 * 4;
        int var6 = param2 - -(((rb) this).field_k * param3);
        int var7 = -4 + ((rb) this).field_k;
        if (!param4) {
            ((rb) this).field_h = null;
        }
        for (var8 = 0; var8 < 4; var8++) {
            for (var9 = 0; -5 < (var9 ^ -1); var9++) {
                int incrementValue$0 = var6;
                var6++;
                ((rb) this).field_b[incrementValue$0] = (double)param1 * Math.random() < (double)param0 ? true : false;
            }
            var6 = var6 + var7;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 - -(((rb) this).field_k * param0);
        ((rb) this).field_b[var5] = param1;
        int var6 = -112 % ((param3 - -40) / 34);
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = 0;
        int var11 = MinerDisturbance.field_ab;
        param4 = param4 * 4;
        param2 = param2 * 4;
        int var6 = param4 + ((rb) this).field_k * param2;
        int var7 = ((rb) this).field_k + -4;
        int var8 = 0;
        int var9 = 64 % ((param3 - -13) / 60);
        while (4 > var8) {
            for (var10 = 0; -5 < (var10 ^ -1); var10++) {
                int incrementValue$0 = var6;
                var6++;
                ((rb) this).field_g[incrementValue$0] = (double)param1 > Math.random() * (double)param0 ? true : false;
            }
            var6 = var6 + var7;
            var8++;
        }
    }

    final boolean a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param0 - -(((rb) this).field_k * param2);
        if (param1 > -82) {
            return true;
        }
        int var5 = ((rb) this).field_k + -4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                int incrementValue$0 = var4;
                var4++;
                if (!(!((rb) this).field_b[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final void h(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * param1;
        param2 = param2 * 4;
        int var4 = param2 * ((rb) this).field_k + param0;
        int var5 = -4 + ((rb) this).field_k;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; 4 > var7; var7++) {
                int incrementValue$0 = var4;
                var4++;
                ((rb) this).field_b[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void e(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        if (param2 != 83) {
            return;
        }
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + ((rb) this).field_k * param0;
        int var5 = ((rb) this).field_k - 4;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                if (((rb) this).field_g[var4]) {
                    ((rb) this).field_g[var4] = false;
                    return;
                }
                var4++;
            }
            var4 = var4 + var5;
        }
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        int var5 = param2 + ((rb) this).field_k * param3;
        if (param0 <= 91) {
            return;
        }
        ((rb) this).field_m[var5] = param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var6 = param2 * ((rb) this).field_k + param3;
        int var7 = param1 + ((rb) this).field_k;
        for (var8 = 0; -5 < (var8 ^ -1); var8++) {
            for (var9 = 0; (var9 ^ -1) > -5; var9++) {
                int incrementValue$0 = var6;
                var6++;
                ((rb) this).field_m[incrementValue$0] = (double)param4 > Math.random() * (double)param0 ? true : false;
            }
            var6 = var6 + var7;
        }
    }

    final boolean d(int param0, int param1, byte param2) {
        int var4 = param1 + param0 * ((rb) this).field_k;
        if (param2 > -76) {
            return false;
        }
        return (((rb) this).field_i[var4] ^ -1) < -1 ? true : false;
    }

    final static boolean a(byte param0, char param1) {
        if (!Character.isISOControl(param1)) {
          if (fg.a(-1975005818, param1)) {
            return true;
          } else {
            L0: {
              if (45 == param1) {
                break L0;
              } else {
                if (param1 == 160) {
                  break L0;
                } else {
                  if (param1 == 32) {
                    break L0;
                  } else {
                    if (param1 != 95) {
                      if (param0 > 117) {
                        return false;
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean b(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param0 + ((rb) this).field_k * param1;
        int var5 = ((rb) this).field_k - 4;
        if (param2 <= 12) {
            return true;
        }
        for (var6 = 0; var6 < 4; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                int incrementValue$0 = var4;
                var4++;
                if (!(!((rb) this).field_d[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final void a(boolean param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param2 = param2 * 4;
        int var5 = param3 * ((rb) this).field_k + param2;
        if (param1 <= 0) {
            ((rb) this).field_h = null;
        }
        int var6 = ((rb) this).field_k - 4;
        for (var7 = 0; var7 < 4; var7++) {
            for (var8 = 0; var8 < 4; var8++) {
                int incrementValue$0 = var5;
                var5++;
                ((rb) this).field_d[incrementValue$0] = true;
            }
            var5 = var5 + var6;
        }
    }

    final boolean e(int param0, int param1, int param2) {
        if (param2 != 2) {
            ((rb) this).field_a = false;
        }
        int var4 = param0 - -(((rb) this).field_k * param1);
        return ((rb) this).field_b[var4];
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var8 = 0;
        int var9 = MinerDisturbance.field_ab;
        param3 = param3 * 4;
        param1 = param1 * 4;
        int var5 = param1 - -(param3 * ((rb) this).field_k);
        int var6 = ((rb) this).field_k - 4;
        int var7 = 0;
        if (param0) {
            return;
        }
        while (-5 < (var7 ^ -1)) {
            for (var8 = 0; (var8 ^ -1) > -5; var8++) {
                int incrementValue$0 = var5;
                var5++;
                ((rb) this).field_c[incrementValue$0] = param2;
            }
            var5 = var5 + var6;
            var7++;
        }
    }

    final boolean f(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param0 = param0 * 4;
        int var4 = param2 + param0 * ((rb) this).field_k;
        if (param1 != 2) {
            ((rb) this).field_a = false;
        }
        int var5 = ((rb) this).field_k + -4;
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; 4 > var7; var7++) {
                int incrementValue$0 = var4;
                var4++;
                if (!(!((rb) this).field_g[incrementValue$0])) {
                    return true;
                }
            }
            var4 = var4 + var5;
        }
        return false;
    }

    final boolean i(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (-1 < (param1 ^ -1)) {
            break L0;
          } else {
            if (((rb) this).field_k - 1 < param1) {
              break L0;
            } else {
              if (-1 + ((rb) this).field_j < param2) {
                break L0;
              } else {
                if ((param2 ^ -1) > -1) {
                  break L0;
                } else {
                  var4 = -123 / ((param0 - 9) / 36);
                  var5 = param1 + param2 * ((rb) this).field_k;
                  return ((rb) this).field_m[var5];
                }
              }
            }
          }
        }
        return false;
    }

    final void a(int param0, int param1, int param2, je[][] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        L0: {
          var13 = MinerDisturbance.field_ab;
          if (((rb) this).field_a) {
            var5 = -1;
            break L0;
          } else {
            var5 = 1;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (((rb) this).field_a) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        ((rb) this).field_a = stackIn_6_1 != 0;
        var6 = hf.field_t * 4 + 64;
        var7 = param0 * 4 + 4;
        L2: while (true) {
          if (param2 * 4 > var7) {
            var7 = -92 % ((param1 - 54) / 39);
            var8 = param0 * 4 + 4;
            L3: while (true) {
              if (var8 < param2 * 4) {
                return;
              } else {
                if (var8 < var6) {
                  var9 = 123;
                  L4: while (true) {
                    if (var9 >= 0) {
                      L5: {
                        var10 = var8 * ((rb) this).field_k + var9;
                        if (((rb) this).field_b[var10]) {
                          L6: {
                            ((rb) this).field_i[var10] = 8;
                            var11 = var9 >> -1067481278;
                            var12 = var8 >> 811936930;
                            stackOut_66_0 = 0;
                            stackIn_68_0 = stackOut_66_0;
                            stackIn_67_0 = stackOut_66_0;
                            if (param3[var11][var12].field_a) {
                              stackOut_68_0 = stackIn_68_0;
                              stackOut_68_1 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              stackIn_69_1 = stackOut_68_1;
                              break L6;
                            } else {
                              stackOut_67_0 = stackIn_67_0;
                              stackOut_67_1 = 1;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              break L6;
                            }
                          }
                          L7: {
                            if (stackIn_69_0 != stackIn_69_1) {
                              break L7;
                            } else {
                              L8: {
                                if (0 >= param3[var11][var12].field_q) {
                                  break L8;
                                } else {
                                  param3[var11][var12].field_q = param3[var11][var12].field_q - 1;
                                  break L8;
                                }
                              }
                              if ((param3[var11][var12].field_q ^ -1) >= -193) {
                                break L7;
                              } else {
                                param3[var11][var12].field_q = param3[var11][var12].field_q - 128;
                                if (15.0 <= Math.random() * 100.0) {
                                  break L7;
                                } else {
                                  ((rb) this).field_b[var10] = false;
                                  break L7;
                                }
                              }
                            }
                          }
                          if (!((rb) this).field_b[var10]) {
                            break L5;
                          } else {
                            L9: {
                              if (((rb) this).field_b[var10 + ((rb) this).field_k]) {
                                break L9;
                              } else {
                                if (je.i(var9, var8 - -1)) {
                                  break L9;
                                } else {
                                  ((rb) this).field_b[var10] = false;
                                  ((rb) this).field_b[((rb) this).field_k + var10] = true;
                                  break L5;
                                }
                              }
                            }
                            L10: {
                              if (((rb) this).field_b[var10 - -var5]) {
                                break L10;
                              } else {
                                if (je.i(var9 + var5, var8)) {
                                  break L10;
                                } else {
                                  ((rb) this).field_b[var10] = false;
                                  ((rb) this).field_b[var5 + var10] = true;
                                  break L5;
                                }
                              }
                            }
                            if (((rb) this).field_b[var10 + -var5]) {
                              break L5;
                            } else {
                              if (!je.i(var9 + -var5, var8)) {
                                ((rb) this).field_b[var10] = false;
                                ((rb) this).field_b[var10 + -var5] = true;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      if (((rb) this).field_m[var10]) {
                        L11: {
                          ((rb) this).field_p[var10] = 64;
                          if (((rb) this).field_m[-((rb) this).field_k + var10]) {
                            break L11;
                          } else {
                            if (je.i(var9, var8 + -1)) {
                              break L11;
                            } else {
                              if (!oe.field_b) {
                                ((rb) this).field_m[var10] = false;
                                ((rb) this).field_m[var10 - ((rb) this).field_k] = true;
                                var9--;
                                continue L4;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        if (!((rb) this).field_m[var10 + var5]) {
                          if (!je.i(var9 + var5, var8)) {
                            ((rb) this).field_m[var10] = false;
                            ((rb) this).field_m[var10 - -var5] = true;
                            var9--;
                            continue L4;
                          } else {
                            if (!((rb) this).i(123, var9 - var5, var8)) {
                              if (!je.i(-var5 + var9, var8)) {
                                ((rb) this).field_m[var10] = false;
                                ((rb) this).field_m[-var5 + var10] = true;
                                var9--;
                                continue L4;
                              } else {
                                var9--;
                                continue L4;
                              }
                            } else {
                              var9--;
                              continue L4;
                            }
                          }
                        } else {
                          if (!((rb) this).i(123, var9 - var5, var8)) {
                            if (!je.i(-var5 + var9, var8)) {
                              ((rb) this).field_m[var10] = false;
                              ((rb) this).field_m[-var5 + var10] = true;
                              var9--;
                              continue L4;
                            } else {
                              var9--;
                              continue L4;
                            }
                          } else {
                            var9--;
                            continue L4;
                          }
                        }
                      } else {
                        var9--;
                        continue L4;
                      }
                    } else {
                      var8--;
                      continue L3;
                    }
                  }
                } else {
                  var8--;
                  continue L3;
                }
              }
            }
          } else {
            if (var7 < var6) {
              var8 = 0;
              L12: while (true) {
                if (124 >= var8) {
                  L13: {
                    var9 = var8 + ((rb) this).field_k * var7;
                    if (((rb) this).field_b[var9]) {
                      L14: {
                        if (je.i(var8, var7)) {
                          if (!((rb) this).field_b[var9 + -((rb) this).field_k]) {
                            ((rb) this).field_b[var9 - ((rb) this).field_k] = true;
                            ((rb) this).field_b[var9] = false;
                            break L14;
                          } else {
                            break L14;
                          }
                        } else {
                          L15: {
                            if (((rb) this).field_b[var9 + ((rb) this).field_k]) {
                              break L15;
                            } else {
                              if (!je.i(var8, var7 - -1)) {
                                ((rb) this).field_b[var9] = false;
                                ((rb) this).field_b[((rb) this).field_k + var9] = true;
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            var10 = ((rb) this).field_b[var5 + var9] ? 1 : 0;
                            var11 = ((rb) this).field_b[var9 - var5] ? 1 : 0;
                            if (var10 != 0) {
                              break L16;
                            } else {
                              if (!je.i(var5 + var8, var7)) {
                                ((rb) this).field_b[var9] = false;
                                ((rb) this).field_b[var9 - -var5] = true;
                                break L14;
                              } else {
                                break L16;
                              }
                            }
                          }
                          if (var11 != 0) {
                            break L14;
                          } else {
                            if (!je.i(var8 + -var5, var7)) {
                              ((rb) this).field_b[var9] = false;
                              ((rb) this).field_b[var9 + -var5] = true;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      ((rb) this).field_i[var9] = 8;
                      break L13;
                    } else {
                      L17: {
                        if (-1 <= ((rb) this).field_i[var9]) {
                          break L17;
                        } else {
                          ((rb) this).field_i[var9] = ((rb) this).field_i[var9] - 1;
                          break L17;
                        }
                      }
                      if (-1 < ((rb) this).field_p[var9]) {
                        ((rb) this).field_p[var9] = ((rb) this).field_p[var9] - 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (((rb) this).field_m[var9]) {
                    if (-31 <= (var7 ^ -1)) {
                      ((rb) this).field_m[var9] = false;
                      var8++;
                      continue L12;
                    } else {
                      L18: {
                        ((rb) this).field_p[var9] = 64;
                        if (((rb) this).field_m[-((rb) this).field_k + var9]) {
                          break L18;
                        } else {
                          if (((rb) this).field_b[-((rb) this).field_k + var9]) {
                            break L18;
                          } else {
                            if (je.i(var8, var7 - 1)) {
                              break L18;
                            } else {
                              ((rb) this).field_m[var9] = false;
                              ((rb) this).field_m[var9 - ((rb) this).field_k] = true;
                              var8++;
                              continue L12;
                            }
                          }
                        }
                      }
                      L19: {
                        if (((rb) this).field_m[var9 - -var5]) {
                          break L19;
                        } else {
                          if (((rb) this).field_b[var9 - -var5]) {
                            break L19;
                          } else {
                            if (!je.i(var5 + var8, var7)) {
                              ((rb) this).field_m[var9] = false;
                              ((rb) this).field_m[var9 - -var5] = true;
                              var8++;
                              continue L12;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      if (!((rb) this).field_m[var9 - var5]) {
                        if (!((rb) this).field_b[var9 + -var5]) {
                          if (!je.i(-var5 + var8, var7)) {
                            ((rb) this).field_m[var9] = false;
                            ((rb) this).field_m[-var5 + var9] = true;
                            var8++;
                            continue L12;
                          } else {
                            var8++;
                            continue L12;
                          }
                        } else {
                          var8++;
                          continue L12;
                        }
                      } else {
                        var8++;
                        continue L12;
                      }
                    }
                  } else {
                    var8++;
                    continue L12;
                  }
                } else {
                  var7--;
                  continue L2;
                }
              }
            } else {
              var7--;
              continue L2;
            }
          }
        }
    }

    final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param1 = param1 * 4;
        param0 = param0 * 4;
        int var4 = param1 + param0 * ((rb) this).field_k;
        int var5 = ((rb) this).field_k + -4;
        if (param2 != -5) {
            return;
        }
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; -5 < (var7 ^ -1); var7++) {
                int incrementValue$0 = var4;
                var4++;
                ((rb) this).field_g[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void b(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param2 = param2 * 4;
        param1 = param1 * 4;
        int var4 = param1 - -(((rb) this).field_k * param2);
        int var5 = -4 + ((rb) this).field_k;
        for (var6 = 0; 4 > var6; var6++) {
            for (var7 = 0; (var7 ^ -1) > -5; var7++) {
                int incrementValue$0 = var4;
                var4++;
                ((rb) this).field_b[incrementValue$0] = false;
            }
            var4 = var4 + var5;
        }
        if (param0 <= 115) {
            ((rb) this).field_k = 87;
        }
    }

    final void c(int param0, int param1, byte param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param1 = param1 * 4;
        if (param2 != -48) {
            ((rb) this).field_p = null;
        }
        int var4 = ((rb) this).field_k * param0 + param1;
        int var5 = ((rb) this).field_k + -4;
        for (var6 = 0; (var6 ^ -1) > -5; var6++) {
            for (var7 = 0; var7 < 4; var7++) {
                int incrementValue$0 = var4;
                var4++;
                ((rb) this).field_m[incrementValue$0] = true;
            }
            var4 = var4 + var5;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        param0 = param0 * 4;
        param2 = param2 * 4;
        int var4 = ((rb) this).field_k * param2 + param0;
        int var5 = ((rb) this).field_k + param1;
        for (var6 = 0; -5 < (var6 ^ -1); var6++) {
            for (var7 = 0; (var7 ^ -1) > -5; var7++) {
                ((rb) this).field_m[var4] = false;
                ((rb) this).field_p[var4] = 0;
            }
            var4 = var4 + var5;
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != 61) {
            return true;
        }
        int var4 = ((rb) this).field_k * param1 + param0;
        return ((rb) this).field_g[var4];
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param3 + ((rb) this).field_k * param1;
        ((rb) this).field_p[var5] = param2;
        if (param0 >= -91) {
            field_l = null;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param1 < 71) {
            boolean discarded$0 = ((rb) this).f(109, -23, 126);
        }
        int var5 = ((rb) this).field_k * param2 + param0;
        ((rb) this).field_g[var5] = param3;
    }

    final void a(int param0, boolean param1, je[][] param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_87_0 = 0;
        Object stackIn_130_0 = null;
        Object stackIn_131_0 = null;
        Object stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        Object stackOut_129_0 = null;
        Object stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        Object stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var19 = MinerDisturbance.field_ab;
        int fieldTemp$1 = ((rb) this).field_n + 1;
        ((rb) this).field_n = ((rb) this).field_n + 1;
        if ((3 & fieldTemp$1) == 0) {
          if (param1) {
            L0: {
              if (((rb) this).field_o) {
                var5 = -1;
                break L0;
              } else {
                var5 = 1;
                break L0;
              }
            }
            var6 = 64 + hf.field_t * 4;
            var7_int = 4 + 4 * param0;
            L1: while (true) {
              if (param3 * 4 > var7_int) {
                var7 = new int[]{2147483647, 2147483647, 2147483647};
                var23 = new int[var7.length];
                var22 = var23;
                var21 = var22;
                var20 = var21;
                var8 = var20;
                var9 = 4 * param0 + 4;
                L2: while (true) {
                  if ((var9 ^ -1) > (param3 * 4 ^ -1)) {
                    L3: {
                      if (-1 == (((rb) this).field_n & 15 ^ -1)) {
                        L4: {
                          stackOut_129_0 = this;
                          stackIn_131_0 = stackOut_129_0;
                          stackIn_130_0 = stackOut_129_0;
                          if (((rb) this).field_o) {
                            stackOut_131_0 = this;
                            stackOut_131_1 = 0;
                            stackIn_132_0 = stackOut_131_0;
                            stackIn_132_1 = stackOut_131_1;
                            break L4;
                          } else {
                            stackOut_130_0 = this;
                            stackOut_130_1 = 1;
                            stackIn_132_0 = stackOut_130_0;
                            stackIn_132_1 = stackOut_130_1;
                            break L4;
                          }
                        }
                        ((rb) this).field_o = stackIn_132_1 != 0;
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;
                        var12 = 0;
                        L5: while (true) {
                          if ((var7.length ^ -1) >= (var12 ^ -1)) {
                            if (0 >= var9) {
                              break L3;
                            } else {
                              L6: {
                                var11 = var11 / var9;
                                var10 = var10 / var9;
                                if (var10 < 1) {
                                  var10 = 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              L7: {
                                var12 = 80 * oc.field_f / (int)Math.sqrt((double)var10);
                                if ((var12 ^ -1) < (oc.field_f ^ -1)) {
                                  var12 = oc.field_f;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                var13 = 10;
                                var14 = (var11 >> 589201954) + -ca.field_k;
                                if (var14 >= -var13) {
                                  break L8;
                                } else {
                                  var14 = -var13;
                                  break L8;
                                }
                              }
                              L9: {
                                if ((var14 ^ -1) >= (var13 ^ -1)) {
                                  break L9;
                                } else {
                                  var14 = var13;
                                  break L9;
                                }
                              }
                              L10: {
                                var15 = 128 + 128 * var14 / var13;
                                if ((var15 ^ -1) <= -1) {
                                  if (-256 <= (var15 ^ -1)) {
                                    break L10;
                                  } else {
                                    var15 = 255;
                                    break L10;
                                  }
                                } else {
                                  var15 = 0;
                                  break L10;
                                }
                              }
                              od.a(var15, 46, var12, 4);
                              break L3;
                            }
                          } else {
                            L11: {
                              if (2147483647 != var7[var12]) {
                                var9++;
                                var11 = var11 + var23[var12];
                                var10 = var10 + var7[var12];
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var12++;
                            continue L5;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L12: {
                      if (var6 > var9) {
                        L13: {
                          if (!((rb) this).field_o) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L13;
                          } else {
                            stackOut_52_0 = 124;
                            stackIn_54_0 = stackOut_52_0;
                            break L13;
                          }
                        }
                        L14: {
                          var10 = stackIn_54_0;
                          if (((rb) this).field_o) {
                            stackOut_56_0 = -1;
                            stackIn_57_0 = stackOut_56_0;
                            break L14;
                          } else {
                            stackOut_55_0 = 125;
                            stackIn_57_0 = stackOut_55_0;
                            break L14;
                          }
                        }
                        var11 = stackIn_57_0;
                        var12 = var10;
                        L15: while (true) {
                          if ((var12 ^ -1) == (var11 ^ -1)) {
                            break L12;
                          } else {
                            L16: {
                              var13 = var12 + ((rb) this).field_k * var9;
                              if (!((rb) this).field_g[var13]) {
                                ((rb) this).field_d[var13] = false;
                                break L16;
                              } else {
                                L17: {
                                  L18: {
                                    if (((rb) this).field_g[var13 + ((rb) this).field_k]) {
                                      break L18;
                                    } else {
                                      if (((rb) this).field_g[-((rb) this).field_k + var13]) {
                                        break L18;
                                      } else {
                                        if (!je.e(var12, var9 + 1)) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((rb) this).field_g[var13 - -var5]) {
                                      break L19;
                                    } else {
                                      if (je.e(var5 + var12, var9)) {
                                        break L19;
                                      } else {
                                        ((rb) this).field_g[var13] = false;
                                        ((rb) this).field_g[var13 + var5] = true;
                                        break L17;
                                      }
                                    }
                                  }
                                  if (((rb) this).field_g[var13 - var5]) {
                                    break L17;
                                  } else {
                                    if (je.e(-var5 + var12, var9)) {
                                      break L17;
                                    } else {
                                      ((rb) this).field_g[var13] = false;
                                      ((rb) this).field_g[var13 + -var5] = true;
                                      break L17;
                                    }
                                  }
                                }
                                if (!((rb) this).field_d[var13]) {
                                  break L16;
                                } else {
                                  if (!((rb) this).field_b[var13]) {
                                    var14 = ca.field_k - (var12 >> 1580302338);
                                    var15 = -(var9 >> 1508088226) + hf.field_t;
                                    var16 = var14 * var14 + var15 * var15;
                                    var17 = 0;
                                    L20: while (true) {
                                      L21: {
                                        if ((var17 ^ -1) <= (var7.length ^ -1)) {
                                          break L21;
                                        } else {
                                          if (var7[var17] != var16) {
                                            var23 = var22;
                                            if ((var7[var17] ^ -1) >= (var16 ^ -1)) {
                                              var17++;
                                              continue L20;
                                            } else {
                                              var7[var17] = var16;
                                              var23[var17] = var12;
                                              break L21;
                                            }
                                          } else {
                                            var8[var17] = (var23[var17] + var12) / 2;
                                            break L21;
                                          }
                                        }
                                      }
                                      L22: {
                                        if (oe.field_b) {
                                          break L22;
                                        } else {
                                          if (((rb) this).field_m[var13]) {
                                            ((rb) this).a(var12 >> -1234786334, -4, var9 >> 2055624866);
                                            uf.field_p[jf.b((byte) 56)] = new gf(var12 >> -1776438366, var9 >> -847813662, 16);
                                            break L22;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      L23: {
                                        if ((15 & (((rb) this).field_n >> -1691772222) + var13 ^ -1) != -1) {
                                          stackOut_86_0 = 0;
                                          stackIn_87_0 = stackOut_86_0;
                                          break L23;
                                        } else {
                                          stackOut_85_0 = 1;
                                          stackIn_87_0 = stackOut_85_0;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        var17 = stackIn_87_0;
                                        if (var17 == 0) {
                                          break L24;
                                        } else {
                                          L25: {
                                            var18 = 0;
                                            if (((rb) this).field_g[var13]) {
                                              var18 = 1;
                                              ((rb) this).field_g[var13] = false;
                                              break L25;
                                            } else {
                                              if (!((rb) this).field_g[var13 - -var5]) {
                                                if (((rb) this).field_g[-var5 + var13]) {
                                                  ((rb) this).field_g[-var5 + var13] = false;
                                                  var18 = 1;
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              } else {
                                                ((rb) this).field_g[var5 + var13] = false;
                                                var18 = 1;
                                                break L25;
                                              }
                                            }
                                          }
                                          if (var18 == 0) {
                                            break L24;
                                          } else {
                                            pi.field_a = pi.field_a + 1;
                                            if (2800 <= pi.field_a) {
                                              fn.a(26, 229, 3);
                                              break L24;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                      L26: {
                                        if (((rb) this).field_d[-1 + var13]) {
                                          break L26;
                                        } else {
                                          if (((rb) this).field_g[-1 + var13]) {
                                            ((rb) this).field_d[-1 + var13] = true;
                                            break L26;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      L27: {
                                        if (((rb) this).field_d[var13 - -1]) {
                                          break L27;
                                        } else {
                                          if (((rb) this).field_g[var13 + 1]) {
                                            ((rb) this).field_d[1 + var13] = true;
                                            break L27;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      L28: {
                                        if (((rb) this).field_d[-((rb) this).field_k + (var13 - 1)]) {
                                          break L28;
                                        } else {
                                          if (!((rb) this).field_g[var13 + -((rb) this).field_k - 1]) {
                                            break L28;
                                          } else {
                                            ((rb) this).field_d[-1 + -((rb) this).field_k + var13] = true;
                                            break L28;
                                          }
                                        }
                                      }
                                      L29: {
                                        if (((rb) this).field_d[-((rb) this).field_k + (var13 - -1)]) {
                                          break L29;
                                        } else {
                                          if (!((rb) this).field_g[-((rb) this).field_k + (var13 - -1)]) {
                                            break L29;
                                          } else {
                                            ((rb) this).field_d[1 + -((rb) this).field_k + var13] = true;
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((rb) this).field_g[var13]) {
                                          break L30;
                                        } else {
                                          L31: {
                                            ((rb) this).field_d[var13] = false;
                                            if (((rb) this).field_g[var13 - -((rb) this).field_k]) {
                                              break L31;
                                            } else {
                                              ((rb) this).field_d[((rb) this).field_k + var13] = true;
                                              break L31;
                                            }
                                          }
                                          L32: {
                                            if (((rb) this).field_g[var13 - -1]) {
                                              break L32;
                                            } else {
                                              if (!((rb) this).field_g[((rb) this).field_k + 1 + var13]) {
                                                break L32;
                                              } else {
                                                ((rb) this).field_d[((rb) this).field_k + 1 + var13] = true;
                                                break L32;
                                              }
                                            }
                                          }
                                          if (((rb) this).field_g[var13 + -1]) {
                                            break L30;
                                          } else {
                                            if (((rb) this).field_g[-1 + var13 + ((rb) this).field_k]) {
                                              ((rb) this).field_d[var13 + (-1 - -((rb) this).field_k)] = true;
                                              break L30;
                                            } else {
                                              var12 = var12 + var5;
                                              continue L15;
                                            }
                                          }
                                        }
                                      }
                                      break L16;
                                    }
                                  } else {
                                    ((rb) this).field_d[var13] = false;
                                    break L16;
                                  }
                                }
                              }
                            }
                            var12 = var12 + var5;
                            continue L15;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    var9--;
                    continue L2;
                  }
                }
              } else {
                L33: {
                  if ((var6 ^ -1) >= (var7_int ^ -1)) {
                    break L33;
                  } else {
                    L34: {
                      if (!((rb) this).field_o) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L34;
                      } else {
                        stackOut_11_0 = 124;
                        stackIn_13_0 = stackOut_11_0;
                        break L34;
                      }
                    }
                    L35: {
                      var8_int = stackIn_13_0;
                      if (!((rb) this).field_o) {
                        stackOut_15_0 = 125;
                        stackIn_16_0 = stackOut_15_0;
                        break L35;
                      } else {
                        stackOut_14_0 = -1;
                        stackIn_16_0 = stackOut_14_0;
                        break L35;
                      }
                    }
                    var9 = stackIn_16_0;
                    var10 = var8_int;
                    L36: while (true) {
                      if ((var10 ^ -1) == (var9 ^ -1)) {
                        break L33;
                      } else {
                        L37: {
                          var11 = var10 + ((rb) this).field_k * var7_int;
                          if (!((rb) this).field_g[var11]) {
                            break L37;
                          } else {
                            L38: {
                              if (!((rb) this).field_m[var11]) {
                                break L38;
                              } else {
                                if (!((rb) this).field_d[var11]) {
                                  ((rb) this).field_m[var11] = false;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            L39: {
                              if (((rb) this).field_g[-((rb) this).field_k + var11]) {
                                break L39;
                              } else {
                                if (!je.e(var10, 1 + var7_int)) {
                                  break L39;
                                } else {
                                  ((rb) this).field_g[var11] = false;
                                  ((rb) this).field_g[var11 + -((rb) this).field_k] = true;
                                  break L37;
                                }
                              }
                            }
                            L40: {
                              if (((rb) this).field_g[var11 - ((rb) this).field_k]) {
                                break L40;
                              } else {
                                if (!((rb) this).field_b[var11]) {
                                  break L40;
                                } else {
                                  ((rb) this).field_g[var11] = false;
                                  ((rb) this).field_g[-((rb) this).field_k + var11] = true;
                                  break L37;
                                }
                              }
                            }
                            L41: {
                              if (((rb) this).field_g[((rb) this).field_k + var11]) {
                                break L41;
                              } else {
                                if (((rb) this).field_b[((rb) this).field_k + var11]) {
                                  break L41;
                                } else {
                                  if (!je.e(var10, var7_int + 1)) {
                                    ((rb) this).field_g[var11] = false;
                                    ((rb) this).field_g[var11 + ((rb) this).field_k] = true;
                                    break L37;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                            L42: {
                              if (((rb) this).field_g[((rb) this).field_k + var11]) {
                                break L42;
                              } else {
                                if (((rb) this).field_g[-((rb) this).field_k + var11]) {
                                  break L42;
                                } else {
                                  if (je.e(var10, var7_int + 1)) {
                                    break L42;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                            }
                            L43: {
                              if (((rb) this).field_g[var5 + var11]) {
                                break L43;
                              } else {
                                if (!je.e(var5 + var10, var7_int)) {
                                  ((rb) this).field_g[var11] = false;
                                  ((rb) this).field_g[var11 + var5] = true;
                                  break L37;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            if (((rb) this).field_g[var11 - var5]) {
                              break L37;
                            } else {
                              if (je.e(var10 - var5, var7_int)) {
                                break L37;
                              } else {
                                ((rb) this).field_g[var11] = false;
                                ((rb) this).field_g[-var5 + var11] = true;
                                break L37;
                              }
                            }
                          }
                        }
                        var10 = var10 + var5;
                        continue L36;
                      }
                    }
                  }
                }
                var7_int--;
                continue L1;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, je[][] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = MinerDisturbance.field_ab;
        if (vi.field_h) {
          return;
        } else {
          if (!wm.field_e) {
            var10 = param2 * 4;
            L0: while (true) {
              if (var10 > 4 + 4 * param0) {
                L1: {
                  if (param4 == 17761) {
                    break L1;
                  } else {
                    rb.a(-117);
                    break L1;
                  }
                }
                var10 = jb.field_o[cm.field_o];
                var11 = sk.field_b[cm.field_o];
                var12 = param2 * 4;
                L2: while (true) {
                  if (var12 > 4 + 4 * param0) {
                    var12 = 4 * param2;
                    L3: while (true) {
                      if (4 * param0 + 4 < var12) {
                        return;
                      } else {
                        var13 = param3 * 4;
                        L4: while (true) {
                          if (var13 < 4 * param1 + 4) {
                            var12++;
                            continue L3;
                          } else {
                            var7 = -li.field_c + 8 * var12;
                            var8 = -db.field_d + var13 * 8;
                            if (-64 < var7) {
                              if (-64 < var8) {
                                if (var7 < 704) {
                                  if (544 > var8) {
                                    var14 = var13 * ((rb) this).field_k + var12;
                                    if (((rb) this).field_g[var14]) {
                                      var15 = 0;
                                      if (((rb) this).field_d[var14]) {
                                        if (!((rb) this).field_g[var14 - ((rb) this).field_k]) {
                                          L5: {
                                            var16 = 8;
                                            eh.f(ll.a((byte) -73, 8) + var7, -var15 + (var8 - ll.a((byte) -73, 4)), 4, 16711680, 110);
                                            if (8 < var16 + (8 - var15)) {
                                              var16 = -var15 + 8;
                                              break L5;
                                            } else {
                                              break L5;
                                            }
                                          }
                                          eh.a(var7 + ll.a((byte) -73, 8) << -253735772, -ll.a((byte) -73, 4) + var8 - (var15 + -1) << -1599481916, 64, 4, re.field_c);
                                          eh.a(var7 - -ll.a((byte) -73, 8) << 534001988, -var15 + var8 + (-ll.a((byte) -73, 4) + 1) << 435033956, 64, 4, re.field_c);
                                          eh.a(var7 + ll.a((byte) -73, 8) << 1384996580, 1 + (-ll.a((byte) -73, 6) + (var8 + -var15)) << -391524380, 80, 5, re.field_c);
                                          eh.a(var7 + ll.a((byte) -73, 8) << -816472796, 1 + var8 - var15 + -ll.a((byte) -73, 6) << -1073720860, 80, 5, re.field_c);
                                          var13--;
                                          continue L4;
                                        } else {
                                          var13--;
                                          continue L4;
                                        }
                                      } else {
                                        var13--;
                                        continue L4;
                                      }
                                    } else {
                                      var13--;
                                      continue L4;
                                    }
                                  } else {
                                    var13--;
                                    continue L4;
                                  }
                                } else {
                                  var13--;
                                  continue L4;
                                }
                              } else {
                                var13--;
                                continue L4;
                              }
                            } else {
                              var13--;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var13 = param3 * 4;
                    L6: while (true) {
                      if (var13 < 4 * param1 - -4) {
                        var12++;
                        continue L2;
                      } else {
                        var7 = -li.field_c + var12 * 8;
                        var8 = -db.field_d + var13 * 8;
                        if (-64 < var7) {
                          if (var8 < 63) {
                            if (var7 < 704) {
                              if (-545 > var8) {
                                if (param5[var12 >> -773432030][var13 >> -684892094].field_V) {
                                  var14 = var12 + var13 * ((rb) this).field_k;
                                  if (((rb) this).field_c[var14] <= 0) {
                                    L7: {
                                      L8: {
                                        var15 = var11;
                                        if (param5[var12 >> 1572220450][var13 >> 433731906].field_A) {
                                          break L8;
                                        } else {
                                          if (param5[var12 - 1 >> -967870][var13 >> -1695357182].field_A) {
                                            break L8;
                                          } else {
                                            if (param5[var12 - -1 >> -739360958][var13 >> 1177148642].field_A) {
                                              break L8;
                                            } else {
                                              if (param5[var12 >> 1147550626][var13 + -1 >> -500111678].field_A) {
                                                break L8;
                                              } else {
                                                if (param5[var12 >> 612754466][1 + var13 >> -793923006].field_A) {
                                                  break L8;
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var15 = -2004317953;
                                      break L7;
                                    }
                                    if (!((rb) this).field_b[var14]) {
                                      if (((rb) this).field_b[var14 - -((rb) this).field_k]) {
                                        var16 = ((rb) this).field_i[var14];
                                        var17 = (((rb) this).field_i[-1 + var14] + (var16 + ((rb) this).field_i[1 + var14])) / 3;
                                        eh.b(var7, -var17 + var8 + 8, 8, var17, var15, var10);
                                        var13--;
                                        continue L6;
                                      } else {
                                        if ((((rb) this).field_p[var14] ^ -1) < -17) {
                                          var16 = ((rb) this).field_p[var14 - -((rb) this).field_k] + ((rb) this).field_p[-((rb) this).field_k + var14] + (((rb) this).field_p[var14 - 1] + ((rb) this).field_p[var14]) >> 144727010;
                                          eh.b(var7, var8, 8, 8, 65280, var16);
                                          var13--;
                                          continue L6;
                                        } else {
                                          var13--;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      eh.b(var7, var8, 8, 8, var15, var10);
                                      var13--;
                                      continue L6;
                                    }
                                  } else {
                                    L9: {
                                      var9 = ((rb) this).field_c[var14];
                                      var15 = 8930372;
                                      if (1 != var9) {
                                        break L9;
                                      } else {
                                        var15 = 8930372;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var9 != 2) {
                                        break L10;
                                      } else {
                                        var15 = 11158596;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (3 == var9) {
                                        var15 = 16729156;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (var9 != 4) {
                                        break L12;
                                      } else {
                                        var15 = 16746564;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (-6 != (var9 ^ -1)) {
                                        break L13;
                                      } else {
                                        var15 = 16755268;
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (6 == var9) {
                                        var15 = 16777028;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var9 != 7) {
                                        break L15;
                                      } else {
                                        var15 = 16777096;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      if ((var9 ^ -1) == -9) {
                                        var15 = 16777130;
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      if (9 <= var9) {
                                        var15 = 16777215;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    eh.b(var7 + -4, var8 - -4, 16, 16, var15, var10);
                                    var13--;
                                    continue L6;
                                  }
                                } else {
                                  var13--;
                                  continue L6;
                                }
                              } else {
                                var13--;
                                continue L6;
                              }
                            } else {
                              var13--;
                              continue L6;
                            }
                          } else {
                            var13--;
                            continue L6;
                          }
                        } else {
                          var13--;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                var11 = param3 * 4;
                L18: while (true) {
                  if (var11 < 4 + param1 * 4) {
                    var10++;
                    continue L0;
                  } else {
                    var7 = 8 * var10 - li.field_c;
                    var8 = 8 * var11 - db.field_d;
                    if (var7 < 63) {
                      if (var8 > -64) {
                        if (704 > var7) {
                          if (-545 > var8) {
                            if (param5[var10 >> 478278114][var11 >> -1612791742].field_V) {
                              var12 = var10 + ((rb) this).field_k * var11;
                              if (((rb) this).field_g[var12]) {
                                L19: {
                                  var13 = var8;
                                  var14 = 8;
                                  if (!param5[var10 >> -952388894][var11 - -1 >> 523724706].field_a) {
                                    break L19;
                                  } else {
                                    var14 = 12;
                                    break L19;
                                  }
                                }
                                L20: {
                                  var15 = 8;
                                  eh.e(var7, var13, var15, var14, 0);
                                  if (((rb) this).field_g[var12 - 1]) {
                                    break L20;
                                  } else {
                                    L21: {
                                      L22: {
                                        if (((rb) this).field_b[var12]) {
                                          break L22;
                                        } else {
                                          if (param5[var10 >> -1949908254][var11 + 1 >> 467518530].field_a) {
                                            break L21;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      if (((rb) this).field_g[((rb) this).field_k + var12]) {
                                        break L21;
                                      } else {
                                        eh.c(var7, var13 - -4, 3, 0);
                                        break L20;
                                      }
                                    }
                                    if (((rb) this).field_g[var12 - 1 - -((rb) this).field_k]) {
                                      eh.a(-8 + var7, var13 - 8, var7, var13 - -8);
                                      eh.c(var7, var13 - -8, 6, 0);
                                      eh.a();
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                L23: {
                                  if (!((rb) this).field_g[1 + var12]) {
                                    L24: {
                                      L25: {
                                        if (((rb) this).field_b[var12]) {
                                          break L25;
                                        } else {
                                          if (param5[var10 >> 1416387906][1 + var11 >> -857838814].field_a) {
                                            break L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      if (((rb) this).field_g[var12 + ((rb) this).field_k]) {
                                        break L24;
                                      } else {
                                        eh.c(var7 + 8, 4 + var13, 3, 0);
                                        break L23;
                                      }
                                    }
                                    if (((rb) this).field_g[((rb) this).field_k + (var12 - -1)]) {
                                      eh.a(8 + var7, var13 - 8, 16 + var7, var13 - -8);
                                      eh.c(8 + var7, var13 + 8, 6, 0);
                                      eh.a();
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  } else {
                                    break L23;
                                  }
                                }
                                var16 = var12 + -((rb) this).field_k;
                                if (!((rb) this).field_g[var16]) {
                                  if (!((rb) this).field_g[var16 + 1]) {
                                    if (!((rb) this).field_g[var16 - 1]) {
                                      eh.g(var7, var13, 8, 16777113, 200);
                                      eh.g(var7, 1 + var13, 9, 16777113, 128);
                                      eh.g(var7, var13 + 2, 10, 16777113, 64);
                                      var11--;
                                      continue L18;
                                    } else {
                                      var11--;
                                      continue L18;
                                    }
                                  } else {
                                    var11--;
                                    continue L18;
                                  }
                                } else {
                                  var11--;
                                  continue L18;
                                }
                              } else {
                                var11--;
                                continue L18;
                              }
                            } else {
                              var11--;
                              continue L18;
                            }
                          } else {
                            var11--;
                            continue L18;
                          }
                        } else {
                          var11--;
                          continue L18;
                        }
                      } else {
                        var11--;
                        continue L18;
                      }
                    } else {
                      var11--;
                      continue L18;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    rb(int param0, int param1) {
        int var3 = 0;
        ((rb) this).field_j = param1 * 4;
        ((rb) this).field_k = param0 * 4;
        ((rb) this).field_i = new int[((rb) this).field_j * ((rb) this).field_k];
        ((rb) this).field_g = new boolean[((rb) this).field_k * ((rb) this).field_j];
        ((rb) this).field_h = new int[((rb) this).field_k * ((rb) this).field_j];
        ((rb) this).field_b = new boolean[((rb) this).field_j * ((rb) this).field_k];
        ((rb) this).field_m = new boolean[((rb) this).field_j * ((rb) this).field_k];
        ((rb) this).field_p = new int[((rb) this).field_j * ((rb) this).field_k];
        ((rb) this).field_c = new int[((rb) this).field_j * ((rb) this).field_k];
        ((rb) this).field_d = new boolean[((rb) this).field_j * ((rb) this).field_k];
        for (var3 = 0; var3 < ((rb) this).field_j * ((rb) this).field_k; var3++) {
            ((rb) this).field_h[var3] = ll.a((byte) -73, 15);
        }
        ((rb) this).field_n = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password is part of your Player Name, and would be easy to guess";
        field_l = new int[25];
    }
}
