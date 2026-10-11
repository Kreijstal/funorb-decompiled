/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static String field_f;
    static long field_j;
    static oq field_e;
    static String field_g;
    private long field_l;
    private int field_a;
    static String field_k;
    private String field_d;
    vh field_i;
    String field_m;
    int field_b;
    static int[] field_c;
    private int[] field_h;
    vq field_n;

    final void a(pn param0, boolean param1) {
        if (param0.field_g) {
          return;
        }
        try {
          this.field_a = param0.field_p;
          if (param1) {
            this.field_b = 59;
          }
          if (param0.field_p == 0) {
            if (ec.field_i == 0) {
              this.field_n.a(cl.field_a, 17130, 12);
            }
            this.field_n.a(Pool.field_K, 17130, 13);
          }
          if (param0.field_p == 1) {
            if (ol.field_e == 0) {
              this.field_n.a(wi.field_e, 17130, 12);
            }
            this.field_n.a(op.field_c, 17130, 13);
          }
          if (param0.field_p == 2) {
            if (di.field_e == 0) {
              this.field_n.a(mc.field_i, 17130, 12);
            }
            this.field_n.a(me.field_v, 17130, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_n.a((byte) -79, param0);
        if (param1 != 12887) {
          field_c = (int[]) null;
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var5;
        var5 = Pool.field_O;
        if (param0 != 98) {
          return true;
        }
        if (param2 != 0) {
          if (param2 != 1) {
            if (2 != param2) {
              if (param2 == 3) {
                nf.a(this.field_b, true, param1);
              } else {
                if (param2 == 10) {
                  ef.a(this.field_b, 3, param1);
                } else {
                  if (param2 == 15) {
                    eo.a(param1, this.field_b, 11);
                  } else {
                    if (16 != param2) {
                      return false;
                    }
                    eo.a(param1, 0, param0 ^ 105);
                  }
                }
              }
            } else {
              em.a(this.field_b, (byte) -125, param1);
            }
          } else {
            jk.a(this.field_l, param1, param0 - 98);
          }
        } else {
          k.a(param1, (byte) 97, this.field_l);
        }
        return true;
    }

    final void a(int param0, int[] param1, byte param2) {
        boolean discarded$0 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        eo var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (null != this.field_m && (~this.field_l != ~ve.field_m ||
            2 == param0) && th.field_a == 2) {
            var7 = this.a(3);
            var4 = var7;
            var5 = gf.a(-103, this.field_m);
            var6 = ia.a(this.field_m, 24552) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_n.a(nr.a(new String[]{var7}, -1, fn.field_Lb), 17130, 4);
              this.field_n.a(nr.a(new String[]{var7}, -1, jh.field_f), 17130, 6);
              if (param1 != null &&
                param0 != 2 &&
                !ea.field_z) {
                this.field_h = param1;
                this.field_n.a(nr.a(new String[]{var7}, -1, nk.field_k), 17130, 19);
              }
            }
            if (var5 != null) {
              if (!fj.a(this.field_m, (byte) -101) &&
                !ea.field_z) {
                if (!hr.field_y) {
                  this.field_n.a(nr.a(new String[]{var7}, -1, rp.field_a), 17130, 8);
                }
                this.field_n.a(nr.a(new String[]{var7}, -1, hq.field_e), 17130, 18);
                if (param1 != null) {
                  this.field_h = param1;
                  this.field_n.a(nr.a(new String[]{var7}, -1, nk.field_k), 17130, 19);
                }
              }
              this.field_n.a(nr.a(new String[]{var7}, -1, ef.field_e), 17130, 5);
            }
            if (var6 != 0) {
              this.field_n.a(nr.a(new String[]{var7}, -1, ph.field_c), 17130, 7);
            }
          }
          if (param2 < 43) {
            discarded$0 = this.a(63, 79, -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("kn.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0) {
        String var3 = null;
        boolean discarded$0 = false;
        if (null != this.field_m &&
          this.field_l != ve.field_m) {
          var3 = this.a(3);
          String var2 = var3;
          this.field_n.a(nr.a(new String[]{var3}, -1, ep.field_p), 17130, 17);
        }
        if (param0 < 8) {
          discarded$0 = this.b((byte) -22, -119, 104);
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var5;
        var5 = Pool.field_O;
        if (param2 != 8) {
          if (param2 == 18) {
            tq.a(this.field_l, (byte) -104, this.field_m);
          } else {
            if (param2 != 11) {
              if (12 != param2) {
                if (13 != param2) {
                  if (param2 == 14) {
                    pf.a(true);
                  } else {
                    if (param2 == 20) {
                      r.c((byte) 41);
                    } else {
                      if (param2 != 19) {
                        return false;
                      }
                      hj.a(this.field_a, this.field_h, this.field_l, this.field_m, (byte) 76);
                    }
                  }
                } else {
                  om.a(2, this.field_a, param0, (byte) -45);
                }
              } else {
                om.a(1, this.field_a, param0, (byte) 126);
              }
            } else {
              om.a(0, this.field_a, param0, (byte) 121);
            }
          }
        } else {
          kr.a((byte) -75, this.field_l, this.field_m);
        }
        if (param1 >= 57) {
          return true;
        }
        this.field_d = (String) null;
        return true;
    }

    private final boolean b(byte param0, int param1, int param2) {
        if (param0 > -74) {
          kn.a((byte) 75, 'ﾪ');
        }
        if (17 != param2) {
          return false;
        }
        fc.field_b = new wm(this.field_i.field_sb, this.field_i.field_ib, this.field_i.field_gb, this.field_i.field_Db, param1, tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, e.field_e, ei.field_A, this.field_m, this.field_l);
        return true;
    }

    final boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 111) {
          this.a(true, 110);
        }
        stackIn_6_0 = (this.field_n != null) && (this.field_n.f((byte) -49));
        return stackIn_6_0;
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param3 != 25427) {
          return false;
        }
        int var6 = this.field_n.a(param3 ^ 25356, param2);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$0 = this.a((byte) 98, param1, var6);
        boolean discarded$1 = this.a(var6, param4, 6);
        boolean discarded$2 = this.a(param4, (byte) 115, var6);
        boolean discarded$3 = this.b((byte) -75, param0, var6);
        return true;
    }

    final static void c(int param0) {
        db.field_Nb.field_hb = dq.a(1, 0, nr.a(new String[]{Integer.toString(wn.field_f[la.field_a] / 50)}, -1, vm.field_b));
        if (param0 != 13) {
          kn.c(-82);
        }
        kb.field_i.field_pb = la.field_a > 0 ? true : false;
        tk.field_f.field_pb = la.field_a < -1 + te.field_p[0] ? true : false;
    }

    private final boolean a(int param0, int param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        var4 = null;
        if (param0 == 4) {
          var4_ref = va.a(this.field_m, param1, 88);
        } else {
          if (param0 == 5) {
            var4_ref = ul.a((byte) 91, this.field_m, param1);
          } else {
            if (param0 == 6) {
              var4_ref = jd.a(param1, this.field_m, param2 ^ 4);
            } else {
              if (param0 != 7) {
                return false;
              }
              var4_ref = ae.a(-3266, this.field_d, this.field_m, param1);
            }
          }
        }
        if (var4_ref != null) {
          var5 = (String) null;
          jh.a(0, var4_ref, (String) null, 2, this.field_m, true);
        }
        if (param2 == 6) {
          return true;
        }
        return false;
    }

    final void a(byte param0, boolean param1) {
        im var4;
        String var5;
        im var6;
        if (null != this.field_m &&
          this.field_l != ve.field_m &&
          null != em.field_L &&
          cj.e((byte) 85)) {
          var6 = mg.a(param0 ^ 124, this.field_l);
          var4 = fn.b(this.field_l, 0);
          var5 = this.a(3);
          if (var4 != null) {
            if (!em.field_L.field_ec ||
              !(em.field_L.field_qc < 0)) {
              this.field_n.a(nr.a(new String[]{var5}, -1, th.field_i), 17130, 1);
            }
          } else {
            if (var6 != null &&
              em.field_L.field_Dc &&
              em.field_L.field_Nb > em.field_L.field_mc) {
              if (!var6.field_mc) {
                if (param1 &&
                  var6.field_Yb) {
                  this.field_n.a(nr.a(new String[]{var5}, -1, gf.field_c), param0 + 17006, 0);
                  this.field_n.a(nr.a(new String[]{var5}, param0 - 125, ro.field_g), 17130, 1);
                } else {
                  this.field_n.a(nr.a(new String[]{var5}, -1, qi.field_h), 17130, 0);
                }
              } else {
                this.field_n.a(nr.a(new String[]{var5}, -1, jh.field_b), param0 + 17006, 1);
              }
            }
          }
        }
        if (param0 != 124) {
          kn.c((byte) 66);
        }
    }

    private final String a(int param0) {
        String var2 = null;
        if (null != this.field_d) {
          var2 = this.field_d;
        } else {
          var2 = this.field_m;
        }
        if (param0 != 3) {
          field_k = (String) null;
        }
        return var2;
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        char[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (160 <= param1 &&
            param1 <= 255) {
            return true;
          }
          if (param0 <= 36) {
            return true;
          }
          if (0 != param1) {
            var5 = rf.field_a;
            var2 = var5;
            for (var3 = 0; var3 < var5.length; var3++) {
              var4 = var5[var3];
              if (var4 == param1) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "kn.B(" + param0 + ',' + param1 + ')');
        }
    }

    kn(vh param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_n = new vq(ko.field_c);
          this.field_d = param3;
          this.field_l = param1;
          this.field_b = param4;
          this.field_a = param5;
          param0.field_Ib = true;
          this.field_i = param0;
          this.field_h = param6;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        String var3;
        kh var4;
        if (null == em.field_L) {
          var4 = rb.a(this.field_b, 125);
          if (var4 != null) {
            var3 = var4.field_Ob;
            if (var4.field_Xb) {
              this.field_n.a(nr.a(new String[]{var3}, -1, or.field_m), param0 ^ 18642, 2);
              this.field_n.a(nr.a(new String[]{var3}, -1, hj.field_k), 17130, 3);
            } else {
              if (var4.field_ic) {
                this.field_n.a(nr.a(new String[]{var3}, param0 ^ -2617, se.field_m), param0 ^ 18642, 2);
              } else {
                if (!var4.field_fc &&
                  var4.field_Dc && (!var4.field_ec ||
                  var4.field_ic)) {
                  this.field_n.a(nr.a(new String[]{var3}, -1, dn.field_p), param0 ^ 18642, 2);
                }
              }
              if (var4.field_fc) {
                this.field_n.a(nr.a(new String[]{var3}, -1, nd.field_b), 17130, 3);
              }
            }
          }
        }
        if (param0 != 2616) {
          kn.a((byte) 103, 'ﾥ');
        }
    }

    public static void c(byte param0) {
        field_e = null;
        field_g = null;
        field_k = null;
        if (param0 > -74) {
          return;
        }
        field_c = null;
        field_f = null;
    }

    static {
        field_f = "<%0> is on their last life!";
        field_k = "Invite";
        field_c = new int[8192];
    }
}
