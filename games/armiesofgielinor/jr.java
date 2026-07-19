/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr {
    int field_g;
    int field_b;
    boolean field_a;
    static String field_e;
    static int[][] field_h;
    private int field_d;
    int field_c;
    int field_i;
    static vg field_f;

    final static int a(boolean param0) {
        if (param0) {
            field_e = (String) null;
            return cg.field_j;
        }
        return cg.field_j;
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        if (!(du.field_d != oh.field_L)) {
            return qk.field_b;
        }
        return ah.field_d;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 <= 52) {
          jr.b(125);
          field_f = null;
          field_h = (int[][]) null;
          return;
        } else {
          field_f = null;
          field_h = (int[][]) null;
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int discarded$1 = 0;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (!param2) {
            break L0;
          } else {
            discarded$1 = jr.a(false);
            break L0;
          }
        }
        L1: {
          if (this.field_a) {
            break L1;
          } else {
            L2: {
              L3: {
                if (-1 <= (param0 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (!this.b(112, sm.field_d, param1, param3, ko.field_b)) {
                      break L4;
                    } else {
                      hr.field_d[this.field_c].g(this.field_b + param3 + -25, param1 + (this.field_g - 25));
                      hr.field_d[0].f(param3 + (this.field_b + -25), -25 + this.field_g + param1, 256);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hr.field_d[this.field_c].g(this.field_b + param3 - 25, param1 + (this.field_g + -25));
                  if (var6 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              hr.field_d[this.field_c].g(param3 - (-this.field_b - -25), -25 + (this.field_g + param1), 128);
              break L2;
            }
            fe.a(this.field_b + param3, param1 - -this.field_g, this.field_c, param0, fe.field_b);
            if (var6 != 0) {
              break L1;
            } else {
              return;
            }
          }
        }
        L5: {
          if (0 >= param0) {
            break L5;
          } else {
            L6: {
              if (!this.b(31, sm.field_d, param1, param3, ko.field_b)) {
                break L6;
              } else {
                lw.field_ob.b(param3 - (-this.field_b - -20), -20 + (this.field_g + param1), bo.field_g[this.field_c]);
                if (var6 == 0) {
                  if ((this.field_i ^ -1) != -82) {
                    pl.field_x[this.field_i].g(this.field_b + param3 + -20, this.field_g + param1 + -20);
                    km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
                    if (var6 != 0) {
                      lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
                      if ((this.field_i ^ -1) == -82) {
                        pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
                        km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                        return;
                      } else {
                        pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 - -this.field_g), 0);
                        pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
                        km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    pl.field_x[4].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g));
                    if (var6 == 0) {
                      km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
                      if (var6 != 0) {
                        break L5;
                      } else {
                        return;
                      }
                    } else {
                      pl.field_x[this.field_i].g(this.field_b + param3 + -20, this.field_g + param1 + -20);
                      km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
                      if (var6 != 0) {
                        lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
                        if ((this.field_i ^ -1) == -82) {
                          pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
                          km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                          return;
                        } else {
                          pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 - -this.field_g), 0);
                          if (var6 != 0) {
                            pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
                            km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                            return;
                          } else {
                            km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L7: {
              L8: {
                lw.field_ob.d(-20 + this.field_b + param3, param1 + this.field_g - 20, bo.field_g[this.field_c]);
                if ((this.field_i ^ -1) != -82) {
                  break L8;
                } else {
                  pl.field_x[4].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g));
                  if (var6 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              pl.field_x[this.field_i].g(this.field_b + param3 + -20, this.field_g + param1 + -20);
              break L7;
            }
            L9: {
              km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
              if (var6 == 0) {
                break L9;
              } else {
                L10: {
                  lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
                  if ((this.field_i ^ -1) == -82) {
                    break L10;
                  } else {
                    pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 - -this.field_g), 0);
                    break L10;
                  }
                }
                pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
                km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
                break L9;
              }
            }
            return;
          }
        }
        lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
        if ((this.field_i ^ -1) == -82) {
          pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
          km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
          return;
        } else {
          pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 - -this.field_g), 0);
          if (var6 != 0) {
            pl.field_x[4].g(-20 + (param3 + this.field_b), param1 - -this.field_g + -20, 0);
            km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
            return;
          } else {
            km.field_h[0].g(-23 + param3 - -this.field_b, -23 + (param1 + this.field_g), 10);
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            param0 = param0 | param0 << -172819416;
            var5_int = param0 ^ param0 >> 399360353;
            var8 = -74 % ((55 - param1) / 32);
            var9 = 0;
            L1: while (true) {
              if (-5 >= (var9 ^ -1)) {
                break L0;
              } else {
                var7 = (7 & param0) + param2 + (bm.field_y[var9][1] - 64);
                var6 = -54 + (param4 + (bm.field_y[var9][0] - -(var5_int & 15)));
                var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
                param0 = param0 >> 1;
                var5_int = var5_int >> 1;
                jq.field_G[var10].h(60 + var6, 50 + var7);
                var9++;
                if (var11 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "jr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    jr(boolean param0, int param1, int param2, int param3) {
        this.field_d = param3;
        this.field_a = param0 ? true : false;
        this.field_c = param1;
        this.field_i = param2;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = -param1 + param3 - -this.field_b;
        if (param0 >= 10) {
          var7 = this.field_g + param2 + -param4;
          if (this.field_d * this.field_d > var7 * var7 + var6 * var6) {
            return true;
          } else {
            return false;
          }
        } else {
          field_e = (String) null;
          var7 = this.field_g + param2 + -param4;
          if (this.field_d * this.field_d > var7 * var7 + var6 * var6) {
            return true;
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, je param1, int param2, byte[] param3, int param4, je param5, int param6, int param7, int param8, je param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              uf.field_a = param7;
              t.field_b = param3;
              oh.field_H = -1L;
              tq.field_b = param3.length;
              no.field_K = null;
              ua.field_s = false;
              if (param8 < -52) {
                break L1;
              } else {
                field_h = (int[][]) null;
                break L1;
              }
            }
            ln.field_d = new byte[(uf.field_a + 7) / 8];
            vu.field_M = null;
            var10_int = 0;
            var11 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (t.field_b.length <= var11) {
                    break L4;
                  } else {
                    var10_int = var10_int + (t.field_b[var11] & 255);
                    var11++;
                    if (var12 != 0) {
                      break L3;
                    } else {
                      if (var12 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var10_int = (7 + var10_int) / 8;
                tg.field_d = new byte[var10_int];
                break L3;
              }
              L5: {
                if (param9.field_fb != null) {
                  break L5;
                } else {
                  param9.field_fb = new at();
                  break L5;
                }
              }
              L6: {
                be.field_u = param9.field_fb;
                be.field_u.b(80);
                oi.field_d = new tp(param4);
                vj.field_a = 0;
                be.field_s = -1;
                oo.field_a = 0;
                al.field_g = -1;
                if (null != param1.field_fb) {
                  break L6;
                } else {
                  param1.field_fb = new at();
                  break L6;
                }
              }
              L7: {
                qc.field_g = param1.field_fb;
                qc.field_g.b(120);
                qm.field_J = new tp(param6);
                if (null != param5.field_fb) {
                  break L7;
                } else {
                  param5.field_fb = new at();
                  break L7;
                }
              }
              wl.field_F = param5.field_fb;
              wl.field_F.b(122);
              eu.field_e = new tp(param0);
              qd.field_K = param2;
              ph.field_d = 0L;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var10);
            stackOut_17_1 = new StringBuilder().append("jr.D(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L8;
            }
          }
          L9: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          L10: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param4).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          L11: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param9 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L11;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    static {
        field_e = "<%0> has used <%1>";
        field_h = new int[][]{new int[]{303, 375, 440, 498, 560}, new int[]{288, 360, 425, 488, 560}, new int[]{303, 375, 440, 498, 560}, new int[]{283, 350, 417, 488, 560}};
        field_f = null;
    }
}
