/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends cj implements ih, ij {
    private kp field_O;
    private d field_K;
    private boolean field_S;
    private boolean field_N;
    private kp field_H;
    private String field_P;
    private d field_G;
    private boolean field_R;
    static nj field_Q;
    static String field_I;
    static nj field_M;
    private d field_J;
    static int field_L;
    static double field_F;

    private final void a(int param0) {
        L0: {
          L1: {
            if (hi.c((byte) 6)) {
              break L1;
            } else {
              if (-1 <= (this.field_H.field_w.length() ^ -1)) {
                break L0;
              } else {
                if ((this.field_O.field_w.length() ^ -1) < -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          la.a(this.field_H.field_w, this.field_O.field_w, 26806);
          break L0;
        }
        L2: {
          if (param0 < -86) {
            break L2;
          } else {
            this.field_S = false;
            break L2;
          }
        }
    }

    public final void a(byte param0, kp param1) {
        kp var4 = null;
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
              if (param1 == this.field_H) {
                this.field_O.a((byte) 116, (iq) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 16) {
                break L2;
              } else {
                var4 = (kp) null;
                this.a((byte) -64, (kp) null);
                break L2;
              }
            }
            L3: {
              if (this.field_O == param1) {
                this.a(-123);
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
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ob.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
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
            if (!super.a(param0, param1, param2, param3)) {
              if (-99 == (param2 ^ -1)) {
                stackIn_6_0 = this.a(32345, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (99 != param2) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.b((byte) -70, param3);
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

            stackIn_14_1 = new StringBuilder().append("ob.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    final void a(byte param0, String param1) {
        kp var3 = null;
        String var4 = null;
        try {
            if (param0 != -79) {
                field_Q = (nj) null;
            }
            var3 = this.field_H;
            var4 = param1;
            var3.a(var4, -110, false);
            this.field_O.j(param0 ^ -79);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "ob.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.applet.Applet e(byte param0) {
        int var1 = 8 % ((6 - param0) / 58);
        if (null != va.field_o) {
            return va.field_o;
        }
        return (java.applet.Applet) ((Object) qe.field_T);
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
            iq var6 = (iq) null;
            this.a('g', -59, 99, (iq) null);
        }
        if (!(null == this.field_P)) {
            qc.field_x.a(this.field_P, this.field_o + param2 - -20, 15 + this.field_t + param3, this.field_n + -40, this.field_s, 16777215, -1, 1, 0, qc.field_x.field_z);
        }
        if (!(null == this.field_K)) {
            bi.b(10 + param2, 134 + param3, this.field_n - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public static void a(byte param0) {
        field_M = null;
        if (param0 != -103) {
            ob.e((byte) 61);
        }
        field_Q = null;
        field_I = null;
    }

    public final void a(int param0, kp param1) {
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
              if (param0 < -10) {
                break L1;
              } else {
                this.field_H = (kp) null;
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

            stackIn_5_1 = new StringBuilder().append("ob.I(").append(param0).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    ob(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ur) null);
        mg dupTemp$0 = null;
        mg dupTemp$1 = null;
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
        d stackIn_17_1 = null;
        d stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        d stackIn_18_1 = null;
        d stackIn_18_2 = null;
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
        vo var6 = null;
        RuntimeException var6_ref = null;
        cc var7 = null;
        String var8 = null;
        ej var9 = null;
        mg var12 = null;
        mg var13 = null;
        try {
          L0: {
            L1: {
              this.field_P = param1;
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
              ((ob) (this)).field_N = stackIn_4_1 != 0;
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
              ((ob) (this)).field_R = stackIn_7_1 != 0;
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
              ((ob) (this)).field_S = stackIn_10_1 != 0;
              if (!this.field_N) {
                break L4;
              } else {
                L5: {
                  if (this.field_S) {
                    break L5;
                  } else {
                    if (!this.field_R) {
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
              this.field_H = (kp) ((Object) new br(param0, (uf) (this), 100));
              this.field_O = (kp) ((Object) new br("", (uf) (this), 20));
              if (this.field_N) {
                this.field_J = new d(bk.field_d, (uf) null);
                this.field_G = new d(jd.field_b, (uf) null);
                this.field_H.field_F = false;
                break L6;
              } else {
                L7: {
                  this.field_J = new d(wp.field_d, (uf) null);
                  stackIn_17_0 = this;

                  stackIn_17_1 = null;

                  stackIn_17_2 = null;

                  if (!this.field_R) {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = ap.field_f;
                    break L7;
                  } else {
                    stackIn_18_0 = this;
                    stackIn_18_1 = null;
                    stackIn_18_2 = null;
                    stackIn_18_3 = fd.field_o;
                    break L7;
                  }
                }
                ((ob) (this)).field_G = new d(stackIn_18_3, (uf) null);
                if (!this.field_S) {
                  break L6;
                } else {
                  this.field_K = new d(pk.field_r, (uf) (this));
                  break L6;
                }
              }
            }
            L8: {
              this.field_H.field_B = (ur) ((Object) new ml(10000536));
              this.field_O.field_B = (ur) ((Object) new om(10000536));
              var6 = new vo();
              this.field_J.field_B = (ur) ((Object) var6);
              if (this.field_G == null) {
                break L8;
              } else {
                this.field_G.field_B = (ur) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_H.field_q = wh.field_A;
              if (this.field_K == null) {
                break L9;
              } else {
                this.field_K.field_B = (ur) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (null == this.field_K) {
                break L10;
              } else {
                this.field_K.field_q = ni.field_h;
                break L10;
              }
            }
            L11: {
              if (this.field_N) {
                this.field_G.field_q = fm.field_h;
                break L11;
              } else {
                if (!this.field_R) {
                  this.field_G.field_B = (ur) ((Object) new jc());
                  break L11;
                } else {
                  this.field_G.field_q = he.field_z;
                  this.field_G.field_B = (ur) ((Object) new jc());
                  break L11;
                }
              }
            }
            L12: {
              this.field_t = 15;
              var7 = qc.field_x;
              if (this.field_P == null) {
                break L12;
              } else {
                this.field_t = this.field_t + (5 + var7.a(this.field_P, this.field_n - 40, var7.field_z));
                break L12;
              }
            }
            L13: {
              var8 = ll.field_a;
              var9 = kf.a((byte) -100, ob.e((byte) -52));
              if (li.field_j == var9) {
                var8 = la.field_c;
                break L13;
              } else {
                if (var9 != la.field_i) {
                  break L13;
                } else {
                  var8 = w.field_A;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new mg(10, this.field_t, -20 + this.field_n, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.c((byte) -107, dupTemp$0);
              this.field_t = this.field_t + (5 + ((iq) ((Object) var12)).field_s);
              dupTemp$1 = new mg(10, this.field_t, -20 + this.field_n, 25, this.field_O, false, 80, 3, var7, 16777215, uc.field_c);
              var13 = dupTemp$1;
              this.c((byte) 83, dupTemp$1);
              this.field_J.field_v = (uf) (this);
              this.field_t = this.field_t + (((iq) ((Object) var13)).field_s + 5);
              if (null == this.field_K) {
                break L14;
              } else {
                this.field_K.field_v = (uf) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_G == null) {
                break L15;
              } else {
                this.field_G.field_v = (uf) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_K != null) {
                this.field_J.a(false, 85, this.field_t, 30, -95 + this.field_n);
                this.field_t = this.field_t + 60;
                break L16;
              } else {
                this.field_J.a(false, 8, this.field_t, 30, -10 + (-6 + this.field_n));
                this.field_t = this.field_t + 35;
                break L16;
              }
            }
            L17: {
              if (null == this.field_K) {
                break L17;
              } else {
                this.field_K.a(false, 8, this.field_t, 30, this.field_n - 6 + -10);
                this.field_t = this.field_t + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_G == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_N) {
                    break L19;
                  } else {
                    if (this.field_R) {
                      break L19;
                    } else {
                      this.field_G.a(false, 8, this.field_t, 20, 40);
                      this.field_t = this.field_t + 25;
                      break L18;
                    }
                  }
                }
                this.field_G.a(false, 8, this.field_t, 30, -6 + this.field_n + -10);
                this.field_t = this.field_t + 35;
                break L18;
              }
            }
            L20: {
              this.a(false, 0, 0, this.field_t - -3, this.field_n);
              this.c((byte) 85, this.field_J);
              if (null == this.field_K) {
                break L20;
              } else {
                this.c((byte) -43, this.field_K);
                break L20;
              }
            }
            L21: {
              if (null == this.field_G) {
                break L21;
              } else {
                this.c((byte) 99, this.field_G);
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

            stackIn_59_1 = new StringBuilder().append("ob.<init>(");

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
          throw wn.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String j(int param0) {
        if (null == this.field_H.field_w) {
          return "";
        } else {
          L0: {
            if (param0 == 5607) {
              break L0;
            } else {
              this.a(true, 116, -61, 8);
              break L0;
            }
          }
          return this.field_H.field_w;
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = -35 / ((param2 - -63) / 51);
              if (param1 == this.field_J) {
                this.a(-113);
                break L1;
              } else {
                if (param1 != this.field_K) {
                  if (this.field_G == param1) {
                    if (this.field_N) {
                      rk.h(-128);
                      break L1;
                    } else {
                      if (this.field_R) {
                        sg.b((byte) 81);
                        break L1;
                      } else {
                        oq.a(true);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  ff.b((byte) -104);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("ob.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void i(int param0) {
        this.field_H.j(param0 ^ param0);
        this.field_O.j(0);
    }

    static {
        field_Q = new nj();
        field_I = "Please log in as a subscribing member to access this feature.";
        field_F = -1.0;
        field_M = new nj();
    }
}
