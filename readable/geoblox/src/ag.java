/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag extends TextInputValidator {
    private static long[] field_m;
    static int field_l;
    static boolean[] field_j;
    static int availableSpriteVariantCount;
    static int field_i;

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 422) {
            field_l = -21;
          }
          if (this.validationStateForText(-257, candidateText) != si.field_m) {
            stackIn_6_0 = da.createEmailValidText;
            return stackIn_6_0;
          }
          stackIn_4_0 = wj.createInvalidEmailAlertText;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var3);
          stackIn_9_1 = new StringBuilder().append("ag.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_2_0 = Byte.TYPE;
            return stackIn_2_0;
          }
          if (param0.equals("I")) {
            stackIn_6_0 = Integer.TYPE;
            return stackIn_6_0;
          }
          if (param0.equals("S")) {
            stackIn_9_0 = Short.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("J")) {
            stackIn_12_0 = Long.TYPE;
            return stackIn_12_0;
          }
          if (param0.equals("Z")) {
            stackIn_15_0 = Boolean.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("F")) {
            stackIn_19_0 = Float.TYPE;
            return stackIn_19_0;
          }
          if (param0.equals("D")) {
            stackIn_23_0 = Double.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("C")) {
            stackIn_27_0 = Character.TYPE;
            return stackIn_27_0;
          }
          if (param1) {
            ag.g(26);
          }
          stackIn_31_0 = Class.forName(param0);
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = (RuntimeException) (var2);
          stackIn_34_1 = new StringBuilder().append("ag.E(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String decodeTextBytes(int decodeGuard, byte[] textBytes) {
        RuntimeException decodingFailureForContext = null;
        String decodedTextBeforeReturn = null;
        RuntimeException decodingFailureBeforeDescription = null;
        StringBuilder decodingMessagePrefix = null;
        String textBytesDescription = null;
        RuntimeException caughtDecodingFailure = null;
        try {
          if (decodeGuard != 1) {
            field_j = (boolean[]) null;
          }
          decodedTextBeforeReturn = bc.decodeTextSlice(-8, textBytes, 0, textBytes.length);
          return decodedTextBeforeReturn;
        } catch (java.lang.RuntimeException decodingFailure) {
          caughtDecodingFailure = decodingFailure;
          decodingFailureForContext = caughtDecodingFailure;
          decodingFailureBeforeDescription = (RuntimeException) (decodingFailureForContext);
          decodingMessagePrefix = new StringBuilder().append("ag.B(").append(decodeGuard).append(',');
          if (textBytes == null) {
            textBytesDescription = "null";
          } else {
            textBytesDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) decodingFailureBeforeDescription), ((StringBuilder) (Object) decodingMessagePrefix).append(textBytesDescription).append(')').toString());
        }
    }

    final lh validationStateForText(int guard, String candidateText) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        lh stackIn_5_0 = null;
        lh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != ca.a(candidateText, 1)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_5_0 = si.field_m;
            return stackIn_5_0;
          }
          if (guard != -257) {
            var4 = (String) null;
            this.validationMessageForText(97, (String) null);
          }
          stackIn_9_0 = kk.field_w;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var3);
          stackIn_12_1 = new StringBuilder().append("ag.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        je var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Geoblox.field_C;
        try {
          j.field_gb = param0;
          var2 = (je) ((Object) qa.field_f.firstForIteration(0));
          if (param1 != -67) {
            return;
          }
          L0: while (var2 != null) {
            if (!var2.field_f.a(126)) {
              var2.unlinkNode(false);
            } else {
              var2.field_g.f((int)((float)(j.field_gb * var2.field_i / 80) * 1.399999976158142f));
            }
            var2 = (je) ((Object) qa.field_f.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "ag.F(" + param0 + ',' + param1 + ')');
        }
    }

    public static void g(int param0) {
        field_j = null;
        if (param0 > -13) {
            byte[] var2 = (byte[]) null;
            ag.decodeTextBytes(95, (byte[]) null);
            field_m = null;
            return;
        }
        field_m = null;
    }

    ag(dj param0) {
        super(param0);
    }

    final static void c(int param0, String param1) {
        try {
            rd.a(-119, param1);
            if (param0 != 12607) {
                field_l = 32;
            }
            fa.a(rj.loggingInText, 480, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ag.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_m = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          L1: for (var3 = 0; var3 < 8; var3++) {
            if (1L != (1L & var0)) {
              var0 = var0 >>> 1;
              continue L1;
            }
            var0 = -3932672073523589310L ^ var0 >>> 1;
          }
          field_m[var2] = var0;
        }
        field_j = new boolean[7];
        field_i = 0;
    }
}
