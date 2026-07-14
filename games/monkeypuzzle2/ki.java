/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends bf {
    private int field_i;
    int field_l;
    int field_m;
    boolean field_E;
    int field_C;
    private int field_k;
    int field_p;
    pj field_t;
    ki[] field_o;
    int field_w;
    int field_G;
    static int field_s;
    private int field_z;
    float field_v;
    int field_u;
    int field_y;
    boolean field_A;
    static le field_H;
    int field_F;
    float field_q;
    le field_I;
    int field_n;
    boolean field_x;
    static String[] field_r;
    boolean field_j;
    float field_B;
    float field_D;

    final void f(int param0) {
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 == -7) {
            break L0;
          } else {
            ((ki) this).field_G = -86;
            break L0;
          }
        }
        L1: {
          ((ki) this).field_z = ((ki) this).field_z + 1;
          if (-1 == ((ki) this).field_w) {
            if (((ki) this).field_n != 0) {
              if (1 == ((ki) this).field_n) {
                if (-1 != (((ki) this).field_z & 7 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    ((ki) this).field_C = ((ki) this).field_C + 1;
                    if (((ki) this).field_C + 1 == 4) {
                      ((ki) this).field_C = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((ki) this).field_I = nh.field_f[((ki) this).field_n][((ki) this).field_i][((ki) this).field_C];
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if (((ki) this).field_z % 100 <= -33) {
                break L1;
              } else {
                if (-1 != (((ki) this).field_z & 7)) {
                  break L1;
                } else {
                  L3: {
                    ((ki) this).field_C = ((ki) this).field_C + 1;
                    if (-5 != (((ki) this).field_C + 1 ^ -1)) {
                      break L3;
                    } else {
                      ((ki) this).field_C = 0;
                      break L3;
                    }
                  }
                  ((ki) this).field_I = nh.field_f[((ki) this).field_n][((ki) this).field_i][((ki) this).field_C];
                  break L1;
                }
              }
            }
          } else {
            if (((ki) this).field_w == 3) {
              if (((ki) this).field_n == -2) {
                if (-1 == (3 & ((ki) this).field_z)) {
                  ((ki) this).field_C = ((ki) this).field_C + 1;
                  if ((((ki) this).field_C + 1 ^ -1) > -5) {
                    ((ki) this).field_I = qi.field_K[((ki) this).field_C];
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if (5 != ((ki) this).field_w) {
                break L1;
              } else {
                if (-33 <= ((ki) this).field_z % 100) {
                  break L1;
                } else {
                  if (0 == (7 & ((ki) this).field_z)) {
                    L4: {
                      ((ki) this).field_C = ((ki) this).field_C + 1;
                      if (((ki) this).field_C + 1 != 4) {
                        break L4;
                      } else {
                        ((ki) this).field_C = 0;
                        break L4;
                      }
                    }
                    ((ki) this).field_I = hb.field_m[((ki) this).field_l][((ki) this).field_C];
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 20) {
            return null;
        }
        int var2 = param1.length();
        char[] var3 = new char[var2];
        for (var4 = 0; var2 > var4; var4++) {
            var3[-1 + (var2 + -var4)] = param1.charAt(var4);
        }
        return new String(var3);
    }

    final void b(byte param0) {
        int var2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          ((ki) this).field_q = ((ki) this).field_q + ((ki) this).field_D;
          ((ki) this).field_B = ((ki) this).field_B + ((ki) this).field_v;
          ((ki) this).field_u = ((ki) this).field_u + 1;
          if (((ki) this).field_u <= 250) {
            break L0;
          } else {
            ((ki) this).field_D = ((ki) this).field_D + 1.0f;
            break L0;
          }
        }
        if (param0 <= -87) {
          L1: {
            L2: {
              if ((float)((ki) this).field_G + ((ki) this).field_B <= 80.0f) {
                break L2;
              } else {
                if (560.0f <= ((ki) this).field_B - (float)((ki) this).field_G) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              var2 = 0;
              if (80.0f < (float)((ki) this).field_G + ((ki) this).field_B) {
                L4: {
                  if (!nh.a(560, 0, (int)((ki) this).field_q, (int)(((ki) this).field_D + ((ki) this).field_q), -5425, 560, (int)(((ki) this).field_B + ((ki) this).field_v), (int)((ki) this).field_B, 480)) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L4;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L4;
                  }
                }
                var2 = stackIn_17_0;
                if (var2 == 0) {
                  break L3;
                } else {
                  ((ki) this).field_B = (float)(ll.field_a - -((ki) this).field_G);
                  break L3;
                }
              } else {
                L5: {
                  if (!nh.a(80, 0, (int)((ki) this).field_q, (int)(((ki) this).field_q + ((ki) this).field_D), -5425, 80, (int)(((ki) this).field_v + ((ki) this).field_B), (int)((ki) this).field_B, 480)) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L5;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L5;
                  }
                }
                var2 = stackIn_11_0;
                if (var2 != 0) {
                  ((ki) this).field_B = (float)(ll.field_a + -((ki) this).field_G);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L6: {
              if (var2 == 0) {
                break L6;
              } else {
                if (Math.abs(-((ki) this).field_q + (float)ok.field_b) >= 10.0f) {
                  break L6;
                } else {
                  ((ki) this).field_q = (float)ok.field_b;
                  break L6;
                }
              }
            }
            ib.c(100);
            ((ki) this).field_v = ((ki) this).field_v * -1.0f;
            break L1;
          }
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, gk param1) {
        this.a(param1, true);
        this.a(false);
        ((ki) this).field_x = true;
        if (param0 < 112) {
            ((ki) this).f(113);
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 11 % ((-86 - param0) / 39);
    }

    final static void a(int param0, kc param1, boolean param2, boolean param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        e.field_b[0] = pi.field_l.nextInt();
        e.field_b[1] = pi.field_l.nextInt();
        e.field_b[3] = (int)ld.field_a;
        e.field_b[2] = (int)(ld.field_a >> -599347296);
        uc.field_a.field_h = 0;
        uc.field_a.a(-803539344, e.field_b[0]);
        uc.field_a.a(-803539344, e.field_b[1]);
        uc.field_a.a(-803539344, e.field_b[2]);
        uc.field_a.a(-803539344, e.field_b[3]);
        df.a(uc.field_a, false);
        uc.field_a.c(param0, 80);
        if (param2) {
          L0: {
            param1.a(121, uc.field_a);
            gf.field_c.field_h = 0;
            if (param3) {
              gf.field_c.b(18, -49152);
              break L0;
            } else {
              gf.field_c.b(16, -49152);
              break L0;
            }
          }
          L1: {
            gf.field_c.field_h = gf.field_c.field_h + 2;
            var5 = gf.field_c.field_h;
            gf.field_c.a(-803539344, mk.field_h);
            gf.field_c.a(od.field_l, (byte) -102);
            var6 = 0;
            if (!mb.field_c) {
              break L1;
            } else {
              var6 = var6 | 1;
              break L1;
            }
          }
          L2: {
            if (me.field_e) {
              var6 = var6 | 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param4) {
              var6 = var6 | 8;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == df.field_o) {
              break L4;
            } else {
              var6 = var6 | 16;
              break L4;
            }
          }
          L5: {
            gf.field_c.b(var6, -49152);
            var7 = lc.a(ii.a(false), (byte) -89);
            if (var7 == null) {
              var7 = "";
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            gf.field_c.a(-119, var7);
            if (df.field_o != null) {
              gf.field_c.a(df.field_o, -57);
              break L6;
            } else {
              break L6;
            }
          }
          e.a(sd.field_a, fj.field_F, (byte) 92, (gk) (Object) gf.field_c, uc.field_a);
          gf.field_c.d(6903, gf.field_c.field_h - var5);
          al.a((byte) -71, -1);
          return;
        } else {
          return;
        }
    }

    final void d(byte param0) {
        if (2 != ((ki) this).field_w) {
            // if_icmpne L185
        }
        sb.field_m.e();
        ((ki) this).field_I.e(-80 + (int)((float)((ki) this).field_G + ((ki) this).field_B) - 1, (int)(((ki) this).field_q + (float)((ki) this).field_y), 16777213);
        ((ki) this).field_I.e((int)(((ki) this).field_B + (float)((ki) this).field_G) + -79, (int)((float)((ki) this).field_y + ((ki) this).field_q), 16777212);
        ((ki) this).field_I.e((int)((float)((ki) this).field_G + ((ki) this).field_B) - 80, (int)((float)((ki) this).field_y + ((ki) this).field_q - 1.0f), 16777215);
        ((ki) this).field_I.e(-80 + (int)((float)((ki) this).field_G + ((ki) this).field_B), (int)(1.0f + ((float)((ki) this).field_y + ((ki) this).field_q)), 16777214);
        ac.field_a.a((byte) 117);
        int var2 = -89 % ((param0 - 59) / 54);
    }

    final void a(byte param0) {
        if (((ki) this).field_w == 4) {
            ((ki) this).field_I.b((int)((float)((ki) this).field_G + ((ki) this).field_B), (int)(((ki) this).field_q + (float)((ki) this).field_y), 180);
        } else {
            if (0 == ((ki) this).field_w) {
                // if_icmpgt L86
            }
            if ((((ki) this).field_w ^ -1) == -6) {
                if (1 < ((ki) this).field_m) {
                    ge.c((int)((ki) this).field_B, (int)((ki) this).field_q, 16, 16777215, 100);
                    ge.e((int)((ki) this).field_B, (int)((ki) this).field_q, 16, 1);
                }
            }
            if (!(((ki) this).field_I == null)) {
                ((ki) this).field_I.c((int)((float)((ki) this).field_G + ((ki) this).field_B), (int)((float)((ki) this).field_y + ((ki) this).field_q));
            }
        }
        if (param0 > -10) {
            ((ki) this).c((byte) 35);
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ki) this).field_l = param1;
        if (param2 != -1) {
            ((ki) this).field_t = null;
        }
        ((ki) this).field_w = param0;
        this.a(false);
    }

    private final void a(gk param0, boolean param1) {
        ((ki) this).field_B = (float)param0.e(-46);
        ((ki) this).field_q = (float)param0.e(127);
        ((ki) this).field_l = param0.a((byte) 114);
        if (!param1) {
            ((ki) this).field_y = 45;
        }
        ((ki) this).field_w = param0.a((byte) 114);
    }

    final void c(byte param0) {
        sb.field_m.e();
        if (param0 >= -83) {
            ((ki) this).field_y = -51;
        }
        ((ki) this).field_I.e((int)((float)((ki) this).field_G + ((ki) this).field_B) + -80, (int)((float)((ki) this).field_y + ((ki) this).field_q), ((ki) this).field_k + 1);
        ac.field_a.a((byte) 124);
    }

    private final void a(boolean param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        L0: {
          ((ki) this).field_A = false;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((ki) this).field_E = stackIn_3_1 != 0;
            ((ki) this).field_F = 0;
            ((ki) this).field_i = ((ki) this).field_l;
            ((ki) this).field_m = 0;
            ((ki) this).field_p = -((ki) this).field_k;
            ((ki) this).field_z = 0;
            stackOut_3_0 = this;
            stackIn_6_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if ((((ki) this).field_w ^ -1) == -3) {
              break L2;
            } else {
              stackOut_4_0 = this;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if ((((ki) this).field_w ^ -1) != -4) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L1;
              } else {
                stackOut_5_0 = this;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
            }
          }
          stackOut_6_0 = this;
          stackOut_6_1 = 1;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          break L1;
        }
        L3: {
          L4: {
            ((ki) this).field_x = stackIn_8_1 != 0;
            ((ki) this).field_n = 0;
            ((ki) this).field_t = null;
            ((ki) this).field_j = false;
            ((ki) this).field_C = 0;
            if (6 == ((ki) this).field_w) {
              break L4;
            } else {
              if (-5 == (((ki) this).field_w ^ -1)) {
                break L4;
              } else {
                if ((((ki) this).field_w ^ -1) == -3) {
                  break L4;
                } else {
                  if (3 != ((ki) this).field_w) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
          }
          ((ki) this).field_l = -((ki) this).field_k;
          break L3;
        }
        this.e(123);
    }

    public static void h(int param0) {
        if (param0 != 12950) {
            field_H = null;
        }
        field_H = null;
        field_r = null;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          var2 = -84 + ((int)((ki) this).field_B - -((ki) this).field_G);
          var3 = (int)((ki) this).field_q + ((ki) this).field_y - 4;
          var4 = 8 + ((ki) this).field_I.field_m;
          if (var2 <= -1) {
            break L0;
          } else {
            var4 = var4 + var2;
            var2 = 0;
            break L0;
          }
        }
        L1: {
          var5 = 8 + ((ki) this).field_I.field_n;
          if (-1 > var3) {
            var5 = var5 + var3;
            var3 = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (sb.field_m.field_k < var4 + var2) {
            var4 = sb.field_m.field_k - var2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (sb.field_m.field_j >= var3 + var5) {
            break L3;
          } else {
            var5 = sb.field_m.field_j - var3;
            break L3;
          }
        }
        if (param0 >= 104) {
          var6 = var3 * sb.field_m.field_k + var2;
          var7 = -var4 + sb.field_m.field_k;
          var14 = sb.field_m.field_s;
          L4: while (true) {
            var5--;
            if ((var5 ^ -1) >= -1) {
              return;
            } else {
              var9 = -var4;
              L5: while (true) {
                if ((var9 ^ -1) <= -1) {
                  var6 = var6 + var7;
                  continue L4;
                } else {
                  L6: {
                    if (((ki) this).field_k - -1 == var14[var6]) {
                      var14[var6] = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (((ki) this).field_w == 3) {
                    if (16777212 <= var14[var6]) {
                      var14[var6] = 0;
                      var6++;
                      var9++;
                      continue L5;
                    } else {
                      var6++;
                      var9++;
                      continue L5;
                    }
                  } else {
                    var6++;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, ki param1) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var3 = 0;
        if (!param0) {
            ((ki) this).field_v = -0.48507803678512573f;
        }
        while (var3 < ((ki) this).field_m) {
            if (!(((ki) this).field_o[var3] != param1)) {
                ((ki) this).field_o[var3] = null;
                if (((ki) this).field_l != param1.field_l) {
                    if (((ki) this).field_p != param1.field_l) {
                        if (((ki) this).field_l != param1.field_p) {
                            // if_icmpne L122
                        }
                    }
                }
                ((ki) this).field_F = ((ki) this).field_F - 1;
                ((ki) this).field_m = ((ki) this).field_m - 1;
                if (var3 >= 5) {
                    // if_icmpne L176
                }
                gl.a((Object[]) (Object) ((ki) this).field_o, var3 + 1, (Object[]) (Object) ((ki) this).field_o, var3, -var3 + ((ki) this).field_m);
                ((ki) this).field_o[((ki) this).field_m] = null;
                break;
            }
            var3++;
        }
        if (!(((ki) this).field_m >= ((ki) this).field_F)) {
            throw new IllegalStateException();
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (-1 != (((ki) this).field_w ^ -1)) {
            if (-2 == (((ki) this).field_w ^ -1)) {
              ((ki) this).field_I = ak.field_t[((ki) this).field_i];
              break L0;
            } else {
              if (((ki) this).field_w == -3) {
                ((ki) this).field_I = qi.field_K[0];
                break L0;
              } else {
                if (-4 != ((ki) this).field_w) {
                  if (-5 != ((ki) this).field_w) {
                    if (5 == ((ki) this).field_w) {
                      ((ki) this).field_I = hb.field_m[((ki) this).field_l][0];
                      ((ki) this).field_z = pf.a((byte) -92, 2000);
                      break L0;
                    } else {
                      if (-7 == ((ki) this).field_w) {
                        ((ki) this).field_I = tl.field_b;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    ((ki) this).field_I = wc.field_h;
                    break L0;
                  }
                } else {
                  ((ki) this).field_I = qi.field_K[1];
                  break L0;
                }
              }
            }
          } else {
            ((ki) this).field_I = nh.field_f[((ki) this).field_n][((ki) this).field_i][0];
            ((ki) this).field_z = pf.a((byte) 51, 65) + 35;
            break L0;
          }
        }
        L1: {
          var2 = -92 % ((76 - param0) / 41);
          if (((ki) this).field_I == null) {
            break L1;
          } else {
            ((ki) this).field_G = -(((ki) this).field_I.field_m / 2);
            ((ki) this).field_y = -(((ki) this).field_I.field_n / 2);
            break L1;
          }
        }
    }

    ki(int param0, int param1, int param2) {
        ((ki) this).field_t = null;
        ((ki) this).field_o = new ki[6];
        ((ki) this).field_m = 0;
        ((ki) this).field_F = 0;
        ((ki) this).field_k = param2;
        ((ki) this).field_l = param1;
        ((ki) this).field_w = param0;
        this.a(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Fire 300 nuts on one level", "Complete the game", "Dislodge 30 nuts at once", "Dislodge 4 monkeys in a row without interruption", "Dislodge 5 monkeys in a row without interruption", "Dislodge 6 monkeys in a row without interruption", "Dislodge any set of non-monkey objects 50 times, without clearing a monkey", "Dislodge a monkey with 10 or more nuts attatched", "Dislodge a monkey with 15 or more nuts attatched", "Dislodge a monkey with 20 or more nuts attatched"};
    }
}
