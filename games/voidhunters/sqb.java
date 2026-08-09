/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sqb extends fh {
    int field_p;
    static phb[] field_o;
    int field_l;
    int field_n;
    int field_q;
    int field_k;
    int field_m;

    final static tv[] a(tv[] param0, tv[] param1, int param2, dja param3, boolean param4) {
        tv dupTemp$0 = null;
        tv[] stackIn_10_0 = null;
        tv[] stackIn_28_0 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        tv var6 = null;
        tv var7 = null;
        int var8 = 0;
        tv var9 = null;
        tv var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (param0.length != param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = param3.a(11995, param1.length);
                break L1;
              }
              if (!param4) {
                var5_int = 0;
                L3: while (true) {
                  if (param1.length <= var5_int) {
                    stackIn_28_0 = (tv[]) (param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var6 = param1[var5_int];
                      if (var6 != null) {
                        L5: {
                          var7 = param0[var5_int];
                          if (var7 == null) {
                            dupTemp$0 = param3.a((byte) -124);
                            param0[var5_int] = dupTemp$0;
                            var7 = dupTemp$0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var8 = param2;
                        var9 = var6;
                        var10 = var7;
                        if (var8 == 1) {
                          var9.b((byte) 124, var10);
                          break L4;
                        } else {
                          if (2 == var8) {
                            ((tva) ((Object) var9)).a(var10, 29106);
                            break L4;
                          } else {
                            if ((var8 ^ -1) == -4) {
                              ((sjb) ((Object) var9)).a(var10, (byte) 39);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        param0[var5_int] = null;
                        break L4;
                      }
                    }
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                stackIn_10_0 = (tv[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("sqb.A(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L7;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), stackIn_38_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_28_0;
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 > 42) {
          if (param2 != 0) {
            if ((param2 ^ -1) <= -1) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 <= param0) {
                  return kq.a(param0, param2, 11105);
                } else {
                  return -kq.a(-param0, param2, 11105);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (-1 < (param0 ^ -1)) {
                  return -4096 + kq.a(-param0, -param2, 11105);
                } else {
                  return -kq.a(param0, -param2, 11105) + 4096;
                }
              }
            }
          } else {
            if (-1 != (param0 ^ -1)) {
              if (0 <= param0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        } else {
          field_o = (phb[]) null;
          if (param2 != 0) {
            if ((param2 ^ -1) <= -1) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 <= param0) {
                  return kq.a(param0, param2, 11105);
                } else {
                  return -kq.a(-param0, param2, 11105);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (-1 < (param0 ^ -1)) {
                  return -4096 + kq.a(-param0, -param2, 11105);
                } else {
                  return -kq.a(param0, -param2, 11105) + 4096;
                }
              }
            }
          } else {
            if (-1 != (param0 ^ -1)) {
              if (0 <= param0) {
                return 2048;
              } else {
                return -2048;
              }
            } else {
              return 0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            sqb.a(2, -61, -79);
        }
    }

    sqb() {
    }

    static {
    }
}
