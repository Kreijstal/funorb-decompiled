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
        int var5 = 0;
        int var6 = 0;
        fb var7 = null;
        super.a(param0, param1, param2, param3);
        var5 = -((vf) this).field_v + param2;
        var6 = param0 - ((vf) this).field_m;
        var7 = this.a((byte) -114, var6, var5);
        if (var7 != null) {
          if (null == ((vf) this).field_u) {
            return;
          } else {
            ((pe) (Object) ((vf) this).field_u).a((vf) this, var7.field_g, param1 + 28924, param3);
            return;
          }
        } else {
          return;
        }
    }

    final static df a(boolean param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        df stackIn_4_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        df stackOut_3_0 = null;
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
        try {
          L0: {
            L1: {
              L2: {
                var4_long = 0L;
                var6 = null;
                field_I = null;
                if (param2.indexOf('@') != -1) {
                  break L2;
                } else {
                  var7 = (CharSequence) (Object) param2;
                  var4_long = rh.a(var7, -48);
                  if (Geoblox.field_C == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = (Object) (Object) param2;
              break L1;
            }
            stackOut_3_0 = wd.a(true, var4_long, (String) var6, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("vf.F(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          L4: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 1 + 41);
        }
        return stackIn_4_0;
    }

    public static void h(int param0) {
        if (param0 != 0) {
          field_K = false;
          field_L = null;
          field_I = null;
          field_H = null;
          field_E = null;
          return;
        } else {
          field_L = null;
          field_I = null;
          field_H = null;
          field_E = null;
          return;
        }
    }

    vf(String param0, dh param1) {
        super(param0, (bb) null);
        ((vf) this).field_G = null;
        try {
            ((vf) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    String c(byte param0) {
        if (null != ((vf) this).field_G) {
          if (((vf) this).field_J != null) {
            if (((vf) this).field_J.length > ((vf) this).field_G.field_g) {
              if (param0 != 69) {
                return null;
              } else {
                return ((vf) this).field_J[((vf) this).field_G.field_g];
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
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
              ((vf) this).field_G = null;
              if (((vf) this).field_l) {
                var5_int = -((vf) this).field_v + qa.field_a + -param3;
                var6 = -((vf) this).field_m + -param1 + ue.field_e;
                ((vf) this).field_G = this.a((byte) 72, var6, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            if (!param0) {
              break L0;
            } else {
              field_L = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("vf.H(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param3 + 41);
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        cc var6 = null;
        fb var7 = null;
        int var8 = 0;
        int var9 = 0;
        var5 = 46 / ((1 - param2) / 43);
        super.a(param0, param1, (byte) -42, param3);
        if (param3 != 0) {
          return;
        } else {
          L0: {
            var6 = (cc) (Object) ((vf) this).field_q;
            var7 = ((vf) this).field_G;
            if (var7 != null) {
              var8 = var6.a(param0, (el) this, (byte) 46);
              var9 = var6.a(param1, -2, (el) this);
              L1: while (true) {
                bf.a(-2 + var9 - -var7.field_i, 2 + var7.field_f, 14164, 2 + var7.field_n, var7.field_k + (var8 - 2));
                var7 = var7.field_h;
                if (var7 != null) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          return;
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
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            if (param0 == 0) {
              var1_int = 0;
              L1: while (true) {
                if (1000 <= var1_int) {
                  break L0;
                } else {
                  var2 = new ja(0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, var1_int);
                  ra.field_a.a(-117, (hf) (Object) var2);
                  tl.field_g[var1_int] = var2;
                  var1_int++;
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "vf.G(" + param0 + 41);
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
                ((vf) this).a(-15, -109, 48, 91);
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
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vf.UA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static String i(int param0) {
        Object var2 = null;
        if (param0 != 1000) {
          var2 = null;
          df discarded$2 = vf.a(false, (String) null, (String) null, true);
          return eh.field_d.e((byte) 101);
        } else {
          return eh.field_d.e((byte) 101);
        }
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
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var17 = Geoblox.field_C;
        ((vf) this).field_F = new tf();
        var2 = 83 / ((param0 - 48) / 55);
        var3 = 0;
        var4 = (cc) (Object) ((vf) this).field_q;
        var5 = var4.a((byte) 116, (el) this);
        L0: while (true) {
          var6 = ((vf) this).field_s.indexOf("<hotspot=", var3);
          stackOut_1_0 = -1;
          stackOut_1_1 = var6;
          stackIn_2_0 = stackOut_1_0;
          stackIn_2_1 = stackOut_1_1;
          L1: while (true) {
            if (stackIn_2_0 != stackIn_2_1) {
              var8 = ((vf) this).field_s.indexOf(">", var6);
              var7 = ((vf) this).field_s.substring(var6 - -9, var8);
              var8 = Integer.parseInt(var7);
              var3 = ((vf) this).field_s.indexOf("</hotspot>", var6);
              var9 = var5.a((byte) 24, var6);
              var10 = var5.a((byte) 24, var3);
              var11 = null;
              if (var17 == 0) {
                var12 = var9;
                L2: while (true) {
                  if (var10 < var12) {
                    continue L0;
                  } else {
                    var13 = var5.field_a[var12];
                    stackOut_8_0 = var9;
                    stackOut_8_1 = var12;
                    stackIn_2_0 = stackOut_8_0;
                    stackIn_2_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var17 != 0) {
                      continue L1;
                    } else {
                      L3: {
                        if (stackIn_9_0 == stackIn_9_1) {
                          stackOut_11_0 = var5.a(var6, 124);
                          stackIn_12_0 = stackOut_11_0;
                          break L3;
                        } else {
                          stackOut_10_0 = var13.field_c[0];
                          stackIn_12_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                      L4: {
                        var14 = stackIn_12_0;
                        if (var12 == var10) {
                          stackOut_16_0 = var5.a(var3, 116);
                          stackIn_17_0 = stackOut_16_0;
                          break L4;
                        } else {
                          if (var13 == null) {
                            stackOut_15_0 = 0;
                            stackIn_17_0 = stackOut_15_0;
                            break L4;
                          } else {
                            stackOut_14_0 = var13.field_c[-1 + var13.field_c.length];
                            stackIn_17_0 = stackOut_14_0;
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var15 = stackIn_17_0;
                        var16 = new fb(var8, var14, var13.field_d, var15 - var14, Math.max(var4.a(1), -var13.field_d + var13.field_a));
                        if (var11 == null) {
                          break L5;
                        } else {
                          ((fb) var11).field_h = var16;
                          break L5;
                        }
                      }
                      ((vf) this).field_F.a(-44, (hf) (Object) var16);
                      var11 = (Object) (Object) var16;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              return;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var4_int = 122 % ((41 - param1) / 55);
                  if (null == ((vf) this).field_J) {
                    break L3;
                  } else {
                    if (param0 >= ((vf) this).field_J.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = new String[param0 + 1];
                  if (null != ((vf) this).field_J) {
                    var6 = 0;
                    L5: while (true) {
                      if (var6 >= ((vf) this).field_J.length) {
                        break L4;
                      } else {
                        var5[var6] = ((vf) this).field_J[var6];
                        var6++;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          if (var7 == 0) {
                            continue L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                ((vf) this).field_J = var5;
                break L2;
              }
              ((vf) this).field_J[param0] = param2;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("vf.M(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          field_I = null;
          ((vf) this).a(((cc) (Object) ((vf) this).field_q).a(14, (el) this), param3, (byte) -40, param2, param0);
          return;
        } else {
          ((vf) this).a(((cc) (Object) ((vf) this).field_q).a(14, (el) this), param3, (byte) -40, param2, param0);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 > -6) {
          field_E = null;
          super.a(param0, param1, (byte) -123, param3, param4);
          ((vf) this).g(-96);
          return;
        } else {
          super.a(param0, param1, (byte) -123, param3, param4);
          ((vf) this).g(-96);
          return;
        }
    }

    private final fb a(byte param0, int param1, int param2) {
        fb var4 = null;
        int var5 = 0;
        fb var6 = null;
        int var7 = 0;
        fb stackIn_6_0 = null;
        fb stackIn_14_0 = null;
        fb stackOut_5_0 = null;
        fb stackOut_13_0 = null;
        var7 = Geoblox.field_C;
        var5 = 3 / ((param0 - -46) / 58);
        var4 = (fb) (Object) ((vf) this).field_F.g(0);
        L0: while (true) {
          if (var4 != null) {
            var6 = var4;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    stackOut_5_0 = (fb) var6;
                    stackIn_14_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_6_0.field_k > param2) {
                          break L4;
                        } else {
                          if (param1 < var6.field_i) {
                            break L4;
                          } else {
                            if (param2 >= var6.field_f + var6.field_k) {
                              break L4;
                            } else {
                              if (param1 <= var6.field_i + var6.field_n) {
                                return var4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var6 = var6.field_h;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = (fb) (Object) ((vf) this).field_F.d(1);
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              var4 = stackIn_14_0;
              if (var7 == 0) {
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = false;
        field_L = new dm((int)(0.5 + Math.sqrt(2592.0)) - -2, 2 + (int)(Math.sqrt(2592.0) + 0.5));
    }
}
