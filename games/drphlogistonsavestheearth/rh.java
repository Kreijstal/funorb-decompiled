/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_j;
    static he[] field_l;
    static String field_k;
    static int field_e;
    static nh field_b;
    static boolean field_i;
    static int field_a;
    static he field_h;
    private gi field_g;
    static he[] field_f;
    private vd field_c;
    static String field_d;

    final gi a(byte param0) {
        gi var2 = this.field_g;
        if (!(var2 != this.field_c.field_c)) {
            this.field_g = null;
            return null;
        }
        if (param0 >= -66) {
            kc var3 = (kc) null;
            rh.a(58, (kc) null, -74);
        }
        this.field_g = var2.field_e;
        return var2;
    }

    final gi a(gi param0, byte param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -67) {
                break L1;
              } else {
                field_l = (he[]) null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = this.field_c.field_c.field_e;
                break L2;
              }
            }
            if (this.field_c.field_c == var3) {
              this.field_g = null;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_g = var3.field_e;
              stackIn_10_0 = (gi) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rh.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (gi) ((Object) stackIn_8_0);
        } else {
          return stackIn_10_0;
        }
    }

    final static void a(int param0, kc param1, int param2) {
        lh var3 = null;
        try {
            var3 = nj.field_p;
            var3.d(param2, -18392);
            var3.c(param1.field_m, (byte) -113);
            if (param0 < 53) {
                field_e = 70;
            }
            var3.c(param1.field_h, -17402);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "rh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final gi a(gi param0, int param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        gi stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -2) {
              L1: {
                if (param0 != null) {
                  var3 = param0;
                  break L1;
                } else {
                  var3 = this.field_c.field_c.field_b;
                  break L1;
                }
              }
              if (var3 != this.field_c.field_c) {
                this.field_g = var3.field_b;
                stackIn_10_0 = (gi) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_g = null;
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (gi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rh.I(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gi) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!je.a(param1.charAt(var2_int), 90)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                var4 = 113 / ((60 - param0) / 54);
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!je.a(param1.charAt(var3 - 1), 89)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var5 = -var2_int + var3;
                  if (-2 >= (var5 ^ -1)) {
                    if ((var5 ^ -1) >= -13) {
                      var6 = new StringBuilder(var5);
                      var7 = var2_int;
                      L5: while (true) {
                        if (var7 >= var3) {
                          if (var6.length() != 0) {
                            stackIn_28_0 = var6.toString();
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            stackIn_26_0 = null;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          L6: {
                            var8 = param1.charAt(var7);
                            if (!ue.a((char) var8, (byte) 78)) {
                              break L6;
                            } else {
                              var9 = lc.a(249, (char) var8);
                              if (var9 != 0) {
                                discarded$0 = var6.append((char) var9);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      stackIn_16_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("rh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_16_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (String) ((Object) stackIn_26_0);
            } else {
              return stackIn_28_0;
            }
          }
        }
    }

    final gi a(int param0) {
        gi var2 = this.field_c.field_c.field_b;
        if (!(this.field_c.field_c != var2)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_b;
        if (param0 > -71) {
            return (gi) null;
        }
        return var2;
    }

    rh(vd param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gi c(int param0) {
        gi var2 = this.field_c.field_c.field_e;
        if (!(var2 != this.field_c.field_c)) {
            this.field_g = null;
            return null;
        }
        if (param0 != -1) {
            gi var3 = (gi) null;
            this.a((gi) null, -101);
        }
        this.field_g = var2.field_e;
        return var2;
    }

    public static void b(int param0) {
        field_l = null;
        field_f = null;
        field_k = null;
        field_d = null;
        field_h = null;
        field_b = null;
        if (param0 != -2) {
            rh.b(-8);
        }
        field_j = null;
    }

    final gi b(byte param0) {
        gi var2 = this.field_g;
        if (!(var2 != this.field_c.field_c)) {
            this.field_g = null;
            return null;
        }
        if (param0 != 87) {
            field_k = (String) null;
        }
        this.field_g = var2.field_b;
        return var2;
    }

    static {
        field_k = "Quit";
        field_b = null;
    }
}
