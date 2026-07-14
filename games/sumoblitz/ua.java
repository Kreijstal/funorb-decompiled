/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ua implements ot {
    on field_f;
    private int field_b;
    private int field_e;
    private boolean field_j;
    static tg field_n;
    private int field_l;
    private int field_c;
    private jaclib.memory.heap.NativeHeapBuffer field_m;
    private int field_k;
    static int[] field_h;
    static String field_i;
    static int field_a;
    static hr[] field_g;
    static int field_d;

    final static wb[] a(int param0, int param1) {
        wb[] var3 = new wb[9];
        wb[] var2 = var3;
        var3[4] = wg.a(64, param0, 3);
        if (param1 >= -114) {
            wb[] discarded$0 = ua.a(63, -120);
        }
        return var2;
    }

    final jaclib.memory.Buffer a(boolean param0, int param1, jaggl.MapBuffer param2) {
        if (!(((ua) this).field_b != 0)) {
            this.d(0);
            if (((ua) this).field_c <= 0) {
                ((ua) this).field_b = 2;
                return (jaclib.memory.Buffer) (Object) ((ua) this).field_m;
            }
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
            if (!(!param0)) {
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_k, ((ua) this).field_e, (byte[]) null, 0, !((ua) this).field_j ? 35044 : 35040);
                if (!(((ua) this).field_l > ((ua) this).field_f.field_z.c)) {
                    ((ua) this).field_b = 1;
                    return (jaclib.memory.Buffer) (Object) ((ua) this).field_f.field_z;
                }
            }
            if (!param2.a()) {
                if (!(!param2.a(((ua) this).field_k, ((ua) this).field_l, 35001))) {
                    ((ua) this).field_b = 2;
                    return (jaclib.memory.Buffer) (Object) param2;
                }
            }
        }
        if (param1 == 2) {
            return null;
        }
        Object var5 = null;
        jaclib.memory.Buffer discarded$0 = ((ua) this).a(true, 66, (jaggl.MapBuffer) null);
        return null;
    }

    final static void a(int param0, ah param1) {
        kf.field_u = param1;
        im.field_b = new jn();
        up.field_a = fi.a(640, he.field_o, (byte) -96) << -247536376;
        cv.field_E = fi.a(480, he.field_o, (byte) -96) << 1175993800;
        sr.d(22030);
        if (param0 != 35040) {
            wb[] discarded$0 = ua.a(116, -119);
        }
    }

    private final void d(int param0) {
        if (-1 >= (((ua) this).field_c ^ -1)) {
            return;
        }
        if (!((ua) this).field_f.field_Nc) {
            ((ua) this).field_c = 0;
        } else {
            jaggl.OpenGL.glGenBuffersARB(1, jp.field_k, 0);
            ((ua) this).field_c = jp.field_k[0];
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
        }
        if (param0 != 0) {
            field_n = null;
        }
    }

    void b(int param0) {
        if (0 < ((ua) this).field_c) {
            ((ua) this).field_f.a((byte) -99, ((ua) this).field_l, ((ua) this).field_c);
            ((ua) this).field_c = -1;
        }
        if (param0 != 12001) {
            ((ua) this).field_e = 82;
        }
    }

    final long c(int param0) {
        if (param0 != -24168) {
            return 1L;
        }
        return ((ua) this).field_c == 0 ? ((ua) this).field_m.c() : 0L;
    }

    final static void f(int param0) {
        if (!(null != vv.field_b)) {
            throw new IllegalStateException("NGR");
        }
        if (param0 != -5812) {
            field_n = null;
        }
        vv.field_b.field_g = true;
        jl.a(param0 + 5837, 1);
    }

    final static String a(byte param0, String param1) {
        if (param0 < 5) {
            ua.f(77);
        }
        if (!en.field_h.startsWith("win")) {
            if (en.field_h.startsWith("linux")) {
                return "lib" + param1 + ".so";
            }
            if (!en.field_h.startsWith("mac")) {
                return null;
            }
            return "lib" + param1 + ".dylib";
        }
        return param1 + ".dll";
    }

    void a(byte param0, int param1) {
        if (param1 > ((ua) this).field_e) {
            this.d(0);
            if ((((ua) this).field_c ^ -1) < -1) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_k, param1, (byte[]) null, 0, ((ua) this).field_j ? 35040 : 35044);
                ((ua) this).field_f.field_o = ((ua) this).field_f.field_o + (-((ua) this).field_e + param1);
            } else {
                ((ua) this).field_m = ((ua) this).field_f.a(false, false, param1);
            }
            ((ua) this).field_e = param1;
        }
        ((ua) this).field_l = param1;
        if (param0 >= -67) {
            ((ua) this).e(-122);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, pl param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var4 = param3.b(param0, (byte) -87);
        if (var4 != param1) {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (var4 != param2.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param2 = new byte[var4];
            break L0;
          }
          L2: {
            var5 = param3.b(3, (byte) -94);
            var6 = (byte)param3.b(8, (byte) -117);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param2[var7] = (byte)(var6 + param3.b(var5, (byte) -127));
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param2[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    protected final void finalize() throws Throwable {
        ((ua) this).b(12001);
        super.finalize();
    }

    final void e(int param0) {
        if (param0 != 1175993800) {
            Object var3 = null;
            boolean discarded$0 = ((ua) this).a((jaggl.MapBuffer) null, (byte) 48);
        }
        if (!(!((ua) this).field_f.field_Nc)) {
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
        }
    }

    ua(on param0, int param1, boolean param2) {
        ((ua) this).field_b = 0;
        ((ua) this).field_c = -1;
        ((ua) this).field_j = param2 ? true : false;
        ((ua) this).field_f = param0;
        ((ua) this).field_k = param1;
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -96 / ((param0 - -61) / 57);
        field_h = null;
        field_g = null;
        field_n = null;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3 = 1;
        if (((ua) this).field_b != -1) {
            if (-1 < ((ua) this).field_c) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_k, ((ua) this).field_c);
                if (1 == ((ua) this).field_b) {
                    jaggl.OpenGL.glBufferSubDataARBa(((ua) this).field_k, 0, ((ua) this).field_e, ((ua) this).field_f.field_z.c());
                } else {
                    var3 = param0.b() ? 1 : 0;
                }
            }
            ((ua) this).field_b = 0;
        }
        if (param1 != 92) {
            ((ua) this).field_f = null;
        }
        return var3 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new tg();
        field_h = new int[8192];
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = 0;
    }
}
