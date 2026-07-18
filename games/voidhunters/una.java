/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class una implements ntb {
    static String field_f;
    int field_g;
    private int field_c;
    private bba[] field_b;
    static String field_a;
    private int[] field_d;
    int field_e;

    final void f(byte param0) {
        bba var3 = null;
        bba var4 = null;
        int var2 = 19 / ((param0 - 35) / 63);
        if (null != ((una) this).field_b) {
            if (((una) this).field_g > 0) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var3 = ((una) this).field_b[-1 + ((una) this).field_g];
                    var4 = ((una) this).field_b[((una) this).field_g];
                    ((una) this).field_b[-1 + ((una) this).field_g] = var4;
                    ((una) this).field_b[((una) this).field_g] = var3;
                    ((una) this).field_g = ((una) this).field_g - 1;
                }
            }
        }
    }

    final boolean a(int param0, byte param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        if (!(null != ((una) this).field_d)) {
            return true;
        }
        int var3 = 64 % ((-33 - param1) / 32);
        for (var4 = 0; var4 < ((una) this).field_d.length; var4++) {
            if (!(param0 != ((una) this).field_d[var4])) {
                return false;
            }
        }
        return true;
    }

    final void b(byte param0) {
        bba var2 = null;
        wm[] var3 = null;
        rna[] var4 = null;
        int var5 = 0;
        if (((una) this).field_b != null) {
            if (((una) this).field_g >= 0) {
                if (((una) this).field_b.length > ((una) this).field_g) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var3 = var2.a((byte) -125);
                    var4 = var2.c((byte) -42);
                    var5 = (var4 != null ? var4.length : 0) + (var3 == null ? 0 : var3.length);
                    ((una) this).field_e = (((una) this).field_e - -1) % var5;
                }
            }
        }
        if (param0 > -123) {
            ((una) this).field_d = null;
        }
    }

    final void e(byte param0) {
        bba var2 = null;
        if (((una) this).field_b != null) {
            if (((una) this).field_g >= 0) {
                if (!(((una) this).field_g >= ((una) this).field_b.length)) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var2.a(((una) this).field_e, (byte) -79);
                    ((una) this).field_e = ((una) this).field_e - 1;
                    if (((una) this).field_e < 0) {
                        ((una) this).field_e = 0;
                    }
                }
            }
        }
        if (param0 != -99) {
            ((una) this).g((byte) -104);
        }
    }

    final void a(byte param0, wm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (((una) this).field_b == null) {
                break L1;
              } else {
                if (((una) this).field_g < 0) {
                  break L1;
                } else {
                  if (((una) this).field_b.length <= ((una) this).field_g) {
                    break L1;
                  } else {
                    ((una) this).field_b[((una) this).field_g].a((byte) -105, param1);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 <= -112) {
                break L2;
              } else {
                boolean discarded$2 = ((una) this).a(121, (byte) -5);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("una.Q(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                Object var4 = null;
                ((una) this).b((byte) -44, (tv) null);
            }
            ((una) this).field_b = (bba[]) (Object) kcb.a(8, vtb.field_o, param0, 1, -115, (tv[]) (Object) ((una) this).field_b);
            ((una) this).field_g = param0.i(0, 32);
            ((una) this).field_e = param0.i(0, 32);
            ((una) this).field_d = wkb.a((byte) 37, ((una) this).field_d, param0, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "una.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        faa var10 = null;
        faa var3 = null;
        bba[] var4 = null;
        int var5 = 0;
        bba[] var6 = null;
        int var7 = 0;
        bba var8 = null;
        int var9 = VoidHunters.field_G;
        if (param1 >= -109) {
            return;
        }
        try {
            var10 = param0;
            var3 = var10;
            var4 = ((una) this).field_b;
            var5 = var4 != null ? var4.length : 0;
            var10.a(-632, var5, 8);
            if (!(var5 == 0)) {
                var6 = var4;
                for (var7 = 0; var7 < var6.length; var7++) {
                    var8 = var6[var7];
                    if (!(vq.a(var3, -126, var8 == null ? true : false))) {
                        stb.a(2, 1, var10, (tv) (Object) var8);
                    }
                }
            }
            param0.a(-632, ((una) this).field_g, 32);
            param0.a(-632, ((una) this).field_e, 32);
            pgb.a(8, null == ((una) this).field_d ? 0 : ((una) this).field_d.length, -120, param0, ((una) this).field_d);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "una.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, rsb param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              int discarded$5 = 0;
              qha.b();
              if (param0 == -2374) {
                break L1;
              } else {
                ((una) this).field_e = 104;
                break L1;
              }
            }
            L2: {
              if (null == ((una) this).field_b) {
                break L2;
              } else {
                ((una) this).field_c = 0;
                L3: while (true) {
                  if (((una) this).field_b.length <= ((una) this).field_c) {
                    ((una) this).field_c = -1;
                    break L2;
                  } else {
                    ((una) this).field_b[((una) this).field_c].a(param1, -40);
                    ((una) this).field_c = ((una) this).field_c + 1;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("una.N(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static int a(int param0, kb param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (param0 == -29328) {
              break L0;
            } else {
              field_f = null;
              break L0;
            }
          }
          if (ep.field_o == param1) {
            stackOut_18_0 = 6407;
            stackIn_19_0 = stackOut_18_0;
            return stackIn_19_0;
          } else {
            if (param1 == qua.field_d) {
              stackOut_16_0 = 6408;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0;
            } else {
              if (nw.field_p == param1) {
                stackOut_14_0 = 6406;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              } else {
                if (param1 != gka.field_p) {
                  if (wh.field_o != param1) {
                    if (qf.field_o != param1) {
                      throw new IllegalStateException();
                    } else {
                      stackOut_12_0 = 6145;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  } else {
                    stackOut_9_0 = 6410;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  stackOut_6_0 = 6409;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("una.M(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final void a(int param0, int param1, pe param2) {
        bba var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((una) this).field_b) {
                break L1;
              } else {
                if (((una) this).field_g < 0) {
                  break L1;
                } else {
                  if (((una) this).field_b.length <= ((una) this).field_g) {
                    break L1;
                  } else {
                    var4 = ((una) this).field_b[((una) this).field_g];
                    var5 = var4.a((byte) 127, ((una) this).field_e, param1);
                    var4.a(var5 + -1, -61, param1, ((una) this).field_e, param2);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param0 == 1) {
                break L2;
              } else {
                field_f = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("una.I(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        una var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
                var4 = 26 % ((22 - param0) / 59);
                var3 = (una) (Object) param1;
                if (dn.a((tv[]) (Object) var3.field_b, false, 1, (tv[]) (Object) var3.field_b, 119)) {
                  break L2;
                } else {
                  if (var3.field_g != var3.field_g) {
                    break L2;
                  } else {
                    if (var3.field_e != var3.field_e) {
                      break L2;
                    } else {
                      int discarded$3 = 28;
                      if (!wpb.a(var3.field_d, var3.field_d)) {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("una.C(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        una var3 = null;
        try {
            var3 = (una) (Object) param1;
            int discarded$0 = 0;
            var3.field_b = (bba[]) (Object) sqb.a((tv[]) (Object) var3.field_b, (tv[]) (Object) var3.field_b, 1, vtb.field_o);
            var3.field_e = var3.field_e;
            if (param0 <= 54) {
                ((una) this).field_d = null;
            }
            var3.field_g = var3.field_g;
            var3.field_d = dob.a(var3.field_d, (byte) -59, var3.field_d);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "una.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(rna param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (((una) this).field_b == null) {
                break L1;
              } else {
                if (0 > ((una) this).field_g) {
                  break L1;
                } else {
                  if (((una) this).field_b.length > ((una) this).field_g) {
                    ((una) this).field_b[((una) this).field_g].a(param0, true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (param1 == 0) {
                break L2;
              } else {
                una.a((byte) 108);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("una.R(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void g(byte param0) {
        if (param0 != 82) {
            return;
        }
        if (((una) this).field_b != null) {
            ((una) this).field_g = (1 + ((una) this).field_g) % ((una) this).field_b.length;
            ((una) this).field_e = 0;
        }
    }

    public static void a(byte param0) {
        if (param0 != -98) {
            field_f = null;
        }
        field_a = null;
        field_f = null;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        una var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var5 = (una) (Object) param0;
              boolean discarded$2 = tja.a((ntb[]) (Object) var5.field_b, 1, (ntb[]) (Object) var5.field_b, false, 5547);
              var4 = 0;
              if (dn.a((tv[]) (Object) var5.field_b, false, 1, (tv[]) (Object) var5.field_b, 115)) {
                var4 = 1;
                System.out.println("MissionEvent[] events has changed. ");
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_g != var5.field_g) {
                System.out.println("int selected_event has changed. before=" + var5.field_g + ", now=" + var5.field_g);
                var4 = 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var5.field_e != var5.field_e) {
                System.out.println("int selected_condition_or_action has changed. before=" + var5.field_e + ", now=" + var5.field_e);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              int discarded$3 = 0;
              if (!ikb.a(var5.field_d, var5.field_d)) {
                break L4;
              } else {
                var4 = 1;
                System.out.println("int[] reserved_ids has changed. ");
                break L4;
              }
            }
            if (param1 <= -19) {
              L5: {
                if (var4 == 0) {
                  break L5;
                } else {
                  System.out.println("This instance of MissionControl has changed");
                  break L5;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("una.F(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0) {
        bba var2 = new bba();
        ((una) this).field_b = (bba[]) (Object) ija.a((Object) (Object) var2, (Object[]) (Object) ((una) this).field_b, param0, vtb.field_o);
        ((una) this).field_g = -1 + ((una) this).field_b.length;
    }

    final void c(byte param0) {
        Object var3 = null;
        L0: {
          if (param0 == 55) {
            break L0;
          } else {
            var3 = null;
            boolean discarded$2 = ((una) this).a((byte) -25, (tv) null);
            break L0;
          }
        }
        L1: {
          if (((una) this).field_c >= 0) {
            ((una) this).field_b = (bba[]) (Object) dt.a(vtb.field_o, ((una) this).field_c, param0 ^ 15620, (Object[]) (Object) ((una) this).field_b);
            ((una) this).field_c = ((una) this).field_c - 1;
            break L1;
          } else {
            L2: {
              ((una) this).field_b = (bba[]) (Object) dt.a(vtb.field_o, ((una) this).field_g, 15667, (Object[]) (Object) ((una) this).field_b);
              if (null == ((una) this).field_b) {
                break L2;
              } else {
                if (((una) this).field_b.length > ((una) this).field_g) {
                  break L2;
                } else {
                  ((una) this).field_g = -1 + ((una) this).field_b.length;
                  break L2;
                }
              }
            }
            L3: {
              if (null == ((una) this).field_b) {
                break L3;
              } else {
                if (((una) this).field_b.length != 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            ((una) this).field_g = 0;
            break L1;
          }
        }
    }

    final void a(boolean param0, pe param1, int param2) {
        bba var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((una) this).field_b) {
                break L1;
              } else {
                if (0 > ((una) this).field_g) {
                  break L1;
                } else {
                  if (((una) this).field_b.length <= ((una) this).field_g) {
                    break L1;
                  } else {
                    var4 = ((una) this).field_b[((una) this).field_g];
                    var5 = var4.a((byte) -82, ((una) this).field_e, param2);
                    var4.a(1 + var5, 118, param2, ((una) this).field_e, param1);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((una) this).field_e = 56;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("una.J(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
    }

    private final void d() {
        int var2 = 0;
        bba[] var3 = null;
        int var4 = 0;
        bba var5 = null;
        wm[] var6 = null;
        rna[] var7 = null;
        int var9 = 0;
        wm var10 = null;
        rna var10_ref = null;
        int var12 = 0;
        wm[] var13 = null;
        rna[] var14 = null;
        int var15 = 0;
        wm var16 = null;
        Object var17 = null;
        rna var18 = null;
        Object var19 = null;
        hd var20 = null;
        hd var21 = null;
        L0: {
          var17 = null;
          var19 = null;
          var12 = VoidHunters.field_G;
          var2 = 43;
          ((una) this).field_d = null;
          if (((una) this).field_b == null) {
            break L0;
          } else {
            var3 = ((una) this).field_b;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var3[var4];
                  var6 = var5.a((byte) -115);
                  var7 = var5.c((byte) -42);
                  if (var6 != null) {
                    var13 = var6;
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var13.length) {
                        break L2;
                      } else {
                        var16 = var13[var9];
                        var10 = var16;
                        if (var10 instanceof hd) {
                          var20 = (hd) (Object) var16;
                          ((una) this).field_d = var20.a(121, ((una) this).field_d);
                          var9++;
                          continue L3;
                        } else {
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (var7 != null) {
                  var14 = var7;
                  var15 = 0;
                  var9 = var15;
                  L4: while (true) {
                    if (var14.length > var15) {
                      var18 = var14[var15];
                      var10_ref = var18;
                      if (var10_ref instanceof hd) {
                        var21 = (hd) (Object) var18;
                        ((una) this).field_d = var21.a(114, ((una) this).field_d);
                        var15++;
                        continue L4;
                      } else {
                        var15++;
                        continue L4;
                      }
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final bba[] b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((una) this).a(23, (rsb) null);
        }
        return ((una) this).field_b;
    }

    public una() {
        ((una) this).field_c = -1;
    }

    final void a(int param0) {
        bba var2 = null;
        if (param0 != -828) {
            ((una) this).field_g = 33;
        }
        if (null != ((una) this).field_b) {
            if (((una) this).field_g >= 0) {
                if (((una) this).field_g < ((una) this).field_b.length) {
                    var2 = ((una) this).field_b[((una) this).field_g];
                    var2.a(((una) this).field_e, -1);
                }
            }
        }
    }

    final void a(int param0, bba param1) {
        try {
            ((una) this).field_b = (bba[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((una) this).field_b, param0, vtb.field_o);
            int discarded$0 = -111;
            this.d();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "una.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "Maximum ship size reached";
    }
}
