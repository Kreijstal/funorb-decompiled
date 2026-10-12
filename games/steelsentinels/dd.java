/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    String field_k;
    private String field_a;
    private int field_f;
    private int[] field_i;
    int field_g;
    static int field_d;
    static SceneWidget field_b;
    static volatile boolean field_e;
    static String field_l;
    private long field_h;
    dn field_j;
    SceneWidget field_c;

    final static String a(int param0, byte param1, String param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        CipherPacketBuffer var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param2);
          if (!ArchiveProvider.a(true, var6)) {
            stackIn_2_0 = en.field_a;
            return stackIn_2_0;
          }
          if (Projectile.a(86, param2)) {
            stackIn_6_0 = o.field_f;
            return stackIn_6_0;
          }
          if (qc.field_P != 2) {
            stackIn_10_0 = nc.field_p;
            return stackIn_10_0;
          }
          if (param1 != 55) {
            field_l = (String) null;
          }
          if (o.a(-42, param2)) {
            stackIn_16_0 = db.a(sn.field_s, param1 - 78, new String[]{param2});
            return stackIn_16_0;
          }
          if (cc.field_gc >= 100) {
            stackIn_19_0 = NodeIterator.field_g;
            return stackIn_19_0;
          }
          if (pf.a(param2, -112)) {
            stackIn_23_0 = db.a(mg.field_ic, -12, new String[]{param2});
            return stackIn_23_0;
          }
          var5 = mm.field_g;
          var5.writeCipheredOpcode(param0, (byte) -117);
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte((byte) 111, 2);
          var5.a(param2, -93);
          var5.b((byte) -28, var5.position - var4);
          stackIn_25_0 = null;
          return (String) (stackIn_25_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("dd.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        if (param0 != 0) {
          String var2 = (String) null;
          dd.a((ResourceArchive) null, (ResourceArchive) null, false, (String) null, (String) null);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (17 == param0) {
          FunOrbClient.field_x = new td(this.field_c.field_Rb, this.field_c.field_cb, this.field_c.field_zb, this.field_c.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, ParticleEffect.field_K, this.field_k, this.field_h);
          return true;
        }
        if (param1 > 115) {
          return false;
        }
        return true;
    }

    final void c(int param0) {
        String var3 = null;
        String var2 = null;
        String var2Lifetime1;
        if (param0 <= -1) {
          if (this.field_k != null &&
            this.field_h != GameplayController.field_G) {
            var3 = this.b(2);
            var2 = var3;
            this.field_j.a(2, 17, db.a(gd.field_ob, -40, new String[]{var3}));
          }
          return;
        }
        field_l = (String) null;
        if (this.field_k != null &&
          this.field_h != GameplayController.field_G) {
          var3 = this.b(2);
          var2Lifetime1 = var3;
          this.field_j.a(2, 17, db.a(gd.field_ob, -40, new String[]{var3}));
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = SteelSentinels.obfuscationControl;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime2Lifetime1;
        int var4Lifetime2Lifetime2;
        int var4Lifetime2Lifetime3;
        if (0 == param1) {
          ik.a(this.field_h, param0, false);
          var4 = -14 / ((35 - param2) / 45);
          return true;
        }
        if (param1 == 1) {
          ec.a(param0, false, this.field_h);
          var4Lifetime1 = -14 / ((35 - param2) / 45);
          return true;
        }
        if (param1 == 2) {
          jg.a(this.field_g, (byte) 112, param0);
        } else {
          if (3 == param1) {
            na.a((byte) -40, param0, this.field_g);
            var4Lifetime2 = -14 / ((35 - param2) / 45);
            return true;
          }
          if (param1 == 10) {
            ei.a(this.field_g, (byte) -23, param0);
            var4Lifetime2Lifetime1 = -14 / ((35 - param2) / 45);
            return true;
          }
          if (param1 == 15) {
            nl.a(this.field_g, param0, 5);
            var4Lifetime2Lifetime2 = -14 / ((35 - param2) / 45);
            return true;
          }
          if (param1 != 16) {
            return false;
          }
          nl.a(0, param0, 5);
          var4Lifetime2Lifetime3 = -14 / ((35 - param2) / 45);
          return true;
        }
        var4Lifetime3 = -14 / ((35 - param2) / 45);
        return true;
    }

    final boolean b(byte param0) {
        if (param0 <= 66) {
          this.field_g = -63;
          if (null == this.field_j) {
            return false;
          }
          if (this.field_j.j(-108)) {
            return true;
          }
          return false;
        }
        if (null == this.field_j) {
          return false;
        }
        if (this.field_j.j(-108)) {
          return true;
        }
        return false;
    }

    final void a(int param0, na param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_g) {
            return;
          }
          this.field_f = param1.field_k;
          if (0 == param1.field_k) {
            if (0 == sg.field_c) {
              this.field_j.a(param0 + 2, 12, jh.field_f);
            }
            this.field_j.a(param0 ^ 2, 13, lk.field_V);
          }
          if (param1.field_k == 1) {
            if (0 == pm.field_Z) {
              this.field_j.a(2, 12, ne.field_H);
            }
            this.field_j.a(2, 13, og.field_a);
          }
          if (param1.field_k == 2) {
            if (CachedArchiveProvider.field_y == 0) {
              this.field_j.a(2, 12, fj.field_c);
            }
            this.field_j.a(2, 13, he.field_f);
          }
          if (param0 == 0) {
            return;
          }
          field_d = -60;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("dd.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final String b(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == 2) {
          if (this.field_a == null) {
            var2 = this.field_k;
          } else {
            var2 = this.field_a;
          }
          return var2;
        }
        this.field_i = (int[]) null;
        if (this.field_a == null) {
          var2Lifetime1 = this.field_k;
        } else {
          var2Lifetime1 = this.field_a;
        }
        return var2Lifetime1;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var6 = this.field_j.a(param0, true);
        int var7 = -12 % ((-56 - param1) / 50);
        if (-2 != var6) {
          discarded$0 = this.a(param4, var6, (byte) 109);
          discarded$1 = this.b(var6, -7, param3);
          discarded$2 = this.a(false, param3, var6);
          discarded$3 = this.a(var6, 120, param2);
          return true;
        }
        return false;
    }

    final void b(boolean param0, byte param1) {
        this.field_j.a(param0, (byte) 126);
        int var3 = -36 % ((param1 - 65) / 48);
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ah var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (null != this.field_k && (~GameplayController.field_G != ~this.field_h ||
            2 == param2) && qc.field_P == 2) {
            var7 = this.b(param1 + 4);
            var4 = var7;
            var5 = wi.a(this.field_k, (byte) 114);
            var6 = o.a(-128, this.field_k) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_j.a(param1 ^ -4, 4, db.a(ti.field_r, param1 - 121, new String[]{var7}));
              this.field_j.a(2, 6, db.a(g.field_g, param1 - 30, new String[]{var7}));
              if (param0 != null &&
                param2 != 2 &&
                !fj.field_e) {
                this.field_i = param0;
                this.field_j.a(2, 19, db.a(lj.field_f, -75, new String[]{var7}));
              }
            }
            if (var5 != null) {
              if (!ob.a((byte) -38, this.field_k) &&
                !fj.field_e) {
                if (!uc.field_g) {
                  this.field_j.a(2, 8, db.a(rj.field_c, -108, new String[]{var7}));
                }
                this.field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[]{var7}));
                if (param0 != null) {
                  this.field_i = param0;
                  this.field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 - 77, new String[]{var7}));
                }
              }
              this.field_j.a(2, 5, db.a(ei.field_r, -76, new String[]{var7}));
            }
            if (var6 != 0) {
              this.field_j.a(2, 7, db.a(fk.field_n, -52, new String[]{var7}));
            }
          }
          if (param1 == -2) {
            return;
          }
          dd.a(45, 110);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("dd.N(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, byte param1) {
        String discarded$11 = null;
        String discarded$10 = null;
        String discarded$9 = null;
        String discarded$8 = null;
        String discarded$5 = null;
        String discarded$7 = null;
        String discarded$6 = null;
        String discarded$3 = null;
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        String discarded$4 = null;
        cc var4;
        String var5;
        int var6;
        cc var7;
        var6 = SteelSentinels.obfuscationControl;
        if (null == this.field_k) {
          if (param1 < -73) {
            return;
          }
          discarded$11 = this.b(96);
          return;
        }
        if (GameplayController.field_G == this.field_h) {
          if (param1 < -73) {
            return;
          }
          discarded$10 = this.b(96);
          return;
        }
        if (null == nf.field_b) {
          if (param1 < -73) {
            return;
          }
          discarded$9 = this.b(96);
          return;
        }
        if (!kk.a(-28548)) {
          if (param1 < -73) {
            return;
          }
          discarded$8 = this.b(96);
          return;
        }
        var7 = ri.a(this.field_h, false);
        var4 = kh.a(false, this.field_h);
        var5 = this.b(2);
        if (var4 != null) {
          if (!nf.field_b.field_rc) {
            this.field_j.a(2, 1, db.a(bg.field_E, -88, new String[]{var5}));
            if (param1 < -73) {
              return;
            }
            discarded$5 = this.b(96);
            return;
          }
          if (nf.field_b.field_Mc < 0) {
            if (param1 < -73) {
              return;
            }
            discarded$7 = this.b(96);
            return;
          }
          this.field_j.a(2, 1, db.a(bg.field_E, -88, new String[]{var5}));
          if (param1 < -73) {
            return;
          }
          discarded$6 = this.b(96);
          return;
        }
        if (var7 != null &&
          nf.field_b.field_dc) {
          if (nf.field_b.field_wc >= nf.field_b.field_Ub) {
            if (param1 < -73) {
              return;
            }
            discarded$3 = this.b(96);
            return;
          }
          if (var7.field_Zb) {
            this.field_j.a(2, 1, db.a(va.field_a, -118, new String[]{var5}));
            if (param1 < -73) {
              return;
            }
            discarded$0 = this.b(96);
            return;
          }
          if (param0 &&
            var7.field_kc) {
            this.field_j.a(2, 0, db.a(ArticulatedPart.field_P, -104, new String[]{var5}));
            this.field_j.a(2, 1, db.a(bh.field_o, -54, new String[]{var5}));
            if (param1 < -73) {
              return;
            }
            discarded$1 = this.b(96);
            return;
          }
          this.field_j.a(2, 0, db.a(t.field_j, -18, new String[]{var5}));
          if (param1 < -73) {
            return;
          }
          discarded$2 = this.b(96);
          return;
        }
        if (param1 < -73) {
          return;
        }
        discarded$4 = this.b(96);
        return;
    }

    final void a(byte param0) {
        String var3;
        int var4;
        hk var5;
        var4 = SteelSentinels.obfuscationControl;
        if (null != nf.field_b) {
          if (param0 == 64) {
            return;
          }
          this.field_a = (String) null;
          return;
        }
        var5 = en.a(this.field_g, 28858);
        if (var5 == null) {
          if (param0 == 64) {
            return;
          }
          this.field_a = (String) null;
          return;
        }
        var3 = var5.field_Xb;
        if (var5.field_vc) {
          this.field_j.a(2, 2, db.a(ah.field_Xb, -31, new String[]{var3}));
          this.field_j.a(param0 ^ 66, 3, db.a(vi.field_Z, -38, new String[]{var3}));
        } else {
          if (var5.field_cc) {
            this.field_j.a(param0 ^ 66, 2, db.a(cl.field_a, -126, new String[]{var3}));
          } else {
            if (!var5.field_bc &&
              var5.field_dc) {
              if (!var5.field_rc) {
                this.field_j.a(2, 2, db.a(cd.field_f, -70, new String[]{var3}));
              } else {
                if (var5.field_cc) {
                  this.field_j.a(2, 2, db.a(cd.field_f, -70, new String[]{var3}));
                }
              }
            }
          }
          if (var5.field_bc) {
            this.field_j.a(2, 3, db.a(km.field_d, param0 - 109, new String[]{var3}));
          }
        }
        if (param0 == 64) {
          return;
        }
        this.field_a = (String) null;
        return;
    }

    final static int a(int param0, int param1) {
        if (param0 == 20612) {
          return lf.field_e[2047 & param1];
        }
        String var3 = (String) null;
        dd.a(120, (byte) -58, (String) null);
        return lf.field_e[2047 & param1];
    }

    final static ld a(ResourceArchive param0, ResourceArchive param1, boolean param2, String param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ld stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            dd.a(18);
          }
          var5_int = param0.getGroupId(param3, 46);
          var6 = param0.getFileId(var5_int, -32759, param4);
          stackIn_3_0 = in.a(param1, 112, var6, param0, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("dd.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        if (param0) {
          dd.a(-11);
        }
        if (param2 == 8) {
          bc.a(this.field_h, this.field_k, 2);
          return true;
        }
        if (param2 == 18) {
          ic.a(-23543, this.field_h, this.field_k);
          return true;
        }
        if (param2 == 11) {
          il.a(0, this.field_f, param1, -18853);
          return true;
        }
        if (param2 == 12) {
          il.a(1, this.field_f, param1, -18853);
          return true;
        }
        if (param2 == 13) {
          il.a(2, this.field_f, param1, -18853);
          return true;
        }
        if (param2 == 14) {
          lk.g(0);
          return true;
        }
        if (param2 == 20) {
          pd.j(13171);
          return true;
        }
        if (param2 != 19) {
          return false;
        }
        dl.a(this.field_h, this.field_i, -116, this.field_f, this.field_k);
        return true;
    }

    private final boolean b(int param0, int param1, int param2) {
        String var5 = null;
        String var6 = null;
        String var7 = null;
        if (param1 != -7) {
          return false;
        }
        Object var4 = null;
        if (4 != param0) {
          if (param0 == 5) {
            var5 = nl.a(this.field_k, param2, true);
            if (var5 != null) {
              sj.a((String) null, var5, 0, (byte) 21, this.field_k, 2);
              return true;
            }
            return true;
          }
          if (param0 != 6) {
            if (param0 != 7) {
              return false;
            }
            var6 = rn.a(this.field_a, param2, this.field_k, true);
            if (var6 != null) {
              sj.a((String) null, var6, 0, (byte) 21, this.field_k, 2);
              return true;
            }
            return true;
          }
          var7 = dd.a(param2, (byte) 55, this.field_k);
          if (var7 == null) {
            return true;
          }
          sj.a((String) null, var7, 0, (byte) 21, this.field_k, 2);
          return true;
        }
        String var8 = lj.a(this.field_k, (byte) -79, param2);
        if (var8 == null) {
          return true;
        }
        sj.a((String) null, var8, 0, (byte) 21, this.field_k, 2);
        return true;
    }

    dd(SceneWidget param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_j = new dn(jn.field_h);
          this.field_k = param2;
          this.field_i = param6;
          this.field_g = param4;
          this.field_h = param1;
          this.field_f = param5;
          this.field_a = param3;
          this.field_c = param0;
          param0.field_G = true;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "dd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = true;
        field_l = "(Including <%0>)";
    }
}
