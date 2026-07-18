/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bb extends bj {
    static String field_O;
    static java.applet.Applet field_P;
    static cn field_L;
    static int field_H;
    private int field_N;
    static String field_J;
    static String field_K;
    static int[] field_R;
    private tb field_Q;
    boolean field_G;
    static String field_I;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param0 == -13907) {
          L0: {
            var2 = this.k(-1);
            var3 = var2 - ((bb) this).field_N;
            if (0 < var3) {
              ((bb) this).field_N = ((bb) this).field_N + (8 + var3 + -1) / 8;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var3 >= 0) {
              break L1;
            } else {
              ((bb) this).field_N = ((bb) this).field_N + (1 + (var3 - 16)) / 16;
              break L1;
            }
          }
          L2: {
            L3: {
              if (0 != ((bb) this).field_N) {
                break L3;
              } else {
                if (0 != var2) {
                  break L3;
                } else {
                  if (((bb) this).field_G) {
                    break L3;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
              }
            }
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L2;
          }
          return stackIn_12_0 != 0;
        } else {
          return false;
        }
    }

    final hm a(boolean param0) {
        hm var2 = super.a(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (hm) this;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (0 == ((bb) this).field_N) {
          return;
        } else {
          if (((bb) this).field_N < 256) {
            L0: {
              L1: {
                if (li.field_r == null) {
                  break L1;
                } else {
                  if (li.field_r.field_s < ((bb) this).field_g) {
                    break L1;
                  } else {
                    if (((bb) this).field_x > li.field_r.field_x) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              li.field_r = new ed(((bb) this).field_g, ((bb) this).field_x);
              break L0;
            }
            L2: {
              eo.a(li.field_r, (byte) -76);
              em.d();
              ((bb) this).b(0, 0, (byte) 87);
              super.a(-((bb) this).field_j + -param0, (byte) 118, param2, -((bb) this).field_k + -param3);
              if (param1 > 85) {
                break L2;
              } else {
                field_L = null;
                break L2;
              }
            }
            dl.a((byte) 125);
            li.field_r.d(((bb) this).field_k + param3, ((bb) this).field_j + param0, ((bb) this).field_N);
            return;
          } else {
            if (param2 != 0) {
              return;
            } else {
              ((bb) this).b(((bb) this).field_j + param0, param3 - -((bb) this).field_k, (byte) 89);
              super.a(param0, (byte) 87, param2, param3);
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, te param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var20 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var6_int = (param5 - param1 << 8) / param3.field_a;
              param0 = param0 + param3.field_f;
              param4 = param4 + param3.field_i;
              var7 = var6_int * param3.field_f + (param1 << 8);
              var8 = param4 * em.field_l + param0;
              var9 = 0;
              var10 = param3.field_d;
              var11 = param3.field_g;
              var12 = -var11 + em.field_l;
              var13 = 0;
              if (em.field_k <= param4) {
                break L1;
              } else {
                var14 = em.field_k - param4;
                var10 = var10 - var14;
                var8 = var8 + em.field_l * var14;
                param4 = em.field_k;
                var9 = var9 + var14 * var11;
                break L1;
              }
            }
            L2: {
              if (param4 + var10 > em.field_j) {
                var10 = var10 - (var10 + param4 + -em.field_j);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (~param0 > ~em.field_a) {
                var14 = -param0 + em.field_a;
                var8 = var8 + var14;
                var7 = var7 + var6_int * var14;
                param0 = em.field_a;
                var11 = var11 - var14;
                var9 = var9 + var14;
                var12 = var12 + var14;
                var13 = var13 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~(var11 + param0) < ~em.field_b) {
                var14 = -em.field_b + var11 + param0;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 > 0) {
                  param4 = -var10;
                  L6: while (true) {
                    if (0 <= param4) {
                      break L0;
                    } else {
                      var14 = var7;
                      param0 = -var11;
                      L7: while (true) {
                        if (0 <= param0) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param4++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var16 = 256 - var15;
                            var14 = var14 + var6_int;
                            if (var15 < 0) {
                              var8++;
                              var9++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param3.field_l[param3.field_k[incrementValue$1] & 255];
                                if (var17 == 0) {
                                  break L9;
                                } else {
                                  if (255 >= var15) {
                                    var18 = em.field_i[var8];
                                    var19 = 16711935 & var15 * (16711935 & var17) + var16 * (var18 & 16711935) >> 8;
                                    em.field_i[var8] = (ae.a(ae.a(var17, 65280) * var15 + var16 * ae.a(var18, 65280), 16711906) >> 8) + var19;
                                    break L9;
                                  } else {
                                    em.field_i[var8] = var17;
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param0++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("bb.DA(").append(param0).append(',').append(param1).append(',').append(4163).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param3 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (0 > param3) {
                break L0;
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param1;
                var7 = param2;
                var9[var6] = ae.a(var9[var6] >> 1, 8355711) + var7;
                param1++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("bb.L(").append(-23466).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public static void h(byte param0) {
        field_P = null;
        field_L = null;
        field_R = null;
        field_I = null;
        field_J = null;
        field_O = null;
        field_K = null;
    }

    bb(tb param0, int param1, int param2) {
        super(dm.field_h + -param1 >> 1, r.field_B - param2 >> 1, param1, param2, (db) null);
        try {
            ((bb) this).field_G = false;
            ((bb) this).field_N = 0;
            ((bb) this).field_Q = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, byte param2);

    private final int k(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          if (!((bb) this).field_G) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if ((Object) (Object) ((bb) this).field_Q.n(0) == this) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        return stackIn_5_0;
    }

    final static String[] a(int param0, String param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        CharSequence var11 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var11 = (CharSequence) (Object) param1;
              var3_int = un.a(var11, 4277, param2);
              var4 = new String[var3_int - -1];
              if (param0 <= -127) {
                break L1;
              } else {
                var10 = null;
                String[] discarded$4 = bb.a(119, (String) null, 'e');
                break L1;
              }
            }
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= var3_int) {
                var4[var3_int] = param1.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param1.charAt(var8) == param2) {
                    int incrementValue$5 = var5;
                    var5++;
                    var4[incrementValue$5] = param1.substring(var6, var8);
                    var6 = var8 + 1;
                    var7++;
                    continue L2;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("bb.U(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    boolean a(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -106 / ((param0 - 7) / 55);
            ((bb) this).field_N = this.k(-1);
            if (((bb) this).field_N != 0) {
              break L1;
            } else {
              if (((bb) this).field_G) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        if (param0 != 255) {
            field_K = null;
        }
        ((bb) this).a(param2, -param1 + r.field_B >> 1, -param2 + dm.field_h >> 1, true, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Back";
        field_H = 0;
        field_J = "Cancel";
        field_R = new int[]{1, 160};
        field_K = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_I = "to keep fullscreen or";
    }
}
