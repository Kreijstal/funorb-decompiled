/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static bu field_c;
    static String field_f;
    static String field_e;
    static ut field_g;
    static String field_b;
    static boolean field_d;
    private String field_a;

    final boolean a(String param0, int param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -49) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                vl.a(56, true, true, (CharSequence) null);
                break L1;
              }
            }
            stackIn_3_0 = this.field_a.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vl.E(");

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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, boolean param2, CharSequence param3) {
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
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
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1) > -3) {
                break L1;
              } else {
                if ((param0 ^ -1) < -37) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    if (param2) {
                      break L2;
                    } else {
                      field_d = false;
                      break L2;
                    }
                  }
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackIn_42_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (0 != var8) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param1) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
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
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (90 >= var9) {
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
                          stackIn_27_0 = 0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (var9 >= param0) {
                          stackIn_33_0 = 0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var10 / param0 == var6) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            stackIn_38_0 = 0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
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
          L11: {
            var4 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var4);

            stackIn_45_1 = new StringBuilder().append("vl.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L11;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L11;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_27_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_33_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_38_0 != 0;
            } else {
              return stackIn_42_0 != 0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 111) {
            vl.a(-36, -71, -68, 100, 65);
        }
        field_g = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        try {
            tj.a(this.field_a, param1, (byte) -5, 31536000L, "jagex-last-login-method");
            if (param0 > -110) {
                vl.a(78, 31, 85, 37, 61);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "vl.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(nu param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var2_int = param0.field_V.a(true);
            var3 = param0.field_V.c(879306160);
            if (param1 >= -39) {
                vl.a(127);
            }
            var4 = var2_int - 448;
            var5 = -672 + var3;
            var6 = var4 * var4 + var5 * var5;
            if (-202501 > (var6 ^ -1)) {
                var7 = de.a(var6, (byte) -118);
                var3 = 450 * var5 / var7 + 672;
                var2_int = 448 - -(var4 * 450 / var7);
            }
            ql.field_a[1] = var3;
            ql.field_a[0] = var2_int;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "vl.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ut a(int param0, int param1, boolean param2, int param3) {
        int var4 = (param1 << 1599722241) + 1;
        ut var5 = new ut(var4, var4);
        iw.a(56, var5);
        on.d(param1, param1, param1, param3);
        on.d(param1, param1, param1 - param0, 0);
        ta.e(120);
        if (!param2) {
            vl.a(8);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param2, -109, param1, param3 / param0, param3 % 3);
        on.a(param2, param1, 156, 225, 10, 16777215, param4);
        ta.e(126);
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            vl.a(12, -70, true, -119);
            break L0;
          }
        }
        L1: {
          L2: {
            if (fp.field_e != -1) {
              break L2;
            } else {
              if (-11 >= (nq.g(0) ^ -1)) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    vl(String param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "vl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            vl.a(-68, -48, 74, 38, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!il.b((byte) 100)) {
              break L2;
            } else {
              if (!c.field_g) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_f = "Offensive account name";
        field_d = true;
        field_b = "-";
    }
}
