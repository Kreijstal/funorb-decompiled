/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends td implements se, m {
    private boolean field_L;
    private rh field_G;
    private rh field_O;
    static q[] field_C;
    private String field_M;
    private lb field_H;
    static kk field_D;
    static int field_N;
    private boolean field_K;
    private lb field_F;
    private boolean field_I;
    private rh field_J;

    final static kd a(int param0, boolean param1, String param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        kd stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_C = (q[]) null;
                break L1;
              }
            }
            L2: {
              var4_long = 0L;
              var6 = null;
              if (0 != (param3.indexOf('@') ^ -1)) {
                var6 = param3;
                break L2;
              } else {
                var7 = (CharSequence) ((Object) param3);
                var4_long = vh.a((byte) -81, var7);
                break L2;
              }
            }
            stackIn_6_0 = ie.a(var4_long, param2, param1, (String) (var6), (byte) -124);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(byte param0, String param1) {
        lb var3 = null;
        String var4 = null;
        try {
            if (param0 < 45) {
                this.field_H = (lb) null;
            }
            var3 = this.field_H;
            var4 = param1;
            var3.a(false, var4, 122);
            this.field_F.l(-68);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "rl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_M) {
            gk.field_c.a(this.field_M, param1 - -this.field_p + 20, this.field_m + param2 + 15, this.field_x + -40, this.field_u, 16777215, -1, 1, 0, gk.field_c.field_G);
        }
        if (!(this.field_O == null)) {
            ll.a(param1 - -10, 134 + param2, this.field_x + -20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(byte param0) {
        if (param0 < 117) {
            return;
        }
        this.field_H.l(-73);
        this.field_F.l(-72);
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
            return;
        }
        field_D = null;
    }

    public final void a(int param0, lb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -12230) {
                break L1;
              } else {
                this.field_I = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rl.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    rl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (t) null);
        sa dupTemp$0 = null;
        sa dupTemp$1 = null;
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
        rh stackIn_18_1 = null;
        rh stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        rh stackIn_19_1 = null;
        rh stackIn_19_2 = null;
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
        dc var6 = null;
        RuntimeException var6_ref = null;
        oh var7 = null;
        String var8 = null;
        bl var9 = null;
        sa var12 = null;
        sa var13 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param2) {
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
              ((rl) (this)).field_L = stackIn_4_1 != 0;
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
              ((rl) (this)).field_I = stackIn_7_1 != 0;
              stackIn_9_0 = this;

              if (!param3) {
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
              ((rl) (this)).field_K = stackIn_10_1 != 0;
              this.field_M = param1;
              if (!this.field_L) {
                break L4;
              } else {
                L5: {
                  if (this.field_K) {
                    break L5;
                  } else {
                    if (!this.field_I) {
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
              this.field_H = (lb) ((Object) new lf(param0, (tg) (this), 100));
              this.field_F = (lb) ((Object) new lf("", (tg) (this), 20));
              if (!this.field_L) {
                L7: {
                  this.field_G = new rh(nd.field_H, (tg) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_I) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = ea.field_p;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = v.field_d;
                    break L7;
                  }
                }
                ((rl) (this)).field_J = new rh(stackIn_19_3, (tg) null);
                if (!this.field_K) {
                  break L6;
                } else {
                  this.field_O = new rh(md.field_f, (tg) (this));
                  break L6;
                }
              } else {
                this.field_G = new rh(ib.field_c, (tg) null);
                this.field_J = new rh(cg.field_b, (tg) null);
                this.field_H.field_B = false;
                break L6;
              }
            }
            L8: {
              this.field_H.field_y = (t) ((Object) new dd(10000536));
              this.field_F.field_y = (t) ((Object) new ql(10000536));
              var6 = new dc();
              this.field_G.field_y = (t) ((Object) var6);
              if (this.field_J == null) {
                break L8;
              } else {
                this.field_J.field_y = (t) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (null == this.field_O) {
                break L9;
              } else {
                this.field_O.field_y = (t) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_H.field_n = ie.field_a;
              if (this.field_O == null) {
                break L10;
              } else {
                this.field_O.field_n = ic.field_g;
                break L10;
              }
            }
            L11: {
              if (!this.field_L) {
                if (!this.field_I) {
                  this.field_J.field_y = (t) ((Object) new ne());
                  break L11;
                } else {
                  this.field_J.field_n = kh.field_b;
                  this.field_J.field_y = (t) ((Object) new ne());
                  break L11;
                }
              } else {
                this.field_J.field_n = lc.field_E;
                break L11;
              }
            }
            L12: {
              this.field_m = 15;
              var7 = gk.field_c;
              if (this.field_M == null) {
                break L12;
              } else {
                this.field_m = this.field_m + (var7.a(this.field_M, -40 + this.field_x, var7.field_G) - -5);
                break L12;
              }
            }
            L13: {
              var8 = ai.field_i;
              var9 = gj.a(100, gd.b((byte) 77));
              if (rd.field_o != var9) {
                if (qi.field_f != var9) {
                  break L13;
                } else {
                  var8 = nb.field_q;
                  break L13;
                }
              } else {
                var8 = re.field_m;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new sa(10, this.field_m, this.field_x + -20, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a(false, dupTemp$0);
              this.field_m = this.field_m + (5 + ((al) ((Object) var12)).field_u);
              dupTemp$1 = new sa(10, this.field_m, this.field_x - 20, 25, this.field_F, false, 80, 3, var7, 16777215, rf.field_d);
              var13 = dupTemp$1;
              this.a(false, dupTemp$1);
              this.field_m = this.field_m + (5 + ((al) ((Object) var13)).field_u);
              this.field_G.field_l = (tg) (this);
              if (null == this.field_O) {
                break L14;
              } else {
                this.field_O.field_l = (tg) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_J == null) {
                break L15;
              } else {
                this.field_J.field_l = (tg) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_O == null) {
                this.field_G.a(30, -3050, this.field_m, -10 + (-6 + this.field_x), 8);
                this.field_m = this.field_m + 35;
                break L16;
              } else {
                this.field_G.a(30, -3050, this.field_m, -95 + this.field_x, 85);
                this.field_m = this.field_m + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_O) {
                break L17;
              } else {
                this.field_O.a(30, -3050, this.field_m, this.field_x + -16, 8);
                this.field_m = this.field_m + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_J == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_L) {
                    break L19;
                  } else {
                    if (!this.field_I) {
                      this.field_J.a(20, -3050, this.field_m, 40, 8);
                      this.field_m = this.field_m + 25;
                      break L18;
                    } else {
                      break L19;
                    }
                  }
                }
                this.field_J.a(30, -3050, this.field_m, -16 + this.field_x, 8);
                this.field_m = this.field_m + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_m + 3, -3050, 0, this.field_x, 0);
              this.a(false, this.field_G);
              if (this.field_O == null) {
                break L20;
              } else {
                this.a(false, this.field_O);
                break L20;
              }
            }
            L21: {
              if (this.field_J == null) {
                break L21;
              } else {
                this.a(false, this.field_J);
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

            stackIn_59_1 = new StringBuilder().append("rl.<init>(");

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
          throw sl.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a((byte) -38, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((param3 ^ -1) != -99) {
                if (param3 == 99) {
                  stackIn_10_0 = this.a(param2, true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5_int = -54 / ((17 - param0) / 51);
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param2, -45);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("rl.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    private final void c(boolean param0) {
        L0: {
          L1: {
            if (kk.b((byte) -128)) {
              break L1;
            } else {
              if (0 >= this.field_H.field_s.length()) {
                break L0;
              } else {
                if (this.field_F.field_s.length() <= 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          vh.a(this.field_H.field_s, 224, this.field_F.field_s);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            this.c(true);
            break L2;
          }
        }
    }

    public final void b(int param0, lb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_H == param1) {
                this.field_F.a((byte) -108, (al) (this));
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 < -23) {
              L2: {
                if (this.field_F != param1) {
                  break L2;
                } else {
                  this.c(false);
                  break L2;
                }
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("rl.L(").append(param0).append(',');

            if (param1 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_G == param0) {
                this.c(false);
                break L1;
              } else {
                if (param0 != this.field_O) {
                  if (param0 != this.field_J) {
                    break L1;
                  } else {
                    if (!this.field_L) {
                      if (!this.field_I) {
                        ie.a((byte) 93);
                        break L1;
                      } else {
                        hl.m(param4 ^ 1217388583);
                        break L1;
                      }
                    } else {
                      ti.a((byte) -58);
                      break L1;
                    }
                  }
                } else {
                  lb.o(-127);
                  break L1;
                }
              }
            }
            L2: {
              if (param4 == -27322) {
                break L2;
              } else {
                this.field_O = (rh) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("rl.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String d(boolean param0) {
        if (!(null != this.field_H.field_s)) {
            return "";
        }
        if (!param0) {
            return (String) null;
        }
        return this.field_H.field_s;
    }

    static {
    }
}
