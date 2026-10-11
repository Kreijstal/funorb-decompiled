/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tn {
    static hl field_a;
    static hl field_b;

    final static int b(int param0) {
        try {
          int stackIn_13_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          bh var2 = null;
          if (4 <= vh.field_e.field_h) {
            if (-1 == vh.field_e.field_d) {
              return 3;
            }
            if (-2 == vh.field_e.field_d) {
              return 4;
            }
            return 1;
          }
          try {
            if (on.field_b == 0) {
              hd.field_x = ug.field_ab.a(ud.field_Nb, ji.field_Lb, (byte) 107);
              on.field_b = on.field_b + 1;
            }
            if (on.field_b == 1) {
              if (hd.field_x.field_d == 2) {
                stackIn_13_0 = qk.a(-1, true);
                return stackIn_13_0;
              }
              if (hd.field_x.field_d == 1) {
                on.field_b = on.field_b + 1;
              }
            }
            if (on.field_b == 2) {
              li.field_g = new fl((java.net.Socket) (hd.field_x.field_f), ug.field_ab);
              var2 = new bh(13);
              je.a(-94, dh.field_l, var2, je.field_f, ui.field_g);
              var2.a(15, false);
              var2.d(c.field_f, (byte) -124);
              li.field_g.a(true, 13, var2.field_u, 0);
              on.field_b = on.field_b + 1;
              od.field_T = k.a(0) + 30000L;
            }
            if (param0 >= -76) {
              tn.b(-79);
            }
            if (on.field_b == 3) {
              if (li.field_g.f(0) > 0) {
                var1_int = li.field_g.c(3);
                if (var1_int != 0) {
                  stackIn_30_0 = qk.a(var1_int, true);
                  return stackIn_30_0;
                }
                on.field_b = on.field_b + 1;
              } else {
                if (k.a(0) > od.field_T) {
                  stackIn_27_0 = qk.a(-2, true);
                  return stackIn_27_0;
                }
              }
            }
            if (4 != on.field_b) {
              return -1;
            }
            vh.field_e.a(li.field_g, um.field_o, (byte) -122);
            li.field_g = null;
            on.field_b = 0;
            hd.field_x = null;
            stackIn_35_0 = 0;
            return stackIn_35_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return qk.a(-3, true);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -2) {
          tn.a(34);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            stackIn_2_0 = -59;
            return stackIn_2_0;
          }
          if (param0) {
            stackIn_7_0 = oi.field_a.b(param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = ko.field_u.b(param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tn.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
