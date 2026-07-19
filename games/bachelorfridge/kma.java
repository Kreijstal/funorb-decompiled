/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kma extends k {
    static String field_p;
    static String field_m;
    private int field_k;
    private int[] field_n;
    private int field_l;
    static eaa field_o;
    private int field_q;

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
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
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                this.field_l = param1.e((byte) 60);
                break L1;
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                field_o = (eaa) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("kma.E(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
        int incrementValue$3 = 0;
        int discarded$4 = 0;
        int incrementValue$5 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var11 = BachelorFridge.field_y;
        if (!param0) {
          var14 = this.field_h.a(param1, -858);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_h.field_b) {
            L0: {
              stackOut_20_0 = this.field_k;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (this.field_q == bi.field_g) {
                stackOut_22_0 = stackIn_22_0;
                stackOut_22_1 = param1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L0;
              } else {
                stackOut_21_0 = stackIn_21_0;
                stackOut_21_1 = this.field_q * param1 / bi.field_g;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L0;
              }
            }
            var4 = stackIn_23_0 * stackIn_23_1;
            var5 = var14[0];
            var6 = var14[1];
            var7 = var14[2];
            if (hh.field_d == this.field_k) {
              var8 = 0;
              L1: while (true) {
                if (hh.field_d > var8) {
                  incrementValue$3 = var4;
                  var4++;
                  var9 = this.field_n[incrementValue$3];
                  var7[var8] = dda.a(4080, var9 << 442831940);
                  var6[var8] = dda.a(var9, 65280) >> 330292804;
                  var5[var8] = dda.a(4080, var9 >> -16962676);
                  var8++;
                  continue L1;
                } else {
                  return var3;
                }
              }
            } else {
              var8 = 0;
              L2: while (true) {
                if (hh.field_d > var8) {
                  var9 = this.field_k * var8 / hh.field_d;
                  var10 = this.field_n[var4 - -var9];
                  var7[var8] = dda.a(4080, var10 << -1404954812);
                  var6[var8] = dda.a(var10, 65280) >> 787189476;
                  var5[var8] = dda.a(4080, var10 >> -2082261940);
                  var8++;
                  continue L2;
                } else {
                  return var3;
                }
              }
            }
          } else {
            return var3;
          }
        } else {
          discarded$4 = this.c((byte) 116);
          var14 = this.field_h.a(param1, -858);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_h.field_b) {
            L3: {
              stackOut_4_0 = this.field_k;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (this.field_q == bi.field_g) {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = param1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = this.field_q * param1 / bi.field_g;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            var4 = stackIn_7_0 * stackIn_7_1;
            var5 = var14[0];
            var6 = var14[1];
            var7 = var14[2];
            if (hh.field_d != this.field_k) {
              var8 = 0;
              L4: while (true) {
                if (hh.field_d > var8) {
                  var9 = this.field_k * var8 / hh.field_d;
                  var10 = this.field_n[var4 - -var9];
                  var7[var8] = dda.a(4080, var10 << -1404954812);
                  var6[var8] = dda.a(var10, 65280) >> 787189476;
                  var5[var8] = dda.a(4080, var10 >> -2082261940);
                  var8++;
                  continue L4;
                } else {
                  return var3;
                }
              }
            } else {
              var8 = 0;
              L5: while (true) {
                if (hh.field_d <= var8) {
                  return var3;
                } else {
                  incrementValue$5 = var4;
                  var4++;
                  var9 = this.field_n[incrementValue$5];
                  var7[var8] = dda.a(4080, var9 << 442831940);
                  var6[var8] = dda.a(var9, 65280) >> 330292804;
                  var5[var8] = dda.a(4080, var9 >> -16962676);
                  var8++;
                  continue L5;
                }
              }
            }
          } else {
            return var3;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 <= -9) {
          super.a(param0, (byte) -95, param2);
          if (this.field_l >= 0) {
            if (da.field_c == null) {
              return;
            } else {
              L0: {
                if (da.field_c.c(this.field_l, 0).field_d) {
                  stackOut_7_0 = 64;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 128;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              var4 = stackIn_8_0;
              this.field_n = da.field_c.a(0, false, var4, 1.0f, this.field_l, var4);
              this.field_q = var4;
              this.field_k = var4;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public kma() {
        super(0, false);
        this.field_l = -1;
    }

    final int c(byte param0) {
        if (param0 <= 35) {
            kma.d(-92);
            return this.field_l;
        }
        return this.field_l;
    }

    final void b(int param0) {
        super.b(param0);
        this.field_n = null;
    }

    final static void d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            ng.field_f = new js(32);
            if (param0 <= -93) {
              var1_int = 0;
              L1: while (true) {
                if (fj.field_m.length <= var1_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ng.field_f.a((long)fj.field_m[var1_int].toLowerCase().hashCode(), (byte) -114, new ji(var1_int));
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "kma.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void e(int param0) {
        if (param0 != -1) {
          field_p = (String) null;
          field_p = null;
          field_m = null;
          field_o = null;
          return;
        } else {
          field_p = null;
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        field_p = "Enter name of player to delete from list";
        field_m = "All";
        field_o = new eaa();
    }
}
