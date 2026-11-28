/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static boolean field_a;
    static String field_c;
    static String field_b;
    static String[] field_d;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void clearStaticReferences(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        int var1 = 88 / ((-23 - param0) / 44);
    }

    final static void a(int param0, hi param1, int param2) {
        ih var5 = null;
        int var4 = 0;
        try {
          var5 = ud.field_b;
          var5.e(param2 + 7, param0);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(param2 ^ -12, param2);
          var5.writeByte(-11, param1.field_j);
          var5.writeByte(param2 - 12, param1.field_m);
          var5.writeInt(param1.field_o, (byte) -46);
          var5.writeInt(param1.field_i, (byte) -82);
          var5.writeInt(param1.field_l, (byte) -67);
          var5.writeInt(param1.field_n, (byte) -42);
          var5.appendCrc32(var4, param2 - 30533);
          var5.backpatchByteLength((byte) -81, var5.position - var4);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "sc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var5 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          var1 = ResourceArchive.field_f;
          synchronized (var1) {
            MatchingFieldValidator.field_o = tc.field_h;
            lg.field_d = lg.field_d + 1;
            if (~ProxyAuthenticationRequiredException.field_f > param0) {
              var5 = 0;
              var2 = var5;
              while (var5 < 112) {
                MidiPcmStream.field_H[var5] = false;
                var5++;
              }
              ProxyAuthenticationRequiredException.field_f = sd.field_a;
            } else {
              while (ProxyAuthenticationRequiredException.field_f != sd.field_a) {
                var2 = qk.field_b[sd.field_a];
                sd.field_a = 127 & 1 + sd.field_a;
                if (0 <= var2) {
                  MidiPcmStream.field_H[var2] = true;
                  continue;
                }
                MidiPcmStream.field_H[~var2] = false;
              }
            }
            tc.field_h = ak.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.wrapClientException((Throwable) ((Object) var1_ref), "sc.A(" + param0 + ')');
        }
    }

    static {
        field_a = true;
        field_b = "Create a free account to start using this feature";
        field_c = "Loading levels";
        field_d = new String[16];
    }
}
