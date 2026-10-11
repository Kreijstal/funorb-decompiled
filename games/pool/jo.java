/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jo extends ob {
    static boolean field_H;
    static String field_L;
    static int field_J;
    private dd field_K;
    static String[] field_I;

    final void c(int param0) {
        super.c(92);
        if (this.field_K != null) {
          this.field_K.c(qh.field_l - this.field_K.field_z >> 1, 80);
        }
        if (param0 > 36) {
          return;
        }
        field_J = 74;
    }

    final void a(byte param0) {
        if (param0 < -11) {
          fq.a(-3405, -1, mg.a(true) ? 21 : 0, false);
          return;
        }
        this.field_K = (dd) null;
        fq.a(-3405, -1, mg.a(true) ? 21 : 0, false);
    }

    final static wc a(String[] args, int param1) {
        wc var2 = null;
        RuntimeException var2_ref = null;
        wc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 57) {
            jo.g(-2, 69);
          }
          var2 = new wc(false);
          var2.field_c = args;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("jo.EA(");
          if (args == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void f(byte param0) {
        ob var1 = s.field_c[0];
        var1.field_s = 26;
        var1.field_x = 153;
        var1.field_l = true;
        var1.field_q = false;
        ob var4 = s.field_c[13];
        var4.a(20, 100, -10);
        var4.field_q = true;
        var4.field_x = 370;
        var4.field_p = true;
        ob var5 = s.field_c[1];
        var5.a(120, 100, -10);
        var5.field_q = true;
        var5.field_s = 60;
        var1 = s.field_c[6];
        var1.field_q = true;
        var1.field_p = true;
        var1.field_x = 365;
        int var2 = 240;
        var1.field_C = -20 + (qh.field_l >> 1);
        var1.field_t = (qh.field_l >> 1) - var2 - 20;
        ob var6 = s.field_c[7];
        var6.a(40, 85, -10);
        var6.field_q = true;
        ob var7 = s.field_c[18];
        var7.a(20, 80, -10);
        var7.field_t = 80;
        var7.field_q = true;
        var7.field_x = 390;
        ob var8 = s.field_c[17];
        var8.a(20, 80, -10);
        var8.field_x = 390;
        var8.field_t = 80;
        var8.field_q = true;
        ob var9 = s.field_c[15];
        var9.a(20, 85, -10);
        var9.field_q = true;
        var9.field_x = 120;
        var9.field_s = 45;
        ob var10 = s.field_c[16];
        var10.a(20, 85, -10);
        var10.field_q = true;
        var10.field_s = 45;
        var10.field_x = 120;
        ob var11 = s.field_c[14];
        var11.field_p = true;
        var11.a(-320 + qh.field_l, 140, 160, 300, 0);
        var11.field_s = 30;
        var11.field_C = 240 + qh.field_l >> 1;
        var11.field_x = 200;
        var11.field_t = -240 + qh.field_l >> 1;
        var11.field_q = false;
        ob var12 = s.field_c[2];
        var12.a(-320 + qh.field_l, 140, 160, 280, 0);
        var12.field_C = qh.field_l + 240 >> 1;
        var12.field_t = qh.field_l - 240 >> 1;
        var12.field_p = true;
        var12.field_q = true;
        var12.field_s = 50;
        var12.field_x = 205;
        var1 = s.field_c[9];
        var1.field_l = false;
        var1 = s.field_c[10];
        var1.field_l = false;
        var1 = s.field_c[11];
        var1.field_l = false;
        var1 = s.field_c[12];
        var1.field_l = false;
        var1 = s.field_c[8];
        var1.field_l = false;
        var1 = s.field_c[9];
        var1.field_l = false;
        var1 = s.field_c[3];
        var1.field_l = false;
        var1 = s.field_c[22];
        var1.field_l = false;
        var1 = s.field_c[24];
        var1.field_l = false;
        var1 = s.field_c[23];
        var1.field_l = false;
        var1 = s.field_c[21];
        int var3 = 122 / ((param0 + 66) / 32);
        var1.field_l = true;
        ob var13 = s.field_c[19];
        var13.field_q = true;
        var13.field_s = 40;
        var13.field_x = 260;
        var13.a(80, 80, -10);
    }

    final static void a(float param0, float param1, float param2, float param3, int param4) {
        if (param4 == -31792) {
          pq.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
          return;
        }
        jo.a(0.2009153664112091f, 0.45015275478363037f, 2.6406524181365967f, -0.13969022035598755f, 60);
        pq.a(param3, param0, 1.0f, 1.0f, param2, param1, -1);
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != -54264319) {
          field_I = (String[]) null;
          return param2 << param0;
        }
        return param2 << param0;
    }

    final static void g(int param0, int param1) {
        int stackIn_52_0 = 0;
        int stackIn_128_0 = 0;
        int var2;
        int var2Lifetime1;
        hh.field_a = hh.field_a + 1;
        if (param0 != 0) {
          field_I = (String[]) null;
          if (ac.field_m == param1) {
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
            }
          } else {
            if (oa.field_j) {
              var2 = 0;
              if (param1 != -1) {
                if (!oa.field_j &&
                  var2 == 0) {
                  hh.field_a = 0;
                } else {
                  hh.field_a = se.field_l;
                }
              } else {
                hh.field_a = 0;
              }
              pa.field_H = wn.field_i;
              if (param1 == -1) {
                if (var2 != 0) {
                  oa.field_j = true;
                }
              } else {
                oa.field_j = false;
              }
              pm.field_p = gg.field_f;
            } else {
              if (hh.field_a < se.field_l) {
                var2 = 0;
                if (param1 != -1) {
                  if (oa.field_j) {
                    hh.field_a = se.field_l;
                  } else {
                    if (var2 != 0) {
                      hh.field_a = se.field_l;
                    } else {
                      hh.field_a = 0;
                    }
                  }
                } else {
                  hh.field_a = 0;
                }
                pa.field_H = wn.field_i;
                if (param1 == -1) {
                  if (var2 != 0) {
                    oa.field_j = true;
                  }
                } else {
                  oa.field_j = false;
                }
                pm.field_p = gg.field_f;
              } else {
                stackIn_52_0 = (oe.field_Q + se.field_l <= hh.field_a) ? 0 : 1;
                boolean decompiledFrameRemainder1 = true;
                var2 = stackIn_52_0;
                if (param1 != -1) {
                  if (oa.field_j) {
                    hh.field_a = se.field_l;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var2 != 0) {
                      hh.field_a = se.field_l;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  hh.field_a = 0;
                }
                boolean decompiledFrameRemainder0 = true;
                pa.field_H = wn.field_i;
                if (param1 == -1) {
                  if (var2 != 0) {
                    oa.field_j = true;
                    pm.field_p = gg.field_f;
                    decompiledFrameRemainder0 = false;
                  }
                } else {
                  oa.field_j = false;
                }
                if (decompiledFrameRemainder0) {
                  pm.field_p = gg.field_f;
                }
              }
            }
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
            }
          }
          ac.field_m = param1;
          if (oa.field_j &&
            eo.field_Vb == hh.field_a) {
            hh.field_a = 0;
            oa.field_j = false;
          }
          return;
        }
        if (ac.field_m == param1) {
          if (!oa.field_j &&
            hh.field_a < se.field_l &&
            re.field_c) {
            pm.field_p = gg.field_f;
            pa.field_H = wn.field_i;
            hh.field_a = 0;
          }
          ac.field_m = param1;
          if (oa.field_j &&
            eo.field_Vb == hh.field_a) {
            hh.field_a = 0;
            oa.field_j = false;
            return;
          }
          return;
        }
        if (!oa.field_j) {
          if (hh.field_a >= se.field_l) {
            stackIn_128_0 = (oe.field_Q + se.field_l > hh.field_a) ? 1 : 0;
          } else {
            stackIn_128_0 = 0;
          }
        } else {
          stackIn_128_0 = 0;
        }
        var2Lifetime1 = stackIn_128_0;
        if (param1 == -1) {
          hh.field_a = 0;
          pa.field_H = wn.field_i;
          if (param1 != -1) {
            oa.field_j = false;
            pm.field_p = gg.field_f;
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
              ac.field_m = param1;
              if (oa.field_j &&
                eo.field_Vb == hh.field_a) {
                hh.field_a = 0;
                oa.field_j = false;
              }
              return;
            }
          } else {
            if (var2Lifetime1 != 0) {
              oa.field_j = true;
              pm.field_p = gg.field_f;
              if (!oa.field_j &&
                hh.field_a < se.field_l &&
                re.field_c) {
                pm.field_p = gg.field_f;
                pa.field_H = wn.field_i;
                hh.field_a = 0;
                ac.field_m = param1;
                if (oa.field_j &&
                  eo.field_Vb == hh.field_a) {
                  hh.field_a = 0;
                  oa.field_j = false;
                }
                return;
              }
            } else {
              pm.field_p = gg.field_f;
              if (!oa.field_j &&
                hh.field_a < se.field_l &&
                re.field_c) {
                pm.field_p = gg.field_f;
                pa.field_H = wn.field_i;
                hh.field_a = 0;
              }
            }
          }
        } else {
          if (oa.field_j) {
            hh.field_a = se.field_l;
            pa.field_H = wn.field_i;
            if (param1 == -1) {
              if (var2Lifetime1 != 0) {
                oa.field_j = true;
              }
            } else {
              oa.field_j = false;
            }
            pm.field_p = gg.field_f;
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
            }
            ac.field_m = param1;
            if (oa.field_j &&
              eo.field_Vb == hh.field_a) {
              hh.field_a = 0;
              oa.field_j = false;
            }
            return;
          }
          if (var2Lifetime1 != 0) {
            hh.field_a = se.field_l;
            pa.field_H = wn.field_i;
            if (param1 == -1) {
              oa.field_j = true;
            } else {
              oa.field_j = false;
            }
            pm.field_p = gg.field_f;
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
            }
            ac.field_m = param1;
            if (oa.field_j &&
              eo.field_Vb == hh.field_a) {
              hh.field_a = 0;
              oa.field_j = false;
              return;
            }
            return;
          }
          hh.field_a = 0;
          pa.field_H = wn.field_i;
          if (param1 != -1) {
            oa.field_j = false;
          } else {
            pm.field_p = gg.field_f;
            if (!oa.field_j &&
              hh.field_a < se.field_l &&
              re.field_c) {
              pm.field_p = gg.field_f;
              pa.field_H = wn.field_i;
              hh.field_a = 0;
            }
            ac.field_m = param1;
            if (oa.field_j &&
              eo.field_Vb == hh.field_a) {
              hh.field_a = 0;
              oa.field_j = false;
              return;
            }
            return;
          }
          pm.field_p = gg.field_f;
          if (!oa.field_j &&
            hh.field_a < se.field_l &&
            re.field_c) {
            pm.field_p = gg.field_f;
            pa.field_H = wn.field_i;
            hh.field_a = 0;
            ac.field_m = param1;
            if (oa.field_j &&
              eo.field_Vb == hh.field_a) {
              hh.field_a = 0;
              oa.field_j = false;
            }
            return;
          }
        }
        ac.field_m = param1;
        if (!oa.field_j) {
          return;
        }
        if (eo.field_Vb != hh.field_a) {
          return;
        }
        hh.field_a = 0;
        oa.field_j = false;
        return;
    }

    public static void f(int param0) {
        if (param0 != 8) {
          return;
        }
        field_I = null;
        field_L = null;
    }

    jo(dd param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_n = false;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.field_h[param2];
        if (var4 == 54) {
          if (this.field_B.b((byte) 54)) {
            ac.a(param0 ^ -16726, true, true, nn.field_b[0].field_b);
          }
        } else {
          if (var4 == 55) {
            if (this.field_B.b((byte) 115)) {
              ac.a(256, true, true, nn.field_b[1].field_b);
            }
          } else {
            if (56 == var4) {
              if (this.field_B.b((byte) 54)) {
                ac.a(param0 ^ -16726, true, true, nn.field_b[2].field_b);
              }
            } else {
              if (var4 == 57) {
                if (this.field_B.b((byte) 56)) {
                  ac.a(param0 ^ -16726, true, true, nn.field_b[3].field_b);
                }
              } else {
                if (58 == var4) {
                  if (this.field_B.b((byte) 62)) {
                    ac.a(param0 + 16726, true, true, nn.field_b[4].field_b);
                  }
                } else {
                  if (59 != var4) {
                    if (var4 != 60) {
                      super.b(-16470, param1, param2);
                    } else {
                      if (this.field_B.b((byte) 125)) {
                        ac.a(256, true, true, jh.field_d);
                      }
                    }
                  } else {
                    if (this.field_B.b((byte) 73)) {
                      ac.a(256, true, true, ul.field_m);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 == -16470) {
          return;
        }
        jo.g(-10, -105);
    }

    static {
        field_L = "Message lobby";
        field_J = 0;
        field_I = new String[]{"Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Player 6", "Player 7", "Player 8"};
    }
}
