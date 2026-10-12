/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String field_f;
    static int field_b;
    static String[] field_a;
    static int field_d;
    private String field_c;
    static String field_e;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!cd.c(9501)) {
            if (FixedQuaternion.field_a != null &&
              FixedQuaternion.field_a.field_k) {
              ck.b(-110);
              SphinxActionRequest.field_v.a(new ud(SphinxActionRequest.field_v, mp.field_Mb), 0);
            }
            return;
          }
          SphinxActionRequest.field_v.a(true, -6226, en.field_F, AiUnitPlanner.field_s);
          SphinxActionRequest.field_v.d((byte) -117);
          while (Unit.i((byte) 107)) {
            SphinxActionRequest.field_v.a(rs.field_q, DualNodeDeque.field_i, 80);
          }
          if (param0 >= 10) {
            return;
          }
          pf.a(29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "pf.C(" + param0 + ')');
        }
    }

    final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -61) {
            field_d = 60;
          }
          stackIn_3_0 = this.field_c.equals(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("pf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_e = null;
        if (param0 == -49) {
          field_f = null;
          field_a = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        pf.storeBytes(-6, (byte[]) null, false);
        field_f = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static CampaignMission a(int param0, byte param1, CipherPacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CampaignMission var4 = null;
        CampaignMission stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -125 % ((param1 + 56) / 56);
          if (param0 == 0) {
            return null;
          }
          var4 = new CampaignMission();
          no.readTaggedFields(param2, var4, param0, -24721);
          var4.a(true);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static Object storeBytes(int obfuscationGuard, byte[] bytes, boolean copySmallArrays) {
        DirectByteStorage directStorage = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        DirectByteStorage stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            var4 = (byte[]) null;
            pf.storeBytes(113, (byte[]) null, true);
          }
          if (bytes == null) {
            return null;
          }
          if (bytes.length > 136) {
            directStorage = new DirectByteStorage();
            ((ByteStorage) ((Object) directStorage)).setBytes((byte) 126, bytes);
            stackIn_8_0 = directStorage;
            return stackIn_8_0;
          }
          if (!copySmallArrays) {
            stackIn_13_0 = (byte[]) (bytes);
            return stackIn_13_0;
          }
          stackIn_11_0 = SkeletonLimitMarker.a(bytes, 31732);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("pf.E(").append(obfuscationGuard).append(',');
          if (bytes == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(copySmallArrays).append(')').toString());
        }
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
          IntrusiveNode.a(param1, this.field_c, (byte) 29, "jagex-last-login-method", 31536000L);
          if (param0 != -137) {
            pf.a((byte) 95);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pf.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != -15291) {
          field_a = (String[]) null;
        }
        if (null == BattleCharacter.pointerInputHandler) {
          return;
        }
        var1 = BattleCharacter.pointerInputHandler;
        synchronized (var1) {
          BattleCharacter.pointerInputHandler = null;
        }
    }

    pf(String param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Advertising websites";
        field_e = "Coat of Arms";
        field_a = new String[]{"Turn time (seconds)", "Map size", "Game length", "Map theme", "Game Type", "Trinket Limit"};
    }
}
