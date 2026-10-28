/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static volatile boolean field_a;
    static int field_b;
    static BitmapFont field_c;

    final static void a(BitmapFont param0, int param1, int param2, BitmapFont param3) {
        try {
          nb.field_a = param0;
          Js5Transport.field_h = param2;
          pb.field_e = param3;
          ObjectSpriteSet.a(SoftwareRasterizer.height / 2, SoftwareRasterizer.width / param1, 11710);
          mm.a(param1 + 97, param0.field_x + param0.field_N, param3.field_N, param0.field_N, param3.field_N + param3.field_x);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ke.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard >= -13) {
          BitmapFont var2 = (BitmapFont) null;
          ke.a((BitmapFont) null, -2, 75, (BitmapFont) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param1 != 2) {
          BitmapFont var6 = (BitmapFont) null;
          ke.a((BitmapFont) null, 4, 22, (BitmapFont) null);
          if (param3) {
            if (DualLinkNode.field_k[param2] > DualLinkNode.field_k[param0]) {
              return true;
            }
            if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
              return false;
            }
            if (Bzip2State.field_v[param2] > Bzip2State.field_v[param0]) {
              return true;
            }
            if (Bzip2State.field_v[param2] < Bzip2State.field_v[param0]) {
              return false;
            }
          } else {
            if (Bzip2State.field_v[param0] < Bzip2State.field_v[param2]) {
              return true;
            }
            if (Bzip2State.field_v[param2] < Bzip2State.field_v[param0]) {
              return false;
            }
            if (DualLinkNode.field_k[param0] < DualLinkNode.field_k[param2]) {
              return true;
            }
            if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
              return false;
            }
          }
          int var4 = tm.field_fb[param0] + (pc.field_c[param0] + RasterSnapshot.field_k[param0]);
          int var5 = pc.field_c[param2] - (-RasterSnapshot.field_k[param2] - tm.field_fb[param2]);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param0 >= param2);
        }
        if (!param3) {
          if (Bzip2State.field_v[param0] < Bzip2State.field_v[param2]) {
            return true;
          }
          if (Bzip2State.field_v[param2] < Bzip2State.field_v[param0]) {
            return false;
          }
          if (DualLinkNode.field_k[param0] < DualLinkNode.field_k[param2]) {
            return true;
          }
          if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
            return false;
          }
          int var4Lifetime1 = tm.field_fb[param0] + (pc.field_c[param0] + RasterSnapshot.field_k[param0]);
          int var5Lifetime1 = pc.field_c[param2] - (-RasterSnapshot.field_k[param2] - tm.field_fb[param2]);
          if (var4Lifetime1 < var5Lifetime1) {
            return true;
          }
          if (var4Lifetime1 > var5Lifetime1) {
            return false;
          }
          return !(param0 >= param2);
        }
        if (DualLinkNode.field_k[param2] > DualLinkNode.field_k[param0]) {
          return true;
        }
        if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
          return false;
        }
        if (Bzip2State.field_v[param2] > Bzip2State.field_v[param0]) {
          return true;
        }
        if (Bzip2State.field_v[param2] < Bzip2State.field_v[param0]) {
          return false;
        }
        int var4Lifetime2 = tm.field_fb[param0] + (pc.field_c[param0] + RasterSnapshot.field_k[param0]);
        int var5Lifetime2 = pc.field_c[param2] - (-RasterSnapshot.field_k[param2] - tm.field_fb[param2]);
        if (var4Lifetime2 < var5Lifetime2) {
          return true;
        }
        if (var4Lifetime2 > var5Lifetime2) {
          return false;
        }
        if (param0 >= param2) {
          return false;
        }
        return true;
    }

    static {
        field_a = false;
    }
}
