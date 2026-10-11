/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends SceneWidget {
    private SceneWidget field_Yb;
    static NodeDeque field_Vb;
    static String field_Xb;
    static String field_Zb;
    static dj field_Sb;
    static IndexedSprite field_Wb;
    static c field_ac;
    static id field_Tb;
    static int[][] field_cc;
    static int field_bc;
    static int field_Ub;
    static int field_dc;

    final static ParticleEffect d(byte param0) {
        int fieldTemp$0 = mg.field_hc - 1;
        mg.field_hc = mg.field_hc - 1;
        if (0 > fieldTemp$0) {
          mg.field_hc = mg.field_hc + 10000;
        }
        int var1 = -54 % ((-5 - param0) / 60);
        return k.field_Cb[mg.field_hc];
    }

    final static void l(int param0) {
        jf.c(true);
        if (param0 != 0) {
          field_bc = 91;
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
          ol.l(15);
          if (nj.field_Q < 20) {
            return true;
          }
          if (!ri.c(6995)) {
            return true;
          }
          if (ua.field_o <= 0) {
            return false;
          }
          if (!a.a(105)) {
            return true;
          }
          return false;
        }
        if (nj.field_Q < 20) {
          return true;
        }
        if (!ri.c(6995)) {
          return true;
        }
        if (ua.field_o <= 0) {
          return false;
        }
        if (!a.a(105)) {
          return true;
        }
        return false;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param3 + (param0 + param2) <= SoftwareRaster.field_j) {
          return param0 + param2;
        }
        if (param1 <= param0 - param3) {
          return -param3 + param0;
        }
        return SoftwareRaster.field_j - param3;
    }

    final static boolean a(int[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 31) {
            stackIn_6_0 = (0 == (param0[param1 >> 5] & 1 << (param1 & 31)));
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ol.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ud a(int param0, boolean param1, int param2, int param3) {
        ud var4;
        int var5;
        ud var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        if (!param1) {
          return (ud) null;
        }
        var4 = (ud) (uf.field_f.first(13058));
        while (var4 != null) {
          if (var4.field_t == param2) {
            return var4;
          }
          var4 = (ud) (uf.field_f.next((byte) -86));
        }
        var4Lifetime1 = new ud();
        var4Lifetime1.field_u = param3;
        var4Lifetime1.field_t = param2;
        uf.field_f.addLast(3, var4Lifetime1);
        r.a(27153, var4Lifetime1, param0);
        return var4Lifetime1;
    }

    public static void k(int param0) {
        field_Xb = null;
        field_cc = (int[][]) null;
        field_Sb = null;
        if (param0 < -5) {
          field_ac = null;
          field_Zb = null;
          field_Wb = null;
          field_Vb = null;
          field_Tb = null;
          return;
        }
    }

    final boolean b(boolean param0, byte param1) {
        if (param1 > -125) {
          field_ac = (c) null;
          this.a((byte) 11, true);
          if (0 == lb.field_gc) {
            return 0 != this.field_Yb.field_Eb ? true : false;
          }
          if (this.field_Eb != 0) {
            return 0 != this.field_Yb.field_Eb ? true : false;
          }
          return true;
        }
        this.a((byte) 11, true);
        if (0 != lb.field_gc) {
          if (this.field_Eb == 0) {
            return true;
          }
          return 0 != this.field_Yb.field_Eb ? true : false;
        }
        if (0 == this.field_Yb.field_Eb) {
          return false;
        }
        return true;
    }

    ol(SceneWidget param0, SceneWidget param1, SceneWidget param2, SceneWidget param3, SceneWidget param4, SceneWidget param5) {
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        SceneWidget var8 = null;
        SceneWidget var9 = null;
        int var10 = 0;
        int var11 = 0;
        SceneWidget var13 = null;
        SceneWidget var14 = null;
        int var15 = 0;
        SceneWidget var17 = null;
        int var10Lifetime1;
        try {
          var17 = new SceneWidget(0L, param1, od.field_b.toUpperCase());
          var17.field_Kb = 1;
          this.field_Yb = new SceneWidget(0L, param2);
          var8 = new SceneWidget(0L, param3);
          var9 = new SceneWidget(0L, param3, od.field_f);
          var9.field_Kb = 1;
          var10 = 50;
          var11 = 0;
          for (var12 = 0; h.field_X.length > var12; var12++) {
            var13 = new SceneWidget(0L, param3, ci.field_b[var12]);
            var14 = new SceneWidget(0L, param3, h.field_X[var12]);
            var15 = param3.field_L.c(h.field_X[var12]);
            var13.a(0, var10, 15, 20, 65);
            if (var11 < var15) {
              var11 = var15;
            }
            var14.a(0, var10, 15, 90, 640);
            var8.a(var13, 127);
            var8.a(var14, 120);
            var10 += 30;
          }
          var17.a(0, 0, 24, 0, 90 + (var11 + 20));
          var10 += 15;
          this.a(0, 100, var10 + var17.field_Lb, 100, var17.field_zb);
          this.field_Yb.a(0, 5, 15, var17.field_zb - 20, 15);
          var8.a(0, var17.field_Lb, this.field_Lb - var17.field_Lb, 0, this.field_zb);
          var9.a(0, 20, 15, 0, this.field_zb);
          var8.field_I = se.a(3, 2105376, 11579568, var8.field_Lb, 8421504, 13574);
          var17.a(this.field_Yb, 127);
          var8.a(var9, 119);
          this.a(var17, 123);
          this.a(var8, 119);
          this.field_Y = 320 - (this.field_zb >> 1);
          var10Lifetime1 = -(this.field_Lb >> 1) + 240;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("ol.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = SteelSentinels.obfuscationControl;
        try {
          if (pm.field_T == vb.field_g) {
            return;
          }
          if (d.a(pm.field_T, 0)) {
            i.field_e[pm.field_T].s(126);
          }
          if (pm.field_T == 14) {
            um.f((byte) 3);
          }
          pm.field_T = vb.field_g;
          pc.field_w = Sprite.field_k;
          if (pm.field_T == -3) {
            vl.field_v = false;
          }
          pm.field_U = 0;
          if (lc.field_e) {
            if (me.field_f != ml.field_g) {
              jn.a(true, (byte) 71, 200, me.field_f);
            }
            if (fk.field_i != null) {
              fk.field_i.f((byte) -92);
            }
            if (null != si.field_A) {
              si.field_A.f((byte) -93);
            }
            fk.field_i = null;
            si.field_A = null;
            lc.field_e = false;
          }
          if (td.field_Sb) {
            lc.field_c = null;
            un.field_b = new NodeDeque();
            var9 = ge.field_m;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; 8 > var2; var2++) {
              var9[var2] = 0;
            }
            var10 = ce.field_t;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (8 > var6) {
              var10[var6] = 0;
              var6++;
            }
            td.field_Sb = false;
          }
          if (!param0) {
            return;
          }
          if (NodeIterator.field_d) {
            oa.f(-12161);
            im.a(true);
            ub.a(true);
            NodeIterator.field_d = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "ol.G(" + param0 + ')');
        }
    }

    static {
        field_Xb = "EXCLUSIVE";
        field_Vb = new NodeDeque();
        field_Zb = "Not yet achieved";
        field_Sb = new dj(2);
        field_bc = -1;
        field_Ub = 0;
        field_dc = 0;
    }
}
