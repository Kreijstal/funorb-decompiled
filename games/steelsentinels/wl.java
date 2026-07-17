/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends kd {
    boolean field_bb;
    int field_C;
    private boolean field_gb;
    private int field_L;
    mb field_X;
    boolean field_W;
    int field_A;
    mb[] field_fb;
    private int field_cb;
    int field_F;
    boolean field_ab;
    int field_kb;
    private ee field_B;
    private boolean field_P;
    boolean field_ob;
    mb field_nb;
    boolean field_I;
    static rf field_N;
    int field_U;
    private int field_Q;
    boolean field_E;
    int field_M;
    int field_Z;
    private boolean field_mb;
    static String field_Y;
    int field_K;
    int field_eb;
    private boolean field_H;
    boolean field_V;
    private int field_ib;
    static String field_R;
    int field_O;
    int field_hb;
    int field_y;
    static boolean field_lb;
    static int field_D;
    static byte[] field_db;
    int field_z;
    static gh field_J;
    int field_S;
    int field_jb;
    mb field_G;
    boolean field_T;

    private final boolean g(int param0, int param1) {
        int var3 = 0;
        qb var4 = null;
        L0: {
          if (param0 >= 80) {
            break L0;
          } else {
            ((wl) this).field_T = false;
            break L0;
          }
        }
        L1: {
          L2: {
            this.g(1354276);
            if (10 == ((wl) this).field_y) {
              break L2;
            } else {
              if (((wl) this).field_y == 21) {
                break L2;
              } else {
                L3: {
                  ((wl) this).field_H = false;
                  ((wl) this).field_L = 32;
                  if (((wl) this).field_y != 35) {
                    break L3;
                  } else {
                    if (((wl) this).field_V) {
                      break L3;
                    } else {
                      if (!((wl) this).field_B.field_h) {
                        if ((3 & param1 + ((wl) this).field_Z) != 0) {
                          break L3;
                        } else {
                          if (0 != (((wl) this).field_hb & 7)) {
                            break L3;
                          } else {
                            var3 = 5 + -(Math.abs(-50 + ((wl) this).field_hb) / 10);
                            var4 = nk.a(14, (int)((double)(-((wl) this).field_F) * ((double)(-var3) + Math.random() * (double)(var3 * 2))), ((wl) this).field_B, 87, ((wl) this).field_A, ((wl) this).field_ob, 8, (int)((double)((wl) this).field_eb * ((double)(-var3) + (double)(var3 * 2) * Math.random())), ((wl) this).field_U, ((wl) this).field_U);
                            ((wl) this).field_B.field_O.a(3, (ck) (Object) var4);
                            break L3;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (((wl) this).field_y != 35) {
                    break L4;
                  } else {
                    if (((wl) this).field_V) {
                      break L4;
                    } else {
                      if (((wl) this).field_Z != 8) {
                        break L4;
                      } else {
                        if ((7 & ((wl) this).field_hb) == 0) {
                          break L4;
                        } else {
                          ((wl) this).field_B.field_J.a((byte) 44, (kd) this);
                          return true;
                        }
                      }
                    }
                  }
                }
                if (((wl) this).field_y == 30) {
                  if (((wl) this).field_Z != 4) {
                    break L1;
                  } else {
                    if ((((wl) this).field_hb & 3) != 0) {
                      L5: {
                        if (!((wl) this).field_I) {
                          ((wl) this).field_B.field_J.a((byte) 74, (kd) this);
                          break L5;
                        } else {
                          ((wl) this).field_T = true;
                          break L5;
                        }
                      }
                      return true;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
          ((wl) this).field_L = 32;
          break L1;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        nk var8_ref_nk = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16_int = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        L0: {
          var22 = SteelSentinels.field_G;
          var4 = param1 - -(((wl) this).field_U >> 8);
          var5 = param0 - -(((wl) this).field_A >> 8);
          var6 = 8;
          var7 = (int)(65536.0 * Math.atan2((double)(-((wl) this).field_eb), (double)(-((wl) this).field_F)) / 6.283185307179586);
          if (19 == ((wl) this).field_C) {
            pb.b(var4, var5, 100, 16777215, 16);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 == 4) {
            break L1;
          } else {
            boolean discarded$1 = this.g(-67, 19);
            break L1;
          }
        }
        L2: {
          if (((wl) this).field_C < 12) {
            break L2;
          } else {
            if (16 < ((wl) this).field_C) {
              break L2;
            } else {
              if (((wl) this).field_eb != 1) {
                sb.field_W.a(-(sb.field_W.field_z / 2) + var4, -(sb.field_W.field_B / 2) + var5);
                break L2;
              } else {
                hb.field_e.a(var4 - sb.field_W.field_z / 2, var5 - sb.field_W.field_B / 2);
                break L2;
              }
            }
          }
        }
        if (var4 < -32) {
          return;
        } else {
          L3: {
            if (672 < var4) {
              break L3;
            } else {
              if (var5 < -32) {
                break L3;
              } else {
                if (672 < var5) {
                  break L3;
                } else {
                  L4: {
                    if (((wl) this).field_C != 2) {
                      L5: {
                        if (((wl) this).field_C != 4) {
                          if (((wl) this).field_C != 6) {
                            break L5;
                          } else {
                            var8 = 2000;
                            var9 = var8 >> 7;
                            var30 = new int[1024];
                            var28 = var30;
                            var26 = var28;
                            var24 = var26;
                            var10 = var24;
                            var11 = 0;
                            L6: while (true) {
                              if (var11 >= 512) {
                                qh.b(10000, var5 << 4, 15, var4 << 4, var9 << 4);
                                pb.a(var4 << 4, var5 << 4, var9 << 4, 500, var30);
                                if (((wl) this).field_y == 18) {
                                  var11 = (int)(Math.cos(0.2 * (double)((wl) this).field_Z) * 150.0);
                                  var12 = (int)(Math.sin((double)((wl) this).field_Z * 0.2) * 150.0);
                                  pb.a((var4 << 4) - -var11, var12 + (var5 << 4), var9 << 3, 250, var30);
                                  pb.a((var4 << 4) - var11, (var5 << 4) - var12, var9 << 3, 250, var30);
                                  break L5;
                                } else {
                                  if (((wl) this).field_y != 31) {
                                    break L5;
                                  } else {
                                    var11 = (int)(Math.cos((double)((wl) this).field_Z * 0.2) * 150.0);
                                    var12 = (int)(150.0 * Math.sin(0.2 * (double)((wl) this).field_Z));
                                    pb.a(var11 + (var4 << 4), (var5 << 4) - -var12, var9 << 3, 250, var30);
                                    pb.a((var4 << 4) - var11, -var12 + (var5 << 4), var9 << 3, 250, var30);
                                    var11 = var11 * 2;
                                    var12 = var12 * 2;
                                    pb.a(var12 + (var4 << 4), (var5 << 4) - var11, var9 << 3, 250, var30);
                                    pb.a(-var12 + (var4 << 4), (var5 << 4) + var11, var9 << 3, 250, var30);
                                    break L4;
                                  }
                                }
                              } else {
                                L7: {
                                  var12 = var11 / 6;
                                  var13 = var11 / 5;
                                  var14 = var11 / 4;
                                  if (var11 <= 448) {
                                    break L7;
                                  } else {
                                    var14 = var14 + 4 * (-192 + var11 - 256) / 2;
                                    var13 = var13 + (-256 + (var11 - 192)) * 4 / 3;
                                    var12 = var12 + (var11 - 448) * 4 / 4;
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (var14 > 255) {
                                    var14 = 255;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (var13 <= 255) {
                                    break L9;
                                  } else {
                                    var13 = 255;
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (255 < var12) {
                                    var12 = 255;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                var10[var11] = var12 * 65536 - (-(256 * var13) - var14);
                                var11++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          if (((wl) this).field_L == 32) {
                            break L5;
                          } else {
                            L11: {
                              var8 = 120;
                              var9 = 49;
                              var10_int = 1114111;
                              var11_ref_int__ = pe.field_o;
                              if (((wl) this).field_y != 17) {
                                break L11;
                              } else {
                                var8 = 120;
                                var10_int = 8978431;
                                break L11;
                              }
                            }
                            L12: {
                              if (((wl) this).field_y != 30) {
                                break L12;
                              } else {
                                var8 = 120;
                                var10_int = 16777215;
                                break L12;
                              }
                            }
                            L13: {
                              if (((wl) this).field_y == 35) {
                                var8 = 180;
                                var11_ref_int__ = pe.field_N;
                                var9 = 99;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (((wl) this).field_y == 21) {
                                var11_ref_int__ = pe.field_N;
                                var8 = 96;
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            L15: {
                              if (((wl) this).field_y == 10) {
                                var8 = 64;
                                var11_ref_int__ = pe.field_N;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              if (((wl) this).field_y == 21) {
                                break L16;
                              } else {
                                if (((wl) this).field_y == 10) {
                                  break L16;
                                } else {
                                  var8 = var8 * 2;
                                  var8 = var8 - 32 * ((wl) this).field_Z;
                                  if (var8 < 0) {
                                    var8 = 0;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            L17: {
                              var12 = var8 >> 5;
                              var13 = -((((wl) this).field_L - -2) * ((wl) this).field_eb >> 4);
                              var14 = -((((wl) this).field_L + 2) * ((wl) this).field_F >> 4);
                              if (var12 < 2) {
                                var12 = 2;
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (((wl) this).field_y != 17) {
                                break L18;
                              } else {
                                var14 = var14 / 2;
                                var13 = var13 / 2;
                                break L18;
                              }
                            }
                            L19: {
                              if (!ka.field_V) {
                                break L19;
                              } else {
                                if (3 <= var12) {
                                  break L19;
                                } else {
                                  var12 = 3;
                                  break L19;
                                }
                              }
                            }
                            var29 = new int[var12];
                            var27 = var29;
                            var25 = var27;
                            var23 = var25;
                            var15 = var23;
                            var16_int = 0;
                            L20: while (true) {
                              if (~var16_int <= ~var29.length) {
                                L21: {
                                  if (((wl) this).field_y == 21) {
                                    var16 = 0.5 * Math.random() + 0.25;
                                    var18 = 0.5 * Math.random() - 0.25;
                                    var20 = (int)(var16 * (double)var13 + var18 * (double)var14);
                                    var21 = (int)((double)var14 * var16 - (double)var13 * var18);
                                    this.a(var14, var5, 1, var12 - 1, var13, var4, var10_int, var29);
                                    this.a(var21, var5, 1, var12, var20, var4, var10_int, var29);
                                    this.a(var14 + -var21, var5 - -(var21 / 16), 1, var12, -var20 + var13, var4 - -(var20 / 16), var10_int, var29);
                                    break L21;
                                  } else {
                                    if (((wl) this).field_y == 17) {
                                      var5 = var5 << 4;
                                      var4 = var4 << 4;
                                      var13 = var13 >> 2;
                                      var14 = var14 >> 2;
                                      var16_int = 15;
                                      L22: while (true) {
                                        if (var16_int <= 0) {
                                          break L21;
                                        } else {
                                          pb.a(var4, var5, 32 - -(var16_int * 3), 2 * var16_int + 1, hc.field_W);
                                          var5 = var5 + var14;
                                          var4 = var4 + var13;
                                          var16_int--;
                                          continue L22;
                                        }
                                      }
                                    } else {
                                      if (((wl) this).field_y != 10) {
                                        L23: {
                                          if (35 != ((wl) this).field_y) {
                                            break L23;
                                          } else {
                                            if (((wl) this).field_Z > 8) {
                                              var14 = var14 >> 3;
                                              var5 = var5 << 4;
                                              var4 = var4 << 4;
                                              var13 = var13 >> 3;
                                              var16_int = 15;
                                              L24: while (true) {
                                                if (var16_int <= 0) {
                                                  break L21;
                                                } else {
                                                  pb.a(var4, var5, 32 + var16_int * 3, var16_int * 2 + 1, hc.field_eb);
                                                  var4 = var4 + var13;
                                                  var5 = var5 + var14;
                                                  var16_int--;
                                                  continue L24;
                                                }
                                              }
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L25: {
                                          if (((wl) this).field_y != 30) {
                                            break L25;
                                          } else {
                                            if (((wl) this).field_Z > 4) {
                                              var13 = var13 >> 3;
                                              var14 = var14 >> 3;
                                              var4 = var4 << 4;
                                              var5 = var5 << 4;
                                              var16_int = 15;
                                              L26: while (true) {
                                                if (0 >= var16_int) {
                                                  break L21;
                                                } else {
                                                  pb.a(var4, var5, 32 - -(var16_int * 3), 1 + 2 * var16_int, hc.field_W);
                                                  var4 = var4 + var13;
                                                  var5 = var5 + var14;
                                                  var16_int--;
                                                  continue L26;
                                                }
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        if (2 < var12) {
                                          this.a(var14, var5, param2 + -3, var12, var13, var4, var10_int, var29);
                                          break L4;
                                        } else {
                                          pb.f(var4, var5, (var13 >> 4) + var4, (var14 >> 4) + var5, var10_int, 192);
                                          break L4;
                                        }
                                      } else {
                                        var5 = var5 << 4;
                                        var14 = var14 >> 3;
                                        var4 = var4 << 4;
                                        var13 = var13 >> 3;
                                        var16_int = 15;
                                        L27: while (true) {
                                          if (var16_int <= 0) {
                                            break L21;
                                          } else {
                                            pb.a(var4, var5, 32 + var16_int * 3, 1 - -(var16_int * 2), hc.field_eb);
                                            var5 = var5 + var14;
                                            var4 = var4 + var13;
                                            var16_int--;
                                            continue L27;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                break L4;
                              } else {
                                var15[var16_int] = var11_ref_int__[var16_int * (127 * ((wl) this).field_hb / var9) / var29.length];
                                var16_int++;
                                continue L20;
                              }
                            }
                          }
                        }
                      }
                      break L4;
                    } else {
                      L28: {
                        var8_ref_nk = ul.a(17 + ((wl) this).field_y, (byte) 67);
                        if (var8_ref_nk == null) {
                          break L28;
                        } else {
                          var8_ref_nk.field_R.a(var8_ref_nk.field_R.field_g << 3, var8_ref_nk.field_R.field_d << 3, var4 << 4, var5 << 4, var7, 1024);
                          if (((wl) this).field_y != 32) {
                            break L28;
                          } else {
                            var9 = 3 * var6 / 2;
                            b.field_n[((wl) this).field_B.field_r / 10 % 6].d(-(((wl) this).field_eb >> 6) + -var9 + var4, -(((wl) this).field_F >> 6) + var5 + -var9, var9 * 2, var9 * 2, 192);
                            break L28;
                          }
                        }
                      }
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        mb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = SteelSentinels.field_G;
        if (param0 >= 78) {
          var3 = 0;
          L0: while (true) {
            if (((wl) this).field_fb.length <= var3) {
              return;
            } else {
              L1: {
                var4 = ((wl) this).field_fb[var3];
                if (var4 == null) {
                  break L1;
                } else {
                  L2: {
                    if (((wl) this).field_X != var4) {
                      break L2;
                    } else {
                      if (((wl) this).field_C == 7) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var5 = ((wl) this).field_U + -var4.field_hc;
                  var6 = (var4.field_Db << 3) + (-var4.field_Gb + ((wl) this).field_A);
                  if (~Math.abs(var5) < ~(var4.field_Ub << 3)) {
                    break L1;
                  } else {
                    if (Math.abs(var6) > var4.field_Db << 3) {
                      break L1;
                    } else {
                      L3: {
                        if (var4 != ((wl) this).field_X) {
                          break L3;
                        } else {
                          if (((wl) this).field_Z <= 10) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var4.field_rb > 0) {
                        L4: {
                          L5: {
                            var7 = ((wl) this).field_O * ((wl) this).field_eb * ((wl) this).field_L / (10 * var4.field_Eb);
                            var8 = ((wl) this).field_L * ((wl) this).field_O * ((wl) this).field_eb / (var4.field_Eb * 10);
                            if (0 == ((wl) this).field_C) {
                              break L5;
                            } else {
                              if (((wl) this).field_C != 5) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var8 = var8 / 2;
                          var7 = var7 / 2;
                          break L4;
                        }
                        L6: {
                          L7: {
                            if (14 == ((wl) this).field_y) {
                              break L7;
                            } else {
                              if (((wl) this).field_y != 28) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (20 <= ((wl) this).field_Z) {
                            break L6;
                          } else {
                            var8 = 0;
                            var7 = 0;
                            break L6;
                          }
                        }
                        L8: {
                          if (!var4.i(31, -27)) {
                            break L8;
                          } else {
                            if (var4.field_Lb) {
                              break L8;
                            } else {
                              var8 = var8 / 2;
                              var7 = var7 / 2;
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (!var4.i(29, -27)) {
                            break L9;
                          } else {
                            if (var4.field_Lb) {
                              var7 = var7 / 2;
                              var8 = var8 / 2;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var4.field_Zb.field_N == 109) {
                            var8 = 0;
                            var7 = 0;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (var4.field_z <= 0) {
                            break L11;
                          } else {
                            var8 = 0;
                            var7 = 0;
                            break L11;
                          }
                        }
                        L12: {
                          if (((wl) this).field_C == 4) {
                            break L12;
                          } else {
                            if (0 != var4.field_oc) {
                              break L12;
                            } else {
                              var4.field_ab = var4.field_ab + var8;
                              var4.field_K = var4.field_K + var7;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          ((wl) this).field_T = true;
                          if (((wl) this).field_gb) {
                            break L13;
                          } else {
                            if (((wl) this).field_X != null) {
                              L14: {
                                L15: {
                                  if (((wl) this).field_C == 2) {
                                    break L15;
                                  } else {
                                    if (((wl) this).field_C != 1) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                if (!var4.field_Lb) {
                                  break L14;
                                } else {
                                  if (var4.field_Rb <= 0) {
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              L16: {
                                if (3 != ((wl) this).field_C) {
                                  break L16;
                                } else {
                                  if (!var4.field_Lb) {
                                    break L16;
                                  } else {
                                    if (var4.field_Rb > 0) {
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              ((wl) this).field_gb = true;
                              if (2 != ((wl) this).field_C) {
                                break L13;
                              } else {
                                ((wl) this).field_X.field_p = ((wl) this).field_X.field_p + 1;
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        L17: {
                          L18: {
                            if (0 != var7) {
                              break L18;
                            } else {
                              if (var8 == 0) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (!var4.field_Lb) {
                            var4.field_Rb = 25;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L19: {
                          ((wl) this).field_fb[var3] = null;
                          if (-1 == var4.field_o) {
                            break L19;
                          } else {
                            if (~var4.field_o != ~((wl) this).field_y) {
                              break L1;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          var4.field_S = var4.field_S - ((wl) this).field_kb;
                          if (((wl) this).field_kb <= 0) {
                            break L20;
                          } else {
                            if (var4.field_Tb <= 0) {
                              break L20;
                            } else {
                              if (var4.h(-126)) {
                                var4.a(true, Math.min(((wl) this).field_kb / 50, var4.field_Tb));
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                        L21: {
                          var4.field_P = 100;
                          if (var4.field_S >= 0) {
                            break L21;
                          } else {
                            var4.field_S = 0;
                            break L21;
                          }
                        }
                        L22: {
                          if (4 == ((wl) this).field_C) {
                            break L22;
                          } else {
                            if (6 == ((wl) this).field_C) {
                              break L22;
                            } else {
                              if (7 == ((wl) this).field_C) {
                                break L22;
                              } else {
                                L23: {
                                  if (0 >= var4.field_rb) {
                                    break L23;
                                  } else {
                                    if (var4.field_z <= 0) {
                                      var4.a((byte) 76, (wl) this);
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                L24: {
                                  L25: {
                                    if (0 >= var4.field_rb) {
                                      break L25;
                                    } else {
                                      if (((wl) this).field_X != null) {
                                        L26: {
                                          L27: {
                                            if (((wl) this).field_C == 7) {
                                              break L27;
                                            } else {
                                              if (((wl) this).field_C == 0) {
                                                break L27;
                                              } else {
                                                if (5 == ((wl) this).field_C) {
                                                  break L27;
                                                } else {
                                                  L28: {
                                                    if (((wl) this).field_C == 1) {
                                                      break L28;
                                                    } else {
                                                      if (((wl) this).field_C == 2) {
                                                        break L28;
                                                      } else {
                                                        if (((wl) this).field_C == 3) {
                                                          break L28;
                                                        } else {
                                                          if (((wl) this).field_C == 20) {
                                                            break L28;
                                                          } else {
                                                            pc discarded$5 = fc.a((byte) -128, 55, ((wl) this).field_U);
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  pc discarded$6 = fc.a((byte) -74, 51, ((wl) this).field_U);
                                                  var9 = var4.h(0, 33);
                                                  ((wl) this).field_O = ((wl) this).field_O >> var9;
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                          pc discarded$7 = fc.a((byte) 41, 49, ((wl) this).field_U);
                                          var9 = var4.h(0, 32);
                                          ((wl) this).field_O = ((wl) this).field_O >> var9;
                                          break L26;
                                        }
                                        L29: {
                                          if (((wl) this).field_y != 15) {
                                            break L29;
                                          } else {
                                            if (~((wl) this).field_jb < ~((wl) this).field_Z) {
                                              break L29;
                                            } else {
                                              if (((wl) this).field_E) {
                                                ((wl) this).field_O = ((wl) this).field_O * 4;
                                                break L29;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                        }
                                        L30: {
                                          L31: {
                                            if (((wl) this).field_y == 14) {
                                              break L31;
                                            } else {
                                              if (((wl) this).field_y != 28) {
                                                break L30;
                                              } else {
                                                break L31;
                                              }
                                            }
                                          }
                                          if (((wl) this).field_Z < 20) {
                                            ((wl) this).field_O = ((wl) this).field_O / 4;
                                            break L30;
                                          } else {
                                            break L30;
                                          }
                                        }
                                        L32: {
                                          if (var4.field_z > 0) {
                                            break L32;
                                          } else {
                                            if (var4.field_rb > 0) {
                                              var4.e(128, ((wl) this).field_O);
                                              if (((wl) this).field_y != 32) {
                                                break L32;
                                              } else {
                                                if (0 < var4.field_rb) {
                                                  break L32;
                                                } else {
                                                  L33: {
                                                    if (var4.field_Nb == 0) {
                                                      break L33;
                                                    } else {
                                                      if (var4.field_Nb != 11) {
                                                        break L32;
                                                      } else {
                                                        break L33;
                                                      }
                                                    }
                                                  }
                                                  if (((wl) this).field_X == null) {
                                                    break L32;
                                                  } else {
                                                    ((wl) this).field_X.field_y = ((wl) this).field_X.field_y + 1;
                                                    break L32;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L32;
                                            }
                                          }
                                        }
                                        L34: {
                                          var9 = ((wl) this).field_O;
                                          if (~var9 < ~var4.field_rb) {
                                            var9 = var4.field_rb;
                                            break L34;
                                          } else {
                                            break L34;
                                          }
                                        }
                                        L35: {
                                          if (var9 >= 0) {
                                            break L35;
                                          } else {
                                            var9 = 0;
                                            break L35;
                                          }
                                        }
                                        L36: {
                                          if (!var4.i(26, -27)) {
                                            break L36;
                                          } else {
                                            var4.field_S = Math.min(var4.field_Q, var4.field_S - -var9);
                                            break L36;
                                          }
                                        }
                                        L37: {
                                          if (8 == var4.field_Nb) {
                                            break L37;
                                          } else {
                                            if (var4.field_jc == ((wl) this).field_X.field_jc) {
                                              if (var4.field_z <= 0) {
                                                if (((wl) this).field_X != var4) {
                                                  ((wl) this).field_X.b(-(((wl) this).field_B.field_l * (var9 * var4.field_lb / var4.field_Eb)), 26511);
                                                  break L37;
                                                } else {
                                                  break L37;
                                                }
                                              } else {
                                                break L37;
                                              }
                                            } else {
                                              L38: {
                                                if (var4.field_z <= 0) {
                                                  ((wl) this).field_X.b(((wl) this).field_B.field_l * (var4.field_lb * var9 / var4.field_Eb), 26511);
                                                  ((wl) this).field_X.field_Ac = ((wl) this).field_X.field_Ac + var9;
                                                  break L38;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                              if (((wl) this).field_V) {
                                                break L37;
                                              } else {
                                                if (((wl) this).field_jb > ((wl) this).field_Z) {
                                                  break L37;
                                                } else {
                                                  L39: {
                                                    if (null == ((wl) this).field_nb) {
                                                      break L39;
                                                    } else {
                                                      if (3 == ((wl) this).field_C) {
                                                        break L37;
                                                      } else {
                                                        break L39;
                                                      }
                                                    }
                                                  }
                                                  ((wl) this).field_X.field_db = ((wl) this).field_X.field_db + 1;
                                                  if (0 > ((wl) this).field_X.field_q) {
                                                    break L37;
                                                  } else {
                                                    ((wl) this).field_X.field_q = 100;
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L40: {
                                          L41: {
                                            if (var9 > 0) {
                                              break L41;
                                            } else {
                                              if (var4.field_rb > 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                          if (38 != var4.field_rc) {
                                            break L24;
                                          } else {
                                            break L40;
                                          }
                                        }
                                        L42: {
                                          L43: {
                                            ((wl) this).field_gb = false;
                                            ((wl) this).field_T = false;
                                            if (var5 != 0) {
                                              break L43;
                                            } else {
                                              if (var6 != 0) {
                                                break L43;
                                              } else {
                                                ((wl) this).field_F = -((wl) this).field_F / 2;
                                                ((wl) this).field_eb = -((wl) this).field_eb / 2;
                                                break L42;
                                              }
                                            }
                                          }
                                          L44: {
                                            var10 = Math.abs((double)var4.field_Ub / (double)var4.field_Db);
                                            var12 = (double)var5 * var10;
                                            var14 = (double)var6;
                                            var16 = Math.sqrt(var12 * var12 + var14 * var14);
                                            if (0.0 != var16) {
                                              var14 = var14 / var16;
                                              var12 = var12 / var16;
                                              break L44;
                                            } else {
                                              break L44;
                                            }
                                          }
                                          var18 = -var14;
                                          var20 = var12;
                                          var22 = (double)((wl) this).field_eb * var12 + var14 * (double)((wl) this).field_F;
                                          var24 = (double)((wl) this).field_F * var20 + var18 * (double)((wl) this).field_eb;
                                          var24 = -var24;
                                          ((wl) this).field_eb = (int)(var22 * var12 + var24 * var18);
                                          ((wl) this).field_F = (int)(var22 * var14 + var24 * var20);
                                          ((wl) this).field_eb = ((wl) this).field_eb / 2;
                                          ((wl) this).field_F = ((wl) this).field_F / 2;
                                          break L42;
                                        }
                                        ((wl) this).field_O = ((wl) this).field_O / 2;
                                        break L24;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                  if (var4.field_rb <= 0) {
                                    break L24;
                                  } else {
                                    if (((wl) this).field_X != null) {
                                      break L24;
                                    } else {
                                      if (0 >= var4.field_z) {
                                        var4.e(128, ((wl) this).field_O);
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                L45: {
                                  if (~((wl) this).field_kb >= ~var4.field_mc) {
                                    break L45;
                                  } else {
                                    if (!var4.h(-125)) {
                                      break L45;
                                    } else {
                                      var4.field_mc = ((wl) this).field_kb;
                                      break L45;
                                    }
                                  }
                                }
                                if (!var4.field_Lb) {
                                  break L1;
                                } else {
                                  if (var4.i(29, -27)) {
                                    break L1;
                                  } else {
                                    var4.field_Dc = 200;
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          if (0 < var4.field_S) {
                            pc discarded$8 = fc.a((byte) -99, 27, ((wl) this).field_U);
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        var4.field_S = var4.field_S - ((wl) this).field_O;
                        if (var4.field_S >= 0) {
                          break L1;
                        } else {
                          L47: {
                            pc discarded$9 = fc.a((byte) 41, 50, ((wl) this).field_U);
                            if (var4.field_rb <= 0) {
                              break L47;
                            } else {
                              if (var4.field_z <= 0) {
                                var4.a((byte) 125, (wl) this);
                                break L47;
                              } else {
                                break L47;
                              }
                            }
                          }
                          L48: {
                            L49: {
                              if (var4.field_rb <= 0) {
                                break L49;
                              } else {
                                if (null == ((wl) this).field_X) {
                                  break L49;
                                } else {
                                  L50: {
                                    var9 = -var4.field_S;
                                    if (~var4.field_rb > ~var9) {
                                      var9 = var4.field_rb;
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  L51: {
                                    if (var9 >= 0) {
                                      break L51;
                                    } else {
                                      var9 = 0;
                                      break L51;
                                    }
                                  }
                                  L52: {
                                    if (var4.field_Nb != 8) {
                                      if (var4.field_z > 0) {
                                        break L52;
                                      } else {
                                        if (var4.field_jc == ((wl) this).field_X.field_jc) {
                                          if (((wl) this).field_X != var4) {
                                            ((wl) this).field_X.b(-(((wl) this).field_B.field_l * (var9 * var4.field_lb / var4.field_Eb)), 26511);
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        } else {
                                          ((wl) this).field_X.field_Ac = ((wl) this).field_X.field_Ac + var9;
                                          ((wl) this).field_X.b(((wl) this).field_B.field_l * (var9 * var4.field_lb / var4.field_Eb), 26511);
                                          break L52;
                                        }
                                      }
                                    } else {
                                      break L52;
                                    }
                                  }
                                  if (var4.field_z <= 0) {
                                    L53: {
                                      var4.e(128, -var4.field_S);
                                      if (var4.field_rb > 0) {
                                        break L53;
                                      } else {
                                        if (((wl) this).field_y != 32) {
                                          break L53;
                                        } else {
                                          L54: {
                                            if (var4.field_Nb == 0) {
                                              break L54;
                                            } else {
                                              if (var4.field_Nb != 11) {
                                                break L53;
                                              } else {
                                                break L54;
                                              }
                                            }
                                          }
                                          ((wl) this).field_X.field_y = ((wl) this).field_X.field_y + 1;
                                          break L53;
                                        }
                                      }
                                    }
                                    L55: {
                                      if (!var4.i(26, -27)) {
                                        break L55;
                                      } else {
                                        if (var4.field_S < 0) {
                                          var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                                          break L48;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    var4.field_S = 0;
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                              }
                            }
                            if (var4.field_rb <= 0) {
                              break L48;
                            } else {
                              if (null == ((wl) this).field_X) {
                                L56: {
                                  if (var4.field_z > 0) {
                                    break L56;
                                  } else {
                                    var4.e(128, -var4.field_S);
                                    break L56;
                                  }
                                }
                                L57: {
                                  if (!var4.i(26, -27)) {
                                    break L57;
                                  } else {
                                    if (0 <= var4.field_S) {
                                      break L57;
                                    } else {
                                      var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                                      break L48;
                                    }
                                  }
                                }
                                var4.field_S = 0;
                                break L48;
                              } else {
                                break L48;
                              }
                            }
                          }
                          L58: {
                            if (((wl) this).field_kb <= var4.field_mc) {
                              break L58;
                            } else {
                              if (!var4.h(-125)) {
                                break L58;
                              } else {
                                var4.field_mc = ((wl) this).field_kb;
                                break L58;
                              }
                            }
                          }
                          if (var4.field_Lb) {
                            if (var4.i(29, -27)) {
                              break L1;
                            } else {
                              var4.field_Dc = 200;
                              break L1;
                            }
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
              }
              var3++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 > -93) {
            return;
        }
        this.a(param1, param0, param2, true, param4, (byte) -114);
    }

    final static int a(int[] param0, int param1, boolean param2, nk param3) {
        qd[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        qd[] var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var4 = new qd[]{};
            var7 = param3.a(var4, -21636, -1);
            var4 = var7;
            var5 = 0;
            L1: while (true) {
              if (~var5 <= ~var7.length) {
                L2: {
                  if (param2) {
                    break L2;
                  } else {
                    field_J = null;
                    break L2;
                  }
                }
                stackOut_10_0 = param1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L3: {
                  if (var7[var5] == null) {
                    break L3;
                  } else {
                    if (-1 != var7[var5].field_q) {
                      int incrementValue$2 = param1;
                      param1++;
                      param0[incrementValue$2] = ec.a(var7[var5].field_q, 1008);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("wl.O(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, byte param5) {
        jb var7 = null;
        int var8 = 0;
        jb stackIn_26_0 = null;
        jb stackIn_26_1 = null;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_26_5 = 0;
        int stackIn_26_6 = 0;
        ee stackIn_26_7 = null;
        jb stackIn_27_0 = null;
        jb stackIn_27_1 = null;
        int stackIn_27_2 = 0;
        int stackIn_27_3 = 0;
        int stackIn_27_4 = 0;
        int stackIn_27_5 = 0;
        int stackIn_27_6 = 0;
        ee stackIn_27_7 = null;
        jb stackIn_28_0 = null;
        jb stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_28_4 = 0;
        int stackIn_28_5 = 0;
        int stackIn_28_6 = 0;
        ee stackIn_28_7 = null;
        mb[] stackIn_28_8 = null;
        jb stackOut_25_0 = null;
        jb stackOut_25_1 = null;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_25_5 = 0;
        int stackOut_25_6 = 0;
        ee stackOut_25_7 = null;
        jb stackOut_27_0 = null;
        jb stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        int stackOut_27_4 = 0;
        int stackOut_27_5 = 0;
        int stackOut_27_6 = 0;
        ee stackOut_27_7 = null;
        Object stackOut_27_8 = null;
        jb stackOut_26_0 = null;
        jb stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        int stackOut_26_3 = 0;
        int stackOut_26_4 = 0;
        int stackOut_26_5 = 0;
        int stackOut_26_6 = 0;
        ee stackOut_26_7 = null;
        mb[] stackOut_26_8 = null;
        L0: {
          var8 = SteelSentinels.field_G;
          if (!((wl) this).field_I) {
            break L0;
          } else {
            ((wl) this).field_T = true;
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_X == null) {
            break L1;
          } else {
            if (((wl) this).field_X.field_rc == 41) {
              param4 = param4 * 2;
              param0 = param0 * 2;
              param1 = param1 * 4;
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (((wl) this).field_V) {
          return;
        } else {
          if (((wl) this).field_I) {
            return;
          } else {
            L2: {
              if (((wl) this).field_y == 32) {
                break L2;
              } else {
                if (((wl) this).field_y == -2) {
                  break L2;
                } else {
                  if (((wl) this).field_y != 8) {
                    if (50 > param4) {
                      pc discarded$7 = fc.a((byte) 92, 86, ((wl) this).field_U);
                      break L2;
                    } else {
                      if (100 <= param4) {
                        if (param4 >= 150) {
                          if (param4 >= 200) {
                            if (param4 >= 250) {
                              pc discarded$8 = fc.a((byte) -102, 54, ((wl) this).field_U);
                              break L2;
                            } else {
                              pc discarded$9 = fc.a((byte) -120, 53, ((wl) this).field_U);
                              break L2;
                            }
                          } else {
                            pc discarded$10 = fc.a((byte) -103, 89, ((wl) this).field_U);
                            break L2;
                          }
                        } else {
                          pc discarded$11 = fc.a((byte) -89, 88, ((wl) this).field_U);
                          break L2;
                        }
                      } else {
                        pc discarded$12 = fc.a((byte) 69, 87, ((wl) this).field_U);
                        break L2;
                      }
                    }
                  } else {
                    pc discarded$13 = fc.a((byte) 27, 17, ((wl) this).field_U);
                    break L2;
                  }
                }
              }
            }
            L3: {
              stackOut_25_0 = null;
              stackOut_25_1 = null;
              stackOut_25_2 = ((wl) this).field_U;
              stackOut_25_3 = ((wl) this).field_A;
              stackOut_25_4 = 0;
              stackOut_25_5 = 0;
              stackOut_25_6 = param4;
              stackOut_25_7 = ((wl) this).field_B;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              stackIn_27_3 = stackOut_25_3;
              stackIn_27_4 = stackOut_25_4;
              stackIn_27_5 = stackOut_25_5;
              stackIn_27_6 = stackOut_25_6;
              stackIn_27_7 = stackOut_25_7;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              stackIn_26_3 = stackOut_25_3;
              stackIn_26_4 = stackOut_25_4;
              stackIn_26_5 = stackOut_25_5;
              stackIn_26_6 = stackOut_25_6;
              stackIn_26_7 = stackOut_25_7;
              if (!param3) {
                stackOut_27_0 = null;
                stackOut_27_1 = null;
                stackOut_27_2 = stackIn_27_2;
                stackOut_27_3 = stackIn_27_3;
                stackOut_27_4 = stackIn_27_4;
                stackOut_27_5 = stackIn_27_5;
                stackOut_27_6 = stackIn_27_6;
                stackOut_27_7 = (ee) (Object) stackIn_27_7;
                stackOut_27_8 = null;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                stackIn_28_2 = stackOut_27_2;
                stackIn_28_3 = stackOut_27_3;
                stackIn_28_4 = stackOut_27_4;
                stackIn_28_5 = stackOut_27_5;
                stackIn_28_6 = stackOut_27_6;
                stackIn_28_7 = stackOut_27_7;
                stackIn_28_8 = (mb[]) (Object) stackOut_27_8;
                break L3;
              } else {
                stackOut_26_0 = null;
                stackOut_26_1 = null;
                stackOut_26_2 = stackIn_26_2;
                stackOut_26_3 = stackIn_26_3;
                stackOut_26_4 = stackIn_26_4;
                stackOut_26_5 = stackIn_26_5;
                stackOut_26_6 = stackIn_26_6;
                stackOut_26_7 = (ee) (Object) stackIn_26_7;
                stackOut_26_8 = ((wl) this).field_fb;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                stackIn_28_3 = stackOut_26_3;
                stackIn_28_4 = stackOut_26_4;
                stackIn_28_5 = stackOut_26_5;
                stackIn_28_6 = stackOut_26_6;
                stackIn_28_7 = stackOut_26_7;
                stackIn_28_8 = stackOut_26_8;
                break L3;
              }
            }
            L4: {
              var7 = new jb(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_28_8, (wl) this);
              if (param5 < -96) {
                break L4;
              } else {
                ((wl) this).field_G = null;
                break L4;
              }
            }
            var7.field_G = param1;
            var7.field_U = param0;
            var7.field_O = ((wl) this).field_W;
            var7.field_K = param2;
            ((wl) this).field_B.field_u.a(3, (ck) (Object) var7);
            return;
          }
        }
    }

    final static java.applet.Applet d(byte param0) {
        if (!(fb.field_o == null)) {
            return fb.field_o;
        }
        return (java.applet.Applet) (Object) km.field_m;
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -57 % ((-11 - param0) / 36);
            var3 = (CharSequence) (Object) param1;
            stackOut_0_0 = ng.field_r.equals((Object) (Object) ui.a(1, var3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("wl.D(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    private final boolean a(int param0, byte param1) {
        int var3 = 0;
        qb var4 = null;
        int var5 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          var3 = -42;
          ((wl) this).field_L = 32;
          if (((wl) this).field_B.field_h) {
            break L0;
          } else {
            if (!((wl) this).field_V) {
              var4 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 112, ((wl) this).field_A, ((wl) this).field_ob, 10, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
              ((wl) this).field_B.field_O.a(3, (ck) (Object) var4);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (50 <= ((wl) this).field_hb) {
            break L1;
          } else {
            ((wl) this).field_hb = ((wl) this).field_hb * 6;
            break L1;
          }
        }
        L2: {
          ((wl) this).field_Z = ((wl) this).field_Z + 1;
          if (~((wl) this).field_Z < ~((wl) this).field_hb) {
            break L2;
          } else {
            if (((wl) this).field_P) {
              break L2;
            } else {
              return false;
            }
          }
        }
        L3: {
          if (0 == ((wl) this).field_y) {
            ((wl) this).a(2, 500, 2, -99, 100);
            break L3;
          } else {
            if (((wl) this).field_y == 11) {
              ((wl) this).a(10, 750, 2, -125, 500);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (((wl) this).field_I) {
            ((wl) this).field_T = true;
            break L4;
          } else {
            ((wl) this).field_B.field_J.a((byte) 92, (kd) this);
            break L4;
          }
        }
        return true;
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qb var10 = null;
        ((wl) this).field_L = param0;
        if (!((wl) this).field_B.field_h) {
            if (((wl) this).field_V) {
                return false;
            }
            var3 = 100;
            var4 = 0.5;
            if (!(3 != ((wl) this).field_y)) {
                var4 = 0.5;
                var3 = 100;
            }
            if (((wl) this).field_y == 16) {
                var4 = 0.4;
                var3 = 100;
            }
            if (!(29 != ((wl) this).field_y)) {
                var3 = 200;
                var4 = 0.3;
            }
            var6 = (int)Math.sqrt((double)(((wl) this).field_eb * ((wl) this).field_eb + ((wl) this).field_F * ((wl) this).field_F));
            var7 = (int)(Math.sin((double)(((wl) this).field_Z * ((wl) this).field_L + param1) * var4) * (double)var3);
            if (var6 > 0) {
                var8 = ((wl) this).field_F * var7 / var6;
                var9 = var7 * -((wl) this).field_eb / var6;
                var10 = nk.a(6, var8, ((wl) this).field_B, 88, ((wl) this).field_A, ((wl) this).field_ob, 100, var9, ((wl) this).field_U, ((wl) this).field_U);
                ((wl) this).field_B.field_O.a(3, (ck) (Object) var10);
            }
        }
        return false;
    }

    private final boolean e(int param0, int param1) {
        qb var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          this.g(1354276);
          ((wl) this).field_L = 8;
          if (((wl) this).field_B.field_h) {
            break L0;
          } else {
            if (((wl) this).field_V) {
              break L0;
            } else {
              if (param0 != 0) {
                break L0;
              } else {
                L1: {
                  if (((wl) this).field_y != 18) {
                    break L1;
                  } else {
                    if ((15 & ((wl) this).field_L * ((wl) this).field_B.field_r + param0) == 0) {
                      if ((((wl) this).field_B.field_r & 3) != 0) {
                        if (2 != (3 & ((wl) this).field_B.field_r)) {
                          break L0;
                        } else {
                          var3 = nk.a(5, ((wl) this).field_F / 2, ((wl) this).field_B, 104, ((wl) this).field_A, ((wl) this).field_ob, 200, -((wl) this).field_eb / 2, ((wl) this).field_U, ((wl) this).field_U);
                          ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                          break L0;
                        }
                      } else {
                        var3 = nk.a(5, -((wl) this).field_F / 2, ((wl) this).field_B, 94, ((wl) this).field_A, ((wl) this).field_ob, 200, ((wl) this).field_eb / 2, ((wl) this).field_U, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(param1 ^ 30, (ck) (Object) var3);
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                if (31 == ((wl) this).field_y) {
                  if ((7 & ((wl) this).field_B.field_r) != 0) {
                    if (4 != (7 & ((wl) this).field_B.field_r)) {
                      break L0;
                    } else {
                      var3 = nk.a(4, ((wl) this).field_F, ((wl) this).field_B, 98, ((wl) this).field_A, ((wl) this).field_ob, 200, -((wl) this).field_eb, ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(param1 + -26, (ck) (Object) var3);
                      break L0;
                    }
                  } else {
                    var3 = nk.a(4, -((wl) this).field_F, ((wl) this).field_B, param1 + 63, ((wl) this).field_A, ((wl) this).field_ob, 200, ((wl) this).field_eb, ((wl) this).field_U, ((wl) this).field_U);
                    ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        if (param1 == 29) {
          return false;
        } else {
          field_R = null;
          return false;
        }
    }

    private final boolean d(int param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        qb var4 = null;
        int var5 = 0;
        int var6_int = 0;
        qb var6 = null;
        int var7 = 0;
        wl var8 = null;
        ie var9 = null;
        wl var10 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        L0: {
          var7 = SteelSentinels.field_G;
          var3 = 200;
          if (0 != ((wl) this).field_Z) {
            break L0;
          } else {
            if (0 == param0) {
              ((wl) this).field_S = ((wl) this).field_S + -((wl) this).field_A;
              ((wl) this).field_K = ((wl) this).field_K - ((wl) this).field_U;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((wl) this).field_Z < 10) {
            L2: {
              var4_int = ((wl) this).field_K;
              var5 = ((wl) this).field_S;
              var6_int = 10 * (int)Math.sqrt((double)(var4_int / 100 * var4_int + var5 / 100 * var5));
              if (1 <= var6_int) {
                break L2;
              } else {
                var6_int = 1;
                break L2;
              }
            }
            L3: {
              ((wl) this).field_F = var3 * ((wl) this).field_Z * var5 / (var6_int * 10);
              if (((wl) this).field_y == 32) {
                break L3;
              } else {
                L4: {
                  if (null == ((wl) this).field_X) {
                    break L4;
                  } else {
                    if (0 == ((wl) this).field_X.field_Nb) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                ((wl) this).field_H = false;
                break L3;
              }
            }
            ((wl) this).field_eb = var4_int * (((wl) this).field_Z * var3) / (10 * var6_int);
            break L1;
          } else {
            if (((wl) this).field_Z >= 20) {
              L5: {
                if (((wl) this).field_y != 9) {
                  break L5;
                } else {
                  if (30 == ((wl) this).field_Z) {
                    ((wl) this).field_T = true;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              if (((wl) this).field_y != 19) {
                break L1;
              } else {
                if (((wl) this).field_Z != 30) {
                  break L1;
                } else {
                  L6: {
                    ((wl) this).field_T = true;
                    var9 = new ie(new int[1]);
                    if (!((wl) this).field_V) {
                      var5 = 0;
                      L7: while (true) {
                        if (var5 >= 7) {
                          break L6;
                        } else {
                          L8: {
                            var10 = new wl(((wl) this).field_U, ((wl) this).field_A, ((wl) this).field_eb, ((wl) this).field_F, ((wl) this).field_hb, ((wl) this).field_L, 2, ((wl) this).field_B, ((wl) this).field_X, ((wl) this).field_O / 2, ((wl) this).field_ib, ((wl) this).field_y);
                            var10.field_Z = 31;
                            var10.field_ab = ((wl) this).field_ab;
                            var10.field_V = ((wl) this).field_V;
                            var10.field_kb = ((wl) this).field_kb;
                            if (!((wl) this).field_V) {
                              break L8;
                            } else {
                              var10.field_fb = null;
                              break L8;
                            }
                          }
                          var10.field_eb = var10.field_eb + (jh.a(8192 * var5 / 7 - -((wl) this).field_B.field_r, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                          var10.field_F = var10.field_F + (kg.a(var5 * 8192 / 7 - -((wl) this).field_B.field_r, (byte) -98) * wc.a((byte) -61, var9, 16) >> 15);
                          ((wl) this).field_B.field_db.a(3, (ck) (Object) var10);
                          var5++;
                          continue L7;
                        }
                      }
                    } else {
                      if (!((wl) this).field_I) {
                        var5 = 0;
                        L9: while (true) {
                          if (var5 >= 7) {
                            break L6;
                          } else {
                            L10: {
                              var8 = new wl(((wl) this).field_U, ((wl) this).field_A, ((wl) this).field_eb, ((wl) this).field_F, ((wl) this).field_hb, ((wl) this).field_L, 2, ((wl) this).field_B, ((wl) this).field_X, ((wl) this).field_O / 2, ((wl) this).field_ib, ((wl) this).field_y);
                              var8.field_ab = ((wl) this).field_ab;
                              var8.field_Z = 31;
                              var8.field_V = ((wl) this).field_V;
                              if (((wl) this).field_V) {
                                var8.field_fb = null;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var8.field_kb = ((wl) this).field_kb;
                            var8.field_eb = var8.field_eb + (jh.a(8192 * var5 / 7 - -((wl) this).field_B.field_r, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                            var8.field_F = var8.field_F + (kg.a(8192 * var5 / 7 - -((wl) this).field_B.field_r, (byte) -94) * wc.a((byte) -61, var9, 16) >> 15);
                            pm.field_db.a(3, (ck) (Object) var8);
                            var5++;
                            continue L9;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  break L1;
                }
              }
            } else {
              L11: {
                var4_int = (int)Math.sqrt((double)(((wl) this).field_eb * ((wl) this).field_eb + ((wl) this).field_F * ((wl) this).field_F));
                if (1 > var4_int) {
                  var4_int = 1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                ((wl) this).field_F = var3 * ((wl) this).field_F / var4_int;
                ((wl) this).field_eb = ((wl) this).field_eb * var3 / var4_int;
                if (32 == ((wl) this).field_y) {
                  break L12;
                } else {
                  L13: {
                    if (((wl) this).field_X == null) {
                      break L13;
                    } else {
                      if (0 == ((wl) this).field_X.field_Nb) {
                        break L13;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((wl) this).field_H = false;
                  break L12;
                }
              }
              break L1;
            }
          }
        }
        L14: {
          ((wl) this).field_L = 12;
          if (((wl) this).field_y != 32) {
            break L14;
          } else {
            if (((wl) this).field_Z <= 10) {
              break L14;
            } else {
              L15: {
                if (((wl) this).field_B.field_h) {
                  break L15;
                } else {
                  if (((wl) this).field_V) {
                    break L15;
                  } else {
                    if ((1 & ((wl) this).field_B.field_r + param0) != 0) {
                      break L15;
                    } else {
                      var4_int = -(((wl) this).field_eb * 20) + ((wl) this).field_U;
                      var5 = ((wl) this).field_A + -(20 * ((wl) this).field_F);
                      var6 = nk.a(1, -((wl) this).field_F - ((wl) this).field_eb, ((wl) this).field_B, 99, var5, ((wl) this).field_ob, 50, -((wl) this).field_F + ((wl) this).field_eb, var4_int, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var6);
                      var6 = nk.a(1, -((wl) this).field_eb + ((wl) this).field_F, ((wl) this).field_B, 106, var5, ((wl) this).field_ob, 50, -((wl) this).field_eb + -((wl) this).field_F, var4_int, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var6);
                      var6 = nk.a(0, -((wl) this).field_eb / 2, ((wl) this).field_B, 122, var5, ((wl) this).field_ob, 250, -((wl) this).field_F / 2, var4_int, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var6);
                      break L15;
                    }
                  }
                }
              }
              L16: {
                stackOut_50_0 = this;
                stackIn_52_0 = stackOut_50_0;
                stackIn_51_0 = stackOut_50_0;
                if (((wl) this).field_Z % 2 != 0) {
                  stackOut_52_0 = this;
                  stackOut_52_1 = 0;
                  stackIn_53_0 = stackOut_52_0;
                  stackIn_53_1 = stackOut_52_1;
                  break L16;
                } else {
                  stackOut_51_0 = this;
                  stackOut_51_1 = 1;
                  stackIn_53_0 = stackOut_51_0;
                  stackIn_53_1 = stackOut_51_1;
                  break L16;
                }
              }
              ((wl) this).field_H = stackIn_53_1 != 0;
              return false;
            }
          }
        }
        L17: {
          if (((wl) this).field_B.field_h) {
            break L17;
          } else {
            if (((wl) this).field_V) {
              break L17;
            } else {
              if (0 != (((wl) this).field_B.field_r + param0 & 1)) {
                break L17;
              } else {
                var4 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 108, ((wl) this).field_A, ((wl) this).field_ob, 50, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                ((wl) this).field_B.field_O.a(3, (ck) (Object) var4);
                var4 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 101, ((wl) this).field_A, ((wl) this).field_ob, 250, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                ((wl) this).field_B.field_O.a(3, (ck) (Object) var4);
                break L17;
              }
            }
          }
        }
        return false;
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                param2 = hk.a('_', "", param1, param2);
                var3 = ri.a(-1, param2);
                if (param0.indexOf(param2) != -1) {
                  break L2;
                } else {
                  if (param0.indexOf(var3) == -1) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3_ref;
            stackOut_6_1 = new StringBuilder().append("wl.I(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    private final boolean f(int param0, int param1) {
        qb var3 = null;
        int var4 = 0;
        int var6 = 0;
        wl var7 = null;
        ie var8 = null;
        wl var9 = null;
        ie var10 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          L1: {
            var6 = SteelSentinels.field_G;
            if (((wl) this).field_L == 0) {
              break L1;
            } else {
              if (((wl) this).field_L == 7) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ((wl) this).field_L = 8;
          break L0;
        }
        L2: {
          if (((wl) this).field_y == 15) {
            ((wl) this).field_L = 16;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (((wl) this).field_y != 2) {
              break L4;
            } else {
              L5: {
                if (((wl) this).field_Z > ((wl) this).field_z) {
                  break L5;
                } else {
                  if (((wl) this).field_bb) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              L6: {
                if (((wl) this).field_bb) {
                  ((wl) this).field_eb = 0;
                  ((wl) this).field_F = 0;
                  break L6;
                } else {
                  ((wl) this).field_F = ((wl) this).field_F / 2;
                  ((wl) this).field_eb = ((wl) this).field_eb / 2;
                  break L6;
                }
              }
              L7: {
                ((wl) this).field_T = true;
                if (!((wl) this).field_V) {
                  var10 = new ie(new int[3]);
                  var4 = 0;
                  L8: while (true) {
                    if (~var4 <= ~((wl) this).field_M) {
                      break L7;
                    } else {
                      L9: {
                        var9 = new wl(((wl) this).field_U, ((wl) this).field_A, ((wl) this).field_eb, ((wl) this).field_F, ((wl) this).field_hb, ((wl) this).field_L, 8, ((wl) this).field_B, ((wl) this).field_X, ((wl) this).field_O, ((wl) this).field_ib, ((wl) this).field_y);
                        var9.field_ab = ((wl) this).field_ab;
                        var9.field_G = ((wl) this).field_G;
                        var9.field_V = ((wl) this).field_V;
                        var9.field_kb = ((wl) this).field_kb;
                        if (((wl) this).field_V) {
                          var9.field_fb = null;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var9.field_eb = var9.field_eb + (jh.a(8192 * var4 / 10 - -((wl) this).field_B.field_r, 4096) * wc.a((byte) -61, var10, 64) >> 16);
                      var9.field_F = var9.field_F + (kg.a(((wl) this).field_B.field_r + var4 * 8192 / 10, (byte) -98) * wc.a((byte) -61, var10, 48) >> 16);
                      ((wl) this).field_B.field_db.a(3, (ck) (Object) var9);
                      var4++;
                      continue L8;
                    }
                  }
                } else {
                  if (!((wl) this).field_I) {
                    var8 = new ie(new int[3]);
                    var4 = 0;
                    L10: while (true) {
                      if (~((wl) this).field_M >= ~var4) {
                        break L7;
                      } else {
                        L11: {
                          var7 = new wl(((wl) this).field_U, ((wl) this).field_A, ((wl) this).field_eb, ((wl) this).field_F, ((wl) this).field_hb, ((wl) this).field_L, 8, ((wl) this).field_B, ((wl) this).field_X, ((wl) this).field_O, ((wl) this).field_ib, ((wl) this).field_y);
                          var7.field_V = ((wl) this).field_V;
                          var7.field_ab = ((wl) this).field_ab;
                          if (((wl) this).field_V) {
                            var7.field_fb = null;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var7.field_kb = ((wl) this).field_kb;
                        var7.field_eb = var7.field_eb + (jh.a(((wl) this).field_B.field_r + 8192 * var4 / 10, 4096) * wc.a((byte) -61, var8, 64) >> 16);
                        var7.field_F = var7.field_F + (kg.a(((wl) this).field_B.field_r + 8192 * var4 / 10, (byte) -108) * wc.a((byte) -61, var8, 48) >> 16);
                        pm.field_db.a(3, (ck) (Object) var7);
                        var4++;
                        continue L10;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              if (((wl) this).field_B.field_h) {
                break L3;
              } else {
                if (((wl) this).field_V) {
                  break L3;
                } else {
                  var3 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 107, ((wl) this).field_A, ((wl) this).field_ob, 25, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                  ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                  break L3;
                }
              }
            }
          }
          if (((wl) this).field_y == 2) {
            L12: {
              stackOut_34_0 = this;
              stackIn_36_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (((wl) this).field_L == 3) {
                stackOut_36_0 = this;
                stackOut_36_1 = 0;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                break L12;
              } else {
                stackOut_35_0 = this;
                stackOut_35_1 = 1;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                break L12;
              }
            }
            L13: {
              L14: {
                ((wl) this).field_H = stackIn_37_1 != 0;
                if (((wl) this).field_L == 2) {
                  break L14;
                } else {
                  if (((wl) this).field_L != 8) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              ((wl) this).field_L = 4;
              break L13;
            }
            if (((wl) this).field_B.field_h) {
              break L3;
            } else {
              if (!((wl) this).field_V) {
                var3 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 97, ((wl) this).field_A, ((wl) this).field_ob, 25, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            L15: {
              if (14 == ((wl) this).field_y) {
                break L15;
              } else {
                if (((wl) this).field_y == 28) {
                  break L15;
                } else {
                  if (((wl) this).field_B.field_h) {
                    break L3;
                  } else {
                    if (!((wl) this).field_V) {
                      var3 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 110, ((wl) this).field_A, ((wl) this).field_ob, 5, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                      if (((wl) this).field_y == 27) {
                        var3 = nk.a(8, -((wl) this).field_eb / 2, ((wl) this).field_B, 94, ((wl) this).field_A, ((wl) this).field_ob, 25, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                        break L3;
                      } else {
                        L16: {
                          var3 = nk.a(8, -((wl) this).field_eb / 2, ((wl) this).field_B, 99, ((wl) this).field_A, ((wl) this).field_ob, 10, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                          if (((wl) this).field_y != 15) {
                            break L16;
                          } else {
                            if (~((wl) this).field_Z > ~((wl) this).field_jb) {
                              break L16;
                            } else {
                              if (null == ((wl) this).field_X) {
                                break L16;
                              } else {
                                if (((wl) this).field_E) {
                                  var3.field_M = 3;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                        }
                        ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                        break L3;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
            ((wl) this).field_H = true;
            ((wl) this).field_L = 16;
            if (((wl) this).field_B.field_h) {
              break L3;
            } else {
              if (((wl) this).field_V) {
                break L3;
              } else {
                L17: {
                  if (((wl) this).field_y != 28) {
                    break L17;
                  } else {
                    if (3 <= ((wl) this).field_Z) {
                      break L17;
                    } else {
                      var3 = nk.a(1, -((wl) this).field_eb / 2, ((wl) this).field_B, 120, ((wl) this).field_A, ((wl) this).field_ob, 35 - ((wl) this).field_Z * 10, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                      break L3;
                    }
                  }
                }
                if (((wl) this).field_Z >= 1) {
                  var3 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 90, ((wl) this).field_A, ((wl) this).field_ob, 5, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                  ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                  break L3;
                } else {
                  var3 = nk.a(1, -((wl) this).field_eb / 2, ((wl) this).field_B, 125, ((wl) this).field_A, ((wl) this).field_ob, 18 + -(((wl) this).field_Z * 8), -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                  ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
                  break L3;
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean b(int param0, byte param1) {
        qb var3 = null;
        if (param1 > -107) {
            boolean discarded$0 = this.b(31, (byte) -17);
        }
        ((wl) this).field_H = 0 == (1 & param0) ? true : false;
        ((wl) this).field_L = 2;
        if (!((wl) this).field_B.field_h) {
            if (!((wl) this).field_V) {
                var3 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 112, ((wl) this).field_A, ((wl) this).field_ob, 25, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                ((wl) this).field_B.field_O.a(3, (ck) (Object) var3);
            }
        }
        if (((wl) this).field_y == 2) {
            if (((wl) this).field_bb) {
                if (((wl) this).field_T) {
                    return false;
                }
                ((wl) this).a(5, 256, 4, -113, 50);
                ((wl) this).field_T = true;
            }
        }
        return false;
    }

    final static void c(byte param0) {
        int[] var1 = null;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var2 = null;
        if (oa.a(0, true)) {
            var2 = ao.field_B;
            var1 = var2;
            var2[1] = vn.a(var2[1], 64);
            var3 = ao.field_A;
            var1 = var3;
            var3[1] = ec.a(var3[1], -65);
        } else {
            var4 = ao.field_B;
            var1 = var4;
            var4[1] = ec.a(var4[1], -65);
            var5 = ao.field_A;
            var1 = var5;
            var5[1] = vn.a(var5[1], 64);
        }
        if (param0 < 7) {
            field_N = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var22 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 + param4 < 0) {
                param5 = param5 + (param4 >> 4);
                param1 = param1 + (param0 >> 4);
                param4 = -param4;
                param0 = -param0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9_int = pb.field_i;
              var10 = pb.field_b;
              var11 = pb.field_l;
              var12 = pb.field_d;
              if (param2 == 1) {
                break L2;
              } else {
                var23 = null;
                int discarded$1 = wl.a((int[]) null, -55, false, (nk) null);
                break L2;
              }
            }
            L3: {
              var13 = pb.field_c;
              var27 = pb.field_g;
              var26 = var27;
              var25 = var26;
              var24 = var25;
              var17 = var24;
              if (((wl) this).field_W) {
                break L3;
              } else {
                if (((wl) this).field_y == 35) {
                  break L3;
                } else {
                  if (((wl) this).field_y == 4) {
                    break L3;
                  } else {
                    pb.e(param5, param1, param3 + -1, 16777215);
                    pb.c(param5, param1, param3 - 1, param6);
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (param4 > param0) {
                L5: {
                  param1 = param1 << 16;
                  var12 = var12 - param3;
                  var11 = var11 + param3;
                  param1 = param1 + 32768;
                  param0 = param0 << 12;
                  param4 = param4 >> 4;
                  var18 = (int)Math.floor(0.5 + (double)param0 / (double)param4);
                  param4 = param4 + param5;
                  if (~param5 > ~var9_int) {
                    param1 = param1 + (-param5 + var9_int) * var18;
                    param5 = var9_int;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 <= param4) {
                  param4 = -1 + var10;
                  L6: while (true) {
                    if (~param5 < ~param4) {
                      break L4;
                    } else {
                      L7: {
                        var19 = param1 >> 16;
                        param1 = param1 + var18;
                        if (var11 > var19) {
                          break L7;
                        } else {
                          if (~var19 <= ~var12) {
                            break L7;
                          } else {
                            var14 = -(var13 * param3) + (param5 + var13 * var19);
                            var20 = 0;
                            L8: while (true) {
                              if (~var20 <= ~param3) {
                                var14 = var14 + param3 * var13;
                                var20 = 1;
                                L9: while (true) {
                                  if (param3 <= var20) {
                                    break L7;
                                  } else {
                                    param6 = param7[var20];
                                    var14 = var14 - var13;
                                    var15 = var27[var14];
                                    var16 = param6 + var15;
                                    var21 = (var15 & 16711935) + (16711935 & param6);
                                    var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                                    var17[var14] = vn.a(var16 + -var15, var15 + -(var15 >>> 8));
                                    var20++;
                                    continue L9;
                                  }
                                }
                              } else {
                                var14 = var14 + var13;
                                param6 = param7[var20];
                                var15 = var27[var14];
                                var16 = param6 + var15;
                                var21 = (16711935 & param6) + (var15 & 16711935);
                                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                                var17[var14] = vn.a(var15 + -(var15 >>> 8), var16 - var15);
                                var20++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      param5++;
                      continue L6;
                    }
                  }
                } else {
                  if (~param5 < ~param4) {
                    break L4;
                  } else {
                    L10: {
                      var19 = param1 >> 16;
                      param1 = param1 + var18;
                      if (var11 > var19) {
                        break L10;
                      } else {
                        if (~var19 <= ~var12) {
                          break L10;
                        } else {
                          var14 = -(var13 * param3) + (param5 + var13 * var19);
                          var20 = 0;
                          L11: while (true) {
                            if (~var20 <= ~param3) {
                              L12: while (true) {
                                var14 = var14 + param3 * var13;
                                var20 = 1;
                                L13: while (true) {
                                  if (param3 <= var20) {
                                    L14: while (true) {
                                      param5++;
                                      if (~param5 < ~param4) {
                                        break L4;
                                      } else {
                                        var19 = param1 >> 16;
                                        param1 = param1 + var18;
                                        if (var11 > var19) {
                                          continue L14;
                                        } else {
                                          if (~var19 <= ~var12) {
                                            continue L14;
                                          } else {
                                            var14 = -(var13 * param3) + (param5 + var13 * var19);
                                            var20 = 0;
                                            L15: while (true) {
                                              if (~var20 <= ~param3) {
                                                continue L12;
                                              } else {
                                                var14 = var14 + var13;
                                                param6 = param7[var20];
                                                var15 = var27[var14];
                                                var16 = param6 + var15;
                                                var21 = (16711935 & param6) + (var15 & 16711935);
                                                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                                                var17[var14] = vn.a(var15 + -(var15 >>> 8), var16 - var15);
                                                var20++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    param6 = param7[var20];
                                    var14 = var14 - var13;
                                    var15 = var27[var14];
                                    var16 = param6 + var15;
                                    var21 = (var15 & 16711935) + (16711935 & param6);
                                    var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                                    var17[var14] = vn.a(var16 + -var15, var15 + -(var15 >>> 8));
                                    var20++;
                                    continue L13;
                                  }
                                }
                              }
                            } else {
                              var14 = var14 + var13;
                              param6 = param7[var20];
                              var15 = var27[var14];
                              var16 = param6 + var15;
                              var21 = (16711935 & param6) + (var15 & 16711935);
                              var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                              var17[var14] = vn.a(var15 + -(var15 >>> 8), var16 - var15);
                              var20++;
                              continue L11;
                            }
                          }
                        }
                      }
                    }
                    L16: while (true) {
                      param5++;
                      if (~param5 < ~param4) {
                        break L4;
                      } else {
                        var19 = param1 >> 16;
                        param1 = param1 + var18;
                        if (var11 > var19) {
                          continue L16;
                        } else {
                          if (~var19 <= ~var12) {
                            continue L16;
                          } else {
                            var14 = -(var13 * param3) + (param5 + var13 * var19);
                            var20 = 0;
                            L17: while (true) {
                              if (~var20 <= ~param3) {
                                var14 = var14 + param3 * var13;
                                var20 = 1;
                                L18: while (true) {
                                  if (param3 <= var20) {
                                    continue L16;
                                  } else {
                                    param6 = param7[var20];
                                    var14 = var14 - var13;
                                    var15 = var27[var14];
                                    var16 = param6 + var15;
                                    var21 = (var15 & 16711935) + (16711935 & param6);
                                    var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                                    var17[var14] = vn.a(var16 + -var15, var15 + -(var15 >>> 8));
                                    var20++;
                                    continue L18;
                                  }
                                }
                              } else {
                                var14 = var14 + var13;
                                param6 = param7[var20];
                                var15 = var27[var14];
                                var16 = param6 + var15;
                                var21 = (16711935 & param6) + (var15 & 16711935);
                                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                                var17[var14] = vn.a(var15 + -(var15 >>> 8), var16 - var15);
                                var20++;
                                continue L17;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                L19: {
                  param5 = param5 << 16;
                  var10 = var10 - param3;
                  var9_int = var9_int + param3;
                  param0 = param0 >> 4;
                  param5 = param5 + 32768;
                  param4 = param4 << 12;
                  var18 = (int)Math.floor(0.5 + (double)param4 / (double)param0);
                  param0 = param0 + param1;
                  if (~var12 >= ~param0) {
                    param0 = -1 + var12;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (~var11 < ~param1) {
                    param5 = param5 + (var11 + -param1) * var18;
                    param1 = var11;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: while (true) {
                  if (~param0 > ~param1) {
                    break L4;
                  } else {
                    L22: {
                      var19 = param5 >> 16;
                      param5 = param5 + var18;
                      if (var9_int > var19) {
                        break L22;
                      } else {
                        if (var10 > var19) {
                          var14 = var13 * param1 + var19 - param3;
                          var20 = 0;
                          L23: while (true) {
                            if (param3 <= var20) {
                              var14 = var14 + param3;
                              var20 = 1;
                              L24: while (true) {
                                if (~var20 <= ~param3) {
                                  break L22;
                                } else {
                                  var14--;
                                  param6 = param7[var20];
                                  var15 = var27[var14];
                                  var16 = param6 + var15;
                                  var21 = (16711935 & var15) + (16711935 & param6);
                                  var15 = (-var21 + var16 & 65536) + (var21 & 16777472);
                                  var17[var14] = vn.a(var15 + -(var15 >>> 8), -var15 + var16);
                                  var20++;
                                  continue L24;
                                }
                              }
                            } else {
                              var14++;
                              param6 = param7[var20];
                              var15 = var27[var14];
                              var16 = param6 + var15;
                              var21 = (param6 & 16711935) + (var15 & 16711935);
                              var15 = (65536 & -var21 + var16) + (16777472 & var21);
                              var17[var14] = vn.a(-var15 + var16, var15 - (var15 >>> 8));
                              var20++;
                              continue L23;
                            }
                          }
                        } else {
                          break L22;
                        }
                      }
                    }
                    param1++;
                    continue L21;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var9 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var9;
            stackOut_50_1 = new StringBuilder().append("wl.S(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param7 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L25;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L25;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final static boolean j(int param0) {
        if (param0 != 16777215) {
            return true;
        }
        return jn.field_b == nj.field_ab ? true : false;
    }

    private final boolean a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        qb var4_ref_qb = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        qb var7 = null;
        int var8 = 0;
        int var9 = 0;
        qb var10 = null;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param0 < -1) {
            break L0;
          } else {
            ((wl) this).field_Z = 101;
            break L0;
          }
        }
        L1: {
          var3 = 300;
          if (((wl) this).field_Z < 20) {
            L2: {
              var4 = ((wl) this).field_eb;
              var5 = ((wl) this).field_F;
              var6 = (int)Math.sqrt((double)(var5 * var5 + var4 * var4));
              if (1 > var6) {
                var6 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            ((wl) this).field_H = false;
            ((wl) this).field_eb = (((wl) this).field_Z - -5) * (var4 * var3) / (var6 * 25);
            ((wl) this).field_F = var5 * ((((wl) this).field_Z - -5) * var3) / (var6 * 25);
            if (((wl) this).field_B.field_h) {
              break L1;
            } else {
              if (((wl) this).field_V) {
                break L1;
              } else {
                if ((((wl) this).field_B.field_r - -param1 & 1) != 0) {
                  break L1;
                } else {
                  var7 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 95, ((wl) this).field_A, ((wl) this).field_ob, 200, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                  ((wl) this).field_B.field_O.a(3, (ck) (Object) var7);
                  var7 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 113, ((wl) this).field_A, ((wl) this).field_ob, 50, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                  ((wl) this).field_B.field_O.a(3, (ck) (Object) var7);
                  break L1;
                }
              }
            }
          } else {
            if (((wl) this).field_Z < 128) {
              L3: {
                if (null == ((wl) this).field_nb) {
                  break L3;
                } else {
                  if (((wl) this).field_nb.field_pc) {
                    ((wl) this).field_nb = null;
                    break L3;
                  } else {
                    ((wl) this).field_K = ((wl) this).field_nb.field_hc;
                    ((wl) this).field_S = -(((wl) this).field_nb.field_Db << 3) + ((wl) this).field_nb.field_Gb;
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  var4 = (-((wl) this).field_U + ((wl) this).field_K) / 10;
                  var5 = (-((wl) this).field_A + ((wl) this).field_S) / 10;
                  var6 = cm.a(var5, 200, var4);
                  var7_int = cm.a(((wl) this).field_F, 200, ((wl) this).field_eb);
                  var8 = -4096 + (8191 & -var7_int + (var6 - -4096));
                  var9 = kk.a(((wl) this).field_F, ((wl) this).field_eb, -22967);
                  if (var8 < -1024) {
                    break L5;
                  } else {
                    if (1024 < var8) {
                      break L5;
                    } else {
                      if (300 > var9) {
                        var9 += 5;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if (var9 < 300) {
                    var9 += 5;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (var9 <= 300) {
                  break L4;
                } else {
                  var9 -= 5;
                  break L4;
                }
              }
              L7: {
                if (var8 > 16) {
                  var8 = 16;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var8 >= -16) {
                  break L8;
                } else {
                  var8 = -16;
                  break L8;
                }
              }
              L9: {
                if (var4 * ((wl) this).field_eb >= 0) {
                  break L9;
                } else {
                  if (((wl) this).field_cb * ((wl) this).field_eb <= 0) {
                    break L9;
                  } else {
                    if (((wl) this).field_Q * ((wl) this).field_F <= 0) {
                      break L9;
                    } else {
                      if (null != ((wl) this).field_nb) {
                        if (((wl) this).field_F * (((wl) this).field_eb * var8) < 0) {
                          var8 = -var8;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
              L10: {
                var7_int = var7_int + var8;
                ((wl) this).field_eb = kg.a(var7_int, (byte) -127) * var9 >> 16;
                ((wl) this).field_F = jh.a(var7_int, 4096) * var9 >> 16;
                ((wl) this).field_H = false;
                if (((wl) this).field_B.field_h) {
                  break L10;
                } else {
                  if (((wl) this).field_V) {
                    break L10;
                  } else {
                    if (0 == (((wl) this).field_B.field_r + param1 & 1)) {
                      var10 = nk.a(2, -((wl) this).field_eb / 2, ((wl) this).field_B, 102, ((wl) this).field_A, ((wl) this).field_ob, 200, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var10);
                      var10 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 107, ((wl) this).field_A, ((wl) this).field_ob, 50, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var10);
                      break L10;
                    } else {
                      ((wl) this).field_L = 4;
                      return false;
                    }
                  }
                }
              }
              break L1;
            } else {
              if (((wl) this).field_B.field_h) {
                break L1;
              } else {
                if (((wl) this).field_V) {
                  break L1;
                } else {
                  if (0 == (((wl) this).field_B.field_r - -param1 & 1)) {
                    var4_ref_qb = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 120, ((wl) this).field_A, ((wl) this).field_ob, 50, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                    ((wl) this).field_B.field_O.a(3, (ck) (Object) var4_ref_qb);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
        ((wl) this).field_L = 4;
        return false;
    }

    final void i(int param0) {
        int var2 = 0;
        mb var2_ref_mb = null;
        double var2_double = 0.0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        qb var4_ref_qb = null;
        mb var4_ref_mb = null;
        int var5 = 0;
        wl var5_ref_wl = null;
        int var6 = 0;
        qb var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        wl var10 = null;
        ie var11 = null;
        jc var12 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_294_0 = 0;
        int stackIn_294_1 = 0;
        ee stackIn_294_2 = null;
        int stackIn_294_3 = 0;
        int stackIn_294_4 = 0;
        boolean stackIn_294_5 = false;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        ee stackIn_295_2 = null;
        int stackIn_295_3 = 0;
        int stackIn_295_4 = 0;
        boolean stackIn_295_5 = false;
        int stackIn_296_0 = 0;
        int stackIn_296_1 = 0;
        ee stackIn_296_2 = null;
        int stackIn_296_3 = 0;
        int stackIn_296_4 = 0;
        boolean stackIn_296_5 = false;
        int stackIn_296_6 = 0;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        ee stackIn_304_2 = null;
        int stackIn_304_3 = 0;
        int stackIn_304_4 = 0;
        boolean stackIn_304_5 = false;
        int stackIn_305_0 = 0;
        int stackIn_305_1 = 0;
        ee stackIn_305_2 = null;
        int stackIn_305_3 = 0;
        int stackIn_305_4 = 0;
        boolean stackIn_305_5 = false;
        int stackIn_306_0 = 0;
        int stackIn_306_1 = 0;
        ee stackIn_306_2 = null;
        int stackIn_306_3 = 0;
        int stackIn_306_4 = 0;
        boolean stackIn_306_5 = false;
        int stackIn_306_6 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_303_0 = 0;
        int stackOut_303_1 = 0;
        ee stackOut_303_2 = null;
        int stackOut_303_3 = 0;
        int stackOut_303_4 = 0;
        boolean stackOut_303_5 = false;
        int stackOut_305_0 = 0;
        int stackOut_305_1 = 0;
        ee stackOut_305_2 = null;
        int stackOut_305_3 = 0;
        int stackOut_305_4 = 0;
        boolean stackOut_305_5 = false;
        int stackOut_305_6 = 0;
        int stackOut_304_0 = 0;
        int stackOut_304_1 = 0;
        ee stackOut_304_2 = null;
        int stackOut_304_3 = 0;
        int stackOut_304_4 = 0;
        boolean stackOut_304_5 = false;
        int stackOut_304_6 = 0;
        int stackOut_293_0 = 0;
        int stackOut_293_1 = 0;
        ee stackOut_293_2 = null;
        int stackOut_293_3 = 0;
        int stackOut_293_4 = 0;
        boolean stackOut_293_5 = false;
        int stackOut_295_0 = 0;
        int stackOut_295_1 = 0;
        ee stackOut_295_2 = null;
        int stackOut_295_3 = 0;
        int stackOut_295_4 = 0;
        boolean stackOut_295_5 = false;
        int stackOut_295_6 = 0;
        int stackOut_294_0 = 0;
        int stackOut_294_1 = 0;
        ee stackOut_294_2 = null;
        int stackOut_294_3 = 0;
        int stackOut_294_4 = 0;
        boolean stackOut_294_5 = false;
        int stackOut_294_6 = 0;
        L0: {
          var3 = null;
          var9 = SteelSentinels.field_G;
          ((wl) this).field_H = true;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (((wl) this).field_B.field_ab.a(false, ((wl) this).field_U >> 4) <= -(((wl) this).field_A >> 4)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((wl) this).field_ob = stackIn_3_1 != 0;
        if (19 != ((wl) this).field_C) {
          L1: {
            if (((wl) this).field_C < 12) {
              break L1;
            } else {
              if (((wl) this).field_C > 16) {
                break L1;
              } else {
                L2: {
                  if (((wl) this).field_Z != 0) {
                    break L2;
                  } else {
                    pc discarded$8 = fc.a((byte) -110, 81, -1);
                    break L2;
                  }
                }
                L3: {
                  if (0 != (61 & ((wl) this).field_Z)) {
                    break L3;
                  } else {
                    pc discarded$9 = fc.a((byte) 37, 2, ((wl) this).field_U);
                    break L3;
                  }
                }
                L4: {
                  ((wl) this).field_Z = ((wl) this).field_Z + 1;
                  var2 = 5100;
                  if (((wl) this).field_eb == 1) {
                    ((wl) this).field_U = (((wl) this).field_B.field_ab.a(9) - -(2 * var2)) * ((wl) this).field_Z / 500 - var2 << 4;
                    break L4;
                  } else {
                    ((wl) this).field_U = -var2 + (2 * var2 + ((wl) this).field_B.field_ab.a(99)) * (500 + -((wl) this).field_Z) / 500 << 4;
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    ((wl) this).field_A = -(30000 * Math.abs(-250 + ((wl) this).field_Z) / 250) + -150000;
                    if (((wl) this).field_C == 13) {
                      break L6;
                    } else {
                      if (((wl) this).field_C == 15) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((wl) this).field_Z = ((wl) this).field_Z + 1;
                  ((wl) this).field_A = -(30000 * ((wl) this).field_Z / 500) + -100000;
                  break L5;
                }
                L7: {
                  if (((wl) this).field_C == 16) {
                    L8: {
                      ((wl) this).field_A = 400 * (((wl) this).field_Z * ((wl) this).field_Z * 1800 / 250000) + -180000;
                      if (((wl) this).field_Z != 180) {
                        break L8;
                      } else {
                        ((wl) this).field_B.field_b = 1;
                        ((wl) this).field_B.field_R = 1550;
                        pc discarded$10 = fc.a((byte) 104, 60, -1);
                        break L8;
                      }
                    }
                    if (((wl) this).field_Z <= 250) {
                      if (((wl) this).field_Z != 250) {
                        break L7;
                      } else {
                        L9: {
                          var3_int = ((wl) this).field_U;
                          var4 = ((wl) this).field_A;
                          if ((((wl) this).field_Z & 31) == 5) {
                            ((wl) this).a(50, 2000, 0, -99, 20);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          ((wl) this).field_A = ((wl) this).field_A - 10000;
                          ((wl) this).field_U = ((wl) this).field_U - 25000;
                          if ((((wl) this).field_Z & 31) == 0) {
                            ((wl) this).a(50, 2000, 0, param0 + -111, 20);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          ((wl) this).field_U = ((wl) this).field_U + 50000;
                          ((wl) this).field_A = ((wl) this).field_A + 30000;
                          if ((31 & ((wl) this).field_Z) == 10) {
                            ((wl) this).a(50, 2000, 0, -102, 20);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ((wl) this).field_A = var4;
                        ((wl) this).field_U = var3_int;
                        pc discarded$11 = fc.a((byte) 80, 104, -1);
                        break L7;
                      }
                    } else {
                      ((wl) this).field_B.field_J.a((byte) 82, (kd) this);
                      var3 = (Object) (Object) (mb) (Object) ((wl) this).field_B.field_K.e(13058);
                      L12: while (true) {
                        if (var3 == null) {
                          break L7;
                        } else {
                          L13: {
                            if (0 < ((mb) var3).field_rb) {
                              L14: {
                                ((mb) var3).field_ab = -3000;
                                stackOut_41_0 = var3;
                                stackIn_43_0 = stackOut_41_0;
                                stackIn_42_0 = stackOut_41_0;
                                if (~((mb) var3).field_hc >= ~((wl) this).field_U) {
                                  stackOut_43_0 = stackIn_43_0;
                                  stackOut_43_1 = -3000;
                                  stackIn_44_0 = stackOut_43_0;
                                  stackIn_44_1 = stackOut_43_1;
                                  break L14;
                                } else {
                                  stackOut_42_0 = stackIn_42_0;
                                  stackOut_42_1 = 3000;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  break L14;
                                }
                              }
                              ((mb) (Object) stackIn_44_0).field_K = stackIn_44_1;
                              ((mb) var3).f(128);
                              ((mb) var3).field_pc = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          var3 = (Object) (Object) (mb) (Object) ((wl) this).field_B.field_K.a((byte) -96);
                          continue L12;
                        }
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var3 = (Object) (Object) (mb) (Object) ((wl) this).field_B.field_K.e(13058);
                L15: while (true) {
                  if (var3 == null) {
                    L16: {
                      if (!((wl) this).field_B.field_h) {
                        var3 = (Object) (Object) nk.a(1, 0, ((wl) this).field_B, 116, ((wl) this).field_A - -29000, false, 50, 100, ((wl) this).field_U - -(9000 * ((wl) this).field_eb), ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(param0 ^ -4, (ck) var3);
                        var3 = (Object) (Object) nk.a(1, 0, ((wl) this).field_B, 101, ((wl) this).field_A - -32000, false, 50, 100, ((wl) this).field_U + 15000 * ((wl) this).field_eb, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) var3);
                        var3 = (Object) (Object) nk.a(1, 0, ((wl) this).field_B, param0 + 112, ((wl) this).field_A - -35000, false, 50, 100, ((wl) this).field_U + 21000 * ((wl) this).field_eb, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) var3);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      if (12 != ((wl) this).field_C) {
                        L18: {
                          if (13 == ((wl) this).field_C) {
                            break L18;
                          } else {
                            if (((wl) this).field_C == 15) {
                              break L18;
                            } else {
                              if (((wl) this).field_C == 14) {
                                if ((7 & ((wl) this).field_Z) != 0) {
                                  break L17;
                                } else {
                                  if (((wl) this).field_Z <= 250) {
                                    break L17;
                                  } else {
                                    var10 = new wl(-(((wl) this).field_eb * 48000) + ((wl) this).field_U, ((wl) this).field_A + 8000, ((wl) this).field_eb * -50, 25, 1, 1, 3, ((wl) this).field_B, (mb) null, 50, 0, 6);
                                    var10.field_ab = true;
                                    ((wl) this).field_B.field_T.a(3, (ck) (Object) var10);
                                    pc discarded$12 = fc.a((byte) 27, 14, ((wl) this).field_U);
                                    var10.field_nb = null;
                                    var4_ref_mb = (mb) (Object) ((wl) this).field_B.field_K.e(param0 ^ -13059);
                                    L19: while (true) {
                                      if (var4_ref_mb == null) {
                                        var10.field_nb = null;
                                        break L17;
                                      } else {
                                        L20: {
                                          if (var4_ref_mb.field_rb <= 0) {
                                            break L20;
                                          } else {
                                            if (var4_ref_mb.field_pc) {
                                              break L20;
                                            } else {
                                              if (var4_ref_mb.field_Lb) {
                                                L21: {
                                                  if (var10.field_nb == null) {
                                                    break L21;
                                                  } else {
                                                    if (~Math.abs(var4_ref_mb.field_hc + -var10.field_U) > ~Math.abs(var10.field_nb.field_hc + -var10.field_U)) {
                                                      break L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                var10.field_nb = var4_ref_mb;
                                                var10.field_K = var10.field_nb.field_hc;
                                                var10.field_S = var10.field_nb.field_Gb;
                                                break L20;
                                              } else {
                                                var4_ref_mb = (mb) (Object) ((wl) this).field_B.field_K.a((byte) -74);
                                                continue L19;
                                              }
                                            }
                                          }
                                        }
                                        var4_ref_mb = (mb) (Object) ((wl) this).field_B.field_K.a((byte) -74);
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        var3 = (Object) (Object) new wl(-(((wl) this).field_eb * 30000) + ((wl) this).field_U, ((wl) this).field_A + 29000, 300 * ((wl) this).field_eb, 200, 50, 1, 4, ((wl) this).field_B, (mb) null, 10, 0, 17);
                        ((wl) var3).field_ab = true;
                        ((wl) this).field_B.field_T.a(3, (ck) var3);
                        if (((wl) this).field_Z % 50 != 0) {
                          break L17;
                        } else {
                          pc discarded$13 = fc.a((byte) 110, 67, ((wl) this).field_U);
                          break L17;
                        }
                      } else {
                        if (0 != (31 & ((wl) this).field_Z)) {
                          break L17;
                        } else {
                          if (((wl) this).field_Z <= 250) {
                            break L17;
                          } else {
                            var3 = (Object) (Object) new wl(-(((wl) this).field_eb * 24000) + ((wl) this).field_U, 23000 + ((wl) this).field_A, ((wl) this).field_eb * -50, 50, 1, 1, 6, ((wl) this).field_B, (mb) null, 500, 0, 31);
                            ((wl) var3).field_ab = true;
                            ((wl) this).field_B.field_T.a(3, (ck) var3);
                            pc discarded$14 = fc.a((byte) -117, 62, ((wl) this).field_U);
                            break L17;
                          }
                        }
                      }
                    }
                    L22: {
                      if (((wl) this).field_Z >= 500) {
                        ((wl) this).field_eb = -((wl) this).field_eb;
                        ((wl) this).field_Z = -500;
                        if (((wl) this).field_C == 12) {
                          ((wl) this).field_C = 13;
                          break L22;
                        } else {
                          if (((wl) this).field_C != 14) {
                            if (13 == ((wl) this).field_C) {
                              ((wl) this).field_B.field_J.a((byte) 79, (kd) this);
                              break L22;
                            } else {
                              if (((wl) this).field_C != 16) {
                                break L22;
                              } else {
                                ((wl) this).field_B.field_J.a((byte) 89, (kd) this);
                                break L22;
                              }
                            }
                          } else {
                            ((wl) this).field_C = 13;
                            return;
                          }
                        }
                      } else {
                        break L22;
                      }
                    }
                    return;
                  } else {
                    L23: {
                      if (((mb) var3).field_rb <= 0) {
                        break L23;
                      } else {
                        if (((mb) var3).field_pc) {
                          break L23;
                        } else {
                          if (!((mb) var3).field_Lb) {
                            break L23;
                          } else {
                            if (((mb) var3).field_Gb >= 25000 + ((wl) this).field_A) {
                              break L23;
                            } else {
                              if (Math.abs(-((wl) this).field_U + ((mb) var3).field_hc) < 65000) {
                                ((mb) var3).field_dc = true;
                                ((mb) var3).f(128);
                                ((mb) var3).field_K = ((wl) this).field_eb * 3000;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = (Object) (Object) (mb) (Object) ((wl) this).field_B.field_K.a((byte) -101);
                    continue L15;
                  }
                }
              }
            }
          }
          L24: {
            if (((wl) this).field_C != 17) {
              if (((wl) this).field_C != 11) {
                var2 = 0;
                L25: while (true) {
                  L26: {
                    if (((wl) this).field_L < var2) {
                      break L26;
                    } else {
                      L27: {
                        L28: {
                          ((wl) this).field_U = ((wl) this).field_U + ((wl) this).field_eb;
                          ((wl) this).field_A = ((wl) this).field_A + ((wl) this).field_F;
                          if (((wl) this).field_C == 4) {
                            break L28;
                          } else {
                            if (5 == ((wl) this).field_C) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        if (((wl) this).field_A >= -180000) {
                          break L27;
                        } else {
                          ((wl) this).field_T = true;
                          break L27;
                        }
                      }
                      L29: {
                        if (((wl) this).field_C != 4) {
                          if (((wl) this).field_C != 2) {
                            if (((wl) this).field_C != 7) {
                              if (((wl) this).field_C == 0) {
                                if (this.c(param0 ^ -3, var2)) {
                                  return;
                                } else {
                                  break L29;
                                }
                              } else {
                                L30: {
                                  if (((wl) this).field_C == 1) {
                                    break L30;
                                  } else {
                                    if (((wl) this).field_C != 20) {
                                      if (8 == ((wl) this).field_C) {
                                        if (this.b(var2, (byte) -114)) {
                                          return;
                                        } else {
                                          break L29;
                                        }
                                      } else {
                                        if (5 == ((wl) this).field_C) {
                                          if (!this.b(param0 ^ -9, var2)) {
                                            break L29;
                                          } else {
                                            return;
                                          }
                                        } else {
                                          if (((wl) this).field_C == 6) {
                                            if (!this.e(var2, param0 + 30)) {
                                              break L29;
                                            } else {
                                              return;
                                            }
                                          } else {
                                            if (3 == ((wl) this).field_C) {
                                              if (!this.a((byte) -102, var2)) {
                                                break L29;
                                              } else {
                                                return;
                                              }
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                if (!this.f(var2, -29)) {
                                  break L29;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              if (this.a(var2, (byte) -95)) {
                                return;
                              } else {
                                break L29;
                              }
                            }
                          } else {
                            if (!this.d(var2, 50)) {
                              break L29;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (!this.g(97, var2)) {
                            break L29;
                          } else {
                            return;
                          }
                        }
                      }
                      L31: {
                        if (((wl) this).field_fb == null) {
                          break L31;
                        } else {
                          this.a(param0 + 92, var2);
                          break L31;
                        }
                      }
                      L32: {
                        if (((wl) this).field_T) {
                          break L32;
                        } else {
                          L33: {
                            if (!((wl) this).field_B.b(((wl) this).field_U, param0 + -4)) {
                              break L33;
                            } else {
                              if (~((wl) this).field_B.field_ab.a(false, ((wl) this).field_U >> 4) >= ~-(((wl) this).field_A >> 4)) {
                                break L33;
                              } else {
                                if (((wl) this).field_B.field_ab.b((byte) 121, ((wl) this).field_U >> 4) < -(((wl) this).field_A >> 4)) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                          }
                          if (~((wl) this).field_B.field_ab.a((byte) -107, ((wl) this).field_U >> 4) < ~-(((wl) this).field_A >> 4)) {
                            break L32;
                          } else {
                            L34: {
                              if (!((wl) this).field_T) {
                                break L34;
                              } else {
                                if (!((wl) this).field_I) {
                                  break L34;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if (((wl) this).field_T) {
                              ((wl) this).field_L = var2;
                              if (null == ((wl) this).field_X) {
                                break L26;
                              } else {
                                if (((wl) this).field_C != 2) {
                                  break L26;
                                } else {
                                  if (((wl) this).field_gb) {
                                    break L26;
                                  } else {
                                    ((wl) this).field_X.field_p = 0;
                                    break L26;
                                  }
                                }
                              }
                            } else {
                              var2++;
                              continue L25;
                            }
                          }
                        }
                      }
                      L35: {
                        if (((wl) this).field_X == null) {
                          break L35;
                        } else {
                          if (((wl) this).field_V) {
                            break L35;
                          } else {
                            if (((wl) this).field_T) {
                              break L35;
                            } else {
                              if (~((wl) this).field_jb < ~((wl) this).field_Z) {
                                break L35;
                              } else {
                                L36: {
                                  if (((wl) this).field_nb == null) {
                                    break L36;
                                  } else {
                                    if (3 == ((wl) this).field_C) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                ((wl) this).field_X.field_q = -200;
                                ((wl) this).field_X.field_sb = ((wl) this).field_X.field_sb + 1;
                                break L35;
                              }
                            }
                          }
                        }
                      }
                      L37: {
                        if (0 == ((wl) this).field_C) {
                          L38: {
                            if (((wl) this).field_y != 1) {
                              if (12 == ((wl) this).field_y) {
                                this.a(64, 3, 1, false, 20, (byte) -103);
                                break L38;
                              } else {
                                if (((wl) this).field_y != 26) {
                                  break L38;
                                } else {
                                  this.a(96, 6, 1, false, 30, (byte) -118);
                                  break L38;
                                }
                              }
                            } else {
                              this.a(64, 1, 1, false, 10, (byte) -116);
                              break L38;
                            }
                          }
                          if (!((wl) this).field_I) {
                            ((wl) this).field_B.field_J.a((byte) 36, (kd) this);
                            break L37;
                          } else {
                            ((wl) this).field_T = true;
                            break L37;
                          }
                        } else {
                          if (((wl) this).field_C != 7) {
                            if (((wl) this).field_C != 4) {
                              L39: {
                                if (1 == ((wl) this).field_C) {
                                  break L39;
                                } else {
                                  if (((wl) this).field_C != 20) {
                                    if (((wl) this).field_C == 8) {
                                      L40: {
                                        if (2 == ((wl) this).field_y) {
                                          ((wl) this).a(5, 256, 4, -108, 50);
                                          break L40;
                                        } else {
                                          if (((wl) this).field_y != 19) {
                                            break L40;
                                          } else {
                                            ((wl) this).a(15, 500, 0, -126, 25);
                                            break L40;
                                          }
                                        }
                                      }
                                      if (!((wl) this).field_I) {
                                        ((wl) this).field_B.field_J.a((byte) 83, (kd) this);
                                        break L37;
                                      } else {
                                        ((wl) this).field_T = true;
                                        break L37;
                                      }
                                    } else {
                                      if (((wl) this).field_C == 6) {
                                        L41: {
                                          if (((wl) this).field_y != 5) {
                                            if (18 == ((wl) this).field_y) {
                                              ((wl) this).a(200, 750, 3, -112, 75);
                                              break L41;
                                            } else {
                                              if (((wl) this).field_y != 31) {
                                                break L41;
                                              } else {
                                                ((wl) this).a(500, 1000, 3, -98, 100);
                                                break L41;
                                              }
                                            }
                                          } else {
                                            ((wl) this).a(25, 500, 3, param0 + -111, 50);
                                            break L41;
                                          }
                                        }
                                        if (!((wl) this).field_I) {
                                          ((wl) this).field_B.field_J.a((byte) 66, (kd) this);
                                          break L37;
                                        } else {
                                          ((wl) this).field_T = true;
                                          break L37;
                                        }
                                      } else {
                                        if (((wl) this).field_C == 2) {
                                          L42: {
                                            if (9 != ((wl) this).field_y) {
                                              if (((wl) this).field_y != 7) {
                                                if (8 != ((wl) this).field_y) {
                                                  if (((wl) this).field_y == 20) {
                                                    ((wl) this).a(200, 1500, 0, param0 + -108, 150);
                                                    break L42;
                                                  } else {
                                                    if (((wl) this).field_y == 33) {
                                                      ((wl) this).a(400, 2500, 0, param0 + -119, 200);
                                                      break L42;
                                                    } else {
                                                      if (((wl) this).field_y != 19) {
                                                        if (((wl) this).field_y == 32) {
                                                          L43: {
                                                            if (((wl) this).field_I) {
                                                              break L43;
                                                            } else {
                                                              if (((wl) this).field_V) {
                                                                break L43;
                                                              } else {
                                                                pc discarded$15 = fc.a((byte) 45, 104, ((wl) this).field_U);
                                                                break L43;
                                                              }
                                                            }
                                                          }
                                                          ((wl) this).a(250, 1500, 0, -96, 50);
                                                          ((wl) this).a(5000, 5000, 2, -95, 500);
                                                          ((wl) this).a(5000, 2500, 3, param0 ^ 117, 500);
                                                          if (((wl) this).field_B.field_b != 0) {
                                                            break L42;
                                                          } else {
                                                            if (((wl) this).field_V) {
                                                              break L42;
                                                            } else {
                                                              ((wl) this).field_B.field_b = 1;
                                                              break L42;
                                                            }
                                                          }
                                                        } else {
                                                          break L42;
                                                        }
                                                      } else {
                                                        ((wl) this).a(10, 256, 0, -103, 10);
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ((wl) this).a(50, 1000, 8, -103, 25);
                                                  break L42;
                                                }
                                              } else {
                                                ((wl) this).a(25, 1000, 0, -100, 50);
                                                break L42;
                                              }
                                            } else {
                                              ((wl) this).field_W = true;
                                              ((wl) this).a(500, 1000, 2, -122, 1500);
                                              break L42;
                                            }
                                          }
                                          if (((wl) this).field_I) {
                                            ((wl) this).field_T = true;
                                            break L37;
                                          } else {
                                            ((wl) this).field_B.field_J.a((byte) 80, (kd) this);
                                            break L37;
                                          }
                                        } else {
                                          if (3 != ((wl) this).field_C) {
                                            if (5 != ((wl) this).field_C) {
                                              if (((wl) this).field_I) {
                                                ((wl) this).field_T = true;
                                                break L37;
                                              } else {
                                                ((wl) this).field_B.field_J.a((byte) 75, (kd) this);
                                                break L37;
                                              }
                                            } else {
                                              L44: {
                                                if (((wl) this).field_y == 3) {
                                                  this.a(50, 2, 0, false, 5, (byte) -121);
                                                  break L44;
                                                } else {
                                                  if (((wl) this).field_y == 16) {
                                                    this.a(100, 4, 0, false, 5, (byte) -114);
                                                    break L44;
                                                  } else {
                                                    if (((wl) this).field_y == 29) {
                                                      this.a(150, 8, 0, false, 5, (byte) -98);
                                                      break L44;
                                                    } else {
                                                      break L44;
                                                    }
                                                  }
                                                }
                                              }
                                              if (!((wl) this).field_I) {
                                                ((wl) this).field_B.field_J.a((byte) 115, (kd) this);
                                                break L37;
                                              } else {
                                                ((wl) this).field_T = true;
                                                break L37;
                                              }
                                            }
                                          } else {
                                            L45: {
                                              if (((wl) this).field_y == 6) {
                                                ((wl) this).a(25, 300, 0, -115, 25);
                                                break L45;
                                              } else {
                                                if (34 != ((wl) this).field_y) {
                                                  break L45;
                                                } else {
                                                  ((wl) this).a(200, 500, 0, param0 ^ 97, 75);
                                                  break L45;
                                                }
                                              }
                                            }
                                            if (((wl) this).field_I) {
                                              ((wl) this).field_T = true;
                                              break L37;
                                            } else {
                                              ((wl) this).field_B.field_J.a((byte) 76, (kd) this);
                                              break L37;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L46: {
                                if (((wl) this).field_y != 2) {
                                  if (((wl) this).field_y != 13) {
                                    if (((wl) this).field_y != 15) {
                                      if (14 != ((wl) this).field_y) {
                                        if (((wl) this).field_y != 28) {
                                          if (27 != ((wl) this).field_y) {
                                            break L46;
                                          } else {
                                            ((wl) this).a(20, 512, 0, param0 ^ 100, 50);
                                            break L46;
                                          }
                                        } else {
                                          if (((wl) this).field_Z < 20) {
                                            ((wl) this).field_O = ((wl) this).field_O / 2;
                                            ((wl) this).a(10, 100, 0, -107, 50);
                                            break L46;
                                          } else {
                                            ((wl) this).a(40, 1500, 0, param0 + -118, 50);
                                            break L46;
                                          }
                                        }
                                      } else {
                                        if (((wl) this).field_Z < 20) {
                                          ((wl) this).field_O = ((wl) this).field_O / 2;
                                          ((wl) this).a(10, 32, 0, -110, 25);
                                          break L46;
                                        } else {
                                          ((wl) this).a(20, 750, 0, -124, 25);
                                          break L46;
                                        }
                                      }
                                    } else {
                                      L47: {
                                        if (((wl) this).field_Z < ((wl) this).field_jb) {
                                          break L47;
                                        } else {
                                          if (null == ((wl) this).field_X) {
                                            break L47;
                                          } else {
                                            if (((wl) this).field_E) {
                                              this.a(32, 5, 0, false, 25, (byte) -126);
                                              break L46;
                                            } else {
                                              break L47;
                                            }
                                          }
                                        }
                                      }
                                      this.a(32, 5, 0, false, 25, (byte) -107);
                                      break L46;
                                    }
                                  } else {
                                    ((wl) this).a(10, 32, 0, -101, 50);
                                    break L46;
                                  }
                                } else {
                                  ((wl) this).a(1, 32, 1, param0 + -101, 5);
                                  break L46;
                                }
                              }
                              if (!((wl) this).field_I) {
                                ((wl) this).field_B.field_J.a((byte) 92, (kd) this);
                                break L37;
                              } else {
                                ((wl) this).field_T = true;
                                break L37;
                              }
                            } else {
                              L48: {
                                if (((wl) this).field_y != 10) {
                                  if (((wl) this).field_y == 21) {
                                    this.a(1500, 3, 2, false, 20, (byte) -105);
                                    break L48;
                                  } else {
                                    if (!((wl) this).field_T) {
                                      L49: {
                                        if (((wl) this).field_B.field_h) {
                                          break L49;
                                        } else {
                                          if (!((wl) this).field_V) {
                                            var3 = (Object) (Object) nk.a(2, 0, ((wl) this).field_B, 114, -(((wl) this).field_B.field_ab.a((byte) -109, ((wl) this).field_U >> 4) << 4) + -8, ((wl) this).field_ob, 250, 0, ((wl) this).field_U, ((wl) this).field_U);
                                            ((wl) this).field_B.field_O.a(param0 ^ -4, (ck) var3);
                                            break L49;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                      if (((wl) this).field_B.field_h) {
                                        break L48;
                                      } else {
                                        if (((wl) this).field_V) {
                                          break L48;
                                        } else {
                                          L50: {
                                            stackOut_303_0 = 13;
                                            stackOut_303_1 = -((wl) this).field_eb / 2;
                                            stackOut_303_2 = ((wl) this).field_B;
                                            stackOut_303_3 = param0 ^ -112;
                                            stackOut_303_4 = ((wl) this).field_A;
                                            stackOut_303_5 = ((wl) this).field_ob;
                                            stackIn_305_0 = stackOut_303_0;
                                            stackIn_305_1 = stackOut_303_1;
                                            stackIn_305_2 = stackOut_303_2;
                                            stackIn_305_3 = stackOut_303_3;
                                            stackIn_305_4 = stackOut_303_4;
                                            stackIn_305_5 = stackOut_303_5;
                                            stackIn_304_0 = stackOut_303_0;
                                            stackIn_304_1 = stackOut_303_1;
                                            stackIn_304_2 = stackOut_303_2;
                                            stackIn_304_3 = stackOut_303_3;
                                            stackIn_304_4 = stackOut_303_4;
                                            stackIn_304_5 = stackOut_303_5;
                                            if (((wl) this).field_y == 17) {
                                              stackOut_305_0 = stackIn_305_0;
                                              stackOut_305_1 = stackIn_305_1;
                                              stackOut_305_2 = (ee) (Object) stackIn_305_2;
                                              stackOut_305_3 = stackIn_305_3;
                                              stackOut_305_4 = stackIn_305_4;
                                              stackOut_305_5 = stackIn_305_5;
                                              stackOut_305_6 = 100;
                                              stackIn_306_0 = stackOut_305_0;
                                              stackIn_306_1 = stackOut_305_1;
                                              stackIn_306_2 = stackOut_305_2;
                                              stackIn_306_3 = stackOut_305_3;
                                              stackIn_306_4 = stackOut_305_4;
                                              stackIn_306_5 = stackOut_305_5;
                                              stackIn_306_6 = stackOut_305_6;
                                              break L50;
                                            } else {
                                              stackOut_304_0 = stackIn_304_0;
                                              stackOut_304_1 = stackIn_304_1;
                                              stackOut_304_2 = (ee) (Object) stackIn_304_2;
                                              stackOut_304_3 = stackIn_304_3;
                                              stackOut_304_4 = stackIn_304_4;
                                              stackOut_304_5 = stackIn_304_5;
                                              stackOut_304_6 = 20;
                                              stackIn_306_0 = stackOut_304_0;
                                              stackIn_306_1 = stackOut_304_1;
                                              stackIn_306_2 = stackOut_304_2;
                                              stackIn_306_3 = stackOut_304_3;
                                              stackIn_306_4 = stackOut_304_4;
                                              stackIn_306_5 = stackOut_304_5;
                                              stackIn_306_6 = stackOut_304_6;
                                              break L50;
                                            }
                                          }
                                          var3 = (Object) (Object) nk.a(stackIn_306_0, stackIn_306_1, stackIn_306_2, stackIn_306_3, stackIn_306_4, stackIn_306_5, stackIn_306_6, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                                          ((wl) this).field_B.field_O.a(3, (ck) var3);
                                          break L48;
                                        }
                                      }
                                    } else {
                                      this.a(32, 1, 1, false, 10, (byte) -98);
                                      if (((wl) this).field_B.field_h) {
                                        break L48;
                                      } else {
                                        if (((wl) this).field_V) {
                                          break L48;
                                        } else {
                                          L51: {
                                            stackOut_293_0 = 13;
                                            stackOut_293_1 = -((wl) this).field_eb / 2;
                                            stackOut_293_2 = ((wl) this).field_B;
                                            stackOut_293_3 = param0 + 121;
                                            stackOut_293_4 = ((wl) this).field_A;
                                            stackOut_293_5 = ((wl) this).field_ob;
                                            stackIn_295_0 = stackOut_293_0;
                                            stackIn_295_1 = stackOut_293_1;
                                            stackIn_295_2 = stackOut_293_2;
                                            stackIn_295_3 = stackOut_293_3;
                                            stackIn_295_4 = stackOut_293_4;
                                            stackIn_295_5 = stackOut_293_5;
                                            stackIn_294_0 = stackOut_293_0;
                                            stackIn_294_1 = stackOut_293_1;
                                            stackIn_294_2 = stackOut_293_2;
                                            stackIn_294_3 = stackOut_293_3;
                                            stackIn_294_4 = stackOut_293_4;
                                            stackIn_294_5 = stackOut_293_5;
                                            if (((wl) this).field_y == 17) {
                                              stackOut_295_0 = stackIn_295_0;
                                              stackOut_295_1 = stackIn_295_1;
                                              stackOut_295_2 = (ee) (Object) stackIn_295_2;
                                              stackOut_295_3 = stackIn_295_3;
                                              stackOut_295_4 = stackIn_295_4;
                                              stackOut_295_5 = stackIn_295_5;
                                              stackOut_295_6 = 100;
                                              stackIn_296_0 = stackOut_295_0;
                                              stackIn_296_1 = stackOut_295_1;
                                              stackIn_296_2 = stackOut_295_2;
                                              stackIn_296_3 = stackOut_295_3;
                                              stackIn_296_4 = stackOut_295_4;
                                              stackIn_296_5 = stackOut_295_5;
                                              stackIn_296_6 = stackOut_295_6;
                                              break L51;
                                            } else {
                                              stackOut_294_0 = stackIn_294_0;
                                              stackOut_294_1 = stackIn_294_1;
                                              stackOut_294_2 = (ee) (Object) stackIn_294_2;
                                              stackOut_294_3 = stackIn_294_3;
                                              stackOut_294_4 = stackIn_294_4;
                                              stackOut_294_5 = stackIn_294_5;
                                              stackOut_294_6 = 20;
                                              stackIn_296_0 = stackOut_294_0;
                                              stackIn_296_1 = stackOut_294_1;
                                              stackIn_296_2 = stackOut_294_2;
                                              stackIn_296_3 = stackOut_294_3;
                                              stackIn_296_4 = stackOut_294_4;
                                              stackIn_296_5 = stackOut_294_5;
                                              stackIn_296_6 = stackOut_294_6;
                                              break L51;
                                            }
                                          }
                                          var3 = (Object) (Object) nk.a(stackIn_296_0, stackIn_296_1, stackIn_296_2, stackIn_296_3, stackIn_296_4, stackIn_296_5, stackIn_296_6, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                                          ((wl) this).field_B.field_O.a(3, (ck) var3);
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  this.a(32, 1, 2, false, 10, (byte) -99);
                                  break L48;
                                }
                              }
                              if (!((wl) this).field_I) {
                                ((wl) this).field_B.field_J.a((byte) 100, (kd) this);
                                break L37;
                              } else {
                                ((wl) this).field_T = true;
                                break L37;
                              }
                            }
                          } else {
                            L52: {
                              if (((wl) this).field_y == 0) {
                                ((wl) this).a(2, 500, 2, param0 + -117, 100);
                                break L52;
                              } else {
                                if (11 != ((wl) this).field_y) {
                                  break L52;
                                } else {
                                  ((wl) this).a(10, 750, 2, -122, 500);
                                  break L52;
                                }
                              }
                            }
                            if (((wl) this).field_I) {
                              ((wl) this).field_T = true;
                              break L37;
                            } else {
                              ((wl) this).field_B.field_J.a((byte) 77, (kd) this);
                              break L24;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                  L53: {
                    if (!((wl) this).field_W) {
                      break L53;
                    } else {
                      if (((wl) this).field_V) {
                        break L53;
                      } else {
                        var12 = new jc(((wl) this).field_B.field_db);
                        var3 = (Object) (Object) (wl) (Object) var12.b(param0 ^ -3);
                        L54: while (true) {
                          if (var3 == null) {
                            break L53;
                          } else {
                            L55: {
                              L56: {
                                var4 = ((wl) var3).field_U + -((wl) var3).field_U;
                                var5 = ((wl) var3).field_A - ((wl) var3).field_A;
                                if (2 == ((wl) var3).field_C) {
                                  break L56;
                                } else {
                                  if (((wl) var3).field_C == 3) {
                                    break L56;
                                  } else {
                                    if (((wl) var3).field_C != 20) {
                                      break L55;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                              if (((wl) var3).field_y == 32) {
                                break L55;
                              } else {
                                if (Math.abs(var4) > 256) {
                                  break L55;
                                } else {
                                  if (Math.abs(var5) <= 256) {
                                    L57: {
                                      if (20 == ((wl) var3).field_C) {
                                        break L57;
                                      } else {
                                        ((wl) var3).field_T = true;
                                        break L57;
                                      }
                                    }
                                    L58: {
                                      if (((wl) var3).field_X == null) {
                                        break L58;
                                      } else {
                                        if (((wl) var3).field_X == ((wl) var3).field_X) {
                                          break L58;
                                        } else {
                                          ((wl) var3).field_X.field_ob = ((wl) var3).field_X.field_ob + 1;
                                          break L58;
                                        }
                                      }
                                    }
                                    L59: {
                                      ((wl) var3).field_X = ((wl) var3).field_X;
                                      if (((wl) var3).field_C != 7) {
                                        break L59;
                                      } else {
                                        ((wl) this).field_P = true;
                                        break L59;
                                      }
                                    }
                                    ((wl) var3).field_bb = true;
                                    break L55;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                            }
                            var3 = (Object) (Object) (wl) (Object) var12.d(param0 ^ -3);
                            continue L54;
                          }
                        }
                      }
                    }
                  }
                  L60: {
                    if (param0 <= ~((wl) var3).field_L) {
                      break L60;
                    } else {
                      ((wl) this).field_L = ((wl) this).field_L - 1;
                      break L60;
                    }
                  }
                  L61: {
                    if (!((wl) var3).field_H) {
                      break L61;
                    } else {
                      ((wl) this).field_F = ((wl) this).field_F + ((wl) var3).field_B.field_z;
                      if (((wl) var3).field_C != 4) {
                        break L61;
                      } else {
                        ((wl) this).field_F = ((wl) this).field_F + 3 * ((wl) var3).field_B.field_z;
                        break L61;
                      }
                    }
                  }
                  L62: {
                    L63: {
                      ((wl) this).field_Z = ((wl) this).field_Z + 1;
                      if (((wl) var3).field_U < -128) {
                        break L63;
                      } else {
                        if (((wl) var3).field_U > (((wl) var3).field_B.field_ab.a(param0 + -126) << 4) + 128) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    if (((wl) var3).field_I) {
                      ((wl) this).field_T = true;
                      break L62;
                    } else {
                      ((wl) var3).field_B.field_J.a((byte) 42, (kd) this);
                      break L62;
                    }
                  }
                  return;
                }
              } else {
                L64: {
                  if (((wl) this).field_B.field_h) {
                    break L64;
                  } else {
                    if (((wl) this).field_Z >= 125) {
                      break L64;
                    } else {
                      var2_double = Math.random() * 3.14;
                      var4 = (int)(1024.0 * Math.sin(var2_double));
                      var5 = (int)(1024.0 * Math.cos(var2_double));
                      var6 = -(((wl) this).field_Z / 4) + (50 + -(int)(Math.random() * (double)((wl) this).field_Z / 4.0));
                      var7 = nk.a(4, var4, ((wl) this).field_B, 100, -(var6 * var5) + ((wl) this).field_A, ((wl) this).field_ob, 50, var5, -(var4 * var6) + ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var7);
                      break L64;
                    }
                  }
                }
                L65: {
                  if (100 > ((wl) this).field_Z) {
                    break L65;
                  } else {
                    if (((wl) this).field_Z < 1000) {
                      L66: {
                        var2 = ((wl) this).field_U + (((wl) this).field_Z - 100) * (((wl) this).field_ib + -((wl) this).field_U) / 400;
                        if (80000 <= Math.abs(var2 + -((wl) this).field_ib)) {
                          break L66;
                        } else {
                          L67: {
                            L68: {
                              if (((wl) this).field_eb != 1) {
                                break L68;
                              } else {
                                if ((((wl) this).field_B.field_v & 1) == 0) {
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            if (((wl) this).field_eb != -1) {
                              break L66;
                            } else {
                              if ((((wl) this).field_B.field_v & 2) == 0) {
                                break L67;
                              } else {
                                break L66;
                              }
                            }
                          }
                          var11 = new ie(new int[1]);
                          var4 = 0;
                          L69: while (true) {
                            if (7 <= var4) {
                              L70: {
                                if (((wl) this).field_eb != 1) {
                                  break L70;
                                } else {
                                  ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 1;
                                  break L70;
                                }
                              }
                              L71: {
                                if (((wl) this).field_B.field_b != 0) {
                                  break L71;
                                } else {
                                  ((wl) this).field_B.field_b = 1;
                                  break L71;
                                }
                              }
                              ((wl) this).field_Z = 1000;
                              if (-1 == ((wl) this).field_eb) {
                                ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 2;
                                break L65;
                              } else {
                                break L65;
                              }
                            } else {
                              L72: {
                                var5_ref_wl = new wl(var2, ((wl) this).field_A - (40 * ((wl) this).field_Z + -4000), 0, 0, ((wl) this).field_hb, ((wl) this).field_L, 6, ((wl) this).field_B, ((wl) this).field_X, 500, ((wl) this).field_ib, 31);
                                var5_ref_wl.field_ab = ((wl) this).field_ab;
                                var5_ref_wl.field_V = ((wl) this).field_V;
                                var5_ref_wl.field_Z = 31;
                                if (((wl) this).field_V) {
                                  var5_ref_wl.field_fb = null;
                                  break L72;
                                } else {
                                  break L72;
                                }
                              }
                              var5_ref_wl.field_kb = ((wl) this).field_kb;
                              var5_ref_wl.field_eb = var5_ref_wl.field_eb + (jh.a(8192 * var4 / 7 - -((wl) this).field_B.field_r, param0 ^ -4097) * wc.a((byte) -61, var11, 16) >> 13);
                              var5_ref_wl.field_eb = Math.abs(var5_ref_wl.field_eb) * -((wl) this).field_eb;
                              var5_ref_wl.field_F = var5_ref_wl.field_F + (kg.a(var4 * 8192 / 7 + ((wl) this).field_B.field_r, (byte) -95) * wc.a((byte) -61, var11, 16) >> 13);
                              ((wl) this).field_B.field_db.a(3, (ck) (Object) var5_ref_wl);
                              var4++;
                              continue L69;
                            }
                          }
                        }
                      }
                      if (!((wl) this).field_B.field_h) {
                        var3 = (Object) (Object) nk.a(4, 0, ((wl) this).field_B, param0 ^ -99, -((((wl) this).field_Z + -100) * 40) + ((wl) this).field_A, ((wl) this).field_ob, 50, -500 + (((wl) this).field_B.field_r & 1) * 1000, var2, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) var3);
                        var3 = (Object) (Object) nk.a(1, 0, ((wl) this).field_B, 125, ((wl) this).field_A - (-100 + ((wl) this).field_Z) * 40, ((wl) this).field_ob, 100, 0, var2, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) var3);
                        break L65;
                      } else {
                        break L65;
                      }
                    } else {
                      break L65;
                    }
                  }
                }
                L73: {
                  ((wl) this).field_Z = ((wl) this).field_Z + 1;
                  if (((wl) this).field_Z != 500) {
                    break L73;
                  } else {
                    L74: {
                      L75: {
                        if (((wl) this).field_eb != 1) {
                          break L75;
                        } else {
                          if (0 == (((wl) this).field_B.field_v & 16)) {
                            break L74;
                          } else {
                            break L75;
                          }
                        }
                      }
                      if (((wl) this).field_eb != -1) {
                        break L73;
                      } else {
                        if ((32 & ((wl) this).field_B.field_v) != 0) {
                          break L73;
                        } else {
                          break L74;
                        }
                      }
                    }
                    L76: {
                      ((wl) this).field_A = ((wl) this).field_A - 16000;
                      ((wl) this).field_U = ((wl) this).field_ib;
                      ((wl) this).a(1000, 5000, 0, -102, 200);
                      if (((wl) this).field_eb != 1) {
                        if (((wl) this).field_eb == -1) {
                          L77: {
                            if (0 != (((wl) this).field_B.field_v & 8)) {
                              ((wl) this).field_U = ((wl) this).field_U + 25000;
                              ((wl) this).field_A = ((wl) this).field_A + 10000;
                              ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 32;
                              ((wl) this).a(2000, 5000, 0, -127, 400);
                              ((wl) this).field_U = ((wl) this).field_U - 50000;
                              ((wl) this).field_A = ((wl) this).field_A - 30000;
                              ((wl) this).a(2000, 5000, 0, param0 ^ 126, 500);
                              ((wl) this).field_B.g(-124, 1);
                              break L77;
                            } else {
                              break L77;
                            }
                          }
                          L78: {
                            if ((2 & ((wl) this).field_B.field_v) != 0) {
                              ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 8;
                              break L78;
                            } else {
                              break L78;
                            }
                          }
                          ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 2;
                          break L76;
                        } else {
                          break L76;
                        }
                      } else {
                        L79: {
                          if ((((wl) this).field_B.field_v & 4) != 0) {
                            ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 16;
                            ((wl) this).field_U = ((wl) this).field_U - 25000;
                            ((wl) this).field_A = ((wl) this).field_A + 10000;
                            ((wl) this).a(2000, 5000, 0, param0 ^ 117, 400);
                            ((wl) this).field_A = ((wl) this).field_A - 30000;
                            ((wl) this).field_U = ((wl) this).field_U + 50000;
                            ((wl) this).a(2000, 5000, 0, -100, 500);
                            ((wl) this).field_B.g(param0 + -116, 0);
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if ((1 & ((wl) this).field_B.field_v) != 0) {
                            ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 4;
                            break L80;
                          } else {
                            break L80;
                          }
                        }
                        ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 1;
                        break L76;
                      }
                    }
                    ((wl) this).field_Z = 1000;
                    break L73;
                  }
                }
                L81: {
                  if (((wl) this).field_Z >= 1000) {
                    L82: {
                      if (null != ((wl) this).field_X) {
                        L83: {
                          ((wl) this).field_X.field_vb = ((wl) this).field_X.field_vb + 10000;
                          ((wl) this).field_X.field_Ab = ((wl) this).field_X.field_Ab + 10000;
                          ((wl) this).field_X.field_Fc = 50;
                          if (-1 == ((wl) this).field_B.field_g) {
                            ((wl) this).field_B.field_g = ((wl) this).field_X.field_Bb;
                            break L83;
                          } else {
                            break L83;
                          }
                        }
                        ((wl) this).field_X.field_qc = ((wl) this).field_X.field_qc + 1;
                        break L82;
                      } else {
                        break L82;
                      }
                    }
                    ((wl) this).field_B.field_J.a((byte) 124, (kd) this);
                    break L81;
                  } else {
                    break L81;
                  }
                }
                return;
              }
            } else {
              if (((wl) this).field_nb != null) {
                L84: {
                  L85: {
                    if (((wl) this).field_nb.field_rb <= 0) {
                      break L85;
                    } else {
                      if (((wl) this).field_nb.field_Hb) {
                        break L85;
                      } else {
                        break L84;
                      }
                    }
                  }
                  ((wl) this).field_B.field_J.a((byte) 40, (kd) this);
                  break L84;
                }
                L86: {
                  if (((wl) this).field_B.field_h) {
                    break L86;
                  } else {
                    if (((wl) this).field_Z < 125) {
                      var2_double = Math.random() * 3.14;
                      var4 = (int)(Math.sin(var2_double) * 1024.0);
                      var5 = (int)(1024.0 * Math.cos(var2_double));
                      var6 = -(((wl) this).field_Z / 4) + 50 + -(int)(Math.random() * (double)((wl) this).field_Z / 4.0);
                      var7 = nk.a(4, var4, ((wl) this).field_B, param0 ^ -119, -(var5 * var6) + ((wl) this).field_A, ((wl) this).field_ob, 50, var5, -(var4 * var6) + ((wl) this).field_U, ((wl) this).field_U);
                      ((wl) this).field_B.field_O.a(3, (ck) (Object) var7);
                      break L86;
                    } else {
                      break L86;
                    }
                  }
                }
                L87: {
                  if (((wl) this).field_Z < 100) {
                    break L87;
                  } else {
                    if (((wl) this).field_Z >= 1000) {
                      break L87;
                    } else {
                      ((wl) this).field_U = ((wl) this).field_U + ((wl) this).field_eb * 1000;
                      var2 = (-100 + ((wl) this).field_Z) * (((wl) this).field_nb.field_hc + -((wl) this).field_U) / 900 - -((wl) this).field_U;
                      var3_int = (-100 + ((wl) this).field_Z) * (-((wl) this).field_A + ((wl) this).field_nb.field_Gb) / 900 + ((wl) this).field_A;
                      if (((wl) this).field_B.field_h) {
                        break L87;
                      } else {
                        var4_ref_qb = nk.a(4, 0, ((wl) this).field_B, 125, var3_int, ((wl) this).field_ob, 50, 1000 * (1 & ((wl) this).field_B.field_r) + -500, var2, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(param0 + 4, (ck) (Object) var4_ref_qb);
                        var4_ref_qb = nk.a(1, 0, ((wl) this).field_B, 125, var3_int, ((wl) this).field_ob, 100, 0, var2, ((wl) this).field_U);
                        ((wl) this).field_B.field_O.a(3, (ck) (Object) var4_ref_qb);
                        break L87;
                      }
                    }
                  }
                }
                ((wl) this).field_Z = ((wl) this).field_Z + 1;
                if (((wl) this).field_Z < 1000) {
                  break L24;
                } else {
                  ((wl) this).field_U = ((wl) this).field_nb.field_hc;
                  ((wl) this).field_A = ((wl) this).field_nb.field_Gb;
                  ((wl) this).a(1000, 5000, 0, param0 + -121, 200);
                  var2 = -1;
                  var3_int = 0;
                  L88: while (true) {
                    if (var3_int >= 2) {
                      L89: {
                        L90: {
                          if (((wl) this).field_eb != 1) {
                            break L90;
                          } else {
                            if (1 != var2) {
                              break L90;
                            } else {
                              L91: {
                                if ((((wl) this).field_B.field_v & 8) == 0) {
                                  break L91;
                                } else {
                                  ((wl) this).field_A = ((wl) this).field_A + 10000;
                                  ((wl) this).field_U = ((wl) this).field_U + 25000;
                                  ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 32;
                                  ((wl) this).a(2000, 5000, 0, -122, 400);
                                  ((wl) this).field_U = ((wl) this).field_U - 50000;
                                  ((wl) this).field_A = ((wl) this).field_A - 30000;
                                  ((wl) this).a(2000, 5000, 0, -104, 500);
                                  ((wl) this).field_B.g(-121, 1);
                                  break L91;
                                }
                              }
                              ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 8;
                              ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 2;
                              break L89;
                            }
                          }
                        }
                        if (((wl) this).field_eb != -1) {
                          break L89;
                        } else {
                          if (var2 == 0) {
                            L92: {
                              if (0 == (4 & ((wl) this).field_B.field_v)) {
                                break L92;
                              } else {
                                ((wl) this).field_U = ((wl) this).field_U - 25000;
                                ((wl) this).field_A = ((wl) this).field_A + 10000;
                                ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 16;
                                ((wl) this).a(2000, 5000, 0, -128, 400);
                                ((wl) this).field_U = ((wl) this).field_U + 50000;
                                ((wl) this).field_A = ((wl) this).field_A - 30000;
                                ((wl) this).a(2000, 5000, 0, param0 ^ 95, 500);
                                ((wl) this).field_B.g(-116, 0);
                                break L92;
                              }
                            }
                            ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 4;
                            ((wl) this).field_B.field_v = ((wl) this).field_B.field_v | 1;
                            break L89;
                          } else {
                            break L89;
                          }
                        }
                      }
                      ((wl) this).field_B.field_J.a((byte) 125, (kd) this);
                      return;
                    } else {
                      L93: {
                        var4 = ((wl) this).field_B.field_ab.field_o[var3_int];
                        var5 = -1080;
                        var6 = 4800;
                        var7_int = (((wl) this).field_U >> 4) - var4;
                        var8 = (((wl) this).field_A >> 4) - var5;
                        if (var6 * var6 <= var7_int * var7_int - -(var8 * var8)) {
                          break L93;
                        } else {
                          var2 = var3_int;
                          break L93;
                        }
                      }
                      var3_int++;
                      continue L88;
                    }
                  }
                }
              } else {
                var2_ref_mb = (mb) (Object) ((wl) this).field_B.field_K.e(13058);
                L94: while (true) {
                  if (var2_ref_mb == null) {
                    L95: {
                      if (((wl) this).field_nb != null) {
                        break L95;
                      } else {
                        ((wl) this).field_B.field_J.a((byte) 97, (kd) this);
                        break L95;
                      }
                    }
                    return;
                  } else {
                    L96: {
                      if (var2_ref_mb.field_rb <= 0) {
                        break L96;
                      } else {
                        if (var2_ref_mb.field_pc) {
                          break L96;
                        } else {
                          L97: {
                            L98: {
                              if (var2_ref_mb.field_jc != 1) {
                                break L98;
                              } else {
                                if (-1 == ((wl) this).field_eb) {
                                  break L97;
                                } else {
                                  break L98;
                                }
                              }
                            }
                            if (0 != var2_ref_mb.field_jc) {
                              break L96;
                            } else {
                              if (((wl) this).field_eb != 1) {
                                break L96;
                              } else {
                                break L97;
                              }
                            }
                          }
                          L99: {
                            if (((wl) this).field_nb == null) {
                              break L99;
                            } else {
                              if (~Math.abs(var2_ref_mb.field_hc + -((wl) this).field_U) <= ~Math.abs(((wl) this).field_nb.field_hc - ((wl) this).field_U)) {
                                break L96;
                              } else {
                                break L99;
                              }
                            }
                          }
                          ((wl) this).field_nb = var2_ref_mb;
                          ((wl) this).field_K = ((wl) this).field_nb.field_hc;
                          ((wl) this).field_S = ((wl) this).field_nb.field_Gb;
                          break L96;
                        }
                      }
                    }
                    var2_ref_mb = (mb) (Object) ((wl) this).field_B.field_K.a((byte) -93);
                    continue L94;
                  }
                }
              }
            }
          }
          return;
        } else {
          L100: {
            ((wl) this).field_A = -((wl) this).field_B.field_ab.a(false, ((wl) this).field_U >> 4) << 4;
            ((wl) this).field_Z = ((wl) this).field_Z + 1;
            if (((wl) this).field_Z >= 250) {
              break L100;
            } else {
              ((wl) this).field_A = ((wl) this).field_A - (-250 + ((wl) this).field_Z) * ((((wl) this).field_Z - 250) * 10);
              break L100;
            }
          }
          L101: {
            if (((wl) this).field_Z < 400) {
              break L101;
            } else {
              if (((wl) this).field_Z < 450) {
                var2 = 900000 - 2000 * ((wl) this).field_Z;
                ((wl) this).field_A = ((wl) this).field_A - var2;
                var3_int = ((wl) this).field_Z * 25 - 10000;
                ((wl) this).a(5, 50 - -var3_int, 3, -108, 10);
                ((wl) this).field_A = ((wl) this).field_A + var2;
                break L101;
              } else {
                break L101;
              }
            }
          }
          L102: {
            if (((wl) this).field_Z == 450) {
              this.a(4000, 0, 3, false, 50, (byte) -115);
              break L102;
            } else {
              break L102;
            }
          }
          L103: {
            if (((wl) this).field_Z <= 450) {
              break L103;
            } else {
              var2 = 2 * (1 & ((wl) this).field_Z) - 1;
              var3_int = 750 * (var2 * (((wl) this).field_Z - 450));
              ((wl) this).field_U = ((wl) this).field_U + var3_int;
              ((wl) this).field_A = -((wl) this).field_B.field_ab.a(false, ((wl) this).field_U >> 4) << 4;
              ((wl) this).a(100, 256, 4, -124, 5 * ((wl) this).field_Z - 2200);
              ((wl) this).field_A = -((wl) this).field_B.field_ab.a(false, ((wl) this).field_U >> 4) << 4;
              ((wl) this).field_U = ((wl) this).field_U - var3_int;
              break L103;
            }
          }
          L104: {
            if (((wl) this).field_Z >= 500) {
              ((wl) this).field_Z = 0;
              break L104;
            } else {
              break L104;
            }
          }
          return;
        }
    }

    public static void h(int param0) {
        field_Y = null;
        field_R = null;
        field_J = null;
        field_db = null;
        field_N = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
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
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        var18 = param8;
        L0: while (true) {
          L1: {
            if (var18 >= param9) {
              break L1;
            } else {
              if (var16 >= param5) {
                break L1;
              } else {
                L2: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ff.field_kb[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 <= 639) {
                    break L2;
                  } else {
                    var22 = 639;
                    break L2;
                  }
                }
                L3: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L3;
                  } else {
                    var23 = 0;
                    break L3;
                  }
                }
                L4: {
                  var24 = pb.field_g[var23 * 640 + var22];
                  var25 = 64 + (ff.field_ib[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L4;
                  } else {
                    var25 = -var25;
                    break L4;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                int incrementValue$1 = var15;
                var15++;
                pb.field_g[incrementValue$1] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var16 = var16 + var17;
                var17 = var17 + param3;
                var18++;
                continue L0;
              }
            }
          }
          var15 = param11;
          var16 = param1;
          var17 = param2;
          var18 = param8 - 1;
          L5: while (true) {
            if (var18 < param7) {
              return;
            } else {
              var17 = var17 - param3;
              var16 = var16 - var17;
              if (var16 < param5) {
                L6: {
                  var19 = (var18 << 4) - param12;
                  var20 = (var16 << param4) / param6;
                  var21 = ff.field_kb[var20] * param10 >> 15;
                  var22 = var18 + (var19 * var21 + 131072 >> 18);
                  if (var22 >= 0) {
                    break L6;
                  } else {
                    var22 = 0;
                    break L6;
                  }
                }
                L7: {
                  var23 = param0 + (var14 * var21 + 131072 >> 18);
                  if (var23 >= 0) {
                    break L7;
                  } else {
                    var23 = 0;
                    break L7;
                  }
                }
                L8: {
                  var24 = pb.field_g[var23 * 640 + var22];
                  var25 = 64 + (ff.field_ib[var20] * param10 >> 17);
                  if (var25 >= 0) {
                    break L8;
                  } else {
                    var25 = -var25;
                    break L8;
                  }
                }
                var26 = (var24 & 16711935) * var25;
                var25 = (var24 & 65280) * var25;
                var24 = (var26 & 1069563840) + (var25 & 4177920);
                var26 = (var26 & -1073692672) + (var25 & 12582912);
                var26 = (var26 | var26 >>> 1) & 1077952512;
                var15--;
                pb.field_g[var15] = (var24 | var26 - (var26 >>> 8)) >>> 6;
                var18--;
                continue L5;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          var2 = 0;
          if (3 == ((wl) this).field_B.field_ab.b(103)) {
            var3 = ((wl) this).field_B.field_ab.a(-123) >> 1;
            var4 = 600;
            var5 = 5120;
            var6 = -var3 + (((wl) this).field_U >> 4);
            var7 = -var4 + (((wl) this).field_A >> 4);
            if (var6 * var6 + var7 * var7 >= var5 * var5) {
              break L0;
            } else {
              var2 = 1;
              break L0;
            }
          } else {
            if (((wl) this).field_B.field_ab.b(52) == 4) {
              var3 = 0;
              L1: while (true) {
                if (var3 >= 2) {
                  break L0;
                } else {
                  L2: {
                    if (0 != (var3 - -1 & ((wl) this).field_B.field_v)) {
                      break L2;
                    } else {
                      var4 = ((wl) this).field_B.field_ab.field_o[var3];
                      var5 = -1080;
                      var6 = 4800;
                      var7 = -var4 + (((wl) this).field_U >> 4);
                      var8 = (((wl) this).field_A >> 4) - var5;
                      if (var7 * var7 - -(var8 * var8) >= var6 * var6) {
                        break L2;
                      } else {
                        var2 = 1;
                        break L2;
                      }
                    }
                  }
                  var3++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        L3: {
          if ((((wl) this).field_mb ? 1 : 0) == var2) {
            break L3;
          } else {
            ((wl) this).field_T = true;
            break L3;
          }
        }
        L4: {
          stackOut_13_0 = this;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if (var2 == 0) {
            stackOut_15_0 = this;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L4;
          } else {
            stackOut_14_0 = this;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L4;
          }
        }
        ((wl) this).field_mb = stackIn_16_1 != 0;
    }

    private final boolean c(int param0, int param1) {
        qb var3 = null;
        if (param0 != 2) {
            return true;
        }
        ((wl) this).field_L = 10;
        if (!((wl) this).field_B.field_h) {
            if (!(((wl) this).field_V)) {
                var3 = nk.a(3, -((wl) this).field_eb / 2, ((wl) this).field_B, 108, ((wl) this).field_A, ((wl) this).field_ob, 10, -((wl) this).field_F / 2, ((wl) this).field_U, ((wl) this).field_U);
                var3.field_I = 10 * ((wl) this).field_Z / ((wl) this).field_hb;
                ((wl) this).field_B.field_O.a(param0 ^ 1, (ck) (Object) var3);
            }
        }
        if (~((wl) this).field_Z >= ~((wl) this).field_hb) {
        } else {
            if (!((wl) this).field_I) {
                ((wl) this).field_B.field_J.a((byte) 127, (kd) this);
            } else {
                ((wl) this).field_T = true;
                return true;
            }
            return true;
        }
        ((wl) this).field_H = false;
        return false;
    }

    wl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, ee param7, mb param8, int param9, int param10, int param11) {
        RuntimeException var13 = null;
        int var13_int = 0;
        jc var14 = null;
        mb var15 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        ((wl) this).field_M = 10;
        ((wl) this).field_z = 50;
        try {
          L0: {
            L1: {
              ((wl) this).field_A = param1;
              ((wl) this).field_L = param5;
              ((wl) this).field_y = param11;
              ((wl) this).field_B = param7;
              ((wl) this).field_X = param8;
              ((wl) this).field_G = param8;
              ((wl) this).field_O = param9;
              ((wl) this).field_U = param0;
              ((wl) this).field_C = param6;
              ((wl) this).field_Z = 0;
              ((wl) this).field_ib = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param3 >= 0) {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param3 == 0) {
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
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = -1;
                stackIn_6_0 = stackOut_2_0;
                stackIn_6_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((wl) this).field_Q = stackIn_6_1;
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (param2 >= 0) {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (param2 != 0) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = -1;
                stackIn_11_0 = stackOut_7_0;
                stackIn_11_1 = stackOut_7_1;
                break L2;
              }
            }
            L3: {
              ((wl) this).field_cb = stackIn_11_1;
              ((wl) this).field_eb = param2;
              ((wl) this).field_hb = param4;
              ((wl) this).field_F = param3;
              ((wl) this).field_K = ((wl) this).field_U;
              ((wl) this).field_S = ((wl) this).field_A;
              this.g(1354276);
              if (((wl) this).field_X == null) {
                break L3;
              } else {
                ((wl) this).field_ob = ((wl) this).field_X.field_u;
                break L3;
              }
            }
            L4: {
              L5: {
                ((wl) this).field_kb = 0;
                ((wl) this).field_T = false;
                stackOut_13_0 = this;
                stackIn_16_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (((wl) this).field_C == 5) {
                  break L5;
                } else {
                  stackOut_14_0 = this;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (15 == ((wl) this).field_y) {
                    break L5;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 75;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L4;
                  }
                }
              }
              stackOut_16_0 = this;
              stackOut_16_1 = 42;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L4;
            }
            L6: {
              L7: {
                ((wl) this).field_jb = stackIn_17_1 * 4 / ((wl) this).field_B.field_z;
                ((wl) this).field_bb = false;
                ((wl) this).field_gb = false;
                ((wl) this).field_W = false;
                stackOut_17_0 = this;
                stackIn_21_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (((wl) this).field_y != 15) {
                  break L7;
                } else {
                  stackOut_18_0 = this;
                  stackIn_21_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (null == ((wl) this).field_X) {
                    break L7;
                  } else {
                    stackOut_19_0 = this;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (((wl) this).field_X.field_q <= 0) {
                      break L7;
                    } else {
                      stackOut_20_0 = this;
                      stackOut_20_1 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L6;
                    }
                  }
                }
              }
              stackOut_21_0 = this;
              stackOut_21_1 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              break L6;
            }
            ((wl) this).field_E = stackIn_22_1 != 0;
            ((wl) this).field_fb = new mb[((wl) this).field_B.field_K.b((byte) -128)];
            var13_int = 0;
            var14 = new jc(((wl) this).field_B.field_K);
            var15 = (mb) (Object) var14.b(2);
            L8: while (true) {
              if (var15 == null) {
                break L0;
              } else {
                L9: {
                  L10: {
                    if (var15.field_Zb.field_N != nn.field_c[0]) {
                      break L10;
                    } else {
                      if (null == ((wl) this).field_X) {
                        break L10;
                      } else {
                        if (nn.field_c[0] == ((wl) this).field_X.field_Zb.field_N) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  int incrementValue$1 = var13_int;
                  var13_int++;
                  ((wl) this).field_fb[incrementValue$1] = var15;
                  break L9;
                }
                var15 = (mb) (Object) var14.d(2);
                continue L8;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var13 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var13;
            stackOut_30_1 = new StringBuilder().append("wl.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param7 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          L12: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param8 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L12;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L12;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param9 + 44 + param10 + 44 + param11 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new rf();
        field_Y = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_db = new byte[520];
        field_lb = false;
        field_R = "This game has been updated! Please reload this page.";
        field_D = 0;
    }
}
