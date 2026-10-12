/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class oa extends lh {
    static wk[] field_U;
    static String field_R;
    static long field_P;
    static String field_O;
    static String field_H;
    private boolean field_L;
    boolean field_K;
    static String[] field_J;
    static wk field_N;
    static int field_S;
    private boolean field_I;
    boolean field_T;
    static int[] field_M;
    static long field_G;
    static wk[] field_Q;

    public static void a(byte param0) {
        field_J = null;
        field_O = null;
        field_N = null;
        field_M = null;
        if (param0 == -105) {
          field_Q = null;
          field_R = null;
          field_U = null;
          field_H = null;
          return;
        }
        field_R = (String) null;
        field_Q = null;
        field_R = null;
        field_U = null;
        field_H = null;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
          lh var3 = (lh) null;
          this.a(4, -27, (lh) null, -86);
          return this.field_I;
        }
        return this.field_I;
    }

    boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_K &&
            this.a(param0, param4, (byte) 81, param3, param2)) {
            this.a(1, param1);
            this.field_w = param6;
            if (null != this.field_A) {
              if (!(this.field_A instanceof gn)) {
                return true;
              }
              ((gn) (this.field_A)).a(param6, param0, param2, 13030, param4, param3, this);
            }
            return true;
          }
          if (param5) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("oa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          on.field_k = param0;
          if (param1 != -107) {
            String var3 = (String) null;
            oa.a((String) null, (byte) 82);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "oa.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oa(String param0, tn param1) {
        this(param0, ad.field_j.field_f, param1);
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -104) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (StringBuilder) null, (byte) -122, 29);
          }
          if (this.a(param1, (byte) -91, param3, param0)) {
            this.a(param3, param0, false, param1);
            if (this.field_T) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_K) {
              discarded$3 = param1.append(" disabled");
            }
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("oa.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void b(int param0, byte param1, int param2, int param3) {
        if (param1 > -122) {
          return;
        }
        if (this.field_A == null) {
          return;
        }
        if (this.field_A instanceof ae) {
          ((ae) (this.field_A)).a(param2, (byte) -23, param0, this, param3);
          return;
        }
    }

    final void d(byte param0) {
        if (param0 != -45) {
          this.d((byte) -34);
          if (!this.field_I) {
            return;
          }
          this.field_I = false;
          if (this.field_A == null) {
            return;
          }
          if (this.field_A instanceof j) {
            ((j) (this.field_A)).a(this.field_I, (byte) 7, (lh) (this));
            return;
          }
          return;
        }
        if (!this.field_I) {
          return;
        }
        this.field_I = false;
        if (this.field_A == null) {
          return;
        }
        if (this.field_A instanceof j) {
          ((j) (this.field_A)).a(this.field_I, (byte) 7, (lh) (this));
          return;
        }
    }

    oa(String param0, qk param1, tn param2) {
        super(param0, param1, param2);
        this.field_K = true;
        this.field_I = false;
        this.field_L = true;
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.d(param0 ^ param0)) {
            return false;
          }
          if (param1 != 84 &&
            param1 != 83) {
            return false;
          }
          this.b(1, (byte) -125, -1, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("oa.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -4278) {
          field_M = (int[]) null;
          if (48 > param1) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > param1) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        try {
          if (null != this.field_A &&
            this.field_A instanceof gn) {
            ((gn) (this.field_A)).a(param3, param2, param1, this, param5, 19870);
          }
          this.field_w = 0;
          int var7_int = 88 % ((36 - param0) / 32);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "oa.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (param0 == -1) {
          return true;
        }
        if (param1) {
          return (1 << param0 & ln.field_a) != 0 ? true : false;
        }
        return false;
    }

    final static void f(int param0) {
        rh.a(false);
        jb.c((byte) -70);
        n.field_x = null;
        ke.a(2);
        if (param0 != -12161) {
          oa.f(-6);
        }
    }

    void a(int param0, int param1, lh param2, int param3) {
        if (param1 <= 56) {
          return;
        }
        try {
          super.a(param0, 87, param2, param3);
          if (this.field_w != 0) {
            if (nc.field_d == this.field_w) {
              return;
            }
            if (this.a(pi.field_c, param3, (byte) 81, oh.field_f, param0) &&
              nc.field_d == 0) {
              this.b(this.field_w, (byte) -123, oh.field_f - param0, -param3 + pi.field_c);
            }
            this.a((byte) -14, oh.field_f, param3, param0, param2, pi.field_c);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "oa.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    boolean a(int param0, lh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_K &&
            this.field_L) {
            param1.d((byte) -45);
            if (param0 != 1) {
              oa.a(-72, true);
            }
            this.field_I = true;
            if (null != this.field_A) {
              if (!(this.field_A instanceof j)) {
                return true;
              }
              ((j) (this.field_A)).a(this.field_I, (byte) 7, (lh) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("oa.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    protected oa() {
        this.field_K = true;
        this.field_I = false;
        this.field_L = true;
        this.field_p = ad.field_j.field_u;
    }

    static {
        field_H = "<br><br>Close-combat attack: <col=ffffff><%0></col>";
        field_J = new String[16];
        field_O = "Tags from Unrated games are not recorded.";
        field_S = 0;
        field_R = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
