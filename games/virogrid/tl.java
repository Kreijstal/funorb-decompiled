/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends wh {
    static int field_l;
    private java.nio.ByteBuffer field_g;
    static String field_f;
    static String field_h;
    static int field_i;
    static String field_k;
    static String field_e;
    static String field_j;

    tl() {
    }

    final static void a(float param0, boolean param1, float param2) {
        if (param1) {
          return;
        }
        if (jk.field_c == 2 ||
          1 == wn.field_C) {
          return;
        }
        lj.field_r = lj.field_r + param0;
        if (jk.field_c == 1) {
          jk.field_c = 0;
        }
        if (lj.field_r < 116.0f) {
          if (jk.field_c == 2) {
            cf.field_c = cf.field_c + param2;
            if (!(lj.field_r > 295.0f)) {
              if (!dc.field_Y[25]) {
                vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                gb.c((byte) -44);
                ce.field_E = id.field_r;
                return;
              }
              cf.field_c = 3.1415927410125732f;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
              ce.field_E = id.field_r;
              return;
            }
            lj.field_r = 295.0f;
            if (dc.field_Y[25]) {
              cf.field_c = 3.1415927410125732f;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
              ce.field_E = id.field_r;
              return;
            }
            vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
            vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
            gb.c((byte) -44);
            ce.field_E = id.field_r;
            return;
          }
          lj.field_r = 116.0f;
        }
        cf.field_c = cf.field_c + param2;
        if (lj.field_r > 295.0f) {
          lj.field_r = 295.0f;
          if (!dc.field_Y[25]) {
            vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
            vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
            gb.c((byte) -44);
            ce.field_E = id.field_r;
            return;
          }
          cf.field_c = 3.1415927410125732f;
          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
          gb.c((byte) -44);
          ce.field_E = id.field_r;
          return;
        }
        if (!dc.field_Y[25]) {
          vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
          vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
          gb.c((byte) -44);
          ce.field_E = id.field_r;
          return;
        }
        cf.field_c = 3.1415927410125732f;
        vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
        vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
        gb.c((byte) -44);
        ce.field_E = id.field_r;
    }

    final void a(byte[] param0, byte param1) {
        try {
          this.field_g = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_g.position(0);
          this.field_g.put(param0);
          if (param1 != -4) {
            this.b(105);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "tl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] b(int param0) {
        byte[] var3 = null;
        byte[] var2 = null;
        byte[] var3Lifetime1;
        byte[] var2Lifetime1;
        if (param0 >= 73) {
          var3 = new byte[this.field_g.capacity()];
          var2 = var3;
          this.field_g.position(0);
          this.field_g.get(var3);
          return var3;
        }
        this.field_g = (java.nio.ByteBuffer) null;
        var3Lifetime1 = new byte[this.field_g.capacity()];
        var2Lifetime1 = var3Lifetime1;
        this.field_g.position(0);
        this.field_g.get(var3Lifetime1);
        return var3Lifetime1;
    }

    public static void b(byte param0) {
        int var1 = -62 % ((param0 - 26) / 42);
        field_k = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_f = null;
    }

    static {
        field_f = "Player";
        field_h = "Name";
        field_k = "Ignore";
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
