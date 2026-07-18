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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                L2: {
                  if (!param0.b(false)) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var3_int = stackIn_6_0;
                  ((ob) this).field_M = 0;
                  stackOut_6_0 = this;
                  stackOut_6_1 = param0.field_j;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var3_int != 0) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 926720;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L3;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 1310720;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L3;
                  }
                }
                L4: {
                  ((ob) this).field_N = stackIn_9_1 * stackIn_9_2 + param0.field_kb;
                  stackOut_9_0 = this;
                  stackOut_9_1 = param0.field_bb;
                  stackOut_9_2 = param0.field_n;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  if (var3_int != 0) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = stackIn_11_1;
                    stackOut_11_2 = stackIn_11_2;
                    stackOut_11_3 = 602368;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    break L4;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = stackIn_10_2;
                    stackOut_10_3 = 851968;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    break L4;
                  }
                }
                ((ob) this).field_E = stackIn_12_1 - -(stackIn_12_2 * stackIn_12_3);
                break L1;
              } else {
                break L1;
              }
            }
            var3_int = -((ob) this).field_O + ((ob) this).field_N;
            if (param1 > 32) {
              L5: {
                var4 = -((ob) this).field_K + ((ob) this).field_E;
                ((ob) this).field_K = ((ob) this).field_E;
                ((ob) this).field_O = ((ob) this).field_N;
                if (ia.field_c) {
                  var3_int = -var3_int;
                  var4 = -var4;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (var3_int != 0) {
                    break L7;
                  } else {
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                if (8388608 <= Math.abs(var3_int)) {
                  break L6;
                } else {
                  if (Math.abs(var4) >= 8388608) {
                    break L6;
                  } else {
                    var5 = tu.a(var3_int, var4, -23146);
                    if (var5 == 0) {
                      break L6;
                    } else {
                      var4 = (int)(((long)var4 << 16) / (long)var5);
                      var3_int = (int)(((long)var3_int << 16) / (long)var5);
                      tf.field_d.a(var3_int, true, 0, var4, var5 >> 12);
                      ((ob) this).field_Q.a(tf.field_d, -49);
                      ((ob) this).field_L = true;
                      break L6;
                    }
                  }
                }
              }
              L8: {
                if (!((ob) this).field_k) {
                  if (!((ob) this).field_y) {
                    if (((ob) this).field_x) {
                      var5 = 41;
                      var6 = tu.a(var3_int, var4, -23146);
                      var7 = var6 >> 10;
                      wh discarded$2 = he.a(128, false, 240, we.field_f + var7, var5);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                } else {
                  L9: {
                    if (ih.field_c == 0) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      break L9;
                    } else {
                      if (ih.field_c == 1) {
                        stackOut_29_0 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        break L9;
                      } else {
                        stackOut_28_0 = 2;
                        stackIn_31_0 = stackOut_28_0;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    var5 = stackIn_31_0;
                    if (0 == ((ob) this).field_n) {
                      var6 = 16;
                      break L10;
                    } else {
                      var6 = (((ob) this).field_n >> 16) * 32;
                      break L10;
                    }
                  }
                  L11: {
                    if (ih.field_c == 0) {
                      var6 -= 40;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (ih.field_c == 1) {
                      var6 -= 20;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (ih.field_c == 2) {
                      var6 -= 40;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  wh discarded$3 = he.a(128, false, 240, var6 - -jo.field_E, var5);
                  break L8;
                }
              }
              L14: {
                if (((ob) this).field_A <= 0) {
                  break L14;
                } else {
                  L15: {
                    var5 = ((ob) this).e(92) >> 16;
                    var6 = var5 * 160 / 324;
                    if (var6 > 255) {
                      var6 = 255;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  bv.a((ob) this, 256, var6);
                  break L14;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var3;
            stackOut_55_1 = new StringBuilder().append("ob.OA(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param1 + ')');
        }
    }

    public static void i(int param0) {
        field_R = null;
        int var1 = 60;
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
            var3 = (((ob) this).field_M >> 15) + 256;
            if (var3 > 512) {
                var3 = 512;
            }
            var2 = (var2 << 8) / var3;
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
        return ((ob) this).field_N >> 16;
    }

    final static int a(int param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        uo var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (param0 != -1) {
              L1: {
                var2 = ep.field_c[param0];
                var5 = -26;
                var3 = pb.field_C;
                var4 = 300;
                var6 = ((hu) (Object) var3).b(var2, var4);
                if (var6 > 3) {
                  L2: while (true) {
                    if (((hu) (Object) var3).b(var2, var4) <= 3) {
                      break L1;
                    } else {
                      var4 += 20;
                      continue L2;
                    }
                  }
                } else {
                  if (var6 > 1) {
                    L3: while (true) {
                      if (((hu) (Object) var3).b(var2, var4) != var6) {
                        if (var4 <= 500) {
                          break L1;
                        } else {
                          var4 = 300;
                          break L1;
                        }
                      } else {
                        var4 += 20;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = 94 + var4;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "ob.MA(" + param0 + ',' + -128 + ')');
        }
        return stackIn_14_0;
    }

    final void a(byte param0, int param1, la[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4_int = ((ob) this).field_t;
            var5 = ((ob) this).field_p;
            var6 = ((ob) this).field_v;
            super.a((byte) -81, param1, param2);
            if (((ob) this).field_I) {
              L1: {
                ((ob) this).field_N = ((ob) this).field_N + (((ob) this).field_t - var4_int);
                var7 = 111 / ((param0 - -3) / 59);
                ((ob) this).field_M = ((ob) this).field_M + (((ob) this).field_v + -var6);
                ((ob) this).field_E = ((ob) this).field_E + (((ob) this).field_p - var5);
                if (!((ob) this).field_S) {
                  break L1;
                } else {
                  L2: {
                    ((ob) this).field_N = ((ob) this).field_t - -(7 * ((ob) this).field_N) >> 3;
                    ((ob) this).field_M = ((ob) this).field_v - -(7 * ((ob) this).field_M) >> 3;
                    ((ob) this).field_E = ((ob) this).field_p + ((ob) this).field_E * 7 >> 3;
                    var8 = ((ob) this).field_N - ((ob) this).field_t >> 16;
                    var9 = ((ob) this).field_E - ((ob) this).field_p >> 16;
                    var10 = -((ob) this).field_v + ((ob) this).field_M >> 16;
                    var11 = var10 * var10 + (var8 * var8 + var9 * var9);
                    if (var11 <= 2) {
                      break L2;
                    } else {
                      if (-1 != ((ob) this).field_m) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ((ob) this).field_S = false;
                  break L1;
                }
              }
              break L0;
            } else {
              ((ob) this).field_M = ((ob) this).field_v;
              ((ob) this).field_N = ((ob) this).field_t;
              ((ob) this).field_E = ((ob) this).field_p;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ob.JA(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final int c(boolean param0) {
        if (!param0) {
            ((ob) this).field_L = false;
        }
        int var2 = ((ob) this).field_E >> 16;
        int var3 = ((ob) this).field_M >> 16;
        if (!(var3 > 0)) {
            return var2;
        }
        if (var3 >= 1000) {
            var3 = 999;
        }
        int var4 = var3 * 1000 / (-var3 + 1000);
        if (!(!ia.field_c)) {
            return var4 + var2;
        }
        return -var4 + var2;
    }

    final static boolean m(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1_int = -78 % ((param0 - -26) / 53);
              if (null == mh.field_q) {
                mh.field_q = mk.a(4, 26731);
                break L1;
              } else {
                break L1;
              }
            }
            if (mh.field_q.field_f) {
              var6 = bh.field_f;
              var7 = mh.field_q.field_e;
              var4 = 0;
              L2: while (true) {
                if (var4 >= 8) {
                  var8 = ha.field_F;
                  var9 = mh.field_q.field_e;
                  var10 = 0;
                  var4 = var10;
                  L3: while (true) {
                    if (8 <= var10) {
                      mh.field_q = null;
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      var8[var10] = qj.b(var8[var10], ~var9[var10]);
                      var10++;
                      continue L3;
                    }
                  }
                } else {
                  var6[var4] = hf.a(var6[var4], var7[var4]);
                  var4++;
                  continue L2;
                }
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "ob.HA(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final void l(int param0) {
        int var2 = 0;
        int var8 = Kickabout.field_G;
        m.field_d = new int[32];
        if (param0 >= -7) {
            return;
        }
        for (var2 = 0; var2 < m.field_d.length; var2++) {
            m.field_d[var2] = 65793 * (var2 << 3);
        }
        var2 = ((ob) this).field_M >> 16;
        if (!(var2 <= 256)) {
            var2 = 256;
        }
        if (var2 < 0) {
            var2 = 0;
        }
        int var3 = hw.field_i * (14 - (var2 * 14 >> 10)) >> 8;
        int var4 = -5 * hw.field_i >> 8;
        int var5 = 4 * hw.field_i >> 8;
        int var6 = -1 + m.field_d.length;
        int var7 = (var2 * (var6 >> 1) >> 8) + (var6 >> 1);
        nh.a(ug.a(0, ((ob) this).field_N >> 16) + var4 << 4, lf.a((byte) -96, ((ob) this).field_E >> 16) + var5 << 4, var3 << 4, var7, m.field_d);
    }

    final void a(mo param0, int param1, int param2, int param3) {
        tj var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5 = (tj) (Object) param0;
            if (((ob) this).a(-108, (mo) (Object) var5, param2, param1)) {
              return;
            } else {
              L1: {
                ((ob) this).a(param0, false);
                if (param3 >= 38) {
                  break L1;
                } else {
                  ((ob) this).field_D = null;
                  break L1;
                }
              }
              L2: {
                if (((ob) this).field_S) {
                  break L2;
                } else {
                  if (((ob) this).field_m == -1) {
                    var6 = -((ob) this).field_t + ((ob) this).field_N >> 16;
                    var7 = -((ob) this).field_p + ((ob) this).field_E >> 16;
                    var8 = ((ob) this).field_M + -((ob) this).field_v >> 16;
                    var9 = var8 * var8 + var6 * var6 - -(var7 * var7);
                    if (var9 <= 144) {
                      break L2;
                    } else {
                      ((ob) this).field_S = true;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5_ref;
            stackOut_11_1 = new StringBuilder().append("ob.LA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = ei.a(300, (byte) -23);
        int var5 = we.a(300, false);
        ((ob) this).field_J = param1;
        ((ob) this).field_D[3] = 65536;
        ((ob) this).field_D[1] = var4 * param1 >> 16;
        ((ob) this).field_D[8] = -var4;
        int var6 = 3 / ((param0 - 11) / 54);
        ((ob) this).field_D[11] = var5;
        ((ob) this).field_D[10] = -var4;
        ((ob) this).field_D[2] = var5 * -param1 >> 16;
        ((ob) this).field_D[7] = -var5;
    }

    final static String a(byte param0, tv param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        String stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -92) {
                break L1;
              } else {
                field_T = null;
                break L1;
              }
            }
            L2: {
              var2 = null;
              if (param1.field_h == null) {
                break L2;
              } else {
                L3: {
                  var5 = param1.field_h;
                  var2 = (Object) (Object) var5;
                  var2 = (Object) (Object) var5;
                  if (param1.field_o != 1) {
                    break L3;
                  } else {
                    var2 = (Object) (Object) ("<img=0>" + var5);
                    break L3;
                  }
                }
                if (param1.field_o != 2) {
                  break L2;
                } else {
                  var2 = (Object) (Object) ("<img=1>" + (String) var2);
                  break L2;
                }
              }
            }
            L4: {
              var3 = "";
              if (param1.field_c != 2) {
                L5: {
                  if (0 != param1.field_c) {
                    break L5;
                  } else {
                    if (!uk.field_d) {
                      break L5;
                    } else {
                      var3 = "[" + qt.field_z + "] ";
                      break L5;
                    }
                  }
                }
                L6: {
                  if (1 == param1.field_c) {
                    var3 = "[" + vo.a((byte) -18, bv.field_m, new String[1]) + "] ";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_c != 4) {
                    break L7;
                  } else {
                    if (null == ct.field_x) {
                      break L7;
                    } else {
                      var3 = "[" + ct.field_x + "] ";
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param1.field_c == 3) {
                    var3 = "[#" + param1.field_l + "] ";
                    break L8;
                  } else {
                    break L8;
                  }
                }
                if (!param1.field_m) {
                  var3 = var3 + (String) var2 + ": ";
                  break L4;
                } else {
                  break L4;
                }
              } else {
                if (param1.field_m) {
                  break L4;
                } else {
                  L9: {
                    if (param1.field_j != 0) {
                      break L9;
                    } else {
                      if (param1.field_p == 0) {
                        var3 = vo.a((byte) -18, b.field_F, new String[1]);
                        break L4;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var3 = vo.a((byte) -18, hd.field_ib, new String[1]);
                  break L4;
                }
              }
            }
            stackOut_30_0 = (String) var3;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_32_0 = var2;
            stackOut_32_1 = new StringBuilder().append("ob.AA(").append(param0).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param1 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
        return stackIn_31_0;
    }

    final static void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = param4 - -param1;
              var6 = param3 + param2;
              if (on.field_b >= param4) {
                stackOut_3_0 = on.field_b;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (on.field_e >= param2) {
                stackOut_6_0 = on.field_e;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param2;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (on.field_c <= var5_int) {
                stackOut_9_0 = on.field_c;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (on.field_h > var6) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = on.field_h;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (on.field_b > param4) {
                break L5;
              } else {
                if (on.field_c <= param4) {
                  break L5;
                } else {
                  var11 = param4 + var8 * on.field_g;
                  var12 = -var8 + var10 + 1 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      on.field_a[var11] = 16777215;
                      var11 = var11 + on.field_g * 2;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (on.field_e > param2) {
                break L7;
              } else {
                if (var6 >= on.field_h) {
                  break L7;
                } else {
                  var11 = on.field_g * param2 + var7;
                  var12 = 1 + (var9 + -var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      on.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (param0 == 2) {
                break L9;
              } else {
                boolean discarded$1 = ob.m(53);
                break L9;
              }
            }
            L10: {
              if (on.field_b > var5_int) {
                break L10;
              } else {
                if (on.field_c <= var5_int) {
                  break L10;
                } else {
                  var11 = ((1 & var5_int + -param4) + var8) * on.field_g + var5_int;
                  var12 = 1 + (var10 + -var8) >> 1;
                  L11: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L10;
                    } else {
                      on.field_a[var11] = 16777215;
                      var11 = var11 + on.field_g * 2;
                      continue L11;
                    }
                  }
                }
              }
            }
            L12: {
              if (on.field_e > param2) {
                break L12;
              } else {
                if (var6 < on.field_h) {
                  var11 = (1 & var6 - param2) + on.field_g * var6 + var7;
                  var12 = var9 + 1 + -var7 >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      on.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var5, "ob.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void h(int param0) {
        if (param0 != 64) {
            return;
        }
        int var2 = ((ob) this).j(-1);
        int var3 = ug.a(0, this.k(param0 + 14899));
        int var4 = lf.a((byte) -107, ((ob) this).c(true));
        if (tb.field_v != 1) {
            var2 = (var2 << 8) / hw.field_i;
            ((ob) this).a(300, var3, var4, var2, 300);
        } else {
            iw.a(-115, kw.field_f);
            on.b();
            var2 = (var2 << 7) / hw.field_i;
            ((ob) this).a(300, 64, 64, var2, 300);
            ta.e(118);
            kw.field_f.f(var3 - 32, -32 + var4);
        }
    }

    ob(tj param0) {
        ((ob) this).field_I = true;
        try {
            ((ob) this).a((mo) (Object) param0, false);
            ((ob) this).field_G = new int[12];
            ((ob) this).field_Q = new cc();
            ((ob) this).field_Q.a(8, ((ob) this).field_G);
            ((ob) this).field_D = new int[12];
            this.a((byte) 127, 1200, 300);
            ((ob) this).field_N = ((ob) this).field_t;
            ((ob) this).field_M = ((ob) this).field_v;
            ((ob) this).field_E = ((ob) this).field_p;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
