/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerVote implements DiffableState {
    int option;
    static IntrusiveDeque field_c;
    static Object field_b;
    boolean unvote;
    static int field_f;
    static String field_d;

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        PlayerVote var6 = null;
        PlayerVote var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (PlayerVote) (param1);
          var7 = var6;
          var7.unvote = this.unvote;
          var7.option = this.option;
          if (param0 > 54) {
            return;
          }
          var4 = (tv) null;
          this.b((byte) -57, (tv) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("dv.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 >= 97) {
          SetAiFiringRangeUpshift.a(param5, param4, param1, (byte) -122, 31, param2, param0);
          return;
        }
        PlayerVote.a((byte) -23);
        SetAiFiringRangeUpshift.a(param5, param4, param1, (byte) -122, 31, param2, param0);
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        PlayerVote var6 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (PlayerVote) (other);
          if (obfuscationGuard > -19) {
            var5 = (tv) null;
            this.a((byte) -95, (tv) null);
          }
          var4 = 0;
          if (var6.option != this.option) {
            var4 = 1;
            System.out.println("int option has changed. before=" + var6.option + ", now=" + this.option);
          }
          if (var6.unvote != this.unvote) {
            System.out.println("boolean unvote has changed. before=" + var6.unvote + ", now=" + this.unvote);
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of PlayerVote has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("dv.F(");
          if (other == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.option = param0.i(0, 32);
          this.unvote = kv.a(param1, param0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dv.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.option, 32);
          vq.a(param0, -70, this.unvote);
          if (param1 >= -109) {
            this.unvote = false;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "dv.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        PlayerVote var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_4_1 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3 = (PlayerVote) (param1);
          var4 = 9 % ((param0 - 22) / 59);
          if (this.option == var3.option) {
            stackIn_3_0 = this.unvote;
            if (var3.unvote) {
              stackIn_4_1 = 0;
            } else {
              stackIn_4_1 = 1;
            }
            if ((stackIn_3_0 ? 1 : 0) != stackIn_4_1) {
              stackIn_7_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_7_0 = true;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("dv.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -98) {
          field_c = (IntrusiveDeque) null;
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    PlayerVote() {
    }

    PlayerVote(int param0, boolean param1) {
        this.option = param0;
        this.unvote = param1 ? true : false;
    }

    static {
        field_c = new IntrusiveDeque();
        field_d = "Fastest";
    }
}
