/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static ut[] field_g;
    boolean field_o;
    int field_c;
    int field_q;
    int field_n;
    private int field_s;
    static hd field_r;
    int field_a;
    int field_m;
    static String field_l;
    static String field_k;
    int field_j;
    int field_i;
    private boolean field_d;
    private boolean field_b;
    int field_p;
    int field_f;
    static String[] field_e;
    int field_h;

    public final String toString() {
        StringBuilder var2 = null;
        StringBuilder stackIn_1_0 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_3_0 = null;
        String stackIn_3_1 = null;
        StringBuilder stackOut_0_0 = null;
        StringBuilder stackOut_2_0 = null;
        String stackOut_2_1 = null;
        StringBuilder stackOut_1_0 = null;
        String stackOut_1_1 = null;
        L0: {
          var2 = new StringBuilder();
          stackOut_0_0 = (StringBuilder) var2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!((jc) this).field_o) {
            stackOut_2_0 = (StringBuilder) (Object) stackIn_2_0;
            stackOut_2_1 = "away";
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (StringBuilder) (Object) stackIn_1_0;
            stackOut_1_1 = "home";
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        StringBuilder discarded$9 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_1);
        StringBuilder discarded$10 = var2.append(" resigntime=" + ((jc) this).field_p);
        StringBuilder discarded$11 = var2.append(" reward=" + ((jc) this).field_d);
        StringBuilder discarded$12 = var2.append(" member=" + ((jc) this).field_b);
        StringBuilder discarded$13 = var2.append(" tackles=" + ((jc) this).field_m + "." + ((jc) this).field_c + "." + ((jc) this).field_n + "." + ((jc) this).field_a);
        StringBuilder discarded$14 = var2.append(" kicks=" + ((jc) this).field_i + "." + ((jc) this).field_f + "." + ((jc) this).field_q);
        StringBuilder discarded$15 = var2.append(" crosses=" + ((jc) this).field_j);
        StringBuilder discarded$16 = var2.append(" headers=" + ((jc) this).field_h);
        StringBuilder discarded$17 = var2.append(" tot_goals=" + ((jc) this).field_s);
        return "LoggedPlayer{" + var2.toString() + "}";
    }

    final static long a(CharSequence param0, boolean param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (!param1) {
            break L0;
          } else {
            int discarded$2 = jc.a(-79, true);
            break L0;
          }
        }
        var2 = 0L;
        var4 = param0.length();
        var5 = 0;
        L1: while (true) {
          L2: {
            if (var5 >= var4) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(var6 + 1 + -65);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (122 < var6) {
                      break L5;
                    } else {
                      var2 = var2 + (long)(-97 + (1 + var6));
                      break L3;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(27 + (var6 - 48));
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (-1L != (var2 % 37L ^ -1L)) {
                break L7;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
            field_g = null;
        }
        return 2 * param0;
    }

    final void a(boolean param0, jc param1) {
        ((jc) this).field_c = param1.field_c;
        ((jc) this).field_s = param1.field_s;
        ((jc) this).field_b = param1.field_b;
        ((jc) this).field_o = param1.field_o;
        ((jc) this).field_j = param1.field_j;
        ((jc) this).field_h = param1.field_h;
        ((jc) this).field_p = param1.field_p;
        ((jc) this).field_a = param1.field_a;
        ((jc) this).field_d = param1.field_d;
        ((jc) this).field_f = param1.field_f;
        ((jc) this).field_i = param1.field_i;
        ((jc) this).field_n = param1.field_n;
        ((jc) this).field_m = param1.field_m;
        if (!param0) {
            return;
        }
        ((jc) this).field_q = param1.field_q;
    }

    final static boolean b(int param0) {
        if (param0 != -3197) {
            field_k = null;
        }
        return nq.a(false, qi.field_o, ik.field_A);
    }

    public static void a(int param0) {
        if (param0 != 48) {
            return;
        }
        field_e = null;
        field_l = null;
        field_g = null;
        field_k = null;
        field_r = null;
    }

    public jc() {
        ((jc) this).field_p = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Shortcut Reference";
        field_k = "Buyout";
        field_e = new String[]{"live feed", "overview", "game stats"};
    }
}
