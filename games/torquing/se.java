/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se extends pc {
    private v field_r;
    private v[] field_q;

    final static byte[] a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -33) {
              stackOut_3_0 = fm.field_F.a(-115, param1, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("se.C(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public se() {
        ((se) this).field_q = new v[6];
        ((se) this).field_r = new v();
        v dupTemp$0 = new v();
        ((se) this).field_q[0] = dupTemp$0;
        v var1 = dupTemp$0;
        var1.b((byte) -99);
    }

    final void a(int param0, t[] param1) {
        v[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        v var5 = null;
        int var6 = 0;
        v[] var7 = null;
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
        var6 = Torquing.field_u;
        try {
          L0: {
            var7 = ((se) this).field_q;
            var3 = var7;
            var4 = param0;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_g = param1;
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
            stackOut_8_1 = new StringBuilder().append("se.P(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    final void a(t[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param1;
            if (null == ((se) this).field_q[var4_int]) {
                ((se) this).field_q[var4_int] = new v();
            }
            if (param2 < 82) {
                Object var5 = null;
                ((se) this).a(27, 50, 123, true, (gm) null);
            }
            ((se) this).field_q[param1].field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "se.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        RuntimeException var6 = null;
        v var7 = null;
        v var9 = null;
        Object var10 = null;
        lg var11 = null;
        v var12 = null;
        v var13 = null;
        v var14 = null;
        v var15 = null;
        gm stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        gm stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof lg)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (gm) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (gm) param4;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (lg) (Object) stackIn_3_0;
              ld.a(param4.field_p + (param4.field_w + param2), param4.field_w + param2, param1 - (-param4.field_k + -param4.field_o), param4.field_k + param1, (byte) -108);
              if (param0 >= 89) {
                break L2;
              } else {
                var10 = null;
                ((se) this).a((byte) 52, (t) null);
                break L2;
              }
            }
            L3: {
              if (var11 != null) {
                param3 = param3 & var11.field_x;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = ((se) this).field_q[0];
              ((se) this).field_r.b((byte) -88);
              var7.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
              if (var11 == null) {
                break L4;
              } else {
                L5: {
                  if (!var11.field_A) {
                    break L5;
                  } else {
                    var12 = ((se) this).field_q[1];
                    if (var12 != null) {
                      var12.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var11.field_s) {
                  L6: {
                    var13 = ((se) this).field_q[3];
                    if (0 == var11.field_l) {
                      break L6;
                    } else {
                      if (var13 == null) {
                        break L6;
                      } else {
                        var13.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                        break L4;
                      }
                    }
                  }
                  var9 = ((se) this).field_q[2];
                  if (var9 != null) {
                    var9.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              if (!param4.g(2)) {
                break L7;
              } else {
                var14 = ((se) this).field_q[5];
                if (var14 == null) {
                  break L7;
                } else {
                  var14.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                  break L7;
                }
              }
            }
            L8: {
              if (!param3) {
                var15 = ((se) this).field_q[4];
                if (var15 == null) {
                  break L8;
                } else {
                  var15.a(param1, (byte) 115, param4, ((se) this).field_r, param2, (se) this);
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((se) this).field_r.a(param1, (se) this, param4, param2, (byte) 113);
            r.a(122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("se.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final void a(byte param0, t param1) {
        v[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        v var5 = null;
        int var6 = 0;
        Object var7 = null;
        v[] var8 = null;
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
        var6 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var8 = ((se) this).field_q;
              var3 = var8;
              if (param0 == -57) {
                break L1;
              } else {
                var7 = null;
                byte[] discarded$2 = se.a((byte) -119, (String) null);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var8.length) {
                break L0;
              } else {
                L3: {
                  var5 = var8[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_f = param1;
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
            stackOut_9_1 = new StringBuilder().append("se.Q(").append(param0).append(44);
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
          throw rb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    se(se param0, boolean param1) {
        this();
        try {
            param0.a((se) this, 6, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "se.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(se param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        v var5 = null;
        v var6 = null;
        int var7 = 0;
        v stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        v stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        v stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        v stackIn_11_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        v stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        v stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        v stackOut_10_2 = null;
        v stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        v stackOut_9_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              super.a(90, (pc) (Object) param0);
              if (param1 == 6) {
                break L1;
              } else {
                v discarded$15 = ((se) this).a(57, -12);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                dk.a((Object[]) (Object) ((se) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
                break L2;
              } else {
                var4_int = 0;
                L3: while (true) {
                  if (6 <= var4_int) {
                    break L2;
                  } else {
                    L4: {
                      var5 = ((se) this).field_q[var4_int];
                      if (var5 != null) {
                        L5: {
                          var6 = param0.field_q[var4_int];
                          stackOut_8_0 = (v) var5;
                          stackOut_8_1 = -85;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var6 == null) {
                            v dupTemp$16 = new v();
                            param0.field_q[var4_int] = dupTemp$16;
                            stackOut_10_0 = (v) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (v) dupTemp$16;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L5;
                          } else {
                            stackOut_9_0 = (v) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (v) var6;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L5;
                          }
                        }
                        ((v) (Object) stackIn_11_0).a((byte) stackIn_11_1, stackIn_11_2);
                        break L4;
                      } else {
                        param0.field_q[var4_int] = null;
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("se.D(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final v a(int param0, int param1) {
        if (param1 != 4) {
            Object var4 = null;
            this.a((se) null, 7, true);
        }
        v dupTemp$0 = new v();
        ((se) this).field_q[param0] = dupTemp$0;
        return dupTemp$0;
    }

    static {
    }
}
