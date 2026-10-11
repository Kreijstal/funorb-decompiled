/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qs {
    static Calendar field_a;
    static int field_b;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          ok.field_o = ok.field_o + 1;
          if (ik.field_k == -1 &&
            rs.field_v == -1) {
            ik.field_k = ic.field_b;
            rs.field_v = cf.field_g;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 == null) {
            decompiledFrameRemainder0 = (qj.field_s == null);
          } else {
            decompiledFrameRemainder0 = !(param1.equals(qj.field_s));
          }
          if (decompiledFrameRemainder0) {
            if (!ht.field_g) {
              if (ok.field_o >= jp.field_b) {
                stackIn_17_0 = (ok.field_o < jp.field_b + ct.field_B) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param1 == null) {
              ok.field_o = 0;
            } else {
              if (!ht.field_g &&
                var2_int == 0) {
                ok.field_o = 0;
              } else {
                ok.field_o = jp.field_b;
              }
            }
            we.field_c = ik.field_k;
            nl.field_o = rs.field_v;
            if (param1 != null) {
              ht.field_g = false;
            } else {
              if (var2_int != 0) {
                ht.field_g = true;
              }
            }
          }
          if (!ht.field_g &&
            ok.field_o < jp.field_b &&
            uu.field_e) {
            we.field_c = ik.field_k;
            nl.field_o = rs.field_v;
            ok.field_o = 0;
          }
          qj.field_s = param1;
          if (param0 != -6939) {
            field_a = (Calendar) null;
          }
          if (ht.field_g &&
            wm.field_j == ok.field_o) {
            ok.field_o = 0;
            ht.field_g = false;
          }
          ik.field_k = -1;
          rs.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("qs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = 42 / ((66 - param0) / 59);
        av.field_c = new kp();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 10) {
          field_b = 125;
        }
    }

    static {
        field_b = -1;
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
