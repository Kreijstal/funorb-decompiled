/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LightSource extends IntrusiveNode {
    private int z;
    static UiComponent field_h;
    private int x;
    private int field_l;
    static it field_k;
    private int field_p;
    private AnimatedLight animatedLight;
    private int y;
    private int field_n;
    private boolean field_r;
    private boolean disabled;
    static String field_i;
    private int[] field_m;

    public static void releaseStatics(int param0) {
        field_h = null;
        field_k = null;
        field_i = null;
        if (param0 != 0) {
          field_h = (UiComponent) null;
        }
    }

    final void a(int param0, int param1) {
        int var3 = -39 % ((-18 - param1) / 50);
        this.field_l = param0;
    }

    final int getInfluence(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        if (this.isDisabled(1)) {
          return -1;
        }
        if (this.field_p == 0) {
          return -1;
        }
        if (this.animatedLight == null) {
          return -1;
        }
        if (null == this.animatedLight.light) {
          return -1;
        }
        if (0.05000000074505806f >= this.animatedLight.light.getIntensity(0)) {
          return -1;
        }
        if (this.animatedLight.light.getColour(-122) == 0) {
          return -1;
        }
        var5 = -this.x + param1 >> 16;
        var6 = -this.y + param2 >> 16;
        var7 = -this.z + param0 >> 16;
        if (param3 <= -33) {
          return -(var7 * var7 + var5 * var5 + var6 * var6 >> 2) + this.field_p;
        }
        field_k = (it) null;
        return -(var7 * var7 + var5 * var5 + var6 * var6 >> 2) + this.field_p;
    }

    final AnimatedLight getAnimatedLight(int param0) {
        if (param0 <= 4) {
          this.getInfluence(-31, -23, 62, -98);
          return this.animatedLight;
        }
        return this.animatedLight;
    }

    final static mu a(String param0, int param1) {
        String var2 = null;
        mu var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        mu stackIn_14_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (CoinItemComponent.field_G == null) {
            return null;
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = jd.normalizeDisplayName(1, var7);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (mu) (CoinItemComponent.field_G.get(-114, (long)var2.hashCode()));
          var4 = -95 / ((param1 + 46) / 54);
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_tb);
            var5 = jd.normalizeDisplayName(1, var8);
            if (var5 == null) {
              var5 = var3.field_tb;
            }
            if (var5.equals(var2)) {
              stackIn_14_0 = var3;
              return stackIn_14_0;
            }
            var3 = (mu) (CoinItemComponent.field_G.nextWithSameKey((byte) 99));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("uh.N(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setColour(int param0, int param1) {
        if (this.animatedLight == null) {
          return;
        }
        if (null == this.animatedLight.light) {
          return;
        }
        if (param0 == -10874) {
          this.animatedLight.light.setColour(255, param1);
          return;
        }
        field_k = (it) null;
        this.animatedLight.light.setColour(255, param1);
    }

    final static boolean a(byte param0) {
        lqa var1 = LegacyOpenGlBloomEffect.b(false);
        if (var1 == null) {
          return false;
        }
        if (param0 != -7) {
          LightSource.a((byte) -8);
          if (ConstrainToLatticeLocomotor.field_s) {
            return false;
          }
          if (var1.field_i) {
            return true;
          }
          return false;
        }
        if (ConstrainToLatticeLocomotor.field_s) {
          return false;
        }
        if (var1.field_i) {
          return true;
        }
        return false;
    }

    final boolean isRemoved(int param0) {
        if (param0 != -1459852242) {
          this.getAnimatedLight(-60);
          return this.field_r;
        }
        return this.field_r;
    }

    final void updateLightPosition(byte param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (this.animatedLight == null ||
          this.animatedLight.light == null) {
          return;
        }
        this.field_m[0] = this.x >> 14;
        this.field_m[1] = -this.z >> 14;
        this.field_m[2] = -this.y >> 14;
        this.animatedLight.light.setPosition(this.field_m[1], this.field_m[0], (byte) -127, this.field_m[2]);
        if (param0 >= 21) {
          var3 = this.animatedLight.light.getRadius((byte) 107);
          this.field_p = var3 * (var3 * 2);
          this.animatedLight.a(false, param1 + this.field_n, -1814184927);
          return;
        }
        LightSource.a((byte) 98);
        var3Lifetime1 = this.animatedLight.light.getRadius((byte) 107);
        this.field_p = var3Lifetime1 * (var3Lifetime1 * 2);
        this.animatedLight.a(false, param1 + this.field_n, -1814184927);
    }

    final void setRadius(int param0, int param1) {
        int var3 = 12 / ((40 - param1) / 59);
        if (this.animatedLight == null) {
          return;
        }
        if (null != this.animatedLight.light) {
          this.animatedLight.light.setRadius((byte) 62, param0);
          return;
        }
    }

    final int b(int param0) {
        if (param0 < 104) {
          this.x = -79;
          return this.field_l;
        }
        return this.field_l;
    }

    final void setDisabled(boolean param0, int param1) {
        if (param1 == 1011094480) {
          this.disabled = param0 ? true : false;
          return;
        }
        field_k = (it) null;
        this.disabled = param0 ? true : false;
    }

    final boolean isDisabled(int param0) {
        if (param0 != 1) {
          this.field_n = 64;
          return this.disabled;
        }
        return this.disabled;
    }

    final void markRemoved(int param0) {
        this.field_r = true;
        if (param0 != 2) {
          this.animatedLight = (AnimatedLight) null;
        }
    }

    final void setPosition(int param0, byte param1, int param2, int param3) {
        if (param1 > 82) {
          this.z = param0;
          this.x = param3;
          this.y = param2;
          return;
        }
        this.animatedLight = (AnimatedLight) null;
        this.z = param0;
        this.x = param3;
        this.y = param2;
    }

    final void b(int param0, int param1) {
        if (param1 != 0) {
          this.setColour(-107, 111);
          this.field_n = param0;
          return;
        }
        this.field_n = param0;
    }

    LightSource(AnimatedLight param0) {
        this.field_r = false;
        this.field_m = new int[3];
        this.disabled = false;
        try {
          this.animatedLight = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "uh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Invite <%0> to this game";
        field_k = new it();
    }
}
