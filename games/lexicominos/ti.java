/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends nb implements nf, jk {
    private kf field_E;
    static long field_M;
    private String field_F;
    private rl field_G;
    static db[] field_I;
    private rl field_B;
    private kf field_H;
    private boolean field_K;
    private boolean field_J;
    static eg field_L;
    private boolean field_D;
    private kf field_N;
    static String field_C;

    private final void g(int param0) {
        CharSequence var3;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (CharSequence) null;
            ti.a(-118, (CharSequence) null, -52, true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (sg.a(false)) {
              break L2;
            } else {
              if (0 >= this.field_G.field_u.length()) {
                break L1;
              } else {
                if (0 >= this.field_B.field_u.length()) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          ha.a(this.field_G.field_u, this.field_B.field_u, param0 ^ -111);
          break L1;
        }
    }

    public final void a(byte param0, rl param1) {
        try {
            if (param0 != 10) {
                field_M = 116L;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ti.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 107)) {
              var5_int = -37 % ((-13 - param3) / 55);
              if (-99 == (param1 ^ -1)) {
                stackIn_6_0 = this.a(0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param1 ^ -1) != -100) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.c((byte) 119, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ti.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    final void a(int param0, String param1) {
        rl var3 = null;
        String var4 = null;
        try {
            if (param0 != 3) {
                this.field_G = (rl) null;
            }
            var3 = this.field_G;
            var4 = param1;
            var3.a(var4, param0 + -4, false);
            this.field_B.j(0);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ti.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(rl param0, boolean param1) {
        if (!(this.field_G != param0)) {
            this.field_B.a((byte) 44, (w) (this));
        }
        if (!param1) {
            return;
        }
        try {
            if (this.field_B == param0) {
                this.g(0);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ti.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_39_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  var4_int = 30 % ((-72 - param2) / 54);
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var8) {
                      if (var6 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackIn_39_0 = var7;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var10 = param1.charAt(var9);
                          if (var9 != 0) {
                            break L4;
                          } else {
                            if (var10 != 45) {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                if (!param3) {
                                  break L4;
                                } else {
                                  var9++;
                                  continue L2;
                                }
                              }
                            } else {
                              var5 = 1;
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (var10 > 57) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (var10 <= 90) {
                                var10 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (var10 <= 122) {
                                var10 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var10 >= param0) {
                          throw new NumberFormatException();
                        } else {
                          L9: {
                            if (var5 == 0) {
                              break L9;
                            } else {
                              var10 = -var10;
                              break L9;
                            }
                          }
                          var11 = var10 + param0 * var7;
                          if (var11 / param0 == var7) {
                            var6 = 1;
                            var7 = var11;
                            break L3;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4);

            stackIn_42_1 = new StringBuilder().append("ti.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L10;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_39_0;
    }

    final static jb[] a(byte param0) {
        int var2 = 0;
        int var3 = Lexicominos.field_L ? 1 : 0;
        jb[] var1 = new jb[th.field_t];
        for (var2 = 0; th.field_t > var2; var2++) {
            var1[var2] = new jb(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], be.field_f[var2], ci.field_b);
        }
        if (param0 <= 103) {
            field_M = -84L;
        }
        gk.a(12428);
        return var1;
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 == this.field_N) {
                this.g(0);
                break L1;
              } else {
                if (param4 == this.field_H) {
                  bg.a(false);
                  break L1;
                } else {
                  if (this.field_E == param4) {
                    if (!this.field_J) {
                      if (this.field_D) {
                        ga.b(0);
                        break L1;
                      } else {
                        ld.i(param2 ^ -215531225);
                        break L1;
                      }
                    } else {
                      vi.a((byte) 115);
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 == 215535458) {
                break L2;
              } else {
                field_L = (eg) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    final String e(byte param0) {
        int var2 = -19 % ((-3 - param0) / 60);
        if (this.field_G.field_u == null) {
            return "";
        }
        return this.field_G.field_u;
    }

    ti(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (rd) null);
        jf dupTemp$0 = null;
        jf dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        kf stackIn_17_1 = null;
        kf stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        kf stackIn_18_1 = null;
        kf stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        v var6 = null;
        RuntimeException var6_ref = null;
        le var7 = null;
        String var8 = null;
        m var9 = null;
        jf var12 = null;
        jf var13 = null;
        try {
          L0: {
            L1: {
              this.field_F = param1;
              stackIn_3_0 = this;

              if (!param4) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((ti) (this)).field_D = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param3) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((ti) (this)).field_K = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param2) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((ti) (this)).field_J = stackIn_10_1 != 0;
              if (!this.field_J) {
                break L4;
              } else {
                L5: {
                  if (this.field_K) {
                    break L5;
                  } else {
                    if (!this.field_D) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                throw new IllegalStateException();
              }
            }
            L6: {
              this.field_G = (rl) ((Object) new cl(param0, (vd) (this), 100));
              this.field_B = (rl) ((Object) new cl("", (vd) (this), 20));
              if (this.field_J) {
                this.field_N = new kf(og.field_j, (vd) null);
                this.field_E = new kf(jd.field_d, (vd) null);
                this.field_G.field_D = false;
                break L6;
              } else {
                L7: {
                  this.field_N = new kf(be.field_i, (vd) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (this.field_D) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = a.field_f;
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = a.field_e;
                    break L7;
                  }
                }
                ((ti) (this)).field_E = new kf(stackIn_18_3, (vd) null);
                if (!this.field_K) {
                  break L6;
                } else {
                  this.field_H = new kf(ri.field_d, (vd) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_G.field_i = (rd) ((Object) new id(10000536));
              this.field_B.field_i = (rd) ((Object) new di(10000536));
              var6 = new v();
              this.field_N.field_i = (rd) ((Object) var6);
              if (this.field_E == null) {
                break L8;
              } else {
                this.field_E.field_i = (rd) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_G.field_q = ib.field_i;
              if (this.field_H == null) {
                break L9;
              } else {
                this.field_H.field_i = (rd) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_H) {
                break L10;
              } else {
                this.field_H.field_q = hi.field_a;
                break L10;
              }
            }
            L11: {
              if (!this.field_J) {
                if (!this.field_D) {
                  this.field_E.field_i = (rd) ((Object) new uj());
                  break L11;
                } else {
                  this.field_E.field_q = il.field_a;
                  this.field_E.field_i = (rd) ((Object) new uj());
                  break L11;
                }
              } else {
                this.field_E.field_q = ig.field_d;
                break L11;
              }
            }
            L12: {
              this.field_o = 15;
              var7 = ql.field_Q;
              if (null == this.field_F) {
                break L12;
              } else {
                this.field_o = this.field_o + (5 + var7.a(this.field_F, this.field_j + -40, var7.field_E));
                break L12;
              }
            }
            L13: {
              var8 = nb.field_y;
              var9 = kb.a((byte) -31, kk.c(-14047));
              if (var9 == bb.field_J) {
                var8 = fg.field_d;
                break L13;
              } else {
                if (var9 != mh.field_B) {
                  break L13;
                } else {
                  var8 = ah.field_a;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new jf(10, this.field_o, this.field_j - 20, 25, this.field_G, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) 125, dupTemp$0);
              this.field_o = this.field_o + (5 + ((w) ((Object) var12)).field_v);
              dupTemp$1 = new jf(10, this.field_o, -20 + this.field_j, 25, this.field_B, false, 80, 3, var7, 16777215, p.field_b);
              var13 = dupTemp$1;
              this.b((byte) -100, dupTemp$1);
              this.field_N.field_r = (vd) (this);
              this.field_o = this.field_o + (((w) ((Object) var13)).field_v + 5);
              if (null == this.field_H) {
                break L14;
              } else {
                this.field_H.field_r = (vd) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_E) {
                break L15;
              } else {
                this.field_E.field_r = (vd) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_H == null) {
                this.field_N.a(30, -6 + this.field_j + -10, true, this.field_o, 8);
                this.field_o = this.field_o + 35;
                break L16;
              } else {
                this.field_N.a(30, -95 + this.field_j, true, this.field_o, 85);
                this.field_o = this.field_o + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_H) {
                break L17;
              } else {
                this.field_H.a(30, -10 + (-6 + this.field_j), true, this.field_o, 8);
                this.field_o = this.field_o + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_E == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_J) {
                    break L19;
                  } else {
                    if (!this.field_D) {
                      this.field_E.a(20, 40, true, this.field_o, 8);
                      this.field_o = this.field_o + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_E.a(30, -16 + this.field_j, true, this.field_o, 8);
                this.field_o = this.field_o + 35;
                break L18;
              }
            }
            L20: {
              this.a(3 + this.field_o, this.field_j, true, 0, 0);
              this.b((byte) 67, this.field_N);
              if (this.field_H == null) {
                break L20;
              } else {
                this.b((byte) -77, this.field_H);
                break L20;
              }
            }
            L21: {
              if (this.field_E == null) {
                break L21;
              } else {
                this.b((byte) -112, this.field_E);
                break L21;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("ti.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L22;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L23;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L23;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(byte param0) {
        this.field_G.j(0);
        this.field_B.j(0);
        if (param0 > -59) {
            CharSequence var3 = (CharSequence) null;
            ti.a(-96, (CharSequence) null, 81, true);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (null != this.field_F) {
            ql.field_Q.a(this.field_F, 20 + (this.field_t + param2), 15 + (param1 + this.field_o), this.field_j - 40, this.field_v, 16777215, -1, 1, 0, ql.field_Q.field_E);
        }
        if (this.field_H != null) {
            lf.a(param2 + 10, param1 + 134, this.field_j - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void e(boolean param0) {
        field_I = null;
        field_C = null;
        field_L = null;
        if (param0) {
            field_L = (eg) null;
        }
    }

    static {
        field_C = "Confirm Email:";
    }
}
