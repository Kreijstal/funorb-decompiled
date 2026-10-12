/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nw extends oj {
    boolean field_A;
    static String field_z;
    private boolean field_C;
    static String field_y;
    int field_D;

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = -81 % ((53 - param0) / 51);
        if (this.field_w != null) {
          var3 = "EventDamage: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + "), amount: " + this.field_D + ", poison: " + this.field_A;
        } else {
          var3 = "EventDamage: unit: null, amount: " + this.field_D + ", poison: " + this.field_A;
        }
        return var3;
    }

    final static kl a(int param0, int param1, byte param2, boolean param3, boolean param4) {
        if (param2 >= 98) {
          return tk.a(param1, param4, 1, false, param3, param0);
        }
        field_z = (String) null;
        return tk.a(param1, param4, 1, false, param3, param0);
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -84) {
            return false;
          }
          this.a(param2.field_xb, -26661);
          stackIn_4_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("nw.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 <= 73) {
          field_z = (String) null;
          return bl.field_b;
        }
        return bl.field_b;
    }

    final static void a(byte[] param0, String[][] param1, int param2, wk[][] param3, int param4, boolean param5, String[][] param6, int param7, kl param8, String[] param9, int param10, wk[][] param11, String[] param12, kl param13, ru[] param14, int[] param15, byte[] param16, String[] param17, kl param18, int[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
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
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          ee.a(param14, param8, -84, param19, param18);
          g.a(param10 - 716, param8);
          nl.a(param16, param7, param2, param17, param6, param0, param1, param8, param11, param3, param9, param15, param12, false, param4);
          if (param10 != -5429) {
            field_z = (String) null;
          }
          tg.a(param13, 2, param5, param8);
          hf.a(param10 + 13099);
          tr.h(14570);
          kc.d((byte) -112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("nw.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param9 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param12 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param13 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param14 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param15 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param16 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final void a(ha param0, int param1) {
        int var3_int = 0;
        if (this.field_C) {
          return;
        }
        try {
          this.field_C = true;
          if (this.field_w.field_P != 7 &&
            this.field_w.field_P != 8) {
            this.field_w.field_I = this.field_w.field_I | this.field_A;
          }
          var3_int = this.field_D;
          if (!(var3_int <= this.field_w.field_A + this.field_w.field_Y)) {
            var3_int = this.field_w.field_Y + this.field_w.field_A;
          }
          this.field_w.a(this.field_D, true);
          if (param1 != -26661) {
            field_y = (String) null;
          }
          if (param0.field_b) {
            param0.field_zb[this.field_w.field_O] = param0.field_zb[this.field_w.field_O] + var3_int;
            param0.d(this.field_w.field_O, param0.field_zb[this.field_w.field_O], 72, 11);
          }
          hf.a(param0, (byte) 9, true);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "nw.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, boolean param1) {
        rl.field_C.a(0, -122, 0);
        if (param0 != 92) {
          field_z = (String) null;
        }
    }

    final static String a(String param0, byte param1, int param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        hl var7 = null;
        hl var8 = null;
        bv var9 = null;
        CharSequence var10 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!hg.a((byte) -31, var10)) {
            stackIn_3_0 = bc.field_d;
            return stackIn_3_0;
          }
          if (th.field_a != 2) {
            stackIn_7_0 = ql.field_l;
            return stackIn_7_0;
          }
          var8 = lg.a(param0, (byte) -34);
          if (var8 == null) {
            stackIn_10_0 = fo.a(4800, sc.field_d, new String[]{param0});
            return stackIn_10_0;
          }
          wh.field_c.a(true, var8);
          while (true) {
            var7 = (hl) (wh.field_c.a((byte) 123));
            if (var7 != null) {
              var7.field_Ob = var7.field_Ob - 1;
              continue;
            }
            break;
          }
          var8.d(param1 ^ -103);
          if (param1 != -27) {
            field_y = (String) null;
          }
          var8.c((byte) -76);
          dj.field_a = dj.field_a - 1;
          var9 = vl.field_n;
          var9.h(32161, param2);
          var9.field_q = var9.field_q + 1;
          var5 = var9.field_q;
          var9.b(1, 1);
          var9.b(param0, 13851);
          var9.e(var9.field_q - var5, 5930);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("nw.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 != -26) {
          return;
        }
        field_y = null;
        field_z = null;
    }

    nw(jd param0, int param1, boolean param2) {
        try {
          this.field_w = param0;
          this.field_m = 15;
          this.field_A = param2 ? true : false;
          this.field_D = param1;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "nw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_z = "Login";
        field_y = "Error connecting to server. Please try using a different server.";
    }
}
