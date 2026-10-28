/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static hh field_b;
    static hh field_a;

    final static void a(boolean param0) {
        if (!SpriteState.field_u) {
          throw new IllegalStateException();
        }
        c.field_u = true;
        SeekerMine.a((byte) -126, param0);
        ff.field_e = 0;
    }

    public static void a(byte param0) {
        if (param0 != 103) {
          field_a = (hh) null;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        try {
          bi.b();
          ij.field_i = 11;
          pb.field_c = new int[260];
          for (int var1_int = 0; var1_int < 256; var1_int++) {
            double var2 = 15.0;
            pb.field_c[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          if (param0 >= -19) {
            field_b = (hh) null;
          }
          int var5 = 256;
          int var1_intLifetime1 = var5;
          while (var5 < pb.field_c.length) {
            pb.field_c[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "pa.A(" + param0 + ')');
        }
    }

    static {
    }
}
