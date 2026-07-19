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
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var10 = null;
        var7 = BachelorFridge.field_y;
        if (param1 == 0) {
          var3 = this.field_j.a(param0, -1);
          if (!this.field_j.field_m) {
            return var3;
          } else {
            var10 = this.a(0, param0, (byte) 107);
            var5 = 0;
            L0: while (true) {
              if (hh.field_d <= var5) {
                return var3;
              } else {
                var6 = var10[var5];
                if (var6 >= this.field_q) {
                  if (this.field_r < var6) {
                    var3[var5] = this.field_r;
                    var5++;
                    continue L0;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L0;
                  }
                } else {
                  var3[var5] = this.field_q;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          field_k = (String) null;
          var3 = this.field_j.a(param0, -1);
          if (this.field_j.field_m) {
            var8 = this.a(0, param0, (byte) 107);
            var4 = var8;
            var5 = 0;
            L1: while (true) {
              if (hh.field_d > var5) {
                var8 = var4;
                var6 = var8[var5];
                if (var6 >= this.field_q) {
                  if (this.field_r < var6) {
                    var3[var5] = this.field_r;
                    var5++;
                    continue L1;
                  } else {
                    var3[var5] = var6;
                    var5++;
                    continue L1;
                  }
                } else {
                  var3[var5] = this.field_q;
                  var5++;
                  continue L1;
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        field_m = null;
        field_k = null;
        if (param0 != 0) {
          field_o = (String[]) null;
          field_l = null;
          return;
        } else {
          field_l = null;
          return;
        }
    }

    final int[][] a(boolean param0, int param1) {
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
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[][] var41 = null;
        int[][] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        var15 = BachelorFridge.field_y;
        if (!param0) {
          var26 = this.field_h.a(param1, -858);
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (!this.field_h.field_b) {
            return var3;
          } else {
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
            var11 = 0;
            L0: while (true) {
              if (hh.field_d <= var11) {
                return var3;
              } else {
                L1: {
                  var12 = var43[var11];
                  var13 = var44[var11];
                  var14 = var45[var11];
                  if (var12 >= this.field_q) {
                    if (var12 <= this.field_r) {
                      var30[var11] = var12;
                      break L1;
                    } else {
                      var8[var11] = this.field_r;
                      break L1;
                    }
                  } else {
                    var8[var11] = this.field_q;
                    break L1;
                  }
                }
                L2: {
                  if (var13 < this.field_q) {
                    var9[var11] = this.field_q;
                    break L2;
                  } else {
                    if (this.field_r < var13) {
                      var9[var11] = this.field_r;
                      break L2;
                    } else {
                      var31[var11] = var13;
                      break L2;
                    }
                  }
                }
                if (var14 < this.field_q) {
                  var10[var11] = this.field_q;
                  var11++;
                  continue L0;
                } else {
                  if (this.field_r >= var14) {
                    var32[var11] = var14;
                    var11++;
                    continue L0;
                  } else {
                    var10[var11] = this.field_r;
                    var11++;
                    continue L0;
                  }
                }
              }
            }
          }
        } else {
          cd.d(91);
          var26 = this.field_h.a(param1, -858);
          var18 = var26;
          var16 = var18;
          var3 = var16;
          if (this.field_h.field_b) {
            var41 = this.a((byte) -104, 0, param1);
            var34 = var41[0];
            var27 = var34;
            var35 = var41[1];
            var28 = var35;
            var36 = var41[2];
            var29 = var36;
            var30 = var26[0];
            var22 = var30;
            var8 = var22;
            var31 = var26[1];
            var23 = var31;
            var9 = var23;
            var32 = var26[2];
            var24 = var32;
            var10 = var24;
            var11 = 0;
            L3: while (true) {
              if (hh.field_d > var11) {
                L4: {
                  var12 = var34[var11];
                  var13 = var35[var11];
                  var14 = var36[var11];
                  if (var12 >= this.field_q) {
                    if (var12 <= this.field_r) {
                      var30[var11] = var12;
                      break L4;
                    } else {
                      var8[var11] = this.field_r;
                      break L4;
                    }
                  } else {
                    var8[var11] = this.field_q;
                    break L4;
                  }
                }
                L5: {
                  if (var13 < this.field_q) {
                    var9[var11] = this.field_q;
                    break L5;
                  } else {
                    if (this.field_r < var13) {
                      var9[var11] = this.field_r;
                      break L5;
                    } else {
                      var31[var11] = var13;
                      break L5;
                    }
                  }
                }
                if (var14 < this.field_q) {
                  var10[var11] = this.field_q;
                  var11++;
                  continue L3;
                } else {
                  if (this.field_r >= var14) {
                    var32[var11] = var14;
                    var11++;
                    continue L3;
                  } else {
                    var10[var11] = this.field_r;
                    var11++;
                    continue L3;
                  }
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if ((var4_int ^ -1) == -2) {
                  this.field_r = param1.e((byte) 93);
                  break L1;
                } else {
                  if (2 == var4_int) {
                    L2: {
                      stackOut_8_0 = this;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if ((param1.b(16711935) ^ -1) != -2) {
                        stackOut_10_0 = this;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    ((cd) (this)).field_f = stackIn_11_1 != 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                this.field_q = param1.e((byte) 79);
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                field_k = (String) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("cd.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
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
