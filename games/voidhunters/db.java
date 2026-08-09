/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends rqa {
    static String[] field_o;
    static phb field_p;
    static String field_r;
    static int field_q;

    final static void a(java.awt.Frame param0, eab param1, byte param2) {
        mob var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param0, (byte) 102);
              L2: while (true) {
                if (0 != var3.field_f) {
                  if (var3.field_f == 1) {
                    param0.setVisible(false);
                    param0.dispose();
                    var3_int = -124 % ((param2 - 76) / 32);
                    break L0;
                  } else {
                    gdb.b(-58, 100L);
                    continue L1;
                  }
                } else {
                  gdb.b(68, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("db.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        if (param0 == 70) {
          if (vq.field_x != null) {
            if (vq.field_x.field_e == null) {
              return false;
            } else {
              L0: {
                if (vq.field_x.field_e.field_b.field_a != 1) {
                  stackIn_16_0 = 0;
                  break L0;
                } else {
                  stackIn_16_0 = 1;
                  break L0;
                }
              }
              return stackIn_16_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          field_p = (phb) null;
          if (vq.field_x != null) {
            if (vq.field_x.field_e == null) {
              return false;
            } else {
              L1: {
                if (vq.field_x.field_e.field_b.field_a != 1) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    db(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
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
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (nc[]) null;
                this.a((nc[]) null, -101);
                break L1;
              }
            }
            stackIn_3_0 = new nc(frb.a(193, 108));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("db.A(");

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

    final static void a(String[] args, byte[] param1, asb param2, asb param3, asb param4, phb[][] param5, String[] param6, int param7, String[][] param8, byte[] param9, int param10, int param11, boolean param12, int[] param13, int param14, int[] param15, String[][] param16, phb[][] param17, caa[] param18) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          L0: {
            var20 = (String[]) null;
            mk.a((byte) 25, param15, param3, param4, param18, param13, param8, param2, param16, param1, param9, args, param17, param14, param5, param10, (String[]) null, param12, param7, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var19 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var19);

            stackIn_4_1 = new StringBuilder().append("db.C(");

            if (args == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param5 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param6 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param9 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param14).append(',');

            if (param15 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param16 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

            if (param17 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_43_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(',');

            if (param18 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L14;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L14;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_44_2 + ')');
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_r = null;
        field_o = null;
        if (param0 != 193) {
            field_r = (String) null;
        }
    }

    static {
        field_p = new phb(270, 70);
        field_r = "Hull spike";
        field_q = 128;
    }
}
