/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ie {
    int field_O;
    static int[] field_Q;
    static String field_J;
    static ak field_P;
    static int field_K;
    static boolean field_N;
    static String field_M;
    static int field_L;
    static boolean field_I;

    public static void a(byte param0) {
        int var1 = 74 % ((param0 - 31) / 58);
        field_Q = null;
        field_M = null;
        field_J = null;
        field_P = null;
    }

    sd(ng param0) {
        super(param0.field_z, param0.field_p, param0.field_E, param0.field_C, (eb) null, (fn) null);
        try {
          param0.a(this.field_E, (byte) 89, 0, 0, this.field_C);
          this.field_O = 256;
          this.field_H = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
          return;
        }
        if (null == this.field_H) {
          return;
        }
        if (this.field_O == 0) {
          return;
        }
        if (256 == this.field_O) {
          this.field_H.a(param0 + this.field_p, param1, param2 + this.field_z, (byte) 122);
          return;
        }
        tf var7 = new tf(this.field_H.field_E, this.field_H.field_C);
        h.a(-111, var7);
        int var6 = -5 % ((70 - param3) / 49);
        this.field_H.a(0, param1, 0, (byte) -79);
        ia.a((byte) 92);
        var7.a(this.field_z + param2, this.field_p + param0, this.field_O);
    }

    final static String a(String param0, int param1, String[] param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
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
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              stackIn_6_0 = 2 + var6_int;
              for (var5 = stackIn_6_0; var5 < var3_int; var5++) {
                if (ti.a(121, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!td.a(-128, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = na.a((CharSequence) ((Object) var7_ref_String), (byte) -33);
              var4 = var4 + (param2[var8].length() + var6_int - var5);
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param0.substring(var7));
              if (param1 > 17) {
                stackIn_32_0 = var6.toString();
                return stackIn_32_0;
              }
              stackIn_30_0 = (String) null;
              return stackIn_30_0;
            }
            stackIn_19_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_19_0; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (ti.a(112, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!td.a(-105, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = na.a((CharSequence) ((Object) var9), (byte) -33);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param2[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("sd.C(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(byte param0, rh param1, int param2) {
        pc var7 = null;
        pc var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        try {
          var7 = aa.field_f;
          var8 = var7;
          var8.g(param2, 15514);
          var8.field_m = var8.field_m + 1;
          var4 = var8.field_m;
          var8.e(160, 1);
          var8.b(1276387944, param1.field_o);
          var8.b(1276387944, param1.field_t);
          var8.b(1276387944, param1.field_p);
          var8.d(param1.field_s, -93);
          var8.d(param1.field_v, -71);
          var8.d(param1.field_l, -40);
          var8.d(param1.field_n, -71);
          var8.e(160, param1.field_k.length);
          for (var5 = 0; param1.field_k.length > var5; var5++) {
            var7.d(param1.field_k[var5], -123);
          }
          if (param0 >= -37) {
            field_I = false;
          }
          var8.b(var4, (byte) 86);
          var8.f(var8.field_m - var4, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "sd.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public sd() {
        super(0, 0, 0, 0, (eb) null, (fn) null);
        this.field_O = 256;
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
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
        String[] var16 = null;
        we var17 = null;
        we var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          var17 = new we(param1);
          var18 = var17;
          var18.field_m = -2 + param1.length;
          im.field_Qb = var18.a((byte) 97);
          gd.field_k = new byte[im.field_Qb][];
          rl.field_m = new boolean[im.field_Qb];
          gf.field_g = new int[im.field_Qb];
          ge.field_c = new int[im.field_Qb];
          fa.field_b = new int[im.field_Qb];
          e.field_b = new int[im.field_Qb];
          wo.field_f = new byte[im.field_Qb][];
          var18.field_m = -7 + (param1.length - 8 * im.field_Qb);
          tj.field_y = var18.a((byte) 38);
          jb.field_a = var18.a((byte) 46);
          var3 = 1 + (var18.f(255) & 255);
          for (var4 = 0; var4 < im.field_Qb; var4++) {
            fa.field_b[var4] = var17.a((byte) 88);
          }
          if (param0 != -95) {
            var16 = (String[]) null;
            sd.a((String) null, 80, (String[]) null);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < im.field_Qb; var4Lifetime1++) {
            e.field_b[var4Lifetime1] = var18.a((byte) -122);
          }
          for (var4Lifetime2 = 0; im.field_Qb > var4Lifetime2; var4Lifetime2++) {
            gf.field_g[var4Lifetime2] = var18.a((byte) -14);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < im.field_Qb; var4Lifetime3++) {
            ge.field_c[var4Lifetime3] = var18.a((byte) -116);
          }
          var18.field_m = param1.length - (7 - (-(8 * im.field_Qb) - 3 * (-1 + var3)));
          fl.field_g = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            fl.field_g[var4Lifetime4] = var18.c((byte) 13);
            if (0 == fl.field_g[var4Lifetime4]) {
              fl.field_g[var4Lifetime4] = 1;
            }
          }
          var18.field_m = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < im.field_Qb; var4Lifetime5++) {
            var5 = gf.field_g[var4Lifetime5];
            var6 = ge.field_c[var4Lifetime5];
            var7 = var5 * var6;
            var21 = new byte[var7];
            var19 = var21;
            var8 = var19;
            wo.field_f[var4Lifetime5] = var21;
            var22 = new byte[var7];
            var20 = var22;
            var9 = var20;
            gd.field_k[var4Lifetime5] = var22;
            var10 = 0;
            var11 = var18.f(255);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var18.a(0);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$1 = var18.a(bn.a((int) param0, -95));
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_31_0 = var10;
                  if (-1 == var13) {
                    stackIn_32_1 = 0;
                  } else {
                    stackIn_32_1 = 1;
                  }
                  var10 = stackIn_31_0 | stackIn_32_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5 * var13] = var18.a(0);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    dupTemp$0 = var18.a(0);
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
            rl.field_m[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("sd.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        pc var2 = aa.field_f;
        if (!param0) {
          return;
        }
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        int var0 = 0;
        field_Q = new int[64];
        for (var0 = 0; field_Q.length > var0; var0++) {
          field_Q[var0] = 256 / field_Q.length * (65793 * var0);
        }
        field_J = "Show players in <%0>'s game";
        field_M = "Create a free Account";
    }
}
