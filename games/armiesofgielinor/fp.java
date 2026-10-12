/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends ClientUiComponent {
    static ClientUiComponent field_Lb;
    private ClientUiComponent field_Kb;
    private ClientUiComponent field_Jb;
    static String field_Ib;

    fp(long param0, fp param1, String param2) {
        this(param0, param1.field_Jb, param1.field_Kb, param2);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        this.setBounds(param3, -20500, param5, param1, param4);
        if (param0 != 120) {
          field_Ib = (String) null;
        }
        this.c(param0 ^ 120, param2);
    }

    final static void a(int param0, pu param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        bq stackIn_41_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        bq var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        pu var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param7 != 120) {
            field_Ib = (String) null;
          }
          var45 = param1;
          if (null != var45.field_K &&
            var45.field_E > 1) {
            var61 = var45.field_K;
            el.a((byte) -105, var61, jp.field_g, 0, 0);
          } else {
            mw.e((byte) -63);
          }
          var55 = new int[param1.field_t];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param1.field_t];
          var62 = ArmiesOfGielinor.field_I;
          var63 = Widget.field_m;
          var64 = rj.field_Q;
          for (var13 = 0; var13 < param1.field_t; var13++) {
            var14 = var62[var13] * param5 + (param3 * var63[var13] + param2 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = var14 + 128;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = var64[var13] * param6 + (param4 * var62[var13] + var63[var13] * param0) >> 8;
            stackIn_20_0 = hg.field_a;
            if (0 <= var15) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < hc.field_q) {
            var14Lifetime1 = ab.field_c[var44];
            var15Lifetime1 = param1.field_c[var14Lifetime1];
            var16 = param1.field_j[var14Lifetime1];
            var17 = param1.field_e[var14Lifetime1];
            if (ArmiesOfGielinor.field_I.length > param1.field_w[var14Lifetime1]) {
              stackIn_27_0 = param1.field_w[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var18 = stackIn_27_0;
            if (ArmiesOfGielinor.field_I.length > param1.field_Q[var14Lifetime1]) {
              stackIn_30_0 = param1.field_Q[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var19 = stackIn_30_0;
            if (ArmiesOfGielinor.field_I.length <= param1.field_d[var14Lifetime1]) {
              stackIn_33_0 = -1;
            } else {
              stackIn_33_0 = param1.field_d[var14Lifetime1];
            }
            var20 = stackIn_33_0;
            if (null != pg.field_a &&
              param1.field_u != null &&
              param1.field_u.length > var14Lifetime1 &&
              param1.field_u[var14Lifetime1] != -1 &&
              pg.field_a.length > param1.field_u[var14Lifetime1]) {
              stackIn_41_0 = pg.field_a[param1.field_u[var14Lifetime1]];
            } else {
              stackIn_41_0 = null;
            }
            var21 = stackIn_41_0;
            var22 = TileMetadata.field_f[var15Lifetime1];
            var23 = fa.field_k[var15Lifetime1];
            var24 = TileMetadata.field_f[var16];
            var25 = fa.field_k[var16];
            var26 = TileMetadata.field_f[var17];
            var27 = fa.field_k[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_51_0 = var21.field_e;
              } else {
                stackIn_51_0 = 8355711;
              }
              var30 = stackIn_51_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = -1090453760 & var32 * var28 >>> 8 | (var28 * var31 & -16711859) >>> 8;
              var33 = var33 + 65793 * var29;
              oe.a(-6, var22, var27, var24, var25, 8355711 & var33 >> 1, var23, var26);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_47_0 = 8355711;
              } else {
                stackIn_47_0 = var21.field_e;
              }
              var34 = stackIn_47_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = 335609600 & var36 * var28 >>> 8 | (-16711718 & var28 * var35) >>> 8;
              var38 = -2113863936 & var36 * var29 >>> 8 | -83951361 & var29 * var35 >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + 65793 * var31;
              var39 = (var35 * var30 & -16711828) >>> 8 | (var30 * var36 & 16711711) >>> 8;
              var39 = var39 + var33 * 65793;
              dv.a(var23, (65292 & var39) >> 8, var22, (byte) -66, var37 & 255, (var37 & 65466) >> 8, var37 >> 16, var38 >> 16, var27, 255 & var38 >> 8, var39 >> 16, var26, var39 & 255, var38 & 255, var24, var25);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_56_0 = var8_ref;
          stackIn_56_1 = new StringBuilder().append("fp.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    fp(long param0, RgbSprite param1, RgbSprite param2, int param3, ClientUiComponent param4, String param5) {
        this(param0, (ClientUiComponent) null, param4, param5);
        try {
          this.field_Jb.sprite = param2;
          this.field_Jb.selectedSprite = param1;
          this.field_Jb.verticalAlignment = param3;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static gl l(int param0) {
        if (param0 >= -110) {
          return (gl) null;
        }
        String var1 = CombatPresentation.i(-4938);
        if (var1 != null &&
          !(var1.indexOf('@') < 0)) {
          var1 = "";
        }
        return new gl(CombatPresentation.i(-4938), gi.a(false));
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2, PacketBuffer param3, PacketBuffer param4) {
        try {
          if (param2 != 26) {
            field_Lb = (ClientUiComponent) null;
          }
          ls.a(param4, 0, param0, 6727, param3.position, param1, param3.payload);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fp.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private fp(long param0, ClientUiComponent param1, ClientUiComponent param2, String param3) {
        super(param0, (ClientUiComponent) null);
        try {
          this.field_Jb = new ClientUiComponent(0L, param1);
          this.field_Kb = new ClientUiComponent(0L, param2);
          this.field_Kb.text = param3;
          this.addChild(this.field_Jb, 79);
          this.addChild(this.field_Kb, 58);
          this.inheritVisualStateForDescendants(-10027);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1) {
        this.field_Jb.setBounds(this.height, -20500, this.field_Jb.getPreferredWidth(-53), 0, 0);
        int var3 = this.field_Jb.width + param1;
        this.field_Kb.setBounds(this.height, param0 - 20500, this.width - var3, param0, var3);
    }

    final static void a(String param0, byte param1) {
        if (param1 >= -59) {
          return;
        }
        try {
          DropdownSelector.field_P = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(int param0) {
        if (param0 != 21755) {
          field_Lb = (ClientUiComponent) null;
        }
        field_Lb = null;
        field_Ib = null;
    }

    final int d(int param0, int param1) {
        if (param0 < 23) {
          field_Ib = (String) null;
        }
        return this.field_Jb.getPreferredWidth(-35) + (param1 + this.field_Kb.getPreferredWidth(102));
    }

    static {
        db.a(true, ' ');
        field_Ib = "Open portal - Opens a single portal for a single god's forces at the current map tile";
    }
}
