/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rw {
    static float[] field_v;
    static mi field_y;
    int field_x;
    PacketBuffer field_w;
    byte field_z;

    public static void d(byte param0) {
        field_y = null;
        field_v = null;
        if (param0 != 62) {
          ResourceArchive var2 = (ResourceArchive) null;
          fv.a(-52, (ResourceArchive) null, (ResourceArchive) null);
        }
    }

    final int a(int param0) {
        if (this.field_w == null) {
          return 0;
        }
        if (param0 == -1) {
          return 100 * this.field_w.position / (-this.field_z + this.field_w.payload.length);
        }
        return 50;
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2) {
        try {
          if (param0 != 7966) {
            fv.d((byte) 80);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        PlayingSound var2 = null;
        int var3 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        PlayingSound var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          wd.field_f.serviceOutput();
          var1_int = -111 % ((param0 + 34) / 35);
          LegacyOpenGlEffectManager.field_a.serviceOutput();
          vf.field_b = vf.field_b - 1;
          if (vf.field_b == 0) {
            vf.field_b = 200;
            var2 = (PlayingSound) (jf.field_c.first(107));
            while (var2 != null) {
              if (!var2.lifetimeNode.isLinked(false)) {
                var2.unlink(false);
              }
              var2 = (PlayingSound) (jf.field_c.next((byte) 18));
            }
            if (s.field_u != null) {
              var2Lifetime1 = (PlayingSound) (s.field_u.first(-105));
              while (var2Lifetime1 != null) {
                if (!var2Lifetime1.lifetimeNode.isLinked(false)) {
                  var2Lifetime1.unlink(false);
                }
                var2Lifetime1 = (PlayingSound) (s.field_u.next((byte) 18));
              }
            }
          }
          if (qc.field_e != null) {
            stackIn_18_0 = qc.field_e.isPlaying(-8192);
            if (!stackIn_18_0) {
              GridWidgetContainer.field_B = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "fv.G(" + param0 + ')');
        }
    }

    final byte[] d(boolean param0) {
        if (param0) {
          return (byte[]) null;
        }
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (-this.field_z + this.field_w.payload.length <= this.field_w.position) {
          return this.field_w.payload;
        }
        throw new RuntimeException();
    }

    fv() {
    }

    static {
        field_v = new float[4];
        field_y = new mi();
        ByteArrayStorage.compatibilityNoOp(50, -120);
    }
}
