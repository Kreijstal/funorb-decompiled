/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class la extends sh {
    private int field_D;
    private boolean field_F;
    static hh contentFadeOutPhase;
    private int field_G;
    private int field_B;
    private boolean field_C;
    private int field_H;
    static hh contentResizePhase;

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        try {
            super.a(param0, param1, param2, param3, param4, param5);
            this.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "la.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!((this.field_A instanceof hk) &&
                (!((hk) ((Object) this.field_A)).field_D))) &&
              (this.field_f == 1)) {
            var5_int = PrefixCodeDecoder.pointerXSnapshot - this.field_D - param3;
            var6 = -this.field_H + (ue.pointerYSnapshot - param1);
            if (!((this.widgetX == var5_int) &&
                (var6 == this.widgetY))) {
              this.widgetY = var6;
              this.widgetX = var5_int;
              if (!(!(this.field_u instanceof de))) {
                ((de) ((Object) this.field_u)).a(param3, -20951, (la) (this), param1);
              }
            }
          } else {
            if (this.field_C) {
              if (this.field_B != this.widgetX) {
                var5_int = this.field_B - this.widgetX;
                stackIn_17_1 = this.widgetX;
                if (Math.abs(var5_int) > 2) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_18_2 = -1;
                  } else {
                    stackIn_18_2 = 1;
                  }
                }
                ((la) (this)).widgetX = stackIn_17_1 + stackIn_18_2;
              }
              if (this.widgetY != this.field_G) {
                var5_int = this.field_G - this.widgetY;
                stackIn_23_1 = this.widgetY;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_26_2 = 1;
                  } else {
                    stackIn_26_2 = -1;
                  }
                } else {
                  stackIn_26_2 = var5_int >> 1;
                }
                ((la) (this)).widgetY = stackIn_23_1 + stackIn_26_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          if (!param0) {
            return;
          }
          this.field_G = 54;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = (RuntimeException) (var5);
          stackIn_32_1 = new StringBuilder().append("la.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    private la(int param0, int param1, int param2, int param3, dh param4, bb param5, el param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_G = 2147483647;
        this.field_B = 2147483647;
        try {
            this.field_A = param6;
            this.field_C = param7 ? true : false;
            this.field_F = param8 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "la.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$70 = null;
        StringBuilder discarded$71 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            this.b(param3, param1, param2, param0 + 0);
            discarded$70 = param1.append(" revert=").append(this.field_C);
            if ((this.field_B != 2147483647) &&
                (this.field_G != 2147483647)) {
              discarded$71 = param1.append(" to ").append(this.field_B).append(',').append(this.field_G);
            }
          }
          if (param0 != 0) {
            contentResizePhase = (hh) null;
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var5);
          stackIn_11_1 = new StringBuilder().append("la.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, 53, param2, param3, param4, param5, param6) ? 1 : 0;
          var9 = 5 % ((-3 - param1) / 38);
          if ((var8_int != 0) &&
              (this.field_F)) {
            return true;
          }
          if (!this.a(param4, -1, param5, param0, param2)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          this.field_f = param3;
          if (param3 != 1) {
            return true;
          }
          this.field_H = -param0 + param5 - this.widgetY;
          this.field_D = -param2 + (param4 - this.widgetX);
          lh.field_b = (la) (this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var8);
          stackIn_13_1 = new StringBuilder().append("la.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void f(byte param0) {
        if (param0 == 24) {
            fh.b(-6011);
            ii.field_a = true;
            cf.field_i = true;
            kd.field_e.f(param0 + 10912);
            fa.showMessageDialog(ah.connectionLostReconnectingText, 480, false);
            return;
        }
        la.g((byte) 86);
        fh.b(-6011);
        ii.field_a = true;
        cf.field_i = true;
        kd.field_e.f(param0 + 10912);
        fa.showMessageDialog(ah.connectionLostReconnectingText, 480, false);
    }

    final void b(boolean param0) {
        super.b(param0);
        this.field_A.a(this.widgetHeight, this.widgetWidth, (byte) -85, 0, 0);
        this.field_B = this.widgetX;
        this.field_G = this.widgetY;
    }

    public static void g(byte param0) {
        int var1 = 47 % ((param0 + 51) / 55);
        contentResizePhase = null;
        contentFadeOutPhase = null;
    }

    static {
        contentFadeOutPhase = new hh();
        contentResizePhase = new hh();
    }
}
