/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static String field_b;
    static String field_d;
    static String field_c;
    static String field_i;
    static String field_a;
    private static int field_f;
    static int field_g;
    static String field_h;
    static String field_e;

    final static boolean a(di param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_4_0 = param0.c(-63);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ab.D(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_a = null;
        if (param0 > -46) {
          field_a = (String) null;
          field_i = null;
          field_b = null;
          field_d = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_i = null;
          field_b = null;
          field_d = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            L0: {
              if (param0 == 25692) {
                break L0;
              } else {
                field_d = (String) null;
                break L0;
              }
            }
            try {
              L1: {
                mo.a("resizing", new Object[]{new Integer(param1)}, param0 ^ 25619, hk.d(116));
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        if (!(gk.field_kb)) {
            throw new IllegalStateException();
        }
        mf.field_o = true;
        ii.a(false, param0 ^ param0);
        fk.field_ab = 0;
    }

    final static String a(int param0, byte param1) {
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_5_0 = null;
        String stackIn_5_1 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_8_0 = null;
        String stackIn_8_1 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_11_1 = null;
        StringBuilder stackIn_13_0 = null;
        StringBuilder stackIn_14_0 = null;
        String stackIn_14_1 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_19_0 = null;
        StringBuilder stackIn_20_0 = null;
        String stackIn_20_1 = null;
        StringBuilder stackIn_22_0 = null;
        StringBuilder stackIn_23_0 = null;
        String stackIn_23_1 = null;
        StringBuilder stackIn_25_0 = null;
        StringBuilder stackIn_26_0 = null;
        String stackIn_26_1 = null;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_29_0 = null;
        String stackIn_29_1 = null;
        StringBuilder stackIn_31_0 = null;
        StringBuilder stackIn_32_0 = null;
        String stackIn_32_1 = null;
        StringBuilder stackIn_34_0 = null;
        StringBuilder stackIn_35_0 = null;
        String stackIn_35_1 = null;
        StringBuilder stackIn_37_0 = null;
        StringBuilder stackIn_38_0 = null;
        String stackIn_38_1 = null;
        L0: {
          if (param1 == 10) {
            break L0;
          } else {
            ab.a(-112, (byte) -4);
            break L0;
          }
        }
        L1: {
          stackIn_4_0 = new StringBuilder();

          if ((param0 & nd.field_j) != 0) {
            stackIn_5_0 = (StringBuilder) ((Object) stackIn_4_0);
            stackIn_5_1 = "cont vis|";
            break L1;
          } else {
            stackIn_5_0 = (StringBuilder) ((Object) stackIn_4_0);
            stackIn_5_1 = "";
            break L1;
          }
        }
        L2: {
          stackIn_7_0 = ((StringBuilder) (Object) stackIn_5_0).append(stackIn_5_1);

          if ((param0 & sg.field_O) == 0) {
            stackIn_8_0 = (StringBuilder) ((Object) stackIn_7_0);
            stackIn_8_1 = "";
            break L2;
          } else {
            stackIn_8_0 = (StringBuilder) ((Object) stackIn_7_0);
            stackIn_8_1 = "gv visit+1|";
            break L2;
          }
        }
        L3: {
          stackIn_10_0 = ((StringBuilder) (Object) stackIn_8_0).append(stackIn_8_1);

          if ((param0 & be.field_I) == 0) {
            stackIn_11_0 = (StringBuilder) ((Object) stackIn_10_0);
            stackIn_11_1 = "";
            break L3;
          } else {
            stackIn_11_0 = (StringBuilder) ((Object) stackIn_10_0);
            stackIn_11_1 = "gv shot+1|";
            break L3;
          }
        }
        L4: {
          stackIn_13_0 = ((StringBuilder) (Object) stackIn_11_0).append(stackIn_11_1);

          if ((param0 & nr.field_Q) != 0) {
            stackIn_14_0 = (StringBuilder) ((Object) stackIn_13_0);
            stackIn_14_1 = "gv BiH anywhere|";
            break L4;
          } else {
            stackIn_14_0 = (StringBuilder) ((Object) stackIn_13_0);
            stackIn_14_1 = "";
            break L4;
          }
        }
        L5: {
          stackIn_16_0 = ((StringBuilder) (Object) stackIn_14_0).append(stackIn_14_1);

          if ((param0 & nr.field_R) != 0) {
            stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
            stackIn_17_1 = "gv BiH kitchen|";
            break L5;
          } else {
            stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
            stackIn_17_1 = "";
            break L5;
          }
        }
        L6: {
          stackIn_19_0 = ((StringBuilder) (Object) stackIn_17_0).append(stackIn_17_1);

          if ((param0 & nr.field_V) != 0) {
            stackIn_20_0 = (StringBuilder) ((Object) stackIn_19_0);
            stackIn_20_1 = "gv BiH in D|";
            break L6;
          } else {
            stackIn_20_0 = (StringBuilder) ((Object) stackIn_19_0);
            stackIn_20_1 = "";
            break L6;
          }
        }
        L7: {
          stackIn_22_0 = ((StringBuilder) (Object) stackIn_20_0).append(stackIn_20_1);

          if (-1 != (ag.field_e & param0 ^ -1)) {
            stackIn_23_0 = (StringBuilder) ((Object) stackIn_22_0);
            stackIn_23_1 = "wins|";
            break L7;
          } else {
            stackIn_23_0 = (StringBuilder) ((Object) stackIn_22_0);
            stackIn_23_1 = "";
            break L7;
          }
        }
        L8: {
          stackIn_25_0 = ((StringBuilder) (Object) stackIn_23_0).append(stackIn_23_1);

          if (0 == (param0 & hm.field_e)) {
            stackIn_26_0 = (StringBuilder) ((Object) stackIn_25_0);
            stackIn_26_1 = "";
            break L8;
          } else {
            stackIn_26_0 = (StringBuilder) ((Object) stackIn_25_0);
            stackIn_26_1 = "loses|";
            break L8;
          }
        }
        L9: {
          stackIn_28_0 = ((StringBuilder) (Object) stackIn_26_0).append(stackIn_26_1);

          if (0 == (param0 & oa.field_b)) {
            stackIn_29_0 = (StringBuilder) ((Object) stackIn_28_0);
            stackIn_29_1 = "";
            break L9;
          } else {
            stackIn_29_0 = (StringBuilder) ((Object) stackIn_28_0);
            stackIn_29_1 = "group choice|";
            break L9;
          }
        }
        L10: {
          stackIn_31_0 = ((StringBuilder) (Object) stackIn_29_0).append(stackIn_29_1);

          if (-1 == (param0 & um.field_c ^ -1)) {
            stackIn_32_0 = (StringBuilder) ((Object) stackIn_31_0);
            stackIn_32_1 = "";
            break L10;
          } else {
            stackIn_32_0 = (StringBuilder) ((Object) stackIn_31_0);
            stackIn_32_1 = "respot white|";
            break L10;
          }
        }
        L11: {
          stackIn_34_0 = ((StringBuilder) (Object) stackIn_32_0).append(stackIn_32_1);

          if ((param0 & ob.field_F) != 0) {
            stackIn_35_0 = (StringBuilder) ((Object) stackIn_34_0);
            stackIn_35_1 = "rerack|";
            break L11;
          } else {
            stackIn_35_0 = (StringBuilder) ((Object) stackIn_34_0);
            stackIn_35_1 = "";
            break L11;
          }
        }
        L12: {
          stackIn_37_0 = ((StringBuilder) (Object) stackIn_35_0).append(stackIn_35_1);

          if (0 != (ll.field_f & param0)) {
            stackIn_38_0 = (StringBuilder) ((Object) stackIn_37_0);
            stackIn_38_1 = "ends turn|";
            break L12;
          } else {
            stackIn_38_0 = (StringBuilder) ((Object) stackIn_37_0);
            stackIn_38_1 = "";
            break L12;
          }
        }
        return stackIn_38_1;
    }

    static {
        field_f = 14;
        field_i = "Use this alternative as your account name";
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = "Invite more players, or alternatively try changing the following settings:  ";
        field_g = 1 << field_f;
        field_h = "Players";
        field_c = "Invite only";
        field_a = "Achievements are only awarded in Rated games,<br>unless stated otherwise.";
        field_e = "Encouraging rule breaking";
    }
}
