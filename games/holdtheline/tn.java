/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn {
    static int field_c;
    private int field_e;
    static boolean[] field_d;
    static int field_a;
    static va field_b;
    static int[][] field_h;
    private int field_g;
    private String[] field_f;
    private boolean field_i;

    private final void a(String param0, int param1, int param2) {
        try {
          if (param1 > this.field_e) {
            this.field_e = param1;
          }
          if (param2 != 12105912) {
            field_a = -122;
          }
          if (param1 >= this.field_f.length) {
            this.b(param1, 0);
          }
          this.field_f[param1] = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "tn.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        if (param1 != 5255) {
          return -22;
        }
        param0 = param0 & 8191;
        if (4096 <= param0) {
          return param0 < 6144 ? -qd.field_f[param0 - 4096] : -qd.field_f[-param0 + 8192];
        }
        return 2048 > param0 ? qd.field_f[param0] : qd.field_f[-param0 + 4096];
    }

    final String[] c(int param0) {
        if (param0 != 3) {
          return (String[]) null;
        }
        String[] var2 = new String[1 + this.field_e];
        bc.a(this.field_f, 0, var2, 0, this.field_e + 1);
        return var2;
    }

    final void a(byte param0, String param1) {
        try {
          this.a(param1, 1 + this.field_e, param0 ^ 12105928);
          if (param0 != 112) {
            field_a = 30;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "tn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0) {
        if (param0 < 28) {
          field_d = (boolean[]) null;
          return 1;
        }
        return 1;
    }

    public final String toString() {
        int var2 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var3 = HoldTheLine.field_D;
        StringBuilder var4 = new StringBuilder();
        StringBuilder var1 = var4;
        StringBuilder discarded$0 = var1.append("[");
        for (var2 = 0; this.field_e > var2; var2++) {
          if (var2 != 0) {
            discarded$1 = var1.append(", ");
          }
          discarded$2 = var4.append(this.field_f[var2]);
        }
        StringBuilder discarded$3 = var1.append("]");
        return var1.toString();
    }

    final static String d(int param0) {
        if (bb.field_a == sf.field_n) {
          return ol.field_a;
        }
        if (ak.field_b == sf.field_n) {
          return rd.field_j;
        }
        if (param0 != 0) {
          tn.a((byte) -82);
        }
        if (!fj.field_o.a(250)) {
          return rd.field_j;
        }
        return ec.field_v;
    }

    public static void b(int param0) {
        if (param0 != 1) {
          tn.a((byte) -39);
        }
        field_h = (int[][]) null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0, ib param1, th param2, int param3) {
        try {
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          ki stackIn_5_0 = null;
          RuntimeException stackIn_40_0 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          StringBuilder stackIn_43_1 = null;
          String stackIn_44_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var7 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          int var16 = 0;
          ki var17 = null;
          byte[][] var18 = null;
          String var19 = null;
          byte[][] var20 = null;
          int var13Lifetime1;
          var14 = HoldTheLine.field_D;
          try {
            var17 = new ki();
            var17.field_p = param2.f((byte) -53);
            var17.field_n = param2.a(param0 + 192);
            var17.field_m = new int[var17.field_p];
            var17.field_l = new af[var17.field_p];
            var17.field_j = new int[var17.field_p];
            var17.field_r = new int[var17.field_p];
            var17.field_q = new byte[var17.field_p][][];
            var17.field_k = new af[var17.field_p];
            var5 = 0;
            if (param0 != -107) {
              return;
            }
            stackIn_5_0 = var17;
            while (stackIn_5_0.field_p > var5) {
              try {
                var6_int = param2.f((byte) -68);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (3 == var6_int ||
                    var6_int == 4) {
                    var19 = param2.j(-1231);
                    var8 = param2.j(-1231);
                    var9 = param2.f((byte) -81);
                    var10 = new String[var9];
                    for (var11_int = 0; var9 > var11_int; var11_int++) {
                      var10[var11_int] = param2.j(-1231);
                    }
                    var20 = new byte[var9][];
                    var18 = var20;
                    var11 = var18;
                    if (3 == var6_int) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.a(-72);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(var13, 0, (byte) 116, var20[var12_int]);
                      }
                    }
                    var17.field_m[var5] = var6_int;
                    var12 = new Class[var9];
                    var16 = 0;
                    var13Lifetime1 = var16;
                    while (var16 < var9) {
                      var12[var16] = wl.a(var10[var16], 24);
                      var16++;
                    }
                    var17.field_l[var5] = param1.a(var8, var12, wl.a(var19, 64), (byte) -32);
                    var17.field_q[var5] = var20;
                  }
                } else {
                  var15 = param2.j(-1231);
                  var7 = var15;
                  var8 = param2.j(param0 ^ 1188);
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param2.a(param0 ^ -12);
                  }
                  var17.field_m[var5] = var6_int;
                  var17.field_j[var5] = var9;
                  var17.field_k[var5] = param1.a(var8, 9, wl.a(var15, param0 + 167));
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var17.field_r[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var17.field_r[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var17.field_r[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var17.field_r[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var17.field_r[var5] = -5;
              }
              var5++;
              stackIn_5_0 = var17;
            }
            sl.field_b.a((byte) -116, var17);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_40_0 = var4;
            stackIn_40_1 = new StringBuilder().append("tn.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',');
            if (param2 == null) {
              stackIn_44_2 = "null";
            } else {
              stackIn_44_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1) {
        String[] var3 = new String[this.a(true, param0)];
        bc.a(this.field_f, param1, var3, 0, this.field_f.length);
        this.field_f = var3;
    }

    final static void a(int param0) {
        byte[] var2 = null;
        if (l.field_b) {
          return;
        }
        if (!pj.b((byte) 85)) {
          var2 = aj.a((byte) -53);
          byte[] var1 = var2;
          ub.a(var2, 6, param0 + 0);
        } else {
          ad.field_a = true;
        }
        if (param0 != 0) {
          tn.a(-121, -112);
        }
    }

    private final int a(boolean param0, int param1) {
        int var3;
        int var4;
        var4 = HoldTheLine.field_D;
        if (!param0) {
          field_a = 37;
        }
        var3 = this.field_f.length;
        while (var3 <= param1) {
          if (!this.field_i) {
            var3 = var3 + this.field_g;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_g;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final static void a(wd[] param0, int param1, vd param2) {
        int var13 = 0;
        RuntimeException runtimeException = null;
        uh var3 = null;
        uh var4 = null;
        wd var5 = null;
        qm var6 = null;
        qm var7 = null;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        wd var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        int var20 = 0;
        uh var21 = null;
        qm var22 = null;
        uh var23 = null;
        qm var24 = null;
        uh var25 = null;
        uh var26 = null;
        qm var27 = null;
        qm var28 = null;
        uh var29 = null;
        uh var30 = null;
        qm var31 = null;
        qm var32 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var20 = HoldTheLine.field_D;
        try {
          var21 = o.a((byte) 51);
          var3 = var21;
          var23 = o.a((byte) -125);
          var4 = var23;
          var5 = param0[param0.length - 1];
          var22 = var5.k(param1 ^ 10000487);
          var6 = var22;
          if (param1 != 10000536) {
            return;
          }
          var24 = var5.n(param1 - 9997199);
          var7 = var24;
          var21.a(var22.field_h, (byte) 124);
          var21.a(var22.field_f, (byte) 62);
          var23.a(var24.field_h, (byte) 119);
          var23.a(var24.field_f, (byte) 72);
          var8 = ce.a(-1, param0);
          var9 = (int)(var8 / 40.0f) + 1;
          var10 = var8 / (float)var9;
          var11 = var10;
          var12 = var5.field_k;
          for (var13 = 0; param0.length > var13; var13++) {
            var14 = param0[var13];
            if (var12 != var14.field_k) {
              param2.a(0.0f, var4.a(param1 ^ -10000584), var12, var3.a(param1 ^ -10000572), (byte) 49);
              var25 = o.a((byte) 26);
              var3 = var25;
              var26 = o.a((byte) -112);
              var4 = var26;
              var25.a(var6.field_h, (byte) 101);
              var25.a(var6.field_f, (byte) 116);
              var26.a(var7.field_h, (byte) 64);
              var26.a(var7.field_f, (byte) 72);
              var11 = var10;
              var12 = var14.field_k;
            }
            var15 = var14.f(param1 - 10000486);
            var16 = 1 + (int)(var15 / 5.0f);
            var17 = var15 / (float)var16;
            var18 = 1.0f / (float)var16;
            var19 = var18;
            while (1.0f > var19) {
              var27 = var14.c(var19, 99);
              var28 = var14.a(-851, var19);
              var3.a(var27.field_h, (byte) 90);
              var3.a(var27.field_f, (byte) 93);
              var4.a(var28.field_h, (byte) 89);
              var4.a(var28.field_f, (byte) 79);
              var11 = var11 - var17;
              var19 = var19 + var18;
              if (!(var11 < 0.0f)) {
                continue;
              }
              param2.a(0.0f, var4.a(param1 ^ -10000603), var12, var3.a(-58), (byte) 49);
              var29 = o.a((byte) 102);
              var3 = var29;
              var30 = o.a((byte) -115);
              var4 = var30;
              var29.a(var27.field_h, (byte) 91);
              var29.a(var27.field_f, (byte) 64);
              var30.a(var28.field_h, (byte) 81);
              var11 = var11 + var10;
              var30.a(var28.field_f, (byte) 69);
            }
            var31 = var14.l(param1 ^ 1579032);
            var32 = var14.m(param1 - 10000550);
            var3.a(var31.field_h, (byte) 106);
            var3.a(var31.field_f, (byte) 64);
            var4.a(var32.field_h, (byte) 81);
            var4.a(var32.field_f, (byte) 81);
          }
          param2.a(0.0f, var4.a(-39), var12, var3.a(-61), (byte) 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_17_0 = runtimeException;
          stackIn_17_1 = new StringBuilder().append("tn.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HoldTheLine.field_D;
        try {
          tc.b(param0, param3, param1 + 1, 10000536);
          if (param2 != 152) {
            field_h = (int[][]) null;
          }
          tc.b(param0, param3 + param4, 1 + param1, 12105912);
          var5_int = 1;
          if (tc.field_a > var5_int + param3) {
            var5_int = -param3 + tc.field_a;
          }
          var6 = param4;
          if (var6 + param3 > tc.field_i) {
            var6 = -param3 + tc.field_i;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param4;
            var9 = var8 << 16 | var8 << 8 | var8;
            tc.field_b[param0 + tc.field_j * (param3 + var7)] = var9;
            tc.field_b[tc.field_j * (var7 + param3) + (param0 + param1)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var5), "tn.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    tn(int param0, boolean param1) {
        this.field_e = -1;
        this.field_f = new String[]{};
        this.field_i = false;
        this.field_i = param1 ? true : false;
        this.field_g = param0;
    }

    static {
        field_h = new int[4][];
    }
}
