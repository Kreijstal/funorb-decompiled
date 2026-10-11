/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends k {
    static String field_m;
    private int field_q;
    private int field_r;
    static String field_k;
    static sna field_n;
    static String field_p;
    static String field_l;
    static String[] field_o;

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var10;
        int var5Lifetime1;
        int var6Lifetime1;
        int[] var3Lifetime1;
        int[] var8Lifetime1;
        var7 = BachelorFridge.field_y;
        if (param1 == 0) {
          var3 = this.field_j.a(param0, -1);
          if (!this.field_j.field_m) {
            return var3;
          }
          var10 = this.a(0, param0, (byte) 107);
          for (var5 = 0; hh.field_d > var5; var5++) {
            var6 = var10[var5];
            if (var6 >= this.field_q) {
              if (this.field_r < var6) {
                var3[var5] = this.field_r;
              } else {
                var3[var5] = var6;
              }
            } else {
              var3[var5] = this.field_q;
            }
          }
          return var3;
        }
        field_k = (String) null;
        var3Lifetime1 = this.field_j.a(param0, -1);
        if (!this.field_j.field_m) {
          return var3Lifetime1;
        }
        var8 = this.a(0, param0, (byte) 107);
        var4 = var8;
        for (var5Lifetime1 = 0; hh.field_d > var5Lifetime1; var5Lifetime1++) {
          var8Lifetime1 = var4;
          var6Lifetime1 = var8Lifetime1[var5Lifetime1];
          if (var6Lifetime1 >= this.field_q) {
            if (this.field_r < var6Lifetime1) {
              var3Lifetime1[var5Lifetime1] = this.field_r;
            } else {
              var3Lifetime1[var5Lifetime1] = var6Lifetime1;
            }
          } else {
            var3Lifetime1[var5Lifetime1] = this.field_q;
          }
        }
        return var3Lifetime1;
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        field_m = null;
        field_k = null;
        if (param0 == 0) {
          field_l = null;
          return;
        }
        field_o = (String[]) null;
        field_l = null;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        int[] var27;
        int[] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        int[] var32;
        int[] var34;
        int[] var35;
        int[] var36;
        int[][] var41;
        int[][] var42;
        int[] var43;
        int[] var44;
        int[] var45;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int[][] var3Lifetime1;
        int[] var8Lifetime1;
        int[] var9Lifetime1;
        int[] var10Lifetime1;
        int[][] var16Lifetime1;
        int[][] var18Lifetime1;
        int[] var22Lifetime1;
        int[] var23Lifetime1;
        int[] var24Lifetime1;
        int[][] var26Lifetime1;
        int[] var30Lifetime1;
        int[] var31Lifetime1;
        int[] var32Lifetime1;
        var15 = BachelorFridge.field_y;
        if (!param0) {
          var26 = this.field_h.a(param1, -858);
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (!this.field_h.field_b) {
            return var3;
          }
          var42 = this.a((byte) -104, 0, param1);
          var43 = var42[0];
          var44 = var42[1];
          var45 = var42[2];
          var30 = var26[0];
          var22 = var30;
          var8 = var22;
          var31 = var26[1];
          var23 = var31;
          var9 = var23;
          var32 = var26[2];
          var24 = var32;
          var10 = var24;
          for (var11 = 0; hh.field_d > var11; var11++) {
            var12 = var43[var11];
            var13 = var44[var11];
            var14 = var45[var11];
            if (var12 >= this.field_q) {
              if (var12 <= this.field_r) {
                var30[var11] = var12;
              } else {
                var8[var11] = this.field_r;
              }
            } else {
              var8[var11] = this.field_q;
            }
            if (var13 < this.field_q) {
              var9[var11] = this.field_q;
            } else {
              if (this.field_r < var13) {
                var9[var11] = this.field_r;
              } else {
                var31[var11] = var13;
              }
            }
            if (var14 < this.field_q) {
              var10[var11] = this.field_q;
            } else {
              if (this.field_r >= var14) {
                var32[var11] = var14;
              } else {
                var10[var11] = this.field_r;
              }
            }
          }
          return var3;
        }
        cd.d(91);
        var26Lifetime1 = this.field_h.a(param1, -858);
        var18Lifetime1 = var26Lifetime1;
        var16Lifetime1 = var18Lifetime1;
        var3Lifetime1 = var16Lifetime1;
        if (!this.field_h.field_b) {
          return var3Lifetime1;
        }
        var41 = this.a((byte) -104, 0, param1);
        var34 = var41[0];
        var27 = var34;
        var35 = var41[1];
        var28 = var35;
        var36 = var41[2];
        var29 = var36;
        var30Lifetime1 = var26Lifetime1[0];
        var22Lifetime1 = var30Lifetime1;
        var8Lifetime1 = var22Lifetime1;
        var31Lifetime1 = var26Lifetime1[1];
        var23Lifetime1 = var31Lifetime1;
        var9Lifetime1 = var23Lifetime1;
        var32Lifetime1 = var26Lifetime1[2];
        var24Lifetime1 = var32Lifetime1;
        var10Lifetime1 = var24Lifetime1;
        for (var11Lifetime1 = 0; hh.field_d > var11Lifetime1; var11Lifetime1++) {
          var12Lifetime1 = var34[var11Lifetime1];
          var13Lifetime1 = var35[var11Lifetime1];
          var14Lifetime1 = var36[var11Lifetime1];
          if (var12Lifetime1 >= this.field_q) {
            if (var12Lifetime1 <= this.field_r) {
              var30Lifetime1[var11Lifetime1] = var12Lifetime1;
            } else {
              var8Lifetime1[var11Lifetime1] = this.field_r;
            }
          } else {
            var8Lifetime1[var11Lifetime1] = this.field_q;
          }
          if (var13Lifetime1 < this.field_q) {
            var9Lifetime1[var11Lifetime1] = this.field_q;
          } else {
            if (this.field_r < var13Lifetime1) {
              var9Lifetime1[var11Lifetime1] = this.field_r;
            } else {
              var31Lifetime1[var11Lifetime1] = var13Lifetime1;
            }
          }
          if (var14Lifetime1 < this.field_q) {
            var10Lifetime1[var11Lifetime1] = this.field_q;
          } else {
            if (this.field_r >= var14Lifetime1) {
              var32Lifetime1[var11Lifetime1] = var14Lifetime1;
            } else {
              var10Lifetime1[var11Lifetime1] = this.field_r;
            }
          }
        }
        return var3Lifetime1;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (0 != var4_int) {
            if (var4_int == 1) {
              this.field_r = param1.e((byte) 93);
            } else {
              if (2 == var4_int) {
                stackIn_11_1 = (param1.b(16711935) == 1);
                this.field_f = stackIn_11_1;
              }
            }
          } else {
            this.field_q = param1.e((byte) 79);
          }
          if (param0 != -71) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public cd() {
        super(1, false);
        this.field_r = 4096;
        this.field_q = 0;
    }

    static {
        field_p = "Remove friend";
        field_k = "Cancel draw";
        field_o = new String[]{"Annihilation", "Take the Grub", "Capture the Fly"};
        field_m = "Invite only";
        field_l = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
