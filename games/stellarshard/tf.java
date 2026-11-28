/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tf {
    static String field_c;
    static IntrusiveDeque field_a;
    static li field_b;

    final static void a(int param0) {
        int var1 = ok.a((byte) 125);
        int var2 = BoundedRandomAccessFile.b((byte) 98);
        if (param0 == 0) {
          eh.field_a.a(true, var1 + (PacketBuffer.field_q << 1), var2 + (DirectByteStorage.field_h << 1), RichTextWidget.field_F - DirectByteStorage.field_h, -PacketBuffer.field_q + od.field_r);
          kl.a(true);
          return;
        }
        tf.clearStaticReferences(-92);
        eh.field_a.a(true, var1 + (PacketBuffer.field_q << 1), var2 + (DirectByteStorage.field_h << 1), RichTextWidget.field_F - DirectByteStorage.field_h, -PacketBuffer.field_q + od.field_r);
        kl.a(true);
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = -17 / ((param0 + 7) / 63);
    }

    final static byte[] extractBytes(int param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            return null;
          }
          if (param0 != 2) {
            tf.clearStaticReferences(-31);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            var4 = (ByteStorage) (param2);
            stackIn_14_0 = var4.getBytes(-27);
            return stackIn_14_0;
          }
          var3 = (byte[]) (param2);
          if (param1) {
            stackIn_11_0 = cl.copyBytes(0, var3);
            return stackIn_11_0;
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("tf.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, Sprite[] param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = stellarshard.field_B;
        if (param2 == null ||
          param0 <= 0) {
          return;
        }
        try {
          var5_int = param2[0].field_w;
          var6 = param2[param1].field_w;
          var7 = param2[1].field_w;
          param2[0].draw(param3, param4);
          param2[2].draw(-var6 + param0 + param3, param4);
          SoftwareRasterizer.saveClip(og.field_b);
          SoftwareRasterizer.intersectClip(var5_int + param3, param4, -var6 + param3 + param0, param2[1].field_x + param4);
          var8 = param3 + var5_int;
          var9 = -var6 + (param3 + param0);
          for (param3 = var8; param3 < var9; param3 = param3 + var7) {
            param2[1].draw(param3, param4);
          }
          SoftwareRasterizer.restoreClip(og.field_b);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "tf.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = "Not yet achieved";
        field_a = new IntrusiveDeque();
        field_b = new li(15, 0, 1, 0);
    }
}
