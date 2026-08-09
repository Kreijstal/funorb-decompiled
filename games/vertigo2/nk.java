/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends cr {
    static String field_Ib;
    cr field_Jb;
    private cr field_Lb;
    static String field_Kb;
    static r field_Hb;

    public static void a(byte param0) {
        if (param0 >= -7) {
          field_Ib = (String) null;
          field_Kb = null;
          field_Ib = null;
          field_Hb = null;
          return;
        } else {
          field_Kb = null;
          field_Ib = null;
          field_Hb = null;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null == this.field_Lb) {
            break L0;
          } else {
            var4 = this.field_Lb.j(-21391);
            break L0;
          }
        }
        L1: {
          if (this.field_Jb == null) {
            break L1;
          } else {
            var5 = this.field_Jb.b(2, -param0 + (-param2 + this.field_Fb - var4) - param2);
            break L1;
          }
        }
        var6 = param2 + var5 + (param2 + var4) + param0;
        if (param1 == 29138) {
          L2: {
            if (var6 <= this.field_Fb) {
              break L2;
            } else {
              var5 = var5 + (this.field_Fb + -var6);
              var6 = this.field_Fb;
              break L2;
            }
          }
          L3: {
            if (1 != this.field_O) {
              break L3;
            } else {
              param2 = param2 + (-var6 + this.field_Fb) / 2;
              break L3;
            }
          }
          L4: {
            if (-3 == (this.field_O ^ -1)) {
              param2 = param2 + (-var6 + this.field_Fb);
              break L4;
            } else {
              break L4;
            }
          }
          if (this.field_Lb == null) {
            if (this.field_Jb != null) {
              this.field_Jb.a(79, var5, this.field_db, 0, param0 + (param2 - -var4));
              if (this.field_Lb != null) {
                this.field_Jb.field_O = 0;
                this.field_Jb.field_ab = this.field_ab;
                return;
              } else {
                this.field_Jb.field_O = this.field_O;
                this.field_Jb.field_ab = this.field_ab;
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_Lb.a(123, var4, this.field_db, 0, param2);
            this.field_Lb.field_ab = this.field_ab;
            if (this.field_Jb != null) {
              this.field_Jb.a(79, var5, this.field_db, 0, param0 + (param2 - -var4));
              if (this.field_Lb != null) {
                this.field_Jb.field_O = 0;
                this.field_Jb.field_ab = this.field_ab;
                return;
              } else {
                this.field_Jb.field_O = this.field_O;
                this.field_Jb.field_ab = this.field_ab;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(86, param1, param3, param0, param6);
        if (param5 != 1) {
          nk.a((byte) -127);
          this.a(param2, 29138, param4);
          return;
        } else {
          this.a(param2, 29138, param4);
          return;
        }
    }

    final static void a(int param0, String[][] param1, r param2, byte param3, int param4, byte[] param5, er[][] param6, String[][] param7, String[] param8, byte[] param9, String[] param10, er[][] param11, r param12, r param13, int[] param14, int param15, boolean param16, u[] param17, int[] param18) {
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
        int var19_int = 0;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          L0: {
            var19_int = -13 % ((param3 - -24) / 45);
            var20 = (String[]) null;
            mj.a(1, param17, param2, param1, param5, param0, param6, param10, param11, param12, param14, param9, param7, (String[]) null, param16, param8, param18, -23161, param4, param13);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var19 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var19);

            stackIn_4_1 = new StringBuilder().append("nk.C(").append(param0).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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

            if (param6 == null) {
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

            if (param7 == null) {
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

            if (param8 == null) {
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

            if (param9 == null) {
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


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param10 == null) {
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

            if (param11 == null) {
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


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param12 == null) {
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


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param13 == null) {
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

            if (param14 == null) {
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


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param15).append(',').append(param16).append(',');

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
          throw wn.a((Throwable) ((Object) stackIn_5_0), stackIn_44_2 + ')');
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != -24692) {
            int[] var6 = (int[]) null;
            nk.a(-81, (String[][]) null, (r) null, (byte) -46, -84, (byte[]) null, (er[][]) null, (String[][]) null, (String[]) null, (byte[]) null, (String[]) null, (er[][]) null, (r) null, (r) null, (int[]) null, 45, true, (u[]) null, (int[]) null);
            var4 = -param1;
            if (this.field_Lb != null) {
                var4 = this.field_Lb.j(-21391);
            }
            var5 = -param1;
            if (null != this.field_Jb) {
                var5 = this.field_Jb.j(-21391);
            }
            return param0 + (var4 - -param1) - (-var5 - param0);
        }
        var4 = -param1;
        if (this.field_Lb != null) {
            var4 = this.field_Lb.j(-21391);
        }
        var5 = -param1;
        if (null != this.field_Jb) {
            var5 = this.field_Jb.j(-21391);
        }
        return param0 + (var4 - -param1) - (-var5 - param0);
    }

    nk(long param0, cr param1, cr param2, cr param3, er param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                this.field_Lb = new cr(0L, param2);
                this.field_Lb.field_Db = param4;
                this.b(this.field_Lb, 119);
                break L1;
              }
            }
            L2: {
              if (param5 != null) {
                this.field_Jb = new cr(0L, param3, param5);
                this.b(this.field_Jb, 122);
                this.i(-2147483648);
                break L2;
              } else {
                this.i(-2147483648);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_22_2 + ')');
        }
    }

    static {
        field_Ib = "<%0> has declined the invitation.";
    }
}
