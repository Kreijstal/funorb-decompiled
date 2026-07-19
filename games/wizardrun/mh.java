/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends gf implements qd {
    private boolean field_mb;
    static String[] field_sb;
    static java.awt.Font field_ob;
    private boolean field_rb;
    static volatile int field_pb;
    static kl field_jb;
    static String field_lb;
    private vd field_qb;
    static int field_tb;
    private hd field_ub;
    private boolean field_kb;
    private boolean field_nb;

    final void n(int param0) {
        if (param0 != 8) {
            field_tb = 105;
        }
        this.field_ub.a(2121792, -1028717695, 4210752);
        vc var2 = new vc((mh) (this), this.field_qb, sh.field_d);
        var2.a((byte) -31, ud.field_a, 15);
        this.c(var2, param0 + -119);
    }

    final boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
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
            if (13 == param1) {
              this.l(-27697);
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 <= -96) {
                stackOut_7_0 = super.a(param0, param1, (byte) -99, param3);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("mh.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    final static le a(byte param0, mg param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        le stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        le stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param1.g(8, -11719);
            if (var2_int <= 0) {
              L1: {
                var3 = oe.a((byte) -55, param1) ? 1 : 0;
                if (param0 == -117) {
                  break L1;
                } else {
                  field_ob = (java.awt.Font) null;
                  break L1;
                }
              }
              L2: {
                var4 = oe.a((byte) -55, param1) ? 1 : 0;
                var5 = new le();
                var5.field_L = (short)param1.g(16, param0 ^ 11698);
                var5.field_P = sa.a(16, (byte) -48, param1, var5.field_P);
                var5.field_a = sa.a(16, (byte) -48, param1, var5.field_a);
                var5.field_w = sa.a(16, (byte) -48, param1, var5.field_w);
                var5.field_N = (short)param1.g(16, -11719);
                var5.field_p = sa.a(16, (byte) -48, param1, var5.field_p);
                var5.field_C = sa.a(16, (byte) -48, param1, var5.field_C);
                var5.field_I = sa.a(16, (byte) -48, param1, var5.field_I);
                if (var3 == 0) {
                  break L2;
                } else {
                  var5.field_y = (short)param1.g(16, -11719);
                  var5.field_k = sa.a(16, (byte) -48, param1, var5.field_k);
                  var5.field_R = sa.a(16, (byte) -48, param1, var5.field_R);
                  var5.field_o = sa.a(16, (byte) -48, param1, var5.field_o);
                  var5.field_c = sa.a(16, (byte) -48, param1, var5.field_c);
                  var5.field_Q = sa.a(16, (byte) -48, param1, var5.field_Q);
                  var5.field_d = sa.a(16, (byte) -48, param1, var5.field_d);
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  discarded$1 = param1.g(16, -11719);
                  var5.field_G = sa.a(16, (byte) -48, param1, var5.field_G);
                  var5.field_H = sa.a(16, (byte) -48, param1, var5.field_H);
                  var5.field_m = sa.a(16, (byte) -48, param1, var5.field_m);
                  var5.field_z = sa.a(16, (byte) -48, param1, var5.field_z);
                  var5.field_v = sa.a(16, (byte) -48, param1, var5.field_v);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (oe.a((byte) -55, param1)) {
                  var5.field_O = sa.a(16, (byte) -48, param1, var5.field_O);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!oe.a((byte) -55, param1)) {
                  break L5;
                } else {
                  var5.field_x = sd.a(param1, var5.field_x, 16, (byte) 11);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_x.length) {
                      if (-1 == (var6 ^ -1)) {
                        var5.field_x = null;
                        break L5;
                      } else {
                        var5.field_n = (byte)(var6 - -1);
                        break L5;
                      }
                    } else {
                      L7: {
                        if (var6 < (var5.field_x[var7] & 255)) {
                          var6 = 255 & var5.field_x[var7];
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_23_0 = (le) (var5);
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2);
            stackOut_25_1 = new StringBuilder().append("mh.JA(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final static int[] m(int param0) {
        if (param0 != -26421) {
            return (int[]) null;
        }
        return new int[8];
    }

    public static void e(boolean param0) {
        le discarded$0 = null;
        field_lb = null;
        field_ob = null;
        field_jb = null;
        field_sb = null;
        if (!param0) {
            mg var2 = (mg) null;
            discarded$0 = mh.a((byte) -60, (mg) null);
        }
    }

    public void a(int param0, pl param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_mb) {
                rb.a("tochangedisplayname.ws", -1926289535, jg.f(param0 + 18906));
                break L1;
              } else {
                jc.a((byte) 115, 3);
                this.l(-27697);
                break L1;
              }
            }
            L2: {
              if (param0 == -18905) {
                break L2;
              } else {
                this.field_mb = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var6);
            stackOut_6_1 = new StringBuilder().append("mh.DA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int var4 = wizardrun.field_H;
        wc.field_k = 0;
        hb.field_k = null;
        si.field_q = null;
        int var2 = nf.field_b;
        nf.field_b = kj.field_a;
        ii.field_f.field_k = ii.field_f.field_k + 1;
        kj.field_a = var2;
        if (-52 == (param1 ^ -1)) {
            ii.field_f.field_n = 2;
        } else {
            if (param1 != 50) {
                ii.field_f.field_n = 1;
            } else {
                ii.field_f.field_n = 5;
            }
        }
        if (2 <= ii.field_f.field_k) {
            if (!((param1 ^ -1) != -52)) {
                return 2;
            }
        }
        if (2 <= ii.field_f.field_k) {
            if (-51 == (param1 ^ -1)) {
                return 5;
            }
        }
        if (ii.field_f.field_k >= 4) {
            return 1;
        }
        int var3 = -105 % ((param0 - 34) / 47);
        return -1;
    }

    final void a(String param0, int param1, int param2) {
        pl discarded$3 = null;
        int[] discarded$4 = null;
        pl discarded$5 = null;
        RuntimeException var4 = null;
        vc var4_ref = null;
        int var5 = 0;
        vc var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vc stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        vc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        vc stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        vc stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        String stackOut_12_2 = null;
        vc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        String stackOut_11_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            if (!this.field_kb) {
              L1: {
                this.field_kb = true;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (-257 != (param2 ^ -1)) {
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
              L2: {
                ((mh) (this)).field_mb = stackIn_6_1 != 0;
                this.field_ub.a(8405024, -1028717695, 4210752);
                var6 = new vc((mh) (this), this.field_qb, param0);
                var4_ref = var6;
                if (-6 != (param2 ^ -1)) {
                  if (256 != param2) {
                    L3: {
                      stackOut_10_0 = (vc) (var6);
                      stackOut_10_1 = -31;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (this.field_rb) {
                        stackOut_12_0 = (vc) ((Object) stackIn_12_0);
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = me.field_a;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L3;
                      } else {
                        stackOut_11_0 = (vc) ((Object) stackIn_11_0);
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = ti.field_h;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L3;
                      }
                    }
                    ((vc) (Object) stackIn_13_0).a((byte) stackIn_13_1, stackIn_13_2, -1);
                    break L2;
                  } else {
                    discarded$3 = var6.a(0, me.field_a, (ce) (this));
                    break L2;
                  }
                } else {
                  var6.a((byte) -31, da.field_j, 11);
                  var6.a((byte) -31, pk.field_q, 17);
                  break L2;
                }
              }
              L4: {
                if (param1 > 12) {
                  break L4;
                } else {
                  discarded$4 = mh.m(-64);
                  break L4;
                }
              }
              L5: {
                if ((param2 ^ -1) == -4) {
                  var6.a((byte) -31, vl.field_g, 7);
                  break L5;
                } else {
                  if (param2 == 4) {
                    var6.a((byte) -31, wh.field_b, 8);
                    break L5;
                  } else {
                    if ((param2 ^ -1) == -7) {
                      var6.a((byte) -31, ka.field_h, 9);
                      break L5;
                    } else {
                      if (param2 != 9) {
                        break L5;
                      } else {
                        discarded$5 = var6.a(0, de.field_a, (ce) (this));
                        break L5;
                      }
                    }
                  }
                }
              }
              this.c(var6, -116);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("mh.EA(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void l(int param0) {
        L0: {
          if (param0 == -27697) {
            break L0;
          } else {
            field_sb = (String[]) null;
            break L0;
          }
        }
        if (!this.field_H) {
          return;
        } else {
          L1: {
            this.field_H = false;
            if (this.field_rb) {
              uk.a(19702);
              break L1;
            } else {
              if (!this.field_nb) {
                break L1;
              } else {
                me.a(param0 ^ -27704);
                break L1;
              }
            }
          }
          return;
        }
    }

    mh(wi param0, vd param1, String param2, boolean param3, boolean param4) {
        super(param0, new vc((mh) null, param1, param2), 77, 10, 10);
        try {
            this.field_qb = param1;
            this.field_mb = false;
            this.field_rb = param3 ? true : false;
            this.field_kb = false;
            this.field_nb = param4 ? true : false;
            this.field_ub = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ub.field_I = true;
            this.a((ub) (this.field_ub), (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_sb = new String[]{"Complete the game", "Capture and pop all creatures in world 1", "Complete world 1", "Reach world 4 from world 1 without losing a life", "Reach world 6 from world 1 without losing a life", "Kill the Giant Spider on world 1, losing no lives", "Kill the Pygmy Boss on world 2, losing no lives", "Kill the Pirate Captain on world 3, losing no lives", "Kill the Troll Ancient on world 4, losing no lives", "Kill the Ice Dragon on world 5, losing no lives", "Kill the Harpy King on world 6, losing no lives", "Collect 100 pumpkins in world 6 during halloween"};
        field_pb = 0;
        field_lb = "Fullscreen";
    }
}
