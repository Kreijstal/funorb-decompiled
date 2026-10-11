/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bba implements ntb {
    static int field_d;
    static int field_a;
    static String field_e;
    private wm[] field_b;
    private rna[] field_c;
    static String field_f;

    public final boolean a(byte param0, tv param1) {
        bba var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (bba) (param1);
          var4 = -88 / ((22 - param0) / 59);
          stackIn_5_0 = (dn.a(var3.field_b, true, 1, this.field_b, -4)) || (dn.a(var3.field_c, true, 1, this.field_c, -73));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("bba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(rsb param0, int param1) {
        int var4_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        wm var5_ref_wm = null;
        int var5 = 0;
        int var6_int = 0;
        rna var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (param1 >= -27) {
            return;
          }
          var3_int = 1;
          if (null != this.field_b) {
            for (var4_int = 0; this.field_b.length > var4_int; var4_int++) {
              var5_ref_wm = this.field_b[var4_int];
              var6_int = var5_ref_wm.a(0, param0.field_e, param0.field_g) ^ var5_ref_wm.field_a ? 1 : 0;
              if (var6_int == 0) {
                var3_int = 0;
              }
            }
          }
          if (var3_int != 0 &&
            null != this.field_c) {
            var4 = null;
            if (null != this.field_b) {
              for (var5 = 0; var5 < this.field_b.length; var5++) {
                var4 = this.field_b[var5].a(param0.field_g, 120, (int[]) (var4));
              }
            }
            var8 = 0;
            var5Lifetime1 = var8;
            while (var8 < this.field_c.length) {
              var6 = this.field_c[var8];
              var6.a(1, (int[]) (var4), param0);
              var8++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("bba.N(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        bba var9 = null;
        Class[] var4 = null;
        dja[] var5 = null;
        Class[] var6 = null;
        dja[] var7 = null;
        try {
          var9 = (bba) (param1);
          var4 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
          var5 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
          var9.field_b = (wm[]) (hla.a(var4, this.field_b, var5, -118, var9.field_b, 1, jv.field_d));
          if (param0 <= 54) {
            tv var8 = (tv) null;
            this.a((tv) null, 121);
          }
          var6 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
          var7 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
          var9.field_c = (rna[]) (hla.a(var6, this.field_c, var7, -120, var9.field_c, 1, nha.field_o));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bba.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(rna param0, boolean param1) {
        try {
          this.field_c = (rna[]) (ija.a(param0, this.field_c, 0, nha.field_o));
          if (!param1) {
            wm var4 = (wm) null;
            this.a((byte) 23, (wm) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bba.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        bba var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (bba) (param0);
          tja.a(var3.field_b, 1, this.field_b, true, 5547);
          tja.a(var3.field_c, 1, this.field_c, true, 5547);
          var4 = 0;
          if (dn.a(var3.field_b, true, 1, this.field_b, -64)) {
            System.out.println("MissionCondition[] conditions has changed. ");
            var4 = 1;
          }
          if (param1 >= -19) {
            return;
          }
          if (dn.a(var3.field_c, true, 1, this.field_c, -13)) {
            System.out.println("MissionAction[] actions has changed. ");
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionEvent has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bba.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        Class[] var5 = null;
        Class[] var4 = null;
        try {
          if (param1 >= -109) {
            this.a(-43, -72);
          }
          var5 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
          pjb.a(param0, this.field_b, 8, 1, var5, 122);
          var4 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
          pjb.a(param0, this.field_c, 8, 1, var4, 118);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bba.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final wm[] a(byte param0) {
        if (param0 >= -110) {
          rsb var3 = (rsb) null;
          this.a((rsb) null, -8);
        }
        return this.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 > -30) {
          return;
        }
        field_e = null;
    }

    final void a(byte param0, wm param1) {
        try {
          this.field_b = (wm[]) (ija.a(param1, this.field_b, 0, jv.field_d));
          if (param0 >= -97) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bba.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        Class[] var5 = null;
        dja[] var6 = null;
        Class[] var7 = new Class[]{cqb.class, jsb.class, om.class, wm.class, iia.class, vp.class, dab.class, ih.class, cc.class};
        dja[] var4 = new dja[]{lq.field_i, scb.field_o, baa.field_o, jv.field_d, te.field_o, nd.field_s, ag.field_q, rla.field_v, oua.field_b};
        this.field_b = (wm[]) (iq.a(var4, this.field_b, var7, jv.field_d, 8, param0, 1, 108));
        if (param1) {
          return;
        }
        try {
          var5 = new Class[]{cf.class, jpa.class, lrb.class, uoa.class, rna.class, via.class, oca.class, tt.class, ika.class, pob.class};
          var6 = new dja[]{leb.field_o, re.field_k, psa.field_o, cwa.field_a, nha.field_o, kg.field_r, gjb.field_o, wlb.field_q, uib.field_o, whb.field_c};
          this.field_c = (rna[]) (iq.a(var6, this.field_c, var5, nha.field_o, 8, param0, 1, 119));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "bba.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int stackIn_6_0 = 0;
        if (param1 != -79) {
          this.field_b = (wm[]) null;
        }
        if (0 <= param0) {
          if (this.field_b == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = this.field_b.length;
          }
          var3 = stackIn_6_0;
          if (this.field_b != null &&
            param0 < this.field_b.length) {
            this.field_b = (wm[]) (dt.a(jv.field_d, param0, 15667, this.field_b));
          } else {
            if (null != this.field_c &&
              -var3 + param0 < this.field_c.length) {
              this.field_c = (rna[]) (dt.a(nha.field_o, param0 - var3, 15667, this.field_c));
            }
          }
        }
    }

    final static int a(int param0, ml param1, int param2, int[] param3) {
        int dupTemp$4 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 0) {
            stackIn_3_0 = 41;
            return stackIn_3_0;
          }
          if (param1.field_d != null &&
            param1.field_d.length != 0) {
            while (param3.length > param2) {
              dupTemp$4 = param3[param2++];
              var4_int = dupTemp$4;
              if (dupTemp$4 != -1) {
                var5 = param3[param2++];
                var6 = new ml(var5);
                param1.a(1, var4_int, var6);
                param2 = bba.a(param0 ^ 0, var6, param2, param3);
                if (var4_int != -1 + param1.field_d.length) {
                  continue;
                }
              }
              break;
            }
            stackIn_14_0 = param2;
            return stackIn_14_0;
          }
          stackIn_8_0 = param2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("bba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final rna[] c(byte param0) {
        if (param0 != -42) {
          return (rna[]) null;
        }
        return this.field_c;
    }

    final void a(int param0, int param1) {
        if (param1 != -1) {
          this.c((byte) 14);
        }
        if (param0 >= 0 &&
          (this.field_b != null && this.field_b.length > param0)) {
          this.field_b[param0].field_a = !this.field_b[param0].field_a ? true : false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        int var4 = -113 % ((param0 - 32) / 63);
        if (0 > param1) {
          return 0;
        }
        int var5 = this.field_b != null ? this.field_b.length : 0;
        if (this.field_b != null &&
          param1 < this.field_b.length) {
          return this.field_b[param1].a((byte) -117, param2);
        }
        if (null != this.field_c &&
          param1 - var5 < this.field_c.length) {
          return this.field_c[-var5 + param1].a(param2, -125);
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3, pe param4) {
        int var6_int = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var6_intLifetime1;
        try {
          if (param3 >= 0) {
            if (this.field_b != null) {
              stackIn_5_0 = this.field_b.length;
            } else {
              stackIn_5_0 = 0;
            }
            var6_int = stackIn_5_0;
            if (null != this.field_b &&
              param3 < this.field_b.length) {
              this.field_b[param3].a(param4, -2, param2, param0);
            } else {
              if (null != this.field_c) {
                if (-var6_int + param3 >= this.field_c.length) {
                  var6_int = -7 % ((35 - param1) / 63);
                  return;
                }
                this.field_c[-var6_int + param3].a(param4, false, param2, param0);
              }
            }
          }
          var6_intLifetime1 = -7 % ((35 - param1) / 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("bba.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_e = "Enter name of friend to delete from list";
        field_a = 50;
        field_f = "Mode";
    }
}
