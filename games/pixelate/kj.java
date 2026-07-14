/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    private int field_m;
    static int field_s;
    int field_o;
    int[] field_k;
    static Boolean field_j;
    int field_c;
    private int[][] field_p;
    static ak field_l;
    private int[] field_n;
    int field_b;
    int[] field_a;
    int[][] field_r;
    int[] field_h;
    private byte[] field_e;
    ap[] field_q;
    int[] field_i;
    int[] field_f;
    byte[][] field_d;
    ap field_g;

    public static void b(int param0) {
        if (param0 <= 47) {
            return;
        }
        field_j = null;
        field_l = null;
    }

    final static void a(int param0) {
        uj var3 = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        rl.field_r = false;
        io.field_c = null;
        bn.field_S = null;
        if (null != i.field_n) {
            i.field_n.e(-123);
            i.field_n = null;
        }
        if (param0 != 23949) {
            field_s = 72;
        }
        il.field_d = null;
        if (null != nk.field_a) {
            nk.field_a.e(117);
            nk.field_a = null;
        }
        dg.field_f = null;
        if (!(null == wi.field_a)) {
            wi.field_a.e(126);
            wi.field_a = null;
        }
        eh.field_f = null;
        if (il.field_d != null) {
            var3 = (uj) (Object) il.field_d.a(-109);
            while (var3 != null) {
                var3.e(17);
                var3 = (uj) (Object) il.field_d.a((byte) 50);
            }
            il.field_d = null;
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = Pixelate.field_H ? 1 : 0;
            if (param0 <= 0) {
              break L1;
            } else {
              if (param0 < 128) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param0 < 160) {
              L3: {
                if (param1 >= 89) {
                  break L3;
                } else {
                  field_j = null;
                  break L3;
                }
              }
              if (param0 != 0) {
                var6 = jg.field_I;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param0) {
                      var3++;
                      continue L4;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                break L2;
              }
            } else {
              if (param0 <= 255) {
                break L0;
              } else {
                L5: {
                  if (param1 >= 89) {
                    break L5;
                  } else {
                    field_j = null;
                    break L5;
                  }
                }
                if (param0 != 0) {
                  var6 = jg.field_I;
                  var2 = var6;
                  var3 = 0;
                  L6: while (true) {
                    if (var6.length <= var3) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (var4 != param0) {
                        var3++;
                        continue L6;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          }
          return false;
        }
        return true;
    }

    private final void a(int param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        we var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = Pixelate.field_H ? 1 : 0;
          var17 = new we(la.a(param1, 0));
          var4 = var17.f(255);
          if (5 > var4) {
            break L0;
          } else {
            if (var4 <= 7) {
              L1: {
                if (-7 >= (var4 ^ -1)) {
                  ((kj) this).field_c = var17.k(0);
                  break L1;
                } else {
                  ((kj) this).field_c = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.f(255);
                if ((1 & var5) == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (var4 >= 7) {
                  ((kj) this).field_m = var17.i(9997);
                  break L3;
                } else {
                  ((kj) this).field_m = var17.a((byte) -119);
                  break L3;
                }
              }
              L4: {
                if ((var5 & 2) == 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                var9 = -1;
                ((kj) this).field_f = new int[((kj) this).field_m];
                if (var4 < 7) {
                  var10 = 0;
                  L6: while (true) {
                    if (((kj) this).field_m <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) -111);
                      ((kj) this).field_f[var10] = var8 + var17.a((byte) -111);
                      if (((kj) this).field_f[var10] > var9) {
                        var9 = ((kj) this).field_f[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (((kj) this).field_m <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.i(9997);
                      ((kj) this).field_f[var10] = var8 + var17.i(9997);
                      if (var9 < ((kj) this).field_f[var10]) {
                        var9 = ((kj) this).field_f[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((kj) this).field_b = 1 + var9;
                ((kj) this).field_h = new int[((kj) this).field_b];
                if (var7 == 0) {
                  break L8;
                } else {
                  ((kj) this).field_d = new byte[((kj) this).field_b][];
                  break L8;
                }
              }
              L9: {
                ((kj) this).field_a = new int[((kj) this).field_b];
                ((kj) this).field_r = new int[((kj) this).field_b][];
                ((kj) this).field_k = new int[((kj) this).field_b];
                ((kj) this).field_i = new int[((kj) this).field_b];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((kj) this).field_n = new int[((kj) this).field_b];
                  var10 = 0;
                  L10: while (true) {
                    if (((kj) this).field_b <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((kj) this).field_m) {
                          ((kj) this).field_g = new ap(((kj) this).field_n);
                          break L9;
                        } else {
                          ((kj) this).field_n[((kj) this).field_f[var10]] = var17.k(0);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((kj) this).field_n[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((kj) this).field_m <= var10) {
                  L13: {
                    var11 = -79 % ((param0 - 0) / 44);
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (((kj) this).field_m <= var10) {
                          break L13;
                        } else {
                          var21 = new byte[64];
                          var17.a(var21, 0, -128, 64);
                          ((kj) this).field_d[((kj) this).field_f[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((kj) this).field_m <= var10) {
                      L16: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L17: while (true) {
                            if (((kj) this).field_m <= var10) {
                              var10 = 0;
                              L18: while (true) {
                                if (((kj) this).field_m <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((kj) this).field_f[var10];
                                  var12 = ((kj) this).field_h[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((kj) this).field_r[var11] = new int[var12];
                                  var14 = 0;
                                  L19: while (true) {
                                    if (var14 >= var12) {
                                      ((kj) this).field_i[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((kj) this).field_r[var11] = null;
                                        var10++;
                                        continue L18;
                                      } else {
                                        var10++;
                                        continue L18;
                                      }
                                    } else {
                                      var8 = var8 + var17.i(9997);
                                      ((kj) this).field_r[var11][var14] = var8 + var17.i(9997);
                                      var15 = var8 + var17.i(9997);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L19;
                                      } else {
                                        var14++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kj) this).field_h[((kj) this).field_f[var10]] = var17.i(9997);
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L20: while (true) {
                            if (((kj) this).field_m <= var10) {
                              var10 = 0;
                              L21: while (true) {
                                if (((kj) this).field_m <= var10) {
                                  break L16;
                                } else {
                                  var11 = ((kj) this).field_f[var10];
                                  var12 = ((kj) this).field_h[var11];
                                  var8 = 0;
                                  ((kj) this).field_r[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L22: while (true) {
                                    if (var14 >= var12) {
                                      ((kj) this).field_i[var11] = var13 - -1;
                                      if (1 + var13 == var12) {
                                        ((kj) this).field_r[var11] = null;
                                        var10++;
                                        continue L21;
                                      } else {
                                        var10++;
                                        continue L21;
                                      }
                                    } else {
                                      var8 = var8 + var17.a((byte) -119);
                                      ((kj) this).field_r[var11][var14] = var8 + var17.a((byte) -119);
                                      var15 = var8 + var17.a((byte) -119);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L22;
                                      } else {
                                        var14++;
                                        continue L22;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((kj) this).field_h[((kj) this).field_f[var10]] = var17.a((byte) -123);
                              var10++;
                              continue L20;
                            }
                          }
                        }
                      }
                      L23: {
                        if (var6 == 0) {
                          break L23;
                        } else {
                          ((kj) this).field_p = new int[var9 - -1][];
                          ((kj) this).field_q = new ap[var9 + 1];
                          var10 = 0;
                          L24: while (true) {
                            if (((kj) this).field_m <= var10) {
                              break L23;
                            } else {
                              var11 = ((kj) this).field_f[var10];
                              var12 = ((kj) this).field_h[var11];
                              ((kj) this).field_p[var11] = new int[((kj) this).field_i[var11]];
                              var13 = 0;
                              L25: while (true) {
                                if (var13 >= ((kj) this).field_i[var11]) {
                                  var13 = 0;
                                  L26: while (true) {
                                    if (var13 >= var12) {
                                      ((kj) this).field_q[var11] = new ap(((kj) this).field_p[var11]);
                                      var10++;
                                      continue L24;
                                    } else {
                                      L27: {
                                        if (((kj) this).field_r[var11] != null) {
                                          var14 = ((kj) this).field_r[var11][var13];
                                          break L27;
                                        } else {
                                          var14 = var13;
                                          break L27;
                                        }
                                      }
                                      ((kj) this).field_p[var11][var14] = var17.k(0);
                                      var13++;
                                      continue L26;
                                    }
                                  }
                                } else {
                                  ((kj) this).field_p[var11][var13] = -1;
                                  var13++;
                                  continue L25;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((kj) this).field_a[((kj) this).field_f[var10]] = var17.k(0);
                      var10++;
                      continue L15;
                    }
                  }
                } else {
                  ((kj) this).field_k[((kj) this).field_f[var10]] = var17.k(0);
                  var10++;
                  continue L12;
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(int param0, byte param1) {
        oa.field_j = 1;
        un.field_j = gd.field_e[param0];
        un.field_j.b(false);
        if (param1 < 124) {
            Object var3 = null;
            kj.a(-60, (tf) null, 85, -59, 28, 57);
        }
    }

    final static void a(int param0, tf param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
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
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        L0: {
          var21 = Pixelate.field_H ? 1 : 0;
          var6 = -91 % ((param3 - 37) / 51);
          var7 = (-param5 + param0 << 2069295144) / param1.field_A;
          param4 = param4 + param1.field_y;
          param2 = param2 + param1.field_D;
          var8 = (param5 << -2062015032) + param1.field_D * var7;
          var9 = param2 + param4 * t.field_j;
          var10 = 0;
          var11 = param1.field_E;
          var12 = param1.field_F;
          var13 = -var12 + t.field_j;
          var14 = 0;
          if (t.field_f <= param4) {
            break L0;
          } else {
            var15 = -param4 + t.field_f;
            var9 = var9 + t.field_j * var15;
            var11 = var11 - var15;
            var10 = var10 + var15 * var12;
            param4 = t.field_f;
            break L0;
          }
        }
        L1: {
          if (param4 - -var11 <= t.field_a) {
            break L1;
          } else {
            var11 = var11 - (var11 + (param4 - t.field_a));
            break L1;
          }
        }
        L2: {
          if (t.field_e > param2) {
            var15 = -param2 + t.field_e;
            var10 = var10 + var15;
            var13 = var13 + var15;
            var9 = var9 + var15;
            var8 = var8 + var7 * var15;
            var12 = var12 - var15;
            param2 = t.field_e;
            var14 = var14 + var15;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (t.field_h < var12 + param2) {
            var15 = param2 + (var12 - t.field_h);
            var13 = var13 + var15;
            var14 = var14 + var15;
            var12 = var12 - var15;
            break L3;
          } else {
            break L3;
          }
        }
        if (var12 <= 0) {
          return;
        } else {
          if ((var11 ^ -1) < -1) {
            param4 = -var11;
            L4: while (true) {
              if (0 <= param4) {
                return;
              } else {
                var15 = var8;
                param2 = -var12;
                L5: while (true) {
                  if (0 <= param2) {
                    var9 = var9 + var13;
                    var10 = var10 + var14;
                    param4++;
                    continue L4;
                  } else {
                    var16 = var15 >> 1753203496;
                    var17 = -var16 + 256;
                    var15 = var15 + var7;
                    if (var16 > -1) {
                      var9++;
                      var10++;
                      param2++;
                      continue L5;
                    } else {
                      var10++;
                      var18 = param1.field_G[var10];
                      if (-1 != var18) {
                        if ((var16 ^ -1) < -256) {
                          t.field_k[var9] = var18;
                          var9++;
                          param2++;
                          continue L5;
                        } else {
                          var19 = t.field_k[var9];
                          var20 = 16711935 & (var19 & 16711935) * var17 - -((16711935 & var18) * var16) >> 815827592;
                          t.field_k[var9] = var20 + (cm.a(var17 * cm.a(65280, var19) - -(var16 * cm.a(65280, var18)), 16711874) >> 446495528);
                          var9++;
                          param2++;
                          continue L5;
                        }
                      } else {
                        var9++;
                        param2++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    kj(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((kj) this).field_o = wg.a(param0, 125, param0.length);
        if (param1 != ((kj) this).field_o) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (-65 != (param2.length ^ -1)) {
                throw new RuntimeException();
            }
            ((kj) this).field_e = db.a(param0, 0, 1761872464, param0.length);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((kj) this).field_e[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(-89, param0);
    }

    static {
    }
}
