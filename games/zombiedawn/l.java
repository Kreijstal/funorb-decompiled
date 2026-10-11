/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class l extends ll {
    static int field_e;
    static vn[] field_b;
    private String field_c;
    private String field_f;
    static String field_g;
    static int field_d;

    final static b b(int param0, int param1) {
        b var2 = null;
        b var2Lifetime1;
        if (param0 >= 62) {
          var2 = new b();
          qi.field_J.a(0, var2);
          pp.a(2, param1);
          return var2;
        }
        field_g = (String) null;
        var2Lifetime1 = new b();
        qi.field_J.a(0, var2Lifetime1);
        pp.a(2, param1);
        return var2Lifetime1;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 56) {
            return false;
          }
          var3 = (CharSequence) ((Object) param1);
          stackIn_4_0 = kf.field_T.equals(fm.a(var3, -48));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("l.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(boolean param0, de param1) {
        try {
          if (param0) {
            java.awt.Component var4 = (java.awt.Component) null;
            l.a(-71, 119, (java.awt.Component) null, -102);
          }
          param1.a((byte) -88, this.field_f);
          param1.a(this.field_c, (byte) 95);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "l.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final nk a(byte param0) {
        if (param0 != -102) {
          field_b = (vn[]) null;
          return dp.field_a;
        }
        return dp.field_a;
    }

    final static dh a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          dh var5 = null;
          pi var5_ref = null;
          dh stackIn_3_0 = null;
          pi stackIn_5_0 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != -1) {
                field_b = (vn[]) null;
              }
              var4 = Class.forName("ai");
              var5 = (dh) (var4.newInstance());
              var5.a(param1, param3, param2, -11055);
              stackIn_3_0 = var5;
              return stackIn_3_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new pi();
              ((dh) ((Object) var5_ref)).a(param1, param3, param2, -11055);
              stackIn_5_0 = var5_ref;
              return (dh) ((Object) stackIn_5_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var4_ref2;
            stackIn_8_1 = new StringBuilder().append("l.I(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        if (param0 != -1) {
          l.b(19);
        }
    }

    l(String param0, String param1) {
        try {
          this.field_c = param1;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -1;
        field_d = -1;
    }
}
