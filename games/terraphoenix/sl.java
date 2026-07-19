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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if ((uh.field_H ^ -1) > -11) {
                L2: {
                  var3_int = 0;
                  if (il.field_e) {
                    var3_int = 1;
                    il.field_e = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                sa.a(-26, vb.b((byte) -27), fc.a(-1), oi.field_H, var3_int != 0);
                break L1;
              } else {
                if (!sl.a((byte) -40)) {
                  l.a();
                  ch.a((byte) -79, 240, 320);
                  ia.a(0, param0, 0, (byte) 113);
                  break L1;
                } else {
                  if (-1 != (q.field_Jb ^ -1)) {
                    ej.a(-12966, param0);
                    break L1;
                  } else {
                    ad.a(param1, 0, false);
                    ia.a(0, param0, 0, (byte) 126);
                    break L1;
                  }
                }
              }
            }
            if (param2 == 80) {
              break L0;
            } else {
              field_c = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("sl.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    public static void b(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -58) {
          field_f = (String) null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          return;
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -12) {
            return false;
        }
        return -251 > (kf.field_f ^ -1) ? true : false;
    }

    static {
        field_c = "EXCLUSIVE";
        field_f = "Go Back";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_e = 20;
    }
}
