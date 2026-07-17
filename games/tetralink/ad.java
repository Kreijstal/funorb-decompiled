/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends hl {
    static String field_Nb;
    int field_Lb;
    private hl[] field_Kb;
    private hl[] field_Mb;
    private hl field_Ob;

    ad(long param0, hl param1, String[] param2, hl param3, hl[] param4, int param5) {
        super(param0, (hl) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        hl var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((ad) this).field_Mb = new hl[param2.length];
            ((ad) this).field_Ob = new hl(0L, param3);
            ((ad) this).field_Kb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((ad) this).a((byte) -125, ((ad) this).field_Ob);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((ad) this).field_Lb = param5;
                    ((ad) this).field_Mb[param5].field_zb = true;
                    break L0;
                  } else {
                    ((ad) this).field_Ob.a((byte) 72, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new hl(0L, param1);
                var9.field_jb = param2[var8_int];
                ((ad) this).field_Mb[var8_int] = var9;
                ((ad) this).a((byte) -101, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("ad.<init>(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 41);
        }
    }

    public static void d(byte param0) {
        if (param0 != 43) {
            field_Nb = null;
        }
        field_Nb = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        hg.field_f[param2] = param6;
        hg.field_g[param2] = param4;
        hg.field_h[param2] = param5;
        if (param1 != 0) {
            return;
        }
        try {
            hg.field_b[param2] = param0;
            hg.field_j[param2] = param3;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ad.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = TetraLink.field_J;
        var4 = 0;
        L0: while (true) {
          if (((ad) this).field_Mb.length <= var4) {
            ((ad) this).field_Ob.a((byte) -117, ((ad) this).field_Hb, param1, ((ad) this).field_R - param1, 0);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((ad) this).field_Kb.length) {
                L2: {
                  if (param0 == -8325) {
                    break L2;
                  } else {
                    ((ad) this).field_Mb = null;
                    break L2;
                  }
                }
                return;
              } else {
                ((ad) this).field_Kb[var8].a((byte) -90, ((ad) this).field_Ob.field_Hb + -(param2 * 2), param2, ((ad) this).field_Ob.field_R - 2 * param2, param2);
                if (((ad) this).field_Lb != var8) {
                  ((ad) this).field_Kb[var8].field_M = ((ad) this).field_Kb[var8].field_M + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * ((ad) this).field_Hb / ((ad) this).field_Mb.length;
            var6 = (1 + var4) * ((ad) this).field_Hb / ((ad) this).field_Mb.length;
            ((ad) this).field_Mb[var4].field_M = var5;
            ((ad) this).field_Mb[var4].field_yb = 0;
            ((ad) this).field_Mb[var4].field_Hb = var6 - var5;
            ((ad) this).field_Mb[var4].field_R = param1;
            var4++;
            continue L0;
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TetraLink.field_J;
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            ad.d((byte) 85);
            break L0;
          }
        }
        L1: while (true) {
          if (((ad) this).field_Mb.length <= var2) {
            return;
          } else {
            if (((ad) this).field_Lb != var2) {
              if (0 != ((ad) this).field_Mb[var2].field_F) {
                ((ad) this).field_Mb[((ad) this).field_Lb].field_zb = false;
                ((ad) this).field_Kb[((ad) this).field_Lb].field_M = ((ad) this).field_Kb[((ad) this).field_Lb].field_M + 10000;
                ((ad) this).field_Lb = var2;
                ((ad) this).field_Mb[var2].field_zb = true;
                ((ad) this).field_Kb[var2].field_M = ((ad) this).field_Kb[var2].field_M - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != 0) {
            ((ad) this).field_Kb = null;
        }
        ((ad) this).field_M = param2;
        ((ad) this).field_yb = param4;
        ((ad) this).field_Hb = param5;
        ((ad) this).field_R = param1;
        this.a(param0 + -8325, param6, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
