/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends lh {
    int[] field_o;
    int field_k;
    static sf field_l;
    static ia field_x;
    int field_v;
    od[] field_s;
    int[] field_r;
    static vc field_t;
    static ce field_q;
    int[] field_p;
    static ce field_i;
    static dd field_j;
    static int[] field_u;
    byte[][][] field_w;
    od[] field_n;
    static String field_m;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_82_0 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            pl.field_f = 0;
            var1_int = 61 % ((param0 - -43) / 47);
            qh.field_z = 0;
            qi.field_f = 0;
            kb.field_i = 0;
            pa.field_o = 0;
            gh.field_q = 0;
            jc.field_f = 0;
            md.field_L = 1;
            pl.field_g = 0;
            db.field_H = 0;
            ue.field_d = 4;
            we.field_c = 0;
            oe.field_a = 0;
            var2 = 0;
            L1: while (true) {
              stackOut_2_0 = -41;
              stackOut_2_1 = var2 ^ -1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 >= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_83_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        var3 = stackIn_5_0;
                        L5: while (true) {
                          stackOut_6_0 = var3;
                          stackIn_7_0 = stackOut_6_0;
                          L6: while (true) {
                            L7: {
                              if (stackIn_7_0 >= 21) {
                                break L7;
                              } else {
                                var4 = fl.field_c[var2][var3];
                                stackOut_8_0 = var4;
                                stackOut_8_1 = 15;
                                stackIn_3_0 = stackOut_8_0;
                                stackIn_3_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var8 != 0) {
                                  continue L2;
                                } else {
                                  L8: {
                                    if (stackIn_9_0 != stackIn_9_1) {
                                      break L8;
                                    } else {
                                      fl.field_c[var2][var3 - -2] = (char)7;
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (1 != var4) {
                                      break L9;
                                    } else {
                                      rk.field_s = 8 + 16 * var2;
                                      ck.field_o = 16 + var3 * 16;
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (8 == var4) {
                                      gk.a(var3, 125, 9, var2, 8);
                                      ok.field_s[-1 + oe.field_a] = 1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    L12: {
                                      if (13 == var4) {
                                        break L12;
                                      } else {
                                        if (var4 == 27) {
                                          break L12;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    gk.a(var3, 124, 27, var2, 13);
                                    break L11;
                                  }
                                  L13: {
                                    L14: {
                                      if (var4 == 12) {
                                        break L14;
                                      } else {
                                        if (var4 != 32) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    gk.a(var3, 127, 32, var2, 12);
                                    break L13;
                                  }
                                  L15: {
                                    L16: {
                                      if (var4 == 14) {
                                        break L16;
                                      } else {
                                        if (var4 == 28) {
                                          break L16;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    gk.a(var3, 126, 28, var2, 14);
                                    rk.field_u[qi.field_f] = var2;
                                    kk.field_a[qi.field_f] = var3;
                                    me.field_i[qi.field_f] = 0;
                                    qi.field_f = qi.field_f + 1;
                                    break L15;
                                  }
                                  L17: {
                                    L18: {
                                      if (16 == var4) {
                                        break L18;
                                      } else {
                                        if (var4 == 29) {
                                          break L18;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    L19: {
                                      L20: {
                                        if (jc.field_f != 0) {
                                          break L20;
                                        } else {
                                          jc.field_f = 1;
                                          pc.field_b = var2;
                                          lb.field_m = var3;
                                          if (var8 == 0) {
                                            break L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      hf.field_b = var3;
                                      tg.field_d = var2;
                                      jc.field_f = 2;
                                      break L19;
                                    }
                                    gk.a(var3, 127, 29, var2, 16);
                                    break L17;
                                  }
                                  L21: {
                                    L22: {
                                      if (var4 == 17) {
                                        break L22;
                                      } else {
                                        if (var4 == 31) {
                                          break L22;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    gk.a(var3, 126, 31, var2, 17);
                                    break L21;
                                  }
                                  var5 = fl.field_c[var2][var3];
                                  var6 = 0;
                                  L23: while (true) {
                                    stackOut_41_0 = var6;
                                    stackOut_41_1 = 4;
                                    stackIn_42_0 = stackOut_41_0;
                                    stackIn_42_1 = stackOut_41_1;
                                    L24: while (true) {
                                      L25: {
                                        if (stackIn_42_0 >= stackIn_42_1) {
                                          break L25;
                                        } else {
                                          stackOut_43_0 = 0;
                                          stackIn_7_0 = stackOut_43_0;
                                          stackIn_44_0 = stackOut_43_0;
                                          if (var8 != 0) {
                                            continue L6;
                                          } else {
                                            var7 = stackIn_44_0;
                                            L26: while (true) {
                                              L27: {
                                                if (-5 >= (var7 ^ -1)) {
                                                  break L27;
                                                } else {
                                                  stackOut_46_0 = -1;
                                                  stackOut_46_1 = var5 ^ -1;
                                                  stackIn_42_0 = stackOut_46_0;
                                                  stackIn_42_1 = stackOut_46_1;
                                                  stackIn_47_0 = stackOut_46_0;
                                                  stackIn_47_1 = stackOut_46_1;
                                                  if (var8 != 0) {
                                                    continue L24;
                                                  } else {
                                                    L28: {
                                                      L29: {
                                                        if (stackIn_47_0 != stackIn_47_1) {
                                                          break L29;
                                                        } else {
                                                          lh.field_e[4 * var2 + var6][var7 + 4 * var3] = 0;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      L30: {
                                                        if (var5 != 1) {
                                                          break L30;
                                                        } else {
                                                          lh.field_e[var6 + 4 * var2][var3 * 4 + var7] = 1;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      L31: {
                                                        if (3 != var5) {
                                                          break L31;
                                                        } else {
                                                          L32: {
                                                            if (var6 == -var7 + 3) {
                                                              break L32;
                                                            } else {
                                                              lh.field_e[var6 + 4 * var2][4 * var3 - -var7] = 0;
                                                              if (var8 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L32;
                                                              }
                                                            }
                                                          }
                                                          lh.field_e[var6 + var2 * 4][4 * var3 + var7] = 1;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L31;
                                                          }
                                                        }
                                                      }
                                                      L33: {
                                                        if (var5 != 4) {
                                                          break L33;
                                                        } else {
                                                          L34: {
                                                            if (var7 == var6) {
                                                              break L34;
                                                            } else {
                                                              lh.field_e[var6 + 4 * var2][4 * var3 + var7] = 0;
                                                              if (var8 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L34;
                                                              }
                                                            }
                                                          }
                                                          lh.field_e[4 * var2 + var6][4 * var3 + var7] = 1;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      L35: {
                                                        if (var5 != 8) {
                                                          break L35;
                                                        } else {
                                                          lh.field_e[var2 * 4 + var6][var7 + 4 * var3] = -1;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L35;
                                                          }
                                                        }
                                                      }
                                                      L36: {
                                                        if (18 == var5) {
                                                          break L36;
                                                        } else {
                                                          L37: {
                                                            if (var5 == 11) {
                                                              break L37;
                                                            } else {
                                                              lh.field_e[var6 + var2 * 4][var3 * 4 - -var7] = 2;
                                                              if (var8 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L37;
                                                              }
                                                            }
                                                          }
                                                          L38: {
                                                            if (3 == var7) {
                                                              break L38;
                                                            } else {
                                                              lh.field_e[4 * var2 - -var6][var3 * 4 + var7] = 0;
                                                              if (var8 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L38;
                                                              }
                                                            }
                                                          }
                                                          lh.field_e[var6 + 4 * var2][var7 + var3 * 4] = 1;
                                                          if (var8 == 0) {
                                                            break L28;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      lh.field_e[var6 + var2 * 4][var7 + var3 * 4] = -1;
                                                      break L28;
                                                    }
                                                    var7++;
                                                    if (var8 == 0) {
                                                      continue L26;
                                                    } else {
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                              var6++;
                                              if (var8 == 0) {
                                                continue L23;
                                              } else {
                                                break L25;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3++;
                                      if (var8 == 0) {
                                        continue L5;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var2++;
                            if (var8 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  bm.e((byte) 31);
                  stackOut_82_0 = 6;
                  stackIn_83_0 = stackOut_82_0;
                  break L3;
                }
                ee.field_h = stackIn_83_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "fg.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != -5) {
            field_i = (ce) null;
        }
        field_m = null;
        field_l = null;
        field_i = null;
        field_q = null;
        field_j = null;
        field_x = null;
    }

    fg() {
    }

    static {
        field_u = new int[150];
        field_t = new vc();
        field_m = null;
    }
}
