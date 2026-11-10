/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerSimulation {
    private boolean field_h;
    private int[] field_j;
    private int field_e;
    Player player;
    eha field_i;
    private boolean field_a;
    Room[] rooms;
    private int field_l;
    private boolean field_k;
    int tick;
    static String field_n;
    private boolean field_f;
    private int field_m;
    private int field_d;

    private final Room a(byte param0, Room param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Room stackIn_2_0 = null;
        Room stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 68) {
            stackIn_2_0 = (Room) null;
            return stackIn_2_0;
          }
          var3_int = param1.c(115);
          if (var3_int >= this.rooms.length - 1) {
            return null;
          }
          stackIn_6_0 = this.rooms[1 + var3_int];
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("dt.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean c(int param0, int param1) {
        if (param1 != -1) {
          this.rooms = (Room[]) null;
          return -1 != this.field_j[param0] ? true : false;
        }
        return -1 != this.field_j[param0] ? true : false;
    }

    final void d(int param0, int param1) {
        int var3 = -110 % ((param0 - 73) / 33);
    }

    final void a(Room param0, int param1) {
        eha var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != -9774) {
            this.a(false);
          }
          this.field_f = false;
          this.field_h = true;
          var3 = this.m(9262);
          if (var3 != null) {
            var3.a(35, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("dt.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean f(int param0, int param1) {
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        if (param1 != 10915) {
          this.b(false);
          if (this.c(param0, -1)) {
            return true;
          }
          stackIn_6_0 = !(!this.rooms[this.player.r(param1 ^ -10957)].b(param0, (byte) -44));
          return stackIn_6_0;
        }
        if (this.c(param0, -1)) {
          stackIn_12_0 = true;
        } else {
          if (this.rooms[this.player.r(param1 ^ -10957)].b(param0, (byte) -44)) {
            return true;
          }
          stackIn_12_0 = false;
        }
        return stackIn_12_0;
    }

    final int a(boolean param0) {
        if (this.field_a) {
          return 0;
        }
        if (!param0) {
          return -119;
        }
        return this.player.f((byte) -88).field_a;
    }

    final int l(int param0) {
        if (param0 > -2) {
          return 8;
        }
        return this.field_m;
    }

    final boolean g(int param0) {
        if (param0 < 67) {
          this.j(84);
          return this.field_f;
        }
        return this.field_f;
    }

    final boolean b(int param0) {
        if (param0 != 0) {
          field_n = (String) null;
          return this.field_a;
        }
        return this.field_a;
    }

    final boolean i(int param0) {
        if (param0 != -14886) {
          this.field_k = true;
          return this.field_h;
        }
        return this.field_h;
    }

    final void a(int param0, boolean param1) {
        this.field_a = param1 ? true : false;
        if (param0 <= 35) {
          this.field_l = 58;
        }
    }

    final void a(Player param0, int param1, int param2, int param3) {
        eha var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          var5 = this.m(9262);
          if (var5 != null) {
            var5.a(15, param0, param1, param0.f((byte) -96), this.tick, param3);
          }
          if (param2 != 1) {
            this.d(18, 84);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("dt.IA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          PlayerSimulation.releaseStatics(-118);
          field_n = null;
          return;
        }
        field_n = null;
    }

    final boolean e(int param0) {
        if (param0 != -31170) {
          return false;
        }
        return this.field_k;
    }

    final boolean j(int param0) {
        if (param0 != 0) {
          this.field_m = 36;
          return this.field_a;
        }
        return this.field_a;
    }

    final int b(boolean param0) {
        if (param0) {
          field_n = (String) null;
          return this.field_l;
        }
        return this.field_l;
    }

    final boolean d(int param0) {
        if (param0 != 28091) {
          return true;
        }
        return this.field_d > 0 ? true : false;
    }

    final void a(int param0, int param1) {
        Room discarded$2 = null;
        if (param0 != -1) {
          Room var4 = (Room) null;
          discarded$2 = this.a((byte) -105, (Room) null);
          if (this.field_a) {
            return;
          }
          this.field_f = this.player.d((byte) -95, 3);
          this.field_h = false;
          this.player.f((byte) -64).d(param1, 0);
          if (this.field_a) {
            return;
          }
          this.tick = this.tick + 1;
          return;
        }
        if (this.field_a) {
          return;
        }
        this.field_f = this.player.d((byte) -95, 3);
        this.field_h = false;
        this.player.f((byte) -64).d(param1, 0);
        if (this.field_a) {
          return;
        }
        this.tick = this.tick + 1;
    }

    final void a(int param0, int param1, int param2) {
        this.field_j[param0] = param1;
        if (param2 >= -28) {
          this.player = (Player) null;
        }
    }

    final void c(int param0) {
        Room var2;
        Room var3;
        Room var5;
        eha var6;
        eha var7;
        Room var3Lifetime1;
        var2 = this.a((byte) 123);
        if (param0 == -1) {
          var2.g(58);
          var3 = this.a((byte) 104, var2);
          if (this.player.l(false) &&
            var3 == null) {
            var3 = this.a(param0 - 114);
          }
          var7 = this.m(param0 + 9263);
          if (var7 != null) {
            var7.a(this.player, var2, false);
          }
          if (var3 == null) {
            this.a(89, true);
          } else {
            var3.i((byte) -98);
          }
          return;
        }
        var5 = (Room) null;
        this.a((Room) null, -52);
        var2.g(58);
        var3Lifetime1 = this.a((byte) 104, var2);
        if (this.player.l(false) &&
          var3Lifetime1 == null) {
          var3Lifetime1 = this.a(param0 - 114);
        }
        var6 = this.m(param0 + 9263);
        if (var6 != null) {
          var6.a(this.player, var2, false);
        }
        if (var3Lifetime1 == null) {
          this.a(89, true);
        } else {
          var3Lifetime1.i((byte) -98);
        }
        return;
    }

    final void a(iq param0, int param1) {
        int discarded$1 = 0;
        int var4 = 0;
        Room[] var3 = null;
        Room var5 = null;
        int var6 = 0;
        Room[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = this.rooms;
          var3 = var7;
          if (param1 != -1) {
            discarded$1 = this.e(41, -81);
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.a(param0, param1 ^ -6);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("dt.P(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(Player param0, int param1) {
        eha var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.m(9262);
          if (param1 != -1) {
            return;
          }
          if (var3 != null) {
            var3.a(15, param0, 0, param0.f((byte) -118), this.tick, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("dt.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void dumpState(byte param0) {
        System.out.println("DUMPING STATE on tick " + this.tick);
        System.out.println("Player: " + this.player.toString());
        if (param0 != 114) {
          this.field_k = false;
          this.player.f((byte) 65).dumpDebug(true);
          return;
        }
        this.player.f((byte) 65).dumpDebug(true);
    }

    final boolean k(int param0) {
        if (param0 != -19271) {
          return false;
        }
        if (this.field_a) {
          return false;
        }
        if (this.field_k) {
          return false;
        }
        return true;
    }

    private final int e(int param0, int param1) {
        if (param1 != 0) {
          this.b(-8);
          return this.field_j[param0];
        }
        return this.field_j[param0];
    }

    final Room a(int param0) {
        if (param0 >= -22) {
          this.b(-15);
          return this.rooms[0];
        }
        return this.rooms[0];
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 >= -86) {
          iq var6 = (iq) null;
          this.a((iq) null, 103);
          this.rooms[param3].b(false, param1, param0);
          return;
        }
        this.rooms[param3].b(false, param1, param0);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -11) {
          this.a(96, 125);
          this.rooms[param2].c(-22490, param1);
          return;
        }
        this.rooms[param2].c(-22490, param1);
    }

    final int b(boolean param0, int param1) {
        if (param0) {
          this.a((byte) 29, -34, 71);
          return iia.d(this.e(param1, 0), this.rooms[this.player.r(-101)].a(-121, param1), 2);
        }
        return iia.d(this.e(param1, 0), this.rooms[this.player.r(-101)].a(-121, param1), 2);
    }

    final boolean h(int param0) {
        if (param0 < 118) {
          this.field_h = true;
          return !this.field_a ? true : false;
        }
        return !this.field_a ? true : false;
    }

    final Room a(byte param0) {
        int var2 = -127 / ((param0 - 64) / 59);
        return this.rooms[this.player.r(-108)];
    }

    final int f(int param0) {
        int var2 = -97 % ((34 - param0) / 56);
        return this.rooms.length;
    }

    final void a(int param0, int param1, Room param2) {
        try {
          param2.a(param1, false);
          if (param0 != -28088) {
            this.d(41);
          }
          this.rooms[param1] = param2;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "dt.V(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final eha m(int param0) {
        if (param0 != 9262) {
          this.d(36);
          return this.field_i;
        }
        return this.field_i;
    }

    final void b(int param0, int param1) {
        this.field_j[param0] = param1;
    }

    final Room a(boolean param0, int param1) {
        if (!param0) {
          return (Room) null;
        }
        return this.rooms[param1];
    }

    PlayerSimulation(eha param0, Player param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        this.field_j = new int[9];
        try {
          this.field_e = param2;
          this.player = param1;
          this.field_d = param3;
          this.field_i = param0;
          this.field_m = this.field_d + this.field_e;
          this.rooms = new Room[this.field_m];
          for (var5_int = 0; var5_int < this.field_j.length; var5_int++) {
            this.field_j[var5_int] = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("dt.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_n = "Please wait...";
    }
}
