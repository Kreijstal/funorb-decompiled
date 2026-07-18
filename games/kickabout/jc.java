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
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var5 >= var4) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(var6 - 64);
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
                          var2_long = var2_long + (long)(-97 + (1 + var6));
                          break L3;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L3;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(27 + (var6 - 48));
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackOut_20_0 = var2_long;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("jc.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + false + ')');
        }
        return stackIn_21_0;
    }

    final static int a(int param0, boolean param1) {
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
        try {
            ((jc) this).field_q = param1.field_q;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "jc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        return nq.a(false, qi.field_o, ik.field_A);
    }

    public static void a(int param0) {
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
