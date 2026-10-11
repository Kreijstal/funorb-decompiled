/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qm {
    static int field_g;
    static int field_d;
    static String field_a;
    static boolean[] field_f;
    static int[] field_c;
    static String field_e;
    static int field_b;

    final static void a(km[] param0, int param1, int param2, int param3) {
        try {
          if (param1 >= -54) {
            km[] var5 = (km[]) null;
            qm.a((km[]) null, 95, 62, -2);
          }
          de.field_c = new le(param0);
          bb.field_b = param2;
          o.field_f = param3;
          fi.a((byte) 6);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "qm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != -6) {
          return;
        }
        field_a = null;
    }

    final static String a(byte param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        int var13;
        ae var14;
        StringWriter var15;
        String var16;
        String var17;
        String var18;
        String var19;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var2Lifetime3Lifetime1;
        String var2Lifetime3Lifetime2;
        String var2Lifetime3Lifetime3;
        String var2Lifetime3Lifetime4;
        String var2Lifetime3Lifetime5;
        String var2Lifetime3Lifetime6;
        String var2Lifetime3Lifetime7;
        String var2Lifetime3Lifetime8;
        String var2Lifetime3Lifetime9;
        String var2Lifetime3Lifetime10;
        String var2Lifetime3Lifetime11;
        String var2Lifetime3Lifetime12;
        String var11Lifetime3Lifetime1;
        var13 = Chess.field_G;
        if (param1 instanceof ae) {
          var14 = (ae) ((Object) param1);
          param1 = var14.field_g;
          var2 = var14.field_h + " | ";
          var11 = var2;
        } else {
          var2 = "";
        }
        var15 = new StringWriter();
        if (param0 != -89) {
          return (String) null;
        }
        var4 = new PrintWriter((Writer) ((Object) var15));
        param1.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var2Lifetime1 = var5;
        var11Lifetime1 = var5;
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2Lifetime2 = var7;
        var11Lifetime2 = var7;
        while (true) {
          var8 = var6.readLine();
          var2Lifetime3 = var8;
          var11Lifetime3 = var8;
          var2Lifetime3Lifetime1 = var11Lifetime3;
          if (var8 == null) {
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var11Lifetime3 = var2Lifetime3Lifetime2;
            var2Lifetime3Lifetime2 = var11Lifetime3;
            var2Lifetime3Lifetime2 = var2Lifetime3Lifetime2 + "| " + var7;
            return var2Lifetime3Lifetime2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', 1 + var9);
          if (var9 == -1) {
            var11Lifetime3Lifetime1 = var8;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
            var2Lifetime3Lifetime3 = var11Lifetime3Lifetime1;
          } else {
            var11Lifetime3Lifetime1 = var8.substring(0, var9);
          }
          var16 = var11Lifetime3Lifetime1.trim();
          var2Lifetime3Lifetime4 = var16;
          var2Lifetime3Lifetime5 = var16;
          var17 = var16.substring(1 + var16.lastIndexOf(' '));
          var2Lifetime3Lifetime6 = var17;
          var2Lifetime3Lifetime7 = var17;
          var18 = var17.substring(1 + var17.lastIndexOf('\t'));
          var2Lifetime3Lifetime8 = var18;
          var2Lifetime3Lifetime9 = var18;
          var19 = var2Lifetime3Lifetime9 + var18;
          var2Lifetime3Lifetime10 = var19;
          var2Lifetime3Lifetime11 = var19;
          var2Lifetime3Lifetime12 = var19;
          if (var9 != -1) {
            if (-1 == var10) {
              var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
              continue;
            }
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2Lifetime3Lifetime12 = var19 + var8.substring(var12 + 5, var10);
            }
          }
          var2Lifetime3Lifetime12 = var2Lifetime3Lifetime12 + ' ';
        }
    }

    final static sa a(byte param0, String param1) {
        sa stackIn_3_0 = null;
        sa stackIn_7_0 = null;
        sa stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        sa stackIn_26_0 = null;
        sa stackIn_40_0 = null;
        sa stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Chess.field_G;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = ef.field_j;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = ok.field_Ob;
            return stackIn_7_0;
          }
          if (34 == param1.charAt(0)) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_13_0 = wh.field_b;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = wh.field_b;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          if (param0 != -24) {
            var7 = (String) null;
            qm.a((byte) 111, (String) null);
          }
          while (var4Lifetime1 < var2_int) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                -1 + var2_int != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = wh.field_b;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (kh.field_m.indexOf(var5Lifetime1) == -1) {
                stackIn_45_0 = wh.field_b;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
            var4Lifetime1++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("qm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final static String a(char param0, String param1, String param2, byte param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_3_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = Chess.field_G;
        try {
          var4_int = param1.length();
          if (param3 != -51) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var5 = param2.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (0 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param1.indexOf((int) param0, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param1.indexOf((int) param0, var9);
            if (var10 < 0) {
              discarded$2 = var8.append(param1.substring(var9));
              stackIn_14_0 = var8.toString();
              return stackIn_14_0;
            }
            discarded$0 = var8.append(param1.substring(var9, var10));
            discarded$1 = var8.append(param2);
            var9 = 1 + var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    final static rk[] a(int param0, String param1, String param2, um param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rk[] stackIn_2_0 = null;
        rk[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(param1, 0);
          if (param0 != 1) {
            stackIn_2_0 = (rk[]) null;
            return stackIn_2_0;
          }
          var5 = param3.a(param2, 7, var4_int);
          stackIn_4_0 = om.a(param3, var4_int, true, var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("qm.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = ad.a(param1, -2);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!cg.a(2, var4.charAt(0)) &&
              !cg.a(2, var4.charAt(-1 + var4.length()))) {
              var5 = 0;
              if (param2 < 79) {
                return true;
              }
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (cg.a(2, (char) var7)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("qm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 < 70) {
          return;
        }
        if (hm.field_g) {
          return;
        }
        if (null == gf.field_d) {
          gf.field_d = vc.a(-122, 4);
        }
        if (gf.field_d.field_m) {
          vk.field_b = vk.field_b & ~gf.field_d.field_j;
          wc.field_w = wc.field_w | gf.field_d.field_j;
          gf.field_d = null;
          hm.field_g = true;
        }
        if (hm.field_g) {
          dn.a(true);
          df.a((byte) 102);
          if (6 == jc.field_f &&
            vk.field_b == 0) {
            jc.field_f = 0;
            uk.a(qk.field_h, false, 28333, 0);
          }
        }
    }

    static {
        field_a = "Previous";
        field_g = 0;
        field_e = "Reject";
        field_c = new int[8192];
        field_f = new boolean[]{true, true, true, true, true, true, true, true, true, true, field_g == 1 ? true : false};
    }
}
