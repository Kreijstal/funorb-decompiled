/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj {
    private sj field_d;
    private kc field_f;
    static boolean[] field_a;
    private sj field_e;
    static hd field_b;
    private kc field_c;

    private final to a(String param0, String param1, byte param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        to stackIn_2_0 = null;
        to stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 <= -27) {
              var5_int = this.field_e.b(param1, -1);
              if (-1 >= (var5_int ^ -1)) {
                var6 = this.field_e.a((byte) -98, param0, var5_int);
                if (var6 >= 0) {
                  stackIn_10_0 = this.a(var5_int, param3, var6, (byte) 125);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (to) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("rj.G(");

            if (param0 == null) {
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
          L2: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_10_0;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -112) {
            rj.a((byte) -31);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    private final to a(int param0, int[] param1, int param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        to var8 = null;
        ed var9 = null;
        int var10 = 0;
        to var11 = null;
        to stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        to stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2 ^ (param0 >>> -1755560628 | param0 << 182328196 & 65535);
            var5_int = var5_int | param0 << 1202780528;
            var6 = (long)var5_int;
            var8 = (to) ((Object) this.field_c.a(true, var6));
            if (var8 != null) {
              stackIn_3_0 = (to) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1[0] > 0) {
                    break L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var10 = 85 / ((72 - param3) / 45);
              var9 = ed.a(this.field_e, param0, param2);
              if (var9 != null) {
                L2: {
                  var11 = var9.a();
                  var8 = var11;
                  this.field_c.a(var8, -95, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var11.field_i.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                stackIn_15_0 = (to) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("rj.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (to) ((Object) stackIn_7_0);
          } else {
            return stackIn_15_0;
          }
        }
    }

    private final to a(int[] param0, int param1, int param2, int param3) {
        to stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_18_0 = null;
        to stackIn_20_0 = null;
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
        to var8 = null;
        tg var9 = null;
        try {
          L0: {
            L1: {
              var5_int = (65524 & param2 << 1213174116 | param2 >>> 632088396) ^ param3;
              var5_int = var5_int | param2 << -1034093232;
              var6 = (long)var5_int ^ 4294967296L;
              var8 = (to) ((Object) this.field_c.a(true, var6));
              if (param1 == 0) {
                break L1;
              } else {
                this.field_f = (kc) null;
                break L1;
              }
            }
            if (var8 != null) {
              stackIn_5_0 = (to) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (-1 > (param0[0] ^ -1)) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L3: {
                var9 = (tg) ((Object) this.field_f.a(true, var6));
                if (var9 == null) {
                  var9 = tg.a(this.field_d, param2, param3);
                  if (var9 != null) {
                    this.field_f.a(var9, 79, var6);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.c((byte) -109);
                this.field_c.a(var8, -82, var6);
                stackIn_20_0 = (to) (var8);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_18_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("rj.F(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (to) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (to) ((Object) stackIn_18_0);
            } else {
              return stackIn_20_0;
            }
          }
        }
    }

    final to a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        to stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_f = (kc) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param2, param0, (byte) -62, (int[]) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("rj.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(long param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ct.field_y.setTime(new Date(param0));
        var3 = ct.field_y.get(7);
        var4 = ct.field_y.get(5);
        var5 = ct.field_y.get(2);
        var6 = ct.field_y.get(1);
        var7 = ct.field_y.get(11);
        var8 = ct.field_y.get(12);
        var9 = ct.field_y.get(13);
        if (param1 > -69) {
          rj.a((byte) -2);
          return cu.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + tv.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          return cu.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + tv.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final to b(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        to stackIn_3_0 = null;
        to stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 == this.field_e.a(123)) {
              stackIn_3_0 = this.a(0, param2, param1, (byte) 117);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == 10) {
                  break L1;
                } else {
                  this.field_d = (sj) null;
                  break L1;
                }
              }
              if (1 != this.field_e.a(true, param1)) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(param1, param2, 0, (byte) -35);
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

            stackIn_12_1 = new StringBuilder().append("rj.A(").append(param0).append(',').append(param1).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final to a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        to stackIn_2_0 = null;
        to stackIn_5_0 = null;
        to stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_d.a(126) ^ -1) != -2) {
              if (-2 != (this.field_d.a(true, param0) ^ -1)) {
                if (param1 == 10) {
                  throw new RuntimeException();
                } else {
                  stackIn_8_0 = (to) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param2, 0, param0, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(param2, 0, 0, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("rj.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    rj(sj param0, sj param1) {
        this.field_f = new kc(256);
        this.field_c = new kc(256);
        try {
            this.field_d = param1;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new boolean[8];
    }
}
