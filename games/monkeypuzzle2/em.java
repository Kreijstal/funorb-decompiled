/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class em extends t {
    static pj field_C;
    static int field_B;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 84) {
            field_B = 72;
          }
          stackIn_5_0 = (null != ch.a(param1, -1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("em.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static ad a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          ca var8 = null;
          ad stackIn_12_0 = null;
          ad stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (null != rk.field_g.field_t) {
              ah.field_f = new ch(rk.field_g.field_t, 5200, 0);
              rk.field_g.field_t = null;
              var6 = new gf(255, ah.field_f, new ch(rk.field_g.field_i, 12000, 0), 2097152);
            }
            var7 = null;
            if (ah.field_f != null) {
              if (bl.field_o == null) {
                bl.field_o = new ch[rk.field_g.field_e.length];
              }
              if (null == bl.field_o[param1]) {
                bl.field_o[param1] = new ch(rk.field_g.field_e[param1], 12000, 0);
                rk.field_g.field_e[param1] = null;
              }
              var7 = new gf(param1, ah.field_f, bl.field_o[param1], 2097152);
            }
            var8 = c.field_h.a(-24559, (gf) (var6), param1, (gf) (var7), param0);
            if (param5 != 50) {
              stackIn_12_0 = (ad) null;
              return stackIn_12_0;
            }
            if (param2) {
              var8.a(-1);
            }
            stackIn_16_0 = new ad(var8, param3, param4);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(long param0, boolean param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param1) {
          field_C = (pj) null;
          if (0L == param0 % 10L) {
            hc.a(param0 - 1L, (byte) -50);
            hc.a(1L, (byte) -50);
            return;
          }
          hc.a(param0, (byte) -50);
          return;
        }
        if (0L == param0 % 10L) {
          hc.a(param0 - 1L, (byte) -50);
          hc.a(1L, (byte) -50);
          return;
        }
        hc.a(param0, (byte) -50);
    }

    public static void a(int param0) {
        if (param0 != -27714) {
          field_B = 50;
          field_C = null;
          return;
        }
        field_C = null;
    }

    private em(String param0, of param1) {
        this(param0, hi.field_b.field_i, param1);
        try {
          this.field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(Object param0, byte param1, md param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param2.field_b == null) {
            return;
          }
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (param2.field_b.peekEvent() != null) {
              em.a(1L, false);
              continue;
            }
            break;
          }
          if (param1 != -101) {
            var5 = (String) null;
            em.a((byte) -42, (String) null);
          }
          try {
            if (param0 == null) {
              return;
            }
            param2.field_b.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("em.BA(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private em(String param0, ml param1, of param2) {
        super(param0, param1, param2);
        try {
          this.field_h = hi.field_b.field_l;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_u = !this.field_u ? true : false;
        if (param0 < -23) {
          super.b(-48, param1, param2, param3);
          return;
        }
        em.a(-109);
        super.b(-48, param1, param2, param3);
    }

    em(String param0, of param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_u = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_C = new pj();
    }
}
