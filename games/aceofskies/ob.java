/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String field_f;
    private ph field_g;
    static int field_d;
    static long[] field_c;
    static int field_e;
    private gk field_a;
    private gk field_h;
    private ph field_b;

    final al a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        al stackIn_3_0 = null;
        al stackIn_6_0 = null;
        al stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 == this.field_a.a((byte) 127)) {
              stackIn_3_0 = this.a(0, param0, param1, 1452176260);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((this.field_a.b(param0, param2 + 28004) ^ -1) != -2) {
                if (param2 == -92) {
                  throw new RuntimeException();
                } else {
                  stackIn_9_0 = (al) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param0, 0, param1, 1452176260);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ob.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_e = 125;
            field_c = null;
            return;
        }
        field_c = null;
    }

    private final al a(int param0, int param1, int[] param2, int param3) {
        al stackIn_2_0 = null;
        al stackIn_6_0 = null;
        al stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        al var8 = null;
        t var9 = null;
        try {
          L0: {
            var5_int = param1 ^ ((param0 & -268431361) << 1452176260 | param0 >>> 1538666732);
            var5_int = var5_int | param0 << 900436400;
            if (param3 == 1452176260) {
              var6 = 4294967296L ^ (long)var5_int;
              var8 = (al) ((Object) this.field_b.a((byte) 106, var6));
              if (var8 != null) {
                stackIn_6_0 = (al) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (-1 > (param2[0] ^ -1)) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                L2: {
                  var9 = (t) ((Object) this.field_g.a((byte) 106, var6));
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = t.a(this.field_a, param0, param1);
                    if (var9 != null) {
                      this.field_g.a(-105, var6, var9);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param2);
                if (var8 != null) {
                  var9.c(-125);
                  this.field_b.a(124, var6, var8);
                  stackIn_20_0 = (al) (var8);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              }
            } else {
              stackIn_2_0 = (al) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("ob.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_20_0;
          }
        }
    }

    final static String a(String param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!rr.field_b.startsWith("win")) {
              if (!rr.field_b.startsWith("linux")) {
                if (!rr.field_b.startsWith("mac")) {
                  if (param1 != -18) {
                    stackIn_12_0 = (String) null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  stackIn_8_0 = "lib" + param0 + ".dylib";
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = "lib" + param0 + ".so";
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = param0 + ".dll";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ob.C(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L1;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    private final al a(int param0, int[] param1, int param2, int param3) {
        al discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        al var8 = null;
        bj var9 = null;
        int[] var10 = null;
        al var11 = null;
        al stackIn_5_0 = null;
        al stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = (param2 >>> -1019373908 | (param2 & -805302273) << 155976932) ^ param0;
              var5_int = var5_int | param2 << 2137337232;
              var6 = (long)var5_int;
              if (param3 <= -37) {
                break L1;
              } else {
                var10 = (int[]) null;
                discarded$1 = this.a(-58, -101, (int[]) null, -98);
                break L1;
              }
            }
            var8 = (al) ((Object) this.field_b.a((byte) 106, var6));
            if (var8 != null) {
              stackIn_5_0 = (al) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  if ((param1[0] ^ -1) < -1) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var9 = bj.a(this.field_h, param2, param0);
              if (var9 != null) {
                L3: {
                  var11 = var9.a();
                  var8 = var11;
                  this.field_b.a(105, var6, var8);
                  if (param1 == null) {
                    break L3;
                  } else {
                    param1[0] = param1[0] - var11.field_g.length;
                    break L3;
                  }
                }
                stackIn_16_0 = (al) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("ob.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_16_0;
        }
    }

    final al a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        al stackIn_2_0 = null;
        al stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h.a((byte) 113) != 1) {
              L1: {
                if (param2 > 96) {
                  break L1;
                } else {
                  field_f = (String) null;
                  break L1;
                }
              }
              if (this.field_h.b(param1, 27912) == 1) {
                stackIn_8_0 = this.a(0, param0, param1, -58);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            } else {
              stackIn_2_0 = this.a(param1, param0, 0, -58);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ob.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_8_0;
        }
    }

    ob(gk param0, gk param1) {
        this.field_g = new ph(256);
        this.field_b = new ph(256);
        try {
            this.field_h = param0;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new long[32];
        field_f = "Name";
    }
}
