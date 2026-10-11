/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static ci[] field_b;
    static int field_d;
    static String field_c;
    static int field_e;
    static String field_f;
    static String field_a;

    final static void a(java.awt.Canvas param0, boolean param1, byte param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Terraphoenix.field_V;
        try {
          if (uh.field_H < 10) {
            var3_int = 0;
            if (il.field_e) {
              var3_int = 1;
              il.field_e = false;
            }
            sa.a(-26, vb.b((byte) -27), fc.a(-1), oi.field_H, var3_int != 0);
          } else {
            if (!sl.a((byte) -40)) {
              l.a();
              ch.a((byte) -79, 240, 320);
              ia.a(0, param0, 0, (byte) 113);
            } else {
              if (q.field_Jb != 0) {
                ej.a(-12966, param0);
              } else {
                ad.a(param1, 0, false);
                ia.a(0, param0, 0, (byte) 126);
              }
            }
          }
          if (param2 == 80) {
            return;
          }
          field_c = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("sl.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 == -58) {
          field_f = null;
          field_a = null;
          return;
        }
        field_f = (String) null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(byte param0) {
        if (param0 >= -12) {
          return false;
        }
        return kf.field_f > 250 ? true : false;
    }

    static {
        field_c = "EXCLUSIVE";
        field_f = "Go Back";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_e = 20;
    }
}
