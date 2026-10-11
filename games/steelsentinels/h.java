/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class h extends ug {
    static de field_Y;
    private int field_R;
    private int field_Z;
    static RgbSprite field_T;
    private boolean field_W;
    private boolean field_S;
    static int field_U;
    private int field_ab;
    static int field_G;
    static String[] field_X;
    private int field_V;

    final static void i(int param0) {
        int var2;
        var2 = SteelSentinels.obfuscationControl;
        if (param0 != -1) {
          return;
        }
        if (null == fk.field_i) {
          if ((1 << ed.field_j & fk.field_i.world.field_X) != 0) {
            ti.field_A[12] = ig.field_d;
          } else {
            if (0 != fk.field_i.world.field_X) {
              ti.field_A[12] = ih.field_p;
            } else {
              if ((1 << fk.field_i.world.playerCount) - 1 != (1 << ed.field_j | fk.field_i.field_N)) {
                ti.field_A[12] = dg.field_a;
              } else {
                ti.field_A[12] = hm.field_d;
              }
            }
          }
        } else {
          if (fk.field_i.field_J) {
            if (0 != (fk.field_i.world.field_X & 1 << ed.field_j)) {
              ti.field_A[12] = ch.field_H;
            } else {
              if (0 != fk.field_i.world.field_X) {
                ti.field_A[12] = nl.field_Z;
              } else {
                if ((fk.field_i.field_N | 1 << ed.field_j) != -1 + (1 << fk.field_i.world.playerCount)) {
                  ti.field_A[12] = cl.field_i;
                } else {
                  ti.field_A[12] = jh.field_g;
                }
              }
            }
          } else {
            if ((1 << ed.field_j & fk.field_i.world.field_X) != 0) {
              ti.field_A[12] = ig.field_d;
            } else {
              if (0 != fk.field_i.world.field_X) {
                ti.field_A[12] = ih.field_p;
              } else {
                if ((1 << fk.field_i.world.playerCount) - 1 != (1 << ed.field_j | fk.field_i.field_N)) {
                  ti.field_A[12] = dg.field_a;
                } else {
                  ti.field_A[12] = hm.field_d;
                }
              }
            }
          }
        }
    }

    private h(int param0, int param1, int param2, int param3, qk param4, tn param5, lh param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_ab = 2147483647;
        this.field_V = 2147483647;
        try {
          this.field_J = param6;
          this.field_W = param8 ? true : false;
          this.field_S = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "h.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_W) {
            return true;
          }
          if (!this.a(param0, param4, (byte) 81, param3, param2)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          if (param6 == 1) {
            this.field_R = param0 - (this.field_z + param4);
            this.field_Z = -param2 + (param3 - this.field_o);
            nc.field_e = this;
          }
          this.field_w = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("h.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void f(int param0) {
        super.f(-128);
        this.field_J.a(0, (byte) -95, 0, this.field_x, this.field_E);
        this.field_V = this.field_z;
        if (param0 < -120) {
          this.field_ab = this.field_o;
          return;
        }
        field_Y = (de) null;
        this.field_ab = this.field_o;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        lh var6 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, (byte) -91, param3, param0)) {
            this.a(param3, param0, false, param1);
            this.a(param0, (byte) 75, param3, param1);
            discarded$64 = param1.append(" revert=").append(this.field_S);
            if (this.field_ab != 2147483647 &&
              this.field_V != 2147483647) {
              discarded$65 = param1.append(" to ").append(this.field_ab).append(',').append(this.field_V);
            }
          }
          if (param2 >= -104) {
            var6 = (lh) null;
            this.a(-29, (lh) null, 114, -68, 100, true, 18);
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("h.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        int stackIn_16_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_J instanceof oa) ||
            ((oa) (this.field_J)).field_K) &&
            1 == this.field_w) {
            var5_int = -this.field_Z + oh.field_f - param0;
            var6 = -param3 + (pi.field_c - this.field_R);
            if (var5_int != this.field_o ||
              var6 != this.field_z) {
              this.field_z = var6;
              this.field_o = var5_int;
              if (this.field_A instanceof bn) {
                ((bn) (this.field_A)).a(-107, param0, this, param3);
              }
            }
          } else {
            if (this.field_S) {
              if (this.field_ab != this.field_o) {
                var5_int = -this.field_o + this.field_ab;
                stackIn_16_1 = this.field_o;
                if (2 < Math.abs(var5_int)) {
                  stackIn_17_2 = var5_int >> 1;
                } else {
                  if (0 >= var5_int) {
                    stackIn_17_2 = -1;
                  } else {
                    stackIn_17_2 = 1;
                  }
                }
                this.field_o = stackIn_16_1 + stackIn_17_2;
              }
              if (this.field_z != this.field_V) {
                var5_int = this.field_V - this.field_z;
                stackIn_21_1 = this.field_z;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_24_2 = -1;
                  } else {
                    stackIn_24_2 = 1;
                  }
                } else {
                  stackIn_24_2 = var5_int >> 1;
                }
                this.field_z = stackIn_21_1 + stackIn_24_2;
              }
            }
          }
          super.a(param0, 78, param2, param3);
          if (param1 > 56) {
            return;
          }
          this.field_ab = -32;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("h.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
          super.a((byte) 75, param1, param2, param3, param4, param5);
          int var7_int = -101 / ((param0 - 36) / 32);
          this.field_w = 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "h.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
          return;
        }
        field_T = null;
        field_Y = null;
        field_X = null;
    }

    static {
        field_Y = new de("");
        field_X = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
