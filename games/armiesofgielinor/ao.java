/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends lk {
    private ip[] field_w;
    static String field_u;
    static String field_x;
    private ip field_v;

    final static void a(int param0, int param1, int param2, bv param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 58 / ((param1 - -86) / 38);
              if (~param2 <= ~param4) {
                break L1;
              } else {
                param3.c(param0, (byte) 0);
                int discarded$3 = ir.a(14, 20, param4, 30, 1, 4, param3);
                break L1;
              }
            }
            param3.d((byte) -83, param4 + param2 + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ao.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ')');
        }
    }

    final static String a(String param0, boolean param1, String param2, kl param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (!param3.a((byte) 82)) {
              stackOut_3_0 = (String) param0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1) {
                stackOut_8_0 = param2 + " - " + param3.a(0) + "%";
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ao.E(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          L3: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_9_0;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        fw var6_ref = null;
        ip var7 = null;
        ip var8 = null;
        ip var9 = null;
        kb stackIn_4_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        kb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            L1: {
              if (param0 instanceof fw) {
                stackOut_3_0 = (kb) param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_4_0 = (kb) (Object) stackOut_1_0;
                break L1;
              }
            }
            var6_ref = (fw) (Object) stackIn_4_0;
            id.a(param1 + param0.field_B, param0.field_l + (param0.field_B + param1), param0.field_p + (param4 - -param0.field_w), param4 - -param0.field_p, (byte) 72);
            if (param2 < -79) {
              L2: {
                if (var6_ref == null) {
                  break L2;
                } else {
                  param3 = param3 & var6_ref.field_I;
                  break L2;
                }
              }
              L3: {
                var7 = ((ao) this).field_w[0];
                ((ao) this).field_v.a(false);
                var7.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                if (null != var6_ref) {
                  L4: {
                    if (!var6_ref.field_K) {
                      break L4;
                    } else {
                      var8 = ((ao) this).field_w[1];
                      if (null == var8) {
                        break L4;
                      } else {
                        var8.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                        break L4;
                      }
                    }
                  }
                  if (var6_ref.field_t) {
                    L5: {
                      L6: {
                        var8 = ((ao) this).field_w[3];
                        if (0 == var6_ref.field_q) {
                          break L6;
                        } else {
                          if (null != var8) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var9 = ((ao) this).field_w[2];
                        if (null != var9) {
                          var9.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (!ArmiesOfGielinor.field_M) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                    var8.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L8: {
                if (!param0.a(false)) {
                  break L8;
                } else {
                  var8 = ((ao) this).field_w[5];
                  if (var8 != null) {
                    var8.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (!param3) {
                  var8 = ((ao) this).field_w[4];
                  if (null == var8) {
                    break L9;
                  } else {
                    var8.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L9;
                  }
                } else {
                  break L9;
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
          L10: {
            var6 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var6;
            stackOut_42_1 = new StringBuilder().append("ao.C(");
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L10;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, wk param1) {
        RuntimeException runtimeException = null;
        ip[] var3 = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3 = ((ao) this).field_w;
            var4 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3.length <= var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var5 != null) {
                          var5.field_j = param1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ao.D(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    ao(ao param0, boolean param1) {
        this();
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            param0.a(param1, (ao) this, 6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ao.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_x = null;
            field_u = null;
            int var1_int = 101 / ((param0 - -45) / 33);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ao.EA(" + param0 + ')');
        }
    }

    public ao() {
        ip var1 = null;
        ((ao) this).field_w = new ip[6];
        ((ao) this).field_v = new ip();
        try {
            ip dupTemp$0 = new ip();
            ((ao) this).field_w[0] = dupTemp$0;
            var1 = dupTemp$0;
            var1.a(false);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ao.<init>()");
        }
    }

    final void a(int param0, wk[] param1) {
        RuntimeException runtimeException = null;
        ip[] var3 = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
              L3: {
                L4: {
                  if (~var4 <= ~var3.length) {
                    break L4;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (null != var5) {
                          var5.field_d = param1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ao.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final ip a(int param0, byte param1) {
        RuntimeException var3 = null;
        ip stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        ip stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 < -69) {
                break L1;
              } else {
                ip discarded$4 = ((ao) this).a(-22, (byte) -18);
                break L1;
              }
            }
            ip dupTemp$5 = new ip();
            ((ao) this).field_w[param0] = dupTemp$5;
            stackOut_3_0 = (ip) dupTemp$5;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var3, "ao.GA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final void a(wk[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (null != ((ao) this).field_w[var4_int]) {
                break L1;
              } else {
                ((ao) this).field_w[var4_int] = new ip();
                break L1;
              }
            }
            L2: {
              if (param2 == -7) {
                break L2;
              } else {
                ((ao) this).a((wk[]) null, 15, 64);
                break L2;
              }
            }
            ((ao) this).field_w[param1].field_d = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ao.HA(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, ao param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ip var5 = null;
        ip var6 = null;
        int var7 = 0;
        ip stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ip stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ip stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ip stackIn_21_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        ip stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ip stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        ip stackOut_20_2 = null;
        ip stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ip stackOut_18_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 6) {
                break L1;
              } else {
                this.a(false, (ao) null, 119);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  super.a((lk) (Object) param1, 24978);
                  if (param0) {
                    break L4;
                  } else {
                    vm.a((Object[]) (Object) ((ao) this).field_w, 0, (Object[]) (Object) param1.field_w, 0, 6);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_int = 0;
                L5: while (true) {
                  if (var4_int >= 6) {
                    break L3;
                  } else {
                    var5 = ((ao) this).field_w[var4_int];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L6: {
                        L7: {
                          if (var5 != null) {
                            break L7;
                          } else {
                            param1.field_w[var4_int] = null;
                            if (var7 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var6 = param1.field_w[var4_int];
                          stackOut_17_0 = (ip) var5;
                          stackOut_17_1 = 0;
                          stackIn_20_0 = stackOut_17_0;
                          stackIn_20_1 = stackOut_17_1;
                          stackIn_18_0 = stackOut_17_0;
                          stackIn_18_1 = stackOut_17_1;
                          if (var6 == null) {
                            ip dupTemp$1 = new ip();
                            param1.field_w[var4_int] = dupTemp$1;
                            stackOut_20_0 = (ip) (Object) stackIn_20_0;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = (ip) dupTemp$1;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            break L8;
                          } else {
                            stackOut_18_0 = (ip) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = (ip) var6;
                            stackIn_21_0 = stackOut_18_0;
                            stackIn_21_1 = stackOut_18_1;
                            stackIn_21_2 = stackOut_18_2;
                            break L8;
                          }
                        }
                        ((ip) (Object) stackIn_21_0).a(stackIn_21_1 != 0, stackIn_21_2);
                        break L6;
                      }
                      var4_int++;
                      if (var7 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4;
            stackOut_24_1 = new StringBuilder().append("ao.FA(").append(param0).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L9;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ')');
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
