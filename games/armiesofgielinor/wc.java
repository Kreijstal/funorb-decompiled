/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wc extends nl {
    private int field_O;
    private boolean field_P;
    static String field_R;
    static String field_K;
    private int field_L;
    private boolean field_I;
    private int field_N;
    static wk[] field_Q;
    static wk field_J;
    private int field_M;

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int var8 = this.a(param0, param1, param2, 108, param4, param5, param6) ? 1 : 0;
        if (param3 < 103) {
            ((wc) this).field_N = 62;
        }
        if (var8 != 0) {
            if (((wc) this).field_I) {
                return true;
            }
        }
        if (!((wc) this).b(1, param1, param5, param0, param2)) {
            return var8 != 0;
        }
        if (!(1 != param6)) {
            ((wc) this).field_L = -((wc) this).field_p + (param5 - param2);
            bn.field_f = (wc) this;
            ((wc) this).field_N = -param1 + -((wc) this).field_B + param0;
        }
        ((wc) this).field_q = param6;
        return true;
    }

    final void a(int param0, int param1, int param2, kb param3) {
        int var5 = 0;
        int var6 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                if (!(((wc) this).field_E instanceof fw)) {
                  break L3;
                } else {
                  if (!((fw) (Object) ((wc) this).field_E).field_I) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if ((((wc) this).field_q ^ -1) != -2) {
                break L2;
              } else {
                L4: {
                  L5: {
                    var5 = -param1 + (sm.field_d - ((wc) this).field_N);
                    var6 = -((wc) this).field_L + (ko.field_b - param2);
                    if ((((wc) this).field_B ^ -1) != (var5 ^ -1)) {
                      break L5;
                    } else {
                      if ((((wc) this).field_p ^ -1) == (var6 ^ -1)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((wc) this).field_B = var5;
                  ((wc) this).field_p = var6;
                  if (((wc) this).field_x instanceof fr) {
                    ((fr) (Object) ((wc) this).field_x).a((wc) this, param2, param0 ^ -32678, param1);
                    break L4;
                  } else {
                    break L1;
                  }
                }
                break L1;
              }
            }
            if (((wc) this).field_P) {
              L6: {
                if (((wc) this).field_O != ((wc) this).field_B) {
                  L7: {
                    var5 = -((wc) this).field_B + ((wc) this).field_O;
                    stackOut_15_0 = this;
                    stackOut_15_1 = ((wc) this).field_B;
                    stackIn_19_0 = stackOut_15_0;
                    stackIn_19_1 = stackOut_15_1;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    if (2 < Math.abs(var5)) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = var5 >> 38625889;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L7;
                    } else {
                      stackOut_16_0 = this;
                      stackOut_16_1 = stackIn_16_1;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (-1 > (var5 ^ -1)) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        break L7;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = stackIn_17_1;
                        stackOut_17_2 = -1;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_20_1 = stackOut_17_1;
                        stackIn_20_2 = stackOut_17_2;
                        break L7;
                      }
                    }
                  }
                  ((wc) this).field_B = stackIn_20_1 + stackIn_20_2;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (((wc) this).field_p == ((wc) this).field_M) {
                break L1;
              } else {
                L8: {
                  var5 = -((wc) this).field_p + ((wc) this).field_M;
                  stackOut_22_0 = this;
                  stackOut_22_1 = ((wc) this).field_p;
                  stackIn_26_0 = stackOut_22_0;
                  stackIn_26_1 = stackOut_22_1;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  if (2 < Math.abs(var5)) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = stackIn_26_1;
                    stackOut_26_2 = var5 >> -1291323775;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    break L8;
                  } else {
                    stackOut_23_0 = this;
                    stackOut_23_1 = stackIn_23_1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    if (var5 <= 0) {
                      stackOut_25_0 = this;
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = -1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      break L8;
                    } else {
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = 1;
                      stackIn_27_0 = stackOut_24_0;
                      stackIn_27_1 = stackOut_24_1;
                      stackIn_27_2 = stackOut_24_2;
                      break L8;
                    }
                  }
                }
                ((wc) this).field_p = stackIn_27_1 + stackIn_27_2;
                break L1;
              }
            } else {
              this.a(param0, param1, param2, param3);
              break L0;
            }
          }
          this.a(param0, param1, param2, param3);
          break L0;
        }
    }

    public static void j(int param0) {
        field_R = null;
        field_K = null;
        field_J = null;
        if (param0 != 0) {
            field_K = null;
        }
        field_Q = null;
    }

    final static void a(boolean param0, int param1) {
        td.a(param0, false, 108);
        if (param1 != -49) {
            field_J = null;
        }
    }

    final static qc c(boolean param0) {
        if (param0) {
            field_R = null;
        }
        return (qc) (Object) new uk();
    }

    final void b(boolean param0) {
        if (!param0) {
            ((wc) this).field_O = -119;
        }
        this.b(param0);
        ((wc) this).field_E.a(0, ((wc) this).field_l, 0, 8192, ((wc) this).field_w);
        ((wc) this).field_M = ((wc) this).field_p;
        ((wc) this).field_O = ((wc) this).field_B;
    }

    final void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var7 = -116 / ((-58 - param3) / 53);
        this.a(param0, param1, param2, (byte) 73, param4, param5);
        ((wc) this).field_q = 0;
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (param2 != 26477) {
            ((wc) this).field_P = false;
        }
        if (!(!((wc) this).a(param3, param0, (byte) 61, param1))) {
            ((wc) this).a(param0, param3, true, param1);
            ((wc) this).a(param3, param0, -56, param1);
            StringBuilder discarded$22 = param1.append(" revert=").append(((wc) this).field_P);
            if (2147483647 != ((wc) this).field_O) {
                if (!(-2147483648 == (((wc) this).field_M ^ -1))) {
                    StringBuilder discarded$23 = param1.append(" to ").append(((wc) this).field_O).append(44).append(((wc) this).field_M);
                }
            }
        }
        return param1;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param1) {
            return;
        }
        if (!(null == ad.field_I)) {
            op.a(-116, ad.field_I);
        }
        if (null != tn.field_Z) {
            tn.field_Z.a((byte) -108, param0);
        }
        hw.a(param0, (byte) -89);
        if (!(ik.field_b == null)) {
            ik.field_b.b(param0, 20);
        }
        qh.a(param0, 0);
    }

    wc(int param0, int param1, int param2, int param3, kh param4, qo param5, kb param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((wc) this).field_O = 2147483647;
        ((wc) this).field_M = 2147483647;
        ((wc) this).field_P = param7 ? true : false;
        ((wc) this).field_I = param8 ? true : false;
        ((wc) this).field_E = param6;
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = (long)param1;
        var4 = param0.length();
        var5 = 0;
        L0: while (true) {
          L1: {
            if ((var5 ^ -1) <= (var4 ^ -1)) {
              break L1;
            } else {
              L2: {
                L3: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L3;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(1 + (var6 - 65));
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 97) {
                    break L4;
                  } else {
                    if (122 >= var6) {
                      var2 = var2 + (long)(1 + (var6 + -97));
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 < 48) {
                  break L2;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(-21 + var6);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if ((var2 ^ -1L) <= -177917621779460414L) {
                break L1;
              } else {
                var5++;
                continue L0;
              }
            }
          }
          L5: while (true) {
            L6: {
              if (0L != var2 % 37L) {
                break L6;
              } else {
                if ((var2 ^ -1L) == -1L) {
                  break L6;
                } else {
                  var2 = var2 / 37L;
                  continue L5;
                }
              }
            }
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Public chat is unavailable while setting up a rated game.";
        field_R = "Kick <%0> from this game";
    }
}
