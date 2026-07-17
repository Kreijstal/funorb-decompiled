/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hea extends td {
    static du field_p;
    static String field_s;
    static int field_r;
    static String field_t;
    static String field_q;

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        rn var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        wia var17 = null;
        aga var18 = null;
        int var19 = 0;
        aga var20 = null;
        rn stackIn_43_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        rn stackOut_42_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var20 = ((hea) this).field_h.a(param1 + 110, param0);
              var4 = new rn(((hea) this).field_g, new nq(var20), ((hea) this).field_i);
              var5 = param0.field_z;
              var6 = param0.field_B;
              var7 = var20.field_x;
              var8 = var20.field_J;
              var9 = ((hea) this).field_i;
              var10 = 0;
              var11 = 0;
              if (param1 == 3) {
                break L1;
              } else {
                field_r = 110;
                break L1;
              }
            }
            var12 = -1;
            var13 = -1;
            L2: while (true) {
              var10++;
              if (1000 <= var10) {
                throw new IllegalStateException("");
              } else {
                L3: {
                  var14 = var7;
                  var15 = var8;
                  var16 = var9;
                  if (var16 != 2) {
                    if (var16 == 4) {
                      var14++;
                      break L3;
                    } else {
                      if (var16 == 1) {
                        var15--;
                        break L3;
                      } else {
                        if (var16 == 3) {
                          var15++;
                          break L3;
                        } else {
                          throw new IllegalStateException();
                        }
                      }
                    }
                  } else {
                    var14--;
                    break L3;
                  }
                }
                L4: {
                  var16 = 0;
                  if (var14 >= 0) {
                    break L4;
                  } else {
                    var9 = 3;
                    var16 = 1;
                    break L4;
                  }
                }
                L5: {
                  if (~var5 < ~var14) {
                    break L5;
                  } else {
                    var9 = 1;
                    var16 = 1;
                    break L5;
                  }
                }
                L6: {
                  if (var15 < 0) {
                    var9 = 2;
                    var16 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (~var6 >= ~var15) {
                    var16 = 1;
                    var9 = 4;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (var16 == 0) {
                  L8: {
                    var8 = var15;
                    var7 = var14;
                    if (~var20.field_x != ~var7) {
                      break L8;
                    } else {
                      if (var8 == var20.field_J) {
                        stackOut_42_0 = (rn) var4;
                        stackIn_43_0 = stackOut_42_0;
                        break L0;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var17 = param0.field_a[var7][var8];
                    var18 = var17.field_l;
                    if (var18 == null) {
                      break L9;
                    } else {
                      var4.field_o.a((bw) (Object) new iv(new nq(var18), false, 1, 50, 0), true);
                      break L9;
                    }
                  }
                  L10: {
                    if (var11 == 0) {
                      break L10;
                    } else {
                      if (~var12 != ~var7) {
                        break L10;
                      } else {
                        if (var8 != var13) {
                          break L10;
                        } else {
                          var9 = ov.b(((hea) this).field_i, 60);
                          break L10;
                        }
                      }
                    }
                  }
                  continue L2;
                } else {
                  if (var11 == 0) {
                    var11 = 1;
                    var13 = var8;
                    var12 = var7;
                    continue L2;
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var3;
            stackOut_44_1 = new StringBuilder().append("hea.A(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_43_0;
    }

    final static ee a(ee param0, int[] param1, byte param2) {
        ee var3 = null;
        RuntimeException var3_ref = null;
        ee stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ee stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var3 = new ee(0, 0, 0);
            var3.field_a = param0.field_a;
            var3.field_g = param0.field_g;
            var3.field_e = param0.field_e;
            var3.field_b = param0.field_b;
            var3.field_h = param1;
            var3.field_f = param0.field_f;
            var3.field_d = param0.field_d;
            var3.field_c = param0.field_c;
            stackOut_0_0 = (ee) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("hea.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 117 + 41);
        }
        return stackIn_1_0;
    }

    hea(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
            ((hea) this).field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hea.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final static pp b(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        ks stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ks stackOut_2_0 = null;
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
              if (param0 == 16866) {
                break L1;
              } else {
                hea.b(20);
                break L1;
              }
            }
            var2 = qi.a(param1, (byte) 74);
            stackOut_2_0 = new ks(var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("hea.B(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (pp) (Object) stackIn_3_0;
    }

    final static void b(int param0) {
        if (!vs.a(23864)) {
            return;
        }
        tfa.a(param0, param0 + -3, false);
    }

    public static void c(int param0) {
        field_p = null;
        field_q = null;
        field_s = null;
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Cancel";
        field_t = "Music: ";
        field_p = new du(12, 0, 1, 0);
        field_q = "Rating";
    }
}
