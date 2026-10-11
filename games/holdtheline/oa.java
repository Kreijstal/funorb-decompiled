/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends el {
    static hj field_s;
    static oa field_p;
    int field_q;
    private String field_r;
    static String field_o;

    final static boolean b(byte param0) {
        if (param0 != 103) {
          return false;
        }
        if (bk.field_w < 10) {
          return false;
        }
        if (!mn.field_a) {
          return !gd.e((byte) 63) ? true : false;
        }
        return false;
    }

    oa(String param0, int param1) {
        super(0, 0);
        try {
          this.a(-122, param0, 384 * param1 / 96);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oa(String param0) {
        super(0, 0);
        try {
          this.a(91, param0, 384);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, int param2) {
        el var4 = null;
        try {
          this.field_q = param2;
          this.field_r = param1;
          int var5 = -30 % ((-59 - param0) / 62);
          var4 = jh.field_a.a(this.field_r, (byte) -125);
          this.field_n = var4.field_n;
          this.field_l = var4.field_l;
          this.field_j = var4.field_j;
          this.field_m = var4.field_m;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "oa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 == 43) {
          field_s = null;
          field_o = null;
          field_p = null;
          return;
        }
        field_p = (oa) null;
        field_s = null;
        field_o = null;
        field_p = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (param2 == -3248) {
          var3 = param1 >> 31 & -1 + param0;
          return (param1 + (param1 >>> 31)) % param0 + var3;
        }
        oa.a(117, -101, -101);
        var3Lifetime1 = param1 >> 31 & -1 + param0;
        return (param1 + (param1 >>> 31)) % param0 + var3Lifetime1;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              if (!param0) {
                return;
              }
              param1.getAppletContext().showDocument(ah.a(var2, param1, (byte) 45), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("oa.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = "Homing missile";
    }
}
