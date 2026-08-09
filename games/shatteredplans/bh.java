/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends oh {
    static boolean field_j;
    static String field_r;
    static String field_n;
    int field_q;
    static cp field_p;
    static qr field_k;
    int field_l;
    int field_o;
    static bi[] field_m;
    static int field_h;
    int field_i;

    final boolean a(int param0, int param1, int param2) {
        String var5;
        if (param0 == 16548) {
          if (param2 >= this.field_l) {
            if (this.field_q <= param1) {
              if (param2 < this.field_o) {
                if (param1 >= this.field_i) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          var5 = (String) null;
          bh.a((String) null, (bc) null, (byte) 81, (String) null, (String) null);
          if (param2 >= this.field_l) {
            if (this.field_q <= param1) {
              if (param2 < this.field_o) {
                if (param1 >= this.field_i) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_n = null;
        field_m = null;
        if (param0 != 0) {
          field_r = (String) null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_p = null;
          field_k = null;
          return;
        }
    }

    final static String a(String param0, bc param1, byte param2, String param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
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
            L1: {
              if (param2 > 7) {
                break L1;
              } else {
                var6 = (String) null;
                bh.a((String) null, (bc) null, (byte) -117, (String) null, (String) null);
                break L1;
              }
            }
            if (!param1.b((byte) -109)) {
              stackIn_5_0 = (String) (param3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param4 + " - " + param1.a(param0, (byte) 33) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("bh.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param4 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static String d(int param0) {
        String var2;
        if (ue.field_a != ee.field_l) {
          if (ue.field_a != fj.field_s) {
            if (!wh.field_a.b(14)) {
              return gp.field_b;
            } else {
              if (param0 >= -61) {
                var2 = (String) null;
                bh.a((String) null, (bc) null, (byte) 30, (String) null, (String) null);
                return qh.field_B;
              } else {
                return qh.field_B;
              }
            }
          } else {
            return gp.field_b;
          }
        } else {
          return um.field_j;
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -36) {
                break L1;
              } else {
                var4 = (String) null;
                bh.a((String) null, (bc) null, (byte) -45, (String) null, (String) null);
                break L1;
              }
            }
            ai.a(param0, true, 0, wm.field_c, (byte) -60, ef.field_a, us.field_b);
            var2_int = 0;
            L2: while (true) {
              if (wm.field_c <= var2_int) {
                ai.a(param0 + param0, false, param0, wm.field_c + param0, (byte) -60, ff.field_u, s.field_e);
                if (wm.field_c <= param0) {
                  break L0;
                } else {
                  wm.field_c = param0;
                  return;
                }
              } else {
                lg.field_d[var2_int + param0] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "bh.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1, String param2) {
        try {
            ai.a(false, -1, param2, param1);
            int var3_int = 19 % ((param0 - 37) / 41);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "bh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public bh() {
    }

    bh(int param0, int param1, int param2, int param3) {
        this.field_q = param1;
        this.field_i = param3;
        this.field_l = param0;
        this.field_o = param2;
    }

    static {
        field_j = false;
        field_r = "Rating";
        field_p = null;
        field_n = "Day";
    }
}
