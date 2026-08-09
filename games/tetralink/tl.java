/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends gn implements ih, dm {
    private ae field_cb;
    static String field_Y;
    private nn field_S;
    private boolean field_L;
    static int field_Q;
    static hl field_P;
    private boolean field_V;
    static int field_X;
    static String field_N;
    static String field_bb;
    private nn field_ab;
    private String field_K;
    private ae field_U;
    static String field_O;
    static volatile boolean field_M;
    static String field_Z;
    static String field_T;
    private boolean field_R;
    private ae field_W;

    public static void i(int param0) {
        field_bb = null;
        field_Z = null;
        field_P = null;
        field_N = null;
        field_T = null;
        field_Y = null;
        field_O = null;
        if (param0 != 20) {
            field_P = (hl) null;
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
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
              if ((param0 ^ -1) != -99) {
                if (-100 == (param0 ^ -1)) {
                  stackIn_10_0 = this.b(param3, param2 ^ 117);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.d(param3, param2 + 109);
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

            stackIn_13_1 = new StringBuilder().append("tl.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    final void a(int param0, int param1, int param2, int param3) {
        if (this.field_K != null) {
            od.field_S.a(this.field_K, 20 + param1 + this.field_t, this.field_w + param2 + 15, this.field_F + -40, this.field_u, 16777215, -1, 1, 0, od.field_S.field_N);
        }
        if (!(null == this.field_W)) {
            ra.g(param1 - -10, 134 + param2, -20 + this.field_F, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public final void a(byte param0, nn param1) {
        try {
            int var3_int = -45 / ((-18 - param0) / 63);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "tl.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String h(int param0) {
        if (param0 != 8) {
            return (String) null;
        }
        if (fl.field_s) {
            return null;
        }
        if (ec.field_i < gd.field_Mb) {
            return null;
        }
        if (!(ec.field_i >= ej.field_z + gd.field_Mb)) {
            return sc.field_c;
        }
        return null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            if (param0 <= 0) {
              L1: {
                if (this.field_U == param1) {
                  this.a(false);
                  break L1;
                } else {
                  if (this.field_W == param1) {
                    wk.b(-100);
                    break L1;
                  } else {
                    if (param1 == this.field_cb) {
                      if (!this.field_V) {
                        if (this.field_R) {
                          gj.a((byte) -122);
                          break L1;
                        } else {
                          in.a(31212);
                          break L1;
                        }
                      } else {
                        bb.a((byte) -63);
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
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
          L2: {
            var6 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var6);

            stackIn_17_1 = new StringBuilder().append("tl.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(nn param0, byte param1) {
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
              if (param0 == this.field_ab) {
                this.field_S.a((na) (this), -384169950);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_S) {
                this.a(false);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 101) {
                break L3;
              } else {
                this.field_W = (ae) null;
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

            stackIn_11_1 = new StringBuilder().append("tl.P(");

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
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, String param1) {
        nn var3 = null;
        String var4 = null;
        try {
            var3 = this.field_ab;
            if (!param0) {
                this.a(33, 126, 119, -2);
            }
            var4 = param1;
            var3.a(false, 74, var4);
            this.field_S.k(0);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "tl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.field_ab.k(0);
        if (param0 != 1379) {
            this.e(true);
        }
        this.field_S.k(0);
    }

    private final void a(boolean param0) {
        ae var3;
        L0: {
          L1: {
            if (wd.b((byte) -101)) {
              break L1;
            } else {
              if (0 >= this.field_ab.field_A.length()) {
                break L0;
              } else {
                if (-1 <= (this.field_S.field_A.length() ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          nl.a(this.field_S.field_A, 39, this.field_ab.field_A);
          break L0;
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            var3 = (ae) null;
            this.a((byte) 76, (ae) null, 98, -102, 110);
            break L2;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 35) {
                break L1;
              } else {
                field_Q = -123;
                break L1;
              }
            }
            stackIn_3_0 = nn.a(param1, false, 82);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("tl.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final String e(boolean param0) {
        if (this.field_ab.field_A == null) {
            return "";
        }
        if (param0) {
            this.field_cb = (ae) null;
        }
        return this.field_ab.field_A;
    }

    tl(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (kg) null);
        rc dupTemp$0 = null;
        rc dupTemp$1 = null;
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
        ae stackIn_18_1 = null;
        ae stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        ae stackIn_19_1 = null;
        ae stackIn_19_2 = null;
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
        uj var6 = null;
        RuntimeException var6_ref = null;
        jb var7 = null;
        String var8 = null;
        dk var9 = null;
        rc var12 = null;
        rc var13 = null;
        try {
          L0: {
            L1: {
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
              ((tl) (this)).field_R = stackIn_4_1 != 0;
              this.field_K = param1;
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
              ((tl) (this)).field_L = stackIn_7_1 != 0;
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
              ((tl) (this)).field_V = stackIn_10_1 != 0;
              if (!this.field_V) {
                break L4;
              } else {
                L5: {
                  if (this.field_L) {
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
              this.field_ab = (nn) ((Object) new fo(param0, (dn) (this), 100));
              this.field_S = (nn) ((Object) new fo("", (dn) (this), 20));
              if (!this.field_V) {
                L7: {
                  this.field_U = new ae(wl.field_a, (dn) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (this.field_R) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = pi.field_d;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = nb.field_T;
                    break L7;
                  }
                }
                ((tl) (this)).field_cb = new ae(stackIn_19_3, (dn) null);
                if (!this.field_L) {
                  break L6;
                } else {
                  this.field_W = new ae(jm.field_f, (dn) (this));
                  break L6;
                }
              } else {
                this.field_U = new ae(mb.field_v, (dn) null);
                this.field_cb = new ae(uh.field_a, (dn) null);
                this.field_ab.field_K = false;
                break L6;
              }
            }
            L8: {
              this.field_ab.field_H = (kg) ((Object) new mf(10000536));
              this.field_S.field_H = (kg) ((Object) new ci(10000536));
              var6 = new uj();
              this.field_U.field_H = (kg) ((Object) var6);
              if (null == this.field_cb) {
                break L8;
              } else {
                this.field_cb.field_H = (kg) ((Object) var6);
                break L8;
              }
            }
            L9: {
              this.field_ab.field_C = re.field_T;
              if (this.field_W == null) {
                break L9;
              } else {
                this.field_W.field_H = (kg) ((Object) var6);
                break L9;
              }
            }
            L10: {
              if (this.field_W == null) {
                break L10;
              } else {
                this.field_W.field_C = vc.field_e;
                break L10;
              }
            }
            L11: {
              if (!this.field_V) {
                if (!this.field_R) {
                  this.field_cb.field_H = (kg) ((Object) new q());
                  break L11;
                } else {
                  this.field_cb.field_C = rk.field_a;
                  this.field_cb.field_H = (kg) ((Object) new q());
                  break L11;
                }
              } else {
                this.field_cb.field_C = fk.field_Y;
                break L11;
              }
            }
            L12: {
              this.field_w = 15;
              var7 = od.field_S;
              if (null == this.field_K) {
                break L12;
              } else {
                this.field_w = this.field_w + (5 + var7.b(this.field_K, this.field_F + -40, var7.field_N));
                break L12;
              }
            }
            L13: {
              var8 = oa.field_n;
              var9 = gb.a((byte) 91, lk.q(13));
              if (var9 == lh.field_s) {
                var8 = co.field_t;
                break L13;
              } else {
                if (lc.field_j != var9) {
                  break L13;
                } else {
                  var8 = me.field_i;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new rc(10, this.field_w, -20 + this.field_F, 25, this.field_ab, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.c(dupTemp$0, 10);
              this.field_w = this.field_w + (((na) ((Object) var12)).field_u + 5);
              dupTemp$1 = new rc(10, this.field_w, -20 + this.field_F, 25, this.field_S, false, 80, 3, var7, 16777215, gj.field_a);
              var13 = dupTemp$1;
              this.c(dupTemp$1, 10);
              this.field_w = this.field_w + (((na) ((Object) var13)).field_u - -5);
              this.field_U.field_s = (dn) (this);
              if (null == this.field_W) {
                break L14;
              } else {
                this.field_W.field_s = (dn) (this);
                break L14;
              }
            }
            L15: {
              if (this.field_cb == null) {
                break L15;
              } else {
                this.field_cb.field_s = (dn) (this);
                break L15;
              }
            }
            L16: {
              if (this.field_W == null) {
                this.field_U.a(30, this.field_w, -116, 8, -6 + this.field_F + -10);
                this.field_w = this.field_w + 35;
                break L16;
              } else {
                this.field_U.a(30, this.field_w, -123, 85, this.field_F + -95);
                this.field_w = this.field_w + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_W) {
                break L17;
              } else {
                this.field_W.a(30, this.field_w, 3, 8, -10 + (-6 + this.field_F));
                this.field_w = this.field_w + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_cb == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_V) {
                    break L19;
                  } else {
                    if (this.field_R) {
                      break L19;
                    } else {
                      this.field_cb.a(20, this.field_w, 101, 8, 40);
                      this.field_w = this.field_w + 25;
                      break L18;
                    }
                  }
                }
                this.field_cb.a(30, this.field_w, -128, 8, -10 + (-6 + this.field_F));
                this.field_w = this.field_w + 35;
                break L18;
              }
            }
            L20: {
              this.a(this.field_w + 3, 0, 64, 0, this.field_F);
              this.c(this.field_U, 10);
              if (this.field_W == null) {
                break L20;
              } else {
                this.c(this.field_W, 10);
                break L20;
              }
            }
            L21: {
              if (this.field_cb == null) {
                break L21;
              } else {
                this.c(this.field_cb, 10);
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

            stackIn_59_1 = new StringBuilder().append("tl.<init>(");

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
          throw oi.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_N = "This entry doesn't match";
        field_Z = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_O = "Try changing the '<%0>' setting.";
        field_T = "New Game";
        field_M = false;
        field_bb = "Auto-respond to <%0>";
        field_Y = "<%0> would need a rating of <%1> to play with the current options.";
    }
}
