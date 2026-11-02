/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends ida {
    static cw field_y;
    static String field_w;
    static int field_v;
    private int field_C;
    static String[] field_A;
    static PcmSample[] field_x;
    private cq field_u;
    private int field_z;
    private boolean field_B;
    private int field_t;

    private final void a(int param0, BattleCreature param1, int param2, boolean param3, int param4) {
        CreatureActor var6 = null;
        try {
          var6 = this.field_s.b(param1, -23990);
          var6.field_s.field_s = param2;
          super.a(param2, param4, 27230);
          this.field_n = -50;
          if (param0 != 0) {
            this.isFinished((byte) -81);
          }
          this.a(param1, param3, -3670);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "qf.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(BattleCreature param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 10;
          if (param0.statusId == 17) {
            var4_int = 15;
          }
          if (28 == param0.statusId) {
            var4_int = 20;
          }
          this.field_q = wka.a(57, this.field_C, var4_int, this.field_r);
          this.field_z = this.field_q;
          if (param2 != -3670) {
            field_A = (String[]) null;
          }
          if (param1) {
            this.field_q = this.field_q + wka.a(57, this.field_C, var4_int, 1);
          }
          if (this.field_z != 0) {
            return;
          }
          this.field_z = 10;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qf.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean isFinished(byte param0) {
        PcmSampleStream var4_ref_je = null;
        CreatureActor var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        CreatureActor var7 = this.field_p.a(-27449, this.field_s);
        int var3 = -27 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_n + 1;
        CreatureActor var2Lifetime1;
        CreatureActor var2Lifetime2;
        CreatureActor var2Lifetime3;
        CreatureActor var2Lifetime4;
        CreatureActor var2Lifetime1Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime4;
        int var4Lifetime1Lifetime1;
        this.field_n = this.field_n + 1;
        if (fieldTemp$0 < 0) {
          return false;
        }
        if (null == this.field_u &&
          var7.field_s.statusId == 32) {
          var4_ref_je = PcmSampleStream.createWithVolume(rt.field_a[32], 256, 256);
          var4_ref_je.d(-1);
          this.field_u = tw.a(var4_ref_je, (byte) -36);
        }
        if (0 != this.field_n) {
          this.field_s.field_s.a(var7, 107);
          if (this.field_q < this.field_n) {
            this.c(true);
            return true;
          }
          if (this.field_z < this.field_n) {
            var2 = this.field_p.a(-27449, this.field_s);
            var4 = this.field_q - this.field_z >> 1;
            var5 = -this.field_n - var4 + this.field_q;
            if (0 > var5) {
              var5 = -var5;
            }
            var5 = this.field_q + (-var4 - var5);
            var2.field_r = (this.field_j << 16) * var5 / this.field_z;
            var2.field_o = (this.field_l << 16) * var5 / this.field_z;
            return false;
          }
          var4Lifetime4 = this.field_n - this.field_m;
          var2Lifetime4 = this.field_p.a(-27449, this.field_s);
          var2Lifetime4.field_o = (this.field_l << 16) * var4Lifetime4 / this.field_z;
          var2Lifetime4.field_r = var4Lifetime4 * (this.field_j << 16) / this.field_z;
          return false;
        }
        if (this.field_B) {
          this.field_s.field_s.a(var7, 107);
          if (this.field_q < this.field_n) {
            this.c(true);
            return true;
          }
          if (this.field_z < this.field_n) {
            var2Lifetime1 = this.field_p.a(-27449, this.field_s);
            var4Lifetime1 = this.field_q - this.field_z >> 1;
            var5Lifetime1 = -this.field_n - var4Lifetime1 + this.field_q;
            if (0 > var5Lifetime1) {
              var5Lifetime1 = -var5Lifetime1;
            }
            var5Lifetime1 = this.field_q + (-var4Lifetime1 - var5Lifetime1);
            var2Lifetime1.field_r = (this.field_j << 16) * var5Lifetime1 / this.field_z;
            var2Lifetime1.field_o = (this.field_l << 16) * var5Lifetime1 / this.field_z;
            return false;
          }
          var4Lifetime1Lifetime1 = this.field_n - this.field_m;
          var2Lifetime1Lifetime1 = this.field_p.a(-27449, this.field_s);
          var2Lifetime1Lifetime1.field_o = (this.field_l << 16) * var4Lifetime1Lifetime1 / this.field_z;
          var2Lifetime1Lifetime1.field_r = var4Lifetime1Lifetime1 * (this.field_j << 16) / this.field_z;
          return false;
        }
        if (32 != var7.field_s.statusId) {
          var7.b(-1, this.field_t);
        }
        this.field_s.field_s.a(var7, 107);
        if (this.field_q < this.field_n) {
          this.c(true);
          return true;
        }
        if (this.field_z < this.field_n) {
          var2Lifetime2 = this.field_p.a(-27449, this.field_s);
          var4Lifetime2 = this.field_q - this.field_z >> 1;
          var5Lifetime2 = -this.field_n - var4Lifetime2 + this.field_q;
          if (0 > var5Lifetime2) {
            var5Lifetime2 = -var5Lifetime2;
          }
          var5Lifetime2 = this.field_q + (-var4Lifetime2 - var5Lifetime2);
          var2Lifetime2.field_r = (this.field_j << 16) * var5Lifetime2 / this.field_z;
          var2Lifetime2.field_o = (this.field_l << 16) * var5Lifetime2 / this.field_z;
          return false;
        }
        var4Lifetime3 = this.field_n - this.field_m;
        var2Lifetime3 = this.field_p.a(-27449, this.field_s);
        var2Lifetime3.field_o = (this.field_l << 16) * var4Lifetime3 / this.field_z;
        var2Lifetime3.field_r = var4Lifetime3 * (this.field_j << 16) / this.field_z;
        return false;
    }

    private final void c(boolean param0) {
        CreatureActor var2;
        CreatureActor var3;
        var3 = this.field_p.a(-27449, this.field_s);
        var2 = var3;
        var3.b(false);
        var3.field_r = 0;
        var3.field_o = 0;
        var3.field_k = 0;
        if (null != this.field_u) {
          PizzaArenaTheme.a(72, this.field_u);
        }
        if (123 == this.field_C) {
          this.field_s.b(var3, (CreatureActor) null, param0);
        } else {
          this.field_s.a(-119, this.field_r, var3, this.field_k);
        }
        if (!param0) {
          this.field_B = false;
        }
        var3.field_s.field_s = this.field_k;
        if (!hl.a((byte) -124, this.field_C)) {
          return;
        }
        if (var3.field_s.g((byte) 85)) {
          return;
        }
        if (var3.field_s.statusId == 33) {
          return;
        }
        if (var3.field_s.statusId == 31) {
          return;
        }
        this.field_s.a(-16007, var3, 2);
        var3.field_s.statusTurns = var3.field_s.statusTurns - 1;
    }

    qf(BattleScreen param0, MoveEvent param1) {
        this(param0, param1.creature, param1.moveId, param1.field_p, param1.field_n, param1.field_t);
        CreatureActor var3 = null;
        try {
          var3 = this.field_p.a(-27449, this.field_s);
          var3.field_s.d(param1.moveId, (byte) -115);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qf(BattleScreen param0, CreatureRef param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param3, param4);
        CreatureActor var8 = null;
        BattleCreature var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          var10 = this.field_p.a(114, this.field_s.field_h);
          var8 = this.field_s.b(var10, -23990);
          this.field_C = param2;
          if (this.field_C == 0) {
            this.field_t = 1;
          } else {
            if (hl.a((byte) -49, this.field_C)) {
              this.field_t = 3;
            } else {
              this.field_B = true;
              this.field_t = 8;
            }
          }
          this.addChild(27799, new ActorAnimation(this.field_s, var8));
          this.a(0, var10, this.field_k, param5, this.field_r);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_10_0 = var7;
          stackIn_10_1 = new StringBuilder().append("qf.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_A = null;
        field_w = null;
        field_x = null;
        field_y = null;
        if (param0 != 28766) {
          qf.e(-13);
        }
    }

    final static void e(int param0) {
        int var1_int = 0;
        kr var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = BachelorFridge.field_y;
        try {
          if (qg.field_b.children == null) {
            return;
          }
          var1_int = 0;
          if (param0 != 20434) {
            field_x = (PcmSample[]) null;
          }
          var2 = (kr) (qg.field_b.children.b((byte) 90));
          while (var2 != null) {
            if (null != qg.field_b.children) {
              var2.field_kb = var1_int % 4 * 39;
              var2.field_rb = var1_int / 4 * 39;
            }
            var2 = (kr) (qg.field_b.children.c(param0 ^ 20434));
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var1), "qf.N(" + param0 + ')');
        }
    }

    static {
        field_w = "Your email address is used to identify this account";
        field_A = new String[]{"Walk", "Jump", "Sprint"};
        field_x = new PcmSample[10];
    }
}
