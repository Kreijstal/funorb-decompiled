/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends wf {
    static java.awt.Canvas field_k;
    int field_h;
    int field_g;
    static pd field_l;
    int field_i;
    int field_p;
    int field_o;
    int field_j;
    static int[] field_n;
    static int field_m;

    public static void d(int param0) {
        if (param0 <= 35) {
          field_n = (int[]) null;
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        } else {
          field_k = null;
          field_n = null;
          field_l = null;
          return;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              a.a(37, (java.awt.Component) ((Object) param0));
              kc.a((byte) 104, (java.awt.Component) ((Object) param0));
              if (ga.field_a == null) {
                break L1;
              } else {
                ga.field_a.a((byte) -88, (java.awt.Component) ((Object) param0));
                break L1;
              }
            }
            if (param1 >= 95) {
              break L0;
            } else {
              field_k = (java.awt.Canvas) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("gd.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        String discarded$1 = null;
        int var4 = 0;
        if (param0 < -80) {
          var4 = 0;
          if (param3) {
            L0: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (param1) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return ba.field_l[var4];
          } else {
            L2: {
              if (param2) {
                var4 += 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return ba.field_l[var4];
          }
        } else {
          discarded$1 = gd.a((byte) -80, false, false, false);
          var4 = 0;
          if (!param3) {
            L4: {
              if (param2) {
                var4 += 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param1) {
                var4++;
                break L5;
              } else {
                break L5;
              }
            }
            return ba.field_l[var4];
          } else {
            L6: {
              var4 += 4;
              if (param2) {
                var4 += 2;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1) {
                var4++;
                break L7;
              } else {
                break L7;
              }
            }
            return ba.field_l[var4];
          }
        }
    }

    gd(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_p = param4;
        this.field_j = param2;
        this.field_i = param3;
        this.field_o = param1;
        this.field_h = param0;
        this.field_g = param5;
    }

    static {
        field_l = new pd();
        field_n = new int[]{3620, 2775, 2145, 1670, 1315, 1050, 850, 700, 587, 500, 440, 392, 357, 330, 310};
    }
}
