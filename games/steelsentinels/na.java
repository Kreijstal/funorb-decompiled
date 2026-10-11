/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    int field_w;
    String field_d;
    String field_s;
    int field_e;
    int field_k;
    String field_o;
    static String field_v;
    static IndexedSprite field_a;
    SceneWidget field_m;
    int[] field_l;
    int field_t;
    boolean field_g;
    static int field_b;
    static String field_c;
    long field_j;
    int field_n;
    String field_p;
    static String field_q;
    static String field_u;
    static int field_i;
    static String field_h;
    static String field_r;
    static long field_f;

    final static void a(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ob var4 = null;
        int var4_int = 0;
        int var5 = 0;
        rn var5_ref_rn = null;
        int[] var6 = null;
        int var8 = 0;
        CipherPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (!param0) {
            field_q = (String) null;
          }
          var10 = rf.field_d;
          var2 = var10.readUnsignedByte((byte) -87);
          var3 = var10.readUnsignedByte((byte) -80);
          if (var2 == 0) {
            var4 = (ob) (ti.field_z.first(13058));
            if (var4 == null) {
              pm.m(123);
              return;
            }
            var5 = jg.field_f - var10.position;
            var12 = var4.field_p;
            var11 = var12;
            var6 = var11;
            if (var12.length << 2 < var5) {
              var5 = var12.length << 2;
            }
            for (var7 = 0; var7 < var5; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte((byte) -54) << (ec.a(var7, 3) << 8));
            }
            var4.unlink(4);
            return;
          }
          if (var2 == 1) {
            var4_int = var10.f(27);
            var5_ref_rn = (rn) (sn.field_r.first(13058));
            while (var5_ref_rn != null) {
              if (var5_ref_rn.field_p != var3 ||
                var4_int != var5_ref_rn.field_x) {
                var5_ref_rn = (rn) (sn.field_r.next((byte) -26));
                continue;
              }
              break;
            }
            if (var5_ref_rn != null) {
              var5_ref_rn.unlink(4);
              return;
            }
            pm.m(73);
            return;
          }
          sj.a("LR1: " + ci.a((byte) 94), -102, (Throwable) null);
          pm.m(83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "na.B(" + param0 + ')');
        }
    }

    final int a(byte param0) {
        if (!this.field_g && (this.field_k != 2 ||
          0 >= this.field_t)) {
          if (~GameplayController.field_G == ~this.field_j) {
            return 1;
          }
          if (param0 != 58) {
            this.field_k = 23;
          }
          if (qc.field_P != 2) {
            return 0;
          }
          if (pf.a(this.field_p, param0 ^ -43)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 >= -92) {
            String var3 = (String) null;
            na.a((String) null, (byte) -75);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "na.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 > -39) {
          field_q = (String) null;
        }
        CipherPacketBuffer var3 = mm.field_g;
        var3.writeCipheredOpcode(param1, (byte) -117);
        var3.writeByte((byte) 120, 3);
        var3.writeByte((byte) 110, 9);
        var3.writeShort(param2, 47);
    }

    public static void a(int param0) {
        field_v = null;
        field_q = null;
        field_h = null;
        field_a = null;
        if (param0 != 2) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          na.a((java.applet.Applet) null, -9);
        }
        field_r = null;
        field_c = null;
        field_u = null;
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_16_0 = false;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = SteelSentinels.obfuscationControl;
          try {
            if (sn.field_d) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (hn.a(param0, (byte) -96, "getcookies"));
              var4 = ka.a(';', false, var3);
              for (var5 = param1; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_16_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref2;
            stackIn_19_1 = new StringBuilder().append("na.C(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(boolean param0) {
        this.field_p = jk.field_e;
        this.field_d = b.field_g;
        this.field_t = be.field_b;
        this.field_w = dk.field_a;
        this.field_e = gd.field_lb;
        this.field_s = uj.field_a;
        this.field_k = m.field_a;
        this.field_j = ni.field_d;
        this.field_o = bg.field_F;
        if (param0) {
          this.field_l = bc.field_ob;
        } else {
          this.field_l = null;
        }
        this.field_g = oh.field_e;
        this.field_n = t.field_k;
    }

    na(int param0, String param1, int param2, String param3, String param4) {
        try {
          this.field_n = 0;
          this.field_j = 0L;
          this.field_o = param4;
          this.field_s = param3;
          this.field_l = null;
          this.field_w = 0;
          this.field_g = true;
          this.field_p = param1;
          this.field_t = 0;
          this.field_k = param0;
          this.field_e = param2;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 51;
        field_v = "You are not currently logged in to the game.";
        field_c = "You are now cleared for use with the following items:";
        field_q = "Mouse over an icon for details";
        field_u = "Test Field";
        field_a = new IndexedSprite(1, 1, 1);
        field_h = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_r = "RuneScape clan";
    }
}
