/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    static int field_c;
    static double[] field_d;
    private ei field_a;
    private q field_b;
    static String field_e;

    final q a(byte param0) {
        q var2 = this.field_a.field_b.field_e;
        if (param0 < 21) {
          field_d = (double[]) null;
        }
        if (this.field_a.field_b == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_e;
        return var2;
    }

    final q a(int param0, q param1) {
        q var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        q stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.field_b.field_e;
          }
          if (param0 != 13771) {
            this.a(-112);
          }
          if (this.field_a.field_b != var3) {
            this.field_b = var3.field_e;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (q) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("re.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var3_intLifetime1;
        var4 = Torquing.field_u;
        try {
          if (ci.field_c != param2) {
            q.field_b = new int[param2];
            for (var3_int = 0; var3_int < param2; var3_int++) {
              q.field_b[var3_int] = (var3_int << 12) / param2;
            }
            ci.field_c = param2;
            jh.field_A = param2 - 1;
            ff.field_b = param2 * 32;
          }
          if (param0 != um.field_o) {
            if (ci.field_c != param0) {
              dp.field_a = new int[param0];
              var6 = 0;
              var3_intLifetime1 = var6;
              while (var6 < param0) {
                dp.field_a[var6] = (var6 << 12) / param0;
                var6++;
              }
            } else {
              dp.field_a = q.field_b;
            }
            um.field_o = param0;
            vp.field_I = param0 - 1;
          }
          if (param1 != 0) {
            var5 = (la) null;
            re.a((la) null, false, (la) null, (la) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "re.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(la param0, boolean param1, la param2, la param3) {
        int var11_int = 0;
        String stackIn_3_0 = null;
        la stackIn_3_1 = null;
        la stackIn_3_2 = null;
        boolean stackIn_4_3 = false;
        String stackIn_6_0 = null;
        la stackIn_6_1 = null;
        la stackIn_6_2 = null;
        boolean stackIn_7_3 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sm[] var5 = null;
        sm[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        sm[] var10 = null;
        t var11 = null;
        t var12 = null;
        int var13 = 0;
        sm[] var14 = null;
        t var15 = null;
        int[][] var16 = null;
        t var17 = null;
        t var18 = null;
        int[][] var19 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Torquing.field_u;
        try {
          hh.field_b = pb.a("frame_top", -1, "commonui", param3);
          vf.field_i = pb.a("frame_bottom", -1, "commonui", param3);
          rp.field_h = mn.a(param3, "commonui", "jagex_logo_grey", 114);
          dg.field_g = pb.a("button", -1, "commonui", param3);
          wj.field_h = jb.a(0, param3, "validation", "commonui");
          stackIn_3_0 = "commonui";
          stackIn_3_1 = (la) (param3);
          stackIn_3_2 = (la) (param0);
          stackIn_4_3 = !(param1);
          sp.field_R = (uc) ((Object) dc.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_4_3, "arezzo12"));
          dg.field_e = (uc) ((Object) dc.a("commonui", param3, param0, false, "arezzo14"));
          stackIn_6_0 = "commonui";
          stackIn_6_1 = (la) (param3);
          stackIn_6_2 = (la) (param0);
          stackIn_7_3 = !(param1);
          pe.field_E = (uc) ((Object) dc.a(stackIn_6_0, stackIn_6_1, stackIn_6_2, stackIn_7_3, "arezzo14bold"));
          if (!param1) {
            field_c = 47;
          }
          var17 = new t(param2.a(-126, "", "button.gif"), (java.awt.Component) ((Object) k.field_d));
          md.a("dropdown", 31094, param3, "commonui");
          var5 = ip.a(param3, -126, "commonui", "screen_options");
          jn.field_c = new sm[4];
          s.field_s = new sm[4];
          ni.field_l = new sm[4];
          var6 = new sm[][]{ni.field_l, s.field_s, jn.field_c};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_k;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_l[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = jj.a(var5[var9], var19[var11_int], 0);
            }
          }
          var9Lifetime1 = var17.field_t;
          bp.a((byte) -95);
          var17.e();
          ph.e(0, 0, ph.field_j, ph.field_d);
          var15 = new t(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.e();
          var17.b(0, 0);
          var11 = new t(var9Lifetime1, var9Lifetime1);
          var11.e();
          var17.b(-var17.field_s + var9Lifetime1, 0);
          var12 = new t(var17.field_s - var9Lifetime1 * 2, var9Lifetime1);
          var12.e();
          var17.b(-var9Lifetime1, 0);
          r.a(125);
          dg.field_g = new t[]{var15, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("re.F(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final q a(boolean param0) {
        if (!param0) {
          return (q) null;
        }
        q var2 = this.field_b;
        if (this.field_a.field_b == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_h;
        return var2;
    }

    final q a(int param0) {
        q var2 = this.field_a.field_b.field_h;
        if (this.field_a.field_b == var2) {
          this.field_b = null;
          return null;
        }
        if (param0 != 17514) {
          this.a((byte) 73);
        }
        this.field_b = var2.field_h;
        return var2;
    }

    public static void b(int param0) {
        field_d = null;
        if (param0 != 21007) {
          return;
        }
        field_e = null;
    }

    final q b(boolean param0) {
        q var2 = this.field_b;
        if (this.field_a.field_b == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_e;
        if (!param0) {
          this.a(true);
        }
        return var2;
    }

    final q a(q param0, int param1) {
        q var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        q stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            var3 = this.field_a.field_b.field_h;
          } else {
            var3 = param0;
          }
          if (this.field_a.field_b == var3) {
            this.field_b = null;
            stackIn_5_0 = null;
            return (q) (stackIn_5_0);
          }
          this.field_b = var3.field_h;
          if (param1 != -27392) {
            re.a(7, 38, 13);
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("re.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    re(ei param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        param1 = ((param1 & -1431655766) >>> 1) + (1431655765 & param1);
        param1 = (-1288490189 & param1 >>> 2) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & param0;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return param1 & 255;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param1) {
          ph.b(0, 0, ph.field_j, ph.field_d, 0, 192);
        } else {
          ph.b();
        }
        jm.a(param1, -127);
        if (!param0) {
          field_d = (double[]) null;
        }
    }

    static {
        field_c = 0;
        field_d = new double[]{0.0, 80.0, 0.0};
    }
}
