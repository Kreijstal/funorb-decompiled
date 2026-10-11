/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class we extends ug {
    int field_i;
    aa field_q;
    String field_s;
    of field_o;
    ml field_h;
    int field_r;
    static int field_j;
    int field_l;
    int field_t;
    String field_m;
    int field_p;
    static qh field_n;
    int field_k;
    int field_e;
    boolean field_g;
    static le[] field_f;

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
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
        we var7 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_e).append(" ").append(this.field_l).append("x").append(this.field_p);
          if (this.field_s != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_s).append('"');
          }
          if (param3 >= -1) {
            var7 = (we) null;
            this.a((we) null, 84, -2, (byte) -23);
          }
          if (this.field_g) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.b((byte) 52)) {
            discarded$3 = param2.append(" focused");
          }
          if (null != this.field_h) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_h instanceof we)) {
              discarded$5 = param2.append(this.field_h);
              if (var6 != 0) {
                param2 = this.a(false, param2, param0, param1 + 1);
              }
            } else {
              param2 = this.a(false, param2, param0, param1 + 1);
            }
          }
          if (null != this.field_o) {
            discarded$6 = param2.append(" listener=");
            if (this.field_o instanceof we) {
              param2 = this.a(false, param2, param0, 1 + param1);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param2.append(this.field_o);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("we.NA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a(12, 31, -123, -11, (byte) -73);
          }
          if (this.a(param2, (byte) -125, param3, param1)) {
            this.a(param2, param3, param1, -50);
          }
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("we.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final void g(int param0) {
        if (param0 != -1) {
          return;
        }
        this.a(this.field_p, param0 + 13362, this.field_r, this.field_l, this.field_e);
    }

    final static cj b(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        cj stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -61) {
            field_f = (le[]) null;
          }
          if (ed.field_c == cf.field_b) {
            stackIn_4_0 = null;
            return (cj) (stackIn_4_0);
          }
          if (f.field_i == ed.field_c &&
            param0.equals(pi.field_p)) {
            ed.field_c = di.field_a;
            stackIn_11_0 = w.field_c;
            return stackIn_11_0;
          }
          ed.field_c = cf.field_b;
          pi.field_p = param0;
          w.field_c = null;
          stackIn_9_0 = null;
          return (cj) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("we.LA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(false, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean a(we param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.g(-123);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("we.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            this.field_t = 65;
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
          stackIn_9_1 = new StringBuilder().append("we.IA(");
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
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    int f(int param0) {
        if (param0 != 0) {
          Hashtable var3 = (Hashtable) null;
          this.a(false, (StringBuilder) null, (Hashtable) null, -90);
          return 0;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_e = param4;
        this.field_p = param0;
        this.field_r = param2;
        this.field_l = param3;
        if (param1 != 13361) {
          this.field_r = 7;
        }
    }

    public static void h(int param0) {
        field_f = null;
        field_n = null;
        if (param0 != 0) {
          field_j = -84;
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (param1 <= 88) {
          this.g(38);
          if (this.b((byte) 83) &&
            this.a(this, param2, param0, -108)) {
            return true;
          }
          var4 = param0;
          if (var4 == 80) {
            return this.a(this, false);
          }
          return false;
        }
        if (!this.b((byte) 83)) {
          var4Lifetime1 = param0;
          if (var4Lifetime1 == 80) {
            return this.a(this, false);
          }
          return false;
        }
        if (this.a(this, param2, param0, -108)) {
          return true;
        }
        var4Lifetime2 = param0;
        if (var4Lifetime2 == 80) {
          return this.a(this, false);
        }
        return false;
    }

    boolean a(int param0, we param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 < -109) {
            return false;
          }
          this.field_k = 0;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("we.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        we var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        String var12 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = this.f(0);
        var5 = 0;
        while (true) {
          if (var5 > var4) {
            if (param2 >= 105) {
              var12 = nd.a((byte) -128);
              if (var12 != null) {
                hi.field_b.a(nj.field_a, 68, oa.field_G, var12);
              }
              return;
            }
            var7 = (we) null;
            this.a(88, 31, (we) null, -103, 118, -124);
            var11 = nd.a((byte) -128);
            if (var11 != null) {
              hi.field_b.a(nj.field_a, 68, oa.field_G, var11);
            }
            return;
          }
          this.a(30, var5, param0, param1);
          var5++;
          if (var6 != 0) {
            var8 = nd.a((byte) -128);
            if (var8 != null) {
              hi.field_b.a(nj.field_a, 68, oa.field_G, var8);
            }
            return;
          }
        }
    }

    void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        try {
          this.field_t = param4;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "we.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void e(int param0) {
        if (param0 != 13104) {
          this.field_q = (aa) null;
        }
    }

    we(String param0, of param1) {
        this(param0, hi.field_b.field_a, param1);
    }

    String a(byte param0) {
        if (param0 == 54) {
          return !this.field_g ? null : this.field_m;
        }
        this.field_r = -71;
        return !this.field_g ? null : this.field_m;
    }

    void a(we param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        StringBuilder var6 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 > -13) {
            var6 = (StringBuilder) null;
            this.a((Hashtable) null, (byte) 43, -49, (StringBuilder) null);
          }
          var5_int = this.a(ei.field_a, param1, param2, p.field_a, (byte) 45) ? 1 : 0;
          if (var5_int != (this.field_g ? 1 : 0)) {
            stackIn_6_1 = (var5_int != 0);
            this.field_g = stackIn_6_1;
            if (null != this.field_o &&
              this.field_o instanceof jd) {
              ((jd) (this.field_o)).a(var5_int != 0, this, 25982);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("we.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(we param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -93 / ((param3 - 37) / 50);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("we.V(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 45) {
          return false;
        }
        if (this.field_r + param2 > param0) {
          return false;
        }
        if (param3 < param1 + this.field_e) {
          return false;
        }
        if (param0 >= this.field_l + this.field_r + param2) {
          return false;
        }
        if (param3 < this.field_p + param1 + this.field_e) {
          return true;
        }
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          if (param0 == 30) {
            return;
          }
          this.field_t = 54;
          return;
        }
        if (this.field_h == null) {
          if (param0 == 30) {
            return;
          }
          this.field_t = 54;
          return;
        }
        this.field_h.a(true, this, param2, param3, 30);
        if (param0 == 30) {
          return;
        }
        this.field_t = 54;
    }

    boolean b(byte param0) {
        if (param0 <= 38) {
          field_j = 11;
          return false;
        }
        return false;
    }

    boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0, param6, param5, (byte) 45)) {
            this.field_t = param2;
          }
          if (param3 != -1625) {
            this.a(-27, 48, 40);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("we.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    protected we() {
        this.field_i = 0;
        this.field_k = 0;
    }

    we(String param0, ml param1, of param2) {
        RuntimeException runtimeException = null;
        ui var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = 0;
        this.field_k = 0;
        try {
          this.field_o = param2;
          this.field_h = param1;
          this.field_s = param0;
          if (this.field_h instanceof ui) {
            var4 = (ui) ((Object) this.field_h);
            this.field_l = var4.a(this, (byte) 103);
            this.field_p = var4.a(this, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("we.<init>(");
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
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    we(int param0, int param1, int param2, int param3, ml param4, of param5) {
        this.field_i = 0;
        this.field_k = 0;
        try {
          this.field_l = param2;
          this.field_h = param4;
          this.field_r = param0;
          this.field_e = param1;
          this.field_o = param5;
          this.field_p = param3;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "we.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        ee var6;
        int var7;
        ee var8;
        ee var17;
        ee var21;
        ee var22;
        ee var24;
        ee var29;
        ee var30;
        ee var31;
        ee var32;
        int var5Lifetime1;
        ee var6Lifetime1;
        ee var6Lifetime2;
        ee var6Lifetime1Lifetime1;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        this.a(this, param1, param0, (byte) -57);
        if (!param2) {
          this.field_s = (String) null;
          var5 = this.b((byte) 74) ? 1 : 0;
          if (param3) {
            if (0 != ab.field_d &&
              var5 != 0) {
              this.a(p.field_a, this, ei.field_a, param1, param0, ab.field_d, -118);
            }
            if (kc.field_d != 0) {
              if (!this.a(param1, qg.field_c, kc.field_d, -1625, this, ab.field_e, param0)) {
                if (var5 != 0) {
                  this.e(13104);
                  if (var7 != 0) {
                    param3 = false;
                  }
                }
              } else {
                param3 = false;
              }
            }
            if (ni.field_a != 0) {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
            if (0 == q.field_a) {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
            this.a(param1, ei.field_a, this, p.field_a, 0, param0);
            var8 = od.field_n;
            if (var8 != null) {
              if (var8.field_o instanceof tc) {
                ((tc) (var8.field_o)).a((oa) null, (byte) -27, var8);
              }
              od.field_n = null;
            }
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (var5 == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (kc.field_d == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          this.e(13104);
          if (var7 == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (0 != ab.field_d &&
            var5 != 0) {
            this.a(p.field_a, this, ei.field_a, param1, param0, ab.field_d, -118);
          }
          boolean decompiledFrameRemainder0 = true;
          if (kc.field_d != 0) {
            if ((!this.a(param1, qg.field_c, kc.field_d, -1625, this, ab.field_e, param0)) &&
              (decompiledFrameRemainder0 = (var5 != 0))) {
              this.e(13104);
            }
            if (decompiledFrameRemainder0) {
              param3 = false;
            }
          }
          if (ni.field_a != 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (0 == q.field_a) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          this.a(param1, ei.field_a, this, p.field_a, 0, param0);
          var17 = od.field_n;
          if (var17 != null) {
            if (var17.field_o instanceof tc) {
              ((tc) (var17.field_o)).a((oa) null, (byte) -27, var17);
            }
            od.field_n = null;
          }
          q.field_a = ni.field_a;
          ef.a(107, this.a((byte) 54));
          return param3;
        }
        var5Lifetime1 = this.b((byte) 74) ? 1 : 0;
        if (!param3) {
          if (var5Lifetime1 == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (kc.field_d == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          this.e(13104);
          if (var7 == 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (0 != ab.field_d &&
            var5Lifetime1 != 0) {
            this.a(p.field_a, this, ei.field_a, param1, param0, ab.field_d, -118);
          }
          if (kc.field_d != 0) {
            if (!this.a(param1, qg.field_c, kc.field_d, -1625, this, ab.field_e, param0)) {
              this.e(13104);
            }
            param3 = false;
          }
          if (ni.field_a != 0) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          if (0 == q.field_a) {
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          this.a(param1, ei.field_a, this, p.field_a, 0, param0);
          var21 = od.field_n;
          if (var21 != null) {
            if (var21.field_o instanceof tc) {
              ((tc) (var21.field_o)).a((oa) null, (byte) -27, var21);
            }
            od.field_n = null;
          }
          q.field_a = ni.field_a;
          ef.a(107, this.a((byte) 54));
          return param3;
        }
        if (0 != ab.field_d) {
          if (var5Lifetime1 == 0) {
            if (kc.field_d == 0) {
              if (ni.field_a != 0) {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
              if (0 == q.field_a) {
                q.field_a = ni.field_a;
                ef.a(107, this.a((byte) 54));
                return param3;
              }
              this.a(param1, ei.field_a, this, p.field_a, 0, param0);
              var22 = od.field_n;
              var6 = var22;
              if (var22 != null) {
                if (var22.field_o instanceof tc) {
                  ((tc) (var22.field_o)).a((oa) null, (byte) -27, var22);
                }
                od.field_n = null;
              }
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
            if (this.a(param1, qg.field_c, kc.field_d, -1625, this, ab.field_e, param0)) {
              param3 = false;
            } else {
            }
            if (ni.field_a != 0) {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
            if (0 == q.field_a) {
              q.field_a = ni.field_a;
              ef.a(107, this.a((byte) 54));
              return param3;
            }
            this.a(param1, ei.field_a, this, p.field_a, 0, param0);
            var29 = od.field_n;
            var6Lifetime2 = var29;
            if (var29 != null) {
              if (var29.field_o instanceof tc) {
                ((tc) (var29.field_o)).a((oa) null, (byte) -27, var29);
              }
              od.field_n = null;
            }
            q.field_a = ni.field_a;
            ef.a(107, this.a((byte) 54));
            return param3;
          }
          this.a(p.field_a, this, ei.field_a, param1, param0, ab.field_d, -118);
        }
        sharedTailExit_2: {
          if (kc.field_d == 0) {
            if (((ni.field_a == 0)) &&
              ((0 != q.field_a))) {
              this.a(param1, ei.field_a, this, p.field_a, 0, param0);
              var30 = od.field_n;
              var6Lifetime1 = var30;
              if (var30 != null) {
                if (var30.field_o instanceof tc) {
                  ((tc) (var30.field_o)).a((oa) null, (byte) -27, var30);
                }
                od.field_n = null;
              }
            }
            break sharedTailExit_2;
          }
          sharedTailExit_1: {
            if (this.a(param1, qg.field_c, kc.field_d, -1625, this, ab.field_e, param0)) {
              param3 = false;
            } else {
              if (var5Lifetime1 != 0) {
                this.e(13104);
                if (var7 != 0) {
                  param3 = false;
                  if (ni.field_a == 0 &&
                    0 != q.field_a) {
                    this.a(param1, ei.field_a, this, p.field_a, 0, param0);
                    var31 = od.field_n;
                    var6Lifetime1Lifetime1 = var31;
                    if (var31 == null) {
                      break sharedTailExit_2;
                    }
                    if (var31.field_o instanceof tc) {
                      ((tc) (var31.field_o)).a((oa) null, (byte) -27, var31);
                    }
                    od.field_n = null;
                  }
                  break sharedTailExit_1;
                }
              }
            }
            if (ni.field_a == 0 &&
              0 != q.field_a) {
              this.a(param1, ei.field_a, this, p.field_a, 0, param0);
              var32 = od.field_n;
              if (var32 == null) {
                break sharedTailExit_2;
              }
              if (var32.field_o instanceof tc) {
                ((tc) (var32.field_o)).a((oa) null, (byte) -27, var32);
              }
              od.field_n = null;
            }
          }
        }
        q.field_a = ni.field_a;
        ef.a(107, this.a((byte) 54));
        return param3;
    }

    static {
        field_j = 0;
        field_n = new qh();
    }
}
