/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static volatile boolean field_a;
    static int field_b;
    static wl field_c;

    final static void a(wl param0, int param1, int param2, wl param3) {
        try {
          nb.field_a = param0;
          sb.field_h = param2;
          pb.field_e = param3;
          rk.a(SoftwareRasterizer.height / 2, SoftwareRasterizer.width / param1, 11710);
          mm.a(param1 + 97, param0.field_x + param0.field_N, param3.field_N, param0.field_N, param3.field_N + param3.field_x);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ke.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 >= -13) {
          wl var2 = (wl) null;
          ke.a((wl) null, -2, 75, (wl) null);
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        if (param1 != 2) {
          wl var6 = (wl) null;
          ke.a((wl) null, 4, 22, (wl) null);
          if (param3) {
            if (DualLinkNode.field_k[param2] > DualLinkNode.field_k[param0]) {
              return true;
            }
            if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
              return false;
            }
            if (th.field_v[param2] > th.field_v[param0]) {
              return true;
            }
            if (th.field_v[param2] < th.field_v[param0]) {
              return false;
            }
          } else {
            if (th.field_v[param0] < th.field_v[param2]) {
              return true;
            }
            if (th.field_v[param2] < th.field_v[param0]) {
              return false;
            }
            if (DualLinkNode.field_k[param0] < DualLinkNode.field_k[param2]) {
              return true;
            }
            if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
              return false;
            }
          }
          int var4 = tm.field_fb[param0] + (pc.field_c[param0] + mi.field_k[param0]);
          int var5 = pc.field_c[param2] - (-mi.field_k[param2] - tm.field_fb[param2]);
          if (var4 < var5) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          return !(param0 >= param2);
        }
        if (!param3) {
          if (th.field_v[param0] < th.field_v[param2]) {
            return true;
          }
          if (th.field_v[param2] < th.field_v[param0]) {
            return false;
          }
          if (DualLinkNode.field_k[param0] < DualLinkNode.field_k[param2]) {
            return true;
          }
          if (DualLinkNode.field_k[param0] > DualLinkNode.field_k[param2]) {
            return false;
          }
          int var4Lifetime1 = tm.field_fb[param0] + (pc.field_c[param0] + mi.field_k[param0]);
          int var5Lifetime1 = pc.field_c[param2] - (-mi.field_k[param2] - tm.field_fb[param2]);
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
        if (th.field_v[param2] > th.field_v[param0]) {
          return true;
        }
        if (th.field_v[param2] < th.field_v[param0]) {
          return false;
        }
        int var4Lifetime2 = tm.field_fb[param0] + (pc.field_c[param0] + mi.field_k[param0]);
        int var5Lifetime2 = pc.field_c[param2] - (-mi.field_k[param2] - tm.field_fb[param2]);
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
