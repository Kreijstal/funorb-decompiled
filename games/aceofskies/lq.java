/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static int field_a;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            if (jr.field_u) {
              return true;
            }
            try {
              String var2 = "tuhstatbut";
              if (param1 != 61) {
                return true;
              }
              String var3 = (String) (fe.a("getcookies", (byte) -108, param0));
              String[] var4 = ee.a((byte) 10, ';', var3);
              for (int var5 = 0; var5 < var4.length; var5++) {
                int var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2_ref = decompiledCaughtException;
            }
            boolean stackIn_21_0 = (param0.getParameter("tuhstatbut") != null);
            return stackIn_21_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_24_0 = var2_ref2;
            StringBuilder stackIn_24_1 = new StringBuilder().append("lq.B(");
            if (param0 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static SoundPlayback a(PcmSample[] param0, int param1) {
        String stackIn_5_2 = null;
        try {
          int var2_int = -14 / ((35 - param1) / 33);
          SoundPlayback stackIn_1_0 = bm.a((byte) -70, param0[qq.a(20, param0.length)]);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var2;
          StringBuilder stackIn_4_1 = new StringBuilder().append("lq.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 0;
    }
}
