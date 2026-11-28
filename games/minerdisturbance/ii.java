/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static String field_c;
    static IntrusiveDeque field_b;
    static int field_a;

    final static sa a(PcmSample param0, boolean param1) {
        RuntimeException var2 = null;
        sa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            ii.clearStaticReferences((byte) -103);
          }
          stackIn_3_0 = mg.a(1963987425, RawPcmStream.createForPlaybackRate(param0, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ii.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String b(byte param0) {
        if (ic.field_l == AwtRasterBuffer.field_e) {
          return qf.field_r;
        }
        int var1 = -48 / ((param0 - 15) / 47);
        return ch.field_g;
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 < 101) {
          field_c = (String) null;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        Sprite var1 = new Sprite(540, 140);
        ArchiveProvider.a(var1, 127);
        dj.a();
        SoftwareRasterizer.clearRaster();
        mn.field_x = 0;
        oj.o(param0 - 1236579268);
        Sprite var2 = var1.copy();
        if (param0 != 140) {
          return;
        }
        try {
          for (var3 = 0; var3 < 15; var3++) {
            var2.drawSilhouette(-2, -2, 16777215);
            SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 540, 140);
          }
          lc.field_u.bindAsRenderTarget();
          var1.drawHalfSize(0, 0);
          tk.b(true);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "ii.C(" + param0 + ')');
        }
    }

    static {
        field_c = "Taking a hard hat with you will soften the bumps and bruises you get from falling rocks. You'll never need to worry about cave-ins again.";
        field_b = new IntrusiveDeque();
    }
}
