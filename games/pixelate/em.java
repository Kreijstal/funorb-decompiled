/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        if (param0 > -13) {
          field_a = (String) null;
          DateOfBirthValidator.field_j = 0;
          return;
        }
        DateOfBirthValidator.field_j = 0;
    }

    final static void a(byte param0, lc param1, int param2) {
        CipherPacketBuffer var3 = null;
        try {
          if (param0 != -7) {
            int[] var4 = (int[]) null;
            em.a((String) null, 12L, (String) null, 43, (SceneWidget) null, -102, (ScrollContainer) null, (int[]) null, 46);
          }
          var3 = aa.field_f;
          var3.g(param2, 15514);
          var3.writeByte(160, param1.field_k);
          var3.writeByte(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "em.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(Sprite[] param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          jm.field_i = param0;
          var2_int = param0[0].field_A;
          SectorCacheStore.field_b = var2_int;
          hf.field_k = var2_int;
          IconTextComponent.field_Jb = (800 - var2_int) / 2;
          PasswordFieldPainter.field_A = rk.field_e.maxAscent + rk.field_e.maxDescent;
          DirectByteStorage.field_k = PasswordFieldPainter.field_A * 50 - 163;
          if (param1 >= -75) {
            field_b = (String) null;
          }
          for (var3 = 0; var3 < 50; var3++) {
            ModalPanel.field_I[var3] = new up(var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("em.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, long param1, String param2, int param3, SceneWidget param4, int param5, ScrollContainer param6, int[] param7, int param8) {
        try {
          if (param5 != -163) {
            em.a((byte) 53);
          }
          bj.field_d = param6;
          ProxySocketConnector.field_n = new ClientContextMenu(param4, param1, param2, param0, param3, param8, param7);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "em.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_b = null;
        if (param0 <= 88) {
          return;
        }
        field_a = null;
    }

    final static void a(PcmStreamMixer param0, int param1, int param2, ResourceArchive param3) {
        try {
          ub.field_a = MenuInputState.a(true) * param2 / 1000;
          DualLinkDeque.a(param3, (byte) 14);
          dk.a(false, param3);
          NameAvailabilityValidator.a(false, param3);
          OptionsScreen.e(260);
          UiComponent.g(0);
          GameModeCard.field_f = -ub.field_a + 0;
          int var4_int = 26 % ((param1 - 1) / 55);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "em.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Loading extra data";
        field_b = "Names should contain a maximum of 12 characters";
        field_c = "Public";
    }
}
