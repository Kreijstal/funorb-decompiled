/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dr extends ms {
    static String field_y;
    static String field_D;
    Class[] field_u;
    String field_A;
    static int[] field_z;
    static String field_w;
    static String[] field_C;
    String field_B;
    static String field_x;
    static int[][] field_v;

    public final String toString() {
        return this.field_A;
    }

    abstract nd a(int param0, nd[] param1);

    public static void d(byte param0) {
        field_D = null;
        field_v = (int[][]) null;
        field_y = null;
        field_C = null;
        field_w = null;
        field_z = null;
        field_x = null;
        if (param0 <= 68) {
            field_w = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, nr param3) {
        try {
            if (param1 != 96) {
                nr var5 = (nr) null;
                dr.a(125, (byte) -9, 20, (nr) null);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dr.G(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, byte param1, nd[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Class var6 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!this.field_B.equals(param0)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_u.length == param2.length) {
                var4_int = -96 / ((-2 - param1) / 52);
                var5 = 0;
                L1: while (true) {
                  if (var5 >= this.field_u.length) {
                    stackIn_30_0 = 1;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    L2: {
                      if (param2[var5].field_e) {
                        L3: {
                          var6 = cq.a(param2[var5].field_c, (byte) -75);
                          if (Boolean.TYPE != var6) {
                            break L3;
                          } else {
                            if (this.field_u[var5] != Boolean.TYPE) {
                              stackIn_18_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if (Character.TYPE != var6) {
                            break L4;
                          } else {
                            if (this.field_u[var5] == Character.TYPE) {
                              break L4;
                            } else {
                              stackIn_22_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        if (!rt.a(false, var6)) {
                          break L2;
                        } else {
                          if (!rt.a(false, this.field_u[var5])) {
                            stackIn_27_0 = 0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (this.field_u[var5].isInstance(param2[var5].field_c)) {
                          break L2;
                        } else {
                          stackIn_13_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4);

            stackIn_33_1 = new StringBuilder().append("dr.E(");

            if (param0 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L5;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L6;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_27_0 != 0;
                  } else {
                    return stackIn_30_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    dr(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
            this.field_u = param1;
            this.field_B = param0;
            var7 = new StringBuilder(this.field_B).append('(');
            var8 = var7;
            for (var5 = 0; var5 < this.field_u.length; var5++) {
                discarded$18 = var7.append(hw.a(640, this.field_u[var5]));
                if (-1 + this.field_u.length > var5) {
                    discarded$19 = var8.append(", ");
                }
            }
            discarded$28 = var8.append(')');
            if (param2 != null) {
                discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            this.field_A = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "dr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        field_y = "Manoeuvres";
        field_D = "Close";
        field_w = "(+<%0>)";
        field_C = new String[]{"Showing by rating", "Showing by win percentage"};
        field_x = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_z = new int[16];
        for (var0 = 0; field_z.length > var0; var0++) {
            var1 = var0 - -1;
            field_z[var0] = Math.min(oe.c(oe.c(rn.a(var1 << -662008272, 16729482), rn.a(-2046820097, var1) << -2095792888), rn.a(var1 << 1918708674, 252)), 267583488);
            field_z[var0] = oe.c(rn.a(16515326, field_z[var0]), rn.a(32512, field_z[var0] >> -1888637087));
            var2 = gq.a(field_z[var0]);
            var2 = var2 & 655359;
            var3 = 255 & var2;
            if (!((var3 ^ -1) >= -6)) {
                var3 = 5;
            }
            var2 = -256 & var2 | var3;
            field_z[var0] = gq.b(var2);
        }
        field_v = new int[8][16];
    }
}
