/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gha {
    private tc[] field_u;
    private tc field_y;
    static int[] field_x;
    static eaa field_t;
    static sna field_v;
    static kv[] field_w;

    wd(wd param0, boolean param1) {
        this();
        try {
            param0.a((wd) this, (byte) 110, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, kv[] param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (param1 <= 62) {
                field_t = null;
            }
            if (!(null != ((wd) this).field_u[var4_int])) {
                ((wd) this).field_u[var4_int] = new tc();
            }
            ((wd) this).field_u[param0].field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wd.GA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        tc var7 = null;
        tc var9 = null;
        hf var10 = null;
        tc var11 = null;
        tc var12 = null;
        tc var13 = null;
        tc var14 = null;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        wj stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (!(param1 instanceof hf)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (wj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (wj) param1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (hf) (Object) stackIn_3_0;
              ah.a(param0 + param1.field_s + param1.field_p, (byte) 110, param3 + param1.field_v, param0 - -param1.field_s, param1.field_q + param3 + param1.field_v);
              if (var10 == null) {
                break L2;
              } else {
                param4 = param4 & var10.field_z;
                break L2;
              }
            }
            var7 = ((wd) this).field_u[0];
            if (param2 == 32679) {
              L3: {
                ((wd) this).field_y.a(11);
                var7.a((wd) this, param0, param1, (byte) -105, ((wd) this).field_y, param3);
                if (var10 == null) {
                  break L3;
                } else {
                  L4: {
                    if (!var10.field_B) {
                      break L4;
                    } else {
                      var11 = ((wd) this).field_u[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a((wd) this, param0, param1, (byte) -58, ((wd) this).field_y, param3);
                        break L4;
                      }
                    }
                  }
                  if (var10.field_t) {
                    L5: {
                      var12 = ((wd) this).field_u[3];
                      if (var10.field_u == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a((wd) this, param0, param1, (byte) -60, ((wd) this).field_y, param3);
                          break L3;
                        }
                      }
                    }
                    var9 = ((wd) this).field_u[2];
                    if (var9 != null) {
                      var9.a((wd) this, param0, param1, (byte) -58, ((wd) this).field_y, param3);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (!param1.e(1023)) {
                  break L6;
                } else {
                  var13 = ((wd) this).field_u[5];
                  if (var13 != null) {
                    var13.a((wd) this, param0, param1, (byte) -124, ((wd) this).field_y, param3);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param4) {
                  break L7;
                } else {
                  var14 = ((wd) this).field_u[4];
                  if (var14 == null) {
                    break L7;
                  } else {
                    var14.a((wd) this, param0, param1, (byte) 74, ((wd) this).field_y, param3);
                    break L7;
                  }
                }
              }
              ((wd) this).field_y.a(param3, (wd) this, param1, param2 + -32752, param0);
              db.b(83);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("wd.A(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final tc a(int param0, byte param1) {
        if (param1 != 78) {
            Object var4 = null;
            wd.a((byte) -9, (java.awt.Canvas) null);
        }
        tc dupTemp$0 = new tc();
        ((wd) this).field_u[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void c(int param0) {
        field_w = null;
        field_x = null;
        field_v = null;
        field_t = null;
        if (param0 != 1) {
            Object var2 = null;
            wd.a((java.math.BigInteger) null, (byte) 93, (lu) null, (lu) null, (java.math.BigInteger) null);
        }
    }

    private final void a(wd param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tc var6 = null;
        tc var7 = null;
        int var8 = 0;
        tc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        tc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        tc stackIn_8_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        tc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        tc stackOut_7_2 = null;
        tc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tc stackOut_6_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = 99 / ((param1 - 76) / 34);
              super.a(-85, (gha) (Object) param0);
              if (!param2) {
                bl.a((Object[]) (Object) ((wd) this).field_u, 0, (Object[]) (Object) param0.field_u, 0, 6);
                break L1;
              } else {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 6) {
                    break L1;
                  } else {
                    L3: {
                      var6 = ((wd) this).field_u[var5];
                      if (var6 == null) {
                        param0.field_u[var5] = null;
                        break L3;
                      } else {
                        L4: {
                          var7 = param0.field_u[var5];
                          stackOut_5_0 = (tc) var6;
                          stackOut_5_1 = 8;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          if (var7 == null) {
                            tc dupTemp$17 = new tc();
                            param0.field_u[var5] = dupTemp$17;
                            stackOut_7_0 = (tc) (Object) stackIn_7_0;
                            stackOut_7_1 = stackIn_7_1;
                            stackOut_7_2 = (tc) dupTemp$17;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            break L4;
                          } else {
                            stackOut_6_0 = (tc) (Object) stackIn_6_0;
                            stackOut_6_1 = stackIn_6_1;
                            stackOut_6_2 = (tc) var7;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            break L4;
                          }
                        }
                        ((tc) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                        break L3;
                      }
                    }
                    var5++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("wd.DA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(kv param0, int param1) {
        tc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        tc[] var7 = null;
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 < -73) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            var7 = ((wd) this).field_u;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param0;
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
            stackOut_10_1 = new StringBuilder().append("wd.D(");
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
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    public wd() {
        ((wd) this).field_u = new tc[6];
        ((wd) this).field_y = new tc();
        tc dupTemp$0 = new tc();
        ((wd) this).field_u[0] = dupTemp$0;
        tc var1 = dupTemp$0;
        var1.a(11);
    }

    final static void a(java.math.BigInteger param0, byte param1, lu param2, lu param3, java.math.BigInteger param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
        try {
          L0: {
            L1: {
              fn.a((byte) -68, 0, param0, param4, param2, param3.field_h, param3.field_g);
              if (param1 < -50) {
                break L1;
              } else {
                wd.c(36);
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
            stackOut_3_1 = new StringBuilder().append("wd.B(");
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
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          L5: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final void a(byte param0, kv[] param1) {
        tc[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        Object var7 = null;
        tc[] var8 = null;
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
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var8 = ((wd) this).field_u;
            var3 = var8;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var8.length) {
                L2: {
                  if (param0 == 95) {
                    break L2;
                  } else {
                    var7 = null;
                    wd.a((byte) -81, (java.awt.Canvas) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_c = param1;
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("wd.CA(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
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
              hl.a((byte) -67, (java.awt.Component) (Object) param1);
              gda.a(-99, (java.awt.Component) (Object) param1);
              if (param0 == 70) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            L2: {
              if (sd.field_c != null) {
                sd.field_c.a((java.awt.Component) (Object) param1, true);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("wd.FA(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[128];
        field_t = new eaa();
    }
}
