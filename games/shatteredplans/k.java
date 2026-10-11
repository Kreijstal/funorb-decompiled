/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static bi field_d;
    static String field_e;
    pf field_a;
    static boolean field_b;
    static fg field_h;
    static byte[] field_c;
    static String[] field_j;
    static char[] field_f;
    static boolean field_i;
    static int[] field_g;

    final void a(int param0, ln param1, ln param2, fs param3) {
        try {
          this.field_a.a((byte) -113, new qm(3, param3, param1, param2));
          int var5_int = -23 / ((param0 + 43) / 44);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, fs param1, byte param2, boolean param3, int param4, ln param5) {
        mg var7 = null;
        try {
          int var8 = -65 % ((-22 - param2) / 40);
          var7 = new mg(param5, param0, param1, param4);
          this.field_a.a((byte) -113, var7);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, fs param1, fs param2) {
        try {
          this.field_a.a((byte) -113, new rf(param1, param2));
          if (param0 != 255) {
            field_d = (bi) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ln param0, int param1, int[] param2, ln[] param3) {
        int var7_int = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        int[] var8 = null;
        int var10 = 0;
        ln[] var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          if (param1 < 64) {
            var11 = (ln[]) null;
            this.a((ln) null, -107, (int[]) null, (ln[]) null);
          }
          for (var7_int = 0; var7_int < param2.length; var7_int++) {
            if (param2[var7_int] != 0) {
              var6++;
            }
            var5_int = var5_int + param2[var7_int];
          }
          if (var6 > 0) {
            var7 = new ln[var6];
            var14 = new int[var6];
            var13 = var14;
            var8 = var13;
            var12 = 0;
            var6 = var12;
            for (var9 = 0; param2.length > var9; var9++) {
              if (0 != param2[var9]) {
                var7[var12] = param3[var9];
                var8[var12] = param2[var9];
                var12++;
              }
            }
            this.field_a.a((byte) -113, new nr(param0, var14, var7));
            return;
          }
          this.field_a.a((byte) -113, new nr(param0, var5_int));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("k.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_j = null;
        field_d = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
          field_e = (String) null;
        }
    }

    final void a(int param0, ln param1, boolean param2) {
        try {
          this.field_a.a((byte) -113, new nr(param1, param0));
          if (!param2) {
            this.field_a = (pf) null;
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, ln param1, fs param2) {
        try {
          this.field_a.a((byte) -113, new qm(param0, param2, param1));
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public k() {
        this.field_a = new pf();
    }

    final void a(int param0, ln param1, fs param2, int param3) {
        try {
          int var5_int = 48 / ((param3 + 6) / 60);
          this.field_a.a((byte) -113, new qi(param1, param2, param0));
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final eg a(int[] param0, ln param1, int param2, fs[] param3) {
        eg var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        eg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var6 = (byte[]) null;
            k.a((byte[]) null, (byte) 21);
          }
          var5 = new eg(param1, param3, param0);
          this.field_a.a((byte) -113, var5);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("k.B(");
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
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(fs param0, boolean param1) {
        try {
          this.field_a.a((byte) -113, new ca(param0));
          if (param1) {
            ln var4 = (ln) null;
            this.a(-87, (ln) null, -32);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte[] param0, byte param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
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
        ob var16 = null;
        ob var17 = null;
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
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var16 = new ob(param0);
          var17 = var16;
          var17.field_j = param0.length - 2;
          en.field_c = var17.f(-20976);
          cm.field_g = new int[en.field_c];
          kc.field_l = new byte[en.field_c][];
          ua.field_h = new boolean[en.field_c];
          hd.field_q = new byte[en.field_c][];
          mc.field_s = new int[en.field_c];
          cf.field_H = new int[en.field_c];
          sj.field_a = new int[en.field_c];
          var17.field_j = param0.length + (-7 - en.field_c * 8);
          tk.field_y = var17.f(-20976);
          eg.field_t = var17.f(-20976);
          var3 = (var17.j(-70) & 255) + 1;
          for (var4 = 0; en.field_c > var4; var4++) {
            cf.field_H[var4] = var16.f(-20976);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < en.field_c; var4Lifetime1++) {
            sj.field_a[var4Lifetime1] = var17.f(-20976);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < en.field_c; var4Lifetime2++) {
            mc.field_s[var4Lifetime2] = var17.f(-20976);
          }
          var5 = -25 % ((-23 - param1) / 52);
          for (var4Lifetime3 = 0; en.field_c > var4Lifetime3; var4Lifetime3++) {
            cm.field_g[var4Lifetime3] = var17.f(-20976);
          }
          var17.field_j = -(3 * (var3 - 1)) - en.field_c * 8 + (param0.length - 7);
          eo.field_fb = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            eo.field_fb[var4Lifetime4] = var17.k(255);
            if (eo.field_fb[var4Lifetime4] == 0) {
              eo.field_fb[var4Lifetime4] = 1;
            }
          }
          var17.field_j = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < en.field_c; var4Lifetime5++) {
            var5Lifetime1 = mc.field_s[var4Lifetime5];
            var6 = cm.field_g[var4Lifetime5];
            var7 = var6 * var5Lifetime1;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            hd.field_q[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            kc.field_l[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.j(-74);
            stackIn_23_0 = -1;
            stackIn_23_1 = ~(var11 & 1);
            if (stackIn_23_0 == stackIn_23_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.g(-2852);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var7; var12++) {
                  dupTemp$0 = var17.g(-2852);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_50_0 = var10;
                  if (var13 == -1) {
                    stackIn_51_1 = 0;
                  } else {
                    stackIn_51_1 = 1;
                  }
                  var10 = stackIn_50_0 | stackIn_51_1;
                }
              }
            } else {
              for (var12 = 0; var5Lifetime1 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var12 + var5Lifetime1 * var13] = var17.g(-2852);
                }
              }
              if (0 != (var11 & 2)) {
                for (var12 = 0; var5Lifetime1 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var17.g(-2852);
                    var9[var12 + var5Lifetime1 * var13] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_38_0 = var10;
                    if (var14 == -1) {
                      stackIn_39_1 = 0;
                    } else {
                      stackIn_39_1 = 1;
                    }
                    var10 = stackIn_38_0 | stackIn_39_1;
                  }
                }
              }
            }
            ua.field_h[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_56_0 = var2;
          stackIn_56_1 = new StringBuilder().append("k.E(");
          if (param0 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(fs param0, ln param1, byte param2) {
        try {
          this.field_a.a((byte) -113, new qm(1, param0, param1));
          int var4_int = 21 % ((-27 - param2) / 52);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, ln param1, int param2) {
        try {
          if (param2 != -4900) {
            this.field_a = (pf) null;
          }
          this.field_a.a((byte) -113, new hj(param1.field_y, param1, param0));
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "k.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = "Loading sound effects";
        field_b = false;
        field_h = new fg();
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = new int[8192];
    }
}
