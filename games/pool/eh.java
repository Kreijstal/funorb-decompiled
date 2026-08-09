/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends ma {
    static nl field_l;
    int field_v;
    String[][] field_m;
    long[][] field_q;
    static int[] field_s;
    static String field_n;
    static int field_o;
    int field_r;
    static int field_t;
    int field_A;
    boolean field_u;
    int[][] field_z;
    static int field_x;
    static dd field_y;
    static int[] field_p;
    static int[] field_w;

    final static ke c(int param0) {
        String var1;
        L0: {
          var1 = sa.a(false);
          if (var1 == null) {
            break L0;
          } else {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 != 8388) {
          eh.a(115, true);
          return new ke(sa.a(false), sp.h(0));
        } else {
          return new ke(sa.a(false), sp.h(0));
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        oj var4 = null;
        eh var5 = null;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            var4 = (oj) ((Object) ta.field_i.c((byte) 81));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    eh.a(104);
                    break L2;
                  }
                }
                var5 = (eh) ((Object) wg.field_Lb.c((byte) -49));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    ub.a(var5, param0, (byte) -126);
                    var5 = (eh) ((Object) wg.field_Lb.f((byte) -5));
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (param1) {
                    stackIn_6_0 = 0;
                    break L4;
                  } else {
                    stackIn_6_0 = 1;
                    break L4;
                  }
                }
                ch.a(stackIn_6_0 != 0, var4, param0);
                var4 = (oj) ((Object) ta.field_i.f((byte) -5));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "eh.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        lr var2;
        if (param0 <= 69) {
          var2 = (lr) null;
          eh.a(-96, 113, (dd[]) null, (lr) null, -106, (dd[]) null, 56, -114, -28, 47, (dd[]) null, -80, -127, (lr) null, -116, -112, -82, 45, -61, -51);
          field_p = null;
          field_s = null;
          field_n = null;
          field_w = null;
          field_y = null;
          field_l = null;
          return;
        } else {
          field_p = null;
          field_s = null;
          field_n = null;
          field_w = null;
          field_y = null;
          field_l = null;
          return;
        }
    }

    final static void a(int param0, int param1, dd[] param2, lr param3, int param4, dd[] param5, int param6, int param7, int param8, int param9, dd[] param10, int param11, int param12, lr param13, int param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            if (param8 == 19539) {
              mm.a(param15, param1, param9, param14, param13, param7, param11, param18, param17, param6, new nm(param2), param12, param19, new nm(param5), param3, param0, param8 ^ 19537, param16, param4, new nm(param10));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("eh.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param14 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    eh() {
    }

    static {
        field_l = new nl();
        field_s = new int[12];
        field_o = 2;
        field_p = new int[12];
        field_x = 0;
        field_n = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
