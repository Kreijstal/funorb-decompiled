/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn extends pp {
    static String field_s;
    static int field_t;
    static BitmapFont field_u;
    static long field_r;

    wn(long param0, String param1) {
        super(param0, param1);
    }

    public static void b(boolean param0) {
        field_s = null;
        if (!param0) {
          wn.a(-112, -101);
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        param1 = param1 & 8191;
        if (param0 <= -122) {
          if (param1 < 4096) {
            if (param1 >= 2048) {
              stackIn_19_0 = -PortalView.field_K[param1 - 2048];
            } else {
              stackIn_19_0 = PortalView.field_K[2048 - param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 6144) {
            stackIn_15_0 = -PortalView.field_K[6144 - param1];
          } else {
            stackIn_15_0 = PortalView.field_K[-6144 + param1];
          }
          return stackIn_15_0;
        }
        field_s = (String) null;
        if (param1 < 4096) {
          if (param1 >= 2048) {
            stackIn_9_0 = -PortalView.field_K[param1 - 2048];
          } else {
            stackIn_9_0 = PortalView.field_K[2048 - param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 6144) {
          stackIn_5_0 = -PortalView.field_K[6144 - param1];
        } else {
          stackIn_5_0 = PortalView.field_K[-6144 + param1];
        }
        return stackIn_5_0;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        dm.field_Qb = SoftwareRasterizer.height;
        kp.field_l = SoftwareRasterizer.width;
        v.a(param0 ^ 196);
        de.field_b.a(0, qe.field_k.field_zb, 0, (byte) -74, -40 + (qe.field_k.field_z - 2));
        ql.field_b.setBounds(jk.field_f, 0, lo.field_g.field_zb, 0, param0 - 3347);
        int var1 = jk.field_f + 2;
        pd.field_b.setBounds(lo.field_g.field_z - (!GradientOutlineTextPainter.field_u ? 0 : var1), GradientOutlineTextPainter.field_u ? var1 : 0, lo.field_g.field_zb, 0, -3344);
        NodeHashTableIterator.a(false);
        kj.field_u.setBounds(40, qe.field_k.field_z - 40, qe.field_k.field_zb, 0, -3344);
        if (param0 != 3) {
          field_t = -52;
          ro.field_O.setBounds(30, 0, cm.field_a.field_zb, 0, -3344);
          ml.field_Lb.setBounds(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
          PacketBuffer.field_g.setBounds(30, 5, 68, 5, -3344);
          ud.field_M.setBounds(30, 5, 78, 75, -3344);
          LaboratoryScreen.field_l.setBounds(30, 5, 48, 155, param0 ^ -3341);
          sc.field_d.setBounds(30, 5, 48, 205, -3344);
          var2 = !GradientOutlineTextPainter.field_u ? 200 : 250;
          InflaterDecompressor.field_h.setBounds(30, 5, -var2 + 363, var2 + 5, -3344);
          AgeValidator.field_w.setBounds(30, 5, cm.field_a.field_zb - 5 - 5 - 365, 370, -3344);
          SimEntity.field_H.a(DualLinkNode.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
          var3 = (2 + cm.field_a.field_zb) / 2;
          PasswordValidator.field_t.setBounds(40, -40 + cm.field_a.field_z, var3 - 2, 0, param0 - 3347);
          if (!GradientOutlineTextPainter.field_u) {
            var3 = 0;
          }
          ArrayWidgetGroup.field_L.setBounds(40, -40 + cm.field_a.field_z, -var3 + cm.field_a.field_zb, var3, -3344);
          return;
        }
        ro.field_O.setBounds(30, 0, cm.field_a.field_zb, 0, -3344);
        ml.field_Lb.setBounds(-30 + (-40 + cm.field_a.field_z - 2), 30, cm.field_a.field_zb, 0, -3344);
        PacketBuffer.field_g.setBounds(30, 5, 68, 5, -3344);
        ud.field_M.setBounds(30, 5, 78, 75, -3344);
        LaboratoryScreen.field_l.setBounds(30, 5, 48, 155, param0 ^ -3341);
        sc.field_d.setBounds(30, 5, 48, 205, -3344);
        var2Lifetime1 = !GradientOutlineTextPainter.field_u ? 200 : 250;
        InflaterDecompressor.field_h.setBounds(30, 5, -var2Lifetime1 + 363, var2Lifetime1 + 5, -3344);
        AgeValidator.field_w.setBounds(30, 5, cm.field_a.field_zb - 5 - 5 - 365, 370, -3344);
        SimEntity.field_H.a(DualLinkNode.field_o, 2, -10 + ml.field_Lb.field_zb, 5, -37 + ml.field_Lb.field_z - 5, param0 ^ -31468, 37);
        var3Lifetime1 = (2 + cm.field_a.field_zb) / 2;
        PasswordValidator.field_t.setBounds(40, -40 + cm.field_a.field_z, var3Lifetime1 - 2, 0, param0 - 3347);
        if (!GradientOutlineTextPainter.field_u) {
          var3Lifetime1 = 0;
        }
        ArrayWidgetGroup.field_L.setBounds(40, -40 + cm.field_a.field_z, -var3Lifetime1 + cm.field_a.field_zb, var3Lifetime1, -3344);
    }

    final pi b(int param0) {
        if (param0 != 7) {
          return (pi) null;
        }
        return ke.field_f;
    }

    static {
        field_s = "Focused";
        field_t = (int)(Math.sqrt(2.0) * 9.0) + 1;
    }
}
