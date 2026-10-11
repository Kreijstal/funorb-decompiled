/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class gl extends uf {
    cj field_l;
    static String field_t;
    int field_j;
    int field_y;
    static int field_k;
    static int field_m;
    ld field_q;
    boolean field_s;
    static String field_h;
    static String field_i;
    int field_n;
    String field_x;
    int field_p;
    sc field_r;
    int field_u;
    int field_v;
    int field_w;
    String field_o;

    final static ec b(String param0, int param1) {
        RuntimeException var2 = null;
        ec stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 20) {
            gl.a(true);
          }
          stackIn_3_0 = new ec(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gl.MB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    gl(String param0, sc param1) {
        this(param0, vc.field_c.field_t, param1);
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, param0, param6, param1)) {
            this.field_j = param4;
          }
          if (!param0) {
            return false;
          }
          this.a(46, -85, true, 48, 3);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("gl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 > -106) {
          this.a(65, (byte) -102, 18, -45, 98);
          if (0 != param2) {
            return;
          }
          if (this.field_l != null) {
            this.field_l.a(param3, this, param0, -24381, true);
            return;
          }
          return;
        }
        if (0 != param2) {
          return;
        }
        if (this.field_l != null) {
          this.field_l.a(param3, this, param0, -24381, true);
          return;
        }
    }

    boolean d(int param0) {
        if (param0 > -103) {
          field_t = (String) null;
          return false;
        }
        return false;
    }

    String f(int param0) {
        if (param0 < 70) {
          String var3 = (String) null;
          gl.b((String) null, 49);
          if (this.field_s) {
            return this.field_x;
          }
          return null;
        }
        if (this.field_s) {
          return this.field_x;
        }
        return null;
    }

    boolean a(char param0, gl param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 30) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            field_i = (String) null;
          }
          if (this.a(param1, param3, -48, param2)) {
            this.a(param3, param2, (byte) 27, param1);
          }
          stackIn_6_0 = (StringBuilder) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gl.KA(").append(param0).append(',');
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
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void e(int param0) {
        if (param0 > 0) {
          this.field_n = 83;
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
          field_k = 105;
          field_t = null;
          field_h = null;
          return;
        }
        field_t = null;
        field_h = null;
    }

    final boolean a(StringBuilder param0, Hashtable param1, int param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        Hashtable var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -29) {
            var6 = (Hashtable) null;
            this.a((StringBuilder) null, (Hashtable) null, -39, -117);
          }
          if (param1.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gl.PB(");
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
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(byte param0, gl param1) {
        RuntimeException var3 = null;
        gl var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 2) {
            return false;
          }
          var4 = (gl) null;
          this.a((gl) null, -124, 106, 49, -92, 11, (byte) 17);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        int var7;
        cb var8;
        cb var9;
        cb var10;
        cb var11;
        cb var12;
        var7 = Terraphoenix.field_V;
        this.a(this, param2, param1, 85);
        if (param3 < 111) {
          return true;
        }
        var5 = this.d(-113) ? 1 : 0;
        if (!param0) {
          if (var5 != 0 &&
            ma.field_I != 0) {
            this.e(-31);
          }
          ab.field_k = oh.field_f;
          b.a((byte) 16, this.f(105));
          return param0;
        }
        if (vj.field_P == 0) {
          L9: {
            if (ma.field_I != 0) {
              if (this.a(false, mm.field_c, param2, param1, ma.field_I, this, lm.field_c)) {
                param0 = false;
                if (var7 == 0) {
                  break L9;
                }
              }
              if (var5 != 0) {
                this.e(-23);
                if (oh.field_f == 0 &&
                  0 != ab.field_k) {
                  this.a(79, ef.field_j, param2, param1, jb.field_b, this);
                  var8 = oj.field_w;
                  if (var8 != null) {
                    if (!(var8.field_r instanceof fe)) {
                      oj.field_w = null;
                    } else {
                      ((fe) (var8.field_r)).a((hj) null, var8, 98);
                      oj.field_w = null;
                    }
                  }
                  if (var7 != 0 &&
                    ma.field_I != 0) {
                    this.e(-31);
                  }
                }
                ab.field_k = oh.field_f;
                b.a((byte) 16, this.f(105));
                return param0;
              }
            }
          }
          if (oh.field_f != 0) {
            ab.field_k = oh.field_f;
            b.a((byte) 16, this.f(105));
            return param0;
          }
          if (0 == ab.field_k) {
            ab.field_k = oh.field_f;
            b.a((byte) 16, this.f(105));
            return param0;
          }
          this.a(79, ef.field_j, param2, param1, jb.field_b, this);
          var9 = oj.field_w;
          if (var9 != null) {
            if (var9.field_r instanceof fe) {
              ((fe) (var9.field_r)).a((hj) null, var9, 98);
            }
            oj.field_w = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            ma.field_I != 0) {
            this.e(-31);
          }
          ab.field_k = oh.field_f;
          b.a((byte) 16, this.f(105));
          return param0;
        }
        if (var5 != 0) {
          this.a(this, param1, vj.field_P, ef.field_j, param2, jb.field_b, (byte) 37);
          if (ma.field_I != 0) {
            if (this.a(false, mm.field_c, param2, param1, ma.field_I, this, lm.field_c)) {
              param0 = false;
              if (var7 != 0) {
                this.e(-23);
              }
            } else {
              this.e(-23);
            }
          }
          if (oh.field_f != 0) {
            ab.field_k = oh.field_f;
            b.a((byte) 16, this.f(105));
            return param0;
          }
          if (0 == ab.field_k) {
            ab.field_k = oh.field_f;
            b.a((byte) 16, this.f(105));
            return param0;
          }
          this.a(79, ef.field_j, param2, param1, jb.field_b, this);
          var12 = oj.field_w;
          if (var12 != null) {
            if (var12.field_r instanceof fe) {
              ((fe) (var12.field_r)).a((hj) null, var12, 98);
            }
            oj.field_w = null;
          }
          if (var7 != 0 &&
            ma.field_I != 0) {
            this.e(-31);
          }
          ab.field_k = oh.field_f;
          b.a((byte) 16, this.f(105));
          return param0;
        }
        if (ma.field_I != 0 &&
          this.a(false, mm.field_c, param2, param1, ma.field_I, this, lm.field_c)) {
          param0 = false;
          if (var7 == 0) {
          }
        }
        if (oh.field_f != 0) {
          ab.field_k = oh.field_f;
          b.a((byte) 16, this.f(105));
          return param0;
        }
        if (0 == ab.field_k) {
          ab.field_k = oh.field_f;
          b.a((byte) 16, this.f(105));
          return param0;
        }
        this.a(79, ef.field_j, param2, param1, jb.field_b, this);
        var11 = oj.field_w;
        if (var11 != null) {
          if (var11.field_r instanceof fe) {
            ((fe) (var11.field_r)).a((hj) null, var11, 98);
          }
          oj.field_w = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          ma.field_I != 0) {
          this.e(-31);
        }
        ab.field_k = oh.field_f;
        b.a((byte) 16, this.f(105));
        return param0;
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        this.field_p = param2;
        if (param1 <= 45) {
          return;
        }
        this.field_w = param3;
        this.field_u = param0;
        this.field_n = param4;
    }

    void a(gl param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 < 25) {
            return;
          }
          var5_int = this.a(param2, param1, false, jb.field_b, ef.field_j) ? 1 : 0;
          stackIn_4_0 = var5_int;
          if (this.field_s) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_s = stackIn_10_1;
            if (this.field_r != null &&
              this.field_r instanceof de) {
              ((de) (this.field_r)).a(true, var5_int != 0, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gl.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        try {
          this.field_j = 0;
          if (param0 < 36) {
            this.d(18);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gl.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    int d(byte param0) {
        if (param0 < 23) {
          gl.a(false);
          return 0;
        }
        return 0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (this.d(-115)) {
          if (this.a(param1, this, 30, param0)) {
            return true;
          }
          var4 = -56 % ((param2 + 62) / 48);
          var5 = param0;
          if (var5 == 80) {
            return this.a((byte) 98, this);
          }
          return false;
        }
        var4Lifetime1 = -56 % ((param2 + 62) / 48);
        var5Lifetime1 = param0;
        if (var5Lifetime1 == 80) {
          return this.a((byte) 98, this);
        }
        return false;
    }

    public final String toString() {
        return this.a(34, new StringBuilder(), 0, new Hashtable()).toString();
    }

    final void c(int param0) {
        if (param0 == 0) {
          this.a(this.field_u, (byte) 92, this.field_p, this.field_w, this.field_n);
          return;
        }
        this.field_j = -18;
        this.a(this.field_u, (byte) 92, this.field_p, this.field_w, this.field_n);
    }

    final void a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_w).append(",").append(this.field_u).append(" ").append(this.field_p).append("x").append(this.field_n);
          if (null != this.field_o) {
            discarded$1 = param3.append(" text=\"").append(this.field_o).append('"');
          }
          if (this.field_s) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.d(-118)) {
            discarded$3 = param3.append(" focused");
          }
          if (param2 != 27) {
            this.a(15, (byte) 16, 121, -54, 36);
          }
          if (this.field_l != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_l instanceof gl)) {
              discarded$5 = param3.append(this.field_l);
              if (var6 != 0) {
                param3 = this.a(34, param3, 1 + param1, param0);
              }
            } else {
              param3 = this.a(34, param3, 1 + param1, param0);
            }
          }
          if (null != this.field_r) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_r instanceof gl)) {
              discarded$7 = param3.append(this.field_r);
              if (var6 != 0) {
                param3 = this.a(34, param3, param1 + 1, param0);
              }
            } else {
              param3 = this.a(34, param3, param1 + 1, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("gl.QB(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Terraphoenix.field_V;
        if (param0 <= -18) {
          var4 = this.d((byte) 107);
          var5_int = 0;
          while (var4 >= var5_int) {
            this.a(param1, -116, var5_int, param2);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
        } else {
          field_m = -77;
          var4 = this.d((byte) 107);
          var5_int = 0;
          while (var4 >= var5_int) {
            this.a(param1, -116, var5_int, param2);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
        }
        var5 = ml.e(19290);
        if (var5 == null) {
          return;
        }
        vc.field_c.b(lb.field_b, var5, ea.field_m, 4473924);
    }

    final static void c(byte param0) {
        if (q.field_Jb == 10) {
          ag.a(8468);
          q.field_Jb = 11;
        } else {
          if (!mi.a((byte) -108)) {
            ag.a(8468);
            q.field_Jb = 11;
          }
        }
        da.field_f = true;
        if (param0 > 107) {
          return;
        }
        gl.c((byte) -35);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        String var7;
        if (param2) {
          var7 = (String) null;
          gl.b((String) null, -102);
          if (param0 + this.field_w > param4) {
            return false;
          }
          if (param1 + this.field_u > param3) {
            return false;
          }
          if (param4 >= this.field_w + (param0 + this.field_p)) {
            return false;
          }
          if (param3 >= param1 + this.field_u + this.field_n) {
            return false;
          }
          return true;
        }
        if (param0 + this.field_w > param4) {
          return false;
        }
        if (param1 + this.field_u > param3) {
          return false;
        }
        stackIn_18_0 = (param4 < this.field_w + (param0 + this.field_p)) && (param3 < param1 + this.field_u + this.field_n);
        return stackIn_18_0;
    }

    boolean a(gl param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 > 6) {
            return false;
          }
          this.a(-57, '�', (byte) 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("gl.DB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    protected gl() {
        this.field_y = 0;
        this.field_v = 0;
    }

    gl(String param0, cj param1, sc param2) {
        w var4 = null;
        this.field_y = 0;
        this.field_v = 0;
        try {
          this.field_o = param0;
          this.field_r = param2;
          this.field_l = param1;
          if (this.field_l instanceof w) {
            var4 = (w) ((Object) this.field_l);
            this.field_p = var4.a(this, (byte) 102);
            this.field_n = var4.b(this, (byte) 116);
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    gl(int param0, int param1, int param2, int param3, cj param4, sc param5) {
        this.field_y = 0;
        this.field_v = 0;
        try {
          this.field_n = param3;
          this.field_w = param0;
          this.field_r = param5;
          this.field_p = param2;
          this.field_l = param4;
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "gl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
        field_h = "and activate autofire mode";
        field_i = "Difficulty: Easy";
        field_m = 20;
        field_t = "Saving the game will overwrite your previously saved game.";
    }
}
