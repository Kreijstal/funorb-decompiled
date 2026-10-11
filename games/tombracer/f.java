/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class f {
    static int[] field_c;
    static BitSet field_e;
    static int field_b;
    private cva[] field_d;
    private csa[] field_f;
    private int field_a;

    final void a(csa param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        cva var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == this.field_d) {
            return;
          }
          this.field_f = new csa[this.field_d.length];
          if (param1) {
            return;
          }
          var3_int = 0;
          while (var3_int < this.field_d.length) {
            var4 = this.field_d[var3_int];
            this.field_f[var3_int] = param0.a(var4.field_d, var4.field_a, 20);
            var3_int++;
            if (var5 != 0) {
              return;
            }
          }
          this.field_d = null;
          this.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("f.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3_int = 0;
        int var5 = 0;
        csa[] var3 = null;
        int var4 = 0;
        int var2Lifetime1;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = param0;
        while (this.field_f.length > var3_int) {
          if (null == this.field_f[var3_int]) {
            this.field_f[var3_int] = null;
            var2++;
          } else {
            if (!this.field_f[var3_int].k((byte) -115)) {
              this.field_f[var3_int] = null;
              var2++;
            }
          }
          var3_int++;
          if (var5 == 0) {
            continue;
          }
          break;
        }
        var3 = new csa[-var2 + this.field_f.length];
        var2Lifetime1 = 0;
        var4 = 0;
        while (this.field_f.length > var4) {
          if (var5 == 0) {
            if (this.field_f[var4] != null) {
              var3[var2Lifetime1] = this.field_f[var4];
              var2Lifetime1++;
            }
            var4++;
            continue;
          }
          break;
        }
        this.field_f = var3;
        return;
    }

    final lj[] a(byte param0) {
        csa[] stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        csa[] stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        csa[] stackOut_5_0;
        csa[] stackOut_21_0;
        int var2 = 0;
        int var3_int = 0;
        lj[] var3 = null;
        csa var4_ref_csa = null;
        int var4 = 0;
        lj var5 = null;
        csa var5_ref = null;
        lj var6 = null;
        int var7 = 0;
        lj[] var3Lifetime1;
        int var4Lifetime1;
        int var2Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3_int = 0;
        while (this.field_f.length > var3_int) {
          var4_ref_csa = this.field_f[var3_int];
          if (var7 != 0) {
            var3 = new lj[var2];
            var2 = 0;
            var4 = 0;
            while (true) {
              if (this.field_f.length > var4) {
                stackOut_5_0 = this.field_f;
                stackIn_11_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
              } else {
                stackIn_11_0 = var3;
              }
              return (lj[]) (stackIn_11_0);
            }
          }
          if (var4_ref_csa != null) {
            var5 = var4_ref_csa.u(-91);
            if (var5 != null ||
              var7 != 0) {
              var2++;
            }
          }
          var3_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        if (param0 != -103) {
          return (lj[]) null;
        }
        var3Lifetime1 = new lj[var2];
        var2Lifetime1 = 0;
        var4Lifetime1 = 0;
        while (true) {
          if (this.field_f.length <= var4Lifetime1) {
            stackIn_27_0 = var3Lifetime1;
            break;
          }
          stackOut_21_0 = this.field_f;
          stackIn_27_0 = stackOut_21_0;
          stackIn_22_0 = stackOut_21_0;
          if (var7 == 0) {
            var5_ref = stackIn_22_0[var4Lifetime1];
            if (var5_ref != null) {
              var6 = var5_ref.u(param0 - 24);
              if (var6 != null) {
                var3Lifetime1[var2Lifetime1] = var6;
                var2Lifetime1++;
              }
            }
            var4Lifetime1++;
            continue;
          }
          break;
        }
        return (lj[]) (stackIn_27_0);
    }

    final static String a(int param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$103 = null;
        StringBuilder discarded$104 = null;
        StringBuilder discarded$105 = null;
        StringBuilder discarded$106 = null;
        StringBuilder discarded$107 = null;
        StringBuilder discarded$108 = null;
        StringBuilder discarded$85 = null;
        StringBuilder discarded$86 = null;
        StringBuilder discarded$87 = null;
        StringBuilder discarded$88 = null;
        StringBuilder discarded$89 = null;
        StringBuilder discarded$90 = null;
        StringBuilder discarded$91 = null;
        StringBuilder discarded$92 = null;
        StringBuilder discarded$99 = null;
        StringBuilder discarded$100 = null;
        StringBuilder discarded$101 = null;
        StringBuilder discarded$102 = null;
        StringBuilder discarded$96 = null;
        StringBuilder discarded$97 = null;
        StringBuilder discarded$98 = null;
        StringBuilder discarded$93 = null;
        StringBuilder discarded$94 = null;
        StringBuilder discarded$95 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        var6 = 44;
        var7 = 46;
        if (0 == param2) {
          var6 = 46;
          var7 = 44;
        }
        if (param2 == 2) {
          var7 = 160;
        }
        var8 = 0;
        if (param3 < 0L) {
          var8 = 1;
          param3 = -param3;
        }
        var9 = new StringBuilder(26);
        if (param4 <= 0) {
          if (param0 == 2843) {
            var10 = 0;
            L31: while (true) {
              var11 = (int)param3;
              param3 = param3 / 10L;
              discarded$103 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
              if (param3 == 0L) {
                if (var12 == 0) {
                  break L31;
                }
              } else {
                if (param1) {
                  var10++;
                  if (0 == var10 % 3) {
                    discarded$104 = var9.append((char) var7);
                  }
                }
              }
              if (var12 == 0) {
                continue;
              }
              break;
            }
            if (var8 != 0) {
              discarded$105 = var9.append('-');
            }
            return var9.reverse().toString();
          }
          f.a(true);
          var10 = 0;
          L36: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$106 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
            if (param3 == 0L) {
              if (var12 == 0) {
                break L36;
              }
            } else {
              if (param1) {
                var10++;
                if (0 == var10 % 3) {
                  discarded$107 = var9.append((char) var7);
                }
              }
            }
            if (var12 == 0) {
              continue;
            }
            break;
          }
          if (var8 != 0) {
            discarded$108 = var9.append('-');
          }
          return var9.reverse().toString();
        }
        var10 = 0;
        do {
          if (param4 <= var10) {
            discarded$85 = var9.append((char) var6);
            if (param0 == 2843) {
              var10 = 0;
              L5: while (true) {
                var11 = (int)param3;
                param3 = param3 / 10L;
                discarded$86 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
                if (param3 == 0L) {
                  if (var12 == 0) {
                    break L5;
                  }
                } else {
                  if (param1) {
                    var10++;
                    if (0 == var10 % 3) {
                      discarded$87 = var9.append((char) var7);
                    }
                  }
                }
                if (var12 == 0) {
                  continue;
                }
                break;
              }
              if (var8 != 0) {
                discarded$88 = var9.append('-');
              }
              return var9.reverse().toString();
            }
            f.a(true);
            var10 = 0;
            L10: while (true) {
              var11 = (int)param3;
              param3 = param3 / 10L;
              discarded$89 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
              if (param3 == 0L) {
                if (var12 == 0) {
                  break L10;
                }
              } else {
                if (param1) {
                  var10++;
                  if (0 == var10 % 3) {
                    discarded$90 = var9.append((char) var7);
                  }
                }
              }
              if (var12 == 0) {
                continue;
              }
              break;
            }
            if (var8 != 0) {
              discarded$91 = var9.append('-');
            }
            return var9.reverse().toString();
          }
          var11 = (int)param3;
          param3 = param3 / 10L;
          discarded$92 = var9.append((char)(-((int)param3 * 10) + var11 + 48));
          var10++;
        } while (var12 == 0);
        if (param0 == 2843) {
          var10 = 0;
          while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$96 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
            if (param3 != 0L &&
              param1) {
              var10++;
              if (0 == var10 % 3) {
                discarded$97 = var9.append((char) var7);
              }
            }
            if (var8 != 0) {
              discarded$98 = var9.append('-');
            }
            return var9.reverse().toString();
          }
        }
        f.a(true);
        var10 = 0;
        while (true) {
          var11 = (int)param3;
          param3 = param3 / 10L;
          discarded$93 = var9.append((char)(-(10 * (int)param3) + (var11 + 48)));
          if (param3 != 0L &&
            param1) {
            var10++;
            if (0 == var10 % 3) {
              discarded$94 = var9.append((char) var7);
            }
          }
          if (var8 != 0) {
            discarded$95 = var9.append('-');
          }
          return var9.reverse().toString();
        }
    }

    final static void b(int param0) {
        vo.field_b = false;
        if (kga.field_n != null) {
          kga.field_n.a(true);
        }
        int var1 = -18 % ((-10 - param0) / 43);
        if (bta.field_q != 0) {
          ufa.a(true);
        }
        wv.field_j = 0;
    }

    final static void b(byte param0) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_26_0Lifetime1;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (null == bt.field_h) {
            bt.field_h = new int[65536];
            if (var23 == 0) {
              var1_double = Math.random() * 0.03 - 0.015 + 0.7;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                stackIn_6_0 = -513;
                stackIn_6_1 = ~var4;
                if (stackIn_6_0 < stackIn_6_1) {
                  var5 = 360.0f * ((float)(var4 >> 3) / 64.0f + 0.0078125f);
                  var6 = 0.0625f + (float)(7 & var4) / 8.0f;
                  stackIn_26_0 = 0;
                  var7 = stackIn_26_0;
                  while (var7 < 128) {
                    var8 = (float)var7 / 128.0f;
                    var9 = 0.0f;
                    var10 = 0.0f;
                    var11 = 0.0f;
                    var12 = var5 / 60.0f;
                    var13 = (int)var12;
                    var14 = var13 % 6;
                    var15 = var12 - (float)var13;
                    var16 = (-var6 + 1.0f) * var8;
                    var17 = var8 * (1.0f - var15 * var6);
                    var18 = var8 * (-(var6 * (1.0f - var15)) + 1.0f);
                    stackIn_6_0 = 0;
                    stackIn_6_1 = var14;
                    if (stackIn_6_0 == stackIn_6_1) {
                      var9 = var8;
                      var11 = var16;
                      var10 = var18;
                    } else if (var14 != 1) {
                      if (var14 != 2) {
                        if (var14 != 3) {
                          if (var14 != 4) {
                            if (var14 == 5) {
                              var11 = var17;
                              var9 = var8;
                              var10 = var16;
                            }
                          } else {
                            var11 = var8;
                            var9 = var18;
                            var10 = var16;
                          }
                        } else {
                          var10 = var17;
                          var11 = var8;
                          var9 = var16;
                        }
                      } else {
                        var9 = var16;
                        var11 = var18;
                        var10 = var8;
                      }
                    } else {
                      var9 = var17;
                      var10 = var8;
                      var11 = var16;
                    }
                    var9 = (float)Math.pow((double)var9, var1_double);
                    var10 = (float)Math.pow((double)var10, var1_double);
                    var11 = (float)Math.pow((double)var11, var1_double);
                    var19 = (int)(256.0f * var9);
                    var20 = (int)(256.0f * var10);
                    var21 = (int)(var11 * 256.0f);
                    var22 = var21 + ((var19 << 16) - 16777216) + (var20 << 8);
                    incrementValue$0 = var3;
                    var3++;
                    bt.field_h[incrementValue$0] = var22;
                    var7++;
                  }
                  var4++;
                  continue L1;
                }
                break;
              }
              stackIn_26_0Lifetime1 = param0;
              if (stackIn_26_0Lifetime1 != 58) {
                f.b((byte) 1);
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "f.F(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 24641) {
          field_b = -112;
        }
    }

    final static int a(boolean param0) {
        if (param0) {
          f.b((byte) -68);
          if (!lca.a(param0)) {
            return -1;
          }
          if (null != wu.field_a.a((byte) 127)) {
            return wu.field_a.a((byte) -73).field_i;
          }
          return -1;
        }
        if (!lca.a(param0)) {
          return -1;
        }
        if (null != wu.field_a.a((byte) 127)) {
          return wu.field_a.a((byte) -73).field_i;
        }
        return -1;
    }

    f(int param0, int param1) {
        this.field_a = param0;
        this.field_f = new csa[]{};
    }

    f(int param0, int param1, int param2, kh param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        cva[] stackIn_7_0;
        int stackIn_7_1;
        cva stackIn_7_2;
        cva stackIn_7_3;
        cva stackIn_8_2 = null;
        cva stackIn_8_3 = null;
        boolean stackIn_8_4 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_a = param0;
          var5_int = param3.b((byte) 44, iia.d(param0, 22972));
          this.field_f = new csa[var5_int];
          this.field_d = new cva[var5_int];
          var6 = 0;
          while (var6 < var5_int) {
            if (var7 != 0) {
              return;
            }
            stackIn_7_0 = this.field_d;
            stackIn_7_1 = var6;
            stackIn_7_2 = null;
            stackIn_7_3 = null;
            if (param3.b((byte) 44, 1) != 1) {
              stackIn_8_2 = null;
              stackIn_8_3 = null;
              stackIn_8_4 = false;
            } else {
              stackIn_8_2 = null;
              stackIn_8_3 = null;
              stackIn_8_4 = true;
            }
            stackIn_7_0[stackIn_7_1] = new cva(stackIn_8_4, param3.b((byte) 44, 8));
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("f.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(kh param0, int param1, csa param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 105) {
            field_c = (int[]) null;
          }
          this.a(0);
          param0.a((byte) 44, this.field_f.length, iia.d(this.field_a, 22972));
          var4_int = 0;
          while (this.field_f.length > var4_int) {
            if (var5 != 0) {
              return;
            }
            if (param2 != this.field_f[var4_int].o((byte) -48)) {
              param0.a((byte) 73, 0, 1);
              param0.a((byte) 111, this.field_f[var4_int].n(31974).a((byte) 62), 8);
            } else {
              param0.a((byte) -127, 1, 1);
              param0.a((byte) -126, this.field_f[var4_int].i((byte) 84).a((byte) 115), 8);
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("f.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
