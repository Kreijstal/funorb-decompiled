/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends tj {
    private int[] field_G;
    static boolean[] field_T;
    private int[] field_D;
    private cc field_Q;
    static String field_H;
    private int field_J;
    static int field_C;
    boolean field_I;
    int field_N;
    private boolean field_S;
    int field_E;
    private int field_O;
    private int field_K;
    private boolean field_L;
    static String field_F;
    static String field_R;
    static int field_B;
    private int field_M;

    final void a(gm param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_31_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var8 = Kickabout.field_G;
          if (param0 != null) {
            L1: {
              if (!param0.b(false)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var3 = stackIn_5_0;
              ((ob) this).field_M = 0;
              stackOut_5_0 = this;
              stackOut_5_1 = param0.field_j;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              if (var3 != 0) {
                stackOut_7_0 = this;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = 926720;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                break L2;
              } else {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 1310720;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                break L2;
              }
            }
            L3: {
              ((ob) this).field_N = stackIn_8_1 * stackIn_8_2 + param0.field_kb;
              stackOut_8_0 = this;
              stackOut_8_1 = param0.field_bb;
              stackOut_8_2 = param0.field_n;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              if (var3 != 0) {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = 602368;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = stackOut_10_3;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 851968;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_11_3 = stackOut_9_3;
                break L3;
              }
            }
            ((ob) this).field_E = stackIn_11_1 - -(stackIn_11_2 * stackIn_11_3);
            break L0;
          } else {
            break L0;
          }
        }
        var3 = -((ob) this).field_O + ((ob) this).field_N;
        if (param1 > 32) {
          L4: {
            var4 = -((ob) this).field_K + ((ob) this).field_E;
            ((ob) this).field_K = ((ob) this).field_E;
            ((ob) this).field_O = ((ob) this).field_N;
            if (ia.field_c) {
              var3 = -var3;
              var4 = -var4;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            L6: {
              if (-1 != var3) {
                break L6;
              } else {
                if (var4 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (8388608 <= Math.abs(var3)) {
              break L5;
            } else {
              if (-8388609 <= Math.abs(var4)) {
                break L5;
              } else {
                var5 = tu.a(var3, var4, -23146);
                if (-1 == (var5 ^ -1)) {
                  break L5;
                } else {
                  var4 = (int)(((long)var4 << 1948786384) / (long)var5);
                  var3 = (int)(((long)var3 << -404766640) / (long)var5);
                  tf.field_d.a(var3, true, 0, var4, var5 >> 611838860);
                  ((ob) this).field_Q.a(tf.field_d, -49);
                  ((ob) this).field_L = true;
                  break L5;
                }
              }
            }
          }
          L7: {
            if (!((ob) this).field_k) {
              if (!((ob) this).field_y) {
                if (((ob) this).field_x) {
                  var5 = 41;
                  var6 = tu.a(var3, var4, -23146);
                  var7 = var6 >> -1488064406;
                  wh discarded$2 = he.a(128, false, 240, we.field_f + var7, var5);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            } else {
              L8: {
                if (ih.field_c != 0) {
                  if ((ih.field_c ^ -1) != -2) {
                    stackOut_29_0 = 2;
                    stackIn_31_0 = stackOut_29_0;
                    break L8;
                  } else {
                    stackOut_28_0 = 1;
                    stackIn_31_0 = stackOut_28_0;
                    break L8;
                  }
                } else {
                  stackOut_26_0 = 0;
                  stackIn_31_0 = stackOut_26_0;
                  break L8;
                }
              }
              L9: {
                var5 = stackIn_31_0;
                if (0 == ((ob) this).field_n) {
                  var6 = 16;
                  break L9;
                } else {
                  var6 = (((ob) this).field_n >> -1974629264) * 32;
                  break L9;
                }
              }
              L10: {
                if (ih.field_c == 0) {
                  var6 -= 40;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-2 == (ih.field_c ^ -1)) {
                  var6 -= 20;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (ih.field_c == 2) {
                  var6 -= 40;
                  break L12;
                } else {
                  break L12;
                }
              }
              wh discarded$3 = he.a(128, false, 240, var6 - -jo.field_E, var5);
              break L7;
            }
          }
          L13: {
            if (((ob) this).field_A >= -1) {
              break L13;
            } else {
              L14: {
                var5 = ((ob) this).e(92) >> 612786672;
                var6 = var5 * 160 / 324;
                if (-256 < var6) {
                  var6 = 255;
                  break L14;
                } else {
                  break L14;
                }
              }
              bv.a((ob) this, 256, var6);
              break L13;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_R = null;
        int var1 = -60 / ((43 - param0) / 45);
        field_F = null;
        field_H = null;
        field_T = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, param2, param3);
        ((ob) this).field_N = param0;
        ((ob) this).field_M = param1;
        ((ob) this).field_E = param3;
    }

    final int j(int param0) {
        int var3 = 0;
        if (param0 != -1) {
            return 110;
        }
        int var2 = 1200;
        if (7 == ((ob) this).field_l) {
            var2 = 4300;
        }
        if (0 != ((ob) this).field_M) {
            var3 = (((ob) this).field_M >> -1249099633) + 256;
            if (var3 > 512) {
                var3 = 512;
            }
            var2 = (var2 << 167320168) / var3;
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        t.c();
        t.b(param1, param2);
        if (param4 != 300) {
            Object var7 = null;
            String discarded$0 = ob.a((byte) -13, (tv) null);
        }
        if (!(!((ob) this).field_L)) {
            ((ob) this).field_Q.a(8, ((ob) this).field_G);
            ((ob) this).field_L = false;
        }
        if (((ob) this).field_J != param3) {
            this.a((byte) -113, param3, 300);
        }
        qo.field_l[((ob) this).field_l].a(((ob) this).field_D, ((ob) this).field_G);
    }

    private final int k(int param0) {
        if (param0 != 14963) {
            return -121;
        }
        return ((ob) this).field_N >> 1753124112;
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        uo var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        if ((param0 ^ -1) != 0) {
          L0: {
            var2 = ep.field_c[param0];
            var5 = 26 / ((param1 - -55) / 54);
            var3 = pb.field_C;
            var4 = 300;
            var6 = ((hu) (Object) var3).b(var2, var4);
            if (var6 > 3) {
              L1: while (true) {
                if (-4 <= (((hu) (Object) var3).b(var2, var4) ^ -1)) {
                  break L0;
                } else {
                  var4 += 20;
                  continue L1;
                }
              }
            } else {
              if (var6 > 1) {
                L2: while (true) {
                  if (((hu) (Object) var3).b(var2, var4) != var6) {
                    if (var4 <= 500) {
                      break L0;
                    } else {
                      var4 = 300;
                      break L0;
                    }
                  } else {
                    var4 += 20;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return 94 + var4;
        } else {
          return 0;
        }
    }

    final void a(byte param0, int param1, la[] param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var4 = ((ob) this).field_t;
        var5 = ((ob) this).field_p;
        var6 = ((ob) this).field_v;
        super.a((byte) -81, param1, param2);
        if (((ob) this).field_I) {
          L0: {
            ((ob) this).field_N = ((ob) this).field_N + (((ob) this).field_t - var4);
            var7 = 111 / ((param0 - -3) / 59);
            ((ob) this).field_M = ((ob) this).field_M + (((ob) this).field_v + -var6);
            ((ob) this).field_E = ((ob) this).field_E + (((ob) this).field_p - var5);
            if (!((ob) this).field_S) {
              break L0;
            } else {
              L1: {
                ((ob) this).field_N = ((ob) this).field_t - -(7 * ((ob) this).field_N) >> -718981405;
                ((ob) this).field_M = ((ob) this).field_v - -(7 * ((ob) this).field_M) >> -369627069;
                ((ob) this).field_E = ((ob) this).field_p + ((ob) this).field_E * 7 >> -140620349;
                var8 = ((ob) this).field_N - ((ob) this).field_t >> 1078548144;
                var9 = ((ob) this).field_E - ((ob) this).field_p >> 839055088;
                var10 = -((ob) this).field_v + ((ob) this).field_M >> -988451184;
                var11 = var10 * var10 + (var8 * var8 + var9 * var9);
                if (-3 <= (var11 ^ -1)) {
                  break L1;
                } else {
                  if (-1 != ((ob) this).field_m) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              ((ob) this).field_S = false;
              break L0;
            }
          }
          return;
        } else {
          ((ob) this).field_M = ((ob) this).field_v;
          ((ob) this).field_N = ((ob) this).field_t;
          ((ob) this).field_E = ((ob) this).field_p;
          return;
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            ((ob) this).field_L = false;
        }
        int var2 = ((ob) this).field_E >> 249327504;
        int var3 = ((ob) this).field_M >> -801529648;
        if (!(-1 > var3)) {
            return var2;
        }
        if (-1001 <= var3) {
            var3 = 999;
        }
        int var4 = var3 * 1000 / (-var3 + 1000);
        if (!(!ia.field_c)) {
            return var4 + var2;
        }
        return -var4 + var2;
    }

    final static boolean m(int param0) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        int var1 = -78 % ((param0 - -26) / 53);
        if (!(null != mh.field_q)) {
            mh.field_q = mk.a(4, 26731);
        }
        if (!mh.field_q.field_f) {
            return false;
        }
        int[] var6 = bh.field_f;
        int[] var7 = mh.field_q.field_e;
        for (var4 = 0; var4 < 8; var4++) {
            var6[var4] = hf.a(var6[var4], var7[var4]);
        }
        int[] var8 = ha.field_F;
        int[] var9 = mh.field_q.field_e;
        int var10 = 0;
        var4 = var10;
        while (8 > var10) {
            var8[var10] = qj.b(var8[var10], var9[var10] ^ -1);
            var10++;
        }
        mh.field_q = null;
        return true;
    }

    final void l(int param0) {
        int var2 = 0;
        int var8 = Kickabout.field_G;
        m.field_d = new int[32];
        if (param0 >= -7) {
            return;
        }
        for (var2 = 0; var2 < m.field_d.length; var2++) {
            m.field_d[var2] = 65793 * (var2 << -2044549885);
        }
        var2 = ((ob) this).field_M >> -1504899056;
        if (!(var2 <= 256)) {
            var2 = 256;
        }
        if (var2 < 0) {
            var2 = 0;
        }
        int var3 = hw.field_i * (14 - (var2 * 14 >> 563266506)) >> 499231400;
        int var4 = -5 * hw.field_i >> 1675651144;
        int var5 = 4 * hw.field_i >> -921834936;
        int var6 = -1 + m.field_d.length;
        int var7 = (var2 * (var6 >> -564662207) >> -236810072) + (var6 >> 1089703009);
        nh.a(ug.a(0, ((ob) this).field_N >> -1778193104) + var4 << -1865452636, lf.a((byte) -96, ((ob) this).field_E >> 147313136) + var5 << 862668228, var3 << 37660900, var7, m.field_d);
    }

    final void a(mo param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tj var5 = (tj) (Object) param0;
        if (!(!((ob) this).a(-108, (mo) (Object) var5, param2, param1))) {
            return;
        }
        ((ob) this).a(param0, false);
        if (param3 < 38) {
            ((ob) this).field_D = null;
        }
        if (!((ob) this).field_S) {
            if (!((((ob) this).field_m ^ -1) != 0)) {
                var6 = -((ob) this).field_t + ((ob) this).field_N >> -321077296;
                var7 = -((ob) this).field_p + ((ob) this).field_E >> -351960752;
                var8 = ((ob) this).field_M + -((ob) this).field_v >> 1641559376;
                var9 = var8 * var8 + var6 * var6 - -(var7 * var7);
                if (-145 > (var9 ^ -1)) {
                    ((ob) this).field_S = true;
                }
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = ei.a(param2, (byte) -23);
        int var5 = we.a(param2, false);
        ((ob) this).field_J = param1;
        ((ob) this).field_D[3] = 65536;
        ((ob) this).field_D[1] = var4 * param1 >> 1687234128;
        ((ob) this).field_D[8] = -var4;
        int var6 = 3 / ((param0 - 11) / 54);
        ((ob) this).field_D[11] = var5;
        ((ob) this).field_D[10] = -var4;
        ((ob) this).field_D[2] = var5 * -param1 >> 1663363728;
        ((ob) this).field_D[7] = -var5;
    }

    final static String a(byte param0, tv param1) {
        String var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        L0: {
          var4 = Kickabout.field_G;
          if (param0 == -92) {
            break L0;
          } else {
            field_T = null;
            break L0;
          }
        }
        L1: {
          var2 = null;
          if (param1.field_h == null) {
            break L1;
          } else {
            L2: {
              var5 = param1.field_h;
              var2 = var5;
              var2 = var5;
              if ((param1.field_o ^ -1) != -2) {
                break L2;
              } else {
                var2 = "<img=0>" + var5;
                break L2;
              }
            }
            if (param1.field_o != -3) {
              break L1;
            } else {
              var2 = "<img=1>" + var2;
              break L1;
            }
          }
        }
        L3: {
          var3 = "";
          if (-3 != param1.field_c) {
            L4: {
              if (0 != param1.field_c) {
                break L4;
              } else {
                if (!uk.field_d) {
                  break L4;
                } else {
                  var3 = "[" + qt.field_z + "] ";
                  break L4;
                }
              }
            }
            L5: {
              if (1 == param1.field_c) {
                var3 = "[" + vo.a((byte) -18, bv.field_m, new String[1]) + "] ";
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-5 != (param1.field_c ^ -1)) {
                break L6;
              } else {
                if (null == ct.field_x) {
                  break L6;
                } else {
                  var3 = "[" + ct.field_x + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if (-4 == (param1.field_c ^ -1)) {
                var3 = "[#" + param1.field_l + "] ";
                break L7;
              } else {
                break L7;
              }
            }
            if (!param1.field_m) {
              var3 = var3 + var2 + ": ";
              break L3;
            } else {
              break L3;
            }
          } else {
            if (param1.field_m) {
              break L3;
            } else {
              L8: {
                if (param1.field_j != -1) {
                  break L8;
                } else {
                  if (-1 == param1.field_p) {
                    var3 = vo.a((byte) -18, b.field_F, new String[1]);
                    break L3;
                  } else {
                    break L8;
                  }
                }
              }
              var3 = vo.a((byte) -18, hd.field_ib, new String[1]);
              break L3;
            }
          }
        }
        return var3;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = Kickabout.field_G;
          var5 = param4 - -param1;
          var6 = param3 + param2;
          if (on.field_b >= param4) {
            stackOut_2_0 = on.field_b;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (on.field_e >= param2) {
            stackOut_5_0 = on.field_e;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param2;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (on.field_c <= var5) {
            stackOut_8_0 = on.field_c;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (on.field_h > var6) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = on.field_h;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          if (on.field_b > param4) {
            break L4;
          } else {
            if (on.field_c <= param4) {
              break L4;
            } else {
              var11 = param4 + var8 * on.field_g;
              var12 = -var8 + var10 + 1 >> -191204959;
              L5: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L4;
                } else {
                  on.field_a[var11] = 16777215;
                  var11 = var11 + on.field_g * 2;
                  continue L5;
                }
              }
            }
          }
        }
        L6: {
          if (on.field_e > param2) {
            break L6;
          } else {
            if (var6 >= on.field_h) {
              break L6;
            } else {
              var11 = on.field_g * param2 + var7;
              var12 = 1 + (var9 + -var7) >> -871397503;
              L7: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  break L6;
                } else {
                  on.field_a[var11] = 16777215;
                  var11 += 2;
                  continue L7;
                }
              }
            }
          }
        }
        L8: {
          if (param0 == 2) {
            break L8;
          } else {
            boolean discarded$1 = ob.m(53);
            break L8;
          }
        }
        L9: {
          if (on.field_b > var5) {
            break L9;
          } else {
            if (on.field_c <= var5) {
              break L9;
            } else {
              var11 = ((1 & var5 + -param4) + var8) * on.field_g + var5;
              var12 = 1 + (var10 + -var8) >> 1861002849;
              L10: while (true) {
                var12--;
                if (0 > var12) {
                  break L9;
                } else {
                  on.field_a[var11] = 16777215;
                  var11 = var11 + on.field_g * 2;
                  continue L10;
                }
              }
            }
          }
        }
        L11: {
          if (on.field_e > param2) {
            break L11;
          } else {
            if (var6 < on.field_h) {
              var11 = (1 & var6 - param2) + on.field_g * var6 + var7;
              var12 = var9 + 1 + -var7 >> 1675471009;
              L12: while (true) {
                var12--;
                if ((var12 ^ -1) > -1) {
                  break L11;
                } else {
                  on.field_a[var11] = 16777215;
                  var11 += 2;
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
        }
    }

    final void h(int param0) {
        if (param0 != 64) {
            return;
        }
        int var2 = ((ob) this).j(-1);
        int var3 = ug.a(0, this.k(param0 + 14899));
        int var4 = lf.a((byte) -107, ((ob) this).c(true));
        if ((tb.field_v ^ -1) != -2) {
            var2 = (var2 << 1925238920) / hw.field_i;
            ((ob) this).a(300, var3, var4, var2, 300);
        } else {
            iw.a(-115, kw.field_f);
            on.b();
            var2 = (var2 << 1427809543) / hw.field_i;
            ((ob) this).a(300, 64, 64, var2, 300);
            ta.e(118);
            kw.field_f.f(var3 - 32, -32 + var4);
        }
    }

    ob(tj param0) {
        ((ob) this).field_I = true;
        ((ob) this).a((mo) (Object) param0, false);
        ((ob) this).field_G = new int[12];
        ((ob) this).field_Q = new cc();
        ((ob) this).field_Q.a(8, ((ob) this).field_G);
        ((ob) this).field_D = new int[12];
        this.a((byte) 127, 1200, 300);
        ((ob) this).field_N = ((ob) this).field_t;
        ((ob) this).field_M = ((ob) this).field_v;
        ((ob) this).field_E = ((ob) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = new boolean[7];
        field_H = "Yes";
        field_F = "You must be a member to play with the current options.";
        field_R = "You must have unlocked the \"<%0>\" Achievement to wear this kit.";
        field_B = 22;
    }
}
