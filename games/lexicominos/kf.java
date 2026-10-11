/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kf extends w {
    boolean field_D;
    private boolean field_B;
    static be field_y;
    static db[] field_A;
    private boolean field_x;
    boolean field_C;
    static dg field_z;

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D &&
            this.field_x) {
            param1.c((byte) -122);
            if (param0 != 44) {
              this.field_x = true;
            }
            this.field_B = true;
            if (null != this.field_r &&
              this.field_r instanceof ml) {
              ((ml) (this.field_r)).a(false, this.field_B, (w) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kf.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    kf(String param0, vd param1) {
        this(param0, nb.field_z.field_f, param1);
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4808) {
            this.field_B = false;
          }
          if (!this.field_D) {
            return false;
          }
          if (!this.a(param3, param6, param5, param4, (byte) -93)) {
            return false;
          }
          this.a((byte) 44, param2);
          this.field_h = param1;
          if (this.field_r != null &&
            this.field_r instanceof j) {
            ((j) (this.field_r)).a(param3, param1, param6, (byte) -14, param5, param4, this);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("kf.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (this.field_r != null) {
          if (!(this.field_r instanceof jk)) {
            if (param0 != -23287) {
              this.field_B = true;
              return;
            }
            return;
          }
          ((jk) (this.field_r)).a(param2, param1, 215535458, param3, this);
        }
        if (param0 == -23287) {
          return;
        }
        this.field_B = true;
    }

    void a(byte param0, w param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_h != 0 &&
            this.field_h != ul.field_o) {
            if (this.a(sh.field_e, bk.field_b, param3, param2, (byte) -115) &&
              ul.field_o == 0) {
              this.a(-23287, -param2 + sh.field_e, this.field_h, bk.field_b - param3);
            }
            this.a(param1, bk.field_b, param2, 0, param3, sh.field_e);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "kf.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_A = null;
        field_y = null;
        if (param0 != -85) {
          field_y = (be) null;
        }
    }

    final static boolean d(boolean param0) {
        int var2 = 0;
        pd var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        pd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          var4 = (pd) (al.field_C.a(param0));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var1.field_p > var2; var2++) {
            if (var4.field_k[var2] != null &&
              var4.field_k[var2].field_b == 0) {
              return false;
            }
            if (var4.field_i[var2] != null &&
              var4.field_i[var2].field_b == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1_ref), "kf.HA(" + param0 + ')');
        }
    }

    final void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          if (this.field_r != null &&
            this.field_r instanceof j) {
            ((j) (this.field_r)).a(-121, param4, param5, param2, param1, this);
          }
          this.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "kf.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 18337) {
          return false;
        }
        return this.field_B;
    }

    final static void f(int param0) {
        nb.field_z = hh.a((byte) 115);
        ug.field_A = new eg();
        if (param0 == 1) {
          jd.a(true, true, 37);
          return;
        }
        kf.h(-103);
        jd.a(true, true, 37);
    }

    final static int g(int param0) {
        if (param0 != 0) {
          kf.f(-4);
          return uk.field_V;
        }
        return uk.field_V;
    }

    final static void h(int param0) {
        if (param0 != -1) {
          return;
        }
        og.field_c = ig.field_a.c(false);
        CharSequence var2 = (CharSequence) ((Object) og.field_c);
        cb.field_t = ck.a(var2, (byte) -48);
    }

    kf(String param0, rd param1, vd param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        w var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -15992) {
            var6 = (w) null;
            this.a((byte) 35, (w) null, 75, 35);
          }
          if (this.a(7373, param2, param1, param0)) {
            this.a(param2, 0, param0, param1);
            if (this.field_C) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_9_0 = (StringBuilder) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -35 / ((-87 - param0) / 36);
        int var3 = 0;
        if ((param1 & 7) != 0) {
          var3 = -(7 & param1) + 8;
        }
        int var4 = param1 + var3;
        return var4;
    }

    protected kf() {
        this.field_D = true;
        this.field_B = false;
        this.field_x = true;
        this.field_i = nb.field_z.field_j;
    }

    final void c(byte param0) {
        w var3 = null;
        w var3Lifetime1;
        w var3Lifetime2;
        w var3Lifetime3;
        if (!this.field_B) {
          if (param0 > -35) {
            var3 = (w) null;
            this.a(-41, -60, (w) null, 127, 58, -109, 47);
            return;
          }
          return;
        }
        this.field_B = false;
        if (null == this.field_r) {
          if (param0 <= -35) {
            return;
          }
          var3Lifetime1 = (w) null;
          this.a(-41, -60, (w) null, 127, 58, -109, 47);
          return;
        }
        if (this.field_r instanceof ml) {
          ((ml) (this.field_r)).a(false, this.field_B, (w) (this));
          if (param0 <= -35) {
            return;
          }
          var3Lifetime2 = (w) null;
          this.a(-41, -60, (w) null, 127, 58, -109, 47);
          return;
        }
        if (param0 <= -35) {
          return;
        }
        var3Lifetime3 = (w) null;
        this.a(-41, -60, (w) null, 127, 58, -109, 47);
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -98 / ((-13 - param3) / 55);
          if (this.a(18337) && (param1 == 84 ||
            param1 == 83)) {
            this.a(-23287, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("kf.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_z = new dg();
    }
}
