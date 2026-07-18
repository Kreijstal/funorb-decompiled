/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends a {
    static mf field_E;
    static String field_F;
    private sn field_C;
    private sn[] field_A;
    static int[][] field_D;
    static String field_G;
    static int[] field_J;
    static int[] field_I;
    static int field_B;
    static String field_K;

    private final void a(byte param0, bc param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        sn var5 = null;
        sn var6 = null;
        int var7 = 0;
        sn stackIn_8_0 = null;
        sn stackIn_9_0 = null;
        sn stackIn_10_0 = null;
        sn stackIn_10_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        sn stackOut_7_0 = null;
        sn stackOut_9_0 = null;
        sn stackOut_9_1 = null;
        sn stackOut_8_0 = null;
        sn stackOut_8_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(-12253, (a) (Object) param1);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((bc) this).field_A[var4_int];
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_A[var4_int];
                          stackOut_7_0 = (sn) var5;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var6 == null) {
                            sn dupTemp$3 = new sn();
                            param1.field_A[var4_int] = dupTemp$3;
                            stackOut_9_0 = (sn) (Object) stackIn_9_0;
                            stackOut_9_1 = (sn) dupTemp$3;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L4;
                          } else {
                            stackOut_8_0 = (sn) (Object) stackIn_8_0;
                            stackOut_8_1 = (sn) var6;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L4;
                          }
                        }
                        ((sn) (Object) stackIn_10_0).a(stackIn_10_1, 1);
                        break L3;
                      } else {
                        param1.field_A[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                an.a((Object[]) (Object) ((bc) this).field_A, 0, (Object[]) (Object) param1.field_A, 0, 6);
                break L1;
              }
            }
            var4_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("bc.I(").append(-117).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, ck[] param1, int param2) {
        int var4_int = 0;
        try {
            if (param0 <= 97) {
                Object var5 = null;
                ((bc) this).a(true, -54, 87, (byte) -121, (ce) null);
            }
            var4_int = param2;
            if (((bc) this).field_A[var4_int] == null) {
                ((bc) this).field_A[var4_int] = new sn();
            }
            ((bc) this).field_A[param2].field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "bc.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    bc(bc param0, boolean param1) {
        this();
        try {
            param0.a((byte) -117, (bc) this, param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public bc() {
        ((bc) this).field_A = new sn[6];
        ((bc) this).field_C = new sn();
        sn dupTemp$0 = new sn();
        ((bc) this).field_A[0] = dupTemp$0;
        sn var1 = dupTemp$0;
        var1.b((byte) 68);
    }

    final sn a(int param0, int param1) {
        if (param1 <= 0) {
            field_E = null;
        }
        sn dupTemp$0 = new sn();
        ((bc) this).field_A[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var2_int) {
                stackOut_18_0 = new String(var10);
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param0.charAt(var4);
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (var5 > 90) {
                        break L4;
                      } else {
                        var3[var4] = (char)(-65 + (var5 + 97));
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 > 57) {
                          break L7;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var3[var4] = '_';
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("bc.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 65 + ')');
        }
        return stackIn_19_0;
    }

    public final void a(boolean param0, int param1, int param2, byte param3, ce param4) {
        RuntimeException var6 = null;
        sn var7 = null;
        sn var9 = null;
        Object var10 = null;
        ek var11 = null;
        sn var12 = null;
        sn var13 = null;
        sn var14 = null;
        sn var15 = null;
        ce stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof ek) {
                stackOut_2_0 = (ce) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ce) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ek) (Object) stackIn_3_0;
              gg.a(param4.field_D + param2, 20763, param4.field_t + param4.field_u + param1, param1 - -param4.field_u, param4.field_D + param2 + param4.field_y);
              if (var11 != null) {
                param0 = param0 & var11.field_I;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((bc) this).field_A[0];
              ((bc) this).field_C.b((byte) 80);
              var7.a(((bc) this).field_C, (bc) this, 122, param2, param1, param4);
              if (var11 != null) {
                L4: {
                  if (!var11.field_H) {
                    break L4;
                  } else {
                    var12 = ((bc) this).field_A[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(((bc) this).field_C, (bc) this, 127, param2, param1, param4);
                      break L4;
                    }
                  }
                }
                if (var11.field_q) {
                  L5: {
                    var13 = ((bc) this).field_A[3];
                    if (var11.field_o == 0) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(((bc) this).field_C, (bc) this, 122, param2, param1, param4);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = ((bc) this).field_A[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(((bc) this).field_C, (bc) this, 126, param2, param1, param4);
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param4.a(true)) {
                var14 = ((bc) this).field_A[5];
                if (var14 != null) {
                  var14.a(((bc) this).field_C, (bc) this, 126, param2, param1, param4);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!param0) {
                var15 = ((bc) this).field_A[4];
                if (var15 != null) {
                  var15.a(((bc) this).field_C, (bc) this, 124, param2, param1, param4);
                  break L7;
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              ((bc) this).field_C.a(-2, param4, param1, (bc) this, param2);
              mk.a((byte) -5);
              if (param3 <= -60) {
                break L8;
              } else {
                var10 = null;
                ((bc) this).a(true, -61, 21, (byte) -12, (ce) null);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("bc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param4 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    final void a(ck param0, int param1) {
        sn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var7 = ((bc) this).field_A;
              var3 = var7;
              if (param1 == 2) {
                break L1;
              } else {
                field_F = null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_b = param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("bc.G(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final void a(ck[] param0, boolean param1) {
        sn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = 0;
        sn[] var7 = null;
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
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            var7 = ((bc) this).field_A;
            var3 = var7;
            var4 = 0;
            if (!param1) {
              L1: while (true) {
                if (var4 >= var7.length) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_a = param0;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("bc.A(");
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
          throw dh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_F = null;
        field_J = null;
        field_D = null;
        field_K = null;
        field_I = null;
        field_G = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "No spectators";
        field_I = new int[8192];
        field_G = "Allow spectators?";
        field_K = "To play a multiplayer game, please log in or create a free account.";
    }
}
