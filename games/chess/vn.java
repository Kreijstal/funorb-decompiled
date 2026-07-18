/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class vn extends bj implements mj {
    static jc field_vb;
    static String field_Eb;
    static int[] field_sb;
    private boolean field_zb;
    static String[] field_ub;
    static km field_rb;
    static km field_xb;
    static int[] field_Ab;
    private lh field_Fb;
    private boolean field_Cb;
    private rm field_wb;
    static km field_Bb;
    private boolean field_yb;
    static int field_Db;
    private boolean field_tb;

    final static void l() {
        mi.field_t = new String[re.field_j];
        mi.field_t[5] = sa.field_f;
        mi.field_t[11] = ii.field_N;
        mi.field_t[17] = fl.field_s;
        mi.field_t[6] = kn.field_E;
        mi.field_t[20] = mn.field_j;
        mi.field_t[9] = sj.field_f;
        mi.field_t[4] = ri.field_h;
        mi.field_t[19] = kn.field_K;
        mi.field_t[15] = va.field_e;
        mi.field_t[21] = le.field_b;
        mi.field_t[7] = hc.field_e;
        mi.field_t[18] = kn.field_J;
        mi.field_t[16] = fb.field_G;
        mi.field_t[13] = oa.field_c;
    }

    vn(fm param0, lh param1, String param2, boolean param3, boolean param4) {
        super(param0, (mf) (Object) new e((vn) null, param1, param2), 77, 10, 10);
        try {
            ((vn) this).field_yb = false;
            ((vn) this).field_zb = param3 ? true : false;
            ((vn) this).field_Fb = param1;
            ((vn) this).field_Cb = param4 ? true : false;
            ((vn) this).field_tb = false;
            ((vn) this).field_wb = new rm(13, 50, 274, 30, 15, 2113632, 4210752);
            ((vn) this).field_wb.field_W = true;
            ((vn) this).b((mf) (Object) ((vn) this).field_wb, 95);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(byte param0) {
        int var2 = 0;
        if (((vn) this).field_P) {
          ((vn) this).field_P = false;
          if (!((vn) this).field_zb) {
            if (!((vn) this).field_Cb) {
              var2 = -90 % ((param0 - -67) / 41);
              return;
            } else {
              int discarded$2 = -73;
              ci.j();
              var2 = -90 % ((param0 - -67) / 41);
              return;
            }
          } else {
            vn.m(10);
            var2 = -90 % ((param0 - -67) / 41);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                ((vn) this).field_zb = true;
                break L1;
              }
            }
            if (13 == param1) {
              ((vn) this).k((byte) -115);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              stackOut_6_0 = super.a(param0, param1, -1, param3);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("vn.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final void n(int param0) {
        e var2 = null;
        ((vn) this).field_wb.b(2121792, 15016, 4210752);
        var2 = new e((vn) this, ((vn) this).field_Fb, gg.field_q);
        var2.a(15, 87, tc.field_y);
        if (param0 != 24528) {
          field_sb = null;
          ((vn) this).c((mf) (Object) var2, 127);
          return;
        } else {
          ((vn) this).c((mf) (Object) var2, 127);
          return;
        }
    }

    final void a(int param0, String param1, byte param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        e var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        e stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        e stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        e stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        String stackIn_16_3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        e stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        e stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        String stackOut_15_3 = null;
        e stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        String stackOut_14_3 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            if (((vn) this).field_yb) {
              return;
            } else {
              L1: {
                stackOut_4_0 = this;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (param0 != 256) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L1;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
              }
              ((vn) this).field_tb = stackIn_7_1 != 0;
              ((vn) this).field_yb = true;
              ((vn) this).field_wb.b(8405024, 15016, 4210752);
              if (param2 > 20) {
                L2: {
                  var6 = new e((vn) this, ((vn) this).field_Fb, param1);
                  if (param0 != 5) {
                    if (256 != param0) {
                      L3: {
                        stackOut_13_0 = (e) var6;
                        stackOut_13_1 = -1;
                        stackOut_13_2 = 113;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        if (((vn) this).field_zb) {
                          stackOut_15_0 = (e) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = hl.field_f;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          break L3;
                        } else {
                          stackOut_14_0 = (e) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = stackIn_14_2;
                          stackOut_14_3 = fa.field_k;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          break L3;
                        }
                      }
                      ((e) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3);
                      break L2;
                    } else {
                      fb discarded$2 = var6.a((byte) -114, (rg) this, hl.field_f);
                      break L2;
                    }
                  } else {
                    var6.a(11, 29, vi.field_a);
                    var6.a(17, 62, sn.field_b);
                    break L2;
                  }
                }
                L4: {
                  if (param0 != 3) {
                    if (param0 != 4) {
                      if (param0 != 6) {
                        if (param0 != 9) {
                          break L4;
                        } else {
                          fb discarded$3 = var6.a((byte) -114, (rg) this, rn.field_c);
                          break L4;
                        }
                      } else {
                        var6.a(9, 31, gg.field_e);
                        break L4;
                      }
                    } else {
                      var6.a(8, 101, gd.field_f);
                      break L4;
                    }
                  } else {
                    var6.a(7, 81, ki.field_Q);
                    break L4;
                  }
                }
                ((vn) this).c((mf) (Object) var6, 70);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("vn.A(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param2 + ')');
        }
    }

    private final static void m(int param0) {
        String var2 = null;
        String var3 = null;
        String var4 = null;
        String var5 = null;
        if (!dk.field_g) {
          throw new IllegalStateException();
        } else {
          if (param0 == 10) {
            if (null != ua.field_d) {
              ua.field_d.k((byte) -113);
              int discarded$4 = -64;
              var4 = ec.e();
              um.field_b = new wf(var4, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            } else {
              int discarded$5 = -64;
              var5 = ec.e();
              um.field_b = new wf(var5, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            }
          } else {
            vn.m(-26);
            if (null == ua.field_d) {
              int discarded$6 = -64;
              var2 = ec.e();
              um.field_b = new wf(var2, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            } else {
              ua.field_d.k((byte) -113);
              int discarded$7 = -64;
              var3 = ec.e();
              um.field_b = new wf(var3, (String) null, true, false, false);
              jh.field_e.b((mf) (Object) nj.field_w, (byte) -46);
              nj.field_w.c((mf) (Object) um.field_b, 88);
              nj.field_w.i((byte) -126);
              return;
            }
          }
        }
    }

    public void a(fb param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((vn) this).field_tb) {
                uk.a(false, 3);
                ((vn) this).k((byte) -121);
                break L1;
              } else {
                sg.a(bh.i(param4 ^ -24270), (byte) 120, "tochangedisplayname.ws");
                break L1;
              }
            }
            if (param4 == -24221) {
              break L0;
            } else {
              ((vn) this).n(-96);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("vn.DA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void j(byte param0) {
        field_sb = null;
        field_Ab = null;
        field_xb = null;
        if (param0 != 5) {
          vn.j((byte) 123);
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        } else {
          field_rb = null;
          field_ub = null;
          field_Bb = null;
          field_vb = null;
          field_Eb = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = new String[]{"Click on one of the highlighted pieces to select it", "Click on one of the highlighted squares to move your selected piece"};
        field_Eb = "This game option has not yet been unlocked for use.";
        field_sb = new int[]{682, 910};
        field_Db = -1;
        field_vb = new jc();
    }
}
