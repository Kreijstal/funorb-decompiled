/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommonChooseReward implements dv {
    private int currentPlayerTicks;
    private int[] reward;
    private int currentPlayerId;
    private int takenCount;
    static jea field_c;
    private boolean finished;
    w field_g;
    private MatchState field_j;
    private int currentPos;
    static long field_b;

    final void a(int param0, byte param1) {
        int var3;
        if (this.finished) {
          return;
        }
        if (-1 == param0) {
          this.field_j.players[this.currentPlayerId].b(18202625, -1);
        } else {
          var3 = 63;
          if (3 == this.reward[param0]) {
            var3 = 64;
          } else {
            if (this.reward[param0] == 4) {
              var3 = 64;
            }
          }
          if (this.reward[param0] == 5) {
            var3 = 65;
          } else {
            if (this.reward[param0] == 6) {
              var3 = 65;
            }
          }
          if (this.field_g != null) {
            this.field_g.a(new fm(var3, 0, 0, 0), -58);
          }
          this.field_j.players[this.currentPlayerId].b(18202625, this.reward[param0]);
          this.reward[param0] = -1;
          this.takenCount = this.takenCount + 1;
        }
        if (param0 >= 0) {
        }
        if (param1 <= 86) {
          this.reward = (int[]) null;
        }
        this.currentPlayerTicks = 0;
        this.currentPos = this.currentPos + 1;
        this.d(-14447);
    }

    final int getCurrentPlayerTicks(int param0) {
        if (param0 != -1) {
          this.toString();
          return this.currentPlayerTicks;
        }
        return this.currentPlayerTicks;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 103) {
          return;
        }
        field_c = null;
    }

    final int a(int param0, int param1) {
        int var3 = 112 % ((-11 - param0) / 36);
        if (param1 == -1) {
          return -1;
        }
        return this.reward[param1];
    }

    private final void d(int param0) {
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != -14447) {
          this.field_g = (w) null;
          if (this.takenCount >= this.reward.length) {
            this.currentPlayerId = -1;
          } else {
            if (this.field_j.field_P <= this.currentPos) {
              this.currentPlayerId = -1;
            } else {
              this.currentPlayerId = this.field_j.field_c.field_e[this.currentPos];
              if (this.currentPlayerId == -1) {
                this.currentPlayerId = -1;
              } else {
                if (!this.field_j.b((byte) 90, this.currentPlayerId)) {
                  this.currentPlayerId = -1;
                }
              }
            }
          }
          if (this.currentPlayerId != -1) {
            return;
          }
          this.finished = true;
          return;
        }
        if (this.takenCount >= this.reward.length) {
          this.currentPlayerId = -1;
          if (this.currentPlayerId != -1) {
            return;
          }
          this.finished = true;
          return;
        }
        if (this.field_j.field_P <= this.currentPos) {
          this.currentPlayerId = -1;
          if (this.currentPlayerId != -1) {
            return;
          }
          this.finished = true;
          return;
        }
        this.currentPlayerId = this.field_j.field_c.field_e[this.currentPos];
        if (this.currentPlayerId == -1) {
          this.currentPlayerId = -1;
          if (this.currentPlayerId != -1) {
            return;
          }
          this.finished = true;
          return;
        }
        if (this.field_j.b((byte) 90, this.currentPlayerId)) {
          if (this.currentPlayerId != -1) {
            return;
          }
          this.finished = true;
          return;
        }
        this.currentPlayerId = -1;
        if (this.currentPlayerId == -1) {
          this.finished = true;
        }
    }

    final int b(byte param0) {
        if (param0 <= 18) {
          this.currentPlayerId = 121;
          return this.currentPos;
        }
        return this.currentPos;
    }

    final int a(int param0) {
        if (param0 != -28958) {
          return 27;
        }
        return this.reward.length;
    }

    final boolean isFinished(int param0) {
        if (param0 != -29004) {
          return true;
        }
        return this.finished;
    }

    final static cn e(int param0) {
        if (param0 != -1) {
          CommonChooseReward.e(11);
          return of.a(false, gga.field_M.field_c);
        }
        return of.a(false, gga.field_M.field_c);
    }

    public final String toString() {
        String var4 = "CommonChooseReward[";
        String var5 = var4 + " finished=" + this.finished;
        String var6 = var5 + " takenCount=" + this.takenCount;
        String var7 = var6 + " currentPos=" + this.currentPos;
        String var3 = var7 + " currentPlayerId=" + this.currentPlayerId;
        String var8 = var3;
        String var9 = var8 + " reward={" + this.reward[0] + ", " + this.reward[1] + ", " + this.reward[2] + "}";
        String var10 = var9 + " currentPlayerTicks=" + this.currentPlayerTicks;
        String var1 = var10 + "]";
        return var1;
    }

    final void d(byte param0) {
        if (param0 != -124) {
          field_b = -84L;
          if (this.finished) {
            return;
          }
          if (this.field_g == null) {
            if (-1 != this.currentPlayerId) {
              this.currentPlayerTicks = this.currentPlayerTicks + 1;
              return;
            }
            this.d(-14447);
            this.currentPlayerTicks = this.currentPlayerTicks + 1;
            return;
          }
          this.field_g.a(108, false);
          if (-1 == this.currentPlayerId) {
            this.d(-14447);
            this.currentPlayerTicks = this.currentPlayerTicks + 1;
            return;
          }
          this.currentPlayerTicks = this.currentPlayerTicks + 1;
          return;
        }
        if (this.finished) {
          return;
        }
        if (this.field_g != null) {
          this.field_g.a(108, false);
          if (-1 != this.currentPlayerId) {
            this.currentPlayerTicks = this.currentPlayerTicks + 1;
            return;
          }
          this.d(-14447);
          this.currentPlayerTicks = this.currentPlayerTicks + 1;
          return;
        }
        if (-1 != this.currentPlayerId) {
          this.currentPlayerTicks = this.currentPlayerTicks + 1;
          return;
        }
        this.d(-14447);
        this.currentPlayerTicks = this.currentPlayerTicks + 1;
    }

    final int getCurrentPlayerId(int param0) {
        if (param0 != -1) {
          this.a(-107, 98);
          return this.currentPlayerId;
        }
        return this.currentPlayerId;
    }

    public final void a(BitPacketBuffer param0, boolean param1) {
        try {
          this.reward = fa.a(0, param0, 8, this.reward);
          this.currentPos = param0.readBits((byte) 44, 3);
          this.currentPlayerId = uma.a(4, param0, -26803);
          this.currentPlayerTicks = param0.readBits((byte) 44, 16);
          if (param1) {
            this.a(99, -112);
          }
          this.finished = CircleMovementLocomotor.a(5907, param0);
          this.takenCount = param0.readBits((byte) 44, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cfa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        int var3 = -121 % ((48 - param0) / 59);
        return this.reward[param1] != -1 ? true : false;
    }

    CommonChooseReward() {
        this.currentPlayerId = -1;
        this.takenCount = 0;
    }

    CommonChooseReward(MatchState param0) {
        this.currentPlayerId = -1;
        this.takenCount = 0;
        try {
          this.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        int var4 = 0;
        IsaacCipher var2;
        boolean[] var3;
        int var5;
        int var6;
        BitPacketBuffer var7;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = new IsaacCipher(new int[]{this.field_j.field_C});
        this.reward = new int[3];
        var3 = new boolean[7];
        for (var4 = 0; this.reward.length > var4; var4++) {
          var5 = var2.a(7, param0 ^ 28624);
          while (var3[var5]) {
            var5++;
            if (var5 < 7) {
              continue;
            }
            var5 = 0;
          }
          this.reward[var4] = var5;
          var3[var5] = true;
        }
        if (param0 == 28624) {
          return;
        }
        var7 = (BitPacketBuffer) null;
        this.a((BitPacketBuffer) null, false);
    }

    final void a(byte param0) {
        if (null != this.field_g) {
          this.field_g.a(new fm(61, 0, 0, 0), -58);
          if (param0 >= -44) {
            this.reward = (int[]) null;
            return;
          }
          return;
        }
        if (param0 < -44) {
          return;
        }
        this.reward = (int[]) null;
    }

    static {
        field_b = 1180282300L;
    }
}
