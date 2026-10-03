/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    int field_b;
    static String cancelText;
    int field_a;
    static int[] field_c;
    static boolean field_e;

    final static boolean b(int param0) {
        if (param0 != 0) {
            field_c = (int[]) null;
            return true;
        }
        return true;
    }

    final static void a(byte param0) {
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        TriangleMesh var4_ref_nf = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        TriangleMesh var17 = null;
        var19 = Geoblox.field_C;
        try {
          IntKeyLookup.meshCameraTransform = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ArchiveIndex.field_l.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_nf = ArchiveIndex.field_l[var3];
            var4_ref_nf.refreshBounds((byte) -99);
            Geoblox.a((byte) -112, var3);
            var5 = var4_ref_nf.minX + var4_ref_nf.maxX >> 1;
            var6 = var4_ref_nf.minY + var4_ref_nf.maxY >> 1;
            var7 = var4_ref_nf.maxZ + var4_ref_nf.minZ >> 1;
            var8 = IntKeyLookup.meshCameraTransform[9] >> 2;
            var9 = IntKeyLookup.meshCameraTransform[10] >> 2;
            var10_int = IntKeyLookup.meshCameraTransform[11] >> 2;
            var11 = var10_int * lk.meshModelTransform[5] + var8 * lk.meshModelTransform[3] + lk.meshModelTransform[4] * var9 >> 14;
            var12 = var9 * lk.meshModelTransform[7] + (var8 * lk.meshModelTransform[6] + lk.meshModelTransform[8] * var10_int) >> 14;
            var13 = var10_int * lk.meshModelTransform[11] + (var8 * lk.meshModelTransform[9] + lk.meshModelTransform[10] * var9) >> 14;
            var2[var3] = var5 * var11 + var12 * var6 + var13 * var7 >> 16;
          }
          var3 = IntKeyLookup.meshCameraTransform[9] >> 8;
          var4 = IntKeyLookup.meshCameraTransform[10] >> 8;
          var5 = IntKeyLookup.meshCameraTransform[11] >> 8;
          var6 = gb.field_f << 4;
          var7 = 0;
          var8 = bh.a((byte) 81, var6) >> 8;
          var9 = fi.a(var6, 2048) >> 8;
          if ((PrefixCodeDecoder.pointerXSnapshot != -1) &&
              (ue.pointerYSnapshot != -1)) {
            var7 = -320 + PrefixCodeDecoder.pointerXSnapshot;
            var9 = -128;
            var8 = -ue.pointerYSnapshot + 240;
          }
          var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
          var8 = (int)((double)var8 * var10);
          var7 = (int)((double)var7 * var10);
          var9 = (int)((double)var9 * var10);
          var12 = var7 - var3;
          var13 = var8 - var4;
          var14 = -var5 + var9;
          var10 = 256.0 / Math.sqrt((double)(var14 * var14 + (var13 * var13 + var12 * var12)));
          var14 = (int)((double)var14 * var10);
          var12 = (int)((double)var12 * var10);
          var13 = (int)((double)var13 * var10);
          for (var15 = 0; ArchiveIndex.field_l.length > var15; var15++) {
            var16 = 0;
            for (var17_int = 1; ArchiveIndex.field_l.length > var17_int; var17_int++) {
              if (var21[var17_int] <= var21[var16]) {
                continue;
              }
              var16 = var17_int;
            }
            var21[var16] = -2147483648;
            var17 = ArchiveIndex.field_l[var16];
            Geoblox.a((byte) -112, var16);
            for (var18 = 0; var18 < 3; var18++) {
              lk.meshModelTransform[var18] = lk.meshModelTransform[var18] + pi.field_R[var15][var18];
            }
            p.projectMeshAndQueueFaces(IntKeyLookup.meshCameraTransform, lk.meshModelTransform, var17, true, false, false, true);
            hi.renderLitQueuedMeshFaces(var14, var9, var12, 6562, var7, var17, var13, var8);
          }
          var15 = 123 / ((48 - param0) / 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ck.D(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        int var1 = -55 % ((param0 + 80) / 32);
        field_c = null;
        cancelText = null;
    }

    final static void c(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Geoblox.field_C;
        try {
          if (!IntrusiveDeque.a((byte) 124)) {
            if ((vl.field_n != null) &&
                (vl.field_n.field_c)) {
              jk.a((byte) -87);
              oh.field_b.a(false, new ij(oh.field_b, ei.field_hb));
            }
            return;
          }
          if (param0 != 1) {
            ck.a((byte) 8);
          }
          oh.field_b.a(true, 127, dk.field_c, ni.field_I);
          oh.field_b.i(-50);
          while (hh.pollKeyboardEvent(125)) {
            oh.field_b.a((byte) -126, te.currentKeyboardEventCharacter, ki.currentKeyboardEventCode);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ck.B(" + param0 + ')');
        }
    }

    ck(int param0, int param1, int param2, int param3) {
        this.field_b = param0;
        this.field_a = param3;
    }

    static {
        int var0 = 0;
        cancelText = "Cancel";
        field_c = new int[33];
        for (var0 = 0; var0 < 3; var0++) {
            field_c[var0 + 10] = 4;
            field_c[13 + var0] = 3;
            field_c[7 + var0] = 1;
            field_c[var0 + 1] = 0;
            field_c[var0 + 4] = 6;
            field_c[16 + var0] = 5;
            field_c[19 + var0] = 2;
        }
    }
}
