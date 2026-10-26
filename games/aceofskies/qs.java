/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qs {
    static Calendar field_a;
    static int field_b;

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        String stackIn_44_2 = null;
        try {
          ScreenParticle.field_o = ScreenParticle.field_o + 1;
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
            if (ht.field_g) {
              stackIn_17_0 = 0;
            } else if (ScreenParticle.field_o >= jp.field_b) {
              stackIn_17_0 = (ScreenParticle.field_o < jp.field_b + NetworkGameClient.field_B) ? 1 : 0;
            } else {
              stackIn_17_0 = 0;
            }
            int var2_int = stackIn_17_0;
            if (param1 == null) {
              ScreenParticle.field_o = 0;
            } else if (!ht.field_g &&
              var2_int == 0) {
              ScreenParticle.field_o = 0;
            } else {
              ScreenParticle.field_o = jp.field_b;
            }
            we.field_c = ik.field_k;
            SpriteState.field_o = rs.field_v;
            if (param1 != null) {
              ht.field_g = false;
            } else if (var2_int != 0) {
              ht.field_g = true;
            }
          }
          if (!ht.field_g &&
            ScreenParticle.field_o < jp.field_b &&
            uu.pointerMoved) {
            we.field_c = ik.field_k;
            SpriteState.field_o = rs.field_v;
            ScreenParticle.field_o = 0;
          }
          qj.field_s = param1;
          if (param0 != -6939) {
            field_a = (Calendar) null;
          }
          if (ht.field_g &&
            Pickup.field_j == ScreenParticle.field_o) {
            ScreenParticle.field_o = 0;
            ht.field_g = false;
          }
          ik.field_k = -1;
          rs.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_43_0 = var2;
          StringBuilder stackIn_43_1 = new StringBuilder().append("qs.A(").append(param0).append(',');
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
        av.field_c = new IntrusiveDeque();
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
