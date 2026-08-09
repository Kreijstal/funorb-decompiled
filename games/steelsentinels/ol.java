/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends gh {
    private gh field_Yb;
    static ul field_Vb;
    static String field_Xb;
    static String field_Zb;
    static dj field_Sb;
    static gk field_Wb;
    static c field_ac;
    static id field_Tb;
    static int[][] field_cc;
    static int field_bc;
    static int field_Ub;
    static int field_dc;

    final static qb d(byte param0) {
        int fieldTemp$0 = mg.field_hc - 1;
        mg.field_hc = mg.field_hc - 1;
        if (!(0 <= fieldTemp$0)) {
            mg.field_hc = mg.field_hc + 10000;
        }
        int var1 = -54 % ((-5 - param0) / 60);
        return k.field_Cb[mg.field_hc];
    }

    final static void l(int param0) {
        jf.c(true);
        if (param0 != 0) {
            field_bc = 91;
        }
    }

    final static boolean j(int param0) {
        if (param0 == 0) {
          if ((nj.field_Q ^ -1) <= -21) {
            if (ri.c(6995)) {
              if (ua.field_o > 0) {
                if (a.a(105)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ol.l(15);
          if ((nj.field_Q ^ -1) <= -21) {
            if (ri.c(6995)) {
              if (ua.field_o > 0) {
                if (a.a(105)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param0 - -param2) <= pb.field_j) {
            return param0 - -param2;
        }
        if (!(param1 > param0 - param3)) {
            return -param3 + param0;
        }
        return pb.field_j + -param3;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 31) {
              L1: {
                if (0 != (param0[param1 >> -1978231579] & 1 << (param1 & 31))) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("ol.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final static ud a(int param0, boolean param1, int param2, int param3) {
        ud var4;
        int var5;
        var5 = SteelSentinels.field_G;
        if (param1) {
          var4 = (ud) ((Object) uf.field_f.e(13058));
          L0: while (true) {
            if (var4 != null) {
              if (var4.field_t == param2) {
                return var4;
              } else {
                var4 = (ud) ((Object) uf.field_f.a((byte) -86));
                continue L0;
              }
            } else {
              var4 = new ud();
              var4.field_u = param3;
              var4.field_t = param2;
              uf.field_f.a(3, var4);
              r.a(27153, var4, param0);
              return var4;
            }
          }
        } else {
          return (ud) null;
        }
    }

    public static void k(int param0) {
        field_Xb = null;
        field_cc = (int[][]) null;
        field_Sb = null;
        if (param0 >= -5) {
          return;
        } else {
          field_ac = null;
          field_Zb = null;
          field_Wb = null;
          field_Vb = null;
          field_Tb = null;
          return;
        }
    }

    final boolean b(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        if (param1 <= -125) {
          this.a((byte) 11, true);
          if (0 == lb.field_gc) {
            if (0 != this.field_Yb.field_Eb) {
              return true;
            } else {
              return false;
            }
          } else {
            if (this.field_Eb != 0) {
              L0: {
                if (0 == this.field_Yb.field_Eb) {
                  stackIn_21_0 = 0;
                  break L0;
                } else {
                  stackIn_21_0 = 1;
                  break L0;
                }
              }
              return stackIn_21_0 != 0;
            } else {
              stackIn_17_0 = 1;
              return stackIn_17_0 != 0;
            }
          }
        } else {
          field_ac = (c) null;
          this.a((byte) 11, true);
          if (0 != lb.field_gc) {
            if (this.field_Eb == 0) {
              return true;
            } else {
              L1: {
                if (0 == this.field_Yb.field_Eb) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  stackIn_10_0 = 1;
                  break L1;
                }
              }
              return stackIn_10_0 != 0;
            }
          } else {
            L2: {
              if (0 == this.field_Yb.field_Eb) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    ol(gh param0, gh param1, gh param2, gh param3, gh param4, gh param5) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        gh var8 = null;
        gh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gh var13 = null;
        gh var14 = null;
        int var15 = 0;
        gh var17 = null;
        try {
          L0: {
            var17 = new gh(0L, param1, od.field_b.toUpperCase());
            var17.field_Kb = 1;
            this.field_Yb = new gh(0L, param2);
            var8 = new gh(0L, param3);
            var9 = new gh(0L, param3, od.field_f);
            var9.field_Kb = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (h.field_X.length <= var12) {
                var17.a(0, 0, 24, 0, 90 + (var11 + 20));
                var10 += 15;
                this.a(0, 100, var10 - -var17.field_Lb, 100, var17.field_zb);
                this.field_Yb.a(0, 5, 15, var17.field_zb + -20, 15);
                var8.a(0, var17.field_Lb, this.field_Lb + -var17.field_Lb, 0, this.field_zb);
                var9.a(0, 20, 15, 0, this.field_zb);
                var8.field_I = se.a(3, 2105376, 11579568, var8.field_Lb, 8421504, 13574);
                var17.a(this.field_Yb, 127);
                var8.a(var9, 119);
                this.a(var17, 123);
                this.a(var8, 119);
                this.field_Y = 320 - (this.field_zb >> 1983139873);
                var10 = -(this.field_Lb >> -1062311135) + 240;
                break L0;
              } else {
                L2: {
                  var13 = new gh(0L, param3, ci.field_b[var12]);
                  var14 = new gh(0L, param3, h.field_X[var12]);
                  var15 = param3.field_L.c(h.field_X[var12]);
                  var13.a(0, var10, 15, 20, 65);
                  if ((var11 ^ -1) <= (var15 ^ -1)) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(0, var10, 15, 90, 640);
                var8.a(var13, 127);
                var8.a(var14, 120);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var7);

            stackIn_10_1 = new StringBuilder().append("ol.<init>(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param5 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_26_2 + ')');
        }
    }

    final static void b(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (pm.field_T == vb.field_g) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (d.a(pm.field_T, 0)) {
                  i.field_e[pm.field_T].s(126);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-15 == (pm.field_T ^ -1)) {
                  um.f((byte) 3);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                pm.field_T = vb.field_g;
                pc.field_w = ea.field_k;
                if (2 != (pm.field_T ^ -1)) {
                  break L3;
                } else {
                  vl.field_v = false;
                  break L3;
                }
              }
              L4: {
                pm.field_U = 0;
                if (lc.field_e) {
                  L5: {
                    if (me.field_f != ml.field_g) {
                      jn.a(true, (byte) 71, 200, me.field_f);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (fk.field_i == null) {
                      break L6;
                    } else {
                      fk.field_i.f((byte) -92);
                      break L6;
                    }
                  }
                  L7: {
                    if (null != si.field_A) {
                      si.field_A.f((byte) -93);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  fk.field_i = null;
                  si.field_A = null;
                  lc.field_e = false;
                  break L4;
                } else {
                  break L4;
                }
              }
              L8: {
                if (!td.field_Sb) {
                  break L8;
                } else {
                  lc.field_c = null;
                  un.field_b = new ul();
                  var9 = ge.field_m;
                  var7 = var9;
                  var4 = var7;
                  var1 = var4;
                  var2 = 0;
                  L9: while (true) {
                    if (8 <= var2) {
                      var10 = ce.field_t;
                      var8 = var10;
                      var5 = var8;
                      var1 = var5;
                      var6 = 0;
                      var2 = var6;
                      L10: while (true) {
                        if (8 <= var6) {
                          td.field_Sb = false;
                          break L8;
                        } else {
                          var10[var6] = 0;
                          var6++;
                          continue L10;
                        }
                      }
                    } else {
                      var9[var2] = 0;
                      var2++;
                      continue L9;
                    }
                  }
                }
              }
              if (param0) {
                L11: {
                  if (!jc.field_d) {
                    break L11;
                  } else {
                    oa.f(-12161);
                    im.a(true);
                    ub.a(true);
                    jc.field_d = false;
                    break L11;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "ol.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_Xb = "EXCLUSIVE";
        field_Vb = new ul();
        field_Zb = "Not yet achieved";
        field_Sb = new dj(2);
        field_bc = -1;
        field_Ub = 0;
        field_dc = 0;
    }
}
