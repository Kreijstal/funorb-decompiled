/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Paddle extends RectangleBody {
    int field_z;
    private int field_D;
    int controlMode;
    int field_w;
    int boardSpan256;
    static mh field_C;
    static int field_x;
    private int centerX256;
    static int[] field_v;
    static String field_G;
    int sizeStage;
    int field_H;
    static int field_A;

    public static void e(int param0) {
        field_C = null;
        int var1 = -6 / ((param0 + 5) / 47);
        field_G = null;
        field_v = null;
    }

    Paddle(int centerX256, int y256, int controlMode, int boardSpan256) {
        super(0, y256, 0, 0, 22528, 3840, 0);
        this.field_D = 1;
        this.boardSpan256 = boardSpan256;
        this.centerX256 = centerX256;
        this.controlMode = controlMode;
        this.resetSize(0);
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = super.computeSyncChecksum(105, diagnostics) ^ 1381323349;
          if (diagnostics != null) {
            discarded$4 = diagnostics.append("base checksum for paddle: " + Integer.toString(var3_int, 16) + "\n");
            discarded$5 = diagnostics.append(this.x256 + " " + this.y256 + " " + this.velocityX256 + " " + this.velocityY256 + " " + " " + this.typeId + " " + this.stateWord + "\n");
            discarded$6 = diagnostics.append(this.controlMode + " " + this.boardSpan256 + " " + this.centerX256 + " " + this.sizeStage + " " + " " + this.field_w + " " + this.field_z + "\n");
            discarded$7 = diagnostics.append(this.field_D + " " + this.field_H + "\n");
          }
          var3_int = var3_int ^ (this.boardSpan256 * 41 << 5) + (this.controlMode * 37 << 1);
          var3_int = var3_int + (64175 + this.centerX256 * 11);
          var3_int = var3_int ^ 51 + this.sizeStage * 31 << 22;
          var3_int = var3_int ^ 85 + this.field_w * 59 << 11;
          if (obfuscationGuard <= 79) {
            this.field_w = 12;
          }
          var3_int = var3_int + (this.field_z * 29 << 26);
          var3_int = var3_int ^ 10 + 13 * this.field_D << 28;
          var3_int = var3_int ^ this.field_H * 83 + 45050 << 2;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vo.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != CircleBody.field_p) {
          var3 = CircleBody.field_p.b(param1, 8421504);
          if (-2 == var3) {
            if (param2 <= 69) {
              field_v = (int[]) null;
              return;
            }
            return;
          }
          if (var3 != -1) {
            var4 = CircleBody.field_p.j(72) ? 1 : 0;
            oc.a(var3, param0, CircleBody.field_p.field_Wb, 1, var4 != 0, CircleBody.field_p.h(107));
          }
          CircleBody.field_p = null;
          cr.f((byte) -124);
        }
        if (param2 > 69) {
          return;
        }
        field_v = (int[]) null;
    }

    final void b(boolean param0) {
        if (this.field_D != 8) {
          this.field_D = this.field_D + 1;
          if (!param0) {
            field_C = (mh) null;
          }
          return;
        }
    }

    final void a(byte param0, PlayerBoard param1, CircleBody param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Ball var14 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          super.a(param0, param1, param2);
          var14 = (Ball) (param2);
          var14.field_I = 0;
          var14.field_C = var14.field_C + 1;
          if (sh.field_a != 1) {
            if (sh.field_a == 2) {
              param2.velocityY256 = -param2.velocityY256;
              return;
            }
            param2.velocityX256 = -param2.velocityX256;
            var5 = (this.velocityX256 - param2.velocityX256) * mn.field_A;
            if (var5 >= 0) {
              return;
            }
            param2.velocityX256 = this.velocityX256;
            return;
          }
          var5Lifetime1 = kj.a(-w.b(param2.velocityX256, -param2.velocityX256, 93) - w.b(param2.velocityY256, -param2.velocityY256, 114) << 8, param0 - 51) >> 8;
          var6 = this.field_D * 16 + var5Lifetime1;
          if (3840 < var6) {
            var6 = 3840;
          }
          var7 = 43520;
          var8 = param2.x256 + param2.radius256 - (this.x256 + (this.width256 >> 1));
          var9 = -kj.a(w.b(var8, -var8, 113) - w.b(var7, -var7, 111) << 8, 2);
          var9 = var9 / var7;
          var8 = (var8 << 8) / var7;
          var10 = param2.velocityY256 * var9 + var8 * param2.velocityX256 >> 7;
          var11 = -(var8 * var10 >> 8) + (param2.velocityX256 + 8) - param1.a(16, (byte) 62);
          var12 = -(var10 * var9 >> 8) + (param2.velocityY256 + (-param1.a(16, (byte) 62) + 8));
          if (var11 == 0) {
            param2.velocityY256 = var12;
            param2.velocityX256 = var11;
          } else {
            stackIn_8_0 = 341;
            if (var12 * var11 <= 0) {
              stackIn_9_1 = -((var12 << 8) / var11) << 8;
            } else {
              stackIn_9_1 = (var12 << 8) / var11 << 8;
            }
            if (stackIn_8_0 < nk.a(stackIn_9_1, 30922)) {
              param2.velocityY256 = var12;
              param2.velocityX256 = var11;
            } else {
              param2.velocityY256 = -param2.velocityY256;
            }
          }
          var5Lifetime2 = kj.a(-w.b(param2.velocityX256, -param2.velocityX256, param0 ^ 85) - w.b(param2.velocityY256, -param2.velocityY256, 95) << 8, param0 ^ 55) >> 8;
          param2.velocityX256 = var6 * param2.velocityX256 / var5Lifetime2;
          param2.velocityY256 = param2.velocityY256 * var6 / var5Lifetime2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("vo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void resetSize(int resetState) {
        this.field_D = 1;
        this.x256 = this.centerX256 - 11264;
        this.sizeStage = 8;
        this.width256 = 22528;
        this.field_H = resetState;
    }

    final void grow(int obfuscationGuard) {
        if (14 == this.sizeStage) {
          return;
        }
        if (obfuscationGuard >= 6) {
          this.x256 = this.x256 - 1536;
          this.sizeStage = this.sizeStage + 2;
          this.width256 = this.width256 + 3072;
          return;
        }
    }

    final void shrink(byte obfuscationGuard) {
        if (this.sizeStage != 0) {
          this.width256 = this.width256 - 3072;
          this.x256 = this.x256 + 1536;
          int var2 = 27 / ((74 - obfuscationGuard) / 49);
          this.sizeStage = this.sizeStage - 2;
          return;
        }
    }

    final void readBodySnapshot(int obfuscationGuard, wq packet) {
        super.readBodySnapshot(94, packet);
        this.sizeStage = packet.l(255);
        if (obfuscationGuard <= 89) {
          return;
        }
        try {
          this.field_D = 15 & this.sizeStage >> 4;
          this.sizeStage = this.sizeStage & 15;
          this.field_w = packet.i(65280);
          this.field_z = packet.i(65280);
          this.field_H = packet.i(65280);
          this.width256 = 32 + (6 * this.sizeStage + 8) << 8;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vo.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Show players in <%0>'s game";
        field_v = new int[8192];
    }
}
