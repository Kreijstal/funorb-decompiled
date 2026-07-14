/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends t {
    private boolean field_qb;
    private r field_ob;
    private String field_kb;
    private String field_mb;
    static int field_lb;
    static String field_pb;
    private boolean field_nb;
    static String field_rb;

    final static vj a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        vj var8 = new vj();
        uk var9 = new uk();
        var9.field_n = 10000;
        var9.field_A = param5;
        var9.field_q = new pi[param0 * param5];
        var9.field_r = param2;
        var9.field_w = param4;
        var9.field_u = param1;
        var9.field_t = param0;
        var9.field_v = param6;
        var8.a((bh) (Object) var9, 2777);
        int var10 = -11 / ((param7 - 10) / 35);
        var9.b(11976, param3);
        return var8;
    }

    qn(ka param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((qn) this).field_kb = param1;
        if (((qn) this).field_kb != null) {
            var3 = ec.field_p.b(((qn) this).field_kb, 260, ec.field_p.field_R);
            ((qn) this).a(112, 300, var3 + 150);
        }
        ((qn) this).field_ob = new r(13, 50, 274, 30, 15, 2113632, 4210752);
        ((qn) this).field_nb = false;
        ((qn) this).field_ob.field_L = true;
        ((qn) this).field_qb = false;
        ((qn) this).b((ce) (Object) ((qn) this).field_ob, (byte) -55);
    }

    public static void n(byte param0) {
        field_pb = null;
        if (param0 <= 60) {
            Object var2 = null;
            qn.a((ck) null, (ck) null, (byte) -20);
        }
        field_rb = null;
    }

    final static void c(int param0, int param1) {
        int var3 = client.field_A ? 1 : 0;
        if (param0 != -20494) {
            field_pb = null;
        }
        ug var4 = (ug) (Object) qi.field_Q.c((byte) 125);
        ug var2 = (ug) (Object) qi.field_Q.c((byte) 125);
        while (var4 != null) {
            in.a(var4, (byte) -70, param1);
            var2 = (ug) (Object) qi.field_Q.d(true);
        }
    }

    final void m(byte param0) {
        ((qn) this).field_ob.field_L = false;
        ((qn) this).field_nb = true;
        if (param0 < 75) {
            ((qn) this).m((byte) -99);
        }
    }

    final static void a(ck param0, ck param1, byte param2) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var5 = 0.0f;
        float var3 = 0.0f;
        int var15 = 0;
        int var16 = client.field_A ? 1 : 0;
        float var4 = 1.0f;
        int var6 = param1.field_I;
        int var7 = param1.field_H;
        int[] var20 = param1.field_D;
        int[] var21 = param0.field_D;
        int var10 = 0;
        if (param2 > -73) {
            Object var17 = null;
            qn.a((ck) null, (ck) null, (byte) 15);
        }
        for (var11 = 0; var7 > var11; var11++) {
            for (var12 = 0; var6 > var12; var12++) {
                var13 = 255 & var20[var10];
                var14 = var12 + var11 - -(var13 / 5) - -uf.field_A & 127;
                var5 = (float)var13 / 255.0f;
                var3 = (float)var14 / 128.0f;
                var15 = nm.a(var3, var5, false, var4);
                var21[var10] = var15;
                var10++;
            }
        }
    }

    final static void a(int param0, fd param1, int param2, wl param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            kl var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var14 = client.field_A ? 1 : 0;
            var18 = new kl();
            var18.field_o = param3.d((byte) -116);
            var18.field_C = param3.i(7553);
            var18.field_q = new int[var18.field_o];
            var18.field_A = new int[var18.field_o];
            var18.field_s = new byte[var18.field_o][][];
            var18.field_y = new mh[var18.field_o];
            var18.field_u = new int[var18.field_o];
            var18.field_t = new mh[var18.field_o];
            var5 = 0;
            L0: while (true) {
              if (var5 >= var18.field_o) {
                L1: {
                  if (param2 == 4210752) {
                    break L1;
                  } else {
                    field_pb = null;
                    break L1;
                  }
                }
                aa.field_f.a((bh) (Object) var18, 2777);
                return;
              } else {
                try {
                  var6_int = param3.d((byte) -21);
                  if (0 == var6_int) {
                    decompiledRegionSelector0 = 0;
                  } else {
                    decompiledRegionSelector0 = 1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_A[var5] = -4;
                  var5++;
                  decompiledRegionSelector0 = 2;
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = decompiledCaughtException;
                  var18.field_A[var5] = -5;
                  var5++;
                  decompiledRegionSelector0 = 2;
                }
                L2: {
                  if (decompiledRegionSelector0 == 0) {
                    break L2;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      if (var6_int == -2) {
                        break L2;
                      } else {
                        if (-3 == var6_int) {
                          break L2;
                        } else {
                          L3: {
                            if ((var6_int ^ -1) == -4) {
                              break L3;
                            } else {
                              if (4 == var6_int) {
                                break L3;
                              } else {
                                var5++;
                                continue L0;
                              }
                            }
                          }
                          var20 = param3.c((byte) -38);
                          var8 = param3.c((byte) -38);
                          var9 = param3.d((byte) -72);
                          var10 = new String[var9];
                          var11_int = 0;
                          L4: while (true) {
                            if (var11_int >= var9) {
                              L5: {
                                var23 = new byte[var9][];
                                var22 = var23;
                                var21 = var22;
                                var19 = var21;
                                var11 = var19;
                                if (-4 != (var6_int ^ -1)) {
                                  break L5;
                                } else {
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var9 <= var12_int) {
                                      break L5;
                                    } else {
                                      var13 = param3.i(7553);
                                      var11[var12_int] = new byte[var13];
                                      param3.a(var23[var12_int], 0, (byte) 127, var13);
                                      var12_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                              var18.field_u[var5] = var6_int;
                              var12 = new Class[var9];
                              var17 = 0;
                              var13 = var17;
                              L7: while (true) {
                                if (var9 <= var17) {
                                  var18.field_t[var5] = param1.a(-10962, var8, cg.a(var20, (byte) -108), var12);
                                  var18.field_s[var5] = var23;
                                  var5++;
                                  continue L0;
                                } else {
                                  var12[var17] = cg.a(var10[var17], (byte) -122);
                                  var17++;
                                  continue L7;
                                }
                              }
                            } else {
                              var10[var11_int] = param3.c((byte) -38);
                              var11_int++;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      continue L0;
                    }
                  }
                }
                L8: {
                  var16 = param3.c((byte) -38);
                  var15 = param3.c((byte) -38);
                  var8 = param3.c((byte) -38);
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param3.i(7553);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var18.field_u[var5] = var6_int;
                var18.field_q[var5] = var9;
                var18.field_y[var5] = param1.a(false, var15, cg.a(var16, (byte) 9));
                var5++;
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, float param1, int param2, String param3) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          if (stackIn_3_0 != (((qn) this).field_qb ? 1 : 0)) {
            break L1;
          } else {
            L2: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            ((qn) this).field_qb = stackIn_7_1 != 0;
            if (((qn) this).field_qb) {
              ((qn) this).field_ob.a(4210752, 4088, 8405024);
              ((qn) this).field_ob.field_L = true;
              break L1;
            } else {
              ((qn) this).field_ob.a(4210752, 4088, 2113632);
              if (!((qn) this).field_nb) {
                break L1;
              } else {
                ((qn) this).field_ob.field_L = false;
                break L1;
              }
            }
          }
        }
        L3: {
          if (param2 == 4210752) {
            break L3;
          } else {
            qn.l(68);
            break L3;
          }
        }
        ((qn) this).field_ob.field_Q = (int)(param1 / 100.0f * 65536.0f);
        ((qn) this).field_mb = param3;
    }

    final void b(int param0, int param1, int param2) {
        super.b(-128, param1, param2);
        ec.field_p.b(((qn) this).field_mb, (((qn) this).field_t >> -544182591) + param2, 103 + param1, 16777215, -1);
        if (param0 >= -127) {
            return;
        }
        if (null != ((qn) this).field_kb) {
            hk.a(param2 - -20, param1 - -113, 260, 8421504);
            int discarded$0 = ec.field_p.a(((qn) this).field_kb, param2 - -20, 128 + param1, 260, 100, 16777215, -1, 1, 0, ec.field_p.field_R);
        }
    }

    final static void l(int param0) {
        if (jh.field_h) {
            pf.a(false);
        }
        if (param0 != 13) {
            field_rb = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = "This game has started.";
        field_rb = "Log in / Create account";
    }
}
