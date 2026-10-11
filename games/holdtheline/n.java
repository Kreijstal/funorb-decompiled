/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class n extends hl {
    static gn field_w;
    static uf field_j;
    int field_y;
    boolean field_p;
    String field_z;
    static uf field_r;
    tb field_t;
    int field_o;
    lm field_i;
    int field_u;
    dh field_l;
    static String field_s;
    int field_k;
    int field_v;
    int field_x;
    int field_m;
    String field_q;
    static volatile long field_n;

    final boolean b(int param0, byte param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param1 != -105) {
          this.toString();
          if (this.field_k + param0 > param2) {
            return false;
          }
          if (param3 + this.field_o > param4) {
            return false;
          }
          if (param2 >= this.field_x + this.field_k + param0) {
            return false;
          }
          if (param4 >= this.field_u + this.field_o + param3) {
            return false;
          }
          return true;
        }
        if (this.field_k + param0 > param2) {
          return false;
        }
        if (param3 + this.field_o > param4) {
          return false;
        }
        stackIn_18_0 = (param2 < this.field_x + this.field_k + param0) && (param4 < this.field_u + this.field_o + param3);
        return stackIn_18_0;
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 == 122) {
          this.field_o = param2;
          this.field_u = param3;
          this.field_x = param4;
          this.field_k = param0;
          return;
        }
        this.d((byte) -120);
        this.field_o = param2;
        this.field_u = param3;
        this.field_x = param4;
        this.field_k = param0;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var5 = 0;
        int var4 = 111 % ((57 - param2) / 45);
        int var5Lifetime1;
        if (!this.c((byte) -20)) {
          var5 = param0;
          if (var5 == 80) {
            return this.a(this, -25823);
          }
          return false;
        }
        if (this.a(this, param0, (byte) -78, param1)) {
          return true;
        }
        var5Lifetime1 = param0;
        if (var5Lifetime1 == 80) {
          return this.a(this, -25823);
        }
        return false;
    }

    boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 == -24898) {
            return false;
          }
          field_w = (gn) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("n.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean c(byte param0) {
        if (param0 != -20) {
          return false;
        }
        return false;
    }

    int d(byte param0) {
        if (param0 >= -66) {
          this.field_y = 63;
          return 0;
        }
        return 0;
    }

    void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        try {
          this.field_v = 0;
          if (param4 != -9) {
            this.field_q = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "n.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 25) {
          return;
        }
        field_w = null;
        field_j = null;
        field_r = null;
        field_s = null;
    }

    String f(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (!this.field_p) {
          return null;
        }
        return this.field_z;
    }

    n(String param0, tb param1) {
        this(param0, pc.field_b.field_r, param1);
    }

    void a(int param0, n param1, int param2, byte param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.b(param0, (byte) -105, nc.field_g, param2, rf.field_X) ? 1 : 0;
          stackIn_3_0 = (var5_int != 0) ? 0 : 1;
          if (stackIn_3_0 == (this.field_p ? 1 : 0)) {
            stackIn_8_1 = (var5_int != 0);
            this.field_p = stackIn_8_1;
            if (this.field_t != null &&
              this.field_t instanceof qc) {
              ((qc) (this.field_t)).a(this, (byte) 118, var5_int != 0);
            }
          }
          if (param3 != -3) {
            this.field_z = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("n.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(20720, param2, param3, param0)) {
            this.a(param2, param0, true, param3);
          }
          var5_int = 127 / ((param1 - 0) / 49);
          stackIn_3_0 = (StringBuilder) (param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("n.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    void e(int param0) {
        if (param0 <= 15) {
          this.field_k = 102;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != -9532) {
          field_r = (uf) null;
          if (param3 == 0) {
            if (null != this.field_l) {
              this.field_l.a(true, param2, -67, this, param1);
            }
            return;
          }
          return;
        }
        if (param3 != 0) {
          return;
        }
        if (null != this.field_l) {
          this.field_l.a(true, param2, -67, this, param1);
          return;
        }
    }

    boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -108) {
            this.field_x = -39;
          }
          if (!this.b(param0, (byte) -105, param5, param2, param1)) {
            return false;
          }
          this.field_v = param6;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("n.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        String var5Lifetime1;
        var6 = HoldTheLine.field_D;
        var4 = this.d((byte) -110);
        var5_int = 0;
        while (true) {
          if (var4 < var5_int) {
            if (param0 != -81) {
              return;
            }
            var5 = qb.a(100);
            if (var5 == null) {
              return;
            }
            pc.field_b.a(7829367, var5, ac.field_e, em.field_l);
            return;
          }
          this.a(-9532, param1, param2, var5_int);
          var5_int++;
          if (var6 != 0) {
            var5Lifetime1 = qb.a(100);
            if (var5Lifetime1 == null) {
              return;
            }
            pc.field_b.a(7829367, var5Lifetime1, ac.field_e, em.field_l);
            return;
          }
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20720) {
            this.field_k = 91;
          }
          if (param1.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param1.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("n.FC(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3) {
        int var5;
        int var7;
        jd var8;
        jd var9;
        jd var10;
        jd var11;
        jd var12;
        jd var13;
        var7 = HoldTheLine.field_D;
        this.a(param0, this, param1, (byte) -3);
        var5 = this.c((byte) -20) ? 1 : 0;
        if (param2) {
          if (vg.field_T != 0 &&
            var5 != 0) {
            this.a(param0, this, vg.field_T, param1, rf.field_X, nc.field_g, -24898);
          }
          if (gg.field_J == 0) {
            if (0 == rd.field_f &&
              0 != qj.field_L) {
              this.a(nc.field_g, this, param1, param0, (byte) -9, rf.field_X);
              var8 = ig.field_q;
              if (var8 != null) {
                if (var8.field_t instanceof c) {
                  ((c) (var8.field_t)).a(var8, (byte) -3, (pg) null);
                }
                ig.field_q = null;
              }
            }
          } else {
            if (!this.a(param0, jb.field_U, param1, this, (byte) -108, lb.field_x, gg.field_J)) {
              if (var5 == 0) {
                if (0 == rd.field_f &&
                  0 != qj.field_L) {
                  this.a(nc.field_g, this, param1, param0, (byte) -9, rf.field_X);
                  var9 = ig.field_q;
                  if (var9 != null) {
                    if (!(var9.field_t instanceof c)) {
                      ig.field_q = null;
                    } else {
                      ((c) (var9.field_t)).a(var9, (byte) -3, (pg) null);
                      ig.field_q = null;
                    }
                  }
                }
                if (param3) {
                  this.a(19, 'ￚ', (byte) -73);
                }
                qj.field_L = rd.field_f;
                ba.a(this.f(0), 0);
                return param2;
              }
              this.e(47);
              if (var7 != 0) {
                param2 = false;
              }
            } else {
              param2 = false;
            }
            if (0 == rd.field_f &&
              0 != qj.field_L) {
              this.a(nc.field_g, this, param1, param0, (byte) -9, rf.field_X);
              var10 = ig.field_q;
              if (var10 != null) {
                if (var10.field_t instanceof c) {
                  ((c) (var10.field_t)).a(var10, (byte) -3, (pg) null);
                }
                ig.field_q = null;
              }
              if (param3) {
                this.a(19, 'ￚ', (byte) -73);
              }
              qj.field_L = rd.field_f;
              ba.a(this.f(0), 0);
              return param2;
            }
          }
        } else {
          if (var5 != 0 &&
            gg.field_J != 0) {
            this.e(117);
            if (var7 != 0) {
              if (vg.field_T != 0) {
                this.a(param0, this, vg.field_T, param1, rf.field_X, nc.field_g, -24898);
              }
              if (gg.field_J == 0) {
                if (0 == rd.field_f &&
                  0 != qj.field_L) {
                  this.a(nc.field_g, this, param1, param0, (byte) -9, rf.field_X);
                  var11 = ig.field_q;
                  if (var11 != null) {
                    if (var11.field_t instanceof c) {
                      ((c) (var11.field_t)).a(var11, (byte) -3, (pg) null);
                    }
                    ig.field_q = null;
                  }
                }
              } else {
                if (!this.a(param0, jb.field_U, param1, this, (byte) -108, lb.field_x, gg.field_J)) {
                  this.e(47);
                }
                param2 = false;
                if (0 == rd.field_f &&
                  0 != qj.field_L) {
                  this.a(nc.field_g, this, param1, param0, (byte) -9, rf.field_X);
                  var13 = ig.field_q;
                  if (var13 != null) {
                    if (var13.field_t instanceof c) {
                      ((c) (var13.field_t)).a(var13, (byte) -3, (pg) null);
                    }
                    ig.field_q = null;
                  }
                  if (param3) {
                    this.a(19, 'ￚ', (byte) -73);
                  }
                  qj.field_L = rd.field_f;
                  ba.a(this.f(0), 0);
                  return param2;
                }
              }
            }
          }
        }
        if (param3) {
          this.a(19, 'ￚ', (byte) -73);
        }
        qj.field_L = rd.field_f;
        ba.a(this.f(0), 0);
        return param2;
    }

    final void a(Hashtable param0, int param1, boolean param2, StringBuilder param3) {
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
        n var7 = null;
        var6 = HoldTheLine.field_D;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_o).append(" ").append(this.field_x).append("x").append(this.field_u);
          if (null != this.field_q) {
            discarded$1 = param3.append(" text=\"").append(this.field_q).append('"');
          }
          if (this.field_p) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.c((byte) -20)) {
            discarded$3 = param3.append(" focused");
          }
          if (null != this.field_l) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_l instanceof n)) {
              discarded$5 = param3.append(this.field_l);
              if (var6 != 0) {
                param3 = this.a(param1 + 1, (byte) -61, param0, param3);
              }
            } else {
              param3 = this.a(param1 + 1, (byte) -61, param0, param3);
            }
          }
          if (this.field_t != null) {
            discarded$6 = param3.append(" listener=");
            if (this.field_t instanceof n) {
              param3 = this.a(1 + param1, (byte) 106, param0, param3);
              if (var6 != 0) {
                discarded$7 = param3.append(this.field_t);
              }
            } else {
              discarded$7 = param3.append(this.field_t);
            }
          }
          if (!param2) {
            var7 = (n) null;
            this.a((n) null, 89, (byte) -105, '8');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("n.DC(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void g(int param0) {
        if (param0 < 72) {
          return;
        }
        this.a(this.field_k, (byte) 122, this.field_o, this.field_u, this.field_x);
    }

    public final String toString() {
        return this.a(0, (byte) -67, new Hashtable(), new StringBuilder()).toString();
    }

    boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -25823) {
            return false;
          }
          this.field_t = (tb) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("n.NB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -78) {
            return false;
          }
          this.field_m = 116;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("n.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected n() {
        this.field_y = 0;
        this.field_m = 0;
    }

    n(String param0, dh param1, tb param2) {
        RuntimeException runtimeException = null;
        vc var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_y = 0;
        this.field_m = 0;
        try {
          this.field_l = param1;
          this.field_t = param2;
          this.field_q = param0;
          if (this.field_l instanceof vc) {
            var4 = (vc) ((Object) this.field_l);
            this.field_x = var4.b((byte) -36, this);
            this.field_u = var4.a(this, -95);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("n.<init>(");
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
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    n(int param0, int param1, int param2, int param3, dh param4, tb param5) {
        this.field_y = 0;
        this.field_m = 0;
        try {
          this.field_k = param0;
          this.field_l = param4;
          this.field_u = param3;
          this.field_o = param1;
          this.field_t = param5;
          this.field_x = param2;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "n.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = null;
        field_n = 0L;
    }
}
