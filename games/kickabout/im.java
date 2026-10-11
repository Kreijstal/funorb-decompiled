/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class im extends hd {
    static String field_Bb;
    static String field_zb;
    static int field_Ab;
    static int field_yb;

    im() {
    }

    public static void a(int param0) {
        field_Bb = null;
        field_zb = null;
        if (param0 != -18523) {
          field_Ab = -103;
        }
    }

    boolean b(int param0) {
        if (param0 != 15377) {
          field_zb = (String) null;
          return false;
        }
        return false;
    }

    abstract void c(int param0, boolean param1);

    final static void h(int param0) {
        java.awt.Canvas var1 = null;
        if (dr.field_a) {
          dr.field_a = false;
          var1 = ln.l(param0 ^ 634588136);
          oo.field_c.a((byte) 53, us.field_j, wt.field_x, (java.awt.Component) ((Object) var1));
          oo.field_c.a(-118, (java.awt.Component) ((Object) var1), true);
          n.field_m = us.field_j;
          el.field_A = wt.field_x;
        }
        if (param0 == 634588072) {
          return;
        }
        CharSequence var2 = (CharSequence) null;
        im.a((byte) 6, (CharSequence) null, -12);
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 75 / ((66 - param0) / 50);
          stackIn_1_0 = kt.a(param1, true, (byte) 125, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("im.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    abstract void b(int param0, int param1);

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 < 70) {
                return;
              }
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = qr.a(param0, var3, 3);
              bv.a(0, var3.toString(), true, param0);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("im.F(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, ut param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -12376) {
            field_Bb = (String) null;
          }
          if (hw.field_i != 256) {
            param3.a(param1, param2, hw.field_i * param3.field_o >> 8, hw.field_i * param3.field_v >> 8);
            return;
          }
          param3.c(param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("im.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_zb = "No Buyout";
        field_Ab = 480;
        field_Bb = "ESC - cancel this line";
        field_yb = 9;
    }
}
