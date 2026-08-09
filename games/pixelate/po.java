/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po {
    static String field_e;
    static ak field_c;
    static String field_j;
    private nl field_g;
    private fm field_i;
    static po field_d;
    static bb field_b;
    static String field_f;
    private fm field_a;
    private nl field_h;

    private final sp a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sp var8 = null;
        qd var9 = null;
        sp stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        sp stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2 ^ (param3 << 208937348 & param0 | param3 >>> 644995372);
            var5_int = var5_int | param3 << -1014726256;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (sp) ((Object) this.field_h.a(-25484, var6));
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
                var9 = (qd) ((Object) this.field_g.a(-25484, var6));
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = qd.a(this.field_i, param3, param2);
                  if (var9 != null) {
                    this.field_g.a(var6, param0 ^ 65420, var9);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param1);
              if (var8 != null) {
                var9.c(2779);
                this.field_h.a(var6, param0 ^ 65423, var8);
                stackIn_16_0 = (sp) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_14_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (sp) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("po.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sp) ((Object) stackIn_14_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final sp a(byte param0, int[] param1, int param2) {
        sp discarded$1 = null;
        RuntimeException var4 = null;
        String var5 = null;
        sp stackIn_3_0 = null;
        sp stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (1 == this.field_i.b((byte) -89)) {
              stackIn_3_0 = this.a(65521, param1, param2, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (this.field_i.b(param2, (byte) 100) ^ -1)) {
                stackIn_7_0 = this.a(65521, param1, 0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 <= -39) {
                    break L1;
                  } else {
                    var5 = (String) null;
                    discarded$1 = this.a((String) null, (int[]) null, (String) null, -73);
                    break L1;
                  }
                }
                throw new RuntimeException();
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("po.H(").append(param0).append(',');

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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    private final sp a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        sp var8 = null;
        np var9 = null;
        sp var10 = null;
        sp stackIn_5_0 = null;
        sp stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param1 ^ ((param3 & -1342173185) << -1249630716 | param3 >>> -1999899444);
              var5_int = var5_int | param3 << 1722860560;
              if (param0 == 0) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var6 = (long)var5_int;
            var8 = (sp) ((Object) this.field_h.a(param0 + -25484, var6));
            if (var8 != null) {
              stackIn_5_0 = (sp) (var8);
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
              var9 = np.a(this.field_a, param3, param1);
              if (var9 != null) {
                L3: {
                  var10 = var9.b();
                  var8 = var10;
                  this.field_h.a(var6, param0 ^ 127, var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var10.field_n.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_17_0 = (sp) (var8);
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
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("po.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_17_0;
        }
    }

    final sp a(int param0, int[] param1, byte param2) {
        RuntimeException var4 = null;
        sp stackIn_2_0 = null;
        sp stackIn_5_0 = null;
        sp stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-2 != (this.field_a.b((byte) 98) ^ -1)) {
              if (param2 == 106) {
                if (1 != this.field_a.b(param0, (byte) 27)) {
                  throw new RuntimeException();
                } else {
                  stackIn_8_0 = this.a(0, 0, param1, param0);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (sp) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(0, param0, param1, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("po.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
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

    final sp a(boolean param0, String param1, String param2) {
        RuntimeException var4 = null;
        sp stackIn_2_0 = null;
        sp stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0) {
              stackIn_4_0 = this.a(param2, (int[]) null, param1, -86);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (sp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("po.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_c = (ak) null;
            if (!un.field_l) {
                return;
            }
            mj.a(false);
            return;
        }
        if (un.field_l) {
            mj.a(false);
            return;
        }
    }

    final static String a(int param0, long param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        pe.field_a.setTime(new Date(param1));
        var3 = pe.field_a.get(7);
        var4 = pe.field_a.get(5);
        if (param0 != 10) {
          po.a(true);
          var5 = pe.field_a.get(2);
          var6 = pe.field_a.get(1);
          var7 = pe.field_a.get(11);
          var8 = pe.field_a.get(12);
          var9 = pe.field_a.get(13);
          return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var5 = pe.field_a.get(2);
          var6 = pe.field_a.get(1);
          var7 = pe.field_a.get(11);
          var8 = pe.field_a.get(12);
          var9 = pe.field_a.get(13);
          return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    private final sp a(String param0, int[] param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sp stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        sp stackIn_10_0 = null;
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
            if (param3 < -4) {
              var5_int = this.field_a.a(118, param0);
              if ((var5_int ^ -1) <= -1) {
                var6 = this.field_a.a((byte) -117, param2, var5_int);
                if ((var6 ^ -1) <= -1) {
                  stackIn_10_0 = this.a(0, var6, param1, var5_int);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (sp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("po.A(");

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


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (sp) ((Object) stackIn_5_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -1 % ((param0 - -33) / 41);
        field_e = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_c = null;
    }

    po(fm param0, fm param1) {
        this.field_g = new nl(256);
        this.field_h = new nl(256);
        try {
            this.field_i = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "po.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Level: ";
        field_e = "Pixelate";
        field_f = "Reject <%0> from this game";
        field_b = new bb();
    }
}
