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
            var7 = this.field_h;
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
        return 3 == this.field_q ? true : false;
    }

    final boolean b(boolean param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        L0: {
          var6 = Kickabout.field_G;
          if (param1 == 100) {
            break L0;
          } else {
            this.a(false, false);
            break L0;
          }
        }
        if (param0) {
          var7 = this.field_h;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var4 >= var7.length) {
              return false;
            } else {
              var5 = var7[var4];
              if (!pa.field_g[var5].a(false)) {
                var4++;
                continue L1;
              } else {
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, up param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (!param1.c(-2)) {
              L1: {
                this.field_r = param1.field_r;
                this.field_q = param1.field_q;
                this.field_g = param1.field_g;
                this.field_o = param1.field_o;
                this.field_n = param1.field_n;
                this.field_l = param1.field_l;
                this.field_e = param1.field_e;
                if (param1.field_h.length != this.field_h.length) {
                  this.field_h = new int[param1.field_h.length];
                  var5 = 0;
                  var3_int = var5;
                  L2: while (true) {
                    if (this.field_h.length <= var5) {
                      break L1;
                    } else {
                      this.field_h[var5] = param1.field_h[var5];
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  var3_int = 0;
                  L3: while (true) {
                    if (this.field_h.length <= var3_int) {
                      break L1;
                    } else {
                      this.field_h[var3_int] = param1.field_h[var3_int];
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
              this.field_j = param1.field_j;
              this.field_c = param1.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.b((byte) -7);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("up.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean f(int param0) {
        if (-1 == (this.field_i ^ -1)) {
            return jd.f(-1);
        }
        if (param0 != 13467) {
            return true;
        }
        return (this.field_i ^ -1) == -2 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 != -2) {
            iw var3 = (iw) null;
            this.a(-56, (iw) null);
        }
        if ((this.field_q ^ -1) != 0) {
            return false;
        }
        return true;
    }

    final int a(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.field_o;
        var3 = var3 + this.b((byte) 64, param0);
        return var3;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param0, (byte) 85);
        var2.field_n = var2.field_n + 1;
        int var3 = var2.field_n;
        var2.a(112, 2);
        var2.a(param1, er.field_h.length, param1 ^ 1991220144, er.field_h);
        var2.a(param1 ^ 124, lk.field_l);
        var2.a(124, ru.field_C);
        var2.a(0, rf.field_d.length, param1 + 1991220144, rf.field_d);
        var2.c(62, -var3 + var2.field_n);
    }

    final void a(int param0, iw param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            param1.h((byte) -126);
            this.field_q = (7 & param1.h((byte) -127)) - 1;
            this.field_j = param1.a((byte) 81);
            this.field_e = param1.h((byte) -112);
            this.field_l = param1.h((byte) -118);
            this.field_n = param1.h((byte) -122);
            this.field_g = param1.h((byte) -119);
            this.field_o = param1.h((byte) -126);
            if (param0 > 13) {
              this.field_r = param1.h((byte) -124);
              var10 = new int[3];
              var9 = var10;
              var7 = var9;
              var3 = var7;
              var4 = 0;
              var5 = 0;
              L1: while (true) {
                if (var5 >= 3) {
                  this.field_h = new int[var4];
                  var8 = 0;
                  var5 = var8;
                  L2: while (true) {
                    if (var4 <= var8) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      this.field_h[var8] = var10[var8];
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var7[var5] = -1 + param1.h((byte) -122);
                  if ((var10[var5] ^ -1) != 0) {
                    var4++;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("up.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        int[] var4 = this.field_h;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var3 = var3 + pa.field_g[var6].o(126);
        }
        var6 = 19 % ((10 - param0) / 50);
        return var3;
    }

    final boolean a(boolean param0, byte param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        var6 = Kickabout.field_G;
        if (param1 < -103) {
          if (!param0) {
            return false;
          } else {
            var7 = this.field_h;
            var3 = var7;
            var4 = 0;
            L0: while (true) {
              if (var7.length <= var4) {
                return false;
              } else {
                var5 = var7[var4];
                if (pa.field_g[var5].k(-21636)) {
                  return true;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(boolean param0, int param1, boolean param2) {
        int[] var4;
        int var5;
        int var6;
        fn var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        var8 = Kickabout.field_G;
        if (!param2) {
          return false;
        } else {
          L0: {
            var11 = this.field_h;
            var10 = var11;
            var9 = var10;
            var4 = var9;
            if (param0) {
              break L0;
            } else {
              this.d(114);
              break L0;
            }
          }
          var5 = 0;
          L1: while (true) {
            if (var11.length <= var5) {
              return false;
            } else {
              L2: {
                var6 = var11[var5];
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
                if (-4 != (param1 ^ -1)) {
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
                if (-6 != (param1 ^ -1)) {
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
                if ((param1 ^ -1) != -7) {
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
                if (-8 != (param1 ^ -1)) {
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
              if (-10 == (param1 ^ -1)) {
                if (var7.l(114)) {
                  return true;
                } else {
                  var5++;
                  continue L1;
                }
              } else {
                var5++;
                continue L1;
              }
            }
          }
        }
    }

    public final int a(int param0) {
        if (param0 != 15) {
            this.f(71);
        }
        return this.a(false, false, (byte) 91);
    }

    final int c(byte param0) {
        int var2 = 0;
        if (var2 < this.field_n) {
            var2 = this.field_n;
        }
        if (param0 < 32) {
            field_p = 7;
        }
        if (var2 < this.field_g) {
            var2 = this.field_g;
        }
        if (this.field_o > var2) {
            var2 = this.field_o;
        }
        return var2;
    }

    final static void e(int param0) {
        if (!(wd.field_l == null)) {
            wd.field_l.l(param0 ^ -5172);
        }
        if (param0 != -1456) {
            up.g(3);
        }
        if (null != nm.field_d) {
            nm.field_d.p(param0 ^ 1496);
        }
        d.a((byte) 127);
    }

    final void a(byte param0, iw param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              param1.a(param0 ^ 78, 1);
              if (param0 == 40) {
                break L1;
              } else {
                this.a((byte) 59, -29, true, 95, 97, 106, -90, true);
                break L1;
              }
            }
            param1.a(param0 + 71, 1 + this.field_q);
            param1.g(-1207444472, this.field_j);
            param1.a(125, this.field_e);
            param1.a(115, this.field_l);
            param1.a(104, this.field_n);
            param1.a(114, this.field_g);
            param1.a(104, this.field_o);
            param1.a(107, this.field_r);
            var3_int = 0;
            L2: while (true) {
              if ((var3_int ^ -1) <= -4) {
                break L0;
              } else {
                L3: {
                  if (var3_int >= this.field_h.length) {
                    param1.a(param0 + 62, 0);
                    break L3;
                  } else {
                    param1.a(125, 1 + this.field_h[var3_int]);
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
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("up.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final int d(boolean param0, byte param1) {
        int var3 = 0;
        if (param1 > -81) {
            this.field_o = 81;
        }
        var3 = var3 + this.field_g;
        var3 = var3 + this.a(5205, param0);
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
        if (param1 >= -65) {
            up.a(-79, -94);
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
        int[] var4 = this.field_h;
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
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        int stackIn_14_0 = 0;
        var6 = Kickabout.field_G;
        if (param0 == 44) {
          L0: {
            if (param1) {
              var7 = this.field_h;
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
              if (this.field_q == 0) {
                break L3;
              } else {
                if (this.field_q != 4) {
                  stackIn_14_0 = 0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackIn_14_0 = 1;
            break L2;
          }
          return stackIn_14_0 != 0;
        } else {
          return true;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        var7 = Kickabout.field_G;
        if (!param0) {
          return 0;
        } else {
          L0: {
            if (!param1) {
              break L0;
            } else {
              this.a((byte) -111, 93, false, 15, -32, 70, -71, false);
              break L0;
            }
          }
          var3 = 0;
          var4 = this.field_h;
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
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        L0: {
          var6 = Kickabout.field_G;
          if (param1 <= -101) {
            break L0;
          } else {
            this.field_r = -124;
            break L0;
          }
        }
        if (!param0) {
          return false;
        } else {
          var7 = this.field_h;
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
        if (!(!this.c(param0 + -102))) {
            return "Empty";
        }
        if (param0 != 100) {
            this.field_c = false;
        }
        if (-1 < (this.field_q ^ -1) || ce.field_G.length <= this.field_q || -1 < (this.field_l ^ -1) || ce.field_G[this.field_q].length <= this.field_l) {
            return "Error";
        }
        String var3 = "";
        String var2 = var3;
        String var6 = var3 + Character.toUpperCase(td.field_a[this.field_e]);
        String var5 = var6 + ". ";
        String var7 = var5;
        var2 = var7 + ce.field_G[this.field_q][this.field_l];
        return var2;
    }

    final boolean b(byte param0, up param1) {
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
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!this.c(-2)) {
                break L1;
              } else {
                if (param1.c(-2)) {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (this.field_q != param1.field_q) {
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (this.field_l != param1.field_l) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param1.field_e == this.field_e) {
                  if (param1.field_n == this.field_n) {
                    if (this.field_r != param1.field_r) {
                      stackIn_23_0 = 0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (param1.field_o != this.field_o) {
                        stackIn_27_0 = 0;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        if (this.field_g == param1.field_g) {
                          if (this.field_h.length != param1.field_h.length) {
                            stackIn_34_0 = 0;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            var3_int = 0;
                            L2: while (true) {
                              if (var3_int >= this.field_h.length) {
                                if (param0 == -98) {
                                  if (this.field_j == param1.field_j) {
                                    if (param1.field_c != this.field_c) {
                                      stackIn_51_0 = 0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    stackIn_47_0 = 0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  stackIn_44_0 = 0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                if (param1.field_h[var3_int] != this.field_h[var3_int]) {
                                  stackIn_40_0 = 0;
                                  decompiledRegionSelector0 = 9;
                                  break L0;
                                } else {
                                  var3_int++;
                                  continue L2;
                                }
                              }
                            }
                          }
                        } else {
                          stackIn_30_0 = 0;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_19_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var3);

            stackIn_54_1 = new StringBuilder().append("up.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L3;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_34_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_40_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_44_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_47_0 != 0;
                              } else {
                                return stackIn_51_0 != 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2) {
        gr var7 = null;
        if (!(!this.c(-2))) {
            return;
        }
        if (param1 != 23) {
            this.c((byte) -63);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (!(this.field_c)) {
            var7 = tu.field_E;
            var4 = var7.field_w;
            var6 = var7.field_R;
            var5 = var7.field_k;
        }
        this.a((byte) 70, -(this.b(0) >> 621549153) + param2, false, var6, var4, var5, -(this.a(param1 ^ 24) >> -1397897279) + param0, false);
    }

    final void b(byte param0) {
        this.field_e = 0;
        this.field_q = -1;
        this.field_r = 0;
        this.field_j = 0;
        this.field_h = new int[]{};
        this.field_l = 0;
        this.field_g = 0;
        this.field_n = 0;
        this.field_o = 0;
        if (param0 != -7) {
            this.field_e = -14;
        }
    }

    final boolean c(byte param0, boolean param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        var6 = Kickabout.field_G;
        if (!param1) {
          return false;
        } else {
          L0: {
            var3 = this.field_h;
            var4 = 0;
            if (param0 == -107) {
              break L0;
            } else {
              this.field_e = 84;
              break L0;
            }
          }
          L1: while (true) {
            if (var3.length <= var4) {
              return false;
            } else {
              var5 = var3[var4];
              if (!pa.field_g[var5].a(param0 + -9707)) {
                var4++;
                continue L1;
              } else {
                return true;
              }
            }
          }
        }
    }

    final static boolean a(byte param0) {
        kr.field_e = true;
        if (param0 != -3) {
            return true;
        }
        ua.field_g = 15000L + nj.a(param0 + -109);
        return (vj.field_c ^ -1) == -12 ? true : false;
    }

    final boolean c(boolean param0, byte param1) {
        int[] var7 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (!(!param0)) {
            var7 = this.field_h;
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
        return (this.field_q ^ -1) == -2 ? true : false;
    }

    final boolean b(boolean param0, boolean param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int[] var7;
        L0: {
          var6 = Kickabout.field_G;
          if (!param0) {
            break L0;
          } else {
            this.h(13);
            break L0;
          }
        }
        if (!param1) {
          return true;
        } else {
          var7 = this.field_h;
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
        var2 = ia.a(56082116, var2 ^ this.field_q);
        var2 = ia.a(56082116, this.field_n ^ var2);
        var2 = ia.a(56082116, var2 ^ this.field_o);
        var2 = ia.a(56082116, this.field_g ^ var2);
        var2 = ia.a(56082116, var2 ^ this.field_r);
        var2 = ia.a(56082116, var2 ^ this.field_l);
        var2 = ia.a(56082116, var2 ^ this.field_e);
        for (var3 = 0; this.field_h.length > var3; var3++) {
            var2 = ia.a(param0 + 56082116, var2 ^ this.field_h[var3]);
        }
        var2 = ia.a(param0 ^ 56082116, this.field_j ^ var2);
        var2 = ia.a(56082116, (!this.field_c ? 0 : 1) ^ var2);
        return var2;
    }

    final int a(boolean param0, boolean param1, byte param2) {
        if (-101 == (this.field_n ^ -1) && 100 == this.field_o) {
            if (!(this.field_g != 100)) {
                param1 = false;
            }
        }
        int var4 = 0;
        var4 += 50;
        var4 = var4 + (60 - -(!param1 ? 0 : (this.field_r ^ -1) < -101 ? 23 : 15));
        var4 = var4 + ((-1 > (this.field_h.length ^ -1) ? (!this.f(13467) ? 0 : 12) + 6 : 0) + this.field_h.length * 18);
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
            this.c(true, -116);
        }
        int[] var4 = this.field_h;
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
        if (!this.c(-2)) {
            var5 = "Type: " + uf.field_e[this.field_q] + "\n";
            var1 = var5;
            var1 = var5;
            var6 = var5;
            var1 = var6;
            var1 = var6;
            if (0 != (this.field_q ^ -1)) {
                var1 = var6 + "Name: " + td.field_a[this.field_e] + ". " + ce.field_G[this.field_q][this.field_l] + "\n";
            } else {
                var1 = var1 + "Name: N/A\n";
            }
            var7 = var1 + "Stats:\n";
            var1 = var7;
            var1 = var7;
            var8 = var7 + "POW: " + this.field_n + "\n";
            var1 = var8;
            var1 = var8;
            var9 = var8 + "TCK: " + this.field_o + "\n";
            var1 = var9;
            var1 = var9;
            var10 = var9 + "SPD: " + this.field_g + "\n";
            var1 = var10;
            var1 = var10;
            var11 = var10 + "EXP: " + this.field_r + "\n";
            var1 = var11;
            var1 = var11;
            var12 = var11 + "Num Trinkets: " + this.field_h.length + "\n";
            var1 = var12;
            var1 = var12;
            var13 = var12 + "Appearance: " + this.field_j + "\n";
            var1 = var13;
            var1 = var13;
            var1 = var13 + "Trinkets: ";
            for (var2 = 0; var2 < this.field_h.length; var2++) {
                var1 = var1 + "\t" + this.field_h[var2] + "\n";
            }
            var1 = var1 + "\n";
            return var1;
        }
        return "Empty PlayerStats";
    }

    final void a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6, boolean param7) {
        int stackIn_7_0 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_16_2 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_29_0;
        int stackIn_29_1;
        Object stackIn_29_2;
        int stackIn_29_3;
        int stackIn_29_4;
        Object stackIn_29_5;
        int stackIn_29_6;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        Object stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        Object stackIn_30_5 = null;
        int stackIn_30_6 = 0;
        int stackIn_30_7 = 0;
        Object stackIn_33_2;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        Object stackIn_34_2 = null;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        int stackIn_41_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int[] var10;
        int var11;
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var16_int;
        ot var16;
        int var17_int;
        String var17;
        int var18;
        int var19;
        fn var20;
        ot var21;
        int var22;
        int var23;
        int[] var24;
        int[] var25;
        int[] var26;
        L0: {
          var22 = Kickabout.field_G;
          if ((this.field_n ^ -1) != -101) {
            break L0;
          } else {
            if (-101 != (this.field_o ^ -1)) {
              break L0;
            } else {
              if (this.field_g != 100) {
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
          if (-1 <= (this.field_h.length ^ -1)) {
            stackIn_7_0 = 0;
            break L1;
          } else {
            stackIn_7_0 = 1;
            break L1;
          }
        }
        L2: {
          var11 = stackIn_7_0;
          var26 = new int[4];
          var24 = var26;
          var12 = var24;
          var26[0] = 50;
          stackIn_9_0 = (int[]) (var12);

          stackIn_9_1 = 1;

          if (param7) {




            if ((this.field_r ^ -1) >= -101) {
              stackIn_12_0 = (int[]) ((Object) stackIn_9_0);
              stackIn_12_1 = stackIn_9_1;
              stackIn_12_2 = 15;
              break L2;
            } else {
              stackIn_12_0 = (int[]) ((Object) stackIn_9_0);
              stackIn_12_1 = stackIn_9_1;
              stackIn_12_2 = 23;
              break L2;
            }
          } else {
            stackIn_12_0 = (int[]) ((Object) stackIn_9_0);
            stackIn_12_1 = stackIn_9_1;
            stackIn_12_2 = 0;
            break L2;
          }
        }
        L3: {
          stackIn_12_0[stackIn_12_1] = stackIn_12_2 + 60;
          stackIn_17_0 = (int[]) (var12);

          stackIn_17_1 = 2;

          if ((this.field_h.length ^ -1) >= -1) {
            stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
            stackIn_18_1 = stackIn_17_1;
            stackIn_18_2 = 0;
            break L3;
          } else {
            L4: {




              if (!this.f(13467)) {
                stackIn_17_0 = (int[]) ((Object) stackIn_17_0);

                stackIn_16_2 = 0;
                break L4;
              } else {
                stackIn_17_0 = (int[]) ((Object) stackIn_17_0);

                stackIn_16_2 = 12;
                break L4;
              }
            }
            stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
            stackIn_18_1 = stackIn_17_1;
            stackIn_18_2 = stackIn_16_2 + 6;
            break L3;
          }
        }
        L5: {
          stackIn_18_0[stackIn_18_1] = stackIn_18_2 - -(this.field_h.length * 18);
          stackIn_20_0 = (int[]) (var12);

          stackIn_20_1 = 3;

          if (!param2) {
            stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
            stackIn_21_1 = stackIn_20_1;
            stackIn_21_2 = 0;
            break L5;
          } else {
            stackIn_21_0 = (int[]) ((Object) stackIn_20_0);
            stackIn_21_1 = stackIn_20_1;
            stackIn_21_2 = 20;
            break L5;
          }
        }
        L6: {
          stackIn_21_0[stackIn_21_1] = stackIn_21_2;
          var13 = this.b(0);
          var14 = 0;
          var15 = param6;
          var16_int = 0;
          if (param0 >= 36) {
            break L6;
          } else {
            this.toString();
            break L6;
          }
        }
        L7: while (true) {
          if (-5 >= (var16_int ^ -1)) {
            L8: {
              stackIn_29_0 = param4;

              stackIn_29_1 = 0;

              stackIn_29_2 = this;

              stackIn_29_3 = param3;

              stackIn_29_4 = param5;

              stackIn_29_5 = this;

              stackIn_29_6 = -107;

              if (this.f(13467)) {
                stackIn_30_0 = stackIn_29_0;
                stackIn_30_1 = stackIn_29_1;
                stackIn_30_2 = this;
                stackIn_30_3 = stackIn_29_3;
                stackIn_30_4 = stackIn_29_4;
                stackIn_30_5 = this;
                stackIn_30_6 = stackIn_29_6;
                stackIn_30_7 = 0;
                break L8;
              } else {
                stackIn_30_0 = stackIn_29_0;
                stackIn_30_1 = stackIn_29_1;
                stackIn_30_2 = this;
                stackIn_30_3 = stackIn_29_3;
                stackIn_30_4 = stackIn_29_4;
                stackIn_30_5 = this;
                stackIn_30_6 = stackIn_29_6;
                stackIn_30_7 = 1;
                break L8;
              }
            }
            L9: {
              L10: {

                stackIn_33_2 = this;


                if (!this.c((byte) stackIn_30_6, stackIn_30_7 != 0)) {
                  break L10;
                } else {

                  stackIn_33_2 = this;


                  if (!wn.a((byte) -121)) {
                    break L10;
                  } else {
                    stackIn_34_0 = stackIn_30_0;
                    stackIn_34_1 = stackIn_30_1;
                    stackIn_34_2 = this;
                    stackIn_34_3 = stackIn_30_3;
                    stackIn_34_4 = stackIn_30_4;
                    stackIn_34_5 = 1;
                    break L9;
                  }
                }
              }
              stackIn_34_0 = stackIn_30_0;
              stackIn_34_1 = stackIn_30_1;
              stackIn_34_2 = this;
              stackIn_34_3 = stackIn_30_3;
              stackIn_34_4 = stackIn_30_4;
              stackIn_34_5 = 0;
              break L9;
            }
            L11: {
              var16 = kj.a(stackIn_34_0, stackIn_34_1, (up) (this), stackIn_34_3, stackIn_34_4, stackIn_34_5 != 0);
              if (var16 == null) {
                jr.a(param1 + 24, -103, -19 + (param6 - -50));
                break L11;
              } else {
                var16.c(7 + param1, 50 + param6 - (var16.field_v - -1));
                break L11;
              }
            }
            q.field_d.c(this.d(100), -10 + var13 + param1, 22 + param6, 16777215, 65793);
            q.field_d.c(uf.field_e[this.field_q], -10 + param1 + var13, 36 + param6, 16777215, 65793);
            param6 = param6 + var26[0];
            var17_int = 0;
            L12: while (true) {
              L13: {
                if (param7) {
                  stackIn_41_0 = 4;
                  break L13;
                } else {
                  stackIn_41_0 = 3;
                  break L13;
                }
              }
              if (stackIn_41_0 <= var17_int) {
                L14: {
                  param6 = param6 + var26[1];
                  if (var11 != 0) {
                    var17_int = param1 - -13;
                    var18 = param6 - -12;
                    var23 = 0;
                    var19 = var23;
                    L15: while (true) {
                      if (this.field_h.length <= var23) {
                        break L14;
                      } else {
                        var20 = pa.field_g[this.field_h[var23]];
                        var21 = var20.d(false);
                        ((ut) ((Object) var21)).f(var17_int + -(((ut) ((Object) var21)).field_o >> 834899874), -(((ut) ((Object) var21)).field_v >> 1049574306) + var18);
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
                  if (this.f(13467)) {
                    eo.d(1 + param1, 1 + param6, var13, var26[2] - 1);
                    on.a(-1 + var13 + param1, param6, var26[2] + 1, 65793);
                    q.field_d.d(oo.field_h, (var13 >> -528534815) + param1, -4 + var26[2] + param6, 16777215, 65793);
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  param6 = param6 + var26[2];
                  if (param2) {
                    var17 = vo.a((byte) -18, ti.field_g, new String[]{ad.a(dh.a((up) (this), true), 26300)});
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
                    if (-2 != (var17_int ^ -1)) {
                      if (2 == var17_int) {
                        stackIn_49_0 = this.field_o;
                        break L18;
                      } else {
                        stackIn_49_0 = this.field_r;
                        break L18;
                      }
                    } else {
                      stackIn_49_0 = this.field_g;
                      break L18;
                    }
                  } else {
                    stackIn_49_0 = this.field_n;
                    break L18;
                  }
                }
                L19: {
                  var18 = stackIn_49_0;
                  if (0 == var17_int) {
                    stackIn_56_0 = this.c(true, oi.b(-89));
                    break L19;
                  } else {
                    if (-2 == (var17_int ^ -1)) {
                      stackIn_56_0 = this.a(5205, oi.b(-120));
                      break L19;
                    } else {
                      if ((var17_int ^ -1) == -3) {
                        stackIn_56_0 = this.b((byte) -118, oi.b(-110));
                        break L19;
                      } else {
                        stackIn_56_0 = 0;
                        break L19;
                      }
                    }
                  }
                }
                var19 = stackIn_56_0;
                eo.a(param1 - -(-100 + var13 >> -563110783), 9 + (param6 - -(16 * var17_int)), var18, var17_int, true, var19);
                var17_int++;
                continue L12;
              }
            }
          } else {
            if (var26[var16_int] != 0) {
              on.a(param1, var15, var13, var26[var16_int] - -1, var25[var14], var10[var14]);
              on.e(param1, var15, var13, var26[var16_int] - -1, 65793);
              var15 = var15 + var26[var16_int];
              var14 = var14 ^ 1;
              var16_int++;
              continue L7;
            } else {
              var16_int++;
              continue L7;
            }
          }
        }
    }

    final int d(boolean param0, int param1) {
        int var3 = param1;
        var3 = var3 + this.field_n;
        var3 = var3 + this.c(true, param0);
        if (this.c(param0, param1 ^ -105) && !this.c(param0, (byte) -62)) {
            var3 = 8 * var3 / 10;
        }
        return var3;
    }

    public static void g(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 8 % ((53 - param0) / 56);
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
        this.field_c = false;
        this.field_i = 0;
        this.b((byte) -7);
    }

    static {
        field_d = "decrease buyout price by <%0>";
        field_a = new char[128];
        field_b = 0L;
    }
}
