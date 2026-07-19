/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vf extends hk {
    static byte[][] field_E;
    static dm field_L;
    static qc field_I;
    private fb field_G;
    private String[] field_J;
    static dm[] field_H;
    static boolean field_K;
    private tf field_F;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -this.field_v + param2;
        int var6 = param0 - this.field_m;
        fb var7 = this.a((byte) -114, var6, var5);
        if (var7 != null) {
            if (null != this.field_u) {
                ((pe) ((Object) this.field_u)).a((vf) (this), var7.field_g, param1 + 28924, param3);
            }
        }
    }

    final static df a(boolean param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        df stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (!param3) {
                break L1;
              } else {
                field_I = (qc) null;
                break L1;
              }
            }
            L2: {
              if (0 != (param2.indexOf('@') ^ -1)) {
                var6 = param2;
                break L2;
              } else {
                var7 = (CharSequence) ((Object) param2);
                var4_long = rh.a(var7, -48);
                break L2;
              }
            }
            stackOut_5_0 = wd.a(true, var4_long, (String) (var6), param1, param0);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("vf.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void h(int param0) {
        if (param0 != 0) {
            field_K = false;
        }
        field_L = null;
        field_I = null;
        field_H = null;
        field_E = (byte[][]) null;
    }

    vf(String param0, dh param1) {
        super(param0, (bb) null);
        this.field_G = null;
        try {
            this.field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String c(byte param0) {
        if (null == this.field_G) {
            return null;
        }
        if (this.field_J == null) {
            return null;
        }
        if (this.field_J.length <= this.field_G.field_g) {
            return null;
        }
        if (param0 != 69) {
            return (String) null;
        }
        return this.field_J[this.field_G.field_g];
    }

    void a(boolean param0, int param1, el param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              this.field_G = null;
              if (this.field_l) {
                var5_int = -this.field_v + qa.field_a + -param3;
                var6 = -this.field_m + -param1 + ue.field_e;
                this.field_G = this.a((byte) 72, var6, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                field_L = (dm) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("vf.H(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 46 / ((1 - param2) / 43);
        super.a(param0, param1, (byte) -42, param3);
        if (param3 != 0) {
            return;
        }
        cc var6 = (cc) ((Object) this.field_q);
        fb var7 = this.field_G;
        if (var7 == null) {
        } else {
            var8 = var6.a(param0, (el) (this), (byte) 46);
            var9 = var6.a(param1, -2, (el) (this));
            do {
                bf.a(-2 + var9 - -var7.field_i, 2 + var7.field_f, 14164, 2 + var7.field_n, var7.field_k + (var8 - 2));
                var7 = var7.field_h;
            } while (var7 != null);
        }
    }

    final static Boolean a(byte param0) {
        Boolean var1 = fi.field_b;
        int var2 = -97 / ((param0 - 44) / 60);
        fi.field_b = null;
        return var1;
    }

    final static void f(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        ja var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 0) {
              var1_int = 0;
              L1: while (true) {
                if (1000 <= var1_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2 = new ja(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, var1_int);
                  ra.field_a.a(-117, var2);
                  tl.field_g[var1_int] = var2;
                  var1_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vf.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -30) {
                break L1;
              } else {
                this.a(-15, -109, 48, 91);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("vf.UA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static String i(int param0) {
        df discarded$0 = null;
        if (param0 != 1000) {
            String var2 = (String) null;
            discarded$0 = vf.a(false, (String) null, (String) null, true);
        }
        return eh.field_d.e((byte) 101);
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        cc var4 = null;
        dk var5 = null;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        lk var13 = null;
        int var14 = 0;
        int var15 = 0;
        fb var16 = null;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var17 = Geoblox.field_C;
        this.field_F = new tf();
        var2 = 83 / ((param0 - 48) / 55);
        var3 = 0;
        var4 = (cc) ((Object) this.field_q);
        var5 = var4.a((byte) 116, (el) (this));
        L0: while (true) {
          var6 = this.field_s.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          } else {
            var8 = this.field_s.indexOf(">", var6);
            var7 = this.field_s.substring(var6 - -9, var8);
            var8 = Integer.parseInt(var7);
            var3 = this.field_s.indexOf("</hotspot>", var6);
            var9 = var5.a((byte) 24, var6);
            var10 = var5.a((byte) 24, var3);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var5.field_a[var12];
                  if (var9 == var12) {
                    stackOut_6_0 = var5.a(var6, 124);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var13.field_c[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var12 == var10) {
                    stackOut_11_0 = var5.a(var3, 116);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var13 == null) {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = var13.field_c[-1 + var13.field_c.length];
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new fb(var8, var14, var13.field_d, var15 - var14, Math.max(var4.a(1), -var13.field_d + var13.field_a));
                  if (var11 == null) {
                    break L4;
                  } else {
                    ((fb) (var11)).field_h = var16;
                    break L4;
                  }
                }
                this.field_F.a(-44, var16);
                var11 = var16;
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        String[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 122 % ((41 - param1) / 55);
                if (null == this.field_J) {
                  break L2;
                } else {
                  if (param0 >= this.field_J.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var5 = new String[param0 + 1];
                if (null != this.field_J) {
                  var6 = 0;
                  L4: while (true) {
                    if (var6 >= this.field_J.length) {
                      break L3;
                    } else {
                      var5[var6] = this.field_J[var6];
                      var6++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              this.field_J = var5;
              break L1;
            }
            this.field_J[param0] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (runtimeException);
            stackOut_12_1 = new StringBuilder().append("vf.M(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            field_I = (qc) null;
        }
        this.a(((cc) ((Object) this.field_q)).a(14, (el) (this)), param3, (byte) -40, param2, param0);
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 > -6) {
            field_E = (byte[][]) null;
        }
        super.a(param0, param1, (byte) -123, param3, param4);
        this.g(-96);
    }

    private final fb a(byte param0, int param1, int param2) {
        fb var4 = null;
        int var5 = 0;
        fb var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        var5 = 3 / ((param0 - -46) / 58);
        var4 = (fb) ((Object) this.field_F.g(0));
        L0: while (true) {
          if (var4 != null) {
            var6 = var4;
            L1: while (true) {
              if (var6 == null) {
                var4 = (fb) ((Object) this.field_F.d(1));
                continue L0;
              } else {
                L2: {
                  if (var6.field_k > param2) {
                    break L2;
                  } else {
                    if (param1 < var6.field_i) {
                      break L2;
                    } else {
                      if (param2 >= var6.field_f + var6.field_k) {
                        break L2;
                      } else {
                        if (param1 <= var6.field_i + var6.field_n) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var6 = var6.field_h;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        field_K = false;
        field_L = new dm((int)(0.5 + Math.sqrt(2592.0)) - -2, 2 + (int)(Math.sqrt(2592.0) + 0.5));
    }
}
