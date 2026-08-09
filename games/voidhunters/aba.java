/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aba {
    static dja field_b;
    static aw field_a;

    final static void a(lbb param0, wm[] param1, lta param2, int param3, byte param4, int param5, rsb param6) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        wm var9 = null;
        int var11 = 0;
        anb var12 = null;
        int var13 = 0;
        iia var14 = null;
        vp var15 = null;
        Object var16 = null;
        anb var17 = null;
        cq var18 = null;
        anb var19 = null;
        anb var20 = null;
        cc var21 = null;
        var16 = null;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            var7_int = 43 / ((param4 - -6) / 39);
            var8 = 0;
            L1: while (true) {
              if (param1.length <= var8) {
                break L0;
              } else {
                L2: {
                  var9 = param1[var8];
                  if (!(var9 instanceof iia)) {
                    if (var9 instanceof cc) {
                      var21 = (cc) ((Object) var9);
                      var11 = var21.a((byte) -123, 0);
                      var20 = param6.field_g.d((byte) -27, var11);
                      var12 = var20;
                      if (var20 == null) {
                        break L2;
                      } else {
                        if (param3 == param5) {
                          uba.a((byte) -100, 0, var20);
                          break L2;
                        } else {
                          uba.a((byte) -100, 1, var20);
                          break L2;
                        }
                      }
                    } else {
                      if (!(var9 instanceof vp)) {
                        break L2;
                      } else {
                        var15 = (vp) ((Object) var9);
                        var11 = var15.a((byte) -106, 1);
                        var19 = param6.field_g.g((byte) 118, var11);
                        var12 = var19;
                        if (var19 == null) {
                          break L2;
                        } else {
                          if (param3 != param5) {
                            uba.a((byte) -100, 1, var19);
                            break L2;
                          } else {
                            uba.a((byte) -100, 3, var19);
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    L3: {
                      var14 = (iia) ((Object) var9);
                      if (param3 == param5) {
                        var11 = var14.a((byte) -122, 0);
                        var17 = param6.field_g.d((byte) -27, var11);
                        if (var17 != null) {
                          uba.a((byte) -100, 2, var17);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var11 = var14.a((byte) -124, 1);
                    var18 = param6.field_g.e((byte) -79, var11);
                    if (var18 == null) {
                      break L2;
                    } else {
                      if (param0.e(8) == 3) {
                        var18.a(32, qpb.a(false, param3, 13894143), param2);
                        break L2;
                      } else {
                        if (param5 == param3) {
                          uba.a((byte) -100, 2, var18);
                          var18.a(32, qpb.a(false, param3, 13894143), param2);
                          break L2;
                        } else {
                          var18.a(32, qpb.a(false, param3, 13894143), param2);
                          break L2;
                        }
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var7);

            stackIn_31_1 = new StringBuilder().append("aba.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L4;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), stackIn_41_2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        rsb var2;
        field_a = null;
        if (param0 != -3696) {
          var2 = (rsb) null;
          aba.a((lbb) null, (wm[]) null, (lta) null, -51, (byte) -22, -26, (rsb) null);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new byte[param1];
              var3 = var4;
              if (param2 == -28321) {
                break L1;
              } else {
                field_b = (dja) null;
                break L1;
              }
            }
            cua.a(param0, 0, var4, 0, param1);
            stackIn_3_0 = (byte[]) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("aba.C(");

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
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_b = (dja) ((Object) new beb());
    }
}
