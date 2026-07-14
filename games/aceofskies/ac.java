/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac implements gd {
    int field_a;
    static int field_c;
    static int[] field_e;
    static String field_d;
    int field_g;
    static jb field_b;
    static pa[] field_f;

    final static void a(int param0, int param1, oc param2) {
        int var4 = 0;
        dl var5 = null;
        var5 = q.field_p;
        var5.g(43, param0);
        ((dl) var5).field_g = ((dl) var5).field_g + 1;
        var4 = ((dl) var5).field_g;
        var5.b(-1336879960, 1);
        var5.b(-1336879960, ((oc) param2).field_k);
        var5.b(-1336879960, ((oc) param2).field_i);
        var5.a((byte) 97, ((oc) param2).field_j);
        var5.a((byte) 61, ((oc) param2).field_l);
        if (param1 != 0) {
          return;
        } else {
          var5.a((byte) 90, ((oc) param2).field_h);
          var5.a((byte) 75, ((oc) param2).field_f);
          int discarded$1 = var5.e(var4, 45);
          var5.b(-var4 + ((dl) var5).field_g, (byte) 76);
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != -28819) {
            field_e = (int[]) null;
        }
    }

    final static mo a(boolean param0, int param1, byte[] param2, jc param3) {
        int var4 = 0;
        if (param2 != null) {
          var4 = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param1, var4);
          jaggl.OpenGL.glProgramRawARB(param1, 34933, param2);
          jaggl.OpenGL.glGetIntegerv(34379, ak.field_b, 0);
          if (-1 == ak.field_b[0]) {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            if (!param0) {
              field_b = (jb) null;
              return new mo(param3, param1, var4);
            } else {
              return new mo(param3, param1, var4);
            }
          } else {
            jaggl.OpenGL.glBindProgramARB(param1, 0);
            return null;
          }
        } else {
          return null;
        }
    }

    ac(int param0, int param1) {
        ((ac) this).field_g = param1;
        ((ac) this).field_a = param0;
    }

    final static void a(int param0, int param1, ga param2) {
        int var5 = 0;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        dl var7 = q.field_p;
        dl var8 = var7;
        var8.g(52, param1);
        ((dl) var8).field_g = ((dl) var8).field_g + 1;
        int var4 = ((dl) var8).field_g;
        var8.b(-1336879960, 1);
        var8.a(((ga) param2).field_m, 23385);
        var8.a(((ga) param2).field_e, 23385);
        var8.a(((ga) param2).field_k, 23385);
        var8.a((byte) 34, ((ga) param2).field_i);
        var8.a((byte) 80, ((ga) param2).field_g);
        var8.a((byte) 93, ((ga) param2).field_n);
        var8.a((byte) 113, ((ga) param2).field_f);
        var8.b(-1336879960, ((ga) param2).field_h.length);
        for (var5 = param0; ((ga) param2).field_h.length > var5; var5++) {
            var7.a((byte) 92, ((ga) param2).field_h[var5]);
        }
        int discarded$0 = var8.e(var4, param0 + 108);
        var8.b(((dl) var8).field_g - var4, (byte) 93);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1000];
        field_b = new jb();
    }
}
