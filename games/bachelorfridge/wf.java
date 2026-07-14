/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ana {
    static boolean field_x;
    static String field_v;
    private vk field_w;

    private final void d(int param0) {
        if (param0 < -60) {
            return;
        }
        Object var3 = null;
        wf.a(-28, -56, 3, (jfa) null, 27);
    }

    public static void e(int param0) {
        field_v = null;
        if (param0 == 2) {
            return;
        }
        field_x = false;
    }

    private final void e(byte param0) {
        aga var2 = null;
        iv var3 = null;
        int var5 = 0;
        ad var6 = null;
        var5 = BachelorFridge.field_y;
        var2 = ((wf) this).field_w.field_l.a(40, ((wf) this).field_q.field_h);
        if (!var2.i(-99)) {
          var3 = (iv) (Object) ((wf) this).field_w.field_o.b((byte) 90);
          oha discarded$8 = al.a(-48, ((wf) this).field_w.field_k);
          if (param0 > 60) {
            L0: while (true) {
              if (var3 != null) {
                var3.a(var2, ((wf) this).field_q.field_h, 12);
                var6 = var3.field_h.a(-27449, ((wf) this).field_q);
                var6.b(-1, 7);
                var6.a(24831, 41, kna.field_g[31]);
                var3 = (iv) (Object) ((wf) this).field_w.field_o.c(0);
                continue L0;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    wf(gj param0, vk param1) {
        super(param0, (bca) (Object) param1);
        ((wf) this).field_w = param1;
    }

    final static void a(int param0, int param1, int param2, jfa param3, int param4) {
        int var5 = 0;
        if (!bp.e(param0 + -33828)) {
          sja.field_fb.c(90, (byte) 126);
          sja.field_fb.field_g = sja.field_fb.field_g + 2;
          var5 = sja.field_fb.field_g;
          rha.a(param3.field_g, (lu) (Object) sja.field_fb, (byte) -93);
          if (param0 != 3909) {
            field_x = true;
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param4, 0);
            sja.field_fb.a((byte) -88, -var5 + sja.field_fb.field_g);
            return;
          } else {
            sja.field_fb.d(param2, 0);
            sja.field_fb.d(param1, 0);
            sja.field_fb.d(param4, 0);
            sja.field_fb.a((byte) -88, -var5 + sja.field_fb.field_g);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, byte param1) {
        cq discarded$0 = ol.a(rt.field_a[param0], true);
        int var2 = 49 / ((83 - param1) / 43);
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -56 % ((71 - param0) / 47);
        ((wf) this).field_l = ((wf) this).field_l - 1;
        if ((((wf) this).field_l - 1 ^ -1) <= -1) {
          if (((wf) this).field_l == 25) {
            wf.a(34, (byte) -101);
            this.e((byte) 120);
            return false;
          } else {
            return false;
          }
        } else {
          this.d(-108);
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Now click End Phase again and watch the attack.  <br><col=BBFF00> Next</col>";
        field_x = true;
    }
}
