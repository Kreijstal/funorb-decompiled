/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends mu {
    static String field_db;
    static ut field_cb;
    static int field_bb;
    static int[][] field_eb;

    vo(se param0, fd param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void a(byte param0, fd param1) {
        try {
          if (param0 > -117) {
            field_cb = (ut) null;
          }
          super.a((byte) -127, param1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "vo.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_21_0 = 0;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (gn.a(12105, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!gr.a((byte) 15, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = rr.a(10, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param2[var8].length() + (var6_int - var5));
              continue;
            }
            break;
          }
          if (param0 != -18) {
            field_bb = 91;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            stackIn_21_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_21_0; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (gn.a(12105, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!gr.a((byte) 15, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param1.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = rr.a(10, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("vo.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_cb = null;
        field_db = null;
        field_eb = (int[][]) null;
        if (param0 <= 29) {
          vo.j((byte) -47);
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        iw var16 = null;
        iw var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var16 = new iw(param1);
          var17 = var16;
          var17.field_n = -2 + param1.length;
          io.field_l = var17.a((byte) 81);
          lo.field_j = new int[io.field_l];
          rm.field_B = new boolean[io.field_l];
          es.field_e = new byte[io.field_l][];
          ku.field_c = new int[io.field_l];
          aq.field_f = new int[io.field_l];
          fc.field_g = new int[io.field_l];
          pq.field_O = new byte[io.field_l][];
          var17.field_n = -(io.field_l * 8) + param1.length - 7;
          kw.field_i = var17.a((byte) 81);
          ai.field_J = var17.a((byte) 81);
          var3 = 1 + (var17.h((byte) -116) & 255);
          for (var4 = 0; var4 < io.field_l; var4++) {
            aq.field_f[var4] = var16.a((byte) 81);
          }
          for (var4Lifetime1 = 0; io.field_l > var4Lifetime1; var4Lifetime1++) {
            fc.field_g[var4Lifetime1] = var17.a((byte) 81);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < io.field_l; var4Lifetime2++) {
            ku.field_c[var4Lifetime2] = var17.a((byte) 81);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < io.field_l; var4Lifetime3++) {
            lo.field_j[var4Lifetime3] = var17.a((byte) 81);
          }
          var17.field_n = -7 + (param1.length + (-(io.field_l * 8) - 3 * (-1 + var3)));
          lt.field_a = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            lt.field_a[var4Lifetime4] = var17.i(-123);
            if (lt.field_a[var4Lifetime4] == 0) {
              lt.field_a[var4Lifetime4] = 1;
            }
          }
          var17.field_n = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < io.field_l; var4Lifetime5++) {
            var5 = ku.field_c[var4Lifetime5];
            var6 = lo.field_j[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            pq.field_O[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            es.field_e[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.h((byte) -127);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var17.j((byte) -86);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.j((byte) -49);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_31_0 = var10;
                  if (var13 == -1) {
                    stackIn_32_1 = 0;
                  } else {
                    stackIn_32_1 = 1;
                  }
                  var10 = stackIn_31_0 | stackIn_32_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var5 * var13 + var12] = var17.j((byte) -102);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.j((byte) -74);
                    var9[var12 + var13 * var5] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_47_0 = var10;
                    if (var14 == -1) {
                      stackIn_48_1 = 0;
                    } else {
                      stackIn_48_1 = 1;
                    }
                    var10 = stackIn_47_0 | stackIn_48_1;
                  }
                }
              }
            }
            rm.field_B[var4Lifetime5] = var10 != 0;
          }
          var5Lifetime1 = 111 % ((param0 - 11) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("vo.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_db = "Message game";
        field_bb = 0;
        field_eb = new int[7][4];
        field_eb[3][3] = 0;
        field_eb[3][1] = 40;
        field_eb[3][0] = 0;
        field_eb[3][2] = 60;
        field_eb[4][2] = 60;
        field_eb[4][0] = 0;
        field_eb[4][1] = 30;
        field_eb[4][3] = 10;
        field_eb[5][2] = 60;
        field_eb[5][1] = 20;
        field_eb[5][0] = 0;
        field_eb[5][3] = 20;
        field_eb[6][3] = 30;
        field_eb[6][1] = 0;
        field_eb[6][0] = 0;
        field_eb[6][2] = 70;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$53ce4ab4c593(int param0, String param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_21_0 = 0;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (gn.a(12105, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!gr.a((byte) 15, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (62 != param1.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = rr.a(10, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param2[var8].length() + (var6_int - var5));
              continue;
            }
            break;
          }
          if (param0 != -18) {
            field_bb = 91;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            stackIn_21_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_21_0; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (gn.a(12105, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!gr.a((byte) 15, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param1.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = rr.a(10, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("vo.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }
}
