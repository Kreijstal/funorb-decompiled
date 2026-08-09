/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs extends sf implements he {
    static String[] field_W;
    private kb field_ab;
    private fw field_gb;
    private fw field_Z;
    static kk[] field_db;
    private long field_fb;
    static int field_Y;
    static String field_X;
    static java.awt.Frame field_bb;
    static java.math.BigInteger field_cb;
    static String field_eb;

    cs(gk param0) {
        super(param0, 200, 200);
        kb var3 = null;
        try {
            this.field_fb = vi.b(-95);
            var3 = new kb(ro.field_vb, (qo) null);
            var3.field_p = 50;
            var3.field_w = 100;
            var3.field_l = this.field_l;
            var3.field_B = 0;
            var3.field_k = (kh) ((Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a((byte) 10, var3);
            this.field_ab = new kb(ro.field_vb, (qo) null);
            this.field_ab.field_l = this.field_l;
            this.field_ab.field_B = 0;
            this.field_ab.field_p = 20 + (var3.field_p + var3.field_w);
            this.field_ab.field_w = 80;
            this.field_ab.field_k = (kh) ((Object) new lk(bv.field_t, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a((byte) 10, this.field_ab);
            this.field_Z = this.a(ui.field_e, -63, (qo) (this));
            this.field_gb = this.a(ge.field_m, -74, (qo) (this));
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        fw var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 == this.field_Z) {
                this.n(10);
                break L1;
              } else {
                if (param4 != this.field_gb) {
                  break L1;
                } else {
                  ck.b(-65);
                  this.n(10);
                  break L1;
                }
              }
            }
            if (param1 == 11) {
              break L0;
            } else {
              var7 = (fw) null;
              this.a(-91, -43, 76, 119, (fw) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("cs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private final void n(int param0) {
        if (!this.field_L) {
            return;
        }
        if (param0 != 10) {
            field_db = (kk[]) null;
            this.field_L = false;
            return;
        }
        this.field_L = false;
    }

    public static void b(boolean param0) {
        field_bb = null;
        if (!param0) {
          cs.b(false);
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        } else {
          field_db = null;
          field_X = null;
          field_W = null;
          field_eb = null;
          field_cb = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (!lk.field_f) {
                break L1;
              } else {
                param3.f(param0 + -32721);
                break L1;
              }
            }
            L2: {
              var5_long = vi.b(92) + -this.field_fb;
              var7 = (int)((10999L - var5_long) / 1000L);
              if (0 >= var7) {
                ck.b(-62);
                this.n(10);
                this.field_G.a(new ud(this.field_G, tn.field_cb), 0);
                break L2;
              } else {
                this.field_ab.field_v = "" + var7;
                break L2;
              }
            }
            L3: {
              if (!this.field_L) {
                break L3;
              } else {
                if (null != wq.field_a) {
                  break L3;
                } else {
                  this.n(param0 ^ 32728);
                  this.field_G.a(new ud(this.field_G, mp.field_Mb), 0);
                  break L3;
                }
              }
            }
            L4: {
              if (null == wq.field_a) {
                break L4;
              } else {
                if (!wq.field_a.field_k) {
                  break L4;
                } else {
                  this.n(10);
                  this.field_G.a(new ud(this.field_G, mp.field_Mb), param0 ^ 32722);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("cs.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        kb var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            if (99 != var5_int) {
              if (var5_int != 98) {
                L1: {
                  if (param3 == -12215) {
                    break L1;
                  } else {
                    var7 = (kb) null;
                    this.a((kb) null, 104, 'ﾑ', 60);
                    break L1;
                  }
                }
                stackIn_12_0 = super.a(param0, param1, param2, -12215);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_Z.a(11, (kb) (this));
                stackIn_8_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.field_gb.a(11, (kb) (this));
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("cs.F(");

            if (param0 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final fw a(String param0, int param1, qo param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new fw(param0, param2);
            var4.field_k = (kh) ((Object) new nu());
            var5 = this.field_w - 6;
            this.field_w = this.field_w + 38;
            var4.a(15, -30 + this.field_l, var5, 8192, 30);
            this.a((byte) 10, (kb) (var4));
            this.e(0);
            var6 = 121 % ((1 - param1) / 62);
            stackIn_1_0 = (fw) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("cs.C(");

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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_W = new String[]{"proj_aviansie_axe/aviansie_axe", "proj_arrow/proj_arrow", "proj_cannonball/proj_cannonball", "proj_dart/proj_dart", "proj_grenwall_spikes/proj_grenwall_spikes", "proj_rock/proj_catapultloadimpact", "proj_spear/spear"};
        field_db = new kk[field_W.length];
        field_X = "This item can only be used on a goblin priest.";
        field_cb = new java.math.BigInteger("65537");
        field_eb = "Performance";
    }
}
