/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    int field_M;
    static cn field_q;
    int[] field_k;
    int[] field_O;
    int[] field_g;
    int[] field_l;
    short[] field_v;
    private boolean field_f;
    int[] field_m;
    short[] field_e;
    byte[] field_y;
    short[] field_t;
    static String field_D;
    int field_p;
    short[] field_F;
    short field_B;
    short[] field_N;
    static String[] field_J;
    short[] field_n;
    int field_H;
    short[] field_s;
    short[] field_o;
    short[] field_A;
    short[] field_x;
    int[] field_u;
    short[] field_Q;
    static String[] field_R;
    short[] field_P;
    short[] field_d;
    short[] field_I;
    short field_h;
    static String[] field_E;
    int field_i;
    int field_b;
    int[] field_K;
    short[] field_C;
    static ja field_G;
    int field_a;
    static String field_j;
    short[] field_z;
    byte field_w;
    short[] field_S;
    int[] field_r;
    short[] field_L;
    int[] field_T;
    short field_c;

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        for (var6 = 0; this.field_B > var6; var6++) {
          this.field_L[var6] = (short)(this.field_L[var6] * param4 / param0);
          this.field_S[var6] = (short)(this.field_S[var6] * param2 / param0);
          this.field_z[var6] = (short)(param3 * this.field_z[var6] / param0);
        }
        if (param1) {
          return;
        }
        this.b(32767);
    }

    final static void a(int param0, rj param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = DungeonAssault.field_K;
        try {
          if (!kn.field_g) {
            return;
          }
          if (param2 == 6) {
            if (!la.field_f) {
              if (lk.field_S > 0) {
                param2 = 7;
              }
            } else {
              la.field_f = false;
              param2 = 4;
              o.field_n.a(6, -64);
            }
            lk.field_S = lk.field_S + 1;
          } else {
            if (param2 != 8) {
              if (param2 == 11 &&
                o.field_n.a(11, (byte) 127)) {
                ba.a(param1, (byte) 52, 12);
                return;
              }
            } else {
              if (la.field_f) {
                la.field_f = false;
                param2 = 5;
                o.field_n.a(8, -69);
              }
            }
          }
          if (param0 != -13716) {
            qh.b((byte) -92);
          }
          if (!o.field_n.a(param2, (byte) 71)) {
            o.field_n.a(param2, param0 ^ 13772);
            ba.a(param1, (byte) 90, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("qh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0) {
        if (param0 != 32767) {
          this.field_Q = (short[]) null;
        }
        this.field_f = false;
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        cn var7 = null;
        cn var8 = null;
        cn var7Lifetime1;
        cn var7Lifetime2;
        int var3Lifetime1;
        var4 = DungeonAssault.field_K;
        try {
          gf.e(243, 197, 369, 143, 16777215);
          gf.b(244, 198, 367, 141, 0);
          if (param0 != 245) {
            field_R = (String[]) null;
          }
          if (null == of.field_q) {
            if (null != tg.field_l) {
              tg.field_l.a(bg.field_t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
            return;
          }
          var6 = of.field_q[me.field_f];
          var7 = var6;
          var7Lifetime1 = var6;
          if (var6 == null) {
            if (tg.field_l != null) {
              tg.field_l.a(bg.field_t, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
            }
          } else {
            var6.h(245, 199);
          }
          if (wf.field_x < am.field_g) {
            var7Lifetime2 = of.field_q[ai.field_n];
            if (var7Lifetime2 != null) {
              var2_int = wf.field_x * (var7Lifetime2.field_E + 60) / am.field_g;
              var3 = -30 + var2_int;
              if (!oo.field_a) {
                lg.a((var7Lifetime2.field_E - var3) * 256 / 30, 65280, var3 * -256 / 30, 199, 245, var7Lifetime2);
              } else {
                lg.a(-256 * var3 / 30, param0 + 65035, (-var3 + var7Lifetime2.field_E) * 256 / 30, 199, 245, var7Lifetime2);
              }
            }
          }
          if (tg.field_l != null) {
            var2 = null;
            var5 = 0;
            var3Lifetime1 = var5;
            while (var5 < of.field_q.length) {
              var8 = of.field_q[var5];
              if (var8 != null && (365 != var8.field_E ||
                var8.field_G != 139)) {
                if (var2 == null) {
                  var2 = Integer.toString(var5);
                } else {
                  var2 = (String) (var2) + ", " + var5;
                }
              }
              var5++;
            }
            if (var2 == null) {
              return;
            }
            tg.field_l.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "qh.I(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 245) {
          return false;
        }
        return param0 == (param0 & -param0) ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        for (var5 = param0; this.field_B > var5; var5++) {
          this.field_L[var5] = (short)(this.field_L[var5] + param1);
          this.field_S[var5] = (short)(this.field_S[var5] + param3);
          this.field_z[var5] = (short)(this.field_z[var5] + param2);
        }
        this.b(32767);
    }

    final void a(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = DungeonAssault.field_K;
        if (this.field_f) {
          return;
        }
        this.field_f = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_B > var8; var8++) {
          var9 = this.field_L[var8];
          var10 = this.field_S[var8];
          var11 = this.field_z[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          if (var4 > var11) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        if (param0 > -116) {
          this.a(-99, true, -5, 127, 16);
        }
        this.field_M = var6;
        this.field_b = var7;
        this.field_H = var2;
        this.field_i = var5;
        this.field_p = var3;
        this.field_a = var4;
    }

    final static int a(boolean param0, cd param1, cd param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_E = (String[]) null;
          }
          var4 = (String) null;
          stackIn_3_0 = op.a(param1, 0, 0, param2, (String) null, -115, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16777215) {
            qh.a(-67, 5);
          }
          stackIn_3_0 = fm.a(param2, 101, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 75) {
          return;
        }
        field_E = null;
        field_D = null;
        field_j = null;
        field_q = null;
        field_G = null;
        field_J = null;
        field_R = null;
    }

    qh() {
        this.field_f = false;
        this.field_w = (byte) 0;
    }

    static {
        field_D = "The brass construction in this room is humanoid in design, but has razor-sharp blades in place of arms.<br><br>Defeated raiders permanently lose 2 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_R = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_J = new String[]{"The land of Dungaria, home of the dragon.", "Once it was a battlefield, where dragons did wage war upon each other for pride and dominance.", "The world itself was in danger of destruction.", "Now the ancient dragons sleep in their subterranean lairs...", "...but still they battle, still they fight.", "Through the life and death of others, they seek gold and renown!", "Take upon yourself the mantle of dragonhood.", "Defend your hoard. Send forth your raiders. Battle your rivals...", "Become the Dragon King!"};
        field_E = new String[]{"Construction", "To prevent other players stealing your Treasure (and diminishing your Renown), you can place additional <%traps> and <%monsters> in your dungeon. Placing new dungeon rooms requires you to spend <%highlight>Treasure</highlight>. The total amount of <%highlight>Treasure</col> you have to spend is located at the <%highlight>bottom-right of this screen</col>."};
        field_j = "<col=FF0000>limit reached</col>";
    }
}
