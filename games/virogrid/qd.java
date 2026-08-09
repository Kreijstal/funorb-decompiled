/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    int field_j;
    int field_h;
    byte[] field_k;
    int field_a;
    byte[] field_e;
    int field_b;
    int field_n;
    int field_d;
    static ai[] field_m;
    int field_l;
    static km field_f;
    static String field_g;
    static ml field_i;
    static int field_c;

    final static String a(String param0, byte param1, String param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            var5 = param3.length();
            var6 = param2.length();
            if (0 == var5) {
              throw new IllegalArgumentException("Key cannot have zero length");
            } else {
              L1: {
                var7 = var4_int;
                var8 = var6 + -var5;
                if (-1 != (var8 ^ -1)) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param0.indexOf(param3, var9_int);
                    if ((var9_int ^ -1) <= -1) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (param1 < -37) {
                  break L3;
                } else {
                  field_i = (ml) null;
                  break L3;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param0.indexOf(param3, var10);
                if (var11 < 0) {
                  discarded$0 = var9.append(param0.substring(var10));
                  stackIn_16_0 = var9.toString();
                  break L0;
                } else {
                  discarded$1 = var9.append(param0.substring(var10, var11));
                  var10 = var5 + var11;
                  discarded$2 = var9.append(param2);
                  continue L4;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("qd.G(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        jl.field_E = param0;
        en.field_Kb = param2;
        ti.field_b = param3;
        if (param1 <= 6) {
            field_c = 49;
        }
    }

    final static void a(int param0) {
        mc.field_a = -1;
        ei.field_a = false;
        wa.field_F = 0;
        int var1 = 103 / ((param0 - 14) / 55);
        od.field_l = null;
        ge.field_b = -1;
    }

    final static eh a(boolean param0, int param1, boolean param2, int param3, byte param4) {
        if (param4 < 40) {
          qd.a((byte) -115, -62);
          return va.a(param1, false, param3, -116, param2, param0);
        } else {
          return va.a(param1, false, param3, -116, param2, param0);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_i = null;
        field_f = null;
        field_m = null;
        if (!param0) {
            field_f = (km) null;
        }
    }

    final static int a(int param0, cj param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 16903) {
                break L1;
              } else {
                field_i = (ml) null;
                break L1;
              }
            }
            L2: {
              var2_int = tm.field_n;
              if (-3 != (param1.field_n ^ -1)) {
                if ((param1.field_n ^ -1) == -5) {
                  var2_int = dm.field_w[param1.field_n];
                  break L2;
                } else {
                  if (hh.field_d == param1.field_p) {
                    var2_int = mk.field_eb[param1.field_n];
                    break L2;
                  } else {
                    var2_int = dm.field_w[param1.field_n];
                    break L2;
                  }
                }
              } else {
                if (param1.field_j) {
                  var2_int = tm.field_n;
                  break L2;
                } else {
                  L3: {
                    if (-1 != (param1.field_m ^ -1)) {
                      break L3;
                    } else {
                      if (param1.field_a != 0) {
                        break L3;
                      } else {
                        var2_int = mk.field_eb[param1.field_n];
                        break L2;
                      }
                    }
                  }
                  var2_int = dm.field_w[param1.field_n];
                  break L2;
                }
              }
            }
            stackIn_16_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("qd.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static he a(byte param0, int param1) {
        int var2 = -66 % ((param0 - 65) / 53);
        return ma.field_c == null ? null : (he) ((Object) ma.field_c.a((long)param1, (byte) 93));
    }

    static {
        int var0 = 0;
        field_m = new ai[255];
        for (var0 = 0; field_m.length > var0; var0++) {
            field_m[var0] = new ai();
        }
        field_g = "You have withdrawn your request to join.";
        field_c = 0;
    }
}
