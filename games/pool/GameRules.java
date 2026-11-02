/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameRules {
    static int[] field_a;
    static int field_b;
    PoolGameModel field_d;
    static no field_c;

    abstract int a(boolean param0);

    int e(int param0) {
        if (param0 <= 64) {
          this.field_d = (PoolGameModel) null;
        }
        return this.field_d.playerCount;
    }

    final static boolean k(int param0) {
        if (param0 != 0) {
          String var2 = (String) null;
          GameRules.a((String[]) null, false, -52, (String) null);
        }
        return ie.a((byte) 28, hk.d(71));
    }

    void a(ShotRecord param0, boolean param1) {
        RuntimeException runtimeException = null;
        ShotRecord stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.field_z = this.a(-1);
          stackIn_3_0 = (ShotRecord) (param0);
          stackIn_4_1 = (0 == param0.field_u) && (this.a(param0.field_L, -35));
          stackIn_3_0.field_E = stackIn_4_1;
          if (param1) {
            this.field_d = (PoolGameModel) null;
          }
          param0.field_I = this.j(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("sq.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract int a(int param0);

    abstract int[] a(int param0, byte param1);

    abstract boolean a(int param0, byte param1, ShotRecord param2);

    abstract int i(int param0);

    abstract int b(int param0);

    void n(int param0) {
        if (param0 != 11828) {
          this.field_d = (PoolGameModel) null;
        }
    }

    abstract int h(int param0);

    final void l(int param0) {
        ShotRecord var2 = this.field_d.currentShot(45);
        var2.field_u = this.b(-120);
        int var3 = -67 % ((param0 + 14) / 58);
        if (!(0 > var2.field_L)) {
          this.a(var2, false);
        }
    }

    abstract boolean c(ShotRecord param0, int param1);

    int c(int param0, int param1) {
        if (param0 >= -36) {
          GameRules.k(73);
        }
        return param1;
    }

    abstract boolean f(int param0);

    abstract byte b(int param0, int param1);

    public static void d(int param0) {
        field_a = null;
        if (param0 != 13) {
          String var2 = (String) null;
          GameRules.a((String[]) null, false, 81, (String) null);
        }
        field_c = null;
    }

    abstract Sprite b(ShotRecord param0, int param1);

    int m(int param0) {
        if (param0 != 0) {
          field_a = (int[]) null;
          return 0;
        }
        return 0;
    }

    final static void b(byte param0) {
        PoolGameModel.field_B = new BallSkin[7];
        PoolGameModel.field_B[0] = (BallSkin) ((Object) new ClassicBallSkin());
        PoolGameModel.field_B[1] = (BallSkin) ((Object) new PlasmaBallSkin());
        PoolGameModel.field_B[2] = (BallSkin) ((Object) new TikiBallSkin());
        PoolGameModel.field_B[3] = (BallSkin) ((Object) new PolarBallSkin());
        if (param0 != 118) {
          GameRules.k(35);
        }
        PoolGameModel.field_B[4] = (BallSkin) ((Object) new SpaceBallSkin());
        PoolGameModel.field_B[5] = (BallSkin) ((Object) new KillerBallSkin());
        PoolGameModel.field_B[6] = (BallSkin) ((Object) new HalloweenBallSkin());
    }

    int a(ShotRecord param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = (1 + param0.field_L) % this.field_d.playerCount;
          var4 = 1;
          while (var4 <= this.field_d.playerCount) {
            var3_int = (var4 + param0.field_L) % this.field_d.playerCount;
            if (!this.a((byte) -112, var3_int) ||
              (this.field_d.field_p & 1 << var3_int) != 0) {
              var4++;
              continue;
            }
            break;
          }
          if (param1 < 82) {
            field_b = 82;
          }
          stackIn_9_0 = var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sq.I(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract boolean a(int param0, int param1);

    final static int g(int param0) {
        if (param0 <= 107) {
          GameRules.k(-99);
        }
        return or.field_b;
    }

    final static void a(String[] args, boolean param1, int param2, String param3) {
        String[] var5 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        try {
          if (param1) {
            field_b = 100;
          }
          pa.field_I = td.field_f;
          if (param2 != 255) {
            if (param2 >= 100 &&
              param2 <= 105) {
              var4 = args;
              gf.a(92, var4);
              PoolMatchController.field_gb = jo.a(args, 57);
              return;
            }
            PoolMatchController.field_gb = gg.a(param2, true, param3);
          } else {
            stackIn_6_0 = !(j.field_b >= 13);
            PoolMatchController.field_gb = ta.a(stackIn_6_0, -30914);
            var5 = (String[]) null;
            gf.a(108, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("sq.S(");
          if (args == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void c(int param0);

    GameRules(PoolGameModel param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(byte param0, int param1) {
        int var3 = 35 % ((-16 - param0) / 46);
        return true;
    }

    void a(PacketBuffer param0, boolean param1) {
        try {
          if (!param1) {
            this.a(-101);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sq.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    String a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        StringBuilder var4 = null;
        int var6 = 0;
        String stackIn_6_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          if (param0 >= this.field_d.playerCount) {
            return null;
          }
          if (this.field_d.playerCount == 2) {
            stackIn_6_0 = nr.a(param1, param0 ^ -2, w.playerVsPlayer);
            return stackIn_6_0;
          }
          var3_int = 0;
          for (var4_int = 0; param1.length > var4_int; var4_int++) {
            if (var4_int > 0) {
              var3_int += 4;
            }
            var3_int = var3_int + param1[var4_int].length();
          }
          var4 = new StringBuilder(var3_int);
          for (var5 = 0; param1.length > var5; var5++) {
            if (var5 > 0) {
              discarded$2 = var4.append("<br>");
            }
            discarded$3 = var4.append(param1[var5]);
          }
          stackIn_19_0 = var4.toString();
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("sq.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    abstract int a(byte param0);

    int b(byte param0, int param1) {
        if (param0 >= -113) {
          field_a = (int[]) null;
        }
        return 1 << param1;
    }

    int j(int param0) {
        if (param0 != 0) {
          return 82;
        }
        return -1;
    }

    void a(int param0, int param1, int param2) {
        if (param1 != -1) {
          this.j(100);
        }
    }

    abstract boolean a(int param0, byte param1, int param2);

    abstract int a(ShotRecord param0, int param1);

    static {
        field_a = new int[4];
    }
}
