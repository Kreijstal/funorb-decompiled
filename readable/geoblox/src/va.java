/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static int field_b;
    static ck field_f;
    static boolean field_d;
    static al field_e;
    static int field_a;
    static IntrusiveDeque field_c;

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                ScorePopup.field_j = param0;
                try {
                    var3 = param1.getParameter("cookieprefix");
                    var4 = param1.getParameter("cookiehost");
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (!(~param0.length() != param2)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    wk.a(param1, "document.cookie=\"" + var5 + "\"", (byte) -92);
                } catch (Throwable throwable) {
                }
                oj.a(param1, 20000000);
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) ((Object) runtimeException), "va.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Sprite[] a(int param0, byte param1) {
        if (param1 != -112) {
            field_e = (al) null;
        }
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = ef.a(0, param0, 64);
        return var2;
    }

    final static void a(int param0, byte[] param1, int param2, int[] param3, byte param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Geoblox.field_C;
        try {
          var5_int = 0;
          L0: while (true) {
            if (var5_int >= ch.meshFaceCountsByDepthBucket.length) {
              if (param4 != -85) {
                va.a(80, (byte) 55);
              }
              return;
            }
            param2 = ch.meshFaceCountsByDepthBucket[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param2;
              param2--;
              if (0 == incrementValue$0) {
                var5_int++;
                continue L0;
              }
              incrementValue$1 = var6;
              var6++;
              param0 = pj.meshFaceOrder[incrementValue$1];
              dupTemp$2 = param1[param0];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              pj.meshFaceOrder[dupTemp$3] = param0;
              continue;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("va.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_d = false;
        field_f = new ck(14, 0, 4, 1);
        field_e = new al();
    }
}
