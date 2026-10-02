/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends IntrusiveNode {
    static String previousText;
    int field_k;
    static long[] field_l;
    static Sprite[] field_r;
    static String[] field_f;
    int[] field_q;
    int field_m;
    static int field_h;
    int field_n;
    static GameplayEntity[] entitiesById;
    int field_p;
    int field_i;
    int field_j;

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param1 == -91) {
                try {
                  var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                  param0.getAppletContext().showDocument(wf.a(var2, 68, param0), "_top");
                  return;
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
              } else {
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_8_0 = (RuntimeException) (var2_ref2);

              stackIn_8_1 = new StringBuilder().append("tl.A(");

              if (param0 == null) {
                stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                stackIn_9_2 = "null";
              } else {
                stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                stackIn_9_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        if (param0 == 6491) {
            previousText = null;
            entitiesById = null;
            field_l = null;
            field_f = null;
            field_r = null;
            return;
        }
        tl.b(-67);
        previousText = null;
        entitiesById = null;
        field_l = null;
        field_f = null;
        field_r = null;
    }

    tl() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7) {
        try {
            this.field_p = param5;
            this.field_n = param0;
            this.field_q = param6;
            this.field_m = param2;
            this.field_i = param1;
            if (!param7) {
                tl.b(-125);
            }
            this.field_k = param4;
            this.field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "tl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    static {
        previousText = "Prev";
        field_l = new long[32];
        entitiesById = new GameplayEntity[1000];
    }
}
