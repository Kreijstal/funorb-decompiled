/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kf {
    static int field_b;
    static Random field_a;

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        kq.field_i = SoftwareRasterizer.field_c;
        FullscreenFocusCanvas.field_b = SoftwareRasterizer.field_i;
        IncomingAnimation.f(199);
        lia.field_j.a(0, -42 + MoveInfoPanel.field_e.field_p, 0, MoveInfoPanel.field_e.field_sb, (byte) 59);
        dea.field_m.a(rg.field_h, 31407, kt.field_m.field_sb, 0, 0);
        int var1 = 2 + rg.field_h;
        tv.field_o.a(kt.field_m.field_p - (IntrusiveDeque.field_c ? var1 : 0), 31407, kt.field_m.field_sb, 0, IntrusiveDeque.field_c ? var1 : 0);
        RageEvent.e(0);
        mc.field_g.a(40, 31407, MoveInfoPanel.field_e.field_sb, 0, -40 + MoveInfoPanel.field_e.field_p);
        BoardTile.field_f.a(30, 31407, FullHealSpecial.field_r.field_sb, 0, 0);
        nea.field_yb.a(FullHealSpecial.field_r.field_p - 72, param0 + 31413, FullHealSpecial.field_r.field_sb, 0, 30);
        fl.field_m.a(30, 31407, 68, 5, 5);
        if (param0 == -6) {
          nd.field_i.a(30, param0 + 31413, 78, 75, 5);
          ScavengerSpecial.field_q.a(30, param0 ^ -31403, 48, 155, 5);
          SplitSpecial.field_p.a(30, 31407, 48, 205, 5);
          var2 = IntrusiveDeque.field_c ? 250 : 200;
          vf.field_F.a(30, param0 + 31413, -var2 + 363, var2 + 5, 5);
          TextLinkRegion.field_l.a(30, 31407, -370 + FullHealSpecial.field_r.field_sb - 5, 370, 5);
          p.field_n.a((byte) -58, -10 + (nea.field_yb.field_p - 32), 5, 37, -5 + (nea.field_yb.field_sb - 5), rj.field_j, 2);
          var3 = (FullHealSpecial.field_r.field_sb + 2) / 2;
          ae.field_a.a(40, 31407, -2 + var3, 0, -40 + FullHealSpecial.field_r.field_p);
          if (!IntrusiveDeque.field_c) {
            var3 = 0;
          }
          BagpipeAnimation.field_y.a(40, 31407, -var3 + FullHealSpecial.field_r.field_sb, var3, FullHealSpecial.field_r.field_p - 40);
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 72) {
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        String var5 = null;
        int var3 = null != EffectBatch.field_n ? 1 : 0;
        int var4 = -114 % ((20 - param1) / 63);
        String var5Lifetime1;
        String var5Lifetime2;
        if (gf.field_k == 9) {
          if (!eu.a(dda.field_l, (byte) -126, w.field_g, cp.field_d, fl.field_p)) {
            if (gf.field_k == 10) {
              if (var3 == 0) {
                HomingMissileEvent.d(116);
                return true;
              }
              return false;
            }
            if (11 != gf.field_k) {
              return false;
            }
            if (!wg.field_g) {
              return false;
            }
            if (el.field_h != 2) {
              if (el.field_h == 2) {
                if (!IntrusiveDequeCursor.b(7)) {
                  return true;
                }
                var5 = (String) null;
                PetAttackSpecial.a(oa.field_vb, el.field_h, 52, (String) null, hda.field_l, param2);
                return true;
              }
              if (var3 == 0) {
                if (IntrusiveDequeCursor.b(7)) {
                  var5 = (String) null;
                  PetAttackSpecial.a(oa.field_vb, el.field_h, 52, (String) null, hda.field_l, param2);
                  return true;
                }
                return true;
              }
              return false;
            }
            if (eea.a(hda.field_l, we.field_b, 83)) {
              if (el.field_h != 2 &&
                var3 != 0) {
                return false;
              }
              if (IntrusiveDequeCursor.b(7)) {
                var5Lifetime2 = (String) null;
                PetAttackSpecial.a(oa.field_vb, el.field_h, 52, (String) null, hda.field_l, param2);
                return true;
              }
              return true;
            }
            return false;
          }
          if (cp.field_d != 2) {
            if (var3 == 0) {
              return ew.a(fl.field_p, w.field_g, cp.field_d, false, dda.field_l);
            }
            return false;
          }
          return ew.a(fl.field_p, w.field_g, cp.field_d, false, dda.field_l);
        }
        if (gf.field_k == 10) {
          if (var3 != 0) {
            return false;
          }
          HomingMissileEvent.d(116);
          return true;
        }
        if (11 == gf.field_k &&
          wg.field_g) {
          if (el.field_h == 2 &&
            !eea.a(hda.field_l, we.field_b, 83)) {
            return false;
          }
          if (el.field_h != 2 &&
            var3 != 0) {
            return false;
          }
          if (IntrusiveDequeCursor.b(7)) {
            var5Lifetime1 = (String) null;
            PetAttackSpecial.a(oa.field_vb, el.field_h, 52, (String) null, hda.field_l, param2);
            return true;
          }
          return true;
        }
        return false;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 1;
        field_a = new Random();
    }
}
