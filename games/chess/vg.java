/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static int field_a;
    static int field_f;
    static String field_b;
    private String field_d;
    static p field_c;
    private boolean field_e;

    final boolean a(int param0) {
        if (param0 != -10585) {
          this.a((byte) -67);
        }
        return this.field_e;
    }

    vg(String param0) {
        this(param0, false);
    }

    public static void b(int param0) {
        if (param0 < 124) {
          vg.a(true, -55, (byte) 15, true);
        }
        field_b = null;
        field_c = null;
    }

    final static void a(boolean param0, int param1, byte param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        ci stackIn_36_0 = null;
        String stackIn_37_1 = null;
        ci stackIn_39_0 = null;
        String stackIn_40_1 = null;
        ci stackIn_68_0 = null;
        boolean stackIn_69_1 = false;
        ci stackIn_73_0 = null;
        boolean stackIn_74_1 = false;
        ci stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ci var5 = null;
        ci var6 = null;
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
        ci var15 = null;
        String var16 = null;
        ci var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Chess.field_G;
        try {
          f.a(aj.field_c, true);
          if (ib.field_d != null) {
            var15 = uj.field_j;
            var17 = var15;
            uj.field_j.field_pb = 0;
            var17.field_M = 0;
            var5 = aa.field_g;
            aa.field_g.field_pb = 0;
            var5.field_M = 0;
            var6 = tn.field_j;
            tn.field_j.field_pb = 0;
            var6.field_M = 0;
            sc.field_f.field_db = n.field_h.toUpperCase();
            var7 = (2 + ri.field_k.field_M) / 2;
            tn.field_j.a(0, -2 + var7, -2147483648, 40, ri.field_k.field_pb - 40);
            aa.field_g.a(var7, ri.field_k.field_M - var7, -2147483648, 40, -40 + ri.field_k.field_pb);
            if (wn.field_d.length == 1 &&
              2 == wn.field_d[0]) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < wn.field_d.length) {
                  stackIn_11_0 = ((g.field_f[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    wn.field_d[var10] != 2) {
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
            aa.field_g.field_tb = true;
            if (!ud.field_b) {
              stackIn_36_0 = aa.field_g;
              if (var8 == 0) {
                stackIn_37_1 = kf.field_m;
              } else {
                stackIn_37_1 = k.field_ab;
              }
              stackIn_36_0.field_db = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = ao.field_b;
              if (var8 != 0) {
                stackIn_40_1 = nk.field_u;
              } else {
                stackIn_40_1 = he.field_Jb;
              }
              stackIn_39_0.field_db = oc.a(stackIn_40_1, new String[]{aa.field_g.field_db}, (byte) -77);
              sc.field_d.field_tb = true;
              tn.field_j.field_db = jl.field_b;
              pk.field_g = true;
              if (hd.field_n != null) {
                d.field_Gb = false;
                pk.field_g = false;
                if (d.field_Jb == null) {
                  bi.field_d = new boolean[qa.field_e];
                  d.field_Jb = new byte[qa.field_e];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (qa.field_e > var13) {
                  bi.field_d[var13] = false;
                  var13++;
                }
                b.a(-1, -43, 0, -1, qa.field_e, -1, ib.field_d, true);
                if (!(2 > sk.field_t) &&
                  ok.field_Jb[12]) {
                  pk.field_g = true;
                }
              }
              if (!pk.field_g) {
                aa.field_g.field_tb = false;
                if (aa.field_g.field_Db) {
                  var9 = null;
                  if (d.field_Gb) {
                    var9 = "<col=A00000>" + tm.field_h + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < qa.field_e; var10Lifetime1++) {
                    if (bi.field_d[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + td.field_n[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  pc.field_Mb = "<col=A00000>" + sk.field_q + "<br>" + mm.field_b + (String) (var9);
                }
              }
            } else {
              ao.field_b.field_db = qd.field_G;
              sc.field_d.field_tb = false;
              if (var8 == 0) {
                stackIn_25_0 = eb.field_t;
              } else {
                stackIn_25_0 = b.field_g;
              }
              var16 = stackIn_25_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = tn.field_j.field_xb.b(var16) + 3 * tn.field_j.field_xb.a('.');
              if (16 == (g.field_c & 48)) {
                var9 = var16 + ".";
              }
              tn.field_j.field_fb = 0;
              tn.field_j.field_z = (-var10Lifetime1 + tn.field_j.field_M) / 2;
              if (32 == (48 & g.field_c)) {
                var9 = (String) (var9) + "..";
              }
              if ((g.field_c & 48) == 48) {
                var9 = (String) (var9) + "...";
              }
              tn.field_j.field_db = (String) (var9);
              aa.field_g.field_db = ue.field_b.toUpperCase();
            }
          }
          stackIn_68_0 = fm.field_T;
          stackIn_69_1 = (param3) && (!param0) && (!jh.field_a);
          ((ci) (Object) stackIn_68_0).a(stackIn_69_1, (byte) 88);
          stackIn_73_0 = ri.field_k;
          stackIn_74_1 = (param3) && (!param0) && (!jh.field_a);
          ((ci) (Object) stackIn_73_0).a(stackIn_74_1, (byte) 88);
          if (param2 >= -28) {
            field_a = -76;
          }
          stackIn_80_0 = ah.field_i;
          stackIn_81_1 = (param3) && (!param0) && (jh.field_a);
          ((ci) (Object) stackIn_80_0).a(stackIn_81_1, (byte) 88);
          qa.field_f.field_a.f((byte) 109);
          if (null != ib.field_d) {
            if (sc.field_d.field_L != 0) {
              hc.a(param1, (byte) -128);
            }
            if (aa.field_g.field_L != 0) {
              if (!ud.field_b) {
                cc.a((byte) 81, param1);
              } else {
                dn.a((byte) 72, param1);
              }
            }
            t.a(ib.field_d, true, param1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var4), "vg.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(byte param0) {
        if (param0 != -64) {
          vg.a(false, -87, (byte) 27, false);
        }
        return this.field_d;
    }

    vg(String param0, boolean param1) {
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_d = param0;
          if (null == this.field_d) {
            this.field_d = "";
          }
          stackIn_6_1 = (param1);
          this.field_e = stackIn_6_1;
          if (this.field_d.length() == 0) {
            this.field_e = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vg.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = "you";
    }
}
