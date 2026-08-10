/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends kj implements cc, sg {
    private boolean field_P;
    private ng field_R;
    private boolean field_K;
    private String field_U;
    private dj field_T;
    private dj field_Q;
    private ng field_O;
    static boolean field_S;
    static int[] field_M;
    private boolean field_L;
    static int field_N;
    private ng field_J;

    final static void i(int param0) {
        eb.field_m = false;
        hl.field_e = false;
        fk.a(true, -1);
        eh.field_p = mg.field_c;
        gj.field_a = mg.field_c;
        int var1 = -11 / ((83 - param0) / 37);
    }

    final void h(int param0) {
        if (param0 != 0) {
            dj var3 = (dj) null;
            this.a((dj) null, 64);
        }
        this.field_T.i(param0 + -22617);
        this.field_Q.i(param0 ^ -22617);
    }

    final static void a(int param0, boolean param1) {
        da var2 = null;
        int var3 = 0;
        rd var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_M = (int[]) null;
                break L1;
              }
            }
            var4 = (rd) ((Object) bb.field_d.c((byte) 118));
            L2: while (true) {
              if (var4 == null) {
                var2 = ji.field_q.c((byte) -49);
                L3: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    af.b(9245, param0);
                    var2 = ji.field_q.c(-270);
                    continue L3;
                  }
                }
              } else {
                mg.a(-127, var4, param0);
                var4 = (rd) ((Object) bb.field_d.c(-270));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "fg.J(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        field_M = null;
        if (param0 >= -7) {
            field_M = (int[]) null;
        }
    }

    final void a(String param0, int param1) {
        dj var3 = this.field_T;
        String var4 = param0;
        if (param1 != 10) {
            return;
        }
        try {
            var3.a(var4, false, (byte) -21);
            this.field_Q.i(-22617);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fg.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fg(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (j) null);
        bg dupTemp$0 = null;
        bg dupTemp$1 = null;
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
        ng stackIn_18_1 = null;
        ng stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ng stackIn_19_1 = null;
        ng stackIn_19_2 = null;
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
        cl var6 = null;
        RuntimeException var6_ref = null;
        eg var7 = null;
        String var8 = null;
        hb var9 = null;
        bg var12 = null;
        bg var13 = null;
        try {
          L0: {
            L1: {
              this.field_U = param1;
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
              ((fg) (this)).field_L = stackIn_4_1 != 0;
              stackIn_6_0 = this;

              if (!param2) {
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
              ((fg) (this)).field_P = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param4) {
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
              ((fg) (this)).field_K = stackIn_10_1 != 0;
              if (!this.field_P) {
                break L4;
              } else {
                L5: {
                  if (this.field_L) {
                    break L5;
                  } else {
                    if (!this.field_K) {
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
              this.field_T = (dj) ((Object) new rf(param0, (gg) (this), 100));
              this.field_Q = (dj) ((Object) new rf("", (gg) (this), 20));
              if (!this.field_P) {
                L7: {
                  this.field_J = new ng(s.field_p, (gg) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (this.field_K) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = cj.field_k;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = b.field_R;
                    break L7;
                  }
                }
                ((fg) (this)).field_R = new ng(stackIn_19_3, (gg) null);
                if (!this.field_L) {
                  break L6;
                } else {
                  this.field_O = new ng(nd.field_a, (gg) (this));
                  break L6;
                }
              } else {
                this.field_J = new ng(qb.field_e, (gg) null);
                this.field_R = new ng(ph.field_f, (gg) null);
                this.field_T.field_F = false;
                break L6;
              }
            }
            L8: {
              this.field_T.field_q = (j) ((Object) new fk(10000536));
              this.field_Q.field_q = (j) ((Object) new ij(10000536));
              var6 = new cl();
              this.field_J.field_q = (j) ((Object) var6);
              if (null == this.field_R) {
                break L8;
              } else {
                this.field_R.field_q = (j) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (this.field_O == null) {
                break L9;
              } else {
                this.field_O.field_q = (j) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_T.field_r = qf.field_d;
              if (this.field_O == null) {
                break L10;
              } else {
                this.field_O.field_r = am.field_c;
                break L10;
              }
            }
            L11: {
              if (!this.field_P) {
                if (!this.field_K) {
                  this.field_R.field_q = (j) ((Object) new me());
                  break L11;
                } else {
                  this.field_R.field_r = vk.field_c;
                  this.field_R.field_q = (j) ((Object) new me());
                  break L11;
                }
              } else {
                this.field_R.field_r = ng.field_J;
                break L11;
              }
            }
            L12: {
              this.field_i = 15;
              var7 = oe.field_g;
              if (this.field_U == null) {
                break L12;
              } else {
                this.field_i = this.field_i + (5 + var7.b(this.field_U, -40 + this.field_p, var7.field_x));
                break L12;
              }
            }
            L13: {
              var8 = ea.field_b;
              var9 = lg.a(gi.b(12476), 126);
              if (sd.field_e == var9) {
                var8 = wl.field_d;
                break L13;
              } else {
                if (var9 != ee.field_x) {
                  break L13;
                } else {
                  var8 = ib.field_N;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new bg(10, this.field_i, this.field_p - 20, 25, this.field_T, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a(0, dupTemp$0);
              this.field_i = this.field_i + (5 + ((ee) ((Object) var12)).field_l);
              dupTemp$1 = new bg(10, this.field_i, this.field_p + -20, 25, this.field_Q, false, 80, 3, var7, 16777215, bd.field_n);
              var13 = dupTemp$1;
              this.a(0, dupTemp$1);
              this.field_i = this.field_i + (5 + ((ee) ((Object) var13)).field_l);
              this.field_J.field_k = (gg) (this);
              if (null == this.field_O) {
                break L14;
              } else {
                this.field_O.field_k = (gg) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_R == null) {
                break L15;
              } else {
                this.field_R.field_k = (gg) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_O == null) {
                this.field_J.a((byte) 126, 8, 30, -6 + this.field_p - 10, this.field_i);
                this.field_i = this.field_i + 35;
                break L16;
              } else {
                this.field_J.a((byte) 109, 85, 30, -95 + this.field_p, this.field_i);
                this.field_i = this.field_i + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_O) {
                break L17;
              } else {
                this.field_O.a((byte) 106, 8, 30, -16 + this.field_p, this.field_i);
                this.field_i = this.field_i + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_R == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_P) {
                    break L19;
                  } else {
                    if (this.field_K) {
                      break L19;
                    } else {
                      this.field_R.a((byte) 103, 8, 20, 40, this.field_i);
                      this.field_i = this.field_i + 25;
                      break L18;
                    }
                  }
                }
                this.field_R.a((byte) 116, 8, 30, -6 + this.field_p + -10, this.field_i);
                this.field_i = this.field_i + 35;
                break L18;
              }
            }
            L20: {
              this.a((byte) 125, 0, 3 + this.field_i, this.field_p, 0);
              this.a(0, this.field_J);
              if (null == this.field_O) {
                break L20;
              } else {
                this.a(0, this.field_O);
                break L20;
              }
            }
            L21: {
              if (null == this.field_R) {
                break L21;
              } else {
                this.a(0, this.field_R);
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

            stackIn_59_1 = new StringBuilder().append("fg.<init>(");

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
          throw oj.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0) {
        int var2;
        L0: {
          L1: {
            if (TorChallenge.r(-1592)) {
              break L1;
            } else {
              if (0 >= this.field_T.field_v.length()) {
                break L0;
              } else {
                if ((this.field_Q.field_v.length() ^ -1) < -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          kb.a(this.field_T.field_v, this.field_Q.field_v, (byte) 44);
          break L0;
        }
        var2 = 83 % ((46 - param0) / 56);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (null != this.field_U) {
            oe.field_g.a(this.field_U, 20 + (param1 - -this.field_m), 15 + this.field_i + param0, -40 + this.field_p, this.field_l, 16777215, -1, 1, 0, oe.field_g.field_x);
        }
        if (this.field_O != null) {
            qg.b(10 + param1, 134 + param0, this.field_p + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
        if (param2) {
            this.field_J = (ng) null;
        }
    }

    public final void b(dj param0, int param1) {
        try {
            if (param1 != 3) {
                this.field_U = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "fg.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(dj param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == this.field_T) {
                this.field_Q.a((ee) (this), 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_Q) {
                this.a(126);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 5) {
                break L3;
              } else {
                this.a(13);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("fg.O(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final String g(byte param0) {
        if (!(null != this.field_T.field_v)) {
            return "";
        }
        if (param0 != -39) {
            return (String) null;
        }
        return this.field_T.field_v;
    }

    final boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 116, param3)) {
              if (param2 >= 9) {
                if (param0 == 98) {
                  stackIn_9_0 = this.a(param3, (byte) -16);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param0 ^ -1) == -100) {
                    stackIn_13_0 = this.b(72, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
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
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("fg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 != this.field_J) {
                if (this.field_O == param0) {
                  k.a(-14956);
                  break L1;
                } else {
                  if (this.field_R != param0) {
                    break L1;
                  } else {
                    if (this.field_P) {
                      L2: {
                        if (param4) {
                          stackIn_12_0 = 0;
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          break L2;
                        }
                      }
                      bj.a(stackIn_12_0 != 0);
                      break L1;
                    } else {
                      if (this.field_K) {
                        fd.a(-2068);
                        break L1;
                      } else {
                        ek.h(1);
                        break L1;
                      }
                    }
                  }
                }
              } else {
                this.a(110);
                break L1;
              }
            }
            L3: {
              if (!param4) {
                break L3;
              } else {
                this.field_O = (ng) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("fg.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_M = new int[]{41, 10, 22, 2, 2};
    }
}
