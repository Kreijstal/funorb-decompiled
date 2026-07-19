/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends l {
    static String field_k;
    static long field_l;
    static String field_g;
    byte[] field_h;
    static int field_j;
    static p field_m;
    static int field_n;
    static float field_i;

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        fe.field_Fb = false;
        vd.field_X = null;
        if (param0 == -2) {
          if (!kb.field_c) {
            var1 = mf.field_h;
            if (0 < var1) {
              if ((var1 ^ -1) == -2) {
                vd.field_X = og.field_n;
                vd.field_X = ll.a((byte) 67, new CharSequence[]{(CharSequence) ((Object) vd.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ie.field_c)});
                hf.field_w.h(true);
                dk.f(389);
                return;
              } else {
                vd.field_X = oi.a(new String[]{Integer.toString(var1)}, di.field_t, param0 + 4);
                vd.field_X = ll.a((byte) 67, new CharSequence[]{(CharSequence) ((Object) vd.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ie.field_c)});
                hf.field_w.h(true);
                dk.f(389);
                return;
              }
            } else {
              hf.field_w.h(true);
              dk.f(389);
              return;
            }
          } else {
            hf.field_w.k(119);
            return;
          }
        } else {
          sg.d(82);
          if (!kb.field_c) {
            var1 = mf.field_h;
            if (0 < var1) {
              if ((var1 ^ -1) == -2) {
                vd.field_X = og.field_n;
                vd.field_X = ll.a((byte) 67, new CharSequence[]{(CharSequence) ((Object) vd.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ie.field_c)});
                hf.field_w.h(true);
                dk.f(389);
                return;
              } else {
                vd.field_X = oi.a(new String[]{Integer.toString(var1)}, di.field_t, param0 + 4);
                vd.field_X = ll.a((byte) 67, new CharSequence[]{(CharSequence) ((Object) vd.field_X), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ie.field_c)});
                hf.field_w.h(true);
                dk.f(389);
                return;
              }
            } else {
              hf.field_w.h(true);
              dk.f(389);
              return;
            }
          } else {
            hf.field_w.k(119);
            return;
          }
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_m = null;
        if (param0 != -2) {
            field_i = -0.09383044391870499f;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void c(int param0) {
        rk.a(dc.field_V, (byte) -32);
        if (param0 != 0) {
            sg.c(-27);
        }
    }

    sg(byte[] param0) {
        try {
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "sg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "The '<%0>' setting needs to be changed.";
        field_g = "Email address is unavailable";
        field_m = new p();
    }
}
