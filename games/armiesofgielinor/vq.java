/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_d;
    static hd field_c;
    static dn field_a;
    static String field_g;
    static String field_f;
    static String field_e;
    static ru field_b;

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        String[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        String stackIn_42_2 = null;
        String[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        String stackIn_48_2 = null;
        String stackIn_89_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          no.field_J = param0;
          ip.field_e = true;
          if (no.field_J == 0) {
            var3_int = iu.a(pf.field_d, SummonRequest.field_z, 7502, TaggedMapData.field_b, du.field_b);
            var4 = 3 + var3_int;
            TileMetadata.field_h = new int[var4];
            wp.field_v = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              TileMetadata.field_h[var5] = -1;
            }
            mi.field_G = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              wp.field_v[var5] = du.field_b[var5];
            }
            wp.field_v[-3 + var4] = "";
            wp.field_v[-2 + var4] = tg.field_j;
            TileMetadata.field_h[var4 - 2] = 0;
            mi.field_G[0] = 4;
            wp.field_v[-1 + var4] = pd.field_f;
            TileMetadata.field_h[-1 + var4] = 1;
            mi.field_G[1] = 5;
          } else if (1 == no.field_J) {
            var3_int = iu.a(pf.field_d, SummonRequest.field_z, 7502, TaggedMapData.field_b, du.field_b);
            var4 = var3_int + 2;
            TileMetadata.field_h = new int[var4];
            wp.field_v = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              TileMetadata.field_h[var5] = -1;
            }
            mi.field_G = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              wp.field_v[var5] = du.field_b[var5];
            }
            wp.field_v[var4 - 2] = "";
            wp.field_v[-1 + var4] = pd.field_f;
            TileMetadata.field_h[-1 + var4] = 0;
            mi.field_G[0] = 5;
          } else if (no.field_J != 2) {
            if (no.field_J == 3) {
              if (!ft.field_m.field_e) {
                var3_int = iu.a(pf.field_d, tl.field_a, 7502, TaggedMapData.field_b, du.field_b);
              } else {
                var3_int = iu.a(pf.field_d, ud.field_ab, 7502, TaggedMapData.field_b, du.field_b);
              }
              var4 = var3_int + 2;
              TileMetadata.field_h = new int[var4];
              wp.field_v = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                TileMetadata.field_h[var5] = -1;
              }
              mi.field_G = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                wp.field_v[var5] = du.field_b[var5];
              }
              wp.field_v[-2 + var4] = "";
              wp.field_v[var4 - 1] = pd.field_f;
              TileMetadata.field_h[-1 + var4] = 0;
              mi.field_G[0] = 5;
            } else if (no.field_J == 4) {
              var3_int = iu.a(pf.field_d, MoveAttackRequest.field_y, 7502, TaggedMapData.field_b, du.field_b);
              var4 = 2 + var3_int;
              wp.field_v = new String[var4];
              TileMetadata.field_h = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                TileMetadata.field_h[var5] = -1;
              }
              mi.field_G = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                wp.field_v[var5] = du.field_b[var5];
              }
              wp.field_v[-2 + var4] = "";
              wp.field_v[-1 + var4] = pd.field_f;
              TileMetadata.field_h[-1 + var4] = 0;
              mi.field_G[0] = 5;
            } else {
              if (no.field_J != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = iu.a(pf.field_d, hb.field_a, 7502, TaggedMapData.field_b, du.field_b);
              var4 = 3 + var3_int;
              wp.field_v = new String[var4];
              TileMetadata.field_h = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                TileMetadata.field_h[var5] = -1;
              }
              mi.field_G = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                wp.field_v[var5] = du.field_b[var5];
              }
              wp.field_v[var4 - 3] = "";
              wp.field_v[var4 - 2] = oo.field_j;
              TileMetadata.field_h[-2 + var4] = 0;
              mi.field_G[0] = 3;
              wp.field_v[-1 + var4] = pd.field_f;
              TileMetadata.field_h[var4 - 1] = 1;
              mi.field_G[1] = 5;
            }
          } else {
            var3_int = iu.a(pf.field_d, fo.a(4800, db.field_f, new String[]{"<br><%0><br>"}), 7502, TaggedMapData.field_b, du.field_b);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(du.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            mo.field_i = new String[var4];
            vm.a(du.field_b, 0, mo.field_i, 0, var4);
            hg.field_d = new String[var3_int + (-var4 - 1)];
            vm.a(du.field_b, 1 + var4, hg.field_d, 0, -1 + var3_int - var4);
            var4 = -1;
            var3_int = iu.a(pf.field_d, fo.a(4800, SummonAction.field_v, new String[]{"<br><%0><br>"}), 7502, TaggedMapData.field_b, du.field_b);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(du.field_b[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            va.field_A = new String[var4];
            vm.a(du.field_b, 0, va.field_A, 0, var4);
            IntrusiveNode.field_f = new String[var3_int - var4 - 1];
            vm.a(du.field_b, var4 + 1, IntrusiveNode.field_f, 0, -1 + (-var4 + var3_int));
            if (va.field_A.length <= mo.field_i.length) {
              stackIn_31_0 = mo.field_i.length;
            } else {
              stackIn_31_0 = va.field_A.length;
            }
            var5 = stackIn_31_0;
            if (IntrusiveNode.field_f.length > hg.field_d.length) {
              stackIn_34_0 = IntrusiveNode.field_f.length;
            } else {
              stackIn_34_0 = hg.field_d.length;
            }
            var6 = stackIn_34_0;
            var7 = var6 + var5 + 7;
            TileMetadata.field_h = new int[var7];
            wp.field_v = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              TileMetadata.field_h[var8] = -1;
            }
            TileMetadata.field_h[1] = 0;
            mi.field_G = new int[2];
            wp.field_v[0] = c.field_d;
            wp.field_v[1] = ui.field_e;
            mi.field_G[1] = 2;
            wp.field_v[5] = "";
            mi.field_G[0] = 5;
            wp.field_v[4] = ts.field_f;
            wp.field_v[2] = od.field_e;
            wp.field_v[3] = WeightedScoreStrategy.field_m;
            TileMetadata.field_h[3] = 1;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_41_0 = wp.field_v;
              stackIn_41_1 = 6 + var8Lifetime2;
              if (-var5 + (va.field_A.length + var8Lifetime2) < 0) {
                stackIn_42_2 = "";
              } else {
                stackIn_42_2 = va.field_A[-var5 + (va.field_A.length + var8Lifetime2)];
              }
              stackIn_41_0[stackIn_41_1] = stackIn_42_2;
            }
            wp.field_v[var5 + 6] = null;
            TileMetadata.field_h[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_47_0 = wp.field_v;
              stackIn_47_1 = var5 + 7 + var8Lifetime3;
              if (IntrusiveNode.field_f.length <= var8Lifetime3) {
                stackIn_48_2 = "";
              } else {
                stackIn_48_2 = IntrusiveNode.field_f[var8Lifetime3];
              }
              stackIn_47_0[stackIn_47_1] = stackIn_48_2;
            }
            vi.b(71);
          }
          ug.field_c.itemCount = mi.field_G.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < wp.field_v.length; var4Lifetime1++) {
            stackIn_89_0 = wp.field_v[var4Lifetime1];
            stackIn_90_1 = !(TileMetadata.field_h[var4Lifetime1] < 0);
            var5Lifetime1 = lg.a(stackIn_89_0, stackIn_90_1, (byte) -101);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (no.field_J == 2) {
            var10 = mo.field_i;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = lg.a(var11, false, (byte) -128);
              if (var7Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = hg.field_d;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = lg.a(var12, false, (byte) -122);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          m.field_i = (el.field_c + cp.field_a << 1) * ug.field_c.itemCount;
          var4Lifetime2 = 0;
          var5Lifetime3 = -42 % ((-39 - param2) / 37);
          while (wp.field_v.length > var4Lifetime2) {
            stackIn_115_0 = m.field_i;
            if (0 > TileMetadata.field_h[var4Lifetime2]) {
              stackIn_116_1 = fh.field_e;
            } else {
              stackIn_116_1 = TelepopEvent.field_B;
            }
            m.field_i = stackIn_115_0 + stackIn_116_1;
            var4Lifetime2++;
          }
          od.field_b = -(m.field_i >> 1) + ar.field_C;
          lg.field_b = new int[wp.field_v.length][];
          var4Lifetime3 = 0;
          var5Lifetime4 = od.field_b;
          while (wp.field_v.length > var4Lifetime3) {
            var6Lifetime1 = TileMetadata.field_h[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = lg.a(wp.field_v[var4Lifetime3], true, (byte) -89);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + rk.field_B;
              var5Lifetime4 = var5Lifetime4 + cp.field_a;
              lg.field_b[var4Lifetime3] = new int[4];
              lg.field_b[var4Lifetime3][0] = var8Lifetime1 - et.field_b;
              lg.field_b[var4Lifetime3][1] = var5Lifetime4;
              lg.field_b[var4Lifetime3][2] = var7Lifetime2 + (et.field_b << 1);
              var5Lifetime4 = var5Lifetime4 + (TelepopEvent.field_B + (cp.field_a + (el.field_c << 1)));
              lg.field_b[var4Lifetime3][3] = TelepopEvent.field_B + (el.field_c << 1);
            } else {
              var5Lifetime4 = var5Lifetime4 + fh.field_e;
            }
            var4Lifetime3++;
          }
          if (no.field_J != 2) {
            ug.field_c.restoreSelection(0, param1, TeleportEvent.a(AiPlanningStrategy.field_d, 120, ko.field_b), 0);
          } else {
            ug.field_c.restoreSelection(-1, param1, -1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "vq.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 < 95) {
          field_c = (hd) null;
        }
        field_f = null;
    }

    final static boolean a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = wt.a(param0, (byte) 65, false);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vq.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(CipherPacketBuffer param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            field_b = (ru) null;
          }
          stackIn_5_0 = (param0.readBits(-108, 1) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("vq.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Reject <%0> from this game";
        field_e = "Liquids to permanently affect your units and your enemy's.";
        field_f = "Back to Menu";
    }
}
