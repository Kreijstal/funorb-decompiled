/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class h {
    static String field_e;
    static String field_a;
    static String field_f;
    static String field_c;
    static String field_d;
    static go field_b;

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param2) {
              stackOut_5_0 = q.field_a.a(param0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = sj.field_G.a(param0);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("h.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -113 + 44 + param2 + 41);
        }
        return stackIn_6_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_c = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String[] var5 = null;
        int var5_int = 0;
        String[] var6 = null;
        int var6_int = 0;
        hj[] var7 = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        StringBuilder var15 = null;
        Object var16 = null;
        ec var16_ref = null;
        StringBuilder var17 = null;
        vk var19 = null;
        String[] var20 = null;
        hj var21 = null;
        StringBuilder var22 = null;
        String[] var23 = null;
        hj[] var24 = null;
        vk var26 = null;
        String[] var27 = null;
        hj var28 = null;
        StringBuilder var29 = null;
        String[] var30 = null;
        hj[] var31 = null;
        int[] var36 = null;
        int[] var37 = null;
        String[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String stackOut_49_2 = null;
        String[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_48_2 = null;
        var16 = null;
        var13 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2 = -127 % ((45 - param0) / 55);
              var16_ref = (ec) (Object) l.field_a[13];
              if (mi.field_d != 7) {
                L2: {
                  if (1 == mi.field_d) {
                    break L2;
                  } else {
                    if (mi.field_d != 0) {
                      var3 = pc.field_l[5];
                      var37 = new int[var3];
                      var27 = new String[var3];
                      var5 = var27;
                      var30 = new String[var3];
                      var6 = var30;
                      var31 = new hj[var3];
                      var7 = var31;
                      var14 = 0;
                      var8 = var14;
                      L3: while (true) {
                        if (~var3 >= ~var14) {
                          var16_ref.field_F[0] = var37;
                          var16_ref.field_X[0] = var27;
                          var16_ref.field_G[0] = var30;
                          var16_ref.field_o[0] = var31;
                          var16_ref.field_Q[0] = nc.field_a;
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var37[var14] = var14;
                              var26 = tk.field_c[5][var14];
                              var10 = pf.a((byte) 55, var14);
                              if (var10 != 0) {
                                break L5;
                              } else {
                                if (!var26.field_r) {
                                  var5[var14] = var26.field_b;
                                  var29 = new StringBuilder(20);
                                  StringBuilder discarded$37 = var29.append("<col=1>");
                                  StringBuilder discarded$38 = var29.append(var26.field_b);
                                  StringBuilder discarded$39 = var29.append("</col><br>(");
                                  StringBuilder discarded$40 = var29.append(gh.field_t[var26.field_p]);
                                  StringBuilder discarded$41 = var29.append(")");
                                  var6[var14] = var29.toString();
                                  var7[var14] = var26.a(9392, 2, 111);
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var27[var14] = "";
                              stackOut_47_0 = (String[]) var6;
                              stackOut_47_1 = var14;
                              stackIn_49_0 = stackOut_47_0;
                              stackIn_49_1 = stackOut_47_1;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              if (1 != var10) {
                                stackOut_49_0 = (String[]) (Object) stackIn_49_0;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = ug.field_m;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                stackIn_50_2 = stackOut_49_2;
                                break L6;
                              } else {
                                stackOut_48_0 = (String[]) (Object) stackIn_48_0;
                                stackOut_48_1 = stackIn_48_1;
                                stackOut_48_2 = lf.field_f[var14];
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_50_2 = stackOut_48_2;
                                break L6;
                              }
                            }
                            stackIn_50_0[stackIn_50_1] = stackIn_50_2;
                            var28 = var26.a(9392, 2, 111).e();
                            int discarded$42 = -1;
                            qm.a(var28, 64);
                            vb.a(-109, var28);
                            rf.field_ab.a(-rf.field_ab.field_s + var28.field_s >> 1, var28.field_y + -rf.field_ab.field_y >> 1);
                            ug.b(-1);
                            var7[var14] = var28;
                            break L4;
                          }
                          var14++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = 0;
                L7: while (true) {
                  if (var3 >= 4) {
                    var3 = pc.field_l[cf.field_w];
                    var36 = new int[var3];
                    var20 = new String[var3];
                    var5 = var20;
                    var23 = new String[var3];
                    var6 = var23;
                    var24 = new hj[var3];
                    var7 = var24;
                    var8 = 0;
                    L8: while (true) {
                      if (var8 >= var3) {
                        var16_ref.field_F[1] = var36;
                        var16_ref.field_X[1] = var20;
                        var16_ref.field_G[1] = var23;
                        var16_ref.field_o[1] = var24;
                        var16_ref.field_Q[0] = vb.field_c;
                        break L1;
                      } else {
                        L9: {
                          L10: {
                            var36[var8] = var8;
                            var19 = tk.field_c[cf.field_w][var8];
                            if (0 != gj.a(var8, -10, cf.field_w)) {
                              break L10;
                            } else {
                              if (!var19.field_r) {
                                L11: {
                                  var5[var8] = var19.field_b;
                                  var22 = new StringBuilder(20);
                                  StringBuilder discarded$43 = var22.append("<col=1>");
                                  StringBuilder discarded$44 = var22.append(var19.field_b);
                                  StringBuilder discarded$45 = var22.append("</col><br><br>");
                                  var11 = hk.field_c[cf.field_w][var8];
                                  if (var11 == -1) {
                                    StringBuilder discarded$46 = var22.append(sm.field_d);
                                    break L11;
                                  } else {
                                    L12: {
                                      StringBuilder discarded$47 = var22.append(bj.field_I);
                                      StringBuilder discarded$48 = var22.append(cb.a(53, var11));
                                      StringBuilder discarded$49 = var22.append(32);
                                      StringBuilder discarded$50 = var22.append(40);
                                      if (ha.field_j[cf.field_w][var8] < 0) {
                                        break L12;
                                      } else {
                                        if (ha.field_j[cf.field_w][var8] < 4) {
                                          StringBuilder discarded$51 = var22.append(rf.field_Y[ha.field_j[cf.field_w][var8]]);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    StringBuilder discarded$52 = var22.append(41);
                                    StringBuilder discarded$53 = var22.append(vm.field_zb);
                                    var12 = on.field_v[cf.field_w][var8];
                                    if (var12 != -1) {
                                      StringBuilder discarded$54 = var22.append(cb.a(61, var12));
                                      break L11;
                                    } else {
                                      StringBuilder discarded$55 = var22.append(on.field_p);
                                      break L11;
                                    }
                                  }
                                }
                                var6[var8] = var22.toString();
                                var7[var8] = var19.a(9392, 1, 111);
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var20[var8] = "";
                          var6[var8] = HoldTheLine.field_G[cf.field_w];
                          var21 = var19.a(9392, mi.field_d, 111).e();
                          int discarded$56 = -1;
                          qm.a(var21, 64);
                          vb.a(-97, var21);
                          rf.field_ab.a(-rf.field_ab.field_s + var21.field_s >> 1, var21.field_y + -rf.field_ab.field_y >> 1);
                          ug.b(-1);
                          var7[var8] = var21;
                          break L9;
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  } else {
                    L13: {
                      var17 = new StringBuilder(20);
                      StringBuilder discarded$57 = var17.append("<col=1>");
                      StringBuilder discarded$58 = var17.append(gh.field_t[var3]);
                      StringBuilder discarded$59 = var17.append("</col><br><br>");
                      var5_int = pf.a((byte) 2, var3);
                      if (var5_int != 2) {
                        if (var5_int != 1) {
                          StringBuilder discarded$60 = var17.append(sa.field_d[var3]);
                          break L13;
                        } else {
                          StringBuilder discarded$61 = var17.append(lf.field_f[var3]);
                          break L13;
                        }
                      } else {
                        StringBuilder discarded$62 = var17.append(ug.field_m);
                        break L13;
                      }
                    }
                    var16_ref.field_X[0][var3] = gh.field_t[var3];
                    var16_ref.field_G[0][var3] = var17.toString();
                    var16_ref.field_o[0][var3] = p.a(pf.a((byte) 41, var3), (byte) -109, var3);
                    var3++;
                    continue L7;
                  }
                }
              } else {
                var3 = 0;
                L14: while (true) {
                  if (var3 >= 4) {
                    var16_ref.field_Q[0] = hb.field_a;
                    break L1;
                  } else {
                    L15: {
                      var15 = new StringBuilder(20);
                      StringBuilder discarded$63 = var15.append("<col=1>");
                      StringBuilder discarded$64 = var15.append(gh.field_t[var3]);
                      StringBuilder discarded$65 = var15.append("</col><br><br>");
                      var5_int = pf.a((byte) 105, var3);
                      if (2 != var5_int) {
                        if (var5_int == 1) {
                          StringBuilder discarded$66 = var15.append(ac.field_a[var3]);
                          break L15;
                        } else {
                          StringBuilder discarded$67 = var15.append(sa.field_d[var3]);
                          StringBuilder discarded$68 = var15.append("<br><br>");
                          var6_int = d.field_c[var3];
                          if (var6_int == -1) {
                            StringBuilder discarded$69 = var15.append(vm.field_tb);
                            break L15;
                          } else {
                            StringBuilder discarded$70 = var15.append(bj.field_I);
                            StringBuilder discarded$71 = var15.append(cb.a(90, var6_int));
                            break L15;
                          }
                        }
                      } else {
                        StringBuilder discarded$72 = var15.append(ug.field_m);
                        break L15;
                      }
                    }
                    var16_ref.field_X[0][var3] = gh.field_t[var3];
                    var16_ref.field_G[0][var3] = var15.toString();
                    var16_ref.field_o[0][var3] = p.a(pf.a((byte) 30, var3), (byte) -37, var3);
                    var3++;
                    continue L14;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "h.A(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "2P";
        field_f = "Close";
        field_c = "You have <%0> unread messages!";
        field_a = "No retry attempts remaining";
        field_d = "OK";
    }
}
