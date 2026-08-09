/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends i {
    static ut field_G;
    static int field_I;
    static String field_H;
    static int field_J;
    static al field_F;

    final static boolean i(int param0) {
        if (param0 >= -55) {
            field_H = (String) null;
        }
        return 250 < up.field_p ? true : false;
    }

    final static boolean a(boolean param0, String param1, long param2) {
        gg var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = tr.a(param1, (byte) 40);
            if (!param0) {
              L1: {
                if (var4 == null) {
                  break L1;
                } else {
                  if (var4.field_zb == null) {
                    break L1;
                  } else {
                    stackIn_6_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                L3: {
                  if (null == uv.field_i) {
                    break L3;
                  } else {
                    if (nk.a(31253, param2) == null) {
                      break L3;
                    } else {
                      stackIn_11_0 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_11_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("nq.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static short[] a(short[] param0, ml param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var4_int = 46 % ((-4 - param3) / 47);
            var5 = param1.l(param2, 59);
            if (0 != var5) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != var5) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var5];
                break L1;
              }
              L3: {
                var6 = param1.l(4, 59);
                var7 = (short)param1.l(16, 59);
                if (var6 > 0) {
                  var8 = 0;
                  L4: while (true) {
                    if (var5 <= var8) {
                      break L3;
                    } else {
                      param0[var8] = (short)(var7 + param1.l(var6, 59));
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var5) {
                      break L3;
                    } else {
                      param0[var8] = (short)var7;
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackIn_16_0 = (short[]) (param0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("nq.E(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0;
    }

    nq(String param0) {
        super(42);
        String var2 = null;
        ut var3 = null;
        try {
            var2 = vo.a((byte) -18, gd.field_e[42], new String[]{param0});
            var3 = kb.field_E[6];
            this.a(var2, this.field_t, var3, -99, this.field_u);
            this.a(ds.a(this.field_y, 1), pg.a(false, 42), 1054928844);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "nq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, nl param2, int param3, byte param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        nl stackIn_4_0 = null;
        nl stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_11_3 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param4 > 36) {
                break L1;
              } else {
                field_G = (ut) null;
                break L1;
              }
            }
            L2: {
              var6_int = param2.f(-95);
              var7 = param2.a(true);
              stackIn_4_0 = (nl) (param2);

              if (param1 - -param0 < var7) {
                stackIn_5_0 = (nl) ((Object) stackIn_4_0);
                stackIn_5_1 = 4;
                break L2;
              } else {
                stackIn_5_0 = (nl) ((Object) stackIn_4_0);
                stackIn_5_1 = 0;
                break L2;
              }
            }
            L3: {




              if (var6_int >= param5 - param0) {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);

                stackIn_8_2 = 0;
                break L3;
              } else {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);

                stackIn_8_2 = 8;
                break L3;
              }
            }
            L4: {






              if (var6_int > param5 + param0) {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);


                stackIn_11_3 = 2;
                break L4;
              } else {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);


                stackIn_11_3 = 0;
                break L4;
              }
            }
            L5: {




              stackIn_13_2 = stackIn_8_2 | stackIn_11_3;

              if (-param0 + param1 > var7) {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);

                stackIn_14_2 = stackIn_13_2;
                stackIn_14_3 = 1;
                break L5;
              } else {
                stackIn_5_0 = (nl) ((Object) stackIn_5_0);

                stackIn_14_2 = stackIn_13_2;
                stackIn_14_3 = 0;
                break L5;
              }
            }
            L6: {
              stackIn_5_0.field_G = stackIn_5_1 | (stackIn_14_2 | stackIn_14_3);
              if (-1 != (param2.field_G ^ -1)) {
                break L6;
              } else {
                param2.a(param3, 26214);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("nq.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void b(int param0, int param1) {
        if (!(!la.a(100))) {
            return;
        }
        if (!(!uv.field_f)) {
            return;
        }
        or.field_d.b(77, (byte) 85);
        or.field_d.a(105, param0);
        ri.field_t = param1;
        uv.field_f = true;
    }

    final static void b(int param0, int param1, int param2) {
        lj.field_h = param0;
        ji.field_Hb = param2;
        if (param1 != 0) {
            nq.h(-29);
        }
    }

    public static void h(int param0) {
        if (param0 != 0) {
            field_G = (ut) null;
        }
        field_H = null;
        field_G = null;
        field_F = null;
    }

    final static int g(int param0) {
        if (param0 != 0) {
            return 9;
        }
        return tl.a(-127);
    }

    static {
        field_I = 0;
        field_H = "Experience cannot be used when a player is in an auction.";
    }
}
