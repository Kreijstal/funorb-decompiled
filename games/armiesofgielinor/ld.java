/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends SpellAreaEffect {
    private int field_v;
    static int field_s;
    private int field_F;
    static String field_G;
    static int[] field_x;
    private int field_D;
    private int field_u;
    private int field_E;
    private int field_A;
    private Unit field_z;
    private int field_t;
    private Unit field_y;
    private int field_w;
    private int field_B;
    private int[] field_C;

    final static void a(int param0, String param1, boolean param2, byte param3, boolean param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var7Lifetime1;
        int var9Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          jm.field_g = true;
          ui.field_f = param0;
          var11 = param1;
          if (!param4) {
            stackIn_4_0 = tg.field_j;
          } else {
            stackIn_4_0 = tl.field_h;
          }
          var6 = stackIn_4_0;
          if (ui.field_f == 0) {
            var7 = iu.a(480, var11, param3 ^ 7444, AiPlanner.field_G, fs.field_c);
            var8 = 3 + var7;
            cj.field_k = new int[var8];
            nb.field_h = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              cj.field_k[var9] = -1;
            }
            rg.field_m = new int[2];
            for (var9 = 0; var9 < var7; var9++) {
              nb.field_h[var9] = fs.field_c[var9];
            }
            nb.field_h[var8 - 3] = "";
            nb.field_h[-2 + var8] = var6;
            cj.field_k[-2 + var8] = 0;
            rg.field_m[0] = 1;
            nb.field_h[var8 - 1] = pd.field_f;
            cj.field_k[var8 - 1] = 1;
            rg.field_m[1] = 2;
          } else {
            if (ui.field_f != 1) {
              throw new IllegalArgumentException();
            }
            var7 = iu.a(480, var11, param3 + 7412, AiPlanner.field_G, fs.field_c);
            var8 = 2 + var7;
            cj.field_k = new int[var8];
            nb.field_h = new String[var8];
            for (var9 = 0; var9 < var8; var9++) {
              cj.field_k[var9] = -1;
            }
            rg.field_m = new int[1];
            for (var9 = 0; var7 > var9; var9++) {
              nb.field_h[var9] = fs.field_c[var9];
            }
            nb.field_h[var8 - 2] = "";
            nb.field_h[var8 - 1] = pd.field_f;
            cj.field_k[var8 - 1] = 0;
            rg.field_m[0] = 2;
          }
          MovementPlanner.field_z.field_k = rg.field_m.length;
          var7Lifetime1 = 0;
          for (var8Lifetime1 = 0; var8Lifetime1 < nb.field_h.length; var8Lifetime1++) {
            stackIn_25_0 = nb.field_h[var8Lifetime1];
            stackIn_26_1 = !(cj.field_k[var8Lifetime1] < 0);
            var9Lifetime1 = lp.a(stackIn_25_0, stackIn_26_1, false);
            if (cj.field_k[var8Lifetime1] != -1) {
              var9Lifetime1 = var9Lifetime1 + df.field_E * 2;
            }
            if (var9Lifetime1 > var7Lifetime1) {
              var7Lifetime1 = var9Lifetime1;
            }
          }
          bm.field_h = var7Lifetime1 + bt.field_g - (var7Lifetime1 >> 1);
          co.field_f = bt.field_g - (var7Lifetime1 >> 1);
          ms.field_r = (ar.field_w + rd.field_b << 1) * MovementPlanner.field_z.field_k;
          var8Lifetime2 = 0;
          while (nb.field_h.length > var8Lifetime2) {
            stackIn_38_0 = ms.field_r;
            stackIn_38_1 = ~cj.field_k[var8Lifetime2];
            if (stackIn_38_1 <= -1) {
              stackIn_41_1 = jg.field_k;
            } else {
              stackIn_41_1 = cn.field_o;
            }
            ms.field_r = stackIn_38_0 + stackIn_41_1;
            var8Lifetime2++;
          }
          if (param3 != 90) {
            field_x = (int[]) null;
          }
          rk.field_r = -(ms.field_r >> 1) + lm.field_g;
          MovementPlanner.field_z.a(0, param2, vo.a((byte) -73, ko.field_b, AiPlanningStrategy.field_d), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_48_0 = var5;
          stackIn_48_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 62) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          ld.a(-105, (java.applet.Applet) null);
        }
        return tm.field_e[param1 & 2047];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              if (param0 != 16058) {
                return;
              }
              var4 = param1.getCodeBase();
              var3 = ck.a(-3780, var4, param1).getFile();
              lj.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 116);
              lj.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 74);
              lj.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 98);
              lj.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 75);
              lj.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 122);
              lj.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 - 15938);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ld.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void applyEffect(int obfuscationGuard, Battlefield battlefield) {
        int var4 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_E = this.field_u;
          var8 = new int[this.field_D];
          var7 = var8;
          var3 = var7;
          this.field_F = this.field_v;
          for (var4 = 0; var4 < this.field_D; var4++) {
            var5 = this.field_C[var4];
            if (var5 == 1) {
              this.field_F = this.field_F - 1;
            } else {
              if (var5 == 2) {
                this.field_F = this.field_F + 1;
              } else {
                if (var5 != 0) {
                  if (var5 == 3) {
                    this.field_E = this.field_E - 1;
                  }
                } else {
                  this.field_E = this.field_E + 1;
                }
              }
            }
            var3[var4] = this.field_C[var4];
          }
          if (!this.field_y.packedFlag8 ||
            this.field_y.unitType == 0) {
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new MoveEvent(this.field_u, this.field_v, var8)));
          }
          if (obfuscationGuard != 64) {
            ld.a((byte) -102, 105);
          }
          if (this.field_w != 0 ||
            0 != this.field_t) {
            if (this.field_y.packedFlag8 &&
              7 == this.field_y.unitType) {
              return;
            }
            battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new AttackEvent(this.field_E, this.field_F, this.field_w, this.field_t, this.field_z, this.field_A, this.field_B)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_32_0 = var3_ref;
          stackIn_32_1 = new StringBuilder().append("ld.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, RgbSprite[] param1, tu param2, String param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param6 >= -33) {
            field_x = (int[]) null;
          }
          var7_int = param2.a(param3) + (param1[0].field_y << 1);
          var8 = -(var7_int >> 1) + param5;
          var9 = (var7_int >> 1) + param5;
          if (0 > var8) {
            param5 = param5 - var8;
          } else {
            if (var9 > 640) {
              param5 = param5 - (var9 - 640);
            }
          }
          jp.a(-(var7_int >> 1) + param5, param0, var7_int, param1, param4, -8991);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 >= -40) {
          return;
        }
        field_G = null;
        field_x = null;
    }

    ld(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, Unit param7, Unit param8) {
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        try {
          this.field_v = param1;
          this.field_w = param4;
          this.field_y = param7;
          this.field_D = param3;
          this.field_u = param0;
          this.field_t = param5;
          this.field_m = param6;
          this.field_C = param2;
          if (param8 == null) {
            this.field_w = 0;
            this.field_z = null;
            this.field_t = 0;
          } else {
            this.field_z = param8.copyDetached(false);
            var10_int = bw.unitDefinitions[this.field_y.unitType][9];
            stackIn_4_1 = this.field_y.strength * vu.field_N[var10_int] / this.field_y.maximumStrength;
            if (this.field_y.strength * vu.field_N[var10_int] % this.field_y.maximumStrength != 0) {
              stackIn_5_2 = 1;
            } else {
              stackIn_5_2 = 0;
            }
            this.field_A = stackIn_4_1 + stackIn_5_2;
            var11 = bw.unitDefinitions[this.field_z.unitType][9];
            if (0 != this.field_z.strength * vu.field_N[var11] % this.field_z.maximumStrength) {
              stackIn_8_1 = 1;
            } else {
              stackIn_8_1 = 0;
            }
            this.field_B = stackIn_8_1 + this.field_z.strength * vu.field_N[var11] / this.field_z.maximumStrength;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param8 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_G = "No target selected.";
        field_s = -1;
    }
}
