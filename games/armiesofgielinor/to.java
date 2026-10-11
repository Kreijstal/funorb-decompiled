/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends mn {
    private ik field_v;
    private int field_w;

    final static short[] a(short[] param0, int param1, CipherPacketBuffer param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = param2.g(45, param1);
          if (var4_int == 0) {
            return null;
          }
          if (param3 != 10064) {
            stackIn_6_0 = (short[]) null;
            return stackIn_6_0;
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          var5 = param2.g(123, 4);
          var6 = (short)param2.g(param3 - 10172, 16);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(param2.g(63, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_19_0 = (short[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("to.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        if (vi.field_a == null) {
          return;
        }
        if (0 == vi.field_a.length) {
          return;
        }
        if (param0 < 0) {
          return;
        }
        if (param0 < vi.field_a.length) {
          we.a(100, param2, vi.field_a[param0]);
          int var3 = -110 / ((-58 - param1) / 63);
          return;
        }
    }

    final static void a(boolean param0, float param1, String param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (pq.field_a == null) {
            pq.field_a = new cr(KingBlackDragonEvent.field_C, aw.field_h);
            KingBlackDragonEvent.field_C.a(pq.field_a, param3 + 1);
          }
          pq.field_a.a(param1, 30, param0, param2);
          SoftwareRaster.b();
          DamageEvent.b((byte) 92, true);
          if (param3 == -1) {
            return;
          }
          to.a(-96, (byte) 21, 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("to.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final bd a(int param0, Battlefield param1) {
        RuntimeException var3 = null;
        String var4 = null;
        ua stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.unlink(-104);
          if (param0 <= 31) {
            var4 = (String) null;
            to.a(true, -1.1208561658859253f, (String) null, -70);
          }
          this.field_v.a((byte) -37, param1);
          stackIn_3_0 = new ua(this.field_v, this.field_w, this.field_p);
          return (bd) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("to.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    to(ik param0, int param1, int param2) {
        try {
          this.field_w = param1;
          this.field_p = param2;
          this.field_v = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "to.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
