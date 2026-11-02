/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Nebula implements DiffableState {
    static int field_b;
    private int x;
    private int y;

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        Nebula var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (Nebula) (other);
          var4 = 0;
          if (this.x != var5.x) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
          }
          if (var5.y != this.y) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
          }
          if (var4 != 0) {
            System.out.println("This instance of Nebula has changed");
          }
          if (obfuscationGuard < -19) {
            return;
          }
          this.x = -50;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qob.F(");
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        Nebula var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (Nebula) (param1);
          var4 = -105 % ((param0 - 22) / 59);
          stackIn_5_0 = (var3.x != this.x) || (var3.y != this.y);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("qob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = -119 / ((param0 + 46) / 50);
        if (SetPointDefenceLaserAimarc.field_o != null) {
          SetPointDefenceLaserAimarc.field_o.l((byte) -106);
        }
        fib.field_j = new waa();
        GetMissionVariablesHudX.field_o.b(fib.field_j, -116);
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qob.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(vu param0, int param1, vu param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var3_int = -param0.field_yb + param2.field_yb;
          if (param2.field_Ab != kbb.field_q) {
            if (null == param2.field_Ab) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1 != 7569) {
            Nebula.a(-48);
          }
          if (kbb.field_q != param0.field_Ab) {
            if (param0.field_Ab == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("qob.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          this.x = 7;
          return this.x;
        }
        return this.x;
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 == 100) {
          var4 = -this.x + param1;
          var5 = -this.y + param2;
          var6 = ar.a(var4, (byte) 105, var5);
          return var6 < 32768 ? true : false;
        }
        return true;
    }

    final int getY(byte param0) {
        if (param0 >= -49) {
          return 42;
        }
        return this.y;
    }

    private final int a(int param0, boolean param1) {
        if (param1) {
          return 8192 * (-(param0 % 3) + 3);
        }
        field_b = 68;
        return 8192 * (-(param0 % 3) + 3);
    }

    public final void b(byte param0, tv param1) {
        Nebula var5 = null;
        Nebula var6 = null;
        try {
          if (param0 < 54) {
            this.a(false);
          }
          var5 = (Nebula) (param1);
          var6 = var5;
          var6.x = this.x;
          var6.y = this.y;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qob.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    Nebula() {
    }

    Nebula(int param0, int param1) {
        this.y = param1;
        this.x = param0;
    }

    final void a(Ship param0, int param1, int param2, lta param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aja var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var6_int = param4 % 16 - 8;
          var7 = param3.b(this.x + (GetNumStars.a(param2 * var6_int << 1, (byte) -127) >> 4), -125);
          var8 = param3.c(0, this.y + (eu.a(param2 * var6_int << 1, 116) >> 4));
          if (param1 <= 42) {
            return;
          }
          var9 = this.a(param4, true);
          var10 = 200;
          var11 = 7842355;
          if (li.field_i &&
            1 == GetUseSprites.field_o) {
            var12 = param4 % 3 + 8;
            var13 = mmb.field_d[var12];
            var14 = (int)((float)var9 * param3.field_a * 4.0f);
            var15 = (int)var7 - (var14 >> 1);
            var16 = -(var14 >> 1) + (int)var8;
            var17 = var9 << 1;
            if (param3.field_f[0] <= this.x + var17 &&
              -var17 + this.x < param3.field_f[1] &&
              this.y + var17 >= param3.field_f[2] &&
              param3.field_f[3] > this.y - var17) {
              var13.a(var15, var16, var14, var14, 2, var11, 1);
              return;
            }
            return;
          }
          SetMissileLauncherEnergyUsed.a(var11, (byte) 7, (int)var8, param3.field_a * (float)var9, var10, (int)var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("qob.L(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 64;
    }
}
