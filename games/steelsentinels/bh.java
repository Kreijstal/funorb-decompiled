/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static String field_i;
    int field_k;
    private int field_d;
    boolean field_r;
    int field_q;
    private boolean field_h;
    private int field_a;
    boolean field_j;
    private int field_l;
    static String field_o;
    private int field_e;
    private int field_m;
    int field_b;
    int field_g;
    private mb field_c;
    int field_n;
    private int field_p;
    static boolean field_f;

    public static void a(byte param0) {
        if (param0 > -69) {
            bh.a((byte) 39, true);
        }
        field_o = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, boolean param4, int param5) {
        int[] var9 = null;
        if (param0 >= -11) {
            Object var10 = null;
            je discarded$0 = ((bh) this).a((je) null, false, -87);
        }
        int var7 = param2 + (((bh) this).field_g >> 399345608);
        int var8 = param5 + (((bh) this).field_q - ((bh) this).field_c.field_Db * 8 >> 789004776);
        ((bh) this).field_k = ((bh) this).field_k + 1;
        if (!((((bh) this).field_k ^ -1) > -17)) {
            ((bh) this).field_k = ((bh) this).field_k - 16;
            var9 = pe.field_o;
            if (!((255 & ((bh) this).field_n >> -1355791728) <= (((bh) this).field_n & 255))) {
                var9 = pe.field_b;
                if (!(((bh) this).field_n >> 118341288 != ((bh) this).field_n >> -1326865360)) {
                    var9 = pe.field_q;
                }
            }
            pb.a(var7 << 1332524516, var8 << -1128500860, param1, var9.length - 1, var9);
            if (param4) {
                if (hd.field_a < f.field_w.length) {
                    f.field_w[hd.field_a] = var7;
                    nj.field_U[hd.field_a] = var8;
                    hd.field_a = hd.field_a + 1;
                }
            }
        }
    }

    final static void a(int param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (param2 != -49) {
          return;
        } else {
          L0: {
            if (null != kc.field_y) {
              var3 = kc.field_y.a(-2, param1);
              if (0 != var3) {
                L1: {
                  if (2 != var3) {
                    break L1;
                  } else {
                    if (kc.field_y.field_S == null) {
                      break L1;
                    } else {
                      if (!kc.field_y.field_S.equals((Object) (Object) "")) {
                        L2: {
                          if (91 == kc.field_y.field_S.charAt(0)) {
                            var4 = kc.field_y.field_S;
                            var5 = var4;
                            var5 = var4;
                            break L2;
                          } else {
                            var7 = (CharSequence) (Object) kc.field_y.field_S;
                            var4 = ui.a(1, var7);
                            break L2;
                          }
                        }
                        L3: {
                          var5 = null;
                          if (ol.field_bc == 0) {
                            var5 = lj.a(var4, (byte) -79, param0);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (ol.field_bc == 1) {
                            var5 = nl.a(var4, param0, true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if ((ol.field_bc ^ -1) == -3) {
                            var5 = dd.a(param0, (byte) 55, var4);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (3 != ol.field_bc) {
                            break L6;
                          } else {
                            var5 = rn.a(var4, param0, var4, true);
                            break L6;
                          }
                        }
                        L7: {
                          if (var5 == null) {
                            break L7;
                          } else {
                            var6 = null;
                            sj.a((String) null, var5, 0, (byte) 21, var4, 2);
                            break L7;
                          }
                        }
                        ol.field_bc = -1;
                        kc.field_y = null;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                ol.field_bc = -1;
                kc.field_y = null;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, je param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = param1.field_u + -((bh) this).field_g >> -257704572;
        var4 = -((bh) this).field_q + param1.field_y >> -895309852;
        if (!param0) {
          return;
        } else {
          L0: {
            var5 = ik.a(var4 * var4 + var3 * var3, -1);
            if (-1 <= (var5 ^ -1)) {
              break L0;
            } else {
              L1: {
                var6 = 32 * ((bh) this).field_c.field_Fb;
                if (5 > ((bh) this).field_c.field_Fb) {
                  var6 = 16 * ((bh) this).field_c.field_cb;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 <= 640) {
                  break L2;
                } else {
                  var6 = 640;
                  break L2;
                }
              }
              L3: {
                if (((bh) this).field_j) {
                  L4: {
                    if ((((bh) this).field_c.field_cb ^ -1) <= -16) {
                      stackOut_11_0 = 15;
                      stackIn_12_0 = stackOut_11_0;
                      break L4;
                    } else {
                      stackOut_10_0 = ((bh) this).field_c.field_cb;
                      stackIn_12_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                  var6 = stackIn_12_0 * 32;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (!((bh) this).field_r) {
                  break L5;
                } else {
                  if (((bh) this).field_c.field_Fb * 32 <= var6) {
                    break L5;
                  } else {
                    var6 = 32 * ((bh) this).field_c.field_Fb;
                    break L5;
                  }
                }
              }
              L6: {
                if (var5 / 2 < var6) {
                  var6 = var5 / 2;
                  break L6;
                } else {
                  break L6;
                }
              }
              ((bh) this).field_m = var6 * var4 / var5;
              ((bh) this).field_d = 0;
              ((bh) this).field_l = var6 * var3 / var5;
              ((bh) this).field_r = false;
              break L0;
            }
          }
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        int var1 = di.field_g;
        if (!(10 == var1)) {
            if (0 == (var1 ^ -1)) {
                return false;
            }
            return true;
        }
        return 0 == ge.field_j ? true : false;
    }

    final je a(je param0, boolean param1, int param2) {
        je var4 = null;
        int var5 = 0;
        je var6 = null;
        int var6_int = 0;
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
        ee var19 = null;
        int stackIn_16_0 = 0;
        hd stackIn_16_1 = null;
        int stackIn_17_0 = 0;
        hd stackIn_17_1 = null;
        int stackIn_18_0 = 0;
        hd stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        hd stackIn_127_0 = null;
        hd stackIn_128_0 = null;
        hd stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        int stackIn_143_0 = 0;
        Object stackIn_147_0 = null;
        Object stackIn_148_0 = null;
        Object stackIn_149_0 = null;
        Object stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_186_0 = 0;
        hd stackIn_186_1 = null;
        int stackIn_187_0 = 0;
        hd stackIn_187_1 = null;
        int stackIn_188_0 = 0;
        hd stackIn_188_1 = null;
        int stackIn_188_2 = 0;
        Object stackIn_196_0 = null;
        Object stackIn_197_0 = null;
        Object stackIn_198_0 = null;
        int stackIn_198_1 = 0;
        Object stackIn_200_0 = null;
        Object stackIn_201_0 = null;
        Object stackIn_202_0 = null;
        int stackIn_202_1 = 0;
        Object stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int[] stackIn_206_3 = null;
        Object stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int[] stackIn_207_3 = null;
        Object stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        int[] stackIn_208_3 = null;
        int stackIn_208_4 = 0;
        Object stackIn_219_0 = null;
        Object stackIn_220_0 = null;
        Object stackIn_221_0 = null;
        Object stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        int stackOut_15_0 = 0;
        hd stackOut_15_1 = null;
        int stackOut_17_0 = 0;
        hd stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_16_0 = 0;
        hd stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        hd stackOut_126_0 = null;
        hd stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        hd stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        int stackOut_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_185_0 = 0;
        hd stackOut_185_1 = null;
        int stackOut_187_0 = 0;
        hd stackOut_187_1 = null;
        int stackOut_187_2 = 0;
        int stackOut_186_0 = 0;
        hd stackOut_186_1 = null;
        int stackOut_186_2 = 0;
        Object stackOut_199_0 = null;
        Object stackOut_201_0 = null;
        int stackOut_201_1 = 0;
        Object stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        Object stackOut_195_0 = null;
        Object stackOut_197_0 = null;
        int stackOut_197_1 = 0;
        Object stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        Object stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int[] stackOut_205_3 = null;
        Object stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        int stackOut_207_2 = 0;
        int[] stackOut_207_3 = null;
        int stackOut_207_4 = 0;
        Object stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int[] stackOut_206_3 = null;
        int stackOut_206_4 = 0;
        Object stackOut_218_0 = null;
        Object stackOut_219_0 = null;
        Object stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        Object stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        Object stackOut_146_0 = null;
        Object stackOut_147_0 = null;
        Object stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        Object stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        L0: {
          var18 = SteelSentinels.field_G;
          var4 = null;
          if (119999 >= (((bh) this).field_q ^ -1)) {
            break L0;
          } else {
            if ((((bh) this).field_m ^ -1) <= -1) {
              break L0;
            } else {
              ((bh) this).field_m = ((bh) this).field_m * 15 / 16;
              break L0;
            }
          }
        }
        L1: {
          L2: {
            if (((bh) this).field_c.field_xc.field_ab.b(48) != 4) {
              break L2;
            } else {
              if ((((bh) this).field_c.field_xc.field_r & 1) != 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (((bh) this).field_p < 0) {
            break L1;
          } else {
            ((bh) this).field_p = ((bh) this).field_p + 1;
            break L1;
          }
        }
        L3: {
          var5 = ((bh) this).field_g;
          ((bh) this).field_g = ((bh) this).field_g + ((bh) this).field_l;
          if (param1) {
            break L3;
          } else {
            ((bh) this).field_m = 127;
            break L3;
          }
        }
        L4: {
          ((bh) this).field_q = ((bh) this).field_q + ((bh) this).field_m;
          if (!((bh) this).field_r) {
            break L4;
          } else {
            if (((bh) this).field_m >= 0) {
              break L4;
            } else {
              ((bh) this).field_m = 0;
              break L4;
            }
          }
        }
        L5: {
          if (!((bh) this).field_r) {
            break L5;
          } else {
            if ((((bh) this).field_c.field_xc.field_ab.b(91) ^ -1) == -5) {
              break L5;
            } else {
              L6: {
                stackOut_15_0 = -50000;
                stackOut_15_1 = ((bh) this).field_c.field_xc.field_ab;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param1) {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = (hd) (Object) stackIn_17_1;
                  stackOut_17_2 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L6;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackOut_16_1 = (hd) (Object) stackIn_16_1;
                  stackOut_16_2 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  break L6;
                }
              }
              var6_int = stackIn_18_0 + (-((hd) (Object) stackIn_18_1).a(stackIn_18_2 != 0, ((bh) this).field_g >> -2110101564) << 203355108);
              if (((bh) this).field_q <= var6_int) {
                break L5;
              } else {
                if (-101 > ((bh) this).field_m) {
                  L7: {
                    ((bh) this).field_m = ((bh) this).field_m - 25;
                    if (-501 > ((bh) this).field_m) {
                      ((bh) this).field_m = 500;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (-1 > (((bh) this).field_p ^ -1)) {
                    ((bh) this).field_p = -((bh) this).field_p;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            }
          }
        }
        var6 = (je) (Object) ((bh) this).field_c.field_B.e(13058);
        L8: while (true) {
          if (var6 == null) {
            var6 = (je) (Object) ((bh) this).field_c.field_Ec.e(13058);
            L9: while (true) {
              if (var6 == null) {
                var6 = (je) (Object) ((bh) this).field_c.field_B.e(13058);
                L10: while (true) {
                  if (var6 == null) {
                    L11: {
                      if (param0 == null) {
                        break L11;
                      } else {
                        if (param0.field_x != param2) {
                          break L11;
                        } else {
                          L12: {
                            if (param0.field_s == -4) {
                              L13: {
                                if (!((bh) this).field_j) {
                                  break L13;
                                } else {
                                  if (0 < ((bh) this).field_c.field_cb) {
                                    break L13;
                                  } else {
                                    if (!((bh) this).field_r) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              this.a(true, param0);
                              break L12;
                            } else {
                              if (param0.field_s == 0) {
                                L14: {
                                  if (param0.field_u > ((bh) this).field_g) {
                                    ((bh) this).field_b = 1;
                                    break L14;
                                  } else {
                                    ((bh) this).field_b = -1;
                                    break L14;
                                  }
                                }
                                var4 = param0;
                                if (!sn.field_n) {
                                  break L12;
                                } else {
                                  sn.field_n = false;
                                  pm.field_db.g(6);
                                  this.a(param0, (byte) 43);
                                  break L12;
                                }
                              } else {
                                if (-1 != param0.field_s) {
                                  cf.field_q = -1;
                                  l.field_g = -1;
                                  break L12;
                                } else {
                                  L15: {
                                    if (((bh) this).field_g < param0.field_u) {
                                      ((bh) this).field_b = 1;
                                      break L15;
                                    } else {
                                      ((bh) this).field_b = -1;
                                      break L15;
                                    }
                                  }
                                  var4 = param0;
                                  if (sn.field_n) {
                                    sn.field_n = false;
                                    this.a(param0, (byte) 35);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var4 = param0;
                          break L11;
                        }
                      }
                    }
                    L16: {
                      var19 = ((bh) this).field_c.field_xc;
                      var7 = var19.field_ab.a((byte) -119, ((bh) this).field_g >> 1163645924) << 1220058788;
                      stackOut_126_0 = var19.field_ab;
                      stackIn_128_0 = stackOut_126_0;
                      stackIn_127_0 = stackOut_126_0;
                      if (param1) {
                        stackOut_128_0 = (hd) (Object) stackIn_128_0;
                        stackOut_128_1 = 0;
                        stackIn_129_0 = stackOut_128_0;
                        stackIn_129_1 = stackOut_128_1;
                        break L16;
                      } else {
                        stackOut_127_0 = (hd) (Object) stackIn_127_0;
                        stackOut_127_1 = 1;
                        stackIn_129_0 = stackOut_127_0;
                        stackIn_129_1 = stackOut_127_1;
                        break L16;
                      }
                    }
                    L17: {
                      var8 = ((hd) (Object) stackIn_129_0).a(stackIn_129_1 != 0, ((bh) this).field_g >> 946937988) << -1547780636;
                      var9 = var19.field_ab.b((byte) 124, ((bh) this).field_g >> -1907877564) << -1671643100;
                      var10 = var7;
                      if (((bh) this).field_h) {
                        break L17;
                      } else {
                        if (var8 != var9) {
                          var10 = var8;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      var11 = -((bh) this).field_q;
                      if (var11 - -4000 >= var10) {
                        break L18;
                      } else {
                        if (!((bh) this).field_h) {
                          ((bh) this).field_g = var5;
                          ((bh) this).field_l = 0;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (-1 >= (((bh) this).field_m ^ -1)) {
                        if (var11 <= var10) {
                          stackOut_141_0 = 1;
                          stackIn_143_0 = stackOut_141_0;
                          break L19;
                        } else {
                          stackOut_140_0 = 0;
                          stackIn_143_0 = stackOut_140_0;
                          break L19;
                        }
                      } else {
                        stackOut_138_0 = 0;
                        stackIn_143_0 = stackOut_138_0;
                        break L19;
                      }
                    }
                    L20: {
                      var12 = stackIn_143_0;
                      if (var12 != 0) {
                        L21: {
                          if (Math.abs(((bh) this).field_m) > Math.abs(((bh) this).field_l)) {
                            ((bh) this).field_l = 0;
                            break L21;
                          } else {
                            if (((bh) this).field_c.i(28, -27)) {
                              ((bh) this).field_l = ((bh) this).field_l * 7 / 10;
                              break L21;
                            } else {
                              L22: {
                                if (((bh) this).field_l >= 0) {
                                  break L22;
                                } else {
                                  ((bh) this).field_l = -(9 * -((bh) this).field_l / 10);
                                  break L22;
                                }
                              }
                              if ((((bh) this).field_l ^ -1) < -1) {
                                ((bh) this).field_l = ((bh) this).field_l * 9 / 10;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        L23: {
                          if (!var19.field_j) {
                            L24: {
                              if (((bh) this).field_d == 0) {
                                break L24;
                              } else {
                                if (((bh) this).field_h) {
                                  break L24;
                                } else {
                                  L25: {
                                    stackOut_185_0 = 250;
                                    stackOut_185_1 = var19.field_ab;
                                    stackIn_187_0 = stackOut_185_0;
                                    stackIn_187_1 = stackOut_185_1;
                                    stackIn_186_0 = stackOut_185_0;
                                    stackIn_186_1 = stackOut_185_1;
                                    if (param1) {
                                      stackOut_187_0 = stackIn_187_0;
                                      stackOut_187_1 = (hd) (Object) stackIn_187_1;
                                      stackOut_187_2 = 0;
                                      stackIn_188_0 = stackOut_187_0;
                                      stackIn_188_1 = stackOut_187_1;
                                      stackIn_188_2 = stackOut_187_2;
                                      break L25;
                                    } else {
                                      stackOut_186_0 = stackIn_186_0;
                                      stackOut_186_1 = (hd) (Object) stackIn_186_1;
                                      stackOut_186_2 = 1;
                                      stackIn_188_0 = stackOut_186_0;
                                      stackIn_188_1 = stackOut_186_1;
                                      stackIn_188_2 = stackOut_186_2;
                                      break L25;
                                    }
                                  }
                                  if (stackIn_188_0 >= ((hd) (Object) stackIn_188_1).a(stackIn_188_2 != 0, ((bh) this).field_d * 10 + (((bh) this).field_g >> 782241508)) + (((bh) this).field_q >> -239682556)) {
                                    break L24;
                                  } else {
                                    ((bh) this).field_d = 0;
                                    break L24;
                                  }
                                }
                              }
                            }
                            if (((bh) this).field_d == -1) {
                              break L23;
                            } else {
                              L26: {
                                ((bh) this).field_b = ((bh) this).field_d;
                                if (-1 < ((bh) this).field_a) {
                                  ((bh) this).field_a = ((bh) this).field_a - 1;
                                  break L26;
                                } else {
                                  break L26;
                                }
                              }
                              L27: {
                                if (((bh) this).field_h) {
                                  L28: {
                                    stackOut_199_0 = this;
                                    stackIn_201_0 = stackOut_199_0;
                                    stackIn_200_0 = stackOut_199_0;
                                    if (var19.field_ab.a((byte) -106, (((bh) this).field_g >> -1240405980) + ((bh) this).field_b * 10) <= 5 + (-((bh) this).field_q >> 796293764)) {
                                      stackOut_201_0 = this;
                                      stackOut_201_1 = ((bh) this).field_a;
                                      stackIn_202_0 = stackOut_201_0;
                                      stackIn_202_1 = stackOut_201_1;
                                      break L28;
                                    } else {
                                      stackOut_200_0 = this;
                                      stackOut_200_1 = 50;
                                      stackIn_202_0 = stackOut_200_0;
                                      stackIn_202_1 = stackOut_200_1;
                                      break L28;
                                    }
                                  }
                                  ((bh) this).field_a = stackIn_202_1;
                                  break L27;
                                } else {
                                  L29: {
                                    stackOut_195_0 = this;
                                    stackIn_197_0 = stackOut_195_0;
                                    stackIn_196_0 = stackOut_195_0;
                                    if (var19.field_ab.a(false, (((bh) this).field_g >> -1539134748) + 10 * ((bh) this).field_b) > (-((bh) this).field_q >> 1959822628) - -5) {
                                      stackOut_197_0 = this;
                                      stackOut_197_1 = 50;
                                      stackIn_198_0 = stackOut_197_0;
                                      stackIn_198_1 = stackOut_197_1;
                                      break L29;
                                    } else {
                                      stackOut_196_0 = this;
                                      stackOut_196_1 = ((bh) this).field_a;
                                      stackIn_198_0 = stackOut_196_0;
                                      stackIn_198_1 = stackOut_196_1;
                                      break L29;
                                    }
                                  }
                                  ((bh) this).field_a = stackIn_198_1;
                                  break L27;
                                }
                              }
                              if (39 != ((bh) this).field_c.field_rc) {
                                L30: {
                                  stackOut_205_0 = this;
                                  stackOut_205_1 = ((bh) this).field_g;
                                  stackOut_205_2 = ((bh) this).field_b;
                                  stackOut_205_3 = ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25];
                                  stackIn_207_0 = stackOut_205_0;
                                  stackIn_207_1 = stackOut_205_1;
                                  stackIn_207_2 = stackOut_205_2;
                                  stackIn_207_3 = stackOut_205_3;
                                  stackIn_206_0 = stackOut_205_0;
                                  stackIn_206_1 = stackOut_205_1;
                                  stackIn_206_2 = stackOut_205_2;
                                  stackIn_206_3 = stackOut_205_3;
                                  if (0 == ((bh) this).field_a) {
                                    stackOut_207_0 = this;
                                    stackOut_207_1 = stackIn_207_1;
                                    stackOut_207_2 = stackIn_207_2;
                                    stackOut_207_3 = (int[]) (Object) stackIn_207_3;
                                    stackOut_207_4 = 0;
                                    stackIn_208_0 = stackOut_207_0;
                                    stackIn_208_1 = stackOut_207_1;
                                    stackIn_208_2 = stackOut_207_2;
                                    stackIn_208_3 = stackOut_207_3;
                                    stackIn_208_4 = stackOut_207_4;
                                    break L30;
                                  } else {
                                    stackOut_206_0 = this;
                                    stackOut_206_1 = stackIn_206_1;
                                    stackOut_206_2 = stackIn_206_2;
                                    stackOut_206_3 = (int[]) (Object) stackIn_206_3;
                                    stackOut_206_4 = 5;
                                    stackIn_208_0 = stackOut_206_0;
                                    stackIn_208_1 = stackOut_206_1;
                                    stackIn_208_2 = stackOut_206_2;
                                    stackIn_208_3 = stackOut_206_3;
                                    stackIn_208_4 = stackOut_206_4;
                                    break L30;
                                  }
                                }
                                ((bh) this).field_g = stackIn_208_1 + stackIn_208_2 * (stackIn_208_3[stackIn_208_4] * 3);
                                break L23;
                              } else {
                                ((bh) this).field_g = ((bh) this).field_g + 500 * ((bh) this).field_b;
                                break L23;
                              }
                            }
                          } else {
                            break L23;
                          }
                        }
                        L31: {
                          var13 = -var19.field_ab.a((byte) -113, ((bh) this).field_g >> -1952350492) << 359272772;
                          var14 = -var19.field_ab.b((byte) 122, ((bh) this).field_g >> 79172228) << -100749820;
                          var15 = -var19.field_ab.a(false, ((bh) this).field_g >> 692411620) << 1504754980;
                          var16 = var13;
                          if (((bh) this).field_h) {
                            break L31;
                          } else {
                            if (var14 != var15) {
                              var16 = var15;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          var12 = 0;
                          var17 = 1024;
                          if ((((bh) this).field_q - var16 ^ -1) >= -4001) {
                            if (var16 + -var17 <= ((bh) this).field_q) {
                              var12 = 1;
                              ((bh) this).field_q = var16;
                              break L32;
                            } else {
                              break L32;
                            }
                          } else {
                            ((bh) this).field_g = var5;
                            ((bh) this).field_l = 0;
                            break L32;
                          }
                        }
                        L33: {
                          L34: {
                            stackOut_218_0 = this;
                            stackIn_221_0 = stackOut_218_0;
                            stackIn_219_0 = stackOut_218_0;
                            if (var13 == var15) {
                              break L34;
                            } else {
                              stackOut_219_0 = this;
                              stackIn_221_0 = stackOut_219_0;
                              stackIn_220_0 = stackOut_219_0;
                              if (var15 >= ((bh) this).field_q) {
                                break L34;
                              } else {
                                stackOut_220_0 = this;
                                stackOut_220_1 = 1;
                                stackIn_222_0 = stackOut_220_0;
                                stackIn_222_1 = stackOut_220_1;
                                break L33;
                              }
                            }
                          }
                          stackOut_221_0 = this;
                          stackOut_221_1 = 0;
                          stackIn_222_0 = stackOut_221_0;
                          stackIn_222_1 = stackOut_221_1;
                          break L33;
                        }
                        L35: {
                          ((bh) this).field_h = stackIn_222_1 != 0;
                          if (var12 != 0) {
                            ((bh) this).field_m = 0;
                            break L35;
                          } else {
                            ((bh) this).field_l = ((bh) this).field_b * ((bh) this).field_e;
                            ((bh) this).field_m = ((bh) this).field_m + var19.field_z;
                            break L35;
                          }
                        }
                        ((bh) this).field_j = false;
                        ((bh) this).field_r = false;
                        break L20;
                      } else {
                        L36: {
                          ((bh) this).field_m = ((bh) this).field_m + var19.field_z;
                          if (!((bh) this).field_r) {
                            break L36;
                          } else {
                            ((bh) this).field_m = ((bh) this).field_m - var19.field_z * 3 / 4;
                            break L36;
                          }
                        }
                        L37: {
                          L38: {
                            ((bh) this).field_a = 0;
                            ((bh) this).field_j = true;
                            var13 = -var19.field_ab.a((byte) -103, ((bh) this).field_g >> 1382459236) << -601933628;
                            var14 = -var19.field_ab.a(false, ((bh) this).field_g >> 130301988) << 572555940;
                            var15 = -var19.field_ab.b((byte) 125, ((bh) this).field_g >> 1697779332) << 2078526180;
                            stackOut_146_0 = this;
                            stackIn_149_0 = stackOut_146_0;
                            stackIn_147_0 = stackOut_146_0;
                            if (var14 == var13) {
                              break L38;
                            } else {
                              stackOut_147_0 = this;
                              stackIn_149_0 = stackOut_147_0;
                              stackIn_148_0 = stackOut_147_0;
                              if (var14 >= ((bh) this).field_q) {
                                break L38;
                              } else {
                                stackOut_148_0 = this;
                                stackOut_148_1 = 1;
                                stackIn_150_0 = stackOut_148_0;
                                stackIn_150_1 = stackOut_148_1;
                                break L37;
                              }
                            }
                          }
                          stackOut_149_0 = this;
                          stackOut_149_1 = 0;
                          stackIn_150_0 = stackOut_149_0;
                          stackIn_150_1 = stackOut_149_1;
                          break L37;
                        }
                        ((bh) this).field_h = stackIn_150_1 != 0;
                        if (((bh) this).field_h) {
                          L39: {
                            if (var15 != var14) {
                              if (var15 > ((bh) this).field_q) {
                                ((bh) this).field_h = false;
                                ((bh) this).field_q = var14;
                                break L39;
                              } else {
                                var15 = var15 + (((bh) this).field_c.field_Db << 2103887428);
                                if (((bh) this).field_q >= var15) {
                                  break L39;
                                } else {
                                  if (var19.b(((bh) this).field_g, -5)) {
                                    if (var19.field_ab.a(false, var5 >> -1571821596) == var19.field_ab.b((byte) 119, var5 >> 1306007396)) {
                                      ((bh) this).field_m = ((bh) this).field_m / 2;
                                      ((bh) this).field_l = -((bh) this).field_l / 2;
                                      ((bh) this).field_g = var5;
                                      break L39;
                                    } else {
                                      L40: {
                                        if ((((bh) this).field_m ^ -1) > -1) {
                                          ((bh) this).field_m = -((bh) this).field_m / 2;
                                          break L40;
                                        } else {
                                          break L40;
                                        }
                                      }
                                      ((bh) this).field_q = var15;
                                      break L39;
                                    }
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                            } else {
                              break L39;
                            }
                          }
                          if (((bh) this).field_q > var13) {
                            ((bh) this).field_q = var13;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (var14 == var15) {
                            if (var13 >= ((bh) this).field_q) {
                              break L20;
                            } else {
                              ((bh) this).field_l = ((bh) this).field_l / 2;
                              ((bh) this).field_m = ((bh) this).field_m - 5;
                              ((bh) this).field_q = var13;
                              break L20;
                            }
                          } else {
                            if (var14 >= ((bh) this).field_q) {
                              break L20;
                            } else {
                              ((bh) this).field_m = ((bh) this).field_m - 5;
                              ((bh) this).field_q = var14;
                              ((bh) this).field_l = ((bh) this).field_l / 2;
                              break L20;
                            }
                          }
                        }
                      }
                    }
                    return var4;
                  } else {
                    L41: {
                      if (param2 != var6.field_x) {
                        break L41;
                      } else {
                        if (var6.field_s != 0) {
                          break L41;
                        } else {
                          L42: {
                            if (var6.field_u <= ((bh) this).field_g) {
                              ((bh) this).field_b = -1;
                              break L42;
                            } else {
                              ((bh) this).field_b = 1;
                              break L42;
                            }
                          }
                          if (-1 == (((bh) this).field_d ^ -1)) {
                            break L41;
                          } else {
                            if (((bh) this).field_b == ((bh) this).field_d) {
                              break L41;
                            } else {
                              ((bh) this).field_d = 0;
                              break L41;
                            }
                          }
                        }
                      }
                    }
                    var6 = (je) (Object) ((bh) this).field_c.field_B.a((byte) -46);
                    continue L10;
                  }
                }
              } else {
                L43: {
                  L44: {
                    if (((bh) this).field_r) {
                      break L44;
                    } else {
                      if (var6.field_x == param2) {
                        if ((var6.field_s ^ -1) == -4) {
                          L45: {
                            var4 = var6;
                            if (!((bh) this).field_j) {
                              break L45;
                            } else {
                              if (0 >= ((bh) this).field_c.field_cb) {
                                break L43;
                              } else {
                                break L45;
                              }
                            }
                          }
                          if (((bh) this).field_j) {
                            this.a(true, var6);
                            break L43;
                          } else {
                            ((bh) this).field_d = 0;
                            break L43;
                          }
                        } else {
                          if (0 == var6.field_s) {
                            var4 = var6;
                            if (((bh) this).field_g < var6.field_u) {
                              ((bh) this).field_b = 1;
                              break L43;
                            } else {
                              ((bh) this).field_b = -1;
                              break L43;
                            }
                          } else {
                            if (6 != var6.field_s) {
                              break L43;
                            } else {
                              ((bh) this).field_d = var6.field_A;
                              break L43;
                            }
                          }
                        }
                      } else {
                        break L44;
                      }
                    }
                  }
                  if (((bh) this).field_r) {
                    break L43;
                  } else {
                    if (var6.field_r - 100 - -ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25][2] != param2 + -1) {
                      break L43;
                    } else {
                      if (3 != var6.field_s) {
                        break L43;
                      } else {
                        if (!((bh) this).field_j) {
                          ((bh) this).field_a = 0;
                          this.a(true, var6);
                          break L43;
                        } else {
                          var6 = (je) (Object) ((bh) this).field_c.field_Ec.a((byte) -45);
                          continue L9;
                        }
                      }
                    }
                  }
                }
                var6 = (je) (Object) ((bh) this).field_c.field_Ec.a((byte) -45);
                continue L9;
              }
            }
          } else {
            L46: {
              L47: {
                L48: {
                  if (!((bh) this).field_r) {
                    break L48;
                  } else {
                    if (var6.field_s == 6) {
                      break L48;
                    } else {
                      if (!((bh) this).field_r) {
                        break L47;
                      } else {
                        if (var6.field_s != -4) {
                          break L47;
                        } else {
                          if (-1 <= ((bh) this).field_p) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                    }
                  }
                }
                if (param2 != var6.field_x) {
                  break L47;
                } else {
                  if (-4 == (var6.field_s ^ -1)) {
                    L49: {
                      L50: {
                        if (!((bh) this).field_j) {
                          break L50;
                        } else {
                          if (-1 > (((bh) this).field_c.field_cb ^ -1)) {
                            break L50;
                          } else {
                            if ((((bh) this).field_c.field_Fb ^ -1) >= -1) {
                              break L49;
                            } else {
                              if (((bh) this).field_r) {
                                break L50;
                              } else {
                                break L49;
                              }
                            }
                          }
                        }
                      }
                      if (!((bh) this).field_j) {
                        ((bh) this).field_d = 0;
                        break L49;
                      } else {
                        this.a(true, var6);
                        ((bh) this).field_r = false;
                        break L49;
                      }
                    }
                    var4 = var6;
                    break L46;
                  } else {
                    if (var6.field_s == 0) {
                      L51: {
                        if (var6.field_u > ((bh) this).field_g) {
                          ((bh) this).field_b = 1;
                          break L51;
                        } else {
                          ((bh) this).field_b = -1;
                          break L51;
                        }
                      }
                      var4 = var6;
                      break L46;
                    } else {
                      if (6 != var6.field_s) {
                        break L46;
                      } else {
                        L52: {
                          L53: {
                            var7 = ((bh) this).field_d;
                            ((bh) this).field_d = var6.field_A;
                            if (0 > ((bh) this).field_d) {
                              break L53;
                            } else {
                              if (-2 <= (((bh) this).field_d ^ -1)) {
                                break L52;
                              } else {
                                break L53;
                              }
                            }
                          }
                          ((bh) this).field_d = -1;
                          break L52;
                        }
                        if (var7 != ((bh) this).field_d) {
                          ((bh) this).field_a = 0;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                  }
                }
              }
              if (((bh) this).field_r) {
                break L46;
              } else {
                if (-100 + var6.field_r - -ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25][2] == -1 + param2) {
                  if ((var6.field_s ^ -1) == -4) {
                    if (((bh) this).field_j) {
                      break L46;
                    } else {
                      ((bh) this).field_a = 0;
                      this.a(param1, var6);
                      break L46;
                    }
                  } else {
                    break L46;
                  }
                } else {
                  break L46;
                }
              }
            }
            var6 = (je) (Object) ((bh) this).field_c.field_B.a((byte) -59);
            continue L8;
          }
        }
    }

    private final void a(je param0, byte param1) {
        nk[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        nk[] var6 = null;
        L0: {
          var5 = SteelSentinels.field_G;
          if (((bh) this).field_g >= param0.field_u) {
            ((bh) this).field_b = -1;
            break L0;
          } else {
            ((bh) this).field_b = 1;
            break L0;
          }
        }
        if (((bh) this).field_c.field_Zb == null) {
          return;
        } else {
          L1: {
            if (param1 > 0) {
              break L1;
            } else {
              ((bh) this).field_c = null;
              break L1;
            }
          }
          var6 = ((bh) this).field_c.field_Zb.a(0, ((bh) this).field_c, new nk[0], ((bh) this).field_b * param0.field_B, param0.field_A);
          var3 = var6;
          ((bh) this).field_c.field_Zb.a(param0.field_B * ((bh) this).field_b, -86, param0.field_A);
          ((bh) this).field_c.field_Zb.b((byte) -128, ((bh) this).field_g, ((bh) this).field_b, ((bh) this).field_q);
          var4 = 0;
          L2: while (true) {
            if (var4 >= var6.length) {
              return;
            } else {
              this.a(true, var6[var4], param0);
              var4 = var6.length;
              continue L2;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        if (kc.field_y != null) {
            kc.field_y.a(param1, (byte) 127);
        }
        if (param0 != -115) {
            field_o = null;
        }
    }

    final wl a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        double var11_double = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        wl var19 = null;
        int var20 = 0;
        int var21 = 0;
        wl stackIn_146_0 = null;
        wl stackIn_147_0 = null;
        wl stackIn_148_0 = null;
        mb stackIn_148_1 = null;
        wl stackOut_145_0 = null;
        wl stackOut_147_0 = null;
        mb stackOut_147_1 = null;
        wl stackOut_146_0 = null;
        Object stackOut_146_1 = null;
        L0: {
          L1: {
            var21 = SteelSentinels.field_G;
            if (18 == param0) {
              break L1;
            } else {
              if (-30 == (param0 ^ -1)) {
                break L1;
              } else {
                if (param0 == -44) {
                  break L1;
                } else {
                  if (param0 == 21) {
                    break L1;
                  } else {
                    if (34 == param0) {
                      break L1;
                    } else {
                      if (47 == param0) {
                        break L1;
                      } else {
                        if (-53 == param0) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (((bh) this).field_c.field_Vb != null) {
            L2: {
              param2 = ((bh) this).field_c.field_Vb.field_hc;
              param6 = -(((bh) this).field_c.field_Vb.field_Db << -642824541) + ((bh) this).field_c.field_Vb.field_Gb;
              var9 = param2 - ((bh) this).field_g;
              var10 = -param4 + param6;
              if (-1 >= (var9 ^ -1)) {
                ((bh) this).field_b = 1;
                break L2;
              } else {
                ((bh) this).field_b = -1;
                break L2;
              }
            }
            L3: {
              if (((bh) this).field_b == ((bh) this).field_d) {
                break L3;
              } else {
                ((bh) this).field_d = 0;
                break L3;
              }
            }
            var11_double = Math.atan2((double)var9, (double)(-var10));
            param3 = (int)(65536.0 * var11_double / 6.283185307179586);
            if (0 <= ((bh) this).field_b) {
              if (16383 >= param3) {
                break L0;
              } else {
                param3 = param3 + 65536;
                break L0;
              }
            } else {
              if (param3 > 16384) {
                param3 = param3 - 65536;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          var8 = 2;
          var9 = -((bh) this).field_g + param2;
          if (-1 > var9) {
            ((bh) this).field_b = -1;
            break L4;
          } else {
            ((bh) this).field_b = 1;
            break L4;
          }
        }
        L5: {
          var10 = param6 - ((bh) this).field_q;
          if (((bh) this).field_b != ((bh) this).field_d) {
            ((bh) this).field_d = 0;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var11 = 0;
          var11 = param5;
          var12 = 0;
          if (param0 == 17) {
            var8 = 5;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var12 = param4;
          if (18 == param0) {
            var8 = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if ((param0 ^ -1) != -20) {
            break L8;
          } else {
            var8 = 1;
            break L8;
          }
        }
        L9: {
          if ((param0 ^ -1) != -21) {
            break L9;
          } else {
            var8 = 6;
            break L9;
          }
        }
        L10: {
          if (21 != param0) {
            break L10;
          } else {
            var8 = 4;
            break L10;
          }
        }
        L11: {
          if (22 == param0) {
            var8 = 7;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (23 != param0) {
            break L12;
          } else {
            var8 = 3;
            break L12;
          }
        }
        L13: {
          if (-25 != (param0 ^ -1)) {
            break L13;
          } else {
            var8 = 2;
            break L13;
          }
        }
        L14: {
          if (param0 != -26) {
            break L14;
          } else {
            var8 = 2;
            break L14;
          }
        }
        L15: {
          if (26 != param0) {
            break L15;
          } else {
            var8 = 2;
            break L15;
          }
        }
        L16: {
          if (-28 == param0) {
            var8 = 4;
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          if (param0 != 38) {
            break L17;
          } else {
            var8 = 4;
            break L17;
          }
        }
        L18: {
          if (-29 == param0) {
            var8 = 5;
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          if (param0 == 29) {
            var8 = 0;
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          if (-31 == param0) {
            var8 = 1;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (-32 == (param0 ^ -1)) {
            var8 = 1;
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if ((param0 ^ -1) == -33) {
            var8 = 1;
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if ((param0 ^ -1) != -34) {
            break L23;
          } else {
            var8 = 6;
            break L23;
          }
        }
        L24: {
          if (param0 != 34) {
            break L24;
          } else {
            var8 = 4;
            break L24;
          }
        }
        L25: {
          if (35 == param0) {
            var8 = 7;
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          if (param0 == -37) {
            var8 = 2;
            break L26;
          } else {
            break L26;
          }
        }
        L27: {
          if (param0 != 37) {
            break L27;
          } else {
            var8 = 2;
            break L27;
          }
        }
        L28: {
          if (-47 != param0) {
            break L28;
          } else {
            var8 = 6;
            break L28;
          }
        }
        L29: {
          if (param0 == 43) {
            var8 = 0;
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          if (-45 != (param0 ^ -1)) {
            break L30;
          } else {
            var8 = 1;
            break L30;
          }
        }
        L31: {
          if (param0 != 47) {
            break L31;
          } else {
            var8 = 4;
            break L31;
          }
        }
        L32: {
          if ((param0 ^ -1) != -46) {
            break L32;
          } else {
            var8 = 1;
            break L32;
          }
        }
        L33: {
          if (48 == param0) {
            var8 = 7;
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          if (param0 == 52) {
            var8 = 4;
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          if (param0 == 51) {
            var8 = 3;
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          if (param0 == 50) {
            var8 = 2;
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          if ((param0 ^ -1) != -50) {
            break L37;
          } else {
            var8 = 2;
            break L37;
          }
        }
        L38: {
          var13 = (int)(10.0 * Math.sqrt((double)(var9 / 100 * var9 - -(var10 / 100 * var10))));
          var14 = 192;
          var15 = 0;
          var16 = 4;
          var17 = 45;
          if (-19 == (param0 ^ -1)) {
            var17 -= 20;
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          if (param0 == 29) {
            var17 -= 10;
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          if (param1 > 18) {
            break L40;
          } else {
            ((bh) this).a((byte) 116, 50, 70, -127, false, -106);
            break L40;
          }
        }
        L41: {
          if ((param0 ^ -1) != -44) {
            break L41;
          } else {
            var17 -= 5;
            break L41;
          }
        }
        L42: {
          var18 = 1;
          if (var8 != 5) {
            break L42;
          } else {
            var15 = 7;
            var17 = 45;
            break L42;
          }
        }
        L43: {
          if (var8 != 1) {
            break L43;
          } else {
            var15 = 1;
            var14 = 256;
            var17 = 5000;
            var16 = 0;
            var18 = 32;
            if ((param0 ^ -1) != -20) {
              L44: {
                if (param0 == 31) {
                  break L44;
                } else {
                  if ((param0 ^ -1) != -46) {
                    break L43;
                  } else {
                    break L44;
                  }
                }
              }
              var14 = cl.a(param3, 48);
              break L43;
            } else {
              var15 = 20;
              break L43;
            }
          }
        }
        L45: {
          if ((var8 ^ -1) != -8) {
            break L45;
          } else {
            var17 = 5000;
            var16 = 0;
            var18 = 250;
            var15 = 6;
            var14 = 192;
            break L45;
          }
        }
        L46: {
          if (var8 != 2) {
            break L46;
          } else {
            var14 = 16;
            var17 = 5000;
            var16 = 0;
            var15 = 2;
            var18 = 250;
            break L46;
          }
        }
        L47: {
          if (var8 != 3) {
            break L47;
          } else {
            var17 = 5000;
            var15 = 3;
            var18 = 250;
            var16 = 20;
            var14 = 16;
            break L47;
          }
        }
        L48: {
          if (-5 == (var8 ^ -1)) {
            var17 = 5;
            var18 = 1;
            var16 = 32;
            var15 = 4;
            var14 = 256;
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var9 = jh.a(param3 >> 65645827, 4096) * 100 >> 1261673712;
          if ((var13 ^ -1) <= -2) {
            break L49;
          } else {
            var13 = 1;
            break L49;
          }
        }
        L50: {
          if (6 != var8) {
            break L50;
          } else {
            var16 = 32;
            var15 = 5;
            var14 = 512;
            var17 = 5;
            var18 = 1;
            break L50;
          }
        }
        L51: {
          var10 = -kg.a(param3 >> -1882338141, (byte) -101) * 100 >> -440947280;
          var13 = 100;
          if (null != ie.field_f[param0 - 17]) {
            var19_int = ie.field_f[param0 + -17][0];
            var20 = ie.field_f[param0 - 17][1];
            var12 = var12 - var20 * (var10 * 32) / var13;
            var11 = var11 - var20 * (var9 * 32) / var13;
            var12 = var12 + 32 * (((bh) this).field_b * var9) * var19_int / var13;
            var11 = var11 - 32 * (((bh) this).field_b * var10 * var19_int) / var13;
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var19 = new wl(var11, var12, var14 * var9 / var13, var14 * var10 / var13, var17, var16, var15, ((bh) this).field_c.field_xc, ((bh) this).field_c, 0, var18, param0 + -17);
          var19.field_K = var11 - -(var9 * 100);
          var19.field_S = 100 * var10 + var12;
          if (var8 == 3) {
            var19.field_S = param6;
            var19.field_K = param2;
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          stackOut_145_0 = (wl) var19;
          stackIn_147_0 = stackOut_145_0;
          stackIn_146_0 = stackOut_145_0;
          if (var19.field_X != null) {
            stackOut_147_0 = (wl) (Object) stackIn_147_0;
            stackOut_147_1 = var19.field_X.field_Vb;
            stackIn_148_0 = stackOut_147_0;
            stackIn_148_1 = stackOut_147_1;
            break L53;
          } else {
            stackOut_146_0 = (wl) (Object) stackIn_146_0;
            stackOut_146_1 = null;
            stackIn_148_0 = stackOut_146_0;
            stackIn_148_1 = (mb) (Object) stackOut_146_1;
            break L53;
          }
        }
        stackIn_148_0.field_nb = stackIn_148_1;
        var19.field_fb = null;
        var19.field_V = true;
        var19.field_I = true;
        return var19;
    }

    private final void a(boolean param0, nk param1, je param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7_double = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        wl var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        wl stackIn_149_0 = null;
        wl stackIn_150_0 = null;
        wl stackIn_151_0 = null;
        mb stackIn_151_1 = null;
        wl stackIn_152_0 = null;
        wl stackIn_153_0 = null;
        wl stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        wl stackOut_148_0 = null;
        wl stackOut_150_0 = null;
        mb stackOut_150_1 = null;
        wl stackOut_149_0 = null;
        Object stackOut_149_1 = null;
        wl stackOut_151_0 = null;
        wl stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        wl stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        L0: {
          L1: {
            var17 = SteelSentinels.field_G;
            if (param1.field_N == 18) {
              break L1;
            } else {
              if (param1.field_N == 29) {
                break L1;
              } else {
                if (-44 == (param1.field_N ^ -1)) {
                  break L1;
                } else {
                  if (param1.field_N == -22) {
                    break L1;
                  } else {
                    if (-35 == param1.field_N) {
                      break L1;
                    } else {
                      if (param1.field_N == 47) {
                        break L1;
                      } else {
                        if (-53 != (param1.field_N ^ -1)) {
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          if (null != ((bh) this).field_c.field_Vb) {
            L2: {
              param2.field_u = ((bh) this).field_c.field_Vb.field_hc;
              param2.field_y = -(((bh) this).field_c.field_Vb.field_Db << 36003139) + ((bh) this).field_c.field_Vb.field_Gb;
              var5 = -((bh) this).field_g + param2.field_u;
              var6 = -param1.field_V + param2.field_y;
              if (0 > var5) {
                ((bh) this).field_b = -1;
                break L2;
              } else {
                ((bh) this).field_b = 1;
                break L2;
              }
            }
            L3: {
              if (((bh) this).field_b == ((bh) this).field_d) {
                break L3;
              } else {
                ((bh) this).field_d = 0;
                break L3;
              }
            }
            L4: {
              var7_double = Math.atan2((double)var5, (double)(-var6));
              param2.field_B = (int)(var7_double * 65536.0 / 6.283185307179586);
              if (((bh) this).field_b < 0) {
                if (-16385 >= param2.field_B) {
                  break L4;
                } else {
                  param2.field_B = param2.field_B - 65536;
                  break L4;
                }
              } else {
                if (16383 < param2.field_B) {
                  param2.field_B = param2.field_B + 65536;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1.field_K <= ((bh) this).field_b * param2.field_B) {
                break L5;
              } else {
                param2.field_B = ((bh) this).field_b * param1.field_K;
                break L5;
              }
            }
            if (param1.field_W < param2.field_B * ((bh) this).field_b) {
              param2.field_B = ((bh) this).field_b * param1.field_W;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L6: {
          var4 = 2;
          var5 = -((bh) this).field_g + param2.field_u;
          var6 = param2.field_y + -((bh) this).field_q;
          if ((var5 ^ -1) <= -1) {
            ((bh) this).field_b = 1;
            break L6;
          } else {
            ((bh) this).field_b = -1;
            break L6;
          }
        }
        L7: {
          if (((bh) this).field_b != ((bh) this).field_d) {
            ((bh) this).field_d = 0;
            break L7;
          } else {
            break L7;
          }
        }
        var7 = 0;
        var8 = 0;
        if (param1 == null) {
          return;
        } else {
          L8: {
            if (param1.field_N == 17) {
              var4 = 5;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var8 = param1.field_V;
            var7 = param1.field_T;
            if (param1.field_N == -19) {
              var4 = 0;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            if (19 != param1.field_N) {
              break L10;
            } else {
              var4 = 1;
              break L10;
            }
          }
          L11: {
            if (-21 == param1.field_N) {
              var4 = 6;
              break L11;
            } else {
              break L11;
            }
          }
          L12: {
            if (param1.field_N == 21) {
              var4 = 4;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (param1.field_N != -23) {
              break L13;
            } else {
              var4 = 7;
              break L13;
            }
          }
          L14: {
            if (param1.field_N != 23) {
              break L14;
            } else {
              var4 = 3;
              break L14;
            }
          }
          L15: {
            if (-25 != param1.field_N) {
              break L15;
            } else {
              var4 = 2;
              break L15;
            }
          }
          L16: {
            if (-26 != param1.field_N) {
              break L16;
            } else {
              var4 = 2;
              break L16;
            }
          }
          L17: {
            if (-27 == param1.field_N) {
              var4 = 2;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (param1.field_N == 27) {
              var4 = 4;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (38 != param1.field_N) {
              break L19;
            } else {
              var4 = 4;
              break L19;
            }
          }
          L20: {
            if (param1.field_N == 28) {
              var4 = 5;
              break L20;
            } else {
              break L20;
            }
          }
          L21: {
            if (29 != param1.field_N) {
              break L21;
            } else {
              var4 = 0;
              break L21;
            }
          }
          L22: {
            if (-31 != (param1.field_N ^ -1)) {
              break L22;
            } else {
              var4 = 1;
              break L22;
            }
          }
          L23: {
            if (param1.field_N != 31) {
              break L23;
            } else {
              var4 = 1;
              break L23;
            }
          }
          L24: {
            if (32 == param1.field_N) {
              var4 = 1;
              break L24;
            } else {
              break L24;
            }
          }
          L25: {
            if (param1.field_N == -34) {
              var4 = 6;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (-35 != param1.field_N) {
              break L26;
            } else {
              var4 = 4;
              break L26;
            }
          }
          L27: {
            if (35 == param1.field_N) {
              var4 = 7;
              break L27;
            } else {
              break L27;
            }
          }
          L28: {
            if ((param1.field_N ^ -1) == -37) {
              var4 = 2;
              break L28;
            } else {
              break L28;
            }
          }
          L29: {
            if (param1.field_N == 37) {
              var4 = 2;
              break L29;
            } else {
              break L29;
            }
          }
          L30: {
            if (param1.field_N != 46) {
              break L30;
            } else {
              var4 = 6;
              break L30;
            }
          }
          L31: {
            if (-44 == (param1.field_N ^ -1)) {
              var4 = 0;
              break L31;
            } else {
              break L31;
            }
          }
          L32: {
            if (param1.field_N != 44) {
              break L32;
            } else {
              var4 = 1;
              break L32;
            }
          }
          L33: {
            if ((param1.field_N ^ -1) != -48) {
              break L33;
            } else {
              var4 = 4;
              break L33;
            }
          }
          L34: {
            if ((param1.field_N ^ -1) == -46) {
              var4 = 1;
              break L34;
            } else {
              break L34;
            }
          }
          L35: {
            if (48 != param1.field_N) {
              break L35;
            } else {
              var4 = 7;
              break L35;
            }
          }
          L36: {
            if (param1.field_N == 52) {
              var4 = 4;
              break L36;
            } else {
              break L36;
            }
          }
          L37: {
            if (-52 != param1.field_N) {
              break L37;
            } else {
              var4 = 3;
              break L37;
            }
          }
          L38: {
            if (param1.field_N != 50) {
              break L38;
            } else {
              var4 = 2;
              break L38;
            }
          }
          L39: {
            if (-50 != param1.field_N) {
              break L39;
            } else {
              var4 = 2;
              break L39;
            }
          }
          L40: {
            var9 = 10 * (int)Math.sqrt((double)(var6 / 100 * var6 + var5 / 100 * var5));
            var10 = 192;
            var11 = 0;
            var12 = 4;
            var13 = 45;
            if (18 != param1.field_N) {
              break L40;
            } else {
              var13 -= 20;
              break L40;
            }
          }
          L41: {
            if (param1.field_N == 29) {
              var13 -= 10;
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            if (param1.field_N != 43) {
              break L42;
            } else {
              var13 -= 5;
              break L42;
            }
          }
          L43: {
            var14 = 1;
            if (var4 == -6) {
              var13 = 45;
              var11 = 7;
              break L43;
            } else {
              break L43;
            }
          }
          L44: {
            if (-2 == var4) {
              L45: {
                var10 = 256;
                var11 = 1;
                var12 = 0;
                if ((param1.field_N ^ -1) == -20) {
                  var11 = 20;
                  break L45;
                } else {
                  L46: {
                    if (param1.field_N == 31) {
                      break L46;
                    } else {
                      if ((param1.field_N ^ -1) == -46) {
                        break L46;
                      } else {
                        break L45;
                      }
                    }
                  }
                  var10 = cl.a(param2.field_B, -127);
                  break L45;
                }
              }
              var13 = 5000;
              var14 = 32;
              break L44;
            } else {
              break L44;
            }
          }
          L47: {
            if (7 != var4) {
              break L47;
            } else {
              var14 = 250;
              var11 = 6;
              var12 = 0;
              var10 = 192;
              var13 = 5000;
              break L47;
            }
          }
          L48: {
            if (var4 != 2) {
              break L48;
            } else {
              var12 = 0;
              var14 = 250;
              var13 = 5000;
              var11 = 2;
              var10 = 16;
              break L48;
            }
          }
          L49: {
            if (-4 == (var4 ^ -1)) {
              var13 = 5000;
              var14 = 250;
              var11 = 3;
              var12 = 20;
              var10 = 16;
              break L49;
            } else {
              break L49;
            }
          }
          L50: {
            if (4 != var4) {
              break L50;
            } else {
              var13 = 5;
              var14 = 1;
              var10 = 256;
              var12 = 32;
              var11 = 4;
              break L50;
            }
          }
          L51: {
            if (1 <= var9) {
              break L51;
            } else {
              var9 = 1;
              break L51;
            }
          }
          L52: {
            var5 = jh.a(param2.field_B >> -7377341, 4096) * 100 >> 1920141296;
            if (-7 != (var4 ^ -1)) {
              break L52;
            } else {
              var12 = 32;
              var10 = 512;
              var11 = 5;
              var13 = 5;
              var14 = 1;
              break L52;
            }
          }
          L53: {
            var6 = -kg.a(param2.field_B >> -1554008509, (byte) -87) * 100 >> 839342544;
            var9 = 100;
            if (null == ie.field_f[-17 + param1.field_N]) {
              break L53;
            } else {
              var15_int = -param1.field_G + ie.field_f[param1.field_N - 17][0];
              var16 = ie.field_f[-17 + param1.field_N][1] - param1.field_E;
              var7 = var7 - var16 * var5 * 32 / var9;
              var8 = var8 - var16 * (var6 * 32) / var9;
              var8 = var8 + 32 * (((bh) this).field_b * var15_int * var5) / var9;
              var7 = var7 - 32 * var15_int * var6 * ((bh) this).field_b / var9;
              break L53;
            }
          }
          L54: {
            var15 = new wl(var7, var8, var10 * var5 / var9, var6 * var10 / var9, var13, var12, var11, ((bh) this).field_c.field_xc, ((bh) this).field_c, 0, var14, param1.field_N + -17);
            var15.field_S = 100 * var6 + var8;
            var15.field_K = var5 * 100 + var7;
            stackOut_148_0 = (wl) var15;
            stackIn_150_0 = stackOut_148_0;
            stackIn_149_0 = stackOut_148_0;
            if (var15.field_X != null) {
              stackOut_150_0 = (wl) (Object) stackIn_150_0;
              stackOut_150_1 = var15.field_X.field_Vb;
              stackIn_151_0 = stackOut_150_0;
              stackIn_151_1 = stackOut_150_1;
              break L54;
            } else {
              stackOut_149_0 = (wl) (Object) stackIn_149_0;
              stackOut_149_1 = null;
              stackIn_151_0 = stackOut_149_0;
              stackIn_151_1 = (mb) (Object) stackOut_149_1;
              break L54;
            }
          }
          L55: {
            stackIn_151_0.field_nb = stackIn_151_1;
            var15.field_fb = null;
            stackOut_151_0 = (wl) var15;
            stackIn_153_0 = stackOut_151_0;
            stackIn_152_0 = stackOut_151_0;
            if (!param0) {
              stackOut_153_0 = (wl) (Object) stackIn_153_0;
              stackOut_153_1 = 0;
              stackIn_154_0 = stackOut_153_0;
              stackIn_154_1 = stackOut_153_1;
              break L55;
            } else {
              stackOut_152_0 = (wl) (Object) stackIn_152_0;
              stackOut_152_1 = 1;
              stackIn_154_0 = stackOut_152_0;
              stackIn_154_1 = stackOut_152_1;
              break L55;
            }
          }
          L56: {
            stackIn_154_0.field_V = stackIn_154_1 != 0;
            if (-4 != (var4 ^ -1)) {
              break L56;
            } else {
              var15.field_S = param2.field_y;
              var15.field_K = param2.field_u;
              break L56;
            }
          }
          pm.field_db.a(3, (ck) (Object) var15);
          cf.field_q = var15.field_A + -((bh) this).field_q;
          l.field_g = -((bh) this).field_g + var15.field_U;
          return;
        }
    }

    bh(mb param0) {
        ((bh) this).field_c = param0;
        ((bh) this).field_g = ((bh) this).field_c.field_hc;
        ((bh) this).field_d = ((bh) this).field_c.field_U;
        ((bh) this).field_p = ((bh) this).field_c.field_Qb;
        ((bh) this).field_l = ((bh) this).field_c.field_K;
        ((bh) this).field_j = ((bh) this).field_c.field_Lb;
        ((bh) this).field_h = ((bh) this).field_c.field_u;
        ((bh) this).field_a = ((bh) this).field_c.field_Pb;
        ((bh) this).field_r = ((bh) this).field_c.field_pc;
        ((bh) this).field_b = ((bh) this).field_c.field_E;
        ((bh) this).field_q = ((bh) this).field_c.field_Gb;
        ((bh) this).field_n = 16777215;
        ((bh) this).field_m = ((bh) this).field_c.field_ab;
        ((bh) this).field_e = ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25][0];
    }

    final static void a(int param0) {
        int var1 = (re.field_Z + -640) / 2;
        int var2 = an.field_h * an.field_h;
        int var3 = -(je.field_t * je.field_t) + var2;
        mg.field_Ub.a(param0 ^ 0, 90, -210 + (pb.field_j + -4), -(199 * var3 / var2) + var1, 199);
        pc.field_q.a(param0 ^ param0, 0, -4 + (-120 + pb.field_j), 438 * var3 / var2 + (202 + var1), 438);
    }

    final static int a(int[] param0, int param1, nk param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = SteelSentinels.field_G;
        var3 = 0;
        var4 = param2.i(-121);
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var4 <= var6) {
            L1: {
              if (var5 == 0) {
                break L1;
              } else {
                // wide iinc 3 3800
                break L1;
              }
            }
            if (param1 != 10) {
              return 78;
            } else {
              return var3;
            }
          } else {
            L2: {
              if (10 == param0[var6]) {
                var3 += 100;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0[var6] != 11) {
                break L3;
              } else {
                // wide iinc 3 200
                break L3;
              }
            }
            L4: {
              if (param0[var6] == 12) {
                // wide iinc 3 500
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (13 != param0[var6]) {
                break L5;
              } else {
                // wide iinc 3 1000
                break L5;
              }
            }
            L6: {
              if (param0[var6] != 34) {
                break L6;
              } else {
                var5 = 1;
                break L6;
              }
            }
            if (-15 == (param0[var6] ^ -1)) {
              // wide iinc 3 2000
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, je param1, int param2, int param3, int param4) {
        if (param3 != -1) {
            ((bh) this).field_d = 31;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Seriously offensive language";
        field_o = "Reject <%0> from this game";
    }
}
