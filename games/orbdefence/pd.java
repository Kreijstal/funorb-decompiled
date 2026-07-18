/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends ca {
    int field_z;
    private int field_A;
    int field_B;
    private int field_g;
    int field_f;
    int field_h;
    double field_v;
    static li field_w;
    private int field_j;
    private int field_x;
    int field_l;
    int field_y;
    int field_m;
    static int field_C;
    int field_i;
    int field_o;
    private int field_k;
    static ki field_r;
    int field_E;
    private int field_q;
    int field_t;
    int field_u;
    private f field_s;
    kb field_p;
    boolean field_n;

    public static void a(byte param0) {
        field_r = null;
        field_w = null;
        if (param0 != -19) {
            pd.a((byte) -62);
        }
    }

    final void a(int param0, byte param1, int param2) {
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
        hj var13_ref_hj = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        hj var28 = null;
        hj var29 = null;
        hj var30 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var27 = OrbDefence.field_D ? 1 : 0;
          var4 = 320 + -param0 + ol.field_e * ((pd) this).field_u;
          var5 = 240 + (-param2 + ((pd) this).field_z * ol.field_e);
          ((pd) this).field_v = 320.0 / (double)(Math.abs(-320 + var4) - -320);
          var6 = he.field_u[((pd) this).field_y] + qh.field_c[((pd) this).field_s.field_f.field_o[((pd) this).field_t]];
          if (0 >= var6) {
            break L0;
          } else {
            if (((pd) this).field_k != 0) {
              if (1 == ((pd) this).field_k) {
                var4 = var4 + ((pd) this).field_g * ol.field_e / var6;
                break L0;
              } else {
                if (((pd) this).field_k == 2) {
                  var5 = var5 - ol.field_e * ((pd) this).field_g / var6;
                  break L0;
                } else {
                  if (3 != ((pd) this).field_k) {
                    break L0;
                  } else {
                    var4 = var4 - ol.field_e * ((pd) this).field_g / var6;
                    break L0;
                  }
                }
              }
            } else {
              var5 = var5 + ol.field_e * ((pd) this).field_g / var6;
              break L0;
            }
          }
        }
        L1: {
          if (((pd) this).field_h <= 0) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!((pd) this).field_n) {
            break L2;
          } else {
            break L2;
          }
        }
        if (12 != ((pd) this).field_y) {
          L3: {
            if (1 == ((pd) this).field_y) {
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (((pd) this).field_n) {
              stackOut_16_0 = 1400;
              stackIn_17_0 = stackOut_16_0;
              break L4;
            } else {
              stackOut_15_0 = 700;
              stackIn_17_0 = stackOut_15_0;
              break L4;
            }
          }
          L5: {
            var7 = stackIn_17_0;
            if (3 != ((pd) this).field_y) {
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (2 == ((pd) this).field_y) {
              var7 += 200;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (5 == ((pd) this).field_y) {
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (4 != ((pd) this).field_y) {
              break L8;
            } else {
              var7 += 400;
              break L8;
            }
          }
          L9: {
            if (6 == ((pd) this).field_y) {
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (((pd) this).field_y != 7) {
              break L10;
            } else {
              var7 += 200;
              break L10;
            }
          }
          L11: {
            if (((pd) this).field_y == 9) {
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (((pd) this).field_y == 8) {
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (((pd) this).field_y == 10) {
              var7 += 400;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (11 != ((pd) this).field_y) {
              break L14;
            } else {
              var7 += 100;
              break L14;
            }
          }
          L15: {
            var8 = mg.a(((pd) this).field_y, (byte) -86);
            var9 = wh.field_a[var8];
            var10 = 12 * var8;
            var11 = var10 + ((pd) this).field_A / 2 % var9;
            var5 = var5 - (-2 + ab.field_g[var10].field_k / 2 * var7 / 4096);
            if (((pd) this).field_i <= 0) {
              L16: {
                if (-10 != ((pd) this).field_y) {
                  break L16;
                } else {
                  if (-1 != ((pd) this).field_E) {
                    break L16;
                  } else {
                    if (!((pd) this).field_n) {
                      var12 = ab.field_g[var11].field_o * var7 >> 12;
                      var13 = var7 * ab.field_g[var11].field_k >> 12;
                      ab.field_g[var11].d(-(var12 >> 1) + var4, -(var13 >> 1) + var5, var12, var13, 100);
                      break L15;
                    } else {
                      var30 = ab.field_g[var11];
                      var13_ref_hj = new hj(var30.field_o, var30.field_k);
                      var16 = 0;
                      var22 = -(var13_ref_hj.field_o * var7 >> 13) + var4;
                      var15 = -var13_ref_hj.field_k >> 1;
                      var23 = -(var7 * var13_ref_hj.field_k >> 13) + var5;
                      var24 = 0;
                      L17: while (true) {
                        if (var13_ref_hj.field_k <= var24) {
                          var13_ref_hj.a(var4, var5, 0, var7);
                          break L15;
                        } else {
                          var14 = -var13_ref_hj.field_o >> 1;
                          var25 = 0;
                          L18: while (true) {
                            if (var25 >= var13_ref_hj.field_o) {
                              var15++;
                              var24++;
                              continue L17;
                            } else {
                              if (var30.field_v[var16] != 0) {
                                var17 = ((var25 - -var14) * var7 >> 12) + var22;
                                var18 = var23 + (var7 * (var15 + var24) >> 12);
                                if (var17 <= -1) {
                                  if (ul.field_f > var17) {
                                    if (-1 <= var18) {
                                      if (ul.field_l > var18) {
                                        var21 = (255 & var30.field_v[var16]) >> 2;
                                        var19 = (16711680 & var30.field_v[var16]) >> 18;
                                        var20 = (65280 & var30.field_v[var16]) >> 10;
                                        var26 = ul.field_b[ul.field_f * var18 - -var17];
                                        var21 = var21 + ((var26 & 255) >> 1);
                                        var20 = var20 + (var26 >> 9 & 127);
                                        var19 = var19 + (127 & var26 >> 17);
                                        var13_ref_hj.field_v[var16] = var21 + ((var19 << 16) - -(var20 << 8));
                                        var16++;
                                        var14++;
                                        var25++;
                                        continue L18;
                                      } else {
                                        var25++;
                                        continue L18;
                                      }
                                    } else {
                                      var25++;
                                      continue L18;
                                    }
                                  } else {
                                    var25++;
                                    continue L18;
                                  }
                                } else {
                                  var25++;
                                  continue L18;
                                }
                              } else {
                                var16++;
                                var14++;
                                var25++;
                                continue L18;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              ab.field_g[var11].a(var4, var5, 0, var7);
              break L15;
            } else {
              var28 = ab.field_g[var11].f();
              var29 = var28;
              var13 = 0;
              L19: while (true) {
                if (var13 >= var29.field_v.length) {
                  var29.a(var4, var5, 0, var7);
                  break L15;
                } else {
                  var29.field_v[var13] = ((vi.a(65280, var28.field_v[var13]) >> 8) + (vi.a(16711680, var28.field_v[var13]) >> 16)) / 8 * 65793 + vi.a(255, var28.field_v[var13]) / 2 * 257;
                  var13++;
                  continue L19;
                }
              }
            }
          }
          L20: {
            if (((pd) this).field_f <= 0) {
              break L20;
            } else {
              var12 = var7 * ab.field_g[var11].field_o >> 12;
              var13 = ab.field_g[var11].field_k * var7 >> 12;
              var14 = ((pd) this).field_s.field_i % 9000;
              var15 = var4 - (var12 >> 1) + (((pd) this).field_u * ((pd) this).field_u + var14) % var12;
              var16 = -(var13 >> 1) - -var5 + (((pd) this).field_z * ((pd) this).field_u + var14) % var13;
              var17 = var14 * var14 % var12 - ((var12 >> 1) + -var4);
              var18 = var5 + -(var13 >> 1) + var14 * var14 % var13;
              ul.f(var15, var16, var17, var18, 16777215, 200);
              break L20;
            }
          }
          L21: {
            if (param1 > 73) {
              break L21;
            } else {
              ((pd) this).a(68, (byte) 10, -119);
              break L21;
            }
          }
          return;
        } else {
          ul.a(var4 << 4, var5 << 4, 64, 255, ki.field_f);
          return;
        }
    }

    private final void d(int param0) {
        L0: {
          int fieldTemp$2 = ((pd) this).field_q - 1;
          ((pd) this).field_q = ((pd) this).field_q - 1;
          if (fieldTemp$2 < 0) {
            ((pd) this).field_q = 5;
            ((pd) this).field_x = ((pd) this).field_x + 1;
            if (2 < ((pd) this).field_x) {
              ((pd) this).field_x = ((pd) this).field_x - 3;
              if (0 != (((pd) this).field_i & 1)) {
                break L0;
              } else {
                ((pd) this).field_A = ((pd) this).field_A + 1;
                if (((pd) this).field_A <= 256) {
                  break L0;
                } else {
                  ((pd) this).field_A = ((pd) this).field_A - 256;
                  break L0;
                }
              }
            } else {
              if (0 != (((pd) this).field_i & 1)) {
                break L0;
              } else {
                ((pd) this).field_A = ((pd) this).field_A + 1;
                if (((pd) this).field_A <= 256) {
                  break L0;
                } else {
                  ((pd) this).field_A = ((pd) this).field_A - 256;
                  break L0;
                }
              }
            }
          } else {
            if (0 != (((pd) this).field_i & 1)) {
              break L0;
            } else {
              ((pd) this).field_A = ((pd) this).field_A + 1;
              if (((pd) this).field_A <= 256) {
                break L0;
              } else {
                ((pd) this).field_A = ((pd) this).field_A - 256;
                break L0;
              }
            }
          }
        }
        if (param0 == 2) {
          L1: {
            if (((pd) this).field_h > 0) {
              ((pd) this).field_q = 5;
              ((pd) this).field_x = 3;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_101_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (0 < ((pd) this).field_m) {
          ((pd) this).field_m = ((pd) this).field_m - 1;
          return;
        } else {
          ((pd) this).field_m = ((pd) this).field_m - 1;
          L0: {
            if (((pd) this).field_E > 0) {
              ((pd) this).field_E = ((pd) this).field_E - 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((pd) this).field_i <= 0) {
              break L1;
            } else {
              L2: {
                ((pd) this).field_i = ((pd) this).field_i - 1;
                if (8 == ((pd) this).field_y) {
                  break L2;
                } else {
                  if (((pd) this).field_y != 7) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((pd) this).field_i = 0;
              break L1;
            }
          }
          L3: {
            if (((pd) this).field_y == 6) {
              if (null == ((pd) this).field_p) {
                break L3;
              } else {
                L4: {
                  ((pd) this).field_s.field_h.a(param0 ^ -113, (ca) (Object) new me((double)((pd) this).field_p.field_g, (double)((pd) this).field_p.field_h, 0.04 * (-0.5 + Math.random()), 0.04 * (-0.5 + Math.random()), 1));
                  ((pd) this).field_B = ((pd) this).field_B + 1;
                  if (!((pd) this).field_n) {
                    break L4;
                  } else {
                    ((pd) this).field_B = ((pd) this).field_B + 1;
                    break L4;
                  }
                }
                if (((pd) this).field_B > 200) {
                  ((pd) this).field_B = 0;
                  ((pd) this).field_p.d(9);
                  ((pd) this).field_p = null;
                  break L3;
                } else {
                  if (!((pd) this).field_p.b(true)) {
                    ((pd) this).field_p = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            this.d(param0 + param0);
            var2 = ((pd) this).field_g;
            if (((pd) this).field_h > 0) {
              L6: {
                ((pd) this).field_o = ((pd) this).field_o - (1 + ((pd) this).field_h / 10);
                if (((pd) this).field_y == 9) {
                  ((pd) this).field_E = 50;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ((pd) this).field_h = ((pd) this).field_h - (1 + ((pd) this).field_h / 10);
                if (((pd) this).field_o <= 0) {
                  ((pd) this).field_s.field_f.field_g[((pd) this).field_u - -(((pd) this).field_z * ((pd) this).field_s.field_f.field_c)] = ((pd) this).field_s.field_f.field_g[((pd) this).field_u - -(((pd) this).field_z * ((pd) this).field_s.field_f.field_c)] + 1;
                  break L7;
                } else {
                  break L7;
                }
              }
              if ((1 & ((pd) this).field_s.field_i) == -1) {
                ((pd) this).field_g = ((pd) this).field_g - 1;
                break L5;
              } else {
                break L5;
              }
            } else {
              ((pd) this).field_g = ((pd) this).field_g - 1;
              break L5;
            }
          }
          L8: {
            if (-1 == ((pd) this).field_i) {
              ((pd) this).field_g = ((pd) this).field_g - 1;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (((pd) this).field_y == 12) {
              break L9;
            } else {
              if (((pd) this).field_s.field_f.field_e[((pd) this).field_t]) {
                L10: {
                  if (((pd) this).field_f != 0) {
                    break L10;
                  } else {
                    hf discarded$1 = ea.a(param0 ^ 11, mh.field_a[57], (int)(((pd) this).field_v * 96.0));
                    break L10;
                  }
                }
                gd.field_c = gd.field_c + 1;
                ((pd) this).field_f = 2;
                ((pd) this).field_s.field_f.field_m[((pd) this).field_t] = true;
                break L9;
              } else {
                break L9;
              }
            }
          }
          L11: {
            if (0 >= ((pd) this).field_f) {
              break L11;
            } else {
              L12: {
                ((pd) this).field_f = ((pd) this).field_f - 1;
                if (((pd) this).field_y != 9) {
                  break L12;
                } else {
                  ((pd) this).field_E = 100;
                  break L12;
                }
              }
              ((pd) this).field_g = var2;
              break L11;
            }
          }
          L13: {
            if (he.field_u[((pd) this).field_y] + qh.field_c[((pd) this).field_s.field_f.field_o[((pd) this).field_t]] >= ((pd) this).field_g) {
              break L13;
            } else {
              ((pd) this).field_g = he.field_u[((pd) this).field_y] + qh.field_c[((pd) this).field_s.field_f.field_o[((pd) this).field_t]];
              break L13;
            }
          }
          L14: {
            if (0 > ((pd) this).field_g) {
              L15: {
                var3 = ((pd) this).field_u;
                var4 = ((pd) this).field_z;
                var5 = ((pd) this).field_z * ((pd) this).field_s.field_f.field_c + ((pd) this).field_u;
                if (((pd) this).field_y == 12) {
                  ((pd) this).field_j = 150;
                  break L15;
                } else {
                  ((pd) this).field_s.field_f.field_m[var5] = false;
                  break L15;
                }
              }
              L16: {
                var6 = ((pd) this).field_s.field_f.field_l[var5] - -1000;
                if (((pd) this).field_k == 3) {
                  break L16;
                } else {
                  if (var5 <= 0) {
                    break L16;
                  } else {
                    if (((pd) this).field_s.field_f.field_l[-1 + var5] >= var6) {
                      break L16;
                    } else {
                      L17: {
                        if (((pd) this).field_s.field_f.field_m[-1 + var5]) {
                          stackOut_57_0 = 0;
                          stackIn_58_0 = stackOut_57_0;
                          break L17;
                        } else {
                          stackOut_56_0 = 1;
                          stackIn_58_0 = stackOut_56_0;
                          break L17;
                        }
                      }
                      if (stackIn_58_0 != 1) {
                        break L16;
                      } else {
                        var3 = -1 + ((pd) this).field_u;
                        var4 = ((pd) this).field_z;
                        var6 = ((pd) this).field_s.field_f.field_l[var5 + -1];
                        break L16;
                      }
                    }
                  }
                }
              }
              L18: {
                if (((pd) this).field_k == 2) {
                  break L18;
                } else {
                  if (((pd) this).field_s.field_f.field_c >= var5) {
                    break L18;
                  } else {
                    if (((pd) this).field_s.field_f.field_l[-((pd) this).field_s.field_f.field_c + var5] >= var6) {
                      break L18;
                    } else {
                      L19: {
                        if (((pd) this).field_s.field_f.field_m[var5 - ((pd) this).field_s.field_f.field_c]) {
                          stackOut_65_0 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          break L19;
                        } else {
                          stackOut_64_0 = 1;
                          stackIn_66_0 = stackOut_64_0;
                          break L19;
                        }
                      }
                      if (stackIn_66_0 != 0) {
                        var4 = ((pd) this).field_z - 1;
                        var6 = ((pd) this).field_s.field_f.field_l[var5 + -((pd) this).field_s.field_f.field_c];
                        var3 = ((pd) this).field_u;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
              }
              L20: {
                if (((pd) this).field_k == 1) {
                  break L20;
                } else {
                  if (var5 >= ((pd) this).field_s.field_f.field_i - 2) {
                    break L20;
                  } else {
                    if (((pd) this).field_s.field_f.field_l[1 + var5] >= var6) {
                      break L20;
                    } else {
                      if (!((pd) this).field_s.field_f.field_m[1 + var5]) {
                        var4 = ((pd) this).field_z;
                        var3 = ((pd) this).field_u - -1;
                        var6 = ((pd) this).field_s.field_f.field_l[var5 + 1];
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
              }
              L21: {
                if (((pd) this).field_k == 0) {
                  break L21;
                } else {
                  if (var5 >= ((pd) this).field_s.field_f.field_i - ((pd) this).field_s.field_f.field_c + -1) {
                    break L21;
                  } else {
                    if (((pd) this).field_s.field_f.field_l[((pd) this).field_s.field_f.field_c + var5] >= var6) {
                      break L21;
                    } else {
                      if (!((pd) this).field_s.field_f.field_m[var5 - -((pd) this).field_s.field_f.field_c]) {
                        var6 = ((pd) this).field_s.field_f.field_l[var5 + ((pd) this).field_s.field_f.field_c];
                        var4 = ((pd) this).field_z + 1;
                        var3 = ((pd) this).field_u;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
              L22: {
                if (var6 != ((pd) this).field_s.field_f.field_l[var5] - -1000) {
                  break L22;
                } else {
                  L23: {
                    var6 = ((pd) this).field_s.field_f.field_l[var5];
                    if (var5 <= 0) {
                      break L23;
                    } else {
                      if (var6 <= ((pd) this).field_s.field_f.field_l[-1 + var5]) {
                        break L23;
                      } else {
                        if (!((pd) this).field_s.field_f.field_m[-1 + var5]) {
                          var6 = ((pd) this).field_s.field_f.field_l[-1 + var5];
                          var3 = ((pd) this).field_u + -1;
                          var4 = ((pd) this).field_z;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                  L24: {
                    if (((pd) this).field_s.field_f.field_c >= var5) {
                      break L24;
                    } else {
                      if (((pd) this).field_s.field_f.field_l[-((pd) this).field_s.field_f.field_c + var5] >= var6) {
                        break L24;
                      } else {
                        if (((pd) this).field_s.field_f.field_m[var5 + -((pd) this).field_s.field_f.field_c]) {
                          break L24;
                        } else {
                          var6 = ((pd) this).field_s.field_f.field_l[var5 - ((pd) this).field_s.field_f.field_c];
                          var4 = ((pd) this).field_z + -1;
                          var3 = ((pd) this).field_u;
                          break L24;
                        }
                      }
                    }
                  }
                  L25: {
                    if (var5 >= -2 + ((pd) this).field_s.field_f.field_i) {
                      break L25;
                    } else {
                      if (var6 <= ((pd) this).field_s.field_f.field_l[var5 + 1]) {
                        break L25;
                      } else {
                        if (!((pd) this).field_s.field_f.field_m[var5 - -1]) {
                          var4 = ((pd) this).field_z;
                          var6 = ((pd) this).field_s.field_f.field_l[var5 + 1];
                          var3 = ((pd) this).field_u + 1;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  if (-1 + -((pd) this).field_s.field_f.field_c + ((pd) this).field_s.field_f.field_i <= var5) {
                    break L22;
                  } else {
                    if (var6 <= ((pd) this).field_s.field_f.field_l[((pd) this).field_s.field_f.field_c + var5]) {
                      break L22;
                    } else {
                      L26: {
                        if (((pd) this).field_s.field_f.field_m[((pd) this).field_s.field_f.field_c + var5]) {
                          stackOut_100_0 = 0;
                          stackIn_101_0 = stackOut_100_0;
                          break L26;
                        } else {
                          stackOut_99_0 = 1;
                          stackIn_101_0 = stackOut_99_0;
                          break L26;
                        }
                      }
                      if (stackIn_101_0 == 1) {
                        var4 = 1 + ((pd) this).field_z;
                        var3 = ((pd) this).field_u;
                        var6 = ((pd) this).field_s.field_f.field_l[((pd) this).field_s.field_f.field_c + var5];
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                }
              }
              L27: {
                if (var6 > ((pd) this).field_s.field_f.field_l[var5]) {
                  ((pd) this).field_j = ((pd) this).field_j + 10;
                  break L27;
                } else {
                  ((pd) this).field_j = ((pd) this).field_j - 1;
                  break L27;
                }
              }
              L28: {
                if (((pd) this).field_j > 100) {
                  L29: {
                    if (var5 <= 0) {
                      break L29;
                    } else {
                      if (var6 > ((pd) this).field_s.field_f.field_l[var5 + -1]) {
                        var3 = -1 + ((pd) this).field_u;
                        var6 = ((pd) this).field_s.field_f.field_l[var5 - 1];
                        var4 = ((pd) this).field_z;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (var5 <= ((pd) this).field_s.field_f.field_c) {
                      break L30;
                    } else {
                      if (var6 > ((pd) this).field_s.field_f.field_l[-((pd) this).field_s.field_f.field_c + var5]) {
                        var6 = ((pd) this).field_s.field_f.field_l[var5 - ((pd) this).field_s.field_f.field_c];
                        var3 = ((pd) this).field_u;
                        var4 = ((pd) this).field_z - 1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if (((pd) this).field_s.field_f.field_i + -2 <= var5) {
                      break L31;
                    } else {
                      if (var6 > ((pd) this).field_s.field_f.field_l[1 + var5]) {
                        var3 = 1 + ((pd) this).field_u;
                        var6 = ((pd) this).field_s.field_f.field_l[var5 + 1];
                        var4 = ((pd) this).field_z;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (var5 >= -((pd) this).field_s.field_f.field_c + (((pd) this).field_s.field_f.field_i - 1)) {
                    break L28;
                  } else {
                    if (var6 <= ((pd) this).field_s.field_f.field_l[((pd) this).field_s.field_f.field_c + var5]) {
                      break L28;
                    } else {
                      var4 = ((pd) this).field_z - -1;
                      var3 = ((pd) this).field_u;
                      var6 = ((pd) this).field_s.field_f.field_l[var5 + ((pd) this).field_s.field_f.field_c];
                      break L28;
                    }
                  }
                } else {
                  break L28;
                }
              }
              L32: {
                var7 = 0;
                if (var4 < ((pd) this).field_z) {
                  ((pd) this).field_k = 0;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                L34: {
                  if (((pd) this).field_u != var3) {
                    break L34;
                  } else {
                    if (var4 == ((pd) this).field_z) {
                      break L33;
                    } else {
                      break L34;
                    }
                  }
                }
                var7 = 1;
                break L33;
              }
              L35: {
                if (((pd) this).field_u > var3) {
                  ((pd) this).field_k = 1;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (((pd) this).field_z < var4) {
                  ((pd) this).field_k = 2;
                  break L36;
                } else {
                  break L36;
                }
              }
              L37: {
                if (((pd) this).field_u < var3) {
                  ((pd) this).field_k = 3;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                ((pd) this).field_z = var4;
                ((pd) this).field_u = var3;
                if (0 <= ((pd) this).field_u) {
                  break L38;
                } else {
                  ((pd) this).field_u = ((pd) this).field_u + ((pd) this).field_s.field_f.field_c;
                  break L38;
                }
              }
              L39: {
                if (((pd) this).field_s.field_f.field_c > ((pd) this).field_u) {
                  break L39;
                } else {
                  ((pd) this).field_u = ((pd) this).field_u - ((pd) this).field_s.field_f.field_c;
                  break L39;
                }
              }
              L40: {
                ((pd) this).field_t = ((pd) this).field_z * ((pd) this).field_s.field_f.field_c + ((pd) this).field_u;
                if (((pd) this).field_y != 12) {
                  ((pd) this).field_s.field_f.field_m[((pd) this).field_t] = true;
                  break L40;
                } else {
                  break L40;
                }
              }
              if (var7 != 0) {
                ((pd) this).field_g = he.field_u[((pd) this).field_y] + qh.field_c[((pd) this).field_s.field_f.field_o[((pd) this).field_t]];
                break L14;
              } else {
                ((pd) this).field_g = 0;
                break L14;
              }
            } else {
              break L14;
            }
          }
          return;
        }
    }

    pd(int param0, int param1, f param2, int param3, int param4) {
        try {
            ((pd) this).field_z = param1;
            ((pd) this).field_y = param3;
            ((pd) this).field_g = 0;
            ((pd) this).field_s = param2;
            ((pd) this).field_u = param0;
            ((pd) this).field_o = param4 * he.field_o[((pd) this).field_y] >> 4;
            ((pd) this).field_l = ((pd) this).field_o;
            ((pd) this).field_j = 0;
            ((pd) this).field_B = 0;
            ((pd) this).field_t = ((pd) this).field_u - -(((pd) this).field_z * ((pd) this).field_s.field_f.field_c);
            ((pd) this).field_n = false;
            ((pd) this).field_p = null;
            ((pd) this).field_h = 0;
            ((pd) this).field_A = (int)(256.0 * Math.random());
            ((pd) this).field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "pd.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = 0;
        field_w = new li();
    }
}
