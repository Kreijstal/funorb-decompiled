/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends pg {
    int field_t;
    static String field_l;
    String field_q;
    pf field_r;
    int field_h;
    int field_n;
    String field_g;
    int field_v;
    kh field_s;
    int field_j;
    static int field_u;
    static String field_p;
    wc field_o;
    boolean field_w;
    int field_k;
    static String field_m;
    int field_i;

    void a(byte param0, int param1, int param2, int param3) {
        if (param0 > -52) {
          return;
        }
        if (0 != param2) {
          return;
        }
        if (this.field_r != null) {
          this.field_r.a(this, 5592405, param1, param3, true);
          return;
        }
    }

    final boolean a(StringBuilder param0, byte param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -90) {
            this.a('ﾬ', (byte) 20, -10);
          }
          if (param2.containsKey(this)) {
            discarded$1 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param2.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qm.HB(");
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
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            qm.f((byte) -21);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean a(byte param0, int param1, int param2, int param3, int param4) {
        boolean stackIn_18_0 = false;
        if (param0 != -47) {
          this.field_j = -27;
          if (param4 < param3 + this.field_n) {
            return false;
          }
          if (param1 + this.field_j > param2) {
            return false;
          }
          if (param4 >= param3 + (this.field_n + this.field_v)) {
            return false;
          }
          if (param2 >= param1 + this.field_j + this.field_k) {
            return false;
          }
          return true;
        }
        if (param4 < param3 + this.field_n) {
          return false;
        }
        if (param1 + this.field_j > param2) {
          return false;
        }
        stackIn_18_0 = (param4 < param3 + (this.field_n + this.field_v)) && (param2 < param1 + this.field_j + this.field_k);
        return stackIn_18_0;
    }

    int c(int param0) {
        if (param0 != 0) {
          return -80;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = param0;
        this.field_v = param2;
        this.field_j = param1;
        this.field_n = param3;
        if (param4 >= -49) {
          field_p = (String) null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = this.c(0);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a((byte) -99, param0, var5_int, param2);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = sk.a(-14150);
        if (!param1) {
          return;
        }
        if (var5 != null) {
          io.field_n.a(var5, (byte) 60, ka.field_p, mo.field_p);
        }
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          this.field_w = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_p = null;
        field_m = null;
        if (param0 != -17) {
          return;
        }
        field_l = null;
    }

    boolean d(int param0) {
        if (param0 != -2116) {
          this.c(8);
          return false;
        }
        return false;
    }

    final void e(byte param0) {
        if (param0 > 44) {
          this.a(this.field_k, this.field_j, this.field_v, this.field_n, -114);
          return;
        }
        Hashtable var3 = (Hashtable) null;
        this.a((StringBuilder) null, -107, (Hashtable) null, (byte) 106);
        this.a(this.field_k, this.field_j, this.field_v, this.field_n, -114);
    }

    final boolean a(char param0, byte param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.d(-2116)) {
          if (this.a(this, (byte) -123, param0, param2)) {
            return true;
          }
          var4 = param2;
          if (var4 != 80) {
            var4 = 123 % ((87 - param1) / 35);
            return false;
          }
          return this.a(0, this);
        }
        var4Lifetime1 = param2;
        if (var4Lifetime1 != 80) {
          var4Lifetime1 = 123 % ((87 - param1) / 35);
          return false;
        }
        return this.a(0, this);
    }

    final boolean a(int param0, int param1, boolean param2, byte param3) {
        int var5;
        int var7;
        se var8;
        se var9;
        se var10;
        se var11;
        se var12;
        se var13;
        se var14;
        se var15;
        se var16;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 >= -75) {
          return false;
        }
        this.a(this, param0, 170, param1);
        var5 = this.d(-2116) ? 1 : 0;
        if (!param2) {
          if (var5 != 0 &&
            re.field_r != 0) {
            this.d((byte) 29);
          }
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        if (wn.field_y == 0) {
          if (0 == re.field_r) {
            if (0 == wk.field_m &&
              la.field_f != 0) {
              this.a(me.field_I, -20592, an.field_g, param1, param0, this);
              var8 = so.field_i;
              if (var8 != null) {
                if (var8.field_o instanceof em) {
                  ((em) (var8.field_o)).a(var8, (byte) 71, (q) null);
                }
                so.field_i = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                re.field_r != 0) {
                this.d((byte) 29);
              }
            }
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          if (!this.a(ja.field_s, re.field_r, this, param1, 10, pb.field_h, param0)) {
            if (var5 == 0) {
              if (0 == wk.field_m &&
                la.field_f != 0) {
                this.a(me.field_I, -20592, an.field_g, param1, param0, this);
                var9 = so.field_i;
                if (var9 != null) {
                  if (!(var9.field_o instanceof em)) {
                    so.field_i = null;
                  } else {
                    ((em) (var9.field_o)).a(var9, (byte) 71, (q) null);
                    so.field_i = null;
                  }
                }
                if (var7 != 0 &&
                  var5 != 0 &&
                  re.field_r != 0) {
                  this.d((byte) 29);
                }
              }
              la.field_f = wk.field_m;
              qg.a(38, this.b(false));
              return param2;
            }
            this.d((byte) 29);
            if (var7 != 0) {
              param2 = false;
            }
          } else {
            param2 = false;
          }
          if (0 != wk.field_m) {
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          if (la.field_f == 0) {
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          this.a(me.field_I, -20592, an.field_g, param1, param0, this);
          var10 = so.field_i;
          if (var10 != null) {
            if (var10.field_o instanceof em) {
              ((em) (var10.field_o)).a(var10, (byte) 71, (q) null);
            }
            so.field_i = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            re.field_r != 0) {
            this.d((byte) 29);
          }
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        if (var5 == 0) {
          if (0 == re.field_r) {
            if (0 == wk.field_m &&
              la.field_f != 0) {
              this.a(me.field_I, -20592, an.field_g, param1, param0, this);
              var11 = so.field_i;
              if (var11 != null) {
                if (var11.field_o instanceof em) {
                  ((em) (var11.field_o)).a(var11, (byte) 71, (q) null);
                }
                so.field_i = null;
              }
              if (var7 != 0 &&
                var5 != 0 &&
                re.field_r != 0) {
                this.d((byte) 29);
              }
            }
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          if (!this.a(ja.field_s, re.field_r, this, param1, 10, pb.field_h, param0)) {
            if (0 == wk.field_m &&
              la.field_f != 0) {
              this.a(me.field_I, -20592, an.field_g, param1, param0, this);
              var12 = so.field_i;
              if (var12 != null) {
                if (!(var12.field_o instanceof em)) {
                  so.field_i = null;
                } else {
                  ((em) (var12.field_o)).a(var12, (byte) 71, (q) null);
                  so.field_i = null;
                }
              }
              if (var7 != 0 &&
                var5 != 0 &&
                re.field_r != 0) {
                this.d((byte) 29);
              }
            }
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          param2 = false;
          if (0 != wk.field_m) {
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          if (la.field_f == 0) {
            la.field_f = wk.field_m;
            qg.a(38, this.b(false));
            return param2;
          }
          this.a(me.field_I, -20592, an.field_g, param1, param0, this);
          var13 = so.field_i;
          if (var13 != null) {
            if (var13.field_o instanceof em) {
              ((em) (var13.field_o)).a(var13, (byte) 71, (q) null);
            }
            so.field_i = null;
          }
          if (var7 != 0 &&
            var5 != 0 &&
            re.field_r != 0) {
            this.d((byte) 29);
          }
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        this.a(param1, param0, an.field_g, me.field_I, wn.field_y, 0, this);
        if (0 == re.field_r) {
          if (0 == wk.field_m &&
            la.field_f != 0) {
            this.a(me.field_I, -20592, an.field_g, param1, param0, this);
            var14 = so.field_i;
            if (var14 != null) {
              if (var14.field_o instanceof em) {
                ((em) (var14.field_o)).a(var14, (byte) 71, (q) null);
              }
              so.field_i = null;
            }
            if (var7 != 0 &&
              var5 != 0 &&
              re.field_r != 0) {
              this.d((byte) 29);
            }
          }
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        if (!this.a(ja.field_s, re.field_r, this, param1, 10, pb.field_h, param0)) {
          this.d((byte) 29);
          if (var7 != 0) {
            param2 = false;
          }
        } else {
          param2 = false;
        }
        if (0 != wk.field_m) {
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        if (la.field_f == 0) {
          la.field_f = wk.field_m;
          qg.a(38, this.b(false));
          return param2;
        }
        this.a(me.field_I, -20592, an.field_g, param1, param0, this);
        var16 = so.field_i;
        if (var16 != null) {
          if (var16.field_o instanceof em) {
            ((em) (var16.field_o)).a(var16, (byte) 71, (q) null);
          }
          so.field_i = null;
        }
        if (var7 != 0 &&
          var5 != 0 &&
          re.field_r != 0) {
          this.d((byte) 29);
        }
        la.field_f = wk.field_m;
        qg.a(38, this.b(false));
        return param2;
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -120) {
            return false;
          }
          this.field_o = (wc) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qm.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        try {
          if (param1 != -20592) {
            this.field_q = (String) null;
          }
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void d(byte param0) {
        if (param0 != 29) {
          this.a((byte) -10, 57, 127, -111);
        }
    }

    StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
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
          if (this.a(param0, (byte) -90, param2, param1)) {
            this.a(param0, param1, param2, 1);
          }
          var5_int = -122 % ((param3 - 50) / 60);
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qm.FA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(new StringBuilder(), 0, new Hashtable(), (byte) -32).toString();
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -47, param3, param0, param6, param5)) {
            this.field_t = param1;
          }
          var8_int = 106 % ((param4 + 42) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(StringBuilder param0, int param1, Hashtable param2, int param3) {
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_n).append(",").append(this.field_j).append(" ").append(this.field_v).append("x").append(this.field_k);
          if (null != this.field_g) {
            discarded$1 = param0.append(" text=\"").append(this.field_g).append('"');
          }
          if (this.field_w) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.d(param3 - 2117)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_r) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_r instanceof qm)) {
              discarded$5 = param0.append(this.field_r);
              if (var6 != 0) {
                param0 = this.a(param0, param1 + 1, param2, (byte) 117);
              }
            } else {
              param0 = this.a(param0, param1 + 1, param2, (byte) 117);
            }
          }
          if (this.field_o != null) {
            discarded$6 = param0.append(" listener=");
            if (this.field_o instanceof qm) {
              param0 = this.a(param0, 1 + param1, param2, (byte) -77);
              if (var6 != 0) {
                discarded$7 = param0.append(this.field_o);
              }
            } else {
              discarded$7 = param0.append(this.field_o);
            }
          }
          if (param3 != 1) {
            this.a(-66, 16, 33, 3, 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("qm.DB(");
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
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    String b(boolean param0) {
        if (param0) {
          this.a('ﾗ', (byte) 86, -60);
          if (this.field_w) {
            return this.field_q;
          }
          return null;
        }
        if (this.field_w) {
          return this.field_q;
        }
        return null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a((byte) -47, param3, me.field_I, param1, an.field_g) ? 1 : 0;
          if (param2 != 170) {
            field_p = (String) null;
          }
          stackIn_4_0 = var5_int;
          if (this.field_w) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_10_1 = (var5_int != 0);
            this.field_w = stackIn_10_1;
            if (null != this.field_o) {
              if (!(this.field_o instanceof l)) {
                return;
              }
              ((l) (this.field_o)).a(53, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qm.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
          fj.a((java.awt.Component) ((Object) param0), 115);
          so.a((java.awt.Component) ((Object) param0), 0);
          if (null != nh.field_w) {
            nh.field_w.a((java.awt.Component) ((Object) param0), (byte) -22);
          }
          int var2_int = 17 / ((-7 - param1) / 49);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.KB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qm(String param0, wc param1) {
        this(param0, io.field_n.field_r, param1);
    }

    protected qm() {
        this.field_h = 0;
        this.field_i = 0;
    }

    qm(String param0, pf param1, wc param2) {
        ac var4 = null;
        this.field_h = 0;
        this.field_i = 0;
        try {
          this.field_o = param2;
          this.field_g = param0;
          this.field_r = param1;
          if (this.field_r instanceof ac) {
            var4 = (ac) ((Object) this.field_r);
            this.field_v = var4.a((byte) 124, this);
            this.field_k = var4.b(this, 1);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    qm(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        this.field_h = 0;
        this.field_i = 0;
        try {
          this.field_n = param0;
          this.field_k = param3;
          this.field_v = param2;
          this.field_r = param4;
          this.field_j = param1;
          this.field_o = param5;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Jumping:";
        field_p = "<%0> is not a member, and cannot play with the current options.";
        field_m = "Public";
    }
}
