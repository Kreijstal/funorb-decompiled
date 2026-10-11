/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ed extends qk implements vb {
    static String field_tb;
    static char field_Bb;
    static String field_xb;
    private boolean field_Ab;
    static String field_Eb;
    static String field_Db;
    static pa field_yb;
    private boolean field_zb;
    private boolean field_Fb;
    static int[] field_Ib;
    private boolean field_Gb;
    static int field_Cb;
    private om field_ub;
    private dj field_wb;
    static qb field_vb;
    static int field_Hb;

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        qm var6 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -120) {
            var6 = (qm) null;
            this.a((qm) null, (byte) -14, 'Y', 108);
          }
          if (param3 != 13) {
            stackIn_6_0 = super.a(param0, (byte) -122, param2, param3);
            return stackIn_6_0;
          }
          this.h(77);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ed.N(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void h(int param0) {
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
        if (param0 != 77) {
          return;
        }
        if (this.field_Ab) {
          fj.c(-120);
          return;
        }
        if (!this.field_Fb) {
          return;
        }
        pn.c(-11090);
    }

    ed(h param0, dj param1, String param2, boolean param3, boolean param4) {
        super(param0, new me((ed) null, param1, param2), 77, 10, 10);
        try {
          this.field_wb = param1;
          this.field_Ab = param3 ? true : false;
          this.field_Fb = param4 ? true : false;
          this.field_Gb = false;
          this.field_zb = false;
          this.field_ub = new om(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_ub.field_I = true;
          this.c(-105, this.field_ub);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ed.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_17_1 = false;
        int stackIn_36_0 = 0;
        boolean stackIn_37_1 = false;
        int stackIn_50_0 = 0;
        int stackIn_54_0 = 0;
        boolean stackIn_55_1 = false;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        boolean stackIn_79_1 = false;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        boolean stackIn_98_1 = false;
        int var2;
        int var3;
        int var2Lifetime1;
        int var3Lifetime1;
        int var2Lifetime2;
        int var3Lifetime2;
        if (null == jb.field_z) {
          if (null == r.field_b) {
            var2 = 25 % ((38 - param1) / 34);
            if (cb.field_b &&
              io.field_A) {
              if (hi.field_a &&
                ef.field_r) {
                stackIn_93_0 = 1;
              } else {
                stackIn_93_0 = 0;
              }
              var3 = stackIn_93_0;
              stackIn_97_0 = 0;
              stackIn_98_1 = (param0) && (gj.a(29372)) && (var3 == 0);
              ui.a(stackIn_97_0, stackIn_98_1);
              if (var3 != 0) {
                if (!param0) {
                  ml.a(false, -101);
                  return;
                }
                if (!gj.a(29372)) {
                  ml.a(false, -101);
                  return;
                }
                ml.a(true, -101);
              }
            }
            return;
          }
          r.field_b.a(param0, -26449);
          var2Lifetime2 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!io.field_A) {
            return;
          }
          if (hi.field_a &&
            ef.field_r) {
            stackIn_74_0 = 1;
          } else {
            stackIn_74_0 = 0;
          }
          var3Lifetime2 = stackIn_74_0;
          stackIn_78_0 = 0;
          stackIn_79_1 = (param0) && (gj.a(29372)) && (var3Lifetime2 == 0);
          ui.a(stackIn_78_0, stackIn_79_1);
          if (var3Lifetime2 == 0) {
            return;
          }
          if (!param0) {
            ml.a(false, -101);
          } else {
            if (!gj.a(29372)) {
              ml.a(false, -101);
            } else {
              ml.a(true, -101);
            }
          }
          return;
        }
        jb.field_z.a(param0, an.field_j, 0, true, 0, 96, an.field_f);
        if (null == r.field_b) {
          var2Lifetime1 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!io.field_A) {
            return;
          }
          if (hi.field_a &&
            ef.field_r) {
            stackIn_12_0 = 1;
          } else {
            stackIn_12_0 = 0;
          }
          var3Lifetime1 = stackIn_12_0;
          stackIn_16_0 = 0;
          stackIn_17_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
          ui.a(stackIn_16_0, stackIn_17_1);
        } else {
          r.field_b.a(param0, -26449);
          var2Lifetime1 = 25 % ((38 - param1) / 34);
          if (!cb.field_b) {
            return;
          }
          if (!io.field_A) {
            return;
          }
          if (!hi.field_a) {
            var3Lifetime1 = 0;
            stackIn_36_0 = 0;
            stackIn_37_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
            ui.a(stackIn_36_0, stackIn_37_1);
          } else {
            stackIn_50_0 = (!ef.field_r) ? 0 : 1;
            var3Lifetime1 = stackIn_50_0;
            stackIn_54_0 = 0;
            stackIn_55_1 = (param0) && (gj.a(29372)) && (var3Lifetime1 == 0);
            ui.a(stackIn_54_0, stackIn_55_1);
          }
        }
        if (var3Lifetime1 == 0) {
          return;
        }
        if (!param0) {
          ml.a(false, -101);
        } else {
          if (!gj.a(29372)) {
            ml.a(false, -101);
          } else {
            ml.a(true, -101);
          }
        }
    }

    public static void i(int param0) {
        field_yb = null;
        field_xb = null;
        field_Ib = null;
        field_Db = null;
        field_vb = null;
        field_tb = null;
        field_Eb = null;
        if (param0 != -29222) {
          ed.i(-73);
        }
    }

    final void g(boolean param0) {
        this.field_ub.b(4210752, param0, 2121792);
        me var2 = new me(this, this.field_wb, ul.field_k);
        var2.a(r.field_e, (byte) 3, 15);
        this.a((byte) -92, (qm) (var2));
    }

    final void a(boolean param0, String param1, int param2) {
        boolean stackIn_6_1 = false;
        boolean stackIn_9_1 = false;
        me stackIn_14_0 = null;
        String stackIn_15_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        me var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        me var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_Gb) {
            return;
          }
          stackIn_6_1 = (param0);
          this.field_Gb = stackIn_6_1;
          stackIn_9_1 = (256 == param2);
          this.field_zb = stackIn_9_1;
          this.field_ub.b(4210752, param0, 8405024);
          var6 = new me(this, this.field_wb, param1);
          var4 = var6;
          if (5 != param2) {
            if (256 == param2) {
              var6.a(118, sk.field_b, (wc) (this));
            } else {
              stackIn_14_0 = var6;
              if (!this.field_Ab) {
                stackIn_15_1 = ae.field_b;
              } else {
                stackIn_15_1 = sk.field_b;
              }
              ((me) (Object) stackIn_14_0).a(stackIn_15_1, (byte) 111, -1);
            }
          } else {
            var6.a(ee.field_f, (byte) 106, 11);
            var6.a(ki.field_u, (byte) 111, 17);
          }
          if (param2 != 3) {
            if (param2 == 4) {
              var6.a(ad.field_e, (byte) -117, 8);
            } else {
              if (6 == param2) {
                var6.a(ea.field_B, (byte) -114, 9);
              } else {
                if (param2 == 9) {
                  var6.a(81, fk.field_j, (wc) (this));
                }
              }
            }
          } else {
            var6.a(bd.field_b, (byte) 110, 7);
          }
          this.a((byte) -92, (qm) (var6));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ed.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    final static String k(int param0) {
        if (param0 != -952) {
          field_tb = (String) null;
          if (in.field_Gb == sk.field_a) {
            return ln.field_Q;
          }
          if (hb.field_Gb == sk.field_a) {
            return ji.field_j;
          }
          if (!wn.field_z.a((byte) -81)) {
            return ji.field_j;
          }
          return ge.field_g;
        }
        if (in.field_Gb == sk.field_a) {
          return ln.field_Q;
        }
        if (hb.field_Gb == sk.field_a) {
          return ji.field_j;
        }
        if (!wn.field_z.a((byte) -81)) {
          return ji.field_j;
        }
        return ge.field_g;
    }

    final static void a(byte param0, eg param1) {
        ai var2 = null;
        try {
          ai.a(param1.a("", "headers.packvorbis", -1));
          if (param0 != -17) {
            field_tb = (String) null;
          }
          var2 = ai.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ed.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          if (!this.field_zb) {
            fk.a(cd.e(104), false, "tochangedisplayname.ws");
            return;
          }
          ee.a(3, (byte) 30);
          this.h(77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ed.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 90) {
          return;
        }
        if (pm.field_b != null) {
          de.b(de.field_i, de.field_c, -de.field_i + de.field_h, de.field_k - de.field_c);
          pm.field_b.a(param1, true);
        }
    }

    final static void j(int param0) {
        int var1 = ea.field_F * ea.field_F;
        int var2 = -(jo.field_e * jo.field_e) + var1;
        int var3 = (-ma.field_N + vd.field_k) * var2 / var1 + ma.field_N;
        n.field_g.a(640, sa.field_Hb, var3, param0, (byte) -120);
        jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
    }

    static {
        field_Db = "Security";
        field_Eb = "IMP MASTER - ";
        field_Ib = new int[]{21, 22, 23};
        field_tb = "This is <%0>'s RuneScape clan if they have one.";
        field_xb = "End Game";
        field_Cb = -1;
    }
}
