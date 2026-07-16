/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static pc field_f;
    private boolean field_t;
    static String field_u;
    ei field_e;
    static String field_I;
    static int field_p;
    ei field_B;
    int field_n;
    private int field_j;
    private int[] field_m;
    private double field_h;
    private int field_E;
    kh field_i;
    private tl[] field_D;
    private int field_S;
    private int field_U;
    private int field_o;
    private int field_F;
    private double field_K;
    private int field_N;
    private String field_T;
    vg field_P;
    private boolean field_w;
    private sg field_C;
    private int field_H;
    private kg[] field_Q;
    int field_s;
    int field_L;
    private int field_r;
    private int field_x;
    private int field_l;
    private int field_G;
    private int field_c;
    private Torquing field_A;
    private int field_M;
    hc field_d;
    private int[] field_a;
    private int field_v;
    private boolean field_g;
    private int field_k;
    private boolean field_y;
    int[] field_b;
    int field_z;
    int field_q;
    private boolean field_J;

    private final void h(int param0) {
        tl[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5_int = 0;
        pj var5 = null;
        kh[] var6_ref_kh__ = null;
        int var6 = 0;
        int var7 = 0;
        kh var8 = null;
        int var9 = 0;
        tl[] var10 = null;
        int var11 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        kh stackIn_17_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        kh stackIn_29_0 = null;
        boolean stackOut_2_0 = false;
        int stackOut_6_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_13_0 = 0;
        kh stackOut_16_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        kh stackOut_28_0 = null;
        var9 = Torquing.field_u;
        fd.a(-109);
        re.field_d[1] = 80.0;
        ((bi) this).field_x = 0;
        re.field_d[0] = 0.0;
        var10 = ((bi) this).field_d.field_q;
        var2 = var10;
        ((bi) this).field_D = new tl[var10.length];
        dk.a((Object[]) (Object) var2, 0, (Object[]) (Object) ((bi) this).field_D, 0, ((bi) this).field_D.length);
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var4_int >= ((bi) this).field_D.length) {
                break L2;
              } else {
                stackOut_2_0 = ((bi) this).field_D[var4_int].f(25468);
                stackIn_7_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var9 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!stackIn_3_0) {
                      break L3;
                    } else {
                      var3++;
                      break L3;
                    }
                  }
                  var4_int++;
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            ((bi) this).field_m = new int[var3];
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          }
          var11 = stackIn_7_0;
          var4_int = var11;
          L4: while (true) {
            L5: {
              L6: {
                if (var11 >= ((bi) this).field_D.length) {
                  break L6;
                } else {
                  stackOut_9_0 = ((bi) this).field_D[var11].f(25468);
                  stackIn_14_0 = stackOut_9_0 ? 1 : 0;
                  stackIn_10_0 = stackOut_9_0;
                  if (var9 != 0) {
                    break L5;
                  } else {
                    L7: {
                      if (!stackIn_10_0) {
                        break L7;
                      } else {
                        var3--;
                        ((bi) this).field_m[var3] = var11;
                        break L7;
                      }
                    }
                    var11++;
                    if (var9 == 0) {
                      continue L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              ((bi) this).field_C = ((bi) this).field_P.a(-63, ((bi) this).field_d);
              ((bi) this).field_P.b(0, ((bi) this).field_i);
              stackOut_13_0 = 12;
              stackIn_14_0 = stackOut_13_0;
              break L5;
            }
            int[] array$1 = new int[stackIn_14_0];
            array$1[0] = 0;
            array$1[1] = 0;
            array$1[2] = 0;
            array$1[3] = 65536;
            array$1[4] = 0;
            array$1[5] = 0;
            array$1[6] = 0;
            array$1[7] = 65536;
            array$1[8] = 0;
            array$1[9] = 0;
            array$1[10] = 0;
            array$1[11] = 65536;
            var4 = array$1;
            var5_int = 42 % ((-34 - param0) / 44);
            var6_ref_kh__ = vc.field_c;
            var7 = 0;
            L8: while (true) {
              L9: {
                L10: {
                  if (var7 >= var6_ref_kh__.length) {
                    break L10;
                  } else {
                    var8 = var6_ref_kh__[var7];
                    stackOut_16_0 = (kh) var8;
                    stackIn_29_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var9 != 0) {
                      break L9;
                    } else {
                      L11: {
                        if (stackIn_17_0 != null) {
                          ((bi) this).field_C.a(var8, var4);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var7++;
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var5_int = 0;
                L12: while (true) {
                  L13: {
                    if (var5_int >= ((bi) this).field_C.field_y) {
                      break L13;
                    } else {
                      ((bi) this).field_C.a(var5_int, 80, 1365, -1, -12, 12);
                      var5_int++;
                      if (var9 == 0) {
                        continue L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    this.a(false, 0);
                    ((bi) this).field_w = false;
                    ((bi) this).field_T = ki.a("ff9040", "ffffff", 93, ((bi) this).field_T);
                    ((bi) this).field_z = 0;
                    ((bi) this).field_k = ((bi) this).field_d.a(-31648);
                    ((bi) this).field_r = 3000;
                    ((bi) this).field_c = 0;
                    ((bi) this).field_v = ((bi) this).field_d.a(false);
                    int[] discarded$2 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if ((((bi) this).field_L ^ -1) != -19) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = 0;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      break L14;
                    } else {
                      stackOut_26_0 = this;
                      stackOut_26_1 = 1;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      break L14;
                    }
                  }
                  ((bi) this).field_y = stackIn_28_1 != 0;
                  ((bi) this).field_J = false;
                  ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                  ((bi) this).field_K = -1.0;
                  stackOut_28_0 = ((bi) this).field_d.a(-100, false);
                  stackIn_29_0 = stackOut_28_0;
                  break L9;
                }
              }
              var5 = stackIn_29_0.field_k;
              var6 = var5.field_k + -1;
              L15: while (true) {
                L16: {
                  if (var6 < 0) {
                    break L16;
                  } else {
                    if (var9 != 0) {
                      break L16;
                    } else {
                      L17: {
                        if (((bi) this).field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                          ((bi) this).field_h = re.field_d[1] * (double)var5.field_y[var6];
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      var6--;
                      if (var9 == 0) {
                        continue L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        tl[] var11 = null;
        qk var12 = null;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          L1: {
            var9 = Torquing.field_u;
            var12 = new qk(0, ((bi) this).field_L, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
            if (!je.a((byte) 77)) {
              break L1;
            } else {
              bo.field_l.a((byte) 54, (q) (Object) var12);
              if (var9 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          le.a((byte) 83, 5, var12);
          break L0;
        }
        L2: {
          if (1 + ((bi) this).field_L > nh.field_k) {
            nh.field_k = ((bi) this).field_L - -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          L4: {
            if (wi.field_a.length - 1 == ((bi) this).field_L) {
              break L4;
            } else {
              if ((wi.field_a[((bi) this).field_L + 1] ^ -1) == (wi.field_a[((bi) this).field_L] ^ -1)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                break L4;
              }
            }
          }
          stackOut_10_0 = 1;
          stackIn_12_0 = stackOut_10_0;
          break L3;
        }
        L5: {
          L6: {
            L7: {
              var3 = stackIn_12_0;
              var4 = wi.field_a[((bi) this).field_L];
              if (var3 == 0) {
                break L7;
              } else {
                L8: {
                  L9: {
                    if (var4 == 1) {
                      break L9;
                    } else {
                      L10: {
                        if ((var4 ^ -1) == -3) {
                          break L10;
                        } else {
                          L11: {
                            if (var4 != 4) {
                              break L11;
                            } else {
                              this.a(2, (byte) 78, 253);
                              if (var9 == 0) {
                                break L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (7 != var4) {
                            break L8;
                          } else {
                            this.a(3, (byte) 125, 252);
                            if (var9 == 0) {
                              break L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      this.a(1, (byte) 9, 254);
                      if (var9 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.a(0, (byte) 83, 255);
                  break L8;
                }
                L12: {
                  var5 = ((bi) this).field_G & 63;
                  if (-1 <= (var4 ^ -1)) {
                    break L12;
                  } else {
                    L13: {
                      if (var4 > wi.field_a[var5]) {
                        break L13;
                      } else {
                        if ((hg.field_d[var5] ^ -1) == -1) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    this.a(4, (byte) 118, 251);
                    break L12;
                  }
                }
                L14: {
                  if (0 == var5) {
                    break L14;
                  } else {
                    L15: {
                      if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
                        break L15;
                      } else {
                        if ((((bi) this).field_T.indexOf("ffffff") ^ -1) == 0) {
                          ((bi) this).field_l = ((bi) this).field_l + ((bi) this).field_U;
                          ((bi) this).field_U = ((bi) this).field_U * 2;
                          ((bi) this).field_s = ((bi) this).field_U;
                          this.a(12, (byte) 61, 243);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    ((bi) this).field_T = ki.a("ff9040", "ff0000", -104, ((bi) this).field_T);
                    var10 = ((bi) this).field_d.field_q;
                    var6 = 0;
                    L16: while (true) {
                      if (((bi) this).field_D.length <= var6) {
                        break L6;
                      } else {
                        if (var9 != 0) {
                          break L5;
                        } else {
                          L17: {
                            if (null != ((bi) this).field_D[var6]) {
                              break L17;
                            } else {
                              if ((var10[var6].field_r ^ -1) == -1) {
                                break L17;
                              } else {
                                if (var10[var6].field_r == 7) {
                                  break L17;
                                } else {
                                  ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                                  ((bi) this).field_G = ((bi) this).field_G + 4096;
                                  ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 114136940);
                                  break L17;
                                }
                              }
                            }
                          }
                          var6++;
                          if (var9 == 0) {
                            continue L16;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                  }
                }
                L18: {
                  if ((var4 ^ -1) != -3) {
                    break L18;
                  } else {
                    this.a(5, (byte) 71, 250);
                    if (var9 == 0) {
                      break L7;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (-5 == (var4 ^ -1)) {
                    break L19;
                  } else {
                    if (var4 != 7) {
                      break L7;
                    } else {
                      this.a(7, (byte) 112, 248);
                      if (-1 == ((bi) this).field_T.indexOf("ffffff")) {
                        this.a(13, (byte) 25, 242);
                        if (var9 == 0) {
                          break L7;
                        } else {
                          break L19;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                this.a(6, (byte) 6, 249);
                break L7;
              }
            }
            L20: {
              if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
                break L20;
              } else {
                if ((((bi) this).field_T.indexOf("ffffff") ^ -1) == 0) {
                  ((bi) this).field_l = ((bi) this).field_l + ((bi) this).field_U;
                  ((bi) this).field_U = ((bi) this).field_U * 2;
                  ((bi) this).field_s = ((bi) this).field_U;
                  this.a(12, (byte) 61, 243);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            ((bi) this).field_T = ki.a("ff9040", "ff0000", -104, ((bi) this).field_T);
            var11 = ((bi) this).field_d.field_q;
            var6 = 0;
            L21: while (true) {
              if (((bi) this).field_D.length <= var6) {
                break L6;
              } else {
                if (var9 != 0) {
                  break L5;
                } else {
                  L22: {
                    if (null != ((bi) this).field_D[var6]) {
                      break L22;
                    } else {
                      if ((var11[var6].field_r ^ -1) == -1) {
                        break L22;
                      } else {
                        if (var11[var6].field_r == 7) {
                          break L22;
                        } else {
                          ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                          ((bi) this).field_G = ((bi) this).field_G + 4096;
                          ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 114136940);
                          break L22;
                        }
                      }
                    }
                  }
                  var6++;
                  if (var9 == 0) {
                    continue L21;
                  } else {
                    break L6;
                  }
                }
              }
            }
          }
          L23: {
            if (var3 == 0) {
              break L23;
            } else {
              L24: {
                if ((var4 ^ -1) == -2) {
                  break L24;
                } else {
                  if ((var4 ^ -1) == -4) {
                    break L24;
                  } else {
                    break L23;
                  }
                }
              }
              var6 = 0;
              var7 = 0;
              var8 = 0;
              L25: while (true) {
                L26: {
                  L27: {
                    L28: {
                      if (var4 < var8) {
                        break L28;
                      } else {
                        var7 = var7 + mh.field_k[var4];
                        var6 = var6 + ((bi) this).field_b[var4];
                        var8++;
                        if (var9 != 0) {
                          break L27;
                        } else {
                          if (var9 == 0) {
                            continue L25;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    if (var6 >= var7 * 8 / 10) {
                      break L27;
                    } else {
                      break L26;
                    }
                  }
                  L29: {
                    if (1 != var4) {
                      break L29;
                    } else {
                      this.a(8, (byte) 33, 247);
                      if (var9 == 0) {
                        break L26;
                      } else {
                        break L29;
                      }
                    }
                  }
                  this.a(10, (byte) 13, 245);
                  break L26;
                }
                if (var7 == var6) {
                  L30: {
                    if ((var4 ^ -1) != -2) {
                      break L30;
                    } else {
                      this.a(9, (byte) 23, 246);
                      if (var9 == 0) {
                        break L23;
                      } else {
                        break L30;
                      }
                    }
                  }
                  this.a(11, (byte) 24, 244);
                  break L23;
                } else {
                  break L23;
                }
              }
            }
          }
          dd.field_d = dd.field_d | ((bi) this).field_z;
          break L5;
        }
        L31: {
          if (-256 == (dd.field_d ^ -1)) {
            L32: {
              if (!ia.a(-22426, 0)) {
                break L32;
              } else {
                this.a(16, (byte) 11, 239);
                if (var9 == 0) {
                  break L31;
                } else {
                  break L32;
                }
              }
            }
            this.a(15, (byte) 30, 240);
            break L31;
          } else {
            break L31;
          }
        }
        if (param0 >= 25) {
          L33: {
            if (-1 > (wp.field_w ^ -1)) {
              break L33;
            } else {
              if (qc.field_ab.length <= 1) {
                break L33;
              } else {
                if ((qc.field_ab[1] + qc.field_ab[0] ^ -1) < (nh.field_k ^ -1)) {
                  break L33;
                } else {
                  nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                  break L33;
                }
              }
            }
          }
          ((bi) this).field_J = true;
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        ((bi) this).field_w = true;
        if (param0 != -7045) {
            Object var3 = null;
            bi.a((java.applet.Applet) null, (byte) -76);
        }
    }

    final void b(byte param0, int param1) {
        ((bi) this).field_k = ((bi) this).field_k + param1;
        if (param0 < 120) {
            ((bi) this).field_k = -84;
        }
    }

    final void d(int param0) {
        ti[] var2_ref_ti__ = null;
        tl[] var2_ref_tl__ = null;
        int var2 = 0;
        int var3 = 0;
        tl var4 = null;
        int var5 = 0;
        ti[] var6 = null;
        tl[] var7 = null;
        int var8 = 0;
        ti var9 = null;
        L0: {
          var5 = Torquing.field_u;
          ((bi) this).field_e.a(0);
          if (null == ((bi) this).field_d.field_k) {
            break L0;
          } else {
            var6 = ((bi) this).field_d.field_k;
            var2_ref_ti__ = var6;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                break L0;
              } else {
                var9 = var6[var3];
                if (var5 == 0) {
                  L2: {
                    if (var9 != null) {
                      var9.b((byte) 62);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var3++;
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L0;
                  }
                } else {
                  var7 = ((bi) this).field_d.field_q;
                  var2_ref_tl__ = var7;
                  var8 = 0;
                  var3 = var8;
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var7.length <= var8) {
                            break L6;
                          } else {
                            var4 = var7[var8];
                            var4.field_c = -1;
                            var4.field_h = null;
                            var8++;
                            if (var5 != 0) {
                              break L5;
                            } else {
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          if (((bi) this).field_d.field_m != null) {
                            break L7;
                          } else {
                            ((bi) this).b(param0 ^ 8);
                            ((bi) this).field_g = true;
                            ((bi) this).field_q = 9;
                            ((bi) this).field_d = ig.field_q;
                            la.field_k[9].a(true);
                            this.h(-83);
                            ((bi) this).field_r = 0;
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                        ((bi) this).field_d = ((bi) this).field_d.field_m;
                        ((bi) this).field_G = ((bi) this).field_G + 64;
                        ((bi) this).field_L = ((bi) this).field_L + 1;
                        ((bi) this).field_F = ((bi) this).field_F + (((bi) this).field_N << -961057594);
                        break L5;
                      }
                      L8: {
                        var2 = wi.field_a[((bi) this).field_L];
                        if (1 + var2 != ((bi) this).field_q) {
                          ((bi) this).field_i = tp.field_a;
                          ((bi) this).field_q = var2 + 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          if (ri.field_E < 2) {
                            break L10;
                          } else {
                            if (!la.field_k[((bi) this).field_q].e(17)) {
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                        la.field_k[((bi) this).field_q].g();
                        break L9;
                      }
                      this.h(67);
                      break L4;
                    }
                    return;
                  }
                }
              }
            }
          }
        }
        if (param0 != 1) {
          return;
        } else {
          var7 = ((bi) this).field_d.field_q;
          var2_ref_tl__ = var7;
          var8 = 0;
          var3 = var8;
          L11: while (true) {
            L12: {
              L13: {
                L14: {
                  if (var7.length <= var8) {
                    break L14;
                  } else {
                    var4 = var7[var8];
                    var4.field_c = -1;
                    var4.field_h = null;
                    var8++;
                    if (var5 != 0) {
                      break L13;
                    } else {
                      if (var5 == 0) {
                        continue L11;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                L15: {
                  if (((bi) this).field_d.field_m != null) {
                    break L15;
                  } else {
                    ((bi) this).b(param0 ^ 8);
                    ((bi) this).field_g = true;
                    ((bi) this).field_q = 9;
                    ((bi) this).field_d = ig.field_q;
                    la.field_k[9].a(true);
                    this.h(-83);
                    ((bi) this).field_r = 0;
                    if (var5 == 0) {
                      break L12;
                    } else {
                      break L15;
                    }
                  }
                }
                ((bi) this).field_d = ((bi) this).field_d.field_m;
                ((bi) this).field_G = ((bi) this).field_G + 64;
                ((bi) this).field_L = ((bi) this).field_L + 1;
                ((bi) this).field_F = ((bi) this).field_F + (((bi) this).field_N << -961057594);
                break L13;
              }
              L16: {
                var2 = wi.field_a[((bi) this).field_L];
                if (1 + var2 != ((bi) this).field_q) {
                  ((bi) this).field_i = tp.field_a;
                  ((bi) this).field_q = var2 + 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                L18: {
                  if (ri.field_E < 2) {
                    break L18;
                  } else {
                    if (!la.field_k[((bi) this).field_q].e(17)) {
                      break L18;
                    } else {
                      break L17;
                    }
                  }
                }
                la.field_k[((bi) this).field_q].g();
                break L17;
              }
              this.h(67);
              break L12;
            }
            return;
          }
        }
    }

    final static af a(sm param0, int param1) {
        int var2 = -94 / ((23 - param1) / 43);
        return (af) (Object) new di(param0);
    }

    final void a(int param0, int param1) {
        StringBuilder var3 = null;
        CharSequence var4 = null;
        L0: {
          var3 = new StringBuilder(((bi) this).field_T);
          var4 = (CharSequence) (Object) "ff9040";
          StringBuilder discarded$2 = gd.a(-20980, var3, var4, 5 + 13 * param0);
          ((bi) this).field_T = var3.toString();
          if (param1 < -26) {
            break L0;
          } else {
            ((bi) this).field_Q = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((bi) this).field_T.indexOf("ffffff") != -1) {
              break L2;
            } else {
              th.a(100, th.field_F[18]);
              if (Torquing.field_u == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          th.a(100, th.field_F[17]);
          break L1;
        }
        th.a(100, th.field_F[19]);
    }

    final void a(byte param0) {
        int var2 = -38 % ((param0 - 62) / 48);
        ((bi) this).field_x = Math.max(10, ((bi) this).field_x);
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        if (param0 != -68) {
            ((bi) this).b((byte) 62);
        }
        ((bi) this).field_H = param3;
        ((bi) this).field_E = param2;
        ((bi) this).field_P.b(0, param1);
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg var9 = null;
        kg[] stackIn_6_0 = null;
        kg[] stackIn_9_0 = null;
        kg[] stackOut_5_0 = null;
        var8 = Torquing.field_u;
        var9 = new kg(param2, param3, param1);
        var5 = var9;
        var6 = 0;
        L0: while (true) {
          if (((bi) this).field_Q.length > var6) {
            stackOut_5_0 = ((bi) this).field_Q;
            stackIn_9_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var8 == 0) {
              L1: {
                if (stackIn_9_0[var6] == null) {
                  break L1;
                } else {
                  if (((bi) this).field_Q[var6].field_a == null) {
                    break L1;
                  } else {
                    var6++;
                    continue L0;
                  }
                }
              }
              var9 = var5;
              ((bi) this).field_Q[var6] = var9;
              return;
            } else {
              L2: {
                var7 = stackIn_6_0;
                dk.a((Object[]) (Object) ((bi) this).field_Q, 0, (Object[]) (Object) var7, 0, var6);
                if (param0 == 538) {
                  break L2;
                } else {
                  ((bi) this).field_L = -15;
                  break L2;
                }
              }
              var7[var6] = var9;
              ((bi) this).field_Q = var7;
              return;
            }
          } else {
            L3: {
              var6 = ((bi) this).field_Q.length;
              var7 = new kg[var6 - -1];
              dk.a((Object[]) (Object) ((bi) this).field_Q, 0, (Object[]) (Object) var7, 0, var6);
              if (param0 == 538) {
                break L3;
              } else {
                ((bi) this).field_L = -15;
                break L3;
              }
            }
            var7[var6] = var9;
            ((bi) this).field_Q = var7;
            return;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        Object var3 = null;
        int stackIn_11_0 = 0;
        Torquing stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Torquing stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Torquing stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Torquing stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Torquing stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Torquing stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        Torquing stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Torquing stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Torquing stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Torquing stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Torquing stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Torquing stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        L0: {
          if (param0 == -103) {
            break L0;
          } else {
            var3 = null;
            af discarded$2 = bi.a((sm) null, -1);
            break L0;
          }
        }
        L1: {
          L2: {
            ((bi) this).b(9);
            ((bi) this).field_g = true;
            if (!je.a((byte) 77)) {
              break L2;
            } else {
              L3: {
                if (((bi) this).field_U == 0) {
                  if (-1 == (ao.field_f ^ -1)) {
                    if (((bi) this).field_L != 0) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L3;
                    }
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_11_0 = stackOut_6_0;
                    break L3;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_11_0 = stackOut_4_0;
                  break L3;
                }
              }
              L4: {
                var2 = stackIn_11_0;
                stackOut_11_0 = ((bi) this).field_A;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (var2 == 0) {
                  stackOut_13_0 = (Torquing) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (Torquing) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 7;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              ((Torquing) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2, 1, false);
              if (Torquing.field_u == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L5: {
            stackOut_15_0 = ((bi) this).field_A;
            stackOut_15_1 = 1;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (ao.field_f == 0) {
              stackOut_17_0 = (Torquing) (Object) stackIn_17_0;
              stackOut_17_1 = stackIn_17_1;
              stackOut_17_2 = 2;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (Torquing) (Object) stackIn_16_0;
              stackOut_16_1 = stackIn_16_1;
              stackOut_16_2 = 8;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          ((Torquing) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2, 1, false);
          break L1;
        }
    }

    private final void a(boolean param0, int param1) {
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        pj var6 = null;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          var3 = ((bi) this).field_D;
          var4 = 0;
          if (!param0) {
            break L0;
          } else {
            ((bi) this).field_v = 112;
            break L0;
          }
        }
        L1: {
          if (var4 >= var3.length) {
            break L1;
          } else {
            var5 = var3[var4];
            if (var7 != 0) {
              break L1;
            } else {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  if (31 == var5.field_r) {
                    var6 = var5.d(-2).field_k;
                    gq.a(var6.field_f, 4, param1);
                    gq.a(var6.field_s, 4, param1);
                    gq.a(var6.field_l, 4, param1);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    var4++;
                    break L1;
                  }
                }
              }
              var4++;
              break L1;
            }
          }
        }
    }

    final static we a(fj param0, byte param1) {
        if (param1 != 13) {
            Object var3 = null;
            bi.a((java.applet.Applet) null, (byte) 44);
        }
        return new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
    }

    final static boolean a(byte param0, String param1) {
        if (param0 < 77) {
            field_f = null;
        }
        return qm.a(param1, (byte) 45) != null ? true : false;
    }

    final void a(byte param0, int param1) {
        if (0 == (((bi) this).field_T.indexOf("ffffff") ^ -1)) {
            if (!((((bi) this).field_T.indexOf("ff9040") ^ -1) != 0)) {
                param1 = param1 * 2;
            }
        }
        ((bi) this).field_j = ((bi) this).field_j - param1;
        ((bi) this).field_U = ((bi) this).field_U + param1;
        ((bi) this).field_s = ((bi) this).field_U;
        if (param0 < 94) {
            Object var4 = null;
            this.a(91, -43, (sg) null, 50);
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        L0: {
          L1: {
            if (((bi) this).field_c < param5) {
              break L1;
            } else {
              int fieldTemp$2 = ((bi) this).field_c - 1;
              ((bi) this).field_c = ((bi) this).field_c - 1;
              if ((fieldTemp$2 ^ -1) <= -1) {
                break L1;
              } else {
                ((bi) this).field_P.a(param5 + 80);
                this.a(538, 16, param3, ((bi) this).field_P.field_c);
                th.a(param5 ^ 100, th.field_F[14]);
                th.a(100, th.field_F[15]);
                if (Torquing.field_u == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          th.a(100, th.field_F[16]);
          break L0;
        }
        ((bi) this).field_P.a(param1, param4, param5 + 1, param2);
        this.a(538, 0, param3, param0);
    }

    final void a(int param0) {
        ((bi) this).field_c = ((bi) this).field_c + 1;
        if (param0 != 0) {
            ((bi) this).field_z = -49;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        if (param0 != 1000) {
            ((bi) this).field_G = 31;
        }
        ((bi) this).field_i = tp.field_a;
        ((bi) this).field_c = 0;
        ((bi) this).a((byte) -68, tp.field_a, 1365, 80);
        ((bi) this).field_j = ((bi) this).field_j + ((bi) this).field_U;
        if (!(ri.field_E >= 2)) {
            var2 = ((bi) this).field_G & 63;
            ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_L - var2) * ((bi) this).field_N;
            ((bi) this).field_G = ((bi) this).field_G + (((bi) this).field_L + -var2);
        }
        ((bi) this).field_U = 0;
        this.h(-116);
    }

    final void b(int param0) {
        int var3 = 0;
        bm var4 = null;
        bm var5 = null;
        L0: {
          var3 = Torquing.field_u;
          if ((ri.field_E ^ -1) > -3) {
            break L0;
          } else {
            if (!((bi) this).field_t) {
              break L0;
            } else {
              ((bi) this).field_M = 779830527;
              ((bi) this).field_j = -((bi) this).field_U + 318907172;
              ((bi) this).field_o = 1086213241;
              ((bi) this).field_t = false;
              ((bi) this).field_l = 2121488289;
              if (var3 != 0) {
                break L0;
              } else {
                L1: {
                  if (param0 == 9) {
                    break L1;
                  } else {
                    field_f = null;
                    break L1;
                  }
                }
                return;
              }
            }
          }
        }
        if (0 < ((bi) this).field_U) {
          if (gn.field_l == null) {
            if (((bi) this).field_U > 0) {
              if (je.a((byte) 85)) {
                return;
              } else {
                L2: {
                  var4 = vl.field_c;
                  var5 = var4;
                  if (var5 == null) {
                    break L2;
                  } else {
                    if (null == var5.field_p) {
                      break L2;
                    } else {
                      if (!bn.a(var4.field_p[1][9], -17310)) {
                        break L2;
                      } else {
                        if (var4.field_n[1][9] <= ((bi) this).field_U) {
                          break L2;
                        } else {
                          gn.field_l = new wc(11, 65524, ((bi) this).field_M, ((bi) this).field_o, ((bi) this).field_l, ((bi) this).field_j, new int[1]);
                          break L2;
                        }
                      }
                    }
                  }
                }
                gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                vl.field_c = null;
                L3: {
                  if (param0 == 9) {
                    break L3;
                  } else {
                    field_f = null;
                    break L3;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            L4: {
              if (param0 == 9) {
                break L4;
              } else {
                field_f = null;
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            if (param0 == 9) {
              break L5;
            } else {
              field_f = null;
              break L5;
            }
          }
          return;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        qp var5 = null;
        Object var6 = null;
        L0: {
          if (param1 > 1) {
            break L0;
          } else {
            var6 = null;
            af discarded$2 = bi.a((sm) null, 34);
            break L0;
          }
        }
        var4 = 1 << param0;
        if ((var4 & fa.field_b) != 0) {
          return;
        } else {
          L1: {
            ao.field_f = ao.field_f | var4;
            fa.field_b = fa.field_b | var4;
            ((bi) this).field_B.a((byte) 54, (q) (Object) new tj(param0));
            if (!((bi) this).field_t) {
              L2: {
                var5 = new qp(param0, param2, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
                if (je.a((byte) 61)) {
                  break L2;
                } else {
                  wc.a(var5, (byte) 99, 4);
                  if (Torquing.field_u == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jh.field_y.a((byte) 54, (q) (Object) var5);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        if (param0 < 121) {
            ((bi) this).a(-53);
        }
        ((bi) this).field_P.e(66);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var3 = null;
            try {
                int var2_int = 35 % ((param1 - -53) / 50);
                var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        String var3_ref_String = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        kh var10 = null;
        sb var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        vn stackIn_59_0 = null;
        String stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        vn stackIn_60_0 = null;
        String stackIn_60_1 = null;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        vn stackIn_61_0 = null;
        String stackIn_61_1 = null;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        vn stackOut_58_0 = null;
        String stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        vn stackOut_60_0 = null;
        String stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        vn stackOut_59_0 = null;
        String stackOut_59_1 = null;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        L0: {
          var8 = Torquing.field_u;
          if (((bi) this).field_c >= 0) {
            break L0;
          } else {
            if (((bi) this).field_c != -2147483648) {
              ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
              ((bi) this).field_c = -2147483648;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            L3: {
              var2 = ((bi) this).field_q - 1;
              if ((var2 ^ -1) > -1) {
                break L3;
              } else {
                if (var2 < 8) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            gm.field_r[7].b(0, 0);
            if (var8 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          L4: {
            L5: {
              if (1 != ((bi) this).field_d.a(false)) {
                break L5;
              } else {
                if (null != hi.field_h[var2]) {
                  break L4;
                } else {
                  break L5;
                }
              }
            }
            gm.field_r[var2].b(0, 0);
            break L4;
          }
          hi.field_h[var2].b(0, 0);
          break L1;
        }
        L6: {
          if (((bi) this).field_K < 0.0) {
            ((bi) this).field_P.a(true, gj.field_i);
            var3 = vf.field_j[((bi) this).field_v][0];
            var4 = vf.field_j[((bi) this).field_v][1];
            var5_int = vf.field_j[((bi) this).field_v][2];
            gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> -207182928);
            gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 2033481328);
            gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 200640624);
            ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
            if (((bi) this).field_J) {
              break L6;
            } else {
              if (((bi) this).field_c < 0) {
                break L6;
              } else {
                ((bi) this).field_P.b(1);
                break L6;
              }
            }
          } else {
            if (!ce.field_b) {
              ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
              if (((bi) this).field_J) {
                break L6;
              } else {
                if (((bi) this).field_c < 0) {
                  break L6;
                } else {
                  ((bi) this).field_P.b(1);
                  break L6;
                }
              }
            } else {
              ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
              if (((bi) this).field_J) {
                break L6;
              } else {
                if (((bi) this).field_c < 0) {
                  break L6;
                } else {
                  ((bi) this).field_P.b(1);
                  break L6;
                }
              }
            }
          }
        }
        var15 = ((bi) this).field_m;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var9 = var12;
        var3_ref_int__ = var9;
        var4 = 0;
        L7: while (true) {
          L8: {
            L9: {
              if (var15.length <= var4) {
                break L9;
              } else {
                var5_int = var15[var4];
                if (var8 != 0) {
                  break L8;
                } else {
                  L10: {
                    if (null != ((bi) this).field_D[var5_int]) {
                      ((bi) this).field_D[var5_int].b(1);
                      ((bi) this).field_C.a(((bi) this).field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  var4++;
                  if (var8 == 0) {
                    continue L7;
                  } else {
                    break L9;
                  }
                }
              }
            }
            sg.a(((bi) this).field_C.field_g[((bi) this).field_P.field_c], 80, 1365, -1, -12, 12);
            sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
            break L8;
          }
          L11: {
            if (!param0) {
              break L11;
            } else {
              ((bi) this).e(14);
              break L11;
            }
          }
          sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
          var10 = (kh) (Object) on.field_e.c((byte) -122);
          L12: while (true) {
            L13: {
              L14: {
                if (var10 == null) {
                  break L14;
                } else {
                  sg.a(var10, 80, 1365, -1, -12, 12);
                  var10 = (kh) (Object) on.field_e.b((byte) -110);
                  if (var8 != 0) {
                    break L13;
                  } else {
                    if (var8 == 0) {
                      continue L12;
                    } else {
                      break L14;
                    }
                  }
                }
              }
              var3 = 9;
              L15: while (true) {
                L16: {
                  if (var3 > 16) {
                    break L16;
                  } else {
                    sg discarded$1 = ((bi) this).field_C;
                    sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                    var3++;
                    if (var8 == 0) {
                      continue L15;
                    } else {
                      break L16;
                    }
                  }
                }
                ((bi) this).field_C.a(gj.field_i);
                var11 = (sb) (Object) ((bi) this).field_e.b(0);
                L17: while (true) {
                  L18: {
                    if (var11 == null) {
                      break L18;
                    } else {
                      var11.c(-103);
                      var11 = (sb) (Object) ((bi) this).field_e.f(-24059);
                      if (var8 == 0) {
                        continue L17;
                      } else {
                        break L18;
                      }
                    }
                  }
                  if (!ti.field_k) {
                    L19: {
                      bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                      var3_ref_String = wh.a(((bi) this).field_k, (byte) -119);
                      if (((bi) this).field_d == ig.field_q) {
                        break L19;
                      } else {
                        dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
                        if (10000 <= ((bi) this).field_k) {
                          break L19;
                        } else {
                          if (((bi) this).field_J) {
                            break L19;
                          } else {
                            L20: {
                              if (((bi) this).field_v == 0) {
                                break L20;
                              } else {
                                dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                                if (var8 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                            break L19;
                          }
                        }
                      }
                    }
                    L21: {
                      stackOut_58_0 = dd.field_c;
                      stackOut_58_1 = Integer.toString(Math.abs(((bi) this).field_U));
                      stackOut_58_2 = 628;
                      stackOut_58_3 = 67;
                      stackIn_60_0 = stackOut_58_0;
                      stackIn_60_1 = stackOut_58_1;
                      stackIn_60_2 = stackOut_58_2;
                      stackIn_60_3 = stackOut_58_3;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      stackIn_59_3 = stackOut_58_3;
                      if (!((bi) this).field_t) {
                        stackOut_60_0 = (vn) (Object) stackIn_60_0;
                        stackOut_60_1 = (String) (Object) stackIn_60_1;
                        stackOut_60_2 = stackIn_60_2;
                        stackOut_60_3 = stackIn_60_3;
                        stackOut_60_4 = 16711680;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        stackIn_61_2 = stackOut_60_2;
                        stackIn_61_3 = stackOut_60_3;
                        stackIn_61_4 = stackOut_60_4;
                        break L21;
                      } else {
                        stackOut_59_0 = (vn) (Object) stackIn_59_0;
                        stackOut_59_1 = (String) (Object) stackIn_59_1;
                        stackOut_59_2 = stackIn_59_2;
                        stackOut_59_3 = stackIn_59_3;
                        stackOut_59_4 = 16776960;
                        stackIn_61_0 = stackOut_59_0;
                        stackIn_61_1 = stackOut_59_1;
                        stackIn_61_2 = stackOut_59_2;
                        stackIn_61_3 = stackOut_59_3;
                        stackIn_61_4 = stackOut_59_4;
                        break L21;
                      }
                    }
                    ((vn) (Object) stackIn_61_0).a(stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, -1);
                    var4 = 0;
                    var5_int = 528;
                    L22: while (true) {
                      L23: {
                        if (8 <= var4) {
                          break L23;
                        } else {
                          L24: {
                            L25: {
                              L26: {
                                if (-1 != (dd.field_d >> var4 & 1 ^ -1)) {
                                  break L26;
                                } else {
                                  if ((1 & ((bi) this).field_z >> var4) == 0) {
                                    break L25;
                                  } else {
                                    if ((((bi) this).field_k % 1000 ^ -1) <= -501) {
                                      break L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                              }
                              ue.field_c[var4].e(var5_int, 118, 162);
                              if (var8 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                            ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                            ue.field_c[var4 + 8].e(var5_int, 118, 81);
                            break L24;
                          }
                          var5_int = var5_int + ue.field_c[var4].field_w;
                          var4++;
                          if (var8 == 0) {
                            continue L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var4 = 0;
                      L27: while (true) {
                        L28: {
                          if (((bi) this).field_c <= var4) {
                            break L28;
                          } else {
                            kk.field_n.d(583 - -(var4 * 8), 143);
                            var4++;
                            if (var8 == 0) {
                              continue L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          if (!((bi) this).field_w) {
                            break L29;
                          } else {
                            ia.field_f.d(553, 143);
                            break L29;
                          }
                        }
                        dd.field_c.b(((bi) this).field_T, 538, 102, 16711680, -1);
                        break L13;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            }
            L30: {
              if (-1 <= (((bi) this).field_r ^ -1)) {
                break L30;
              } else {
                var3 = (((bi) this).field_r - 1) / 1000;
                var4 = -(1000 * var3) + ((bi) this).field_r;
                var5 = hq.field_h[var3];
                var6 = var4 * var5.field_s / 1000;
                var7 = var5.field_t * var4 / 1000;
                var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                break L30;
              }
            }
            return;
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        double[] var7 = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        Object var9 = null;
        double var9_double = 0.0;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        kg[] var10_ref_kg__ = null;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        tl var14 = null;
        double var14_double = 0.0;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        short[] var24 = null;
        ed var25 = null;
        double[] var26 = null;
        kg[] var29 = null;
        short[] var30 = null;
        double[] var31 = null;
        short[] var34 = null;
        double[] var35 = null;
        short[] var38 = null;
        double[] var39 = null;
        double[] var40 = null;
        int[] var41 = null;
        kh var42 = null;
        sb var43 = null;
        int stackIn_9_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_110_0 = 0;
        double stackIn_181_0 = 0.0;
        vg stackIn_188_0 = null;
        double[] stackIn_188_1 = null;
        int stackIn_188_2 = 0;
        double stackIn_188_3 = 0.0;
        int stackIn_188_4 = 0;
        int stackIn_188_5 = 0;
        vg stackIn_189_0 = null;
        double[] stackIn_189_1 = null;
        int stackIn_189_2 = 0;
        double stackIn_189_3 = 0.0;
        int stackIn_189_4 = 0;
        int stackIn_189_5 = 0;
        vg stackIn_190_0 = null;
        double[] stackIn_190_1 = null;
        int stackIn_190_2 = 0;
        double stackIn_190_3 = 0.0;
        int stackIn_190_4 = 0;
        int stackIn_190_5 = 0;
        int stackIn_190_6 = 0;
        int stackIn_202_0 = 0;
        kg[] stackIn_225_0 = null;
        Torquing stackIn_262_0 = null;
        int stackIn_262_1 = 0;
        Torquing stackIn_263_0 = null;
        int stackIn_263_1 = 0;
        Torquing stackIn_264_0 = null;
        int stackIn_264_1 = 0;
        int stackIn_264_2 = 0;
        int stackIn_271_0 = 0;
        Torquing stackIn_272_0 = null;
        int stackIn_272_1 = 0;
        Torquing stackIn_273_0 = null;
        int stackIn_273_1 = 0;
        Torquing stackIn_274_0 = null;
        int stackIn_274_1 = 0;
        int stackIn_274_2 = 0;
        kg[] stackIn_276_0 = null;
        Object stackIn_279_0 = null;
        Object stackIn_288_0 = null;
        Object stackIn_291_0 = null;
        tl stackIn_291_1 = null;
        Object stackIn_302_0 = null;
        tl stackIn_302_1 = null;
        Object stackIn_316_0 = null;
        Object stackIn_316_1 = null;
        int stackOut_8_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_109_0 = 0;
        vg stackOut_187_0 = null;
        double[] stackOut_187_1 = null;
        int stackOut_187_2 = 0;
        double stackOut_187_3 = 0.0;
        int stackOut_187_4 = 0;
        int stackOut_187_5 = 0;
        vg stackOut_189_0 = null;
        double[] stackOut_189_1 = null;
        int stackOut_189_2 = 0;
        double stackOut_189_3 = 0.0;
        int stackOut_189_4 = 0;
        int stackOut_189_5 = 0;
        int stackOut_189_6 = 0;
        vg stackOut_188_0 = null;
        double[] stackOut_188_1 = null;
        int stackOut_188_2 = 0;
        double stackOut_188_3 = 0.0;
        int stackOut_188_4 = 0;
        int stackOut_188_5 = 0;
        int stackOut_188_6 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        double stackOut_180_0 = 0.0;
        double stackOut_179_0 = 0.0;
        double stackOut_178_0 = 0.0;
        kg[] stackOut_224_0 = null;
        Torquing stackOut_261_0 = null;
        int stackOut_261_1 = 0;
        Torquing stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        int stackOut_263_2 = 0;
        Torquing stackOut_262_0 = null;
        int stackOut_262_1 = 0;
        int stackOut_262_2 = 0;
        int stackOut_270_0 = 0;
        int stackOut_269_0 = 0;
        Torquing stackOut_271_0 = null;
        int stackOut_271_1 = 0;
        Torquing stackOut_273_0 = null;
        int stackOut_273_1 = 0;
        int stackOut_273_2 = 0;
        Torquing stackOut_272_0 = null;
        int stackOut_272_1 = 0;
        int stackOut_272_2 = 0;
        kg[] stackOut_275_0 = null;
        Object stackOut_278_0 = null;
        Object stackOut_287_0 = null;
        Object stackOut_290_0 = null;
        tl stackOut_290_1 = null;
        Object stackOut_301_0 = null;
        Object stackOut_301_1 = null;
        Object stackOut_318_0 = null;
        Object stackOut_318_1 = null;
        L0: {
          var22 = null;
          var23 = null;
          var21 = Torquing.field_u;
          if (jb.a(110)) {
            break L0;
          } else {
            if (((bi) this).field_J) {
              break L0;
            } else {
              np.a(la.field_k[((bi) this).field_q], false, 124);
              break L0;
            }
          }
        }
        L1: {
          ((bi) this).field_j = ((bi) this).field_j + 1;
          ((bi) this).field_F = ((bi) this).field_F - ((bi) this).field_M;
          ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_M;
          ((bi) this).field_l = ((bi) this).field_l + 1;
          ((bi) this).field_s = ((bi) this).field_U;
          if (-3 < (ri.field_E ^ -1)) {
            break L1;
          } else {
            if (!ce.field_b) {
              break L1;
            } else {
              ko.field_b = false;
              break L1;
            }
          }
        }
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (!ak.c(-85)) {
                break L4;
              } else {
                var7_int = po.field_z;
                stackOut_8_0 = var7_int ^ -1;
                stackIn_110_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (var21 != 0) {
                  break L3;
                } else {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            L10: {
                              L11: {
                                L12: {
                                  L13: {
                                    L14: {
                                      L15: {
                                        L16: {
                                          L17: {
                                            L18: {
                                              if (stackIn_9_0 != -99) {
                                                break L18;
                                              } else {
                                                if (var21 == 0) {
                                                  L19: {
                                                    if (!mm.field_h) {
                                                      break L19;
                                                    } else {
                                                      ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] + 10.0;
                                                      ((bi) this).field_M = ((bi) this).field_M + 1;
                                                      break L19;
                                                    }
                                                  }
                                                  var3++;
                                                  if (var21 == 0) {
                                                    break L5;
                                                  } else {
                                                    break L17;
                                                  }
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            L20: {
                                              if (var7_int != 99) {
                                                break L20;
                                              } else {
                                                if (var21 == 0) {
                                                  break L17;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            if (-97 == (var7_int ^ -1)) {
                                              break L16;
                                            } else {
                                              if (97 == var7_int) {
                                                break L15;
                                              } else {
                                                L21: {
                                                  if (var7_int != 102) {
                                                    break L21;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L14;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                L22: {
                                                  if ((var7_int ^ -1) != -105) {
                                                    break L22;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L13;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                L23: {
                                                  if (-106 != (var7_int ^ -1)) {
                                                    break L23;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L12;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                L24: {
                                                  if (103 != var7_int) {
                                                    break L24;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L11;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                                if (42 == var7_int) {
                                                  break L10;
                                                } else {
                                                  L25: {
                                                    if ((var7_int ^ -1) != -44) {
                                                      break L25;
                                                    } else {
                                                      if (var21 == 0) {
                                                        break L9;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                  }
                                                  if (-101 == (var7_int ^ -1)) {
                                                    break L8;
                                                  } else {
                                                    if ((var7_int ^ -1) == -83) {
                                                      break L8;
                                                    } else {
                                                      L26: {
                                                        if (84 != var7_int) {
                                                          break L26;
                                                        } else {
                                                          if (var21 == 0) {
                                                            break L7;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        if ((var7_int ^ -1) != -84) {
                                                          break L27;
                                                        } else {
                                                          if (var21 == 0) {
                                                            break L7;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      if (-14 == (var7_int ^ -1)) {
                                                        break L6;
                                                      } else {
                                                        break L5;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          var3--;
                                          if (!mm.field_h) {
                                            break L5;
                                          } else {
                                            ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] - 10.0;
                                            ((bi) this).field_M = ((bi) this).field_M + 2;
                                            if (var21 == 0) {
                                              break L5;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var4++;
                                        ((bi) this).field_y = false;
                                        if (mm.field_h) {
                                          ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] - 10.0;
                                          ((bi) this).field_M = ((bi) this).field_M + 4;
                                          if (var21 == 0) {
                                            break L5;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L5;
                                        }
                                      }
                                      ((bi) this).field_y = false;
                                      var4--;
                                      if (mm.field_h) {
                                        ((bi) this).field_M = ((bi) this).field_M + 8;
                                        ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] + 10.0;
                                        if (var21 == 0) {
                                          break L5;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                    ((bi) this).field_y = false;
                                    var4++;
                                    var3++;
                                    if (var21 == 0) {
                                      break L5;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  ((bi) this).field_y = false;
                                  var3++;
                                  var4--;
                                  if (var21 == 0) {
                                    break L5;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((bi) this).field_y = false;
                                var3--;
                                var4--;
                                if (var21 == 0) {
                                  break L5;
                                } else {
                                  break L11;
                                }
                              }
                              var4++;
                              ((bi) this).field_y = false;
                              var3--;
                              if (var21 == 0) {
                                break L5;
                              } else {
                                break L10;
                              }
                            }
                            if (!mm.field_h) {
                              break L5;
                            } else {
                              ((bi) this).field_M = ((bi) this).field_M + 16;
                              ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] + 10.0;
                              if (var21 == 0) {
                                break L5;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (mm.field_h) {
                            ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] - 10.0;
                            ((bi) this).field_M = ((bi) this).field_M + 32;
                            if (var21 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          } else {
                            break L5;
                          }
                        }
                        if (!((bi) this).field_w) {
                          break L5;
                        } else {
                          var6 = 1;
                          if (var21 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5 = 1;
                      if (var21 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                    var2 = 1;
                    break L5;
                  }
                  if (2 <= ri.field_E) {
                    L28: {
                      L29: {
                        L30: {
                          L31: {
                            L32: {
                              L33: {
                                L34: {
                                  L35: {
                                    var7_int = po.field_z;
                                    if (var7_int != 70) {
                                      break L35;
                                    } else {
                                      if (var21 == 0) {
                                        break L34;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  if (var7_int == 51) {
                                    break L33;
                                  } else {
                                    L36: {
                                      if (38 != var7_int) {
                                        break L36;
                                      } else {
                                        if (var21 == 0) {
                                          break L32;
                                        } else {
                                          break L36;
                                        }
                                      }
                                    }
                                    if (var7_int == 49) {
                                      break L31;
                                    } else {
                                      L37: {
                                        if (var7_int != 101) {
                                          break L37;
                                        } else {
                                          if (var21 == 0) {
                                            break L30;
                                          } else {
                                            break L37;
                                          }
                                        }
                                      }
                                      if (var7_int == 48) {
                                        break L29;
                                      } else {
                                        if (-81 == (var7_int ^ -1)) {
                                          break L28;
                                        } else {
                                          L38: {
                                            if ((var7_int ^ -1) != -70) {
                                              break L38;
                                            } else {
                                              if (var21 == 0) {
                                                break L28;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          if (-58 != (var7_int ^ -1)) {
                                            continue L2;
                                          } else {
                                            if (var21 == 0) {
                                              L39: {
                                                if (i.field_P[81]) {
                                                  stackOut_107_0 = 0;
                                                  stackIn_108_0 = stackOut_107_0;
                                                  break L39;
                                                } else {
                                                  stackOut_106_0 = 1;
                                                  stackIn_108_0 = stackOut_106_0;
                                                  break L39;
                                                }
                                              }
                                              mm.field_h = stackIn_108_0 != 0;
                                              ((bi) this).field_t = ((bi) this).field_t | mm.field_h;
                                              if (var21 == 0) {
                                                continue L2;
                                              } else {
                                                break L4;
                                              }
                                            } else {
                                              break L34;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                ti.field_k = ti.field_k ^ true;
                                if (var21 == 0) {
                                  continue L2;
                                } else {
                                  break L33;
                                }
                              }
                              ce.field_b = true;
                              if (var21 == 0) {
                                continue L2;
                              } else {
                                break L32;
                              }
                            }
                            ce.field_b = false;
                            if (var21 == 0) {
                              continue L2;
                            } else {
                              break L31;
                            }
                          }
                          if (!ce.field_b) {
                            continue L2;
                          } else {
                            ko.field_b = true;
                            if (var21 == 0) {
                              continue L2;
                            } else {
                              break L30;
                            }
                          }
                        }
                        ((bi) this).field_k = ((bi) this).field_k + 30000;
                        ((bi) this).field_t = true;
                        if (var21 == 0) {
                          continue L2;
                        } else {
                          break L29;
                        }
                      }
                      ((bi) this).field_k = ((bi) this).field_k - 1000;
                      if (var21 == 0) {
                        continue L2;
                      } else {
                        break L28;
                      }
                    }
                    L40: {
                      ((bi) this).field_k = 0;
                      ((bi) this).field_T = ki.a("ff9040", "ffffff", -93, ((bi) this).field_T.toString());
                      ((bi) this).g(62);
                      vl.field_c = null;
                      if (!je.a((byte) 117)) {
                        gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    ((bi) this).field_l = ((bi) this).field_l - ((bi) this).field_U;
                    ((bi) this).field_U = 0;
                    return;
                  } else {
                    continue L2;
                  }
                }
              }
            }
            var7_int = ((bi) this).field_a[0];
            stackOut_109_0 = be.field_o[var7_int * 32 & 2047];
            stackIn_110_0 = stackOut_109_0;
            break L3;
          }
          var8 = stackIn_110_0;
          var9_int = be.field_l[32 * var7_int & 2047];
          ((bi) this).field_a[0] = 0;
          ((bi) this).field_a[11] = var8;
          ((bi) this).field_a[3] = var8;
          ((bi) this).field_a[9] = var9_int;
          ((bi) this).field_a[5] = -var9_int;
          ((bi) this).field_P.field_h.a(vc.field_c[1], ((bi) this).field_a);
          var42 = (kh) (Object) on.field_e.c((byte) -119);
          L41: while (true) {
            L42: {
              L43: {
                if (var42 == null) {
                  break L43;
                } else {
                  ((bi) this).field_P.field_h.a(var42, ((bi) this).field_a);
                  var42 = (kh) (Object) on.field_e.b((byte) 72);
                  if (var21 != 0) {
                    break L42;
                  } else {
                    if (var21 == 0) {
                      continue L41;
                    } else {
                      break L43;
                    }
                  }
                }
              }
              var10 = 9;
              L44: while (true) {
                L45: {
                  L46: {
                    if (-17 > (var10 ^ -1)) {
                      break L46;
                    } else {
                      ((bi) this).field_P.field_h.a(vc.field_c[var10], ((bi) this).field_a);
                      var10++;
                      if (var21 != 0) {
                        break L45;
                      } else {
                        if (var21 == 0) {
                          continue L44;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                  ((bi) this).field_a[0] = 1 + var7_int;
                  break L45;
                }
                L47: {
                  if (0 != (7 & var7_int)) {
                    break L47;
                  } else {
                    var38 = vc.field_c[9].field_l.field_m;
                    var34 = var38;
                    var30 = var34;
                    var24 = var30;
                    var10_ref_short__ = var24;
                    var11_int = (short)(65535 & var38[0] - -1024);
                    dk.a(var10_ref_short__, 0, var38.length, (short) var11_int);
                    ((bi) this).field_M = ((bi) this).field_M ^ var11_int << 613208131;
                    ((bi) this).field_o = ((bi) this).field_o ^ var11_int << 1035955139;
                    break L47;
                  }
                }
                this.a(false, var7_int);
                break L42;
              }
            }
            var43 = (sb) (Object) ((bi) this).field_e.b(0);
            L48: while (true) {
              L49: {
                if (var43 == null) {
                  break L49;
                } else {
                  var43.a((byte) -114);
                  var43 = (sb) (Object) ((bi) this).field_e.f(-24059);
                  if (var21 != 0) {
                    return;
                  } else {
                    if (var21 == 0) {
                      continue L48;
                    } else {
                      break L49;
                    }
                  }
                }
              }
              if (var2 != 0) {
                ((bi) this).field_A.a(true, 1, 2, false);
                return;
              } else {
                L50: {
                  if ((ri.field_E ^ -1) > -3) {
                    break L50;
                  } else {
                    if (!ce.field_b) {
                      break L50;
                    } else {
                      if (ko.field_b) {
                        break L50;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (-1 > (((bi) this).field_r ^ -1)) {
                  L51: {
                    L52: {
                      if (-1001 != (((bi) this).field_r ^ -1)) {
                        break L52;
                      } else {
                        th.a(100, th.field_F[4]);
                        if (var21 == 0) {
                          break L51;
                        } else {
                          break L52;
                        }
                      }
                    }
                    L53: {
                      if (-2001 == (((bi) this).field_r ^ -1)) {
                        break L53;
                      } else {
                        L54: {
                          if (-3001 == (((bi) this).field_r ^ -1)) {
                            break L54;
                          } else {
                            if ((((bi) this).field_r ^ -1) < -21) {
                              break L51;
                            } else {
                              qj.a(((bi) this).field_r, -5205, 96, th.field_F[5]);
                              if (var21 == 0) {
                                break L51;
                              } else {
                                break L54;
                              }
                            }
                          }
                        }
                        th.a(100, th.field_F[2]);
                        if (var21 == 0) {
                          break L51;
                        } else {
                          break L53;
                        }
                      }
                    }
                    th.a(100, th.field_F[3]);
                    break L51;
                  }
                  ((bi) this).field_r = ((bi) this).field_r - 20;
                  return;
                } else {
                  L55: {
                    L56: {
                      if (-1 <= (((bi) this).field_x ^ -1)) {
                        break L56;
                      } else {
                        if ((((bi) this).field_x ^ -1) <= -513) {
                          break L56;
                        } else {
                          var25 = ql.field_u;
                          ((bi) this).field_x = Math.min(512, ((bi) this).field_x + 10);
                          bc.field_a.a(true);
                          var25.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[((bi) this).field_v][2] * 2) / 2048.0);
                          bc.field_a.a(var25, 65536);
                          var25.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[((bi) this).field_v][0]) / 2048.0);
                          bc.field_a.a(var25, 65536);
                          var25.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[((bi) this).field_v][1] * 2) * 3.141592653589793 / 2048.0);
                          bc.field_a.a(var25, 65536);
                          var25.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -((bi) this).field_x) / 2048.0);
                          bc.field_a.a(var25, 65536);
                          bc.field_a.a(gj.field_i, (byte) 113);
                          re.field_d[0] = 80.0 * (double)be.field_l[((bi) this).field_x] / 65535.0;
                          re.field_d[1] = (double)be.field_o[((bi) this).field_x] * 80.0 / 65535.0;
                          ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                          var8_ref_pj = ((bi) this).field_d.a(-100, false).field_k;
                          var9_int = -1 + var8_ref_pj.field_k;
                          L57: while (true) {
                            if (-1 < (var9_int ^ -1)) {
                              break L56;
                            } else {
                              ((bi) this).field_h = Math.max(((bi) this).field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
                              var9_int--;
                              if (var21 != 0) {
                                break L55;
                              } else {
                                if (var21 == 0) {
                                  continue L57;
                                } else {
                                  break L56;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var3 = Math.min(Math.max(var3, -10), 10);
                    break L55;
                  }
                  L58: {
                    L59: {
                      var7 = new double[3];
                      var7[0] = 2670.0 * (double)(be.field_o[((bi) this).field_x] * var3) / 65535.0;
                      var7[1] = 2670.0 * (double)(-be.field_l[((bi) this).field_x] * var3) / 65535.0;
                      var7[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                      if ((((bi) this).field_c ^ -1) > -1) {
                        break L59;
                      } else {
                        if (mm.field_h) {
                          break L59;
                        } else {
                          if (!((bi) this).field_J) {
                            L60: {
                              stackOut_187_0 = ((bi) this).field_P;
                              stackOut_187_1 = (double[]) var7;
                              stackOut_187_2 = var5;
                              stackOut_187_3 = 0.08;
                              stackOut_187_4 = var6;
                              stackOut_187_5 = 0;
                              stackIn_189_0 = stackOut_187_0;
                              stackIn_189_1 = stackOut_187_1;
                              stackIn_189_2 = stackOut_187_2;
                              stackIn_189_3 = stackOut_187_3;
                              stackIn_189_4 = stackOut_187_4;
                              stackIn_189_5 = stackOut_187_5;
                              stackIn_188_0 = stackOut_187_0;
                              stackIn_188_1 = stackOut_187_1;
                              stackIn_188_2 = stackOut_187_2;
                              stackIn_188_3 = stackOut_187_3;
                              stackIn_188_4 = stackOut_187_4;
                              stackIn_188_5 = stackOut_187_5;
                              if (((bi) this).field_d != ig.field_q) {
                                stackOut_189_0 = (vg) (Object) stackIn_189_0;
                                stackOut_189_1 = (double[]) (Object) stackIn_189_1;
                                stackOut_189_2 = stackIn_189_2;
                                stackOut_189_3 = stackIn_189_3;
                                stackOut_189_4 = stackIn_189_4;
                                stackOut_189_5 = stackIn_189_5;
                                stackOut_189_6 = 0;
                                stackIn_190_0 = stackOut_189_0;
                                stackIn_190_1 = stackOut_189_1;
                                stackIn_190_2 = stackOut_189_2;
                                stackIn_190_3 = stackOut_189_3;
                                stackIn_190_4 = stackOut_189_4;
                                stackIn_190_5 = stackOut_189_5;
                                stackIn_190_6 = stackOut_189_6;
                                break L60;
                              } else {
                                stackOut_188_0 = (vg) (Object) stackIn_188_0;
                                stackOut_188_1 = (double[]) (Object) stackIn_188_1;
                                stackOut_188_2 = stackIn_188_2;
                                stackOut_188_3 = stackIn_188_3;
                                stackOut_188_4 = stackIn_188_4;
                                stackOut_188_5 = stackIn_188_5;
                                stackOut_188_6 = 1;
                                stackIn_190_0 = stackOut_188_0;
                                stackIn_190_1 = stackOut_188_1;
                                stackIn_190_2 = stackOut_188_2;
                                stackIn_190_3 = stackOut_188_3;
                                stackIn_190_4 = stackOut_188_4;
                                stackIn_190_5 = stackOut_188_5;
                                stackIn_190_6 = stackOut_188_6;
                                break L60;
                              }
                            }
                            L61: {
                              var9_double = ((vg) (Object) stackIn_190_0).a(stackIn_190_1, stackIn_190_2 != 0, stackIn_190_3, stackIn_190_4 != 0, stackIn_190_5, stackIn_190_6 != 0);
                              if (!((bi) this).field_y) {
                                break L61;
                              } else {
                                if (((bi) this).field_P.field_g[2] > 1400.0) {
                                  break L61;
                                } else {
                                  if (0.0 <= ((bi) this).field_P.field_g[5]) {
                                    this.a(14, (byte) 127, 241);
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                            }
                            L62: {
                              if (var9_double <= ((bi) this).field_h) {
                                break L62;
                              } else {
                                if (-1.0 == ((bi) this).field_K) {
                                  ((bi) this).field_K = 0.08 * ((bi) this).field_P.field_g[4];
                                  th.a(100, th.field_F[22]);
                                  break L62;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            L63: {
                              if (var9_double >= 100000.0 + ((bi) this).field_h) {
                                stackOut_201_0 = 0;
                                stackIn_202_0 = stackOut_201_0;
                                break L63;
                              } else {
                                stackOut_200_0 = 1;
                                stackIn_202_0 = stackOut_200_0;
                                break L63;
                              }
                            }
                            var8 = stackIn_202_0;
                            break L58;
                          } else {
                            break L59;
                          }
                        }
                      }
                    }
                    L64: {
                      if (!mm.field_h) {
                        break L64;
                      } else {
                        ((bi) this).field_P.c(0);
                        break L64;
                      }
                    }
                    var8 = 1;
                    if (!((bi) this).field_J) {
                      break L58;
                    } else {
                      var39 = new double[4];
                      var35 = var39;
                      var31 = var35;
                      var26 = var31;
                      var9 = (Object) (Object) var26;
                      ap.a(((bi) this).field_P.field_g, 6, ((bi) this).field_P.field_g, 10, (double[]) var9, 0, 0.08);
                      var10 = 0;
                      L65: while (true) {
                        L66: {
                          L67: {
                            if (-5 >= (var10 ^ -1)) {
                              break L67;
                            } else {
                              ((bi) this).field_P.field_g[var10 + 6] = ((bi) this).field_P.field_g[var10 + 6] + var39[var10];
                              var10++;
                              if (var21 != 0) {
                                break L66;
                              } else {
                                if (var21 == 0) {
                                  continue L65;
                                } else {
                                  break L67;
                                }
                              }
                            }
                          }
                          var10 = 0;
                          break L66;
                        }
                        L68: while (true) {
                          L69: {
                            if ((var10 ^ -1) <= -4) {
                              break L69;
                            } else {
                              ((bi) this).field_P.field_g[10 - -var10] = ((bi) this).field_P.field_g[10 - -var10] * 0.8;
                              var10++;
                              if (var21 != 0) {
                                break L58;
                              } else {
                                if (var21 == 0) {
                                  continue L68;
                                } else {
                                  break L69;
                                }
                              }
                            }
                          }
                          L70: {
                            var10_double = 0.1;
                            var12_double = ((bi) this).field_P.field_g[8];
                            if (var12_double >= 1.0) {
                              stackOut_180_0 = 0.0;
                              stackIn_181_0 = stackOut_180_0;
                              break L70;
                            } else {
                              if (-1.0 < var12_double) {
                                stackOut_179_0 = Math.acos(var12_double);
                                stackIn_181_0 = stackOut_179_0;
                                break L70;
                              } else {
                                stackOut_178_0 = 3.141592653589793;
                                stackIn_181_0 = stackOut_178_0;
                                break L70;
                              }
                            }
                          }
                          L71: {
                            L72: {
                              L73: {
                                var14_double = stackIn_181_0;
                                var16 = ql.field_u;
                                if (0.0001 > var14_double) {
                                  break L73;
                                } else {
                                  if (3.141492653589793 >= var14_double) {
                                    break L72;
                                  } else {
                                    break L73;
                                  }
                                }
                              }
                              var19 = var10_double;
                              var17 = 1.0 - var10_double;
                              if (var21 == 0) {
                                break L71;
                              } else {
                                break L72;
                              }
                            }
                            var17 = Math.sin((-var10_double + 1.0) * var14_double);
                            var19 = Math.sin(var14_double * var10_double);
                            break L71;
                          }
                          var16.field_b = var19 + var17 * ((bi) this).field_P.field_g[8];
                          var16.field_d = ((bi) this).field_P.field_g[7] * var17;
                          var16.field_a = var17 * ((bi) this).field_P.field_g[6];
                          var16.field_e = ((bi) this).field_P.field_g[9] * var17;
                          var16.a((byte) -123);
                          ((bi) this).field_P.field_g[8] = var16.field_b;
                          ((bi) this).field_P.field_g[6] = var16.field_a;
                          ((bi) this).field_P.field_g[7] = var16.field_d;
                          ((bi) this).field_P.field_g[9] = var16.field_e;
                          ((bi) this).field_P.c(0);
                          ((bi) this).field_P.field_h.a(((bi) this).field_P.field_h.field_g[((bi) this).field_P.field_c], ((bi) this).field_P.field_f);
                          break L58;
                        }
                      }
                    }
                  }
                  L74: {
                    if (ig.field_q == ((bi) this).field_d) {
                      var40 = ((bi) this).field_d.f(14);
                      ((bi) this).field_P.field_g[0] = var40[0];
                      ((bi) this).field_P.field_g[2] = var40[2];
                      break L74;
                    } else {
                      break L74;
                    }
                  }
                  var41 = ((bi) this).field_m;
                  var10 = 0;
                  L75: while (true) {
                    L76: {
                      L77: {
                        if ((var41.length ^ -1) >= (var10 ^ -1)) {
                          break L77;
                        } else {
                          var11_int = var41[var10];
                          if (var21 != 0) {
                            break L76;
                          } else {
                            L78: {
                              if (((bi) this).field_D[var11_int] == null) {
                                break L78;
                              } else {
                                var12_double = ((bi) this).field_D[var11_int].a(0, 0.08);
                                if (var12_double > ((bi) this).field_h + 100000.0) {
                                  L79: {
                                    var14 = ((bi) this).field_D[var11_int];
                                    this.a(538, 0, var14.field_h, var14.field_c);
                                    if (null == ig.field_r[13]) {
                                      ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                                      break L79;
                                    } else {
                                      break L79;
                                    }
                                  }
                                  L80: {
                                    if (!ig.field_r[13].e(17)) {
                                      ig.field_r[13].c(0);
                                      ni.a(ig.field_r[13], true);
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                  ((bi) this).field_D[var11_int] = null;
                                  break L78;
                                } else {
                                  break L78;
                                }
                              }
                            }
                            var10++;
                            if (var21 == 0) {
                              continue L75;
                            } else {
                              break L77;
                            }
                          }
                        }
                      }
                      if (param0 > 35) {
                        break L76;
                      } else {
                        return;
                      }
                    }
                    var9_int = 0;
                    L81: while (true) {
                      L82: {
                        L83: {
                          L84: {
                            L85: {
                              L86: {
                                L87: {
                                  if ((((bi) this).field_Q.length ^ -1) >= (var9_int ^ -1)) {
                                    break L87;
                                  } else {
                                    stackOut_224_0 = ((bi) this).field_Q;
                                    stackIn_276_0 = stackOut_224_0;
                                    stackIn_225_0 = stackOut_224_0;
                                    if (var21 != 0) {
                                      break L86;
                                    } else {
                                      L88: {
                                        if (stackIn_225_0[var9_int] == null) {
                                          break L88;
                                        } else {
                                          ((bi) this).field_Q[var9_int].a(true);
                                          if (((bi) this).field_Q[var9_int].field_a == null) {
                                            ((bi) this).field_Q[var9_int] = null;
                                            break L88;
                                          } else {
                                            break L88;
                                          }
                                        }
                                      }
                                      var9_int++;
                                      if (var21 == 0) {
                                        continue L81;
                                      } else {
                                        break L87;
                                      }
                                    }
                                  }
                                }
                                L89: {
                                  if (!((bi) this).field_J) {
                                    ((bi) this).field_k = ((bi) this).field_k - 20;
                                    if (((bi) this).field_d == ig.field_q) {
                                      break L89;
                                    } else {
                                      if (10000 < ((bi) this).field_k) {
                                        break L89;
                                      } else {
                                        if (0 >= ((bi) this).field_k) {
                                          break L89;
                                        } else {
                                          if (-21 >= ((20 + (((bi) this).field_k + -1)) % 1000 ^ -1)) {
                                            break L89;
                                          } else {
                                            th.a(100, th.field_F[20]);
                                            break L89;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L89;
                                  }
                                }
                                L90: {
                                  if (!((bi) this).field_J) {
                                    break L90;
                                  } else {
                                    L91: {
                                      if (((bi) this).field_k <= 0) {
                                        break L91;
                                      } else {
                                        L92: {
                                          var9_int = 300;
                                          if (((bi) this).field_k < var9_int) {
                                            var9_int = ((bi) this).field_k;
                                            break L92;
                                          } else {
                                            break L92;
                                          }
                                        }
                                        ((bi) this).field_k = ((bi) this).field_k - var9_int;
                                        ((bi) this).a((byte) 115, (1 + ((bi) this).field_d.field_s) * var9_int / 100);
                                        if (var21 == 0) {
                                          break L85;
                                        } else {
                                          break L91;
                                        }
                                      }
                                    }
                                    L93: {
                                      L94: {
                                        if (((bi) this).field_d.field_m == null) {
                                          break L94;
                                        } else {
                                          if ((wi.field_a[((bi) this).field_L - -1] ^ -1) == (wi.field_a[((bi) this).field_L] ^ -1)) {
                                            break L93;
                                          } else {
                                            break L94;
                                          }
                                        }
                                      }
                                      ((bi) this).field_A.a(true, wi.field_a[((bi) this).field_L], 8, false);
                                      if (var21 == 0) {
                                        break L85;
                                      } else {
                                        break L93;
                                      }
                                    }
                                    ((bi) this).field_A.a(true, ((bi) this).field_L + 1, 6, false);
                                    if (var21 == 0) {
                                      break L85;
                                    } else {
                                      break L90;
                                    }
                                  }
                                }
                                L95: {
                                  if (ig.field_q == ((bi) this).field_d) {
                                    break L95;
                                  } else {
                                    if (0 < ((bi) this).field_k) {
                                      break L95;
                                    } else {
                                      if (((bi) this).field_k <= -20) {
                                        break L95;
                                      } else {
                                        this.b(12, 1);
                                        th.a(100, th.field_F[21]);
                                        if (var21 == 0) {
                                          break L85;
                                        } else {
                                          break L95;
                                        }
                                      }
                                    }
                                  }
                                }
                                L96: {
                                  if (var8 != 0) {
                                    break L96;
                                  } else {
                                    this.b(12, 0);
                                    if (var21 == 0) {
                                      break L85;
                                    } else {
                                      break L96;
                                    }
                                  }
                                }
                                L97: {
                                  if ((((bi) this).field_c ^ -1) > -1) {
                                    break L97;
                                  } else {
                                    if (0 <= ((bi) this).field_k) {
                                      break L85;
                                    } else {
                                      L98: {
                                        ((bi) this).b(9);
                                        ((bi) this).field_g = true;
                                        if (je.a((byte) 69)) {
                                          break L98;
                                        } else {
                                          L99: {
                                            stackOut_261_0 = ((bi) this).field_A;
                                            stackOut_261_1 = 1;
                                            stackIn_263_0 = stackOut_261_0;
                                            stackIn_263_1 = stackOut_261_1;
                                            stackIn_262_0 = stackOut_261_0;
                                            stackIn_262_1 = stackOut_261_1;
                                            if (0 != ao.field_f) {
                                              stackOut_263_0 = (Torquing) (Object) stackIn_263_0;
                                              stackOut_263_1 = stackIn_263_1;
                                              stackOut_263_2 = 8;
                                              stackIn_264_0 = stackOut_263_0;
                                              stackIn_264_1 = stackOut_263_1;
                                              stackIn_264_2 = stackOut_263_2;
                                              break L99;
                                            } else {
                                              stackOut_262_0 = (Torquing) (Object) stackIn_262_0;
                                              stackOut_262_1 = stackIn_262_1;
                                              stackOut_262_2 = 2;
                                              stackIn_264_0 = stackOut_262_0;
                                              stackIn_264_1 = stackOut_262_1;
                                              stackIn_264_2 = stackOut_262_2;
                                              break L99;
                                            }
                                          }
                                          ((Torquing) (Object) stackIn_264_0).a(stackIn_264_1 != 0, stackIn_264_2, 2, false);
                                          if (var21 == 0) {
                                            break L85;
                                          } else {
                                            break L98;
                                          }
                                        }
                                      }
                                      L100: {
                                        L101: {
                                          if (((bi) this).field_U != 0) {
                                            break L101;
                                          } else {
                                            if (ao.field_f != 0) {
                                              break L101;
                                            } else {
                                              if ((((bi) this).field_L ^ -1) == -1) {
                                                stackOut_270_0 = 0;
                                                stackIn_271_0 = stackOut_270_0;
                                                break L100;
                                              } else {
                                                break L101;
                                              }
                                            }
                                          }
                                        }
                                        stackOut_269_0 = 1;
                                        stackIn_271_0 = stackOut_269_0;
                                        break L100;
                                      }
                                      L102: {
                                        var9_int = stackIn_271_0;
                                        stackOut_271_0 = ((bi) this).field_A;
                                        stackOut_271_1 = 1;
                                        stackIn_273_0 = stackOut_271_0;
                                        stackIn_273_1 = stackOut_271_1;
                                        stackIn_272_0 = stackOut_271_0;
                                        stackIn_272_1 = stackOut_271_1;
                                        if (var9_int == 0) {
                                          stackOut_273_0 = (Torquing) (Object) stackIn_273_0;
                                          stackOut_273_1 = stackIn_273_1;
                                          stackOut_273_2 = 0;
                                          stackIn_274_0 = stackOut_273_0;
                                          stackIn_274_1 = stackOut_273_1;
                                          stackIn_274_2 = stackOut_273_2;
                                          break L102;
                                        } else {
                                          stackOut_272_0 = (Torquing) (Object) stackIn_272_0;
                                          stackOut_272_1 = stackIn_272_1;
                                          stackOut_272_2 = 7;
                                          stackIn_274_0 = stackOut_272_0;
                                          stackIn_274_1 = stackOut_272_1;
                                          stackIn_274_2 = stackOut_272_2;
                                          break L102;
                                        }
                                      }
                                      ((Torquing) (Object) stackIn_274_0).a(stackIn_274_1 != 0, stackIn_274_2, 2, false);
                                      if (var21 == 0) {
                                        break L85;
                                      } else {
                                        break L97;
                                      }
                                    }
                                  }
                                }
                                var9_int = 1;
                                stackOut_275_0 = ((bi) this).field_Q;
                                stackIn_276_0 = stackOut_275_0;
                                break L86;
                              }
                              var29 = stackIn_276_0;
                              var10_ref_kg__ = var29;
                              var11_int = 0;
                              L103: while (true) {
                                L104: {
                                  if ((var29.length ^ -1) >= (var11_int ^ -1)) {
                                    break L104;
                                  } else {
                                    var12 = var29[var11_int];
                                    stackOut_278_0 = null;
                                    stackIn_288_0 = stackOut_278_0;
                                    stackIn_279_0 = stackOut_278_0;
                                    if (var21 != 0) {
                                      break L84;
                                    } else {
                                      L105: {
                                        if (stackIn_279_0 == (Object) (Object) var12) {
                                          break L105;
                                        } else {
                                          var9_int = 0;
                                          break L105;
                                        }
                                      }
                                      var11_int++;
                                      if (var21 == 0) {
                                        continue L103;
                                      } else {
                                        break L104;
                                      }
                                    }
                                  }
                                }
                                if (var9_int != 0) {
                                  this.b(12, 2);
                                  break L85;
                                } else {
                                  break L85;
                                }
                              }
                            }
                            if (((bi) this).field_g) {
                              break L83;
                            } else {
                              if (((bi) this).field_J) {
                                break L83;
                              } else {
                                stackOut_287_0 = null;
                                stackIn_288_0 = stackOut_287_0;
                                break L84;
                              }
                            }
                          }
                          var9 = stackIn_288_0;
                          var10 = 0;
                          L106: while (true) {
                            L107: {
                              L108: {
                                if ((var10 ^ -1) <= (((bi) this).field_D.length ^ -1)) {
                                  break L108;
                                } else {
                                  var11 = ((bi) this).field_D[var10];
                                  stackOut_290_0 = null;
                                  stackOut_290_1 = (tl) var11;
                                  stackIn_302_0 = stackOut_290_0;
                                  stackIn_302_1 = stackOut_290_1;
                                  stackIn_291_0 = stackOut_290_0;
                                  stackIn_291_1 = stackOut_290_1;
                                  if (var21 != 0) {
                                    L109: while (true) {
                                      if (stackIn_302_0 == (Object) (Object) stackIn_302_1) {
                                        break L83;
                                      } else {
                                        ((tl) var9).a((bi) this, 19);
                                        var9 = (Object) (Object) ((tl) var9).field_t;
                                        if (var21 != 0) {
                                          break L82;
                                        } else {
                                          if (var21 == 0) {
                                            stackOut_301_0 = null;
                                            stackOut_301_1 = var9;
                                            stackIn_302_0 = stackOut_301_0;
                                            stackIn_302_1 = (tl) (Object) stackOut_301_1;
                                            continue L109;
                                          } else {
                                            break L107;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L110: {
                                      if (stackIn_291_0 == (Object) (Object) stackIn_291_1) {
                                        break L110;
                                      } else {
                                        if ((var11.field_r ^ -1) == -4) {
                                          break L110;
                                        } else {
                                          L111: {
                                            if (-26 < (var11.field_r ^ -1)) {
                                              break L111;
                                            } else {
                                              if ((var11.field_r ^ -1) < -32) {
                                                break L111;
                                              } else {
                                                if (var21 == 0) {
                                                  break L110;
                                                } else {
                                                  break L111;
                                                }
                                              }
                                            }
                                          }
                                          if (!var11.a(0, ((bi) this).field_P.field_g)) {
                                            break L110;
                                          } else {
                                            var11.field_t = (tl) var9;
                                            var9 = (Object) (Object) var11;
                                            var11.a(80);
                                            ((bi) this).field_D[var10] = null;
                                            break L110;
                                          }
                                        }
                                      }
                                    }
                                    var10++;
                                    if (var21 == 0) {
                                      continue L106;
                                    } else {
                                      break L108;
                                    }
                                  }
                                }
                              }
                              L112: while (true) {
                                stackOut_318_0 = null;
                                stackOut_318_1 = var9;
                                stackIn_316_0 = stackOut_318_0;
                                stackIn_316_1 = stackOut_318_1;
                                if (stackIn_316_0 == stackIn_316_1) {
                                  break L83;
                                } else {
                                  ((tl) var9).a((bi) this, 19);
                                  var9 = (Object) (Object) ((tl) var9).field_t;
                                  if (var21 != 0) {
                                    break L82;
                                  } else {
                                    if (var21 == 0) {
                                      continue L112;
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                              }
                            }
                            break L83;
                          }
                        }
                        L113: {
                          if (jb.field_d != 10) {
                            break L113;
                          } else {
                            if (la.field_k[10].e(17)) {
                              break L113;
                            } else {
                              np.a(la.field_k[((bi) this).field_q], false, 127);
                              break L82;
                            }
                          }
                        }
                        break L82;
                      }
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_u = null;
        field_I = null;
        field_f = null;
        if (param0 != -3) {
            Object var2 = null;
            af discarded$0 = bi.a((sm) null, 58);
        }
    }

    private final void b(int param0, int param1) {
        ((bi) this).b(param0 ^ 5);
        eq.field_b = param1;
        ((bi) this).field_A.a(true, 5, 2, false);
        la.field_k[param0].a(false);
        jh.a(la.field_k[12], param0 ^ 12);
    }

    bi(Torquing param0, int param1) {
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        L0: {
          var5 = Torquing.field_u;
          ((bi) this).field_t = false;
          ((bi) this).field_e = new ei();
          ((bi) this).field_B = new ei();
          ((bi) this).field_E = 1365;
          ((bi) this).field_N = -17;
          ((bi) this).field_S = -1878996731;
          ((bi) this).field_L = 0;
          ((bi) this).field_H = 80;
          ((bi) this).field_w = false;
          ((bi) this).field_F = 68616224;
          ((bi) this).field_G = 0;
          ((bi) this).field_i = tp.field_a;
          ((bi) this).field_n = 0;
          ((bi) this).field_v = 0;
          ((bi) this).field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
          ((bi) this).field_Q = new kg[1];
          ((bi) this).field_c = 0;
          ((bi) this).field_b = new int[qc.field_ab.length];
          ((bi) this).field_z = 0;
          ((bi) this).field_J = false;
          ((bi) this).field_o = 50456792;
          ((bi) this).field_A = param0;
          dd.field_d = 0;
          ao.field_f = 0;
          ((bi) this).field_M = -1046390103;
          ((bi) this).field_G = ((bi) this).field_G + (param1 + (param1 << -954880442));
          ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_N * ((param1 << -1531723610) + param1);
          ((bi) this).field_l = -547216422;
          ((bi) this).field_j = 538264946;
          ((bi) this).field_L = param1;
          if (null != gj.field_i) {
            break L0;
          } else {
            gj.field_i = new int[12];
            int[] discarded$6 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((bi) this).field_T != null) {
              break L2;
            } else {
              var6 = new StringBuilder(104);
              var3 = var6;
              var4 = 0;
              L3: while (true) {
                L4: {
                  if ((var4 ^ -1) <= -9) {
                    break L4;
                  } else {
                    StringBuilder discarded$7 = var3.append("<col=ffffff>");
                    StringBuilder discarded$8 = var3.append(fh.field_s.charAt(var4));
                    var4++;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((bi) this).field_T = var6.toString();
                break L2;
              }
            }
          }
          ((bi) this).field_d = ol.field_f[param1];
          ((bi) this).field_q = 1 + wi.field_a[param1];
          ((bi) this).field_P = new vg();
          this.h(104);
          vl.field_c = null;
          gn.field_l = null;
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
