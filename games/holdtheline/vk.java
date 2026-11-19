/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    int field_o;
    IntrusiveDeque field_x;
    byte field_v;
    IntrusiveDeque field_m;
    boolean field_r;
    private int field_f;
    int field_p;
    IntrusiveDeque field_k;
    RoadSegment[] field_u;
    int field_n;
    String field_b;
    private int field_w;
    static int[] field_q;
    int field_l;
    om[] field_j;
    private Sprite field_g;
    static boolean field_a;
    GrowableObjectList field_e;
    static String field_i;
    GrowableObjectList field_c;
    static int[] field_d;
    byte[] field_s;
    GrowableObjectList field_t;
    String field_h;

    final Sprite a(int param0, int param1, int param2) {
        if (param0 != 9392) {
          vk.a(true, true, -63);
        }
        if (this.field_g == null) {
          this.field_g = LoginForm.a(param2, param1, this, -12392);
          this.field_w = this.field_l;
          this.field_f = param1;
          return this.field_g;
        }
        if (this.field_g.field_s != param2) {
          this.field_g = LoginForm.a(param2, param1, this, -12392);
          this.field_w = this.field_l;
          this.field_f = param1;
          return this.field_g;
        }
        if (param1 != this.field_f) {
          this.field_g = LoginForm.a(param2, param1, this, -12392);
          this.field_w = this.field_l;
          this.field_f = param1;
          return this.field_g;
        }
        if (this.field_l == this.field_w) {
          return this.field_g;
        }
        this.field_g = LoginForm.a(param2, param1, this, -12392);
        this.field_w = this.field_l;
        this.field_f = param1;
        return this.field_g;
    }

    final static void a(boolean param0) {
        if (param0) {
          if (ka.field_b != null) {
            ka.field_b.f((byte) -84);
          }
          if (null != MidiKeyUsage.field_l) {
            MidiKeyUsage.field_l.i((byte) 33);
          }
          pj.a((byte) -96);
          return;
        }
        field_d = (int[]) null;
        if (ka.field_b != null) {
          ka.field_b.f((byte) -84);
        }
        if (null != MidiKeyUsage.field_l) {
          MidiKeyUsage.field_l.i((byte) 33);
        }
        pj.a((byte) -96);
    }

    final boolean b(int param0) {
        if (param0 != 3) {
          this.field_n = 41;
          if (-1 == this.field_l) {
            return true;
          }
          if (!RasterBuffer.a(this, -65)) {
            this.field_l = RotatedSpriteSheetAsset.a((byte) 47, this);
            return false;
          }
          this.field_l = -1;
          return true;
        }
        if (-1 == this.field_l) {
          return true;
        }
        if (!RasterBuffer.a(this, -65)) {
          this.field_l = RotatedSpriteSheetAsset.a((byte) 47, this);
          return false;
        }
        this.field_l = -1;
        return true;
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 3) {
          return;
        }
        field_i = null;
        field_d = null;
        field_q = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 77 / ((-38 - param2) / 56);
        if (param1) {
          SoftwareRasterizer.c(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_c, 0, 192);
          Bzip2State.a(0, param1);
          return;
        }
        SoftwareRasterizer.c();
        Bzip2State.a(0, param1);
    }

    vk(byte[] param0) {
        try {
          this.field_s = param0;
          this.field_g = null;
          this.field_r = false;
          this.field_h = null;
          this.field_l = 0;
          this.field_e = new GrowableObjectList();
          this.field_t = new GrowableObjectList();
          this.field_c = new GrowableObjectList();
          this.field_k = new IntrusiveDeque();
          this.field_m = new IntrusiveDeque();
          this.field_x = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    vk(String param0) {
        try {
          this.field_r = true;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[]{8437888, 15187496, 16777215, 8421504};
        field_i = "Try again";
        field_d = new int[]{3, 3, 2};
    }
}
