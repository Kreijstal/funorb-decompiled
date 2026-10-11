/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends pn {
    static db field_p;
    static String field_o;
    static int[] field_n;
    static jp field_m;
    private dl field_q;

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l.a(param0, param1, param2, param3, param4, param5);
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ma.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        if (param1 == 24 &&
          24 == param2) {
          this.field_q.d(param4, param5 - param2, 256);
        } else {
          this.field_q.a(param4, param5 - param2, param1 * 2, 3 * param2, 256);
        }
        var7 = 85 % ((param0 - 74) / 41);
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          field_n = (int[]) null;
        }
        return this.field_l.a(param0, param1);
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l.a(param0, param1, param2, param3, (byte) -126, param5, param6);
          if (param4 >= -87) {
            field_n = (int[]) null;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ma.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        f stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 9 / ((73 - param4) / 42);
          stackIn_1_0 = this.field_l.a(param0, param1, param2, param3, (byte) 123);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("ma.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private ma(dl param0, f param1, ma param2) {
        super(param1);
        try {
          this.field_q = param0;
          if (param2 != null) {
            this.a((byte) 57, param2);
          }
          this.a((byte) 92, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21) {
            field_p = (db) null;
          }
          stackIn_3_0 = this.field_l.a((byte) -21, param1, param2, param3, param4, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ma.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void e(byte param0) {
        int var8_int = 0;
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int var19 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        hp var6_ref_hp = null;
        int var7 = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        md var27 = null;
        int var3Lifetime1;
        int var25Lifetime1;
        int var25Lifetime2;
        var26 = CrazyCrystals.field_B;
        try {
          var27 = kd.field_n;
          var2 = var27.h(255);
          if (param0 <= 56) {
            field_p = (db) null;
          }
          if (var2 == 0) {
            var3 = var27.c((byte) -7);
            var4 = (ak) (hd.field_d.g(32073));
            while (var4 != null) {
              if (var3 != var4.field_g) {
                var4 = (ak) (hd.field_d.a(false));
                continue;
              }
              break;
            }
            if (var4 == null) {
              jj.a(4);
              return;
            }
            var5 = var27.h(255);
            if (var5 != 0) {
              var6 = var4.field_h;
              var7 = var4.field_j;
              ub.field_d[0].field_j = false;
              ub.field_d[0].field_g = je.field_g;
              ub.field_d[0].field_a = null;
              for (var8_int = 1; var5 > var8_int; var8_int++) {
                ub.field_d[var8_int].field_g = var27.i(123);
                ub.field_d[var8_int].field_j = false;
                if (var27.h(255) == 1) {
                  ub.field_d[var8_int].field_a = var27.i(109);
                } else {
                  ub.field_d[var8_int].field_a = null;
                }
              }
              dupTemp$0 = new String[3][var6];
              var4.field_i = dupTemp$0;
              var8 = dupTemp$0;
              var9 = new String[3][var6];
              dupTemp$1 = new long[3][var6];
              var4.field_k = dupTemp$1;
              var10 = dupTemp$1;
              dupTemp$2 = new int[3][var6 * var7];
              var4.field_l = dupTemp$2;
              var11 = dupTemp$2;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              var17 = 0;
              var18 = var27.h(255);
              if (var18 > 0) {
                for (var19 = 0; var19 < var18; var19++) {
                  var20 = var27.h(255);
                  var21 = ub.field_d[var20].field_g;
                  var22 = var27.d(true);
                  var24 = var27.field_f;
                  if (var19 < var6) {
                    var8[0][var12] = var21;
                    var9[0][var12] = ub.field_d[var20].field_a;
                    var10[0][var12] = var22;
                    var12++;
                    for (var25 = 0; var7 > var25; var25++) {
                      incrementValue$3 = var15;
                      var15++;
                      var11[0][incrementValue$3] = var27.b((byte) -104);
                    }
                  }
                  if (var21 != null &&
                    ai.a((byte) 82, var21)) {
                    var8[1][var13] = je.field_g;
                    var9[1][var13] = null;
                    var10[1][var13] = var22;
                    var27.field_f = var24;
                    var13++;
                    for (var25Lifetime1 = 0; var7 > var25Lifetime1; var25Lifetime1++) {
                      incrementValue$4 = var16;
                      var16++;
                      var11[1][incrementValue$4] = var27.b((byte) -125);
                    }
                  }
                  if (var6 > var14 &&
                    !ub.field_d[var20].field_j) {
                    ub.field_d[var20].field_j = true;
                    var8[2][var14] = var21;
                    var9[2][var14] = ub.field_d[var20].field_a;
                    var10[2][var14] = var22;
                    var14++;
                    var27.field_f = var24;
                    for (var25Lifetime2 = 0; var7 > var25Lifetime2; var25Lifetime2++) {
                      incrementValue$5 = var17;
                      var17++;
                      var11[2][incrementValue$5] = var27.b((byte) -120);
                    }
                  }
                }
              }
            }
            var4.field_n = true;
            var4.a(false);
            return;
          }
          if (var2 == 1) {
            var3Lifetime1 = var27.c((byte) -7);
            var4_long = var27.d(true);
            var6_ref_hp = (hp) (cf.field_c.g(32073));
            while (var6_ref_hp != null) {
              if (var6_ref_hp.field_n != var3Lifetime1) {
                var6_ref_hp = (hp) (cf.field_c.a(false));
                continue;
              }
              break;
            }
            if (var6_ref_hp == null) {
              jj.a(4);
              return;
            }
            var6_ref_hp.field_i = var4_long;
            var6_ref_hp.a(false);
            return;
          }
          wp.a((Throwable) null, "HS1: " + ug.a(-1815), 21862);
          jj.a(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "ma.U(" + param0 + ')');
        }
    }

    final nj a(int param0, nj param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        ma var4 = null;
        nj stackIn_4_0 = null;
        nj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.a(param0, param1);
          if (var3 != null &&
            !(var3.field_a instanceof pf)) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = (ma) null;
          stackIn_6_0 = ng.a(ah.field_f, param1, new ma(ac.field_j, new kp(-1), (ma) null), (byte) -83, gg.field_e);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ma.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 16736352) {
            stackIn_4_0 = this.field_l.a(16736352, param1, param2, param3, param4, param5, param6, param7);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_7_0 = var9;
          stackIn_7_1 = new StringBuilder().append("ma.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 < 43) {
          return false;
        }
        return this.field_l.b((byte) 82);
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = this.field_l.a(false, param1, param2);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ma.A(").append(param0).append(',');
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ma(dl param0, f param1, mj param2) {
        this(param0, param1, param2.field_a);
        try {
          param2.field_a = this;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final f c(int param0) {
        f discarded$0 = super.c(param0);
        return this.field_l;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_l = this.field_l.a(param0, (byte) -94, param2, param3);
          if (param1 > -74) {
            field_n = (int[]) null;
          }
          return (f) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ma.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
          field_n = (int[]) null;
        }
        return this.field_l.e(-4128);
    }

    public static void f(int param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        field_p = null;
        if (param0 < 39) {
          ma.f(-74);
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        try {
          vk.field_N.a(16, param3 * 12, 12 * param0, 60, (byte) -111);
          if (param1 != 0) {
            dl[] var6 = (dl[]) null;
            this.a((f) null, 106, -41, (f[][]) null, (dl[]) null, (byte) -23);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ma.W(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_o = "What else do you think rocks roll off?";
        field_m = new jp();
    }
}
