/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static String[] field_j;
    static String field_g;
    String field_f;
    static int[] field_d;
    String field_i;
    static w field_e;
    static String[] field_h;
    boolean field_c;
    static String[] field_a;
    static ck field_b;

    final static String a(String param0, String param1, int param2, byte param3) {
        RuntimeException var4 = null;
        uf var5 = null;
        int var6 = 0;
        wb var7 = null;
        CharSequence var8 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 122) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var8 = (CharSequence) ((Object) param0);
          if (!dc.a(var8, (byte) -70)) {
            stackIn_5_0 = ge.field_d;
            return stackIn_5_0;
          }
          if (jj.field_b != 2) {
            stackIn_9_0 = be.field_s;
            return stackIn_9_0;
          }
          var7 = g.a(-3805, param1);
          if (var7 == null) {
            stackIn_13_0 = cm.$cfr$intArgs$a$53ce4ab4c593(97, ii.field_r, new String[]{param1});
            return stackIn_13_0;
          }
          var7.b((byte) 109);
          var7.e((byte) 74);
          ed.field_g = ed.field_g - 1;
          var5 = we.field_b;
          var5.f(param2, -4);
          var5.field_n = var5.field_n + 1;
          var6 = var5.field_n;
          var5.a(true, 3);
          var5.a(0, param0);
          var5.b(var5.field_n - var6, true);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("sg.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        if (param0 == 3) {
          field_j = null;
          field_a = null;
          field_h = null;
          field_g = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        sg.a((String) null, (String) null, 114, (byte) 124);
        field_j = null;
        field_a = null;
        field_h = null;
        field_g = null;
        field_d = null;
    }

    final static ql a(int param0, fd param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ql var7 = null;
        fd var8 = null;
        java.awt.Frame var9 = null;
        ql stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 54) {
            var8 = (fd) null;
            sg.a(-76, (fd) null, 0, 22, 26, 93);
          }
          var9 = jh.a(param5, param1, param0, param2, false, param3);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new ql();
          var7.field_g = var9;
          var7.field_g.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("sg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(String[][] param0, boolean param1, byte[] param2, ji param3, int[] param4, byte param5, String[][] param6, String[] param7, int param8, byte[] param9, pi[] param10, int[] param11, int param12, ji param13, String[] param14, ji param15, ck[][] param16, ck[][] param17, int param18) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          if (param5 > -2) {
            sg.a((String) null, 4, -122L);
          }
          var20 = (String[]) null;
          hb.a(param9, 1, param10, param3, param7, 3, param12, param13, param6, param17, param1, param4, param16, param2, param0, param15, param18, param14, param11, (String[]) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_6_0 = var19;
          stackIn_6_1 = new StringBuilder().append("sg.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param18).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, long param2) {
        wb var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = ed.a(param0, (byte) 16);
          if (param1 <= 111) {
            field_e = (w) null;
          }
          if (var4 != null &&
            var4.field_Vb != null) {
            return true;
          }
          stackIn_11_0 = (cd.field_m != null) && (bj.a(param2, (byte) 50) != null);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("sg.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_j = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = new String[]{"Before playing a multiplayer game, please learn the ropes by completing the first 3 stages of Stamina Mode. It will only take a few minutes.", "Congratulations! The multiplayer game is now unlocked.<br><br>If you wish, you can continue playing Stamina Mode, or you can end this game any time and enter the multiplayer lobby. Press 'ESC' for the Options Menu."};
        field_a = new String[3];
        field_g = "You are offering to draw.";
    }
}
