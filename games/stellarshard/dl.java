/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dl extends dg {
    private int field_H;
    static pb[] field_C;
    private int field_J;
    private int field_E;
    static re field_A;
    private int field_F;
    private boolean field_I;
    static String field_K;
    private boolean field_D;
    static String field_B;
    static int field_G;

    final static int a(int param0, int param1) {
        param1 = ((-1431655765 & param1) >>> -477286431) + (param1 & 1431655765);
        param1 = (858993459 & param1) + (param1 >>> 356097890 & -214748365);
        param1 = 252645135 & (param1 >>> 1415358628) + param1;
        param1 = param1 + (param1 >>> -654635160);
        param1 = param1 + (param1 >>> 1891273168);
        if (param0 != 1) {
            field_A = (re) null;
        }
        return 255 & param1;
    }

    public static void i(int param0) {
        field_A = null;
        if (param0 < 49) {
            field_B = (String) null;
        }
        field_B = null;
        field_C = null;
        field_K = null;
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        try {
            super.a(param0, -118, param2, param3, param4, param5);
            int var7_int = -65 / ((-50 - param1) / 57);
            this.field_o = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "dl.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static pb[] d(byte param0) {
        pb[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = stellarshard.field_B;
        var1 = new pb[sb.field_b];
        var2 = 0;
        L0: while (true) {
          if (sb.field_b <= var2) {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                dl.i(-97);
                break L1;
              }
            }
            tb.f((byte) -66);
            return var1;
          } else {
            var3 = vc.field_b[var2] * ih.field_d[var2];
            var20 = ih.field_b[var2];
            if (sk.field_c[var2]) {
              var22 = lj.field_D[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (pb) ((Object) new jc(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var16));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = vf.b(gj.field_w[sa.a(255, (int) var20[var7])], sa.a((int) var22[var7], 255) << -1909312456);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new pb(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var21);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = gj.field_w[sa.a((int) var20[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        rj var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.a((byte) 122, param3, param2, param0)) {
                break L1;
              } else {
                this.a((byte) 116, param0, param2, param3);
                this.a(-81, param2, param3, param0);
                discarded$64 = param2.append(" revert=").append(this.field_I);
                if (-2147483648 == (this.field_F ^ -1)) {
                  break L1;
                } else {
                  if (2147483647 != this.field_E) {
                    discarded$65 = param2.append(" to ").append(this.field_F).append(',').append(this.field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var6 = (rj) null;
                this.a(108, true, -82, (rj) null);
                break L2;
              }
            }
            stackIn_8_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("dl.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(byte param0) {
        super.a(param0);
        this.field_y.b(this.field_p, 0, 0, this.field_t, 23987);
        this.field_E = this.field_k;
        this.field_F = this.field_w;
    }

    private dl(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_E = 2147483647;
        this.field_F = 2147483647;
        try {
            this.field_y = param6;
            this.field_I = param7 ? true : false;
            this.field_D = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "dl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static a[] a(ej param0, boolean param1) {
        a[] stackIn_4_0 = null;
        a[] stackIn_11_0 = null;
        a[] stackIn_14_0 = null;
        a[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        a[] var4 = null;
        int var5 = 0;
        a var6 = null;
        int var7 = 0;
        re var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = stellarshard.field_B;
        try {
          L0: {
            if (!param0.a(-102)) {
              stackIn_4_0 = new a[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param0.b(103);
              L1: while (true) {
                if (-1 != (var8.field_f ^ -1)) {
                  if (var8.field_f == 2) {
                    stackIn_11_0 = new a[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (!param1) {
                      var10 = (int[]) (var8.field_b);
                      var9 = var10;
                      var3 = var9;
                      var4 = new a[var10.length >> -1341135550];
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          stackIn_19_0 = (a[]) (var4);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var6 = new a();
                          var4[var5] = var6;
                          var6.field_f = var3[var5 << 425017794];
                          var6.field_c = var3[1 + (var5 << -801597822)];
                          var6.field_a = var3[2 + (var5 << -372974750)];
                          var6.field_e = var3[(var5 << -791395390) - -3];
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_14_0 = (a[]) null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  jj.a((byte) -113, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("dl.K(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8_int = super.a(param0, param1, param2, param3, param4, (byte) 119, param6) ? 1 : 0;
            if (param5 >= 24) {
              L1: {
                if (var8_int == 0) {
                  break L1;
                } else {
                  if (this.field_D) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (!this.a((byte) 124, param6, param3, param1, param4)) {
                stackIn_12_0 = var8_int;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_o = param2;
                if (param2 == 1) {
                  lk.field_e = (dl) (this);
                  this.field_H = -param6 + param3 + -this.field_k;
                  this.field_J = -param4 + -this.field_w + param1;
                  stackIn_10_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("dl.P(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (!(this.field_y instanceof ig)) {
                      break L4;
                    } else {
                      if (!((ig) ((Object) this.field_y)).field_E) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (1 != this.field_o) {
                    break L3;
                  } else {
                    L5: {
                      var5_int = -this.field_J + (ni.field_e + -param2);
                      var6 = -this.field_H + eb.field_a - param0;
                      if (var5_int != this.field_w) {
                        break L5;
                      } else {
                        if (this.field_k == var6) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    this.field_k = var6;
                    this.field_w = var5_int;
                    if (!(this.field_v instanceof gl)) {
                      break L2;
                    } else {
                      ((gl) ((Object) this.field_v)).a(param2, (dl) (this), param1, param0);
                      break L2;
                    }
                  }
                }
                if (this.field_I) {
                  L6: {
                    if (this.field_w == this.field_F) {
                      break L6;
                    } else {
                      L7: {
                        var5_int = this.field_F - this.field_w;
                        stackIn_15_0 = this;

                        stackIn_15_1 = this.field_w;

                        if (Math.abs(var5_int) <= 2) {
                          stackIn_17_0 = this;

                          if (-1 <= (var5_int ^ -1)) {
                            stackIn_18_0 = this;
                            stackIn_18_1 = stackIn_15_1;
                            stackIn_18_2 = -1;
                            break L7;
                          } else {
                            stackIn_18_0 = this;
                            stackIn_18_1 = stackIn_15_1;
                            stackIn_18_2 = 1;
                            break L7;
                          }
                        } else {
                          stackIn_18_0 = this;
                          stackIn_18_1 = stackIn_15_1;
                          stackIn_18_2 = var5_int >> -2134094367;
                          break L7;
                        }
                      }
                      ((dl) (this)).field_w = stackIn_18_1 + stackIn_18_2;
                      break L6;
                    }
                  }
                  if (this.field_E != this.field_k) {
                    L8: {
                      var5_int = -this.field_k + this.field_E;
                      stackIn_25_0 = this;

                      stackIn_25_1 = this.field_k;

                      if (-3 > (Math.abs(var5_int) ^ -1)) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = stackIn_25_1;
                        stackIn_26_2 = var5_int >> 1671872545;
                        break L8;
                      } else {
                        stackIn_24_0 = this;

                        if (-1 > (var5_int ^ -1)) {
                          stackIn_26_0 = this;
                          stackIn_26_1 = stackIn_25_1;
                          stackIn_26_2 = 1;
                          break L8;
                        } else {
                          stackIn_26_0 = this;
                          stackIn_26_1 = stackIn_25_1;
                          stackIn_26_2 = -1;
                          break L8;
                        }
                      }
                    }
                    ((dl) (this)).field_k = stackIn_26_1 + stackIn_26_2;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  super.a(param0, param1, param2, param3);
                  break L1;
                }
              }
              super.a(param0, param1, param2, param3);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("dl.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    static {
        field_K = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_B = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_G = 5;
    }
}
