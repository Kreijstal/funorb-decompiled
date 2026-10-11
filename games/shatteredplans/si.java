/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends df {
    static String field_w;
    static boolean field_v;
    boolean field_y;
    char[] field_s;
    static String field_q;
    static int field_u;
    char[] field_p;
    static String[] field_o;
    int[] field_x;
    String field_t;
    int[] field_r;

    final static void f(byte param0) {
        if (!eh.field_P) {
          throw new IllegalStateException();
        }
        or.field_a = true;
        wk.a(false, true);
        gm.field_i = 0;
        if (param0 != -91) {
          qb var2 = (qb) null;
          si.a(-82, (qb) null, -122, (byte) -43, -19, -109);
        }
    }

    final static int a(int param0, int param1, e param2, e param3, int param4, String param5, boolean param6) {
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        ob stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        String stackIn_22_2 = null;
        ob stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_25_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var14 = param3.a((byte) -126);
          var8 = param2.a((byte) 77);
          if (param4 < 116) {
            stackIn_3_0 = 63;
            return stackIn_3_0;
          }
          if (wg.field_f == null &&
            !ts.a(false, -2)) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          if (cs.field_j == j.field_r) {
            js.field_f.field_j = 0;
            sa.field_d = null;
            if (param5 == null) {
              eo.field_cb.field_j = 0;
              eo.field_cb.e(11135, na.field_u.nextInt());
              eo.field_cb.e(11135, na.field_u.nextInt());
              stackIn_21_0 = eo.field_cb;
              stackIn_21_1 = 95;
              if (!param3.a(2)) {
                stackIn_22_2 = "";
              } else {
                stackIn_22_2 = var14;
              }
              ((ob) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_22_2);
              stackIn_24_0 = eo.field_cb;
              stackIn_24_1 = 95;
              if (!param2.a(2)) {
                stackIn_25_2 = "";
              } else {
                stackIn_25_2 = var8;
              }
              ((ob) (Object) stackIn_24_0).a((byte) stackIn_24_1, stackIn_25_2);
              js.field_f.c(16, (byte) -69);
              js.field_f.field_j = js.field_f.field_j + 1;
              var9 = js.field_f.field_j;
              co.a(25050, js.field_f, hr.field_a, eo.field_cb, jl.field_V);
              js.field_f.b(js.field_f.field_j - var9, (byte) 119);
            } else {
              var9 = 0;
              eo.field_cb.field_j = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              eo.field_cb.e(11135, na.field_u.nextInt());
              eo.field_cb.e(11135, na.field_u.nextInt());
              eo.field_cb.a((byte) 95, var14);
              eo.field_cb.a((byte) 95, var8);
              var15 = (CharSequence) ((Object) param5);
              eo.field_cb.a((byte) 95, cn.a(var15, (byte) 53));
              eo.field_cb.d(param0, 255);
              eo.field_cb.c(param1, (byte) -108);
              eo.field_cb.c(var9, (byte) -60);
              js.field_f.c(18, (byte) -76);
              js.field_f.field_j = js.field_f.field_j + 2;
              var10 = js.field_f.field_j;
              var11_ref_String = ck.a((byte) -128, kq.f((byte) 124));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              js.field_f.a(var11_ref_String, (byte) 0);
              co.a(25050, js.field_f, hr.field_a, eo.field_cb, jl.field_V);
              js.field_f.f(-549342136, -var10 + js.field_f.field_j);
            }
            d.$cfr$intArgs$a$a6964d7afeb1(-1, 82);
            cs.field_j = qe.field_k;
          }
          if (cs.field_j == qe.field_k &&
            es.a(110, 1)) {
            var9Lifetime1 = sa.field_a.j(-83);
            sa.field_a.field_j = 0;
            if (100 <= var9Lifetime1 &&
              105 >= var9Lifetime1) {
              cs.field_j = k.field_h;
              ae.field_e = new String[-100 + var9Lifetime1];
            } else {
              if (var9Lifetime1 == 248) {
                ce.a(kq.f((byte) 125), true);
                nl.field_c = dh.field_b;
                q.g(-125);
                ke.field_j = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 != var9Lifetime1) {
                cs.field_j = nr.field_m;
                ej.field_e = var9Lifetime1;
                rr.field_t = -1;
              } else {
                es.a(119, nc.a(-85));
                sa.field_d = new Boolean(ro.a((byte) -24, sa.field_a));
                sa.field_a.field_j = 0;
              }
            }
          }
          if (k.field_h == cs.field_j) {
            var9Lifetime2 = 2;
            if (es.a(-87, var9Lifetime2)) {
              var10Lifetime1 = sa.field_a.f(-20976);
              sa.field_a.field_j = 0;
              if (es.a(126, var10Lifetime1)) {
                var11 = ae.field_e.length;
                for (var12 = 0; var11 > var12; var12++) {
                  ae.field_e[var12] = sa.field_a.e((byte) -126);
                }
                q.g(-113);
                ke.field_j = false;
                stackIn_47_0 = 100 + var11;
                return stackIn_47_0;
              }
            }
          }
          if (nr.field_m == cs.field_j &&
            uc.d((byte) -28)) {
            if (ej.field_e == 255) {
              var9_ref_String = sa.field_a.i(1910283844);
              if (var9_ref_String != null) {
                jf.a(-25602, var9_ref_String, kq.f((byte) 125));
              }
            } else {
              nl.field_c = sa.field_a.e(-1);
            }
            q.g(-99);
            ke.field_j = false;
            stackIn_56_0 = ej.field_e;
            return stackIn_56_0;
          }
          if (null == wg.field_f) {
            if (ke.field_j) {
              if (wh.a(18) > 30000L) {
                nl.field_c = gq.field_f;
              } else {
                nl.field_c = wb.field_d;
              }
              ke.field_j = false;
              stackIn_63_0 = 249;
              return stackIn_63_0;
            }
            var9Lifetime3 = of.field_f;
            of.field_f = bb.field_c;
            bb.field_c = var9Lifetime3;
            ke.field_j = true;
          }
          stackIn_66_0 = -1;
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("si.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_w = null;
        field_o = null;
        if (param0 != -117) {
          return;
        }
        field_q = null;
    }

    final void e(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2Lifetime1;
        if (this.field_x != null) {
          for (var2 = 0; var2 < this.field_x.length; var2++) {
            this.field_x[var2] = ee.a(this.field_x[var2], 32768);
          }
        }
        var2Lifetime1 = 123 % ((-18 - param0) / 55);
        if (this.field_r != null) {
          for (var3 = 0; this.field_r.length > var3; var3++) {
            this.field_r[var3] = ee.a(this.field_r[var3], 32768);
          }
        }
    }

    private final void a(ob param0, byte param1, int param2) {
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_9_2 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (1 == param2) {
            this.field_t = param0.e(-1);
          } else {
            if (param2 == 2) {
              var4_int = param0.j(-100);
              this.field_p = new char[var4_int];
              this.field_r = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_r[var5] = param0.f(-20976);
                var6 = param0.g(-2852);
                stackIn_17_0 = this.field_p;
                stackIn_17_1 = var5;
                if (var6 != 0) {
                  stackIn_18_2 = oa.a(-12541, (byte) var6);
                } else {
                  stackIn_18_2 = 0;
                }
                stackIn_17_0[stackIn_17_1] = (char) stackIn_18_2;
              }
            } else {
              if (3 == param2) {
                var4_int = param0.j(-81);
                this.field_s = new char[var4_int];
                this.field_x = new int[var4_int];
                for (var5 = 0; var5 < var4_int; var5++) {
                  this.field_x[var5] = param0.f(-20976);
                  var6 = param0.g(-2852);
                  stackIn_8_0 = this.field_s;
                  stackIn_8_1 = var5;
                  if (var6 != 0) {
                    stackIn_9_2 = oa.a(-12541, (byte) var6);
                  } else {
                    stackIn_9_2 = 0;
                  }
                  stackIn_8_0[stackIn_8_1] = (char) stackIn_9_2;
                }
              } else {
                if (param2 == 4) {
                  this.field_y = true;
                }
              }
            }
          }
          if (param1 >= -58) {
            this.field_t = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("si.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static eb a(int param0, qb param1, int param2, byte param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        eb var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        eb stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = tl.a(true, param1, param4, param2, param5, param0);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new eb();
          var8 = -69 % ((44 - param3) / 49);
          var7.field_d = var9;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("si.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(ob param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          while (true) {
            var3_int = param0.j(param1 ^ 109);
            if (var3_int != 0) {
              this.a(param0, (byte) -67, var3_int);
              continue;
            }
            break;
          }
          if (param1 != -1) {
            this.field_y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("si.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    si() {
        this.field_y = false;
    }

    static {
        field_w = "Total fleets produced in this territory this turn.";
        field_q = "Open";
    }
}
