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
            field_A = null;
        }
        return 255 & param1;
    }

    public static void i(int param0) {
        field_A = null;
        if (param0 < 49) {
            field_B = null;
        }
        field_B = null;
        field_C = null;
        field_K = null;
    }

    final void a(int param0, int param1, rj param2, int param3, int param4, int param5) {
        super.a(param0, -118, param2, param3, param4, param5);
        int var7 = -65 / ((-50 - param1) / 57);
        ((dl) this).field_o = 0;
    }

    final static pb[] d(byte param0) {
        pb[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
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
            L2: {
              var3 = vc.field_b[var2] * ih.field_d[var2];
              var21 = ih.field_b[var2];
              if (sk.field_c[var2]) {
                var23 = lj.field_D[var2];
                var24 = new int[var3];
                var20 = var24;
                var16 = var20;
                var13 = var16;
                var6 = var13;
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= (var3 ^ -1)) {
                    var1[var2] = (pb) (Object) new jc(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var24);
                    break L2;
                  } else {
                    var6[var7] = vf.b(gj.field_w[sa.a(255, (int) var21[var7])], sa.a((int) var23[var7], 255) << -1909312456);
                    var7++;
                    continue L3;
                  }
                }
              } else {
                var9 = new int[var3];
                var22 = var9;
                var6_int = 0;
                L4: while (true) {
                  if (var3 <= var6_int) {
                    var1[var2] = new pb(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], var22);
                    break L2;
                  } else {
                    var9[var6_int] = gj.field_w[sa.a((int) var21[var6_int], 255)];
                    var6_int++;
                    continue L4;
                  }
                }
              }
            }
            var2++;
            continue L0;
          }
        }
    }

    final StringBuilder a(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        if (((dl) this).a((byte) 122, param3, param2, param0)) {
            ((dl) this).a((byte) 116, param0, param2, param3);
            ((dl) this).a(-81, param2, param3, param0);
            StringBuilder discarded$22 = param2.append(" revert=").append(((dl) this).field_I);
            if (-2147483648 != (((dl) this).field_F ^ -1)) {
                if (!(2147483647 == ((dl) this).field_E)) {
                    StringBuilder discarded$23 = param2.append(" to ").append(((dl) this).field_F).append(44).append(((dl) this).field_E);
                }
            }
        }
        if (param1) {
            Object var6 = null;
            ((dl) this).a(108, true, -82, (rj) null);
        }
        return param2;
    }

    final void a(byte param0) {
        super.a(param0);
        ((dl) this).field_y.b(((dl) this).field_p, 0, 0, ((dl) this).field_t, 23987);
        ((dl) this).field_E = ((dl) this).field_k;
        ((dl) this).field_F = ((dl) this).field_w;
    }

    private dl(int param0, int param1, int param2, int param3, uk param4, lf param5, rj param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((dl) this).field_E = 2147483647;
        ((dl) this).field_F = 2147483647;
        ((dl) this).field_y = param6;
        ((dl) this).field_I = param7 ? true : false;
        ((dl) this).field_D = param8 ? true : false;
    }

    final static a[] a(ej param0, boolean param1) {
        int var5 = 0;
        a var6 = null;
        int var7 = stellarshard.field_B;
        if (!(param0.a(-102))) {
            return new a[]{};
        }
        re var8 = param0.b(103);
        while (-1 == (var8.field_f ^ -1)) {
            jj.a((byte) -113, 10L);
        }
        if (!(var8.field_f != 2)) {
            return new a[]{};
        }
        if (param1) {
            return null;
        }
        int[] var12 = (int[]) var8.field_b;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        a[] var4 = new a[var12.length >> -1341135550];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new a();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 425017794];
            var6.field_c = var3[1 + (var5 << -801597822)];
            var6.field_a = var3[2 + (var5 << -372974750)];
            var6.field_e = var3[(var5 << -791395390) - -3];
        }
        return var4;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 0;
        var8 = super.a(param0, param1, param2, param3, param4, (byte) 119, param6) ? 1 : 0;
        if (param5 >= 24) {
          L0: {
            if (var8 == 0) {
              break L0;
            } else {
              if (((dl) this).field_D) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (!((dl) this).a((byte) 124, param6, param3, param1, param4)) {
            return var8 != 0;
          } else {
            ((dl) this).field_o = param2;
            if (param2 == 1) {
              lk.field_e = (dl) this;
              ((dl) this).field_H = -param6 + param3 + -((dl) this).field_k;
              ((dl) this).field_J = -param4 + -((dl) this).field_w + param1;
              return true;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                if (!(((dl) this).field_y instanceof ig)) {
                  break L3;
                } else {
                  if (!((ig) (Object) ((dl) this).field_y).field_E) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (1 != ((dl) this).field_o) {
                break L2;
              } else {
                L4: {
                  L5: {
                    var5 = -((dl) this).field_J + (ni.field_e + -param2);
                    var6 = -((dl) this).field_H + eb.field_a - param0;
                    if ((var5 ^ -1) != (((dl) this).field_w ^ -1)) {
                      break L5;
                    } else {
                      if (((dl) this).field_k == var6) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((dl) this).field_k = var6;
                  ((dl) this).field_w = var5;
                  if (!(((dl) this).field_v instanceof gl)) {
                    break L4;
                  } else {
                    ((gl) (Object) ((dl) this).field_v).a(param2, (dl) this, param1, param0);
                    break L1;
                  }
                }
                break L1;
              }
            }
            if (((dl) this).field_I) {
              L6: {
                if ((((dl) this).field_w ^ -1) == (((dl) this).field_F ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    var5 = ((dl) this).field_F - ((dl) this).field_w;
                    stackOut_13_0 = this;
                    stackOut_13_1 = ((dl) this).field_w;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (Math.abs(var5) <= 2) {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (-1 <= (var5 ^ -1)) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        break L7;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        break L7;
                      }
                    } else {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = var5 >> -2134094367;
                      stackIn_18_0 = stackOut_14_0;
                      stackIn_18_1 = stackOut_14_1;
                      stackIn_18_2 = stackOut_14_2;
                      break L7;
                    }
                  }
                  ((dl) this).field_w = stackIn_18_1 + stackIn_18_2;
                  break L6;
                }
              }
              if (((dl) this).field_E != ((dl) this).field_k) {
                L8: {
                  var5 = -((dl) this).field_k + ((dl) this).field_E;
                  stackOut_21_0 = this;
                  stackOut_21_1 = ((dl) this).field_k;
                  stackIn_25_0 = stackOut_21_0;
                  stackIn_25_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (-3 > (Math.abs(var5) ^ -1)) {
                    stackOut_25_0 = this;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = var5 >> 1671872545;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    break L8;
                  } else {
                    stackOut_22_0 = this;
                    stackOut_22_1 = stackIn_22_1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    if (-1 > (var5 ^ -1)) {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      break L8;
                    } else {
                      stackOut_23_0 = this;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = -1;
                      stackIn_26_0 = stackOut_23_0;
                      stackIn_26_1 = stackOut_23_1;
                      stackIn_26_2 = stackOut_23_2;
                      break L8;
                    }
                  }
                }
                ((dl) this).field_k = stackIn_26_1 + stackIn_26_2;
                break L1;
              } else {
                break L1;
              }
            } else {
              super.a(param0, param1, param2, param3);
              break L0;
            }
          }
          super.a(param0, param1, param2, param3);
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_B = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_G = 5;
    }
}
