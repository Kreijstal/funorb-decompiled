/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int[] field_a;
    static String field_b;

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_b = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == lb.field_o) {
              break L2;
            } else {
              if (ge.field_m == this) {
                break L2;
              } else {
                if (this != la.field_O) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        ai.a(param1, -1, (String) null, param0);
        if (param2 != 4) {
            th.a(false, true, -6);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var11 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if ((param2 ^ -1) >= -37) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      L3: {
                        if (param0 == -123) {
                          break L3;
                        } else {
                          field_a = (int[]) null;
                          break L3;
                        }
                      }
                      stackOut_43_0 = var5;
                      stackIn_44_0 = stackOut_43_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 == 0) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param1) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          if (97 > var9) {
                            stackOut_25_0 = 0;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param2 <= var9) {
                          stackOut_31_0 = 0;
                          stackIn_32_0 = stackOut_31_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var4_int == 0) {
                              break L9;
                            } else {
                              var9 = -var9;
                              break L9;
                            }
                          }
                          var10 = param2 * var6 - -var9;
                          if (var10 / param2 != var6) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) (var4);
            stackOut_45_1 = new StringBuilder().append("th.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param3 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L10;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              return stackIn_44_0 != 0;
            }
          }
        }
    }

    final static void a(bd param0, bd param1, int param2, int param3) {
        boolean discarded$0 = false;
        try {
            pe.field_c = param1;
            mj.field_E = param0;
            if (param3 >= -99) {
                CharSequence var5 = (CharSequence) null;
                discarded$0 = th.a(-70, false, 43, (CharSequence) null);
            }
            gg.field_d = param2;
            ki.a(ti.field_i / 2, ti.field_b / 2, -116);
            qe.a(param0.field_x, -29770, param1.field_r + param1.field_x, param1.field_x, param0.field_r + param0.field_x);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "th.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -22) {
            field_a = (int[]) null;
        }
    }

    final static void a(int param0, fk param1, int param2) {
        ha var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = pg.field_fb;
            var5.f(param0, 950);
            var5.field_k = var5.field_k + 1;
            var4 = var5.field_k;
            var5.a(false, param2);
            var5.a(false, param1.field_l);
            var5.a((byte) 67, param1.field_p);
            var5.b(0, param1.field_m);
            var5.b(0, param1.field_s);
            var5.b(0, param1.field_o);
            var5.b(0, param1.field_n);
            discarded$0 = var5.c(var4, (byte) -3);
            var5.a(-var4 + var5.field_k, (byte) 80);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "th.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        pb var1 = null;
        pb var3 = null;
        int var4 = 0;
        int var5 = stellarshard.field_B;
        try {
            var1 = new pb(540, 140);
            hj.a(var1, 1);
            cc.a();
            int var2 = 104 / ((param0 - -41) / 39);
            ti.d();
            ni.field_d = 0;
            ja.a(4);
            var3 = var1.a();
            for (var4 = 0; var4 < 15; var4++) {
                var3.b(-2, -2, 16777215);
                ti.d(4, 4, 0, 0, 540, 140);
            }
            pd.field_s.e();
            var1.b(0, 0);
            id.b((byte) -58);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "th.C(" + param0 + ')');
        }
    }

    static {
        field_b = "Password: ";
        field_a = new int[]{1, 4, 0, 1, 2, 3};
    }
}
