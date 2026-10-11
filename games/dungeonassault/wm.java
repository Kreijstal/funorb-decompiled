/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String[] field_d;
    static String field_j;
    static int field_a;
    static String field_e;
    static volatile int field_g;
    int[] field_f;
    static int field_b;
    static cn field_c;
    static cn field_h;
    static String[] field_i;

    final boolean a(int param0, byte param1) {
        if (param1 < 65) {
          field_d = (String[]) null;
          return (this.field_f[param0 >> 5] & 1 << (param0 & 31)) != 0 ? true : false;
        }
        return (this.field_f[param0 >> 5] & 1 << (param0 & 31)) != 0 ? true : false;
    }

    final wm a(byte param0, wm param1) {
        Object var3 = null;
        wm var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        wm stackIn_3_0 = null;
        wm stackIn_13_0 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var7 = this;
          var3 = var7;
          if (param0 != -53) {
            stackIn_3_0 = (wm) null;
            return stackIn_3_0;
          }
          if (param1.field_f.length < ((wm) (var7)).field_f.length) {
            var3 = param1;
            param1 = this;
          }
          var4 = new wm(32 * param1.field_f.length);
          for (var5 = 0; ((wm) (var3)).field_f.length > var5; var5++) {
            var4.field_f[var5] = nb.a(param1.field_f[var5], ((wm) (var3)).field_f[var5]);
          }
          while (param1.field_f.length > var5) {
            var4.field_f[var5] = param1.field_f[var5];
            var5++;
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) (stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (dj.a(param2 + 6706, param1)) {
            return false;
          }
          if (j.a(param1, (byte) -124)) {
            return false;
          }
          if (sm.a(1, param1)) {
            return false;
          }
          if (param0.length() == 0) {
            return true;
          }
          if (gk.a(param0, param1, 16777215)) {
            return false;
          }
          if (gl.a(param0, param2 ^ -83, param1)) {
            return false;
          }
          if (uo.a((byte) -56, param0, param1)) {
            return false;
          }
          if (param2 == -83) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("wm.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, int param2) {
        vo.field_r = param1;
        if (param0 >= -41) {
          field_e = (String) null;
          bl.field_p = param2;
          return;
        }
        bl.field_p = param2;
    }

    wm(int param0) {
        this.field_f = new int[param0 + 31 >> 5];
    }

    final void a(int param0, int param1) {
        this.field_f[param0 >> 5] = mp.a(this.field_f[param0 >> 5], 1 << nb.a(31, param0));
        if (param1 < -59) {
          return;
        }
        String var4 = (String) null;
        wm.a((String) null, (String) null, (byte) 25);
    }

    wm(wm param0) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = param0.field_f.length;
          this.field_f = new int[var2_int];
          for (var3 = 0; var3 < var2_int; var3++) {
            this.field_f[var3] = param0.field_f[var3];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("wm.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_h = null;
        field_j = null;
        field_i = null;
        if (param0 != 112) {
          field_j = (String) null;
          field_e = null;
          field_d = null;
          return;
        }
        field_e = null;
        field_d = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        for (var2 = 0; this.field_f.length > var2; var2++) {
          this.field_f[var2] = 0;
        }
        if (param0 != 1) {
          field_d = (String[]) null;
          return;
        }
    }

    final void b(int param0, int param1) {
        if (param1 != 31) {
          field_j = (String) null;
          this.field_f[param0 >> 5] = nb.a(this.field_f[param0 >> 5], ~(1 << nb.a(31, param0)));
          return;
        }
        this.field_f[param0 >> 5] = nb.a(this.field_f[param0 >> 5], ~(1 << nb.a(31, param0)));
    }

    static {
        field_d = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Mistress of Magic", "Archmage <%0>", "<%0>, the Corrupted"};
        field_e = "You claim a bounty of <%0> Treasure for reaching the hoard room.";
        field_j = "Guardians";
        field_g = 0;
        field_a = 0;
        field_i = new String[]{"<%0> of the 6M crew", "<%0>, Ultima", "<%0>, Monarch of the Gem", "<%0>, Scourge Elite", "<%0>, the Relentless", "<%0>, Solar Champion", "<%0>, the Reckless", "<%0>, Master of Magic", "Archmage <%0>", "<%0>, the Corrupted"};
    }
}
