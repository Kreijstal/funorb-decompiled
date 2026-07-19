/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    private rf[] field_c;
    static String field_e;
    static qm field_d;
    static em field_a;
    static String field_b;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        sb var4 = null;
        var3 = param0 + -1 & param2 >> -1286094081;
        if (param1 < 76) {
          var4 = (sb) null;
          oi.a(106, 18, (sb) null);
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        } else {
          return var3 + (param2 - -(param2 >>> -520357569)) % param0;
        }
    }

    private final void a(byte param0) {
        rf[] var2 = null;
        int var3 = 0;
        rf var4 = null;
        int var5 = 0;
        rf[] var6 = null;
        var5 = client.field_A ? 1 : 0;
        var6 = new rf[this.field_c.length * 2];
        var2 = var6;
        if (param0 > 103) {
          var3 = 0;
          L0: while (true) {
            if (this.field_c.length > var3) {
              var4 = this.field_c[var3];
              if (var5 == 0) {
                L1: {
                  if (var4 != null) {
                    var6 = var2;
                    var2[var4.field_j % var6.length] = var4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3++;
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_c = var2;
              return;
            }
          }
        } else {
          return;
        }
    }

    final rf a(boolean param0, boolean param1, uf param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        rf var5 = null;
        int var6 = 0;
        int var7 = 0;
        rf var8 = null;
        rf stackIn_9_0 = null;
        rf stackIn_13_0 = null;
        rf stackIn_17_0 = null;
        rf stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_8_0 = null;
        rf stackOut_12_0 = null;
        rf stackOut_16_0 = null;
        rf stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_a = (em) null;
                break L1;
              }
            }
            L2: {
              var4_int = param2.a(118);
              var8 = this.field_c[var4_int % this.field_c.length];
              var5 = var8;
              if (var5 == null) {
                break L2;
              } else {
                if (var4_int != var8.field_j) {
                  break L2;
                } else {
                  L3: {
                    if (!param1) {
                      this.field_c[var4_int % this.field_c.length] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_8_0 = (rf) (var5);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L4: while (true) {
              L5: {
                L6: {
                  if (!param1) {
                    break L6;
                  } else {
                    stackOut_12_0 = this.field_c[var4_int % this.field_c.length];
                    stackIn_17_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var7 != 0) {
                      break L5;
                    } else {
                      if (stackIn_13_0 == null) {
                        break L6;
                      } else {
                        this.a((byte) 115);
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                var5 = new rf(var4_int);
                var5.field_b = param2.d((byte) -102);
                var5.field_n = param2.d((byte) -79);
                stackOut_16_0 = (rf) (var5);
                stackIn_17_0 = stackOut_16_0;
                break L5;
              }
              stackIn_17_0.field_c = new byte[var5.field_b * var5.field_n];
              param2.j((byte) -108);
              var6 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var5.field_c.length <= var6) {
                      break L9;
                    } else {
                      var5.field_c[var6] = (byte)param2.a(5, (byte) 75);
                      var6++;
                      if (var7 != 0) {
                        break L8;
                      } else {
                        if (var7 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  param2.k((byte) -128);
                  break L8;
                }
                L10: {
                  if (param1) {
                    this.field_c[var4_int % this.field_c.length] = var5;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                stackOut_26_0 = (rf) (var5);
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("oi.F(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_27_0;
        }
    }

    final rf a(boolean param0, int param1) {
        rf var3 = null;
        rf var4 = null;
        if (!param0) {
          var3 = this.field_c[param1 % this.field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        } else {
          var4 = (rf) null;
          this.a((rf) null, (byte) -73);
          var3 = this.field_c[param1 % this.field_c.length];
          if (var3 != null) {
            if (var3.field_j != param1) {
              return null;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    final void a(rf param0, byte param1) {
        int var3_int = param0.field_j;
        if (param0 != this.field_c[var3_int % this.field_c.length]) {
            throw new IllegalArgumentException();
        }
        if (param1 < 24) {
            return;
        }
        try {
            this.field_c[var3_int % this.field_c.length] = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    oi(int param0) {
        this.field_c = new rf[param0];
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_e = null;
        if (param0 == 2) {
            return;
        }
        field_e = (String) null;
    }

    final void a(rf param0, int param1) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0.field_j;
              if (this.field_c[var3_int % this.field_c.length] == null) {
                break L1;
              } else {
                if (param0.field_j != this.field_c[var3_int % this.field_c.length].field_j) {
                  break L1;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (null == this.field_c[var3_int % this.field_c.length]) {
                    break L4;
                  } else {
                    this.a((byte) 116);
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (param1 == 0) {
                    break L5;
                  } else {
                    discarded$2 = oi.a(93, 98, -46);
                    break L5;
                  }
                }
                this.field_c[var3_int % this.field_c.length] = param0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("oi.G(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, sb param2) {
        uf var3 = null;
        int discarded$0 = 0;
        try {
            var3 = we.field_b;
            var3.f(param1, -4);
            var3.a(true, 2);
            var3.a(true, 0);
            if (param0 > -57) {
                discarded$0 = oi.a(-93, 111, -125);
            }
            var3.a(true, param2.field_r);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "oi.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Winner!";
        field_d = new qm(7, 0, 1, 1);
        field_b = "Drawn";
    }
}
