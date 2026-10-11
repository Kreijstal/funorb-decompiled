/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends qg {
    private int field_H;
    private boolean field_E;
    private int field_G;
    static de field_A;
    private int field_C;
    static String field_F;
    private int field_B;
    private boolean field_J;
    static kc field_D;

    final StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, param1, param0)) {
            this.a(param0, (byte) -16, param3, param2);
            this.a(param3, param0, true, param2);
            discarded$0 = param3.append(" revert=").append(this.field_E);
            if (2147483647 != this.field_B &&
              this.field_H != 2147483647) {
              discarded$1 = param3.append(" to ").append(this.field_B).append(',').append(this.field_H);
            }
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qi.V(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(byte param0, qk param1) {
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        try {
          sd.field_a = param1;
          var2 = wf.a("achievements_names,0", -19073);
          if (null != var2) {
            ge.field_b[0] = ge.a(var2, (byte) 109);
          }
          var2Lifetime1 = wf.a("achievements_names,1", -19073);
          if (var2Lifetime1 != null) {
            ge.field_b[1] = ge.a(var2Lifetime1, (byte) 94);
          }
          var2Lifetime2 = wf.a("achievements_names,2", -19073);
          if (null != var2Lifetime2) {
            ge.field_b[2] = ge.a(var2Lifetime2, (byte) 121);
          }
          var2Lifetime3 = wf.a("achievements_names,3", -19073);
          if (null != var2Lifetime3) {
            ge.field_b[3] = ge.a(var2Lifetime3, (byte) 86);
          }
          var2Lifetime4 = wf.a("achievements_names,4", -19073);
          if (var2Lifetime4 != null) {
            ge.field_b[4] = ge.a(var2Lifetime4, (byte) 97);
          }
          var2Lifetime5 = wf.a("achievements_names,5", -19073);
          if (null != var2Lifetime5) {
            ge.field_b[5] = ge.a(var2Lifetime5, (byte) 82);
          }
          var2Lifetime6 = wf.a("achievements_names,6", -19073);
          if (null != var2Lifetime6) {
            ge.field_b[6] = ge.a(var2Lifetime6, (byte) 93);
          }
          var2Lifetime7 = wf.a("achievements_names,7", -19073);
          if (null != var2Lifetime7) {
            ge.field_b[7] = ge.a(var2Lifetime7, (byte) 89);
          }
          var2Lifetime8 = wf.a("achievements_names,8", -19073);
          if (var2Lifetime8 != null) {
            ge.field_b[8] = ge.a(var2Lifetime8, (byte) 120);
          }
          var2Lifetime9 = wf.a("achievements_names,9", -19073);
          if (var2Lifetime9 != null) {
            ge.field_b[9] = ge.a(var2Lifetime9, (byte) 83);
          }
          var2Lifetime10 = wf.a("achievements_names,10", -19073);
          if (var2Lifetime10 != null) {
            ge.field_b[10] = ge.a(var2Lifetime10, (byte) 85);
          }
          var2Lifetime11 = wf.a("achievements_names,11", -19073);
          if (var2Lifetime11 != null) {
            ge.field_b[11] = ge.a(var2Lifetime11, (byte) 86);
          }
          var2Lifetime12 = wf.a("achievements_names,12", -19073);
          if (var2Lifetime12 != null) {
            ge.field_b[12] = ge.a(var2Lifetime12, (byte) 119);
          }
          var2Lifetime13 = wf.a("achievements_names,13", -19073);
          if (var2Lifetime13 != null) {
            ge.field_b[13] = ge.a(var2Lifetime13, (byte) 82);
          }
          var2Lifetime14 = wf.a("achievements_names,14", -19073);
          if (null != var2Lifetime14) {
            ge.field_b[14] = ge.a(var2Lifetime14, (byte) 107);
          }
          var2Lifetime15 = wf.a("achievements_crit,0", -19073);
          if (var2Lifetime15 != null) {
            lk.field_u[0] = ge.a(var2Lifetime15, (byte) 82);
          }
          var2Lifetime16 = wf.a("achievements_crit,1", -19073);
          if (var2Lifetime16 != null) {
            lk.field_u[1] = ge.a(var2Lifetime16, (byte) 111);
          }
          var2Lifetime17 = wf.a("achievements_crit,2", -19073);
          if (var2Lifetime17 != null) {
            lk.field_u[2] = ge.a(var2Lifetime17, (byte) 97);
          }
          var2Lifetime18 = wf.a("achievements_crit,3", -19073);
          if (null != var2Lifetime18) {
            lk.field_u[3] = ge.a(var2Lifetime18, (byte) 90);
          }
          var2Lifetime19 = wf.a("achievements_crit,4", -19073);
          if (null != var2Lifetime19) {
            lk.field_u[4] = ge.a(var2Lifetime19, (byte) 115);
          }
          var2Lifetime20 = wf.a("achievements_crit,5", -19073);
          if (null != var2Lifetime20) {
            lk.field_u[5] = ge.a(var2Lifetime20, (byte) 111);
          }
          var2Lifetime21 = wf.a("achievements_crit,6", -19073);
          if (null != var2Lifetime21) {
            lk.field_u[6] = ge.a(var2Lifetime21, (byte) 124);
          }
          var2Lifetime22 = wf.a("achievements_crit,7", -19073);
          if (var2Lifetime22 != null) {
            lk.field_u[7] = ge.a(var2Lifetime22, (byte) 85);
          }
          var3 = 56 % ((1 - param0) / 55);
          var2Lifetime23 = wf.a("achievements_crit,8", -19073);
          if (null != var2Lifetime23) {
            lk.field_u[8] = ge.a(var2Lifetime23, (byte) 84);
          }
          var2Lifetime24 = wf.a("achievements_crit,9", -19073);
          if (null != var2Lifetime24) {
            lk.field_u[9] = ge.a(var2Lifetime24, (byte) 105);
          }
          var2Lifetime25 = wf.a("achievements_crit,10", -19073);
          if (var2Lifetime25 != null) {
            lk.field_u[10] = ge.a(var2Lifetime25, (byte) 101);
          }
          var2Lifetime26 = wf.a("achievements_crit,11", -19073);
          if (var2Lifetime26 != null) {
            lk.field_u[11] = ge.a(var2Lifetime26, (byte) 93);
          }
          var2Lifetime27 = wf.a("achievements_crit,12", -19073);
          if (null != var2Lifetime27) {
            lk.field_u[12] = ge.a(var2Lifetime27, (byte) 91);
          }
          var2Lifetime28 = wf.a("achievements_crit,13", -19073);
          if (var2Lifetime28 != null) {
            lk.field_u[13] = ge.a(var2Lifetime28, (byte) 79);
          }
          var2Lifetime29 = wf.a("achievements_crit,14", -19073);
          if (var2Lifetime29 != null) {
            lk.field_u[14] = ge.a(var2Lifetime29, (byte) 126);
          }
          var2Lifetime30 = wf.a("coins", -19073);
          if (var2Lifetime30 != null) {
            ge.a(var2Lifetime30, (byte) 82);
          }
          var2Lifetime31 = wf.a("easy", -19073);
          if (var2Lifetime31 != null) {
            rf.field_e = ge.a(var2Lifetime31, (byte) 127);
          }
          var2Lifetime32 = wf.a("hard", -19073);
          if (var2Lifetime32 != null) {
            sg.field_e = ge.a(var2Lifetime32, (byte) 117);
          }
          var2Lifetime33 = wf.a("level", -19073);
          if (null != var2Lifetime33) {
            vk.field_j = ge.a(var2Lifetime33, (byte) 93);
          }
          var2Lifetime34 = wf.a("misses", -19073);
          if (null != var2Lifetime34) {
            tj.field_D = ge.a(var2Lifetime34, (byte) 122);
          }
          var2Lifetime35 = wf.a("score", -19073);
          if (var2Lifetime35 != null) {
            ti.field_b = ge.a(var2Lifetime35, (byte) 109);
          }
          var2Lifetime36 = wf.a("time", -19073);
          if (null != var2Lifetime36) {
            uc.field_o = ge.a(var2Lifetime36, (byte) 103);
          }
          var2Lifetime37 = wf.a("instructions_text", -19073);
          if (var2Lifetime37 != null) {
            rc.field_n = ge.a(var2Lifetime37, (byte) 98);
          }
          var2Lifetime38 = wf.a("login_create", -19073);
          if (null != var2Lifetime38) {
            dd.field_e = ge.a(var2Lifetime38, (byte) 117);
          }
          var2Lifetime39 = wf.a("empty_string", -19073);
          if (var2Lifetime39 != null) {
            Main.field_y = ge.a(var2Lifetime39, (byte) 87);
          }
          var2Lifetime40 = wf.a("fps_label", -19073);
          if (null != var2Lifetime40) {
            cd.field_f = ge.a(var2Lifetime40, (byte) 78);
          }
          sd.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_145_0 = var2_ref;
          stackIn_145_1 = new StringBuilder().append("qi.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_145_0), ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(')').toString());
        }
    }

    final void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          if (param0) {
            return;
          }
          this.field_x = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("qi.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static qk a(boolean param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        qk stackIn_2_0 = null;
        qk stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == 2147483647) {
            stackIn_4_0 = lf.a(param0, param3, param2, param1, (byte) -70, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (qk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "qi.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void d(byte param0) {
        field_A = null;
        field_D = null;
        if (param0 <= 11) {
          return;
        }
        try {
          field_F = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qi.I(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, -54, param4, param5, param6) ? 1 : 0;
          if (param3 > -14) {
            field_A = (de) null;
          }
          if (var8_int != 0 &&
            this.field_J) {
            return true;
          }
          if (!this.a(-59, param0, param6, param2, param1)) {
            stackIn_19_0 = var8_int;
            return stackIn_19_0 != 0;
          }
          this.field_x = param5;
          if (param5 == 1) {
            this.field_C = -param0 + (param2 - this.field_o);
            sh.field_i = this;
            this.field_G = -this.field_i + (param6 - param1);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("qi.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, lk param2, int param3) {
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_2 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var5_intLifetime1;
        int var5_intLifetime1Lifetime1;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((!(this.field_y instanceof hl) ||
            ((hl) (this.field_y)).field_B) &&
            this.field_x == 1) {
            var5_int = -this.field_C + eg.field_b - param1;
            var6 = ij.field_e + (-this.field_G - param0);
            if (var5_int != this.field_o ||
              var6 != this.field_i) {
              this.field_i = var6;
              this.field_o = var5_int;
              if (this.field_k instanceof o) {
                ((o) (this.field_k)).a(param1, 32747, param0, this);
              }
            }
            decompiledFrameRemainder0 = (Main.field_T != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (this.field_E)) {
            if (~this.field_B != ~this.field_o) {
              var5_intLifetime1 = this.field_B - this.field_o;
              stackIn_32_1 = this.field_o;
              if (Math.abs(var5_intLifetime1) > 2) {
                stackIn_33_2 = var5_intLifetime1 >> 1;
              } else {
                if (var5_intLifetime1 > 0) {
                  stackIn_33_2 = 1;
                } else {
                  stackIn_33_2 = -1;
                }
              }
              this.field_o = stackIn_32_1 + stackIn_33_2;
            }
            if (this.field_H != this.field_i) {
              var5_intLifetime1Lifetime1 = -this.field_i + this.field_H;
              stackIn_42_1 = this.field_i;
              if (2 < Math.abs(var5_intLifetime1Lifetime1)) {
                stackIn_43_2 = var5_intLifetime1Lifetime1 >> 1;
              } else {
                if (var5_intLifetime1Lifetime1 <= 0) {
                  stackIn_43_2 = -1;
                } else {
                  stackIn_43_2 = 1;
                }
              }
              this.field_i = stackIn_42_1 + stackIn_43_2;
            }
          }
          if (param3 != 3) {
            this.a(36, 104, (lk) null, -63);
          }
          super.a(param0, param1, param2, param3 ^ 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_52_0 = var5;
          stackIn_52_1 = new StringBuilder().append("qi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(int param0) {
        try {
          super.h(param0);
          this.field_y.a(this.field_q, 0, this.field_h, 0, true);
          this.field_B = this.field_o;
          this.field_H = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "qi.H(" + param0 + ')');
        }
    }

    private qi(int param0, int param1, int param2, int param3, ci param4, pl param5, lk param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_H = 2147483647;
        this.field_B = 2147483647;
        try {
          this.field_E = param7;
          this.field_y = param6;
          this.field_J = param8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qi.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_F = "This password contains your Player Name, and would be easy to guess";
        field_A = new de(9, 0, 4, 1);
    }
}
