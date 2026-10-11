/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jb extends se {
    private String field_f;
    private long field_g;
    static int field_e;
    static int field_h;

    final void a(fs param0, byte param1) {
        try {
          param0.a(false, this.field_g);
          param0.a(this.field_f, 27);
          if (param1 > -107) {
            fs var4 = (fs) null;
            this.a((fs) null, (byte) -83);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(fs param0, int param1, int param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param0.e(false);
            if (var3_int > param1) {
              var3_int = param1;
            }
            var4 = new byte[var3_int];
            param0.field_p = param0.field_p + ga.field_g.a(0, param0.field_p, var4, 116, var3_int, param0.field_n);
            var5 = sd.a(var4, 0, var3_int, 26564);
            if (param2 == -14832) {
              stackIn_7_0 = var5;
              return stackIn_7_0;
            }
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = "Cabbage";
            return stackIn_9_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("jb.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, String param1, java.applet.Applet param2) {
        try {
          String var7 = null;
          String var6 = null;
          String var5 = null;
          String var8 = null;
          String var6Lifetime1;
          String var6Lifetime2;
          String var6Lifetime3;
          String var6Lifetime4;
          String var6Lifetime5;
          String var6Lifetime6;
          try {
            bf.field_d = param1;
            try {
              int var4 = 82 / ((param0 + 62) / 49);
              var7 = param2.getParameter("cookieprefix");
              var6 = var7;
              var6Lifetime1 = var7;
              var5 = param2.getParameter("cookiehost");
              var6Lifetime2 = var5;
              var6Lifetime3 = var5;
              var8 = var7 + "settings=" + param1 + "; version=1; path=/; domain=" + var5;
              var6Lifetime4 = var8;
              var6Lifetime5 = var8;
              if (param1.length() == 0) {
                var6Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              } else {
                var6Lifetime6 = var8 + "; Expires=" + fi.a(94608000000L + wq.a(-6), true) + "; Max-Age=" + 94608000L;
              }
              tw.a("document.cookie=\"" + var6Lifetime6 + "\"", -15428, param2);
            } catch (Throwable throwable) {
            }
            va.a(false, param2);
          } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "jb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(String param0, boolean param1, byte param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_3_0 = 0;
          int stackIn_8_0 = 0;
          int stackIn_33_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_83_0 = 0;
          int stackIn_85_0 = 0;
          int stackIn_94_0 = 0;
          int stackIn_96_0 = 0;
          RuntimeException stackIn_99_0 = null;
          StringBuilder stackIn_99_1 = null;
          String stackIn_100_2 = null;
          StringBuilder stackIn_102_1 = null;
          String stackIn_103_2 = null;
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
          var9 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (param2 < 15) {
              stackIn_3_0 = -61;
              return stackIn_3_0;
            }
            if (qk.field_O == null &&
              !nd.a((byte) -34, param3)) {
              stackIn_8_0 = -1;
              return stackIn_8_0;
            }
            if (kw.field_c == gg.field_t) {
              if (param3) {
                var10 = (String) null;
                kb.field_d = ds.a(lb.field_a, false, (String) null, param5, false);
              } else {
                kb.field_d = os.a(false, param0, param5, (byte) -94);
              }
              as.field_v.field_p = 0;
              as.field_v.b((byte) 42, 14);
              as.field_v.b((byte) 96, kb.field_d.a((byte) 126).field_c);
              gt.a(0, -1);
              kw.field_c = gi.field_g;
            }
            if (kw.field_c == gi.field_g &&
              ju.b(-1, 1)) {
              var6_int = ig.field_a.e(-31302);
              if (var6_int != 0) {
                iw.field_a = var6_int;
                gu.field_d = -1;
                kw.field_c = sp.field_z;
              } else {
                kw.field_c = sc.field_q;
              }
              ig.field_a.field_p = 0;
            }
            if (kw.field_c == sc.field_q &&
              ju.b(-1, 8)) {
              oc.field_g = ig.field_a.a((byte) 127);
              ig.field_a.field_p = 0;
              fb.a(param3, param1, -12793, param4, kb.field_d);
              kw.field_c = jj.field_f;
            }
            boolean decompiledFrameRemainder0 = true;
            if (kw.field_c == jj.field_f &&
              ju.b(-1, 1)) {
              var6_intLifetime1 = ig.field_a.e(-31302);
              iw.field_a = var6_intLifetime1;
              ig.field_a.field_p = 0;
              rp.field_b = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  kw.field_c = sp.field_z;
                  gu.field_d = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  kk.a((byte) -128);
                  sr.field_g = false;
                  stackIn_33_0 = var6_intLifetime1;
                  return stackIn_33_0;
                }
              }
              if (decompiledFrameRemainder0) {
                kw.field_c = uu.field_l;
                gu.field_d = -1;
              }
            }
            if (kw.field_c == uu.field_l &&
              lt.a((byte) 119)) {
              lb.field_a = ig.field_a.a((byte) 114);
              ku.field_j = ig.field_a.e(-31302);
              ig.field_a.e(-31302);
              ct.field_x = ig.field_a.a(255);
              var6 = ig.field_a.g((byte) 92);
              var7 = ig.field_a.e(-31302);
              if ((var7 & 1) != 0) {
                fu.f(24);
              }
              if (!param3) {
                stackIn_43_0 = ((4 & var7) != 0);
                wo.field_c = stackIn_43_0;
                stackIn_46_0 = ((var7 & 8) != 0);
                cb.field_b = stackIn_46_0;
                if (cb.field_b) {
                }
              }
              if (gn.field_d) {
                ig.field_a.e(-31302);
                ig.field_a.e(-31302);
                ig.field_a.c(true);
                pl.field_y = ig.field_a.a(255);
                sm.field_b = new byte[pl.field_y];
                for (var8 = 0; var8 < pl.field_y; var8++) {
                  sm.field_b[var8] = ig.field_a.d(true);
                }
              }
              qv.field_o = ig.field_a.d(-1);
              var11 = (CharSequence) ((Object) qv.field_o);
              tc.field_f = uk.a(-1, var11);
              jk.field_c = ig.field_a.e(-31302);
              kw.field_c = ga.field_j;
              if (kb.field_d.a((byte) 113) != pb.field_b) {
                if (kb.field_d.a((byte) 89) == hh.field_c) {
                  tr.field_j.a(true, ra.c(2));
                }
              } else {
                go.field_m.a(true, ra.c(2));
              }
              sr.field_g = false;
              if (var6 != null) {
                jb.a((byte) -118, var6, ra.c(2));
              }
              if (ct.field_x <= 0 &&
                !wo.field_c) {
                try {
                  tw.a(ra.c(2), 93, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  tw.a(-111, ra.c(2), "zap", new Object[]{td.a(-29275, lb.field_a)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (ct.field_x > 0) {
                qn.field_a = true;
              }
              as.field_v.a((byte) 64, bk.field_e);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                bk.field_e[var8Lifetime1] = bk.field_e[var8Lifetime1] + 50;
              }
              ig.field_a.a((byte) 123, bk.field_e);
              stackIn_73_0 = iw.field_a;
              return stackIn_73_0;
            }
            if (kw.field_c == sp.field_z &&
              lt.a((byte) 119)) {
              kk.a((byte) -115);
              if (iw.field_a == 7 &&
                !sr.field_g) {
                sr.field_g = true;
                stackIn_85_0 = -1;
                return stackIn_85_0;
              }
              if (7 == iw.field_a) {
                iw.field_a = 3;
              }
              ns.field_c = ig.field_a.d(-1);
              sr.field_g = false;
              stackIn_83_0 = iw.field_a;
              return stackIn_83_0;
            }
            if (qk.field_O == null) {
              if (sr.field_g) {
                if (uc.b(26560) <= 30000L) {
                  ns.field_c = nd.field_G;
                } else {
                  ns.field_c = ar.field_F;
                }
                sr.field_g = false;
                stackIn_94_0 = 3;
                return stackIn_94_0;
              }
              var6_intLifetime2 = vp.field_a;
              vp.field_a = nb.field_b;
              sr.field_g = true;
              nb.field_b = var6_intLifetime2;
            }
            stackIn_96_0 = -1;
            return stackIn_96_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_99_0 = var6_ref;
            stackIn_99_1 = new StringBuilder().append("jb.F(");
            if (param0 == null) {
              stackIn_100_2 = "null";
            } else {
              stackIn_100_2 = "{...}";
            }
            stackIn_102_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_103_2 = "null";
            } else {
              stackIn_103_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    nb a(byte param0) {
        if (param0 < 80) {
          java.applet.Applet var3 = (java.applet.Applet) null;
          jb.a((byte) -100, (String) null, (java.applet.Applet) null);
        }
        return hh.field_c;
    }

    final static wb a(String param0, String param1, int param2, ki param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        wb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(0, param0);
          var5 = param3.a(var4_int, param1, (byte) 127);
          var6 = -88 % ((-10 - param2) / 46);
          stackIn_1_0 = na.a(var5, -11481, param3, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("jb.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    jb(long param0, String param1) {
        try {
          this.field_g = param0;
          this.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "jb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
