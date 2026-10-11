/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fu {
    static int field_d;
    String field_i;
    private static long[] field_f;
    static String field_b;
    RgbSprite field_h;
    String field_c;
    static String field_a;
    static RgbSprite field_e;
    static af field_g;

    final static void a(int param0, Unit param1, PacketBuffer param2) {
        try {
          bu.a(0, param1, 2, param2);
          if (param0 != 29712) {
            field_f = (long[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 < 124) {
          field_a = (String) null;
        }
        field_e = null;
    }

    final static void a(String param0, int param1, long param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        vl.field_n.h(param3 ^ 3982, param5);
        vl.field_n.position = vl.field_n.position + 1;
        if (param3 != 29231) {
          return;
        }
        try {
          var7_int = vl.field_n.position;
          vl.field_n.a(param2, param3 ^ 38346879);
          vl.field_n.b(param0, param3 ^ 17460);
          vl.field_n.b(1, param1);
          vl.field_n.b(param3 - 29230, param4 ? 1 : 0);
          vl.field_n.e(-var7_int + vl.field_n.position, 5930);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fu.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    fu(int[] param0, int param1, int param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != null) {
            this.field_h = pl.field_x[param0[0]];
          } else {
            if (param1 == -1) {
              if (param2 > 0) {
                this.field_h = BattleCharacter.field_h[161];
              } else {
                this.field_h = null;
              }
            } else {
              this.field_h = BattleCharacter.field_h[uc.spellDefinitions[param1][2]];
            }
          }
          if (param0 != null) {
            this.field_c = dn.field_Pb[param0[0]];
            this.field_i = ut.field_cb[param0[0]];
          } else {
            if (-1 == param1) {
              if (param2 > 0) {
                this.field_c = dj.a(6609, hf.field_b, "<MANA>", Integer.toString(param2));
                this.field_i = hw.field_D;
              } else {
                this.field_c = null;
                this.field_i = null;
              }
            } else {
              this.field_c = fq.field_f[param1];
              this.field_i = SpellAreaSelection.field_l[param1];
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("fu.<init>(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_f = new long[256];
        field_b = "Stock";
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; 8 > var3; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_f[var2] = var0;
        }
        field_a = "Email is valid";
        field_g = null;
    }
}
