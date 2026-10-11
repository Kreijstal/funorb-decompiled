/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends rf {
    private int field_ab;
    private int field_gb;
    private int field_Z;
    static ad field_hb;
    private int field_X;
    private int field_Y;
    static int field_bb;
    private int field_fb;
    static int[] field_db;
    static String field_V;
    static String[] field_cb;
    static String field_W;
    static String field_eb;

    final static gd a(int param0, int param1, int param2, cn param3, nn param4) {
        cn var5 = null;
        RuntimeException var5_ref = null;
        cn var6 = null;
        cn var7 = null;
        cn var8 = null;
        gd var9 = null;
        gd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 82) {
            field_hb = (ad) null;
          }
          var5 = fk.a((byte) 36, param3, 192, 12690143);
          var6 = rb.a(16, var5, 255, (byte) -53);
          var7 = fk.a((byte) 36, param3, 192, 16744448);
          var8 = rb.a(16, var7, 16711680, (byte) 92);
          var9 = new gd(param3, var5, var6, var7, var8, param0, param2);
          param4.a(var9, (byte) -20);
          stackIn_3_0 = var9;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("sj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    sj(ji param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_ab = 0;
        this.field_Z = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param1) {
          this.b(-15, param2, param0);
          return;
        }
        this.field_Y = this.field_s;
        this.field_fb = this.field_x;
        this.field_X = param0;
        this.field_gb = param2;
        this.field_ab = 0;
        this.field_Z = param1;
        if (param3 != 22284) {
          this.h((byte) -56);
        }
    }

    void k(int param0) {
        if (param0 != 0) {
          String var3 = (String) null;
          sj.a(-37, 39, -112, 81, (String) null, (String) null);
        }
    }

    public static void g(byte param0) {
        field_hb = null;
        field_W = null;
        field_db = null;
        field_eb = null;
        field_V = null;
        field_cb = null;
        if (param0 != -10) {
          field_hb = (ad) null;
        }
    }

    final static String l(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        cn var6;
        String var7;
        String var8;
        String var9;
        var5 = DungeonAssault.field_K;
        if (param0 != 192) {
          var6 = (cn) null;
          sj.a((cn) null, -120);
        }
        var7 = "(" + wl.field_f + " " + oc.field_E + " " + rd.field_C + ") " + hc.field_c;
        var1 = var7;
        if (0 < nj.field_b) {
          var1 = var7 + ":";
          for (var2 = 0; var2 < nj.field_b; var2++) {
            var8 = var1 + ' ';
            var3 = 255 & ra.field_c.field_m[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var9 = var8 + (char)var4;
            var1 = var9 + (char)var3;
          }
        }
        return var1;
    }

    final static pp a(cn param0, int param1) {
        cn var2 = null;
        RuntimeException var2_ref = null;
        cn var3 = null;
        cn var4 = null;
        pp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jh.c();
          var2 = new cn(param0.field_y, param0.field_v);
          var3 = new cn(param0.field_y, param0.field_v);
          var2.e();
          param0.e(0, 0, 16744448);
          var3.e();
          param0.e(0, 0, 8421504);
          jh.b();
          var4 = rb.a(8, var2, 255, (byte) -116);
          if (param1 <= 4) {
            field_hb = (ad) null;
          }
          stackIn_3_0 = new pp(param0, var3, var2, var4, 0, 30);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("sj.DA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void h(byte param0) {
        if (this.field_Z <= 0) {
          return;
        }
        this.b(119, this.field_gb, this.field_X);
        int var2 = -27 % ((param0 - 22) / 35);
        this.field_Z = 0;
        this.k(0);
    }

    boolean i(int param0) {
        this.h((byte) -61);
        if (param0 != 462) {
          this.h((byte) -64);
        }
        return super.i(param0 + 0);
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 != -90) {
          this.i(-114);
        }
        if (this.field_Z <= 0) {
        } else {
          var2 = this.field_X;
          var3 = this.field_gb;
          fieldTemp$0 = this.field_ab + 1;
          this.field_ab = this.field_ab + 1;
          if (this.field_Z <= fieldTemp$0) {
            this.field_Z = 0;
            this.k(0);
          } else {
            var4 = this.field_ab * (2 * this.field_Z - this.field_ab);
            var5 = this.field_Z * this.field_Z;
            var2 = (-this.field_fb + this.field_X) * var4 / var5 + this.field_fb;
            var3 = (this.field_gb - this.field_Y) * var4 / var5 + this.field_Y;
          }
          this.b(15, var3, var2);
        }
        return super.f((byte) -90);
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ac var6 = gh.field_i[param1];
        if (var6 == null) {
          return;
        }
        try {
          if (param3 != 32) {
            cn var7 = (cn) null;
            sj.a((cn) null, 111);
          }
          var6.field_a = param4 == null ? null : hd.a(false, param2, "da_monster_" + param4);
          var6.field_p = param5 != null ? hd.a(false, param0, "da_monster_" + param5) : null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "sj.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10) {
            field_W = (String) null;
          }
          stackIn_3_0 = ah.a(param0, 10, true, (byte) -42);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("sj.EA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = DungeonAssault.field_K;
        gf.c(6 + param1, param0 + 35, this.field_x - 12, -40 + this.field_s, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (var8 >= gf.field_f &&
            gf.field_e > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_x;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (-var7 + 20) + (20 - var10) * (20 - var10);
                if (var12 <= 462) {
                  if (420 > var12) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  gf.field_b[var8 * gf.field_i + (param1 + var10)] = var13;
                }
                var10++;
              }
            }
            if (20 >= var7) {
              var12Lifetime1 = var11;
              var11 -= 21;
              var13Lifetime1 = 0;
              while (var13Lifetime1 <= 20) {
                var14 = (20 - var7) * (20 - var7) + var13Lifetime1 * var13Lifetime1;
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = var11 + 1;
                  } else {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    gf.field_b[gf.field_i * var8 + param1 + var11] = var15;
                  }
                  var13Lifetime1++;
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 8 | var9 << 16);
            gf.b(param1 + var10, var8, var11 - var10, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 8 | var9Lifetime1 << 16);
          gf.b(param1, var8Lifetime1, 6, var9Lifetime1);
          gf.b(this.field_x + (param1 - 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        bl.field_e.h(this.field_x + param1 - 90, param0 + 10);
        jm.a(param1 + 5, this.field_x - 10, gn.field_i, 0, 35 + param0);
        jm.a(param1, this.field_x, di.field_l, 0, this.field_s + param0 - 22);
        var6Lifetime2 = 127;
        var4Lifetime2 = this.field_s - 79;
        var5Lifetime2 = 169;
        var7Lifetime2 = 0;
        var8Lifetime2 = param0 + 57;
        if (param2) {
          this.h((byte) 25);
        }
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          gf.b(param1, var8Lifetime2, 6, var9Lifetime2);
          gf.b(param1 + this.field_x - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    static {
        field_bb = 64;
        field_hb = new ad(14, 0, 4, 1);
        field_W = "Dungeon and Stable";
        field_cb = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_eb = "While demon lords are still a raider's worst nightmare, pit demons are still very, very bad dreams.";
        field_V = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
