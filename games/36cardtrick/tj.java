/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends g implements qh {
    static String field_H;
    private hl field_E;
    static String field_D;
    static sc field_F;
    private hl field_G;
    private hl field_I;
    static String field_J;
    static boolean field_K;

    public static void l(int param0) {
        field_D = null;
        field_F = null;
        if (param0 != 0) {
          field_D = (String) null;
          field_H = null;
          field_J = null;
          return;
        } else {
          field_H = null;
          field_J = null;
          return;
        }
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!super.a(param0, (byte) -117, param2, param3)) {
              if (98 != param2) {
                if ((param2 ^ -1) != -100) {
                  L1: {
                    if (param1 < -99) {
                      break L1;
                    } else {
                      this.a(-88, -56, 19, 33);
                      break L1;
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = this.a(param3, (byte) -28);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = this.b(127, param3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("tj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public tj() {
        super(0, 0, 476, 225, (ci) null);
        this.field_E = new hl(mg.field_K, (pl) null);
        this.field_I = new hl(dl.field_j, (pl) null);
        this.field_G = new hl(oa.field_b, (pl) null);
        ki var1 = new ki();
        this.field_E.field_v = (ci) ((Object) var1);
        this.field_I.field_v = (ci) ((Object) var1);
        this.field_G.field_v = (ci) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> -593397471;
        this.field_I.a(30, -48 + (this.field_q - var2), var4, -var3 + this.field_h >> 672505345, true);
        this.field_G.a(30, -48 + this.field_q - var2, var4, (this.field_h - var3 >> -1508065919) - (-var4 - var2), true);
        this.field_E.a(30, this.field_q - 78 + -(var2 * 2), var3, -var3 + this.field_h >> 1196799297, true);
        this.field_I.field_k = (pl) (this);
        this.field_E.field_k = (pl) (this);
        this.field_G.field_k = (pl) (this);
        this.field_E.field_n = bl.field_b;
        this.field_G.field_n = w.field_m;
        this.b(this.field_I, (byte) 118);
        this.b(this.field_E, (byte) 118);
        this.b(this.field_G, (byte) 118);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_o - -param0;
        int var6 = this.field_i + param1;
        int discarded$0 = j.field_C.a(gk.field_e, var5 + 20, 20 + var6, this.field_h - 40, -50 + this.field_q, 16777215, param2, 1, 0, j.field_C.field_s);
        super.a(param0, param1, -1, param3);
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.applet.Applet var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var5 = param1.getCodeBase();
                    var3 = fh.a(param1, var5, -1).getFile();
                    if (param0) {
                      break L1;
                    } else {
                      var4 = (java.applet.Applet) null;
                      tj.a(false, (java.applet.Applet) null);
                      break L1;
                    }
                  }
                  discarded$6 = vh.a(new Object[]{"home", var3 + "home.ws"}, "updatelinks", (byte) -30, param1);
                  discarded$7 = vh.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, "updatelinks", (byte) 121, param1);
                  discarded$8 = vh.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, "updatelinks", (byte) 117, param1);
                  discarded$9 = vh.a(new Object[]{"options", var3 + "options.ws"}, "updatelinks", (byte) 118, param1);
                  discarded$10 = vh.a(new Object[]{"terms", var3 + "terms.ws"}, "updatelinks", (byte) -43, param1);
                  discarded$11 = vh.a(new Object[]{"privacy", var3 + "privacy.ws"}, "updatelinks", (byte) 119, param1);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
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
                  break L2;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L2;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = Main.field_T;
        try {
          L0: {
            L1: {
              if (this.field_I != param3) {
                if (this.field_E == param3) {
                  jk.a(false);
                  break L1;
                } else {
                  if (param3 != this.field_G) {
                    break L1;
                  } else {
                    lc.a(4);
                    break L1;
                  }
                }
              } else {
                ub.c(0);
                break L1;
              }
            }
            var6_int = 59 % ((param1 - -62) / 32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("tj.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
    }

    static {
        field_H = "Please wait...";
        field_D = "MISSES";
        field_J = "Start Game";
        field_F = new sc();
    }
}
