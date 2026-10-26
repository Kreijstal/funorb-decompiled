/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st {
    static String[] field_b;
    static float[] field_a;

    final static me[] a(boolean param0, CipherPacketBuffer param1) {
        int var5 = 0;
        me[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        me[] var4 = null;
        int var6 = 0;
        me var6_ref_me = null;
        int var7 = 0;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.b((byte) -96, 8);
          if (var2_int > 0) {
            return null;
          }
          var3 = param1.b((byte) -77, 12);
          var4 = new me[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!tn.a(101, param1)) {
              var6 = param1.b((byte) 83, eo.a(112, var5 - 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_me = new me();
              param1.b((byte) 110, 24);
              param1.b((byte) 80, 24);
              var6_ref_me.field_c = param1.b((byte) 114, 24);
              param1.b((byte) -76, 9);
              param1.b((byte) -56, 12);
              param1.b((byte) -49, 12);
              param1.b((byte) 103, 12);
              var4[var5] = var6_ref_me;
            }
          }
          if (!param0) {
            st.a((byte) -3);
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("st.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 > -78) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(boolean param0, boolean param1, boolean param2, boolean param3) {
        int var4;
        var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        if (param1) {
          return wd.field_G[var4];
        }
        field_a = (float[]) null;
        return wd.field_G[var4];
    }

    final static void a(byte param0) {
        if (param0 != 87) {
          field_b = (String[]) null;
        }
    }

    static {
        field_b = new String[16];
        field_a = new float[4];
    }
}
