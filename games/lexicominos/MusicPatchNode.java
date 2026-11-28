/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    int field_o;
    int field_u;
    int field_j;
    int field_E;
    static String field_t;
    static RgbSprite field_n;
    int field_i;
    PcmSample field_w;
    MusicPatch field_p;
    int field_y;
    static String field_A;
    int field_x;
    int field_k;
    int field_m;
    static String field_D;
    int field_q;
    MusicPatchEnvelope field_r;
    int field_v;
    int field_B;
    int field_s;
    PcmSampleStream field_C;
    int field_l;
    int field_z;
    int field_h;
    int field_F;

    public static void clearStaticReferences(int param0) {
        field_A = null;
        field_D = null;
        if (param0 != 29152) {
          return;
        }
        field_t = null;
        field_n = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          MeshRasterState.b();
          GrowableIntArray.field_e = new int[260];
          sb.field_d = 11;
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            GrowableIntArray.field_e[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (param0 > -51) {
            field_n = (RgbSprite) null;
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < GrowableIntArray.field_e.length) {
            GrowableIntArray.field_e[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ValidationStatusIcon.wrapClientException((Throwable) ((Object) var1), "cb.C(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        ug.field_m = 0;
        nc.field_p = null;
        af.field_b = false;
        vf.field_r = -1;
        if (param0 != -52) {
          field_n = (RgbSprite) null;
        }
        bf.field_g = -1;
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        if (!param1) {
          if (oj.field_j[param3] < oj.field_j[param2]) {
            return true;
          }
          if (oj.field_j[param3] > oj.field_j[param2]) {
            return false;
          }
          if (we.field_g[param3] < we.field_g[param2]) {
            return true;
          }
          if (we.field_g[param2] < we.field_g[param3]) {
            return false;
          }
        } else {
          if (we.field_g[param2] > we.field_g[param3]) {
            return true;
          }
          if (we.field_g[param3] > we.field_g[param2]) {
            return false;
          }
          if (oj.field_j[param2] > oj.field_j[param3]) {
            return true;
          }
          if (oj.field_j[param3] > oj.field_j[param2]) {
            return false;
          }
        }
        if (param0 < 13) {
          MusicPatchNode.b(73);
        }
        var4 = MidiPcmStream.field_N[param3] + FullscreenNoticeType.field_a[param3] + DropTargetWidgetContainer.field_D[param3];
        var5 = MidiPcmStream.field_N[param2] + FullscreenNoticeType.field_a[param2] + DropTargetWidgetContainer.field_D[param2];
        if (var4 < var5) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        return !(param3 >= param2);
    }

    final void releaseReferences(int param0) {
        if (param0 != 0) {
          MusicPatchNode.clearStaticReferences(-98);
        }
        this.field_r = null;
        this.field_C = null;
        this.field_p = null;
        this.field_w = null;
    }

    MusicPatchNode() {
    }

    static {
        field_A = "Use this alternative as your account name";
        field_D = "1 of 4";
    }
}
