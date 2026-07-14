/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fc {
    int field_e;
    int field_j;
    int[][] field_f;
    static int[] field_m;
    int field_d;
    int[][] field_k;
    int field_i;
    int[][] field_g;
    int[][] field_h;
    private int field_b;
    int[] field_l;
    static boolean[] field_c;
    static cj field_a;

    public static void b(int param0) {
        if (param0 != -1) {
            field_a = null;
        }
        field_m = null;
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1) {
        gf.field_g = 0;
        lq.field_b = 0;
        fn.field_c = 0;
        lb.field_a = nf.field_a;
        if (param0 < 121) {
            return;
        }
        gl.field_H = new hh(2);
        gl.field_H.a(-1, param1, -31458, al.c(bo.field_d, -1, bd.field_g));
    }

    private final id a(int param0, int param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        h var6 = null;
        int var7 = 0;
        wb var8 = null;
        if (-1 != (param1 ^ -1)) {
          if (-2 != (param1 ^ -1)) {
            if (2 == param1) {
              L0: {
                var6 = (h) (Object) new fd(param0, param4, param3 & -1610612737);
                if (0 >= (param3 & 1073741824)) {
                  break L0;
                } else {
                  ((fd) (Object) var6).field_H = true;
                  break L0;
                }
              }
              L1: {
                if (0 < (param3 & 536870912)) {
                  ((fd) (Object) var6).field_K = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (id) (Object) var6;
            } else {
              if (3 != param1) {
                if (-5 != (param1 ^ -1)) {
                  if (param2 > -60) {
                    ((fc) this).a((byte) 54);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var6 = new h(param0, param4, false);
                  var6.field_I = (byte)((param3 & -1073741824) >>> -294768322);
                  return (id) (Object) var6;
                }
              } else {
                return (id) (Object) new mg(param0, param4, param3);
              }
            }
          } else {
            return (id) (Object) pg.a(param0, (byte) -128, param3, param4);
          }
        } else {
          var6_int = 1073741823 & param3;
          var7 = (byte)(param3 >>> -1830245730 & 3);
          var8 = new wb(param0, param4, var6_int);
          var8.field_Lb = var7;
          return (id) (Object) var8;
        }
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
            ((fc) this).field_b = 72;
        }
        if (!(((fc) this).field_b <= -5)) {
            if (-65 > param1) {
                param1 = param1 + ((fc) this).field_b * 72;
            }
        }
        return param1 << 1928751495;
    }

    th a(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        id var9 = null;
        int var10 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 88 % ((param0 - 37) / 41);
        th var3 = new th();
        for (var4 = 0; var4 < ((fc) this).field_l.length; var4 += 4) {
            var5 = ((fc) this).field_l[var4];
            var6 = ((fc) this).field_l[var4 - -1];
            var7 = ((fc) this).field_l[2 + var4];
            var8 = ((fc) this).field_l[3 + var4];
            var9 = this.a(var7, var5, (byte) -97, var6, var8);
            var3.a((br) (Object) var9, false);
        }
        return var3;
    }

    void a(byte param0) {
        ((fc) this).a(((fc) this).field_g, 9);
        this.b(((fc) this).field_g, -10);
        ((fc) this).field_d = ((fc) this).field_g[0].length;
        if (param0 < 120) {
            return;
        }
        ((fc) this).field_e = ((fc) this).field_g.length;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -8927) {
            ((fc) this).field_h = null;
        }
        ((fc) this).field_k[param1][param2] = cr.b(param3 ? 1 : 0, tq.b(14, ((fc) this).field_k[param1][param2]));
        if (((fc) this).field_k[param1].length > param2 + 1) {
            ((fc) this).field_k[param1][param2 - -1] = cr.b(tq.b(((fc) this).field_k[param1][1 + param2], -3), param3 ? 2 : 0);
        }
        if (0 < param2 + -1) {
            ((fc) this).field_k[param1][-1 + param2] = cr.b(tq.b(((fc) this).field_k[param1][-1 + param2], -5), param3 ? 4 : 0);
        }
    }

    private final void b(int[][] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != -10) {
            boolean discarded$0 = this.a(94, -4, (byte) -2);
        }
        for (var3 = 0; param0.length > var3; var3++) {
            for (var4 = 0; param0[0].length > var4; var4++) {
                var5 = this.a(var3, true, var4);
                var6 = 511 & var5 >> 627713031;
                var7 = var5 >> 607305712 & 511;
                if (-1 != (-2147483648 & var5)) {
                    if (-10 <= var6) {
                        // if_icmpge L148
                    }
                    if (-10 >= (var7 ^ -1)) {
                        // if_icmpge L148
                    }
                    if (!(((this.a(1 + var3, true, var4) & 65408) >> 1483158567 ^ -1) != -17)) {
                        var5 = var5 | 67108864;
                    }
                }
                ((fc) this).field_f[var3][var4] = var5;
            }
        }
    }

    final void a(int[][] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_13_2 = null;
        int stackIn_13_3 = 0;
        int stackIn_13_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int[] stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (param0.length <= var3) {
            L1: {
              if (param1 == 9) {
                break L1;
              } else {
                id discarded$1 = this.a(106, -54, (byte) -40, 61, -65);
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= param0.length) {
                return;
              } else {
                var7 = 1;
                var4 = var7;
                L3: while (true) {
                  if (param0[0].length + -1 <= var7) {
                    var3++;
                    continue L2;
                  } else {
                    if (1 == (((fc) this).field_k[var3][var7] & 1)) {
                      ((fc) this).field_k[var3][1 + var7] = cr.b(((fc) this).field_k[var3][var7 + 1], 2);
                      ((fc) this).field_h[var3][1 + var7] = cr.b(((fc) this).field_k[var3][var7 + 1], 2);
                      ((fc) this).field_k[var3][-1 + var7] = cr.b(4, ((fc) this).field_k[var3][-1 + var7]);
                      ((fc) this).field_h[var3][var7 + -1] = cr.b(4, ((fc) this).field_k[var3][-1 + var7]);
                      var7++;
                      continue L3;
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            }
          } else {
            var4 = 0;
            L4: while (true) {
              if (param0[0].length <= var4) {
                var3++;
                continue L0;
              } else {
                L5: {
                  if (-1 == (param0[var3][var4] & 33554432 ^ -1)) {
                    if ((param0[var3][var4] & -2147483648) == 0) {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L5;
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_10_0 = stackOut_7_0;
                      break L5;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_10_0 = stackOut_5_0;
                    break L5;
                  }
                }
                L6: {
                  var5 = stackIn_10_0;
                  stackOut_10_0 = ((fc) this).field_h[var3];
                  stackOut_10_1 = var4;
                  stackOut_10_2 = ((fc) this).field_k[var3];
                  stackOut_10_3 = var4;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  stackIn_11_3 = stackOut_10_3;
                  if (var5 == 0) {
                    stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = (int[]) (Object) stackIn_12_2;
                    stackOut_12_3 = stackIn_12_3;
                    stackOut_12_4 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    stackIn_13_3 = stackOut_12_3;
                    stackIn_13_4 = stackOut_12_4;
                    break L6;
                  } else {
                    stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = (int[]) (Object) stackIn_11_2;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    stackIn_13_2 = stackOut_11_2;
                    stackIn_13_3 = stackOut_11_3;
                    stackIn_13_4 = stackOut_11_4;
                    break L6;
                  }
                }
                stackIn_13_2[stackIn_13_3] = stackIn_13_4;
                stackIn_13_0[stackIn_13_1] = stackIn_13_4;
                var4++;
                continue L4;
              }
            }
          }
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_36_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = this.a((byte) 91, param2, param0);
          var4 = var4 & -67108865;
          var5 = 511 & var4 >> 506472231;
          if ((var4 & 33554432) == -1) {
            break L0;
          } else {
            if (-1 == var5) {
              L1: {
                var4 = var4 & -65409;
                if (!this.a(param2 - -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 - -1, 2)) {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_10_0 = stackOut_7_0;
                    break L1;
                  }
                } else {
                  stackOut_5_0 = 0;
                  stackIn_10_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var6 = stackIn_10_0;
                var7 = this.a(param2, 3 + param0, (byte) -53) ? 1 : 0;
                var8 = this.a(param2, param0 + -1, (byte) -53) ? 1 : 0;
                if (!this.a(param2 + -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 + -1, 2)) {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L2;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_16_0 = stackOut_13_0;
                    break L2;
                  }
                } else {
                  stackOut_11_0 = 1;
                  stackIn_16_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_16_0;
                if (!this.a(param2 + 1, param0, (byte) -53)) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var10 = stackIn_19_0;
                  if (!this.a(param0, param2, 2)) {
                    break L5;
                  } else {
                    if (var6 == 0) {
                      L6: {
                        if (var7 == 0) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L6;
                          } else {
                            if (var9 == 0) {
                              break L6;
                            } else {
                              if (var10 != 0) {
                                var4 = var4 | this.a(param1, 9);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        if (var7 == 0) {
                          break L7;
                        } else {
                          if (var8 == 0) {
                            break L7;
                          } else {
                            if (var9 == 0) {
                              break L7;
                            } else {
                              if (var10 != 0) {
                                break L7;
                              } else {
                                var4 = var4 | this.a(true, 10);
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        if (var7 == 0) {
                          break L8;
                        } else {
                          if (var8 == 0) {
                            break L8;
                          } else {
                            if (var10 != 0) {
                              var4 = var4 | this.a(param1, 11);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      L9: {
                        if (var7 == 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            break L9;
                          } else {
                            if (var10 != 0) {
                              break L9;
                            } else {
                              var4 = var4 | this.a(true, 18);
                              break L9;
                            }
                          }
                        }
                      }
                      L10: {
                        if (var7 == 0) {
                          break L10;
                        } else {
                          if (var8 != 0) {
                            break L10;
                          } else {
                            if (var9 == 0) {
                              break L10;
                            } else {
                              if (var10 != 0) {
                                var4 = var4 | this.a(true, 12);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        if (var7 == 0) {
                          break L11;
                        } else {
                          if (var8 != 0) {
                            break L11;
                          } else {
                            if (var9 == 0) {
                              break L11;
                            } else {
                              if (var10 != 0) {
                                break L11;
                              } else {
                                var4 = var4 | this.a(true, 14);
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        if (var7 == 0) {
                          break L12;
                        } else {
                          if (var8 != 0) {
                            break L12;
                          } else {
                            if (var9 != 0) {
                              break L12;
                            } else {
                              if (var10 == 0) {
                                break L12;
                              } else {
                                var4 = var4 | this.a(true, 15);
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      L13: {
                        if (var7 == 0) {
                          break L13;
                        } else {
                          if (var8 != 0) {
                            break L13;
                          } else {
                            if (var9 != 0) {
                              break L13;
                            } else {
                              if (var10 == 0) {
                                var4 = var4 | this.a(true, 21);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (var7 != 0) {
                          break L14;
                        } else {
                          if (var8 == 0) {
                            break L14;
                          } else {
                            if (var9 == 0) {
                              break L14;
                            } else {
                              if (var10 == 0) {
                                break L14;
                              } else {
                                var4 = var4 | this.a(true, 13);
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      L15: {
                        if (var7 != 0) {
                          break L15;
                        } else {
                          if (var8 == 0) {
                            break L15;
                          } else {
                            if (var9 == 0) {
                              break L15;
                            } else {
                              if (var10 == 0) {
                                var4 = var4 | this.a(param1, 16);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (var7 != 0) {
                          break L16;
                        } else {
                          if (var8 == 0) {
                            break L16;
                          } else {
                            if (var9 != 0) {
                              break L16;
                            } else {
                              if (var10 != 0) {
                                var4 = var4 | this.a(param1, 17);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      L17: {
                        if (var7 != 0) {
                          break L17;
                        } else {
                          if (var8 == 0) {
                            break L17;
                          } else {
                            if (var9 != 0) {
                              break L17;
                            } else {
                              if (var10 == 0) {
                                var4 = var4 | this.a(true, 20);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (var7 != 0) {
                          break L18;
                        } else {
                          if (var8 != 0) {
                            break L18;
                          } else {
                            if (var9 == 0) {
                              break L18;
                            } else {
                              if (var10 != 0) {
                                var4 = var4 | this.a(true, 19);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                      L19: {
                        if (var7 != 0) {
                          break L19;
                        } else {
                          if (var8 != 0) {
                            break L19;
                          } else {
                            if (var9 == 0) {
                              break L19;
                            } else {
                              if (var10 != 0) {
                                break L19;
                              } else {
                                var4 = var4 | this.a(true, 22);
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (var7 != 0) {
                          break L20;
                        } else {
                          if (var8 != 0) {
                            break L20;
                          } else {
                            if (var9 != 0) {
                              break L20;
                            } else {
                              if (var10 != 0) {
                                var4 = var4 | this.a(true, 23);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          }
                        }
                      }
                      if (var7 != 0) {
                        break L4;
                      } else {
                        if (var8 != 0) {
                          break L4;
                        } else {
                          if (var9 != 0) {
                            break L4;
                          } else {
                            if (var10 == 0) {
                              var4 = var4 | this.a(param1, 24);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                if (!this.a(param0, param2, 2)) {
                  if (!this.a(param2, 1 + param0, (byte) -53)) {
                    if (this.a(param2, param0 + 2, (byte) -53)) {
                      L21: {
                        if (!this.a(param2 - -1, param0, (byte) -53)) {
                          break L21;
                        } else {
                          if (this.a(param2 - 1, param0, (byte) -53)) {
                            var4 = var4 | this.a(param1, 6);
                            break L4;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (!this.a(param2 - -1, param0, (byte) -53)) {
                        if (!this.a(-1 + param2, param0, (byte) -53)) {
                          var4 = var4 | this.a(true, 2);
                          break L4;
                        } else {
                          var4 = var4 | this.a(true, 4);
                          break L4;
                        }
                      } else {
                        var4 = var4 | this.a(param1, 8);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L22: {
                      if (!this.a(1 + param2, param0, (byte) -53)) {
                        break L22;
                      } else {
                        if (this.a(-1 + param2, param0, (byte) -53)) {
                          var4 = var4 | this.a(true, 5);
                          break L4;
                        } else {
                          break L22;
                        }
                      }
                    }
                    if (!this.a(param2 - -1, param0, (byte) -53)) {
                      if (!this.a(param2 - 1, param0, (byte) -53)) {
                        var4 = var4 | this.a(true, 1);
                        break L4;
                      } else {
                        var4 = var4 | this.a(param1, 3);
                        break L4;
                      }
                    } else {
                      var4 = var4 | this.a(true, 7);
                      break L4;
                    }
                  }
                } else {
                  L23: {
                    L24: {
                      stackOut_23_0 = var10;
                      stackIn_26_0 = stackOut_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      if (this.a(param2 - -1, 2 + param0, (byte) -53)) {
                        break L24;
                      } else {
                        stackOut_24_0 = stackIn_24_0;
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (!this.a(1 + param2, param0 + 1, (byte) -53)) {
                          stackOut_27_0 = stackIn_27_0;
                          stackOut_27_1 = 0;
                          stackIn_28_0 = stackOut_27_0;
                          stackIn_28_1 = stackOut_27_1;
                          break L23;
                        } else {
                          stackOut_25_0 = stackIn_25_0;
                          stackIn_26_0 = stackOut_25_0;
                          break L24;
                        }
                      }
                    }
                    stackOut_26_0 = stackIn_26_0;
                    stackOut_26_1 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_28_1 = stackOut_26_1;
                    break L23;
                  }
                  L25: {
                    L26: {
                      var10 = stackIn_28_0 | stackIn_28_1;
                      stackOut_28_0 = var9;
                      stackIn_31_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (this.a(param2 - 1, 2 + param0, (byte) -53)) {
                        break L26;
                      } else {
                        stackOut_29_0 = stackIn_29_0;
                        stackIn_32_0 = stackOut_29_0;
                        stackIn_30_0 = stackOut_29_0;
                        if (!this.a(-1 + param2, param0 - -1, (byte) -53)) {
                          stackOut_32_0 = stackIn_32_0;
                          stackOut_32_1 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          break L25;
                        } else {
                          stackOut_30_0 = stackIn_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          break L26;
                        }
                      }
                    }
                    stackOut_31_0 = stackIn_31_0;
                    stackOut_31_1 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L25;
                  }
                  L27: {
                    var9 = stackIn_33_0 | stackIn_33_1;
                    if (!this.a(param2 + 1, param0 - -1, (byte) -53)) {
                      stackOut_35_0 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      break L27;
                    } else {
                      stackOut_34_0 = 128;
                      stackIn_36_0 = stackOut_34_0;
                      break L27;
                    }
                  }
                  L28: {
                    var11 = stackIn_36_0;
                    if (var7 != 0) {
                      break L28;
                    } else {
                      if (var8 != 0) {
                        break L28;
                      } else {
                        if (var9 == 0) {
                          break L28;
                        } else {
                          if (var10 == 0) {
                            break L28;
                          } else {
                            var4 = var4 | -var11 + this.a(true, 26);
                            break L28;
                          }
                        }
                      }
                    }
                  }
                  if (var7 != 0) {
                    break L4;
                  } else {
                    if (var8 != 0) {
                      break L4;
                    } else {
                      if (var9 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          break L4;
                        } else {
                          var4 = var4 | this.a(true, 28) + -var11;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              L29: {
                if ((65408 & var4) == 0) {
                  var4 = var4 | this.a(param1, 24);
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                if (param1) {
                  break L30;
                } else {
                  ((fc) this).a((int[][]) null, -26);
                  break L30;
                }
              }
              return var4;
            } else {
              break L0;
            }
          }
        }
        return var4;
    }

    private final boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            ((fc) this).field_d = -47;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.a(param1, param0 + 1, (byte) -53)) {
              break L2;
            } else {
              if (this.a(param1, param0 + 2, (byte) -53)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void b(byte param0) {
        if (f.field_a != -vm.field_hb + 0) {
            if (-vm.field_hb + 250 != f.field_a) {
            }
        }
        if (param0 != -9) {
            field_a = null;
        }
        f.field_a = f.field_a + 1;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param2 == -53) {
          L0: {
            L1: {
              if (0 == (this.a((byte) 82, param0, param1) & 33554432)) {
                break L1;
              } else {
                if (-65 <= (this.a((byte) 105, param0, param1) >> 670815815 & 511 ^ -1)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        if (param0 <= 31) {
            boolean discarded$0 = this.a(24, -127, (byte) 25);
        }
        if (!(-1 >= (param1 ^ -1))) {
            return 0;
        }
        if (param2 < 0) {
            return 0;
        }
        if (((fc) this).field_g.length <= param2) {
            return 0;
        }
        if (!(((fc) this).field_g[0].length > param1)) {
            return 0;
        }
        return ((fc) this).field_g[param2][param1];
    }

    fc(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        ((fc) this).field_j = param2;
        eh.field_b = eh.field_b + 1;
        ((fc) this).field_i = eh.field_b;
        ((fc) this).field_l = param1;
        ((fc) this).field_b = param4;
        ((fc) this).field_g = param0;
        ((fc) this).field_f = new int[param0.length][param0[0].length];
        ((fc) this).field_k = new int[param0.length][param0[0].length];
        ((fc) this).field_h = new int[param0.length][param0[0].length];
        ((fc) this).a((byte) 121);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = da.a(8);
    }
}
