/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static int field_b;
    private boolean field_a;
    static String field_e;
    private boolean field_d;
    private String field_c;

    final static void a(bj param0, bj param1, byte param2, bj param3) {
        ln[] var14 = null;
        int var11_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var13 = MinerDisturbance.field_ab;
        vk.field_e = td.a("frame_top", param0, "commonui", (byte) 126);
        v.field_d = td.a("frame_bottom", param0, "commonui", (byte) 118);
        fh.field_a = jn.a("jagex_logo_grey", param2 + -29571, "commonui", param0);
        r.field_a = td.a("button", param0, "commonui", (byte) 109);
        ed.field_g = md.a("validation", param0, 10, "commonui");
        sl.field_q = (we) ((Object) oc.a(param3, (byte) 125, "commonui", "arezzo12", param0));
        bn.field_d = (we) ((Object) oc.a(param3, (byte) 125, "commonui", "arezzo14", param0));
        cn.field_g = (we) ((Object) oc.a(param3, (byte) 125, "commonui", "arezzo14bold", param0));
        ea var17 = new ea(param1.a("", param2 ^ 18, "button.gif"), (java.awt.Component) ((Object) ef.field_c));
        pb.a("commonui", param0, "dropdown", (byte) -77);
        ln[] var5 = tb.a("screen_options", "commonui", param0, 1);
        kn.field_F = new ln[4];
        kc.field_f = new ln[4];
        qe.field_c = new ln[4];
        ln[][] var6 = new ln[][]{kn.field_F, kc.field_f, qe.field_c};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_n;
        for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8 = var5[0].field_m[0];
        var19[2][var8] = 16777215;
        var19[1][var8] = 2394342;
        var19[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            ln[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = ci.a(var5[var9], (byte) -114, var19[var11_int]);
            }
        }
        var9 = var17.field_C;
        ti.a((byte) -15);
        var17.g();
        eh.b(0, 0, eh.field_g, eh.field_c);
        ea var15 = new ea(var9, var9);
        ea var18 = var15;
        var18.g();
        var17.g(0, 0);
        ea var11 = new ea(var9, var9);
        var11.g();
        var17.g(-var17.field_y + var9, 0);
        ea var12 = new ea(-(var9 * 2) + var17.field_y, var9);
        var12.g();
        var17.g(-var9, 0);
        tk.b(true);
        if (param2 != 18) {
            return;
        }
        try {
            r.field_a = new ea[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "jf.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 >= -42) {
            field_e = (String) null;
        }
        field_e = null;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            return false;
        }
        return this.field_d;
    }

    final String a(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return this.field_c;
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            this.a(-52);
        }
        this.field_d = true;
        this.field_a = param1 ? true : false;
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 > 48) {
              var1_int = 0;
              L1: while (true) {
                if ((var1_int ^ -1) <= -1001) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (uf.field_p[var1_int] != null) {
                    var1_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = var1_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = -28;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "jf.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    jf(String param0) {
        this.field_a = false;
        this.field_d = false;
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        if (param0 >= -98) {
            field_b = 65;
        }
        return this.field_a;
    }

    static {
        field_e = "Prev";
    }
}
