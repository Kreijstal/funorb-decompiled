/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends i {
    private int field_I;
    private at field_H;
    private int field_J;
    private tk field_L;
    private int field_K;
    static String field_M;
    private int field_F;
    static int field_G;

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    private final hd g(byte param0) {
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        at var6 = null;
        int var7 = 0;
        hd var8 = null;
        var7 = Kickabout.field_G;
        var8 = new hd();
        var3 = 0;
        if (param0 <= -46) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= pa.field_g.length) {
              var8.a(true, 270, 0, 0, var3);
              return var8;
            } else {
              var5 = pa.field_g[var4];
              if (((ek) this).field_J == var5.field_k) {
                if (0 != var5.field_h) {
                  L1: {
                    if (72 != var5.field_h) {
                      break L1;
                    } else {
                      if ((1 & ic.field_h.field_n) == 1) {
                        break L1;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                  L2: {
                    if (var5.field_h != 73) {
                      break L2;
                    } else {
                      if (vl.b(0)) {
                        break L2;
                      } else {
                        var4++;
                        continue L0;
                      }
                    }
                  }
                  var6 = new at(var4);
                  var6.field_s = 5;
                  var6.field_J = var3;
                  var3 = var3 + var6.field_mb;
                  var8.a((byte) -114, (hd) (Object) var6);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static ak b(boolean param0, int param1, int param2) {
        ak var3 = new ak(0);
        var3.field_k = param1;
        var3.field_e = (4 & (param2 ^ param1)) != 0 ? re.field_o : nn.field_K;
        var3.field_g = param2 - 4;
        return var3;
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            field_M = null;
        }
        return 500;
    }

    final void a(byte param0, int param1, int param2) {
        Object var5 = null;
        at var6_ref_at = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        tk var11 = null;
        var10 = Kickabout.field_G;
        super.a((byte) -25, param1, param2);
        var11 = ((ek) this).field_L;
        ((ek) this).field_L.a(true, 210, param1 - -250, param2 + 55, 240);
        ((ek) this).field_L.b(0, true);
        on.a(-4 + var11.field_F, var11.field_T + -5, 8 + var11.field_q, var11.field_mb, 8, 65793, 96);
        if (param0 < -11) {
          L0: {
            if (var11.field_Eb.e((byte) -113)) {
              on.g(var11.field_Eb.field_F - -3, var11.field_Eb.field_T, -6 + var11.field_Eb.field_q, var11.field_Eb.field_mb);
              break L0;
            } else {
              break L0;
            }
          }
          pt.a(-2 + (var11.field_F - (-var11.field_q - -15)), -22914, 0, -2 + (var11.field_mb + var11.field_T) - 15, var11.field_T);
          var5 = null;
          var6_ref_at = (at) (Object) ((ek) this).field_L.field_Db.field_jb.g(24009);
          L1: while (true) {
            if (var6_ref_at == null) {
              L2: {
                if ((Object) (Object) ((ek) this).field_t == var5) {
                  break L2;
                } else {
                  ((ek) this).a(((ek) this).field_v, (lv) var5, (ut) null, -94, ((ek) this).field_u);
                  break L2;
                }
              }
              L3: {
                ta.e(123);
                if (null == ((ek) this).field_H) {
                  break L3;
                } else {
                  var6 = 130 + param1;
                  var7 = 160 + param2;
                  var8 = ((ek) this).field_H.field_Cb.b(0);
                  var9 = ((ek) this).field_H.field_Cb.a(15);
                  on.a(-(var8 >> 1) + var6 - 10, -(var9 >> 1) + (var7 + -10), 20 + var8, var9 + 40, 10, 65793, 128);
                  ((ek) this).field_H.field_Cb.a(var7, 23, var6);
                  pb.field_C.d(((ek) this).field_H.field_Eb, var6, 20 + ((var9 >> 1) + var7), ((ek) this).field_H.c(true), -1);
                  if (((ek) this).field_H.field_Db > ic.field_h.field_x) {
                    pb.field_C.d(ef.field_n, var6, 62 + ((var9 >> 1) + var7), 16777215, -1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              ((ek) this).field_L.a(117, false);
              pb.field_C.d(jw.field_Bb, (((ek) this).b(-1379118556) >> 1) + param1, 312 + param2, 13421772, -1);
              return;
            } else {
              L4: {
                if (((ek) this).field_H != var6_ref_at) {
                  if (!var6_ref_at.field_gb) {
                    break L4;
                  } else {
                    on.f(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 4473924);
                    break L4;
                  }
                } else {
                  on.a(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 65793, 128);
                  on.f(var6_ref_at.field_F, var6_ref_at.field_T, var6_ref_at.field_q, var6_ref_at.field_mb, 8, 10066329);
                  break L4;
                }
              }
              var6_ref_at.i((byte) -76);
              var6_ref_at = (at) (Object) ((ek) this).field_L.field_Db.field_jb.c(33);
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final static void g() {
        np.field_Jb.a((gn) (Object) new kn(), 3);
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        at var4 = null;
        int var5 = 0;
        hd stackIn_21_0 = null;
        hd stackIn_22_0 = null;
        hd stackIn_23_0 = null;
        hd stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        hd stackOut_20_0 = null;
        hd stackOut_21_0 = null;
        hd stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        hd stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (((ek) this).field_K > 0) {
            ((ek) this).field_K = ((ek) this).field_K - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = ((ek) this).field_L.field_Db.field_J;
          ((ek) this).field_L.b(0, param1);
          ((ek) this).field_L.a(id.field_v * 32, true, (byte) -78, 32);
          if (var3 >= ((ek) this).field_L.field_Db.field_J) {
            break L1;
          } else {
            if (((ek) this).field_K == 0) {
              wh discarded$2 = sp.c(59, 52);
              ((ek) this).field_K = 10;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((ek) this).field_L.field_Db.field_J >= var3) {
            break L2;
          } else {
            if (((ek) this).field_K == 0) {
              wh discarded$3 = sp.c(60, -119);
              ((ek) this).field_K = 10;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param0 == 3) {
            break L3;
          } else {
            ((ek) this).a((byte) 5, 15, 25);
            break L3;
          }
        }
        var4 = (at) (Object) ((ek) this).field_L.field_Db.field_jb.g(param0 + 24006);
        L4: while (true) {
          if (var4 == null) {
            L5: {
              L6: {
                stackOut_20_0 = ((ek) this).field_i[0];
                stackIn_23_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (((ek) this).field_H == null) {
                  break L6;
                } else {
                  stackOut_21_0 = (hd) (Object) stackIn_21_0;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (((ek) this).field_H.field_Db > ic.field_h.field_x) {
                    break L6;
                  } else {
                    stackOut_22_0 = (hd) (Object) stackIn_22_0;
                    stackOut_22_1 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    break L5;
                  }
                }
              }
              stackOut_23_0 = (hd) (Object) stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L5;
            }
            stackIn_24_0.field_lb = stackIn_24_1 != 0;
            return;
          } else {
            L7: {
              if (1 != var4.field_sb) {
                break L7;
              } else {
                kj.a((byte) -98);
                if (((ek) this).field_H != var4) {
                  ((ek) this).field_H = var4;
                  break L7;
                } else {
                  ((ek) this).field_H = null;
                  break L7;
                }
              }
            }
            var4 = (at) (Object) ((ek) this).field_L.field_Db.field_jb.c(param0 + 30);
            continue L4;
          }
        }
    }

    ek(int param0, int param1, int param2) {
        super(24);
        ((ek) this).field_J = param0;
        ((ek) this).field_F = param2;
        ((ek) this).field_K = 0;
        ((ek) this).field_I = param1;
        CharSequence var5 = (CharSequence) (Object) "trinkets";
        ((ek) this).field_L = new tk(vb.a(0, var5), this.g((byte) -119), be.field_q, rr.field_b, it.field_m);
        ((ek) this).field_L.a(15, 0, 2, (byte) 2, 240, 210, 0);
        ((ek) this).field_i[0].field_lb = false;
    }

    public static void d() {
        field_M = null;
    }

    final int a(byte param0) {
        if (param0 <= 75) {
            hd discarded$0 = this.g((byte) 21);
        }
        return 380;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        if (param0 >= 60) {
          L0: {
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                if (null == ((ek) this).field_H) {
                  break L1;
                } else {
                  var3 = ((ek) this).field_H.field_yb;
                  ge.a(var3, ((ek) this).field_I, (byte) 123, ((ek) this).field_F);
                  wh discarded$2 = sp.c(50, -110);
                  break L0;
                }
              }
            }
            ii.a((byte) -120);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = null;
    }
}
