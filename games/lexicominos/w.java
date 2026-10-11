/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class w extends kd {
    vd field_r;
    boolean field_m;
    rd field_i;
    String field_q;
    static String field_s;
    String field_u;
    int field_j;
    int field_h;
    int field_v;
    int field_t;
    int field_l;
    ve field_w;
    static aj field_n;
    int field_o;
    int field_p;
    static tf field_k;

    void a(byte param0, int param1, int param2, int param3) {
        if (0 == param3) {
          if (null == this.field_i) {
            if (param0 != -115) {
              this.field_m = true;
              return;
            }
            return;
          }
          this.field_i.a(param1, param2, true, this, -3284);
        }
        if (param0 == -115) {
          return;
        }
        this.field_m = true;
    }

    void c(byte param0) {
        if (param0 > -35) {
          this.a(32, 106, 108, 27, (byte) 23);
        }
    }

    w(String param0, vd param1) {
        this(param0, nb.field_z.field_m, param1);
    }

    boolean a(int param0, int param1, int param2, int param3, w param4, int param5, int param6) {
        RuntimeException var8 = null;
        w var9 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 == -29771) {
            return false;
          }
          var9 = (w) null;
          this.a('C', -2, (w) null, (byte) 78);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("w.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void d(int param0) {
        this.a(this.field_v, this.field_j, true, this.field_o, this.field_t);
        if (param0 <= 50) {
          this.a(122, -95, -112);
        }
    }

    boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 114 / ((-13 - param3) / 55);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("w.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (param0 != 86) {
          return true;
        }
        if (this.a(18337)) {
          if (this.a(param1, param2, this, (byte) 67)) {
            return true;
          }
          var4 = param2;
          if (var4 == 80) {
            return this.a((byte) 44, this);
          }
          return false;
        }
        var4Lifetime1 = param2;
        if (var4Lifetime1 == 80) {
          return this.a((byte) 44, this);
        }
        return false;
    }

    int c(int param0) {
        if (param0 != 15508) {
          this.field_j = -116;
          return 0;
        }
        return 0;
    }

    boolean a(int param0) {
        if (param0 != 18337) {
          return true;
        }
        return false;
    }

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 44) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("w.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    void a(int param0, int param1, boolean param2, int param3, int param4) {
        this.field_v = param0;
        this.field_o = param3;
        this.field_t = param4;
        if (param2) {
          this.field_j = param1;
          return;
        }
        this.a((byte) 120, ' ', 77);
        this.field_j = param1;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), -15992).toString();
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4) {
        boolean stackIn_18_0 = false;
        if (param4 >= -41) {
          this.field_i = (rd) null;
          if (this.field_t + param2 > param1) {
            return false;
          }
          if (param0 < param3 + this.field_o) {
            return false;
          }
          if (param1 >= this.field_j + (param2 + this.field_t)) {
            return false;
          }
          if (param0 >= param3 + this.field_o + this.field_v) {
            return false;
          }
          return true;
        }
        if (this.field_t + param2 > param1) {
          return false;
        }
        if (param0 < param3 + this.field_o) {
          return false;
        }
        stackIn_18_0 = (param1 < this.field_j + (param2 + this.field_t)) && (param0 < param3 + this.field_o + this.field_v);
        return stackIn_18_0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_t).append(",").append(this.field_o).append(" ").append(this.field_j).append("x").append(this.field_v);
          if (param1 != 0) {
            this.a((byte) -92, -24, -44, 91);
          }
          if (this.field_u != null) {
            discarded$1 = param0.append(" text=\"").append(this.field_u).append('"');
          }
          if (this.field_m) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.a(param1 ^ 18337)) {
            discarded$3 = param0.append(" focused");
          }
          if (null != this.field_i) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_i instanceof w)) {
              discarded$5 = param0.append(this.field_i);
              if (var6 != 0) {
                param0 = this.a(param2 + 1, param3, param0, -15992);
              }
            } else {
              param0 = this.a(param2 + 1, param3, param0, -15992);
            }
          }
          if (null != this.field_r) {
            discarded$6 = param0.append(" listener=");
            if (this.field_r instanceof w) {
              param0 = this.a(param2 + 1, param3, param0, -15992);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param0.append(this.field_r);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("w.VB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 7373) {
            return false;
          }
          if (!param2.containsKey(this)) {
            param2.put(this, this);
            return true;
          }
          discarded$1 = param1.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("w.AC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_k = null;
        field_s = null;
        field_n = null;
        if (param0) {
          w.c(true);
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(sh.field_e, bk.field_b, param3, param2, (byte) -65) ? 1 : 0;
          stackIn_3_0 = (this.field_m) ? 0 : 1;
          if (stackIn_3_0 == var5_int) {
            stackIn_8_1 = (var5_int != 0);
            this.field_m = stackIn_8_1;
            if (this.field_r != null &&
              this.field_r instanceof gh) {
              ((gh) (this.field_r)).a(this, var5_int != 0, param0 ^ 32220);
            }
          }
          if (param0 != -119) {
            this.b(-47);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("w.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
          if (this.a(param3 ^ -8891, param2, param1, param0)) {
            this.a(param2, 0, param0, param1);
          }
          if (param3 == -15992) {
            stackIn_7_0 = (StringBuilder) (param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("w.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 < 19) {
          return;
        }
        var4 = this.c(15508);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a((byte) -115, param2, param1, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = eb.c((byte) 123);
        if (var5 != null) {
          nb.field_z.a(7829367, vf.field_r, var5, bf.field_g);
        }
    }

    void a(w param0, int param1, int param2, int param3, int param4, int param5) {
        try {
          this.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "w.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param6, param5, param4, (byte) -54)) {
            this.field_h = param1;
          }
          if (param0 == -4808) {
            return false;
          }
          this.field_m = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("w.VA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, byte param3) {
        int var5;
        hh var6;
        int var7;
        hh var8;
        hh var9;
        hh var10;
        hh var11;
        hh var12;
        hh var13;
        hh var6Lifetime1;
        hh var6Lifetime2;
        var7 = Lexicominos.field_L ? 1 : 0;
        if (param3 != 124) {
          return true;
        }
        this.a((byte) -119, this, param2, param0);
        var5 = this.a(18337) ? 1 : 0;
        if (!param1) {
          if (var5 == 0) {
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
          if (nk.field_z == 0) {
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
          this.c((byte) -122);
          if (var7 == 0) {
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
        }
        if (0 != gd.field_l) {
          if (var5 == 0) {
            if (0 == nk.field_z) {
              if (0 == ul.field_o &&
                0 != pg.field_f) {
                this.a(this, bk.field_b, param2, 0, param0, sh.field_e);
                var8 = si.field_t;
                var6 = var8;
                if (var8 != null) {
                  if (var8.field_r instanceof wk) {
                    ((wk) (var8.field_r)).a(16797, (l) null, var8);
                  }
                  si.field_t = null;
                }
              }
              pg.field_f = ul.field_o;
              sj.a(0, this.b(param3 - 2));
              return param1;
            }
            if (this.a(-4808, nk.field_z, this, ck.field_a, param2, param0, ef.field_a)) {
              param1 = false;
            } else {
            }
            if (0 != ul.field_o) {
              pg.field_f = ul.field_o;
              sj.a(0, this.b(param3 - 2));
              return param1;
            }
            if (0 == pg.field_f) {
              pg.field_f = ul.field_o;
              sj.a(0, this.b(param3 - 2));
              return param1;
            }
            this.a(this, bk.field_b, param2, 0, param0, sh.field_e);
            var10 = si.field_t;
            var6Lifetime2 = var10;
            if (var10 != null) {
              if (var10.field_r instanceof wk) {
                ((wk) (var10.field_r)).a(16797, (l) null, var10);
              }
              si.field_t = null;
            }
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
          this.a(bk.field_b, param0, sh.field_e, param2, this, -29771, gd.field_l);
        }
        if (0 == nk.field_z) {
          if (0 != ul.field_o) {
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
          if (0 == pg.field_f) {
            pg.field_f = ul.field_o;
            sj.a(0, this.b(param3 - 2));
            return param1;
          }
          this.a(this, bk.field_b, param2, 0, param0, sh.field_e);
          var11 = si.field_t;
          var6Lifetime1 = var11;
          if (var11 != null) {
            if (var11.field_r instanceof wk) {
              ((wk) (var11.field_r)).a(16797, (l) null, var11);
            }
            si.field_t = null;
          }
          pg.field_f = ul.field_o;
          sj.a(0, this.b(param3 - 2));
          return param1;
        }
        if (this.a(-4808, nk.field_z, this, ck.field_a, param2, param0, ef.field_a)) {
          param1 = false;
        } else {
          if (var5 != 0) {
            this.c((byte) -88);
            if (var7 != 0) {
              param1 = false;
              if (0 != ul.field_o) {
                pg.field_f = ul.field_o;
                sj.a(0, this.b(param3 - 2));
                return param1;
              }
              if (0 == pg.field_f) {
                pg.field_f = ul.field_o;
                sj.a(0, this.b(param3 - 2));
                return param1;
              }
              this.a(this, bk.field_b, param2, 0, param0, sh.field_e);
              var12 = si.field_t;
              if (var12 != null) {
                if (var12.field_r instanceof wk) {
                  ((wk) (var12.field_r)).a(16797, (l) null, var12);
                }
                si.field_t = null;
              }
              pg.field_f = ul.field_o;
              sj.a(0, this.b(param3 - 2));
              return param1;
            }
          }
        }
        if (0 != ul.field_o) {
          pg.field_f = ul.field_o;
          sj.a(0, this.b(param3 - 2));
          return param1;
        }
        if (0 == pg.field_f) {
          pg.field_f = ul.field_o;
          sj.a(0, this.b(param3 - 2));
          return param1;
        }
        this.a(this, bk.field_b, param2, 0, param0, sh.field_e);
        var13 = si.field_t;
        if (var13 != null) {
          if (var13.field_r instanceof wk) {
            ((wk) (var13.field_r)).a(16797, (l) null, var13);
          }
          si.field_t = null;
        }
        pg.field_f = ul.field_o;
        sj.a(0, this.b(param3 - 2));
        return param1;
    }

    String b(int param0) {
        if (param0 < 121) {
          return (String) null;
        }
        if (!this.field_m) {
          return null;
        }
        return this.field_q;
    }

    protected w() {
        this.field_p = 0;
        this.field_l = 0;
    }

    w(String param0, rd param1, vd param2) {
        ub var4 = null;
        this.field_p = 0;
        this.field_l = 0;
        try {
          this.field_u = param0;
          this.field_i = param1;
          this.field_r = param2;
          if (this.field_i instanceof ub) {
            var4 = (ub) ((Object) this.field_i);
            this.field_j = var4.b(8089, this);
            this.field_v = var4.a(-13293, this);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    w(int param0, int param1, int param2, int param3, rd param4, vd param5) {
        this.field_p = 0;
        this.field_l = 0;
        try {
          this.field_i = param4;
          this.field_j = param2;
          this.field_r = param5;
          this.field_o = param1;
          this.field_v = param3;
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "w.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Orb points: <%0>";
        field_n = new aj(12, 0, 1, 0);
        field_k = new tf();
    }
}
