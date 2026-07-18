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
        RuntimeException var2 = null;
        kb var3 = null;
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
            ((cs) this).field_fb = vi.b(-95);
            var3 = new kb(ro.field_vb, (qo) null);
            var3.field_p = 50;
            var3.field_w = 100;
            var3.field_l = ((cs) this).field_l;
            var3.field_B = 0;
            var3.field_k = (kh) (Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((cs) this).a((byte) 10, var3);
            ((cs) this).field_ab = new kb(ro.field_vb, (qo) null);
            ((cs) this).field_ab.field_l = ((cs) this).field_l;
            ((cs) this).field_ab.field_B = 0;
            ((cs) this).field_ab.field_p = 20 + (var3.field_p + var3.field_w);
            ((cs) this).field_ab.field_w = 80;
            ((cs) this).field_ab.field_k = (kh) (Object) new lk(bv.field_t, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((cs) this).a((byte) 10, ((cs) this).field_ab);
            ((cs) this).field_Z = this.a(ui.field_e, -63, (qo) this);
            ((cs) this).field_gb = this.a(ge.field_m, -74, (qo) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("cs.<init>(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param4 == ((cs) this).field_Z) {
                this.n(10);
                break L1;
              } else {
                if (param4 != ((cs) this).field_gb) {
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
              var7 = null;
              ((cs) this).a(-91, -43, 76, 119, (fw) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("cs.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    private final void n(int param0) {
        if (!((cs) this).field_L) {
            return;
        }
        if (param0 != 10) {
            field_db = null;
            ((cs) this).field_L = false;
            return;
        }
        ((cs) this).field_L = false;
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
        RuntimeException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              var5_long = vi.b(92) + -((cs) this).field_fb;
              var7 = (int)((10999L - var5_long) / 1000L);
              if (0 >= var7) {
                ck.b(-62);
                this.n(10);
                ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, tn.field_cb), 0);
                break L2;
              } else {
                ((cs) this).field_ab.field_v = "" + var7;
                break L2;
              }
            }
            L3: {
              if (!((cs) this).field_L) {
                break L3;
              } else {
                if (null != wq.field_a) {
                  break L3;
                } else {
                  this.n(param0 ^ 32728);
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), 0);
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
                  ((cs) this).field_G.a((kb) (Object) new ud(((cs) this).field_G, mp.field_Mb), param0 ^ 32722);
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
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("cs.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                    var7 = null;
                    boolean discarded$3 = ((cs) this).a((kb) null, 104, 'ﾑ', 60);
                    break L1;
                  }
                }
                stackOut_11_0 = super.a(param0, param1, param2, -12215);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                boolean discarded$4 = ((cs) this).field_Z.a(11, (kb) this);
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            } else {
              boolean discarded$5 = ((cs) this).field_gb.a(11, (kb) this);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("cs.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_12_0;
    }

    private final fw a(String param0, int param1, qo param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fw stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = new fw(param0, param2);
            var4.field_k = (kh) (Object) new nu();
            var5 = ((cs) this).field_w - 6;
            ((cs) this).field_w = ((cs) this).field_w + 38;
            var4.a(15, -30 + ((cs) this).field_l, var5, 8192, 30);
            ((cs) this).a((byte) 10, (kb) (Object) var4);
            ((cs) this).e(0);
            var6 = 121 % ((1 - param1) / 62);
            stackOut_0_0 = (fw) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("cs.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new String[]{"proj_aviansie_axe/aviansie_axe", "proj_arrow/proj_arrow", "proj_cannonball/proj_cannonball", "proj_dart/proj_dart", "proj_grenwall_spikes/proj_grenwall_spikes", "proj_rock/proj_catapultloadimpact", "proj_spear/spear"};
        field_db = new kk[field_W.length];
        field_X = "This item can only be used on a goblin priest.";
        field_cb = new java.math.BigInteger("65537");
        field_eb = "Performance";
    }
}
