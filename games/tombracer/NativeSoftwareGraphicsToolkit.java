/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeSoftwareGraphicsToolkit extends GraphicsToolkit implements e {
    private boolean field_s;
    long field_nativeid;
    private ya field_p;
    private IntrusiveDeque field_o;
    private Transform3D field_i;
    private int field_k;
    private NodeHashTable field_r;
    private NativeCanvasSurface field_f;
    private int field_n;
    private Transform3D field_j;
    private static int[] field_m;
    private static float[] field_e;
    private static float[] field_d;
    private a[] field_q;
    static int[] field_t;
    private static int[] field_g;
    private boolean field_h;
    int field_l;

    final native void za(int param0, int param1, int param2, int param3, int param4);

    public NativeSoftwareGraphicsToolkit(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        Throwable decompiledCaughtException = null;
        Throwable var5 = null;
        this.field_nativeid = 0L;
        this.field_s = false;
        this.field_o = new IntrusiveDeque();
        this.field_k = 4096;
        this.field_n = 4096;
        this.field_r = new NodeHashTable(4);
        this.field_h = false;
        try {
          if (!StringCursor.a("sw3d", 480)) {
            throw new RuntimeException("");
          }
          ho.b(false);
          this.MA(this.field_c, 0, 0);
          ija.a(true, (byte) 98, false);
          this.field_h = true;
          this.field_i = (Transform3D) ((Object) new ja());
          this.a(new ja());
          this.createRenderContexts(1);
          this.g(0);
          if (param0 != null) {
            this.prepareCanvasSurface(param0, param2, param3);
            this.bindCanvasSurface(param0);
          }
          return;
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          this.a(true);
          throw new RuntimeException();
        }
    }

    public final native void w(boolean param0);

    private final native void va(za param0);

    final void a(Transform3D param0) {
        this.field_j = param0;
        this.ma(((ja) (param0)).field_nativeid);
    }

    final RenderBuffer b(int param0, int param1) {
        return (RenderBuffer) ((Object) new xa(param0, param1));
    }

    final native void f(int param0, int param1);

    final native void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final void setLights(int param0, SceneLight[] param1) {
        int var4 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int var3 = 0;
        for (var4 = 0; var4 < param0; var4++) {
          incrementValue$0 = var3;
          var3++;
          field_g[incrementValue$0] = param1[var4].d(13437);
          incrementValue$1 = var3;
          var3++;
          field_g[incrementValue$1] = param1[var4].a(19848);
          incrementValue$2 = var3;
          var3++;
          field_g[incrementValue$2] = param1[var4].b((byte) 11);
          incrementValue$3 = var3;
          var3++;
          field_g[incrementValue$3] = param1[var4].a((byte) -56);
          field_d[var4] = param1[var4].b(0);
          incrementValue$4 = var3;
          var3++;
          field_g[incrementValue$4] = param1[var4].c(-113);
        }
        this.N(param0, field_g, field_d);
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final native void xa(float param0);

    final native void la();

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    final native void intersectClip(int param0, int param1, int param2, int param3);

    final GameFont createFont(FontMetrics param0, SpriteData[] param1, boolean param2) {
        int var7 = 0;
        int[] var4;
        int[] var5;
        int var6;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        for (var7 = 0; var7 < param1.length; var7++) {
          var4[var7] = param1[var7].field_i;
          var5[var7] = param1[var7].field_a;
          if (param1[var7].field_h != null) {
            var6 = 1;
          }
        }
        if (!param2) {
          if (var6 == 0) {
            return (GameFont) ((Object) new n(this, this.field_p, param0, param1, (ToolkitSprite[]) null));
          }
          throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
        }
        if (var6 == 0) {
          return (GameFont) ((Object) new h(this, this.field_p, param0, param1, (ToolkitSprite[]) null));
        }
        throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
    }

    final native void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final a m() {
        int var1 = 0;
        for (var1 = 0; var1 < this.field_l; var1++) {
          if (this.field_q[var1].field_h == Thread.currentThread()) {
            return this.field_q[var1];
          }
        }
        return null;
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void d() {
        this.bindCanvasSurface(this.field_f.field_f);
    }

    final native int XA();

    private final native void ma(long param0);

    final native void L(int param0, int param1, int param2);

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        dw var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this.field_c;
        synchronized (var2_ref) {
          if (!this.field_c.a((int) param0, (byte) 120)) {
            return false;
          }
          var3 = this.field_c.a((byte) -109, (int) param0);
          if (var3 == null) {
            return false;
          }
          if (var3.field_d == 2) {
            var4 = this.field_c.a((byte) 40, 128, 0.699999988079071f, (int) param0, true, 128);
          } else {
            var4 = this.field_c.a(14907, (int) param0, true, 128, 0.699999988079071f, 128);
          }
          this.CA(param0, var4, var3.field_m, var3.field_d, var3.field_h, var3.field_a, var3.field_t, var3.field_g, var3.field_c, var3.field_i, var3.field_s, var3.field_o, var3.field_p, var3.field_f, var3.field_k, var3.field_b, var3.field_n, var3.field_r, var3.field_l, var3.field_e, var3.field_q);
        }
        return true;
    }

    final native void fillRectangle(int param0, int param1, int param2, int param3, int param4, int param5);

    final void b(int param0) {
        this.field_k = param0;
        this.field_n = param0;
        if (this.field_l > 1) {
          throw new IllegalStateException("No MT");
        }
        this.createRenderContexts(this.field_l);
        this.g(0);
    }

    final RenderTarget createRenderTarget(RenderSurface param0, RenderBuffer param1) {
        return (RenderTarget) ((Object) new wa(this, (j) (param0), (xa) (param1)));
    }

    private final native void t(NativeCanvasSurface param0);

    final native void ya();

    final void c() {
    }

    final boolean f() {
        return false;
    }

    final boolean j() {
        return true;
    }

    private final native void FA();

    final Transform3D e() {
        return this.field_i;
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        return (ka) ((Object) new i(this, this.field_p, param0, param1, param2, param3, param4));
    }

    final native void setClip(int param0, int param1, int param2, int param3);

    final Transform3D b() {
        return (Transform3D) ((Object) new ja());
    }

    private final boolean uploadTextureMetadata(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        dw var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2_ref = this;
        synchronized (var2_ref) {
          var3 = this.field_c.a((byte) 9, (int) param0);
          if (var3 == null) {
            return false;
          }
          this.AA(param0, var3.field_m, var3.field_d, var3.field_h, var3.field_a, var3.field_t, var3.field_g, var3.field_c, var3.field_i, var3.field_s, var3.field_o, var3.field_p, var3.field_f, var3.field_k, var3.field_b, var3.field_n, var3.field_r, var3.field_l, var3.field_e, var3.field_q);
        }
        return true;
    }

    private final void prepareCanvasSurface(java.awt.Canvas param0, int param1, int param2) {
        try {
          java.lang.reflect.Method var6 = null;
          Class var7 = null;
          NativeCanvasSurface var4 = (NativeCanvasSurface) (this.field_r.get((byte) -110, (long)param0.hashCode()));
          if (var4 == null) {
            try {
              var7 = Class.forName("java.awt.Canvas");
              var6 = var7.getMethod("setIgnoreRepaint", new Class[]{Boolean.TYPE});
              var6.invoke((Object) (param0), new Object[]{Boolean.TRUE});
            } catch (Exception exception) {
            }
            var4 = new NativeCanvasSurface(this, param0, param1, param2);
            this.field_r.put((long)param0.hashCode(), 101, var4);
          } else {
            if (var4.field_i != param1 ||
              var4.field_h != param2) {
              var4.a(param0, param1, param2);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final native void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    final native void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native void P(int param0, int param1, int param2, int param3, int param4);

    private final native void n(long param0, long param1);

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.drawHorizontalLine(param0, param1, param2, param4, param5);
        this.drawHorizontalLine(param0, param1 + param3 - 1, param2, param4, param5);
        this.P(param0, param1 + 1, param3 - 1, param4, param5);
        this.P(param0 + param2 - 1, param1 + 1, param3 - 1, param4, param5);
    }

    private final void bindCanvasSurface(java.awt.Canvas param0) {
        NativeCanvasSurface var2 = null;
        if (param0 != null) {
          var2 = (NativeCanvasSurface) (this.field_r.get((byte) -82, (long)param0.hashCode()));
          this.field_f = var2;
          this.t(var2);
        } else {
          this.field_f = null;
          this.t((NativeCanvasSurface) null);
        }
    }

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    final native int[] projectionParameters();

    final native void da(int param0, int param1, int param2, int[] param3);

    final ToolkitSprite createSprite(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (ToolkitSprite) ((Object) new j(this, param0, param1, param2, param3, param4, false));
    }

    protected final synchronized void finalize() {
        this.a(true);
        if (this.field_nativeid != 0L) {
          ho.a(-1, (e) (this));
        }
    }

    final int l() {
        return 4;
    }

    final native void getClip(int[] param0);

    private final void createRenderContexts(int param0) {
        int var2 = 0;
        this.field_l = param0;
        this.field_q = new a[this.field_l];
        for (var2 = 0; var2 < this.field_l; var2++) {
          this.field_q[var2] = new a(this, this.field_n, this.field_k);
        }
    }

    final ToolkitSprite createSprite(SpriteData param0, boolean param1) {
        j var3 = new j(this, param0.field_g, param0.field_f, param0.field_h, 0, param0.field_i, param0.field_i, param0.field_a);
        ((ToolkitSprite) ((Object) var3)).b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
        return (ToolkitSprite) ((Object) var3);
    }

    final native void drawHorizontalLine(int param0, int param1, int param2, int param3, int param4);

    private final native void N(int param0, int[] param1, float[] param2);

    final void drawLine(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    final za a(int param0) {
        ya var2 = new ya(this, param0);
        this.field_o.addLast((byte) -97, var2);
        return (za) ((Object) var2);
    }

    final void present(int param0, int param1) throws qva {
        if (this.field_f == null) {
          throw new IllegalStateException("off");
        }
        this.field_f.present(param0, param1);
    }

    final native void drawCircle(int param0, int param1, int param2, int param3, int param4);

    final void updateTime(int param0) {
        ho.a(true);
        this.d(param0);
        ya var2 = (ya) (this.field_o.first(-80));
        while (var2 != null) {
          var2.r();
          var2 = (ya) (this.field_o.next(111));
        }
    }

    private final Object OA() {
        return new ba(this);
    }

    final native void DA(int param0, int param1, int param2, int param3);

    final void k() {
        if (this.field_s) {
          return;
        }
        this.field_q = null;
        this.field_f = null;
        this.field_p = null;
        this.field_i = null;
        this.field_r.e(-67);
        ya var1 = (ya) (this.field_o.first(-80));
        while (var1 != null) {
          var1.ga();
          var1 = (ya) (this.field_o.next(108));
        }
        this.field_o.clear(8);
        this.FA();
        if (this.field_h) {
          rpa.a(true, false, true);
          this.field_h = false;
        }
        this.g();
        ho.a(-1);
        this.field_s = true;
    }

    final void a(RenderTarget param0) {
        wa var2 = (wa) (param0);
        this.n(var2.field_b.field_nativeid, var2.field_a.field_nativeid);
    }

    final SceneLight createLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (SceneLight) ((Object) new kka(param0, param1, param2, param3, param4, param5));
    }

    final native int i();

    private final void g(int param0) {
        this.field_q[param0].a();
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        ho.a(true);
    }

    private final native void MA(d param0, int param1, int param2);

    final native void clear(int param0);

    final void a(ToolkitSprite param0, boolean param1) {
        this.n(((j) (param0)).field_nativeid, 0L);
    }

    final void a() {
    }

    final boolean h() {
        return false;
    }

    final void a(za param0) {
        this.field_p = (ya) (param0);
        this.va(param0);
    }

    private final native void d(int param0);

    final native void HA(int param0, int param1, int param2, int param3, int[] param4);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        throw new IllegalStateException();
    }

    final void a(float param0, float param1, float param2) {
    }

    static {
        field_m = new int[Math.max(Math.max(104, 20), 24573)];
        field_e = new float[20];
        field_d = field_e;
        field_t = new int[6];
        field_g = field_m;
    }
}
