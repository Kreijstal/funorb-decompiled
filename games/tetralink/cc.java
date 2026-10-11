/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements kg {
    static hl field_j;
    private int field_l;
    private int field_c;
    private int field_k;
    static int field_f;
    private int field_h;
    private int field_i;
    private jb field_g;
    private int field_b;
    static oh field_a;
    private int field_d;
    static String field_e;

    final static String a(CharSequence param0, byte param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TetraLink.field_J;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = 0;
          var3 = param0.length();
          while (var3 > var2_int) {
            if (tk.a((byte) 81, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (tk.a((byte) 81, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param0.charAt(var6);
            if (sj.a(3010, (char) var7)) {
              var8 = kb.a((char) var7, -122);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (param1 < 94) {
            cc.a(86, (byte) -28);
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("cc.A(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    final static short[] a(short[] param0, bc param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TetraLink.field_J;
        try {
          var4_int = param1.e(param2, (byte) -112);
          if (0 == var4_int) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param0 == null ||
            var4_int != param0.length) {
            param0 = new short[var4_int];
          }
          var5 = param1.e(4, (byte) -112);
          var6 = (short)param1.e(16, (byte) -112);
          if (param3 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)(var6 + param1.e(var5, (byte) -112));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param0);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("cc.H(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void c(int param0) {
        dd.b(param0 - 17958);
        if (param0 != 17896) {
          return;
        }
        qa.field_v = true;
        jd.field_a = true;
        mf.field_s.i(0);
        uf.a(id.field_n, false, false);
    }

    final static int a(byte param0, int param1) {
        param1 = (param1 & 1431655765) + ((param1 & -1431655765) >>> 1);
        param1 = (param1 >>> 2 & -1288490189) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        if (param0 != 71) {
          return -19;
        }
        return 255 & param1;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        qd var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = !(param0 instanceof qd) ? null : (qd) (param0);
          ra.c(param0.field_t + param1, param2 + param0.field_w, param0.field_F, param0.field_u, this.field_b);
          if (var14 == null) {
          }
          var7 = param1 + (param0.field_t + var14.field_V);
          var8 = param2 - (-param0.field_w - var14.field_Z);
          ra.f(var7, var8, var14.field_bb, this.field_h);
          if (!param3) {
            this.field_b = 42;
          }
          if (-1 != var14.field_U) {
            var9 = (double)var14.field_U * 3.141592653589793 * 2.0 / (double)var14.field_R;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_bb);
            var12 = (int)(Math.cos(var9) * (double)var14.field_bb);
            ra.f(var7 + var11, var12 + var8, 1, this.field_l);
          }
          ra.f(var7, var8, 2, 1);
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_R;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.field_bb);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.field_bb);
          ra.d(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (this.field_g != null) {
            var13 = var14.field_V + var14.field_bb + this.field_k;
            this.field_g.a(param0.field_A, param0.field_t + (param1 + var13), this.field_d + (param2 + param0.field_w), -var13 + (-this.field_k + param0.field_F), param0.field_u - (this.field_k << 1), this.field_i, this.field_c, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "cc.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static db[] b(int param0) {
        if (param0 <= 36) {
          return (db[]) null;
        }
        return new db[]{rj.field_f, qj.field_c, ej.field_r, ni.field_h, e.field_e, mk.field_c, ji.field_Qb, la.field_i, dj.field_g, io.field_d, hh.field_b, uk.field_t, je.field_d, wd.field_e};
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -80) {
            field_j = (hl) null;
          }
          if (!cl.field_e) {
            return false;
          }
          if (sf.field_d == 2 &&
            null != qj.field_a) {
            var3 = (CharSequence) ((Object) param0);
            if (qj.field_a.equals(cc.a(var3, (byte) 95))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("cc.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_j = null;
        field_e = null;
        int var1 = 57 / ((param0 + 40) / 56);
    }

    cc(jb param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_i = param3;
          this.field_d = param2;
          this.field_c = param4;
          this.field_l = param6;
          this.field_b = param7;
          this.field_h = param5;
          this.field_k = param1;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void b(boolean param0, boolean param1) {
        if (ak.a(3058)) {
          param1 = false;
        }
        on.a(param0, param1);
        kk.g(-1);
    }

    final static int a(int param0, byte param1) {
        param0--;
        if (param1 > -47) {
          field_e = (String) null;
        }
        param0 = param0 | param0 >>> 1;
        param0 = param0 | param0 >>> 2;
        param0 = param0 | param0 >>> 4;
        param0 = param0 | param0 >>> 8;
        param0 = param0 | param0 >>> 16;
        return param0 + 1;
    }

    final static void a(boolean param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        hl stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3 = 0;
        Object stackIn_32_0 = null;
        nh stackIn_32_1 = null;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hl var7 = null;
        int var7_int = 0;
        int var8 = 0;
        hl var8_ref_hl = null;
        nh var9 = null;
        int var9_int = 0;
        nh var10 = null;
        int var10_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var13 = TetraLink.field_J;
        try {
          cf.field_n = ra.field_f;
          bk.field_c = ra.field_e;
          if (!param0) {
            stackIn_4_0 = am.field_f;
          } else {
            stackIn_4_0 = ng.field_t;
          }
          nb.a(stackIn_4_0, (byte) 1);
          we.field_e.a(0, 0, -40 + tl.field_P.field_R - 2, 66, tl.field_P.field_Hb);
          e.field_d.a((byte) -92, qd.field_Q.field_Hb, 0, qe.field_d, 0);
          stackIn_6_0 = ae.field_J;
          stackIn_6_1 = -92;
          stackIn_6_2 = qd.field_Q.field_Hb;
          if (!kj.field_b) {
            stackIn_7_3 = 0;
          } else {
            stackIn_7_3 = 2 + ha.field_e + 42;
          }
          ((hl) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2 - stackIn_7_3, qe.field_d + 2, 18, 0);
          lh.field_q.a((byte) -97, ha.field_e + 42, qe.field_d + 2, 18, qd.field_Q.field_Hb - ha.field_e - 42);
          v.field_x.a(qd.field_Q.field_Hb, ha.field_e, -qe.field_d + (qd.field_Q.field_R - 22), param1, 20 + (qe.field_d + 2), 0, 2);
          qi.field_n.a((byte) -100, tl.field_P.field_Hb, -40 + tl.field_P.field_R, 40, 0);
          ua.field_d.a((byte) -95, fk.field_V.field_Hb, 0, 30, 0);
          bl.field_Qb.a((byte) -94, fk.field_V.field_Hb, 30, -30 + fk.field_V.field_R - 40 - 2, 0);
          var2_int = 3 + hg.field_k;
          if (cl.field_f.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = -2 + (-10 + (-5 + bl.field_Qb.field_R - 5 + 2 + (var2_int + 1) / 2)) / (1 + var2_int);
          if (30 < var3) {
            var3 = 30;
          }
          var4 = -5 + bl.field_Qb.field_R - (5 + (2 + var3) * var2_int);
          if (var4 > 40) {
            var4 = 40;
          }
          f.field_x.a((byte) -93, -5 + bl.field_Qb.field_Hb - 5, 5, var4, 5);
          var5 = var4 + 5 + 2;
          for (var6 = 0; hg.field_k + 4 > var6; var6++) {
            if ((var6 != 1 ||
              !(cl.field_f.length < 2)) && (3 != var6 ||
              !(mk.field_e <= 1))) {
              if (!param0 &&
                3 == var6) {
                var7 = em.field_m[var6];
                em.field_m[var6].field_R = 0;
                var7.field_Hb = 0;
                for (var8 = 0; var8 < cn.field_e[var6].length; var8++) {
                  if (null != cn.field_e[var6][var8]) {
                    var9 = cn.field_e[var6][var8];
                    cn.field_e[var6][var8].field_R = 0;
                    var9.field_Hb = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var7 = em.field_m[var6];
                em.field_m[var6].field_R = 0;
                var7.field_Hb = 0;
                for (var8 = 0; var8 < cn.field_e[var6].length; var8++) {
                  stackIn_32_0 = null;
                  stackIn_32_1 = cn.field_e[var6][var8];
                  if (stackIn_32_0 != stackIn_32_1) {
                    var9 = cn.field_e[var6][var8];
                    cn.field_e[var6][var8].field_R = 0;
                    var9.field_Hb = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (ve.field_d != null) {
                      stackIn_47_0 = (ve.field_d[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_47_0 = 0;
                    }
                  } else {
                    stackIn_47_0 = 0;
                  }
                } else {
                  stackIn_47_0 = 0;
                }
                var7_int = stackIn_47_0;
                if (var7_int != 0) {
                  var8_ref_hl = em.field_m[var6];
                  em.field_m[var6].field_R = 0;
                  var8_ref_hl.field_Hb = 0;
                  var14 = 0;
                  var9_int = var14;
                  while (var14 < cn.field_e[var6].length) {
                    if (null != cn.field_e[var6][var14]) {
                      var10 = cn.field_e[var6][var14];
                      cn.field_e[var6][var14].field_R = 0;
                      var10.field_Hb = 0;
                    }
                    var14++;
                  }
                } else {
                  em.field_m[var6].a((byte) -101, 103, var5, var3, 5);
                  var8 = 110;
                  if (param0) {
                    cn.field_e[var6][0].b(0, 38, var5, eh.field_w, var8, 2, var3);
                    var8 += 40;
                  } else {
                    if (null != cn.field_e[var6][0]) {
                      var9 = cn.field_e[var6][0];
                      cn.field_e[var6][0].field_R = 0;
                      var9.field_Hb = 0;
                    }
                  }
                  var9_int = -var8 - 5 + fk.field_V.field_Hb + 2;
                  var10_int = -1 + cn.field_e[var6].length;
                  for (var11 = 0; var11 < var10_int; var11++) {
                    var12 = var11 * var9_int / var10_int;
                    cn.field_e[var6][var11 + 1].b(0, (var11 + 1) * var9_int / var10_int - (2 + var12), var5, eh.field_w, var12 + var8, 2, var3);
                  }
                  var5 = var5 + (2 + var3);
                }
              }
            }
          }
          fj.field_b.a((byte) -127, 360, 10, -130 + ra.field_e - 4 - 10, -360 + ra.field_f >> 1);
          dc.field_l.a((byte) -102, fj.field_b.field_Hb, 0, 24, 0);
          wb.field_e.a((byte) -79, fj.field_b.field_Hb, 24, fj.field_b.field_R - 24, 0);
          wb.field_e.field_Eb = ah.a(1, 3, 8421504, 16, 11579568, wb.field_e.field_R);
          hh.field_c.a((byte) -105, wb.field_e.field_Hb - 10, 5, -12 + (wb.field_e.field_R - 24), 5);
          c.field_b.a((byte) -118, 80, -29 + wb.field_e.field_R, 24, (wb.field_e.field_Hb - 80) / 2);
          g.c(1753);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "cc.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new oh(128, 128);
        field_e = "Players: ";
    }
}
