/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh extends cb {
    int field_kb;
    String field_lb;
    static String field_jb;
    String field_ib;

    public static void releaseStatics(int param0) {
        field_jb = null;
        if (param0 >= -1) {
          oh.d((byte) 87);
        }
    }

    final static void a(byte[] param0, int param1, java.math.BigInteger param2, PacketBuffer param3, int param4, int param5, java.math.BigInteger param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        java.math.BigInteger var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var9Lifetime1;
        var10 = ZombieDawn.field_J;
        try {
          var7_int = ip.a(param4, -1);
          if (null == oc.field_a) {
            oc.field_a = new java.security.SecureRandom();
          }
          var14 = new int[4];
          var13 = var14;
          var8 = var13;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = oc.field_a.nextInt();
          }
          if (param5 != 31857) {
            var11 = (java.math.BigInteger) null;
            oh.a((byte[]) null, 73, (java.math.BigInteger) null, (PacketBuffer) null, -53, 65, (java.math.BigInteger) null);
          }
          if (null == bb.field_h ||
            !(var7_int <= bb.field_h.payload.length)) {
            bb.field_h = new PacketBuffer(var7_int);
          }
          bb.field_h.position = 0;
          bb.field_h.writeBytes(param0, param4, param1, param5 - 59700);
          bb.field_h.padToPosition(var7_int, 0);
          bb.field_h.a(var14, 30044);
          if (null == ip.field_l ||
            !(ip.field_l.payload.length >= 100)) {
            ip.field_l = new PacketBuffer(100);
          }
          ip.field_l.position = 0;
          ip.field_l.writeByte(10, 52);
          var12 = 0;
          var9Lifetime1 = var12;
          while (var12 < 4) {
            ip.field_l.writeInt(param5 ^ 31772, var14[var12]);
            var12++;
          }
          ip.field_l.writeShort(param4, (byte) 105);
          ip.field_l.encryptRsa(param2, false, param6);
          param3.writeBytes(ip.field_l.payload, ip.field_l.position, 0, param5 ^ -4276);
          param3.writeBytes(bb.field_h.payload, bb.field_h.position, 0, -27843);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("oh.H(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    oh() {
        super(0L, (cb) null);
    }

    final static void d(byte param0) {
        if (param0 > -71) {
          return;
        }
        hg.b(31431);
    }

    final static lp a(int param0, byte[] param1) {
        lp var2 = null;
        RuntimeException var2_ref = null;
        lp stackIn_5_0 = null;
        lp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param0 != 29506) {
            stackIn_5_0 = (lp) null;
            return stackIn_5_0;
          }
          var2 = new lp(param1, sl.field_d, bo.field_o, bn.field_c, uf.field_n, j.field_a, vj.field_m);
          no.f((byte) -73);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("oh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_jb = "Game Over";
    }
}
