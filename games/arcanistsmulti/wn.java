/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wn extends qm implements a {
    static kc field_D;
    static String field_x;
    static String field_A;
    static km field_z;
    static int field_y;
    static int field_C;
    qm field_B;

    final boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_B = (qm) null;
          }
          stackIn_6_0 = (null != this.field_B) && (this.field_B.a(0, param1));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_x = null;
        if (param0 != 23123) {
          String var2 = (String) null;
          wn.a(-25, -49, false, (String) null, false, (String) null);
        }
        field_A = null;
        field_D = null;
    }

    final void d(byte param0) {
        if (param0 != 29) {
          field_y = -126;
        }
        if (null != this.field_B) {
          this.field_B.d((byte) 29);
        }
    }

    final static int a(int param0, int param1, boolean param2, String param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_7_0 = 0;
          int stackIn_34_0 = 0;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_52_0 = false;
          boolean stackIn_58_0 = false;
          int stackIn_85_0 = 0;
          int stackIn_92_0 = 0;
          int stackIn_96_0 = 0;
          int stackIn_105_0 = 0;
          int stackIn_107_0 = 0;
          RuntimeException stackIn_110_0 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          StringBuilder stackIn_113_1 = null;
          String stackIn_114_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (null == ch.field_c &&
              !ie.a(-62, param4)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (param1 < 22) {
              stackIn_7_0 = 41;
              return stackIn_7_0;
            }
            if (pc.field_g == ob.field_eb) {
              if (param4) {
                var10 = (String) null;
                fd.field_e = ci.a(false, (String) null, -95, fk.field_k, param5);
              } else {
                fd.field_e = cf.a(param3, param5, (byte) -128, false);
              }
              he.field_e.field_g = 0;
              he.field_e.f(14, (byte) -105);
              he.field_e.f(fd.field_e.a(0).field_g, (byte) -106);
              we.a(-1, (byte) 86);
              ob.field_eb = pe.field_Db;
            }
            if (ob.field_eb == pe.field_Db &&
              pe.a((byte) -86, 1)) {
              var6_int = df.field_z.e((byte) -123);
              df.field_z.field_g = 0;
              if (0 == var6_int) {
                ob.field_eb = go.field_c;
              } else {
                on.field_g = var6_int;
                fj.field_h = -1;
                ob.field_eb = lf.field_f;
              }
            }
            if (ob.field_eb == go.field_c &&
              pe.a((byte) -86, 8)) {
              of.field_j = df.field_z.c(-943038560);
              df.field_z.field_g = 0;
              dn.a(param4, fd.field_e, (byte) 116, param2, param0);
              ob.field_eb = co.field_h;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ob.field_eb == co.field_h &&
              pe.a((byte) -86, 1)) {
              var6_intLifetime1 = df.field_z.e((byte) -122);
              df.field_z.field_g = 0;
              rj.field_i = null;
              on.field_g = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  fj.field_h = -1;
                  ob.field_eb = lf.field_f;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ka.b(false);
                  bb.field_h = false;
                  stackIn_34_0 = var6_intLifetime1;
                  return stackIn_34_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ob.field_eb = bb.field_c;
                fj.field_h = -1;
              }
            }
            if (ob.field_eb == bb.field_c &&
              pn.b(-12564)) {
              fk.field_k = df.field_z.c(-943038560);
              fn.field_f = param5;
              qf.field_d = df.field_z.e((byte) 115);
              ib.field_r = df.field_z.e((byte) 93);
              ah.field_c = df.field_z.n(-98);
              var6 = df.field_z.g(103);
              var7 = df.field_z.e((byte) -94);
              if ((1 & var7) != 0) {
                j.b(-69);
              }
              if (!param4) {
                stackIn_46_0 = ((4 & var7) != 0);
                fd.field_a = stackIn_46_0;
                stackIn_49_0 = (0 != (var7 & 2));
                ld.field_p = stackIn_49_0;
                stackIn_52_0 = ((var7 & 8) != 0);
                wh.field_g = stackIn_52_0;
                if (wh.field_g) {
                  ld.field_p = true;
                }
              }
              stackIn_58_0 = (0 != (16 & var7));
              ag.field_E = stackIn_58_0;
              if (fl.field_a) {
                df.field_z.e((byte) 110);
                ne.field_g = df.field_z.e((byte) -115);
                df.field_z.d(-10674);
                wd.field_d = df.field_z.n(-98);
                ra.field_f = new byte[wd.field_d];
                for (var8 = 0; var8 < wd.field_d; var8++) {
                  ra.field_f[var8] = df.field_z.o(6);
                }
              }
              ah.field_b = df.field_z.l(-1);
              var11 = (CharSequence) ((Object) ah.field_b);
              nm.field_b = gk.a(var11, -13);
              dd.field_j = df.field_z.e((byte) 65);
              ob.field_eb = qc.field_c;
              if (fd.field_e.a(0) == k.field_q) {
                ea.field_y.a(cd.e(118), (byte) -93);
              } else {
                if (fd.field_e.a(0) == hk.field_m) {
                  of.field_n.a(cd.e(120), (byte) -118);
                }
              }
              bb.field_h = false;
              if (var6 != null) {
                jf.a(var6, cd.e(108), 0);
              }
              if (0 >= ah.field_c &&
                !fd.field_a) {
                try {
                  ei.a(cd.e(125), 108, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  ei.a("zap", cd.e(113), (byte) 114, new Object[]{rl.a(fk.field_k, 29424)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (ah.field_c > 0) {
                lk.field_d = true;
              }
              he.field_e.b(-107, hj.field_a);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                hj.field_a[var8Lifetime1] = hj.field_a[var8Lifetime1] + 50;
              }
              df.field_z.b(90, hj.field_a);
              stackIn_85_0 = on.field_g;
              return stackIn_85_0;
            }
            if (ob.field_eb == lf.field_f &&
              pn.b(-12564)) {
              ka.b(false);
              if (7 == on.field_g &&
                !bb.field_h) {
                bb.field_h = true;
                stackIn_92_0 = -1;
                return stackIn_92_0;
              }
              if (on.field_g == 7) {
                on.field_g = 3;
              }
              me.field_E = df.field_z.l(-1);
              bb.field_h = false;
              stackIn_96_0 = on.field_g;
              return stackIn_96_0;
            }
            if (null == ch.field_c) {
              if (bb.field_h) {
                if (rk.a(-68) <= 30000L) {
                  me.field_E = wl.field_R;
                } else {
                  me.field_E = tg.field_a;
                }
                bb.field_h = false;
                stackIn_105_0 = 3;
                return stackIn_105_0;
              }
              var6_intLifetime2 = ng.field_G;
              ng.field_G = dh.field_Lb;
              bb.field_h = true;
              dh.field_Lb = var6_intLifetime2;
            }
            stackIn_107_0 = -1;
            return stackIn_107_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_110_0 = var6_ref;
            stackIn_110_1 = new StringBuilder().append("wn.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            stackIn_113_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_114_2 = "null";
            } else {
              stackIn_114_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    String b(boolean param0) {
        String var3 = null;
        String var2 = super.b(param0);
        if (this.field_B != null) {
          var3 = this.field_B.b(param0);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    qm a(int param0) {
        if (param0 < 31) {
          return (qm) null;
        }
        qm var2 = this.field_B;
        if (var2 == null) {
          return null;
        }
        if (!var2.d(-2116)) {
          return null;
        }
        return var2;
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
          var5_int = 43 % ((param3 - 50) / 60);
          if (this.a(param0, (byte) -90, param2, param1)) {
            this.a(param0, param1, param2, 1);
            this.a(0, param2, param0, param1);
          }
          stackIn_3_0 = (StringBuilder) (param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wn.FA(");
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

    final boolean d(int param0) {
        if (param0 != -2116) {
          this.d(-106);
        }
        return null != this.a(103) ? true : false;
    }

    wn(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    void a(byte param0, int param1, int param2, int param3) {
        if (param2 == 0 &&
          null != this.field_r) {
          this.field_r.a((qm) (this), 5592405, param1, param3, true);
        }
        if (param0 > -52) {
          this.c(14);
        }
        if (this.field_B != null) {
          this.field_B.a((byte) -100, param1 + this.field_n, param2, param3 + this.field_j);
        }
    }

    final void a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$10 = null;
        int var5_int = 0;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$11 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          discarded$10 = param2.append('\n');
          for (var5_int = param0; var5_int <= param3; var5_int++) {
            discarded$12 = param2.append(' ');
          }
          if (this.field_B != null) {
            this.field_B.a(param2, 1 + param3, param1, (byte) -93);
          } else {
            discarded$11 = param2.append("null");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("wn.P(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != 0) {
          dj var3 = (dj) null;
          wn.a((byte) 24, (dj) null);
        }
        return this.field_B == null ? 0 : this.field_B.c(0);
    }

    private final boolean a(qm param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return true;
          }
          stackIn_8_0 = (null != this.field_B) && (!this.field_B.d(param1 ^ -2116)) && (this.field_B.a(param1 ^ 0, param0));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wn.K(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (null != this.field_B) {
            this.field_B.a(param0, -20592, param2, this.field_j + param3, this.field_n + param4, param5);
          }
          if (param1 != -20592) {
            field_C = 79;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("wn.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != 0) {
            this.field_B = (qm) null;
          }
          stackIn_7_0 = (this.field_B != null) && (this.field_B.d(-2116)) && (this.field_B.a(param0, param1, param2, param3, param4, 0, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("wn.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B != null &&
            this.field_B.d(-2116) &&
            this.field_B.a(param0, (byte) -127, param2, param3)) {
            return true;
          }
          if (param1 > -120) {
            this.b(false);
          }
          var5_int = param3;
          if (var5_int != 80) {
            return false;
          }
          if (ri.field_b[81]) {
            stackIn_13_0 = this.a(param0, 0);
          } else {
            stackIn_13_0 = this.a(false, param0);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("wn.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = -70 % ((-42 - param4) / 35);
          stackIn_4_0 = (null != this.field_B) && (this.field_B.a(param0, param1, param2, param3 + this.field_j, 53, param5, this.field_n + param6));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wn.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(byte param0, dj param1) {
        try {
          if (param0 != 111) {
            dj var3 = (dj) null;
            wn.a((byte) 9, (dj) null);
          }
          mc.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wn.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1, param2, param3);
          if (null != this.field_B) {
            this.field_B.a(param0, this.field_n + param1, param2 ^ 0, this.field_j + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("wn.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -75) {
          qm var3 = (qm) null;
          discarded$0 = this.a(true, (qm) null);
        }
        if (null != this.field_B) {
          this.field_B.e((byte) 100);
        }
    }

    private final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          stackIn_8_0 = (null != this.field_B) && (!this.field_B.d(-2116)) && (this.field_B.a(0, param1));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 >= -49) {
          StringBuilder var7 = (StringBuilder) null;
          this.a(-47, (Hashtable) null, (StringBuilder) null, -126);
        }
        super.a(param0, param1, param2, param3, -75);
        this.a((byte) -75);
    }

    static {
        field_x = " wand";
        field_A = "Graveyard:";
        field_C = 0;
    }
}
