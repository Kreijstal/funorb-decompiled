/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class fi extends l {
    cd field_o;
    int field_k;
    int field_g;
    int field_q;
    int field_l;
    ol field_w;
    static int[] field_j;
    static java.awt.Canvas field_v;
    int field_m;
    static de field_t;
    int field_u;
    String field_h;
    String field_n;
    ie field_r;
    boolean field_p;
    static int field_s;
    int field_i;

    final static Boolean e(boolean param0) {
        if (!param0) {
          return (Boolean) null;
        }
        Boolean var1 = ia.field_b;
        ia.field_b = null;
        return var1;
    }

    void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        try {
          if (param5 <= 73) {
            this.a((Hashtable) null, (byte) -23, 50, (StringBuilder) null);
          }
          this.field_i = 0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "fi.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        boolean stackIn_8_0 = false;
        if (param3 < 7) {
          this.field_o = (cd) null;
        }
        stackIn_8_0 = (param4 + this.field_l <= param1) && (param2 >= param0 + this.field_u) && (param4 + (this.field_l + this.field_g) > param1) && (this.field_m + this.field_u + param0 > param2);
        return stackIn_8_0;
    }

    final boolean a(int param0, char param1, int param2) {
        if (this.f(true) &&
          this.a(this, param1, param0, 21)) {
          return true;
        }
        if (param2 > -65) {
          this.a(19, 14, (byte) 51, true);
        }
        int var4 = param0;
        if (var4 != 80) {
          return false;
        }
        return this.a(this, -8515);
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 118) {
            this.a(-22, '﾿', 96);
          }
          if (this.a(param0, param2, 34, param3)) {
            this.a(param2, param0, (byte) 127, param3);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fi.MA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -8515) {
            return false;
          }
          this.a((fi) null, 9, true, -68, -47, 99, 20);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fi.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 34) {
            this.a((fi) null, -111, true, 107, -55, -73, 65);
          }
          if (param0.containsKey(this)) {
            discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param0.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fi.IB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void a(int param0, boolean param1, int param2, int param3, int param4) {
        this.field_m = param0;
        this.field_g = param4;
        if (!param1) {
          this.field_k = 87;
        }
        this.field_l = param3;
        this.field_u = param2;
    }

    void c(int param0) {
        if (param0 != -1) {
          this.d(33);
        }
    }

    final void d(boolean param0) {
        this.a(this.field_m, true, this.field_u, this.field_l, this.field_g);
        if (param0) {
          this.a(-67, 127, 95);
        }
    }

    boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == 0) {
            return false;
          }
          this.field_g = -122;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fi.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, boolean param3) {
        int var5;
        ce var6;
        int var7;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          this.a(param1, 116, this, param0);
          var5 = this.f(true) ? 1 : 0;
          if (!param3) {
            if (var5 == 0) {
              break L0;
            }
            if (oi.field_g == 0) {
              break L0;
            }
            this.c(-1);
          }
          if (param3 ||
            var7 != 0) {
            if (0 != og.field_b &&
              var5 != 0) {
              this.a(param1, this, og.field_b, param0, nl.field_u, 0, hk.field_Jb);
            }
            if (0 != oi.field_g) {
              if (!this.a(this, oi.field_g, false, param1, a.field_y, param0, ii.field_b)) {
                if (var5 != 0) {
                  this.c(-1);
                  if (var7 != 0) {
                    param3 = false;
                  }
                }
              } else {
                param3 = false;
              }
            }
            if (0 == j.field_e &&
              en.field_Jb != 0) {
              this.a(hk.field_Jb, nl.field_u, param1, this, param0, 111);
              var6 = ra.field_b;
              if (var6 != null) {
                if (var6.field_o instanceof ik) {
                  ((ik) (var6.field_o)).a(82, (vg) null, var6);
                }
                ra.field_b = null;
              }
            }
          }
        }
        en.field_Jb = j.field_e;
        em.a(true, this.d(59));
        if (param2 < -126) {
          return param3;
        }
        return false;
    }

    final void a(int param0, Hashtable param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_l).append(",").append(this.field_u).append(" ").append(this.field_g).append("x").append(this.field_m);
          if (this.field_n != null) {
            discarded$1 = param3.append(" text=\"").append(this.field_n).append('"');
          }
          if (this.field_p) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.f(true)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.field_w != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_w instanceof fi)) {
              discarded$5 = param3.append(this.field_w);
              if (var6 != 0) {
                param3 = this.a(param1, (byte) 119, param0 + 1, param3);
              }
            } else {
              param3 = this.a(param1, (byte) 119, param0 + 1, param3);
            }
          }
          if (param2 <= 125) {
            return;
          }
          if (null != this.field_o) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_o instanceof fi)) {
              discarded$7 = param3.append(this.field_o);
              if (var6 != 0) {
                param3 = this.a(param1, (byte) 126, 1 + param0, param3);
              }
            } else {
              param3 = this.a(param1, (byte) 126, 1 + param0, param3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("fi.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    int b(byte param0) {
        if (param0 != -39) {
          this.toString();
          return 0;
        }
        return 0;
    }

    public final String toString() {
        return this.a(new Hashtable(), (byte) 123, 0, new StringBuilder()).toString();
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 81 % ((-75 - param3) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("fi.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    fi(String param0, cd param1) {
        this(param0, vi.field_g.field_j, param1);
    }

    String d(int param0) {
        if (param0 < 35) {
          return (String) null;
        }
        if (!this.field_p) {
          return null;
        }
        return this.field_h;
    }

    void a(int param0, int param1, fi param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(param3, nl.field_u, hk.field_Jb, (byte) 22, param0) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (this.field_p) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_11_1 = (var5_int != 0);
            this.field_p = stackIn_11_1;
            if (this.field_o != null &&
              this.field_o instanceof ni) {
              ((ni) (this.field_o)).a((byte) 109, var5_int != 0, this);
            }
          }
          if (param1 < 113) {
            this.a(92, (Hashtable) null, (byte) 86, (StringBuilder) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("fi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_t = null;
        if (param0) {
          fi.c(false);
        }
        field_j = null;
        field_v = null;
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 != 37) {
          this.a(15, (Hashtable) null, (byte) 35, (StringBuilder) null);
        }
        if (0 == param3 &&
          this.field_w != null) {
          this.field_w.a(param1, this, true, param2, -23294);
        }
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          if (!this.a(param5, param6, param4, (byte) 27, param3)) {
            return false;
          }
          this.field_i = param1;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("fi.NA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        var4 = this.b((byte) -39);
        var5_int = param0;
        while (var5_int <= var4) {
          this.a((byte) 37, param2, param1, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = ph.c(-15025);
        if (var5 != null) {
          vi.field_g.a(mc.field_a, 5, ge.field_b, var5);
        }
    }

    boolean f(boolean param0) {
        if (!param0) {
          this.field_p = true;
          return false;
        }
        return false;
    }

    protected fi() {
        this.field_q = 0;
        this.field_k = 0;
    }

    fi(String param0, ol param1, cd param2) {
        RuntimeException runtimeException = null;
        gm var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = 0;
        this.field_k = 0;
        try {
          this.field_w = param1;
          this.field_o = param2;
          this.field_n = param0;
          if (this.field_w instanceof gm) {
            var4 = (gm) ((Object) this.field_w);
            this.field_g = var4.a(this, false);
            this.field_m = var4.a(this, 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("fi.<init>(");
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
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    fi(int param0, int param1, int param2, int param3, ol param4, cd param5) {
        this.field_q = 0;
        this.field_k = 0;
        try {
          this.field_g = param2;
          this.field_u = param1;
          this.field_l = param0;
          this.field_m = param3;
          this.field_o = param5;
          this.field_w = param4;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "fi.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_j = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((var0 & 1) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_j[var1] = var0;
        }
        field_s = 0;
    }
}
