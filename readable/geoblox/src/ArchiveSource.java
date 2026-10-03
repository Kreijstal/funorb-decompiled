/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveSource {
    static String loadingText;
    static char[] field_b;
    static SecondaryNodeHashTable field_a;

    abstract int getGroupProgress(int methodGuard, int groupId);

    public static void a(boolean param0) {
        if (!param0) {
            byte[] var2 = (byte[]) null;
            ArchiveSource.a((java.math.BigInteger) null, (java.math.BigInteger) null, 127, (ByteArrayBuffer) null, (byte[]) null, -60, false);
        }
        field_b = null;
        field_a = null;
        loadingText = null;
    }

    abstract ArchiveIndex getIndex(byte methodGuard);

    abstract byte[] getPackedGroup(int methodGuard, int groupId);

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2, ByteArrayBuffer param3, byte[] param4, int param5, boolean param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        try {
          var7_int = GameplayEntity.alignBitOffset(1221916132, param5);
          if (cl.field_e == null) {
            cl.field_e = new java.security.SecureRandom();
          }
          var12 = new int[4];
          var11 = var12;
          var8 = var11;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = cl.field_e.nextInt();
          }
          if (!((null != fa.field_c) &&
                (fa.field_c.bytes.length >= var7_int))) {
            fa.field_c = new ByteArrayBuffer(var7_int);
          }
          fa.field_c.position = 0;
          fa.field_c.writeBytes(param5, -97, param4, param2);
          fa.field_c.padZerosToPosition((byte) -84, var7_int);
          fa.field_c.encryptXteaBlocks(var12, (byte) -33);
          if (!((HotspotTextWidget.field_I != null) &&
              (HotspotTextWidget.field_I.bytes.length >= 100))) {
            HotspotTextWidget.field_I = new ByteArrayBuffer(100);
          }
          HotspotTextWidget.field_I.position = 0;
          HotspotTextWidget.field_I.writeByte((byte) -69, 10);
          var10 = 0;
          var9 = var10;
          while (var10 < 4) {
            HotspotTextWidget.field_I.writeIntBE((byte) 95, var12[var10]);
            var10++;
          }
          if (!param6) {
            return;
          }
          HotspotTextWidget.field_I.writeShortBE(param5, 28695);
          HotspotTextWidget.field_I.replaceWithModPowResult(0, param0, param1);
          param3.writeBytes(HotspotTextWidget.field_I.position, -97, HotspotTextWidget.field_I.bytes, 0);
          param3.writeBytes(fa.field_c.position, -97, fa.field_c.bytes, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("nh.K(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        loadingText = "Loading...";
        field_b = new char[]{(char)91, (char)93, (char)35};
    }
}
