/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends UiComponent {
    UiComponent field_Rb;
    static int field_Pb;
    UiComponent field_Qb;
    fj field_Ub;
    static int field_Sb;
    static int field_Tb;

    final void a(boolean param0, int param1, boolean param2, int param3) {
        boolean discarded$0 = false;
        this.a(param3, 0, this.field_Qb.height, param1, param2);
        if (!param0) {
          discarded$0 = this.a(85, true, 28, 9, 42, false, -118);
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == gd.field_b) {
            return false;
          }
          var2_int = -66 / ((30 - param1) / 42);
          stackIn_6_0 = !(param0.toLowerCase().indexOf(gd.field_b.toLowerCase()) < 0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("mm.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6) {
        this.localY = param4;
        if (param1 < -108) {
          this.height = param6;
          this.width = param2;
          this.localX = param3;
          this.b((byte) -45, param5, param0);
          return;
        }
    }

    mm(long param0, UiComponent param1, UiComponent param2, fj param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_Qb = new UiComponent(0L, param2);
          this.field_Ub = new fj(0L, param3);
          this.addChild(this.field_Qb, 0);
          this.addChild(this.field_Ub, 0);
          this.field_Rb = param1;
          this.field_Qb.addChild(param1, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mm.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_Ub.h(param1 ^ param1)) {
          this.field_Rb.remainingY = this.field_Rb.remainingY + param3;
        }
        if (this.field_Ub.i(2)) {
          this.field_Rb.remainingY = this.field_Rb.remainingY - param3;
        }
        if (this.field_Ub.j(param1 ^ 2)) {
          this.field_Rb.remainingY = this.field_Rb.remainingY + param2;
        }
        if (this.field_Ub.d((byte) -79)) {
          this.field_Rb.remainingY = this.field_Rb.remainingY - param2;
        }
        if (this.activeInside) {
          this.field_Rb.remainingY = this.field_Rb.remainingY - param0;
        }
        if (!param4) {
          if (!(-(this.field_Rb.remainingY + this.field_Rb.localY) <= -this.field_Qb.height + this.field_Rb.remainingHeight + this.field_Rb.height)) {
            this.field_Rb.remainingY = -this.field_Rb.localY - (this.field_Rb.remainingHeight + this.field_Rb.height - this.field_Qb.height);
          }
          if (0 <= -(this.field_Rb.localY + this.field_Rb.remainingY)) {
            if (this.field_Ub.f((byte) 57)) {
              this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
              this.field_Rb.remainingY = 0;
              this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
              return;
            }
            this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
            return;
          }
          this.field_Rb.remainingY = -this.field_Rb.localY;
          if (this.field_Ub.f((byte) 57)) {
            this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
            this.field_Rb.remainingY = 0;
            this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
            return;
          }
          this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
          return;
        }
        if (-(this.field_Rb.remainingY + this.field_Rb.localY) < 0) {
          this.field_Rb.remainingY = -this.field_Rb.localY;
          if (-(this.field_Rb.remainingY + this.field_Rb.localY) > this.field_Rb.height + this.field_Rb.remainingHeight - this.field_Qb.height) {
            this.field_Rb.remainingY = -this.field_Rb.localY - (-this.field_Qb.height + (this.field_Rb.height + this.field_Rb.remainingHeight));
            if (this.field_Ub.f((byte) 57)) {
              this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
              this.field_Rb.remainingY = 0;
            }
            this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
            return;
          }
          if (!this.field_Ub.f((byte) 57)) {
            this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
            return;
          }
          this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
          this.field_Rb.remainingY = 0;
          this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
          return;
        }
        if (-(this.field_Rb.remainingY + this.field_Rb.localY) > this.field_Rb.height + this.field_Rb.remainingHeight - this.field_Qb.height) {
          this.field_Rb.remainingY = -this.field_Rb.localY - (-this.field_Qb.height + (this.field_Rb.height + this.field_Rb.remainingHeight));
          if (!this.field_Ub.f((byte) 57)) {
            this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
            return;
          }
          this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
          this.field_Rb.remainingY = 0;
          this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
          return;
        }
        if (!this.field_Ub.f((byte) 57)) {
          this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
          return;
        }
        this.field_Rb.localY = -this.field_Ub.a(this.field_Rb.height, this.field_Qb.height, (byte) 106, param4);
        this.field_Rb.remainingY = 0;
        this.field_Ub.a(-76, this.field_Rb.height, -this.field_Rb.localY, this.field_Qb.height);
    }

    private final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        if (param1) {
          var8 = 1;
          this.field_Rb.layoutVerticalContent(this.field_Qb.height, param0, -2147483648, var8 != 0);
          this.a(param2, param6, param4, param3, false);
          return var8 != 0;
        }
        if (!this.activeInside) {
          var8Lifetime1 = 0;
          this.field_Rb.layoutVerticalContent(this.field_Qb.height, param0, -2147483648, var8Lifetime1 != 0);
          this.a(param2, param6, param4, param3, false);
          return var8Lifetime1 != 0;
        }
        if (!param5) {
          var8Lifetime2 = 1;
          this.field_Rb.layoutVerticalContent(this.field_Qb.height, param0, -2147483648, var8Lifetime2 != 0);
          this.a(param2, param6, param4, param3, false);
          return var8Lifetime2 != 0;
        }
        var8Lifetime3 = 0;
        this.field_Rb.layoutVerticalContent(this.field_Qb.height, param0, -2147483648, var8Lifetime3 != 0);
        this.a(param2, param6, param4, param3, false);
        return var8Lifetime3 != 0;
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_Rb.localX = 0;
        this.field_Qb.height = this.height;
        this.field_Qb.width = -param2 + this.width - param1;
        if (param0 == -45) {
          this.field_Rb.width = -param1 + (this.width - param2);
          this.field_Ub.a(-param1 + this.width, this.field_Qb.height, this.height, (byte) -110, param1, -this.field_Rb.localY, this.field_Rb.height, 0);
          return;
        }
        this.a(-40, (byte) -114, -15, 122, 34, 27, 42);
        this.field_Rb.width = -param1 + (this.width - param2);
        this.field_Ub.a(-param1 + this.width, this.field_Qb.height, this.height, (byte) -110, param1, -this.field_Rb.localY, this.field_Rb.height, 0);
    }

    final static void h(int param0) {
        SoundPlayback var1 = null;
        int var2 = 0;
        String var3 = null;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        SoundPlayback var1Lifetime1;
        var2 = BrickABrac.field_J ? 1 : 0;
        try {
          DirectByteStorage.field_f.c();
          if (param0 != -29448) {
            var3 = (String) null;
            mm.a((String) null, (byte) 116);
          }
          UnderwaterBackground.field_w.c();
          bm.field_c = bm.field_c - 1;
          if (bm.field_c == 0) {
            bm.field_c = 200;
            var1 = (SoundPlayback) (wd.soundPlaybacks.first(-110));
            while (var1 != null) {
              if (!var1.sourceNode.isLinked(0)) {
                var1.unlink((byte) 111);
              }
              var1 = (SoundPlayback) (wd.soundPlaybacks.next((byte) 116));
            }
            if (jc.field_M != null) {
              var1Lifetime1 = (SoundPlayback) (jc.field_M.first(param0 + 29407));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.sourceNode.isLinked(0)) {
                  var1Lifetime1.unlink((byte) 111);
                }
                var1Lifetime1 = (SoundPlayback) (jc.field_M.next((byte) 116));
              }
            }
          }
          if (null != m.musicSynthesizer) {
            stackIn_20_0 = m.musicSynthesizer.hasMidiData(-1);
            if (!stackIn_20_0) {
              IsaacGenerator.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "mm.D(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        if (param3 == 22676) {
          return this.a(param0, param5, param1, param2, this.field_Qb.height, param4, 0);
        }
        field_Pb = 127;
        return this.a(param0, param5, param1, param2, this.field_Qb.height, param4, 0);
    }

    static {
        field_Pb = 3;
    }
}
