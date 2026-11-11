/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXUnderwaterEffect extends ShaderEffect {
    private jagdx.IDirect3DVertexShader field_l;
    private jagdx.IDirect3DVertexShader field_o;
    private boolean field_n;
    private GpuTexture2D field_g;
    private jagdx.IDirect3DVertexShader field_j;
    private boolean field_e;
    private jagdx.IDirect3DVertexShader field_k;
    private jagdx.IDirect3DVertexShader field_m;
    private Direct3DToolkit field_i;
    private static float[] field_h;
    private static float[] field_f;
    private boolean field_d;

    final void setParameters(byte param0, int param1, int param2) {
        if (param0 != 55) {
          this.field_g = (GpuTexture2D) null;
        }
    }

    private final void e(int param0) {
        AffineTransform3D var4 = null;
        jagdx.IDirect3DDevice var3 = null;
        if (this.field_j != null &&
          this.field_d) {
          var4 = this.owner.c(true);
          AffineTransform3D var2 = var4;
          var3 = this.field_i.field_jd;
          var3.setVertexShaderConstantF(13, this.owner.field_sc * this.owner.field_fc, this.owner.field_fc * this.owner.field_yb, this.owner.field_fc * this.owner.field_Kb, 1.0f);
          var3.setVertexShaderConstantF(14, this.owner.field_sc * this.owner.field_j, this.owner.field_yb * this.owner.field_j, this.owner.field_j * this.owner.field_Kb, 1.0f);
          var3.setVertexShaderConstantF(16, this.owner.field_pc * this.owner.field_sc, this.owner.field_pc * this.owner.field_yb, this.owner.field_pc * this.owner.field_Kb, 1.0f);
          var4.transformDirection(field_h, this.owner.field_Gb[1], (byte) 76, this.owner.field_Gb[2], this.owner.field_Gb[0]);
          var3.SetVertexShaderConstantF(15, field_h, 1);
          var4.transformDirection(field_h, this.owner.field_M[1], (byte) 52, this.owner.field_M[2], this.owner.field_M[0]);
          var3.SetVertexShaderConstantF(17, field_h, 1);
        }
        if (param0 == 1) {
          return;
        }
        this.field_g = (GpuTexture2D) null;
    }

    final void enable(int param0, boolean param1) {
        this.field_d = param1 ? true : false;
        this.owner.e(1, false);
        int var3 = 101 / ((param0 - 41) / 62);
        this.owner.bindTexture(true, this.field_g);
        this.owner.setTextureCombineOperations(PlatformComponent.field_F, (byte) -110, r.field_m);
        this.owner.a(pea.field_c, 0, -55);
        this.owner.a(ej.field_c, 2, -6219, true, false);
        this.owner.a(0, false, PlayerContextMenu.field_j);
        this.owner.e(0, false);
        this.d(122);
    }

    final void refreshState(boolean param0, int param1) {
        if (param1 != 5744) {
          this.isSupported(32);
        }
    }

    final void bindTexture(int param0, GpuTexture param1, int param2) {
        if (param1 != null) {
          if (this.field_e) {
            this.owner.a(ej.field_c, 0, -90);
            this.owner.a(0, false, ej.field_c);
            this.field_e = false;
          }
          this.owner.bindTexture(true, param1);
          this.owner.a((byte) -124, param0);
          if (param2 != 24595) {
            this.refreshState(true, -82);
            return;
          }
          return;
        }
        if (!this.field_e) {
          this.owner.bindTexture(true, this.owner.field_Jb);
          this.owner.a((byte) -85, 1);
          this.owner.a(PlayerContextMenu.field_j, 0, -82);
          this.owner.a(0, false, PlayerContextMenu.field_j);
          this.field_e = true;
          if (param2 != 24595) {
            this.refreshState(true, -82);
            return;
          }
          return;
        }
        if (param2 == 24595) {
          return;
        }
        this.refreshState(true, -82);
    }

    final void c(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        jagdx.IDirect3DDevice var2Lifetime1;
        AffineTransform3D var3Lifetime1;
        if (param0) {
          if (this.field_j != null) {
            var2 = this.field_i.field_jd;
            var3 = this.owner.textureTransform((byte) 116);
            var2.SetVertexShaderConstantF(8, var3.writeFirstTwoRows(field_f, -118), 2);
          }
          return;
        }
        this.disable(-44);
        if (this.field_j != null) {
          var2Lifetime1 = this.field_i.field_jd;
          var3Lifetime1 = this.owner.textureTransform((byte) 116);
          var2Lifetime1.SetVertexShaderConstantF(8, var3Lifetime1.writeFirstTwoRows(field_f, -118), 2);
        }
    }

    final void b(int param0) {
        jagdx.IDirect3DDevice var2 = null;
        if (this.field_j != null) {
          var2 = this.field_i.field_jd;
          var2.setVertexShaderConstantF(4, this.owner.writeTransposedProjection(field_f, false));
        }
        if (param0 >= 64) {
          return;
        }
        this.refreshState(true, -11);
    }

    DirectXUnderwaterEffect(Direct3DToolkit param0, ResourceArchive param1) {
        super(param0);
        int stackIn_6_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_1 = 0;
        this.field_e = false;
        this.field_i = param0;
        if (param1 != null &&
          (this.field_i.field_ld.VertexShaderVersion & 65535) >= 257) {
          this.field_m = this.field_i.field_jd.createVertexShader(param1.getFileByName("dx", (byte) 125, "uw_ground_unlit"));
          this.field_o = this.field_i.field_jd.createVertexShader(param1.getFileByName("dx", (byte) 127, "uw_ground_lit"));
          this.field_l = this.field_i.field_jd.createVertexShader(param1.getFileByName("dx", (byte) 115, "uw_model_unlit"));
          this.field_k = this.field_i.field_jd.createVertexShader(param1.getFileByName("dx", (byte) 124, "uw_model_lit"));
          stackIn_6_0 = (this.field_o == null) ? 0 : 1;
          stackIn_9_1 = (null == this.field_m) ? 0 : 1;
          stackIn_11_0 = stackIn_6_0 & stackIn_9_1;
          stackIn_12_1 = (null == this.field_l) ? 0 : 1;
          stackIn_14_0 = stackIn_11_0 & stackIn_12_1;
          stackIn_15_1 = (this.field_k == null) ? 0 : 1;
          if ((stackIn_14_0 & stackIn_15_1) == 0) {
            this.field_n = false;
          } else {
            this.field_g = this.owner.a(true, 1, false, 2, new int[]{0, -1});
            this.field_g.setWrap((byte) -128, false, false);
            this.field_n = true;
          }
          return;
        }
        this.field_n = false;
    }

    final void disable(int param0) {
        this.owner.e(1, false);
        this.owner.bindTexture(true, (GpuTexture) null);
        this.owner.setTextureCombineOperations(iw.field_c, (byte) -110, iw.field_c);
        this.owner.a(ej.field_c, 0, -58);
        this.owner.a(pea.field_c, 2, -122);
        this.owner.a(0, false, ej.field_c);
        this.owner.e(0, false);
        if (this.field_e) {
          this.owner.a(ej.field_c, 0, -48);
          this.owner.a(0, false, ej.field_c);
          this.field_e = false;
        }
        if (param0 < -4) {
          if (null != this.field_j) {
            this.field_i.a((jagdx.IDirect3DVertexShader) null, -1);
            this.field_j = null;
          }
          return;
        }
        this.field_k = (jagdx.IDirect3DVertexShader) null;
        if (null != this.field_j) {
          this.field_i.a((jagdx.IDirect3DVertexShader) null, -1);
          this.field_j = null;
        }
    }

    final void b(byte param0) {
        jagdx.IDirect3DDevice var2 = null;
        AffineTransform3D var3 = null;
        if (this.field_j != null) {
          var2 = this.field_i.field_jd;
          var3 = this.field_i.n((byte) -101);
          var2.setVertexShaderConstantF(0, var3.writeRowMajor4x4(false, field_f));
        }
        if (param0 == 107) {
          return;
        }
        this.b(116);
    }

    final boolean isSupported(int param0) {
        if (param0 != 1185) {
          return true;
        }
        return this.field_n;
    }

    final void a(boolean param0) {
        jagdx.IDirect3DDevice var2 = null;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        if (!param0) {
          this.disable(-94);
        }
        if (null != this.field_j) {
          var2 = this.field_i.field_jd;
          var3 = this.owner.XA();
          var4 = this.owner.i();
          var5 = -((float)(-var4 + var3) * 0.125f) + (float)var3;
          var6 = -((float)(-var4 + var3) * 0.25f) + (float)var3;
          var2.setVertexShaderConstantF(10, var6, 1.0f / (-var6 + var5), var5, 1.0f / ((float)var3 - var5));
          var2.setVertexShaderConstantF(11, 1.0f / (float)this.owner.g(false), (float)this.owner.A(-2903) / 255.0f, this.owner.field_Hc, 1.0f / (-this.owner.field_B + this.owner.field_Hc));
          this.owner.g(3625, this.owner.t(65280));
        }
    }

    private final void d(int param0) {
        jagdx.IDirect3DDevice var6 = null;
        jagdx.IDirect3DVertexShader var2 = null;
        int var4 = 0;
        AffineTransform3D var5 = null;
        jagdx.IDirect3DVertexShader var2Lifetime1;
        AffineTransform3D var5Lifetime1;
        int var4Lifetime1;
        if (param0 < 83) {
          this.b(false);
          var6 = this.field_i.field_jd;
          var4 = this.owner.d(false);
          var5 = this.owner.E(8);
          if (!this.field_d) {
            var2 = var4 != 2147483647 ? this.field_l : this.field_m;
          } else {
            var2 = var4 == 2147483647 ? this.field_o : this.field_k;
          }
          if (var2 == this.field_j) {
            var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
            var6.setVertexShaderConstantF(12, field_h);
            return;
          }
          this.field_j = var2;
          this.field_i.a(var2, -1);
          this.e(1);
          this.b(125);
          this.c(true);
          this.b((byte) 107);
          this.b(true);
          this.a(true);
          var5.a(32560, 0.0f, 0.0f, field_h, (float)var4, -1.0f);
          var6.setVertexShaderConstantF(12, field_h);
          return;
        }
        jagdx.IDirect3DDevice var7 = this.field_i.field_jd;
        var4Lifetime1 = this.owner.d(false);
        var5Lifetime1 = this.owner.E(8);
        if (!this.field_d) {
          var2Lifetime1 = var4Lifetime1 != 2147483647 ? this.field_l : this.field_m;
        } else {
          var2Lifetime1 = var4Lifetime1 == 2147483647 ? this.field_o : this.field_k;
        }
        if (var2Lifetime1 == this.field_j) {
          var5Lifetime1.a(32560, 0.0f, 0.0f, field_h, (float)var4Lifetime1, -1.0f);
          var7.setVertexShaderConstantF(12, field_h);
          return;
        }
        this.field_j = var2Lifetime1;
        this.field_i.a(var2Lifetime1, -1);
        this.e(1);
        this.b(125);
        this.c(true);
        this.b((byte) 107);
        this.b(true);
        this.a(true);
        var5Lifetime1.a(32560, 0.0f, 0.0f, field_h, (float)var4Lifetime1, -1.0f);
        var7.setVertexShaderConstantF(12, field_h);
    }

    final void b(boolean param0) {
        jagdx.IDirect3DDevice stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        AffineTransform3D stackIn_5_2 = null;
        boolean stackIn_6_3;
        jagdx.IDirect3DDevice stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        AffineTransform3D stackIn_12_2 = null;
        boolean stackIn_13_3;
        jagdx.IDirect3DDevice var2;
        AffineTransform3D var3;
        if (param0) {
          if (null != this.field_j) {
            var2 = this.field_i.field_jd;
            var3 = this.field_i.n((byte) 10);
            stackIn_5_0 = var2;
            stackIn_5_1 = 0;
            stackIn_5_2 = var3;
            stackIn_6_3 = (param0) ? false : true;
            ((jagdx.IDirect3DDevice) (Object) stackIn_5_0).setVertexShaderConstantF(stackIn_5_1, ((AffineTransform3D) (Object) stackIn_5_2).writeRowMajor4x4(stackIn_6_3, field_f));
          }
        } else {
          this.c(false);
          if (null != this.field_j) {
            var2 = this.field_i.field_jd;
            var3 = this.field_i.n((byte) 10);
            stackIn_12_0 = var2;
            stackIn_12_1 = 0;
            stackIn_12_2 = var3;
            stackIn_13_3 = (param0) ? false : true;
            ((jagdx.IDirect3DDevice) (Object) stackIn_12_0).setVertexShaderConstantF(stackIn_12_1, ((AffineTransform3D) (Object) stackIn_12_2).writeRowMajor4x4(stackIn_13_3, field_f));
          }
        }
    }

    static {
        field_f = new float[16];
        field_h = new float[4];
    }
}
