/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends rb implements fb, rp {
    en field_j;
    static int[] field_g;
    static je field_i;
    static String field_f;
    static vh field_h;
    static int field_d;
    static kl field_e;

    public final void b(fn param0, int param1) {
        try {
            int var3_int = -12 / ((-80 - param1) / 33);
            this.a(127);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sb.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, gh param1) {
        if (param0 > -82) {
            return;
        }
        try {
            this.a(125);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0) {
            String var2 = (String) null;
            sb.a((String) null, (byte) -81);
        }
    }

    public sb() {
    }

    final String b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.field_j.l(97);
              var3 = this.field_j.m(-26458);
              if (param0 == -71) {
                break L1;
              } else {
                this.c(-41);
                break L1;
              }
            }
            L2: {
              var4 = this.field_j.a((byte) -77);
              var5 = ra.b(true);
              if (-1891 < (var4 ^ -1)) {
                break L2;
              } else {
                if (var4 <= var5 + -3) {
                  if (!dt.a(var4, -24375, var3, var2_int)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            stackIn_6_0 = fo.a(4800, cv.field_r, new String[]{"1890", Integer.toString(-3 + var5)});
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 1;
            break L3;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return qq.field_z;
          } else {
            return (String) ((Object) stackIn_9_0);
          }
        }
    }

    final static rn a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        rn stackIn_4_0 = null;
        rn stackIn_8_0 = null;
        rn stackIn_18_0 = null;
        rn stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = hv.field_N;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-64 > (var2_int ^ -1)) {
                stackIn_8_0 = el.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1 != -107) {
                      var6 = (String) null;
                      sb.a((String) null, (byte) -62);
                      stackIn_26_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if (ew.field_c.indexOf(var4) != -1) {
                          break L2;
                        } else {
                          stackIn_21_0 = ov.field_h;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int + -1 != var3) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_18_0 = ov.field_h;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("sb.P(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L4;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return (rn) ((Object) stackIn_26_0);
              }
            }
          }
        }
    }

    final gu c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gu stackIn_2_0 = null;
        gu stackIn_5_0 = null;
        gu stackIn_8_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_j.l(50);
            var3 = this.field_j.m(-26458);
            var4 = this.field_j.a((byte) -77);
            var5 = ra.b(true);
            if (var4 >= 1890) {
              var6 = 26 % ((param0 - 56) / 32);
              if (var4 <= -3 + var5) {
                if (dt.a(var4, -24375, var3, var2_int)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = rn.field_e;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_5_0 = rn.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = rn.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return rn.field_e;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return oo.field_g;
            } else {
              return stackIn_8_0;
            }
          }
        }
    }

    public final boolean b(int param0) {
        if (param0 <= 12) {
            field_g = (int[]) null;
        }
        return this.field_j.k(-22339);
    }

    public final void a(fn param0, int param1) {
        try {
            if (param1 != 80) {
                field_h = (vh) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sb.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
