/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jm {
    double field_m;
    static int field_j;
    int field_n;
    double field_e;
    int field_a;
    static volatile int field_o;
    int field_c;
    static String field_k;
    static ck[] field_d;
    int field_l;
    static gp field_b;
    int field_f;
    static bd field_q;
    static tf[] field_i;
    static ak field_h;
    static int[] field_g;
    static String field_s;
    static String field_p;
    int field_t;
    static boolean[][] field_r;

    final void a(byte param0) {
        int var2 = 0;
        ((jm) this).field_c = -60 + ok.a(ea.field_b, -126, 480);
        ((jm) this).field_l = ok.a(ea.field_b, -126, 50);
        ((jm) this).field_e = (double)((jm) this).field_l / 100.0 + 0.3;
        var2 = -112 / ((-40 - param0) / 47);
        ((jm) this).field_t = (int)(((jm) this).field_e * 256.0);
        ((jm) this).field_a = (int)(200.0 * (0.2 + ((jm) this).field_e));
        ((jm) this).field_f = (int)((((jm) this).field_e + 0.2) * 120.0);
        ((jm) this).field_n = ok.a(ea.field_b, -108, 2);
        if (ok.a(ea.field_b, -126, 2) != 1) {
          ((jm) this).field_m = (double)(-((jm) this).field_a);
          if (Pixelate.field_H) {
            ((jm) this).field_e = -((jm) this).field_e;
            ((jm) this).field_m = 640.0;
            return;
          } else {
            return;
          }
        } else {
          ((jm) this).field_e = -((jm) this).field_e;
          ((jm) this).field_m = 640.0;
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_s = null;
        field_h = null;
        if (param0 != -1345) {
          return;
        } else {
          field_d = null;
          field_r = null;
          field_g = null;
          field_q = null;
          field_p = null;
          return;
        }
    }

    final static String b(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var6 = "(" + oj.field_G + " " + gb.field_d + " " + tm.field_U + ") " + mn.field_e;
        if (0 < jj.field_b) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              if (var2 >= jj.field_b) {
                break L1;
              } else {
                var7 = var1 + 32;
                var3 = 255 & vi.field_o.field_k[var2];
                var4 = var3 >> 4;
                var10 = var4;
                var9 = 10;
                if (var5 != 0) {
                  if (var9 >= var10) {
                    String discarded$3 = jm.b(-28);
                    return var7;
                  } else {
                    return var7;
                  }
                } else {
                  L2: {
                    L3: {
                      if (var9 <= var10) {
                        break L3;
                      } else {
                        var4 += 48;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var4 += 55;
                    break L2;
                  }
                  L4: {
                    L5: {
                      var3 = var3 & 15;
                      if (var3 < 10) {
                        break L5;
                      } else {
                        var3 += 55;
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3 += 48;
                    break L4;
                  }
                  var8 = var7 + (char)var4;
                  var1 = var8 + (char)var3;
                  var2++;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 >= -4) {
              String discarded$4 = jm.b(-28);
              return var1;
            } else {
              return var1;
            }
          }
        } else {
          L6: {
            if (param0 < -4) {
              break L6;
            } else {
              String discarded$5 = jm.b(-28);
              break L6;
            }
          }
          return var6;
        }
    }

    jm() {
        ((jm) this).a((byte) -107);
        ((jm) this).field_m = (double)(ok.a(ea.field_b, -114, 640) + -100);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = new ck[24];
        field_o = 0;
        field_q = new bd();
        field_p = "From only <%0>/month";
        field_s = "Challenge Mode";
    }
}
