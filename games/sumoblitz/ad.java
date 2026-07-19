/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends za {
    static int field_o;
    jaclib.memory.heap.NativeHeap field_m;
    static gf field_n;
    static int[] field_q;
    static mm field_p;

    final static void c(byte param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = cv.field_G;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L1: while (true) {
              L2: {
                if (var3 <= var2) {
                  if (param0 == 71) {
                    break L2;
                  } else {
                    field_q = (int[]) null;
                    return;
                  }
                } else {
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "ad.B(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        kd.field_a[4] = new int[]{5};
        iv.field_g[4] = new ak(4);
        si.a(400, 38, 10, 2, new int[]{8, 9, 10, 21, 20, 5}, 2, 468);
        iv.field_g[2] = new ak(2);
        if (0 < ct.field_x) {
          if (!uc.a((byte) -29, lt.field_m)) {
            L0: {
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L1;
              } else {
                break L1;
              }
            }
            ut.field_j = param0;
            return;
          } else {
            L2: {
              si.a(150, 38, 170, 2, new int[]{1, 28, 12, 13, 4, 3, 7}, 1, 470);
              iv.field_g[1] = new ak(1);
              si.a(150, 38, 170, 2, new int[]{12, 13, 27, 4, 5}, 8, 470);
              iv.field_g[8] = new ak(8);
              if (2 <= ku.field_j) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (mq.a(8230, 25)) {
                si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
                iv.field_g[0] = new ak(0);
                break L3;
              } else {
                break L3;
              }
            }
            ut.field_j = param0;
            return;
          }
        } else {
          L4: {
            if (2 <= ku.field_j) {
              si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
              iv.field_g[0] = new ak(0);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (mq.a(8230, 25)) {
              si.a(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
              iv.field_g[0] = new ak(0);
              break L5;
            } else {
              break L5;
            }
          }
          ut.field_j = param0;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5 = new byte[param1];
              var4 = var5;
              if (param3 > 48) {
                break L1;
              } else {
                field_n = (gf) null;
                break L1;
              }
            }
            la.a(param0, param2, var5, 0, param1);
            stackOut_2_0 = (byte[]) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("ad.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(int param0) {
        if (param0 != -20388) {
          field_q = (int[]) null;
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_n = null;
          return;
        }
    }

    final static ne e(int param0) {
        ne var1 = null;
        if (param0 != 12768) {
          return (ne) null;
        } else {
          var1 = new ne(vf.field_d, li.field_u, er.field_h[0], av.field_C[0], vg.field_k[0], we.field_B[0], ag.field_d[0], iv.field_l);
          tl.a((byte) -20);
          return var1;
        }
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 55 / ((25 - param0) / 42);
                if ((mp.field_a ^ -1) <= -11) {
                  break L2;
                } else {
                  L3: {
                    var4 = 0;
                    if (pt.field_a) {
                      pt.field_a = false;
                      var4 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  hh.a(true, bp.g(14296), bf.field_a, var4 != 0, dn.b(102));
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (!lf.b(-251)) {
                lk.b();
                kd.a(240, 320, 256);
                um.a(0, 0, param1, (byte) 125);
                return;
              } else {
                L4: {
                  if (0 == jv.field_a) {
                    break L4;
                  } else {
                    od.a(-97, param1);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                jv.a(false, (byte) -71, param2);
                um.a(0, 0, param1, (byte) 125);
                if (var5 == 0) {
                  break L1;
                } else {
                  lk.b();
                  kd.a(240, 320, 256);
                  um.a(0, 0, param1, (byte) 125);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("ad.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    ad(int param0) {
        this.field_m = new jaclib.memory.heap.NativeHeap(param0);
    }

    final void a(int param0) {
        if (param0 != -4009) {
            return;
        }
        this.field_m.a();
    }

    static {
        field_o = 50;
        field_q = new int[8192];
        field_n = new gf();
        field_p = new mm();
    }
}
