/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pgb {
    int[] field_m;
    llb field_j;
    static gl field_b;
    String field_n;
    int field_h;
    long field_i;
    int field_q;
    String field_d;
    boolean field_k;
    String field_e;
    int field_f;
    String field_o;
    int field_a;
    int field_c;
    static dja field_g;
    static String field_l;
    static String field_p;

    final static void a(int param0, int param1, int param2, faa param3, int[] param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param4 == null) {
                break L1;
              } else {
                if (param1 != 0) {
                  var5_int = 2147483647;
                  var6 = -2147483648;
                  var7_ref_int__ = param4;
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7_ref_int__.length) {
                      L3: {
                        param3.a(-632, param1, param0);
                        var7 = iia.a(-103, -var5_int + var6);
                        param3.a(-632, var7, 6);
                        param3.a(-632, var5_int, 32);
                        if (var7 <= 0) {
                          break L3;
                        } else {
                          var8 = 0;
                          L4: while (true) {
                            if (var8 >= param1) {
                              break L3;
                            } else {
                              param3.a(-632, -var5_int + param4[var8], var7);
                              var8++;
                              continue L4;
                            }
                          }
                        }
                      }
                      var8 = 72 % ((-35 - param2) / 54);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L5: {
                        var9 = var7_ref_int__[var8];
                        if (var9 <= var6) {
                          break L5;
                        } else {
                          var6 = var9;
                          break L5;
                        }
                      }
                      L6: {
                        if (var9 < var5_int) {
                          var5_int = var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param3.a(-632, 0, param0);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("pgb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        L0: {
          if (this.field_k) {
            break L0;
          } else {
            L1: {
              if (-3 != (this.field_a ^ -1)) {
                break L1;
              } else {
                if (0 < this.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if ((this.field_i ^ -1L) == (wqa.field_a ^ -1L)) {
              return 1;
            } else {
              L2: {
                if ((iwa.field_b ^ -1) != -3) {
                  break L2;
                } else {
                  if (!uaa.a(this.field_n, (byte) -105)) {
                    break L2;
                  } else {
                    return 1;
                  }
                }
              }
              if (param0 == 1) {
                return 0;
              } else {
                return -30;
              }
            }
          }
        }
        return 2;
    }

    public static void a(byte param0) {
        if (param0 <= 49) {
            return;
        }
        field_b = null;
        field_g = null;
        field_l = null;
        field_p = null;
    }

    pgb(boolean param0) {
        this.field_f = sj.field_o;
        this.field_o = pva.field_f;
        this.field_i = sga.field_q;
        if (!param0) {
            this.field_m = null;
        } else {
            this.field_m = un.field_h;
        }
        this.field_q = psb.field_a;
        this.field_c = bl.field_A;
        this.field_a = wja.field_a;
        this.field_k = dab.field_e;
        this.field_e = ti.field_h;
        this.field_h = jkb.field_b;
        this.field_n = uja.field_a;
        this.field_d = jh.field_p;
    }

    pgb(int param0, String param1, int param2, String param3, String param4) {
        try {
            this.field_n = param1;
            this.field_e = param1;
            this.field_q = param2;
            this.field_d = param4;
            this.field_f = 0;
            this.field_a = param0;
            this.field_c = 0;
            this.field_k = true;
            this.field_h = 0;
            this.field_m = null;
            this.field_o = param3;
            this.field_i = 0L;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pgb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new gl(3);
        field_g = (dja) ((Object) new gfb());
        field_p = "Toggle condition not";
        field_l = "ESC - cancel private message";
    }
}
