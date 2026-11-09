/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static int field_a;

    final static void a(int param0) {
        int var1 = (kh.field_Mb - 640) / 2;
        int var2 = MouseInputHandler.field_f * MouseInputHandler.field_f;
        int var3 = var2 - PlacementOrder.field_t * PlacementOrder.field_t;
        MapViewState.field_j.setTarget(199, -124 + (SoftwareRasterizer.field_k - 90), (byte) 49, 90, -(199 * var3 / var2) + var1);
        AchievementProgress.field_i.setTarget(param0, SoftwareRasterizer.field_k - 124, (byte) 56, 0, var1 + (202 + var3 * 438 / var2));
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_17_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        CipherPacketBuffer var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param0);
          if (!gb.a((byte) -118, var7)) {
            stackIn_2_0 = tm.field_j;
            return stackIn_2_0;
          }
          if (po.field_b != 2) {
            stackIn_5_0 = of.field_c;
            return stackIn_5_0;
          }
          if (jp.a(param0, (byte) -105)) {
            stackIn_8_0 = QuaternaryNodeList.field_f;
            return stackIn_8_0;
          }
          if (DebouncedValidator.a(-30106, param0)) {
            stackIn_12_0 = QuickChatCategoryRegistry.a(MapView.field_pb, 4371, new String[]{param0});
            return stackIn_12_0;
          }
          if (UrlLoader.field_c >= 100 &&
            StarAnnotation.field_m <= 0) {
            stackIn_17_0 = hd.field_p;
            return stackIn_17_0;
          }
          if (param2 > -57) {
            var5 = (String) null;
            nj.a((String) null, -114, (byte) -20);
          }
          if (UrlLoader.field_c >= 200) {
            stackIn_22_0 = hd.field_p;
            return stackIn_22_0;
          }
          if (IntrusiveNodeHashTable.a(param0, true)) {
            stackIn_26_0 = QuickChatCategoryRegistry.a(TextFieldWidget.field_G, 4371, new String[]{param0});
            return stackIn_26_0;
          }
          var6 = js.field_f;
          var6.h(param1, 255);
          var6.position = var6.position + 1;
          var4 = var6.position;
          var6.writeByte(0, (byte) -58);
          var6.writeString(param0, (byte) 0);
          var6.patchLengthByte(-var4 + var6.position, (byte) 118);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("nj.D(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(float param0, int param1, String param2) {
        try {
          ContentDialog.field_cb = param0;
          DerelictMapGenerator.field_r = param2;
          if (param1 != 2) {
            field_a = 17;
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "nj.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var1 = -119 % ((param0 + 49) / 41);
        ValidatedTextInputWidget.field_X = null;
        if (ck.field_a == null) {
          sg.field_Ab = null;
          hd.field_m = null;
          AgeValidator.field_n = null;
          DirectByteArrayStorage.field_l = null;
          sr.field_h = true;
          return;
        }
        OpacityWidget.field_C = WhirlpoolHasher.field_j;
        uq.field_j = ck.field_a;
        uq.field_j.field_jb = -1;
        WhirlpoolHasher.field_j = null;
        uq.field_j.field_qb = -1;
        ck.field_a = null;
        sg.field_Ab = null;
        hd.field_m = null;
        AgeValidator.field_n = null;
        DirectByteArrayStorage.field_l = null;
        sr.field_h = true;
    }

    static {
    }
}
