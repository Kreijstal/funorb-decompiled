/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class el extends hf {
    int field_h;
    int field_r;
    dk field_w;
    int field_m;
    boolean field_l;
    String field_s;
    static int field_t;
    dh field_q;
    int field_v;
    int field_f;
    int field_k;
    int field_n;
    bb field_u;
    String field_j;
    static tf field_p;
    static int field_i;
    static gh field_o;
    static int field_g;

    final boolean a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!this.e((byte) 54)) {
            var4 = 71 / ((param0 + 40) / 63);
            var5 = param2;
            if (var5 != 80) {
                return false;
            }
            return this.a((byte) -75, this);
        }
        if (this.a(param2, 13, param1, this)) {
            return true;
        }
        var4 = 71 / ((param0 + 40) / 63);
        var5 = param2;
        if (var5 != 80) {
            return false;
        }
        return this.a((byte) -75, this);
    }

    public static void b(int param0) {
        if (param0 != -5927) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        if (param3 != 0) {
            var5 = 35 % ((1 - param2) / 43);
            return;
        }
        if (null != this.field_q) {
            this.field_q.a(param0, -81, param1, true, this);
            var5 = 35 % ((1 - param2) / 43);
            return;
        }
        var5 = 35 % ((1 - param2) / 43);
    }

    int d(byte param0) {
        if (param0 < 82) {
            field_p = (tf) null;
            return 0;
        }
        return 0;
    }

    public final String toString() {
        return this.a(0, new StringBuilder(), new Hashtable(), 0).toString();
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 13) {
            return false;
          }
          this.field_u = (bb) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("el.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(boolean param0, int param1, el param2, int param3) {
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
          if (param0) {
            return;
          }
          var5_int = this.a(qa.field_a, -1, ue.field_e, param1, param3) ? 1 : 0;
          stackIn_4_0 = var5_int;
          if (this.field_l) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_10_1 = !(var5_int == 0);
            this.field_l = stackIn_10_1;
            if (this.field_u != null) {
              if (!(this.field_u instanceof lg)) {
                return;
              }
              ((lg) ((Object) this.field_u)).a(53, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("el.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
            return true;
        }
        if (param0 < this.field_v + param4) {
            return false;
        }
        if (param2 < this.field_m + param3) {
            return false;
        }
        if (param0 >= param4 + this.field_v + this.field_r) {
            return false;
        }
        if (this.field_h + (this.field_m + param3) > param2) {
            return true;
        }
        return false;
    }

    el(String param0, bb param1) {
        this(param0, hb.field_j.field_b, param1);
    }

    boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -30) {
            return false;
          }
          this.a(-77, -17, -47, -88, 79, (el) null, 49);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("el.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3) {
        int var5;
        la var6;
        int var7;
        la var8;
        la var9;
        la var10;
        la var11;
        la var12;
        la var14;
        la var15;
        la var16;
        la var17;
        var7 = Geoblox.field_C;
        if (param1 <= 126) {
          return true;
        }
        this.a(false, param3, this, param2);
        var5 = this.e((byte) 54) ? 1 : 0;
        if (!param0) {
          if (var5 != 0 &&
              bi.field_g != 0) {
            this.d(-126);
          }
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        if (0 == vc.field_i) {
          if (0 == bi.field_g) {
            if (gf.field_a == 0 &&
                0 != ij.field_X) {
              this.a(param2, qa.field_a, true, this, param3, ue.field_e);
              var8 = lh.field_b;
              if (var8 != null) {
                if (var8.field_u instanceof rg) {
                  ((rg) ((Object) var8.field_u)).a((fk) null, var8, 22176);
                }
                lh.field_b = null;
              }
              if (var7 != 0 &&
                  var5 != 0 &&
                  bi.field_g != 0) {
                this.d(-126);
              }
            }
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          if (!this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, this)) {
            if (var5 == 0) {
              if (gf.field_a == 0 &&
                  0 != ij.field_X) {
                this.a(param2, qa.field_a, true, this, param3, ue.field_e);
                var9 = lh.field_b;
                if (var9 != null) {
                  if (var9.field_u instanceof rg) {
                    ((rg) ((Object) var9.field_u)).a((fk) null, var9, 22176);
                  }
                  lh.field_b = null;
                }
                if (var7 != 0 &&
                    var5 != 0 &&
                    bi.field_g != 0) {
                  this.d(-126);
                }
              }
              ij.field_X = gf.field_a;
              sa.a(this.c((byte) 69), (byte) 72);
              return param0;
            }
            this.d(-127);
            if (var7 != 0) {
              param0 = false;
            }
          } else {
            param0 = false;
          }
          if (gf.field_a != 0) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          if (0 == ij.field_X) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          this.a(param2, qa.field_a, true, this, param3, ue.field_e);
          var10 = lh.field_b;
          if (var10 != null) {
            if (var10.field_u instanceof rg) {
              ((rg) ((Object) var10.field_u)).a((fk) null, var10, 22176);
            }
            lh.field_b = null;
          }
          if (var7 != 0 &&
              var5 != 0 &&
              bi.field_g != 0) {
            this.d(-126);
          }
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        if (var5 != 0) {
          this.a(param3, vc.field_i, param2, -1, qa.field_a, this, ue.field_e);
          if (0 == bi.field_g) {
            if (gf.field_a == 0 &&
                0 != ij.field_X) {
              this.a(param2, qa.field_a, true, this, param3, ue.field_e);
              var15 = lh.field_b;
              var6 = var15;
              if (var15 != null) {
                if (var15.field_u instanceof rg) {
                  ((rg) ((Object) var15.field_u)).a((fk) null, var15, 22176);
                }
                lh.field_b = null;
              }
              if (var7 != 0 &&
                  bi.field_g != 0) {
                this.d(-126);
              }
            }
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          if (!this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, this)) {
            this.d(-127);
            if (var7 != 0) {
              param0 = false;
            }
          } else {
            param0 = false;
          }
          if (gf.field_a != 0) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          if (0 == ij.field_X) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          this.a(param2, qa.field_a, true, this, param3, ue.field_e);
          var17 = lh.field_b;
          var6 = var17;
          if (var17 != null) {
            if (var17.field_u instanceof rg) {
              ((rg) ((Object) var17.field_u)).a((fk) null, var17, 22176);
            }
            lh.field_b = null;
          }
          if (var7 != 0 &&
              bi.field_g != 0) {
            this.d(-126);
          }
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        if (0 == bi.field_g) {
          if (gf.field_a == 0 &&
              0 != ij.field_X) {
            this.a(param2, qa.field_a, true, this, param3, ue.field_e);
            var11 = lh.field_b;
            if (var11 != null) {
              if (var11.field_u instanceof rg) {
                ((rg) ((Object) var11.field_u)).a((fk) null, var11, 22176);
              }
              lh.field_b = null;
            }
            if (var7 != 0 &&
                var5 != 0 &&
                bi.field_g != 0) {
              this.d(-126);
            }
          }
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        if (!this.a(param3, -109, param2, bi.field_g, mc.field_a, he.field_d, this)) {
          if (gf.field_a != 0) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          if (0 == ij.field_X) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          this.a(param2, qa.field_a, true, this, param3, ue.field_e);
          var12 = lh.field_b;
          var6 = var12;
          if (var12 != null) {
            if (var12.field_u instanceof rg) {
              ((rg) ((Object) var12.field_u)).a((fk) null, var12, 22176);
            }
            lh.field_b = null;
          }
          if (var7 == 0) {
            ij.field_X = gf.field_a;
            sa.a(this.c((byte) 69), (byte) 72);
            return param0;
          }
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        param0 = false;
        if (gf.field_a != 0) {
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        if (0 == ij.field_X) {
          ij.field_X = gf.field_a;
          sa.a(this.c((byte) 69), (byte) 72);
          return param0;
        }
        this.a(param2, qa.field_a, true, this, param3, ue.field_e);
        var14 = lh.field_b;
        if (var14 != null) {
          if (var14.field_u instanceof rg) {
            ((rg) ((Object) var14.field_u)).a((fk) null, var14, 22176);
          }
          lh.field_b = null;
        }
        if (var7 != 0 &&
            var5 != 0 &&
            bi.field_g != 0) {
          this.d(-126);
        }
        ij.field_X = gf.field_a;
        sa.a(this.c((byte) 69), (byte) 72);
        return param0;
    }

    StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
          }
          if (param0 == 0) {
            stackIn_6_0 = (StringBuilder) (param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = (StringBuilder) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("el.PA(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = Geoblox.field_C;
        var4 = this.d((byte) 105);
        var5_int = param2;
        while (var4 >= var5_int) {
          this.a(param1, param0, (byte) 54, var5_int);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = lf.c((byte) 55);
        if (var5 != null) {
          hb.field_j.a(nj.field_g, true, bc.field_a, var5);
        }
    }

    void a(int param0, int param1, byte param2, int param3, int param4) {
        this.field_h = param0;
        this.field_v = param4;
        if (param2 < -6) {
            this.field_r = param1;
            this.field_m = param3;
            return;
        }
        this.field_k = 112;
        this.field_r = param1;
        this.field_m = param3;
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 93 % ((-3 - param1) / 38);
          if (!this.a(param4, -1, param5, param0, param2)) {
            return false;
          }
          this.field_f = param3;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("el.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, el param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -1) {
            this.a(false, 57, (el) null, -122);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("el.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    String c(byte param0) {
        if (param0 == 69) {
            return !this.field_l ? null : this.field_j;
        }
        this.a((byte) -36, (el) null);
        return !this.field_l ? null : this.field_j;
    }

    final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
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
        var6 = Geoblox.field_C;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_v).append(",").append(this.field_m).append(" ").append(this.field_r).append("x").append(this.field_h);
          if (this.field_s != null) {
            discarded$1 = param3.append(" text=\"").append(this.field_s).append('"');
          }
          if (param2 != 34) {
            this.field_v = -101;
          }
          if (this.field_l) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.e((byte) 54)) {
            discarded$3 = param3.append(" focused");
          }
          L4: {
            if (null != this.field_q) {
              discarded$4 = param3.append(" renderer=");
              if (this.field_q instanceof el) {
                param3 = this.a(0, param3, param1, 1 + param0);
                if (var6 == 0) {
                  break L4;
                }
              }
              discarded$5 = param3.append(this.field_q);
            }
          }
          if (null != this.field_u) {
            L7: {
              discarded$6 = param3.append(" listener=");
              if (!(this.field_u instanceof el)) {
                discarded$7 = param3.append(this.field_u);
                if (var6 == 0) {
                  break L7;
                }
              }
              param3 = this.a(0, param3, param1, 1 + param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("el.DC(").append(param0).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    void d(int param0) {
        if (param0 >= -122) {
            this.a(76, -76, 91);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            int var2_int = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (eh.field_d.field_f >= param1) {
              return true;
            }
            if (oc.field_e == null) {
              return false;
            }
            try {
              if (param0 != 30000) {
                el.b(-45, -75);
              }
              var2_int = oc.field_e.a((byte) 110);
              if (var2_int > 0) {
                if (-eh.field_d.field_f + param1 < var2_int) {
                  var2_int = param1 - eh.field_d.field_f;
                }
                oc.field_e.a(eh.field_d.field_j, (byte) -97, eh.field_d.field_f, var2_int);
                kh.field_e = oa.a(-12520);
                eh.field_d.field_f = eh.field_d.field_f + var2_int;
                if (param1 > eh.field_d.field_f) {
                  return false;
                }
                eh.field_d.field_f = 0;
                return true;
              }
              if (var2_int < 0) {
                jl.a((byte) -127);
              } else {
                if (ll.a((byte) 12) <= 30000L) {
                  return false;
                }
                jl.a((byte) -127);
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              jl.a((byte) -120);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, qc param1, qc param2, java.math.BigInteger param3, java.math.BigInteger param4) {
        try {
            if (param0) {
                field_p = (tf) null;
            }
            nh.a(param4, param3, 0, param2, param1.field_j, param1.field_f, true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.WB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    boolean e(byte param0) {
        if (param0 != 54) {
            this.a(65, 5, '￦', (el) null);
            return false;
        }
        return false;
    }

    final boolean a(StringBuilder param0, int param1, int param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 10095) {
            this.field_u = (bb) null;
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
          stackIn_9_1 = new StringBuilder().append("el.CC(");
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
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void c(int param0) {
        int var2 = 117 % ((-3 - param0) / 63);
        this.a(this.field_h, this.field_r, (byte) -113, this.field_m, this.field_v);
    }

    void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        try {
            this.field_f = 0;
            if (!param2) {
                this.toString();
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected el() {
        this.field_k = 0;
        this.field_n = 0;
    }

    el(String param0, dh param1, bb param2) {
        cc var4 = null;
        this.field_k = 0;
        this.field_n = 0;
        try {
            this.field_q = param1;
            this.field_u = param2;
            this.field_s = param0;
            if (this.field_q instanceof cc) {
                var4 = (cc) ((Object) this.field_q);
                this.field_r = var4.a(this, (byte) -33);
                this.field_h = var4.a(-122, this);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    el(int param0, int param1, int param2, int param3, dh param4, bb param5) {
        this.field_k = 0;
        this.field_n = 0;
        try {
            this.field_r = param2;
            this.field_v = param0;
            this.field_h = param3;
            this.field_m = param1;
            this.field_u = param5;
            this.field_q = param4;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "el.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new tf();
        field_i = -1;
    }
}
