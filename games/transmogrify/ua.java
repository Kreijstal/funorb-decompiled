/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static String[] field_a;
    static long field_e;
    static int field_c;
    static int field_d;
    static String field_b;
    static ti[] field_f;

    public static void a(int param0) {
        int var1 = 122 % ((-70 - param0) / 50);
        field_b = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(byte param0) {
        String var2;
        boolean stackIn_6_0 = false;
        if (param0 <= 29) {
          var2 = (String) null;
          ua.a((ci) null, (String) null, -14, (ci) null, (String) null);
        }
        stackIn_6_0 = (null != nk.field_b) && (lj.field_z.a(-65));
        return stackIn_6_0;
    }

    final static void b(byte param0) {
        int stackIn_12_0 = 0;
        sj stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_21_3;
        sj stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_33_3;
        sj stackIn_42_0 = null;
        int stackIn_44_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sj var4 = null;
        int var5 = 0;
        sj var4Lifetime1;
        sj var4Lifetime1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime1Lifetime1;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          var1_int = 12;
          if (oa.field_j >= 34 &&
            34 + 12 * wl.field_K.field_n > oa.field_j &&
            114 <= bk.field_a &&
            wl.field_K.field_m + 114 > bk.field_a) {
            var1_int = (-34 + oa.field_j) / wl.field_K.field_n;
          }
          if (od.field_g.field_e[11] != null) {
            var1_int = 12;
          }
          if (od.field_g == sg.field_d.field_o) {
            stackIn_12_0 = sg.field_d.field_t;
          } else {
            stackIn_12_0 = 12;
          }
          var2 = stackIn_12_0;
          for (var3 = 0; var3 < 12; var3++) {
            var4 = od.field_g.field_e[var3];
            if (var4 != null) {
              stackIn_17_0 = var4;
              if (var1_int > var3) {
                stackIn_18_1 = 0;
              } else {
                stackIn_18_1 = 32;
              }
              stackIn_20_1 = stackIn_18_1 + var3 * 32;
              stackIn_20_2 = 34;
              if (var3 <= var2) {
                stackIn_21_3 = 0;
              } else {
                stackIn_21_3 = -32;
              }
              stackIn_17_0.field_g = stackIn_20_1 + (stackIn_20_2 + stackIn_21_3);
              continue;
            }
            break;
          }
          if (param0 <= 57) {
            ua.a(51, 18);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (var2 > var1_int) {
            for (var3Lifetime1 = 0; var3Lifetime1 < 12; var3Lifetime1++) {
              var4Lifetime1 = od.field_g.field_e[var3Lifetime1];
              if (var4Lifetime1 == null) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_42_0 = var4Lifetime1;
              if (var1_int <= var3Lifetime1 &&
                var3Lifetime1 < var2) {
                stackIn_44_1 = 32;
              } else {
                stackIn_44_1 = 0;
              }
              stackIn_42_0.field_g = stackIn_44_1 + (34 + 32 * var3Lifetime1);
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            for (var3Lifetime1Lifetime1 = 0; 12 > var3Lifetime1Lifetime1; var3Lifetime1Lifetime1++) {
              var4Lifetime1Lifetime1 = od.field_g.field_e[var3Lifetime1Lifetime1];
              if (var4Lifetime1Lifetime1 == null) {
                break;
              }
              stackIn_31_0 = var4Lifetime1Lifetime1;
              stackIn_31_1 = 34;
              stackIn_31_2 = 32 * var3Lifetime1Lifetime1;
              if (var3Lifetime1Lifetime1 <= var1_int &&
                var2 < var3Lifetime1Lifetime1) {
                stackIn_33_3 = -32;
              } else {
                stackIn_33_3 = 0;
              }
              stackIn_31_0.field_g = stackIn_31_1 + (stackIn_31_2 + stackIn_33_3);
            }
          }
          if (sg.field_d != null) {
            sg.field_d.field_j = oa.field_j + rk.field_p;
            sg.field_d.field_q = bk.field_a + ek.field_e;
            if (sg.field_d.field_j != sg.field_d.field_g ||
              sg.field_d.field_q != sg.field_d.field_p) {
              nc.field_s = null;
            }
            sg.field_d.field_p = sg.field_d.field_q;
            sg.field_d.field_g = sg.field_d.field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ua.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        wf var2 = null;
        int var3 = 0;
        int var4 = 0;
        gh var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var5 = (gh) (mf.field_b.a((byte) -95));
          var3 = -73 / ((param0 - 80) / 36);
          while (var5 != null) {
            nb.a(param1, var5, 0);
            var5 = (gh) (mf.field_b.a(true));
          }
          var2 = pj.field_A.a((byte) -95);
          while (var2 != null) {
            ki.a(false, param1);
            var2 = pj.field_A.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "ua.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static hh a(ci param0, String param1, int param2, ci param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 32) {
            field_d = 80;
          }
          var5_int = param0.b(80, param1);
          var6 = param0.a(param2 ^ -33, param4, var5_int);
          stackIn_3_0 = pe.a((byte) -66, param0, var5_int, param3, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ua.D(");
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
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, fe param1, int param2, oa param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_39_0 = null;
          StringBuilder stackIn_39_1 = null;
          String stackIn_40_2 = null;
          StringBuilder stackIn_42_1 = null;
          String stackIn_43_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          ba var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Transmogrify.field_A ? 1 : 0;
          try {
            if (param2 != -22635) {
              ua.a(-89);
            }
            var18 = new ba();
            var18.field_p = param3.d((byte) 101);
            var18.field_i = param3.c((byte) -127);
            var18.field_o = new ib[var18.field_p];
            var18.field_j = new int[var18.field_p];
            var18.field_k = new int[var18.field_p];
            var18.field_h = new int[var18.field_p];
            var18.field_m = new ib[var18.field_p];
            var18.field_g = new byte[var18.field_p][][];
            for (var5 = 0; var18.field_p > var5; var5++) {
              try {
                var6_int = param3.d((byte) 26);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  2 != var6_int) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param3.g(12248);
                    var21 = param3.g(12248);
                    var9 = param3.d((byte) 116);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param3.g(param2 + 34883);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param3.c((byte) -126);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param3.a(var13, 2, var22[var12_int], 0);
                      }
                    }
                    var18.field_j[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = ek.a(3249872, var10[var17]);
                      var17++;
                    }
                    var18.field_o[var5] = param1.a(ek.a(3249872, var20), (byte) 81, var12, var21);
                    var18.field_g[var5] = var22;
                  }
                } else {
                  var16 = param3.g(param2 + 34883);
                  var15 = param3.g(12248);
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param3.c((byte) -121);
                  }
                  var18.field_j[var5] = var6_int;
                  var18.field_h[var5] = var9;
                  var18.field_m[var5] = param1.a(ak.a(param2, 22529), var15, ek.a(ak.a(param2, -3264187), var16));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_k[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_k[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_k[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_k[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_k[var5] = -5;
              }
            }
            wg.field_f.a(var18, param2 ^ 22577);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_39_0 = var4;
            stackIn_39_1 = new StringBuilder().append("ua.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_43_2 = "null";
            } else {
              stackIn_43_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[]{"mummy", "skeleton", "pumpkin", "vampire"};
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
