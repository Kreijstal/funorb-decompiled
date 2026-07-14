/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oj {
    static String field_d;
    private eb field_a;
    static int[] field_l;
    boolean field_e;
    db field_h;
    static boolean field_g;
    int field_i;
    int field_b;
    cd field_f;
    static String[] field_c;
    String field_k;
    static int[] field_j;

    final static void a(byte param0) {
        int var5 = Lexicominos.field_L ? 1 : 0;
        int[] var6 = qg.field_b;
        int[] var1 = var6;
        int var2 = 0;
        int var4 = -47 / ((param0 - 44) / 52);
        int var3 = var6.length;
        while (var3 > var2) {
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
            var2++;
            var6[var2] = 0;
        }
    }

    final static sh a(boolean param0, int param1) {
        if (param0) {
            sh discarded$0 = oj.a(false, 68);
        }
        return il.a(true, 12317, false, param1, false, 1);
    }

    final void a(fc param0, int param1, char[] param2) {
        ((oj) this).field_a.a(param2, param0.field_I, true, 256);
        if (param1 != 0) {
            field_j = null;
        }
    }

    private final void a(int[] param0, boolean param1, char[] param2) {
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        var4 = param2.length;
        var5_int = 0;
        L0: while (true) {
          if (var5_int >= var4) {
            if (!param1) {
              var20 = new int[var4];
              var18 = var20;
              var16 = var18;
              var14 = var16;
              var5 = var14;
              var6 = 0;
              L1: while (true) {
                if (var4 <= var6) {
                  dd.a(var20, -23588);
                  var21 = var5;
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var21.length) {
                      return;
                    } else {
                      var8 = var21[var7];
                      var9 = (short)var8;
                      if (-1 > (param0[var9] ^ -1)) {
                        var10 = -(var8 >> -1246102960);
                        var11 = 1 + var9;
                        L3: while (true) {
                          if (var10 + var9 <= var11) {
                            var13 = 0;
                            var11 = var13;
                            L4: while (true) {
                              if (var9 > var13) {
                                if (var9 < param0[var13] + var13) {
                                  param0[var13] = 0;
                                  var13++;
                                  continue L4;
                                } else {
                                  var13++;
                                  continue L4;
                                }
                              } else {
                                var7++;
                                continue L2;
                              }
                            }
                          } else {
                            param0[var11] = 0;
                            var11++;
                            continue L3;
                          }
                        }
                      } else {
                        var7++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var5[var6] = (-param0[var6] << 108662480) - -var6;
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          } else {
            param0[var5_int] = ((oj) this).field_a.a(param2, (byte) 106, var5_int);
            var5_int++;
            continue L0;
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -26) {
            sh discarded$0 = oj.a(false, -114);
        }
        field_d = null;
        field_l = null;
        field_j = null;
    }

    final ng a(char[][] param0, int param1) {
        ng var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        char[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int[] var10 = null;
        ng var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var15 = null;
        int[] var16 = null;
        char[] var18 = null;
        int[] var19 = null;
        char[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        char[] var24 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        var11 = new ng();
        var3 = var11;
        var22 = new int[param0[0].length];
        var19 = var22;
        var16 = var19;
        var13 = var16;
        var10 = var13;
        var4 = var10;
        var5_int = 0;
        L0: while (true) {
          if (param0.length <= var5_int) {
            var23 = new int[param0.length];
            var24 = new char[param0.length];
            var21 = var24;
            var18 = var21;
            var15 = var18;
            var5 = var15;
            var6 = 0;
            L1: while (true) {
              if (param0[0].length <= var6) {
                L2: {
                  if (param1 == 17161) {
                    break L2;
                  } else {
                    var9 = null;
                    this.a((int[]) null, true, (char[]) null);
                    break L2;
                  }
                }
                return var3;
              } else {
                var7 = 0;
                L3: while (true) {
                  if (param0.length <= var7) {
                    this.a(var23, false, var24);
                    var12 = 0;
                    var7 = var12;
                    L4: while (true) {
                      if (var12 >= var24.length) {
                        var6++;
                        continue L1;
                      } else {
                        if (0 != var23[var12]) {
                          var3.b(param1 + -17053, (kd) (Object) pc.a(-var12 + param0.length + -1, 1, (byte) 14, var6, var23[var12]));
                          var12++;
                          continue L4;
                        } else {
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var5[var7] = param0[param0.length - 1 + -var7][var6];
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            this.a(var22, false, param0[var5_int]);
            var6 = 0;
            L5: while (true) {
              if (var22.length <= var6) {
                var5_int++;
                continue L0;
              } else {
                if (var22[var6] != 0) {
                  var11 = var3;
                  var11.b(121, (kd) (Object) pc.a(var5_int, var22[var6], (byte) 14, var6, 1));
                  var6++;
                  continue L5;
                } else {
                  var6++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    oj(sh param0, sh param1, eb param2) {
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        NumberFormatException var9 = null;
        String var10 = null;
        String var12 = null;
        CharSequence var13 = null;
        int stackIn_11_0 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        cd stackIn_20_1 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        cd stackOut_19_1 = null;
        Object stackOut_18_0 = null;
        cd stackOut_18_1 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((oj) this).field_a = param2;
                    ((oj) this).field_i = param2.field_g;
                    var4 = 0;
                    var5 = null;
                    var6 = null;
                    var7 = null;
                    var8 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var8 >= param2.field_c.length) {
                        statePc = 14;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var12 = param2.field_c[var8][0];
                    var10 = param2.field_c[var8][1];
                    if ("lang".equals((Object) (Object) var12)) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if ("font".equals((Object) (Object) var12)) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!"fhei".equals((Object) (Object) var12)) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var7 = var10;
                    var8++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 6: {
                    if ("disabled".equals((Object) (Object) var12)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var8++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 8: {
                    if (!var10.equals((Object) (Object) "true")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    var4 = stackIn_11_0;
                    var8++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 12: {
                    var6 = var10;
                    var8++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 13: {
                    var5 = var10;
                    var8++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (var4 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = this;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = this;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    ((oj) this).field_e = stackIn_17_1 != 0;
                    ((oj) this).field_k = var5;
                    var13 = (CharSequence) (Object) ("flag_" + var5);
                    ((oj) this).field_h = df.a("", ef.a(var13, (byte) -14), param0, (byte) -92);
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var6 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = this;
                    stackOut_18_1 = hb.a(param1, 246, "", ef.a((CharSequence) (Object) var6, (byte) -82), param0);
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = this;
                    stackOut_19_1 = bi.field_a;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    ((oj) this).field_f = stackIn_20_1;
                    var8 = -1;
                    if (var7 != null) {
                        statePc = 22;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 22: {
                    try {
                        var8 = si.a((byte) 115, (CharSequence) (Object) var7);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    var9 = (NumberFormatException) (Object) caughtException;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = this;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (-1 == var8) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackOut_26_0 = this;
                    stackOut_26_1 = var8;
                    stackIn_30_0 = stackOut_26_0;
                    stackIn_30_1 = stackOut_26_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = this;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var6 != null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = this;
                    stackOut_28_1 = pa.field_d;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = this;
                    stackOut_29_1 = ((oj) this).field_f.field_E;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    ((oj) this).field_b = stackIn_30_1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Use the \"Next\" box to plan ahead.", "In \"Standard\" mode the speed at which blocks rotate and move horizontally increases, up until level 4.", "In \"Delicate\" mode the speed increases until level 8, making control of the blocks more difficult – but enabling you to react faster.", "Note that the only way to clear tiles is to make words with them."};
        field_d = "You have 1 unread message!";
    }
}
