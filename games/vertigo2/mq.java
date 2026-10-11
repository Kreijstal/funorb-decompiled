/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends va {
    private e field_x;
    static String field_t;
    static String field_u;
    private e[] field_w;
    static mp field_v;

    final void a(byte param0, er param1) {
        e[] var7 = null;
        int var4 = 0;
        e var5_ref_e = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var7 = this.field_w;
          e[] var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5_ref_e = var7[var4];
            if (var5_ref_e != null) {
              var5_ref_e.field_h = param1;
            }
          }
          int var5 = -101 % ((-16 - param0) / 58);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mq.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var21Lifetime1;
        int var22Lifetime1;
        var25 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = 0;
          var7 = param1;
          var8 = param3 * param3;
          if (param0) {
            field_u = (String) null;
          }
          var9 = param1 * param1;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var12 = param1 << 1;
          var13 = var8 * (1 - var12) + var10;
          var14 = var9 - (-1 + var12) * var11;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = var10 * (3 + (var6_int << 1));
          var18 = (-3 + (var7 << 1)) * var11;
          var19 = var16 * (1 + var6_int);
          var20 = var15 * (-1 + var7);
          if (ua.field_e <= param4 &&
            cj.field_D >= param4) {
            var21 = pk.a((byte) -14, ib.field_a, param5 + param3, ap.field_e);
            var22 = pk.a((byte) -14, ib.field_a, -param3 + param5, ap.field_e);
            ki.a(-86, var22, vl.field_e[param4], var21, param2);
          }
          while (true) {
            if (var7 <= 0) {
              return;
            }
            if (var13 < 0) {
              while (var13 < 0) {
                var13 = var13 + var17;
                var14 = var14 + var19;
                var6_int++;
                var19 = var19 + var16;
                var17 = var17 + var16;
              }
            }
            if (var14 < 0) {
              var14 = var14 + var19;
              var13 = var13 + var17;
              var17 = var17 + var16;
              var19 = var19 + var16;
              var6_int++;
            }
            var14 = var14 - var18;
            var13 = var13 - var20;
            var20 = var20 - var15;
            var18 = var18 - var15;
            var7--;
            var21Lifetime1 = param4 - var7;
            var22Lifetime1 = param4 + var7;
            if (var22Lifetime1 < ua.field_e) {
              continue;
            }
            if (var21Lifetime1 > cj.field_D) {
              continue;
            }
            var23 = pk.a((byte) -14, ib.field_a, param5 + var6_int, ap.field_e);
            var24 = pk.a((byte) -14, ib.field_a, param5 - var6_int, ap.field_e);
            if (ua.field_e <= var21Lifetime1) {
              ki.a(-85, var24, vl.field_e[var21Lifetime1], var23, param2);
            }
            if (cj.field_D < var22Lifetime1) {
              continue;
            }
            ki.a(-76, var24, vl.field_e[var22Lifetime1], var23, param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var6), "mq.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(boolean param0) {
        int var2;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          field_t = (String) null;
        }
        if (!ln.field_d.field_i) {
          if ((ln.field_d.field_D.field_t & 1 << ln.field_d.field_B) == 0) {
            if (ln.field_d.field_D.field_t != 0) {
              sl.field_q[12] = en.field_c;
            } else {
              if ((1 << ln.field_d.field_B | ln.field_d.field_h) != -1 + (1 << ln.field_d.field_D.field_z)) {
                sl.field_q[12] = fq.field_f;
              } else {
                sl.field_q[12] = ii.field_A;
              }
            }
          } else {
            sl.field_q[12] = ho.field_a;
          }
        } else {
          if ((1 << ln.field_d.field_B & ln.field_d.field_D.field_t) != 0) {
            sl.field_q[12] = hi.field_p;
          } else {
            if (ln.field_d.field_D.field_t == 0) {
              if ((1 << ln.field_d.field_B | ln.field_d.field_h) == -1 + (1 << ln.field_d.field_D.field_z)) {
                sl.field_q[12] = kd.field_B;
              } else {
                sl.field_q[12] = oq.field_H;
              }
            } else {
              sl.field_q[12] = bh.field_H;
            }
          }
        }
    }

    private final void a(byte param0, boolean param1, mq param2) {
        int var4_int = 0;
        e dupTemp$0 = null;
        e stackIn_9_0 = null;
        e stackIn_10_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        e var5 = null;
        e var6 = null;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 <= 39) {
            field_t = (String) null;
          }
          super.a(16777215, param2);
          if (param1) {
            for (var4_int = 0; 6 > var4_int; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 == null) {
                param2.field_w[var4_int] = null;
              } else {
                var6 = param2.field_w[var4_int];
                stackIn_9_0 = var5;
                if (var6 != null) {
                  stackIn_10_1 = var6;
                } else {
                  dupTemp$0 = new e();
                  param2.field_w[var4_int] = dupTemp$0;
                  stackIn_10_1 = dupTemp$0;
                }
                ((e) (Object) stackIn_9_0).a(stackIn_10_1, 16777215);
              }
            }
            return;
          }
          qq.a(this.field_w, 0, param2.field_w, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("mq.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        gk.field_a[44] = 71;
        gk.field_a[91] = 42;
        gk.field_a[59] = 57;
        gk.field_a[222] = 58;
        gk.field_a[520] = 59;
        gk.field_a[192] = 28;
        gk.field_a[92] = 74;
        gk.field_a[46] = 72;
        gk.field_a[45] = 26;
        gk.field_a[93] = 43;
        gk.field_a[47] = 73;
        gk.field_a[61] = 27;
        if (param0 != 1) {
          mq.c(-54);
        }
    }

    final static void a(java.math.BigInteger param0, ed param1, java.math.BigInteger param2, int param3, ed param4) {
        try {
          if (param3 != 12) {
            ed var6 = (ed) null;
            mq.a((java.math.BigInteger) null, (ed) null, (java.math.BigInteger) null, 66, (ed) null);
          }
          qp.a(param2, param0, param4.field_p, 0, param4.field_u, (byte) 63, param1);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mq.MA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, er[] param1, boolean param2) {
        int var4_int = 0;
        if (param2) {
          return;
        }
        try {
          var4_int = param0;
          if (this.field_w[var4_int] == null) {
            this.field_w[var4_int] = new e();
          }
          this.field_w[param0].field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mq.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(er[] param0, byte param1) {
        int var4 = 0;
        e[] var3 = null;
        e var5 = null;
        int var6 = 0;
        e[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_m = param0;
            }
          }
          if (param1 < 21) {
            field_t = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("mq.KA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    mq(mq param0, boolean param1) {
        this();
        try {
          param0.a((byte) 77, param1, this);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "mq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        iq stackIn_3_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        e var7 = null;
        e var9 = null;
        d var10 = null;
        e var11 = null;
        e var12 = null;
        e var13 = null;
        e var14 = null;
        try {
          if (param3 instanceof d) {
            stackIn_3_0 = (iq) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var10 = (d) (stackIn_3_0);
          jb.a(param3.field_t + param4, param3.field_o + param1 + param3.field_n, param3.field_o + param1, -30486, param3.field_s + (param3.field_t + param4));
          if (var10 != null) {
            param0 = param0 & var10.field_F;
          }
          var7 = this.field_w[0];
          this.field_x.a(-21151);
          var7.a(this, param1, param3, -123, param4, this.field_x);
          if (var10 != null) {
            if (var10.field_G) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(this, param1, param3, -73, param4, this.field_x);
              }
            }
            if (var10.field_p) {
              var12 = this.field_w[3];
              if (var10.field_A != 0 &&
                var12 != null) {
                var12.a(this, param1, param3, -116, param4, this.field_x);
              } else {
                var9 = this.field_w[2];
                if (var9 != null) {
                  var9.a(this, param1, param3, -77, param4, this.field_x);
                }
              }
            }
          }
          if (param3.f(125)) {
            var13 = this.field_w[5];
            if (var13 != null) {
              var13.a(this, param1, param3, -93, param4, this.field_x);
            }
          }
          if (!param2) {
            this.a(-104, 1);
          }
          if (!param0) {
            var14 = this.field_w[4];
            if (var14 != null) {
              var14.a(this, param1, param3, -113, param4, this.field_x);
            }
          }
          this.field_x.a(param3, param1, 1, param4, this);
          ln.d(-28558);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("mq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, mp param1, int param2, cc param3, int param4, int param5, int param6, int param7, int param8, mp param9, byte param10, int param11, int param12, int param13, int param14, cc param15, int param16, int param17, int param18, mp param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          if (param10 <= 14) {
            mq.a(true, -13, -58, 72, 60, -124);
          }
          nb.a(param11, param3, param15, (byte) -99);
          ar.a(param13, (byte) 77, param14, param5, param18);
          tn.a(param20, param8, 55);
          vd.a(param4, param9, 1516482162, param17, param12, param1);
          tr.a(param2, param0, param19, -25220);
          pb.a((byte) -26, param7, param16, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("mq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param20).append(')').toString());
        }
    }

    final e a(int param0, int param1) {
        if (param1 != 6216) {
          field_v = (mp) null;
        }
        e dupTemp$0 = new e();
        this.field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public mq() {
        this.field_w = new e[6];
        this.field_x = new e();
        e dupTemp$0 = new e();
        this.field_w[0] = dupTemp$0;
        e var1 = dupTemp$0;
        var1.a(-21151);
    }

    final static String a(String param0, boolean param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1) {
            mq.a(false);
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var3[-var4 + var2_int - 1] = param0.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mq.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_t = null;
        field_v = null;
        field_u = null;
    }

    static {
        field_t = "Loading...";
        field_u = "Try changing the '<%0>' setting.";
    }
}
