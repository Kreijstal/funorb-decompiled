/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ub extends wl {
    static boolean field_m;
    int field_l;
    int field_i;
    bf field_w;
    boolean field_v;
    static kl field_x;
    String field_p;
    int field_q;
    int field_r;
    int field_n;
    String field_k;
    static si field_t;
    int field_o;
    ce field_s;
    int field_j;
    af field_u;

    final boolean a(int param0, int param1, char param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.d((byte) 53) &&
            this.a(param2, param1, (byte) -110, this)) {
            return true;
          }
          var4_int = 96 % ((-42 - param0) / 45);
          var5 = param1;
          if (80 == var5) {
            stackIn_10_0 = this.a(this, 8);
            return stackIn_10_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var4), "ub.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0 &&
            param0.length() >= ca.field_f &&
            param0.length() <= af.field_e) {
            if (param1 <= 43) {
              ub.a(117, -70);
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("ub.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 8) {
            field_x = (kl) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ub.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          discarded$0 = param3.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_o).append(",").append(this.field_l).append(" ").append(this.field_r).append("x").append(this.field_n);
          if (null != this.field_k) {
            discarded$1 = param3.append(" text=\"").append(this.field_k).append('"');
          }
          if (this.field_v) {
            discarded$2 = param3.append(" mouseover");
          }
          if (this.d((byte) 53)) {
            discarded$3 = param3.append(" focused");
          }
          if (this.field_w != null) {
            discarded$4 = param3.append(" renderer=");
            if (!(this.field_w instanceof ub)) {
              discarded$5 = param3.append(this.field_w);
              if (var6 != 0) {
                param3 = this.a(param2, (byte) 102, param1 + 1, param3);
              }
            } else {
              param3 = this.a(param2, (byte) 102, param1 + 1, param3);
            }
          }
          if (param0 <= 79) {
            return;
          }
          if (null != this.field_s) {
            discarded$6 = param3.append(" listener=");
            if (!(this.field_s instanceof ub)) {
              discarded$7 = param3.append(this.field_s);
              if (var6 == 0) {
                return;
              }
            }
            param3 = this.a(param2, (byte) 102, param1 + 1, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("ub.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 102) {
            this.field_l = -40;
          }
          if (this.a(param3, param0, param2, true)) {
            this.a(param1 - 2, param2, param0, param3);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ub.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    boolean a(char param0, int param1, byte param2, ub param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -96) {
            this.field_o = 26;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ub.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          var4_int = this.e((byte) 33);
          if (!param0) {
            this.field_s = (ce) null;
          }
          var5_int = 0;
          while (var4_int >= var5_int) {
            this.a(param1, 0, var5_int, param2);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = ne.b((byte) -50);
          if (null != var5) {
            kc.field_H.a(ag.field_u, uc.field_a, var5, 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) runtimeException), "ub.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = this.a(new Hashtable(), (byte) 102, 0, new StringBuilder()).toString();
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ub.toString()");
        }
    }

    final static void a(int param0, int param1) {
        mg var2 = null;
        try {
          var2 = n.field_b;
          var2.c((byte) -96, param1);
          var2.b((byte) 11, 1);
          var2.b((byte) 11, param0);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ub.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 108) {
            field_x = (kl) null;
          }
          this.a(121, this.field_l, this.field_n, this.field_r, this.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.A(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_r = param3;
        if (param0 <= 108) {
          return;
        }
        try {
          this.field_o = param4;
          this.field_n = param2;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ub.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(StringBuilder param0, Hashtable param1, int param2, boolean param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            return false;
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
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ub.W(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void b(boolean param0) {
        try {
          if (param0) {
            this.a((StringBuilder) null, (Hashtable) null, -7, false);
          }
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "ub.S(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 == param1 &&
            this.field_w != null) {
            this.field_w.a(param0, param3, this, true, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "ub.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    String c(boolean param0) {
        RuntimeException var2 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a(30, 86, -9, 25, -124);
          }
          if (!this.field_v) {
            stackIn_7_0 = null;
          } else {
            stackIn_7_0 = this.field_p;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.V(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int[] param1) {
        boolean stackIn_38_0 = false;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        hb var4_ref_hb = null;
        int var4 = 0;
        int var5_int = 0;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          if (wh.field_j != hi.field_l) {
            return false;
          }
          if (param0 != 0) {
            return false;
          }
          var2_long = d.a((byte) 35);
          if (ge.field_j != 0 &&
            p.field_W < 0) {
            var4_ref_hb = (hb) (wg.field_c.b((byte) 125));
            if (var4_ref_hb != null &&
              var2_long > var4_ref_hb.field_p) {
              var4_ref_hb.a(false);
              gd.field_c = var4_ref_hb.field_l.length;
              nk.field_N.field_m = 0;
              var5_int = 0;
              do {
                if (!(gd.field_c > var5_int)) {
                  l.field_P = wizardrun.field_E;
                  wizardrun.field_E = me.field_c;
                  me.field_c = ra.field_k;
                  ra.field_k = var4_ref_hb.field_j;
                  break;
                }
                nk.field_N.field_k[var5_int] = var4_ref_hb.field_l[var5_int];
                var5_int++;
              } while (var7 == 0);
              return true;
            }
          }
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (p.field_W < 0) {
              nk.field_N.field_m = 0;
              stackIn_38_0 = hc.a(1, param0 ^ -28266);
              decompiledFrameRemainder0 = (var7 == 0);
              if (decompiledFrameRemainder0) {
                if (!stackIn_38_0) {
                  return false;
                }
                p.field_W = nk.field_N.m(45);
                nk.field_N.field_m = 0;
                gd.field_c = param1[p.field_W];
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_38_0 = bd.b(52);
            }
            if (!stackIn_38_0) {
              return false;
            }
            if (0 == ge.field_j) {
              l.field_P = wizardrun.field_E;
              wizardrun.field_E = me.field_c;
              me.field_c = ra.field_k;
              ra.field_k = p.field_W;
              p.field_W = -1;
              return true;
            }
            var4 = ge.field_j;
            if (0.0 != dc.field_j) {
              var4 = (int)((double)var4 + oi.field_c.nextGaussian() * dc.field_j);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new hb((long)var4 + var2_long, p.field_W, new byte[gd.field_c]);
            var6 = 0;
            do {
              if (!(var6 < gd.field_c)) {
                wg.field_c.a(var5, false);
                p.field_W = -1;
                break;
              }
              var5.field_l[var6] = nk.field_N.field_k[var6];
              var6++;
            } while (var7 == 0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_62_0 = var2;
          stackIn_62_1 = new StringBuilder().append("ub.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            this.a(-68, -40, -26, -46, (ub) null, -33);
          }
          stackIn_16_0 = (param1 >= param3 + this.field_o) && (param0 >= this.field_l + param4) && (this.field_r + param3 + this.field_o > param1) && ((this.field_n + (param4 + this.field_l)) > param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var6), "ub.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_q = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ub.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_x = null;
          if (param0 != 31) {
            field_x = (kl) null;
          }
          field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ub.AA(" + param0 + ')');
        }
    }

    int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 23) {
            ub.f((byte) 70);
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.I(" + param0 + ')');
        }
    }

    boolean a(ub param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23023) {
            this.a((ub) null, 28, 74, 38, 125, 87, 3);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ub.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3) {
        boolean stackIn_48_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        pj var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          this.a(10000536, param3, param2, this);
          if (param0 <= 124) {
            return false;
          }
          boolean decompiledFrameRemainder0 = true;
          var5_int = this.d((byte) 53) ? 1 : 0;
          if ((!param1) &&
            (decompiledFrameRemainder0 = (var5_int != 0)) &&
            (decompiledFrameRemainder0 = (0 != w.field_c))) {
            this.b(false);
          }
          if ((decompiledFrameRemainder0) &&
            (param1 ||
            var7 != 0)) {
            if (gi.field_c != 0 &&
              var5_int != 0) {
              this.a(this, -23023, param2, gi.field_c, fi.field_B, param3, pg.field_n);
            }
            if (w.field_c != 0) {
              if (!this.a(param2, (byte) 93, tf.field_e, param3, w.field_c, dh.field_b, this)) {
                if (var5_int != 0) {
                  this.b(false);
                  if (var7 != 0) {
                    param1 = false;
                  }
                }
              } else {
                param1 = false;
              }
            }
            if (sh.field_c == 0 &&
              0 != il.field_c) {
              this.a(param2, fi.field_B, param3, pg.field_n, this, 0);
              var6 = tg.field_h;
              if (var6 != null) {
                if (var6.field_s instanceof qg) {
                  ((qg) (var6.field_s)).a(var6, -98, (pd) null);
                }
                tg.field_h = null;
              }
            }
          }
          il.field_c = sh.field_c;
          d.a(this.c(false), 0);
          stackIn_48_0 = param1;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var5), "ub.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 53) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "ub.O(" + param0 + ')');
        }
    }

    boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param5, param2, 0, param0, param3)) {
            this.field_q = param4;
          }
          var8_int = -45 % ((param1 - 12) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("ub.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, kl param1) {
        RuntimeException stackIn_367_0 = null;
        StringBuilder stackIn_367_1 = null;
        String stackIn_368_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        try {
          va.field_n = param1;
          var2 = uf.a("achievement_names,0", 107);
          if (null != var2) {
            nl.field_t[0] = nf.a((byte) 100, var2);
          }
          var2Lifetime1 = uf.a("achievement_names,1", 111);
          if (null != var2Lifetime1) {
            nl.field_t[1] = nf.a((byte) 84, var2Lifetime1);
          }
          var2Lifetime2 = uf.a("achievement_names,2", 122);
          if (var2Lifetime2 != null) {
            nl.field_t[2] = nf.a((byte) 94, var2Lifetime2);
          }
          var2Lifetime3 = uf.a("achievement_names,3", 111);
          if (null != var2Lifetime3) {
            nl.field_t[3] = nf.a((byte) 125, var2Lifetime3);
          }
          var2Lifetime4 = uf.a("achievement_names,4", 120);
          if (null != var2Lifetime4) {
            nl.field_t[4] = nf.a((byte) 113, var2Lifetime4);
          }
          var2Lifetime5 = uf.a("achievement_names,5", 122);
          if (null != var2Lifetime5) {
            nl.field_t[5] = nf.a((byte) 114, var2Lifetime5);
          }
          var2Lifetime6 = uf.a("achievement_names,6", 110);
          if (var2Lifetime6 != null) {
            nl.field_t[6] = nf.a((byte) 126, var2Lifetime6);
          }
          var2Lifetime7 = uf.a("achievement_names,7", 108);
          if (var2Lifetime7 != null) {
            nl.field_t[7] = nf.a((byte) 111, var2Lifetime7);
          }
          var2Lifetime8 = uf.a("achievement_names,8", 119);
          if (null != var2Lifetime8) {
            nl.field_t[8] = nf.a((byte) 86, var2Lifetime8);
          }
          var2Lifetime9 = uf.a("achievement_names,9", 107);
          if (null != var2Lifetime9) {
            nl.field_t[9] = nf.a((byte) 93, var2Lifetime9);
          }
          var2Lifetime10 = uf.a("achievement_names,10", 123);
          if (null != var2Lifetime10) {
            nl.field_t[10] = nf.a((byte) 84, var2Lifetime10);
          }
          var2Lifetime11 = uf.a("achievement_names,11", 119);
          if (var2Lifetime11 != null) {
            nl.field_t[11] = nf.a((byte) 109, var2Lifetime11);
          }
          var2Lifetime12 = uf.a("achievement_criteria,0", 120);
          if (null != var2Lifetime12) {
            mh.field_sb[0] = nf.a((byte) 124, var2Lifetime12);
          }
          var2Lifetime13 = uf.a("achievement_criteria,1", 120);
          if (null != var2Lifetime13) {
            mh.field_sb[1] = nf.a((byte) 91, var2Lifetime13);
          }
          var2Lifetime14 = uf.a("achievement_criteria,2", 115);
          if (var2Lifetime14 != null) {
            mh.field_sb[2] = nf.a((byte) 104, var2Lifetime14);
          }
          var2Lifetime15 = uf.a("achievement_criteria,3", 122);
          if (null != var2Lifetime15) {
            mh.field_sb[3] = nf.a((byte) 112, var2Lifetime15);
          }
          var2Lifetime16 = uf.a("achievement_criteria,4", 107);
          if (null != var2Lifetime16) {
            mh.field_sb[4] = nf.a((byte) 112, var2Lifetime16);
          }
          var2Lifetime17 = uf.a("achievement_criteria,5", 121);
          if (var2Lifetime17 != null) {
            mh.field_sb[5] = nf.a((byte) 112, var2Lifetime17);
          }
          var2Lifetime18 = uf.a("achievement_criteria,6", 126);
          if (null != var2Lifetime18) {
            mh.field_sb[6] = nf.a((byte) 124, var2Lifetime18);
          }
          var2Lifetime19 = uf.a("achievement_criteria,7", 120);
          if (null != var2Lifetime19) {
            mh.field_sb[7] = nf.a((byte) 88, var2Lifetime19);
          }
          var2Lifetime20 = uf.a("achievement_criteria,8", 107);
          if (null != var2Lifetime20) {
            mh.field_sb[8] = nf.a((byte) 125, var2Lifetime20);
          }
          var2Lifetime21 = uf.a("achievement_criteria,9", 115);
          if (null != var2Lifetime21) {
            mh.field_sb[9] = nf.a((byte) 98, var2Lifetime21);
          }
          var2Lifetime22 = uf.a("achievement_criteria,10", 112);
          if (var2Lifetime22 != null) {
            mh.field_sb[10] = nf.a((byte) 105, var2Lifetime22);
          }
          var2Lifetime23 = uf.a("achievement_criteria,11", 108);
          if (null != var2Lifetime23) {
            mh.field_sb[11] = nf.a((byte) 109, var2Lifetime23);
          }
          var2Lifetime24 = uf.a("captions,0", 121);
          if (var2Lifetime24 != null) {
            l.field_O[0] = nf.a((byte) 88, var2Lifetime24);
          }
          var2Lifetime25 = uf.a("captions,1", 121);
          if (null != var2Lifetime25) {
            l.field_O[1] = nf.a((byte) 91, var2Lifetime25);
          }
          var2Lifetime26 = uf.a("captions,2", 111);
          if (null != var2Lifetime26) {
            l.field_O[2] = nf.a((byte) 94, var2Lifetime26);
          }
          var2Lifetime27 = uf.a("captions,3", 118);
          if (var2Lifetime27 != null) {
            l.field_O[3] = nf.a((byte) 112, var2Lifetime27);
          }
          var2Lifetime28 = uf.a("gamename", 109);
          if (null != var2Lifetime28) {
            vk.field_u = nf.a((byte) 127, var2Lifetime28);
          }
          var2Lifetime29 = uf.a("openmenu", 116);
          if (null != var2Lifetime29) {
            sk.field_C = nf.a((byte) 114, var2Lifetime29);
          }
          var2Lifetime30 = uf.a("holdtocharge", 118);
          if (var2Lifetime30 != null) {
            oi.field_d = nf.a((byte) 120, var2Lifetime30);
          }
          var2Lifetime31 = uf.a("firestars", 111);
          if (var2Lifetime31 != null) {
            kj.field_e = nf.a((byte) 103, var2Lifetime31);
          }
          var2Lifetime32 = uf.a("jump", 113);
          if (var2Lifetime32 != null) {
            qj.field_a = nf.a((byte) 115, var2Lifetime32);
          }
          var2Lifetime33 = uf.a("movelr", 107);
          if (var2Lifetime33 != null) {
            og.field_P = nf.a((byte) 86, var2Lifetime33);
          }
          var2Lifetime34 = uf.a("snd", 116);
          if (null != var2Lifetime34) {
            ae.field_b = nf.a((byte) 84, var2Lifetime34);
          }
          var2Lifetime35 = uf.a("mus", 113);
          if (null != var2Lifetime35) {
            jd.field_a = nf.a((byte) 93, var2Lifetime35);
          }
          var2Lifetime36 = uf.a("musbar", 107);
          if (null != var2Lifetime36) {
            qk.field_i = nf.a((byte) 125, var2Lifetime36);
          }
          var2Lifetime37 = uf.a("sndbar", 121);
          if (var2Lifetime37 != null) {
            qc.field_N = nf.a((byte) 125, var2Lifetime37);
          }
          var2Lifetime38 = uf.a("holdxspace", 113);
          if (var2Lifetime38 != null) {
            ei.field_m = nf.a((byte) 112, var2Lifetime38);
          }
          var2Lifetime39 = uf.a("presszup", 113);
          if (var2Lifetime39 != null) {
            wb.field_a = nf.a((byte) 111, var2Lifetime39);
          }
          var2Lifetime40 = uf.a("pressxspace", 112);
          if (var2Lifetime40 != null) {
            ka.field_g = nf.a((byte) 112, var2Lifetime40);
          }
          var2Lifetime41 = uf.a("gameover", 114);
          if (null != var2Lifetime41) {
            me.field_b = nf.a((byte) 95, var2Lifetime41);
          }
          var2Lifetime42 = uf.a("starpower", 122);
          if (var2Lifetime42 != null) {
            bb.field_g = nf.a((byte) 91, var2Lifetime42);
          }
          var2Lifetime43 = uf.a("instructiontextl", 111);
          if (null != var2Lifetime43) {
            nf.a((byte) 94, var2Lifetime43);
          }
          var2Lifetime44 = uf.a("instructiontextr", 117);
          if (null != var2Lifetime44) {
            nf.a((byte) 117, var2Lifetime44);
          }
          var2Lifetime45 = uf.a("fgc", 127);
          if (var2Lifetime45 != null) {
            i.field_d = nf.a((byte) 113, var2Lifetime45);
          }
          var2Lifetime46 = uf.a("andthat", 122);
          if (var2Lifetime46 != null) {
            ug.field_P = nf.a((byte) 124, var2Lifetime46);
          }
          var2Lifetime47 = uf.a("dothis", 123);
          if (var2Lifetime47 != null) {
            ql.field_a = nf.a((byte) 99, var2Lifetime47);
          }
          var2Lifetime48 = uf.a("todefeattheboss", 114);
          if (var2Lifetime48 != null) {
            jd.field_c = nf.a((byte) 126, var2Lifetime48);
          }
          var2Lifetime49 = uf.a("threecreatures", 117);
          if (var2Lifetime49 != null) {
            he.field_r = nf.a((byte) 122, var2Lifetime49);
          }
          var2Lifetime50 = uf.a("lastlevelbeforeboss", 108);
          if (var2Lifetime50 != null) {
            ab.field_b = nf.a((byte) 87, var2Lifetime50);
          }
          var2Lifetime51 = uf.a("becareful", 113);
          if (null != var2Lifetime51) {
            sd.field_e = nf.a((byte) 101, var2Lifetime51);
          }
          var2Lifetime52 = uf.a("usingstarpowerisfun", 109);
          if (var2Lifetime52 != null) {
            ag.field_w = nf.a((byte) 112, var2Lifetime52);
          }
          var2Lifetime53 = uf.a("charrrrge", 117);
          if (null != var2Lifetime53) {
            lc.field_c = nf.a((byte) 117, var2Lifetime53);
          }
          var2Lifetime54 = uf.a("iseecolours", 108);
          if (var2Lifetime54 != null) {
            ld.field_a = nf.a((byte) 103, var2Lifetime54);
          }
          var2Lifetime55 = uf.a("yummycrystals", 123);
          if (null != var2Lifetime55) {
            cd.field_h = nf.a((byte) 94, var2Lifetime55);
          }
          var2Lifetime56 = uf.a("crystalsgrow", 111);
          if (var2Lifetime56 != null) {
            vl.field_a = nf.a((byte) 93, var2Lifetime56);
          }
          var2Lifetime57 = uf.a("fallfrombelow", 118);
          if (var2Lifetime57 != null) {
            fa.field_d = nf.a((byte) 100, var2Lifetime57);
          }
          var2Lifetime58 = uf.a("fallfromabove", 120);
          if (var2Lifetime58 != null) {
            ta.field_f = nf.a((byte) 125, var2Lifetime58);
          }
          var2Lifetime59 = uf.a("jumpwithz", 125);
          if (var2Lifetime59 != null) {
            pb.field_i = nf.a((byte) 111, var2Lifetime59);
          }
          var2Lifetime60 = uf.a("pressattack", 127);
          if (null != var2Lifetime60) {
            i.field_c = nf.a((byte) 127, var2Lifetime60);
          }
          var2Lifetime61 = uf.a("usearrows", 119);
          if (null != var2Lifetime61) {
            r.field_c = nf.a((byte) 115, var2Lifetime61);
          }
          var2Lifetime62 = uf.a("pressenterorclick", 119);
          if (null != var2Lifetime62) {
            ol.field_d = nf.a((byte) 84, var2Lifetime62);
          }
          var2Lifetime63 = uf.a("logintoaccess", 124);
          if (null != var2Lifetime63) {
            dj.field_c = nf.a((byte) 123, var2Lifetime63);
          }
          var2Lifetime64 = uf.a("psfhs", 111);
          if (var2Lifetime64 != null) {
            lf.field_a = nf.a((byte) 91, var2Lifetime64);
          }
          var2Lifetime65 = uf.a("hssu", 121);
          if (var2Lifetime65 != null) {
            rd.field_a = nf.a((byte) 119, var2Lifetime65);
          }
          var2Lifetime66 = uf.a("hs4", 123);
          if (var2Lifetime66 != null) {
            ai.field_s = nf.a((byte) 104, var2Lifetime66);
          }
          var2Lifetime67 = uf.a("hs3", 125);
          if (null != var2Lifetime67) {
            af.field_b = nf.a((byte) 124, var2Lifetime67);
          }
          var2Lifetime68 = uf.a("hs2", 125);
          if (null != var2Lifetime68) {
            ef.field_G = nf.a((byte) 103, var2Lifetime68);
          }
          var2Lifetime69 = uf.a("hs1", 110);
          if (var2Lifetime69 != null) {
            pd.field_G = nf.a((byte) 112, var2Lifetime69);
          }
          var2Lifetime70 = uf.a("compltex", 121);
          if (null != var2Lifetime70) {
            q.field_l = nf.a((byte) 119, var2Lifetime70);
          }
          var2Lifetime71 = uf.a("lastscor", 120);
          if (null != var2Lifetime71) {
            nf.a((byte) 86, var2Lifetime71);
          }
          var2Lifetime72 = uf.a("scrtex", 119);
          if (null != var2Lifetime72) {
            qj.field_f = nf.a((byte) 124, var2Lifetime72);
          }
          var2Lifetime73 = uf.a("worldstage", 124);
          if (var2Lifetime73 != null) {
            nj.field_p = nf.a((byte) 124, var2Lifetime73);
          }
          var2Lifetime74 = uf.a("nametex", 113);
          if (param0 >= -33) {
            return;
          }
          if (var2Lifetime74 != null) {
            bb.field_l = nf.a((byte) 90, var2Lifetime74);
          }
          var2Lifetime75 = uf.a("requirementshidden", 127);
          if (null != var2Lifetime75) {
            f.field_f = nf.a((byte) 114, var2Lifetime75);
          }
          var2Lifetime76 = uf.a("loginn", 122);
          if (null != var2Lifetime76) {
            ue.field_b = nf.a((byte) 100, var2Lifetime76);
          }
          var2Lifetime77 = uf.a("levelonly", 121);
          if (var2Lifetime77 != null) {
            oj.field_a = nf.a((byte) 117, var2Lifetime77);
          }
          var2Lifetime78 = uf.a("levelnotyet", 110);
          if (var2Lifetime78 != null) {
            si.field_g = nf.a((byte) 89, var2Lifetime78);
          }
          var2Lifetime79 = uf.a("worldspace", 110);
          if (null != var2Lifetime79) {
            qj.field_c = nf.a((byte) 109, var2Lifetime79);
          }
          var2Lifetime80 = uf.a("thedem", 114);
          if (null != var2Lifetime80) {
            kk.field_vb = nf.a((byte) 85, var2Lifetime80);
          }
          var2Lifetime81 = uf.a("theice", 120);
          if (null != var2Lifetime81) {
            wi.field_H = nf.a((byte) 98, var2Lifetime81);
          }
          var2Lifetime82 = uf.a("thetro", 109);
          if (var2Lifetime82 != null) {
            de.field_c = nf.a((byte) 99, var2Lifetime82);
          }
          var2Lifetime83 = uf.a("thepir", 109);
          if (null != var2Lifetime83) {
            ra.field_l = nf.a((byte) 86, var2Lifetime83);
          }
          var2Lifetime84 = uf.a("thebea", 117);
          if (var2Lifetime84 != null) {
            u.field_o = nf.a((byte) 89, var2Lifetime84);
          }
          var2Lifetime85 = uf.a("thevil", 109);
          if (null != var2Lifetime85) {
            aa.field_kb = nf.a((byte) 127, var2Lifetime85);
          }
          var2Lifetime86 = uf.a("worldselect", 116);
          if (null != var2Lifetime86) {
            uh.field_b = nf.a((byte) 95, var2Lifetime86);
          }
          var2Lifetime87 = uf.a("scorecolon", 115);
          if (var2Lifetime87 != null) {
            tf.field_d = nf.a((byte) 111, var2Lifetime87);
          }
          var2Lifetime88 = uf.a("livescolon", 119);
          if (var2Lifetime88 != null) {
            hh.field_J = nf.a((byte) 96, var2Lifetime88);
          }
          var2Lifetime89 = uf.a("tut6", 118);
          if (null != var2Lifetime89) {
            nf.a((byte) 97, var2Lifetime89);
          }
          var2Lifetime90 = uf.a("tut5", 110);
          if (null != var2Lifetime90) {
            nf.a((byte) 122, var2Lifetime90);
          }
          var2Lifetime91 = uf.a("tut4", 107);
          if (var2Lifetime91 != null) {
            nf.a((byte) 109, var2Lifetime91);
          }
          var2Lifetime92 = uf.a("tut3", 113);
          if (var2Lifetime92 != null) {
            nf.a((byte) 125, var2Lifetime92);
          }
          var2Lifetime93 = uf.a("tut2", 113);
          if (var2Lifetime93 != null) {
            nf.a((byte) 123, var2Lifetime93);
          }
          var2Lifetime94 = uf.a("tut1", 126);
          if (null != var2Lifetime94) {
            nf.a((byte) 106, var2Lifetime94);
          }
          var2Lifetime95 = uf.a("pressentertocont", 116);
          if (var2Lifetime95 != null) {
            nf.a((byte) 127, var2Lifetime95);
          }
          var2Lifetime96 = uf.a("worldstage1", 120);
          if (var2Lifetime96 != null) {
            cc.field_b = nf.a((byte) 125, var2Lifetime96);
          }
          var2Lifetime97 = uf.a("tut", 109);
          if (var2Lifetime97 != null) {
            l.field_Q = nf.a((byte) 96, var2Lifetime97);
          }
          var2Lifetime98 = uf.a("introtex", 114);
          if (var2Lifetime98 != null) {
            ef.field_F = nf.a((byte) 84, var2Lifetime98);
          }
          var2Lifetime99 = uf.a("stagecolon", 119);
          if (var2Lifetime99 != null) {
            eh.field_i = nf.a((byte) 127, var2Lifetime99);
          }
          var2Lifetime100 = uf.a("worldcolon", 113);
          if (var2Lifetime100 != null) {
            wg.field_f = nf.a((byte) 110, var2Lifetime100);
          }
          var2Lifetime101 = uf.a("keycode_playerattack", 121);
          if (var2Lifetime101 != null) {
            hh.field_S = 255 & var2Lifetime101[0];
          }
          var2Lifetime102 = uf.a("keycode_playerjump", 113);
          if (null != var2Lifetime102) {
            nf.field_d = var2Lifetime102[0] & 255;
          }
          va.field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_367_0 = var2_ref;
          stackIn_367_1 = new StringBuilder().append("ub.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_368_2 = "null";
          } else {
            stackIn_368_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_367_0), ((StringBuilder) (Object) stackIn_367_1).append(stackIn_368_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, ub param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        boolean stackIn_6_0 = false;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.b(fi.field_B, pg.field_n, 0, param2, param1) ? 1 : 0;
          if (param0 != 10000536) {
            ub.a(101, (kl) null);
          }
          stackIn_6_0 = this.field_v;
          if (var5_int != 0) {
            stackIn_7_1 = 0;
          } else {
            stackIn_7_1 = 1;
          }
          if ((stackIn_6_0 ? 1 : 0) == stackIn_7_1) {
            this.field_v = var5_int != 0;
            if (this.field_s != null &&
              this.field_s instanceof ij) {
              ((ij) (this.field_s)).a(var5_int != 0, -12361, this);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_20_0 = runtimeException;
          stackIn_20_1 = new StringBuilder().append("ub.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    ub(String param0, ce param1) {
        this(param0, kc.field_H.field_u, param1);
    }

    protected ub() {
        this.field_i = 0;
        this.field_j = 0;
    }

    ub(String param0, bf param1, ce param2) {
        RuntimeException runtimeException = null;
        qe var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = 0;
        this.field_j = 0;
        try {
          this.field_s = param2;
          this.field_k = param0;
          this.field_w = param1;
          if (this.field_w instanceof qe) {
            var4 = (qe) ((Object) this.field_w);
            this.field_r = var4.b((byte) 95, this);
            this.field_n = var4.a((byte) 118, this);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ub.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    ub(int param0, int param1, int param2, int param3, bf param4, ce param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = 0;
        this.field_j = 0;
        try {
          this.field_w = param4;
          this.field_s = param5;
          this.field_o = param0;
          this.field_n = param3;
          this.field_r = param2;
          this.field_l = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
    }
}
