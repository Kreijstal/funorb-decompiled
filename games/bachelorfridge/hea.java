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
        rn stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        var19 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var20 = this.field_h.a(param1 + 110, param0);
              var4 = new rn(this.field_g, new nq(var20), this.field_i);
              var5 = param0.field_z;
              var6 = param0.field_B;
              var7 = var20.field_x;
              var8 = var20.field_J;
              var9 = this.field_i;
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
                  if ((var16 ^ -1) != -3) {
                    if (var16 == 4) {
                      var14++;
                      break L3;
                    } else {
                      if ((var16 ^ -1) == -2) {
                        var15--;
                        break L3;
                      } else {
                        if (-4 == (var16 ^ -1)) {
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
                  if (var5 > var14) {
                    break L5;
                  } else {
                    var9 = 1;
                    var16 = 1;
                    break L5;
                  }
                }
                L6: {
                  if ((var15 ^ -1) > -1) {
                    var9 = 2;
                    var16 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 <= var15) {
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
                    if (var20.field_x != var7) {
                      break L8;
                    } else {
                      if (var8 == var20.field_J) {
                        stackIn_42_0 = (rn) (var4);
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
                      var4.field_o.a(new iv(new nq(var18), false, 1, 50, 0), true);
                      break L9;
                    }
                  }
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    if (var12 != var7) {
                      continue L2;
                    } else {
                      if (var8 != var13) {
                        continue L2;
                      } else {
                        var9 = ov.b(this.field_i, 60);
                        continue L2;
                      }
                    }
                  }
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
          L10: {
            var3 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3);

            stackIn_45_1 = new StringBuilder().append("hea.A(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L10;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L10;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_42_0);
    }

    final static ee a(ee param0, int[] param1, byte param2) {
        ee var3 = null;
        RuntimeException var3_ref = null;
        ee stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new ee(0, 0, 0);
              if (param2 >= 115) {
                break L1;
              } else {
                field_r = -40;
                break L1;
              }
            }
            var3.field_a = param0.field_a;
            var3.field_g = param0.field_g;
            var3.field_e = param0.field_e;
            var3.field_b = param0.field_b;
            var3.field_h = param1;
            var3.field_f = param0.field_f;
            var3.field_d = param0.field_d;
            var3.field_c = param0.field_c;
            stackIn_3_0 = (ee) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("hea.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    hea(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hea.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static pp b(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        ks stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new ks(var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("hea.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return (pp) ((Object) stackIn_3_0);
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
        if (param0 >= -86) {
            field_p = (du) null;
        }
    }

    static {
        field_s = "Cancel";
        field_t = "Music: ";
        field_p = new du(12, 0, 1, 0);
        field_q = "Rating";
    }
}
