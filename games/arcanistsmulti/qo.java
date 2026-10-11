/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo {
    static String field_d;
    static dn field_f;
    static int field_e;
    static int field_b;
    static String field_c;
    static int[] field_a;
    static String field_g;

    final static void a(int param0, byte param1, long param2) {
        ab var4 = he.field_e;
        var4.b((byte) -75, param0);
        var4.field_g = var4.field_g + 1;
        int var5 = var4.field_g;
        var4.f(6, (byte) -32);
        if (param1 < -61) {
          var4.a(param2, (byte) 72);
          var4.b(var4.field_g - var5, (byte) 43);
          return;
        }
        field_e = -61;
        var4.a(param2, (byte) 72);
        var4.b(var4.field_g - var5, (byte) 43);
    }

    final static void a(int param0, int param1) {
        on.field_h = (param1 & 48) >> 4;
        if (on.field_h > 2) {
          on.field_h = 2;
        }
        ra.field_m = (param1 & 13) >> 2;
        if (ra.field_m > param0) {
          ra.field_m = 2;
        }
        hd.field_b = param1 & 3;
        if (hd.field_b > 2) {
          hd.field_b = 2;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var4Lifetime1;
        jf.field_a.field_g = 0;
        jf.field_a.f(12, (byte) -45);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.a(ag.field_D.nextInt(), (byte) -101);
        jf.field_a.f(param0, (byte) -10);
        if (param3 < -125) {
          jf.field_a.f(param1, (byte) -50);
          jf.field_a.c(param2, (byte) -66);
          jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
          he.field_e.b((byte) -25, 18);
          fieldTemp$0 = he.field_e.field_g + 1;
          he.field_e.field_g = he.field_e.field_g + 1;
          var4 = fieldTemp$0;
          he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
          he.field_e.b(he.field_e.field_g - var4, (byte) 43);
          return;
        }
        qo.a(5, 14, 54, (byte) 68);
        jf.field_a.f(param1, (byte) -50);
        jf.field_a.c(param2, (byte) -66);
        jf.field_a.a(q.field_K, (byte) 98, nl.field_Jb);
        he.field_e.b((byte) -25, 18);
        int fieldTemp$1 = he.field_e.field_g + 1;
        he.field_e.field_g = he.field_e.field_g + 1;
        var4Lifetime1 = fieldTemp$1;
        he.field_e.a(jf.field_a.field_j, 0, (byte) -86, jf.field_a.field_g);
        he.field_e.b(he.field_e.field_g - var4Lifetime1, (byte) 43);
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = rl.a(be.a(param1, false), 29424);
          if (param0 < 67) {
            var3 = (CharSequence) null;
            qo.a((byte) -47, (CharSequence) null);
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("qo.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 6) {
          field_g = null;
          field_d = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        }
        field_a = (int[]) null;
        field_g = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (hn.a(param0, 17769)) {
            return true;
          }
          var6 = ih.field_c;
          var2 = var6;
          for (var3 = param1; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param0 == var4) {
              return true;
            }
          }
          var2Lifetime1 = eh.field_f;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "qo.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Mouse over an icon for details";
        field_b = 50;
        field_d = "<%0> has dropped out.";
        field_a = new int[]{19, 20, 21, 22, 23, 24, 51, 60, 52};
        field_g = "You can join this game";
    }
}
