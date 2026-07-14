/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pn implements Cloneable {
    static dl[] field_u;
    gh field_o;
    gh field_p;
    static String[] field_r;
    static int field_n;
    static String field_t;
    int field_m;
    static String field_s;
    static dl field_q;

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        dl var5 = null;
        if (param1 > -74) {
          ro.g(-49);
          var5 = param0.a(13214, ((ro) this).field_m);
          return (f) (Object) new ma(var5, (f) this, param0);
        } else {
          var5 = param0.a(13214, ((ro) this).field_m);
          return (f) (Object) new ma(var5, (f) this, param0);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        var10 = jf.a(kh.field_j, param2, 0, param0 * 2 + param2, kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = 2 * (param0 * ((ro) this).field_o.field_m) / ((ro) this).field_o.field_p;
          var9 = 2 * ((ro) this).field_o.field_m * param5 / ((ro) this).field_o.field_p;
          if (param1 >= -38) {
            ((ro) this).field_o = null;
            ((ro) this).field_o.a(param4, ((ro) this).field_o.field_o * var8 + param2, param0, param5, param3 + ((ro) this).field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          } else {
            ((ro) this).field_o.a(param4, ((ro) this).field_o.field_o * var8 + param2, param0, param5, param3 + ((ro) this).field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          }
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            return true;
        }
        return true;
    }

    final static void g(int param0) {
        int var1 = -38 % ((18 - param0) / 61);
        wk.a(dg.field_a, true, fh.field_i, false);
        ud.field_U = true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var11 = null;
        dl var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        dl stackIn_22_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        dl stackIn_44_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_70_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        dl stackIn_92_0 = null;
        dl stackIn_96_0 = null;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_134_0 = 0;
        dl stackIn_139_0 = null;
        dl stackIn_143_0 = null;
        dl stackIn_169_0 = null;
        int stackIn_172_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_182_0 = 0;
        int stackIn_186_0 = 0;
        dl stackIn_191_0 = null;
        dl stackIn_195_0 = null;
        dl stackIn_217_0 = null;
        int stackIn_220_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_230_0 = 0;
        int stackIn_234_0 = 0;
        dl stackIn_239_0 = null;
        dl stackIn_243_0 = null;
        int stackIn_293_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_301_0 = 0;
        dl stackIn_306_0 = null;
        dl stackIn_339_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        dl stackOut_216_0 = null;
        dl stackOut_215_0 = null;
        int stackOut_219_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_232_0 = 0;
        dl stackOut_242_0 = null;
        dl stackOut_241_0 = null;
        dl stackOut_238_0 = null;
        dl stackOut_237_0 = null;
        dl stackOut_168_0 = null;
        dl stackOut_167_0 = null;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        dl stackOut_194_0 = null;
        dl stackOut_193_0 = null;
        dl stackOut_190_0 = null;
        dl stackOut_189_0 = null;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        dl stackOut_142_0 = null;
        dl stackOut_141_0 = null;
        dl stackOut_138_0 = null;
        dl stackOut_137_0 = null;
        dl stackOut_69_0 = null;
        dl stackOut_68_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        dl stackOut_95_0 = null;
        dl stackOut_94_0 = null;
        dl stackOut_91_0 = null;
        dl stackOut_90_0 = null;
        dl stackOut_21_0 = null;
        dl stackOut_20_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        dl stackOut_47_0 = null;
        dl stackOut_46_0 = null;
        dl stackOut_43_0 = null;
        dl stackOut_42_0 = null;
        int stackOut_296_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_292_0 = 0;
        int stackOut_291_0 = 0;
        int stackOut_300_0 = 0;
        int stackOut_299_0 = 0;
        dl stackOut_338_0 = null;
        dl stackOut_337_0 = null;
        dl stackOut_305_0 = null;
        dl stackOut_304_0 = null;
        L0: {
          var15 = CrazyCrystals.field_B;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          if (((ro) this).field_m != 1) {
            var11 = ig.field_q;
            break L0;
          } else {
            var11 = nf.field_g;
            break L0;
          }
        }
        if (((ro) this).field_p != null) {
          L1: {
            var12 = ((ro) this).field_p.field_G;
            var13 = ((ro) this).field_p.field_x;
            if (1 == ((ro) this).field_m) {
              L2: {
                if (0 >= var13 + -var12) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              var7 = stackIn_13_0;
              break L1;
            } else {
              L3: {
                if ((var13 + var12 ^ -1) >= -1) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              var7 = stackIn_9_0;
              break L1;
            }
          }
          if (0 != ((ro) this).field_p.field_m) {
            if (-7 > (((ro) this).field_p.field_m ^ -1)) {
              L4: {
                if (((ro) this).field_p.field_m == -1) {
                  var14 = 0;
                  break L4;
                } else {
                  var14 = -((ro) this).field_p.field_m + 12;
                  break L4;
                }
              }
              if (-2 == ((ro) this).field_m) {
                L5: {
                  if (-1 <= (-var13 + var12 ^ -1)) {
                    stackOut_216_0 = ja.field_h[var14];
                    stackIn_217_0 = stackOut_216_0;
                    break L5;
                  } else {
                    stackOut_215_0 = tk.field_h[var14];
                    stackIn_217_0 = stackOut_215_0;
                    break L5;
                  }
                }
                L6: {
                  var11 = stackIn_217_0;
                  if (var7 != 0) {
                    stackOut_219_0 = 0;
                    stackIn_220_0 = stackOut_219_0;
                    break L6;
                  } else {
                    stackOut_218_0 = 1;
                    stackIn_220_0 = stackOut_218_0;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_220_0;
                  if (null != ((ro) this).field_o) {
                    L8: {
                      var12 = ((ro) this).field_o.field_G;
                      var13 = ((ro) this).field_o.field_x;
                      if (-2 == ((ro) this).field_m) {
                        L9: {
                          if (-var12 + var13 <= -1) {
                            stackOut_229_0 = 0;
                            stackIn_230_0 = stackOut_229_0;
                            break L9;
                          } else {
                            stackOut_228_0 = 1;
                            stackIn_230_0 = stackOut_228_0;
                            break L9;
                          }
                        }
                        var8 = stackIn_230_0;
                        break L8;
                      } else {
                        L10: {
                          if (-1 <= var13 - -var12) {
                            stackOut_225_0 = 0;
                            stackIn_226_0 = stackOut_225_0;
                            break L10;
                          } else {
                            stackOut_224_0 = 1;
                            stackIn_226_0 = stackOut_224_0;
                            break L10;
                          }
                        }
                        var8 = stackIn_226_0;
                        break L8;
                      }
                    }
                    L11: {
                      if (var8 != 0) {
                        stackOut_233_0 = 0;
                        stackIn_234_0 = stackOut_233_0;
                        break L11;
                      } else {
                        stackOut_232_0 = 1;
                        stackIn_234_0 = stackOut_232_0;
                        break L11;
                      }
                    }
                    var10 = stackIn_234_0;
                    if (-7 <= ((ro) this).field_o.field_m) {
                      break L7;
                    } else {
                      var14 = ((ro) this).field_o.field_m;
                      if (1 != ((ro) this).field_m) {
                        L12: {
                          if (-1 >= (var13 + var12 ^ -1)) {
                            stackOut_242_0 = en.field_K[var14];
                            stackIn_243_0 = stackOut_242_0;
                            break L12;
                          } else {
                            stackOut_241_0 = db.field_j[var14];
                            stackIn_243_0 = stackOut_241_0;
                            break L12;
                          }
                        }
                        var11 = stackIn_243_0;
                        break L7;
                      } else {
                        L13: {
                          if (0 <= var12 + -var13) {
                            stackOut_238_0 = ja.field_h[var14];
                            stackIn_239_0 = stackOut_238_0;
                            break L13;
                          } else {
                            stackOut_237_0 = tk.field_h[var14];
                            stackIn_239_0 = stackOut_237_0;
                            break L13;
                          }
                        }
                        var11 = stackIn_239_0;
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                L14: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L17;
                    } else {
                      if (-25 == (param2 ^ -1)) {
                        var11.a(param4, -param2 + param5);
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L16;
                }
                L18: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              } else {
                L20: {
                  if (-1 > (var12 + var13 ^ -1)) {
                    stackOut_168_0 = db.field_j[var14];
                    stackIn_169_0 = stackOut_168_0;
                    break L20;
                  } else {
                    stackOut_167_0 = en.field_K[var14];
                    stackIn_169_0 = stackOut_167_0;
                    break L20;
                  }
                }
                L21: {
                  var11 = stackIn_169_0;
                  if (var7 != 0) {
                    stackOut_171_0 = 0;
                    stackIn_172_0 = stackOut_171_0;
                    break L21;
                  } else {
                    stackOut_170_0 = 1;
                    stackIn_172_0 = stackOut_170_0;
                    break L21;
                  }
                }
                L22: {
                  var9 = stackIn_172_0;
                  if (null != ((ro) this).field_o) {
                    L23: {
                      var12 = ((ro) this).field_o.field_G;
                      var13 = ((ro) this).field_o.field_x;
                      if (-2 == ((ro) this).field_m) {
                        L24: {
                          if (-var12 + var13 <= -1) {
                            stackOut_181_0 = 0;
                            stackIn_182_0 = stackOut_181_0;
                            break L24;
                          } else {
                            stackOut_180_0 = 1;
                            stackIn_182_0 = stackOut_180_0;
                            break L24;
                          }
                        }
                        var8 = stackIn_182_0;
                        break L23;
                      } else {
                        L25: {
                          if (-1 <= var13 - -var12) {
                            stackOut_177_0 = 0;
                            stackIn_178_0 = stackOut_177_0;
                            break L25;
                          } else {
                            stackOut_176_0 = 1;
                            stackIn_178_0 = stackOut_176_0;
                            break L25;
                          }
                        }
                        var8 = stackIn_178_0;
                        break L23;
                      }
                    }
                    L26: {
                      if (var8 != 0) {
                        stackOut_185_0 = 0;
                        stackIn_186_0 = stackOut_185_0;
                        break L26;
                      } else {
                        stackOut_184_0 = 1;
                        stackIn_186_0 = stackOut_184_0;
                        break L26;
                      }
                    }
                    var10 = stackIn_186_0;
                    if (-7 <= ((ro) this).field_o.field_m) {
                      break L22;
                    } else {
                      var14 = ((ro) this).field_o.field_m;
                      if (1 != ((ro) this).field_m) {
                        L27: {
                          if (-1 >= (var13 + var12 ^ -1)) {
                            stackOut_194_0 = en.field_K[var14];
                            stackIn_195_0 = stackOut_194_0;
                            break L27;
                          } else {
                            stackOut_193_0 = db.field_j[var14];
                            stackIn_195_0 = stackOut_193_0;
                            break L27;
                          }
                        }
                        var11 = stackIn_195_0;
                        break L22;
                      } else {
                        L28: {
                          if (0 <= var12 + -var13) {
                            stackOut_190_0 = ja.field_h[var14];
                            stackIn_191_0 = stackOut_190_0;
                            break L28;
                          } else {
                            stackOut_189_0 = tk.field_h[var14];
                            stackIn_191_0 = stackOut_189_0;
                            break L28;
                          }
                        }
                        var11 = stackIn_191_0;
                        break L22;
                      }
                    }
                  } else {
                    break L22;
                  }
                }
                L29: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  L32: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L32;
                    } else {
                      if (-25 == (param2 ^ -1)) {
                        var11.a(param4, -param2 + param5);
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L31;
                }
                L33: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                return;
              }
            } else {
              L35: {
                if (var7 != 0) {
                  stackOut_119_0 = 0;
                  stackIn_120_0 = stackOut_119_0;
                  break L35;
                } else {
                  stackOut_118_0 = 1;
                  stackIn_120_0 = stackOut_118_0;
                  break L35;
                }
              }
              L36: {
                var9 = stackIn_120_0;
                if (null != ((ro) this).field_o) {
                  L37: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (-2 == ((ro) this).field_m) {
                      L38: {
                        if (-var12 + var13 <= -1) {
                          stackOut_129_0 = 0;
                          stackIn_130_0 = stackOut_129_0;
                          break L38;
                        } else {
                          stackOut_128_0 = 1;
                          stackIn_130_0 = stackOut_128_0;
                          break L38;
                        }
                      }
                      var8 = stackIn_130_0;
                      break L37;
                    } else {
                      L39: {
                        if (-1 <= var13 - -var12) {
                          stackOut_125_0 = 0;
                          stackIn_126_0 = stackOut_125_0;
                          break L39;
                        } else {
                          stackOut_124_0 = 1;
                          stackIn_126_0 = stackOut_124_0;
                          break L39;
                        }
                      }
                      var8 = stackIn_126_0;
                      break L37;
                    }
                  }
                  L40: {
                    if (var8 != 0) {
                      stackOut_133_0 = 0;
                      stackIn_134_0 = stackOut_133_0;
                      break L40;
                    } else {
                      stackOut_132_0 = 1;
                      stackIn_134_0 = stackOut_132_0;
                      break L40;
                    }
                  }
                  var10 = stackIn_134_0;
                  if (-7 <= ((ro) this).field_o.field_m) {
                    break L36;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L41: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackOut_142_0 = en.field_K[var14];
                          stackIn_143_0 = stackOut_142_0;
                          break L41;
                        } else {
                          stackOut_141_0 = db.field_j[var14];
                          stackIn_143_0 = stackOut_141_0;
                          break L41;
                        }
                      }
                      var11 = stackIn_143_0;
                      break L36;
                    } else {
                      L42: {
                        if (0 <= var12 + -var13) {
                          stackOut_138_0 = ja.field_h[var14];
                          stackIn_139_0 = stackOut_138_0;
                          break L42;
                        } else {
                          stackOut_137_0 = tk.field_h[var14];
                          stackIn_139_0 = stackOut_137_0;
                          break L42;
                        }
                      }
                      var11 = stackIn_139_0;
                      break L36;
                    }
                  }
                } else {
                  break L36;
                }
              }
              L43: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L43;
                } else {
                  break L43;
                }
              }
              L44: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L44;
                } else {
                  break L44;
                }
              }
              L45: {
                L46: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L46;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L45;
              }
              L47: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L47;
                } else {
                  break L47;
                }
              }
              L48: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L48;
                } else {
                  break L48;
                }
              }
              return;
            }
          } else {
            L49: {
              if (((ro) this).field_p.field_m == -1) {
                var14 = 0;
                break L49;
              } else {
                var14 = -((ro) this).field_p.field_m + 12;
                break L49;
              }
            }
            if (-2 == ((ro) this).field_m) {
              L50: {
                if (-1 <= (-var13 + var12 ^ -1)) {
                  stackOut_69_0 = ja.field_h[var14];
                  stackIn_70_0 = stackOut_69_0;
                  break L50;
                } else {
                  stackOut_68_0 = tk.field_h[var14];
                  stackIn_70_0 = stackOut_68_0;
                  break L50;
                }
              }
              L51: {
                var11 = stackIn_70_0;
                if (var7 != 0) {
                  stackOut_72_0 = 0;
                  stackIn_73_0 = stackOut_72_0;
                  break L51;
                } else {
                  stackOut_71_0 = 1;
                  stackIn_73_0 = stackOut_71_0;
                  break L51;
                }
              }
              L52: {
                var9 = stackIn_73_0;
                if (null != ((ro) this).field_o) {
                  L53: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (-2 == ((ro) this).field_m) {
                      L54: {
                        if (-var12 + var13 <= -1) {
                          stackOut_82_0 = 0;
                          stackIn_83_0 = stackOut_82_0;
                          break L54;
                        } else {
                          stackOut_81_0 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          break L54;
                        }
                      }
                      var8 = stackIn_83_0;
                      break L53;
                    } else {
                      L55: {
                        if (-1 <= var13 - -var12) {
                          stackOut_78_0 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          break L55;
                        } else {
                          stackOut_77_0 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          break L55;
                        }
                      }
                      var8 = stackIn_79_0;
                      break L53;
                    }
                  }
                  L56: {
                    if (var8 != 0) {
                      stackOut_86_0 = 0;
                      stackIn_87_0 = stackOut_86_0;
                      break L56;
                    } else {
                      stackOut_85_0 = 1;
                      stackIn_87_0 = stackOut_85_0;
                      break L56;
                    }
                  }
                  var10 = stackIn_87_0;
                  if (-7 <= ((ro) this).field_o.field_m) {
                    break L52;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L57: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackOut_95_0 = en.field_K[var14];
                          stackIn_96_0 = stackOut_95_0;
                          break L57;
                        } else {
                          stackOut_94_0 = db.field_j[var14];
                          stackIn_96_0 = stackOut_94_0;
                          break L57;
                        }
                      }
                      var11 = stackIn_96_0;
                      break L52;
                    } else {
                      L58: {
                        if (0 <= var12 + -var13) {
                          stackOut_91_0 = ja.field_h[var14];
                          stackIn_92_0 = stackOut_91_0;
                          break L58;
                        } else {
                          stackOut_90_0 = tk.field_h[var14];
                          stackIn_92_0 = stackOut_90_0;
                          break L58;
                        }
                      }
                      var11 = stackIn_92_0;
                      break L52;
                    }
                  }
                } else {
                  break L52;
                }
              }
              L59: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                L62: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L62;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L61;
                    } else {
                      break L62;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L61;
              }
              L63: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L63;
                } else {
                  break L63;
                }
              }
              L64: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L64;
                } else {
                  break L64;
                }
              }
              return;
            } else {
              L65: {
                if (-1 > (var12 + var13 ^ -1)) {
                  stackOut_21_0 = db.field_j[var14];
                  stackIn_22_0 = stackOut_21_0;
                  break L65;
                } else {
                  stackOut_20_0 = en.field_K[var14];
                  stackIn_22_0 = stackOut_20_0;
                  break L65;
                }
              }
              L66: {
                var11 = stackIn_22_0;
                if (var7 != 0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L66;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L66;
                }
              }
              L67: {
                var9 = stackIn_25_0;
                if (null != ((ro) this).field_o) {
                  L68: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (-2 == ((ro) this).field_m) {
                      L69: {
                        if (-var12 + var13 <= -1) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L69;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L69;
                        }
                      }
                      var8 = stackIn_35_0;
                      break L68;
                    } else {
                      L70: {
                        if (-1 <= var13 - -var12) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L70;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          break L70;
                        }
                      }
                      var8 = stackIn_31_0;
                      break L68;
                    }
                  }
                  L71: {
                    if (var8 != 0) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L71;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L71;
                    }
                  }
                  var10 = stackIn_39_0;
                  if (-7 <= ((ro) this).field_o.field_m) {
                    break L67;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L72: {
                        if (-1 >= (var13 + var12 ^ -1)) {
                          stackOut_47_0 = en.field_K[var14];
                          stackIn_48_0 = stackOut_47_0;
                          break L72;
                        } else {
                          stackOut_46_0 = db.field_j[var14];
                          stackIn_48_0 = stackOut_46_0;
                          break L72;
                        }
                      }
                      var11 = stackIn_48_0;
                      break L67;
                    } else {
                      L73: {
                        if (0 <= var12 + -var13) {
                          stackOut_43_0 = ja.field_h[var14];
                          stackIn_44_0 = stackOut_43_0;
                          break L73;
                        } else {
                          stackOut_42_0 = tk.field_h[var14];
                          stackIn_44_0 = stackOut_42_0;
                          break L73;
                        }
                      }
                      var11 = stackIn_44_0;
                      break L67;
                    }
                  }
                } else {
                  break L67;
                }
              }
              L74: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L74;
                } else {
                  break L74;
                }
              }
              L75: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L75;
                } else {
                  break L75;
                }
              }
              L76: {
                L77: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L77;
                  } else {
                    if (-25 == (param2 ^ -1)) {
                      var11.a(param4, -param2 + param5);
                      break L76;
                    } else {
                      break L77;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L76;
              }
              L78: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L78;
                } else {
                  break L78;
                }
              }
              L79: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L79;
                } else {
                  break L79;
                }
              }
              return;
            }
          }
        } else {
          if (null != ((ro) this).field_o) {
            L80: {
              var12 = ((ro) this).field_o.field_G;
              var13 = ((ro) this).field_o.field_x;
              if (-2 == ((ro) this).field_m) {
                L81: {
                  if (-var12 + var13 <= -1) {
                    stackOut_296_0 = 0;
                    stackIn_297_0 = stackOut_296_0;
                    break L81;
                  } else {
                    stackOut_295_0 = 1;
                    stackIn_297_0 = stackOut_295_0;
                    break L81;
                  }
                }
                var8 = stackIn_297_0;
                break L80;
              } else {
                L82: {
                  if (-1 <= var13 - -var12) {
                    stackOut_292_0 = 0;
                    stackIn_293_0 = stackOut_292_0;
                    break L82;
                  } else {
                    stackOut_291_0 = 1;
                    stackIn_293_0 = stackOut_291_0;
                    break L82;
                  }
                }
                var8 = stackIn_293_0;
                break L80;
              }
            }
            L83: {
              if (var8 != 0) {
                stackOut_300_0 = 0;
                stackIn_301_0 = stackOut_300_0;
                break L83;
              } else {
                stackOut_299_0 = 1;
                stackIn_301_0 = stackOut_299_0;
                break L83;
              }
            }
            L84: {
              var10 = stackIn_301_0;
              if (-7 <= ((ro) this).field_o.field_m) {
                break L84;
              } else {
                var14 = ((ro) this).field_o.field_m;
                if (1 != ((ro) this).field_m) {
                  L85: {
                    if (-1 >= (var13 + var12 ^ -1)) {
                      stackOut_338_0 = en.field_K[var14];
                      stackIn_339_0 = stackOut_338_0;
                      break L85;
                    } else {
                      stackOut_337_0 = db.field_j[var14];
                      stackIn_339_0 = stackOut_337_0;
                      break L85;
                    }
                  }
                  var11 = stackIn_339_0;
                  break L84;
                } else {
                  L86: {
                    if (0 <= var12 + -var13) {
                      stackOut_305_0 = ja.field_h[var14];
                      stackIn_306_0 = stackOut_305_0;
                      break L86;
                    } else {
                      stackOut_304_0 = tk.field_h[var14];
                      stackIn_306_0 = stackOut_304_0;
                      break L86;
                    }
                  }
                  L87: {
                    var11 = stackIn_306_0;
                    if (var7 != 0) {
                      this.a(param3, param1, 2, param5, param2, param4);
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  L88: {
                    if (var8 != 0) {
                      this.a(param1, (byte) -64, param4, param5, param3, param2);
                      break L88;
                    } else {
                      break L88;
                    }
                  }
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 == 24) {
                    if (-25 != (param2 ^ -1)) {
                      L89: {
                        var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                      L90: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L90;
                        } else {
                          break L90;
                        }
                      }
                      return;
                    } else {
                      L91: {
                        var11.a(param4, -param2 + param5);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L91;
                        } else {
                          break L91;
                        }
                      }
                      L92: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L92;
                        } else {
                          break L92;
                        }
                      }
                      return;
                    }
                  } else {
                    L93: {
                      var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                      if (var9 != 0) {
                        this.a(param3, param1, 2, param5, param2, param4);
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      if (var10 != 0) {
                        this.a(param1, (byte) -125, param4, param5, param3, param2);
                        break L94;
                      } else {
                        break L94;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L95: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L96;
              } else {
                break L96;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 == 24) {
              if (-25 != (param2 ^ -1)) {
                L97: {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L97;
                  } else {
                    break L97;
                  }
                }
                L98: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L98;
                  } else {
                    break L98;
                  }
                }
                return;
              } else {
                L99: {
                  var11.a(param4, -param2 + param5);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L99;
                  } else {
                    break L99;
                  }
                }
                L100: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L100;
                  } else {
                    break L100;
                  }
                }
                return;
              }
            } else {
              L101: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L101;
                } else {
                  break L101;
                }
              }
              L102: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L102;
                } else {
                  break L102;
                }
              }
              return;
            }
          } else {
            L103: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L104;
              } else {
                break L104;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 != 24) {
              L105: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L105;
                } else {
                  break L105;
                }
              }
              L106: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L106;
                } else {
                  break L106;
                }
              }
              return;
            } else {
              L107: {
                if (-25 == (param2 ^ -1)) {
                  var11.a(param4, -param2 + param5);
                  break L107;
                } else {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L107;
                }
              }
              L108: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L108;
                } else {
                  break L108;
                }
              }
              L109: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L109;
                } else {
                  break L109;
                }
              }
              return;
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          ((ro) this).a(-44, -106, 68, (f[][]) null, 106, 20, 110, -87);
          return ng.a(sn.field_b, param1, (f) (Object) new ro(((ro) this).field_m, (f) (Object) new kp(-1)), (byte) -83, qk.field_z);
        } else {
          return ng.a(sn.field_b, param1, (f) (Object) new ro(((ro) this).field_m, (f) (Object) new kp(-1)), (byte) -83, qk.field_z);
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            field_u = null;
            return (f) this;
        }
        return (f) this;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 <= 92) {
            f discarded$0 = ((ro) this).a(-61, (byte) -122, 116);
        }
    }

    final int a(boolean param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_u = null;
            if ((((ro) this).field_m ^ -1) == -2) {
              stackOut_7_0 = 8;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 4;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if ((((ro) this).field_m ^ -1) == -2) {
              stackOut_3_0 = 8;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 4;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        var10 = jf.a(kh.field_j, param5, param2 + -2, param5 - -(param1 * 2), kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = param2 * ((-((ro) this).field_p.field_p + ((ro) this).field_p.field_m) * param1) / ((ro) this).field_p.field_p;
          var9 = param4 * ((-((ro) this).field_p.field_p + ((ro) this).field_p.field_m) * 2) / ((ro) this).field_p.field_p;
          ((ro) this).field_p.a(param0, ((ro) this).field_p.field_o * var8 + param5, param1, param4, param3 + var9 * ((ro) this).field_p.field_s, param2 + 4259);
          var10.a((byte) -16);
          return;
        }
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_r = null;
        if (param0 != 4) {
            return;
        }
        field_s = null;
        field_u = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            return true;
        }
        return param2;
    }

    ro(int param0, f param1) {
        super(param1);
        ((ro) this).field_p = null;
        ((ro) this).field_o = null;
        ((ro) this).field_m = param0;
    }

    final static boolean a(db param0, db param1, boolean param2, db param3) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (!param2) {
          if (param0.a((byte) 102)) {
            if (param0.a(-20402, "commonui")) {
              if (param1.a((byte) 102)) {
                if (!param1.a(-20402, "commonui")) {
                  return false;
                } else {
                  L0: {
                    L1: {
                      if (!param3.a((byte) 102)) {
                        break L1;
                      } else {
                        if (!param3.a(-20402, "button.gif")) {
                          break L1;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L0;
                        }
                      }
                    }
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L0;
                  }
                  return stackIn_14_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "These are members-only levels.";
        field_r = new String[]{"Easy", "Peasy", "Three Rooms", "An Electric Ball", "Get the Key", "Spider Box", "Bounce Around", "Bomb in the Hole", "Push the Rock", "Hammerhead", "Fiddle Dig", "Mining Disturbance", "Shuffle to Defuse", "Hole Hider", "Variety", "Boom Averted", "A Bit Handy", "Double Shuffles", "Bottom-Heavy", "Critical Mass", "Beyond the Bomb", "Precision", "Bottomless", "Air Raid Bunker", "Twang", "Mirror Fiddle", "Lurid", "Where is the Key?", "Ooh Look, Leaves", "Low Exit", "Star Feet", "Support! Timing!", "Rock Block", "Don't Rush", "Box Box Box", "One-Way", "Smoothly Does It", "Pink Suits You Sir!", "Piercing", "Elimination", "Mystifying", "Crossroads", "Falling Sky", "Balancing Act", "Demolition", "Laser Maze", "Controller", "Safe Madness", "Puzzle Rooms", "Ball Race", "Drop Nothing", "Psychedelic", "Funnel", "Cascade", "Rook", "Bomb Block Rock", "Magic Pervades", "Quick, Kill Them!", "Where to?", "Hot Feet", "Rather Hard", "Turbo Controller", "Funner Funnel", "Unexplainable", "Juggle Maze", "Fearsome", "Filter Effect", "It's a Goblin!", "It's Hostile!", "Grand Finale"};
        field_s = "achievements to collect";
    }
}
