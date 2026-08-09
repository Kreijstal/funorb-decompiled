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
        NumberFormatException numberFormatException = null;
        int var2 = 0;
        Throwable decompiledCaughtException = null;
        if (!this.i(94)) {
          return false;
        } else {
          var2 = -1;
          try {
            L0: {
              var2 = Integer.parseInt(this.field_T.field_E);
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0 != -35) {
            tf.b(-18, false, -28, 107);
            return nk.a(this.field_hb.field_E, (byte) 123, (tf) (this), this.field_W.field_H, var2, this.field_fb.field_E, this.field_Y.field_E);
          } else {
            return nk.a(this.field_hb.field_E, (byte) 123, (tf) (this), this.field_W.field_H, var2, this.field_fb.field_E, this.field_Y.field_E);
          }
        }
    }

    final static boolean a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 >= 2) {
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var2_int ^ -1) <= -9) {
                      break L3;
                    } else {
                      stackIn_13_0 = -1;

                      if (var3 != 0) {
                        break L2;
                      } else {
                        if (stackIn_13_0 != (param1[var2_int] ^ -1)) {
                          stackIn_10_0 = 1;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var2_int++;
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = 0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("tf.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
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
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 67) {
              L1: {
                L2: {
                  if (this.field_V != param2) {
                    break L2;
                  } else {
                    t.k((byte) -73);
                    if (!client.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (param2 != this.field_X) {
                  break L1;
                } else {
                  discarded$1 = this.f((byte) -35);
                  return;
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
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("tf.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(ce param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ce var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, 75, param2, param3);
              this.field_X.field_I = this.i(-113);
              if (param1 > 38) {
                break L1;
              } else {
                var6 = (ce) null;
                this.a(-32, 53, (ce) null, '[');
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

            stackIn_5_1 = new StringBuilder().append("tf.A(");

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
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void i(byte param0) {
        L0: {
          if (null == w.field_H) {
            break L0;
          } else {
            if (w.field_H.field_l != null) {
              w.field_H.field_l.field_ab = false;
              break L0;
            } else {
              ki.field_w = null;
              w.field_H = null;
              if (param0 < -55) {
                return;
              } else {
                tf.a((byte) -5, false);
                return;
              }
            }
          }
        }
        ki.field_w = null;
        w.field_H = null;
        if (param0 >= -55) {
          tf.a((byte) -5, false);
          return;
        } else {
          return;
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
          field_ab = null;
          field_Z = null;
          field_gb = null;
          field_cb = null;
          return;
        } else {
          field_ab = null;
          field_Z = null;
          field_gb = null;
          field_cb = null;
          return;
        }
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
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String g(byte param0) {
        int var2 = 85 / ((param0 - -4) / 60);
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean i(int param0) {
        int var2;
        if (this.a(this.field_fb, 127)) {
          if (this.a(this.field_Y, -111)) {
            if (this.a(this.field_eb, 124)) {
              if (this.a(this.field_hb, 126)) {
                if (this.a(this.field_S, -94)) {
                  if (!this.a(this.field_T, 124)) {
                    return false;
                  } else {
                    var2 = 37 % ((16 - param0) / 54);
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
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
          return kc.a(param3, param0, param4, false, false, param2);
        } else {
          return kc.a(param3, param0, param4, false, false, param2);
        }
    }

    public final void a(qi param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == param3) {
                  break L2;
                } else {
                  L3: {
                    if (1 == param3) {
                      break L3;
                    } else {
                      if (2 != param3) {
                        break L1;
                      } else {
                        jg.a(true, "conduct.ws");
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  jg.a(true, "privacy.ws");
                  if (var6 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jg.a(true, "terms.ws");
              break L1;
            }
            if (param2 < -87) {
              break L0;
            } else {
              this.field_fb = (og) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("tf.PA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
        int statePc = 0;
        Throwable caughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        w var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        hl var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (bl.field_T < dl.field_M) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        bl.field_T = bl.field_T + 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (le.field_m.field_i == ac.field_B) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        qc.field_Y = qc.field_Y + (le.field_m.field_i - ac.field_B);
                        ac.field_B = le.field_m.field_i;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (bl.field_T > 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        on.b((byte) -100);
                        ea.field_D.a(false, param1);
                        if (bc.field_E != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (wc.field_n) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        bc.field_E = null;
                        if (var7 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        bc.field_E.a(ea.field_D.field_pb, param1, ea.field_D.field_E, 29166);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        bc.field_E.a(ea.field_D.field_pb, param1, ea.field_D.field_E, 29166);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var4_int = param2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var4_int >= 5) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var5 = dh.field_c[var4_int];
                        if (var7 != 0) {
                            statePc = 27;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var5 != null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var7 == 0) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5.field_ob == 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        cg.a(1, var5, var4_int);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6 = rf.a(0, var4_int);
                        si.field_b[var4_int].field_I = ef.field_O[var6];
                        le.field_D[var4_int].field_Y = sg.field_a[var6];
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_int++;
                        if (var7 == 0) {
                            statePc = 16;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (qb.field_p.field_ob == 0) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        pd.field_f = new mg(qb.field_p.field_E, qb.field_p.field_pb, qb.field_p.field_mb, qb.field_p.field_N, param0, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, (String) null, 0L);
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = wj.a((byte) 55, kf.field_O, param3, nk.field_b);
                        if (var9 == null) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        cb.a(var9, false);
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var8 = sf.c(-36);
                        if (var8 == null) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        sl.field_g = var8;
                        return;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) var4), "tf.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                case 33: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
