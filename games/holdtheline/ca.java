/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends ln {
    static int field_s;
    static gn field_p;
    boolean field_q;
    static int field_r;
    static String field_o;
    volatile boolean field_u;
    boolean field_t;

    final static String[] a(byte param0, char param1, String param2) {
        int incrementValue$1 = 0;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        int var8 = 0;
        String[] var9 = null;
        int var10 = 0;
        String[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var9 = fl.a(param2, (byte) -120, param1);
            var3 = var9;
            var6 = -65 % ((param0 - -68) / 35);
            var5 = 0;
            var4 = 0;
            L1: while (true) {
              if (var9.length <= var4) {
                var7 = new String[var5];
                var5 = 0;
                var10 = 0;
                var4 = var10;
                L2: while (true) {
                  if (var10 >= var9.length) {
                    stackIn_14_0 = (String[]) (var7);
                    break L0;
                  } else {
                    L3: {
                      if (0 < var9[var10].trim().length()) {
                        incrementValue$1 = var5;
                        var5++;
                        var7[incrementValue$1] = var9[var10].trim();
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var10++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (0 < var9[var4].trim().length()) {
                    var5++;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("ca.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void h(int param0) {
        L0: {
          if (null != ec.field_D) {
            L1: {
              if (lc.field_d == null) {
                break L1;
              } else {
                if (!ai.field_a.a(-54, lc.field_d)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            gn.a(true, ec.field_D, (byte) 69, 30);
            ec.field_D = null;
            lc.field_d = null;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == -11875) {
            break L2;
          } else {
            field_s = -14;
            break L2;
          }
        }
        sf.a(-1379);
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != -1010) {
            return;
        }
        field_p = null;
    }

    abstract int g(int param0);

    abstract byte[] i(int param0);

    final static boolean a(qm param0, int param1, qm param2, int param3, in param4, int param5, int param6) {
        RuntimeException var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        in var10 = null;
        in var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11 = new in(param2, param0);
            var8 = param4.a(var11, (byte) -10);
            if ((float)(-(param3 + param5)) <= var8) {
              if ((float)(param5 + param3) >= var8) {
                L1: {
                  var9 = param4.a(var11, true);
                  if (param6 >= 61) {
                    break L1;
                  } else {
                    var10 = (in) null;
                    ca.a((qm) null, -92, (qm) null, -119, (in) null, 62, -87);
                    break L1;
                  }
                }
                if (var9 < (float)(-(param3 + param1))) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var9 > (float)(param3 + param1)) {
                    stackIn_15_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var7);

            stackIn_18_1 = new StringBuilder().append("ca.I(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_15_0 != 0;
            }
          }
        }
    }

    final static nd a(String[] args, byte param1) {
        nd var2 = null;
        RuntimeException var2_ref = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new nd(false);
              var2.field_j = args;
              if (param1 > 87) {
                break L1;
              } else {
                field_p = (gn) null;
                break L1;
              }
            }
            stackIn_3_0 = (nd) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("ca.H(");

            if (args == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    ca() {
        this.field_u = true;
    }

    static {
        field_o = "Main Menu";
    }
}
