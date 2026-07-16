/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eq extends ch implements sc {
    static String field_O;
    static int field_W;
    static int field_R;
    static String field_T;
    static eh field_V;
    static dd[] field_Q;
    static String field_N;
    static int field_Y;
    static int field_U;
    static int field_S;
    private sn field_X;
    static String field_P;

    abstract int h(int param0);

    abstract int h(byte param0);

    abstract int j(int param0);

    void a(int param0, sn param1) {
        ((eq) this).field_X = param1;
        if (param0 != -15309) {
            return;
        }
        ((eq) this).field_X.field_i = (eq) this;
    }

    final static void j(byte param0) {
        if (param0 >= -9) {
          L0: {
            field_S = 52;
            if (ib.field_s != null) {
              ib.field_s.f();
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (kk.field_D != null) {
              kk.field_D.f();
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (ib.field_s != null) {
              ib.field_s.f();
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (kk.field_D != null) {
              kk.field_D.f();
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final ip a(int param0) {
        int var2 = 93 % ((33 - param0) / 34);
        return (ip) (Object) ((eq) this).field_X;
    }

    abstract boolean g(byte param0);

    public static void i(int param0) {
        field_V = null;
        field_O = null;
        field_N = null;
        field_T = null;
        field_Q = null;
        field_P = null;
        if (param0 != -12253) {
            field_Q = null;
        }
    }

    eq(int param0, int param1, int param2, int param3, fp param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void i(byte param0) {
        int var1 = 0;
        L0: {
          s.field_c = new ob[25];
          ob discarded$23 = new ob(cl.field_m, 0, 180, 460, 160, 24, new int[10]);
          be discarded$24 = new be(14, 180, 460, 160, 24, rq.field_B);
          pa discarded$25 = new pa(lq.field_Q, 2, 180, 460, 160, 24, new int[3]);
          jo discarded$26 = new jo((dd) null, 3, 180, 460, 160, 24, ad.field_o);
          jo discarded$27 = new jo((dd) null, 8, 180, 460, 160, 24, e.field_d);
          jo discarded$28 = new jo((dd) null, 9, 180, 460, 160, 24, v.field_f);
          jo discarded$29 = new jo((dd) null, 24, 180, 460, 160, 24, og.field_J);
          jo discarded$30 = new jo((dd) null, 10, 180, 460, 160, 24, bl.field_r);
          jo discarded$31 = new jo((dd) null, 11, 180, 460, 160, 24, tl.field_L);
          jo discarded$32 = new jo((dd) null, 12, 180, 460, 160, 24, ob.field_m);
          lb discarded$33 = new lb((dd) null, 23, 180, 460, 160, 24, new int[2]);
          jo discarded$34 = new jo((dd) null, 22, 180, 460, 160, 24, new int[9]);
          em discarded$35 = new em(16, 180, 460, 410, 24, new int[2]);
          tl discarded$36 = new tl(15, 180, 460, 410, 24, new int[2]);
          b discarded$37 = new b(13, 70, 460, 400, 24, new int[3]);
          el discarded$38 = new el(17, 180, 460, 400, 24, new int[2]);
          el discarded$39 = new el(18, 180, 460, 400, 24, new int[2]);
          br discarded$40 = new br(19, 180, 460, 400, 24, new int[2]);
          pj discarded$41 = new pj(20, 290, 460, 400, 24, new int[1]);
          var1 = 37 % ((37 - param0) / 35);
          hd discarded$42 = new hd(21, 180, 460, 160, 24, new int[0]);
          cm discarded$43 = new cm(6, 180, 460, 160, 24, new int[9]);
          sg discarded$44 = new sg(7, 180, 460, 160, 24, new int[6]);
          og discarded$45 = new og(df.field_i, 1, 180, 460, 160, 24, new int[4]);
          pq.field_H = mc.field_e.b(nk.field_f[20]) - -10;
          var1 = 10 + mc.field_e.b(nk.field_f[21]);
          if (pq.field_H < var1) {
            pq.field_H = var1;
            break L0;
          } else {
            break L0;
          }
        }
        jo.f((byte) -104);
    }

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_6_0 = null;
            try {
              L0: {
                L1: {
                  var8 = param0.getParameter("cookieprefix");
                  if (param1 > 110) {
                    break L1;
                  } else {
                    field_U = 74;
                    break L1;
                  }
                }
                var3 = var8 + "settings";
                var4 = (String) mo.a((byte) 124, "getcookies", param0);
                var5 = jc.a(30634, var4, ';');
                var6 = 0;
                L2: while (true) {
                  if (var5.length <= var6) {
                    break L0;
                  } else {
                    L3: {
                      var7 = var5[var6].indexOf('=');
                      if (0 > var7) {
                        break L3;
                      } else {
                        if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                          break L3;
                        } else {
                          stackOut_6_0 = var5[var6].substring(var7 + 1).trim();
                          stackIn_7_0 = stackOut_6_0;
                          return stackIn_7_0;
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var2 = decompiledCaughtException;
                break L4;
              }
            }
            if (ar.field_g != null) {
              return ar.field_g;
            } else {
              return param0.getParameter("settings");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Offer draw";
        field_V = null;
        field_W = -1;
        field_N = "The key rule of nine-ball pool is that you must always hit the lowest numbered ball on the table first. Try this now, the ball you should be aiming for is indicated in the top-left corner.";
        field_T = "Rating";
        field_P = "Buying or selling an account";
    }
}
