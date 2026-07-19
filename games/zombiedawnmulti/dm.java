/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends cj {
    boolean field_Pb;
    int field_bc;
    cj field_Ub;
    boolean field_Ob;
    long field_Kb;
    static String field_Xb;
    static int[] field_Ib;
    static int field_Qb;
    cj field_Hb;
    String field_Lb;
    int field_Mb;
    int field_Vb;
    boolean field_Nb;
    int field_Sb;
    static ri field_Wb;
    int field_Fb;
    String field_Jb;
    static cj field_ac;
    long field_ec;
    int field_Yb;
    cj field_cc;
    static int[] field_dc;
    cj field_Gb;
    cj field_Tb;
    static int field_Zb;
    static String field_Rb;

    final boolean a(byte param0, dm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_18_0 = false;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        boolean stackOut_17_0 = false;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_Ob) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            if (stackIn_3_0 == (this.field_Ob ? 1 : 0)) {
              stackOut_5_0 = this.field_Ob;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 < -53) {
                  break L2;
                } else {
                  this.field_Hb = (cj) null;
                  break L2;
                }
              }
              L3: {
                if (this.field_Pb) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = stackIn_12_0;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (param1.field_Pb) {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = stackIn_13_0;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              if (stackIn_15_0 != stackIn_15_1) {
                stackOut_17_0 = this.field_Pb;
                stackIn_18_0 = stackOut_17_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  if (this.field_Kb >= param1.field_Kb) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L5;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("dm.EA(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_22_0 != 0;
          }
        }
    }

    final boolean c(byte param0) {
        if (param0 != 15) {
            this.field_Gb = (cj) null;
        }
        return !this.c(0) ? true : false;
    }

    final static sj a(byte param0, ga param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        sj stackIn_2_0 = null;
        sj stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_3_0 = null;
        sj stackOut_1_0 = null;
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
            var2_int = param1.d((byte) 69);
            var3 = param1.d((byte) 69);
            var4 = param1.d((byte) 69);
            if (param0 >= 37) {
              var5 = param1.d((byte) 69);
              var6 = param1.i(-1478490344);
              var7 = param1.i(-1478490344);
              var8 = param1.g(31365);
              stackOut_3_0 = new sj(var2_int, var3, var4, var5, var6, var7, var8);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (sj) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("dm.AA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void h(int param0) {
        field_Rb = null;
        field_Ib = null;
        field_ac = null;
        field_dc = null;
        field_Wb = null;
        field_Xb = null;
        if (param0 != 0) {
            field_Xb = (String) null;
        }
    }

    dm(String param0, String param1, long param2) {
        super(0L, (cj) null);
        CharSequence var6 = null;
        String discarded$0 = null;
        try {
            this.field_Jb = param0;
            this.field_Lb = param1;
            this.field_ec = param2;
            var6 = (CharSequence) ((Object) this.field_Jb);
            discarded$0 = tg.a(var6, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        String discarded$0 = null;
        try {
            this.field_Jb = param0;
            this.field_Lb = param1;
            if (param2 != 43) {
                this.field_Kb = -111L;
            }
            var5 = (CharSequence) ((Object) this.field_Jb);
            discarded$0 = tg.a(var5, false);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "dm.BA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        int var5 = 0;
        field_Xb = "Similar rating";
        field_dc = new int[43];
        field_Ib = new int[43];
        double var0 = 0.0;
        double var2 = 0.5983986006837702;
        int var4 = 14;
        for (var5 = 0; var5 < 42; var5++) {
            field_dc[var5] = (int)(Math.sin(var0) * ((double)(var5 < var4 ? 2 : var5 >= 2 * var4 ? 8 : 4) * 20.0));
            field_Ib[var5] = (int)(20.0 * (double)(var4 <= var5 ? var5 >= var4 * 2 ? 8 : 4 : 2) * Math.cos(var0));
            var0 = var0 + var2;
        }
        field_dc[42] = 0;
        field_Ib[42] = 0;
        field_Rb = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
