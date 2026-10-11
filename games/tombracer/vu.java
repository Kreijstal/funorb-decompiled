/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends vw {
    static String field_e;
    static int field_f;
    static String field_d;

    vu(eo param0) {
        super(param0);
    }

    final void a(int param0, iva param1, int param2) {
        try {
          this.field_c.a(true, param1);
          if (param2 != 24595) {
            field_e = (String) null;
          }
          this.field_c.a((byte) -108, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vu.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
          this.a((byte) 31, 78, -5);
        }
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
          field_d = (String) null;
          return false;
        }
        return false;
    }

    public static void d(int param0) {
        int var1 = -45 % ((-36 - param0) / 51);
        field_d = null;
        field_e = null;
    }

    final static void a(byte param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_23_0 = null;
        jea stackIn_34_0 = null;
        String stackIn_35_1 = null;
        jea stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        String stackIn_38_2 = null;
        jea stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        boolean stackIn_68_2 = false;
        jea stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        boolean stackIn_73_2 = false;
        jea stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        boolean stackIn_78_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        jea var5 = null;
        jea var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        jea var15 = null;
        String var16 = null;
        jea var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          dga.a(gt.field_a, 199);
          if (null != ifa.field_n) {
            pk.field_z.field_t = 0;
            var15 = pk.field_z;
            var17 = var15;
            var17.field_G = 0;
            hw.field_a.field_t = 0;
            var5 = hw.field_a;
            var5.field_G = 0;
            var6 = dl.field_t;
            dl.field_t.field_t = 0;
            var6.field_G = 0;
            wf.field_g.field_r = dka.field_a.toUpperCase();
            var7 = (dka.field_b.field_G + 2) / 2;
            dl.field_t.a(-2 + var7, 40, -23776, -40 + dka.field_b.field_t, 0);
            hw.field_a.a(dka.field_b.field_G - var7, 40, param0 - 23777, -40 + dka.field_b.field_t, var7);
            if (sg.field_u.length == 1 &&
              sg.field_u[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < sg.field_u.length) {
                  stackIn_10_0 = ((vk.field_b[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    sg.field_u[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            hw.field_a.field_X = true;
            if (!qa.field_o) {
              stackIn_34_0 = hw.field_a;
              if (var8 != 0) {
                stackIn_35_1 = kk.field_a;
              } else {
                stackIn_35_1 = rf.field_b;
              }
              stackIn_34_0.field_r = ((String) (Object) stackIn_35_1).toUpperCase();
              stackIn_37_0 = fu.field_t;
              stackIn_37_1 = 114;
              if (var8 != 0) {
                stackIn_38_2 = cn.field_c;
              } else {
                stackIn_38_2 = TombRacer.field_F;
              }
              stackIn_37_0.field_r = gl.$cfr$intArgs$a$53ce4ab4c593(stackIn_37_1, stackIn_38_2, new String[]{hw.field_a.field_r});
              dl.field_t.field_r = vf.field_h;
              bc.field_b.field_X = true;
              rh.field_s = true;
              if (null != ce.field_A) {
                rh.field_s = false;
                if (null == tba.field_m) {
                  tba.field_m = new byte[fk.field_b];
                  sda.field_f = new boolean[fk.field_b];
                }
                mm.field_g = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (fk.field_b > var13) {
                  sda.field_f[var13] = false;
                  var13++;
                }
                cja.a(param0 + 108, fk.field_b, ifa.field_n, 0, -1, -1, -1, true);
                if (!(ld.field_e < 2) &&
                  oj.field_tb[12]) {
                  rh.field_s = true;
                }
              }
              if (!rh.field_s) {
                hw.field_a.field_X = false;
                if (hw.field_a.field_pb) {
                  var9 = null;
                  if (mm.field_g) {
                    var9 = "<col=A00000>" + mi.field_j + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < fk.field_b; var10Lifetime1++) {
                    if (sda.field_f[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + kma.field_e[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  qda.field_b = "<col=A00000>" + cra.field_a + "<br>" + jb.field_J + (String) (var9);
                }
              }
            } else {
              bc.field_b.field_X = false;
              fu.field_t.field_r = hv.field_n;
              if (var8 != 0) {
                stackIn_23_0 = to.field_l;
              } else {
                stackIn_23_0 = gqa.field_k;
              }
              var16 = stackIn_23_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = dl.field_t.field_H.b(var16) + 3 * dl.field_t.field_H.a('.');
              if ((lh.field_a & 48) == 16) {
                var9 = var16 + ".";
              }
              dl.field_t.field_x = (dl.field_t.field_G - var10Lifetime1) / 2;
              dl.field_t.field_z = 0;
              if ((lh.field_a & 48) == 32) {
                var9 = (String) (var9) + "..";
              }
              if (48 == (lh.field_a & 48)) {
                var9 = (String) (var9) + "...";
              }
              dl.field_t.field_r = (String) (var9);
              hw.field_a.field_r = mq.field_d.toUpperCase();
            }
          }
          stackIn_67_0 = nra.field_c;
          stackIn_67_1 = param0 ^ -102;
          stackIn_68_2 = (param1) && (!param2) && (!tla.field_e);
          ((jea) (Object) stackIn_67_0).c(stackIn_67_1, stackIn_68_2);
          stackIn_72_0 = dka.field_b;
          stackIn_72_1 = -111;
          stackIn_73_2 = (param1) && (!param2) && (!tla.field_e);
          ((jea) (Object) stackIn_72_0).c(stackIn_72_1, stackIn_73_2);
          stackIn_77_0 = hf.field_a;
          stackIn_77_1 = -113;
          stackIn_78_2 = (param1) && (!param2) && (tla.field_e);
          ((jea) (Object) stackIn_77_0).c(stackIn_77_1, stackIn_78_2);
          rm.field_e.field_a.e((byte) -99);
          if (param0 != 1) {
            vu.d(-121);
          }
          if (null != ifa.field_n) {
            if (bc.field_b.field_y != 0) {
              gk.a(param3, (byte) 28);
            }
            if (hw.field_a.field_y != 0) {
              if (qa.field_o) {
                pd.a((byte) 34, param3);
              } else {
                jq.a(param3, (byte) -128);
              }
            }
            cm.a(param3, ifa.field_n, -21290, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "vu.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 != 55) {
          field_e = (String) null;
        }
    }

    final void a(int param0) {
        if (param0 > -4) {
          field_f = 59;
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = -103 % ((param0 - 41) / 62);
    }

    static {
        field_f = 0;
        field_d = "Race Winner";
        field_e = "Invite";
    }
}
