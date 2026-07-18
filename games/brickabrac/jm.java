/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jm {
    static String field_l;
    int field_d;
    int field_h;
    byte[] field_c;
    int field_e;
    int field_j;
    int field_b;
    int field_a;
    static tq field_f;
    byte[] field_g;
    static String field_i;
    int field_k;

    final static nb a(java.awt.Component param0, int param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            nb var5 = null;
            jo var5_ref = null;
            Object var6 = null;
            nb stackIn_3_0 = null;
            jo stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            nb stackOut_2_0 = null;
            jo stackOut_4_0 = null;
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
                if (param2 == -2414) {
                  break L0;
                } else {
                  var6 = null;
                  nb discarded$2 = jm.a((java.awt.Component) null, 85, -118, 37);
                  break L0;
                }
              }
              try {
                L1: {
                  var4 = Class.forName("le");
                  var5 = (nb) var4.newInstance();
                  var5.a(param0, param3, true, param1);
                  stackOut_2_0 = (nb) var5;
                  stackIn_3_0 = stackOut_2_0;
                  break L1;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new jo();
                ((nb) (Object) var5_ref).a(param0, param3, true, param1);
                stackOut_4_0 = (jo) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (nb) (Object) stackIn_5_0;
              }
              return stackIn_3_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("jm.A(");
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
              throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vl var4 = null;
        Object var5 = null;
        mp var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        nn var16 = null;
        nn var17 = null;
        mm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        boolean stackIn_2_5 = false;
        mm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        boolean stackIn_3_5 = false;
        mm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        boolean stackIn_4_5 = false;
        int stackIn_4_6 = 0;
        mh stackIn_19_0 = null;
        mh stackIn_20_0 = null;
        mh stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        boolean stackOut_1_5 = false;
        mm stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        boolean stackOut_3_5 = false;
        int stackOut_3_6 = 0;
        mm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        boolean stackOut_2_5 = false;
        int stackOut_2_6 = 0;
        mh stackOut_18_0 = null;
        mh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        mh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = f.field_c.field_Qb;
              stackOut_1_1 = 2;
              stackOut_1_2 = param2 * (np.field_a * 3 - -6);
              stackOut_1_3 = np.field_a + 2;
              stackOut_1_4 = 22676;
              stackOut_1_5 = param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              if (o.field_b != f.field_c.field_Qb) {
                stackOut_3_0 = (mm) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = stackIn_3_5;
                stackOut_3_6 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                stackIn_4_6 = stackOut_3_6;
                break L1;
              } else {
                stackOut_2_0 = (mm) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                stackIn_4_6 = stackOut_2_6;
                break L1;
              }
            }
            var3_int = ((mm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6 != 0) ? 1 : 0;
            var4 = f.field_c.field_Xb.field_bb;
            L2: {
              L3: {
                if (wk.field_m == 2) {
                  break L3;
                } else {
                  if (wk.field_m == 1) {
                    break L3;
                  } else {
                    f.field_c.field_eb = false;
                    f.field_c.field_Qb.field_Qb.field_Mb = cm.field_t;
                    jh.a(true, f.field_c.field_Xb);
                    break L2;
                  }
                }
              }
              f.field_c.field_eb = true;
              f.field_c.field_Qb.field_Qb.field_Mb = null;
              var5 = null;
              var6 = (mp) (Object) var4.d(-57);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (f.field_c.field_Tb.field_L == 0) {
                      break L5;
                    } else {
                      tn.field_m = new gq(f.field_c.field_Tb.field_Eb, f.field_c.field_Tb.field_db, f.field_c.field_Tb.field_Ib, f.field_c.field_Tb.field_cb, kg.field_e, ij.field_c, ad.field_l, ad.field_l);
                      ij.field_d = 2;
                      break L5;
                    }
                  }
                  if (0 != f.field_c.field_Wb.field_L) {
                    tn.field_m = new gq(f.field_c.field_Wb.field_Eb, f.field_c.field_Wb.field_db, f.field_c.field_Wb.field_Ib, f.field_c.field_Wb.field_cb, gn.field_A, ij.field_c, ad.field_l, ad.field_l);
                    ij.field_d = 3;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null != var6.field_bb) {
                      break L6;
                    } else {
                      var6.field_Xb = new mh(0L, vb.field_K);
                      var6.a(var6.field_Xb, 0);
                      var6.field_Yb = new mh(0L, vb.field_K);
                      var6.a(var6.field_Yb, 0);
                      var6.c(true);
                      var7 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_Ib = f.field_c.field_Xb.field_Ib;
                    var6.field_Xb.a(np.field_a, 0, 0, var6.field_Ib, (byte) 64);
                    var8 = 0;
                    if (null == var6.field_Qb) {
                      break L7;
                    } else {
                      if (var6.field_Qb.equals((Object) (Object) "")) {
                        break L7;
                      } else {
                        var6.field_Yb.field_wb = ok.field_g;
                        var6.field_Yb.field_Y = 16737894;
                        var8 = 1;
                        var6.field_Yb.a(np.field_a, 0, 0, ok.field_g.field_x + 3, (byte) 64);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_Ib;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = ok.field_g.field_x + 3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_18_0 = var6.field_Xb;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    if (0 < var10) {
                      stackOut_20_0 = (mh) (Object) stackIn_20_0;
                      stackOut_20_1 = dh.a(var6.field_Xb.field_O, var6.field_Rb, var10);
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      break L9;
                    } else {
                      stackOut_19_0 = (mh) (Object) stackIn_19_0;
                      stackOut_19_1 = var6.field_Rb;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_21_0.field_Mb = stackIn_21_1;
                    if (var6.field_Xb.field_Mb.equals((Object) (Object) var6.field_Rb)) {
                      stackOut_23_0 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      break L10;
                    } else {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_24_0;
                    var6.field_Xb.a(np.field_a, 0, var9, var10, (byte) 64);
                    if (var3_int != 0) {
                      break L11;
                    } else {
                      var6.field_C = np.field_a + -var6.field_cb;
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 == 0) {
                      break L12;
                    } else {
                      f.field_c.field_Xb.a((mh) var5, 2, (mh) (Object) var6, 17290);
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Yb) {
                        break L14;
                      } else {
                        if (var6.field_Yb.field_kb) {
                          ep.field_e = var6.field_Qb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Xb.field_kb) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        ep.field_e = var6.field_Rb;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var6.field_L != 0) {
                      mn.a(-1, (mh) (Object) var6, f.field_c.field_Qb, (int[]) null, var6.field_ac, -1, (byte) -58, 0L, var6.field_Rb);
                      var16 = bm.field_d;
                      var13_ref_String = ng.field_e;
                      var16.field_d.a(var13_ref_String, 7, (byte) 126);
                      var17 = bm.field_d;
                      var13 = tb.field_fb;
                      var14 = qo.field_O;
                      var17.field_d.a(var14, -126, 0, 0, var13);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var5 = (Object) (Object) var6;
                  var6 = (mp) (Object) var4.a((byte) 116);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "jm.B(" + param0 + ',' + true + ',' + param2 + ')');
        }
    }

    final static mb a(byte[] param0) {
        mb var2 = null;
        RuntimeException var2_ref = null;
        mb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        mb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new mb(param0, ag.field_K, dl.field_d, jh.field_b, gg.field_t, qp.field_c, cn.field_a);
              int discarded$2 = 96;
              ee.d();
              stackOut_3_0 = (mb) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("jm.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -14 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(boolean param0, char param1) {
        return String.valueOf(param1);
    }

    final static void a() {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        pe var4_ref_pe = null;
        int var4 = 0;
        pn var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        pi var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = jl.field_e;
              var2 = var10.l(255);
              var3 = var10.l(255);
              if (var2 != 0) {
                if (var2 == 1) {
                  var4 = var10.c(-1342);
                  var5 = (pn) (Object) qa.field_t.d(-19);
                  L2: while (true) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        L4: {
                          if (var3 != var5.field_p) {
                            break L4;
                          } else {
                            if (var4 != var5.field_n) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var5 = (pn) (Object) qa.field_t.a((byte) 116);
                        continue L2;
                      }
                    }
                    if (var5 != null) {
                      var5.b((byte) 111);
                      break L1;
                    } else {
                      hn.a((byte) 110);
                      return;
                    }
                  }
                } else {
                  rk.a("LR1: " + eq.c((byte) -96), (Throwable) null, 53);
                  hn.a((byte) 52);
                  break L1;
                }
              } else {
                var4_ref_pe = (pe) (Object) ob.field_F.d(-37);
                if (var4_ref_pe != null) {
                  L5: {
                    var5_int = ga.field_j - var10.field_l;
                    var14 = var4_ref_pe.field_m;
                    var13 = var14;
                    var12 = var13;
                    var11 = var12;
                    var6 = var11;
                    if (var14.length << 2 < var5_int) {
                      var5_int = var14.length << 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var7 = 0;
                  L6: while (true) {
                    if (var5_int <= var7) {
                      var4_ref_pe.field_v = true;
                      var4_ref_pe.b((byte) 111);
                      break L1;
                    } else {
                      var6[var7 >> 2] = var6[var7 >> 2] + (var10.l(255) << (ik.a(3, var7) << 8));
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  hn.a((byte) 57);
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "jm.D(" + 22 + ')');
        }
    }

    public static void b() {
        field_f = null;
        field_i = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "The following settings need to be changed:  ";
        field_f = new tq();
        field_i = "Please enter your date of birth to enable chat:";
    }
}
