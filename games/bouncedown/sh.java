/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class sh extends mh implements rc {
    private tj field_bb;
    static int[] field_gb;
    static int field_hb;
    private boolean field_eb;
    private boolean field_ib;
    static bl[] field_cb;
    private boolean field_P;
    static String field_jb;
    private boolean field_fb;
    private ll field_db;

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        uc var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        uc stackIn_8_0 = null;
        uc stackIn_9_0 = null;
        uc stackIn_10_0 = null;
        String stackIn_10_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        uc stackOut_7_0 = null;
        uc stackOut_9_0 = null;
        String stackOut_9_1 = null;
        uc stackOut_8_0 = null;
        String stackOut_8_1 = null;
        var5 = Bounce.field_N;
        if (!((sh) this).field_ib) {
          L0: {
            ((sh) this).field_ib = true;
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param2 != 256) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          L1: {
            ((sh) this).field_fb = stackIn_5_1 != 0;
            ((sh) this).field_db.a(param1, (byte) 127, 8405024);
            var6 = new uc((sh) this, ((sh) this).field_bb, param0);
            if (5 == param2) {
              var6.a(ta.field_e, 11, (byte) 116);
              var6.a(i.field_g, 17, (byte) 123);
              break L1;
            } else {
              if ((param2 ^ -1) == -257) {
                wd discarded$2 = var6.a(mh.field_W, (sk) this, -4);
                break L1;
              } else {
                L2: {
                  stackOut_7_0 = (uc) var6;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (((sh) this).field_eb) {
                    stackOut_9_0 = (uc) (Object) stackIn_9_0;
                    stackOut_9_1 = mh.field_W;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = (uc) (Object) stackIn_8_0;
                    stackOut_8_1 = pe.field_h;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                ((uc) (Object) stackIn_10_0).a(stackIn_10_1, -1, (byte) 93);
                break L1;
              }
            }
          }
          L3: {
            if (3 != param2) {
              if (param2 != -5) {
                if (-7 == param2) {
                  var6.a(da.field_c, 9, (byte) 106);
                  ((sh) this).a(10768, (lk) (Object) var6);
                  break L3;
                } else {
                  if (param2 == 9) {
                    wd discarded$3 = var6.a(fj.field_d, (sk) this, -4);
                    ((sh) this).a(10768, (lk) (Object) var6);
                    break L3;
                  } else {
                    ((sh) this).a(10768, (lk) (Object) var6);
                    break L3;
                  }
                }
              } else {
                var6.a(ck.field_f, 8, (byte) 97);
                var6.a(da.field_c, 9, (byte) 106);
                break L3;
              }
            } else {
              var6.a(oc.field_c, 7, (byte) 60);
              ((sh) this).a(10768, (lk) (Object) var6);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    sh(pf param0, tj param1, String param2, boolean param3, boolean param4) {
        super(param0, (lk) (Object) new uc((sh) null, param1, param2), 77, 10, 10);
        ((sh) this).field_ib = false;
        ((sh) this).field_P = param4 ? true : false;
        ((sh) this).field_eb = param3 ? true : false;
        ((sh) this).field_bb = param1;
        ((sh) this).field_fb = false;
        ((sh) this).field_db = new ll(13, 50, 274, 30, 15, 2113632, 4210752);
        ((sh) this).field_db.field_C = true;
        ((sh) this).b((lk) (Object) ((sh) this).field_db, true);
    }

    final void a(boolean param0) {
        if (!((sh) this).field_D) {
            return;
        }
        ((sh) this).field_D = false;
        if (((sh) this).field_eb) {
            pd.a(11173);
        } else {
            if (((sh) this).field_P) {
                od.a((byte) 24);
            }
        }
        if (!param0) {
            ((sh) this).n(-51);
        }
    }

    public void a(byte param0, int param1, int param2, int param3, wd param4) {
        if (param0 < 6) {
            return;
        }
        if (((sh) this).field_fb) {
            oh.a(-52, 3);
            ((sh) this).a(true);
        } else {
            qc.a(vi.b(0), 24, "tochangedisplayname.ws");
        }
    }

    final boolean a(lk param0, char param1, int param2, int param3) {
        if (!(param2 != 13)) {
            ((sh) this).a(true);
            return true;
        }
        if (param3 != -14565) {
            Object var6 = null;
            ((sh) this).a((String) null, -33, 29);
        }
        return super.a(param0, param1, param2, -14565);
    }

    final void n(int param0) {
        ((sh) this).field_db.a(4210752, (byte) 127, 2121792);
        uc var2 = new uc((sh) this, ((sh) this).field_bb, dh.field_e);
        var2.a(l.field_f, 15, (byte) 120);
        if (param0 != 1) {
            return;
        }
        ((sh) this).a(10768, (lk) (Object) var2);
    }

    public static void o(int param0) {
        field_jb = null;
        field_cb = null;
        field_gb = null;
        if (param0 != 5) {
            sh.o(88);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_gb = new int[256];
        field_jb = "Logging in...";
        var1 = 0;
        L0: while (true) {
          if ((var1 ^ -1) <= -257) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -9) {
                field_gb[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) != -2) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> -601030239 ^ -306674912;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
