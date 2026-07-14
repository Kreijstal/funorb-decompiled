/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ut extends tia {
    private int field_k;
    static int field_o;
    private dha field_i;
    private gw field_j;
    static kv[] field_r;
    static sna field_q;
    private eaa field_n;
    static int field_l;
    static n field_m;
    private int field_p;

    final static void d(int param0) {
        int var1 = 117 / ((param0 - -74) / 48);
    }

    ut(gj param0, ad param1, int param2, int param3) {
        super(param0, param1);
        ((ut) this).field_k = param2;
        ((ut) this).field_p = 1 + param3;
        ((ut) this).field_n = new eaa();
        int var5 = 128 * ((ut) this).field_p >> -950527423;
        int var6 = ((ut) this).field_p * 64 >> -1540290015;
        int var7 = 20 * ((ut) this).field_p;
        if (((ut) this).field_k == 1) {
            var6 = var6 * -1;
        } else {
            if (-4 != (((ut) this).field_k ^ -1)) {
                // if_icmpne L121
                var6 = var6 * -1;
                var5 = var5 * -1;
            } else {
                var5 = var5 * -1;
            }
        }
        dha var8 = new dha(0, 0);
        dha var9 = new dha(var5, var6);
        dha var10 = new dha(0, -var7);
        dha var11 = new dha(var5, var6 + -var7);
        ((ut) this).field_j = new gw(var8, var10, var11, var9, 65793);
        ((ut) this).field_g = 64;
    }

    public static void b(int param0) {
        field_q = null;
        if (param0 != -8696) {
            field_o = -3;
        }
        field_r = null;
        field_m = null;
    }

    final void a(int param0, int param1, int param2) {
        qq.a(((ut) this).field_n, param2, param0, param1 ^ -28638);
        if (param1 != 25415) {
            Object var5 = null;
            int discarded$0 = ut.a((String[]) null, 124, (String) null, (po) null, 98);
        }
    }

    final static int a(String[] args, int param1, String param2, po param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = BachelorFridge.field_y;
          var5 = param3.a(param2);
          var6 = -36 / ((param4 - 69) / 55);
          if (param1 < var5) {
            break L0;
          } else {
            if ((param2.indexOf("<br>") ^ -1) == 0) {
              args[0] = (String) (Object) args;
              return 1;
            } else {
              break L0;
            }
          }
        }
        var7 = (param1 + (var5 + -1)) / param1;
        param1 = var5 / var7;
        var7 = 0;
        var8 = 0;
        var9 = param2.length();
        var10 = 0;
        L1: while (true) {
          if (var9 <= var10) {
            L2: {
              if (var8 < var9) {
                var7++;
                args[var7] = param2.substring(var8, var9).trim();
                break L2;
              } else {
                break L2;
              }
            }
            return var7;
          } else {
            L3: {
              L4: {
                var11 = param2.charAt(var10);
                if (var11 == 32) {
                  break L4;
                } else {
                  if (var11 != 45) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var12 = param2.substring(var8, var10 + 1).trim();
              var13 = param3.a(var12);
              if (param1 > var13) {
                break L3;
              } else {
                var7++;
                args[var7] = var12;
                var8 = 1 + var10;
                break L3;
              }
            }
            if (62 == var11) {
              if (param2.regionMatches(-3 + var10, "<br>", 0, 4)) {
                var7++;
                args[var7] = param2.substring(var8, -3 + var10).trim();
                var8 = var10 + 1;
                var10++;
                continue L1;
              } else {
                var10++;
                continue L1;
              }
            } else {
              var10++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        lh var6 = null;
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          ((ut) this).field_g = ((ut) this).field_g - 1;
          if ((((ut) this).field_g ^ -1) >= -1) {
            break L0;
          } else {
            if ((((ut) this).field_g ^ -1) > -65) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= (120 + -((ut) this).field_g) / 32) {
                  break L0;
                } else {
                  ((ut) this).field_i = ((ut) this).field_j.a((double)(64 - ((ut) this).field_g) / 64.0, 68);
                  var3 = -15 + (((ut) this).field_i.field_c << -481924636) + kla.a(30, ((ut) this).field_f, -2147483648);
                  var4 = -15 + (((ut) this).field_i.field_a << 1051321636) + kla.a(30, ((ut) this).field_f, -2147483648);
                  var5 = 0;
                  var6 = new lh(var3, var5, var4);
                  int discarded$1 = kla.a(100, ((ut) this).field_f, -2147483648);
                  var6.field_p = 16 + -kla.a(32, ((ut) this).field_f, -2147483648);
                  var6.field_k = 16 + -kla.a(32, ((ut) this).field_f, -2147483648);
                  var6.field_g = -kla.a(32, ((ut) this).field_f, -2147483648) + 16;
                  var6.field_m = -1;
                  var6.field_o = 32;
                  var6.field_l = 0;
                  ((ut) this).field_n.a((bw) (Object) var6, true);
                  var2++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        oma.a(((ut) this).field_g, ((ut) this).field_f, ((ut) this).field_n, ((ut) this).field_j, -72, ((ut) this).field_i);
        if (param0 < 0) {
          L2: {
            L3: {
              if (((ut) this).field_g >= 0) {
                break L3;
              } else {
                if (((ut) this).field_n.e(12917)) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_13_0 != 0;
        } else {
          return false;
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = BachelorFridge.field_y;
        eu.field_b = new js(8);
        for (var1 = 0; ra.field_k.length > var1; var1++) {
            eu.field_b.a((long)ra.field_k[var1].toLowerCase().hashCode(), (byte) -81, (bw) (Object) new ji(var1));
        }
        if (param0 != -22021) {
            ut.b(11);
        }
    }

    static {
    }
}
