/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rc extends gg {
    int field_t;
    static kb field_o;
    String field_z;
    dg field_n;
    int field_j;
    String field_i;
    jf field_h;
    int field_k;
    boolean field_v;
    int field_q;
    int field_u;
    static int field_l;
    static String field_s;
    int field_m;
    j field_w;
    static String field_p;
    static String field_y;
    int field_x;
    static java.awt.Image field_r;

    boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 > 33) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("rc.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(ad.field_m, gb.field_j, param0, param2, param1 - 18970) ? 1 : 0;
          if (param1 != 18874) {
            return;
          }
          stackIn_4_0 = var5_int;
          if (this.field_v) {
            stackIn_5_1 = 0;
          } else {
            stackIn_5_1 = 1;
          }
          if (stackIn_4_0 == stackIn_5_1) {
            stackIn_9_1 = (var5_int != 0);
            this.field_v = stackIn_9_1;
            if (null != this.field_n) {
              if (!(this.field_n instanceof mk)) {
                return;
              }
              ((mk) (this.field_n)).a(this, (byte) -121, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("rc.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_r = null;
        if (param0 == -24922) {
          field_p = null;
          field_s = null;
          field_o = null;
          return;
        }
        rc.a(32, 42, -124, -105, (o) null, -64, 78, (byte) 43);
        field_p = null;
        field_s = null;
        field_o = null;
    }

    final void b(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          discarded$0 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_m).append(",").append(this.field_j).append(" ").append(this.field_t).append("x").append(this.field_x);
          if (null != this.field_i) {
            discarded$1 = param0.append(" text=\"").append(this.field_i).append('"');
          }
          if (this.field_v) {
            discarded$2 = param0.append(" mouseover");
          }
          if (this.b(true)) {
            discarded$3 = param0.append(" focused");
          }
          if (this.field_w != null) {
            discarded$4 = param0.append(" renderer=");
            if (!(this.field_w instanceof rc)) {
              discarded$5 = param0.append(this.field_w);
              if (var6 != 0) {
                param0 = this.a(-100, param2, param0, 1 + param3);
              }
            } else {
              param0 = this.a(-100, param2, param0, 1 + param3);
            }
          }
          if (this.field_n != null) {
            discarded$6 = param0.append(" listener=");
            if (!(this.field_n instanceof rc)) {
              discarded$7 = param0.append(this.field_n);
              if (var6 != 0) {
                param0 = this.a(-57, param2, param0, 1 + param3);
              }
            } else {
              param0 = this.a(-57, param2, param0, 1 + param3);
            }
          }
          var5_int = 10 / ((param1 + 43) / 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("rc.DB(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        try {
          this.field_u = param1;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "rc.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 75 / ((param1 - 31) / 56);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 85) {
            rc.a(-41, (CharSequence) null);
          }
          stackIn_3_0 = wh.a(false, param1, (byte) -123);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rc.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final String toString() {
        return this.a(-43, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean b(boolean param0) {
        if (!param0) {
          field_r = (java.awt.Image) null;
          return false;
        }
        return false;
    }

    boolean a(int param0, rc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1463) {
            return false;
          }
          this.field_w = (j) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rc.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.b(true)) {
          var4 = param0;
          if (var4 != 80) {
            var4 = 2 / ((23 - param2) / 52);
            return false;
          }
          return this.a(-1463, this);
        }
        if (this.a(param1, (byte) -25, param0, this)) {
          return true;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 != 80) {
          var4Lifetime1 = 2 / ((23 - param2) / 52);
          return false;
        }
        return this.a(-1463, this);
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5;
        bc var6;
        int var7;
        bc var8;
        bc var9;
        bc var10;
        bc var11;
        bc var12;
        bc var14;
        bc var23;
        bc var24;
        int var5Lifetime1;
        var7 = SolKnight.field_L ? 1 : 0;
        if (param0 == -1) {
          this.a(param3, 18874, param1, this);
          var5 = this.b(true) ? 1 : 0;
          if (!param2) {
            if (var5 == 0) {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
            if (0 == hg.field_F) {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
            this.g(0);
            if (var7 == 0) {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
          }
          if (0 != cl.field_n &&
            var5 != 0) {
            this.a(param3, this, param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
            if (hg.field_F != 0) {
              if (this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, this)) {
                param2 = false;
                if (var7 != 0) {
                  this.g(0);
                }
              } else {
                this.g(0);
              }
            }
            if (wb.field_c != 0) {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
            if (ne.field_j == 0) {
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
            this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
            var8 = jf.field_a;
            if (var8 != null) {
              if (var8.field_n instanceof gk) {
                ((gk) (var8.field_n)).a((th) null, -7935, var8);
              }
              jf.field_a = null;
            }
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          L12: {
            if (hg.field_F != 0) {
              if (this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, this)) {
                param2 = false;
                if (var7 == 0) {
                  break L12;
                }
              }
              if (var5 != 0) {
                this.g(0);
              }
              if (wb.field_c != 0) {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
              if (ne.field_j == 0) {
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
              this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
              var9 = jf.field_a;
              if (var9 != null) {
                if (!(var9.field_n instanceof gk)) {
                  jf.field_a = null;
                } else {
                  ((gk) (var9.field_n)).a((th) null, -7935, var9);
                  jf.field_a = null;
                }
              }
              ne.field_j = wb.field_c;
              pd.a(125, this.c((byte) 78));
              return param2;
            }
          }
          if (wb.field_c != 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          if (ne.field_j == 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
          var10 = jf.field_a;
          if (var10 != null) {
            if (var10.field_n instanceof gk) {
              ((gk) (var10.field_n)).a((th) null, -7935, var10);
            }
            jf.field_a = null;
          }
          ne.field_j = wb.field_c;
          pd.a(125, this.c((byte) 78));
          return param2;
        }
        this.a(118, 41, -10, 127, -68);
        this.a(param3, 18874, param1, this);
        var5Lifetime1 = this.b(true) ? 1 : 0;
        if (!param2) {
          if (var5Lifetime1 == 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          if (0 == hg.field_F) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          this.g(0);
          if (var7 == 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
        }
        if (0 == cl.field_n) {
          L5: {
            if (hg.field_F != 0) {
              if (this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, this)) {
                param2 = false;
                if (var7 == 0) {
                  break L5;
                }
              }
              if (var5Lifetime1 != 0) {
                this.g(0);
                if (wb.field_c != 0) {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
                if (ne.field_j == 0) {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
                this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
                var11 = jf.field_a;
                if (var11 == null) {
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
                if (!(var11.field_n instanceof gk)) {
                  jf.field_a = null;
                  ne.field_j = wb.field_c;
                  pd.a(125, this.c((byte) 78));
                  return param2;
                }
                ((gk) (var11.field_n)).a((th) null, -7935, var11);
                jf.field_a = null;
                ne.field_j = wb.field_c;
                pd.a(125, this.c((byte) 78));
                return param2;
              }
            }
          }
          if (wb.field_c != 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          if (ne.field_j == 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
          var12 = jf.field_a;
          if (var12 != null) {
            if (var12.field_n instanceof gk) {
              ((gk) (var12.field_n)).a((th) null, -7935, var12);
            }
            jf.field_a = null;
          }
          ne.field_j = wb.field_c;
          pd.a(125, this.c((byte) 78));
          return param2;
        }
        if (var5Lifetime1 != 0) {
          this.a(param3, this, param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
          if (hg.field_F != 0) {
            if (this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, this)) {
              param2 = false;
              if (var7 != 0) {
                this.g(0);
              }
            } else {
              this.g(0);
            }
          }
          if (wb.field_c != 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          if (ne.field_j == 0) {
            ne.field_j = wb.field_c;
            pd.a(125, this.c((byte) 78));
            return param2;
          }
          this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
          var14 = jf.field_a;
          var6 = var14;
          if (var14 != null) {
            if (var14.field_n instanceof gk) {
              ((gk) (var14.field_n)).a((th) null, -7935, var14);
            }
            jf.field_a = null;
          }
          ne.field_j = wb.field_c;
          pd.a(125, this.c((byte) 78));
          return param2;
        }
        if (hg.field_F != 0 &&
          this.a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, this)) {
          param2 = false;
          if (var7 == 0) {
          }
        }
        if (wb.field_c != 0) {
          ne.field_j = wb.field_c;
          pd.a(125, this.c((byte) 78));
          return param2;
        }
        if (ne.field_j == 0) {
          ne.field_j = wb.field_c;
          pd.a(125, this.c((byte) 78));
          return param2;
        }
        this.a(ad.field_m, 0, this, param1, gb.field_j, param3);
        var24 = jf.field_a;
        if (var24 != null) {
          if (var24.field_n instanceof gk) {
            ((gk) (var24.field_n)).a((th) null, -7935, var24);
          }
          jf.field_a = null;
        }
        ne.field_j = wb.field_c;
        pd.a(125, this.c((byte) 78));
        return param2;
    }

    void g(int param0) {
        if (param0 != 0) {
          this.f(36);
        }
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            return true;
          }
          if (!this.a(param4, param3, param1, param5, -113)) {
            return false;
          }
          this.field_u = param0;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("rc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          if (param3 == 0) {
            return;
          }
          this.a(-1, 35, -37, -9);
          return;
        }
        if (null == this.field_w) {
          if (param3 == 0) {
            return;
          }
          this.a(-1, 35, -37, -9);
          return;
        }
        this.field_w.a((byte) 124, param0, true, param2, this);
        if (param3 == 0) {
          return;
        }
        this.a(-1, 35, -37, -9);
    }

    String c(byte param0) {
        if (param0 <= 14) {
          this.field_i = (String) null;
          if (this.field_v) {
            return this.field_z;
          }
          return null;
        }
        if (this.field_v) {
          return this.field_z;
        }
        return null;
    }

    int f(int param0) {
        int var2 = -86 / ((param0 - 17) / 43);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        var6 = SolKnight.field_L ? 1 : 0;
        if (param0 != 19550) {
          return;
        }
        var4 = this.f(-73);
        var5_int = 0;
        while (var5_int <= var4) {
          this.a(param2, var5_int, param1, 0);
          var5_int++;
          if (var6 == 0) {
            continue;
          }
          break;
        }
        var5 = va.a(true);
        if (var5 != null) {
          ph.field_f.a(20, kd.field_c, bf.field_a, var5);
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param2, -1, param1, param3)) {
            this.b(param2, -108, param1, param3);
          }
          if (param0 >= -41) {
            this.a(38, -79, 40, 69);
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rc.GA(").append(param0).append(',');
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_m = param2;
        this.field_j = param4;
        this.field_t = param1;
        if (param3 == 0) {
          this.field_x = param0;
          return;
        }
        rc.e(-46);
        this.field_x = param0;
    }

    final void d(int param0) {
        this.b(this.field_x, this.field_t, this.field_m, 0, this.field_j);
        if (param0 != 1) {
          this.a('�', (byte) -59, 25, (rc) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, o param4, int param5, int param6, byte param7) {
        int stackIn_38_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        o var21 = null;
        int[] var23 = null;
        int[] var24 = null;
        int stackIn_38_0Lifetime1;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          if (mi.field_b > param1) {
            param0 = param0 - (mi.field_b - param1);
            param1 = mi.field_b;
          }
          if (param5 < mi.field_l) {
            param2 = param2 - (-param5 + mi.field_l);
            param5 = mi.field_l;
          }
          if (mi.field_k < param1 + param0) {
            param0 = -param1 + mi.field_k;
          }
          if (param2 + param5 > mi.field_e) {
            param2 = -param5 + mi.field_e;
          }
          if (param0 > 0 &&
            0 < param2) {
            var21 = param4.c();
            var24 = mi.field_f;
            var10 = mi.field_a;
            var11 = mi.field_d;
            var23 = new int[4];
            mi.b(var23);
            param4.a();
            mi.d(var23[0], var23[1], var23[2], var23[3]);
            var13 = param4.field_p * param5 + param1;
            var14 = -param0 + param4.field_p;
            var15 = var21.field_v;
            if (param7 != 21) {
              field_p = (String) null;
            }
            var16 = param5;
            while (param2 + param5 > var16) {
              if (var19 != 0) {
                return;
              }
              var17 = param1;
              while (param0 + param1 > var17) {
                var18 = var15[var13];
                stackIn_38_0 = var18;
                if (stackIn_38_0 != 0 && (var17 > 0 &&
                  var15[-1 + var13] == 0 ||
                  var16 > 0 &&
                  var15[var13 - param4.field_p] == 0 ||
                  var17 < -1 + param4.field_p &&
                  var15[1 + var13] == 0 ||
                  !(var16 >= param4.field_t - 1) &&
                  var15[param4.field_p + var13] == 0)) {
                  mi.e(var17, var16, param3, param6);
                }
                var13++;
                var17++;
              }
              stackIn_38_0Lifetime1 = var13 + var14;
              var13 = stackIn_38_0Lifetime1;
              var16++;
            }
            var21.d(-param4.field_s, -param4.field_n);
            mi.a(var24, var10, var11);
            mi.a(var23);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("rc.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -52) {
          return true;
        }
        if (this.field_m + param2 > param1) {
          return false;
        }
        if (param0 < this.field_j + param3) {
          return false;
        }
        if (this.field_t + this.field_m + param2 <= param1) {
          return false;
        }
        if (param0 < this.field_x + (param3 + this.field_j)) {
          return true;
        }
        return false;
    }

    rc(String param0, dg param1) {
        this(param0, ph.field_f.field_a, param1);
    }

    final boolean a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            this.a(37, (rc) null);
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
          stackIn_9_1 = new StringBuilder().append("rc.VA(");
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
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    protected rc() {
        this.field_k = 0;
        this.field_q = 0;
    }

    rc(String param0, j param1, dg param2) {
        eg var4 = null;
        this.field_k = 0;
        this.field_q = 0;
        try {
          this.field_w = param1;
          this.field_n = param2;
          this.field_i = param0;
          if (this.field_w instanceof eg) {
            var4 = (eg) ((Object) this.field_w);
            this.field_t = var4.a(true, this);
            this.field_x = var4.a(this, -125);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "rc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rc(int param0, int param1, int param2, int param3, j param4, dg param5) {
        this.field_k = 0;
        this.field_q = 0;
        try {
          this.field_x = param3;
          this.field_n = param5;
          this.field_j = param1;
          this.field_m = param0;
          this.field_t = param2;
          this.field_w = param4;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "rc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Next Level";
        field_o = new kb();
        field_p = "Creating your account";
        field_y = "Email: ";
    }
}
