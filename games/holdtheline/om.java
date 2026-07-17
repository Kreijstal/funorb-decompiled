/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om {
    int field_h;
    int[] field_l;
    int field_a;
    private kg field_q;
    private static int[] field_e;
    int field_m;
    hj[] field_g;
    static th field_n;
    boolean field_d;
    static uf field_i;
    boolean field_c;
    static int[] field_p;
    private uf field_k;
    private go field_j;
    private va field_o;
    int field_b;
    mg[] field_f;

    private final void a(int param0, go param1) {
        try {
            ((om) this).field_j = param1;
            ((om) this).field_c = false;
            if (param0 != 1) {
                Object var4 = null;
                om.a(74, (fl) null, -105);
            }
            ((om) this).field_g = null;
            ((om) this).field_l = null;
            ((om) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, uf param1) {
        try {
            ((om) this).field_l = null;
            int var3_int = 125 % ((param0 - -14) / 34);
            ((om) this).field_k = param1;
            ((om) this).field_g = null;
            ((om) this).field_f = null;
            ((om) this).field_c = false;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean b(byte param0) {
        int var2 = 0;
        hj var3 = null;
        mg var3_ref = null;
        hj[] var3_array = null;
        mg[] var3_array2 = null;
        int var4 = 0;
        mg var5 = null;
        hj var6 = null;
        mg[] var7 = null;
        hj[] var8 = null;
        hj[] var13 = null;
        var4 = HoldTheLine.field_D;
        if (!((om) this).field_c) {
          var2 = -8 / ((-92 - param0) / 34);
          if (((om) this).field_k != null) {
            var6 = ((om) this).field_k.a(8192);
            var3 = var6;
            if (var3 == null) {
              return ((om) this).field_c;
            } else {
              ((om) this).field_g = new hj[]{var6};
              ((om) this).field_c = true;
              return ((om) this).field_c;
            }
          } else {
            if (((om) this).field_j == null) {
              if (null != ((om) this).field_o) {
                var13 = ((om) this).field_o.a(180);
                var8 = var13;
                var3_array = var8;
                if (var8 == null) {
                  return ((om) this).field_c;
                } else {
                  ((om) this).field_g = var13;
                  ((om) this).field_c = true;
                  return ((om) this).field_c;
                }
              } else {
                if (null != ((om) this).field_q) {
                  var7 = ((om) this).field_q.a(16);
                  var3_array2 = var7;
                  if (var7 == null) {
                    return ((om) this).field_c;
                  } else {
                    ((om) this).field_f = var7;
                    ((om) this).field_c = true;
                    return ((om) this).field_c;
                  }
                } else {
                  return ((om) this).field_c;
                }
              }
            } else {
              var5 = ((om) this).field_j.c((byte) -105);
              var3_ref = var5;
              if (var3_ref == null) {
                return ((om) this).field_c;
              } else {
                ((om) this).field_f = new mg[]{var5};
                ((om) this).field_c = true;
                return ((om) this).field_c;
              }
            }
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_n = null;
        field_e = null;
        field_i = null;
    }

    final static void a(String[][] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ra.field_ab = -1;
              ik.field_i = param2;
              qj.field_I = -1;
              mc.field_b = param0;
              mn.field_b = -1;
              nh.h(0);
              if (param1 > 10) {
                break L1;
              } else {
                var4 = null;
                ql discarded$2 = om.a((String) null, (gn) null, (String) null, 14, (gn) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("om.H(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(va param0, int[] param1, boolean param2) {
        ((om) this).field_l = param1;
        ((om) this).field_c = false;
        ((om) this).field_o = param0;
        try {
            ((om) this).field_g = null;
            ((om) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.D(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static ql a(String param0, gn param1, String param2, int param3, gn param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        ql stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ql stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param3 == 8192) {
              var5_int = param4.c(param0, 3);
              var6 = param4.a(var5_int, param2, false);
              stackOut_3_0 = ta.a(var5_int, var6, param4, param1, -105);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ql) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("om.E(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param3).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, fl param1, int param2) {
        da var6 = null;
        int var4 = 0;
        try {
            if (param0 != 27391) {
                Object var5 = null;
                om.a(-52, (fl) null, -89);
            }
            var6 = da.field_p;
            var6.c((byte) 33, param2);
            var6.field_l = var6.field_l + 1;
            var4 = var6.field_l;
            var6.f(111, 1);
            if (null != param1.field_l) {
                var6.f(param0 + -27280, param1.field_l.length);
                var6.a(param1.field_l.length, 86, param1.field_l, 0);
            } else {
                var6.f(param0 ^ 27280, 0);
            }
            int discarded$0 = var6.a(var4, (byte) 118);
            var6.field_l = var6.field_l - 4;
            param1.field_k = var6.a(62);
            var6.a(-268435456, var6.field_l - var4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != 32768) {
          field_i = null;
          ((om) this).field_d = false;
          ((om) this).field_a = param1;
          return;
        } else {
          ((om) this).field_d = false;
          ((om) this).field_a = param1;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        Object var5 = null;
        ((om) this).field_h = param1;
        ((om) this).field_m = param2;
        ((om) this).field_d = true;
        if (param0 != 92682) {
          var5 = null;
          this.a((va) null, (int[]) null, true);
          ((om) this).field_a = (int)Math.sqrt((double)(((om) this).field_m * ((om) this).field_m + ((om) this).field_h * ((om) this).field_h));
          return;
        } else {
          ((om) this).field_a = (int)Math.sqrt((double)(((om) this).field_m * ((om) this).field_m + ((om) this).field_h * ((om) this).field_h));
          return;
        }
    }

    private final void a(int param0, kg param1, int[] param2) {
        ((om) this).field_l = param2;
        ((om) this).field_g = null;
        ((om) this).field_q = param1;
        ((om) this).field_c = false;
        if (param0 != 4) {
            return;
        }
        try {
            ((om) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    om(int param0, int param1, va param2, int[] param3, int param4) {
        try {
            ((om) this).field_b = param1;
            this.a(32768, param0);
            this.a(param2, param3, true);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              lh.a((java.awt.Component) (Object) param1, false);
              ic.a(23147, (java.awt.Component) (Object) param1);
              if (lb.field_u != null) {
                lb.field_u.a((java.awt.Component) (Object) param1, -1);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == -46342) {
              break L0;
            } else {
              var3 = null;
              om.a(93, (java.awt.Canvas) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("om.I(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    om(int param0, int param1, kg param2, int[] param3, int param4) {
        try {
            ((om) this).field_b = param1;
            this.a(32768, param0);
            this.a(4, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    om(int param0, int param1, int param2, kg param3, int[] param4, int param5) {
        try {
            ((om) this).field_b = param2;
            this.a(92682, param1, param0);
            this.a(4, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    om(int param0, int param1, uf param2, int param3) {
        try {
            ((om) this).field_b = param1;
            this.a(32768, param0);
            this.a(-103, param2);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    om(int param0, int param1, int param2, uf param3, int param4) {
        try {
            ((om) this).field_b = param2;
            this.a(92682, param1, param0);
            this.a(-57, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    om(int param0, int param1, go param2, int param3) {
        try {
            ((om) this).field_b = param1;
            this.a(32768, param0);
            this.a(1, param2);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    om(int param0, int param1, int param2, go param3, int param4) {
        try {
            ((om) this).field_b = param2;
            this.a(92682, param1, param0);
            this.a(1, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "om.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    om(int param0, int param1, int param2, int param3) {
        ((om) this).field_b = param2;
        this.a(92682, param1, param0);
        ((om) this).field_g = null;
        ((om) this).field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_e = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
            var6 = (long)(1 + (var0 << 1));
            var4 = (long)(-1 + (var0 << 1));
            var3 = (int)(-32768L + (var6 * var6 >> 18));
            var2 = (int)(-32768L + (var4 * var4 >> 18));
            if (var3 >= field_e.length) {
                var3 = field_e.length - 1;
            }
            for (var1 = var2 < 0 ? 0 : var2; var3 >= var1; var1++) {
                field_e[var1] = var0;
            }
        }
        field_p = new int[8192];
    }
}
