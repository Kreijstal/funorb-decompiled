/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class glb {
    private mkb field_b;
    static String[] field_c;
    static String field_a;

    final static void c(int param0) {
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        qw var1 = null;
        nl var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          if (param0 != 17043) {
            field_a = (String) null;
          }
          if (ms.field_y != null &&
            !ms.field_y.b(-42)) {
            var1 = (qw) (ms.field_y.d(0));
            while (var1 != null) {
              if (!var1.field_k.b((byte) -63)) {
                var1.b(-3846);
              }
              var1 = (qw) (ms.field_y.a((byte) 77));
            }
          }
          if (null != gtb.field_d) {
            stackIn_13_0 = gtb.field_d.b(-74);
            if (stackIn_13_0) {
              return;
            }
            var1_ref = (nl) (gtb.field_d.d(0));
            while (var1_ref != null) {
              if (!var1_ref.field_h) {
                nmb.a((byte) -91, var1_ref.field_d);
                var1_ref.b(param0 ^ -19863);
              } else {
                if (var1_ref.field_g) {
                  var2 = uv.a(param0 - 16915, var1_ref.field_i);
                  var3 = pja.b((byte) 119, var1_ref.field_i, var1_ref.field_f);
                  var1_ref.field_d.a(param0 ^ 16915, var3, var2);
                }
                var1_ref.field_h = false;
              }
              var1_ref = (nl) (gtb.field_d.a((byte) 12));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref2), "glb.C(" + param0 + ')');
        }
    }

    glb(boolean param0) {
    }

    final void a(int param0) {
        if (null != this.field_b) {
          this.field_b.a(param0 - 26459);
        }
        if (param0 == 26363) {
          return;
        }
        field_a = (String) null;
    }

    public static void b(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -17471) {
          glb.c(99);
        }
    }

    static {
        field_c = new String[]{"Blue", "Yellow", "Neutral"};
        field_a = "Spectate";
    }
}
