/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class em extends al {
    static boolean field_w;
    static ia field_B;
    boolean field_z;
    boolean field_v;
    static String field_u;
    static boolean field_x;
    volatile boolean field_C;
    static ea field_y;
    static long field_A;

    abstract int f(int param0);

    abstract byte[] c(byte param0);

    public static void b(byte param0) {
        if (param0 < -30) {
          field_B = null;
          field_u = null;
          field_y = null;
          return;
        }
        field_u = (String) null;
        field_B = null;
        field_u = null;
        field_y = null;
    }

    final static void g(int param0) {
        if (param0 != -1719110238) {
          em.d((byte) -113);
        }
    }

    em() {
        this.field_C = true;
    }

    final static void d(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        jb var4 = null;
        int var4_int = 0;
        int var5 = 0;
        il var5_ref_il = null;
        int[] var6 = null;
        int var8 = 0;
        ld var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9 = kj.field_a;
          var2 = var9.d((byte) -54);
          var3 = var9.d((byte) -54);
          if (var2 == 0) {
            var4 = (jb) (sd.field_a.b(param0 ^ -62));
            if (var4 == null) {
              si.a(-36);
              return;
            }
            var5 = rj.field_d - var9.field_o;
            var11 = var4.field_r;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.d((byte) -54) << c.a(768, var7 << 8));
            }
            var4.b(34);
          } else {
            if (var2 == 1) {
              var4_int = var9.c((byte) 127);
              var5_ref_il = (il) (mf.field_h.b(119));
              while (var5_ref_il != null) {
                if (~var3 != ~var5_ref_il.field_r ||
                  var4_int != var5_ref_il.field_p) {
                  var5_ref_il = (il) (mf.field_h.b((byte) 56));
                  continue;
                }
                break;
              }
              if (var5_ref_il == null) {
                si.a(param0 ^ 117);
                return;
              }
              var5_ref_il.b(34);
              decompiledFrameRemainder0 = false;
            }
            else {
              di.a((Throwable) null, 1, "LR1: " + hj.a((byte) 55));
              si.a(param0 ^ 1);
            }
          }
          if (param0 == -67) {
            return;
          }
          field_u = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "em.G(" + param0 + ')');
        }
    }

    static {
        field_w = true;
        field_u = "Achievements";
        field_x = false;
    }
}
