/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lfa extends le {
    static int field_m;
    private int field_l;
    static boolean field_j;
    private int field_i;
    private int field_k;

    public lfa() {
        super(1, false);
        this.field_l = 4096;
        this.field_i = 4096;
        this.field_k = 4096;
    }

    final static void a(byte param0, boolean param1) {
        if (wga.field_a != null) {
          if (wga.field_a.a(param1, false)) {
            wga.field_a = null;
            if (param0 != 34) {
              field_j = true;
              return;
            } else {
              return;
            }
          } else {
            if (param0 != 34) {
              field_j = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 34) {
            field_j = true;
            return;
          } else {
            return;
          }
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[][] var16 = null;
        int[][] var18 = null;
        int[][] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[][] var35 = null;
        int[][] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        var15 = VoidHunters.field_G;
        if (param0 == 255) {
          var23 = this.field_d.a(param1, (byte) -92);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (!this.field_d.field_g) {
            return var3;
          } else {
            var36 = this.a((byte) 95, 0, param1);
            var37 = var36[0];
            var39 = var36[1];
            var38 = var36[2];
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L0: while (true) {
              if (hob.field_d <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var37[var11];
                  var13 = var38[var11];
                  var14 = var39[var11];
                  if (var12 != var13) {
                    break L1;
                  } else {
                    if (var13 != var14) {
                      break L1;
                    } else {
                      var8[var11] = this.field_i * var12 >> -417571412;
                      var9[var11] = this.field_l * var13 >> 541060844;
                      var10[var11] = var14 * this.field_k >> -210004884;
                      var11++;
                      continue L0;
                    }
                  }
                }
                var8[var11] = this.field_i;
                var9[var11] = this.field_l;
                var10[var11] = this.field_k;
                var11++;
                continue L0;
              }
            }
          }
        } else {
          field_j = true;
          var23 = this.field_d.a(param1, (byte) -92);
          var18 = var23;
          var16 = var18;
          var3 = var16;
          if (this.field_d.field_g) {
            var35 = this.a((byte) 95, 0, param1);
            var28 = var35[0];
            var24 = var28;
            var30 = var35[1];
            var26 = var30;
            var29 = var35[2];
            var25 = var29;
            var8 = var23[0];
            var9 = var23[1];
            var10 = var23[2];
            var11 = 0;
            L2: while (true) {
              if (hob.field_d > var11) {
                L3: {
                  var12 = var28[var11];
                  var13 = var29[var11];
                  var14 = var30[var11];
                  if (var12 != var13) {
                    break L3;
                  } else {
                    if (var13 != var14) {
                      break L3;
                    } else {
                      var8[var11] = this.field_i * var12 >> -417571412;
                      var9[var11] = this.field_l * var13 >> 541060844;
                      var10[var11] = var14 * this.field_k >> -210004884;
                      var11++;
                      continue L2;
                    }
                  }
                }
                var8[var11] = this.field_i;
                var9[var11] = this.field_l;
                var10[var11] = this.field_k;
                var11++;
                continue L2;
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 <= -60) {
              break L0;
            } else {
              this.field_l = 58;
              break L0;
            }
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_i = param2.e(1869);
            return;
          } else {
            if (var4_int == 1) {
              this.field_l = param2.e(1869);
              return;
            } else {
              if (var4_int == 2) {
                this.field_k = param2.e(1869);
                return;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("lfa.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_j = true;
    }
}
