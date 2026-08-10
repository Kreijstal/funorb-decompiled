/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends bh {
    int field_v;
    static String field_n;
    int field_s;
    ck field_o;
    int field_D;
    static int field_p;
    static String field_A;
    String field_r;
    int field_z;
    static ud field_w;
    int field_u;
    int field_y;
    static boolean field_x;
    boolean field_q;
    static vj field_C;
    static String field_B;
    int field_t;

    public static void c(byte param0) {
        field_n = null;
        field_C = null;
        field_A = null;
        field_w = null;
        field_B = null;
        if (param0 >= -65) {
            sa.c((byte) -48);
        }
    }

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              jc.field_g = jc.field_g + 1;
              if ((field_p ^ -1) != 0) {
                break L1;
              } else {
                if (0 == (u.field_e ^ -1)) {
                  u.field_e = pm.field_f;
                  field_p = bh.field_g;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param0 != null) {
                  if (param0.equals(k.field_e)) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (null != k.field_e) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!wd.field_d) {
                  if (jc.field_g >= o.field_b) {
                    if (o.field_b - -he.field_gb > jc.field_g) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param0 == null) {
                  jc.field_g = 0;
                  break L5;
                } else {
                  if (wd.field_d) {
                    jc.field_g = o.field_b;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      jc.field_g = 0;
                      break L5;
                    } else {
                      jc.field_g = o.field_b;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 != null) {
                  wd.field_d = false;
                  break L6;
                } else {
                  if (var2_int != 0) {
                    wd.field_d = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              dh.field_e = u.field_e;
              pa.field_Z = field_p;
              break L2;
            }
            L7: {
              k.field_e = param0;
              if (wd.field_d) {
                break L7;
              } else {
                if (o.field_b <= jc.field_g) {
                  break L7;
                } else {
                  if (!pm.field_b) {
                    break L7;
                  } else {
                    dh.field_e = u.field_e;
                    pa.field_Z = field_p;
                    jc.field_g = 0;
                    break L7;
                  }
                }
              }
            }
            L8: {
              field_p = param1;
              u.field_e = -1;
              if (!wd.field_d) {
                break L8;
              } else {
                if (ve.field_hc == jc.field_g) {
                  jc.field_g = 0;
                  wd.field_d = false;
                  break L8;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var2);

            stackIn_42_1 = new StringBuilder().append("sa.B(");

            if (param0 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L9;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param1 + ')');
        }
    }

    sa(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6, String[] param7) {
        RuntimeException var9 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_t = param3;
            this.field_u = param1;
            this.field_y = param6;
            stackIn_3_0 = this;

            if (!param0) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
              break L0;
            }
          }
          ((sa) (this)).field_q = stackIn_4_1 != 0;
          this.field_D = param2;
          this.field_r = hf.a(param7.length, 0, (CharSequence[]) ((Object) param7), (byte) 74);
          if (param4 == null) {
            this.field_s = param5;
            return;
          } else {
            L1: {
              if (param5 < param4.length) {
                break L1;
              } else {
                param5 = param4.length + -1;
                break L1;
              }
            }
            this.field_s = param4[param5];
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var9);

            stackIn_12_1 = new StringBuilder().append("sa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_n = "OVER <%0>";
        field_p = -1;
        field_A = "members-only content";
        field_C = new vj();
    }
}
