/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends tj implements fb, he {
    private boolean field_H;
    private fw field_O;
    private fn field_Q;
    static int field_E;
    static int field_T;
    private fw field_N;
    static int field_M;
    private fw field_R;
    private boolean field_P;
    private String field_I;
    private fn field_S;
    private boolean field_F;
    static je field_K;

    final void a(int param0, String param1) {
        fn var3 = null;
        String var4 = null;
        try {
            var3 = this.field_Q;
            var4 = param1;
            var3.a(false, var4, -27934);
            if (param0 != -17376) {
                this.field_O = (fw) null;
            }
            this.field_S.k(110);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "df.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
            if (param1 > -52) {
                df.a(84);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "df.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    df(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (kh) null);
        ta dupTemp$0 = null;
        ta dupTemp$1 = null;
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
        fw stackIn_18_1 = null;
        fw stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        fw stackIn_19_1 = null;
        fw stackIn_19_2 = null;
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
        nu var6 = null;
        RuntimeException var6_ref = null;
        ka var7 = null;
        String var8 = null;
        pf var9 = null;
        ta var12 = null;
        ta var13 = null;
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
              ((df) (this)).field_H = stackIn_4_1 != 0;
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
              ((df) (this)).field_F = stackIn_7_1 != 0;
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
              ((df) (this)).field_P = stackIn_10_1 != 0;
              this.field_I = param1;
              if (!this.field_P) {
                break L4;
              } else {
                L5: {
                  if (this.field_H) {
                    break L5;
                  } else {
                    if (!this.field_F) {
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
              this.field_Q = (fn) ((Object) new ma(param0, (qo) (this), 100));
              this.field_S = (fn) ((Object) new ma("", (qo) (this), 20));
              if (!this.field_P) {
                L7: {
                  this.field_O = new fw(ks.field_v, (qo) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_F) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = fj.field_a;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = pi.field_O;
                    break L7;
                  }
                }
                ((df) (this)).field_N = new fw(stackIn_19_3, (qo) null);
                if (!this.field_H) {
                  break L6;
                } else {
                  this.field_R = new fw(li.field_p, (qo) (this));
                  break L6;
                }
              } else {
                this.field_O = new fw(a.field_k, (qo) null);
                this.field_N = new fw(dt.field_c, (qo) null);
                this.field_Q.field_I = false;
                break L6;
              }
            }
            L8: {
              this.field_Q.field_k = (kh) ((Object) new lu(10000536));
              this.field_S.field_k = (kh) ((Object) new ol(10000536));
              var6 = new nu();
              this.field_O.field_k = (kh) ((Object) var6);
              if (this.field_N == null) {
                break L8;
              } else {
                this.field_N.field_k = (kh) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (this.field_R == null) {
                break L9;
              } else {
                this.field_R.field_k = (kh) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_Q.field_s = de.field_d;
              if (null == this.field_R) {
                break L10;
              } else {
                this.field_R.field_s = hb.field_b;
                break L10;
              }
            }
            L11: {
              if (!this.field_P) {
                if (this.field_F) {
                  this.field_N.field_s = vn.field_e;
                  this.field_N.field_k = (kh) ((Object) new td());
                  break L11;
                } else {
                  this.field_N.field_k = (kh) ((Object) new td());
                  break L11;
                }
              } else {
                this.field_N.field_s = pe.field_v;
                break L11;
              }
            }
            L12: {
              this.field_p = 15;
              var7 = ArmiesOfGielinor.field_J;
              if (null == this.field_I) {
                break L12;
              } else {
                this.field_p = this.field_p + (5 + var7.a(this.field_I, this.field_l + -40, var7.field_H));
                break L12;
              }
            }
            L13: {
              var8 = bh.field_J;
              var9 = ea.a(0, ag.d((byte) 34));
              if (var9 != vn.field_j) {
                if (var9 != ps.field_y) {
                  break L13;
                } else {
                  var8 = ui.field_h;
                  break L13;
                }
              } else {
                var8 = pl.field_t;
                break L13;
              }
            }
            L14: {
              dupTemp$0 = new ta(10, this.field_p, this.field_l - 20, 25, this.field_Q, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.a((byte) 10, (kb) (dupTemp$0));
              this.field_p = this.field_p + (((kb) ((Object) var12)).field_w + 5);
              dupTemp$1 = new ta(10, this.field_p, -20 + this.field_l, 25, this.field_S, false, 80, 3, var7, 16777215, jj.field_h);
              var13 = dupTemp$1;
              this.a((byte) 10, (kb) (dupTemp$1));
              this.field_O.field_x = (qo) (this);
              this.field_p = this.field_p + (5 + ((kb) ((Object) var13)).field_w);
              if (this.field_R == null) {
                break L14;
              } else {
                this.field_R.field_x = (qo) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_N == null) {
                break L15;
              } else {
                this.field_N.field_x = (qo) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_R) {
                this.field_O.a(8, -10 + (this.field_l - 6), this.field_p, 8192, 30);
                this.field_p = this.field_p + 35;
                break L16;
              } else {
                this.field_O.a(85, this.field_l - 95, this.field_p, 8192, 30);
                this.field_p = this.field_p + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_R) {
                break L17;
              } else {
                this.field_R.a(8, -10 + (this.field_l + -6), this.field_p, 8192, 30);
                this.field_p = this.field_p + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_N == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_P) {
                    break L19;
                  } else {
                    if (this.field_F) {
                      break L19;
                    } else {
                      this.field_N.a(8, 40, this.field_p, 8192, 20);
                      this.field_p = this.field_p + 25;
                      break L18;
                    }
                  }
                }
                this.field_N.a(8, -16 + this.field_l, this.field_p, 8192, 30);
                this.field_p = this.field_p + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, this.field_l, 0, 8192, 3 + this.field_p);
              this.a((byte) 10, (kb) (this.field_O));
              if (this.field_R == null) {
                break L20;
              } else {
                this.a((byte) 10, (kb) (this.field_R));
                break L20;
              }
            }
            L21: {
              if (this.field_N == null) {
                break L21;
              } else {
                this.a((byte) 10, (kb) (this.field_N));
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

            stackIn_59_1 = new StringBuilder().append("df.<init>(");

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
          throw ig.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(fn param0, int param1) {
        fn var4 = null;
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
              if (this.field_Q != param0) {
                break L1;
              } else {
                this.field_S.a(11, (kb) (this));
                break L1;
              }
            }
            L2: {
              if (param1 == 80) {
                break L2;
              } else {
                var4 = (fn) null;
                this.a((fn) null, -76);
                break L2;
              }
            }
            L3: {
              if (this.field_S == param0) {
                this.c(false);
                break L3;
              } else {
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

            stackIn_10_1 = new StringBuilder().append("df.EA(");

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
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 > -82) {
            df.a(-77);
        }
        if (!(null == this.field_I)) {
            ArmiesOfGielinor.field_J.a(this.field_I, param0 - (-this.field_B + -20), 15 + param1 + this.field_p, -40 + this.field_l, this.field_w, 16777215, -1, 1, 0, ArmiesOfGielinor.field_J.field_H);
        }
        if (!(this.field_R == null)) {
            qn.e(10 + param0, 134 + param1, -20 + this.field_l, 4210752);
        }
        super.a(param0, param1, (byte) -104, param3);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 11) {
                break L1;
              } else {
                this.m(64);
                break L1;
              }
            }
            L2: {
              if (this.field_O != param4) {
                if (this.field_R != param4) {
                  if (param4 == this.field_N) {
                    if (this.field_P) {
                      ft.e(17);
                      break L2;
                    } else {
                      if (!this.field_F) {
                        me.a(param1 ^ 26573);
                        break L2;
                      } else {
                        ba.g(89);
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  rq.a(false);
                  break L2;
                }
              } else {
                this.c(false);
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

            stackIn_17_1 = new StringBuilder().append("df.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_K = null;
    }

    private final static boolean k(int param0) {
        if (param0 != 30) {
            df.k(105);
        }
        return fh.field_i;
    }

    public final void b(fn param0, int param1) {
        try {
            int var3_int = 14 % ((param1 - -80) / 33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "df.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != -20) {
            String var2 = (String) null;
            df.a((String) null, -20, (kl) null, -114, (String) null);
        }
        kr.field_C = new cv();
        gb.a(30, 21, 220, 420, 440, 470, new int[]{7}, -121);
        gb.a(30, 22, 490, 610, 20, 50, new int[]{47}, param0 + -55);
    }

    final String m(int param0) {
        if (!(this.field_Q.field_v != null)) {
            return "";
        }
        if (param0 != -15056) {
            return (String) null;
        }
        return this.field_Q.field_v;
    }

    private final void c(boolean param0) {
        if (param0) {
          return;
        } else {
          L0: {
            L1: {
              if (df.k(30)) {
                break L1;
              } else {
                if (0 >= this.field_Q.field_v.length()) {
                  break L0;
                } else {
                  if (0 >= this.field_S.field_v.length()) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            cm.a(this.field_S.field_v, 0, this.field_Q.field_v);
            break L0;
          }
          return;
        }
    }

    final static void l(int param0) {
        hf.field_a = param0;
    }

    final static String a(String param0, int param1, kl param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -27638) {
              if (!param2.a((byte) 82)) {
                stackIn_6_0 = (String) (param4);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_8_0 = param0 + " - " + param2.b(param1, (byte) 73) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("df.U(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final void a(byte param0) {
        this.field_Q.k(104);
        if (param0 >= -2) {
            return;
        }
        this.field_S.k(-79);
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (98 == param1) {
                stackIn_6_0 = this.a(false, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_10_0 = this.b((byte) -128, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
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
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("df.F(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    static {
    }
}
