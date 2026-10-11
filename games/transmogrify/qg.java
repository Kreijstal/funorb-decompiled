/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qg extends wf {
    boolean field_g;
    int field_p;
    String field_k;
    int field_o;
    ue field_i;
    String field_j;
    int field_n;
    int field_l;
    int field_r;
    int field_h;
    ui field_q;
    int field_s;
    ma field_m;

    qg(String param0, ma param1) {
        this(param0, vi.field_e.field_q, param1);
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param3, param6, -1, param0, param5)) {
            this.field_s = param1;
          }
          if (param4 == -30386) {
            return false;
          }
          this.field_k = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("qg.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_p).append(",").append(this.field_n).append(" ").append(this.field_l).append("x").append(this.field_h);
          if (this.field_k != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_k).append('"');
          }
          if (this.field_g) {
            discarded$2 = param0.append(" mouseover");
          }
          var5_int = -48 % ((param1 - 22) / 40);
          if (this.b((byte) 121)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_q) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_q instanceof qg)) {
              discarded$5 = param0.append(this.field_q);
            } else {
              param0 = this.a(param2 + 1, -109, param0, param3);
            }
          }
          if (this.field_m != null) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_m instanceof qg)) {
              discarded$7 = param0.append(this.field_m);
              return;
            }
            param0 = this.a(1 + param2, -115, param0, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("qg.CB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        if (!ge.field_x) {
          throw new IllegalStateException();
        }
        bg.field_n = true;
        n.a(true, param0);
        gl.field_y = 0;
    }

    final static int d(int param0) {
        if (param0 != -20493) {
          return 104;
        }
        return gj.field_l;
    }

    final void c(byte param0) {
        if (param0 <= 14) {
          this.g(100);
        }
        this.a(-96, this.field_n, this.field_p, this.field_l, this.field_h);
    }

    final boolean a(int param0, char param1, int param2) {
        if (this.b((byte) 38) &&
          this.a(param2, this, (byte) -27, param1)) {
          return true;
        }
        int var4 = param2;
        if (var4 == 80) {
          return this.a(this, -106);
        }
        if (param0 != -81) {
          this.field_p = 19;
          return false;
        }
        return false;
    }

    void e(int param0) {
        if (param0 != -29113) {
          this.a(84, 80, 23, -23, 76);
        }
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -77 % ((65 - param2) / 55);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("qg.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -1) {
            this.a(93, 124, 81, -75, -10);
          }
          if (!param1.containsKey(this)) {
            param1.put(this, this);
            return true;
          }
          discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qg.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    int g(int param0) {
        if (param0 >= -41) {
          qg.a((byte) 106, -11);
          return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 112 / ((param0 + 29) / 53);
        this.field_l = param3;
        this.field_h = param4;
        this.field_n = param1;
        this.field_p = param2;
    }

    boolean a(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == -17) {
            return false;
          }
          this.field_g = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qg.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.b(param3, param0, -1, oa.field_j, bk.field_a) ? 1 : 0;
          if (param1 != -12) {
            this.field_s = 86;
          }
          stackIn_5_0 = (this.field_g) ? 0 : 1;
          if (stackIn_5_0 == var5_int) {
            stackIn_9_1 = (var5_int != 0);
            this.field_g = stackIn_9_1;
            if (null != this.field_m) {
              if (!(this.field_m instanceof ja)) {
                return;
              }
              ((ja) (this.field_m)).a(var5_int != 0, 5257, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qg.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    String f(int param0) {
        if (param0 != 4) {
          this.field_s = 3;
        }
        return !this.field_g ? null : this.field_j;
    }

    void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        try {
          this.field_s = 0;
          if (param3 != -1) {
            this.g(-118);
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qg.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public final String toString() {
        return this.a(0, -21, new StringBuilder(), new Hashtable()).toString();
    }

    boolean b(byte param0) {
        int var2 = 95 / ((param0 + 57) / 46);
        return false;
    }

    boolean a(qg param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -11) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qg.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -6 / ((param1 - 17) / 55);
          var3 = (CharSequence) ((Object) param0);
          stackIn_1_0 = kf.field_e.equals(hj.a((byte) -126, var3));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("qg.BB(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var5 = 112 / ((param3 - 77) / 34);
        if (param2 == 0 &&
          null != this.field_q) {
          this.field_q.a(param0, param1, true, (byte) 110, this);
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_8_0 = false;
        if (param2 != -1) {
          this.field_o = -25;
        }
        stackIn_8_0 = (param3 >= this.field_p + param0) && (param1 + this.field_n <= param4) && (param3 < this.field_l + (param0 + this.field_p)) && (param4 < this.field_n + param1 + this.field_h);
        return stackIn_8_0;
    }

    final static int a(byte param0, int param1) {
        int var2;
        var2 = 0;
        if (0 > param1 ||
          65536 <= param1) {
          param1 = param1 >>> 16;
          var2 += 16;
        }
        if (param1 >= 256) {
          var2 += 8;
          param1 = param1 >>> 8;
        }
        if (param1 >= 16) {
          var2 += 4;
          param1 = param1 >>> 4;
        }
        if (param1 >= 4) {
          var2 += 2;
          param1 = param1 >>> 2;
        }
        if (param1 >= 1) {
          param1 = param1 >>> 1;
          var2++;
        }
        if (param0 >= 69) {
          return param1 + var2;
        }
        return 21;
    }

    StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -103, param3, param2, param0)) {
            this.a(param2, 78, param0, param3);
          }
          if (param1 <= -20) {
            stackIn_7_0 = (StringBuilder) (param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qg.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        vl var6;
        var7 = Transmogrify.field_A ? 1 : 0;
        this.a(param0, (byte) -12, this, param1);
        var5 = this.b((byte) 63) ? 1 : 0;
        if (param3 != 4) {
          return false;
        }
        if (param2) {
          if (f.field_a != 0 &&
            var5 != 0) {
            this.a(param1, bk.field_a, this, param0, f.field_a, -17, oa.field_j);
          }
          if (tg.field_d != 0) {
            if (this.b(ol.field_b, tg.field_d, this, param1, -30386, nk.field_c, param0)) {
              param2 = false;
            } else {
              if (var5 != 0) {
                this.e(-29113);
              }
            }
          }
          if (b.field_k == 0 &&
            hi.field_g != 0) {
            this.a(param0, oa.field_j, this, -1, bk.field_a, param1);
            var6 = b.field_i;
            if (var6 != null) {
              if (var6.field_m instanceof s) {
                ((s) (var6.field_m)).a((g) null, 2089, var6);
              }
              b.field_i = null;
            }
          }
        } else {
          if (var5 != 0 &&
            0 != tg.field_d) {
            this.e(-29113);
          }
        }
        hi.field_g = b.field_k;
        eg.a(this.f(param3 ^ 0), (byte) 126);
        return param2;
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = Transmogrify.field_A ? 1 : 0;
        int var4 = this.g(-64);
        if (param1 >= -13) {
          return;
        }
        for (var5_int = 0; var5_int <= var4; var5_int++) {
          this.a(param2, param0, var5_int, (byte) 123);
        }
        String var5 = ra.a((byte) 113);
        if (var5 != null) {
          vi.field_e.a(og.field_e, 60, var5, qi.field_d);
        }
    }

    protected qg() {
        this.field_r = 0;
        this.field_o = 0;
    }

    qg(String param0, ui param1, ma param2) {
        RuntimeException runtimeException = null;
        m var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_r = 0;
        this.field_o = 0;
        try {
          this.field_m = param2;
          this.field_q = param1;
          this.field_k = param0;
          if (this.field_q instanceof m) {
            var4 = (m) ((Object) this.field_q);
            this.field_l = var4.a(-1, this);
            this.field_h = var4.b(this, 228);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qg.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    qg(int param0, int param1, int param2, int param3, ui param4, ma param5) {
        this.field_r = 0;
        this.field_o = 0;
        try {
          this.field_n = param1;
          this.field_l = param2;
          this.field_q = param4;
          this.field_h = param3;
          this.field_m = param5;
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
