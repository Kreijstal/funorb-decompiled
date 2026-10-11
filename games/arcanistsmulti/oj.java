/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static String field_c;
    static String[] field_f;
    static boolean field_i;
    static boolean field_h;
    static String field_b;
    static String field_a;
    static String field_g;
    static int field_e;
    static String field_d;

    final static ql a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ql[] var3 = null;
        int var4 = 0;
        ql var5 = null;
        int var6 = 0;
        ql stackIn_3_0 = null;
        ql stackIn_6_0 = null;
        ql stackIn_11_0 = null;
        ql stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = fd.a(28, param1, "jagex-last-login-method");
          if (var2 == null) {
            stackIn_3_0 = vh.field_f;
            return stackIn_3_0;
          }
          var3 = rm.b(1283220456);
          if (param0 <= 106) {
            stackIn_6_0 = (ql) null;
            return stackIn_6_0;
          }
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              stackIn_14_0 = vh.field_f;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(var2, -90)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("oj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 1) {
          return;
        }
        field_a = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static ho a(int param0, boolean param1) {
        ho var2 = null;
        if (param0 == 32517) {
          var2 = new ho(true);
          var2.field_h = param1 ? true : false;
          return var2;
        }
        return (ho) null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        java.applet.Applet var14 = null;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = param4 + param2;
          var6 = param1 + param3;
          if (de.field_i < param2) {
            stackIn_4_0 = param2;
          } else {
            stackIn_4_0 = de.field_i;
          }
          var7 = stackIn_4_0;
          if (de.field_c < param1) {
            stackIn_7_0 = param1;
          } else {
            stackIn_7_0 = de.field_c;
          }
          var8 = stackIn_7_0;
          if (var5_int < de.field_h) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = de.field_h;
          }
          var9 = stackIn_10_0;
          if (de.field_k <= var6) {
            stackIn_13_0 = de.field_k;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (param2 >= de.field_i &&
            param2 < de.field_h) {
            var11 = param2 + var8 * de.field_e;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              de.field_l[var11] = 16777215;
              var11 = var11 + de.field_e * 2;
            }
          }
          if (param1 >= de.field_c &&
            de.field_k > var6) {
            var11Lifetime1 = var7 + de.field_e * param1;
            var12Lifetime1 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              de.field_l[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (param0 != -32171) {
            var14 = (java.applet.Applet) null;
            oj.a(82, (java.applet.Applet) null);
          }
          if (var5_int >= de.field_i &&
            var5_int < de.field_h) {
            var11Lifetime2 = de.field_e * ((-param2 + var5_int & 1) + var8) + var5_int;
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              de.field_l[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + de.field_e * 2;
            }
          }
          if (param1 >= de.field_c &&
            de.field_k > var6) {
            var11Lifetime3 = (1 & -param1 + var6) + de.field_e * var6 + var7;
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              de.field_l[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "oj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_i = false;
        field_c = "Your request to join has been declined.";
        field_e = 25;
        field_b = "Email address is unavailable";
        field_g = "Full screen";
        field_d = "Invite more players, or alternatively try changing the following settings:  ";
        field_a = "Home in and explode. Click to select the target destination, then hold the mouse to increase the velocity of the attack.";
    }
}
