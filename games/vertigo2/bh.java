/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    private boolean field_C;
    int field_K;
    private boolean field_B;
    static String field_F;
    private int[] field_x;
    private int[] field_k;
    wo[] field_f;
    static fe[] field_y;
    private int[] field_q;
    int field_p;
    static int field_c;
    int field_d;
    private int[] field_G;
    private nj field_r;
    static java.awt.Color field_M;
    int field_E;
    int field_z;
    int field_D;
    int field_A;
    private int[] field_j;
    private boolean field_J;
    private int field_L;
    private int field_o;
    static byte[][] field_g;
    int field_v;
    int field_I;
    private int field_e;
    private boolean field_l;
    private rn[] field_i;
    int field_w;
    int field_n;
    private int[] field_u;
    static String field_H;
    private jg[] field_b;
    private int field_t;
    static er[] field_a;
    boolean field_m;
    int field_h;
    private boolean field_s;

    final rn[] m(int param0) {
        if (param0 != 9384) {
            ((bh) this).field_x = null;
        }
        return ((bh) this).field_i;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (null != ((bh) this).field_b[param1]) {
              break L0;
            } else {
              L1: {
                var5 = ((bh) this).field_i[param0].field_h;
                var6 = ((bh) this).field_i[param0].field_r;
                var7 = ((bh) this).field_i[param0].field_o;
                if (((bh) this).field_i[param0].field_A == 2) {
                  var8 = var5;
                  L2: while (true) {
                    L3: {
                      if (var8 < 0) {
                        break L3;
                      } else {
                        if (null != ((bh) this).a((byte) 108, var6, var8, var7)) {
                          break L3;
                        } else {
                          ((bh) this).field_i[param0].field_x = 128 * var8;
                          var8--;
                          continue L2;
                        }
                      }
                    }
                    ((bh) this).field_i[param0].field_D = this.a(var8, var6, (byte) -99, var7);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L4: {
                if (((bh) this).field_i[param0].field_A != 3) {
                  break L4;
                } else {
                  var8 = var6;
                  L5: while (true) {
                    L6: {
                      if (var8 < 0) {
                        break L6;
                      } else {
                        if (null != ((bh) this).a((byte) 108, var8, var5, var7)) {
                          break L6;
                        } else {
                          ((bh) this).field_i[param0].field_x = var8 * 128;
                          var8--;
                          continue L5;
                        }
                      }
                    }
                    ((bh) this).field_i[param0].field_D = this.a(var5, var8, (byte) -115, var7);
                    break L4;
                  }
                }
              }
              if (((bh) this).field_i[param0].field_A != 4) {
                break L0;
              } else {
                var8 = var7;
                L7: while (true) {
                  L8: {
                    if (var8 < 0) {
                      break L8;
                    } else {
                      if (((bh) this).a((byte) 108, var6, var5, var8) != null) {
                        break L8;
                      } else {
                        ((bh) this).field_i[param0].field_x = -240 + 240 * var8 + 47;
                        var8--;
                        continue L7;
                      }
                    }
                  }
                  ((bh) this).field_i[param0].field_D = this.a(var5, var6, (byte) -99, var8);
                  break L0;
                }
              }
            }
          }
        }
        if (param2 == 2) {
          L9: {
            if (param3 < 0) {
              break L9;
            } else {
              if (((bh) this).field_b[param3] != null) {
                break L9;
              } else {
                L10: {
                  var5 = ((bh) this).field_i[param0].field_h;
                  var6 = ((bh) this).field_i[param0].field_r;
                  var7 = ((bh) this).field_i[param0].field_o;
                  if (2 != ((bh) this).field_i[param0].field_A) {
                    break L10;
                  } else {
                    var8 = var5;
                    L11: while (true) {
                      L12: {
                        if (var8 >= 5) {
                          break L12;
                        } else {
                          if (null != ((bh) this).a((byte) 108, var6, var8, var7)) {
                            break L12;
                          } else {
                            ((bh) this).field_i[param0].field_B = 128 * var8;
                            var8++;
                            continue L11;
                          }
                        }
                      }
                      ((bh) this).field_i[param0].field_E = this.a(var8, var6, (byte) -113, var7);
                      break L10;
                    }
                  }
                }
                L13: {
                  if (((bh) this).field_i[param0].field_A == 3) {
                    var8 = var6;
                    L14: while (true) {
                      L15: {
                        if (var8 >= 5) {
                          break L15;
                        } else {
                          if (((bh) this).a((byte) 108, var8, var5, var7) != null) {
                            break L15;
                          } else {
                            ((bh) this).field_i[param0].field_B = var8 * 128;
                            var8++;
                            continue L14;
                          }
                        }
                      }
                      ((bh) this).field_i[param0].field_E = this.a(var5, var8, (byte) -123, var7);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                if (((bh) this).field_i[param0].field_A != 4) {
                  break L9;
                } else {
                  var8 = var7;
                  L16: while (true) {
                    L17: {
                      if (var8 >= 15) {
                        break L17;
                      } else {
                        if (((bh) this).a((byte) 108, var6, var5, var8) != null) {
                          break L17;
                        } else {
                          ((bh) this).field_i[param0].field_B = -47 + var8 * 240 + 240;
                          var8++;
                          continue L16;
                        }
                      }
                    }
                    ((bh) this).field_i[param0].field_E = this.a(var5, var6, (byte) -73, var8);
                    break L9;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        wo var5_ref_wo = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jg var8_ref_jg = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wo var15 = null;
        int[] var16 = null;
        jg var17 = null;
        jg var18 = null;
        L0: {
          L1: {
            var14 = Vertigo2.field_L ? 1 : 0;
            param2.field_u = 0;
            ((bh) this).field_e = 0;
            ((bh) this).field_n = 0;
            ((bh) this).field_s = true;
            var15 = ((bh) this).field_f[0];
            var15.field_a = -64 + 128 * param2.h(-11);
            var15.field_I = 128 * param2.h(-11) + -64;
            var15.field_m = -240 + 240 * param2.h(-11) - 120;
            if (0 == ((bh) this).field_w) {
              break L1;
            } else {
              if (3 != ((bh) this).field_w) {
                var5_ref_wo = ((bh) this).field_f[1];
                var5_ref_wo.field_a = param2.h(-11) * 128 + -64;
                var5_ref_wo.field_I = param2.h(-11) * 128 - 64;
                var5_ref_wo.field_m = -120 + (param2.h(-11) + -1) * 240;
                if (param1 != 19) {
                  break L0;
                } else {
                  if (((bh) this).field_w != 2) {
                    break L0;
                  } else {
                    var5_ref_wo.field_a = var15.field_a - 256;
                    var5_ref_wo.field_I = -256 + var15.field_I;
                    break L0;
                  }
                }
              } else {
                break L1;
              }
            }
          }
          if (1 < ((bh) this).field_f.length) {
            var5_ref_wo = ((bh) this).field_f[1];
            var5_ref_wo.field_a = 320;
            var5_ref_wo.field_m = 1800;
            var5_ref_wo.field_I = 320;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (2 != ((bh) this).field_w) {
            break L2;
          } else {
            int discarded$3 = param2.h(-11);
            ((bh) this).field_I = nn.field_s[param1] * 50;
            break L2;
          }
        }
        ((bh) this).field_t = 0;
        ((bh) this).field_h = -2147483648;
        ((bh) this).field_D = 2147483647;
        ((bh) this).field_v = 2147483647;
        ((bh) this).field_K = -2147483648;
        ((bh) this).field_A = -2147483648;
        ((bh) this).field_z = 2147483647;
        ((bh) this).field_L = 0;
        var5 = 0;
        L3: while (true) {
          if (var5 >= 15) {
            L4: {
              L5: {
                if (((bh) this).field_w != 1) {
                  break L5;
                } else {
                  if (param1 == 26) {
                    ((bh) this).a((byte) 108, 2, 0, 9).a(5, (byte) -122);
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (1 != ((bh) this).field_w) {
                  break L6;
                } else {
                  if (param1 != 29) {
                    break L6;
                  } else {
                    ((bh) this).a((byte) 108, 0, 2, 12).a(5, (byte) -126);
                    break L4;
                  }
                }
              }
              L7: {
                if (2 != ((bh) this).field_w) {
                  break L7;
                } else {
                  if (param1 != 19) {
                    break L7;
                  } else {
                    var16 = new int[]{0, 0, 0, 4, 3, 0, 0, 0, 3, 4, 0, 0, 14, 0, 0, 3, 4, 0, 0, 0, 4, 3, 0, 0, 0};
                    var6 = 0;
                    var7 = 0;
                    L8: while (true) {
                      if (((bh) this).field_L <= var7) {
                        var7 = 0;
                        L9: while (true) {
                          if (5 <= var7) {
                            break L4;
                          } else {
                            var8 = 0;
                            L10: while (true) {
                              if (5 <= var8) {
                                var7++;
                                continue L9;
                              } else {
                                L11: {
                                  var9 = var8 + var7 * 5;
                                  if (0 == var16[var9]) {
                                    break L11;
                                  } else {
                                    if (9 > var6) {
                                      ((bh) this).field_b[var9] = new jg(var16[var9], var8 * 128, 128 * var7, 0);
                                      var6++;
                                      break L11;
                                    } else {
                                      ((bh) this).field_b[var9] = null;
                                      break L11;
                                    }
                                  }
                                }
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        }
                      } else {
                        L12: {
                          if (((bh) this).field_b[var7] == null) {
                            break L12;
                          } else {
                            if (((bh) this).field_b[var7].field_o != 0) {
                              break L12;
                            } else {
                              ((bh) this).field_b[var7] = null;
                              break L12;
                            }
                          }
                        }
                        var7++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              if (2 != ((bh) this).field_w) {
                break L4;
              } else {
                if (param1 == 26) {
                  L13: {
                    var17 = ((bh) this).a((byte) 108, 2, 4, 7);
                    if (var17 != null) {
                      var17.a(4, (byte) -128);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var18 = ((bh) this).a((byte) 108, 2, 0, 7);
                  if (var18 != null) {
                    var18.a(3, (byte) -124);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            ((bh) this).field_v = ((bh) this).field_v * 128;
            ((bh) this).field_D = ((bh) this).field_D * 128;
            var5 = 12 / ((22 - param0) / 41);
            ((bh) this).field_A = ((bh) this).field_A * 240;
            ((bh) this).field_z = ((bh) this).field_z * 240;
            ((bh) this).field_K = ((bh) this).field_K * 128;
            ((bh) this).field_h = ((bh) this).field_h * 128;
            var6 = param2.field_u;
            param2.field_u = param2.field_u + 375;
            ((bh) this).field_o = param2.h(-11);
            var7 = 0;
            L14: while (true) {
              if (~((bh) this).field_o >= ~var7) {
                var7 = 6 + param2.field_u;
                param2.field_u = var6;
                ((bh) this).field_t = 0;
                var8 = 0;
                L15: while (true) {
                  if (15 <= var8) {
                    var8 = 0;
                    var9 = 0;
                    L16: while (true) {
                      L17: {
                        if (var9 >= 375) {
                          break L17;
                        } else {
                          if (((bh) this).field_b[var9] == null) {
                            var8 = var9;
                            break L17;
                          } else {
                            var9++;
                            continue L16;
                          }
                        }
                      }
                      var9 = 0;
                      L18: while (true) {
                        if (((bh) this).field_t <= var9) {
                          var9 = 0;
                          L19: while (true) {
                            if (~var9 <= ~((bh) this).field_f.length) {
                              L20: {
                                if (3 != ((bh) this).field_w) {
                                  break L20;
                                } else {
                                  var9 = 0;
                                  L21: while (true) {
                                    if (~var9 <= ~((bh) this).field_L) {
                                      var9 = 0;
                                      L22: while (true) {
                                        if (((bh) this).field_t <= var9) {
                                          break L20;
                                        } else {
                                          L23: {
                                            if (null == ((bh) this).field_i[var9]) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (((bh) this).field_i[var9].field_p == 12) {
                                                  break L24;
                                                } else {
                                                  if (((bh) this).field_i[var9].field_p == 9) {
                                                    break L24;
                                                  } else {
                                                    if (((bh) this).field_i[var9].field_p != 19) {
                                                      break L23;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                              }
                                              ((bh) this).field_i[var9].a(27, (byte) -122);
                                              break L23;
                                            }
                                          }
                                          var9++;
                                          continue L22;
                                        }
                                      }
                                    } else {
                                      L25: {
                                        if (((bh) this).field_b[var9] == null) {
                                          break L25;
                                        } else {
                                          L26: {
                                            if (((bh) this).field_b[var9].field_p == 12) {
                                              break L26;
                                            } else {
                                              if (((bh) this).field_b[var9].field_p == 9) {
                                                break L26;
                                              } else {
                                                if (((bh) this).field_b[var9].field_p == 19) {
                                                  break L26;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                            }
                                          }
                                          ((bh) this).field_b[var9].a(27, (byte) -123);
                                          break L25;
                                        }
                                      }
                                      var9++;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                              return;
                            } else {
                              ((bh) this).field_f[var9].b(false);
                              var9++;
                              continue L19;
                            }
                          }
                        } else {
                          this.a(var9, var8, 2, var8);
                          var9++;
                          continue L18;
                        }
                      }
                    }
                  } else {
                    var9 = 0;
                    L27: while (true) {
                      if (var9 >= 5) {
                        var8++;
                        continue L15;
                      } else {
                        var10 = 0;
                        L28: while (true) {
                          if (5 <= var10) {
                            var9++;
                            continue L27;
                          } else {
                            L29: {
                              var11 = param2.h(-11);
                              if (var11 <= 1) {
                                break L29;
                              } else {
                                L30: {
                                  var12 = -1;
                                  if (var11 != 5) {
                                    break L30;
                                  } else {
                                    var6 = param2.field_u;
                                    param2.field_u = var7;
                                    var12 = 3 * param2.h(-11) / 2;
                                    var7 = param2.field_u;
                                    param2.field_u = var6;
                                    break L30;
                                  }
                                }
                                L31: {
                                  var13 = this.a(var10, var9, (byte) -124, var8);
                                  if (var11 != 10) {
                                    break L31;
                                  } else {
                                    System.out.println("T10 on this level");
                                    break L31;
                                  }
                                }
                                ((bh) this).field_i[((bh) this).field_t] = new rn(((bh) this).field_b[var13].field_p, ((bh) this).field_b[var13].field_l, ((bh) this).field_b[var13].field_g, ((bh) this).field_b[var13].field_s, var11, var12);
                                ((bh) this).field_b[var13] = null;
                                ((bh) this).field_t = ((bh) this).field_t + 1;
                                break L29;
                              }
                            }
                            var10++;
                            continue L28;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L32: {
                  ((bh) this).field_q[var7] = param2.g(80);
                  ((bh) this).field_u[var7] = param2.g(82);
                  ((bh) this).field_G[var7] = param2.g(122);
                  ((bh) this).field_j[var7] = param2.g(96);
                  ((bh) this).field_x[var7] = param2.g(81);
                  ((bh) this).field_k[var7] = param2.g(110);
                  var8_ref_jg = ((bh) this).a((byte) 108, ((bh) this).field_x[var7] + -1, -1 + ((bh) this).field_j[var7], -1 + ((bh) this).field_k[var7]);
                  if (var8_ref_jg == null) {
                    break L32;
                  } else {
                    if (var8_ref_jg.field_p == 4) {
                      var8_ref_jg.a(25, (byte) -124);
                      break L32;
                    } else {
                      if (var8_ref_jg.field_p == 3) {
                        var8_ref_jg.a(26, (byte) -123);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                  }
                }
                var7++;
                continue L14;
              }
            }
          } else {
            var6 = 0;
            L33: while (true) {
              if (var6 >= 5) {
                var5++;
                continue L3;
              } else {
                var7 = 0;
                L34: while (true) {
                  if (var7 >= 5) {
                    var6++;
                    continue L33;
                  } else {
                    L35: {
                      var8 = param2.h(-11);
                      if (21 == var8) {
                        var8 = 4;
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                    L36: {
                      if (var8 == 0) {
                        int fieldTemp$4 = ((bh) this).field_L;
                        ((bh) this).field_L = ((bh) this).field_L + 1;
                        ((bh) this).field_b[fieldTemp$4] = null;
                        break L36;
                      } else {
                        L37: {
                          if (31 <= var8) {
                            var8 = 4;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        L38: {
                          int fieldTemp$5 = ((bh) this).field_L;
                          ((bh) this).field_L = ((bh) this).field_L + 1;
                          ((bh) this).field_b[fieldTemp$5] = new jg(var8, var7 * 128, 128 * var6, 240 * var5);
                          if (((bh) this).field_h < var7) {
                            ((bh) this).field_h = var7;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        L39: {
                          if (((bh) this).field_z <= var5) {
                            break L39;
                          } else {
                            ((bh) this).field_z = var5;
                            break L39;
                          }
                        }
                        L40: {
                          if (~((bh) this).field_K <= ~var6) {
                            break L40;
                          } else {
                            ((bh) this).field_K = var6;
                            break L40;
                          }
                        }
                        L41: {
                          if (var7 < ((bh) this).field_D) {
                            ((bh) this).field_D = var7;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        L42: {
                          if (((bh) this).field_v > var6) {
                            ((bh) this).field_v = var6;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        if (((bh) this).field_A >= var5) {
                          break L36;
                        } else {
                          ((bh) this).field_A = var5;
                          break L36;
                        }
                      }
                    }
                    var7++;
                    continue L34;
                  }
                }
              }
            }
          }
        }
    }

    final int e(byte param0) {
        int var2 = -7 / ((param0 - -49) / 57);
        return ((bh) this).field_t;
    }

    final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        var2 = 0;
        var3 = ((bh) this).field_f.length;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            var4 = 0;
            L1: while (true) {
              if (((bh) this).field_t <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (((bh) this).field_L <= var4) {
                    L3: {
                      if (param0 >= 96) {
                        break L3;
                      } else {
                        ((bh) this).field_B = true;
                        break L3;
                      }
                    }
                    return var2;
                  } else {
                    if (null != ((bh) this).field_b[var4]) {
                      L4: {
                        if (4 == ((bh) this).field_b[var4].field_h + ((bh) this).field_b[var4].field_r + ((bh) this).field_b[var4].field_o - -((bh) this).field_b[var4].field_p) {
                          stackOut_17_0 = 1;
                          stackIn_18_0 = stackOut_17_0;
                          break L4;
                        } else {
                          if (((bh) this).field_b[var4].field_p == 3) {
                            stackOut_16_0 = 2;
                            stackIn_18_0 = stackOut_16_0;
                            break L4;
                          } else {
                            stackOut_15_0 = 3;
                            stackIn_18_0 = stackOut_15_0;
                            break L4;
                          }
                        }
                      }
                      var5 = stackIn_18_0;
                      var2 = var2 + 1000 * ((((bh) this).field_L + (var4 + (((bh) this).field_t + var3))) * var5);
                      var4++;
                      continue L2;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                }
              } else {
                L5: {
                  stackOut_5_0 = var2;
                  stackOut_5_1 = 100;
                  stackOut_5_2 = ((bh) this).field_i[var4].field_l;
                  stackOut_5_3 = -(640 * ((bh) this).field_i[var4].field_g) + -(3600 * ((bh) this).field_i[var4].field_s);
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  stackIn_7_3 = stackOut_5_3;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  if (((bh) this).field_i[var4].b((byte) -113)) {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = stackIn_7_2;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = 999;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    break L5;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = stackIn_6_2;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    break L5;
                  }
                }
                var2 = stackIn_8_0 + (stackIn_8_1 * (stackIn_8_2 - (stackIn_8_3 + -stackIn_8_4)) * (var4 + var3) + ((bh) this).field_i[var4].field_k * 10000 - -(((bh) this).field_i[var4].field_v * 10000));
                var4++;
                continue L1;
              }
            }
          } else {
            var2 = var2 + (3600 * ((bh) this).field_f[var4].field_y + (((bh) this).field_f[var4].field_E + 640 * ((bh) this).field_f[var4].field_k));
            var2 = var2 + (((bh) this).field_f[var4].field_c + (((bh) this).field_f[var4].field_O * 3600 - -(640 * ((bh) this).field_f[var4].c((byte) -127))));
            var4++;
            continue L0;
          }
        }
    }

    private final void j(int param0) {
        ((bh) this).field_s = false;
        if (param0 != 0) {
            this.a(-78, -35, 41, -14);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3_int = 0;
        fa var3 = null;
        jg var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        jg var13 = null;
        jg var14 = null;
        jg var15 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (((bh) this).field_l) {
          L0: {
            if (null != ((bh) this).field_r) {
              break L0;
            } else {
              ((bh) this).field_r = new nj();
              break L0;
            }
          }
          L1: {
            if (0 == ((bh) this).field_r.c(true)) {
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= ((bh) this).field_L) {
                  break L1;
                } else {
                  var14 = ((bh) this).field_b[var3_int];
                  if (var14 != null) {
                    L3: {
                      if (var14.field_p == 3) {
                        break L3;
                      } else {
                        if (var14.field_p == 4) {
                          break L3;
                        } else {
                          var3_int++;
                          continue L2;
                        }
                      }
                    }
                    ((bh) this).field_r.a((li) (Object) new fa(var3_int), false);
                    var3_int++;
                    continue L2;
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L4: {
            if (((bh) this).field_r.c(true) > 0) {
              var3 = (fa) (Object) ((bh) this).field_r.a((byte) 100);
              L5: while (true) {
                if (var3 == null) {
                  break L4;
                } else {
                  L6: {
                    var13 = ((bh) this).field_b[var3.field_n];
                    var15 = var13;
                    var4 = var15;
                    if (var4 == null) {
                      var3.c(2);
                      break L6;
                    } else {
                      L7: {
                        var5 = -((bh) this).field_f[0].field_E + var15.field_l;
                        var6 = var13.field_g - ((bh) this).field_f[0].field_y;
                        var7 = var13.field_s + -((bh) this).field_f[0].field_k;
                        var8 = -((bh) this).field_f[1].field_E + var15.field_l;
                        var9 = -((bh) this).field_f[1].field_y + var15.field_g;
                        var10 = -((bh) this).field_f[1].field_k + var15.field_s;
                        var11 = 147456;
                        if (!param0) {
                          break L7;
                        } else {
                          if (var11 > var5 * var5 + var6 * var6 - -(var7 * var7)) {
                            break L6;
                          } else {
                            if (var10 * var10 + (var8 * var8 - -(var9 * var9)) >= var11) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var3.c(2);
                      if (var15.field_p != 4) {
                        var4.field_p = 30;
                        return;
                      } else {
                        var4.field_p = 29;
                        return;
                      }
                    }
                  }
                  var3 = (fa) (Object) ((bh) this).field_r.b(24);
                  continue L5;
                }
              }
            } else {
              break L4;
            }
          }
          ((bh) this).field_r.c(0);
          if (param1 >= 75) {
            this.a(false, (byte) 119);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 == 104) {
            break L0;
          } else {
            int discarded$2 = this.b(50, false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (6 == ((bh) this).field_e) {
              break L2;
            } else {
              if (((bh) this).field_e == 7) {
                break L2;
              } else {
                if (((bh) this).field_e == 3) {
                  break L2;
                } else {
                  if (4 == ((bh) this).field_e) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final void a(wo[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == -22747) {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= param0.length) {
                  break L0;
                } else {
                  L2: {
                    if (param1 != var4_int) {
                      ((bh) this).field_f[var4_int].a(param0[var4_int], param2 + 16799962);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("bh.W(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int l(int param0) {
        int var2 = -90 % ((-13 - param0) / 56);
        return ((bh) this).field_L;
    }

    final void a(mi param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                param0.p(param1);
                ((bh) this).field_I = param0.c((byte) -115, 14);
                ((bh) this).field_e = param0.c((byte) -94, 3);
                var3_int = 1;
                if (((bh) this).field_e == 7) {
                  break L2;
                } else {
                  if (6 == ((bh) this).field_e) {
                    break L2;
                  } else {
                    if (((bh) this).field_e == 4) {
                      break L2;
                    } else {
                      if (((bh) this).field_e == 3) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              this.b((byte) -112);
              var3_int = 0;
              break L1;
            }
            ((bh) this).field_n = param0.c((byte) -93, 8);
            var4 = 0;
            L3: while (true) {
              if (~((bh) this).field_f.length >= ~var4) {
                L4: {
                  if (var3_int != 0) {
                    var4 = 0;
                    var5 = 0;
                    L5: while (true) {
                      if (var5 >= 15) {
                        ((bh) this).field_t = param0.c((byte) -117, 9);
                        var5 = 0;
                        L6: while (true) {
                          if (~((bh) this).field_t >= ~var5) {
                            param0.b((byte) -76);
                            var4 = 0;
                            var5 = param1;
                            L7: while (true) {
                              if (var5 >= 375) {
                                break L4;
                              } else {
                                if (null != ((bh) this).field_b[var5]) {
                                  var5++;
                                  continue L7;
                                } else {
                                  var4 = var5;
                                  break L4;
                                }
                              }
                            }
                          } else {
                            ((bh) this).field_i[var5] = new rn(param0);
                            var5++;
                            continue L6;
                          }
                        }
                      } else {
                        var6 = 0;
                        L8: while (true) {
                          if (var6 >= 5) {
                            var5++;
                            continue L5;
                          } else {
                            var7 = 0;
                            L9: while (true) {
                              L10: {
                                if (5 <= var7) {
                                  break L10;
                                } else {
                                  L11: {
                                    var8 = param0.c((byte) -125, 5);
                                    if (var8 == 0) {
                                      int incrementValue$2 = var4;
                                      var4++;
                                      ((bh) this).field_b[incrementValue$2] = null;
                                      break L11;
                                    } else {
                                      int incrementValue$3 = var4;
                                      var4++;
                                      ((bh) this).field_b[incrementValue$3] = new jg(var8, 128 * var7, 128 * var6, var5 * 240);
                                      break L11;
                                    }
                                  }
                                  if (~((bh) this).field_L < ~var4) {
                                    var7++;
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var6++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    param0.b((byte) -76);
                    var4 = 0;
                    var5 = param1;
                    L12: while (true) {
                      if (var5 >= 375) {
                        break L4;
                      } else {
                        if (null != ((bh) this).field_b[var5]) {
                          var5++;
                          continue L12;
                        } else {
                          var4 = var5;
                          break L4;
                        }
                      }
                    }
                  }
                }
                var5 = 0;
                L13: while (true) {
                  if (~var5 <= ~((bh) this).field_t) {
                    break L0;
                  } else {
                    this.a(var5, var4, 2, var4);
                    var5++;
                    continue L13;
                  }
                }
              } else {
                ((bh) this).field_f[var4].a(0, param0);
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("bh.FA(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 44 + param1 + 41);
        }
    }

    public static void a() {
        field_F = null;
        field_a = null;
        field_y = null;
        field_g = null;
        field_H = null;
        field_M = null;
    }

    private final void a(int param0, boolean param1, int param2, int param3, wo param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rn var13 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (((bh) this).field_e == 1) {
              L1: {
                var13 = ((bh) this).field_i[param0];
                var7 = var13.a(param4, (byte) -91) ? 1 : 0;
                var10 = param3;
                if (var10 == 15) {
                  if (0 > param4.c((byte) -128)) {
                    break L1;
                  } else {
                    if (var7 != 0) {
                      var13.a(23, (byte) -128);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (var10 != 23) {
                    if (17 == var10) {
                      var8 = var13.field_l + 64;
                      var9 = 64 + var13.field_g;
                      param4.a(false, var8, var9);
                      break L1;
                    } else {
                      if (var10 == 9) {
                        ((bh) this).field_s = true;
                        var13.a(27, (byte) -127);
                        param4.field_c = 0;
                        param4.field_O = 0;
                        break L1;
                      } else {
                        if (var10 == 19) {
                          if (var7 != 0) {
                            var12 = 0;
                            var10 = var12;
                            L2: while (true) {
                              if (var12 >= ((bh) this).field_f.length) {
                                break L1;
                              } else {
                                L3: {
                                  if (param4 != ((bh) this).field_f[var12]) {
                                    ((bh) this).field_f[var12].d((byte) 4);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                                var12++;
                                continue L2;
                              }
                            }
                          } else {
                            break L1;
                          }
                        } else {
                          if (var10 == 6) {
                            if (var7 == 0) {
                              break L1;
                            } else {
                              if (var13.field_A == 5) {
                                var13.field_t = 500;
                                var13.field_k = (short) 0;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    if (var7 == 0) {
                      break L1;
                    } else {
                      var13.a(23, (byte) -125);
                      var13.field_k = (short) 0;
                      break L1;
                    }
                  }
                }
              }
              L4: {
                var8 = param4.a(param0, var7 != 0, ((bh) this).field_w, param1, var13.field_p, 18113);
                if (var8 < 0) {
                  break L4;
                } else {
                  if (var8 == var13.field_p) {
                    break L4;
                  } else {
                    var13.a(var8, true);
                    break L4;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("bh.A(").append(param0).append(44).append(param1).append(44).append(27228).append(44).append(param3).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param4 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L5;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 41);
        }
    }

    final boolean b(int param0) {
        if (param0 != -15531) {
            Object var3 = null;
            int discarded$0 = this.a(-76, false, 34, true, (wo) null);
        }
        return ((bh) this).field_B;
    }

    final boolean a(boolean param0, boolean[] param1, int param2, int[] param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wo var10_ref_wo = null;
        int var11 = 0;
        int var12 = 0;
        rn var12_ref_rn = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        int stackIn_126_0 = 0;
        wo stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        wo stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        wo stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        wo stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        wo stackIn_189_0 = null;
        int stackIn_189_1 = 0;
        int stackIn_189_2 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        wo stackOut_184_0 = null;
        int stackOut_184_1 = 0;
        wo stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        wo stackOut_188_0 = null;
        int stackOut_188_1 = 0;
        int stackOut_188_2 = 0;
        wo stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        wo stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        ((bh) this).field_n = ((bh) this).field_n + 1;
        var6_int = 0;
        L0: while (true) {
          if (((bh) this).field_f.length <= var6_int) {
            L1: {
              L2: {
                L3: {
                  if (((bh) this).field_w == 0) {
                    break L3;
                  } else {
                    if (((bh) this).field_w != 3) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((bh) this).field_n <= 10) {
                  break L2;
                } else {
                  if (jq.a((byte) 29) >= 10) {
                    break L2;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L1;
            }
            L4: {
              var6_int = stackIn_13_0;
              var7 = ((bh) this).field_e;
              if (var7 != 0) {
                if (var7 != 2) {
                  if (var7 != 6) {
                    if (var7 == 7) {
                      L5: {
                        if (((bh) this).field_n >= 50) {
                          ((bh) this).field_t = 0;
                          ((bh) this).field_L = 0;
                          if (((bh) this).field_C) {
                            break L5;
                          } else {
                            if (!param4) {
                              break L5;
                            } else {
                              if (((bh) this).field_n == 50) {
                                gm.a(27, (byte) -55);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          var7 = 0;
                          L6: while (true) {
                            if (~((bh) this).field_f.length >= ~var7) {
                              break L5;
                            } else {
                              ((bh) this).field_f[var7].b(0, -7394);
                              var7++;
                              continue L6;
                            }
                          }
                        }
                      }
                      var7 = 0;
                      L7: while (true) {
                        if (var7 >= param3.length) {
                          break L4;
                        } else {
                          param3[var7] = 0;
                          var7++;
                          continue L7;
                        }
                      }
                    } else {
                      if (var7 != 3) {
                        if (4 == var7) {
                          if (((bh) this).field_n <= 10) {
                            break L4;
                          } else {
                            if (jq.a((byte) 29) >= 10) {
                              break L4;
                            } else {
                              ((bh) this).field_e = 7;
                              if (((bh) this).field_C) {
                                break L4;
                              } else {
                                if (param4) {
                                  qg.a(1, 250, 28, 0);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          if (5 == var7) {
                            if (((bh) this).field_n != 50) {
                              break L4;
                            } else {
                              if (((bh) this).field_w == 2) {
                                if (!on.a((byte) -90, 0)) {
                                  break L4;
                                } else {
                                  this.a(true, (byte) 79);
                                  break L4;
                                }
                              } else {
                                return true;
                              }
                            }
                          } else {
                            if (var7 != 1) {
                              break L4;
                            } else {
                              L8: {
                                if (((bh) this).field_w == 0) {
                                  break L8;
                                } else {
                                  if (((bh) this).field_w != 3) {
                                    break L4;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (((bh) this).field_n < 10) {
                                param3[0] = b.a(param3[0], -2);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if (((bh) this).field_C) {
                          break L4;
                        } else {
                          if (((bh) this).field_n <= 10) {
                            break L4;
                          } else {
                            if (jq.a((byte) 29) >= 10) {
                              break L4;
                            } else {
                              if (((bh) this).field_w == 0) {
                                ln.field_d.a(2, false);
                                lc.field_d = false;
                                an.field_c = true;
                                break L4;
                              } else {
                                if (am.field_b) {
                                  if (~lc.field_b != ~am.field_n) {
                                    break L4;
                                  } else {
                                    gj.a((byte) 102, false, am.field_n, 15);
                                    break L4;
                                  }
                                } else {
                                  if (!ed.field_q) {
                                    break L4;
                                  } else {
                                    bs.a(11, (byte) -47, 0);
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (0 == ((bh) this).field_w) {
                      if (((bh) this).field_n <= 10) {
                        break L4;
                      } else {
                        if (jq.a((byte) 29) >= 10) {
                          break L4;
                        } else {
                          if (!((bh) this).field_f[0].f(-1)) {
                            L9: {
                              ((bh) this).field_e = 7;
                              if (((bh) this).field_C) {
                                break L9;
                              } else {
                                if (param4) {
                                  qg.a(1, 250, 28, 0);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            ((bh) this).field_n = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      if (((bh) this).field_n != 250) {
                        break L4;
                      } else {
                        ((bh) this).field_e = 7;
                        ((bh) this).field_n = 0;
                        break L4;
                      }
                    }
                  }
                } else {
                  L10: {
                    if (((bh) this).field_n >= 50) {
                      ((bh) this).field_L = 0;
                      ((bh) this).field_t = 0;
                      break L10;
                    } else {
                      var7 = 0;
                      L11: while (true) {
                        if (~var7 <= ~((bh) this).field_f.length) {
                          break L10;
                        } else {
                          ((bh) this).field_f[var7].b(0, -7394);
                          var7++;
                          continue L11;
                        }
                      }
                    }
                  }
                  if (((bh) this).field_n != 100) {
                    break L4;
                  } else {
                    if (((bh) this).field_w != 3) {
                      var7 = 0;
                      L12: while (true) {
                        if (~((bh) this).field_f.length >= ~var7) {
                          L13: {
                            if (!((bh) this).field_m) {
                              ((bh) this).field_e = 6;
                              break L13;
                            } else {
                              ((bh) this).field_e = 4;
                              break L13;
                            }
                          }
                          ((bh) this).field_n = 0;
                          this.b((byte) -106);
                          break L4;
                        } else {
                          ((bh) this).field_f[var7].a((byte) -88);
                          var7++;
                          continue L12;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              } else {
                L14: {
                  if (((bh) this).field_n == 200) {
                    break L14;
                  } else {
                    if (var6_int == 0) {
                      ((bh) this).field_s = true;
                      break L4;
                    } else {
                      break L14;
                    }
                  }
                }
                ((bh) this).field_n = 0;
                ((bh) this).field_s = false;
                param3[0] = 0;
                ((bh) this).field_e = 1;
                if (!param0) {
                  break L4;
                } else {
                  if (!on.a((byte) -105, 0)) {
                    break L4;
                  } else {
                    if (((bh) this).field_w == 2) {
                      L15: {
                        if (null != ((bh) this).field_r) {
                          ((bh) this).field_r.c(0);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      this.a(true, (byte) 116);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            var7 = 0;
            var8 = 0;
            var9 = 0;
            L16: while (true) {
              if (var9 >= ((bh) this).field_L) {
                L17: {
                  if (((bh) this).field_C) {
                    break L17;
                  } else {
                    if (param4) {
                      L18: {
                        if (var8 == 0) {
                          mn.b(6, 1);
                          break L18;
                        } else {
                          fr.a(1, 83);
                          break L18;
                        }
                      }
                      if (var7 == 0) {
                        mn.b(param2 ^ 134, 0);
                        break L17;
                      } else {
                        fr.a(0, 127);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                var9 = 0;
                L19: while (true) {
                  if (~var9 <= ~((bh) this).field_t) {
                    L20: {
                      if (((bh) this).field_e != 0) {
                        ((bh) this).field_I = ((bh) this).field_I - 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var9 = 0;
                    L21: while (true) {
                      if (~((bh) this).field_f.length >= ~var9) {
                        var9 = 0;
                        L22: while (true) {
                          if (~((bh) this).field_L >= ~var9) {
                            L23: {
                              if (param2 == 128) {
                                break L23;
                              } else {
                                ((bh) this).field_d = 12;
                                break L23;
                              }
                            }
                            var9 = 0;
                            L24: while (true) {
                              if (~var9 <= ~((bh) this).field_t) {
                                return false;
                              } else {
                                L25: {
                                  if (((bh) this).field_i[var9].field_p != 23) {
                                    break L25;
                                  } else {
                                    if (((bh) this).field_i[var9].field_k <= 20) {
                                      break L25;
                                    } else {
                                      var10 = 0;
                                      L26: while (true) {
                                        if (((bh) this).field_f.length <= var10) {
                                          L27: {
                                            if (((bh) this).field_C) {
                                              break L27;
                                            } else {
                                              if (param4) {
                                                gm.a(21, (byte) -55);
                                                break L27;
                                              } else {
                                                break L27;
                                              }
                                            }
                                          }
                                          ((bh) this).field_i[var9].a(28, (byte) -127);
                                          break L25;
                                        } else {
                                          var11 = 0;
                                          L28: while (true) {
                                            if (var11 >= 9) {
                                              var10++;
                                              continue L26;
                                            } else {
                                              if (~var9 != ~((bh) this).field_f[var10].field_P[var11]) {
                                                var11++;
                                                continue L28;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var9++;
                                continue L24;
                              }
                            }
                          } else {
                            L29: {
                              if (((bh) this).field_b[var9] == null) {
                                break L29;
                              } else {
                                if (((bh) this).field_b[var9].field_p == 23) {
                                  var10 = 0;
                                  L30: while (true) {
                                    if (((bh) this).field_f.length <= var10) {
                                      L31: {
                                        if (((bh) this).field_C) {
                                          break L31;
                                        } else {
                                          if (param4) {
                                            gm.a(21, (byte) -55);
                                            break L31;
                                          } else {
                                            break L31;
                                          }
                                        }
                                      }
                                      ((bh) this).field_b[var9].a(28, (byte) -126);
                                      break L29;
                                    } else {
                                      var11 = 0;
                                      L32: while (true) {
                                        if (9 <= var11) {
                                          var10++;
                                          continue L30;
                                        } else {
                                          if (((bh) this).field_f[var10].field_L[var11] != var9) {
                                            var11++;
                                            continue L32;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var9++;
                            continue L22;
                          }
                        }
                      } else {
                        L33: {
                          if (!param1[var9]) {
                            L34: {
                              var10_ref_wo = ((bh) this).field_f[var9];
                              var11 = 0;
                              if (var9 < param3.length) {
                                var11 = param3[var9];
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                            L35: {
                              if (!wo.a(var11, param2 + -29401)) {
                                break L35;
                              } else {
                                int discarded$5 = 5;
                                if (this.e()) {
                                  this.j(0);
                                  break L35;
                                } else {
                                  var10_ref_wo.c(3);
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              int discarded$6 = 5;
                              if (this.e()) {
                                boolean discarded$7 = var10_ref_wo.a((byte) 68, 0);
                                break L36;
                              } else {
                                boolean discarded$8 = var10_ref_wo.a((byte) 86, qm.a(var11, (byte) -115));
                                if (!he.a((byte) -100, var11)) {
                                  break L36;
                                } else {
                                  var10_ref_wo.e((byte) -122);
                                  break L36;
                                }
                              }
                            }
                            L37: {
                              if (var10_ref_wo.j((byte) 114)) {
                                this.a(var10_ref_wo.field_k, var10_ref_wo.field_w, param2 ^ 176, var10_ref_wo.field_y, var10_ref_wo.field_E, param4);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            L38: {
                              L39: {
                                stackOut_184_0 = (wo) var10_ref_wo;
                                stackOut_184_1 = 80;
                                stackIn_187_0 = stackOut_184_0;
                                stackIn_187_1 = stackOut_184_1;
                                stackIn_185_0 = stackOut_184_0;
                                stackIn_185_1 = stackOut_184_1;
                                if (((bh) this).field_e == 1) {
                                  break L39;
                                } else {
                                  stackOut_185_0 = (wo) (Object) stackIn_185_0;
                                  stackOut_185_1 = stackIn_185_1;
                                  stackIn_188_0 = stackOut_185_0;
                                  stackIn_188_1 = stackOut_185_1;
                                  stackIn_186_0 = stackOut_185_0;
                                  stackIn_186_1 = stackOut_185_1;
                                  if (((bh) this).field_e != 5) {
                                    stackOut_188_0 = (wo) (Object) stackIn_188_0;
                                    stackOut_188_1 = stackIn_188_1;
                                    stackOut_188_2 = 0;
                                    stackIn_189_0 = stackOut_188_0;
                                    stackIn_189_1 = stackOut_188_1;
                                    stackIn_189_2 = stackOut_188_2;
                                    break L38;
                                  } else {
                                    stackOut_186_0 = (wo) (Object) stackIn_186_0;
                                    stackOut_186_1 = stackIn_186_1;
                                    stackIn_187_0 = stackOut_186_0;
                                    stackIn_187_1 = stackOut_186_1;
                                    break L39;
                                  }
                                }
                              }
                              stackOut_187_0 = (wo) (Object) stackIn_187_0;
                              stackOut_187_1 = stackIn_187_1;
                              stackOut_187_2 = 1;
                              stackIn_189_0 = stackOut_187_0;
                              stackIn_189_1 = stackOut_187_1;
                              stackIn_189_2 = stackOut_187_2;
                              break L38;
                            }
                            L40: {
                              ((wo) (Object) stackIn_189_0).a((byte) stackIn_189_1, stackIn_189_2 != 0);
                              int discarded$9 = -91;
                              this.a(var9, var10_ref_wo, param4);
                              if (var10_ref_wo.field_d == -1) {
                                break L40;
                              } else {
                                var12_ref_rn = ((bh) this).field_i[var10_ref_wo.field_d];
                                if (var12_ref_rn == null) {
                                  break L40;
                                } else {
                                  var10_ref_wo.field_E = 64 + var12_ref_rn.field_l;
                                  var10_ref_wo.field_k = var12_ref_rn.field_s;
                                  var10_ref_wo.field_y = var12_ref_rn.field_g - -64;
                                  break L40;
                                }
                              }
                            }
                            L41: {
                              if (((bh) this).field_e == 3) {
                                break L41;
                              } else {
                                if (!var10_ref_wo.f((byte) 72)) {
                                  break L41;
                                } else {
                                  L42: {
                                    ((bh) this).field_e = 3;
                                    if (((bh) this).field_w == 1) {
                                      var14 = 0;
                                      var12 = var14;
                                      L43: while (true) {
                                        if (~((bh) this).field_f.length >= ~var14) {
                                          break L42;
                                        } else {
                                          ((bh) this).field_f[var14].k(8);
                                          var14++;
                                          continue L43;
                                        }
                                      }
                                    } else {
                                      break L42;
                                    }
                                  }
                                  this.b((byte) -96);
                                  return false;
                                }
                              }
                            }
                            if (((bh) this).field_e == 1) {
                              if (var10_ref_wo.e(false)) {
                                if (!var10_ref_wo.i(param2 + 10821)) {
                                  break L33;
                                } else {
                                  L44: {
                                    if (((bh) this).field_w != 2) {
                                      L45: {
                                        ((bh) this).field_n = 0;
                                        if (var9 != 0) {
                                          ((bh) this).field_B = true;
                                          break L45;
                                        } else {
                                          ((bh) this).field_J = true;
                                          break L45;
                                        }
                                      }
                                      ((bh) this).field_e = 5;
                                      break L44;
                                    } else {
                                      if (!param0) {
                                        break L44;
                                      } else {
                                        if (!on.a((byte) -110, 0)) {
                                          break L44;
                                        } else {
                                          if (!var10_ref_wo.k((byte) 102)) {
                                            break L44;
                                          } else {
                                            var10_ref_wo.d(param2 + -133);
                                            this.a(true, (byte) 76);
                                            break L44;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var9 != 0) {
                                    ((bh) this).field_d = ((bh) this).field_d + 1;
                                    break L33;
                                  } else {
                                    ((bh) this).field_p = ((bh) this).field_p + 1;
                                    break L33;
                                  }
                                }
                              } else {
                                break L33;
                              }
                            } else {
                              break L33;
                            }
                          } else {
                            break L33;
                          }
                        }
                        var9++;
                        continue L21;
                      }
                    }
                  } else {
                    L46: {
                      L47: {
                        ((bh) this).field_i[var9].field_d = (byte) 0;
                        if (((bh) this).field_i[var9].field_p == 1) {
                          break L47;
                        } else {
                          if (((bh) this).field_i[var9].field_p != 2) {
                            break L46;
                          } else {
                            break L47;
                          }
                        }
                      }
                      var10 = 0;
                      var11 = 0;
                      L48: while (true) {
                        L49: {
                          if (var11 >= ((bh) this).field_f.length) {
                            break L49;
                          } else {
                            if (((bh) this).field_i[var9].a(((bh) this).field_f[var11].field_y, -98, ((bh) this).field_f[var11].field_E, ((bh) this).field_f[var11].field_k) >= 57600) {
                              var11++;
                              continue L48;
                            } else {
                              var10 = 1;
                              break L49;
                            }
                          }
                        }
                        if (var10 == 0) {
                          ((bh) this).field_i[var9].c(0);
                          break L46;
                        } else {
                          ((bh) this).field_i[var9].c(false);
                          break L46;
                        }
                      }
                    }
                    L50: {
                      if (!((bh) this).field_i[var9].b(7579)) {
                        L51: {
                          var11 = ((bh) this).field_i[var9].field_D;
                          var12 = ((bh) this).field_i[var9].field_E;
                          this.a(var9, var11, param2 + -126, var12);
                          if (((bh) this).field_i[var9].field_B != ((bh) this).field_i[var9].field_x) {
                            break L51;
                          } else {
                            ((bh) this).field_i[var9].field_v = 0;
                            break L51;
                          }
                        }
                        if (22 != ((bh) this).field_i[var9].field_p) {
                          break L50;
                        } else {
                          if (50 < ((bh) this).field_i[var9].field_k) {
                            this.a(((bh) this).field_i[var9].field_s, 2, 119, 64 + ((bh) this).field_i[var9].field_g, 64 + ((bh) this).field_i[var9].field_l, param4);
                            break L50;
                          } else {
                            break L50;
                          }
                        }
                      } else {
                        this.a(var9, false);
                        break L50;
                      }
                    }
                    var9++;
                    continue L19;
                  }
                }
              } else {
                L52: {
                  if (((bh) this).field_b[var9] != null) {
                    L53: {
                      L54: {
                        ((bh) this).field_b[var9].field_d = (byte) 0;
                        if (((bh) this).field_b[var9].field_p == 1) {
                          break L54;
                        } else {
                          if (((bh) this).field_b[var9].field_p == 2) {
                            break L54;
                          } else {
                            if (((bh) this).field_b[var9].field_p != 7) {
                              break L53;
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                      var10 = 0;
                      var11 = 0;
                      L55: while (true) {
                        L56: {
                          if (var11 >= ((bh) this).field_f.length) {
                            break L56;
                          } else {
                            if (128 > Math.abs(((bh) this).field_b[var9].field_s + -((bh) this).field_f[var11].field_k)) {
                              var10 = 1;
                              if (((bh) this).field_b[var9].field_p == 7) {
                                var8 = 1;
                                break L56;
                              } else {
                                var7 = 1;
                                break L56;
                              }
                            } else {
                              var11++;
                              continue L55;
                            }
                          }
                        }
                        if (var10 != 0) {
                          ((bh) this).field_b[var9].c(false);
                          break L53;
                        } else {
                          ((bh) this).field_b[var9].c(0);
                          break L53;
                        }
                      }
                    }
                    L57: {
                      if (!((bh) this).field_b[var9].b(7579)) {
                        stackOut_125_0 = 0;
                        stackIn_126_0 = stackOut_125_0;
                        break L57;
                      } else {
                        stackOut_124_0 = 1;
                        stackIn_126_0 = stackOut_124_0;
                        break L57;
                      }
                    }
                    L58: {
                      var10 = stackIn_126_0;
                      if (((bh) this).field_b[var9].field_p != 22) {
                        break L58;
                      } else {
                        if (((bh) this).field_b[var9].field_k <= 50) {
                          break L58;
                        } else {
                          this.a(((bh) this).field_b[var9].field_s, 2, 54, ((bh) this).field_b[var9].field_g + 64, ((bh) this).field_b[var9].field_l + 64, param4);
                          break L58;
                        }
                      }
                    }
                    if (var10 == 0) {
                      break L52;
                    } else {
                      ((bh) this).field_b[var9] = null;
                      break L52;
                    }
                  } else {
                    break L52;
                  }
                }
                var9++;
                continue L16;
              }
            }
          } else {
            L59: {
              if (!param1[var6_int]) {
                ((bh) this).field_f[var6_int].g(param2 ^ -247);
                break L59;
              } else {
                break L59;
              }
            }
            var6_int++;
            continue L0;
          }
        }
    }

    final boolean f(int param0) {
        if (param0 != 17940) {
            ((bh) this).field_B = false;
        }
        return 1 == ((bh) this).field_e ? true : false;
    }

    private final boolean e() {
        return ((bh) this).field_s;
    }

    final int h(int param0) {
        if (param0 != 9979) {
            return 87;
        }
        return ((bh) this).field_e;
    }

    final boolean k(int param0) {
        if (param0 <= 68) {
            return false;
        }
        return ((bh) this).field_J;
    }

    final void a(boolean param0, bh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            if (!param0) {
              L1: while (true) {
                if (var3_int >= ((bh) this).field_f.length) {
                  ((bh) this).field_L = param1.field_L;
                  var3_int = 0;
                  L2: while (true) {
                    if (var3_int >= 375) {
                      ((bh) this).field_I = param1.field_I;
                      ((bh) this).field_w = param1.field_w;
                      ((bh) this).field_t = param1.field_t;
                      var3_int = 0;
                      L3: while (true) {
                        if (((bh) this).field_t <= var3_int) {
                          ((bh) this).field_J = param1.field_J;
                          ((bh) this).field_x = param1.field_x;
                          ((bh) this).field_D = param1.field_D;
                          ((bh) this).field_E = param1.field_E;
                          ((bh) this).field_K = param1.field_K;
                          ((bh) this).field_s = param1.field_s;
                          ((bh) this).field_B = param1.field_B;
                          ((bh) this).field_j = param1.field_j;
                          ((bh) this).field_A = param1.field_A;
                          ((bh) this).field_h = param1.field_h;
                          ((bh) this).field_u = param1.field_u;
                          ((bh) this).field_e = param1.field_e;
                          ((bh) this).field_C = param1.field_C;
                          ((bh) this).field_v = param1.field_v;
                          ((bh) this).field_n = param1.field_n;
                          ((bh) this).field_q = param1.field_q;
                          ((bh) this).field_p = param1.field_p;
                          ((bh) this).field_k = param1.field_k;
                          ((bh) this).field_d = param1.field_d;
                          ((bh) this).field_m = param1.field_m;
                          ((bh) this).field_z = param1.field_z;
                          ((bh) this).field_G = param1.field_G;
                          ((bh) this).field_o = param1.field_o;
                          break L0;
                        } else {
                          L4: {
                            if (null != ((bh) this).field_i[var3_int]) {
                              ((bh) this).field_i[var3_int].a(param1.field_i[var3_int], -95);
                              break L4;
                            } else {
                              ((bh) this).field_i[var3_int] = new rn(param1.field_i[var3_int]);
                              break L4;
                            }
                          }
                          var3_int++;
                          continue L3;
                        }
                      }
                    } else {
                      L5: {
                        if (param1.field_b[var3_int] != null) {
                          if (((bh) this).field_b[var3_int] != null) {
                            ((bh) this).field_b[var3_int].a(param1.field_b[var3_int], -88);
                            break L5;
                          } else {
                            ((bh) this).field_b[var3_int] = new jg(param1.field_b[var3_int]);
                            break L5;
                          }
                        } else {
                          ((bh) this).field_b[var3_int] = null;
                          break L5;
                        }
                      }
                      var3_int++;
                      continue L2;
                    }
                  }
                } else {
                  ((bh) this).field_f[var3_int].a(param1.field_f[var3_int], 16777215);
                  var4 = ((bh) this).field_f[var3_int].field_H;
                  mc.field_e = 1951;
                  lj.field_k = 1986 - -var4;
                  sl.field_l = 1954;
                  ci.field_b = 1982;
                  var4 = ((bh) this).field_f[var3_int].field_W;
                  gi.field_u = var4 + 8768;
                  aj.field_e = 5180;
                  pn.field_R = 617;
                  c.field_h = 9170;
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("bh.P(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    private final void a(int param0, boolean param1, int param2, boolean param3, wo param4, int param5, int param6, byte param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jg var17 = null;
        jg var18 = null;
        jg var19 = null;
        jg var20 = null;
        int var21 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var21 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param3) {
                  break L2;
                } else {
                  if (param6 == 15) {
                    break L2;
                  } else {
                    if (param6 == 16) {
                      break L2;
                    } else {
                      if (param6 == 17) {
                        break L2;
                      } else {
                        if (param6 != 23) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (((bh) this).field_e != 1) {
                break L1;
              } else {
                L3: {
                  var9_int = this.a(param5, param2, (byte) -82, param0);
                  var12 = param6;
                  if (var12 == 7) {
                    var12 = 0;
                    L4: while (true) {
                      if (~var12 <= ~((bh) this).field_o) {
                        break L3;
                      } else {
                        L5: {
                          if (1 + param5 != ((bh) this).field_q[var12]) {
                            break L5;
                          } else {
                            if (((bh) this).field_u[var12] != 1 + param2) {
                              break L5;
                            } else {
                              if (((bh) this).field_G[var12] != 1 + param0) {
                                break L5;
                              } else {
                                var13 = -64 + ((bh) this).field_j[var12] * 128;
                                var14 = -64 + 128 * ((bh) this).field_x[var12];
                                var15 = (-1 + ((bh) this).field_k[var12]) * 240;
                                param4.a(12649, param0 * 240, param2 * 128 - -64, var15, 64 + param5 * 128, var13, var14);
                                return;
                              }
                            }
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    if (var12 != 15) {
                      if (var12 == 17) {
                        var11 = 128 * param2 - -64;
                        var10 = 128 * param5 - -64;
                        param4.a(false, var10, var11);
                        if (2 > param4.field_N) {
                          L6: {
                            L7: {
                              var12 = lj.a(param4.field_E - 40, false, 128);
                              var13 = lj.a(param4.field_E - -40, false, 128);
                              var14 = lj.a(param4.field_y + 40, false, 128);
                              var15 = lj.a(param4.field_y + -40, false, 128);
                              var16 = lj.a(param4.field_k, false, 240);
                              var17 = ((bh) this).a((byte) 108, var15, var12, var16);
                              var18 = ((bh) this).a((byte) 108, var15, var13, var16);
                              var19 = ((bh) this).a((byte) 108, var14, var13, var16);
                              var20 = ((bh) this).a((byte) 108, var14, var12, var16);
                              if (var17 == null) {
                                break L7;
                              } else {
                                if (var17.field_p == 17) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var18 == null) {
                                break L8;
                              } else {
                                if (17 == var18.field_p) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (var19 == null) {
                                break L9;
                              } else {
                                if (var19.field_p == 17) {
                                  break L6;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (var20 == null) {
                              break L3;
                            } else {
                              if (17 != var20.field_p) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                          param4.field_N = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      if (param4.c((byte) -127) < 0) {
                        break L3;
                      } else {
                        ((bh) this).field_b[var9_int].a(23, (byte) -125);
                        break L3;
                      }
                    }
                  }
                }
                L10: {
                  if (param7 <= -31) {
                    break L10;
                  } else {
                    ((bh) this).field_q = null;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = this.a(param6, param1, 128, param3, param4);
                    if (var10 < 0) {
                      break L12;
                    } else {
                      if (~param6 != ~var10) {
                        if (0 > var9_int) {
                          break L12;
                        } else {
                          ((bh) this).field_b[var9_int].a(var10, (byte) -127);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  break L11;
                }
                break L0;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var9 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var9;
            stackOut_48_1 = new StringBuilder().append("bh.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param4 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L13;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L13;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    private final int a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        L0: {
          if (param0 < 0) {
            break L0;
          } else {
            if (param1 < 0) {
              break L0;
            } else {
              if (param0 >= 5) {
                break L0;
              } else {
                if (param1 >= 5) {
                  break L0;
                } else {
                  if (param3 < 0) {
                    break L0;
                  } else {
                    if (param3 >= 15) {
                      break L0;
                    } else {
                      var5 = param3 * 25 + (param1 * 5 + param0);
                      if (~((bh) this).field_L >= ~var5) {
                        return -1;
                      } else {
                        if (param2 < -62) {
                          return var5;
                        } else {
                          return 70;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        Object var7 = null;
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
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var7 = null;
          var8 = param4 / 128;
          if (param2 >= 37) {
            break L0;
          } else {
            boolean discarded$1 = ((bh) this).k(-108);
            break L0;
          }
        }
        L1: {
          var9 = param3 / 128;
          if (!((bh) this).field_C) {
            var7 = (Object) (Object) this.a(false);
            ((ho) var7).field_j = param3;
            ((ho) var7).field_b = param4;
            ((ho) var7).field_c = param0;
            ((ho) var7).field_h = (byte)param1;
            break L1;
          } else {
            break L1;
          }
        }
        var10 = param0 / 240;
        var11 = 0;
        L2: while (true) {
          if (var11 >= ((bh) this).field_t) {
            var19 = 0;
            var11 = var19;
            L3: while (true) {
              if (((bh) this).field_L <= var19) {
                L4: {
                  if (((bh) this).field_C) {
                    break L4;
                  } else {
                    if (param5) {
                      gm.a(1, (byte) -55);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                return;
              } else {
                if (null != ((bh) this).field_b[var19]) {
                  var12 = ((bh) this).field_b[var19].field_h;
                  var13 = ((bh) this).field_b[var19].field_r;
                  var14 = ((bh) this).field_b[var19].field_o;
                  if (var14 == var10) {
                    if (-2 <= (-var8 + var12) * (var12 - var8)) {
                      if (-2 >= (-var9 + var13) * (var13 - var9)) {
                        L5: {
                          if (var7 == null) {
                            break L5;
                          } else {
                            ((ho) var7).a(64 + ((bh) this).field_b[var19].field_l, ((bh) this).field_b[var19].field_g + 64, ((bh) this).field_b[var19].field_s, this.a(0, ((bh) this).field_b[var19].field_p), -30439);
                            break L5;
                          }
                        }
                        ((bh) this).field_b[var19] = null;
                        var19++;
                        continue L3;
                      } else {
                        var19++;
                        continue L3;
                      }
                    } else {
                      var19++;
                      continue L3;
                    }
                  } else {
                    var19++;
                    continue L3;
                  }
                } else {
                  var19++;
                  continue L3;
                }
              }
            }
          } else {
            var12 = ((bh) this).field_i[var11].field_l;
            var13 = ((bh) this).field_i[var11].field_g;
            var14 = ((bh) this).field_i[var11].field_s;
            var15 = -var8 + (64 + var12) / 128;
            var16 = -var9 + (64 + var13) / 128;
            var17 = -var10 + (var14 - -120) / 240;
            if (-1 <= var15) {
              if (1 >= var15) {
                if (var16 >= -1) {
                  if (var16 <= 1) {
                    if (var17 >= -1) {
                      if (var17 <= 1) {
                        L6: {
                          if (var7 != null) {
                            ((ho) var7).a(64 + var12, var13 - -64, var14, this.a(0, ((bh) this).field_i[var11].field_p), -30439);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        this.a(var11, false);
                        var11--;
                        var11++;
                        continue L2;
                      } else {
                        var11++;
                        continue L2;
                      }
                    } else {
                      var11++;
                      continue L2;
                    }
                  } else {
                    var11++;
                    continue L2;
                  }
                } else {
                  var11++;
                  continue L2;
                }
              } else {
                var11++;
                continue L2;
              }
            } else {
              var11++;
              continue L2;
            }
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        ((bh) this).field_n = 0;
        ((bh) this).field_L = 375;
        ((bh) this).field_t = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((bh) this).field_L) {
            L1: {
              L2: {
                if (((bh) this).field_w == 0) {
                  break L2;
                } else {
                  if (((bh) this).field_w == 3) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var2 = 0;
                var3 = 0;
                var4 = 0;
                var5 = var3 * 5 + (var2 + var4 * 25);
                if (((bh) this).field_b[var5] != null) {
                  break L3;
                } else {
                  ((bh) this).field_b[var5] = new jg(4, 0, 0, 0);
                  break L3;
                }
              }
              ((bh) this).field_b[var5].a(4, (byte) -127);
              ((bh) this).field_b[var5].field_h = var2;
              ((bh) this).field_b[var5].field_r = var3;
              ((bh) this).field_b[var5].field_o = var4;
              ((bh) this).field_b[var5].field_l = 128 * var2;
              ((bh) this).field_b[var5].field_g = 128 * var3;
              ((bh) this).field_b[var5].field_s = var4 * 240;
              ((bh) this).field_f[0].field_O = 0;
              ((bh) this).field_f[0].field_c = 0;
              ((bh) this).field_f[0].field_E = ((bh) this).field_b[var5].field_l + 64;
              ((bh) this).field_f[0].field_y = 64 + ((bh) this).field_b[var5].field_g;
              ((bh) this).field_f[0].field_k = -300;
              ((bh) this).field_f[0].c(0, 10);
              break L1;
            }
            L4: {
              L5: {
                if (((bh) this).field_w == 1) {
                  break L5;
                } else {
                  if (((bh) this).field_w == 2) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                var2 = 0;
                var3 = 2;
                var4 = 0;
                var5 = var3 * 5 + (var2 - -(25 * var4));
                if (((bh) this).field_b[var5] == null) {
                  ((bh) this).field_b[var5] = new jg(4, 0, 0, 0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ((bh) this).field_b[var5].a(4, (byte) -125);
                ((bh) this).field_b[var5].field_h = var2;
                ((bh) this).field_b[var5].field_r = var3;
                ((bh) this).field_b[var5].field_o = var4;
                ((bh) this).field_b[var5].field_l = 128 * var2;
                ((bh) this).field_b[var5].field_g = 128 * var3;
                ((bh) this).field_b[var5].field_s = var4 * 240;
                ((bh) this).field_f[0].field_O = 0;
                ((bh) this).field_f[0].field_c = 0;
                ((bh) this).field_f[0].field_E = 64 + ((bh) this).field_b[var5].field_l;
                ((bh) this).field_f[0].field_y = ((bh) this).field_b[var5].field_g + 64;
                ((bh) this).field_f[0].field_k = -300;
                ((bh) this).field_f[0].c(0, 10);
                var6 = 2;
                var7 = 0;
                var8 = 0;
                var9 = 25 * var8 + (5 * var7 + var6);
                if (((bh) this).field_b[var9] != null) {
                  break L7;
                } else {
                  ((bh) this).field_b[var9] = new jg(3, 0, 0, 0);
                  break L7;
                }
              }
              ((bh) this).field_b[var9].a(3, (byte) -123);
              ((bh) this).field_b[var9].field_h = var6;
              ((bh) this).field_b[var9].field_r = var7;
              ((bh) this).field_b[var9].field_o = var8;
              ((bh) this).field_b[var9].field_l = var6 * 128;
              ((bh) this).field_b[var9].field_g = 128 * var7;
              ((bh) this).field_b[var9].field_s = var8 * 240;
              ((bh) this).field_f[0].field_O = 0;
              ((bh) this).field_f[1].field_c = 0;
              ((bh) this).field_f[1].field_E = 64 + ((bh) this).field_b[var9].field_l;
              ((bh) this).field_f[1].field_y = ((bh) this).field_b[var9].field_g + 64;
              ((bh) this).field_f[1].field_k = -300;
              ((bh) this).field_f[1].c(512, 10);
              break L4;
            }
            L8: {
              if (param0 < -79) {
                break L8;
              } else {
                ((bh) this).field_I = -89;
                break L8;
              }
            }
            return;
          } else {
            ((bh) this).field_b[var2] = null;
            var2++;
            continue L0;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != -2) {
            ((bh) this).field_k = null;
        }
        return ((bh) this).field_s;
    }

    private final int a(int param0, boolean param1, int param2, boolean param3, wo param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 128) {
                break L1;
              } else {
                ((bh) this).field_t = -85;
                break L1;
              }
            }
            L2: {
              if (!param4.a(703)) {
                break L2;
              } else {
                if (1 == ((bh) this).field_e) {
                  if (param0 == 9) {
                    ((bh) this).field_s = true;
                    param4.field_O = 0;
                    param4.field_c = 0;
                    stackOut_17_0 = 27;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  } else {
                    L3: {
                      if (param0 != 19) {
                        break L3;
                      } else {
                        if (!param3) {
                          break L3;
                        } else {
                          var6_int = 0;
                          L4: while (true) {
                            if (((bh) this).field_f.length <= var6_int) {
                              break L3;
                            } else {
                              L5: {
                                if (param4 != ((bh) this).field_f[var6_int]) {
                                  ((bh) this).field_f[var6_int].d((byte) 4);
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var6_int++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_19_0 = param4.a(-1, param3, ((bh) this).field_w, param1, param0, 18113);
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("bh.V(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    final jg a(byte param0, int param1, int param2, int param3) {
        if (param2 < 0) {
            return null;
        }
        if (param1 < 0) {
            return null;
        }
        if (5 <= param2) {
            return null;
        }
        if (param1 >= 5) {
            return null;
        }
        if (0 > param3) {
            return null;
        }
        if (param3 >= 15) {
            return null;
        }
        if (param0 != 108) {
            ((bh) this).field_L = -85;
        }
        int var5 = param3 * 25 + (5 * param1 + param2);
        if (var5 >= ((bh) this).field_L) {
            return null;
        }
        return ((bh) this).field_b[var5];
    }

    final int c(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jg var6_ref_jg = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (~((bh) this).field_L >= ~var5) {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                this.j(56);
                break L1;
              }
            }
            var9 = 0;
            var5 = var9;
            L2: while (true) {
              if (((bh) this).field_t <= var9) {
                if (var4 == 0) {
                  return 100;
                } else {
                  return var3 * 100 / var4;
                }
              } else {
                L3: {
                  if (((bh) this).field_i[var9].field_A != 10) {
                    L4: {
                      L5: {
                        var6 = ((bh) this).field_i[var9].field_p;
                        if (1 == var6) {
                          break L5;
                        } else {
                          if (var6 == 3) {
                            break L5;
                          } else {
                            if (!param1) {
                              break L4;
                            } else {
                              if (var6 == 10) {
                                break L5;
                              } else {
                                if (var6 == 26) {
                                  break L5;
                                } else {
                                  if (var6 == 15) {
                                    break L5;
                                  } else {
                                    if (var6 == 23) {
                                      break L5;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var4++;
                      break L4;
                    }
                    L6: {
                      if (var6 == 2) {
                        break L6;
                      } else {
                        if (var6 == 4) {
                          break L6;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            if (var6 == 5) {
                              break L6;
                            } else {
                              if (var6 != 25) {
                                break L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    var3++;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var9++;
                continue L2;
              }
            }
          } else {
            L7: {
              var6_ref_jg = ((bh) this).field_b[var5];
              if (var6_ref_jg != null) {
                L8: {
                  L9: {
                    var7 = var6_ref_jg.field_p;
                    if (var7 == 1) {
                      break L9;
                    } else {
                      if (3 == var7) {
                        break L9;
                      } else {
                        if (!param1) {
                          break L8;
                        } else {
                          if (var7 == 10) {
                            break L9;
                          } else {
                            if (var7 == 26) {
                              break L9;
                            } else {
                              if (var7 == 15) {
                                break L9;
                              } else {
                                if (var7 != 23) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var4++;
                  break L8;
                }
                L10: {
                  if (var7 == 2) {
                    break L10;
                  } else {
                    if (var7 == 4) {
                      break L10;
                    } else {
                      if (!param1) {
                        break L7;
                      } else {
                        if (5 == var7) {
                          break L10;
                        } else {
                          if (var7 == 25) {
                            break L10;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                }
                var4++;
                var3++;
                break L7;
              } else {
                break L7;
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    final jg[] c(int param0) {
        if (param0 <= 90) {
            field_a = null;
        }
        return ((bh) this).field_b;
    }

    private final void a(int param0, wo param1, boolean param2) {
        int var5_int = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        jg var23_ref_jg = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        jg var34_ref_jg = null;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var46 = 0;
        jg var47 = null;
        jg var48 = null;
        jg var49 = null;
        jg var50 = null;
        jg var51 = null;
        jg var52 = null;
        jg var53 = null;
        jg var54 = null;
        jg var55 = null;
        jg var56 = null;
        jg var57 = null;
        jg var58 = null;
        jg var59 = null;
        jg var60 = null;
        jg var61 = null;
        jg var62 = null;
        jg var63 = null;
        int stackIn_3_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_197_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_141_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_196_0 = 0;
        L0: {
          var46 = Vertigo2.field_L ? 1 : 0;
          var5_int = param1.field_E;
          var6 = param1.field_y;
          var7 = param1.field_k;
          var8 = param1.field_z ? 1 : 0;
          param1.field_C = (byte) 0;
          param1.field_z = false;
          var9 = lj.a(var5_int, false, 128);
          var10 = lj.a(var6, false, 128);
          var11 = lj.a(120 + var7, false, 240);
          var12 = -40 + var5_int;
          var13 = var5_int + 40;
          var14 = var6 + -40;
          var15 = 40 + var6;
          if (param1.b(-1) != 4) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var16 = stackIn_3_0;
        var17 = 0;
        var18 = 0;
        var19 = 2147483647;
        var20 = 0;
        L1: while (true) {
          if (~((bh) this).field_t >= ~var20) {
            L2: {
              if (0 >= var18) {
                break L2;
              } else {
                param1.field_k = var19;
                break L2;
              }
            }
            L3: {
              if (var16 == 0) {
                var20 = 0;
                L4: while (true) {
                  if (~((bh) this).field_t >= ~var20) {
                    break L3;
                  } else {
                    L5: {
                      if (((bh) this).field_i[var20].field_A != 4) {
                        break L5;
                      } else {
                        if (((bh) this).field_i[var20].b(var12, var14, var7, var15, var13, 0)) {
                          ((bh) this).field_i[var20].field_d = (byte)(((bh) this).field_i[var20].field_d | 1 << param0);
                          if (0 <= ((bh) this).field_i[var20].field_v) {
                            if (!param1.f(-1)) {
                              break L5;
                            } else {
                              param1.field_z = true;
                              param1.b(0, -7394);
                              var18--;
                              param1.field_k = ((bh) this).field_i[var20].field_s;
                              break L5;
                            }
                          } else {
                            param1.field_k = param1.field_k + ((bh) this).field_i[var20].field_v;
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    var20++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              L7: {
                var20 = -(var11 * 240) + var7;
                if (0 > var20) {
                  break L7;
                } else {
                  if (var20 >= 16) {
                    break L7;
                  } else {
                    stackOut_27_0 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    break L6;
                  }
                }
              }
              stackOut_28_0 = 0;
              stackIn_29_0 = stackOut_28_0;
              break L6;
            }
            L8: {
              var21 = stackIn_29_0;
              if (var21 == 0) {
                break L8;
              } else {
                if (var16 == 0) {
                  var22 = 0;
                  L9: while (true) {
                    if (((bh) this).field_L <= var22) {
                      break L8;
                    } else {
                      L10: {
                        var23_ref_jg = ((bh) this).field_b[var22];
                        var34_ref_jg = var23_ref_jg;
                        var34_ref_jg = var23_ref_jg;
                        if (var23_ref_jg == null) {
                          break L10;
                        } else {
                          if (var11 == var23_ref_jg.field_o) {
                            L11: {
                              var24 = ((bh) this).field_b[var22].field_l;
                              var25 = ((bh) this).field_b[var22].field_g;
                              if (13 == var23_ref_jg.field_p) {
                                L12: {
                                  if (~(48 + var24) >= ~var5_int) {
                                    if (~var5_int >= ~(var24 - -80)) {
                                      break L12;
                                    } else {
                                      param1.field_c = param1.field_c + 14;
                                      break L12;
                                    }
                                  } else {
                                    param1.field_c = param1.field_c - 14;
                                    break L12;
                                  }
                                }
                                if (var6 >= var25 - -48) {
                                  if (~(var25 + 80) <= ~var6) {
                                    break L11;
                                  } else {
                                    param1.field_O = param1.field_O + 14;
                                    break L11;
                                  }
                                } else {
                                  param1.field_O = param1.field_O - 14;
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                            if (var23_ref_jg.field_p == 14) {
                              L13: {
                                if (var24 - -56 <= var5_int) {
                                  if (var5_int > var24 - -72) {
                                    param1.field_c = param1.field_c - 14;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  param1.field_c = param1.field_c + 14;
                                  break L13;
                                }
                              }
                              if (~(var25 - -56) >= ~var6) {
                                if (72 + var25 >= var6) {
                                  break L10;
                                } else {
                                  param1.field_O = param1.field_O - 14;
                                  break L10;
                                }
                              } else {
                                param1.field_O = param1.field_O + 14;
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                      }
                      var22++;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L14: {
              if (var16 != 0) {
                break L14;
              } else {
                var22 = 0;
                L15: while (true) {
                  if (((bh) this).field_t <= var22) {
                    break L14;
                  } else {
                    L16: {
                      if (!((bh) this).field_i[var22].b(var12, var14, var7, var15, var13, 0)) {
                        break L16;
                      } else {
                        if (((bh) this).field_i[var22].field_A != 2) {
                          if (((bh) this).field_i[var22].field_A != 3) {
                            break L16;
                          } else {
                            param1.field_y = param1.field_y + ((bh) this).field_i[var22].field_v;
                            break L16;
                          }
                        } else {
                          param1.field_E = param1.field_E + ((bh) this).field_i[var22].field_v;
                          break L16;
                        }
                      }
                    }
                    var22++;
                    continue L15;
                  }
                }
              }
            }
            L17: {
              var22 = lj.a(var12, false, 128);
              var23 = lj.a(var13, false, 128);
              var24 = lj.a(var14, false, 128);
              var25 = lj.a(var15, false, 128);
              if (var22 == var9) {
                stackOut_70_0 = 0;
                stackIn_71_0 = stackOut_70_0;
                break L17;
              } else {
                stackOut_69_0 = 1;
                stackIn_71_0 = stackOut_69_0;
                break L17;
              }
            }
            L18: {
              var26 = stackIn_71_0;
              if (var23 == var9) {
                stackOut_73_0 = 0;
                stackIn_74_0 = stackOut_73_0;
                break L18;
              } else {
                stackOut_72_0 = 1;
                stackIn_74_0 = stackOut_72_0;
                break L18;
              }
            }
            L19: {
              var27 = stackIn_74_0;
              if (var10 == var24) {
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
                break L19;
              } else {
                stackOut_75_0 = 1;
                stackIn_77_0 = stackOut_75_0;
                break L19;
              }
            }
            L20: {
              var28 = stackIn_77_0;
              if (~var10 == ~var25) {
                stackOut_79_0 = 0;
                stackIn_80_0 = stackOut_79_0;
                break L20;
              } else {
                stackOut_78_0 = 1;
                stackIn_80_0 = stackOut_78_0;
                break L20;
              }
            }
            L21: {
              var29 = stackIn_80_0;
              if (var18 <= 0) {
                stackOut_82_0 = 0;
                stackIn_83_0 = stackOut_82_0;
                break L21;
              } else {
                stackOut_81_0 = 1;
                stackIn_83_0 = stackOut_81_0;
                break L21;
              }
            }
            var30 = stackIn_83_0;
            var31 = 0;
            var32 = Math.abs(param1.c((byte) -127));
            var33 = 0;
            L22: while (true) {
              L23: {
                if (var21 == 0) {
                  break L23;
                } else {
                  L24: {
                    var34_ref_jg = ((bh) this).a((byte) 108, var10, var9, var11);
                    if (var34_ref_jg == null) {
                      break L24;
                    } else {
                      var31 = param1.a(100, var31, this.a(var9, var10, (byte) -124, var11));
                      var30 = 1;
                      param1.field_C = (byte)(param1.field_C | this.b(var34_ref_jg.field_p, false));
                      this.a(var11, param2, var10, var34_ref_jg.b(var12, var14, var7, var15, var13, 0), param1, var9, var34_ref_jg.field_p, (byte) -113);
                      break L24;
                    }
                  }
                  L25: {
                    if (var26 != 0) {
                      var47 = ((bh) this).a((byte) 108, var10, var22, var11);
                      if (var47 != null) {
                        var31 = param1.a(71, var31, this.a(var22, var10, (byte) -113, var11));
                        var30 = 1;
                        param1.field_C = (byte)(param1.field_C | this.b(var47.field_p, false));
                        this.a(var11, param2, var10, false, param1, var22, var47.field_p, (byte) -108);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var27 != 0) {
                      var48 = ((bh) this).a((byte) 108, var10, var23, var11);
                      if (var48 != null) {
                        var31 = param1.a(127, var31, this.a(var23, var10, (byte) -96, var11));
                        var30 = 1;
                        param1.field_C = (byte)(param1.field_C | this.b(var48.field_p, false));
                        this.a(var11, param2, var10, false, param1, var23, var48.field_p, (byte) -79);
                        break L26;
                      } else {
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var29 == 0) {
                      break L27;
                    } else {
                      var49 = ((bh) this).a((byte) 108, var25, var9, var11);
                      if (var49 != null) {
                        var30 = 1;
                        var31 = param1.a(-125, var31, this.a(var9, var25, (byte) -86, var11));
                        param1.field_C = (byte)(param1.field_C | this.b(var49.field_p, false));
                        this.a(var11, param2, var25, false, param1, var9, var49.field_p, (byte) -95);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (var28 == 0) {
                      break L28;
                    } else {
                      var50 = ((bh) this).a((byte) 108, var24, var9, var11);
                      if (var50 != null) {
                        var31 = param1.a(-89, var31, this.a(var9, var24, (byte) -76, var11));
                        var30 = 1;
                        param1.field_C = (byte)(param1.field_C | this.b(var50.field_p, false));
                        this.a(var11, param2, var24, false, param1, var9, var50.field_p, (byte) -33);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L29: {
                    if (var26 == 0) {
                      break L29;
                    } else {
                      if (var28 != 0) {
                        var51 = ((bh) this).a((byte) 108, var24, var22, var11);
                        if (var51 == null) {
                          break L29;
                        } else {
                          var30 = 1;
                          var31 = param1.a(84, var31, this.a(var22, var24, (byte) -81, var11));
                          param1.field_C = (byte)(param1.field_C | this.b(var51.field_p, false));
                          this.a(var11, param2, var24, false, param1, var22, var51.field_p, (byte) -85);
                          break L29;
                        }
                      } else {
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (var27 == 0) {
                      break L30;
                    } else {
                      if (var28 == 0) {
                        break L30;
                      } else {
                        var52 = ((bh) this).a((byte) 108, var24, var23, var11);
                        if (var52 == null) {
                          break L30;
                        } else {
                          var31 = param1.a(110, var31, this.a(var23, var24, (byte) -63, var11));
                          var30 = 1;
                          param1.field_C = (byte)(param1.field_C | this.b(var52.field_p, false));
                          this.a(var11, param2, var24, false, param1, var23, var52.field_p, (byte) -107);
                          break L30;
                        }
                      }
                    }
                  }
                  L31: {
                    if (var27 == 0) {
                      break L31;
                    } else {
                      if (var29 != 0) {
                        var53 = ((bh) this).a((byte) 108, var25, var23, var11);
                        if (var53 != null) {
                          var31 = param1.a(68, var31, this.a(var23, var25, (byte) -70, var11));
                          var30 = 1;
                          param1.field_C = (byte)(param1.field_C | this.b(var53.field_p, false));
                          this.a(var11, param2, var25, false, param1, var23, var53.field_p, (byte) -83);
                          break L31;
                        } else {
                          break L31;
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  if (var26 == 0) {
                    break L23;
                  } else {
                    if (var29 != 0) {
                      var54 = ((bh) this).a((byte) 108, var25, var22, var11);
                      if (var54 != null) {
                        var31 = param1.a(-111, var31, this.a(var22, var25, (byte) -120, var11));
                        var30 = 1;
                        param1.field_C = (byte)(param1.field_C | this.b(var54.field_p, false));
                        this.a(var11, param2, var25, false, param1, var22, var54.field_p, (byte) -58);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                }
              }
              L32: {
                var32--;
                var34 = param1.c((byte) -127);
                if (var34 >= 0) {
                  if (var30 != 0) {
                    L33: {
                      if (param1.field_A) {
                        break L33;
                      } else {
                        if (var18 != 0) {
                          break L33;
                        } else {
                          param1.field_k = 240 * var11;
                          break L33;
                        }
                      }
                    }
                    param1.field_z = true;
                    param1.b(0, -7394);
                    var33 = 1;
                    if (var8 != 0) {
                      break L32;
                    } else {
                      if (((bh) this).field_C) {
                        break L32;
                      } else {
                        if (!param2) {
                          break L32;
                        } else {
                          gm.a(13, (byte) -55);
                          break L32;
                        }
                      }
                    }
                  } else {
                    param1.field_k = param1.field_k + 1;
                    break L32;
                  }
                } else {
                  param1.field_k = param1.field_k - 1;
                  break L32;
                }
              }
              L34: {
                var20 = param1.field_k - 240 * var11;
                if (!lf.field_C) {
                  break L34;
                } else {
                  L35: {
                    L36: {
                      var35 = 1;
                      if (var26 == 0) {
                        break L36;
                      } else {
                        if (var28 == 0) {
                          break L36;
                        } else {
                          stackOut_140_0 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          break L35;
                        }
                      }
                    }
                    stackOut_141_0 = 0;
                    stackIn_142_0 = stackOut_141_0;
                    break L35;
                  }
                  L37: {
                    L38: {
                      var36 = stackIn_142_0;
                      if (var27 == 0) {
                        break L38;
                      } else {
                        if (var28 == 0) {
                          break L38;
                        } else {
                          stackOut_144_0 = 1;
                          stackIn_146_0 = stackOut_144_0;
                          break L37;
                        }
                      }
                    }
                    stackOut_145_0 = 0;
                    stackIn_146_0 = stackOut_145_0;
                    break L37;
                  }
                  L39: {
                    L40: {
                      var37 = stackIn_146_0;
                      if (var27 == 0) {
                        break L40;
                      } else {
                        if (var29 == 0) {
                          break L40;
                        } else {
                          stackOut_148_0 = 1;
                          stackIn_150_0 = stackOut_148_0;
                          break L39;
                        }
                      }
                    }
                    stackOut_149_0 = 0;
                    stackIn_150_0 = stackOut_149_0;
                    break L39;
                  }
                  L41: {
                    L42: {
                      var38 = stackIn_150_0;
                      if (var26 == 0) {
                        break L42;
                      } else {
                        if (var29 == 0) {
                          break L42;
                        } else {
                          stackOut_152_0 = 1;
                          stackIn_154_0 = stackOut_152_0;
                          break L41;
                        }
                      }
                    }
                    stackOut_153_0 = 0;
                    stackIn_154_0 = stackOut_153_0;
                    break L41;
                  }
                  var39 = stackIn_154_0;
                  var40 = var26;
                  var41 = var27;
                  var42 = var29;
                  var43 = var28;
                  var44 = var11;
                  L43: while (true) {
                    if (var44 >= 15) {
                      break L34;
                    } else {
                      L44: {
                        if (var35 == 0) {
                          break L44;
                        } else {
                          var55 = ((bh) this).a((byte) 108, var10, var9, var44);
                          if (var55 != null) {
                            var35 = 0;
                            var55.field_d = (byte)(var55.field_d | 1 << param0);
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                      }
                      L45: {
                        if (var40 != 0) {
                          var56 = ((bh) this).a((byte) 108, var10, var22, var44);
                          if (var56 != null) {
                            var40 = 0;
                            var56.field_d = (byte)(var56.field_d | 1 << param0);
                            break L45;
                          } else {
                            break L45;
                          }
                        } else {
                          break L45;
                        }
                      }
                      L46: {
                        if (var41 == 0) {
                          break L46;
                        } else {
                          var57 = ((bh) this).a((byte) 108, var10, var23, var44);
                          if (var57 != null) {
                            var57.field_d = (byte)(var57.field_d | 1 << param0);
                            var41 = 0;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                      }
                      L47: {
                        if (var42 == 0) {
                          break L47;
                        } else {
                          var58 = ((bh) this).a((byte) 108, var25, var9, var44);
                          if (var58 != null) {
                            var42 = 0;
                            var58.field_d = (byte)(var58.field_d | 1 << param0);
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                      }
                      L48: {
                        if (var43 == 0) {
                          break L48;
                        } else {
                          var59 = ((bh) this).a((byte) 108, var24, var9, var44);
                          if (var59 != null) {
                            var43 = 0;
                            var59.field_d = (byte)(var59.field_d | 1 << param0);
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                      }
                      L49: {
                        if (var36 == 0) {
                          break L49;
                        } else {
                          var60 = ((bh) this).a((byte) 108, var24, var22, var44);
                          if (var60 != null) {
                            var36 = 0;
                            var60.field_d = (byte)(var60.field_d | 1 << param0);
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                      }
                      L50: {
                        if (var37 == 0) {
                          break L50;
                        } else {
                          var61 = ((bh) this).a((byte) 108, var24, var23, var44);
                          if (var61 == null) {
                            break L50;
                          } else {
                            var37 = 0;
                            var61.field_d = (byte)(var61.field_d | 1 << param0);
                            break L50;
                          }
                        }
                      }
                      L51: {
                        if (var38 == 0) {
                          break L51;
                        } else {
                          var62 = ((bh) this).a((byte) 108, var25, var23, var44);
                          if (var62 != null) {
                            var62.field_d = (byte)(var62.field_d | 1 << param0);
                            var38 = 0;
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                      }
                      L52: {
                        if (var39 == 0) {
                          break L52;
                        } else {
                          var63 = ((bh) this).a((byte) 108, var25, var22, var44);
                          if (var63 != null) {
                            var39 = 0;
                            var63.field_d = (byte)(var63.field_d | 1 << param0);
                            break L52;
                          } else {
                            break L52;
                          }
                        }
                      }
                      var44++;
                      continue L43;
                    }
                  }
                }
              }
              L53: {
                L54: {
                  if (var20 < 0) {
                    break L54;
                  } else {
                    if (var20 >= 16) {
                      break L54;
                    } else {
                      stackOut_195_0 = 1;
                      stackIn_197_0 = stackOut_195_0;
                      break L53;
                    }
                  }
                }
                stackOut_196_0 = 0;
                stackIn_197_0 = stackOut_196_0;
                break L53;
              }
              L55: {
                var21 = stackIn_197_0;
                if (var32 <= 0) {
                  break L55;
                } else {
                  if (var33 == 0) {
                    continue L22;
                  } else {
                    break L55;
                  }
                }
              }
              return;
            }
          } else {
            L56: {
              if (!((bh) this).field_i[var20].b(var12, var14, var7, var15, var13, 0)) {
                break L56;
              } else {
                L57: {
                  int incrementValue$1 = var17;
                  var17++;
                  param1.field_P[incrementValue$1] = var20;
                  if (var19 > ((bh) this).field_i[var20].field_s) {
                    var19 = ((bh) this).field_i[var20].field_s;
                    break L57;
                  } else {
                    break L57;
                  }
                }
                var18++;
                var21 = ((bh) this).field_i[var20].field_p;
                param1.field_C = (byte)(param1.field_C | this.b(var21, false));
                this.a(var20, param2, 27228, var21, param1);
                ((bh) this).field_i[var20].field_d = (byte)(((bh) this).field_i[var20].field_d | 1 << param0);
                break L56;
              }
            }
            var20++;
            continue L1;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        if (((bh) this).field_t + -1 != param0) {
            qq.a((Object[]) (Object) ((bh) this).field_i, 1 + param0, (Object[]) (Object) ((bh) this).field_i, param0, -param0 + 374);
        } else {
            ((bh) this).field_i[param0] = null;
        }
        ((bh) this).field_t = ((bh) this).field_t - 1;
    }

    private final ho a(boolean param0) {
        if (!(sk.field_e != th.field_e.length + -1)) {
            return th.field_e[0];
        }
        ho[] fieldTemp$0 = th.field_e;
        int fieldTemp$1 = sk.field_e + 1;
        sk.field_e = sk.field_e + 1;
        ho var2 = fieldTemp$0[fieldTemp$1];
        var2.b(-28233);
        return var2;
    }

    final int d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jg var6_ref_jg = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        Object stackIn_75_0 = null;
        Object stackIn_75_1 = null;
        int stackIn_75_2 = 0;
        Object stackIn_76_0 = null;
        Object stackIn_76_1 = null;
        int stackIn_76_2 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        Object stackIn_79_0 = null;
        Object stackIn_79_1 = null;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        Object stackIn_95_0 = null;
        Object stackIn_95_1 = null;
        int stackIn_95_2 = 0;
        Object stackIn_96_0 = null;
        Object stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        Object stackIn_97_0 = null;
        Object stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        Object stackIn_98_0 = null;
        Object stackIn_98_1 = null;
        int stackIn_98_2 = 0;
        Object stackIn_99_0 = null;
        Object stackIn_99_1 = null;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_94_0 = null;
        Object stackOut_94_1 = null;
        int stackOut_94_2 = 0;
        Object stackOut_95_0 = null;
        Object stackOut_95_1 = null;
        int stackOut_95_2 = 0;
        Object stackOut_98_0 = null;
        Object stackOut_98_1 = null;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        Object stackOut_96_0 = null;
        Object stackOut_96_1 = null;
        int stackOut_96_2 = 0;
        Object stackOut_97_0 = null;
        Object stackOut_97_1 = null;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        Object stackOut_74_0 = null;
        Object stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        Object stackOut_75_0 = null;
        Object stackOut_75_1 = null;
        int stackOut_75_2 = 0;
        Object stackOut_78_0 = null;
        Object stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        Object stackOut_76_0 = null;
        Object stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = 0;
          if (((bh) this).field_w == 2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        var5 = 0;
        L1: while (true) {
          if (((bh) this).field_L <= var5) {
            var5 = 0;
            L2: while (true) {
              if (((bh) this).field_t <= var5) {
                L3: {
                  if (param0 <= -34) {
                    break L3;
                  } else {
                    ((bh) this).field_C = false;
                    break L3;
                  }
                }
                L4: {
                  if (((bh) this).field_w == 0) {
                    break L4;
                  } else {
                    if (((bh) this).field_w == 1) {
                      break L4;
                    } else {
                      if (3 == ((bh) this).field_w) {
                        break L4;
                      } else {
                        if (((bh) this).field_I <= 0) {
                          L5: {
                            if (((bh) this).field_e == 3) {
                              break L5;
                            } else {
                              if (((bh) this).field_e == 2) {
                                break L5;
                              } else {
                                if (((bh) this).field_e == 6) {
                                  break L5;
                                } else {
                                  if (((bh) this).field_e == 7) {
                                    break L5;
                                  } else {
                                    L6: {
                                      L7: {
                                        stackOut_94_0 = this;
                                        stackOut_94_1 = this;
                                        stackOut_94_2 = 3;
                                        stackIn_97_0 = stackOut_94_0;
                                        stackIn_97_1 = stackOut_94_1;
                                        stackIn_97_2 = stackOut_94_2;
                                        stackIn_95_0 = stackOut_94_0;
                                        stackIn_95_1 = stackOut_94_1;
                                        stackIn_95_2 = stackOut_94_2;
                                        if (((bh) this).field_w == 0) {
                                          break L7;
                                        } else {
                                          stackOut_95_0 = this;
                                          stackOut_95_1 = this;
                                          stackOut_95_2 = stackIn_95_2;
                                          stackIn_98_0 = stackOut_95_0;
                                          stackIn_98_1 = stackOut_95_1;
                                          stackIn_98_2 = stackOut_95_2;
                                          stackIn_96_0 = stackOut_95_0;
                                          stackIn_96_1 = stackOut_95_1;
                                          stackIn_96_2 = stackOut_95_2;
                                          if (3 != ((bh) this).field_w) {
                                            stackOut_98_0 = this;
                                            stackOut_98_1 = this;
                                            stackOut_98_2 = stackIn_98_2;
                                            stackOut_98_3 = 0;
                                            stackIn_99_0 = stackOut_98_0;
                                            stackIn_99_1 = stackOut_98_1;
                                            stackIn_99_2 = stackOut_98_2;
                                            stackIn_99_3 = stackOut_98_3;
                                            break L6;
                                          } else {
                                            stackOut_96_0 = this;
                                            stackOut_96_1 = this;
                                            stackOut_96_2 = stackIn_96_2;
                                            stackIn_97_0 = stackOut_96_0;
                                            stackIn_97_1 = stackOut_96_1;
                                            stackIn_97_2 = stackOut_96_2;
                                            break L7;
                                          }
                                        }
                                      }
                                      stackOut_97_0 = this;
                                      stackOut_97_1 = this;
                                      stackOut_97_2 = stackIn_97_2;
                                      stackOut_97_3 = 1;
                                      stackIn_99_0 = stackOut_97_0;
                                      stackIn_99_1 = stackOut_97_1;
                                      stackIn_99_2 = stackOut_97_2;
                                      stackIn_99_3 = stackOut_97_3;
                                      break L6;
                                    }
                                    ((bh) this).field_E = ((bh) this).c(stackIn_99_2, stackIn_99_3 != 0);
                                    ((bh) this).field_n = 0;
                                    ((bh) this).field_e = 2;
                                    var5 = 0;
                                    L8: while (true) {
                                      if (((bh) this).field_f.length <= var5) {
                                        return -2;
                                      } else {
                                        ((bh) this).field_f[var5].b((byte) -89);
                                        var5++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L9: {
                            if (((bh) this).field_e == 3) {
                              break L9;
                            } else {
                              if (((bh) this).field_e == 2) {
                                break L9;
                              } else {
                                if (((bh) this).field_e == 6) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (7 != ((bh) this).field_e) {
                                      break L10;
                                    } else {
                                      if (((bh) this).field_n < 142) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (((bh) this).field_E > 50) {
                                    return 0;
                                  } else {
                                    if (50 > ((bh) this).field_E) {
                                      return 1;
                                    } else {
                                      return -1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return -2;
                        } else {
                          return -2;
                        }
                      }
                    }
                  }
                }
                if (var3 > 0) {
                  return -2;
                } else {
                  if (var2 != 0) {
                    return -2;
                  } else {
                    L11: {
                      if (((bh) this).field_e == 3) {
                        break L11;
                      } else {
                        if (((bh) this).field_e == 2) {
                          break L11;
                        } else {
                          if (((bh) this).field_e == 6) {
                            break L11;
                          } else {
                            if (((bh) this).field_e == 7) {
                              break L11;
                            } else {
                              if (((bh) this).field_e != 4) {
                                L12: {
                                  L13: {
                                    stackOut_74_0 = this;
                                    stackOut_74_1 = this;
                                    stackOut_74_2 = 3;
                                    stackIn_77_0 = stackOut_74_0;
                                    stackIn_77_1 = stackOut_74_1;
                                    stackIn_77_2 = stackOut_74_2;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    if (((bh) this).field_w == 0) {
                                      break L13;
                                    } else {
                                      stackOut_75_0 = this;
                                      stackOut_75_1 = this;
                                      stackOut_75_2 = stackIn_75_2;
                                      stackIn_78_0 = stackOut_75_0;
                                      stackIn_78_1 = stackOut_75_1;
                                      stackIn_78_2 = stackOut_75_2;
                                      stackIn_76_0 = stackOut_75_0;
                                      stackIn_76_1 = stackOut_75_1;
                                      stackIn_76_2 = stackOut_75_2;
                                      if (((bh) this).field_w != 3) {
                                        stackOut_78_0 = this;
                                        stackOut_78_1 = this;
                                        stackOut_78_2 = stackIn_78_2;
                                        stackOut_78_3 = 0;
                                        stackIn_79_0 = stackOut_78_0;
                                        stackIn_79_1 = stackOut_78_1;
                                        stackIn_79_2 = stackOut_78_2;
                                        stackIn_79_3 = stackOut_78_3;
                                        break L12;
                                      } else {
                                        stackOut_76_0 = this;
                                        stackOut_76_1 = this;
                                        stackOut_76_2 = stackIn_76_2;
                                        stackIn_77_0 = stackOut_76_0;
                                        stackIn_77_1 = stackOut_76_1;
                                        stackIn_77_2 = stackOut_76_2;
                                        break L13;
                                      }
                                    }
                                  }
                                  stackOut_77_0 = this;
                                  stackOut_77_1 = this;
                                  stackOut_77_2 = stackIn_77_2;
                                  stackOut_77_3 = 1;
                                  stackIn_79_0 = stackOut_77_0;
                                  stackIn_79_1 = stackOut_77_1;
                                  stackIn_79_2 = stackOut_77_2;
                                  stackIn_79_3 = stackOut_77_3;
                                  break L12;
                                }
                                ((bh) this).field_E = ((bh) this).c(stackIn_79_2, stackIn_79_3 != 0);
                                ((bh) this).field_n = 0;
                                ((bh) this).field_e = 2;
                                var5 = 0;
                                L14: while (true) {
                                  if (~((bh) this).field_f.length >= ~var5) {
                                    L15: {
                                      if (!((bh) this).field_C) {
                                        qg.a(1, 250, 28, 0);
                                        int discarded$1 = 12;
                                        db.a(false, 12, (byte) 56, kc.field_b, false);
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    return -2;
                                  } else {
                                    ((bh) this).field_f[var5].b((byte) -82);
                                    var5++;
                                    continue L14;
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (((bh) this).field_e == 3) {
                        break L16;
                      } else {
                        if (((bh) this).field_e == 4) {
                          break L16;
                        } else {
                          L17: {
                            if (((bh) this).field_e != 2) {
                              break L17;
                            } else {
                              if (3 != ((bh) this).field_w) {
                                break L16;
                              } else {
                                if (100 > ((bh) this).field_n) {
                                  break L16;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          if (((bh) this).field_e == 6) {
                            break L16;
                          } else {
                            if (7 != ((bh) this).field_e) {
                              return 0;
                            } else {
                              if (((bh) this).field_n < 142) {
                                break L16;
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                    return -2;
                  }
                }
              } else {
                L18: {
                  if (((bh) this).field_i[var5].field_A != 10) {
                    L19: {
                      var6 = ((bh) this).field_i[var5].field_p;
                      if (var6 == 2) {
                        break L19;
                      } else {
                        if (4 == var6) {
                          break L19;
                        } else {
                          if (var6 == 25) {
                            break L19;
                          } else {
                            if (var6 != 5) {
                              break L19;
                            } else {
                              if (var4 == 0) {
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                    }
                    L20: {
                      L21: {
                        if (var6 == 15) {
                          break L21;
                        } else {
                          if (var6 != 23) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var3++;
                      break L20;
                    }
                    L22: {
                      if (var6 == 1) {
                        break L22;
                      } else {
                        if (var6 == 3) {
                          break L22;
                        } else {
                          if (var6 == 26) {
                            break L22;
                          } else {
                            if (10 != var6) {
                              break L18;
                            } else {
                              if (var4 != 0) {
                                break L22;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                    var2++;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var5++;
                continue L2;
              }
            }
          } else {
            L23: {
              var6_ref_jg = ((bh) this).field_b[var5];
              if (var6_ref_jg != null) {
                L24: {
                  L25: {
                    if (var6_ref_jg.field_p == 15) {
                      break L25;
                    } else {
                      if (23 != var6_ref_jg.field_p) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var3++;
                  break L24;
                }
                L26: {
                  L27: {
                    if (var6_ref_jg.field_p == 1) {
                      break L27;
                    } else {
                      if (var6_ref_jg.field_p == 3) {
                        break L27;
                      } else {
                        if (var6_ref_jg.field_p == 26) {
                          break L27;
                        } else {
                          if (10 != var6_ref_jg.field_p) {
                            break L26;
                          } else {
                            if (var4 != 0) {
                              break L27;
                            } else {
                              break L26;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2++;
                  break L26;
                }
                if (var6_ref_jg.field_p == 2) {
                  break L23;
                } else {
                  if (4 == var6_ref_jg.field_p) {
                    break L23;
                  } else {
                    if (var6_ref_jg.field_p == 25) {
                      break L23;
                    } else {
                      if (var6_ref_jg.field_p != 5) {
                        break L23;
                      } else {
                        if (var4 != 0) {
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                    }
                  }
                }
              } else {
                break L23;
              }
            }
            var5++;
            continue L1;
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          var3 = param1;
          if (3 == var3) {
            break L0;
          } else {
            if (var3 == 1) {
              break L0;
            } else {
              if (var3 != 26) {
                if (var3 == 10) {
                  if (((bh) this).field_w != 2) {
                    return 1;
                  } else {
                    return 1;
                  }
                } else {
                  L1: {
                    if (var3 == 4) {
                      break L1;
                    } else {
                      if (var3 != 2) {
                        if (25 != var3) {
                          if (var3 == 5) {
                            L2: {
                              if (((bh) this).field_w == 2) {
                                stackOut_19_0 = 2;
                                stackIn_20_0 = stackOut_19_0;
                                break L2;
                              } else {
                                stackOut_18_0 = 0;
                                stackIn_20_0 = stackOut_18_0;
                                break L2;
                              }
                            }
                            return stackIn_20_0;
                          } else {
                            return 2;
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  return 0;
                }
              } else {
                return 1;
              }
            }
          }
        }
        return 1;
    }

    private final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        var3 = param0;
        if (var3 != 3) {
          L0: {
            L1: {
              if (var3 == 1) {
                break L1;
              } else {
                if (var3 != 26) {
                  if (var3 == 4) {
                    return 2;
                  } else {
                    if (var3 != 2) {
                      if (var3 == 25) {
                        return 2;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_11_0 = stackOut_9_0;
                        break L0;
                      }
                    } else {
                      return 2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_10_0 = 1;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
          return stackIn_11_0;
        } else {
          return 1;
        }
    }

    final void i(int param0) {
        ((bh) this).field_s = false;
        if (param0 != -10) {
            ((bh) this).field_q = null;
        }
    }

    final ho a(byte param0) {
        int var2 = 8 / ((param0 - 8) / 57);
        if (sk.field_e == -1) {
            return null;
        }
        ho var3 = th.field_e[sk.field_e];
        sk.field_e = sk.field_e - 1;
        return var3;
    }

    final static void a(int param0, int param1, int param2, String[] param3, int param4, cc param5, int param6, int param7, String[] param8, int param9, int param10, fe[] param11, int param12) {
        RuntimeException var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var17 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var13_int = 0;
            var14 = param0;
            L1: while (true) {
              if (var14 >= param4) {
                L2: {
                  var14 = (param6 + -var13_int) / (param4 - param0 + -1);
                  var15 = param9;
                  if (param10 == 128) {
                    break L2;
                  } else {
                    var18 = null;
                    bh.a(100, 111, -35, (String[]) null, -77, (cc) null, -38, -114, (String[]) null, 20, 47, (fe[]) null, 8);
                    break L2;
                  }
                }
                var16 = param0;
                L3: while (true) {
                  if (var16 >= param4) {
                    break L0;
                  } else {
                    param11[var16].e(param7, var15 + -(param12 / 2));
                    va.field_s.a(16777215, (byte) 115, -1, param1 + param7 - -10, param8[var16], var15);
                    int discarded$1 = param5.a(param3[var16], param7 - -param1 - -10, 6 + var15, 210, 200, 16777215, -1, 0, 0, param2);
                    var15 = var15 + (var14 + 6 + param5.a(param3[var16], 210, param2) - (-param5.field_z + -param5.field_M));
                    var16++;
                    continue L3;
                  }
                }
              } else {
                var13_int = var13_int + (param5.a(param3[var14], 210, param2) - -param5.field_z - -param5.field_M + 6);
                var14++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var13 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var13;
            stackOut_10_1 = new StringBuilder().append("bh.U(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param4).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param5 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param8 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param9).append(44).append(param10).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param11 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param12 + 41);
        }
    }

    bh(int param0, wo[] param1, boolean param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        ((bh) this).field_B = false;
        ((bh) this).field_p = 0;
        ((bh) this).field_k = new int[50];
        ((bh) this).field_G = new int[50];
        ((bh) this).field_x = new int[50];
        ((bh) this).field_d = 0;
        ((bh) this).field_j = new int[50];
        ((bh) this).field_q = new int[50];
        ((bh) this).field_J = false;
        ((bh) this).field_u = new int[50];
        try {
          L0: {
            L1: {
              ((bh) this).field_i = new rn[375];
              ((bh) this).field_e = 0;
              ((bh) this).field_b = new jg[375];
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((bh) this).field_C = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param3) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((bh) this).field_l = stackIn_7_1 != 0;
            ((bh) this).field_n = 0;
            ((bh) this).field_f = param1;
            ((bh) this).field_w = param0;
            th.field_e = new ho[4];
            var5_int = 0;
            L3: while (true) {
              if (th.field_e.length <= var5_int) {
                break L0;
              } else {
                th.field_e[var5_int] = new ho();
                var5_int++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("bh.<init>(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Kick";
        field_g = new byte[250][];
        field_H = "Accept unrated rematch";
        field_c = 0;
        field_M = new java.awt.Color(10040319);
    }
}
