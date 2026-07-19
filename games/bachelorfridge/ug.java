/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends pv {
    private int field_j;
    private int field_n;
    static wl field_q;
    private double field_p;
    static String field_m;
    static int[][] field_l;
    static String field_k;
    static kv field_o;

    final static Object a(boolean param0, byte[] param1, int param2) {
        gla var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_4_0 = null;
        gla stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gla stackOut_7_0 = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -19524) {
                break L1;
              } else {
                field_l = (int[][]) null;
                break L1;
              }
            }
            if (param1 != null) {
              if ((param1.length ^ -1) < -137) {
                var3 = new gla();
                ((nu) ((Object) var3)).a((byte) 43, param1);
                stackOut_7_0 = (gla) (var3);
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0) {
                  stackOut_12_0 = gs.a((byte) 119, param1);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_10_0 = (byte[]) (param1);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    private final void b(int param0) {
        if (param0 != 1) {
            field_o = (kv) null;
        }
    }

    private final int c(int param0) {
        if (param0 != -137) {
          field_k = (String) null;
          return Math.abs(this.field_j) * 100 / 56 >> 1841511937;
        } else {
          return Math.abs(this.field_j) * 100 / 56 >> 1841511937;
        }
    }

    private final int d(int param0) {
        if (param0 != -27656) {
          this.field_n = 102;
          return (int)((double)this.field_g * this.field_p) - -this.field_n;
        } else {
          return (int)((double)this.field_g * this.field_p) - -this.field_n;
        }
    }

    final boolean b(boolean param0) {
        int fieldTemp$1 = this.field_g + 1;
        this.field_g = this.field_g + 1;
        if (fieldTemp$1 <= this.c(-137)) {
          if (this.field_j != 0) {
            if (!param0) {
              L0: {
                field_k = (String) null;
                if (this.field_g == 1) {
                  this.field_f.field_u = this.field_f.field_u + this.field_j / 56;
                  this.field_f.field_v.a((byte) 13, this.field_f.field_g.field_o.field_b, 1);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_f.field_n = this.d(-27656);
              return false;
            } else {
              L1: {
                if (this.field_g == 1) {
                  this.field_f.field_u = this.field_f.field_u + this.field_j / 56;
                  this.field_f.field_v.a((byte) 13, this.field_f.field_g.field_o.field_b, 1);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_f.field_n = this.d(-27656);
              return false;
            }
          } else {
            this.b(1);
            return true;
          }
        } else {
          this.b(1);
          return true;
        }
    }

    ug(jfa param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          this.field_j = param1;
          this.field_f = param0;
          this.field_n = this.field_f.field_n;
          this.field_p = (double)this.field_j / (double)this.c(-137);
          if (0 <= this.field_j) {
            this.field_f.field_s = true;
            return;
          } else {
            this.field_f.field_s = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ug.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        field_l = (int[][]) null;
        field_m = null;
        if (param0 != 10) {
          field_k = (String) null;
          field_k = null;
          field_o = null;
          field_q = null;
          return;
        } else {
          field_k = null;
          field_o = null;
          field_q = null;
          return;
        }
    }

    static {
        field_m = "Passwords must be between 5 and 20 letters and numbers";
        field_k = "Please enter your age in years";
        field_l = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new int[]{0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0}, new int[]{0, 2, 2, 0, 1, 1, 1, 1, 0, 2, 2}, new int[]{0, 3, 3, 0, 3, 3, 1, 1, 0, 3, 2}, new int[]{0, 4, 4, 0, 2, 2, 1, 1, 0, 3, 4}};
    }
}
