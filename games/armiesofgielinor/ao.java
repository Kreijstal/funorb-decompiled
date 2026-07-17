/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends lk {
    private ip[] field_w;
    static String field_u;
    static String field_x;
    private ip field_v;

    final static void a(int param0, int param1, int param2, bv param3, int param4) {
        try {
            int var5_int = 58 / ((param1 - -86) / 38);
            if (param2 < param4) {
                param3.c(param0, (byte) 0);
                int discarded$0 = ir.a(14, 20, param4, 30, 1, 4, param3);
            }
            param3.d((byte) -83, param4 + param2 + param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ao.B(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static String a(String param0, boolean param1, String param2, kl param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!param3.a((byte) 82)) {
              stackOut_2_0 = (String) param0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1) {
                stackOut_7_0 = param2 + " - " + param3.a(0) + "%";
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (String) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ao.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          L2: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_8_0;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        ip var7 = null;
        ip var9 = null;
        fw var10 = null;
        ip var11 = null;
        ip var12 = null;
        ip var13 = null;
        ip var14 = null;
        kb stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof fw) {
                stackOut_2_0 = (kb) param0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (kb) (Object) stackOut_1_0;
                break L1;
              }
            }
            var10 = (fw) (Object) stackIn_3_0;
            id.a(param1 + param0.field_B, param0.field_l + (param0.field_B + param1), param0.field_p + (param4 - -param0.field_w), param4 - -param0.field_p, (byte) 72);
            if (param2 < -79) {
              L2: {
                if (var10 == null) {
                  break L2;
                } else {
                  param3 = param3 & var10.field_I;
                  break L2;
                }
              }
              L3: {
                var7 = ((ao) this).field_w[0];
                ((ao) this).field_v.a(false);
                var7.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                if (var10 != null) {
                  L4: {
                    if (!var10.field_K) {
                      break L4;
                    } else {
                      var11 = ((ao) this).field_w[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                        break L4;
                      }
                    }
                  }
                  if (var10.field_t) {
                    L5: {
                      var12 = ((ao) this).field_w[3];
                      if (0 == var10.field_q) {
                        break L5;
                      } else {
                        if (var12 != null) {
                          var12.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var9 = ((ao) this).field_w[2];
                    if (var9 != null) {
                      var9.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                      break L3;
                    } else {
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
                if (!param0.a(false)) {
                  break L6;
                } else {
                  var13 = ((ao) this).field_w[5];
                  if (var13 != null) {
                    var13.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (!param3) {
                  var14 = ((ao) this).field_w[4];
                  if (var14 == null) {
                    break L7;
                  } else {
                    var14.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              ((ao) this).field_v.a(param0, (byte) 113, param4, param1, (ao) this);
              rf.b(-18862);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var6;
            stackOut_31_1 = new StringBuilder().append("ao.C(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, wk param1) {
        ip[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        ip[] var7 = null;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var7 = ((ao) this).field_w;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_j = param1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ao.D(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    ao(ao param0, boolean param1) {
        this();
        try {
            param0.a(param1, (ao) this, 6);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ao.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(byte param0) {
        field_x = null;
        field_u = null;
        int var1 = -50;
    }

    public ao() {
        ((ao) this).field_w = new ip[6];
        ((ao) this).field_v = new ip();
        ip dupTemp$0 = new ip();
        ((ao) this).field_w[0] = dupTemp$0;
        ip var1 = dupTemp$0;
        var1.a(false);
    }

    final void a(int param0, wk[] param1) {
        ip[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
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
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = ((ao) this).field_w;
              var4 = 0;
              if (param0 < -123) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_d = param1;
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
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ao.A(").append(param0).append(44);
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
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final ip a(int param0, byte param1) {
        if (param1 >= -69) {
            ip discarded$0 = ((ao) this).a(-22, (byte) -18);
        }
        ip dupTemp$1 = new ip();
        ((ao) this).field_w[param0] = dupTemp$1;
        return dupTemp$1;
    }

    final void a(wk[] param0, int param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (null == ((ao) this).field_w[var4_int]) {
                ((ao) this).field_w[var4_int] = new ip();
            }
            if (param2 != -7) {
                Object var5 = null;
                ((ao) this).a((wk[]) null, 15, 64);
            }
            ((ao) this).field_w[param1].field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ao.HA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(boolean param0, ao param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ip var5 = null;
        ip var6 = null;
        int var7 = 0;
        Object var8 = null;
        ip stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ip stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ip stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ip stackIn_12_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        ip stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ip stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ip stackOut_11_2 = null;
        ip stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ip stackOut_10_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 6) {
                break L1;
              } else {
                var8 = null;
                this.a(false, (ao) null, 119);
                break L1;
              }
            }
            L2: {
              super.a((lk) (Object) param1, 24978);
              if (param0) {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= 6) {
                    break L2;
                  } else {
                    L4: {
                      var5 = ((ao) this).field_w[var4_int];
                      if (var5 != null) {
                        L5: {
                          var6 = param1.field_w[var4_int];
                          stackOut_9_0 = (ip) var5;
                          stackOut_9_1 = 0;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 == null) {
                            ip dupTemp$25 = new ip();
                            param1.field_w[var4_int] = dupTemp$25;
                            stackOut_11_0 = (ip) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = (ip) dupTemp$25;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            break L5;
                          } else {
                            stackOut_10_0 = (ip) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (ip) var6;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            break L5;
                          }
                        }
                        ((ip) (Object) stackIn_12_0).a(stackIn_12_1 != 0, stackIn_12_2);
                        break L4;
                      } else {
                        param1.field_w[var4_int] = null;
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                vm.a((Object[]) (Object) ((ao) this).field_w, 0, (Object[]) (Object) param1.field_w, 0, 6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ao.FA(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Tonics to strengthen your troops.";
        field_x = "Portals can only be made on open ground";
    }
}
