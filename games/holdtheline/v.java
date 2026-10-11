/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class v extends n implements jm {
    ah field_D;
    static int field_C;
    static String[][] field_A;
    static int field_E;
    static int field_B;

    final void a(boolean param0, n param1) {
        if (!param0) {
          return;
        }
        try {
          this.field_D.a((byte) -94, param1);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "v.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        tm var5 = null;
        n var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = HoldTheLine.field_D;
        try {
          if (param1 != 0) {
            return;
          }
          var5 = new tm(this.field_D);
          var6 = (n) (var5.c((byte) -114));
          while (var6 != null) {
            discarded$3 = param3.append('\n');
            for (var7 = 0; param2 >= var7; var7++) {
              discarded$4 = param3.append(' ');
            }
            var6.a(1 + param2, (byte) 67, param0, param3);
            var6 = (n) (var5.a((byte) -104));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("v.QB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, int param2, int param3, int param4) {
        try {
          nj.field_i.a(param3, param4);
          nm.field_c.a(param1, 15 + param3, -2 + (param4 + (nm.field_c.field_G + 30) / 2), param2, -1);
          int var5_int = 72 / ((param0 + 43) / 61);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "v.PB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, boolean param4, int param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_29_0 = 0;
          boolean stackIn_40_0 = false;
          boolean stackIn_43_0 = false;
          int stackIn_71_0 = 0;
          int stackIn_78_0 = 0;
          int stackIn_82_0 = 0;
          int stackIn_91_0 = 0;
          int stackIn_95_0 = 0;
          RuntimeException stackIn_98_0 = null;
          StringBuilder stackIn_98_1 = null;
          String stackIn_99_2 = null;
          StringBuilder stackIn_101_1 = null;
          String stackIn_102_2 = null;
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
          var9 = HoldTheLine.field_D;
          try {
            if (null == lk.field_h &&
              !le.a(param4, (byte) 105)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (a.field_S == d.field_f) {
              if (param4) {
                var10 = (String) null;
                qk.field_j = eb.a((String) null, vd.field_a, false, param3, true);
              } else {
                qk.field_j = wi.a((byte) 126, false, param2, param3);
              }
              da.field_p.field_l = 0;
              da.field_p.f(param1 ^ 110, 14);
              da.field_p.f(param1 + 110, qk.field_j.a(true).field_a);
              qn.a(-1, param1 ^ 1);
              d.field_f = um.field_d;
            }
            if (um.field_d == d.field_f &&
              hi.b(1, (byte) 40)) {
              var6_int = rd.field_e.f((byte) -102);
              rd.field_e.field_l = 0;
              if (var6_int == 0) {
                d.field_f = pb.field_c;
              } else {
                vn.field_c = var6_int;
                d.field_f = uj.field_d;
                ad.field_c = -1;
              }
            }
            if (pb.field_c == d.field_f &&
              hi.b(8, (byte) 40)) {
              qj.field_H = rd.field_e.d(true);
              rd.field_e.field_l = 0;
              dd.a(param1 ^ 1, param5, param0, qk.field_j, param4);
              d.field_f = ui.field_l;
            }
            boolean decompiledFrameRemainder0 = true;
            if (d.field_f == ui.field_l &&
              hi.b(1, (byte) 40)) {
              var6_intLifetime1 = rd.field_e.f((byte) -128);
              vn.field_c = var6_intLifetime1;
              rd.field_e.field_l = 0;
              ok.field_f = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  d.field_f = uj.field_d;
                  ad.field_c = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  r.a(param1 ^ -28035);
                  uk.field_e = false;
                  stackIn_29_0 = var6_intLifetime1;
                  return stackIn_29_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ad.field_c = -1;
                d.field_f = fb.field_s;
              }
            }
            if (fb.field_s == d.field_f &&
              ok.a((byte) 55)) {
              vd.field_a = rd.field_e.d(true);
              rb.field_x = rd.field_e.f((byte) -33);
              rd.field_e.f((byte) -43);
              fc.field_a = rd.field_e.k(-119);
              var6 = rd.field_e.i(-1);
              var7 = rd.field_e.f((byte) -57);
              if (0 != (var7 & 1)) {
                j.a((byte) 66);
              }
              if (!param4) {
                stackIn_40_0 = ((4 & var7) != 0);
                uj.field_c = stackIn_40_0;
                stackIn_43_0 = ((8 & var7) != 0);
                ci.field_h = stackIn_43_0;
                if (!ci.field_h) {
                }
              }
              if (mi.field_f) {
                rd.field_e.f((byte) -53);
                rd.field_e.f((byte) -82);
                rd.field_e.a(-116);
                ho.field_l = rd.field_e.k(-59);
                im.field_i = new byte[ho.field_l];
                for (var8 = 0; ho.field_l > var8; var8++) {
                  im.field_i[var8] = rd.field_e.f(wb.a(param1, 1));
                }
              }
              ng.field_e = rd.field_e.j(-1231);
              var11 = (CharSequence) ((Object) ng.field_e);
              co.field_e = kf.a(var11, (byte) -12);
              q.field_c = rd.field_e.f((byte) -95);
              d.field_f = ad.field_b;
              if (qk.field_j.a(true) == sb.field_d) {
                ja.field_Wb.a(en.a(87), 127);
              } else {
                if (qk.field_j.a(true) == jh.field_d) {
                  gj.field_s.a(en.a(97), 125);
                }
              }
              uk.field_e = false;
              if (var6 != null) {
                tm.a(-32312, var6, en.a(73));
              }
              if (fc.field_a <= 0 &&
                !uj.field_c) {
                try {
                  eo.a(21896, "unzap", en.a(92));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  eo.a(en.a(param1 ^ 79), new Object[]{kk.a(true, vd.field_a)}, false, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (fc.field_a > 0) {
                hc.field_b = true;
              }
              da.field_p.a(gb.field_x, false);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                gb.field_x[var8Lifetime1] = gb.field_x[var8Lifetime1] + 50;
              }
              rd.field_e.a(gb.field_x, false);
              stackIn_71_0 = vn.field_c;
              return stackIn_71_0;
            }
            if (d.field_f == uj.field_d &&
              ok.a((byte) 55)) {
              r.a(-28036);
              if (vn.field_c == 7 &&
                !uk.field_e) {
                uk.field_e = true;
                stackIn_78_0 = -1;
                return stackIn_78_0;
              }
              if (vn.field_c == 7) {
                vn.field_c = 3;
              }
              um.field_b = rd.field_e.j(param1 - 1232);
              uk.field_e = false;
              stackIn_82_0 = vn.field_c;
              return stackIn_82_0;
            }
            if (null == lk.field_h) {
              if (uk.field_e) {
                if (30000L < sf.d(126)) {
                  um.field_b = mo.field_y;
                } else {
                  um.field_b = dc.field_hb;
                }
                uk.field_e = false;
                stackIn_91_0 = 3;
                return stackIn_91_0;
              }
              var6_intLifetime2 = bo.field_e;
              bo.field_e = ci.field_b;
              ci.field_b = var6_intLifetime2;
              uk.field_e = true;
            }
            if (param1 != 1) {
              field_B = -82;
            }
            stackIn_95_0 = -1;
            return stackIn_95_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_98_0 = var6_ref;
            stackIn_98_1 = new StringBuilder().append("v.HB(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_99_2 = "null";
            } else {
              stackIn_99_2 = "{...}";
            }
            stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',');
            if (param3 == null) {
              stackIn_102_2 = "null";
            } else {
              stackIn_102_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, n param1, int param2, int param3, byte param4, int param5) {
        RuntimeException runtimeException = null;
        tm var7 = null;
        n var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = HoldTheLine.field_D;
        try {
          var7 = new tm(this.field_D);
          if (param4 != -9) {
            return;
          }
          var8 = (n) (var7.c((byte) -128));
          while (var8 != null) {
            if (var8.b(111)) {
              var8.a(param0, param1, param2 + this.field_o, this.field_k + param3, (byte) -9, param5);
              var8 = (n) (var7.a((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("v.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 != -20) {
          n var3 = (n) null;
          this.a(25, (n) null, 78, 2, 104, 42, -126);
        }
        return this.f((byte) 118) != null ? true : false;
    }

    public static void e(byte param0) {
        field_A = (String[][]) null;
        if (param0 != 70) {
          field_C = -41;
        }
    }

    boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        n var8 = null;
        tm var9 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          var9 = new tm(this.field_D);
          var8 = (n) (var9.c((byte) -120));
          while (var8 != null) {
            if (var8.b(68)) {
              if (var8.c((byte) -20) &&
                var8.a(param0, param1, (byte) -78, param3)) {
                return true;
              }
              var8 = (n) (var9.a((byte) -104));
              continue;
            }
            break;
          }
          var6 = param1;
          if (80 == var6) {
            if (lk.field_g[81]) {
              stackIn_15_0 = this.c(param0, param2 + 77);
            } else {
              stackIn_15_0 = this.b(param0, 116);
            }
            return stackIn_15_0;
          }
          if (param2 == -78) {
            return false;
          }
          field_E = 5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("v.T(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        tm var8 = null;
        RuntimeException var8_ref = null;
        n var9 = null;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          var8 = new tm(this.field_D);
          var9 = (n) (var8.c((byte) -114));
          if (param4 != -108) {
            return false;
          }
          while (var9 != null) {
            if (var9.b(param4 ^ -92)) {
              if (!var9.a(this.field_k + param0, param1, this.field_o + param2, param3, (byte) -108, param5, param6)) {
                var9 = (n) (var8.a((byte) -104));
                continue;
              }
              return true;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("v.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int d(byte param0) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var2 = 0;
        tm var3 = new tm(this.field_D);
        if (param0 >= -66) {
          field_A = (String[][]) null;
        }
        n var4 = (n) (var3.c((byte) 119));
        while (var4 != null) {
          var5 = var4.d((byte) -123);
          if (var5 > var2) {
            var2 = var5;
          }
          var4 = (n) (var3.a((byte) -104));
        }
        return var2;
    }

    void a(int param0, n param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          super.a(param0, param1, param2, param3);
          var5 = new tm(this.field_D);
          var6 = (n) (var5.c((byte) -115));
          while (var6 != null) {
            if (var6.b(55)) {
              var6.a(this.field_k + param0, param1, param2 + this.field_o, (byte) -3);
              var6 = (n) (var5.a((byte) -104));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("v.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = HoldTheLine.field_D;
        if (param3 == 0 &&
          null != this.field_l) {
          this.field_l.a(true, param2, -76, (n) (this), param1);
        }
        tm var5 = new tm(this.field_D);
        if (param0 != -9532) {
          return;
        }
        n var6 = (n) (var5.a(8115));
        while (var6 != null) {
          var6.a(-9532, param1 + this.field_o, param2 + this.field_k, param3);
          var6 = (n) (var5.a(false));
        }
    }

    final static boolean a(th param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.f((byte) -26);
          stackIn_3_0 = (1 != var2_int) ? 0 : 1;
          var3 = stackIn_3_0;
          if (param1 > 56) {
            stackIn_7_0 = var3;
            return stackIn_7_0 != 0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("v.DB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, ib param6, boolean param7, long param8, String param9, int param10, int param11, boolean param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            rd.field_e = new da(param2);
            da.field_p = new da(param3);
            de.field_L = param11;
            ci.field_n = param13;
            na.field_s = param6;
            hc.field_b = param1;
            ce.field_m = param10;
            ci.field_b = param4;
            if (!param12) {
              field_E = 98;
            }
            uj.field_f = param9;
            ih.field_i = param8;
            bo.field_e = param5;
            oi.field_b = param0;
            mi.field_f = param7;
            if (null != na.field_s.field_a) {
              try {
                ao.field_c = new ud(na.field_s.field_a, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("v.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',');
            if (param9 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    v(int param0, int param1, int param2, int param3, dh param4) {
        super(param0, param1, param2, param3, param4, (tb) null);
        this.field_D = new ah();
    }

    final boolean a(n param0, int param1) {
        tm var3 = null;
        RuntimeException var3_ref = null;
        n var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          var3 = new tm(this.field_D);
          if (param1 != -25823) {
            return true;
          }
          var4 = (n) (var3.c((byte) -2));
          while (true) {
            if (var4 == null) {
              return false;
            }
            if (!var4.a(param0, -25823)) {
              var4 = (n) (var3.a((byte) -104));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("v.NB(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param1 <= 97) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 54), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("v.GB(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(int param0) {
        String var4 = null;
        int var5 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        n var3 = (n) (var2.c((byte) -118));
        while (var3 != null) {
          var4 = var3.f(param0 + 0);
          if (var4 != null) {
            return var4;
          }
          var3 = (n) (var2.a((byte) -104));
        }
        if (param0 == 0) {
          return null;
        }
        StringBuilder var6 = (StringBuilder) null;
        this.a((Hashtable) null, 49, 4, (StringBuilder) null);
        return null;
    }

    final boolean b(n param0, int param1) {
        RuntimeException var3 = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        tm var8 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param1 < 111) {
            return true;
          }
          if (this.field_D.b(0)) {
            return false;
          }
          var8 = new tm(this.field_D);
          var4 = (n) (var8.c((byte) -119));
          while (var4 != null) {
            if (var4.c((byte) -20)) {
              var5 = new tm(this.field_D);
              var5.a(var4, (byte) -125);
              var6 = (n) (var5.a((byte) -104));
              while (var6 != null) {
                if (!var6.a(param0, -25823)) {
                  var6 = (n) (var5.a((byte) -104));
                  continue;
                }
                return true;
              }
            }
            var4 = (n) (var8.a((byte) -104));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("v.MB(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        if (param0 != 15) {
          n var5 = (n) null;
          this.a((n) null, 83);
        }
        n var3 = (n) (var2.c((byte) -114));
        while (var3 != null) {
          var3.g(92);
          var3 = (n) (var2.a((byte) -104));
        }
    }

    final StringBuilder a(int param0, byte param1, Hashtable param2, StringBuilder param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(20720, param2, param3, param0)) {
            this.a(param2, param0, true, param3);
            this.a(param2, 0, param0, param3);
          }
          var5_int = -111 % ((0 - param1) / 49);
          stackIn_4_0 = (StringBuilder) (param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("v.PA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, n param1, int param2, int param3, int param4, int param5, int param6) {
        tm var8 = null;
        RuntimeException var8_ref = null;
        n var9 = null;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = HoldTheLine.field_D;
        try {
          var8 = new tm(this.field_D);
          if (param6 != -24898) {
            return true;
          }
          var9 = (n) (var8.c((byte) 61));
          while (var9 != null) {
            if (var9.b(72)) {
              if (var9.c((byte) -20) &&
                var9.a(param0, param1, param2, param3, param4, param5, param6 + 0)) {
                return true;
              }
              var9 = (n) (var8.a((byte) -104));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_17_0 = var8_ref;
          stackIn_17_1 = new StringBuilder().append("v.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void e(int param0) {
        int var4 = HoldTheLine.field_D;
        tm var2 = new tm(this.field_D);
        n var3 = (n) (var2.c((byte) -122));
        if (param0 < 15) {
          return;
        }
        while (var3 != null) {
          var3.e(55);
          var3 = (n) (var2.a((byte) -104));
        }
    }

    final boolean c(n param0, int param1) {
        RuntimeException var3 = null;
        n var4 = null;
        tm var5 = null;
        n var6 = null;
        int var7 = 0;
        tm var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (this.field_D.b(0)) {
            return false;
          }
          if (param1 != -1) {
            return true;
          }
          var8 = new tm(this.field_D);
          var4 = (n) (var8.a(8115));
          while (var4 != null) {
            if (var4.c((byte) -20)) {
              var5 = new tm(this.field_D);
              var5.a(-10279, var4);
              var6 = (n) (var5.a(false));
              while (var6 != null) {
                if (var6.a(param0, param1 - 25822)) {
                  return true;
                }
                var6 = (n) (var5.a(false));
              }
            }
            var4 = (n) (var8.a(false));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("v.JB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    n f(byte param0) {
        tm var2;
        n var3;
        int var4;
        var4 = HoldTheLine.field_D;
        var2 = new tm(this.field_D);
        var3 = (n) (var2.c((byte) -122));
        if (param0 <= 73) {
          field_E = 118;
        }
        while (var3 != null) {
          if (var3.c((byte) -20)) {
            return var3;
          }
          var3 = (n) (var2.a((byte) -104));
        }
        return null;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param1 ^ 117);
    }

    final static void a(int param0, int param1, fo param2) {
        da var3 = null;
        try {
          if (param0 != 3) {
            field_E = -111;
          }
          var3 = da.field_p;
          var3.c((byte) 33, param1);
          var3.f(param0 + 108, param2.field_j);
          var3.b(-652561784, param2.field_l);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "v.CB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_B = -1;
    }
}
