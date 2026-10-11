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
        if (param0 < -7) {
          field_Kb = null;
          field_Ib = null;
          field_Hb = null;
          return;
        }
        field_Ib = (String) null;
        field_Kb = null;
        field_Ib = null;
        field_Hb = null;
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var4 = -param0;
        var5 = -param0;
        if (null != this.field_Lb) {
          var4 = this.field_Lb.j(-21391);
        }
        if (this.field_Jb != null) {
          var5 = this.field_Jb.b(2, -param0 + (-param2 + this.field_Fb - var4) - param2);
        }
        var6 = param2 + var5 + (param2 + var4) + param0;
        if (param1 != 29138) {
          return;
        }
        if (var6 > this.field_Fb) {
          var5 = var5 + (this.field_Fb - var6);
          var6 = this.field_Fb;
        }
        if (1 == this.field_O) {
          param2 = param2 + (-var6 + this.field_Fb) / 2;
        }
        if (this.field_O == 2) {
          param2 = param2 + (-var6 + this.field_Fb);
        }
        if (this.field_Lb != null) {
          this.field_Lb.a(123, var4, this.field_db, 0, param2);
          this.field_Lb.field_ab = this.field_ab;
        }
        if (this.field_Jb == null) {
          return;
        }
        this.field_Jb.a(79, var5, this.field_db, 0, param0 + (param2 + var4));
        if (this.field_Lb != null) {
          this.field_Jb.field_O = 0;
        } else {
          this.field_Jb.field_O = this.field_O;
        }
        this.field_Jb.field_ab = this.field_ab;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(86, param1, param3, param0, param6);
        if (param5 == 1) {
          this.a(param2, 29138, param4);
          return;
        }
        nk.a((byte) -127);
        this.a(param2, 29138, param4);
    }

    final static void a(int param0, String[][] param1, r param2, byte param3, int param4, byte[] param5, er[][] param6, String[][] param7, String[] param8, byte[] param9, String[] param10, er[][] param11, r param12, r param13, int[] param14, int param15, boolean param16, u[] param17, int[] param18) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var19_int = 0;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          var19_int = -13 % ((param3 + 24) / 45);
          var20 = (String[]) null;
          mj.a(1, param17, param2, param1, param5, param0, param6, param10, param11, param12, param14, param9, param7, (String[]) null, param16, param8, param18, -23161, param4, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_4_0 = var19;
          stackIn_4_1 = new StringBuilder().append("nk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param8 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param9 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param10 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param11 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param12 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param13 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param14 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
          if (param18 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
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
          return param0 + (var4 + param1) - (-var5 - param0);
        }
        var4Lifetime1 = -param1;
        if (this.field_Lb != null) {
          var4Lifetime1 = this.field_Lb.j(-21391);
        }
        var5Lifetime1 = -param1;
        if (null != this.field_Jb) {
          var5Lifetime1 = this.field_Jb.j(-21391);
        }
        return param0 + (var4Lifetime1 + param1) - (-var5Lifetime1 - param0);
    }

    nk(long param0, cr param1, cr param2, cr param3, er param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Lb = new cr(0L, param2);
            this.field_Lb.field_Db = param4;
            this.b(this.field_Lb, 119);
          }
          if (param5 != null) {
            this.field_Jb = new cr(0L, param3, param5);
            this.b(this.field_Jb, 122);
            this.i(-2147483648);
          } else {
            this.i(-2147483648);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_Ib = "<%0> has declined the invitation.";
    }
}
