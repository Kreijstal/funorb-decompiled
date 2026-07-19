/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends dg {
    private int field_m;
    private bua field_p;
    static int field_n;
    static int field_o;

    final void a(iq param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ka var9 = null;
        ka var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (null != this.field_p) {
              L1: {
                var7 = -80 / ((param4 - -38) / 47);
                var9 = this.field_p.b((byte) 74);
                if (var9 == null) {
                  break L1;
                } else {
                  var8 = dfa.a(4096 + -this.field_h.g(-25787) >> 860672738, 2048, -40);
                  gqa.a(var8, -83584144, param1, param2, var9, param3);
                  break L1;
                }
              }
              if (-2 == (this.field_m ^ -1)) {
                var10 = wma.a(49, 12166, 1);
                var8 = dfa.a(4096 - this.field_h.g(-25787) >> -1302788318, 2048, 86);
                gqa.a(var8, -83584144, param1, param2, var10, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("am.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, uw param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qea var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a((byte) 52, param1, param2);
              if (param0 > 50) {
                break L1;
              } else {
                field_n = -110;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var9 = this.a(46).e(true);
                    this.field_g = var9.a(100, 0);
                    var5 = 0;
                    var7 = this.field_m;
                    if (-2 == (var7 ^ -1)) {
                      this.field_p = new bua(1, 48);
                      this.field_p.a(3, true, (byte) -109, 1);
                      var5 = var9.a(20, 0);
                      this.field_p.b(-125, var5);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    } else {
                      L6: {
                        if (2 != var7) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (0 != var7) {
                          break L7;
                        } else {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var7 == 3) {
                        break L3;
                      } else {
                        return;
                      }
                    }
                  }
                  this.field_p = new bua(1, 50);
                  this.field_p.a(3, true, (byte) 62, 2);
                  var5 = var9.a(20, 0);
                  this.field_p.b(-83, var5);
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
                this.field_p = new bua(1, 47);
                this.field_p.a(3, true, (byte) -90, 0);
                var5 = var9.a(20, 0);
                this.field_p.b(125, var5);
                if (var8 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
              L8: {
                var6 = 77;
                if (33 <= this.field_g) {
                  break L8;
                } else {
                  var6 = 77;
                  break L8;
                }
              }
              L9: {
                L10: {
                  if (-67 >= (this.field_g ^ -1)) {
                    break L10;
                  } else {
                    var6 = 78;
                    if (var8 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var6 = 79;
                break L9;
              }
              this.field_p = new bua(1, var6);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("am.V(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    public final void f(int param0) {
        super.f(param0);
        if (this.field_p != null) {
            this.field_p.a(0);
        }
    }

    final void b(int param0, byte param1) {
        this.field_m = param0;
        if (param1 != 77) {
            field_n = -49;
        }
    }

    final void a(int param0, la param1, kh param2) {
        super.a(124, param1, param2);
        if (param0 < 119) {
            this.field_m = 77;
        }
        if (-18 <= (param1.field_E ^ -1)) {
            return;
        }
        try {
            this.field_m = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "am.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, kh param1) {
        try {
            int var3_int = -114 % ((-8 - param0) / 40);
            super.a((byte) -105, param1);
            param1.a((byte) 30, this.field_m, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    am(int param0, la param1, kh param2) {
        super(param0, param1, param2);
    }

    am(int param0) {
        super(param0);
    }

    static {
    }
}
