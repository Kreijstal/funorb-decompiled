/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_b;
    static int field_c;
    static bl field_a;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = pe.a(4096, param0);
        int var4 = DualLinkNode.a(98, param0);
        int var5 = pe.a(4096, param2);
        if (param1 > -44) {
          field_a = (bl) null;
        }
        int var6 = DualLinkNode.a(-120, param2);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        LetterTile var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          o.field_i = 0;
          mg.field_d = param0;
          stackIn_7_0 = (param0) ? 0 : -1;
          jl.field_j = stackIn_7_0;
          if (hf.field_f == null) {
            il.field_c = new int[][]{new int[]{34, 190, wk.carryoverRack.tiles.length * wl.field_K.field_n + 34, wl.field_K.field_m + 190}};
            wc.field_a = new int[][]{new int[]{161, 247, 161 + si.newRack.tiles.length * wl.field_K.field_n, wl.field_K.field_m + 247}};
            hf.field_f = new int[][]{new int[]{34, 114, wl.field_K.field_n * od.submissionRack.tiles.length + 34, wl.field_K.field_m + 114}, il.field_c[0], wc.field_a[0]};
            hd.field_c = new int[][]{hf.field_f[0], il.field_c[0]};
          }
          wk.carryoverRack.clear(true);
          si.newRack.clear(true);
          od.submissionRack.originX = 34;
          wk.carryoverRack.originX = 34;
          si.newRack.originX = 161;
          if (param1 != -13) {
            field_b = (String) null;
          }
          od.submissionRack.originY = 114;
          wk.carryoverRack.originY = 190;
          si.newRack.originY = 247;
          ac.field_n = new ld(1024, 8, 8);
          stackIn_15_0 = (!param0) ? 1 : 6;
          re.field_A = stackIn_15_0;
          if (dk.field_b) {
            hf.field_j = hf.field_j - 1;
            nc.field_t = nc.field_t - 1;
            dk.field_b = false;
          }
          sg.field_d = null;
          oh.field_j = 0;
          oj.field_u.g(-1);
          hc.field_u = 0;
          da.field_C = 0;
          vh.field_n = vh.field_n + (eh.field_a << 6);
          eh.field_a = 0;
          if (null != MouseInputHandler.field_c) {
            hf.field_j = hf.field_j - MouseInputHandler.field_c.field_o;
          }
          MouseInputHandler.field_c = we.field_l[am.field_n];
          hf.field_j = hf.field_j + MouseInputHandler.field_c.field_o;
          if (mg.field_d &&
            null != MouseInputHandler.field_c.field_b) {
            for (var2_int = 0; var2_int < MouseInputHandler.field_c.field_b.length(); var2_int++) {
              si.newRack.tiles[var2_int] = NodeHashTableIterator.a(si.newRack, var2_int, MouseInputHandler.field_c, (byte) 42, MouseInputHandler.field_c.field_b.charAt(var2_int));
              si.newRack.tiles[var2_int].field_x = false;
            }
          }
          if (mg.field_d &&
            null != MouseInputHandler.field_c.field_n) {
            if (sg.field_p != null) {
              sg.field_p.d(1);
            }
            sg.field_p = NodeHashTableIterator.a(de.field_d, 1, MouseInputHandler.field_c, (byte) 36, MouseInputHandler.field_c.field_n.charAt(1));
            var2 = sg.field_p;
            sg.field_p.destinationX = 1000;
            sg.field_p.field_x = true;
            var2.x = 1000;
          }
          var4 = 0;
          var2_intLifetime1 = var4;
          while (IterableNodeHashTable.field_g.length > var4) {
            IterableNodeHashTable.field_g[var4].setLength(0);
            IterableNodeHashTable.field_a[var4] = 0;
            var4++;
          }
          od.submissionRack.clear(true);
          wk.field_d = 0;
          dc.field_a = 0;
          eg.field_b = 0;
          n.field_a = 0;
          bi.field_J = 0;
          hi.field_a = 1;
          gk.field_e = 0;
          rb.field_a = 0;
          GameKeyHandler.field_c = 0;
          ad.field_e = false;
          wk.field_c = 0;
          bg.field_m = 1500;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2_ref), "rc.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "Retry";
    }
}
