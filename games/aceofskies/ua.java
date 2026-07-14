/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua implements kt {
    private int field_k;
    jc field_a;
    private int field_m;
    private int field_i;
    static float[] field_c;
    static int[] field_h;
    private boolean field_e;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_f;
    static String field_j;
    private int field_n;
    static bs field_d;
    static int[][] field_l;
    static pa[] field_g;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        if (!(((ua) this).field_m != 0)) {
            this.f(-1);
            if ((((ua) this).field_k ^ -1) >= -1) {
                ((ua) this).field_m = 2;
                return (jaclib.memory.Buffer) (Object) ((ua) this).field_f;
            }
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
            if (param1) {
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_b, ((ua) this).field_i, (byte[]) null, 0, !((ua) this).field_e ? 35044 : 35040);
                if (((ua) this).field_n <= ((ua) this).field_a.field_Q.c) {
                    ((ua) this).field_m = 1;
                    return (jaclib.memory.Buffer) (Object) ((ua) this).field_a.field_Q;
                }
            }
            if (!param0.a()) {
                if (!(!param0.a(((ua) this).field_b, ((ua) this).field_n, 35001))) {
                    ((ua) this).field_m = 2;
                    return (jaclib.memory.Buffer) (Object) param0;
                }
            }
        }
        if (param2 == -10386) {
            return null;
        }
        return (jaclib.memory.Buffer) null;
    }

    final void b(int param0) {
        if (((ua) this).field_a.field_Cc) {
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
        }
        if (param0 != -17310) {
            jaggl.MapBuffer var3 = (jaggl.MapBuffer) null;
            boolean discarded$0 = ((ua) this).a((jaggl.MapBuffer) null, (byte) 10);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_l = (int[][]) null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
        int var1 = -51 / ((param0 - 59) / 37);
    }

    final static short[] a(dl param0, short[] param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = AceOfSkies.field_G ? 1 : 0;
        var4 = param0.b((byte) 103, param3);
        if (-1 != (var4 ^ -1)) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length != var4) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param0.b((byte) -95, 4);
            var6 = (short)param0.b((byte) 89, 16);
            if (param2 < var5) {
              var7 = 0;
              L3: while (true) {
                if (var7 >= var4) {
                  break L2;
                } else {
                  param1[var7] = (short)(param0.b((byte) 96, var5) + var6);
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L4;
                }
              }
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        if (param1 != -115) {
            this.f(53);
        }
        int var3 = 1;
        if (-1 != (((ua) this).field_m ^ -1)) {
            if (0 < ((ua) this).field_k) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                if ((((ua) this).field_m ^ -1) != -2) {
                    var3 = param0.b() ? 1 : 0;
                } else {
                    jaggl.OpenGL.glBufferSubDataARBa(((ua) this).field_b, 0, ((ua) this).field_i, ((ua) this).field_a.field_Q.a());
                }
            }
            ((ua) this).field_m = 0;
        }
        return var3 != 0;
    }

    void a(int param0, int param1) {
        if (param0 != -12880) {
            return;
        }
        if (((ua) this).field_i < param1) {
            this.f(-1);
            if (((ua) this).field_k > 0) {
                jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
                jaggl.OpenGL.glBufferDataARBub(((ua) this).field_b, param1, (byte[]) null, 0, !((ua) this).field_e ? 35044 : 35040);
                ((ua) this).field_a.field_j = ((ua) this).field_a.field_j + (-((ua) this).field_i + param1);
            } else {
                ((ua) this).field_f = ((ua) this).field_a.a((byte) -77, param1, false);
            }
            ((ua) this).field_i = param1;
        }
        ((ua) this).field_n = param1;
    }

    void a(int param0) {
        if ((((ua) this).field_k ^ -1) < -1) {
            ((ua) this).field_a.a(((ua) this).field_n, 9841, ((ua) this).field_k);
            ((ua) this).field_k = -1;
        }
        if (param0 != 4665) {
            field_d = (bs) null;
        }
    }

    protected final void finalize() throws Throwable {
        ((ua) this).a(4665);
        this.finalize();
    }

    final static void e(int param0) {
        if (param0 != 4754) {
            field_d = (bs) null;
        }
        String var2 = (String) null;
        ub.a("", (String) null, -89);
    }

    private final void f(int param0) {
        if ((((ua) this).field_k ^ -1) <= param0) {
            return;
        }
        if (!((ua) this).field_a.field_Cc) {
            ((ua) this).field_k = 0;
        } else {
            jaggl.OpenGL.glGenBuffersARB(1, ci.field_m, 0);
            ((ua) this).field_k = ci.field_m[0];
            jaggl.OpenGL.glBindBufferARB(((ua) this).field_b, ((ua) this).field_k);
        }
    }

    final long b(byte param0) {
        if (param0 <= 29) {
            return -98L;
        }
        return ((ua) this).field_k == 0 ? ((ua) this).field_f.a() : 0L;
    }

    final static void c(int param0) {
        oj.a(param0 ^ 26099, bm.m(124));
        if (param0 != 0) {
            short[] var2 = (short[]) null;
            short[] discarded$0 = ua.a((dl) null, (short[]) null, 101, 22);
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        int var3 = 117 % ((16 - param2) / 58);
        ae.field_f = param1 ? true : false;
        ss.field_t = true;
        ml.field_m = new oo(vn.field_f, b.field_c, param0, nf.field_a, ae.field_f);
        vn.field_f.a((ea) (Object) ml.field_m, 0);
    }

    ua(jc param0, int param1, boolean param2) {
        ((ua) this).field_m = 0;
        ((ua) this).field_k = -1;
        ((ua) this).field_e = param2 ? true : false;
        ((ua) this).field_b = param1;
        ((ua) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_h = new int[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_h[var0] = it.a(var0, -1);
        }
        field_d = new bs();
        field_l = new int[8][];
    }
}
