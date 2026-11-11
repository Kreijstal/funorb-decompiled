/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoomLighting implements RenderListener {
    private SceneLight[] activeLights;
    static int field_d;
    private IntrusiveDeque lightSources;
    private Room room;

    public final void onClear(int param0) {
        if (param0 != 13113) {
          this.activeLights = (SceneLight[]) null;
        }
        this.lightSources.clear(8);
    }

    public final void beforeScene(Camera param0, int param1) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LightSource var12 = null;
        int var13 = 0;
        Camera var14 = null;
        int var10Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (DiskCacheWorker.a(param1 ^ -15574)) {
            var9 = 0;
            var7 = 0;
            var6 = 16777215;
            var8 = -10;
            var3_float = 0.0f;
            var4 = 0.15000000596046448f;
            var5 = 0.6499999761581421f;
          } else {
            var10 = this.room.getLightingPreset((byte) 119);
            if (var10 != 0 &&
              1 == var10) {
              var8 = -8;
              var9 = -32;
              var6 = 11180543;
              var3_float = 0.20000000298023224f;
              var5 = 0.4000000059604645f;
              var7 = 0;
              var4 = 0.03999999910593033f;
            } else {
              var9 = -24;
              var5 = 0.6499999761581421f;
              var6 = 16770747;
              var8 = -8;
              var7 = 0;
              var3_float = 0.10000000149011612f;
              var4 = 0.05000000074505806f;
            }
          }
          var10Lifetime1 = 0;
          var11 = 16384;
          tga.field_a.L(var10Lifetime1, var11, 0);
          tga.field_a.xa(var5);
          tga.field_a.ZA(var6, var3_float, var4, (float)var7, (float)var8, (float)var9);
          if (LightSource.a((byte) -7)) {
            var12 = (LightSource) (this.lightSources.first(-80));
            while (var12 != null) {
              if (!var12.c(param1 - 1459836712)) {
                var12.a((byte) 100, this.room.getSimulation(-1553494544).tick);
              } else {
                var12.unlink(57);
              }
              var12 = (LightSource) (this.lightSources.next(116));
            }
            tga.field_a.setLights(0, (SceneLight[]) null);
          }
          if (param1 != -15530) {
            var14 = (Camera) null;
            this.beforeRenderable(92, (Renderable) null, (Camera) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("sva.G(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void afterScene(int param0, Camera param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (LightSource.a((byte) -7)) {
            tga.field_a.setLights(0, (SceneLight[]) null);
          }
          if (param0 != -16188) {
            this.lightSources = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sva.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static Sprite[] a(int param0, int param1, int param2) {
        if (param2 != 4) {
          RoomLighting.a(17, 31, 46);
        }
        return vl.a((byte) 125, param0, param1, 1);
    }

    final void removeLightSource(byte param0, LightSource param1) {
        try {
          int var3_int = 86 % ((-52 - param0) / 48);
          param1.unlink(66);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void afterLayer(RenderLayer param0, int param1, Camera param2, boolean param3) {
        try {
          if (!param3) {
            RoomLighting.a(112, -118, 127);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void beforeLayer(int param0, RenderLayer param1, Camera param2, int param3) {
        try {
          if (param3 != 11180543) {
            field_d = -52;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void beforeRenderable(int param0, Renderable param1, Camera param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        LightSource var11 = null;
        int var12 = 0;
        Camera var13 = null;
        Object var10Lifetime1;
        LightSource var11Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 0) {
            var13 = (Camera) null;
            this.afterRenderable(true, (Renderable) null, (Camera) null);
          }
          if (LightSource.a((byte) -7)) {
            var4_int = param1 instanceof Particle ? 1 : 0;
            var5 = 0;
            var6 = MidiVoiceMixer.min(this.activeLights.length, tga.field_a.l(), -97);
            var7 = null;
            if (param1 instanceof SelectivelyLitRenderable) {
              var7 = (SelectivelyLitRenderable) (param1);
            }
            var9 = 0;
            var10 = null;
            if (var4_int == 0) {
              if (var7 != null &&
                ((SelectivelyLitRenderable) (var7)).isUnlit(true)) {
                tga.field_a.setLights(var5, this.activeLights);
                return;
              }
              var11 = (LightSource) (this.lightSources.first(-80));
              while (var11 != null) {
                if (var7 != null &&
                  ((SelectivelyLitRenderable) (var7)).ignoresLight(false, var11)) {
                  var8 = -1;
                } else {
                  var8 = var11.getInfluence(param1.getRenderZ((byte) -124), param1.getRenderX((byte) -101), param1.getRenderY((byte) 95), -43);
                }
                var11.a(var8, 92);
                var11 = (LightSource) (this.lightSources.next(119));
              }
              while (var5 < var6) {
                var10Lifetime1 = null;
                var9Lifetime1 = 0;
                var11Lifetime1 = (LightSource) (this.lightSources.first(-80));
                while (var11Lifetime1 != null) {
                  var8Lifetime1 = var11Lifetime1.b(121);
                  if (0 < var8Lifetime1 &&
                    var8Lifetime1 > var9Lifetime1) {
                    var10Lifetime1 = var11Lifetime1;
                    var9Lifetime1 = var8Lifetime1;
                  }
                  var11Lifetime1 = (LightSource) (this.lightSources.next(115));
                }
                if (var10Lifetime1 == null) {
                  break;
                }
                ((LightSource) (var10Lifetime1)).a(-1, 81);
                this.activeLights[var5] = ((LightSource) (var10Lifetime1)).getAnimatedLight(47).light;
                var5++;
              }
            }
            tga.field_a.setLights(var5, this.activeLights);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("sva.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public final void afterRenderable(boolean param0, Renderable param1, Camera param2) {
        try {
          if (param0) {
            Camera var5 = (Camera) null;
            this.afterScene(3, (Camera) null);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    RoomLighting(Room param0) {
        this.activeLights = new SceneLight[4];
        this.lightSources = new IntrusiveDeque();
        try {
          this.room = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void addLightSource(byte param0, LightSource param1) {
        if (param0 != 45) {
          return;
        }
        try {
          this.lightSources.addLast((byte) -61, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sva.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
