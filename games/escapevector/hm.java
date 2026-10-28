/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hm extends IntrusiveNode {
    wn field_q;
    boolean field_u;
    pg field_p;
    int field_j;
    String field_l;
    int field_x;
    db field_s;
    int field_n;
    int field_t;
    int field_k;
    static String field_m;
    int field_g;
    static String field_r;
    static pf field_o;
    static int[] field_h;
    static int[] field_w;
    String field_i;
    int field_v;

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 < 57) {
          return false;
        }
        if (param0 < this.field_k + param2) {
          return false;
        }
        if (param4 + this.field_j > param1) {
          return false;
        }
        if (this.field_k + (param2 + this.field_g) <= param0) {
          return false;
        }
        if (this.field_x + (param4 + this.field_j) > param1) {
          return true;
        }
        return false;
    }

    final boolean a(char param0, int param1, byte param2) {
        if (!this.h(0)) {
          int var4 = param1;
          if (var4 == 80) {
            return this.a(-4659, this);
          }
          if (param2 < -106) {
            return false;
          }
          this.a(44, -93, 57, (byte) 126, 65);
          return false;
        }
        if (this.a(this, param0, param1, 23)) {
          return true;
        }
        int var4Lifetime1 = param1;
        if (var4Lifetime1 == 80) {
          return this.a(-4659, this);
        }
        if (param2 < -106) {
          return false;
        }
        this.a(44, -93, 57, (byte) 126, 65);
        return false;
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var7 = EscapeVector.obfuscationControl;
        this.a(-14472, param3, param2, this);
        if (param1 == -33) {
          boolean var5 = (this.h(0));
          if (!param0) {
            if (var5 &&
              0 != qi.field_N) {
              this.f(84);
            }
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          if (mg.field_f != 0 &&
            var5) {
            this.b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, this, param2);
          }
          if (qi.field_N == 0) {
            if (0 != eb.field_K) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            if (bb.field_H == 0) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
            ni var9 = gf.field_b;
            if (var9 != null) {
              if (var9.field_q instanceof mk) {
                ((mk) (var9.field_q)).a((qa) null, var9, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5 &&
              0 != qi.field_N) {
              this.f(84);
            }
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          regionExit1: {
            if (this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, this, qi.field_N)) {
              param0 = false;
              if (var7 == 0) {
                break regionExit1;
              }
            }
            if (!var5) {
              if (0 != eb.field_K) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              if (bb.field_H == 0) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
              ni var10 = gf.field_b;
              if (var10 != null) {
                if (!(var10.field_q instanceof mk)) {
                  gf.field_b = null;
                } else {
                  ((mk) (var10.field_q)).a((qa) null, var10, (byte) -124);
                  gf.field_b = null;
                }
              }
              if (var7 != 0 &&
                var5 &&
                0 != qi.field_N) {
                this.f(84);
              }
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.f(122);
          }
          if (0 != eb.field_K) {
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          if (bb.field_H == 0) {
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
          ni var11 = gf.field_b;
          if (var11 != null) {
            if (var11.field_q instanceof mk) {
              ((mk) (var11.field_q)).a((qa) null, var11, (byte) -124);
            }
            gf.field_b = null;
          }
          if (var7 != 0 &&
            var5 &&
            0 != qi.field_N) {
            this.f(84);
          }
          bb.field_H = eb.field_K;
          ve.a((byte) -112, this.d(1));
          return param0;
        }
        hm var8 = (hm) null;
        this.a(1, (hm) null);
        boolean var5Lifetime1 = (this.h(0));
        if (param0) {
          if (mg.field_f == 0) {
            if (qi.field_N == 0) {
              if (0 != eb.field_K) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              if (bb.field_H == 0) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
              ni var12 = gf.field_b;
              if (var12 != null) {
                if (var12.field_q instanceof mk) {
                  ((mk) (var12.field_q)).a((qa) null, var12, (byte) -124);
                }
                gf.field_b = null;
              }
              if (var7 != 0 &&
                var5Lifetime1 &&
                0 != qi.field_N) {
                this.f(84);
              }
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            regionExit2: {
              if (this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, this, qi.field_N)) {
                param0 = false;
                if (var7 == 0) {
                  break regionExit2;
                }
              }
              if (!var5Lifetime1) {
                if (0 != eb.field_K) {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
                if (bb.field_H == 0) {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
                this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
                ni var13 = gf.field_b;
                if (var13 != null) {
                  if (!(var13.field_q instanceof mk)) {
                    gf.field_b = null;
                  } else {
                    ((mk) (var13.field_q)).a((qa) null, var13, (byte) -124);
                    gf.field_b = null;
                  }
                }
                if (var7 != 0 &&
                  var5Lifetime1 &&
                  0 != qi.field_N) {
                  this.f(84);
                }
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              this.f(122);
            }
            if (0 != eb.field_K) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            if (bb.field_H == 0) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
            ni var14 = gf.field_b;
            if (var14 != null) {
              if (var14.field_q instanceof mk) {
                ((mk) (var14.field_q)).a((qa) null, var14, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.f(84);
            }
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          if (var5Lifetime1) {
            this.b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, this, param2);
          }
          if (qi.field_N == 0) {
            if (0 != eb.field_K) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            if (bb.field_H == 0) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
            ni var15 = gf.field_b;
            if (var15 != null) {
              if (var15.field_q instanceof mk) {
                ((mk) (var15.field_q)).a((qa) null, var15, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.f(84);
            }
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
          regionExit3: {
            if (this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, this, qi.field_N)) {
              param0 = false;
              if (var7 == 0) {
                break regionExit3;
              }
            }
            if (!var5Lifetime1) {
              if (0 != eb.field_K) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              if (bb.field_H == 0) {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
              ni var16 = gf.field_b;
              if (var16 == null) {
                if (var7 == 0) {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              if (!(var16.field_q instanceof mk)) {
                gf.field_b = null;
                if (var7 != 0 &&
                  var5Lifetime1 &&
                  0 != qi.field_N) {
                  this.f(84);
                }
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
              ((mk) (var16.field_q)).a((qa) null, var16, (byte) -124);
              gf.field_b = null;
              if (var7 != 0 &&
                var5Lifetime1 &&
                0 != qi.field_N) {
                this.f(84);
              }
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.f(122);
          }
          if (0 == eb.field_K) {
            if (bb.field_H == 0) {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
            this.a(bj.field_y, param2, dh.field_d, param3, this, (byte) -113);
            ni var17 = gf.field_b;
            if (var17 != null) {
              if (var17.field_q instanceof mk) {
                ((mk) (var17.field_q)).a((qa) null, var17, (byte) -124);
              }
              gf.field_b = null;
            }
            if (var7 != 0 &&
              var5Lifetime1 &&
              0 != qi.field_N) {
              this.f(84);
            }
            bb.field_H = eb.field_K;
            ve.a((byte) -112, this.d(1));
            return param0;
          }
        } else if (var5Lifetime1 &&
          0 != qi.field_N) {
          this.f(84);
          bb.field_H = eb.field_K;
          ve.a((byte) -112, this.d(1));
          return param0;
        }
        bb.field_H = eb.field_K;
        ve.a((byte) -112, this.d(1));
        return param0;
    }

    final void i(int param0) {
        this.a(this.field_g, this.field_j, this.field_k, true, this.field_x);
        if (param0 != 0) {
          this.field_u = true;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var7 = EscapeVector.obfuscationControl;
        int var4 = this.e(12050);
        int var5_int = -73 / ((8 - param2) / 59);
        int var6 = 0;
        while (var4 >= var6) {
          this.a(param1, (byte) 88, var6, param0);
          var6++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        String var5 = eo.a((byte) 46);
        if (var5 != null) {
          mb.field_g.a((byte) -44, var5, ni.field_O, ci.field_g);
        }
    }

    boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_7_2 = null;
        try {
          if (param2 < -103) {
            return false;
          }
          field_r = (String) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var8;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
          int var7_int = -66 / ((-39 - param5) / 45);
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hm.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    hm(String param0, wn param1) {
        this(param0, mb.field_g.field_i, param1);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param0 != 0) {
            this.field_t = 15;
          }
          if (this.a(param3, param1, param2, false)) {
            this.a(param1, param2, param3, param0 + 1);
          }
          StringBuilder stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, hm param1) {
        String stackIn_7_2 = null;
        try {
          if (param0 == -4659) {
            return false;
          }
          this.h(1);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var3;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_o = null;
        if (param0 == 58) {
          field_r = null;
          field_m = null;
          field_h = null;
          field_w = null;
          return;
        }
        hm.g(80);
        field_r = null;
        field_m = null;
        field_h = null;
        field_w = null;
    }

    void f(int param0) {
        if (param0 <= 46) {
          this.toString();
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        String stackIn_8_2 = null;
        try {
          if (param3 >= 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("hm.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    int e(int param0) {
        if (param0 != 12050) {
          this.field_q = (wn) null;
          return 0;
        }
        return 0;
    }

    String d(int param0) {
        if (param0 != 1) {
          return (String) null;
        }
        if (!this.field_u) {
          return null;
        }
        return this.field_i;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 85) {
          field_r = (String) null;
          if (param2 != 0) {
            return;
          }
          if (this.field_s != null) {
            this.field_s.a(param3, param0, -88, this, true);
            return;
          }
          return;
        }
        if (param2 != 0) {
          return;
        }
        if (this.field_s != null) {
          this.field_s.a(param3, param0, -88, this, true);
          return;
        }
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$5 = null;
        String stackIn_23_2 = null;
        String stackIn_26_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          StringBuilder discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_j).append(" ").append(this.field_g).append("x").append(this.field_x);
          if (null != this.field_l) {
            StringBuilder discarded$1 = param1.append(" text=\"").append(this.field_l).append('"');
          }
          if (this.field_u) {
            StringBuilder discarded$2 = param1.append(" mouseover");
          }
          if (this.h(param3 ^ param3)) {
            StringBuilder discarded$3 = param1.append(" focused");
          }
          if (null != this.field_s) {
            StringBuilder discarded$4 = param1.append(" renderer=");
            if (this.field_s instanceof hm) {
              param1 = this.a(0, param0, param1, 1 + param2);
              if (var6 != 0) {
                discarded$5 = param1.append(this.field_s);
              }
            } else {
              discarded$5 = param1.append(this.field_s);
            }
          }
          if (null != this.field_q) {
            StringBuilder discarded$6 = param1.append(" listener=");
            if (!(this.field_q instanceof hm)) {
              StringBuilder discarded$7 = param1.append(this.field_q);
              if (var6 != 0) {
                param1 = this.a(param3 - 1, param0, param1, 1 + param2);
              }
            } else {
              param1 = this.a(param3 - 1, param0, param1, 1 + param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var5;
          StringBuilder stackIn_22_1 = new StringBuilder().append("hm.HB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, boolean param3) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (param3) {
            this.toString();
          }
          if (!param1.containsKey(this)) {
            param1.put(this, this);
            return true;
          }
          StringBuilder discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean h(int param0) {
        if (param0 != 0) {
          return true;
        }
        return false;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_10_2 = null;
        try {
          if (this.a(param1, param3, param4, (byte) 105, param0)) {
            this.field_t = param6;
          }
          if (param2 != 3) {
            this.f(99);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var8;
          StringBuilder stackIn_9_1 = new StringBuilder().append("hm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        if (param3) {
          this.field_k = param2;
          this.field_x = param4;
          this.field_j = param1;
          this.field_g = param0;
          return;
        }
        hm var7 = (hm) null;
        this.a(-63, -124, (byte) 29, -14, 125, (hm) null, -5);
        this.field_k = param2;
        this.field_x = param4;
        this.field_j = param1;
        this.field_g = param0;
    }

    void a(int param0, int param1, int param2, hm param3) {
        int stackIn_5_1 = 0;
        String stackIn_18_2 = null;
        try {
          if (param0 != -14472) {
            return;
          }
          boolean var5_int = (this.a(dh.field_d, bj.field_y, param2, (byte) 70, param1));
          boolean stackIn_4_0 = this.field_u;
          stackIn_5_1 = ((var5_int)) ? (0) : (1);
          if ((stackIn_4_0 ? 1 : 0) == stackIn_5_1) {
            boolean stackIn_10_1 = ((var5_int));
            this.field_u = stackIn_10_1;
            if (this.field_q != null) {
              if (!(this.field_q instanceof nj)) {
                return;
              }
              ((nj) (this.field_q)).a(this, -27200, (var5_int));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("hm.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        if (param0 != 11187) {
          return false;
        }
        return IsaacRandom.field_d == null ? rk.field_b : true;
    }

    protected hm() {
        this.field_n = 0;
        this.field_v = 0;
    }

    hm(String param0, db param1, wn param2) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        this.field_n = 0;
        this.field_v = 0;
        try {
          this.field_s = param1;
          this.field_q = param2;
          this.field_l = param0;
          if (this.field_s instanceof ao) {
            ao var4 = (ao) ((Object) this.field_s);
            this.field_g = var4.a((byte) -46, this);
            this.field_x = var4.a(-127, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("hm.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    hm(int param0, int param1, int param2, int param3, db param4, wn param5) {
        this.field_n = 0;
        this.field_v = 0;
        try {
          this.field_g = param2;
          this.field_k = param0;
          this.field_s = param4;
          this.field_q = param5;
          this.field_j = param1;
          this.field_x = param3;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Suggested names: ";
        field_r = "FROM ONLY";
        field_w = new int[8192];
        field_h = new int[8192];
    }
}
