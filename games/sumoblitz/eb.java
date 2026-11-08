/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    private cs field_d;
    static ResourceArchive field_f;
    static SoundCache field_b;
    private IntrusiveDeque field_e;
    private LegacyOpenGlGraphicsToolkit field_c;
    static int[] field_a;

    final boolean a(int param0) {
        if (param0 == 550267135) {
          return null != this.field_d ? true : false;
        }
        field_b = (SoundCache) null;
        return null != this.field_d ? true : false;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param0 - 1 & param2 >> 31;
        if (param1 > 87) {
          return ((param2 >>> 31) + param2) % param0 + var3;
        }
        return -115;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        int var1 = -15 / ((param0 + 74) / 44);
        field_a = null;
        field_f = null;
    }

    final void a(byte param0) {
        int var2;
        IntrusiveNode var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = -61 / ((param0 - 13) / 45);
        this.field_d = null;
        if (this.field_e.isEmpty((byte) -78)) {
          return;
        }
        var3 = this.field_e.first(86);
        while (this.field_e.sentinel != var3) {
          ((ve) (var3)).c(50);
          var3 = var3.next;
        }
    }

    eb(LegacyOpenGlGraphicsToolkit param0) {
        this.field_e = new IntrusiveDeque();
        try {
          this.field_c = param0;
          if (this.field_c.field_xc) {
            if (!this.field_c.field_C) {
              return;
            }
            this.field_d = new cs(this.field_c);
            if (this.field_c.field_Bc > 1 &&
              this.field_c.field_B &&
              this.field_c.field_vb) {
              this.field_d = new cs(this.field_c);
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
