/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ob {
    static String field_q;
    static nq field_p;
    static int field_r;
    private int field_n;
    static in field_m;
    private mh field_o;

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = ((sl) this).field_n >> -2021933245;
        if (param0 > 76) {
          var4 = -(7 & ((sl) this).field_n) + 8;
          var5 = 0;
          ((sl) this).field_n = ((sl) this).field_n + param1;
          L0: while (true) {
            if (var4 >= param1) {
              L1: {
                if (var4 == param1) {
                  var5 = var5 + (rq.field_j[var4] & ((sl) this).field_h[var3]);
                  break L1;
                } else {
                  var5 = var5 + (((sl) this).field_h[var3] >> var4 - param1 & rq.field_j[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((sl) this).field_h[var3] & rq.field_j[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          ((sl) this).i((byte) 45);
          var4 = -(7 & ((sl) this).field_n) + 8;
          var5 = 0;
          ((sl) this).field_n = ((sl) this).field_n + param1;
          L2: while (true) {
            if (var4 >= param1) {
              L3: {
                if (var4 == param1) {
                  var5 = var5 + (rq.field_j[var4] & ((sl) this).field_h[var3]);
                  break L3;
                } else {
                  var5 = var5 + (((sl) this).field_h[var3] >> var4 - param1 & rq.field_j[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((sl) this).field_h[var3] & rq.field_j[var4]) << -var4 + param1);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void h(int param0, int param1) {
        ((sl) this).field_j = ((sl) this).field_j + 1;
        ((sl) this).field_h[((sl) this).field_j] = (byte)(((sl) this).field_o.d(13) + param0);
        if (param1 != 255) {
            field_r = -37;
        }
    }

    sl(byte[] param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var5 = param1; param0 > var5; var5++) {
            ((sl) this).field_j = ((sl) this).field_j + 1;
            param3[param2 + var5] = (byte)(((sl) this).field_h[((sl) this).field_j] + -((sl) this).field_o.d(13));
        }
    }

    final static e j(byte param0) {
        if (param0 != 64) {
            return null;
        }
        return new e(of.a((byte) 42), bo.q(-108));
    }

    public static void l(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_m = null;
            field_p = null;
            field_m = null;
            return;
        }
        field_p = null;
        field_m = null;
    }

    sl(int param0) {
        super(param0);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
            java.net.URL var3 = null;
            if (param2 <= 33) {
                field_p = null;
            }
            try {
                var3 = new java.net.URL(param1.getCodeBase(), param0);
                var3 = jg.a(param1, false, var3);
                ue.a(param1, true, var3.toString(), -102);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static lp a(int param0, int param1, fs param2, int param3) {
        uc var5 = null;
        ff var6 = null;
        qk var7 = null;
        lp var8 = null;
        var8 = new lp(0, 0, 182, kb.field_y.field_o - -4);
        var5 = new uc(0, var8.field_i / 2 - 3, param3, 6, 0, param2.field_k);
        var8.a((vd) (Object) var5, 8);
        if (param1 != -30577) {
          field_r = 123;
          var6 = new ff(-(param2.field_v.field_o / 2) + param3, -(param2.field_v.field_p / 2) + var8.field_i / 2, param2.field_v);
          var8.a((vd) (Object) var6, 8);
          var7 = new qk(-(param2.field_v.field_o / 2) + param3, var8.field_i / 2 + -(rs.field_Cb.field_J / 2), param2.field_v.field_o, rs.field_Cb.field_J, Integer.toString(param0));
          var8.a((vd) (Object) var7, 8);
          return var8;
        } else {
          var6 = new ff(-(param2.field_v.field_o / 2) + param3, -(param2.field_v.field_p / 2) + var8.field_i / 2, param2.field_v);
          var8.a((vd) (Object) var6, 8);
          var7 = new qk(-(param2.field_v.field_o / 2) + param3, var8.field_i / 2 + -(rs.field_Cb.field_J / 2), param2.field_v.field_o, rs.field_Cb.field_J, Integer.toString(param0));
          var8.a((vd) (Object) var7, 8);
          return var8;
        }
    }

    final void a(int[] param0, byte param1) {
        int var3 = 31 / ((param1 - 45) / 58);
        ((sl) this).field_o = new mh(param0);
    }

    final int h(byte param0) {
        if (param0 != 126) {
          return -76;
        } else {
          ((sl) this).field_j = ((sl) this).field_j + 1;
          return ((sl) this).field_h[((sl) this).field_j] + -((sl) this).field_o.d(13) & 255;
        }
    }

    final void m(int param0) {
        if (param0 > -16) {
          ((sl) this).h(53, 123);
          ((sl) this).field_n = ((sl) this).field_j * 8;
          return;
        } else {
          ((sl) this).field_n = ((sl) this).field_j * 8;
          return;
        }
    }

    final static void a(int param0, vm param1) {
        if (param1 == null) {
            return;
        }
        mr.field_h = param1;
        ua.field_f.field_M.a(param0);
        ua.field_f.a(4, (qr) (Object) mr.field_h);
        dp.field_t = true;
    }

    final void i(byte param0) {
        ((sl) this).field_j = (7 + ((sl) this).field_n) / 8;
        int var2 = 126 / ((param0 - 50) / 63);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
