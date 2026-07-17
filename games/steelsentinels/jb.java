/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends kd {
    private wl field_I;
    static int field_P;
    private ee field_Z;
    private int field_z;
    private int field_N;
    int field_G;
    int field_H;
    int field_M;
    int field_V;
    static wk field_L;
    static String field_Q;
    private boolean field_R;
    boolean field_O;
    static wk field_B;
    static wk[] field_S;
    int field_T;
    static String field_E;
    int field_K;
    private int field_y;
    private mb[] field_X;
    static String field_W;
    int field_U;
    int field_F;
    private int field_Y;
    static ul field_A;
    static wk[] field_J;
    static gh field_C;
    static fm field_D;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (ka.field_V) {
          L0: {
            var4 = param1 + (((jb) this).field_H >> 8);
            var5 = param0 - -(((jb) this).field_M >> 8);
            var6 = 2 % ((param2 - 30) / 54);
            var7 = (((jb) this).field_Y + (-((jb) this).field_Y + ((jb) this).field_z) / 4) * ((jb) this).field_U / ((jb) this).field_z;
            var8 = var7 >> 4;
            var9 = ((jb) this).field_z / 2;
            var10 = 2500;
            if (null == ((jb) this).field_I) {
              break L0;
            } else {
              var10 = ((jb) this).field_I.field_O * 25;
              if (var10 <= 2500) {
                break L0;
              } else {
                var10 = 2500;
                break L0;
              }
            }
          }
          L1: {
            if (0 >= var8) {
              break L1;
            } else {
              if (((jb) this).field_I == null) {
                break L1;
              } else {
                if (300 >= ((jb) this).field_I.field_O) {
                  break L1;
                } else {
                  if (((jb) this).field_Y >= var9) {
                    if (((jb) this).field_Y >= 2 * var9) {
                      break L1;
                    } else {
                      qh.b(10 * (2 * var9 - ((jb) this).field_Y) * var10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
                      break L1;
                    }
                  } else {
                    qh.b(var10 * ((jb) this).field_Y * 10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
                    break L1;
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

    final static wk[] g() {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = SteelSentinels.field_G;
        wk[] var1 = new wk[rl.field_d];
        for (var2 = 0; rl.field_d > var2; var2++) {
            var3 = le.field_L[var2] * ca.field_r[var2];
            var4 = dl.field_L[var2];
            var5 = new int[var3];
            for (var6 = 0; var3 > var6; var6++) {
                var5[var6] = ba.field_d[ec.a((int) var4[var6], 255)];
            }
            var1[var2] = new wk(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var5);
        }
        int discarded$0 = 9324;
        uh.a();
        return var1;
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        jc var4_ref_jc = null;
        int var4 = 0;
        wl var5_ref_wl = null;
        double var5_double = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mb var7_ref_mb = null;
        qb var7_ref_qb = null;
        double var8_double = 0.0;
        int var8_int = 0;
        mb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        jc var14 = null;
        mb[] var15 = null;
        ie var16 = null;
        mb var17 = null;
        double stackIn_42_0 = 0.0;
        double stackIn_43_0 = 0.0;
        double stackIn_44_0 = 0.0;
        int stackIn_44_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        double stackOut_41_0 = 0.0;
        double stackOut_43_0 = 0.0;
        int stackOut_43_1 = 0;
        double stackOut_42_0 = 0.0;
        int stackOut_42_1 = 0;
        var13 = SteelSentinels.field_G;
        var2 = 0;
        L0: while (true) {
          if (((jb) this).field_N < var2) {
            if (!param0) {
              L1: {
                ((jb) this).field_F = ((jb) this).field_U * (((jb) this).field_Y + (-((jb) this).field_Y + ((jb) this).field_z) / 4) / ((jb) this).field_z;
                if (!((jb) this).field_O) {
                  break L1;
                } else {
                  var2 = ((jb) this).field_F * ((jb) this).field_F;
                  var16 = new ie(new int[3]);
                  var4_ref_jc = new jc(((jb) this).field_Z.field_db);
                  var5_ref_wl = (wl) (Object) var4_ref_jc.b(2);
                  L2: while (true) {
                    if (var5_ref_wl == null) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          var6 = -var5_ref_wl.field_U + ((jb) this).field_H >> 4;
                          var7 = -var5_ref_wl.field_A + ((jb) this).field_M >> 4;
                          if (var5_ref_wl.field_C == 2) {
                            break L4;
                          } else {
                            if (var5_ref_wl.field_C == 3) {
                              break L4;
                            } else {
                              if (var5_ref_wl.field_C != 20) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        if (var5_ref_wl.field_y == 32) {
                          break L3;
                        } else {
                          if (~var2 <= ~(var7 * var7 + var6 * var6)) {
                            L5: {
                              if (null == var5_ref_wl.field_X) {
                                break L5;
                              } else {
                                if (((jb) this).field_I.field_X != var5_ref_wl.field_X) {
                                  ((jb) this).field_I.field_X.field_ob = ((jb) this).field_I.field_X.field_ob + 1;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var5_ref_wl.field_bb = true;
                              if (var5_ref_wl.field_C != 20) {
                                var5_ref_wl.field_T = true;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var5_ref_wl.field_X = ((jb) this).field_I.field_X;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L7: {
                        if (8 != var5_ref_wl.field_C) {
                          break L7;
                        } else {
                          if (var6 * var6 + var7 * var7 > var2) {
                            break L7;
                          } else {
                            if (8 < var16.a(93, 100)) {
                              break L7;
                            } else {
                              L8: {
                                var5_ref_wl.field_bb = true;
                                if (null == var5_ref_wl.field_X) {
                                  break L8;
                                } else {
                                  if (var5_ref_wl.field_X != ((jb) this).field_I.field_X) {
                                    ((jb) this).field_I.field_X.field_ob = ((jb) this).field_I.field_X.field_ob + 1;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var5_ref_wl.field_X = ((jb) this).field_I.field_X;
                              break L7;
                            }
                          }
                        }
                      }
                      var5_ref_wl = (wl) (Object) var4_ref_jc.d(2);
                      continue L2;
                    }
                  }
                }
              }
              L9: {
                if (((jb) this).field_X == null) {
                  break L9;
                } else {
                  if (((jb) this).field_I.field_O > 0) {
                    var2 = 0;
                    L10: while (true) {
                      if (((jb) this).field_X.length <= var2) {
                        break L9;
                      } else {
                        L11: {
                          var17 = ((jb) this).field_X[var2];
                          if (var17 == null) {
                            break L11;
                          } else {
                            L12: {
                              if (((jb) this).field_R) {
                                stackOut_98_0 = 0;
                                stackIn_99_0 = stackOut_98_0;
                                break L12;
                              } else {
                                stackOut_97_0 = 1;
                                stackIn_99_0 = stackOut_97_0;
                                break L12;
                              }
                            }
                            L13: {
                              stackOut_99_0 = stackIn_99_0;
                              stackIn_101_0 = stackOut_99_0;
                              stackIn_100_0 = stackOut_99_0;
                              if (var17.field_u) {
                                stackOut_101_0 = stackIn_101_0;
                                stackOut_101_1 = 0;
                                stackIn_102_0 = stackOut_101_0;
                                stackIn_102_1 = stackOut_101_1;
                                break L13;
                              } else {
                                stackOut_100_0 = stackIn_100_0;
                                stackOut_100_1 = 1;
                                stackIn_102_0 = stackOut_100_0;
                                stackIn_102_1 = stackOut_100_1;
                                break L13;
                              }
                            }
                            L14: {
                              if (stackIn_102_0 == stackIn_102_1) {
                                break L14;
                              } else {
                                if (((jb) this).field_Z.field_ab.b((byte) 127, var17.field_hc >> 4) == ((jb) this).field_Z.field_ab.a(false, var17.field_hc >> 4)) {
                                  break L14;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L15: {
                              if (var17.field_o == -1) {
                                break L15;
                              } else {
                                if (((jb) this).field_I.field_y == var17.field_o) {
                                  break L15;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            var4 = ((jb) this).field_H - var17.field_hc >> 4;
                            var5 = 768 + (-var17.field_Gb + ((jb) this).field_M) >> 4;
                            if (Math.abs(var4) > ((jb) this).field_F) {
                              break L11;
                            } else {
                              if (((jb) this).field_F * ((jb) this).field_F < var4 * var4 + var5 * var5) {
                                break L11;
                              } else {
                                L16: {
                                  if (9 != ((jb) this).field_I.field_C) {
                                    break L16;
                                  } else {
                                    if (((jb) this).field_I.field_X == null) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (1 != ((jb) this).field_I.field_X.field_fb) {
                                          break L17;
                                        } else {
                                          var17.field_ab = var17.field_ab - 80000 / var17.field_Eb;
                                          var17.field_K = var17.field_K + 400000 * ((jb) this).field_I.field_X.field_E / var17.field_Eb;
                                          break L17;
                                        }
                                      }
                                      L18: {
                                        if (2 == ((jb) this).field_I.field_X.field_fb) {
                                          L19: {
                                            if (((jb) this).field_I.field_X.field_hc > var17.field_hc) {
                                              break L19;
                                            } else {
                                              var17.field_K = var17.field_K + 200000 / var17.field_Eb;
                                              break L19;
                                            }
                                          }
                                          var17.field_ab = var17.field_ab - 200000 / var17.field_Eb;
                                          if (var17.field_hc >= ((jb) this).field_I.field_X.field_hc) {
                                            break L18;
                                          } else {
                                            var17.field_K = var17.field_K - 200000 / var17.field_Eb;
                                            break L18;
                                          }
                                        } else {
                                          break L18;
                                        }
                                      }
                                      if (((jb) this).field_I.field_X.field_fb != 3) {
                                        break L16;
                                      } else {
                                        var17.field_ab = var17.field_ab - 160000 / var17.field_Eb;
                                        var17.field_K = var17.field_K + 80000 * ((jb) this).field_I.field_X.field_E / var17.field_Eb;
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                L20: {
                                  L21: {
                                    ((jb) this).field_X[var2] = null;
                                    var6 = ik.a(var5 * var5 + var4 * var4, -117);
                                    if (var6 <= ((jb) this).field_U / 2) {
                                      break L21;
                                    } else {
                                      if (((jb) this).field_I.field_C == 9) {
                                        break L21;
                                      } else {
                                        var7 = ((jb) this).field_I.field_O * (((jb) this).field_U - var6) / (((jb) this).field_U / 2);
                                        if (1 <= var7) {
                                          break L20;
                                        } else {
                                          var7 = 1;
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  var7 = ((jb) this).field_I.field_O;
                                  break L20;
                                }
                                if (((jb) this).field_I.field_C != 9) {
                                  L22: {
                                    var17.field_S = var17.field_S - var7 * ((jb) this).field_I.field_kb / ((jb) this).field_I.field_O;
                                    if (var17.field_S >= 0) {
                                      break L22;
                                    } else {
                                      var17.field_S = 0;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (0 >= var17.field_S) {
                                      break L23;
                                    } else {
                                      pc discarded$4 = fc.a((byte) 114, 27, ((jb) this).field_H);
                                      break L23;
                                    }
                                  }
                                  var17.field_S = var17.field_S - var7;
                                  var17.field_P = 100;
                                  if (0 > var17.field_S) {
                                    L24: {
                                      L25: {
                                        if (((jb) this).field_I.field_C == 1) {
                                          break L25;
                                        } else {
                                          if (((jb) this).field_I.field_C == 2) {
                                            break L25;
                                          } else {
                                            if (((jb) this).field_I.field_C == 3) {
                                              break L25;
                                            } else {
                                              if (((jb) this).field_I.field_C == 20) {
                                                break L25;
                                              } else {
                                                pc discarded$5 = fc.a((byte) 91, 55, ((jb) this).field_H);
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      pc discarded$6 = fc.a((byte) -100, 51, ((jb) this).field_H);
                                      var8_int = var17.h(0, 33);
                                      var17.field_S = var17.field_S >> var8_int;
                                      break L24;
                                    }
                                    L26: {
                                      if (var17.field_rb > 0) {
                                        var17.a((byte) 68, ((jb) this).field_I);
                                        break L26;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      L28: {
                                        if (var17.field_rb <= 0) {
                                          break L28;
                                        } else {
                                          if (((jb) this).field_I.field_X == null) {
                                            break L28;
                                          } else {
                                            L29: {
                                              var8 = ((jb) this).field_I.field_X;
                                              if (((jb) this).field_I.field_X == ((jb) this).field_I.field_G) {
                                                break L29;
                                              } else {
                                                if (null == ((jb) this).field_I.field_G) {
                                                  break L29;
                                                } else {
                                                  L30: {
                                                    L31: {
                                                      if (~((jb) this).field_I.field_G.field_jc == ~((jb) this).field_I.field_X.field_jc) {
                                                        break L31;
                                                      } else {
                                                        if (var17.field_jc == ((jb) this).field_I.field_X.field_jc) {
                                                          break L30;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                    if (var17 != ((jb) this).field_I.field_X) {
                                                      break L29;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                  var8 = ((jb) this).field_I.field_G;
                                                  break L29;
                                                }
                                              }
                                            }
                                            L32: {
                                              var9 = -var17.field_S;
                                              if (var17.field_rb >= var9) {
                                                break L32;
                                              } else {
                                                var9 = var17.field_rb;
                                                break L32;
                                              }
                                            }
                                            L33: {
                                              if (0 > var9) {
                                                var9 = 0;
                                                break L33;
                                              } else {
                                                break L33;
                                              }
                                            }
                                            L34: {
                                              if (var17.field_Nb != 8) {
                                                if (var17.field_z > 0) {
                                                  break L34;
                                                } else {
                                                  if (var17.field_jc == var8.field_jc) {
                                                    if (var17 != var8) {
                                                      var8.b(-(((jb) this).field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb)), 26511);
                                                      break L34;
                                                    } else {
                                                      break L34;
                                                    }
                                                  } else {
                                                    var8.b(((jb) this).field_Z.field_l * (var17.field_lb * var9 / var17.field_Eb), 26511);
                                                    var8.field_Ac = var8.field_Ac + var9;
                                                    break L34;
                                                  }
                                                }
                                              } else {
                                                break L34;
                                              }
                                            }
                                            if (var17.field_z <= 0) {
                                              L35: {
                                                var17.e(128, -var17.field_S);
                                                if (var17.field_rb > 0) {
                                                  break L35;
                                                } else {
                                                  if (var17.field_Nb == 8) {
                                                    break L35;
                                                  } else {
                                                    if (!((jb) this).field_I.field_bb) {
                                                      break L35;
                                                    } else {
                                                      if (((jb) this).field_I.field_G == var8) {
                                                        break L35;
                                                      } else {
                                                        if (~var8.field_jc != ~var17.field_jc) {
                                                          break L35;
                                                        } else {
                                                          break L35;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              L36: {
                                                if (var17.field_rb > 0) {
                                                  break L36;
                                                } else {
                                                  L37: {
                                                    if (var17.field_Nb == 0) {
                                                      break L37;
                                                    } else {
                                                      if (11 != var17.field_Nb) {
                                                        break L36;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                  if (32 != ((jb) this).field_I.field_y) {
                                                    break L36;
                                                  } else {
                                                    if (((jb) this).field_I.field_G == var8) {
                                                      var8.field_y = var8.field_y + 1;
                                                      break L36;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      if (0 >= var17.field_rb) {
                                        break L27;
                                      } else {
                                        if (((jb) this).field_I.field_X != null) {
                                          break L27;
                                        } else {
                                          if (var17.field_z > 0) {
                                            break L27;
                                          } else {
                                            var17.e(128, -var17.field_S);
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    L38: {
                                      if (!var17.h(-122)) {
                                        break L38;
                                      } else {
                                        if (var17.field_mc < var7 * ((jb) this).field_I.field_kb / ((jb) this).field_I.field_O) {
                                          var17.field_mc = ((jb) this).field_I.field_kb * var7 / ((jb) this).field_I.field_O;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    L39: {
                                      if (var7 * ((jb) this).field_I.field_kb / ((jb) this).field_I.field_O <= 0) {
                                        break L39;
                                      } else {
                                        if (var17.field_Tb <= 0) {
                                          break L39;
                                        } else {
                                          if (var17.h(-122)) {
                                            var17.a(true, Math.min(var17.field_Tb, var7 * ((jb) this).field_I.field_kb / ((jb) this).field_I.field_O / 50));
                                            break L39;
                                          } else {
                                            break L39;
                                          }
                                        }
                                      }
                                    }
                                    L40: {
                                      L41: {
                                        if (!var17.i(26, -27)) {
                                          break L41;
                                        } else {
                                          if (var17.field_S >= 0) {
                                            break L41;
                                          } else {
                                            var17.field_S = Math.min(-var17.field_S, var17.field_Q);
                                            break L40;
                                          }
                                        }
                                      }
                                      var17.field_S = 0;
                                      break L40;
                                    }
                                    if (var17.field_Lb) {
                                      if (var17.i(29, -27)) {
                                        break L11;
                                      } else {
                                        if (3 != di.field_g) {
                                          var17.field_Dc = 200;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  L42: {
                                    var7 = ((jb) this).field_I.field_O;
                                    var17.field_S = var17.field_S - ((jb) this).field_I.field_kb;
                                    if (~((jb) this).field_I.field_kb >= ~var17.field_mc) {
                                      break L42;
                                    } else {
                                      if (var17.h(-128)) {
                                        var17.field_mc = ((jb) this).field_I.field_kb;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  L43: {
                                    if (((jb) this).field_I.field_kb <= 0) {
                                      break L43;
                                    } else {
                                      if (var17.field_Tb <= 0) {
                                        break L43;
                                      } else {
                                        if (var17.h(-122)) {
                                          var17.a(true, Math.min(var17.field_Tb, ((jb) this).field_I.field_kb / 50));
                                          break L43;
                                        } else {
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                  L44: {
                                    if (var17.field_S >= 0) {
                                      break L44;
                                    } else {
                                      var17.field_S = 0;
                                      break L44;
                                    }
                                  }
                                  L45: {
                                    if (0 >= var17.field_rb) {
                                      break L45;
                                    } else {
                                      var17.a((byte) 40, ((jb) this).field_I);
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    L47: {
                                      if (var17.field_rb <= 0) {
                                        break L47;
                                      } else {
                                        if (((jb) this).field_I.field_X != null) {
                                          L48: {
                                            var8_int = var7;
                                            if (var8_int <= var17.field_rb) {
                                              break L48;
                                            } else {
                                              var8_int = var17.field_rb;
                                              break L48;
                                            }
                                          }
                                          L49: {
                                            if (var8_int < 0) {
                                              var8_int = 0;
                                              break L49;
                                            } else {
                                              break L49;
                                            }
                                          }
                                          L50: {
                                            if (var17.field_Nb != 8) {
                                              if (var17.field_z <= 0) {
                                                if (~((jb) this).field_I.field_X.field_jc != ~var17.field_jc) {
                                                  ((jb) this).field_I.field_X.b(((jb) this).field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb), 26511);
                                                  ((jb) this).field_I.field_X.field_Ac = ((jb) this).field_I.field_X.field_Ac + var8_int;
                                                  break L50;
                                                } else {
                                                  if (((jb) this).field_I.field_X == var17) {
                                                    break L50;
                                                  } else {
                                                    ((jb) this).field_I.field_X.b(-(((jb) this).field_Z.field_l * (var8_int * var17.field_lb / var17.field_Eb)), 26511);
                                                    break L50;
                                                  }
                                                }
                                              } else {
                                                break L50;
                                              }
                                            } else {
                                              break L50;
                                            }
                                          }
                                          if (var17.field_z > 0) {
                                            break L46;
                                          } else {
                                            var17.e(128, var7);
                                            break L46;
                                          }
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                    if (var17.field_rb <= 0) {
                                      break L46;
                                    } else {
                                      if (null != ((jb) this).field_I.field_X) {
                                        break L46;
                                      } else {
                                        if (var17.field_z > 0) {
                                          break L46;
                                        } else {
                                          var17.e(128, var7);
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  if (var17.field_Lb) {
                                    if (!var17.i(29, -27)) {
                                      var17.field_Dc = 200;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var2++;
                        continue L10;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L51: {
                if (((jb) this).field_N <= 0) {
                  break L51;
                } else {
                  ((jb) this).field_N = ((jb) this).field_N - 1;
                  break L51;
                }
              }
              L52: {
                if (((jb) this).field_z >= ((jb) this).field_Y) {
                  break L52;
                } else {
                  ((jb) this).field_Z.field_J.a((byte) 82, (kd) this);
                  break L52;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L53: {
              ((jb) this).field_M = ((jb) this).field_M + ((jb) this).field_T;
              ((jb) this).field_H = ((jb) this).field_H + ((jb) this).field_V;
              if (~((jb) this).field_Z.field_ab.a((byte) -105, ((jb) this).field_H >> 4) >= ~-(((jb) this).field_M >> 4)) {
                break L53;
              } else {
                ((jb) this).field_M = -(((jb) this).field_Z.field_ab.a((byte) -124, ((jb) this).field_H >> 4) << 4);
                break L53;
              }
            }
            L54: {
              var3 = ((jb) this).field_G * ((jb) this).field_Y / (((jb) this).field_z * 2);
              if (var3 != 0) {
                break L54;
              } else {
                if (0 < ((jb) this).field_Y) {
                  var3 = 1;
                  break L54;
                } else {
                  break L54;
                }
              }
            }
            L55: {
              ((jb) this).field_Y = ((jb) this).field_Y + 1;
              var4 = ((jb) this).field_Y * ((jb) this).field_G / (((jb) this).field_z * 2);
              if (((jb) this).field_I == null) {
                break L55;
              } else {
                if (((jb) this).field_X == null) {
                  break L55;
                } else {
                  L56: {
                    if (((jb) this).field_I.field_C == 7) {
                      break L56;
                    } else {
                      if (((jb) this).field_I.field_y != 9) {
                        break L55;
                      } else {
                        break L56;
                      }
                    }
                  }
                  if ((((jb) this).field_Y & 63) != 0) {
                    break L55;
                  } else {
                    var14 = new jc(((jb) this).field_Z.field_K);
                    var6 = 0;
                    var7_ref_mb = (mb) (Object) var14.b(2);
                    L57: while (true) {
                      if (var7_ref_mb == null) {
                        L58: while (true) {
                          if (~var6 <= ~((jb) this).field_X.length) {
                            break L55;
                          } else {
                            ((jb) this).field_X[var6] = null;
                            var6++;
                            continue L58;
                          }
                        }
                      } else {
                        L59: {
                          if (var6 == ((jb) this).field_X.length) {
                            var15 = ((jb) this).field_X;
                            ((jb) this).field_X = new mb[((jb) this).field_Z.field_K.b((byte) -128)];
                            ii.a((Object[]) (Object) var15, 0, (Object[]) (Object) ((jb) this).field_X, 0, var6);
                            break L59;
                          } else {
                            break L59;
                          }
                        }
                        ((jb) this).field_X[var6] = var7_ref_mb;
                        var6++;
                        var7_ref_mb = (mb) (Object) var14.d(2);
                        continue L57;
                      }
                    }
                  }
                }
              }
            }
            L60: {
              if (var4 == 0) {
                var4 = 1;
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              if (!((jb) this).field_Z.field_h) {
                L62: while (true) {
                  if (var4 <= var3) {
                    break L61;
                  } else {
                    L63: {
                      var5_double = 3.141592653589793 * Math.random() * 2.0;
                      var7_ref_mb = null;
                      if (0 == ((jb) this).field_K) {
                        L64: {
                          var8_double = (Math.random() * (double)(-((jb) this).field_Y + ((jb) this).field_z) / 4.0 + (double)((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z + 1.0;
                          var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                          var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                          var7_ref_qb = nk.a(1, 0, ((jb) this).field_Z, 126, ((jb) this).field_M - -(var11 / 2), ((jb) this).field_R, 150, 0, var10 / 2 + ((jb) this).field_H, ((jb) this).field_y);
                          ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                          if (10 <= ((jb) this).field_Y) {
                            break L64;
                          } else {
                            var12 = 25;
                            var7_ref_qb = nk.a(10, (int)((double)(var12 * var10) / var8_double), ((jb) this).field_Z, 95, var11 + ((jb) this).field_M, ((jb) this).field_R, 100, (int)((double)(var12 * var11) / var8_double), var10 + ((jb) this).field_H, ((jb) this).field_y);
                            ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                            break L64;
                          }
                        }
                        var7_ref_qb = nk.a(0, var10 >> 4, ((jb) this).field_Z, 94, ((jb) this).field_M - -(var11 / 2), ((jb) this).field_R, 300, -(10 * ((jb) this).field_Y) + (var11 >> 4), var10 / 2 + ((jb) this).field_H, ((jb) this).field_y);
                        ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                        break L63;
                      } else {
                        if (((jb) this).field_K != 1) {
                          if (((jb) this).field_K == 2) {
                            var8_double = (Math.random() * (double)(((jb) this).field_z - ((jb) this).field_Y) / 4.0 + (double)((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                            var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                            var7_ref_qb = nk.a(1, 0, ((jb) this).field_Z, 125, var11 / 2 + ((jb) this).field_M, ((jb) this).field_R, 50, 0, ((jb) this).field_H + var10 / 2, ((jb) this).field_y);
                            ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                            var12 = 0;
                            L65: while (true) {
                              if (var12 >= 5) {
                                L66: {
                                  if (((jb) this).field_I.field_y == 32) {
                                    break L66;
                                  } else {
                                    if (((jb) this).field_I.field_y == -2) {
                                      break L66;
                                    } else {
                                      pc discarded$7 = fc.a((byte) -69, 91, ((jb) this).field_H);
                                      break L66;
                                    }
                                  }
                                }
                                ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                break L63;
                              } else {
                                var7_ref_qb = nk.a(0, (int)(-64.0 + 128.0 * Math.random()) + (var10 >> 5), ((jb) this).field_Z, 117, ((jb) this).field_M - -(var11 / 2), ((jb) this).field_R, 200, (var11 >> 5) - -(int)(128.0 * Math.random() - 64.0), ((jb) this).field_H - -(var10 / 2), ((jb) this).field_y);
                                var12++;
                                continue L65;
                              }
                            }
                          } else {
                            if (((jb) this).field_K == 3) {
                              var8_double = Math.random() * (double)((((jb) this).field_z - ((jb) this).field_Y) / 4 + ((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                              var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                              var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                              var7_ref_qb = nk.a(4, 0, ((jb) this).field_Z, 95, ((jb) this).field_M + var11, ((jb) this).field_R, 100, 0, var10 + ((jb) this).field_H, ((jb) this).field_y);
                              ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                              break L63;
                            } else {
                              if (4 != ((jb) this).field_K) {
                                if (5 == ((jb) this).field_K) {
                                  var8_double = Math.random() * (double)((((jb) this).field_z + -((jb) this).field_Y) / 4 + ((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                                  var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                  var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                                  var7_ref_qb = nk.a(5, 0, ((jb) this).field_Z, 104, ((jb) this).field_M - (-(var11 / 256) - -3584), ((jb) this).field_R, 100, 0, ((jb) this).field_H + var10 / 256, ((jb) this).field_y);
                                  ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                  var10 = (int)(Math.sin((double)var3 * 0.2) * var8_double) << 4;
                                  var11 = (int)(var8_double * Math.cos((double)var3 * 0.2)) << 4;
                                  var7_ref_qb = nk.a(5, 0, ((jb) this).field_Z, 95, ((jb) this).field_M - -var11, ((jb) this).field_R, 100, 0, ((jb) this).field_H - -var10, ((jb) this).field_y);
                                  ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                  break L63;
                                } else {
                                  if (((jb) this).field_K != 6) {
                                    if (((jb) this).field_K == 7) {
                                      var8_double = Math.random() * (double)((-((jb) this).field_Y + ((jb) this).field_z) / 4 + ((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                                      var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                      var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                      var7_ref_qb = nk.a(4, 0, ((jb) this).field_Z, 112, var11 + ((jb) this).field_M, ((jb) this).field_R, 100, 0, ((jb) this).field_H - -var10, ((jb) this).field_y);
                                      ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                      break L63;
                                    } else {
                                      if (8 == ((jb) this).field_K) {
                                        var8_double = (double)(((jb) this).field_Y * ((jb) this).field_U / ((jb) this).field_z);
                                        var10 = (int)(var8_double * Math.sin(0.2 * (double)var3)) << 4;
                                        var11 = (int)(var8_double * Math.cos(0.2 * (double)var3)) << 4;
                                        var7_ref_qb = nk.a(5, 0, ((jb) this).field_Z, 99, ((jb) this).field_M + var11, ((jb) this).field_R, 100, 0, var10 + ((jb) this).field_H, ((jb) this).field_y);
                                        ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                        var7_ref_qb = nk.a(5, 0, ((jb) this).field_Z, 113, -var11 + ((jb) this).field_M, ((jb) this).field_R, 100, 0, ((jb) this).field_H - var10, ((jb) this).field_y);
                                        ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                        break L63;
                                      } else {
                                        if (((jb) this).field_K != 9) {
                                          break L63;
                                        } else {
                                          L67: {
                                            var8_double = Math.random() * (double)((-((jb) this).field_Y + ((jb) this).field_z) / 4 + ((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                                            stackOut_41_0 = var8_double;
                                            stackIn_43_0 = stackOut_41_0;
                                            stackIn_42_0 = stackOut_41_0;
                                            if (Math.sin(var5_double) < 0.0) {
                                              stackOut_43_0 = stackIn_43_0;
                                              stackOut_43_1 = -1;
                                              stackIn_44_0 = stackOut_43_0;
                                              stackIn_44_1 = stackOut_43_1;
                                              break L67;
                                            } else {
                                              stackOut_42_0 = stackIn_42_0;
                                              stackOut_42_1 = 1;
                                              stackIn_44_0 = stackOut_42_0;
                                              stackIn_44_1 = stackOut_42_1;
                                              break L67;
                                            }
                                          }
                                          var10 = (int)(stackIn_44_0 * (double)stackIn_44_1) << 4;
                                          var7_ref_qb = nk.a(0, 0, ((jb) this).field_Z, 102, 0, ((jb) this).field_R, 50, 0, ((jb) this).field_H + var10, ((jb) this).field_y);
                                          ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                          break L63;
                                        }
                                      }
                                    }
                                  } else {
                                    var8_double = Math.random() * (double)(((jb) this).field_Y + (((jb) this).field_z - ((jb) this).field_Y) / 4) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                                    var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                                    var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                    var7_ref_qb = nk.a(0, 0, ((jb) this).field_Z, 111, var11 + ((jb) this).field_M, ((jb) this).field_R, 100, 0, var10 + ((jb) this).field_H, ((jb) this).field_y);
                                    var7_ref_qb.field_O = (int)(2000.0 * -Math.random());
                                    ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                    break L63;
                                  }
                                }
                              } else {
                                var8_double = (Math.random() * (double)(-((jb) this).field_Y + ((jb) this).field_z) / 4.0 + (double)((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                                var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                var7_ref_qb = nk.a(1, 0, ((jb) this).field_Z, 114, ((jb) this).field_M - -var11, ((jb) this).field_R, 150, 0, ((jb) this).field_H - -var10, ((jb) this).field_y);
                                ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                var7_ref_qb = nk.a(0, var10 >> 5, ((jb) this).field_Z, 115, ((jb) this).field_M - -(var11 / 2), ((jb) this).field_R, 300, var11 >> 5, ((jb) this).field_H + var10 / 2, ((jb) this).field_y);
                                ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                                break L63;
                              }
                            }
                          }
                        } else {
                          var8_double = Math.random() * (double)((((jb) this).field_z - ((jb) this).field_Y) / 4 + ((jb) this).field_Y) * (double)((jb) this).field_U / (double)((jb) this).field_z;
                          var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                          var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                          var7_ref_qb = nk.a(3, 0, ((jb) this).field_Z, 104, ((jb) this).field_M - -var11, ((jb) this).field_R, 50, 0, var10 + ((jb) this).field_H, ((jb) this).field_y);
                          ((jb) this).field_Z.field_O.a(3, (ck) (Object) var7_ref_qb);
                          break L63;
                        }
                      }
                    }
                    var3++;
                    continue L62;
                  }
                }
              } else {
                break L61;
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    public static void h() {
        field_S = null;
        field_L = null;
        field_Q = null;
        field_J = null;
        field_C = null;
        field_E = null;
        field_W = null;
        field_D = null;
        field_B = null;
        field_A = null;
    }

    final static void c() {
        kc.field_y = null;
        int var1 = -122;
    }

    jb(int param0, int param1, int param2, int param3, int param4, ee param5, mb[] param6, wl param7) {
        RuntimeException var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        try {
          L0: {
            L1: {
              ((jb) this).field_X = param6;
              ((jb) this).field_T = param3;
              ((jb) this).field_z = param4;
              ((jb) this).field_V = param2;
              ((jb) this).field_H = param0;
              ((jb) this).field_Z = param5;
              ((jb) this).field_Y = 0;
              ((jb) this).field_I = param7;
              ((jb) this).field_M = param1;
              ((jb) this).field_y = ((jb) this).field_H;
              if (null == ((jb) this).field_I) {
                break L1;
              } else {
                ((jb) this).field_R = ((jb) this).field_I.field_ob;
                break L1;
              }
            }
            L2: {
              ((jb) this).field_K = 0;
              ((jb) this).field_G = 5;
              ((jb) this).field_N = 5;
              if (((jb) this).field_z >= 1) {
                break L2;
              } else {
                ((jb) this).field_z = 1;
                break L2;
              }
            }
            ((jb) this).field_U = 64;
            ((jb) this).field_F = ((jb) this).field_U * (((jb) this).field_Y + (((jb) this).field_z - ((jb) this).field_Y) / 4) / ((jb) this).field_z;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var9;
            stackOut_7_1 = new StringBuilder().append("jb.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param7 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
        field_E = "<col=156080>SOLARITE CUBES: </col>";
        field_Q = "Names cannot contain consecutive spaces";
        field_W = "Type your password again to make sure it's correct";
        field_A = new ul();
        field_D = new fm(6, 0, 4, 2);
    }
}
