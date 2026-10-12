/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    static SceneWidget[] field_h;
    private sm field_c;
    private int field_i;
    private int field_u;
    private int field_e;
    private boolean field_v;
    private int field_g;
    private int field_m;
    private int field_o;
    private int field_a;
    private int field_w;
    private int field_p;
    private int field_n;
    private float field_s;
    private int field_d;
    static int field_f;
    static int[] field_l;
    private int field_r;
    static boolean field_j;
    private int field_q;
    private int field_b;
    static String[] field_t;
    private int field_k;

    final nn b(int param0) {
        nn var2 = null;
        nn var2Lifetime1;
        this.field_g = li.field_A;
        this.field_o = na.field_i;
        this.field_c.a(this.field_b, true, this.field_a);
        if (param0 != 32472) {
          jg.a(-128, -3);
          ti.field_x = false;
          var2 = hc.a(0, hb.field_i, 0, this.field_a, 0, this.field_b);
          if (var2 == null) {
            this.a(15481);
            return var2;
          }
          return var2;
        }
        ti.field_x = false;
        var2Lifetime1 = hc.a(0, hb.field_i, 0, this.field_a, 0, this.field_b);
        if (var2Lifetime1 != null) {
          return var2Lifetime1;
        }
        this.a(15481);
        return var2Lifetime1;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        var2 = this.field_k;
        var3 = this.field_i;
        if (!this.a((byte) 106)) {
          this.field_v = false;
          return;
        }
        if (this.field_u >= var2) {
          if (this.field_w > var2) {
            var2 = this.field_w;
          }
        } else {
          var2 = this.field_u;
        }
        if (this.field_q >= var3) {
          if (this.field_e > var3) {
            var3 = this.field_e;
          }
        } else {
          var3 = this.field_q;
        }
        if (!(0.0f < this.field_s)) {
          if (var2 != na.field_i) {
            this.field_c.a(var2, true, var3);
          } else {
            if (li.field_A != var3) {
              this.field_c.a(var2, true, var3);
            }
          }
          if (this.field_k > 0) {
            kf.field_p = (this.field_k - na.field_i) / 2;
          }
          if (param0 <= -3) {
            return;
          }
          this.b(true);
          return;
        }
        var4 = (int)(this.field_s * (float)var3 + 0.5f);
        if (var4 > var2) {
          var3 = (int)((float)var2 / this.field_s);
        } else {
          if (var2 > var4) {
            var2 = var4;
          }
        }
        if (var2 != na.field_i) {
          this.field_c.a(var2, true, var3);
        } else {
          if (li.field_A != var3) {
            this.field_c.a(var2, true, var3);
          }
        }
        if (this.field_k > 0) {
          kf.field_p = (this.field_k - na.field_i) / 2;
        }
        if (param0 <= -3) {
          return;
        }
        this.b(true);
        return;
    }

    final static int[] a(boolean param0) {
        if (!param0) {
          jg.a(57, -61);
          return new int[8];
        }
        return new int[8];
    }

    final void b(int param0, byte param1, int param2) {
        this.field_i = param0;
        if (param1 != -114) {
          return;
        }
        this.field_k = param2;
    }

    final static void a(int param0, byte param1, int param2) {
        int var4 = -117 / ((-11 - param1) / 35);
        CipherPacketBuffer var3 = mm.field_g;
        var3.writeCipheredOpcode(param2, (byte) -117);
        var3.writeByte((byte) 124, 3);
        var3.writeByte((byte) 109, 8);
        var3.writeShort(param0, 80);
    }

    final boolean a(byte param0) {
        int var2 = -28 / ((-8 - param0) / 49);
        if (ed.field_a < this.field_p) {
          return false;
        }
        if (rd.field_b > 0) {
          return true;
        }
        return false;
    }

    public static void b(byte param0) {
        field_h = null;
        field_l = null;
        int var1 = 86 / ((0 - param0) / 63);
        field_t = null;
    }

    final void b(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        String var3;
        if (wb.field_c != null) {
          return;
        }
        if (!param0) {
          if (0 >= rd.field_b) {
            this.field_v = false;
          }
          if (this.field_v) {
            fieldTemp$0 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (fieldTemp$0 > 0) {
              return;
            }
            this.field_m = this.field_n;
            if (this.field_p > ed.field_a) {
              this.field_v = false;
            } else {
              this.c(-95);
            }
            return;
          }
          if (na.field_i < this.field_k) {
            kf.field_p = (this.field_k - na.field_i) / 2;
          } else {
            if (this.field_k > 0) {
              kf.field_p = 0;
            }
          }
          if (this.field_r == na.field_i &&
            li.field_A == this.field_d) {
            return;
          }
          this.field_c.a(this.field_r, true, this.field_d);
          return;
        }
        var3 = (String) null;
        jg.a((String) null, -86);
        if (0 >= rd.field_b) {
          this.field_v = false;
        }
        if (this.field_v) {
          fieldTemp$1 = this.field_m - 1;
          this.field_m = this.field_m - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.field_m = this.field_n;
          if (this.field_p > ed.field_a) {
            this.field_v = false;
          } else {
            this.c(-95);
          }
          return;
        }
        if (na.field_i < this.field_k) {
          kf.field_p = (this.field_k - na.field_i) / 2;
        } else {
          if (this.field_k > 0) {
            kf.field_p = 0;
          }
        }
        if (this.field_r == na.field_i &&
          li.field_A == this.field_d) {
          return;
        }
        this.field_c.a(this.field_r, true, this.field_d);
        return;
    }

    final static void a(String param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = oh.field_f;
          var3 = pi.field_c;
          var4 = bd.field_f.field_L.b(param0, 500);
          var5 = 6 + bd.field_f.field_L.a(param0, 500);
          var6 = 2 + db.field_b * var4;
          var7 = dl.a(12, 127, var2_int, var5);
          var8 = ol.a(var3, 0, 20, var6);
          SoftwareRaster.h(var7, var8, var5, var6, 0);
          SoftwareRaster.a(1 + var7, 1 + var8, -2 + var5, var6 - 2, 16777088);
          bd.field_f.field_L.a(param0, 3 + var7, param1 + var8 - (-km.field_g + bd.field_f.field_L.field_G), 500, 1000, 0, -1, 0, 0, db.field_b);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var6_int = param5 * SoftwareRaster.field_c + param2;
          if (param3) {
            return;
          }
          for (var7 = param5; param4 > var7; var7++) {
            var8 = 255 * (param4 - var7) / (-param5 + param4);
            var9 = 255 * (var7 - param5) / (-param5 + param4);
            var10 = (var8 * param0 + var9 * param1) / 256;
            SoftwareRaster.field_g[var6_int] = 65793 * var10;
            var6_int = var6_int + SoftwareRaster.field_c;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6), "jg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1) {
        ud.field_w = i.field_d[param0];
        IntKeyLookup.field_g = ArticulatedPart.field_X[param0];
        nm.field_t = si.field_j[param0];
        if (param1 != 1000) {
          jg.a(126, (byte) -10, -36);
        }
    }

    final void a(int param0) {
        if (param0 == 15481) {
          this.field_c.a(this.field_o, true, this.field_g);
          return;
        }
        jg.a(true);
        this.field_c.a(this.field_o, true, this.field_g);
    }

    private jg() throws Throwable {
        throw new Error();
    }

    static {
        field_h = new SceneWidget[12];
        field_j = false;
        field_t = new String[]{"Ballistics Master", "Missile Assault", "Ballistic Assault", "Missile Defender", "Counter Attack", "Air Defender", "Mechavity", "Perfection", "Smelter", "Master of War", "Tag Rampage", "Gunning for Tags", "Fusion Tag", "Tagged It", "Energising Tag", "Team Tagger", "Destroyer", "Iron Sentinel", "Steel Sentinel", "Alloy Sentinel", "Titanium Sentinel", "Platinum Sentinel", "Adamant Sentinel", "Diamond Sentinel", "Comeback", "And It Costs How Much?", "Vengeance", "Defender", "Master Defender", "Boomerang", "Slingshot", "The Big Red Button", "Ilolian Hero", "Silver Winner", "Gold Winner", "Silver Hero", "Gold Hero", "Conqueror", "Pterocide"};
    }
}
