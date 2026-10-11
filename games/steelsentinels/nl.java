/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends oa {
    int field_ab;
    int field_eb;
    static int[] field_db;
    int field_Y;
    static String field_V;
    static String field_Z;
    int field_W;
    int field_bb;
    static boolean field_X;
    int field_cb;

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_cb + (-this.field_o + (-param2 + param3));
          var9 = param0 - this.field_Y - this.field_z - param4;
          if (var8_int * var8_int + var9 * var9 >= this.field_ab * this.field_ab) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - mj.field_Xb;
          if (!(0.0 > var10)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.field_bb;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_bb;
          }
          this.field_eb = (int)(var10 * (double)this.field_bb / 6.283185307179586);
          while (this.field_eb >= this.field_bb) {
            this.field_eb = this.field_eb - this.field_bb;
          }
          while (this.field_eb < 0) {
            this.field_eb = this.field_eb + this.field_bb;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_19_0 = var8;
          stackIn_19_1 = new StringBuilder().append("nl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        int[] array$1 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.obfuscationControl;
        try {
          for (var1_int = 0; var1_int < ue.field_c.length; var1_int++) {
            if (ue.field_c[var1_int] != null) {
              continue;
            }
            break;
          }
          bi.field_f.field_Ub.field_eb = -100 + bi.field_f.field_Lb - bi.field_f.field_Ub.field_Lb;
          fg.field_Ob = 1;
          va.field_k[0] = bi.field_f.field_Ub.field_eb;
          if (param0 <= 122) {
            return true;
          }
          vn.d(-31);
          if (var1_int >= ue.field_c.length) {
            km.field_a = wh.field_i;
            ln.field_c = lj.field_e[0];
            return false;
          }
          uc.field_b = cj.a(73, di.field_c, hl.field_v);
          if (null == ue.field_c[var1_int] ||
            ue.field_c[var1_int].length != uc.field_b.length) {
            array$1 = new int[uc.field_b.length];
            ue.field_c[var1_int] = array$1;
          }
          ii.a(uc.field_b, 0, ue.field_c[var1_int], 0, uc.field_b.length);
          ad.a(var1_int, hl.field_v, 55);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "nl.Q(" + param0 + ')');
        }
    }

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        CipherPacketBuffer var6 = mm.field_g;
        var6.a(param4, (byte) -117);
        if (param5 <= 30) {
          return;
        }
        try {
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.a((byte) 115, 4);
          var6.a((byte) 119, param0);
          var8 = param3;
          if (param2) {
            var8 += 128;
          }
          var6.a((byte) 112, var8);
          var6.a(param1.length, (byte) -122, 0, param1);
          var6.b((byte) -116, var6.position - var7);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void f(byte param0) {
        field_db = null;
        field_V = null;
        field_Z = null;
        if (param0 >= -23) {
          nl.a(false, 19, true, 116, 99, 62);
        }
    }

    final static RgbSprite[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        RgbSprite var13 = null;
        RgbSprite var14 = null;
        int[] var16 = SoftwareRaster.field_g;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = SoftwareRaster.field_c;
        int var8 = SoftwareRaster.field_j;
        RgbSprite var9 = new RgbSprite(16, param4);
        var9.d();
        SoftwareRaster.e(0, 0, 16, param4, param1, param5);
        Object var10 = null;
        Object var11 = null;
        if (param0) {
          var13 = var9.g();
          var10 = var13;
          var13.d();
          SoftwareRaster.g(0, 0, 5, 0);
          SoftwareRaster.g(0, 1, 3, 0);
          SoftwareRaster.g(0, 2, 2, 0);
          SoftwareRaster.g(0, 3, 1, 0);
          SoftwareRaster.g(0, 4, 1, 0);
        }
        if (param3 >= -7) {
          field_X = true;
        }
        if (param2) {
          var14 = var9.g();
          var11 = var14;
          var14.d();
          SoftwareRaster.g(11, 0, 5, 0);
          SoftwareRaster.g(13, 1, 3, 0);
          SoftwareRaster.g(14, 2, 2, 0);
          SoftwareRaster.g(15, 3, 1, 0);
          SoftwareRaster.g(15, 4, 1, 0);
        }
        SoftwareRaster.a(var16, var7, var8);
        return new RgbSprite[]{null, null, null, (RgbSprite) (var10), var9, (RgbSprite) (var11), null, null, null};
    }

    final static void a(byte param0, cm param1) {
        CipherPacketBuffer var8 = null;
        CipherPacketBuffer var10 = null;
        int var3 = 0;
        int var9 = 0;
        pe var5_ref_pe = null;
        int[] var6 = null;
        int var4 = 0;
        int var7 = SteelSentinels.obfuscationControl;
        int var4Lifetime1;
        try {
          var8 = new CipherPacketBuffer(param1.a("", -742, "logo.fo3d"));
          var10 = var8;
          var3 = var10.f((byte) -119);
          var10.d(false);
          pm.field_W = nm.a(var10, (byte) 87);
          nn.field_h = new pe[var3];
          cl.field_f = new int[var3][];
          for (var4 = 0; var4 < var3; var4++) {
            nn.field_h[var4] = ve.a(-100, var8);
          }
          var10.i((byte) -3);
          var9 = 0;
          var4Lifetime1 = var9;
          while (var9 < var3) {
            var5_ref_pe = nn.field_h[var9];
            var5_ref_pe.a(6, 6, 1, 6, 14866);
            var5_ref_pe.b(32767);
            var6 = new int[]{var5_ref_pe.field_J + var5_ref_pe.field_c >> 1, var5_ref_pe.field_p + var5_ref_pe.field_W >> 1, var5_ref_pe.field_n + var5_ref_pe.field_s >> 1};
            cl.field_f[var9] = var6;
            var5_ref_pe.a(0, -var6[1], -var6[2], -var6[0]);
            var9++;
          }
          int var5 = -123 % ((49 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "nl.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 != 26) {
          return 14;
        }
        var2 = param0;
        if (55 == var2) {
          return 2;
        }
        if (0 == var2) {
          return 9;
        }
        if (var2 == 57) {
          return 5;
        }
        if (62 == var2) {
          return 13;
        }
        if (var2 == 65) {
          return 16;
        }
        if (var2 == 69) {
          return 19;
        }
        if (var2 == 72) {
          return 23;
        }
        if (var2 == 75) {
          return 26;
        }
        if (var2 == 79) {
          return 28;
        }
        return -1;
    }

    final static int[] a(int param0, byte param1) {
        int var2;
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 <= 122) {
          return (int[]) null;
        }
        var2 = param0;
        if (0 == var2) {
          return ua.field_v;
        }
        if (var2 == 55) {
          return ua.field_x;
        }
        if (57 == var2) {
          return ua.field_P;
        }
        if (var2 == 62) {
          return ua.field_z;
        }
        if (var2 == 65) {
          return ua.field_N;
        }
        if (var2 == 69) {
          return ua.field_O;
        }
        if (var2 == 72) {
          return ua.field_D;
        }
        if (var2 == 75) {
          return ua.field_J;
        }
        if (79 == var2) {
          return ua.field_E;
        }
        if (84 == var2) {
          return vk.field_s;
        }
        if (88 == var2) {
          return jm.field_p;
        }
        if (92 == var2) {
          return si.field_k;
        }
        return null;
    }

    final static String a(String param0, int param1, boolean param2) {
        int var6 = 0;
        ah var7 = null;
        ah var8 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        CipherPacketBuffer var9 = null;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var10 = (CharSequence) ((Object) param0);
          if (!fa.a(param2, var10)) {
            stackIn_4_0 = en.field_a;
            return stackIn_4_0;
          }
          if (2 != qc.field_P) {
            stackIn_8_0 = ug.field_N;
            return stackIn_8_0;
          }
          var8 = wi.a(param0, (byte) 113);
          if (var8 == null) {
            stackIn_12_0 = db.a(bd.field_a, -75, new String[]{param0});
            return stackIn_12_0;
          }
          Sprite.field_c.a((byte) 125, (IntrusiveNode) (var8));
          while (true) {
            var7 = (ah) (Sprite.field_c.next((byte) -102));
            if (var7 != null) {
              var7.field_bc = var7.field_bc - 1;
              continue;
            }
            break;
          }
          var8.unlink(4);
          var8.unlinkDual(480);
          vd.field_h = vd.field_h - 1;
          var9 = mm.field_g;
          var9.a(param1, (byte) -117);
          var9.position = var9.position + 1;
          var5 = var9.position;
          var9.a((byte) 110, 1);
          var9.a(param0, -61);
          var9.b((byte) -53, -var5 + var9.position);
          stackIn_18_0 = null;
          return (String) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("nl.K(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private nl() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, int param2) {
        hk var6 = null;
        hk var7 = null;
        CipherPacketBuffer var4 = null;
        if (param2 != 5) {
          field_V = (String) null;
        }
        if (bj.field_j != param0) {
          var6 = (hk) (fm.field_a.a((long)bj.field_j, (byte) 92));
          var7 = var6;
          if (var7 != null) {
            var7.field_hc = null;
          }
          bj.field_j = param0;
          var4 = mm.field_g;
          var4.a(param1, (byte) -117);
          var4.a((byte) 108, 3);
          var4.a((byte) 113, 11);
          var4.d(param0, 21);
        }
    }

    static {
        field_db = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        field_V = "On";
        field_Z = "Accept unrated rematch";
    }
}
