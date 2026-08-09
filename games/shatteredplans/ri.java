/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends f implements od, bp {
    private boolean field_L;
    private kg field_K;
    private String field_J;
    static String field_G;
    static int field_F;
    static String field_N;
    private kg field_P;
    static gr field_I;
    private go field_H;
    private kg field_Q;
    private go field_R;
    private boolean field_D;
    private boolean field_E;
    static String field_M;
    static int field_O;

    final void a(int param0, String param1) {
        go var3 = null;
        String var4 = null;
        if (param0 != 16311) {
            return;
        }
        try {
            var3 = this.field_H;
            var4 = param1;
            var3.a(108, var4, false);
            this.field_R.e(true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ri.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void k(int param0) {
        int var2;
        L0: {
          var2 = ShatteredPlansClient.field_F ? 1 : 0;
          if ((ce.field_x.field_P.field_y & 1 << ce.field_x.field_h) != 0) {
            oq.field_i[11] = te.field_a;
            break L0;
          } else {
            if (-1 == (ce.field_x.field_P.field_y ^ -1)) {
              oq.field_i[11] = kd.field_c;
              break L0;
            } else {
              oq.field_i[11] = bb.field_a;
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 8) {
            break L1;
          } else {
            field_N = (String) null;
            break L1;
          }
        }
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
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
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param0 ^ -1)) {
                if (param0 != 99) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param3, 102);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param3, true);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ri.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
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

    final static th a(String param0, String param1, bc param2, bc param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        th stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2.a(126, param1);
            var6 = param2.a(var5_int, (byte) 106, param0);
            var7 = 72 % ((38 - param4) / 49);
            stackIn_1_0 = mf.a(var6, var5_int, param2, param3, -121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("ri.I(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_14_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(go param0, int param1) {
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
              if (param1 == 95) {
                break L1;
              } else {
                this.field_K = (kg) null;
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

            stackIn_5_1 = new StringBuilder().append("ri.L(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0) {
        L0: {
          L1: {
            if (i.a(1)) {
              break L1;
            } else {
              if (-1 <= (this.field_H.field_s.length() ^ -1)) {
                break L0;
              } else {
                if (0 < this.field_R.field_s.length()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          bh.a((byte) 81, this.field_R.field_s, this.field_H.field_s);
          break L0;
        }
        L2: {
          if (param0 <= -126) {
            break L2;
          } else {
            this.a(-6);
            break L2;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(this.field_J == null)) {
            gn.field_u.a(this.field_J, 20 + (param3 - -this.field_m), 15 + this.field_q + param2, -40 + this.field_x, this.field_n, 16777215, -1, 1, 0, gn.field_u.field_J);
        }
        if (!(this.field_Q == null)) {
            gf.f(param3 - -10, 134 + param2, this.field_x - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    public final void a(int param0, go param1) {
        bc var4 = null;
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
              if (param1 == this.field_H) {
                this.field_R.a((byte) -21, (vg) (this));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_R != param1) {
                break L2;
              } else {
                this.a(param0 + -4468);
                break L2;
              }
            }
            L3: {
              if (param0 == 4340) {
                break L3;
              } else {
                var4 = (bc) null;
                ri.a((String) null, (String) null, (bc) null, (bc) null, (byte) -106);
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

            stackIn_10_1 = new StringBuilder().append("ri.K(").append(param0).append(',');

            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    ri(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (iq) null);
        pg dupTemp$0 = null;
        pg dupTemp$1 = null;
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
        kg stackIn_18_1 = null;
        kg stackIn_18_2 = null;
        Object stackIn_19_0 = null;
        kg stackIn_19_1 = null;
        kg stackIn_19_2 = null;
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
        qp var6 = null;
        RuntimeException var6_ref = null;
        nq var7 = null;
        String var8 = null;
        bg var9 = null;
        pg var12 = null;
        pg var13 = null;
        try {
          L0: {
            L1: {
              this.field_J = param1;
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
              ((ri) (this)).field_E = stackIn_4_1 != 0;
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
              ((ri) (this)).field_D = stackIn_7_1 != 0;
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
              ((ri) (this)).field_L = stackIn_10_1 != 0;
              if (!this.field_L) {
                break L4;
              } else {
                L5: {
                  if (this.field_E) {
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
              this.field_H = (go) ((Object) new fa(param0, (ko) (this), 100));
              this.field_R = (go) ((Object) new fa("", (ko) (this), 20));
              if (!this.field_L) {
                L7: {
                  this.field_K = new kg(wl.field_e, (ko) null);
                  stackIn_18_0 = this;

                  stackIn_18_1 = null;

                  stackIn_18_2 = null;

                  if (!this.field_D) {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = ss.field_e;
                    break L7;
                  } else {
                    stackIn_19_0 = this;
                    stackIn_19_1 = null;
                    stackIn_19_2 = null;
                    stackIn_19_3 = tr.field_Pb;
                    break L7;
                  }
                }
                ((ri) (this)).field_P = new kg(stackIn_19_3, (ko) null);
                if (!this.field_E) {
                  break L6;
                } else {
                  this.field_Q = new kg(oj.field_Ab, (ko) (this));
                  break L6;
                }
              } else {
                this.field_K = new kg(ts.field_E, (ko) null);
                this.field_P = new kg(em.field_g, (ko) null);
                this.field_H.field_y = false;
                break L6;
              }
            }
            L8: {
              this.field_H.field_p = (iq) ((Object) new rr(10000536));
              this.field_R.field_p = (iq) ((Object) new ce(10000536));
              var6 = new qp();
              this.field_K.field_p = (iq) ((Object) var6);
              if (this.field_P == null) {
                break L8;
              } else {
                this.field_P.field_p = (iq) ((Object) var6);
                break L8;
              }
            }
            L9: {
              if (this.field_Q == null) {
                break L9;
              } else {
                this.field_Q.field_p = (iq) ((Object) var6);
                break L9;
              }
            }
            L10: {
              this.field_H.field_v = sf.field_a;
              if (null == this.field_Q) {
                break L10;
              } else {
                this.field_Q.field_v = nc.field_m;
                break L10;
              }
            }
            L11: {
              if (this.field_L) {
                this.field_P.field_v = ed.field_a;
                break L11;
              } else {
                if (this.field_D) {
                  this.field_P.field_v = bs.field_c;
                  this.field_P.field_p = (iq) ((Object) new rq());
                  break L11;
                } else {
                  this.field_P.field_p = (iq) ((Object) new rq());
                  break L11;
                }
              }
            }
            L12: {
              this.field_q = 15;
              var7 = gn.field_u;
              if (null == this.field_J) {
                break L12;
              } else {
                this.field_q = this.field_q + (var7.c(this.field_J, this.field_x + -40, var7.field_J) - -5);
                break L12;
              }
            }
            L13: {
              var8 = ph.field_e;
              var9 = jc.a(kq.f((byte) 124), true);
              if (var9 == og.field_b) {
                var8 = cn.field_v;
                break L13;
              } else {
                if (dm.field_f != var9) {
                  break L13;
                } else {
                  var8 = ba.field_b;
                  break L13;
                }
              }
            }
            L14: {
              dupTemp$0 = new pg(10, this.field_q, -20 + this.field_x, 25, this.field_H, false, 80, 3, var7, 16777215, var8);
              var12 = dupTemp$0;
              this.b((byte) -65, dupTemp$0);
              this.field_q = this.field_q + (((vg) ((Object) var12)).field_n + 5);
              dupTemp$1 = new pg(10, this.field_q, this.field_x + -20, 25, this.field_R, false, 80, 3, var7, 16777215, co.field_t);
              var13 = dupTemp$1;
              this.b((byte) -66, dupTemp$1);
              this.field_q = this.field_q + (((vg) ((Object) var13)).field_n + 5);
              this.field_K.field_u = (ko) (this);
              if (null == this.field_Q) {
                break L14;
              } else {
                this.field_Q.field_u = (ko) (this);
                break L14;
              }
            }
            L15: {
              if (null == this.field_P) {
                break L15;
              } else {
                this.field_P.field_u = (ko) (this);
                break L15;
              }
            }
            L16: {
              if (null == this.field_Q) {
                this.field_K.a(this.field_q, 30, (byte) 106, 8, -6 + (this.field_x - 10));
                this.field_q = this.field_q + 35;
                break L16;
              } else {
                this.field_K.a(this.field_q, 30, (byte) 110, 85, this.field_x - 95);
                this.field_q = this.field_q + 60;
                break L16;
              }
            }
            L17: {
              if (null == this.field_Q) {
                break L17;
              } else {
                this.field_Q.a(this.field_q, 30, (byte) 115, 8, this.field_x + -16);
                this.field_q = this.field_q + 35;
                break L17;
              }
            }
            L18: {
              if (this.field_P == null) {
                break L18;
              } else {
                L19: {
                  if (this.field_L) {
                    break L19;
                  } else {
                    if (this.field_D) {
                      break L19;
                    } else {
                      this.field_P.a(this.field_q, 20, (byte) 108, 8, 40);
                      this.field_q = this.field_q + 25;
                      break L18;
                    }
                  }
                }
                this.field_P.a(this.field_q, 30, (byte) 124, 8, -10 + this.field_x + -6);
                this.field_q = this.field_q + 35;
                break L18;
              }
            }
            L20: {
              this.a(0, this.field_q - -3, (byte) 100, 0, this.field_x);
              this.b((byte) -98, this.field_K);
              if (null == this.field_Q) {
                break L20;
              } else {
                this.b((byte) -44, this.field_Q);
                break L20;
              }
            }
            L21: {
              if (this.field_P == null) {
                break L21;
              } else {
                this.b((byte) -87, this.field_P);
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

            stackIn_59_1 = new StringBuilder().append("ri.<init>(");

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
          throw r.a((Throwable) ((Object) stackIn_60_0), stackIn_63_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void a(kg param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_K != param0) {
                if (this.field_Q == param0) {
                  cs.a((byte) 115);
                  break L1;
                } else {
                  if (this.field_P == param0) {
                    if (this.field_L) {
                      o.a(0);
                      break L1;
                    } else {
                      if (this.field_D) {
                        ol.b((byte) -125);
                        break L1;
                      } else {
                        qc.h(30252);
                        break L1;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              } else {
                this.a(-127);
                break L1;
              }
            }
            L2: {
              if (param1 == 6) {
                break L2;
              } else {
                this.l(-45);
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

            stackIn_17_1 = new StringBuilder().append("ri.F(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_M = null;
        field_I = null;
        field_N = null;
        if (param0 > -55) {
            ri.a((byte) 58);
        }
        field_G = null;
    }

    final String d(boolean param0) {
        if (param0) {
            return (String) null;
        }
        if (null == this.field_H.field_s) {
            return "";
        }
        return this.field_H.field_s;
    }

    final void l(int param0) {
        if (param0 != 8) {
            return;
        }
        this.field_H.e(true);
        this.field_R.e(true);
    }

    static {
        field_G = "Auto-respond to <%0>";
        field_N = "<%highlight>FLEET MOVEMENT</col> - To issue a fleet order, <%key>click</col> on a <%glossary>system</col> you control that has available fleets, then <%key>click</col> on a destination system. Fleets can make <%highlight>one</col> <%glossary>wormhole</col> jump per turn through hostile territory, but can move an unlimited distance through your own systems. Fleets that are about to move are displayed as a <%highlight>curved arrow</col> between the source and destination system.";
        field_F = 50;
        field_I = null;
        field_M = "Invalid date";
    }
}
