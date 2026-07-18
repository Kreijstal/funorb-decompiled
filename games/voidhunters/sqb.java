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

    final static tv[] a(tv[] param0, tv[] param1, int param2, dja param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        tv var6 = null;
        tv var7 = null;
        int var8 = 0;
        tv var9 = null;
        tv var10 = null;
        int var11 = 0;
        tv[] stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv[] stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
              var5_int = 0;
              L3: while (true) {
                if (param1.length <= var5_int) {
                  stackOut_28_0 = (tv[]) param0;
                  stackIn_29_0 = stackOut_28_0;
                  break L0;
                } else {
                  L4: {
                    var6 = param1[var5_int];
                    if (var6 != null) {
                      L5: {
                        var7 = param0[var5_int];
                        if (var7 == null) {
                          tv dupTemp$1 = param3.a((byte) -124);
                          param0[var5_int] = dupTemp$1;
                          var7 = dupTemp$1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var8 = 1;
                      var9 = var6;
                      var10 = var7;
                      if (var8 == 1) {
                        var9.b((byte) 124, var10);
                        break L4;
                      } else {
                        if (2 == var8) {
                          ((tva) (Object) var9).a(var10, 29106);
                          break L4;
                        } else {
                          if (var8 == 3) {
                            ((sjb) (Object) var9).a(var10, (byte) 39);
                            var5_int++;
                            break L4;
                          } else {
                            var5_int++;
                            break L4;
                          }
                        }
                      }
                    } else {
                      param0[var5_int] = null;
                      var5_int++;
                      break L4;
                    }
                  }
                  var5_int++;
                  continue L3;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var5;
            stackOut_30_1 = new StringBuilder().append("sqb.A(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L6;
            }
          }
          L7: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L7;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L7;
            }
          }
          L8: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + false + ')');
        }
        return stackIn_29_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 > 42) {
          if (param2 != 0) {
            if (param2 >= 0) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 > param0) {
                  int discarded$8 = 11105;
                  return -kq.a(-param0, param2);
                } else {
                  int discarded$9 = 11105;
                  return kq.a(param0, param2);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (param0 >= 0) {
                  int discarded$10 = 11105;
                  return -kq.a(param0, -param2) + 4096;
                } else {
                  int discarded$11 = 11105;
                  return -4096 + kq.a(-param0, -param2);
                }
              }
            }
          } else {
            if (param0 == 0) {
              return 0;
            } else {
              if (0 > param0) {
                return -2048;
              } else {
                return 2048;
              }
            }
          }
        } else {
          field_o = null;
          if (param2 != 0) {
            if (param2 >= 0) {
              if (0 == param0) {
                return 0;
              } else {
                if (0 > param0) {
                  int discarded$12 = 11105;
                  return -kq.a(-param0, param2);
                } else {
                  int discarded$13 = 11105;
                  return kq.a(param0, param2);
                }
              }
            } else {
              if (0 == param0) {
                return 4096;
              } else {
                if (param0 >= 0) {
                  int discarded$14 = 11105;
                  return -kq.a(param0, -param2) + 4096;
                } else {
                  int discarded$15 = 11105;
                  return -4096 + kq.a(-param0, -param2);
                }
              }
            }
          } else {
            if (param0 == 0) {
              return 0;
            } else {
              if (0 > param0) {
                return -2048;
              } else {
                return 2048;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        if (!param0) {
            int discarded$0 = sqb.a(2, -61, -79);
        }
    }

    sqb() {
    }

    static {
    }
}
