/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ik extends q {
    private int field_q;
    int[] field_s;
    int field_r;
    private int[] field_m;
    int field_l;
    int field_p;
    static String[] field_k;
    private int[] field_o;
    t field_j;
    int field_n;

    final static boolean a(char param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Torquing.field_u;
        if (param1 != -46) {
            field_k = null;
        }
        if (!(!Character.isISOControl(param0))) {
            return false;
        }
        if (wa.a(param0, (byte) 34)) {
            return true;
        }
        char[] var6 = ra.field_d;
        char[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        var2 = qe.field_b;
        for (var3 = 0; var2.length > var3; var3++) {
            var4 = var2[var3];
            if (!(var4 != param0)) {
                return true;
            }
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var16 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var12 = Torquing.field_u;
        var3 = 2147483647;
        var4 = -2147483648;
        var5 = 2147483647;
        var6 = -2147483648;
        var7 = 0;
        L0: while (true) {
          if (((ik) this).field_s.length <= var7) {
            L1: {
              ((ik) this).field_j = new t(1 + var4 + -var3, -var5 + 1 + var6);
              ((ik) this).field_j.field_r = var5 + ((ik) this).field_n;
              ((ik) this).field_j.field_v = var3;
              if (-1 != ((ik) this).field_p) {
                break L1;
              } else {
                if (-1 > (((ik) this).field_q ^ -1)) {
                  ((ik) this).field_j.field_v = -((ik) this).field_j.field_s;
                  break L1;
                } else {
                  ((ik) this).field_j.field_v = 640;
                  break L1;
                }
              }
            }
            L2: {
              var16 = ph.field_e;
              var8 = ph.field_j;
              var9 = ph.field_d;
              ((ik) this).field_j.e();
              if (param0 != 6) {
                stackOut_19_0 = 16777215;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            var10 = stackIn_20_0;
            var11 = 0;
            L3: while (true) {
              if (((ik) this).field_s.length <= var11) {
                L4: {
                  ((ik) this).field_p = param0;
                  if (!param1) {
                    break L4;
                  } else {
                    ik.a((byte) 45);
                    break L4;
                  }
                }
                ph.a(var16, var8, var9);
                return;
              } else {
                ph.d(-var3 + ((ik) this).field_s[var11], -var5 + ((ik) this).field_m[var11], ((ik) this).field_o[var11], var10);
                var11++;
                continue L3;
              }
            }
          } else {
            L5: {
              var8 = ((ik) this).field_o[var7];
              var9 = ((ik) this).field_s[var7];
              if (var8 + var9 > var4) {
                var4 = var9 + var8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var9 - var8 >= var3) {
                break L6;
              } else {
                var3 = var9 + -var8;
                break L6;
              }
            }
            L7: {
              var10 = ((ik) this).field_m[var7];
              if (var8 + var10 > var6) {
                var6 = var10 + var8;
                break L7;
              } else {
                break L7;
              }
            }
            if (var5 > var10 - var8) {
              var5 = -var8 + var10;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        ((ik) this).field_l = ((ik) this).field_l + ((ik) this).field_q;
        var2 = ((ik) this).field_l >> 1866014722;
        if (param0 == -2857) {
          L0: {
            if (((ik) this).field_j == null) {
              break L0;
            } else {
              L1: {
                if (((ik) this).field_q <= -1) {
                  break L1;
                } else {
                  if (-1 > var2 - -((ik) this).field_j.field_v + ((ik) this).field_j.field_s) {
                    ((ik) this).f(param0 + 2857);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 >= ((ik) this).field_q) {
                break L0;
              } else {
                if (var2 + ((ik) this).field_j.field_v > 640) {
                  ((ik) this).f(0);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != 59) {
            field_k = null;
        }
        field_k = null;
    }

    ik(int param0, int param1) {
        int var3 = 0;
        boolean[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ((ik) this).field_p = -1;
        var3 = 5 - -va.a(6, (byte) 122, hg.field_e);
        ((ik) this).field_o = new int[var3];
        ((ik) this).field_m = new int[var3];
        ((ik) this).field_s = new int[var3];
        ((ik) this).field_o[0] = va.a(25, (byte) 125, hg.field_e) + 25;
        var4 = new boolean[var3];
        var5 = 1;
        L0: while (true) {
          if (var5 >= var3) {
            L1: {
              ((ik) this).field_q = param0 + va.a(param1 - param0, (byte) 123, hg.field_e);
              if (va.a(2, (byte) 120, hg.field_e) != 0) {
                break L1;
              } else {
                ((ik) this).field_q = -((ik) this).field_q;
                break L1;
              }
            }
            ((ik) this).field_r = va.a(128, (byte) 120, hg.field_e) + 128;
            ((ik) this).field_n = (int)Math.sqrt((double)va.a(230400, (byte) 121, hg.field_e));
          } else {
            L2: {
              var6 = -1 + var5 >> 51355873;
              if (-2 != (var5 ^ -1)) {
                if (var5 == 2) {
                  var7 = 0;
                  break L2;
                } else {
                  var7 = var4[var6] ? 1 : 0;
                  break L2;
                }
              } else {
                var7 = 1;
                break L2;
              }
            }
            L3: {
              var4[var5] = var7 != 0;
              var8 = ((ik) this).field_o[var6];
              ((ik) this).field_o[var5] = (var8 >> -751457247) + va.a(var8 + -(var8 >> -1746898431), (byte) 127, hg.field_e);
              if (-3 >= (((ik) this).field_o[var5] ^ -1)) {
                break L3;
              } else {
                ((ik) this).field_o[var5] = 2;
                break L3;
              }
            }
            L4: {
              var9 = ((ik) this).field_o[var5];
              var10 = var8 + (-var9 + va.a((var9 >> -965763967) + var9, (byte) 125, hg.field_e));
              var11 = va.a(512, (byte) 125, hg.field_e);
              if (var7 == 0) {
                // wide iinc 11 1280
                break L4;
              } else {
                // wide iinc 11 256
                break L4;
              }
            }
            var12 = var10 * be.field_l[var11] >> -2063447280;
            var13 = var10 * be.field_o[var11] >> -1031670960;
            ((ik) this).field_s[var5] = var12 + ((ik) this).field_s[var6];
            ((ik) this).field_m[var5] = var13 + ((ik) this).field_m[var6];
            var5++;
            continue L0;
          }
        }
    }

    static {
    }
}
