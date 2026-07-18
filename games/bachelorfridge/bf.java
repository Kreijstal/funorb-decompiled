/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bf extends bw {
    static lw[] field_h;
    static hw[] field_g;
    static boolean field_f;

    abstract void a(op param0, int param1);

    bf() {
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == -44) {
                break L1;
              } else {
                var12 = null;
                boolean discarded$1 = bf.a(118, -16, false, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (param0 < 2) {
                break L2;
              } else {
                if (36 >= param0) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackOut_44_0 = var5;
                      stackIn_45_0 = stackOut_44_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 == 0) {
                            if (45 != var9) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  var8++;
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              var8++;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 < var9) {
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
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackOut_25_0 = 0;
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0 != 0;
                        }
                        if (param0 <= var9) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0 != 0;
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = param0 * var6 - -var9;
                          if (var6 != var10 / param0) {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0 != 0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var4;
            stackOut_46_1 = new StringBuilder().append("bf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
        return stackIn_45_0 != 0;
    }

    final static void a(int param0, boolean param1, byte param2) {
        ik var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        nea var3 = hj.b(0, param0, param1);
        int var4 = 3;
        if (var3 != null) {
            ms.field_u.a(117, false);
            var5 = ms.field_u;
            var6_ref_String = cd.field_p;
            var5.field_a.a(var6_ref_String, true, 5);
            var5 = ms.field_u;
            var6 = nfa.field_a;
            var7 = jc.field_r;
            var5.field_a.a(0, false, var6, 0, var7);
        }
        wb.a(param1, param0, -115);
    }

    public static void c(byte param0) {
        int var1 = 105;
        field_g = null;
        field_h = null;
    }

    abstract void a(int param0, lu param1);

    static {
    }
}
