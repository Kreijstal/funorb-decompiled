/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tf extends kf implements rl, vn, fi {
    df field_db;
    static w field_gb;
    private og field_fb;
    private og field_T;
    private og field_eb;
    static Random field_cb;
    private og field_hb;
    private ek field_X;
    private dl field_W;
    private ek field_V;
    static String field_Z;
    static String field_ab;
    private og field_S;
    private og field_Y;
    private qi field_U;
    static boolean field_bb;

    public tf() {
        super(0, 0, 496, 0, (gl) null);
        this.field_fb = new og("", (kg) null, 12);
        this.field_Y = new og("", (kg) null, 100);
        this.field_eb = new og("", (kg) null, 100);
        this.field_hb = new og("", (kg) null, 20);
        this.field_S = new og("", (kg) null, 20);
        this.field_T = new og("", (kg) null, 3);
        int var1 = 1;
        this.field_W = new dl("", (kg) null, var1 != 0);
        this.field_X = new ek(se.field_Q, (kg) null);
        this.field_V = new ek(ec.field_q, (kg) null);
        this.field_fb.field_B = ea.field_C;
        this.field_Y.field_B = ad.field_t;
        this.field_eb.field_B = aa.field_a;
        this.field_hb.field_B = wd.field_b;
        this.field_S.field_B = ua.field_C;
        this.field_T.field_B = fb.field_a;
        this.field_W.field_B = al.field_j;
        this.field_fb.a(new jm(this.field_fb), -5362);
        this.field_Y.a(new ii(this.field_Y), -5362);
        this.field_eb.a(new tl(this.field_eb, this.field_Y), -5362);
        this.field_hb.a(new te(this.field_hb, this.field_fb, this.field_Y), -5362);
        this.field_S.a(new re(this.field_S, this.field_hb), -5362);
        this.field_T.a(new kd(this.field_T), -5362);
        this.field_X.field_I = false;
        this.field_X.field_p = (gl) ((Object) new fk());
        this.field_V.field_p = (gl) ((Object) new on());
        this.field_fb.field_p = (gl) ((Object) new di(10000536));
        di dupTemp$0 = new di(10000536);
        this.field_eb.field_p = (gl) ((Object) dupTemp$0);
        this.field_Y.field_p = (gl) ((Object) dupTemp$0);
        this.field_T.field_p = (gl) ((Object) new di(10000536));
        this.field_W.field_p = (gl) ((Object) new tg());
        gm dupTemp$1 = new gm(10000536);
        this.field_S.field_p = (gl) ((Object) dupTemp$1);
        this.field_hb.field_p = (gl) ((Object) dupTemp$1);
        String var2 = cm.a((byte) 102, me.field_G, new String[]{this.g((byte) 63), this.h((byte) 29)});
        int var3 = 20;
        var3 = var3 + this.a(9828, this.field_Y, var3, eg.field_c, 170);
        var3 = var3 + (5 + this.a(this.field_eb, oc.field_d, 20, (byte) -44, 170, var3, ""));
        var3 = var3 + this.a(9828, this.field_hb, var3, ch.field_d, 170);
        var3 = var3 + (this.a(125, this.field_S, var3, sl.field_e, ga.field_c, 170) + 5);
        var3 = var3 + (5 + this.a(114, this.field_fb, var3, rg.field_e, ij.field_b, 170));
        var3 = var3 + this.a(qe.field_e, (byte) -107, this.field_T, 170, var3);
        de var4 = new de(46, var3, -90 + this.field_t, 25, this.field_W, true, -120 + this.field_t, 5, bj.field_f, 11579568, h.field_a);
        this.b(var4, (byte) -55);
        var3 = var3 + var4.field_y;
        a var5 = new a(hh.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, hh.field_e.field_R, -1, 2147483647, true);
        this.field_U = new qi(var2, var5);
        this.field_U.field_B = "";
        this.field_U.a(rb.field_i, 0, 1);
        this.field_U.a(rb.field_i, 1, 1);
        this.field_U.field_v = (kg) (this);
        this.field_U.c(-114, 46, var3, -90 + this.field_t);
        var3 = var3 + (15 + this.field_U.field_y);
        this.b(this.field_U, (byte) -55);
        int var6 = 4;
        int var7 = 200;
        this.field_X.b(40, var7, -var7 + 496 >> 1635535617, var3, -16555);
        this.field_V.b(40, 60, 3 + var6, var3 + 15, -16555);
        this.field_V.field_v = (kg) (this);
        this.field_X.field_v = (kg) (this);
        this.b(this.field_X, (byte) -55);
        this.b(this.field_V, (byte) -55);
        this.field_db = new df((fi) (this));
        this.field_db.b(150, -60 + -this.field_fb.field_t + (this.field_t + -this.field_fb.field_u), this.field_fb.field_u + this.field_fb.field_t + 60, this.field_fb.field_D - -20, -16555);
        this.b(this.field_db, (byte) -55);
        this.b(55 + var3 - -var6, 496, 0, 0, -16555);
    }

    private final boolean f(byte param0) {
        if (!(this.i(94))) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(this.field_T.field_E);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 != -35) {
            tf.b(-18, false, -28, 107);
        }
        return nk.a(this.field_hb.field_E, (byte) 123, (tf) (this), this.field_W.field_H, var2, this.field_fb.field_E, this.field_Y.field_E);
    }

    final static boolean a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 >= 2) {
              var2_int = 0;
              L1: while (true) {
                if ((var2_int ^ -1) <= -9) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-1 != (param1[var2_int] ^ -1)) {
                    stackIn_9_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var2_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("tf.HA(").append(param0).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        ll.a(-1, param1);
        hm.a(-1, param1);
        int var2 = 36 / ((-24 - param0) / 53);
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param0 == 67) {
              L1: {
                if (this.field_V != param2) {
                  if (param2 != this.field_X) {
                    break L1;
                  } else {
                    discarded$1 = this.f((byte) -35);
                    break L1;
                  }
                } else {
                  t.k((byte) -73);
                  break L1;
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
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("tf.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        try {
            super.a(param0, 75, param2, param3);
            this.field_X.field_I = this.i(-113);
            if (param1 <= 38) {
                ce var6 = (ce) null;
                this.a(-32, 53, (ce) null, '[');
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "tf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(byte param0) {
        if (null != w.field_H) {
            if (!(w.field_H.field_l == null)) {
                w.field_H.field_l.field_ab = false;
            }
        }
        ki.field_w = null;
        w.field_H = null;
        if (param0 >= -55) {
            tf.a((byte) -5, false);
        }
    }

    public final void a(int param0) {
        if (param0 != 25) {
            return;
        }
        ((jm) ((Object) this.field_fb.a(-96))).a(true);
    }

    private final int a(int param0, ce param1, int param2, String param3, String param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 99) {
                break L1;
              } else {
                field_cb = (Random) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param1, param4, 35, (byte) -44, param5, param2, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("tf.OA(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(ce param0, String param1, int param2, byte param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        pa var9 = null;
        de var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var10 = new de(20, param5, 120 + param4, 25, param0, false, 120, 3, hh.field_e, 16777215, param1);
              this.b(var10, (byte) -55);
              var9 = new pa(((jl) ((Object) param0)).a(-122), param6, 126, param5 + var10.field_y, param4 + 50, param2);
              var9.field_v = (kg) (this);
              this.b(var9, (byte) -55);
              if (param3 == -44) {
                break L1;
              } else {
                field_bb = false;
                break L1;
              }
            }
            stackIn_3_0 = var10.field_y - -var9.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("tf.FA(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(boolean param0) {
        if (!param0) {
            tf.a((byte) 125, true);
        }
        field_ab = null;
        field_Z = null;
        field_gb = null;
        field_cb = null;
    }

    private final boolean a(jl param0, int param1) {
        nb var3 = null;
        RuntimeException var3_ref = null;
        tb var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param0.a(-101);
            if (var3 == null) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = -62 % ((param1 - 73) / 51);
              var4 = var3.a(20350);
              if (vm.field_u == var4) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (le.field_o != var4) {
                  if (ki.field_t == var4) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("tf.GA(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    private final String h(byte param0) {
        if (param0 != 29) {
            tf.b(118, false, -20, 75);
        }
        return "</col></u>";
    }

    private final String g(byte param0) {
        int var2 = 85 / ((param0 - -4) / 60);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean i(int param0) {
        int var2;
        L0: {
          if (!this.a(this.field_fb, 127)) {
            break L0;
          } else {
            if (!this.a(this.field_Y, -111)) {
              break L0;
            } else {
              if (!this.a(this.field_eb, 124)) {
                break L0;
              } else {
                if (!this.a(this.field_hb, 126)) {
                  break L0;
                } else {
                  if (!this.a(this.field_S, -94)) {
                    break L0;
                  } else {
                    if (this.a(this.field_T, 124)) {
                      var2 = 37 % ((16 - param0) / 54);
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
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
            var5_int = -45 % ((-22 - param0) / 49);
            if (super.a(-84, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if (99 == param1) {
                  stackIn_10_0 = this.a(32, param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(param2, (byte) -115);
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

            stackIn_13_1 = new StringBuilder().append("tf.QA(").append(param0).append(',').append(param1).append(',');

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
          throw dh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
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

    final static ji a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param1 < 73) {
            field_Z = (String) null;
        }
        return kc.a(param3, param0, param4, false, false, param2);
    }

    public final void a(qi param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 == param3) {
                jg.a(true, "terms.ws");
                break L1;
              } else {
                if (1 == param3) {
                  jg.a(true, "privacy.ws");
                  break L1;
                } else {
                  if (2 != param3) {
                    break L1;
                  } else {
                    jg.a(true, "conduct.ws");
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param2 < -87) {
                break L2;
              } else {
                this.field_fb = (og) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("tf.PA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        og var3 = null;
        int discarded$0 = 0;
        String var4 = null;
        try {
            var3 = this.field_fb;
            if (param1 != -28464) {
                ce var5 = (ce) null;
                discarded$0 = this.a((String) null, (byte) 117, (ce) null, -76, -79);
            }
            var4 = param0;
            ((rk) ((Object) var3)).a(var4, (byte) 114, false);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "tf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0, boolean param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        w var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        hl var9 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (bl.field_T < dl.field_M) {
                bl.field_T = bl.field_T + 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (le.field_m.field_i == ac.field_B) {
                break L2;
              } else {
                qc.field_Y = qc.field_Y + (le.field_m.field_i - ac.field_B);
                ac.field_B = le.field_m.field_i;
                break L2;
              }
            }
            if (bl.field_T > 0) {
              L3: {
                on.b((byte) -100);
                ea.field_D.a(false, param1);
                if (bc.field_E != null) {
                  if (wc.field_n) {
                    bc.field_E.a(ea.field_D.field_pb, param1, ea.field_D.field_E, 29166);
                    break L3;
                  } else {
                    bc.field_E = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var4_int = param2;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (qb.field_p.field_ob == 0) {
                      break L5;
                    } else {
                      pd.field_f = new mg(qb.field_p.field_E, qb.field_p.field_pb, qb.field_p.field_mb, qb.field_p.field_N, param0, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, (String) null, 0L);
                      break L5;
                    }
                  }
                  L6: {
                    var9 = wj.a((byte) 55, kf.field_O, param3, nk.field_b);
                    if (var9 == null) {
                      break L6;
                    } else {
                      cb.a(var9, false);
                      break L6;
                    }
                  }
                  L7: {
                    var8 = sf.c(-36);
                    if (var8 == null) {
                      break L7;
                    } else {
                      sl.field_g = var8;
                      break L7;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L8: {
                    var5 = dh.field_c[var4_int];
                    if (var5 != null) {
                      L9: {
                        if (var5.field_ob == 0) {
                          break L9;
                        } else {
                          cg.a(1, var5, var4_int);
                          break L9;
                        }
                      }
                      var6 = rf.a(0, var4_int);
                      si.field_b[var4_int].field_I = ef.field_O[var6];
                      le.field_D[var4_int].field_Y = sg.field_a[var6];
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var4_int++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var4), "tf.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(String param0, byte param1, ce param2, int param3, int param4) {
        RuntimeException var6 = null;
        g var7 = null;
        de var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var8 = new de(20, param4, 120 - -param3, 25, param2, false, 120, 3, hh.field_e, 16777215, param0);
              this.b(var8, (byte) -55);
              var7 = new g(((jl) ((Object) param2)).a(-126));
              this.b(var7, (byte) -55);
              if (param1 == -107) {
                break L1;
              } else {
                this.field_db = (df) null;
                break L1;
              }
            }
            var7.b(15, 15, var8.field_t + (var8.field_u + 3), var8.field_D - -(-15 + var8.field_y >> 778367041), -16555);
            stackIn_3_0 = var8.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("tf.NA(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, ce param1, int param2, String param3, int param4) {
        int discarded$1 = 0;
        de var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new de(20, param2, param4 + 120, 25, param1, false, 120, 3, hh.field_e, 16777215, param3);
              this.b(var6, (byte) -55);
              if (param0 == 9828) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$1 = this.a((ce) null, (String) null, -93, (byte) 120, -33, 113, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = var6.field_y;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("tf.EA(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_ab = "Status";
        field_Z = "Click";
        field_cb = new Random();
    }
}
