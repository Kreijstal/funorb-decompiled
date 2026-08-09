/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends vf {
    private int field_y;
    private int field_w;
    static String field_v;
    private int field_x;
    private nf[] field_u;

    public static void c(int param0) {
        field_v = null;
        if (param0 >= -67) {
            field_v = (String) null;
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var4 = hh.a(0, param2);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if ((var4.length() ^ -1) > -2) {
                          break L2;
                        } else {
                          L3: {
                            if (bg.a(175, var4.charAt(0))) {
                              break L3;
                            } else {
                              if (bg.a(param0 ^ 175, var4.charAt(var4.length() - 1))) {
                                break L3;
                              } else {
                                var5 = 0;
                                var6 = param0;
                                L4: while (true) {
                                  if (var6 >= param2.length()) {
                                    if (-1 > (var5 ^ -1)) {
                                      stackIn_34_0 = 0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param2.charAt(var6);
                                      if (!bg.a(param0 ^ 175, (char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    L6: {
                                      if ((var5 ^ -1) > -3) {
                                        break L6;
                                      } else {
                                        if (!param1) {
                                          stackIn_29_0 = 0;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L4;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_19_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("je.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L7;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L7;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  return stackIn_34_0 != 0;
                }
              }
            }
          }
        }
    }

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -97) {
                break L1;
              } else {
                var9 = (CharSequence) null;
                je.a(126, true, (CharSequence) null);
                break L1;
              }
            }
            L2: {
              if (!param3.field_w) {
                if (param3.e((byte) -18)) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param3 instanceof rg) {
                param2 = param2 & ((rg) ((Object) param3)).field_L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                if (var6_int != 0) {
                  stackIn_16_0 = this.field_x;
                  break L4;
                } else {
                  stackIn_16_0 = this.field_y;
                  break L4;
                }
              } else {
                stackIn_16_0 = this.field_w;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              if (param2) {
                stackIn_19_0 = 16777215;
                break L5;
              } else {
                stackIn_19_0 = 7105644;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            qj.a(this.field_u, param3.field_m + param4 - -(param3.field_z - this.field_u[0].field_x >> 622441121), param3.field_F, 55, param1 - -param3.field_q, var7);
            this.field_a.a(param3.field_B, param1 - -param3.field_q, param4 + param3.field_m - 2, param3.field_F, param3.field_z, var8, -1, 1, 1, this.field_a.field_C);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("je.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
    }

    public je() {
        this(2188450, 2591221, 9543);
    }

    private je(int param0, int param1, int param2) {
        this.field_w = param2;
        this.field_x = param1;
        this.field_u = em.field_d;
        this.field_y = param0;
        this.field_a = fd.field_k;
    }

    static {
    }
}
