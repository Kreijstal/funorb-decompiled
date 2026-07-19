/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pn extends ei {
    private int field_Q;
    private int field_S;
    private int field_P;
    private int field_O;
    static String[] field_R;
    private int field_L;
    private int field_N;
    static String field_M;

    void l(int param0) {
        if (param0 != -7476) {
            pn.k(10);
        }
    }

    boolean e(byte param0) {
        this.f((byte) -45);
        if (param0 != 28) {
            field_R = (String[]) null;
            return super.e((byte) 28);
        }
        return super.e((byte) 28);
    }

    void a(int param0, int param1, byte param2) {
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ZombieDawn.field_J;
        bi.f(6 + param0, param1 + 35, -12 + this.field_i, this.field_n - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var4 <= var7) {
            L1: {
              if (param2 <= -111) {
                break L1;
              } else {
                this.a(-128, -39, (byte) -12);
                break L1;
              }
            }
            var6 = 169;
            var4 = 22;
            var5 = 194;
            var7 = 0;
            var8 = param1 + 35;
            L2: while (true) {
              if (var4 <= var7) {
                we.field_Tb.b(this.field_i + param0 + -90, 10 + param1);
                ke.a(65, param0 + 5, ad.field_f, -10 + this.field_i, param1 - -35);
                ke.a(79, param0, dp.field_b, this.field_i, param1 - -this.field_n + -22);
                var6 = 127;
                var5 = 169;
                var4 = -79 + this.field_n;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var7 >= var4) {
                    return;
                  } else {
                    var9 = var5 - -(var7 * (var6 - var5) / var4);
                    var9 = var9 | (var9 << 1118479592 | var9 << -279127888);
                    bi.b(param0, var8, 6, var9);
                    bi.b(this.field_i + (param0 - 6), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (-var5 + var6) * var7 / var4;
                var9 = var9 | (var9 << -877822640 | var9 << -1941046328);
                bi.b(param0, var8, 6, var9);
                bi.b(param0 + this.field_i - 6, var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            if (var8 >= bi.field_l) {
              if (var8 < bi.field_d) {
                L4: {
                  var9 = var7 * (var6 - var5) / var4 + var5;
                  var10 = 0;
                  var11 = this.field_i;
                  if (20 < var7) {
                    break L4;
                  } else {
                    L5: while (true) {
                      if (-21 > (var10 ^ -1)) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (-var7 + 20) - -((-var10 + 20) * (20 - var10));
                        if (var12 <= 462) {
                          if (-421 < (var12 ^ -1)) {
                            break L4;
                          } else {
                            var13 = var9 * (462 + -var12) / 42;
                            var13 = var13 | (var13 << 59491088 | var13 << -2000922872);
                            bi.field_c[param0 + var8 * bi.field_f + var10] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (20 < var7) {
                    break L6;
                  } else {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if ((var13 ^ -1) < -21) {
                          break L8;
                        } else {
                          var14 = (20 - var7) * (-var7 + 20) - -(var13 * var13);
                          if ((var14 ^ -1) < -463) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = var9 * (-var14 + 462) / 42;
                              var15 = var15 | (var15 << 189923984 | var15 << -1535391544);
                              bi.field_c[var8 * bi.field_f + param0 - -var11] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = var11 + 1;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  }
                }
                var9 = var9 | (var9 << 907569456 | var9 << 530995592);
                bi.b(param0 + var10, var8, var11 + -var10, var9);
                var8++;
                var7++;
                continue L0;
              } else {
                var8++;
                var7++;
                continue L0;
              }
            } else {
              var8++;
              var7++;
              continue L0;
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        String var4 = null;
        if (param1 >= -32) {
          pn.k(-15);
          var4 = (String) null;
          gl.a(-753, (String) null, param0, param2);
          return;
        } else {
          var4 = (String) null;
          gl.a(-753, (String) null, param0, param2);
          return;
        }
    }

    boolean j(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 == 2634) {
          if (-1 > (this.field_Q ^ -1)) {
            var2 = this.field_N;
            var3 = this.field_O;
            fieldTemp$2 = this.field_L + 1;
            this.field_L = this.field_L + 1;
            if (fieldTemp$2 < this.field_Q) {
              var4 = (this.field_Q * 2 + -this.field_L) * this.field_L;
              var5 = this.field_Q * this.field_Q;
              var3 = this.field_S - -(var4 * (this.field_O + -this.field_S) / var5);
              var2 = (-this.field_P + this.field_N) * var4 / var5 + this.field_P;
              this.a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            } else {
              this.field_Q = 0;
              this.l(param0 + -10110);
              this.a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        } else {
          this.f((byte) -55);
          if (-1 > (this.field_Q ^ -1)) {
            var2 = this.field_N;
            var3 = this.field_O;
            fieldTemp$3 = this.field_L + 1;
            this.field_L = this.field_L + 1;
            if (fieldTemp$3 >= this.field_Q) {
              this.field_Q = 0;
              this.l(param0 + -10110);
              this.a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            } else {
              var4 = (this.field_Q * 2 + -this.field_L) * this.field_L;
              var5 = this.field_Q * this.field_Q;
              var3 = this.field_S - -(var4 * (this.field_O + -this.field_S) / var5);
              var2 = (-this.field_P + this.field_N) * var4 / var5 + this.field_P;
              this.a((byte) 123, var3, var2);
              return super.j(param0 + 0);
            }
          } else {
            return super.j(param0 + 0);
          }
        }
    }

    void f(byte param0) {
        if (!(this.field_Q > 0)) {
            return;
        }
        this.a((byte) 90, this.field_O, this.field_N);
        int var2 = 97 % ((22 - param0) / 59);
        this.field_Q = 0;
        this.l(-7476);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (0 < param3) {
          this.field_S = this.field_n;
          this.field_L = 0;
          if (param0) {
            this.field_L = 20;
            this.field_O = param1;
            this.field_N = param2;
            this.field_Q = param3;
            this.field_P = this.field_i;
            return;
          } else {
            this.field_O = param1;
            this.field_N = param2;
            this.field_Q = param3;
            this.field_P = this.field_i;
            return;
          }
        } else {
          this.a((byte) 98, param1, param2);
          return;
        }
    }

    final static void a(wk param0, int param1, ub param2) {
        fn discarded$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            if ((ac.field_m ^ -1) >= -1563) {
              L1: {
                var3_int = 11;
                if (param1 == 152) {
                  break L1;
                } else {
                  field_R = (String[]) null;
                  break L1;
                }
              }
              L2: {
                var4 = ac.field_m % var3_int;
                if (-1 != (ac.field_m % var3_int ^ -1)) {
                  break L2;
                } else {
                  lg.a(2 + var4 % (2 * var3_int) / var3_int * 2, (byte) -90);
                  break L2;
                }
              }
              L3: {
                if (-1.0f != oc.field_c) {
                  break L3;
                } else {
                  oc.field_c = (float)param0.field_c;
                  break L3;
                }
              }
              L4: {
                if (240.0f >= oc.field_c) {
                  break L4;
                } else {
                  oc.field_c = oc.field_c - i.field_V;
                  param0.field_c = (int)oc.field_c;
                  break L4;
                }
              }
              if (-1563 == (ac.field_m ^ -1)) {
                L5: {
                  if (null == qj.field_f) {
                    break L5;
                  } else {
                    if (!qj.field_f.l()) {
                      pc.a((byte) 13, qj.field_f);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                ch.b(124);
                hm.a(9);
                ZombieDawn.b(116, wi.field_a);
                qb.a(false, wc.field_Rb);
                wo.field_wb = true;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L6: {
                  if ((ac.field_m ^ -1) >= -991) {
                    if (990 == ac.field_m) {
                      wi.field_a = ce.field_u;
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    L7: {
                      var5 = 256 + (-ac.field_m + 990);
                      if (-1 < (var5 ^ -1)) {
                        var5 = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ZombieDawn.b(param1 + -30, wi.field_a * var5 >> -1067918552);
                    qb.a(false, var5 * wc.field_Rb >> 920776456);
                    vf.field_c.h(wc.field_Rb);
                    if (ac.field_m % 2 != 0) {
                      break L6;
                    } else {
                      param2.i(16777215);
                      if (100 == (ac.field_m - 990) / 2) {
                        hp.field_A.r((byte) -84);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                L8: {
                  if ((ac.field_m ^ -1) == -801) {
                    og.field_A = true;
                    discarded$1 = kh.a(64, false);
                    vf.field_c = kh.a(150, false);
                    dj.field_e.field_R.a(0, ne.field_c);
                    var5 = 0;
                    L9: while (true) {
                      if (pl.field_t.length <= var5) {
                        dj.field_e.field_R.a(0, new jj(370, 550));
                        break L8;
                      } else {
                        dj.field_e.field_R.a(0, pl.field_t[var5]);
                        var5++;
                        continue L9;
                      }
                    }
                  } else {
                    if (-951 != (ac.field_m ^ -1)) {
                      if (ac.field_m != 700) {
                        if (-701 < (ac.field_m ^ -1)) {
                          break L8;
                        } else {
                          if ((ac.field_m ^ -1) > -991) {
                            L10: {
                              var5 = 256 * (-700 + ac.field_m) / 50;
                              if ((var5 ^ -1) < -257) {
                                var5 = 256;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            nc.field_r.h(wc.field_Rb * var5 >> 1680868296);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        nc.field_r = jp.a((byte) 125, 152);
                        nc.field_r.h(0);
                        wc.field_Rb = ge.field_c;
                        break L8;
                      }
                    } else {
                      hp.field_A.q((byte) 111);
                      break L8;
                    }
                  }
                }
                L11: {
                  if ((ac.field_m ^ -1) < -141) {
                    L12: {
                      if (0.0f >= i.field_V) {
                        break L12;
                      } else {
                        if (0 == ac.field_m % 20) {
                          i.field_V = i.field_V - 0.4000000059604645f;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (i.field_V < 0.0f) {
                      i.field_V = 0.0f;
                      break L11;
                    } else {
                      return;
                    }
                  } else {
                    if (ac.field_m > 30) {
                      if (ac.field_m % 20 != 0) {
                        break L11;
                      } else {
                        if (1.7 > (double)i.field_V) {
                          i.field_V = i.field_V + 0.30000001192092896f;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) (var3);
            stackOut_60_1 = new StringBuilder().append("pn.T(");
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param0 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L13;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L13;
            }
          }
          L14: {
            stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
            stackOut_63_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_63_2).append(',').append(param1).append(',');
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param2 == null) {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L14;
            } else {
              stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
              stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L14;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ')');
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

    public static void k(int param0) {
        field_R = null;
        int var1 = 47 % ((param0 - 29) / 37);
        field_M = null;
    }

    pn(dn param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_Q = 0;
        this.field_L = 0;
    }

    static {
        field_M = "You have 1 unread message!";
    }
}
