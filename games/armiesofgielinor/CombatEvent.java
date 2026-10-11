/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CombatEvent extends GameEvent {
    private int field_y;
    int field_Q;
    static int[] field_L;
    boolean field_N;
    private boolean field_E;
    boolean field_M;
    int field_G;
    int field_K;
    int battleId;
    int field_R;
    static int[] field_A;
    static je field_I;
    boolean field_J;
    private int field_z;
    int field_F;
    static int field_P;
    int field_B;
    static String field_O;
    private int field_H;

    public static void e(byte param0) {
        field_A = null;
        if (param0 < -122) {
          field_O = null;
          field_L = null;
          field_I = null;
          return;
        }
        field_O = (String) null;
        field_O = null;
        field_L = null;
        field_I = null;
    }

    final static void a(int param0, int param1, int param2) {
        CipherPacketBuffer var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, 3);
        var3.b(1, 8);
        if (param1 <= -41) {
          var3.b(true, param2);
          return;
        }
        CombatEvent.e((byte) 75);
        var3.b(true, param2);
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        int var4 = -122 / ((53 - obfuscationGuard) / 51);
        String var3Lifetime1;
        if (verbose) {
          System.out.println("Combat event debug");
          System.out.println("Attacker at " + this.field_Q + "," + this.field_G);
          System.out.println("Attacks " + (this.field_Q + this.field_F) + "," + (this.field_G + this.field_B));
          System.out.println("Attacker deals " + this.field_K + " damage");
          System.out.println("Defender deals " + this.field_R + " damage");
          if (this.field_N) {
            System.out.println("Attacker dies");
          }
          if (this.field_M) {
            System.out.println("Defender dies");
          }
          System.out.println(this.field_H + " attackers in anim");
          System.out.println(this.field_y + " defenders in anim");
          System.out.println("Unseen type is" + this.field_z);
          var3 = "EventCombat: creature: " + this.field_z + ", com:(" + this.field_Q + "," + this.field_G + ")" + ", att:(" + this.field_F + "," + this.field_B + ")" + ", dam:(" + this.field_K + "," + this.field_R + ")" + "\n" + "die:(" + this.field_N + "," + this.field_M + ")" + ", count:(" + this.field_H + "," + this.field_y + ")" + ", deployed:(" + this.field_J + "," + this.field_E + ")" + ", battleid:" + this.battleId;
          return var3;
        }
        var3Lifetime1 = "EventCombat: creature: " + this.field_z + ", com:(" + this.field_Q + "," + this.field_G + ")" + ", att:(" + this.field_F + "," + this.field_B + ")" + ", dam:(" + this.field_K + "," + this.field_R + ")" + "\n" + "die:(" + this.field_N + "," + this.field_M + ")" + ", count:(" + this.field_H + "," + this.field_y + ")" + ", deployed:(" + this.field_J + "," + this.field_E + ")" + ", battleid:" + this.battleId;
        return var3Lifetime1;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        boolean stackIn_34_0 = false;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Unit var5 = null;
        Unit var6 = null;
        try {
          var6 = param2.battlefield.getUnitAt(this.field_G, true, this.field_Q);
          if (param1 > -84) {
            this.field_G = -99;
          }
          var5 = param2.battlefield.getUnitAt(this.field_B + this.field_G, true, this.field_Q + this.field_F);
          if (this.field_B * this.field_B + this.field_F * this.field_F != 1) {
            if (var6 != null) {
              var6.e(118, 2048 - (int)(2048.0 * Math.atan2((double)this.field_B, (double)(-this.field_F)) / 3.141592653589793 / 2.0) + 256 & 2047);
            }
          } else {
            if (var6 != null) {
              if (this.field_F > 0) {
                var6.e(74, 1280);
              }
              if (this.field_B > 0) {
                var6.e(-118, 1792);
              }
              if (this.field_F < 0) {
                var6.e(-127, 256);
              }
              if (this.field_B < 0) {
                var6.e(-122, 768);
              }
            }
            if (var5 != null) {
              if (this.field_F > 0) {
                var5.e(72, 256);
              }
              if (this.field_B > 0) {
                var5.e(-117, 768);
              }
              if (this.field_F < 0) {
                var5.e(-121, 1280);
              }
              if (this.field_B < 0) {
                var5.e(3, 1792);
              }
            }
          }
          param2.d(this.battleId, 4);
          if (!uc.field_a) {
            stackIn_34_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_34_0;
          }
          param2.e(this.battleId, -56);
          this.applyToBattlefield(param2.battlefield, -26661);
          param2.a(true, var6);
          this.c((byte) -125);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("ag.A(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        try {
          battlefield.a(this.field_G, this.field_F, this.field_N, this.field_Q, this.field_B, 111, this.field_M, this.field_K, this.field_R, this.field_z);
          hf.a(battlefield, (byte) 9, true);
          if (obfuscationGuard != -26661) {
            this.field_B = -38;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "ag.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static java.applet.Applet d(byte param0) {
        if (null != la.field_g) {
          return la.field_g;
        }
        int var1 = 90 % ((param0 + 67) / 44);
        return (java.applet.Applet) ((Object) lr.field_a);
    }

    CombatEvent(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11, boolean param12, int param13) {
        this.field_m = 1;
        this.field_K = param5;
        this.battleId = param13;
        this.field_J = param11 ? true : false;
        this.field_y = param10;
        this.field_G = param2;
        this.field_F = param3;
        this.field_N = param7 ? true : false;
        this.field_R = param6;
        this.field_E = param12 ? true : false;
        this.field_H = param9;
        this.field_M = param8 ? true : false;
        this.field_z = param0;
        this.field_B = param4;
        this.field_Q = param1;
    }

    static {
        field_L = new int[4];
        field_A = new int[5];
        field_O = "To Customer Support";
        field_P = 0;
    }
}
