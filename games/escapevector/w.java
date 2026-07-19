/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends vg {
    private String field_Z;
    private boolean field_eb;
    static String field_fb;
    private String field_db;
    private boolean field_gb;
    private jm field_cb;
    static mf field_ab;
    static int[] field_bb;
    static hh field_hb;

    final void d(boolean param0) {
        this.field_gb = param0 ? true : false;
        this.field_cb.field_G = false;
    }

    final static rk[] c(boolean param0) {
        if (param0) {
            return (rk[]) null;
        }
        return bf.field_M;
    }

    final void a(int param0, String param1, float param2, boolean param3) {
        try {
            int var5_int = 46 / ((param0 - -43) / 54);
            if ((!param3 ? 1 : 0) == (this.field_eb ? 1 : 0)) {
                this.field_eb = param3 ? true : false;
                if (this.field_eb) {
                    this.field_cb.a(4210752, 8405024, -127);
                    this.field_cb.field_G = true;
                } else {
                    this.field_cb.a(4210752, 2113632, -127);
                    if (!(!this.field_gb)) {
                        this.field_cb.field_G = false;
                    }
                }
            }
            this.field_db = param1;
            this.field_cb.field_B = (int)(param2 / 100.0f * 65536.0f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "w.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void n(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 != 300) {
          field_hb = (hh) null;
          field_ab = null;
          field_bb = null;
          return;
        } else {
          field_ab = null;
          field_bb = null;
          return;
        }
    }

    w(tb param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_Z = param1;
            if (null != this.field_Z) {
                var3_int = dl.field_b.b(this.field_Z, 260, dl.field_b.field_r);
                this.b(255, 150 - -var3_int, 300);
            }
            this.field_cb = new jm(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_cb.field_G = true;
            this.field_eb = false;
            this.field_gb = false;
            this.b(this.field_cb, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, byte param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        super.b(param0, param1, (byte) 109);
        dl.field_b.c(this.field_db, param1 + (this.field_g >> -135666879), 103 + param0, 16777215, -1);
        if (param2 >= 80) {
          if (this.field_Z != null) {
            em.e(param1 - -20, -7 + (120 + param0), 260, 8421504);
            discarded$2 = dl.field_b.a(this.field_Z, 20 + param1, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.field_r);
            return;
          } else {
            return;
          }
        } else {
          this.field_eb = true;
          if (this.field_Z == null) {
            return;
          } else {
            em.e(param1 - -20, -7 + (120 + param0), 260, 8421504);
            discarded$3 = dl.field_b.a(this.field_Z, 20 + param1, 8 + (param0 + 120), 260, 100, 16777215, -1, 1, 0, dl.field_b.field_r);
            return;
          }
        }
    }

    static {
        field_fb = "Unfortunately we are unable to create an account for you at this time.";
        field_bb = new int[]{20, 28};
    }
}
