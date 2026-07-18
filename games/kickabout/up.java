/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class up implements lv {
    static String field_d;
    static sj field_m;
    int field_q;
    int field_e;
    int field_j;
    static char[] field_a;
    static double field_f;
    int field_g;
    boolean field_c;
    static int field_p;
    int field_n;
    int field_l;
    int[] field_h;
    int field_o;
    static sj field_k;
    static long field_b;
    int field_i;
    int field_r;

    final boolean c(boolean param0, int param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param0) {
            var7 = ((up) this).field_h;
            int[] var3 = var7;
            for (var4 = 0; var4 < var7.length; var4++) {
                var5 = var7[var4];
                if (!(!pa.field_g[var5].p(-32076))) {
                    return true;
                }
            }
        }
        if (param1 > -59) {
            return false;
        }
        return 3 == ((up) this).field_q ? true : false;
    }

    final boolean b(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 != 100) {
            int discarded$0 = ((up) this).a(false, false);
        }
        if (!param0) {
            return false;
        }
        int[] var7 = ((up) this).field_h;
        int[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (pa.field_g[var5].a(false)) {
                return true;
            }
        }
        return false;
    }

    final void a(byte param0, up param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (!param1.c(-2)) {
              L1: {
                ((up) this).field_r = param1.field_r;
                ((up) this).field_q = param1.field_q;
                ((up) this).field_g = param1.field_g;
                ((up) this).field_o = param1.field_o;
                ((up) this).field_n = param1.field_n;
                ((up) this).field_l = param1.field_l;
                ((up) this).field_e = param1.field_e;
                if (param1.field_h.length != ((up) this).field_h.length) {
                  ((up) this).field_h = new int[param1.field_h.length];
                  var5 = 0;
                  var3_int = var5;
                  L2: while (true) {
                    if (((up) this).field_h.length <= var5) {
                      break L1;
                    } else {
                      ((up) this).field_h[var5] = param1.field_h[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var3_int = 0;
                  L3: while (true) {
                    if (((up) this).field_h.length <= var3_int) {
                      break L1;
                    } else {
                      ((up) this).field_h[var3_int] = param1.field_h[var3_int];
                      var3_int++;
                      continue L3;
                    }
                  }
                }
              }
              L4: {
                if (param0 < -56) {
                  break L4;
                } else {
                  field_p = -88;
                  break L4;
                }
              }
              ((up) this).field_j = param1.field_j;
              ((up) this).field_c = param1.field_c;
              break L0;
            } else {
              ((up) this).b((byte) -7);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("up.H(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final boolean f(int param0) {
        if (((up) this).field_i == 0) {
            return jd.f(-1);
        }
        if (param0 != 13467) {
            return true;
        }
        return ((up) this).field_i == 1 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != -2) {
            Object var3 = null;
            ((up) this).a(-56, (iw) null);
        }
        if (((up) this).field_q != -1) {
            return false;
        }
        return true;
    }

    final int a(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + ((up) this).field_o;
        var3 = var3 + ((up) this).b((byte) 64, param0);
        return var3;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param0, (byte) 85);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        var2.a(112, 2);
        var2.a(0, er.field_h.length, 1991220144, er.field_h);
        var2.a(124, lk.field_l);
        var2.a(124, ru.field_C);
        var2.a(0, rf.field_d.length, 1991220144, rf.field_d);
        var2.c(62, -var3 + var2.field_n);
    }

    final void a(int param0, iw param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            int discarded$1 = param1.h((byte) -126);
            ((up) this).field_q = (7 & param1.h((byte) -127)) - 1;
            ((up) this).field_j = param1.a((byte) 81);
            ((up) this).field_e = param1.h((byte) -112);
            ((up) this).field_l = param1.h((byte) -118);
            ((up) this).field_n = param1.h((byte) -122);
            ((up) this).field_g = param1.h((byte) -119);
            ((up) this).field_o = param1.h((byte) -126);
            if (param0 > 13) {
              ((up) this).field_r = param1.h((byte) -124);
              var12 = new int[3];
              var11 = var12;
              var10 = var11;
              var9 = var10;
              var7 = var9;
              var3_array = var7;
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= 3) {
                  ((up) this).field_h = new int[var4];
                  var8 = 0;
                  var5 = var8;
                  L2: while (true) {
                    if (var4 <= var8) {
                      break L0;
                    } else {
                      ((up) this).field_h[var8] = var12[var8];
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  L3: {
                    var7[var5] = -1 + param1.h((byte) -122);
                    if (var12[var5] == -1) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("up.GA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final int b(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
            return 0;
        }
        int var3 = 0;
        int[] var4 = ((up) this).field_h;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var3 = var3 + pa.field_g[var6].o(126);
        }
        var6 = 19 % ((10 - param0) / 50);
        return var3;
    }

    final boolean a(boolean param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (param1 >= -103) {
            return false;
        }
        if (!(param0)) {
            return false;
        }
        int[] var7 = ((up) this).field_h;
        int[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(!pa.field_g[var5].k(-21636))) {
                return true;
            }
        }
        return false;
    }

    final boolean a(boolean param0, int param1, boolean param2) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        fn var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = Kickabout.field_G;
        if (!param2) {
          return false;
        } else {
          L0: {
            var13 = ((up) this).field_h;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var9 = var10;
            var4 = var9;
            if (param0) {
              break L0;
            } else {
              String discarded$1 = ((up) this).d(114);
              break L0;
            }
          }
          var5 = 0;
          L1: while (true) {
            if (~var13.length >= ~var5) {
              return false;
            } else {
              L2: {
                var6 = var13[var5];
                var7 = pa.field_g[var6];
                if (param1 != 0) {
                  break L2;
                } else {
                  if (var7.e(true)) {
                    return true;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (1 != param1) {
                  break L3;
                } else {
                  if (!var7.n(2688)) {
                    break L3;
                  } else {
                    return true;
                  }
                }
              }
              L4: {
                if (2 != param1) {
                  break L4;
                } else {
                  if (var7.g(65)) {
                    return true;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (param1 != 3) {
                  break L5;
                } else {
                  if (var7.e((byte) 58)) {
                    return true;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (param1 != 4) {
                  break L6;
                } else {
                  if (var7.m(70)) {
                    return true;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param1 != 5) {
                  break L7;
                } else {
                  if (!var7.c((byte) 113)) {
                    break L7;
                  } else {
                    return true;
                  }
                }
              }
              L8: {
                if (param1 != 6) {
                  break L8;
                } else {
                  if (var7.f(false)) {
                    return true;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param1 != 7) {
                  break L9;
                } else {
                  if (!var7.e(70)) {
                    break L9;
                  } else {
                    return true;
                  }
                }
              }
              L10: {
                if (param1 != 8) {
                  break L10;
                } else {
                  if (var7.c(true)) {
                    return true;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (param1 != 9) {
                  break L11;
                } else {
                  if (var7.l(114)) {
                    return true;
                  } else {
                    break L11;
                  }
                }
              }
              var5++;
              continue L1;
            }
          }
        }
    }

    public final int a(int param0) {
        if (param0 != 15) {
            boolean discarded$0 = ((up) this).f(71);
        }
        return ((up) this).a(false, false, (byte) 91);
    }

    final int c(byte param0) {
        int var2 = 0;
        if (var2 < ((up) this).field_n) {
            var2 = ((up) this).field_n;
        }
        if (param0 < 32) {
            field_p = 7;
        }
        if (var2 < ((up) this).field_g) {
            var2 = ((up) this).field_g;
        }
        if (((up) this).field_o > var2) {
            var2 = ((up) this).field_o;
        }
        return var2;
    }

    final static void e(int param0) {
        if (!(wd.field_l == null)) {
            wd.field_l.l(4508);
        }
        if (null != nm.field_d) {
            nm.field_d.p(-120);
        }
        d.a((byte) 127);
    }

    final void a(byte param0, iw param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              param1.a(param0 ^ 78, 1);
              if (param0 == 40) {
                break L1;
              } else {
                ((up) this).a((byte) 59, -29, true, 95, 97, 106, -90, true);
                break L1;
              }
            }
            param1.a(param0 + 71, 1 + ((up) this).field_q);
            param1.g(-1207444472, ((up) this).field_j);
            param1.a(125, ((up) this).field_e);
            param1.a(115, ((up) this).field_l);
            param1.a(104, ((up) this).field_n);
            param1.a(114, ((up) this).field_g);
            param1.a(104, ((up) this).field_o);
            param1.a(107, ((up) this).field_r);
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= 3) {
                break L0;
              } else {
                L3: {
                  if (var3_int >= ((up) this).field_h.length) {
                    param1.a(param0 + 62, 0);
                    break L3;
                  } else {
                    param1.a(125, 1 + ((up) this).field_h[var3_int]);
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("up.FA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final int d(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 > -81) {
            ((up) this).field_o = 81;
        }
        var3 = var3 + ((up) this).field_g;
        var3 = var3 + ((up) this).a(5205, param0);
        return var3;
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        c.field_c = param0;
        if (rb.field_Bb != pg.field_b) {
            var2 = rb.field_Bb * rb.field_Bb;
            var3 = -(pg.field_b * pg.field_b) + var2;
            param0 = param0 + var3 * (-param0 + na.field_Ab) / var2;
        }
        g.field_a.a(true, 640, df.field_H, param0, 120);
        cf.a(119, mj.field_b, 640, 5, eb.field_b, na.field_Ab + -24, 0);
    }

    final int a(int param0, boolean param1) {
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!param1) {
            return 0;
        }
        int var3 = 0;
        int[] var4 = ((up) this).field_h;
        int var5 = 0;
        if (param0 != 5205) {
            return 76;
        }
        while (var5 < var4.length) {
            var6 = var4[var5];
            var3 = var3 + pa.field_g[var6].b(param0 + -5102);
            var5++;
        }
        return var3;
    }

    final boolean a(byte param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var6 = Kickabout.field_G;
        if (param0 == 44) {
          L0: {
            if (param1) {
              var7 = ((up) this).field_h;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  break L0;
                } else {
                  var5 = var7[var4];
                  if (!pa.field_g[var5].d(59)) {
                    var4++;
                    continue L1;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            L3: {
              if (((up) this).field_q == 0) {
                break L3;
              } else {
                if (((up) this).field_q != 4) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L2;
          }
          return stackIn_14_0 != 0;
        } else {
          return true;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        if (!param0) {
          return 0;
        } else {
          L0: {
            if (!param1) {
              break L0;
            } else {
              ((up) this).a((byte) -111, 93, false, 15, -32, 70, -71, false);
              break L0;
            }
          }
          var3 = 0;
          var4 = ((up) this).field_h;
          var5 = 0;
          L1: while (true) {
            if (var4.length <= var5) {
              return var3;
            } else {
              var6 = var4[var5];
              if (pa.field_g[var6].a((byte) -124) > var3) {
                var3 = pa.field_g[var6].a((byte) -122);
                var5++;
                continue L1;
              } else {
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean b(boolean param0, byte param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = Kickabout.field_G;
          if (param1 <= -101) {
            break L0;
          } else {
            ((up) this).field_r = -124;
            break L0;
          }
        }
        if (!param0) {
          return false;
        } else {
          var7 = ((up) this).field_h;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var7.length <= var4) {
              return false;
            } else {
              var5 = var7[var4];
              if (pa.field_g[var5].c(115)) {
                return true;
              } else {
                if (!pa.field_g[var5].k(-21636)) {
                  var4++;
                  continue L1;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final String d(int param0) {
        String var2 = null;
        String var3 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        if (((up) this).c(param0 + -102)) {
          return "Empty";
        } else {
          L0: {
            if (param0 == 100) {
              break L0;
            } else {
              ((up) this).field_c = false;
              break L0;
            }
          }
          L1: {
            if (-1 < ((up) this).field_q) {
              break L1;
            } else {
              if (ce.field_G.length <= ((up) this).field_q) {
                break L1;
              } else {
                if (-1 > ((up) this).field_l) {
                  break L1;
                } else {
                  if (ce.field_G[((up) this).field_q].length > ((up) this).field_l) {
                    var3 = "";
                    var2 = var3;
                    var6 = var3 + Character.toUpperCase(td.field_a[((up) this).field_e]);
                    var5 = var6 + ". ";
                    var7 = var5;
                    var2 = var7 + ce.field_G[((up) this).field_q][((up) this).field_l];
                    return var2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          return "Error";
        }
    }

    final boolean b(byte param0, up param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!((up) this).c(-2)) {
                break L1;
              } else {
                if (param1.c(-2)) {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (((up) this).field_q != param1.field_q) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } else {
              if (((up) this).field_l != param1.field_l) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              } else {
                if (param1.field_e == ((up) this).field_e) {
                  if (param1.field_n == ((up) this).field_n) {
                    if (((up) this).field_r != param1.field_r) {
                      stackOut_22_0 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0 != 0;
                    } else {
                      if (param1.field_o != ((up) this).field_o) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        return stackIn_27_0 != 0;
                      } else {
                        if (((up) this).field_g == param1.field_g) {
                          if (((up) this).field_h.length != param1.field_h.length) {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            return stackIn_34_0 != 0;
                          } else {
                            var3_int = 0;
                            L2: while (true) {
                              if (var3_int >= ((up) this).field_h.length) {
                                if (param0 == -98) {
                                  if (((up) this).field_j == param1.field_j) {
                                    if (param1.field_c != ((up) this).field_c) {
                                      stackOut_50_0 = 0;
                                      stackIn_51_0 = stackOut_50_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    stackOut_46_0 = 0;
                                    stackIn_47_0 = stackOut_46_0;
                                    return stackIn_47_0 != 0;
                                  }
                                } else {
                                  stackOut_43_0 = 0;
                                  stackIn_44_0 = stackOut_43_0;
                                  return stackIn_44_0 != 0;
                                }
                              } else {
                                if (param1.field_h[var3_int] != ((up) this).field_h[var3_int]) {
                                  stackOut_39_0 = 0;
                                  stackIn_40_0 = stackOut_39_0;
                                  return stackIn_40_0 != 0;
                                } else {
                                  var3_int++;
                                  continue L2;
                                }
                              }
                            }
                          }
                        } else {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0 != 0;
                        }
                      }
                    }
                  } else {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                } else {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var3;
            stackOut_52_1 = new StringBuilder().append("up.A(").append(param0).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L3;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ')');
        }
        return stackIn_51_0 != 0;
    }

    public final void a(int param0, int param1, int param2) {
        gr var7 = null;
        if (!(!((up) this).c(-2))) {
            return;
        }
        if (param1 != 23) {
            int discarded$0 = ((up) this).c((byte) -63);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (!(((up) this).field_c)) {
            var7 = tu.field_E;
            var4 = var7.field_w;
            var6 = var7.field_R;
            var5 = var7.field_k;
        }
        ((up) this).a((byte) 70, -(((up) this).b(0) >> 1) + param2, false, var6, var4, var5, -(((up) this).a(param1 ^ 24) >> 1) + param0, false);
    }

    final void b(byte param0) {
        ((up) this).field_e = 0;
        ((up) this).field_q = -1;
        ((up) this).field_r = 0;
        ((up) this).field_j = 0;
        ((up) this).field_h = new int[]{};
        ((up) this).field_l = 0;
        ((up) this).field_g = 0;
        ((up) this).field_n = 0;
        ((up) this).field_o = 0;
        if (param0 != -7) {
            ((up) this).field_e = -14;
        }
    }

    final boolean c(byte param0, boolean param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!(param1)) {
            return false;
        }
        int[] var3 = ((up) this).field_h;
        int var4 = 0;
        if (param0 != -107) {
            ((up) this).field_e = 84;
        }
        while (var3.length > var4) {
            var5 = var3[var4];
            if (pa.field_g[var5].a(param0 + -9707)) {
                return true;
            }
            var4++;
        }
        return false;
    }

    final static boolean a(byte param0) {
        kr.field_e = true;
        ua.field_g = 15000L + nj.a(-112);
        return vj.field_c == 11 ? true : false;
    }

    final boolean c(boolean param0, byte param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!(!param0)) {
            var7 = ((up) this).field_h;
            int[] var3 = var7;
            for (var4 = 0; var7.length > var4; var4++) {
                var5 = var7[var4];
                if (!(!pa.field_g[var5].h(param1 + 161))) {
                    return true;
                }
            }
        }
        if (param1 != -62) {
            return false;
        }
        return ((up) this).field_q == 1 ? true : false;
    }

    final boolean b(boolean param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        L0: {
          var6 = Kickabout.field_G;
          if (!param0) {
            break L0;
          } else {
            int discarded$2 = ((up) this).h(13);
            break L0;
          }
        }
        if (!param1) {
          return true;
        } else {
          var7 = ((up) this).field_h;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var7.length <= var4) {
              return true;
            } else {
              var5 = var7[var4];
              if (pa.field_g[var5].b(param0)) {
                return false;
              } else {
                if (!pa.field_g[var5].k(-21636)) {
                  var4++;
                  continue L1;
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    final int h(int param0) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        int var2 = param0;
        var2 = ia.a(56082116, var2 ^ ((up) this).field_q);
        var2 = ia.a(56082116, ((up) this).field_n ^ var2);
        var2 = ia.a(56082116, var2 ^ ((up) this).field_o);
        var2 = ia.a(56082116, ((up) this).field_g ^ var2);
        var2 = ia.a(56082116, var2 ^ ((up) this).field_r);
        var2 = ia.a(56082116, var2 ^ ((up) this).field_l);
        var2 = ia.a(56082116, var2 ^ ((up) this).field_e);
        for (var3 = 0; ((up) this).field_h.length > var3; var3++) {
            var2 = ia.a(param0 + 56082116, var2 ^ ((up) this).field_h[var3]);
        }
        var2 = ia.a(param0 ^ 56082116, ((up) this).field_j ^ var2);
        var2 = ia.a(56082116, (!((up) this).field_c ? 0 : 1) ^ var2);
        return var2;
    }

    final int a(boolean param0, boolean param1, byte param2) {
        if (((up) this).field_n == 100) {
            if (100 == ((up) this).field_o) {
                if (!(((up) this).field_g != 100)) {
                    param1 = false;
                }
            }
        }
        int var4 = 0;
        var4 += 50;
        var4 = var4 + (60 - -(!param1 ? 0 : ((up) this).field_r > 100 ? 23 : 15));
        var4 = var4 + ((((up) this).field_h.length > 0 ? (!((up) this).f(13467) ? 0 : 12) + 6 : 0) + ((up) this).field_h.length * 18);
        var4 = var4 + (param0 ? 20 : 0);
        if (param2 < 75) {
            return -16;
        }
        return var4;
    }

    final int c(boolean param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = Kickabout.field_G;
        if (!(param1)) {
            return 0;
        }
        int var3 = 0;
        if (!param0) {
            boolean discarded$0 = ((up) this).c(true, -116);
        }
        int[] var4 = ((up) this).field_h;
        for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var3 = var3 + pa.field_g[var6].b((byte) 62);
        }
        return var3;
    }

    public final String toString() {
        String var5 = null;
        String var1 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!((up) this).c(-2)) {
            var5 = "Type: " + uf.field_e[((up) this).field_q] + "\n";
            var1 = var5;
            var1 = var5;
            var6 = var5;
            var1 = var6;
            var1 = var6;
            if (((up) this).field_q != -1) {
                var1 = var6 + "Name: " + td.field_a[((up) this).field_e] + ". " + ce.field_G[((up) this).field_q][((up) this).field_l] + "\n";
            } else {
                var1 = var1 + "Name: N/A\n";
            }
            var7 = var1 + "Stats:\n";
            var1 = var7;
            var1 = var7;
            var8 = var7 + "POW: " + ((up) this).field_n + "\n";
            var1 = var8;
            var1 = var8;
            var9 = var8 + "TCK: " + ((up) this).field_o + "\n";
            var1 = var9;
            var1 = var9;
            var10 = var9 + "SPD: " + ((up) this).field_g + "\n";
            var1 = var10;
            var1 = var10;
            var11 = var10 + "EXP: " + ((up) this).field_r + "\n";
            var1 = var11;
            var1 = var11;
            var12 = var11 + "Num Trinkets: " + ((up) this).field_h.length + "\n";
            var1 = var12;
            var1 = var12;
            var13 = var12 + "Appearance: " + ((up) this).field_j + "\n";
            var1 = var13;
            var1 = var13;
            var1 = var13 + "Trinkets: ";
            for (var2 = 0; var2 < ((up) this).field_h.length; var2++) {
                var1 = var1 + "\t" + ((up) this).field_h[var2] + "\n";
            }
            var1 = var1 + "\n";
            return var1;
        }
        return "Empty PlayerStats";
    }

    final void a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6, boolean param7) {
        int[] var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16_int = 0;
        ot var16 = null;
        int var17_int = 0;
        String var17 = null;
        int var18 = 0;
        int var19 = 0;
        fn var20 = null;
        ot var21 = null;
        int var22 = 0;
        int var23 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int stackIn_7_0 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        Object stackIn_29_2 = null;
        int stackIn_29_3 = 0;
        int stackIn_29_4 = 0;
        Object stackIn_29_5 = null;
        int stackIn_29_6 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        Object stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        Object stackIn_30_5 = null;
        int stackIn_30_6 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        Object stackIn_31_2 = null;
        int stackIn_31_3 = 0;
        int stackIn_31_4 = 0;
        Object stackIn_31_5 = null;
        int stackIn_31_6 = 0;
        int stackIn_31_7 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        Object stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        int stackIn_32_4 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        Object stackIn_33_2 = null;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        Object stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        Object stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_57_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        Object stackOut_28_2 = null;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        Object stackOut_28_5 = null;
        int stackOut_28_6 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        Object stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        int stackOut_30_4 = 0;
        Object stackOut_30_5 = null;
        int stackOut_30_6 = 0;
        int stackOut_30_7 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        Object stackOut_29_2 = null;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        Object stackOut_29_5 = null;
        int stackOut_29_6 = 0;
        int stackOut_29_7 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        Object stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        Object stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        Object stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        Object stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        L0: {
          var22 = Kickabout.field_G;
          if (((up) this).field_n != 100) {
            break L0;
          } else {
            if (((up) this).field_o != 100) {
              break L0;
            } else {
              if (((up) this).field_g != 100) {
                break L0;
              } else {
                param7 = false;
                break L0;
              }
            }
          }
        }
        L1: {
          var25 = new int[]{6737151, 52479};
          var10 = new int[]{128, 60};
          if (((up) this).field_h.length <= 0) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var11 = stackIn_7_0;
          var28 = new int[4];
          var27 = var28;
          var26 = var27;
          var24 = var26;
          var12 = var24;
          var28[0] = 50;
          stackOut_7_0 = (int[]) var12;
          stackOut_7_1 = 1;
          stackIn_9_0 = stackOut_7_0;
          stackIn_9_1 = stackOut_7_1;
          stackIn_8_0 = stackOut_7_0;
          stackIn_8_1 = stackOut_7_1;
          if (param7) {
            stackOut_9_0 = (int[]) (Object) stackIn_9_0;
            stackOut_9_1 = stackIn_9_1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (((up) this).field_r <= 100) {
              stackOut_11_0 = (int[]) (Object) stackIn_11_0;
              stackOut_11_1 = stackIn_11_1;
              stackOut_11_2 = 15;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (int[]) (Object) stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = 23;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          } else {
            stackOut_8_0 = (int[]) (Object) stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = 0;
            stackIn_12_0 = stackOut_8_0;
            stackIn_12_1 = stackOut_8_1;
            stackIn_12_2 = stackOut_8_2;
            break L2;
          }
        }
        L3: {
          stackIn_12_0[stackIn_12_1] = stackIn_12_2 + 60;
          stackOut_12_0 = (int[]) var12;
          stackOut_12_1 = 2;
          stackIn_17_0 = stackOut_12_0;
          stackIn_17_1 = stackOut_12_1;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          if (((up) this).field_h.length <= 0) {
            stackOut_17_0 = (int[]) (Object) stackIn_17_0;
            stackOut_17_1 = stackIn_17_1;
            stackOut_17_2 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            stackIn_18_2 = stackOut_17_2;
            break L3;
          } else {
            L4: {
              stackOut_13_0 = (int[]) (Object) stackIn_13_0;
              stackOut_13_1 = stackIn_13_1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (!((up) this).f(13467)) {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L4;
              } else {
                stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 12;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L4;
              }
            }
            stackOut_16_0 = (int[]) (Object) stackIn_16_0;
            stackOut_16_1 = stackIn_16_1;
            stackOut_16_2 = stackIn_16_2 + 6;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_18_2 = stackOut_16_2;
            break L3;
          }
        }
        L5: {
          stackIn_18_0[stackIn_18_1] = stackIn_18_2 - -(((up) this).field_h.length * 18);
          stackOut_18_0 = (int[]) var12;
          stackOut_18_1 = 3;
          stackIn_20_0 = stackOut_18_0;
          stackIn_20_1 = stackOut_18_1;
          stackIn_19_0 = stackOut_18_0;
          stackIn_19_1 = stackOut_18_1;
          if (!param2) {
            stackOut_20_0 = (int[]) (Object) stackIn_20_0;
            stackOut_20_1 = stackIn_20_1;
            stackOut_20_2 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            stackIn_21_2 = stackOut_20_2;
            break L5;
          } else {
            stackOut_19_0 = (int[]) (Object) stackIn_19_0;
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = 20;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_21_2 = stackOut_19_2;
            break L5;
          }
        }
        L6: {
          stackIn_21_0[stackIn_21_1] = stackIn_21_2;
          var13 = ((up) this).b(0);
          var14 = 0;
          var15 = param6;
          var16_int = 0;
          if (param0 >= 36) {
            break L6;
          } else {
            String discarded$1 = ((up) this).toString();
            break L6;
          }
        }
        L7: while (true) {
          if (var16_int >= 4) {
            L8: {
              stackOut_28_0 = param4;
              stackOut_28_1 = 0;
              stackOut_28_2 = this;
              stackOut_28_3 = param3;
              stackOut_28_4 = param5;
              stackOut_28_5 = this;
              stackOut_28_6 = -107;
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              stackIn_30_3 = stackOut_28_3;
              stackIn_30_4 = stackOut_28_4;
              stackIn_30_5 = stackOut_28_5;
              stackIn_30_6 = stackOut_28_6;
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              stackIn_29_3 = stackOut_28_3;
              stackIn_29_4 = stackOut_28_4;
              stackIn_29_5 = stackOut_28_5;
              stackIn_29_6 = stackOut_28_6;
              if (((up) this).f(13467)) {
                stackOut_30_0 = stackIn_30_0;
                stackOut_30_1 = stackIn_30_1;
                stackOut_30_2 = this;
                stackOut_30_3 = stackIn_30_3;
                stackOut_30_4 = stackIn_30_4;
                stackOut_30_5 = this;
                stackOut_30_6 = stackIn_30_6;
                stackOut_30_7 = 0;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                stackIn_31_4 = stackOut_30_4;
                stackIn_31_5 = stackOut_30_5;
                stackIn_31_6 = stackOut_30_6;
                stackIn_31_7 = stackOut_30_7;
                break L8;
              } else {
                stackOut_29_0 = stackIn_29_0;
                stackOut_29_1 = stackIn_29_1;
                stackOut_29_2 = this;
                stackOut_29_3 = stackIn_29_3;
                stackOut_29_4 = stackIn_29_4;
                stackOut_29_5 = this;
                stackOut_29_6 = stackIn_29_6;
                stackOut_29_7 = 1;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_31_2 = stackOut_29_2;
                stackIn_31_3 = stackOut_29_3;
                stackIn_31_4 = stackOut_29_4;
                stackIn_31_5 = stackOut_29_5;
                stackIn_31_6 = stackOut_29_6;
                stackIn_31_7 = stackOut_29_7;
                break L8;
              }
            }
            L9: {
              L10: {
                stackOut_31_0 = stackIn_31_0;
                stackOut_31_1 = stackIn_31_1;
                stackOut_31_2 = this;
                stackOut_31_3 = stackIn_31_3;
                stackOut_31_4 = stackIn_31_4;
                stackIn_34_0 = stackOut_31_0;
                stackIn_34_1 = stackOut_31_1;
                stackIn_34_2 = stackOut_31_2;
                stackIn_34_3 = stackOut_31_3;
                stackIn_34_4 = stackOut_31_4;
                stackIn_32_0 = stackOut_31_0;
                stackIn_32_1 = stackOut_31_1;
                stackIn_32_2 = stackOut_31_2;
                stackIn_32_3 = stackOut_31_3;
                stackIn_32_4 = stackOut_31_4;
                if (((up) this).c((byte) stackIn_31_6, stackIn_31_7 == 0)) {
                  break L10;
                } else {
                  stackOut_32_0 = stackIn_32_0;
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = this;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = stackIn_32_4;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  stackIn_34_3 = stackOut_32_3;
                  stackIn_34_4 = stackOut_32_4;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  if (!wn.a((byte) -121)) {
                    break L10;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = stackIn_33_1;
                    stackOut_33_2 = this;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = stackIn_33_4;
                    stackOut_33_5 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    stackIn_35_2 = stackOut_33_2;
                    stackIn_35_3 = stackOut_33_3;
                    stackIn_35_4 = stackOut_33_4;
                    stackIn_35_5 = stackOut_33_5;
                    break L9;
                  }
                }
              }
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = stackIn_34_1;
              stackOut_34_2 = this;
              stackOut_34_3 = stackIn_34_3;
              stackOut_34_4 = stackIn_34_4;
              stackOut_34_5 = 0;
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              stackIn_35_3 = stackOut_34_3;
              stackIn_35_4 = stackOut_34_4;
              stackIn_35_5 = stackOut_34_5;
              break L9;
            }
            L11: {
              var16 = kj.a(stackIn_35_0, stackIn_35_1, (up) this, stackIn_35_3, stackIn_35_4, stackIn_35_5 != 0);
              if (var16 == null) {
                jr.a(param1 + 24, -103, -19 + (param6 - -50));
                break L11;
              } else {
                var16.c(7 + param1, 50 + param6 - (var16.field_v - -1));
                break L11;
              }
            }
            q.field_d.c(((up) this).d(100), -10 + var13 + param1, 22 + param6, 16777215, 65793);
            q.field_d.c(uf.field_e[((up) this).field_q], -10 + param1 + var13, 36 + param6, 16777215, 65793);
            param6 = param6 + var28[0];
            var17_int = 0;
            L12: while (true) {
              L13: {
                if (param7) {
                  stackOut_41_0 = 4;
                  stackIn_42_0 = stackOut_41_0;
                  break L13;
                } else {
                  stackOut_40_0 = 3;
                  stackIn_42_0 = stackOut_40_0;
                  break L13;
                }
              }
              if (stackIn_42_0 <= var17_int) {
                L14: {
                  param6 = param6 + var28[1];
                  if (var11 != 0) {
                    var17_int = param1 - -13;
                    var18 = param6 - -12;
                    var23 = 0;
                    var19 = var23;
                    L15: while (true) {
                      if (((up) this).field_h.length <= var23) {
                        break L14;
                      } else {
                        var20 = pa.field_g[((up) this).field_h[var23]];
                        var21 = var20.d(false);
                        ((ut) (Object) var21).f(var17_int + -(((ut) (Object) var21).field_o >> 2), -(((ut) (Object) var21).field_v >> 2) + var18);
                        q.field_d.a(var20.f((byte) -1), 15 + var17_int, var18 - -4, 16777215, 65793);
                        var18 += 18;
                        var23++;
                        continue L15;
                      }
                    }
                  } else {
                    break L14;
                  }
                }
                L16: {
                  if (((up) this).f(13467)) {
                    eo.d(1 + param1, 1 + param6, var13, var28[2] - 1);
                    on.a(-1 + var13 + param1, param6, var28[2] + 1, 65793);
                    q.field_d.d(oo.field_h, (var13 >> 1) + param1, -4 + var28[2] + param6, 16777215, 65793);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  param6 = param6 + var28[2];
                  if (param2) {
                    var17 = vo.a((byte) -18, ti.field_g, new String[1]);
                    q.field_d.a(var17, param1 + 10, param6 + 15, 16777215, 65793);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                return;
              } else {
                L18: {
                  if (var17_int != 0) {
                    if (var17_int != 1) {
                      if (2 == var17_int) {
                        stackOut_49_0 = ((up) this).field_o;
                        stackIn_50_0 = stackOut_49_0;
                        break L18;
                      } else {
                        stackOut_48_0 = ((up) this).field_r;
                        stackIn_50_0 = stackOut_48_0;
                        break L18;
                      }
                    } else {
                      stackOut_46_0 = ((up) this).field_g;
                      stackIn_50_0 = stackOut_46_0;
                      break L18;
                    }
                  } else {
                    stackOut_44_0 = ((up) this).field_n;
                    stackIn_50_0 = stackOut_44_0;
                    break L18;
                  }
                }
                L19: {
                  var18 = stackIn_50_0;
                  if (0 == var17_int) {
                    stackOut_56_0 = ((up) this).c(true, oi.b(-89));
                    stackIn_57_0 = stackOut_56_0;
                    break L19;
                  } else {
                    if (var17_int == 1) {
                      stackOut_55_0 = ((up) this).a(5205, oi.b(-120));
                      stackIn_57_0 = stackOut_55_0;
                      break L19;
                    } else {
                      if (var17_int == 2) {
                        stackOut_54_0 = ((up) this).b((byte) -118, oi.b(-110));
                        stackIn_57_0 = stackOut_54_0;
                        break L19;
                      } else {
                        stackOut_53_0 = 0;
                        stackIn_57_0 = stackOut_53_0;
                        break L19;
                      }
                    }
                  }
                }
                var19 = stackIn_57_0;
                eo.a(param1 - -(-100 + var13 >> 1), 9 + (param6 - -(16 * var17_int)), var18, var17_int, true, var19);
                var17_int++;
                continue L12;
              }
            }
          } else {
            L20: {
              if (var28[var16_int] != 0) {
                on.a(param1, var15, var13, var28[var16_int] - -1, var25[var14], var10[var14]);
                on.e(param1, var15, var13, var28[var16_int] - -1, 65793);
                var15 = var15 + var28[var16_int];
                var14 = var14 ^ 1;
                break L20;
              } else {
                break L20;
              }
            }
            var16_int++;
            continue L7;
          }
        }
    }

    final int d(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + ((up) this).field_n;
        var3 = var3 + ((up) this).c(true, param0);
        if (((up) this).c(param0, param1 ^ -105)) {
            if (!((up) this).c(param0, (byte) -62)) {
                var3 = 8 * var3 / 10;
            }
        }
        return var3;
    }

    public static void g(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 0;
        field_m = null;
        field_k = null;
    }

    public final int b(int param0) {
        if (param0 != 0) {
            field_p = 95;
        }
        return 125;
    }

    public up() {
        ((up) this).field_c = false;
        ((up) this).field_i = 0;
        ((up) this).b((byte) -7);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "decrease buyout price by <%0>";
        field_a = new char[128];
        field_b = 0L;
    }
}
