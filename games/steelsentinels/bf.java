/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends gd {
    static String field_Db;
    static boolean field_Gb;
    static SceneWidget field_Ab;
    static String field_Bb;
    static int field_Fb;
    static IndexedSprite[] field_Cb;
    static String field_zb;
    static String field_Eb;

    bf(ka param0, lh param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(byte param0) {
        field_zb = null;
        field_Ab = null;
        field_Bb = null;
        field_Eb = null;
        field_Db = null;
        field_Cb = null;
        if (param0 > -110) {
          field_Ab = (SceneWidget) null;
        }
    }

    final static kf a(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = SteelSentinels.obfuscationControl;
        kf var5 = (kf) (SentinelCommand.field_w.first(13058));
        int var6 = -56 % ((-3 - param0) / 44);
        while (var5 != null) {
          if (var5.field_C == param2) {
            return var5;
          }
          var5 = (kf) (SentinelCommand.field_w.next((byte) -28));
        }
        var5 = new kf();
        var5.field_u = param4;
        var5.field_w = param1;
        var5.field_C = param2;
        SentinelCommand.field_w.addLast(3, var5);
        ma.a(param3, var5, -2864);
        return var5;
    }

    final static void a(byte param0, boolean param1) {
        SceneWidget stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        SceneWidget stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        SceneWidget stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        SceneWidget stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        if (param0 > -102) {
          return;
        }
        fe.a(-640 + SoftwareRaster.field_c >> 1, 0, -102, 640 + SoftwareRaster.field_c >> 1, SoftwareRaster.field_j);
        if (SentinelCommand.field_t > 0) {
          if (null != ta.field_e) {
            ta.field_e.f(mg.field_Ub.field_Y, 0);
          }
          stackIn_9_0 = mg.field_Ub;
          stackIn_10_1 = (param1) && (!im.field_b);
          ((SceneWidget) (Object) stackIn_9_0).a(stackIn_10_1, (byte) 126);
          stackIn_13_0 = pc.field_q;
          stackIn_14_1 = (param1) && (!im.field_b);
          ((SceneWidget) (Object) stackIn_13_0).a(stackIn_14_1, (byte) 127);
        }
        if (!(bd.field_c <= 0) ||
          !(fj.field_f <= 0)) {
          if (null != ta.field_e) {
            ta.field_e.f(ql.field_ec.field_Y, 0);
          }
          stackIn_23_0 = ql.field_ec;
          stackIn_24_1 = (param1) && (!vb.field_c);
          ((SceneWidget) (Object) stackIn_23_0).a(stackIn_24_1, (byte) 127);
          stackIn_27_0 = gl.field_y;
          stackIn_28_1 = (param1) && (!vb.field_c);
          ((SceneWidget) (Object) stackIn_27_0).a(stackIn_28_1, (byte) 126);
        }
        tk.$cfr$intArgs$f$20d51497949f(98);
    }

    final static void a(int param0, int param1, int param2, cc param3, kg param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dd var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          kk.a(param3, -1, -1, (int[]) null, param3.field_mc, param3.field_Vb, 1073741824, param3.field_ec, param4);
          an.field_i.a(true, (byte) -126);
          an.field_i.a((int[]) null, -2, 0);
          an.field_i.c(-121);
          var12 = an.field_i;
          var8 = param1;
          var9 = param6;
          var10 = param0;
          var11 = param5;
          var12.field_j.a(var11, var10, var9, (byte) -101, var8);
          if (param2 != 4) {
            bf.a((byte) -65, -107, 25, 12, -73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("bf.JB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, String param2) {
        try {
          nm.field_p = param1;
          kc.field_A = true;
          ch.field_O = new k(ag.field_p, gf.field_d, param2, de.field_d, nm.field_p);
          ag.field_p.a(ch.field_O, -118);
          if (param0 > -63) {
            bf.m(57);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bf.MB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void m(int param0) {
        Sprite.field_l = new SceneWidget(0L, (SceneWidget) null);
        if (param0 != 854) {
          field_zb = (String) null;
        }
        if (rm.field_p) {
          Sprite.field_l.a(Explosion.field_C, 126);
        }
        Sprite.field_l.a(fl.field_c, 122);
        sn.field_f = new uf(kh.field_p, Sprite.field_l);
        mg.field_Ub = new SceneWidget(0L, (SceneWidget) null);
        mg.field_Ub.a(sn.field_f.field_d, param0 - 734);
        mg.field_Ub.a(sg.field_i, 120);
        vl.d(0);
    }

    final void c(lh param0, int param1) {
        try {
          super.c(param0, param1 ^ 0);
          if (param1 != -22908735) {
            field_Bb = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bf.NB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(int param0, int param1, byte param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (0 == param0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var10 = param3[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param1 + param0;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          if (param2 != 50) {
            bf.m((byte) 37);
          }
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param3[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_25_0 = var6.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("bf.KB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_Gb = false;
        field_Db = "Return to Campaign";
        field_Bb = "Elapsed time";
        field_zb = "TECH VALUE: <%0> (<%1>)";
        field_Eb = "Mission Failed";
    }
}
