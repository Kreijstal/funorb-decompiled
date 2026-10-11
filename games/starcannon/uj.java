/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class uj extends rf {
    int field_i;
    qg field_g;
    String field_p;
    String field_k;
    static String field_r;
    int field_f;
    int field_l;
    bd field_m;
    int field_n;
    int field_j;
    boolean field_h;
    int field_s;
    int field_q;
    de field_o;

    void b(byte param0) {
        if (param0 >= -72) {
          this.field_j = -22;
        }
    }

    uj(String param0, qg param1) {
        this(param0, eh.field_j.field_j, param1);
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 != 49) {
          this.field_q = 115;
        }
        if (param0 == 0 &&
          this.field_o != null) {
          this.field_o.a(param1, true, 119, param3, this);
        }
    }

    int c(boolean param0) {
        if (param0) {
          return 34;
        }
        return 0;
    }

    boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -11) {
            this.field_i = -21;
          }
          if (!this.a(param3, param2, param1, param5, -12790)) {
            return false;
          }
          this.field_l = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("uj.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        try {
          this.field_l = 0;
          if (param4 != -22) {
            this.field_q = 73;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "uj.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.field_h = false;
          }
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("uj.NB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != -30) {
          return;
        }
        this.a(this.field_s, this.field_i, (byte) 126, this.field_f, this.field_j);
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 >= -35) {
          uj.a(125, ':', (String) null);
        }
    }

    public final String toString() {
        return this.a(new Hashtable(), new StringBuilder(), (byte) 39, 0).toString();
    }

    final boolean a(int param0, int param1, char param2) {
        if (this.d(true) &&
          this.a(this, param2, (byte) -90, param0)) {
          return true;
        }
        int var4 = param0;
        if (var4 == 80) {
          return this.a(0, this);
        }
        var4 = 34 / ((-67 - param1) / 51);
        return false;
    }

    void a(int param0, int param1, uj param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(param3, param1, la.field_c, pe.field_d, -12790) ? 1 : 0;
          if (param0 < 27) {
            this.field_l = 90;
          }
          stackIn_5_0 = (this.field_h) ? 0 : 1;
          if (stackIn_5_0 == var5_int) {
            stackIn_10_1 = (var5_int != 0);
            this.field_h = stackIn_10_1;
            if (this.field_g != null) {
              if (!(this.field_g instanceof hk)) {
                return;
              }
              ((hk) (this.field_g)).a(this, false, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("uj.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_s).append(",").append(this.field_j).append(" ").append(this.field_i).append("x").append(this.field_f);
          if (param3 != 19103) {
            this.a(58, -6, (byte) -90, -49, 54);
          }
          if (this.field_k != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_k).append('"');
          }
          if (this.field_h) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.d(true)) {
            discarded$3 = param1.append(" focused");
          }
          if (null != this.field_o) {
            discarded$4 = param1.append(" renderer=");
            if (this.field_o instanceof uj) {
              param1 = this.a(param0, param1, (byte) 39, 1 + param2);
            } else {
              discarded$5 = param1.append(this.field_o);
            }
          }
          if (this.field_g != null) {
            discarded$6 = param1.append(" listener=");
            if (this.field_g instanceof uj) {
              param1 = this.a(param0, param1, (byte) 39, param2 + 1);
              return;
            }
            discarded$7 = param1.append(this.field_g);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("uj.QB(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 < 115) {
          this.field_g = (qg) null;
        }
        this.field_i = param1;
        this.field_f = param3;
        this.field_j = param4;
        this.field_s = param0;
    }

    boolean d(boolean param0) {
        if (!param0) {
          return true;
        }
        return false;
    }

    final static String[] a(int param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String[] stackIn_8_0 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param2);
          var3_int = lh.a(-15790, var9, param1);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          if (param0 > -2) {
            stackIn_8_0 = (String[]) null;
            return stackIn_8_0;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("uj.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, uj param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 == -81) {
            return false;
          }
          this.field_o = (de) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("uj.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, 0, param1, param3)) {
            this.a(param0, param1, param3, 19103);
          }
          if (param2 != 39) {
            this.field_o = (de) null;
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("uj.SA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          String var8 = null;
          String stackIn_8_0 = null;
          String stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          try {
            try {
              var8 = param0.getParameter("cookieprefix");
              if (param1 != 61) {
                uj.a((java.applet.Applet) null, -85);
              }
              var3 = var8 + "settings";
              var4 = (String) (mb.a(param0, "getcookies", true));
              var5 = uj.a(param1 - 176, ';', var4);
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_8_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_8_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == qi.field_b) {
              return param0.getParameter("settings");
            }
            stackIn_15_0 = qi.field_b;
            return stackIn_15_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var2_ref;
            stackIn_18_1 = new StringBuilder().append("uj.KB(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    String d(int param0) {
        if (param0 != 12606) {
          return (String) null;
        }
        return !this.field_h ? null : this.field_p;
    }

    final boolean a(byte param0, boolean param1, int param2, int param3) {
        int var5;
        tj var6;
        this.a(83, param2, this, param3);
        var5 = this.d(true) ? 1 : 0;
        if (param1) {
          if (lh.field_I != 0 &&
            var5 != 0) {
            this.a(param3, param2, lh.field_I, la.field_c, this, pe.field_d, -81);
          }
          if (kg.field_a != 0) {
            if (!this.a(this, kc.field_Q, param2, param3, (byte) -11, rg.field_B, kg.field_a)) {
              if (var5 != 0) {
                this.b((byte) -93);
              }
            } else {
              param1 = false;
            }
          }
          if (te.field_b == 0 &&
            of.field_f != 0) {
            this.a(la.field_c, param3, param2, this, (byte) -22, pe.field_d);
            var6 = il.field_k;
            if (var6 != null) {
              if (var6.field_g instanceof da) {
                ((da) (var6.field_g)).a(var6, (af) null, 119);
              }
              il.field_k = null;
            }
          }
        } else {
          if (var5 != 0 &&
            kg.field_a != 0) {
            this.b((byte) -104);
          }
        }
        of.field_f = te.field_b;
        qi.a((byte) -111, this.d(12606));
        if (param0 > -96) {
          this.toString();
        }
        return param1;
    }

    boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -90) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("uj.EA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_8_0 = false;
        if (param4 != -12790) {
          this.field_j = 116;
        }
        stackIn_8_0 = (param1 + this.field_s <= param3) && (param0 + this.field_j <= param2) && (param3 < this.field_i + this.field_s + param1) && (param2 < param0 + this.field_j + this.field_f);
        return stackIn_8_0;
    }

    final void a(int param0, byte param1, int param2) {
        int var7 = StarCannon.field_A;
        int var4 = this.c(false);
        int var5_int = 0;
        int var6 = 21 / ((param1 - 7) / 45);
        while (var4 >= var5_int) {
          this.a(var5_int, param0, (byte) 49, param2);
          var5_int++;
        }
        String var5 = lb.a(-110);
        if (var5 != null) {
          eh.field_j.b(ua.field_a, -128, var5, ti.field_c);
        }
    }

    boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uj.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    protected uj() {
        this.field_n = 0;
        this.field_q = 0;
    }

    uj(String param0, de param1, qg param2) {
        RuntimeException runtimeException = null;
        lg var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_n = 0;
        this.field_q = 0;
        try {
          this.field_g = param2;
          this.field_k = param0;
          this.field_o = param1;
          if (this.field_o instanceof lg) {
            var4 = (lg) ((Object) this.field_o);
            this.field_i = var4.a(this, -26557);
            this.field_f = var4.a(16293784, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("uj.<init>(");
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    uj(int param0, int param1, int param2, int param3, de param4, qg param5) {
        this.field_n = 0;
        this.field_q = 0;
        try {
          this.field_i = param2;
          this.field_j = param1;
          this.field_g = param5;
          this.field_s = param0;
          this.field_f = param3;
          this.field_o = param4;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "uj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
