/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends cda {
    private int field_w;

    final void d(int param0) {
        if (param0 != -1) {
            this.field_w = 86;
        }
    }

    nq(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, la param1, kh param2) {
        try {
            super.a(124, param1, param2);
            this.field_w = param2.b((byte) 44, 4);
            if (param0 < 119) {
                kh var5 = (kh) null;
                this.a((byte) -7, (kh) null);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nq.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            super.a((byte) 44, param1);
            int var3_int = 113 / ((param0 - -8) / 40);
            param1.a((byte) -44, this.field_w, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nq.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(byte param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 == -99) {
          var2 = this.field_w;
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
          this.field_w = 111;
          var2 = this.field_w;
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
        this.field_w = param1;
        if (param0 != 8022) {
            this.field_w = 97;
        }
    }

    final void a(gr param0, gma param1, byte param2) {
        try {
            super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nq.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var6 = null;
              var7 = dfa.a(4096 + -this.field_h.g(-25787) >> 802944994, 2048, 91);
              var8 = this.field_w;
              if (var8 == 0) {
                var6 = df.field_J[0];
                break L1;
              } else {
                if ((var8 ^ -1) != -2) {
                  if (var8 != 4) {
                    if (var8 == 2) {
                      var6 = df.field_J[2];
                      break L1;
                    } else {
                      if (var8 != 3) {
                        break L1;
                      } else {
                        param3 = param3 + 2097152;
                        var6 = df.field_J[3];
                        break L1;
                      }
                    }
                  } else {
                    var6 = df.field_J[109];
                    break L1;
                  }
                } else {
                  var6 = df.field_J[1];
                  break L1;
                }
              }
            }
            var8 = 6 / ((param4 - -38) / 47);
            if (var6 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              gqa.a(var7, -83584144, param1, param2, (ka) (var6), param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_21_0 = var6;

            stackIn_21_1 = new StringBuilder().append("nq.D(");

            if (param0 == null) {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = stackIn_21_0;
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
