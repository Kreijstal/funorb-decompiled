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
        RuntimeException var2_ref = null;
        int var3 = 0;
        rd var4 = null;
        RuntimeException decompiledCaughtException = null;
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
        bg dupTemp$2 = null;
        bg dupTemp$3 = null;
        RuntimeException var6 = null;
        cl var6_ref = null;
        eg var7 = null;
        String var8 = null;
        hb var9 = null;
        bg var12 = null;
        bg var13 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        ng stackIn_17_1 = null;
        ng stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        ng stackIn_18_1 = null;
        ng stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ng stackIn_19_1 = null;
        ng stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_16_0 = null;
        ng stackOut_16_1 = null;
        ng stackOut_16_2 = null;
        Object stackOut_18_0 = null;
        ng stackOut_18_1 = null;
        ng stackOut_18_2 = null;
        String stackOut_18_3 = null;
        Object stackOut_17_0 = null;
        ng stackOut_17_1 = null;
        ng stackOut_17_2 = null;
        String stackOut_17_3 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        try {
          L0: {
            L1: {
              this.field_U = param1;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((fg) (this)).field_L = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((fg) (this)).field_P = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param4) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
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
                  stackOut_16_0 = this;
                  stackOut_16_1 = null;
                  stackOut_16_2 = null;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if (this.field_K) {
                    stackOut_18_0 = this;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = cj.field_k;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L7;
                  } else {
                    stackOut_17_0 = this;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = b.field_R;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
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
              var6_ref = new cl();
              this.field_J.field_q = (j) ((Object) var6_ref);
              if (null == this.field_R) {
                break L8;
              } else {
                this.field_R.field_q = (j) ((Object) var6_ref);
                break L8;
              }
            }
            L9: {
              if (this.field_O == null) {
                break L9;
              } else {
                this.field_O.field_q = (j) ((Object) var6_ref);
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
              dupTemp$2 = new bg(10, this.field_i, this.field_p - 20, 25, this.field_T, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$2;
              this.a(0, dupTemp$2);
              this.field_i = this.field_i + (5 + ((ee) ((Object) var12)).field_l);
              dupTemp$3 = new bg(10, this.field_i, this.field_p + -20, 25, this.field_Q, false, 80, 3, var7, 16777215, bd.field_n);
              var13 = dupTemp$3;
              this.a(0, dupTemp$3);
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
            var6 = decompiledCaughtException;
            stackOut_57_0 = (RuntimeException) (var6);
            stackOut_57_1 = new StringBuilder().append("fg.<init>(");
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param0 == null) {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L22;
            } else {
              stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackOut_58_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L22;
            }
          }
          L23: {
            stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param1 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L23;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L23;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0) {
        int var2 = 0;
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
        int discarded$0 = 0;
        if (null != this.field_U) {
            discarded$0 = oe.field_g.a(this.field_U, 20 + (param1 - -this.field_m), 15 + this.field_i + param0, -40 + this.field_p, this.field_l, 16777215, -1, 1, 0, oe.field_g.field_x);
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                this.field_U = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("fg.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void a(dj param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == this.field_T) {
                discarded$2 = this.field_Q.a((ee) (this), 0);
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
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("fg.O(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_8_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, (byte) 116, param3)) {
              if (param2 >= 9) {
                if (param0 == 98) {
                  stackOut_8_0 = this.a(param3, (byte) -16);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if ((param0 ^ -1) == -100) {
                    stackOut_12_0 = this.b(72, param3);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return false;
                  }
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("fg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
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
        RuntimeException var6 = null;
        int var7 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L2;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
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
            stackOut_17_0 = (RuntimeException) (var6);
            stackOut_17_1 = new StringBuilder().append("fg.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
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
