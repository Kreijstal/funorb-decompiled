/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends pi {
    static String field_s;
    static String field_n;
    static int field_w;
    private int field_o;
    private int field_u;
    private int field_r;
    private int field_q;
    private int field_v;
    static rc[] field_t;
    private int field_p;

    final boolean a(byte param0) {
        int var2;
        int var3;
        this.field_p = this.field_p + this.field_r;
        this.field_u = this.field_u + 800;
        this.field_o = this.field_o + this.field_v;
        this.field_v = this.field_v + 4;
        if (param0 == -126) {
          var2 = -li.field_c + (this.field_p >> -1328603548);
          var3 = (this.field_o >> 1912766116) - db.field_d;
          if (0 <= var2) {
            if (640 >= var2) {
              if (var3 >= 0) {
                if (-481 <= (var3 ^ -1)) {
                  if ((this.field_v ^ -1) < -1) {
                    if (!je.field_I[(this.field_p >> 860805060) / 32][(this.field_o >> 48815076) / 32].field_a) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_t = (rc[]) null;
          var2 = -li.field_c + (this.field_p >> -1328603548);
          var3 = (this.field_o >> 1912766116) - db.field_d;
          if (0 <= var2) {
            if (640 >= var2) {
              if (var3 >= 0) {
                if (-481 <= (var3 ^ -1)) {
                  if ((this.field_v ^ -1) < -1) {
                    if (!je.field_I[(this.field_p >> 860805060) / 32][(this.field_o >> 48815076) / 32].field_a) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            L2: {
              var2 = oh.a(ah.a(-97, param0), 95);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("dn.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(byte param0) {
        if (param0 >= -44) {
          field_n = (String) null;
          field_s = null;
          field_t = null;
          field_n = null;
          return;
        } else {
          field_s = null;
          field_t = null;
          field_n = null;
          return;
        }
    }

    final static void a(bj param0, byte param1) {
        ea var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new ea(param0.a("", 0, "final_frame.jpg"), (java.awt.Component) ((Object) ef.field_c));
            var3 = var2.field_y;
            var4 = var2.field_C;
            ti.a((byte) -4);
            bl.field_x = new ea(var3, var4 * 3 / 4);
            bl.field_x.g();
            var2.g(0, 0);
            eg.field_b = new ea(var3, -bl.field_x.field_C + var4);
            eg.field_b.g();
            var2.g(0, -bl.field_x.field_C);
            eg.field_b.field_u = bl.field_x.field_C;
            tk.b(true);
            if (param1 == 29) {
              break L0;
            } else {
              field_w = -122;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2_ref);

            stackIn_5_1 = new StringBuilder().append("dn.E(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int var2 = -li.field_c + (this.field_p >> 2119690564);
        int var3 = 56 % ((param0 - 21) / 42);
        int var4 = -db.field_d + (this.field_o >> -759394588);
        je.field_B[this.field_q % je.field_B.length].b(-120, var2, 2048, 65535 & this.field_u, var4);
    }

    final static int a(String param0, boolean param1, int param2, String param3, String param4, int param5, int param6) {
        pf var7 = null;
        RuntimeException var7_ref = null;
        pf var8 = null;
        String var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param6 == -14543) {
                break L1;
              } else {
                var9 = (String) null;
                dn.a((String) null, true, -124, (String) null, (String) null, -122, 43);
                break L1;
              }
            }
            var7 = new pf(param3);
            var8 = new pf(param0);
            stackIn_3_0 = j.a(param2, param6 ^ 14565, param1, param5, var8, param4, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("dn.A(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    dn(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param2 << 23226020;
        this.field_v = param4 + -param2 << 1635974404;
        this.field_q = param0;
        this.field_r = -param1 + param3 << -814480476;
        this.field_p = param1 << 355639460;
        int var6 = ub.a(-1237818874, this.field_v * this.field_v + this.field_r * this.field_r >> -1774625052);
        this.field_r = (this.field_r << -1991802077) / var6;
        this.field_v = -32;
    }

    static {
        field_s = "FROM ONLY";
        field_w = 0;
        field_n = "Log In/Register";
        field_t = new rc[25];
    }
}
