/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nj extends wda {
    static lqa field_t;
    static iw field_r;
    static String field_q;
    private wda[] field_u;
    private int field_s;
    static oc[] field_p;
    static String field_o;
    static cn field_v;

    final void b(byte param0) {
        int var2 = 0;
        L0: {
          if (((nj) this).field_u.length == -1) {
            break L0;
          } else {
            if (null != ((nj) this).field_u) {
              L1: {
                if (-1 <= ((nj) this).field_s) {
                  break L1;
                } else {
                  ((nj) this).field_s = 0;
                  break L1;
                }
              }
              L2: {
                if (((nj) this).field_u.length <= ((nj) this).field_s) {
                  ((nj) this).field_s = ((nj) this).field_u.length - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((nj) this).field_u[((nj) this).field_s].b((byte) 71);
              var2 = 52 / ((param0 - -69) / 42);
              return;
            } else {
              break L0;
            }
          }
        }
        ((nj) this).field_j = true;
    }

    private final void e(int param0) {
        ((nj) this).field_s = ((nj) this).field_s + 1;
        if (param0 > -15) {
            return;
        }
        if (((nj) this).field_s >= ((nj) this).field_u.length) {
            ((nj) this).field_s = 0;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((nj) this).a(32, (fsa) null);
        }
    }

    final void a(boolean param0, byte param1, ui param2, ui param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, (byte) -125, param2, param3);
        if (param1 >= -106) {
            return;
        }
        if (((nj) this).field_u != null) {
            for (var5 = 0; ((nj) this).field_u.length > var5; var5++) {
                ((nj) this).field_u[var5].a(param0, (byte) -122, param2, param3);
            }
        }
    }

    nj(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        int var5 = 0;
        wda var6 = null;
        int var4 = param1.b((byte) 44, 2);
        ((nj) this).field_u = new wda[var4];
        for (var5 = 0; var4 > var5; var5++) {
            var6 = ki.a(param1, (byte) -118, param0, param2);
            ((nj) this).field_u[var5] = var6;
        }
        ((nj) this).field_s = param1.b((byte) 44, 2);
    }

    public final void m(int param0) {
        if (!(!((nj) this).field_i)) {
            return;
        }
        this.e(-114);
        int var2 = 94 % ((28 - param0) / 49);
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 63, param1, ((nj) this).field_s);
        if (param0 != 0) {
            ((nj) this).field_u = null;
        }
        return param1;
    }

    public static void e(byte param0) {
        field_v = null;
        if (param0 >= -30) {
            field_r = null;
        }
        field_q = null;
        field_p = null;
        field_o = null;
        field_r = null;
        field_t = null;
    }

    final void c(byte param0) {
        int var3 = 0;
        wda var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        super.c((byte) -121);
        if (param0 >= -116) {
            field_r = null;
        }
        wda[] var6 = ((nj) this).field_u;
        wda[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.c((byte) -124);
        }
    }

    final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        super.a(param0, (byte) -128);
        param0.a((byte) 7, ((nj) this).field_u.length, 2);
        if (param1 > -78) {
            ((nj) this).b(-101);
        }
        for (var3 = 0; var3 < ((nj) this).field_u.length; var3++) {
            ((nj) this).field_u[var3].a(param0, (byte) -117);
        }
        param0.a((byte) -128, ((nj) this).field_s, 2);
    }

    final int c(int param0) {
        if (param0 != 1) {
            field_q = null;
        }
        return 2;
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        DataInputStream var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param3)));
        try {
            if (false) throw (EOFException) null;
            var4.readFully(param0, 0, param2);
        } catch (EOFException eOFException) {
        }
        var4.close();
        int var5 = 59 % ((-16 - param1) / 50);
    }

    final void a(int param0, fsa param1) {
        int var4 = 0;
        wda var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.a(110, param1);
        wda[] var7 = ((nj) this).field_u;
        wda[] var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            var5.a(36, param1);
        }
        if (param0 <= 35) {
            ((nj) this).b((byte) -51);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Quit to website";
        field_r = new iw();
        field_o = "Rating";
    }
}
