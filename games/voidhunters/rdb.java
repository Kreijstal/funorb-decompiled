/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rdb extends IntrusiveNode implements DiffableState {
    private int x;
    private int team;
    private int y;
    static String field_f;

    final int a(boolean param0) {
        if (!param0) {
          this.a(46);
          return this.x;
        }
        return this.x;
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 < -54) {
          var4 = param0 - this.x;
          var5 = param2 - this.y;
          var6 = ar.a(var4, (byte) 106, var5);
          return 51200 > var6 ? true : false;
        }
        return true;
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            this.x = -114;
          }
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.team = param0.i(0, 1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rdb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(lta param0, boolean param1) {
        int var3_int = 0;
        try {
          var3_int = qpb.a(param1, this.team, 13894143);
          SetNumStars.a(param0.field_a * 51200.0f, (byte) 89, param0.b(true, this.y), var3_int, param0.a(this.x, (byte) 121));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rdb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getTeam(int param0) {
        int var2 = 28 % ((param0 - 55) / 49);
        return this.team;
    }

    final void a(int param0, World param1) {
        try {
          if (param0 != 3128) {
            this.a(-54, (byte) 92, -6);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rdb.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            this.y = -98;
          }
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
          param0.a(-632, this.team, 1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rdb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        rdb var6 = null;
        rdb var7 = null;
        try {
          var6 = (rdb) (param1);
          var7 = var6;
          var7.team = this.team;
          var7.x = this.x;
          if (param0 < 54) {
            tv var4 = (tv) null;
            this.a((byte) 14, (tv) null);
          }
          var7.y = this.y;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rdb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -111 % ((param1 + 20) / 61);
        this.team = param0;
    }

    final int a(int param0) {
        if (param0 < 56) {
          this.y = -12;
          return this.y;
        }
        return this.y;
    }

    public static void c(int param0) {
        if (param0 != 51200) {
          field_f = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        rdb var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 28 % ((22 - param0) / 59);
          var4 = (rdb) (param1);
          stackIn_6_0 = (this.x != var4.x) || (var4.y != this.y) || (var4.team != this.team);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("rdb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    rdb() {
    }

    rdb(int param0, int param1, int param2) {
        this.team = param2;
        this.y = param1;
        this.x = param0;
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        rdb var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (rdb) (other);
          if (obfuscationGuard >= -19) {
            return;
          }
          var4 = 0;
          if (this.x != var5.x) {
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
            var4 = 1;
          }
          if (this.y != var5.y) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
          }
          if (var5.team != this.team) {
            System.out.println("int team has changed. before=" + var5.team + ", now=" + this.team);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of SpawnPoint has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("rdb.F(");
          if (other == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_f = "You can ask to join this game";
    }
}
