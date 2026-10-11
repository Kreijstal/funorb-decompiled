/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends bk {
    private String field_k;
    static String[] field_i;
    static String field_j;
    static int field_g;
    private long field_h;
    static String field_f;
    static String field_e;

    ul a(boolean param0) {
        if (!param0) {
          mh.b((byte) -16);
        }
        return p.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        if (param0 != 51) {
          field_i = (String[]) null;
        }
        field_e = null;
    }

    final static String a(CharSequence[] param0, byte param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == 1) {
            var10 = param0[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          if (param1 <= 3) {
            mh.a(-16L, (byte) -125);
          }
          for (var7 = param2; var7 < var4_int; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("mh.D(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, jc param1) {
        try {
          param1.a((byte) 87, this.field_h);
          param1.c(this.field_k, (byte) 60);
          if (param0) {
            mh.a(-122L, (byte) -22);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          CharSequence[] var4 = null;
          try {
            Thread.sleep(param0);
            if (param1 != -88) {
              var4 = (CharSequence[]) null;
              mh.a((CharSequence[]) null, (byte) 99, -73, 66);
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    mh(long param0, String param1) {
        try {
          this.field_k = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "mh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new String[]{"None", "Easy", "Normal", "Hard"};
        field_f = "<%0> has resigned and left.";
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_j = "Create your own free Jagex account";
    }
}
