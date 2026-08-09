/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static byte[][] field_e;
    private dj field_g;
    static String field_a;
    static byte[][] field_f;
    private dl field_c;
    private dj field_b;
    static boolean[] field_h;
    private dl field_d;

    private final gi a(int param0, int param1, int[] param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        ml var9 = null;
        gi var10 = null;
        gi stackIn_5_0 = null;
        gi stackIn_16_0 = null;
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
              if (param3) {
                break L1;
              } else {
                field_e = (byte[][]) null;
                break L1;
              }
            }
            var5_int = param1 ^ ((268439551 & param0) << 1856253636 | param0 >>> -436098324);
            var5_int = var5_int | param0 << -682493520;
            var6 = (long)var5_int;
            var8 = (gi) ((Object) this.field_d.a(var6, 75));
            if (var8 != null) {
              stackIn_5_0 = (gi) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param2 == null) {
                  break L2;
                } else {
                  if (-1 > (param2[0] ^ -1)) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var9 = ml.a(this.field_g, param0, param1);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_d.a(-99, var6, var8);
                  if (param2 == null) {
                    break L3;
                  } else {
                    param2[0] = param2[0] - var10.field_l.length;
                    break L3;
                  }
                }
                stackIn_16_0 = (gi) (var8);
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

            stackIn_19_1 = new StringBuilder().append("ka.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_16_0;
        }
    }

    final gi a(int param0, boolean param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        gi stackIn_3_0 = null;
        gi stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 == this.field_g.d(-1)) {
              stackIn_3_0 = this.a(0, param0, param2, true);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  var5 = (int[]) null;
                  this.a(-25, (int[]) null, -10);
                  break L1;
                }
              }
              if (-2 != (this.field_g.a((byte) 105, param0) ^ -1)) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(param0, 0, param2, true);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ka.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    public static void a(byte param0) {
        field_f = (byte[][]) null;
        field_a = null;
        field_h = null;
        if (param0 <= 14) {
            return;
        }
        field_e = (byte[][]) null;
    }

    final gi a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        gi stackIn_3_0 = null;
        gi stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_b.d(param0 ^ -1856253637) ^ -1) == -2) {
              stackIn_3_0 = this.a(param2, param1, 0, 117);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 1856253636) {
                  break L1;
                } else {
                  this.field_d = (dl) null;
                  break L1;
                }
              }
              if (this.field_b.a((byte) 82, param2) == 1) {
                stackIn_9_0 = this.a(0, param1, param2, 113);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ka.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_9_0;
        }
    }

    private final gi a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        gi var8 = null;
        mb var9 = null;
        gi stackIn_2_0 = null;
        gi stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        gi stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param2 >>> 2000147436 | param2 << -1890624124 & 65531);
            var5_int = var5_int | param2 << -871989392;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (gi) ((Object) this.field_d.a(var6, 58));
            if (param3 >= 95) {
              if (var8 == null) {
                L1: {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (-1 > (param1[0] ^ -1)) {
                      break L1;
                    } else {
                      return null;
                    }
                  }
                }
                L2: {
                  var9 = (mb) ((Object) this.field_c.a(var6, 100));
                  if (var9 != null) {
                    break L2;
                  } else {
                    var9 = mb.a(this.field_b, param2, param0);
                    if (var9 != null) {
                      this.field_c.a(-118, var6, var9);
                      break L2;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.b(-27598);
                  this.field_d.a(-102, var6, var8);
                  stackIn_19_0 = (gi) (var8);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_17_0 = null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (gi) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (gi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("ka.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (gi) ((Object) stackIn_17_0);
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    ka(dj param0, dj param1) {
        this.field_c = new dl(256);
        this.field_d = new dl(256);
        try {
            this.field_g = param0;
            this.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new byte[250][];
        field_h = new boolean[]{};
    }
}
