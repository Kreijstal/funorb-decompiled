/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends am {
    static int field_k;
    int field_v;
    int field_r;
    static float field_w;
    String field_i;
    int field_o;
    static String field_j;
    String field_n;
    mh field_p;
    static td field_t;
    int field_s;
    int field_m;
    ce field_l;
    boolean field_u;
    int field_q;
    nn field_h;
    int field_x;

    boolean g(int param0) {
        if (param0 != -9015) {
          this.a(118, 53, false, -73);
          return false;
        }
        return false;
    }

    final static bd d(byte param0) {
        int var1;
        Object var3;
        int[] var5_ref_int__;
        int var5;
        int var6;
        int var7;
        int[] var9;
        byte[] var14;
        byte[] var15;
        byte[] var16;
        byte[] var17;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var1 = hd.field_r[0] * sf.field_X[0];
        if (param0 >= 36) {
          L6: {
            var17 = ja.field_e[0];
            if (qj.field_k[0]) {
              var16 = vh.field_a[0];
              var5_ref_int__ = new int[var1];
              var6 = 0;
              while (var6 < var1) {
                var5_ref_int__[var6] = ll.a(ua.a(255, (int) var16[var6]) << 24, bf.field_d[ua.a((int) var17[var6], 255)]);
                var6++;
                if (var7 == 0) {
                  continue;
                }
                break;
              }
              var3 = new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
              if (var7 == 0) {
                break L6;
              }
            }
            var9 = new int[var1];
            var5 = 0;
            while (var1 > var5) {
              var9[var5] = bf.field_d[ua.a((int) var17[var5], 255)];
              var5++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
            var3 = new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
          }
        } else {
          L0: {
            field_k = 78;
            var15 = ja.field_e[0];
            if (qj.field_k[0]) {
              var14 = vh.field_a[0];
              var5_ref_int__ = new int[var1];
              var6 = 0;
              while (var6 < var1) {
                var5_ref_int__[var6] = ll.a(ua.a(255, (int) var14[var6]) << 24, bf.field_d[ua.a((int) var15[var6], 255)]);
                var6++;
                if (var7 == 0) {
                  continue;
                }
                break;
              }
              var3 = new gk(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var5_ref_int__);
              if (var7 == 0) {
                break L0;
              }
            }
            var9 = new int[var1];
            var5 = 0;
            while (var1 > var5) {
              var9[var5] = bf.field_d[ua.a((int) var15[var5], 255)];
              var5++;
              if (var7 == 0) {
                continue;
              }
              break;
            }
            var3 = new bd(ra.field_a, vc.field_e, th.field_Jb[0], nh.field_O[0], sf.field_X[0], hd.field_r[0], var9);
          }
        }
        uj.d(121);
        return (bd) (var3);
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        int var7;
        rj var8;
        rj var9;
        rj var10;
        rj var11;
        var7 = HostileSpawn.field_I ? 1 : 0;
        this.a(this, param0, 0, param3);
        var5 = this.g(-9015) ? 1 : 0;
        if (!param2) {
          if (var5 == 0) {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
          if (pf.field_o == 0) {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
          this.c((byte) -82);
          if (var7 == 0) {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
        }
        if (ll.field_c != 0 &&
          var5 != 0) {
          this.a(rb.field_m, param0, param3, 0, this, j.field_c, ll.field_c);
        }
        if (pf.field_o == 0) {
          if (ig.field_L != 0) {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
          if (mn.field_c == 0) {
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
          this.a(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
          var11 = rh.field_D;
          if (var11 != null) {
            if (var11.field_p instanceof k) {
              ((k) (var11.field_p)).a(var11, false, (od) null);
            }
            rh.field_D = null;
          }
          mn.field_c = ig.field_L;
          am.a(this.e(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          ag.d((byte) 54);
          return param2;
        }
        if (this.a(ec.field_a, param3, param0, rc.field_b, (byte) 110, this, pf.field_o)) {
          param2 = false;
          if (var7 == 0) {
            if (ig.field_L != 0) {
              mn.field_c = ig.field_L;
              am.a(this.e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              }
              ag.d((byte) 54);
              return param2;
            }
            if (mn.field_c == 0) {
              mn.field_c = ig.field_L;
              am.a(this.e(34), (byte) -82);
              if (param1 == 8799) {
                return param2;
              }
              ag.d((byte) 54);
              return param2;
            }
            this.a(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
            var8 = rh.field_D;
            if (var8 != null) {
              if (var8.field_p instanceof k) {
                ((k) (var8.field_p)).a(var8, false, (od) null);
              }
              rh.field_D = null;
            }
            mn.field_c = ig.field_L;
            am.a(this.e(34), (byte) -82);
            if (param1 == 8799) {
              return param2;
            }
            ag.d((byte) 54);
            return param2;
          }
        }
        if (var5 != 0) {
          this.c((byte) 47);
          if (ig.field_L == 0 &&
            mn.field_c != 0) {
            this.a(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
            var10 = rh.field_D;
            if (var10 != null) {
              if (var10.field_p instanceof k) {
                ((k) (var10.field_p)).a(var10, false, (od) null);
                rh.field_D = null;
                mn.field_c = ig.field_L;
                am.a(this.e(34), (byte) -82);
                if (param1 != 8799) {
                  ag.d((byte) 54);
                }
                return param2;
              }
              rh.field_D = null;
            }
          }
          mn.field_c = ig.field_L;
          am.a(this.e(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          ag.d((byte) 54);
          return param2;
        }
        if (ig.field_L != 0) {
          mn.field_c = ig.field_L;
          am.a(this.e(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          ag.d((byte) 54);
          return param2;
        }
        if (mn.field_c == 0) {
          mn.field_c = ig.field_L;
          am.a(this.e(34), (byte) -82);
          if (param1 == 8799) {
            return param2;
          }
          ag.d((byte) 54);
          return param2;
        }
        this.a(j.field_c, param0, param3, rb.field_m, this, param1 - 8799);
        var9 = rh.field_D;
        if (var9 != null) {
          if (var9.field_p instanceof k) {
            ((k) (var9.field_p)).a(var9, false, (od) null);
          }
          rh.field_D = null;
        }
        mn.field_c = ig.field_L;
        am.a(this.e(34), (byte) -82);
        if (param1 == 8799) {
          return param2;
        }
        ag.d((byte) 54);
        return param2;
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = HostileSpawn.field_I ? 1 : 0;
        var4 = this.f(0);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.a(param1, param0, (byte) 116, var5_int);
          var5_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var6 = 55 % ((87 - param2) / 35);
        var5 = ii.c((byte) 72);
        if (var5 != null) {
          gf.field_e.a(qh.field_q, var5, l.field_d, 94);
        }
    }

    public final String toString() {
        return this.a(122, new Hashtable(), 0, new StringBuilder()).toString();
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 <= 42) {
          this.field_x = 49;
          if (param3 == 0) {
            if (null != this.field_h) {
              this.field_h.a(param0, param1, 15430, this, true);
            }
            return;
          }
          return;
        }
        if (param3 != 0) {
          return;
        }
        if (null != this.field_h) {
          this.field_h.a(param0, param1, 15430, this, true);
          return;
        }
    }

    public static void d(int param0) {
        field_t = null;
        if (param0 != 5956) {
          ag.d((byte) -93);
          field_j = null;
          return;
        }
        field_j = null;
    }

    ag(String param0, mh param1) {
        this(param0, gf.field_e.field_h, param1);
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
            this.field_v = -27;
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
          stackIn_9_1 = new StringBuilder().append("ag.RA(");
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
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param3, param0, 255, param2, param1)) {
            this.field_r = param6;
          }
          if (param4 == 110) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("ag.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 255) {
          return false;
        }
        if (param1 < param4 + this.field_v) {
          return false;
        }
        if (this.field_m + param3 > param0) {
          return false;
        }
        if (this.field_s + (this.field_v + param4) <= param1) {
          return false;
        }
        if (param0 < this.field_x + (this.field_m + param3)) {
          return true;
        }
        return false;
    }

    void c(byte param0) {
        int var2 = -78 % ((param0 + 27) / 39);
    }

    final void c(int param0) {
        this.a(this.field_s, this.field_m, param0 ^ param0, this.field_v, this.field_x);
    }

    String e(int param0) {
        if (param0 != 34) {
          this.field_s = 88;
          if (this.field_u) {
            return this.field_i;
          }
          return null;
        }
        if (this.field_u) {
          return this.field_i;
        }
        return null;
    }

    void a(int param0, int param1, int param2, int param3, ag param4, int param5) {
        try {
          this.field_r = param5;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ag.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    int f(int param0) {
        if (param0 != 0) {
          return -69;
        }
        return 0;
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 == 0) {
          this.field_m = param1;
          this.field_v = param3;
          this.field_s = param0;
          this.field_x = param4;
          return;
        }
        this.field_m = -30;
        this.field_m = param1;
        this.field_v = param3;
        this.field_s = param0;
        this.field_x = param4;
    }

    StringBuilder a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param3, param2, false, param1)) {
            this.a(param2, param1, param3, 116);
          }
          if (param0 <= 73) {
            this.b(66, -8, -116, 93, -80);
          }
          stackIn_6_0 = (StringBuilder) (param3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ag.IA(").append(param0).append(',');
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
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    boolean a(byte param0, ag param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            return false;
          }
          this.field_l = (ce) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ag.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param2 != 0) {
            return;
          }
          var5_int = this.b(rb.field_m, j.field_c, 255, param1, param3) ? 1 : 0;
          stackIn_5_0 = (this.field_u) ? 0 : 1;
          if (var5_int != 0) {
            stackIn_8_1 = 0;
          } else {
            stackIn_8_1 = 1;
          }
          if (stackIn_5_0 != stackIn_8_1) {
            stackIn_13_1 = (var5_int != 0);
            this.field_u = stackIn_13_1;
            if (null != this.field_p &&
              this.field_p instanceof kg) {
              ((kg) (this.field_p)).a(var5_int != 0, (byte) 98, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ag.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_v).append(",").append(this.field_m).append(" ").append(this.field_s).append("x").append(this.field_x);
          if (this.field_n != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_n).append('"');
          }
          if (this.field_u) {
            discarded$2 = param2.append(" mouseover");
          }
          if (this.g(-9015)) {
            discarded$3 = param2.append(" focused");
          }
          var5_int = 99 % ((-49 - param3) / 58);
          if (null != this.field_h) {
            discarded$4 = param2.append(" renderer=");
            if (!(this.field_h instanceof ag)) {
              discarded$5 = param2.append(this.field_h);
              if (var6 != 0) {
                param2 = this.a(123, param1, 1 + param0, param2);
              }
            } else {
              param2 = this.a(123, param1, 1 + param0, param2);
            }
          }
          if (this.field_p != null) {
            discarded$6 = param2.append(" listener=");
            if (!(this.field_p instanceof ag)) {
              discarded$7 = param2.append(this.field_p);
              if (var6 == 0) {
                return;
              }
            }
            param2 = this.a(97, param1, 1 + param0, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ag.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, ag param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ag.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    protected ag() {
        this.field_o = 0;
        this.field_q = 0;
    }

    ag(String param0, nn param1, mh param2) {
        RuntimeException runtimeException = null;
        mi var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = 0;
        this.field_q = 0;
        try {
          this.field_h = param1;
          this.field_p = param2;
          this.field_n = param0;
          if (this.field_h instanceof mi) {
            var4 = (mi) ((Object) this.field_h);
            this.field_s = var4.a(false, this);
            this.field_x = var4.b(this, (byte) -79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ag.<init>(");
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
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ag(int param0, int param1, int param2, int param3, nn param4, mh param5) {
        this.field_o = 0;
        this.field_q = 0;
        try {
          this.field_m = param1;
          this.field_v = param0;
          this.field_x = param3;
          this.field_s = param2;
          this.field_p = param5;
          this.field_h = param4;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "ag.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 274) {
            return false;
          }
          this.field_u = false;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ag.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        if (!this.g(-9015)) {
          if (param2 != 80) {
            field_t = (td) null;
            var4 = param0;
            if (var4 == 80) {
              return this.a((byte) -93, this);
            }
            return false;
          }
          var4Lifetime3 = param0;
          if (var4Lifetime3 == 80) {
            return this.a((byte) -93, this);
          }
          return false;
        }
        if (this.a(274, this, param0, param1)) {
          return true;
        }
        if (param2 != 80) {
          field_t = (td) null;
          var4Lifetime1 = param0;
          if (var4Lifetime1 == 80) {
            return this.a((byte) -93, this);
          }
          return false;
        }
        var4Lifetime2 = param0;
        if (var4Lifetime2 == 80) {
          return this.a((byte) -93, this);
        }
        return false;
    }

    static {
        field_k = -1;
        field_j = "Rating: <col=ffffff><%0>";
        field_w = 0.0f;
    }
}
