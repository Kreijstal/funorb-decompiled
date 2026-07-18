/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends cda {
    private int field_w;

    final void d(int param0) {
        if (param0 != -1) {
            ((nq) this).field_w = 86;
        }
    }

    nq(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, la param1, kh param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(124, param1, param2);
              ((nq) this).field_w = param2.b((byte) 44, 4);
              if (param0 >= 119) {
                break L1;
              } else {
                var5 = null;
                ((nq) this).a((byte) -7, (kh) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nq.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 44, param1);
            int var3_int = 113 / ((param0 - -8) / 40);
            param1.a((byte) -44, ((nq) this).field_w, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          var2 = ((nq) this).field_w;
          if (var2 != 2) {
            if (3 != var2) {
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 == 4) {
                    return 6;
                  } else {
                    return -1;
                  }
                } else {
                  return 6;
                }
              } else {
                return 7;
              }
            } else {
              return 7;
            }
          } else {
            return 7;
          }
        } else {
          ((nq) this).field_w = 111;
          var2 = ((nq) this).field_w;
          if (var2 != 2) {
            if (3 != var2) {
              if (var2 != 0) {
                if (var2 != 1) {
                  if (var2 == 4) {
                    return 6;
                  } else {
                    return -1;
                  }
                } else {
                  return 6;
                }
              } else {
                return 7;
              }
            } else {
              return 7;
            }
          } else {
            return 7;
          }
        }
    }

    final void b(int param0, int param1) {
        ((nq) this).field_w = param1;
        if (param0 != 8022) {
            ((nq) this).field_w = 97;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    nq(int param0) {
        super(param0);
    }

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = null;
              var7 = dfa.a(4096 + -((nq) this).field_h.g(-25787) >> 2, 2048, 91);
              var8 = ((nq) this).field_w;
              if (var8 == 0) {
                var6 = (Object) (Object) df.field_J[0];
                break L1;
              } else {
                if (var8 != 1) {
                  if (var8 != 4) {
                    if (var8 == 2) {
                      var6 = (Object) (Object) df.field_J[2];
                      break L1;
                    } else {
                      if (var8 != 3) {
                        break L1;
                      } else {
                        param3 = param3 + 2097152;
                        var6 = (Object) (Object) df.field_J[3];
                        break L1;
                      }
                    }
                  } else {
                    var6 = (Object) (Object) df.field_J[109];
                    break L1;
                  }
                } else {
                  var6 = (Object) (Object) df.field_J[1];
                  break L1;
                }
              }
            }
            var8 = 6 / ((param4 - -38) / 47);
            if (var6 == null) {
              return;
            } else {
              gqa.a(var7, -83584144, param1, param2, (ka) var6, param3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var6;
            stackOut_19_1 = new StringBuilder().append("nq.D(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
