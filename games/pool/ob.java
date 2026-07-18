/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ob extends jh {
    int field_s;
    gi field_G;
    ia field_B;
    dd field_z;
    boolean field_p;
    private int field_A;
    static int field_u;
    private int field_k;
    boolean field_n;
    static long field_v;
    private static int field_j;
    int[] field_h;
    boolean field_q;
    int field_w;
    int field_x;
    static int field_i;
    int field_t;
    static int[] field_y;
    private int field_r;
    private int field_o;
    static int[] field_m;
    boolean field_l;
    int field_C;
    int field_E;
    private static int field_D;
    static int field_F;

    int b(byte param0, int param1) {
        if (param0 != 6) {
            return 57;
        }
        return ((ob) this).field_x - -(param1 * ((ob) this).field_s);
    }

    final void a(boolean param0) {
        int var2 = 0;
        if (param0) {
            ((ob) this).field_s = -3;
        }
        if (((ob) this).field_l) {
            if (((ob) this).field_p) {
                pn.field_l.a(0, 0);
            } else {
                uk.field_b[ie.field_h].a(0, 0);
                ti.field_g = ti.field_g + 1;
                if (!(0 >= ti.field_g)) {
                    var2 = (ie.field_h - -1) % uk.field_b.length;
                    uk.field_b[var2].a(0, 0, ti.field_g);
                    if (ti.field_g > 255) {
                        ie.field_h = var2;
                        ti.field_g = -750;
                    }
                }
            }
        }
        if (!(!((ob) this).field_p)) {
            ja.a(((ob) this).field_k, ((ob) this).field_A, true, ((ob) this).field_r, ((ob) this).field_o);
        }
        if (!(null == ((ob) this).field_z)) {
            ((ob) this).field_z.c(qh.field_l + -((ob) this).field_z.field_z >> 1, 10);
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        dd var10_ref_dd = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        dd[] var16 = null;
        int[] var20 = null;
        int stackIn_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        L0: {
          var15 = Pool.field_O;
          var3 = ((ob) this).field_h[param1];
          var4 = nk.field_f[var3];
          if (var3 != 8) {
            break L0;
          } else {
            L1: {
              if (((ob) this).field_w == 0) {
                break L1;
              } else {
                if (((ob) this).field_w == 21) {
                  break L1;
                } else {
                  if (7 != ((ob) this).field_w) {
                    if (((ob) this).field_w != 6) {
                      L2: {
                        if (8 == ((ob) this).field_w) {
                          break L2;
                        } else {
                          if (((ob) this).field_w == 3) {
                            break L2;
                          } else {
                            if (((ob) this).field_w == 24) {
                              break L2;
                            } else {
                              L3: {
                                if (((ob) this).field_w == 10) {
                                  break L3;
                                } else {
                                  if (11 == ((ob) this).field_w) {
                                    break L3;
                                  } else {
                                    if (((ob) this).field_w == 12) {
                                      break L3;
                                    } else {
                                      if (((ob) this).field_w == 9) {
                                        break L3;
                                      } else {
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                              var4 = vc.field_N;
                              break L0;
                            }
                          }
                        }
                      }
                      var4 = ld.field_f;
                      break L0;
                    } else {
                      var4 = nk.field_f[38];
                      break L0;
                    }
                  } else {
                    var4 = nk.field_f[37];
                    break L0;
                  }
                }
              }
            }
            var4 = nk.field_f[7];
            break L0;
          }
        }
        var5 = ((ob) this).d(0, param1);
        var6 = ((ob) this).a(false, param1);
        var7 = ((ob) this).b((byte) 6, param1);
        if (param0) {
          L4: {
            var8 = null;
            if (!((ob) this).f(-13676, param1)) {
              break L4;
            } else {
              var9 = -var5 + var6;
              var10 = ((ob) this).a((byte) 69, param1);
              var16 = ((ob) this).b(param1, -34);
              nj.a(var16, (byte) 6, var9, var5, var7, var10);
              break L4;
            }
          }
          L5: {
            L6: {
              var9 = this.c(param1, -4);
              if (jq.field_e[param1] != var4) {
                break L6;
              } else {
                if (~var9 != ~mc.field_h[param1]) {
                  break L6;
                } else {
                  break L5;
                }
              }
            }
            var10_ref_dd = ((ob) this).a(var4, var9, 0, param1);
            fm.field_G[param1] = var10_ref_dd;
            jq.field_e[param1] = var4;
            mc.field_h[param1] = var9;
            break L5;
          }
          L7: {
            L8: {
              var10 = fm.field_G[param1].field_z;
              if (20 == var3) {
                break L8;
              } else {
                if (var3 == 21) {
                  break L8;
                } else {
                  break L7;
                }
              }
            }
            var10 = pq.field_H - -120;
            break L7;
          }
          L9: {
            L10: {
              var11 = -var10 + (var6 + var5) >> 1;
              var12 = ((ob) this).a((byte) 69, param1);
              fm.field_G[param1].c(var11, var7 + ((ob) this).a(param1, 6402));
              ((ob) this).a(param1, var6, var5, var12, -24267, var7);
              if (var3 == 20) {
                break L10;
              } else {
                if (var3 != 21) {
                  break L9;
                } else {
                  break L10;
                }
              }
            }
            var11 = var11 + pq.field_H;
            var20 = al.field_B[0].b(0, 0);
            var14 = var11;
            L11: while (true) {
              if (~var14 < ~(120 + var11)) {
                L12: {
                  if (20 == var3) {
                    stackOut_38_0 = ec.field_b * 120 / 256;
                    stackIn_39_0 = stackOut_38_0;
                    break L12;
                  } else {
                    stackOut_37_0 = 120 * nk.field_h / 256;
                    stackIn_39_0 = stackOut_37_0;
                    break L12;
                  }
                }
                var14 = stackIn_39_0;
                wp.field_a.c(-(wp.field_a.field_z >> 1) + (var14 + var11), -4 + ((wp.field_a.field_A >> 1) + var7));
                break L9;
              } else {
                qh.a(var14 << 4, -2 + var12 / 2 + var7 << 4, 16 + -var11 + var14, var20.length + -1, var20);
                var14 += 20;
                continue L11;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    dd a(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        dd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2 == 0) {
              stackOut_3_0 = dq.a(param1, 0, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dd) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ob.PA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    int a(int param0, int param1) {
        if (param1 != 6402) {
            field_F = 22;
        }
        return -2;
    }

    dd[] b(int param0, int param1) {
        int var3 = 0;
        if (param0 != ((ob) this).field_B.field_h) {
          L0: {
            if (param1 == -34) {
              break L0;
            } else {
              int discarded$2 = ((ob) this).a((byte) -13, 83);
              break L0;
            }
          }
          L1: {
            var3 = ((ob) this).field_h[param0];
            if (var3 != 17) {
              L2: {
                if (var3 != 18) {
                  break L2;
                } else {
                  if (1 != eo.field_Lb) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              return rm.field_g;
            } else {
              break L1;
            }
          }
          return ln.field_s;
        } else {
          return ln.field_s;
        }
    }

    void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (ub.field_p) {
            break L0;
          } else {
            if (br.field_H) {
              break L0;
            } else {
              L1: while (true) {
                if (!n.h(param0 + 128)) {
                  ((ob) this).field_B.a(this.b(-6564, ua.field_o, lq.field_W), this.b(-6564, gg.field_f, wn.field_i), param0 ^ -109);
                  if (-1 != ((ob) this).field_B.field_h) {
                    ((ob) this).b(-16470, true, ((ob) this).field_B.field_h);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  if (qi.field_a == 13) {
                    ((ob) this).a((byte) -30);
                    continue L1;
                  } else {
                    ((ob) this).e(-34);
                    if (((ob) this).field_B.field_h != -1) {
                      ((ob) this).b(-16470, false, ((ob) this).field_B.field_h);
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == -1) {
            break L2;
          } else {
            ((ob) this).b(-44, true);
            break L2;
          }
        }
    }

    public static void d(byte param0) {
        field_y = null;
        if (param0 <= 101) {
            Object var2 = null;
            ob.a(114, (of) null, 91, 19, -106, 18, (im) null);
        }
        field_m = null;
    }

    final void c(int param0, boolean param1) {
        if (param0 != 12) {
            return;
        }
        if (1 == er.field_W) {
            this.a(0, param1, 0);
        } else {
            fq.a(-3405, 7, 0, param1);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ob) this).field_k = param0;
        ((ob) this).field_r = param2;
        ((ob) this).field_o = param1;
        ((ob) this).field_A = param3;
        if (param4 != 0) {
            int discarded$0 = this.b(-68, -48, -6);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param2 != 0) {
            return;
        }
        sq.field_b = -3;
        re.field_f = param0;
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        var4 = -1;
        if (param0 == -6564) {
          var5 = -1;
          var7 = 0;
          L0: while (true) {
            if (var7 >= ((ob) this).field_h.length) {
              return var4;
            } else {
              if (((ob) this).a(var7, true)) {
                var8 = ((ob) this).b((byte) 6, var7);
                var9 = ((ob) this).d(param0 ^ -6564, var7);
                var10 = ((ob) this).a(false, var7);
                var11 = ((ob) this).a((byte) 69, var7) + var8;
                if (param2 >= var9) {
                  if (var10 > param2) {
                    if (param1 >= var8) {
                      if (var11 > param1) {
                        L1: {
                          var6 = param2 + -(var10 + var9 >> 1);
                          if (var6 >= 0) {
                            break L1;
                          } else {
                            var6 = -var6;
                            break L1;
                          }
                        }
                        L2: {
                          var12 = -(var8 + var11 >> 1) + param1;
                          stackOut_16_0 = var6;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (var12 >= 0) {
                            stackOut_18_0 = stackIn_18_0;
                            stackOut_18_1 = var12;
                            stackIn_19_0 = stackOut_18_0;
                            stackIn_19_1 = stackOut_18_1;
                            break L2;
                          } else {
                            stackOut_17_0 = stackIn_17_0;
                            stackOut_17_1 = -var12;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L2;
                          }
                        }
                        L3: {
                          var6 = stackIn_19_0 + stackIn_19_1;
                          if (var5 < 0) {
                            break L3;
                          } else {
                            if (var6 < var5) {
                              break L3;
                            } else {
                              var7++;
                              continue L0;
                            }
                          }
                        }
                        var5 = var6;
                        var4 = var7;
                        var7++;
                        continue L0;
                      } else {
                        var7++;
                        continue L0;
                      }
                    } else {
                      var7++;
                      continue L0;
                    }
                  } else {
                    var7++;
                    continue L0;
                  }
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return -23;
        }
    }

    void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_82_0 = 0;
        String[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        String[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        String[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        String stackIn_85_2 = null;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        ob[] stackIn_150_2 = null;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        ob[] stackIn_151_2 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        ob[] stackIn_152_2 = null;
        int stackIn_152_3 = 0;
        int stackIn_211_0 = 0;
        int stackIn_211_1 = 0;
        int stackIn_212_0 = 0;
        int stackIn_212_1 = 0;
        int stackIn_213_0 = 0;
        int stackIn_213_1 = 0;
        int stackIn_213_2 = 0;
        int stackIn_217_0 = 0;
        int stackIn_217_1 = 0;
        int stackIn_218_0 = 0;
        int stackIn_218_1 = 0;
        int stackIn_219_0 = 0;
        int stackIn_219_1 = 0;
        int stackIn_219_2 = 0;
        int stackIn_223_0 = 0;
        int stackIn_223_1 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_225_0 = 0;
        int stackIn_225_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_231_0 = 0;
        int stackIn_231_1 = 0;
        int stackIn_232_0 = 0;
        int stackIn_232_1 = 0;
        int stackIn_233_0 = 0;
        int stackIn_233_1 = 0;
        int stackIn_233_2 = 0;
        int stackIn_235_0 = 0;
        int stackIn_235_1 = 0;
        int stackIn_236_0 = 0;
        int stackIn_236_1 = 0;
        int stackIn_237_0 = 0;
        int stackIn_237_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_239_0 = 0;
        int stackIn_239_1 = 0;
        int stackIn_240_0 = 0;
        int stackIn_240_1 = 0;
        int stackIn_241_0 = 0;
        int stackIn_241_1 = 0;
        int stackIn_241_2 = 0;
        int stackOut_210_0 = 0;
        int stackOut_210_1 = 0;
        int stackOut_212_0 = 0;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        int stackOut_211_0 = 0;
        int stackOut_211_1 = 0;
        int stackOut_211_2 = 0;
        int stackOut_216_0 = 0;
        int stackOut_216_1 = 0;
        int stackOut_218_0 = 0;
        int stackOut_218_1 = 0;
        int stackOut_218_2 = 0;
        int stackOut_217_0 = 0;
        int stackOut_217_1 = 0;
        int stackOut_217_2 = 0;
        int stackOut_238_0 = 0;
        int stackOut_238_1 = 0;
        int stackOut_240_0 = 0;
        int stackOut_240_1 = 0;
        int stackOut_240_2 = 0;
        int stackOut_239_0 = 0;
        int stackOut_239_1 = 0;
        int stackOut_239_2 = 0;
        int stackOut_234_0 = 0;
        int stackOut_234_1 = 0;
        int stackOut_236_0 = 0;
        int stackOut_236_1 = 0;
        int stackOut_236_2 = 0;
        int stackOut_235_0 = 0;
        int stackOut_235_1 = 0;
        int stackOut_235_2 = 0;
        int stackOut_230_0 = 0;
        int stackOut_230_1 = 0;
        int stackOut_232_0 = 0;
        int stackOut_232_1 = 0;
        int stackOut_232_2 = 0;
        int stackOut_231_0 = 0;
        int stackOut_231_1 = 0;
        int stackOut_231_2 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_224_0 = 0;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_223_2 = 0;
        int stackOut_149_0 = 0;
        int stackOut_149_1 = 0;
        ob[] stackOut_149_2 = null;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        ob[] stackOut_151_2 = null;
        int stackOut_151_3 = 0;
        int stackOut_150_0 = 0;
        int stackOut_150_1 = 0;
        ob[] stackOut_150_2 = null;
        int stackOut_150_3 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        String[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        String[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        String stackOut_84_2 = null;
        String[] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        String stackOut_83_2 = null;
        var9 = Pool.field_O;
        if (param0 == -16470) {
          L0: {
            if (!((ob) this).field_B.field_a) {
              break L0;
            } else {
              kf discarded$2 = vj.a((byte) -27, il.field_c[0]);
              break L0;
            }
          }
          L1: {
            L2: {
              L3: {
                var4 = ((ob) this).field_h[param2];
                var6 = var4;
                if (var6 != 0) {
                  if (var6 != 38) {
                    if (37 != var6) {
                      if (39 == var6) {
                        if (((ob) this).field_B.b((byte) 74)) {
                          fq.a(-3405, 1, 0, param1);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (var6 != 49) {
                          if (var6 == 29) {
                            if (!((ob) this).field_B.b((byte) 58)) {
                              break L2;
                            } else {
                              this.a(0, param1, 0);
                              break L1;
                            }
                          } else {
                            if (var6 != 30) {
                              if (var6 != 31) {
                                if (32 != var6) {
                                  if (var6 == 33) {
                                    if (!((ob) this).field_B.b((byte) 73)) {
                                      break L2;
                                    } else {
                                      this.a(4, param1, 0);
                                      break L1;
                                    }
                                  } else {
                                    if (var6 != 34) {
                                      if (var6 == 35) {
                                        if (!((ob) this).field_B.b((byte) 125)) {
                                          break L2;
                                        } else {
                                          this.a(6, param1, 0);
                                          break L1;
                                        }
                                      } else {
                                        if (var6 == 36) {
                                          if (((ob) this).field_B.b((byte) 108)) {
                                            this.a(7, param1, 0);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          if (var6 != 40) {
                                            if (var6 != 41) {
                                              if (var6 == 42) {
                                                if (!((ob) this).field_B.b((byte) 84)) {
                                                  break L2;
                                                } else {
                                                  sq.field_b = -6;
                                                  vh.field_Ab = so.field_g[2];
                                                  er.field_W = 3;
                                                  break L1;
                                                }
                                              } else {
                                                if (43 != var6) {
                                                  if (var6 == 50) {
                                                    if (!((ob) this).field_B.b((byte) 90)) {
                                                      break L2;
                                                    } else {
                                                      un.field_e = 0;
                                                      sq.field_b = -8;
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (var6 != 51) {
                                                      if (1 == var6) {
                                                        if (!((ob) this).field_B.b((byte) 76)) {
                                                          break L2;
                                                        } else {
                                                          if (hk.b(107)) {
                                                            bl.field_x = true;
                                                            nk.a(pl.field_d, -4, (byte) 82);
                                                            break L1;
                                                          } else {
                                                            var6 = param1 ? 1 : 0;
                                                            fq.a(-3405, -4, sq.field_b, var6 != 0);
                                                            break L1;
                                                          }
                                                        }
                                                      } else {
                                                        L4: {
                                                          if (var6 == 62) {
                                                            break L4;
                                                          } else {
                                                            if (var6 == 2) {
                                                              break L4;
                                                            } else {
                                                              if (var6 != 7) {
                                                                if (var6 != 24) {
                                                                  if (var6 != 22) {
                                                                    if (var6 == 5) {
                                                                      if (((ob) this).field_B.b((byte) 67)) {
                                                                        var6 = param1 ? 1 : 0;
                                                                        fq.a(-3405, 13, sq.field_b, var6 != 0);
                                                                        break L1;
                                                                      } else {
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      if (47 != var6) {
                                                                        if (8 != var6) {
                                                                          if (var6 == 4) {
                                                                            if (((ob) this).field_B.b((byte) 52)) {
                                                                              var6 = param1 ? 1 : 0;
                                                                              fq.a(-3405, 15, sq.field_b, var6 != 0);
                                                                              break L1;
                                                                            } else {
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            if (var6 != 48) {
                                                                              if (var6 == 20) {
                                                                                L5: {
                                                                                  var5 = 0;
                                                                                  if (!((ob) this).field_B.d(123)) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    if (ec.field_b > 0) {
                                                                                      ka.a(true, 0);
                                                                                      var5 = 1;
                                                                                      break L5;
                                                                                    } else {
                                                                                      break L5;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L6: {
                                                                                  if (!((ob) this).field_B.a(103)) {
                                                                                    break L6;
                                                                                  } else {
                                                                                    if (256 > ec.field_b) {
                                                                                      var5 = 1;
                                                                                      ka.a(true, 256);
                                                                                      break L6;
                                                                                    } else {
                                                                                      break L6;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L7: {
                                                                                  if (!((ob) this).field_B.c((byte) 111)) {
                                                                                    break L7;
                                                                                  } else {
                                                                                    L8: {
                                                                                      var6 = ((ob) this).d(0, param2) + (((ob) this).a(false, param2) - -pq.field_H) - 120 >> 1;
                                                                                      var7 = -var6 + wn.field_i;
                                                                                      var8 = 256 * var7 / 120;
                                                                                      if (0 >= var8) {
                                                                                        ka.a(true, 0);
                                                                                        break L8;
                                                                                      } else {
                                                                                        if (var8 < 256) {
                                                                                          ka.a(true, var8);
                                                                                          break L8;
                                                                                        } else {
                                                                                          ka.a(true, 256);
                                                                                          break L8;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var5 = 1;
                                                                                    break L7;
                                                                                  }
                                                                                }
                                                                                L9: {
                                                                                  if (!((ob) this).field_B.f(-20421)) {
                                                                                    break L9;
                                                                                  } else {
                                                                                    if (ec.field_b <= 0) {
                                                                                      break L9;
                                                                                    } else {
                                                                                      var5 = 1;
                                                                                      ve.b((byte) -14);
                                                                                      break L9;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L10: {
                                                                                  if (!((ob) this).field_B.c(-1)) {
                                                                                    break L10;
                                                                                  } else {
                                                                                    if (ec.field_b < 256) {
                                                                                      ud.f(param0 + 16245);
                                                                                      var5 = 1;
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L10;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var5 != 0) {
                                                                                  L11: {
                                                                                    if (!((ob) this).field_B.c((byte) 103)) {
                                                                                      break L11;
                                                                                    } else {
                                                                                      if (~eo.field_Tb >= ~field_D) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        break L11;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  kf discarded$3 = vj.a((byte) -27, il.field_c[2]);
                                                                                  field_D = eo.field_Tb + 20;
                                                                                  break L1;
                                                                                } else {
                                                                                  break L1;
                                                                                }
                                                                              } else {
                                                                                if (var6 == 21) {
                                                                                  L12: {
                                                                                    if (!((ob) this).field_B.d(121)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      ap.a(0, 3815994);
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                  L13: {
                                                                                    if (((ob) this).field_B.a(103)) {
                                                                                      ap.a(256, 3815994);
                                                                                      break L13;
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                  L14: {
                                                                                    if (!((ob) this).field_B.c((byte) 105)) {
                                                                                      break L14;
                                                                                    } else {
                                                                                      var6 = ((ob) this).d(0, param2) - -((ob) this).a(false, param2) - -pq.field_H - 120 >> 1;
                                                                                      var7 = wn.field_i - var6;
                                                                                      var8 = 256 * var7 / 120;
                                                                                      if (var8 > 0) {
                                                                                        if (var8 >= 256) {
                                                                                          ap.a(256, param0 + 3832464);
                                                                                          break L14;
                                                                                        } else {
                                                                                          ap.a(var8, 3815994);
                                                                                          break L14;
                                                                                        }
                                                                                      } else {
                                                                                        ap.a(0, 3815994);
                                                                                        break L14;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L15: {
                                                                                    if (!((ob) this).field_B.f(-20421)) {
                                                                                      break L15;
                                                                                    } else {
                                                                                      pd.a(param0 ^ -16470);
                                                                                      break L15;
                                                                                    }
                                                                                  }
                                                                                  if (((ob) this).field_B.c(-1)) {
                                                                                    oq.n(param0 + 4941);
                                                                                    break L1;
                                                                                  } else {
                                                                                    break L1;
                                                                                  }
                                                                                } else {
                                                                                  if (var6 != 6) {
                                                                                    L16: {
                                                                                      if (var6 == 61) {
                                                                                        break L16;
                                                                                      } else {
                                                                                        if (var6 == 9) {
                                                                                          break L16;
                                                                                        } else {
                                                                                          if (10 == var6) {
                                                                                            if (((ob) this).field_B.b((byte) 104)) {
                                                                                              L17: {
                                                                                                ba.field_ub.k((byte) -97);
                                                                                                var6 = param1 ? 1 : 0;
                                                                                                stackOut_210_0 = -3405;
                                                                                                stackOut_210_1 = -1;
                                                                                                stackIn_212_0 = stackOut_210_0;
                                                                                                stackIn_212_1 = stackOut_210_1;
                                                                                                stackIn_211_0 = stackOut_210_0;
                                                                                                stackIn_211_1 = stackOut_210_1;
                                                                                                if (mg.a(true)) {
                                                                                                  stackOut_212_0 = stackIn_212_0;
                                                                                                  stackOut_212_1 = stackIn_212_1;
                                                                                                  stackOut_212_2 = 21;
                                                                                                  stackIn_213_0 = stackOut_212_0;
                                                                                                  stackIn_213_1 = stackOut_212_1;
                                                                                                  stackIn_213_2 = stackOut_212_2;
                                                                                                  break L17;
                                                                                                } else {
                                                                                                  stackOut_211_0 = stackIn_211_0;
                                                                                                  stackOut_211_1 = stackIn_211_1;
                                                                                                  stackOut_211_2 = 0;
                                                                                                  stackIn_213_0 = stackOut_211_0;
                                                                                                  stackIn_213_1 = stackOut_211_1;
                                                                                                  stackIn_213_2 = stackOut_211_2;
                                                                                                  break L17;
                                                                                                }
                                                                                              }
                                                                                              fq.a(stackIn_213_0, stackIn_213_1, stackIn_213_2, var6 != 0);
                                                                                              break L1;
                                                                                            } else {
                                                                                              break L1;
                                                                                            }
                                                                                          } else {
                                                                                            if (var6 == 11) {
                                                                                              if (((ob) this).field_B.b((byte) 113)) {
                                                                                                L18: {
                                                                                                  ba.field_ub.F(1791);
                                                                                                  var6 = param1 ? 1 : 0;
                                                                                                  stackOut_216_0 = -3405;
                                                                                                  stackOut_216_1 = -1;
                                                                                                  stackIn_218_0 = stackOut_216_0;
                                                                                                  stackIn_218_1 = stackOut_216_1;
                                                                                                  stackIn_217_0 = stackOut_216_0;
                                                                                                  stackIn_217_1 = stackOut_216_1;
                                                                                                  if (mg.a(true)) {
                                                                                                    stackOut_218_0 = stackIn_218_0;
                                                                                                    stackOut_218_1 = stackIn_218_1;
                                                                                                    stackOut_218_2 = 21;
                                                                                                    stackIn_219_0 = stackOut_218_0;
                                                                                                    stackIn_219_1 = stackOut_218_1;
                                                                                                    stackIn_219_2 = stackOut_218_2;
                                                                                                    break L18;
                                                                                                  } else {
                                                                                                    stackOut_217_0 = stackIn_217_0;
                                                                                                    stackOut_217_1 = stackIn_217_1;
                                                                                                    stackOut_217_2 = 0;
                                                                                                    stackIn_219_0 = stackOut_217_0;
                                                                                                    stackIn_219_1 = stackOut_217_1;
                                                                                                    stackIn_219_2 = stackOut_217_2;
                                                                                                    break L18;
                                                                                                  }
                                                                                                }
                                                                                                fq.a(stackIn_219_0, stackIn_219_1, stackIn_219_2, var6 != 0);
                                                                                                break L1;
                                                                                              } else {
                                                                                                break L1;
                                                                                              }
                                                                                            } else {
                                                                                              if (12 != var6) {
                                                                                                if (var6 != 3) {
                                                                                                  if (var6 == 13) {
                                                                                                    if (((ob) this).field_B.b((byte) 122)) {
                                                                                                      L19: {
                                                                                                        if (!ib.field_v) {
                                                                                                          break L19;
                                                                                                        } else {
                                                                                                          ba.field_ub.F(1791);
                                                                                                          var6 = param1 ? 1 : 0;
                                                                                                          fq.a(param0 ^ 19737, -5, sq.field_b, var6 != 0);
                                                                                                          break L19;
                                                                                                        }
                                                                                                      }
                                                                                                      if (mj.field_e) {
                                                                                                        ef.a(0, 3, 11);
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        break L1;
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L1;
                                                                                                    }
                                                                                                  } else {
                                                                                                    if (var6 == 17) {
                                                                                                      if (!((ob) this).field_B.b((byte) 94)) {
                                                                                                        break L2;
                                                                                                      } else {
                                                                                                        eo.field_Lb = 0;
                                                                                                        break L1;
                                                                                                      }
                                                                                                    } else {
                                                                                                      if (18 != var6) {
                                                                                                        if (var6 != 19) {
                                                                                                          break L1;
                                                                                                        } else {
                                                                                                          if (!((ob) this).field_B.b((byte) 83)) {
                                                                                                            break L2;
                                                                                                          } else {
                                                                                                            tk.a(-1, hk.d(99));
                                                                                                            break L1;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        if (!((ob) this).field_B.b((byte) 86)) {
                                                                                                          break L2;
                                                                                                        } else {
                                                                                                          eo.field_Lb = 1;
                                                                                                          break L1;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                } else {
                                                                                                  if (!((ob) this).field_B.b((byte) 78)) {
                                                                                                    break L2;
                                                                                                  } else {
                                                                                                    if ((ba.field_ub.field_L & f.field_f) != 0) {
                                                                                                      L20: {
                                                                                                        var6 = param1 ? 1 : 0;
                                                                                                        stackOut_238_0 = -3405;
                                                                                                        stackOut_238_1 = -8;
                                                                                                        stackIn_240_0 = stackOut_238_0;
                                                                                                        stackIn_240_1 = stackOut_238_1;
                                                                                                        stackIn_239_0 = stackOut_238_0;
                                                                                                        stackIn_239_1 = stackOut_238_1;
                                                                                                        if (mg.a(true)) {
                                                                                                          stackOut_240_0 = stackIn_240_0;
                                                                                                          stackOut_240_1 = stackIn_240_1;
                                                                                                          stackOut_240_2 = 21;
                                                                                                          stackIn_241_0 = stackOut_240_0;
                                                                                                          stackIn_241_1 = stackOut_240_1;
                                                                                                          stackIn_241_2 = stackOut_240_2;
                                                                                                          break L20;
                                                                                                        } else {
                                                                                                          stackOut_239_0 = stackIn_239_0;
                                                                                                          stackOut_239_1 = stackIn_239_1;
                                                                                                          stackOut_239_2 = 0;
                                                                                                          stackIn_241_0 = stackOut_239_0;
                                                                                                          stackIn_241_1 = stackOut_239_1;
                                                                                                          stackIn_241_2 = stackOut_239_2;
                                                                                                          break L20;
                                                                                                        }
                                                                                                      }
                                                                                                      fq.a(stackIn_241_0, stackIn_241_1, stackIn_241_2, var6 != 0);
                                                                                                      break L1;
                                                                                                    } else {
                                                                                                      if ((ba.field_ub.field_L & sk.field_d) != 0) {
                                                                                                        L21: {
                                                                                                          var6 = param1 ? 1 : 0;
                                                                                                          stackOut_234_0 = -3405;
                                                                                                          stackOut_234_1 = -6;
                                                                                                          stackIn_236_0 = stackOut_234_0;
                                                                                                          stackIn_236_1 = stackOut_234_1;
                                                                                                          stackIn_235_0 = stackOut_234_0;
                                                                                                          stackIn_235_1 = stackOut_234_1;
                                                                                                          if (!mg.a(true)) {
                                                                                                            stackOut_236_0 = stackIn_236_0;
                                                                                                            stackOut_236_1 = stackIn_236_1;
                                                                                                            stackOut_236_2 = 0;
                                                                                                            stackIn_237_0 = stackOut_236_0;
                                                                                                            stackIn_237_1 = stackOut_236_1;
                                                                                                            stackIn_237_2 = stackOut_236_2;
                                                                                                            break L21;
                                                                                                          } else {
                                                                                                            stackOut_235_0 = stackIn_235_0;
                                                                                                            stackOut_235_1 = stackIn_235_1;
                                                                                                            stackOut_235_2 = 21;
                                                                                                            stackIn_237_0 = stackOut_235_0;
                                                                                                            stackIn_237_1 = stackOut_235_1;
                                                                                                            stackIn_237_2 = stackOut_235_2;
                                                                                                            break L21;
                                                                                                          }
                                                                                                        }
                                                                                                        fq.a(stackIn_237_0, stackIn_237_1, stackIn_237_2, var6 != 0);
                                                                                                        break L1;
                                                                                                      } else {
                                                                                                        L22: {
                                                                                                          var6 = param1 ? 1 : 0;
                                                                                                          stackOut_230_0 = -3405;
                                                                                                          stackOut_230_1 = -7;
                                                                                                          stackIn_232_0 = stackOut_230_0;
                                                                                                          stackIn_232_1 = stackOut_230_1;
                                                                                                          stackIn_231_0 = stackOut_230_0;
                                                                                                          stackIn_231_1 = stackOut_230_1;
                                                                                                          if (!mg.a(true)) {
                                                                                                            stackOut_232_0 = stackIn_232_0;
                                                                                                            stackOut_232_1 = stackIn_232_1;
                                                                                                            stackOut_232_2 = 0;
                                                                                                            stackIn_233_0 = stackOut_232_0;
                                                                                                            stackIn_233_1 = stackOut_232_1;
                                                                                                            stackIn_233_2 = stackOut_232_2;
                                                                                                            break L22;
                                                                                                          } else {
                                                                                                            stackOut_231_0 = stackIn_231_0;
                                                                                                            stackOut_231_1 = stackIn_231_1;
                                                                                                            stackOut_231_2 = 21;
                                                                                                            stackIn_233_0 = stackOut_231_0;
                                                                                                            stackIn_233_1 = stackOut_231_1;
                                                                                                            stackIn_233_2 = stackOut_231_2;
                                                                                                            break L22;
                                                                                                          }
                                                                                                        }
                                                                                                        fq.a(stackIn_233_0, stackIn_233_1, stackIn_233_2, var6 != 0);
                                                                                                        break L1;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                if (!((ob) this).field_B.b((byte) 120)) {
                                                                                                  break L2;
                                                                                                } else {
                                                                                                  if ((ba.field_ub.field_L & hq.field_c) != 0) {
                                                                                                    ba.field_ub.o((byte) -17);
                                                                                                    break L1;
                                                                                                  } else {
                                                                                                    L23: {
                                                                                                      var6 = param1 ? 1 : 0;
                                                                                                      stackOut_222_0 = -3405;
                                                                                                      stackOut_222_1 = -7;
                                                                                                      stackIn_224_0 = stackOut_222_0;
                                                                                                      stackIn_224_1 = stackOut_222_1;
                                                                                                      stackIn_223_0 = stackOut_222_0;
                                                                                                      stackIn_223_1 = stackOut_222_1;
                                                                                                      if (!mg.a(true)) {
                                                                                                        stackOut_224_0 = stackIn_224_0;
                                                                                                        stackOut_224_1 = stackIn_224_1;
                                                                                                        stackOut_224_2 = 0;
                                                                                                        stackIn_225_0 = stackOut_224_0;
                                                                                                        stackIn_225_1 = stackOut_224_1;
                                                                                                        stackIn_225_2 = stackOut_224_2;
                                                                                                        break L23;
                                                                                                      } else {
                                                                                                        stackOut_223_0 = stackIn_223_0;
                                                                                                        stackOut_223_1 = stackIn_223_1;
                                                                                                        stackOut_223_2 = 21;
                                                                                                        stackIn_225_0 = stackOut_223_0;
                                                                                                        stackIn_225_1 = stackOut_223_1;
                                                                                                        stackIn_225_2 = stackOut_223_2;
                                                                                                        break L23;
                                                                                                      }
                                                                                                    }
                                                                                                    fq.a(stackIn_225_0, stackIn_225_1, stackIn_225_2, var6 != 0);
                                                                                                    break L1;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    if (!((ob) this).field_B.b((byte) 75)) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      ba.field_ub.c(256, param1);
                                                                                      vq.field_Sb = true;
                                                                                      jc.field_c = false;
                                                                                      break L1;
                                                                                    }
                                                                                  } else {
                                                                                    if (!((ob) this).field_B.b((byte) 112)) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      if (ne.field_u != null) {
                                                                                        tq.d((byte) -124);
                                                                                        break L1;
                                                                                      } else {
                                                                                        var6 = param1 ? 1 : 0;
                                                                                        nm.field_c = false;
                                                                                        qr.a(-28038, var6 != 0);
                                                                                        break L1;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (!((ob) this).field_B.b((byte) 89)) {
                                                                                break L2;
                                                                              } else {
                                                                                var6 = param1 ? 1 : 0;
                                                                                fq.a(-3405, 16, sq.field_b, var6 != 0);
                                                                                break L1;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (!((ob) this).field_B.b((byte) 89)) {
                                                                            break L2;
                                                                          } else {
                                                                            if (sq.field_b != ((ob) this).field_w) {
                                                                              L24: {
                                                                                stackOut_149_0 = -3405;
                                                                                stackOut_149_1 = ((ob) this).field_w;
                                                                                stackOut_149_2 = s.field_c;
                                                                                stackIn_151_0 = stackOut_149_0;
                                                                                stackIn_151_1 = stackOut_149_1;
                                                                                stackIn_151_2 = stackOut_149_2;
                                                                                stackIn_150_0 = stackOut_149_0;
                                                                                stackIn_150_1 = stackOut_149_1;
                                                                                stackIn_150_2 = stackOut_149_2;
                                                                                if (0 <= ((ob) this).field_w) {
                                                                                  stackOut_151_0 = stackIn_151_0;
                                                                                  stackOut_151_1 = stackIn_151_1;
                                                                                  stackOut_151_2 = (ob[]) (Object) stackIn_151_2;
                                                                                  stackOut_151_3 = ((ob) this).field_w;
                                                                                  stackIn_152_0 = stackOut_151_0;
                                                                                  stackIn_152_1 = stackOut_151_1;
                                                                                  stackIn_152_2 = stackOut_151_2;
                                                                                  stackIn_152_3 = stackOut_151_3;
                                                                                  break L24;
                                                                                } else {
                                                                                  stackOut_150_0 = stackIn_150_0;
                                                                                  stackOut_150_1 = stackIn_150_1;
                                                                                  stackOut_150_2 = (ob[]) (Object) stackIn_150_2;
                                                                                  stackOut_150_3 = 0;
                                                                                  stackIn_152_0 = stackOut_150_0;
                                                                                  stackIn_152_1 = stackOut_150_1;
                                                                                  stackIn_152_2 = stackOut_150_2;
                                                                                  stackIn_152_3 = stackOut_150_3;
                                                                                  break L24;
                                                                                }
                                                                              }
                                                                              fq.a(stackIn_152_0, stackIn_152_1, stackIn_152_2[stackIn_152_3].field_w, param1);
                                                                              break L1;
                                                                            } else {
                                                                              break L1;
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (((ob) this).field_B.b((byte) 81)) {
                                                                          var6 = param1 ? 1 : 0;
                                                                          fq.a(-3405, 14, sq.field_b, var6 != 0);
                                                                          break L1;
                                                                        } else {
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (((ob) this).field_B.b((byte) 109)) {
                                                                      var6 = param1 ? 1 : 0;
                                                                      fq.a(-3405, 17, sq.field_b, var6 != 0);
                                                                      break L1;
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (((ob) this).field_B.b((byte) 95)) {
                                                                    var6 = param1 ? 1 : 0;
                                                                    fq.a(-3405, 21, sq.field_b, var6 != 0);
                                                                    lo.field_a = true;
                                                                    break L1;
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                if (((ob) this).field_B.b((byte) 50)) {
                                                                  var6 = param1 ? 1 : 0;
                                                                  fq.a(-3405, 0, sq.field_b, var6 != 0);
                                                                  jc.field_c = false;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (((ob) this).field_B.b((byte) 51)) {
                                                          L25: {
                                                            var6 = param1 ? 1 : 0;
                                                            stackOut_127_0 = -3405;
                                                            stackOut_127_1 = -1;
                                                            stackIn_129_0 = stackOut_127_0;
                                                            stackIn_129_1 = stackOut_127_1;
                                                            stackIn_128_0 = stackOut_127_0;
                                                            stackIn_128_1 = stackOut_127_1;
                                                            if (mg.a(true)) {
                                                              stackOut_129_0 = stackIn_129_0;
                                                              stackOut_129_1 = stackIn_129_1;
                                                              stackOut_129_2 = 21;
                                                              stackIn_130_0 = stackOut_129_0;
                                                              stackIn_130_1 = stackOut_129_1;
                                                              stackIn_130_2 = stackOut_129_2;
                                                              break L25;
                                                            } else {
                                                              stackOut_128_0 = stackIn_128_0;
                                                              stackOut_128_1 = stackIn_128_1;
                                                              stackOut_128_2 = 0;
                                                              stackIn_130_0 = stackOut_128_0;
                                                              stackIn_130_1 = stackOut_128_1;
                                                              stackIn_130_2 = stackOut_128_2;
                                                              break L25;
                                                            }
                                                          }
                                                          fq.a(stackIn_130_0, stackIn_130_1, stackIn_130_2, var6 != 0);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      if (((ob) this).field_B.b((byte) 83)) {
                                                        un.field_e = 1;
                                                        sq.field_b = -8;
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (((ob) this).field_B.b((byte) 81)) {
                                                    var6 = param1 ? 1 : 0;
                                                    fq.a(param0 ^ 19737, 2, sq.field_b, var6 != 0);
                                                    break L1;
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (((ob) this).field_B.b((byte) 101)) {
                                                er.field_W = 3;
                                                vh.field_Ab = so.field_g[1];
                                                sq.field_b = -6;
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          } else {
                                            if (((ob) this).field_B.b((byte) 99)) {
                                              vh.field_Ab = so.field_g[0];
                                              er.field_W = 3;
                                              sq.field_b = -6;
                                              break L1;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (!((ob) this).field_B.b((byte) 86)) {
                                        break L2;
                                      } else {
                                        this.a(5, param1, param0 + 16470);
                                        break L1;
                                      }
                                    }
                                  }
                                } else {
                                  if (((ob) this).field_B.b((byte) 61)) {
                                    this.a(3, param1, 0);
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                }
                              } else {
                                if (((ob) this).field_B.b((byte) 82)) {
                                  this.a(2, param1, 0);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              if (!((ob) this).field_B.b((byte) 63)) {
                                break L2;
                              } else {
                                this.a(1, param1, param0 ^ -16470);
                                break L1;
                              }
                            }
                          }
                        } else {
                          if (!((ob) this).field_B.b((byte) 78)) {
                            break L2;
                          } else {
                            L26: {
                              if (th.field_h) {
                                stackOut_81_0 = 0;
                                stackIn_82_0 = stackOut_81_0;
                                break L26;
                              } else {
                                stackOut_80_0 = 1;
                                stackIn_82_0 = stackOut_80_0;
                                break L26;
                              }
                            }
                            L27: {
                              th.field_h = stackIn_82_0 != 0;
                              stackOut_82_0 = nk.field_f;
                              stackOut_82_1 = 49;
                              stackIn_84_0 = stackOut_82_0;
                              stackIn_84_1 = stackOut_82_1;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              if (th.field_h) {
                                stackOut_84_0 = (String[]) (Object) stackIn_84_0;
                                stackOut_84_1 = stackIn_84_1;
                                stackOut_84_2 = hb.field_q;
                                stackIn_85_0 = stackOut_84_0;
                                stackIn_85_1 = stackOut_84_1;
                                stackIn_85_2 = stackOut_84_2;
                                break L27;
                              } else {
                                stackOut_83_0 = (String[]) (Object) stackIn_83_0;
                                stackOut_83_1 = stackIn_83_1;
                                stackOut_83_2 = uf.field_K;
                                stackIn_85_0 = stackOut_83_0;
                                stackIn_85_1 = stackOut_83_1;
                                stackIn_85_2 = stackOut_83_2;
                                break L27;
                              }
                            }
                            stackIn_85_0[stackIn_85_1] = stackIn_85_2;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (((ob) this).field_B.b((byte) 72)) {
                        fq.a(-3405, 7, 0, param1);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              if (!((ob) this).field_B.b((byte) 97)) {
                break L2;
              } else {
                fq.a(-3405, 6, 0, param1);
                break L1;
              }
            }
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        if (param0 > -15) {
            int discarded$0 = ((ob) this).a((byte) 12, -69);
        }
    }

    final void a(lr param0, int[] param1, int param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var17 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param3 == -16097) {
                break L1;
              } else {
                ((ob) this).c(38);
                break L1;
              }
            }
            L2: {
              if (param4 == hq.field_m) {
                break L2;
              } else {
                if (!param4.equals((Object) (Object) hq.field_m)) {
                  var18 = new String[32];
                  var9 = param0.a(param4, new int[1], var18);
                  var10 = 0;
                  var11 = 0;
                  L3: while (true) {
                    if (var9 <= var11) {
                      uh.field_p = new dd(param5, var10 - -param0.field_w);
                      var25 = new int[4];
                      var26 = qh.field_d;
                      var13 = qh.field_l;
                      var14 = qh.field_f;
                      qh.a(var25);
                      uh.field_p.e();
                      var15 = 0;
                      var16 = param0.field_C;
                      L4: while (true) {
                        if (var15 >= var9) {
                          sh.field_P.b(15100);
                          qh.a(var26, var13, var14);
                          qh.b(var25);
                          break L2;
                        } else {
                          param0.d(var18[var15], 0, var16, param6, -1);
                          var15++;
                          var16 = var16 + param1[var15 % param1.length];
                          continue L4;
                        }
                      }
                    } else {
                      var10 = var10 + param1[var11 % param1.length];
                      var11++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8;
            stackOut_14_1 = new StringBuilder().append("ob.WB(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    void a(byte param0) {
        fq.a(-3405, ((ob) this).field_w, ((ob) this).field_w, false);
        if (param0 > -11) {
            this.a(11, false, -44);
        }
    }

    int a(byte param0, int param1) {
        if (param0 != 69) {
            int discarded$0 = ((ob) this).a(true, 77);
        }
        return 36;
    }

    void b(byte param0) {
        qh.g(0, 0, qh.field_l, qh.field_f);
        if (param0 != 108) {
            field_y = null;
        }
    }

    final void a(int[] param0, boolean param1) {
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
              ((ob) this).field_h = param0;
              ((ob) this).field_B = new ia(((ob) this).field_h.length);
              if (param1) {
                break L1;
              } else {
                ((ob) this).b(5, true);
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
            stackOut_3_1 = new StringBuilder().append("ob.SB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, boolean param2) {
        if (param0 != ~((ob) this).field_B.field_h) {
            param1 = ((ob) this).field_B.field_h;
        }
        ((ob) this).field_B.a(param2, param1, this.b(-6564, gg.field_f, wn.field_i), true);
        field_D = eo.field_Tb;
    }

    final void b(int param0, boolean param1) {
        uh.field_p.c(qh.field_l - uh.field_p.field_z >> 1, param0);
        if (param1) {
            ((ob) this).a(-32, 52, true);
        }
    }

    int d(int param0, int param1) {
        if (param0 != 0) {
            return 80;
        }
        return ((ob) this).field_t;
    }

    boolean f(int param0, int param1) {
        if (param0 != -13676) {
            ((ob) this).field_n = false;
        }
        return ((ob) this).field_q;
    }

    boolean e(int param0, int param1) {
        int var3 = -92 / ((-42 - param1) / 49);
        return true;
    }

    final void b(int param0) {
        qh.f(param0, 0, qh.field_l, qh.field_f, 0);
    }

    void e(byte param0) {
        if (param0 != -6) {
            field_F = 50;
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != -24267) {
            ((ob) this).field_p = true;
        }
    }

    private final int c(int param0, int param1) {
        if (!((ob) this).a(param0, true)) {
            return ((ob) this).field_B.field_h != param0 ? 1 : 2;
        }
        return ((ob) this).field_B.field_h == param0 ? 3 : 4;
    }

    void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var3 = Pool.field_O;
            ((ob) this).a(false);
            if (fm.field_G == null) {
              break L1;
            } else {
              if (fm.field_G.length >= ((ob) this).field_B.field_e) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          fm.field_G = new dd[((ob) this).field_B.field_e];
          mc.field_h = new int[((ob) this).field_B.field_e];
          jq.field_e = new String[((ob) this).field_B.field_e];
          break L0;
        }
        if (param0 >= 36) {
          var2 = 0;
          L2: while (true) {
            if (var2 >= ((ob) this).field_B.field_e) {
              L3: {
                if (0 != ((ob) this).field_E) {
                  break L3;
                } else {
                  cl.field_k.c(0, qh.field_f + -cl.field_k.field_y);
                  od.field_a.c(qh.field_l - od.field_a.field_w, qh.field_f - od.field_a.field_y);
                  break L3;
                }
              }
              return;
            } else {
              if (((ob) this).e(var2, -126)) {
                ((ob) this).b(true, var2);
                var2++;
                continue L2;
              } else {
                var2++;
                continue L2;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, of param1, int param2, int param3, int param4, int param5, im param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kn var13 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              dr.a(param6.field_jc, -1, param6.field_Sb, -1, param1, param6.field_dc, 32540, (vh) (Object) param6, (int[]) null);
              vl.field_m.a((byte) 124, true);
              vl.field_m.a(0, (int[]) null, (byte) 75);
              vl.field_m.a((byte) 65);
              var13 = vl.field_m;
              var8 = param5;
              var9 = param4;
              var10 = param2;
              var11 = param0;
              var13.field_n.c(var10, var11, var8, 0, var9);
              if (param3 == 9851) {
                break L1;
              } else {
                ob.d((byte) -122);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("ob.AC(").append(param0).append(',');
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    int a(boolean param0, int param1) {
        if (param0) {
            ((ob) this).e((byte) 8);
        }
        return ((ob) this).field_C;
    }

    final static void a(int[] param0, int[] param1, int[] param2, int[] param3, float[] param4, int[] param5, float[] param6, int param7, int[] param8) {
        float var9_float = 0.0f;
        RuntimeException var9 = null;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var9_float = param4[0];
            var10 = param6[0];
            var11 = param4[1];
            var12 = param6[1];
            var13 = param4[2];
            var14 = param6[2];
            var15 = -(var12 * var13) + var11 * var14;
            var16 = -(1.0f * var14) + 1.0f * var12;
            var17 = var13 * 1.0f - 1.0f * var11;
            var18 = -(var14 * var9_float) + var13 * var10;
            var19 = var14 * 1.0f - var10 * 1.0f;
            var20 = -(var13 * 1.0f) + var9_float * 1.0f;
            var21 = -(var10 * var11) + var9_float * var12;
            var22 = -(var12 * 1.0f) + 1.0f * var10;
            var23 = 1.0f * var11 - var9_float * 1.0f;
            var24 = 1.0f / (var9_float * var16 + 1.0f * var15 + var17 * var10);
            var20 = var20 * var24;
            var17 = var24 * var17;
            var22 = var22 * var24;
            var23 = var24 * var23;
            var21 = var21 * var24;
            var16 = var24 * var16;
            var15 = var15 * var24;
            var18 = var18 * var24;
            var19 = var24 * var19;
            var25 = param5[0];
            var26 = param3[0];
            var27 = param2[0];
            var28 = param5[1];
            var29 = param3[1];
            var30 = param2[1];
            var31 = param5[2];
            var32 = param3[2];
            var33 = param2[2];
            var24 = 0.5f + (var15 * (float)var25 + var18 * (float)var28 + var21 * (float)var31);
            param8[0] = (int)var24;
            param8[1] = (int)(var22 * (float)var31 + (var16 * (float)var25 + var24 + (float)var28 * var19) + 0.5f);
            param8[2] = (int)((float)var31 * var23 + ((float)var28 * var20 + (var24 + var17 * (float)var25)) + 0.5f);
            var24 = 0.5f + ((float)var32 * var21 + (var18 * (float)var29 + var15 * (float)var26));
            param1[0] = (int)var24;
            param1[1] = (int)(var24 + var16 * (float)var26 + (float)var29 * var19 + (float)var32 * var22 + 0.5f);
            param1[2] = (int)(var20 * (float)var29 + (var24 + var17 * (float)var26) + (float)var32 * var23 + 0.5f);
            var24 = (float)var33 * var21 + ((float)var30 * var18 + var15 * (float)var27) + 0.5f;
            param0[0] = (int)var24;
            param0[2] = (int)(var20 * (float)var30 + (var24 + (float)var27 * var17) + (float)var33 * var23 + 0.5f);
            param0[1] = (int)((float)var33 * var22 + ((float)var30 * var19 + (var16 * (float)var27 + var24)) + 0.5f);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var9;
            stackOut_2_1 = new StringBuilder().append("ob.VB(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param5 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param6 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param8 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ob) this).field_p = true;
        int var4 = null != ((ob) this).field_z ? ((ob) this).field_z.field_y : 0;
        if (param2 != -10) {
            return;
        }
        ((ob) this).a(qh.field_l + -(2 * param0), param1, param0, -param1 + var4 + (qh.field_f - param1), 0);
    }

    boolean a(int param0, boolean param1) {
        if (!param1) {
            return false;
        }
        return ((ob) this).e(param0, -126);
    }

    ob(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((ob) this).field_q = false;
        ((ob) this).field_n = true;
        ((ob) this).field_z = null;
        ((ob) this).field_p = false;
        ((ob) this).field_l = true;
        try {
            ((ob) this).field_t = param2;
            ((ob) this).field_z = param0;
            ((ob) this).field_s = param5;
            ((ob) this).field_C = param3;
            ((ob) this).field_x = param4;
            s.field_c[param1] = (ob) this;
            ((ob) this).field_E = param1;
            ((ob) this).a(param6, true);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    void e(int param0) {
        ((ob) this).field_B.e(-15525);
        if (param0 != -34) {
            ob.d((byte) 126);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 11;
        field_i = 9;
        field_m = new int[]{2, 20, 21, 49, 5, 13};
        field_D = 0;
        field_F = 1 << field_j;
    }
}
