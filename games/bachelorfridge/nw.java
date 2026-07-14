/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nw extends td {
    static String field_r;
    static String field_t;
    static kv[] field_p;
    static String field_s;
    static String field_q;

    nw(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        ((nw) this).field_n = param3;
        ((nw) this).field_k = param2;
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        cja var4 = null;
        var3 = ((nw) this).field_h.a(57, param0);
        var4 = new cja(((nw) this).field_g, new nq(var3));
        var4.field_s = ((nw) this).field_k;
        var4.field_u = ((nw) this).field_n;
        if (param1 != 3) {
          field_p = null;
          var4.field_q = 2 * kla.a(4, param0.field_w, param1 ^ -2147483645) + 6;
          return (ii) (Object) var4;
        } else {
          var4.field_q = 2 * kla.a(4, param0.field_w, param1 ^ -2147483645) + 6;
          return (ii) (Object) var4;
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          nw.a(false, false, (byte) -101);
          field_t = null;
          field_s = null;
          field_p = null;
          field_r = null;
          field_q = null;
          return;
        } else {
          field_t = null;
          field_s = null;
          field_p = null;
          field_r = null;
          field_q = null;
          return;
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        Object var4 = null;
        vma.a((byte) -6, param0, param1, (String) null);
        int var3 = -72 / ((-21 - param2) / 58);
    }

    final static void a(vr param0, byte param1) {
        byte[] var2 = null;
        lu var3 = null;
        byte[] var4 = null;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        lu var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var24 = param0.a((byte) 123, "MoveTable.csv", "");
        var17 = var24;
        var13 = var17;
        var8 = var13;
        var4 = var8;
        var2 = var4;
        var9 = new lu(var24);
        wca.a((byte) -121);
        vi.b(16);
        ln.f(-93);
        hba.c(7);
        kma.d(param1 + -109);
        lg.c(8);
        li.e(-117);
        mk.a((byte) -43);
        ut.c(-22021);
        ev.a((byte) 80);
        if (param1 != 2) {
          field_t = null;
          lka.field_E = qs.a(false, var9);
          hga.a(true, var24);
          var25 = param0.a((byte) 123, "UnlockTable.csv", "");
          var18 = var25;
          var14 = var18;
          var10 = var14;
          var5 = var10;
          var2 = var5;
          qh.a((byte) -104);
          bj.a(var25, (byte) 22);
          lg.a(-92);
          var26 = param0.a((byte) 123, "UnlockerTable.csv", "");
          var19 = var26;
          var15 = var19;
          var11 = var15;
          var6 = var11;
          var2 = var6;
          sp.a(var26, param1 ^ -5);
          var27 = param0.a((byte) 123, "CreatureTable.csv", "");
          var20 = var27;
          var16 = var20;
          var12 = var16;
          var7 = var12;
          var2 = var7;
          var3 = new lu(var27);
          qs.b(false);
          an.a(var27, -49);
          wv.a((byte) -73, var27);
          fi.field_m = null;
          me.field_t = null;
          du.field_a = null;
          oi.field_v = null;
          dl.field_h = null;
          cma.field_x = null;
          id.field_i = null;
          ng.field_f = null;
          cw.field_zb = null;
          eo.field_f = null;
          i.field_h = null;
          return;
        } else {
          lka.field_E = qs.a(false, var9);
          hga.a(true, var24);
          var28 = param0.a((byte) 123, "UnlockTable.csv", "");
          var21 = var28;
          var14 = var21;
          var10 = var14;
          var5 = var10;
          var2 = var5;
          qh.a((byte) -104);
          bj.a(var28, (byte) 22);
          lg.a(-92);
          var29 = param0.a((byte) 123, "UnlockerTable.csv", "");
          var22 = var29;
          var15 = var22;
          var11 = var15;
          var6 = var11;
          var2 = var6;
          sp.a(var29, param1 ^ -5);
          var30 = param0.a((byte) 123, "CreatureTable.csv", "");
          var23 = var30;
          var16 = var23;
          var12 = var16;
          var7 = var12;
          var2 = var7;
          var3 = new lu(var30);
          qs.b(false);
          an.a(var30, -49);
          wv.a((byte) -73, var30);
          fi.field_m = null;
          me.field_t = null;
          du.field_a = null;
          oi.field_v = null;
          dl.field_h = null;
          cma.field_x = null;
          id.field_i = null;
          ng.field_f = null;
          cw.field_zb = null;
          eo.field_f = null;
          i.field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Mute this player for 48 hours";
        field_t = "Click on a creature or its portrait to select it.";
        field_s = "TAB - hide chat temporarily";
        field_q = "Password is valid";
    }
}
