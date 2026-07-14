/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends ct {
    static ut field_K;
    static String field_F;
    private int field_E;
    static String field_I;
    static sj field_J;
    private int field_D;
    static String field_A;
    private int field_H;
    private boolean field_L;
    private boolean field_B;
    private int field_C;

    final static void a(int param0, cn param1, byte param2) {
        wo.field_m = 150;
        ll.field_o = param1;
        if (param2 != -46) {
            jg.a(-114, (byte) -103, false, 80);
        }
        aw.field_J = wo.field_m + 20 + param0 >> 662775169;
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, boolean param5, int param6) {
        ut var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        var10 = Kickabout.field_G;
        if (ug.field_c != null) {
          L0: {
            var7 = ug.field_c[param0];
            if (param4) {
              var7 = sp.field_Hb[param0];
              break L0;
            } else {
              break L0;
            }
          }
          if (param6 == 4) {
            if (!param5) {
              L1: {
                if (param4) {
                  var7.c(param3, param2);
                  break L1;
                } else {
                  if (!param1) {
                    var7.c(param3, param2);
                    break L1;
                  } else {
                    var7.a(-3 + param3, -3 + param2, 6 + var7.field_o, 6 + var7.field_v);
                    break L1;
                  }
                }
              }
              return;
            } else {
              L2: {
                if ((am.field_k ^ -1) == (param0 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if (kp.field_m == null) {
                      kp.field_m = new ut(var7.field_o + 8, var7.field_v - -8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  iw.a(-56, kp.field_m);
                  on.b();
                  var7.c(4, 4);
                  nh.a(kp.field_m, 0.0, 1.3, 1.2);
                  eo.a(kp.field_m, 65793);
                  eo.a(kp.field_m, 16777215);
                  eo.a(kp.field_m, 7829367);
                  pt.a(95, -22914, 14, 88, 22);
                  var14 = new int[255];
                  var13 = var14;
                  var12 = var13;
                  var11 = var12;
                  var8 = var11;
                  var9 = 0;
                  L4: while (true) {
                    if ((var9 ^ -1) <= -256) {
                      nh.a(20, 40, -20 + on.field_g, 40, 28, 40, var14);
                      ta.e(119);
                      ta.e(param6 + 123);
                      am.field_k = param0;
                      break L2;
                    } else {
                      var8[var9] = 65793 * var9;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
              kp.field_m.c(param3 + -4, -4 + param2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void h(byte param0) {
        field_F = null;
        int var1 = 35 / ((-16 - param0) / 63);
        field_I = null;
        field_J = null;
        field_K = null;
        field_A = null;
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        if (!param0) {
            Object var9 = null;
            StringBuilder discarded$0 = ((jg) this).a(-45, -42, (Hashtable) null, (StringBuilder) null);
        }
        int var8 = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
        if (var8 != 0) {
            if (((jg) this).field_B) {
                return true;
            }
        }
        if (((jg) this).a((byte) 58, param5, param1, param2, param4)) {
            if (!(-2 != (param6 ^ -1))) {
                ((jg) this).field_D = -param1 + (-((jg) this).field_g + param4);
                mp.field_g = (jg) this;
                ((jg) this).field_E = -param5 + param2 - ((jg) this).field_t;
            }
            ((jg) this).field_p = param6;
            return true;
        }
        return var8 != 0;
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
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
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                if (!(((jg) this).field_z instanceof wi)) {
                  break L3;
                } else {
                  if (!((wi) (Object) ((jg) this).field_z).field_y) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-2 != (((jg) this).field_p ^ -1)) {
                break L2;
              } else {
                L4: {
                  L5: {
                    var5 = el.field_A - (((jg) this).field_E + param2);
                    var6 = -((jg) this).field_D + n.field_m - param3;
                    if (var5 != ((jg) this).field_t) {
                      break L5;
                    } else {
                      if ((((jg) this).field_g ^ -1) == (var6 ^ -1)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((jg) this).field_t = var5;
                  ((jg) this).field_g = var6;
                  if (((jg) this).field_k instanceof eu) {
                    ((eu) (Object) ((jg) this).field_k).a(param0 + -18830, (jg) this, param3, param2);
                    break L4;
                  } else {
                    break L1;
                  }
                }
                break L1;
              }
            }
            if (((jg) this).field_L) {
              L6: {
                if ((((jg) this).field_t ^ -1) == (((jg) this).field_H ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    var5 = ((jg) this).field_H + -((jg) this).field_t;
                    stackOut_14_0 = this;
                    stackOut_14_1 = ((jg) this).field_t;
                    stackIn_18_0 = stackOut_14_0;
                    stackIn_18_1 = stackOut_14_1;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    if (Math.abs(var5) > 2) {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = var5 >> 702199873;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      break L7;
                    } else {
                      stackOut_15_0 = this;
                      stackOut_15_1 = stackIn_15_1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      if (var5 > 0) {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L7;
                      } else {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = -1;
                        stackIn_19_0 = stackOut_16_0;
                        stackIn_19_1 = stackOut_16_1;
                        stackIn_19_2 = stackOut_16_2;
                        break L7;
                      }
                    }
                  }
                  ((jg) this).field_t = stackIn_19_1 + stackIn_19_2;
                  break L6;
                }
              }
              if ((((jg) this).field_C ^ -1) == (((jg) this).field_g ^ -1)) {
                break L1;
              } else {
                L8: {
                  var5 = ((jg) this).field_C - ((jg) this).field_g;
                  stackOut_21_0 = this;
                  stackOut_21_1 = ((jg) this).field_g;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  if (-3 <= (Math.abs(var5) ^ -1)) {
                    stackOut_23_0 = this;
                    stackOut_23_1 = stackIn_23_1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (0 >= var5) {
                      stackOut_25_0 = this;
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = -1;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      break L8;
                    } else {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      stackIn_26_1 = stackOut_24_1;
                      stackIn_26_2 = stackOut_24_2;
                      break L8;
                    }
                  } else {
                    stackOut_22_0 = this;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = var5 >> -1810630079;
                    stackIn_26_0 = stackOut_22_0;
                    stackIn_26_1 = stackOut_22_1;
                    stackIn_26_2 = stackOut_22_2;
                    break L8;
                  }
                }
                ((jg) this).field_g = stackIn_26_1 + stackIn_26_2;
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

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        super.a(param0, param1, param2, param3, param4 ^ 0, param5);
        ((jg) this).field_p = 0;
        if (param4 != -1) {
            ((jg) this).field_L = false;
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (((jg) this).a(1, param3, param2, param1)) {
            ((jg) this).b(param1, param3, param2, -18568);
            ((jg) this).a(param2, 127, param3, param1);
            StringBuilder discarded$22 = param3.append(" revert=").append(((jg) this).field_L);
            if (((jg) this).field_H != 2147483647) {
                if (-2147483648 != (((jg) this).field_C ^ -1)) {
                    StringBuilder discarded$23 = param3.append(" to ").append(((jg) this).field_H).append(44).append(((jg) this).field_C);
                }
            }
        }
        if (param0 != 17883) {
            field_I = null;
        }
        return param3;
    }

    private jg(int param0, int param1, int param2, int param3, gj param4, jv param5, fd param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((jg) this).field_H = 2147483647;
        ((jg) this).field_C = 2147483647;
        ((jg) this).field_z = param6;
        ((jg) this).field_B = param8 ? true : false;
        ((jg) this).field_L = param7 ? true : false;
    }

    final void a(byte param0) {
        super.a(param0);
        ((jg) this).field_z.a(((jg) this).field_i, 1, 0, ((jg) this).field_n, 0);
        ((jg) this).field_H = ((jg) this).field_t;
        ((jg) this).field_C = ((jg) this).field_g;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        if (!(kd.field_s)) {
            return;
        }
        qa.field_E.b(0, param2);
        int var4 = dr.field_g.h(-113) ? 1 : 0;
        if ((wj.field_A ^ -1) != -1) {
            if (!(var4 != 0)) {
                param2 = false;
                hq.b((byte) 114);
            }
        }
        if (param2) {
            dr.field_g.b(param3, param0, (byte) -127);
        }
        int var6 = -116 % ((param1 - 17) / 36);
        if (!(var4 == 0)) {
            qa.field_E.b(0, param2);
        }
        int var5 = dr.field_g.h((byte) 49) + dr.field_g.field_F;
        if (-641 > (var5 ^ -1)) {
            fb.field_I = fb.field_I + 5;
        } else {
            if (var5 < 635) {
                if ((fb.field_I ^ -1) < -1) {
                    fb.field_I = fb.field_I - 5;
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_F = "Public";
        field_I = "Your team still earns 10% of the winnings and have earnt <%0>.";
    }
}
