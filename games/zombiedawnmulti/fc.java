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
            field_a = (cj) null;
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
        int var6_int;
        h var6;
        fd var6_ref;
        int var7;
        wb var8;
        if (-1 != (param1 ^ -1)) {
          if (-2 != (param1 ^ -1)) {
            if (2 == param1) {
              L0: {
                var6_ref = new fd(param0, param4, param3 & -1610612737);
                if (0 >= (param3 & 1073741824)) {
                  break L0;
                } else {
                  var6_ref.field_H = true;
                  break L0;
                }
              }
              L1: {
                if (0 < (param3 & 536870912)) {
                  var6_ref.field_K = true;
                  break L1;
                } else {
                  break L1;
                }
              }
              return (id) ((Object) var6_ref);
            } else {
              if (3 != param1) {
                if (-5 != (param1 ^ -1)) {
                  if (param2 > -60) {
                    this.a((byte) 54);
                    return null;
                  } else {
                    return null;
                  }
                } else {
                  var6 = new h(param0, param4, false);
                  var6.field_I = (byte)((param3 & -1073741824) >>> -294768322);
                  return (id) ((Object) var6);
                }
              } else {
                return (id) ((Object) new mg(param0, param4, param3));
              }
            }
          } else {
            return (id) ((Object) pg.a(param0, (byte) -128, param3, param4));
          }
        } else {
          var6_int = 1073741823 & param3;
          var7 = (byte)(param3 >>> -1830245730 & 3);
          var8 = new wb(param0, param4, var6_int);
          var8.field_Lb = var7;
          return (id) ((Object) var8);
        }
    }

    private final int a(boolean param0, int param1) {
        if (!param0) {
            this.field_b = 72;
        }
        if (!((this.field_b ^ -1) <= -5)) {
            if (-65 < (param1 ^ -1)) {
                param1 = param1 + this.field_b * 72;
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
        for (var4 = 0; var4 < this.field_l.length; var4 += 4) {
            var5 = this.field_l[var4];
            var6 = this.field_l[var4 - -1];
            var7 = this.field_l[2 + var4];
            var8 = this.field_l[3 + var4];
            var9 = this.a(var7, var5, (byte) -97, var6, var8);
            var3.a(var9, false);
        }
        return var3;
    }

    void a(byte param0) {
        this.a(this.field_g, 9);
        this.b(this.field_g, -10);
        this.field_d = this.field_g[0].length;
        if (param0 < 120) {
            return;
        }
        this.field_e = this.field_g.length;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (param0 != -8927) {
            this.field_h = (int[][]) null;
        }
        this.field_k[param1][param2] = cr.b(param3 ? 1 : 0, tq.b(14, this.field_k[param1][param2]));
        if (this.field_k[param1].length > param2 + 1) {
            this.field_k[param1][param2 - -1] = cr.b(tq.b(this.field_k[param1][1 + param2], -3), param3 ? 2 : 0);
        }
        if (0 < param2 + -1) {
            this.field_k[param1][-1 + param2] = cr.b(tq.b(this.field_k[param1][-1 + param2], -5), param3 ? 4 : 0);
        }
    }

    private final void b(int[][] param0, int param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -10) {
                break L1;
              } else {
                discarded$1 = this.a(94, -4, (byte) -2);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param0.length <= var3_int) {
                break L0;
              } else {
                var4 = 0;
                L3: while (true) {
                  if (param0[0].length <= var4) {
                    var3_int++;
                    continue L2;
                  } else {
                    L4: {
                      var5 = this.a(var3_int, true, var4);
                      var6 = 511 & var5 >> 627713031;
                      var7 = var5 >> 607305712 & 511;
                      if (-1 == (-2147483648 & var5 ^ -1)) {
                        break L4;
                      } else {
                        L5: {
                          L6: {
                            if (-10 < (var6 ^ -1)) {
                              break L6;
                            } else {
                              if (32 >= var6) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (-10 < (var7 ^ -1)) {
                              break L7;
                            } else {
                              if (32 >= var7) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (((this.a(1 + var3_int, true, var4) & 65408) >> 1483158567 ^ -1) == -17) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                        var5 = var5 | 67108864;
                        break L4;
                      }
                    }
                    this.field_f[var3_int][var4] = var5;
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("fc.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final void a(int[][] param0, int param1) {
        id discarded$0 = null;
        int[] dupTemp$1 = null;
        int dupTemp$2 = 0;
        int[] arrayValue$3 = null;
        int[] dupTemp$4 = null;
        int dupTemp$5 = 0;
        int[] arrayValue$6 = null;
        int stackIn_11_0 = 0;
        int[] stackIn_13_0;
        int stackIn_13_1;
        int[] stackIn_13_2;
        int stackIn_13_3;
        int[] stackIn_14_0;
        int stackIn_14_1;
        int[] stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param0.length <= var3_int) {
                L2: {
                  if (param1 == 9) {
                    break L2;
                  } else {
                    discarded$0 = this.a(106, -54, (byte) -40, 61, -65);
                    break L2;
                  }
                }
                var3_int = 0;
                L3: while (true) {
                  if (var3_int >= param0.length) {
                    break L0;
                  } else {
                    var7 = 1;
                    var4 = var7;
                    L4: while (true) {
                      if (param0[0].length + -1 <= var7) {
                        var3_int++;
                        continue L3;
                      } else {
                        L5: {
                          if (1 != (this.field_k[var3_int][var7] & 1)) {
                            break L5;
                          } else {
                            dupTemp$1 = this.field_k[var3_int];
                            dupTemp$2 = cr.b(this.field_k[var3_int][var7 + 1], 2);
                            arrayValue$3 = this.field_h[var3_int];
                            dupTemp$1[1 + var7] = dupTemp$2;
                            arrayValue$3[1 + var7] = dupTemp$2;
                            dupTemp$4 = this.field_k[var3_int];
                            dupTemp$5 = cr.b(4, this.field_k[var3_int][-1 + var7]);
                            arrayValue$6 = this.field_h[var3_int];
                            dupTemp$4[-1 + var7] = dupTemp$5;
                            arrayValue$6[var7 + -1] = dupTemp$5;
                            break L5;
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L6: while (true) {
                  if (param0[0].length <= var4) {
                    var3_int++;
                    continue L1;
                  } else {
                    L7: {
                      if (-1 == (param0[var3_int][var4] & 33554432 ^ -1)) {
                        if ((param0[var3_int][var4] & -2147483648) == 0) {
                          stackIn_11_0 = 1;
                          break L7;
                        } else {
                          stackIn_11_0 = 0;
                          break L7;
                        }
                      } else {
                        stackIn_11_0 = 0;
                        break L7;
                      }
                    }
                    L8: {
                      var5 = stackIn_11_0;
                      stackIn_13_0 = this.field_h[var3_int];

                      stackIn_13_1 = var4;

                      stackIn_13_2 = this.field_k[var3_int];

                      stackIn_13_3 = var4;

                      if (var5 == 0) {
                        stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = (int[]) ((Object) stackIn_13_2);
                        stackIn_14_3 = stackIn_13_3;
                        stackIn_14_4 = 0;
                        break L8;
                      } else {
                        stackIn_14_0 = (int[]) ((Object) stackIn_13_0);
                        stackIn_14_1 = stackIn_13_1;
                        stackIn_14_2 = (int[]) ((Object) stackIn_13_2);
                        stackIn_14_3 = stackIn_13_3;
                        stackIn_14_4 = 1;
                        break L8;
                      }
                    }
                    stackIn_14_2[stackIn_14_3] = stackIn_14_4;
                    stackIn_14_0[stackIn_14_1] = stackIn_14_4;
                    var4++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("fc.I(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = this.a((byte) 91, param2, param0);
          var4 = var4 & -67108865;
          var5 = 511 & var4 >> 506472231;
          if ((var4 & 33554432) == 0) {
            break L0;
          } else {
            if (-1 == (var5 ^ -1)) {
              L1: {
                var4 = var4 & -65409;
                if (!this.a(param2 - -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 - -1, 2)) {
                    stackIn_10_0 = 1;
                    break L1;
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_10_0 = 0;
                  break L1;
                }
              }
              L2: {
                var6 = stackIn_10_0;
                var7 = this.a(param2, 3 + param0, (byte) -53) ? 1 : 0;
                var8 = this.a(param2, param0 + -1, (byte) -53) ? 1 : 0;
                if (!this.a(param2 + -1, param0, (byte) -53)) {
                  if (!this.a(param0, param2 + -1, 2)) {
                    stackIn_16_0 = 1;
                    break L2;
                  } else {
                    stackIn_16_0 = 0;
                    break L2;
                  }
                } else {
                  stackIn_16_0 = 1;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_16_0;
                if (!this.a(param2 + 1, param0, (byte) -53)) {
                  stackIn_19_0 = 0;
                  break L3;
                } else {
                  stackIn_19_0 = 1;
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
                            if (var9 != 0) {
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
                      }
                      L9: {
                        if (var7 == 0) {
                          break L9;
                        } else {
                          if (var8 == 0) {
                            break L9;
                          } else {
                            if (var9 != 0) {
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
                L21: {
                  if (!this.a(param0, param2, 2)) {
                    break L21;
                  } else {
                    if (var6 == 0) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          stackIn_27_0 = var10;

                          if (this.a(param2 - -1, 2 + param0, (byte) -53)) {
                            break L23;
                          } else {


                            if (!this.a(1 + param2, param0 + 1, (byte) -53)) {
                              stackIn_29_0 = stackIn_27_0;
                              stackIn_29_1 = 0;
                              break L22;
                            } else {

                              break L23;
                            }
                          }
                        }
                        stackIn_29_0 = stackIn_27_0;
                        stackIn_29_1 = 1;
                        break L22;
                      }
                      L24: {
                        L25: {
                          var10 = stackIn_29_0 | stackIn_29_1;
                          stackIn_32_0 = var9;

                          if (this.a(param2 - 1, 2 + param0, (byte) -53)) {
                            break L25;
                          } else {


                            if (!this.a(-1 + param2, param0 - -1, (byte) -53)) {
                              stackIn_34_0 = stackIn_32_0;
                              stackIn_34_1 = 0;
                              break L24;
                            } else {

                              break L25;
                            }
                          }
                        }
                        stackIn_34_0 = stackIn_32_0;
                        stackIn_34_1 = 1;
                        break L24;
                      }
                      L26: {
                        var9 = stackIn_34_0 | stackIn_34_1;
                        if (!this.a(param2 + 1, param0 - -1, (byte) -53)) {
                          stackIn_37_0 = 0;
                          break L26;
                        } else {
                          stackIn_37_0 = 128;
                          break L26;
                        }
                      }
                      L27: {
                        var11 = stackIn_37_0;
                        if (var7 != 0) {
                          break L27;
                        } else {
                          if (var8 != 0) {
                            break L27;
                          } else {
                            if (var9 == 0) {
                              break L27;
                            } else {
                              if (var10 == 0) {
                                break L27;
                              } else {
                                var4 = var4 | -var11 + this.a(true, 26);
                                break L27;
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
                }
                if (!this.a(param2, 1 + param0, (byte) -53)) {
                  if (this.a(param2, param0 + 2, (byte) -53)) {
                    L28: {
                      if (!this.a(param2 - -1, param0, (byte) -53)) {
                        break L28;
                      } else {
                        if (this.a(param2 - 1, param0, (byte) -53)) {
                          var4 = var4 | this.a(param1, 6);
                          break L4;
                        } else {
                          break L28;
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
                  L29: {
                    if (!this.a(1 + param2, param0, (byte) -53)) {
                      break L29;
                    } else {
                      if (this.a(-1 + param2, param0, (byte) -53)) {
                        var4 = var4 | this.a(true, 5);
                        break L4;
                      } else {
                        break L29;
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
              }
              L30: {
                if ((65408 & var4) == 0) {
                  var4 = var4 | this.a(param1, 24);
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param1) {
                  break L31;
                } else {
                  this.a((int[][]) null, -26);
                  break L31;
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
        L0: {
          if (param2 == 2) {
            break L0;
          } else {
            this.field_d = -47;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void b(byte param0) {
        if (f.field_a != -vm.field_hb + 0 && -vm.field_hb + 250 != f.field_a) {
        }
        if (param0 != -9) {
            field_a = (cj) null;
        }
        f.field_a = f.field_a + 1;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_7_0 = 0;
        if (param2 == -53) {
          L0: {
            L1: {
              if (0 == (this.a((byte) 82, param0, param1) & 33554432)) {
                break L1;
              } else {
                if (-65 <= (this.a((byte) 105, param0, param1) >> 670815815 & 511 ^ -1)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    private final int a(byte param0, int param1, int param2) {
        boolean discarded$0 = false;
        if (param0 <= 31) {
            discarded$0 = this.a(24, -127, (byte) 25);
        }
        if (!(-1 >= (param1 ^ -1))) {
            return 0;
        }
        if (param2 < 0) {
            return 0;
        }
        if (this.field_g.length <= param2) {
            return 0;
        }
        if (!(this.field_g[0].length > param1)) {
            return 0;
        }
        return this.field_g[param2][param1];
    }

    fc(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        int fieldTemp$0 = 0;
        try {
            this.field_j = param2;
            fieldTemp$0 = eh.field_b;
            eh.field_b = eh.field_b + 1;
            this.field_i = fieldTemp$0;
            this.field_l = param1;
            this.field_b = param4;
            this.field_g = param0;
            this.field_f = new int[param0.length][param0[0].length];
            this.field_k = new int[param0.length][param0[0].length];
            this.field_h = new int[param0.length][param0[0].length];
            this.a((byte) 121);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_m = da.a(8);
    }
}
