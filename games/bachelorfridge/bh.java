/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh extends k {
    private short[] field_k;
    static kv field_r;
    private int field_q;
    private int field_n;
    static String field_s;
    private int field_u;
    private int field_l;
    private byte[] field_t;
    static String field_p;
    private int field_o;
    private int field_m;

    public static void e(byte param0) {
        if (param0 > -78) {
          field_r = (kv) null;
        }
        field_r = null;
        field_p = null;
        field_s = null;
    }

    public bh() {
        super(0, true);
        this.field_q = 5;
        this.field_t = new byte[512];
        this.field_n = 1;
        this.field_o = 0;
        this.field_m = 2048;
        this.field_k = new short[512];
        this.field_u = 5;
        this.field_l = 2;
    }

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (param0) {
          return;
        }
        Random var5 = new Random((long)this.field_o);
        Random var2 = var5;
        this.field_k = new short[512];
        if (0 < this.field_m) {
          for (var3 = 0; var3 < 512; var3++) {
            this.field_k[var3] = (short)kla.a(this.field_m, var5, -2147483648);
          }
        }
    }

    final int[] a(int param0, int param1) {
        int var14 = 0;
        int var8 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_11_3;
        int stackIn_15_0;
        byte[] stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_16_4 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        double stackIn_40_0 = 0.0;
        int stackIn_41_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var18Lifetime1;
        var19 = BachelorFridge.field_y;
        var3 = this.field_j.a(param0, -1);
        if (param1 != 0) {
          this.b(false);
        }
        if (this.field_j.field_m) {
          var4 = tj.field_f[param0] * this.field_q + 2048;
          var5 = var4 >> 12;
          var6 = var5 + 1;
          for (var14 = 0; hh.field_d > var14; var14++) {
            dca.field_v = 2147483647;
            um.field_a = 2147483647;
            sma.field_C = 2147483647;
            iia.field_p = 2147483647;
            var15 = 2048 + this.field_u * jq.field_k[var14];
            var16 = var15 >> 12;
            var17 = 1 + var16;
            for (var8 = var5 - 1; var6 >= var8; var8++) {
              stackIn_10_0 = 255;
              stackIn_10_1 = this.field_t;
              stackIn_10_2 = 255;
              if (this.field_q > var8) {
                stackIn_11_3 = var8;
              } else {
                stackIn_11_3 = var8 - this.field_q;
              }
              var12 = stackIn_10_0 & stackIn_10_1[stackIn_10_2 & stackIn_11_3];
              for (var7 = var16 - 1; var17 >= var7; var7++) {
                stackIn_15_0 = 2;
                stackIn_15_1 = this.field_t;
                stackIn_15_2 = 255;
                stackIn_15_3 = var12;
                if (this.field_u <= var7) {
                  stackIn_16_4 = var7 - this.field_u;
                } else {
                  stackIn_16_4 = var7;
                }
                var13 = stackIn_15_0 * (stackIn_15_1[stackIn_15_2 & stackIn_15_3 + stackIn_16_4] & 255);
                incrementValue$0 = var13;
                var13++;
                var9 = -this.field_k[incrementValue$0] - (var7 << 12) + var15;
                var10 = var4 - (this.field_k[var13] + (var8 << 12));
                var18 = this.field_n;
                if (var18 != 1) {
                  if (var18 == 3) {
                    if (var9 >= 0) {
                      stackIn_28_0 = var9;
                    } else {
                      stackIn_28_0 = -var9;
                    }
                    var9 = stackIn_28_0;
                    if (0 <= var10) {
                      stackIn_31_0 = var10;
                    } else {
                      stackIn_31_0 = -var10;
                    }
                    var10 = stackIn_31_0;
                    stackIn_34_0 = (var9 > var10) ? var9 : var10;
                    var11 = stackIn_34_0;
                  } else {
                    if (var18 != 4) {
                      if (var18 == 5) {
                        var10 = var10 * var10;
                        var9 = var9 * var9;
                        var11 = (int)(4096.0 * Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))));
                      } else {
                        if (var18 != 2) {
                          var11 = (int)(Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)) * 4096.0);
                        } else {
                          if (0 <= var9) {
                            stackIn_46_0 = var9;
                          } else {
                            stackIn_46_0 = -var9;
                          }
                          if (var10 < 0) {
                            stackIn_49_1 = -var10;
                          } else {
                            stackIn_49_1 = var10;
                          }
                          var11 = stackIn_46_0 + stackIn_49_1;
                        }
                      }
                    } else {
                      if (var9 >= 0) {
                        stackIn_38_0 = var9;
                      } else {
                        stackIn_38_0 = -var9;
                      }
                      var9 = (int)(Math.sqrt((double)((float)stackIn_38_0 / 4096.0f)) * 4096.0);
                      stackIn_40_0 = 4096.0;
                      if (0 > var10) {
                        stackIn_41_1 = -var10;
                      } else {
                        stackIn_41_1 = var10;
                      }
                      var10 = (int)(stackIn_40_0 * Math.sqrt((double)((float)stackIn_41_1 / 4096.0f)));
                      var11 = var10 + var9;
                      var11 = var11 * var11 >> 12;
                    }
                  }
                } else {
                  var11 = var10 * var10 + var9 * var9 >> 12;
                }
                if (var11 >= iia.field_p) {
                  if (dca.field_v > var11) {
                    um.field_a = sma.field_C;
                    sma.field_C = dca.field_v;
                    dca.field_v = var11;
                  } else {
                    if (var11 < sma.field_C) {
                      um.field_a = sma.field_C;
                      sma.field_C = var11;
                    } else {
                      if (var11 < um.field_a) {
                        um.field_a = var11;
                      }
                    }
                  }
                } else {
                  um.field_a = sma.field_C;
                  sma.field_C = dca.field_v;
                  dca.field_v = iia.field_p;
                  iia.field_p = var11;
                }
              }
            }
            var18Lifetime1 = this.field_l;
            if (var18Lifetime1 != 0) {
              if (var18Lifetime1 != 1) {
                if (var18Lifetime1 == 3) {
                  var3[var14] = sma.field_C;
                } else {
                  if (var18Lifetime1 == 4) {
                    var3[var14] = um.field_a;
                  } else {
                    if (2 == var18Lifetime1) {
                      var3[var14] = -iia.field_p + dca.field_v;
                    }
                  }
                }
              } else {
                var3[var14] = dca.field_v;
              }
            } else {
              var3[var14] = iia.field_p;
            }
          }
        }
        return var3;
    }

    final void a(byte param0, lu param1, int param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            this.field_k = (short[]) null;
          }
          var4_int = param2;
          if (0 == var4_int) {
            dupTemp$0 = param1.b(param0 + 16712006);
            this.field_q = dupTemp$0;
            this.field_u = dupTemp$0;
          } else {
            if (1 == var4_int) {
              this.field_o = param1.b(16711935);
            } else {
              if (var4_int == 2) {
                this.field_m = param1.e((byte) 112);
              } else {
                if (var4_int == 3) {
                  this.field_l = param1.b(16711935);
                } else {
                  if (4 == var4_int) {
                    this.field_n = param1.b(16711935);
                  } else {
                    if (var4_int != 5) {
                      if (var4_int == 6) {
                        this.field_q = param1.b(16711935);
                      }
                    } else {
                      this.field_u = param1.b(param0 + 16712006);
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("bh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    final void d(byte param0) {
        this.field_t = rba.a(this.field_o, -96);
        this.b(false);
        if (param0 != -68) {
          lu var3 = (lu) null;
          this.a((byte) 95, (lu) null, -98);
        }
    }

    static {
        field_p = "START";
        field_s = "<%0> has not yet unlocked this option for use.";
    }
}
