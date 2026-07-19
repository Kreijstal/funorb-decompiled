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
          stackOut_0_0 = (StringBuilder) (var2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!this.field_o) {
            stackOut_2_0 = (StringBuilder) ((Object) stackIn_2_0);
            stackOut_2_1 = "away";
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (StringBuilder) ((Object) stackIn_1_0);
            stackOut_1_1 = "home";
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        StringBuilder discarded$9 = ((StringBuilder) (Object) stackIn_3_0).append(stackIn_3_1);
        StringBuilder discarded$10 = var2.append(" resigntime=" + this.field_p);
        StringBuilder discarded$11 = var2.append(" reward=" + this.field_d);
        StringBuilder discarded$12 = var2.append(" member=" + this.field_b);
        StringBuilder discarded$13 = var2.append(" tackles=" + this.field_m + "." + this.field_c + "." + this.field_n + "." + this.field_a);
        StringBuilder discarded$14 = var2.append(" kicks=" + this.field_i + "." + this.field_f + "." + this.field_q);
        StringBuilder discarded$15 = var2.append(" crosses=" + this.field_j);
        StringBuilder discarded$16 = var2.append(" headers=" + this.field_h);
        StringBuilder discarded$17 = var2.append(" tot_goals=" + this.field_s);
        return "LoggedPlayer{" + var2.toString() + "}";
    }

    final static long a(CharSequence param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_23_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_22_0 = 0L;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                discarded$1 = jc.a(-79, true);
                break L1;
              }
            }
            var2_long = 0L;
            var4 = param0.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var5 >= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(var6 + 1 + -65);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (122 < var6) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(-97 + (1 + var6));
                          break L4;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(27 + (var6 - 48));
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (177917621779460413L > var2_long) {
                    var5++;
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (-1L != (var2_long % 37L ^ -1L)) {
                    break L8;
                  } else {
                    if (-1L == (var2_long ^ -1L)) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_22_0 = var2_long;
                stackIn_23_0 = stackOut_22_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("jc.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        return stackIn_23_0;
    }

    final static int a(int param0, boolean param1) {
        if (!param1) {
            field_g = (ut[]) null;
        }
        return 2 * param0;
    }

    final void a(boolean param0, jc param1) {
        this.field_c = param1.field_c;
        this.field_s = param1.field_s;
        this.field_b = param1.field_b;
        this.field_o = param1.field_o;
        this.field_j = param1.field_j;
        this.field_h = param1.field_h;
        this.field_p = param1.field_p;
        this.field_a = param1.field_a;
        this.field_d = param1.field_d;
        this.field_f = param1.field_f;
        this.field_i = param1.field_i;
        this.field_n = param1.field_n;
        this.field_m = param1.field_m;
        if (!param0) {
            return;
        }
        try {
            this.field_q = param1.field_q;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "jc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        if (param0 != -3197) {
            field_k = (String) null;
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
        this.field_p = -1;
    }

    static {
        field_l = "Shortcut Reference";
        field_k = "Buyout";
        field_e = new String[]{"live feed", "overview", "game stats"};
    }
}
