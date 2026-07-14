/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nf {
    private ad field_f;
    String field_d;
    String field_h;
    static String field_q;
    mi field_c;
    boolean field_g;
    int[] field_p;
    static java.awt.Frame field_e;
    ti field_a;
    static tf field_m;
    static String field_i;
    String field_j;
    String field_n;
    int field_o;
    static hj field_l;
    String field_b;
    static int field_k;

    final char a(int param0, char param1) {
        if (param0 != 0) {
            char discarded$0 = ((nf) this).a(89, '');
        }
        return Character.toUpperCase(param1);
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_q = null;
        field_l = null;
        field_m = null;
        if (param0 != -41) {
            nf.a((byte) -93);
        }
    }

    final boolean a(int param0, sj[] param1) {
        int var5 = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var3 = 0;
        if (param0 != -1) {
            field_l = null;
        }
        while (param1.length > var3) {
            // if_acmpeq L41
            var3++;
        }
        char[] var4 = new char[var3];
        for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = param1[var5].field_i;
        }
        return ((nf) this).field_f.a((byte) 109, var4);
    }

    final void a(byte param0, char[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var6 = Transmogrify.field_A ? 1 : 0;
          if (param0 == 92) {
            break L0;
          } else {
            ((nf) this).field_f = null;
            break L0;
          }
        }
        L1: while (true) {
          ((nf) this).field_f.a(param1, o.field_o, false, 3670);
          var3 = 0;
          var4 = 0;
          L2: while (true) {
            if (256 <= var4) {
              var7 = 0;
              var4 = var7;
              L3: while (true) {
                if (var7 >= param1.length) {
                  if (var3 != 0) {
                    return;
                  } else {
                    continue L1;
                  }
                } else {
                  L4: {
                    var5 = param1[var7] & 255;
                    if (-1 >= ((nf) this).field_d.indexOf(var5)) {
                      break L4;
                    } else {
                      var3 = 1;
                      break L4;
                    }
                  }
                  ic.field_c[var5] = ic.field_c[var5] + 1;
                  if ((ic.field_c[var5] + 1 ^ -1) == -5) {
                    continue L1;
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            } else {
              ic.field_c[var4] = 0;
              var4++;
              continue L2;
            }
          }
        }
    }

    nf(ci param0, ci param1, ad param2) {
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        int var12_int = 0;
        NumberFormatException var12 = null;
        String var13 = null;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        NumberFormatException var17 = null;
        int var18 = 0;
        char[] var24 = null;
        Object var25 = null;
        Object var26 = null;
        CharSequence var27 = null;
        CharSequence var28 = null;
        int stackIn_35_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        mi stackIn_50_1 = null;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_47_0 = null;
        Object stackOut_48_0 = null;
        mi stackOut_48_1 = null;
        Object stackOut_49_0 = null;
        mi stackOut_49_1 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var25 = null;
                    var26 = null;
                    ((nf) this).field_p = new int[512];
                    ((nf) this).field_f = param2;
                    ((nf) this).field_o = param2.field_d;
                    var4 = 0;
                    var5 = null;
                    var6 = null;
                    var7 = null;
                    var8 = null;
                    var9 = null;
                    var10 = null;
                    var11 = null;
                    var12_int = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param2.field_c.length <= var12_int) {
                        statePc = 40;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    var13 = param2.field_c[var12_int][0];
                    var14 = param2.field_c[var12_int][1];
                    if (!var13.startsWith("val")) {
                        statePc = 18;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var16 = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        var27 = (CharSequence) (Object) var13.substring(3);
                        var15 = aa.a(-104, var27);
                        if (-1 <= (var15 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var24 = var14.toCharArray();
                        var18 = 0;
                        if (var24.length <= var18) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((va.field_j ^ -1) > -3) {
                            statePc = 39;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var16 == 0) {
                            statePc = 39;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        System.out.println("Unrecognised config option: " + var13);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((va.field_j ^ -1) > -3) {
                            statePc = 39;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        System.out.println("Unrecognised config option: " + var13);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var16 = 1;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var17 = (NumberFormatException) (Object) caughtException;
                    var16 = 1;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if ((va.field_j ^ -1) > -3) {
                        statePc = 39;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if (var16 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    System.out.println("Unrecognised config option: " + var13);
                    statePc = 39;
                    continue stateLoop;
                }
                case 18: {
                    if (!"lang".equals((Object) (Object) var13)) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    var5 = var14;
                    statePc = 39;
                    continue stateLoop;
                }
                case 20: {
                    if ("font".equals((Object) (Object) var13)) {
                        statePc = 38;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if ("fhei".equals((Object) (Object) var13)) {
                        statePc = 37;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (!"vowels".equals((Object) (Object) var13)) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var8 = var14;
                    statePc = 39;
                    continue stateLoop;
                }
                case 24: {
                    if (!"tut1".equals((Object) (Object) var13)) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var9 = var14.toUpperCase();
                    statePc = 39;
                    continue stateLoop;
                }
                case 26: {
                    if ("tut2".equals((Object) (Object) var13)) {
                        statePc = 36;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (!"hint1".equals((Object) (Object) var13)) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var11 = var14;
                    statePc = 39;
                    continue stateLoop;
                }
                case 29: {
                    if ("disabled".equals((Object) (Object) var13)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (-3 < (va.field_j ^ -1)) {
                        statePc = 39;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    System.out.println("Unrecognised config option: " + var13);
                    statePc = 39;
                    continue stateLoop;
                }
                case 32: {
                    if (!var14.equals((Object) (Object) "true")) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackOut_33_0 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    var4 = stackIn_35_0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 36: {
                    var10 = var14.toUpperCase();
                    statePc = 39;
                    continue stateLoop;
                }
                case 37: {
                    var7 = var14;
                    statePc = 39;
                    continue stateLoop;
                }
                case 38: {
                    var6 = var14;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var12_int++;
                    statePc = 1;
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = this;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_41_0 = stackOut_40_0;
                    if (var4 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = this;
                    stackOut_41_1 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = this;
                    stackOut_42_1 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    ((nf) this).field_g = stackIn_43_1 != 0;
                    if (var8 != null) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((nf) this).field_d = "AEIOU";
                    if (2 > va.field_j) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    System.out.println("Forced to use default vowels for " + var5);
                    statePc = 47;
                    continue stateLoop;
                }
                case 46: {
                    ((nf) this).field_d = var8.toUpperCase();
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    ((nf) this).field_n = var10;
                    ((nf) this).field_b = var9;
                    ((nf) this).field_h = var11;
                    ((nf) this).field_j = var5;
                    var28 = (CharSequence) (Object) ("flag_" + var5);
                    ((nf) this).field_a = pc.a("", dj.a(var28, (byte) -123), param0, -124);
                    stackOut_47_0 = this;
                    stackIn_49_0 = stackOut_47_0;
                    stackIn_48_0 = stackOut_47_0;
                    if (var6 != null) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = this;
                    stackOut_48_1 = wf.field_d;
                    stackIn_50_0 = stackOut_48_0;
                    stackIn_50_1 = stackOut_48_1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 49: {
                    stackOut_49_0 = this;
                    stackOut_49_1 = am.a(dj.a((CharSequence) (Object) var6, (byte) -121), param0, (byte) 72, param1, "");
                    stackIn_50_0 = stackOut_49_0;
                    stackIn_50_1 = stackOut_49_1;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    ((nf) this).field_c = stackIn_50_1;
                    if (var7 == null) {
                        statePc = 54;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    try {
                        int discarded$1 = aa.a(89, (CharSequence) (Object) var7);
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var12 = (NumberFormatException) (Object) caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Player";
        field_m = new tf(0, 2, 2, 1);
        field_k = -1;
    }
}
