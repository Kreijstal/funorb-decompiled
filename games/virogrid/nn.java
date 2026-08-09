/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static km field_b;
    static int field_a;

    final static void a(mg[][] param0, mg[][] param1, int param2, byte[] param3, byte[] param4, eh param5, eh param6, boolean param7, int param8, String[][] param9, String[][] param10, String[] param11, int[] param12, int param13, eh param14) {
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
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        rm[] var17 = null;
        try {
          L0: {
            L1: {
              if (param8 == -27871) {
                break L1;
              } else {
                field_a = 80;
                break L1;
              }
            }
            var17 = (rm[]) null;
            var16 = (int[]) null;
            pb.a(param4, param6, param11, param2, param7, param13, param3, (rm[]) null, param14, param12, param9, (int[]) null, param10, false, param5, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var15);

            stackIn_6_1 = new StringBuilder().append("nn.D(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param11 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param12 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L11;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param13).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L12;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L12;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_37_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2) {
        hg var3;
        var3 = gk.field_g;
        var3.g(param1, 8);
        var3.a(3, -118);
        if (param2 >= -112) {
          return;
        } else {
          var3.a(9, 66);
          var3.a((byte) -63, param0);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ca.field_D = (param1 & 53) >> -1625191100;
        qe.field_m = (param1 & 15) >> -715356830;
        if (ca.field_D <= 2) {
          el.field_t = param1 & 3;
          if (param0) {
            L0: {
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L0;
              } else {
                break L0;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              nn.a(true, -24);
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L1;
              } else {
                break L1;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          ca.field_D = 2;
          el.field_t = param1 & 3;
          if (!param0) {
            L2: {
              nn.a(true, -24);
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (el.field_t <= 2) {
              return;
            } else {
              el.field_t = 2;
              return;
            }
          } else {
            L3: {
              if (qe.field_m > 2) {
                qe.field_m = 2;
                break L3;
              } else {
                break L3;
              }
            }
            if (el.field_t > 2) {
              el.field_t = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 53) {
            field_b = (km) null;
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        eh var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              uh.a((java.awt.Component) ((Object) param0), (byte) 97);
              if (param1 < -40) {
                break L1;
              } else {
                var3 = (eh) null;
                nn.a((mg[][]) null, (mg[][]) null, -23, (byte[]) null, (byte[]) null, (eh) null, (eh) null, false, -93, (String[][]) null, (String[][]) null, (String[]) null, (int[]) null, 76, (eh) null);
                break L1;
              }
            }
            ga.a((java.awt.Component) ((Object) param0), false);
            if (sb.field_d == null) {
              break L0;
            } else {
              sb.field_d.a(31131, (java.awt.Component) ((Object) param0));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("nn.E(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 < 64) {
            return;
        }
        if (ij.field_j == null) {
            return;
        }
        if (ij.field_j.a(true, param1)) {
            ij.field_j = null;
            return;
        }
    }

    static {
    }
}
