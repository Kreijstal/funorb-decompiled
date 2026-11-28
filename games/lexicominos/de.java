/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends RuntimeException {
    String field_a;
    Throwable field_c;
    static PcmStreamMixer field_b;

    final static void a(RgbSprite param0, int param1) {
        try {
          if (param1 != 6) {
            field_b = (PcmStreamMixer) null;
          }
          ja.b((byte) -111);
          SoftwareRasterizer.setRasterBuffer(param0.field_y, param0.field_r, param0.field_x);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "de.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        int var3 = 0;
        int var4 = 0;
        TriangleMesh var5 = null;
        int[] var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        int var9 = 0;
        BitPacketBuffer var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var8 = new BitPacketBuffer(param1.getFileByName((byte) 127, "", "logo.fo3d"));
          var10 = var8;
          var3 = var10.readUnsignedByte(true);
          var10.beginBitAccess(10);
          ResourceArchive.field_d = ValidatedTextField.a(var10, -121);
          uj.field_f = new int[var3][];
          ae.field_J = new TriangleMesh[var3];
          for (var4 = 0; var4 < var3; var4++) {
            ae.field_J[var4] = FrameTimer.a(var8, dg.a(param0, -114));
          }
          var10.endBitAccess(8);
          var9 = param0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = ae.field_J[var9];
            var5.a(6, 6, (byte) 52, 1, 6);
            var5.a((byte) -50);
            var6 = new int[]{var5.field_v + var5.field_m >> 1, var5.field_M + var5.field_G >> 1, var5.field_F + var5.field_O >> 1};
            uj.field_f[var9] = var6;
            var5.a(-var6[2], -var6[1], false, -var6[0]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("de.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0, float param1, String param2, boolean param3) {
        try {
          if (null == qj.field_fb) {
            qj.field_fb = new uk(ug.field_A, jj.field_d);
            ug.field_A.a(-14579, qj.field_fb);
          }
          qj.field_fb.a(param0, param2, 125, param1);
          SoftwareRasterizer.clearRaster();
          we.a((byte) -65, param3);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "de.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 6) {
          return;
        }
        field_b = null;
    }

    de(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    static {
    }
}
