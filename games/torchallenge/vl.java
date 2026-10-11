/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static String field_c;
    static int field_b;
    static uj field_a;
    static boolean[][][] field_d;

    final static void a(byte param0) {
        if (!lj.field_q) {
          throw new IllegalStateException();
        }
        if (param0 != -88) {
          field_a = (uj) null;
        }
        fh.field_g = true;
        wb.a(false, (byte) -80);
        gj.field_c = 0;
    }

    final static void b(byte param0) {
        fg.i(126);
        eb.field_m = true;
        ga.field_y = true;
        int var1 = 45 / ((-48 - param0) / 48);
        t.field_b.i(8389905);
        gh.a((byte) -116, ub.field_g, false);
    }

    final static void a(byte[] param0, int param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 != null &&
            hf.field_d != null) {
            var2_int = 28;
            if (var2_int <= param0.length &&
              var2_int <= hf.field_d.length) {
              if (hf.field_d.length != param0.length) {
                return;
              }
              if (param1 < 6) {
                field_d = (boolean[][][]) null;
              }
              var3 = hf.field_d.length;
              for (var4 = 0; var4 < var3; var4++) {
                hf.field_d[var4] = (byte)p.a((int) hf.field_d[var4], (int) param0[var4]);
              }
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("vl.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = (boolean[][][]) null;
        if (param0 != 0) {
          field_c = (String) null;
        }
        field_c = null;
        field_a = null;
    }

    static {
        field_c = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_d = new boolean[][][]{new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false, false, false}, new boolean[]{true, true, true, true}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}};
    }
}
