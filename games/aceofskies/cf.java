/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends sk {
    static int field_g;
    static String normalizedPlayerName;
    static ResourceArchive field_f;

    public static void f(int param0) {
        field_f = null;
        normalizedPlayerName = null;
        int var1 = -94 % ((-48 - param0) / 41);
    }

    final static void a(Sprite[] param0, int param1, byte param2, int param3, int param4) {
        String stackIn_13_2 = null;
        int var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param0 != null &&
            0 < param4) {
            int var5_int = param0[0].fullWidth;
            int var6 = param0[2].fullWidth;
            int var7 = param0[1].fullWidth;
            param0[0].b(param1, param3);
            param0[2].b(param1 + param4 - var6, param3);
            SoftwareRasterizer.saveClip(rl.field_a);
            SoftwareRasterizer.intersectClip(param1 + var5_int, param3, param4 + (param1 - var6), param0[1].fullHeight + param3);
            int var8 = param1 + var5_int;
            int var9 = -var6 + param1 + param4;
            param1 = var8;
            if (param2 > -108) {
              cf.f(78);
            }
            while (var9 > param1) {
              param0[1].b(param1, param3);
              param1 = param1 + var7;
            }
            SoftwareRasterizer.restoreClip(rl.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
          return true;
        }
        return true;
    }

    final void a(int param0, int param1, jj param2) {
        try {
          this.field_b.a(param2, -9135);
          if (param1 <= 66) {
            Sprite[] var5 = (Sprite[]) null;
            cf.a((Sprite[]) null, -3, (byte) -124, 39, -48);
          }
          this.field_b.b(param0, false);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "cf.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 == 1786747298) {
          return;
        }
        normalizedPlayerName = (String) null;
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a(true, -26973);
        if (param1 >= 2) {
          return;
        }
        this.a(-1, 10, -110);
    }

    cf(bf param0) {
        super(param0);
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          return;
        }
        this.a(false, (byte) 24);
    }

    final void a(boolean param0) {
        this.field_b.a(false, -26973);
        if (!param0) {
          Sprite[] var3 = (Sprite[]) null;
          cf.a((Sprite[]) null, 33, (byte) -18, -72, -45);
          return;
        }
    }

    static {
        field_g = 0;
    }
}
