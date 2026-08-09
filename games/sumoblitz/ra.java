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
            CharSequence var3 = (CharSequence) null;
            ra.a(-87, (CharSequence) null, 43, true);
            return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        try {
            this.field_b.a(param0 + 45, param2);
            if (param0 != 35) {
                this.a((byte) -49, true);
            }
            this.field_b.c(param1, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ra.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 > -30) {
            this.b((byte) -11);
        }
    }

    final void a(byte param0, boolean param1) {
        this.field_b.b(true, (byte) -74);
        if (param0 < 33) {
            this.a((byte) 55, 7, -88);
        }
    }

    final void b(int param0) {
        if (param0 >= -125) {
            field_e = 78;
            this.field_b.b(false, (byte) -81);
            return;
        }
        this.field_b.b(false, (byte) -81);
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != 2) {
            ra.c(-55);
            if (!(qj.field_c == null)) {
                return qj.field_c;
            }
            return (java.applet.Applet) ((Object) ke.field_a);
        }
        if (!(qj.field_c == null)) {
            return qj.field_c;
        }
        return (java.applet.Applet) ((Object) ke.field_a);
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -46) {
                break L1;
              } else {
                ra.c(-41);
                break L1;
              }
            }
            L2: {
              if (2 > param0) {
                break L2;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L2;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      stackIn_43_0 = var5;
                      decompiledRegionSelector0 = 3;
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
                                if (param3) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              var4_int = 1;
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
                            stackIn_25_0 = 0;
                            decompiledRegionSelector0 = 0;
                            break L0;
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
                            stackIn_38_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          stackIn_31_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
            stackIn_46_0 = (RuntimeException) (var4);

            stackIn_46_1 = new StringBuilder().append("ra.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L10;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_31_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              return stackIn_43_0 != 0;
            }
          }
        }
    }

    static {
        field_e = 0;
    }
}
