/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class na extends mc {
    static int field_y;
    int field_F;
    String field_C;
    int field_o;
    int field_t;
    int field_w;
    int field_E;
    static String[] field_p;
    static String field_G;
    hi field_D;
    static int[] field_v;
    kg field_H;
    int field_x;
    static String[] field_n;
    private static int[] field_B;
    dn field_s;
    static String field_q;
    static int[] field_z;
    int field_u;
    boolean field_r;
    String field_A;

    void f(int param0) {
        try {
          if (param0 >= -63) {
            this.field_r = false;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "na.UA(" + param0 + ')');
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4) {
        try {
          this.field_u = param0;
          this.field_w = param1;
          int var6_int = -28 / ((-61 - param2) / 51);
          this.field_F = param4;
          this.field_t = param3;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "na.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(na param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.b(aa.field_Nb, 1343807649, param1, param2, a.field_a) ? 1 : 0;
          stackIn_3_0 = var5_int;
          if (this.field_r) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          if (stackIn_3_0 == stackIn_4_1) {
            this.field_r = var5_int != 0;
            if (this.field_s != null &&
              this.field_s instanceof ol) {
              ((ol) (this.field_s)).a(var5_int != 0, 30162, this);
            }
          }
          if (!param3) {
            field_G = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_21_0 = runtimeException;
          stackIn_21_1 = new StringBuilder().append("na.MA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    StringBuilder a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -372494750) {
            field_z = (int[]) null;
          }
          if (this.a(param0, param2, 91, param1)) {
            this.a(-121, param1, param0, param2);
          }
          stackIn_8_0 = (StringBuilder) (param1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("na.WA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String e(int param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (this.field_r) {
            stackIn_7_0 = this.field_C;
          } else {
            stackIn_7_0 = null;
          }
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.IA(" + param0 + ')');
        }
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_t).append(",").append(this.field_w).append(" ").append(this.field_F).append("x").append(this.field_u);
          if (this.field_A != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_A).append('"');
          }
          if (this.field_r) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.c(3)) {
            discarded$3 = param1.append(" focused");
          }
          if (null != this.field_H) {
            discarded$4 = param1.append(" renderer=");
            if (!(this.field_H instanceof na)) {
              discarded$5 = param1.append(this.field_H);
              if (var6 != 0) {
                param1 = this.a(param2, param1, 1 + param3, -372494750);
              }
            } else {
              param1 = this.a(param2, param1, 1 + param3, -372494750);
            }
          }
          if (null != this.field_s) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_s instanceof na)) {
              discarded$7 = param1.append(this.field_s);
              if (var6 != 0) {
                param1 = this.a(param2, param1, 1 + param3, -372494750);
              }
            } else {
              param1 = this.a(param2, param1, 1 + param3, -372494750);
            }
          }
          if (param0 >= -106) {
            na.a(-1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("na.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(na param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.b(param6, 1343807649, param1, param3, param5)) {
            this.field_x = param2;
          }
          if (param4 != -32738) {
            this.field_A = (String) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_12_0 = var8;
          stackIn_12_1 = new StringBuilder().append("na.PA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_x = 0;
          if (param1) {
            this.field_E = 33;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("na.AB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        boolean stackIn_20_0 = false;
        ve stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ve var9 = null;
        int var10 = 0;
        var10 = TetraLink.field_J;
        try {
          var1_int = hd.field_q - ja.field_j;
          if (!param0) {
            field_v = (int[]) null;
          }
          ja.field_j = nh.field_Nb - (var1_int >> 1);
          ab.field_Q = -(hk.field_a >> 1) + fk.field_S;
          hd.field_q = var1_int + ja.field_j;
          var2 = ab.field_Q;
          var3 = 0;
          while (var3 < hk.field_b.length) {
            var4 = bi.field_c[var3];
            if (var10 != 0) {
              return;
            }
            if (var4 < 0) {
              var5 = wa.field_d;
            } else if (~var4 == ~hb.field_a.field_b) {
              var5 = bm.field_n;
            } else {
              var5 = uj.field_w;
            }
            var6 = hk.field_b[var3];
            stackIn_20_0 = !(0 > var4);
            var7 = tn.a(stackIn_20_0, 1, var6);
            var8 = -(var7 >> 1) + nh.field_Nb;
            if (var4 >= 0) {
              if (~hb.field_a.field_b == ~var4) {
                stackIn_27_0 = aa.field_Wb;
              } else {
                stackIn_27_0 = bn.field_b;
              }
              var9 = stackIn_27_0;
              var2 = var2 + cd.field_e;
              if (var9 != null) {
                var9.a(var2, var8 - ao.field_a, (byte) -126, var7 + (ao.field_a << 1), i.field_n + (hc.field_q << 1));
              }
              var2 = var2 + hc.field_q;
            }
            if (var4 < 0) {
              ko.field_u.b(var6, var8, var2 + h.field_a, var5, -1);
              var2 = var2 + hl.field_wb;
            } else {
              oi.field_a.b(var6, var8, var2 + nj.field_d, var5, -1);
              var2 = var2 + (hc.field_q + cd.field_e + i.field_n);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "na.KA(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          var2_int = 0;
          var3 = en.field_K;
          boolean decompiledSharedTail0 = !(5 > var3);
          if (!decompiledSharedTail0) {
            var2_int = var3 * var3 * 8192 / 1100;
            decompiledSharedTail0 = (var6 != 0);
          }
          if (decompiledSharedTail0) {
            if (var3 < 105) {
              var2_int = (var3 * 16384 - 40960) / 220;
              if (var6 != 0 &&
                var3 < 120) {
                var3 = -var3 + 120;
                var2_int = 8192 - var3 * var3 * 8192 / 3300;
              }
            } else {
              if (var3 < 120) {
                var3 = -var3 + 120;
                var2_int = 8192 - var3 * var3 * 8192 / 3300;
              }
            }
          }
          var4 = 1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
          }
          if (param0 == 1) {
            var5 = 1;
          }
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
          }
          if (param1) {
            na.a(-61, true);
          }
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param0 == 14) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 15) {
            var4 = 1;
            var5 = 1;
          }
          bk.field_k = fk.a(var5 * var2_int, (byte) -67, var2_int * var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.CB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        try {
          field_v = null;
          field_p = null;
          field_n = null;
          field_z = null;
          field_B = null;
          field_G = null;
          field_q = null;
          if (param0 != 101) {
            na.c((byte) 52);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "na.TA(" + param0 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = this.a(new Hashtable(), new StringBuilder(), 0, -372494750).toString();
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "na.toString()");
        }
    }

    na(String param0, dn param1) {
        this(param0, dh.field_q.field_e, param1);
    }

    final void b(byte param0) {
        try {
          this.a(this.field_u, this.field_w, -117, this.field_t, this.field_F);
          if (param0 <= 4) {
            this.field_t = -71;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "na.VA(" + param0 + ')');
        }
    }

    boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            this.d(-61);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("na.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          var4_int = this.d(param2 + 23335);
          var5_int = 0;
          if (param2 != -23452) {
            this.d(-24);
          }
          while (var5_int <= var4_int) {
            this.a(0, param1, param0, var5_int);
            var5_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var5 = tl.h(8);
          if (var5 != null) {
            dh.field_q.a(var5, ph.field_z, fi.field_Db, -63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "na.GB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    int d(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -114) {
            this.field_t = 76;
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.RA(" + param0 + ')');
        }
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3) {
        boolean stackIn_48_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ed var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          if (param3) {
            this.a((na) null, -123);
          }
          this.a(this, param0, param2, true);
          var5_int = this.c(3) ? 1 : 0;
          if (param1) {
            if (hc.field_p != 0 &&
              var5_int != 0) {
              this.a(-19137, this, param2, a.field_a, param0, aa.field_Nb, hc.field_p);
            }
            if (tm.field_t != 0) {
              if (this.a(this, param0, tm.field_t, param2, -32738, li.field_o, ci.field_B)) {
                param1 = false;
                if ((var7 != 0) &&
                  (var5_int != 0)) {
                  this.f(-101);
                }
              } else {
                if (var5_int != 0) {
                  this.f(-101);
                }
              }
            }
            if ((ho.field_X == 0) &&
              (fl.field_q != 0)) {
              this.a(a.field_a, false, this, param2, aa.field_Nb, param0);
              var6 = gi.field_c;
              if (var6 != null) {
                if (var6.field_s instanceof hf) {
                  ((hf) (var6.field_s)).a(var6, 87, (te) null);
                }
                gi.field_c = null;
              }
              if ((var7 != 0) && (var5_int != 0 &&
                tm.field_t != 0)) {
                this.f(-119);
              }
            }
          } else {
            if (var5_int != 0 &&
              tm.field_t != 0) {
              this.f(-119);
            }
          }
          fl.field_q = ho.field_X;
          bh.a(-57, this.e(0));
          stackIn_48_0 = param1;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "na.BB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.c(3) &&
            this.a(param0, param1, param2 + 82, this)) {
            return true;
          }
          if (param2 != -81) {
            this.c(-34);
          }
          var4_int = param0;
          if (var4_int == 80) {
            stackIn_13_0 = this.a(this, -384169950);
            return stackIn_13_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var4), "na.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            this.field_t = -110;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "na.JA(" + param0 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1343807649) {
            field_z = (int[]) null;
          }
          stackIn_16_0 = (param2 + this.field_t <= param0) && (param3 + this.field_w <= param4) && (this.field_F + this.field_t + param2 > param0) && (param3 - (-this.field_w - this.field_u) > param4);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var6), "na.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 37) {
            return true;
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
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("na.SA(");
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
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 == 0 &&
            null != this.field_H) {
            this.field_H.a(this, param1, param2, true, true);
          }
          if (param0 != 0) {
            this.field_D = (hi) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var5), "na.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(na param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -384169950) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("na.EB(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, na param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -19137) {
            this.toString();
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("na.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int[] param0, boolean param1, int[] param2, int param3, boolean param4, boolean param5, id param6) {
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = TetraLink.field_J;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[param3] >> 2;
          var28 = param0[10] >> 2;
          var29 = param0[11] >> 2;
          var12 = var23 * param2[5] + var22 * param2[4] + param2[3] * var21 >> 14;
          var13 = var24 * param2[3] + var25 * param2[4] + param2[5] * var26 >> 14;
          var20 = param2[9] * var27 + var28 * param2[10] + param2[11] * var29 >> 14;
          var14 = param2[4] * var28 + (var27 * param2[3] + var29 * param2[5]) >> 14;
          var19 = var26 * param2[11] + (param2[10] * var25 + param2[9] * var24) >> 14;
          var16 = var25 * param2[7] + (var24 * param2[6] + param2[8] * var26) >> 14;
          var18 = var21 * param2[9] + param2[10] * var22 + param2[11] * var23 >> 14;
          var15 = var23 * param2[8] + (var21 * param2[6] + var22 * param2[7]) >> 14;
          var17 = var29 * param2[8] + param2[7] * var28 + var27 * param2[6] >> 14;
          var21Lifetime1 = param2[0] - param0[0];
          var22Lifetime1 = -param0[1] + param2[1];
          var23Lifetime1 = -param0[2] + param2[2];
          var9 = var21Lifetime1 * param0[3] + (param0[4] * var22Lifetime1 + var23Lifetime1 * param0[5]) >> -mh.field_a + 16;
          var10 = param0[8] * var23Lifetime1 + var22Lifetime1 * param0[7] + var21Lifetime1 * param0[6] >> 16 - mh.field_a;
          var11 = param0[10] * var22Lifetime1 + param0[9] * var21Lifetime1 + var23Lifetime1 * param0[11] >> 16;
          var21Lifetime2 = vn.field_a;
          var22Lifetime2 = vn.field_f;
          var23Lifetime2 = 0;
          L2: while (true) {
            if (param6.field_q > var23Lifetime2) {
              var24Lifetime1 = param6.field_D[var23Lifetime2];
              var25Lifetime1 = param6.field_i[var23Lifetime2];
              var26Lifetime1 = param6.field_R[var23Lifetime2];
              var27Lifetime1 = var9 + (var18 * var26Lifetime1 + (var24Lifetime1 * var12 + var25Lifetime1 * var15) >> -mh.field_a + 16);
              var28Lifetime1 = var10 + (var19 * var26Lifetime1 + var25Lifetime1 * var16 + var24Lifetime1 * var13 >> 16 - mh.field_a);
              var29Lifetime1 = var11 + (var14 * var24Lifetime1 + var25Lifetime1 * var17 + var20 * var26Lifetime1 >> 16);
              stackIn_60_0 = var29Lifetime1;
              stackIn_60_1 = 50;
              if (var30 == 0) {
                if (stackIn_60_0 >= stackIn_60_1) {
                  lj.field_b[var23Lifetime2] = var27Lifetime1 / var29Lifetime1 + var21Lifetime2;
                  pl.field_f[var23Lifetime2] = var22Lifetime2 + var28Lifetime1 / var29Lifetime1;
                  if (var29Lifetime1 < var7_int) {
                    var7_int = var29Lifetime1;
                  }
                  if (var8 < var29Lifetime1) {
                    var8 = var29Lifetime1;
                  }
                  nc.field_b[var23Lifetime2] = var29Lifetime1;
                } else {
                  nc.field_b[var23Lifetime2] = -2147483648;
                }
                if (param4) {
                  oa.field_q[var23Lifetime2] = var27Lifetime1 >> mh.field_a;
                  jg.field_e[var23Lifetime2] = var28Lifetime1 >> mh.field_a;
                  bk.field_d[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (param6.field_F != null &&
                null != param6.field_G &&
                null != param6.field_B &&
                param6.field_C != null &&
                param6.field_E != null &&
                null != param6.field_H &&
                param6.field_c != null &&
                null != param6.field_z &&
                param6.field_h != null) {
                var23Lifetime2 = 0;
                while (!(param6.field_s <= var23Lifetime2)) {
                  var24Lifetime1 = param6.field_F[var23Lifetime2];
                  var25Lifetime1 = param6.field_G[var23Lifetime2];
                  var26Lifetime1 = param6.field_B[var23Lifetime2];
                  lb.field_S[var23Lifetime2] = (var18 * var26Lifetime1 + var24Lifetime1 * var12 + var15 * var25Lifetime1 >> 16) + var9;
                  em.field_i[var23Lifetime2] = var10 + (var24Lifetime1 * var13 + var25Lifetime1 * var16 + var26Lifetime1 * var19 >> 16);
                  pe.field_a[var23Lifetime2] = (var14 * var24Lifetime1 + (var17 * var25Lifetime1 + var26Lifetime1 * var20) >> 16) + var11;
                  var24Lifetime1 = param6.field_C[var23Lifetime2];
                  var25Lifetime1 = param6.field_E[var23Lifetime2];
                  var26Lifetime1 = param6.field_H[var23Lifetime2];
                  mb.field_w[var23Lifetime2] = var9 + (var26Lifetime1 * var18 + var25Lifetime1 * var15 + var12 * var24Lifetime1 >> 16);
                  pm.field_e[var23Lifetime2] = (var26Lifetime1 * var19 + (var13 * var24Lifetime1 + var16 * var25Lifetime1) >> 16) + var10;
                  lb.field_Q[var23Lifetime2] = var11 + (var20 * var26Lifetime1 + (var25Lifetime1 * var17 + var24Lifetime1 * var14) >> 16);
                  var24Lifetime1 = param6.field_c[var23Lifetime2];
                  var25Lifetime1 = param6.field_z[var23Lifetime2];
                  var26Lifetime1 = param6.field_h[var23Lifetime2];
                  nl.field_f[var23Lifetime2] = (var26Lifetime1 * var18 + (var15 * var25Lifetime1 + var24Lifetime1 * var12) >> 16) + var9;
                  da.field_d[var23Lifetime2] = (var26Lifetime1 * var19 + var25Lifetime1 * var16 + var24Lifetime1 * var13 >> 16) + var10;
                  field_B[var23Lifetime2] = (var26Lifetime1 * var20 + var17 * var25Lifetime1 + var14 * var24Lifetime1 >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param1) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (!(param6.field_O <= var18)) {
                  stackIn_60_0 = ~var18;
                  stackIn_60_1 = ~kk.field_T.length;
                  if (var30 != 0) {
                    break L2;
                  }
                  if (stackIn_60_0 <= stackIn_60_1) {
                    break;
                  }
                  var19 = param6.field_l[var18];
                  var20 = param6.field_d[var18];
                  var21Lifetime2 = param6.field_y[var18];
                  kk.field_T[var18] = var20 * var12 + var19 * var9 + var21Lifetime2 * var15 >> 16;
                  bf.field_p[var18] = var16 * var21Lifetime2 + var10 * var19 + var13 * var20 >> 16;
                  od.field_X[var18] = var21Lifetime2 * var17 + (var14 * var20 + var19 * var11) >> 16;
                  var18++;
                }
              }
              stackIn_60_0 = var8;
              stackIn_60_1 = var7_int;
            }
            break;
          }
          nh.a(stackIn_60_0, stackIn_60_1, param6, true, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_65_0 = var7;
          stackIn_65_1 = new StringBuilder().append("na.FB(");
          if (param0 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    protected na() {
        this.field_E = 0;
        this.field_o = 0;
    }

    na(String param0, kg param1, dn param2) {
        RuntimeException runtimeException = null;
        jh var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_E = 0;
        this.field_o = 0;
        try {
          this.field_H = param1;
          this.field_A = param0;
          this.field_s = param2;
          if (this.field_H instanceof jh) {
            var4 = (jh) ((Object) this.field_H);
            this.field_F = var4.a(this, (byte) 36);
            this.field_u = var4.a(this, 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("na.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    na(int param0, int param1, int param2, int param3, kg param4, dn param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_E = 0;
        this.field_o = 0;
        try {
          this.field_t = param0;
          this.field_u = param3;
          this.field_s = param5;
          this.field_F = param2;
          this.field_w = param1;
          this.field_H = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("na.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_B = new int[8192];
        field_q = "This game has started.";
        field_p = new String[4];
        field_v = new int[4];
        field_z = new int[4];
        field_y = 0;
        field_n = new String[4];
        field_G = "Please enter your date of birth to enable chat:";
    }
}
