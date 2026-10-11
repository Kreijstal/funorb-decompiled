/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ab extends dh {
    static String field_q;
    private int field_C;
    static int[] field_A;
    private int field_y;
    private boolean field_n;
    static int[][] field_s;
    private int field_r;
    private int field_v;
    static String field_p;
    private boolean field_o;
    String field_x;
    private boolean field_B;
    static boolean field_t;
    private long field_w;
    private int field_m;
    static boolean field_u;
    private int field_z;

    private final void h(int param0) {
        ef.field_c[param0] = true;
    }

    private final void i(int param0) {
        ef.field_c[1] = true;
        if (param0 != -13072) {
          this.field_x = (String) null;
        }
    }

    final void c(boolean param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        boolean stackIn_4_1 = false;
        var3 = SolKnight.field_L ? 1 : 0;
        if (!bb.h(42)) {
          if (kj.field_R >= 10) {
            if (!uk.h(250)) {
              rb.c(-27347);
            } else {
              if (0 == fj.field_i) {
                discarded$6 = this.a(false, false, 121);
              } else {
                ta.a((byte) 119, cl.field_n);
              }
            }
          }
        } else {
          stackIn_4_1 = (dj.field_k != null);
          discarded$7 = this.a(stackIn_4_1, false, 106);
        }
        if (!param0) {
          this.c(false, false);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        try {
          try {
            if (!this.c(76)) {
              return;
            }
            this.field_x = this.getCodeBase().getHost();
            var11 = this.field_x.toLowerCase();
            stackIn_8_1 = (var11.equals("jagex.com")) || (var11.endsWith(".jagex.com"));
            this.field_o = stackIn_8_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_m = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_z = Integer.parseInt(var7);
            }
            this.field_C = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_w = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_v = Integer.parseInt(var8);
            }
            if (this.field_v >= 5) {
              this.field_v = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_r = Integer.parseInt(var9);
            }
            ml.field_g = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a((byte) 80, param4, param1, 32, param0, param2, this.field_C);
            if (param3 != -14) {
              this.k(107);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            hi.a((Throwable) ((Object) var6), (String) null, 1);
            this.a("crash", param3 ^ 13);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref;
          stackIn_27_1 = new StringBuilder().append("ab.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static da a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          lg var8 = null;
          da stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != n.field_a.field_c) {
              hc.field_c = new hb(n.field_a.field_c, 5200, 0);
              n.field_a.field_c = null;
              var6 = new bi(255, hc.field_c, new hb(n.field_a.field_s, 12000, 0), 2097152);
            }
            if (hc.field_c != null) {
              if (null == tk.field_p) {
                tk.field_p = new hb[n.field_a.field_v.length];
              }
              if (tk.field_p[param1] == null) {
                tk.field_p[param1] = new hb(n.field_a.field_v[param1], 12000, 0);
                n.field_a.field_v[param1] = null;
              }
              var7 = new bi(param1, hc.field_c, tk.field_p[param1], 2097152);
            }
            var8 = d.field_b.a(-65, (bi) (var7), param3, (bi) (var6), param1);
            if (param5) {
              var8.a((byte) 0);
            }
            if (param0 != 2097152) {
              field_A = (int[]) null;
            }
            stackIn_16_0 = new da(var8, param4, param2);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
          return -59;
        }
        int var2 = this.j(-1);
        if (var2 == 0 ||
          var2 == 1) {
          if (ef.field_c[1]) {
            gh.a(2, 9543);
          }
          if (ef.field_c[2]) {
            jg.a(3, (byte) -100);
          }
          if (ef.field_c[3]) {
            hi.a(4, -5887);
          }
          if (ef.field_c[4]) {
            ik.a(5, 18897);
          }
          if (ef.field_c[5]) {
            ci.a((byte) -77, 6);
          }
          if (ef.field_c[6]) {
            db.b(36951, 7);
          }
          if (ef.field_c[8]) {
            ff.a((byte) -89);
          }
        }
        return var2;
    }

    final void d(boolean param0) {
        int stackIn_32_0 = 0;
        boolean stackIn_33_1 = false;
        int var2;
        hf var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        var2 = ob.field_h;
        if (64 > var2 &&
          ef.field_c[var2]) {
          if (var2 == 0) {
            return;
          }
          L1: {
            switch (var2) {
              case 3:
                db.f(0);
                break;
              case 4:
                oa.c(1811357826);
                break;
              case 6:
                td.a(-126);
                break;
              case 8:
                af.a(wh.field_c, te.field_N, (byte) -110, te.field_O);
                break;
              case 16:
                ki.a(-106);
                break;
              default:
                if (var2 != 11 &&
                  12 != var2) {
                  switch (var2) {
                    case 13:
                      li.d(117);
                      break L1;
                    case 17:
                      this.l(-73);
                      break L1;
                    case 18:
                      u.a(2);
                      break L1;
                    default:
                      hi.a((Throwable) null, "MGS1: " + oc.a(false), 1);
                      je.a(false);
                      break L1;
                  }
                }
                stackIn_32_0 = 112;
                stackIn_33_1 = (12 == var2);
                var3 = vd.a(stackIn_32_0, stackIn_33_1);
                al.a((byte) -70, var3);
                break;
              case 7:
                this.k(31156);
                break;
              case 5:
                dd.a(true);
                break;
              case 2:
                pg.c((byte) -117);
                break;
              case 1:
                le.b(873698625);
                break;
            }
          }
          if (!param0) {
            field_A = (int[]) null;
          }
          return;
        }
        hi.a((Throwable) null, "MGS2: " + oc.a(false), 1);
        je.a(!param0);
    }

    final static String a(da param0, String param1, String param2, String param3, boolean param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (!param0.c((byte) -121)) {
            stackIn_6_0 = (String) (param2);
            return stackIn_6_0;
          }
          stackIn_8_0 = param1 + " - " + param0.d(-1, param3) + "%";
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ab.MA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          gb var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = SolKnight.field_L ? 1 : 0;
          var4 = ig.a(vd.field_b, cl.field_n, false, param0);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = si.a(ua.h(0), ih.a(true), -120);
            if (var5_int != -1) {
              fb.a(12239, ke.field_O, var5_int, md.field_v);
              ke.field_O = null;
              md.field_v = null;
            }
            var11 = sf.d(-123);
            if (var11 != null) {
              qc.a(var11.booleanValue(), -128);
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = gl.a(fi.a((byte) 84), 140, rg.a(0), ta.a((byte) -23), this.field_r, sg.b(-1), lc.b(false));
            if (-1 != var5_intLifetime1) {
              ff.a(var5_intLifetime1, -114, ke.field_O, md.field_v);
              ke.field_O = null;
              md.field_v = null;
            }
          }
          if (var4 == 3) {
            if (bf.field_e != -1 &&
              bf.field_e != 0) {
              bf.field_e = -1;
              ti.a((byte) -126);
            }
            if (!param1) {
              var5_intLifetime2 = fc.a(rg.a(0), this.field_r, false, this.field_o, fi.a((byte) 84), 0);
              if (-1 != var5_intLifetime2) {
                if (0 != var5_intLifetime2) {
                  dd.a((byte) 83, md.field_v, var5_intLifetime2);
                  md.field_v = null;
                } else {
                  d.field_c = kc.field_P;
                  ee.f(0);
                  lh.field_l = false;
                  fj.field_i = 10;
                }
              }
            } else {
              ee.field_i = false;
            }
          }
          if (var4 == 4) {
            if (!cl.field_m) {
              fj.field_i = 10;
              lh.field_l = true;
            } else {
              gd.a(-1, ia.g(84));
            }
          }
          if (var4 == 5) {
            he.a(-1, ia.g(-16));
          }
          if (6 == var4 &&
            kk.field_c) {
            fj.field_i = 10;
          }
          if (var4 == 7) {
            pl.a(ia.g(-41), -15071);
          }
          if (var4 == 8) {
            gd.a(-1, ia.g(-48));
          }
          if (var4 == 9) {
            ki.a(ia.g(-92), -1);
          }
          if (var4 == 10) {
            id.field_c.e(17, -2147483648);
          }
          if (param2 <= 69) {
            return 57;
          }
          if (11 == var4) {
            di.a(ia.g(-84), 63);
          }
          if (var4 == 12) {
            kj.a(ia.g(-20), 117, te.d((byte) 18));
          }
          if (var4 == 13) {
            try {
              if (null == wi.field_j) {
                wi.field_j = new na(wh.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (wi.field_j.a((byte) -106)) {
                var12 = wi.field_j.a(true);
                if (var12 != null) {
                  var7 = vd.a(var12.field_l, 0, var12.field_m, 160);
                  dh.a(var7, false);
                } else {
                  var9 = (String) null;
                  dh.a((String) null, false);
                }
                wi.field_j = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              hi.a((Throwable) ((Object) var5), "S1", 1);
              var10 = (String) null;
              dh.a((String) null, false);
              wi.field_j = null;
            }
          }
          if (15 == var4) {
            fj.field_i = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 != 17) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 >= -7) {
          return;
        }
        field_p = null;
        field_A = null;
        field_s = (int[][]) null;
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        vd.field_b = this.field_v;
        aa.a((byte) 30, vd.field_b);
        ff.a(this.field_z, wh.field_c, param1, (byte) 110, this.field_C, this.field_m, this.field_y, 5000, this.field_x, this.field_n, param5, 5000, vd.field_b, this.field_w);
        sk.a(-11400, this.field_C, this.field_y, wh.field_c, this.field_m, this.field_z, param5, vd.field_b, this.field_x);
        da.a(0);
        ah.field_d = ld.j(0);
        th.a((byte) -63, dc.field_q);
        if (!param4) {
          this.field_m = -97;
        }
        ef.field_g = param2;
        og.field_c = param7;
        vd.field_c = param0;
        aj.field_u = param6;
        bl.field_k = param3;
        this.g((byte) 119);
        id.a(-114);
    }

    private final void f(byte param0) {
        ef.field_c[4] = true;
        if (param0 < 6) {
          this.g(122);
        }
    }

    final void a(String param0, int param1, int param2) {
        try {
          this.a(param1, 640, 480, -14, param0);
          if (param2 != 8) {
            this.i(-48);
          }
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ab.NA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(false, false);
        if (param4) {
          this.i(-13072);
        }
        if (param0 != -38) {
          this.field_n = true;
        }
        if (param1) {
          this.b(false);
        }
        if (param3) {
          this.f((byte) 124);
        }
        if (param2) {
          this.h(param0 ^ -33);
        }
    }

    private final void c(boolean param0, boolean param1) {
        ef.field_c[8] = param1;
        ef.field_c[7] = true;
        if (param0) {
          return;
        }
        ef.field_c[18] = true;
        ef.field_c[17] = true;
        ef.field_c[16] = true;
        ef.field_c[3] = true;
        ef.field_c[0] = true;
    }

    private final void g(byte param0) {
        ef.field_b[18] = 1;
        ef.field_b[3] = -1;
        ef.field_b[16] = -1;
        ef.field_b[5] = -1;
        ef.field_b[11] = -1;
        ef.field_b[7] = -1;
        ef.field_b[4] = -1;
        ef.field_b[2] = -2;
        ef.field_b[9] = -1;
        ef.field_b[1] = 16;
        ef.field_b[6] = -2;
        ef.field_b[13] = -1;
        if (param0 < 64) {
          return;
        }
        ef.field_b[10] = -1;
        ef.field_b[17] = -1;
        ef.field_b[8] = -2;
        ef.field_b[12] = -1;
    }

    private final void k(int param0) {
        if (param0 != 31156) {
          this.i(80);
        }
        String var2 = bk.a(0);
        g.a(ia.g(-22), var2, -3603);
    }

    final int b(boolean param0, boolean param1) {
        if (param0) {
          return 74;
        }
        return this.a(param1, true, 120);
    }

    private final void b(boolean param0) {
        if (param0) {
          return;
        }
        ef.field_c[2] = true;
    }

    final void a(int param0, boolean param1) {
        int stackIn_23_0 = 0;
        boolean stackIn_101_0 = false;
        int stackIn_103_1 = 0;
        boolean stackIn_104_2 = false;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = SolKnight.field_L ? 1 : 0;
        if (null != fc.field_l) {
          if (null == dj.field_k) {
            var6 = qh.a((byte) 60);
            var4 = var6.getSize();
            fc.field_l.a(var4.height, var4.width, param0 ^ 25192);
          }
          fc.field_l.a(param0 ^ -3);
        }
        mf.f(-11214);
        jh.b(param0 ^ -405);
        if (!bl.a((byte) -81) &&
          11 != fj.field_i) {
          lj.e(false);
        }
        if (null != ah.field_d) {
          cl.field_n = ah.field_d.a(9408);
        }
        if (wf.c((byte) -63)) {
          var3 = 1200 * l.a((byte) 99);
          if (this.field_B ||
            !(var3 >= wk.b(param0 ^ -3)) &&
            !(de.a(-122) <= var3)) {
            this.field_B = false;
            je.a(false);
            sf.b(false);
            dd.a((byte) 27, el.field_k, 2);
            pk.d(true);
            ee.field_i = true;
            kj.field_I = 15000L + je.a(1);
          }
        }
        if (bf.field_e == -1 ||
          bf.field_e == 0) {
          stackIn_23_0 = (bf.field_e != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          bf.field_e = ke.a((byte) 107);
          if (var3Lifetime1 != 0 &&
            0 == bf.field_e &&
            11 == fj.field_i &&
            !qc.a(param0 + 37)) {
            ee.f(0);
          }
          if (bf.field_e != -1 &&
            bf.field_e != 0) {
            kj.field_I = 15000L + je.a(1);
          }
        }
        if (bf.field_e != -1 &&
          bf.field_e != 0) {
          if (kj.field_R < 10) {
            if (bf.field_e == 3) {
              this.a("js5crc", -1);
            } else {
              if (bf.field_e == 4) {
                this.a("js5io", param0 ^ 2);
              } else {
                if (bf.field_e == 2) {
                  this.a("js5connect_full", -1);
                } else {
                  if (bf.field_e != 5) {
                    this.a("js5connect", -1);
                  } else {
                    this.a("outofdate", -1);
                  }
                }
              }
            }
          } else {
            if (10 <= fj.field_i) {
              sf.b(false);
              if (bf.field_e != 3) {
                if (bf.field_e != 4) {
                  if (bf.field_e != 2) {
                    if (5 == bf.field_e) {
                      dd.a((byte) -115, jl.field_c, 5);
                    } else {
                      dd.a((byte) 57, cd.field_c, 256);
                    }
                  } else {
                    dd.a((byte) 51, eb.field_c, 256);
                  }
                } else {
                  dd.a((byte) 89, el.field_m, 256);
                }
              } else {
                dd.a((byte) 115, bl.field_m, 256);
              }
              ee.field_i = true;
            }
          }
        }
        if ((bf.field_e != -1 &&
          0 != bf.field_e ||
          qc.a(34)) &&
          kj.field_I <= je.a(1)) {
          ee.field_i = false;
          if (bf.field_e != -1 &&
            bf.field_e != 0) {
            bf.field_e = -1;
            ti.a((byte) 77);
          }
        }
        if (bf.field_e == 0 &&
          !qc.a(34)) {
          ib.field_o = false;
        }
        if (kj.field_R == 0 &&
          tk.c(false)) {
          kj.field_R = 1;
        }
        if (kj.field_R == 1) {
          if (vd.field_b != 0) {
            af.field_c = r.a(og.field_c, 82);
          }
          lh.field_o = pj.a(vd.field_c, (byte) -30, 1, false, true);
          wk.field_c = pj.a(ef.field_g, (byte) -126, 1, false, true);
          jk.field_ub = pj.a(aj.field_u, (byte) 52, 1, false, true);
          pl.field_d = lh.field_o;
          ai.field_b = wk.field_c;
          kj.field_R = 2;
        }
        if (kj.field_R == 2) {
          if (af.field_c != null &&
            af.field_c.c((byte) -121)) {
            if (!af.field_c.b(param0 - 95, "")) {
              af.field_c = null;
            } else {
              if (af.field_c.a(2, "")) {
                lj.a(26708, af.field_c);
                af.field_c = null;
                mh.a(8192);
              }
            }
          }
          if (null == af.field_c) {
            kj.field_R = 3;
          }
        }
        if (3 == kj.field_R &&
          pj.a(wk.field_c, -16925, lh.field_o, jk.field_ub) &&
          td.a(-3, jk.field_ub)) {
          cb.b(32);
          kg.a(-15617);
          pe.field_m = te.field_J;
          kk.field_c = false;
          d.a(wk.field_c, cl.field_m, (byte) -110, jk.field_ub, lh.field_o);
          if (bl.field_p ||
            null != s.field_hb) {
            stackIn_101_0 = !(bl.field_p);
            stackIn_103_1 = param0 + 17075;
            stackIn_104_2 = !(bl.field_p);
            hf.a(stackIn_101_0, stackIn_103_1, stackIn_104_2, s.field_hb);
          }
          if (ml.field_g) {
            qk.f(4);
          }
          if (ce.field_c == null) {
            ce.field_c = rh.a(0);
            qh.field_c = jk.i((byte) 123);
          }
          r.a(jk.field_ub, qh.field_c, param0 ^ -4, ce.field_c);
          wk.field_c = null;
          jk.field_ub = null;
          lh.field_o = null;
          de.a((java.applet.Applet) (this), param0 + 3);
          mh.a(8192);
          kj.field_R = 10;
        }
        if (param0 != -3) {
          this.field_z = 90;
        }
        if (10 == kj.field_R) {
          if (vd.field_b != 0) {
            wc.field_b = r.a(bl.field_k, 117);
          }
          kj.field_R = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (kj.field_R == 11) {
          if (null != wc.field_b && (!wc.field_b.c((byte) -121) ||
            !wc.field_b.b(true))) {
            a.a((byte) 102, ve.a(uf.field_r, wa.field_a, wc.field_b, (byte) -94), 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            pd.field_c = true;
            kj.field_R = 12;
          }
        }
        if (12 == kj.field_R &&
          !pd.field_c) {
          kj.field_R = 13;
        }
        if (kj.field_R == 13) {
          var3Lifetime2 = 1;
          if (null != ng.field_a) {
            stackIn_138_0 = (!ng.field_a.a((byte) 125)) ? 0 : 1;
            var3Lifetime2 = stackIn_138_0;
            a.a((byte) 102, ng.field_a.field_a, ng.field_a.field_c);
          }
          if (var3Lifetime2 != 0) {
            kj.field_R = 20;
          }
        }
        if (!param1 &&
          jd.field_p) {
          nc.a((byte) 86, dc.field_q);
          this.a(true);
          th.a((byte) -69, dc.field_q);
        }
        if (ef.field_c[8]) {
          wd.b(param0 + 11);
        }
    }

    final static uh a(jd param0, int param1) {
        int var7 = 0;
        uh stackIn_5_0 = null;
        uh stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        uh var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var2_int = param0.d((byte) 48, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          if (param1 != -14945) {
            stackIn_5_0 = (uh) null;
            return stackIn_5_0;
          }
          var3 = wa.a(param0, (byte) -119) ? 1 : 0;
          var4 = wa.a(param0, (byte) -114) ? 1 : 0;
          var5 = new uh();
          var5.field_y = (short)param0.d((byte) 48, 16);
          var5.field_n = pj.a(param1 ^ 14944, param0, 16, var5.field_n);
          var5.field_q = pj.a(-1, param0, 16, var5.field_q);
          var5.field_z = pj.a(-1, param0, 16, var5.field_z);
          var5.field_F = (short)param0.d((byte) 48, 16);
          var5.field_K = pj.a(-1, param0, 16, var5.field_K);
          var5.field_o = pj.a(-1, param0, 16, var5.field_o);
          var5.field_w = pj.a(-1, param0, 16, var5.field_w);
          if (var3 != 0) {
            var5.field_b = (short)param0.d((byte) 48, 16);
            var5.field_B = pj.a(-1, param0, 16, var5.field_B);
            var5.field_v = pj.a(-1, param0, 16, var5.field_v);
            var5.field_J = pj.a(-1, param0, 16, var5.field_J);
            var5.field_D = pj.a(param1 + 14944, param0, 16, var5.field_D);
            var5.field_C = pj.a(-1, param0, 16, var5.field_C);
            var5.field_g = pj.a(-1, param0, 16, var5.field_g);
          }
          if (var4 != 0) {
            param0.d((byte) 48, 16);
            var5.field_c = pj.a(param1 + 14944, param0, 16, var5.field_c);
            var5.field_H = pj.a(param1 + 14944, param0, 16, var5.field_H);
            var5.field_A = pj.a(-1, param0, 16, var5.field_A);
            var5.field_a = pj.a(param1 ^ 14944, param0, 16, var5.field_a);
            var5.field_e = pj.a(param1 + 14944, param0, 16, var5.field_e);
          }
          if (wa.a(param0, (byte) -121)) {
            var5.field_s = pj.a(-1, param0, 16, var5.field_s);
          }
          if (wa.a(param0, (byte) -127)) {
            var5.field_k = be.a((byte) 63, var5.field_k, param0, 16);
            var6 = 0;
            for (var7 = 0; var5.field_k.length > var7; var7++) {
              if (var6 < (var5.field_k[var7] & 255)) {
                var6 = var5.field_k[var7] & 255;
              }
            }
            if (0 != var6) {
              var5.field_j = (byte)(1 + var6);
            } else {
              var5.field_k = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ab.EA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int j(int param0) {
        int var2;
        if (this.field_c) {
          return -1;
        }
        if (!qc.a(param0 + 35)) {
          return -1;
        }
        if (ee.field_i) {
          return -1;
        }
        var2 = fc.a(rg.a(0), this.field_r, true, this.field_o, fi.a((byte) 84), 0);
        if (var2 == -1) {
          return -1;
        }
        if (~var2 != param0 &&
          var2 != 1) {
          if (!rh.field_f) {
            this.a("reconnect", -1);
          }
          sf.b(false);
          dd.a((byte) 8, md.field_v, var2);
          ee.field_i = true;
          kj.field_I = je.a(param0 ^ -2) + 15000L;
          return var2;
        }
        if (11 == fj.field_i &&
          bf.field_e == 0) {
          ee.f(0);
        }
        return var2;
    }

    protected ab() {
    }

    private final void l(int param0) {
        int var2 = te.field_N.j(255);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        if (param0 >= -10) {
          field_u = false;
        }
        int var4 = te.field_O - 1;
        byte[] var5 = new byte[var4];
        te.field_N.b(70, var4, 0, var5);
        ke.a((byte) -122, ia.g(-107), da.a(true, var5), var3 != 0);
    }

    static {
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_p = "Logging in...";
        field_s = new int[10][];
        field_A = new int[8192];
        field_u = false;
        field_t = false;
    }
}
