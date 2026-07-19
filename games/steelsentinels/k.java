/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k extends gd implements ae {
    private mi field_Bb;
    private boolean field_Jb;
    private boolean field_Db;
    private boolean field_Ab;
    static qb[] field_Cb;
    static String field_zb;
    static String[] field_Ib;
    private boolean field_Mb;
    private bk field_Hb;
    static int field_Gb;
    static String field_Fb;
    static int field_Lb;
    static String field_Kb;
    static String field_Eb;

    final void m(byte param0) {
        bm var2 = null;
        this.field_Hb.b(4210752, 2121792, 16711422);
        if (param0 <= 90) {
          this.field_Bb = (mi) null;
          var2 = new bm((k) (this), this.field_Bb, rg.field_a);
          var2.a(15, fb.field_q, 120);
          this.c(var2, -22908735);
          return;
        } else {
          var2 = new bm((k) (this), this.field_Bb, rg.field_a);
          var2.a(15, fb.field_q, 120);
          this.c(var2, -22908735);
          return;
        }
    }

    final void m(int param0) {
        if (param0 <= 90) {
            return;
        }
        if (!this.field_Q) {
            return;
        }
        this.field_Q = false;
        if (this.field_Jb) {
            il.d(0);
        } else {
            if (this.field_Mb) {
                jf.n(0);
                return;
            }
            return;
        }
    }

    final static void a(byte param0, String param1) {
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
              oa.a(param1, (byte) -107);
              bf.a((byte) -83, false, rh.field_p);
              if (param0 >= 108) {
                break L1;
              } else {
                field_Cb = (qb[]) null;
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
            stackOut_3_1 = new StringBuilder().append("k.CA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(String param0, byte param1, int param2) {
        oa discarded$2 = null;
        oa discarded$3 = null;
        RuntimeException var4 = null;
        bm var4_ref = null;
        int var5 = 0;
        bm var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        bm stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        bm stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        bm stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        bm stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        bm stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        bm stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            if (!this.field_Ab) {
              L1: {
                this.field_Ab = true;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (256 != param2) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((k) (this)).field_Db = stackIn_6_1 != 0;
              if (param1 < -36) {
                L2: {
                  this.field_Hb.b(4210752, 8405024, 16711422);
                  var6 = new bm((k) (this), this.field_Bb, param0);
                  var4_ref = var6;
                  if (5 != param2) {
                    if (param2 != 256) {
                      L3: {
                        stackOut_12_0 = (bm) (var6);
                        stackOut_12_1 = -1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (!this.field_Jb) {
                          stackOut_14_0 = (bm) ((Object) stackIn_14_0);
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = le.field_J;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          break L3;
                        } else {
                          stackOut_13_0 = (bm) ((Object) stackIn_13_0);
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = sl.field_c;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          break L3;
                        }
                      }
                      ((bm) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, 88);
                      break L2;
                    } else {
                      discarded$2 = var6.a(-122, (tn) (this), sl.field_c);
                      break L2;
                    }
                  } else {
                    var6.a(11, cl.field_c, 94);
                    var6.a(17, qe.field_b, 118);
                    break L2;
                  }
                }
                L4: {
                  if ((param2 ^ -1) == -4) {
                    var6.a(7, vg.field_d, 125);
                    break L4;
                  } else {
                    if (-5 == (param2 ^ -1)) {
                      var6.a(8, bk.field_X, 69);
                      break L4;
                    } else {
                      if (param2 == 6) {
                        var6.a(9, rn.field_s, 102);
                        break L4;
                      } else {
                        if (param2 == 9) {
                          discarded$3 = var6.a(-111, (tn) (this), pm.field_Y);
                          break L4;
                        } else {
                          this.c(var6, -22908735);
                          return;
                        }
                      }
                    }
                  }
                }
                this.c(var6, -22908735);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("k.K(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ')');
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

    k(ka param0, mi param1, String param2, boolean param3, boolean param4) {
        super(param0, new bm((k) null, param1, param2), 77, 10, 10);
        try {
            this.field_Bb = param1;
            this.field_Mb = param4 ? true : false;
            this.field_Db = false;
            this.field_Jb = param3 ? true : false;
            this.field_Ab = false;
            this.field_Hb = new bk(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Hb.field_N = true;
            this.a(this.field_Hb, -121);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        hh.field_j = (param1 << 691078320) / 150;
        hh.field_i = 100 * param1 / 150;
        hh.field_f = 400 * param1 / 150;
        if (param0 == 24) {
          return;
        } else {
          field_Fb = (String) null;
          return;
        }
    }

    public void a(int param0, byte param1, int param2, oa param3, int param4) {
        try {
            if (this.field_Db) {
                hc.a(3, 0);
                this.m(106);
            } else {
                rj.a("tochangedisplayname.ws", wl.d((byte) -21), (byte) -47);
            }
            int var6_int = 31 / ((param1 - -85) / 36);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "k.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void n(byte param0) {
        field_Kb = null;
        field_Fb = null;
        field_Cb = null;
        int var1 = -88 / ((39 - param0) / 56);
        field_Eb = null;
        field_zb = null;
        field_Ib = null;
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (13 != param1) {
              if (param0 == 30373) {
                stackOut_6_0 = super.a(param0 ^ 0, param1, param2, param3);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.m(120);
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
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("k.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(boolean param0, int[] param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_Gb = -108;
                break L1;
              }
            }
            param2--;
            L2: while (true) {
              if ((param2 ^ -1) > -1) {
                break L0;
              } else {
                var9 = param1;
                var5_array = var9;
                var6 = param3;
                var7 = param4;
                var9[var6] = ec.a(var9[var6] >> 216146785, 8355711) + var7;
                param3++;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("k.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        int var0 = 0;
        field_Ib = new String[]{"NAME", "CHASSIS", "WAVE", "SCORE"};
        field_zb = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Cb = new qb[10000];
        for (var0 = 0; 10000 > var0; var0++) {
            field_Cb[var0] = new qb();
        }
        field_Fb = "Friends can be added in the multiplayer<nbsp>lobby";
        field_Kb = "All players have left <%0>'s game.";
        field_Eb = "Research into <col=00ffff>plasma weapons</col> is needed before the <%0> can be engineered.";
        field_Gb = 0;
    }
}
