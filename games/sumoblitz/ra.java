/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends bq {
    static int field_f;
    static int field_e;

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 39) {
            field_e = -61;
        }
    }

    ra(fr param0) {
        super(param0);
    }

    final boolean b(byte param0) {
        if (param0 > -64) {
            int discarded$0 = 1;
            boolean discarded$1 = ra.a(-87, (CharSequence) null, 43);
            return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        try {
            ((ra) this).field_b.a(param0 + 45, param2);
            if (param0 != 35) {
                ((ra) this).a((byte) -49, true);
            }
            ((ra) this).field_b.c(param1, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ra.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
            boolean discarded$0 = ((ra) this).b((byte) -11);
        }
    }

    final void a(byte param0, boolean param1) {
        ((ra) this).field_b.b(true, (byte) -74);
        if (param0 < 33) {
            ((ra) this).a((byte) 55, 7, -88);
        }
    }

    final void b(int param0) {
        if (param0 >= -125) {
            field_e = 78;
            ((ra) this).field_b.b(false, (byte) -81);
            return;
        }
        ((ra) this).field_b.b(false, (byte) -81);
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != 2) {
            java.applet.Applet discarded$6 = ra.c(-55);
            if (!(qj.field_c == null)) {
                return qj.field_c;
            }
            return (java.applet.Applet) (Object) ke.field_a;
        }
        if (!(qj.field_c == null)) {
            return qj.field_c;
        }
        return (java.applet.Applet) (Object) ke.field_a;
    }

    final static boolean a(int param0, CharSequence param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -46) {
                break L1;
              } else {
                java.applet.Applet discarded$1 = ra.c(-41);
                break L1;
              }
            }
            L2: {
              if (2 > param0) {
                break L2;
              } else {
                if (param0 > 36) {
                  break L2;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackOut_42_0 = var5;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var4_int = 1;
                              var8++;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
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
                          if (var9 < 97) {
                            stackOut_22_0 = 0;
                            stackIn_23_0 = stackOut_22_0;
                            return stackIn_23_0 != 0;
                          } else {
                            if (122 >= var9) {
                              var9 -= 87;
                              break L6;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (var9 < param0) {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var6 * param0 + var9;
                          if (var10 / param0 != var6) {
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            return stackIn_36_0 != 0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            var8++;
                            break L4;
                          }
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0 != 0;
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("ra.C(").append(param0).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param2 + 44 + 1 + 41);
        }
        return stackIn_43_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
