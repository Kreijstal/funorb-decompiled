/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dna extends sna {
    private sna field_vb;
    private sna[] field_xb;
    int field_yb;
    private sna[] field_wb;

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((dna) this).field_xb.length) {
            L1: {
              if (param0 == 18632) {
                break L1;
              } else {
                dna.f((byte) 59);
                break L1;
              }
            }
            return;
          } else {
            if (var2 != ((dna) this).field_yb) {
              if (0 != ((dna) this).field_xb[var2].field_R) {
                ((dna) this).field_xb[((dna) this).field_yb].field_t = false;
                ((dna) this).field_wb[((dna) this).field_yb].field_kb = ((dna) this).field_wb[((dna) this).field_yb].field_kb + 10000;
                ((dna) this).field_yb = var2;
                ((dna) this).field_xb[var2].field_t = true;
                ((dna) this).field_wb[var2].field_kb = ((dna) this).field_wb[var2].field_kb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    dna(long param0, sna param1, String[] param2, sna param3, sna[] param4, int param5) {
        super(param0, (sna) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        sna var9 = null;
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
            ((dna) this).field_xb = new sna[param2.length];
            ((dna) this).field_vb = new sna(0L, param3);
            ((dna) this).field_wb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((dna) this).a(-1, ((dna) this).field_vb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((dna) this).field_yb = param5;
                    ((dna) this).field_xb[param5].field_t = true;
                    break L0;
                  } else {
                    ((dna) this).field_vb.a(-1, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new sna(0L, param1);
                var9.field_Z = param2[var8_int];
                ((dna) this).field_xb[var8_int] = var9;
                ((dna) this).a(-1, var9);
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
            stackOut_9_1 = new StringBuilder().append("dna.<init>(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param5 + 41);
        }
    }

    final static void c(int param0, boolean param1) {
        int var2 = (kg.field_b - 640) / 2;
        int var3 = saa.field_b * saa.field_b;
        int var4 = var3 + -(param0 * param0);
        ela.field_i.a(dg.field_c - 214, 31407, 199, -(199 * var4 / var3) + var2, 90);
        ho.field_g.a(-4 + dg.field_c - 120, 31407, 438, var4 * 438 / var3 + (var2 + 202), 0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((dna) this).field_kb = param1;
        ((dna) this).field_rb = param5;
        ((dna) this).field_p = param3;
        if (param2 != 0) {
            dna.f((byte) -76);
        }
        ((dna) this).field_sb = param4;
        this.a(false, param0, param6);
    }

    final static void f(byte param0) {
        if (param0 != -12) {
            return;
        }
        dda.c(param0 + -31021);
    }

    final static int b(int param0, boolean param1) {
        String var2 = lka.field_E[param0][4];
        var2 = var2.trim();
        var2 = var2.toLowerCase();
        return ((ji) (Object) cw.field_zb.a(true, (long)var2.hashCode())).field_h;
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = BachelorFridge.field_y;
        var4 = 0;
        L0: while (true) {
          if (((dna) this).field_xb.length <= var4) {
            ((dna) this).field_vb.a(-param2 + ((dna) this).field_p, 31407, ((dna) this).field_sb, 0, param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (((dna) this).field_wb.length <= var8) {
                return;
              } else {
                ((dna) this).field_wb[var8].a(((dna) this).field_vb.field_p - param1 * 2, 31407, -(param1 * 2) + ((dna) this).field_vb.field_sb, param1, param1);
                if (((dna) this).field_yb != var8) {
                  ((dna) this).field_wb[var8].field_kb = ((dna) this).field_wb[var8].field_kb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((dna) this).field_sb * var4 / ((dna) this).field_xb.length;
            var6 = ((dna) this).field_sb * (var4 + 1) / ((dna) this).field_xb.length;
            ((dna) this).field_xb[var4].field_kb = var5;
            ((dna) this).field_xb[var4].field_rb = 0;
            ((dna) this).field_xb[var4].field_sb = var6 + -var5;
            ((dna) this).field_xb[var4].field_p = param2;
            var4++;
            continue L0;
          }
        }
    }

    static {
    }
}
