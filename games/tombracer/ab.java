/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends qra {
    private int field_q;
    private int field_r;
    private int field_v;
    private int field_s;
    private int field_m;
    static String field_w;
    static int[] field_t;
    private cfa field_o;
    private int field_u;
    static sq field_n;
    private fv[][] field_p;

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 != 6153) {
            return;
        }
        field_n = null;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 == 25) {
          L0: {
            if (this.field_v == 0) {
              break L0;
            } else {
              if (this.a(true)) {
                break L0;
              } else {
                if (-85 != (param2 ^ -1)) {
                  if (83 != param2) {
                    return false;
                  } else {
                    this.i(12721);
                    return true;
                  }
                } else {
                  this.i(12721);
                  return true;
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    ab(qh param0, v param1) {
        super(param0, param1);
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
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
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_18_0 = 0;
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
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
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
        var13 = TombRacer.field_G ? 1 : 0;
        this.field_r = -1;
        this.field_v = 0;
        try {
          L0: {
            this.field_o = this.field_c.field_i;
            this.field_o.field_g = new w();
            var3_int = this.field_o.a(-28958);
            this.field_q = 3;
            this.field_s = 1;
            this.field_p = new fv[this.field_q][this.field_s];
            var4 = 0;
            var5 = aaa.a(false) - this.field_q * 100 + (100 - (this.field_q + -1) * 20);
            var5 = var5 / 2 + 0;
            var6 = -50 + (koa.b(0) + 100) + (-(this.field_s * 100) + -(16 * (this.field_s + -1)));
            var6 = var6 / 2 + 16;
            var7 = 0;
            L1: while (true) {
              stackOut_2_0 = var7;
              stackOut_2_1 = this.field_q;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  if (stackIn_3_0 >= stackIn_3_1) {
                    this.h(0);
                    stackOut_17_0 = 1;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  } else {
                    stackOut_4_0 = 0;
                    stackIn_18_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      var8 = stackIn_5_0;
                      L4: while (true) {
                        if (var8 >= this.field_s) {
                          var7++;
                          continue L1;
                        } else {
                          stackOut_7_0 = var4 ^ -1;
                          stackOut_7_1 = var3_int ^ -1;
                          stackIn_3_0 = stackOut_7_0;
                          stackIn_3_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (var13 != 0) {
                            continue L2;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_8_0 <= stackIn_8_1) {
                                  break L6;
                                } else {
                                  L7: {
                                    var9 = var5;
                                    var10 = var6;
                                    if (-1 <= (var7 ^ -1)) {
                                      break L7;
                                    } else {
                                      var9 = var9 + var7 * 120;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    if (var8 <= 0) {
                                      break L8;
                                    } else {
                                      var10 = var10 + 116 * var8;
                                      break L8;
                                    }
                                  }
                                  var11 = 100;
                                  var9 = var9 - var11 / 2;
                                  var12 = 100;
                                  var10 = var10 - var12 / 2;
                                  this.field_p[var7][var8] = new fv((ab) (this), var4, var9, var10, var11, var12);
                                  var4++;
                                  if (var13 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              this.field_p[var7][var8] = null;
                              break L5;
                            }
                            var8++;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                }
                er.b(stackIn_18_0, 0);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("ab.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var11_int = 0;
        int var12 = 0;
        fv var12_ref_fv = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_31_0 = false;
        int stackIn_43_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_42_0 = 0;
        boolean stackOut_30_0 = false;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          la.field_j.a(0, 0);
          var3 = 0;
          var4 = this.field_o.g(-1);
          if (this.field_h.d((byte) 63)) {
            break L0;
          } else {
            if (this.field_h.field_x == var4) {
              var3 = 1;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var5 = 160;
            var6 = aaa.a(false) / 2;
            var7 = koa.b(0) / 2;
            ura.a(-10985);
            var5 = 128;
            if (var4 < 0) {
              break L2;
            } else {
              L3: {
                L4: {
                  var8 = (aaa.a(false) >> -427900127) + -(gg.field_f.a() >> -1329966719);
                  var9 = (koa.b(0) >> 547907969) + -(gg.field_f.c() >> 744524545);
                  gg.field_f.a(var8, var9);
                  if (var3 == 0) {
                    break L4;
                  } else {
                    L5: {
                      discarded$5 = be.a(us.field_c.toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 32, var8, 1, (byte) 60, gg.field_f.a());
                      var10 = (-this.field_o.c(-1) + 750) / 50 - -1;
                      if (-1 >= (var10 ^ -1)) {
                        break L5;
                      } else {
                        var10 = 0;
                        break L5;
                      }
                    }
                    discarded$6 = be.a(gl.a((byte) 108, tla.field_h, new String[]{Integer.toString(var10)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, var9 + 200, var8, 1, (byte) 60, gg.field_f.a());
                    if (var16 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                discarded$7 = be.a(gl.a((byte) 83, cba.field_c, new String[]{this.field_h.j(var4, 9)}).toUpperCase(), 1, eda.field_f, 16777215, 0, 32, 1, 32 + var9, var8, 1, (byte) 60, gg.field_f.a());
                break L3;
              }
              var10 = 0;
              L6: while (true) {
                if (this.field_q <= var10) {
                  break L2;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_27_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var16 != 0) {
                    break L1;
                  } else {
                    var11_int = stackIn_13_0;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var11_int >= this.field_s) {
                            break L9;
                          } else {
                            var12_ref_fv = this.field_p[var10][var11_int];
                            if (var16 != 0) {
                              break L8;
                            } else {
                              L10: {
                                if (var12_ref_fv == null) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (!this.a(true)) {
                                      break L11;
                                    } else {
                                      if (var10 != this.field_u) {
                                        break L11;
                                      } else {
                                        if (var11_int == this.field_m) {
                                          tga.field_a.c(fm.a(false, wga.field_a[this.field_h.field_x]), var12_ref_fv.field_g, var12_ref_fv.field_j, var12_ref_fv.field_c, -22971, var12_ref_fv.field_i);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var12_ref_fv.a(1);
                                  break L10;
                                }
                              }
                              var11_int++;
                              if (var16 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        var10++;
                        break L8;
                      }
                      if (var16 == 0) {
                        continue L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
            }
          }
          var8 = 0;
          stackOut_26_0 = param0;
          stackIn_27_0 = stackOut_26_0;
          break L1;
        }
        L12: {
          if (stackIn_27_0 <= -50) {
            break L12;
          } else {
            this.b(-64, false);
            break L12;
          }
        }
        L13: while (true) {
          L14: {
            if (this.field_c.field_H.length <= var8) {
              stackOut_42_0 = -6;
              stackIn_43_0 = stackOut_42_0;
              break L14;
            } else {
              var9 = -(this.field_c.field_H.length * var5 / 2) + var6 - -(var5 * var8);
              var10 = -200 + var7;
              discarded$8 = be.a(this.field_h.a(var8, false).toUpperCase(), 1, kn.field_p, wga.field_a[var8], 0, 32, 1, var10, var9, 1, (byte) 60, var5);
              stackOut_30_0 = this.field_c.b((byte) 90, var8);
              stackIn_43_0 = stackOut_30_0 ? 1 : 0;
              stackIn_31_0 = stackOut_30_0;
              if (var16 != 0) {
                break L14;
              } else {
                L15: {
                  L16: {
                    if (!stackIn_31_0) {
                      break L16;
                    } else {
                      L17: {
                        L18: {
                          var13 = this.field_c.field_H[var8].z(115);
                          if (0 == (var13 ^ -1)) {
                            break L18;
                          } else {
                            var12 = 16777215;
                            var11 = sla.field_b[var13];
                            if (var16 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        L19: {
                          var14 = this.field_c.field_c.field_b[var8];
                          var15 = this.field_o.b((byte) 50);
                          if (var14 >= var15) {
                            break L19;
                          } else {
                            var11 = cga.field_l;
                            var12 = 8947848;
                            if (var16 == 0) {
                              break L17;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (var14 != var15) {
                            break L20;
                          } else {
                            var12 = 16777215;
                            var11 = bp.field_o;
                            if (var16 == 0) {
                              break L17;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var12 = 12303291;
                        var11 = g.field_i;
                        break L17;
                      }
                      if (var16 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  var11 = cs.field_b;
                  var12 = 8947848;
                  break L15;
                }
                discarded$9 = be.a(var11.toUpperCase(), 1, kn.field_p, var12, 0, 32, 1, 32 + var10, var9, 1, (byte) 60, var5);
                var8++;
                continue L13;
              }
            }
          }
          se.f((byte) stackIn_43_0);
          this.d(-27142);
          return;
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 < -4) {
              if (ni.field_c) {
                L1: {
                  if ((bta.field_q ^ -1) != -3) {
                    break L1;
                  } else {
                    if (null == mn.field_n) {
                      break L1;
                    } else {
                      var3 = (CharSequence) ((Object) param0);
                      if (!mn.field_n.equals(jd.a(1, var3))) {
                        break L1;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ab.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    private final boolean b(int param0, int param1, byte param2) {
        if (!this.a(true)) {
            return false;
        }
        if ((param1 ^ -1) > -1) {
            return false;
        }
        if ((param0 ^ -1) > -1) {
            return false;
        }
        if (this.field_q <= param1) {
            return false;
        }
        if (param0 >= this.field_s) {
            return false;
        }
        fv var4 = this.field_p[param1][param0];
        if (param2 < 78) {
            this.a(32, 41, (byte) 103);
        }
        if (var4 == null) {
            return false;
        }
        if (!(this.field_o.a((byte) 119, var4.field_f))) {
            return false;
        }
        this.field_m = param0;
        this.field_u = param1;
        return true;
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return true;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        boolean discarded$2 = false;
        int var4 = 0;
        jha var5 = null;
        jha var6 = null;
        L0: {
          if (this.field_o.g(-1) != param0) {
            break L0;
          } else {
            L1: {
              if (0 != (param2 ^ -1)) {
                break L1;
              } else {
                var6 = ab.a(-9, gl.a((byte) 86, oba.field_n, new String[]{this.field_c.e(param0, 23807)}));
                iqa.field_c.a(0, var6);
                this.field_o.a(param2, (byte) 112);
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_o.a(-108, param2);
            this.field_o.a(param2, (byte) 119);
            this.h(0);
            var5 = ab.a(-58, gl.a((byte) 125, fva.field_b, new String[]{this.field_c.e(param0, 23807), sla.field_b[var4]}));
            iqa.field_c.a(0, var5);
            break L0;
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            discarded$2 = ab.a(-52, 79, -8, 36, 97, 39, -99);
            break L2;
          }
        }
    }

    private final void g(int param0) {
        if (!(this.field_v != 0)) {
            return;
        }
        if (!(!qma.field_c)) {
            if (this.a(sta.field_B, 25006, jba.field_j)) {
                if (!((hf.field_b ^ -1) != -2)) {
                    this.i(12721);
                }
            }
        }
        if (!(!this.field_h.g(param0, 2))) {
            this.a(0, -1, (byte) 56);
        }
        if (!(!this.field_h.g(0, 3))) {
            this.a(0, 1, (byte) 80);
        }
        if (this.field_h.g(0, 0)) {
            this.a(-1, 0, (byte) 51);
        }
        if (!(!this.field_h.g(0, 1))) {
            this.a(1, 0, (byte) 73);
        }
        if (!(!this.field_h.g(0, 4))) {
            this.i(12721);
        }
    }

    private final boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_n = (sq) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_h.d((byte) 98)) {
              break L2;
            } else {
              if (this.field_h.field_x != this.field_o.g(-1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void i(int param0) {
        int var2 = 0;
        if (!this.a(true)) {
          return;
        } else {
          var2 = this.field_p[this.field_u][this.field_m].field_f;
          if (this.field_o.a((byte) 127, var2)) {
            if (param0 != 12721) {
              return;
            } else {
              L0: {
                L1: {
                  if (null == this.field_f) {
                    break L1;
                  } else {
                    this.field_f.c(var2, 1);
                    if (!TombRacer.field_G) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                this.field_o.a(var2, (byte) 102);
                break L0;
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1) {
        boolean discarded$0 = false;
        if (!(this.field_r <= 0)) {
            this.field_r = this.field_r - 1;
            return;
        }
        this.field_o.d((byte) -124);
        if (param1) {
            if (this.a(true)) {
                this.g(param0 + -80);
            }
        }
        if (param0 != 80) {
            discarded$0 = this.e(-116);
        }
        if (!(!this.field_o.f(param0 ^ -28956))) {
            this.field_r = 100;
        }
        if (param1) {
            this.c(7);
        }
        this.field_v = this.field_v + 1;
        if (this.field_o.g(-1) == this.field_h.field_x) {
            if (!(this.field_o.c(-1) <= 500)) {
                if ((750 - this.field_o.c(-1)) % 50 == 0) {
                    this.field_o.a((byte) -124);
                }
            }
        }
    }

    private final void h(int param0) {
        this.field_m = param0;
        this.field_u = 0;
    }

    final cfa b(byte param0) {
        int var2 = -72 / ((35 - param0) / 62);
        return this.field_o;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fv var6 = null;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param1 == 25006) {
            break L0;
          } else {
            this.h(-51);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (this.field_q > var4) {
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var7 == 0) {
              var5 = stackIn_7_0;
              L2: while (true) {
                L3: {
                  if (this.field_s <= var5) {
                    var4++;
                    break L3;
                  } else {
                    var6 = this.field_p[var4][var5];
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          break L4;
                        } else {
                          if (!var6.a(param0, false, param2)) {
                            break L4;
                          } else {
                            return this.b(var5, var4, (byte) 122);
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
                continue L1;
              }
            } else {
              return stackIn_6_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param6 > 100) {
            break L0;
          } else {
            field_t = (int[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param5 > param1) {
              break L2;
            } else {
              if (param1 > param4) {
                break L2;
              } else {
                if (param3 < param0) {
                  break L2;
                } else {
                  if (param3 > param2) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static jha a(int param0, String param1) {
        RuntimeException var2 = null;
        jha stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jha stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -4) {
                break L1;
              } else {
                ab.f(-54);
                break L1;
              }
            }
            stackOut_2_0 = new jha(1, (String) null, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ab.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        fv var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!this.a(true)) {
          return;
        } else {
          L0: {
            var4 = 0;
            if (param2 >= 9) {
              break L0;
            } else {
              this.field_v = 58;
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              if (var4 != 0) {
                break L2;
              } else {
                this.field_m = this.field_m + param1;
                this.field_u = this.field_u + param0;
                if (var6 != 0) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if ((this.field_m ^ -1) <= -1) {
                        break L4;
                      } else {
                        this.field_m = this.field_s - 1;
                        if (var6 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (this.field_s > this.field_m) {
                      break L3;
                    } else {
                      this.field_m = 0;
                      break L3;
                    }
                  }
                  L5: {
                    L6: {
                      if (this.field_u >= 0) {
                        break L6;
                      } else {
                        this.field_u = -1 + this.field_q;
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (this.field_u < this.field_q) {
                      break L5;
                    } else {
                      this.field_u = 0;
                      break L5;
                    }
                  }
                  L7: {
                    L8: {
                      var5 = this.field_p[this.field_u][this.field_m];
                      if (var5 != null) {
                        break L8;
                      } else {
                        var4 = 0;
                        if (var6 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (this.field_o.a((byte) -64, var5.field_f)) {
                        break L9;
                      } else {
                        var4 = 0;
                        if (var6 == 0) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var4 = 1;
                    break L7;
                  }
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            return;
          }
        }
    }

    static {
        field_w = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_t = new int[]{135, 230, 520};
    }
}
