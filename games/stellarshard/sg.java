/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sg {
    static pi field_a;
    static String field_b;
    static String field_d;
    static String[] field_c;

    final static void a(int param0, int param1) {
        td.a((byte) -108);
        int var2 = -79 % ((param0 + 20) / 51);
    }

    final static boolean a(byte param0) {
        if (param0 < 18) {
          return false;
        }
        return gk.field_a;
    }

    final static ml a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        ml stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -9 / ((-76 - param0) / 46);
          if (dj.field_a == el.field_E) {
            stackIn_2_0 = null;
            return (ml) (stackIn_2_0);
          }
          if (ta.field_m == el.field_E &&
            param1.equals(gk.field_c)) {
            el.field_E = ok.field_a;
            stackIn_9_0 = ed.field_d;
            return stackIn_9_0;
          }
          el.field_E = dj.field_a;
          gk.field_c = param1;
          ed.field_d = null;
          stackIn_7_0 = null;
          return (ml) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("sg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 == -29297) {
          field_a = null;
          field_d = null;
          return;
        }
        field_d = (String) null;
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, String param2, int param3, ej param4, int param5, int param6, boolean param7, long param8, int param9, int param10, int param11, int param12, boolean param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            ae.field_N = new ha(param9);
            pg.field_fb = new ha(param0);
            il.field_v = param4;
            tl.field_b = param7;
            t.field_f = param12;
            uj.field_f = param13;
            ue.field_d = param10;
            h.field_d = param3;
            df.field_j = param2;
            od.field_z = param8;
            kg.field_E = param5;
            i.field_b = param11;
            if (param6 <= 72) {
              sg.a((byte) 88);
            }
            wd.field_a = param1;
            if (il.field_v.field_e == null) {
              return;
            }
            try {
              e.field_a = new pc(il.field_v.field_e, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("sg.E(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Discard";
        field_a = new pi();
        field_c = new String[]{"Battle alien squadrons", "Play in fullscreen", "Activate the Phoenix Device"};
        field_d = "Current level : ";
    }
}
