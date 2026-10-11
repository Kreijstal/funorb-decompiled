/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static lb field_j;
    static int field_e;
    static String[] field_i;
    private ck[] field_d;
    static String field_f;
    static String field_h;
    static wk field_k;
    private ck field_a;
    private int field_b;
    private int field_g;
    private ck field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 54 / ((-11 - param0) / 35);
        field_k = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final void a(long param0, ck param1, int param2) {
        ck var5 = null;
        try {
          if (param1.field_i != null) {
            param1.b(param2 + 1820);
          }
          var5 = this.field_d[(int)(param0 & (long)(this.field_b - 1))];
          param1.field_i = var5.field_i;
          param1.field_k = var5;
          param1.field_i.field_k = param1;
          if (param2 != -1816) {
            uh.c(30);
          }
          param1.field_j = param0;
          param1.field_k.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "uh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        ca.field_r = null;
        dl.field_L = (byte[][]) null;
        rl.field_a = null;
        ba.field_d = null;
        oa.field_M = null;
        le.field_L = null;
        if (param0 != 9324) {
          field_i = (String[]) null;
          return;
        }
    }

    final ck a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        ck var4;
        ck var35;
        ck var36;
        ck var37;
        ck var38;
        ck var41;
        var3 = SteelSentinels.field_G;
        if (param0 > 92) {
          if (this.field_g <= 0) {
            do {
              if (this.field_g >= this.field_b) {
                return null;
              }
              fieldTemp$1 = this.field_g;
              this.field_g = this.field_g + 1;
              var37 = this.field_d[fieldTemp$1].field_k;
            } while (this.field_d[this.field_g - 1] == var37);
            this.field_a = var37.field_k;
            return var37;
          }
          if (this.field_a != this.field_d[-1 + this.field_g]) {
            var41 = this.field_a;
            this.field_a = var41.field_k;
            return var41;
          }
          do {
            if (this.field_g >= this.field_b) {
              return null;
            }
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            var38 = this.field_d[fieldTemp$0].field_k;
          } while (this.field_d[this.field_g - 1] == var38);
          this.field_a = var38.field_k;
          return var38;
        }
        this.field_d = (ck[]) null;
        if (this.field_g <= 0) {
          do {
            if (this.field_g >= this.field_b) {
              return null;
            }
            fieldTemp$3 = this.field_g;
            this.field_g = this.field_g + 1;
            var4 = this.field_d[fieldTemp$3].field_k;
          } while (this.field_d[this.field_g - 1] == var4);
          this.field_a = var4.field_k;
          return var4;
        }
        if (this.field_a != this.field_d[-1 + this.field_g]) {
          var35 = this.field_a;
          this.field_a = var35.field_k;
          return var35;
        }
        do {
          if (this.field_g >= this.field_b) {
            return null;
          }
          fieldTemp$2 = this.field_g;
          this.field_g = this.field_g + 1;
          var36 = this.field_d[fieldTemp$2].field_k;
        } while (this.field_d[this.field_g - 1] == var36);
        this.field_a = var36.field_k;
        return var36;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param0) {
          var3 = param1 >> 31 & -1 + param2;
          return var3 + (param1 + (param1 >>> 31)) % param2;
        }
        field_k = (wk) null;
        var3Lifetime1 = param1 >> 31 & -1 + param2;
        return var3Lifetime1 + (param1 + (param1 >>> 31)) % param2;
    }

    final static void a(int param0, wk[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            return;
          }
          jb.field_S = param1;
          if (null != jb.field_S &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("uh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final ck b(int param0) {
        this.field_g = param0;
        return this.a((byte) 113);
    }

    final ck a(long param0, int param1) {
        ck var5 = null;
        int var6 = SteelSentinels.field_G;
        ck var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_b))];
        this.field_c = var4.field_k;
        while (var4 != this.field_c) {
          if (~this.field_c.field_j == ~param0) {
            var5 = this.field_c;
            this.field_c = this.field_c.field_k;
            return var5;
          }
          this.field_c = this.field_c.field_k;
        }
        if (param1 >= 122) {
          this.field_c = null;
          return null;
        }
        return (ck) null;
    }

    final static gk a(gk param0, int[] param1, boolean param2) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        gk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new gk(0, 0, 0);
          var3.field_a = param0.field_a;
          var3.field_i = param0.field_i;
          if (param2) {
            field_f = (String) null;
          }
          var3.field_g = param0.field_g;
          var3.field_j = param0.field_j;
          var3.field_d = param0.field_d;
          var3.field_p = param0.field_p;
          var3.field_o = param1;
          var3.field_n = param0.field_n;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("uh.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    uh(int param0) {
        int var2 = 0;
        ck dupTemp$1 = null;
        ck var3;
        this.field_g = 0;
        this.field_d = new ck[param0];
        this.field_b = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new ck();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.field_k = var3;
          var3.field_i = var3;
        }
    }

    static {
        field_i = new String[]{"Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", "Magno claw", "Flame cannon", "Bio rocket", "Air mine", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon"};
        field_h = "D";
        field_f = "Close";
        field_e = 1;
    }
}
