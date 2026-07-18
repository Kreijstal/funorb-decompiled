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
        RuntimeException var2 = null;
        tl[] var2_array = null;
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
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_20_0 = 0;
        kh stackIn_23_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        kh stackIn_41_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_19_0 = 0;
        kh stackOut_22_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        kh stackOut_40_0 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            fd.a(-109);
            re.field_d[1] = 80.0;
            ((bi) this).field_x = 0;
            re.field_d[0] = 0.0;
            var2_array = ((bi) this).field_d.field_q;
            ((bi) this).field_D = new tl[var2_array.length];
            dk.a((Object[]) (Object) var2_array, 0, (Object[]) (Object) ((bi) this).field_D, 0, ((bi) this).field_D.length);
            var3 = 0;
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_int <= ~((bi) this).field_D.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((bi) this).field_D[var4_int].f(25468);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var3++;
                          break L4;
                        }
                      }
                      var4_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((bi) this).field_m = new int[var3];
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              var4_int = stackIn_10_0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (var4_int >= ((bi) this).field_D.length) {
                      break L7;
                    } else {
                      stackOut_12_0 = ((bi) this).field_D[var4_int].f(25468);
                      stackIn_20_0 = stackOut_12_0 ? 1 : 0;
                      stackIn_13_0 = stackOut_12_0;
                      if (var9 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (!stackIn_13_0) {
                            break L8;
                          } else {
                            var3--;
                            ((bi) this).field_m[var3] = var4_int;
                            break L8;
                          }
                        }
                        var4_int++;
                        if (var9 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  ((bi) this).field_C = ((bi) this).field_P.a(-63, ((bi) this).field_d);
                  ((bi) this).field_P.b(0, ((bi) this).field_i);
                  stackOut_19_0 = 12;
                  stackIn_20_0 = stackOut_19_0;
                  break L6;
                }
                int[] array$1 = new int[stackIn_20_0];
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
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var7 >= var6_ref_kh__.length) {
                        break L11;
                      } else {
                        var8 = var6_ref_kh__[var7];
                        stackOut_22_0 = (kh) var8;
                        stackIn_41_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var9 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (stackIn_23_0 != null) {
                              ((bi) this).field_C.a(var8, var4);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          var7++;
                          if (var9 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    var5_int = 0;
                    L13: while (true) {
                      L14: {
                        L15: {
                          if (var5_int >= ((bi) this).field_C.field_y) {
                            break L15;
                          } else {
                            ((bi) this).field_C.a(var5_int, 80, 1365, -1, -12, 12);
                            var5_int++;
                            if (var9 != 0) {
                              break L14;
                            } else {
                              if (var9 == 0) {
                                continue L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                        this.a(false, 0);
                        ((bi) this).field_w = false;
                        ((bi) this).field_T = ki.a("ff9040", "ffffff", 93, ((bi) this).field_T);
                        ((bi) this).field_z = 0;
                        ((bi) this).field_k = ((bi) this).field_d.a(-31648);
                        ((bi) this).field_r = 3000;
                        ((bi) this).field_c = 0;
                        ((bi) this).field_v = ((bi) this).field_d.a(false);
                        int[] discarded$2 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                        break L14;
                      }
                      L16: {
                        stackOut_36_0 = this;
                        stackIn_39_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (((bi) this).field_L != 18) {
                          stackOut_39_0 = this;
                          stackOut_39_1 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          break L16;
                        } else {
                          stackOut_37_0 = this;
                          stackOut_37_1 = 1;
                          stackIn_40_0 = stackOut_37_0;
                          stackIn_40_1 = stackOut_37_1;
                          break L16;
                        }
                      }
                      ((bi) this).field_y = stackIn_40_1 != 0;
                      ((bi) this).field_J = false;
                      ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                      ((bi) this).field_K = -1.0;
                      stackOut_40_0 = ((bi) this).field_d.a(-100, false);
                      stackIn_41_0 = stackOut_40_0;
                      break L10;
                    }
                  }
                  var5 = stackIn_41_0.field_k;
                  var6 = var5.field_k + -1;
                  L17: while (true) {
                    L18: {
                      L19: {
                        if (var6 < 0) {
                          break L19;
                        } else {
                          if (var9 != 0) {
                            break L18;
                          } else {
                            L20: {
                              if (((bi) this).field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                                ((bi) this).field_h = re.field_d[1] * (double)var5.field_y[var6];
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            var6--;
                            if (var9 == 0) {
                              continue L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      break L18;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.Q(" + param0 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        qk var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        tl[] var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                var2_ref = new qk(0, ((bi) this).field_L, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
                if (!je.a((byte) 77)) {
                  break L2;
                } else {
                  bo.field_l.a((byte) 54, (q) (Object) var2_ref);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              le.a((byte) 83, 5, var2_ref);
              break L1;
            }
            L3: {
              if (1 + ((bi) this).field_L > nh.field_k) {
                nh.field_k = ((bi) this).field_L - -1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (wi.field_a.length - 1 == ((bi) this).field_L) {
                  break L5;
                } else {
                  if (~wi.field_a[((bi) this).field_L + 1] == ~wi.field_a[((bi) this).field_L]) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_15_0 = 1;
              stackIn_18_0 = stackOut_15_0;
              break L4;
            }
            L6: {
              var3 = stackIn_18_0;
              var4 = wi.field_a[((bi) this).field_L];
              if (var3 == 0) {
                break L6;
              } else {
                L7: {
                  L8: {
                    if (var4 == 1) {
                      break L8;
                    } else {
                      L9: {
                        if (var4 == 2) {
                          break L9;
                        } else {
                          L10: {
                            if (var4 != 4) {
                              break L10;
                            } else {
                              this.a(2, (byte) 78, 253);
                              if (var9 == 0) {
                                break L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if (7 != var4) {
                            break L7;
                          } else {
                            this.a(3, (byte) 125, 252);
                            if (var9 == 0) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      this.a(1, (byte) 9, 254);
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  this.a(0, (byte) 83, 255);
                  break L7;
                }
                L11: {
                  var5_int = ((bi) this).field_G & 63;
                  if (var4 <= 0) {
                    break L11;
                  } else {
                    L12: {
                      if (var4 > wi.field_a[var5_int]) {
                        break L12;
                      } else {
                        if (hg.field_d[var5_int] == 0) {
                          break L12;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.a(4, (byte) 118, 251);
                    break L11;
                  }
                }
                if (0 == var5_int) {
                  L13: {
                    if (var4 != 2) {
                      break L13;
                    } else {
                      this.a(5, (byte) 71, 250);
                      if (var9 == 0) {
                        break L6;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var4 == 4) {
                      break L14;
                    } else {
                      if (var4 != 7) {
                        break L6;
                      } else {
                        this.a(7, (byte) 112, 248);
                        if (-1 == ((bi) this).field_T.indexOf("ffffff")) {
                          this.a(13, (byte) 25, 242);
                          if (var9 == 0) {
                            break L6;
                          } else {
                            break L14;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  this.a(6, (byte) 6, 249);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L15: {
              if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
                break L15;
              } else {
                if (((bi) this).field_T.indexOf("ffffff") == -1) {
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
            var5 = ((bi) this).field_d.field_q;
            var6 = 0;
            L16: while (true) {
              L17: {
                L18: {
                  if (((bi) this).field_D.length <= var6) {
                    break L18;
                  } else {
                    if (var9 != 0) {
                      break L17;
                    } else {
                      L19: {
                        if (null != ((bi) this).field_D[var6]) {
                          break L19;
                        } else {
                          if (var5[var6].field_r == 0) {
                            break L19;
                          } else {
                            if (var5[var6].field_r == 7) {
                              break L19;
                            } else {
                              ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                              ((bi) this).field_G = ((bi) this).field_G + 4096;
                              ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 114136940);
                              break L19;
                            }
                          }
                        }
                      }
                      var6++;
                      if (var9 == 0) {
                        continue L16;
                      } else {
                        break L18;
                      }
                    }
                  }
                }
                L20: {
                  if (var3 == 0) {
                    break L20;
                  } else {
                    L21: {
                      if (var4 == 1) {
                        break L21;
                      } else {
                        if (var4 == 3) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    L22: while (true) {
                      L23: {
                        L24: {
                          L25: {
                            if (var4 < var8) {
                              break L25;
                            } else {
                              var7 = var7 + mh.field_k[var4];
                              var6 = var6 + ((bi) this).field_b[var4];
                              var8++;
                              if (var9 != 0) {
                                break L24;
                              } else {
                                if (var9 == 0) {
                                  continue L22;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          if (var6 >= var7 * 8 / 10) {
                            break L24;
                          } else {
                            break L23;
                          }
                        }
                        L26: {
                          if (1 != var4) {
                            break L26;
                          } else {
                            this.a(8, (byte) 33, 247);
                            if (var9 == 0) {
                              break L23;
                            } else {
                              break L26;
                            }
                          }
                        }
                        this.a(10, (byte) 13, 245);
                        break L23;
                      }
                      if (var7 == var6) {
                        L27: {
                          if (var4 != 1) {
                            break L27;
                          } else {
                            this.a(9, (byte) 23, 246);
                            if (var9 == 0) {
                              break L20;
                            } else {
                              break L27;
                            }
                          }
                        }
                        this.a(11, (byte) 24, 244);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                }
                dd.field_d = dd.field_d | ((bi) this).field_z;
                break L17;
              }
              L28: {
                if (dd.field_d == 255) {
                  L29: {
                    if (!ia.a(-22426, 0)) {
                      break L29;
                    } else {
                      this.a(16, (byte) 11, 239);
                      if (var9 == 0) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  this.a(15, (byte) 30, 240);
                  break L28;
                } else {
                  break L28;
                }
              }
              if (param0 >= 25) {
                L30: {
                  if (wp.field_w > 0) {
                    break L30;
                  } else {
                    if (qc.field_ab.length <= 1) {
                      break L30;
                    } else {
                      if (~(qc.field_ab[1] + qc.field_ab[0]) < ~nh.field_k) {
                        break L30;
                      } else {
                        nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                        break L30;
                      }
                    }
                  }
                }
                ((bi) this).field_J = true;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.T(" + param0 + ')');
        }
    }

    final void e(int param0) {
        try {
            ((bi) this).field_w = true;
            if (param0 != -7045) {
                bi.a((java.applet.Applet) null, (byte) -76);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.N(" + param0 + ')');
        }
    }

    final void b(byte param0, int param1) {
        try {
            ((bi) this).field_k = ((bi) this).field_k + param1;
            if (param0 < 120) {
                ((bi) this).field_k = -84;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        ti[] var2_array = null;
        tl[] var2_array2 = null;
        int var2_int = 0;
        int var3 = 0;
        ti var4 = null;
        tl var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                ((bi) this).field_e.a(0);
                if (null == ((bi) this).field_d.field_k) {
                  break L2;
                } else {
                  var2_array = ((bi) this).field_d.field_k;
                  var3 = 0;
                  L3: while (true) {
                    if (~var3 <= ~var2_array.length) {
                      break L2;
                    } else {
                      var4 = var2_array[var3];
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (var4 != null) {
                            var4.b((byte) 62);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              if (param0 == 1) {
                break L1;
              } else {
                return;
              }
            }
            var2_array2 = ((bi) this).field_d.field_q;
            var3 = 0;
            L5: while (true) {
              L6: {
                L7: {
                  L8: {
                    if (var2_array2.length <= var3) {
                      break L8;
                    } else {
                      var4_ref = var2_array2[var3];
                      var4_ref.field_c = -1;
                      var4_ref.field_h = null;
                      var3++;
                      if (var5 != 0) {
                        break L7;
                      } else {
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (((bi) this).field_d.field_m != null) {
                      break L9;
                    } else {
                      ((bi) this).b(param0 ^ 8);
                      ((bi) this).field_g = true;
                      ((bi) this).field_q = 9;
                      ((bi) this).field_d = ig.field_q;
                      la.field_k[9].a(true);
                      this.h(-83);
                      ((bi) this).field_r = 0;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((bi) this).field_d = ((bi) this).field_d.field_m;
                  ((bi) this).field_G = ((bi) this).field_G + 64;
                  ((bi) this).field_L = ((bi) this).field_L + 1;
                  ((bi) this).field_F = ((bi) this).field_F + (((bi) this).field_N << -961057594);
                  break L7;
                }
                L10: {
                  var2_int = wi.field_a[((bi) this).field_L];
                  if (~(1 + var2_int) != ~((bi) this).field_q) {
                    ((bi) this).field_i = tp.field_a;
                    ((bi) this).field_q = var2_int + 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (ri.field_E < 2) {
                      break L12;
                    } else {
                      if (!la.field_k[((bi) this).field_q].e(17)) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  la.field_k[((bi) this).field_q].g();
                  break L11;
                }
                this.h(67);
                break L6;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.O(" + param0 + ')');
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -94 / ((23 - param1) / 43);
            stackOut_0_0 = new di(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bi.B(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
        return (af) (Object) stackIn_1_0;
    }

    final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        StringBuilder var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new StringBuilder(((bi) this).field_T);
              StringBuilder discarded$2 = gd.a(-20980, var3, (CharSequence) (Object) "ff9040", 5 + 13 * param0);
              ((bi) this).field_T = var3.toString();
              if (param1 < -26) {
                break L1;
              } else {
                ((bi) this).field_Q = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((bi) this).field_T.indexOf("ffffff") != -1) {
                  break L3;
                } else {
                  th.a(100, th.field_F[18]);
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              th.a(100, th.field_F[17]);
              break L2;
            }
            th.a(100, th.field_F[19]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "bi.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        try {
            int var2_int = -38 % ((param0 - 62) / 48);
            ((bi) this).field_x = Math.max(10, ((bi) this).field_x);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.U(" + param0 + ')');
        }
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -68) {
                break L1;
              } else {
                ((bi) this).b((byte) 62);
                break L1;
              }
            }
            ((bi) this).field_H = param3;
            ((bi) this).field_E = param2;
            ((bi) this).field_P.b(0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("bi.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg[] stackIn_4_0 = null;
        kg[] stackIn_16_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        kg[] stackOut_3_0 = null;
        kg[] stackOut_15_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var5 = new kg(param2, param3, param1);
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((bi) this).field_Q.length >= ~var6) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((bi) this).field_Q;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0[var6] == null) {
                          break L4;
                        } else {
                          if (((bi) this).field_Q[var6].field_a == null) {
                            break L4;
                          } else {
                            var6++;
                            if (var8 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      ((bi) this).field_Q[var6] = var5;
                      return;
                    }
                  }
                }
                var6 = ((bi) this).field_Q.length;
                stackOut_15_0 = new kg[var6 - -1];
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              L5: {
                var7 = stackIn_16_0;
                dk.a((Object[]) (Object) ((bi) this).field_Q, 0, (Object[]) (Object) var7, 0, var6);
                if (param0 == 538) {
                  break L5;
                } else {
                  ((bi) this).field_L = -15;
                  break L5;
                }
              }
              var7[var6] = var5;
              ((bi) this).field_Q = var7;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("bi.J(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param3 + ')');
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        Torquing stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Torquing stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Torquing stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Torquing stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Torquing stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Torquing stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Torquing stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        Torquing stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Torquing stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Torquing stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Torquing stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Torquing stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Torquing stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Torquing stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -103) {
                break L1;
              } else {
                af discarded$2 = bi.a((sm) null, -1);
                break L1;
              }
            }
            L2: {
              L3: {
                ((bi) this).b(9);
                ((bi) this).field_g = true;
                if (!je.a((byte) 77)) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (((bi) this).field_U != 0) {
                        break L5;
                      } else {
                        if (ao.field_f != 0) {
                          break L5;
                        } else {
                          if (((bi) this).field_L == 0) {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_13_0 = 1;
                    stackIn_16_0 = stackOut_13_0;
                    break L4;
                  }
                  L6: {
                    var2_int = stackIn_16_0;
                    stackOut_16_0 = ((bi) this).field_A;
                    stackOut_16_1 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (var2_int == 0) {
                      stackOut_19_0 = (Torquing) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L6;
                    } else {
                      stackOut_17_0 = (Torquing) (Object) stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = 7;
                      stackIn_20_0 = stackOut_17_0;
                      stackIn_20_1 = stackOut_17_1;
                      stackIn_20_2 = stackOut_17_2;
                      break L6;
                    }
                  }
                  ((Torquing) (Object) stackIn_20_0).a(stackIn_20_1 != 0, stackIn_20_2, 1, false);
                  if (Torquing.field_u == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                stackOut_21_0 = ((bi) this).field_A;
                stackOut_21_1 = 1;
                stackIn_26_0 = stackOut_21_0;
                stackIn_26_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (ao.field_f == 0) {
                  stackOut_26_0 = (Torquing) (Object) stackIn_26_0;
                  stackOut_26_1 = stackIn_26_1;
                  stackOut_26_2 = 2;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L7;
                } else {
                  stackOut_22_0 = (Torquing) (Object) stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackOut_24_0 = (Torquing) (Object) stackIn_24_0;
                  stackOut_24_1 = stackIn_24_1;
                  stackOut_24_2 = 8;
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_27_1 = stackOut_24_1;
                  stackIn_27_2 = stackOut_24_2;
                  break L7;
                }
              }
              ((Torquing) (Object) stackIn_27_0).a(stackIn_27_1 != 0, stackIn_27_2, 1, false);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.G(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        pj var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3 = ((bi) this).field_D;
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                ((bi) this).field_v = 112;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4 <= ~var3.length) {
                    break L4;
                  } else {
                    var5 = var3[var4];
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null == var5) {
                          break L5;
                        } else {
                          if (31 == var5.field_r) {
                            var6 = var5.d(-2).field_k;
                            gq.a(var6.field_f, 4, param1);
                            gq.a(var6.field_s, 4, param1);
                            gq.a(var6.field_l, 4, param1);
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "bi.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final static we a(fj param0, byte param1) {
        RuntimeException var2 = null;
        we stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                bi.a((java.applet.Applet) null, (byte) 44);
                break L1;
              }
            }
            stackOut_3_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("bi.BA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 77) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              if (qm.a(param1, (byte) 45) == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("bi.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (((bi) this).field_T.indexOf("ffffff") != -1) {
                break L1;
              } else {
                if (((bi) this).field_T.indexOf("ff9040") == -1) {
                  param1 = param1 * 2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              ((bi) this).field_j = ((bi) this).field_j - param1;
              ((bi) this).field_U = ((bi) this).field_U + param1;
              ((bi) this).field_s = ((bi) this).field_U;
              if (param0 >= 94) {
                break L2;
              } else {
                this.a(91, -43, (sg) null, 50);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3, "bi.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        RuntimeException var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((bi) this).field_c < param5) {
                  break L2;
                } else {
                  int fieldTemp$2 = ((bi) this).field_c - 1;
                  ((bi) this).field_c = ((bi) this).field_c - 1;
                  if (fieldTemp$2 >= 0) {
                    break L2;
                  } else {
                    ((bi) this).field_P.a(param5 + 80);
                    this.a(538, 16, param3, ((bi) this).field_P.field_c);
                    th.a(param5 ^ 100, th.field_F[14]);
                    th.a(100, th.field_F[15]);
                    if (Torquing.field_u == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              th.a(100, th.field_F[16]);
              break L1;
            }
            ((bi) this).field_P.a(param1, param4, param5 + 1, param2);
            this.a(538, 0, param3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var10;
            stackOut_11_1 = new StringBuilder().append("bi.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        try {
            ((bi) this).field_c = ((bi) this).field_c + 1;
            if (param0 != 0) {
                ((bi) this).field_z = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.K(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1000) {
                break L1;
              } else {
                ((bi) this).field_G = 31;
                break L1;
              }
            }
            L2: {
              ((bi) this).field_i = tp.field_a;
              ((bi) this).field_c = 0;
              ((bi) this).a((byte) -68, tp.field_a, 1365, 80);
              ((bi) this).field_j = ((bi) this).field_j + ((bi) this).field_U;
              if (ri.field_E < 2) {
                var2_int = ((bi) this).field_G & 63;
                ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_L - var2_int) * ((bi) this).field_N;
                ((bi) this).field_G = ((bi) this).field_G + (((bi) this).field_L + -var2_int);
                break L2;
              } else {
                break L2;
              }
            }
            ((bi) this).field_U = 0;
            this.h(-116);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.R(" + param0 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        bm var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (ri.field_E < 2) {
                  break L2;
                } else {
                  if (!((bi) this).field_t) {
                    break L2;
                  } else {
                    ((bi) this).field_M = 779830527;
                    ((bi) this).field_j = -((bi) this).field_U + 318907172;
                    ((bi) this).field_o = 1086213241;
                    ((bi) this).field_t = false;
                    ((bi) this).field_l = 2121488289;
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (0 >= ((bi) this).field_U) {
                break L1;
              } else {
                if (gn.field_l != null) {
                  break L1;
                } else {
                  L3: {
                    if (((bi) this).field_U <= 0) {
                      break L3;
                    } else {
                      if (!je.a((byte) 85)) {
                        L4: {
                          var2_ref = vl.field_c;
                          if (null == var2_ref) {
                            break L4;
                          } else {
                            if (null == var2_ref.field_p) {
                              break L4;
                            } else {
                              if (!bn.a(var2_ref.field_p[1][9], -17310)) {
                                break L4;
                              } else {
                                if (~var2_ref.field_n[1][9] >= ~((bi) this).field_U) {
                                  break L4;
                                } else {
                                  gn.field_l = new wc(11, 65524, ((bi) this).field_M, ((bi) this).field_o, ((bi) this).field_l, ((bi) this).field_j, new int[1]);
                                  if (var3 == 0) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                        vl.field_c = null;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L5: {
              if (param0 == 9) {
                break L5;
              } else {
                field_f = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.P(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        qp var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                af discarded$2 = bi.a((sm) null, 34);
                break L1;
              }
            }
            var4_int = 1 << param0;
            if ((var4_int & fa.field_b) != 0) {
              return;
            } else {
              L2: {
                ao.field_f = ao.field_f | var4_int;
                fa.field_b = fa.field_b | var4_int;
                ((bi) this).field_B.a((byte) 54, (q) (Object) new tj(param0));
                if (!((bi) this).field_t) {
                  L3: {
                    var5 = new qp(param0, param2, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
                    if (je.a((byte) 61)) {
                      break L3;
                    } else {
                      wc.a(var5, (byte) 99, 4);
                      if (Torquing.field_u == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jh.field_y.a((byte) 54, (q) (Object) var5);
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var4, "bi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 121) {
                break L1;
              } else {
                ((bi) this).a(-53);
                break L1;
              }
            }
            ((bi) this).field_P.e(66);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.S(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var3 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2_int = 35 % ((param1 - -53) / 50);
                    var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("bi.A(");
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        kh var3_ref_kh = null;
        sb var3_ref_sb = null;
        String var3_ref_String = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        vn stackIn_94_0 = null;
        String stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        vn stackIn_96_0 = null;
        String stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        vn stackIn_97_0 = null;
        String stackIn_97_1 = null;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_93_0 = null;
        String stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        vn stackOut_96_0 = null;
        String stackOut_96_1 = null;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        vn stackOut_94_0 = null;
        String stackOut_94_1 = null;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (((bi) this).field_c >= 0) {
                break L1;
              } else {
                if (((bi) this).field_c != -2147483648) {
                  ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
                  ((bi) this).field_c = -2147483648;
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                L4: {
                  var2_int = ((bi) this).field_q - 1;
                  if (var2_int < 0) {
                    break L4;
                  } else {
                    if (var2_int < 8) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                gm.field_r[7].b(0, 0);
                if (var8 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L5: {
                L6: {
                  if (1 != ((bi) this).field_d.a(false)) {
                    break L6;
                  } else {
                    if (null != hi.field_h[var2_int]) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                gm.field_r[var2_int].b(0, 0);
                if (var8 == 0) {
                  break L2;
                } else {
                  break L5;
                }
              }
              hi.field_h[var2_int].b(0, 0);
              break L2;
            }
            L7: {
              L8: {
                if (((bi) this).field_K < 0.0) {
                  break L8;
                } else {
                  if (ce.field_b) {
                    break L7;
                  } else {
                    gj.field_i[1] = (int)((double)gj.field_i[1] + ((bi) this).field_K);
                    if (var8 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              ((bi) this).field_P.a(true, gj.field_i);
              var3 = vf.field_j[((bi) this).field_v][0];
              var4 = vf.field_j[((bi) this).field_v][1];
              var5_int = vf.field_j[((bi) this).field_v][2];
              gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> -207182928);
              gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 2033481328);
              gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 200640624);
              break L7;
            }
            L9: {
              ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
              if (((bi) this).field_J) {
                break L9;
              } else {
                if (((bi) this).field_c < 0) {
                  break L9;
                } else {
                  ((bi) this).field_P.b(1);
                  break L9;
                }
              }
            }
            var3_ref_int__ = ((bi) this).field_m;
            var4 = 0;
            L10: while (true) {
              L11: {
                L12: {
                  if (~var3_ref_int__.length >= ~var4) {
                    break L12;
                  } else {
                    var5_int = var3_ref_int__[var4];
                    if (var8 != 0) {
                      break L11;
                    } else {
                      L13: {
                        if (null != ((bi) this).field_D[var5_int]) {
                          ((bi) this).field_D[var5_int].b(1);
                          ((bi) this).field_C.a(((bi) this).field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                sg.a(((bi) this).field_C.field_g[((bi) this).field_P.field_c], 80, 1365, -1, -12, 12);
                sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
                break L11;
              }
              L14: {
                if (!param0) {
                  break L14;
                } else {
                  ((bi) this).e(14);
                  break L14;
                }
              }
              sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
              var3_ref_kh = (kh) (Object) on.field_e.c((byte) -122);
              L15: while (true) {
                L16: {
                  L17: {
                    if (var3_ref_kh == null) {
                      break L17;
                    } else {
                      sg.a(var3_ref_kh, 80, 1365, -1, -12, 12);
                      var3_ref_kh = (kh) (Object) on.field_e.b((byte) -110);
                      if (var8 != 0) {
                        break L16;
                      } else {
                        if (var8 == 0) {
                          continue L15;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  var3 = 9;
                  L18: while (true) {
                    L19: {
                      L20: {
                        if (var3 > 16) {
                          break L20;
                        } else {
                          sg discarded$1 = ((bi) this).field_C;
                          sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                          var3++;
                          if (var8 != 0) {
                            break L19;
                          } else {
                            if (var8 == 0) {
                              continue L18;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      ((bi) this).field_C.a(gj.field_i);
                      break L19;
                    }
                    var3_ref_sb = (sb) (Object) ((bi) this).field_e.b(0);
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (var3_ref_sb == null) {
                            break L23;
                          } else {
                            var3_ref_sb.c(-103);
                            var3_ref_sb = (sb) (Object) ((bi) this).field_e.f(-24059);
                            if (var8 != 0) {
                              break L22;
                            } else {
                              if (var8 == 0) {
                                continue L21;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        if (!ti.field_k) {
                          bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                          break L22;
                        } else {
                          break L16;
                        }
                      }
                      L24: {
                        var3_ref_String = wh.a(((bi) this).field_k, (byte) -119);
                        if (((bi) this).field_d == ig.field_q) {
                          break L24;
                        } else {
                          dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
                          if (10000 <= ((bi) this).field_k) {
                            break L24;
                          } else {
                            if (((bi) this).field_J) {
                              break L24;
                            } else {
                              L25: {
                                if (((bi) this).field_v == 0) {
                                  break L25;
                                } else {
                                  dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                                  if (var8 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                              break L24;
                            }
                          }
                        }
                      }
                      L26: {
                        stackOut_93_0 = dd.field_c;
                        stackOut_93_1 = Integer.toString(Math.abs(((bi) this).field_U));
                        stackOut_93_2 = 628;
                        stackOut_93_3 = 67;
                        stackIn_96_0 = stackOut_93_0;
                        stackIn_96_1 = stackOut_93_1;
                        stackIn_96_2 = stackOut_93_2;
                        stackIn_96_3 = stackOut_93_3;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        stackIn_94_2 = stackOut_93_2;
                        stackIn_94_3 = stackOut_93_3;
                        if (!((bi) this).field_t) {
                          stackOut_96_0 = (vn) (Object) stackIn_96_0;
                          stackOut_96_1 = (String) (Object) stackIn_96_1;
                          stackOut_96_2 = stackIn_96_2;
                          stackOut_96_3 = stackIn_96_3;
                          stackOut_96_4 = 16711680;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          stackIn_97_2 = stackOut_96_2;
                          stackIn_97_3 = stackOut_96_3;
                          stackIn_97_4 = stackOut_96_4;
                          break L26;
                        } else {
                          stackOut_94_0 = (vn) (Object) stackIn_94_0;
                          stackOut_94_1 = (String) (Object) stackIn_94_1;
                          stackOut_94_2 = stackIn_94_2;
                          stackOut_94_3 = stackIn_94_3;
                          stackOut_94_4 = 16776960;
                          stackIn_97_0 = stackOut_94_0;
                          stackIn_97_1 = stackOut_94_1;
                          stackIn_97_2 = stackOut_94_2;
                          stackIn_97_3 = stackOut_94_3;
                          stackIn_97_4 = stackOut_94_4;
                          break L26;
                        }
                      }
                      ((vn) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2, stackIn_97_3, stackIn_97_4, -1);
                      var4 = 0;
                      var5_int = 528;
                      L27: while (true) {
                        L28: {
                          L29: {
                            L30: {
                              L31: {
                                if (8 <= var4) {
                                  break L31;
                                } else {
                                  stackOut_99_0 = -1;
                                  stackOut_99_1 = ~(dd.field_d >> var4 & 1);
                                  stackIn_117_0 = stackOut_99_0;
                                  stackIn_117_1 = stackOut_99_1;
                                  stackIn_100_0 = stackOut_99_0;
                                  stackIn_100_1 = stackOut_99_1;
                                  if (var8 != 0) {
                                    L32: while (true) {
                                      if (stackIn_117_0 >= stackIn_117_1) {
                                        break L29;
                                      } else {
                                        kk.field_n.d(583 - -(var4 * 8), 143);
                                        var4++;
                                        if (var8 != 0) {
                                          break L28;
                                        } else {
                                          if (var8 == 0) {
                                            stackOut_116_0 = ~((bi) this).field_c;
                                            stackOut_116_1 = ~var4;
                                            stackIn_117_0 = stackOut_116_0;
                                            stackIn_117_1 = stackOut_116_1;
                                            continue L32;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L33: {
                                      L34: {
                                        L35: {
                                          if (stackIn_100_0 != stackIn_100_1) {
                                            break L35;
                                          } else {
                                            if ((1 & ((bi) this).field_z >> var4) == 0) {
                                              break L34;
                                            } else {
                                              if (((bi) this).field_k % 1000 >= 500) {
                                                break L34;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                        ue.field_c[var4].e(var5_int, 118, 162);
                                        if (var8 == 0) {
                                          break L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                                      ue.field_c[var4 + 8].e(var5_int, 118, 81);
                                      break L33;
                                    }
                                    var5_int = var5_int + ue.field_c[var4].field_w;
                                    var4++;
                                    if (var8 == 0) {
                                      continue L27;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                              }
                              var4 = 0;
                              L36: while (true) {
                                stackOut_116_0 = ~((bi) this).field_c;
                                stackOut_116_1 = ~var4;
                                stackIn_117_0 = stackOut_116_0;
                                stackIn_117_1 = stackOut_116_1;
                                if (stackIn_117_0 >= stackIn_117_1) {
                                  break L29;
                                } else {
                                  kk.field_n.d(583 - -(var4 * 8), 143);
                                  var4++;
                                  if (var8 != 0) {
                                    break L28;
                                  } else {
                                    if (var8 == 0) {
                                      continue L36;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                              }
                            }
                            break L29;
                          }
                          if (!((bi) this).field_w) {
                            break L28;
                          } else {
                            ia.field_f.d(553, 143);
                            break L28;
                          }
                        }
                        dd.field_c.b(((bi) this).field_T, 538, 102, 16711680, -1);
                        break L16;
                      }
                    }
                  }
                }
                L37: {
                  if (((bi) this).field_r <= 0) {
                    break L37;
                  } else {
                    var3 = (((bi) this).field_r - 1) / 1000;
                    var4 = -(1000 * var3) + ((bi) this).field_r;
                    var5 = hq.field_h[var3];
                    var6 = var4 * var5.field_s / 1000;
                    var7 = var5.field_t * var4 / 1000;
                    var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                    break L37;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.H(" + param0 + ')');
        }
    }

    final void i(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        sb var7 = null;
        double[] var7_array = null;
        ed var7_ref = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        Object var9 = null;
        double var9_double = 0.0;
        kh var10_ref_kh = null;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        kg[] var10_ref_kg__ = null;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        double var14_double = 0.0;
        tl var14 = null;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        int stackIn_16_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_204_0 = 0;
        double stackIn_311_0 = 0.0;
        vg stackIn_319_0 = null;
        double[] stackIn_319_1 = null;
        int stackIn_319_2 = 0;
        double stackIn_319_3 = 0.0;
        int stackIn_319_4 = 0;
        int stackIn_319_5 = 0;
        vg stackIn_321_0 = null;
        double[] stackIn_321_1 = null;
        int stackIn_321_2 = 0;
        double stackIn_321_3 = 0.0;
        int stackIn_321_4 = 0;
        int stackIn_321_5 = 0;
        vg stackIn_322_0 = null;
        double[] stackIn_322_1 = null;
        int stackIn_322_2 = 0;
        double stackIn_322_3 = 0.0;
        int stackIn_322_4 = 0;
        int stackIn_322_5 = 0;
        int stackIn_322_6 = 0;
        int stackIn_343_0 = 0;
        kg[] stackIn_372_0 = null;
        Torquing stackIn_446_0 = null;
        int stackIn_446_1 = 0;
        Torquing stackIn_448_0 = null;
        int stackIn_448_1 = 0;
        Torquing stackIn_450_0 = null;
        int stackIn_450_1 = 0;
        Torquing stackIn_451_0 = null;
        int stackIn_451_1 = 0;
        int stackIn_451_2 = 0;
        int stackIn_464_0 = 0;
        Torquing stackIn_465_0 = null;
        int stackIn_465_1 = 0;
        Torquing stackIn_467_0 = null;
        int stackIn_467_1 = 0;
        Torquing stackIn_468_0 = null;
        int stackIn_468_1 = 0;
        int stackIn_468_2 = 0;
        kg[] stackIn_470_0 = null;
        Object stackIn_473_0 = null;
        Object stackIn_488_0 = null;
        Object stackIn_491_0 = null;
        tl stackIn_491_1 = null;
        Object stackIn_512_0 = null;
        tl stackIn_512_1 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_203_0 = 0;
        vg stackOut_318_0 = null;
        double[] stackOut_318_1 = null;
        int stackOut_318_2 = 0;
        double stackOut_318_3 = 0.0;
        int stackOut_318_4 = 0;
        int stackOut_318_5 = 0;
        vg stackOut_321_0 = null;
        double[] stackOut_321_1 = null;
        int stackOut_321_2 = 0;
        double stackOut_321_3 = 0.0;
        int stackOut_321_4 = 0;
        int stackOut_321_5 = 0;
        int stackOut_321_6 = 0;
        vg stackOut_319_0 = null;
        double[] stackOut_319_1 = null;
        int stackOut_319_2 = 0;
        double stackOut_319_3 = 0.0;
        int stackOut_319_4 = 0;
        int stackOut_319_5 = 0;
        int stackOut_319_6 = 0;
        int stackOut_342_0 = 0;
        int stackOut_340_0 = 0;
        double stackOut_310_0 = 0.0;
        double stackOut_309_0 = 0.0;
        double stackOut_307_0 = 0.0;
        kg[] stackOut_371_0 = null;
        Torquing stackOut_445_0 = null;
        int stackOut_445_1 = 0;
        Torquing stackOut_450_0 = null;
        int stackOut_450_1 = 0;
        int stackOut_450_2 = 0;
        Torquing stackOut_446_0 = null;
        int stackOut_446_1 = 0;
        Torquing stackOut_448_0 = null;
        int stackOut_448_1 = 0;
        int stackOut_448_2 = 0;
        int stackOut_463_0 = 0;
        int stackOut_461_0 = 0;
        Torquing stackOut_464_0 = null;
        int stackOut_464_1 = 0;
        Torquing stackOut_467_0 = null;
        int stackOut_467_1 = 0;
        int stackOut_467_2 = 0;
        Torquing stackOut_465_0 = null;
        int stackOut_465_1 = 0;
        int stackOut_465_2 = 0;
        kg[] stackOut_469_0 = null;
        Object stackOut_472_0 = null;
        Object stackOut_486_0 = null;
        Object stackOut_490_0 = null;
        tl stackOut_490_1 = null;
        Object stackOut_511_0 = null;
        Object stackOut_511_1 = null;
        var21 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (jb.a(110)) {
                break L1;
              } else {
                if (((bi) this).field_J) {
                  break L1;
                } else {
                  np.a(la.field_k[((bi) this).field_q], false, 124);
                  break L1;
                }
              }
            }
            L2: {
              ((bi) this).field_j = ((bi) this).field_j + 1;
              ((bi) this).field_F = ((bi) this).field_F - ((bi) this).field_M;
              ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_M;
              ((bi) this).field_l = ((bi) this).field_l + 1;
              ((bi) this).field_s = ((bi) this).field_U;
              if (ri.field_E < 2) {
                break L2;
              } else {
                if (!ce.field_b) {
                  break L2;
                } else {
                  ko.field_b = false;
                  break L2;
                }
              }
            }
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (!ak.c(-85)) {
                    break L5;
                  } else {
                    var7_int = po.field_z;
                    stackOut_15_0 = ~var7_int;
                    stackIn_204_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var21 != 0) {
                      break L4;
                    } else {
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
                                                L19: {
                                                  if (stackIn_16_0 != -99) {
                                                    break L19;
                                                  } else {
                                                    if (var21 == 0) {
                                                      L20: {
                                                        if (!mm.field_h) {
                                                          break L20;
                                                        } else {
                                                          ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] + 10.0;
                                                          ((bi) this).field_M = ((bi) this).field_M + 1;
                                                          break L20;
                                                        }
                                                      }
                                                      var3++;
                                                      if (var21 == 0) {
                                                        break L6;
                                                      } else {
                                                        break L18;
                                                      }
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                L21: {
                                                  if (var7_int != 99) {
                                                    break L21;
                                                  } else {
                                                    if (var21 == 0) {
                                                      break L18;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                                if (var7_int == 96) {
                                                  break L17;
                                                } else {
                                                  if (97 == var7_int) {
                                                    break L16;
                                                  } else {
                                                    L22: {
                                                      if (var7_int != 102) {
                                                        break L22;
                                                      } else {
                                                        if (var21 == 0) {
                                                          break L15;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    L23: {
                                                      if (var7_int != 104) {
                                                        break L23;
                                                      } else {
                                                        if (var21 == 0) {
                                                          break L14;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var7_int != 105) {
                                                        break L24;
                                                      } else {
                                                        if (var21 == 0) {
                                                          break L13;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (103 != var7_int) {
                                                        break L25;
                                                      } else {
                                                        if (var21 == 0) {
                                                          break L12;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    if (42 == var7_int) {
                                                      break L11;
                                                    } else {
                                                      L26: {
                                                        if (var7_int != 43) {
                                                          break L26;
                                                        } else {
                                                          if (var21 == 0) {
                                                            break L10;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      if (var7_int == 100) {
                                                        break L9;
                                                      } else {
                                                        if (var7_int == 82) {
                                                          break L9;
                                                        } else {
                                                          L27: {
                                                            if (84 != var7_int) {
                                                              break L27;
                                                            } else {
                                                              if (var21 == 0) {
                                                                break L8;
                                                              } else {
                                                                break L27;
                                                              }
                                                            }
                                                          }
                                                          L28: {
                                                            if (var7_int != 83) {
                                                              break L28;
                                                            } else {
                                                              if (var21 == 0) {
                                                                break L8;
                                                              } else {
                                                                break L28;
                                                              }
                                                            }
                                                          }
                                                          if (var7_int == 13) {
                                                            break L7;
                                                          } else {
                                                            break L6;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var3--;
                                              if (!mm.field_h) {
                                                break L6;
                                              } else {
                                                ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] - 10.0;
                                                ((bi) this).field_M = ((bi) this).field_M + 2;
                                                if (var21 == 0) {
                                                  break L6;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            var4++;
                                            ((bi) this).field_y = false;
                                            if (mm.field_h) {
                                              ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] - 10.0;
                                              ((bi) this).field_M = ((bi) this).field_M + 4;
                                              if (var21 == 0) {
                                                break L6;
                                              } else {
                                                break L16;
                                              }
                                            } else {
                                              break L6;
                                            }
                                          }
                                          ((bi) this).field_y = false;
                                          var4--;
                                          if (mm.field_h) {
                                            ((bi) this).field_M = ((bi) this).field_M + 8;
                                            ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] + 10.0;
                                            if (var21 == 0) {
                                              break L6;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            break L6;
                                          }
                                        }
                                        ((bi) this).field_y = false;
                                        var4++;
                                        var3++;
                                        if (var21 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      ((bi) this).field_y = false;
                                      var3++;
                                      var4--;
                                      if (var21 == 0) {
                                        break L6;
                                      } else {
                                        break L13;
                                      }
                                    }
                                    ((bi) this).field_y = false;
                                    var3--;
                                    var4--;
                                    if (var21 == 0) {
                                      break L6;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  var4++;
                                  ((bi) this).field_y = false;
                                  var3--;
                                  if (var21 == 0) {
                                    break L6;
                                  } else {
                                    break L11;
                                  }
                                }
                                if (!mm.field_h) {
                                  break L6;
                                } else {
                                  ((bi) this).field_M = ((bi) this).field_M + 16;
                                  ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] + 10.0;
                                  if (var21 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (mm.field_h) {
                                ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] - 10.0;
                                ((bi) this).field_M = ((bi) this).field_M + 32;
                                if (var21 == 0) {
                                  break L6;
                                } else {
                                  break L9;
                                }
                              } else {
                                break L6;
                              }
                            }
                            if (!((bi) this).field_w) {
                              break L6;
                            } else {
                              var6 = 1;
                              if (var21 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var5 = 1;
                          if (var21 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        var2_int = 1;
                        break L6;
                      }
                      if (2 <= ri.field_E) {
                        L29: {
                          L30: {
                            L31: {
                              L32: {
                                L33: {
                                  L34: {
                                    L35: {
                                      L36: {
                                        var7_int = po.field_z;
                                        if (var7_int != 70) {
                                          break L36;
                                        } else {
                                          if (var21 == 0) {
                                            break L35;
                                          } else {
                                            break L36;
                                          }
                                        }
                                      }
                                      if (var7_int == 51) {
                                        break L34;
                                      } else {
                                        L37: {
                                          if (38 != var7_int) {
                                            break L37;
                                          } else {
                                            if (var21 == 0) {
                                              break L33;
                                            } else {
                                              break L37;
                                            }
                                          }
                                        }
                                        if (var7_int == 49) {
                                          break L32;
                                        } else {
                                          L38: {
                                            if (var7_int != 101) {
                                              break L38;
                                            } else {
                                              if (var21 == 0) {
                                                break L31;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                          if (var7_int == 48) {
                                            break L30;
                                          } else {
                                            if (var7_int == 80) {
                                              break L29;
                                            } else {
                                              L39: {
                                                if (var7_int != 69) {
                                                  break L39;
                                                } else {
                                                  if (var21 == 0) {
                                                    break L29;
                                                  } else {
                                                    break L39;
                                                  }
                                                }
                                              }
                                              if (var7_int != 57) {
                                                continue L3;
                                              } else {
                                                if (var21 == 0) {
                                                  L40: {
                                                    if (i.field_P[81]) {
                                                      stackOut_201_0 = 0;
                                                      stackIn_202_0 = stackOut_201_0;
                                                      break L40;
                                                    } else {
                                                      stackOut_199_0 = 1;
                                                      stackIn_202_0 = stackOut_199_0;
                                                      break L40;
                                                    }
                                                  }
                                                  mm.field_h = stackIn_202_0 != 0;
                                                  ((bi) this).field_t = ((bi) this).field_t | mm.field_h;
                                                  if (var21 == 0) {
                                                    continue L3;
                                                  } else {
                                                    break L5;
                                                  }
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ti.field_k = ti.field_k ^ true;
                                    if (var21 == 0) {
                                      continue L3;
                                    } else {
                                      break L34;
                                    }
                                  }
                                  ce.field_b = true;
                                  if (var21 == 0) {
                                    continue L3;
                                  } else {
                                    break L33;
                                  }
                                }
                                ce.field_b = false;
                                if (var21 == 0) {
                                  continue L3;
                                } else {
                                  break L32;
                                }
                              }
                              if (!ce.field_b) {
                                continue L3;
                              } else {
                                ko.field_b = true;
                                if (var21 == 0) {
                                  continue L3;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            ((bi) this).field_k = ((bi) this).field_k + 30000;
                            ((bi) this).field_t = true;
                            if (var21 == 0) {
                              continue L3;
                            } else {
                              break L30;
                            }
                          }
                          ((bi) this).field_k = ((bi) this).field_k - 1000;
                          if (var21 == 0) {
                            continue L3;
                          } else {
                            break L29;
                          }
                        }
                        L41: {
                          ((bi) this).field_k = 0;
                          ((bi) this).field_T = ki.a("ff9040", "ffffff", -93, ((bi) this).field_T.toString());
                          ((bi) this).g(62);
                          vl.field_c = null;
                          if (!je.a((byte) 117)) {
                            gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1], 65524);
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        ((bi) this).field_l = ((bi) this).field_l - ((bi) this).field_U;
                        ((bi) this).field_U = 0;
                        return;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
                var7_int = ((bi) this).field_a[0];
                stackOut_203_0 = be.field_o[var7_int * 32 & 2047];
                stackIn_204_0 = stackOut_203_0;
                break L4;
              }
              var8 = stackIn_204_0;
              var9_int = be.field_l[32 * var7_int & 2047];
              ((bi) this).field_a[0] = 0;
              ((bi) this).field_a[11] = var8;
              ((bi) this).field_a[3] = var8;
              ((bi) this).field_a[9] = var9_int;
              ((bi) this).field_a[5] = -var9_int;
              ((bi) this).field_P.field_h.a(vc.field_c[1], ((bi) this).field_a);
              var10_ref_kh = (kh) (Object) on.field_e.c((byte) -119);
              L42: while (true) {
                L43: {
                  L44: {
                    if (var10_ref_kh == null) {
                      break L44;
                    } else {
                      ((bi) this).field_P.field_h.a(var10_ref_kh, ((bi) this).field_a);
                      var10_ref_kh = (kh) (Object) on.field_e.b((byte) 72);
                      if (var21 != 0) {
                        break L43;
                      } else {
                        if (var21 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  var10 = 9;
                  L45: while (true) {
                    L46: {
                      L47: {
                        if (var10 > 16) {
                          break L47;
                        } else {
                          ((bi) this).field_P.field_h.a(vc.field_c[var10], ((bi) this).field_a);
                          var10++;
                          if (var21 != 0) {
                            break L46;
                          } else {
                            if (var21 == 0) {
                              continue L45;
                            } else {
                              break L47;
                            }
                          }
                        }
                      }
                      ((bi) this).field_a[0] = 1 + var7_int;
                      break L46;
                    }
                    L48: {
                      if (0 != (7 & var7_int)) {
                        break L48;
                      } else {
                        var10_ref_short__ = vc.field_c[9].field_l.field_m;
                        var11_int = (short)(65535 & var10_ref_short__[0] - -1024);
                        dk.a(var10_ref_short__, 0, var10_ref_short__.length, (short) var11_int);
                        ((bi) this).field_M = ((bi) this).field_M ^ var11_int << 613208131;
                        ((bi) this).field_o = ((bi) this).field_o ^ var11_int << 1035955139;
                        break L48;
                      }
                    }
                    this.a(false, var7_int);
                    break L43;
                  }
                }
                var7 = (sb) (Object) ((bi) this).field_e.b(0);
                L49: while (true) {
                  L50: {
                    L51: {
                      if (null == var7) {
                        break L51;
                      } else {
                        var7.a((byte) -114);
                        var7 = (sb) (Object) ((bi) this).field_e.f(-24059);
                        if (var21 != 0) {
                          break L50;
                        } else {
                          if (var21 == 0) {
                            continue L49;
                          } else {
                            break L51;
                          }
                        }
                      }
                    }
                    if (var2_int != 0) {
                      ((bi) this).field_A.a(true, 1, 2, false);
                      break L50;
                    } else {
                      L52: {
                        if (ri.field_E < 2) {
                          break L52;
                        } else {
                          if (!ce.field_b) {
                            break L52;
                          } else {
                            if (ko.field_b) {
                              break L52;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      if (((bi) this).field_r > 0) {
                        L53: {
                          L54: {
                            if (((bi) this).field_r != 1000) {
                              break L54;
                            } else {
                              th.a(100, th.field_F[4]);
                              if (var21 == 0) {
                                break L53;
                              } else {
                                break L54;
                              }
                            }
                          }
                          L55: {
                            if (((bi) this).field_r == 2000) {
                              break L55;
                            } else {
                              L56: {
                                if (((bi) this).field_r == 3000) {
                                  break L56;
                                } else {
                                  if (((bi) this).field_r > 20) {
                                    break L53;
                                  } else {
                                    qj.a(((bi) this).field_r, -5205, 96, th.field_F[5]);
                                    if (var21 == 0) {
                                      break L53;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                              th.a(100, th.field_F[2]);
                              if (var21 == 0) {
                                break L53;
                              } else {
                                break L55;
                              }
                            }
                          }
                          th.a(100, th.field_F[3]);
                          break L53;
                        }
                        ((bi) this).field_r = ((bi) this).field_r - 20;
                        return;
                      } else {
                        L57: {
                          L58: {
                            if (((bi) this).field_x <= 0) {
                              break L58;
                            } else {
                              if (((bi) this).field_x >= 512) {
                                break L58;
                              } else {
                                var7_ref = ql.field_u;
                                ((bi) this).field_x = Math.min(512, ((bi) this).field_x + 10);
                                bc.field_a.a(true);
                                var7_ref.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[((bi) this).field_v][2] * 2) / 2048.0);
                                bc.field_a.a(var7_ref, 65536);
                                var7_ref.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[((bi) this).field_v][0]) / 2048.0);
                                bc.field_a.a(var7_ref, 65536);
                                var7_ref.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[((bi) this).field_v][1] * 2) * 3.141592653589793 / 2048.0);
                                bc.field_a.a(var7_ref, 65536);
                                var7_ref.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -((bi) this).field_x) / 2048.0);
                                bc.field_a.a(var7_ref, 65536);
                                bc.field_a.a(gj.field_i, (byte) 113);
                                re.field_d[0] = 80.0 * (double)be.field_l[((bi) this).field_x] / 65535.0;
                                re.field_d[1] = (double)be.field_o[((bi) this).field_x] * 80.0 / 65535.0;
                                ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                                var8_ref_pj = ((bi) this).field_d.a(-100, false).field_k;
                                var9_int = -1 + var8_ref_pj.field_k;
                                L59: while (true) {
                                  if (var9_int < 0) {
                                    break L58;
                                  } else {
                                    ((bi) this).field_h = Math.max(((bi) this).field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
                                    var9_int--;
                                    if (var21 != 0) {
                                      break L57;
                                    } else {
                                      if (var21 == 0) {
                                        continue L59;
                                      } else {
                                        break L58;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3 = Math.min(Math.max(var3, -10), 10);
                          break L57;
                        }
                        L60: {
                          L61: {
                            var7_array = new double[3];
                            var7_array[0] = 2670.0 * (double)(be.field_o[((bi) this).field_x] * var3) / 65535.0;
                            var7_array[1] = 2670.0 * (double)(-be.field_l[((bi) this).field_x] * var3) / 65535.0;
                            var7_array[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                            if (((bi) this).field_c < 0) {
                              break L61;
                            } else {
                              if (mm.field_h) {
                                break L61;
                              } else {
                                if (!((bi) this).field_J) {
                                  L62: {
                                    stackOut_318_0 = ((bi) this).field_P;
                                    stackOut_318_1 = (double[]) var7_array;
                                    stackOut_318_2 = var5;
                                    stackOut_318_3 = 0.08;
                                    stackOut_318_4 = var6;
                                    stackOut_318_5 = 0;
                                    stackIn_321_0 = stackOut_318_0;
                                    stackIn_321_1 = stackOut_318_1;
                                    stackIn_321_2 = stackOut_318_2;
                                    stackIn_321_3 = stackOut_318_3;
                                    stackIn_321_4 = stackOut_318_4;
                                    stackIn_321_5 = stackOut_318_5;
                                    stackIn_319_0 = stackOut_318_0;
                                    stackIn_319_1 = stackOut_318_1;
                                    stackIn_319_2 = stackOut_318_2;
                                    stackIn_319_3 = stackOut_318_3;
                                    stackIn_319_4 = stackOut_318_4;
                                    stackIn_319_5 = stackOut_318_5;
                                    if (((bi) this).field_d != ig.field_q) {
                                      stackOut_321_0 = (vg) (Object) stackIn_321_0;
                                      stackOut_321_1 = (double[]) (Object) stackIn_321_1;
                                      stackOut_321_2 = stackIn_321_2;
                                      stackOut_321_3 = stackIn_321_3;
                                      stackOut_321_4 = stackIn_321_4;
                                      stackOut_321_5 = stackIn_321_5;
                                      stackOut_321_6 = 0;
                                      stackIn_322_0 = stackOut_321_0;
                                      stackIn_322_1 = stackOut_321_1;
                                      stackIn_322_2 = stackOut_321_2;
                                      stackIn_322_3 = stackOut_321_3;
                                      stackIn_322_4 = stackOut_321_4;
                                      stackIn_322_5 = stackOut_321_5;
                                      stackIn_322_6 = stackOut_321_6;
                                      break L62;
                                    } else {
                                      stackOut_319_0 = (vg) (Object) stackIn_319_0;
                                      stackOut_319_1 = (double[]) (Object) stackIn_319_1;
                                      stackOut_319_2 = stackIn_319_2;
                                      stackOut_319_3 = stackIn_319_3;
                                      stackOut_319_4 = stackIn_319_4;
                                      stackOut_319_5 = stackIn_319_5;
                                      stackOut_319_6 = 1;
                                      stackIn_322_0 = stackOut_319_0;
                                      stackIn_322_1 = stackOut_319_1;
                                      stackIn_322_2 = stackOut_319_2;
                                      stackIn_322_3 = stackOut_319_3;
                                      stackIn_322_4 = stackOut_319_4;
                                      stackIn_322_5 = stackOut_319_5;
                                      stackIn_322_6 = stackOut_319_6;
                                      break L62;
                                    }
                                  }
                                  L63: {
                                    var9_double = ((vg) (Object) stackIn_322_0).a(stackIn_322_1, stackIn_322_2 != 0, stackIn_322_3, stackIn_322_4 != 0, stackIn_322_5, stackIn_322_6 != 0);
                                    if (!((bi) this).field_y) {
                                      break L63;
                                    } else {
                                      if (((bi) this).field_P.field_g[2] > 1400.0) {
                                        break L63;
                                      } else {
                                        if (0.0 <= ((bi) this).field_P.field_g[5]) {
                                          this.a(14, (byte) 127, 241);
                                          break L63;
                                        } else {
                                          break L63;
                                        }
                                      }
                                    }
                                  }
                                  L64: {
                                    if (var9_double <= ((bi) this).field_h) {
                                      break L64;
                                    } else {
                                      if (-1.0 == ((bi) this).field_K) {
                                        ((bi) this).field_K = 0.08 * ((bi) this).field_P.field_g[4];
                                        th.a(100, th.field_F[22]);
                                        break L64;
                                      } else {
                                        break L64;
                                      }
                                    }
                                  }
                                  L65: {
                                    if (var9_double >= 100000.0 + ((bi) this).field_h) {
                                      stackOut_342_0 = 0;
                                      stackIn_343_0 = stackOut_342_0;
                                      break L65;
                                    } else {
                                      stackOut_340_0 = 1;
                                      stackIn_343_0 = stackOut_340_0;
                                      break L65;
                                    }
                                  }
                                  var8 = stackIn_343_0;
                                  break L60;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                          L66: {
                            if (!mm.field_h) {
                              break L66;
                            } else {
                              ((bi) this).field_P.c(0);
                              break L66;
                            }
                          }
                          var8 = 1;
                          if (!((bi) this).field_J) {
                            break L60;
                          } else {
                            var9 = (Object) (Object) new double[4];
                            ap.a(((bi) this).field_P.field_g, 6, ((bi) this).field_P.field_g, 10, (double[]) var9, 0, 0.08);
                            var10 = 0;
                            L67: while (true) {
                              L68: {
                                L69: {
                                  if (var10 >= 4) {
                                    break L69;
                                  } else {
                                    ((bi) this).field_P.field_g[var10 + 6] = ((bi) this).field_P.field_g[var10 + 6] + ((double[]) var9)[var10];
                                    var10++;
                                    if (var21 != 0) {
                                      break L68;
                                    } else {
                                      if (var21 == 0) {
                                        continue L67;
                                      } else {
                                        break L69;
                                      }
                                    }
                                  }
                                }
                                var10 = 0;
                                break L68;
                              }
                              L70: while (true) {
                                L71: {
                                  if (var10 >= 3) {
                                    break L71;
                                  } else {
                                    ((bi) this).field_P.field_g[10 - -var10] = ((bi) this).field_P.field_g[10 - -var10] * 0.8;
                                    var10++;
                                    if (var21 != 0) {
                                      break L60;
                                    } else {
                                      if (var21 == 0) {
                                        continue L70;
                                      } else {
                                        break L71;
                                      }
                                    }
                                  }
                                }
                                L72: {
                                  var10_double = 0.1;
                                  var12_double = ((bi) this).field_P.field_g[8];
                                  if (var12_double >= 1.0) {
                                    stackOut_310_0 = 0.0;
                                    stackIn_311_0 = stackOut_310_0;
                                    break L72;
                                  } else {
                                    if (-1.0 < var12_double) {
                                      stackOut_309_0 = Math.acos(var12_double);
                                      stackIn_311_0 = stackOut_309_0;
                                      break L72;
                                    } else {
                                      stackOut_307_0 = 3.141592653589793;
                                      stackIn_311_0 = stackOut_307_0;
                                      break L72;
                                    }
                                  }
                                }
                                L73: {
                                  L74: {
                                    L75: {
                                      var14_double = stackIn_311_0;
                                      var16 = ql.field_u;
                                      if (0.0001 > var14_double) {
                                        break L75;
                                      } else {
                                        if (3.141492653589793 >= var14_double) {
                                          break L74;
                                        } else {
                                          break L75;
                                        }
                                      }
                                    }
                                    var19 = var10_double;
                                    var17 = 1.0 - var10_double;
                                    if (var21 == 0) {
                                      break L73;
                                    } else {
                                      break L74;
                                    }
                                  }
                                  var17 = Math.sin((-var10_double + 1.0) * var14_double);
                                  var19 = Math.sin(var14_double * var10_double);
                                  break L73;
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
                                break L60;
                              }
                            }
                          }
                        }
                        L76: {
                          if (ig.field_q == ((bi) this).field_d) {
                            var9 = (Object) (Object) ((bi) this).field_d.f(14);
                            ((bi) this).field_P.field_g[0] = ((double[]) var9)[0];
                            ((bi) this).field_P.field_g[2] = ((double[]) var9)[2];
                            break L76;
                          } else {
                            break L76;
                          }
                        }
                        var9 = (Object) (Object) ((bi) this).field_m;
                        var10 = 0;
                        L77: while (true) {
                          L78: {
                            L79: {
                              if (~((Object[]) var9).length >= ~var10) {
                                break L79;
                              } else {
                                var11_int = ((int[]) var9)[var10];
                                if (var21 != 0) {
                                  break L78;
                                } else {
                                  L80: {
                                    if (((bi) this).field_D[var11_int] == null) {
                                      break L80;
                                    } else {
                                      var12_double = ((bi) this).field_D[var11_int].a(0, 0.08);
                                      if (var12_double > ((bi) this).field_h + 100000.0) {
                                        L81: {
                                          var14 = ((bi) this).field_D[var11_int];
                                          this.a(538, 0, var14.field_h, var14.field_c);
                                          if (null == ig.field_r[13]) {
                                            ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                                            break L81;
                                          } else {
                                            break L81;
                                          }
                                        }
                                        L82: {
                                          if (!ig.field_r[13].e(17)) {
                                            ig.field_r[13].c(0);
                                            ni.a(ig.field_r[13], true);
                                            break L82;
                                          } else {
                                            break L82;
                                          }
                                        }
                                        ((bi) this).field_D[var11_int] = null;
                                        break L80;
                                      } else {
                                        break L80;
                                      }
                                    }
                                  }
                                  var10++;
                                  if (var21 == 0) {
                                    continue L77;
                                  } else {
                                    break L79;
                                  }
                                }
                              }
                            }
                            if (param0 > 35) {
                              break L78;
                            } else {
                              return;
                            }
                          }
                          var9_int = 0;
                          L83: while (true) {
                            L84: {
                              L85: {
                                L86: {
                                  L87: {
                                    L88: {
                                      L89: {
                                        if (~((bi) this).field_Q.length >= ~var9_int) {
                                          break L89;
                                        } else {
                                          stackOut_371_0 = ((bi) this).field_Q;
                                          stackIn_470_0 = stackOut_371_0;
                                          stackIn_372_0 = stackOut_371_0;
                                          if (var21 != 0) {
                                            break L88;
                                          } else {
                                            L90: {
                                              if (stackIn_372_0[var9_int] == null) {
                                                break L90;
                                              } else {
                                                ((bi) this).field_Q[var9_int].a(true);
                                                if (((bi) this).field_Q[var9_int].field_a == null) {
                                                  ((bi) this).field_Q[var9_int] = null;
                                                  break L90;
                                                } else {
                                                  break L90;
                                                }
                                              }
                                            }
                                            var9_int++;
                                            if (var21 == 0) {
                                              continue L83;
                                            } else {
                                              break L89;
                                            }
                                          }
                                        }
                                      }
                                      L91: {
                                        if (!((bi) this).field_J) {
                                          ((bi) this).field_k = ((bi) this).field_k - 20;
                                          if (((bi) this).field_d == ig.field_q) {
                                            break L91;
                                          } else {
                                            if (10000 < ((bi) this).field_k) {
                                              break L91;
                                            } else {
                                              if (0 >= ((bi) this).field_k) {
                                                break L91;
                                              } else {
                                                if ((20 + (((bi) this).field_k + -1)) % 1000 >= 20) {
                                                  break L91;
                                                } else {
                                                  th.a(100, th.field_F[20]);
                                                  break L91;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L91;
                                        }
                                      }
                                      L92: {
                                        if (!((bi) this).field_J) {
                                          break L92;
                                        } else {
                                          L93: {
                                            if (((bi) this).field_k <= 0) {
                                              break L93;
                                            } else {
                                              L94: {
                                                var9_int = 300;
                                                if (((bi) this).field_k < var9_int) {
                                                  var9_int = ((bi) this).field_k;
                                                  break L94;
                                                } else {
                                                  break L94;
                                                }
                                              }
                                              ((bi) this).field_k = ((bi) this).field_k - var9_int;
                                              ((bi) this).a((byte) 115, (1 + ((bi) this).field_d.field_s) * var9_int / 100);
                                              if (var21 == 0) {
                                                break L87;
                                              } else {
                                                break L93;
                                              }
                                            }
                                          }
                                          L95: {
                                            L96: {
                                              if (((bi) this).field_d.field_m == null) {
                                                break L96;
                                              } else {
                                                if (~wi.field_a[((bi) this).field_L - -1] == ~wi.field_a[((bi) this).field_L]) {
                                                  break L95;
                                                } else {
                                                  break L96;
                                                }
                                              }
                                            }
                                            ((bi) this).field_A.a(true, wi.field_a[((bi) this).field_L], 8, false);
                                            if (var21 == 0) {
                                              break L87;
                                            } else {
                                              break L95;
                                            }
                                          }
                                          ((bi) this).field_A.a(true, ((bi) this).field_L + 1, 6, false);
                                          if (var21 == 0) {
                                            break L87;
                                          } else {
                                            break L92;
                                          }
                                        }
                                      }
                                      L97: {
                                        if (ig.field_q == ((bi) this).field_d) {
                                          break L97;
                                        } else {
                                          if (0 < ((bi) this).field_k) {
                                            break L97;
                                          } else {
                                            if (((bi) this).field_k <= -20) {
                                              break L97;
                                            } else {
                                              this.b(12, 1);
                                              th.a(100, th.field_F[21]);
                                              if (var21 == 0) {
                                                break L87;
                                              } else {
                                                break L97;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L98: {
                                        if (var8 != 0) {
                                          break L98;
                                        } else {
                                          this.b(12, 0);
                                          if (var21 == 0) {
                                            break L87;
                                          } else {
                                            break L98;
                                          }
                                        }
                                      }
                                      L99: {
                                        if (((bi) this).field_c < 0) {
                                          break L99;
                                        } else {
                                          if (0 <= ((bi) this).field_k) {
                                            break L87;
                                          } else {
                                            L100: {
                                              ((bi) this).b(9);
                                              ((bi) this).field_g = true;
                                              if (je.a((byte) 69)) {
                                                break L100;
                                              } else {
                                                L101: {
                                                  stackOut_445_0 = ((bi) this).field_A;
                                                  stackOut_445_1 = 1;
                                                  stackIn_450_0 = stackOut_445_0;
                                                  stackIn_450_1 = stackOut_445_1;
                                                  stackIn_446_0 = stackOut_445_0;
                                                  stackIn_446_1 = stackOut_445_1;
                                                  if (0 != ao.field_f) {
                                                    stackOut_450_0 = (Torquing) (Object) stackIn_450_0;
                                                    stackOut_450_1 = stackIn_450_1;
                                                    stackOut_450_2 = 8;
                                                    stackIn_451_0 = stackOut_450_0;
                                                    stackIn_451_1 = stackOut_450_1;
                                                    stackIn_451_2 = stackOut_450_2;
                                                    break L101;
                                                  } else {
                                                    stackOut_446_0 = (Torquing) (Object) stackIn_446_0;
                                                    stackOut_446_1 = stackIn_446_1;
                                                    stackIn_448_0 = stackOut_446_0;
                                                    stackIn_448_1 = stackOut_446_1;
                                                    stackOut_448_0 = (Torquing) (Object) stackIn_448_0;
                                                    stackOut_448_1 = stackIn_448_1;
                                                    stackOut_448_2 = 2;
                                                    stackIn_451_0 = stackOut_448_0;
                                                    stackIn_451_1 = stackOut_448_1;
                                                    stackIn_451_2 = stackOut_448_2;
                                                    break L101;
                                                  }
                                                }
                                                ((Torquing) (Object) stackIn_451_0).a(stackIn_451_1 != 0, stackIn_451_2, 2, false);
                                                if (var21 == 0) {
                                                  break L87;
                                                } else {
                                                  break L100;
                                                }
                                              }
                                            }
                                            L102: {
                                              L103: {
                                                if (((bi) this).field_U != 0) {
                                                  break L103;
                                                } else {
                                                  if (ao.field_f != 0) {
                                                    break L103;
                                                  } else {
                                                    if (((bi) this).field_L == 0) {
                                                      stackOut_463_0 = 0;
                                                      stackIn_464_0 = stackOut_463_0;
                                                      break L102;
                                                    } else {
                                                      break L103;
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_461_0 = 1;
                                              stackIn_464_0 = stackOut_461_0;
                                              break L102;
                                            }
                                            L104: {
                                              var9_int = stackIn_464_0;
                                              stackOut_464_0 = ((bi) this).field_A;
                                              stackOut_464_1 = 1;
                                              stackIn_467_0 = stackOut_464_0;
                                              stackIn_467_1 = stackOut_464_1;
                                              stackIn_465_0 = stackOut_464_0;
                                              stackIn_465_1 = stackOut_464_1;
                                              if (var9_int == 0) {
                                                stackOut_467_0 = (Torquing) (Object) stackIn_467_0;
                                                stackOut_467_1 = stackIn_467_1;
                                                stackOut_467_2 = 0;
                                                stackIn_468_0 = stackOut_467_0;
                                                stackIn_468_1 = stackOut_467_1;
                                                stackIn_468_2 = stackOut_467_2;
                                                break L104;
                                              } else {
                                                stackOut_465_0 = (Torquing) (Object) stackIn_465_0;
                                                stackOut_465_1 = stackIn_465_1;
                                                stackOut_465_2 = 7;
                                                stackIn_468_0 = stackOut_465_0;
                                                stackIn_468_1 = stackOut_465_1;
                                                stackIn_468_2 = stackOut_465_2;
                                                break L104;
                                              }
                                            }
                                            ((Torquing) (Object) stackIn_468_0).a(stackIn_468_1 != 0, stackIn_468_2, 2, false);
                                            if (var21 == 0) {
                                              break L87;
                                            } else {
                                              break L99;
                                            }
                                          }
                                        }
                                      }
                                      var9_int = 1;
                                      stackOut_469_0 = ((bi) this).field_Q;
                                      stackIn_470_0 = stackOut_469_0;
                                      break L88;
                                    }
                                    var10_ref_kg__ = stackIn_470_0;
                                    var11_int = 0;
                                    L105: while (true) {
                                      L106: {
                                        if (~var10_ref_kg__.length >= ~var11_int) {
                                          break L106;
                                        } else {
                                          var12 = var10_ref_kg__[var11_int];
                                          stackOut_472_0 = null;
                                          stackIn_488_0 = stackOut_472_0;
                                          stackIn_473_0 = stackOut_472_0;
                                          if (var21 != 0) {
                                            break L86;
                                          } else {
                                            L107: {
                                              if (stackIn_473_0 == (Object) (Object) var12) {
                                                break L107;
                                              } else {
                                                var9_int = 0;
                                                break L107;
                                              }
                                            }
                                            var11_int++;
                                            if (var21 == 0) {
                                              continue L105;
                                            } else {
                                              break L106;
                                            }
                                          }
                                        }
                                      }
                                      if (var9_int != 0) {
                                        this.b(12, 2);
                                        break L87;
                                      } else {
                                        break L87;
                                      }
                                    }
                                  }
                                  if (((bi) this).field_g) {
                                    break L85;
                                  } else {
                                    if (((bi) this).field_J) {
                                      break L85;
                                    } else {
                                      stackOut_486_0 = null;
                                      stackIn_488_0 = stackOut_486_0;
                                      break L86;
                                    }
                                  }
                                }
                                var9 = stackIn_488_0;
                                var10 = 0;
                                L108: while (true) {
                                  L109: {
                                    L110: {
                                      if (~var10 <= ~((bi) this).field_D.length) {
                                        break L110;
                                      } else {
                                        var11 = ((bi) this).field_D[var10];
                                        stackOut_490_0 = null;
                                        stackOut_490_1 = (tl) var11;
                                        stackIn_512_0 = stackOut_490_0;
                                        stackIn_512_1 = stackOut_490_1;
                                        stackIn_491_0 = stackOut_490_0;
                                        stackIn_491_1 = stackOut_490_1;
                                        if (var21 != 0) {
                                          L111: while (true) {
                                            if (stackIn_512_0 == (Object) (Object) stackIn_512_1) {
                                              break L85;
                                            } else {
                                              ((tl) var9).a((bi) this, 19);
                                              var9 = (Object) (Object) ((tl) var9).field_t;
                                              if (var21 != 0) {
                                                break L84;
                                              } else {
                                                if (var21 == 0) {
                                                  stackOut_511_0 = null;
                                                  stackOut_511_1 = var9;
                                                  stackIn_512_0 = stackOut_511_0;
                                                  stackIn_512_1 = (tl) (Object) stackOut_511_1;
                                                  continue L111;
                                                } else {
                                                  break L109;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          L112: {
                                            if (stackIn_491_0 == (Object) (Object) stackIn_491_1) {
                                              break L112;
                                            } else {
                                              if (var11.field_r == 3) {
                                                break L112;
                                              } else {
                                                L113: {
                                                  if (var11.field_r < 25) {
                                                    break L113;
                                                  } else {
                                                    if (var11.field_r > 31) {
                                                      break L113;
                                                    } else {
                                                      if (var21 == 0) {
                                                        break L112;
                                                      } else {
                                                        break L113;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (!var11.a(0, ((bi) this).field_P.field_g)) {
                                                  break L112;
                                                } else {
                                                  var11.field_t = (tl) var9;
                                                  var9 = (Object) (Object) var11;
                                                  var11.a(80);
                                                  ((bi) this).field_D[var10] = null;
                                                  break L112;
                                                }
                                              }
                                            }
                                          }
                                          var10++;
                                          if (var21 == 0) {
                                            continue L108;
                                          } else {
                                            break L110;
                                          }
                                        }
                                      }
                                    }
                                    L114: while (true) {
                                      stackOut_511_0 = null;
                                      stackOut_511_1 = var9;
                                      stackIn_512_0 = stackOut_511_0;
                                      stackIn_512_1 = (tl) (Object) stackOut_511_1;
                                      if (stackIn_512_0 == (Object) (Object) stackIn_512_1) {
                                        break L85;
                                      } else {
                                        ((tl) var9).a((bi) this, 19);
                                        var9 = (Object) (Object) ((tl) var9).field_t;
                                        if (var21 != 0) {
                                          break L84;
                                        } else {
                                          if (var21 == 0) {
                                            continue L114;
                                          } else {
                                            break L109;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  break L85;
                                }
                              }
                              if (jb.field_d != 10) {
                                break L84;
                              } else {
                                if (la.field_k[10].e(17)) {
                                  break L84;
                                } else {
                                  np.a(la.field_k[((bi) this).field_q], false, 127);
                                  break L84;
                                }
                              }
                            }
                            break L0;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "bi.E(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        try {
            field_u = null;
            field_I = null;
            field_f = null;
            if (param0 != -3) {
                af discarded$0 = bi.a((sm) null, 58);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.V(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        try {
            ((bi) this).b(param0 ^ 5);
            eq.field_b = param1;
            ((bi) this).field_A.a(true, 5, 2, false);
            la.field_k[param0].a(false);
            jh.a(la.field_k[12], param0 ^ 12);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.W(" + param0 + ',' + param1 + ')');
        }
    }

    bi(Torquing param0, int param1) {
        RuntimeException var3 = null;
        StringBuilder var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
        try {
          L0: {
            L1: {
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
              if (null == gj.field_i) {
                gj.field_i = new int[12];
                int[] discarded$3 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (((bi) this).field_T == null) {
                  var3_ref = new StringBuilder(104);
                  var4 = 0;
                  L4: while (true) {
                    L5: {
                      if (var4 >= 8) {
                        break L5;
                      } else {
                        StringBuilder discarded$4 = var3_ref.append("<col=ffffff>");
                        StringBuilder discarded$5 = var3_ref.append(fh.field_s.charAt(var4));
                        var4++;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    ((bi) this).field_T = var3_ref.toString();
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              ((bi) this).field_d = ol.field_f[param1];
              ((bi) this).field_q = 1 + wi.field_a[param1];
              ((bi) this).field_P = new vg();
              this.h(104);
              vl.field_c = null;
              gn.field_l = null;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("bi.<init>(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
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
