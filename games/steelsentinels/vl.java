/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends IntrusiveNode {
    int field_o;
    int field_s;
    int field_p;
    static e field_x;
    static boolean field_r;
    static boolean field_v;
    vl field_q;
    static int field_t;
    int field_w;
    int field_u;

    final static void d(int param0) {
        sf.field_t = SoftwareRaster.field_j;
        re.field_Z = SoftwareRaster.field_c;
        bh.a(0);
        sn.field_f.a(mg.field_Ub.field_Lb - 40 - 2, 0, mg.field_Ub.field_zb, 2, 0);
        Explosion.field_C.a(0, 0, db.field_b, 0, Sprite.field_l.field_zb);
        int var1 = 2 + db.field_b;
        fl.field_c.a(0, rm.field_p ? var1 : 0, -(!rm.field_p ? 0 : var1) + Sprite.field_l.field_Lb, 0, Sprite.field_l.field_zb);
        ql.b(true);
        sg.field_i.a(0, -40 + mg.field_Ub.field_Lb, 40, 0, mg.field_Ub.field_zb);
        qi.field_c.a(param0, 0, 30, 0, pc.field_q.field_zb);
        q.field_d.a(0, 30, -40 + pc.field_q.field_Lb - 2 - 30, 0, pc.field_q.field_zb);
        td.field_bc.a(0, 5, 30, 5, 68);
        dj.field_d.a(param0 + 0, 5, 30, 75, 78);
        BattleTerrain.field_q.a(0, 5, 30, 155, 48);
        pe.field_v.a(0, 5, 30, 205, 48);
        int var2 = !rm.field_p ? 200 : 250;
        ql.field_Vb.a(0, 5, 30, var2 + 5, 363 - var2);
        cf.field_w.a(0, 5, 30, 370, -5 + (-5 + pc.field_q.field_zb - 365));
        rn.field_y.a(-5 + (-5 + q.field_d.field_zb), -2048, ua.field_G, -10 + (q.field_d.field_Lb - 32), 2, 5, 37);
        int var3 = (pc.field_q.field_zb + 2) / 2;
        qm.field_b.a(0, pc.field_q.field_Lb - 40, 40, 0, var3 - 2);
        if (!rm.field_p) {
          var3 = 0;
        }
        uc.field_j.a(param0 ^ 0, -40 + pc.field_q.field_Lb, 40, var3, -var3 + pc.field_q.field_zb);
    }

    public static void a(byte param0) {
        if (param0 != 29) {
          return;
        }
        field_x = null;
    }

    final static ca a(cm param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ca stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 40) {
            field_x = (e) null;
          }
          var4 = param0.c(param1, param2 ^ 28734);
          var3 = var4;
          if (var4 == null) {
            return null;
          }
          stackIn_6_0 = new ca(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vl.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(cm param0, cm param1, boolean param2, int param3) {
        try {
          wn.a(jl.field_s, ei.field_o, ParticleEffect.field_K, uh.field_j, param2, 127, nh.field_d, dj.field_b, CipherPacketBuffer.field_H, nc.field_n, SceneWidget.field_ib, bd.field_f);
          dh.field_y = cf.a("chatfilter", "lobby", (byte) -62, param0);
          ec.field_e[2] = b.field_j;
          if (param3 >= -10) {
            field_v = true;
          }
          ec.field_e[0] = nl.field_V;
          ec.field_e[1] = ad.field_a;
          bk.a(param1, (byte) -114, gd.field_kb);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "vl.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        int var9 = SteelSentinels.obfuscationControl;
        if (!param6) {
          if (param2 < param1) {
            if (param1 < param0) {
              hb.a(param4, 114, param7, SoftwareRaster.field_g, param0, param3, param1, param2, param5);
              return;
            }
            if (param0 <= param2) {
              hb.a(param3, 122, param4, SoftwareRaster.field_g, param1, param7, param2, param0, param5);
              return;
            }
            hb.a(param3, 116, param7, SoftwareRaster.field_g, param1, param4, param0, param2, param5);
            return;
          }
          if (param0 > param2) {
            hb.a(param4, 126, param3, SoftwareRaster.field_g, param0, param7, param2, param1, param5);
            return;
          }
          if (param0 <= param1) {
            hb.a(param7, -127, param4, SoftwareRaster.field_g, param2, param3, param1, param0, param5);
            return;
          }
          hb.a(param7, 123, param3, SoftwareRaster.field_g, param2, param4, param0, param1, param5);
          return;
        }
        cm var10 = (cm) null;
        vl.a((cm) null, 23, -121);
        if (param2 < param1) {
          if (param1 < param0) {
            hb.a(param4, 114, param7, SoftwareRaster.field_g, param0, param3, param1, param2, param5);
            return;
          }
          if (param0 <= param2) {
            hb.a(param3, 122, param4, SoftwareRaster.field_g, param1, param7, param2, param0, param5);
            return;
          }
          hb.a(param3, 116, param7, SoftwareRaster.field_g, param1, param4, param0, param2, param5);
          return;
        }
        if (param0 > param2) {
          hb.a(param4, 126, param3, SoftwareRaster.field_g, param0, param7, param2, param1, param5);
          return;
        }
        if (param0 <= param1) {
          hb.a(param7, -127, param4, SoftwareRaster.field_g, param2, param3, param1, param0, param5);
          return;
        }
        hb.a(param7, 123, param3, SoftwareRaster.field_g, param2, param4, param0, param1, param5);
    }

    final static boolean e(int param0) {
        if (param0 != 37) {
          vl.e(49);
          return bl.field_a;
        }
        return bl.field_a;
    }

    vl(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param4;
        this.field_s = param1;
        this.field_u = param3;
        this.field_p = param0;
        this.field_w = param2;
    }

    static {
        field_r = false;
        field_v = true;
    }
}
