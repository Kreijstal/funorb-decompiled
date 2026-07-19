/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po extends br {
    private int[] field_r;
    jd[] field_s;
    static int field_n;
    static String field_i;
    static pd field_l;
    static cj field_k;
    short[] field_g;
    byte[] field_j;
    static String field_f;
    int field_o;
    static boolean field_p;
    nj[] field_q;
    byte[] field_h;
    byte[] field_m;

    final static void a(byte param0, int param1) {
        int var2 = 30 / ((param0 - 70) / 37);
        w.field_m = w.field_m | 1 << -param1;
    }

    final void e(int param0) {
        this.field_r = null;
        if (param0 != -6930) {
            field_p = true;
        }
    }

    public static void f(int param0) {
        field_i = null;
        field_l = null;
        field_k = null;
        int var1 = -128 / ((4 - param0) / 41);
        field_f = null;
    }

    final static void a(int param0) {
        int discarded$0 = 0;
        nk.field_n = new String[mo.field_Kb];
        nk.field_n[7] = kg.field_l;
        nk.field_n[5] = jk.field_e;
        nk.field_n[4] = hp.field_h;
        nk.field_n[18] = op.field_o;
        nk.field_n[21] = lj.field_p;
        nk.field_n[6] = ld.field_Lb;
        nk.field_n[16] = mn.field_n;
        nk.field_n[19] = sd.field_E;
        nk.field_n[13] = vn.field_a;
        nk.field_n[20] = rl.field_c;
        if (param0 != 2) {
            discarded$0 = po.d(2);
        }
        nk.field_n[17] = tj.field_d;
        nk.field_n[9] = li.field_z;
        nk.field_n[11] = si.field_D;
        nk.field_n[15] = eh.field_f;
    }

    final static int d(int param0) {
        if (param0 != 12949) {
            return -35;
        }
        return hp.a((byte) -122, g.field_a, 16) + 4;
    }

    final static boolean c(int param0) {
        if (param0 != 128) {
            return true;
        }
        return !tg.field_g.d(-86) ? true : false;
    }

    po(byte[] param0) {
        int incrementValue$9 = 0;
        nj dupTemp$10 = null;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        nj[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        nj var15 = null;
        byte[] var15_array = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        k var37 = null;
        byte[] var38 = null;
        nj var39 = null;
        byte[] var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        nj var44 = null;
        byte[] var45 = null;
        byte[] var46 = null;
        nj var47 = null;
        nj var48 = null;
        nj var49 = null;
        nj var50 = null;
        nj var51 = null;
        byte[] var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        byte[] stackIn_49_0 = null;
        byte[] stackIn_52_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        byte[] stackIn_130_0 = null;
        byte[] stackIn_143_0 = null;
        byte[] stackIn_156_0 = null;
        byte[] stackIn_166_0 = null;
        int stackIn_186_0 = 0;
        byte[] stackIn_196_0 = null;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_214_1 = 0;
        int stackIn_216_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_226_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_229_1 = 0;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_257_1 = 0;
        int stackIn_262_0 = 0;
        int stackIn_262_1 = 0;
        RuntimeException stackIn_269_0 = null;
        StringBuilder stackIn_269_1 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        String stackIn_271_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_45_0 = 0;
        byte[] stackOut_48_0 = null;
        Object stackOut_47_0 = null;
        Object stackOut_51_0 = null;
        byte[] stackOut_50_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        byte[] stackOut_129_0 = null;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        byte[] stackOut_142_0 = null;
        byte[] stackOut_155_0 = null;
        byte[] stackOut_165_0 = null;
        int stackOut_185_0 = 0;
        byte[] stackOut_195_0 = null;
        int stackOut_197_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_213_1 = 0;
        int stackOut_215_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_225_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_228_1 = 0;
        int stackOut_236_0 = 0;
        int stackOut_236_1 = 0;
        int stackOut_256_0 = 0;
        int stackOut_256_1 = 0;
        int stackOut_261_0 = 0;
        int stackOut_261_1 = 0;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        RuntimeException stackOut_270_0 = null;
        StringBuilder stackOut_270_1 = null;
        String stackOut_270_2 = null;
        RuntimeException stackOut_269_0 = null;
        StringBuilder stackOut_269_1 = null;
        String stackOut_269_2 = null;
        var36 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            this.field_q = new nj[128];
            this.field_h = new byte[128];
            this.field_s = new jd[128];
            this.field_m = new byte[128];
            this.field_r = new int[128];
            this.field_g = new short[128];
            this.field_j = new byte[128];
            var37 = new k(param0);
            var3 = 0;
            L1: while (true) {
              L2: {
                if ((var37.field_m[var3 + var37.field_j] ^ -1) == -1) {
                  break L2;
                } else {
                  var3++;
                  if (var36 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var54 = new byte[var3];
              var41 = var54;
              var4 = var41;
              var5 = 0;
              L3: while (true) {
                L4: {
                  L5: {
                    if ((var3 ^ -1) >= (var5 ^ -1)) {
                      break L5;
                    } else {
                      var4[var5] = var37.d(-249699580);
                      var5++;
                      if (var36 != 0) {
                        break L4;
                      } else {
                        if (var36 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3++;
                  var37.field_j = var37.field_j + 1;
                  var5 = var37.field_j;
                  var37.field_j = var37.field_j + var3;
                  break L4;
                }
                var6 = 0;
                L6: while (true) {
                  L7: {
                    if ((var37.field_m[var6 + var37.field_j] ^ -1) == -1) {
                      break L7;
                    } else {
                      var6++;
                      if (var36 == 0) {
                        continue L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var55 = new byte[var6];
                  var42 = var55;
                  var7 = var42;
                  var8 = 0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var8 >= var6) {
                          break L10;
                        } else {
                          var7[var8] = var37.d(-249699580);
                          var8++;
                          if (var36 != 0) {
                            break L9;
                          } else {
                            if (var36 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      var37.field_j = var37.field_j + 1;
                      var6++;
                      var8 = var37.field_j;
                      var37.field_j = var37.field_j + var6;
                      break L9;
                    }
                    var9 = 0;
                    L11: while (true) {
                      L12: {
                        if (0 == var37.field_m[var9 + var37.field_j]) {
                          break L12;
                        } else {
                          var9++;
                          if (var36 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var56 = new byte[var9];
                      var43 = var56;
                      var10 = var43;
                      var11_int = 0;
                      L13: while (true) {
                        L14: {
                          L15: {
                            if (var9 <= var11_int) {
                              break L15;
                            } else {
                              var10[var11_int] = var37.d(-249699580);
                              var11_int++;
                              if (var36 != 0) {
                                break L14;
                              } else {
                                if (var36 == 0) {
                                  continue L13;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          var37.field_j = var37.field_j + 1;
                          var9++;
                          break L14;
                        }
                        L16: {
                          L17: {
                            L18: {
                              var52 = new byte[var9];
                              var38 = var52;
                              var11 = var38;
                              if (1 < var9) {
                                break L18;
                              } else {
                                var12 = var9;
                                if (var36 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var52[1] = (byte) 1;
                            var12 = 2;
                            var13_int = 1;
                            var14 = 2;
                            L19: while (true) {
                              if (var14 >= var9) {
                                break L17;
                              } else {
                                var15_int = var37.g(31365);
                                stackOut_29_0 = var15_int ^ -1;
                                stackIn_37_0 = stackOut_29_0;
                                stackIn_30_0 = stackOut_29_0;
                                if (var36 != 0) {
                                  break L16;
                                } else {
                                  L20: {
                                    L21: {
                                      if (stackIn_30_0 != -1) {
                                        break L21;
                                      } else {
                                        incrementValue$9 = var12;
                                        var12++;
                                        var13_int = incrementValue$9;
                                        if (var36 == 0) {
                                          break L20;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    L22: {
                                      if (var15_int > var13_int) {
                                        break L22;
                                      } else {
                                        var15_int--;
                                        break L22;
                                      }
                                    }
                                    var13_int = var15_int;
                                    break L20;
                                  }
                                  var11[var14] = (byte)var13_int;
                                  var14++;
                                  if (var36 == 0) {
                                    continue L19;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_36_0 = var12;
                          stackIn_37_0 = stackOut_36_0;
                          break L16;
                        }
                        var13 = new nj[stackIn_37_0];
                        var14 = 0;
                        L23: while (true) {
                          L24: {
                            L25: {
                              if ((var13.length ^ -1) >= (var14 ^ -1)) {
                                break L25;
                              } else {
                                dupTemp$10 = new nj();
                                var13[var14] = dupTemp$10;
                                var39 = dupTemp$10;
                                var15 = var39;
                                var16_int = var37.g(31365);
                                stackOut_39_0 = var16_int;
                                stackIn_46_0 = stackOut_39_0;
                                stackIn_40_0 = stackOut_39_0;
                                if (var36 != 0) {
                                  break L24;
                                } else {
                                  L26: {
                                    if (stackIn_40_0 <= 0) {
                                      break L26;
                                    } else {
                                      var15.field_l = new byte[2 * var16_int];
                                      break L26;
                                    }
                                  }
                                  L27: {
                                    var16_int = var37.g(31365);
                                    if (var16_int <= 0) {
                                      break L27;
                                    } else {
                                      var15.field_e = new byte[2 + var16_int * 2];
                                      var39.field_e[1] = (byte)64;
                                      break L27;
                                    }
                                  }
                                  var14++;
                                  if (var36 == 0) {
                                    continue L23;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            var14 = var37.g(31365);
                            stackOut_45_0 = var14;
                            stackIn_46_0 = stackOut_45_0;
                            break L24;
                          }
                          L28: {
                            if (stackIn_46_0 > 0) {
                              stackOut_48_0 = new byte[var14 * 2];
                              stackIn_49_0 = stackOut_48_0;
                              break L28;
                            } else {
                              stackOut_47_0 = null;
                              stackIn_49_0 = (byte[]) ((Object) stackOut_47_0);
                              break L28;
                            }
                          }
                          L29: {
                            var57 = stackIn_49_0;
                            var45 = var57;
                            var15_array = var45;
                            var14 = var37.g(31365);
                            if (var14 <= 0) {
                              stackOut_51_0 = null;
                              stackIn_52_0 = (byte[]) ((Object) stackOut_51_0);
                              break L29;
                            } else {
                              stackOut_50_0 = new byte[2 * var14];
                              stackIn_52_0 = stackOut_50_0;
                              break L29;
                            }
                          }
                          var46 = stackIn_52_0;
                          var16 = var46;
                          var17 = 0;
                          L30: while (true) {
                            L31: {
                              if (-1 == (var37.field_m[var17 + var37.field_j] ^ -1)) {
                                break L31;
                              } else {
                                var17++;
                                if (var36 == 0) {
                                  continue L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            var53 = new byte[var17];
                            var40 = var53;
                            var18 = var40;
                            var19 = 0;
                            L32: while (true) {
                              L33: {
                                L34: {
                                  if (var19 >= var17) {
                                    break L34;
                                  } else {
                                    var18[var19] = var37.d(-249699580);
                                    var19++;
                                    if (var36 != 0) {
                                      break L33;
                                    } else {
                                      if (var36 == 0) {
                                        continue L32;
                                      } else {
                                        break L34;
                                      }
                                    }
                                  }
                                }
                                var37.field_j = var37.field_j + 1;
                                var17++;
                                var19 = 0;
                                break L33;
                              }
                              var20 = 0;
                              L35: while (true) {
                                L36: {
                                  L37: {
                                    if (-129 >= (var20 ^ -1)) {
                                      break L37;
                                    } else {
                                      var19 = var19 + var37.g(31365);
                                      this.field_g[var20] = (short)var19;
                                      var20++;
                                      if (var36 != 0) {
                                        break L36;
                                      } else {
                                        if (var36 == 0) {
                                          continue L35;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                  }
                                  var19 = 0;
                                  break L36;
                                }
                                var20 = 0;
                                L38: while (true) {
                                  L39: {
                                    L40: {
                                      if (128 <= var20) {
                                        break L40;
                                      } else {
                                        var19 = var19 + var37.g(31365);
                                        this.field_g[var20] = (short)(this.field_g[var20] + (var19 << 732497864));
                                        var20++;
                                        if (var36 != 0) {
                                          break L39;
                                        } else {
                                          if (var36 == 0) {
                                            continue L38;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                    }
                                    var20 = 0;
                                    break L39;
                                  }
                                  var21 = 0;
                                  var22 = 0;
                                  var23 = 0;
                                  L41: while (true) {
                                    L42: {
                                      L43: {
                                        if (-129 >= (var23 ^ -1)) {
                                          break L43;
                                        } else {
                                          stackOut_72_0 = 0;
                                          stackIn_80_0 = stackOut_72_0;
                                          stackIn_73_0 = stackOut_72_0;
                                          if (var36 != 0) {
                                            break L42;
                                          } else {
                                            L44: {
                                              if (stackIn_73_0 != var20) {
                                                break L44;
                                              } else {
                                                L45: {
                                                  L46: {
                                                    if (var21 >= var53.length) {
                                                      break L46;
                                                    } else {
                                                      incrementValue$11 = var21;
                                                      var21++;
                                                      var20 = var18[incrementValue$11];
                                                      if (var36 == 0) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                  var20 = -1;
                                                  break L45;
                                                }
                                                var22 = var37.a(0);
                                                break L44;
                                              }
                                            }
                                            this.field_g[var23] = (short)(this.field_g[var23] + (tq.b(2, -1 + var22) << -520245554));
                                            var20--;
                                            this.field_r[var23] = var22;
                                            var23++;
                                            if (var36 == 0) {
                                              continue L41;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                      }
                                      var20 = 0;
                                      var21 = 0;
                                      var23 = 0;
                                      stackOut_79_0 = 0;
                                      stackIn_80_0 = stackOut_79_0;
                                      break L42;
                                    }
                                    var24 = stackIn_80_0;
                                    L47: while (true) {
                                      L48: {
                                        L49: {
                                          if (-129 >= (var24 ^ -1)) {
                                            break L49;
                                          } else {
                                            stackOut_82_0 = -1;
                                            stackIn_92_0 = stackOut_82_0;
                                            stackIn_83_0 = stackOut_82_0;
                                            if (var36 != 0) {
                                              break L48;
                                            } else {
                                              L50: {
                                                if (stackIn_83_0 == (this.field_r[var24] ^ -1)) {
                                                  break L50;
                                                } else {
                                                  L51: {
                                                    if ((var20 ^ -1) != -1) {
                                                      break L51;
                                                    } else {
                                                      L52: {
                                                        L53: {
                                                          if (var54.length <= var21) {
                                                            break L53;
                                                          } else {
                                                            incrementValue$12 = var21;
                                                            var21++;
                                                            var20 = var4[incrementValue$12];
                                                            if (var36 == 0) {
                                                              break L52;
                                                            } else {
                                                              break L53;
                                                            }
                                                          }
                                                        }
                                                        var20 = -1;
                                                        break L52;
                                                      }
                                                      incrementValue$13 = var5;
                                                      var5++;
                                                      var23 = -1 + var37.field_m[incrementValue$13];
                                                      break L51;
                                                    }
                                                  }
                                                  this.field_m[var24] = (byte)var23;
                                                  var20--;
                                                  break L50;
                                                }
                                              }
                                              var24++;
                                              if (var36 == 0) {
                                                continue L47;
                                              } else {
                                                break L49;
                                              }
                                            }
                                          }
                                        }
                                        var21 = 0;
                                        var20 = 0;
                                        var24 = 0;
                                        stackOut_91_0 = 0;
                                        stackIn_92_0 = stackOut_91_0;
                                        break L48;
                                      }
                                      var25_int = stackIn_92_0;
                                      L54: while (true) {
                                        L55: {
                                          L56: {
                                            if ((var25_int ^ -1) <= -129) {
                                              break L56;
                                            } else {
                                              stackOut_94_0 = this.field_r[var25_int];
                                              stackIn_104_0 = stackOut_94_0;
                                              stackIn_95_0 = stackOut_94_0;
                                              if (var36 != 0) {
                                                break L55;
                                              } else {
                                                L57: {
                                                  L58: {
                                                    if (stackIn_95_0 != 0) {
                                                      break L58;
                                                    } else {
                                                      if (var36 == 0) {
                                                        break L57;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  L59: {
                                                    if (-1 != (var20 ^ -1)) {
                                                      break L59;
                                                    } else {
                                                      L60: {
                                                        incrementValue$14 = var8;
                                                        var8++;
                                                        var24 = 16 + var37.field_m[incrementValue$14] << -1886766526;
                                                        if (var55.length > var21) {
                                                          break L60;
                                                        } else {
                                                          var20 = -1;
                                                          if (var36 == 0) {
                                                            break L59;
                                                          } else {
                                                            break L60;
                                                          }
                                                        }
                                                      }
                                                      incrementValue$15 = var21;
                                                      var21++;
                                                      var20 = var7[incrementValue$15];
                                                      break L59;
                                                    }
                                                  }
                                                  this.field_j[var25_int] = (byte)var24;
                                                  var20--;
                                                  break L57;
                                                }
                                                var25_int++;
                                                if (var36 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          var20 = 0;
                                          stackOut_103_0 = 0;
                                          stackIn_104_0 = stackOut_103_0;
                                          break L55;
                                        }
                                        var21 = stackIn_104_0;
                                        var25 = null;
                                        var26 = 0;
                                        L61: while (true) {
                                          L62: {
                                            L63: {
                                              if ((var26 ^ -1) <= -129) {
                                                break L63;
                                              } else {
                                                stackOut_106_0 = this.field_r[var26] ^ -1;
                                                stackIn_116_0 = stackOut_106_0;
                                                stackIn_107_0 = stackOut_106_0;
                                                if (var36 != 0) {
                                                  break L62;
                                                } else {
                                                  L64: {
                                                    L65: {
                                                      if (stackIn_107_0 != -1) {
                                                        break L65;
                                                      } else {
                                                        if (var36 == 0) {
                                                          break L64;
                                                        } else {
                                                          break L65;
                                                        }
                                                      }
                                                    }
                                                    L66: {
                                                      if (-1 != (var20 ^ -1)) {
                                                        break L66;
                                                      } else {
                                                        L67: {
                                                          var25 = var13[var52[var21]];
                                                          if (var21 >= var56.length) {
                                                            break L67;
                                                          } else {
                                                            incrementValue$16 = var21;
                                                            var21++;
                                                            var20 = var10[incrementValue$16];
                                                            if (var36 == 0) {
                                                              break L66;
                                                            } else {
                                                              break L67;
                                                            }
                                                          }
                                                        }
                                                        var20 = -1;
                                                        break L66;
                                                      }
                                                    }
                                                    var20--;
                                                    this.field_q[var26] = (nj) (var25);
                                                    break L64;
                                                  }
                                                  var26++;
                                                  if (var36 == 0) {
                                                    continue L61;
                                                  } else {
                                                    break L63;
                                                  }
                                                }
                                              }
                                            }
                                            var21 = 0;
                                            var20 = 0;
                                            var26 = 0;
                                            stackOut_115_0 = 0;
                                            stackIn_116_0 = stackOut_115_0;
                                            break L62;
                                          }
                                          var27 = stackIn_116_0;
                                          L68: while (true) {
                                            L69: {
                                              L70: {
                                                L71: {
                                                  if ((var27 ^ -1) <= -129) {
                                                    break L71;
                                                  } else {
                                                    stackOut_118_0 = 0;
                                                    stackOut_118_1 = var20;
                                                    stackIn_128_0 = stackOut_118_0;
                                                    stackIn_128_1 = stackOut_118_1;
                                                    stackIn_119_0 = stackOut_118_0;
                                                    stackIn_119_1 = stackOut_118_1;
                                                    if (var36 != 0) {
                                                      L72: while (true) {
                                                        if (stackIn_128_0 >= stackIn_128_1) {
                                                          break L70;
                                                        } else {
                                                          var44 = var13[var27];
                                                          stackOut_129_0 = var44.field_l;
                                                          stackIn_143_0 = stackOut_129_0;
                                                          stackIn_130_0 = stackOut_129_0;
                                                          if (var36 != 0) {
                                                            break L69;
                                                          } else {
                                                            L73: {
                                                              L74: {
                                                                if (stackIn_130_0 == null) {
                                                                  break L74;
                                                                } else {
                                                                  var29 = 1;
                                                                  L75: while (true) {
                                                                    if (var44.field_l.length <= var29) {
                                                                      break L74;
                                                                    } else {
                                                                      var44.field_l[var29] = var37.d(-249699580);
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L73;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L75;
                                                                        } else {
                                                                          break L74;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              L76: {
                                                                if (var44.field_e == null) {
                                                                  break L76;
                                                                } else {
                                                                  var29 = 3;
                                                                  L77: while (true) {
                                                                    if ((var44.field_e.length - 2 ^ -1) >= (var29 ^ -1)) {
                                                                      break L76;
                                                                    } else {
                                                                      var44.field_e[var29] = var37.d(-249699580);
                                                                      var29 += 2;
                                                                      if (var36 != 0) {
                                                                        break L73;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L77;
                                                                        } else {
                                                                          break L76;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var27++;
                                                              break L73;
                                                            }
                                                            if (var36 == 0) {
                                                              stackOut_127_0 = var27;
                                                              stackOut_127_1 = var12;
                                                              stackIn_128_0 = stackOut_127_0;
                                                              stackIn_128_1 = stackOut_127_1;
                                                              continue L72;
                                                            } else {
                                                              break L70;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      L78: {
                                                        if (stackIn_119_0 != stackIn_119_1) {
                                                          break L78;
                                                        } else {
                                                          L79: {
                                                            L80: {
                                                              if (var21 >= var53.length) {
                                                                break L80;
                                                              } else {
                                                                incrementValue$17 = var21;
                                                                var21++;
                                                                var20 = var18[incrementValue$17];
                                                                if (var36 == 0) {
                                                                  break L79;
                                                                } else {
                                                                  break L80;
                                                                }
                                                              }
                                                            }
                                                            var20 = -1;
                                                            break L79;
                                                          }
                                                          if (this.field_r[var27] <= 0) {
                                                            break L78;
                                                          } else {
                                                            var26 = 1 + var37.g(31365);
                                                            break L78;
                                                          }
                                                        }
                                                      }
                                                      var20--;
                                                      this.field_h[var27] = (byte)var26;
                                                      var27++;
                                                      if (var36 == 0) {
                                                        continue L68;
                                                      } else {
                                                        break L71;
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_o = 1 + var37.g(31365);
                                                var27 = 0;
                                                L81: while (true) {
                                                  stackOut_127_0 = var27;
                                                  stackOut_127_1 = var12;
                                                  stackIn_128_0 = stackOut_127_0;
                                                  stackIn_128_1 = stackOut_127_1;
                                                  if (stackIn_128_0 >= stackIn_128_1) {
                                                    break L70;
                                                  } else {
                                                    var44 = var13[var27];
                                                    stackOut_129_0 = var44.field_l;
                                                    stackIn_143_0 = stackOut_129_0;
                                                    stackIn_130_0 = stackOut_129_0;
                                                    if (var36 != 0) {
                                                      break L69;
                                                    } else {
                                                      L82: {
                                                        L83: {
                                                          if (stackIn_130_0 == null) {
                                                            break L83;
                                                          } else {
                                                            var29 = 1;
                                                            L84: while (true) {
                                                              if (var44.field_l.length <= var29) {
                                                                break L83;
                                                              } else {
                                                                var44.field_l[var29] = var37.d(-249699580);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L82;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L84;
                                                                  } else {
                                                                    break L83;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L85: {
                                                          if (var44.field_e == null) {
                                                            break L85;
                                                          } else {
                                                            var29 = 3;
                                                            L86: while (true) {
                                                              if ((var44.field_e.length - 2 ^ -1) >= (var29 ^ -1)) {
                                                                break L85;
                                                              } else {
                                                                var44.field_e[var29] = var37.d(-249699580);
                                                                var29 += 2;
                                                                if (var36 != 0) {
                                                                  break L82;
                                                                } else {
                                                                  if (var36 == 0) {
                                                                    continue L86;
                                                                  } else {
                                                                    break L85;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27++;
                                                        break L82;
                                                      }
                                                      if (var36 == 0) {
                                                        continue L81;
                                                      } else {
                                                        break L70;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_142_0 = (byte[]) (var15_array);
                                              stackIn_143_0 = stackOut_142_0;
                                              break L69;
                                            }
                                            L87: {
                                              L88: {
                                                L89: {
                                                  L90: {
                                                    if (stackIn_143_0 == null) {
                                                      break L90;
                                                    } else {
                                                      var27 = 1;
                                                      L91: while (true) {
                                                        if ((var57.length ^ -1) >= (var27 ^ -1)) {
                                                          break L90;
                                                        } else {
                                                          var15_array[var27] = var37.d(-249699580);
                                                          var27 += 2;
                                                          if (var36 != 0) {
                                                            break L89;
                                                          } else {
                                                            if (var36 == 0) {
                                                              continue L91;
                                                            } else {
                                                              break L90;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var16 == null) {
                                                    break L88;
                                                  } else {
                                                    break L89;
                                                  }
                                                }
                                                var27 = 1;
                                                L92: while (true) {
                                                  if ((var46.length ^ -1) >= (var27 ^ -1)) {
                                                    break L88;
                                                  } else {
                                                    var16[var27] = var37.d(-249699580);
                                                    var27 += 2;
                                                    if (var36 != 0) {
                                                      break L87;
                                                    } else {
                                                      if (var36 == 0) {
                                                        continue L92;
                                                      } else {
                                                        break L88;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var27 = 0;
                                              break L87;
                                            }
                                            L93: while (true) {
                                              L94: {
                                                L95: {
                                                  L96: {
                                                    L97: {
                                                      L98: {
                                                        L99: {
                                                          if (var27 >= var12) {
                                                            break L99;
                                                          } else {
                                                            var47 = var13[var27];
                                                            stackOut_155_0 = var47.field_e;
                                                            stackIn_196_0 = stackOut_155_0;
                                                            stackIn_156_0 = stackOut_155_0;
                                                            if (var36 != 0) {
                                                              break L98;
                                                            } else {
                                                              L100: {
                                                                L101: {
                                                                  if (stackIn_156_0 == null) {
                                                                    break L101;
                                                                  } else {
                                                                    var19 = 0;
                                                                    var29 = 2;
                                                                    L102: while (true) {
                                                                      if (var29 >= var47.field_e.length) {
                                                                        break L101;
                                                                      } else {
                                                                        var19 = 1 + var19 + var37.g(31365);
                                                                        var47.field_e[var29] = (byte)var19;
                                                                        var29 += 2;
                                                                        if (var36 != 0) {
                                                                          break L100;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            continue L102;
                                                                          } else {
                                                                            break L101;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var27++;
                                                                break L100;
                                                              }
                                                              if (var36 == 0) {
                                                                continue L93;
                                                              } else {
                                                                break L99;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = 0;
                                                        L103: while (true) {
                                                          L104: {
                                                            if (var27 >= var12) {
                                                              break L104;
                                                            } else {
                                                              var48 = var13[var27];
                                                              stackOut_165_0 = var48.field_l;
                                                              stackIn_196_0 = stackOut_165_0;
                                                              stackIn_166_0 = stackOut_165_0;
                                                              if (var36 != 0) {
                                                                break L98;
                                                              } else {
                                                                L105: {
                                                                  L106: {
                                                                    if (stackIn_166_0 == null) {
                                                                      break L106;
                                                                    } else {
                                                                      var19 = 0;
                                                                      var29 = 2;
                                                                      L107: while (true) {
                                                                        if (var29 >= var48.field_l.length) {
                                                                          break L106;
                                                                        } else {
                                                                          var19 = 1 + var19 + var37.g(31365);
                                                                          var48.field_l[var29] = (byte)var19;
                                                                          var29 += 2;
                                                                          if (var36 != 0) {
                                                                            break L105;
                                                                          } else {
                                                                            if (var36 == 0) {
                                                                              continue L107;
                                                                            } else {
                                                                              break L106;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var27++;
                                                                  break L105;
                                                                }
                                                                if (var36 == 0) {
                                                                  continue L103;
                                                                } else {
                                                                  break L104;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L108: {
                                                            if (var15_array == null) {
                                                              break L108;
                                                            } else {
                                                              var19 = var37.g(31365);
                                                              var15_array[0] = (byte)var19;
                                                              var27 = 2;
                                                              L109: while (true) {
                                                                L110: {
                                                                  L111: {
                                                                    if (var57.length <= var27) {
                                                                      break L111;
                                                                    } else {
                                                                      var19 = var37.g(31365) + var19 + 1;
                                                                      var15_array[var27] = (byte)var19;
                                                                      var27 += 2;
                                                                      if (var36 != 0) {
                                                                        break L110;
                                                                      } else {
                                                                        if (var36 == 0) {
                                                                          continue L109;
                                                                        } else {
                                                                          break L111;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var27 = var57[0];
                                                                  break L110;
                                                                }
                                                                var28 = var57[1];
                                                                var29 = 0;
                                                                L112: while (true) {
                                                                  L113: {
                                                                    L114: {
                                                                      if (var29 >= var27) {
                                                                        break L114;
                                                                      } else {
                                                                        this.field_h[var29] = (byte)(32 + this.field_h[var29] * var28 >> -686192218);
                                                                        var29++;
                                                                        if (var36 != 0) {
                                                                          break L113;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            continue L112;
                                                                          } else {
                                                                            break L114;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var29 = 2;
                                                                    break L113;
                                                                  }
                                                                  L115: while (true) {
                                                                    L116: {
                                                                      if ((var57.length ^ -1) >= (var29 ^ -1)) {
                                                                        break L116;
                                                                      } else {
                                                                        var30 = var57[var29];
                                                                        var31 = var15_array[var29 - -1];
                                                                        var32 = (var30 - var27) / 2 + var28 * (var30 - var27);
                                                                        stackOut_185_0 = var27;
                                                                        stackIn_198_0 = stackOut_185_0;
                                                                        stackIn_186_0 = stackOut_185_0;
                                                                        if (var36 != 0) {
                                                                          break L97;
                                                                        } else {
                                                                          var33 = stackIn_186_0;
                                                                          L117: while (true) {
                                                                            L118: {
                                                                              L119: {
                                                                                if ((var33 ^ -1) <= (var30 ^ -1)) {
                                                                                  break L119;
                                                                                } else {
                                                                                  var34 = cn.a(-var27 + var30, -95, var32);
                                                                                  var32 = var32 + (-var28 + var31);
                                                                                  this.field_h[var33] = (byte)(32 + var34 * this.field_h[var33] >> 1073544614);
                                                                                  var33++;
                                                                                  if (var36 != 0) {
                                                                                    break L118;
                                                                                  } else {
                                                                                    if (var36 == 0) {
                                                                                      continue L117;
                                                                                    } else {
                                                                                      break L119;
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              var28 = var31;
                                                                              var27 = var30;
                                                                              var29 += 2;
                                                                              break L118;
                                                                            }
                                                                            if (var36 == 0) {
                                                                              continue L115;
                                                                            } else {
                                                                              break L116;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                    var15_array = null;
                                                                    var30 = var27;
                                                                    L120: while (true) {
                                                                      if (var30 >= 128) {
                                                                        break L108;
                                                                      } else {
                                                                        this.field_h[var30] = (byte)(this.field_h[var30] * var28 + 32 >> -1195203930);
                                                                        var30++;
                                                                        continue L120;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          stackOut_195_0 = (byte[]) (var16);
                                                          stackIn_196_0 = stackOut_195_0;
                                                          break L98;
                                                        }
                                                      }
                                                      if (stackIn_196_0 == null) {
                                                        break L96;
                                                      } else {
                                                        var19 = var37.g(31365);
                                                        var16[0] = (byte)var19;
                                                        stackOut_197_0 = 2;
                                                        stackIn_198_0 = stackOut_197_0;
                                                        break L97;
                                                      }
                                                    }
                                                    var27 = stackIn_198_0;
                                                    L121: while (true) {
                                                      L122: {
                                                        L123: {
                                                          if (var46.length <= var27) {
                                                            break L123;
                                                          } else {
                                                            var19 = var19 + 1 - -var37.g(31365);
                                                            var16[var27] = (byte)var19;
                                                            var27 += 2;
                                                            if (var36 != 0) {
                                                              break L122;
                                                            } else {
                                                              if (var36 == 0) {
                                                                continue L121;
                                                              } else {
                                                                break L123;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = var46[0];
                                                        break L122;
                                                      }
                                                      var28 = var46[1] << -377749055;
                                                      var29 = 0;
                                                      L124: while (true) {
                                                        L125: {
                                                          L126: {
                                                            if (var27 <= var29) {
                                                              break L126;
                                                            } else {
                                                              var30 = (this.field_j[var29] & 255) - -var28;
                                                              stackOut_205_0 = var30;
                                                              stackIn_212_0 = stackOut_205_0;
                                                              stackIn_206_0 = stackOut_205_0;
                                                              if (var36 != 0) {
                                                                break L125;
                                                              } else {
                                                                L127: {
                                                                  if (stackIn_206_0 >= 0) {
                                                                    break L127;
                                                                  } else {
                                                                    var30 = 0;
                                                                    break L127;
                                                                  }
                                                                }
                                                                L128: {
                                                                  if (128 >= var30) {
                                                                    break L128;
                                                                  } else {
                                                                    var30 = 128;
                                                                    break L128;
                                                                  }
                                                                }
                                                                this.field_j[var29] = (byte)var30;
                                                                var29++;
                                                                if (var36 == 0) {
                                                                  continue L124;
                                                                } else {
                                                                  break L126;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          stackOut_211_0 = 2;
                                                          stackIn_212_0 = stackOut_211_0;
                                                          break L125;
                                                        }
                                                        var29 = stackIn_212_0;
                                                        L129: while (true) {
                                                          stackOut_213_0 = var29 ^ -1;
                                                          stackOut_213_1 = var46.length ^ -1;
                                                          stackIn_214_0 = stackOut_213_0;
                                                          stackIn_214_1 = stackOut_213_1;
                                                          L130: while (true) {
                                                            L131: {
                                                              L132: {
                                                                if (stackIn_214_0 <= stackIn_214_1) {
                                                                  break L132;
                                                                } else {
                                                                  var30 = var46[var29];
                                                                  var31 = var16[var29 + 1] << 1772214753;
                                                                  var32 = (var30 - var27) / 2 + (-var27 + var30) * var28;
                                                                  stackOut_215_0 = var27;
                                                                  stackIn_226_0 = stackOut_215_0;
                                                                  stackIn_216_0 = stackOut_215_0;
                                                                  if (var36 != 0) {
                                                                    break L131;
                                                                  } else {
                                                                    var33 = stackIn_216_0;
                                                                    L133: while (true) {
                                                                      L134: {
                                                                        if (var30 <= var33) {
                                                                          break L134;
                                                                        } else {
                                                                          var34 = cn.a(-var27 + var30, -125, var32);
                                                                          var35 = (this.field_j[var33] & 255) - -var34;
                                                                          stackOut_218_0 = 0;
                                                                          stackOut_218_1 = var35;
                                                                          stackIn_214_0 = stackOut_218_0;
                                                                          stackIn_214_1 = stackOut_218_1;
                                                                          stackIn_219_0 = stackOut_218_0;
                                                                          stackIn_219_1 = stackOut_218_1;
                                                                          if (var36 != 0) {
                                                                            continue L130;
                                                                          } else {
                                                                            L135: {
                                                                              if (stackIn_219_0 <= stackIn_219_1) {
                                                                                break L135;
                                                                              } else {
                                                                                var35 = 0;
                                                                                break L135;
                                                                              }
                                                                            }
                                                                            L136: {
                                                                              if (128 >= var35) {
                                                                                break L136;
                                                                              } else {
                                                                                var35 = 128;
                                                                                break L136;
                                                                              }
                                                                            }
                                                                            var32 = var32 + (var31 - var28);
                                                                            this.field_j[var33] = (byte)var35;
                                                                            var33++;
                                                                            if (var36 == 0) {
                                                                              continue L133;
                                                                            } else {
                                                                              break L134;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var28 = var31;
                                                                      var29 += 2;
                                                                      var27 = var30;
                                                                      if (var36 == 0) {
                                                                        continue L129;
                                                                      } else {
                                                                        break L132;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              stackOut_225_0 = var27;
                                                              stackIn_226_0 = stackOut_225_0;
                                                              break L131;
                                                            }
                                                            var30 = stackIn_226_0;
                                                            L137: while (true) {
                                                              L138: {
                                                                if ((var30 ^ -1) <= -129) {
                                                                  break L138;
                                                                } else {
                                                                  var31 = (255 & this.field_j[var30]) + var28;
                                                                  stackOut_228_0 = 0;
                                                                  stackOut_228_1 = var31;
                                                                  stackIn_237_0 = stackOut_228_0;
                                                                  stackIn_237_1 = stackOut_228_1;
                                                                  stackIn_229_0 = stackOut_228_0;
                                                                  stackIn_229_1 = stackOut_228_1;
                                                                  if (var36 != 0) {
                                                                    L139: while (true) {
                                                                      if (stackIn_237_0 <= stackIn_237_1) {
                                                                        break L95;
                                                                      } else {
                                                                        var13[var27].field_b = var37.g(31365);
                                                                        var27++;
                                                                        if (var36 != 0) {
                                                                          break L94;
                                                                        } else {
                                                                          if (var36 == 0) {
                                                                            stackOut_236_0 = var12;
                                                                            stackOut_236_1 = var27;
                                                                            stackIn_237_0 = stackOut_236_0;
                                                                            stackIn_237_1 = stackOut_236_1;
                                                                            continue L139;
                                                                          } else {
                                                                            break L95;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L140: {
                                                                      if (stackIn_229_0 <= stackIn_229_1) {
                                                                        break L140;
                                                                      } else {
                                                                        var31 = 0;
                                                                        break L140;
                                                                      }
                                                                    }
                                                                    L141: {
                                                                      if (var31 <= 128) {
                                                                        break L141;
                                                                      } else {
                                                                        var31 = 128;
                                                                        break L141;
                                                                      }
                                                                    }
                                                                    this.field_j[var30] = (byte)var31;
                                                                    var30++;
                                                                    if (var36 == 0) {
                                                                      continue L137;
                                                                    } else {
                                                                      break L138;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var16 = null;
                                                              break L96;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  L142: while (true) {
                                                    stackOut_236_0 = var12;
                                                    stackOut_236_1 = var27;
                                                    stackIn_237_0 = stackOut_236_0;
                                                    stackIn_237_1 = stackOut_236_1;
                                                    if (stackIn_237_0 <= stackIn_237_1) {
                                                      break L95;
                                                    } else {
                                                      var13[var27].field_b = var37.g(31365);
                                                      var27++;
                                                      if (var36 != 0) {
                                                        break L94;
                                                      } else {
                                                        if (var36 == 0) {
                                                          continue L142;
                                                        } else {
                                                          break L95;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var27 = 0;
                                                break L94;
                                              }
                                              L143: while (true) {
                                                L144: {
                                                  L145: {
                                                    if ((var12 ^ -1) >= (var27 ^ -1)) {
                                                      break L145;
                                                    } else {
                                                      var49 = var13[var27];
                                                      if (var36 != 0) {
                                                        break L144;
                                                      } else {
                                                        L146: {
                                                          if (null == var49.field_l) {
                                                            break L146;
                                                          } else {
                                                            var49.field_c = var37.g(31365);
                                                            break L146;
                                                          }
                                                        }
                                                        L147: {
                                                          if (null == var49.field_e) {
                                                            break L147;
                                                          } else {
                                                            var49.field_m = var37.g(31365);
                                                            break L147;
                                                          }
                                                        }
                                                        L148: {
                                                          if (var49.field_b <= 0) {
                                                            break L148;
                                                          } else {
                                                            var49.field_i = var37.g(31365);
                                                            break L148;
                                                          }
                                                        }
                                                        var27++;
                                                        if (var36 == 0) {
                                                          continue L143;
                                                        } else {
                                                          break L145;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var27 = 0;
                                                  break L144;
                                                }
                                                L149: while (true) {
                                                  L150: {
                                                    L151: {
                                                      if (var27 >= var12) {
                                                        break L151;
                                                      } else {
                                                        var13[var27].field_k = var37.g(31365);
                                                        var27++;
                                                        if (var36 != 0) {
                                                          break L150;
                                                        } else {
                                                          if (var36 == 0) {
                                                            continue L149;
                                                          } else {
                                                            break L151;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var27 = 0;
                                                    break L150;
                                                  }
                                                  L152: while (true) {
                                                    L153: {
                                                      L154: {
                                                        L155: {
                                                          if ((var27 ^ -1) <= (var12 ^ -1)) {
                                                            break L155;
                                                          } else {
                                                            var50 = var13[var27];
                                                            stackOut_256_0 = var50.field_k ^ -1;
                                                            stackOut_256_1 = -1;
                                                            stackIn_262_0 = stackOut_256_0;
                                                            stackIn_262_1 = stackOut_256_1;
                                                            stackIn_257_0 = stackOut_256_0;
                                                            stackIn_257_1 = stackOut_256_1;
                                                            if (var36 != 0) {
                                                              L156: while (true) {
                                                                if (stackIn_262_0 >= stackIn_262_1) {
                                                                  break L153;
                                                                } else {
                                                                  var51 = var13[var27];
                                                                  if (var36 != 0) {
                                                                    break L154;
                                                                  } else {
                                                                    L157: {
                                                                      if ((var51.field_g ^ -1) >= -1) {
                                                                        break L157;
                                                                      } else {
                                                                        var51.field_j = var37.g(31365);
                                                                        break L157;
                                                                      }
                                                                    }
                                                                    var27++;
                                                                    if (var36 == 0) {
                                                                      stackOut_261_0 = var27;
                                                                      stackOut_261_1 = var12;
                                                                      stackIn_262_0 = stackOut_261_0;
                                                                      stackIn_262_1 = stackOut_261_1;
                                                                      continue L156;
                                                                    } else {
                                                                      break L153;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              L158: {
                                                                if (stackIn_257_0 >= stackIn_257_1) {
                                                                  break L158;
                                                                } else {
                                                                  var50.field_g = var37.g(31365);
                                                                  break L158;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L152;
                                                              } else {
                                                                break L155;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var27 = 0;
                                                        L159: while (true) {
                                                          stackOut_261_0 = var27;
                                                          stackOut_261_1 = var12;
                                                          stackIn_262_0 = stackOut_261_0;
                                                          stackIn_262_1 = stackOut_261_1;
                                                          if (stackIn_262_0 >= stackIn_262_1) {
                                                            break L153;
                                                          } else {
                                                            var51 = var13[var27];
                                                            if (var36 != 0) {
                                                              break L154;
                                                            } else {
                                                              L160: {
                                                                if ((var51.field_g ^ -1) >= -1) {
                                                                  break L160;
                                                                } else {
                                                                  var51.field_j = var37.g(31365);
                                                                  break L160;
                                                                }
                                                              }
                                                              var27++;
                                                              if (var36 == 0) {
                                                                continue L159;
                                                              } else {
                                                                break L153;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                      decompiledRegionSelector0 = 0;
                                                      break L0;
                                                    }
                                                    decompiledRegionSelector0 = 1;
                                                    break L0;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L161: {
            var2 = decompiledCaughtException;
            stackOut_268_0 = (RuntimeException) (var2);
            stackOut_268_1 = new StringBuilder().append("po.<init>(");
            stackIn_270_0 = stackOut_268_0;
            stackIn_270_1 = stackOut_268_1;
            stackIn_269_0 = stackOut_268_0;
            stackIn_269_1 = stackOut_268_1;
            if (param0 == null) {
              stackOut_270_0 = (RuntimeException) ((Object) stackIn_270_0);
              stackOut_270_1 = (StringBuilder) ((Object) stackIn_270_1);
              stackOut_270_2 = "null";
              stackIn_271_0 = stackOut_270_0;
              stackIn_271_1 = stackOut_270_1;
              stackIn_271_2 = stackOut_270_2;
              break L161;
            } else {
              stackOut_269_0 = (RuntimeException) ((Object) stackIn_269_0);
              stackOut_269_1 = (StringBuilder) ((Object) stackIn_269_1);
              stackOut_269_2 = "{...}";
              stackIn_271_0 = stackOut_269_0;
              stackIn_271_1 = stackOut_269_1;
              stackIn_271_2 = stackOut_269_2;
              break L161;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_271_0), stackIn_271_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(me param0, int param1, byte[] param2, int[] param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 1;
              if (param1 >= 39) {
                break L1;
              } else {
                discarded$1 = po.c(-70);
                break L1;
              }
            }
            var6 = 0;
            var7 = null;
            var8 = 0;
            L2: while (true) {
              L3: {
                if (var8 >= 128) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (param2 == null) {
                        break L5;
                      } else {
                        if (-1 != (param2[var8] ^ -1)) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      var9 = this.field_r[var8];
                      if ((var9 ^ -1) != -1) {
                        break L6;
                      } else {
                        if (var10 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 != var6) {
                        L8: {
                          L9: {
                            var6 = var9;
                            var9--;
                            if ((1 & var9) == 0) {
                              break L9;
                            } else {
                              var7 = param0.a(var9 >> 606635074, (byte) -64, param3);
                              if (var10 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          var7 = param0.a(var9 >> 729298978, param3, 115);
                          break L8;
                        }
                        if (var7 == null) {
                          var5_int = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_s[var8] = (jd) (var7);
                      this.field_r[var8] = 0;
                      break L4;
                    }
                  }
                  var8++;
                  if (var10 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_22_0 = var5_int;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("po.E(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    static {
        field_f = "Searching for an opponent";
        field_i = "";
        field_p = false;
    }
}
