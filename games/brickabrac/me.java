/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    private String field_c;
    static jp field_b;
    static tp[] field_a;
    static int[][] field_e;
    static boolean[] field_f;
    static kl field_d;

    final void a(int param0, java.applet.Applet param1) {
        try {
            if (param0 < 92) {
                me.b(-113);
            }
            sj.a(param1, (byte) 122, this.field_c, "jagex-last-login-method", 31536000L);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "me.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = (int[][]) null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 100) {
            field_a = (tp[]) null;
        }
    }

    final static boolean b(int param0) {
        int var1 = 0 % ((param0 - 66) / 35);
        return sm.field_b != sm.field_a ? true : false;
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        pi var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            if (tk.a(var6, false)) {
              if (!ci.a(param0, -26)) {
                if (param2 != wk.field_m) {
                  stackIn_9_0 = df.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!af.a(124, param0)) {
                    if (fo.field_h < 100) {
                      if (nc.a(param2 + -2, param0)) {
                        stackIn_19_0 = rd.a(tq.field_a, new String[]{param0}, (byte) 103);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var5 = k.field_h;
                        var5.e(-13413, param1);
                        var5.field_l = var5.field_l + 1;
                        var4 = var5.field_l;
                        var5.a(84, 2);
                        var5.a(param0, param2 ^ -3);
                        var5.d((byte) 119, -var4 + var5.field_l);
                        stackIn_21_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_15_0 = ap.field_d;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = rd.a(dn.field_J, new String[]{param0}, (byte) 103);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = rj.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = om.field_Xb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("me.F(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L1;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    return (String) ((Object) stackIn_21_0);
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + oh.a((byte) 13, "\n", param0, "%0a"));
        if (param1 > -73) {
            field_f = (boolean[]) null;
        }
    }

    final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 56) {
                break L1;
              } else {
                field_b = (jp) null;
                break L1;
              }
            }
            stackIn_3_0 = this.field_c.equals(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("me.A(");

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
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    me(String param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new jp(540, 140);
    }
}
