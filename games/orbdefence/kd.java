/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    int field_t;
    boolean[] field_m;
    int field_k;
    int[] field_s;
    static String field_b;
    int[] field_a;
    static double field_h;
    int[] field_g;
    int[] field_j;
    int field_n;
    static boolean field_d;
    int[] field_l;
    private cg field_p;
    int field_c;
    int[] field_o;
    static ki field_q;
    private int[] field_u;
    static String field_f;
    cg field_r;
    boolean[] field_e;
    int field_i;
    int[] field_v;

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        hj[] var6 = new hj[9];
        hj[] var5 = var6;
        hj dupTemp$0 = af.a(1, (byte) -50, param4);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        hj dupTemp$1 = af.a(1, (byte) -95, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
            var6[4] = af.a(64, (byte) -54, param1);
        }
        return var5;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
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
        double var15 = 0.0;
        int var15_int = 0;
        long var17 = 0L;
        int var19 = 0;
        L0: {
          var19 = OrbDefence.field_D ? 1 : 0;
          var5 = (param2 + -320) / ol.field_e;
          var6 = (param0 - 240) / ol.field_e;
          var7 = 1 + (var5 + 640 / ol.field_e);
          var8 = var6 + 480 / ol.field_e + 1;
          if (var5 < 0) {
            var5 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-1 + ((kd) this).field_c < var7) {
            var7 = -1 + ((kd) this).field_c;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var8 > ((kd) this).field_t + -1) {
            var8 = -1 + ((kd) this).field_t;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var6 >= 0) {
            break L3;
          } else {
            var6 = 0;
            break L3;
          }
        }
        var10 = var5 - -(var6 * ((kd) this).field_c);
        var11 = var6;
        L4: while (true) {
          if (var8 < var11) {
            L5: {
              var12 = 61 % ((25 - param1) / 37);
              if (!param3) {
                break L5;
              } else {
                var9 = 0;
                L6: while (true) {
                  if (var9 >= ((kd) this).field_s.length) {
                    var10 = var5 - -(var6 * ((kd) this).field_c);
                    var14 = var6;
                    L7: while (true) {
                      if (var14 > var8) {
                        break L5;
                      } else {
                        var9 = var10;
                        var10 = var10 + ((kd) this).field_c;
                        var13 = var5;
                        L8: while (true) {
                          if (var7 < var13) {
                            var14++;
                            continue L7;
                          } else {
                            if (((kd) this).field_j[var9] == 85) {
                              var12 = -(ol.field_e / 2) + 240 + (var14 * ol.field_e + (-param0 - 12));
                              var11 = -(ol.field_e / 2) + 320 + (var13 * ol.field_e - param2) + 4;
                              var15 = -Math.abs(Math.sin(0.1 * (double)da.field_b + (double)var9));
                              ul.i(var11, (int)((double)var12 + var15 * 5.0), 16, 7799039, 64);
                              ul.i(var11, (int)(var15 * 4.0 + (double)var12), 15, 10027263, 96);
                              ul.i(var11, (int)((double)var12 + var15 * 3.0), 14, 12255487, 128);
                              ul.i(var11, (int)((double)var12 + 2.0 * var15), 13, 14483711, 192);
                              ul.f(var11, var12, 12, 16711935);
                              ul.f(var11, (int)(2.0 * var15 + (double)var12), 6, 14483711);
                              ul.f(var11, (int)((double)var12 + var15 * 3.0), 5, 12255487);
                              ul.f(var11, (int)((double)var12 + 4.0 * var15), 4, 10027263);
                              ul.f(var11, (int)(5.0 * var15 + (double)var12), 3, 7799039);
                              var12 = -param0 + (-(ol.field_e >> 1) + 240 + var14 * ol.field_e);
                              var11 = 320 + (ol.field_e * var13 - (ol.field_e >> 1)) - param2;
                              var17 = (long)(100 * da.field_b);
                              hg.field_ab.c(var11 - (hg.field_ab.field_s / 2 - 4), var12 - 64 + -(int)(8.0 + 8.0 * Math.sin((double)var14 + ((double)var13 + (double)var17 * 0.001))));
                              var9++;
                              var13++;
                              continue L8;
                            } else {
                              var9++;
                              var13++;
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var13 = ((kd) this).field_s[var9] % ((kd) this).field_c;
                    var14 = ((kd) this).field_s[var9] / ((kd) this).field_c;
                    var12 = ol.field_e * var14 + (240 + -param0);
                    var11 = 320 + (ol.field_e * var13 + -param2);
                    var15 = -Math.abs(Math.sin(0.1 * (double)da.field_b + (double)var9));
                    ul.i(var11, (int)(var15 * 5.0 + (double)var12), 16, 16742399, 64);
                    ul.i(var11, (int)((double)var12 + var15 * 4.0), 15, 16751103, 96);
                    ul.i(var11, (int)(var15 * 3.0 + (double)var12), 14, 16759807, 128);
                    ul.i(var11, (int)(var15 * 2.0 + (double)var12), 13, 16768511, 192);
                    ul.f(var11, var12, 12, 16777215);
                    ul.f(var11, (int)((double)var12 + var15 * 2.0), 6, 16768511);
                    ul.f(var11, (int)((double)var12 + var15 * 3.0), 5, 16759807);
                    ul.f(var11, (int)(var15 * 4.0 + (double)var12), 4, 16751103);
                    ul.f(var11, (int)(5.0 * var15 + (double)var12), 3, 16742399);
                    var9++;
                    continue L6;
                  }
                }
              }
            }
            return;
          } else {
            var9 = var10;
            var10 = var10 + ((kd) this).field_c;
            var12 = var5;
            L9: while (true) {
              if (var12 > var7) {
                var11++;
                continue L4;
              } else {
                var13 = -param2 + (var12 * ol.field_e + 320 + -ol.field_a);
                var14 = ol.field_e * var11 + 240 - ol.field_a - param0;
                if (null == mf.field_b) {
                  L10: {
                    var15_int = 0;
                    if (((kd) this).field_o[var9] != 0) {
                      break L10;
                    } else {
                      var15_int = 12426084;
                      break L10;
                    }
                  }
                  L11: {
                    if (((kd) this).field_o[var9] != 1) {
                      break L11;
                    } else {
                      var15_int = 11184810;
                      break L11;
                    }
                  }
                  L12: {
                    if (((kd) this).field_o[var9] == -3) {
                      var15_int = 4473924;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-4 != ((kd) this).field_o[var9]) {
                      break L13;
                    } else {
                      var15_int = 4500138;
                      break L13;
                    }
                  }
                  L14: {
                    if (((kd) this).field_o[var9] != 5) {
                      break L14;
                    } else {
                      var15_int = 16777215;
                      break L14;
                    }
                  }
                  L15: {
                    if (((kd) this).field_o[var9] != 6) {
                      break L15;
                    } else {
                      var15_int = 16776960;
                      break L15;
                    }
                  }
                  ul.h(var13, var14, ol.field_e, ol.field_e, var15_int);
                  var9++;
                  var12++;
                  continue L9;
                } else {
                  L16: {
                    if (param3) {
                      break L16;
                    } else {
                      if (0 >= ((kd) this).field_a[var9]) {
                        break L16;
                      } else {
                        var15_int = ((kd) this).field_a[var9];
                        if (var15_int <= 0) {
                          break L16;
                        } else {
                          L17: {
                            if (var15_int < 25) {
                              var15_int = var15_int >> 1;
                              break L17;
                            } else {
                              var15_int = -var15_int + 50 >> 1;
                              break L17;
                            }
                          }
                          ul.d(var13 - ol.field_e, -ol.field_e + var14, ol.field_d, ol.field_d, 16711935, var15_int << 1);
                          break L16;
                        }
                      }
                    }
                  }
                  L18: {
                    if (0 != ((kd) this).field_o[var9]) {
                      break L18;
                    } else {
                      if (param3) {
                        break L18;
                      } else {
                        var9++;
                        var12++;
                        continue L9;
                      }
                    }
                  }
                  L19: {
                    if (((kd) this).field_o[var9] == 4) {
                      break L19;
                    } else {
                      if (((kd) this).field_o[var9] == 3) {
                        break L19;
                      } else {
                        if (param3) {
                          break L19;
                        } else {
                          if (192 >= ((kd) this).field_g[var9]) {
                            L20: {
                              if (((kd) this).field_j[var9] < mf.field_b.length) {
                                mf.field_b[((kd) this).field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            if (((kd) this).field_g[var9] > 0) {
                              mf.field_b[27].d(var13, var14, ol.field_e, ol.field_e, 64 - -((kd) this).field_g[var9]);
                              var9++;
                              var12++;
                              continue L9;
                            } else {
                              var9++;
                              var12++;
                              continue L9;
                            }
                          } else {
                            mf.field_b[27].b(var13, var14, ol.field_e, ol.field_e);
                            var9++;
                            var12++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                  L21: {
                    if (((kd) this).field_o[var9] != 3) {
                      break L21;
                    } else {
                      if (!param3) {
                        if (bc.field_q.length > ((kd) this).field_j[var9]) {
                          bc.field_q[((kd) this).field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                          var9++;
                          var12++;
                          continue L9;
                        } else {
                          var9++;
                          var12++;
                          continue L9;
                        }
                      } else {
                        break L21;
                      }
                    }
                  }
                  if (((kd) this).field_o[var9] == 4) {
                    if (param3) {
                      if (((kd) this).field_j[var9] < bc.field_q.length) {
                        bc.field_q[((kd) this).field_j[var9]].b(var13, var14, ol.field_e, ol.field_e);
                        var9++;
                        var12++;
                        continue L9;
                      } else {
                        var9++;
                        var12++;
                        continue L9;
                      }
                    } else {
                      var9++;
                      var12++;
                      continue L9;
                    }
                  } else {
                    var9++;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        j var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 == 100) {
          L0: {
            if (((kd) this).field_r.b(param0 ^ 100)) {
              ((kd) this).field_k = 0;
              var3_int = 0;
              L1: while (true) {
                if (((kd) this).field_i <= var3_int) {
                  break L0;
                } else {
                  L2: {
                    ((kd) this).field_l[var3_int] = ((kd) this).field_u[var3_int];
                    ((kd) this).field_u[var3_int] = 2147483647;
                    if (-1 <= ((kd) this).field_v[var3_int]) {
                      break L2;
                    } else {
                      ((kd) this).field_v[var3_int] = ((kd) this).field_v[var3_int] - 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 >= ((kd) this).field_g[var3_int]) {
                      break L3;
                    } else {
                      ((kd) this).field_g[var3_int] = ((kd) this).field_g[var3_int] - 1;
                      break L3;
                    }
                  }
                  if (((kd) this).field_o[var3_int] == 6) {
                    ((kd) this).field_r.a(new j(var3_int, 0, ((kd) this).field_u), (byte) -83);
                    ((kd) this).field_k = ((kd) this).field_k + 1;
                    var3_int++;
                    continue L1;
                  } else {
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          var2 = 0;
          var6 = 0;
          var3_int = var6;
          L4: while (true) {
            if (var6 >= ((kd) this).field_i) {
              L5: while (true) {
                L6: {
                  if (((kd) this).field_r.b(param0 ^ 100)) {
                    break L6;
                  } else {
                    var2++;
                    if (750 < var2) {
                      break L6;
                    } else {
                      var3 = ((kd) this).field_r.a(-2);
                      var4 = var3.field_a;
                      if (((kd) this).field_o[var4] == 3) {
                        continue L5;
                      } else {
                        if (4 == ((kd) this).field_o[var4]) {
                          continue L5;
                        } else {
                          L7: {
                            if (var4 <= ((kd) this).field_c) {
                              break L7;
                            } else {
                              if (((kd) this).field_u[var4 - ((kd) this).field_c] <= var3.field_d + this.a(var4 - ((kd) this).field_c, (byte) 69)) {
                                break L7;
                              } else {
                                ((kd) this).field_p.a(new j(var4 + -((kd) this).field_c, var3.field_d - -this.a(-((kd) this).field_c + var4, (byte) 86), ((kd) this).field_u), (byte) -83);
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var4 >= -((kd) this).field_c + (((kd) this).field_i - 1)) {
                              break L8;
                            } else {
                              if (((kd) this).field_u[((kd) this).field_c + var4] > var3.field_d + this.a(var4 + ((kd) this).field_c, (byte) 57)) {
                                ((kd) this).field_p.a(new j(var4 + ((kd) this).field_c, var3.field_d + this.a(var4 + ((kd) this).field_c, (byte) 66), ((kd) this).field_u), (byte) -83);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (1 >= var4) {
                              break L9;
                            } else {
                              if (((kd) this).field_u[var4 - 1] > var3.field_d - -this.a(-1 + var4, (byte) 48)) {
                                ((kd) this).field_p.a(new j(var4 + -1, var3.field_d - -this.a(-1 + var4, (byte) 48), ((kd) this).field_u), (byte) -83);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (-2 + ((kd) this).field_i <= var4) {
                            continue L5;
                          } else {
                            if (((kd) this).field_u[1 + var4] <= var3.field_d - -this.a(var4 + 1, (byte) 72)) {
                              continue L5;
                            } else {
                              ((kd) this).field_p.a(new j(var4 - -1, var3.field_d + this.a(var4 - -1, (byte) 72), ((kd) this).field_u), (byte) -83);
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var2 < 750) {
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (!((kd) this).field_r.b(param0 + -100)) {
                    break L11;
                  } else {
                    ((kd) this).field_r = ((kd) this).field_p;
                    ((kd) this).field_p = new cg(((kd) this).field_r.field_a);
                    break L11;
                  }
                }
                return;
              }
            } else {
              if (((kd) this).field_a[var6] > 0) {
                ((kd) this).field_a[var6] = ((kd) this).field_a[var6] - 1;
                var6++;
                continue L4;
              } else {
                var6++;
                continue L4;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2) {
        int var4 = 0;
        if (param1) {
          L0: {
            var4 = param0 - -(param2 * ((kd) this).field_c);
            if (var4 < 0) {
              break L0;
            } else {
              if (((kd) this).field_i <= var4) {
                break L0;
              } else {
                if (((kd) this).field_o[var4] != 4) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        int var4 = 27 % ((param0 - -24) / 63);
        int[] var7 = ((kd) this).field_s;
        int[] var3 = var7;
        ((kd) this).field_s = new int[var7.length - -1];
        for (var5 = 0; var7.length > var5; var5++) {
            ((kd) this).field_s[var5] = var7[var5];
        }
        ((kd) this).field_s[var3.length] = param1;
    }

    private final int a(int param0, byte param1) {
        if (param1 <= 38) {
            jc discarded$0 = kd.a(false);
        }
        return m.field_d[((kd) this).field_o[param0]] - -(!((kd) this).field_e[param0] ? 0 : 25000) - -((((kd) this).field_v[param0] + ((kd) this).field_g[param0]) * ((kd) this).field_n);
    }

    public static void b(byte param0) {
        int var1 = -87;
        field_q = null;
        field_f = null;
        field_b = null;
    }

    final static jc a(boolean param0) {
        if (!(null != ve.field_O)) {
            ve.field_O = new jc(pc.field_bb, 20, 0, 0, 0, 11579568, -1, 0, 0, pc.field_bb.field_H, -1, 2147483647, true);
        }
        return ve.field_O;
    }

    kd(hj param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        ((kd) this).field_n = 0;
        try {
          L0: {
            ((kd) this).field_t = param0.field_k;
            ((kd) this).field_c = param0.field_o;
            ((kd) this).field_i = ((kd) this).field_t * ((kd) this).field_c;
            ((kd) this).field_a = new int[((kd) this).field_i];
            ((kd) this).field_g = new int[((kd) this).field_i];
            ((kd) this).field_u = new int[((kd) this).field_i];
            ((kd) this).field_o = new int[((kd) this).field_i];
            ((kd) this).field_e = new boolean[((kd) this).field_i];
            ((kd) this).field_j = new int[((kd) this).field_i];
            ((kd) this).field_m = new boolean[((kd) this).field_i];
            ((kd) this).field_v = new int[((kd) this).field_i];
            ((kd) this).field_l = new int[((kd) this).field_i];
            ((kd) this).field_r = new cg(16);
            ((kd) this).field_p = new cg(16);
            ((kd) this).field_s = new int[]{};
            var2_int = ((kd) this).field_o.length;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int) {
                    ((kd) this).a((byte) 100);
                    L3: while (true) {
                      if (((kd) this).field_r.b(0)) {
                        break L0;
                      } else {
                        ((kd) this).a((byte) 100);
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      L5: {
                        if (0 == ((kd) this).field_o[var3]) {
                          break L5;
                        } else {
                          if (((kd) this).field_o[var3] != 8) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((kd) this).field_j[var3] = (11 - -(int)(3.0 * Math.random())) * 8 + (int)(Math.random() * 2.0);
                      break L4;
                    }
                    L6: {
                      L7: {
                        if (((kd) this).field_o[var3] == 1) {
                          break L7;
                        } else {
                          if (10 != ((kd) this).field_o[var3]) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      ((kd) this).field_j[var3] = 27;
                      break L6;
                    }
                    L8: {
                      if (((kd) this).field_o[var3] != 2) {
                        break L8;
                      } else {
                        ((kd) this).field_j[var3] = 35;
                        break L8;
                      }
                    }
                    L9: {
                      if (((kd) this).field_o[var3] != 3) {
                        break L9;
                      } else {
                        L10: {
                          ((kd) this).field_j[var3] = 0;
                          if (-((kd) this).field_c + var3 > -1) {
                            break L10;
                          } else {
                            if (-4 == ((kd) this).field_o[var3 - ((kd) this).field_c]) {
                              break L10;
                            } else {
                              ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 1;
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (1 + var3 >= ((kd) this).field_i) {
                            break L11;
                          } else {
                            if (((kd) this).field_o[var3 - -1] == 3) {
                              break L11;
                            } else {
                              ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 2;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (0 > var3 - 1) {
                            break L12;
                          } else {
                            if (((kd) this).field_o[-1 + var3] == 3) {
                              break L12;
                            } else {
                              ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 16;
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (((kd) this).field_i <= ((kd) this).field_c + var3) {
                            break L13;
                          } else {
                            if (((kd) this).field_o[((kd) this).field_c + var3] == 3) {
                              break L13;
                            } else {
                              ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 32;
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (var3 + -((kd) this).field_c - 1 < 0) {
                            break L14;
                          } else {
                            if ((17 & ((kd) this).field_j[var3]) != 0) {
                              break L14;
                            } else {
                              if (((kd) this).field_o[-1 + var3 + -((kd) this).field_c] == 3) {
                                break L14;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 4;
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          if (1 + -((kd) this).field_c + var3 < 0) {
                            break L15;
                          } else {
                            if ((3 & ((kd) this).field_j[var3]) != 0) {
                              break L15;
                            } else {
                              if (((kd) this).field_o[-((kd) this).field_c + (var3 + 1)] == 3) {
                                break L15;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 8;
                                break L15;
                              }
                            }
                          }
                        }
                        L16: {
                          if (((kd) this).field_i <= var3 - (-((kd) this).field_c - 1)) {
                            break L16;
                          } else {
                            if (0 != (34 & ((kd) this).field_j[var3])) {
                              break L16;
                            } else {
                              if (3 == ((kd) this).field_o[var3 - -((kd) this).field_c - -1]) {
                                break L16;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 64;
                                break L16;
                              }
                            }
                          }
                        }
                        if (((kd) this).field_c + var3 - 1 >= ((kd) this).field_i) {
                          break L9;
                        } else {
                          if (0 != (((kd) this).field_j[var3] & 48)) {
                            break L9;
                          } else {
                            if (((kd) this).field_o[-1 + var3 - -((kd) this).field_c] == 3) {
                              break L9;
                            } else {
                              ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 128;
                              break L9;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (((kd) this).field_o[var3] != 4) {
                        break L17;
                      } else {
                        if (((kd) this).field_c >= var3) {
                          break L17;
                        } else {
                          if (var3 >= -((kd) this).field_c + ((kd) this).field_i + -1) {
                            break L17;
                          } else {
                            L18: {
                              ((kd) this).field_j[var3] = 0;
                              if (((kd) this).field_o[var3 - ((kd) this).field_c] == -5) {
                                break L18;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 1;
                                break L18;
                              }
                            }
                            L19: {
                              if (-5 == ((kd) this).field_o[var3 + 1]) {
                                break L19;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 2;
                                break L19;
                              }
                            }
                            L20: {
                              if (((kd) this).field_o[-1 + var3] == 4) {
                                break L20;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 16;
                                break L20;
                              }
                            }
                            L21: {
                              if (((kd) this).field_o[var3 - -((kd) this).field_c] == 4) {
                                break L21;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 32;
                                break L21;
                              }
                            }
                            L22: {
                              if ((((kd) this).field_j[var3] & 17) != 0) {
                                break L22;
                              } else {
                                if (((kd) this).field_o[-1 + (var3 + -((kd) this).field_c)] == -5) {
                                  break L22;
                                } else {
                                  ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 4;
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (-1 != (((kd) this).field_j[var3] & 3)) {
                                break L23;
                              } else {
                                if (((kd) this).field_o[1 + -((kd) this).field_c + var3] == 4) {
                                  break L23;
                                } else {
                                  ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 8;
                                  break L23;
                                }
                              }
                            }
                            L24: {
                              if ((34 & ((kd) this).field_j[var3]) != 0) {
                                break L24;
                              } else {
                                if (((kd) this).field_o[var3 + ((kd) this).field_c - -1] == -5) {
                                  break L24;
                                } else {
                                  ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 64;
                                  break L24;
                                }
                              }
                            }
                            if (-1 != (((kd) this).field_j[var3] & 48)) {
                              break L17;
                            } else {
                              if (-5 == ((kd) this).field_o[-1 + (((kd) this).field_c + var3)]) {
                                break L17;
                              } else {
                                ((kd) this).field_j[var3] = ((kd) this).field_j[var3] + 128;
                                break L17;
                              }
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      if (-6 != ((kd) this).field_o[var3]) {
                        break L25;
                      } else {
                        L26: {
                          if (((kd) this).field_o[var3 + -1] != 5) {
                            break L26;
                          } else {
                            if (((kd) this).field_o[var3 - -1] == 5) {
                              ((kd) this).field_j[var3 + -1] = 43;
                              ((kd) this).field_j[var3] = 44;
                              ((kd) this).field_j[1 + var3] = 45;
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (((kd) this).field_o[var3 + -((kd) this).field_c] != 5) {
                            break L27;
                          } else {
                            if (((kd) this).field_o[var3 + ((kd) this).field_c] != 5) {
                              break L27;
                            } else {
                              ((kd) this).field_j[-((kd) this).field_c + var3] = 74;
                              ((kd) this).field_j[var3] = 82;
                              ((kd) this).field_j[var3 - -((kd) this).field_c] = 90;
                              break L25;
                            }
                          }
                        }
                        if (((kd) this).field_o[var3 - 1] == 5) {
                          break L25;
                        } else {
                          if (-6 == ((kd) this).field_o[var3 - -1]) {
                            break L25;
                          } else {
                            if (-6 == ((kd) this).field_o[-((kd) this).field_c + var3]) {
                              break L25;
                            } else {
                              if (5 == ((kd) this).field_o[var3 + ((kd) this).field_c]) {
                                break L25;
                              } else {
                                ((kd) this).field_o[var3] = 11;
                                break L25;
                              }
                            }
                          }
                        }
                      }
                    }
                    L28: {
                      if (((kd) this).field_o[var3] != 6) {
                        break L28;
                      } else {
                        if (((kd) this).field_o[var3 - 1] == 6) {
                          break L28;
                        } else {
                          if (((kd) this).field_o[var3 + -((kd) this).field_c] == 6) {
                            break L28;
                          } else {
                            var4 = 0;
                            L29: while (true) {
                              if (5 <= var4) {
                                break L28;
                              } else {
                                var5 = 0;
                                L30: while (true) {
                                  if (var5 >= 5) {
                                    var4++;
                                    continue L29;
                                  } else {
                                    ((kd) this).field_j[((kd) this).field_c * var5 + (var3 + var4)] = var4 + (6 + var5) * 8 - -3;
                                    var5++;
                                    continue L30;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              } else {
                L31: {
                  if (16711680 != param0.field_v[var3]) {
                    break L31;
                  } else {
                    ((kd) this).field_o[var3] = 0;
                    break L31;
                  }
                }
                L32: {
                  if (param0.field_v[var3] != 65535) {
                    break L32;
                  } else {
                    ((kd) this).field_o[var3] = 1;
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_v[var3] != 255) {
                    break L33;
                  } else {
                    ((kd) this).field_o[var3] = 2;
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_v[var3] != 65280) {
                    break L34;
                  } else {
                    ((kd) this).field_o[var3] = 3;
                    break L34;
                  }
                }
                L35: {
                  if (param0.field_v[var3] != -2) {
                    break L35;
                  } else {
                    ((kd) this).field_o[var3] = 4;
                    break L35;
                  }
                }
                L36: {
                  if (-16777216 != param0.field_v[var3]) {
                    break L36;
                  } else {
                    ((kd) this).field_o[var3] = 10;
                    ((kd) this).a((byte) 90, var3);
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_v[var3] != 16776960) {
                    break L37;
                  } else {
                    ((kd) this).field_o[var3] = 6;
                    ((kd) this).field_k = ((kd) this).field_k + 1;
                    break L37;
                  }
                }
                ((kd) this).field_j[var3] = -1;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var2 = decompiledCaughtException;
            stackOut_106_0 = (RuntimeException) var2;
            stackOut_106_1 = new StringBuilder().append("kd.<init>(");
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param0 == null) {
              stackOut_108_0 = (RuntimeException) (Object) stackIn_108_0;
              stackOut_108_1 = (StringBuilder) (Object) stackIn_108_1;
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L38;
            } else {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L38;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_109_0, stackIn_109_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "STORM SCRAPER";
        field_d = false;
        field_h = Math.atan2(1.0, 0.0);
        field_f = "Mouse over an icon for details";
    }
}
