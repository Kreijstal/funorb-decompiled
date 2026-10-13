/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Ball extends CircleBody {
    static jp field_w;
    static mh field_A;
    static String field_H;
    int field_I;
    static java.math.BigInteger field_F;
    static jp[] field_G;
    private int field_z;
    static jp[] field_K;
    hp field_E;
    int field_v;
    static String field_x;
    int field_C;
    int field_J;
    static jp field_D;
    int field_B;
    hp field_y;

    private Ball(int param0, int param1) {
        super(0, 0, 0, 0, 1536, 0);
        this.field_E = new hp(50);
        this.field_y = new hp(50);
        this.field_z = param0;
        this.setVelocityFromAngle(this.field_z, param1, 116);
    }

    final static th a(int param0, byte param1) {
        th[] var2;
        int var3;
        int var4;
        th[] var5;
        int var3Lifetime1;
        th[] var2Lifetime1;
        th[] var5Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 > 4) {
          var5 = lq.b(0);
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            if (param0 == var5[var3].field_e) {
              return var5[var3];
            }
          }
          return null;
        }
        field_A = (mh) null;
        var5Lifetime1 = lq.b(0);
        var2Lifetime1 = var5Lifetime1;
        for (var3Lifetime1 = 0; var5Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
          if (param0 == var5Lifetime1[var3Lifetime1].field_e) {
            return var5Lifetime1[var3Lifetime1];
          }
        }
        return null;
    }

    final void a(Paddle param0, int param1) {
        try {
          this.x256 = -1536 + (param0.x256 + (param0.width256 >> 1));
          this.y256 = param0.y256 - 3072;
          this.x256 = this.x256 + param0.width256 * this.field_z / 3072;
          if (param1 != 0) {
            this.field_E = (hp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    Ball(int x256, int y256, int velocityX256, int velocityY256) {
        super(x256, y256, velocityX256, velocityY256, 1536, 0);
        this.field_E = new hp(50);
        this.field_y = new hp(50);
    }

    final static int[] d(int param0) {
        if (param0 != 8) {
          Ball.d(-23);
          return new int[8];
        }
        return new int[8];
    }

    public static void c(int param0) {
        field_F = null;
        field_w = null;
        field_G = null;
        field_x = null;
        field_A = null;
        field_H = null;
        field_D = null;
        if (param0 >= 91) {
          field_K = null;
          return;
        }
        field_F = (java.math.BigInteger) null;
        field_K = null;
    }

    Ball() {
        this(0, 0, 0, 0);
    }

    final void setVelocityFromAngle(int angle, int speed, int obfuscationGuard) {
        this.velocityX256 = (sa.a(angle, -4097) >> 8) * speed >> 8;
        if (obfuscationGuard >= 95) {
          this.velocityY256 = (BrickABrac.c(2048, angle) >> 8) * -speed >> 8;
          return;
        }
    }

    Ball(Paddle param0, int param1, int param2) {
        this(param1, param2);
        try {
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void readBodySnapshot(int obfuscationGuard, wq packet) {
        super.readBodySnapshot(107, packet);
        this.field_C = packet.e(255);
        if (obfuscationGuard < 89) {
          return;
        }
        try {
          this.field_v = packet.i(65280);
          this.field_J = packet.a(126);
          this.field_z = packet.a(126);
          this.field_I = packet.c((byte) -82);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            this.c(-49, 14);
          }
          var3_int = -19088744 ^ super.computeSyncChecksum(93, diagnostics);
          if (diagnostics != null) {
            discarded$3 = diagnostics.append("base checksum for ball: " + Integer.toString(var3_int, 16) + "\n");
            discarded$4 = diagnostics.append(this.x256 + " " + this.y256 + " " + this.velocityX256 + " " + this.velocityY256 + " " + " " + this.typeId + " " + this.stateWord + "\n");
            discarded$5 = diagnostics.append("Ball Info: " + this.field_v + " " + this.field_J + " " + this.field_C + " " + this.field_z + "\n");
          }
          var3_int = var3_int ^ this.field_v * 83 + 119 << 12;
          var3_int = var3_int ^ 57 + this.field_J * 13 << 18;
          var3_int = var3_int ^ 6483 + this.field_C * 53 << 3;
          var3_int = var3_int ^ this.field_z * 5 + 289 << 5;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vn.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        this.field_J = this.field_J + param1;
        this.field_v = 0;
        if (param0 > -27) {
          this.setVelocityFromAngle(119, 71, 24);
        }
    }

    final void c(int param0, int param1) {
        int var3 = kj.a(this.velocityX256 * this.velocityX256 + this.velocityY256 * this.velocityY256, 2) >> 8;
        int var4 = param1 + var3;
        if (var4 < param0) {
          var4 = 512;
        }
        if (var4 > 3840) {
          var4 = 3840;
        }
        this.velocityX256 = this.velocityX256 * var4 / var3;
        this.velocityY256 = var4 * this.velocityY256 / var3;
    }

    final void a(byte param0, int param1) {
        if (param0 == 40) {
          this.field_v = this.field_v + param1;
          this.field_J = 0;
          return;
        }
        field_K = (jp[]) null;
        this.field_v = this.field_v + param1;
        this.field_J = 0;
    }

    final void a(int param0, int param1) {
        this.setVelocityFromAngle(param1, kj.a(this.velocityY256 * this.velocityY256 + this.velocityX256 * this.velocityX256, 2) >> 8, 107);
        if (param0 != 6546) {
          this.field_v = -29;
        }
    }

    static {
        field_x = "Unpacking levels";
        field_H = "To server list";
        field_F = new java.math.BigInteger("65537");
    }
}
