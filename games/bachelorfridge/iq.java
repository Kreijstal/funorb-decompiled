/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq extends lw {
    static kia field_m;
    static kv field_l;

    iq() {
        super(true, new String[]{su.field_e, n.field_d, ur.field_f, ld.field_m, uu.field_zb, wf.field_v}, kr.field_xb);
        try {
          this.field_c = new int[][]{new int[]{160, 390}, new int[]{160, 390}, new int[]{160, 350}, new int[]{160, 390}, new int[]{160, 380}, new int[]{160, 400}};
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iq.<init>()");
        }
    }

    public static void d(byte param0) {
        field_m = null;
        if (param0 > -92) {
          return;
        }
        try {
          field_l = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iq.A(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 == this.field_e) {
            vg.a(sia.field_j, 8640, 22997, 48000, 4096, 1120, 4096, sia.field_j.field_o << 3, sia.field_j.field_n << 3);
          }
          if (param0 > 103) {
            return;
          }
          iq.d((byte) 72);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "iq.D(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        try {
          if (param1 != 73) {
            iq.d((byte) -86);
          }
          if (param0 == 38 &&
            this.field_e != 5 &&
            0 == this.field_e) {
            this.b(param1 - 72);
            this.c(param1 - 2);
            return;
          }
          if (param0 == 21 &&
            this.field_e != 5 &&
            this.field_e == 1) {
            this.b(1);
            this.c(param1 ^ 42);
            cm.field_v = true;
            return;
          }
          if (param0 == 22 &&
            5 == this.field_e) {
            this.b(1);
            this.b((byte) 112);
            if (!this.c((byte) 95)) {
              return;
            }
            fla.b(23621);
            return;
          }
          if (param0 == 22 &&
            5 != this.field_e &&
            this.field_e == 2) {
            this.b(1);
            this.b((byte) 112);
            cm.field_v = false;
            return;
          }
          if (param0 == 23 &&
            this.field_e != 5) {
            this.c(param1 + 49);
            return;
          }
          if (20 == param0 &&
            this.field_e != 2 &&
            5 != this.field_e &&
            this.field_e == 3) {
            this.b(1);
            return;
          }
          if (param0 == 24 &&
            this.field_e != 2 &&
            5 != this.field_e) {
            this.b(1);
            this.c(114);
            return;
          }
          if (param0 == 25 &&
            this.field_e == 4 &&
            5 != this.field_e) {
            this.b(1);
            this.c(param1 + 27);
            cm.field_v = true;
            return;
          }
          if (param0 == 34) {
            if (this.field_e != 5) {
              return;
            }
            this.b((byte) 112);
            if (this.c((byte) 95)) {
              fla.b(23621);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var3), "iq.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
    }
}
