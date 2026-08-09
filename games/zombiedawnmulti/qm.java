/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends se implements fi, in {
    static String field_I;
    private pm field_M;
    private boolean field_L;
    private gn field_P;
    private gn field_J;
    private boolean field_K;
    static String field_N;
    private pm field_H;
    private gn field_G;
    private boolean field_Q;
    private String field_O;

    final void a(int param0, String param1) {
        pm var4 = null;
        String var5 = null;
        try {
            int var3_int = 62 / ((-46 - param0) / 51);
            var4 = this.field_H;
            var5 = param1;
            var4.a(false, var5, (byte) 119);
            this.field_M.b(true);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(jh param0, boolean param1, String param2, int param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        jb var7 = null;
        String var8 = null;
        jb var9 = null;
        String var10 = null;
        jb var11 = null;
        String var12 = null;
        jb var13 = null;
        try {
          L0: {
            L1: {
              ve.a(0L, 196, (String) null, ek.field_H, (String) null, param0, -1, (int[]) null, param0.i(6));
              if (!param0.field_Fb) {
                break L1;
              } else {
                L2: {
                  if (param0.field_fc == 2) {
                    break L2;
                  } else {
                    if (-3 < (kj.field_q ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = pk.field_b;
                var8 = vl.a(wj.field_f, new String[]{param2}, 2);
                var7.field_j.a((byte) -118, var8, 10);
                break L1;
              }
            }
            L3: {
              pk.field_b.a((byte) -120);
              if (param1) {
                L4: {
                  if (ao.field_e == pk.field_b.field_b) {
                    break L4;
                  } else {
                    var9 = pk.field_b;
                    var10 = vl.a(kj.field_f, new String[]{param2}, 2);
                    var9.field_j.a((byte) -118, var10, 15);
                    if (!ZombieDawnMulti.field_E) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var11 = pk.field_b;
                var12 = vl.a(ag.field_g, new String[]{param2}, 2);
                var11.field_j.a((byte) -118, var12, 16);
                break L3;
              } else {
                break L3;
              }
            }
            L5: {
              var13 = pk.field_b;
              var5 = vb.field_f;
              if (param3 < -117) {
                break L5;
              } else {
                field_I = (String) null;
                break L5;
              }
            }
            var6 = ka.field_t;
            var13.field_j.b(4542, var5, 0, var6, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("qm.K(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param3 < -83) {
              L1: {
                L2: {
                  if (this.field_G == param2) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (this.field_P == param2) {
                          break L4;
                        } else {
                          if (param2 == this.field_J) {
                            L5: {
                              if (!this.field_K) {
                                break L5;
                              } else {
                                oi.a(-124);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (!this.field_L) {
                                break L6;
                              } else {
                                dq.c(-118);
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            qi.a(false);
                            if (var7 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      hb.a(0);
                      if (var7 == 0) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                    break L1;
                  }
                }
                this.a((byte) -95);
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6);

            stackIn_21_1 = new StringBuilder().append("qm.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_O) {
            ke.field_h.a(this.field_O, param3 - (-this.field_y + -20), 15 + (this.field_i + param1), this.field_n - 40, this.field_w, 16777215, -1, 1, 0, ke.field_h.field_C);
        }
        if (null != this.field_P) {
            oo.b(param3 + 10, param1 - -134, -20 + this.field_n, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final String h(int param0) {
        if (param0 != 6728) {
            return (String) null;
        }
        if (!(null != this.field_H.field_j)) {
            return "";
        }
        return this.field_H.field_j;
    }

    final void g(byte param0) {
        this.field_H.b(true);
        if (param0 < 101) {
            this.a(39, '￟', (cf) null, 8);
        }
        this.field_M.b(true);
    }

    qm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (nl) null);
        el dupTemp$0 = null;
        el dupTemp$1 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_18_0 = null;
        gn stackIn_18_1 = null;
        gn stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        gn stackIn_19_1 = null;
        gn stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        oq var6 = null;
        RuntimeException var6_ref = null;
        fm var7 = null;
        String var8 = null;
        bo var9 = null;
        int var11 = 0;
        el var12 = null;
        el var13 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param3) {
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
              ((qm) (this)).field_Q = stackIn_4_1 != 0;
              this.field_O = param1;
              stackIn_6_0 = this;

              if (!param4) {
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
              ((qm) (this)).field_L = stackIn_7_1 != 0;
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
              ((qm) (this)).field_K = stackIn_10_1 != 0;
              if (!this.field_K) {
                break L4;
              } else {
                L5: {
                  if (this.field_Q) {
                    break L5;
                  } else {
                    if (!this.field_L) {
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
              L7: {
                this.field_H = (pm) ((Object) new on(param0, (bj) (this), 100));
                this.field_M = (pm) ((Object) new on("", (bj) (this), 20));
                if (!this.field_K) {
                  break L7;
                } else {
                  this.field_G = new gn(ci.field_g, (bj) null);
                  this.field_J = new gn(oe.field_b, (bj) null);
                  this.field_H.field_F = false;
                  if (var11 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                this.field_G = new gn(qo.field_s, (bj) null);
                stackIn_18_0 = this;

                stackIn_18_1 = null;

                stackIn_18_2 = null;

                if (!this.field_L) {
                  stackIn_19_0 = this;
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_3 = sn.field_Zb;
                  break L8;
                } else {
                  stackIn_19_0 = this;
                  stackIn_19_1 = null;
                  stackIn_19_2 = null;
                  stackIn_19_3 = gf.field_a;
                  break L8;
                }
              }
              ((qm) (this)).field_J = new gn(stackIn_19_3, (bj) null);
              if (!this.field_Q) {
                break L6;
              } else {
                this.field_P = new gn(en.field_a, (bj) (this));
                break L6;
              }
            }
            L9: {
              this.field_H.field_h = (nl) ((Object) new tb(10000536));
              this.field_M.field_h = (nl) ((Object) new m(10000536));
              var6 = new oq();
              this.field_G.field_h = (nl) ((Object) var6);
              if (this.field_J == null) {
                break L9;
              } else {
                this.field_J.field_h = (nl) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_P) {
                break L10;
              } else {
                this.field_P.field_h = (nl) ((Object) var6);
                break L10;
              }
            }
            L11: {
              this.field_H.field_x = lh.field_e;
              if (null == this.field_P) {
                break L11;
              } else {
                this.field_P.field_x = field_I;
                break L11;
              }
            }
            L12: {
              L13: {
                if (this.field_K) {
                  break L13;
                } else {
                  L14: {
                    if (this.field_L) {
                      break L14;
                    } else {
                      this.field_J.field_h = (nl) ((Object) new he());
                      if (var11 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  this.field_J.field_x = de.field_a;
                  this.field_J.field_h = (nl) ((Object) new he());
                  if (var11 == 0) {
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              this.field_J.field_x = gi.field_p;
              break L12;
            }
            L15: {
              this.field_i = 15;
              var7 = ke.field_h;
              if (null == this.field_O) {
                break L15;
              } else {
                this.field_i = this.field_i + (var7.a(this.field_O, this.field_n - 40, var7.field_C) - -5);
                break L15;
              }
            }
            L16: {
              L17: {
                var8 = sh.field_M;
                var9 = me.a(-57, jl.b(0));
                if (wp.field_b != var9) {
                  break L17;
                } else {
                  var8 = fa.field_Gb;
                  if (var11 == 0) {
                    break L16;
                  } else {
                    break L17;
                  }
                }
              }
              if (l.field_c != var9) {
                break L16;
              } else {
                var8 = lj.field_f;
                break L16;
              }
            }
            L18: {
              dupTemp$0 = new el(10, this.field_i, -20 + this.field_n, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) 112, dupTemp$0);
              this.field_i = this.field_i + (((cf) ((Object) var12)).field_w + 5);
              dupTemp$1 = new el(10, this.field_i, -20 + this.field_n, 25, this.field_M, false, 80, 3, var7, 16777215, gn.field_D);
              var13 = dupTemp$1;
              this.b((byte) 108, dupTemp$1);
              this.field_i = this.field_i + (5 + ((cf) ((Object) var13)).field_w);
              this.field_G.field_A = (bj) (this);
              if (null == this.field_P) {
                break L18;
              } else {
                this.field_P.field_A = (bj) (this);
                break L18;
              }
            }
            L19: {
              if (null == this.field_J) {
                break L19;
              } else {
                this.field_J.field_A = (bj) (this);
                break L19;
              }
            }
            L20: {
              L21: {
                if (this.field_P == null) {
                  break L21;
                } else {
                  this.field_G.b(85, this.field_i, 28972, this.field_n + -95, 30);
                  this.field_i = this.field_i + 60;
                  if (var11 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_G.b(8, this.field_i, 28972, this.field_n - 6 + -10, 30);
              this.field_i = this.field_i + 35;
              break L20;
            }
            L22: {
              if (this.field_P == null) {
                break L22;
              } else {
                this.field_P.b(8, this.field_i, 28972, -10 + (-6 + this.field_n), 30);
                this.field_i = this.field_i + 35;
                break L22;
              }
            }
            L23: {
              if (null == this.field_J) {
                break L23;
              } else {
                L24: {
                  if (this.field_K) {
                    break L24;
                  } else {
                    if (this.field_L) {
                      break L24;
                    } else {
                      this.field_J.b(8, this.field_i, 28972, 40, 20);
                      this.field_i = this.field_i + 25;
                      if (var11 == 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                this.field_J.b(8, this.field_i, 28972, -10 + (this.field_n + -6), 30);
                this.field_i = this.field_i + 35;
                break L23;
              }
            }
            L25: {
              this.b(0, 0, 28972, this.field_n, 3 + this.field_i);
              this.b((byte) 70, this.field_G);
              if (null == this.field_P) {
                break L25;
              } else {
                this.b((byte) 71, this.field_P);
                break L25;
              }
            }
            L26: {
              if (this.field_J == null) {
                break L26;
              } else {
                this.b((byte) 126, this.field_J);
                break L26;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var6_ref);

            stackIn_59_1 = new StringBuilder().append("qm.<init>(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L27;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_62_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');

            if (param1 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "null";
              break L28;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_63_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackIn_63_2 = "{...}";
              break L28;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 19 % ((-23 - param0) / 59);
        field_N = null;
        field_I = null;
    }

    final boolean a(int param0, char param1, cf param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 98) {
                if (-100 == (param0 ^ -1)) {
                  stackIn_10_0 = this.a(66, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a((byte) -1, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("qm.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static ae a(ga param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.d((byte) 69);
              var3 = param0.d((byte) 69);
              var4 = param0.d((byte) 69);
              var5 = param0.d((byte) 69);
              if (param1) {
                break L1;
              } else {
                qm.a(16);
                break L1;
              }
            }
            var6 = param0.d((byte) 69);
            stackIn_3_0 = fn.a(var6, var4, var3, (byte) 104, var2_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qm.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ae) ((Object) stackIn_3_0);
    }

    public final void a(pm param0, int param1) {
        try {
            if (param1 != 0) {
                qm.a(-1.2370823621749878f, -17, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(pm param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (this.field_H == param0) {
                this.field_M.a((cf) (this), 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_M != param0) {
                break L2;
              } else {
                this.a((byte) -99);
                break L2;
              }
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                this.field_G = (gn) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("qm.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final static vg b(int param0, int param1, int param2, int param3) {
        vg var4;
        int var5;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (vg) ((Object) ag.field_i.c(78));
        L0: while (true) {
          L1: {
            L2: {
              if (var4 == null) {
                break L2;
              } else {
                stackIn_8_0 = param2;

                stackIn_8_1 = var4.field_i;

                if (var5 != 0) {
                  break L1;
                } else {
                  if (stackIn_8_0 == stackIn_8_1) {
                    return var4;
                  } else {
                    var4 = (vg) ((Object) ag.field_i.b(6));
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackIn_8_0 = param0;
            stackIn_8_1 = 97;
            break L1;
          }
          L3: {
            if (stackIn_8_0 > stackIn_8_1) {
              break L3;
            } else {
              field_I = (String) null;
              break L3;
            }
          }
          var4 = new vg();
          var4.field_p = param3;
          var4.field_i = param2;
          ag.field_i.a(var4, false);
          vi.a(param1, var4, (byte) -126);
          return var4;
        }
    }

    final static void a(float param0, int param1, String param2) {
        try {
            lh.field_i = param0;
            if (param1 != 80) {
                qm.a(-1.1143913269042969f, -113, (String) null);
            }
            od.field_Bb = param2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qm.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0) {
        int var2;
        L0: {
          L1: {
            var2 = 12 % ((param0 - 8) / 49);
            if (aa.e(0)) {
              break L1;
            } else {
              if (-1 <= (this.field_H.field_j.length() ^ -1)) {
                break L0;
              } else {
                if (this.field_M.field_j.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          hq.a(this.field_H.field_j, (byte) -125, this.field_M.field_j);
          break L0;
        }
    }

    static {
        field_I = "Create your own free Jagex account";
        field_N = "TRAITS";
    }
}
