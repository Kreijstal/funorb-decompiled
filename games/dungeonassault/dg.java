/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends da {
    static int[][] field_L;
    private int field_J;
    private int field_I;
    static String field_G;
    static int field_H;
    static String[] field_O;
    private int field_F;
    private String field_K;
    private boolean field_N;
    static String field_P;
    private se field_M;

    dg(int param0, int param1, int param2, int param3, lm param4, boolean param5, int param6, int param7, se param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ca) null, (pg) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          stackIn_4_1 = (param5);
          this.field_N = stackIn_4_1;
          this.field_D = param4;
          this.field_I = param9;
          this.field_J = param6;
          this.field_M = param8;
          this.field_K = param10;
          this.field_F = param7;
          var12_int = this.field_J - this.field_F;
          var13 = this.field_M.a(param10, var12_int, this.field_M.field_H) + this.field_F * 2;
          if (var13 > param3) {
            this.b(0, param2, param1, param0, var13);
          } else {
            var13 = param3;
          }
          if (!this.field_N) {
            stackIn_10_0 = this.field_J + this.field_F * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_D.b(0, -this.field_J + (param2 - this.field_F * 3), this.field_F + (var13 - param3 >> 1), var14, param3 - 2 * this.field_F);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("dg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var5 = param1 + this.field_q;
        int var6 = this.field_v + param3;
        super.a(param0, param1, 0, param3);
        if (param0 == param2) {
          var7 = this.field_N ? -(2 * this.field_F) + (-this.field_J + this.field_x) : 0;
          this.field_M.a(this.field_K, this.field_F + (var7 + var5), var6 + this.field_F, -this.field_F + this.field_J, this.field_s - this.field_F * 2, this.field_I, -1, this.field_N ? 0 : 2, 1, this.field_M.field_H);
          return;
        }
    }

    final String c(byte param0) {
        int var2 = this.field_D.field_u ? 1 : 0;
        this.field_D.field_u = this.field_u;
        String var3 = this.field_D.c((byte) 25);
        this.field_D.field_u = var2 != 0 ? true : false;
        if (param0 >= 3) {
          return var3;
        }
        this.a(127, 20, 104, -29);
        return var3;
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_O = null;
        field_G = null;
        field_P = null;
        field_L = (int[][]) null;
    }

    static {
        field_O = new String[]{null, "The rooms you can place are shown in the panel on the left. <%highlight>More types of room will become available as you gain Renown</col>. Click a room to select it and review its statistics and description. You can then place the room by <col=FF0000>left-clicking somewhere in your dungeon</col>. Placing a room on top of an existing one will cause it to be replaced - you will receive some of the room's original cost in return.<br><br><%command>Select a room from the left and place it in your dungeon.</col>"};
        field_H = 1;
        field_P = "Loading music";
        field_G = "You are charging <%0> Orbs of Mastery!";
    }
}
