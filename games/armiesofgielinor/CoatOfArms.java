/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CoatOfArms {
    static boolean field_e;
    int[] colourIndices;
    static byte[] field_d;
    static String field_c;
    int[] parts;

    final int getMissingPartOffset(byte obfuscationGuard) {
        if (this.parts[4] == -1) {
          return -20;
        }
        int var2 = -4 % ((47 - obfuscationGuard) / 62);
        return 0;
    }

    final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.getMissingPartOffset((byte) 83);
          }
          stackIn_3_0 = cc.a(param5, param3, this.parts, param6, -1, true, param2, param4, this.colourIndices, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("ln.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 == 21930) {
          return MatchConditionRegistry.a(param0 - param3, param4 - param2, this.parts, false);
        }
        this.setPart(42, -104, -118);
        return MatchConditionRegistry.a(param0 - param3, param4 - param2, this.parts, false);
    }

    final String toQueryString(byte obfuscationGuard) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        String var2 = "coat=";
        int var3 = -16 % ((obfuscationGuard + 23) / 40);
        for (var4 = 0; this.parts.length > var4; var4++) {
          var2 = var2 + this.parts[var4] + ":" + this.colourIndices[var4] + ":";
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          return;
        }
        field_d = null;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3) {
        AnimationSequence[] array$0 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        String var6 = null;
        int var6_int = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        String var5Lifetime1;
        int var4_intLifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ck.animationSequencesByGroup = new AnimationSequence[or.field_f.length][];
          for (var4_int = param3; or.field_f.length > var4_int; var4_int++) {
            var10 = or.field_f[var4_int];
            var5 = var10;
            var6_int = jq.field_I[var4_int].length;
            array$0 = new AnimationSequence[var6_int];
            ck.animationSequencesByGroup[var4_int] = array$0;
            for (var7 = 0; var6_int > var7; var7++) {
              var8 = jq.field_I[var4_int][var7];
              ck.animationSequencesByGroup[var4_int][var7] = new AnimationSequence(param0, var10, var8);
            }
          }
          if (!ta.field_L) {
            var12 = 0;
            var4_intLifetime1 = var12;
            while (var12 < 6) {
              var11 = ArmiesOfGielinor.field_N[var12];
              var5Lifetime1 = var11;
              if (var5Lifetime1 == null) {
                pv.field_a[var12] = new AnimationSequence[]{};
              } else {
                pv.field_a[var12] = new AnimationSequence[1];
                var6 = CipherPacketBuffer.field_u[var12];
                pv.field_a[var12][0] = new AnimationSequence(param0, var11, var6);
              }
              var12++;
            }
          }
          nl.a(param1, ck.animationSequencesByGroup, param2, (byte) 126);
          nl.a(param1, pv.field_a, param2, (byte) 126);
          MovementPresentation.c(param3 ^ -11757);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ln.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setPart(int obfuscationGuard, int partId, int layer) {
        if (obfuscationGuard < 52) {
          return;
        }
        this.parts[layer] = partId;
    }

    final RgbSprite a(String param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        nj stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          no.field_P.pixelHeight = SoftwareRaster.height;
          if (param1 != -70) {
            var5 = (String) null;
            this.a(false, true, (byte) -47, true, false, true, -69, (String) null, 102);
          }
          no.field_P.pixels = SoftwareRaster.pixels;
          no.field_P.pixelWidth = SoftwareRaster.width;
          ku.field_J.b();
          SoftwareRaster.b();
          if (!param2) {
            var4_int = this.parts[3];
            this.parts[3] = -1;
            cc.a(0, -1, this.parts, -1, -1, false, -1, param0, this.colourIndices, 0);
            this.parts[3] = var4_int;
          }
          MatchSetupPanel.a(-1, -1, this.parts, -1, false, this.colourIndices, -1, false, 0, false, 0, param0);
          no.field_P.b();
          stackIn_5_0 = ArchiveProvider.a((byte) 107, ku.field_J);
          return (RgbSprite) ((Object) stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ln.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, String param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var11 = null;
        int var11_int = 0;
        RuntimeException var11_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          no.field_P.pixelHeight = SoftwareRaster.height;
          no.field_P.pixels = SoftwareRaster.pixels;
          no.field_P.pixelWidth = SoftwareRaster.width;
          if (param8) {
            if (null == dv.field_k ||
              param1 != t.field_f) {
              dv.field_k = RegionAnchor.field_m[0].g();
              var21 = dv.field_k.pixels;
              var20 = var21;
              var19 = var20;
              var11 = var19;
              for (var12 = 0; var21.length > var12; var12++) {
                var13 = 255 & var21[var12];
                var14 = (param1 >> 16 & 255) * var13 >> 8;
                var15 = var13 * ((65280 & param1) >> 8) >> 8;
                var16 = (255 & param1) * var13 >> 8;
                var11[var12] = (var15 << 8) + ((var14 << 16) + var16);
              }
            }
            dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
          }
          ku.field_J.b();
          SoftwareRaster.b();
          if (param6) {
            cc.a(0, -1, this.parts, -1, -1, false, -1, param5, this.colourIndices, 0);
          } else {
            var11_int = this.parts[3];
            this.parts[3] = -1;
            cc.a(0, -1, this.parts, -1, -1, false, -1, param5, this.colourIndices, 0);
            this.parts[3] = var11_int;
          }
          if (!param7) {
            if (!param0) {
              if (param3) {
                RegionAnchor.field_m[3].g(0, 0);
              }
            } else {
              fe.a(RegionAnchor.field_m[2], 0, 0);
              RegionAnchor.field_m[2].f(0, 0, 228);
            }
          } else {
            RegionAnchor.field_m[1].g(0, 0);
          }
          no.field_P.b();
          ku.field_J.e(param4, param2);
          if (param9 == -19744) {
            return;
          }
          var18 = (String) null;
          this.a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          stackIn_25_0 = var11_ref;
          stackIn_25_1 = new StringBuilder().append("ln.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4, boolean param5, int param6, String param7, int param8) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          no.field_P.pixelHeight = SoftwareRaster.height;
          no.field_P.pixels = SoftwareRaster.pixels;
          no.field_P.pixelWidth = SoftwareRaster.width;
          ku.field_J.b();
          SoftwareRaster.b();
          if (!param3) {
            var10_int = this.parts[3];
            this.parts[3] = -1;
            cc.a(0, -1, this.parts, -1, -1, false, -1, param7, this.colourIndices, 0);
            this.parts[3] = var10_int;
          } else {
            cc.a(0, -1, this.parts, -1, -1, false, -1, param7, this.colourIndices, 0);
          }
          if (param0) {
            RegionAnchor.field_m[1].g(0, 0);
          } else {
            if (!param5) {
              if (param4) {
                RegionAnchor.field_m[3].g(0, 0);
              }
            } else {
              fe.a(RegionAnchor.field_m[2], 0, 0);
              RegionAnchor.field_m[2].f(0, 0, 228);
            }
          }
          if (param2 != 68) {
            field_d = (byte[]) null;
          }
          ko.field_g.b();
          SoftwareRaster.b();
          ku.field_J.e(0, 0);
          no.field_P.b();
          ko.field_g.h(param8, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_16_0 = var10;
          stackIn_16_1 = new StringBuilder().append("ln.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param8).append(')').toString());
        }
    }

    final void setColour(int layer, int colourIndex, byte obfuscationGuard) {
        this.colourIndices[layer] = colourIndex;
        if (obfuscationGuard > -93) {
          this.colourIndices = (int[]) null;
        }
    }

    final void a(int param0, String param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, int param7) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param7 <= 16) {
            field_d = (byte[]) null;
          }
          no.field_P.pixelWidth = SoftwareRaster.width;
          no.field_P.pixels = SoftwareRaster.pixels;
          no.field_P.pixelHeight = SoftwareRaster.height;
          if (param6) {
            RegionAnchor.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
          }
          ku.field_J.b();
          SoftwareRaster.b();
          cc.a(0, -1, this.parts, -1, -1, false, -1, param1, this.colourIndices, 0);
          if (!param3) {
            if (!param2) {
              if (param5) {
                RegionAnchor.field_m[3].g(0, 0);
              }
            } else {
              fe.a(RegionAnchor.field_m[2], 0, 0);
              RegionAnchor.field_m[2].f(0, 0, 228);
            }
          } else {
            RegionAnchor.field_m[1].g(0, 0);
          }
          no.field_P.b();
          ku.field_J.h(param0, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_16_0 = var9;
          stackIn_16_1 = new StringBuilder().append("ln.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    CoatOfArms(int[] parts, int[] colourIndices) {
        try {
          this.parts = parts;
          this.colourIndices = colourIndices;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ln.<init>(" + (parts != null ? "{...}" : "null") + ',' + (colourIndices != null ? "{...}" : "null") + ')');
        }
    }

    CoatOfArms() {
        this.parts = new int[6];
        this.colourIndices = new int[6];
        this.parts[0] = 0;
        this.parts[3] = 0;
        this.parts[2] = -1;
        this.parts[4] = -1;
        this.parts[1] = -1;
        this.parts[5] = 0;
        this.colourIndices[3] = 0;
        this.colourIndices[5] = 0;
        this.colourIndices[2] = 0;
        this.colourIndices[1] = 0;
        this.colourIndices[4] = 0;
        this.colourIndices[0] = 0;
    }

    static {
        field_e = false;
        field_c = "<%0> of <%1> strength";
    }
}
