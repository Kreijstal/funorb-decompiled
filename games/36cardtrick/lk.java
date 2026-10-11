/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lk extends qb {
    static bk field_g;
    String field_n;
    int field_m;
    String field_r;
    int field_l;
    boolean field_j;
    int field_x;
    int field_q;
    int field_h;
    static boolean field_w;
    static String field_p;
    int field_i;
    static String field_t;
    ci field_v;
    static String[] field_u;
    mj field_s;
    pl field_k;
    int field_o;

    final boolean a(byte param0, int param1, int param2, boolean param3) {
        int var5;
        qi var6;
        int var7;
        var7 = Main.field_T;
        this.a(param2, param1, this, 3);
        var5 = this.d(82) ? 1 : 0;
        if (!param3) {
          if (var5 != 0 &&
            dl.field_h != 0) {
            this.c((byte) 28);
          }
        } else {
          if (eg.field_f != 0 &&
            var5 != 0) {
            this.a(param1, eg.field_b, param2, ij.field_e, eg.field_f, -1, this);
          }
          if (dl.field_h != 0) {
            if (this.a(param1, param2, ag.field_a, param0 + 77, this, dl.field_h, jc.field_N)) {
              param3 = false;
            } else {
              if (var5 != 0) {
                this.c((byte) 39);
              }
            }
          }
          if (k.field_c == 0 &&
            sa.field_c != 0) {
            this.a(false, this, eg.field_b, param1, param2, ij.field_e);
            var6 = sh.field_i;
            if (var6 != null) {
              if (var6.field_k instanceof wa) {
                ((wa) (var6.field_k)).a((wc) null, 15254, var6);
              }
              sh.field_i = null;
            }
          }
        }
        sa.field_c = k.field_c;
        hi.a(this.b((byte) -79), (byte) -111);
        if (param0 == -116) {
          return param3;
        }
        return false;
    }

    boolean d(int param0) {
        if (param0 < 44) {
          field_g = (bk) null;
          return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        boolean stackIn_6_0 = false;
        var6 = 12 / ((29 - param0) / 53);
        stackIn_6_0 = (param1 + this.field_o <= param3) && (param2 >= this.field_i + param4) && (this.field_h + this.field_o + param1 > param3) && (param4 - (-this.field_i - this.field_q) > param2);
        return stackIn_6_0;
    }

    public final String toString() {
        return this.a(new Hashtable(), false, 0, new StringBuilder()).toString();
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -99) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("lk.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 == ~param3 &&
          this.field_v != null) {
          this.field_v.a(param0, this, param2 ^ -11448, param1, true);
        }
    }

    StringBuilder a(Hashtable param0, boolean param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, param1, param0)) {
            this.a(param0, (byte) -16, param3, param2);
          }
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("lk.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, lk param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -14) {
            this.c((byte) -54);
          }
          if (!this.a(104, param0, param6, param2, param1)) {
            return false;
          }
          this.field_x = param5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("lk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, lk param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(param3 - 31, param1, ij.field_e, eg.field_b, param0) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (this.field_j) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          if (stackIn_3_0 != stackIn_6_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_j = stackIn_10_1;
            if (null != this.field_k &&
              this.field_k instanceof qc) {
              ((qc) (this.field_k)).a(18686, var5_int != 0, this);
            }
          }
          if (param3 != 3) {
            this.b((byte) -13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("lk.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(StringBuilder param0, int param1, boolean param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            this.a('M', (byte) 53, -34, (lk) null);
          }
          if (param3.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lk.Q(");
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
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 34) {
          this.field_v = (ci) null;
        }
        if (this.d(83) &&
          this.a(param0, (byte) -112, param2, this)) {
          return true;
        }
        int var4 = param2;
        if (var4 != 80) {
          return false;
        }
        return this.a(98, this);
    }

    final void g(int param0) {
        this.a(this.field_q, this.field_i, this.field_h, this.field_o, true);
        if (param0 != 26947) {
          this.a(-106, 85, -20, -95, (lk) null, 30, 45);
        }
    }

    final static wb[] a(String param0, String param1, byte param2, qk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wb[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(18659, param1);
          var5 = param3.a(var4_int, param0, (byte) 7);
          if (param2 <= 4) {
            lk.a((java.applet.Applet) null, 118, (String) null);
          }
          stackIn_3_0 = ol.a(var5, param3, var4_int, 505437496);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("lk.W(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void c(byte param0) {
        if (param0 <= 27) {
          this.a('j', (byte) -11, 35, (lk) null);
        }
    }

    public static void e(int param0) {
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_u = null;
        field_t = null;
        field_p = null;
    }

    int f(int param0) {
        if (param0 != -1) {
          return 126;
        }
        return 0;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            ni.field_a = param2;
            try {
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param2.length() != param1) {
                var5Lifetime6 = var7 + "; Expires=" + h.a(-117, 94608000000L + id.a(105)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              vh.a(param0, "document.cookie=\"" + var5Lifetime6 + "\"", param1 ^ -12300);
            } catch (Throwable throwable) {
            }
            tj.a(true, param0);
          } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "lk.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    lk(String param0, pl param1) {
        this(param0, pj.field_a.field_h, param1);
    }

    void a(boolean param0, lk param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_x = 0;
          if (param0) {
            this.d(97);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lk.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, lk param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == -1) {
            return false;
          }
          this.a((StringBuilder) null, -28, false, (Hashtable) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("lk.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    String b(byte param0) {
        if (param0 != -79) {
          this.a((Hashtable) null, true, 102, (StringBuilder) null);
        }
        if (!this.field_j) {
          return null;
        }
        return this.field_n;
    }

    final void a(Hashtable param0, byte param1, StringBuilder param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_i).append(" ").append(this.field_h).append("x").append(this.field_q);
          if (null != this.field_r) {
            discarded$1 = param2.append(" text=\"").append(this.field_r).append('"');
          }
          if (param1 != -16) {
            return;
          }
          if (this.field_j) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.d(86)) {
            discarded$3 = param2.append(" focused");
          }
          if (null != this.field_v) {
            discarded$4 = param2.append(" renderer=");
            if (this.field_v instanceof lk) {
              param2 = this.a(param0, false, 1 + param3, param2);
            } else {
              discarded$5 = param2.append(this.field_v);
            }
          }
          if (this.field_k != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_k instanceof lk)) {
              discarded$7 = param2.append(this.field_k);
            } else {
              param2 = this.a(param0, false, 1 + param3, param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("lk.FA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, boolean param4) {
        this.field_o = param3;
        this.field_i = param1;
        this.field_q = param0;
        this.field_h = param2;
        if (!param4) {
          this.field_q = -35;
        }
    }

    boolean a(int param0, lk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 71) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected lk() {
        this.field_m = 0;
        this.field_l = 0;
    }

    lk(String param0, ci param1, pl param2) {
        RuntimeException runtimeException = null;
        ne var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_m = 0;
        this.field_l = 0;
        try {
          this.field_r = param0;
          this.field_k = param2;
          this.field_v = param1;
          if (this.field_v instanceof ne) {
            var4 = (ne) ((Object) this.field_v);
            this.field_h = var4.a(this, (byte) 59);
            this.field_q = var4.a(-2, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lk.<init>(");
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
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    lk(int param0, int param1, int param2, int param3, ci param4, pl param5) {
        this.field_m = 0;
        this.field_l = 0;
        try {
          this.field_q = param3;
          this.field_h = param2;
          this.field_o = param0;
          this.field_v = param4;
          this.field_i = param1;
          this.field_k = param5;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var6_int = 0;
        int var7 = Main.field_T;
        int var4 = -127 / ((-39 - param1) / 62);
        int var5 = this.f(-1);
        for (var6_int = 0; var6_int <= var5; var6_int++) {
          this.a(param0, param2, -1, var6_int);
        }
        String var6 = wh.a((byte) -108);
        if (var6 != null) {
          pj.field_a.a(p.field_k, (byte) -53, var6, ti.field_a);
        }
    }

    static {
        field_g = new bk();
        field_p = "Connection lost. <%0>";
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_u = new String[]{"Complete level<nbsp>1", "Complete level<nbsp>2", "Complete level<nbsp>3", "Complete level<nbsp>4", "Complete level<nbsp>5", "Complete a level with no more than 18<nbsp>misses", "Complete a level with no more than 12<nbsp>misses", "Complete a level with no more than 9<nbsp>misses", "Complete a level with 1:00 remaining", "Complete a level with 1:30 remaining", "Complete a level with 2:00 remaining", "Complete a level with 2:30 remaining", "Manage 3 hits in a row (not counting the last two of a<nbsp>level)", "Manage 4 hits in a row (not counting the last two of a<nbsp>level)", "Manage 5 hits in a row (not counting the last two of a<nbsp>level)"};
    }
}
