/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class db {
    static boolean field_d;
    static int field_b;
    String field_e;
    static String[] field_g;
    static dk field_h;
    static String field_f;
    static tg field_a;
    int field_c;

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = -128 / ((param0 - 3) / 40);
        return new java.net.Socket(this.field_e, this.field_c);
    }

    final static de a(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        de[] var3 = null;
        de var5 = null;
        int var6 = 0;
        de stackIn_4_0 = null;
        de stackIn_12_0 = null;
        de stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var2 = ha.a(param1, "jagex-last-login-method", -15645);
          if (var2 == null) {
            stackIn_4_0 = h.field_Y;
            return stackIn_4_0;
          }
          if (param0 > -41) {
            field_a = (tg) null;
          }
          var3 = sh.b(-26);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, 8)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = h.field_Y;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("db.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        java.awt.Component var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var5 < var3_int; var5++) {
                if (oa.a(-4278, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!fg.a((CharSequence) ((Object) var7_ref_String), -110)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = dj.a((CharSequence) ((Object) var7_ref_String), -109);
              var4 = var4 + (param2[var8].length() + (var6_int - var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              if (param1 > -11) {
                var12 = (java.awt.Component) null;
                db.a(-107, (java.awt.Component) null);
              }
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (oa.a(-4278, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!fg.a((CharSequence) ((Object) var9), -114)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = dj.a((CharSequence) ((Object) var9), -115);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("db.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_a = null;
        field_g = null;
        field_h = null;
        if (!param0) {
          field_d = false;
        }
    }

    final static String b(int param0) {
        if (param0 != 0) {
          field_b = 40;
        }
        return d.field_U;
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = SteelSentinels.obfuscationControl;
        try {
          for (var1_int = 0; var1_int < 10000; var1_int++) {
            k.field_Cb[var1_int].i(-15809);
          }
          if (param0 != 10000) {
            field_f = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "db.H(" + param0 + ')');
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          param1.addKeyListener(wc.field_i);
          param1.addFocusListener(wc.field_i);
          if (param0 != -1) {
            field_a = (tg) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "db.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new String[]{"Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "Can be targeted. Works with AMARDS.", "", "Recommended for use with targeter.", "", "", "Anti-rocket weapon.", "", "Anti-rocket weapon. Works with AMARDS.", "Can be targeted. Works with AMARDS.", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "", "", "", "", "", "Can be targeted. Works with AMARDS.", "", "", "", "Can be targeted.", "", "Can only be fitted onto the Golem chassis.", "", "Recommended for use with targeter.", "Can be targeted."};
        field_f = "Training drone";
    }
}
