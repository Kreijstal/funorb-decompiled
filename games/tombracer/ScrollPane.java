/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScrollPane extends UiComponent {
    static int field_ub;
    UiComponent field_tb;
    UiComponent field_vb;
    VerticalScrollbar field_wb;

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ik var4 = null;
        int var4_int = 0;
        int var5 = 0;
        toa var5_ref_toa = null;
        int[] var6 = null;
        int var8 = 0;
        BitPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          var10 = WeaveOperator.field_q;
          var2 = var10.readUnsignedByte(255);
          var3 = var10.readUnsignedByte(param0 + 255);
          if (var2 == param0) {
            var4 = (ik) (Player.field_I.first(param0 ^ -80));
            if (var4 == null) {
              dea.closeGameSocket(60);
              return;
            }
            var5 = -var10.position + uca.field_d;
            var12 = var4.field_i;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(255) << SnakePitBehaviour.bitwiseAnd(768, var7 << 8));
            }
            var4.unlink(param0 + 79);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.readSignedSmart((byte) -128);
            var5_ref_toa = (toa) (BridgeModel.field_m.first(-80));
            while (var5_ref_toa != null) {
              if (var5_ref_toa.field_i != var3 ||
                var4_int != var5_ref_toa.field_k) {
                var5_ref_toa = (toa) (BridgeModel.field_m.next(param0 + 123));
                continue;
              }
              break;
            }
            if (var5_ref_toa != null) {
              var5_ref_toa.unlink(103);
              return;
            }
            dea.closeGameSocket(60);
            return;
          }
          ssa.reportClientError("LR1: " + kk.formatPacketDump(32), (byte) 122, (Throwable) null);
          dea.closeGameSocket(60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var1), "iv.F(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        this.field_vb.field_G = -param1 + this.field_G - param0;
        this.field_tb.field_qb = 0;
        this.field_vb.field_t = this.field_t;
        this.field_tb.field_G = -param1 + this.field_G - param0;
        int var4 = 127 % ((84 - param2) / 41);
        this.field_wb.a(this.field_tb.field_t, -this.field_tb.field_T, param0, false, this.field_G - param0, this.field_t, this.field_vb.field_t, 0);
    }

    ScrollPane(long param0, UiComponent param1, UiComponent param2, VerticalScrollbar param3) {
        super(param0, (UiComponent) null);
        try {
          this.field_vb = new UiComponent(0L, param2);
          this.field_wb = new VerticalScrollbar(0L, param3);
          this.addChild(-123, this.field_vb);
          this.addChild(-128, this.field_wb);
          this.field_tb = param1;
          this.field_vb.addChild(-122, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "iv.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void applyScrollInput(int param0, boolean param1, int param2, int param3, byte param4) {
        int var6;
        if (this.field_wb.pollLineUp((byte) -115)) {
          this.field_tb.field_K = this.field_tb.field_K + param3;
        }
        if (this.field_wb.pollLineDown((byte) 40)) {
          this.field_tb.field_K = this.field_tb.field_K - param3;
        }
        if (this.field_wb.pollPageUp(-1)) {
          this.field_tb.field_K = this.field_tb.field_K + param2;
        }
        if (this.field_wb.pollPageDown(-101)) {
          this.field_tb.field_K = this.field_tb.field_K - param2;
        }
        var6 = -87 / ((67 - param4) / 45);
        if (this.field_o) {
          this.field_tb.field_K = this.field_tb.field_K - param0;
        }
        if (param1) {
          if (-(this.field_tb.field_K + this.field_tb.field_T) < 0) {
            this.field_tb.field_K = -this.field_tb.field_T;
          }
          if (-(this.field_tb.field_K + this.field_tb.field_T) > -this.field_vb.field_t + this.field_tb.field_O + this.field_tb.field_t) {
            this.field_tb.field_K = -(this.field_tb.field_O + (this.field_tb.field_t - this.field_vb.field_t)) - this.field_tb.field_T;
          }
        } else {
          if (this.field_tb.field_O + this.field_tb.field_t - this.field_vb.field_t < -(this.field_tb.field_K + this.field_tb.field_T)) {
            this.field_tb.field_K = -(-this.field_vb.field_t + (this.field_tb.field_t + this.field_tb.field_O)) - this.field_tb.field_T;
          }
          if (-(this.field_tb.field_K + this.field_tb.field_T) < 0) {
            this.field_tb.field_K = -this.field_tb.field_T;
          }
        }
        if (this.field_wb.isThumbHeld(-1)) {
          this.field_tb.field_T = -this.field_wb.getDraggedScrollOffset(param1, (byte) 108, this.field_vb.field_t, this.field_tb.field_t);
          this.field_tb.field_K = 0;
        }
        this.field_wb.layoutThumb(this.field_vb.field_t, this.field_tb.field_t, (byte) -74, -this.field_tb.field_T);
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var8;
        int var8Lifetime1;
        if (param0) {
          var8 = 1;
          this.field_tb.layoutVerticalContent(var8 != 0, param2, 120, this.field_vb.field_t);
          this.applyScrollInput(param1, false, param3, param4, (byte) 114);
          if (!param6) {
            return false;
          }
          return var8 != 0;
        }
        if (!this.field_o) {
          var8Lifetime1 = 0;
        } else {
          if (!param5) {
            var8Lifetime1 = 1;
          } else {
            var8Lifetime1 = 0;
          }
        }
        this.field_tb.layoutVerticalContent(var8Lifetime1 != 0, param2, 120, this.field_vb.field_t);
        this.applyScrollInput(param1, false, param3, param4, (byte) 114);
        if (!param6) {
          return false;
        }
        return var8Lifetime1 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        if (param2 == 127) {
          this.field_qb = param3;
          this.field_t = param5;
          this.field_G = param0;
          this.field_T = param6;
          this.a(param4, param1, (byte) 125);
          return;
        }
        field_ub = 74;
        this.field_qb = param3;
        this.field_t = param5;
        this.field_G = param0;
        this.field_T = param6;
        this.a(param4, param1, (byte) 125);
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param2 <= 68) {
          return true;
        }
        return this.a(param5, param3, param0, this.field_vb.field_t, param4, param1, true);
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        this.applyScrollInput(param2, param0, this.field_vb.field_t, param3, (byte) 117);
        if (param1 != 0) {
          discarded$0 = this.a(false, -87, -125, 47, 100, false, true);
        }
    }

    static {
    }
}
