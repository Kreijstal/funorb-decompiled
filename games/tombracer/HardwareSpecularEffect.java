/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareSpecularEffect extends ShaderEffect {
    static ToolkitSprite[] field_h;
    private boolean field_g;
    private na[] field_e;
    static String field_f;
    private boolean field_d;

    final void disable(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!this.field_g) {
          this.owner.a(0, false, ej.field_c);
        } else {
          this.owner.e(1, false);
          this.owner.bindTexture(true, (GpuTexture) null);
          this.owner.applyTexCoordGeneration(ItemModel.field_o, (byte) 0);
          this.owner.p((byte) 127);
          if (!this.field_d) {
            this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
            this.owner.a(ej.field_c, 0, -90);
            this.owner.e(2, false);
            this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
            this.owner.a(ej.field_c, 0, -108);
            this.owner.a(PlayerContextMenu.field_j, 1, -15);
            this.owner.a(0, false, ej.field_c);
            this.owner.bindTexture(true, (GpuTexture) null);
          } else {
            this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
            this.owner.a(ej.field_c, 0, -94);
            this.owner.a(0, false, ej.field_c);
          }
          this.owner.e(0, false);
          this.field_g = false;
        }
        this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
        if (param0 > -4) {
          this.setParameters((byte) 55, -114, 112);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          HardwareSpecularEffect.releaseStatics(-65);
        }
        field_h = null;
        field_f = null;
    }

    HardwareSpecularEffect(HardwareGraphicsToolkit param0) {
        super(param0);
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        boolean stackIn_5_1 = false;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        this.field_g = false;
        try {
          if (param0.field_Ob) {
            stackIn_5_1 = !(3 <= param0.field_Vb);
            this.field_d = stackIn_5_1;
            stackIn_8_0 = (this.field_d) ? 48 : 127;
            var2_int = stackIn_8_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            for (var14 = 0; var14 < 64; var14++) {
              for (var15 = 0; var15 < 64; var15++) {
                var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                var13 = (float)(1.0 / Math.sqrt((double)(1.0f + var11 * var11 + var12 * var12)));
                var12 = var12 * var13;
                var11 = var11 * var13;
                for (var16 = 0; var16 < 6; var16++) {
                  if (var16 != 0) {
                    if (var16 != 1) {
                      if (var16 == 2) {
                        var10 = var12;
                      } else {
                        if (var16 == 3) {
                          var10 = -var12;
                        } else {
                          if (var16 == 4) {
                            var10 = var13;
                          } else {
                            var10 = -var13;
                          }
                        }
                      }
                    } else {
                      var10 = var11;
                    }
                  } else {
                    var10 = -var11;
                  }
                  if (!(0.0f < var10)) {
                    var8 = 0;
                    var7 = 0;
                    var6 = 0;
                  } else {
                    var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                    var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                    var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                  }
                  var27[var16][var9] = var6 << 24;
                  var28[var16][var9] = var7 << 24;
                  var29[var16][var9] = var8 << 24;
                }
                var9++;
              }
            }
            this.field_e = new na[3];
            this.field_e[0] = this.owner.a((byte) 37, var27, false, 64);
            this.field_e[1] = this.owner.a((byte) 112, var28, false, 64);
            this.field_e[2] = this.owner.a((byte) 64, var29, false, 64);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("em.<init>(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final void setParameters(byte param0, int param1, int param2) {
        if (this.field_g) {
          this.owner.e(1, false);
          this.owner.bindTexture(true, this.field_e[-1 + param1]);
          this.owner.e(0, false);
        }
        if (param0 != 55) {
          this.disable(-91);
        }
    }

    final void enable(int param0, boolean param1) {
        int var3;
        AffineTransform3D var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = -121 / ((param0 - 41) / 62);
        if (null != this.field_e &&
          param1) {
          this.owner.e(1, false);
          this.owner.applyTexCoordGeneration(IdolItemComponent.field_H, (byte) 0);
          var4 = this.owner.C(0);
          var4.setRotationX(-94, 1024);
          this.owner.a(cva.field_b, false);
          if (!this.field_d) {
            this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, PlatformComponent.field_F);
            this.owner.a(PlayerContextMenu.field_j, 0, -34);
            this.owner.e(2, false);
            this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, NormalMapOperator.field_m);
            this.owner.a(PlayerContextMenu.field_j, 0, -47);
            this.owner.a(PlayerContextMenu.field_j, 1, -6219, true, false);
            this.owner.a(0, false, OpenGlDisplayLists.field_c);
            this.owner.bindTexture(true, this.owner.field_Jb);
          } else {
            this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, NormalMapOperator.field_m);
            this.owner.a(ej.field_c, 0, -6219, true, false);
            this.owner.a(0, false, OpenGlDisplayLists.field_c);
          }
          this.owner.e(0, false);
          this.field_g = true;
        } else {
          this.owner.a(0, false, OpenGlDisplayLists.field_c);
        }
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 != 5744) {
          return;
        }
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, iw.field_c);
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          this.field_e = (na[]) null;
          return true;
        }
        return true;
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        this.owner.bindTexture(true, param1);
        if (param2 != 24595) {
          return;
        }
        try {
          this.owner.a((byte) 108, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "em.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = "Email (Login):";
    }
}
