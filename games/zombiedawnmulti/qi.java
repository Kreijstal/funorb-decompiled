/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_b;
    static ua field_a;
    static long field_c;

    final static void a(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        u var4_ref_u = null;
        hp var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        k var9 = null;
        ga var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = s.field_e;
              if (param0 >= 101) {
                break L1;
              } else {
                var9 = (k) null;
                qi.a(31, false, (java.math.BigInteger) null, 54, (java.math.BigInteger) null, (byte[]) null, (k) null);
                break L1;
              }
            }
            var2 = var11.g(31365);
            var3 = var11.g(31365);
            if (var2 != 0) {
              if (-2 == (var2 ^ -1)) {
                var4 = var11.h(22219);
                var5 = (hp) ((Object) mh.field_l.c(83));
                L2: while (true) {
                  L3: {
                    if (var5 == null) {
                      break L3;
                    } else {
                      L4: {
                        if (var5.field_v != var3) {
                          break L4;
                        } else {
                          if (var4 == var5.field_f) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = (hp) ((Object) mh.field_l.b(6));
                      continue L2;
                    }
                  }
                  if (var5 == null) {
                    ak.a((byte) -117);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5.a(true);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                bd.a("LR1: " + ci.a(0), (Throwable) null, false);
                ak.a((byte) -115);
                return;
              }
            } else {
              var4_ref_u = (u) ((Object) cp.field_T.c(83));
              if (var4_ref_u == null) {
                ak.a((byte) -119);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L5: {
                  var5_int = -var11.field_j + hd.field_q;
                  var13 = var4_ref_u.field_h;
                  var12 = var13;
                  var6 = var12;
                  if (var13.length << -287634078 >= var5_int) {
                    break L5;
                  } else {
                    var5_int = var13.length << 313760258;
                    break L5;
                  }
                }
                var7 = 0;
                L6: while (true) {
                  if (var5_int <= var7) {
                    var4_ref_u.a(true);
                    return;
                  } else {
                    var6[var7 >> -1599527294] = var6[var7 >> -1599527294] + (var11.g(31365) << tq.b(768, var7 << -1960051192));
                    var7++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "qi.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              eo.a((java.awt.Component) ((Object) param1), 11);
              if (param0 == 100) {
                break L1;
              } else {
                qi.b((byte) 52);
                break L1;
              }
            }
            so.a((java.awt.Component) ((Object) param1), 127);
            if (null == ll.field_a) {
              break L0;
            } else {
              ll.field_a.a((byte) 127, (java.awt.Component) ((Object) param1));
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("qi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final static void a(boolean param0) {
        fb.a(4, 102);
        if (param0) {
            qi.b((byte) -45);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -17) {
            qi.a((byte) -34);
        }
    }

    final static void a(int param0, boolean param1, java.math.BigInteger param2, int param3, java.math.BigInteger param4, byte[] param5, k param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = vj.b(param1, param3);
              if (null == kf.field_j) {
                kf.field_j = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (null == so.field_k) {
                      break L4;
                    } else {
                      if (so.field_k.field_m.length >= var7_int) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  so.field_k = new k(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    so.field_k.field_j = 0;
                    so.field_k.a(param5, param3, param0, 114);
                    so.field_k.b(var7_int, (byte) 119);
                    so.field_k.a(0, var13);
                    if (null == l.field_e) {
                      break L6;
                    } else {
                      if (-101 < (l.field_e.field_m.length ^ -1)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  l.field_e = new k(100);
                  break L5;
                }
                l.field_e.field_j = 0;
                l.field_e.a(-30, 10);
                var11 = 0;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    l.field_e.a(param3, (byte) -82);
                    l.field_e.a(param4, -2628, param2);
                    param6.a(l.field_e.field_m, l.field_e.field_j, 0, 127);
                    param6.a(so.field_k.field_m, so.field_k.field_j, 0, 122);
                    break L0;
                  } else {
                    l.field_e.b(-128, var13[var11]);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = kf.field_j.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("qi.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), stackIn_32_2 + ')');
        }
    }

    static {
        field_b = "Your request to join has been declined.";
    }
}
