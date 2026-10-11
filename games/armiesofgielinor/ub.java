/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    private int field_c;
    private jr[] field_b;
    static boolean field_e;
    static String field_a;
    private int field_f;
    static int field_d;

    final static te a(byte param0, sn param1) {
        RuntimeException var2 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = MapTile.a(-69, aa.a(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (te) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean b(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var6 = 0;
        if (param0 != 117) {
          sn var8 = (sn) null;
          ub.$cfr$intArgs$a$6d836999ad61(7, (sn) null);
        }
        while (this.field_c > var6) {
          if (this.field_b[var6].b(42, param4, param2, param3, param1)) {
            return this.field_c >> 1 < var6 ? true : false;
          }
          var6++;
        }
        return false;
    }

    final int a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 >= -92) {
          field_d = 33;
        }
        for (var6 = 0; this.field_c > var6; var6++) {
          if (this.field_b[var6].b(71, param3, param4, param2, param1)) {
            return this.field_b[var6].field_i;
          }
        }
        return -1;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var7 = 0;
        jr stackIn_9_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = param2[6];
          for (var7 = 0; this.field_c > var7; var7++) {
            if (!this.field_b[var7].field_a) {
              if (this.field_b[var7].field_c == 0) {
                this.field_b[var7].a(var6_int, param4 + 16, false, param3 + 16);
              } else {
                this.field_b[var7].a(param2[-1 + this.field_b[var7].field_c], param4 + 16, false, param3 + 16);
              }
            } else {
              if (-1 != bw.unitDefinitions[this.field_b[var7].field_i][1]) {
                var6_int = param2[bw.unitDefinitions[this.field_b[var7].field_i][1]];
              }
              stackIn_9_0 = this.field_b[var7];
              if (param0 >= bw.unitDefinitions[this.field_b[var7].field_i][8] &&
                var6_int >= bw.unitDefinitions[this.field_b[var7].field_i][2]) {
                stackIn_10_1 = 1;
              } else {
                stackIn_10_1 = 0;
              }
              ((jr) (Object) stackIn_9_0).a(stackIn_10_1, 16 + param4, false, param3 + 16);
            }
          }
          if (param1 != -23451) {
            this.b((byte) 112, 3, 116, -86, -110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ub.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(byte param0, int param1) {
        int var3 = 0;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 > param1 ||
          param1 >= 3) {
          return "Unkown Campaign " + param1;
        }
        String var2 = "";
        if (param0 < 19) {
          return (String) null;
        }
        for (var3 = 0; var3 < cd.field_a[param1].field_n.length; var3++) {
          var2 = var2 + var3 + ": " + cd.field_a[param1].field_n[var3].name + "\n";
        }
        return var2;
    }

    final jr a(int param0, int param1) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = 0;
        if (param1 != -15050) {
          field_a = (String) null;
        }
        while (var3 < this.field_c) {
          if (param0 == this.field_b[var3].field_i) {
            return this.field_b[var3];
          }
          var3++;
        }
        return null;
    }

    final static void a(boolean param0, boolean param1) {
        ij.field_w = !param1 ? new ea(ob.field_O, eb.field_c) : new ea(TeleportAction.field_x, uj.field_l);
        if (param0) {
          return;
        }
        lk.field_a = new je(0L, (je) null);
        lk.field_a.a(ij.field_w.field_a, 126);
        lk.field_a.a(mp.field_Lb, 97);
        ta.field_R = new je(0L, jm.field_b);
        df.field_K = new je(0L, (je) null);
        ta.field_R.a(bk.field_f, 54);
        ta.field_R.a(df.field_K, 70);
        df.field_K.a(nf.field_Kb, 112);
        df.field_K.a(dv.field_m, 74);
        je.a(27, param1);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -122) {
          field_a = (String) null;
        }
    }

    ub(int param0, jr[] param1, boolean param2) {
        int var4_int = 0;
        jr stackIn_5_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_c = param1.length;
          this.field_f = param0;
          this.field_b = param1;
          for (var4_int = 0; var4_int < this.field_c; var4_int++) {
            stackIn_5_0 = this.field_b[var4_int];
            if (!param2) {
              stackIn_6_1 = -1;
            } else {
              stackIn_6_1 = 1;
            }
            stackIn_5_0.field_b = stackIn_6_1 * (int)(Math.sin(2.0 * (3.141592653589793 * (double)var4_int) / (double)this.field_c) * (double)this.field_f);
            this.field_b[var4_int].field_g = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var4_int) / (double)this.field_c) * (double)this.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static EventPresenter a(GameEvent param0, Battlefield param1, boolean param2, int param3, GameplayController param4, int param5, int param6, eo param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        EventPresenter var9 = null;
        Object stackIn_2_0 = null;
        EventPresenter stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -39 / ((-87 - param5) / 33);
          var9 = new EventPresenter(param4, param1, param7, param0, param6, param3, param2);
          if (var9.b(param6, param3, true)) {
            stackIn_4_0 = var9;
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (EventPresenter) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ub.A(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_a = "Portal";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static te $cfr$intArgs$a$6d836999ad61(int param0, sn param1) {
        RuntimeException var2 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = MapTile.a(-69, aa.a(param1, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (te) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }
}
