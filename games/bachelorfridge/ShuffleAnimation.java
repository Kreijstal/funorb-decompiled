/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShuffleAnimation extends EventAnimation {
    static long field_v;
    private boolean field_y;
    private ShuffleEvent field_x;
    private ad[] field_z;
    private boolean field_w;

    final boolean c(byte param0) {
        int var2;
        int var4;
        ad var5;
        int var6;
        ad[] var7;
        int var8;
        ad[] var9;
        ad var10;
        ad var11;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        var6 = BachelorFridge.field_y;
        if (this.field_m.isLinked((byte) -106)) {
          return false;
        }
        if (this.field_y) {
          if (!this.field_w) {
            this.field_w = true;
            aba.a((byte) 122, 60);
          }
          var2 = 1;
          var9 = this.field_z;
          for (var4 = 0; var4 < var9.length; var4++) {
            var10 = var9[var4];
            var10.field_p = var10.field_p + 2;
            if (var10.field_p < 256) {
              var2 = 0;
            } else {
              var10.field_p = 256;
            }
          }
          if (var2 == 0) {
            return false;
          }
          this.d(0);
          return true;
        }
        if (!this.field_w) {
          this.field_w = true;
          aba.a((byte) -96, 60);
        }
        var2Lifetime1 = 1;
        var7 = this.field_z;
        var8 = 0;
        var4Lifetime1 = var8;
        while (var8 < var7.length) {
          var11 = var7[var8];
          var5 = var11;
          var11.field_p = var11.field_p + 2;
          if (0 <= var11.field_p) {
            var5.field_p = 0;
          } else {
            var2Lifetime1 = 0;
          }
          var8++;
        }
        if (var2Lifetime1 == 0) {
          return false;
        }
        this.e(2147483647);
        var2Lifetime2 = 108 % ((71 - param0) / 47);
        return false;
    }

    private final void d(int param0) {
        int var3 = 0;
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        ad[] var6 = this.field_z;
        ad[] var2 = var6;
        for (var3 = param0; var6.length > var3; var3++) {
          var4 = var6[var3];
          var4.field_p = 0;
        }
    }

    ShuffleAnimation(gj param0, ShuffleEvent param1) {
        super(param0, param1);
        int var3_int = 0;
        PlaceCreatureEffect var4 = null;
        int var5 = 0;
        int var7 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5Lifetime1;
        this.field_w = false;
        try {
          this.field_x = param1;
          var3_int = this.field_x.effects.g(0);
          this.field_z = new ad[var3_int];
          var4 = (PlaceCreatureEffect) (this.field_x.effects.b((byte) 90));
          var5 = 0;
          var7 = 0;
          var5Lifetime1 = var7;
          while (var4 != null) {
            this.field_z[var7] = var4.target.a(-27449, this.screen);
            this.field_z[var7].field_p = -256;
            var4 = (PlaceCreatureEffect) (this.field_x.effects.c(0));
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("om.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(gs param0, byte param1) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        BattleState var5 = null;
        ik var6 = null;
        String var7 = null;
        ik var8 = null;
        String var9 = null;
        ik var10 = null;
        String var11 = null;
        ik var12 = null;
        String var13 = null;
        ik var14 = null;
        try {
          if (1 == param0.field_p) {
            stackIn_3_0 = param0.field_d;
          } else {
            stackIn_3_0 = 0;
          }
          SleepEvent.a(stackIn_3_0, (int[]) null, param0.field_a, param0.field_e, param0.field_g, param0.field_p, -113, (sga) null, param0.field_h);
          if (param0.field_p == 0 &&
            !hs.a(-75) &&
            SnowAnimation.field_w == null &&
            EffectBatch.field_n == null) {
            if (!sea.field_j) {
              var6 = NetworkGameClient.field_u;
              var7 = or.field_j;
              var6.field_a.a(var7, true, 14);
            }
            var8 = NetworkGameClient.field_u;
            var9 = gea.field_f;
            var8.field_a.a(var9, true, 20);
          }
          if (param0.field_p == 1 &&
            !hs.a(125) &&
            null != SnowAnimation.field_w &&
            param0.field_d == SnowAnimation.field_w.f((byte) -106)) {
            if (!sea.field_j) {
              var10 = NetworkGameClient.field_u;
              var11 = ama.field_k;
              var10.field_a.a(var11, true, 14);
            }
            var12 = NetworkGameClient.field_u;
            var13 = ma.field_k;
            var12.field_a.a(var13, true, 20);
          }
          NetworkGameClient.field_u.b(true);
          NetworkGameClient.field_u.a(114, false);
          NetworkGameClient.field_u.a(param0.field_o, (byte) -127, param0.field_p);
          NetworkGameClient.field_u.a(21654);
          NetworkGameClient.field_u.a(-120, param0);
          var14 = NetworkGameClient.field_u;
          var3 = nfa.field_a;
          var4 = jc.field_r;
          var14.field_a.a(0, false, var3, 0, var4);
          if (param1 > -43) {
            var5 = (BattleState) null;
            ShuffleAnimation.a(45, (byte) 61, 72, false, 85, (BattleCreature) null, 59, (BattleState) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("om.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        BattleCreature var2 = this.field_x.creature.a(107, this.screen.field_h);
        if (var2.isDown(param0 - 2147483560)) {
          return;
        }
        if (param0 != 2147483647) {
          this.e(-47);
        }
        PlaceCreatureEffect var3 = (PlaceCreatureEffect) (this.field_x.effects.b((byte) 90));
        while (var3 != null) {
          var4 = var3.target.a(param0 ^ -2147456200, this.screen);
          var4.field_s.tileY = var3.field_m;
          var4.field_s.tileX = var3.field_l;
          this.screen.b(var4, (ad) null, true);
          var3 = (PlaceCreatureEffect) (this.field_x.effects.c(0));
        }
        this.field_w = false;
        this.field_y = true;
    }

    final static gha b(boolean param0) {
        if (null == gk.field_e) {
          gk.field_e = new gha(oc.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, oc.field_l.field_u, -1, 2147483647, true);
        }
        if (param0) {
          return (gha) null;
        }
        return gk.field_e;
    }

    final static int a(int param0, byte param1, int param2, boolean param3, int param4, BattleCreature param5, int param6, BattleState param7) {
        int stackIn_32_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        gs var13 = null;
        var12 = BachelorFridge.field_y;
        try {
          var8_int = 0;
          var9 = 1;
          scanLoop1: while (true) {
            if (param4 >= var9) {
              var10 = null;
              var11 = param0;
              if (var11 != 2) {
                if (var11 == 1) {
                  if (-var9 + param2 >= 0) {
                    var10 = param7.tiles[param6][-var9 + param2];
                  }
                } else {
                  if (4 == var11) {
                    if (param7.width > var9 + param6) {
                      var10 = param7.tiles[param6 + var9][param2];
                    }
                  } else {
                    if (var11 == 3 &&
                      var9 + param2 < param7.height) {
                      var10 = param7.tiles[param6][var9 + param2];
                    }
                  }
                }
              } else {
                if (param6 - var9 >= 0) {
                  var10 = param7.tiles[-var9 + param6][param2];
                }
              }
              if (var10 != null &&
                param5.a(((BoardTile) (var10)).terrain, false)) {
                if (((BoardTile) (var10)).occupant == null) {
                  var8_int = var9;
                } else {
                  if (param3) {
                    break scanLoop1;
                  }
                }
                var9++;
                continue;
              }
            }
            break;
          }
          if (param1 <= 11) {
            var13 = (gs) null;
            ShuffleAnimation.a((gs) null, (byte) -115);
          }
          stackIn_32_0 = var8_int;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_35_0 = var8;
          stackIn_35_1 = new StringBuilder().append("om.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
    }
}
