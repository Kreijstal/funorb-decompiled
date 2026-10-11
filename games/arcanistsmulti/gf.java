/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf extends ob implements vb {
    private ag field_lb;
    private ag field_kb;
    static String field_jb;
    static String field_V;

    final static void a(ll[] param0, boolean param1, byte param2, eg param3, byte[] param4, String[][] param5, byte[] param6, eg param7, int param8, eg param9, int[] param10, int param11, int param12, qb[][] param13, qb[][] param14, String[] param15, String[] param16, int[] param17, String[][] param18) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          if (param2 < 36) {
            gf.a(83, (byte) 102, 89, -126);
          }
          var20 = (String[]) null;
          gd.a(param10, param0, param14, param12, param5, param15, param8, param9, param4, (String[]) null, param7, param16, 17292, param13, param1, 1, param18, param3, param6, param17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_6_0 = var19;
          stackIn_6_1 = new StringBuilder().append("gf.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param10 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param14 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param15 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param16 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    gf(h param0) {
        super(param0, 200, 130);
        qm var2 = null;
        try {
          var2 = new qm(oc.field_d, (wc) null);
          var2.field_j = 50;
          var2.field_v = this.field_v;
          var2.field_k = 80;
          var2.field_n = 0;
          var2.field_r = (pf) ((Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c(-107, var2);
          if (lc.a((byte) 112)) {
            this.field_lb = this.a((byte) 103, la.field_e, (wc) (this));
          }
          this.field_kb = this.a((byte) 103, dd.field_e, (wc) (this));
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ArcanistsMulti.field_G ? 1 : 0;
        int var4 = -89 / ((param1 + 69) / 41);
        int var5 = -param0 + 1024;
        int var6 = (var5 * (param2 >> 16 & 255) + ((param3 & 16748890) >> 16) * param0) / 1024;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        if (var6 >= 0) {
          if (var6 <= 255) {
            var7 = (((65292 & param3) >> 8) * param0 + var5 * (255 & param2 >> 8)) / 1024;
            if (var7 < 0) {
              var7 = 0;
              var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
              if (var8 < 0) {
                var8 = 0;
                return var8 | (var7 << 8 | var6 << 16);
              }
              if (var8 > 255) {
                var8 = 255;
                return var8 | (var7 << 8 | var6 << 16);
              }
              return var8 | (var7 << 8 | var6 << 16);
            }
            if (255 < var7) {
              var7 = 255;
            }
            var8 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
            if (var8 < 0) {
              var8 = 0;
              return var8 | (var7 << 8 | var6 << 16);
            }
            if (var8 > 255) {
              var8 = 255;
              return var8 | (var7 << 8 | var6 << 16);
            }
            return var8 | (var7 << 8 | var6 << 16);
          }
          var6 = 255;
          var7Lifetime2 = (((65292 & param3) >> 8) * param0 + var5 * (255 & param2 >> 8)) / 1024;
          if (var7Lifetime2 < 0) {
            var7Lifetime2 = 0;
            var8Lifetime3 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
            if (var8Lifetime3 < 0) {
              var8Lifetime3 = 0;
              return var8Lifetime3 | (var7Lifetime2 << 8 | var6 << 16);
            }
            if (var8Lifetime3 > 255) {
              var8Lifetime3 = 255;
              return var8Lifetime3 | (var7Lifetime2 << 8 | var6 << 16);
            }
            return var8Lifetime3 | (var7Lifetime2 << 8 | var6 << 16);
          }
          if (255 < var7Lifetime2) {
            var7Lifetime2 = 255;
          }
          var8Lifetime4 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
          if (var8Lifetime4 < 0) {
            var8Lifetime4 = 0;
            return var8Lifetime4 | (var7Lifetime2 << 8 | var6 << 16);
          }
          if (var8Lifetime4 > 255) {
            var8Lifetime4 = 255;
            return var8Lifetime4 | (var7Lifetime2 << 8 | var6 << 16);
          }
          return var8Lifetime4 | (var7Lifetime2 << 8 | var6 << 16);
        }
        var6 = 0;
        var7Lifetime1 = (((65292 & param3) >> 8) * param0 + var5 * (255 & param2 >> 8)) / 1024;
        if (var7Lifetime1 < 0) {
          var7Lifetime1 = 0;
          var8Lifetime1 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
          if (var8Lifetime1 < 0) {
            var8Lifetime1 = 0;
            return var8Lifetime1 | (var7Lifetime1 << 8 | var6 << 16);
          }
          if (var8Lifetime1 > 255) {
            var8Lifetime1 = 255;
            return var8Lifetime1 | (var7Lifetime1 << 8 | var6 << 16);
          }
          return var8Lifetime1 | (var7Lifetime1 << 8 | var6 << 16);
        }
        if (255 < var7Lifetime1) {
          var7Lifetime1 = 255;
        }
        var8Lifetime2 = (param0 * (param3 & 255) + (255 & param2) * var5) / 1024;
        if (var8Lifetime2 < 0) {
          var8Lifetime2 = 0;
          return var8Lifetime2 | (var7Lifetime1 << 8 | var6 << 16);
        }
        if (var8Lifetime2 > 255) {
          var8Lifetime2 = 255;
          return var8Lifetime2 | (var7Lifetime1 << 8 | var6 << 16);
        }
        return var8Lifetime2 | (var7Lifetime1 << 8 | var6 << 16);
    }

    final static int a(int param0, int param1) {
        if (param1 != -266740663) {
          field_jb = (String) null;
          if (65536L <= (long)param0) {
            if ((long)param0 >= 16777216L) {
              if ((long)param0 < 268435456L) {
                if ((long)param0 >= 67108864L) {
                  return gj.field_g[param0 >> 20] >> 2;
                }
                return gj.field_g[param0 >> 18] >> 3;
              }
              if ((long)param0 >= 1073741824L) {
                return gj.field_g[param0 >> 24];
              }
              return gj.field_g[param0 >> 22] >> 1;
            }
            if (1048576L <= (long)param0) {
              if ((long)param0 < 4194304L) {
                return gj.field_g[param0 >> 14] >> 5;
              }
              return gj.field_g[param0 >> 16] >> 4;
            }
            if ((long)param0 < 262144L) {
              return gj.field_g[param0 >> 10] >> 7;
            }
            return gj.field_g[param0 >> 12] >> 6;
          }
          if ((long)param0 >= 256L) {
            if ((long)param0 >= 4096L) {
              if ((long)param0 < 16384L) {
                return gj.field_g[param0 >> 6] >> 9;
              }
              return gj.field_g[param0 >> 8] >> 8;
            }
            if ((long)param0 >= 1024L) {
              return gj.field_g[param0 >> 4] >> 10;
            }
            return gj.field_g[param0 >> 2] >> 11;
          }
          if (param0 < 0) {
            return -1;
          }
          return gj.field_g[param0] >> 12;
        }
        if (65536L <= (long)param0) {
          if ((long)param0 >= 16777216L) {
            if ((long)param0 < 268435456L) {
              if ((long)param0 >= 67108864L) {
                return gj.field_g[param0 >> 20] >> 2;
              }
              return gj.field_g[param0 >> 18] >> 3;
            }
            if ((long)param0 < 1073741824L) {
              return gj.field_g[param0 >> 22] >> 1;
            }
            return gj.field_g[param0 >> 24];
          }
          if (1048576L <= (long)param0) {
            if ((long)param0 >= 4194304L) {
              return gj.field_g[param0 >> 16] >> 4;
            }
            return gj.field_g[param0 >> 14] >> 5;
          }
          if ((long)param0 >= 262144L) {
            return gj.field_g[param0 >> 12] >> 6;
          }
          return gj.field_g[param0 >> 10] >> 7;
        }
        if ((long)param0 >= 256L) {
          if ((long)param0 >= 4096L) {
            if ((long)param0 >= 16384L) {
              return gj.field_g[param0 >> 8] >> 8;
            }
            return gj.field_g[param0 >> 6] >> 9;
          }
          if ((long)param0 < 1024L) {
            return gj.field_g[param0 >> 2] >> 11;
          }
          return gj.field_g[param0 >> 4] >> 10;
        }
        if (param0 >= 0) {
          return gj.field_g[param0] >> 12;
        }
        return -1;
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 98) {
            if (this.field_lb == null) {
              this.field_kb.a(0, (qm) (this));
              return true;
            }
            this.field_lb.a(0, (qm) (this));
            return true;
          }
          if (param3 == 99) {
            this.field_kb.a(0, (qm) (this));
            return true;
          }
          if (param1 <= -120) {
            stackIn_14_0 = super.a(param0, (byte) -126, param2, param3);
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("gf.N(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, eg param1) {
        kc var6 = null;
        kc var7 = null;
        kc var3 = null;
        try {
          eb.field_d = fj.a("basic", param0 ^ -22556, param1, "display_name_changed");
          nl.field_Gb = new hb(0L, oh.field_r, ln.field_T, vk.field_z);
          dd.field_c = new hb(0L, oh.field_r, dm.field_I, wl.field_M);
          ec.field_d = new kc(0L, (kc) null);
          lj.field_j = new kc(0L, pg.field_c);
          lj.field_j.field_X = 1;
          p.field_d = new kc(0L, vf.field_u, hb.field_Bb);
          nk.field_n = new kc(0L, vf.field_i, hc.field_d);
          cc.field_a = new kc(0L, nj.field_d);
          ec.field_d.a(lj.field_j, 106);
          ec.field_d.a(p.field_d, param0 + 14);
          ec.field_d.a(nk.field_n, 8);
          ec.field_d.a(nl.field_Gb, param0 - 61);
          ec.field_d.a(cc.field_a, 85);
          if (param0 != 72) {
            eg var4 = (eg) null;
            gf.a((byte) 119, (eg) null);
          }
          nl.field_Gb.field_Db.field_Hb.a(pg.field_c, (byte) 127);
          nl.field_Gb.field_Db.field_Hb.field_gb = 1;
          var6 = nl.field_Gb.field_Db.field_Hb;
          var7 = var6;
          var7.field_X = 1;
          dd.field_c.field_Db.field_Hb.a(pg.field_c, (byte) 114);
          var3 = dd.field_c.field_Db.field_Hb;
          dd.field_c.field_Db.field_Hb.field_gb = 1;
          var3.field_X = 1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gf.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(int param0) {
        if (param0 < 30) {
          field_V = (String) null;
          if (this.field_G) {
            this.field_G = false;
            return;
          }
          return;
        }
        if (this.field_G) {
          this.field_G = false;
          return;
        }
    }

    private final ag a(byte param0, String param1, wc param2) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ag(param1, param2);
          var4.field_r = (pf) ((Object) new mm());
          if (param0 != 103) {
            this.field_lb = (ag) null;
          }
          var5 = -6 + this.field_k;
          this.field_k = this.field_k + 38;
          var4.a(30, var5, -16 + (-14 + this.field_v), 15, -77);
          this.c(-105, var4);
          this.e((byte) 116);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("gf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        eg var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_lb == param4) {
            vn.a((byte) 4);
            this.g(48);
          } else {
            if (this.field_kb == param4) {
              this.g(57);
            }
          }
          if (!param0) {
            var7 = (eg) null;
            gf.a((byte) -109, (eg) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("gf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void k(byte param0) {
        field_V = null;
        field_jb = null;
        int var1 = -52 / ((param0 - 47) / 39);
    }

    static {
        field_jb = "This option cannot be combined with the current '<%0>' setting.";
        field_V = "Please enter your age in years";
    }
}
