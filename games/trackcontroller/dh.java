/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends fc {
    static int field_l;
    int field_n;
    static String field_r;
    static String field_i;
    int field_m;
    static int field_p;
    int field_q;
    int field_k;
    int field_o;
    int field_j;

    final static nk a(int param0, int param1, int param2, int param3) {
        nk var4 = new nk();
        var4.field_i = param2;
        var4.field_m = new int[param3];
        qh.field_e.a((byte) -93, var4);
        gj.a(2, var4, param0);
        if (param1 != -1) {
          field_i = (String) null;
        }
        return var4;
    }

    final static void a(String param0, long param1, java.applet.Applet param2, String param3, int param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param4 != 1000) {
              return;
            }
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param1 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + rb.a(qg.a(false) + 1000L * param1, (byte) -101) + "; Max-Age=" + param1;
              }
              sj.a(param2, "document.cookie=\"" + var7Lifetime4 + "\"", param4 ^ -23611);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("dh.F(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_i = null;
        if (param0 > -5) {
          dh.a(95, -52, 22, 106);
        }
    }

    final static qj[] e(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        qj[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = TrackController.field_F ? 1 : 0;
        var1 = new qj[gi.field_o];
        if (param0 != 2) {
          field_p = -49;
        }
        for (var2 = 0; var2 < gi.field_o; var2++) {
          var3 = cf.field_p[var2] * j.field_f[var2];
          var20 = qk.field_M[var2];
          if (!ga.field_b[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = qe.field_z[tc.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new qj(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var21);
          } else {
            var22 = fk.field_d[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = ok.a(tc.a(var22[var7] << 24, -16777216), qe.field_z[tc.a(255, (int) var20[var7])]);
            }
            var1[var2] = (qj) ((Object) new d(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var16));
          }
        }
        ff.b(param0 + 46);
        return var1;
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          RuntimeException var3_ref = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            of.field_g = param1;
            try {
              if (param0 != -19136) {
                return;
              }
              var6 = param2.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param2.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param1.length() != 0) {
                var5Lifetime6 = var7 + "; Expires=" + rb.a(94608000000L + qg.a(false), (byte) -111) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              sj.a(param2, "document.cookie=\"" + var5Lifetime6 + "\"", -24531);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            rj.a(param2, (byte) -99);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref;
            stackIn_13_1 = new StringBuilder().append("dh.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, String[] param1, String param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (hd.a(-124, param2.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!ej.a(false, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = uk.a((CharSequence) ((Object) var7_ref_String), 10);
              var4 = var4 + (param1[var8].length() - var5 + var6_int);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          if (param0 > -40) {
            field_r = (String) null;
          }
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param2.substring(var7));
              stackIn_25_0 = var6.toString();
              return stackIn_25_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (hd.a(-114, param2.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param2.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!ej.a(false, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param2.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = uk.a((CharSequence) ((Object) var9), 10);
            discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param1[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("dh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    dh(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param4;
        this.field_o = param3;
        this.field_k = param0;
        this.field_q = param1;
        this.field_m = param5;
        this.field_n = param2;
    }

    static {
        field_r = "Reload game";
        field_i = "Create";
        field_p = 0;
    }
}
