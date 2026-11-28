/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static java.applet.Applet field_b;
    private ug[] field_j;
    private NetworkArchiveRequest field_g;
    private java.math.BigInteger field_a;
    private DiskCacheWorker field_c;
    static int field_f;
    private wb field_i;
    private java.math.BigInteger field_h;
    static int field_d;
    private PacketBuffer field_e;

    final static String a(java.applet.Applet param0, byte param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_8_0 = null;
          String stackIn_14_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = Lexicominos.field_L ? 1 : 0;
          try {
            try {
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              if (param1 != -28) {
                pg.resetStaticState(2);
              }
              var4 = (String) (JavaScriptBridge.callWithoutArguments(true, param0, "getcookies"));
              var5 = NetworkArchiveRequest.a(var4, ';', (byte) -125);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == AccountServiceResult.field_a) {
              stackIn_16_0 = param0.getParameter("settings");
              return stackIn_16_0;
            }
            stackIn_14_0 = AccountServiceResult.field_a;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("pg.C(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        pb var3_ref_pb = null;
        tg var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        BitPacketBuffer var9 = null;
        byte[] var13 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 != 1) {
            field_d = 66;
          }
          var9 = ig.field_a;
          var2 = var9.readUnsignedByte(true);
          if (0 == var2) {
            var3_ref_pb = (pb) (tl.field_h.beginForward(true));
            if (var3_ref_pb == null) {
              ProxyAuthenticationRequiredException.closeBufferedSocketWithIntGuard(-116);
              return;
            }
            var4_int = var9.readUnsignedByte(true);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4_int];
              var9.readBytes(param0 + 89, var4_int, 0, var13);
            }
            var9.position = var9.position + 4;
            if (!var9.verifyCrc32(4)) {
              ProxyAuthenticationRequiredException.closeBufferedSocketWithIntGuard(-112);
              return;
            }
            var3_ref_pb.unlink((byte) -127);
            return;
          }
          if (1 != var2) {
            uj.a("A1: " + StandardContentDialog.h(-100), (Throwable) null, 1);
            ProxyAuthenticationRequiredException.closeBufferedSocketWithIntGuard(-46);
            return;
          }
          var3 = var9.readInt((byte) 19);
          var4 = (tg) (SecondaryNodeDeque.field_c.beginForward(true));
          while (var4 != null) {
            if (var4.field_k != var3) {
              var4 = (tg) (SecondaryNodeDeque.field_c.nextForward(2));
              continue;
            }
            break;
          }
          if (var4 == null) {
            ProxyAuthenticationRequiredException.closeBufferedSocketWithIntGuard(-73);
            return;
          }
          var4.unlink((byte) -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) var1), "pg.D(" + param0 + ')');
        }
    }

    public static void resetStaticState(int param0) {
        if (param0 != -8413) {
          field_d = 56;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        ModalDialog.field_C = new IntrusiveDeque();
        if (param0 < 75) {
          pg.resetStaticState(-8);
        }
    }

    pg(wb param0, DiskCacheWorker param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean b(int param0) {
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        int var9;
        PacketBuffer var11;
        byte[] var12;
        byte[] var14;
        byte[] var18;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        java.math.BigInteger var13;
        byte[] var19;
        byte[] var20;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        byte[] var5Lifetime1;
        byte[] var5Lifetime2;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (null != this.field_e) {
          return true;
        }
        if (null == this.field_g) {
          if (this.field_i.e(20)) {
            return false;
          }
          this.field_g = this.field_i.a(5, 255, 255, (byte) 0, true);
        }
        if (this.field_g.field_v) {
          return false;
        }
        var11 = new PacketBuffer(this.field_g.getData((byte) 76));
        var11.position = 5;
        var3 = var11.readUnsignedByte(true);
        var11.position = var11.position + var3 * 72;
        var14 = new byte[var11.payload.length - var11.position];
        var12 = var14;
        var4 = var12;
        var11.readBytes(107, var14.length, 0, var14);
        if (null == this.field_h) {
          var5 = var4;
          if (var5.length != 65) {
            throw new RuntimeException();
          }
          var18 = ArchiveRequest.a(5, var11.payload, -86, -5 + var11.position - var14.length);
          for (var7 = 0; var7 < 64; var7++) {
            if (var5[1 + var7] != var18[var7]) {
              throw new RuntimeException();
            }
          }
          var8 = 102 % ((16 - param0) / 37);
          this.field_j = new ug[var3];
          this.field_e = var11;
          return true;
        }
        if (null == this.field_a) {
          var5Lifetime1 = var4;
          if (var5Lifetime1.length != 65) {
            throw new RuntimeException();
          }
          var19 = ArchiveRequest.a(5, var11.payload, -86, -5 + var11.position - var14.length);
          for (var7Lifetime1 = 0; var7Lifetime1 < 64; var7Lifetime1++) {
            if (var5Lifetime1[1 + var7Lifetime1] != var19[var7Lifetime1]) {
              throw new RuntimeException();
            }
          }
          var8Lifetime1 = 102 % ((16 - param0) / 37);
          this.field_j = new ug[var3];
          this.field_e = var11;
          return true;
        }
        var13 = new java.math.BigInteger(var14);
        var7_ref_java_math_BigInteger = var13.modPow(this.field_h, this.field_a);
        var5Lifetime2 = var7_ref_java_math_BigInteger.toByteArray();
        if (var5Lifetime2.length != 65) {
          throw new RuntimeException();
        }
        var20 = ArchiveRequest.a(5, var11.payload, -86, -5 + var11.position - var14.length);
        for (var7Lifetime2 = 0; var7Lifetime2 < 64; var7Lifetime2++) {
          if (var5Lifetime2[1 + var7Lifetime2] != var20[var7Lifetime2]) {
            throw new RuntimeException();
          }
        }
        var8Lifetime2 = 102 % ((16 - param0) / 37);
        this.field_j = new ug[var3];
        this.field_e = var11;
        return true;
    }

    private pg(wb param0, DiskCacheWorker param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
          this.field_i = param0;
          this.field_h = param2;
          this.field_c = param1;
          this.field_a = param3;
          if (!this.field_i.e(20)) {
            this.field_g = this.field_i.a(5, 255, 255, (byte) 0, true);
          }
        } catch (RuntimeException runtimeException) {
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        ug stackIn_17_0 = null;
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (null == this.field_j) {
          return;
        }
        for (var2 = 0; this.field_j.length > var2; var2++) {
          if (this.field_j[var2] != null) {
            this.field_j[var2].b(param0 ^ -56);
          }
        }
        if (param0 != 72) {
          this.d(-43);
          for (var2Lifetime1 = 0; this.field_j.length > var2Lifetime1; var2Lifetime1++) {
            if (null != this.field_j[var2Lifetime1]) {
              this.field_j[var2Lifetime1].b(false);
            }
          }
        } else {
          for (var2Lifetime1 = 0; this.field_j.length > var2Lifetime1; var2Lifetime1++) {
            if (null != this.field_j[var2Lifetime1]) {
              stackIn_17_0 = this.field_j[var2Lifetime1];
              ((ug) (Object) stackIn_17_0).b(false);
            }
          }
        }
        return;
    }

    final ug a(int param0, int param1, SectorCacheStore param2, SectorCacheStore param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ug var9 = null;
        byte[] var13 = null;
        ug stackIn_9_0 = null;
        ug stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e == null) {
            throw new RuntimeException();
          }
          if (param0 >= 0 &&
            param0 < this.field_j.length) {
            if (this.field_j[param0] != null) {
              stackIn_9_0 = this.field_j[param0];
              return stackIn_9_0;
            }
            this.field_e.position = 6 + param0 * 72;
            var6_int = this.field_e.readInt((byte) 19);
            var7 = this.field_e.readInt((byte) 19);
            if (param1 != 3510) {
              pg.a(55);
            }
            var13 = new byte[64];
            this.field_e.readBytes(106, 64, 0, var13);
            var9 = new ug(param0, param2, param3, this.field_i, this.field_c, var6_int, var13, var7, param4);
            this.field_j[param0] = var9;
            stackIn_13_0 = var9;
            return stackIn_13_0;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("pg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_f = 0;
        field_d = -1;
    }
}
