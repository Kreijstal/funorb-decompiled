/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oi {
    int field_k;
    static String field_g;
    int field_b;
    int field_h;
    int field_d;
    int field_j;
    int field_f;
    static oh field_e;
    static int field_m;
    static ie field_l;
    static int field_c;
    static String field_i;
    static int[] field_n;
    static jb field_a;

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (ie.field_l.startsWith("win")) {
                    if (in.a(18, param1)) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    if (param0 < -36) {
                      break L2;
                    } else {
                      oi.a(90);
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  fk.a(-41, (Throwable) null, "MGR1: " + param1);
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_12_0 = (RuntimeException) (var4_ref);

                stackIn_12_1 = new StringBuilder().append("oi.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "null";
                  break L3;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackIn_13_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L4;
                } else {
                  stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L4;
                }
              }
              throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1);

    final static void a(byte param0, int param1) {
        bc var2;
        var2 = nd.field_Lb;
        if (param0 != 126) {
          field_n = (int[]) null;
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        } else {
          var2.f(param1, (byte) -92);
          var2.a(1, false);
          var2.a(3, false);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_l = null;
        field_e = null;
        field_g = null;
        field_n = null;
        if (param0 >= -22) {
            field_c = -30;
        }
    }

    final static cn a(Throwable param0, String param1) {
        cn var2 = null;
        if (!(param0 instanceof cn)) {
            var2 = new cn(param0, param1);
        } else {
            var2 = (cn) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        }
        return var2;
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_g = "to keep fullscreen or";
        field_e = new oh(270, 70);
        field_i = "You are offering an unrated rematch.";
        field_n = new int[256];
    }
}
