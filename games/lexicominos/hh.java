/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh extends mg {
    static java.awt.Frame field_G;
    private int field_K;
    static int field_I;
    private int field_J;
    private int field_C;
    static da field_M;
    private boolean field_F;
    static sj field_N;
    static sh field_L;
    private int field_E;
    private boolean field_D;

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$64 = null;
        StringBuilder discarded$65 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3 ^ -8891, param2, param1, param0)) {
            this.a(param2, 0, param0, param1);
            this.b(param2, -28327, param0, param1);
            discarded$64 = param2.append(" revert=").append(this.field_F);
            if (this.field_J != 2147483647 &&
              this.field_E != 2147483647) {
              discarded$65 = param2.append(" to ").append(this.field_J).append(',').append(this.field_E);
            }
          }
          if (param3 != -15992) {
            field_G = (java.awt.Frame) null;
          }
          stackIn_7_0 = (StringBuilder) (param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("hh.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_A.a(this.field_v, this.field_j, true, 0, 0);
        this.field_J = this.field_t;
        this.field_E = this.field_o;
    }

    public static void h(int param0) {
        field_M = null;
        field_N = null;
        field_G = null;
        field_L = null;
        if (param0 != 225) {
          field_N = (sj) null;
        }
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_D) {
            return true;
          }
          if (!this.a(param3, param6, param5, param4, (byte) -79)) {
            stackIn_9_0 = var8_int;
            return stackIn_9_0 != 0;
          }
          this.field_h = param1;
          if (param1 != 1) {
            return true;
          }
          this.field_C = -this.field_t + (param6 - param5);
          si.field_t = this;
          this.field_K = -param4 + param3 - this.field_o;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("hh.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_h = 0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "hh.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private hh(int param0, int param1, int param2, int param3, rd param4, vd param5, w param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_E = 2147483647;
        try {
          this.field_D = param8 ? true : false;
          this.field_A = param6;
          this.field_F = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "hh.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (param0 <= 59) {
          return '￧';
        }
        var2 = param1;
        if (var2 == 32) {
          return '_';
        }
        if (var2 == 160) {
          return '_';
        }
        if (var2 == 95) {
          return '_';
        }
        if (var2 == 45) {
          return '_';
        }
        if (var2 == 91) {
          return param1;
        }
        if (var2 == 93) {
          return param1;
        }
        if (var2 == 35) {
          return param1;
        }
        if (var2 == 224) {
          return 'a';
        }
        if (var2 == 225) {
          return 'a';
        }
        if (var2 == 226) {
          return 'a';
        }
        if (var2 == 228) {
          return 'a';
        }
        if (var2 == 227) {
          return 'a';
        }
        if (var2 == 192) {
          return 'a';
        }
        if (var2 == 193) {
          return 'a';
        }
        if (var2 == 194) {
          return 'a';
        }
        if (var2 == 196) {
          return 'a';
        }
        if (var2 == 195) {
          return 'a';
        }
        if (var2 == 232) {
          return 'e';
        }
        if (233 == var2) {
          return 'e';
        }
        if (234 == var2) {
          return 'e';
        }
        if (235 == var2) {
          return 'e';
        }
        if (200 == var2) {
          return 'e';
        }
        if (var2 == 201) {
          return 'e';
        }
        if (var2 == 202) {
          return 'e';
        }
        if (var2 == 203) {
          return 'e';
        }
        if (var2 == 237) {
          return 'i';
        }
        if (var2 == 238) {
          return 'i';
        }
        if (var2 == 239) {
          return 'i';
        }
        if (var2 == 205) {
          return 'i';
        }
        if (var2 == 206) {
          return 'i';
        }
        if (207 == var2) {
          return 'i';
        }
        if (var2 == 242) {
          return 'o';
        }
        if (var2 == 243) {
          return 'o';
        }
        if (var2 == 244) {
          return 'o';
        }
        if (var2 == 246) {
          return 'o';
        }
        if (var2 == 245) {
          return 'o';
        }
        if (var2 == 210) {
          return 'o';
        }
        if (var2 == 211) {
          return 'o';
        }
        if (var2 == 212) {
          return 'o';
        }
        if (var2 == 214) {
          return 'o';
        }
        if (213 == var2) {
          return 'o';
        }
        if (249 == var2) {
          return 'u';
        }
        if (var2 == 250) {
          return 'u';
        }
        if (var2 == 251) {
          return 'u';
        }
        if (var2 == 252) {
          return 'u';
        }
        if (var2 == 217) {
          return 'u';
        }
        if (var2 == 218) {
          return 'u';
        }
        if (219 == var2) {
          return 'u';
        }
        if (220 == var2) {
          return 'u';
        }
        if (231 == var2) {
          return 'c';
        }
        if (var2 == 199) {
          return 'c';
        }
        if (255 == var2) {
          return 'y';
        }
        if (376 == var2) {
          return 'y';
        }
        if (241 == var2) {
          return 'n';
        }
        if (var2 == 209) {
          return 'n';
        }
        if (var2 != 223) {
          return Character.toLowerCase(param1);
        }
        return 'b';
    }

    final static fh a(byte param0) {
        if (param0 >= 107) {
          if (null == bg.field_d) {
            bg.field_d = new fh();
            bg.field_d.a(ql.field_Q, 48);
            bg.field_d.field_h = 2763306;
            bg.field_d.field_d = 6;
            bg.field_d.field_l = 14;
            bg.field_d.field_e = 5;
            bg.field_d.field_c = 7697781;
            bg.field_d.field_p = cl.field_T;
            bg.field_d.field_k = 0;
            bg.field_d.field_n = 4;
          }
          return bg.field_d;
        }
        field_M = (da) null;
        if (null == bg.field_d) {
          bg.field_d = new fh();
          bg.field_d.a(ql.field_Q, 48);
          bg.field_d.field_h = 2763306;
          bg.field_d.field_d = 6;
          bg.field_d.field_l = 14;
          bg.field_d.field_e = 5;
          bg.field_d.field_c = 7697781;
          bg.field_d.field_p = cl.field_T;
          bg.field_d.field_k = 0;
          bg.field_d.field_n = 4;
        }
        return bg.field_d;
    }

    final void a(byte param0, w param1, int param2, int param3) {
        int stackIn_13_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_21_1 = 0;
        int stackIn_24_2 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_A instanceof kf) ||
            ((kf) (this.field_A)).field_D) &&
            this.field_h == 1) {
            var5_int = -param3 + (-this.field_C + bk.field_b);
            var6 = -param2 + sh.field_e - this.field_K;
            if (var5_int != this.field_t ||
              var6 != this.field_o) {
              this.field_o = var6;
              this.field_t = var5_int;
              if (this.field_r instanceof hj) {
                ((hj) (this.field_r)).a(this, 31954, param3, param2);
              }
            }
          } else {
            if (this.field_F) {
              if (this.field_J != this.field_t) {
                var5_int = -this.field_t + this.field_J;
                stackIn_13_1 = this.field_t;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_16_2 = -1;
                  } else {
                    stackIn_16_2 = 1;
                  }
                } else {
                  stackIn_16_2 = var5_int >> 1;
                }
                this.field_t = stackIn_13_1 + stackIn_16_2;
              }
              if (this.field_E != this.field_o) {
                var5_int = -this.field_o + this.field_E;
                stackIn_21_1 = this.field_o;
                if (2 >= Math.abs(var5_int)) {
                  if (0 < var5_int) {
                    stackIn_24_2 = 1;
                  } else {
                    stackIn_24_2 = -1;
                  }
                } else {
                  stackIn_24_2 = var5_int >> 1;
                }
                this.field_o = stackIn_21_1 + stackIn_24_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("hh.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_M = new da();
        field_N = null;
    }
}
