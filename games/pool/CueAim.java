/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CueAim {
    static CollisionContact[] field_g;
    int polarAngle;
    static int field_m;
    static int field_b;
    int field_n;
    int field_d;
    static int field_j;
    int field_e;
    int azimuth;
    static String pottingTheRestOfYourGroup;
    static String[] field_i;
    static UiComponent field_a;
    static volatile int field_c;
    static int field_f;

    public static void releaseStatics(int param0) {
        pottingTheRestOfYourGroup = null;
        field_a = null;
        field_g = null;
        field_i = null;
        if (param0 != -9379) {
          field_j = -47;
        }
    }

    final CueAim copy(int param0) {
        if (param0 != -14513) {
          return (CueAim) null;
        }
        return new CueAim(this.field_n, this.azimuth, this.polarAngle, this.field_d, this.field_e);
    }

    final void aimAt(Camera param0, Ball param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var4_int = param1.positionX >> 13;
          var5 = param1.positionY >> 13;
          var6 = (int)(8.0 * param0.eyeY + 0.5);
          var7 = (int)(0.5 + param0.eyeX * 8.0);
          this.azimuth = ResizableDialog.c(-var4_int + var7, var6 - var5, 4096) >> 2;
          int var8 = -57 % ((param2 - 66) / 54);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kj.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        this.field_n = -1;
        if (param0 < 61) {
          CueAim.a((byte) 30);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
          Ball var3 = (Ball) null;
          this.aimAt((Camera) null, (Ball) null, (byte) 16);
        }
        return 0 <= this.field_n ? true : false;
    }

    final void writeTo(PacketBuffer param0, byte param1) {
        if (param1 < 67) {
          return;
        }
        try {
          param0.writeShort((byte) -81, this.field_n);
          param0.writeShort((byte) -81, this.azimuth & 2047);
          param0.writeShort((byte) -81, this.polarAngle);
          param0.writeByte(this.field_d, false);
          param0.writeByte(this.field_e, false);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, TriangleMesh param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        LogoMaterial stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
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
        LogoMaterial var21 = null;
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
        int[] var40 = null;
        int var43 = 0;
        TriangleMesh var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        try {
          var44 = param2;
          if (var44.field_K != null &&
            var44.field_I > 1) {
            var60 = var44.field_K;
            IntrusiveDeque.a(ProgressDialog.field_ib, 0, var60, 0, -147296924);
          } else {
            FixedAngleSupport.compactFaceBuckets(-94);
          }
          var54 = new int[param2.field_o];
          var49 = var54;
          var40 = var49;
          var8 = var40;
          var64 = new int[param2.field_o];
          var61 = HighScoreSubmission.field_r;
          var62 = ProgressDialog.field_mb;
          var63 = PoolGameModel.field_g;
          for (var13 = 0; param2.field_o > var13; var13++) {
            var14 = var61[var13] * param7 + (param3 * var62[var13] + param5 * var63[var13]) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_14_0 = 256;
              } else {
                stackIn_14_0 = var14 + 128;
              }
            } else {
              stackIn_14_0 = 128;
            }
            var14Lifetime2 = stackIn_14_0;
            var15 = param4 * var62[var13] + param6 * var61[var13] + var63[var13] * param0 >> 8;
            stackIn_16_0 = InputIdleSupport.field_d;
            if (var15 >= 0) {
              stackIn_17_1 = var15;
            } else {
              stackIn_17_1 = -var15;
            }
            var15Lifetime2 = stackIn_16_0[stackIn_17_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          if (param1 != 8355711) {
            field_f = -76;
          }
          var43 = 0;
          var13Lifetime1 = var43;
          while (var43 < HighScoreRequest.field_x) {
            var14Lifetime1 = RankingsScreen.field_I[var43];
            var15Lifetime1 = param2.field_y[var14Lifetime1];
            var16 = param2.field_r[var14Lifetime1];
            var17 = param2.field_u[var14Lifetime1];
            if (param2.field_x[var14Lifetime1] >= HighScoreSubmission.field_r.length) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param2.field_x[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (HighScoreSubmission.field_r.length > param2.field_w[var14Lifetime1]) {
              stackIn_28_0 = param2.field_w[var14Lifetime1];
            } else {
              stackIn_28_0 = -1;
            }
            var19 = stackIn_28_0;
            if (param2.field_O[var14Lifetime1] < HighScoreSubmission.field_r.length) {
              stackIn_31_0 = param2.field_O[var14Lifetime1];
            } else {
              stackIn_31_0 = -1;
            }
            var20 = stackIn_31_0;
            if (null != SoundCache.field_a &&
              null != param2.field_H &&
              param2.field_H.length > var14Lifetime1 &&
              param2.field_H[var14Lifetime1] != -1 &&
              param2.field_H[var14Lifetime1] < SoundCache.field_a.length) {
              stackIn_38_0 = SoundCache.field_a[param2.field_H[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = WidgetContainer.field_M[var15Lifetime1];
            var23 = IsaacCipher.field_h[var15Lifetime1];
            var24 = WidgetContainer.field_M[var16];
            var25 = IsaacCipher.field_h[var16];
            var26 = WidgetContainer.field_M[var17];
            var27 = IsaacCipher.field_h[var17];
            if (var19 == var18 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_43_0 = 8355711;
              } else {
                stackIn_43_0 = var21.field_a;
              }
              var30 = stackIn_43_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (-16711742 & var31 * var28) >>> 8 | 922812160 & var32 * var28 >>> 8;
              var33 = var33 + 65793 * var29;
              TextureCache.drawFlatTriangle(var24, var27, var23, var25, var26, var33 >> 1 & 8355711, 108, var22);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_47_0 = var21.field_a;
              } else {
                stackIn_47_0 = 8355711;
              }
              var34 = stackIn_47_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = 2130771712 & var36 * var28 >>> 8 | (var35 * var28 & -16711742) >>> 8;
              var38 = (var36 * var29 & 16711777) >>> 8 | -83951361 & var29 * var35 >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = (16711913 & var36 * var30) >>> 8 | -755040001 & var30 * var35 >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = var39 + 65793 * var33;
              GradientPaletteSupport.a((byte) -125, var27, var22, 255 & var37, var39 >> 16, var38 >> 8 & 255, var23, var38 >> 16, (var39 & 65528) >> 8, var37 >> 8 & 255, var38 & 255, var24, var37 >> 16, var25, var26, 255 & var39);
            }
            var43++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_52_0 = var8_ref;
          stackIn_52_1 = new StringBuilder().append("kj.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(byte param0) {
        PasswordValidator.a(-124, AlternateLongAndTextLoginPayload.field_n, AlignedIconLabel.field_Lb, DiskArchiveRequest.field_J, AccountStateQuery.field_m);
        if (param0 > -97) {
          TriangleMesh var2 = (TriangleMesh) null;
          CueAim.a(-66, 60, (TriangleMesh) null, -82, -71, 60, 97, 51);
        }
    }

    final void easeToward(int param0, CueAim param1) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var3_intLifetime4;
        var4 = Pool.field_O;
        try {
          if (this.field_n != param1.field_n) {
            var3_int = param1.field_n - this.field_n;
            if (8 > var3_int &&
              var3_int > -8) {
              this.field_n = param1.field_n;
            } else {
              this.field_n = this.field_n + var3_int / 8;
            }
          }
          if (param0 != 255) {
            return;
          }
          if (this.azimuth != param1.azimuth) {
            var3_intLifetime1 = -this.azimuth + param1.azimuth;
            if (var3_intLifetime1 > 1024) {
              var3_intLifetime1 -= 2048;
            }
            if (var3_intLifetime1 < -1024) {
              var3_intLifetime1 += 2048;
            }
            if (var3_intLifetime1 < 8 &&
              var3_intLifetime1 > -8) {
              this.azimuth = param1.azimuth;
            } else {
              this.azimuth = this.azimuth + var3_intLifetime1 / 8;
            }
            this.azimuth = this.azimuth & 2047;
          }
          if (this.polarAngle != param1.polarAngle) {
            var3_intLifetime2 = param1.polarAngle - this.polarAngle;
            if (var3_intLifetime2 < 8 &&
              var3_intLifetime2 > -8) {
              this.polarAngle = param1.polarAngle;
            } else {
              this.polarAngle = this.polarAngle + var3_intLifetime2 / 8;
            }
          }
          if (this.field_d != param1.field_d) {
            var3_intLifetime3 = -this.field_d + param1.field_d;
            if (8 > var3_intLifetime3 &&
              var3_intLifetime3 > -8) {
              this.field_d = param1.field_d;
            } else {
              this.field_d = this.field_d + var3_intLifetime3 / 8;
            }
          }
          if (this.field_e != param1.field_e) {
            var3_intLifetime4 = param1.field_e - this.field_e;
            if (var3_intLifetime4 < 8 &&
              -8 < var3_intLifetime4) {
              this.field_e = param1.field_e;
              return;
            }
            this.field_e = this.field_e + var3_intLifetime4 / 8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("kj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    final static void a(int param0, Sprite param1) {
        try {
          RasterStateSupport.pushRasterSnapshot((byte) 90);
          SoftwareRasterizer.setTarget(param1.field_D, param1.field_w, param1.field_y);
          if (param0 < 38) {
            Sprite var3 = (Sprite) null;
            CueAim.a(30, (Sprite) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kj.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean equalsAim(int param0, CueAim param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2043) {
            field_j = -19;
          }
          stackIn_9_0 = (param1.field_n == this.field_n) && (param1.azimuth == this.azimuth) && (param1.polarAngle == this.polarAngle) && (this.field_d == param1.field_d) && (param1.field_e == this.field_e);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("kj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void readFrom(int param0, PacketBuffer param1) {
        this.field_n = param1.readUnsignedShort(-1034);
        this.azimuth = param1.readUnsignedShort(-1034);
        this.polarAngle = param1.readUnsignedShort(param0 ^ -64266);
        if (param0 != 65280) {
          return;
        }
        try {
          this.field_d = param1.readByte((byte) 105);
          this.field_e = param1.readByte((byte) 105);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void copyFrom(int param0, CueAim param1) {
        try {
          this.azimuth = param1.azimuth;
          this.field_d = param1.field_d;
          this.field_n = param1.field_n;
          this.polarAngle = param1.polarAngle;
          if (param0 < 21) {
            TriangleMesh var4 = (TriangleMesh) null;
            CueAim.a(63, -58, (TriangleMesh) null, 93, 55, 29, 35, -81);
          }
          this.field_e = param1.field_e;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CueAim() {
        this.field_d = 0;
        this.polarAngle = 576;
        this.field_e = 0;
        this.azimuth = 0;
        this.field_n = 2048;
    }

    private CueAim(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param0;
        this.field_d = param3;
        this.polarAngle = param2;
        this.azimuth = param1;
        this.field_e = param4;
    }

    static {
        int var0 = 0;
        field_g = new CollisionContact[512];
        pottingTheRestOfYourGroup = "Potting the rest of your group for you.";
        field_i = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        for (var0 = 0; field_g.length > var0; var0++) {
          field_g[var0] = new CollisionContact();
        }
        field_c = 0;
        field_f = 479232;
    }
}
