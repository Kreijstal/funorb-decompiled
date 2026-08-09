/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iea {
    static String field_e;
    int field_h;
    static jea field_g;
    int field_f;
    int field_d;
    int field_c;
    nh field_a;
    iea field_b;

    public static void a(int param0) {
        field_g = null;
        if (param0 != -1) {
            field_g = (jea) null;
        }
        field_e = null;
    }

    final void a(int param0, int param1, int param2, int param3, iea param4, nh param5, int param6) {
        try {
            this.field_c = param1;
            this.field_f = param0;
            int var8_int = -75 % ((40 - param6) / 41);
            this.field_h = param2;
            this.field_d = param3;
            this.field_a = param5;
            this.field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "iea.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void a(boolean param0, byte param1, int param2) {
        iv stackIn_3_0;
        int stackIn_3_1;
        boolean stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        int stackIn_3_5;
        iv stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_4_5 = 0;
        int stackIn_4_6 = 0;
        jea stackIn_22_0 = null;
        jea stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        vna var4 = null;
        Object var5 = null;
        mu var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        lja var16 = null;
        lja var17 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = jja.field_j.field_vb;

              stackIn_3_1 = 2;

              stackIn_3_2 = param0;

              stackIn_3_3 = param1 ^ -78;

              stackIn_3_4 = param2 * 3 * (2 + di.field_a);

              stackIn_3_5 = 2 + di.field_a;

              if (jja.field_j.field_vb != lu.field_b) {
                stackIn_4_0 = (iv) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = stackIn_3_4;
                stackIn_4_5 = stackIn_3_5;
                stackIn_4_6 = 0;
                break L1;
              } else {
                stackIn_4_0 = (iv) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = stackIn_3_4;
                stackIn_4_5 = stackIn_3_5;
                stackIn_4_6 = 1;
                break L1;
              }
            }
            var3_int = ((iv) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6 != 0) ? 1 : 0;
            var4 = jja.field_j.field_tb.field_J;
            if (param1 == -56) {
              L2: {
                L3: {
                  if (ae.field_g == 2) {
                    break L3;
                  } else {
                    if ((ae.field_g ^ -1) != -2) {
                      jja.field_j.field_X = false;
                      jja.field_j.field_vb.field_vb.field_r = nl.field_c;
                      vsa.a(-93, jja.field_j.field_tb);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                jja.field_j.field_X = true;
                jja.field_j.field_vb.field_vb.field_r = null;
                var5 = null;
                var6 = (mu) ((Object) var4.f(-80));
                L4: while (true) {
                  if (var6 == null) {
                    L5: {
                      if (jja.field_j.field_yb.field_y != 0) {
                        bl.field_a = new is(jja.field_j.field_yb.field_q, jja.field_j.field_yb.field_A, jja.field_j.field_yb.field_G, jja.field_j.field_yb.field_t, pe.field_k, lw.field_a, kua.field_i, kua.field_i);
                        cn.field_k = 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (0 == jja.field_j.field_wb.field_y) {
                      break L2;
                    } else {
                      bl.field_a = new is(jja.field_j.field_wb.field_q, jja.field_j.field_wb.field_A, jja.field_j.field_wb.field_G, jja.field_j.field_wb.field_t, av.field_b, lw.field_a, kua.field_i, kua.field_i);
                      cn.field_k = 3;
                      break L2;
                    }
                  } else {
                    L6: {
                      var7 = 0;
                      if (var6.field_J == null) {
                        var6.field_xb = new jea(0L, lta.field_a);
                        var6.b(-127, var6.field_xb);
                        var6.field_zb = new jea(0L, lta.field_a);
                        var6.b(param1 ^ 74, var6.field_zb);
                        var7 = 1;
                        var6.a(-10966);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var6.field_G = jja.field_j.field_tb.field_G;
                      var6.field_xb.a(var6.field_G, di.field_a, -23776, 0, 0);
                      var8 = 0;
                      if (var6.field_vb == null) {
                        break L7;
                      } else {
                        if (var6.field_vb.equals("")) {
                          break L7;
                        } else {
                          var6.field_zb.field_ab = 16737894;
                          var6.field_zb.field_R = bfa.field_e;
                          var6.field_zb.a(bfa.field_e.field_n + 3, di.field_a, -23776, 0, 0);
                          var8 = 1;
                          break L7;
                        }
                      }
                    }
                    L8: {
                      var9 = 0;
                      var10 = var6.field_G;
                      if (var8 != 0) {
                        var9 = 3 + bfa.field_e.field_n;
                        var10 = var10 - var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      stackIn_22_0 = var6.field_xb;

                      if (0 >= var10) {
                        stackIn_23_0 = (jea) ((Object) stackIn_22_0);
                        stackIn_23_1 = var6.field_tb;
                        break L9;
                      } else {
                        stackIn_23_0 = (jea) ((Object) stackIn_22_0);
                        stackIn_23_1 = il.a(var6.field_xb.field_H, var6.field_tb, var10);
                        break L9;
                      }
                    }
                    L10: {
                      stackIn_23_0.field_r = stackIn_23_1;
                      if (var6.field_xb.field_r.equals(var6.field_tb)) {
                        stackIn_26_0 = 0;
                        break L10;
                      } else {
                        stackIn_26_0 = 1;
                        break L10;
                      }
                    }
                    L11: {
                      var11 = stackIn_26_0;
                      var6.field_xb.a(var10, di.field_a, param1 ^ 23784, 0, var9);
                      if (var3_int != 0) {
                        break L11;
                      } else {
                        var6.field_O = di.field_a + -var6.field_t;
                        break L11;
                      }
                    }
                    L12: {
                      if (var7 == 0) {
                        break L12;
                      } else {
                        jja.field_j.field_tb.a(2, (jea) (var5), var6, (byte) -122);
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        if (null == var6.field_zb) {
                          break L14;
                        } else {
                          if (var6.field_zb.field_o) {
                            qda.field_b = var6.field_vb;
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (!var6.field_xb.field_o) {
                        break L13;
                      } else {
                        if (var11 != 0) {
                          qda.field_b = var6.field_tb;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (var6.field_y != 0) {
                        paa.a(jja.field_j.field_vb, -1, var6.field_yb, 0L, param1 + -11579, (int[]) null, var6, -1, var6.field_tb);
                        var16 = hka.field_b;
                        var13_ref_String = uma.field_a;
                        var16.field_f.a((byte) -100, 7, var13_ref_String);
                        var17 = hka.field_b;
                        var13 = jm.field_m;
                        var14 = lba.field_p;
                        var17.field_f.b(var14, 0, -69, 0, var13);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var5 = var6;
                    var6 = (mu) ((Object) var4.e(126));
                    continue L4;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "iea.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, cn param1, int param2, cn param3) {
        try {
            mp.a(joa.field_d, tka.field_q, param0, una.field_j, fe.field_F, kua.field_i, 0, dja.field_p, jq.field_o, ji.field_g, dn.field_a, kw.field_e);
            vda.field_m = uka.a(param1, "lobby", 5, "chatfilter");
            jra.field_c[0] = rba.field_b;
            jra.field_c[param2] = hm.field_m;
            jra.field_c[1] = nga.field_o;
            gea.a(0, param3, qw.field_f);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "iea.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var25 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = param5;
              var8 = param1 * param1;
              var9 = param5 * param5;
              var10 = var9 << 1539183009;
              var11 = var8 << -1860729727;
              var12 = param5 << 1322598049;
              var13 = (-var12 + 1) * var8 - -var10;
              var14 = -(var11 * (var12 - 1)) + var9;
              var15 = var8 << -317408478;
              var16 = var9 << -1410457822;
              var17 = var10 * ((var6_int << 1411664833) + 3);
              var18 = var11 * (-3 + (var7 << 1253570049));
              var19 = var16 * (var6_int + 1);
              nra.a((byte) -55, param2, param0 - -param1, vaa.field_a[param3], param0 + -param1);
              if (param4 > 50) {
                break L1;
              } else {
                field_e = (String) null;
                break L1;
              }
            }
            var20 = var15 * (-1 + var7);
            L2: while (true) {
              if (-1 <= (var7 ^ -1)) {
                break L0;
              } else {
                L3: {
                  if (var13 >= 0) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (-1 >= (var13 ^ -1)) {
                        break L3;
                      } else {
                        var13 = var13 + var17;
                        var14 = var14 + var19;
                        var6_int++;
                        var19 = var19 + var16;
                        var17 = var17 + var16;
                        continue L4;
                      }
                    }
                  }
                }
                L5: {
                  if ((var14 ^ -1) > -1) {
                    var13 = var13 + var17;
                    var14 = var14 + var19;
                    var17 = var17 + var16;
                    var19 = var19 + var16;
                    var6_int++;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var13 = var13 + -var20;
                var14 = var14 + -var18;
                var18 = var18 - var15;
                var7--;
                var20 = var20 - var15;
                var21 = -var7 + param3;
                var22 = var7 + param3;
                var23 = param0 - -var6_int;
                var24 = param0 + -var6_int;
                nra.a((byte) -55, param2, var23, vaa.field_a[var21], var24);
                nra.a((byte) -55, param2, var23, vaa.field_a[var22], var24);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "iea.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_e = "Henry J";
    }
}
