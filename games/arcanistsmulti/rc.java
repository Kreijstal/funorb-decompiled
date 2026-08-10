/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    float field_b;
    static String field_o;
    static qb field_h;
    private int field_e;
    static String field_f;
    private int field_p;
    static String field_g;
    private ta[] field_c;
    private int field_q;
    String field_j;
    static String field_n;
    static eg field_a;
    static int field_m;
    static String field_l;
    static qb[] field_k;
    static ll[] field_d;
    static String field_i;

    private final void a(ta param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_float = (float)param1 / 100.0f + (float)(this.field_q + 1);
            if (param2 <= -107) {
              this.field_b = var4_float * (float)this.field_p / (float)(1 + this.field_e);
              if (-1 != (param1 ^ -1)) {
                this.field_j = param0.field_f + " - " + param1 + "%";
                return;
              } else {
                this.field_j = param0.field_j;
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("rc.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -1321) {
          L0: {
            field_a = (eg) null;
            if (null == tc.field_A) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == tc.field_A) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static lg a(eg param0, int param1, String param2, String param3, eg param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        lg stackIn_3_0 = null;
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -24755) {
                break L1;
              } else {
                field_n = (String) null;
                break L1;
              }
            }
            var5_int = param4.c(param2, 105);
            var6 = param4.a(param3, (byte) 73, var5_int);
            stackIn_3_0 = kn.a(param4, var5_int, true, var6, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("rc.B(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(ec param0, int param1, int param2, int param3, ec param4, int param5) {
        try {
            la.field_d = param2;
            da.field_c = param5;
            bm.field_h = param3;
            if (param1 != 120) {
                field_n = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "rc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_o = null;
        field_g = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_n = null;
        field_k = null;
        field_d = null;
        if (param0 != -1) {
          field_k = (qb[]) null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        CharSequence var4;
        if (param1 != -30218) {
          L0: {
            var4 = (CharSequence) null;
            rc.a((byte) 20, (CharSequence) null, -57);
            ma.field_N = param0;
            if (ea.field_F != jo.field_e) {
              var2 = ea.field_F * ea.field_F;
              var3 = var2 + -(jo.field_e * jo.field_e);
              param0 = param0 + var3 * (vd.field_k - param0) / var2;
              break L0;
            } else {
              break L0;
            }
          }
          n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
          jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
          return;
        } else {
          L1: {
            ma.field_N = param0;
            if (ea.field_F != jo.field_e) {
              var2 = ea.field_F * ea.field_F;
              var3 = var2 + -(jo.field_e * jo.field_e);
              param0 = param0 + var3 * (vd.field_k - param0) / var2;
              break L1;
            } else {
              break L1;
            }
          }
          n.field_g.a(640, sa.field_Hb, param0, 120, (byte) -120);
          jd.a(5, vd.field_k - 24, (byte) 19, 640, mm.field_p, 0, dh.field_Gb);
          return;
        }
    }

    final static boolean b(int param0) {
        if (param0 != -1) {
            CharSequence var2 = (CharSequence) null;
            rc.a((byte) 9, (CharSequence) null, 44);
            return ri.a(-97);
        }
        return ri.a(-97);
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -52 % ((param0 - 7) / 60);
            stackIn_1_0 = fn.a(true, (byte) -40, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("rc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean d(int param0) {
        ta var2;
        int var3;
        ec var4;
        ta var5;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 > 78) {
            break L0;
          } else {
            var4 = (ec) null;
            rc.a((ec) null, -3, -38, 35, (ec) null, -83);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_q < this.field_e) {
            var5 = this.field_c[this.field_q];
            var2 = var5;
            if (var5.field_c.c(-10923)) {
              L2: {
                if ((var5.field_h ^ -1) > -1) {
                  break L2;
                } else {
                  if (var5.field_c.a(true, var5.field_h)) {
                    break L2;
                  } else {
                    this.a(var2, var5.field_c.a(var5.field_h, -23760), -112);
                    return false;
                  }
                }
              }
              L3: {
                if (var5.field_g == null) {
                  break L3;
                } else {
                  if (!var5.field_c.a(var5.field_g, -24417)) {
                    this.a(var2, var5.field_c.b(var5.field_g, 108), -126);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if ((var5.field_h ^ -1) <= -1) {
                  break L4;
                } else {
                  if (var5.field_g != null) {
                    break L4;
                  } else {
                    if (var5.field_f == null) {
                      break L4;
                    } else {
                      if (var5.field_c.a(-105)) {
                        break L4;
                      } else {
                        this.a(var2, var5.field_c.a((byte) -116), -118);
                        return false;
                      }
                    }
                  }
                }
              }
              this.field_q = this.field_q + 1;
              continue L1;
            } else {
              this.a(var5, 0, -123);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private rc() throws Throwable {
        throw new Error();
    }

    static {
        field_o = "Hide players in <%0>'s game";
        field_f = "Targeted spells:";
        field_g = "Year";
        field_h = new qb(540, 140);
        field_n = "Just play";
        field_l = "You cannot cast Vine Bridge while flying, land to cast it";
        field_i = "<br><br>Your familiar is already at maximum power.";
    }
}
