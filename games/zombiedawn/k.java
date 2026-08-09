/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends vf {
    static String field_r;
    static int field_t;
    private v[] field_s;

    public static void c(int param0) {
        field_r = null;
        int var1 = -126 % ((48 - param0) / 63);
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        v var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          L0: {
            L1: {
              bi.c(param4 - -param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, 10197915);
              if (param1) {
                if (((an) ((Object) param3)).field_x) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param1) {
                if (param3.e(-17741)) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  break L2;
                }
              } else {
                stackIn_12_0 = 0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_12_0;
              var8 = 0;
              if (var6_int != 0) {
                stackIn_15_0 = 2394342;
                break L3;
              } else {
                stackIn_15_0 = 16777215;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_15_0;
              if (var7 != 0) {
                var8 = var8 | 2;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var6_int != 0) {
                var8 = var8 | 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var10 = this.field_s[var8];
              var11 = (-var10.field_j + param3.field_i) / 2 + (param4 + param3.field_k);
              var12 = (-var10.field_d + param3.field_n) / 2 + (param2 - -param3.field_j);
              var13 = param3.field_k + (param4 + param3.field_i / 2);
              if (param0 == 16777215) {
                break L6;
              } else {
                k.a(-100, -115);
                break L6;
              }
            }
            var10.a(var11, var12);
            this.field_m.a(this.b(12307, param3), var13, param2, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var6);

            stackIn_27_1 = new StringBuilder().append("k.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        hi.field_O = null;
        if (param1 != 50) {
            field_r = (String) null;
            sb.field_a = null;
            jd.field_a = 0;
            var2 = bd.field_j;
            bd.field_j = qj.field_e;
            qj.field_e = var2;
            if (param0 != 51) {
                if (-51 != (param0 ^ -1)) {
                    tf.field_c.field_e = 1;
                    tf.field_c.field_h = tf.field_c.field_h + 1;
                    if ((tf.field_c.field_h ^ -1) > -3) {
                        if (2 <= tf.field_c.field_h && 50 == param0) {
                            return 5;
                        }
                        if (-5 < (tf.field_c.field_h ^ -1)) {
                            return -1;
                        }
                        return 1;
                    }
                    if (!(param0 != 51)) {
                        return 2;
                    }
                    if (2 > tf.field_c.field_h) {
                        if (-5 < (tf.field_c.field_h ^ -1)) {
                            return -1;
                        }
                        return 1;
                    }
                    if (50 == param0) {
                        return 5;
                    }
                    if (-5 < (tf.field_c.field_h ^ -1)) {
                        return -1;
                    }
                    return 1;
                }
                tf.field_c.field_e = 5;
                tf.field_c.field_h = tf.field_c.field_h + 1;
                if ((tf.field_c.field_h ^ -1) > -3) {
                    if (2 <= tf.field_c.field_h && 50 == param0) {
                        return 5;
                    }
                    if (-5 < (tf.field_c.field_h ^ -1)) {
                        return -1;
                    }
                    return 1;
                }
                if (!(param0 != 51)) {
                    return 2;
                }
                if (2 > tf.field_c.field_h) {
                    if (-5 < (tf.field_c.field_h ^ -1)) {
                        return -1;
                    }
                    return 1;
                }
                if (50 == param0) {
                    return 5;
                }
                if (-5 < (tf.field_c.field_h ^ -1)) {
                    return -1;
                }
                return 1;
            }
            tf.field_c.field_e = 2;
            tf.field_c.field_h = tf.field_c.field_h + 1;
            if ((tf.field_c.field_h ^ -1) > -3) {
                if (2 > tf.field_c.field_h) {
                    if (-5 < (tf.field_c.field_h ^ -1)) {
                        return -1;
                    }
                    return 1;
                }
                if (50 != param0) {
                    if (-5 >= (tf.field_c.field_h ^ -1)) {
                        return 1;
                    }
                    return -1;
                }
                return 5;
            }
            if (!(param0 != 51)) {
                return 2;
            }
            if (2 > tf.field_c.field_h) {
                if (-5 >= (tf.field_c.field_h ^ -1)) {
                    return 1;
                }
                return -1;
            }
            if (50 == param0) {
                return 5;
            }
            if (-5 >= (tf.field_c.field_h ^ -1)) {
                return 1;
            }
            return -1;
        }
        sb.field_a = null;
        jd.field_a = 0;
        var2 = bd.field_j;
        bd.field_j = qj.field_e;
        qj.field_e = var2;
        if (param0 != 51) {
            if (-51 != (param0 ^ -1)) {
                tf.field_c.field_e = 1;
                tf.field_c.field_h = tf.field_c.field_h + 1;
                if ((tf.field_c.field_h ^ -1) <= -3) {
                    if (param0 != 51) {
                        if (2 <= tf.field_c.field_h && 50 == param0) {
                            return 5;
                        }
                        if (-5 >= (tf.field_c.field_h ^ -1)) {
                            return 1;
                        }
                        return -1;
                    }
                    return 2;
                }
                if (2 <= tf.field_c.field_h && 50 == param0) {
                    return 5;
                }
                if (-5 >= (tf.field_c.field_h ^ -1)) {
                    return 1;
                }
                return -1;
            }
            tf.field_c.field_e = 5;
            tf.field_c.field_h = tf.field_c.field_h + 1;
            if ((tf.field_c.field_h ^ -1) <= -3) {
                if (param0 != 51) {
                    if (2 <= tf.field_c.field_h && 50 == param0) {
                        return 5;
                    }
                    if (-5 >= (tf.field_c.field_h ^ -1)) {
                        return 1;
                    }
                    return -1;
                }
                return 2;
            }
            if (2 <= tf.field_c.field_h && 50 == param0) {
                return 5;
            }
            if (-5 >= (tf.field_c.field_h ^ -1)) {
                return 1;
            }
            return -1;
        }
        tf.field_c.field_e = 2;
        tf.field_c.field_h = tf.field_c.field_h + 1;
        if ((tf.field_c.field_h ^ -1) <= -3) {
            if (param0 != 51) {
                if (2 <= tf.field_c.field_h && 50 == param0) {
                    return 5;
                }
                if (-5 >= (tf.field_c.field_h ^ -1)) {
                    return 1;
                }
                return -1;
            }
            return 2;
        }
        if (2 <= tf.field_c.field_h && 50 == param0) {
            return 5;
        }
        if (-5 >= (tf.field_c.field_h ^ -1)) {
            return 1;
        }
        return -1;
    }

    k(v[] param0) {
        try {
            this.field_s = param0;
            this.field_m = ia.field_e;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Friends can be added in multiplayer<nbsp>games";
    }
}
