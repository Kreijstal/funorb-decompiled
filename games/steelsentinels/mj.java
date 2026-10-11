/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mj extends SceneWidget {
    static double field_Xb;
    static String field_ac;
    private SceneWidget[] field_Ub;
    static kg field_Sb;
    private SceneWidget[] field_Tb;
    int field_bc;
    private SceneWidget field_Wb;
    static int field_cc;
    static de field_Vb;
    static SceneWidget field_Zb;
    static ja field_Yb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_zb = param3;
        this.field_Lb = param1;
        this.field_eb = param6;
        this.field_Y = param4;
        if (param0 != 10) {
          return;
        }
        this.a(param2, param5, 0);
    }

    final static void a(ak param0, int param1, int param2, int param3) {
        try {
          cl.field_b = param1;
          int var4_int = 50 % ((param3 - 53) / 62);
          ok.field_c = param2;
          gl.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "mj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String b(long param0, int param1) {
        pg.field_x.setTime(new Date(param0));
        int var3 = pg.field_x.get(7);
        int var4 = pg.field_x.get(5);
        int var5 = pg.field_x.get(2);
        int var6 = pg.field_x.get(1);
        if (param1 != 0) {
          return (String) null;
        }
        int var7 = pg.field_x.get(11);
        int var8 = pg.field_x.get(12);
        int var9 = pg.field_x.get(13);
        return cf.field_t[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + CombatWorld.field_jb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    mj(long param0, SceneWidget param1, String[] param2, SceneWidget param3, SceneWidget[] param4, int param5) {
        super(param0, (SceneWidget) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        SceneWidget var9 = null;
        int var11 = 0;
        int var8_intLifetime1;
        try {
          this.field_Ub = new SceneWidget[param2.length];
          this.field_Wb = new SceneWidget(0L, param3);
          this.field_Tb = param4;
          for (var8_int = 0; param2.length > var8_int; var8_int++) {
            var9 = new SceneWidget(0L, param1);
            var9.field_S = param2[var8_int];
            this.field_Ub[var8_int] = var9;
            this.a(var9, 124);
          }
          this.a(this.field_Wb, 120);
          var11 = 0;
          var8_intLifetime1 = var11;
          while (param4.length > var11) {
            this.field_Wb.a(param4[var11], 126);
            var11++;
          }
          this.field_bc = param5;
          this.field_Ub[param5].field_G = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("mj.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        SceneWidget dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        for (var4 = 0; this.field_Ub.length > var4; var4++) {
          var5 = this.field_zb * var4 / this.field_Ub.length;
          var6 = (1 + var4) * this.field_zb / this.field_Ub.length;
          this.field_Ub[var4].field_Y = var5;
          this.field_Ub[var4].field_eb = 0;
          this.field_Ub[var4].field_zb = var6 - var5;
          this.field_Ub[var4].field_Lb = param1;
        }
        this.field_Wb.a(param2 + param2, param1, this.field_Lb - param1, 0, this.field_zb);
        var8 = 0;
        var4Lifetime1 = var8;
        while (this.field_Tb.length > var8) {
          this.field_Tb[var8].a(0, param0, -(2 * param0) + this.field_Wb.field_Lb, param0, -(param0 * 2) + this.field_Wb.field_zb);
          if (this.field_bc != var8) {
            dupTemp$0 = this.field_Tb[var8];
            dupTemp$0.field_Y = dupTemp$0.field_Y + 10000;
          }
          var8++;
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != 49) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
              param1.getAppletContext().showDocument(ge.a(param0 - 49, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("mj.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -72) {
          return;
        }
        field_Vb = null;
        field_Sb = null;
        field_Yb = null;
        field_Zb = null;
        field_ac = null;
    }

    final static void b(String param0, byte param1) {
        try {
          int var2_int = 46 % ((6 - param1) / 37);
          d.field_U = param0;
          hc.a(12, 0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "mj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        SceneWidget dupTemp$0 = null;
        SceneWidget dupTemp$1 = null;
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        var2 = 0;
        if (param0 != 10000) {
          return;
        }
        while (this.field_Ub.length > var2) {
          if (var2 != this.field_bc &&
            0 != this.field_Ub[var2].field_Eb) {
            this.field_Ub[this.field_bc].field_G = false;
            dupTemp$0 = this.field_Tb[this.field_bc];
            dupTemp$0.field_Y = dupTemp$0.field_Y + 10000;
            this.field_bc = var2;
            this.field_Ub[var2].field_G = true;
            dupTemp$1 = this.field_Tb[var2];
            dupTemp$1.field_Y = dupTemp$1.field_Y - 10000;
          }
          var2++;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12_ref_int__ = null;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int[] var12_ref_int__Lifetime1;
        int[] var13Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var15Lifetime1;
        var16 = SteelSentinels.obfuscationControl;
        try {
          if (param2 > 32767) {
            param2 = 32767;
          }
          if (1 + param3 <= fm.field_f[param0]) {
            if (param0 == 1) {
              if (param2 < jh.field_a[param3]) {
                jh.field_a[param3] = param2;
              }
            } else {
              if (param0 == 2 &&
                param2 < jh.field_a[10 + param3]) {
                jh.field_a[param3 + 10] = param2;
              }
            }
          } else {
            fm.field_f[param0] = 1 + param3;
            if (param0 == 0 &&
              fm.field_f[param0] == fj.field_d) {
              if (ni.b(122)) {
                stackIn_11_0 = td.field_ac;
              } else {
                stackIn_11_0 = CombatWorld.field_k;
              }
              km.field_a = stackIn_11_0;
              if (NodeIterator.field_f < 1) {
                NodeIterator.field_f = 1;
              }
              ln.field_g = -1;
            }
            if (param0 == 0 &&
              10 == fm.field_f[param0] &&
              ni.b(param7 + 103)) {
              km.field_a = DualNodeDeque.field_b;
            }
            if (1 == param0) {
              jh.field_a[param3] = param2;
            }
            if (param0 == 2) {
              jh.field_a[param3 + 10] = param2;
            }
          }
          if (!ni.b(85)) {
            mm.field_g.a(71, (byte) -117);
            mm.field_g.a((byte) 114, 10 * param0 + param3);
            mm.field_g.d(param2, 54);
            mm.field_g.b(true, param5);
            mm.field_g.b(true, param1);
            mm.field_g.b(true, param6);
            mm.field_g.b(true, param4);
          } else {
            Explosion.field_P = Explosion.field_P | 1 << 10 * param0 + param3;
          }
          var8 = d.field_T[10 * param0 + param3];
          var9 = bi.field_e[param3 + param0 * 10];
          var10 = 0;
          var11 = 0;
          var17 = var8;
          var12_ref_int__ = var17;
          for (var13_int = 0; var13_int < var17.length; var13_int++) {
            var14 = var17[var13_int];
            if (!t.a(rn.field_D, var14, -20370)) {
              var10++;
            }
          }
          var12_ref_int__Lifetime1 = var9;
          var19 = 0;
          var13_intLifetime1 = var19;
          while (var12_ref_int__Lifetime1.length > var19) {
            var14Lifetime1 = var12_ref_int__Lifetime1[var19];
            if (!t.a(fe.field_D, var14Lifetime1, -20370)) {
              var11++;
            }
            var19++;
          }
          ad.field_i = new int[var10];
          vk.field_g = new int[var11];
          var12 = 0;
          var18 = var8;
          var13 = var18;
          for (var14Lifetime2 = 0; var14Lifetime2 < var18.length; var14Lifetime2++) {
            var15 = var18[var14Lifetime2];
            if (!t.a(rn.field_D, var15, -20370)) {
              incrementValue$1 = var12;
              var12++;
              ad.field_i[incrementValue$1] = var15;
            }
          }
          var12Lifetime1 = 0;
          var13Lifetime1 = var9;
          for (var14Lifetime3 = 0; var14Lifetime3 < var13Lifetime1.length; var14Lifetime3++) {
            var15Lifetime1 = var13Lifetime1[var14Lifetime3];
            if (!t.a(fe.field_D, var15Lifetime1, -20370)) {
              incrementValue$0 = var12Lifetime1;
              var12Lifetime1++;
              vk.field_g[incrementValue$0] = var15Lifetime1;
            }
          }
          if (param7 != -65) {
            mj.b(70L, 70);
          }
          if (var10 <= 0 &&
            var11 <= 0) {
            return;
          }
          vn.d(-106);
          for (var12Lifetime2 = 0; va.field_k.length > var12Lifetime2; var12Lifetime2++) {
            va.field_k[var12Lifetime2] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var8_ref), "mj.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_ac = "Private";
        field_Xb = Math.atan2(1.0, 0.0);
        field_Vb = new de("usename");
        field_Yb = new ja();
    }
}
