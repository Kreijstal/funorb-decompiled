/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static hl field_e;
    static String field_c;
    static boolean field_a;
    static jp[][] field_d;

    final static void a(int param0) {
        nq.field_p = false;
        if (!(null == hd.field_a)) {
            hd.field_a.f((byte) 41);
        }
        if (!(param0 == (ng.field_b ^ -1))) {
            fl.b(true);
        }
        ah.field_v = 0;
    }

    final static void b(int param0) {
        char dupTemp$1 = 0;
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ck var4_ref_ck = null;
        int var4 = 0;
        int var5_int = 0;
        ck var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 < -26) {
              L1: {
                var1_int = ff.field_d.e(119);
                if (var1_int != 0) {
                  var2 = 14 + (18 * var1_int + 9);
                  var3 = 0;
                  var4_ref_ck = (ck) ((Object) ff.field_d.d(-8));
                  L2: while (true) {
                    if (var4_ref_ck == null) {
                      var3 += 28;
                      var3 = -(var3 % 100) + (100 + var3);
                      lb.d(-var3 + 626, 14, var3, var2, 0, 180);
                      var4 = 0;
                      L3: while (true) {
                        if (var4 >= 12) {
                          var4 = 41;
                          var5 = (ck) ((Object) ff.field_d.d(-80));
                          L4: while (true) {
                            if (var5 == null) {
                              break L1;
                            } else {
                              var6 = 612;
                              var7 = 0;
                              var8 = 0;
                              L5: while (true) {
                                if (var5.field_l.length() <= var8) {
                                  var4 += 18;
                                  var5 = (ck) ((Object) ff.field_d.a((byte) 116));
                                  continue L4;
                                } else {
                                  dupTemp$1 = var5.field_l.charAt(var5.field_l.length() + (-var8 + -1));
                                  var7 = dupTemp$1;
                                  var6 = var6 - wp.field_c.a(dupTemp$1);
                                  wp.field_c.a((char) var7, var6, var4, 2);
                                  var8++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var5_int = (-var4 + 12) * 20;
                          lb.a(626 - var3 - -var4, 14 - -var4, -var4 + -var4 + var3, -var4 + -var4 + var2, 0, var5_int);
                          var4++;
                          continue L3;
                        }
                      }
                    } else {
                      var5_int = 0;
                      var6 = 0;
                      L6: while (true) {
                        if (var4_ref_ck.field_l.length() <= var6) {
                          L7: {
                            if (var5_int <= var3) {
                              break L7;
                            } else {
                              var3 = var5_int;
                              break L7;
                            }
                          }
                          var4_ref_ck = (ck) ((Object) ff.field_d.a((byte) 116));
                          continue L2;
                        } else {
                          var5_int = var5_int + wp.field_c.a(var4_ref_ck.field_l.charAt(var6));
                          var6++;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
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
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "rd.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static ki a(int param0, byte param1) {
        int var3 = 0;
        Object var2 = null;
        if (param1 != 19) {
            rd.a((byte) -86);
        }
        gb.field_n = hi.field_w.a(-37880252, 2);
        if (!(param0 != 0)) {
            var3 = hi.field_w.a(-37880252, 11);
            if (!(var3 + 1 != pe.field_n)) {
                var3 = (1 + var3) % 11;
            }
            pe.field_n = var3 + 1;
            param0 = var3 + 1;
        }
        if (!(param0 != 7)) {
            lg.h(0);
        }
        ki var2_ref = fd.field_d[param0];
        var2_ref.e(param1 + -18);
        return var2_ref;
    }

    final static String a(String param0, String[] param1, byte param2) {
        String discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.length();
              var4 = var3_int;
              var5 = 0;
              if (param2 == 103) {
                break L1;
              } else {
                var12 = (String[]) null;
                discarded$4 = rd.a((String) null, (String[]) null, (byte) -1);
                break L1;
              }
            }
            L2: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if ((var6_int ^ -1) > -1) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (-1 >= (var8 ^ -1)) {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!eh.a(param0.charAt(var5), (byte) 60)) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (dc.a((CharSequence) ((Object) var9), param2 ^ -23)) {
                        if (var3_int <= var5) {
                          continue L3;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = fl.a((CharSequence) ((Object) var9), -28734);
                            discarded$5 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$6 = var6.append(param1[var10]);
                            continue L3;
                          } else {
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    discarded$7 = var6.append(param0.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var5 >= var3_int) {
                      break L7;
                    } else {
                      if (!eh.a(param0.charAt(var5), (byte) 44)) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(2 + var6_int, var5);
                  if (!dc.a((CharSequence) ((Object) var7_ref_String), -43)) {
                    continue L2;
                  } else {
                    if (var5 >= var3_int) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = fl.a((CharSequence) ((Object) var7_ref_String), -28734);
                        var4 = var4 + (var6_int - var5 + param1[var8].length());
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("rd.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    final static jp[] c(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        jp[] var1 = new jp[nl.field_c];
        for (var2 = 0; var2 < nl.field_c; var2++) {
            var3 = jh.field_b[var2] * gg.field_t[var2];
            var4 = cn.field_a[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = qp.field_c[ik.a((int) var4[var6], 255)];
            }
            var1[var2] = new jp(cf.field_d, ek.field_db, ag.field_K[var2], dl.field_d[var2], jh.field_b[var2], gg.field_t[var2], var5);
        }
        if (param0 < 93) {
            return (jp[]) null;
        }
        ee.d((byte) 96);
        return var1;
    }

    public static void a(byte param0) {
        jp[] discarded$0 = null;
        field_e = null;
        field_b = null;
        if (param0 != 46) {
            discarded$0 = rd.c(110);
        }
        field_c = null;
        field_d = (jp[][]) null;
    }

    static {
        field_b = "Fullscreen";
        field_c = "<%0> has withdrawn the request to join.";
    }
}
