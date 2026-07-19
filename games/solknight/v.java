/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_a;
    static mc field_g;
    private int field_e;
    private ik field_c;
    static int field_d;
    private int field_b;
    private ii field_f;

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 < -77) {
              L1: {
                if ((param2 ^ -1) > -3) {
                  break L1;
                } else {
                  if ((param2 ^ -1) < -37) {
                    break L1;
                  } else {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        if (var8 >= var7) {
                          stackOut_42_0 = var5;
                          stackIn_43_0 = stackOut_42_0;
                          break L3;
                        } else {
                          var9 = param1.charAt(var8);
                          stackOut_10_0 = var8 ^ -1;
                          stackIn_43_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                if (stackIn_11_0 == -1) {
                                  L6: {
                                    if (var9 != 45) {
                                      break L6;
                                    } else {
                                      var4_int = 1;
                                      if (var11 == 0) {
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  if (var9 != 43) {
                                    break L5;
                                  } else {
                                    if (param3) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              L7: {
                                L8: {
                                  if (var9 < 48) {
                                    break L8;
                                  } else {
                                    if (57 < var9) {
                                      break L8;
                                    } else {
                                      var9 -= 48;
                                      break L7;
                                    }
                                  }
                                }
                                L9: {
                                  if (var9 < 65) {
                                    break L9;
                                  } else {
                                    if (var9 > 90) {
                                      break L9;
                                    } else {
                                      var9 -= 55;
                                      if (var11 == 0) {
                                        break L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if (var9 < 97) {
                                    break L10;
                                  } else {
                                    if (var9 <= 122) {
                                      var9 -= 87;
                                      if (var11 == 0) {
                                        break L7;
                                      } else {
                                        var9 -= 48;
                                        break L7;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                throw new NumberFormatException();
                              }
                              if (param2 <= var9) {
                                throw new NumberFormatException();
                              } else {
                                L11: {
                                  if (var4_int != 0) {
                                    var9 = -var9;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var10 = var6 * param2 + var9;
                                if (var6 == var10 / param2) {
                                  var6 = var10;
                                  var5 = 1;
                                  break L4;
                                } else {
                                  throw new NumberFormatException();
                                }
                              }
                            }
                            var8++;
                            continue L2;
                          }
                        }
                      }
                      if (stackIn_43_0 != 0) {
                        stackOut_45_0 = var6;
                        stackIn_46_0 = stackOut_45_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    }
                  }
                }
              }
              throw new IllegalArgumentException("" + param2);
            } else {
              stackOut_2_0 = -36;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var4);
            stackOut_47_1 = new StringBuilder().append("v.E(").append(param0).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L12;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L12;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_46_0;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        pe var6 = null;
        tk var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_b >= param0) {
              this.a((byte) -6, param3);
              this.field_e = this.field_e - param0;
              L1: while (true) {
                L2: {
                  if (0 <= this.field_e) {
                    break L2;
                  } else {
                    var6 = (pe) ((Object) this.field_c.a((byte) -115));
                    this.a(var6, (byte) 126);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6_ref = new tk(param1, param0);
                this.field_f.a(-858993458, param3, var6_ref);
                this.field_c.a(-114, var6_ref);
                ((pe) ((Object) var6_ref)).field_l = 0L;
                if (param2 >= 126) {
                  break L0;
                } else {
                  this.field_f = (ii) null;
                  return;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6_ref2);
            stackOut_9_1 = new StringBuilder().append("v.B(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(pe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3_int = -7 / ((68 - param1) / 53);
            if (param0 == null) {
              break L0;
            } else {
              param0.c(10);
              param0.a(97);
              this.field_e = this.field_e + param0.field_o;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3);
            stackOut_3_1 = new StringBuilder().append("v.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 > -79) {
            field_a = (String) null;
        }
    }

    final static void a(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(param1, -2147483648);
        var2.c(8, 1);
        var2.c(-126, param0);
    }

    private final void a(byte param0, long param1) {
        int var4 = -115 / ((-83 - param0) / 41);
        pe var5 = (pe) ((Object) this.field_f.a(param1, -85));
        this.a(var5, (byte) -95);
    }

    final Object a(int param0, long param1) {
        Object var5 = null;
        tk var6 = null;
        pe var7 = null;
        var7 = (pe) ((Object) this.field_f.a(param1, param0 ^ -90));
        if (var7 != null) {
          var5 = var7.h(31476);
          if (var5 != null) {
            if (param0 == 0) {
              if (!var7.g(param0 ^ 113)) {
                this.field_c.a(-109, var7);
                var7.field_l = 0L;
                if (SolKnight.field_L) {
                  var6 = new tk(var5, var7.field_o);
                  this.field_f.a(-858993458, var7.field_g, var6);
                  this.field_c.a(param0 + -110, var6);
                  ((pe) ((Object) var6)).field_l = 0L;
                  var7.c(10);
                  var7.a(97);
                  return var5;
                } else {
                  return var5;
                }
              } else {
                var6 = new tk(var5, var7.field_o);
                this.field_f.a(-858993458, var7.field_g, var6);
                this.field_c.a(param0 + -110, var6);
                ((pe) ((Object) var6)).field_l = 0L;
                var7.c(10);
                var7.a(97);
                return var5;
              }
            } else {
              return (Object) null;
            }
          } else {
            var7.c(10);
            var7.a(97);
            this.field_e = this.field_e + var7.field_o;
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, String param1, o param2) {
        RuntimeException runtimeException = null;
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
              qk.field_n = param1;
              va.field_g = param2;
              if (param0 == -98) {
                break L1;
              } else {
                field_g = (mc) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("v.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, Object param1, long param2) {
        try {
            if (param0 < 67) {
                o var6 = (o) null;
                v.a(-25, (String) null, (o) null);
            }
            this.a(1, param1, 127, param2);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "v.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
        field_a = null;
    }
}
