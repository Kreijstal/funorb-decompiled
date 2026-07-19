/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends jq {
    private int field_j;
    private int field_q;
    static String[] field_l;
    private int field_k;
    static sq field_m;
    private int field_o;
    static String field_i;
    static String field_n;
    static ba field_r;
    static java.applet.Applet field_h;
    static String field_p;

    final static boolean a(String param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() < vb.field_h) {
                  break L1;
                } else {
                  if (param0.length() <= fg.field_Y) {
                    L2: {
                      if (param1 == -113) {
                        break L2;
                      } else {
                        var3 = (String) null;
                        discarded$2 = nh.a((String) null, (byte) 14);
                        break L2;
                      }
                    }
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("nh.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    nh(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_q = param2;
        this.field_j = param0;
        this.field_o = param3;
        this.field_k = param1;
    }

    public static void a(boolean param0) {
        field_h = null;
        field_m = null;
        field_i = null;
        field_n = null;
        field_l = null;
        if (param0) {
          field_n = (String) null;
          field_r = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_p = null;
          return;
        }
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 < 26) {
            field_i = (String) null;
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 >= -31) {
            this.field_k = 41;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param2 != 45) {
          return;
        } else {
          var4 = param1 * this.field_j >> 1364542028;
          var5 = this.field_q * param1 >> -1604299572;
          var6 = param0 * this.field_k >> 1654680684;
          var7 = param0 * this.field_o >> -812871380;
          eh.a(var7, var5, (byte) -4, var6, this.field_a, var4);
          return;
        }
    }

    static {
        field_l = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_m = new sq();
        field_i = "2 players compete to paint as much of the map as possible in their own colour - either purple or blue. In this mode you can only pick up your own colour of paint and any paint you pick up is immediately replaced. Also note that you can't paint the blocks that the paint pots are on. When the time limit is reached, the player with the most blocks of their colour is victorious.";
        field_n = "<%0> is already on your friend list.";
        field_r = new ba();
        field_p = "Unpacking graphics";
    }
}
