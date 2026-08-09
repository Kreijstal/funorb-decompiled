/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends dl implements cg, ae, oj {
    static ql field_W;
    private oa field_U;
    static boolean field_db;
    static String field_Z;
    private bc field_cb;
    static String field_X;
    private bc field_Q;
    static wk field_R;
    private oa field_V;
    static wk[] field_gb;
    private bc field_eb;
    ij field_S;
    private bc field_hb;
    static int field_T;
    private bc field_Y;
    private ma field_fb;
    static String field_bb;
    private bc field_jb;
    private sb field_ib;
    static String field_P;
    static String field_ab;

    private final String j(int param0) {
        if (param0 > -22) {
            this.field_jb = (bc) null;
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean k(int param0) {
        if (!(this.h((byte) 35))) {
            return false;
        }
        int var2 = param0;
        try {
            var2 = Integer.parseInt(this.field_eb.field_y);
        } catch (NumberFormatException numberFormatException) {
        }
        return rl.a(this.field_cb.field_y, (vi) (this), this.field_hb.field_y, var2, this.field_Y.field_y, this.field_ib.field_T, true);
    }

    final static boolean l(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 == 13539) {
          if (!ni.b(param0 ^ 13551)) {
            if ((rd.field_b ^ -1) >= -1) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          vi.i(110);
          if (ni.b(param0 ^ 13551)) {
            return true;
          } else {
            L0: {
              if ((rd.field_b ^ -1) < -1) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void a(int param0, String param1) {
        bc var3 = null;
        String var4 = null;
        try {
            if (param0 != 20522) {
                field_R = (wk) null;
            }
            var3 = this.field_cb;
            var4 = param1;
            ((jf) ((Object) var3)).a(var4, param0 ^ 9143, false);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "vi.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public vi() {
        super(0, 0, 496, 0, (qk) null);
        this.field_cb = new bc("", (tn) null, 12);
        this.field_Y = new bc("", (tn) null, 100);
        this.field_jb = new bc("", (tn) null, 100);
        this.field_hb = new bc("", (tn) null, 20);
        this.field_Q = new bc("", (tn) null, 20);
        this.field_eb = new bc("", (tn) null, 3);
        int var1 = 1;
        this.field_ib = new sb("", (tn) null, var1 != 0);
        this.field_U = new oa(lc.field_d, (tn) null);
        this.field_V = new oa(hg.field_f, (tn) null);
        this.field_cb.field_v = lc.field_i;
        this.field_Y.field_v = bk.field_H;
        this.field_jb.field_v = gi.field_v;
        this.field_hb.field_v = ie.field_a;
        this.field_Q.field_v = jb.field_W;
        this.field_eb.field_v = wb.field_b;
        this.field_ib.field_v = ug.field_K;
        this.field_cb.a(true, new ei(this.field_cb));
        this.field_Y.a(true, new ih(this.field_Y));
        this.field_jb.a(true, new nm(this.field_jb, this.field_Y));
        this.field_hb.a(true, new vm(this.field_hb, this.field_cb, this.field_Y));
        this.field_Q.a(true, new tk(this.field_Q, this.field_hb));
        this.field_eb.a(true, new eb(this.field_eb));
        this.field_U.field_K = false;
        this.field_U.field_p = (qk) ((Object) new kh());
        this.field_V.field_p = (qk) ((Object) new bl());
        this.field_cb.field_p = (qk) ((Object) new ag(10000536));
        ag dupTemp$0 = new ag(10000536);
        this.field_jb.field_p = (qk) ((Object) dupTemp$0);
        this.field_Y.field_p = (qk) ((Object) dupTemp$0);
        this.field_eb.field_p = (qk) ((Object) new ag(10000536));
        this.field_ib.field_p = (qk) ((Object) new s());
        li dupTemp$1 = new li(10000536);
        this.field_Q.field_p = (qk) ((Object) dupTemp$1);
        this.field_hb.field_p = (qk) ((Object) dupTemp$1);
        String var2 = db.a(te.field_e, -95, new String[]{this.j(-99), this.m(170)});
        int var3 = 20;
        var3 = var3 + this.a(this.field_Y, 170, nc.field_i, var3, 126);
        var3 = var3 + (5 + this.a(var3, true, g.field_m, this.field_jb, "", 20, 170));
        var3 = var3 + this.a(this.field_hb, 170, jh.field_c, var3, 126);
        var3 = var3 + (this.a(qb.field_N, 170, g.field_b, 12973, this.field_Q, var3) - -5);
        var3 = var3 + (5 + this.a(bl.field_b, 170, cf.field_s, 12973, this.field_cb, var3));
        var3 = var3 + this.a(var3, false, ee.field_L, this.field_eb, 170);
        hc var4 = new hc(46, var3, this.field_x + -90, 25, this.field_ib, true, -120 + this.field_x, 5, rc.field_m, 11579568, ic.field_cb);
        this.a(var4, -125);
        var3 = var3 + var4.field_E;
        cn var5 = new cn(tj.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, tj.field_e.field_G, -1, 2147483647, true);
        this.field_fb = new ma(var2, var5);
        this.field_fb.field_v = "";
        this.field_fb.a(ph.field_b, 0, -55);
        this.field_fb.a(ph.field_b, 1, -109);
        this.field_fb.field_A = (tn) (this);
        this.field_fb.a(46, var3, -90 + this.field_x, -1);
        var3 = var3 + (15 + this.field_fb.field_E);
        this.a(this.field_fb, -100);
        int var6 = 4;
        int var7 = 200;
        this.field_U.a(-var7 + 496 >> -1939877151, (byte) -87, var3, var7, 40);
        this.field_V.a(3 + var6, (byte) -86, var3 - -15, 60, 40);
        this.field_V.field_A = (tn) (this);
        this.field_U.field_A = (tn) (this);
        this.a(this.field_U, -98);
        this.a(this.field_V, -126);
        this.field_S = new ij((oj) (this));
        this.field_S.a(60 + this.field_cb.field_x + this.field_cb.field_o, (byte) -87, this.field_cb.field_z + 20, -this.field_cb.field_x + -this.field_cb.field_o + (this.field_x - 60), 150);
        this.a(this.field_S, -125);
        this.a(0, (byte) -80, 0, 496, var6 + 55 + var3);
    }

    private final int a(int param0, boolean param1, String param2, lh param3, int param4) {
        RuntimeException var6 = null;
        lk var7 = null;
        hc var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = new hc(20, param0, param4 + 120, 25, param3, param1, 120, 3, tj.field_e, 16777215, param2);
            this.a(var8, -83);
            var7 = new lk(((qn) ((Object) param3)).a(param1));
            this.a(var7, -124);
            var7.a(3 + (var8.field_x + var8.field_o), (byte) -85, (var8.field_E - 15 >> 1489237601) + var8.field_z, 15, 15);
            stackIn_1_0 = var8.field_E;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var6);

            stackIn_4_1 = new StringBuilder().append("vi.GA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param4 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean h(byte param0) {
        if (this.a(-2, (qn) (this.field_cb))) {
          if (this.a(-2, (qn) (this.field_Y))) {
            if (this.a(-2, (qn) (this.field_jb))) {
              if (this.a(-2, (qn) (this.field_hb))) {
                if (this.a(-2, (qn) (this.field_Q))) {
                  if (this.a(-2, (qn) (this.field_eb))) {
                    if (param0 < 20) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final int a(int param0, boolean param1, String param2, lh param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ff var9 = null;
        hc var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var10 = new hc(20, param0, param6 + 120, 25, param3, false, 120, 3, tj.field_e, 16777215, param2);
            if (param1) {
              this.a(var10, -90);
              var9 = new ff(((qn) ((Object) param3)).a(false), param4, 126, var10.field_E + param0, param6 - -50, param5);
              var9.field_A = (tn) (this);
              this.a(var9, -118);
              stackIn_4_0 = var10.field_E - -var9.field_E;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -83;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("vi.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(String param0, int param1, String param2, int param3, lh param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 12973) {
                break L1;
              } else {
                this.field_Q = (bc) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param5, true, param0, param4, param2, 35, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7);

            stackIn_6_1 = new StringBuilder().append("vi.EA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        cm var2;
        field_gb = null;
        field_X = null;
        field_P = null;
        field_R = null;
        field_bb = null;
        if (param0) {
          var2 = (cm) null;
          vi.a((byte) 115, true, (cm) null, (cm) null, (cm) null);
          field_ab = null;
          field_Z = null;
          field_W = null;
          return;
        } else {
          field_ab = null;
          field_Z = null;
          field_W = null;
          return;
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        boolean discarded$0 = false;
        try {
            super.a(param0, 95, param2, param3);
            if (param1 <= 56) {
                qn var6 = (qn) null;
                discarded$0 = this.a(-51, (qn) null);
            }
            this.field_U.field_K = this.h((byte) 46);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "vi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void i(int param0) {
        try {
            Class var5 = null;
            Class var2 = null;
            if (o.field_c) {
                return;
            }
            o.field_c = true;
            Class var4 = java.awt.Toolkit.class;
            Class var1 = var4;
            try {
                jd.field_rb = var4.getMethod("createCustomCursor", new Class[]{java.awt.Image.class, java.awt.Point.class, String.class});
                int var3 = -25 / ((31 - param0) / 45);
                var5 = Class.forName("java.awt.image.BufferedImage");
                var2 = var5;
                hl.field_u = var5.getConstructor(new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                lc.field_h = var2.getField("TYPE_INT_ARGB").getInt((Object) null);
                nh.field_u = var5.getMethod("setRGB", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, int[].class, Integer.TYPE, Integer.TYPE});
            } catch (IllegalAccessException illegalAccessException) {
                jd.field_rb = null;
                return;
            } catch (ClassNotFoundException classNotFoundException) {
                jd.field_rb = null;
                return;
            } catch (NoSuchMethodException noSuchMethodException) {
                jd.field_rb = null;
                return;
            } catch (NoSuchFieldException noSuchFieldException) {
                jd.field_rb = null;
                return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = -17 % ((param1 - -85) / 36);
            if (param3 == this.field_V) {
              id.d((byte) -103);
              return;
            } else {
              if (this.field_U != param3) {
                break L0;
              } else {
                discarded$1 = this.k(-1);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("vi.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param1) {
                stackIn_7_0 = this.b(param3, 69);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-100 == (param1 ^ -1)) {
                  stackIn_11_0 = this.b(-11963, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("vi.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    private final boolean a(int param0, qn param1) {
        tl var3 = null;
        RuntimeException var3_ref = null;
        vd var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = param1.a(false);
            if (var3 != null) {
              L1: {
                if (param0 == -2) {
                  break L1;
                } else {
                  field_Z = (String) null;
                  break L1;
                }
              }
              var4 = var3.a((byte) 21);
              if (fa.field_d != var4) {
                if (nh.field_J == var4) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4 != ka.field_S) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("vi.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                return stackIn_16_0 != 0;
              }
            }
          }
        }
    }

    private final String m(int param0) {
        if (param0 != 170) {
            vi.a(true);
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, ma param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            if (param3 >= 124) {
              if (-1 != (param1 ^ -1)) {
                if ((param1 ^ -1) == -2) {
                  mj.b("privacy.ws", (byte) -39);
                  return;
                } else {
                  if (param1 != 2) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    mj.b("conduct.ws", (byte) -49);
                    return;
                  }
                }
              } else {
                mj.b("terms.ws", (byte) 85);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("vi.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, cm param2, cm param3, cm param4) {
        gf.field_a = sf.a("", 16);
        if (param0 != -127) {
            return;
        }
        try {
            gf.field_a.a(param0 ^ -183, false);
            ci.a(param3, (byte) 99, param4, param2);
            ik.a(true);
            cb.field_j = mm.field_e;
            jn.field_b = mm.field_e;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "vi.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0) {
        boolean discarded$0 = false;
        ((ei) ((Object) this.field_cb.a(false))).d(param0 ^ 43);
        if (param0 != 86) {
            qn var3 = (qn) null;
            discarded$0 = this.a(92, (qn) null);
        }
    }

    private final int a(lh param0, int param1, String param2, int param3, int param4) {
        int discarded$1 = 0;
        hc var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = new hc(20, param3, param1 + 120, 25, param0, false, 120, 3, tj.field_e, 16777215, param2);
              this.a(var6, -110);
              if (param4 == 126) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$1 = this.a(120, false, (String) null, (lh) null, (String) null, -28, -26);
                break L1;
              }
            }
            stackIn_3_0 = var6.field_E;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6_ref);

            stackIn_6_1 = new StringBuilder().append("vi.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_db = false;
        field_X = "This game option is not available in rated games.";
        field_Z = "Decline invitation to <%0>'s game";
        field_bb = "Public";
        field_P = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_ab = "<%0> has dropped out.";
    }
}
