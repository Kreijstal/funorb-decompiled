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

    public static void a() {
        field_o = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, boolean param4, int param5) {
        int[] var9 = null;
        if (param0 >= -11) {
            Object var10 = null;
            je discarded$0 = ((bh) this).a((je) null, false, -87);
        }
        int var7 = param2 + (((bh) this).field_g >> 8);
        int var8 = param5 + (((bh) this).field_q - ((bh) this).field_c.field_Db * 8 >> 8);
        ((bh) this).field_k = ((bh) this).field_k + 1;
        if (!(((bh) this).field_k < 16)) {
            ((bh) this).field_k = ((bh) this).field_k - 16;
            var9 = pe.field_o;
            if (!((255 & ((bh) this).field_n >> 16) <= (((bh) this).field_n & 255))) {
                var9 = pe.field_b;
                if (!(((bh) this).field_n >> 8 != ((bh) this).field_n >> 16)) {
                    var9 = pe.field_q;
                }
            }
            pb.a(var7 << 4, var8 << 4, param1, var9.length - 1, var9);
            if (param4) {
                if (hd.field_a < f.field_w.length) {
                    f.field_w[hd.field_a] = var7;
                    nj.field_U[hd.field_a] = var8;
                    hd.field_a = hd.field_a + 1;
                }
            }
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
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
                          int discarded$2 = 1;
                          var5 = nl.a(var4, param0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (ol.field_bc == 2) {
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
                          int discarded$3 = 1;
                          var5 = rn.a(var4, param0, var4);
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
    }

    private final void a(boolean param0, je param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var3_int = param1.field_u + -((bh) this).field_g >> 4;
            var4 = -((bh) this).field_q + param1.field_y >> 4;
            if (param0) {
              L1: {
                var5 = ik.a(var4 * var4 + var3_int * var3_int, -1);
                if (var5 <= 0) {
                  break L1;
                } else {
                  L2: {
                    var6 = 32 * ((bh) this).field_c.field_Fb;
                    if (5 > ((bh) this).field_c.field_Fb) {
                      var6 = 16 * ((bh) this).field_c.field_cb;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var6 <= 640) {
                      break L3;
                    } else {
                      var6 = 640;
                      break L3;
                    }
                  }
                  L4: {
                    if (((bh) this).field_j) {
                      L5: {
                        if (((bh) this).field_c.field_cb >= 15) {
                          stackOut_12_0 = 15;
                          stackIn_13_0 = stackOut_12_0;
                          break L5;
                        } else {
                          stackOut_11_0 = ((bh) this).field_c.field_cb;
                          stackIn_13_0 = stackOut_11_0;
                          break L5;
                        }
                      }
                      var6 = stackIn_13_0 * 32;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    if (!((bh) this).field_r) {
                      break L6;
                    } else {
                      if (((bh) this).field_c.field_Fb * 32 <= var6) {
                        break L6;
                      } else {
                        var6 = 32 * ((bh) this).field_c.field_Fb;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var5 / 2 < var6) {
                      var6 = var5 / 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((bh) this).field_m = var6 * var4 / var5;
                  ((bh) this).field_d = 0;
                  ((bh) this).field_l = var6 * var3_int / var5;
                  ((bh) this).field_r = false;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("bh.I(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static boolean a(boolean param0) {
        int var1 = di.field_g;
        if (!(10 == var1)) {
            if (var1 == -1) {
                return false;
            }
            return true;
        }
        return 0 == ge.field_j ? true : false;
    }

    final je a(je param0, boolean param1, int param2) {
        Object var4 = null;
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
        int stackIn_141_0 = 0;
        Object stackIn_145_0 = null;
        Object stackIn_146_0 = null;
        Object stackIn_147_0 = null;
        Object stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_185_0 = 0;
        hd stackIn_185_1 = null;
        int stackIn_186_0 = 0;
        hd stackIn_186_1 = null;
        int stackIn_187_0 = 0;
        hd stackIn_187_1 = null;
        int stackIn_187_2 = 0;
        Object stackIn_195_0 = null;
        Object stackIn_196_0 = null;
        Object stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        Object stackIn_199_0 = null;
        Object stackIn_200_0 = null;
        Object stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        Object stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        int[] stackIn_205_3 = null;
        Object stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int[] stackIn_206_3 = null;
        Object stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int[] stackIn_207_3 = null;
        int stackIn_207_4 = 0;
        Object stackIn_218_0 = null;
        Object stackIn_219_0 = null;
        Object stackIn_220_0 = null;
        Object stackIn_221_0 = null;
        int stackIn_221_1 = 0;
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
        int stackOut_139_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_184_0 = 0;
        hd stackOut_184_1 = null;
        int stackOut_186_0 = 0;
        hd stackOut_186_1 = null;
        int stackOut_186_2 = 0;
        int stackOut_185_0 = 0;
        hd stackOut_185_1 = null;
        int stackOut_185_2 = 0;
        Object stackOut_198_0 = null;
        Object stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        Object stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        Object stackOut_194_0 = null;
        Object stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        Object stackOut_195_0 = null;
        int stackOut_195_1 = 0;
        Object stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int[] stackOut_204_3 = null;
        Object stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int[] stackOut_206_3 = null;
        int stackOut_206_4 = 0;
        Object stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int[] stackOut_205_3 = null;
        int stackOut_205_4 = 0;
        Object stackOut_217_0 = null;
        Object stackOut_218_0 = null;
        Object stackOut_219_0 = null;
        int stackOut_219_1 = 0;
        Object stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        Object stackOut_144_0 = null;
        Object stackOut_145_0 = null;
        Object stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        Object stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        L0: {
          var18 = SteelSentinels.field_G;
          var4 = null;
          if (((bh) this).field_q >= -120000) {
            break L0;
          } else {
            if (((bh) this).field_m >= 0) {
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
            if (((bh) this).field_c.field_xc.field_ab.b(91) == 4) {
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
              var6_int = stackIn_18_0 + (-((hd) (Object) stackIn_18_1).a(stackIn_18_2 != 0, ((bh) this).field_g >> 4) << 4);
              if (~((bh) this).field_q >= ~var6_int) {
                break L5;
              } else {
                if (((bh) this).field_m > 100) {
                  L7: {
                    ((bh) this).field_m = ((bh) this).field_m - 25;
                    if (((bh) this).field_m < 500) {
                      ((bh) this).field_m = 500;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (((bh) this).field_p > 0) {
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
                        if (~param0.field_x != ~param2) {
                          break L11;
                        } else {
                          L12: {
                            if (param0.field_s == 3) {
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
                                  if (~param0.field_u < ~((bh) this).field_g) {
                                    ((bh) this).field_b = 1;
                                    break L14;
                                  } else {
                                    ((bh) this).field_b = -1;
                                    break L14;
                                  }
                                }
                                var4 = (Object) (Object) param0;
                                if (!sn.field_n) {
                                  break L12;
                                } else {
                                  sn.field_n = false;
                                  pm.field_db.g(6);
                                  this.a(param0, (byte) 43);
                                  break L12;
                                }
                              } else {
                                if (param0.field_s != 0) {
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
                                  var4 = (Object) (Object) param0;
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
                          var4 = (Object) (Object) param0;
                          break L11;
                        }
                      }
                    }
                    L16: {
                      var19 = ((bh) this).field_c.field_xc;
                      var7 = var19.field_ab.a((byte) -119, ((bh) this).field_g >> 4) << 4;
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
                      var8 = ((hd) (Object) stackIn_129_0).a(stackIn_129_1 != 0, ((bh) this).field_g >> 4) << 4;
                      var9 = var19.field_ab.b((byte) 124, ((bh) this).field_g >> 4) << 4;
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
                      L20: {
                        if (((bh) this).field_m < 0) {
                          break L20;
                        } else {
                          if (~var11 < ~var10) {
                            break L20;
                          } else {
                            stackOut_139_0 = 1;
                            stackIn_141_0 = stackOut_139_0;
                            break L19;
                          }
                        }
                      }
                      stackOut_140_0 = 0;
                      stackIn_141_0 = stackOut_140_0;
                      break L19;
                    }
                    L21: {
                      var12 = stackIn_141_0;
                      if (var12 != 0) {
                        L22: {
                          if (Math.abs(((bh) this).field_m) > Math.abs(((bh) this).field_l)) {
                            ((bh) this).field_l = 0;
                            break L22;
                          } else {
                            if (((bh) this).field_c.i(28, -27)) {
                              ((bh) this).field_l = ((bh) this).field_l * 7 / 10;
                              break L22;
                            } else {
                              L23: {
                                if (((bh) this).field_l >= 0) {
                                  break L23;
                                } else {
                                  ((bh) this).field_l = -(9 * -((bh) this).field_l / 10);
                                  break L23;
                                }
                              }
                              if (((bh) this).field_l > 0) {
                                ((bh) this).field_l = ((bh) this).field_l * 9 / 10;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                          }
                        }
                        L24: {
                          if (!var19.field_j) {
                            L25: {
                              if (((bh) this).field_d == 0) {
                                break L25;
                              } else {
                                if (((bh) this).field_h) {
                                  break L25;
                                } else {
                                  L26: {
                                    stackOut_184_0 = 250;
                                    stackOut_184_1 = var19.field_ab;
                                    stackIn_186_0 = stackOut_184_0;
                                    stackIn_186_1 = stackOut_184_1;
                                    stackIn_185_0 = stackOut_184_0;
                                    stackIn_185_1 = stackOut_184_1;
                                    if (param1) {
                                      stackOut_186_0 = stackIn_186_0;
                                      stackOut_186_1 = (hd) (Object) stackIn_186_1;
                                      stackOut_186_2 = 0;
                                      stackIn_187_0 = stackOut_186_0;
                                      stackIn_187_1 = stackOut_186_1;
                                      stackIn_187_2 = stackOut_186_2;
                                      break L26;
                                    } else {
                                      stackOut_185_0 = stackIn_185_0;
                                      stackOut_185_1 = (hd) (Object) stackIn_185_1;
                                      stackOut_185_2 = 1;
                                      stackIn_187_0 = stackOut_185_0;
                                      stackIn_187_1 = stackOut_185_1;
                                      stackIn_187_2 = stackOut_185_2;
                                      break L26;
                                    }
                                  }
                                  if (stackIn_187_0 >= ((hd) (Object) stackIn_187_1).a(stackIn_187_2 != 0, ((bh) this).field_d * 10 + (((bh) this).field_g >> 4)) + (((bh) this).field_q >> 4)) {
                                    break L25;
                                  } else {
                                    ((bh) this).field_d = 0;
                                    break L25;
                                  }
                                }
                              }
                            }
                            if (((bh) this).field_d == 0) {
                              break L24;
                            } else {
                              L27: {
                                ((bh) this).field_b = ((bh) this).field_d;
                                if (((bh) this).field_a > 0) {
                                  ((bh) this).field_a = ((bh) this).field_a - 1;
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              L28: {
                                if (((bh) this).field_h) {
                                  L29: {
                                    stackOut_198_0 = this;
                                    stackIn_200_0 = stackOut_198_0;
                                    stackIn_199_0 = stackOut_198_0;
                                    if (var19.field_ab.a((byte) -106, (((bh) this).field_g >> 4) + ((bh) this).field_b * 10) <= 5 + (-((bh) this).field_q >> 4)) {
                                      stackOut_200_0 = this;
                                      stackOut_200_1 = ((bh) this).field_a;
                                      stackIn_201_0 = stackOut_200_0;
                                      stackIn_201_1 = stackOut_200_1;
                                      break L29;
                                    } else {
                                      stackOut_199_0 = this;
                                      stackOut_199_1 = 50;
                                      stackIn_201_0 = stackOut_199_0;
                                      stackIn_201_1 = stackOut_199_1;
                                      break L29;
                                    }
                                  }
                                  ((bh) this).field_a = stackIn_201_1;
                                  break L28;
                                } else {
                                  L30: {
                                    stackOut_194_0 = this;
                                    stackIn_196_0 = stackOut_194_0;
                                    stackIn_195_0 = stackOut_194_0;
                                    if (~var19.field_ab.a(false, (((bh) this).field_g >> 4) + 10 * ((bh) this).field_b) < ~((-((bh) this).field_q >> 4) - -5)) {
                                      stackOut_196_0 = this;
                                      stackOut_196_1 = 50;
                                      stackIn_197_0 = stackOut_196_0;
                                      stackIn_197_1 = stackOut_196_1;
                                      break L30;
                                    } else {
                                      stackOut_195_0 = this;
                                      stackOut_195_1 = ((bh) this).field_a;
                                      stackIn_197_0 = stackOut_195_0;
                                      stackIn_197_1 = stackOut_195_1;
                                      break L30;
                                    }
                                  }
                                  ((bh) this).field_a = stackIn_197_1;
                                  break L28;
                                }
                              }
                              if (39 != ((bh) this).field_c.field_rc) {
                                L31: {
                                  stackOut_204_0 = this;
                                  stackOut_204_1 = ((bh) this).field_g;
                                  stackOut_204_2 = ((bh) this).field_b;
                                  stackOut_204_3 = ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25];
                                  stackIn_206_0 = stackOut_204_0;
                                  stackIn_206_1 = stackOut_204_1;
                                  stackIn_206_2 = stackOut_204_2;
                                  stackIn_206_3 = stackOut_204_3;
                                  stackIn_205_0 = stackOut_204_0;
                                  stackIn_205_1 = stackOut_204_1;
                                  stackIn_205_2 = stackOut_204_2;
                                  stackIn_205_3 = stackOut_204_3;
                                  if (0 == ((bh) this).field_a) {
                                    stackOut_206_0 = this;
                                    stackOut_206_1 = stackIn_206_1;
                                    stackOut_206_2 = stackIn_206_2;
                                    stackOut_206_3 = (int[]) (Object) stackIn_206_3;
                                    stackOut_206_4 = 0;
                                    stackIn_207_0 = stackOut_206_0;
                                    stackIn_207_1 = stackOut_206_1;
                                    stackIn_207_2 = stackOut_206_2;
                                    stackIn_207_3 = stackOut_206_3;
                                    stackIn_207_4 = stackOut_206_4;
                                    break L31;
                                  } else {
                                    stackOut_205_0 = this;
                                    stackOut_205_1 = stackIn_205_1;
                                    stackOut_205_2 = stackIn_205_2;
                                    stackOut_205_3 = (int[]) (Object) stackIn_205_3;
                                    stackOut_205_4 = 5;
                                    stackIn_207_0 = stackOut_205_0;
                                    stackIn_207_1 = stackOut_205_1;
                                    stackIn_207_2 = stackOut_205_2;
                                    stackIn_207_3 = stackOut_205_3;
                                    stackIn_207_4 = stackOut_205_4;
                                    break L31;
                                  }
                                }
                                ((bh) this).field_g = stackIn_207_1 + stackIn_207_2 * (stackIn_207_3[stackIn_207_4] * 3);
                                break L24;
                              } else {
                                ((bh) this).field_g = ((bh) this).field_g + 500 * ((bh) this).field_b;
                                break L24;
                              }
                            }
                          } else {
                            break L24;
                          }
                        }
                        L32: {
                          var13 = -var19.field_ab.a((byte) -113, ((bh) this).field_g >> 4) << 4;
                          var14 = -var19.field_ab.b((byte) 122, ((bh) this).field_g >> 4) << 4;
                          var15 = -var19.field_ab.a(false, ((bh) this).field_g >> 4) << 4;
                          var16 = var13;
                          if (((bh) this).field_h) {
                            break L32;
                          } else {
                            if (~var14 != ~var15) {
                              var16 = var15;
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                        }
                        L33: {
                          var12 = 0;
                          var17 = 1024;
                          if (((bh) this).field_q - var16 <= 4000) {
                            if (~(var16 + -var17) >= ~((bh) this).field_q) {
                              var12 = 1;
                              ((bh) this).field_q = var16;
                              break L33;
                            } else {
                              break L33;
                            }
                          } else {
                            ((bh) this).field_g = var5;
                            ((bh) this).field_l = 0;
                            break L33;
                          }
                        }
                        L34: {
                          L35: {
                            stackOut_217_0 = this;
                            stackIn_220_0 = stackOut_217_0;
                            stackIn_218_0 = stackOut_217_0;
                            if (var13 == var15) {
                              break L35;
                            } else {
                              stackOut_218_0 = this;
                              stackIn_220_0 = stackOut_218_0;
                              stackIn_219_0 = stackOut_218_0;
                              if (~var15 <= ~((bh) this).field_q) {
                                break L35;
                              } else {
                                stackOut_219_0 = this;
                                stackOut_219_1 = 1;
                                stackIn_221_0 = stackOut_219_0;
                                stackIn_221_1 = stackOut_219_1;
                                break L34;
                              }
                            }
                          }
                          stackOut_220_0 = this;
                          stackOut_220_1 = 0;
                          stackIn_221_0 = stackOut_220_0;
                          stackIn_221_1 = stackOut_220_1;
                          break L34;
                        }
                        L36: {
                          ((bh) this).field_h = stackIn_221_1 != 0;
                          if (var12 != 0) {
                            ((bh) this).field_m = 0;
                            break L36;
                          } else {
                            ((bh) this).field_l = ((bh) this).field_b * ((bh) this).field_e;
                            ((bh) this).field_m = ((bh) this).field_m + var19.field_z;
                            break L36;
                          }
                        }
                        ((bh) this).field_j = false;
                        ((bh) this).field_r = false;
                        break L21;
                      } else {
                        L37: {
                          ((bh) this).field_m = ((bh) this).field_m + var19.field_z;
                          if (!((bh) this).field_r) {
                            break L37;
                          } else {
                            ((bh) this).field_m = ((bh) this).field_m - var19.field_z * 3 / 4;
                            break L37;
                          }
                        }
                        L38: {
                          L39: {
                            ((bh) this).field_a = 0;
                            ((bh) this).field_j = true;
                            var13 = -var19.field_ab.a((byte) -103, ((bh) this).field_g >> 4) << 4;
                            var14 = -var19.field_ab.a(false, ((bh) this).field_g >> 4) << 4;
                            var15 = -var19.field_ab.b((byte) 125, ((bh) this).field_g >> 4) << 4;
                            stackOut_144_0 = this;
                            stackIn_147_0 = stackOut_144_0;
                            stackIn_145_0 = stackOut_144_0;
                            if (var14 == var13) {
                              break L39;
                            } else {
                              stackOut_145_0 = this;
                              stackIn_147_0 = stackOut_145_0;
                              stackIn_146_0 = stackOut_145_0;
                              if (~var14 <= ~((bh) this).field_q) {
                                break L39;
                              } else {
                                stackOut_146_0 = this;
                                stackOut_146_1 = 1;
                                stackIn_148_0 = stackOut_146_0;
                                stackIn_148_1 = stackOut_146_1;
                                break L38;
                              }
                            }
                          }
                          stackOut_147_0 = this;
                          stackOut_147_1 = 0;
                          stackIn_148_0 = stackOut_147_0;
                          stackIn_148_1 = stackOut_147_1;
                          break L38;
                        }
                        L40: {
                          ((bh) this).field_h = stackIn_148_1 != 0;
                          if (((bh) this).field_h) {
                            L41: {
                              if (var15 != var14) {
                                if (~var15 < ~((bh) this).field_q) {
                                  ((bh) this).field_h = false;
                                  ((bh) this).field_q = var14;
                                  break L41;
                                } else {
                                  var15 = var15 + (((bh) this).field_c.field_Db << 4);
                                  if (~((bh) this).field_q <= ~var15) {
                                    break L41;
                                  } else {
                                    if (var19.b(((bh) this).field_g, -5)) {
                                      if (var19.field_ab.a(false, var5 >> 4) == var19.field_ab.b((byte) 119, var5 >> 4)) {
                                        ((bh) this).field_m = ((bh) this).field_m / 2;
                                        ((bh) this).field_l = -((bh) this).field_l / 2;
                                        ((bh) this).field_g = var5;
                                        break L41;
                                      } else {
                                        L42: {
                                          if (((bh) this).field_m < 0) {
                                            ((bh) this).field_m = -((bh) this).field_m / 2;
                                            break L42;
                                          } else {
                                            break L42;
                                          }
                                        }
                                        ((bh) this).field_q = var15;
                                        break L41;
                                      }
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              } else {
                                break L41;
                              }
                            }
                            if (~((bh) this).field_q < ~var13) {
                              ((bh) this).field_q = var13;
                              break L40;
                            } else {
                              break L21;
                            }
                          } else {
                            if (var14 == var15) {
                              if (~var13 <= ~((bh) this).field_q) {
                                break L40;
                              } else {
                                ((bh) this).field_l = ((bh) this).field_l / 2;
                                ((bh) this).field_m = ((bh) this).field_m - 5;
                                ((bh) this).field_q = var13;
                                break L21;
                              }
                            } else {
                              if (var14 >= ((bh) this).field_q) {
                                break L40;
                              } else {
                                ((bh) this).field_m = ((bh) this).field_m - 5;
                                ((bh) this).field_q = var14;
                                ((bh) this).field_l = ((bh) this).field_l / 2;
                                break L21;
                              }
                            }
                          }
                        }
                        break L21;
                      }
                    }
                    return (je) var4;
                  } else {
                    L43: {
                      if (~param2 != ~var6.field_x) {
                        break L43;
                      } else {
                        if (var6.field_s != 0) {
                          break L43;
                        } else {
                          L44: {
                            if (var6.field_u <= ((bh) this).field_g) {
                              ((bh) this).field_b = -1;
                              break L44;
                            } else {
                              ((bh) this).field_b = 1;
                              break L44;
                            }
                          }
                          if (((bh) this).field_d == 0) {
                            break L43;
                          } else {
                            if (((bh) this).field_b == ((bh) this).field_d) {
                              break L43;
                            } else {
                              ((bh) this).field_d = 0;
                              break L43;
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
                L45: {
                  L46: {
                    if (((bh) this).field_r) {
                      break L46;
                    } else {
                      if (~var6.field_x == ~param2) {
                        if (var6.field_s == 3) {
                          L47: {
                            var4 = (Object) (Object) var6;
                            if (!((bh) this).field_j) {
                              break L47;
                            } else {
                              if (0 >= ((bh) this).field_c.field_cb) {
                                break L45;
                              } else {
                                break L47;
                              }
                            }
                          }
                          if (((bh) this).field_j) {
                            this.a(true, var6);
                            break L45;
                          } else {
                            ((bh) this).field_d = 0;
                            break L45;
                          }
                        } else {
                          if (0 == var6.field_s) {
                            var4 = (Object) (Object) var6;
                            if (~((bh) this).field_g > ~var6.field_u) {
                              ((bh) this).field_b = 1;
                              break L45;
                            } else {
                              ((bh) this).field_b = -1;
                              break L45;
                            }
                          } else {
                            if (6 != var6.field_s) {
                              break L45;
                            } else {
                              ((bh) this).field_d = var6.field_A;
                              break L45;
                            }
                          }
                        }
                      } else {
                        break L46;
                      }
                    }
                  }
                  if (((bh) this).field_r) {
                    break L45;
                  } else {
                    if (~(var6.field_r - 100 - -ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25][2]) != ~(param2 + -1)) {
                      break L45;
                    } else {
                      if (3 != var6.field_s) {
                        break L45;
                      } else {
                        if (!((bh) this).field_j) {
                          ((bh) this).field_a = 0;
                          this.a(true, var6);
                          break L45;
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
            L48: {
              L49: {
                L50: {
                  if (!((bh) this).field_r) {
                    break L50;
                  } else {
                    if (var6.field_s == 6) {
                      break L50;
                    } else {
                      if (!((bh) this).field_r) {
                        break L49;
                      } else {
                        if (var6.field_s != 3) {
                          break L49;
                        } else {
                          if (((bh) this).field_p >= 0) {
                            break L49;
                          } else {
                            break L50;
                          }
                        }
                      }
                    }
                  }
                }
                if (~param2 != ~var6.field_x) {
                  break L49;
                } else {
                  if (var6.field_s == 3) {
                    L51: {
                      L52: {
                        if (!((bh) this).field_j) {
                          break L52;
                        } else {
                          if (((bh) this).field_c.field_cb > 0) {
                            break L52;
                          } else {
                            if (((bh) this).field_c.field_Fb <= 0) {
                              break L51;
                            } else {
                              if (((bh) this).field_r) {
                                break L52;
                              } else {
                                break L51;
                              }
                            }
                          }
                        }
                      }
                      if (!((bh) this).field_j) {
                        ((bh) this).field_d = 0;
                        break L51;
                      } else {
                        this.a(true, var6);
                        ((bh) this).field_r = false;
                        break L51;
                      }
                    }
                    var4 = (Object) (Object) var6;
                    break L48;
                  } else {
                    if (var6.field_s == 0) {
                      L53: {
                        if (var6.field_u > ((bh) this).field_g) {
                          ((bh) this).field_b = 1;
                          break L53;
                        } else {
                          ((bh) this).field_b = -1;
                          break L53;
                        }
                      }
                      var4 = (Object) (Object) var6;
                      break L48;
                    } else {
                      if (6 != var6.field_s) {
                        break L48;
                      } else {
                        L54: {
                          L55: {
                            var7 = ((bh) this).field_d;
                            ((bh) this).field_d = var6.field_A;
                            if (0 > ((bh) this).field_d) {
                              break L55;
                            } else {
                              if (((bh) this).field_d <= 1) {
                                break L54;
                              } else {
                                break L55;
                              }
                            }
                          }
                          ((bh) this).field_d = -1;
                          break L54;
                        }
                        if (var7 != ((bh) this).field_d) {
                          ((bh) this).field_a = 0;
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                    }
                  }
                }
              }
              if (((bh) this).field_r) {
                break L48;
              } else {
                if (-100 + var6.field_r - -ka.field_G[o.a((byte) 84, ((bh) this).field_c.field_Zb.field_N)][25][2] == -1 + param2) {
                  if (var6.field_s == 3) {
                    if (((bh) this).field_j) {
                      break L48;
                    } else {
                      ((bh) this).field_a = 0;
                      this.a(param1, var6);
                      break L48;
                    }
                  } else {
                    break L48;
                  }
                } else {
                  break L48;
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
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        nk[] var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (((bh) this).field_g >= param0.field_u) {
                ((bh) this).field_b = -1;
                break L1;
              } else {
                ((bh) this).field_b = 1;
                break L1;
              }
            }
            if (((bh) this).field_c.field_Zb != null) {
              L2: {
                if (param1 > 0) {
                  break L2;
                } else {
                  ((bh) this).field_c = null;
                  break L2;
                }
              }
              var6 = ((bh) this).field_c.field_Zb.a(0, ((bh) this).field_c, new nk[0], ((bh) this).field_b * param0.field_B, param0.field_A);
              var3 = var6;
              ((bh) this).field_c.field_Zb.a(param0.field_B * ((bh) this).field_b, -86, param0.field_A);
              ((bh) this).field_c.field_Zb.b((byte) -128, ((bh) this).field_g, ((bh) this).field_b, ((bh) this).field_q);
              var4 = 0;
              L3: while (true) {
                if (var4 >= var6.length) {
                  break L0;
                } else {
                  this.a(true, var6[var4], param0);
                  var4 = var6.length;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("bh.D(");
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
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        if (kc.field_y != null) {
            kc.field_y.a(param1, (byte) 127);
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
              if (param0 == 29) {
                break L1;
              } else {
                if (param0 == 43) {
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
                        if (param0 == 52) {
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
              param6 = -(((bh) this).field_c.field_Vb.field_Db << 3) + ((bh) this).field_c.field_Vb.field_Gb;
              var9 = param2 - ((bh) this).field_g;
              var10 = -param4 + param6;
              if (var9 >= 0) {
                ((bh) this).field_b = 1;
                break L2;
              } else {
                ((bh) this).field_b = -1;
                break L2;
              }
            }
            L3: {
              if (~((bh) this).field_b == ~((bh) this).field_d) {
                break L3;
              } else {
                ((bh) this).field_d = 0;
                break L3;
              }
            }
            var11_double = Math.atan2((double)var9, (double)(-var10));
            param3 = (int)(65536.0 * var11_double / 6.283185307179586);
            if (0 <= ((bh) this).field_b) {
              if (param3 >= -16384) {
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
          if (var9 < 0) {
            ((bh) this).field_b = -1;
            break L4;
          } else {
            ((bh) this).field_b = 1;
            break L4;
          }
        }
        L5: {
          var10 = param6 - ((bh) this).field_q;
          if (~((bh) this).field_b != ~((bh) this).field_d) {
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
          if (param0 != 19) {
            break L8;
          } else {
            var8 = 1;
            break L8;
          }
        }
        L9: {
          if (param0 != 20) {
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
          if (param0 != 24) {
            break L13;
          } else {
            var8 = 2;
            break L13;
          }
        }
        L14: {
          if (param0 != 25) {
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
          if (param0 == 27) {
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
          if (param0 == 28) {
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
          if (param0 == 30) {
            var8 = 1;
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          if (param0 == 31) {
            var8 = 1;
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          if (param0 == 32) {
            var8 = 1;
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          if (param0 != 33) {
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
          if (param0 == 36) {
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
          if (param0 != 46) {
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
          if (param0 != 44) {
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
          if (param0 != 45) {
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
          if (param0 != 49) {
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
          if (param0 == 18) {
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
          if (param0 != 43) {
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
            if (param0 != 19) {
              L44: {
                if (param0 == 31) {
                  break L44;
                } else {
                  if (param0 != 45) {
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
          if (var8 != 7) {
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
          if (var8 == 4) {
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
          var9 = jh.a(param3 >> 3, 4096) * 100 >> 16;
          if (var13 >= 1) {
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
          var10 = -kg.a(param3 >> 3, (byte) -101) * 100 >> 16;
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
        RuntimeException var4 = null;
        int var4_int = 0;
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
        wl stackIn_150_0 = null;
        wl stackIn_151_0 = null;
        wl stackIn_152_0 = null;
        mb stackIn_152_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        RuntimeException stackIn_158_0 = null;
        StringBuilder stackIn_158_1 = null;
        RuntimeException stackIn_159_0 = null;
        StringBuilder stackIn_159_1 = null;
        String stackIn_159_2 = null;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        String stackIn_162_2 = null;
        RuntimeException decompiledCaughtException = null;
        wl stackOut_149_0 = null;
        wl stackOut_151_0 = null;
        mb stackOut_151_1 = null;
        wl stackOut_150_0 = null;
        Object stackOut_150_1 = null;
        RuntimeException stackOut_156_0 = null;
        StringBuilder stackOut_156_1 = null;
        RuntimeException stackOut_158_0 = null;
        StringBuilder stackOut_158_1 = null;
        String stackOut_158_2 = null;
        RuntimeException stackOut_157_0 = null;
        StringBuilder stackOut_157_1 = null;
        String stackOut_157_2 = null;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        String stackOut_161_2 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        var17 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param1.field_N == 18) {
                  break L2;
                } else {
                  if (param1.field_N == 29) {
                    break L2;
                  } else {
                    if (param1.field_N == 43) {
                      break L2;
                    } else {
                      if (param1.field_N == 21) {
                        break L2;
                      } else {
                        if (param1.field_N == 34) {
                          break L2;
                        } else {
                          if (param1.field_N == 47) {
                            break L2;
                          } else {
                            if (param1.field_N != 52) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (null != ((bh) this).field_c.field_Vb) {
                L3: {
                  param2.field_u = ((bh) this).field_c.field_Vb.field_hc;
                  param2.field_y = -(((bh) this).field_c.field_Vb.field_Db << 3) + ((bh) this).field_c.field_Vb.field_Gb;
                  var5 = -((bh) this).field_g + param2.field_u;
                  var6 = -param1.field_V + param2.field_y;
                  if (0 > var5) {
                    ((bh) this).field_b = -1;
                    break L3;
                  } else {
                    ((bh) this).field_b = 1;
                    break L3;
                  }
                }
                L4: {
                  if (~((bh) this).field_b == ~((bh) this).field_d) {
                    break L4;
                  } else {
                    ((bh) this).field_d = 0;
                    break L4;
                  }
                }
                L5: {
                  var7_double = Math.atan2((double)var5, (double)(-var6));
                  param2.field_B = (int)(var7_double * 65536.0 / 6.283185307179586);
                  if (((bh) this).field_b < 0) {
                    if (param2.field_B <= 16384) {
                      break L5;
                    } else {
                      param2.field_B = param2.field_B - 65536;
                      break L5;
                    }
                  } else {
                    if (param2.field_B < -16384) {
                      param2.field_B = param2.field_B + 65536;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (~param1.field_K >= ~(((bh) this).field_b * param2.field_B)) {
                    break L6;
                  } else {
                    param2.field_B = ((bh) this).field_b * param1.field_K;
                    break L6;
                  }
                }
                if (param1.field_W < param2.field_B * ((bh) this).field_b) {
                  param2.field_B = ((bh) this).field_b * param1.field_W;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L7: {
              var4_int = 2;
              var5 = -((bh) this).field_g + param2.field_u;
              var6 = param2.field_y + -((bh) this).field_q;
              if (var5 >= 0) {
                ((bh) this).field_b = 1;
                break L7;
              } else {
                ((bh) this).field_b = -1;
                break L7;
              }
            }
            L8: {
              if (~((bh) this).field_b != ~((bh) this).field_d) {
                ((bh) this).field_d = 0;
                break L8;
              } else {
                break L8;
              }
            }
            var7 = 0;
            var8 = 0;
            if (param1 == null) {
              return;
            } else {
              L9: {
                if (param1.field_N == 17) {
                  var4_int = 5;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                var8 = param1.field_V;
                var7 = param1.field_T;
                if (param1.field_N == 18) {
                  var4_int = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (19 != param1.field_N) {
                  break L11;
                } else {
                  var4_int = 1;
                  break L11;
                }
              }
              L12: {
                if (param1.field_N == 20) {
                  var4_int = 6;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param1.field_N == 21) {
                  var4_int = 4;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param1.field_N != 22) {
                  break L14;
                } else {
                  var4_int = 7;
                  break L14;
                }
              }
              L15: {
                if (param1.field_N != 23) {
                  break L15;
                } else {
                  var4_int = 3;
                  break L15;
                }
              }
              L16: {
                if (param1.field_N != 24) {
                  break L16;
                } else {
                  var4_int = 2;
                  break L16;
                }
              }
              L17: {
                if (param1.field_N != 25) {
                  break L17;
                } else {
                  var4_int = 2;
                  break L17;
                }
              }
              L18: {
                if (param1.field_N == 26) {
                  var4_int = 2;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param1.field_N == 27) {
                  var4_int = 4;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (38 != param1.field_N) {
                  break L20;
                } else {
                  var4_int = 4;
                  break L20;
                }
              }
              L21: {
                if (param1.field_N == 28) {
                  var4_int = 5;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (29 != param1.field_N) {
                  break L22;
                } else {
                  var4_int = 0;
                  break L22;
                }
              }
              L23: {
                if (param1.field_N != 30) {
                  break L23;
                } else {
                  var4_int = 1;
                  break L23;
                }
              }
              L24: {
                if (param1.field_N != 31) {
                  break L24;
                } else {
                  var4_int = 1;
                  break L24;
                }
              }
              L25: {
                if (32 == param1.field_N) {
                  var4_int = 1;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                if (param1.field_N == 33) {
                  var4_int = 6;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param1.field_N != 34) {
                  break L27;
                } else {
                  var4_int = 4;
                  break L27;
                }
              }
              L28: {
                if (35 == param1.field_N) {
                  var4_int = 7;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                if (param1.field_N == 36) {
                  var4_int = 2;
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                if (param1.field_N == 37) {
                  var4_int = 2;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param1.field_N != 46) {
                  break L31;
                } else {
                  var4_int = 6;
                  break L31;
                }
              }
              L32: {
                if (param1.field_N == 43) {
                  var4_int = 0;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (param1.field_N != 44) {
                  break L33;
                } else {
                  var4_int = 1;
                  break L33;
                }
              }
              L34: {
                if (param1.field_N != 47) {
                  break L34;
                } else {
                  var4_int = 4;
                  break L34;
                }
              }
              L35: {
                if (param1.field_N == 45) {
                  var4_int = 1;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                if (48 != param1.field_N) {
                  break L36;
                } else {
                  var4_int = 7;
                  break L36;
                }
              }
              L37: {
                if (param1.field_N == 52) {
                  var4_int = 4;
                  break L37;
                } else {
                  break L37;
                }
              }
              L38: {
                if (param1.field_N != 51) {
                  break L38;
                } else {
                  var4_int = 3;
                  break L38;
                }
              }
              L39: {
                if (param1.field_N != 50) {
                  break L39;
                } else {
                  var4_int = 2;
                  break L39;
                }
              }
              L40: {
                if (param1.field_N != 49) {
                  break L40;
                } else {
                  var4_int = 2;
                  break L40;
                }
              }
              L41: {
                var9 = 10 * (int)Math.sqrt((double)(var6 / 100 * var6 + var5 / 100 * var5));
                var10 = 192;
                var11 = 0;
                var12 = 4;
                var13 = 45;
                if (18 != param1.field_N) {
                  break L41;
                } else {
                  var13 -= 20;
                  break L41;
                }
              }
              L42: {
                if (param1.field_N == 29) {
                  var13 -= 10;
                  break L42;
                } else {
                  break L42;
                }
              }
              L43: {
                if (param1.field_N != 43) {
                  break L43;
                } else {
                  var13 -= 5;
                  break L43;
                }
              }
              L44: {
                var14 = 1;
                if (var4_int == 5) {
                  var13 = 45;
                  var11 = 7;
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                if (var4_int == 1) {
                  L46: {
                    var10 = 256;
                    var11 = 1;
                    var12 = 0;
                    if (param1.field_N == 19) {
                      var11 = 20;
                      break L46;
                    } else {
                      L47: {
                        if (param1.field_N == 31) {
                          break L47;
                        } else {
                          if (param1.field_N == 45) {
                            break L47;
                          } else {
                            break L46;
                          }
                        }
                      }
                      var10 = cl.a(param2.field_B, -127);
                      break L46;
                    }
                  }
                  var13 = 5000;
                  var14 = 32;
                  break L45;
                } else {
                  break L45;
                }
              }
              L48: {
                if (7 != var4_int) {
                  break L48;
                } else {
                  var14 = 250;
                  var11 = 6;
                  var12 = 0;
                  var10 = 192;
                  var13 = 5000;
                  break L48;
                }
              }
              L49: {
                if (var4_int != 2) {
                  break L49;
                } else {
                  var12 = 0;
                  var14 = 250;
                  var13 = 5000;
                  var11 = 2;
                  var10 = 16;
                  break L49;
                }
              }
              L50: {
                if (var4_int == 3) {
                  var13 = 5000;
                  var14 = 250;
                  var11 = 3;
                  var12 = 20;
                  var10 = 16;
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                if (4 != var4_int) {
                  break L51;
                } else {
                  var13 = 5;
                  var14 = 1;
                  var10 = 256;
                  var12 = 32;
                  var11 = 4;
                  break L51;
                }
              }
              L52: {
                if (1 <= var9) {
                  break L52;
                } else {
                  var9 = 1;
                  break L52;
                }
              }
              L53: {
                var5 = jh.a(param2.field_B >> 3, 4096) * 100 >> 16;
                if (var4_int != 6) {
                  break L53;
                } else {
                  var12 = 32;
                  var10 = 512;
                  var11 = 5;
                  var13 = 5;
                  var14 = 1;
                  break L53;
                }
              }
              L54: {
                var6 = -kg.a(param2.field_B >> 3, (byte) -87) * 100 >> 16;
                var9 = 100;
                if (null == ie.field_f[-17 + param1.field_N]) {
                  break L54;
                } else {
                  var15_int = -param1.field_G + ie.field_f[param1.field_N - 17][0];
                  var16 = ie.field_f[-17 + param1.field_N][1] - param1.field_E;
                  var7 = var7 - var16 * var5 * 32 / var9;
                  var8 = var8 - var16 * (var6 * 32) / var9;
                  var8 = var8 + 32 * (((bh) this).field_b * var15_int * var5) / var9;
                  var7 = var7 - 32 * var15_int * var6 * ((bh) this).field_b / var9;
                  break L54;
                }
              }
              L55: {
                var15 = new wl(var7, var8, var10 * var5 / var9, var6 * var10 / var9, var13, var12, var11, ((bh) this).field_c.field_xc, ((bh) this).field_c, 0, var14, param1.field_N + -17);
                var15.field_S = 100 * var6 + var8;
                var15.field_K = var5 * 100 + var7;
                stackOut_149_0 = (wl) var15;
                stackIn_151_0 = stackOut_149_0;
                stackIn_150_0 = stackOut_149_0;
                if (var15.field_X != null) {
                  stackOut_151_0 = (wl) (Object) stackIn_151_0;
                  stackOut_151_1 = var15.field_X.field_Vb;
                  stackIn_152_0 = stackOut_151_0;
                  stackIn_152_1 = stackOut_151_1;
                  break L55;
                } else {
                  stackOut_150_0 = (wl) (Object) stackIn_150_0;
                  stackOut_150_1 = null;
                  stackIn_152_0 = stackOut_150_0;
                  stackIn_152_1 = (mb) (Object) stackOut_150_1;
                  break L55;
                }
              }
              L56: {
                stackIn_152_0.field_nb = stackIn_152_1;
                var15.field_fb = null;
                var15.field_V = true;
                if (var4_int != 3) {
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
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L57: {
            var4 = decompiledCaughtException;
            stackOut_156_0 = (RuntimeException) var4;
            stackOut_156_1 = new StringBuilder().append("bh.L(").append(1).append(44);
            stackIn_158_0 = stackOut_156_0;
            stackIn_158_1 = stackOut_156_1;
            stackIn_157_0 = stackOut_156_0;
            stackIn_157_1 = stackOut_156_1;
            if (param1 == null) {
              stackOut_158_0 = (RuntimeException) (Object) stackIn_158_0;
              stackOut_158_1 = (StringBuilder) (Object) stackIn_158_1;
              stackOut_158_2 = "null";
              stackIn_159_0 = stackOut_158_0;
              stackIn_159_1 = stackOut_158_1;
              stackIn_159_2 = stackOut_158_2;
              break L57;
            } else {
              stackOut_157_0 = (RuntimeException) (Object) stackIn_157_0;
              stackOut_157_1 = (StringBuilder) (Object) stackIn_157_1;
              stackOut_157_2 = "{...}";
              stackIn_159_0 = stackOut_157_0;
              stackIn_159_1 = stackOut_157_1;
              stackIn_159_2 = stackOut_157_2;
              break L57;
            }
          }
          L58: {
            stackOut_159_0 = (RuntimeException) (Object) stackIn_159_0;
            stackOut_159_1 = ((StringBuilder) (Object) stackIn_159_1).append(stackIn_159_2).append(44);
            stackIn_161_0 = stackOut_159_0;
            stackIn_161_1 = stackOut_159_1;
            stackIn_160_0 = stackOut_159_0;
            stackIn_160_1 = stackOut_159_1;
            if (param2 == null) {
              stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
              stackOut_161_1 = (StringBuilder) (Object) stackIn_161_1;
              stackOut_161_2 = "null";
              stackIn_162_0 = stackOut_161_0;
              stackIn_162_1 = stackOut_161_1;
              stackIn_162_2 = stackOut_161_2;
              break L58;
            } else {
              stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
              stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
              stackOut_160_2 = "{...}";
              stackIn_162_0 = stackOut_160_0;
              stackIn_162_1 = stackOut_160_1;
              stackIn_162_2 = stackOut_160_2;
              break L58;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_162_0, stackIn_162_2 + 41);
        }
    }

    bh(mb param0) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        int var1 = (re.field_Z + -640) / 2;
        int var2 = an.field_h * an.field_h;
        int var3 = -(je.field_t * je.field_t) + var2;
        mg.field_Ub.a(0, 90, -210 + (pb.field_j + -4), -(199 * var3 / var2) + var1, 199);
        pc.field_q.a(0, 0, -4 + (-120 + pb.field_j), 438 * var3 / var2 + (202 + var1), 438);
    }

    final static int a(int[] param0, int param1, nk param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param2.i(-121);
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              if (var4 <= var6) {
                L2: {
                  if (var5 == 0) {
                    break L2;
                  } else {
                    var3_int += 3800;
                    break L2;
                  }
                }
                stackOut_24_0 = var3_int;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L3: {
                  if (10 == param0[var6]) {
                    var3_int += 100;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param0[var6] != 11) {
                    break L4;
                  } else {
                    var3_int += 200;
                    break L4;
                  }
                }
                L5: {
                  if (param0[var6] == 12) {
                    var3_int += 500;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (13 != param0[var6]) {
                    break L6;
                  } else {
                    var3_int += 1000;
                    break L6;
                  }
                }
                L7: {
                  if (param0[var6] != 34) {
                    break L7;
                  } else {
                    var5 = 1;
                    break L7;
                  }
                }
                L8: {
                  if (param0[var6] == 14) {
                    var3_int += 2000;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("bh.C(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(10).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return stackIn_25_0;
    }

    final void a(int param0, je param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                ((bh) this).field_d = 31;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("bh.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
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
