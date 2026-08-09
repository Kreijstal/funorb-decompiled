/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    int field_i;
    int field_e;
    static ui field_j;
    static int[] field_a;
    static String field_b;
    static int field_d;
    static boolean[] field_c;
    static String field_g;
    int[] field_h;
    static String field_f;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        var4 = Pool.field_O;
        if (this.field_h != null) {
          if (this.field_h.length != 0) {
            if (param0 < -108) {
              var3 = 1;
              L0: while (true) {
                if (this.field_h.length > var3) {
                  if (param1 < this.field_h[var3] + this.field_h[var3 - 1] >> 1823761889) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return this.field_h.length - 1;
                }
              }
            } else {
              var5 = (String) null;
              vj.a((String) null, (byte) -110, (String) null, 52);
              var3 = 1;
              L1: while (true) {
                if (this.field_h.length > var3) {
                  if (param1 < this.field_h[var3] + this.field_h[var3 - 1] >> 1823761889) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return this.field_h.length - 1;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static java.awt.Canvas a(byte param0) {
        if (param0 > -34) {
            return (java.awt.Canvas) null;
        }
        return null == ne.field_u ? pa.field_K : (java.awt.Canvas) ((Object) ne.field_u);
    }

    final static void a(ma param0, byte param1, ma param2) {
        try {
            if (!(null == param0.field_k)) {
                param0.a((byte) -117);
            }
            param0.field_k = param2.field_k;
            if (param1 != -119) {
                field_g = (String) null;
            }
            param0.field_d = param2;
            param0.field_k.field_d = param0;
            param0.field_d.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ij a(String param0, byte param1, String param2, int param3) {
        ij var4 = null;
        RuntimeException var4_ref = null;
        ij stackIn_10_0 = null;
        ij stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 18) {
                break L1;
              } else {
                vj.a((byte) -44);
                break L1;
              }
            }
            if (nd.field_i.c(0)) {
              stackIn_12_0 = gi.a(true, param3, param2, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var4 = (ij) ((Object) nd.field_i.c((byte) -88));
                if (param3 != var4.field_m) {
                  break L2;
                } else {
                  if (var4.field_H <= kg.field_m) {
                    if (var4.field_H + var4.field_B > kg.field_m) {
                      kg.field_m = var4.field_H;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_10_0 = (ij) (var4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4_ref);

            stackIn_15_1 = new StringBuilder().append("vj.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    final static boolean a(int param0, di param1, int param2, byte param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param1.a(param3 ^ 44, param2, param0);
            var4 = var5;
            if (var5 == null) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              oa.a(true, var5);
              if (param3 == 121) {
                stackIn_7_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                field_b = (String) null;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("vj.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final static kf a(byte param0, jg param1) {
        RuntimeException var2 = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -27) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = mn.a(param0 ^ 24317, nb.b(param1, 100, 96));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vj.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final int a(int param0) {
        di var3;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 <= -9) {
          if (null != this.field_h) {
            if (this.field_h.length == 0) {
              return 0;
            } else {
              return this.field_h[this.field_h.length - 1];
            }
          } else {
            stackIn_11_0 = 0;
            return stackIn_11_0;
          }
        } else {
          var3 = (di) null;
          vj.a(-35, (di) null, 64, (byte) 45);
          if (null == this.field_h) {
            return 0;
          } else {
            L0: {
              if (this.field_h.length != 0) {
                stackIn_5_0 = this.field_h[this.field_h.length - 1];
                break L0;
              } else {
                stackIn_5_0 = 0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -27731) {
            vj.b(-11);
        }
    }

    vj(int param0, int param1, int param2) {
        this.field_h = new int[1 + param2];
        this.field_e = param0;
        this.field_i = param1;
    }

    static {
        field_a = new int[8192];
        field_b = "Won";
        field_g = "You are out of lives!";
        field_c = new boolean[112];
        field_f = "That concludes the Basics Tutorial. You can now experiment freely some more on your own, click >> to go to the Eight-ball Tutorial, or press <img=3> to go to the options menu to end the tutorial.";
    }
}
