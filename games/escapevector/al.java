/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int[] field_f;
    static int[] field_a;
    static hf field_d;
    static hh field_b;
    static long field_e;
    static String field_c;

    final static int a(int param0, int param1) {
        param0 = l.a(param1 - 34966, param0);
        if (param0 < 0) {
          return -1;
        }
        if (param0 == 1) {
          return 1;
        }
        if (param0 == 0) {
          return 0;
        }
        if (param0 == 2) {
          return 2;
        }
        if (param0 == 3) {
          return 3;
        }
        if (param1 != 26504) {
          lk var3 = (lk) null;
          al.a(-101, -4, (lk) null, 127, 70, -30);
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -1) {
          al.a((byte) 104);
        }
        field_f = null;
        field_c = null;
    }

    final static ed a(byte param0) {
        int var4_int = 0;
        int var5 = EscapeVector.field_A;
        int var1 = bc.field_a[0] * qh.field_k[0];
        byte[] var2 = qe.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = qk.field_f[ae.a((int) var2[var4_int], 255)];
        }
        ed var4 = new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var3);
        of.a(false);
        if (param0 < 98) {
          field_a = (int[]) null;
        }
        return var4;
    }

    final static af a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        af var7 = null;
        java.awt.Frame var8 = null;
        af stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ib.a((byte) 93, param0, param3, param2, param4, param5);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new af();
          var7.field_d = var8;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          if (param1 != -16493) {
            field_b = (hh) null;
          }
          var7.setBounds(0, 0, param0, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("al.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_a = new int[256];
        field_f = new int[1024];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_a[var1] = var0;
        }
        field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
