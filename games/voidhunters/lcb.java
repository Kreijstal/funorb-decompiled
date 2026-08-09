/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lcb extends rqa {
    static String field_p;
    static phb[] field_t;
    static llb field_r;
    static ml[] field_q;
    static String field_s;
    static boolean field_o;

    public static void a(int param0) {
        field_t = null;
        field_q = null;
        if (param0 != 0) {
            boolean[] var2 = (boolean[]) null;
            lcb.a((boolean[]) null, (boolean[]) null, (byte) 62);
        }
        field_p = null;
        field_s = null;
        field_r = null;
    }

    lcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        boolean[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                var4 = (boolean[]) null;
                lcb.a((boolean[]) null, (boolean[]) null, (byte) -94);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(151, 103));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("lcb.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean[] param0, boolean[] param1, byte param2) {
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!param0[86]) {
                break L1;
              } else {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= ecb.field_a.length) {
                    break L1;
                  } else {
                    var4 = ecb.field_a[var3_int];
                    if (!param1[var4]) {
                      L3: {
                        if (param0[var4]) {
                          L4: {
                            var5 = 1 << var3_int;
                            if (param0[81]) {
                              var5 = var5 << 10;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            stackIn_13_0 = var5;

                            if (pqa.a(var5, 11284)) {
                              stackIn_14_0 = stackIn_13_0;
                              stackIn_14_1 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = stackIn_13_0;
                              stackIn_14_1 = 1;
                              break L5;
                            }
                          }
                          ucb.a(stackIn_14_0, stackIn_14_1 != 0, 11585);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var3_int++;
                      continue L2;
                    } else {
                      var3_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            L6: {
              if (param2 == 79) {
                break L6;
              } else {
                lcb.a(-53);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("lcb.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ')');
        }
    }

    static {
        field_p = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_q = new ml[5];
        field_s = "Your email address is used to identify this account";
        field_o = true;
    }
}
