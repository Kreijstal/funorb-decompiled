/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends nv implements ut {
    private boolean field_s;
    private boolean field_r;
    private int field_u;
    private int field_v;
    private int field_p;
    private int field_o;
    private boolean field_t;
    private boolean field_q;
    private jma field_n;

    public final int j(byte param0) {
        if (param0 != -108) {
            return 74;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        param0 = ((kj) this).field_n.a(121, param0);
        if (param1 > -48) {
            return 47;
        }
        return param0;
    }

    private final boolean r(int param0) {
        int var2 = ((kj) this).m((byte) 19).g(-25787);
        int var3 = ua.a(var2 - (4096 + ((kj) this).field_v), -120);
        var3 = dfa.a(var3, param0, 109);
        if (!(4096 >= var3)) {
            var3 = 8192 - var3;
        }
        return ((kj) this).field_u / 2 >= var3 ? true : false;
    }

    final void a(boolean param0, fsa param1) {
        super.a(param0, param1);
    }

    private final boolean l(int param0) {
        int var2 = ((kj) this).field_g.g(-25787);
        int var3 = ua.a(var2 + -((kj) this).field_v, -113);
        var3 = dfa.a(var3, param0, param0 ^ -8300);
        if (-4097 > (var3 ^ -1)) {
            var3 = -var3 + 8192;
        }
        return ((kj) this).field_o / 2 >= var3 ? true : false;
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            int discarded$0 = ((kj) this).g((byte) -25);
            return 7798954;
        }
        return 7798954;
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((kj) this).a(-15, 107);
            return 22;
        }
        return 22;
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            return 6;
        }
        return 4456550;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            ((kj) this).field_v = 68;
            return ((kj) this).field_n;
        }
        return ((kj) this).field_n;
    }

    private final boolean e(boolean param0) {
        int var2 = 0;
        hca var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = ((kj) this).field_p >> 1957873616;
        var2 = var2 * var2;
        var3 = ((kj) this).m((byte) 19);
        if (param0) {
          L0: {
            ((kj) this).field_s = false;
            var4 = ((kj) this).field_g.d(3) - var3.d(3) >> -893881776;
            var5 = ((kj) this).field_g.e(9648) + -var3.e(9648) >> -1477182736;
            var6 = var4 * var4 - -(var5 * var5);
            if (var6 >= var2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            var4 = ((kj) this).field_g.d(3) - var3.d(3) >> -893881776;
            var5 = ((kj) this).field_g.e(9648) + -var3.e(9648) >> -1477182736;
            var6 = var4 * var4 - -(var5 * var5);
            if (var6 >= var2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    kj(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((kj) this).field_s = (param1.b((byte) 44, 1) ^ -1) != -2 ? false : true;
        if (((kj) this).field_s) {
            ((kj) this).field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
        }
        ((kj) this).field_r = -2 != (param1.b((byte) 44, 1) ^ -1) ? false : true;
        if (((kj) this).field_r) {
            ((kj) this).field_o = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
        }
        ((kj) this).field_q = 1 == param1.b((byte) 44, 1) ? true : false;
        if (((kj) this).field_q) {
            ((kj) this).field_p = param1.b((byte) 44, 10) << -997912112;
        }
        ((kj) this).field_t = -2 != (param1.b((byte) 44, 1) ^ -1) ? false : true;
        ((kj) this).field_n = new jma(15, param0, param1);
    }

    final void g(int param0) {
        super.g(param0);
        ((kj) this).field_n.a((byte) 48, ((kj) this).h((byte) 127));
    }

    final void k(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        hca var6 = null;
        hca var7 = null;
        hca var8 = null;
        hca var9 = null;
        hca var10 = null;
        hca var11 = null;
        hca var12 = null;
        hca var13 = null;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_230_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_153_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        var2 = 1;
        if (param0 != 5418) {
          L0: {
            ((kj) this).field_q = false;
            if (var2 == 0) {
              break L0;
            } else {
              if (((kj) this).field_t) {
                L1: {
                  if (!this.d(false)) {
                    stackOut_125_0 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    break L1;
                  } else {
                    stackOut_124_0 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    break L1;
                  }
                }
                var2 = stackIn_126_0;
                break L0;
              } else {
                L2: {
                  if (((kj) this).field_s) {
                    var10 = ((kj) this).m((byte) 19);
                    var4 = var10.d(3) + -((kj) this).field_g.d(3);
                    var5 = var10.e(9648) - ((kj) this).field_g.e(9648);
                    ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                    break L2;
                  } else {
                    if (!((kj) this).field_r) {
                      break L2;
                    } else {
                      var11 = ((kj) this).m((byte) 19);
                      var4 = var11.d(3) + -((kj) this).field_g.d(3);
                      var5 = var11.e(9648) - ((kj) this).field_g.e(9648);
                      ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (!((kj) this).field_s) {
                      break L3;
                    } else {
                      L4: {
                        if (!this.r(8192)) {
                          stackOut_103_0 = 0;
                          stackIn_104_0 = stackOut_103_0;
                          break L4;
                        } else {
                          stackOut_102_0 = 1;
                          stackIn_104_0 = stackOut_102_0;
                          break L4;
                        }
                      }
                      var2 = stackIn_104_0;
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var2 == 0) {
                    break L5;
                  } else {
                    if (((kj) this).field_r) {
                      L6: {
                        if (!this.l(8192)) {
                          stackOut_110_0 = 0;
                          stackIn_111_0 = stackOut_110_0;
                          break L6;
                        } else {
                          stackOut_109_0 = 1;
                          stackIn_111_0 = stackOut_109_0;
                          break L6;
                        }
                      }
                      var2 = stackIn_111_0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (var2 == 0) {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    break L7;
                  } else {
                    if (!((kj) this).field_q) {
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      break L7;
                    } else {
                      L8: {
                        if (!this.e(false)) {
                          stackOut_116_0 = 0;
                          stackIn_117_0 = stackOut_116_0;
                          break L8;
                        } else {
                          stackOut_115_0 = 1;
                          stackIn_117_0 = stackOut_115_0;
                          break L8;
                        }
                      }
                      var2 = stackIn_117_0;
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      break L7;
                    }
                  }
                }
                return;
              }
            }
          }
          if (var2 != 0) {
            if (((kj) this).field_s) {
              L9: {
                var13 = ((kj) this).m((byte) 19);
                var4 = var13.d(3) + -((kj) this).field_g.d(3);
                var5 = var13.e(9648) - ((kj) this).field_g.e(9648);
                ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                if (var2 == 0) {
                  break L9;
                } else {
                  if (!((kj) this).field_s) {
                    break L9;
                  } else {
                    L10: {
                      if (!this.r(8192)) {
                        stackOut_217_0 = 0;
                        stackIn_218_0 = stackOut_217_0;
                        break L10;
                      } else {
                        stackOut_216_0 = 1;
                        stackIn_218_0 = stackOut_216_0;
                        break L10;
                      }
                    }
                    var2 = stackIn_218_0;
                    break L9;
                  }
                }
              }
              L11: {
                if (var2 == 0) {
                  break L11;
                } else {
                  if (((kj) this).field_r) {
                    L12: {
                      if (!this.l(8192)) {
                        stackOut_231_0 = 0;
                        stackIn_232_0 = stackOut_231_0;
                        break L12;
                      } else {
                        stackOut_230_0 = 1;
                        stackIn_232_0 = stackOut_230_0;
                        break L12;
                      }
                    }
                    var2 = stackIn_232_0;
                    break L11;
                  } else {
                    if (((kj) this).field_q) {
                      L13: {
                        if (!this.e(false)) {
                          stackOut_225_0 = 0;
                          stackIn_226_0 = stackOut_225_0;
                          break L13;
                        } else {
                          stackOut_224_0 = 1;
                          stackIn_226_0 = stackOut_224_0;
                          break L13;
                        }
                      }
                      var2 = stackIn_226_0;
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      return;
                    } else {
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      return;
                    }
                  }
                }
              }
              if (var2 != 0) {
                if (((kj) this).field_q) {
                  L14: {
                    if (!this.e(false)) {
                      stackOut_239_0 = 0;
                      stackIn_240_0 = stackOut_239_0;
                      break L14;
                    } else {
                      stackOut_238_0 = 1;
                      stackIn_240_0 = stackOut_238_0;
                      break L14;
                    }
                  }
                  var2 = stackIn_240_0;
                  ((kj) this).field_n.a((byte) -14, var2 != 0);
                  return;
                } else {
                  ((kj) this).field_n.a((byte) -14, var2 != 0);
                  return;
                }
              } else {
                ((kj) this).field_n.a((byte) -14, var2 != 0);
                return;
              }
            } else {
              if (((kj) this).field_r) {
                L15: {
                  var12 = ((kj) this).m((byte) 19);
                  var4 = var12.d(3) + -((kj) this).field_g.d(3);
                  var5 = var12.e(9648) - ((kj) this).field_g.e(9648);
                  ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                  if (var2 == 0) {
                    break L15;
                  } else {
                    if (!((kj) this).field_s) {
                      break L15;
                    } else {
                      L16: {
                        if (!this.r(8192)) {
                          stackOut_194_0 = 0;
                          stackIn_195_0 = stackOut_194_0;
                          break L16;
                        } else {
                          stackOut_193_0 = 1;
                          stackIn_195_0 = stackOut_193_0;
                          break L16;
                        }
                      }
                      var2 = stackIn_195_0;
                      break L15;
                    }
                  }
                }
                L17: {
                  if (var2 == 0) {
                    break L17;
                  } else {
                    if (((kj) this).field_r) {
                      L18: {
                        if (!this.l(8192)) {
                          stackOut_201_0 = 0;
                          stackIn_202_0 = stackOut_201_0;
                          break L18;
                        } else {
                          stackOut_200_0 = 1;
                          stackIn_202_0 = stackOut_200_0;
                          break L18;
                        }
                      }
                      var2 = stackIn_202_0;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                if (var2 != 0) {
                  if (((kj) this).field_q) {
                    L19: {
                      if (!this.e(false)) {
                        stackOut_209_0 = 0;
                        stackIn_210_0 = stackOut_209_0;
                        break L19;
                      } else {
                        stackOut_208_0 = 1;
                        stackIn_210_0 = stackOut_208_0;
                        break L19;
                      }
                    }
                    var2 = stackIn_210_0;
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                } else {
                  ((kj) this).field_n.a((byte) -14, var2 != 0);
                  return;
                }
              } else {
                L20: {
                  if (var2 == 0) {
                    break L20;
                  } else {
                    if (!((kj) this).field_s) {
                      break L20;
                    } else {
                      L21: {
                        if (!this.r(8192)) {
                          stackOut_164_0 = 0;
                          stackIn_165_0 = stackOut_164_0;
                          break L21;
                        } else {
                          stackOut_163_0 = 1;
                          stackIn_165_0 = stackOut_163_0;
                          break L21;
                        }
                      }
                      var2 = stackIn_165_0;
                      break L20;
                    }
                  }
                }
                L22: {
                  if (var2 == 0) {
                    break L22;
                  } else {
                    if (((kj) this).field_r) {
                      L23: {
                        if (!this.l(8192)) {
                          stackOut_178_0 = 0;
                          stackIn_179_0 = stackOut_178_0;
                          break L23;
                        } else {
                          stackOut_177_0 = 1;
                          stackIn_179_0 = stackOut_177_0;
                          break L23;
                        }
                      }
                      var2 = stackIn_179_0;
                      break L22;
                    } else {
                      if (((kj) this).field_q) {
                        L24: {
                          if (!this.e(false)) {
                            stackOut_172_0 = 0;
                            stackIn_173_0 = stackOut_172_0;
                            break L24;
                          } else {
                            stackOut_171_0 = 1;
                            stackIn_173_0 = stackOut_171_0;
                            break L24;
                          }
                        }
                        var2 = stackIn_173_0;
                        ((kj) this).field_n.a((byte) -14, var2 != 0);
                        return;
                      } else {
                        ((kj) this).field_n.a((byte) -14, var2 != 0);
                        return;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  if (((kj) this).field_q) {
                    L25: {
                      if (!this.e(false)) {
                        stackOut_186_0 = 0;
                        stackIn_187_0 = stackOut_186_0;
                        break L25;
                      } else {
                        stackOut_185_0 = 1;
                        stackIn_187_0 = stackOut_185_0;
                        break L25;
                      }
                    }
                    var2 = stackIn_187_0;
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                } else {
                  ((kj) this).field_n.a((byte) -14, var2 != 0);
                  return;
                }
              }
            }
          } else {
            L26: {
              if (var2 == 0) {
                break L26;
              } else {
                if (!((kj) this).field_s) {
                  break L26;
                } else {
                  L27: {
                    if (!this.r(8192)) {
                      stackOut_132_0 = 0;
                      stackIn_133_0 = stackOut_132_0;
                      break L27;
                    } else {
                      stackOut_131_0 = 1;
                      stackIn_133_0 = stackOut_131_0;
                      break L27;
                    }
                  }
                  var2 = stackIn_133_0;
                  break L26;
                }
              }
            }
            L28: {
              if (var2 == 0) {
                break L28;
              } else {
                if (((kj) this).field_r) {
                  L29: {
                    if (!this.l(8192)) {
                      stackOut_146_0 = 0;
                      stackIn_147_0 = stackOut_146_0;
                      break L29;
                    } else {
                      stackOut_145_0 = 1;
                      stackIn_147_0 = stackOut_145_0;
                      break L29;
                    }
                  }
                  var2 = stackIn_147_0;
                  break L28;
                } else {
                  if (((kj) this).field_q) {
                    L30: {
                      if (!this.e(false)) {
                        stackOut_140_0 = 0;
                        stackIn_141_0 = stackOut_140_0;
                        break L30;
                      } else {
                        stackOut_139_0 = 1;
                        stackIn_141_0 = stackOut_139_0;
                        break L30;
                      }
                    }
                    var2 = stackIn_141_0;
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  } else {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    return;
                  }
                }
              }
            }
            if (var2 != 0) {
              if (((kj) this).field_q) {
                L31: {
                  if (!this.e(false)) {
                    stackOut_154_0 = 0;
                    stackIn_155_0 = stackOut_154_0;
                    break L31;
                  } else {
                    stackOut_153_0 = 1;
                    stackIn_155_0 = stackOut_153_0;
                    break L31;
                  }
                }
                var2 = stackIn_155_0;
                ((kj) this).field_n.a((byte) -14, var2 != 0);
                return;
              } else {
                ((kj) this).field_n.a((byte) -14, var2 != 0);
                return;
              }
            } else {
              ((kj) this).field_n.a((byte) -14, var2 != 0);
              return;
            }
          }
        } else {
          L32: {
            if (var2 == 0) {
              break L32;
            } else {
              if (((kj) this).field_t) {
                L33: {
                  if (!this.d(false)) {
                    stackOut_33_0 = 0;
                    stackIn_34_0 = stackOut_33_0;
                    break L33;
                  } else {
                    stackOut_32_0 = 1;
                    stackIn_34_0 = stackOut_32_0;
                    break L33;
                  }
                }
                var2 = stackIn_34_0;
                break L32;
              } else {
                L34: {
                  if (((kj) this).field_s) {
                    var6 = ((kj) this).m((byte) 19);
                    var4 = var6.d(3) + -((kj) this).field_g.d(3);
                    var5 = var6.e(9648) - ((kj) this).field_g.e(9648);
                    ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                    break L34;
                  } else {
                    if (!((kj) this).field_r) {
                      break L34;
                    } else {
                      var7 = ((kj) this).m((byte) 19);
                      var4 = var7.d(3) + -((kj) this).field_g.d(3);
                      var5 = var7.e(9648) - ((kj) this).field_g.e(9648);
                      ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                      break L34;
                    }
                  }
                }
                L35: {
                  if (var2 == 0) {
                    break L35;
                  } else {
                    if (!((kj) this).field_s) {
                      break L35;
                    } else {
                      L36: {
                        if (!this.r(8192)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L36;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          break L36;
                        }
                      }
                      var2 = stackIn_13_0;
                      break L35;
                    }
                  }
                }
                L37: {
                  if (var2 == 0) {
                    break L37;
                  } else {
                    if (((kj) this).field_r) {
                      L38: {
                        if (!this.l(8192)) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L38;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L38;
                        }
                      }
                      var2 = stackIn_20_0;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
                L39: {
                  if (var2 == 0) {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    break L39;
                  } else {
                    if (!((kj) this).field_q) {
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      break L39;
                    } else {
                      L40: {
                        if (!this.e(false)) {
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          break L40;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_26_0 = stackOut_24_0;
                          break L40;
                        }
                      }
                      var2 = stackIn_26_0;
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      break L39;
                    }
                  }
                }
                return;
              }
            }
          }
          L41: {
            if (var2 == 0) {
              break L41;
            } else {
              if (((kj) this).field_s) {
                var9 = ((kj) this).m((byte) 19);
                var4 = var9.d(3) + -((kj) this).field_g.d(3);
                var5 = var9.e(9648) - ((kj) this).field_g.e(9648);
                ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                break L41;
              } else {
                if (!((kj) this).field_r) {
                  break L41;
                } else {
                  L42: {
                    var8 = ((kj) this).m((byte) 19);
                    var4 = var8.d(3) + -((kj) this).field_g.d(3);
                    var5 = var8.e(9648) - ((kj) this).field_g.e(9648);
                    ((kj) this).field_v = qva.a((byte) -94, var5, var4);
                    if (!((kj) this).field_s) {
                      break L42;
                    } else {
                      L43: {
                        if (!this.r(8192)) {
                          stackOut_41_0 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          break L43;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L43;
                        }
                      }
                      var2 = stackIn_42_0;
                      break L42;
                    }
                  }
                  L44: {
                    if (var2 == 0) {
                      break L44;
                    } else {
                      if (((kj) this).field_r) {
                        L45: {
                          if (!this.l(8192)) {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            break L45;
                          } else {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L45;
                          }
                        }
                        var2 = stackIn_49_0;
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L46: {
                    if (var2 == 0) {
                      ((kj) this).field_n.a((byte) -14, var2 != 0);
                      break L46;
                    } else {
                      if (!((kj) this).field_q) {
                        ((kj) this).field_n.a((byte) -14, var2 != 0);
                        break L46;
                      } else {
                        L47: {
                          if (!this.e(false)) {
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            break L47;
                          } else {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            break L47;
                          }
                        }
                        var2 = stackIn_55_0;
                        ((kj) this).field_n.a((byte) -14, var2 != 0);
                        break L46;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L48: {
            if (var2 == 0) {
              break L48;
            } else {
              if (!((kj) this).field_s) {
                break L48;
              } else {
                L49: {
                  if (!this.r(8192)) {
                    stackOut_65_0 = 0;
                    stackIn_66_0 = stackOut_65_0;
                    break L49;
                  } else {
                    stackOut_64_0 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    break L49;
                  }
                }
                var2 = stackIn_66_0;
                break L48;
              }
            }
          }
          L50: {
            if (var2 == 0) {
              break L50;
            } else {
              if (((kj) this).field_r) {
                L51: {
                  if (!this.l(8192)) {
                    stackOut_80_0 = 0;
                    stackIn_81_0 = stackOut_80_0;
                    break L51;
                  } else {
                    stackOut_79_0 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    break L51;
                  }
                }
                var2 = stackIn_81_0;
                break L50;
              } else {
                L52: {
                  if (!((kj) this).field_q) {
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    break L52;
                  } else {
                    L53: {
                      if (!this.e(false)) {
                        stackOut_72_0 = 0;
                        stackIn_73_0 = stackOut_72_0;
                        break L53;
                      } else {
                        stackOut_71_0 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        break L53;
                      }
                    }
                    var2 = stackIn_73_0;
                    ((kj) this).field_n.a((byte) -14, var2 != 0);
                    break L52;
                  }
                }
                return;
              }
            }
          }
          if (var2 != 0) {
            if (((kj) this).field_q) {
              L54: {
                if (!this.e(false)) {
                  stackOut_88_0 = 0;
                  stackIn_89_0 = stackOut_88_0;
                  break L54;
                } else {
                  stackOut_87_0 = 1;
                  stackIn_89_0 = stackOut_87_0;
                  break L54;
                }
              }
              var2 = stackIn_89_0;
              ((kj) this).field_n.a((byte) -14, var2 != 0);
              return;
            } else {
              ((kj) this).field_n.a((byte) -14, var2 != 0);
              return;
            }
          } else {
            ((kj) this).field_n.a((byte) -14, var2 != 0);
            return;
          }
        }
    }

    public final int b(int param0) {
        int var2 = -67 / ((-46 - param0) / 45);
        return 0;
    }

    final void a(boolean param0, kh param1) {
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        kh stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        kh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        kh stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        kh stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        kh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        kh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        kh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        kh stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        kh stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        kh stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        kh stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        kh stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        kh stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        kh stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        kh stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        kh stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        kh stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        kh stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        kh stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        kh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        kh stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        kh stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        kh stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        kh stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        kh stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        kh stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        kh stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        kh stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        kh stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        kh stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        kh stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        kh stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        kh stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        kh stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        kh stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        kh stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        kh stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        kh stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        kh stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        kh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        kh stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        kh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        kh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        kh stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        kh stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        kh stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        kh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        kh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        kh stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        kh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        kh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          super.a(param0, param1);
          stackOut_0_0 = (kh) param1;
          stackOut_0_1 = -126;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (!((kj) this).field_s) {
            stackOut_2_0 = (kh) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (kh) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
        if (!((kj) this).field_s) {
          L1: {
            stackOut_29_0 = (kh) param1;
            stackOut_29_1 = 5;
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (((kj) this).field_r) {
              stackOut_31_0 = (kh) (Object) stackIn_31_0;
              stackOut_31_1 = stackIn_31_1;
              stackOut_31_2 = 1;
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L1;
            } else {
              stackOut_30_0 = (kh) (Object) stackIn_30_0;
              stackOut_30_1 = stackIn_30_1;
              stackOut_30_2 = 0;
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L1;
            }
          }
          ((kh) (Object) stackIn_32_0).a((byte) stackIn_32_1, stackIn_32_2, 1);
          if (((kj) this).field_r) {
            L2: {
              param1.a((byte) -125, cn.a((byte) 111, ((kj) this).field_o, 8192, 8), 8);
              stackOut_43_0 = (kh) param1;
              stackOut_43_1 = -127;
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              if (((kj) this).field_q) {
                stackOut_45_0 = (kh) (Object) stackIn_45_0;
                stackOut_45_1 = stackIn_45_1;
                stackOut_45_2 = 1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                stackIn_46_2 = stackOut_45_2;
                break L2;
              } else {
                stackOut_44_0 = (kh) (Object) stackIn_44_0;
                stackOut_44_1 = stackIn_44_1;
                stackOut_44_2 = 0;
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_46_2 = stackOut_44_2;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_46_0).a((byte) stackIn_46_1, stackIn_46_2, 1);
              if (((kj) this).field_q) {
                param1.a((byte) -125, ((kj) this).field_p >> 473274736, 10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              stackOut_49_0 = (kh) param1;
              stackOut_49_1 = -127;
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              if (!((kj) this).field_t) {
                stackOut_51_0 = (kh) (Object) stackIn_51_0;
                stackOut_51_1 = stackIn_51_1;
                stackOut_51_2 = 0;
                stackIn_52_0 = stackOut_51_0;
                stackIn_52_1 = stackOut_51_1;
                stackIn_52_2 = stackOut_51_2;
                break L4;
              } else {
                stackOut_50_0 = (kh) (Object) stackIn_50_0;
                stackOut_50_1 = stackIn_50_1;
                stackOut_50_2 = 1;
                stackIn_52_0 = stackOut_50_0;
                stackIn_52_1 = stackOut_50_1;
                stackIn_52_2 = stackOut_50_2;
                break L4;
              }
            }
            ((kh) (Object) stackIn_52_0).a((byte) stackIn_52_1, stackIn_52_2, 1);
            ((kj) this).field_n.a(((kj) this).h((byte) 111), (byte) 85, param1);
            return;
          } else {
            L5: {
              stackOut_33_0 = (kh) param1;
              stackOut_33_1 = -127;
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              if (((kj) this).field_q) {
                stackOut_35_0 = (kh) (Object) stackIn_35_0;
                stackOut_35_1 = stackIn_35_1;
                stackOut_35_2 = 1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                stackIn_36_2 = stackOut_35_2;
                break L5;
              } else {
                stackOut_34_0 = (kh) (Object) stackIn_34_0;
                stackOut_34_1 = stackIn_34_1;
                stackOut_34_2 = 0;
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_36_2 = stackOut_34_2;
                break L5;
              }
            }
            L6: {
              ((kh) (Object) stackIn_36_0).a((byte) stackIn_36_1, stackIn_36_2, 1);
              if (((kj) this).field_q) {
                param1.a((byte) -125, ((kj) this).field_p >> 473274736, 10);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              stackOut_39_0 = (kh) param1;
              stackOut_39_1 = -127;
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              if (!((kj) this).field_t) {
                stackOut_41_0 = (kh) (Object) stackIn_41_0;
                stackOut_41_1 = stackIn_41_1;
                stackOut_41_2 = 0;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                stackIn_42_2 = stackOut_41_2;
                break L7;
              } else {
                stackOut_40_0 = (kh) (Object) stackIn_40_0;
                stackOut_40_1 = stackIn_40_1;
                stackOut_40_2 = 1;
                stackIn_42_0 = stackOut_40_0;
                stackIn_42_1 = stackOut_40_1;
                stackIn_42_2 = stackOut_40_2;
                break L7;
              }
            }
            ((kh) (Object) stackIn_42_0).a((byte) stackIn_42_1, stackIn_42_2, 1);
            ((kj) this).field_n.a(((kj) this).h((byte) 111), (byte) 85, param1);
            return;
          }
        } else {
          L8: {
            param1.a((byte) -126, cn.a((byte) -120, ((kj) this).field_u, 8192, 8), 8);
            stackOut_4_0 = (kh) param1;
            stackOut_4_1 = 5;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (((kj) this).field_r) {
              stackOut_6_0 = (kh) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L8;
            } else {
              stackOut_5_0 = (kh) (Object) stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = 0;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L8;
            }
          }
          ((kh) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, 1);
          if (!((kj) this).field_r) {
            L9: {
              stackOut_18_0 = (kh) param1;
              stackOut_18_1 = -127;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              if (((kj) this).field_q) {
                stackOut_20_0 = (kh) (Object) stackIn_20_0;
                stackOut_20_1 = stackIn_20_1;
                stackOut_20_2 = 1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                break L9;
              } else {
                stackOut_19_0 = (kh) (Object) stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackOut_19_2 = 0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_21_2 = stackOut_19_2;
                break L9;
              }
            }
            L10: {
              ((kh) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2, 1);
              if (((kj) this).field_q) {
                param1.a((byte) -125, ((kj) this).field_p >> 473274736, 10);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_24_0 = (kh) param1;
              stackOut_24_1 = -127;
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              if (!((kj) this).field_t) {
                stackOut_26_0 = (kh) (Object) stackIn_26_0;
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = 0;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                stackIn_27_2 = stackOut_26_2;
                break L11;
              } else {
                stackOut_25_0 = (kh) (Object) stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = 1;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                break L11;
              }
            }
            ((kh) (Object) stackIn_27_0).a((byte) stackIn_27_1, stackIn_27_2, 1);
            ((kj) this).field_n.a(((kj) this).h((byte) 111), (byte) 85, param1);
            return;
          } else {
            L12: {
              param1.a((byte) -125, cn.a((byte) 111, ((kj) this).field_o, 8192, 8), 8);
              stackOut_8_0 = (kh) param1;
              stackOut_8_1 = -127;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              if (((kj) this).field_q) {
                stackOut_10_0 = (kh) (Object) stackIn_10_0;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                break L12;
              } else {
                stackOut_9_0 = (kh) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 0;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                break L12;
              }
            }
            L13: {
              ((kh) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2, 1);
              if (((kj) this).field_q) {
                param1.a((byte) -125, ((kj) this).field_p >> 473274736, 10);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              stackOut_14_0 = (kh) param1;
              stackOut_14_1 = -127;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (!((kj) this).field_t) {
                stackOut_16_0 = (kh) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L14;
              } else {
                stackOut_15_0 = (kh) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L14;
              }
            }
            ((kh) (Object) stackIn_17_0).a((byte) stackIn_17_1, stackIn_17_2, 1);
            ((kj) this).field_n.a(((kj) this).h((byte) 111), (byte) 85, param1);
            return;
          }
        }
    }

    private final boolean d(boolean param0) {
        if (param0) {
            return false;
        }
        return ((kj) this).m((byte) 19).p((byte) -110);
    }

    static {
    }
}
