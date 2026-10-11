/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends pg {
    byte[] field_j;
    static vn field_m;
    static int field_g;
    boolean field_k;
    static int field_h;
    static String field_i;
    static String field_l;

    final static void a(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        int var4Lifetime8;
        int var4Lifetime9;
        int var4Lifetime10;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var4Lifetime11;
        int var4Lifetime12;
        int var4Lifetime13;
        int var4Lifetime14;
        int var4Lifetime15;
        int var4Lifetime8Lifetime1;
        eh.field_e.h(0, 0);
        int var1 = 32;
        int var2 = 80;
        wm.field_H[15].c(var2, bo.field_d, 160, 64);
        if (null != hf.field_o) {
          var3 = 64 * hf.field_o.field_n / hf.field_o.field_w;
          hf.field_o.c(-(var3 / 2) + 80 + var2, bo.field_d, var3, 64);
        }
        wm.field_H[15].c(var2 + 160, bo.field_d, 224, 48);
        wm.field_H[15].c(464, bo.field_d, 96, 48);
        ih.field_e.c(464, 8 + bo.field_d);
        var3Lifetime1 = 53;
        mc.field_b.a(Integer.toString(var3Lifetime1), 464, 8 + bo.field_d, 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        mc.field_b.a("Orb coins Banked", 496, bo.field_d, 64, 48, 16777215, 0, 1, 1, mc.field_b.field_C);
        wm.field_H[15].c(80, 128 + (64 + bo.field_d) + 32, 480, 64);
        if ((1 & ch.field_b) <= 0) {
          if ((ch.field_b & 2) > 0) {
            mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4 = 64 + (128 + bo.field_d + 32);
            wm.field_H[6].c(var2 + 16, var4 + 16, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, var4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 4) > 0) {
            mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime11 = 64 + (32 + bo.field_d) + 128;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime11, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, 16 + var4Lifetime11, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (0 < (ch.field_b & 8)) {
            mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime12 = bo.field_d + 32 + 192;
            var5 = 100;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime12, var5, 32);
            mc.field_b.a("Yes", var2 + 16, var4Lifetime12 + 16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            wm.field_H[15].c(240 + var2 + 16 - (24 + var5), 16 + var4Lifetime12, var5, 32);
            mc.field_b.a("No", -var5 + (-8 + (var2 + 240)), var4Lifetime12 + 16, var5, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 16) > 0) {
            mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime13 = 128 + (bo.field_d + 32) + 64;
            wm.field_H[6].c(328, var4Lifetime13 + 16, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime13 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime13, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (param0 != 2341) {
            pb.a(-26);
          }
          if ((ch.field_b & 32) > 0) {
            mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime14 = 64 + (128 + bo.field_d) + 32;
            mc.field_b.a("Purchase completed.", 16 + var2, var4Lifetime14, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (!((ch.field_b & 64) <= 0)) {
            mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime15 = bo.field_d + 160 + 64;
            wm.field_H[15].c(328, 16 + var4Lifetime15, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime15 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          return;
        }
        mc.field_b.a("SHOW INFOS", 32, var1, 16777215, 0);
        var1 += 16;
        var4Lifetime1 = bo.field_d + 64;
        wm.field_H[15].c(var2, var4Lifetime1, 160, 160);
        de.d(3, 3, 16 + var2, 16 + var4Lifetime1, 128, 128);
        de.a(-64 + (80 + var2) - 1, 15 + var4Lifetime1, 130, 130, 0);
        wd.field_e.c(-64 + (var2 + 80), var4Lifetime1 + 16);
        var4Lifetime2 = 48 + bo.field_d;
        var5Lifetime1 = 176;
        int var6 = var2 + 160;
        int var7 = 320;
        wm.field_H[6].c(var6, var4Lifetime2, var7, var5Lifetime1);
        mc.field_b.a(sn.field_L, var6, var4Lifetime2 + 32, var7, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
        if ((2 & ch.field_b) > 0) {
          mc.field_b.a("This item is only availiable to members.", var6, 64 + var4Lifetime2, var7, 80, 16777215, 0, 1, 1, mc.field_b.field_C);
          ii.field_d.f(var6 - (-(var7 / 2) + 16), 80 + (var4Lifetime2 + 64));
          if ((ch.field_b & 2) > 0) {
            mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + bo.field_d + 32);
            wm.field_H[6].c(var2 + 16, var4Lifetime2 + 16, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 4) > 0) {
            mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (32 + bo.field_d) + 128;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime2, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, 16 + var4Lifetime2, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (0 < (ch.field_b & 8)) {
            mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = bo.field_d + 32 + 192;
            var5Lifetime2 = 100;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime2, var5Lifetime2, 32);
            mc.field_b.a("Yes", var2 + 16, var4Lifetime2 + 16, var5Lifetime2, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            wm.field_H[15].c(240 + var2 + 16 - (24 + var5Lifetime2), 16 + var4Lifetime2, var5Lifetime2, 32);
            mc.field_b.a("No", -var5Lifetime2 + (-8 + (var2 + 240)), var4Lifetime2 + 16, var5Lifetime2, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 16) > 0) {
            mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 128 + (bo.field_d + 32) + 64;
            wm.field_H[6].c(328, var4Lifetime2 + 16, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (param0 != 2341) {
            pb.a(-26);
          }
          if ((ch.field_b & 32) > 0) {
            mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + bo.field_d) + 32;
            mc.field_b.a("Purchase completed.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (!((ch.field_b & 64) <= 0)) {
            mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = bo.field_d + 160 + 64;
            wm.field_H[15].c(328, 16 + var4Lifetime2, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          return;
        }
        if (p.field_j != null) {
          mc.field_b.a(p.field_j, var6, 64 + var4Lifetime2, var7, 80, 16777215, 0, 1, 1, mc.field_b.field_C);
          var4Lifetime2 = -mc.field_b.field_C - 32 + (64 + (128 + (bo.field_d + 32)));
          mc.field_b.a("Orb coins to purchase", var6 + 32 + 32, var4Lifetime2, var7 - 80, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
          ih.field_e.c(var6 + 16, -16 + mc.field_b.field_C / 2 + var4Lifetime2 + 16);
          mc.field_b.a(Integer.toString(cb.field_f), var6 + 16, 16 + (mc.field_b.field_C / 2 + (var4Lifetime2 - 16)), 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          if ((ch.field_b & 2) > 0) {
            mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + bo.field_d + 32);
            wm.field_H[6].c(var2 + 16, var4Lifetime2 + 16, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 4) > 0) {
            mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (32 + bo.field_d) + 128;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime2, 216, 32);
            mc.field_b.a("Purchase", var2 + 16, 16 + var4Lifetime2, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (0 < (ch.field_b & 8)) {
            mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = bo.field_d + 32 + 192;
            var5Lifetime3 = 100;
            wm.field_H[15].c(var2 + 16, 16 + var4Lifetime2, var5Lifetime3, 32);
            mc.field_b.a("Yes", var2 + 16, var4Lifetime2 + 16, var5Lifetime3, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            wm.field_H[15].c(240 + var2 + 16 - (24 + var5Lifetime3), 16 + var4Lifetime2, var5Lifetime3, 32);
            mc.field_b.a("No", -var5Lifetime3 + (-8 + (var2 + 240)), var4Lifetime2 + 16, var5Lifetime3, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if ((ch.field_b & 16) > 0) {
            mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 128 + (bo.field_d + 32) + 64;
            wm.field_H[6].c(328, var4Lifetime2 + 16, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
            mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (param0 != 2341) {
            pb.a(-26);
          }
          if ((ch.field_b & 32) > 0) {
            mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = 64 + (128 + bo.field_d) + 32;
            mc.field_b.a("Purchase completed.", 16 + var2, var4Lifetime2, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (!((ch.field_b & 64) <= 0)) {
            mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime2 = bo.field_d + 160 + 64;
            wm.field_H[15].c(328, 16 + var4Lifetime2, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime2 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          return;
        }
        var4Lifetime3 = -mc.field_b.field_C - 32 + (64 + (128 + (bo.field_d + 32)));
        mc.field_b.a("Orb coins to purchase", var6 + 32 + 32, var4Lifetime3, var7 - 80, 32 + mc.field_b.field_C, 16777215, 0, 1, 1, mc.field_b.field_C);
        ih.field_e.c(var6 + 16, -16 + mc.field_b.field_C / 2 + var4Lifetime3 + 16);
        mc.field_b.a(Integer.toString(cb.field_f), var6 + 16, 16 + (mc.field_b.field_C / 2 + (var4Lifetime3 - 16)), 32, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        if ((ch.field_b & 2) > 0) {
          mc.field_b.a("SHOW MEMBER MESSAGE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime4 = 64 + (128 + bo.field_d + 32);
          wm.field_H[6].c(var2 + 16, var4Lifetime4 + 16, 216, 32);
          mc.field_b.a("Purchase", var2 + 16, var4Lifetime4 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
        if ((ch.field_b & 4) > 0) {
          mc.field_b.a("SHOW PURCHASE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime5 = 64 + (32 + bo.field_d) + 128;
          wm.field_H[15].c(var2 + 16, 16 + var4Lifetime5, 216, 32);
          mc.field_b.a("Purchase", var2 + 16, 16 + var4Lifetime5, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
        if (0 < (ch.field_b & 8)) {
          mc.field_b.a("SHOW CONFIRM", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime6 = bo.field_d + 32 + 192;
          var5Lifetime4 = 100;
          wm.field_H[15].c(var2 + 16, 16 + var4Lifetime6, var5Lifetime4, 32);
          mc.field_b.a("Yes", var2 + 16, var4Lifetime6 + 16, var5Lifetime4, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          wm.field_H[15].c(240 + var2 + 16 - (24 + var5Lifetime4), 16 + var4Lifetime6, var5Lifetime4, 32);
          mc.field_b.a("No", -var5Lifetime4 + (-8 + (var2 + 240)), var4Lifetime6 + 16, var5Lifetime4, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
        if ((ch.field_b & 16) > 0) {
          mc.field_b.a("SHOW WAIT", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime7 = 128 + (bo.field_d + 32) + 64;
          wm.field_H[6].c(328, var4Lifetime7 + 16, 216, 32);
          mc.field_b.a("Cancel", 328, var4Lifetime7 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          mc.field_b.a("Please wait for confirmation of your purchase.", 16 + var2, var4Lifetime7, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
        if (param0 == 2341) {
          if ((ch.field_b & 32) > 0) {
            mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime8 = 64 + (128 + bo.field_d) + 32;
            mc.field_b.a("Purchase completed.", 16 + var2, var4Lifetime8, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          if (!((ch.field_b & 64) <= 0)) {
            mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
            var1 += 16;
            var4Lifetime8Lifetime1 = bo.field_d + 160 + 64;
            wm.field_H[15].c(328, 16 + var4Lifetime8Lifetime1, 216, 32);
            mc.field_b.a("Cancel", 328, var4Lifetime8Lifetime1 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
          }
          return;
        }
        pb.a(-26);
        if ((ch.field_b & 32) > 0) {
          mc.field_b.a("SHOW COMPLETE", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime9 = 64 + (128 + bo.field_d) + 32;
          mc.field_b.a("Purchase completed.", 16 + var2, var4Lifetime9, 216, 64, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
        if (!((ch.field_b & 64) <= 0)) {
          mc.field_b.a("SHOW EXIT", 32, var1, 16777215, 0);
          var1 += 16;
          var4Lifetime10 = bo.field_d + 160 + 64;
          wm.field_H[15].c(328, 16 + var4Lifetime10, 216, 32);
          mc.field_b.a("Cancel", 328, var4Lifetime10 + 16, 216, 32, 16777215, 0, 1, 1, mc.field_b.field_C);
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 < 52) {
          field_h = -34;
          field_i = null;
          field_m = null;
          return;
        }
        field_i = null;
        field_m = null;
    }

    final static void a(int param0, int param1, f param2) {
        ab var6 = null;
        int var4 = 0;
        try {
          var6 = he.field_e;
          ab var3 = var6;
          var6.b((byte) -80, param1);
          var6.field_g = var6.field_g + 1;
          if (param0 != 32) {
            f var5 = (f) null;
            pb.a(-102, -101, (f) null);
          }
          var4 = var6.field_g;
          var6.f(1, (byte) -89);
          if (param2.field_k != null) {
            var6.f(param2.field_k.length, (byte) -64);
            var6.a(param2.field_k, 0, (byte) -86, param2.field_k.length);
          } else {
            var6.f(0, (byte) -92);
          }
          var6.a(true, var4);
          var6.field_g = var6.field_g - 4;
          param2.field_j = var6.d(-10674);
          var6.b(var6.field_g - var4, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "pb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    pb() {
    }

    static {
        field_m = new vn();
        field_i = "<%0> is offering an unrated rematch.";
        field_h = 0;
        field_l = "Shields you and your minions up to 5 points per round";
    }
}
